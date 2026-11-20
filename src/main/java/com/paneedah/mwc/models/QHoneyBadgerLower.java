package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QHoneyBadgerLower extends ModelBase {
	private final ModelRenderer lower;
	private final ModelRenderer gun_r1;
	private final ModelRenderer gun_r2;
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
	private final ModelRenderer gun29_r1_r1;
	private final ModelRenderer gun28_r1;
	private final ModelRenderer gun39_r1;
	private final ModelRenderer gun38_r1;
	private final ModelRenderer gun37_r1;
	private final ModelRenderer gun37_r2;
	private final ModelRenderer gun53_r1;
	private final ModelRenderer gun58_r1;
	private final ModelRenderer gun63_r1;
	private final ModelRenderer gun63_r2_r1;
	private final ModelRenderer gun63_r1_r1;
	private final ModelRenderer gun152_r1;
	private final ModelRenderer gun156_r1;
	private final ModelRenderer bone_r1;
	private final ModelRenderer gun132;
	private final ModelRenderer gun67;
	private final ModelRenderer gun60;
	private final ModelRenderer boltcatch;
	private final ModelRenderer gun_r3;
	private final ModelRenderer gun_r4;
	private final ModelRenderer gun_r5;
	private final ModelRenderer gun_r6;
	private final ModelRenderer gun_r7;
	private final ModelRenderer gun_r8;
	private final ModelRenderer gun_r9;
	private final ModelRenderer hb_details;
	private final ModelRenderer gun_r10;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r16;
	private final ModelRenderer gun51_r2;
	private final ModelRenderer gun53_r3_r1;
	private final ModelRenderer gun52_r2_r1;
	private final ModelRenderer gun52_r2_r2;

	public QHoneyBadgerLower() {
		textureWidth = 400;
		textureHeight = 400;

		lower = new ModelRenderer(this);
		lower.setRotationPoint(0.0F, 24.0F, 0.0F);
		lower.cubeList.add(new ModelBox(lower, 64, 198, -0.35F, -32.5F, -16.5F, 1, 5, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 296, 383, -0.35F, -27.5F, -15.5F, 1, 1, 1, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 356, 334, -3.8F, -35.3F, -21.4F, 1, 1, 3, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 262, 28, -3.6F, -35.3F, -18.9F, 1, 1, 8, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 184, 142, -3.0F, -33.35F, -1.0F, 3, 1, 4, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 290, 318, -3.3F, -36.0F, -1.001F, 3, 3, 4, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 196, 332, -0.7F, -36.0F, -0.998F, 1, 3, 4, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 198, 145, -3.501F, -35.7F, -22.7F, 4, 1, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 222, 179, -0.4F, -33.5F, -16.3F, 1, 1, 5, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 206, 296, -3.5F, -36.0F, -13.2F, 1, 4, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 90, 303, -0.501F, -36.0F, -13.7F, 1, 2, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 206, 306, -0.5F, -34.0F, -13.2F, 1, 2, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 286, 254, -3.5F, -36.0F, -21.2F, 4, 8, 8, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 152, 142, -3.5F, -28.0F, -18.2F, 4, 1, 5, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 180, 383, -0.3F, -34.5F, -6.3F, 1, 1, 1, -0.3F, false));
		lower.cubeList.add(new ModelBox(lower, 124, 389, -0.3F, -34.5F, -2.8F, 1, 1, 1, -0.3F, false));
		lower.cubeList.add(new ModelBox(lower, 196, 383, -0.3F, -34.5F, -5.9F, 1, 1, 1, -0.3F, false));
		lower.cubeList.add(new ModelBox(lower, 200, 383, -0.3F, -34.5F, -2.4F, 1, 1, 1, -0.3F, false));
		lower.cubeList.add(new ModelBox(lower, 348, 275, -3.3F, -36.0F, -14.0F, 3, 5, 13, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 174, 218, -0.7F, -36.0F, -14.0F, 1, 5, 13, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 132, 333, -3.001F, -32.0F, -13.8F, 3, 5, 1, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 162, 268, -3.001F, -27.0F, -13.5F, 3, 1, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 348, 314, -3.0F, -26.4171F, -10.1314F, 3, 1, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 314, 369, -2.999F, -31.0F, -6.5F, 3, 5, 1, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 132, 320, -2.6F, -40.401F, 1.0015F, 2, 5, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 76, 355, -3.8F, -38.5F, 1.0F, 2, 1, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 358, 314, -1.2F, -38.5F, 1.0012F, 2, 1, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 64, 205, -1.4F, -40.4F, 1.0025F, 1, 5, 2, 0.0F, false));

		gun_r1 = new ModelRenderer(this);
		gun_r1.setRotationPoint(-1.5F, -26.2617F, -10.864F);
		lower.addChild(gun_r1);
		setRotationAngle(gun_r1, -0.3927F, 0.0F, 0.0F);
		gun_r1.cubeList.add(new ModelBox(gun_r1, 166, 353, -1.5F, -0.5F, -1.0F, 3, 1, 2, 0.0F, false));

		gun_r2 = new ModelRenderer(this);
		gun_r2.setRotationPoint(-2.999F, -34.1433F, -11.8375F);
		lower.addChild(gun_r2);
		setRotationAngle(gun_r2, -0.1745F, 0.0F, 0.0F);
		gun_r2.cubeList.add(new ModelBox(gun_r2, 178, 340, -0.5F, -2.0F, 0.0F, 1, 4, 1, 0.0F, false));

		receiver16_r3 = new ModelRenderer(this);
		receiver16_r3.setRotationPoint(-3.8F, -37.5F, 1.0F);
		lower.addChild(receiver16_r3);
		setRotationAngle(receiver16_r3, -0.925F, 0.0F, -0.2618F);
		receiver16_r3.cubeList.add(new ModelBox(receiver16_r3, 90, 299, 0.001F, -0.2F, 0.7F, 1, 2, 2, 0.0F, false));

		receiver15_r2 = new ModelRenderer(this);
		receiver15_r2.setRotationPoint(0.8F, -37.5F, 1.0F);
		lower.addChild(receiver15_r2);
		setRotationAngle(receiver15_r2, -0.925F, 0.0F, 0.2618F);
		receiver15_r2.cubeList.add(new ModelBox(receiver15_r2, 206, 302, -0.999F, -0.2F, 0.7F, 1, 2, 2, 0.0F, false));

		receiver16_r4 = new ModelRenderer(this);
		receiver16_r4.setRotationPoint(-3.37F, -35.9F, 0.0F);
		lower.addChild(receiver16_r4);
		setRotationAngle(receiver16_r4, 0.0F, 0.0F, -0.0524F);
		receiver16_r4.cubeList.add(new ModelBox(receiver16_r4, 72, 371, 0.0F, 0.0F, 0.001F, 1, 2, 3, 0.0F, false));

		receiver15_r3 = new ModelRenderer(this);
		receiver15_r3.setRotationPoint(0.37F, -35.9F, 0.0F);
		lower.addChild(receiver15_r3);
		setRotationAngle(receiver15_r3, 0.0F, 0.0F, 0.0524F);
		receiver15_r3.cubeList.add(new ModelBox(receiver15_r3, 80, 371, -1.0F, 0.0F, 0.001F, 1, 2, 3, 0.0F, false));

		receiver14_r2 = new ModelRenderer(this);
		receiver14_r2.setRotationPoint(0.8F, -37.5F, 1.0F);
		lower.addChild(receiver14_r2);
		setRotationAngle(receiver14_r2, 0.0F, 0.0F, 0.2618F);
		receiver14_r2.cubeList.add(new ModelBox(receiver14_r2, 358, 19, -2.0F, 0.0F, 0.0012F, 2, 2, 2, 0.0F, false));

		receiver14_r3 = new ModelRenderer(this);
		receiver14_r3.setRotationPoint(0.8F, -37.5F, 1.0F);
		lower.addChild(receiver14_r3);
		setRotationAngle(receiver14_r3, 0.0F, 0.0F, -0.4014F);
		

		receiver17_r4 = new ModelRenderer(this);
		receiver17_r4.setRotationPoint(-2.6F, -39.4F, 1.0F);
		lower.addChild(receiver17_r4);
		setRotationAngle(receiver17_r4, 0.0F, 0.0F, -0.8029F);
		

		receiver16_r5 = new ModelRenderer(this);
		receiver16_r5.setRotationPoint(-0.4F, -39.4F, 1.0F);
		lower.addChild(receiver16_r5);
		setRotationAngle(receiver16_r5, 0.0F, 0.0F, 0.8029F);
		

		receiver15_r4 = new ModelRenderer(this);
		receiver15_r4.setRotationPoint(-3.8F, -37.5F, 1.0F);
		lower.addChild(receiver15_r4);
		setRotationAngle(receiver15_r4, 0.0F, 0.0F, -0.2618F);
		receiver15_r4.cubeList.add(new ModelBox(receiver15_r4, 372, 313, 0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

		receiver15_r5 = new ModelRenderer(this);
		receiver15_r5.setRotationPoint(-3.8F, -37.5F, 1.0F);
		lower.addChild(receiver15_r5);
		setRotationAngle(receiver15_r5, 0.0F, 0.0F, 0.4014F);
		

		gun30_r1 = new ModelRenderer(this);
		gun30_r1.setRotationPoint(-3.2F, -31.0F, -7.6F);
		lower.addChild(gun30_r1);
		setRotationAngle(gun30_r1, -2.3562F, 0.0F, 0.0F);
		gun30_r1.cubeList.add(new ModelBox(gun30_r1, 118, 354, 0.2F, -2.0F, -1.0F, 3, 2, 1, 0.0F, false));

		gun29_r1 = new ModelRenderer(this);
		gun29_r1.setRotationPoint(-3.2F, -27.0F, -7.6F);
		lower.addChild(gun29_r1);
		setRotationAngle(gun29_r1, -2.3562F, 0.0F, 0.0F);
		

		gun29_r1_r1 = new ModelRenderer(this);
		gun29_r1_r1.setRotationPoint(1.7F, -1.0657F, 0.0657F);
		gun29_r1.addChild(gun29_r1_r1);
		setRotationAngle(gun29_r1_r1, -0.4363F, 0.0F, 0.0F);
		gun29_r1_r1.cubeList.add(new ModelBox(gun29_r1_r1, 294, 23, -1.5F, -0.3121F, -1.5684F, 3, 1, 3, 0.0F, false));

		gun28_r1 = new ModelRenderer(this);
		gun28_r1.setRotationPoint(-3.2F, -27.0F, -11.5F);
		lower.addChild(gun28_r1);
		setRotationAngle(gun28_r1, -2.3562F, 0.0F, 0.0F);
		gun28_r1.cubeList.add(new ModelBox(gun28_r1, 68, 355, 0.2F, 0.0F, 0.0F, 3, 2, 1, 0.0F, false));

		gun39_r1 = new ModelRenderer(this);
		gun39_r1.setRotationPoint(0.5F, -33.7F, -11.3F);
		lower.addChild(gun39_r1);
		setRotationAngle(gun39_r1, -0.3665F, 0.0F, 0.0F);
		gun39_r1.cubeList.add(new ModelBox(gun39_r1, 204, 383, -1.05F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		gun38_r1 = new ModelRenderer(this);
		gun38_r1.setRotationPoint(0.5F, -32.7F, -7.6F);
		lower.addChild(gun38_r1);
		setRotationAngle(gun38_r1, -0.3665F, 0.0F, 0.0F);
		gun38_r1.cubeList.add(new ModelBox(gun38_r1, 208, 383, -1.05F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		gun37_r1 = new ModelRenderer(this);
		gun37_r1.setRotationPoint(-3.4F, -33.0F, -4.2F);
		lower.addChild(gun37_r1);
		setRotationAngle(gun37_r1, -0.3665F, 0.0F, 0.0F);
		gun37_r1.cubeList.add(new ModelBox(gun37_r1, 336, 72, 0.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun37_r2 = new ModelRenderer(this);
		gun37_r2.setRotationPoint(-2.6F, -34.7F, -0.6F);
		lower.addChild(gun37_r2);
		setRotationAngle(gun37_r2, -0.3665F, 0.0F, 0.0F);
		gun37_r2.cubeList.add(new ModelBox(gun37_r2, 342, 162, 0.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));
		gun37_r2.cubeList.add(new ModelBox(gun37_r2, 344, 72, -0.8F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun53_r1 = new ModelRenderer(this);
		gun53_r1.setRotationPoint(-3.5F, -32.0F, -11.2F);
		lower.addChild(gun53_r1);
		setRotationAngle(gun53_r1, -2.7884F, 0.0F, 0.0F);
		gun53_r1.cubeList.add(new ModelBox(gun53_r1, 234, 179, -0.001F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

		gun58_r1 = new ModelRenderer(this);
		gun58_r1.setRotationPoint(-3.5F, -34.5F, -22.7F);
		lower.addChild(gun58_r1);
		setRotationAngle(gun58_r1, 0.9082F, 0.0F, 0.0F);
		gun58_r1.cubeList.add(new ModelBox(gun58_r1, 346, 334, -0.002F, -0.123F, 0.1577F, 4, 2, 1, 0.0F, false));

		gun63_r1 = new ModelRenderer(this);
		gun63_r1.setRotationPoint(-2.0F, -30.2F, -8.95F);
		lower.addChild(gun63_r1);
		setRotationAngle(gun63_r1, -0.409F, 0.0F, 0.0F);
		

		gun63_r2_r1 = new ModelRenderer(this);
		gun63_r2_r1.setRotationPoint(0.5F, 0.4968F, 1.2879F);
		gun63_r1.addChild(gun63_r2_r1);
		setRotationAngle(gun63_r2_r1, -0.3491F, 0.0F, 0.0F);
		gun63_r2_r1.cubeList.add(new ModelBox(gun63_r2_r1, 300, 383, -0.501F, 0.8633F, -0.1426F, 1, 1, 1, 0.0F, false));

		gun63_r1_r1 = new ModelRenderer(this);
		gun63_r1_r1.setRotationPoint(0.5F, 0.0F, 0.5F);
		gun63_r1.addChild(gun63_r1_r1);
		setRotationAngle(gun63_r1_r1, 0.4363F, 0.0F, 0.0F);
		gun63_r1_r1.cubeList.add(new ModelBox(gun63_r1_r1, 156, 310, -0.5F, -2.0F, -0.5F, 1, 4, 1, 0.0F, false));

		gun152_r1 = new ModelRenderer(this);
		gun152_r1.setRotationPoint(-0.7F, -33.5F, -4.7F);
		lower.addChild(gun152_r1);
		setRotationAngle(gun152_r1, 0.7854F, 0.0F, 0.0F);
		gun152_r1.cubeList.add(new ModelBox(gun152_r1, 212, 383, 0.2F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun156_r1 = new ModelRenderer(this);
		gun156_r1.setRotationPoint(0.6F, -33.4F, -4.5F);
		lower.addChild(gun156_r1);
		setRotationAngle(gun156_r1, -1.5708F, 0.0F, 0.0F);
		gun156_r1.cubeList.add(new ModelBox(gun156_r1, 126, 354, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		bone_r1 = new ModelRenderer(this);
		bone_r1.setRotationPoint(0.2F, -32.8F, -16.5F);
		lower.addChild(bone_r1);
		setRotationAngle(bone_r1, 0.0F, 0.0F, 0.7854F);
		

		gun132 = new ModelRenderer(this);
		gun132.setRotationPoint(-0.15F, -36.2F, -12.8F);
		lower.addChild(gun132);
		setRotationAngle(gun132, 0.0F, 0.0F, -1.2641F);
		

		gun67 = new ModelRenderer(this);
		gun67.setRotationPoint(-3.3F, -33.5F, 1.5F);
		lower.addChild(gun67);
		setRotationAngle(gun67, -2.3423F, 0.0F, 0.0F);
		gun67.cubeList.add(new ModelBox(gun67, 174, 236, 0.001F, 0.0638F, -1.4959F, 3, 2, 5, 0.0F, false));
		gun67.cubeList.add(new ModelBox(gun67, 96, 291, 0.599F, 0.0638F, -1.4959F, 3, 2, 5, 0.0F, false));
		gun67.cubeList.add(new ModelBox(gun67, 170, 142, 0.299F, -0.7242F, -0.49F, 3, 2, 4, 0.0F, false));

		gun60 = new ModelRenderer(this);
		gun60.setRotationPoint(-0.4F, -35.6F, -22.1F);
		lower.addChild(gun60);
		setRotationAngle(gun60, -0.3316F, 0.0F, 0.0F);
		gun60.cubeList.add(new ModelBox(gun60, 216, 383, 0.0F, 0.0946F, 0.0326F, 1, 1, 1, 0.0F, false));
		gun60.cubeList.add(new ModelBox(gun60, 220, 383, -3.3F, 0.0946F, 0.0326F, 1, 1, 1, 0.0F, false));

		boltcatch = new ModelRenderer(this);
		boltcatch.setRotationPoint(0.25F, -0.1F, 0.6F);
		lower.addChild(boltcatch);
		boltcatch.cubeList.add(new ModelBox(boltcatch, 380, 284, -1.05F, -36.1F, -12.75F, 2, 1, 1, -0.2F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 286, 380, -1.05F, -35.5F, -12.75F, 2, 1, 1, -0.2F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 178, 350, -0.1F, -36.3F, -13.35F, 1, 2, 1, -0.2F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 240, 383, -0.05F, -34.5F, -13.351F, 1, 1, 1, -0.2F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 380, 286, -1.05F, -35.5F, -13.95F, 2, 1, 1, -0.2F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 380, 288, -1.05F, -36.1F, -13.95F, 2, 1, 1, -0.2F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 156, 383, 0.051F, -37.725F, -13.351F, 1, 2, 1, -0.25F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 252, 383, 0.05F, -37.0785F, -12.9974F, 1, 1, 1, -0.25F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 256, 383, 0.05F, -37.3714F, -12.9974F, 1, 1, 1, -0.25F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 264, 383, 0.05F, -37.0785F, -13.7045F, 1, 1, 1, -0.25F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 268, 383, 0.05F, -37.3714F, -13.7045F, 1, 1, 1, -0.25F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 276, 383, -3.95F, -33.9F, -13.1F, 1, 1, 1, 0.0F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 292, 383, -3.95F, -33.2F, -13.1F, 1, 1, 1, 0.0F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 182, 332, -0.15F, -32.7F, -17.4F, 1, 1, 6, -0.3F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 210, 145, -0.151F, -33.85F, -17.4F, 1, 2, 1, -0.3F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 290, 325, -0.15F, -34.1F, -17.4F, 1, 1, 6, -0.3F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 88, 371, -4.35F, -32.4F, -14.1F, 1, 1, 2, -0.3F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 70, 179, -4.351F, -34.85F, -14.1F, 1, 4, 1, -0.3F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 160, 380, -4.351F, -34.85F, -13.7F, 1, 1, 2, -0.3F, false));

		gun_r3 = new ModelRenderer(this);
		gun_r3.setRotationPoint(-0.1271F, -34.0675F, -15.9F);
		boltcatch.addChild(gun_r3);
		setRotationAngle(gun_r3, 0.0F, 0.0F, -0.9163F);
		gun_r3.cubeList.add(new ModelBox(gun_r3, 0, 372, -0.5F, -1.0F, -1.5F, 1, 2, 3, -0.3F, false));

		gun_r4 = new ModelRenderer(this);
		gun_r4.setRotationPoint(-3.849F, -31.6169F, -13.1233F);
		boltcatch.addChild(gun_r4);
		setRotationAngle(gun_r4, 0.3927F, 0.0F, 0.0F);
		gun_r4.cubeList.add(new ModelBox(gun_r4, 176, 353, -0.5F, -0.5F, -1.0F, 1, 1, 2, -0.3F, false));

		gun_r5 = new ModelRenderer(this);
		gun_r5.setRotationPoint(0.549F, -37.1214F, -13.101F);
		boltcatch.addChild(gun_r5);
		setRotationAngle(gun_r5, -0.7854F, 0.0F, 0.0F);
		gun_r5.cubeList.add(new ModelBox(gun_r5, 272, 383, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.25F, false));

		gun_r6 = new ModelRenderer(this);
		gun_r6.setRotationPoint(0.549F, -37.1214F, -12.601F);
		boltcatch.addChild(gun_r6);
		setRotationAngle(gun_r6, -0.7854F, 0.0F, 0.0F);
		gun_r6.cubeList.add(new ModelBox(gun_r6, 260, 383, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.25F, false));

		gun_r7 = new ModelRenderer(this);
		gun_r7.setRotationPoint(0.549F, -36.3285F, -12.601F);
		boltcatch.addChild(gun_r7);
		setRotationAngle(gun_r7, -0.7854F, 0.0F, 0.0F);
		gun_r7.cubeList.add(new ModelBox(gun_r7, 248, 383, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.25F, false));

		gun_r8 = new ModelRenderer(this);
		gun_r8.setRotationPoint(0.549F, -36.3285F, -13.101F);
		boltcatch.addChild(gun_r8);
		setRotationAngle(gun_r8, -0.7854F, 0.0F, 0.0F);
		gun_r8.cubeList.add(new ModelBox(gun_r8, 244, 383, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.25F, false));

		gun_r9 = new ModelRenderer(this);
		gun_r9.setRotationPoint(0.09F, -33.9017F, -12.85F);
		boltcatch.addChild(gun_r9);
		setRotationAngle(gun_r9, 0.0F, 0.0F, 0.4363F);
		gun_r9.cubeList.add(new ModelBox(gun_r9, 236, 383, -0.5F, -1.0F, -0.5F, 1, 1, 1, -0.2F, false));

		hb_details = new ModelRenderer(this);
		hb_details.setRotationPoint(0.0F, 0.0F, 0.0F);
		lower.addChild(hb_details);
		hb_details.cubeList.add(new ModelBox(hb_details, 328, 338, -4.0F, -36.25F, -11.75F, 5, 1, 15, -0.25F, false));
		hb_details.cubeList.add(new ModelBox(hb_details, 380, 189, 0.5F, -38.25F, 1.25F, 1, 1, 2, -0.25F, false));
		hb_details.cubeList.add(new ModelBox(hb_details, 380, 192, -4.5F, -38.25F, 1.25F, 1, 1, 2, -0.25F, false));
		hb_details.cubeList.add(new ModelBox(hb_details, 304, 383, -4.5F, -38.25F, 0.75F, 1, 1, 1, -0.25F, false));
		hb_details.cubeList.add(new ModelBox(hb_details, 370, 383, 0.5F, -38.25F, 0.75F, 1, 1, 1, -0.25F, false));
		hb_details.cubeList.add(new ModelBox(hb_details, 206, 314, -2.8625F, -40.4032F, 1.001F, 1, 2, 2, 0.0F, false));
		hb_details.cubeList.add(new ModelBox(hb_details, 90, 315, -1.1375F, -40.4032F, 1.001F, 1, 2, 2, 0.0F, false));
		hb_details.cubeList.add(new ModelBox(hb_details, 106, 370, 0.0F, -36.25F, -17.15F, 1, 1, 5, -0.25F, false));

		gun_r10 = new ModelRenderer(this);
		gun_r10.setRotationPoint(-1.5F, -28.1864F, -21.0075F);
		hb_details.addChild(gun_r10);
		setRotationAngle(gun_r10, -0.7418F, 0.0F, 0.0F);
		gun_r10.cubeList.add(new ModelBox(gun_r10, 140, 317, -2.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0429F, -35.5F, -6.9F);
		hb_details.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 62, 371, -0.5F, -0.5F, -10.0F, 1, 1, 4, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 260, 231, -0.5F, -0.5F, -5.1F, 1, 1, 11, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 322, 363, -0.5F, -0.5F, 7.9F, 1, 1, 2, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-3.0429F, -35.5F, -2.0F);
		hb_details.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 232, 369, -0.5F, -0.5F, -9.0F, 1, 1, 10, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 366, 314, -0.5F, -0.5F, 3.0F, 1, 1, 2, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.317F, -38.616F, 2.0F);
		hb_details.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.5236F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 380, 213, -0.5F, -1.775F, -1.0F, 1, 1, 2, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-3.317F, -38.616F, 2.0F);
		hb_details.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 0.5236F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 380, 210, -0.5F, -1.775F, -1.0F, 1, 1, 2, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-3.567F, -38.183F, 2.0F);
		hb_details.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 0.5236F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 206, 310, -0.5F, -1.5F, -1.0F, 1, 2, 2, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.567F, -38.183F, 2.0F);
		hb_details.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, -0.5236F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 90, 307, -0.5F, -1.5F, -1.0F, 1, 2, 2, 0.0F, false));

		gun51_r2 = new ModelRenderer(this);
		gun51_r2.setRotationPoint(-3.9F, -26.9F, -21.2F);
		hb_details.addChild(gun51_r2);
		setRotationAngle(gun51_r2, 1.3756F, 0.0F, 0.0F);
		gun51_r2.cubeList.add(new ModelBox(gun51_r2, 58, 188, -0.1F, -0.7477F, 0.132F, 5, 9, 1, 0.0F, false));

		gun53_r3_r1 = new ModelRenderer(this);
		gun53_r3_r1.setRotationPoint(0.583F, 4.2258F, 1.3296F);
		gun51_r2.addChild(gun53_r3_r1);
		setRotationAngle(gun53_r3_r1, 0.0F, 0.5236F, 0.0F);
		gun53_r3_r1.cubeList.add(new ModelBox(gun53_r3_r1, 70, 162, -0.4927F, -4.5736F, -0.5126F, 1, 8, 1, 0.0F, false));

		gun52_r2_r1 = new ModelRenderer(this);
		gun52_r2_r1.setRotationPoint(4.217F, 4.2258F, 1.3296F);
		gun51_r2.addChild(gun52_r2_r1);
		setRotationAngle(gun52_r2_r1, 0.0F, -0.5236F, 0.0F);
		gun52_r2_r1.cubeList.add(new ModelBox(gun52_r2_r1, 70, 153, -0.5073F, -4.5736F, -0.5126F, 1, 8, 1, 0.0F, false));

		gun52_r2_r2 = new ModelRenderer(this);
		gun52_r2_r2.setRotationPoint(2.4F, 7.6428F, 1.3296F);
		gun51_r2.addChild(gun52_r2_r2);
		setRotationAngle(gun52_r2_r2, 0.5236F, 0.0F, 0.0F);
		gun52_r2_r2.cubeList.add(new ModelBox(gun52_r2_r2, 234, 183, -2.0F, -0.571F, -0.4758F, 4, 1, 1, 0.0F, false));
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