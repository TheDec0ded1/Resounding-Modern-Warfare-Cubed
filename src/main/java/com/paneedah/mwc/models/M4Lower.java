package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M4Lower extends ModelBase {
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
	private final ModelRenderer gun51_r1;
	private final ModelRenderer gun53_r1;
	private final ModelRenderer gun58_r1;
	private final ModelRenderer gun63_r1;
	private final ModelRenderer gun80_r1;
	private final ModelRenderer gun82_r1;
	private final ModelRenderer gun152_r1;
	private final ModelRenderer gun156_r1;
	private final ModelRenderer bone_r1;
	private final ModelRenderer gun132;
	private final ModelRenderer gun67;
	private final ModelRenderer gun60;
	private final ModelRenderer boltcatch;
	private final ModelRenderer gun_r1;
	private final ModelRenderer gun_r2;
	private final ModelRenderer gun_r3;
	private final ModelRenderer gun_r4;
	private final ModelRenderer gun_r5;

	public M4Lower() {
		textureWidth = 416;
		textureHeight = 416;

		lower = new ModelRenderer(this);
		lower.setRotationPoint(0.0F, 24.0F, 0.0F);
		lower.cubeList.add(new ModelBox(lower, 258, 351, -0.35F, -32.5F, -16.5F, 1, 5, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 398, 168, -0.35F, -27.5F, -15.5F, 1, 1, 1, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 176, 398, -3.801F, -32.001F, -12.4F, 1, 1, 1, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 80, 387, -3.8F, -32.0F, -13.7F, 1, 1, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 44, 300, -3.8F, -34.3F, -14.7F, 1, 3, 1, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 270, 146, -3.8F, -35.3F, -21.4F, 1, 1, 10, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 272, 247, -3.0F, -33.35F, -1.0F, 3, 1, 4, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 326, 110, -3.3F, -36.0F, -1.001F, 3, 3, 4, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 180, 314, -0.7F, -36.0F, -0.998F, 1, 3, 4, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 236, 129, -3.501F, -35.7F, -22.7F, 4, 1, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 212, 247, -0.4F, -33.5F, -16.3F, 1, 1, 5, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 174, 339, -0.35F, -36.0F, -16.5F, 1, 2, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 252, 388, -0.35F, -34.5F, -16.5F, 1, 1, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 338, 162, -3.5F, -36.0F, -13.2F, 4, 4, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 258, 363, -3.5F, -36.0F, -21.2F, 4, 8, 8, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 144, 249, -3.5F, -28.0F, -18.2F, 4, 1, 5, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 320, 386, -0.3F, -34.5F, -6.3F, 1, 1, 1, -0.3F, false));
		lower.cubeList.add(new ModelBox(lower, 398, 170, -0.3F, -34.5F, -2.8F, 1, 1, 1, -0.3F, false));
		lower.cubeList.add(new ModelBox(lower, 304, 388, -0.3F, -34.5F, -5.9F, 1, 1, 1, -0.3F, false));
		lower.cubeList.add(new ModelBox(lower, 332, 388, -0.3F, -34.5F, -2.4F, 1, 1, 1, -0.3F, false));
		lower.cubeList.add(new ModelBox(lower, 362, 199, -3.3F, -36.0F, -14.0F, 3, 5, 13, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 348, 362, -0.7F, -36.0F, -14.0F, 1, 5, 13, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 136, 288, -3.001F, -32.0F, -13.8F, 3, 5, 1, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 144, 233, -3.001F, -27.0F, -13.3F, 3, 1, 7, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 136, 294, -2.999F, -31.0F, -6.5F, 3, 5, 1, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 136, 281, -2.6F, -40.401F, 1.0015F, 2, 5, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 196, 386, -3.8F, -38.5F, 1.0F, 2, 1, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 204, 386, -1.2F, -38.5F, 1.0012F, 2, 1, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 330, 381, -1.4F, -40.4F, 1.0025F, 1, 5, 2, 0.0F, false));

		receiver16_r3 = new ModelRenderer(this);
		receiver16_r3.setRotationPoint(-3.8F, -37.5F, 1.0F);
		lower.addChild(receiver16_r3);
		setRotationAngle(receiver16_r3, -0.925F, 0.0F, -0.2618F);
		receiver16_r3.cubeList.add(new ModelBox(receiver16_r3, 258, 358, 0.001F, -0.2F, 0.7F, 1, 2, 2, 0.0F, false));

		receiver15_r2 = new ModelRenderer(this);
		receiver15_r2.setRotationPoint(0.8F, -37.5F, 1.0F);
		lower.addChild(receiver15_r2);
		setRotationAngle(receiver15_r2, -0.925F, 0.0F, 0.2618F);
		receiver15_r2.cubeList.add(new ModelBox(receiver15_r2, 24, 384, -0.999F, -0.2F, 0.7F, 1, 2, 2, 0.0F, false));

		receiver16_r4 = new ModelRenderer(this);
		receiver16_r4.setRotationPoint(-3.37F, -35.9F, 0.0F);
		lower.addChild(receiver16_r4);
		setRotationAngle(receiver16_r4, 0.0F, 0.0F, -0.0524F);
		receiver16_r4.cubeList.add(new ModelBox(receiver16_r4, 336, 381, 0.0F, 0.0F, 0.001F, 1, 2, 3, 0.0F, false));

		receiver15_r3 = new ModelRenderer(this);
		receiver15_r3.setRotationPoint(0.37F, -35.9F, 0.0F);
		lower.addChild(receiver15_r3);
		setRotationAngle(receiver15_r3, 0.0F, 0.0F, 0.0524F);
		receiver15_r3.cubeList.add(new ModelBox(receiver15_r3, 30, 382, -1.0F, 0.0F, 0.001F, 1, 2, 3, 0.0F, false));

		receiver14_r2 = new ModelRenderer(this);
		receiver14_r2.setRotationPoint(0.8F, -37.5F, 1.0F);
		lower.addChild(receiver14_r2);
		setRotationAngle(receiver14_r2, 0.0F, 0.0F, 0.2618F);
		receiver14_r2.cubeList.add(new ModelBox(receiver14_r2, 104, 376, -2.0F, 0.0F, 0.0012F, 2, 2, 2, 0.0F, false));

		receiver14_r3 = new ModelRenderer(this);
		receiver14_r3.setRotationPoint(0.8F, -37.5F, 1.0F);
		lower.addChild(receiver14_r3);
		setRotationAngle(receiver14_r3, 0.0F, 0.0F, -0.4014F);
		receiver14_r3.cubeList.add(new ModelBox(receiver14_r3, 372, 138, -1.6083F, -2.2205F, 0.001F, 2, 1, 2, 0.0F, false));
		receiver14_r3.cubeList.add(new ModelBox(receiver14_r3, 86, 387, -0.6093F, -1.9205F, 0.0F, 1, 1, 2, 0.0F, false));

		receiver17_r4 = new ModelRenderer(this);
		receiver17_r4.setRotationPoint(-2.6F, -39.4F, 1.0F);
		lower.addChild(receiver17_r4);
		setRotationAngle(receiver17_r4, 0.0F, 0.0F, -0.8029F);
		receiver17_r4.cubeList.add(new ModelBox(receiver17_r4, 92, 387, -0.2806F, -0.6946F, 0.0F, 1, 1, 2, 0.0F, false));

		receiver16_r5 = new ModelRenderer(this);
		receiver16_r5.setRotationPoint(-0.4F, -39.4F, 1.0F);
		lower.addChild(receiver16_r5);
		setRotationAngle(receiver16_r5, 0.0F, 0.0F, 0.8029F);
		receiver16_r5.cubeList.add(new ModelBox(receiver16_r5, 98, 387, -0.7194F, -0.6946F, 0.0F, 1, 1, 2, 0.0F, false));

		receiver15_r4 = new ModelRenderer(this);
		receiver15_r4.setRotationPoint(-3.8F, -37.5F, 1.0F);
		lower.addChild(receiver15_r4);
		setRotationAngle(receiver15_r4, 0.0F, 0.0F, -0.2618F);
		receiver15_r4.cubeList.add(new ModelBox(receiver15_r4, 380, 158, 0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

		receiver15_r5 = new ModelRenderer(this);
		receiver15_r5.setRotationPoint(-3.8F, -37.5F, 1.0F);
		lower.addChild(receiver15_r5);
		setRotationAngle(receiver15_r5, 0.0F, 0.0F, 0.4014F);
		receiver15_r5.cubeList.add(new ModelBox(receiver15_r5, 120, 387, -0.3917F, -2.2205F, 0.001F, 1, 1, 2, 0.0F, false));
		receiver15_r5.cubeList.add(new ModelBox(receiver15_r5, 148, 386, -0.3907F, -1.9205F, -0.001F, 2, 1, 2, 0.0F, false));

		gun30_r1 = new ModelRenderer(this);
		gun30_r1.setRotationPoint(-3.2F, -31.0F, -7.6F);
		lower.addChild(gun30_r1);
		setRotationAngle(gun30_r1, -2.3562F, 0.0F, 0.0F);
		gun30_r1.cubeList.add(new ModelBox(gun30_r1, 156, 386, 0.2F, -2.0F, -1.0F, 3, 2, 1, 0.0F, false));

		gun29_r1 = new ModelRenderer(this);
		gun29_r1.setRotationPoint(-3.2F, -27.0F, -7.6F);
		lower.addChild(gun29_r1);
		setRotationAngle(gun29_r1, -2.3562F, 0.0F, 0.0F);
		gun29_r1.cubeList.add(new ModelBox(gun29_r1, 262, 119, 0.2F, -1.0F, -2.0F, 3, 1, 2, 0.0F, false));

		gun28_r1 = new ModelRenderer(this);
		gun28_r1.setRotationPoint(-3.2F, -27.0F, -11.5F);
		lower.addChild(gun28_r1);
		setRotationAngle(gun28_r1, -2.3562F, 0.0F, 0.0F);
		gun28_r1.cubeList.add(new ModelBox(gun28_r1, 164, 386, 0.2F, 0.0F, 0.0F, 3, 2, 1, 0.0F, false));

		gun39_r1 = new ModelRenderer(this);
		gun39_r1.setRotationPoint(0.5F, -33.7F, -11.3F);
		lower.addChild(gun39_r1);
		setRotationAngle(gun39_r1, -0.3665F, 0.0F, 0.0F);
		gun39_r1.cubeList.add(new ModelBox(gun39_r1, 104, 392, -1.05F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		gun38_r1 = new ModelRenderer(this);
		gun38_r1.setRotationPoint(0.5F, -32.7F, -7.6F);
		lower.addChild(gun38_r1);
		setRotationAngle(gun38_r1, -0.3665F, 0.0F, 0.0F);
		gun38_r1.cubeList.add(new ModelBox(gun38_r1, 108, 392, -1.05F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		gun37_r1 = new ModelRenderer(this);
		gun37_r1.setRotationPoint(-3.4F, -33.0F, -4.2F);
		lower.addChild(gun37_r1);
		setRotationAngle(gun37_r1, -0.3665F, 0.0F, 0.0F);
		gun37_r1.cubeList.add(new ModelBox(gun37_r1, 340, 139, 0.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun37_r2 = new ModelRenderer(this);
		gun37_r2.setRotationPoint(-2.6F, -34.7F, -0.6F);
		lower.addChild(gun37_r2);
		setRotationAngle(gun37_r2, -0.3665F, 0.0F, 0.0F);
		gun37_r2.cubeList.add(new ModelBox(gun37_r2, 348, 139, 0.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));
		gun37_r2.cubeList.add(new ModelBox(gun37_r2, 356, 139, -0.8F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun51_r1 = new ModelRenderer(this);
		gun51_r1.setRotationPoint(-3.9F, -27.5F, -21.2F);
		lower.addChild(gun51_r1);
		setRotationAngle(gun51_r1, 1.3756F, 0.0F, 0.0F);
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 164, 221, 0.1F, 0.0806F, 0.0981F, 4, 8, 1, 0.0F, false));
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 214, 130, 0.101F, -0.4194F, 0.098F, 4, 1, 1, 0.0F, false));
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 44, 286, 3.7F, 0.08F, 0.098F, 1, 8, 1, 0.0F, false));
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 112, 392, 3.699F, -0.42F, 0.1F, 1, 1, 1, 0.0F, false));

		gun53_r1 = new ModelRenderer(this);
		gun53_r1.setRotationPoint(-3.5F, -32.0F, -11.2F);
		lower.addChild(gun53_r1);
		setRotationAngle(gun53_r1, -2.7884F, 0.0F, 0.0F);
		gun53_r1.cubeList.add(new ModelBox(gun53_r1, 380, 265, 2.999F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun58_r1 = new ModelRenderer(this);
		gun58_r1.setRotationPoint(-3.5F, -34.5F, -22.7F);
		lower.addChild(gun58_r1);
		setRotationAngle(gun58_r1, 0.9082F, 0.0F, 0.0F);
		gun58_r1.cubeList.add(new ModelBox(gun58_r1, 272, 119, -0.002F, -0.123F, 0.1577F, 4, 2, 1, 0.0F, false));

		gun63_r1 = new ModelRenderer(this);
		gun63_r1.setRotationPoint(-2.0F, -30.2F, -8.95F);
		lower.addChild(gun63_r1);
		setRotationAngle(gun63_r1, -0.409F, 0.0F, 0.0F);
		gun63_r1.cubeList.add(new ModelBox(gun63_r1, 44, 295, 0.0F, -2.0F, 0.0F, 1, 4, 1, 0.0F, false));

		gun80_r1 = new ModelRenderer(this);
		gun80_r1.setRotationPoint(-3.8F, -31.3F, -14.7F);
		lower.addChild(gun80_r1);
		setRotationAngle(gun80_r1, 0.0F, 0.0F, -0.2603F);
		gun80_r1.cubeList.add(new ModelBox(gun80_r1, 292, 119, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun82_r1 = new ModelRenderer(this);
		gun82_r1.setRotationPoint(-3.8F, -34.3F, -14.7F);
		lower.addChild(gun82_r1);
		setRotationAngle(gun82_r1, 0.0F, 0.7436F, 0.0F);
		gun82_r1.cubeList.add(new ModelBox(gun82_r1, 132, 304, 0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

		gun152_r1 = new ModelRenderer(this);
		gun152_r1.setRotationPoint(-0.7F, -33.5F, -4.7F);
		lower.addChild(gun152_r1);
		setRotationAngle(gun152_r1, 0.7854F, 0.0F, 0.0F);
		gun152_r1.cubeList.add(new ModelBox(gun152_r1, 116, 392, 0.2F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun156_r1 = new ModelRenderer(this);
		gun156_r1.setRotationPoint(0.6F, -33.4F, -4.5F);
		lower.addChild(gun156_r1);
		setRotationAngle(gun156_r1, -1.5708F, 0.0F, 0.0F);
		gun156_r1.cubeList.add(new ModelBox(gun156_r1, 126, 387, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

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
		gun67.cubeList.add(new ModelBox(gun67, 0, 372, 0.001F, 0.0638F, -1.4959F, 3, 2, 5, 0.0F, false));
		gun67.cubeList.add(new ModelBox(gun67, 16, 372, 0.599F, 0.0638F, -1.4959F, 3, 2, 5, 0.0F, false));
		gun67.cubeList.add(new ModelBox(gun67, 192, 271, 0.299F, -0.7242F, -0.49F, 3, 2, 4, 0.0F, false));

		gun60 = new ModelRenderer(this);
		gun60.setRotationPoint(-0.4F, -35.6F, -22.1F);
		lower.addChild(gun60);
		setRotationAngle(gun60, -0.3316F, 0.0F, 0.0F);
		gun60.cubeList.add(new ModelBox(gun60, 120, 392, 0.0F, 0.0946F, 0.0326F, 1, 1, 1, 0.0F, false));
		gun60.cubeList.add(new ModelBox(gun60, 124, 392, -3.3F, 0.0946F, 0.0326F, 1, 1, 1, 0.0F, false));

		boltcatch = new ModelRenderer(this);
		boltcatch.setRotationPoint(0.25F, -0.1F, 0.6F);
		lower.addChild(boltcatch);
		boltcatch.cubeList.add(new ModelBox(boltcatch, 392, 69, -1.05F, -36.1F, -12.75F, 2, 1, 1, -0.2F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 392, 71, -1.05F, -35.5F, -12.75F, 2, 1, 1, -0.2F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 392, 91, -0.1F, -36.3F, -13.35F, 1, 2, 1, -0.2F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 144, 398, -0.05F, -34.5F, -13.351F, 1, 1, 1, -0.2F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 392, 73, -1.05F, -35.5F, -13.95F, 2, 1, 1, -0.2F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 392, 75, -1.05F, -36.1F, -13.95F, 2, 1, 1, -0.2F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 392, 94, 0.05F, -37.725F, -13.351F, 1, 2, 1, -0.25F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 156, 398, 0.05F, -37.0785F, -12.9974F, 1, 1, 1, -0.25F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 398, 156, 0.05F, -37.3714F, -12.9974F, 1, 1, 1, -0.25F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 160, 398, 0.05F, -37.0785F, -13.7045F, 1, 1, 1, -0.25F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 398, 160, 0.05F, -37.3714F, -13.7045F, 1, 1, 1, -0.25F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 164, 398, -3.95F, -33.9F, -13.6F, 1, 1, 1, 0.0F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 398, 164, -3.95F, -33.2F, -13.6F, 1, 1, 1, 0.0F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 398, 176, -0.15F, -32.7F, -16.2F, 1, 1, 1, -0.3F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 398, 178, -0.15F, -32.7F, -16.6F, 1, 1, 1, -0.3F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 180, 398, -0.15F, -32.7F, -17.0F, 1, 1, 1, -0.3F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 180, 398, -0.15F, -34.1F, -17.0F, 1, 1, 1, -0.3F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 398, 166, -0.15F, -34.1F, -16.6F, 1, 1, 1, -0.3F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 168, 398, -0.15F, -34.1F, -16.2F, 1, 1, 1, -0.3F, false));

		gun_r1 = new ModelRenderer(this);
		gun_r1.setRotationPoint(0.55F, -37.1214F, -13.101F);
		boltcatch.addChild(gun_r1);
		setRotationAngle(gun_r1, -0.7854F, 0.0F, 0.0F);
		gun_r1.cubeList.add(new ModelBox(gun_r1, 398, 162, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.25F, false));

		gun_r2 = new ModelRenderer(this);
		gun_r2.setRotationPoint(0.55F, -37.1214F, -12.601F);
		boltcatch.addChild(gun_r2);
		setRotationAngle(gun_r2, -0.7854F, 0.0F, 0.0F);
		gun_r2.cubeList.add(new ModelBox(gun_r2, 398, 158, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.25F, false));

		gun_r3 = new ModelRenderer(this);
		gun_r3.setRotationPoint(0.55F, -36.3285F, -12.601F);
		boltcatch.addChild(gun_r3);
		setRotationAngle(gun_r3, -0.7854F, 0.0F, 0.0F);
		gun_r3.cubeList.add(new ModelBox(gun_r3, 152, 398, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.25F, false));

		gun_r4 = new ModelRenderer(this);
		gun_r4.setRotationPoint(0.55F, -36.3285F, -13.101F);
		boltcatch.addChild(gun_r4);
		setRotationAngle(gun_r4, -0.7854F, 0.0F, 0.0F);
		gun_r4.cubeList.add(new ModelBox(gun_r4, 148, 398, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.25F, false));

		gun_r5 = new ModelRenderer(this);
		gun_r5.setRotationPoint(0.09F, -33.9017F, -12.85F);
		boltcatch.addChild(gun_r5);
		setRotationAngle(gun_r5, 0.0F, 0.0F, 0.4363F);
		gun_r5.cubeList.add(new ModelBox(gun_r5, 140, 398, -0.5F, -1.0F, -0.5F, 1, 1, 1, -0.2F, false));
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