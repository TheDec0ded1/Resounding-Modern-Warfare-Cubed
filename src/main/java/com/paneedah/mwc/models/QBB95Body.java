package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.5
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
		textureWidth = 480;
		textureHeight = 480;

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
		trigger2.cubeList.add(new ModelBox(trigger2, 152, 458, 0.0F, -3.8672F, 0.2811F, 1, 3, 1, 0.0F, false));

		cube_r147 = new ModelRenderer(this);
		cube_r147.setRotationPoint(0.0F, 0.0F, 0.0F);
		trigger2.addChild(cube_r147);
		setRotationAngle(cube_r147, -1.2217F, 0.0F, 0.0F);
		cube_r147.cubeList.add(new ModelBox(cube_r147, 340, 461, 0.0F, -0.6345F, -0.8767F, 1, 1, 1, 0.0F, false));

		cube_r148 = new ModelRenderer(this);
		cube_r148.setRotationPoint(0.0F, -0.4056F, 0.5792F);
		trigger2.addChild(cube_r148);
		setRotationAngle(cube_r148, -0.6981F, 0.0F, 0.0F);
		cube_r148.cubeList.add(new ModelBox(cube_r148, 461, 341, 0.0F, -0.8048F, -0.759F, 1, 1, 1, 0.0F, false));

		grip = new ModelRenderer(this);
		grip.setRotationPoint(0.5F, -33.6F, -8.4F);
		body.addChild(grip);
		grip.cubeList.add(new ModelBox(grip, 350, 433, -2.9F, 1.5F, 1.7F, 3, 1, 7, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 424, 250, -2.9F, 2.3F, 1.7F, 3, 1, 6, -0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 453, 159, -2.9F, 3.3F, 5.6F, 3, 1, 1, -0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 323, 443, -2.9F, 14.8F, 3.3F, 3, 1, 4, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 460, 66, -4.1F, 3.3F, 5.6F, 2, 1, 1, -0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 434, 66, -4.1F, 2.3F, 1.7F, 2, 1, 6, -0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 434, 40, -4.1F, 1.5F, 1.7F, 2, 1, 7, 0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 27, 454, -2.9F, 1.5F, 1.375F, 3, 1, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 94, 460, -4.1F, 1.5F, 1.375F, 2, 1, 1, 0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 453, 173, -2.898F, 2.1263F, 1.3761F, 3, 1, 1, -0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 87, 460, -4.098F, 2.1263F, 1.3761F, 2, 1, 1, -0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 120, 448, -4.1F, 14.8F, 3.3F, 2, 1, 4, -0.001F, false));

		cube_r80 = new ModelRenderer(this);
		cube_r80.setRotationPoint(-4.1F, 9.65F, 9.0F);
		grip.addChild(cube_r80);
		setRotationAngle(cube_r80, -1.2392F, 0.0F, 0.0F);
		cube_r80.cubeList.add(new ModelBox(cube_r80, 434, 74, 0.0F, 0.0F, -6.0F, 2, 1, 6, -0.003F, false));
		cube_r80.cubeList.add(new ModelBox(cube_r80, 434, 58, 1.2F, 0.0F, -6.0F, 3, 1, 6, -0.001F, false));

		cube_r81 = new ModelRenderer(this);
		cube_r81.setRotationPoint(-4.1F, 9.65F, 9.0F);
		grip.addChild(cube_r81);
		setRotationAngle(cube_r81, -1.4312F, 0.0F, 0.0F);
		cube_r81.cubeList.add(new ModelBox(cube_r81, 160, 405, 0.0F, 0.0F, 0.0F, 2, 1, 5, -0.001F, false));
		cube_r81.cubeList.add(new ModelBox(cube_r81, 380, 289, 1.2F, 0.0F, 0.0F, 3, 1, 5, 0.0F, false));

		cube_r82 = new ModelRenderer(this);
		cube_r82.setRotationPoint(-4.1F, 14.8F, 3.3F);
		grip.addChild(cube_r82);
		setRotationAngle(cube_r82, 0.7854F, 0.0F, 0.0F);
		cube_r82.cubeList.add(new ModelBox(cube_r82, 460, 69, 0.0F, 0.0F, 0.0F, 2, 1, 1, -0.002F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 453, 162, 1.2F, 0.0F, 0.0F, 3, 1, 1, -0.001F, false));

		cube_r83 = new ModelRenderer(this);
		cube_r83.setRotationPoint(-4.1F, 15.8F, 7.3F);
		grip.addChild(cube_r83);
		setRotationAngle(cube_r83, 0.4712F, 0.0F, 0.0F);
		cube_r83.cubeList.add(new ModelBox(cube_r83, 80, 460, 0.0F, -1.0F, 0.0F, 2, 1, 1, -0.002F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 453, 44, 0.0F, -1.0F, 0.7F, 2, 1, 2, -0.003F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 453, 165, 1.2F, -1.0F, 0.0F, 3, 1, 1, -0.001F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 449, 246, 1.2F, -1.0F, 0.7F, 3, 1, 2, -0.002F, false));

		cube_r84 = new ModelRenderer(this);
		cube_r84.setRotationPoint(-4.1F, 3.95F, 6.7F);
		grip.addChild(cube_r84);
		setRotationAngle(cube_r84, -1.3439F, 0.0F, 0.0F);
		cube_r84.cubeList.add(new ModelBox(cube_r84, 351, 414, 0.0F, 0.0F, -2.0F, 2, 5, 13, 0.002F, false));
		cube_r84.cubeList.add(new ModelBox(cube_r84, 42, 441, 1.1F, 0.7F, -3.7F, 2, 5, 4, 0.002F, false));
		cube_r84.cubeList.add(new ModelBox(cube_r84, 430, 459, 1.1F, 5.704F, -0.7F, 2, 2, 1, 0.002F, false));
		cube_r84.cubeList.add(new ModelBox(cube_r84, 398, 305, 1.2F, 0.0F, -2.0F, 3, 5, 13, 0.001F, false));

		cube_r88_r1 = new ModelRenderer(this);
		cube_r88_r1.setRotationPoint(2.1F, 13.414F, -1.6906F);
		cube_r84.addChild(cube_r88_r1);
		setRotationAngle(cube_r88_r1, -1.0036F, 0.0F, 0.0F);
		cube_r88_r1.cubeList.add(new ModelBox(cube_r88_r1, 460, 60, -1.0F, -0.5F, -0.5F, 2, 1, 1, 0.002F, false));

		cube_r88_r2 = new ModelRenderer(this);
		cube_r88_r2.setRotationPoint(2.1F, 10.5242F, 0.4844F);
		cube_r84.addChild(cube_r88_r2);
		setRotationAngle(cube_r88_r2, -0.2182F, 0.0F, 0.0F);
		cube_r88_r2.cubeList.add(new ModelBox(cube_r88_r2, 437, 288, -1.0F, 3.0F, -7.5F, 2, 1, 6, 0.002F, false));

		cube_r87_r1 = new ModelRenderer(this);
		cube_r87_r1.setRotationPoint(2.1F, 8.5756F, -0.405F);
		cube_r84.addChild(cube_r87_r1);
		setRotationAngle(cube_r87_r1, -0.2182F, 0.0F, 0.0F);
		cube_r87_r1.cubeList.add(new ModelBox(cube_r87_r1, 257, 416, -1.0F, -1.0F, -0.5F, 2, 6, 1, 0.002F, false));

		cube_r85 = new ModelRenderer(this);
		cube_r85.setRotationPoint(-4.1F, 2.5F, 9.0F);
		grip.addChild(cube_r85);
		setRotationAngle(cube_r85, -0.8378F, 0.0F, 0.0F);
		cube_r85.cubeList.add(new ModelBox(cube_r85, 453, 168, 0.0F, 0.223F, -1.2007F, 2, 3, 1, -0.003F, false));
		cube_r85.cubeList.add(new ModelBox(cube_r85, 227, 451, 1.2F, 0.223F, -1.2007F, 3, 3, 1, -0.002F, false));

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
		handguard.cubeList.add(new ModelBox(handguard, 405, 354, -2.4167F, -0.4555F, 2.0527F, 5, 2, 5, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 408, 443, -2.2167F, -0.4555F, -0.9473F, 4, 2, 3, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 451, 210, 1.3833F, -0.4555F, -0.9473F, 1, 2, 3, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 364, 410, -2.4167F, -1.4555F, 6.0527F, 5, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 378, 388, 1.3833F, -2.4555F, -20.9473F, 1, 2, 23, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 449, 239, 1.5833F, -2.4555F, 2.0527F, 1, 2, 4, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 382, 328, -2.2167F, -2.4555F, -20.9473F, 1, 2, 23, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 323, 449, -2.4167F, -2.4555F, 2.0527F, 1, 2, 4, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 451, 78, -0.6167F, -0.4555F, -2.9473F, 3, 1, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 350, 461, 1.3833F, -0.9555F, -3.7473F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 320, 461, -2.6167F, -0.9555F, -13.7473F, 1, 1, 1, -0.3F, false));
		handguard.cubeList.add(new ModelBox(handguard, 461, 323, 1.7833F, -0.9555F, -13.7473F, 1, 1, 1, -0.3F, false));
		handguard.cubeList.add(new ModelBox(handguard, 461, 354, 1.8833F, 0.1445F, 3.9527F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 461, 360, 1.8833F, -1.2697F, 3.9527F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 355, 461, 1.8833F, -0.5626F, 4.6598F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 461, 363, 1.8833F, -0.5626F, 3.2456F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 375, 461, -2.7167F, 0.1445F, 3.9527F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 370, 461, -2.7167F, -0.5626F, 3.2456F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 461, 369, -2.7167F, -1.2697F, 3.9527F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 461, 366, -2.7167F, -0.5626F, 4.6598F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 222, 389, 1.3833F, -1.3761F, -11.3255F, 1, 2, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 246, 443, 2.4319F, -1.8898F, -22.9473F, 1, 1, 6, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 231, 443, -3.2652F, -1.8898F, -22.9473F, 1, 1, 6, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 109, 415, -3.1652F, -1.8898F, -35.9473F, 1, 1, 14, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 78, 415, 2.3319F, -1.8898F, -35.9473F, 1, 1, 14, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 378, 450, 2.4319F, -1.8898F, -39.9473F, 1, 1, 4, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 356, 450, -3.2652F, -1.8898F, -39.9473F, 1, 1, 4, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 462, 47, 2.4319F, -1.8898F, -34.6473F, 1, 1, 1, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 461, 329, -3.2652F, -1.8898F, -34.6473F, 1, 1, 1, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 330, 461, -3.2652F, -1.8898F, -32.3473F, 1, 1, 1, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 462, 78, 2.4319F, -1.8898F, -32.3473F, 1, 1, 1, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 461, 332, -3.2652F, -1.8898F, -30.0473F, 1, 1, 1, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 462, 84, 2.4319F, -1.8898F, -30.0473F, 1, 1, 1, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 335, 461, -3.2652F, -1.8898F, -27.7473F, 1, 1, 1, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 462, 90, 2.4319F, -1.8898F, -27.7473F, 1, 1, 1, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 461, 335, -3.2652F, -1.8898F, -25.4473F, 1, 1, 1, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 462, 128, 2.4319F, -1.8898F, -25.4473F, 1, 1, 1, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 398, 289, -2.4167F, -1.1413F, -35.9473F, 5, 1, 14, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 361, 289, -2.4167F, -1.0413F, -39.9473F, 5, 1, 4, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 447, 285, -2.4167F, -1.0413F, -32.3473F, 5, 1, 1, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 427, 410, -2.4167F, -1.0413F, -34.6473F, 5, 1, 1, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 58, 427, -2.4167F, -1.0413F, -30.0473F, 5, 1, 1, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 140, 426, -2.4167F, -1.0413F, -27.7473F, 5, 1, 1, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 413, 324, -2.4167F, -1.0413F, -25.4473F, 5, 1, 1, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 382, 354, -2.4167F, -1.0413F, -22.9473F, 5, 1, 6, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 294, 49, 1.5833F, -4.4555F, -39.9473F, 1, 2, 46, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 294, 0, -2.4167F, -4.4555F, -39.9473F, 1, 2, 46, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.7096F, -4.4555F, 17.0527F);
		handguard.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 294, 146, -0.5F, -0.5F, -57.0F, 1, 1, 46, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.8762F, -4.4555F, 7.0527F);
		handguard.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 294, 98, -0.5F, -0.5F, -47.0F, 1, 1, 46, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(13.997F, 10.5239F, -24.4473F);
		handguard.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.7854F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 462, 125, -0.5F, -16.5F, -1.0F, 1, 1, 1, 0.1F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 462, 87, -0.5F, -16.5F, -3.3F, 1, 1, 1, 0.1F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 462, 81, -0.5F, -16.5F, -5.6F, 1, 1, 1, 0.1F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 462, 75, -0.5F, -16.5F, -7.9F, 1, 1, 1, 0.1F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 462, 72, -0.5F, -16.5F, -10.2F, 1, 1, 1, 0.1F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 367, 450, -0.5F, -16.5F, -15.5F, 1, 1, 4, 0.1F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 216, 443, -0.5F, -16.5F, 1.5F, 1, 1, 6, 0.1F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(2.6833F, -1.9898F, -24.4473F);
		handguard.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 305, 461, -0.5F, -1.5F, -1.0F, 1, 2, 1, 0.1F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 461, 304, -0.5F, -1.5F, -3.3F, 1, 2, 1, 0.1F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 461, 300, -0.5F, -1.5F, -5.6F, 1, 2, 1, 0.1F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 300, 461, -0.5F, -1.5F, -7.9F, 1, 2, 1, 0.1F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 461, 296, -0.5F, -1.5F, -10.2F, 1, 2, 1, 0.1F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 178, 450, -0.5F, -1.5F, -15.5F, 1, 2, 4, 0.1F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 42, 432, -0.5F, -1.5F, 1.5F, 1, 2, 6, 0.1F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(17.9894F, 19.7163F, -24.4473F);
		handguard.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.7854F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 251, 462, -0.5F, -29.5F, -1.0F, 1, 1, 1, 0.1F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 462, 234, -0.5F, -29.5F, -3.3F, 1, 1, 1, 0.1F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 462, 231, -0.5F, -29.5F, -5.6F, 1, 1, 1, 0.1F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 462, 228, -0.5F, -29.5F, -7.9F, 1, 1, 1, 0.1F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 462, 225, -0.5F, -29.5F, -10.2F, 1, 1, 1, 0.1F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 450, 386, -0.5F, -29.5F, -15.5F, 1, 1, 4, 0.1F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 443, 250, -0.5F, -29.5F, 1.5F, 1, 1, 6, 0.1F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(6.6757F, 7.2026F, -24.4473F);
		handguard.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 460, 154, -0.5F, -13.5F, -1.0F, 2, 1, 1, 0.1F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 460, 151, -0.5F, -13.5F, -3.3F, 2, 1, 1, 0.1F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 460, 148, -0.5F, -13.5F, -5.6F, 2, 1, 1, 0.1F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 460, 145, -0.5F, -13.5F, -7.9F, 2, 1, 1, 0.1F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 460, 142, -0.5F, -13.5F, -10.2F, 2, 1, 1, 0.1F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 449, 177, -0.5F, -13.5F, -15.5F, 2, 1, 4, 0.1F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 434, 82, -0.5F, -13.5F, 1.5F, 2, 1, 6, 0.1F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(13.897F, 10.5239F, -45.9473F);
		handguard.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 265, 415, -0.5F, -16.5F, 10.0F, 1, 1, 14, 0.1F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(18.0894F, 19.7163F, -45.9473F);
		handguard.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 296, 415, -0.5F, -29.5F, 10.0F, 1, 1, 14, 0.1F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(6.7757F, 7.2026F, -45.9473F);
		handguard.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.7854F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 415, 414, -0.5F, -13.5F, 10.0F, 1, 1, 14, 0.1F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(2.5833F, -1.9898F, -45.9473F);
		handguard.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.7854F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 195, 416, -0.5F, -0.5F, 10.0F, 1, 1, 14, 0.1F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.2343F, 0.7403F, -4.3913F);
		handguard.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.0873F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 382, 429, 1.15F, -1.5F, -16.5F, 1, 2, 10, 0.001F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 422, 258, -2.45F, -1.5F, -16.5F, 4, 2, 10, 0.001F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 424, 224, -2.45F, -1.5F, -6.5F, 2, 2, 10, 0.001F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 424, 198, -1.05F, -1.5F, -6.5F, 3, 2, 10, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(1.6762F, 0.2534F, -3.6704F);
		handguard.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.4597F, 0.4176F, 0.6863F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 245, 451, -0.5F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(1.8833F, 0.4174F, -2.5644F);
		handguard.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.6109F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 236, 451, -0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.0333F, 0.7414F, -4.3904F);
		handguard.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.0873F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 345, 461, 1.35F, -0.5F, 2.0F, 1, 1, 1, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 462, 219, 1.35F, -0.5F, 2.5F, 1, 1, 1, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(1.6762F, -0.3761F, -10.3255F);
		handguard.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, -0.7854F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 426, 324, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-2.7167F, -0.3404F, 6.1548F);
		handguard.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.7854F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 365, 461, 0.0F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 461, 357, 4.6F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-2.7167F, -1.3404F, 6.1548F);
		handguard.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.7854F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 310, 461, 0.0F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 127, 454, 4.6F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-2.7167F, -1.3404F, 5.1548F);
		handguard.addChild(cube_r18);
		setRotationAngle(cube_r18, -0.7854F, 0.0F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 461, 311, 0.0F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 461, 308, 4.6F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-2.7167F, -0.3404F, 5.1548F);
		handguard.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.7854F, 0.0F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 461, 372, 0.0F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 360, 461, 4.6F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(1.6762F, -0.4555F, -6.9473F);
		handguard.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, 0.7854F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 58, 417, -0.5F, -0.5F, -4.0F, 1, 1, 8, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-3.9167F, -1.3939F, 6.3482F);
		handguard.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.8727F, 0.0F, 0.0F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 181, 460, 1.5F, -1.5F, -0.5F, 1, 2, 1, 0.0F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 108, 460, 5.5F, -1.5F, -0.5F, 1, 2, 1, 0.0F, false));
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