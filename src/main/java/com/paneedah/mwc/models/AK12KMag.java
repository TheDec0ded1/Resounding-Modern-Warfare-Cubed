package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AK12KMag extends ModelBase {
	private final ModelRenderer ak12Magazine;
	private final ModelRenderer bone7;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
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
	private final ModelRenderer bone;
	private final ModelRenderer magBody545;
	private final ModelRenderer Magazine9;
	private final ModelRenderer Magazine3_r1;
	private final ModelRenderer Magazine13;
	private final ModelRenderer Magazine5_r1;
	private final ModelRenderer Magazine10;
	private final ModelRenderer Magazine5_r2;
	private final ModelRenderer Magazine12;
	private final ModelRenderer Magazine6_r1;
	private final ModelRenderer Magazine14;
	private final ModelRenderer Magazine6_r2;
	private final ModelRenderer Magazine15;
	private final ModelRenderer Magazine7_r1;
	private final ModelRenderer Magazine11;
	private final ModelRenderer Magazine5_r3;
	private final ModelRenderer Magazine16;
	private final ModelRenderer Magazine9_r1;

	public AK12KMag() {
		textureWidth = 192;
		textureHeight = 192;

		ak12Magazine = new ModelRenderer(this);
		ak12Magazine.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-1.5F, -19.6831F, -25.3108F);
		ak12Magazine.addChild(bone7);
		setRotationAngle(bone7, 0.0873F, 0.0F, 0.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 3.8479F, -1.6986F);
		bone7.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.6545F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 155, 66, -2.5F, -4.3383F, 2.4424F, 5, 7, 1, -0.3F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 4.1699F, -1.7217F);
		bone7.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.6545F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 64, 159, -2.5F, -3.1617F, -3.4424F, 5, 6, 1, -0.3F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, -6.1928F, 10.7534F);
		bone7.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.4363F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 113, 152, -2.5F, 3.4F, -3.8F, 5, 8, 1, -0.3F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, -11.1688F, -0.0397F);
		bone7.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.4363F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 17, 155, -2.5F, 4.525F, 2.2F, 5, 7, 1, -0.3F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, -8.9021F, 4.4634F);
		bone7.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.2182F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 159, 9, -2.5F, -1.6F, -3.8F, 5, 6, 1, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 112, 162, -2.5F, 1.7F, 0.2F, 5, 3, 1, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 26, 172, -2.5F, 3.325F, -1.8F, 5, 1, 1, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 162, 170, -2.5F, 2.125F, -1.8F, 5, 2, 1, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 161, 59, -2.5F, -1.2F, -1.7F, 5, 3, 1, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 170, 148, -2.5F, -0.6F, 0.2F, 5, 2, 1, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 77, 159, -2.5F, -0.475F, 2.2F, 5, 5, 1, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 136, 0, -2.5F, 0.8F, -3.8F, 5, 1, 7, -0.3F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, -3.1527F, 1.4342F);
		bone7.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.2618F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 39, 172, -2.5F, 0.0091F, -0.3542F, 5, 1, 1, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 103, 171, -2.5F, -1.1909F, -0.3542F, 5, 2, 1, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 139, 162, -2.5F, -1.6159F, 1.6458F, 5, 3, 1, -0.3F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, -3.1527F, 1.4342F);
		bone7.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.3491F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 172, 83, -2.5F, 0.2707F, -2.4237F, 5, 1, 1, -0.3F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 138, 19, -2.5F, 0.2707F, -2.0237F, 5, 1, 6, -0.3F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, -3.1527F, 1.4342F);
		bone7.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.2182F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 172, 86, -2.5F, -1.5497F, 3.389F, 5, 1, 1, -0.3F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 140, 37, -2.5F, -1.5497F, -2.011F, 5, 1, 6, -0.3F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, -3.4021F, 2.2634F);
		bone7.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.2618F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 172, 95, -2.5F, 1.7F, -3.375F, 5, 1, 1, -0.3F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 142, 27, -2.5F, 1.7F, -2.975F, 5, 1, 6, -0.3F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, -3.4021F, 2.2634F);
		bone7.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.3054F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 30, 163, -2.5F, 1.7F, 0.2F, 5, 3, 1, -0.3F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 172, 89, -2.5F, 3.325F, -1.8F, 5, 1, 1, -0.3F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 138, 171, -2.5F, 2.125F, -1.8F, 5, 2, 1, -0.3F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.0F, -3.4021F, 2.2634F);
		bone7.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.3927F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 172, 92, -2.5F, 3.7F, -3.05F, 5, 1, 1, -0.3F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 142, 45, -2.5F, 3.7F, -2.85F, 5, 1, 6, -0.3F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.0F, -0.4021F, 1.1634F);
		bone7.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.3491F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 163, 35, -2.5F, 1.7F, 0.2F, 5, 3, 1, -0.3F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 172, 12, -2.5F, 3.325F, -1.8F, 5, 1, 1, -0.3F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 165, -2.5F, 2.125F, -1.8F, 5, 2, 1, -0.3F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.0F, -0.4021F, 1.1634F);
		bone7.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.3054F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 117, 28, -2.5F, 1.7F, -3.9F, 5, 1, 7, -0.3F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.0F, -0.4021F, 1.1634F);
		bone7.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.4363F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 13, 172, -2.5F, 3.7F, 1.725F, 5, 1, 1, -0.3F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 71, 142, -2.5F, 3.7F, -3.575F, 5, 1, 6, -0.3F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.0F, 4.8514F, -2.2626F);
		bone7.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.4363F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 43, 164, -2.5F, -1.0782F, -1.4593F, 5, 2, 1, -0.3F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 170, 80, -2.5F, 0.1218F, -1.4593F, 5, 1, 1, -0.3F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 75, 128, -2.5F, -1.5032F, 0.5407F, 5, 3, 1, -0.3F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.0F, 4.8514F, -2.2626F);
		bone7.addChild(cube_r18);
		setRotationAngle(cube_r18, -0.3927F, 0.0F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 172, 98, -2.5F, -1.4853F, -2.9199F, 5, 1, 1, -0.3F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 94, 142, -2.5F, -1.4853F, -2.5199F, 5, 1, 6, -0.3F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.0F, 4.8514F, -2.2626F);
		bone7.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.5236F, 0.0F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 117, 57, -2.5F, 0.4793F, 1.8852F, 5, 1, 1, -0.3F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 134, 116, -2.5F, 0.4793F, -3.4148F, 5, 1, 6, -0.3F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.0F, -8.9021F, 4.4634F);
		bone7.addChild(cube_r20);
		setRotationAngle(cube_r20, -0.3054F, 0.0F, 0.0F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 136, 57, -2.5F, 3.7F, -3.475F, 5, 1, 7, -0.3F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(0.0F, -8.9021F, 4.4634F);
		bone7.addChild(cube_r21);
		setRotationAngle(cube_r21, -0.1745F, 0.0F, 0.0F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 25, 136, -2.5F, 1.7F, -3.9F, 5, 1, 7, -0.3F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-1.8815F, -10.3529F, 4.6314F);
		bone7.addChild(cube_r22);
		setRotationAngle(cube_r22, -0.3873F, 0.0665F, 0.1615F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 34, 147, -0.5F, -1.0F, -3.5F, 1, 2, 7, -0.3F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-5.8147F, -7.9611F, 4.0736F);
		bone7.addChild(cube_r23);
		setRotationAngle(cube_r23, -0.3873F, -0.0665F, -0.1615F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 17, 145, 7.5F, -2.05F, -3.9F, 1, 2, 7, -0.3F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(0.0F, -8.9021F, 4.4634F);
		bone7.addChild(cube_r24);
		setRotationAngle(cube_r24, -0.3927F, 0.0F, 0.0F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 136, -2.5F, -1.05F, -3.9F, 5, 1, 7, -0.3F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, -0.4F, 0.025F);
		ak12Magazine.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 157, 75, -0.5F, -32.6627F, -23.0229F, 1, 2, 5, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 157, 116, -3.5F, -32.6627F, -23.0229F, 1, 2, 5, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 176, 36, -2.5F, -31.6627F, -19.0229F, 2, 1, 1, 0.0F, false));

		magBody545 = new ModelRenderer(this);
		magBody545.setRotationPoint(0.0F, -3.2501F, 2.7271F);
		ak12Magazine.addChild(magBody545);
		setRotationAngle(magBody545, 0.0873F, 0.0F, 0.0F);
		

		Magazine9 = new ModelRenderer(this);
		Magazine9.setRotationPoint(-1.5F, -27.9368F, -25.7133F);
		magBody545.addChild(Magazine9);
		setRotationAngle(Magazine9, -0.1859F, 0.0F, 0.0F);
		

		Magazine3_r1 = new ModelRenderer(this);
		Magazine3_r1.setRotationPoint(0.0F, 4.8809F, 0.4159F);
		Magazine9.addChild(Magazine3_r1);
		setRotationAngle(Magazine3_r1, -0.0436F, 0.0F, 0.0F);
		Magazine3_r1.cubeList.add(new ModelBox(Magazine3_r1, 30, 157, -2.0F, -3.8694F, -3.2778F, 4, 2, 3, -0.2F, false));
		Magazine3_r1.cubeList.add(new ModelBox(Magazine3_r1, 85, 150, -2.0F, -6.3694F, -3.2778F, 4, 5, 3, -0.4F, false));
		Magazine3_r1.cubeList.add(new ModelBox(Magazine3_r1, 157, 83, -2.0F, -7.3694F, -3.2778F, 4, 2, 3, -0.2F, false));
		Magazine3_r1.cubeList.add(new ModelBox(Magazine3_r1, 113, 60, -2.0F, -8.3694F, -0.6778F, 4, 7, 7, 0.0F, false));

		Magazine13 = new ModelRenderer(this);
		Magazine13.setRotationPoint(-1.5F, -28.2765F, -26.8479F);
		magBody545.addChild(Magazine13);
		setRotationAngle(Magazine13, -0.1859F, 0.0F, 0.0F);
		

		Magazine5_r1 = new ModelRenderer(this);
		Magazine5_r1.setRotationPoint(0.0F, 5.005F, 1.5938F);
		Magazine13.addChild(Magazine5_r1);
		setRotationAngle(Magazine5_r1, -0.0436F, 0.0F, 0.0F);
		Magazine5_r1.cubeList.add(new ModelBox(Magazine5_r1, 100, 150, -1.5F, -8.3685F, -3.3057F, 3, 7, 3, 0.0F, false));

		Magazine10 = new ModelRenderer(this);
		Magazine10.setRotationPoint(-1.5F, -21.9845F, -27.2116F);
		magBody545.addChild(Magazine10);
		setRotationAngle(Magazine10, -1.9204F, 0.0F, 0.0F);
		

		Magazine5_r2 = new ModelRenderer(this);
		Magazine5_r2.setRotationPoint(0.0F, -0.4118F, -2.6234F);
		Magazine10.addChild(Magazine5_r2);
		setRotationAngle(Magazine5_r2, -0.0436F, 0.0F, 0.0F);
		Magazine5_r2.cubeList.add(new ModelBox(Magazine5_r2, 50, 137, -2.0F, 0.3675F, -1.4739F, 4, 3, 6, -0.4F, false));
		Magazine5_r2.cubeList.add(new ModelBox(Magazine5_r2, 161, 53, -2.0F, 0.4675F, 1.0261F, 4, 3, 2, -0.2F, false));
		Magazine5_r2.cubeList.add(new ModelBox(Magazine5_r2, 117, 14, -2.0F, -6.2325F, -1.1239F, 4, 7, 6, 0.0F, false));

		Magazine12 = new ModelRenderer(this);
		Magazine12.setRotationPoint(-1.5F, -16.9923F, -28.6355F);
		magBody545.addChild(Magazine12);
		setRotationAngle(Magazine12, -2.0934F, 0.0F, 0.0F);
		

		Magazine6_r1 = new ModelRenderer(this);
		Magazine6_r1.setRotationPoint(0.0F, 1.1213F, -7.985F);
		Magazine12.addChild(Magazine6_r1);
		setRotationAngle(Magazine6_r1, -0.0436F, 0.0F, 0.0F);
		Magazine6_r1.cubeList.add(new ModelBox(Magazine6_r1, 138, 9, -2.0F, -0.2094F, 3.5314F, 4, 3, 6, -0.4F, false));
		Magazine6_r1.cubeList.add(new ModelBox(Magazine6_r1, 161, 17, -2.0F, -0.2094F, 5.0314F, 4, 3, 2, -0.2F, false));
		Magazine6_r1.cubeList.add(new ModelBox(Magazine6_r1, 115, 0, -2.0F, -6.8094F, 4.0314F, 4, 7, 6, 0.0F, false));

		Magazine14 = new ModelRenderer(this);
		Magazine14.setRotationPoint(-1.5F, -22.1361F, -28.2964F);
		magBody545.addChild(Magazine14);
		setRotationAngle(Magazine14, -1.8767F, 0.0F, 0.0F);
		

		Magazine6_r2 = new ModelRenderer(this);
		Magazine6_r2.setRotationPoint(0.0F, -1.6218F, -2.4964F);
		Magazine14.addChild(Magazine6_r2);
		setRotationAngle(Magazine6_r2, -0.0873F, 0.0F, 0.0F);
		Magazine6_r2.cubeList.add(new ModelBox(Magazine6_r2, 51, 147, -1.5F, 0.3476F, -0.3292F, 3, 3, 5, 0.0F, false));

		Magazine15 = new ModelRenderer(this);
		Magazine15.setRotationPoint(-1.5F, -17.2127F, -30.2442F);
		magBody545.addChild(Magazine15);
		setRotationAngle(Magazine15, -2.0497F, 0.0F, 0.0F);
		

		Magazine7_r1 = new ModelRenderer(this);
		Magazine7_r1.setRotationPoint(0.0F, -0.832F, -8.0032F);
		Magazine15.addChild(Magazine7_r1);
		setRotationAngle(Magazine7_r1, -0.0873F, 0.0F, 0.0F);
		Magazine7_r1.cubeList.add(new ModelBox(Magazine7_r1, 154, 152, -1.5F, -0.2578F, 4.6766F, 3, 3, 4, 0.0F, false));

		Magazine11 = new ModelRenderer(this);
		Magazine11.setRotationPoint(-3.5F, -10.0F, -27.8F);
		magBody545.addChild(Magazine11);
		setRotationAngle(Magazine11, -2.3536F, 0.0F, 0.0F);
		Magazine11.cubeList.add(new ModelBox(Magazine11, 136, 66, 0.0F, -0.1442F, -3.4618F, 4, 7, 5, 0.0F, false));
		Magazine11.cubeList.add(new ModelBox(Magazine11, 90, 161, 0.0F, 0.8558F, 1.5382F, 4, 6, 1, 0.0F, false));
		Magazine11.cubeList.add(new ModelBox(Magazine11, 159, 96, 0.0F, 6.4558F, -3.5118F, 4, 3, 2, -0.2F, false));
		Magazine11.cubeList.add(new ModelBox(Magazine11, 159, 102, 0.0F, 6.2558F, -0.0118F, 4, 3, 2, -0.2F, false));
		Magazine11.cubeList.add(new ModelBox(Magazine11, 151, 170, 0.0F, 2.8558F, 2.5382F, 4, 4, 1, 0.1F, false));

		Magazine5_r3 = new ModelRenderer(this);
		Magazine5_r3.setRotationPoint(2.0F, 16.4768F, 2.0946F);
		Magazine11.addChild(Magazine5_r3);
		setRotationAngle(Magazine5_r3, 0.5236F, 0.0F, 0.0F);
		Magazine5_r3.cubeList.add(new ModelBox(Magazine5_r3, 52, 171, -2.0F, -15.211F, 7.0973F, 4, 4, 1, 0.1F, false));

		Magazine16 = new ModelRenderer(this);
		Magazine16.setRotationPoint(-3.0F, -15.2F, -31.5F);
		magBody545.addChild(Magazine16);
		setRotationAngle(Magazine16, -2.4409F, 0.0F, 0.0F);
		

		Magazine9_r1 = new ModelRenderer(this);
		Magazine9_r1.setRotationPoint(1.5F, 1.2717F, 2.8295F);
		Magazine16.addChild(Magazine9_r1);
		setRotationAngle(Magazine9_r1, 0.0873F, 0.0F, 0.0F);
		Magazine9_r1.cubeList.add(new ModelBox(Magazine9_r1, 172, 106, -1.5F, -1.5F, 0.9125F, 3, 3, 1, 0.1F, false));
		Magazine9_r1.cubeList.add(new ModelBox(Magazine9_r1, 136, 142, -1.5F, -1.5F, -4.4875F, 3, 3, 6, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ak12Magazine.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}