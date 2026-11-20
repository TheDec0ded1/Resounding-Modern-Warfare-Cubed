package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M4A1Handguard extends ModelBase {
	private final ModelRenderer handguard;
	private final ModelRenderer handguard206_r2;
	private final ModelRenderer handguard205_r3;
	private final ModelRenderer handguard204_r4;
	private final ModelRenderer handguard203_r5;
	private final ModelRenderer handguard205_r4;
	private final ModelRenderer handguard204_r5;
	private final ModelRenderer handguard203_r6;
	private final ModelRenderer handguard202_r5;
	private final ModelRenderer handguard202_r6;
	private final ModelRenderer handguard201_r4;
	private final ModelRenderer handguard200_r3;
	private final ModelRenderer handguard204_r6;
	private final ModelRenderer handguard203_r7;
	private final ModelRenderer handguard202_r7;
	private final ModelRenderer handguard201_r5;
	private final ModelRenderer handguard203_r8;
	private final ModelRenderer handguard202_r8;
	private final ModelRenderer handguard201_r6;
	private final ModelRenderer handguard200_r4;
	private final ModelRenderer handguard199_r2;
	private final ModelRenderer handguard9_r1;
	private final ModelRenderer handguard8_r1;
	private final ModelRenderer handguard14_r1;
	private final ModelRenderer handguard13_r1;
	private final ModelRenderer handguard10_r1;
	private final ModelRenderer handguard11_r1;
	private final ModelRenderer handguard10_r2;
	private final ModelRenderer handguard9_r2;
	private final ModelRenderer handguard9_r3;
	private final ModelRenderer handguard10_r3;
	private final ModelRenderer handguard9_r4;
	private final ModelRenderer handguard20_r1;
	private final ModelRenderer handguard19_r1;
	private final ModelRenderer handguard19_r2;
	private final ModelRenderer handguard18_r1;
	private final ModelRenderer handguard8_r2;
	private final ModelRenderer handguard8_r3;
	private final ModelRenderer handguard9_r5;
	private final ModelRenderer handguard8_r4;
	private final ModelRenderer handguard19_r3;
	private final ModelRenderer handguard18_r2;
	private final ModelRenderer handguard18_r3;
	private final ModelRenderer handguard17_r1;
	private final ModelRenderer handguard7_r1;
	private final ModelRenderer handguard7_r2;
	private final ModelRenderer handguard8_r5;
	private final ModelRenderer handguard7_r3;
	private final ModelRenderer handguard6_r1;
	private final ModelRenderer handguard7_r4;
	private final ModelRenderer handguard8_r6;
	private final ModelRenderer handguard11_r2;
	private final ModelRenderer handguard12_r1;
	private final ModelRenderer handguard11_r3;
	private final ModelRenderer handguard22_r1;
	private final ModelRenderer handguard21_r1;
	private final ModelRenderer handguard21_r2;
	private final ModelRenderer handguard20_r2;
	private final ModelRenderer handguard10_r4;
	private final ModelRenderer handguard9_r6;
	private final ModelRenderer handguard10_r5;
	private final ModelRenderer handguard9_r7;
	private final ModelRenderer handguard8_r7;
	private final ModelRenderer handguard19_r4;
	private final ModelRenderer handguard18_r4;
	private final ModelRenderer handguard18_r5;
	private final ModelRenderer handguard17_r2;
	private final ModelRenderer handguard5_r1;
	private final ModelRenderer handguard4_r1;
	private final ModelRenderer handguard15_r1;

	public M4A1Handguard() {
		textureWidth = 416;
		textureHeight = 416;

		handguard = new ModelRenderer(this);
		handguard.setRotationPoint(0.9F, -13.0F, -45.5F);
		handguard.cubeList.add(new ModelBox(handguard, 316, 382, -3.9F, -2.5F, -0.25F, 3, 3, 1, 0.1F, false));

		handguard206_r2 = new ModelRenderer(this);
		handguard206_r2.setRotationPoint(-0.3F, -0.5F, 19.5F);
		handguard.addChild(handguard206_r2);
		setRotationAngle(handguard206_r2, -0.0349F, 0.096F, 0.4538F);
		handguard206_r2.cubeList.add(new ModelBox(handguard206_r2, 62, 383, -0.999F, 0.2F, 0.05F, 1, 1, 3, 0.0F, false));

		handguard205_r3 = new ModelRenderer(this);
		handguard205_r3.setRotationPoint(-4.5F, -0.5F, 19.5F);
		handguard.addChild(handguard205_r3);
		setRotationAngle(handguard205_r3, -0.0349F, -0.096F, -0.4538F);
		handguard205_r3.cubeList.add(new ModelBox(handguard205_r3, 70, 383, -0.001F, 0.2F, 0.05F, 1, 1, 3, 0.0F, false));

		handguard204_r4 = new ModelRenderer(this);
		handguard204_r4.setRotationPoint(-4.5F, -1.5F, 19.5F);
		handguard.addChild(handguard204_r4);
		setRotationAngle(handguard204_r4, 0.0349F, -0.096F, 0.4538F);
		handguard204_r4.cubeList.add(new ModelBox(handguard204_r4, 124, 383, -0.001F, -1.2F, 0.05F, 1, 1, 3, 0.0F, false));

		handguard203_r5 = new ModelRenderer(this);
		handguard203_r5.setRotationPoint(-0.3F, -1.5F, 19.5F);
		handguard.addChild(handguard203_r5);
		setRotationAngle(handguard203_r5, 0.0349F, 0.096F, -0.4538F);
		handguard203_r5.cubeList.add(new ModelBox(handguard203_r5, 132, 383, -0.999F, -1.2F, 0.05F, 1, 1, 3, 0.0F, false));

		handguard205_r4 = new ModelRenderer(this);
		handguard205_r4.setRotationPoint(-0.3F, -0.5F, 19.5F);
		handguard.addChild(handguard205_r4);
		setRotationAngle(handguard205_r4, 0.0436F, 0.096F, 0.4538F);
		handguard205_r4.cubeList.add(new ModelBox(handguard205_r4, 0, 384, -1.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard204_r5 = new ModelRenderer(this);
		handguard204_r5.setRotationPoint(-4.5F, -0.5F, 19.5F);
		handguard.addChild(handguard204_r5);
		setRotationAngle(handguard204_r5, 0.0436F, -0.096F, -0.4538F);
		handguard204_r5.cubeList.add(new ModelBox(handguard204_r5, 8, 384, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard203_r6 = new ModelRenderer(this);
		handguard203_r6.setRotationPoint(-4.5F, -1.5F, 19.5F);
		handguard.addChild(handguard203_r6);
		setRotationAngle(handguard203_r6, -0.0436F, -0.096F, 0.4538F);
		handguard203_r6.cubeList.add(new ModelBox(handguard203_r6, 16, 384, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard202_r5 = new ModelRenderer(this);
		handguard202_r5.setRotationPoint(-0.3F, -1.5F, 19.5F);
		handguard.addChild(handguard202_r5);
		setRotationAngle(handguard202_r5, -0.0436F, 0.096F, -0.4538F);
		handguard202_r5.cubeList.add(new ModelBox(handguard202_r5, 256, 384, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard202_r6 = new ModelRenderer(this);
		handguard202_r6.setRotationPoint(-4.5F, -0.5F, 19.5F);
		handguard.addChild(handguard202_r6);
		setRotationAngle(handguard202_r6, 0.0F, -0.1047F, 0.0F);
		handguard202_r6.cubeList.add(new ModelBox(handguard202_r6, 264, 384, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard201_r4 = new ModelRenderer(this);
		handguard201_r4.setRotationPoint(-0.3F, -0.5F, 19.5F);
		handguard.addChild(handguard201_r4);
		setRotationAngle(handguard201_r4, 0.0F, 0.1047F, 0.0F);
		handguard201_r4.cubeList.add(new ModelBox(handguard201_r4, 384, 380, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard200_r3 = new ModelRenderer(this);
		handguard200_r3.setRotationPoint(-2.9F, 1.1F, 19.5F);
		handguard.addChild(handguard200_r3);
		setRotationAngle(handguard200_r3, -0.1047F, 0.0F, 0.0F);
		handguard200_r3.cubeList.add(new ModelBox(handguard200_r3, 384, 384, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard204_r6 = new ModelRenderer(this);
		handguard204_r6.setRotationPoint(-1.9F, 1.1F, 19.5F);
		handguard.addChild(handguard204_r6);
		setRotationAngle(handguard204_r6, -0.0925F, 0.0349F, -0.4538F);
		handguard204_r6.cubeList.add(new ModelBox(handguard204_r6, 38, 385, 0.2F, -1.0F, 0.05F, 1, 1, 3, 0.0F, false));

		handguard203_r7 = new ModelRenderer(this);
		handguard203_r7.setRotationPoint(-2.9F, 1.1F, 19.5F);
		handguard.addChild(handguard203_r7);
		setRotationAngle(handguard203_r7, -0.0925F, -0.0349F, 0.4538F);
		handguard203_r7.cubeList.add(new ModelBox(handguard203_r7, 46, 385, -1.2F, -1.0F, 0.05F, 1, 1, 3, 0.0F, false));

		handguard202_r7 = new ModelRenderer(this);
		handguard202_r7.setRotationPoint(-2.9F, -3.1F, 19.5F);
		handguard.addChild(handguard202_r7);
		setRotationAngle(handguard202_r7, 0.0925F, -0.0349F, -0.4538F);
		handguard202_r7.cubeList.add(new ModelBox(handguard202_r7, 54, 385, -1.2F, 0.0F, 0.05F, 1, 1, 3, 0.0F, false));

		handguard201_r5 = new ModelRenderer(this);
		handguard201_r5.setRotationPoint(-1.9F, -3.1F, 19.5F);
		handguard.addChild(handguard201_r5);
		setRotationAngle(handguard201_r5, 0.0925F, 0.0349F, 0.4538F);
		handguard201_r5.cubeList.add(new ModelBox(handguard201_r5, 104, 385, 0.2F, 0.0F, 0.05F, 1, 1, 3, 0.0F, false));

		handguard203_r8 = new ModelRenderer(this);
		handguard203_r8.setRotationPoint(-1.9F, 1.1F, 19.5F);
		handguard.addChild(handguard203_r8);
		setRotationAngle(handguard203_r8, -0.0925F, -0.0524F, -0.4538F);
		handguard203_r8.cubeList.add(new ModelBox(handguard203_r8, 112, 385, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard202_r8 = new ModelRenderer(this);
		handguard202_r8.setRotationPoint(-2.9F, 1.1F, 19.5F);
		handguard.addChild(handguard202_r8);
		setRotationAngle(handguard202_r8, -0.0925F, 0.0524F, 0.4538F);
		handguard202_r8.cubeList.add(new ModelBox(handguard202_r8, 344, 385, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard201_r6 = new ModelRenderer(this);
		handguard201_r6.setRotationPoint(-2.9F, -3.1F, 19.5F);
		handguard.addChild(handguard201_r6);
		setRotationAngle(handguard201_r6, 0.0925F, 0.0524F, -0.4538F);
		handguard201_r6.cubeList.add(new ModelBox(handguard201_r6, 352, 385, -1.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard200_r4 = new ModelRenderer(this);
		handguard200_r4.setRotationPoint(-1.9F, -3.1F, 19.5F);
		handguard.addChild(handguard200_r4);
		setRotationAngle(handguard200_r4, 0.0925F, -0.0524F, 0.4538F);
		handguard200_r4.cubeList.add(new ModelBox(handguard200_r4, 360, 385, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard199_r2 = new ModelRenderer(this);
		handguard199_r2.setRotationPoint(-2.9F, -3.1F, 19.5F);
		handguard.addChild(handguard199_r2);
		setRotationAngle(handguard199_r2, 0.1047F, 0.0F, 0.0F);
		handguard199_r2.cubeList.add(new ModelBox(handguard199_r2, 368, 385, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard9_r1 = new ModelRenderer(this);
		handguard9_r1.setRotationPoint(-3.4F, 76.6F, 0.0F);
		handguard.addChild(handguard9_r1);
		setRotationAngle(handguard9_r1, -0.0175F, 0.0F, 0.0F);
		handguard9_r1.cubeList.add(new ModelBox(handguard9_r1, 190, 389, 1.3F, -75.7F, 17.5F, 1, 1, 2, -0.3F, false));
		handguard9_r1.cubeList.add(new ModelBox(handguard9_r1, 264, 321, 1.299F, -75.699F, -1.6F, 1, 1, 20, -0.3F, false));
		handguard9_r1.cubeList.add(new ModelBox(handguard9_r1, 196, 389, -0.3F, -75.7F, 17.5F, 1, 1, 2, -0.3F, false));
		handguard9_r1.cubeList.add(new ModelBox(handguard9_r1, 306, 321, -0.301F, -75.699F, -1.6F, 1, 1, 20, -0.3F, false));

		handguard8_r1 = new ModelRenderer(this);
		handguard8_r1.setRotationPoint(-3.4F, -3.6F, 0.0F);
		handguard.addChild(handguard8_r1);
		setRotationAngle(handguard8_r1, 0.0175F, 0.0F, 0.0F);
		handguard8_r1.cubeList.add(new ModelBox(handguard8_r1, 202, 389, 1.3F, -0.3F, 18.8F, 1, 1, 2, -0.3F, false));
		handguard8_r1.cubeList.add(new ModelBox(handguard8_r1, 352, 234, 1.299F, -0.301F, -0.3F, 1, 1, 20, -0.3F, false));
		handguard8_r1.cubeList.add(new ModelBox(handguard8_r1, 208, 389, -0.3F, -0.3F, 18.8F, 1, 1, 2, -0.3F, false));
		handguard8_r1.cubeList.add(new ModelBox(handguard8_r1, 354, 0, -0.301F, -0.301F, -0.3F, 1, 1, 20, -0.3F, false));

		handguard14_r1 = new ModelRenderer(this);
		handguard14_r1.setRotationPoint(-3.4F, 76.5F, 0.0F);
		handguard.addChild(handguard14_r1);
		setRotationAngle(handguard14_r1, -0.0175F, 0.0F, 0.0F);
		handguard14_r1.cubeList.add(new ModelBox(handguard14_r1, 36, 392, -0.001F, -76.0F, 18.2F, 2, 1, 1, 0.0F, false));
		handguard14_r1.cubeList.add(new ModelBox(handguard14_r1, 386, 269, -0.001F, -75.999F, 16.7F, 2, 1, 2, 0.0F, false));
		handguard14_r1.cubeList.add(new ModelBox(handguard14_r1, 392, 37, -0.001F, -75.999F, 14.7F, 2, 1, 1, 0.0F, false));
		handguard14_r1.cubeList.add(new ModelBox(handguard14_r1, 392, 39, -0.001F, -75.999F, 8.7F, 2, 1, 1, 0.0F, false));
		handguard14_r1.cubeList.add(new ModelBox(handguard14_r1, 392, 41, -0.001F, -75.999F, 2.7F, 2, 1, 1, 0.0F, false));
		handguard14_r1.cubeList.add(new ModelBox(handguard14_r1, 392, 77, -0.001F, -75.999F, 12.7F, 2, 1, 1, 0.0F, false));
		handguard14_r1.cubeList.add(new ModelBox(handguard14_r1, 42, 392, -0.001F, -75.999F, 6.7F, 2, 1, 1, 0.0F, false));
		handguard14_r1.cubeList.add(new ModelBox(handguard14_r1, 392, 43, -0.001F, -75.999F, 0.7F, 2, 1, 1, 0.0F, false));
		handguard14_r1.cubeList.add(new ModelBox(handguard14_r1, 392, 45, -0.001F, -75.999F, 10.7F, 2, 1, 1, 0.0F, false));
		handguard14_r1.cubeList.add(new ModelBox(handguard14_r1, 392, 47, -0.001F, -75.999F, 4.7F, 2, 1, 1, 0.0F, false));
		handguard14_r1.cubeList.add(new ModelBox(handguard14_r1, 354, 59, 1.2F, -75.8F, -0.8F, 1, 1, 18, -0.2F, false));
		handguard14_r1.cubeList.add(new ModelBox(handguard14_r1, 354, 78, -0.2F, -75.8F, -0.8F, 1, 1, 18, -0.2F, false));
		handguard14_r1.cubeList.add(new ModelBox(handguard14_r1, 48, 392, -0.001F, -75.999F, -1.3F, 2, 1, 1, 0.0F, false));

		handguard13_r1 = new ModelRenderer(this);
		handguard13_r1.setRotationPoint(-3.4F, -3.5F, 0.0F);
		handguard.addChild(handguard13_r1);
		setRotationAngle(handguard13_r1, 0.0175F, 0.0F, 0.0F);
		handguard13_r1.cubeList.add(new ModelBox(handguard13_r1, 392, 49, -0.001F, 0.0F, 19.5F, 2, 1, 1, 0.0F, false));
		handguard13_r1.cubeList.add(new ModelBox(handguard13_r1, 272, 386, -0.001F, -0.001F, 18.0F, 2, 1, 2, 0.0F, false));
		handguard13_r1.cubeList.add(new ModelBox(handguard13_r1, 392, 51, -0.001F, -0.001F, 16.0F, 2, 1, 1, 0.0F, false));
		handguard13_r1.cubeList.add(new ModelBox(handguard13_r1, 392, 53, -0.001F, -0.001F, 10.0F, 2, 1, 1, 0.0F, false));
		handguard13_r1.cubeList.add(new ModelBox(handguard13_r1, 54, 392, -0.001F, -0.001F, 4.0F, 2, 1, 1, 0.0F, false));
		handguard13_r1.cubeList.add(new ModelBox(handguard13_r1, 392, 55, -0.001F, -0.001F, 14.0F, 2, 1, 1, 0.0F, false));
		handguard13_r1.cubeList.add(new ModelBox(handguard13_r1, 392, 57, -0.001F, -0.001F, 8.0F, 2, 1, 1, 0.0F, false));
		handguard13_r1.cubeList.add(new ModelBox(handguard13_r1, 392, 59, -0.001F, -0.001F, 2.0F, 2, 1, 1, 0.0F, false));
		handguard13_r1.cubeList.add(new ModelBox(handguard13_r1, 392, 61, -0.001F, -0.001F, 12.0F, 2, 1, 1, 0.0F, false));
		handguard13_r1.cubeList.add(new ModelBox(handguard13_r1, 392, 63, -0.001F, -0.001F, 6.0F, 2, 1, 1, 0.0F, false));
		handguard13_r1.cubeList.add(new ModelBox(handguard13_r1, 354, 21, 1.2F, -0.202F, 0.5F, 1, 1, 18, -0.2F, false));
		handguard13_r1.cubeList.add(new ModelBox(handguard13_r1, 354, 40, -0.2F, -0.202F, 0.5F, 1, 1, 18, -0.2F, false));
		handguard13_r1.cubeList.add(new ModelBox(handguard13_r1, 392, 65, -0.001F, -0.001F, 0.0F, 2, 1, 1, 0.0F, false));

		handguard10_r1 = new ModelRenderer(this);
		handguard10_r1.setRotationPoint(-3.4F, -3.5F, 0.0F);
		handguard.addChild(handguard10_r1);
		setRotationAngle(handguard10_r1, 0.0157F, -0.0044F, -0.5236F);
		handguard10_r1.cubeList.add(new ModelBox(handguard10_r1, 322, 299, -1.05F, -0.001F, 0.5F, 1, 1, 20, 0.0F, false));

		handguard11_r1 = new ModelRenderer(this);
		handguard11_r1.setRotationPoint(-3.4F, 1.5F, 0.0F);
		handguard.addChild(handguard11_r1);
		setRotationAngle(handguard11_r1, -0.0157F, -0.0044F, 0.5236F);
		handguard11_r1.cubeList.add(new ModelBox(handguard11_r1, 132, 323, -1.05F, -0.999F, 0.5F, 1, 1, 20, 0.0F, false));

		handguard10_r2 = new ModelRenderer(this);
		handguard10_r2.setRotationPoint(-1.4F, 1.5F, 0.0F);
		handguard.addChild(handguard10_r2);
		setRotationAngle(handguard10_r2, -0.0157F, 0.0044F, -0.5236F);
		handguard10_r2.cubeList.add(new ModelBox(handguard10_r2, 44, 326, 0.05F, -0.999F, 0.5F, 1, 1, 20, 0.0F, false));

		handguard9_r2 = new ModelRenderer(this);
		handguard9_r2.setRotationPoint(-1.4F, -3.5F, 0.0F);
		handguard.addChild(handguard9_r2);
		setRotationAngle(handguard9_r2, 0.0157F, 0.0044F, 0.5236F);
		handguard9_r2.cubeList.add(new ModelBox(handguard9_r2, 86, 326, 0.05F, -0.001F, 0.5F, 1, 1, 20, 0.0F, false));

		handguard9_r3 = new ModelRenderer(this);
		handguard9_r3.setRotationPoint(-3.4F, -3.5F, 0.0F);
		handguard.addChild(handguard9_r3);
		setRotationAngle(handguard9_r3, 0.014F, -0.0044F, -0.5236F);
		handguard9_r3.cubeList.add(new ModelBox(handguard9_r3, 108, 396, -1.05F, -0.002F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard10_r3 = new ModelRenderer(this);
		handguard10_r3.setRotationPoint(-3.4F, 1.5F, 0.0F);
		handguard.addChild(handguard10_r3);
		setRotationAngle(handguard10_r3, -0.014F, -0.0044F, 0.5236F);
		handguard10_r3.cubeList.add(new ModelBox(handguard10_r3, 396, 109, -1.05F, -0.998F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard9_r4 = new ModelRenderer(this);
		handguard9_r4.setRotationPoint(-1.4F, 1.5F, 0.0F);
		handguard.addChild(handguard9_r4);
		setRotationAngle(handguard9_r4, -0.014F, 0.0044F, -0.5236F);
		handguard9_r4.cubeList.add(new ModelBox(handguard9_r4, 396, 111, 0.05F, -0.998F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard20_r1 = new ModelRenderer(this);
		handguard20_r1.setRotationPoint(-3.4F, 1.6F, 0.0F);
		handguard.addChild(handguard20_r1);
		setRotationAngle(handguard20_r1, -0.014F, -0.0044F, 0.5236F);
		handguard20_r1.cubeList.add(new ModelBox(handguard20_r1, 112, 396, -1.15F, -1.012F, 19.0F, 1, 1, 1, 0.0F, false));
		handguard20_r1.cubeList.add(new ModelBox(handguard20_r1, 396, 113, -1.15F, -1.012F, 17.0F, 1, 1, 1, 0.0F, false));
		handguard20_r1.cubeList.add(new ModelBox(handguard20_r1, 396, 115, -1.15F, -1.012F, 15.0F, 1, 1, 1, 0.0F, false));
		handguard20_r1.cubeList.add(new ModelBox(handguard20_r1, 116, 396, -1.15F, -1.012F, 13.0F, 1, 1, 1, 0.0F, false));
		handguard20_r1.cubeList.add(new ModelBox(handguard20_r1, 396, 117, -1.15F, -1.012F, 11.0F, 1, 1, 1, 0.0F, false));
		handguard20_r1.cubeList.add(new ModelBox(handguard20_r1, 396, 119, -1.15F, -1.012F, 9.0F, 1, 1, 1, 0.0F, false));
		handguard20_r1.cubeList.add(new ModelBox(handguard20_r1, 120, 396, -1.15F, -1.012F, 7.0F, 1, 1, 1, 0.0F, false));
		handguard20_r1.cubeList.add(new ModelBox(handguard20_r1, 396, 121, -1.15F, -1.012F, 5.0F, 1, 1, 1, 0.0F, false));
		handguard20_r1.cubeList.add(new ModelBox(handguard20_r1, 396, 123, -1.15F, -1.012F, 3.0F, 1, 1, 1, 0.0F, false));
		handguard20_r1.cubeList.add(new ModelBox(handguard20_r1, 124, 396, -1.15F, -1.012F, 1.0F, 1, 1, 1, 0.0F, false));

		handguard19_r1 = new ModelRenderer(this);
		handguard19_r1.setRotationPoint(-1.4F, 1.6F, 0.0F);
		handguard.addChild(handguard19_r1);
		setRotationAngle(handguard19_r1, -0.014F, 0.0044F, -0.5236F);
		handguard19_r1.cubeList.add(new ModelBox(handguard19_r1, 396, 125, 0.15F, -1.012F, 19.0F, 1, 1, 1, 0.0F, false));
		handguard19_r1.cubeList.add(new ModelBox(handguard19_r1, 396, 127, 0.15F, -1.012F, 17.0F, 1, 1, 1, 0.0F, false));
		handguard19_r1.cubeList.add(new ModelBox(handguard19_r1, 128, 396, 0.15F, -1.012F, 15.0F, 1, 1, 1, 0.0F, false));
		handguard19_r1.cubeList.add(new ModelBox(handguard19_r1, 132, 396, 0.15F, -1.012F, 13.0F, 1, 1, 1, 0.0F, false));
		handguard19_r1.cubeList.add(new ModelBox(handguard19_r1, 136, 396, 0.15F, -1.012F, 11.0F, 1, 1, 1, 0.0F, false));
		handguard19_r1.cubeList.add(new ModelBox(handguard19_r1, 396, 136, 0.15F, -1.012F, 9.0F, 1, 1, 1, 0.0F, false));
		handguard19_r1.cubeList.add(new ModelBox(handguard19_r1, 396, 138, 0.15F, -1.012F, 7.0F, 1, 1, 1, 0.0F, false));
		handguard19_r1.cubeList.add(new ModelBox(handguard19_r1, 140, 396, 0.15F, -1.012F, 5.0F, 1, 1, 1, 0.0F, false));
		handguard19_r1.cubeList.add(new ModelBox(handguard19_r1, 396, 140, 0.15F, -1.012F, 3.0F, 1, 1, 1, 0.0F, false));
		handguard19_r1.cubeList.add(new ModelBox(handguard19_r1, 396, 142, 0.15F, -1.012F, 1.0F, 1, 1, 1, 0.0F, false));

		handguard19_r2 = new ModelRenderer(this);
		handguard19_r2.setRotationPoint(-3.4F, -3.6F, 0.0F);
		handguard.addChild(handguard19_r2);
		setRotationAngle(handguard19_r2, 0.014F, -0.0044F, -0.5236F);
		handguard19_r2.cubeList.add(new ModelBox(handguard19_r2, 144, 396, -1.15F, 0.012F, 19.0F, 1, 1, 1, 0.0F, false));
		handguard19_r2.cubeList.add(new ModelBox(handguard19_r2, 396, 144, -1.15F, 0.012F, 17.0F, 1, 1, 1, 0.0F, false));
		handguard19_r2.cubeList.add(new ModelBox(handguard19_r2, 396, 146, -1.15F, 0.012F, 15.0F, 1, 1, 1, 0.0F, false));
		handguard19_r2.cubeList.add(new ModelBox(handguard19_r2, 148, 396, -1.15F, 0.012F, 13.0F, 1, 1, 1, 0.0F, false));
		handguard19_r2.cubeList.add(new ModelBox(handguard19_r2, 396, 148, -1.15F, 0.012F, 11.0F, 1, 1, 1, 0.0F, false));
		handguard19_r2.cubeList.add(new ModelBox(handguard19_r2, 396, 150, -1.15F, 0.012F, 9.0F, 1, 1, 1, 0.0F, false));
		handguard19_r2.cubeList.add(new ModelBox(handguard19_r2, 152, 396, -1.15F, 0.012F, 7.0F, 1, 1, 1, 0.0F, false));
		handguard19_r2.cubeList.add(new ModelBox(handguard19_r2, 396, 152, -1.15F, 0.012F, 5.0F, 1, 1, 1, 0.0F, false));
		handguard19_r2.cubeList.add(new ModelBox(handguard19_r2, 396, 154, -1.15F, 0.012F, 3.0F, 1, 1, 1, 0.0F, false));
		handguard19_r2.cubeList.add(new ModelBox(handguard19_r2, 156, 396, -1.15F, 0.012F, 1.0F, 1, 1, 1, 0.0F, false));

		handguard18_r1 = new ModelRenderer(this);
		handguard18_r1.setRotationPoint(-1.4F, -3.6F, 0.0F);
		handguard.addChild(handguard18_r1);
		setRotationAngle(handguard18_r1, 0.014F, 0.0044F, 0.5236F);
		handguard18_r1.cubeList.add(new ModelBox(handguard18_r1, 160, 396, 0.15F, 0.012F, 19.0F, 1, 1, 1, 0.0F, false));
		handguard18_r1.cubeList.add(new ModelBox(handguard18_r1, 164, 396, 0.15F, 0.012F, 17.0F, 1, 1, 1, 0.0F, false));
		handguard18_r1.cubeList.add(new ModelBox(handguard18_r1, 168, 396, 0.15F, 0.012F, 15.0F, 1, 1, 1, 0.0F, false));
		handguard18_r1.cubeList.add(new ModelBox(handguard18_r1, 172, 396, 0.15F, 0.012F, 13.0F, 1, 1, 1, 0.0F, false));
		handguard18_r1.cubeList.add(new ModelBox(handguard18_r1, 176, 396, 0.15F, 0.012F, 11.0F, 1, 1, 1, 0.0F, false));
		handguard18_r1.cubeList.add(new ModelBox(handguard18_r1, 180, 396, 0.15F, 0.012F, 9.0F, 1, 1, 1, 0.0F, false));
		handguard18_r1.cubeList.add(new ModelBox(handguard18_r1, 184, 396, 0.15F, 0.012F, 7.0F, 1, 1, 1, 0.0F, false));
		handguard18_r1.cubeList.add(new ModelBox(handguard18_r1, 188, 396, 0.15F, 0.012F, 5.0F, 1, 1, 1, 0.0F, false));
		handguard18_r1.cubeList.add(new ModelBox(handguard18_r1, 192, 396, 0.15F, 0.012F, 3.0F, 1, 1, 1, 0.0F, false));
		handguard18_r1.cubeList.add(new ModelBox(handguard18_r1, 196, 396, 0.15F, 0.012F, 1.0F, 1, 1, 1, 0.0F, false));

		handguard8_r2 = new ModelRenderer(this);
		handguard8_r2.setRotationPoint(-1.4F, -3.5F, 0.0F);
		handguard.addChild(handguard8_r2);
		setRotationAngle(handguard8_r2, 0.014F, 0.0044F, 0.5236F);
		handguard8_r2.cubeList.add(new ModelBox(handguard8_r2, 200, 396, 0.05F, -0.002F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard8_r3 = new ModelRenderer(this);
		handguard8_r3.setRotationPoint(-3.4F, -3.5F, 0.0F);
		handguard.addChild(handguard8_r3);
		setRotationAngle(handguard8_r3, 0.014F, 0.0087F, -0.5236F);
		handguard8_r3.cubeList.add(new ModelBox(handguard8_r3, 204, 396, -1.001F, -0.001F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard9_r5 = new ModelRenderer(this);
		handguard9_r5.setRotationPoint(-3.4F, 1.5F, 0.0F);
		handguard.addChild(handguard9_r5);
		setRotationAngle(handguard9_r5, -0.014F, 0.0087F, 0.5236F);
		handguard9_r5.cubeList.add(new ModelBox(handguard9_r5, 208, 396, -1.001F, -0.999F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard8_r4 = new ModelRenderer(this);
		handguard8_r4.setRotationPoint(-1.4F, 1.5F, 0.0F);
		handguard.addChild(handguard8_r4);
		setRotationAngle(handguard8_r4, -0.014F, -0.0087F, -0.5236F);
		handguard8_r4.cubeList.add(new ModelBox(handguard8_r4, 212, 396, 0.001F, -0.999F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard19_r3 = new ModelRenderer(this);
		handguard19_r3.setRotationPoint(-3.4F, 1.6F, 1.0F);
		handguard.addChild(handguard19_r3);
		setRotationAngle(handguard19_r3, -0.014F, 0.0087F, 0.5236F);
		handguard19_r3.cubeList.add(new ModelBox(handguard19_r3, 216, 396, -1.001F, -0.999F, 18.0F, 1, 1, 1, 0.0F, false));
		handguard19_r3.cubeList.add(new ModelBox(handguard19_r3, 220, 396, -1.001F, -0.999F, 16.0F, 1, 1, 1, 0.0F, false));
		handguard19_r3.cubeList.add(new ModelBox(handguard19_r3, 224, 396, -1.001F, -0.999F, 14.0F, 1, 1, 1, 0.0F, false));
		handguard19_r3.cubeList.add(new ModelBox(handguard19_r3, 228, 396, -1.001F, -0.999F, 12.0F, 1, 1, 1, 0.0F, false));
		handguard19_r3.cubeList.add(new ModelBox(handguard19_r3, 396, 231, -1.001F, -0.999F, 10.0F, 1, 1, 1, 0.0F, false));
		handguard19_r3.cubeList.add(new ModelBox(handguard19_r3, 232, 396, -1.001F, -0.999F, 8.0F, 1, 1, 1, 0.0F, false));
		handguard19_r3.cubeList.add(new ModelBox(handguard19_r3, 236, 396, -1.001F, -0.999F, 6.0F, 1, 1, 1, 0.0F, false));
		handguard19_r3.cubeList.add(new ModelBox(handguard19_r3, 240, 396, -1.001F, -0.999F, 4.0F, 1, 1, 1, 0.0F, false));
		handguard19_r3.cubeList.add(new ModelBox(handguard19_r3, 244, 396, -1.001F, -0.999F, 2.0F, 1, 1, 1, 0.0F, false));
		handguard19_r3.cubeList.add(new ModelBox(handguard19_r3, 396, 254, -1.001F, -0.999F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard18_r2 = new ModelRenderer(this);
		handguard18_r2.setRotationPoint(-1.4F, 1.6F, 1.0F);
		handguard.addChild(handguard18_r2);
		setRotationAngle(handguard18_r2, -0.014F, -0.0087F, -0.5236F);
		handguard18_r2.cubeList.add(new ModelBox(handguard18_r2, 396, 256, 0.001F, -0.999F, 18.0F, 1, 1, 1, 0.0F, false));
		handguard18_r2.cubeList.add(new ModelBox(handguard18_r2, 396, 258, 0.001F, -0.999F, 16.0F, 1, 1, 1, 0.0F, false));
		handguard18_r2.cubeList.add(new ModelBox(handguard18_r2, 396, 260, 0.001F, -0.999F, 14.0F, 1, 1, 1, 0.0F, false));
		handguard18_r2.cubeList.add(new ModelBox(handguard18_r2, 396, 262, 0.001F, -0.999F, 12.0F, 1, 1, 1, 0.0F, false));
		handguard18_r2.cubeList.add(new ModelBox(handguard18_r2, 268, 396, 0.001F, -0.999F, 10.0F, 1, 1, 1, 0.0F, false));
		handguard18_r2.cubeList.add(new ModelBox(handguard18_r2, 396, 271, 0.001F, -0.999F, 8.0F, 1, 1, 1, 0.0F, false));
		handguard18_r2.cubeList.add(new ModelBox(handguard18_r2, 272, 396, 0.001F, -0.999F, 6.0F, 1, 1, 1, 0.0F, false));
		handguard18_r2.cubeList.add(new ModelBox(handguard18_r2, 396, 273, 0.001F, -0.999F, 4.0F, 1, 1, 1, 0.0F, false));
		handguard18_r2.cubeList.add(new ModelBox(handguard18_r2, 396, 275, 0.001F, -0.999F, 2.0F, 1, 1, 1, 0.0F, false));
		handguard18_r2.cubeList.add(new ModelBox(handguard18_r2, 276, 396, 0.001F, -0.999F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard18_r3 = new ModelRenderer(this);
		handguard18_r3.setRotationPoint(-3.4F, -3.6F, 1.0F);
		handguard.addChild(handguard18_r3);
		setRotationAngle(handguard18_r3, 0.014F, 0.0087F, -0.5236F);
		handguard18_r3.cubeList.add(new ModelBox(handguard18_r3, 396, 277, -1.001F, -0.001F, 18.0F, 1, 1, 1, 0.0F, false));
		handguard18_r3.cubeList.add(new ModelBox(handguard18_r3, 396, 279, -1.001F, -0.001F, 16.0F, 1, 1, 1, 0.0F, false));
		handguard18_r3.cubeList.add(new ModelBox(handguard18_r3, 280, 396, -1.001F, -0.001F, 14.0F, 1, 1, 1, 0.0F, false));
		handguard18_r3.cubeList.add(new ModelBox(handguard18_r3, 396, 281, -1.001F, -0.001F, 12.0F, 1, 1, 1, 0.0F, false));
		handguard18_r3.cubeList.add(new ModelBox(handguard18_r3, 396, 283, -1.001F, -0.001F, 10.0F, 1, 1, 1, 0.0F, false));
		handguard18_r3.cubeList.add(new ModelBox(handguard18_r3, 284, 396, -1.001F, -0.001F, 8.0F, 1, 1, 1, 0.0F, false));
		handguard18_r3.cubeList.add(new ModelBox(handguard18_r3, 396, 285, -1.001F, -0.001F, 6.0F, 1, 1, 1, 0.0F, false));
		handguard18_r3.cubeList.add(new ModelBox(handguard18_r3, 396, 287, -1.001F, -0.001F, 4.0F, 1, 1, 1, 0.0F, false));
		handguard18_r3.cubeList.add(new ModelBox(handguard18_r3, 288, 396, -1.001F, -0.001F, 2.0F, 1, 1, 1, 0.0F, false));
		handguard18_r3.cubeList.add(new ModelBox(handguard18_r3, 300, 396, -1.001F, -0.001F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard17_r1 = new ModelRenderer(this);
		handguard17_r1.setRotationPoint(-1.4F, -3.6F, 1.0F);
		handguard.addChild(handguard17_r1);
		setRotationAngle(handguard17_r1, 0.014F, -0.0087F, 0.5236F);
		handguard17_r1.cubeList.add(new ModelBox(handguard17_r1, 304, 396, 0.001F, -0.001F, 18.0F, 1, 1, 1, 0.0F, false));
		handguard17_r1.cubeList.add(new ModelBox(handguard17_r1, 308, 396, 0.001F, -0.001F, 16.0F, 1, 1, 1, 0.0F, false));
		handguard17_r1.cubeList.add(new ModelBox(handguard17_r1, 312, 396, 0.001F, -0.001F, 14.0F, 1, 1, 1, 0.0F, false));
		handguard17_r1.cubeList.add(new ModelBox(handguard17_r1, 396, 320, 0.001F, -0.001F, 12.0F, 1, 1, 1, 0.0F, false));
		handguard17_r1.cubeList.add(new ModelBox(handguard17_r1, 396, 322, 0.001F, -0.001F, 10.0F, 1, 1, 1, 0.0F, false));
		handguard17_r1.cubeList.add(new ModelBox(handguard17_r1, 396, 324, 0.001F, -0.001F, 8.0F, 1, 1, 1, 0.0F, false));
		handguard17_r1.cubeList.add(new ModelBox(handguard17_r1, 396, 326, 0.001F, -0.001F, 6.0F, 1, 1, 1, 0.0F, false));
		handguard17_r1.cubeList.add(new ModelBox(handguard17_r1, 328, 396, 0.001F, -0.001F, 4.0F, 1, 1, 1, 0.0F, false));
		handguard17_r1.cubeList.add(new ModelBox(handguard17_r1, 396, 328, 0.001F, -0.001F, 2.0F, 1, 1, 1, 0.0F, false));
		handguard17_r1.cubeList.add(new ModelBox(handguard17_r1, 396, 330, 0.001F, -0.001F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard7_r1 = new ModelRenderer(this);
		handguard7_r1.setRotationPoint(-1.4F, -3.5F, 0.0F);
		handguard.addChild(handguard7_r1);
		setRotationAngle(handguard7_r1, 0.014F, -0.0087F, 0.5236F);
		handguard7_r1.cubeList.add(new ModelBox(handguard7_r1, 332, 396, 0.001F, -0.001F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard7_r2 = new ModelRenderer(this);
		handguard7_r2.setRotationPoint(-3.4F, -3.5F, 0.0F);
		handguard.addChild(handguard7_r2);
		setRotationAngle(handguard7_r2, 0.0157F, 0.0087F, -0.5236F);
		handguard7_r2.cubeList.add(new ModelBox(handguard7_r2, 328, 269, -1.0F, 0.0F, 0.5F, 1, 1, 20, 0.0F, false));

		handguard8_r5 = new ModelRenderer(this);
		handguard8_r5.setRotationPoint(-3.4F, 1.5F, 0.0F);
		handguard.addChild(handguard8_r5);
		setRotationAngle(handguard8_r5, -0.0157F, 0.0087F, 0.5236F);
		handguard8_r5.cubeList.add(new ModelBox(handguard8_r5, 0, 330, -1.0F, -1.0F, 0.5F, 1, 1, 20, 0.0F, false));

		handguard7_r3 = new ModelRenderer(this);
		handguard7_r3.setRotationPoint(-1.4F, 1.5F, 0.0F);
		handguard.addChild(handguard7_r3);
		setRotationAngle(handguard7_r3, -0.0157F, -0.0087F, -0.5236F);
		handguard7_r3.cubeList.add(new ModelBox(handguard7_r3, 338, 141, 0.0F, -1.0F, 0.5F, 1, 1, 20, 0.0F, false));

		handguard6_r1 = new ModelRenderer(this);
		handguard6_r1.setRotationPoint(-1.4F, -3.5F, 0.0F);
		handguard.addChild(handguard6_r1);
		setRotationAngle(handguard6_r1, 0.0157F, -0.0087F, 0.5236F);
		handguard6_r1.cubeList.add(new ModelBox(handguard6_r1, 340, 110, 0.0F, 0.0F, 0.5F, 1, 1, 20, 0.0F, false));

		handguard7_r4 = new ModelRenderer(this);
		handguard7_r4.setRotationPoint(0.0F, -2.0F, 0.0F);
		handguard.addChild(handguard7_r4);
		setRotationAngle(handguard7_r4, 0.0F, 0.0175F, 0.0F);
		handguard7_r4.cubeList.add(new ModelBox(handguard7_r4, 180, 321, -1.0F, 0.0F, 0.5F, 1, 2, 20, 0.0F, false));
		handguard7_r4.cubeList.add(new ModelBox(handguard7_r4, 170, 347, -1.001F, -0.001F, 0.0F, 1, 2, 1, 0.0F, false));

		handguard8_r6 = new ModelRenderer(this);
		handguard8_r6.setRotationPoint(-4.8F, -2.0F, 0.0F);
		handguard.addChild(handguard8_r6);
		setRotationAngle(handguard8_r6, 0.0F, -0.0175F, 0.0F);
		handguard8_r6.cubeList.add(new ModelBox(handguard8_r6, 222, 321, -0.001F, 0.0F, 0.5F, 1, 2, 20, 0.0F, false));
		handguard8_r6.cubeList.add(new ModelBox(handguard8_r6, 348, 234, 0.0F, -0.001F, 0.0F, 1, 2, 1, 0.0F, false));

		handguard11_r2 = new ModelRenderer(this);
		handguard11_r2.setRotationPoint(-4.8F, -2.0F, 0.0F);
		handguard.addChild(handguard11_r2);
		setRotationAngle(handguard11_r2, 0.0044F, -0.0157F, 0.4712F);
		handguard11_r2.cubeList.add(new ModelBox(handguard11_r2, 264, 342, 0.0F, -1.1F, 0.5F, 1, 1, 20, 0.0F, false));
		handguard11_r2.cubeList.add(new ModelBox(handguard11_r2, 396, 332, -0.001F, -1.1F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard12_r1 = new ModelRenderer(this);
		handguard12_r1.setRotationPoint(-4.8F, 0.0F, 0.0F);
		handguard.addChild(handguard12_r1);
		setRotationAngle(handguard12_r1, -0.0044F, -0.0157F, -0.4712F);
		handguard12_r1.cubeList.add(new ModelBox(handguard12_r1, 306, 342, 0.0F, 0.1F, 0.5F, 1, 1, 20, 0.0F, false));
		handguard12_r1.cubeList.add(new ModelBox(handguard12_r1, 396, 334, -0.001F, 0.1F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard11_r3 = new ModelRenderer(this);
		handguard11_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		handguard.addChild(handguard11_r3);
		setRotationAngle(handguard11_r3, -0.0044F, 0.0157F, 0.4712F);
		handguard11_r3.cubeList.add(new ModelBox(handguard11_r3, 174, 343, -1.0F, 0.1F, 0.5F, 1, 1, 20, 0.0F, false));
		handguard11_r3.cubeList.add(new ModelBox(handguard11_r3, 396, 336, -0.999F, 0.1F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard22_r1 = new ModelRenderer(this);
		handguard22_r1.setRotationPoint(-4.9F, 0.0F, 0.0F);
		handguard.addChild(handguard22_r1);
		setRotationAngle(handguard22_r1, -0.0044F, -0.0157F, -0.4712F);
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 396, 338, 0.0F, 0.15F, 19.0F, 1, 1, 1, 0.0F, false));
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 340, 396, 0.0F, 0.15F, 17.0F, 1, 1, 1, 0.0F, false));
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 396, 340, 0.0F, 0.15F, 15.0F, 1, 1, 1, 0.0F, false));
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 396, 342, 0.0F, 0.15F, 13.0F, 1, 1, 1, 0.0F, false));
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 344, 396, 0.0F, 0.15F, 11.0F, 1, 1, 1, 0.0F, false));
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 396, 344, 0.0F, 0.15F, 9.0F, 1, 1, 1, 0.0F, false));
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 396, 346, 0.0F, 0.15F, 7.0F, 1, 1, 1, 0.0F, false));
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 348, 396, 0.0F, 0.15F, 5.0F, 1, 1, 1, 0.0F, false));
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 396, 348, 0.0F, 0.15F, 3.0F, 1, 1, 1, 0.0F, false));
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 396, 350, 0.0F, 0.15F, 1.0F, 1, 1, 1, 0.0F, false));

		handguard21_r1 = new ModelRenderer(this);
		handguard21_r1.setRotationPoint(0.1F, 0.0F, 0.0F);
		handguard.addChild(handguard21_r1);
		setRotationAngle(handguard21_r1, -0.0044F, 0.0157F, 0.4712F);
		handguard21_r1.cubeList.add(new ModelBox(handguard21_r1, 352, 396, -1.0F, 0.15F, 19.0F, 1, 1, 1, 0.0F, false));
		handguard21_r1.cubeList.add(new ModelBox(handguard21_r1, 396, 352, -1.0F, 0.15F, 17.0F, 1, 1, 1, 0.0F, false));
		handguard21_r1.cubeList.add(new ModelBox(handguard21_r1, 396, 354, -1.0F, 0.15F, 15.0F, 1, 1, 1, 0.0F, false));
		handguard21_r1.cubeList.add(new ModelBox(handguard21_r1, 356, 396, -1.0F, 0.15F, 13.0F, 1, 1, 1, 0.0F, false));
		handguard21_r1.cubeList.add(new ModelBox(handguard21_r1, 396, 356, -1.0F, 0.15F, 11.0F, 1, 1, 1, 0.0F, false));
		handguard21_r1.cubeList.add(new ModelBox(handguard21_r1, 396, 358, -1.0F, 0.15F, 9.0F, 1, 1, 1, 0.0F, false));
		handguard21_r1.cubeList.add(new ModelBox(handguard21_r1, 360, 396, -1.0F, 0.15F, 7.0F, 1, 1, 1, 0.0F, false));
		handguard21_r1.cubeList.add(new ModelBox(handguard21_r1, 396, 360, -1.0F, 0.15F, 5.0F, 1, 1, 1, 0.0F, false));
		handguard21_r1.cubeList.add(new ModelBox(handguard21_r1, 364, 396, -1.0F, 0.15F, 3.0F, 1, 1, 1, 0.0F, false));
		handguard21_r1.cubeList.add(new ModelBox(handguard21_r1, 368, 396, -1.0F, 0.15F, 1.0F, 1, 1, 1, 0.0F, false));

		handguard21_r2 = new ModelRenderer(this);
		handguard21_r2.setRotationPoint(-4.9F, -2.0F, 0.0F);
		handguard.addChild(handguard21_r2);
		setRotationAngle(handguard21_r2, 0.0044F, -0.0157F, 0.4712F);
		handguard21_r2.cubeList.add(new ModelBox(handguard21_r2, 372, 396, 0.0F, -1.15F, 19.0F, 1, 1, 1, 0.0F, false));
		handguard21_r2.cubeList.add(new ModelBox(handguard21_r2, 396, 380, 0.0F, -1.15F, 17.0F, 1, 1, 1, 0.0F, false));
		handguard21_r2.cubeList.add(new ModelBox(handguard21_r2, 396, 382, 0.0F, -1.15F, 15.0F, 1, 1, 1, 0.0F, false));
		handguard21_r2.cubeList.add(new ModelBox(handguard21_r2, 396, 384, 0.0F, -1.15F, 13.0F, 1, 1, 1, 0.0F, false));
		handguard21_r2.cubeList.add(new ModelBox(handguard21_r2, 396, 386, 0.0F, -1.15F, 11.0F, 1, 1, 1, 0.0F, false));
		handguard21_r2.cubeList.add(new ModelBox(handguard21_r2, 396, 390, 0.0F, -1.15F, 9.0F, 1, 1, 1, 0.0F, false));
		handguard21_r2.cubeList.add(new ModelBox(handguard21_r2, 396, 395, 0.0F, -1.15F, 7.0F, 1, 1, 1, 0.0F, false));
		handguard21_r2.cubeList.add(new ModelBox(handguard21_r2, 0, 397, 0.0F, -1.15F, 5.0F, 1, 1, 1, 0.0F, false));
		handguard21_r2.cubeList.add(new ModelBox(handguard21_r2, 4, 397, 0.0F, -1.15F, 3.0F, 1, 1, 1, 0.0F, false));
		handguard21_r2.cubeList.add(new ModelBox(handguard21_r2, 8, 397, 0.0F, -1.15F, 1.0F, 1, 1, 1, 0.0F, false));

		handguard20_r2 = new ModelRenderer(this);
		handguard20_r2.setRotationPoint(0.1F, -2.0F, 0.0F);
		handguard.addChild(handguard20_r2);
		setRotationAngle(handguard20_r2, 0.0044F, 0.0157F, -0.4712F);
		handguard20_r2.cubeList.add(new ModelBox(handguard20_r2, 12, 397, -1.0F, -1.15F, 19.0F, 1, 1, 1, 0.0F, false));
		handguard20_r2.cubeList.add(new ModelBox(handguard20_r2, 16, 397, -1.0F, -1.15F, 17.0F, 1, 1, 1, 0.0F, false));
		handguard20_r2.cubeList.add(new ModelBox(handguard20_r2, 20, 397, -1.0F, -1.15F, 15.0F, 1, 1, 1, 0.0F, false));
		handguard20_r2.cubeList.add(new ModelBox(handguard20_r2, 24, 397, -1.0F, -1.15F, 13.0F, 1, 1, 1, 0.0F, false));
		handguard20_r2.cubeList.add(new ModelBox(handguard20_r2, 28, 397, -1.0F, -1.15F, 11.0F, 1, 1, 1, 0.0F, false));
		handguard20_r2.cubeList.add(new ModelBox(handguard20_r2, 32, 397, -1.0F, -1.15F, 9.0F, 1, 1, 1, 0.0F, false));
		handguard20_r2.cubeList.add(new ModelBox(handguard20_r2, 60, 397, -1.0F, -1.15F, 7.0F, 1, 1, 1, 0.0F, false));
		handguard20_r2.cubeList.add(new ModelBox(handguard20_r2, 64, 397, -1.0F, -1.15F, 5.0F, 1, 1, 1, 0.0F, false));
		handguard20_r2.cubeList.add(new ModelBox(handguard20_r2, 68, 397, -1.0F, -1.15F, 3.0F, 1, 1, 1, 0.0F, false));
		handguard20_r2.cubeList.add(new ModelBox(handguard20_r2, 72, 397, -1.0F, -1.15F, 1.0F, 1, 1, 1, 0.0F, false));

		handguard10_r4 = new ModelRenderer(this);
		handguard10_r4.setRotationPoint(0.0F, -2.0F, 0.0F);
		handguard.addChild(handguard10_r4);
		setRotationAngle(handguard10_r4, 0.0044F, 0.0157F, -0.4712F);
		handguard10_r4.cubeList.add(new ModelBox(handguard10_r4, 216, 343, -1.0F, -1.1F, 0.5F, 1, 1, 20, 0.0F, false));
		handguard10_r4.cubeList.add(new ModelBox(handguard10_r4, 76, 397, -0.999F, -1.1F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard9_r6 = new ModelRenderer(this);
		handguard9_r6.setRotationPoint(-4.8F, -2.0F, 0.0F);
		handguard.addChild(handguard9_r6);
		setRotationAngle(handguard9_r6, -0.0079F, -0.0157F, 0.4712F);
		handguard9_r6.cubeList.add(new ModelBox(handguard9_r6, 80, 397, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		handguard9_r6.cubeList.add(new ModelBox(handguard9_r6, 128, 344, 0.001F, -1.001F, 0.5F, 1, 1, 20, 0.0F, false));

		handguard10_r5 = new ModelRenderer(this);
		handguard10_r5.setRotationPoint(-4.8F, 0.0F, 0.0F);
		handguard.addChild(handguard10_r5);
		setRotationAngle(handguard10_r5, 0.0079F, -0.0157F, -0.4712F);
		handguard10_r5.cubeList.add(new ModelBox(handguard10_r5, 84, 397, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		handguard10_r5.cubeList.add(new ModelBox(handguard10_r5, 42, 347, 0.001F, 0.001F, 0.5F, 1, 1, 20, 0.0F, false));

		handguard9_r7 = new ModelRenderer(this);
		handguard9_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		handguard.addChild(handguard9_r7);
		setRotationAngle(handguard9_r7, 0.0079F, 0.0157F, 0.4712F);
		handguard9_r7.cubeList.add(new ModelBox(handguard9_r7, 88, 397, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		handguard9_r7.cubeList.add(new ModelBox(handguard9_r7, 84, 347, -1.001F, 0.001F, 0.5F, 1, 1, 20, 0.0F, false));

		handguard8_r7 = new ModelRenderer(this);
		handguard8_r7.setRotationPoint(0.0F, -2.0F, 0.0F);
		handguard.addChild(handguard8_r7);
		setRotationAngle(handguard8_r7, -0.0079F, 0.0157F, -0.4712F);
		handguard8_r7.cubeList.add(new ModelBox(handguard8_r7, 92, 397, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		handguard8_r7.cubeList.add(new ModelBox(handguard8_r7, 348, 320, -1.001F, -1.001F, 0.5F, 1, 1, 20, 0.0F, false));

		handguard19_r4 = new ModelRenderer(this);
		handguard19_r4.setRotationPoint(-4.9F, 0.0F, 0.0F);
		handguard.addChild(handguard19_r4);
		setRotationAngle(handguard19_r4, 0.0079F, -0.0157F, -0.4712F);
		handguard19_r4.cubeList.add(new ModelBox(handguard19_r4, 96, 397, 0.001F, 0.001F, 19.0F, 1, 1, 1, 0.0F, false));
		handguard19_r4.cubeList.add(new ModelBox(handguard19_r4, 100, 397, 0.001F, 0.001F, 17.0F, 1, 1, 1, 0.0F, false));
		handguard19_r4.cubeList.add(new ModelBox(handguard19_r4, 248, 397, 0.001F, 0.001F, 15.0F, 1, 1, 1, 0.0F, false));
		handguard19_r4.cubeList.add(new ModelBox(handguard19_r4, 252, 397, 0.001F, 0.001F, 13.0F, 1, 1, 1, 0.0F, false));
		handguard19_r4.cubeList.add(new ModelBox(handguard19_r4, 256, 397, 0.001F, 0.001F, 11.0F, 1, 1, 1, 0.0F, false));
		handguard19_r4.cubeList.add(new ModelBox(handguard19_r4, 260, 397, 0.001F, 0.001F, 9.0F, 1, 1, 1, 0.0F, false));
		handguard19_r4.cubeList.add(new ModelBox(handguard19_r4, 264, 397, 0.001F, 0.001F, 7.0F, 1, 1, 1, 0.0F, false));
		handguard19_r4.cubeList.add(new ModelBox(handguard19_r4, 292, 397, 0.001F, 0.001F, 5.0F, 1, 1, 1, 0.0F, false));
		handguard19_r4.cubeList.add(new ModelBox(handguard19_r4, 296, 397, 0.001F, 0.001F, 3.0F, 1, 1, 1, 0.0F, false));
		handguard19_r4.cubeList.add(new ModelBox(handguard19_r4, 316, 397, 0.001F, 0.001F, 1.0F, 1, 1, 1, 0.0F, false));

		handguard18_r4 = new ModelRenderer(this);
		handguard18_r4.setRotationPoint(0.1F, 0.0F, 0.0F);
		handguard.addChild(handguard18_r4);
		setRotationAngle(handguard18_r4, 0.0079F, 0.0157F, 0.4712F);
		handguard18_r4.cubeList.add(new ModelBox(handguard18_r4, 320, 397, -1.001F, 0.001F, 19.0F, 1, 1, 1, 0.0F, false));
		handguard18_r4.cubeList.add(new ModelBox(handguard18_r4, 324, 397, -1.001F, 0.001F, 17.0F, 1, 1, 1, 0.0F, false));
		handguard18_r4.cubeList.add(new ModelBox(handguard18_r4, 336, 397, -1.001F, 0.001F, 15.0F, 1, 1, 1, 0.0F, false));
		handguard18_r4.cubeList.add(new ModelBox(handguard18_r4, 376, 397, -1.001F, 0.001F, 13.0F, 1, 1, 1, 0.0F, false));
		handguard18_r4.cubeList.add(new ModelBox(handguard18_r4, 380, 397, -1.001F, 0.001F, 11.0F, 1, 1, 1, 0.0F, false));
		handguard18_r4.cubeList.add(new ModelBox(handguard18_r4, 384, 397, -1.001F, 0.001F, 9.0F, 1, 1, 1, 0.0F, false));
		handguard18_r4.cubeList.add(new ModelBox(handguard18_r4, 388, 397, -1.001F, 0.001F, 7.0F, 1, 1, 1, 0.0F, false));
		handguard18_r4.cubeList.add(new ModelBox(handguard18_r4, 392, 397, -1.001F, 0.001F, 5.0F, 1, 1, 1, 0.0F, false));
		handguard18_r4.cubeList.add(new ModelBox(handguard18_r4, 396, 397, -1.001F, 0.001F, 3.0F, 1, 1, 1, 0.0F, false));
		handguard18_r4.cubeList.add(new ModelBox(handguard18_r4, 398, 20, -1.001F, 0.001F, 1.0F, 1, 1, 1, 0.0F, false));

		handguard18_r5 = new ModelRenderer(this);
		handguard18_r5.setRotationPoint(-4.9F, -2.0F, 0.0F);
		handguard.addChild(handguard18_r5);
		setRotationAngle(handguard18_r5, -0.0079F, -0.0157F, 0.4712F);
		handguard18_r5.cubeList.add(new ModelBox(handguard18_r5, 398, 22, 0.001F, -1.001F, 19.0F, 1, 1, 1, 0.0F, false));
		handguard18_r5.cubeList.add(new ModelBox(handguard18_r5, 398, 24, 0.001F, -1.001F, 17.0F, 1, 1, 1, 0.0F, false));
		handguard18_r5.cubeList.add(new ModelBox(handguard18_r5, 398, 26, 0.001F, -1.001F, 15.0F, 1, 1, 1, 0.0F, false));
		handguard18_r5.cubeList.add(new ModelBox(handguard18_r5, 398, 28, 0.001F, -1.001F, 13.0F, 1, 1, 1, 0.0F, false));
		handguard18_r5.cubeList.add(new ModelBox(handguard18_r5, 398, 30, 0.001F, -1.001F, 11.0F, 1, 1, 1, 0.0F, false));
		handguard18_r5.cubeList.add(new ModelBox(handguard18_r5, 398, 32, 0.001F, -1.001F, 9.0F, 1, 1, 1, 0.0F, false));
		handguard18_r5.cubeList.add(new ModelBox(handguard18_r5, 398, 34, 0.001F, -1.001F, 7.0F, 1, 1, 1, 0.0F, false));
		handguard18_r5.cubeList.add(new ModelBox(handguard18_r5, 36, 398, 0.001F, -1.001F, 5.0F, 1, 1, 1, 0.0F, false));
		handguard18_r5.cubeList.add(new ModelBox(handguard18_r5, 398, 36, 0.001F, -1.001F, 3.0F, 1, 1, 1, 0.0F, false));
		handguard18_r5.cubeList.add(new ModelBox(handguard18_r5, 398, 38, 0.001F, -1.001F, 1.0F, 1, 1, 1, 0.0F, false));

		handguard17_r2 = new ModelRenderer(this);
		handguard17_r2.setRotationPoint(0.1F, -2.0F, 0.0F);
		handguard.addChild(handguard17_r2);
		setRotationAngle(handguard17_r2, -0.0079F, 0.0157F, -0.4712F);
		handguard17_r2.cubeList.add(new ModelBox(handguard17_r2, 40, 398, -1.001F, -1.001F, 19.0F, 1, 1, 1, 0.0F, false));
		handguard17_r2.cubeList.add(new ModelBox(handguard17_r2, 398, 40, -1.001F, -1.001F, 17.0F, 1, 1, 1, 0.0F, false));
		handguard17_r2.cubeList.add(new ModelBox(handguard17_r2, 398, 42, -1.001F, -1.001F, 15.0F, 1, 1, 1, 0.0F, false));
		handguard17_r2.cubeList.add(new ModelBox(handguard17_r2, 44, 398, -1.001F, -1.001F, 13.0F, 1, 1, 1, 0.0F, false));
		handguard17_r2.cubeList.add(new ModelBox(handguard17_r2, 398, 44, -1.001F, -1.001F, 11.0F, 1, 1, 1, 0.0F, false));
		handguard17_r2.cubeList.add(new ModelBox(handguard17_r2, 398, 46, -1.001F, -1.001F, 9.0F, 1, 1, 1, 0.0F, false));
		handguard17_r2.cubeList.add(new ModelBox(handguard17_r2, 48, 398, -1.001F, -1.001F, 7.0F, 1, 1, 1, 0.0F, false));
		handguard17_r2.cubeList.add(new ModelBox(handguard17_r2, 398, 48, -1.001F, -1.001F, 5.0F, 1, 1, 1, 0.0F, false));
		handguard17_r2.cubeList.add(new ModelBox(handguard17_r2, 398, 50, -1.001F, -1.001F, 3.0F, 1, 1, 1, 0.0F, false));
		handguard17_r2.cubeList.add(new ModelBox(handguard17_r2, 52, 398, -1.001F, -1.001F, 1.0F, 1, 1, 1, 0.0F, false));

		handguard5_r1 = new ModelRenderer(this);
		handguard5_r1.setRotationPoint(0.1F, -1.5F, 0.0F);
		handguard.addChild(handguard5_r1);
		setRotationAngle(handguard5_r1, 0.0F, 0.0175F, 0.0F);
		handguard5_r1.cubeList.add(new ModelBox(handguard5_r1, 398, 52, -1.001F, -0.001F, 0.0F, 1, 1, 1, 0.0F, false));
		handguard5_r1.cubeList.add(new ModelBox(handguard5_r1, 348, 237, -1.001F, -0.5F, 19.0F, 1, 2, 1, 0.0F, false));
		handguard5_r1.cubeList.add(new ModelBox(handguard5_r1, 348, 240, -1.001F, -0.5F, 17.0F, 1, 2, 1, 0.0F, false));
		handguard5_r1.cubeList.add(new ModelBox(handguard5_r1, 348, 243, -1.001F, -0.5F, 15.0F, 1, 2, 1, 0.0F, false));
		handguard5_r1.cubeList.add(new ModelBox(handguard5_r1, 170, 350, -1.001F, -0.5F, 13.0F, 1, 2, 1, 0.0F, false));
		handguard5_r1.cubeList.add(new ModelBox(handguard5_r1, 170, 353, -1.001F, -0.5F, 11.0F, 1, 2, 1, 0.0F, false));
		handguard5_r1.cubeList.add(new ModelBox(handguard5_r1, 170, 356, -1.001F, -0.5F, 9.0F, 1, 2, 1, 0.0F, false));
		handguard5_r1.cubeList.add(new ModelBox(handguard5_r1, 170, 359, -1.001F, -0.5F, 7.0F, 1, 2, 1, 0.0F, false));
		handguard5_r1.cubeList.add(new ModelBox(handguard5_r1, 360, 290, -1.001F, -0.5F, 5.0F, 1, 2, 1, 0.0F, false));
		handguard5_r1.cubeList.add(new ModelBox(handguard5_r1, 360, 293, -1.001F, -0.5F, 3.0F, 1, 2, 1, 0.0F, false));
		handguard5_r1.cubeList.add(new ModelBox(handguard5_r1, 360, 296, -1.001F, -0.5F, 1.0F, 1, 2, 1, 0.0F, false));
		handguard5_r1.cubeList.add(new ModelBox(handguard5_r1, 348, 341, -1.0F, 0.0F, 0.5F, 1, 1, 20, 0.0F, false));

		handguard4_r1 = new ModelRenderer(this);
		handguard4_r1.setRotationPoint(-4.9F, -1.5F, 0.0F);
		handguard.addChild(handguard4_r1);
		setRotationAngle(handguard4_r1, 0.0F, -0.0175F, 0.0F);
		handguard4_r1.cubeList.add(new ModelBox(handguard4_r1, 298, 386, -0.001F, -0.001F, 0.0F, 1, 1, 1, 0.0F, false));
		handguard4_r1.cubeList.add(new ModelBox(handguard4_r1, 0, 351, 0.0F, 0.0F, 0.5F, 1, 1, 20, 0.0F, false));

		handguard15_r1 = new ModelRenderer(this);
		handguard15_r1.setRotationPoint(-1.9F, -1.5F, 0.0F);
		handguard.addChild(handguard15_r1);
		setRotationAngle(handguard15_r1, 0.0F, -0.0175F, 0.0F);
		handguard15_r1.cubeList.add(new ModelBox(handguard15_r1, 330, 376, -2.999F, -0.5F, 19.0F, 1, 2, 1, 0.0F, false));
		handguard15_r1.cubeList.add(new ModelBox(handguard15_r1, 218, 377, -2.999F, -0.5F, 17.0F, 1, 2, 1, 0.0F, false));
		handguard15_r1.cubeList.add(new ModelBox(handguard15_r1, 144, 378, -2.999F, -0.5F, 15.0F, 1, 2, 1, 0.0F, false));
		handguard15_r1.cubeList.add(new ModelBox(handguard15_r1, 278, 379, -2.999F, -0.5F, 13.0F, 1, 2, 1, 0.0F, false));
		handguard15_r1.cubeList.add(new ModelBox(handguard15_r1, 38, 382, -2.999F, -0.5F, 11.0F, 1, 2, 1, 0.0F, false));
		handguard15_r1.cubeList.add(new ModelBox(handguard15_r1, 140, 383, -2.999F, -0.5F, 9.0F, 1, 2, 1, 0.0F, false));
		handguard15_r1.cubeList.add(new ModelBox(handguard15_r1, 338, 390, -2.999F, -0.5F, 7.0F, 1, 2, 1, 0.0F, false));
		handguard15_r1.cubeList.add(new ModelBox(handguard15_r1, 300, 391, -2.999F, -0.5F, 5.0F, 1, 2, 1, 0.0F, false));
		handguard15_r1.cubeList.add(new ModelBox(handguard15_r1, 328, 391, -2.999F, -0.5F, 3.0F, 1, 2, 1, 0.0F, false));
		handguard15_r1.cubeList.add(new ModelBox(handguard15_r1, 392, 79, -2.999F, -0.5F, 1.0F, 1, 2, 1, 0.0F, false));
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