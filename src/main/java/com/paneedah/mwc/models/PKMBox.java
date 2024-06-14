package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.10.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class PKMBox extends ModelBase {
	private final ModelRenderer box;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;
	private final ModelRenderer cube_r34;
	private final ModelRenderer cube_r35;
	private final ModelRenderer cube_r36;

	public PKMBox() {
		textureWidth = 512;
		textureHeight = 512;

		box = new ModelRenderer(this);
		box.setRotationPoint(0.8F, -5.1F, -30.0F);
		box.cubeList.add(new ModelBox(box, 144, 193, -9.0F, 0.7F, -4.6F, 14, 2, 9, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 288, 49, -12.3F, 2.7F, 3.2F, 19, 9, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 33, 71, 6.3F, 2.7F, -3.8F, 1, 9, 7, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 33, 30, -12.3F, 2.7F, -3.8F, 1, 9, 7, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 52, 113, -13.2F, 9.7F, -0.8F, 1, 2, 2, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 94, 112, -13.2F, 3.7F, -0.8F, 1, 2, 2, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 288, 39, -12.3F, 2.7F, -4.5F, 19, 9, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 33, 49, -10.3F, 11.6F, 3.2F, 16, 2, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 33, 52, -10.3F, 11.6F, -4.5F, 16, 2, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 72, 28, -9.3131F, 13.3131F, 3.2F, 14, 1, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 30, 68, -9.3131F, 2.6131F, 3.6F, 14, 1, 1, -0.2F, false));
		box.cubeList.add(new ModelBox(box, 0, 68, -9.3131F, 4.4617F, 3.6F, 14, 1, 1, -0.2F, false));
		box.cubeList.add(new ModelBox(box, 78, 72, 4.1111F, 3.0374F, 3.6F, 1, 2, 1, -0.2F, false));
		box.cubeList.add(new ModelBox(box, 78, 44, -9.7374F, 3.0374F, 3.6F, 1, 2, 1, -0.2F, false));
		box.cubeList.add(new ModelBox(box, 72, 72, -9.7374F, 3.0374F, -4.9F, 1, 2, 1, -0.2F, false));
		box.cubeList.add(new ModelBox(box, 0, 66, -9.3131F, 2.6131F, -4.9F, 14, 1, 1, -0.2F, false));
		box.cubeList.add(new ModelBox(box, 30, 66, -9.3131F, 4.4617F, -4.9F, 14, 1, 1, -0.2F, false));
		box.cubeList.add(new ModelBox(box, 78, 32, 4.1111F, 3.0374F, -4.9F, 1, 2, 1, -0.2F, false));
		box.cubeList.add(new ModelBox(box, 26, 71, -9.7374F, 7.0374F, -4.9F, 1, 2, 1, -0.2F, false));
		box.cubeList.add(new ModelBox(box, 0, 62, -9.3131F, 6.6131F, -4.9F, 14, 1, 1, -0.2F, false));
		box.cubeList.add(new ModelBox(box, 30, 62, -9.3131F, 8.4617F, -4.9F, 14, 1, 1, -0.2F, false));
		box.cubeList.add(new ModelBox(box, 72, 32, 4.1111F, 7.0374F, -4.9F, 1, 2, 1, -0.2F, false));
		box.cubeList.add(new ModelBox(box, 72, 44, 4.1111F, 7.0374F, 3.6F, 1, 2, 1, -0.2F, false));
		box.cubeList.add(new ModelBox(box, 0, 64, -9.3131F, 6.6131F, 3.6F, 14, 1, 1, -0.2F, false));
		box.cubeList.add(new ModelBox(box, 30, 64, -9.3131F, 8.4617F, 3.6F, 14, 1, 1, -0.2F, false));
		box.cubeList.add(new ModelBox(box, 72, 64, -9.7374F, 7.0374F, 3.6F, 1, 2, 1, -0.2F, false));
		box.cubeList.add(new ModelBox(box, 66, 0, -9.7374F, 11.0374F, -4.9F, 1, 2, 1, -0.2F, false));
		box.cubeList.add(new ModelBox(box, 33, 55, -9.3131F, 10.6131F, -4.9F, 14, 1, 1, -0.2F, false));
		box.cubeList.add(new ModelBox(box, 33, 57, -9.3131F, 12.4617F, -4.9F, 14, 1, 1, -0.2F, false));
		box.cubeList.add(new ModelBox(box, 0, 71, 4.1111F, 11.0374F, -4.9F, 1, 2, 1, -0.2F, false));
		box.cubeList.add(new ModelBox(box, 7, 71, 4.1111F, 11.0374F, 3.6F, 1, 2, 1, -0.2F, false));
		box.cubeList.add(new ModelBox(box, 0, 58, -9.3131F, 10.6131F, 3.6F, 14, 1, 1, -0.2F, false));
		box.cubeList.add(new ModelBox(box, 33, 59, -9.3131F, 12.4617F, 3.6F, 14, 1, 1, -0.2F, false));
		box.cubeList.add(new ModelBox(box, 14, 71, -9.7374F, 11.0374F, 3.6F, 1, 2, 1, -0.2F, false));
		box.cubeList.add(new ModelBox(box, 72, 132, -9.3131F, 13.3131F, -4.5F, 14, 1, 8, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 123, 54, -9.6869F, 13.3131F, 3.2F, 1, 1, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 155, -9.6869F, 13.3131F, -4.5F, 1, 1, 8, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 26, 82, 6.3F, 2.7F, 3.2F, 1, 9, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 96, 41, 6.3F, 2.7F, -4.5F, 1, 9, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 78, 84, -10.0F, 0.7F, 3.4F, 1, 2, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 72, 84, -10.0F, 0.7F, -4.6F, 1, 2, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 72, 84, 6.5F, 2.1F, -5.1F, 2, 2, 10, -0.7F, false));
		box.cubeList.add(new ModelBox(box, 72, 72, -13.5F, 2.1F, -5.1F, 2, 2, 10, -0.7F, false));
		box.cubeList.add(new ModelBox(box, 72, 32, -9.4F, -0.5F, -5.1F, 2, 2, 10, -0.5F, false));
		box.cubeList.add(new ModelBox(box, 72, 44, -12.9F, 0.6F, -5.1F, 2, 2, 10, -0.8F, false));
		box.cubeList.add(new ModelBox(box, 86, 0, 6.5F, 2.7F, -3.1F, 2, 4, 6, -0.7F, false));
		box.cubeList.add(new ModelBox(box, 16, 0, 6.5F, 5.3F, -2.1F, 2, 6, 4, -0.7F, false));
		box.cubeList.add(new ModelBox(box, 24, 95, -0.9F, -0.4F, 1.4F, 1, 2, 2, -0.2F, false));
		box.cubeList.add(new ModelBox(box, 94, 72, -0.9F, -0.4F, -3.6F, 1, 2, 2, -0.2F, false));
		box.cubeList.add(new ModelBox(box, 124, 111, -4.9F, -0.4F, 1.4F, 1, 2, 2, -0.2F, false));
		box.cubeList.add(new ModelBox(box, 119, 164, -6.9F, -0.4F, -1.1F, 3, 2, 2, -0.2F, false));
		box.cubeList.add(new ModelBox(box, 72, 79, -6.3F, -0.4F, -1.1F, 3, 1, 2, -0.3F, false));
		box.cubeList.add(new ModelBox(box, 0, 125, -4.9F, -0.4F, -3.6F, 1, 2, 2, -0.2F, false));
		box.cubeList.add(new ModelBox(box, 144, 156, -1.4F, -0.4F, -3.6F, 1, 1, 2, -0.2F, false));
		box.cubeList.add(new ModelBox(box, 27, 157, -1.4F, -0.4F, 1.4F, 1, 1, 2, -0.2F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-11.8F, 1.3F, -0.1F);
		box.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.2618F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 72, 14, -1.0F, -3.0F, -5.0F, 2, 4, 10, -0.8F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-9.1131F, 11.2374F, 4.1F);
		box.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 87, 148, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.2F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 144, 74, -0.5F, -0.5F, -9.0F, 1, 1, 1, -0.2F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-9.1131F, 12.8374F, 4.1F);
		box.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.7854F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 93, 145, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.2F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 87, 145, -0.5F, -0.5F, -9.0F, 1, 1, 1, -0.2F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(4.4869F, 11.2374F, 4.1F);
		box.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 49, 121, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.2F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 96, 120, -0.5F, -0.5F, -9.0F, 1, 1, 1, -0.2F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(4.4869F, 12.8374F, 4.1F);
		box.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.7854F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 111, 120, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.2F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 105, 120, -0.5F, -0.5F, -9.0F, 1, 1, 1, -0.2F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-9.1131F, 7.2374F, 4.1F);
		box.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 149, 14, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.2F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 91, 148, -0.5F, -0.5F, -9.0F, 1, 1, 1, -0.2F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-9.1131F, 8.8374F, 4.1F);
		box.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 11, 149, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.2F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 149, 10, -0.5F, -0.5F, -9.0F, 1, 1, 1, -0.2F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(4.4869F, 7.2374F, 4.1F);
		box.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 111, 122, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.2F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 57, 121, -0.5F, -0.5F, -9.0F, 1, 1, 1, -0.2F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(4.4869F, 8.8374F, 4.1F);
		box.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 0.7854F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 105, 122, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.2F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 96, 122, -0.5F, -0.5F, -9.0F, 1, 1, 1, -0.2F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(4.4869F, 4.8374F, -4.4F);
		box.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 0.7854F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 123, 22, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.2F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 49, 123, -0.5F, -0.5F, 8.0F, 1, 1, 1, -0.2F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(4.4869F, 3.2374F, -4.4F);
		box.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 0.7854F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 122, 120, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.2F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 123, 50, -0.5F, -0.5F, 8.0F, 1, 1, 1, -0.2F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-9.1131F, 4.8374F, -4.4F);
		box.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, 0.7854F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 19, 149, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.2F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 149, 96, -0.5F, -0.5F, 8.0F, 1, 1, 1, -0.2F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-9.1131F, 3.2374F, -4.4F);
		box.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, 0.7854F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 15, 149, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.2F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 149, 100, -0.5F, -0.5F, 8.0F, 1, 1, 1, -0.2F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-12.7F, 9.6F, 0.2F);
		box.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -1.0472F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 105, 0, -0.5F, -1.0F, -1.0F, 1, 2, 2, -0.2F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-15.2538F, 8.9251F, 0.3941F);
		box.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.0556F, 0.1186F, -0.5269F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 82, 157, -0.5F, 0.0F, -1.0F, 1, 1, 2, -0.2F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-15.1823F, 9.4908F, 0.361F);
		box.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.0556F, 0.1186F, -1.2687F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 90, 157, -0.5F, 0.0F, -1.0F, 1, 1, 2, -0.2F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-13.8411F, 9.4405F, 0.2728F);
		box.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.0556F, 0.1186F, -2.0104F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 23, 103, -0.5F, -1.0F, -1.0F, 1, 2, 2, -0.2F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-13.8411F, 3.4405F, 0.2728F);
		box.addChild(cube_r18);
		setRotationAngle(cube_r18, -0.0556F, 0.1186F, -2.0104F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 22, 112, -0.5F, -1.0F, -1.0F, 1, 2, 2, -0.2F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-15.4169F, 8.766F, 0.3811F);
		box.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0451F, 0.1378F, 2.7651F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 99, 157, -0.6124F, -0.9213F, -0.8828F, 1, 1, 2, -0.2F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-15.4169F, 8.4823F, 0.5248F);
		box.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0972F, 0.0108F, 2.7832F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 96, 0, -0.4005F, -0.5603F, -1.0243F, 1, 2, 2, -0.2F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-15.9985F, 6.8205F, 0.514F);
		box.addChild(cube_r21);
		setRotationAngle(cube_r21, -0.1073F, -0.0654F, 3.0942F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 96, 23, -0.5F, -1.0F, -1.0F, 1, 2, 2, -0.2F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-15.6331F, 5.5186F, 0.3777F);
		box.addChild(cube_r22);
		setRotationAngle(cube_r22, -0.1135F, 0.0653F, -2.6217F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 15, 103, -0.5F, -1.0F, -1.0F, 1, 2, 2, -0.2F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-14.8331F, 4.2446F, 0.2746F);
		box.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, -2.618F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 105, 9, -0.5F, -1.0F, -1.0F, 1, 2, 2, -0.2F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-12.7F, 3.6F, 0.2F);
		box.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, -1.0472F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 85, 112, -0.5F, -1.0F, -1.0F, 1, 2, 2, -0.2F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-11.3066F, 2.7719F, -8.1F);
		box.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.0F, 0.3927F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 105, 4, -1.0F, -1.0F, 3.5F, 2, 2, 1, 0.0F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 86, 32, -1.0F, -1.0F, 4.5F, 1, 2, 7, 0.0F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 105, 13, -1.0F, -1.0F, 11.5F, 2, 2, 1, 0.0F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-10.5412F, 2.0066F, -8.1F);
		box.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, 1.1781F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 10, 158, -1.0F, -1.0F, 3.5F, 2, 2, 1, 0.0F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 72, 158, -1.0F, -1.0F, 11.5F, 2, 2, 1, 0.0F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(-10.2281F, 13.0066F, 0.7F);
		box.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, 0.0F, 0.3927F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 126, 76, -1.0F, -1.0F, 2.5F, 2, 2, 1, 0.0F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-10.9934F, 12.2412F, 0.7F);
		box.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, 0.0F, 1.1781F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 121, 157, -1.0F, -1.0F, 2.5F, 2, 2, 1, 0.0F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(-10.9934F, 12.2412F, 0.0F);
		box.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.0F, 0.0F, 1.1781F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 121, 143, -1.0F, -1.0F, -4.5F, 2, 2, 8, 0.0F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(-10.2281F, 13.0066F, 0.0F);
		box.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.0F, 0.0F, 0.3927F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 49, 142, -1.0F, -1.0F, -4.5F, 2, 2, 8, 0.0F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(5.9934F, 12.2412F, 0.7F);
		box.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.0F, 0.0F, 0.3927F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 83, 96, -1.0F, -1.0F, 2.5F, 2, 2, 1, 0.0F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(5.2281F, 13.0066F, 0.7F);
		box.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.0F, 0.0F, 1.1781F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 72, 127, -1.0F, -1.0F, 2.5F, 2, 2, 1, 0.0F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(5.9934F, 12.2412F, 0.0F);
		box.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.0F, 0.0F, 0.3927F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 99, 143, -1.0F, -1.0F, -4.5F, 2, 2, 8, 0.0F, false));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(5.2281F, 13.0066F, 0.0F);
		box.addChild(cube_r34);
		setRotationAngle(cube_r34, 0.0F, 0.0F, 1.1781F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 144, 0, -1.0F, -1.0F, -4.5F, 2, 2, 8, 0.0F, false));

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(6.3066F, 2.7719F, -0.1F);
		box.addChild(cube_r35);
		setRotationAngle(cube_r35, 0.0F, 0.0F, 1.1781F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 72, 112, -1.0F, -1.0F, -4.5F, 2, 2, 9, 0.0F, false));

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(5.5412F, 2.0066F, -0.1F);
		box.addChild(cube_r36);
		setRotationAngle(cube_r36, 0.0F, 0.0F, 0.3927F);
		cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 114, -1.0F, -1.0F, -4.5F, 2, 2, 9, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		box.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}