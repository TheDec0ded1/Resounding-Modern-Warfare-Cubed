package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M16Lower extends ModelBase {
	private final ModelRenderer lowerpartial;
	private final ModelRenderer receiver16_r15;
	private final ModelRenderer receiver15_r17;
	private final ModelRenderer receiver16_r16;
	private final ModelRenderer receiver15_r18;
	private final ModelRenderer receiver14_r30;
	private final ModelRenderer receiver14_r31;
	private final ModelRenderer receiver17_r11;
	private final ModelRenderer receiver16_r17;
	private final ModelRenderer receiver15_r19;
	private final ModelRenderer receiver15_r20;
	private final ModelRenderer gun30_r3;
	private final ModelRenderer gun29_r3;
	private final ModelRenderer gun28_r3;
	private final ModelRenderer gun39_r3;
	private final ModelRenderer gun38_r3;
	private final ModelRenderer gun37_r5;
	private final ModelRenderer gun37_r6;
	private final ModelRenderer gun51_r3;
	private final ModelRenderer gun53_r3;
	private final ModelRenderer gun58_r3;
	private final ModelRenderer gun63_r3;
	private final ModelRenderer gun80_r2;
	private final ModelRenderer gun82_r2;
	private final ModelRenderer gun152_r3;
	private final ModelRenderer gun156_r3;
	private final ModelRenderer bone_r3;
	private final ModelRenderer gun9;
	private final ModelRenderer gun10;
	private final ModelRenderer gun11;
	private final ModelRenderer boltcatch3;
	private final ModelRenderer gun_r1;
	private final ModelRenderer gun_r2;
	private final ModelRenderer gun_r3;
	private final ModelRenderer gun_r4;
	private final ModelRenderer gun_r5;

	public M16Lower() {
		textureWidth = 672;
		textureHeight = 672;

		lowerpartial = new ModelRenderer(this);
		lowerpartial.setRotationPoint(0.0F, 24.0F, 0.0F);
		lowerpartial.cubeList.add(new ModelBox(lowerpartial, 382, 649, -0.35F, -32.5F, -16.5F, 1, 5, 2, 0.0F, false));
		lowerpartial.cubeList.add(new ModelBox(lowerpartial, 614, 659, -0.35F, -27.5F, -15.5F, 1, 1, 1, 0.0F, false));
		lowerpartial.cubeList.add(new ModelBox(lowerpartial, 210, 641, -3.8F, -35.3F, -21.4F, 1, 1, 9, 0.0F, false));
		lowerpartial.cubeList.add(new ModelBox(lowerpartial, 642, 95, -3.0F, -33.35F, -1.0F, 3, 1, 4, 0.0F, false));
		lowerpartial.cubeList.add(new ModelBox(lowerpartial, 552, 641, -3.3F, -36.0F, -1.001F, 3, 3, 4, 0.0F, false));
		lowerpartial.cubeList.add(new ModelBox(lowerpartial, 648, 140, -0.7F, -36.0F, -0.998F, 1, 3, 4, 0.0F, false));
		lowerpartial.cubeList.add(new ModelBox(lowerpartial, 502, 58, -3.501F, -35.7F, -22.7F, 4, 1, 2, 0.0F, false));
		lowerpartial.cubeList.add(new ModelBox(lowerpartial, 648, 61, -0.4F, -33.5F, -16.3F, 1, 1, 5, 0.0F, false));
		lowerpartial.cubeList.add(new ModelBox(lowerpartial, 652, 650, -0.35F, -36.0F, -16.5F, 1, 2, 2, 0.0F, false));
		lowerpartial.cubeList.add(new ModelBox(lowerpartial, 654, 400, -0.35F, -34.5F, -16.5F, 1, 1, 2, 0.0F, false));
		lowerpartial.cubeList.add(new ModelBox(lowerpartial, 648, 134, -3.5F, -36.0F, -13.2F, 4, 4, 2, 0.0F, false));
		lowerpartial.cubeList.add(new ModelBox(lowerpartial, 368, 627, -3.5F, -36.0F, -21.2F, 4, 8, 8, 0.0F, false));
		lowerpartial.cubeList.add(new ModelBox(lowerpartial, 528, 476, -3.5F, -28.0F, -18.2F, 4, 1, 5, 0.0F, false));
		lowerpartial.cubeList.add(new ModelBox(lowerpartial, 658, 644, -0.3F, -34.5F, -6.3F, 1, 1, 1, -0.3F, false));
		lowerpartial.cubeList.add(new ModelBox(lowerpartial, 650, 659, -0.3F, -34.5F, -2.8F, 1, 1, 1, -0.3F, false));
		lowerpartial.cubeList.add(new ModelBox(lowerpartial, 658, 646, -0.3F, -34.5F, -5.9F, 1, 1, 1, -0.3F, false));
		lowerpartial.cubeList.add(new ModelBox(lowerpartial, 658, 648, -0.3F, -34.5F, -2.4F, 1, 1, 1, -0.3F, false));
		lowerpartial.cubeList.add(new ModelBox(lowerpartial, 622, 608, -3.3F, -36.0F, -14.0F, 3, 5, 13, 0.0F, false));
		lowerpartial.cubeList.add(new ModelBox(lowerpartial, 312, 627, -0.7F, -36.0F, -14.0F, 1, 5, 13, 0.0F, false));
		lowerpartial.cubeList.add(new ModelBox(lowerpartial, 550, 648, -3.001F, -32.0F, -13.8F, 3, 5, 1, 0.0F, false));
		lowerpartial.cubeList.add(new ModelBox(lowerpartial, 538, 430, -3.001F, -27.0F, -13.3F, 3, 1, 7, 0.0F, false));
		lowerpartial.cubeList.add(new ModelBox(lowerpartial, 558, 648, -2.999F, -31.0F, -6.5F, 3, 5, 1, 0.0F, false));
		lowerpartial.cubeList.add(new ModelBox(lowerpartial, 500, 648, -2.6F, -40.401F, 1.0015F, 2, 5, 2, 0.0F, false));
		lowerpartial.cubeList.add(new ModelBox(lowerpartial, 652, 113, -3.8F, -38.5F, 1.0F, 2, 1, 2, 0.0F, false));
		lowerpartial.cubeList.add(new ModelBox(lowerpartial, 652, 116, -1.2F, -38.5F, 1.0012F, 2, 1, 2, 0.0F, false));
		lowerpartial.cubeList.add(new ModelBox(lowerpartial, 414, 649, -1.4F, -40.4F, 1.0025F, 1, 5, 2, 0.0F, false));

		receiver16_r15 = new ModelRenderer(this);
		receiver16_r15.setRotationPoint(-3.8F, -37.5F, 1.0F);
		lowerpartial.addChild(receiver16_r15);
		setRotationAngle(receiver16_r15, -0.925F, 0.0F, -0.2618F);
		receiver16_r15.cubeList.add(new ModelBox(receiver16_r15, 24, 653, 0.001F, -0.2F, 0.7F, 1, 2, 2, 0.0F, false));

		receiver15_r17 = new ModelRenderer(this);
		receiver15_r17.setRotationPoint(0.8F, -37.5F, 1.0F);
		lowerpartial.addChild(receiver15_r17);
		setRotationAngle(receiver15_r17, -0.925F, 0.0F, 0.2618F);
		receiver15_r17.cubeList.add(new ModelBox(receiver15_r17, 30, 653, -0.999F, -0.2F, 0.7F, 1, 2, 2, 0.0F, false));

		receiver16_r16 = new ModelRenderer(this);
		receiver16_r16.setRotationPoint(-3.37F, -35.9F, 0.0F);
		lowerpartial.addChild(receiver16_r16);
		setRotationAngle(receiver16_r16, 0.0F, 0.0F, -0.0524F);
		receiver16_r16.cubeList.add(new ModelBox(receiver16_r16, 420, 649, 0.0F, 0.0F, 0.001F, 1, 2, 3, 0.0F, false));

		receiver15_r18 = new ModelRenderer(this);
		receiver15_r18.setRotationPoint(0.37F, -35.9F, 0.0F);
		lowerpartial.addChild(receiver15_r18);
		setRotationAngle(receiver15_r18, 0.0F, 0.0F, 0.0524F);
		receiver15_r18.cubeList.add(new ModelBox(receiver15_r18, 428, 649, -1.0F, 0.0F, 0.001F, 1, 2, 3, 0.0F, false));

		receiver14_r30 = new ModelRenderer(this);
		receiver14_r30.setRotationPoint(0.8F, -37.5F, 1.0F);
		lowerpartial.addChild(receiver14_r30);
		setRotationAngle(receiver14_r30, 0.0F, 0.0F, 0.2618F);
		receiver14_r30.cubeList.add(new ModelBox(receiver14_r30, 234, 651, -2.0F, 0.0F, 0.0012F, 2, 2, 2, 0.0F, false));

		receiver14_r31 = new ModelRenderer(this);
		receiver14_r31.setRotationPoint(0.8F, -37.5F, 1.0F);
		lowerpartial.addChild(receiver14_r31);
		setRotationAngle(receiver14_r31, 0.0F, 0.0F, -0.4014F);
		receiver14_r31.cubeList.add(new ModelBox(receiver14_r31, 652, 119, -1.6083F, -2.2205F, 0.001F, 2, 1, 2, 0.0F, false));
		receiver14_r31.cubeList.add(new ModelBox(receiver14_r31, 654, 403, -0.6093F, -1.9205F, 0.0F, 1, 1, 2, 0.0F, false));

		receiver17_r11 = new ModelRenderer(this);
		receiver17_r11.setRotationPoint(-2.6F, -39.4F, 1.0F);
		lowerpartial.addChild(receiver17_r11);
		setRotationAngle(receiver17_r11, 0.0F, 0.0F, -0.8029F);
		receiver17_r11.cubeList.add(new ModelBox(receiver17_r11, 654, 406, -0.2806F, -0.6946F, 0.0F, 1, 1, 2, 0.0F, false));

		receiver16_r17 = new ModelRenderer(this);
		receiver16_r17.setRotationPoint(-0.4F, -39.4F, 1.0F);
		lowerpartial.addChild(receiver16_r17);
		setRotationAngle(receiver16_r17, 0.0F, 0.0F, 0.8029F);
		receiver16_r17.cubeList.add(new ModelBox(receiver16_r17, 654, 409, -0.7194F, -0.6946F, 0.0F, 1, 1, 2, 0.0F, false));

		receiver15_r19 = new ModelRenderer(this);
		receiver15_r19.setRotationPoint(-3.8F, -37.5F, 1.0F);
		lowerpartial.addChild(receiver15_r19);
		setRotationAngle(receiver15_r19, 0.0F, 0.0F, -0.2618F);
		receiver15_r19.cubeList.add(new ModelBox(receiver15_r19, 310, 651, 0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

		receiver15_r20 = new ModelRenderer(this);
		receiver15_r20.setRotationPoint(-3.8F, -37.5F, 1.0F);
		lowerpartial.addChild(receiver15_r20);
		setRotationAngle(receiver15_r20, 0.0F, 0.0F, 0.4014F);
		receiver15_r20.cubeList.add(new ModelBox(receiver15_r20, 654, 412, -0.3917F, -2.2205F, 0.001F, 1, 1, 2, 0.0F, false));
		receiver15_r20.cubeList.add(new ModelBox(receiver15_r20, 652, 212, -0.3907F, -1.9205F, -0.001F, 2, 1, 2, 0.0F, false));

		gun30_r3 = new ModelRenderer(this);
		gun30_r3.setRotationPoint(-3.2F, -31.0F, -7.6F);
		lowerpartial.addChild(gun30_r3);
		setRotationAngle(gun30_r3, -2.3562F, 0.0F, 0.0F);
		gun30_r3.cubeList.add(new ModelBox(gun30_r3, 652, 215, 0.2F, -2.0F, -1.0F, 3, 2, 1, 0.0F, false));

		gun29_r3 = new ModelRenderer(this);
		gun29_r3.setRotationPoint(-3.2F, -27.0F, -7.6F);
		lowerpartial.addChild(gun29_r3);
		setRotationAngle(gun29_r3, -2.3562F, 0.0F, 0.0F);
		gun29_r3.cubeList.add(new ModelBox(gun29_r3, 544, 58, 0.2F, -1.0F, -2.0F, 3, 1, 2, 0.0F, false));

		gun28_r3 = new ModelRenderer(this);
		gun28_r3.setRotationPoint(-3.2F, -27.0F, -11.5F);
		lowerpartial.addChild(gun28_r3);
		setRotationAngle(gun28_r3, -2.3562F, 0.0F, 0.0F);
		gun28_r3.cubeList.add(new ModelBox(gun28_r3, 652, 218, 0.2F, 0.0F, 0.0F, 3, 2, 1, 0.0F, false));

		gun39_r3 = new ModelRenderer(this);
		gun39_r3.setRotationPoint(0.5F, -33.7F, -11.3F);
		lowerpartial.addChild(gun39_r3);
		setRotationAngle(gun39_r3, -0.3665F, 0.0F, 0.0F);
		gun39_r3.cubeList.add(new ModelBox(gun39_r3, 658, 650, -1.05F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		gun38_r3 = new ModelRenderer(this);
		gun38_r3.setRotationPoint(0.5F, -32.7F, -7.6F);
		lowerpartial.addChild(gun38_r3);
		setRotationAngle(gun38_r3, -0.3665F, 0.0F, 0.0F);
		gun38_r3.cubeList.add(new ModelBox(gun38_r3, 658, 652, -1.05F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		gun37_r5 = new ModelRenderer(this);
		gun37_r5.setRotationPoint(-3.4F, -33.0F, -4.2F);
		lowerpartial.addChild(gun37_r5);
		setRotationAngle(gun37_r5, -0.3665F, 0.0F, 0.0F);
		gun37_r5.cubeList.add(new ModelBox(gun37_r5, 200, 606, 0.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun37_r6 = new ModelRenderer(this);
		gun37_r6.setRotationPoint(-2.6F, -34.7F, -0.6F);
		lowerpartial.addChild(gun37_r6);
		setRotationAngle(gun37_r6, -0.3665F, 0.0F, 0.0F);
		gun37_r6.cubeList.add(new ModelBox(gun37_r6, 208, 606, 0.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));
		gun37_r6.cubeList.add(new ModelBox(gun37_r6, 462, 606, -0.8F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun51_r3 = new ModelRenderer(this);
		gun51_r3.setRotationPoint(-3.9F, -27.5F, -21.2F);
		lowerpartial.addChild(gun51_r3);
		setRotationAngle(gun51_r3, 1.3756F, 0.0F, 0.0F);
		gun51_r3.cubeList.add(new ModelBox(gun51_r3, 164, 642, 0.1F, 0.0806F, 0.0981F, 4, 8, 1, 0.0F, false));
		gun51_r3.cubeList.add(new ModelBox(gun51_r3, 576, 551, 0.101F, -0.4194F, 0.098F, 4, 1, 1, 0.0F, false));
		gun51_r3.cubeList.add(new ModelBox(gun51_r3, 306, 646, 3.7F, 0.08F, 0.098F, 1, 8, 1, 0.0F, false));
		gun51_r3.cubeList.add(new ModelBox(gun51_r3, 18, 659, 3.699F, -0.42F, 0.1F, 1, 1, 1, 0.0F, false));

		gun53_r3 = new ModelRenderer(this);
		gun53_r3.setRotationPoint(-3.5F, -32.0F, -11.2F);
		lowerpartial.addChild(gun53_r3);
		setRotationAngle(gun53_r3, -2.7884F, 0.0F, 0.0F);
		gun53_r3.cubeList.add(new ModelBox(gun53_r3, 318, 651, 2.999F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun58_r3 = new ModelRenderer(this);
		gun58_r3.setRotationPoint(-3.5F, -34.5F, -22.7F);
		lowerpartial.addChild(gun58_r3);
		setRotationAngle(gun58_r3, 0.9082F, 0.0F, 0.0F);
		gun58_r3.cubeList.add(new ModelBox(gun58_r3, 550, 217, -0.002F, -0.123F, 0.1577F, 4, 2, 1, 0.0F, false));

		gun63_r3 = new ModelRenderer(this);
		gun63_r3.setRotationPoint(-2.0F, -30.2F, -8.95F);
		lowerpartial.addChild(gun63_r3);
		setRotationAngle(gun63_r3, -0.409F, 0.0F, 0.0F);
		gun63_r3.cubeList.add(new ModelBox(gun63_r3, 186, 642, 0.0F, -2.0F, 0.0F, 1, 4, 1, 0.0F, false));

		gun80_r2 = new ModelRenderer(this);
		gun80_r2.setRotationPoint(-3.8F, -31.3F, -14.7F);
		lowerpartial.addChild(gun80_r2);
		setRotationAngle(gun80_r2, 0.0F, 0.0F, -0.2603F);
		

		gun82_r2 = new ModelRenderer(this);
		gun82_r2.setRotationPoint(-3.8F, -34.3F, -14.7F);
		lowerpartial.addChild(gun82_r2);
		setRotationAngle(gun82_r2, 0.0F, 0.7436F, 0.0F);
		

		gun152_r3 = new ModelRenderer(this);
		gun152_r3.setRotationPoint(-0.7F, -33.5F, -4.7F);
		lowerpartial.addChild(gun152_r3);
		setRotationAngle(gun152_r3, 0.7854F, 0.0F, 0.0F);
		gun152_r3.cubeList.add(new ModelBox(gun152_r3, 76, 659, 0.2F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun156_r3 = new ModelRenderer(this);
		gun156_r3.setRotationPoint(0.6F, -33.4F, -4.5F);
		lowerpartial.addChild(gun156_r3);
		setRotationAngle(gun156_r3, -1.5708F, 0.0F, 0.0F);
		gun156_r3.cubeList.add(new ModelBox(gun156_r3, 654, 415, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		bone_r3 = new ModelRenderer(this);
		bone_r3.setRotationPoint(0.2F, -32.8F, -16.5F);
		lowerpartial.addChild(bone_r3);
		setRotationAngle(bone_r3, 0.0F, 0.0F, 0.7854F);
		

		gun9 = new ModelRenderer(this);
		gun9.setRotationPoint(-0.15F, -36.2F, -12.8F);
		lowerpartial.addChild(gun9);
		setRotationAngle(gun9, 0.0F, 0.0F, -1.2641F);
		

		gun10 = new ModelRenderer(this);
		gun10.setRotationPoint(-3.3F, -33.5F, 1.5F);
		lowerpartial.addChild(gun10);
		setRotationAngle(gun10, -2.3423F, 0.0F, 0.0F);
		gun10.cubeList.add(new ModelBox(gun10, 492, 641, 0.001F, 0.0638F, -1.4959F, 3, 2, 5, 0.0F, false));
		gun10.cubeList.add(new ModelBox(gun10, 508, 641, 0.599F, 0.0638F, -1.4959F, 3, 2, 5, 0.0F, false));
		gun10.cubeList.add(new ModelBox(gun10, 594, 641, 0.299F, -0.7242F, -0.49F, 3, 2, 4, 0.0F, false));

		gun11 = new ModelRenderer(this);
		gun11.setRotationPoint(-0.4F, -35.6F, -22.1F);
		lowerpartial.addChild(gun11);
		setRotationAngle(gun11, -0.3316F, 0.0F, 0.0F);
		gun11.cubeList.add(new ModelBox(gun11, 80, 659, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun11.cubeList.add(new ModelBox(gun11, 84, 659, -3.3F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		boltcatch3 = new ModelRenderer(this);
		boltcatch3.setRotationPoint(0.25F, -0.1F, 0.6F);
		lowerpartial.addChild(boltcatch3);
		boltcatch3.cubeList.add(new ModelBox(boltcatch3, 656, 20, -1.05F, -36.1F, -12.75F, 2, 1, 1, -0.2F, false));
		boltcatch3.cubeList.add(new ModelBox(boltcatch3, 60, 656, -1.05F, -35.5F, -12.75F, 2, 1, 1, -0.2F, false));
		boltcatch3.cubeList.add(new ModelBox(boltcatch3, 278, 657, -0.1F, -36.3F, -13.35F, 1, 2, 1, -0.2F, false));
		boltcatch3.cubeList.add(new ModelBox(boltcatch3, 562, 659, -0.05F, -34.5F, -13.351F, 1, 1, 1, -0.2F, false));
		boltcatch3.cubeList.add(new ModelBox(boltcatch3, 66, 656, -1.05F, -35.5F, -13.95F, 2, 1, 1, -0.2F, false));
		boltcatch3.cubeList.add(new ModelBox(boltcatch3, 72, 656, -1.05F, -36.1F, -13.95F, 2, 1, 1, -0.2F, false));
		boltcatch3.cubeList.add(new ModelBox(boltcatch3, 282, 657, 0.05F, -37.725F, -13.351F, 1, 2, 1, -0.25F, false));
		boltcatch3.cubeList.add(new ModelBox(boltcatch3, 574, 659, 0.05F, -37.0785F, -12.9974F, 1, 1, 1, -0.25F, false));
		boltcatch3.cubeList.add(new ModelBox(boltcatch3, 578, 659, 0.05F, -37.3714F, -12.9974F, 1, 1, 1, -0.25F, false));
		boltcatch3.cubeList.add(new ModelBox(boltcatch3, 586, 659, 0.05F, -37.0785F, -13.7045F, 1, 1, 1, -0.25F, false));
		boltcatch3.cubeList.add(new ModelBox(boltcatch3, 590, 659, 0.05F, -37.3714F, -13.7045F, 1, 1, 1, -0.25F, false));
		boltcatch3.cubeList.add(new ModelBox(boltcatch3, 598, 659, -3.95F, -33.9F, -13.6F, 1, 1, 1, 0.0F, false));
		boltcatch3.cubeList.add(new ModelBox(boltcatch3, 602, 659, -3.95F, -33.2F, -13.6F, 1, 1, 1, 0.0F, false));
		boltcatch3.cubeList.add(new ModelBox(boltcatch3, 660, 24, -0.15F, -32.7F, -16.2F, 1, 1, 1, -0.3F, false));
		boltcatch3.cubeList.add(new ModelBox(boltcatch3, 26, 660, -0.15F, -32.7F, -16.6F, 1, 1, 1, -0.3F, false));
		boltcatch3.cubeList.add(new ModelBox(boltcatch3, 34, 660, -0.15F, -32.7F, -17.0F, 1, 1, 1, -0.3F, false));
		boltcatch3.cubeList.add(new ModelBox(boltcatch3, 30, 660, -0.15F, -34.1F, -17.0F, 1, 1, 1, -0.3F, false));
		boltcatch3.cubeList.add(new ModelBox(boltcatch3, 606, 659, -0.15F, -34.1F, -16.6F, 1, 1, 1, -0.3F, false));
		boltcatch3.cubeList.add(new ModelBox(boltcatch3, 610, 659, -0.15F, -34.1F, -16.2F, 1, 1, 1, -0.3F, false));

		gun_r1 = new ModelRenderer(this);
		gun_r1.setRotationPoint(0.55F, -37.1214F, -13.101F);
		boltcatch3.addChild(gun_r1);
		setRotationAngle(gun_r1, -0.7854F, 0.0F, 0.0F);
		gun_r1.cubeList.add(new ModelBox(gun_r1, 594, 659, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.25F, false));

		gun_r2 = new ModelRenderer(this);
		gun_r2.setRotationPoint(0.55F, -37.1214F, -12.601F);
		boltcatch3.addChild(gun_r2);
		setRotationAngle(gun_r2, -0.7854F, 0.0F, 0.0F);
		gun_r2.cubeList.add(new ModelBox(gun_r2, 582, 659, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.25F, false));

		gun_r3 = new ModelRenderer(this);
		gun_r3.setRotationPoint(0.55F, -36.3285F, -12.601F);
		boltcatch3.addChild(gun_r3);
		setRotationAngle(gun_r3, -0.7854F, 0.0F, 0.0F);
		gun_r3.cubeList.add(new ModelBox(gun_r3, 570, 659, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.25F, false));

		gun_r4 = new ModelRenderer(this);
		gun_r4.setRotationPoint(0.55F, -36.3285F, -13.101F);
		boltcatch3.addChild(gun_r4);
		setRotationAngle(gun_r4, -0.7854F, 0.0F, 0.0F);
		gun_r4.cubeList.add(new ModelBox(gun_r4, 566, 659, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.25F, false));

		gun_r5 = new ModelRenderer(this);
		gun_r5.setRotationPoint(0.09F, -33.9017F, -12.85F);
		boltcatch3.addChild(gun_r5);
		setRotationAngle(gun_r5, 0.0F, 0.0F, 0.4363F);
		gun_r5.cubeList.add(new ModelBox(gun_r5, 558, 659, -0.5F, -1.0F, -0.5F, 1, 1, 1, -0.2F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		lowerpartial.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}