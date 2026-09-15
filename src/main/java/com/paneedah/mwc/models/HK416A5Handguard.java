package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class HK416A5Handguard extends ModelBase {
	private final ModelRenderer handguard;
	private final ModelRenderer bone2;
	private final ModelRenderer bone_r1;
	private final ModelRenderer bone_r42;
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
	private final ModelRenderer bone_r43;
	private final ModelRenderer bone_r44;
	private final ModelRenderer bone_r45;
	private final ModelRenderer bone_r47;
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

	public HK416A5Handguard() {
		textureWidth = 512;
		textureHeight = 512;

		handguard = new ModelRenderer(this);
		handguard.setRotationPoint(0.0F, 23.0F, 0.0F);
		

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
		handguard.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 222, 396, -1.3F, -36.2882F, -27.2F, 2, 2, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 258, 297, -3.7F, -36.2882F, -27.2F, 1, 2, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 116, 384, -2.3F, -35.5882F, -47.703F, 2, 1, 25, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 464, 24, -2.3F, -35.5882F, -50.701F, 2, 1, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 180, 335, -2.7F, -40.0F, -50.699F, 1, 1, 28, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 336, 146, -1.3F, -40.0F, -50.699F, 1, 1, 28, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 0, 327, -2.5F, -40.75F, -50.699F, 2, 1, 28, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 252, 333, -4.0658F, -37.4941F, -50.701F, 1, 1, 28, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 310, 333, 0.0658F, -37.4941F, -50.701F, 1, 1, 28, 0.0F, false));

		bone_r1 = new ModelRenderer(this);
		bone_r1.setRotationPoint(-1.5F, -34.3152F, -49.6433F);
		bone2.addChild(bone_r1);
		setRotationAngle(bone_r1, -0.1309F, 0.0F, 0.0F);
		bone_r1.cubeList.add(new ModelBox(bone_r1, 148, 439, -1.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

		bone_r42 = new ModelRenderer(this);
		bone_r42.setRotationPoint(-1.5F, -40.3848F, -49.6423F);
		bone2.addChild(bone_r42);
		setRotationAngle(bone_r42, 0.1309F, 0.0F, 0.0F);
		bone_r42.cubeList.add(new ModelBox(bone_r42, 402, 330, -1.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

		bone_r2 = new ModelRenderer(this);
		bone_r2.setRotationPoint(-2.7F, -40.0F, -50.7F);
		bone2.addChild(bone_r2);
		setRotationAngle(bone_r2, 0.0F, 0.0F, 0.9774F);
		bone_r2.cubeList.add(new ModelBox(bone_r2, 328, 30, 0.0F, -1.0F, 0.0F, 1, 1, 28, 0.0F, false));

		bone_r3 = new ModelRenderer(this);
		bone_r3.setRotationPoint(-0.3F, -40.0F, -50.7F);
		bone2.addChild(bone_r3);
		setRotationAngle(bone_r3, 0.0F, 0.0F, -0.9774F);
		bone_r3.cubeList.add(new ModelBox(bone_r3, 328, 59, -1.0F, -1.0F, 0.0F, 1, 1, 28, 0.0F, false));

		bone_r4 = new ModelRenderer(this);
		bone_r4.setRotationPoint(-2.55F, -39.1F, -29.7F);
		bone2.addChild(bone_r4);
		setRotationAngle(bone_r4, 0.0F, 0.0F, -0.4014F);
		bone_r4.cubeList.add(new ModelBox(bone_r4, 206, 417, -0.9219F, -0.1841F, -0.001F, 1, 1, 7, 0.0F, false));
		bone_r4.cubeList.add(new ModelBox(bone_r4, 26, 492, -0.9219F, -0.1841F, -4.001F, 1, 1, 2, 0.0F, false));
		bone_r4.cubeList.add(new ModelBox(bone_r4, 32, 492, -0.9219F, -0.1841F, -10.001F, 1, 1, 2, 0.0F, false));
		bone_r4.cubeList.add(new ModelBox(bone_r4, 38, 492, -0.9219F, -0.1841F, -16.001F, 1, 1, 2, 0.0F, false));
		bone_r4.cubeList.add(new ModelBox(bone_r4, 336, 175, -0.3219F, -0.1851F, -21.002F, 1, 1, 28, 0.0F, false));
		bone_r4.cubeList.add(new ModelBox(bone_r4, 498, 232, -0.9219F, -0.1841F, -21.0F, 1, 1, 1, 0.0F, false));

		bone_r5 = new ModelRenderer(this);
		bone_r5.setRotationPoint(-2.55F, -35.2F, -29.7F);
		bone2.addChild(bone_r5);
		setRotationAngle(bone_r5, 0.0F, 0.0F, 0.4014F);
		bone_r5.cubeList.add(new ModelBox(bone_r5, 206, 425, -0.8F, -0.5289F, -0.001F, 1, 1, 7, 0.0F, false));
		bone_r5.cubeList.add(new ModelBox(bone_r5, 44, 492, -0.8F, -0.5289F, -4.001F, 1, 1, 2, 0.0F, false));
		bone_r5.cubeList.add(new ModelBox(bone_r5, 50, 492, -0.8F, -0.5289F, -10.001F, 1, 1, 2, 0.0F, false));
		bone_r5.cubeList.add(new ModelBox(bone_r5, 498, 234, -0.8F, -0.5289F, -18.001F, 1, 1, 1, 0.0F, false));
		bone_r5.cubeList.add(new ModelBox(bone_r5, 56, 492, -0.8F, -0.5289F, -16.001F, 1, 1, 2, 0.0F, false));
		bone_r5.cubeList.add(new ModelBox(bone_r5, 322, 415, -0.2F, -0.5279F, -17.002F, 1, 1, 24, 0.0F, false));
		bone_r5.cubeList.add(new ModelBox(bone_r5, 498, 236, -0.8F, -0.5289F, -21.0F, 1, 1, 1, 0.0F, false));

		bone_r6 = new ModelRenderer(this);
		bone_r6.setRotationPoint(-0.45F, -35.2F, -29.7F);
		bone2.addChild(bone_r6);
		setRotationAngle(bone_r6, 0.0F, 0.0F, -0.4014F);
		bone_r6.cubeList.add(new ModelBox(bone_r6, 480, 319, -0.2F, -0.5289F, -0.001F, 1, 1, 7, 0.0F, false));
		bone_r6.cubeList.add(new ModelBox(bone_r6, 62, 492, -0.2F, -0.5289F, -4.001F, 1, 1, 2, 0.0F, false));
		bone_r6.cubeList.add(new ModelBox(bone_r6, 68, 492, -0.2F, -0.5289F, -10.001F, 1, 1, 2, 0.0F, false));
		bone_r6.cubeList.add(new ModelBox(bone_r6, 498, 238, -0.2F, -0.5289F, -18.001F, 1, 1, 1, 0.0F, false));
		bone_r6.cubeList.add(new ModelBox(bone_r6, 74, 492, -0.2F, -0.5289F, -16.001F, 1, 1, 2, 0.0F, false));
		bone_r6.cubeList.add(new ModelBox(bone_r6, 372, 415, -0.8F, -0.5279F, -17.002F, 1, 1, 24, 0.0F, false));
		bone_r6.cubeList.add(new ModelBox(bone_r6, 498, 240, -0.2F, -0.5289F, -21.0F, 1, 1, 1, 0.0F, false));

		bone_r7 = new ModelRenderer(this);
		bone_r7.setRotationPoint(-0.45F, -39.1F, -29.7F);
		bone2.addChild(bone_r7);
		setRotationAngle(bone_r7, 0.0F, 0.0F, 0.4014F);
		bone_r7.cubeList.add(new ModelBox(bone_r7, 482, 146, -0.0781F, -0.1841F, -0.001F, 1, 1, 7, 0.0F, false));
		bone_r7.cubeList.add(new ModelBox(bone_r7, 136, 492, -0.0781F, -0.1841F, -4.001F, 1, 1, 2, 0.0F, false));
		bone_r7.cubeList.add(new ModelBox(bone_r7, 142, 492, -0.0781F, -0.1841F, -10.001F, 1, 1, 2, 0.0F, false));
		bone_r7.cubeList.add(new ModelBox(bone_r7, 148, 492, -0.0781F, -0.1841F, -16.001F, 1, 1, 2, 0.0F, false));
		bone_r7.cubeList.add(new ModelBox(bone_r7, 118, 355, -0.6781F, -0.1851F, -21.002F, 1, 1, 28, 0.0F, false));
		bone_r7.cubeList.add(new ModelBox(bone_r7, 498, 242, -0.0781F, -0.1841F, -21.0F, 1, 1, 1, 0.0F, false));

		bone_r8 = new ModelRenderer(this);
		bone_r8.setRotationPoint(-3.85F, -37.8F, -29.7F);
		bone2.addChild(bone_r8);
		setRotationAngle(bone_r8, 0.0F, 0.0F, 0.4014F);
		bone_r8.cubeList.add(new ModelBox(bone_r8, 482, 289, -0.0781F, -1.1841F, -0.002F, 1, 1, 7, 0.0F, false));
		bone_r8.cubeList.add(new ModelBox(bone_r8, 170, 388, -0.0841F, -1.1694F, -4.001F, 1, 1, 2, 0.0F, false));
		bone_r8.cubeList.add(new ModelBox(bone_r8, 154, 492, -0.0781F, -1.1841F, -10.0F, 1, 1, 2, 0.0F, false));
		bone_r8.cubeList.add(new ModelBox(bone_r8, 492, 154, -0.0781F, -1.1841F, -16.0F, 1, 1, 2, 0.0F, false));
		bone_r8.cubeList.add(new ModelBox(bone_r8, 328, 88, -0.0791F, -0.6341F, -21.001F, 1, 1, 28, 0.0F, false));
		bone_r8.cubeList.add(new ModelBox(bone_r8, 498, 244, -0.0781F, -1.1841F, -20.999F, 1, 1, 1, 0.0F, false));

		bone_r9 = new ModelRenderer(this);
		bone_r9.setRotationPoint(-3.85F, -36.5F, -29.7F);
		bone2.addChild(bone_r9);
		setRotationAngle(bone_r9, 0.0F, 0.0F, -0.4014F);
		bone_r9.cubeList.add(new ModelBox(bone_r9, 482, 297, -0.2F, 0.4711F, -0.003F, 1, 1, 7, 0.0F, false));
		bone_r9.cubeList.add(new ModelBox(bone_r9, 100, 416, -0.2F, 0.4711F, -4.0F, 1, 1, 2, 0.0F, false));
		bone_r9.cubeList.add(new ModelBox(bone_r9, 492, 157, -0.2F, 0.4711F, -10.0F, 1, 1, 2, 0.0F, false));
		bone_r9.cubeList.add(new ModelBox(bone_r9, 498, 246, -0.2F, 0.4711F, -18.0F, 1, 1, 1, 0.0F, false));
		bone_r9.cubeList.add(new ModelBox(bone_r9, 160, 492, -0.2F, 0.4711F, -16.0F, 1, 1, 2, 0.0F, false));
		bone_r9.cubeList.add(new ModelBox(bone_r9, 446, 358, -0.201F, -0.0789F, -21.001F, 1, 1, 1, 0.0F, false));
		bone_r9.cubeList.add(new ModelBox(bone_r9, 54, 386, -0.201F, -0.0789F, -18.001F, 1, 1, 25, 0.0F, false));
		bone_r9.cubeList.add(new ModelBox(bone_r9, 498, 248, -0.2F, 0.4711F, -20.999F, 1, 1, 1, 0.0F, false));

		bone_r10 = new ModelRenderer(this);
		bone_r10.setRotationPoint(0.85F, -36.5F, -29.7F);
		bone2.addChild(bone_r10);
		setRotationAngle(bone_r10, 0.0F, 0.0F, 0.4014F);
		bone_r10.cubeList.add(new ModelBox(bone_r10, 334, 482, -0.8F, 0.4711F, -0.003F, 1, 1, 7, 0.0F, false));
		bone_r10.cubeList.add(new ModelBox(bone_r10, 100, 419, -0.8F, 0.4711F, -4.0F, 1, 1, 2, 0.0F, false));
		bone_r10.cubeList.add(new ModelBox(bone_r10, 492, 160, -0.8F, 0.4711F, -10.0F, 1, 1, 2, 0.0F, false));
		bone_r10.cubeList.add(new ModelBox(bone_r10, 498, 250, -0.8F, 0.4711F, -18.0F, 1, 1, 1, 0.0F, false));
		bone_r10.cubeList.add(new ModelBox(bone_r10, 492, 163, -0.8F, 0.4711F, -16.0F, 1, 1, 2, 0.0F, false));
		bone_r10.cubeList.add(new ModelBox(bone_r10, 498, 252, -0.799F, -0.0789F, -21.001F, 1, 1, 1, 0.0F, false));
		bone_r10.cubeList.add(new ModelBox(bone_r10, 386, 78, -0.799F, -0.0789F, -18.001F, 1, 1, 25, 0.0F, false));
		bone_r10.cubeList.add(new ModelBox(bone_r10, 498, 254, -0.8F, 0.4711F, -20.999F, 1, 1, 1, 0.0F, false));

		bone_r11 = new ModelRenderer(this);
		bone_r11.setRotationPoint(0.85F, -37.8F, -29.7F);
		bone2.addChild(bone_r11);
		setRotationAngle(bone_r11, 0.0F, 0.0F, -0.4014F);
		bone_r11.cubeList.add(new ModelBox(bone_r11, 350, 482, -0.9219F, -1.1841F, -0.002F, 1, 1, 7, 0.0F, false));
		bone_r11.cubeList.add(new ModelBox(bone_r11, 100, 422, -0.9219F, -1.1841F, -4.0F, 1, 1, 2, 0.0F, false));
		bone_r11.cubeList.add(new ModelBox(bone_r11, 166, 492, -0.9219F, -1.1841F, -10.0F, 1, 1, 2, 0.0F, false));
		bone_r11.cubeList.add(new ModelBox(bone_r11, 492, 166, -0.9219F, -1.1841F, -16.0F, 1, 1, 2, 0.0F, false));
		bone_r11.cubeList.add(new ModelBox(bone_r11, 328, 117, -0.9209F, -0.6341F, -21.001F, 1, 1, 28, 0.0F, false));
		bone_r11.cubeList.add(new ModelBox(bone_r11, 498, 256, -0.9219F, -1.1841F, -20.999F, 1, 1, 1, 0.0F, false));

		bone_r12 = new ModelRenderer(this);
		bone_r12.setRotationPoint(-3.85F, -36.5F, -47.0F);
		bone2.addChild(bone_r12);
		setRotationAngle(bone_r12, -0.7854F, 0.0F, -0.4014F);
		bone_r12.cubeList.add(new ModelBox(bone_r12, 96, 455, -0.1999F, 0.2831F, -0.6679F, 1, 1, 1, 0.0F, false));

		bone_r13 = new ModelRenderer(this);
		bone_r13.setRotationPoint(0.85F, -36.5F, -47.0F);
		bone2.addChild(bone_r13);
		setRotationAngle(bone_r13, -0.7854F, 0.0F, 0.4014F);
		bone_r13.cubeList.add(new ModelBox(bone_r13, 498, 258, -0.8001F, 0.2831F, -0.6679F, 1, 1, 1, 0.0F, false));

		bone_r14 = new ModelRenderer(this);
		bone_r14.setRotationPoint(-3.85F, -36.5F, -49.1F);
		bone2.addChild(bone_r14);
		setRotationAngle(bone_r14, -0.7854F, 0.0F, -0.4014F);
		bone_r14.cubeList.add(new ModelBox(bone_r14, 96, 457, -0.1999F, 0.2831F, -0.6679F, 1, 1, 1, 0.0F, false));

		bone_r15 = new ModelRenderer(this);
		bone_r15.setRotationPoint(0.85F, -36.5F, -49.1F);
		bone2.addChild(bone_r15);
		setRotationAngle(bone_r15, -0.7854F, 0.0F, 0.4014F);
		bone_r15.cubeList.add(new ModelBox(bone_r15, 498, 260, -0.8001F, 0.2831F, -0.6679F, 1, 1, 1, 0.0F, false));

		bone_r16 = new ModelRenderer(this);
		bone_r16.setRotationPoint(-3.9F, -35.3F, -26.8F);
		bone2.addChild(bone_r16);
		setRotationAngle(bone_r16, -0.3316F, 0.0F, 0.0F);
		bone_r16.cubeList.add(new ModelBox(bone_r16, 498, 262, 0.0F, -0.5161F, 0.1666F, 1, 1, 1, -0.1F, false));
		bone_r16.cubeList.add(new ModelBox(bone_r16, 498, 264, 3.8F, -0.5161F, 0.1666F, 1, 1, 1, -0.1F, false));

		handguard10 = new ModelRenderer(this);
		handguard10.setRotationPoint(-2.7F, -36.2F, -50.7F);
		bone2.addChild(handguard10);
		handguard10.cubeList.add(new ModelBox(handguard10, 498, 266, 0.0F, 0.6108F, 0.001F, 1, 1, 1, 0.0F, false));
		handguard10.cubeList.add(new ModelBox(handguard10, 386, 230, 0.0F, 0.6108F, 2.998F, 1, 1, 25, 0.0F, false));

		handguard2 = new ModelRenderer(this);
		handguard2.setRotationPoint(-3.8F, -44.2F, -49.0F);
		handguard.addChild(handguard2);
		handguard2.cubeList.add(new ModelBox(handguard2, 328, 0, -0.799F, 6.25F, -1.702F, 1, 2, 28, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 60, 327, 4.401F, 6.25F, -1.702F, 1, 2, 28, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 326, 245, 1.3F, 9.25F, -1.7F, 2, 1, 28, 0.0F, false));

		bone_r43 = new ModelRenderer(this);
		bone_r43.setRotationPoint(5.0358F, 7.25F, -0.6453F);
		handguard2.addChild(bone_r43);
		setRotationAngle(bone_r43, 0.0F, 0.1309F, 0.0F);
		bone_r43.cubeList.add(new ModelBox(bone_r43, 252, 305, -0.5F, -0.999F, -1.0F, 1, 2, 2, 0.0F, false));

		bone_r44 = new ModelRenderer(this);
		bone_r44.setRotationPoint(-15.2503F, 44.65F, 47.535F);
		handguard2.addChild(bone_r44);
		setRotationAngle(bone_r44, 0.0F, -0.1309F, 0.0F);
		bone_r44.cubeList.add(new ModelBox(bone_r44, 252, 309, 7.901F, -38.399F, -50.702F, 1, 2, 2, 0.0F, false));

		bone_r45 = new ModelRenderer(this);
		bone_r45.setRotationPoint(0.4471F, 7.25F, 12.0131F);
		handguard2.addChild(bone_r45);
		setRotationAngle(bone_r45, 0.0F, 0.1309F, 0.0F);
		bone_r45.cubeList.add(new ModelBox(bone_r45, 252, 313, -3.1F, -0.999F, 12.0F, 1, 2, 2, 0.0F, false));

		bone_r47 = new ModelRenderer(this);
		bone_r47.setRotationPoint(4.1549F, 7.25F, 12.0131F);
		handguard2.addChild(bone_r47);
		setRotationAngle(bone_r47, 0.0F, -0.1309F, 0.0F);
		bone_r47.cubeList.add(new ModelBox(bone_r47, 252, 317, 2.1F, -0.999F, 12.0F, 1, 2, 2, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(5.3F, -5.7F, -0.45F);
		handguard2.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 0.0F, 1.5708F);
		bone4.cubeList.add(new ModelBox(bone4, 464, 154, 11.975F, -0.8F, 0.8F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 470, 24, 11.975F, -0.8F, 2.05F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 470, 154, 11.975F, -0.8F, 3.3F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 470, 461, 11.975F, -0.8F, 4.55F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 476, 24, 11.975F, -0.8F, 5.8F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 476, 154, 11.975F, -0.8F, 7.05F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 476, 461, 11.975F, -0.8F, 8.3F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 482, 154, 11.975F, -0.8F, 9.55F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 482, 461, 11.975F, -0.8F, 10.85F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 486, 120, 11.975F, -0.8F, 12.1F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 488, 383, 11.975F, -0.8F, 13.35F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 492, 178, 11.975F, -0.8F, 14.6F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 494, 144, 11.975F, -0.8F, 15.85F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 494, 383, 11.975F, -0.8F, 17.1F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 104, 495, 11.975F, -0.8F, 18.35F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 386, 330, 11.975F, -0.8F, 23.4F, 2, 1, 2, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 110, 495, 11.975F, -0.8F, 22.15F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 116, 495, 11.975F, -0.8F, 20.9F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 122, 495, 11.975F, -0.8F, 19.65F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 128, 495, 11.975F, -0.8F, 0.2F, 2, 1, 1, -0.199F, false));

		bone5_r1 = new ModelRenderer(this);
		bone5_r1.setRotationPoint(13.175F, -0.1324F, 0.1862F);
		bone4.addChild(bone5_r1);
		setRotationAngle(bone5_r1, 0.2618F, 0.0F, 0.0F);
		bone5_r1.cubeList.add(new ModelBox(bone5_r1, 414, 460, -1.2F, -0.5966F, -1.4741F, 2, 1, 2, -0.199F, false));

		bone5_r2 = new ModelRenderer(this);
		bone5_r2.setRotationPoint(13.175F, -0.2234F, 25.3976F);
		bone4.addChild(bone5_r2);
		setRotationAngle(bone5_r2, -0.3054F, 0.0F, 0.0F);
		bone5_r2.cubeList.add(new ModelBox(bone5_r2, 488, 21, -1.2F, -0.5F, -0.5F, 2, 1, 2, -0.199F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-1.6F, 0.0F, -1.25F);
		bone4.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 0.8901F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 502, 299, 8.0026F, -11.2827F, 1.45F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 502, 301, 8.0026F, -11.2827F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 502, 303, 8.0026F, -11.2827F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 502, 319, 8.0026F, -11.2827F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 502, 321, 8.0026F, -11.2827F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 502, 323, 8.0026F, -11.2827F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 502, 325, 8.0026F, -11.2827F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 502, 327, 8.0026F, -11.2827F, 3.3F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 502, 329, 8.0026F, -11.2827F, 19.6F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 502, 331, 8.0026F, -11.2827F, 18.35F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 502, 333, 8.0026F, -11.2827F, 17.1F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 502, 335, 8.0026F, -11.2827F, 15.85F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 502, 337, 8.0026F, -11.2827F, 14.6F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 502, 339, 8.0026F, -11.2827F, 13.35F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 502, 341, 8.0026F, -11.2827F, 12.1F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 502, 343, 8.0026F, -11.2827F, 20.9F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 502, 345, 8.0026F, -11.2827F, 22.15F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 502, 347, 8.0026F, -11.2827F, 23.4F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 98, 495, 8.0026F, -11.2827F, 24.65F, 1, 1, 2, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 502, 349, 8.0026F, -11.2827F, 2.05F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 432, 306, 8.0546F, -11.1307F, 2.198F, 1, 1, 23, -0.35F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 0.0F, -1.25F);
		bone4.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.8901F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 498, 268, 8.3352F, 10.1275F, 1.45F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 498, 270, 8.3352F, 10.1275F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 498, 272, 8.3352F, 10.1275F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 498, 274, 8.3352F, 10.1275F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 498, 289, 8.3352F, 10.1275F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 498, 291, 8.3352F, 10.1275F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 498, 293, 8.3352F, 10.1275F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 498, 295, 8.3352F, 10.1275F, 3.3F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 498, 297, 8.3352F, 10.1275F, 19.6F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 498, 299, 8.3352F, 10.1275F, 18.35F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 498, 301, 8.3352F, 10.1275F, 17.1F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 498, 303, 8.3352F, 10.1275F, 15.85F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 498, 329, 8.3352F, 10.1275F, 14.6F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 498, 331, 8.3352F, 10.1275F, 13.35F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 498, 333, 8.3352F, 10.1275F, 12.1F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 498, 335, 8.3352F, 10.1275F, 20.9F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 498, 337, 8.3352F, 10.1275F, 22.15F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 498, 339, 8.3352F, 10.1275F, 23.4F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 492, 169, 8.3352F, 10.1275F, 24.65F, 1, 1, 2, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 498, 341, 8.3352F, 10.1275F, 2.05F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 48, 437, 8.2832F, 10.2795F, 2.198F, 1, 1, 23, -0.35F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-0.5F, 7.5F, 13.313F);
		handguard2.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.0F, -1.5708F);
		bone3.cubeList.add(new ModelBox(bone3, 134, 495, -0.775F, -1.0F, -12.963F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 140, 495, -0.775F, -1.0F, -11.713F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 146, 495, -0.775F, -1.0F, -10.463F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 152, 495, -0.775F, -1.0F, -9.213F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 158, 495, -0.775F, -1.0F, -7.963F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 164, 495, -0.775F, -1.0F, -6.713F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 170, 495, -0.775F, -1.0F, -5.463F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 176, 495, -0.775F, -1.0F, -4.213F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 182, 495, -0.775F, -1.0F, -2.913F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 188, 495, -0.775F, -1.0F, -1.663F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 194, 495, -0.775F, -1.0F, -0.413F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 200, 495, -0.775F, -1.0F, 0.837F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 206, 495, -0.775F, -1.0F, 2.087F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 212, 495, -0.775F, -1.0F, 3.337F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 218, 495, -0.775F, -1.0F, 4.587F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 394, 330, -0.775F, -1.0F, 9.637F, 2, 1, 2, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 224, 495, -0.775F, -1.0F, 8.387F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 230, 495, -0.775F, -1.0F, 7.137F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 236, 495, -0.775F, -1.0F, 5.887F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 242, 495, -0.775F, -1.0F, -13.563F, 2, 1, 1, -0.199F, false));

		bone4_r1 = new ModelRenderer(this);
		bone4_r1.setRotationPoint(0.025F, -0.4323F, -13.5768F);
		bone3.addChild(bone4_r1);
		setRotationAngle(bone4_r1, 0.2618F, 0.0F, 0.0F);
		bone4_r1.cubeList.add(new ModelBox(bone4_r1, 480, 327, -0.8F, -0.5F, -1.5F, 2, 1, 2, -0.199F, false));

		bone4_r2 = new ModelRenderer(this);
		bone4_r2.setRotationPoint(0.025F, -0.4234F, 11.6346F);
		bone3.addChild(bone4_r2);
		setRotationAngle(bone4_r2, -0.3054F, 0.0F, 0.0F);
		bone4_r2.cubeList.add(new ModelBox(bone4_r2, 488, 327, -0.8F, -0.5F, -0.5F, 2, 1, 2, -0.199F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-14.8F, -0.3F, -15.013F);
		bone3.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.8901F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 498, 355, 8.3635F, -11.5695F, 1.45F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 498, 357, 8.3635F, -11.5695F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 498, 359, 8.3635F, -11.5695F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 498, 361, 8.3635F, -11.5695F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 498, 363, 8.3635F, -11.5695F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 498, 365, 8.3635F, -11.5695F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 498, 367, 8.3635F, -11.5695F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 498, 369, 8.3635F, -11.5695F, 3.3F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 498, 371, 8.3635F, -11.5695F, 19.6F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 498, 373, 8.3635F, -11.5695F, 18.35F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 498, 375, 8.3635F, -11.5695F, 17.1F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 498, 377, 8.3635F, -11.5695F, 15.85F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 498, 385, 8.3635F, -11.5695F, 14.6F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 498, 387, 8.3635F, -11.5695F, 13.35F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 498, 389, 8.3635F, -11.5695F, 12.1F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 498, 391, 8.3635F, -11.5695F, 20.9F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 498, 393, 8.3635F, -11.5695F, 22.15F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 498, 395, 8.3635F, -11.5695F, 23.4F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 172, 492, 8.3635F, -11.5695F, 24.65F, 1, 1, 2, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 498, 397, 8.3635F, -11.5695F, 2.05F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 438, 26, 8.4155F, -11.4175F, 2.198F, 1, 1, 23, -0.35F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-13.2F, -0.3F, -15.013F);
		bone3.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.8901F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 498, 399, 8.5407F, 10.5402F, 1.45F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 498, 401, 8.5407F, 10.5402F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 498, 403, 8.5407F, 10.5402F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 498, 405, 8.5407F, 10.5402F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 498, 407, 8.5407F, 10.5402F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 498, 409, 8.5407F, 10.5402F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 498, 411, 8.5407F, 10.5402F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 498, 413, 8.5407F, 10.5402F, 3.3F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 498, 415, 8.5407F, 10.5402F, 19.6F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 498, 417, 8.5407F, 10.5402F, 18.35F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 498, 419, 8.5407F, 10.5402F, 17.1F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 498, 421, 8.5407F, 10.5402F, 15.85F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 498, 423, 8.5407F, 10.5402F, 14.6F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 498, 425, 8.5407F, 10.5402F, 13.35F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 498, 427, 8.5407F, 10.5402F, 12.1F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 498, 429, 8.5407F, 10.5402F, 20.9F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 498, 431, 8.5407F, 10.5402F, 22.15F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 498, 433, 8.5407F, 10.5402F, 23.4F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 492, 172, 8.5407F, 10.5402F, 24.65F, 1, 1, 2, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 498, 439, 8.5407F, 10.5402F, 2.05F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 438, 50, 8.4887F, 10.6922F, 2.198F, 1, 1, 23, -0.35F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(15.5F, 10.1F, 5.55F);
		handguard2.addChild(bone6);
		setRotationAngle(bone6, 0.0F, 0.0F, -3.1416F);
		bone6.cubeList.add(new ModelBox(bone6, 248, 495, 12.2F, -0.85F, 0.8F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 254, 495, 12.2F, -0.85F, 2.05F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 260, 495, 12.2F, -0.85F, 3.3F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 266, 495, 12.2F, -0.85F, 4.55F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 272, 495, 12.2F, -0.85F, 5.8F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 278, 495, 12.2F, -0.85F, 7.05F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 284, 495, 12.2F, -0.85F, 8.3F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 290, 495, 12.2F, -0.85F, -5.45F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 296, 495, 12.2F, -0.85F, -4.2F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 302, 495, 12.2F, -0.85F, -2.95F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 308, 495, 12.2F, -0.85F, -1.7F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 314, 495, 12.2F, -0.85F, -0.45F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 320, 495, 12.2F, -0.85F, 9.55F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 326, 495, 12.2F, -0.85F, 12.05F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 364, 495, 12.2F, -0.85F, 10.8F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 370, 495, 12.2F, -0.85F, 14.55F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 376, 495, 12.2F, -0.85F, 13.3F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 382, 495, 12.2F, -0.85F, 17.05F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 388, 495, 12.2F, -0.85F, 15.8F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 394, 495, 12.2F, -0.85F, 18.85F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 400, 495, 12.2F, -0.85F, 18.3F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 496, 5, 12.2F, -0.85F, -6.05F, 2, 1, 1, -0.199F, false));

		bone9_r1 = new ModelRenderer(this);
		bone9_r1.setRotationPoint(13.2F, -0.4823F, -6.0638F);
		bone6.addChild(bone9_r1);
		setRotationAngle(bone9_r1, 0.2618F, 0.0F, 0.0F);
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 496, 435, -1.0F, -0.3068F, -1.4518F, 2, 1, 1, -0.199F, false));
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 496, 381, -1.0F, -0.3068F, -1.1518F, 2, 1, 1, -0.199F, false));
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 496, 379, -1.0F, -0.3068F, -0.5518F, 2, 1, 1, -0.199F, false));

		bone7_r1 = new ModelRenderer(this);
		bone7_r1.setRotationPoint(13.2002F, -23.326F, 19.7966F);
		bone6.addChild(bone7_r1);
		setRotationAngle(bone7_r1, -0.4363F, 0.0F, 0.0F);
		bone7_r1.cubeList.add(new ModelBox(bone7_r1, 222, 412, -1.0002F, 20.413F, 9.2519F, 2, 1, 2, -0.199F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-1.6F, 0.0F, -1.25F);
		bone6.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 0.8901F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 498, 441, 8.1054F, -11.4891F, -4.8F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 498, 443, 8.1054F, -11.4891F, 19.55F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 498, 445, 8.1054F, -11.4891F, 20.1F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 498, 447, 8.1054F, -11.4891F, 17.05F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 498, 449, 8.1054F, -11.4891F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 498, 451, 8.1054F, -11.4891F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 498, 461, 8.1054F, -11.4891F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 498, 463, 8.1054F, -11.4891F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 498, 465, 8.1054F, -11.4891F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 498, 467, 8.1054F, -11.4891F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 498, 469, 8.1054F, -11.4891F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 498, 471, 8.1054F, -11.4891F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 498, 473, 8.1054F, -11.4891F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 498, 475, 8.1054F, -11.4891F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 498, 477, 8.1054F, -11.4891F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 498, 479, 8.1054F, -11.4891F, 3.3F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 498, 481, 8.1054F, -11.4891F, 2.05F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 498, 483, 8.1054F, -11.4891F, 0.8F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 498, 485, 8.1054F, -11.4891F, -0.45F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 498, 487, 8.1054F, -11.4891F, -1.7F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 498, 489, 8.1054F, -11.4891F, -2.95F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 498, 491, 8.1054F, -11.4891F, -4.2F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 156, 417, 8.1574F, -11.3371F, -3.902F, 1, 1, 24, -0.35F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, 0.0F, -1.25F);
		bone6.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -0.8901F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 498, 493, 8.5156F, 10.2709F, -4.8F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 498, 495, 8.5156F, 10.2709F, 19.55F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 78, 499, 8.5156F, 10.2709F, 20.1F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 102, 499, 8.5156F, 10.2709F, 17.05F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 106, 499, 8.5156F, 10.2709F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 110, 499, 8.5156F, 10.2709F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 114, 499, 8.5156F, 10.2709F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 118, 499, 8.5156F, 10.2709F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 122, 499, 8.5156F, 10.2709F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 126, 499, 8.5156F, 10.2709F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 130, 499, 8.5156F, 10.2709F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 134, 499, 8.5156F, 10.2709F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 138, 499, 8.5156F, 10.2709F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 142, 499, 8.5156F, 10.2709F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 146, 499, 8.5156F, 10.2709F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 150, 499, 8.5156F, 10.2709F, 3.3F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 154, 499, 8.5156F, 10.2709F, 2.05F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 158, 499, 8.5156F, 10.2709F, 0.8F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 162, 499, 8.5156F, 10.2709F, -0.45F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 166, 499, 8.5156F, 10.2709F, -1.7F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 170, 499, 8.5156F, 10.2709F, -2.95F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 174, 499, 8.5156F, 10.2709F, -4.2F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 422, 330, 8.4636F, 10.4229F, -3.902F, 1, 1, 24, -0.35F, false));

		rails2 = new ModelRenderer(this);
		rails2.setRotationPoint(-2.3F, -43.1F, -39.75F);
		handguard.addChild(rails2);
		rails2.cubeList.add(new ModelBox(rails2, 496, 7, -0.2F, 1.7F, 16.15F, 2, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 496, 9, -0.2F, 1.7F, 14.95F, 2, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 496, 11, -0.2F, 1.7F, 13.75F, 2, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 496, 13, -0.2F, 1.7F, 12.55F, 2, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 496, 15, -0.2F, 1.7F, 11.35F, 2, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 496, 17, -0.2F, 1.7F, 10.15F, 2, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 496, 19, -0.2F, 1.7F, 8.95F, 2, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 496, 21, -0.2F, 1.7F, 7.75F, 2, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 496, 319, -0.2F, 1.7F, 6.55F, 2, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 496, 321, -0.2F, 1.7F, 5.35F, 2, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 496, 323, -0.2F, 1.7F, 4.15F, 2, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 496, 325, -0.2F, 1.7F, 2.95F, 2, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 496, 327, -0.2F, 1.7F, 1.75F, 2, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 496, 343, -0.2F, 1.7F, 0.55F, 2, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 496, 345, -0.2F, 1.7F, -0.65F, 2, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 496, 347, -0.2F, 1.7F, -1.85F, 2, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 496, 349, -0.2F, 1.7F, -3.05F, 2, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 496, 351, -0.2F, 1.7F, -4.25F, 2, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 496, 353, -0.2F, 1.7F, -9.65F, 2, 1, 1, -0.2F, false));

		rails3_r1 = new ModelRenderer(this);
		rails3_r1.setRotationPoint(0.8F, 2.2674F, -9.6621F);
		rails2.addChild(rails3_r1);
		setRotationAngle(rails3_r1, 0.2618F, 0.0F, 0.0F);
		rails3_r1.cubeList.add(new ModelBox(rails3_r1, 410, 330, -1.0F, -0.5F, -1.5F, 2, 1, 2, -0.2F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -1.0F, 0.0F);
		rails2.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 178, 499, -2.8506F, 1.8506F, 16.15F, 1, 1, 1, -0.201F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 182, 499, -2.8506F, 1.8506F, 14.95F, 1, 1, 1, -0.201F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 186, 499, -2.8506F, 1.8506F, 13.75F, 1, 1, 1, -0.201F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 190, 499, -2.8506F, 1.8506F, 12.55F, 1, 1, 1, -0.201F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 194, 499, -2.8506F, 1.8506F, 11.35F, 1, 1, 1, -0.201F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 198, 499, -2.8506F, 1.8506F, 10.15F, 1, 1, 1, -0.201F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 202, 499, -2.8506F, 1.8506F, 8.95F, 1, 1, 1, -0.201F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 206, 499, -2.8506F, 1.8506F, 7.75F, 1, 1, 1, -0.201F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 210, 499, -2.8506F, 1.8506F, 6.55F, 1, 1, 1, -0.201F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 214, 499, -2.8506F, 1.8506F, 5.35F, 1, 1, 1, -0.201F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 218, 499, -2.8506F, 1.8506F, 4.15F, 1, 1, 1, -0.201F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 222, 499, -2.8506F, 1.8506F, 2.95F, 1, 1, 1, -0.201F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 226, 499, -2.8506F, 1.8506F, 1.75F, 1, 1, 1, -0.201F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 230, 499, -2.8506F, 1.8506F, 0.55F, 1, 1, 1, -0.201F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 234, 499, -2.8506F, 1.8506F, -0.65F, 1, 1, 1, -0.201F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 238, 499, -2.8506F, 1.8506F, -1.85F, 1, 1, 1, -0.201F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 242, 499, -2.8506F, 1.8506F, -3.05F, 1, 1, 1, -0.201F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 246, 499, -2.8506F, 1.8506F, -4.25F, 1, 1, 1, -0.201F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 196, 175, -2.8506F, 1.8506F, -9.55F, 1, 1, 6, -0.201F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 250, 499, -2.8506F, 1.8506F, -9.65F, 1, 1, 1, -0.201F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 292, 362, -2.9996F, 1.8746F, -8.599F, 1, 1, 26, -0.35F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(1.6F, -1.0F, 3.25F);
		rails2.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.7854F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 254, 499, -2.8506F, 1.8506F, 12.9F, 1, 1, 1, -0.201F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 258, 499, -2.8506F, 1.8506F, 11.7F, 1, 1, 1, -0.201F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 262, 499, -2.8506F, 1.8506F, 10.5F, 1, 1, 1, -0.201F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 266, 499, -2.8506F, 1.8506F, 9.3F, 1, 1, 1, -0.201F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 270, 499, -2.8506F, 1.8506F, 8.1F, 1, 1, 1, -0.201F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 274, 499, -2.8506F, 1.8506F, 6.9F, 1, 1, 1, -0.201F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 278, 499, -2.8506F, 1.8506F, 5.7F, 1, 1, 1, -0.201F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 282, 499, -2.8506F, 1.8506F, 4.5F, 1, 1, 1, -0.201F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 286, 499, -2.8506F, 1.8506F, 3.3F, 1, 1, 1, -0.201F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 290, 499, -2.8506F, 1.8506F, 2.1F, 1, 1, 1, -0.201F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 294, 499, -2.8506F, 1.8506F, 0.9F, 1, 1, 1, -0.201F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 298, 499, -2.8506F, 1.8506F, -0.3F, 1, 1, 1, -0.201F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 302, 499, -2.8506F, 1.8506F, -1.5F, 1, 1, 1, -0.201F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 306, 499, -2.8506F, 1.8506F, -2.7F, 1, 1, 1, -0.201F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 310, 499, -2.8506F, 1.8506F, -3.9F, 1, 1, 1, -0.201F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 314, 499, -2.8506F, 1.8506F, -5.1F, 1, 1, 1, -0.201F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 318, 499, -2.8506F, 1.8506F, -6.3F, 1, 1, 1, -0.201F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 322, 499, -2.8506F, 1.8506F, -7.5F, 1, 1, 1, -0.201F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 196, 182, -2.8506F, 1.8506F, -12.8F, 1, 1, 6, -0.201F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 326, 499, -2.8506F, 1.8506F, -12.9F, 1, 1, 1, -0.201F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 346, 362, -2.8746F, 1.9996F, -11.849F, 1, 1, 26, -0.35F, false));
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