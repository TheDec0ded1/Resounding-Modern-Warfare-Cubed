package com.paneedah.weaponlib.render.bgl.weather;

import com.paneedah.mwc.utils.MWCUtil;
import com.paneedah.weaponlib.animation.ClientValueRepo;
import com.paneedah.weaponlib.config.ModernConfigManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.client.IRenderHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;

import static com.paneedah.mwc.proxies.ClientProxy.MC;
import static com.paneedah.mwc.ProjectConstants.ID;

@SideOnly(Side.CLIENT)
public class ModernWeatherRenderer extends IRenderHandler {

    private static final int RAIN_SEARCH_AREA = 4;

    private final float[][] rainPositions = new float[(2 * RAIN_SEARCH_AREA) * (2 * RAIN_SEARCH_AREA)][5];

    private Vec3d previousPosition;

    // Textures
    public static final ResourceLocation RAIN_LIGHT = new ResourceLocation(ID, "textures/environment/lightrain.png");
    public static final ResourceLocation RAIN_MEDIUM = new ResourceLocation(ID, "textures/environment/mediumrain.png");
    public static final ResourceLocation RAIN_HEAVY = new ResourceLocation(ID, "textures/environment/heavyrain.png");
    public static final ResourceLocation RAIN_INSANE = new ResourceLocation(ID, "textures/environment/insanerain.png");


    /**
     * Check if it is raining or snowing
     * at a given block position
     *
     * @param pos The position to check
     *
     * @return True if raining, false if snowing
     */
    public static boolean isRainingOrSnowing(BlockPos pos) {
        float f2 = MC.world.getBiome(pos).getTemperature(pos);
        int j2 = MC.world.getPrecipitationHeight(pos).getY();
        return MC.world.getBiomeProvider().getTemperatureAtHeight(f2, j2) >= 0.15F;
    }

    /**
     * Checks to see if we should refill the rain
     * array with new positions. It's not incredibly expensive,
     * but it's best this calculation happens as infrequently
     * as possible.
     *
     * @param player the player we use to get the world instance
     *
     * @return false if not raining
     */
    public boolean shouldRecalculateRainVectors(EntityPlayer player) {

        // If it's not raining, don't recalculate the vectors
        if (player.world.getRainStrength(MC.getRenderPartialTicks()) == 0.0) {
            return false;
        }

        if (previousPosition == null) {
            previousPosition = player.getPositionVector();
            return true;
        }

        // Position flag
        boolean positionFlag = player.getPositionVector().x != previousPosition.x || player.getPositionVector().y != previousPosition.y || player.getPositionVector().z != previousPosition.z;
        if (positionFlag) {
            previousPosition = player.getPositionVector();
        }

        return positionFlag;
    }

    /**
     * Check all rain in search area [(2*S)^2 blocks, where S is search area]
     *
     * @param player the player
     * @param interpolatedPosition The interpolated position of the player
     */
    public void recalculateRainVectors(EntityPlayer player, Vec3d interpolatedPosition) {

        int count = 0;
        for (int x = -RAIN_SEARCH_AREA; x < RAIN_SEARCH_AREA; ++x) {
            for (int y = -RAIN_SEARCH_AREA; y < RAIN_SEARCH_AREA; ++y) {


                BlockPos rainPosition = new BlockPos(interpolatedPosition.x + x, player.getPositionVector().y, interpolatedPosition.z + y);
                boolean rainStatus = isRainingOrSnowing(rainPosition);

                // If it can't snow or rain, don't put it there
                Biome biome = MC.world.getBiome(rainPosition);
                if ((rainStatus && !biome.canRain()) || (!rainStatus && !biome.getEnableSnow())) {
                    rainPositions[count] = new float[]{0.0f, 0f, 0f, 0f, 0f};
                    return;
                }


                int worldPos = MC.world.getHeight(rainPosition.getX(), rainPosition.getZ());
                rainPositions[count] = new float[]{1.0f, (float) rainPosition.getX() + 1, (float) worldPos, rainPosition.getZ(), rainStatus ? 1 : 0};
                count++;


            }
        }
    }

    @Override
    public void render(float partialTicks, WorldClient world, Minecraft MC) {

        float rainStrength = MC.world.getRainStrength(MC.getRenderPartialTicks());
        if (rainStrength == 0.0) {
            return;
        }

        // Choose the rain texture based on rain strength
        ResourceLocation selectedRainTexture;
        if (rainStrength < 0.25) {
            selectedRainTexture = RAIN_LIGHT;
        } else if (rainStrength < 0.5) {
            selectedRainTexture = RAIN_MEDIUM;
        } else if (rainStrength < 0.95) {
            selectedRainTexture = RAIN_HEAVY;
        } else {
            selectedRainTexture = RAIN_INSANE;
        }

        // Rain renderer size
        double lateralSize = 1.0;
        double thinness = 5.0;
        double verticalSize = 64;
        float textureScale = 48;

        // Initialize the timer
        float timer = 0f;

        // Culling is not favorable for this
        GlStateManager.disableCull();

        Vec3d iP = MWCUtil.getInterpolatedPlayerPos();

        GlStateManager.pushMatrix();
        GlStateManager.translate(-iP.x, -iP.y, -iP.z);

        GlStateManager.enableBlend();

        // Fading effect based on rain strength
        float alpha = Math.min(rainStrength * 2.0f, 1.0f);

        Tessellator tessellator = Tessellator.getInstance();

        // Bind the selected rain texture
        MC.getTextureManager().bindTexture(selectedRainTexture);
        timer = -ClientValueRepo.TICKER.getLerpedFloat() / 3f;
        BufferBuilder tessellatorBuffer = tessellator.getBuffer();
        tessellatorBuffer.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX);
        for (float[] rainPosition : rainPositions) {
            if (rainPosition[0] == 0.0 || rainPosition[4] == 0) {
                continue;
            }

            //Fade out rain closer to the ground (Prevent seeing clipping of rain texture)
            float groundLevel = MC.world.getHeight((int) rainPosition[1], (int) rainPosition[3]);
            float groundFade = Math.max(0.33f, (rainPosition[2] - groundLevel) / 5.0f);

            if(ModernConfigManager.recolorRain){
                GlStateManager.color((float) ModernConfigManager.baseFogColorRed + 0.2f, (float) ModernConfigManager.baseFogColorGreen + 0.2f, (float) ModernConfigManager.baseFogColorBlue + 0.2f, alpha * groundFade);
            }
            else {
                GlStateManager.color(1, 1, 1, alpha * groundFade);
            }

            tessellatorBuffer.pos(rainPosition[1] - lateralSize, rainPosition[2] + verticalSize, rainPosition[3] + lateralSize).tex(0, 0 + timer).endVertex();
            tessellatorBuffer.pos(rainPosition[1], rainPosition[2] + verticalSize, rainPosition[3]).tex(1 * thinness, 0 + timer).endVertex();
            tessellatorBuffer.pos(rainPosition[1], rainPosition[2], rainPosition[3]).tex(1 * thinness, 1 * textureScale + timer).endVertex();
            tessellatorBuffer.pos(rainPosition[1] - lateralSize, rainPosition[2], rainPosition[3] + lateralSize).tex(0, 1 * textureScale + timer).endVertex();

            tessellatorBuffer.pos(rainPosition[1], rainPosition[2] + verticalSize, rainPosition[3] + lateralSize).tex(0, 0 + timer).endVertex();
            tessellatorBuffer.pos(rainPosition[1] - lateralSize, rainPosition[2] + verticalSize, rainPosition[3]).tex(1 * thinness, 0 + timer).endVertex();
            tessellatorBuffer.pos(rainPosition[1] - lateralSize, rainPosition[2], rainPosition[3]).tex(1 * thinness, 1 * textureScale + timer).endVertex();
            tessellatorBuffer.pos(rainPosition[1], rainPosition[2], rainPosition[3] + lateralSize).tex(0, 1 * textureScale + timer).endVertex();
        }
        tessellator.draw();

        GlStateManager.popMatrix();
        GlStateManager.enableCull();
    }

}
