package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class TavorMTAR21Handguard extends ModelBase {
	private final ModelRenderer handguard;
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
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r60;
	private final ModelRenderer cube_r61;

	public TavorMTAR21Handguard() {
		textureWidth = 320;
		textureHeight = 320;

		handguard = new ModelRenderer(this);
		handguard.setRotationPoint(0.0F, 24.0F, -2.0F);
		handguard.cubeList.add(new ModelBox(handguard, 0, 254, -2.998F, -32.1738F, -24.097F, 3, 1, 14, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 276, 59, -5.0117F, -36.1874F, -24.097F, 1, 3, 11, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 278, 22, 1.0157F, -36.1874F, -24.097F, 1, 3, 11, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 292, 263, -3.9219F, -36.5564F, -14.097F, 1, 5, 4, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 34, 254, -0.0741F, -36.5564F, -14.097F, 1, 5, 4, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 264, 221, -2.998F, -38.7011F, -24.097F, 3, 1, 13, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 158, 242, -3.498F, -40.2011F, -25.097F, 4, 3, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 294, 19, -3.498F, -31.9011F, -25.097F, 4, 2, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 154, 247, 1.5157F, -36.1874F, -25.097F, 1, 3, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 44, 246, -5.5117F, -36.1874F, -25.097F, 1, 3, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-4.4219F, -32.2636F, -18.597F);
		handguard.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 44, 242, -0.5F, -0.5F, -6.5F, 1, 3, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-4.8584F, -32.9168F, -18.597F);
		handguard.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.3927F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 304, 18, -0.5F, -0.5F, -6.5F, 1, 1, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-4.8584F, -36.458F, -26.597F);
		handguard.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -1.1781F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 304, 20, -0.5F, -0.5F, 1.5F, 1, 1, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-4.4219F, -37.1113F, -26.597F);
		handguard.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 304, 36, -0.5F, -0.5F, 1.5F, 1, 1, 1, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-3.7686F, -37.5478F, -18.597F);
		handguard.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.3927F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 304, 38, -0.5F, -0.5F, -6.5F, 1, 1, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-4.3584F, -36.458F, -26.597F);
		handguard.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -1.1781F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 202, 303, -0.5F, -0.5F, 2.5F, 1, 1, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 178, 303, -0.5F, -0.5F, 5.0F, 1, 1, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 104, 303, -0.5F, -0.5F, 7.5F, 1, 1, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 100, 303, -0.5F, -0.5F, 10.0F, 1, 1, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 64, 303, -0.5F, -0.5F, 12.5F, 1, 1, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-3.9219F, -37.1113F, -26.597F);
		handguard.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 252, 303, -0.5F, -0.5F, 2.5F, 1, 1, 1, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 182, 303, -0.5F, -0.5F, 5.0F, 1, 1, 1, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 108, 303, -0.5F, -0.5F, 7.5F, 1, 1, 1, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 84, 303, -0.5F, -0.5F, 10.0F, 1, 1, 1, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 60, 303, -0.5F, -0.5F, 12.5F, 1, 1, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.7726F, -37.5478F, -19.597F);
		handguard.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -1.1781F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 304, 40, -0.5F, -0.5F, -5.5F, 1, 1, 1, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(1.4259F, -37.1113F, -27.597F);
		handguard.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.7854F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 304, 42, -0.5F, -0.5F, 2.5F, 1, 1, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(1.8624F, -36.458F, -27.597F);
		handguard.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.3927F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 304, 44, -0.5F, -0.5F, 2.5F, 1, 1, 1, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(1.8624F, -32.9168F, -19.597F);
		handguard.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -1.1781F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 304, 46, -0.5F, -0.5F, -5.5F, 1, 1, 1, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(1.4259F, -32.2636F, -19.597F);
		handguard.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -0.7854F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 292, 298, -2.5F, -0.5F, -5.5F, 3, 1, 1, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(1.3624F, -36.458F, -26.597F);
		handguard.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.3927F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 256, 303, -0.5F, -0.5F, 2.5F, 1, 1, 1, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 186, 303, -0.5F, -0.5F, 5.0F, 1, 1, 1, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 112, 303, -0.5F, -0.5F, 7.5F, 1, 1, 1, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 80, 303, -0.5F, -0.5F, 10.0F, 1, 1, 1, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 72, 303, -0.5F, -0.5F, 12.5F, 1, 1, 1, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.9259F, -37.1113F, -26.597F);
		handguard.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -0.7854F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 260, 303, -0.5F, -0.5F, 2.5F, 1, 1, 1, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 198, 303, -0.5F, -0.5F, 5.0F, 1, 1, 1, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 174, 303, -0.5F, -0.5F, 7.5F, 1, 1, 1, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 76, 303, -0.5F, -0.5F, 10.0F, 1, 1, 1, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 68, 303, -0.5F, -0.5F, 12.5F, 1, 1, 1, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-3.2686F, -37.5478F, -16.597F);
		handguard.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, -0.3927F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 78, 281, -0.5F, -0.5F, -7.5F, 1, 1, 11, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.2726F, -37.5478F, -16.597F);
		handguard.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, -1.1781F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 152, 281, -0.5F, -0.5F, -7.5F, 1, 1, 11, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-3.2686F, -38.0478F, -14.597F);
		handguard.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, -0.3927F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 300, 65, -0.5F, -0.5F, 1.5F, 1, 1, 2, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.2726F, -38.0478F, -14.597F);
		handguard.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, -1.1781F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 300, 68, -0.5F, -0.5F, 1.5F, 1, 1, 2, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-4.3584F, -32.9168F, -16.597F);
		handguard.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, -0.3927F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 280, 36, -0.5F, -0.5F, -7.5F, 1, 1, 11, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-3.2686F, -31.827F, -16.597F);
		handguard.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, -1.1781F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 184, 268, -0.5F, -0.5F, -7.5F, 1, 1, 14, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-3.9219F, -32.2636F, -16.597F);
		handguard.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, -0.7854F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 272, 177, -0.5F, -0.5F, -7.5F, 1, 1, 12, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(1.3624F, -32.9168F, -16.597F);
		handguard.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, -1.1781F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 260, 279, -0.5F, -0.5F, -7.5F, 1, 1, 11, 0.0F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(0.9259F, -32.2636F, -16.597F);
		handguard.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, -0.7854F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 272, 164, -0.5F, -0.5F, -7.5F, 1, 1, 12, 0.0F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(0.2726F, -31.827F, -16.597F);
		handguard.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, -0.3927F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 108, 267, -0.5F, -0.5F, -7.5F, 1, 1, 14, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-3.5008F, -38.8428F, -21.6757F);
		handguard.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 0.0F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 24, 301, 0.9978F, -1.1292F, 0.2037F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 30, 301, 0.9978F, -1.1292F, 1.4537F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 36, 301, 0.9978F, -1.1292F, 2.7037F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 42, 301, 0.9978F, -1.1292F, 3.9537F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 48, 301, 0.9978F, -1.1292F, 5.2037F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 54, 301, 0.9978F, -1.1292F, 6.4537F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 60, 301, 0.9978F, -1.1292F, 7.7037F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 298, 211, 0.9978F, -1.1292F, 8.9537F, 2, 1, 2, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 270, 97, 1.0978F, -0.5292F, -2.4963F, 2, 1, 13, -0.001F, false));
		bone4.cubeList.add(new ModelBox(bone4, 270, 191, 0.8978F, -0.5292F, -2.4963F, 1, 1, 13, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 66, 301, 0.9978F, -1.1292F, -1.0963F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 78, 301, 0.9978F, -1.1292F, -2.3213F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 72, 301, 0.9978F, -1.1292F, -2.6963F, 2, 1, 1, -0.199F, false));

		cube_r60 = new ModelRenderer(this);
		cube_r60.setRotationPoint(-13.2859F, 2.8895F, -26.2993F);
		bone4.addChild(cube_r60);
		setRotationAngle(cube_r60, 0.0F, 0.0F, 0.8901F);
		cube_r60.cubeList.add(new ModelBox(cube_r60, 194, 304, 5.9473F, -13.8591F, 25.203F, 1, 1, 1, -0.198F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 268, 304, 5.9473F, -13.8591F, 23.978F, 1, 1, 1, -0.198F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 206, 304, 5.9473F, -13.8591F, 23.603F, 1, 1, 1, -0.198F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 0, 269, 5.8973F, -13.7091F, 23.603F, 1, 1, 14, -0.35F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 210, 304, 5.9473F, -13.8591F, 34.003F, 1, 1, 1, -0.198F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 214, 304, 5.9473F, -13.8591F, 32.753F, 1, 1, 1, -0.198F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 300, 91, 5.9473F, -13.8591F, 35.253F, 1, 1, 2, -0.198F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 218, 304, 5.9473F, -13.8591F, 31.503F, 1, 1, 1, -0.198F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 304, 218, 5.9473F, -13.8591F, 30.253F, 1, 1, 1, -0.198F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 304, 220, 5.9473F, -13.8591F, 29.003F, 1, 1, 1, -0.198F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 222, 304, 5.9473F, -13.8591F, 27.753F, 1, 1, 1, -0.198F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 304, 222, 5.9473F, -13.8591F, 26.503F, 1, 1, 1, -0.198F, false));

		cube_r61 = new ModelRenderer(this);
		cube_r61.setRotationPoint(-11.6859F, 2.8895F, -26.2993F);
		bone4.addChild(cube_r61);
		setRotationAngle(cube_r61, 0.0F, 0.0F, -0.8901F);
		cube_r61.cubeList.add(new ModelBox(cube_r61, 304, 224, 11.2825F, 8.6527F, 25.203F, 1, 1, 1, -0.198F, false));
		cube_r61.cubeList.add(new ModelBox(cube_r61, 264, 304, 11.2825F, 8.6527F, 23.978F, 1, 1, 1, -0.198F, false));
		cube_r61.cubeList.add(new ModelBox(cube_r61, 226, 304, 11.2825F, 8.6527F, 23.603F, 1, 1, 1, -0.198F, false));
		cube_r61.cubeList.add(new ModelBox(cube_r61, 270, 82, 11.3325F, 8.8027F, 23.603F, 1, 1, 14, -0.35F, false));
		cube_r61.cubeList.add(new ModelBox(cube_r61, 304, 229, 11.2825F, 8.6527F, 34.003F, 1, 1, 1, -0.198F, false));
		cube_r61.cubeList.add(new ModelBox(cube_r61, 230, 304, 11.2825F, 8.6527F, 32.753F, 1, 1, 1, -0.198F, false));
		cube_r61.cubeList.add(new ModelBox(cube_r61, 300, 88, 11.2825F, 8.6527F, 35.253F, 1, 1, 2, -0.198F, false));
		cube_r61.cubeList.add(new ModelBox(cube_r61, 304, 231, 11.2825F, 8.6527F, 31.503F, 1, 1, 1, -0.198F, false));
		cube_r61.cubeList.add(new ModelBox(cube_r61, 234, 304, 11.2825F, 8.6527F, 30.253F, 1, 1, 1, -0.198F, false));
		cube_r61.cubeList.add(new ModelBox(cube_r61, 238, 304, 11.2825F, 8.6527F, 29.003F, 1, 1, 1, -0.198F, false));
		cube_r61.cubeList.add(new ModelBox(cube_r61, 242, 304, 11.2825F, 8.6527F, 27.753F, 1, 1, 1, -0.198F, false));
		cube_r61.cubeList.add(new ModelBox(cube_r61, 246, 304, 11.2825F, 8.6527F, 26.503F, 1, 1, 1, -0.198F, false));
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