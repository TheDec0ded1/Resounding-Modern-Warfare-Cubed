package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class HK416C_Handguard extends ModelBase {
	private final ModelRenderer handguardC;
	private final ModelRenderer bone7;
	private final ModelRenderer bone_r1;
	private final ModelRenderer bone_r32;
	private final ModelRenderer bone_r17;
	private final ModelRenderer bone_r18;
	private final ModelRenderer bone_r19;
	private final ModelRenderer bone_r20;
	private final ModelRenderer bone_r21;
	private final ModelRenderer bone_r22;
	private final ModelRenderer bone_r23;
	private final ModelRenderer bone_r24;
	private final ModelRenderer bone_r25;
	private final ModelRenderer bone_r26;
	private final ModelRenderer bone_r27;
	private final ModelRenderer bone_r28;
	private final ModelRenderer bone_r29;
	private final ModelRenderer bone_r30;
	private final ModelRenderer bone_r31;
	private final ModelRenderer handguard4;
	private final ModelRenderer handguard5;
	private final ModelRenderer bone_r33;
	private final ModelRenderer bone_r34;
	private final ModelRenderer bone_r35;
	private final ModelRenderer bone_r36;
	private final ModelRenderer bone8;
	private final ModelRenderer bone6_r1;
	private final ModelRenderer bone6_r2;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer bone9;
	private final ModelRenderer bone5_r1;
	private final ModelRenderer bone5_r2;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r13;
	private final ModelRenderer bone10;
	private final ModelRenderer bone10_r1;
	private final ModelRenderer bone8_r1;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer rails3;
	private final ModelRenderer rails4_r1;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;

	public HK416C_Handguard() {
		textureWidth = 432;
		textureHeight = 432;

		handguardC = new ModelRenderer(this);
		handguardC.setRotationPoint(0.0F, 23.0F, 0.0F);
		

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, 0.0F, 0.0F);
		handguardC.addChild(bone7);
		bone7.cubeList.add(new ModelBox(bone7, 262, 413, -1.3F, -36.2882F, -27.2F, 2, 2, 2, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 150, 336, -3.7F, -36.2882F, -27.2F, 1, 2, 2, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 174, 300, -2.3F, -35.5882F, -46.703F, 2, 1, 24, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 334, 276, -2.7F, -40.0F, -46.699F, 1, 1, 24, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 346, 222, -1.3F, -40.0F, -46.699F, 1, 1, 24, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 54, 302, -2.5F, -40.75F, -46.699F, 2, 1, 24, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 256, 325, -4.0658F, -37.4941F, -46.701F, 1, 1, 24, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 306, 325, 0.0658F, -37.4941F, -46.701F, 1, 1, 24, 0.0F, false));

		bone_r1 = new ModelRenderer(this);
		bone_r1.setRotationPoint(-1.5F, -34.3152F, -45.6433F);
		bone7.addChild(bone_r1);
		setRotationAngle(bone_r1, -0.1309F, 0.0F, 0.0F);
		bone_r1.cubeList.add(new ModelBox(bone_r1, 200, 414, -1.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

		bone_r32 = new ModelRenderer(this);
		bone_r32.setRotationPoint(-1.5F, -40.3848F, -45.6423F);
		bone7.addChild(bone_r32);
		setRotationAngle(bone_r32, 0.1309F, 0.0F, 0.0F);
		bone_r32.cubeList.add(new ModelBox(bone_r32, 192, 414, -1.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

		bone_r17 = new ModelRenderer(this);
		bone_r17.setRotationPoint(-2.7F, -40.0F, -50.7F);
		bone7.addChild(bone_r17);
		setRotationAngle(bone_r17, 0.0F, 0.0F, 0.9774F);
		bone_r17.cubeList.add(new ModelBox(bone_r17, 312, 147, 0.0F, -1.0F, 4.0F, 1, 1, 24, 0.0F, false));

		bone_r18 = new ModelRenderer(this);
		bone_r18.setRotationPoint(-0.3F, -40.0F, -50.7F);
		bone7.addChild(bone_r18);
		setRotationAngle(bone_r18, 0.0F, 0.0F, -0.9774F);
		bone_r18.cubeList.add(new ModelBox(bone_r18, 312, 172, -1.0F, -1.0F, 4.0F, 1, 1, 24, 0.0F, false));

		bone_r19 = new ModelRenderer(this);
		bone_r19.setRotationPoint(-2.55F, -39.1F, -29.7F);
		bone7.addChild(bone_r19);
		setRotationAngle(bone_r19, 0.0F, 0.0F, -0.4014F);
		bone_r19.cubeList.add(new ModelBox(bone_r19, 0, 400, -0.9219F, -0.1841F, -0.001F, 1, 1, 7, 0.0F, false));
		bone_r19.cubeList.add(new ModelBox(bone_r19, 410, 417, -0.9219F, -0.1841F, -4.001F, 1, 1, 2, 0.0F, false));
		bone_r19.cubeList.add(new ModelBox(bone_r19, 416, 417, -0.9219F, -0.1841F, -10.001F, 1, 1, 2, 0.0F, false));
		bone_r19.cubeList.add(new ModelBox(bone_r19, 270, 413, -0.9219F, -0.1841F, -17.001F, 1, 1, 3, 0.0F, false));
		bone_r19.cubeList.add(new ModelBox(bone_r19, 150, 350, -0.3219F, -0.1851F, -17.002F, 1, 1, 24, 0.0F, false));

		bone_r20 = new ModelRenderer(this);
		bone_r20.setRotationPoint(-2.55F, -35.2F, -29.7F);
		bone7.addChild(bone_r20);
		setRotationAngle(bone_r20, 0.0F, 0.0F, 0.4014F);
		bone_r20.cubeList.add(new ModelBox(bone_r20, 16, 400, -0.8F, -0.5289F, -0.001F, 1, 1, 7, 0.0F, false));
		bone_r20.cubeList.add(new ModelBox(bone_r20, 0, 418, -0.8F, -0.5289F, -4.001F, 1, 1, 2, 0.0F, false));
		bone_r20.cubeList.add(new ModelBox(bone_r20, 20, 418, -0.8F, -0.5289F, -10.001F, 1, 1, 2, 0.0F, false));
		bone_r20.cubeList.add(new ModelBox(bone_r20, 278, 413, -0.8F, -0.5289F, -17.001F, 1, 1, 3, 0.0F, false));
		bone_r20.cubeList.add(new ModelBox(bone_r20, 200, 350, -0.2F, -0.5279F, -17.002F, 1, 1, 24, 0.0F, false));

		bone_r21 = new ModelRenderer(this);
		bone_r21.setRotationPoint(-0.45F, -35.2F, -29.7F);
		bone7.addChild(bone_r21);
		setRotationAngle(bone_r21, 0.0F, 0.0F, -0.4014F);
		bone_r21.cubeList.add(new ModelBox(bone_r21, 400, 349, -0.2F, -0.5289F, -0.001F, 1, 1, 7, 0.0F, false));
		bone_r21.cubeList.add(new ModelBox(bone_r21, 26, 418, -0.2F, -0.5289F, -4.001F, 1, 1, 2, 0.0F, false));
		bone_r21.cubeList.add(new ModelBox(bone_r21, 32, 418, -0.2F, -0.5289F, -10.001F, 1, 1, 2, 0.0F, false));
		bone_r21.cubeList.add(new ModelBox(bone_r21, 286, 413, -0.2F, -0.5289F, -17.001F, 1, 1, 3, 0.0F, false));
		bone_r21.cubeList.add(new ModelBox(bone_r21, 250, 350, -0.8F, -0.5279F, -17.002F, 1, 1, 24, 0.0F, false));

		bone_r22 = new ModelRenderer(this);
		bone_r22.setRotationPoint(-0.45F, -39.1F, -29.7F);
		bone7.addChild(bone_r22);
		setRotationAngle(bone_r22, 0.0F, 0.0F, 0.4014F);
		bone_r22.cubeList.add(new ModelBox(bone_r22, 400, 357, -0.0781F, -0.1841F, -0.001F, 1, 1, 7, 0.0F, false));
		bone_r22.cubeList.add(new ModelBox(bone_r22, 38, 418, -0.0781F, -0.1841F, -4.001F, 1, 1, 2, 0.0F, false));
		bone_r22.cubeList.add(new ModelBox(bone_r22, 418, 38, -0.0781F, -0.1841F, -10.001F, 1, 1, 2, 0.0F, false));
		bone_r22.cubeList.add(new ModelBox(bone_r22, 424, 100, -0.0781F, -0.1841F, -15.001F, 1, 1, 1, 0.0F, false));
		bone_r22.cubeList.add(new ModelBox(bone_r22, 300, 350, -0.6781F, -0.1851F, -17.002F, 1, 1, 24, 0.0F, false));

		bone_r23 = new ModelRenderer(this);
		bone_r23.setRotationPoint(-3.85F, -37.8F, -29.7F);
		bone7.addChild(bone_r23);
		setRotationAngle(bone_r23, 0.0F, 0.0F, 0.4014F);
		bone_r23.cubeList.add(new ModelBox(bone_r23, 400, 365, -0.0781F, -1.1841F, -0.002F, 1, 1, 7, 0.0F, false));
		bone_r23.cubeList.add(new ModelBox(bone_r23, 416, 218, -0.1856F, -1.4372F, -4.0F, 1, 1, 2, 0.0F, false));
		bone_r23.cubeList.add(new ModelBox(bone_r23, 418, 41, -0.0781F, -1.1841F, -10.0F, 1, 1, 2, 0.0F, false));
		bone_r23.cubeList.add(new ModelBox(bone_r23, 294, 413, -0.0781F, -1.1841F, -17.0F, 1, 1, 3, 0.0F, false));
		bone_r23.cubeList.add(new ModelBox(bone_r23, 50, 327, -0.0791F, -0.6341F, -17.001F, 1, 1, 24, 0.0F, false));

		bone_r24 = new ModelRenderer(this);
		bone_r24.setRotationPoint(-3.85F, -36.5F, -29.7F);
		bone7.addChild(bone_r24);
		setRotationAngle(bone_r24, 0.0F, 0.0F, -0.4014F);
		bone_r24.cubeList.add(new ModelBox(bone_r24, 400, 391, -0.2F, 0.4711F, -0.003F, 1, 1, 7, 0.0F, false));
		bone_r24.cubeList.add(new ModelBox(bone_r24, 416, 221, -0.2F, 0.4711F, -4.0F, 1, 1, 2, 0.0F, false));
		bone_r24.cubeList.add(new ModelBox(bone_r24, 44, 418, -0.2F, 0.4711F, -10.0F, 1, 1, 2, 0.0F, false));
		bone_r24.cubeList.add(new ModelBox(bone_r24, 302, 413, -0.2F, 0.4711F, -17.0F, 1, 1, 3, 0.0F, false));
		bone_r24.cubeList.add(new ModelBox(bone_r24, 328, 53, -0.201F, -0.0789F, -17.001F, 1, 1, 24, 0.0F, false));

		bone_r25 = new ModelRenderer(this);
		bone_r25.setRotationPoint(0.85F, -36.5F, -29.7F);
		bone7.addChild(bone_r25);
		setRotationAngle(bone_r25, 0.0F, 0.0F, 0.4014F);
		bone_r25.cubeList.add(new ModelBox(bone_r25, 400, 399, -0.8F, 0.4711F, -0.003F, 1, 1, 7, 0.0F, false));
		bone_r25.cubeList.add(new ModelBox(bone_r25, 416, 224, -0.8F, 0.4711F, -4.0F, 1, 1, 2, 0.0F, false));
		bone_r25.cubeList.add(new ModelBox(bone_r25, 50, 418, -0.8F, 0.4711F, -10.0F, 1, 1, 2, 0.0F, false));
		bone_r25.cubeList.add(new ModelBox(bone_r25, 310, 413, -0.8F, 0.4711F, -17.0F, 1, 1, 3, 0.0F, false));
		bone_r25.cubeList.add(new ModelBox(bone_r25, 328, 78, -0.799F, -0.0789F, -17.001F, 1, 1, 24, 0.0F, false));

		bone_r26 = new ModelRenderer(this);
		bone_r26.setRotationPoint(0.85F, -37.8F, -29.7F);
		bone7.addChild(bone_r26);
		setRotationAngle(bone_r26, 0.0F, 0.0F, -0.4014F);
		bone_r26.cubeList.add(new ModelBox(bone_r26, 366, 401, -0.9219F, -1.1841F, -0.002F, 1, 1, 7, 0.0F, false));
		bone_r26.cubeList.add(new ModelBox(bone_r26, 416, 227, -0.9219F, -1.1841F, -4.0F, 1, 1, 2, 0.0F, false));
		bone_r26.cubeList.add(new ModelBox(bone_r26, 56, 418, -0.9219F, -1.1841F, -10.0F, 1, 1, 2, 0.0F, false));
		bone_r26.cubeList.add(new ModelBox(bone_r26, 102, 424, -0.9219F, -1.1841F, -15.0F, 1, 1, 1, 0.0F, false));
		bone_r26.cubeList.add(new ModelBox(bone_r26, 100, 328, -0.9209F, -0.6341F, -17.001F, 1, 1, 24, 0.0F, false));

		bone_r27 = new ModelRenderer(this);
		bone_r27.setRotationPoint(-3.85F, -36.5F, -47.0F);
		bone7.addChild(bone_r27);
		setRotationAngle(bone_r27, -0.7854F, 0.0F, -0.4014F);
		

		bone_r28 = new ModelRenderer(this);
		bone_r28.setRotationPoint(0.85F, -36.5F, -47.0F);
		bone7.addChild(bone_r28);
		setRotationAngle(bone_r28, -0.7854F, 0.0F, 0.4014F);
		

		bone_r29 = new ModelRenderer(this);
		bone_r29.setRotationPoint(-3.85F, -36.5F, -49.1F);
		bone7.addChild(bone_r29);
		setRotationAngle(bone_r29, -0.7854F, 0.0F, -0.4014F);
		

		bone_r30 = new ModelRenderer(this);
		bone_r30.setRotationPoint(0.85F, -36.5F, -49.1F);
		bone7.addChild(bone_r30);
		setRotationAngle(bone_r30, -0.7854F, 0.0F, 0.4014F);
		

		bone_r31 = new ModelRenderer(this);
		bone_r31.setRotationPoint(-3.9F, -35.3F, -26.8F);
		bone7.addChild(bone_r31);
		setRotationAngle(bone_r31, -0.3316F, 0.0F, 0.0F);
		bone_r31.cubeList.add(new ModelBox(bone_r31, 106, 424, 0.0F, -0.5161F, 0.1666F, 1, 1, 1, -0.1F, false));
		bone_r31.cubeList.add(new ModelBox(bone_r31, 110, 424, 3.8F, -0.5161F, 0.1666F, 1, 1, 1, -0.1F, false));

		handguard4 = new ModelRenderer(this);
		handguard4.setRotationPoint(-2.7F, -36.2F, -50.7F);
		bone7.addChild(handguard4);
		handguard4.cubeList.add(new ModelBox(handguard4, 350, 350, 0.0F, 0.6108F, 3.998F, 1, 1, 24, 0.0F, false));

		handguard5 = new ModelRenderer(this);
		handguard5.setRotationPoint(-3.8F, -44.2F, -49.0F);
		handguardC.addChild(handguard5);
		handguard5.cubeList.add(new ModelBox(handguard5, 106, 302, -0.799F, 6.25F, 2.298F, 1, 2, 24, 0.0F, false));
		handguard5.cubeList.add(new ModelBox(handguard5, 0, 303, 4.401F, 6.25F, 2.298F, 1, 2, 24, 0.0F, false));
		handguard5.cubeList.add(new ModelBox(handguard5, 226, 300, 1.3F, 9.25F, 2.3F, 2, 1, 24, 0.0F, false));

		bone_r33 = new ModelRenderer(this);
		bone_r33.setRotationPoint(5.0358F, 7.25F, 3.3547F);
		handguard5.addChild(bone_r33);
		setRotationAngle(bone_r33, 0.0F, 0.1309F, 0.0F);
		bone_r33.cubeList.add(new ModelBox(bone_r33, 248, 414, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

		bone_r34 = new ModelRenderer(this);
		bone_r34.setRotationPoint(-15.2503F, 44.65F, 51.535F);
		handguard5.addChild(bone_r34);
		setRotationAngle(bone_r34, 0.0F, -0.1309F, 0.0F);
		bone_r34.cubeList.add(new ModelBox(bone_r34, 122, 414, 7.901F, -38.4F, -50.702F, 1, 2, 2, 0.0F, false));

		bone_r35 = new ModelRenderer(this);
		bone_r35.setRotationPoint(0.4471F, 7.25F, 12.0131F);
		handguard5.addChild(bone_r35);
		setRotationAngle(bone_r35, 0.0F, 0.1309F, 0.0F);
		bone_r35.cubeList.add(new ModelBox(bone_r35, 150, 344, -3.1F, -1.0F, 12.0F, 1, 2, 2, 0.0F, false));

		bone_r36 = new ModelRenderer(this);
		bone_r36.setRotationPoint(4.1549F, 7.25F, 12.0131F);
		handguard5.addChild(bone_r36);
		setRotationAngle(bone_r36, 0.0F, -0.1309F, 0.0F);
		bone_r36.cubeList.add(new ModelBox(bone_r36, 150, 340, 2.1F, -1.0F, 12.0F, 1, 2, 2, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(5.3F, -5.7F, -0.45F);
		handguard5.addChild(bone8);
		setRotationAngle(bone8, 0.0F, 0.0F, 1.5708F);
		bone8.cubeList.add(new ModelBox(bone8, 420, 280, 11.975F, -0.8F, 5.8F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 282, 420, 11.975F, -0.8F, 7.05F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 420, 282, 11.975F, -0.8F, 8.3F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 420, 284, 11.975F, -0.8F, 9.55F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 420, 286, 11.975F, -0.8F, 10.85F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 288, 420, 11.975F, -0.8F, 12.1F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 420, 288, 11.975F, -0.8F, 13.35F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 420, 290, 11.975F, -0.8F, 14.6F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 420, 292, 11.975F, -0.8F, 15.85F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 294, 420, 11.975F, -0.8F, 17.1F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 420, 294, 11.975F, -0.8F, 18.35F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 216, 414, 11.975F, -0.8F, 23.4F, 2, 1, 2, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 420, 296, 11.975F, -0.8F, 22.15F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 420, 298, 11.975F, -0.8F, 20.9F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 300, 420, 11.975F, -0.8F, 19.65F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 420, 300, 11.975F, -0.8F, 4.2F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 6, 422, 11.975F, -0.8F, 4.525F, 2, 1, 1, -0.199F, false));

		bone6_r1 = new ModelRenderer(this);
		bone6_r1.setRotationPoint(13.175F, -0.1324F, 0.1862F);
		bone8.addChild(bone6_r1);
		setRotationAngle(bone6_r1, 0.2618F, 0.0F, 0.0F);
		bone6_r1.cubeList.add(new ModelBox(bone6_r1, 224, 414, -1.2F, 0.4387F, 2.3896F, 2, 1, 2, -0.199F, false));

		bone6_r2 = new ModelRenderer(this);
		bone6_r2.setRotationPoint(13.175F, -0.2234F, 25.3976F);
		bone8.addChild(bone6_r2);
		setRotationAngle(bone6_r2, -0.3054F, 0.0F, 0.0F);
		bone6_r2.cubeList.add(new ModelBox(bone6_r2, 208, 414, -1.2F, -0.5F, -0.5F, 2, 1, 2, -0.199F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-1.6F, 0.0F, -1.25F);
		bone8.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.8901F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 92, 426, 8.0026F, -11.2827F, 5.45F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 426, 114, 8.0026F, -11.2827F, 5.775F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 426, 92, 8.0026F, -11.2827F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 426, 94, 8.0026F, -11.2827F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 96, 426, 8.0026F, -11.2827F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 426, 96, 8.0026F, -11.2827F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 426, 98, 8.0026F, -11.2827F, 19.6F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 100, 426, 8.0026F, -11.2827F, 18.35F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 426, 102, 8.0026F, -11.2827F, 17.1F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 104, 426, 8.0026F, -11.2827F, 15.85F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 426, 104, 8.0026F, -11.2827F, 14.6F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 426, 106, 8.0026F, -11.2827F, 13.35F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 108, 426, 8.0026F, -11.2827F, 12.1F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 426, 108, 8.0026F, -11.2827F, 20.9F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 426, 110, 8.0026F, -11.2827F, 22.15F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 426, 112, 8.0026F, -11.2827F, 23.4F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 418, 333, 8.0026F, -11.2827F, 24.65F, 1, 1, 2, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 266, 147, 8.0546F, -11.1307F, 6.198F, 1, 1, 19, -0.35F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 0.0F, -1.25F);
		bone8.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.8901F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 192, 424, 8.3352F, 10.1275F, 5.45F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 4, 426, 8.3352F, 10.1275F, 5.775F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 196, 424, 8.3352F, 10.1275F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 200, 424, 8.3352F, 10.1275F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 204, 424, 8.3352F, 10.1275F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 208, 424, 8.3352F, 10.1275F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 212, 424, 8.3352F, 10.1275F, 19.6F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 216, 424, 8.3352F, 10.1275F, 18.35F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 220, 424, 8.3352F, 10.1275F, 17.1F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 224, 424, 8.3352F, 10.1275F, 15.85F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 228, 424, 8.3352F, 10.1275F, 14.6F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 232, 424, 8.3352F, 10.1275F, 13.35F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 236, 424, 8.3352F, 10.1275F, 12.1F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 240, 424, 8.3352F, 10.1275F, 20.9F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 256, 424, 8.3352F, 10.1275F, 22.15F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 260, 424, 8.3352F, 10.1275F, 23.4F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 62, 418, 8.3352F, 10.1275F, 24.65F, 1, 1, 2, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 294, 251, 8.2832F, 10.2795F, 6.198F, 1, 1, 19, -0.35F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-0.5F, 7.5F, 13.313F);
		handguard5.addChild(bone9);
		setRotationAngle(bone9, 0.0F, 0.0F, -1.5708F);
		bone9.cubeList.add(new ModelBox(bone9, 420, 302, -0.775F, -1.0F, -7.963F, 2, 1, 1, -0.199F, false));
		bone9.cubeList.add(new ModelBox(bone9, 420, 304, -0.775F, -1.0F, -6.713F, 2, 1, 1, -0.199F, false));
		bone9.cubeList.add(new ModelBox(bone9, 306, 420, -0.775F, -1.0F, -5.463F, 2, 1, 1, -0.199F, false));
		bone9.cubeList.add(new ModelBox(bone9, 420, 306, -0.775F, -1.0F, -4.213F, 2, 1, 1, -0.199F, false));
		bone9.cubeList.add(new ModelBox(bone9, 420, 308, -0.775F, -1.0F, -2.913F, 2, 1, 1, -0.199F, false));
		bone9.cubeList.add(new ModelBox(bone9, 420, 310, -0.775F, -1.0F, -1.663F, 2, 1, 1, -0.199F, false));
		bone9.cubeList.add(new ModelBox(bone9, 312, 420, -0.775F, -1.0F, -0.413F, 2, 1, 1, -0.199F, false));
		bone9.cubeList.add(new ModelBox(bone9, 318, 420, -0.775F, -1.0F, 0.837F, 2, 1, 1, -0.199F, false));
		bone9.cubeList.add(new ModelBox(bone9, 324, 420, -0.775F, -1.0F, 2.087F, 2, 1, 1, -0.199F, false));
		bone9.cubeList.add(new ModelBox(bone9, 330, 420, -0.775F, -1.0F, 3.337F, 2, 1, 1, -0.199F, false));
		bone9.cubeList.add(new ModelBox(bone9, 336, 420, -0.775F, -1.0F, 4.587F, 2, 1, 1, -0.199F, false));
		bone9.cubeList.add(new ModelBox(bone9, 240, 414, -0.775F, -1.0F, 9.637F, 2, 1, 2, -0.199F, false));
		bone9.cubeList.add(new ModelBox(bone9, 342, 420, -0.775F, -1.0F, 8.387F, 2, 1, 1, -0.199F, false));
		bone9.cubeList.add(new ModelBox(bone9, 348, 420, -0.775F, -1.0F, 7.137F, 2, 1, 1, -0.199F, false));
		bone9.cubeList.add(new ModelBox(bone9, 364, 420, -0.775F, -1.0F, 5.887F, 2, 1, 1, -0.199F, false));
		bone9.cubeList.add(new ModelBox(bone9, 370, 420, -0.775F, -1.0F, -9.563F, 2, 1, 1, -0.199F, false));
		bone9.cubeList.add(new ModelBox(bone9, 354, 421, -0.775F, -1.0F, -9.238F, 2, 1, 1, -0.199F, false));

		bone5_r1 = new ModelRenderer(this);
		bone5_r1.setRotationPoint(0.025F, -0.4323F, -13.5768F);
		bone9.addChild(bone5_r1);
		setRotationAngle(bone5_r1, 0.2618F, 0.0F, 0.0F);
		bone5_r1.cubeList.add(new ModelBox(bone5_r1, 382, 414, -0.8F, 0.5353F, 2.3637F, 2, 1, 2, -0.199F, false));

		bone5_r2 = new ModelRenderer(this);
		bone5_r2.setRotationPoint(0.025F, -0.4234F, 11.6346F);
		bone9.addChild(bone5_r2);
		setRotationAngle(bone5_r2, -0.3054F, 0.0F, 0.0F);
		bone5_r2.cubeList.add(new ModelBox(bone5_r2, 232, 414, -0.8F, -0.5F, -0.5F, 2, 1, 2, -0.199F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-14.8F, -0.3F, -15.013F);
		bone9.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.8901F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 264, 424, 8.3635F, -11.5695F, 5.45F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 426, 2, 8.3635F, -11.5695F, 5.775F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 268, 424, 8.3635F, -11.5695F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 272, 424, 8.3635F, -11.5695F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 276, 424, 8.3635F, -11.5695F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 280, 424, 8.3635F, -11.5695F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 284, 424, 8.3635F, -11.5695F, 19.6F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 288, 424, 8.3635F, -11.5695F, 18.35F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 292, 424, 8.3635F, -11.5695F, 17.1F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 296, 424, 8.3635F, -11.5695F, 15.85F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 300, 424, 8.3635F, -11.5695F, 14.6F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 304, 424, 8.3635F, -11.5695F, 13.35F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 308, 424, 8.3635F, -11.5695F, 12.1F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 312, 424, 8.3635F, -11.5695F, 20.9F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 424, 312, 8.3635F, -11.5695F, 22.15F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 424, 314, 8.3635F, -11.5695F, 23.4F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 68, 418, 8.3635F, -11.5695F, 24.65F, 1, 1, 2, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 92, 378, 8.4155F, -11.4175F, 6.198F, 1, 1, 19, -0.35F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-13.2F, -0.3F, -15.013F);
		bone9.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.8901F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 316, 424, 8.5407F, 10.5402F, 5.45F, 1, 1, 1, -0.198F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 426, 0, 8.5407F, 10.5402F, 5.775F, 1, 1, 1, -0.198F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 424, 316, 8.5407F, 10.5402F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 424, 318, 8.5407F, 10.5402F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 320, 424, 8.5407F, 10.5402F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 424, 320, 8.5407F, 10.5402F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 424, 322, 8.5407F, 10.5402F, 19.6F, 1, 1, 1, -0.198F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 324, 424, 8.5407F, 10.5402F, 18.35F, 1, 1, 1, -0.198F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 424, 324, 8.5407F, 10.5402F, 17.1F, 1, 1, 1, -0.198F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 424, 326, 8.5407F, 10.5402F, 15.85F, 1, 1, 1, -0.198F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 328, 424, 8.5407F, 10.5402F, 14.6F, 1, 1, 1, -0.198F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 424, 328, 8.5407F, 10.5402F, 13.35F, 1, 1, 1, -0.198F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 424, 330, 8.5407F, 10.5402F, 12.1F, 1, 1, 1, -0.198F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 332, 424, 8.5407F, 10.5402F, 20.9F, 1, 1, 1, -0.198F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 424, 332, 8.5407F, 10.5402F, 22.15F, 1, 1, 1, -0.198F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 424, 334, 8.5407F, 10.5402F, 23.4F, 1, 1, 1, -0.198F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 74, 418, 8.5407F, 10.5402F, 24.65F, 1, 1, 2, -0.198F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 380, 0, 8.4887F, 10.6922F, 6.198F, 1, 1, 19, -0.35F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(15.5F, 10.1F, 5.55F);
		handguard5.addChild(bone10);
		setRotationAngle(bone10, 0.0F, 0.0F, -3.1416F);
		bone10.cubeList.add(new ModelBox(bone10, 376, 420, 12.2F, -0.85F, 0.8F, 2, 1, 1, -0.199F, false));
		bone10.cubeList.add(new ModelBox(bone10, 382, 420, 12.2F, -0.85F, 2.05F, 2, 1, 1, -0.199F, false));
		bone10.cubeList.add(new ModelBox(bone10, 420, 387, 12.2F, -0.85F, 3.3F, 2, 1, 1, -0.199F, false));
		bone10.cubeList.add(new ModelBox(bone10, 388, 420, 12.2F, -0.85F, 4.55F, 2, 1, 1, -0.199F, false));
		bone10.cubeList.add(new ModelBox(bone10, 420, 389, 12.2F, -0.85F, 5.8F, 2, 1, 1, -0.199F, false));
		bone10.cubeList.add(new ModelBox(bone10, 394, 420, 12.2F, -0.85F, 7.05F, 2, 1, 1, -0.199F, false));
		bone10.cubeList.add(new ModelBox(bone10, 400, 420, 12.2F, -0.85F, 8.3F, 2, 1, 1, -0.199F, false));
		bone10.cubeList.add(new ModelBox(bone10, 406, 420, 12.2F, -0.85F, -1.75F, 2, 1, 1, -0.199F, false));
		bone10.cubeList.add(new ModelBox(bone10, 420, 406, 12.2F, -0.85F, -0.45F, 2, 1, 1, -0.199F, false));
		bone10.cubeList.add(new ModelBox(bone10, 420, 408, 12.2F, -0.85F, 9.55F, 2, 1, 1, -0.199F, false));
		bone10.cubeList.add(new ModelBox(bone10, 420, 410, 12.2F, -0.85F, 12.05F, 2, 1, 1, -0.199F, false));
		bone10.cubeList.add(new ModelBox(bone10, 412, 420, 12.2F, -0.85F, 10.8F, 2, 1, 1, -0.199F, false));
		bone10.cubeList.add(new ModelBox(bone10, 420, 412, 12.2F, -0.85F, 14.55F, 2, 1, 1, -0.199F, false));
		bone10.cubeList.add(new ModelBox(bone10, 420, 414, 12.2F, -0.85F, 13.3F, 2, 1, 1, -0.199F, false));
		bone10.cubeList.add(new ModelBox(bone10, 418, 420, 12.2F, -0.85F, 17.05F, 2, 1, 1, -0.199F, false));
		bone10.cubeList.add(new ModelBox(bone10, 0, 421, 12.2F, -0.85F, 15.8F, 2, 1, 1, -0.199F, false));
		bone10.cubeList.add(new ModelBox(bone10, 18, 421, 12.2F, -0.85F, 18.85F, 2, 1, 1, -0.199F, false));
		bone10.cubeList.add(new ModelBox(bone10, 24, 421, 12.2F, -0.85F, 18.3F, 2, 1, 1, -0.199F, false));
		bone10.cubeList.add(new ModelBox(bone10, 30, 421, 12.2F, -0.85F, -2.05F, 2, 1, 1, -0.199F, false));

		bone10_r1 = new ModelRenderer(this);
		bone10_r1.setRotationPoint(13.2F, -0.4823F, -6.0638F);
		bone10.addChild(bone10_r1);
		setRotationAngle(bone10_r1, 0.2618F, 0.0F, 0.0F);
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 48, 421, -1.0F, 0.7285F, 2.4119F, 2, 1, 1, -0.199F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 42, 421, -1.0F, 0.7285F, 2.7119F, 2, 1, 1, -0.199F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 36, 421, -1.0F, 0.7285F, 3.3119F, 2, 1, 1, -0.199F, false));

		bone8_r1 = new ModelRenderer(this);
		bone8_r1.setRotationPoint(13.2002F, -23.326F, 19.7966F);
		bone10.addChild(bone8_r1);
		setRotationAngle(bone8_r1, -0.4363F, 0.0F, 0.0F);
		bone8_r1.cubeList.add(new ModelBox(bone8_r1, 24, 415, -1.0002F, 20.413F, 9.2519F, 2, 1, 2, -0.199F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-1.6F, 0.0F, -1.25F);
		bone10.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, 0.8901F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 336, 424, 8.1054F, -11.4891F, -0.8F, 1, 1, 1, -0.198F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 424, 336, 8.1054F, -11.4891F, 19.55F, 1, 1, 1, -0.198F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 424, 338, 8.1054F, -11.4891F, 20.1F, 1, 1, 1, -0.198F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 340, 424, 8.1054F, -11.4891F, 17.05F, 1, 1, 1, -0.198F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 424, 340, 8.1054F, -11.4891F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 424, 342, 8.1054F, -11.4891F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 344, 424, 8.1054F, -11.4891F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 424, 344, 8.1054F, -11.4891F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 424, 346, 8.1054F, -11.4891F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 348, 424, 8.1054F, -11.4891F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 362, 424, 8.1054F, -11.4891F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 366, 424, 8.1054F, -11.4891F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 370, 424, 8.1054F, -11.4891F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 424, 372, 8.1054F, -11.4891F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 374, 424, 8.1054F, -11.4891F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 424, 374, 8.1054F, -11.4891F, 3.3F, 1, 1, 1, -0.198F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 424, 376, 8.1054F, -11.4891F, 2.05F, 1, 1, 1, -0.198F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 378, 424, 8.1054F, -11.4891F, 0.8F, 1, 1, 1, -0.198F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 424, 378, 8.1054F, -11.4891F, -0.5F, 1, 1, 1, -0.198F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 378, 50, 8.1574F, -11.3371F, -0.902F, 1, 1, 21, -0.35F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.0F, 0.0F, -1.25F);
		bone10.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, -0.8901F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 424, 380, 8.5156F, 10.2709F, -0.8F, 1, 1, 1, -0.198F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 382, 424, 8.5156F, 10.2709F, 19.55F, 1, 1, 1, -0.198F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 424, 382, 8.5156F, 10.2709F, 20.1F, 1, 1, 1, -0.198F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 424, 384, 8.5156F, 10.2709F, 17.05F, 1, 1, 1, -0.198F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 386, 424, 8.5156F, 10.2709F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 390, 424, 8.5156F, 10.2709F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 394, 424, 8.5156F, 10.2709F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 398, 424, 8.5156F, 10.2709F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 402, 424, 8.5156F, 10.2709F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 406, 424, 8.5156F, 10.2709F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 410, 424, 8.5156F, 10.2709F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 414, 424, 8.5156F, 10.2709F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 418, 424, 8.5156F, 10.2709F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 424, 420, 8.5156F, 10.2709F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 422, 424, 8.5156F, 10.2709F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 424, 422, 8.5156F, 10.2709F, 3.3F, 1, 1, 1, -0.198F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 425, 8.5156F, 10.2709F, 2.05F, 1, 1, 1, -0.198F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 16, 425, 8.5156F, 10.2709F, 0.8F, 1, 1, 1, -0.198F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 20, 425, 8.5156F, 10.2709F, -0.5F, 1, 1, 1, -0.198F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 378, 72, 8.4636F, 10.4229F, -0.902F, 1, 1, 21, -0.35F, false));

		rails3 = new ModelRenderer(this);
		rails3.setRotationPoint(-2.3F, -43.1F, -39.75F);
		handguardC.addChild(rails3);
		rails3.cubeList.add(new ModelBox(rails3, 54, 421, -0.2F, 1.7F, 16.15F, 2, 1, 1, -0.2F, false));
		rails3.cubeList.add(new ModelBox(rails3, 60, 421, -0.2F, 1.7F, 14.95F, 2, 1, 1, -0.2F, false));
		rails3.cubeList.add(new ModelBox(rails3, 66, 421, -0.2F, 1.7F, 13.75F, 2, 1, 1, -0.2F, false));
		rails3.cubeList.add(new ModelBox(rails3, 72, 421, -0.2F, 1.7F, 12.55F, 2, 1, 1, -0.2F, false));
		rails3.cubeList.add(new ModelBox(rails3, 78, 421, -0.2F, 1.7F, 11.35F, 2, 1, 1, -0.2F, false));
		rails3.cubeList.add(new ModelBox(rails3, 116, 421, -0.2F, 1.7F, 10.15F, 2, 1, 1, -0.2F, false));
		rails3.cubeList.add(new ModelBox(rails3, 122, 421, -0.2F, 1.7F, 8.95F, 2, 1, 1, -0.2F, false));
		rails3.cubeList.add(new ModelBox(rails3, 128, 421, -0.2F, 1.7F, 7.75F, 2, 1, 1, -0.2F, false));
		rails3.cubeList.add(new ModelBox(rails3, 134, 421, -0.2F, 1.7F, 6.55F, 2, 1, 1, -0.2F, false));
		rails3.cubeList.add(new ModelBox(rails3, 140, 421, -0.2F, 1.7F, 5.35F, 2, 1, 1, -0.2F, false));
		rails3.cubeList.add(new ModelBox(rails3, 146, 421, -0.2F, 1.7F, 4.15F, 2, 1, 1, -0.2F, false));
		rails3.cubeList.add(new ModelBox(rails3, 152, 421, -0.2F, 1.7F, 2.95F, 2, 1, 1, -0.2F, false));
		rails3.cubeList.add(new ModelBox(rails3, 158, 421, -0.2F, 1.7F, 1.75F, 2, 1, 1, -0.2F, false));
		rails3.cubeList.add(new ModelBox(rails3, 164, 421, -0.2F, 1.7F, 0.55F, 2, 1, 1, -0.2F, false));
		rails3.cubeList.add(new ModelBox(rails3, 170, 421, -0.2F, 1.7F, -0.65F, 2, 1, 1, -0.2F, false));
		rails3.cubeList.add(new ModelBox(rails3, 176, 421, -0.2F, 1.7F, -1.85F, 2, 1, 1, -0.2F, false));
		rails3.cubeList.add(new ModelBox(rails3, 182, 421, -0.2F, 1.7F, -3.05F, 2, 1, 1, -0.2F, false));
		rails3.cubeList.add(new ModelBox(rails3, 246, 421, -0.2F, 1.7F, -4.25F, 2, 1, 1, -0.2F, false));
		rails3.cubeList.add(new ModelBox(rails3, 252, 421, -0.2F, 1.7F, -5.65F, 2, 1, 1, -0.2F, false));

		rails4_r1 = new ModelRenderer(this);
		rails4_r1.setRotationPoint(0.8F, 2.2674F, -5.6621F);
		rails3.addChild(rails4_r1);
		setRotationAngle(rails4_r1, 0.2618F, 0.0F, 0.0F);
		rails4_r1.cubeList.add(new ModelBox(rails4_r1, 354, 415, -1.0F, -0.5F, -1.5F, 2, 1, 2, -0.2F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.0F, -1.0F, 0.0F);
		rails3.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, -0.7854F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 24, 425, -2.8506F, 1.8506F, 16.15F, 1, 1, 1, -0.201F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 28, 425, -2.8506F, 1.8506F, 14.95F, 1, 1, 1, -0.201F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 32, 425, -2.8506F, 1.8506F, 13.75F, 1, 1, 1, -0.201F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 36, 425, -2.8506F, 1.8506F, 12.55F, 1, 1, 1, -0.201F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 40, 425, -2.8506F, 1.8506F, 11.35F, 1, 1, 1, -0.201F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 44, 425, -2.8506F, 1.8506F, 10.15F, 1, 1, 1, -0.201F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 48, 425, -2.8506F, 1.8506F, 8.95F, 1, 1, 1, -0.201F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 52, 425, -2.8506F, 1.8506F, 7.75F, 1, 1, 1, -0.201F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 56, 425, -2.8506F, 1.8506F, 6.55F, 1, 1, 1, -0.201F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 60, 425, -2.8506F, 1.8506F, 5.35F, 1, 1, 1, -0.201F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 64, 425, -2.8506F, 1.8506F, 4.15F, 1, 1, 1, -0.201F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 68, 425, -2.8506F, 1.8506F, 2.95F, 1, 1, 1, -0.201F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 72, 425, -2.8506F, 1.8506F, 1.75F, 1, 1, 1, -0.201F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 76, 425, -2.8506F, 1.8506F, 0.55F, 1, 1, 1, -0.201F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 114, 425, -2.8506F, 1.8506F, -0.65F, 1, 1, 1, -0.201F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 118, 425, -2.8506F, 1.8506F, -1.85F, 1, 1, 1, -0.201F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 122, 425, -2.8506F, 1.8506F, -3.05F, 1, 1, 1, -0.201F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 126, 425, -2.8506F, 1.8506F, -4.25F, 1, 1, 1, -0.201F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 130, 425, -2.8506F, 1.8506F, -5.65F, 1, 1, 1, -0.201F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 374, 103, -2.9996F, 1.8746F, -5.599F, 1, 1, 23, -0.35F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(1.6F, -1.0F, 3.25F);
		rails3.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, -0.7854F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 134, 425, -2.8506F, 1.8506F, 12.9F, 1, 1, 1, -0.201F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 138, 425, -2.8506F, 1.8506F, 11.7F, 1, 1, 1, -0.201F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 142, 425, -2.8506F, 1.8506F, 10.5F, 1, 1, 1, -0.201F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 146, 425, -2.8506F, 1.8506F, 9.3F, 1, 1, 1, -0.201F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 150, 425, -2.8506F, 1.8506F, 8.1F, 1, 1, 1, -0.201F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 154, 425, -2.8506F, 1.8506F, 6.9F, 1, 1, 1, -0.201F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 158, 425, -2.8506F, 1.8506F, 5.7F, 1, 1, 1, -0.201F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 162, 425, -2.8506F, 1.8506F, 4.5F, 1, 1, 1, -0.201F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 166, 425, -2.8506F, 1.8506F, 3.3F, 1, 1, 1, -0.201F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 170, 425, -2.8506F, 1.8506F, 2.1F, 1, 1, 1, -0.201F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 174, 425, -2.8506F, 1.8506F, 0.9F, 1, 1, 1, -0.201F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 178, 425, -2.8506F, 1.8506F, -0.3F, 1, 1, 1, -0.201F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 182, 425, -2.8506F, 1.8506F, -1.5F, 1, 1, 1, -0.201F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 186, 425, -2.8506F, 1.8506F, -2.7F, 1, 1, 1, -0.201F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 244, 425, -2.8506F, 1.8506F, -3.9F, 1, 1, 1, -0.201F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 248, 425, -2.8506F, 1.8506F, -5.1F, 1, 1, 1, -0.201F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 252, 425, -2.8506F, 1.8506F, -6.3F, 1, 1, 1, -0.201F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 352, 425, -2.8506F, 1.8506F, -7.5F, 1, 1, 1, -0.201F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 356, 425, -2.8506F, 1.8506F, -8.9F, 1, 1, 1, -0.201F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 146, 375, -2.8746F, 1.9996F, -8.849F, 1, 1, 23, -0.35F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handguardC.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}