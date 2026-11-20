package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class N4PDWLower extends ModelBase {
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
	private final ModelRenderer receiver15_r4;
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
	private final ModelRenderer gun58_r1;
	private final ModelRenderer gun63_r1;
	private final ModelRenderer gun152_r1;
	private final ModelRenderer gun156_r1;
	private final ModelRenderer gun67;
	private final ModelRenderer gun60;
	private final ModelRenderer hb_details;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer gun51_r2;

	public N4PDWLower() {
		textureWidth = 288;
		textureHeight = 288;

		lower = new ModelRenderer(this);
		lower.setRotationPoint(0.0F, 24.0F, 0.0F);
		lower.cubeList.add(new ModelBox(lower, 270, 277, -4.0F, -31.8F, -13.85F, 1, 1, 1, -0.2F, false));
		lower.cubeList.add(new ModelBox(lower, 106, 267, -4.0F, -31.8F, -13.35F, 1, 1, 4, -0.2F, false));
		lower.cubeList.add(new ModelBox(lower, 148, 272, -0.8F, -36.2F, -13.95F, 2, 2, 1, -0.2F, false));
		lower.cubeList.add(new ModelBox(lower, 154, 272, -0.8F, -35.4F, -13.95F, 2, 2, 1, -0.2F, false));
		lower.cubeList.add(new ModelBox(lower, 272, 259, -0.8F, -31.8F, -13.95F, 2, 1, 1, -0.2F, false));
		lower.cubeList.add(new ModelBox(lower, 260, 272, -0.8F, -32.4F, -13.95F, 2, 1, 1, -0.2F, false));
		lower.cubeList.add(new ModelBox(lower, 272, 261, -0.8F, -32.6F, -13.95F, 2, 1, 1, -0.2F, false));
		lower.cubeList.add(new ModelBox(lower, 94, 267, -0.8F, -31.8F, -13.35F, 2, 1, 4, -0.2F, false));
		lower.cubeList.add(new ModelBox(lower, 272, 225, -4.0F, -34.8F, -14.35F, 1, 4, 1, -0.2F, false));
		lower.cubeList.add(new ModelBox(lower, 198, 275, -4.0F, -34.5F, -14.95F, 1, 2, 1, -0.2F, false));
		lower.cubeList.add(new ModelBox(lower, 166, 227, -0.35F, -32.5F, -16.5F, 1, 5, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 168, 122, -3.8F, -36.0F, -21.4F, 1, 1, 10, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 256, 208, -3.8F, -35.3F, -21.4F, 1, 1, 10, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 236, 195, -3.0F, -33.35F, -1.0F, 3, 1, 4, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 262, 111, -3.3F, -36.0F, -1.001F, 3, 3, 4, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 84, 267, -0.7F, -36.0F, -0.998F, 1, 3, 4, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 128, 105, -3.501F, -35.7F, -22.7F, 4, 1, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 242, 87, -3.501F, -36.0F, -22.7F, 4, 1, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 134, 267, -0.4F, -33.5F, -16.3F, 1, 1, 3, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 124, 272, 0.0F, -33.5F, -13.3F, 1, 1, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 98, 277, -0.2F, -33.5F, -16.0F, 1, 1, 1, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 272, 82, -0.35F, -34.5F, -16.5F, 1, 1, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 220, 90, -3.5F, -36.0F, -13.2F, 4, 5, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 244, 31, -3.5F, -36.0F, -21.2F, 4, 8, 8, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 194, 116, -3.5F, -28.0F, -17.2F, 4, 1, 4, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 40, 277, -0.3F, -34.5F, -6.3F, 1, 1, 1, -0.3F, false));
		lower.cubeList.add(new ModelBox(lower, 280, 167, -0.3F, -34.5F, -2.8F, 1, 1, 1, -0.3F, false));
		lower.cubeList.add(new ModelBox(lower, 44, 277, -0.3F, -34.5F, -5.9F, 1, 1, 1, -0.3F, false));
		lower.cubeList.add(new ModelBox(lower, 94, 277, 0.2F, -34.2F, -15.6F, 1, 1, 1, -0.3F, false));
		lower.cubeList.add(new ModelBox(lower, 80, 277, 0.2F, -34.2F, -16.0F, 1, 1, 1, -0.3F, false));
		lower.cubeList.add(new ModelBox(lower, 182, 280, 0.2F, -32.8F, -15.6F, 1, 1, 1, -0.3F, false));
		lower.cubeList.add(new ModelBox(lower, 280, 181, 0.2F, -32.8F, -16.0F, 1, 1, 1, -0.3F, false));
		lower.cubeList.add(new ModelBox(lower, 280, 185, 0.2F, -32.8F, -16.4F, 1, 1, 1, -0.3F, false));
		lower.cubeList.add(new ModelBox(lower, 280, 183, 0.2F, -34.2F, -16.4F, 1, 1, 1, -0.3F, false));
		lower.cubeList.add(new ModelBox(lower, 48, 277, -0.3F, -34.5F, -2.4F, 1, 1, 1, -0.3F, false));
		lower.cubeList.add(new ModelBox(lower, 244, 15, -3.3F, -36.0F, -12.0F, 3, 5, 11, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 248, 220, -0.7F, -36.0F, -12.0F, 1, 5, 11, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 172, 209, -3.001F, -32.0F, -13.8F, 3, 5, 1, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 164, 221, -2.999F, -31.0F, -6.5F, 3, 5, 1, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 208, 179, -2.999F, -27.0F, -7.5F, 3, 1, 1, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 172, 202, -2.6F, -40.401F, 1.0015F, 2, 5, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 90, 215, -1.4F, -38.4F, 1.0025F, 1, 3, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 272, 18, -1.25F, -38.4F, 1.002F, 2, 1, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 272, 21, -3.75F, -38.4F, 1.0025F, 2, 1, 2, 0.0F, false));

		gun_r1 = new ModelRenderer(this);
		gun_r1.setRotationPoint(-1.501F, -26.1253F, -9.0978F);
		lower.addChild(gun_r1);
		setRotationAngle(gun_r1, 0.2618F, 0.0F, 0.0F);
		gun_r1.cubeList.add(new ModelBox(gun_r1, 230, 175, -1.5F, -0.5F, -0.5F, 3, 1, 3, 0.0F, false));

		gun_r2 = new ModelRenderer(this);
		gun_r2.setRotationPoint(-1.501F, -26.1417F, -10.9021F);
		lower.addChild(gun_r2);
		setRotationAngle(gun_r2, -0.0873F, 0.0F, 0.0F);
		gun_r2.cubeList.add(new ModelBox(gun_r2, 262, 191, -1.5F, -0.5F, -0.5F, 3, 1, 2, 0.0F, false));

		gun_r3 = new ModelRenderer(this);
		gun_r3.setRotationPoint(-1.501F, -26.5F, -12.8F);
		lower.addChild(gun_r3);
		setRotationAngle(gun_r3, -0.2182F, 0.0F, 0.0F);
		gun_r3.cubeList.add(new ModelBox(gun_r3, 242, 175, -1.5F, -0.5F, -0.5F, 3, 1, 2, 0.0F, false));

		gun_r4 = new ModelRenderer(this);
		gun_r4.setRotationPoint(-1.5F, -28.7864F, -21.0075F);
		lower.addChild(gun_r4);
		setRotationAngle(gun_r4, -0.7418F, 0.0F, 0.0F);
		gun_r4.cubeList.add(new ModelBox(gun_r4, 158, 71, -2.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, false));

		gun_r5 = new ModelRenderer(this);
		gun_r5.setRotationPoint(-3.675F, -35.1607F, -10.251F);
		lower.addChild(gun_r5);
		setRotationAngle(gun_r5, -1.5708F, 0.0F, 3.1416F);
		gun_r5.cubeList.add(new ModelBox(gun_r5, 280, 169, -0.425F, -1.1607F, -0.1464F, 1, 1, 1, -0.25F, false));
		gun_r5.cubeList.add(new ModelBox(gun_r5, 170, 280, -0.425F, -1.1607F, -0.8536F, 1, 1, 1, -0.25F, false));
		gun_r5.cubeList.add(new ModelBox(gun_r5, 174, 280, -0.425F, -0.8678F, -0.1464F, 1, 1, 1, -0.25F, false));
		gun_r5.cubeList.add(new ModelBox(gun_r5, 280, 175, -0.425F, -0.8678F, -0.8536F, 1, 1, 1, -0.25F, false));
		gun_r5.cubeList.add(new ModelBox(gun_r5, 222, 275, -0.424F, -1.5143F, -0.5F, 1, 2, 1, -0.25F, false));
		gun_r5.cubeList.add(new ModelBox(gun_r5, 220, 267, -0.575F, -0.0893F, -0.499F, 1, 5, 1, -0.2F, false));

		gun_r6 = new ModelRenderer(this);
		gun_r6.setRotationPoint(-3.675F, -35.1607F, -10.251F);
		lower.addChild(gun_r6);
		setRotationAngle(gun_r6, -2.3562F, 0.0F, 3.1416F);
		gun_r6.cubeList.add(new ModelBox(gun_r6, 280, 171, -0.425F, -1.3208F, -0.9672F, 1, 1, 1, -0.25F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 280, 173, -0.425F, -0.9672F, -1.3208F, 1, 1, 1, -0.25F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 280, 177, -0.425F, -0.7601F, -0.4065F, 1, 1, 1, -0.25F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 178, 280, -0.425F, -0.4065F, -0.7601F, 1, 1, 1, -0.25F, false));

		gun_r7 = new ModelRenderer(this);
		gun_r7.setRotationPoint(-3.499F, -32.794F, -14.4837F);
		lower.addChild(gun_r7);
		setRotationAngle(gun_r7, 0.3491F, 0.0F, 0.0F);
		gun_r7.cubeList.add(new ModelBox(gun_r7, 130, 272, -0.5F, -2.0F, -0.5F, 1, 4, 1, -0.2F, false));

		boltcatch = new ModelRenderer(this);
		boltcatch.setRotationPoint(0.25F, -0.1F, 0.6F);
		lower.addChild(boltcatch);
		boltcatch.cubeList.add(new ModelBox(boltcatch, 254, 272, -1.05F, -36.1F, -12.75F, 2, 1, 1, -0.2F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 272, 257, -1.05F, -35.5F, -12.75F, 2, 1, 1, -0.2F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 190, 275, -0.1F, -36.3F, -13.35F, 1, 2, 1, -0.2F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 32, 277, -0.05F, -34.5F, -13.351F, 1, 1, 1, -0.2F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 272, 255, -1.05F, -35.5F, -13.95F, 2, 1, 1, -0.2F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 272, 245, -1.05F, -36.1F, -13.95F, 2, 1, 1, -0.2F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 194, 275, 0.05F, -37.725F, -13.351F, 1, 2, 1, -0.25F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 124, 277, 0.05F, -37.0785F, -12.9974F, 1, 1, 1, -0.25F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 140, 277, 0.05F, -37.3714F, -12.9974F, 1, 1, 1, -0.25F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 120, 277, 0.05F, -37.0785F, -13.7045F, 1, 1, 1, -0.25F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 136, 277, 0.05F, -37.3714F, -13.7045F, 1, 1, 1, -0.25F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 36, 277, -3.95F, -33.65F, -13.6F, 1, 1, 1, 0.0F, false));
		boltcatch.cubeList.add(new ModelBox(boltcatch, 226, 277, -3.95F, -32.95F, -13.6F, 1, 1, 1, 0.0F, false));

		gun_r8 = new ModelRenderer(this);
		gun_r8.setRotationPoint(0.55F, -37.1214F, -13.101F);
		boltcatch.addChild(gun_r8);
		setRotationAngle(gun_r8, -0.7854F, 0.0F, 0.0F);
		gun_r8.cubeList.add(new ModelBox(gun_r8, 128, 277, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.25F, false));

		gun_r9 = new ModelRenderer(this);
		gun_r9.setRotationPoint(0.55F, -37.1214F, -12.601F);
		boltcatch.addChild(gun_r9);
		setRotationAngle(gun_r9, -0.7854F, 0.0F, 0.0F);
		gun_r9.cubeList.add(new ModelBox(gun_r9, 132, 277, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.25F, false));

		gun_r10 = new ModelRenderer(this);
		gun_r10.setRotationPoint(0.55F, -36.3285F, -12.601F);
		boltcatch.addChild(gun_r10);
		setRotationAngle(gun_r10, -0.7854F, 0.0F, 0.0F);
		gun_r10.cubeList.add(new ModelBox(gun_r10, 110, 277, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.25F, false));

		gun_r11 = new ModelRenderer(this);
		gun_r11.setRotationPoint(0.55F, -36.3285F, -13.101F);
		boltcatch.addChild(gun_r11);
		setRotationAngle(gun_r11, -0.7854F, 0.0F, 0.0F);
		gun_r11.cubeList.add(new ModelBox(gun_r11, 106, 277, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.25F, false));

		gun_r12 = new ModelRenderer(this);
		gun_r12.setRotationPoint(0.09F, -33.9017F, -12.85F);
		boltcatch.addChild(gun_r12);
		setRotationAngle(gun_r12, 0.0F, 0.0F, 0.4363F);
		gun_r12.cubeList.add(new ModelBox(gun_r12, 102, 277, -0.5F, -1.0F, -0.5F, 1, 1, 1, -0.2F, false));

		receiver16_r3 = new ModelRenderer(this);
		receiver16_r3.setRotationPoint(-3.8F, -37.5F, 1.0F);
		lower.addChild(receiver16_r3);
		setRotationAngle(receiver16_r3, -0.925F, 0.0F, -0.2618F);
		receiver16_r3.cubeList.add(new ModelBox(receiver16_r3, 142, 271, 0.001F, -0.2F, 0.7F, 1, 2, 2, 0.0F, false));

		receiver15_r2 = new ModelRenderer(this);
		receiver15_r2.setRotationPoint(0.8F, -37.5F, 1.0F);
		lower.addChild(receiver15_r2);
		setRotationAngle(receiver15_r2, -0.925F, 0.0F, 0.2618F);
		receiver15_r2.cubeList.add(new ModelBox(receiver15_r2, 272, 47, -0.999F, -0.2F, 0.7F, 1, 2, 2, 0.0F, false));

		receiver16_r4 = new ModelRenderer(this);
		receiver16_r4.setRotationPoint(-3.37F, -35.9F, 0.0F);
		lower.addChild(receiver16_r4);
		setRotationAngle(receiver16_r4, 0.0F, 0.0F, -0.0524F);
		receiver16_r4.cubeList.add(new ModelBox(receiver16_r4, 172, 215, 0.0F, 0.0F, 0.001F, 1, 2, 3, 0.0F, false));

		receiver15_r3 = new ModelRenderer(this);
		receiver15_r3.setRotationPoint(0.37F, -35.9F, 0.0F);
		lower.addChild(receiver15_r3);
		setRotationAngle(receiver15_r3, 0.0F, 0.0F, 0.0524F);
		receiver15_r3.cubeList.add(new ModelBox(receiver15_r3, 224, 116, -1.0F, 0.0F, 0.001F, 1, 2, 3, 0.0F, false));

		receiver14_r2 = new ModelRenderer(this);
		receiver14_r2.setRotationPoint(0.8F, -37.5F, 1.0F);
		lower.addChild(receiver14_r2);
		setRotationAngle(receiver14_r2, 0.0F, 0.0F, 0.2618F);
		receiver14_r2.cubeList.add(new ModelBox(receiver14_r2, 172, 267, -2.0F, 0.0F, 0.0012F, 2, 2, 2, 0.0F, false));

		receiver15_r4 = new ModelRenderer(this);
		receiver15_r4.setRotationPoint(-3.8F, -37.5F, 1.0F);
		lower.addChild(receiver15_r4);
		setRotationAngle(receiver15_r4, 0.0F, 0.0F, -0.2618F);
		receiver15_r4.cubeList.add(new ModelBox(receiver15_r4, 180, 267, 0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

		gun30_r1 = new ModelRenderer(this);
		gun30_r1.setRotationPoint(-3.2F, -31.0F, -7.6F);
		lower.addChild(gun30_r1);
		setRotationAngle(gun30_r1, -2.3562F, 0.0F, 0.0F);
		gun30_r1.cubeList.add(new ModelBox(gun30_r1, 0, 272, 0.2F, -2.0F, -1.0F, 3, 2, 1, 0.0F, false));

		gun29_r1 = new ModelRenderer(this);
		gun29_r1.setRotationPoint(-3.2F, -27.0F, -7.6F);
		lower.addChild(gun29_r1);
		setRotationAngle(gun29_r1, -2.3562F, 0.0F, 0.0F);
		gun29_r1.cubeList.add(new ModelBox(gun29_r1, 248, 236, 0.2F, -1.0F, -2.0F, 3, 1, 2, 0.0F, false));
		gun29_r1.cubeList.add(new ModelBox(gun29_r1, 116, 267, 0.2F, 5.7175F, -0.2322F, 3, 1, 2, 0.0F, false));

		gun28_r1 = new ModelRenderer(this);
		gun28_r1.setRotationPoint(-3.2F, -27.0F, -11.5F);
		lower.addChild(gun28_r1);
		setRotationAngle(gun28_r1, -2.3562F, 0.0F, 0.0F);
		gun28_r1.cubeList.add(new ModelBox(gun28_r1, 8, 272, 0.2F, -0.2828F, 0.2828F, 3, 2, 1, 0.0F, false));

		gun39_r1 = new ModelRenderer(this);
		gun39_r1.setRotationPoint(0.5F, -33.7F, -11.3F);
		lower.addChild(gun39_r1);
		setRotationAngle(gun39_r1, -0.3665F, 0.0F, 0.0F);
		gun39_r1.cubeList.add(new ModelBox(gun39_r1, 52, 277, -1.05F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		gun38_r1 = new ModelRenderer(this);
		gun38_r1.setRotationPoint(0.5F, -32.7F, -7.6F);
		lower.addChild(gun38_r1);
		setRotationAngle(gun38_r1, -0.3665F, 0.0F, 0.0F);
		gun38_r1.cubeList.add(new ModelBox(gun38_r1, 56, 277, -1.05F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		gun37_r1 = new ModelRenderer(this);
		gun37_r1.setRotationPoint(-3.4F, -33.0F, -4.2F);
		lower.addChild(gun37_r1);
		setRotationAngle(gun37_r1, -0.3665F, 0.0F, 0.0F);
		gun37_r1.cubeList.add(new ModelBox(gun37_r1, 192, 179, 0.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun37_r2 = new ModelRenderer(this);
		gun37_r2.setRotationPoint(-2.6F, -34.7F, -0.6F);
		lower.addChild(gun37_r2);
		setRotationAngle(gun37_r2, -0.3665F, 0.0F, 0.0F);
		gun37_r2.cubeList.add(new ModelBox(gun37_r2, 194, 71, 0.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));
		gun37_r2.cubeList.add(new ModelBox(gun37_r2, 200, 179, -0.8F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun51_r1 = new ModelRenderer(this);
		gun51_r1.setRotationPoint(-3.9F, -27.5F, -21.2F);
		lower.addChild(gun51_r1);
		setRotationAngle(gun51_r1, 1.3756F, 0.0F, 0.0F);
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 152, 221, -0.1F, -0.7477F, 0.132F, 5, 9, 1, 0.0F, false));

		gun53_r3_r1 = new ModelRenderer(this);
		gun53_r3_r1.setRotationPoint(0.583F, 4.2259F, 1.3296F);
		gun51_r1.addChild(gun53_r3_r1);
		setRotationAngle(gun53_r3_r1, 0.0F, 0.5236F, 0.0F);
		gun53_r3_r1.cubeList.add(new ModelBox(gun53_r3_r1, 238, 57, -0.4927F, -4.5736F, -0.5126F, 1, 8, 1, 0.0F, false));

		gun52_r2_r1 = new ModelRenderer(this);
		gun52_r2_r1.setRotationPoint(4.217F, 4.2259F, 1.3296F);
		gun51_r1.addChild(gun52_r2_r1);
		setRotationAngle(gun52_r2_r1, 0.0F, -0.5236F, 0.0F);
		gun52_r2_r1.cubeList.add(new ModelBox(gun52_r2_r1, 234, 57, -0.5073F, -4.5736F, -0.5126F, 1, 8, 1, 0.0F, false));

		gun52_r2_r2 = new ModelRenderer(this);
		gun52_r2_r2.setRotationPoint(2.4F, 7.6428F, 1.3296F);
		gun51_r1.addChild(gun52_r2_r2);
		setRotationAngle(gun52_r2_r2, 0.5236F, 0.0F, 0.0F);
		gun52_r2_r2.cubeList.add(new ModelBox(gun52_r2_r2, 168, 71, -2.0F, -0.571F, -0.4758F, 4, 1, 1, 0.0F, false));

		gun58_r1 = new ModelRenderer(this);
		gun58_r1.setRotationPoint(-3.5F, -34.5F, -22.7F);
		lower.addChild(gun58_r1);
		setRotationAngle(gun58_r1, 0.9082F, 0.0F, 0.0F);
		gun58_r1.cubeList.add(new ModelBox(gun58_r1, 258, 236, -0.002F, -0.123F, 0.1577F, 4, 2, 1, 0.0F, false));

		gun63_r1 = new ModelRenderer(this);
		gun63_r1.setRotationPoint(-2.0F, -30.2F, -8.95F);
		lower.addChild(gun63_r1);
		setRotationAngle(gun63_r1, -0.409F, 0.0F, 0.0F);
		gun63_r1.cubeList.add(new ModelBox(gun63_r1, 94, 272, 0.0F, -2.0F, 0.0F, 1, 4, 1, 0.0F, false));

		gun152_r1 = new ModelRenderer(this);
		gun152_r1.setRotationPoint(-0.7F, -33.5F, -4.7F);
		lower.addChild(gun152_r1);
		setRotationAngle(gun152_r1, 0.7854F, 0.0F, 0.0F);
		gun152_r1.cubeList.add(new ModelBox(gun152_r1, 60, 277, 0.2F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun156_r1 = new ModelRenderer(this);
		gun156_r1.setRotationPoint(0.6F, -33.4F, -4.5F);
		lower.addChild(gun156_r1);
		setRotationAngle(gun156_r1, -1.5708F, 0.0F, 0.0F);
		gun156_r1.cubeList.add(new ModelBox(gun156_r1, 98, 272, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun67 = new ModelRenderer(this);
		gun67.setRotationPoint(-3.3F, -33.5F, 1.5F);
		lower.addChild(gun67);
		setRotationAngle(gun67, -2.3423F, 0.0F, 0.0F);
		gun67.cubeList.add(new ModelBox(gun67, 128, 98, 0.001F, 0.0638F, -1.4959F, 3, 2, 5, 0.0F, false));
		gun67.cubeList.add(new ModelBox(gun67, 204, 90, 0.599F, 0.0638F, -1.4959F, 3, 2, 5, 0.0F, false));
		gun67.cubeList.add(new ModelBox(gun67, 210, 116, 0.299F, -0.7242F, -0.49F, 3, 2, 4, 0.0F, false));

		gun60 = new ModelRenderer(this);
		gun60.setRotationPoint(-0.4F, -35.6F, -22.1F);
		lower.addChild(gun60);
		setRotationAngle(gun60, -0.3316F, 0.0F, 0.0F);
		gun60.cubeList.add(new ModelBox(gun60, 64, 277, 0.0F, -0.0945F, -0.0325F, 1, 1, 1, 0.0F, false));
		gun60.cubeList.add(new ModelBox(gun60, 68, 277, -3.3F, -0.0945F, -0.0325F, 1, 1, 1, 0.0F, false));

		hb_details = new ModelRenderer(this);
		hb_details.setRotationPoint(0.0F, 0.0F, 0.0F);
		lower.addChild(hb_details);
		hb_details.cubeList.add(new ModelBox(hb_details, 222, 179, -4.0F, -36.25F, -11.75F, 5, 1, 15, -0.25F, false));
		hb_details.cubeList.add(new ModelBox(hb_details, 160, 272, 0.5F, -38.25F, 1.25F, 1, 1, 2, -0.25F, false));
		hb_details.cubeList.add(new ModelBox(hb_details, 166, 272, -4.5F, -38.25F, 1.25F, 1, 1, 2, -0.25F, false));
		hb_details.cubeList.add(new ModelBox(hb_details, 274, 277, -4.5F, -38.25F, 0.75F, 1, 1, 1, -0.25F, false));
		hb_details.cubeList.add(new ModelBox(hb_details, 278, 46, 0.5F, -38.25F, 0.75F, 1, 1, 1, -0.25F, false));
		hb_details.cubeList.add(new ModelBox(hb_details, 272, 59, -2.8625F, -40.4032F, 1.001F, 1, 2, 2, 0.0F, false));
		hb_details.cubeList.add(new ModelBox(hb_details, 272, 63, -1.1375F, -40.4032F, 1.001F, 1, 2, 2, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0429F, -35.5F, -2.0F);
		hb_details.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 52, 255, -0.5F, -0.5F, -10.0F, 1, 1, 11, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 272, 191, -0.5F, -0.5F, 3.0F, 1, 1, 2, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-3.0429F, -35.5F, -2.0F);
		hb_details.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 0.7854F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 146, 122, -0.5F, -0.5F, -9.0F, 1, 1, 10, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 272, 219, -0.5F, -0.5F, 3.0F, 1, 1, 2, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.314F, -38.616F, 2.0F);
		hb_details.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.5236F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 224, 272, -0.5F, -1.775F, -1.0F, 1, 1, 2, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-3.316F, -38.616F, 2.0F);
		hb_details.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, 0.5236F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 272, 222, -0.5F, -1.775F, -1.0F, 1, 1, 2, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-3.567F, -38.183F, 2.0F);
		hb_details.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, 0.5236F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 272, 55, -0.5F, -1.5F, -1.0F, 1, 2, 2, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.567F, -38.183F, 2.0F);
		hb_details.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, -0.5236F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 272, 51, -0.5F, -1.5F, -1.0F, 1, 2, 2, 0.0F, false));

		gun51_r2 = new ModelRenderer(this);
		gun51_r2.setRotationPoint(-3.9F, -26.9F, -21.2F);
		hb_details.addChild(gun51_r2);
		setRotationAngle(gun51_r2, 1.3756F, 0.0F, 0.0F);
		
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