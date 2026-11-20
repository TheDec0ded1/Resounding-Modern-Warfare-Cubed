package com.paneedah.mwc.models;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M93RMag extends ModelBase {
	private final ModelRenderer mag;
	private final ModelRenderer gun256;
	private final ModelRenderer gun257;
	private final ModelRenderer gun325;
	private final ModelRenderer gun364;
	private final ModelRenderer gun365;
	private final ModelRenderer gun366;
	private final ModelRenderer gun368;
	private final ModelRenderer gun369;
	private final ModelRenderer gun372;
	private final ModelRenderer gun373;
	private final ModelRenderer gun376;
	private final ModelRenderer gun377;
	private final ModelRenderer gun378;
	private final ModelRenderer gun404;
	private final ModelRenderer gun1;

	public M93RMag() {
		textureWidth = 150;
		textureHeight = 150;

		mag = new ModelRenderer(this);
		mag.setRotationPoint(0.0F, 28.1F, 1.2F);
		

		gun256 = new ModelRenderer(this);
		gun256.setRotationPoint(-0.9F, -30.0F, -6.5F);
		mag.addChild(gun256);
		setRotationAngle(gun256, 0.2231F, 0.0F, 0.0F);
		gun256.cubeList.add(new ModelBox(gun256, 24, 80, 0.0F, 0.0F, 0.0F, 1, 13, 2, 0.0F, false));
		gun256.cubeList.add(new ModelBox(gun256, 24, 80, 0.0F, -5.002F, 0.0F, 1, 5, 2, 0.0F, false));

		gun257 = new ModelRenderer(this);
		gun257.setRotationPoint(-3.1F, -30.0F, -6.5F);
		mag.addChild(gun257);
		setRotationAngle(gun257, 0.2231F, 0.0F, 0.0F);
		gun257.cubeList.add(new ModelBox(gun257, 16, 79, 0.0F, 0.0F, 0.0F, 1, 13, 2, 0.0F, false));
		gun257.cubeList.add(new ModelBox(gun257, 16, 79, 0.0F, -5.002F, 0.0F, 1, 5, 2, 0.0F, false));

		gun325 = new ModelRenderer(this);
		gun325.setRotationPoint(-3.3F, -26.0F, -5.5F);
		mag.addChild(gun325);
		setRotationAngle(gun325, 0.2231F, 0.0F, 0.0F);
		gun325.cubeList.add(new ModelBox(gun325, 36, 80, 0.0F, 0.0975F, -0.0221F, 1, 9, 2, -0.001F, false));

		gun364 = new ModelRenderer(this);
		gun364.setRotationPoint(-0.7F, -26.0F, -5.5F);
		mag.addChild(gun364);
		setRotationAngle(gun364, 0.2231F, 0.0F, 0.0F);
		gun364.cubeList.add(new ModelBox(gun364, 52, 53, 0.0F, 0.0975F, -0.0221F, 1, 9, 2, -0.001F, false));

		gun365 = new ModelRenderer(this);
		gun365.setRotationPoint(-0.7F, -30.5F, -5.1F);
		mag.addChild(gun365);
		setRotationAngle(gun365, 0.2231F, 0.0F, 0.0F);
		gun365.cubeList.add(new ModelBox(gun365, 72, 70, 0.0F, 0.0F, 0.0F, 1, 14, 3, 0.0F, false));
		gun365.cubeList.add(new ModelBox(gun365, 72, 70, 0.0F, -5.0F, 0.0F, 1, 5, 3, 0.0F, false));

		gun366 = new ModelRenderer(this);
		gun366.setRotationPoint(-3.3F, -30.5F, -5.1F);
		mag.addChild(gun366);
		setRotationAngle(gun366, 0.2231F, 0.0F, 0.0F);
		gun366.cubeList.add(new ModelBox(gun366, 55, 0, 0.0F, 0.0F, 0.0F, 3, 14, 3, 0.001F, false));
		gun366.cubeList.add(new ModelBox(gun366, 55, 0, 0.0F, -5.0F, 0.0F, 3, 5, 3, 0.001F, false));

		gun368 = new ModelRenderer(this);
		gun368.setRotationPoint(-3.3F, -31.6F, -5.2F);
		mag.addChild(gun368);
		gun368.cubeList.add(new ModelBox(gun368, 38, 66, 0.0F, -5.1F, -1.1F, 1, 2, 3, -0.001F, false));

		gun369 = new ModelRenderer(this);
		gun369.setRotationPoint(-0.7F, -31.6F, -5.2F);
		mag.addChild(gun369);
		gun369.cubeList.add(new ModelBox(gun369, 0, 66, 0.0F, -5.1F, -1.1F, 1, 2, 3, -0.001F, false));

		gun372 = new ModelRenderer(this);
		gun372.setRotationPoint(-3.0F, -31.5F, -7.0F);
		mag.addChild(gun372);
		gun372.cubeList.add(new ModelBox(gun372, 15, 21, 0.0F, -5.1F, -1.1F, 3, 1, 4, 0.0F, false));

		gun373 = new ModelRenderer(this);
		gun373.setRotationPoint(-3.0F, -30.5F, -7.0F);
		mag.addChild(gun373);
		setRotationAngle(gun373, 0.2974F, 0.0F, 0.0F);
		gun373.cubeList.add(new ModelBox(gun373, 62, 28, 0.0F, -5.1985F, 0.4428F, 3, 1, 2, -0.001F, false));

		gun376 = new ModelRenderer(this);
		gun376.setRotationPoint(-0.7F, -18.5F, -2.5F);
		mag.addChild(gun376);
		

		gun377 = new ModelRenderer(this);
		gun377.setRotationPoint(-0.7F, -30.0F, -7.0F);
		mag.addChild(gun377);
		setRotationAngle(gun377, 0.2231F, 0.0F, 0.0F);
		gun377.cubeList.add(new ModelBox(gun377, 67, 0, 0.0F, 0.0F, 0.0F, 1, 13, 1, 0.001F, false));
		gun377.cubeList.add(new ModelBox(gun377, 67, 0, 0.0F, -5.002F, 0.0F, 1, 5, 1, 0.001F, false));

		gun378 = new ModelRenderer(this);
		gun378.setRotationPoint(-3.3F, -18.5F, -2.5F);
		mag.addChild(gun378);
		

		gun404 = new ModelRenderer(this);
		gun404.setRotationPoint(-3.3F, -30.0F, -7.0F);
		mag.addChild(gun404);
		setRotationAngle(gun404, 0.2231F, 0.0F, 0.0F);
		gun404.cubeList.add(new ModelBox(gun404, 8, 79, 0.0F, 0.0F, 0.0F, 3, 13, 1, 0.0F, false));
		gun404.cubeList.add(new ModelBox(gun404, 8, 79, 0.0F, -5.002F, 0.0F, 3, 5, 1, 0.0F, false));

		gun1 = new ModelRenderer(this);
		gun1.setRotationPoint(-3.5F, -18.5F, -5.2F);
		mag.addChild(gun1);
		gun1.cubeList.add(new ModelBox(gun1, 24, 66, 0.0F, 0.8F, 0.1F, 4, 1, 6, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		mag.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}