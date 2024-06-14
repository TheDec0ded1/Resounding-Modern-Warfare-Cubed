package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBZ95Body extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer trigger;
	private final ModelRenderer triggermagrelease2;
	private final ModelRenderer trigger2;
	private final ModelRenderer cube_r147;
	private final ModelRenderer cube_r148;
	private final ModelRenderer grip;
	private final ModelRenderer kulatac_milspec_stock_r1;
	private final ModelRenderer cube_r80;
	private final ModelRenderer cube_r81;
	private final ModelRenderer cube_r82;
	private final ModelRenderer cube_r83;
	private final ModelRenderer cube_r84;
	private final ModelRenderer cube_r87_r1;
	private final ModelRenderer cube_r86_r1;
	private final ModelRenderer cube_r86_r2;
	private final ModelRenderer cube_r85;
	private final ModelRenderer cube_r86_r3;
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
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;

	public QBZ95Body() {
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
		trigger2.cubeList.add(new ModelBox(trigger2, 69, 67, 0.0F, -3.4672F, 0.2836F, 1, 3, 1, 0.0F, false));

		cube_r147 = new ModelRenderer(this);
		cube_r147.setRotationPoint(0.0F, 0.0F, 0.0F);
		trigger2.addChild(cube_r147);
		setRotationAngle(cube_r147, -1.2217F, 0.0F, 0.0F);
		cube_r147.cubeList.add(new ModelBox(cube_r147, 165, 158, 0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r148 = new ModelRenderer(this);
		cube_r148.setRotationPoint(0.0F, -0.4056F, 0.5792F);
		trigger2.addChild(cube_r148);
		setRotationAngle(cube_r148, -0.6981F, 0.0F, 0.0F);
		cube_r148.cubeList.add(new ModelBox(cube_r148, 165, 115, 0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		grip = new ModelRenderer(this);
		grip.setRotationPoint(0.5F, -33.6F, -8.4F);
		body.addChild(grip);
		grip.cubeList.add(new ModelBox(grip, 0, 65, -2.9F, 1.5F, 1.7F, 3, 1, 7, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 24, 67, -2.9F, 2.3F, 1.7F, 3, 1, 6, -0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 119, 153, -2.9F, 3.3F, 5.6F, 3, 1, 1, -0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 37, 67, -2.9F, 14.8F, 3.3F, 3, 1, 4, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 165, 57, -4.1F, 3.3F, 5.6F, 2, 1, 1, -0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 110, 88, -4.1F, 2.3F, 1.7F, 2, 1, 6, -0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 83, 33, -4.1F, 1.5F, 1.7F, 2, 1, 7, 0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 150, 38, -2.9F, 1.5F, 1.375F, 3, 1, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 137, 153, -4.1F, 1.5F, 1.375F, 2, 1, 1, 0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 128, 153, -2.898F, 2.1263F, 1.376F, 3, 1, 1, -0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 165, 60, -4.098F, 2.1263F, 1.376F, 2, 1, 1, -0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 26, 100, -4.1F, 14.8F, 3.3F, 2, 1, 4, -0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 0, 100, -4.002F, 9.1254F, -11.4324F, 4, 1, 3, -0.001F, false));

		kulatac_milspec_stock_r1 = new ModelRenderer(this);
		kulatac_milspec_stock_r1.setRotationPoint(-2.0F, 0.766F, -11.5747F);
		grip.addChild(kulatac_milspec_stock_r1);
		setRotationAngle(kulatac_milspec_stock_r1, -3.1416F, 0.0F, 3.1416F);
		kulatac_milspec_stock_r1.cubeList.add(new ModelBox(kulatac_milspec_stock_r1, 79, 14, -2.0F, -0.266F, -3.5253F, 4, 1, 5, -0.001F, false));

		cube_r80 = new ModelRenderer(this);
		cube_r80.setRotationPoint(-4.1F, 9.65F, 9.0F);
		grip.addChild(cube_r80);
		setRotationAngle(cube_r80, -1.2392F, 0.0F, 0.0F);
		cube_r80.cubeList.add(new ModelBox(cube_r80, 0, 88, 0.0F, 0.0F, -6.0F, 2, 1, 6, -0.003F, false));
		cube_r80.cubeList.add(new ModelBox(cube_r80, 74, 44, 0.1F, 13.4078F, -13.5201F, 4, 1, 5, -0.003F, false));
		cube_r80.cubeList.add(new ModelBox(cube_r80, 55, 44, 1.2F, 0.0F, -6.0F, 3, 1, 6, -0.001F, false));

		cube_r81 = new ModelRenderer(this);
		cube_r81.setRotationPoint(-4.1F, 9.65F, 9.0F);
		grip.addChild(cube_r81);
		setRotationAngle(cube_r81, -1.4312F, 0.0F, 0.0F);
		cube_r81.cubeList.add(new ModelBox(cube_r81, 144, 56, 0.0F, 0.0F, 0.0F, 2, 1, 5, -0.001F, false));
		cube_r81.cubeList.add(new ModelBox(cube_r81, 78, 70, 0.098F, 14.7897F, -5.8084F, 4, 1, 3, -0.001F, false));
		cube_r81.cubeList.add(new ModelBox(cube_r81, 23, 120, 1.2F, 0.0F, 0.0F, 3, 1, 5, 0.0F, false));

		cube_r82 = new ModelRenderer(this);
		cube_r82.setRotationPoint(-4.1F, 14.8F, 3.3F);
		grip.addChild(cube_r82);
		setRotationAngle(cube_r82, 0.7854F, 0.0F, 0.0F);
		cube_r82.cubeList.add(new ModelBox(cube_r82, 165, 54, 0.0F, 0.0F, 0.0F, 2, 1, 1, -0.002F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 92, 145, 0.099F, -14.4305F, -6.4068F, 4, 1, 1, -0.002F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 110, 153, 1.2F, 0.0F, 0.0F, 3, 1, 1, -0.001F, false));

		cube_r83 = new ModelRenderer(this);
		cube_r83.setRotationPoint(-4.1F, 15.8F, 7.3F);
		grip.addChild(cube_r83);
		setRotationAngle(cube_r83, 0.4712F, 0.0F, 0.0F);
		cube_r83.cubeList.add(new ModelBox(cube_r83, 154, 97, 0.0F, -1.0F, 0.0F, 2, 1, 1, -0.002F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 128, 158, 0.0F, -1.0F, 0.7F, 2, 1, 2, -0.003F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 37, 144, 0.098F, -13.198F, -11.4419F, 4, 1, 1, -0.002F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 39, 102, 0.098F, -20.698F, -7.7419F, 4, 1, 2, -0.002F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 55, 102, 0.098F, -13.198F, -10.7419F, 4, 1, 2, -0.003F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 151, 83, 1.2F, -1.0F, 0.0F, 3, 1, 1, -0.001F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 141, 142, 1.2F, -1.0F, 0.7F, 3, 1, 2, -0.002F, false));

		cube_r84 = new ModelRenderer(this);
		cube_r84.setRotationPoint(-4.1F, 3.95F, 6.7F);
		grip.addChild(cube_r84);
		setRotationAngle(cube_r84, -1.3439F, 0.0F, 0.0F);
		cube_r84.cubeList.add(new ModelBox(cube_r84, 159, 108, 0.0F, 0.0F, -2.0F, 2, 5, 13, 0.002F, false));
		cube_r84.cubeList.add(new ModelBox(cube_r84, 25, 0, 0.1F, 14.0157F, -7.0832F, 4, 4, 9, 0.002F, false));
		cube_r84.cubeList.add(new ModelBox(cube_r84, 36, 131, 1.1F, 0.7F, -3.7F, 2, 5, 5, 0.002F, false));
		cube_r84.cubeList.add(new ModelBox(cube_r84, 233, 154, 1.2F, 0.0F, -2.0F, 3, 5, 13, 0.001F, false));

		cube_r87_r1 = new ModelRenderer(this);
		cube_r87_r1.setRotationPoint(2.1F, 10.7912F, 1.0054F);
		cube_r84.addChild(cube_r87_r1);
		setRotationAngle(cube_r87_r1, 0.0873F, 0.0F, 0.0F);
		cube_r87_r1.cubeList.add(new ModelBox(cube_r87_r1, 24, 54, -1.0F, -5.042F, -0.263F, 2, 8, 1, 0.002F, false));

		cube_r86_r1 = new ModelRenderer(this);
		cube_r86_r1.setRotationPoint(2.1F, 8.1171F, 0.4777F);
		cube_r84.addChild(cube_r86_r1);
		setRotationAngle(cube_r86_r1, -0.1309F, 0.0F, 0.0F);
		cube_r86_r1.cubeList.add(new ModelBox(cube_r86_r1, 22, 131, -1.0F, -2.5F, -0.5F, 2, 8, 1, 0.002F, false));

		cube_r86_r2 = new ModelRenderer(this);
		cube_r86_r2.setRotationPoint(2.1F, 10.5986F, 0.7913F);
		cube_r84.addChild(cube_r86_r2);
		setRotationAngle(cube_r86_r2, 0.0F, 0.0F, 0.0F);
		cube_r86_r2.cubeList.add(new ModelBox(cube_r86_r2, 83, 33, -1.0F, -0.9486F, -0.6913F, 2, 4, 1, 0.002F, false));

		cube_r85 = new ModelRenderer(this);
		cube_r85.setRotationPoint(-4.1F, 2.5F, 9.0F);
		grip.addChild(cube_r85);
		setRotationAngle(cube_r85, -0.8378F, 0.0F, 0.0F);
		cube_r85.cubeList.add(new ModelBox(cube_r85, 0, 131, 0.0F, 0.223F, -1.2007F, 2, 3, 1, -0.003F, false));
		cube_r85.cubeList.add(new ModelBox(cube_r85, 159, 110, 1.2F, 0.223F, -1.2007F, 3, 3, 1, -0.002F, false));

		cube_r86_r3 = new ModelRenderer(this);
		cube_r86_r3.setRotationPoint(2.1F, 16.3006F, -15.9326F);
		cube_r85.addChild(cube_r86_r3);
		setRotationAngle(cube_r86_r3, 1.466F, 0.0F, -3.1416F);
		cube_r86_r3.cubeList.add(new ModelBox(cube_r86_r3, 68, 44, -2.0F, -0.7836F, -1.4598F, 4, 3, 1, -0.003F, false));

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
		handguard.cubeList.add(new ModelBox(handguard, 55, 23, -1.9167F, -0.3488F, -39.8732F, 4, 1, 19, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 78, 93, -1.9167F, 0.2512F, -39.8732F, 4, 1, 3, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 132, 78, -2.4167F, -0.4555F, -0.9473F, 5, 2, 8, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 136, 102, -2.4167F, -1.4555F, 6.0527F, 5, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 105, 164, 1.5833F, -4.4555F, -20.9473F, 1, 4, 27, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 219, 217, -2.4167F, -4.4555F, -20.9473F, 1, 4, 27, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 141, 120, -0.4167F, -0.4555F, -2.9473F, 3, 1, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 45, 166, 1.5833F, -0.9555F, -3.7473F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 35, 91, -2.9167F, -0.9555F, -13.7473F, 6, 1, 1, -0.3F, false));
		handguard.cubeList.add(new ModelBox(handguard, 165, 94, 1.8833F, 0.1445F, 3.9527F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 165, 75, 1.8833F, -1.2697F, 3.9527F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 165, 91, 1.8833F, -0.5626F, 4.6598F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 165, 69, 1.8833F, -0.5626F, 3.2456F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 31, 25, -2.7167F, 0.1445F, 3.9527F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 93, 96, -2.7167F, -0.5626F, 3.2456F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 101, 132, -2.7167F, -1.2697F, 3.9527F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 47, 142, -2.7167F, -0.5626F, 4.6598F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 144, 70, 1.5833F, -1.3761F, -11.3255F, 1, 2, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.7096F, -4.4555F, 17.0527F);
		handguard.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 110, 110, -0.5F, -0.5F, -57.0F, 1, 1, 46, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.8762F, -4.4555F, 7.0527F);
		handguard.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 116, 158, -0.5F, -0.5F, -47.0F, 1, 1, 46, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-0.5657F, 0.7403F, -4.3913F);
		handguard.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.0873F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 159, 127, -1.85F, -1.5F, -16.5F, 5, 2, 10, 0.001F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 133, 0, -1.85F, -1.5F, -6.5F, 2, 2, 10, 0.001F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 24, 54, -0.25F, -1.5F, -6.5F, 3, 2, 10, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(1.8762F, 0.2534F, -3.6703F);
		handguard.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.4597F, 0.4176F, 0.6863F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 27, 155, -0.5F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(2.0833F, 0.4174F, -2.5644F);
		handguard.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.6109F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 36, 155, -0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.2333F, 0.7414F, -4.3904F);
		handguard.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.0873F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 165, 97, 1.35F, -0.5F, 2.0F, 1, 1, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 165, 100, 1.35F, -0.5F, 2.5F, 1, 1, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(1.8762F, -0.3761F, -10.3255F);
		handguard.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, -0.7854F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 144, 66, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-2.7167F, -0.3404F, 6.1548F);
		handguard.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.7854F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 102, 143, 0.0F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 165, 88, 4.6F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-2.7167F, -1.3404F, 6.1548F);
		handguard.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.7854F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 133, 46, 0.0F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 165, 78, 4.6F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-2.7167F, -1.3404F, 5.1548F);
		handguard.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.7854F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 120, 100, 0.0F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 165, 72, 4.6F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-2.7167F, -0.3404F, 5.1548F);
		handguard.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.7854F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 38, 94, 0.0F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 165, 81, 4.6F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(1.8762F, -0.4555F, -6.9473F);
		handguard.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, 0.7854F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 110, 132, -0.5F, -0.5F, -4.0F, 1, 1, 8, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-3.9167F, -1.3939F, 6.3483F);
		handguard.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.8727F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 144, 56, 1.5F, -1.5F, -0.5F, 1, 2, 1, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 148, 0, 5.5F, -1.5F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(5.022F, -3.7776F, -44.8732F);
		handguard.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -0.6981F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 152, 25, -3.0F, -1.0F, 5.0F, 1, 1, 3, 0.1F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-1.0251F, -0.5636F, -44.8732F);
		handguard.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, 0.6981F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 152, 20, -3.0F, -1.0F, 5.0F, 1, 1, 3, 0.1F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(5.7066F, -0.5532F, -44.8732F);
		handguard.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, -0.0873F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 121, 56, -3.0F, -2.0F, 5.0F, 1, 2, 3, 0.1F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-0.559F, -0.1175F, -44.8732F);
		handguard.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, 0.0873F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 121, 33, -3.0F, -2.0F, 5.0F, 1, 2, 3, 0.1F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(3.0029F, -0.0684F, -44.8732F);
		handguard.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, -1.0472F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 82, 154, -0.5F, -0.5F, 5.0F, 1, 1, 3, 0.1F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-2.9278F, -0.4099F, -44.8732F);
		handguard.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, 1.0472F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 73, 154, -0.1585F, -0.4085F, 5.0F, 1, 1, 3, 0.1F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-2.2363F, 0.5316F, -44.8732F);
		handguard.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, -1.0472F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 64, 154, -0.5F, -0.5F, 5.0F, 1, 1, 3, 0.1F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(2.4029F, 0.5316F, -44.8732F);
		handguard.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, 1.0472F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 55, 154, -0.5F, -0.5F, 5.0F, 1, 1, 3, 0.1F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(2.7663F, -0.5318F, -27.8732F);
		handguard.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, -1.0472F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 196, 230, -0.5F, -0.5F, -12.0F, 1, 1, 19, 0.0F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-2.0997F, -0.0318F, -27.8732F);
		handguard.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, -1.0472F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 233, 0, -0.5F, -0.5F, -12.0F, 1, 1, 19, 0.0F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-2.6912F, -0.8733F, -27.8732F);
		handguard.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, 1.0472F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 39, 232, -0.1585F, -0.4085F, -12.0F, 1, 1, 19, 0.0F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(2.2663F, -0.0318F, -27.8732F);
		handguard.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.0F, 1.0472F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 233, 32, -0.5F, -0.5F, -12.0F, 1, 1, 19, 0.0F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(5.4417F, -0.8891F, -27.8732F);
		handguard.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, -0.0873F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 110, 78, -3.0F, -2.0F, -12.0F, 1, 2, 19, 0.0F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(-0.2941F, -0.4533F, -27.8732F);
		handguard.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, 0.0F, 0.0873F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 110, 110, -3.0F, -2.0F, -12.0F, 1, 2, 19, 0.0F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-2.2965F, -3.4759F, -31.4482F);
		handguard.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, 0.0F, 0.3491F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 46, 131, -0.5F, -1.0F, -8.5F, 1, 2, 1, 0.0F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 55, 132, -0.5F, -1.0F, -8.425F, 1, 2, 19, 0.0F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(3.179F, -1.7767F, -29.9482F);
		handguard.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.0F, 0.0F, -0.3491F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 36, 131, -0.5915F, -2.8415F, -10.0F, 1, 2, 1, 0.0F, false));
		cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 131, -0.5915F, -2.8415F, -9.925F, 1, 2, 19, 0.0F, false));
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