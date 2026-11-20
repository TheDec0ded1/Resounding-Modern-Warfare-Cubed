package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class GM6_LynxAction extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer action_r1;
	private final ModelRenderer action10_r1;
	private final ModelRenderer action2_r1;
	private final ModelRenderer action14_r1;
	private final ModelRenderer barrel;
	private final ModelRenderer gun_r1;
	private final ModelRenderer gun_r2;
	private final ModelRenderer gun_r3;
	private final ModelRenderer gun_r4;
	private final ModelRenderer gun_r5;
	private final ModelRenderer gun_r6;
	private final ModelRenderer gun_r7;
	private final ModelRenderer gun_r8;
	private final ModelRenderer gun198_r1;
	private final ModelRenderer gun198_r2;
	private final ModelRenderer gun178_r1;
	private final ModelRenderer gun178_r2;
	private final ModelRenderer gun177_r1;
	private final ModelRenderer gun177_r2;

	public GM6_LynxAction() {
		textureWidth = 410;
		textureHeight = 410;

		action = new ModelRenderer(this);
		action.setRotationPoint(0.0F, 24.0F, 0.0F);
		action.cubeList.add(new ModelBox(action, 12, 169, -3.3F, -39.0F, -33.1F, 1, 1, 20, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 30, 31, -6.3F, -40.0F, -32.8F, 3, 1, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 30, 31, -10.3F, -40.0F, -32.8F, 4, 1, 1, 0.1F, false));
		action.cubeList.add(new ModelBox(action, 29, 30, -10.4F, -40.5F, -33.3F, 1, 2, 2, -0.2F, false));
		action.cubeList.add(new ModelBox(action, 29, 30, -7.0F, -40.5F, -33.3F, 1, 2, 2, -0.2F, false));
		action.cubeList.add(new ModelBox(action, 29, 30, -10.8F, -40.5F, -33.3F, 1, 1, 2, -0.2F, false));
		action.cubeList.add(new ModelBox(action, 30, 31, -10.8F, -40.5F, -33.3F, 1, 2, 1, -0.2F, false));
		action.cubeList.add(new ModelBox(action, 29, 30, -10.8F, -39.5F, -33.3F, 1, 1, 2, -0.2F, false));
		action.cubeList.add(new ModelBox(action, 30, 31, -10.8F, -40.5F, -32.3F, 1, 2, 1, -0.2F, false));

		action_r1 = new ModelRenderer(this);
		action_r1.setRotationPoint(-3.8F, -39.5F, -31.3F);
		action.addChild(action_r1);
		setRotationAngle(action_r1, 0.0F, -0.5236F, 0.0F);
		action_r1.cubeList.add(new ModelBox(action_r1, 30, 31, -0.5F, -0.5F, -1.3F, 1, 1, 1, 0.0F, false));

		action10_r1 = new ModelRenderer(this);
		action10_r1.setRotationPoint(-7.3F, -37.5F, -33.0F);
		action.addChild(action10_r1);
		setRotationAngle(action10_r1, 1.9333F, 0.0F, 0.0F);
		

		action2_r1 = new ModelRenderer(this);
		action2_r1.setRotationPoint(-4.8F, -38.5F, -33.0F);
		action.addChild(action2_r1);
		setRotationAngle(action2_r1, 0.0F, 0.0F, 1.5708F);
		action2_r1.cubeList.add(new ModelBox(action2_r1, 56, 56, -2.5F, -2.5F, -0.1F, 2, 1, 20, 0.0F, false));

		action14_r1 = new ModelRenderer(this);
		action14_r1.setRotationPoint(-9.3F, -39.0F, -33.55F);
		action.addChild(action14_r1);
		setRotationAngle(action14_r1, 1.9333F, 0.0F, 0.0F);
		

		barrel = new ModelRenderer(this);
		barrel.setRotationPoint(-2.0F, -41.1F, -128.0F);
		action.addChild(barrel);
		barrel.cubeList.add(new ModelBox(barrel, 30, 25, 0.0F, 0.0F, 24.0F, 1, 3, 3, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 84, 9, -1.0F, 1.0F, 23.9F, 3, 1, 3, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 140, 58, -1.0F, 1.0F, 26.9F, 1, 1, 23, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 140, 17, 1.0F, 1.0F, 26.9F, 1, 1, 23, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 110, 133, 0.0F, 0.0F, 27.0F, 1, 1, 23, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 17, 133, 0.0F, 2.0F, 27.0F, 1, 1, 23, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 145, 63, -0.8485F, 4.8485F, 78.0F, 1, 1, 18, -0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 145, 22, 0.8485F, 4.8485F, 78.0F, 1, 1, 18, -0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 115, 138, 0.0F, 4.0F, 78.0F, 1, 1, 18, -0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 115, 138, 0.0F, 4.8F, 78.1F, 1, 1, 18, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 22, 138, 0.0F, 5.6971F, 78.0F, 1, 1, 18, -0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 39, 155, 0.0F, -2.2029F, 49.0F, 1, 1, 1, -0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 132, 155, 0.0F, -3.9F, 49.0F, 1, 1, 1, -0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 162, 39, 0.8485F, -3.0515F, 49.0F, 1, 1, 1, -0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 162, 80, -0.8485F, -3.0515F, 49.0F, 1, 1, 1, -0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 132, 155, 0.0F, -3.1F, 49.1F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 3, 119, 0.0F, -2.5858F, 50.0F, 1, 1, 37, -0.2F, false));
		barrel.cubeList.add(new ModelBox(barrel, 96, 119, 0.0F, -4.0F, 50.0F, 1, 1, 37, -0.2F, false));
		barrel.cubeList.add(new ModelBox(barrel, 126, 3, 0.7071F, -3.2929F, 50.0F, 1, 1, 37, -0.2F, false));
		barrel.cubeList.add(new ModelBox(barrel, 126, 44, -0.7071F, -3.2929F, 50.0F, 1, 1, 37, -0.2F, false));
		barrel.cubeList.add(new ModelBox(barrel, 96, 119, 0.0F, -3.3F, 50.2F, 1, 1, 37, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 30, 25, 0.0F, 0.0F, 50.0F, 1, 3, 3, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 84, 9, -1.0F, 1.0F, 49.9F, 3, 1, 3, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 123, 41, -0.9F, 1.0F, 53.0F, 1, 1, 40, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 123, 0, 0.9F, 1.0F, 53.0F, 1, 1, 40, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 30, 34, -1.0F, 1.0F, 93.0F, 3, 1, 7, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 93, 116, 0.0F, 0.1F, 53.0F, 1, 1, 40, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 59, 25, 0.0F, 0.0F, 93.0F, 1, 3, 7, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 116, 0.0F, 1.9F, 53.0F, 1, 1, 40, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 71, 66, -0.2F, -0.3F, 17.0F, 1, 2, 1, 0.001F, false));
		barrel.cubeList.add(new ModelBox(barrel, 71, 61, 0.2F, 1.3F, 17.0F, 1, 2, 1, -0.001F, false));
		barrel.cubeList.add(new ModelBox(barrel, 38, 69, -2.0F, -0.3F, 18.0F, 5, 3, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 26, 16, -2.0F, 2.3F, 18.0F, 5, 1, 6, -0.002F, false));
		barrel.cubeList.add(new ModelBox(barrel, 59, 9, -2.0F, -0.3F, 19.0F, 5, 1, 5, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 20, 19, -2.0F, -0.3F, 23.5F, 1, 3, 1, -0.001F, false));
		barrel.cubeList.add(new ModelBox(barrel, 20, 15, 2.0F, -0.3F, 23.5F, 1, 3, 1, -0.001F, false));
		barrel.cubeList.add(new ModelBox(barrel, 71, 58, -0.2F, 1.3F, 17.0F, 1, 2, 1, 0.001F, false));
		barrel.cubeList.add(new ModelBox(barrel, 70, 44, 0.2F, -0.3F, 17.0F, 1, 2, 1, -0.001F, false));
		barrel.cubeList.add(new ModelBox(barrel, 101, 18, -2.0F, 2.3F, 23.5F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 100, 99, 2.0F, 2.3F, 23.5F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 70, 17, 2.0F, 0.7F, 21.6F, 1, 2, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 27, 68, -2.0F, 0.7F, 21.6F, 1, 2, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 70, 17, 2.0F, 0.7F, 19.7F, 1, 2, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 27, 68, -2.0F, 0.7F, 19.7F, 1, 2, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 52, 52, -0.5F, 0.5F, 16.8F, 2, 2, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 18, 43, -1.0F, -2.9F, 49.5F, 3, 5, 2, 0.002F, false));
		barrel.cubeList.add(new ModelBox(barrel, 18, 43, 0.0F, -3.9F, 49.5F, 1, 1, 2, 0.002F, false));
		barrel.cubeList.add(new ModelBox(barrel, 18, 43, 0.0F, 2.1F, 49.5F, 1, 1, 2, 0.002F, false));

		gun_r1 = new ModelRenderer(this);
		gun_r1.setRotationPoint(-1.7063F, 3.5162F, 50.5F);
		barrel.addChild(gun_r1);
		setRotationAngle(gun_r1, 0.0F, 0.0F, 0.7854F);
		gun_r1.cubeList.add(new ModelBox(gun_r1, 18, 43, -0.5F, -2.5F, -1.0F, 1, 1, 2, 0.002F, false));

		gun_r2 = new ModelRenderer(this);
		gun_r2.setRotationPoint(-1.7698F, 3.4527F, 50.5F);
		barrel.addChild(gun_r2);
		setRotationAngle(gun_r2, 0.0F, 0.0F, 0.7854F);
		gun_r2.cubeList.add(new ModelBox(gun_r2, 18, 43, 0.0F, -2.5F, -1.0F, 1, 1, 2, 0.002F, false));

		gun_r3 = new ModelRenderer(this);
		gun_r3.setRotationPoint(4.5375F, 5.9276F, 50.5F);
		barrel.addChild(gun_r3);
		setRotationAngle(gun_r3, 0.0F, 0.0F, 0.7854F);
		gun_r3.cubeList.add(new ModelBox(gun_r3, 18, 43, -5.5F, -0.5F, -1.0F, 1, 1, 2, 0.002F, false));

		gun_r4 = new ModelRenderer(this);
		gun_r4.setRotationPoint(4.474F, 5.284F, 50.5F);
		barrel.addChild(gun_r4);
		setRotationAngle(gun_r4, 0.0F, 0.0F, 0.7854F);
		gun_r4.cubeList.add(new ModelBox(gun_r4, 18, 43, -5.0F, -0.5F, -1.0F, 1, 1, 2, 0.002F, false));

		gun_r5 = new ModelRenderer(this);
		gun_r5.setRotationPoint(1.8293F, -0.7807F, 50.5F);
		barrel.addChild(gun_r5);
		setRotationAngle(gun_r5, 0.0F, 0.0F, 0.7854F);
		gun_r5.cubeList.add(new ModelBox(gun_r5, 18, 43, -3.5F, -0.5F, -1.0F, 1, 1, 2, 0.002F, false));

		gun_r6 = new ModelRenderer(this);
		gun_r6.setRotationPoint(1.7658F, -1.4243F, 50.5F);
		barrel.addChild(gun_r6);
		setRotationAngle(gun_r6, 0.0F, 0.0F, 0.7854F);
		gun_r6.cubeList.add(new ModelBox(gun_r6, 18, 43, -3.0F, -0.5F, -1.0F, 1, 1, 2, 0.002F, false));

		gun_r7 = new ModelRenderer(this);
		gun_r7.setRotationPoint(0.9385F, -3.2556F, 50.5F);
		barrel.addChild(gun_r7);
		setRotationAngle(gun_r7, 0.0F, 0.0F, 0.7854F);
		gun_r7.cubeList.add(new ModelBox(gun_r7, 18, 43, 0.0F, -0.5F, -1.0F, 1, 1, 2, 0.002F, false));

		gun_r8 = new ModelRenderer(this);
		gun_r8.setRotationPoint(1.002F, -3.1921F, 50.5F);
		barrel.addChild(gun_r8);
		setRotationAngle(gun_r8, 0.0F, 0.0F, 0.7854F);
		gun_r8.cubeList.add(new ModelBox(gun_r8, 18, 43, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.002F, false));

		gun198_r1 = new ModelRenderer(this);
		gun198_r1.setRotationPoint(-2.0F, -0.3F, -6.0F);
		barrel.addChild(gun198_r1);
		setRotationAngle(gun198_r1, 0.0F, 2.082F, 0.0F);
		gun198_r1.cubeList.add(new ModelBox(gun198_r1, 26, 16, -21.9318F, 0.0F, -11.7415F, 1, 3, 2, -0.002F, false));
		gun198_r1.cubeList.add(new ModelBox(gun198_r1, 52, 55, -21.9318F, 2.6F, -11.7415F, 1, 1, 2, 0.0F, false));

		gun198_r2 = new ModelRenderer(this);
		gun198_r2.setRotationPoint(3.0F, -0.3F, -6.0F);
		barrel.addChild(gun198_r2);
		setRotationAngle(gun198_r2, 0.0F, -2.082F, 0.0F);
		gun198_r2.cubeList.add(new ModelBox(gun198_r2, 0, 56, 20.9318F, 2.6F, -11.7415F, 1, 1, 2, 0.0F, false));
		gun198_r2.cubeList.add(new ModelBox(gun198_r2, 30, 34, 20.9318F, 0.0F, -11.7415F, 1, 3, 2, -0.002F, false));

		gun178_r1 = new ModelRenderer(this);
		gun178_r1.setRotationPoint(1.0F, 3.0F, 0.0F);
		barrel.addChild(gun178_r1);
		setRotationAngle(gun178_r1, 0.0F, 0.0F, -0.7854F);
		gun178_r1.cubeList.add(new ModelBox(gun178_r1, 258, 272, 0.4F, -1.0F, 24.0F, 1, 1, 26, 0.0F, false));
		gun178_r1.cubeList.add(new ModelBox(gun178_r1, 206, 271, 0.0F, -1.0F, 24.0F, 1, 1, 26, 0.0F, false));
		gun178_r1.cubeList.add(new ModelBox(gun178_r1, 266, 280, -2.3142F, 1.5728F, 78.0F, 1, 1, 18, -0.1F, false));
		gun178_r1.cubeList.add(new ModelBox(gun178_r1, 214, 279, -2.7142F, 1.5728F, 78.0F, 1, 1, 18, -0.1F, false));
		gun178_r1.cubeList.add(new ModelBox(gun178_r1, 231, 296, 2.8719F, -4.0133F, 49.0F, 1, 1, 1, -0.1F, false));
		gun178_r1.cubeList.add(new ModelBox(gun178_r1, 283, 297, 3.2719F, -4.0133F, 49.0F, 1, 1, 1, -0.1F, false));
		gun178_r1.cubeList.add(new ModelBox(gun178_r1, 195, 260, 3.0426F, -4.3255F, 50.0F, 1, 1, 37, -0.2F, false));
		gun178_r1.cubeList.add(new ModelBox(gun178_r1, 247, 261, 3.4426F, -4.3255F, 50.0F, 1, 1, 37, -0.2F, false));
		gun178_r1.cubeList.add(new ModelBox(gun178_r1, 234, 248, 0.4F, -1.0F, 50.0F, 1, 1, 50, 0.0F, false));
		gun178_r1.cubeList.add(new ModelBox(gun178_r1, 182, 247, 0.0F, -1.0F, 50.0F, 1, 1, 50, 0.0F, false));

		gun178_r2 = new ModelRenderer(this);
		gun178_r2.setRotationPoint(0.0F, 3.0F, 0.0F);
		barrel.addChild(gun178_r2);
		setRotationAngle(gun178_r2, 0.0F, 0.0F, 0.7854F);
		gun178_r2.cubeList.add(new ModelBox(gun178_r2, 240, 24, -1.0F, -1.0F, 24.0F, 1, 1, 26, 0.0F, false));
		gun178_r2.cubeList.add(new ModelBox(gun178_r2, 24, 76, -1.4F, -1.0F, 24.0F, 1, 1, 26, 0.0F, false));
		gun178_r2.cubeList.add(new ModelBox(gun178_r2, 248, 32, 1.7142F, 1.5728F, 78.0F, 1, 1, 18, -0.1F, false));
		gun178_r2.cubeList.add(new ModelBox(gun178_r2, 32, 84, 1.3142F, 1.5728F, 78.0F, 1, 1, 18, -0.1F, false));
		gun178_r2.cubeList.add(new ModelBox(gun178_r2, 49, 101, -4.2719F, -4.0133F, 49.0F, 1, 1, 1, -0.1F, false));
		gun178_r2.cubeList.add(new ModelBox(gun178_r2, 265, 49, -3.8719F, -4.0133F, 49.0F, 1, 1, 1, -0.1F, false));
		gun178_r2.cubeList.add(new ModelBox(gun178_r2, 13, 65, -4.4426F, -4.3255F, 50.0F, 1, 1, 37, -0.2F, false));
		gun178_r2.cubeList.add(new ModelBox(gun178_r2, 229, 13, -4.0426F, -4.3255F, 50.0F, 1, 1, 37, -0.2F, false));
		gun178_r2.cubeList.add(new ModelBox(gun178_r2, 216, 0, -1.0F, -1.0F, 50.0F, 1, 1, 50, 0.0F, false));
		gun178_r2.cubeList.add(new ModelBox(gun178_r2, 0, 52, -1.4F, -1.0F, 50.0F, 1, 1, 50, 0.0F, false));

		gun177_r1 = new ModelRenderer(this);
		gun177_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrel.addChild(gun177_r1);
		setRotationAngle(gun177_r1, 0.0F, 0.0F, -0.7854F);
		gun177_r1.cubeList.add(new ModelBox(gun177_r1, 291, 126, -1.0F, 0.0F, 24.0F, 1, 1, 26, 0.0F, false));
		gun177_r1.cubeList.add(new ModelBox(gun177_r1, 291, 75, -1.4F, 0.0F, 24.0F, 1, 1, 26, 0.0F, false));
		gun177_r1.cubeList.add(new ModelBox(gun177_r1, 299, 134, -3.7284F, 2.8698F, 78.0F, 1, 1, 18, -0.1F, false));
		gun177_r1.cubeList.add(new ModelBox(gun177_r1, 299, 83, -4.1284F, 2.8698F, 78.0F, 1, 1, 18, -0.1F, false));
		gun177_r1.cubeList.add(new ModelBox(gun177_r1, 316, 100, 1.4577F, -2.7163F, 49.0F, 1, 1, 1, -0.1F, false));
		gun177_r1.cubeList.add(new ModelBox(gun177_r1, 316, 151, 1.8577F, -2.7163F, 49.0F, 1, 1, 1, -0.1F, false));
		gun177_r1.cubeList.add(new ModelBox(gun177_r1, 280, 64, 1.6284F, -2.7456F, 50.0F, 1, 1, 37, -0.2F, false));
		gun177_r1.cubeList.add(new ModelBox(gun177_r1, 280, 115, 2.0284F, -2.7456F, 50.0F, 1, 1, 37, -0.2F, false));
		gun177_r1.cubeList.add(new ModelBox(gun177_r1, 267, 102, -1.0F, 0.0F, 50.0F, 1, 1, 50, 0.0F, false));
		gun177_r1.cubeList.add(new ModelBox(gun177_r1, 267, 51, -1.4F, 0.0F, 50.0F, 1, 1, 50, 0.0F, false));

		gun177_r2 = new ModelRenderer(this);
		gun177_r2.setRotationPoint(1.0F, 0.0F, 0.0F);
		barrel.addChild(gun177_r2);
		setRotationAngle(gun177_r2, 0.0F, 0.0F, 0.7854F);
		gun177_r2.cubeList.add(new ModelBox(gun177_r2, 299, 192, 0.4F, 0.0F, 24.0F, 1, 1, 26, 0.0F, false));
		gun177_r2.cubeList.add(new ModelBox(gun177_r2, 186, 61, 0.0F, 0.0F, 24.0F, 1, 1, 26, 0.0F, false));
		gun177_r2.cubeList.add(new ModelBox(gun177_r2, 307, 200, 3.1284F, 2.8698F, 78.0F, 1, 1, 18, -0.1F, false));
		gun177_r2.cubeList.add(new ModelBox(gun177_r2, 194, 69, 2.7284F, 2.8698F, 78.0F, 1, 1, 18, -0.1F, false));
		gun177_r2.cubeList.add(new ModelBox(gun177_r2, 211, 86, -2.8577F, -2.7163F, 49.0F, 1, 1, 1, -0.1F, false));
		gun177_r2.cubeList.add(new ModelBox(gun177_r2, 324, 217, -2.4577F, -2.7163F, 49.0F, 1, 1, 1, -0.1F, false));
		gun177_r2.cubeList.add(new ModelBox(gun177_r2, 175, 50, -3.0284F, -2.7456F, 50.0F, 1, 1, 37, -0.2F, false));
		gun177_r2.cubeList.add(new ModelBox(gun177_r2, 288, 181, -2.6284F, -2.7456F, 50.0F, 1, 1, 37, -0.2F, false));
		gun177_r2.cubeList.add(new ModelBox(gun177_r2, 275, 168, 0.4F, 0.0F, 50.0F, 1, 1, 50, 0.0F, false));
		gun177_r2.cubeList.add(new ModelBox(gun177_r2, 132, 156, 0.0F, 0.0F, 50.0F, 1, 1, 50, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		action.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}