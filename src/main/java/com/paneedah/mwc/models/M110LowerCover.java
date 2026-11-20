package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M110LowerCover extends ModelBase {
	private final ModelRenderer coverM110Lower;
	private final ModelRenderer handguard120_r2;
	private final ModelRenderer handguard121_r1;
	private final ModelRenderer handguard120_r3;
	private final ModelRenderer handguard119_r4;
	private final ModelRenderer handguard114_r2;
	private final ModelRenderer handguard115_r1;
	private final ModelRenderer handguard110_r3;
	private final ModelRenderer handguard111_r1;
	private final ModelRenderer handguard111_r2;
	private final ModelRenderer handguard110_r4;
	private final ModelRenderer handguard109_r6;
	private final ModelRenderer handguard110_r5;

	public M110LowerCover() {
		textureWidth = 544;
		textureHeight = 544;

		coverM110Lower = new ModelRenderer(this);
		coverM110Lower.setRotationPoint(-2.001F, -9.8F, -29.199F);
		setRotationAngle(coverM110Lower, 0.0F, 0.0F, -1.5708F);
		coverM110Lower.cubeList.add(new ModelBox(coverM110Lower, 480, 84, 0.1F, 0.0F, -20.901F, 1, 1, 20, 0.0F, false));
		coverM110Lower.cubeList.add(new ModelBox(coverM110Lower, 400, 525, -0.1F, 0.0F, -2.901F, 1, 1, 1, 0.0F, false));
		coverM110Lower.cubeList.add(new ModelBox(coverM110Lower, 404, 525, 0.0F, 0.0F, -8.901F, 1, 1, 1, 0.0F, false));
		coverM110Lower.cubeList.add(new ModelBox(coverM110Lower, 408, 525, 0.0F, 0.0F, -6.901F, 1, 1, 1, 0.0F, false));
		coverM110Lower.cubeList.add(new ModelBox(coverM110Lower, 412, 525, 0.0F, 0.0F, -4.901F, 1, 1, 1, 0.0F, false));
		coverM110Lower.cubeList.add(new ModelBox(coverM110Lower, 430, 525, 0.0F, 0.0F, -10.901F, 1, 1, 1, 0.0F, false));
		coverM110Lower.cubeList.add(new ModelBox(coverM110Lower, 476, 525, 0.0F, 0.0F, -12.901F, 1, 1, 1, 0.0F, false));
		coverM110Lower.cubeList.add(new ModelBox(coverM110Lower, 480, 525, 0.0F, 0.0F, -14.901F, 1, 1, 1, 0.0F, false));
		coverM110Lower.cubeList.add(new ModelBox(coverM110Lower, 484, 525, 0.0F, 0.0F, -16.801F, 1, 1, 1, 0.0F, false));
		coverM110Lower.cubeList.add(new ModelBox(coverM110Lower, 526, 32, 0.0F, 0.0F, -18.801F, 1, 1, 1, 0.0F, false));
		coverM110Lower.cubeList.add(new ModelBox(coverM110Lower, 526, 50, 0.0F, 0.0F, -20.801F, 1, 1, 1, 0.0F, false));

		handguard120_r2 = new ModelRenderer(this);
		handguard120_r2.setRotationPoint(0.3F, 1.95F, -4.9F);
		coverM110Lower.addChild(handguard120_r2);
		setRotationAngle(handguard120_r2, 0.0F, 0.0F, -0.8203F);
		handguard120_r2.cubeList.add(new ModelBox(handguard120_r2, 488, 525, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		handguard120_r2.cubeList.add(new ModelBox(handguard120_r2, 492, 525, 0.0F, 0.0F, -4.0F, 1, 1, 1, 0.0F, false));
		handguard120_r2.cubeList.add(new ModelBox(handguard120_r2, 496, 525, 0.0F, 0.0F, -8.0F, 1, 1, 1, 0.0F, false));
		handguard120_r2.cubeList.add(new ModelBox(handguard120_r2, 500, 525, 0.0F, 0.0F, -2.0F, 1, 1, 1, 0.0F, false));
		handguard120_r2.cubeList.add(new ModelBox(handguard120_r2, 504, 525, 0.0F, 0.0F, -6.0F, 1, 1, 1, 0.0F, false));
		handguard120_r2.cubeList.add(new ModelBox(handguard120_r2, 526, 0, 0.0F, 0.0F, -10.0F, 1, 1, 1, 0.0F, false));
		handguard120_r2.cubeList.add(new ModelBox(handguard120_r2, 526, 2, 0.0F, 0.0F, -11.9F, 1, 1, 1, 0.0F, false));
		handguard120_r2.cubeList.add(new ModelBox(handguard120_r2, 32, 526, 0.0F, 0.0F, -13.9F, 1, 1, 1, 0.0F, false));
		handguard120_r2.cubeList.add(new ModelBox(handguard120_r2, 52, 526, 0.0F, 0.0F, -15.9F, 1, 1, 1, 0.0F, false));

		handguard121_r1 = new ModelRenderer(this);
		handguard121_r1.setRotationPoint(0.2F, 1.95F, -2.9F);
		coverM110Lower.addChild(handguard121_r1);
		setRotationAngle(handguard121_r1, 0.0F, 0.0F, -1.0123F);
		handguard121_r1.cubeList.add(new ModelBox(handguard121_r1, 248, 526, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard120_r3 = new ModelRenderer(this);
		handguard120_r3.setRotationPoint(0.2F, -0.95F, -2.9F);
		coverM110Lower.addChild(handguard120_r3);
		setRotationAngle(handguard120_r3, 0.0F, 0.0F, 1.0123F);
		handguard120_r3.cubeList.add(new ModelBox(handguard120_r3, 526, 249, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard119_r4 = new ModelRenderer(this);
		handguard119_r4.setRotationPoint(0.3F, -0.95F, -4.9F);
		coverM110Lower.addChild(handguard119_r4);
		setRotationAngle(handguard119_r4, 0.0F, 0.0F, 0.8203F);
		handguard119_r4.cubeList.add(new ModelBox(handguard119_r4, 526, 4, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		handguard119_r4.cubeList.add(new ModelBox(handguard119_r4, 526, 6, 0.0F, -1.0F, -4.0F, 1, 1, 1, 0.0F, false));
		handguard119_r4.cubeList.add(new ModelBox(handguard119_r4, 526, 8, 0.0F, -1.0F, -8.0F, 1, 1, 1, 0.0F, false));
		handguard119_r4.cubeList.add(new ModelBox(handguard119_r4, 526, 10, 0.0F, -1.0F, -2.0F, 1, 1, 1, 0.0F, false));
		handguard119_r4.cubeList.add(new ModelBox(handguard119_r4, 526, 12, 0.0F, -1.0F, -6.0F, 1, 1, 1, 0.0F, false));
		handguard119_r4.cubeList.add(new ModelBox(handguard119_r4, 526, 14, 0.0F, -1.0F, -10.0F, 1, 1, 1, 0.0F, false));
		handguard119_r4.cubeList.add(new ModelBox(handguard119_r4, 526, 16, 0.0F, -1.0F, -11.9F, 1, 1, 1, 0.0F, false));
		handguard119_r4.cubeList.add(new ModelBox(handguard119_r4, 526, 30, 0.0F, -1.0F, -13.9F, 1, 1, 1, 0.0F, false));
		handguard119_r4.cubeList.add(new ModelBox(handguard119_r4, 48, 526, 0.0F, -1.0F, -15.9F, 1, 1, 1, 0.0F, false));

		handguard114_r2 = new ModelRenderer(this);
		handguard114_r2.setRotationPoint(0.0F, 0.0F, -16.8F);
		coverM110Lower.addChild(handguard114_r2);
		setRotationAngle(handguard114_r2, 0.0F, 0.0F, 0.2967F);
		handguard114_r2.cubeList.add(new ModelBox(handguard114_r2, 526, 18, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		handguard114_r2.cubeList.add(new ModelBox(handguard114_r2, 526, 20, 0.0F, -1.0F, 1.9F, 1, 1, 1, 0.0F, false));
		handguard114_r2.cubeList.add(new ModelBox(handguard114_r2, 526, 28, 0.0F, -1.0F, -2.0F, 1, 1, 1, 0.0F, false));
		handguard114_r2.cubeList.add(new ModelBox(handguard114_r2, 526, 48, 0.0F, -1.0F, -4.0F, 1, 1, 1, 0.0F, false));
		handguard114_r2.cubeList.add(new ModelBox(handguard114_r2, 526, 22, 0.0F, -1.0F, 3.9F, 1, 1, 1, 0.0F, false));
		handguard114_r2.cubeList.add(new ModelBox(handguard114_r2, 24, 526, 0.0F, -1.0F, 5.9F, 1, 1, 1, 0.0F, false));
		handguard114_r2.cubeList.add(new ModelBox(handguard114_r2, 526, 24, 0.0F, -1.0F, 11.9F, 1, 1, 1, 0.0F, false));
		handguard114_r2.cubeList.add(new ModelBox(handguard114_r2, 526, 26, 0.0F, -1.0F, 9.9F, 1, 1, 1, 0.0F, false));
		handguard114_r2.cubeList.add(new ModelBox(handguard114_r2, 28, 526, 0.0F, -1.0F, 7.9F, 1, 1, 1, 0.0F, false));

		handguard115_r1 = new ModelRenderer(this);
		handguard115_r1.setRotationPoint(0.0F, 1.0F, -16.8F);
		coverM110Lower.addChild(handguard115_r1);
		setRotationAngle(handguard115_r1, 0.0F, 0.0F, -0.2967F);
		handguard115_r1.cubeList.add(new ModelBox(handguard115_r1, 526, 215, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		handguard115_r1.cubeList.add(new ModelBox(handguard115_r1, 526, 217, 0.0F, 0.0F, 1.9F, 1, 1, 1, 0.0F, false));
		handguard115_r1.cubeList.add(new ModelBox(handguard115_r1, 526, 229, 0.0F, 0.0F, -2.0F, 1, 1, 1, 0.0F, false));
		handguard115_r1.cubeList.add(new ModelBox(handguard115_r1, 526, 231, 0.0F, 0.0F, -4.0F, 1, 1, 1, 0.0F, false));
		handguard115_r1.cubeList.add(new ModelBox(handguard115_r1, 526, 219, 0.0F, 0.0F, 3.9F, 1, 1, 1, 0.0F, false));
		handguard115_r1.cubeList.add(new ModelBox(handguard115_r1, 526, 221, 0.0F, 0.0F, 5.9F, 1, 1, 1, 0.0F, false));
		handguard115_r1.cubeList.add(new ModelBox(handguard115_r1, 526, 223, 0.0F, 0.0F, 11.9F, 1, 1, 1, 0.0F, false));
		handguard115_r1.cubeList.add(new ModelBox(handguard115_r1, 526, 225, 0.0F, 0.0F, 9.9F, 1, 1, 1, 0.0F, false));
		handguard115_r1.cubeList.add(new ModelBox(handguard115_r1, 526, 227, 0.0F, 0.0F, 7.9F, 1, 1, 1, 0.0F, false));

		handguard110_r3 = new ModelRenderer(this);
		handguard110_r3.setRotationPoint(-0.1F, 0.0F, -2.9F);
		coverM110Lower.addChild(handguard110_r3);
		setRotationAngle(handguard110_r3, 0.0F, 0.0F, 0.2967F);
		handguard110_r3.cubeList.add(new ModelBox(handguard110_r3, 526, 251, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard111_r1 = new ModelRenderer(this);
		handguard111_r1.setRotationPoint(-0.1F, 1.0F, -2.9F);
		coverM110Lower.addChild(handguard111_r1);
		setRotationAngle(handguard111_r1, 0.0F, 0.0F, -0.2967F);
		handguard111_r1.cubeList.add(new ModelBox(handguard111_r1, 252, 526, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard111_r2 = new ModelRenderer(this);
		handguard111_r2.setRotationPoint(0.4F, 1.95F, -14.9F);
		coverM110Lower.addChild(handguard111_r2);
		setRotationAngle(handguard111_r2, 0.0F, 0.0F, -0.733F);
		handguard111_r2.cubeList.add(new ModelBox(handguard111_r2, 482, 437, 0.0F, 0.0F, -5.999F, 1, 1, 20, 0.0F, false));

		handguard110_r4 = new ModelRenderer(this);
		handguard110_r4.setRotationPoint(0.1F, 1.0F, -14.9F);
		coverM110Lower.addChild(handguard110_r4);
		setRotationAngle(handguard110_r4, 0.0F, 0.0F, -0.2967F);
		handguard110_r4.cubeList.add(new ModelBox(handguard110_r4, 442, 497, 0.0F, 0.0F, -6.0F, 1, 1, 20, 0.0F, false));

		handguard109_r6 = new ModelRenderer(this);
		handguard109_r6.setRotationPoint(0.1F, 0.0F, -14.9F);
		coverM110Lower.addChild(handguard109_r6);
		setRotationAngle(handguard109_r6, 0.0F, 0.0F, 0.2967F);
		handguard109_r6.cubeList.add(new ModelBox(handguard109_r6, 184, 498, 0.0F, -1.0F, -6.0F, 1, 1, 20, 0.0F, false));

		handguard110_r5 = new ModelRenderer(this);
		handguard110_r5.setRotationPoint(0.4F, -0.95F, -14.9F);
		coverM110Lower.addChild(handguard110_r5);
		setRotationAngle(handguard110_r5, 0.0F, 0.0F, 0.733F);
		handguard110_r5.cubeList.add(new ModelBox(handguard110_r5, 486, 105, 0.0F, -1.0F, -5.999F, 1, 1, 20, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		coverM110Lower.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}