package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class XM16Lower extends ModelBase {
	private final ModelRenderer lowerslabside;
	private final ModelRenderer receiver16_r11;
	private final ModelRenderer receiver15_r11;
	private final ModelRenderer receiver16_r12;
	private final ModelRenderer receiver15_r12;
	private final ModelRenderer receiver14_r20;
	private final ModelRenderer receiver14_r21;
	private final ModelRenderer receiver17_r8;
	private final ModelRenderer receiver16_r13;
	private final ModelRenderer receiver15_r13;
	private final ModelRenderer receiver15_r14;
	private final ModelRenderer gun30_r2;
	private final ModelRenderer gun29_r2;
	private final ModelRenderer gun28_r2;
	private final ModelRenderer gun39_r2;
	private final ModelRenderer gun38_r2;
	private final ModelRenderer gun37_r3;
	private final ModelRenderer gun37_r4;
	private final ModelRenderer gun51_r2;
	private final ModelRenderer gun53_r2;
	private final ModelRenderer gun58_r2;
	private final ModelRenderer gun63_r2;
	private final ModelRenderer gun152_r2;
	private final ModelRenderer gun156_r2;
	private final ModelRenderer bone_r2;
	private final ModelRenderer gun4;
	private final ModelRenderer gun5;
	private final ModelRenderer gun6;
	private final ModelRenderer boltcatch2;
	private final ModelRenderer gun_r1;
	private final ModelRenderer gun_r2;
	private final ModelRenderer gun_r3;
	private final ModelRenderer gun_r4;
	private final ModelRenderer gun_r5;

	public XM16Lower() {
		textureWidth = 672;
		textureHeight = 672;

		lowerslabside = new ModelRenderer(this);
		lowerslabside.setRotationPoint(0.0F, 24.0F, 0.0F);
		lowerslabside.cubeList.add(new ModelBox(lowerslabside, 184, 648, -0.35F, -32.5F, -16.5F, 1, 5, 2, 0.0F, false));
		lowerslabside.cubeList.add(new ModelBox(lowerslabside, 554, 659, -0.35F, -27.5F, -15.5F, 1, 1, 1, 0.0F, false));
		lowerslabside.cubeList.add(new ModelBox(lowerslabside, 642, 81, -3.0F, -33.35F, -1.0F, 3, 1, 4, 0.0F, false));
		lowerslabside.cubeList.add(new ModelBox(lowerslabside, 538, 641, -3.3F, -36.0F, -1.001F, 3, 3, 4, 0.0F, false));
		lowerslabside.cubeList.add(new ModelBox(lowerslabside, 450, 643, -0.7F, -36.0F, -0.998F, 1, 3, 4, 0.0F, false));
		lowerslabside.cubeList.add(new ModelBox(lowerslabside, 486, 311, -3.501F, -35.7F, -22.7F, 4, 1, 2, 0.0F, false));
		lowerslabside.cubeList.add(new ModelBox(lowerslabside, 646, 467, -0.4F, -33.5F, -16.3F, 1, 1, 5, 0.0F, false));
		lowerslabside.cubeList.add(new ModelBox(lowerslabside, 652, 503, -0.35F, -36.0F, -16.5F, 1, 2, 2, 0.0F, false));
		lowerslabside.cubeList.add(new ModelBox(lowerslabside, 340, 654, -0.35F, -34.5F, -16.5F, 1, 1, 2, 0.0F, false));
		lowerslabside.cubeList.add(new ModelBox(lowerslabside, 608, 646, -3.5F, -36.0F, -13.2F, 4, 4, 2, 0.0F, false));
		lowerslabside.cubeList.add(new ModelBox(lowerslabside, 120, 625, -3.5F, -36.0F, -21.2F, 4, 8, 8, 0.0F, false));
		lowerslabside.cubeList.add(new ModelBox(lowerslabside, 510, 476, -3.5F, -28.0F, -18.2F, 4, 1, 5, 0.0F, false));
		lowerslabside.cubeList.add(new ModelBox(lowerslabside, 658, 238, -0.3F, -34.5F, -6.3F, 1, 1, 1, -0.3F, false));
		lowerslabside.cubeList.add(new ModelBox(lowerslabside, 638, 659, -0.3F, -34.5F, -2.8F, 1, 1, 1, -0.3F, false));
		lowerslabside.cubeList.add(new ModelBox(lowerslabside, 658, 262, -0.3F, -34.5F, -5.9F, 1, 1, 1, -0.3F, false));
		lowerslabside.cubeList.add(new ModelBox(lowerslabside, 658, 264, -0.3F, -34.5F, -2.4F, 1, 1, 1, -0.3F, false));
		lowerslabside.cubeList.add(new ModelBox(lowerslabside, 618, 0, -3.3F, -36.0F, -14.0F, 3, 5, 13, 0.0F, false));
		lowerslabside.cubeList.add(new ModelBox(lowerslabside, 622, 626, -0.7F, -36.0F, -14.0F, 1, 5, 13, 0.0F, false));
		lowerslabside.cubeList.add(new ModelBox(lowerslabside, 542, 648, -3.001F, -32.0F, -13.8F, 3, 5, 1, 0.0F, false));
		lowerslabside.cubeList.add(new ModelBox(lowerslabside, 518, 430, -3.001F, -27.0F, -13.3F, 3, 1, 7, 0.0F, false));
		lowerslabside.cubeList.add(new ModelBox(lowerslabside, 648, 544, -2.999F, -31.0F, -6.5F, 3, 5, 1, 0.0F, false));
		lowerslabside.cubeList.add(new ModelBox(lowerslabside, 648, 473, -2.6F, -40.401F, 1.0015F, 2, 5, 2, 0.0F, false));
		lowerslabside.cubeList.add(new ModelBox(lowerslabside, 652, 44, -3.8F, -38.5F, 1.0F, 2, 1, 2, 0.0F, false));
		lowerslabside.cubeList.add(new ModelBox(lowerslabside, 652, 86, -1.2F, -38.5F, 1.0012F, 2, 1, 2, 0.0F, false));
		lowerslabside.cubeList.add(new ModelBox(lowerslabside, 18, 649, -1.4F, -40.4F, 1.0025F, 1, 5, 2, 0.0F, false));

		receiver16_r11 = new ModelRenderer(this);
		receiver16_r11.setRotationPoint(-3.8F, -37.5F, 1.0F);
		lowerslabside.addChild(receiver16_r11);
		setRotationAngle(receiver16_r11, -0.925F, 0.0F, -0.2618F);
		receiver16_r11.cubeList.add(new ModelBox(receiver16_r11, 652, 507, 0.001F, -0.2F, 0.7F, 1, 2, 2, 0.0F, false));

		receiver15_r11 = new ModelRenderer(this);
		receiver15_r11.setRotationPoint(0.8F, -37.5F, 1.0F);
		lowerslabside.addChild(receiver15_r11);
		setRotationAngle(receiver15_r11, -0.925F, 0.0F, 0.2618F);
		receiver15_r11.cubeList.add(new ModelBox(receiver15_r11, 652, 511, -0.999F, -0.2F, 0.7F, 1, 2, 2, 0.0F, false));

		receiver16_r12 = new ModelRenderer(this);
		receiver16_r12.setRotationPoint(-3.37F, -35.9F, 0.0F);
		lowerslabside.addChild(receiver16_r12);
		setRotationAngle(receiver16_r12, 0.0F, 0.0F, -0.0524F);
		receiver16_r12.cubeList.add(new ModelBox(receiver16_r12, 340, 649, 0.0F, 0.0F, 0.001F, 1, 2, 3, 0.0F, false));

		receiver15_r12 = new ModelRenderer(this);
		receiver15_r12.setRotationPoint(0.37F, -35.9F, 0.0F);
		lowerslabside.addChild(receiver15_r12);
		setRotationAngle(receiver15_r12, 0.0F, 0.0F, 0.0524F);
		receiver15_r12.cubeList.add(new ModelBox(receiver15_r12, 348, 649, -1.0F, 0.0F, 0.001F, 1, 2, 3, 0.0F, false));

		receiver14_r20 = new ModelRenderer(this);
		receiver14_r20.setRotationPoint(0.8F, -37.5F, 1.0F);
		lowerslabside.addChild(receiver14_r20);
		setRotationAngle(receiver14_r20, 0.0F, 0.0F, 0.2618F);
		receiver14_r20.cubeList.add(new ModelBox(receiver14_r20, 164, 651, -2.0F, 0.0F, 0.0012F, 2, 2, 2, 0.0F, false));

		receiver14_r21 = new ModelRenderer(this);
		receiver14_r21.setRotationPoint(0.8F, -37.5F, 1.0F);
		lowerslabside.addChild(receiver14_r21);
		setRotationAngle(receiver14_r21, 0.0F, 0.0F, -0.4014F);
		receiver14_r21.cubeList.add(new ModelBox(receiver14_r21, 652, 89, -1.6083F, -2.2205F, 0.001F, 2, 1, 2, 0.0F, false));
		receiver14_r21.cubeList.add(new ModelBox(receiver14_r21, 654, 340, -0.6093F, -1.9205F, 0.0F, 1, 1, 2, 0.0F, false));

		receiver17_r8 = new ModelRenderer(this);
		receiver17_r8.setRotationPoint(-2.6F, -39.4F, 1.0F);
		lowerslabside.addChild(receiver17_r8);
		setRotationAngle(receiver17_r8, 0.0F, 0.0F, -0.8029F);
		receiver17_r8.cubeList.add(new ModelBox(receiver17_r8, 654, 343, -0.2806F, -0.6946F, 0.0F, 1, 1, 2, 0.0F, false));

		receiver16_r13 = new ModelRenderer(this);
		receiver16_r13.setRotationPoint(-0.4F, -39.4F, 1.0F);
		lowerslabside.addChild(receiver16_r13);
		setRotationAngle(receiver16_r13, 0.0F, 0.0F, 0.8029F);
		receiver16_r13.cubeList.add(new ModelBox(receiver16_r13, 346, 654, -0.7194F, -0.6946F, 0.0F, 1, 1, 2, 0.0F, false));

		receiver15_r13 = new ModelRenderer(this);
		receiver15_r13.setRotationPoint(-3.8F, -37.5F, 1.0F);
		lowerslabside.addChild(receiver15_r13);
		setRotationAngle(receiver15_r13, 0.0F, 0.0F, -0.2618F);
		receiver15_r13.cubeList.add(new ModelBox(receiver15_r13, 190, 651, 0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

		receiver15_r14 = new ModelRenderer(this);
		receiver15_r14.setRotationPoint(-3.8F, -37.5F, 1.0F);
		lowerslabside.addChild(receiver15_r14);
		setRotationAngle(receiver15_r14, 0.0F, 0.0F, 0.4014F);
		receiver15_r14.cubeList.add(new ModelBox(receiver15_r14, 654, 346, -0.3917F, -2.2205F, 0.001F, 1, 1, 2, 0.0F, false));
		receiver15_r14.cubeList.add(new ModelBox(receiver15_r14, 652, 92, -0.3907F, -1.9205F, -0.001F, 2, 1, 2, 0.0F, false));

		gun30_r2 = new ModelRenderer(this);
		gun30_r2.setRotationPoint(-3.2F, -31.0F, -7.6F);
		lowerslabside.addChild(gun30_r2);
		setRotationAngle(gun30_r2, -2.3562F, 0.0F, 0.0F);
		gun30_r2.cubeList.add(new ModelBox(gun30_r2, 652, 104, 0.2F, -2.0F, -1.0F, 3, 2, 1, 0.0F, false));

		gun29_r2 = new ModelRenderer(this);
		gun29_r2.setRotationPoint(-3.2F, -27.0F, -7.6F);
		lowerslabside.addChild(gun29_r2);
		setRotationAngle(gun29_r2, -2.3562F, 0.0F, 0.0F);
		gun29_r2.cubeList.add(new ModelBox(gun29_r2, 524, 58, 0.2F, -1.0F, -2.0F, 3, 1, 2, 0.0F, false));

		gun28_r2 = new ModelRenderer(this);
		gun28_r2.setRotationPoint(-3.2F, -27.0F, -11.5F);
		lowerslabside.addChild(gun28_r2);
		setRotationAngle(gun28_r2, -2.3562F, 0.0F, 0.0F);
		gun28_r2.cubeList.add(new ModelBox(gun28_r2, 652, 107, 0.2F, 0.0F, 0.0F, 3, 2, 1, 0.0F, false));

		gun39_r2 = new ModelRenderer(this);
		gun39_r2.setRotationPoint(0.5F, -33.7F, -11.3F);
		lowerslabside.addChild(gun39_r2);
		setRotationAngle(gun39_r2, -0.3665F, 0.0F, 0.0F);
		gun39_r2.cubeList.add(new ModelBox(gun39_r2, 658, 266, -1.05F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		gun38_r2 = new ModelRenderer(this);
		gun38_r2.setRotationPoint(0.5F, -32.7F, -7.6F);
		lowerslabside.addChild(gun38_r2);
		setRotationAngle(gun38_r2, -0.3665F, 0.0F, 0.0F);
		gun38_r2.cubeList.add(new ModelBox(gun38_r2, 658, 268, -1.05F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		gun37_r3 = new ModelRenderer(this);
		gun37_r3.setRotationPoint(-3.4F, -33.0F, -4.2F);
		lowerslabside.addChild(gun37_r3);
		setRotationAngle(gun37_r3, -0.3665F, 0.0F, 0.0F);
		gun37_r3.cubeList.add(new ModelBox(gun37_r3, 152, 604, 0.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun37_r4 = new ModelRenderer(this);
		gun37_r4.setRotationPoint(-2.6F, -34.7F, -0.6F);
		lowerslabside.addChild(gun37_r4);
		setRotationAngle(gun37_r4, -0.3665F, 0.0F, 0.0F);
		gun37_r4.cubeList.add(new ModelBox(gun37_r4, 160, 604, 0.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));
		gun37_r4.cubeList.add(new ModelBox(gun37_r4, 192, 606, -0.8F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun51_r2 = new ModelRenderer(this);
		gun51_r2.setRotationPoint(-3.9F, -27.5F, -21.2F);
		lowerslabside.addChild(gun51_r2);
		setRotationAngle(gun51_r2, 1.3756F, 0.0F, 0.0F);
		gun51_r2.cubeList.add(new ModelBox(gun51_r2, 642, 86, 0.1F, 0.0806F, 0.0981F, 4, 8, 1, 0.0F, false));
		gun51_r2.cubeList.add(new ModelBox(gun51_r2, 570, 217, 0.101F, -0.4194F, 0.098F, 4, 1, 1, 0.0F, false));
		gun51_r2.cubeList.add(new ModelBox(gun51_r2, 604, 49, 3.7F, 0.08F, 0.098F, 1, 8, 1, 0.0F, false));
		gun51_r2.cubeList.add(new ModelBox(gun51_r2, 658, 270, 3.699F, -0.42F, 0.1F, 1, 1, 1, 0.0F, false));

		gun53_r2 = new ModelRenderer(this);
		gun53_r2.setRotationPoint(-3.5F, -32.0F, -11.2F);
		lowerslabside.addChild(gun53_r2);
		setRotationAngle(gun53_r2, -2.7884F, 0.0F, 0.0F);
		gun53_r2.cubeList.add(new ModelBox(gun53_r2, 198, 651, 2.999F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun58_r2 = new ModelRenderer(this);
		gun58_r2.setRotationPoint(-3.5F, -34.5F, -22.7F);
		lowerslabside.addChild(gun58_r2);
		setRotationAngle(gun58_r2, 0.9082F, 0.0F, 0.0F);
		gun58_r2.cubeList.add(new ModelBox(gun58_r2, 534, 58, -0.002F, -0.123F, 0.1577F, 4, 2, 1, 0.0F, false));

		gun63_r2 = new ModelRenderer(this);
		gun63_r2.setRotationPoint(-2.0F, -30.2F, -8.95F);
		lowerslabside.addChild(gun63_r2);
		setRotationAngle(gun63_r2, -0.409F, 0.0F, 0.0F);
		gun63_r2.cubeList.add(new ModelBox(gun63_r2, 608, 214, 0.0F, -2.0F, 0.0F, 1, 4, 1, 0.0F, false));

		gun152_r2 = new ModelRenderer(this);
		gun152_r2.setRotationPoint(-0.7F, -33.5F, -4.7F);
		lowerslabside.addChild(gun152_r2);
		setRotationAngle(gun152_r2, 0.7854F, 0.0F, 0.0F);
		gun152_r2.cubeList.add(new ModelBox(gun152_r2, 658, 272, 0.2F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun156_r2 = new ModelRenderer(this);
		gun156_r2.setRotationPoint(0.6F, -33.4F, -4.5F);
		lowerslabside.addChild(gun156_r2);
		setRotationAngle(gun156_r2, -1.5708F, 0.0F, 0.0F);
		gun156_r2.cubeList.add(new ModelBox(gun156_r2, 654, 349, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		bone_r2 = new ModelRenderer(this);
		bone_r2.setRotationPoint(0.2F, -32.8F, -16.5F);
		lowerslabside.addChild(bone_r2);
		setRotationAngle(bone_r2, 0.0F, 0.0F, 0.7854F);
		

		gun4 = new ModelRenderer(this);
		gun4.setRotationPoint(-0.15F, -36.2F, -12.8F);
		lowerslabside.addChild(gun4);
		setRotationAngle(gun4, 0.0F, 0.0F, -1.2641F);
		

		gun5 = new ModelRenderer(this);
		gun5.setRotationPoint(-3.3F, -33.5F, 1.5F);
		lowerslabside.addChild(gun5);
		setRotationAngle(gun5, -2.3423F, 0.0F, 0.0F);
		gun5.cubeList.add(new ModelBox(gun5, 460, 641, 0.001F, 0.0638F, -1.4959F, 3, 2, 5, 0.0F, false));
		gun5.cubeList.add(new ModelBox(gun5, 476, 641, 0.599F, 0.0638F, -1.4959F, 3, 2, 5, 0.0F, false));
		gun5.cubeList.add(new ModelBox(gun5, 580, 641, 0.299F, -0.7242F, -0.49F, 3, 2, 4, 0.0F, false));

		gun6 = new ModelRenderer(this);
		gun6.setRotationPoint(-0.4F, -35.6F, -22.1F);
		lowerslabside.addChild(gun6);
		setRotationAngle(gun6, -0.3316F, 0.0F, 0.0F);
		gun6.cubeList.add(new ModelBox(gun6, 290, 658, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun6.cubeList.add(new ModelBox(gun6, 330, 658, -3.2F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		boltcatch2 = new ModelRenderer(this);
		boltcatch2.setRotationPoint(0.25F, -0.1F, 0.6F);
		lowerslabside.addChild(boltcatch2);
		boltcatch2.cubeList.add(new ModelBox(boltcatch2, 528, 655, -1.05F, -36.1F, -12.75F, 2, 1, 1, -0.2F, false));
		boltcatch2.cubeList.add(new ModelBox(boltcatch2, 14, 656, -1.05F, -35.5F, -12.75F, 2, 1, 1, -0.2F, false));
		boltcatch2.cubeList.add(new ModelBox(boltcatch2, 270, 657, -0.1F, -36.3F, -13.35F, 1, 2, 1, -0.2F, false));
		boltcatch2.cubeList.add(new ModelBox(boltcatch2, 502, 659, -0.05F, -34.5F, -13.351F, 1, 1, 1, -0.2F, false));
		boltcatch2.cubeList.add(new ModelBox(boltcatch2, 656, 16, -1.05F, -35.5F, -13.95F, 2, 1, 1, -0.2F, false));
		boltcatch2.cubeList.add(new ModelBox(boltcatch2, 656, 18, -1.05F, -36.1F, -13.95F, 2, 1, 1, -0.2F, false));
		boltcatch2.cubeList.add(new ModelBox(boltcatch2, 274, 657, 0.05F, -37.725F, -13.351F, 1, 2, 1, -0.25F, false));
		boltcatch2.cubeList.add(new ModelBox(boltcatch2, 514, 659, 0.05F, -37.0785F, -12.9974F, 1, 1, 1, -0.25F, false));
		boltcatch2.cubeList.add(new ModelBox(boltcatch2, 518, 659, 0.05F, -37.3714F, -12.9974F, 1, 1, 1, -0.25F, false));
		boltcatch2.cubeList.add(new ModelBox(boltcatch2, 526, 659, 0.05F, -37.0785F, -13.7045F, 1, 1, 1, -0.25F, false));
		boltcatch2.cubeList.add(new ModelBox(boltcatch2, 530, 659, 0.05F, -37.3714F, -13.7045F, 1, 1, 1, -0.25F, false));
		boltcatch2.cubeList.add(new ModelBox(boltcatch2, 538, 659, -3.95F, -33.9F, -13.6F, 1, 1, 1, 0.0F, false));
		boltcatch2.cubeList.add(new ModelBox(boltcatch2, 542, 659, -3.95F, -33.2F, -13.6F, 1, 1, 1, 0.0F, false));
		boltcatch2.cubeList.add(new ModelBox(boltcatch2, 22, 660, -0.15F, -32.7F, -16.2F, 1, 1, 1, -0.3F, false));
		boltcatch2.cubeList.add(new ModelBox(boltcatch2, 660, 22, -0.15F, -32.7F, -16.6F, 1, 1, 1, -0.3F, false));
		boltcatch2.cubeList.add(new ModelBox(boltcatch2, 660, 32, -0.15F, -32.7F, -17.0F, 1, 1, 1, -0.3F, false));
		boltcatch2.cubeList.add(new ModelBox(boltcatch2, 660, 28, -0.15F, -34.1F, -17.0F, 1, 1, 1, -0.3F, false));
		boltcatch2.cubeList.add(new ModelBox(boltcatch2, 546, 659, -0.15F, -34.1F, -16.6F, 1, 1, 1, -0.3F, false));
		boltcatch2.cubeList.add(new ModelBox(boltcatch2, 550, 659, -0.15F, -34.1F, -16.2F, 1, 1, 1, -0.3F, false));

		gun_r1 = new ModelRenderer(this);
		gun_r1.setRotationPoint(0.55F, -37.1214F, -13.101F);
		boltcatch2.addChild(gun_r1);
		setRotationAngle(gun_r1, -0.7854F, 0.0F, 0.0F);
		gun_r1.cubeList.add(new ModelBox(gun_r1, 534, 659, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.25F, false));

		gun_r2 = new ModelRenderer(this);
		gun_r2.setRotationPoint(0.55F, -37.1214F, -12.601F);
		boltcatch2.addChild(gun_r2);
		setRotationAngle(gun_r2, -0.7854F, 0.0F, 0.0F);
		gun_r2.cubeList.add(new ModelBox(gun_r2, 522, 659, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.25F, false));

		gun_r3 = new ModelRenderer(this);
		gun_r3.setRotationPoint(0.55F, -36.3285F, -12.601F);
		boltcatch2.addChild(gun_r3);
		setRotationAngle(gun_r3, -0.7854F, 0.0F, 0.0F);
		gun_r3.cubeList.add(new ModelBox(gun_r3, 510, 659, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.25F, false));

		gun_r4 = new ModelRenderer(this);
		gun_r4.setRotationPoint(0.55F, -36.3285F, -13.101F);
		boltcatch2.addChild(gun_r4);
		setRotationAngle(gun_r4, -0.7854F, 0.0F, 0.0F);
		gun_r4.cubeList.add(new ModelBox(gun_r4, 506, 659, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.25F, false));

		gun_r5 = new ModelRenderer(this);
		gun_r5.setRotationPoint(0.09F, -33.9017F, -12.85F);
		boltcatch2.addChild(gun_r5);
		setRotationAngle(gun_r5, 0.0F, 0.0F, 0.4363F);
		gun_r5.cubeList.add(new ModelBox(gun_r5, 498, 659, -0.5F, -1.0F, -0.5F, 1, 1, 1, -0.2F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		lowerslabside.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}