package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class LAPAFA03 extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer outline;
	private final ModelRenderer stock2;
	private final ModelRenderer grip21_r1;
	private final ModelRenderer grip23_r1;
	private final ModelRenderer grip22_r1;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer stockparts;
	private final ModelRenderer grip23_r2;
	private final ModelRenderer grip22_r2;
	private final ModelRenderer grip20_r1;
	private final ModelRenderer grip19_r1;
	private final ModelRenderer grip18_r1;
	private final ModelRenderer grip17_r1;
	private final ModelRenderer grip16_r1;
	private final ModelRenderer grip16_r2;
	private final ModelRenderer grip15_r1;
	private final ModelRenderer grip14_r1;
	private final ModelRenderer grip13_r1;
	private final ModelRenderer grip11_r1;
	private final ModelRenderer bone6;
	private final ModelRenderer grip11_r2;
	private final ModelRenderer grip17_r2;
	private final ModelRenderer grip16_r3;
	private final ModelRenderer grip15_r2;
	private final ModelRenderer grip15_r3;
	private final ModelRenderer grip13_r2;
	private final ModelRenderer grip12_r1;
	private final ModelRenderer grip11_r3;
	private final ModelRenderer grip10_r1;
	private final ModelRenderer bone5;
	private final ModelRenderer grip10_r2;
	private final ModelRenderer handguard;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer bone8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer handguard1;
	private final ModelRenderer bone21;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer bone22;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer bone24;
	private final ModelRenderer bone73;
	private final ModelRenderer bone51;
	private final ModelRenderer bone43;
	private final ModelRenderer bone44;
	private final ModelRenderer cube_r17;
	private final ModelRenderer bone49;
	private final ModelRenderer cube_r18;
	private final ModelRenderer bone48;
	private final ModelRenderer bone47;
	private final ModelRenderer cube_r19;
	private final ModelRenderer bone46;
	private final ModelRenderer cube_r20;
	private final ModelRenderer bone45;
	private final ModelRenderer cube_r21;
	private final ModelRenderer bone52;
	private final ModelRenderer bone53;
	private final ModelRenderer cube_r22;
	private final ModelRenderer bone54;
	private final ModelRenderer cube_r23;
	private final ModelRenderer bone56;
	private final ModelRenderer bone57;
	private final ModelRenderer cube_r24;
	private final ModelRenderer bone58;
	private final ModelRenderer cube_r25;
	private final ModelRenderer bone59;
	private final ModelRenderer bone60;
	private final ModelRenderer bone61;
	private final ModelRenderer cube_r26;
	private final ModelRenderer bone62;
	private final ModelRenderer cube_r27;
	private final ModelRenderer bone27;
	private final ModelRenderer bone28;
	private final ModelRenderer bone29;
	private final ModelRenderer bone30;
	private final ModelRenderer bone32;
	private final ModelRenderer bone33;
	private final ModelRenderer bone34;
	private final ModelRenderer bone35;
	private final ModelRenderer bone36;
	private final ModelRenderer bone37;
	private final ModelRenderer bone38;
	private final ModelRenderer bone40;
	private final ModelRenderer bone41;
	private final ModelRenderer bone42;
	private final ModelRenderer bone65;
	private final ModelRenderer bone66;
	private final ModelRenderer bone67;
	private final ModelRenderer handguard2;
	private final ModelRenderer bone25;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer bone26;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;
	private final ModelRenderer cube_r34;
	private final ModelRenderer bone39;
	private final ModelRenderer bone69;
	private final ModelRenderer bone88;
	private final ModelRenderer bone93;
	private final ModelRenderer bone98;
	private final ModelRenderer cube_r35;
	private final ModelRenderer bone107;
	private final ModelRenderer cube_r36;
	private final ModelRenderer bone111;
	private final ModelRenderer bone112;
	private final ModelRenderer cube_r37;
	private final ModelRenderer bone113;
	private final ModelRenderer cube_r38;
	private final ModelRenderer bone114;
	private final ModelRenderer cube_r39;
	private final ModelRenderer bone115;
	private final ModelRenderer bone116;
	private final ModelRenderer cube_r40;
	private final ModelRenderer bone117;
	private final ModelRenderer cube_r41;
	private final ModelRenderer bone118;
	private final ModelRenderer bone119;
	private final ModelRenderer cube_r42;
	private final ModelRenderer bone120;
	private final ModelRenderer cube_r43;
	private final ModelRenderer bone121;
	private final ModelRenderer bone122;
	private final ModelRenderer bone123;
	private final ModelRenderer cube_r44;
	private final ModelRenderer bone124;
	private final ModelRenderer cube_r45;
	private final ModelRenderer bone125;
	private final ModelRenderer bone126;
	private final ModelRenderer bone127;
	private final ModelRenderer bone128;
	private final ModelRenderer bone129;
	private final ModelRenderer bone130;
	private final ModelRenderer bone131;
	private final ModelRenderer bone132;
	private final ModelRenderer bone133;
	private final ModelRenderer bone134;
	private final ModelRenderer bone135;
	private final ModelRenderer bone136;
	private final ModelRenderer bone137;
	private final ModelRenderer bone138;
	private final ModelRenderer bone139;
	private final ModelRenderer bone140;
	private final ModelRenderer bone141;
	private final ModelRenderer stock;
	private final ModelRenderer bone84;
	private final ModelRenderer cube_r74;
	private final ModelRenderer cube_r75;
	private final ModelRenderer cube_r76;
	private final ModelRenderer cube_r77;
	private final ModelRenderer cube_r78;
	private final ModelRenderer cube_r79;
	private final ModelRenderer cube_r80;
	private final ModelRenderer bone85;
	private final ModelRenderer cube_r81;
	private final ModelRenderer cube_r82;
	private final ModelRenderer cube_r83;
	private final ModelRenderer cube_r84;
	private final ModelRenderer cube_r85;
	private final ModelRenderer cube_r86;
	private final ModelRenderer bone78;
	private final ModelRenderer cube_r87;
	private final ModelRenderer cube_r88;
	private final ModelRenderer cube_r89;
	private final ModelRenderer cube_r90;
	private final ModelRenderer cube_r91;
	private final ModelRenderer bone82;
	private final ModelRenderer cube_r92;
	private final ModelRenderer cube_r93;
	private final ModelRenderer cube_r94;
	private final ModelRenderer cube_r95;
	private final ModelRenderer cube_r96;
	private final ModelRenderer bone87;
	private final ModelRenderer cube_r97;
	private final ModelRenderer cube_r98;
	private final ModelRenderer cube_r99;
	private final ModelRenderer cube_r100;
	private final ModelRenderer cube_r101;
	private final ModelRenderer cube_r102;
	private final ModelRenderer cube_r103;
	private final ModelRenderer cube_r104;
	private final ModelRenderer cube_r105;
	private final ModelRenderer cube_r106;
	private final ModelRenderer bone86;
	private final ModelRenderer cube_r107;
	private final ModelRenderer bone75;
	private final ModelRenderer bone23;
	private final ModelRenderer cube_r108;
	private final ModelRenderer bone74;
	private final ModelRenderer cube_r109;
	private final ModelRenderer bone76;
	private final ModelRenderer bone77;
	private final ModelRenderer cube_r110;
	private final ModelRenderer bone79;
	private final ModelRenderer cube_r111;
	private final ModelRenderer bone80;
	private final ModelRenderer bone81;
	private final ModelRenderer cube_r112;
	private final ModelRenderer bone83;
	private final ModelRenderer cube_r113;
	private final ModelRenderer bone68;
	private final ModelRenderer bone50;
	private final ModelRenderer cube_r114;
	private final ModelRenderer bone63;
	private final ModelRenderer bone55;
	private final ModelRenderer bone72;
	private final ModelRenderer cube_r115;
	private final ModelRenderer cube_r116;
	private final ModelRenderer bone70;
	private final ModelRenderer bone71;
	private final ModelRenderer cube_r117;
	private final ModelRenderer bone64;
	private final ModelRenderer bone31;
	private final ModelRenderer cube_r118;
	private final ModelRenderer cube_r119;
	private final ModelRenderer cube_r120;
	private final ModelRenderer cube_r121;
	private final ModelRenderer cube_r122;
	private final ModelRenderer cube_r123;
	private final ModelRenderer cube_r124;
	private final ModelRenderer cube_r125;
	private final ModelRenderer cube_r126;
	private final ModelRenderer cube_r127;
	private final ModelRenderer cube_r128;
	private final ModelRenderer cube_r129;
	private final ModelRenderer bone11;
	private final ModelRenderer cube_r130;
	private final ModelRenderer cube_r131;
	private final ModelRenderer cube_r132;
	private final ModelRenderer cube_r133;
	private final ModelRenderer cube_r134;
	private final ModelRenderer cube_r135;
	private final ModelRenderer cube_r136;
	private final ModelRenderer cube_r137;
	private final ModelRenderer cube_r138;
	private final ModelRenderer cube_r139;
	private final ModelRenderer bolts5;
	private final ModelRenderer bolts2;
	private final ModelRenderer barrel;
	private final ModelRenderer bone18;
	private final ModelRenderer bone19;
	private final ModelRenderer bone20;
	private final ModelRenderer grip;
	private final ModelRenderer grip1;
	private final ModelRenderer grip1_r1;
	private final ModelRenderer grip2;
	private final ModelRenderer grip3;
	private final ModelRenderer grip4_r1;
	private final ModelRenderer grip3_r1;
	private final ModelRenderer grip4;
	private final ModelRenderer grip5;
	private final ModelRenderer grip5_r1;
	private final ModelRenderer grip11;
	private final ModelRenderer grip12;
	private final ModelRenderer grip12_r2;
	private final ModelRenderer bone2;
	private final ModelRenderer grip14_r2;
	private final ModelRenderer grip14_r3;
	private final ModelRenderer grip13_r3;
	private final ModelRenderer bone3;
	private final ModelRenderer grip16_r4;
	private final ModelRenderer grip16_r5;
	private final ModelRenderer grip14_r4;
	private final ModelRenderer bone4;
	private final ModelRenderer grip17_r3;
	private final ModelRenderer grip16_r6;
	private final ModelRenderer grip16_r7;
	private final ModelRenderer grip17_r4;
	private final ModelRenderer bone;
	private final ModelRenderer grip9_r1;
	private final ModelRenderer grip8_r1;
	private final ModelRenderer outline2;
	private final ModelRenderer fingerguard2;
	private final ModelRenderer cube_r140;
	private final ModelRenderer cube_r141;
	private final ModelRenderer cube_r142;
	private final ModelRenderer cube_r143;
	private final ModelRenderer cube_r144;
	private final ModelRenderer cube_r145;
	private final ModelRenderer cube_r146;
	private final ModelRenderer outline3;
	private final ModelRenderer triggermagrelease2;
	private final ModelRenderer trigger2;
	private final ModelRenderer cube_r147;
	private final ModelRenderer cube_r148;
	private final ModelRenderer bone9;
	private final ModelRenderer bone10;
	private final ModelRenderer carryhandle2;
	private final ModelRenderer bone12;
	private final ModelRenderer cube_r165;
	private final ModelRenderer cube_r166;
	private final ModelRenderer cube_r167;
	private final ModelRenderer cube_r168;
	private final ModelRenderer cube_r169;
	private final ModelRenderer cube_r170;
	private final ModelRenderer cube_r171;
	private final ModelRenderer cube_r172;
	private final ModelRenderer cube_r173;
	private final ModelRenderer cube_r174;
	private final ModelRenderer bone13;
	private final ModelRenderer cube_r175;
	private final ModelRenderer cube_r177;
	private final ModelRenderer cube_r178;
	private final ModelRenderer cube_r179;
	private final ModelRenderer cube_r180;
	private final ModelRenderer cube_r181;
	private final ModelRenderer cube_r182;
	private final ModelRenderer cube_r183;
	private final ModelRenderer cube_r184;
	private final ModelRenderer cube_r185;
	private final ModelRenderer cube_r186;
	private final ModelRenderer bone7;
	private final ModelRenderer cube_r187;
	private final ModelRenderer cube_r188;
	private final ModelRenderer cube_r189;
	private final ModelRenderer cube_r190;
	private final ModelRenderer cube_r191;
	private final ModelRenderer cube_r192;
	private final ModelRenderer cube_r193;
	private final ModelRenderer cube_r194;

	public LAPAFA03() {
		textureWidth = 256;
		textureHeight = 256;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		outline = new ModelRenderer(this);
		outline.setRotationPoint(-3.5F, -27.5F, -7.0F);
		gun.addChild(outline);
		setRotationAngle(outline, 1.041F, 0.0F, 0.0F);
		

		stock2 = new ModelRenderer(this);
		stock2.setRotationPoint(4.0F, -15.8072F, -19.3301F);
		outline.addChild(stock2);
		

		grip21_r1 = new ModelRenderer(this);
		grip21_r1.setRotationPoint(-2.0F, 48.8775F, 53.5125F);
		stock2.addChild(grip21_r1);
		setRotationAngle(grip21_r1, -0.6981F, 0.0F, 0.0F);
		grip21_r1.cubeList.add(new ModelBox(grip21_r1, 119, 79, -1.0F, -2.6009F, -1.7825F, 2, 1, 2, 0.0F, false));
		grip21_r1.cubeList.add(new ModelBox(grip21_r1, 42, 104, -2.0F, -1.6009F, -1.7825F, 4, 4, 2, 0.0F, false));

		grip23_r1 = new ModelRenderer(this);
		grip23_r1.setRotationPoint(-2.0F, 34.7888F, 46.1605F);
		stock2.addChild(grip23_r1);
		setRotationAngle(grip23_r1, -1.8762F, 0.0F, 0.0F);
		

		grip22_r1 = new ModelRenderer(this);
		grip22_r1.setRotationPoint(-2.0F, 38.787F, 48.9299F);
		stock2.addChild(grip22_r1);
		setRotationAngle(grip22_r1, -0.2182F, 0.0F, 0.0F);
		grip22_r1.cubeList.add(new ModelBox(grip22_r1, 42, 110, -1.0F, 1.4792F, -0.6635F, 2, 2, 4, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		stock2.addChild(cube_r1);
		setRotationAngle(cube_r1, -1.041F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 11, 29, -4.001F, -13.4437F, 38.8697F, 4, 2, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 34, 171, -4.0F, -15.4437F, 37.8697F, 4, 2, 22, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 39, 95, -4.0F, -15.4437F, 59.8697F, 4, 4, 3, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 98, 111, -4.0F, -13.4437F, 57.8697F, 4, 3, 3, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 98, 111, -4.0F, -13.4437F, 54.8697F, 4, 3, 3, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 98, 111, -4.0F, -13.4437F, 51.8697F, 4, 3, 3, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 99, 112, -4.0F, -13.4437F, 50.3697F, 4, 3, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 40, 96, -4.0F, -11.4437F, 60.8697F, 4, 2, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 49, 125, -4.0F, -13.6437F, 48.3697F, 4, 6, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 48, 124, -4.0F, -13.6437F, 45.3697F, 4, 5, 3, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 48, 124, -4.0F, -13.6437F, 39.3697F, 4, 3, 3, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 48, 124, -4.0F, -13.6437F, 42.3697F, 4, 4, 3, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 45, 121, -4.0F, -15.4437F, 62.8697F, 4, 6, 6, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 85, 95, -3.999F, -21.4437F, 51.8696F, 4, 6, 17, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.8032F, -0.5998F);
		stock2.addChild(cube_r2);
		setRotationAngle(cube_r2, -1.041F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 23, 29, -4.01F, -14.4437F, 38.8697F, 4, 3, 1, 0.0F, false));

		stockparts = new ModelRenderer(this);
		stockparts.setRotationPoint(-2.0F, 53.7217F, 51.4071F);
		stock2.addChild(stockparts);
		

		grip23_r2 = new ModelRenderer(this);
		grip23_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		stockparts.addChild(grip23_r2);
		setRotationAngle(grip23_r2, -1.0472F, 0.0F, 0.0F);
		

		grip22_r2 = new ModelRenderer(this);
		grip22_r2.setRotationPoint(0.0F, -3.1209F, -2.6498F);
		stockparts.addChild(grip22_r2);
		setRotationAngle(grip22_r2, -1.0472F, 0.0F, 0.0F);
		grip22_r2.cubeList.add(new ModelBox(grip22_r2, 108, 53, -2.0F, -5.1738F, -15.7858F, 4, 1, 4, 0.0F, false));
		grip22_r2.cubeList.add(new ModelBox(grip22_r2, 34, 59, -2.0F, -5.5121F, -7.5501F, 4, 1, 1, 0.0F, false));
		grip22_r2.cubeList.add(new ModelBox(grip22_r2, 136, 55, -1.99F, -6.4981F, -6.8F, 4, 2, 7, 0.0F, false));
		grip22_r2.cubeList.add(new ModelBox(grip22_r2, 68, 73, -1.0F, -7.4981F, -6.8F, 2, 3, 7, 0.0F, false));

		grip20_r1 = new ModelRenderer(this);
		grip20_r1.setRotationPoint(0.0F, 0.7093F, -5.8637F);
		stockparts.addChild(grip20_r1);
		setRotationAngle(grip20_r1, -1.0472F, 0.0F, 0.0F);
		grip20_r1.cubeList.add(new ModelBox(grip20_r1, 95, 0, -1.99F, -7.4981F, -1.8F, 4, 8, 2, 0.0F, false));

		grip19_r1 = new ModelRenderer(this);
		grip19_r1.setRotationPoint(0.0F, 1.0124F, -6.6431F);
		stockparts.addChild(grip19_r1);
		setRotationAngle(grip19_r1, -1.3526F, 0.0F, 0.0F);
		grip19_r1.cubeList.add(new ModelBox(grip19_r1, 91, 43, -2.01F, -0.408F, -1.7856F, 4, 1, 2, 0.0F, false));

		grip18_r1 = new ModelRenderer(this);
		grip18_r1.setRotationPoint(0.0F, 0.9173F, -8.4449F);
		stockparts.addChild(grip18_r1);
		setRotationAngle(grip18_r1, -1.7017F, 0.0F, 0.0F);
		grip18_r1.cubeList.add(new ModelBox(grip18_r1, 11, 68, -1.99F, -1.3159F, -0.7369F, 4, 2, 1, 0.0F, false));

		grip17_r1 = new ModelRenderer(this);
		grip17_r1.setRotationPoint(0.0F, 0.6833F, -9.2477F);
		stockparts.addChild(grip17_r1);
		setRotationAngle(grip17_r1, -2.0071F, 0.0F, 0.0F);
		grip17_r1.cubeList.add(new ModelBox(grip17_r1, 65, 78, -2.0F, -0.2532F, -0.6706F, 4, 1, 1, 0.0F, false));

		grip16_r1 = new ModelRenderer(this);
		grip16_r1.setRotationPoint(0.0F, -2.9122F, -11.2688F);
		stockparts.addChild(grip16_r1);
		setRotationAngle(grip16_r1, -2.618F, 0.0F, 0.0F);
		grip16_r1.cubeList.add(new ModelBox(grip16_r1, 111, 0, -2.01F, -3.7015F, -1.2543F, 4, 4, 2, 0.0F, false));

		grip16_r2 = new ModelRenderer(this);
		grip16_r2.setRotationPoint(0.0F, -3.1662F, -11.5857F);
		stockparts.addChild(grip16_r2);
		setRotationAngle(grip16_r2, -2.8362F, 0.0F, 0.0F);
		grip16_r2.cubeList.add(new ModelBox(grip16_r2, 91, 70, -1.99F, -0.2075F, -1.4332F, 4, 1, 2, 0.0F, false));

		grip15_r1 = new ModelRenderer(this);
		grip15_r1.setRotationPoint(0.0F, -3.704F, -11.7598F);
		stockparts.addChild(grip15_r1);
		setRotationAngle(grip15_r1, -2.7053F, 0.0F, 0.0F);
		grip15_r1.cubeList.add(new ModelBox(grip15_r1, 65, 75, -2.0F, -0.7013F, -0.472F, 4, 2, 1, 0.0F, false));

		grip14_r1 = new ModelRenderer(this);
		grip14_r1.setRotationPoint(0.0F, -7.9343F, -12.5966F);
		stockparts.addChild(grip14_r1);
		setRotationAngle(grip14_r1, -3.0107F, 0.0F, 0.0F);
		

		grip13_r1 = new ModelRenderer(this);
		grip13_r1.setRotationPoint(0.0F, -15.3323F, -14.1015F);
		stockparts.addChild(grip13_r1);
		setRotationAngle(grip13_r1, -2.8798F, 0.0F, 0.0F);
		grip13_r1.cubeList.add(new ModelBox(grip13_r1, 10, 12, -1.99F, 3.9247F, 4.251F, 4, 7, 1, 0.0F, false));
		grip13_r1.cubeList.add(new ModelBox(grip13_r1, 10, 12, -1.99F, 1.9247F, 4.251F, 4, 2, 1, 0.0F, false));

		grip11_r1 = new ModelRenderer(this);
		grip11_r1.setRotationPoint(0.0F, -33.2436F, -21.1146F);
		stockparts.addChild(grip11_r1);
		setRotationAngle(grip11_r1, -2.618F, 0.0F, 0.0F);
		

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-2.0F, 25.2667F, 33.6499F);
		stock2.addChild(bone6);
		

		grip11_r2 = new ModelRenderer(this);
		grip11_r2.setRotationPoint(0.0F, -1.0418F, -2.5432F);
		bone6.addChild(grip11_r2);
		setRotationAngle(grip11_r2, -2.8798F, 0.0F, 0.0F);
		grip11_r2.cubeList.add(new ModelBox(grip11_r2, 78, 52, -2.01F, 0.4723F, -0.7592F, 4, 2, 1, 0.0F, false));

		grip17_r2 = new ModelRenderer(this);
		grip17_r2.setRotationPoint(0.0F, 9.2397F, 1.6414F);
		bone6.addChild(grip17_r2);
		setRotationAngle(grip17_r2, 0.9163F, 0.0F, 0.0F);
		

		grip16_r3 = new ModelRenderer(this);
		grip16_r3.setRotationPoint(0.0F, 7.5402F, -0.9021F);
		bone6.addChild(grip16_r3);
		setRotationAngle(grip16_r3, 1.0472F, 0.0F, 0.0F);
		

		grip15_r2 = new ModelRenderer(this);
		grip15_r2.setRotationPoint(0.0F, 5.79F, -2.6195F);
		bone6.addChild(grip15_r2);
		setRotationAngle(grip15_r2, 0.9599F, 0.0F, 0.0F);
		

		grip15_r3 = new ModelRenderer(this);
		grip15_r3.setRotationPoint(0.0F, 5.0749F, -5.3561F);
		bone6.addChild(grip15_r3);
		setRotationAngle(grip15_r3, 1.4835F, 0.0F, 0.0F);
		grip15_r3.cubeList.add(new ModelBox(grip15_r3, 14, 131, -1.75F, 4.0288F, -9.3291F, 2, 3, 1, 0.0F, false));
		grip15_r3.cubeList.add(new ModelBox(grip15_r3, 133, 43, -0.25F, 4.0288F, -9.3291F, 2, 3, 1, 0.0F, false));

		grip13_r2 = new ModelRenderer(this);
		grip13_r2.setRotationPoint(0.0F, 3.5965F, -6.1608F);
		bone6.addChild(grip13_r2);
		setRotationAngle(grip13_r2, 1.6581F, 0.0F, 0.0F);
		grip13_r2.cubeList.add(new ModelBox(grip13_r2, 41, 23, -0.5F, 2.7322F, -10.8331F, 1, 3, 1, 0.0F, false));

		grip12_r1 = new ModelRenderer(this);
		grip12_r1.setRotationPoint(0.0F, 4.4594F, -5.6554F);
		bone6.addChild(grip12_r1);
		setRotationAngle(grip12_r1, 1.9199F, 0.0F, 0.0F);
		grip12_r1.cubeList.add(new ModelBox(grip12_r1, 36, 16, -1.99F, -0.2212F, -10.8385F, 4, 3, 1, 0.0F, false));

		grip11_r3 = new ModelRenderer(this);
		grip11_r3.setRotationPoint(0.0F, 3.9883F, -4.138F);
		bone6.addChild(grip11_r3);
		setRotationAngle(grip11_r3, 2.5744F, 0.0F, 0.0F);
		grip11_r3.cubeList.add(new ModelBox(grip11_r3, 11, 39, -2.0F, -0.1901F, -0.0162F, 4, 3, 1, 0.0F, false));

		grip10_r1 = new ModelRenderer(this);
		grip10_r1.setRotationPoint(0.0F, -1.0418F, -2.5432F);
		bone6.addChild(grip10_r1);
		setRotationAngle(grip10_r1, 2.9234F, 0.0F, 0.0F);
		grip10_r1.cubeList.add(new ModelBox(grip10_r1, 111, 6, -1.99F, -2.9857F, -1.5419F, 4, 4, 2, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-2.0F, 19.6578F, 30.365F);
		stock2.addChild(bone5);
		

		grip10_r2 = new ModelRenderer(this);
		grip10_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(grip10_r2);
		setRotationAngle(grip10_r2, -2.2689F, 0.0F, 0.0F);
		

		handguard = new ModelRenderer(this);
		handguard.setRotationPoint(3.5F, -29.9725F, -11.3368F);
		outline.addChild(handguard);
		

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		handguard.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.268F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 52, 43, -4.5F, -6.2956F, -2.0531F, 6, 1, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -0.8307F, -0.0962F);
		handguard.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.0374F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 48, 64, -4.5F, -5.5605F, -3.7246F, 6, 1, 1, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, -1.4762F, 0.1185F);
		handguard.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.6047F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 65, 44, -4.5F, -3.0355F, -5.9386F, 6, 1, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(2.25F, 14.1653F, -7.9933F);
		handguard.addChild(cube_r6);
		setRotationAngle(cube_r6, -1.041F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 69, 25, -7.501F, -15.4437F, 34.6696F, 2, 2, 3, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 65, 70, -1.999F, -15.4437F, 34.6696F, 2, 2, 3, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.5F, 14.1653F, -7.9933F);
		handguard.addChild(cube_r7);
		setRotationAngle(cube_r7, -1.041F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -3.601F, -21.4448F, -7.8309F, 3, 6, 46, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 52, -1.401F, -21.4438F, -7.8304F, 1, 6, 46, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 30, 82, -1.401F, -21.4438F, 38.1696F, 1, 6, 16, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 30, 30, -3.601F, -21.4448F, 38.1691F, 3, 2, 16, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 112, 151, -3.5F, -21.8436F, -16.7304F, 3, 1, 11, 0.1F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 29, 143, -3.0F, -21.6437F, 5.1696F, 2, 1, 22, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 23, 11, -3.0F, -21.9437F, 27.1696F, 2, 1, 9, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 167, 0, -3.798F, -22.1437F, 4.9696F, 1, 1, 26, -0.2F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 168, 142, -1.199F, -22.1437F, 4.9696F, 1, 1, 26, -0.2F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-0.5F, 11.379F, -7.6522F);
		handguard.addChild(cube_r8);
		setRotationAngle(cube_r8, -1.041F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 139, 159, -4.749F, -14.4437F, -13.8304F, 1, 1, 27, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 160, 114, 1.749F, -14.4437F, -13.8304F, 1, 1, 27, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 160, 114, 1.749F, -14.4437F, 13.1696F, 1, 1, 27, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 139, 159, -4.749F, -14.4437F, 13.1696F, 1, 1, 27, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 65, 65, -4.0F, -14.4437F, -13.829F, 6, 1, 1, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.5F, 14.1653F, -7.9933F);
		handguard.addChild(bone8);
		

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone8.addChild(cube_r9);
		setRotationAngle(cube_r9, -1.041F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 86, 127, -4.001F, -14.4438F, -13.8304F, 4, 1, 36, 0.0F, false));

		handguard1 = new ModelRenderer(this);
		handguard1.setRotationPoint(0.0F, 0.0F, 0.0F);
		gun.addChild(handguard1);
		

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(6.5F, -38.25F, -18.5F);
		handguard1.addChild(bone21);
		setRotationAngle(bone21, 0.0F, 0.0F, -0.2618F);
		

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-6.1392F, -2.0834F, 11.2399F);
		bone21.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.0913F, -0.1247F, -0.2799F);
		

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-6.1392F, -2.0834F, 11.2399F);
		bone21.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0658F, -0.1247F, -0.2799F);
		

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-5.1304F, -3.9013F, -4.2392F);
		bone21.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -0.2618F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 137, 0, -1.3506F, 2.9082F, -24.5008F, 1, 1, 28, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 133, 41, -1.3493F, -0.2918F, -24.5F, 1, 4, 28, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 134, 42, -1.3493F, -0.2918F, 3.5F, 1, 4, 27, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 138, 1, -1.3506F, 2.9082F, 3.4992F, 1, 1, 27, 0.0F, false));

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(-7.0F, 37.75F, 19.0F);
		bone21.addChild(bone22);
		setRotationAngle(bone22, 0.0F, 0.0F, 0.2618F);
		bone22.cubeList.add(new ModelBox(bone22, 0, 144, -8.328F, -37.145F, -46.7392F, 1, 2, 27, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 0, 144, -8.328F, -37.145F, -19.7392F, 1, 2, 27, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 164, 73, -9.329F, -35.895F, -46.7392F, 2, 1, 26, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 42, 133, -9.3286F, -35.3F, 6.2608F, 2, 3, 1, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-7.8286F, -36.2629F, -40.7574F);
		bone22.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.48F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 59, 81, -0.5004F, -3.7707F, -5.822F, 1, 2, 1, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-8.8294F, -33.9796F, -8.0946F);
		bone22.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, -0.096F, 0.0F);
		

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-8.9658F, -33.9126F, -1.4611F);
		bone22.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.5236F, -0.096F, 0.0F);
		

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-9.1539F, -34.8F, -7.9367F);
		bone22.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, -0.1396F, 0.0F);
		

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(-9.5F, -38.25F, -18.5F);
		handguard1.addChild(bone24);
		setRotationAngle(bone24, 0.0F, 0.0F, 0.2618F);
		

		bone73 = new ModelRenderer(this);
		bone73.setRotationPoint(7.0F, 37.75F, 19.0F);
		bone24.addChild(bone73);
		setRotationAngle(bone73, 0.0F, 0.0F, -0.2618F);
		

		bone51 = new ModelRenderer(this);
		bone51.setRotationPoint(0.0F, 0.0F, 0.0F);
		handguard1.addChild(bone51);
		

		bone43 = new ModelRenderer(this);
		bone43.setRotationPoint(0.0F, 0.0F, 18.0F);
		bone51.addChild(bone43);
		

		bone44 = new ModelRenderer(this);
		bone44.setRotationPoint(1.0F, 0.0F, -72.25F);
		bone43.addChild(bone44);
		

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.25F, -33.3638F, 35.1264F);
		bone44.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.5672F, 0.0F, 0.0F);
		

		bone49 = new ModelRenderer(this);
		bone49.setRotationPoint(1.0F, 0.0F, 0.0F);
		bone43.addChild(bone49);
		

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.25F, -33.3638F, -34.8548F);
		bone49.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.5672F, 0.0F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 138, 139, -1.0F, 10.2827F, 17.2116F, 2, 2, 1, 0.0F, false));

		bone48 = new ModelRenderer(this);
		bone48.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone51.addChild(bone48);
		

		bone47 = new ModelRenderer(this);
		bone47.setRotationPoint(1.0F, 0.0F, -72.25F);
		bone48.addChild(bone47);
		

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.25F, -33.3638F, 35.1264F);
		bone47.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.5672F, 0.0F, 0.0F);
		

		bone46 = new ModelRenderer(this);
		bone46.setRotationPoint(1.0F, 0.0F, 0.0F);
		bone48.addChild(bone46);
		

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.25F, -33.3638F, -35.1048F);
		bone46.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.5672F, 0.0F, 0.0F);
		

		bone45 = new ModelRenderer(this);
		bone45.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone48.addChild(bone45);
		

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(1.25F, -33.5018F, -36.1F);
		bone45.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, 0.6109F);
		

		bone52 = new ModelRenderer(this);
		bone52.setRotationPoint(0.0F, 0.0F, 4.25F);
		bone51.addChild(bone52);
		

		bone53 = new ModelRenderer(this);
		bone53.setRotationPoint(1.0F, 0.0F, -72.25F);
		bone52.addChild(bone53);
		

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(0.25F, -33.3638F, 35.1264F);
		bone53.addChild(cube_r22);
		setRotationAngle(cube_r22, -0.5672F, 0.0F, 0.0F);
		

		bone54 = new ModelRenderer(this);
		bone54.setRotationPoint(1.0F, 0.0F, 0.0F);
		bone52.addChild(bone54);
		

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(0.25F, -33.3638F, -34.8548F);
		bone54.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.5672F, 0.0F, 0.0F);
		

		bone56 = new ModelRenderer(this);
		bone56.setRotationPoint(0.0F, 0.0F, 8.75F);
		bone51.addChild(bone56);
		

		bone57 = new ModelRenderer(this);
		bone57.setRotationPoint(1.0F, 0.0F, -72.25F);
		bone56.addChild(bone57);
		

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(0.25F, -33.3638F, 35.1264F);
		bone57.addChild(cube_r24);
		setRotationAngle(cube_r24, -0.5672F, 0.0F, 0.0F);
		

		bone58 = new ModelRenderer(this);
		bone58.setRotationPoint(1.0F, 0.0F, 0.0F);
		bone56.addChild(bone58);
		

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(0.25F, -33.3638F, -34.8548F);
		bone58.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.5672F, 0.0F, 0.0F);
		

		bone59 = new ModelRenderer(this);
		bone59.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone56.addChild(bone59);
		

		bone60 = new ModelRenderer(this);
		bone60.setRotationPoint(0.0F, 0.0F, 13.25F);
		bone51.addChild(bone60);
		

		bone61 = new ModelRenderer(this);
		bone61.setRotationPoint(1.0F, 0.0F, -72.25F);
		bone60.addChild(bone61);
		

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(0.25F, -33.3638F, 35.1264F);
		bone61.addChild(cube_r26);
		setRotationAngle(cube_r26, -0.5672F, 0.0F, 0.0F);
		

		bone62 = new ModelRenderer(this);
		bone62.setRotationPoint(1.0F, 0.0F, 0.0F);
		bone60.addChild(bone62);
		

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(0.25F, -33.3638F, -34.6048F);
		bone62.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.5672F, 0.0F, 0.0F);
		

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(-3.0F, 0.0F, 0.0F);
		handguard1.addChild(bone27);
		

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(0.0F, 0.0F, 18.0F);
		bone27.addChild(bone28);
		

		bone29 = new ModelRenderer(this);
		bone29.setRotationPoint(-1.0F, 0.0F, -72.25F);
		bone28.addChild(bone29);
		

		bone30 = new ModelRenderer(this);
		bone30.setRotationPoint(-1.0F, 0.0F, 0.0F);
		bone28.addChild(bone30);
		

		bone32 = new ModelRenderer(this);
		bone32.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone27.addChild(bone32);
		

		bone33 = new ModelRenderer(this);
		bone33.setRotationPoint(-1.0F, 0.0F, -72.25F);
		bone32.addChild(bone33);
		

		bone34 = new ModelRenderer(this);
		bone34.setRotationPoint(-1.0F, 0.0F, 0.0F);
		bone32.addChild(bone34);
		

		bone35 = new ModelRenderer(this);
		bone35.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone32.addChild(bone35);
		

		bone36 = new ModelRenderer(this);
		bone36.setRotationPoint(0.0F, 0.0F, 4.25F);
		bone27.addChild(bone36);
		

		bone37 = new ModelRenderer(this);
		bone37.setRotationPoint(-1.0F, 0.0F, -72.25F);
		bone36.addChild(bone37);
		

		bone38 = new ModelRenderer(this);
		bone38.setRotationPoint(-1.0F, 0.0F, 0.0F);
		bone36.addChild(bone38);
		

		bone40 = new ModelRenderer(this);
		bone40.setRotationPoint(0.0F, 0.0F, 8.75F);
		bone27.addChild(bone40);
		

		bone41 = new ModelRenderer(this);
		bone41.setRotationPoint(-1.0F, 0.0F, -72.25F);
		bone40.addChild(bone41);
		

		bone42 = new ModelRenderer(this);
		bone42.setRotationPoint(-1.0F, 0.0F, 0.0F);
		bone40.addChild(bone42);
		

		bone65 = new ModelRenderer(this);
		bone65.setRotationPoint(0.0F, 0.0F, 13.25F);
		bone27.addChild(bone65);
		

		bone66 = new ModelRenderer(this);
		bone66.setRotationPoint(-1.0F, 0.0F, -72.25F);
		bone65.addChild(bone66);
		

		bone67 = new ModelRenderer(this);
		bone67.setRotationPoint(-1.0F, 0.0F, 0.0F);
		bone65.addChild(bone67);
		

		handguard2 = new ModelRenderer(this);
		handguard2.setRotationPoint(-3.0F, 0.0F, 0.0F);
		gun.addChild(handguard2);
		

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(-6.5F, -38.25F, -18.5F);
		handguard2.addChild(bone25);
		setRotationAngle(bone25, 0.0F, 0.0F, 0.2618F);
		

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(6.1392F, -2.0834F, 11.2399F);
		bone25.addChild(cube_r28);
		setRotationAngle(cube_r28, -0.0913F, 0.1247F, 0.2799F);
		

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(6.1392F, -2.0834F, 11.2399F);
		bone25.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.0658F, 0.1247F, 0.2799F);
		

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(5.1304F, -3.9013F, -4.2392F);
		bone25.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.0F, 0.0F, 0.2618F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 134, 85, 0.3506F, 2.9082F, -24.5008F, 1, 1, 28, 0.0F, false));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 130, 127, 0.3493F, -0.2918F, -24.5F, 1, 4, 28, 0.0F, false));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 131, 128, 0.3493F, -0.2918F, 3.5F, 1, 4, 27, 0.0F, false));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 135, 86, 0.3506F, 2.9082F, 3.4992F, 1, 1, 27, 0.0F, false));

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(7.0F, 37.75F, 19.0F);
		bone25.addChild(bone26);
		setRotationAngle(bone26, 0.0F, 0.0F, -0.2618F);
		bone26.cubeList.add(new ModelBox(bone26, 53, 142, 7.328F, -37.145F, -46.7392F, 1, 2, 27, 0.0F, false));
		bone26.cubeList.add(new ModelBox(bone26, 53, 142, 7.328F, -37.145F, -19.7392F, 1, 2, 27, 0.0F, false));
		bone26.cubeList.add(new ModelBox(bone26, 163, 29, 7.329F, -35.895F, -46.7392F, 2, 1, 26, 0.0F, false));
		bone26.cubeList.add(new ModelBox(bone26, 121, 21, 7.3286F, -35.3F, 6.2608F, 2, 3, 1, 0.0F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(7.8286F, -36.2629F, -40.7574F);
		bone26.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.48F, 0.0F, 0.0F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 5, 34, -0.4996F, -3.7707F, -5.822F, 1, 2, 1, 0.0F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(8.8294F, -33.9796F, -8.0946F);
		bone26.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.0F, 0.096F, 0.0F);
		

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(8.9658F, -33.9126F, -1.4611F);
		bone26.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.5236F, 0.096F, 0.0F);
		

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(9.1539F, -34.8F, -7.9367F);
		bone26.addChild(cube_r34);
		setRotationAngle(cube_r34, 0.0F, 0.1396F, 0.0F);
		

		bone39 = new ModelRenderer(this);
		bone39.setRotationPoint(9.5F, -38.25F, -18.5F);
		handguard2.addChild(bone39);
		setRotationAngle(bone39, 0.0F, 0.0F, -0.2618F);
		

		bone69 = new ModelRenderer(this);
		bone69.setRotationPoint(-7.0F, 37.75F, 19.0F);
		bone39.addChild(bone69);
		setRotationAngle(bone69, 0.0F, 0.0F, 0.2618F);
		

		bone88 = new ModelRenderer(this);
		bone88.setRotationPoint(0.0F, 0.0F, 0.0F);
		handguard2.addChild(bone88);
		

		bone93 = new ModelRenderer(this);
		bone93.setRotationPoint(0.0F, 0.0F, 18.0F);
		bone88.addChild(bone93);
		

		bone98 = new ModelRenderer(this);
		bone98.setRotationPoint(-1.0F, 0.0F, -72.25F);
		bone93.addChild(bone98);
		

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(-0.25F, -33.3638F, 35.1264F);
		bone98.addChild(cube_r35);
		setRotationAngle(cube_r35, -0.5672F, 0.0F, 0.0F);
		

		bone107 = new ModelRenderer(this);
		bone107.setRotationPoint(-1.0F, 0.0F, 0.0F);
		bone93.addChild(bone107);
		

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(-0.25F, -33.3638F, -34.8548F);
		bone107.addChild(cube_r36);
		setRotationAngle(cube_r36, 0.5672F, 0.0F, 0.0F);
		

		bone111 = new ModelRenderer(this);
		bone111.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone88.addChild(bone111);
		

		bone112 = new ModelRenderer(this);
		bone112.setRotationPoint(-1.0F, 0.0F, -72.25F);
		bone111.addChild(bone112);
		

		cube_r37 = new ModelRenderer(this);
		cube_r37.setRotationPoint(-0.25F, -33.3638F, 35.1264F);
		bone112.addChild(cube_r37);
		setRotationAngle(cube_r37, -0.5672F, 0.0F, 0.0F);
		

		bone113 = new ModelRenderer(this);
		bone113.setRotationPoint(-1.0F, 0.0F, 0.0F);
		bone111.addChild(bone113);
		

		cube_r38 = new ModelRenderer(this);
		cube_r38.setRotationPoint(-0.25F, -33.3638F, -35.1048F);
		bone113.addChild(cube_r38);
		setRotationAngle(cube_r38, 0.5672F, 0.0F, 0.0F);
		

		bone114 = new ModelRenderer(this);
		bone114.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone111.addChild(bone114);
		

		cube_r39 = new ModelRenderer(this);
		cube_r39.setRotationPoint(-1.25F, -33.5018F, -36.1F);
		bone114.addChild(cube_r39);
		setRotationAngle(cube_r39, 0.0F, 0.0F, -0.6109F);
		

		bone115 = new ModelRenderer(this);
		bone115.setRotationPoint(0.0F, 0.0F, 4.25F);
		bone88.addChild(bone115);
		

		bone116 = new ModelRenderer(this);
		bone116.setRotationPoint(-1.0F, 0.0F, -72.25F);
		bone115.addChild(bone116);
		

		cube_r40 = new ModelRenderer(this);
		cube_r40.setRotationPoint(-0.25F, -33.3638F, 35.1264F);
		bone116.addChild(cube_r40);
		setRotationAngle(cube_r40, -0.5672F, 0.0F, 0.0F);
		

		bone117 = new ModelRenderer(this);
		bone117.setRotationPoint(-1.0F, 0.0F, 0.0F);
		bone115.addChild(bone117);
		

		cube_r41 = new ModelRenderer(this);
		cube_r41.setRotationPoint(-0.25F, -33.3638F, -34.8548F);
		bone117.addChild(cube_r41);
		setRotationAngle(cube_r41, 0.5672F, 0.0F, 0.0F);
		

		bone118 = new ModelRenderer(this);
		bone118.setRotationPoint(0.0F, 0.0F, 8.75F);
		bone88.addChild(bone118);
		

		bone119 = new ModelRenderer(this);
		bone119.setRotationPoint(-1.0F, 0.0F, -72.25F);
		bone118.addChild(bone119);
		

		cube_r42 = new ModelRenderer(this);
		cube_r42.setRotationPoint(-0.25F, -33.3638F, 35.1264F);
		bone119.addChild(cube_r42);
		setRotationAngle(cube_r42, -0.5672F, 0.0F, 0.0F);
		

		bone120 = new ModelRenderer(this);
		bone120.setRotationPoint(-1.0F, 0.0F, 0.0F);
		bone118.addChild(bone120);
		

		cube_r43 = new ModelRenderer(this);
		cube_r43.setRotationPoint(-0.25F, -33.3638F, -34.8548F);
		bone120.addChild(cube_r43);
		setRotationAngle(cube_r43, 0.5672F, 0.0F, 0.0F);
		

		bone121 = new ModelRenderer(this);
		bone121.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone118.addChild(bone121);
		

		bone122 = new ModelRenderer(this);
		bone122.setRotationPoint(0.0F, 0.0F, 13.25F);
		bone88.addChild(bone122);
		

		bone123 = new ModelRenderer(this);
		bone123.setRotationPoint(-1.0F, 0.0F, -72.25F);
		bone122.addChild(bone123);
		

		cube_r44 = new ModelRenderer(this);
		cube_r44.setRotationPoint(-0.25F, -33.3638F, 35.1264F);
		bone123.addChild(cube_r44);
		setRotationAngle(cube_r44, -0.5672F, 0.0F, 0.0F);
		

		bone124 = new ModelRenderer(this);
		bone124.setRotationPoint(-1.0F, 0.0F, 0.0F);
		bone122.addChild(bone124);
		

		cube_r45 = new ModelRenderer(this);
		cube_r45.setRotationPoint(-0.25F, -33.3638F, -34.6048F);
		bone124.addChild(cube_r45);
		setRotationAngle(cube_r45, 0.5672F, 0.0F, 0.0F);
		

		bone125 = new ModelRenderer(this);
		bone125.setRotationPoint(3.0F, 0.0F, 0.0F);
		handguard2.addChild(bone125);
		

		bone126 = new ModelRenderer(this);
		bone126.setRotationPoint(0.0F, 0.0F, 18.0F);
		bone125.addChild(bone126);
		

		bone127 = new ModelRenderer(this);
		bone127.setRotationPoint(1.0F, 0.0F, -72.25F);
		bone126.addChild(bone127);
		

		bone128 = new ModelRenderer(this);
		bone128.setRotationPoint(1.0F, 0.0F, 0.0F);
		bone126.addChild(bone128);
		

		bone129 = new ModelRenderer(this);
		bone129.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone125.addChild(bone129);
		

		bone130 = new ModelRenderer(this);
		bone130.setRotationPoint(1.0F, 0.0F, -72.25F);
		bone129.addChild(bone130);
		

		bone131 = new ModelRenderer(this);
		bone131.setRotationPoint(1.0F, 0.0F, 0.0F);
		bone129.addChild(bone131);
		

		bone132 = new ModelRenderer(this);
		bone132.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone129.addChild(bone132);
		

		bone133 = new ModelRenderer(this);
		bone133.setRotationPoint(0.0F, 0.0F, 4.25F);
		bone125.addChild(bone133);
		

		bone134 = new ModelRenderer(this);
		bone134.setRotationPoint(1.0F, 0.0F, -72.25F);
		bone133.addChild(bone134);
		

		bone135 = new ModelRenderer(this);
		bone135.setRotationPoint(1.0F, 0.0F, 0.0F);
		bone133.addChild(bone135);
		

		bone136 = new ModelRenderer(this);
		bone136.setRotationPoint(0.0F, 0.0F, 8.75F);
		bone125.addChild(bone136);
		

		bone137 = new ModelRenderer(this);
		bone137.setRotationPoint(1.0F, 0.0F, -72.25F);
		bone136.addChild(bone137);
		

		bone138 = new ModelRenderer(this);
		bone138.setRotationPoint(1.0F, 0.0F, 0.0F);
		bone136.addChild(bone138);
		

		bone139 = new ModelRenderer(this);
		bone139.setRotationPoint(0.0F, 0.0F, 13.25F);
		bone125.addChild(bone139);
		

		bone140 = new ModelRenderer(this);
		bone140.setRotationPoint(1.0F, 0.0F, -72.25F);
		bone139.addChild(bone140);
		

		bone141 = new ModelRenderer(this);
		bone141.setRotationPoint(1.0F, 0.0F, 0.0F);
		bone139.addChild(bone141);
		

		stock = new ModelRenderer(this);
		stock.setRotationPoint(0.0F, 0.0F, 0.0F);
		gun.addChild(stock);
		

		bone84 = new ModelRenderer(this);
		bone84.setRotationPoint(0.0F, 0.0F, 0.0F);
		stock.addChild(bone84);
		

		cube_r74 = new ModelRenderer(this);
		cube_r74.setRotationPoint(0.5F, -28.16F, 32.4035F);
		bone84.addChild(cube_r74);
		setRotationAngle(cube_r74, -1.2217F, 0.0F, 0.0F);
		

		cube_r75 = new ModelRenderer(this);
		cube_r75.setRotationPoint(0.5F, -29.6138F, 31.1873F);
		bone84.addChild(cube_r75);
		setRotationAngle(cube_r75, -0.9599F, 0.0F, 0.0F);
		cube_r75.cubeList.add(new ModelBox(cube_r75, 63, 116, -0.5F, 0.2618F, -1.1555F, 1, 1, 3, 0.0F, false));

		cube_r76 = new ModelRenderer(this);
		cube_r76.setRotationPoint(0.5F, -29.2004F, 31.6581F);
		bone84.addChild(cube_r76);
		setRotationAngle(cube_r76, -0.829F, 0.0F, 0.0F);
		

		cube_r77 = new ModelRenderer(this);
		cube_r77.setRotationPoint(0.5F, -31.0536F, 23.8772F);
		bone84.addChild(cube_r77);
		setRotationAngle(cube_r77, 0.6109F, 0.0F, 0.0F);
		

		cube_r78 = new ModelRenderer(this);
		cube_r78.setRotationPoint(0.5F, -29.5511F, 26.7445F);
		bone84.addChild(cube_r78);
		setRotationAngle(cube_r78, -0.3491F, 0.0F, 0.0F);
		

		cube_r79 = new ModelRenderer(this);
		cube_r79.setRotationPoint(0.5F, -29.8011F, 26.7445F);
		bone84.addChild(cube_r79);
		setRotationAngle(cube_r79, -0.3491F, 0.0F, 0.0F);
		cube_r79.cubeList.add(new ModelBox(cube_r79, 0, 63, -0.491F, 5.331F, -16.0954F, 1, 1, 9, 0.0F, false));

		cube_r80 = new ModelRenderer(this);
		cube_r80.setRotationPoint(-1.5F, -29.0429F, 25.659F);
		bone84.addChild(cube_r80);
		setRotationAngle(cube_r80, -0.4363F, 0.0F, 0.0F);
		

		bone85 = new ModelRenderer(this);
		bone85.setRotationPoint(-4.0F, 0.0F, 0.0F);
		stock.addChild(bone85);
		

		cube_r81 = new ModelRenderer(this);
		cube_r81.setRotationPoint(0.5F, -28.16F, 32.4035F);
		bone85.addChild(cube_r81);
		setRotationAngle(cube_r81, -1.2217F, 0.0F, 0.0F);
		

		cube_r82 = new ModelRenderer(this);
		cube_r82.setRotationPoint(0.5F, -29.6138F, 31.1873F);
		bone85.addChild(cube_r82);
		setRotationAngle(cube_r82, -0.9599F, 0.0F, 0.0F);
		cube_r82.cubeList.add(new ModelBox(cube_r82, 111, 61, -0.49F, 0.2618F, -1.1555F, 1, 1, 3, 0.0F, false));

		cube_r83 = new ModelRenderer(this);
		cube_r83.setRotationPoint(0.5F, -29.2004F, 31.6581F);
		bone85.addChild(cube_r83);
		setRotationAngle(cube_r83, -0.829F, 0.0F, 0.0F);
		

		cube_r84 = new ModelRenderer(this);
		cube_r84.setRotationPoint(0.5F, -31.0536F, 23.8772F);
		bone85.addChild(cube_r84);
		setRotationAngle(cube_r84, 0.6109F, 0.0F, 0.0F);
		

		cube_r85 = new ModelRenderer(this);
		cube_r85.setRotationPoint(0.5F, -29.5511F, 26.7445F);
		bone85.addChild(cube_r85);
		setRotationAngle(cube_r85, -0.3491F, 0.0F, 0.0F);
		

		cube_r86 = new ModelRenderer(this);
		cube_r86.setRotationPoint(0.5F, -29.8011F, 26.7445F);
		bone85.addChild(cube_r86);
		setRotationAngle(cube_r86, -0.3491F, 0.0F, 0.0F);
		cube_r86.cubeList.add(new ModelBox(cube_r86, 0, 34, -0.509F, 5.331F, -16.0954F, 1, 1, 9, 0.0F, false));

		bone78 = new ModelRenderer(this);
		bone78.setRotationPoint(1.0F, -31.0F, 25.0F);
		stock.addChild(bone78);
		bone78.cubeList.add(new ModelBox(bone78, 4, 74, -0.99F, -7.5F, 13.7F, 1, 8, 1, 0.0F, false));
		bone78.cubeList.add(new ModelBox(bone78, 23, 52, -1.0F, -7.7981F, 11.7716F, 1, 6, 2, 0.0F, false));
		bone78.cubeList.add(new ModelBox(bone78, 121, 89, -1.01F, -1.7981F, 12.7716F, 1, 1, 1, 0.0F, false));
		bone78.cubeList.add(new ModelBox(bone78, 121, 0, -1.0F, -8.7981F, 12.7716F, 1, 1, 1, 0.0F, false));

		cube_r87 = new ModelRenderer(this);
		cube_r87.setRotationPoint(-0.5F, -9.6425F, 12.9927F);
		bone78.addChild(cube_r87);
		setRotationAngle(cube_r87, -0.2182F, 0.0F, 0.0F);
		cube_r87.cubeList.add(new ModelBox(cube_r87, 75, 20, -0.49F, 0.0649F, -0.7929F, 1, 2, 1, 0.0F, false));

		cube_r88 = new ModelRenderer(this);
		cube_r88.setRotationPoint(-0.0436F, -5.2962F, 13.5716F);
		bone78.addChild(cube_r88);
		setRotationAngle(cube_r88, -0.0873F, 0.0F, -0.0873F);
		cube_r88.cubeList.add(new ModelBox(cube_r88, 58, 104, -0.5F, -3.4738F, -0.7989F, 1, 7, 1, 0.0F, false));

		cube_r89 = new ModelRenderer(this);
		cube_r89.setRotationPoint(-0.5F, -0.2044F, 14.0616F);
		bone78.addChild(cube_r89);
		setRotationAngle(cube_r89, -0.8727F, 0.0F, 0.0F);
		cube_r89.cubeList.add(new ModelBox(cube_r89, 23, 88, -0.5F, -0.2702F, -2.6928F, 1, 1, 3, 0.0F, false));

		cube_r90 = new ModelRenderer(this);
		cube_r90.setRotationPoint(-0.5F, -7.9064F, 13.4255F);
		bone78.addChild(cube_r90);
		setRotationAngle(cube_r90, 0.2182F, 0.0F, 0.0F);
		cube_r90.cubeList.add(new ModelBox(cube_r90, 47, 122, -0.51F, -2.0649F, -0.7929F, 1, 1, 1, 0.0F, false));

		cube_r91 = new ModelRenderer(this);
		cube_r91.setRotationPoint(-0.5F, -8.195F, 14.1242F);
		bone78.addChild(cube_r91);
		setRotationAngle(cube_r91, 0.4363F, 0.0F, 0.0F);
		cube_r91.cubeList.add(new ModelBox(cube_r91, 41, 5, -0.5F, -2.1268F, -0.7719F, 1, 3, 1, 0.0F, false));

		bone82 = new ModelRenderer(this);
		bone82.setRotationPoint(-4.0F, -31.0F, 25.0F);
		stock.addChild(bone82);
		bone82.cubeList.add(new ModelBox(bone82, 0, 74, -0.01F, -7.5F, 13.7F, 1, 8, 1, 0.0F, false));
		bone82.cubeList.add(new ModelBox(bone82, 0, 52, 0.0F, -7.7981F, 11.7716F, 1, 6, 2, 0.0F, false));
		bone82.cubeList.add(new ModelBox(bone82, 119, 45, 0.01F, -1.7981F, 12.7716F, 1, 1, 1, 0.0F, false));
		bone82.cubeList.add(new ModelBox(bone82, 119, 43, 0.0F, -8.7981F, 12.7716F, 1, 1, 1, 0.0F, false));

		cube_r92 = new ModelRenderer(this);
		cube_r92.setRotationPoint(0.5F, -9.6425F, 12.9927F);
		bone82.addChild(cube_r92);
		setRotationAngle(cube_r92, -0.2182F, 0.0F, 0.0F);
		cube_r92.cubeList.add(new ModelBox(cube_r92, 42, 74, -0.51F, 0.0649F, -0.7929F, 1, 2, 1, 0.0F, false));

		cube_r93 = new ModelRenderer(this);
		cube_r93.setRotationPoint(0.0436F, -5.2962F, 13.5716F);
		bone82.addChild(cube_r93);
		setRotationAngle(cube_r93, -0.0873F, 0.0F, 0.0873F);
		cube_r93.cubeList.add(new ModelBox(cube_r93, 82, 20, -0.5F, -3.4738F, -0.7989F, 1, 7, 1, 0.0F, false));

		cube_r94 = new ModelRenderer(this);
		cube_r94.setRotationPoint(0.5F, -0.2044F, 14.0616F);
		bone82.addChild(cube_r94);
		setRotationAngle(cube_r94, -0.8727F, 0.0F, 0.0F);
		cube_r94.cubeList.add(new ModelBox(cube_r94, 11, 88, -0.5F, -0.2702F, -2.6928F, 1, 1, 3, 0.0F, false));

		cube_r95 = new ModelRenderer(this);
		cube_r95.setRotationPoint(0.5F, -7.9064F, 13.4255F);
		bone82.addChild(cube_r95);
		setRotationAngle(cube_r95, 0.2182F, 0.0F, 0.0F);
		cube_r95.cubeList.add(new ModelBox(cube_r95, 113, 120, -0.49F, -2.0649F, -0.7929F, 1, 1, 1, 0.0F, false));

		cube_r96 = new ModelRenderer(this);
		cube_r96.setRotationPoint(0.5F, -8.195F, 14.1242F);
		bone82.addChild(cube_r96);
		setRotationAngle(cube_r96, 0.4363F, 0.0F, 0.0F);
		cube_r96.cubeList.add(new ModelBox(cube_r96, 41, 0, -0.5F, -2.1268F, -0.7719F, 1, 3, 1, 0.0F, false));

		bone87 = new ModelRenderer(this);
		bone87.setRotationPoint(-0.25F, 0.0F, 0.0F);
		stock.addChild(bone87);
		

		cube_r97 = new ModelRenderer(this);
		cube_r97.setRotationPoint(-2.5F, -30.5977F, 39.8724F);
		bone87.addChild(cube_r97);
		setRotationAngle(cube_r97, -0.3054F, -0.3054F, -0.7854F);
		

		cube_r98 = new ModelRenderer(this);
		cube_r98.setRotationPoint(0.0F, -30.5977F, 39.8724F);
		bone87.addChild(cube_r98);
		setRotationAngle(cube_r98, -0.3054F, -0.3054F, -0.7854F);
		

		cube_r99 = new ModelRenderer(this);
		cube_r99.setRotationPoint(-2.5F, -32.3477F, 39.8724F);
		bone87.addChild(cube_r99);
		setRotationAngle(cube_r99, -0.3054F, -0.3054F, -0.7854F);
		

		cube_r100 = new ModelRenderer(this);
		cube_r100.setRotationPoint(0.0F, -32.3477F, 39.8724F);
		bone87.addChild(cube_r100);
		setRotationAngle(cube_r100, -0.3054F, -0.3054F, -0.7854F);
		

		cube_r101 = new ModelRenderer(this);
		cube_r101.setRotationPoint(-2.5F, -34.0977F, 39.8724F);
		bone87.addChild(cube_r101);
		setRotationAngle(cube_r101, -0.3054F, -0.3054F, -0.7854F);
		

		cube_r102 = new ModelRenderer(this);
		cube_r102.setRotationPoint(0.0F, -34.0977F, 39.8724F);
		bone87.addChild(cube_r102);
		setRotationAngle(cube_r102, -0.3054F, -0.3054F, -0.7854F);
		

		cube_r103 = new ModelRenderer(this);
		cube_r103.setRotationPoint(-2.5F, -35.8477F, 39.8724F);
		bone87.addChild(cube_r103);
		setRotationAngle(cube_r103, -0.3054F, -0.3054F, -0.7854F);
		

		cube_r104 = new ModelRenderer(this);
		cube_r104.setRotationPoint(0.0F, -35.8477F, 39.8724F);
		bone87.addChild(cube_r104);
		setRotationAngle(cube_r104, -0.3054F, -0.3054F, -0.7854F);
		

		cube_r105 = new ModelRenderer(this);
		cube_r105.setRotationPoint(-1.25F, -28.5977F, 39.1224F);
		bone87.addChild(cube_r105);
		setRotationAngle(cube_r105, -0.3054F, -0.3054F, -0.7854F);
		

		cube_r106 = new ModelRenderer(this);
		cube_r106.setRotationPoint(-1.25F, -37.5977F, 39.8724F);
		bone87.addChild(cube_r106);
		setRotationAngle(cube_r106, -0.3054F, -0.3054F, -0.7854F);
		

		bone86 = new ModelRenderer(this);
		bone86.setRotationPoint(0.0F, 0.0F, 0.0F);
		stock.addChild(bone86);
		

		cube_r107 = new ModelRenderer(this);
		cube_r107.setRotationPoint(-1.5F, -31.25F, 21.5F);
		bone86.addChild(cube_r107);
		setRotationAngle(cube_r107, -0.2618F, -0.6981F, 0.1309F);
		

		bone75 = new ModelRenderer(this);
		bone75.setRotationPoint(0.0F, 0.0F, 0.0F);
		stock.addChild(bone75);
		

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone75.addChild(bone23);
		

		cube_r108 = new ModelRenderer(this);
		cube_r108.setRotationPoint(-0.1577F, -42.1056F, 33.4415F);
		bone23.addChild(cube_r108);
		setRotationAngle(cube_r108, 0.0F, 0.0F, 0.6545F);
		cube_r108.cubeList.add(new ModelBox(cube_r108, 26, 26, -0.5F, -0.5F, -2.3F, 1, 1, 7, 0.0F, false));

		bone74 = new ModelRenderer(this);
		bone74.setRotationPoint(-4.0F, 0.0F, 0.0F);
		bone75.addChild(bone74);
		

		cube_r109 = new ModelRenderer(this);
		cube_r109.setRotationPoint(1.1577F, -42.1056F, 33.4415F);
		bone74.addChild(cube_r109);
		setRotationAngle(cube_r109, 0.0F, 0.0F, -0.6545F);
		cube_r109.cubeList.add(new ModelBox(cube_r109, 26, 3, -0.5F, -0.5F, -2.3F, 1, 1, 7, 0.0F, false));

		bone76 = new ModelRenderer(this);
		bone76.setRotationPoint(0.0F, 0.0F, -10.0F);
		stock.addChild(bone76);
		

		bone77 = new ModelRenderer(this);
		bone77.setRotationPoint(0.0F, 0.0F, -0.25F);
		bone76.addChild(bone77);
		

		cube_r110 = new ModelRenderer(this);
		cube_r110.setRotationPoint(-0.4195F, -40.6048F, 37.6736F);
		bone77.addChild(cube_r110);
		setRotationAngle(cube_r110, 0.829F, -0.6109F, 0.6981F);
		cube_r110.cubeList.add(new ModelBox(cube_r110, 65, 57, 1.0487F, 1.1306F, -0.5058F, 1, 1, 4, 0.0F, false));

		bone79 = new ModelRenderer(this);
		bone79.setRotationPoint(-3.0F, 0.0F, -0.25F);
		bone76.addChild(bone79);
		

		cube_r111 = new ModelRenderer(this);
		cube_r111.setRotationPoint(0.4195F, -40.6048F, 37.6736F);
		bone79.addChild(cube_r111);
		setRotationAngle(cube_r111, 0.829F, 0.6109F, -0.6981F);
		cube_r111.cubeList.add(new ModelBox(cube_r111, 65, 52, -2.0487F, 1.1306F, -0.5058F, 1, 1, 4, 0.0F, false));

		bone80 = new ModelRenderer(this);
		bone80.setRotationPoint(0.0F, 0.0F, -10.0F);
		stock.addChild(bone80);
		

		bone81 = new ModelRenderer(this);
		bone81.setRotationPoint(0.0F, 0.0F, -0.25F);
		bone80.addChild(bone81);
		

		cube_r112 = new ModelRenderer(this);
		cube_r112.setRotationPoint(0.0F, -41.1622F, 38.7163F);
		bone81.addChild(cube_r112);
		setRotationAngle(cube_r112, 0.9599F, 0.0F, 0.0F);
		cube_r112.cubeList.add(new ModelBox(cube_r112, 124, 105, -0.5F, 1.7117F, 1.0487F, 1, 1, 1, 0.0F, false));

		bone83 = new ModelRenderer(this);
		bone83.setRotationPoint(-3.0F, 0.0F, -0.25F);
		bone80.addChild(bone83);
		

		cube_r113 = new ModelRenderer(this);
		cube_r113.setRotationPoint(0.0F, -41.1622F, 38.7163F);
		bone83.addChild(cube_r113);
		setRotationAngle(cube_r113, 0.9599F, 0.0F, 0.0F);
		cube_r113.cubeList.add(new ModelBox(cube_r113, 123, 26, -0.5F, 1.7117F, 1.0487F, 1, 1, 1, 0.0F, false));

		bone68 = new ModelRenderer(this);
		bone68.setRotationPoint(1.0F, 0.0F, 0.0F);
		stock.addChild(bone68);
		

		bone50 = new ModelRenderer(this);
		bone50.setRotationPoint(0.0F, -39.75F, 7.5F);
		bone68.addChild(bone50);
		

		cube_r114 = new ModelRenderer(this);
		cube_r114.setRotationPoint(-0.6964F, -0.8772F, 7.5F);
		bone50.addChild(cube_r114);
		setRotationAngle(cube_r114, 0.0F, 0.0F, -0.9599F);
		

		bone63 = new ModelRenderer(this);
		bone63.setRotationPoint(-0.5F, -37.25F, 14.5F);
		bone68.addChild(bone63);
		setRotationAngle(bone63, 0.4363F, 0.0F, 0.0F);
		

		bone55 = new ModelRenderer(this);
		bone55.setRotationPoint(-0.5F, -37.25F, 15.5F);
		bone68.addChild(bone55);
		setRotationAngle(bone55, -0.4363F, 0.0F, 0.0F);
		

		bone72 = new ModelRenderer(this);
		bone72.setRotationPoint(-3.0F, -36.7518F, 14.7608F);
		stock.addChild(bone72);
		bone72.cubeList.add(new ModelBox(bone72, 0, 63, -0.3694F, -3.4561F, 4.7F, 1, 6, 2, 0.0F, false));
		bone72.cubeList.add(new ModelBox(bone72, 0, 0, -0.3694F, -3.4561F, -7.3F, 1, 6, 3, 0.0F, false));
		bone72.cubeList.add(new ModelBox(bone72, 72, 0, -0.3694F, 0.5439F, -4.3F, 1, 2, 9, 0.0F, false));
		bone72.cubeList.add(new ModelBox(bone72, 23, 52, -0.3694F, -3.4561F, -4.3F, 1, 2, 9, 0.0F, false));

		cube_r115 = new ModelRenderer(this);
		cube_r115.setRotationPoint(0.4611F, -0.9647F, 3.5F);
		bone72.addChild(cube_r115);
		setRotationAngle(cube_r115, -0.5672F, 0.0F, 0.0F);
		

		cube_r116 = new ModelRenderer(this);
		cube_r116.setRotationPoint(0.3306F, 0.0439F, -3.5F);
		bone72.addChild(cube_r116);
		setRotationAngle(cube_r116, 0.7854F, 0.0F, 0.0F);
		

		bone70 = new ModelRenderer(this);
		bone70.setRotationPoint(-4.0F, 0.0F, 0.0F);
		stock.addChild(bone70);
		

		bone71 = new ModelRenderer(this);
		bone71.setRotationPoint(0.0F, -39.75F, 7.5F);
		bone70.addChild(bone71);
		

		cube_r117 = new ModelRenderer(this);
		cube_r117.setRotationPoint(-0.6176F, -1.4855F, 7.4736F);
		bone71.addChild(cube_r117);
		setRotationAngle(cube_r117, 0.0F, 0.0F, -1.1345F);
		

		bone64 = new ModelRenderer(this);
		bone64.setRotationPoint(1.25F, 0.0F, 0.0F);
		stock.addChild(bone64);
		

		bone31 = new ModelRenderer(this);
		bone31.setRotationPoint(0.0F, 0.0F, 0.0F);
		stock.addChild(bone31);
		

		cube_r118 = new ModelRenderer(this);
		cube_r118.setRotationPoint(0.5F, -32.8629F, 10.6708F);
		bone31.addChild(cube_r118);
		setRotationAngle(cube_r118, 1.789F, 0.0F, 0.0F);
		

		cube_r119 = new ModelRenderer(this);
		cube_r119.setRotationPoint(0.5F, -33.1994F, 12.7434F);
		bone31.addChild(cube_r119);
		setRotationAngle(cube_r119, 1.5708F, 0.0F, 0.0F);
		

		cube_r120 = new ModelRenderer(this);
		cube_r120.setRotationPoint(0.5F, -32.7665F, 9.7908F);
		bone31.addChild(cube_r120);
		setRotationAngle(cube_r120, 1.5708F, 0.0F, 0.0F);
		

		cube_r121 = new ModelRenderer(this);
		cube_r121.setRotationPoint(0.5F, -32.9495F, 9.1078F);
		bone31.addChild(cube_r121);
		setRotationAngle(cube_r121, 1.0472F, 0.0F, 0.0F);
		

		cube_r122 = new ModelRenderer(this);
		cube_r122.setRotationPoint(0.5F, -34.2102F, 7.7801F);
		bone31.addChild(cube_r122);
		setRotationAngle(cube_r122, 0.7418F, 0.0F, 0.0F);
		

		cube_r123 = new ModelRenderer(this);
		cube_r123.setRotationPoint(0.5F, -34.3298F, 12.4346F);
		bone31.addChild(cube_r123);
		setRotationAngle(cube_r123, 0.8727F, 0.0F, 0.0F);
		

		cube_r124 = new ModelRenderer(this);
		cube_r124.setRotationPoint(0.5F, -34.9115F, 11.6766F);
		bone31.addChild(cube_r124);
		setRotationAngle(cube_r124, 0.9599F, 0.0F, 0.0F);
		

		cube_r125 = new ModelRenderer(this);
		cube_r125.setRotationPoint(0.5F, -35.7199F, 9.9766F);
		bone31.addChild(cube_r125);
		setRotationAngle(cube_r125, 1.1781F, 0.0F, 0.0F);
		

		cube_r126 = new ModelRenderer(this);
		cube_r126.setRotationPoint(0.5F, -36.5224F, 8.2464F);
		bone31.addChild(cube_r126);
		setRotationAngle(cube_r126, 1.0036F, 0.0F, 0.0F);
		

		cube_r127 = new ModelRenderer(this);
		cube_r127.setRotationPoint(0.5F, -36.0936F, 6.4773F);
		bone31.addChild(cube_r127);
		setRotationAngle(cube_r127, 0.3927F, 0.0F, 0.0F);
		

		cube_r128 = new ModelRenderer(this);
		cube_r128.setRotationPoint(-3.3036F, -41.6272F, 6.25F);
		bone31.addChild(cube_r128);
		setRotationAngle(cube_r128, 0.0F, 0.0F, -0.6109F);
		

		cube_r129 = new ModelRenderer(this);
		cube_r129.setRotationPoint(0.3036F, -41.6272F, 6.25F);
		bone31.addChild(cube_r129);
		setRotationAngle(cube_r129, 0.0F, 0.0F, -0.9599F);
		

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(-3.0F, 0.0F, 0.0F);
		stock.addChild(bone11);
		

		cube_r130 = new ModelRenderer(this);
		cube_r130.setRotationPoint(-0.5F, -32.8629F, 10.6708F);
		bone11.addChild(cube_r130);
		setRotationAngle(cube_r130, 1.789F, 0.0F, 0.0F);
		

		cube_r131 = new ModelRenderer(this);
		cube_r131.setRotationPoint(-0.5F, -33.1994F, 12.7434F);
		bone11.addChild(cube_r131);
		setRotationAngle(cube_r131, 1.5708F, 0.0F, 0.0F);
		

		cube_r132 = new ModelRenderer(this);
		cube_r132.setRotationPoint(-0.5F, -32.7665F, 9.7908F);
		bone11.addChild(cube_r132);
		setRotationAngle(cube_r132, 1.5708F, 0.0F, 0.0F);
		

		cube_r133 = new ModelRenderer(this);
		cube_r133.setRotationPoint(-0.5F, -32.9495F, 9.1078F);
		bone11.addChild(cube_r133);
		setRotationAngle(cube_r133, 1.0472F, 0.0F, 0.0F);
		

		cube_r134 = new ModelRenderer(this);
		cube_r134.setRotationPoint(-0.5F, -34.2102F, 7.7801F);
		bone11.addChild(cube_r134);
		setRotationAngle(cube_r134, 0.7418F, 0.0F, 0.0F);
		

		cube_r135 = new ModelRenderer(this);
		cube_r135.setRotationPoint(-0.5F, -34.3298F, 12.4346F);
		bone11.addChild(cube_r135);
		setRotationAngle(cube_r135, 0.8727F, 0.0F, 0.0F);
		

		cube_r136 = new ModelRenderer(this);
		cube_r136.setRotationPoint(-0.5F, -34.9115F, 11.6766F);
		bone11.addChild(cube_r136);
		setRotationAngle(cube_r136, 0.9599F, 0.0F, 0.0F);
		

		cube_r137 = new ModelRenderer(this);
		cube_r137.setRotationPoint(-0.5F, -35.7199F, 9.9766F);
		bone11.addChild(cube_r137);
		setRotationAngle(cube_r137, 1.1781F, 0.0F, 0.0F);
		

		cube_r138 = new ModelRenderer(this);
		cube_r138.setRotationPoint(-0.5F, -36.5224F, 8.2464F);
		bone11.addChild(cube_r138);
		setRotationAngle(cube_r138, 1.0036F, 0.0F, 0.0F);
		

		cube_r139 = new ModelRenderer(this);
		cube_r139.setRotationPoint(-0.5F, -36.0936F, 6.4773F);
		bone11.addChild(cube_r139);
		setRotationAngle(cube_r139, 0.3927F, 0.0F, 0.0F);
		

		bolts5 = new ModelRenderer(this);
		bolts5.setRotationPoint(2.0F, -34.0F, -25.0F);
		gun.addChild(bolts5);
		setRotationAngle(bolts5, -0.7854F, 0.0F, 0.0F);
		

		bolts2 = new ModelRenderer(this);
		bolts2.setRotationPoint(-1.5F, -40.5018F, -27.2392F);
		gun.addChild(bolts2);
		setRotationAngle(bolts2, 0.0F, 0.7854F, 0.0F);
		

		barrel = new ModelRenderer(this);
		barrel.setRotationPoint(0.5F, 0.0F, 0.0F);
		gun.addChild(barrel);
		barrel.cubeList.add(new ModelBox(barrel, 108, 43, -2.75F, -37.25F, -57.5F, 1, 1, 9, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 74, -2.75F, -36.75F, -57.5F, 1, 1, 9, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 23, 63, -2.25F, -36.75F, -57.5F, 1, 1, 9, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 23, 74, -2.25F, -37.25F, -57.5F, 1, 1, 9, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 58, 104, -2.5F, -37.5F, -57.5F, 1, 1, 9, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 84, -2.5F, -36.5F, -57.5F, 1, 1, 9, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 110, 95, -2.0F, -37.0F, -57.5F, 1, 1, 9, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 23, 84, -3.0F, -37.0F, -57.5F, 1, 1, 9, 0.0F, false));

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(1.0F, -35.25F, -50.5F);
		barrel.addChild(bone18);
		bone18.cubeList.add(new ModelBox(bone18, 55, 143, -3.5F, -2.75F, -13.0F, 1, 1, 6, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 29, 143, -3.5F, -0.75F, -13.0F, 1, 1, 6, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 91, 85, -4.5F, -1.75F, -13.0F, 3, 1, 6, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 143, 7, -4.25F, -2.25F, -13.0F, 1, 1, 6, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 102, 142, -4.0F, -2.5F, -13.0F, 1, 1, 6, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 143, 0, -3.0F, -2.5F, -13.0F, 1, 1, 6, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 141, 74, -2.75F, -2.25F, -13.0F, 1, 1, 6, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 0, 143, -3.0F, -1.0F, -13.0F, 1, 1, 6, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 138, 140, -2.75F, -1.25F, -13.0F, 1, 1, 6, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 142, 115, -4.25F, -1.25F, -13.0F, 1, 1, 6, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 130, 139, -4.0F, -1.0F, -13.0F, 1, 1, 6, 0.0F, false));

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(1.0F, -35.25F, -35.75F);
		barrel.addChild(bone19);
		bone19.cubeList.add(new ModelBox(bone19, 137, 29, -3.5F, -2.75F, -13.0F, 1, 1, 6, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 137, 15, -3.5F, -0.75F, -13.0F, 1, 1, 6, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 91, 76, -4.5F, -1.75F, -13.0F, 3, 1, 6, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 134, 114, -4.25F, -2.25F, -13.0F, 1, 1, 6, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 50, 134, -4.0F, -2.5F, -13.0F, 1, 1, 6, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 133, 73, -3.0F, -2.5F, -13.0F, 1, 1, 6, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 42, 133, -2.75F, -2.25F, -13.0F, 1, 1, 6, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 22, 132, -3.0F, -1.0F, -13.0F, 1, 1, 6, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 14, 131, -2.75F, -1.25F, -13.0F, 1, 1, 6, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 62, 129, -4.25F, -1.25F, -13.0F, 1, 1, 6, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 105, 118, -4.0F, -1.0F, -13.0F, 1, 1, 6, 0.0F, false));

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(1.0F, -35.25F, -34.25F);
		barrel.addChild(bone20);
		

		grip = new ModelRenderer(this);
		grip.setRotationPoint(0.0F, 0.0F, 0.0F);
		gun.addChild(grip);
		

		grip1 = new ModelRenderer(this);
		grip1.setRotationPoint(-3.5F, -31.5F, -7.0F);
		grip.addChild(grip1);
		

		grip1_r1 = new ModelRenderer(this);
		grip1_r1.setRotationPoint(2.0F, 0.2258F, 4.8346F);
		grip1.addChild(grip1_r1);
		setRotationAngle(grip1_r1, 0.1745F, 0.0F, 0.0F);
		grip1_r1.cubeList.add(new ModelBox(grip1_r1, 145, 14, -2.002F, -2.0F, -3.0F, 4, 4, 3, 0.0F, false));

		grip2 = new ModelRenderer(this);
		grip2.setRotationPoint(-3.5F, -27.5F, -5.5F);
		grip.addChild(grip2);
		setRotationAngle(grip2, 0.2603F, 0.0F, 0.0F);
		

		grip3 = new ModelRenderer(this);
		grip3.setRotationPoint(-3.5F, -24.2F, 1.5F);
		grip.addChild(grip3);
		setRotationAngle(grip3, -1.3384F, 0.0F, 0.0F);
		

		grip4_r1 = new ModelRenderer(this);
		grip4_r1.setRotationPoint(2.0F, 1.9327F, 4.3154F);
		grip3.addChild(grip4_r1);
		setRotationAngle(grip4_r1, -1.2654F, 0.0F, 0.0F);
		

		grip3_r1 = new ModelRenderer(this);
		grip3_r1.setRotationPoint(2.0F, 1.4998F, 2.5267F);
		grip3.addChild(grip3_r1);
		setRotationAngle(grip3_r1, -0.2618F, 0.0F, 0.0F);
		

		grip4 = new ModelRenderer(this);
		grip4.setRotationPoint(-3.5F, -24.2F, 1.5F);
		grip.addChild(grip4);
		setRotationAngle(grip4, -2.6769F, 0.0F, 0.0F);
		grip4.cubeList.add(new ModelBox(grip4, 0, 131, -0.002F, 0.1853F, -0.0322F, 4, 5, 3, 0.0F, false));
		grip4.cubeList.add(new ModelBox(grip4, 0, 131, -0.002F, -1.8147F, -0.0322F, 4, 2, 3, 0.0F, false));
		grip4.cubeList.add(new ModelBox(grip4, 0, 131, 0.0F, 3.2096F, 1.3037F, 4, 5, 3, 0.0F, false));
		grip4.cubeList.add(new ModelBox(grip4, 0, 131, 0.0F, -1.7904F, 1.3037F, 4, 5, 3, 0.0F, false));

		grip5 = new ModelRenderer(this);
		grip5.setRotationPoint(-3.5F, -31.5F, -1.5F);
		grip.addChild(grip5);
		

		grip5_r1 = new ModelRenderer(this);
		grip5_r1.setRotationPoint(2.0F, 1.4395F, -0.9638F);
		grip5.addChild(grip5_r1);
		setRotationAngle(grip5_r1, 0.6981F, 0.0F, 0.0F);
		grip5_r1.cubeList.add(new ModelBox(grip5_r1, 119, 48, -2.003F, 0.0F, -1.5F, 4, 2, 2, 0.0F, false));

		grip11 = new ModelRenderer(this);
		grip11.setRotationPoint(-3.5F, -27.5F, -5.5F);
		grip.addChild(grip11);
		setRotationAngle(grip11, 0.2603F, 0.0F, 0.0F);
		

		grip12 = new ModelRenderer(this);
		grip12.setRotationPoint(-3.5F, -18.5F, -4.2F);
		grip.addChild(grip12);
		setRotationAngle(grip12, 0.9295F, 0.0F, 0.0F);
		

		grip12_r2 = new ModelRenderer(this);
		grip12_r2.setRotationPoint(2.0F, 0.2365F, 1.1617F);
		grip12.addChild(grip12_r2);
		setRotationAngle(grip12_r2, 0.2618F, 0.0F, 0.0F);
		

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(2.0F, -1.5632F, 2.1717F);
		grip12.addChild(bone2);
		

		grip14_r2 = new ModelRenderer(this);
		grip14_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(grip14_r2);
		setRotationAngle(grip14_r2, 0.829F, 0.0F, 0.0F);
		

		grip14_r3 = new ModelRenderer(this);
		grip14_r3.setRotationPoint(0.0F, -5.5447F, -1.1778F);
		bone2.addChild(grip14_r3);
		setRotationAngle(grip14_r3, 0.6109F, 0.0F, 0.0F);
		

		grip13_r3 = new ModelRenderer(this);
		grip13_r3.setRotationPoint(0.0F, 0.702F, 0.0423F);
		bone2.addChild(grip13_r3);
		setRotationAngle(grip13_r3, 1.4835F, 0.0F, 0.0F);
		

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(2.0F, -4.8591F, 4.0789F);
		grip12.addChild(bone3);
		

		grip16_r4 = new ModelRenderer(this);
		grip16_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(grip16_r4);
		setRotationAngle(grip16_r4, 0.829F, 0.0F, 0.0F);
		

		grip16_r5 = new ModelRenderer(this);
		grip16_r5.setRotationPoint(0.0F, -5.5447F, -1.1778F);
		bone3.addChild(grip16_r5);
		setRotationAngle(grip16_r5, 0.6109F, 0.0F, 0.0F);
		

		grip14_r4 = new ModelRenderer(this);
		grip14_r4.setRotationPoint(0.0F, 0.702F, 0.0423F);
		bone3.addChild(grip14_r4);
		setRotationAngle(grip14_r4, 1.4835F, 0.0F, 0.0F);
		

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(2.0F, -7.6555F, 5.735F);
		grip12.addChild(bone4);
		

		grip17_r3 = new ModelRenderer(this);
		grip17_r3.setRotationPoint(0.0F, -1.1618F, 3.4895F);
		bone4.addChild(grip17_r3);
		setRotationAngle(grip17_r3, 0.7854F, 0.0F, 0.0F);
		grip17_r3.cubeList.add(new ModelBox(grip17_r3, 64, 136, -2.0F, -0.5F, -1.5F, 4, 2, 3, 0.0F, false));

		grip16_r6 = new ModelRenderer(this);
		grip16_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone4.addChild(grip16_r6);
		setRotationAngle(grip16_r6, 0.829F, 0.0F, 0.0F);
		

		grip16_r7 = new ModelRenderer(this);
		grip16_r7.setRotationPoint(0.0F, -0.8645F, 1.1972F);
		bone4.addChild(grip16_r7);
		setRotationAngle(grip16_r7, 0.0873F, 0.0F, 0.0F);
		

		grip17_r4 = new ModelRenderer(this);
		grip17_r4.setRotationPoint(0.0F, 0.702F, 0.0423F);
		bone4.addChild(grip17_r4);
		setRotationAngle(grip17_r4, 1.4835F, 0.0F, 0.0F);
		

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-1.5F, -24.0644F, -1.8898F);
		grip.addChild(bone);
		setRotationAngle(bone, 1.041F, 0.0F, 0.0F);
		

		grip9_r1 = new ModelRenderer(this);
		grip9_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(grip9_r1);
		setRotationAngle(grip9_r1, -1.6842F, 0.0F, 0.0F);
		grip9_r1.cubeList.add(new ModelBox(grip9_r1, 103, 76, -2.001F, -8.7864F, -6.1881F, 4, 4, 2, 0.0F, false));

		grip8_r1 = new ModelRenderer(this);
		grip8_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(grip8_r1);
		setRotationAngle(grip8_r1, -1.0908F, 0.0F, 0.0F);
		grip8_r1.cubeList.add(new ModelBox(grip8_r1, 11, 57, -2.0F, -8.4664F, -1.348F, 4, 3, 1, 0.0F, false));

		outline2 = new ModelRenderer(this);
		outline2.setRotationPoint(-3.5F, -27.5F, -7.0F);
		grip.addChild(outline2);
		setRotationAngle(outline2, 1.041F, 0.0F, 0.0F);
		

		fingerguard2 = new ModelRenderer(this);
		fingerguard2.setRotationPoint(2.0F, -10.0719F, -0.4702F);
		outline2.addChild(fingerguard2);
		setRotationAngle(fingerguard2, -1.0472F, 0.0F, 0.0F);
		fingerguard2.cubeList.add(new ModelBox(fingerguard2, 13, 138, -1.002F, -1.0664F, -1.6639F, 2, 2, 1, 0.0F, false));
		fingerguard2.cubeList.add(new ModelBox(fingerguard2, 111, 26, -1.001F, 4.1244F, 0.9492F, 2, 1, 2, 0.0F, false));

		cube_r140 = new ModelRenderer(this);
		cube_r140.setRotationPoint(0.0F, 1.2957F, 0.3622F);
		fingerguard2.addChild(cube_r140);
		setRotationAngle(cube_r140, -0.3491F, 0.0F, 0.0F);
		

		cube_r141 = new ModelRenderer(this);
		cube_r141.setRotationPoint(0.0F, 4.4199F, 0.8875F);
		fingerguard2.addChild(cube_r141);
		setRotationAngle(cube_r141, 0.8727F, 0.0F, 0.0F);
		cube_r141.cubeList.add(new ModelBox(cube_r141, 107, 71, -1.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

		cube_r142 = new ModelRenderer(this);
		cube_r142.setRotationPoint(0.0F, 3.8072F, 0.3958F);
		fingerguard2.addChild(cube_r142);
		setRotationAngle(cube_r142, 0.48F, 0.0F, 0.0F);
		cube_r142.cubeList.add(new ModelBox(cube_r142, 0, 109, -1.002F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));
		cube_r142.cubeList.add(new ModelBox(cube_r142, 0, 109, -1.002F, -1.5F, -0.5F, 2, 1, 1, 0.0F, false));
		cube_r142.cubeList.add(new ModelBox(cube_r142, 0, 109, -1.002F, -2.5F, -0.5F, 2, 1, 1, 0.0F, false));
		cube_r142.cubeList.add(new ModelBox(cube_r142, 0, 109, -1.002F, -3.5F, -0.5F, 2, 1, 1, 0.0F, false));

		cube_r143 = new ModelRenderer(this);
		cube_r143.setRotationPoint(0.0F, 4.0927F, 7.117F);
		fingerguard2.addChild(cube_r143);
		setRotationAngle(cube_r143, 0.5236F, 0.0F, 0.0F);
		

		cube_r144 = new ModelRenderer(this);
		cube_r144.setRotationPoint(0.0F, 4.5391F, 3.9018F);
		fingerguard2.addChild(cube_r144);
		setRotationAngle(cube_r144, 0.0873F, 0.0F, 0.0F);
		cube_r144.cubeList.add(new ModelBox(cube_r144, 119, 43, -1.0F, -0.5F, -1.0F, 2, 1, 4, 0.0F, false));
		cube_r144.cubeList.add(new ModelBox(cube_r144, 119, 43, -1.0F, -0.5F, 3.0F, 2, 1, 4, 0.0F, false));

		cube_r145 = new ModelRenderer(this);
		cube_r145.setRotationPoint(0.0F, 1.653F, 7.9696F);
		fingerguard2.addChild(cube_r145);
		setRotationAngle(cube_r145, 0.6109F, 0.0F, 0.0F);
		

		cube_r146 = new ModelRenderer(this);
		cube_r146.setRotationPoint(0.0F, 0.4993F, 7.9797F);
		fingerguard2.addChild(cube_r146);
		setRotationAngle(cube_r146, -0.7418F, 0.0F, 0.0F);
		

		outline3 = new ModelRenderer(this);
		outline3.setRotationPoint(-3.5F, -27.5F, -7.0F);
		grip.addChild(outline3);
		setRotationAngle(outline3, 1.041F, 0.0F, 0.0F);
		

		triggermagrelease2 = new ModelRenderer(this);
		triggermagrelease2.setRotationPoint(1.5F, -10.9348F, -0.9756F);
		outline3.addChild(triggermagrelease2);
		setRotationAngle(triggermagrelease2, -1.0472F, 0.0F, 0.0F);
		

		trigger2 = new ModelRenderer(this);
		trigger2.setRotationPoint(0.0F, 2.9254F, 5.9662F);
		triggermagrelease2.addChild(trigger2);
		trigger2.cubeList.add(new ModelBox(trigger2, 35, 23, 0.0F, -3.4672F, 0.2836F, 1, 3, 1, 0.0F, false));

		cube_r147 = new ModelRenderer(this);
		cube_r147.setRotationPoint(0.0F, 0.0F, 0.0F);
		trigger2.addChild(cube_r147);
		setRotationAngle(cube_r147, -1.2217F, 0.0F, 0.0F);
		cube_r147.cubeList.add(new ModelBox(cube_r147, 5, 70, 0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r148 = new ModelRenderer(this);
		cube_r148.setRotationPoint(0.0F, -0.4056F, 0.5792F);
		trigger2.addChild(cube_r148);
		setRotationAngle(cube_r148, -0.6981F, 0.0F, 0.0F);
		cube_r148.cubeList.add(new ModelBox(cube_r148, 48, 73, 0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.0F, 0.0F, 0.0F);
		gun.addChild(bone9);
		setRotationAngle(bone9, 0.0F, 0.0F, -0.5236F);
		bone9.cubeList.add(new ModelBox(bone9, 1, 145, 12.4314F, -32.0298F, -45.4712F, 1, 2, 26, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 0, 144, 12.4314F, -32.0298F, -19.4712F, 1, 2, 27, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.0F, 0.0F, 0.0F);
		gun.addChild(bone10);
		setRotationAngle(bone10, 0.0F, 0.0F, 0.5236F);
		bone10.cubeList.add(new ModelBox(bone10, 1, 145, -16.0294F, -30.5298F, -45.4712F, 1, 2, 26, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 0, 144, -16.0294F, -30.5298F, -19.4712F, 1, 2, 27, 0.0F, false));

		carryhandle2 = new ModelRenderer(this);
		carryhandle2.setRotationPoint(-0.5F, -16.9F, 0.1F);
		

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(-0.1F, 0.0F, -36.8F);
		carryhandle2.addChild(bone12);
		bone12.cubeList.add(new ModelBox(bone12, 52, 20, 0.0F, -7.6F, 36.5F, 1, 9, 5, -0.3F, false));
		bone12.cubeList.add(new ModelBox(bone12, 112, 105, -0.001F, -7.6F, 17.3F, 1, 2, 20, -0.3F, false));
		bone12.cubeList.add(new ModelBox(bone12, 56, 118, -2.401F, -6.6F, 13.3F, 3, 1, 23, -0.3F, false));
		bone12.cubeList.add(new ModelBox(bone12, 0, 52, -0.002F, -8.6F, 30.1F, 1, 2, 9, -0.3F, false));
		bone12.cubeList.add(new ModelBox(bone12, 100, 108, 0.2F, -8.4746F, -17.7657F, 1, 3, 4, -0.3F, false));
		bone12.cubeList.add(new ModelBox(bone12, 51, 73, 0.0F, -6.2F, 11.3F, 1, 7, 2, -0.3F, false));
		bone12.cubeList.add(new ModelBox(bone12, 0, 12, -2.4F, -6.2F, 12.3F, 3, 7, 1, -0.3F, false));

		cube_r165 = new ModelRenderer(this);
		cube_r165.setRotationPoint(-0.4F, 0.0F, 0.0F);
		bone12.addChild(cube_r165);
		setRotationAngle(cube_r165, -0.4712F, 0.0F, 0.0F);
		cube_r165.cubeList.add(new ModelBox(cube_r165, 23, 74, -2.003F, -11.5284F, 9.4288F, 3, 3, 1, -0.3F, false));
		cube_r165.cubeList.add(new ModelBox(cube_r165, 110, 99, 0.397F, -11.5284F, 8.4288F, 1, 3, 2, -0.3F, false));

		cube_r166 = new ModelRenderer(this);
		cube_r166.setRotationPoint(-0.4F, 0.0F, 0.0F);
		bone12.addChild(cube_r166);
		setRotationAngle(cube_r166, -0.9599F, 0.0F, 0.0F);
		cube_r166.cubeList.add(new ModelBox(cube_r166, 55, 70, -2.002F, -16.1583F, 3.1436F, 3, 3, 1, -0.3F, false));
		cube_r166.cubeList.add(new ModelBox(cube_r166, 85, 104, 0.398F, -16.1583F, 2.1436F, 1, 3, 2, -0.3F, false));

		cube_r167 = new ModelRenderer(this);
		cube_r167.setRotationPoint(1.0F, 0.9F, -4.7F);
		bone12.addChild(cube_r167);
		setRotationAngle(cube_r167, 0.925F, 0.0F, 0.0F);
		cube_r167.cubeList.add(new ModelBox(cube_r167, 38, 38, -1.001F, 8.0666F, 6.2615F, 1, 2, 10, -0.3F, false));

		cube_r168 = new ModelRenderer(this);
		cube_r168.setRotationPoint(1.0F, 0.9F, -4.7F);
		bone12.addChild(cube_r168);
		setRotationAngle(cube_r168, 0.4712F, 0.0F, 0.0F);
		cube_r168.cubeList.add(new ModelBox(cube_r168, 122, 144, -1.002F, 2.1601F, 14.0987F, 1, 3, 3, -0.3F, false));
		cube_r168.cubeList.add(new ModelBox(cube_r168, 100, 107, -0.999F, 3.5585F, 11.455F, 1, 4, 5, -0.3F, false));

		cube_r169 = new ModelRenderer(this);
		cube_r169.setRotationPoint(0.0F, -13.0F, 36.8F);
		bone12.addChild(cube_r169);
		setRotationAngle(cube_r169, 0.0785F, 0.0F, 0.0F);
		cube_r169.cubeList.add(new ModelBox(cube_r169, 61, 65, -0.001F, 3.8911F, -25.9199F, 1, 2, 28, -0.3F, false));

		cube_r170 = new ModelRenderer(this);
		cube_r170.setRotationPoint(0.0F, 0.0F, 36.8F);
		bone12.addChild(cube_r170);
		setRotationAngle(cube_r170, 0.2618F, 0.0F, 0.0F);
		cube_r170.cubeList.add(new ModelBox(cube_r170, 122, 152, -0.002F, -5.6F, 3.451F, 1, 8, 3, -0.3F, false));
		cube_r170.cubeList.add(new ModelBox(cube_r170, 122, 152, -0.002F, -0.2148F, 3.4574F, 1, 8, 3, -0.3F, false));
		cube_r170.cubeList.add(new ModelBox(cube_r170, 32, 129, -0.001F, -6.2F, 4.45F, 1, 2, 2, -0.3F, false));

		cube_r171 = new ModelRenderer(this);
		cube_r171.setRotationPoint(0.0F, 0.0F, 36.8F);
		bone12.addChild(cube_r171);
		setRotationAngle(cube_r171, 0.4712F, 0.0F, 0.0F);
		cube_r171.cubeList.add(new ModelBox(cube_r171, 110, 105, -0.003F, -5.4F, 1.6F, 1, 3, 2, -0.3F, false));

		cube_r172 = new ModelRenderer(this);
		cube_r172.setRotationPoint(0.0F, 0.0F, 36.8F);
		bone12.addChild(cube_r172);
		setRotationAngle(cube_r172, 0.9599F, 0.0F, 0.0F);
		cube_r172.cubeList.add(new ModelBox(cube_r172, 111, 17, -0.002F, -5.1F, 3.6F, 1, 3, 2, -0.3F, false));

		cube_r173 = new ModelRenderer(this);
		cube_r173.setRotationPoint(0.0F, 0.0F, 36.8F);
		bone12.addChild(cube_r173);
		setRotationAngle(cube_r173, -0.925F, 0.0F, 0.0F);
		cube_r173.cubeList.add(new ModelBox(cube_r173, 65, 57, -0.002F, -8.209F, -3.88F, 1, 2, 1, -0.3F, false));
		cube_r173.cubeList.add(new ModelBox(cube_r173, 69, 20, -0.003F, -8.21F, -3.98F, 1, 2, 1, -0.3F, false));
		cube_r173.cubeList.add(new ModelBox(cube_r173, 99, 111, 0.2F, 36.1647F, -36.5638F, 1, 1, 4, -0.3F, false));
		cube_r173.cubeList.add(new ModelBox(cube_r173, 48, 70, -0.001F, -8.21F, -4.38F, 1, 2, 1, -0.3F, false));

		cube_r174 = new ModelRenderer(this);
		cube_r174.setRotationPoint(0.0F, 0.0F, 36.8F);
		bone12.addChild(cube_r174);
		setRotationAngle(cube_r174, -0.4887F, 0.0F, 0.0F);
		cube_r174.cubeList.add(new ModelBox(cube_r174, 113, 85, -0.002F, -9.201F, -2.05F, 1, 3, 2, -0.3F, false));
		cube_r174.cubeList.add(new ModelBox(cube_r174, 125, 149, 0.2F, 18.7472F, -51.6753F, 1, 4, 1, -0.3F, false));
		cube_r174.cubeList.add(new ModelBox(cube_r174, 42, 118, -0.001F, -9.2F, -2.65F, 1, 3, 2, -0.3F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(-2.9F, 0.0F, 0.0F);
		carryhandle2.addChild(bone13);
		bone13.cubeList.add(new ModelBox(bone13, 0, 23, -0.002F, -8.6F, -6.7F, 1, 2, 9, -0.3F, false));
		bone13.cubeList.add(new ModelBox(bone13, 100, 109, -0.2F, -8.4746F, -54.5657F, 1, 3, 4, -0.3F, false));
		bone13.cubeList.add(new ModelBox(bone13, 111, 63, -0.001F, -7.6F, -19.5F, 1, 2, 20, -0.3F, false));
		bone13.cubeList.add(new ModelBox(bone13, 51, 55, 0.0F, -6.2F, -25.5F, 1, 7, 2, -0.3F, false));
		bone13.cubeList.add(new ModelBox(bone13, 82, 67, 0.8F, -6.2F, -24.15F, 2, 12, 0, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 52, 0, 0.0F, -7.6F, -0.3F, 1, 9, 5, -0.3F, false));
		bone13.cubeList.add(new ModelBox(bone13, 91, 59, 0.4F, -5.5F, -0.3F, 3, 8, 3, -0.3F, false));

		cube_r175 = new ModelRenderer(this);
		cube_r175.setRotationPoint(1.1F, -1.2F, 1.1F);
		bone13.addChild(cube_r175);
		cube_r175.cubeList.add(new ModelBox(cube_r175, 123, 135, -1.0F, -6.1F, 0.0F, 1, 14, 2, 0.0F, false));
		cube_r175.cubeList.add(new ModelBox(cube_r175, 123, 145, 1.6F, -6.1F, 0.0F, 1, 14, 2, 0.0F, false));
		cube_r175.cubeList.add(new ModelBox(cube_r175, 124, 136, -1.0F, -3.1F, -51.0F, 2, 11, 1, 0.0F, false));
		cube_r175.cubeList.add(new ModelBox(cube_r175, 124, 146, 0.6F, -3.1F, -51.0F, 2, 11, 1, 0.0F, false));
		cube_r175.cubeList.add(new ModelBox(cube_r175, 99, 111, -1.0F, 3.2F, -56.0F, 2, 1, 5, 0.0F, false));
		cube_r175.cubeList.add(new ModelBox(cube_r175, 98, 111, 0.6F, 3.2F, -56.0F, 2, 1, 5, 0.0F, false));
		cube_r175.cubeList.add(new ModelBox(cube_r175, 124, 136, -1.0F, -3.1F, -57.0F, 2, 11, 1, 0.0F, false));
		cube_r175.cubeList.add(new ModelBox(cube_r175, 124, 146, 0.6F, -3.1F, -57.0F, 2, 11, 1, 0.0F, false));

		cube_r177 = new ModelRenderer(this);
		cube_r177.setRotationPoint(1.0F, 0.9F, -41.5F);
		bone13.addChild(cube_r177);
		setRotationAngle(cube_r177, 0.4712F, 0.0F, 0.0F);
		cube_r177.cubeList.add(new ModelBox(cube_r177, 43, 41, -0.999F, 3.5585F, 11.455F, 1, 4, 5, -0.3F, false));
		cube_r177.cubeList.add(new ModelBox(cube_r177, 122, 146, -1.002F, 2.1601F, 14.0987F, 1, 3, 3, -0.3F, false));

		cube_r178 = new ModelRenderer(this);
		cube_r178.setRotationPoint(1.0F, 0.9F, -41.5F);
		bone13.addChild(cube_r178);
		setRotationAngle(cube_r178, 0.925F, 0.0F, 0.0F);
		cube_r178.cubeList.add(new ModelBox(cube_r178, 38, 37, -1.001F, 8.0666F, 6.2615F, 1, 2, 10, -0.3F, false));

		cube_r179 = new ModelRenderer(this);
		cube_r179.setRotationPoint(0.0F, -13.0F, 0.0F);
		bone13.addChild(cube_r179);
		setRotationAngle(cube_r179, 0.0785F, 0.0F, 0.0F);
		cube_r179.cubeList.add(new ModelBox(cube_r179, 65, 13, -0.001F, 3.8911F, -25.9199F, 1, 2, 28, -0.3F, false));

		cube_r180 = new ModelRenderer(this);
		cube_r180.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone13.addChild(cube_r180);
		setRotationAngle(cube_r180, 0.2618F, 0.0F, 0.0F);
		cube_r180.cubeList.add(new ModelBox(cube_r180, 125, 30, -0.001F, -6.2F, 4.45F, 1, 2, 2, -0.3F, false));
		cube_r180.cubeList.add(new ModelBox(cube_r180, 100, 107, -0.002F, -5.6F, 2.451F, 1, 8, 4, -0.3F, false));

		cube_r181 = new ModelRenderer(this);
		cube_r181.setRotationPoint(0.4F, 0.0F, 0.0F);
		bone13.addChild(cube_r181);
		setRotationAngle(cube_r181, 0.4712F, 0.0F, 0.0F);
		cube_r181.cubeList.add(new ModelBox(cube_r181, 78, 58, -0.003F, -5.4F, 1.6F, 3, 3, 1, -0.3F, false));
		cube_r181.cubeList.add(new ModelBox(cube_r181, 91, 85, -0.403F, -5.4F, 1.6F, 1, 3, 2, -0.3F, false));

		cube_r182 = new ModelRenderer(this);
		cube_r182.setRotationPoint(0.4F, 0.0F, 0.0F);
		bone13.addChild(cube_r182);
		setRotationAngle(cube_r182, 0.9599F, 0.0F, 0.0F);
		cube_r182.cubeList.add(new ModelBox(cube_r182, 23, 78, -0.002F, -5.1F, 3.6F, 3, 3, 1, -0.3F, false));
		cube_r182.cubeList.add(new ModelBox(cube_r182, 91, 76, -0.402F, -5.1F, 3.6F, 1, 3, 2, -0.3F, false));

		cube_r183 = new ModelRenderer(this);
		cube_r183.setRotationPoint(0.0F, 0.0F, -36.8F);
		bone13.addChild(cube_r183);
		setRotationAngle(cube_r183, -0.9599F, 0.0F, 0.0F);
		cube_r183.cubeList.add(new ModelBox(cube_r183, 100, 46, -0.002F, -16.1583F, 2.1436F, 1, 3, 2, -0.3F, false));

		cube_r184 = new ModelRenderer(this);
		cube_r184.setRotationPoint(0.0F, 0.0F, -36.8F);
		bone13.addChild(cube_r184);
		setRotationAngle(cube_r184, -0.4712F, 0.0F, 0.0F);
		cube_r184.cubeList.add(new ModelBox(cube_r184, 103, 85, -0.003F, -11.5284F, 8.4288F, 1, 3, 2, -0.3F, false));

		cube_r185 = new ModelRenderer(this);
		cube_r185.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone13.addChild(cube_r185);
		setRotationAngle(cube_r185, -0.4887F, 0.0F, 0.0F);
		cube_r185.cubeList.add(new ModelBox(cube_r185, 0, 104, -0.001F, -9.2F, -2.65F, 1, 3, 2, -0.3F, false));
		cube_r185.cubeList.add(new ModelBox(cube_r185, 31, 104, -0.002F, -9.201F, -2.05F, 1, 3, 2, -0.3F, false));
		cube_r185.cubeList.add(new ModelBox(cube_r185, 31, 105, -0.2F, 18.7472F, -51.6753F, 1, 4, 1, -0.3F, false));

		cube_r186 = new ModelRenderer(this);
		cube_r186.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone13.addChild(cube_r186);
		setRotationAngle(cube_r186, -0.925F, 0.0F, 0.0F);
		cube_r186.cubeList.add(new ModelBox(cube_r186, 42, 62, -0.001F, -8.21F, -4.38F, 1, 2, 1, -0.3F, false));
		cube_r186.cubeList.add(new ModelBox(cube_r186, 11, 63, -0.003F, -8.21F, -3.98F, 1, 2, 1, -0.3F, false));
		cube_r186.cubeList.add(new ModelBox(cube_r186, 101, 110, -0.2F, 36.1647F, -36.5638F, 1, 1, 4, -0.3F, false));
		cube_r186.cubeList.add(new ModelBox(cube_r186, 17, 63, -0.002F, -8.209F, -3.88F, 1, 2, 1, -0.3F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-6.0F, 3.4F, 3.75F);
		carryhandle2.addChild(bone7);
		bone7.cubeList.add(new ModelBox(bone7, 102, 114, 3.4F, -8.1F, -55.2F, 3, 1, 2, -0.05F, false));
		bone7.cubeList.add(new ModelBox(bone7, 102, 114, 3.4F, -9.0F, -55.4F, 3, 1, 2, -0.05F, false));
		bone7.cubeList.add(new ModelBox(bone7, 102, 114, 3.4F, -9.9F, -56.1F, 3, 1, 2, -0.05F, false));
		bone7.cubeList.add(new ModelBox(bone7, 103, 115, 3.4F, -9.0F, -56.1F, 3, 1, 1, -0.05F, false));
		bone7.cubeList.add(new ModelBox(bone7, 103, 115, 3.4F, -8.1F, -56.1F, 3, 1, 1, -0.05F, false));
		bone7.cubeList.add(new ModelBox(bone7, 68, 38, 4.0F, 1.9F, -60.0F, 2, 1, 2, -0.05F, false));
		bone7.cubeList.add(new ModelBox(bone7, 125, 80, 4.5F, -10.5F, -56.6F, 1, 1, 2, -0.2F, false));
		bone7.cubeList.add(new ModelBox(bone7, 63, 121, 4.5F, -11.6F, -56.6F, 1, 2, 2, -0.4F, false));
		bone7.cubeList.add(new ModelBox(bone7, 134, 85, 4.5F, -12.35F, -1.75F, 1, 1, 2, -0.35F, false));
		bone7.cubeList.add(new ModelBox(bone7, 134, 129, 4.2F, -12.35F, -1.75F, 1, 1, 2, -0.35F, false));
		bone7.cubeList.add(new ModelBox(bone7, 134, 121, 4.8F, -12.35F, -1.75F, 1, 1, 2, -0.35F, false));
		bone7.cubeList.add(new ModelBox(bone7, 42, 123, 3.9F, -12.15F, -1.7F, 1, 2, 2, -0.4F, false));
		bone7.cubeList.add(new ModelBox(bone7, 86, 33, 3.7F, -12.1F, -1.9F, 1, 3, 2, -0.4F, false));
		bone7.cubeList.add(new ModelBox(bone7, 59, 0, 5.3F, -12.1F, -1.9F, 1, 3, 2, -0.4F, false));
		bone7.cubeList.add(new ModelBox(bone7, 121, 99, 5.1F, -12.15F, -1.7F, 1, 2, 2, -0.4F, false));
		bone7.cubeList.add(new ModelBox(bone7, 23, 69, 4.0F, -11.0F, -1.8F, 2, 1, 2, -0.3F, false));
		bone7.cubeList.add(new ModelBox(bone7, 72, 6, 4.0F, -10.8F, -1.799F, 2, 1, 2, -0.3F, false));
		bone7.cubeList.add(new ModelBox(bone7, 134, 133, 4.5F, -10.4F, -1.9F, 1, 1, 2, -0.2F, false));
		bone7.cubeList.add(new ModelBox(bone7, 95, 95, 4.1F, -9.6F, -2.3F, 1, 12, 2, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 123, 56, 4.9F, -9.6F, -2.301F, 1, 12, 2, 0.0F, false));

		cube_r187 = new ModelRenderer(this);
		cube_r187.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone7.addChild(cube_r187);
		setRotationAngle(cube_r187, 0.0F, 0.0F, 0.7854F);
		cube_r187.cubeList.add(new ModelBox(cube_r187, 95, 17, -2.0F, -9.1F, -2.0F, 3, 3, 3, -1.0F, false));

		cube_r188 = new ModelRenderer(this);
		cube_r188.setRotationPoint(4.8F, -1.2F, 1.1F);
		bone7.addChild(cube_r188);
		setRotationAngle(cube_r188, 0.3316F, 0.0F, 0.0F);
		cube_r188.cubeList.add(new ModelBox(cube_r188, 4, 23, -0.95F, -9.15F, 0.95F, 1, 1, 1, -0.35F, false));
		cube_r188.cubeList.add(new ModelBox(cube_r188, 83, 91, -0.65F, -9.15F, 0.95F, 2, 1, 1, -0.35F, false));

		cube_r189 = new ModelRenderer(this);
		cube_r189.setRotationPoint(3.9F, -10.7F, -1.7F);
		bone7.addChild(cube_r189);
		setRotationAngle(cube_r189, 0.0F, 0.0F, 0.7854F);
		cube_r189.cubeList.add(new ModelBox(cube_r189, 134, 109, 0.0F, -1.0F, -0.001F, 1, 1, 2, -0.4F, false));
		cube_r189.cubeList.add(new ModelBox(cube_r189, 134, 103, -0.2F, -1.0F, -0.001F, 1, 1, 2, -0.4F, false));

		cube_r190 = new ModelRenderer(this);
		cube_r190.setRotationPoint(6.1F, -10.7F, -1.7F);
		bone7.addChild(cube_r190);
		setRotationAngle(cube_r190, 0.0F, 0.0F, -0.7854F);
		cube_r190.cubeList.add(new ModelBox(cube_r190, 134, 117, -1.0F, -1.0F, -0.001F, 1, 1, 2, -0.4F, false));
		cube_r190.cubeList.add(new ModelBox(cube_r190, 134, 114, -0.8F, -1.0F, -0.001F, 1, 1, 2, -0.4F, false));

		cube_r191 = new ModelRenderer(this);
		cube_r191.setRotationPoint(3.85F, -11.8F, -1.7F);
		bone7.addChild(cube_r191);
		setRotationAngle(cube_r191, 0.0F, 0.0F, -0.7854F);
		cube_r191.cubeList.add(new ModelBox(cube_r191, 133, 80, -0.07F, 0.004F, -0.048F, 1, 1, 2, -0.35F, false));
		cube_r191.cubeList.add(new ModelBox(cube_r191, 58, 134, -0.015F, 0.005F, -0.049F, 1, 1, 2, -0.35F, false));

		cube_r192 = new ModelRenderer(this);
		cube_r192.setRotationPoint(3.9F, -11.7F, -1.7F);
		bone7.addChild(cube_r192);
		setRotationAngle(cube_r192, 0.0F, 0.0F, -0.7854F);
		cube_r192.cubeList.add(new ModelBox(cube_r192, 134, 88, -0.2F, 0.0F, -0.001F, 1, 1, 2, -0.4F, false));
		cube_r192.cubeList.add(new ModelBox(cube_r192, 134, 91, 0.0F, 0.0F, -0.001F, 1, 1, 2, -0.4F, false));

		cube_r193 = new ModelRenderer(this);
		cube_r193.setRotationPoint(6.1F, -11.7F, -1.7F);
		bone7.addChild(cube_r193);
		setRotationAngle(cube_r193, 0.0F, 0.0F, 0.7854F);
		cube_r193.cubeList.add(new ModelBox(cube_r193, 134, 97, -1.0F, 0.0F, -0.001F, 1, 1, 2, -0.4F, false));
		cube_r193.cubeList.add(new ModelBox(cube_r193, 134, 100, -0.8F, 0.0F, -0.001F, 1, 1, 2, -0.4F, false));

		cube_r194 = new ModelRenderer(this);
		cube_r194.setRotationPoint(6.15F, -11.8F, -1.7F);
		bone7.addChild(cube_r194);
		setRotationAngle(cube_r194, 0.0F, 0.0F, 0.7854F);
		cube_r194.cubeList.add(new ModelBox(cube_r194, 125, 101, -0.93F, 0.004F, -0.048F, 1, 1, 2, -0.35F, false));
		cube_r194.cubeList.add(new ModelBox(cube_r194, 133, 76, -0.985F, 0.005F, -0.049F, 1, 1, 2, -0.35F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gun.render(f5);
		carryhandle2.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}