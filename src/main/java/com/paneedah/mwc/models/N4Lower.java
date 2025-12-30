package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class N4Lower extends ModelBase {
	private final ModelRenderer lower;
	private final ModelRenderer gun_r1;
	private final ModelRenderer gun_r2;
	private final ModelRenderer gun_r3;
	private final ModelRenderer gun_r4;
	private final ModelRenderer gun_r5;
	private final ModelRenderer gun_r6;
	private final ModelRenderer gun_r7;
	private final ModelRenderer boltcatch;
	private final ModelRenderer gun_r8;
	private final ModelRenderer gun_r9;
	private final ModelRenderer gun_r10;
	private final ModelRenderer gun_r11;
	private final ModelRenderer gun_r12;
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
	private final ModelRenderer gun53_r3_r1;
	private final ModelRenderer gun52_r2_r1;
	private final ModelRenderer gun52_r2_r2;
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

	public N4Lower() {
		textureWidth = 336;
		textureHeight = 336;

		lower = new ModelRenderer(this);
		lower.setRotationPoint(0.0F, 24.0F, 0.0F);
		lower.cubeList.add(new ModelBox(lower, 220, 317, -4.0F, -31.8F, -13.85F, 1, 1, 1, -0.2F, false));
		lower.cubeList.add(new ModelBox(lower, 106, 301, -4.0F, -31.8F, -13.35F, 1, 1, 4, -0.2F, false));
		lower.cubeList.add(new ModelBox(lower, 124, 310, -0.8F, -36.2F, -13.95F, 2, 2, 1, -0.2F, false));
		lower.cubeList.add(new ModelBox(lower, 130, 310, -0.8F, -35.4F, -13.95F, 2, 2, 1, -0.2F, false));
		lower.cubeList.add(new ModelBox(lower, 98, 312, -0.8F, -31.8F, -13.95F, 2, 1, 1, -0.2F, false));
		lower.cubeList.add(new ModelBox(lower, 148, 312, -0.8F, -32.4F, -13.95F, 2, 1, 1, -0.2F, false));
		lower.cubeList.add(new ModelBox(lower, 154, 312, -0.8F, -32.6F, -13.95F, 2, 1, 1, -0.2F, false));
		lower.cubeList.add(new ModelBox(lower, 174, 291, -0.8F, -31.8F, -13.35F, 2, 1, 4, -0.2F, false));
		lower.cubeList.add(new ModelBox(lower, 140, 310, -4.0F, -34.8F, -14.35F, 1, 4, 1, -0.2F, false));
		lower.cubeList.add(new ModelBox(lower, 314, 287, -4.0F, -34.5F, -14.95F, 1, 2, 1, -0.2F, false));
		lower.cubeList.add(new ModelBox(lower, 186, 270, -0.35F, -32.5F, -16.5F, 1, 5, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 294, 162, -3.8F, -36.0F, -21.4F, 1, 1, 10, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 294, 173, -3.8F, -35.3F, -21.4F, 1, 1, 10, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 294, 226, -3.0F, -33.35F, -1.0F, 3, 1, 4, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 304, 40, -3.3F, -36.0F, -1.001F, 3, 3, 4, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 134, 299, -0.7F, -36.0F, -0.998F, 1, 3, 4, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 208, 63, -3.501F, -35.7F, -22.7F, 4, 1, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 220, 63, -3.501F, -36.0F, -22.7F, 4, 1, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 148, 305, -0.4F, -33.5F, -16.3F, 1, 1, 3, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 118, 310, 0.0F, -33.5F, -13.3F, 1, 1, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 160, 316, -0.2F, -33.5F, -16.0F, 1, 1, 1, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 270, 296, -0.35F, -36.0F, -16.5F, 1, 2, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 8, 310, -0.35F, -34.5F, -16.5F, 1, 1, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 120, 175, -3.5F, -36.0F, -13.2F, 4, 5, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 96, 205, -3.5F, -36.0F, -21.2F, 4, 8, 8, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 264, 231, -3.5F, -28.0F, -17.2F, 4, 1, 4, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 88, 316, -0.3F, -34.5F, -6.3F, 1, 1, 1, -0.3F, false));
		lower.cubeList.add(new ModelBox(lower, 320, 139, -0.3F, -34.5F, -2.8F, 1, 1, 1, -0.3F, false));
		lower.cubeList.add(new ModelBox(lower, 92, 316, -0.3F, -34.5F, -5.9F, 1, 1, 1, -0.3F, false));
		lower.cubeList.add(new ModelBox(lower, 316, 158, 0.2F, -34.2F, -15.6F, 1, 1, 1, -0.3F, false));
		lower.cubeList.add(new ModelBox(lower, 316, 156, 0.2F, -34.2F, -16.0F, 1, 1, 1, -0.3F, false));
		lower.cubeList.add(new ModelBox(lower, 320, 153, 0.2F, -32.8F, -15.6F, 1, 1, 1, -0.3F, false));
		lower.cubeList.add(new ModelBox(lower, 152, 320, 0.2F, -32.8F, -16.0F, 1, 1, 1, -0.3F, false));
		lower.cubeList.add(new ModelBox(lower, 156, 320, 0.2F, -32.8F, -16.4F, 1, 1, 1, -0.3F, false));
		lower.cubeList.add(new ModelBox(lower, 320, 155, 0.2F, -34.2F, -16.4F, 1, 1, 1, -0.3F, false));
		lower.cubeList.add(new ModelBox(lower, 96, 316, -0.3F, -34.5F, -2.4F, 1, 1, 1, -0.3F, false));
		lower.cubeList.add(new ModelBox(lower, 90, 285, -3.3F, -36.0F, -12.0F, 3, 5, 11, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 28, 292, -0.7F, -36.0F, -12.0F, 1, 5, 11, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 240, 55, -3.001F, -32.0F, -13.8F, 3, 5, 1, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 0, 305, -2.999F, -31.0F, -6.5F, 3, 5, 1, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 308, 78, -2.999F, -27.0F, -7.5F, 3, 1, 1, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 240, 48, -2.6F, -40.401F, 1.0015F, 2, 5, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 306, 274, -3.8F, -38.5F, 1.0F, 2, 1, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 306, 277, -1.2F, -38.5F, 1.0012F, 2, 1, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 90, 277, -1.4F, -40.4F, 1.0025F, 1, 5, 2, 0.0F, false));

		gun_r1 = new ModelRenderer(this);
		gun_r1.setRotationPoint(-1.501F, -26.1253F, -9.0978F);
		lower.addChild(gun_r1);
		setRotationAngle(gun_r1, 0.2618F, 0.0F, 0.0F);
		gun_r1.cubeList.add(new ModelBox(gun_r1, 120, 194, -1.5F, -0.5F, -0.5F, 3, 1, 3, 0.0F, false));

		gun_r2 = new ModelRenderer(this);
		gun_r2.setRotationPoint(-1.501F, -26.1417F, -10.9021F);
		lower.addChild(gun_r2);
		setRotationAngle(gun_r2, -0.0873F, 0.0F, 0.0F);
		gun_r2.cubeList.add(new ModelBox(gun_r2, 278, 87, -1.5F, -0.5F, -0.5F, 3, 1, 2, 0.0F, false));

		gun_r3 = new ModelRenderer(this);
		gun_r3.setRotationPoint(-1.501F, -26.5F, -12.8F);
		lower.addChild(gun_r3);
		setRotationAngle(gun_r3, -0.2182F, 0.0F, 0.0F);
		gun_r3.cubeList.add(new ModelBox(gun_r3, 248, 87, -1.5F, -0.5F, -0.5F, 3, 1, 2, 0.0F, false));

		gun_r4 = new ModelRenderer(this);
		gun_r4.setRotationPoint(-1.5F, -28.7864F, -21.0075F);
		lower.addChild(gun_r4);
		setRotationAngle(gun_r4, -0.7418F, 0.0F, 0.0F);
		gun_r4.cubeList.add(new ModelBox(gun_r4, 198, 196, -2.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, false));

		gun_r5 = new ModelRenderer(this);
		gun_r5.setRotationPoint(-3.675F, -35.1607F, -10.251F);
		lower.addChild(gun_r5);
		setRotationAngle(gun_r5, -1.5708F, 0.0F, 3.1416F);
		gun_r5.cubeList.add(new ModelBox(gun_r5, 320, 141, -0.425F, -1.1607F, -0.1464F, 1, 1, 1, -0.25F, false));
		gun_r5.cubeList.add(new ModelBox(gun_r5, 320, 143, -0.425F, -1.1607F, -0.8536F, 1, 1, 1, -0.25F, false));
		gun_r5.cubeList.add(new ModelBox(gun_r5, 320, 147, -0.425F, -0.8678F, -0.1464F, 1, 1, 1, -0.25F, false));
		gun_r5.cubeList.add(new ModelBox(gun_r5, 148, 320, -0.425F, -0.8678F, -0.8536F, 1, 1, 1, -0.25F, false));
		gun_r5.cubeList.add(new ModelBox(gun_r5, 0, 315, -0.425F, -1.5143F, -0.5F, 1, 2, 1, -0.25F, false));
		gun_r5.cubeList.add(new ModelBox(gun_r5, 308, 80, -0.575F, -0.0893F, -0.499F, 1, 5, 1, -0.2F, false));

		gun_r6 = new ModelRenderer(this);
		gun_r6.setRotationPoint(-3.675F, -35.1607F, -10.251F);
		lower.addChild(gun_r6);
		setRotationAngle(gun_r6, -2.3562F, 0.0F, 3.1416F);
		gun_r6.cubeList.add(new ModelBox(gun_r6, 144, 320, -0.425F, -1.3208F, -0.9672F, 1, 1, 1, -0.25F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 320, 145, -0.425F, -0.9672F, -1.3208F, 1, 1, 1, -0.25F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 320, 149, -0.425F, -0.7601F, -0.4065F, 1, 1, 1, -0.25F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 320, 151, -0.425F, -0.4065F, -0.7601F, 1, 1, 1, -0.25F, false));

		gun_r7 = new ModelRenderer(this);
		gun_r7.setRotationPoint(-3.5F, -32.794F, -14.4837F);
		lower.addChild(gun_r7);
		setRotationAngle(gun_r7, 0.3491F, 0.0F, 0.0F);
		gun_r7.cubeList.add(new ModelBox(gun_r7, 136, 310, -0.5F, -2.0F, -0.5F, 1, 4, 1, -0.2F, false));

		boltcatch = new ModelRenderer(this);
		boltcatch.setRotationPoint(0.25F, -0.1F, 0.6F);
		lower.addChild(boltcatch);
		boltcatch.cubeList.add(new ModelBox(boltcatch, 312, 84, -1.05F, -36.1F, -12.75F, 2, 1, 1, -0.2F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 92, 312, -1.05F, -35.5F, -12.75F, 2, 1, 1, -0.2F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 314, 281, -0.1F, -36.3F, -13.35F, 1, 2, 1, -0.2F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 80, 316, -0.05F, -34.5F, -13.351F, 1, 1, 1, -0.2F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 86, 312, -1.05F, -35.5F, -13.95F, 2, 1, 1, -0.2F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 294, 311, -1.05F, -36.1F, -13.95F, 2, 1, 1, -0.2F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 314, 284, 0.05F, -37.725F, -13.351F, 1, 2, 1, -0.25F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 316, 166, 0.05F, -37.0785F, -12.9974F, 1, 1, 1, -0.25F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 172, 316, 0.05F, -37.3714F, -12.9974F, 1, 1, 1, -0.25F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 316, 164, 0.05F, -37.0785F, -13.7045F, 1, 1, 1, -0.25F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 316, 170, 0.05F, -37.3714F, -13.7045F, 1, 1, 1, -0.25F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 84, 316, -3.95F, -33.65F, -13.6F, 1, 1, 1, 0.0F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 316, 172, -3.95F, -32.95F, -13.6F, 1, 1, 1, 0.0F, false));

		gun_r8 = new ModelRenderer(this);
		gun_r8.setRotationPoint(0.55F, -37.1214F, -13.101F);
		boltcatch.addChild(gun_r8);
		setRotationAngle(gun_r8, -0.7854F, 0.0F, 0.0F);
		gun_r8.cubeList.add(new ModelBox(gun_r8, 168, 316, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.25F, false));

		gun_r9 = new ModelRenderer(this);
		gun_r9.setRotationPoint(0.55F, -37.1214F, -12.601F);
		boltcatch.addChild(gun_r9);
		setRotationAngle(gun_r9, -0.7854F, 0.0F, 0.0F);
		gun_r9.cubeList.add(new ModelBox(gun_r9, 316, 168, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.25F, false));

		gun_r10 = new ModelRenderer(this);
		gun_r10.setRotationPoint(0.55F, -36.3285F, -12.601F);
		boltcatch.addChild(gun_r10);
		setRotationAngle(gun_r10, -0.7854F, 0.0F, 0.0F);
		gun_r10.cubeList.add(new ModelBox(gun_r10, 164, 316, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.25F, false));

		gun_r11 = new ModelRenderer(this);
		gun_r11.setRotationPoint(0.55F, -36.3285F, -13.101F);
		boltcatch.addChild(gun_r11);
		setRotationAngle(gun_r11, -0.7854F, 0.0F, 0.0F);
		gun_r11.cubeList.add(new ModelBox(gun_r11, 316, 162, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.25F, false));

		gun_r12 = new ModelRenderer(this);
		gun_r12.setRotationPoint(0.09F, -33.9017F, -12.85F);
		boltcatch.addChild(gun_r12);
		setRotationAngle(gun_r12, 0.0F, 0.0F, 0.4363F);
		gun_r12.cubeList.add(new ModelBox(gun_r12, 316, 160, -0.5F, -1.0F, -0.5F, 1, 1, 1, -0.2F, false));

		receiver16_r3 = new ModelRenderer(this);
		receiver16_r3.setRotationPoint(-3.8F, -37.5F, 1.0F);
		lower.addChild(receiver16_r3);
		setRotationAngle(receiver16_r3, -0.925F, 0.0F, -0.2618F);
		receiver16_r3.cubeList.add(new ModelBox(receiver16_r3, 156, 305, 0.001F, -0.2F, 0.7F, 1, 2, 2, 0.0F, false));

		receiver15_r2 = new ModelRenderer(this);
		receiver15_r2.setRotationPoint(0.8F, -37.5F, 1.0F);
		lower.addChild(receiver15_r2);
		setRotationAngle(receiver15_r2, -0.925F, 0.0F, 0.2618F);
		receiver15_r2.cubeList.add(new ModelBox(receiver15_r2, 138, 306, -0.999F, -0.2F, 0.7F, 1, 2, 2, 0.0F, false));

		receiver16_r4 = new ModelRenderer(this);
		receiver16_r4.setRotationPoint(-3.37F, -35.9F, 0.0F);
		lower.addChild(receiver16_r4);
		setRotationAngle(receiver16_r4, 0.0F, 0.0F, -0.0524F);
		receiver16_r4.cubeList.add(new ModelBox(receiver16_r4, 280, 231, 0.0F, 0.0F, 0.001F, 1, 2, 3, 0.0F, false));

		receiver15_r3 = new ModelRenderer(this);
		receiver15_r3.setRotationPoint(0.37F, -35.9F, 0.0F);
		lower.addChild(receiver15_r3);
		setRotationAngle(receiver15_r3, 0.0F, 0.0F, 0.0524F);
		receiver15_r3.cubeList.add(new ModelBox(receiver15_r3, 8, 305, -1.0F, 0.0F, 0.001F, 1, 2, 3, 0.0F, false));

		receiver14_r2 = new ModelRenderer(this);
		receiver14_r2.setRotationPoint(0.8F, -37.5F, 1.0F);
		lower.addChild(receiver14_r2);
		setRotationAngle(receiver14_r2, 0.0F, 0.0F, 0.2618F);
		receiver14_r2.cubeList.add(new ModelBox(receiver14_r2, 52, 306, -2.0F, 0.0F, 0.0012F, 2, 2, 2, 0.0F, false));

		receiver14_r3 = new ModelRenderer(this);
		receiver14_r3.setRotationPoint(0.8F, -37.5F, 1.0F);
		lower.addChild(receiver14_r3);
		setRotationAngle(receiver14_r3, 0.0F, 0.0F, -0.4014F);
		receiver14_r3.cubeList.add(new ModelBox(receiver14_r3, 306, 280, -1.6083F, -2.2205F, 0.001F, 2, 1, 2, 0.0F, false));
		receiver14_r3.cubeList.add(new ModelBox(receiver14_r3, 14, 310, -0.6093F, -1.9205F, 0.0F, 1, 1, 2, 0.0F, false));

		receiver17_r4 = new ModelRenderer(this);
		receiver17_r4.setRotationPoint(-2.6F, -39.4F, 1.0F);
		lower.addChild(receiver17_r4);
		setRotationAngle(receiver17_r4, 0.0F, 0.0F, -0.8029F);
		receiver17_r4.cubeList.add(new ModelBox(receiver17_r4, 52, 310, -0.2806F, -0.6946F, 0.0F, 1, 1, 2, 0.0F, false));

		receiver16_r5 = new ModelRenderer(this);
		receiver16_r5.setRotationPoint(-0.4F, -39.4F, 1.0F);
		lower.addChild(receiver16_r5);
		setRotationAngle(receiver16_r5, 0.0F, 0.0F, 0.8029F);
		receiver16_r5.cubeList.add(new ModelBox(receiver16_r5, 58, 310, -0.7194F, -0.6946F, 0.0F, 1, 1, 2, 0.0F, false));

		receiver15_r4 = new ModelRenderer(this);
		receiver15_r4.setRotationPoint(-3.8F, -37.5F, 1.0F);
		lower.addChild(receiver15_r4);
		setRotationAngle(receiver15_r4, 0.0F, 0.0F, -0.2618F);
		receiver15_r4.cubeList.add(new ModelBox(receiver15_r4, 60, 306, 0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

		receiver15_r5 = new ModelRenderer(this);
		receiver15_r5.setRotationPoint(-3.8F, -37.5F, 1.0F);
		lower.addChild(receiver15_r5);
		setRotationAngle(receiver15_r5, 0.0F, 0.0F, 0.4014F);
		receiver15_r5.cubeList.add(new ModelBox(receiver15_r5, 64, 310, -0.3917F, -2.2205F, 0.001F, 1, 1, 2, 0.0F, false));
		receiver15_r5.cubeList.add(new ModelBox(receiver15_r5, 306, 283, -0.3907F, -1.9205F, -0.001F, 2, 1, 2, 0.0F, false));

		gun30_r1 = new ModelRenderer(this);
		gun30_r1.setRotationPoint(-3.2F, -31.0F, -7.6F);
		lower.addChild(gun30_r1);
		setRotationAngle(gun30_r1, -2.3562F, 0.0F, 0.0F);
		gun30_r1.cubeList.add(new ModelBox(gun30_r1, 306, 286, 0.2F, -2.0F, -1.0F, 3, 2, 1, 0.0F, false));

		gun29_r1 = new ModelRenderer(this);
		gun29_r1.setRotationPoint(-3.2F, -27.0F, -7.6F);
		lower.addChild(gun29_r1);
		setRotationAngle(gun29_r1, -2.3562F, 0.0F, 0.0F);
		gun29_r1.cubeList.add(new ModelBox(gun29_r1, 258, 87, 0.2F, -1.0F, -2.0F, 3, 1, 2, 0.0F, false));
		gun29_r1.cubeList.add(new ModelBox(gun29_r1, 288, 257, 0.2F, 5.7175F, -0.2322F, 3, 1, 2, 0.0F, false));

		gun28_r1 = new ModelRenderer(this);
		gun28_r1.setRotationPoint(-3.2F, -27.0F, -11.5F);
		lower.addChild(gun28_r1);
		setRotationAngle(gun28_r1, -2.3562F, 0.0F, 0.0F);
		gun28_r1.cubeList.add(new ModelBox(gun28_r1, 28, 308, 0.2F, -0.2828F, 0.2828F, 3, 2, 1, 0.0F, false));

		gun39_r1 = new ModelRenderer(this);
		gun39_r1.setRotationPoint(0.5F, -33.7F, -11.3F);
		lower.addChild(gun39_r1);
		setRotationAngle(gun39_r1, -0.3665F, 0.0F, 0.0F);
		gun39_r1.cubeList.add(new ModelBox(gun39_r1, 100, 316, -1.05F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		gun38_r1 = new ModelRenderer(this);
		gun38_r1.setRotationPoint(0.5F, -32.7F, -7.6F);
		lower.addChild(gun38_r1);
		setRotationAngle(gun38_r1, -0.3665F, 0.0F, 0.0F);
		gun38_r1.cubeList.add(new ModelBox(gun38_r1, 316, 136, -1.05F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		gun37_r1 = new ModelRenderer(this);
		gun37_r1.setRotationPoint(-3.4F, -33.0F, -4.2F);
		lower.addChild(gun37_r1);
		setRotationAngle(gun37_r1, -0.3665F, 0.0F, 0.0F);
		gun37_r1.cubeList.add(new ModelBox(gun37_r1, 208, 196, 0.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun37_r2 = new ModelRenderer(this);
		gun37_r2.setRotationPoint(-2.6F, -34.7F, -0.6F);
		lower.addChild(gun37_r2);
		setRotationAngle(gun37_r2, -0.3665F, 0.0F, 0.0F);
		gun37_r2.cubeList.add(new ModelBox(gun37_r2, 256, 186, 0.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));
		gun37_r2.cubeList.add(new ModelBox(gun37_r2, 308, 72, -0.8F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun51_r1 = new ModelRenderer(this);
		gun51_r1.setRotationPoint(-3.9F, -27.5F, -21.2F);
		lower.addChild(gun51_r1);
		setRotationAngle(gun51_r1, 1.3756F, 0.0F, 0.0F);
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 120, 66, -0.1F, -0.7477F, 0.132F, 5, 9, 1, 0.0F, false));

		gun53_r3_r1 = new ModelRenderer(this);
		gun53_r3_r1.setRotationPoint(0.583F, 4.2259F, 1.3296F);
		gun51_r1.addChild(gun53_r3_r1);
		setRotationAngle(gun53_r3_r1, 0.0F, 0.5236F, 0.0F);
		gun53_r3_r1.cubeList.add(new ModelBox(gun53_r3_r1, 144, 305, -0.4927F, -4.5736F, -0.5126F, 1, 8, 1, 0.0F, false));

		gun52_r2_r1 = new ModelRenderer(this);
		gun52_r2_r1.setRotationPoint(4.217F, 4.2259F, 1.3296F);
		gun51_r1.addChild(gun52_r2_r1);
		setRotationAngle(gun52_r2_r1, 0.0F, -0.5236F, 0.0F);
		gun52_r2_r1.cubeList.add(new ModelBox(gun52_r2_r1, 24, 305, -0.5073F, -4.5736F, -0.5126F, 1, 8, 1, 0.0F, false));

		gun52_r2_r2 = new ModelRenderer(this);
		gun52_r2_r2.setRotationPoint(2.4F, 7.6428F, 1.3296F);
		gun51_r1.addChild(gun52_r2_r2);
		setRotationAngle(gun52_r2_r2, 0.5236F, 0.0F, 0.0F);
		gun52_r2_r2.cubeList.add(new ModelBox(gun52_r2_r2, 246, 186, -2.0F, -0.571F, -0.4758F, 4, 1, 1, 0.0F, false));

		gun53_r1 = new ModelRenderer(this);
		gun53_r1.setRotationPoint(-3.5F, -32.0F, -11.2F);
		lower.addChild(gun53_r1);
		setRotationAngle(gun53_r1, -2.7884F, 0.0F, 0.0F);
		

		gun58_r1 = new ModelRenderer(this);
		gun58_r1.setRotationPoint(-3.5F, -34.5F, -22.7F);
		lower.addChild(gun58_r1);
		setRotationAngle(gun58_r1, 0.9082F, 0.0F, 0.0F);
		gun58_r1.cubeList.add(new ModelBox(gun58_r1, 268, 87, -0.002F, -0.123F, 0.1577F, 4, 2, 1, 0.0F, false));

		gun63_r1 = new ModelRenderer(this);
		gun63_r1.setRotationPoint(-2.0F, -30.2F, -8.95F);
		lower.addChild(gun63_r1);
		setRotationAngle(gun63_r1, -0.409F, 0.0F, 0.0F);
		gun63_r1.cubeList.add(new ModelBox(gun63_r1, 20, 310, 0.0F, -2.0F, 0.0F, 1, 4, 1, 0.0F, false));

		gun80_r1 = new ModelRenderer(this);
		gun80_r1.setRotationPoint(-3.8F, -31.3F, -14.7F);
		lower.addChild(gun80_r1);
		setRotationAngle(gun80_r1, 0.0F, 0.0F, -0.2603F);
		

		gun82_r1 = new ModelRenderer(this);
		gun82_r1.setRotationPoint(-3.8F, -34.3F, -14.7F);
		lower.addChild(gun82_r1);
		setRotationAngle(gun82_r1, 0.0F, 0.7436F, 0.0F);
		

		gun152_r1 = new ModelRenderer(this);
		gun152_r1.setRotationPoint(-0.7F, -33.5F, -4.7F);
		lower.addChild(gun152_r1);
		setRotationAngle(gun152_r1, 0.7854F, 0.0F, 0.0F);
		gun152_r1.cubeList.add(new ModelBox(gun152_r1, 316, 138, 0.2F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun156_r1 = new ModelRenderer(this);
		gun156_r1.setRotationPoint(0.6F, -33.4F, -4.5F);
		lower.addChild(gun156_r1);
		setRotationAngle(gun156_r1, -1.5708F, 0.0F, 0.0F);
		gun156_r1.cubeList.add(new ModelBox(gun156_r1, 70, 310, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

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
		gun67.cubeList.add(new ModelBox(gun67, 206, 296, 0.001F, 0.0638F, -1.4959F, 3, 2, 5, 0.0F, false));
		gun67.cubeList.add(new ModelBox(gun67, 222, 296, 0.599F, 0.0638F, -1.4959F, 3, 2, 5, 0.0F, false));
		gun67.cubeList.add(new ModelBox(gun67, 304, 298, 0.299F, -0.7242F, -0.49F, 3, 2, 4, 0.0F, false));

		gun60 = new ModelRenderer(this);
		gun60.setRotationPoint(-0.4F, -35.6F, -22.1F);
		lower.addChild(gun60);
		setRotationAngle(gun60, -0.3316F, 0.0F, 0.0F);
		gun60.cubeList.add(new ModelBox(gun60, 316, 140, 0.0F, -0.0945F, -0.0325F, 1, 1, 1, 0.0F, false));
		gun60.cubeList.add(new ModelBox(gun60, 316, 142, -3.3F, -0.0945F, -0.0325F, 1, 1, 1, 0.0F, false));
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