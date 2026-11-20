package com.paneedah.mwc.models;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QSZ92Mag extends ModelBase {
	private final ModelRenderer mag;
	private final ModelRenderer gun287;
	private final ModelRenderer gun288;
	private final ModelRenderer gun325;
	private final ModelRenderer gun364;
	private final ModelRenderer gun365;
	private final ModelRenderer gun366;
	private final ModelRenderer gun368;
	private final ModelRenderer gun369_r1;
	private final ModelRenderer gun369;
	private final ModelRenderer gun370_r1;
	private final ModelRenderer gun372;
	private final ModelRenderer gun373;
	private final ModelRenderer gun376;
	private final ModelRenderer gun377;
	private final ModelRenderer gun378;
	private final ModelRenderer gun404;
	private final ModelRenderer gun1;

	public QSZ92Mag() {
		textureWidth = 400;
		textureHeight = 400;

		mag = new ModelRenderer(this);
		mag.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		gun287 = new ModelRenderer(this);
		gun287.setRotationPoint(-0.9F, -30.0F, -6.5F);
		mag.addChild(gun287);
		setRotationAngle(gun287, 0.2231F, 0.0F, 0.0F);
		gun287.cubeList.add(new ModelBox(gun287, 108, 163, 0.0F, 0.0F, 0.0F, 1, 13, 4, 0.0F, false));
		gun287.cubeList.add(new ModelBox(gun287, 179, 373, 0.0F, 12.4876F, -0.1106F, 1, 1, 4, 0.0F, false));

		gun288 = new ModelRenderer(this);
		gun288.setRotationPoint(-3.1F, -30.0F, -6.5F);
		mag.addChild(gun288);
		setRotationAngle(gun288, 0.2231F, 0.0F, 0.0F);
		gun288.cubeList.add(new ModelBox(gun288, 82, 265, 0.0F, 0.0F, 0.0F, 1, 13, 4, 0.0F, false));
		gun288.cubeList.add(new ModelBox(gun288, 281, 373, 0.0F, 12.4876F, -0.1106F, 1, 1, 4, 0.0F, false));

		gun325 = new ModelRenderer(this);
		gun325.setRotationPoint(-3.3F, -26.0F, -5.5F);
		mag.addChild(gun325);
		setRotationAngle(gun325, 0.2231F, 0.0F, 0.0F);
		gun325.cubeList.add(new ModelBox(gun325, 208, 304, 0.0F, 0.0975F, -0.0221F, 1, 9, 1, -0.001F, false));

		gun364 = new ModelRenderer(this);
		gun364.setRotationPoint(-0.7F, -26.0F, -5.5F);
		mag.addChild(gun364);
		setRotationAngle(gun364, 0.2231F, 0.0F, 0.0F);
		gun364.cubeList.add(new ModelBox(gun364, 31, 306, 0.0F, 0.0975F, -0.0221F, 1, 9, 1, -0.001F, false));

		gun365 = new ModelRenderer(this);
		gun365.setRotationPoint(-0.7F, -30.5F, -5.1F);
		mag.addChild(gun365);
		setRotationAngle(gun365, 0.2231F, 0.0F, 0.0F);
		gun365.cubeList.add(new ModelBox(gun365, 119, 163, 0.0F, 0.0F, 2.0F, 1, 14, 1, 0.0F, false));
		gun365.cubeList.add(new ModelBox(gun365, 102, 217, 0.0F, 0.0F, -0.6F, 1, 14, 1, 0.0F, false));
		gun365.cubeList.add(new ModelBox(gun365, 94, 242, -2.6F, 0.0F, -0.6F, 1, 14, 1, 0.0F, false));
		gun365.cubeList.add(new ModelBox(gun365, 333, 365, 0.0F, 11.0F, 0.1F, 1, 3, 2, 0.0F, false));
		gun365.cubeList.add(new ModelBox(gun365, 17, 350, -2.6F, 11.0F, 0.1F, 1, 3, 2, 0.0F, false));

		gun366 = new ModelRenderer(this);
		gun366.setRotationPoint(-3.3F, -30.5F, -5.1F);
		mag.addChild(gun366);
		setRotationAngle(gun366, 0.2231F, 0.0F, 0.0F);
		gun366.cubeList.add(new ModelBox(gun366, 147, 240, 0.0F, 0.0F, 2.0F, 3, 14, 1, 0.001F, false));

		gun368 = new ModelRenderer(this);
		gun368.setRotationPoint(-3.3F, -31.6F, -5.2F);
		mag.addChild(gun368);
		gun368.cubeList.add(new ModelBox(gun368, 33, 376, 0.0F, 0.0F, 0.0F, 1, 2, 3, -0.001F, false));

		gun369_r1 = new ModelRenderer(this);
		gun369_r1.setRotationPoint(0.7067F, 0.001F, 1.5F);
		gun368.addChild(gun369_r1);
		setRotationAngle(gun369_r1, 0.0F, 0.0F, 0.7854F);
		gun369_r1.cubeList.add(new ModelBox(gun369_r1, 136, 379, -0.5F, -0.5F, -1.5F, 1, 1, 3, -0.001F, false));

		gun369 = new ModelRenderer(this);
		gun369.setRotationPoint(-0.7F, -31.6F, -5.2F);
		mag.addChild(gun369);
		gun369.cubeList.add(new ModelBox(gun369, 42, 376, 0.0F, 0.0F, 0.0F, 1, 2, 3, -0.001F, false));

		gun370_r1 = new ModelRenderer(this);
		gun370_r1.setRotationPoint(0.2933F, 0.001F, 1.5F);
		gun369.addChild(gun370_r1);
		setRotationAngle(gun370_r1, 0.0F, 0.0F, -0.7854F);
		gun370_r1.cubeList.add(new ModelBox(gun370_r1, 127, 379, -0.5F, -0.5F, -1.5F, 1, 1, 3, -0.001F, false));

		gun372 = new ModelRenderer(this);
		gun372.setRotationPoint(-3.0F, -31.5F, -7.0F);
		mag.addChild(gun372);
		gun372.cubeList.add(new ModelBox(gun372, 368, 19, 0.0F, 0.0F, 0.0F, 3, 1, 4, 0.0F, false));

		gun373 = new ModelRenderer(this);
		gun373.setRotationPoint(-3.0F, -30.5F, -7.0F);
		mag.addChild(gun373);
		setRotationAngle(gun373, 0.2974F, 0.0F, 0.0F);
		gun373.cubeList.add(new ModelBox(gun373, 195, 343, 0.0F, 0.0F, 0.0F, 3, 1, 2, -0.001F, false));

		gun376 = new ModelRenderer(this);
		gun376.setRotationPoint(-0.7F, -18.5F, -2.5F);
		mag.addChild(gun376);
		

		gun377 = new ModelRenderer(this);
		gun377.setRotationPoint(-0.7F, -30.0F, -7.0F);
		mag.addChild(gun377);
		setRotationAngle(gun377, 0.2231F, 0.0F, 0.0F);
		gun377.cubeList.add(new ModelBox(gun377, 41, 243, 0.0F, 0.0F, 0.0F, 1, 13, 1, 0.001F, false));

		gun378 = new ModelRenderer(this);
		gun378.setRotationPoint(-3.3F, -18.5F, -2.5F);
		mag.addChild(gun378);
		

		gun404 = new ModelRenderer(this);
		gun404.setRotationPoint(-3.3F, -30.0F, -7.0F);
		mag.addChild(gun404);
		setRotationAngle(gun404, 0.2231F, 0.0F, 0.0F);
		gun404.cubeList.add(new ModelBox(gun404, 72, 286, 0.0F, 0.0F, 0.0F, 3, 13, 1, 0.0F, false));

		gun1 = new ModelRenderer(this);
		gun1.setRotationPoint(-3.5F, -18.5F, -5.2F);
		mag.addChild(gun1);
		gun1.cubeList.add(new ModelBox(gun1, 189, 123, 0.0F, 0.8F, 0.1F, 4, 1, 6, 0.0F, false));
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