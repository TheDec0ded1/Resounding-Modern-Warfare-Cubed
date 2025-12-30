package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBZ95BBody extends ModelBase {
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
	private final ModelRenderer cube_r87_r1;
	private final ModelRenderer cube_r86_r1;
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
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;
	private final ModelRenderer cube_r34;
	private final ModelRenderer cube_r35;
	private final ModelRenderer cube_r36;
	private final ModelRenderer grip2;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r81_r1;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r82_r1;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r86_r2;
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer bone5;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer bone6;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer bone7;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;

	public QBZ95BBody() {
		textureWidth = 384;
		textureHeight = 384;

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
		trigger2.cubeList.add(new ModelBox(trigger2, 351, 371, 0.0F, -3.4672F, 0.2836F, 1, 3, 1, 0.0F, false));

		cube_r147 = new ModelRenderer(this);
		cube_r147.setRotationPoint(0.0F, 0.0F, 0.0F);
		trigger2.addChild(cube_r147);
		setRotationAngle(cube_r147, -1.2217F, 0.0F, 0.0F);
		cube_r147.cubeList.add(new ModelBox(cube_r147, 374, 234, 0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r148 = new ModelRenderer(this);
		cube_r148.setRotationPoint(0.0F, -0.4056F, 0.5792F);
		trigger2.addChild(cube_r148);
		setRotationAngle(cube_r148, -0.6981F, 0.0F, 0.0F);
		cube_r148.cubeList.add(new ModelBox(cube_r148, 235, 374, 0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		grip = new ModelRenderer(this);
		grip.setRotationPoint(0.5F, -33.6F, -8.4F);
		body.addChild(grip);
		grip.cubeList.add(new ModelBox(grip, 335, 89, -2.9F, 1.5F, 1.7F, 3, 1, 7, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 290, 166, -2.9F, 2.3F, 1.7F, 3, 1, 6, -0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 149, 174, -2.9F, 3.3F, 5.6F, 3, 1, 1, -0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 352, 158, -2.9F, 14.8F, 3.3F, 3, 1, 4, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 347, 297, -4.1F, 3.3F, 5.6F, 2, 1, 1, -0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 310, 347, -4.1F, 2.3F, 1.7F, 2, 1, 6, -0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 342, 264, -4.1F, 1.5F, 1.7F, 2, 1, 7, 0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 365, 185, -2.9F, 1.5F, 1.375F, 3, 1, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 356, 371, -4.1F, 1.5F, 1.375F, 2, 1, 1, 0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 357, 317, -2.898F, 2.1263F, 1.3761F, 3, 1, 1, -0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 371, 28, -4.098F, 2.1263F, 1.3761F, 2, 1, 1, -0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 356, 88, -4.1F, 14.8F, 3.3F, 2, 1, 4, -0.001F, false));

		cube_r80 = new ModelRenderer(this);
		cube_r80.setRotationPoint(-4.1F, 9.65F, 9.0F);
		grip.addChild(cube_r80);
		setRotationAngle(cube_r80, -1.2392F, 0.0F, 0.0F);
		cube_r80.cubeList.add(new ModelBox(cube_r80, 327, 347, 0.0F, 0.0F, -6.0F, 2, 1, 6, -0.003F, false));
		cube_r80.cubeList.add(new ModelBox(cube_r80, 333, 158, 1.2F, 0.0F, -6.0F, 3, 1, 6, -0.001F, false));

		cube_r81 = new ModelRenderer(this);
		cube_r81.setRotationPoint(-4.1F, 9.65F, 9.0F);
		grip.addChild(cube_r81);
		setRotationAngle(cube_r81, -1.4312F, 0.0F, 0.0F);
		cube_r81.cubeList.add(new ModelBox(cube_r81, 266, 351, 0.0F, 0.0F, 0.0F, 2, 1, 5, -0.001F, false));
		cube_r81.cubeList.add(new ModelBox(cube_r81, 344, 347, 1.2F, 0.0F, 0.0F, 3, 1, 5, 0.0F, false));

		cube_r82 = new ModelRenderer(this);
		cube_r82.setRotationPoint(-4.1F, 14.8F, 3.3F);
		grip.addChild(cube_r82);
		setRotationAngle(cube_r82, 0.7854F, 0.0F, 0.0F);
		cube_r82.cubeList.add(new ModelBox(cube_r82, 348, 20, 0.0F, 0.0F, 0.0F, 2, 1, 1, -0.002F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 346, 43, 1.2F, 0.0F, 0.0F, 3, 1, 1, -0.001F, false));

		cube_r83 = new ModelRenderer(this);
		cube_r83.setRotationPoint(-4.1F, 15.8F, 7.3F);
		grip.addChild(cube_r83);
		setRotationAngle(cube_r83, 0.4712F, 0.0F, 0.0F);
		cube_r83.cubeList.add(new ModelBox(cube_r83, 369, 91, 0.0F, -1.0F, 0.0F, 2, 1, 1, -0.002F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 365, 253, 0.0F, -1.0F, 0.7F, 2, 1, 2, -0.003F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 352, 200, 1.2F, -1.0F, 0.0F, 3, 1, 1, -0.001F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 320, 137, 1.2F, -1.0F, 0.7F, 3, 1, 2, -0.002F, false));

		cube_r84 = new ModelRenderer(this);
		cube_r84.setRotationPoint(-4.1F, 3.95F, 6.7F);
		grip.addChild(cube_r84);
		setRotationAngle(cube_r84, -1.3439F, 0.0F, 0.0F);
		cube_r84.cubeList.add(new ModelBox(cube_r84, 289, 322, 0.0F, 0.0F, -2.0F, 2, 5, 13, 0.002F, false));
		cube_r84.cubeList.add(new ModelBox(cube_r84, 299, 231, 1.1F, 0.7F, -3.7F, 2, 5, 5, 0.002F, false));
		cube_r84.cubeList.add(new ModelBox(cube_r84, 256, 365, 1.1F, 9.65F, 0.1F, 2, 4, 1, 0.002F, false));
		cube_r84.cubeList.add(new ModelBox(cube_r84, 256, 305, 1.2F, 0.0F, -2.0F, 3, 5, 13, 0.001F, false));

		cube_r87_r1 = new ModelRenderer(this);
		cube_r87_r1.setRotationPoint(2.1F, 10.7912F, 1.0054F);
		cube_r84.addChild(cube_r87_r1);
		setRotationAngle(cube_r87_r1, 0.0873F, 0.0F, 0.0F);
		cube_r87_r1.cubeList.add(new ModelBox(cube_r87_r1, 80, 315, -1.0F, -5.042F, -0.263F, 2, 8, 1, 0.002F, false));

		cube_r86_r1 = new ModelRenderer(this);
		cube_r86_r1.setRotationPoint(2.1F, 8.1171F, 0.4777F);
		cube_r84.addChild(cube_r86_r1);
		setRotationAngle(cube_r86_r1, -0.1309F, 0.0F, 0.0F);
		cube_r86_r1.cubeList.add(new ModelBox(cube_r86_r1, 126, 228, -1.0F, -2.5F, -0.5F, 2, 8, 1, 0.002F, false));

		cube_r85 = new ModelRenderer(this);
		cube_r85.setRotationPoint(-4.1F, 2.5F, 9.0F);
		grip.addChild(cube_r85);
		setRotationAngle(cube_r85, -0.8378F, 0.0F, 0.0F);
		cube_r85.cubeList.add(new ModelBox(cube_r85, 25, 367, 0.0F, 0.223F, -1.2007F, 2, 3, 1, -0.003F, false));
		cube_r85.cubeList.add(new ModelBox(cube_r85, 363, 109, 1.2F, 0.223F, -1.2007F, 3, 3, 1, -0.002F, false));

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
		handguard.cubeList.add(new ModelBox(handguard, 105, 327, -2.4167F, -0.4555F, -0.9473F, 5, 2, 8, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 225, 174, -2.4167F, -1.4555F, 6.0527F, 5, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 290, 141, 1.5833F, -4.4555F, -13.9473F, 1, 4, 20, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 134, 160, 1.2833F, -4.4555F, -22.9473F, 1, 4, 9, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 331, 355, 1.5833F, -4.4555F, -25.9473F, 1, 4, 4, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 336, 372, 2.0833F, -3.2555F, -22.7473F, 1, 3, 1, -0.2F, false));
		handguard.cubeList.add(new ModelBox(handguard, 214, 352, -1.1238F, -0.7484F, -25.9473F, 3, 1, 4, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 361, 346, -1.7096F, -0.7484F, -25.9473F, 1, 1, 4, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 356, 0, 1.5833F, -4.4555F, -18.9473F, 1, 1, 5, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 376, 31, 1.6833F, -4.5555F, -19.1473F, 1, 1, 1, -0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 376, 34, 1.8833F, -4.7555F, -19.7473F, 1, 1, 1, -0.3F, false));
		handguard.cubeList.add(new ModelBox(handguard, 376, 37, 1.7833F, -4.6555F, -19.4473F, 1, 1, 1, -0.2F, false));
		handguard.cubeList.add(new ModelBox(handguard, 36, 376, 1.9833F, -4.8555F, -19.9473F, 1, 1, 1, -0.4F, false));
		handguard.cubeList.add(new ModelBox(handguard, 366, 375, 1.5833F, -3.4555F, -14.9473F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 158, 0, -2.4167F, -4.4555F, -25.9473F, 1, 4, 32, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 134, 174, -2.9167F, -0.9555F, -13.7473F, 6, 1, 1, -0.3F, false));
		handguard.cubeList.add(new ModelBox(handguard, 374, 237, 1.8833F, 0.1445F, 3.9527F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 374, 249, 1.8833F, -1.2697F, 3.9527F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 374, 240, 1.8833F, -0.5626F, 4.6598F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 374, 252, 1.8833F, -0.5626F, 3.2456F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 284, 374, -2.7167F, 0.1445F, 3.9527F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 274, 374, -2.7167F, -0.5626F, 3.2456F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 269, 374, -2.7167F, -1.2697F, 3.9527F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 374, 258, -2.7167F, -0.5626F, 4.6598F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 305, 351, 1.5833F, -1.3761F, -11.3255F, 1, 2, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 370, 352, 1.5833F, -4.6805F, -25.8473F, 1, 4, 1, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 240, 370, -2.4167F, -4.6805F, -25.8473F, 1, 4, 1, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 376, 52, 1.5833F, -2.0805F, -24.8473F, 1, 1, 1, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 51, 376, -2.4167F, -2.0805F, -24.8473F, 1, 1, 1, 0.1F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.6681F, -4.7805F, 17.1527F);
		handguard.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 376, 43, -0.5F, -0.5F, -43.0F, 1, 1, 1, 0.1F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-1.6681F, -0.5805F, -23.8473F);
		handguard.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, 0.7854F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 46, 376, -0.5F, -0.5F, -2.0F, 1, 1, 1, 0.1F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(1.8348F, -4.7805F, 7.1527F);
		handguard.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, -0.7854F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 376, 46, -0.5F, -0.5F, -33.0F, 1, 1, 1, 0.1F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(1.8348F, -0.5805F, -23.8473F);
		handguard.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, 0.7854F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 376, 49, -0.5F, -0.5F, -2.0F, 1, 1, 1, 0.1F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-1.7096F, -4.4555F, 17.0527F);
		handguard.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, 0.7854F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 67, 160, -0.5F, -0.5F, -43.0F, 1, 1, 32, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(1.8762F, -4.4555F, 7.0527F);
		handguard.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, -0.7854F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 160, -0.5F, -0.5F, -33.0F, 1, 1, 32, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-0.5657F, 0.7403F, -4.3913F);
		handguard.addChild(cube_r21);
		setRotationAngle(cube_r21, -0.0873F, 0.0F, 0.0F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 333, 46, -1.15F, -0.5F, -18.5F, 4, 1, 9, 0.001F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 325, 180, -1.85F, -1.5F, -18.5F, 4, 2, 9, 0.001F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 315, 231, -1.85F, -1.5F, -9.5F, 5, 2, 13, 0.001F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-2.7167F, -0.3404F, 6.1548F);
		handguard.addChild(cube_r22);
		setRotationAngle(cube_r22, -0.7854F, 0.0F, 0.0F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 374, 255, 0.0F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 374, 243, 4.6F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-2.7167F, -1.3404F, 6.1548F);
		handguard.addChild(cube_r23);
		setRotationAngle(cube_r23, -0.7854F, 0.0F, 0.0F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 266, 348, 0.0F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 310, 242, 4.6F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-2.7167F, -1.3404F, 5.1548F);
		handguard.addChild(cube_r24);
		setRotationAngle(cube_r24, -0.7854F, 0.0F, 0.0F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 353, 334, 0.0F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 283, 338, 4.6F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-2.7167F, -0.3404F, 5.1548F);
		handguard.addChild(cube_r25);
		setRotationAngle(cube_r25, -0.7854F, 0.0F, 0.0F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 279, 374, 0.0F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 374, 246, 4.6F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(1.8762F, -3.4555F, -17.4473F);
		handguard.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, 0.7854F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 365, 164, -0.5F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(1.8762F, -2.4555F, -21.9473F);
		handguard.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, -0.7854F, 0.0F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 200, 370, -0.5F, -2.0F, -0.5F, 1, 4, 1, 0.0F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-1.7096F, -0.4555F, -23.9473F);
		handguard.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, 0.0F, 0.7854F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 342, 361, -0.5F, -0.5F, -2.0F, 1, 1, 4, 0.0F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(1.8762F, -0.4555F, -23.9473F);
		handguard.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.0F, 0.0F, 0.7854F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 361, 263, -0.5F, -0.5F, -2.0F, 1, 1, 4, 0.0F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(2.1055F, -4.8978F, -22.6631F);
		handguard.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.1555F, 0.1536F, -0.7734F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 374, 127, -0.5F, -1.0F, -0.5F, 1, 2, 1, -0.2F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(2.5833F, -4.7479F, -22.6298F);
		handguard.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.2182F, 0.0F, 0.0F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 374, 120, -0.5F, 0.0F, -0.5F, 1, 2, 1, -0.2F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(2.0853F, -1.7636F, -14.4194F);
		handguard.addChild(cube_r32);
		setRotationAngle(cube_r32, -0.8727F, 0.0F, 0.0F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 371, 375, -0.5F, 0.0F, -3.2F, 1, 1, 1, 0.0F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 158, 365, -0.5F, -1.0F, -2.2F, 1, 1, 3, 0.0F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 356, 32, -0.5F, 0.0F, -3.0F, 1, 1, 5, 0.0F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(1.8762F, -3.8385F, -19.2687F);
		handguard.addChild(cube_r33);
		setRotationAngle(cube_r33, -0.7002F, 0.5724F, 0.5713F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 41, 376, -0.5F, -0.5F, -0.8F, 1, 1, 1, 0.0F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 376, 40, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(0.4833F, -4.1635F, -14.0587F);
		handguard.addChild(cube_r34);
		setRotationAngle(cube_r34, -0.8727F, 0.0F, 0.0F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 270, 366, 0.5F, 3.6F, -4.2F, 2, 1, 2, -0.4F, false));

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(1.8782F, -1.5038F, -15.5068F);
		handguard.addChild(cube_r35);
		setRotationAngle(cube_r35, -0.7002F, 0.5724F, 0.5713F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 356, 7, -0.5F, -0.5F, -3.2F, 1, 1, 5, 0.0F, false));

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(-3.9167F, -1.3939F, 6.3482F);
		handguard.addChild(cube_r36);
		setRotationAngle(cube_r36, 0.8727F, 0.0F, 0.0F);
		cube_r36.cubeList.add(new ModelBox(cube_r36, 374, 0, 1.5F, -1.5F, -0.5F, 1, 2, 1, 0.0F, false));
		cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 374, 5.5F, -1.5F, -0.5F, 1, 2, 1, 0.0F, false));

		grip2 = new ModelRenderer(this);
		grip2.setRotationPoint(0.5F, -34.8F, -22.9F);
		body.addChild(grip2);
		grip2.cubeList.add(new ModelBox(grip2, 227, 100, -3.9F, 1.5F, 3.7F, 4, 1, 5, 0.0F, false));
		grip2.cubeList.add(new ModelBox(grip2, 348, 211, -3.9F, 2.3F, 3.7F, 4, 1, 4, -0.001F, false));
		grip2.cubeList.add(new ModelBox(grip2, 336, 297, -3.9F, 3.3F, 5.6F, 4, 1, 1, -0.001F, false));
		grip2.cubeList.add(new ModelBox(grip2, 355, 306, -3.899F, 12.8915F, 3.8267F, 4, 1, 3, 0.0F, false));
		grip2.cubeList.add(new ModelBox(grip2, 355, 301, -3.902F, 1.4998F, 2.5535F, 4, 1, 3, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-4.1F, 9.65F, 9.0F);
		grip2.addChild(cube_r2);
		setRotationAngle(cube_r2, -1.2392F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 265, 100, 0.2F, 0.0F, -6.0F, 4, 1, 5, -0.001F, false));

		cube_r81_r1 = new ModelRenderer(this);
		cube_r81_r1.setRotationPoint(2.2005F, 3.6168F, -3.5964F);
		cube_r2.addChild(cube_r81_r1);
		setRotationAngle(cube_r81_r1, 0.3578F, 0.0F, 3.1416F);
		cube_r81_r1.cubeList.add(new ModelBox(cube_r81_r1, 246, 100, -1.9995F, -0.6867F, -4.6834F, 4, 1, 5, -0.001F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-4.1F, 9.65F, 9.0F);
		grip2.addChild(cube_r3);
		setRotationAngle(cube_r3, -1.4312F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 350, 174, 0.199F, 0.192F, -0.9824F, 4, 1, 4, 0.0F, false));

		cube_r82_r1 = new ModelRenderer(this);
		cube_r82_r1.setRotationPoint(2.2005F, 4.2366F, -2.8401F);
		cube_r3.addChild(cube_r82_r1);
		setRotationAngle(cube_r82_r1, -0.0262F, 0.0F, -3.1416F);
		cube_r82_r1.cubeList.add(new ModelBox(cube_r82_r1, 350, 217, -2.0005F, -0.7333F, 0.1789F, 4, 1, 4, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-4.1F, 14.8F, 3.3F);
		grip2.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.7854F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 337, 20, 0.202F, -0.9781F, 1.7209F, 4, 1, 1, -0.001F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-4.1F, 15.8F, 7.3F);
		grip2.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.4712F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 272, 338, 0.201F, -2.9154F, 0.4446F, 4, 1, 1, -0.001F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 307, 137, 0.201F, -2.9154F, 1.1446F, 4, 1, 2, -0.002F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-4.1F, 3.95F, 6.7F);
		grip2.addChild(cube_r6);
		setRotationAngle(cube_r6, -1.3439F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 315, 264, 0.2F, 0.0F, -2.0F, 4, 3, 9, 0.001F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 356, 0.2F, 0.0F, 7.0F, 4, 4, 2, 0.001F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-4.1F, 2.5F, 9.0F);
		grip2.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.8378F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 363, 94, 0.2F, 0.2229F, -1.2007F, 4, 3, 1, -0.002F, false));

		cube_r86_r2 = new ModelRenderer(this);
		cube_r86_r2.setRotationPoint(2.2F, 2.5597F, -1.6775F);
		cube_r7.addChild(cube_r86_r2);
		setRotationAngle(cube_r86_r2, 1.466F, 0.0F, -3.1416F);
		cube_r86_r2.cubeList.add(new ModelBox(cube_r86_r2, 363, 99, -2.0F, -2.8569F, 0.9451F, 4, 3, 1, -0.002F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-2.0F, -3.7F, 11.0F);
		grip2.addChild(bone4);
		

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone4.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.4363F);
		

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone4.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 0.4363F);
		

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-2.0F, -0.3F, 11.0F);
		grip2.addChild(bone5);
		

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 0.4363F);
		

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.4363F);
		

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-3.7F, -2.0F, 11.0F);
		grip2.addChild(bone6);
		

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone6.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -0.4363F);
		

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone6.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, 0.4363F);
		

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-0.3F, -2.0F, 11.0F);
		grip2.addChild(bone7);
		

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone7.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, 0.4363F);
		

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone7.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, -0.4363F);
		
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