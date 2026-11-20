package com.paneedah.mwc.models;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBZ97Body extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer handguard_r1;
	private final ModelRenderer handguard_r2;
	private final ModelRenderer handguard_r3;
	private final ModelRenderer grip;
	private final ModelRenderer cube_r80;
	private final ModelRenderer cube_r81;
	private final ModelRenderer cube_r82;
	private final ModelRenderer cube_r83;
	private final ModelRenderer cube_r84;
	private final ModelRenderer cube_r88_r1;
	private final ModelRenderer cube_r90_r1;
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
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;

	public QBZ97Body() {
		textureWidth = 368;
		textureHeight = 368;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 2.0F);
		body.cubeList.add(new ModelBox(body, 283, 358, -2.0F, -31.1F, -10.5F, 1, 1, 1, 0.0F, false));

		handguard_r1 = new ModelRenderer(this);
		handguard_r1.setRotationPoint(-1.5F, -29.3731F, -10.7746F);
		body.addChild(handguard_r1);
		setRotationAngle(handguard_r1, -0.9163F, 0.0F, 0.0F);
		handguard_r1.cubeList.add(new ModelBox(handguard_r1, 288, 358, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		handguard_r2 = new ModelRenderer(this);
		handguard_r2.setRotationPoint(-1.5F, -29.9772F, -10.1964F);
		body.addChild(handguard_r2);
		setRotationAngle(handguard_r2, -0.6109F, 0.0F, 0.0F);
		handguard_r2.cubeList.add(new ModelBox(handguard_r2, 278, 358, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		handguard_r3 = new ModelRenderer(this);
		handguard_r3.setRotationPoint(-1.5F, -31.5056F, -10.0792F);
		body.addChild(handguard_r3);
		setRotationAngle(handguard_r3, 0.1745F, 0.0F, 0.0F);
		handguard_r3.cubeList.add(new ModelBox(handguard_r3, 127, 354, -0.5F, -1.5F, -0.5F, 1, 2, 1, 0.0F, false));

		grip = new ModelRenderer(this);
		grip.setRotationPoint(0.5F, -33.6F, -8.4F);
		body.addChild(grip);
		grip.cubeList.add(new ModelBox(grip, 309, 119, -2.9F, 1.5F, 1.7F, 3, 1, 7, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 89, 339, -2.9F, 2.3F, 1.7F, 3, 1, 6, -0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 190, 353, -2.9F, 3.3F, 5.6F, 3, 1, 1, -0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 295, 273, -2.9F, 14.8F, 3.3F, 3, 1, 4, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 202, 302, -4.1F, 3.3F, 5.6F, 2, 1, 1, -0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 175, 340, -4.1F, 2.3F, 1.7F, 2, 1, 6, -0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 330, 119, -4.1F, 1.5F, 1.7F, 2, 1, 7, 0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 259, 353, -2.9F, 1.5F, 1.375F, 3, 1, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 355, 292, -4.1F, 1.5F, 1.375F, 2, 1, 1, 0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 224, 353, -2.898F, 2.1263F, 1.3761F, 3, 1, 1, -0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 355, 289, -4.098F, 2.1263F, 1.3761F, 2, 1, 1, -0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 346, 225, -4.1F, 14.8F, 3.3F, 2, 1, 4, -0.001F, false));

		cube_r80 = new ModelRenderer(this);
		cube_r80.setRotationPoint(-4.1F, 9.65F, 9.0F);
		grip.addChild(cube_r80);
		setRotationAngle(cube_r80, -1.2392F, 0.0F, 0.0F);
		cube_r80.cubeList.add(new ModelBox(cube_r80, 192, 340, 0.0F, 0.0F, -6.0F, 2, 1, 6, -0.003F, false));
		cube_r80.cubeList.add(new ModelBox(cube_r80, 0, 340, 1.2F, 0.0F, -6.0F, 3, 1, 6, -0.001F, false));

		cube_r81 = new ModelRenderer(this);
		cube_r81.setRotationPoint(-4.1F, 9.65F, 9.0F);
		grip.addChild(cube_r81);
		setRotationAngle(cube_r81, -1.4312F, 0.0F, 0.0F);
		cube_r81.cubeList.add(new ModelBox(cube_r81, 341, 88, 0.0F, 0.0F, 0.0F, 2, 1, 5, -0.001F, false));
		cube_r81.cubeList.add(new ModelBox(cube_r81, 239, 340, 1.2F, 0.0F, 0.0F, 3, 1, 5, 0.0F, false));

		cube_r82 = new ModelRenderer(this);
		cube_r82.setRotationPoint(-4.1F, 14.8F, 3.3F);
		grip.addChild(cube_r82);
		setRotationAngle(cube_r82, 0.7854F, 0.0F, 0.0F);
		cube_r82.cubeList.add(new ModelBox(cube_r82, 229, 302, 0.0F, 0.0F, 0.0F, 2, 1, 1, -0.002F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 199, 353, 1.2F, 0.0F, 0.0F, 3, 1, 1, -0.001F, false));

		cube_r83 = new ModelRenderer(this);
		cube_r83.setRotationPoint(-4.1F, 15.8F, 7.3F);
		grip.addChild(cube_r83);
		setRotationAngle(cube_r83, 0.4712F, 0.0F, 0.0F);
		cube_r83.cubeList.add(new ModelBox(cube_r83, 354, 351, 0.0F, -1.0F, 0.0F, 2, 1, 1, -0.002F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 132, 352, 0.0F, -1.0F, 0.7F, 2, 1, 2, -0.003F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 208, 353, 1.2F, -1.0F, 0.0F, 3, 1, 1, -0.001F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 348, 114, 1.2F, -1.0F, 0.7F, 3, 1, 2, -0.002F, false));

		cube_r84 = new ModelRenderer(this);
		cube_r84.setRotationPoint(-4.1F, 3.95F, 6.7F);
		grip.addChild(cube_r84);
		setRotationAngle(cube_r84, -1.3439F, 0.0F, 0.0F);
		cube_r84.cubeList.add(new ModelBox(cube_r84, 284, 323, 0.0F, 0.0F, -2.0F, 2, 5, 13, 0.002F, false));
		cube_r84.cubeList.add(new ModelBox(cube_r84, 108, 339, 1.1F, 0.7F, -3.7F, 2, 5, 5, 0.002F, false));
		cube_r84.cubeList.add(new ModelBox(cube_r84, 353, 317, 1.1F, 5.7F, 0.3F, 2, 3, 1, 0.002F, false));
		cube_r84.cubeList.add(new ModelBox(cube_r84, 125, 306, 1.2F, 0.0F, -2.0F, 3, 5, 13, 0.001F, false));

		cube_r88_r1 = new ModelRenderer(this);
		cube_r88_r1.setRotationPoint(2.1F, 12.7261F, -0.6794F);
		cube_r84.addChild(cube_r88_r1);
		setRotationAngle(cube_r88_r1, -1.0036F, 0.0F, 0.0F);
		cube_r88_r1.cubeList.add(new ModelBox(cube_r88_r1, 310, 355, -1.0F, 0.4265F, 0.9018F, 2, 1, 1, 0.002F, false));

		cube_r90_r1 = new ModelRenderer(this);
		cube_r90_r1.setRotationPoint(2.1F, 10.1162F, -0.6498F);
		cube_r84.addChild(cube_r90_r1);
		setRotationAngle(cube_r90_r1, 0.6545F, 0.0F, 0.0F);
		cube_r90_r1.cubeList.add(new ModelBox(cube_r90_r1, 303, 355, -1.0F, -1.0094F, -6.9807F, 2, 1, 1, 0.002F, false));
		cube_r90_r1.cubeList.add(new ModelBox(cube_r90_r1, 235, 352, -1.0F, -0.2054F, -8.4843F, 2, 1, 2, 0.002F, false));

		cube_r88_r2 = new ModelRenderer(this);
		cube_r88_r2.setRotationPoint(2.1F, 10.1162F, -0.6498F);
		cube_r84.addChild(cube_r88_r2);
		setRotationAngle(cube_r88_r2, -0.0873F, 0.0F, 0.0F);
		cube_r88_r2.cubeList.add(new ModelBox(cube_r88_r2, 340, 235, -1.0F, 3.9805F, -5.7783F, 2, 1, 6, 0.002F, false));

		cube_r87_r1 = new ModelRenderer(this);
		cube_r87_r1.setRotationPoint(2.1F, 9.5716F, 0.595F);
		cube_r84.addChild(cube_r87_r1);
		setRotationAngle(cube_r87_r1, -0.2182F, 0.0F, 0.0F);
		cube_r87_r1.cubeList.add(new ModelBox(cube_r87_r1, 183, 348, -1.0F, -1.0F, -0.5F, 2, 6, 1, 0.002F, false));

		cube_r85 = new ModelRenderer(this);
		cube_r85.setRotationPoint(-4.1F, 2.5F, 9.0F);
		grip.addChild(cube_r85);
		setRotationAngle(cube_r85, -0.8378F, 0.0F, 0.0F);
		cube_r85.cubeList.add(new ModelBox(cube_r85, 217, 353, 0.0F, 0.223F, -1.2007F, 2, 3, 1, -0.003F, false));
		cube_r85.cubeList.add(new ModelBox(cube_r85, 208, 348, 1.2F, 0.223F, -1.2007F, 3, 3, 1, -0.002F, false));

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
		handguard.cubeList.add(new ModelBox(handguard, 289, 279, -1.9167F, -0.3488F, -39.8732F, 4, 1, 19, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 310, 273, -1.9167F, 0.2512F, -39.8732F, 4, 1, 3, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 70, 328, -2.4167F, -0.4555F, -0.9473F, 5, 2, 8, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 346, 334, -2.4167F, -1.4555F, 6.0527F, 5, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 179, 248, 1.5833F, -4.4555F, -20.9473F, 1, 4, 27, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 122, 248, -2.4167F, -4.4555F, -20.9473F, 1, 4, 27, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 132, 348, -0.4167F, -0.4555F, -2.9473F, 3, 1, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 357, 237, 1.5833F, -0.9555F, -3.7473F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 346, 231, -2.9167F, -0.9555F, -13.7473F, 6, 1, 1, -0.3F, false));
		handguard.cubeList.add(new ModelBox(handguard, 357, 240, 1.8833F, 0.1445F, 3.9527F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 357, 302, 1.8833F, -1.2697F, 3.9527F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 357, 243, 1.8833F, -0.5626F, 4.6598F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 357, 305, 1.8833F, -0.5626F, 3.2456F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 53, 358, -2.7167F, 0.1445F, 3.9527F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 357, 354, -2.7167F, -0.5626F, 3.2456F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 357, 325, -2.7167F, -1.2697F, 3.9527F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 357, 322, -2.7167F, -0.5626F, 4.6598F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 317, 355, 1.5833F, -1.3761F, -11.3255F, 1, 2, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.7096F, -4.4555F, 17.0527F);
		handguard.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 246, 48, -0.5F, -0.5F, -57.0F, 1, 1, 46, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.8762F, -4.4555F, 7.0527F);
		handguard.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 246, 0, -0.5F, -0.5F, -47.0F, 1, 1, 46, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-0.5657F, 0.7403F, -4.3913F);
		handguard.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.0873F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 125, 325, -1.85F, -1.5F, -16.5F, 5, 2, 10, 0.001F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 239, 327, -1.85F, -1.5F, -6.5F, 2, 2, 10, 0.001F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 327, -0.25F, -1.5F, -6.5F, 3, 2, 10, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(1.8762F, 0.2534F, -3.6704F);
		handguard.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.4597F, 0.4176F, 0.6863F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 226, 348, -0.5F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(2.0833F, 0.4174F, -2.5644F);
		handguard.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.6109F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 217, 348, -0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.2333F, 0.7414F, -4.3904F);
		handguard.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.0873F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 357, 234, 1.35F, -0.5F, 2.0F, 1, 1, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 361, 69, 1.35F, -0.5F, 2.5F, 1, 1, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(1.8762F, -0.3761F, -10.3255F);
		handguard.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, -0.7854F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 322, 355, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-2.7167F, -0.3404F, 6.1548F);
		handguard.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.7854F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 357, 308, 0.0F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 357, 246, 4.6F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-2.7167F, -1.3404F, 6.1548F);
		handguard.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.7854F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 356, 92, 0.0F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 159, 352, 4.6F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-2.7167F, -1.3404F, 5.1548F);
		handguard.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.7854F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 356, 122, 0.0F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 244, 352, 4.6F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-2.7167F, -0.3404F, 5.1548F);
		handguard.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.7854F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 357, 357, 0.0F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 357, 299, 4.6F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(1.8762F, -0.4555F, -6.9473F);
		handguard.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, 0.7854F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 334, 312, -0.5F, -0.5F, -4.0F, 1, 1, 8, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-3.9167F, -1.3939F, 6.3482F);
		handguard.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.8727F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 356, 8, 1.499F, -1.5F, -0.5F, 1, 2, 1, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 356, 4, 5.501F, -1.5F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(5.022F, -3.7775F, -44.8732F);
		handguard.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -0.6981F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 199, 348, -3.0F, -1.0F, 5.0F, 1, 1, 3, 0.1F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-1.0251F, -0.5636F, -44.8732F);
		handguard.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, 0.6981F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 348, 199, -3.0F, -1.0F, 5.0F, 1, 1, 3, 0.1F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(5.7066F, -0.5532F, -44.8732F);
		handguard.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, -0.0873F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 123, 348, -3.0F, -2.0F, 5.0F, 1, 2, 3, 0.1F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-0.559F, -0.1175F, -44.8732F);
		handguard.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, 0.0873F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 348, 128, -3.0F, -2.0F, 5.0F, 1, 2, 3, 0.1F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(3.003F, -0.0684F, -44.8732F);
		handguard.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, -1.0472F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 190, 348, -0.5F, -0.5F, 5.0F, 1, 1, 3, 0.1F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-2.9278F, -0.4099F, -44.8732F);
		handguard.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, 1.0472F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 348, 194, -0.1585F, -0.4085F, 5.0F, 1, 1, 3, 0.1F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-2.2363F, 0.5316F, -44.8732F);
		handguard.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, -1.0472F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 348, 184, -0.5F, -0.5F, 5.0F, 1, 1, 3, 0.1F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(2.4029F, 0.5316F, -44.8732F);
		handguard.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, 1.0472F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 348, 189, -0.5F, -0.5F, 5.0F, 1, 1, 3, 0.1F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(2.7663F, -0.5318F, -27.8732F);
		handguard.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, -1.0472F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 307, 191, -0.5F, -0.5F, -12.0F, 1, 1, 19, 0.0F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-2.0997F, -0.0318F, -27.8732F);
		handguard.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, -1.0472F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 307, 149, -0.5F, -0.5F, -12.0F, 1, 1, 19, 0.0F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-2.6912F, -0.8733F, -27.8732F);
		handguard.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, 1.0472F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 307, 170, -0.1585F, -0.4085F, -12.0F, 1, 1, 19, 0.0F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(2.2663F, -0.0318F, -27.8732F);
		handguard.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.0F, 1.0472F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 307, 128, -0.5F, -0.5F, -12.0F, 1, 1, 19, 0.0F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(5.4417F, -0.8891F, -27.8732F);
		handguard.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, -0.0873F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 84, 306, -3.0F, -2.0F, -12.0F, 1, 2, 19, 0.0F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(-0.2941F, -0.4534F, -27.8732F);
		handguard.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, 0.0F, 0.0873F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 243, 305, -3.0F, -2.0F, -12.0F, 1, 2, 19, 0.0F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-2.2965F, -3.4759F, -31.4482F);
		handguard.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, 0.0F, 0.3491F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 327, 355, -0.4998F, -1.0F, -8.5F, 1, 2, 1, 0.0F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 43, 304, -0.5F, -1.0F, -8.425F, 1, 2, 19, 0.0F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(3.179F, -1.7767F, -29.9482F);
		handguard.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.0F, 0.0F, -0.3491F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 356, 20, -0.5916F, -2.8415F, -10.0F, 1, 2, 1, 0.0F, false));
		cube_r29.cubeList.add(new ModelBox(cube_r29, 202, 305, -0.5915F, -2.8415F, -9.925F, 1, 2, 19, 0.0F, false));
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