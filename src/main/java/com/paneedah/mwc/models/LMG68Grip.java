package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class LMG68Grip extends ModelBase {
	private final ModelRenderer sig_grip;
	private final ModelRenderer grip3_r1;
	private final ModelRenderer grip3_r3_r1;
	private final ModelRenderer grip3_r1_r1;
	private final ModelRenderer grip8_r1;
	private final ModelRenderer grip8_r2;
	private final ModelRenderer grip9_r1;
	private final ModelRenderer grip12_r1;
	private final ModelRenderer grip10_r1;
	private final ModelRenderer grip10_r2;
	private final ModelRenderer grip8_r3;
	private final ModelRenderer grip7_r1;
	private final ModelRenderer grip12_r3;

	public LMG68Grip() {
		textureWidth = 416;
		textureHeight = 416;

		sig_grip = new ModelRenderer(this);
		sig_grip.setRotationPoint(0.0F, 23.7F, 0.0F);
		sig_grip.cubeList.add(new ModelBox(sig_grip, 280, 383, -3.0F, -30.7F, -1.4F, 3, 5, 1, 0.0F, false));
		sig_grip.cubeList.add(new ModelBox(sig_grip, 330, 160, -3.499F, -30.7F, -6.0F, 4, 5, 5, 0.0F, false));

		grip3_r1 = new ModelRenderer(this);
		grip3_r1.setRotationPoint(-3.5F, -25.7F, -5.25F);
		sig_grip.addChild(grip3_r1);
		setRotationAngle(grip3_r1, 0.3194F, 0.0F, 0.0F);
		

		grip3_r3_r1 = new ModelRenderer(this);
		grip3_r3_r1.setRotationPoint(2.002F, 5.2795F, 2.391F);
		grip3_r1.addChild(grip3_r3_r1);
		setRotationAngle(grip3_r3_r1, -0.1309F, 0.0F, 0.0F);
		grip3_r3_r1.cubeList.add(new ModelBox(grip3_r3_r1, 224, 78, -2.0F, -0.6901F, 2.2605F, 4, 5, 1, 0.0F, false));
		grip3_r3_r1.cubeList.add(new ModelBox(grip3_r3_r1, 74, 327, -2.0F, -4.1901F, 1.2605F, 4, 9, 1, 0.0F, false));
		grip3_r3_r1.cubeList.add(new ModelBox(grip3_r3_r1, 260, 305, -2.0F, -4.9401F, -2.7395F, 4, 10, 4, 0.0F, false));

		grip3_r1_r1 = new ModelRenderer(this);
		grip3_r1_r1.setRotationPoint(2.001F, 0.0063F, -0.0476F);
		grip3_r1.addChild(grip3_r1_r1);
		setRotationAngle(grip3_r1_r1, 0.4363F, 0.0F, 0.0F);
		grip3_r1_r1.cubeList.add(new ModelBox(grip3_r1_r1, 130, 232, -2.0F, -0.1571F, -0.1361F, 4, 1, 1, 0.0F, false));

		grip8_r1 = new ModelRenderer(this);
		grip8_r1.setRotationPoint(-2.1F, -29.7F, 0.0F);
		sig_grip.addChild(grip8_r1);
		setRotationAngle(grip8_r1, -0.7243F, 0.0F, 0.0F);
		grip8_r1.cubeList.add(new ModelBox(grip8_r1, 200, 335, -1.4F, -3.0F, -2.0F, 4, 5, 2, 0.0F, false));

		grip8_r2 = new ModelRenderer(this);
		grip8_r2.setRotationPoint(-3.5F, -26.25F, -1.0F);
		sig_grip.addChild(grip8_r2);
		setRotationAngle(grip8_r2, -1.0345F, 0.0F, 0.0F);
		grip8_r2.cubeList.add(new ModelBox(grip8_r2, 288, 100, -0.001F, -0.8581F, -1.7357F, 4, 1, 5, 0.0F, false));

		grip9_r1 = new ModelRenderer(this);
		grip9_r1.setRotationPoint(-3.5F, -23.9F, 1.4F);
		sig_grip.addChild(grip9_r1);
		setRotationAngle(grip9_r1, -1.2789F, 0.0F, 0.0F);
		grip9_r1.cubeList.add(new ModelBox(grip9_r1, 310, 375, 0.001F, 0.0F, 0.0F, 4, 1, 4, 0.0F, false));

		grip12_r1 = new ModelRenderer(this);
		grip12_r1.setRotationPoint(-3.5F, -15.75F, 0.15F);
		sig_grip.addChild(grip12_r1);
		setRotationAngle(grip12_r1, 0.2269F, 0.0F, 0.0F);
		grip12_r1.cubeList.add(new ModelBox(grip12_r1, 376, 185, -0.001F, -2.0F, 0.25F, 4, 2, 3, 0.0F, false));
		grip12_r1.cubeList.add(new ModelBox(grip12_r1, 104, 376, -0.001F, -1.0F, -3.5F, 4, 1, 4, 0.0F, false));

		grip10_r1 = new ModelRenderer(this);
		grip10_r1.setRotationPoint(-3.5F, -20.1F, 2.55F);
		sig_grip.addChild(grip10_r1);
		setRotationAngle(grip10_r1, -1.3662F, 0.0F, 0.0F);
		grip10_r1.cubeList.add(new ModelBox(grip10_r1, 260, 255, 0.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

		grip10_r2 = new ModelRenderer(this);
		grip10_r2.setRotationPoint(-3.0F, -20.3F, 3.05F);
		sig_grip.addChild(grip10_r2);
		setRotationAngle(grip10_r2, -1.3662F, 0.0F, 0.0F);
		grip10_r2.cubeList.add(new ModelBox(grip10_r2, 348, 190, 0.0F, 0.0F, 2.75F, 3, 1, 1, 0.0F, false));
		grip10_r2.cubeList.add(new ModelBox(grip10_r2, 306, 21, -0.001F, -0.001F, 0.0F, 3, 1, 3, 0.0F, false));

		grip8_r3 = new ModelRenderer(this);
		grip8_r3.setRotationPoint(-3.0F, -24.1F, 1.9F);
		sig_grip.addChild(grip8_r3);
		setRotationAngle(grip8_r3, -1.2789F, 0.0F, 0.0F);
		grip8_r3.cubeList.add(new ModelBox(grip8_r3, 376, 232, 0.0F, 0.0F, 0.0F, 3, 1, 4, 0.0F, false));

		grip7_r1 = new ModelRenderer(this);
		grip7_r1.setRotationPoint(-3.0F, -27.25F, -1.0F);
		sig_grip.addChild(grip7_r1);
		setRotationAngle(grip7_r1, -1.0345F, 0.0F, 0.0F);
		grip7_r1.cubeList.add(new ModelBox(grip7_r1, 332, 121, -0.001F, -0.8581F, -0.7357F, 3, 1, 5, 0.0F, false));

		grip12_r3 = new ModelRenderer(this);
		grip12_r3.setRotationPoint(-3.6F, -26.3F, -5.7F);
		sig_grip.addChild(grip12_r3);
		setRotationAngle(grip12_r3, 0.302F, 0.0F, 0.0F);
		grip12_r3.cubeList.add(new ModelBox(grip12_r3, 248, 326, 0.0F, 1.5699F, 0.9066F, 1, 9, 4, 0.0F, false));
		grip12_r3.cubeList.add(new ModelBox(grip12_r3, 22, 348, 3.2F, 1.5699F, 0.9066F, 1, 9, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		sig_grip.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}