package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class HK416D_Lower extends ModelBase {
	private final ModelRenderer lower;
	private final ModelRenderer receiver16_r3;
	private final ModelRenderer receiver15_r2;
	private final ModelRenderer receiver16_r4;
	private final ModelRenderer receiver15_r3;
	private final ModelRenderer receiver14_r2;
	private final ModelRenderer receiver14_r3;
	private final ModelRenderer receiver17_r4;
	private final ModelRenderer receiver16_r5;
	private final ModelRenderer receiver15_r4;
	private final ModelRenderer receiver15_r5;
	private final ModelRenderer gun30_r1;
	private final ModelRenderer gun29_r1;
	private final ModelRenderer gun28_r1;
	private final ModelRenderer gun39_r1;
	private final ModelRenderer gun38_r1;
	private final ModelRenderer gun37_r1;
	private final ModelRenderer gun37_r2;
	private final ModelRenderer gun53_r1;
	private final ModelRenderer gun58_r1;
	private final ModelRenderer gun63_r1;
	private final ModelRenderer gun80_r1;
	private final ModelRenderer gun82_r1;
	private final ModelRenderer gun152_r1;
	private final ModelRenderer gun156_r1;
	private final ModelRenderer gun67;
	private final ModelRenderer gun60;
	private final ModelRenderer gun51_r2;
	private final ModelRenderer boltcatch;
	private final ModelRenderer gun_r1;
	private final ModelRenderer gun_r2;
	private final ModelRenderer gun_r3;
	private final ModelRenderer gun_r4;
	private final ModelRenderer gun_r5;

	public HK416D_Lower() {
		textureWidth = 432;
		textureHeight = 432;

		lower = new ModelRenderer(this);
		lower.setRotationPoint(0.0F, 24.0F, 0.0F);
		lower.cubeList.add(new ModelBox(lower, 62, 216, -0.35F, -32.5F, -16.5F, 1, 6, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 250, 180, -3.801F, -32.026F, -12.4F, 1, 1, 1, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 416, 391, -3.8F, -32.025F, -13.7F, 1, 1, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 58, 262, -3.8F, -34.3F, -14.7F, 1, 3, 1, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 382, 314, -3.8F, -35.3F, -21.4F, 1, 1, 10, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 276, 53, -3.0F, -33.35F, -1.0F, 3, 1, 4, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 132, 386, -3.3F, -36.0F, -1.001F, 3, 3, 4, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 410, 185, -0.7F, -36.0F, -0.998F, 1, 3, 4, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 290, 53, -3.501F, -35.7F, -22.7F, 4, 1, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 288, 112, -0.4F, -33.5F, -16.3F, 1, 1, 5, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 62, 240, -0.35F, -36.0F, -16.5F, 1, 2, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 416, 394, -0.35F, -34.5F, -16.5F, 1, 1, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 300, 112, -3.5F, -36.0F, -13.2F, 4, 4, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 380, 375, -3.5F, -36.0F, -21.2F, 4, 8, 8, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 324, 137, -3.5F, -28.0F, -21.2F, 4, 1, 8, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 188, 421, -0.3F, -34.5F, -6.3F, 1, 1, 1, -0.3F, false));
		lower.cubeList.add(new ModelBox(lower, 426, 56, -0.3F, -34.5F, -2.8F, 1, 1, 1, -0.3F, false));
		lower.cubeList.add(new ModelBox(lower, 360, 421, -0.3F, -34.5F, -5.9F, 1, 1, 1, -0.3F, false));
		lower.cubeList.add(new ModelBox(lower, 422, 50, -0.3F, -34.5F, -2.4F, 1, 1, 1, -0.3F, false));
		lower.cubeList.add(new ModelBox(lower, 254, 225, -3.3F, -36.0F, -14.0F, 3, 5, 13, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 380, 20, -0.7F, -36.0F, -14.0F, 1, 5, 13, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 82, 413, -3.001F, -32.0F, -13.8F, 3, 5, 1, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 328, 103, -3.001F, -27.0F, -13.3F, 3, 1, 7, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 128, 413, -2.999F, -31.0F, -6.5F, 3, 5, 1, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 24, 408, -2.6F, -40.401F, 1.0015F, 2, 5, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 338, 222, -3.8F, -38.5F, 1.0F, 2, 1, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 346, 50, -1.2F, -38.5F, 1.0012F, 2, 1, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 62, 233, -1.4F, -40.4F, 1.0025F, 1, 5, 2, 0.0F, false));

		receiver16_r3 = new ModelRenderer(this);
		receiver16_r3.setRotationPoint(-3.8F, -37.5F, 1.0F);
		lower.addChild(receiver16_r3);
		setRotationAngle(receiver16_r3, -0.925F, 0.0F, -0.2618F);
		receiver16_r3.cubeList.add(new ModelBox(receiver16_r3, 306, 147, 0.001F, -0.2F, 0.7F, 1, 2, 2, 0.0F, false));

		receiver15_r2 = new ModelRenderer(this);
		receiver15_r2.setRotationPoint(0.8F, -37.5F, 1.0F);
		lower.addChild(receiver15_r2);
		setRotationAngle(receiver15_r2, -0.925F, 0.0F, 0.2618F);
		receiver15_r2.cubeList.add(new ModelBox(receiver15_r2, 306, 151, -0.999F, -0.2F, 0.7F, 1, 2, 2, 0.0F, false));

		receiver16_r4 = new ModelRenderer(this);
		receiver16_r4.setRotationPoint(-3.37F, -35.9F, 0.0F);
		lower.addChild(receiver16_r4);
		setRotationAngle(receiver16_r4, 0.0F, 0.0F, -0.0524F);
		receiver16_r4.cubeList.add(new ModelBox(receiver16_r4, 184, 413, 0.0F, 0.0F, 0.001F, 1, 2, 3, 0.0F, false));

		receiver15_r3 = new ModelRenderer(this);
		receiver15_r3.setRotationPoint(0.37F, -35.9F, 0.0F);
		lower.addChild(receiver15_r3);
		setRotationAngle(receiver15_r3, 0.0F, 0.0F, 0.0524F);
		receiver15_r3.cubeList.add(new ModelBox(receiver15_r3, 254, 413, -1.0F, 0.0F, 0.001F, 1, 2, 3, 0.0F, false));

		receiver14_r2 = new ModelRenderer(this);
		receiver14_r2.setRotationPoint(0.8F, -37.5F, 1.0F);
		lower.addChild(receiver14_r2);
		setRotationAngle(receiver14_r2, 0.0F, 0.0F, 0.2618F);
		receiver14_r2.cubeList.add(new ModelBox(receiver14_r2, 356, 247, -2.0F, 0.0F, 0.0012F, 2, 2, 2, 0.0F, false));

		receiver14_r3 = new ModelRenderer(this);
		receiver14_r3.setRotationPoint(0.8F, -37.5F, 1.0F);
		lower.addChild(receiver14_r3);
		setRotationAngle(receiver14_r3, 0.0F, 0.0F, -0.4014F);
		receiver14_r3.cubeList.add(new ModelBox(receiver14_r3, 354, 50, -1.6083F, -2.2205F, 0.001F, 2, 1, 2, 0.0F, false));
		receiver14_r3.cubeList.add(new ModelBox(receiver14_r3, 416, 397, -0.6093F, -1.9205F, 0.0F, 1, 1, 2, 0.0F, false));

		receiver17_r4 = new ModelRenderer(this);
		receiver17_r4.setRotationPoint(-2.6F, -39.4F, 1.0F);
		lower.addChild(receiver17_r4);
		setRotationAngle(receiver17_r4, 0.0F, 0.0F, -0.8029F);
		receiver17_r4.cubeList.add(new ModelBox(receiver17_r4, 416, 400, -0.2806F, -0.6946F, 0.0F, 1, 1, 2, 0.0F, false));

		receiver16_r5 = new ModelRenderer(this);
		receiver16_r5.setRotationPoint(-0.4F, -39.4F, 1.0F);
		lower.addChild(receiver16_r5);
		setRotationAngle(receiver16_r5, 0.0F, 0.0F, 0.8029F);
		receiver16_r5.cubeList.add(new ModelBox(receiver16_r5, 416, 403, -0.7194F, -0.6946F, 0.0F, 1, 1, 2, 0.0F, false));

		receiver15_r4 = new ModelRenderer(this);
		receiver15_r4.setRotationPoint(-3.8F, -37.5F, 1.0F);
		lower.addChild(receiver15_r4);
		setRotationAngle(receiver15_r4, 0.0F, 0.0F, -0.2618F);
		receiver15_r4.cubeList.add(new ModelBox(receiver15_r4, 364, 247, 0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

		receiver15_r5 = new ModelRenderer(this);
		receiver15_r5.setRotationPoint(-3.8F, -37.5F, 1.0F);
		lower.addChild(receiver15_r5);
		setRotationAngle(receiver15_r5, 0.0F, 0.0F, 0.4014F);
		receiver15_r5.cubeList.add(new ModelBox(receiver15_r5, 8, 417, -0.3917F, -2.2205F, 0.001F, 1, 1, 2, 0.0F, false));
		receiver15_r5.cubeList.add(new ModelBox(receiver15_r5, 362, 50, -0.3907F, -1.9205F, -0.001F, 2, 1, 2, 0.0F, false));

		gun30_r1 = new ModelRenderer(this);
		gun30_r1.setRotationPoint(-3.2F, -31.0F, -7.6F);
		lower.addChild(gun30_r1);
		setRotationAngle(gun30_r1, -2.3562F, 0.0F, 0.0F);
		gun30_r1.cubeList.add(new ModelBox(gun30_r1, 370, 50, 0.2F, -2.0F, -1.0F, 3, 2, 1, 0.0F, false));

		gun29_r1 = new ModelRenderer(this);
		gun29_r1.setRotationPoint(-3.2F, -27.0F, -7.6F);
		lower.addChild(gun29_r1);
		setRotationAngle(gun29_r1, -2.3562F, 0.0F, 0.0F);
		gun29_r1.cubeList.add(new ModelBox(gun29_r1, 194, 145, 0.2F, -1.0F, -2.0F, 3, 1, 2, 0.0F, false));

		gun28_r1 = new ModelRenderer(this);
		gun28_r1.setRotationPoint(-3.2F, -27.0F, -11.5F);
		lower.addChild(gun28_r1);
		setRotationAngle(gun28_r1, -2.3562F, 0.0F, 0.0F);
		gun28_r1.cubeList.add(new ModelBox(gun28_r1, 388, 219, 0.2F, 0.0F, 0.0F, 3, 2, 1, 0.0F, false));

		gun39_r1 = new ModelRenderer(this);
		gun39_r1.setRotationPoint(0.5F, -33.7F, -11.3F);
		lower.addChild(gun39_r1);
		setRotationAngle(gun39_r1, -0.3665F, 0.0F, 0.0F);
		gun39_r1.cubeList.add(new ModelBox(gun39_r1, 422, 52, -1.05F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		gun38_r1 = new ModelRenderer(this);
		gun38_r1.setRotationPoint(0.5F, -32.7F, -7.6F);
		lower.addChild(gun38_r1);
		setRotationAngle(gun38_r1, -0.3665F, 0.0F, 0.0F);
		gun38_r1.cubeList.add(new ModelBox(gun38_r1, 422, 54, -1.05F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		gun37_r1 = new ModelRenderer(this);
		gun37_r1.setRotationPoint(-3.4F, -33.0F, -4.2F);
		lower.addChild(gun37_r1);
		setRotationAngle(gun37_r1, -0.3665F, 0.0F, 0.0F);
		gun37_r1.cubeList.add(new ModelBox(gun37_r1, 242, 180, 0.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun37_r2 = new ModelRenderer(this);
		gun37_r2.setRotationPoint(-2.6F, -34.7F, -0.6F);
		lower.addChild(gun37_r2);
		setRotationAngle(gun37_r2, -0.3665F, 0.0F, 0.0F);
		gun37_r2.cubeList.add(new ModelBox(gun37_r2, 250, 134, 0.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));
		gun37_r2.cubeList.add(new ModelBox(gun37_r2, 258, 134, -0.8F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun53_r1 = new ModelRenderer(this);
		gun53_r1.setRotationPoint(-3.5F, -32.0F, -11.2F);
		lower.addChild(gun53_r1);
		setRotationAngle(gun53_r1, -2.7884F, 0.0F, 0.0F);
		gun53_r1.cubeList.add(new ModelBox(gun53_r1, 372, 247, 2.999F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun58_r1 = new ModelRenderer(this);
		gun58_r1.setRotationPoint(-3.5F, -34.5F, -22.7F);
		lower.addChild(gun58_r1);
		setRotationAngle(gun58_r1, 0.9082F, 0.0F, 0.0F);
		gun58_r1.cubeList.add(new ModelBox(gun58_r1, 312, 222, -0.002F, -0.123F, 0.1577F, 4, 2, 1, 0.0F, false));

		gun63_r1 = new ModelRenderer(this);
		gun63_r1.setRotationPoint(-2.0F, -30.2F, -8.95F);
		lower.addChild(gun63_r1);
		setRotationAngle(gun63_r1, -0.409F, 0.0F, 0.0F);
		gun63_r1.cubeList.add(new ModelBox(gun63_r1, 58, 247, 0.0F, -2.0F, 0.0F, 1, 4, 1, 0.0F, false));

		gun80_r1 = new ModelRenderer(this);
		gun80_r1.setRotationPoint(-3.8F, -31.3F, -14.7F);
		lower.addChild(gun80_r1);
		setRotationAngle(gun80_r1, 0.0F, 0.0F, -0.2603F);
		gun80_r1.cubeList.add(new ModelBox(gun80_r1, 54, 285, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun82_r1 = new ModelRenderer(this);
		gun82_r1.setRotationPoint(-3.8F, -34.3F, -14.7F);
		lower.addChild(gun82_r1);
		setRotationAngle(gun82_r1, 0.0F, 0.7436F, 0.0F);
		gun82_r1.cubeList.add(new ModelBox(gun82_r1, 58, 266, 0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

		gun152_r1 = new ModelRenderer(this);
		gun152_r1.setRotationPoint(-0.7F, -33.5F, -4.7F);
		lower.addChild(gun152_r1);
		setRotationAngle(gun152_r1, 0.7854F, 0.0F, 0.0F);
		gun152_r1.cubeList.add(new ModelBox(gun152_r1, 422, 56, 0.2F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun156_r1 = new ModelRenderer(this);
		gun156_r1.setRotationPoint(0.6F, -33.4F, -4.5F);
		lower.addChild(gun156_r1);
		setRotationAngle(gun156_r1, -1.5708F, 0.0F, 0.0F);
		gun156_r1.cubeList.add(new ModelBox(gun156_r1, 14, 417, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun67 = new ModelRenderer(this);
		gun67.setRotationPoint(-3.3F, -33.5F, 1.5F);
		lower.addChild(gun67);
		setRotationAngle(gun67, -2.3423F, 0.0F, 0.0F);
		gun67.cubeList.add(new ModelBox(gun67, 382, 401, 0.001F, 0.0638F, -1.4959F, 3, 2, 5, 0.0F, false));
		gun67.cubeList.add(new ModelBox(gun67, 402, 38, 0.599F, 0.0638F, -1.4959F, 3, 2, 5, 0.0F, false));
		gun67.cubeList.add(new ModelBox(gun67, 274, 112, 0.299F, -0.7242F, -0.49F, 3, 2, 4, 0.0F, false));

		gun60 = new ModelRenderer(this);
		gun60.setRotationPoint(-0.4F, -35.6F, -22.1F);
		lower.addChild(gun60);
		setRotationAngle(gun60, -0.3316F, 0.0F, 0.0F);
		gun60.cubeList.add(new ModelBox(gun60, 422, 58, 0.0F, 0.0946F, 0.0326F, 1, 1, 1, 0.0F, false));
		gun60.cubeList.add(new ModelBox(gun60, 422, 60, -3.3F, 0.0946F, 0.0326F, 1, 1, 1, 0.0F, false));

		gun51_r2 = new ModelRenderer(this);
		gun51_r2.setRotationPoint(-3.9F, -26.8F, -21.1F);
		lower.addChild(gun51_r2);
		setRotationAngle(gun51_r2, 1.4629F, 0.0F, 0.0F);
		gun51_r2.cubeList.add(new ModelBox(gun51_r2, 194, 136, 0.1F, 0.0806F, 0.0981F, 4, 8, 1, 0.0F, false));
		gun51_r2.cubeList.add(new ModelBox(gun51_r2, 232, 180, 0.101F, -0.4194F, 0.098F, 4, 1, 1, 0.0F, false));
		gun51_r2.cubeList.add(new ModelBox(gun51_r2, 62, 224, 3.7F, 0.08F, 0.098F, 1, 8, 1, 0.0F, false));
		gun51_r2.cubeList.add(new ModelBox(gun51_r2, 258, 418, 3.699F, -0.42F, 0.1F, 1, 1, 1, 0.0F, false));

		boltcatch = new ModelRenderer(this);
		boltcatch.setRotationPoint(0.25F, -0.1F, 0.6F);
		lower.addChild(boltcatch);
		boltcatch.cubeList.add(new ModelBox(boltcatch, 420, 274, -1.05F, -36.1F, -12.75F, 2, 1, 1, -0.2F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 276, 420, -1.05F, -35.5F, -12.75F, 2, 1, 1, -0.2F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 54, 291, -0.1F, -36.3F, -13.35F, 1, 2, 1, -0.2F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 164, 423, -0.05F, -34.5F, -13.351F, 1, 1, 1, -0.2F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 420, 276, -1.05F, -35.5F, -13.95F, 2, 1, 1, -0.2F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 420, 278, -1.05F, -36.1F, -13.95F, 2, 1, 1, -0.2F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 54, 294, 0.05F, -37.725F, -13.351F, 1, 2, 1, -0.25F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 176, 423, 0.05F, -37.0785F, -12.9974F, 1, 1, 1, -0.25F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 180, 423, 0.05F, -37.3714F, -12.9974F, 1, 1, 1, -0.25F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 188, 423, 0.05F, -37.0785F, -13.7045F, 1, 1, 1, -0.25F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 244, 423, 0.05F, -37.3714F, -13.7045F, 1, 1, 1, -0.25F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 252, 423, -3.95F, -33.9F, -13.6F, 1, 1, 1, 0.0F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 354, 423, -3.95F, -33.2F, -13.6F, 1, 1, 1, 0.0F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 426, 116, -0.15F, -32.7F, -16.2F, 1, 1, 1, -0.3F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 426, 118, -0.15F, -32.7F, -16.6F, 1, 1, 1, -0.3F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 426, 126, -0.15F, -32.7F, -17.0F, 1, 1, 1, -0.3F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 426, 124, -0.15F, -34.1F, -17.0F, 1, 1, 1, -0.3F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 358, 423, -0.15F, -34.1F, -16.6F, 1, 1, 1, -0.3F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 4, 424, -0.15F, -34.1F, -16.2F, 1, 1, 1, -0.3F, false));

		gun_r1 = new ModelRenderer(this);
		gun_r1.setRotationPoint(0.55F, -37.1214F, -13.101F);
		boltcatch.addChild(gun_r1);
		setRotationAngle(gun_r1, -0.7854F, 0.0F, 0.0F);
		gun_r1.cubeList.add(new ModelBox(gun_r1, 248, 423, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.25F, false));

		gun_r2 = new ModelRenderer(this);
		gun_r2.setRotationPoint(0.55F, -37.1214F, -12.601F);
		boltcatch.addChild(gun_r2);
		setRotationAngle(gun_r2, -0.7854F, 0.0F, 0.0F);
		gun_r2.cubeList.add(new ModelBox(gun_r2, 184, 423, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.25F, false));

		gun_r3 = new ModelRenderer(this);
		gun_r3.setRotationPoint(0.55F, -36.3285F, -12.601F);
		boltcatch.addChild(gun_r3);
		setRotationAngle(gun_r3, -0.7854F, 0.0F, 0.0F);
		gun_r3.cubeList.add(new ModelBox(gun_r3, 172, 423, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.25F, false));

		gun_r4 = new ModelRenderer(this);
		gun_r4.setRotationPoint(0.55F, -36.3285F, -13.101F);
		boltcatch.addChild(gun_r4);
		setRotationAngle(gun_r4, -0.7854F, 0.0F, 0.0F);
		gun_r4.cubeList.add(new ModelBox(gun_r4, 168, 423, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.25F, false));

		gun_r5 = new ModelRenderer(this);
		gun_r5.setRotationPoint(0.09F, -33.9017F, -12.85F);
		boltcatch.addChild(gun_r5);
		setRotationAngle(gun_r5, 0.0F, 0.0F, 0.4363F);
		gun_r5.cubeList.add(new ModelBox(gun_r5, 160, 423, -0.5F, -1.0F, -0.5F, 1, 1, 1, -0.2F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		lower.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}