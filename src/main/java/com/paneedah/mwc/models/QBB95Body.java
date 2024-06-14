package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBB95Body extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer trigger;
	private final ModelRenderer triggermagrelease2;
	private final ModelRenderer trigger2;
	private final ModelRenderer cube_r147;
	private final ModelRenderer cube_r148;
	private final ModelRenderer grip;
	private final ModelRenderer cube_r80;
	private final ModelRenderer cube_r81;
	private final ModelRenderer cube_r82;
	private final ModelRenderer cube_r83;
	private final ModelRenderer cube_r84;
	private final ModelRenderer cube_r88_r1;
	private final ModelRenderer cube_r88_r2;
	private final ModelRenderer cube_r87_r1;
	private final ModelRenderer cube_r85;
	private final ModelRenderer bone30;
	private final ModelRenderer cube_r86;
	private final ModelRenderer cube_r87;
	private final ModelRenderer bone33;
	private final ModelRenderer cube_r88;
	private final ModelRenderer cube_r89;
	private final ModelRenderer bone31;
	private final ModelRenderer cube_r90;
	private final ModelRenderer cube_r91;
	private final ModelRenderer bone32;
	private final ModelRenderer cube_r92;
	private final ModelRenderer cube_r93;
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

	public QBB95Body() {
		textureWidth = 512;
		textureHeight = 512;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 2.0F);
		

		trigger = new ModelRenderer(this);
		trigger.setRotationPoint(-3.5F, -27.5F, -7.0F);
		body.addChild(trigger);
		setRotationAngle(trigger, 1.041F, 0.0F, 0.0F);
		

		triggermagrelease2 = new ModelRenderer(this);
		triggermagrelease2.setRotationPoint(1.5F, -10.9348F, -0.9756F);
		trigger.addChild(triggermagrelease2);
		setRotationAngle(triggermagrelease2, -1.0472F, 0.0F, 0.0F);
		

		trigger2 = new ModelRenderer(this);
		trigger2.setRotationPoint(0.0F, 2.9254F, 5.9662F);
		triggermagrelease2.addChild(trigger2);
		trigger2.cubeList.add(new ModelBox(trigger2, 8, 34, 0.0F, -3.8672F, 0.2811F, 1, 3, 1, 0.0F, false));

		cube_r147 = new ModelRenderer(this);
		cube_r147.setRotationPoint(0.0F, 0.0F, 0.0F);
		trigger2.addChild(cube_r147);
		setRotationAngle(cube_r147, -1.2217F, 0.0F, 0.0F);
		cube_r147.cubeList.add(new ModelBox(cube_r147, 174, 49, 0.0F, -0.6345F, -0.8767F, 1, 1, 1, 0.0F, false));

		cube_r148 = new ModelRenderer(this);
		cube_r148.setRotationPoint(0.0F, -0.4056F, 0.5792F);
		trigger2.addChild(cube_r148);
		setRotationAngle(cube_r148, -0.6981F, 0.0F, 0.0F);
		cube_r148.cubeList.add(new ModelBox(cube_r148, 174, 36, 0.0F, -0.8048F, -0.759F, 1, 1, 1, 0.0F, false));

		grip = new ModelRenderer(this);
		grip.setRotationPoint(0.5F, -33.6F, -8.4F);
		body.addChild(grip);
		grip.cubeList.add(new ModelBox(grip, 150, 173, -2.9F, 1.5F, 1.7F, 3, 1, 7, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 52, 108, -2.9F, 2.3F, 1.7F, 3, 1, 6, -0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 168, 76, -2.9F, 3.3F, 5.6F, 3, 1, 1, -0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 17, 82, -2.9F, 14.8F, 3.3F, 3, 1, 4, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 14, 176, -4.1F, 3.3F, 5.6F, 2, 1, 1, -0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 90, 110, -4.1F, 2.3F, 1.7F, 2, 1, 6, -0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 183, 49, -4.1F, 1.5F, 1.7F, 2, 1, 7, 0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 167, 140, -2.9F, 1.5F, 1.375F, 3, 1, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 55, 175, -4.1F, 1.5F, 1.375F, 2, 1, 1, 0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 171, 13, -2.898F, 2.1263F, 1.376F, 3, 1, 1, -0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 65, 177, -4.098F, 2.1263F, 1.376F, 2, 1, 1, -0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 75, 55, -4.1F, 14.8F, 3.3F, 2, 1, 4, -0.001F, false));

		cube_r80 = new ModelRenderer(this);
		cube_r80.setRotationPoint(-4.1F, 9.65F, 9.0F);
		grip.addChild(cube_r80);
		setRotationAngle(cube_r80, -1.2392F, 0.0F, 0.0F);
		cube_r80.cubeList.add(new ModelBox(cube_r80, 55, 17, 0.0F, 0.0F, -6.0F, 2, 1, 6, -0.003F, false));
		cube_r80.cubeList.add(new ModelBox(cube_r80, 52, 90, 1.2F, 0.0F, -6.0F, 3, 1, 6, -0.001F, false));

		cube_r81 = new ModelRenderer(this);
		cube_r81.setRotationPoint(-4.1F, 9.65F, 9.0F);
		grip.addChild(cube_r81);
		setRotationAngle(cube_r81, -1.4312F, 0.0F, 0.0F);
		cube_r81.cubeList.add(new ModelBox(cube_r81, 90, 150, 0.0F, 0.0F, 0.0F, 2, 1, 5, -0.001F, false));
		cube_r81.cubeList.add(new ModelBox(cube_r81, 55, 8, 1.2F, 0.0F, 0.0F, 3, 1, 5, 0.0F, false));

		cube_r82 = new ModelRenderer(this);
		cube_r82.setRotationPoint(-4.1F, 14.8F, 3.3F);
		grip.addChild(cube_r82);
		setRotationAngle(cube_r82, 0.7854F, 0.0F, 0.0F);
		cube_r82.cubeList.add(new ModelBox(cube_r82, 7, 176, 0.0F, 0.0F, 0.0F, 2, 1, 1, -0.002F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 168, 59, 1.2F, 0.0F, 0.0F, 3, 1, 1, -0.001F, false));

		cube_r83 = new ModelRenderer(this);
		cube_r83.setRotationPoint(-4.1F, 15.8F, 7.3F);
		grip.addChild(cube_r83);
		setRotationAngle(cube_r83, 0.4712F, 0.0F, 0.0F);
		cube_r83.cubeList.add(new ModelBox(cube_r83, 0, 176, 0.0F, -1.0F, 0.0F, 2, 1, 1, -0.002F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 49, 142, 0.0F, -1.0F, 0.7F, 2, 1, 2, -0.003F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 58, 168, 1.2F, -1.0F, 0.0F, 3, 1, 1, -0.001F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 110, 68, 1.2F, -1.0F, 0.7F, 3, 1, 2, -0.002F, false));

		cube_r84 = new ModelRenderer(this);
		cube_r84.setRotationPoint(-4.1F, 3.95F, 6.7F);
		grip.addChild(cube_r84);
		setRotationAngle(cube_r84, -1.3439F, 0.0F, 0.0F);
		cube_r84.cubeList.add(new ModelBox(cube_r84, 0, 0, 0.0F, 0.0F, -2.0F, 2, 5, 13, 0.002F, false));
		cube_r84.cubeList.add(new ModelBox(cube_r84, 19, 19, 1.1F, 0.7F, -3.7F, 2, 5, 4, 0.002F, false));
		cube_r84.cubeList.add(new ModelBox(cube_r84, 173, 40, 1.1F, 5.704F, -0.7F, 2, 2, 1, 0.002F, false));
		cube_r84.cubeList.add(new ModelBox(cube_r84, 35, 34, 1.2F, 0.0F, -2.0F, 3, 5, 13, 0.001F, false));

		cube_r88_r1 = new ModelRenderer(this);
		cube_r88_r1.setRotationPoint(2.1F, 13.414F, -1.6906F);
		cube_r84.addChild(cube_r88_r1);
		setRotationAngle(cube_r88_r1, -1.0036F, 0.0F, 0.0F);
		cube_r88_r1.cubeList.add(new ModelBox(cube_r88_r1, 34, 176, -1.0F, -0.5F, -0.5F, 2, 1, 1, 0.002F, false));

		cube_r88_r2 = new ModelRenderer(this);
		cube_r88_r2.setRotationPoint(2.1F, 10.5242F, 0.4844F);
		cube_r84.addChild(cube_r88_r2);
		setRotationAngle(cube_r88_r2, -0.2182F, 0.0F, 0.0F);
		cube_r88_r2.cubeList.add(new ModelBox(cube_r88_r2, 55, 34, -1.0F, 3.0F, -7.5F, 2, 1, 6, 0.002F, false));

		cube_r87_r1 = new ModelRenderer(this);
		cube_r87_r1.setRotationPoint(2.1F, 8.5756F, -0.405F);
		cube_r84.addChild(cube_r87_r1);
		setRotationAngle(cube_r87_r1, -0.2182F, 0.0F, 0.0F);
		cube_r87_r1.cubeList.add(new ModelBox(cube_r87_r1, 52, 74, -1.0F, -1.0F, -0.5F, 2, 6, 1, 0.002F, false));

		cube_r85 = new ModelRenderer(this);
		cube_r85.setRotationPoint(-4.1F, 2.5F, 9.0F);
		grip.addChild(cube_r85);
		setRotationAngle(cube_r85, -0.8378F, 0.0F, 0.0F);
		cube_r85.cubeList.add(new ModelBox(cube_r85, 150, 33, 0.0F, 0.223F, -1.2007F, 2, 3, 1, -0.003F, false));
		cube_r85.cubeList.add(new ModelBox(cube_r85, 166, 87, 1.2F, 0.223F, -1.2007F, 3, 3, 1, -0.002F, false));

		bone30 = new ModelRenderer(this);
		bone30.setRotationPoint(-2.0F, -3.7F, 11.0F);
		grip.addChild(bone30);
		

		cube_r86 = new ModelRenderer(this);
		cube_r86.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone30.addChild(cube_r86);
		setRotationAngle(cube_r86, 0.0F, 0.0F, -0.4363F);
		

		cube_r87 = new ModelRenderer(this);
		cube_r87.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone30.addChild(cube_r87);
		setRotationAngle(cube_r87, 0.0F, 0.0F, 0.4363F);
		

		bone33 = new ModelRenderer(this);
		bone33.setRotationPoint(-2.0F, -0.3F, 11.0F);
		grip.addChild(bone33);
		

		cube_r88 = new ModelRenderer(this);
		cube_r88.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone33.addChild(cube_r88);
		setRotationAngle(cube_r88, 0.0F, 0.0F, 0.4363F);
		

		cube_r89 = new ModelRenderer(this);
		cube_r89.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone33.addChild(cube_r89);
		setRotationAngle(cube_r89, 0.0F, 0.0F, -0.4363F);
		

		bone31 = new ModelRenderer(this);
		bone31.setRotationPoint(-3.7F, -2.0F, 11.0F);
		grip.addChild(bone31);
		

		cube_r90 = new ModelRenderer(this);
		cube_r90.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone31.addChild(cube_r90);
		setRotationAngle(cube_r90, 0.0F, 0.0F, -0.4363F);
		

		cube_r91 = new ModelRenderer(this);
		cube_r91.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone31.addChild(cube_r91);
		setRotationAngle(cube_r91, 0.0F, 0.0F, 0.4363F);
		

		bone32 = new ModelRenderer(this);
		bone32.setRotationPoint(-0.3F, -2.0F, 11.0F);
		grip.addChild(bone32);
		

		cube_r92 = new ModelRenderer(this);
		cube_r92.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone32.addChild(cube_r92);
		setRotationAngle(cube_r92, 0.0F, 0.0F, 0.4363F);
		

		cube_r93 = new ModelRenderer(this);
		cube_r93.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone32.addChild(cube_r93);
		setRotationAngle(cube_r93, 0.0F, 0.0F, -0.4363F);
		

		handguard = new ModelRenderer(this);
		handguard.setRotationPoint(-1.5833F, -32.5445F, 2.9473F);
		body.addChild(handguard);
		handguard.cubeList.add(new ModelBox(handguard, 150, 130, -2.4167F, -0.4555F, 2.0527F, 5, 2, 5, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 17, 58, -2.2167F, -0.4555F, -0.9473F, 4, 2, 3, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 138, 100, 1.3833F, -0.4555F, -0.9473F, 1, 2, 3, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 88, 63, -2.4167F, -1.4555F, 6.0527F, 5, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 82, 224, 1.3833F, -2.4555F, -20.9473F, 1, 2, 23, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 110, 89, 1.5833F, -2.4555F, 2.0527F, 1, 2, 4, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 144, 227, -2.2167F, -2.4555F, -20.9473F, 1, 2, 23, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 110, 76, -2.4167F, -2.4555F, 2.0527F, 1, 2, 4, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 110, 62, -0.6167F, -0.4555F, -2.9473F, 3, 1, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 128, 177, 1.3833F, -0.9555F, -3.7473F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 150, 177, -2.6167F, -0.9555F, -13.7473F, 1, 1, 1, -0.3F, false));
		handguard.cubeList.add(new ModelBox(handguard, 133, 177, 1.7833F, -0.9555F, -13.7473F, 1, 1, 1, -0.3F, false));
		handguard.cubeList.add(new ModelBox(handguard, 67, 166, 1.8833F, 0.1445F, 3.9527F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 66, 154, 1.8833F, -1.2697F, 3.9527F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 100, 165, 1.8833F, -0.5626F, 4.6598F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 150, 130, 1.8833F, -0.5626F, 3.2456F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 8, 81, -2.7167F, 0.1445F, 3.9527F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 43, 81, -2.7167F, -0.5626F, 3.2456F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 83, 0, -2.7167F, -1.2697F, 3.9527F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 83, 16, -2.7167F, -0.5626F, 4.6598F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 75, 0, 1.3833F, -1.3761F, -11.3255F, 1, 2, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 35, 0, 2.4319F, -1.8898F, -22.9473F, 1, 1, 6, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 17, 50, -3.2652F, -1.8898F, -22.9473F, 1, 1, 6, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 75, 0, -3.1652F, -1.8898F, -35.9473F, 1, 1, 14, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 75, 16, 2.3319F, -1.8898F, -35.9473F, 1, 1, 14, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 131, 120, 2.4319F, -1.8898F, -39.9473F, 1, 1, 4, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 60, 148, -3.2652F, -1.8898F, -39.9473F, 1, 1, 4, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 26, 111, 2.4319F, -1.8898F, -34.6473F, 1, 1, 1, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 52, 111, -3.2652F, -1.8898F, -34.6473F, 1, 1, 1, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 26, 108, -3.2652F, -1.8898F, -32.3473F, 1, 1, 1, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 90, 110, 2.4319F, -1.8898F, -32.3473F, 1, 1, 1, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 102, 24, -3.2652F, -1.8898F, -30.0473F, 1, 1, 1, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 102, 103, 2.4319F, -1.8898F, -30.0473F, 1, 1, 1, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 101, 63, -3.2652F, -1.8898F, -27.7473F, 1, 1, 1, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 101, 79, 2.4319F, -1.8898F, -27.7473F, 1, 1, 1, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 101, 3, -3.2652F, -1.8898F, -25.4473F, 1, 1, 1, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 101, 19, 2.4319F, -1.8898F, -25.4473F, 1, 1, 1, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 183, 33, -2.4167F, -1.1413F, -35.9473F, 5, 1, 14, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 110, 102, -2.4167F, -1.0413F, -39.9473F, 5, 1, 4, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 13, 68, -2.4167F, -1.0413F, -32.3473F, 5, 1, 1, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 26, 68, -2.4167F, -1.0413F, -34.6473F, 5, 1, 1, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 39, 68, -2.4167F, -1.0413F, -30.0473F, 5, 1, 1, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 52, 68, -2.4167F, -1.0413F, -27.7473F, 5, 1, 1, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 75, 63, -2.4167F, -1.0413F, -25.4473F, 5, 1, 1, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 150, 96, -2.4167F, -1.0413F, -22.9473F, 5, 1, 6, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 150, 150, 1.5833F, -4.4555F, -39.9473F, 1, 2, 46, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 199, 153, -2.4167F, -4.4555F, -39.9473F, 1, 2, 46, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.7096F, -4.4555F, 17.0527F);
		handguard.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 176, 202, -0.5F, -0.5F, -57.0F, 1, 1, 46, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.8762F, -4.4555F, 7.0527F);
		handguard.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 222, -0.5F, -0.5F, -47.0F, 1, 1, 46, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(13.997F, 10.5239F, -24.4473F);
		handguard.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.7854F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 101, 56, -0.5F, -16.5F, -1.0F, 1, 1, 1, 0.1F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 102, 8, -0.5F, -16.5F, -3.3F, 1, 1, 1, 0.1F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 17, 108, -0.5F, -16.5F, -5.6F, 1, 1, 1, 0.1F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 101, 110, -0.5F, -16.5F, -7.9F, 1, 1, 1, 0.1F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 17, 111, -0.5F, -16.5F, -10.2F, 1, 1, 1, 0.1F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 136, 87, -0.5F, -16.5F, -15.5F, 1, 1, 4, 0.1F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 17, 74, -0.5F, -16.5F, 1.5F, 1, 1, 6, 0.1F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(2.6833F, -1.9898F, -24.4473F);
		handguard.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 35, 0, -0.5F, -1.5F, -1.0F, 1, 2, 1, 0.1F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 35, 8, -0.5F, -1.5F, -3.3F, 1, 2, 1, 0.1F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 35, 17, -0.5F, -1.5F, -5.6F, 1, 2, 1, 0.1F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 9, 42, -0.5F, -1.5F, -7.9F, 1, 2, 1, 0.1F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 43, 17, -0.5F, -1.5F, -10.2F, 1, 2, 1, 0.1F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 35, 53, -0.5F, -1.5F, -15.5F, 1, 2, 4, 0.1F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 17, 34, -0.5F, -1.5F, 1.5F, 1, 2, 6, 0.1F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(17.9894F, 19.7163F, -24.4473F);
		handguard.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.7854F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 101, 16, -0.5F, -29.5F, -1.0F, 1, 1, 1, 0.1F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 101, 76, -0.5F, -29.5F, -3.3F, 1, 1, 1, 0.1F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 102, 34, -0.5F, -29.5F, -5.6F, 1, 1, 1, 0.1F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 52, 108, -0.5F, -29.5F, -7.9F, 1, 1, 1, 0.1F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 90, 113, -0.5F, -29.5F, -10.2F, 1, 1, 1, 0.1F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 136, 76, -0.5F, -29.5F, -15.5F, 1, 1, 4, 0.1F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 16, 90, -0.5F, -29.5F, 1.5F, 1, 1, 6, 0.1F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(6.6757F, 7.2026F, -24.4473F);
		handguard.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 173, 56, -0.5F, -13.5F, -1.0F, 2, 1, 1, 0.1F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 174, 16, -0.5F, -13.5F, -3.3F, 2, 1, 1, 0.1F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 174, 150, -0.5F, -13.5F, -5.6F, 2, 1, 1, 0.1F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 174, 153, -0.5F, -13.5F, -7.9F, 2, 1, 1, 0.1F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 174, 160, -0.5F, -13.5F, -10.2F, 2, 1, 1, 0.1F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 42, -0.5F, -13.5F, -15.5F, 2, 1, 4, 0.1F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 55, 0, -0.5F, -13.5F, 1.5F, 2, 1, 6, 0.1F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(13.897F, 10.5239F, -45.9473F);
		handguard.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 35, 74, -0.5F, -16.5F, 10.0F, 1, 1, 14, 0.1F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(18.0894F, 19.7163F, -45.9473F);
		handguard.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 74, -0.5F, -29.5F, 10.0F, 1, 1, 14, 0.1F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(6.7757F, 7.2026F, -45.9473F);
		handguard.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.7854F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 50, -0.5F, -13.5F, 10.0F, 1, 1, 14, 0.1F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(2.5833F, -1.9898F, -45.9473F);
		handguard.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.7854F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 34, -0.5F, -0.5F, 10.0F, 1, 1, 14, 0.1F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.2343F, 0.7403F, -4.3913F);
		handguard.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.0873F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 75, 125, 1.15F, -1.5F, -16.5F, 1, 2, 10, 0.001F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 19, -2.45F, -1.5F, -16.5F, 4, 2, 10, 0.001F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 110, 110, -2.45F, -1.5F, -6.5F, 2, 2, 10, 0.001F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 75, 95, -1.05F, -1.5F, -6.5F, 3, 2, 10, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(1.6762F, 0.2534F, -3.6703F);
		handguard.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.4597F, 0.4176F, 0.6863F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 165, 33, -0.5F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(1.8833F, 0.4174F, -2.5644F);
		handguard.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.6109F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 165, 46, -0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.0333F, 0.7414F, -4.3904F);
		handguard.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.0873F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 88, 168, 1.35F, -0.5F, 2.0F, 1, 1, 1, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 67, 169, 1.35F, -0.5F, 2.5F, 1, 1, 1, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(1.6762F, -0.3761F, -10.3255F);
		handguard.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, -0.7854F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 43, 74, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-2.7167F, -0.3404F, 6.1548F);
		handguard.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.7854F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 83, 23, 0.0F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 26, 163, 4.6F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-2.7167F, -1.3404F, 6.1548F);
		handguard.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.7854F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 83, 7, 0.0F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 26, 160, 4.6F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-2.7167F, -1.3404F, 5.1548F);
		handguard.addChild(cube_r18);
		setRotationAngle(cube_r18, -0.7854F, 0.0F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 82, 34, 0.0F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 15, 151, 4.6F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-2.7167F, -0.3404F, 5.1548F);
		handguard.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.7854F, 0.0F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 35, 81, 0.0F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 12, 161, 4.6F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(1.6762F, -0.4555F, -6.9473F);
		handguard.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, 0.7854F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 181, -0.5F, -0.5F, -4.0F, 1, 1, 8, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-3.9167F, -1.3939F, 6.3483F);
		handguard.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.8727F, 0.0F, 0.0F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 35, 74, 1.5F, -1.5F, -0.5F, 1, 2, 1, 0.0F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 75, 7, 5.5F, -1.5F, -0.5F, 1, 2, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}