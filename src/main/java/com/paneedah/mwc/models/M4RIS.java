package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M4RIS extends ModelBase {
	private final ModelRenderer handguard_carbine;
	private final ModelRenderer handguard244_r1;
	private final ModelRenderer handguard243_r1;
	private final ModelRenderer handguard243_r2;
	private final ModelRenderer handguard242_r1;
	private final ModelRenderer handguard243_r3;
	private final ModelRenderer handguard242_r2;
	private final ModelRenderer handguard242_r3;
	private final ModelRenderer handguard241_r1;
	private final ModelRenderer handguard202_r1;
	private final ModelRenderer handguard204_r1;
	private final ModelRenderer handguard203_r1;
	private final ModelRenderer handguard202_r2;
	private final ModelRenderer handguard203_r2;
	private final ModelRenderer handguard204_r2;
	private final ModelRenderer handguard202_r3;
	private final ModelRenderer handguard205_r1;
	private final ModelRenderer handguard200_r1;
	private final ModelRenderer handguard204_r3;
	private final ModelRenderer handguard203_r3;
	private final ModelRenderer handguard206_r1;
	private final ModelRenderer handguard205_r2;
	private final ModelRenderer handguard201_r1;
	private final ModelRenderer handguard199_r1;
	private final ModelRenderer handguard201_r2;
	private final ModelRenderer handguard200_r2;
	private final ModelRenderer handguard201_r3;
	private final ModelRenderer handguard203_r4;
	private final ModelRenderer handguard202_r4;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer bone6;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer bone5;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;

	public M4RIS() {
		textureWidth = 416;
		textureHeight = 416;

		handguard_carbine = new ModelRenderer(this);
		handguard_carbine.setRotationPoint(0.0F, 23.5F, 0.0F);
		handguard_carbine.cubeList.add(new ModelBox(handguard_carbine, 48, 281, 0.1F, -38.5F, -46.0F, 1, 2, 21, 0.0F, false));
		handguard_carbine.cubeList.add(new ModelBox(handguard_carbine, 92, 281, -4.1F, -38.5F, -46.0F, 1, 2, 21, 0.0F, false));
		handguard_carbine.cubeList.add(new ModelBox(handguard_carbine, 272, 181, -2.5F, -40.1F, -46.0F, 2, 1, 21, 0.0F, false));
		handguard_carbine.cubeList.add(new ModelBox(handguard_carbine, 272, 203, -2.5F, -35.9F, -46.0F, 2, 1, 21, 0.0F, false));

		handguard244_r1 = new ModelRenderer(this);
		handguard244_r1.setRotationPoint(-4.1F, -37.0F, -28.0F);
		handguard_carbine.addChild(handguard244_r1);
		setRotationAngle(handguard244_r1, 0.0F, 0.0F, -0.4363F);
		handguard244_r1.cubeList.add(new ModelBox(handguard244_r1, 120, 385, -0.2548F, 0.6767F, 1.997F, 1, 1, 1, 0.0F, false));
		handguard244_r1.cubeList.add(new ModelBox(handguard244_r1, 264, 388, -0.2558F, 0.6767F, 0.499F, 1, 1, 2, 0.0F, false));
		handguard244_r1.cubeList.add(new ModelBox(handguard244_r1, 196, 392, -0.2558F, 0.6767F, -2.002F, 1, 1, 1, 0.0F, false));
		handguard244_r1.cubeList.add(new ModelBox(handguard244_r1, 200, 392, -0.2558F, 0.6767F, -7.002F, 1, 1, 1, 0.0F, false));
		handguard244_r1.cubeList.add(new ModelBox(handguard244_r1, 204, 392, -0.2558F, 0.6767F, -12.002F, 1, 1, 1, 0.0F, false));
		handguard244_r1.cubeList.add(new ModelBox(handguard244_r1, 336, 117, -0.2558F, 0.6767F, -4.502F, 1, 1, 1, 0.0F, false));
		handguard244_r1.cubeList.add(new ModelBox(handguard244_r1, 208, 392, -0.2558F, 0.6767F, -9.502F, 1, 1, 1, 0.0F, false));
		handguard244_r1.cubeList.add(new ModelBox(handguard244_r1, 212, 392, -0.2558F, 0.6767F, -14.502F, 1, 1, 1, 0.0F, false));
		handguard244_r1.cubeList.add(new ModelBox(handguard244_r1, 388, 265, -0.2558F, 0.6767F, -18.002F, 1, 1, 2, 0.0F, false));
		handguard244_r1.cubeList.add(new ModelBox(handguard244_r1, 310, 0, -0.2568F, -0.1033F, -18.001F, 1, 1, 21, 0.0F, false));

		handguard243_r1 = new ModelRenderer(this);
		handguard243_r1.setRotationPoint(1.1F, -37.0F, -28.0F);
		handguard_carbine.addChild(handguard243_r1);
		setRotationAngle(handguard243_r1, 0.0F, 0.0F, 0.4363F);
		handguard243_r1.cubeList.add(new ModelBox(handguard243_r1, 216, 392, -0.7452F, 0.6767F, 1.997F, 1, 1, 1, 0.0F, false));
		handguard243_r1.cubeList.add(new ModelBox(handguard243_r1, 388, 290, -0.7442F, 0.6767F, 0.499F, 1, 1, 2, 0.0F, false));
		handguard243_r1.cubeList.add(new ModelBox(handguard243_r1, 220, 392, -0.7442F, 0.6767F, -2.002F, 1, 1, 1, 0.0F, false));
		handguard243_r1.cubeList.add(new ModelBox(handguard243_r1, 224, 392, -0.7442F, 0.6767F, -7.002F, 1, 1, 1, 0.0F, false));
		handguard243_r1.cubeList.add(new ModelBox(handguard243_r1, 228, 392, -0.7442F, 0.6767F, -12.002F, 1, 1, 1, 0.0F, false));
		handguard243_r1.cubeList.add(new ModelBox(handguard243_r1, 170, 362, -0.7442F, 0.6767F, -4.502F, 1, 1, 1, 0.0F, false));
		handguard243_r1.cubeList.add(new ModelBox(handguard243_r1, 232, 392, -0.7442F, 0.6767F, -9.502F, 1, 1, 1, 0.0F, false));
		handguard243_r1.cubeList.add(new ModelBox(handguard243_r1, 392, 232, -0.7442F, 0.6767F, -14.502F, 1, 1, 1, 0.0F, false));
		handguard243_r1.cubeList.add(new ModelBox(handguard243_r1, 388, 293, -0.7442F, 0.6767F, -18.002F, 1, 1, 2, 0.0F, false));
		handguard243_r1.cubeList.add(new ModelBox(handguard243_r1, 310, 22, -0.7432F, -0.1033F, -18.001F, 1, 1, 21, 0.0F, false));

		handguard243_r2 = new ModelRenderer(this);
		handguard243_r2.setRotationPoint(-4.1F, -38.0F, -28.0F);
		handguard_carbine.addChild(handguard243_r2);
		setRotationAngle(handguard243_r2, 0.0F, 0.0F, 0.4363F);
		handguard243_r2.cubeList.add(new ModelBox(handguard243_r2, 252, 386, -0.2548F, -1.6767F, 1.997F, 1, 1, 1, 0.0F, false));
		handguard243_r2.cubeList.add(new ModelBox(handguard243_r2, 388, 296, -0.2558F, -1.6767F, 0.499F, 1, 1, 2, 0.0F, false));
		handguard243_r2.cubeList.add(new ModelBox(handguard243_r2, 236, 392, -0.2558F, -1.6767F, -2.002F, 1, 1, 1, 0.0F, false));
		handguard243_r2.cubeList.add(new ModelBox(handguard243_r2, 240, 392, -0.2558F, -1.6767F, -7.002F, 1, 1, 1, 0.0F, false));
		handguard243_r2.cubeList.add(new ModelBox(handguard243_r2, 244, 392, -0.2558F, -1.6767F, -12.002F, 1, 1, 1, 0.0F, false));
		handguard243_r2.cubeList.add(new ModelBox(handguard243_r2, 330, 379, -0.2558F, -1.6767F, -4.502F, 1, 1, 1, 0.0F, false));
		handguard243_r2.cubeList.add(new ModelBox(handguard243_r2, 268, 392, -0.2558F, -1.6767F, -9.502F, 1, 1, 1, 0.0F, false));
		handguard243_r2.cubeList.add(new ModelBox(handguard243_r2, 272, 392, -0.2558F, -1.6767F, -14.502F, 1, 1, 1, 0.0F, false));
		handguard243_r2.cubeList.add(new ModelBox(handguard243_r2, 298, 388, -0.2558F, -1.6767F, -18.002F, 1, 1, 2, 0.0F, false));
		handguard243_r2.cubeList.add(new ModelBox(handguard243_r2, 310, 44, -0.2568F, -0.8967F, -18.001F, 1, 1, 21, 0.0F, false));

		handguard242_r1 = new ModelRenderer(this);
		handguard242_r1.setRotationPoint(1.1F, -38.0F, -28.0F);
		handguard_carbine.addChild(handguard242_r1);
		setRotationAngle(handguard242_r1, 0.0F, 0.0F, -0.4363F);
		handguard242_r1.cubeList.add(new ModelBox(handguard242_r1, 392, 272, -0.7452F, -1.6767F, 1.997F, 1, 1, 1, 0.0F, false));
		handguard242_r1.cubeList.add(new ModelBox(handguard242_r1, 388, 299, -0.7442F, -1.6767F, 0.499F, 1, 1, 2, 0.0F, false));
		handguard242_r1.cubeList.add(new ModelBox(handguard242_r1, 392, 274, -0.7442F, -1.6767F, -2.002F, 1, 1, 1, 0.0F, false));
		handguard242_r1.cubeList.add(new ModelBox(handguard242_r1, 276, 392, -0.7442F, -1.6767F, -7.002F, 1, 1, 1, 0.0F, false));
		handguard242_r1.cubeList.add(new ModelBox(handguard242_r1, 392, 276, -0.7442F, -1.6767F, -12.002F, 1, 1, 1, 0.0F, false));
		handguard242_r1.cubeList.add(new ModelBox(handguard242_r1, 218, 380, -0.7442F, -1.6767F, -4.502F, 1, 1, 1, 0.0F, false));
		handguard242_r1.cubeList.add(new ModelBox(handguard242_r1, 392, 278, -0.7442F, -1.6767F, -9.502F, 1, 1, 1, 0.0F, false));
		handguard242_r1.cubeList.add(new ModelBox(handguard242_r1, 280, 392, -0.7442F, -1.6767F, -14.502F, 1, 1, 1, 0.0F, false));
		handguard242_r1.cubeList.add(new ModelBox(handguard242_r1, 388, 302, -0.7442F, -1.6767F, -18.002F, 1, 1, 2, 0.0F, false));
		handguard242_r1.cubeList.add(new ModelBox(handguard242_r1, 310, 66, -0.7432F, -0.8967F, -18.001F, 1, 1, 21, 0.0F, false));

		handguard243_r3 = new ModelRenderer(this);
		handguard243_r3.setRotationPoint(-2.0F, -34.9F, -28.0F);
		handguard_carbine.addChild(handguard243_r3);
		setRotationAngle(handguard243_r3, 0.0F, 0.0F, 0.4363F);
		handguard243_r3.cubeList.add(new ModelBox(handguard243_r3, 392, 280, -1.6768F, -0.7452F, 1.998F, 1, 1, 1, 0.0F, false));
		handguard243_r3.cubeList.add(new ModelBox(handguard243_r3, 388, 305, -1.6768F, -0.7442F, 0.5F, 1, 1, 2, 0.0F, false));
		handguard243_r3.cubeList.add(new ModelBox(handguard243_r3, 392, 282, -1.6768F, -0.7442F, -2.001F, 1, 1, 1, 0.0F, false));
		handguard243_r3.cubeList.add(new ModelBox(handguard243_r3, 284, 392, -1.6768F, -0.7442F, -7.001F, 1, 1, 1, 0.0F, false));
		handguard243_r3.cubeList.add(new ModelBox(handguard243_r3, 288, 392, -1.6768F, -0.7442F, -12.001F, 1, 1, 1, 0.0F, false));
		handguard243_r3.cubeList.add(new ModelBox(handguard243_r3, 398, 180, -1.6768F, -0.7442F, -4.501F, 1, 1, 1, 0.0F, false));
		handguard243_r3.cubeList.add(new ModelBox(handguard243_r3, 304, 392, -1.6768F, -0.7442F, -9.501F, 1, 1, 1, 0.0F, false));
		handguard243_r3.cubeList.add(new ModelBox(handguard243_r3, 308, 392, -1.6768F, -0.7442F, -14.501F, 1, 1, 1, 0.0F, false));
		handguard243_r3.cubeList.add(new ModelBox(handguard243_r3, 388, 308, -1.6768F, -0.7442F, -18.0F, 1, 1, 2, 0.0F, false));
		handguard243_r3.cubeList.add(new ModelBox(handguard243_r3, 310, 88, -0.8967F, -0.7432F, -18.001F, 1, 1, 21, 0.0F, false));

		handguard242_r2 = new ModelRenderer(this);
		handguard242_r2.setRotationPoint(-1.0F, -34.9F, -28.0F);
		handguard_carbine.addChild(handguard242_r2);
		setRotationAngle(handguard242_r2, 0.0F, 0.0F, -0.4363F);
		handguard242_r2.cubeList.add(new ModelBox(handguard242_r2, 312, 392, 0.6767F, -0.7452F, 1.998F, 1, 1, 1, 0.0F, false));
		handguard242_r2.cubeList.add(new ModelBox(handguard242_r2, 388, 311, 0.6767F, -0.7442F, 0.5F, 1, 1, 2, 0.0F, false));
		handguard242_r2.cubeList.add(new ModelBox(handguard242_r2, 332, 392, 0.6767F, -0.7442F, -2.001F, 1, 1, 1, 0.0F, false));
		handguard242_r2.cubeList.add(new ModelBox(handguard242_r2, 342, 392, 0.6767F, -0.7442F, -7.001F, 1, 1, 1, 0.0F, false));
		handguard242_r2.cubeList.add(new ModelBox(handguard242_r2, 346, 392, 0.6767F, -0.7442F, -12.001F, 1, 1, 1, 0.0F, false));
		handguard242_r2.cubeList.add(new ModelBox(handguard242_r2, 398, 182, 0.6767F, -0.7442F, -4.501F, 1, 1, 1, 0.0F, false));
		handguard242_r2.cubeList.add(new ModelBox(handguard242_r2, 350, 392, 0.6767F, -0.7442F, -9.501F, 1, 1, 1, 0.0F, false));
		handguard242_r2.cubeList.add(new ModelBox(handguard242_r2, 354, 392, 0.6767F, -0.7442F, -14.501F, 1, 1, 1, 0.0F, false));
		handguard242_r2.cubeList.add(new ModelBox(handguard242_r2, 388, 314, 0.6767F, -0.7442F, -18.0F, 1, 1, 2, 0.0F, false));
		handguard242_r2.cubeList.add(new ModelBox(handguard242_r2, 318, 168, -0.1033F, -0.7432F, -18.001F, 1, 1, 21, 0.0F, false));

		handguard242_r3 = new ModelRenderer(this);
		handguard242_r3.setRotationPoint(-2.0F, -40.1F, -28.0F);
		handguard_carbine.addChild(handguard242_r3);
		setRotationAngle(handguard242_r3, 0.0F, 0.0F, -0.4363F);
		handguard242_r3.cubeList.add(new ModelBox(handguard242_r3, 358, 392, -1.6768F, -0.2548F, 1.998F, 1, 1, 1, 0.0F, false));
		handguard242_r3.cubeList.add(new ModelBox(handguard242_r3, 388, 317, -1.6768F, -0.2558F, 0.5F, 1, 1, 2, 0.0F, false));
		handguard242_r3.cubeList.add(new ModelBox(handguard242_r3, 362, 392, -1.6768F, -0.2558F, -2.001F, 1, 1, 1, 0.0F, false));
		handguard242_r3.cubeList.add(new ModelBox(handguard242_r3, 366, 392, -1.6768F, -0.2558F, -7.001F, 1, 1, 1, 0.0F, false));
		handguard242_r3.cubeList.add(new ModelBox(handguard242_r3, 370, 392, -1.6768F, -0.2558F, -12.001F, 1, 1, 1, 0.0F, false));
		handguard242_r3.cubeList.add(new ModelBox(handguard242_r3, 184, 398, -1.6768F, -0.2558F, -4.501F, 1, 1, 1, 0.0F, false));
		handguard242_r3.cubeList.add(new ModelBox(handguard242_r3, 374, 392, -1.6768F, -0.2558F, -9.501F, 1, 1, 1, 0.0F, false));
		handguard242_r3.cubeList.add(new ModelBox(handguard242_r3, 392, 380, -1.6768F, -0.2558F, -14.501F, 1, 1, 1, 0.0F, false));
		handguard242_r3.cubeList.add(new ModelBox(handguard242_r3, 320, 388, -1.6768F, -0.2558F, -18.0F, 1, 1, 2, 0.0F, false));
		handguard242_r3.cubeList.add(new ModelBox(handguard242_r3, 318, 190, -0.8967F, -0.2568F, -18.001F, 1, 1, 21, 0.0F, false));

		handguard241_r1 = new ModelRenderer(this);
		handguard241_r1.setRotationPoint(-1.0F, -40.1F, -28.0F);
		handguard_carbine.addChild(handguard241_r1);
		setRotationAngle(handguard241_r1, 0.0F, 0.0F, 0.4363F);
		handguard241_r1.cubeList.add(new ModelBox(handguard241_r1, 392, 382, 0.6767F, -0.2548F, 1.998F, 1, 1, 1, 0.0F, false));
		handguard241_r1.cubeList.add(new ModelBox(handguard241_r1, 326, 388, 0.6767F, -0.2558F, 0.5F, 1, 1, 2, 0.0F, false));
		handguard241_r1.cubeList.add(new ModelBox(handguard241_r1, 392, 384, 0.6767F, -0.2558F, -2.001F, 1, 1, 1, 0.0F, false));
		handguard241_r1.cubeList.add(new ModelBox(handguard241_r1, 392, 386, 0.6767F, -0.2558F, -7.001F, 1, 1, 1, 0.0F, false));
		handguard241_r1.cubeList.add(new ModelBox(handguard241_r1, 0, 393, 0.6767F, -0.2558F, -12.001F, 1, 1, 1, 0.0F, false));
		handguard241_r1.cubeList.add(new ModelBox(handguard241_r1, 398, 184, 0.6767F, -0.2558F, -4.501F, 1, 1, 1, 0.0F, false));
		handguard241_r1.cubeList.add(new ModelBox(handguard241_r1, 4, 393, 0.6767F, -0.2558F, -9.501F, 1, 1, 1, 0.0F, false));
		handguard241_r1.cubeList.add(new ModelBox(handguard241_r1, 8, 393, 0.6767F, -0.2558F, -14.501F, 1, 1, 1, 0.0F, false));
		handguard241_r1.cubeList.add(new ModelBox(handguard241_r1, 388, 362, 0.6767F, -0.2558F, -18.0F, 1, 1, 2, 0.0F, false));
		handguard241_r1.cubeList.add(new ModelBox(handguard241_r1, 318, 212, -0.1033F, -0.2568F, -18.001F, 1, 1, 21, 0.0F, false));

		handguard202_r1 = new ModelRenderer(this);
		handguard202_r1.setRotationPoint(-2.0F, -39.6F, -26.0F);
		handguard_carbine.addChild(handguard202_r1);
		setRotationAngle(handguard202_r1, 0.0925F, -0.0349F, -0.4538F);
		handguard202_r1.cubeList.add(new ModelBox(handguard202_r1, 382, 119, -1.2F, 0.0F, 0.05F, 1, 1, 3, 0.0F, false));

		handguard204_r1 = new ModelRenderer(this);
		handguard204_r1.setRotationPoint(-3.6F, -38.0F, -26.0F);
		handguard_carbine.addChild(handguard204_r1);
		setRotationAngle(handguard204_r1, 0.0349F, -0.096F, 0.4538F);
		handguard204_r1.cubeList.add(new ModelBox(handguard204_r1, 382, 123, -0.001F, -1.2F, 0.05F, 1, 1, 3, 0.0F, false));

		handguard203_r1 = new ModelRenderer(this);
		handguard203_r1.setRotationPoint(-3.6F, -38.0F, -26.0F);
		handguard_carbine.addChild(handguard203_r1);
		setRotationAngle(handguard203_r1, -0.0436F, -0.096F, 0.4538F);
		handguard203_r1.cubeList.add(new ModelBox(handguard203_r1, 382, 127, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard202_r2 = new ModelRenderer(this);
		handguard202_r2.setRotationPoint(-3.6F, -37.0F, -26.0F);
		handguard_carbine.addChild(handguard202_r2);
		setRotationAngle(handguard202_r2, 0.0F, -0.1047F, 0.0F);
		handguard202_r2.cubeList.add(new ModelBox(handguard202_r2, 144, 382, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard203_r2 = new ModelRenderer(this);
		handguard203_r2.setRotationPoint(-2.0F, -35.4F, -26.0F);
		handguard_carbine.addChild(handguard203_r2);
		setRotationAngle(handguard203_r2, -0.0925F, -0.0349F, 0.4538F);
		handguard203_r2.cubeList.add(new ModelBox(handguard203_r2, 152, 382, -1.2F, -1.0F, 0.05F, 1, 1, 3, 0.0F, false));

		handguard204_r2 = new ModelRenderer(this);
		handguard204_r2.setRotationPoint(-3.6F, -37.0F, -26.0F);
		handguard_carbine.addChild(handguard204_r2);
		setRotationAngle(handguard204_r2, 0.0436F, -0.096F, -0.4538F);
		handguard204_r2.cubeList.add(new ModelBox(handguard204_r2, 160, 382, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard202_r3 = new ModelRenderer(this);
		handguard202_r3.setRotationPoint(-2.0F, -35.4F, -26.0F);
		handguard_carbine.addChild(handguard202_r3);
		setRotationAngle(handguard202_r3, -0.0925F, 0.0524F, 0.4538F);
		handguard202_r3.cubeList.add(new ModelBox(handguard202_r3, 168, 382, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard205_r1 = new ModelRenderer(this);
		handguard205_r1.setRotationPoint(-3.6F, -37.0F, -26.0F);
		handguard_carbine.addChild(handguard205_r1);
		setRotationAngle(handguard205_r1, -0.0349F, -0.096F, -0.4538F);
		handguard205_r1.cubeList.add(new ModelBox(handguard205_r1, 176, 382, -0.001F, 0.2F, 0.05F, 1, 1, 3, 0.0F, false));

		handguard200_r1 = new ModelRenderer(this);
		handguard200_r1.setRotationPoint(-2.0F, -35.4F, -26.0F);
		handguard_carbine.addChild(handguard200_r1);
		setRotationAngle(handguard200_r1, -0.1047F, 0.0F, 0.0F);
		handguard200_r1.cubeList.add(new ModelBox(handguard200_r1, 184, 382, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard204_r3 = new ModelRenderer(this);
		handguard204_r3.setRotationPoint(-1.0F, -35.4F, -26.0F);
		handguard_carbine.addChild(handguard204_r3);
		setRotationAngle(handguard204_r3, -0.0925F, 0.0349F, -0.4538F);
		handguard204_r3.cubeList.add(new ModelBox(handguard204_r3, 192, 382, 0.2F, -1.0F, 0.05F, 1, 1, 3, 0.0F, false));

		handguard203_r3 = new ModelRenderer(this);
		handguard203_r3.setRotationPoint(-1.0F, -35.4F, -26.0F);
		handguard_carbine.addChild(handguard203_r3);
		setRotationAngle(handguard203_r3, -0.0925F, -0.0524F, -0.4538F);
		handguard203_r3.cubeList.add(new ModelBox(handguard203_r3, 200, 382, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard206_r1 = new ModelRenderer(this);
		handguard206_r1.setRotationPoint(0.6F, -37.0F, -26.0F);
		handguard_carbine.addChild(handguard206_r1);
		setRotationAngle(handguard206_r1, -0.0349F, 0.096F, 0.4538F);
		handguard206_r1.cubeList.add(new ModelBox(handguard206_r1, 208, 382, -0.999F, 0.2F, 0.05F, 1, 1, 3, 0.0F, false));

		handguard205_r2 = new ModelRenderer(this);
		handguard205_r2.setRotationPoint(0.6F, -37.0F, -26.0F);
		handguard_carbine.addChild(handguard205_r2);
		setRotationAngle(handguard205_r2, 0.0436F, 0.096F, 0.4538F);
		handguard205_r2.cubeList.add(new ModelBox(handguard205_r2, 216, 382, -1.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard201_r1 = new ModelRenderer(this);
		handguard201_r1.setRotationPoint(0.6F, -37.0F, -26.0F);
		handguard_carbine.addChild(handguard201_r1);
		setRotationAngle(handguard201_r1, 0.0F, 0.1047F, 0.0F);
		handguard201_r1.cubeList.add(new ModelBox(handguard201_r1, 224, 382, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard199_r1 = new ModelRenderer(this);
		handguard199_r1.setRotationPoint(-2.0F, -39.6F, -26.0F);
		handguard_carbine.addChild(handguard199_r1);
		setRotationAngle(handguard199_r1, 0.1047F, 0.0F, 0.0F);
		handguard199_r1.cubeList.add(new ModelBox(handguard199_r1, 232, 382, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard201_r2 = new ModelRenderer(this);
		handguard201_r2.setRotationPoint(-2.0F, -39.6F, -26.0F);
		handguard_carbine.addChild(handguard201_r2);
		setRotationAngle(handguard201_r2, 0.0925F, 0.0524F, -0.4538F);
		handguard201_r2.cubeList.add(new ModelBox(handguard201_r2, 240, 382, -1.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard200_r2 = new ModelRenderer(this);
		handguard200_r2.setRotationPoint(-1.0F, -39.6F, -26.0F);
		handguard_carbine.addChild(handguard200_r2);
		setRotationAngle(handguard200_r2, 0.0925F, -0.0524F, 0.4538F);
		handguard200_r2.cubeList.add(new ModelBox(handguard200_r2, 248, 382, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard201_r3 = new ModelRenderer(this);
		handguard201_r3.setRotationPoint(-1.0F, -39.6F, -26.0F);
		handguard_carbine.addChild(handguard201_r3);
		setRotationAngle(handguard201_r3, 0.0925F, 0.0349F, 0.4538F);
		handguard201_r3.cubeList.add(new ModelBox(handguard201_r3, 278, 382, 0.2F, 0.0F, 0.05F, 1, 1, 3, 0.0F, false));

		handguard203_r4 = new ModelRenderer(this);
		handguard203_r4.setRotationPoint(0.6F, -38.0F, -26.0F);
		handguard_carbine.addChild(handguard203_r4);
		setRotationAngle(handguard203_r4, 0.0349F, 0.096F, -0.4538F);
		handguard203_r4.cubeList.add(new ModelBox(handguard203_r4, 286, 382, -0.999F, -1.2F, 0.05F, 1, 1, 3, 0.0F, false));

		handguard202_r4 = new ModelRenderer(this);
		handguard202_r4.setRotationPoint(0.6F, -38.0F, -26.0F);
		handguard_carbine.addChild(handguard202_r4);
		setRotationAngle(handguard202_r4, -0.0436F, 0.096F, -0.4538F);
		handguard202_r4.cubeList.add(new ModelBox(handguard202_r4, 294, 382, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-1.5237F, -40.8381F, -35.5368F);
		handguard_carbine.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 272, 384, -0.9737F, -0.5632F, -7.7132F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 386, 232, -0.9737F, -0.5632F, -8.9132F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 390, 126, -0.9737F, -0.5632F, -10.1132F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 390, 100, -0.9737F, -0.5632F, -6.4632F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 390, 102, -0.9737F, -0.5632F, -5.2132F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 390, 104, -0.9737F, -0.5632F, -3.9632F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 390, 106, -0.9737F, -0.5632F, -2.7132F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 390, 108, -0.9737F, -0.5632F, -1.4632F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 390, 110, -0.9737F, -0.5632F, 1.0368F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 390, 112, -0.9737F, -0.5632F, -0.2132F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 390, 114, -0.9737F, -0.5632F, 3.5368F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 116, 390, -0.9737F, -0.5632F, 2.2868F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 390, 116, -0.9737F, -0.5632F, 6.0368F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 390, 118, -0.9737F, -0.5632F, 4.7868F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 390, 120, -0.9737F, -0.5632F, 8.5368F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 122, 390, -0.9737F, -0.5632F, 9.7368F, 2, 1, 1, -0.198F, false));
		bone2.cubeList.add(new ModelBox(bone2, 390, 122, -0.9737F, -0.5632F, 7.2868F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 272, 225, -0.8737F, 0.0368F, -10.4632F, 2, 1, 21, -0.001F, false));
		bone2.cubeList.add(new ModelBox(bone2, 44, 304, -1.0737F, 0.0368F, -10.4632F, 1, 1, 21, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 390, 124, -0.9737F, -0.5632F, -10.6632F, 2, 1, 1, -0.199F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-14.7737F, -0.3632F, -12.4632F);
		bone2.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.8901F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 32, 393, 8.6105F, -11.08F, 1.8F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 284, 277, 8.5605F, -10.93F, 1.8F, 1, 1, 21, -0.35F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 60, 393, 8.6105F, -11.08F, 19.75F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 64, 393, 8.6105F, -11.08F, 22.2F, 1, 1, 1, -0.197F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 68, 393, 8.6105F, -11.08F, 21.0F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 72, 393, 8.6105F, -11.08F, 17.25F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 76, 393, 8.6105F, -11.08F, 18.5F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 80, 393, 8.6105F, -11.08F, 14.75F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 84, 393, 8.6105F, -11.08F, 16.0F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 88, 393, 8.6105F, -11.08F, 12.25F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 92, 393, 8.6105F, -11.08F, 13.5F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 96, 393, 8.6105F, -11.08F, 11.0F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 100, 393, 8.6105F, -11.08F, 9.75F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 248, 393, 8.6105F, -11.08F, 8.5F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 252, 393, 8.6105F, -11.08F, 7.25F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 256, 393, 8.6105F, -11.08F, 6.0F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 260, 393, 8.6105F, -11.08F, 4.75F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 264, 393, 8.6105F, -11.08F, 3.55F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 108, 394, 8.6105F, -11.08F, 2.35F, 1, 1, 1, -0.198F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-13.1737F, -0.3632F, -12.4632F);
		bone2.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.8901F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 292, 393, 8.0105F, 10.68F, 1.8F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 286, 8.0605F, 10.83F, 1.8F, 1, 1, 21, -0.35F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 296, 393, 8.0105F, 10.68F, 19.75F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 316, 393, 8.0105F, 10.68F, 22.2F, 1, 1, 1, -0.197F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 320, 393, 8.0105F, 10.68F, 21.0F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 324, 393, 8.0105F, 10.68F, 17.25F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 336, 393, 8.0105F, 10.68F, 18.5F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 378, 393, 8.0105F, 10.68F, 14.75F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 382, 393, 8.0105F, 10.68F, 16.0F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 386, 393, 8.0105F, 10.68F, 12.25F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 390, 393, 8.0105F, 10.68F, 13.5F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 36, 394, 8.0105F, 10.68F, 11.0F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 40, 394, 8.0105F, 10.68F, 9.75F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 44, 394, 8.0105F, 10.68F, 8.5F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 48, 394, 8.0105F, 10.68F, 7.25F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 52, 394, 8.0105F, 10.68F, 6.0F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 56, 394, 8.0105F, 10.68F, 4.75F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 104, 394, 8.0105F, 10.68F, 3.55F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 112, 394, 8.0105F, 10.68F, 2.35F, 1, 1, 1, -0.198F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-4.7224F, -37.4662F, -35.7925F);
		handguard_carbine.addChild(bone6);
		setRotationAngle(bone6, 0.0F, 0.0F, -1.5708F);
		bone6.cubeList.add(new ModelBox(bone6, 390, 334, -0.975F, -0.56F, -7.4575F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 390, 336, -0.975F, -0.56F, -8.6575F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 390, 338, -0.975F, -0.56F, -9.8575F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 390, 340, -0.975F, -0.56F, -6.2075F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 390, 342, -0.975F, -0.56F, -4.9575F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 390, 344, -0.975F, -0.56F, -3.7075F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 390, 346, -0.975F, -0.56F, -2.4575F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 390, 348, -0.975F, -0.56F, -1.2075F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 390, 350, -0.975F, -0.56F, 1.2925F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 390, 352, -0.975F, -0.56F, 0.0425F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 390, 354, -0.975F, -0.56F, 3.7925F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 390, 356, -0.975F, -0.56F, 2.5425F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 390, 358, -0.975F, -0.56F, 6.2925F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 390, 360, -0.975F, -0.56F, 5.0425F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 372, 390, -0.975F, -0.56F, 8.7925F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 0, 391, -0.975F, -0.56F, 9.9925F, 2, 1, 1, -0.198F, false));
		bone6.cubeList.add(new ModelBox(bone6, 6, 391, -0.975F, -0.56F, 7.5425F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 238, 277, -0.875F, 0.04F, -10.2075F, 2, 1, 21, -0.001F, false));
		bone6.cubeList.add(new ModelBox(bone6, 0, 308, -1.075F, 0.04F, -10.2075F, 1, 1, 21, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 12, 391, -0.975F, -0.56F, -10.4075F, 2, 1, 1, -0.199F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-14.775F, -0.36F, -12.2075F);
		bone6.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 0.8901F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 280, 394, 8.6105F, -11.08F, 1.8F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 190, 299, 8.5605F, -10.93F, 1.8F, 1, 1, 21, -0.35F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 284, 394, 8.6105F, -11.08F, 19.75F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 288, 394, 8.6105F, -11.08F, 22.2F, 1, 1, 1, -0.197F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 394, 290, 8.6105F, -11.08F, 21.0F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 394, 292, 8.6105F, -11.08F, 17.25F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 394, 294, 8.6105F, -11.08F, 18.5F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 394, 296, 8.6105F, -11.08F, 14.75F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 394, 298, 8.6105F, -11.08F, 16.0F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 300, 394, 8.6105F, -11.08F, 12.25F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 394, 300, 8.6105F, -11.08F, 13.5F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 394, 302, 8.6105F, -11.08F, 11.0F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 304, 394, 8.6105F, -11.08F, 9.75F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 394, 304, 8.6105F, -11.08F, 8.5F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 394, 306, 8.6105F, -11.08F, 7.25F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 308, 394, 8.6105F, -11.08F, 6.0F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 394, 308, 8.6105F, -11.08F, 4.75F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 394, 310, 8.6105F, -11.08F, 3.55F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 312, 394, 8.6105F, -11.08F, 2.35F, 1, 1, 1, -0.198F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-13.175F, -0.36F, -12.2075F);
		bone6.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.8901F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 394, 312, 8.0105F, 10.68F, 1.8F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 234, 299, 8.0605F, 10.83F, 1.8F, 1, 1, 21, -0.35F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 394, 314, 8.0105F, 10.68F, 19.75F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 394, 316, 8.0105F, 10.68F, 22.2F, 1, 1, 1, -0.197F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 394, 318, 8.0105F, 10.68F, 21.0F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 328, 394, 8.0105F, 10.68F, 17.25F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 332, 394, 8.0105F, 10.68F, 18.5F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 340, 394, 8.0105F, 10.68F, 14.75F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 344, 394, 8.0105F, 10.68F, 16.0F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 348, 394, 8.0105F, 10.68F, 12.25F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 352, 394, 8.0105F, 10.68F, 13.5F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 356, 394, 8.0105F, 10.68F, 11.0F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 360, 394, 8.0105F, 10.68F, 9.75F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 394, 362, 8.0105F, 10.68F, 8.5F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 364, 394, 8.0105F, 10.68F, 7.25F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 394, 364, 8.0105F, 10.68F, 6.0F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 394, 366, 8.0105F, 10.68F, 4.75F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 368, 394, 8.0105F, 10.68F, 3.55F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 394, 368, 8.0105F, 10.68F, 2.35F, 1, 1, 1, -0.198F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(1.7776F, -37.4662F, -35.7925F);
		handguard_carbine.addChild(bone5);
		setRotationAngle(bone5, 0.0F, 0.0F, 1.5708F);
		bone5.cubeList.add(new ModelBox(bone5, 18, 391, -0.975F, -0.56F, -7.4575F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 24, 391, -0.975F, -0.56F, -8.6575F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 30, 391, -0.975F, -0.56F, -9.8575F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 60, 391, -0.975F, -0.56F, -6.2075F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 66, 391, -0.975F, -0.56F, -4.9575F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 72, 391, -0.975F, -0.56F, -3.7075F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 250, 391, -0.975F, -0.56F, -2.4575F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 256, 391, -0.975F, -0.56F, -1.2075F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 262, 391, -0.975F, -0.56F, 1.2925F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 294, 391, -0.975F, -0.56F, 0.0425F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 316, 391, -0.975F, -0.56F, 3.7925F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 322, 391, -0.975F, -0.56F, 2.5425F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 378, 391, -0.975F, -0.56F, 6.2925F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 384, 391, -0.975F, -0.56F, 5.0425F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 390, 391, -0.975F, -0.56F, 8.7925F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 392, 21, -0.975F, -0.56F, 9.9925F, 2, 1, 1, -0.198F, false));
		bone5.cubeList.add(new ModelBox(bone5, 392, 23, -0.975F, -0.56F, 7.5425F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 144, 279, -0.875F, 0.04F, -10.2075F, 2, 1, 21, -0.001F, false));
		bone5.cubeList.add(new ModelBox(bone5, 308, 247, -1.075F, 0.04F, -10.2075F, 1, 1, 21, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 392, 25, -0.975F, -0.56F, -10.4075F, 2, 1, 1, -0.199F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-14.775F, -0.36F, -12.2075F);
		bone5.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.8901F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 394, 370, 8.6105F, -11.08F, 1.8F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 278, 299, 8.5605F, -10.93F, 1.8F, 1, 1, 21, -0.35F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 372, 394, 8.6105F, -11.08F, 19.75F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 394, 372, 8.6105F, -11.08F, 22.2F, 1, 1, 1, -0.197F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 394, 374, 8.6105F, -11.08F, 21.0F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 394, 376, 8.6105F, -11.08F, 17.25F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 394, 378, 8.6105F, -11.08F, 18.5F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 394, 388, 8.6105F, -11.08F, 14.75F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 394, 393, 8.6105F, -11.08F, 16.0F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 395, 8.6105F, -11.08F, 12.25F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 4, 395, 8.6105F, -11.08F, 13.5F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 8, 395, 8.6105F, -11.08F, 11.0F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 12, 395, 8.6105F, -11.08F, 9.75F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 16, 395, 8.6105F, -11.08F, 8.5F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 20, 395, 8.6105F, -11.08F, 7.25F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 24, 395, 8.6105F, -11.08F, 6.0F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 28, 395, 8.6105F, -11.08F, 4.75F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 32, 395, 8.6105F, -11.08F, 3.55F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 60, 395, 8.6105F, -11.08F, 2.35F, 1, 1, 1, -0.198F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-13.175F, -0.36F, -12.2075F);
		bone5.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.8901F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 64, 395, 8.0105F, 10.68F, 1.8F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 136, 301, 8.0605F, 10.83F, 1.8F, 1, 1, 21, -0.35F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 68, 395, 8.0105F, 10.68F, 19.75F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 72, 395, 8.0105F, 10.68F, 22.2F, 1, 1, 1, -0.197F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 76, 395, 8.0105F, 10.68F, 21.0F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 80, 395, 8.0105F, 10.68F, 17.25F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 84, 395, 8.0105F, 10.68F, 18.5F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 88, 395, 8.0105F, 10.68F, 14.75F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 92, 395, 8.0105F, 10.68F, 16.0F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 96, 395, 8.0105F, 10.68F, 12.25F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 100, 395, 8.0105F, 10.68F, 13.5F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 248, 395, 8.0105F, 10.68F, 11.0F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 252, 395, 8.0105F, 10.68F, 9.75F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 256, 395, 8.0105F, 10.68F, 8.5F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 260, 395, 8.0105F, 10.68F, 7.25F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 264, 395, 8.0105F, 10.68F, 6.0F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 292, 395, 8.0105F, 10.68F, 4.75F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 296, 395, 8.0105F, 10.68F, 3.55F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 316, 395, 8.0105F, 10.68F, 2.35F, 1, 1, 1, -0.198F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-1.5224F, -34.3412F, -35.7925F);
		handguard_carbine.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 0.0F, -3.1416F);
		bone4.cubeList.add(new ModelBox(bone4, 390, 261, -0.975F, -0.56F, -7.4575F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 390, 263, -0.975F, -0.56F, -8.6575F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 276, 390, -0.975F, -0.56F, -9.8575F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 282, 390, -0.975F, -0.56F, -6.2075F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 390, 284, -0.975F, -0.56F, -4.9575F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 390, 286, -0.975F, -0.56F, -3.7075F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 288, 390, -0.975F, -0.56F, -2.4575F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 390, 288, -0.975F, -0.56F, -1.2075F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 304, 390, -0.975F, -0.56F, 1.2925F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 310, 390, -0.975F, -0.56F, 0.0425F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 390, 320, -0.975F, -0.56F, 3.7925F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 390, 322, -0.975F, -0.56F, 2.5425F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 390, 324, -0.975F, -0.56F, 6.2925F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 390, 326, -0.975F, -0.56F, 5.0425F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 390, 328, -0.975F, -0.56F, 8.7925F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 390, 330, -0.975F, -0.56F, 9.9925F, 2, 1, 1, -0.198F, false));
		bone4.cubeList.add(new ModelBox(bone4, 332, 390, -0.975F, -0.56F, 7.5425F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 192, 277, -0.875F, 0.04F, -10.2075F, 2, 1, 21, -0.001F, false));
		bone4.cubeList.add(new ModelBox(bone4, 88, 304, -1.075F, 0.04F, -10.2075F, 1, 1, 21, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 390, 332, -0.975F, -0.56F, -10.4075F, 2, 1, 1, -0.199F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-14.775F, -0.36F, -12.2075F);
		bone4.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.8901F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 394, 209, 8.6105F, -11.08F, 1.8F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 294, 146, 8.5605F, -10.93F, 1.8F, 1, 1, 21, -0.35F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 394, 211, 8.6105F, -11.08F, 19.75F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 212, 394, 8.6105F, -11.08F, 22.2F, 1, 1, 1, -0.197F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 394, 213, 8.6105F, -11.08F, 21.0F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 394, 215, 8.6105F, -11.08F, 17.25F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 216, 394, 8.6105F, -11.08F, 18.5F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 394, 217, 8.6105F, -11.08F, 14.75F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 394, 219, 8.6105F, -11.08F, 16.0F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 220, 394, 8.6105F, -11.08F, 12.25F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 394, 221, 8.6105F, -11.08F, 13.5F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 394, 223, 8.6105F, -11.08F, 11.0F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 224, 394, 8.6105F, -11.08F, 9.75F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 394, 225, 8.6105F, -11.08F, 8.5F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 394, 227, 8.6105F, -11.08F, 7.25F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 228, 394, 8.6105F, -11.08F, 6.0F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 394, 229, 8.6105F, -11.08F, 4.75F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 232, 394, 8.6105F, -11.08F, 3.55F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 394, 234, 8.6105F, -11.08F, 2.35F, 1, 1, 1, -0.198F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-13.175F, -0.36F, -12.2075F);
		bone4.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.8901F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 236, 394, 8.0105F, 10.68F, 1.8F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 296, 119, 8.0605F, 10.83F, 1.8F, 1, 1, 21, -0.35F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 394, 236, 8.0105F, 10.68F, 19.75F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 394, 238, 8.0105F, 10.68F, 22.2F, 1, 1, 1, -0.197F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 240, 394, 8.0105F, 10.68F, 21.0F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 394, 240, 8.0105F, 10.68F, 17.25F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 394, 242, 8.0105F, 10.68F, 18.5F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 244, 394, 8.0105F, 10.68F, 14.75F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 394, 244, 8.0105F, 10.68F, 16.0F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 394, 246, 8.0105F, 10.68F, 12.25F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 394, 248, 8.0105F, 10.68F, 13.5F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 394, 250, 8.0105F, 10.68F, 11.0F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 394, 252, 8.0105F, 10.68F, 9.75F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 394, 265, 8.0105F, 10.68F, 8.5F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 394, 267, 8.0105F, 10.68F, 7.25F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 268, 394, 8.0105F, 10.68F, 6.0F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 394, 269, 8.0105F, 10.68F, 4.75F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 272, 394, 8.0105F, 10.68F, 3.55F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 276, 394, 8.0105F, 10.68F, 2.35F, 1, 1, 1, -0.198F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handguard_carbine.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}