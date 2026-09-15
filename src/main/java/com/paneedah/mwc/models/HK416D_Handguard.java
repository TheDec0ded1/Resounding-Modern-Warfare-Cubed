package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class HK416D_Handguard extends ModelBase {
	private final ModelRenderer handguard;
	private final ModelRenderer bone2;
	private final ModelRenderer bone_r1;
	private final ModelRenderer bone_r32;
	private final ModelRenderer bone_r2;
	private final ModelRenderer bone_r3;
	private final ModelRenderer bone_r4;
	private final ModelRenderer bone_r5;
	private final ModelRenderer bone_r6;
	private final ModelRenderer bone_r7;
	private final ModelRenderer bone_r8;
	private final ModelRenderer bone_r9;
	private final ModelRenderer bone_r10;
	private final ModelRenderer bone_r11;
	private final ModelRenderer bone_r12;
	private final ModelRenderer bone_r13;
	private final ModelRenderer bone_r14;
	private final ModelRenderer bone_r15;
	private final ModelRenderer bone_r16;
	private final ModelRenderer handguard10;
	private final ModelRenderer handguard2;
	private final ModelRenderer bone_r33;
	private final ModelRenderer bone_r34;
	private final ModelRenderer bone_r35;
	private final ModelRenderer bone_r36;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5_r1;
	private final ModelRenderer bone5_r2;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4_r1;
	private final ModelRenderer bone4_r2;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer bone6;
	private final ModelRenderer bone9_r1;
	private final ModelRenderer bone7_r1;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer rails2;
	private final ModelRenderer rails3_r1;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;

	public HK416D_Handguard() {
		textureWidth = 432;
		textureHeight = 432;

		handguard = new ModelRenderer(this);
		handguard.setRotationPoint(0.0F, 23.0F, 0.0F);
		

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
		handguard.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 404, 387, -1.3F, -36.2882F, -27.2F, 2, 2, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 306, 155, -3.7F, -36.2882F, -27.2F, 1, 2, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 276, 27, -2.3F, -35.5882F, -47.703F, 2, 1, 25, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 418, 346, -2.3F, -35.5882F, -50.701F, 2, 1, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 254, 196, -2.7F, -40.0F, -50.699F, 1, 1, 28, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 266, 118, -1.3F, -40.0F, -50.699F, 1, 1, 28, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 216, 29, -2.5F, -40.75F, -50.699F, 2, 1, 28, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 0, 247, -4.0658F, -37.4941F, -50.701F, 1, 1, 28, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 254, 167, 0.0658F, -37.4941F, -50.701F, 1, 1, 28, 0.0F, false));

		bone_r1 = new ModelRenderer(this);
		bone_r1.setRotationPoint(-1.5F, -34.3152F, -49.6433F);
		bone2.addChild(bone_r1);
		setRotationAngle(bone_r1, -0.1309F, 0.0F, 0.0F);
		bone_r1.cubeList.add(new ModelBox(bone_r1, 90, 414, -1.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

		bone_r32 = new ModelRenderer(this);
		bone_r32.setRotationPoint(-1.5F, -40.3848F, -49.6423F);
		bone2.addChild(bone_r32);
		setRotationAngle(bone_r32, 0.1309F, 0.0F, 0.0F);
		bone_r32.cubeList.add(new ModelBox(bone_r32, 412, 244, -1.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

		bone_r2 = new ModelRenderer(this);
		bone_r2.setRotationPoint(-2.7F, -40.0F, -50.7F);
		bone2.addChild(bone_r2);
		setRotationAngle(bone_r2, 0.0F, 0.0F, 0.9774F);
		bone_r2.cubeList.add(new ModelBox(bone_r2, 62, 244, 0.0F, -1.0F, 0.0F, 1, 1, 28, 0.0F, false));

		bone_r3 = new ModelRenderer(this);
		bone_r3.setRotationPoint(-0.3F, -40.0F, -50.7F);
		bone2.addChild(bone_r3);
		setRotationAngle(bone_r3, 0.0F, 0.0F, -0.9774F);
		bone_r3.cubeList.add(new ModelBox(bone_r3, 120, 244, -1.0F, -1.0F, 0.0F, 1, 1, 28, 0.0F, false));

		bone_r4 = new ModelRenderer(this);
		bone_r4.setRotationPoint(-2.55F, -39.1F, -29.7F);
		bone2.addChild(bone_r4);
		setRotationAngle(bone_r4, 0.0F, 0.0F, -0.4014F);
		bone_r4.cubeList.add(new ModelBox(bone_r4, 302, 398, -0.9219F, -0.1841F, -0.001F, 1, 1, 7, 0.0F, false));
		bone_r4.cubeList.add(new ModelBox(bone_r4, 108, 417, -0.9219F, -0.1841F, -4.001F, 1, 1, 2, 0.0F, false));
		bone_r4.cubeList.add(new ModelBox(bone_r4, 114, 417, -0.9219F, -0.1841F, -10.001F, 1, 1, 2, 0.0F, false));
		bone_r4.cubeList.add(new ModelBox(bone_r4, 192, 417, -0.9219F, -0.1841F, -16.001F, 1, 1, 2, 0.0F, false));
		bone_r4.cubeList.add(new ModelBox(bone_r4, 58, 273, -0.3219F, -0.1851F, -21.002F, 1, 1, 28, 0.0F, false));
		bone_r4.cubeList.add(new ModelBox(bone_r4, 422, 78, -0.9219F, -0.1841F, -21.0F, 1, 1, 1, 0.0F, false));

		bone_r5 = new ModelRenderer(this);
		bone_r5.setRotationPoint(-2.55F, -35.2F, -29.7F);
		bone2.addChild(bone_r5);
		setRotationAngle(bone_r5, 0.0F, 0.0F, 0.4014F);
		bone_r5.cubeList.add(new ModelBox(bone_r5, 318, 398, -0.8F, -0.5289F, -0.001F, 1, 1, 7, 0.0F, false));
		bone_r5.cubeList.add(new ModelBox(bone_r5, 198, 417, -0.8F, -0.5289F, -4.001F, 1, 1, 2, 0.0F, false));
		bone_r5.cubeList.add(new ModelBox(bone_r5, 204, 417, -0.8F, -0.5289F, -10.001F, 1, 1, 2, 0.0F, false));
		bone_r5.cubeList.add(new ModelBox(bone_r5, 422, 80, -0.8F, -0.5289F, -18.001F, 1, 1, 1, 0.0F, false));
		bone_r5.cubeList.add(new ModelBox(bone_r5, 210, 417, -0.8F, -0.5289F, -16.001F, 1, 1, 2, 0.0F, false));
		bone_r5.cubeList.add(new ModelBox(bone_r5, 0, 329, -0.2F, -0.5279F, -17.002F, 1, 1, 24, 0.0F, false));
		bone_r5.cubeList.add(new ModelBox(bone_r5, 422, 82, -0.8F, -0.5289F, -21.0F, 1, 1, 1, 0.0F, false));

		bone_r6 = new ModelRenderer(this);
		bone_r6.setRotationPoint(-0.45F, -35.2F, -29.7F);
		bone2.addChild(bone_r6);
		setRotationAngle(bone_r6, 0.0F, 0.0F, -0.4014F);
		bone_r6.cubeList.add(new ModelBox(bone_r6, 334, 398, -0.2F, -0.5289F, -0.001F, 1, 1, 7, 0.0F, false));
		bone_r6.cubeList.add(new ModelBox(bone_r6, 216, 417, -0.2F, -0.5289F, -4.001F, 1, 1, 2, 0.0F, false));
		bone_r6.cubeList.add(new ModelBox(bone_r6, 222, 417, -0.2F, -0.5289F, -10.001F, 1, 1, 2, 0.0F, false));
		bone_r6.cubeList.add(new ModelBox(bone_r6, 84, 422, -0.2F, -0.5289F, -18.001F, 1, 1, 1, 0.0F, false));
		bone_r6.cubeList.add(new ModelBox(bone_r6, 228, 417, -0.2F, -0.5289F, -16.001F, 1, 1, 2, 0.0F, false));
		bone_r6.cubeList.add(new ModelBox(bone_r6, 330, 0, -0.8F, -0.5279F, -17.002F, 1, 1, 24, 0.0F, false));
		bone_r6.cubeList.add(new ModelBox(bone_r6, 422, 84, -0.2F, -0.5289F, -21.0F, 1, 1, 1, 0.0F, false));

		bone_r7 = new ModelRenderer(this);
		bone_r7.setRotationPoint(-0.45F, -39.1F, -29.7F);
		bone2.addChild(bone_r7);
		setRotationAngle(bone_r7, 0.0F, 0.0F, 0.4014F);
		bone_r7.cubeList.add(new ModelBox(bone_r7, 350, 398, -0.0781F, -0.1841F, -0.001F, 1, 1, 7, 0.0F, false));
		bone_r7.cubeList.add(new ModelBox(bone_r7, 234, 417, -0.0781F, -0.1841F, -4.001F, 1, 1, 2, 0.0F, false));
		bone_r7.cubeList.add(new ModelBox(bone_r7, 240, 417, -0.0781F, -0.1841F, -10.001F, 1, 1, 2, 0.0F, false));
		bone_r7.cubeList.add(new ModelBox(bone_r7, 262, 417, -0.0781F, -0.1841F, -16.001F, 1, 1, 2, 0.0F, false));
		bone_r7.cubeList.add(new ModelBox(bone_r7, 116, 273, -0.6781F, -0.1851F, -21.002F, 1, 1, 28, 0.0F, false));
		bone_r7.cubeList.add(new ModelBox(bone_r7, 422, 86, -0.0781F, -0.1841F, -21.0F, 1, 1, 1, 0.0F, false));

		bone_r8 = new ModelRenderer(this);
		bone_r8.setRotationPoint(-3.85F, -37.8F, -29.7F);
		bone2.addChild(bone_r8);
		setRotationAngle(bone_r8, 0.0F, 0.0F, 0.4014F);
		bone_r8.cubeList.add(new ModelBox(bone_r8, 44, 399, -0.0781F, -1.1841F, -0.002F, 1, 1, 7, 0.0F, false));
		bone_r8.cubeList.add(new ModelBox(bone_r8, 374, 398, -0.0841F, -1.1694F, -4.001F, 1, 1, 2, 0.0F, false));
		bone_r8.cubeList.add(new ModelBox(bone_r8, 268, 417, -0.0781F, -1.1841F, -10.0F, 1, 1, 2, 0.0F, false));
		bone_r8.cubeList.add(new ModelBox(bone_r8, 274, 417, -0.0781F, -1.1841F, -16.0F, 1, 1, 2, 0.0F, false));
		bone_r8.cubeList.add(new ModelBox(bone_r8, 178, 244, -0.0791F, -0.6341F, -21.001F, 1, 1, 28, 0.0F, false));
		bone_r8.cubeList.add(new ModelBox(bone_r8, 88, 422, -0.0781F, -1.1841F, -20.999F, 1, 1, 1, 0.0F, false));

		bone_r9 = new ModelRenderer(this);
		bone_r9.setRotationPoint(-3.85F, -36.5F, -29.7F);
		bone2.addChild(bone_r9);
		setRotationAngle(bone_r9, 0.0F, 0.0F, -0.4014F);
		bone_r9.cubeList.add(new ModelBox(bone_r9, 60, 399, -0.2F, 0.4711F, -0.003F, 1, 1, 7, 0.0F, false));
		bone_r9.cubeList.add(new ModelBox(bone_r9, 368, 415, -0.2F, 0.4711F, -4.0F, 1, 1, 2, 0.0F, false));
		bone_r9.cubeList.add(new ModelBox(bone_r9, 280, 417, -0.2F, 0.4711F, -10.0F, 1, 1, 2, 0.0F, false));
		bone_r9.cubeList.add(new ModelBox(bone_r9, 422, 88, -0.2F, 0.4711F, -18.0F, 1, 1, 1, 0.0F, false));
		bone_r9.cubeList.add(new ModelBox(bone_r9, 286, 417, -0.2F, 0.4711F, -16.0F, 1, 1, 2, 0.0F, false));
		bone_r9.cubeList.add(new ModelBox(bone_r9, 50, 303, -0.201F, -0.0789F, -21.001F, 1, 1, 1, 0.0F, false));
		bone_r9.cubeList.add(new ModelBox(bone_r9, 282, 273, -0.201F, -0.0789F, -18.001F, 1, 1, 25, 0.0F, false));
		bone_r9.cubeList.add(new ModelBox(bone_r9, 422, 90, -0.2F, 0.4711F, -20.999F, 1, 1, 1, 0.0F, false));

		bone_r10 = new ModelRenderer(this);
		bone_r10.setRotationPoint(0.85F, -36.5F, -29.7F);
		bone2.addChild(bone_r10);
		setRotationAngle(bone_r10, 0.0F, 0.0F, 0.4014F);
		bone_r10.cubeList.add(new ModelBox(bone_r10, 76, 399, -0.8F, 0.4711F, -0.003F, 1, 1, 7, 0.0F, false));
		bone_r10.cubeList.add(new ModelBox(bone_r10, 374, 415, -0.8F, 0.4711F, -4.0F, 1, 1, 2, 0.0F, false));
		bone_r10.cubeList.add(new ModelBox(bone_r10, 292, 417, -0.8F, 0.4711F, -10.0F, 1, 1, 2, 0.0F, false));
		bone_r10.cubeList.add(new ModelBox(bone_r10, 92, 422, -0.8F, 0.4711F, -18.0F, 1, 1, 1, 0.0F, false));
		bone_r10.cubeList.add(new ModelBox(bone_r10, 298, 417, -0.8F, 0.4711F, -16.0F, 1, 1, 2, 0.0F, false));
		bone_r10.cubeList.add(new ModelBox(bone_r10, 422, 92, -0.799F, -0.0789F, -21.001F, 1, 1, 1, 0.0F, false));
		bone_r10.cubeList.add(new ModelBox(bone_r10, 294, 225, -0.799F, -0.0789F, -18.001F, 1, 1, 25, 0.0F, false));
		bone_r10.cubeList.add(new ModelBox(bone_r10, 422, 94, -0.8F, 0.4711F, -20.999F, 1, 1, 1, 0.0F, false));

		bone_r11 = new ModelRenderer(this);
		bone_r11.setRotationPoint(0.85F, -37.8F, -29.7F);
		bone2.addChild(bone_r11);
		setRotationAngle(bone_r11, 0.0F, 0.0F, -0.4014F);
		bone_r11.cubeList.add(new ModelBox(bone_r11, 132, 399, -0.9219F, -1.1841F, -0.002F, 1, 1, 7, 0.0F, false));
		bone_r11.cubeList.add(new ModelBox(bone_r11, 416, 215, -0.9219F, -1.1841F, -4.0F, 1, 1, 2, 0.0F, false));
		bone_r11.cubeList.add(new ModelBox(bone_r11, 304, 417, -0.9219F, -1.1841F, -10.0F, 1, 1, 2, 0.0F, false));
		bone_r11.cubeList.add(new ModelBox(bone_r11, 310, 417, -0.9219F, -1.1841F, -16.0F, 1, 1, 2, 0.0F, false));
		bone_r11.cubeList.add(new ModelBox(bone_r11, 236, 244, -0.9209F, -0.6341F, -21.001F, 1, 1, 28, 0.0F, false));
		bone_r11.cubeList.add(new ModelBox(bone_r11, 96, 422, -0.9219F, -1.1841F, -20.999F, 1, 1, 1, 0.0F, false));

		bone_r12 = new ModelRenderer(this);
		bone_r12.setRotationPoint(-3.85F, -36.5F, -47.0F);
		bone2.addChild(bone_r12);
		setRotationAngle(bone_r12, -0.7854F, 0.0F, -0.4014F);
		bone_r12.cubeList.add(new ModelBox(bone_r12, 278, 303, -0.1999F, 0.2831F, -0.6679F, 1, 1, 1, 0.0F, false));

		bone_r13 = new ModelRenderer(this);
		bone_r13.setRotationPoint(0.85F, -36.5F, -47.0F);
		bone2.addChild(bone_r13);
		setRotationAngle(bone_r13, -0.7854F, 0.0F, 0.4014F);
		bone_r13.cubeList.add(new ModelBox(bone_r13, 422, 96, -0.8001F, 0.2831F, -0.6679F, 1, 1, 1, 0.0F, false));

		bone_r14 = new ModelRenderer(this);
		bone_r14.setRotationPoint(-3.85F, -36.5F, -49.1F);
		bone2.addChild(bone_r14);
		setRotationAngle(bone_r14, -0.7854F, 0.0F, -0.4014F);
		bone_r14.cubeList.add(new ModelBox(bone_r14, 50, 305, -0.1999F, 0.2831F, -0.6679F, 1, 1, 1, 0.0F, false));

		bone_r15 = new ModelRenderer(this);
		bone_r15.setRotationPoint(0.85F, -36.5F, -49.1F);
		bone2.addChild(bone_r15);
		setRotationAngle(bone_r15, -0.7854F, 0.0F, 0.4014F);
		bone_r15.cubeList.add(new ModelBox(bone_r15, 422, 98, -0.8001F, 0.2831F, -0.6679F, 1, 1, 1, 0.0F, false));

		bone_r16 = new ModelRenderer(this);
		bone_r16.setRotationPoint(-3.9F, -35.3F, -26.8F);
		bone2.addChild(bone_r16);
		setRotationAngle(bone_r16, -0.3316F, 0.0F, 0.0F);
		bone_r16.cubeList.add(new ModelBox(bone_r16, 100, 422, 0.0F, -0.5161F, 0.1666F, 1, 1, 1, -0.1F, false));
		bone_r16.cubeList.add(new ModelBox(bone_r16, 422, 103, 3.8F, -0.5161F, 0.1666F, 1, 1, 1, -0.1F, false));

		handguard10 = new ModelRenderer(this);
		handguard10.setRotationPoint(-2.7F, -36.2F, -50.7F);
		bone2.addChild(handguard10);
		handguard10.cubeList.add(new ModelBox(handguard10, 104, 422, 0.0F, 0.6108F, 0.001F, 1, 1, 1, 0.0F, false));
		handguard10.cubeList.add(new ModelBox(handguard10, 282, 299, 0.0F, 0.6108F, 2.998F, 1, 1, 25, 0.0F, false));

		handguard2 = new ModelRenderer(this);
		handguard2.setRotationPoint(-3.8F, -44.2F, -49.0F);
		handguard.addChild(handguard2);
		handguard2.cubeList.add(new ModelBox(handguard2, 216, 88, -0.799F, 6.25F, -1.702F, 1, 2, 28, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 216, 58, 4.401F, 6.25F, -1.702F, 1, 2, 28, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 216, 0, 1.3F, 9.25F, -1.7F, 2, 1, 28, 0.0F, false));

		bone_r33 = new ModelRenderer(this);
		bone_r33.setRotationPoint(5.0358F, 7.25F, -0.6453F);
		handguard2.addChild(bone_r33);
		setRotationAngle(bone_r33, 0.0F, 0.1309F, 0.0F);
		bone_r33.cubeList.add(new ModelBox(bone_r33, 306, 159, -0.5F, -0.991F, -1.0F, 1, 2, 2, 0.0F, false));

		bone_r34 = new ModelRenderer(this);
		bone_r34.setRotationPoint(-15.2503F, 44.65F, 47.535F);
		handguard2.addChild(bone_r34);
		setRotationAngle(bone_r34, 0.0F, -0.1309F, 0.0F);
		bone_r34.cubeList.add(new ModelBox(bone_r34, 306, 163, 7.901F, -38.391F, -50.702F, 1, 2, 2, 0.0F, false));

		bone_r35 = new ModelRenderer(this);
		bone_r35.setRotationPoint(0.4471F, 7.25F, 12.0131F);
		handguard2.addChild(bone_r35);
		setRotationAngle(bone_r35, 0.0F, 0.1309F, 0.0F);
		bone_r35.cubeList.add(new ModelBox(bone_r35, 322, 53, -3.1F, -0.991F, 12.0F, 1, 2, 2, 0.0F, false));

		bone_r36 = new ModelRenderer(this);
		bone_r36.setRotationPoint(4.1549F, 7.25F, 12.0131F);
		handguard2.addChild(bone_r36);
		setRotationAngle(bone_r36, 0.0F, -0.1309F, 0.0F);
		bone_r36.cubeList.add(new ModelBox(bone_r36, 150, 328, 2.1F, -0.991F, 12.0F, 1, 2, 2, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(5.3F, -5.7F, -0.45F);
		handguard2.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 0.0F, 1.5708F);
		bone4.cubeList.add(new ModelBox(bone4, 352, 418, 11.975F, -0.8F, 0.8F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 368, 418, 11.975F, -0.8F, 2.05F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 418, 373, 11.975F, -0.8F, 3.3F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 374, 418, 11.975F, -0.8F, 4.55F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 418, 375, 11.975F, -0.8F, 5.8F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 418, 377, 11.975F, -0.8F, 7.05F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 418, 379, 11.975F, -0.8F, 8.3F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 418, 381, 11.975F, -0.8F, 9.55F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 418, 383, 11.975F, -0.8F, 10.85F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 418, 385, 11.975F, -0.8F, 12.1F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 80, 419, 11.975F, -0.8F, 13.35F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 126, 419, 11.975F, -0.8F, 14.6F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 132, 419, 11.975F, -0.8F, 15.85F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 138, 419, 11.975F, -0.8F, 17.1F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 144, 419, 11.975F, -0.8F, 18.35F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 358, 406, 11.975F, -0.8F, 23.4F, 2, 1, 2, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 150, 419, 11.975F, -0.8F, 22.15F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 156, 419, 11.975F, -0.8F, 20.9F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 162, 419, 11.975F, -0.8F, 19.65F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 358, 419, 11.975F, -0.8F, 0.2F, 2, 1, 1, -0.199F, false));

		bone5_r1 = new ModelRenderer(this);
		bone5_r1.setRotationPoint(13.175F, -0.1324F, 0.1862F);
		bone4.addChild(bone5_r1);
		setRotationAngle(bone5_r1, 0.2618F, 0.0F, 0.0F);
		bone5_r1.cubeList.add(new ModelBox(bone5_r1, 98, 414, -1.2F, -0.5966F, -1.4741F, 2, 1, 2, -0.199F, false));

		bone5_r2 = new ModelRenderer(this);
		bone5_r2.setRotationPoint(13.175F, -0.2234F, 25.3976F);
		bone4.addChild(bone5_r2);
		setRotationAngle(bone5_r2, -0.3054F, 0.0F, 0.0F);
		bone5_r2.cubeList.add(new ModelBox(bone5_r2, 114, 414, -1.2F, -0.5F, -0.5F, 2, 1, 2, -0.199F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-1.6F, 0.0F, -1.25F);
		bone4.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 0.8901F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 426, 60, 8.0026F, -11.2827F, 1.45F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 426, 62, 8.0026F, -11.2827F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 426, 64, 8.0026F, -11.2827F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 426, 66, 8.0026F, -11.2827F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 426, 68, 8.0026F, -11.2827F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 426, 70, 8.0026F, -11.2827F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 426, 72, 8.0026F, -11.2827F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 426, 74, 8.0026F, -11.2827F, 3.3F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 426, 76, 8.0026F, -11.2827F, 19.6F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 426, 78, 8.0026F, -11.2827F, 18.35F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 80, 426, 8.0026F, -11.2827F, 17.1F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 426, 80, 8.0026F, -11.2827F, 15.85F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 426, 82, 8.0026F, -11.2827F, 14.6F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 84, 426, 8.0026F, -11.2827F, 13.35F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 426, 84, 8.0026F, -11.2827F, 12.1F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 426, 86, 8.0026F, -11.2827F, 20.9F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 88, 426, 8.0026F, -11.2827F, 22.15F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 426, 88, 8.0026F, -11.2827F, 23.4F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 418, 330, 8.0026F, -11.2827F, 24.65F, 1, 1, 2, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 426, 90, 8.0026F, -11.2827F, 2.05F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 334, 301, 8.0546F, -11.1307F, 2.198F, 1, 1, 23, -0.35F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 0.0F, -1.25F);
		bone4.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.8901F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 422, 105, 8.3352F, 10.1275F, 1.45F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 422, 107, 8.3352F, 10.1275F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 108, 422, 8.3352F, 10.1275F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 422, 109, 8.3352F, 10.1275F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 422, 111, 8.3352F, 10.1275F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 112, 422, 8.3352F, 10.1275F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 422, 113, 8.3352F, 10.1275F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 422, 115, 8.3352F, 10.1275F, 3.3F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 422, 117, 8.3352F, 10.1275F, 19.6F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 422, 119, 8.3352F, 10.1275F, 18.35F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 422, 121, 8.3352F, 10.1275F, 17.1F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 422, 123, 8.3352F, 10.1275F, 15.85F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 422, 125, 8.3352F, 10.1275F, 14.6F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 422, 127, 8.3352F, 10.1275F, 13.35F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 422, 129, 8.3352F, 10.1275F, 12.1F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 422, 131, 8.3352F, 10.1275F, 20.9F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 422, 133, 8.3352F, 10.1275F, 22.15F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 422, 135, 8.3352F, 10.1275F, 23.4F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 316, 417, 8.3352F, 10.1275F, 24.65F, 1, 1, 2, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 422, 137, 8.3352F, 10.1275F, 2.05F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 354, 8.2832F, 10.2795F, 2.198F, 1, 1, 23, -0.35F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-0.5F, 7.5F, 13.313F);
		handguard2.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.0F, -1.5708F);
		bone3.cubeList.add(new ModelBox(bone3, 420, 0, -0.775F, -1.0F, -12.963F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 420, 2, -0.775F, -1.0F, -11.713F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 420, 4, -0.775F, -1.0F, -10.463F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 6, 420, -0.775F, -1.0F, -9.213F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 420, 6, -0.775F, -1.0F, -7.963F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 420, 8, -0.775F, -1.0F, -6.713F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 420, 10, -0.775F, -1.0F, -5.463F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 12, 420, -0.775F, -1.0F, -4.213F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 420, 12, -0.775F, -1.0F, -2.913F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 420, 14, -0.775F, -1.0F, -1.663F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 420, 16, -0.775F, -1.0F, -0.413F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 420, 18, -0.775F, -1.0F, 0.837F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 420, 20, -0.775F, -1.0F, 2.087F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 420, 22, -0.775F, -1.0F, 3.337F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 420, 24, -0.775F, -1.0F, 4.587F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 410, 100, -0.775F, -1.0F, 9.637F, 2, 1, 2, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 420, 26, -0.775F, -1.0F, 8.387F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 420, 28, -0.775F, -1.0F, 7.137F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 420, 30, -0.775F, -1.0F, 5.887F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 420, 32, -0.775F, -1.0F, -13.563F, 2, 1, 1, -0.199F, false));

		bone4_r1 = new ModelRenderer(this);
		bone4_r1.setRotationPoint(0.025F, -0.4323F, -13.5768F);
		bone3.addChild(bone4_r1);
		setRotationAngle(bone4_r1, 0.2618F, 0.0F, 0.0F);
		bone4_r1.cubeList.add(new ModelBox(bone4_r1, 106, 414, -0.8F, -0.5F, -1.5F, 2, 1, 2, -0.199F, false));

		bone4_r2 = new ModelRenderer(this);
		bone4_r2.setRotationPoint(0.025F, -0.4234F, 11.6346F);
		bone3.addChild(bone4_r2);
		setRotationAngle(bone4_r2, -0.3054F, 0.0F, 0.0F);
		bone4_r2.cubeList.add(new ModelBox(bone4_r2, 414, 127, -0.8F, -0.5F, -0.5F, 2, 1, 2, -0.199F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-14.8F, -0.3F, -15.013F);
		bone3.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.8901F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 422, 139, 8.3635F, -11.5695F, 1.45F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 422, 141, 8.3635F, -11.5695F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 422, 143, 8.3635F, -11.5695F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 422, 145, 8.3635F, -11.5695F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 422, 147, 8.3635F, -11.5695F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 422, 149, 8.3635F, -11.5695F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 422, 151, 8.3635F, -11.5695F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 422, 153, 8.3635F, -11.5695F, 3.3F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 422, 155, 8.3635F, -11.5695F, 19.6F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 422, 157, 8.3635F, -11.5695F, 18.35F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 422, 159, 8.3635F, -11.5695F, 17.1F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 422, 161, 8.3635F, -11.5695F, 15.85F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 422, 163, 8.3635F, -11.5695F, 14.6F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 422, 165, 8.3635F, -11.5695F, 13.35F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 422, 167, 8.3635F, -11.5695F, 12.1F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 422, 169, 8.3635F, -11.5695F, 20.9F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 422, 171, 8.3635F, -11.5695F, 22.15F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 422, 173, 8.3635F, -11.5695F, 23.4F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 322, 417, 8.3635F, -11.5695F, 24.65F, 1, 1, 2, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 422, 175, 8.3635F, -11.5695F, 2.05F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 356, 325, 8.4155F, -11.4175F, 2.198F, 1, 1, 23, -0.35F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-13.2F, -0.3F, -15.013F);
		bone3.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.8901F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 422, 177, 8.5407F, 10.5402F, 1.45F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 422, 179, 8.5407F, 10.5402F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 422, 181, 8.5407F, 10.5402F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 422, 183, 8.5407F, 10.5402F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 192, 422, 8.5407F, 10.5402F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 196, 422, 8.5407F, 10.5402F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 200, 422, 8.5407F, 10.5402F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 204, 422, 8.5407F, 10.5402F, 3.3F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 422, 207, 8.5407F, 10.5402F, 19.6F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 208, 422, 8.5407F, 10.5402F, 18.35F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 212, 422, 8.5407F, 10.5402F, 17.1F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 422, 215, 8.5407F, 10.5402F, 15.85F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 216, 422, 8.5407F, 10.5402F, 14.6F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 422, 217, 8.5407F, 10.5402F, 13.35F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 422, 219, 8.5407F, 10.5402F, 12.1F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 220, 422, 8.5407F, 10.5402F, 20.9F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 422, 221, 8.5407F, 10.5402F, 22.15F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 422, 223, 8.5407F, 10.5402F, 23.4F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 328, 417, 8.5407F, 10.5402F, 24.65F, 1, 1, 2, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 224, 422, 8.5407F, 10.5402F, 2.05F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 362, 137, 8.4887F, 10.6922F, 2.198F, 1, 1, 23, -0.35F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(15.5F, 10.1F, 5.55F);
		handguard2.addChild(bone6);
		setRotationAngle(bone6, 0.0F, 0.0F, -3.1416F);
		bone6.cubeList.add(new ModelBox(bone6, 420, 34, 12.2F, -0.85F, 0.8F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 420, 36, 12.2F, -0.85F, 2.05F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 86, 420, 12.2F, -0.85F, 3.3F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 92, 420, 12.2F, -0.85F, 4.55F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 98, 420, 12.2F, -0.85F, 5.8F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 104, 420, 12.2F, -0.85F, 7.05F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 110, 420, 12.2F, -0.85F, 8.3F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 420, 185, 12.2F, -0.85F, -5.45F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 420, 187, 12.2F, -0.85F, -4.2F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 420, 189, 12.2F, -0.85F, -2.95F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 420, 191, 12.2F, -0.85F, -1.7F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 192, 420, 12.2F, -0.85F, -0.45F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 420, 193, 12.2F, -0.85F, 9.55F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 420, 195, 12.2F, -0.85F, 12.05F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 420, 197, 12.2F, -0.85F, 10.8F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 198, 420, 12.2F, -0.85F, 14.55F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 420, 199, 12.2F, -0.85F, 13.3F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 420, 201, 12.2F, -0.85F, 17.05F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 420, 203, 12.2F, -0.85F, 15.8F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 204, 420, 12.2F, -0.85F, 18.85F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 420, 205, 12.2F, -0.85F, 18.3F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 420, 209, 12.2F, -0.85F, -6.05F, 2, 1, 1, -0.199F, false));

		bone9_r1 = new ModelRenderer(this);
		bone9_r1.setRotationPoint(13.2F, -0.4823F, -6.0638F);
		bone6.addChild(bone9_r1);
		setRotationAngle(bone9_r1, 0.2618F, 0.0F, 0.0F);
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 420, 272, -1.0F, -0.3068F, -1.4518F, 2, 1, 1, -0.199F, false));
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 420, 270, -1.0F, -0.3068F, -1.1518F, 2, 1, 1, -0.199F, false));
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 270, 420, -1.0F, -0.3068F, -0.5518F, 2, 1, 1, -0.199F, false));

		bone7_r1 = new ModelRenderer(this);
		bone7_r1.setRotationPoint(13.2002F, -23.326F, 19.7966F);
		bone6.addChild(bone7_r1);
		setRotationAngle(bone7_r1, -0.4363F, 0.0F, 0.0F);
		bone7_r1.cubeList.add(new ModelBox(bone7_r1, 16, 414, -1.0002F, 20.413F, 9.2519F, 2, 1, 2, -0.199F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-1.6F, 0.0F, -1.25F);
		bone6.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 0.8901F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 422, 225, 8.1054F, -11.4891F, -4.8F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 422, 227, 8.1054F, -11.4891F, 19.55F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 228, 422, 8.1054F, -11.4891F, 20.1F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 422, 229, 8.1054F, -11.4891F, 17.05F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 422, 231, 8.1054F, -11.4891F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 232, 422, 8.1054F, -11.4891F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 422, 233, 8.1054F, -11.4891F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 422, 235, 8.1054F, -11.4891F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 236, 422, 8.1054F, -11.4891F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 422, 237, 8.1054F, -11.4891F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 422, 239, 8.1054F, -11.4891F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 240, 422, 8.1054F, -11.4891F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 422, 241, 8.1054F, -11.4891F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 258, 422, 8.1054F, -11.4891F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 262, 422, 8.1054F, -11.4891F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 266, 422, 8.1054F, -11.4891F, 3.3F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 270, 422, 8.1054F, -11.4891F, 2.05F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 274, 422, 8.1054F, -11.4891F, 0.8F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 278, 422, 8.1054F, -11.4891F, -0.45F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 282, 422, 8.1054F, -11.4891F, -1.7F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 286, 422, 8.1054F, -11.4891F, -2.95F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 290, 422, 8.1054F, -11.4891F, -4.2F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 330, 25, 8.1574F, -11.3371F, -3.902F, 1, 1, 24, -0.35F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, 0.0F, -1.25F);
		bone6.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -0.8901F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 294, 422, 8.5156F, 10.2709F, -4.8F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 298, 422, 8.5156F, 10.2709F, 19.55F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 302, 422, 8.5156F, 10.2709F, 20.1F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 306, 422, 8.5156F, 10.2709F, 17.05F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 310, 422, 8.5156F, 10.2709F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 314, 422, 8.5156F, 10.2709F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 318, 422, 8.5156F, 10.2709F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 322, 422, 8.5156F, 10.2709F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 326, 422, 8.5156F, 10.2709F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 330, 422, 8.5156F, 10.2709F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 334, 422, 8.5156F, 10.2709F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 338, 422, 8.5156F, 10.2709F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 342, 422, 8.5156F, 10.2709F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 346, 422, 8.5156F, 10.2709F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 422, 348, 8.5156F, 10.2709F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 350, 422, 8.5156F, 10.2709F, 3.3F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 422, 350, 8.5156F, 10.2709F, 2.05F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 422, 352, 8.5156F, 10.2709F, 0.8F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 422, 354, 8.5156F, 10.2709F, -0.45F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 422, 356, 8.5156F, 10.2709F, -1.7F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 422, 358, 8.5156F, 10.2709F, -2.95F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 422, 360, 8.5156F, 10.2709F, -4.2F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 334, 251, 8.4636F, 10.4229F, -3.902F, 1, 1, 24, -0.35F, false));

		rails2 = new ModelRenderer(this);
		rails2.setRotationPoint(-2.3F, -43.1F, -39.75F);
		handguard.addChild(rails2);
		rails2.cubeList.add(new ModelBox(rails2, 210, 420, -0.2F, 1.7F, 16.15F, 2, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 420, 211, -0.2F, 1.7F, 14.95F, 2, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 420, 213, -0.2F, 1.7F, 13.75F, 2, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 216, 420, -0.2F, 1.7F, 12.55F, 2, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 222, 420, -0.2F, 1.7F, 11.35F, 2, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 228, 420, -0.2F, 1.7F, 10.15F, 2, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 234, 420, -0.2F, 1.7F, 8.95F, 2, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 240, 420, -0.2F, 1.7F, 7.75F, 2, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 420, 244, -0.2F, 1.7F, 6.55F, 2, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 420, 246, -0.2F, 1.7F, 5.35F, 2, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 420, 248, -0.2F, 1.7F, 4.15F, 2, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 420, 250, -0.2F, 1.7F, 2.95F, 2, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 420, 252, -0.2F, 1.7F, 1.75F, 2, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 420, 254, -0.2F, 1.7F, 0.55F, 2, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 420, 256, -0.2F, 1.7F, -0.65F, 2, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 258, 420, -0.2F, 1.7F, -1.85F, 2, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 420, 258, -0.2F, 1.7F, -3.05F, 2, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 420, 260, -0.2F, 1.7F, -4.25F, 2, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 420, 262, -0.2F, 1.7F, -5.45F, 2, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 264, 420, -0.2F, 1.7F, -6.65F, 2, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 420, 264, -0.2F, 1.7F, -7.85F, 2, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 420, 266, -0.2F, 1.7F, -9.05F, 2, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 420, 268, -0.2F, 1.7F, -9.65F, 2, 1, 1, -0.2F, false));

		rails3_r1 = new ModelRenderer(this);
		rails3_r1.setRotationPoint(0.8F, 2.2674F, -9.6621F);
		rails2.addChild(rails3_r1);
		setRotationAngle(rails3_r1, 0.2618F, 0.0F, 0.0F);
		rails3_r1.cubeList.add(new ModelBox(rails3_r1, 8, 414, -1.0F, -0.5F, -1.5F, 2, 1, 2, -0.2F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -1.0F, 0.0F);
		rails2.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 422, 362, -2.8506F, 1.8506F, 16.15F, 1, 1, 1, -0.201F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 364, 422, -2.8506F, 1.8506F, 14.95F, 1, 1, 1, -0.201F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 422, 364, -2.8506F, 1.8506F, 13.75F, 1, 1, 1, -0.201F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 422, 366, -2.8506F, 1.8506F, 12.55F, 1, 1, 1, -0.201F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 368, 422, -2.8506F, 1.8506F, 11.35F, 1, 1, 1, -0.201F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 422, 368, -2.8506F, 1.8506F, 10.15F, 1, 1, 1, -0.201F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 422, 370, -2.8506F, 1.8506F, 8.95F, 1, 1, 1, -0.201F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 372, 422, -2.8506F, 1.8506F, 7.75F, 1, 1, 1, -0.201F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 376, 422, -2.8506F, 1.8506F, 6.55F, 1, 1, 1, -0.201F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 380, 422, -2.8506F, 1.8506F, 5.35F, 1, 1, 1, -0.201F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 384, 422, -2.8506F, 1.8506F, 4.15F, 1, 1, 1, -0.201F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 388, 422, -2.8506F, 1.8506F, 2.95F, 1, 1, 1, -0.201F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 422, 391, -2.8506F, 1.8506F, 1.75F, 1, 1, 1, -0.201F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 392, 422, -2.8506F, 1.8506F, 0.55F, 1, 1, 1, -0.201F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 422, 393, -2.8506F, 1.8506F, -0.65F, 1, 1, 1, -0.201F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 422, 395, -2.8506F, 1.8506F, -1.85F, 1, 1, 1, -0.201F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 396, 422, -2.8506F, 1.8506F, -3.05F, 1, 1, 1, -0.201F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 422, 397, -2.8506F, 1.8506F, -4.25F, 1, 1, 1, -0.201F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 422, 399, -2.8506F, 1.8506F, -5.45F, 1, 1, 1, -0.201F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 400, 422, -2.8506F, 1.8506F, -6.65F, 1, 1, 1, -0.201F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 422, 401, -2.8506F, 1.8506F, -7.85F, 1, 1, 1, -0.201F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 422, 403, -2.8506F, 1.8506F, -9.05F, 1, 1, 1, -0.201F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 404, 422, -2.8506F, 1.8506F, -9.65F, 1, 1, 1, -0.201F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 274, 85, -2.9996F, 1.8746F, -8.599F, 1, 1, 26, -0.35F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(1.6F, -1.0F, 3.25F);
		rails2.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.7854F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 408, 422, -2.8506F, 1.8506F, 12.9F, 1, 1, 1, -0.201F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 412, 422, -2.8506F, 1.8506F, 11.7F, 1, 1, 1, -0.201F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 416, 422, -2.8506F, 1.8506F, 10.5F, 1, 1, 1, -0.201F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 422, 416, -2.8506F, 1.8506F, 9.3F, 1, 1, 1, -0.201F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 422, 418, -2.8506F, 1.8506F, 8.1F, 1, 1, 1, -0.201F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 420, 422, -2.8506F, 1.8506F, 6.9F, 1, 1, 1, -0.201F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 423, -2.8506F, 1.8506F, 5.7F, 1, 1, 1, -0.201F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 18, 423, -2.8506F, 1.8506F, 4.5F, 1, 1, 1, -0.201F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 22, 423, -2.8506F, 1.8506F, 3.3F, 1, 1, 1, -0.201F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 26, 423, -2.8506F, 1.8506F, 2.1F, 1, 1, 1, -0.201F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 30, 423, -2.8506F, 1.8506F, 0.9F, 1, 1, 1, -0.201F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 34, 423, -2.8506F, 1.8506F, -0.3F, 1, 1, 1, -0.201F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 38, 423, -2.8506F, 1.8506F, -1.5F, 1, 1, 1, -0.201F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 42, 423, -2.8506F, 1.8506F, -2.7F, 1, 1, 1, -0.201F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 46, 423, -2.8506F, 1.8506F, -3.9F, 1, 1, 1, -0.201F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 50, 423, -2.8506F, 1.8506F, -5.1F, 1, 1, 1, -0.201F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 54, 423, -2.8506F, 1.8506F, -6.3F, 1, 1, 1, -0.201F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 58, 423, -2.8506F, 1.8506F, -7.5F, 1, 1, 1, -0.201F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 62, 423, -2.8506F, 1.8506F, -8.7F, 1, 1, 1, -0.201F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 66, 423, -2.8506F, 1.8506F, -9.9F, 1, 1, 1, -0.201F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 70, 423, -2.8506F, 1.8506F, -11.1F, 1, 1, 1, -0.201F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 74, 423, -2.8506F, 1.8506F, -12.3F, 1, 1, 1, -0.201F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 78, 423, -2.8506F, 1.8506F, -12.9F, 1, 1, 1, -0.201F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 276, -2.8746F, 1.9996F, -11.849F, 1, 1, 26, -0.35F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handguard.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}