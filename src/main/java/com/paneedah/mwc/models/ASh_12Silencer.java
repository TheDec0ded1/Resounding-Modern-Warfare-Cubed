package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ASh_12Silencer extends ModelBase {
	private final ModelRenderer tac_suppressor;
	private final ModelRenderer gun26;
	private final ModelRenderer gun27;
	private final ModelRenderer gun28;
	private final ModelRenderer gun29;
	private final ModelRenderer gun30;
	private final ModelRenderer gun31;
	private final ModelRenderer gun32;
	private final ModelRenderer gun33;
	private final ModelRenderer gun34;
	private final ModelRenderer gun35;
	private final ModelRenderer barrel;
	private final ModelRenderer barrel2;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer barrelouter;
	private final ModelRenderer bone8;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer bone6;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer bone7;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer bone5;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer barrelouter3;
	private final ModelRenderer bone13;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer bone14;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer bone15;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer bone16;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer barrelouter4;
	private final ModelRenderer bone17;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer bone18;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer bone19;
	private final ModelRenderer cube_r30;
	private final ModelRenderer cube_r31;
	private final ModelRenderer bone20;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;
	private final ModelRenderer barrelouter2;
	private final ModelRenderer bone9;
	private final ModelRenderer cube_r34;
	private final ModelRenderer cube_r35;
	private final ModelRenderer bone10;
	private final ModelRenderer cube_r36;
	private final ModelRenderer cube_r37;
	private final ModelRenderer bone11;
	private final ModelRenderer cube_r38;
	private final ModelRenderer cube_r39;
	private final ModelRenderer bone12;
	private final ModelRenderer cube_r40;
	private final ModelRenderer cube_r41;

	public ASh_12Silencer() {
		textureWidth = 512;
		textureHeight = 512;

		tac_suppressor = new ModelRenderer(this);
		tac_suppressor.setRotationPoint(-3.5F, -15.0F, -10.5F);
		

		gun26 = new ModelRenderer(this);
		gun26.setRotationPoint(1.5F, -1.0F, -122.0F);
		tac_suppressor.addChild(gun26);
		gun26.cubeList.add(new ModelBox(gun26, 62, 213, 0.0F, 2.0F, 95.0F, 1, 3, 30, 0.0F, false));

		gun27 = new ModelRenderer(this);
		gun27.setRotationPoint(0.5F, 0.0F, -122.0F);
		tac_suppressor.addChild(gun27);
		gun27.cubeList.add(new ModelBox(gun27, 203, 91, 0.0F, 2.0F, 95.0F, 3, 1, 30, 0.0F, false));

		gun28 = new ModelRenderer(this);
		gun28.setRotationPoint(0.5F, 0.0F, -122.0F);
		tac_suppressor.addChild(gun28);
		setRotationAngle(gun28, 0.0F, 0.0F, -0.7854F);
		gun28.cubeList.add(new ModelBox(gun28, 220, 262, -1.4142F, 1.4142F, 95.0F, 1, 1, 30, 0.0F, false));

		gun29 = new ModelRenderer(this);
		gun29.setRotationPoint(0.5F, 1.0F, -122.0F);
		tac_suppressor.addChild(gun29);
		setRotationAngle(gun29, 0.0F, 0.0F, -0.7854F);
		gun29.cubeList.add(new ModelBox(gun29, 258, 233, -1.4142F, 1.4142F, 95.0F, 1, 1, 30, 0.0F, false));

		gun30 = new ModelRenderer(this);
		gun30.setRotationPoint(1.5F, -1.0F, -122.0F);
		tac_suppressor.addChild(gun30);
		setRotationAngle(gun30, 0.0F, 0.0F, 0.7854F);
		gun30.cubeList.add(new ModelBox(gun30, 258, 202, 1.4142F, 1.4142F, 95.0F, 1, 1, 30, 0.0F, false));

		gun31 = new ModelRenderer(this);
		gun31.setRotationPoint(2.5F, -1.0F, -122.0F);
		tac_suppressor.addChild(gun31);
		setRotationAngle(gun31, 0.0F, 0.0F, 0.7854F);
		gun31.cubeList.add(new ModelBox(gun31, 0, 254, 1.4142F, 1.4142F, 95.0F, 1, 1, 30, 0.0F, false));

		gun32 = new ModelRenderer(this);
		gun32.setRotationPoint(2.5F, -1.0F, -122.0F);
		tac_suppressor.addChild(gun32);
		setRotationAngle(gun32, 0.0F, 0.0F, 0.7854F);
		gun32.cubeList.add(new ModelBox(gun32, 247, 31, 1.8142F, 1.4142F, 95.0F, 1, 1, 30, 0.0F, false));

		gun33 = new ModelRenderer(this);
		gun33.setRotationPoint(0.5F, 1.0F, -122.0F);
		tac_suppressor.addChild(gun33);
		setRotationAngle(gun33, 0.0F, 0.0F, -0.7854F);
		gun33.cubeList.add(new ModelBox(gun33, 32, 246, -1.4142F, 1.8142F, 95.0F, 1, 1, 30, 0.0F, false));

		gun34 = new ModelRenderer(this);
		gun34.setRotationPoint(2.5F, 2.0F, -122.0F);
		tac_suppressor.addChild(gun34);
		setRotationAngle(gun34, 0.0F, 0.0F, -2.3562F);
		gun34.cubeList.add(new ModelBox(gun34, 188, 244, -1.4142F, -1.4142F, 95.0F, 1, 1, 30, 0.0F, false));

		gun35 = new ModelRenderer(this);
		gun35.setRotationPoint(2.5F, 2.0F, -122.0F);
		tac_suppressor.addChild(gun35);
		setRotationAngle(gun35, 0.0F, 0.0F, -2.3562F);
		gun35.cubeList.add(new ModelBox(gun35, 244, 171, -1.4142F, -1.0142F, 95.0F, 1, 1, 30, 0.0F, false));

		barrel = new ModelRenderer(this);
		barrel.setRotationPoint(2.5F, 2.2F, -75.0F);
		tac_suppressor.addChild(barrel);
		

		barrel2 = new ModelRenderer(this);
		barrel2.setRotationPoint(1.0F, 36.8F, 85.5F);
		barrel.addChild(barrel2);
		

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-1.5F, -37.8F, -85.5F);
		barrel2.addChild(bone);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.4363F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 169, 18, -0.5371F, -1.6253F, 26.5F, 2, 1, 17, 0.2F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.4363F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 169, 0, -1.2757F, -1.538F, 26.5F, 2, 1, 17, 0.2F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-1.5F, -32.4F, -85.5F);
		barrel2.addChild(bone4);
		

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone4.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.4363F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 167, 64, 0.7107F, -2.0509F, 26.5F, 2, 1, 17, 0.2F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone4.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.4363F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 178, -2.5235F, -2.1382F, 26.5F, 2, 1, 17, 0.2F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(1.2F, -35.1F, -85.5F);
		barrel2.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, 1.5708F);
		

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.4363F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 167, 46, -1.3885F, 0.2868F, 26.5F, 2, 1, 17, 0.2F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 70.2F, 0.0F);
		bone2.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.4363F);
		

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.4363F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 155, 121, -3.2876F, -0.961F, 26.5F, 2, 1, 17, 0.2F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-4.2F, -35.1F, -85.5F);
		barrel2.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.0F, -1.5708F);
		

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.4363F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 107, 141, -0.6987F, 0.474F, 26.5F, 2, 1, 17, 0.2F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 0.4363F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 59, 144, 1.3749F, -0.7739F, 26.5F, 2, 1, 17, 0.2F, false));

		barrelouter = new ModelRenderer(this);
		barrelouter.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrel.addChild(barrelouter);
		

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-0.5F, 4.4F, 0.0F);
		barrelouter.addChild(bone8);
		

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone8.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.4363F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 46, 135, 0.7329F, -2.9993F, 24.5F, 2, 2, 2, 0.25F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone8.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 0.4363F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 48, 131, -2.5145F, -3.1026F, 24.501F, 2, 2, 2, 0.251F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter.addChild(bone6);
		setRotationAngle(bone6, 0.0F, 0.0F, 1.5708F);
		

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone6.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, 0.4363F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 113, 134, -1.4306F, 0.2145F, 24.502F, 2, 2, 2, 0.252F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone6.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.4363F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 131, 4, -3.3029F, -1.0629F, 24.5F, 2, 2, 2, 0.25F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter.addChild(bone7);
		setRotationAngle(bone7, 0.0F, 0.0F, -1.5708F);
		

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone7.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -0.4363F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 26, 120, -0.6722F, 0.4306F, 24.5F, 2, 2, 2, 0.25F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone7.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, 0.4363F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 131, 0, 1.4046F, -0.8405F, 24.502F, 2, 2, 2, 0.252F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter.addChild(bone5);
		

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, 0.4363F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 113, 130, -0.5405F, -1.7326F, 24.501F, 2, 2, 2, 0.251F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, -0.4363F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 130, 74, -1.2393F, -1.6314F, 24.5F, 2, 2, 2, 0.25F, false));

		barrelouter3 = new ModelRenderer(this);
		barrelouter3.setRotationPoint(0.0F, 0.0F, 26.0F);
		barrel.addChild(barrelouter3);
		

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(-0.5F, 4.4F, 0.0F);
		barrelouter3.addChild(bone13);
		

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone13.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, -0.4363F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 26, 95, 0.6612F, -1.7081F, 17.6F, 2, 1, 4, 0.4F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone13.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, 0.4363F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 61, 113, -2.4681F, -1.7982F, 17.6F, 2, 1, 4, 0.4F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter3.addChild(bone14);
		setRotationAngle(bone14, 0.0F, 0.0F, 1.5708F);
		

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone14.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, 0.4363F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 36, 113, -1.3549F, -0.0257F, 17.6F, 2, 1, 4, 0.4F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone14.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, -0.4363F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 24, 113, -3.202F, -1.218F, 17.6F, 2, 1, 4, 0.4F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter3.addChild(bone15);
		setRotationAngle(bone15, 0.0F, 0.0F, -1.5708F);
		

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone15.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, -0.4363F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 42, 9, -0.7351F, 0.1673F, 17.6F, 2, 1, 4, 0.4F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone15.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, 0.4363F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 12, 113, 1.292F, -1.0249F, 17.6F, 2, 1, 4, 0.4F, false));

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter3.addChild(bone16);
		

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone16.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, 0.4363F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 113, -0.531F, -1.8488F, 17.6F, 2, 1, 4, 0.4F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone16.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.0F, -0.4363F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 103, 81, -1.2759F, -1.7588F, 17.6F, 2, 1, 4, 0.4F, false));

		barrelouter4 = new ModelRenderer(this);
		barrelouter4.setRotationPoint(0.0F, 0.0F, 42.9F);
		barrel.addChild(barrelouter4);
		

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(-0.5F, 4.4F, 0.0F);
		barrelouter4.addChild(bone17);
		

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone17.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, -0.4363F);
		

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone17.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, 0.0F, 0.4363F);
		

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter4.addChild(bone18);
		setRotationAngle(bone18, 0.0F, 0.0F, 1.5708F);
		

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone18.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, 0.0F, 0.4363F);
		

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone18.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.0F, 0.0F, -0.4363F);
		

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter4.addChild(bone19);
		setRotationAngle(bone19, 0.0F, 0.0F, -1.5708F);
		

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone19.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.0F, 0.0F, -0.4363F);
		

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone19.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.0F, 0.0F, 0.4363F);
		

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter4.addChild(bone20);
		

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone20.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.0F, 0.0F, 0.4363F);
		

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone20.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.0F, 0.0F, -0.4363F);
		

		barrelouter2 = new ModelRenderer(this);
		barrelouter2.setRotationPoint(0.0F, 0.0F, 4.0F);
		barrel.addChild(barrelouter2);
		

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-0.5F, 4.4F, 0.0F);
		barrelouter2.addChild(bone9);
		

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone9.addChild(cube_r34);
		setRotationAngle(cube_r34, 0.0F, 0.0F, -0.4363F);
		

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone9.addChild(cube_r35);
		setRotationAngle(cube_r35, 0.0F, 0.0F, 0.4363F);
		

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter2.addChild(bone10);
		setRotationAngle(bone10, 0.0F, 0.0F, 1.5708F);
		

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone10.addChild(cube_r36);
		setRotationAngle(cube_r36, 0.0F, 0.0F, 0.4363F);
		

		cube_r37 = new ModelRenderer(this);
		cube_r37.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone10.addChild(cube_r37);
		setRotationAngle(cube_r37, 0.0F, 0.0F, -0.4363F);
		

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter2.addChild(bone11);
		setRotationAngle(bone11, 0.0F, 0.0F, -1.5708F);
		

		cube_r38 = new ModelRenderer(this);
		cube_r38.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone11.addChild(cube_r38);
		setRotationAngle(cube_r38, 0.0F, 0.0F, -0.4363F);
		

		cube_r39 = new ModelRenderer(this);
		cube_r39.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone11.addChild(cube_r39);
		setRotationAngle(cube_r39, 0.0F, 0.0F, 0.4363F);
		

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter2.addChild(bone12);
		

		cube_r40 = new ModelRenderer(this);
		cube_r40.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone12.addChild(cube_r40);
		setRotationAngle(cube_r40, 0.0F, 0.0F, 0.4363F);
		

		cube_r41 = new ModelRenderer(this);
		cube_r41.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone12.addChild(cube_r41);
		setRotationAngle(cube_r41, 0.0F, 0.0F, -0.4363F);
		
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		tac_suppressor.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}