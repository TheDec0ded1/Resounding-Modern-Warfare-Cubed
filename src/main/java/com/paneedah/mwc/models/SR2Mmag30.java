package com.paneedah.mwc.models;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SR2Mmag30 extends ModelBase {
	private final ModelRenderer mag_30;
	private final ModelRenderer cube_r54;
	private final ModelRenderer cube_r61;
	private final ModelRenderer cube_r62;
	private final ModelRenderer cube_r63;
	private final ModelRenderer cube_r64;
	private final ModelRenderer cube_r65;
	private final ModelRenderer cube_r66;
	private final ModelRenderer cube_r67;

	public SR2Mmag30() {
		textureWidth = 256;
		textureHeight = 256;

		mag_30 = new ModelRenderer(this);
		mag_30.setRotationPoint(0.2F, 7.8F, -3.2F);
		mag_30.cubeList.add(new ModelBox(mag_30, 113, 182, -1.0F, 5.0F, 0.3F, 1, 1, 4, 0.0F, false));
		mag_30.cubeList.add(new ModelBox(mag_30, 115, 182, -2.45F, 5.001F, 0.85F, 2, 1, 4, 0.0F, false));
		mag_30.cubeList.add(new ModelBox(mag_30, 117, 186, -2.65F, 5.002F, -0.4F, 2, 1, 2, 0.0F, false));
		mag_30.cubeList.add(new ModelBox(mag_30, 1, 176, -2.7F, -13.799F, 1.55F, 2, 13, 3, 0.0F, false));
		mag_30.cubeList.add(new ModelBox(mag_30, 118, 179, -2.2F, -13.999F, 3.75F, 1, 13, 1, 0.0F, false));
		mag_30.cubeList.add(new ModelBox(mag_30, 119, 186, -1.5F, -14.599F, 1.75F, 1, 1, 3, -0.2F, false));
		mag_30.cubeList.add(new ModelBox(mag_30, 117, 182, -2.9F, -14.599F, 1.75F, 1, 1, 3, -0.2F, false));
		mag_30.cubeList.add(new ModelBox(mag_30, 3, 177, -2.7F, -13.799F, -0.05F, 2, 13, 1, 0.0F, false));
		mag_30.cubeList.add(new ModelBox(mag_30, 116, 184, -2.7F, -13.799F, 0.75F, 2, 1, 1, -0.001F, false));
		mag_30.cubeList.add(new ModelBox(mag_30, 51, 20, -1.8F, -12.799F, 0.75F, 1, 12, 1, -0.001F, false));
		mag_30.cubeList.add(new ModelBox(mag_30, 2, 180, -2.6F, -12.799F, 0.75F, 1, 12, 1, -0.001F, false));
		mag_30.cubeList.add(new ModelBox(mag_30, 1, 176, -2.7F, -0.799F, 1.55F, 2, 6, 3, 0.0F, false));
		mag_30.cubeList.add(new ModelBox(mag_30, 51, 20, -1.8F, -0.799F, 0.75F, 1, 6, 1, -0.001F, false));
		mag_30.cubeList.add(new ModelBox(mag_30, 2, 180, -2.6F, -0.799F, 0.75F, 1, 6, 1, -0.001F, false));
		mag_30.cubeList.add(new ModelBox(mag_30, 3, 177, -2.7F, -0.799F, -0.05F, 2, 6, 1, 0.0F, false));
		mag_30.cubeList.add(new ModelBox(mag_30, 115, 186, -2.95F, 5.003F, 0.85F, 1, 1, 4, 0.001F, false));
		mag_30.cubeList.add(new ModelBox(mag_30, 65, 20, -2.75F, 5.002F, -0.4F, 1, 1, 2, 0.001F, false));
		mag_30.cubeList.add(new ModelBox(mag_30, 116, 183, -3.4F, 5.0F, 0.3F, 1, 1, 4, 0.0F, false));

		cube_r54 = new ModelRenderer(this);
		cube_r54.setRotationPoint(-7.3F, -7.199F, 4.55F);
		mag_30.addChild(cube_r54);
		setRotationAngle(cube_r54, 0.0F, 0.0F, 0.9599F);
		cube_r54.cubeList.add(new ModelBox(cube_r54, 118, 182, -3.4765F, -8.6944F, -2.8F, 1, 1, 3, -0.201F, false));

		cube_r61 = new ModelRenderer(this);
		cube_r61.setRotationPoint(3.9F, -7.199F, 4.55F);
		mag_30.addChild(cube_r61);
		setRotationAngle(cube_r61, 0.0F, 0.0F, -0.9599F);
		cube_r61.cubeList.add(new ModelBox(cube_r61, 115, 185, 2.4765F, -8.6944F, -2.8F, 1, 1, 3, -0.201F, false));

		cube_r62 = new ModelRenderer(this);
		cube_r62.setRotationPoint(-1.2F, -4.999F, 4.75F);
		mag_30.addChild(cube_r62);
		setRotationAngle(cube_r62, -0.0524F, 0.0F, 0.0F);
		

		cube_r63 = new ModelRenderer(this);
		cube_r63.setRotationPoint(-0.7F, -4.799F, 4.55F);
		mag_30.addChild(cube_r63);
		setRotationAngle(cube_r63, -0.0524F, 0.0F, 0.0F);
		

		cube_r64 = new ModelRenderer(this);
		cube_r64.setRotationPoint(-0.75F, 0.0F, 0.3F);
		mag_30.addChild(cube_r64);
		setRotationAngle(cube_r64, -0.1745F, 0.0F, 0.0F);
		

		cube_r65 = new ModelRenderer(this);
		cube_r65.setRotationPoint(-1.2F, 0.0F, 4.0F);
		mag_30.addChild(cube_r65);
		setRotationAngle(cube_r65, -0.1745F, 0.0F, 0.0F);
		

		cube_r66 = new ModelRenderer(this);
		cube_r66.setRotationPoint(-0.2F, 0.25F, 4.65F);
		mag_30.addChild(cube_r66);
		setRotationAngle(cube_r66, -0.1745F, 0.0F, 0.0F);
		

		cube_r67 = new ModelRenderer(this);
		cube_r67.setRotationPoint(-0.7F, 0.0F, 4.55F);
		mag_30.addChild(cube_r67);
		setRotationAngle(cube_r67, -0.1745F, 0.0F, 0.0F);
		
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		mag_30.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}