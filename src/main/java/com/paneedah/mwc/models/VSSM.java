package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class VSSM extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer TRIGGER;
	private final ModelRenderer gun13TRIGGER;
	private final ModelRenderer gun12TRIGGER;
	private final ModelRenderer gun11TRIGGER;
	private final ModelRenderer gun137;
	private final ModelRenderer gun136;
	private final ModelRenderer gun135;
	private final ModelRenderer gun134;
	private final ModelRenderer gun133;
	private final ModelRenderer gun132;
	private final ModelRenderer gun131;
	private final ModelRenderer gun122;
	private final ModelRenderer gun115;
	private final ModelRenderer gun114;
	private final ModelRenderer gun113;
	private final ModelRenderer gun112;
	private final ModelRenderer gun111;
	private final ModelRenderer gun110;
	private final ModelRenderer gun109;
	private final ModelRenderer gun108;
	private final ModelRenderer gun107;
	private final ModelRenderer gun106;
	private final ModelRenderer gun105;
	private final ModelRenderer gun104;
	private final ModelRenderer gun103;
	private final ModelRenderer gun102;
	private final ModelRenderer gun101;
	private final ModelRenderer gun100;
	private final ModelRenderer gun99;
	private final ModelRenderer gun98;
	private final ModelRenderer gun97;
	private final ModelRenderer gun96;
	private final ModelRenderer gun95;
	private final ModelRenderer gun94;
	private final ModelRenderer gun93;
	private final ModelRenderer gun92;
	private final ModelRenderer gun91;
	private final ModelRenderer gun90;
	private final ModelRenderer gun89;
	private final ModelRenderer gun88;
	private final ModelRenderer gun87;
	private final ModelRenderer gun86;
	private final ModelRenderer gun85;
	private final ModelRenderer gun84;
	private final ModelRenderer gun83;
	private final ModelRenderer gun82;
	private final ModelRenderer gun81;
	private final ModelRenderer gun80;
	private final ModelRenderer gun79;
	private final ModelRenderer gun78;
	private final ModelRenderer gun77;
	private final ModelRenderer gun76;
	private final ModelRenderer gun75;
	private final ModelRenderer gun74;
	private final ModelRenderer gun73;
	private final ModelRenderer gun72;
	private final ModelRenderer gun71;
	private final ModelRenderer gun70;
	private final ModelRenderer gun69;
	private final ModelRenderer gun68;
	private final ModelRenderer gun67;
	private final ModelRenderer gun66;
	private final ModelRenderer gun65;
	private final ModelRenderer gun64;
	private final ModelRenderer gun63;
	private final ModelRenderer gun62;
	private final ModelRenderer gun61;
	private final ModelRenderer gun60;
	private final ModelRenderer gun59;
	private final ModelRenderer gun58;
	private final ModelRenderer gun52;
	private final ModelRenderer gun51;
	private final ModelRenderer gun50;
	private final ModelRenderer gun49;
	private final ModelRenderer gun48;
	private final ModelRenderer gun47;
	private final ModelRenderer gun46;
	private final ModelRenderer gun45;
	private final ModelRenderer gun44;
	private final ModelRenderer gun43;
	private final ModelRenderer gun42;
	private final ModelRenderer gun41;
	private final ModelRenderer gun40;
	private final ModelRenderer gun39;
	private final ModelRenderer gun38;
	private final ModelRenderer gun37;
	private final ModelRenderer gun36;
	private final ModelRenderer gun35;
	private final ModelRenderer gun34;
	private final ModelRenderer gun33;
	private final ModelRenderer gun32;
	private final ModelRenderer gun31;
	private final ModelRenderer gun29;
	private final ModelRenderer gun28;
	private final ModelRenderer gun22;
	private final ModelRenderer gun21;
	private final ModelRenderer gun20;
	private final ModelRenderer gun17;
	private final ModelRenderer gun16;
	private final ModelRenderer gun15;
	private final ModelRenderer gun9;
	private final ModelRenderer gun8;
	private final ModelRenderer gun7;
	private final ModelRenderer gun6;
	private final ModelRenderer gun5;
	private final ModelRenderer bone23;
	private final ModelRenderer gun166;
	private final ModelRenderer gun180;
	private final ModelRenderer gun170;
	private final ModelRenderer gun171;
	private final ModelRenderer gun168;
	private final ModelRenderer gun167;
	private final ModelRenderer gun179;
	private final ModelRenderer gun169;
	private final ModelRenderer barrel;
	private final ModelRenderer barrel2;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer barrelouter;
	private final ModelRenderer bone8;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer bone6;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer bone7;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer bone5;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer barrelouter3;
	private final ModelRenderer bone13;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer bone14;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer bone15;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer bone16;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer barrelouter4;
	private final ModelRenderer bone17;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer bone18;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer bone19;
	private final ModelRenderer cube_r30;
	private final ModelRenderer cube_r31;
	private final ModelRenderer bone20;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;
	private final ModelRenderer barrelouter2;
	private final ModelRenderer bone9;
	private final ModelRenderer cube_r34;
	private final ModelRenderer cube_r35;
	private final ModelRenderer bone10;
	private final ModelRenderer cube_r36;
	private final ModelRenderer cube_r37;
	private final ModelRenderer bone11;
	private final ModelRenderer cube_r38;
	private final ModelRenderer cube_r39;
	private final ModelRenderer bone12;
	private final ModelRenderer cube_r40;
	private final ModelRenderer cube_r41;
	private final ModelRenderer ironsights;
	private final ModelRenderer cube_r42;
	private final ModelRenderer cube_r43;
	private final ModelRenderer cube_r44;
	private final ModelRenderer cube_r45;
	private final ModelRenderer gun4;

	public VSSM() {
		textureWidth = 256;
		textureHeight = 256;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		TRIGGER = new ModelRenderer(this);
		TRIGGER.setRotationPoint(-2.0F, -31.2F, -10.5F);
		gun.addChild(TRIGGER);
		setRotationAngle(TRIGGER, 0.4461F, 0.0F, 0.0F);
		TRIGGER.cubeList.add(new ModelBox(TRIGGER, 84, 0, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun13TRIGGER = new ModelRenderer(this);
		gun13TRIGGER.setRotationPoint(-2.0F, -28.0F, -9.7F);
		gun.addChild(gun13TRIGGER);
		setRotationAngle(gun13TRIGGER, -2.6397F, 0.0F, 0.0F);
		gun13TRIGGER.cubeList.add(new ModelBox(gun13TRIGGER, 168, 45, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.001F, false));

		gun12TRIGGER = new ModelRenderer(this);
		gun12TRIGGER.setRotationPoint(-2.0F, -28.7F, -9.1F);
		gun.addChild(gun12TRIGGER);
		setRotationAngle(gun12TRIGGER, -2.3051F, 0.0F, 0.0F);
		gun12TRIGGER.cubeList.add(new ModelBox(gun12TRIGGER, 168, 47, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun11TRIGGER = new ModelRenderer(this);
		gun11TRIGGER.setRotationPoint(-2.0F, -31.8F, -9.0F);
		gun.addChild(gun11TRIGGER);
		setRotationAngle(gun11TRIGGER, -0.3718F, 0.0F, 0.0F);
		gun11TRIGGER.cubeList.add(new ModelBox(gun11TRIGGER, 12, 67, 0.0F, 0.0F, 0.0F, 1, 3, 1, 0.001F, false));

		gun137 = new ModelRenderer(this);
		gun137.setRotationPoint(-1.7F, -38.3F, 0.85F);
		gun.addChild(gun137);
		setRotationAngle(gun137, -1.0038F, 0.0F, 0.0F);
		gun137.cubeList.add(new ModelBox(gun137, 164, 80, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun136 = new ModelRenderer(this);
		gun136.setRotationPoint(-1.7F, -38.7F, -0.1F);
		gun.addChild(gun136);
		setRotationAngle(gun136, -0.409F, 0.0F, 0.0F);
		gun136.cubeList.add(new ModelBox(gun136, 164, 82, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun135 = new ModelRenderer(this);
		gun135.setRotationPoint(-2.3F, -38.3F, 0.85F);
		gun.addChild(gun135);
		setRotationAngle(gun135, -1.0038F, 0.0F, 0.0F);
		gun135.cubeList.add(new ModelBox(gun135, 164, 87, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun134 = new ModelRenderer(this);
		gun134.setRotationPoint(-2.3F, -38.7F, -0.1F);
		gun.addChild(gun134);
		setRotationAngle(gun134, -0.409F, 0.0F, 0.0F);
		gun134.cubeList.add(new ModelBox(gun134, 151, 164, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun133 = new ModelRenderer(this);
		gun133.setRotationPoint(-2.0F, -38.35F, 1.12F);
		gun.addChild(gun133);
		setRotationAngle(gun133, -1.1897F, 0.0F, 0.0F);
		gun133.cubeList.add(new ModelBox(gun133, 165, 32, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun132 = new ModelRenderer(this);
		gun132.setRotationPoint(-2.0F, -38.9F, 0.3F);
		gun.addChild(gun132);
		setRotationAngle(gun132, -0.5949F, 0.0F, 0.0F);
		gun132.cubeList.add(new ModelBox(gun132, 165, 34, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun131 = new ModelRenderer(this);
		gun131.setRotationPoint(-2.0F, -38.4F, -0.6F);
		gun.addChild(gun131);
		setRotationAngle(gun131, 0.5205F, 0.0F, 0.0F);
		gun131.cubeList.add(new ModelBox(gun131, 165, 36, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun122 = new ModelRenderer(this);
		gun122.setRotationPoint(-3.75F, -35.2F, -26.5F);
		gun.addChild(gun122);
		gun122.cubeList.add(new ModelBox(gun122, 151, 133, 0.0F, 0.0F, -0.01F, 1, 1, 28, 0.0F, false));

		gun115 = new ModelRenderer(this);
		gun115.setRotationPoint(0.9F, -33.8F, 0.5F);
		gun.addChild(gun115);
		setRotationAngle(gun115, 0.0F, 0.0F, 2.491F);
		

		gun114 = new ModelRenderer(this);
		gun114.setRotationPoint(0.9F, -33.8F, -3.0F);
		gun.addChild(gun114);
		setRotationAngle(gun114, 0.0F, 0.0F, 2.491F);
		

		gun113 = new ModelRenderer(this);
		gun113.setRotationPoint(-0.1F, -34.8F, 0.5F);
		gun.addChild(gun113);
		

		gun112 = new ModelRenderer(this);
		gun112.setRotationPoint(-0.1F, -34.8F, -3.0F);
		gun.addChild(gun112);
		

		gun111 = new ModelRenderer(this);
		gun111.setRotationPoint(-0.1F, -35.0F, -3.0F);
		gun.addChild(gun111);
		gun111.cubeList.add(new ModelBox(gun111, 166, 16, -0.02F, 0.0F, -0.01F, 1, 1, 1, 0.0F, false));

		gun110 = new ModelRenderer(this);
		gun110.setRotationPoint(-0.1F, -35.0F, -2.5F);
		gun.addChild(gun110);
		

		gun109 = new ModelRenderer(this);
		gun109.setRotationPoint(0.9F, -33.8F, -12.5F);
		gun.addChild(gun109);
		setRotationAngle(gun109, 0.0F, 0.0F, 2.491F);
		

		gun108 = new ModelRenderer(this);
		gun108.setRotationPoint(0.9F, -33.8F, -9.5F);
		gun.addChild(gun108);
		setRotationAngle(gun108, 0.0F, 0.0F, 2.491F);
		

		gun107 = new ModelRenderer(this);
		gun107.setRotationPoint(-0.1F, -34.8F, -9.5F);
		gun.addChild(gun107);
		

		gun106 = new ModelRenderer(this);
		gun106.setRotationPoint(-0.1F, -34.8F, -12.5F);
		gun.addChild(gun106);
		

		gun105 = new ModelRenderer(this);
		gun105.setRotationPoint(-0.1F, -35.0F, -12.5F);
		gun.addChild(gun105);
		

		gun104 = new ModelRenderer(this);
		gun104.setRotationPoint(0.9F, -33.7F, -4.5F);
		gun.addChild(gun104);
		setRotationAngle(gun104, 0.0F, 0.0F, 2.3423F);
		

		gun103 = new ModelRenderer(this);
		gun103.setRotationPoint(0.9F, -33.7F, -7.5F);
		gun.addChild(gun103);
		setRotationAngle(gun103, 0.0F, 0.0F, 2.3423F);
		

		gun102 = new ModelRenderer(this);
		gun102.setRotationPoint(-0.1F, -33.7F, -4.5F);
		gun.addChild(gun102);
		

		gun101 = new ModelRenderer(this);
		gun101.setRotationPoint(-0.1F, -33.7F, -7.5F);
		gun.addChild(gun101);
		

		gun100 = new ModelRenderer(this);
		gun100.setRotationPoint(0.9F, -33.5F, -4.5F);
		gun.addChild(gun100);
		setRotationAngle(gun100, 0.0F, -3.0115F, 0.0F);
		

		gun99 = new ModelRenderer(this);
		gun99.setRotationPoint(0.9F, -33.5F, -6.5F);
		gun.addChild(gun99);
		setRotationAngle(gun99, 0.0F, -1.7102F, 0.0F);
		

		gun98 = new ModelRenderer(this);
		gun98.setRotationPoint(-0.2F, -33.5F, -6.5F);
		gun.addChild(gun98);
		

		gun97 = new ModelRenderer(this);
		gun97.setRotationPoint(-0.1F, -33.5F, -4.5F);
		gun.addChild(gun97);
		

		gun96 = new ModelRenderer(this);
		gun96.setRotationPoint(-0.1F, -33.5F, -7.5F);
		gun.addChild(gun96);
		

		gun95 = new ModelRenderer(this);
		gun95.setRotationPoint(0.9F, -33.7F, -14.5F);
		gun.addChild(gun95);
		setRotationAngle(gun95, 0.0F, 0.0F, 2.3423F);
		

		gun94 = new ModelRenderer(this);
		gun94.setRotationPoint(0.9F, -33.7F, -17.5F);
		gun.addChild(gun94);
		setRotationAngle(gun94, 0.0F, 0.0F, 2.3423F);
		

		gun93 = new ModelRenderer(this);
		gun93.setRotationPoint(0.9F, -33.7F, -17.0F);
		gun.addChild(gun93);
		setRotationAngle(gun93, 0.0F, 0.0F, 2.3423F);
		

		gun92 = new ModelRenderer(this);
		gun92.setRotationPoint(-0.1F, -33.7F, -17.0F);
		gun.addChild(gun92);
		

		gun91 = new ModelRenderer(this);
		gun91.setRotationPoint(-0.1F, -33.7F, -14.5F);
		gun.addChild(gun91);
		

		gun90 = new ModelRenderer(this);
		gun90.setRotationPoint(-0.1F, -33.7F, -17.5F);
		gun.addChild(gun90);
		

		gun89 = new ModelRenderer(this);
		gun89.setRotationPoint(-0.4F, -35.0F, -22.0F);
		gun.addChild(gun89);
		

		gun88 = new ModelRenderer(this);
		gun88.setRotationPoint(-0.1F, -35.0F, -22.0F);
		gun.addChild(gun88);
		

		gun87 = new ModelRenderer(this);
		gun87.setRotationPoint(-0.1F, -33.5F, -17.5F);
		gun.addChild(gun87);
		

		gun86 = new ModelRenderer(this);
		gun86.setRotationPoint(-0.35F, -32.8F, -24.0F);
		gun.addChild(gun86);
		

		gun85 = new ModelRenderer(this);
		gun85.setRotationPoint(-0.1F, -33.6F, -25.5F);
		gun.addChild(gun85);
		setRotationAngle(gun85, 2.1935F, 0.0F, 0.0F);
		

		gun84 = new ModelRenderer(this);
		gun84.setRotationPoint(0.9F, -34.0F, -22.0F);
		gun.addChild(gun84);
		setRotationAngle(gun84, 0.0F, 0.0F, 2.2679F);
		

		gun83 = new ModelRenderer(this);
		gun83.setRotationPoint(-0.1F, -33.5F, -26.0F);
		gun.addChild(gun83);
		

		gun82 = new ModelRenderer(this);
		gun82.setRotationPoint(-0.1F, -33.5F, -26.5F);
		gun.addChild(gun82);
		

		gun81 = new ModelRenderer(this);
		gun81.setRotationPoint(-0.1F, -34.0F, -26.5F);
		gun.addChild(gun81);
		

		gun80 = new ModelRenderer(this);
		gun80.setRotationPoint(-0.1F, -35.0F, -26.5F);
		gun.addChild(gun80);
		

		gun79 = new ModelRenderer(this);
		gun79.setRotationPoint(-0.4F, -35.0F, -17.5F);
		gun.addChild(gun79);
		gun79.cubeList.add(new ModelBox(gun79, 0, 92, 0.0F, 0.0F, 0.01F, 1, 4, 19, 0.0F, false));

		gun78 = new ModelRenderer(this);
		gun78.setRotationPoint(-0.4F, -35.0F, -26.5F);
		gun.addChild(gun78);
		

		gun77 = new ModelRenderer(this);
		gun77.setRotationPoint(-0.6F, -31.6F, -7.5F);
		gun.addChild(gun77);
		gun77.cubeList.add(new ModelBox(gun77, 73, 0, 0.01F, 0.0F, -0.01F, 1, 1, 9, 0.0F, false));

		gun76 = new ModelRenderer(this);
		gun76.setRotationPoint(-3.4F, -28.3F, -19.5F);
		gun.addChild(gun76);
		gun76.cubeList.add(new ModelBox(gun76, 167, 117, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun75 = new ModelRenderer(this);
		gun75.setRotationPoint(-0.6F, -28.3F, -19.5F);
		gun.addChild(gun75);
		gun75.cubeList.add(new ModelBox(gun75, 119, 167, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun74 = new ModelRenderer(this);
		gun74.setRotationPoint(-3.4F, -27.8F, -19.0F);
		gun.addChild(gun74);
		gun74.cubeList.add(new ModelBox(gun74, 116, 129, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun73 = new ModelRenderer(this);
		gun73.setRotationPoint(-0.6F, -27.8F, -19.0F);
		gun.addChild(gun73);
		gun73.cubeList.add(new ModelBox(gun73, 122, 129, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun72 = new ModelRenderer(this);
		gun72.setRotationPoint(-0.6F, -29.0F, -23.0F);
		gun.addChild(gun72);
		gun72.cubeList.add(new ModelBox(gun72, 123, 167, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun71 = new ModelRenderer(this);
		gun71.setRotationPoint(-3.4F, -29.0F, -23.0F);
		gun.addChild(gun71);
		gun71.cubeList.add(new ModelBox(gun71, 127, 167, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun70 = new ModelRenderer(this);
		gun70.setRotationPoint(-3.4F, -28.8F, -22.5F);
		gun.addChild(gun70);
		gun70.cubeList.add(new ModelBox(gun70, 56, 162, 0.01F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));

		gun69 = new ModelRenderer(this);
		gun69.setRotationPoint(-0.6F, -28.8F, -22.5F);
		gun.addChild(gun69);
		gun69.cubeList.add(new ModelBox(gun69, 163, 146, -0.01F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));

		gun68 = new ModelRenderer(this);
		gun68.setRotationPoint(-3.5F, -26.25F, -17.5F);
		gun.addChild(gun68);
		setRotationAngle(gun68, 1.3013F, 0.0F, 0.0F);
		gun68.cubeList.add(new ModelBox(gun68, 24, 39, 0.0F, 0.0F, 0.0F, 4, 1, 1, 0.001F, false));

		gun67 = new ModelRenderer(this);
		gun67.setRotationPoint(-3.5F, -28.8F, -26.5F);
		gun.addChild(gun67);
		setRotationAngle(gun67, 1.3013F, 0.0F, 0.0F);
		gun67.cubeList.add(new ModelBox(gun67, 82, 93, 0.0F, 0.0F, 0.0F, 4, 10, 1, 0.0F, false));

		gun66 = new ModelRenderer(this);
		gun66.setRotationPoint(-3.4F, -30.2F, -14.5F);
		gun.addChild(gun66);
		setRotationAngle(gun66, 2.3051F, 0.0F, 0.0F);
		gun66.cubeList.add(new ModelBox(gun66, 131, 167, 0.0F, 0.0F, 0.0F, 1, 1, 1, -0.001F, false));

		gun65 = new ModelRenderer(this);
		gun65.setRotationPoint(-3.4F, -31.2F, -16.5F);
		gun.addChild(gun65);
		gun65.cubeList.add(new ModelBox(gun65, 130, 28, 0.02F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun64 = new ModelRenderer(this);
		gun64.setRotationPoint(-0.6F, -30.9F, -15.1F);
		gun.addChild(gun64);
		setRotationAngle(gun64, -2.4166F, 0.0F, 0.0F);
		gun64.cubeList.add(new ModelBox(gun64, 167, 133, -0.01F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun63 = new ModelRenderer(this);
		gun63.setRotationPoint(-3.4F, -31.9F, -15.5F);
		gun.addChild(gun63);
		setRotationAngle(gun63, -1.7299F, 0.0F, 0.0F);
		gun63.cubeList.add(new ModelBox(gun63, 29, 131, -0.01F, 0.0F, 0.0F, 3, 1, 5, 0.0F, false));

		gun62 = new ModelRenderer(this);
		gun62.setRotationPoint(-0.6F, -31.9F, -15.5F);
		gun.addChild(gun62);
		setRotationAngle(gun62, -1.7299F, 0.0F, 0.0F);
		gun62.cubeList.add(new ModelBox(gun62, 172, 172, 0.01F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));

		gun61 = new ModelRenderer(this);
		gun61.setRotationPoint(-3.3F, -30.0F, -7.0F);
		gun.addChild(gun61);
		gun61.cubeList.add(new ModelBox(gun61, 167, 135, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun60 = new ModelRenderer(this);
		gun60.setRotationPoint(-0.7F, -30.0F, -7.0F);
		gun.addChild(gun60);
		gun60.cubeList.add(new ModelBox(gun60, 138, 167, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun59 = new ModelRenderer(this);
		gun59.setRotationPoint(-3.4F, -31.8F, -26.5F);
		gun.addChild(gun59);
		gun59.cubeList.add(new ModelBox(gun59, 116, 47, 0.02F, 0.0F, 0.0F, 3, 3, 10, 0.0F, false));

		gun58 = new ModelRenderer(this);
		gun58.setRotationPoint(-0.6F, -31.8F, -26.5F);
		gun.addChild(gun58);
		gun58.cubeList.add(new ModelBox(gun58, 116, 65, -0.02F, 0.0F, 0.0F, 1, 3, 10, 0.0F, false));

		gun52 = new ModelRenderer(this);
		gun52.setRotationPoint(-3.2F, -35.0F, -0.6F);
		gun.addChild(gun52);
		gun52.cubeList.add(new ModelBox(gun52, 130, 0, 0.0F, 0.0F, 0.0F, 3, 5, 3, 0.0F, false));

		gun51 = new ModelRenderer(this);
		gun51.setRotationPoint(-0.8F, -35.0F, -0.6F);
		gun.addChild(gun51);
		gun51.cubeList.add(new ModelBox(gun51, 49, 32, 0.0F, 0.0F, 0.0F, 1, 5, 3, 0.001F, false));

		gun50 = new ModelRenderer(this);
		gun50.setRotationPoint(-3.3F, -30.8F, -7.7F);
		gun.addChild(gun50);
		setRotationAngle(gun50, 0.0F, 0.0F, -0.3961F);
		gun50.cubeList.add(new ModelBox(gun50, 167, 139, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun49 = new ModelRenderer(this);
		gun49.setRotationPoint(0.3F, -30.8F, -7.7F);
		gun.addChild(gun49);
		setRotationAngle(gun49, 0.0F, 0.0F, 1.9705F);
		gun49.cubeList.add(new ModelBox(gun49, 167, 141, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun48 = new ModelRenderer(this);
		gun48.setRotationPoint(-0.6F, -31.8F, -16.5F);
		gun.addChild(gun48);
		gun48.cubeList.add(new ModelBox(gun48, 146, 16, 0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F, false));

		gun47 = new ModelRenderer(this);
		gun47.setRotationPoint(-3.4F, -31.8F, -16.5F);
		gun.addChild(gun47);
		gun47.cubeList.add(new ModelBox(gun47, 151, 146, 0.01F, 0.0F, 0.0F, 1, 1, 10, 0.0F, false));

		gun46 = new ModelRenderer(this);
		gun46.setRotationPoint(-2.5F, -30.0F, -7.7F);
		gun.addChild(gun46);
		gun46.cubeList.add(new ModelBox(gun46, 49, 133, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun45 = new ModelRenderer(this);
		gun45.setRotationPoint(-3.1F, -31.0F, -7.7F);
		gun.addChild(gun45);
		gun45.cubeList.add(new ModelBox(gun45, 107, 73, 0.0F, -0.01F, -0.01F, 1, 5, 1, 0.0F, false));

		gun44 = new ModelRenderer(this);
		gun44.setRotationPoint(-0.9F, -31.0F, -7.7F);
		gun.addChild(gun44);
		gun44.cubeList.add(new ModelBox(gun44, 107, 93, 0.0F, -0.01F, -0.01F, 1, 5, 1, 0.0F, false));

		gun43 = new ModelRenderer(this);
		gun43.setRotationPoint(0.4F, -30.6F, -7.5F);
		gun.addChild(gun43);
		setRotationAngle(gun43, 0.0F, 0.0F, 2.2679F);
		gun43.cubeList.add(new ModelBox(gun43, 73, 10, 0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		gun42 = new ModelRenderer(this);
		gun42.setRotationPoint(-3.4F, -30.6F, -7.5F);
		gun.addChild(gun42);
		setRotationAngle(gun42, 0.0F, 0.0F, -0.6692F);
		gun42.cubeList.add(new ModelBox(gun42, 73, 21, 0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		gun41 = new ModelRenderer(this);
		gun41.setRotationPoint(-3.4F, -31.6F, -7.5F);
		gun.addChild(gun41);
		gun41.cubeList.add(new ModelBox(gun41, 73, 31, 0.01F, 0.0F, -0.01F, 1, 1, 9, 0.0F, false));

		gun40 = new ModelRenderer(this);
		gun40.setRotationPoint(-3.3F, -30.2F, -3.0F);
		gun.addChild(gun40);
		setRotationAngle(gun40, -0.7436F, 0.0F, 0.0F);
		gun40.cubeList.add(new ModelBox(gun40, 154, 167, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun39 = new ModelRenderer(this);
		gun39.setRotationPoint(-0.7F, -30.2F, -3.0F);
		gun.addChild(gun39);
		setRotationAngle(gun39, -0.7436F, 0.0F, 0.0F);
		gun39.cubeList.add(new ModelBox(gun39, 168, 33, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun38 = new ModelRenderer(this);
		gun38.setRotationPoint(-2.5F, -25.7F, -14.8F);
		gun.addChild(gun38);
		setRotationAngle(gun38, -1.45F, 0.0F, 0.0F);
		gun38.cubeList.add(new ModelBox(gun38, 87, 133, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.001F, false));

		gun37 = new ModelRenderer(this);
		gun37.setRotationPoint(-3.0F, -30.5F, -14.5F);
		gun.addChild(gun37);
		setRotationAngle(gun37, 2.3051F, 0.0F, 0.0F);
		gun37.cubeList.add(new ModelBox(gun37, 116, 98, 0.01F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun36 = new ModelRenderer(this);
		gun36.setRotationPoint(-0.9F, -27.5F, -16.0F);
		gun.addChild(gun36);
		gun36.cubeList.add(new ModelBox(gun36, 168, 35, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun35 = new ModelRenderer(this);
		gun35.setRotationPoint(-0.9F, -29.4F, -15.5F);
		gun.addChild(gun35);
		setRotationAngle(gun35, -0.7064F, 0.0F, 0.0F);
		gun35.cubeList.add(new ModelBox(gun35, 168, 37, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun34 = new ModelRenderer(this);
		gun34.setRotationPoint(-3.1F, -28.5F, -16.0F);
		gun.addChild(gun34);
		gun34.cubeList.add(new ModelBox(gun34, 168, 39, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun33 = new ModelRenderer(this);
		gun33.setRotationPoint(-2.5F, -26.0F, -16.2F);
		gun.addChild(gun33);
		setRotationAngle(gun33, 0.5949F, 0.0F, 0.0F);
		gun33.cubeList.add(new ModelBox(gun33, 134, 28, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun32 = new ModelRenderer(this);
		gun32.setRotationPoint(-2.5F, -31.0F, -8.5F);
		gun.addChild(gun32);
		setRotationAngle(gun32, 0.9666F, 0.0F, 0.0F);
		gun32.cubeList.add(new ModelBox(gun32, 25, 162, 0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

		gun31 = new ModelRenderer(this);
		gun31.setRotationPoint(-2.5F, -29.2F, -7.8F);
		gun.addChild(gun31);
		setRotationAngle(gun31, -0.2231F, 0.0F, 0.0F);
		gun31.cubeList.add(new ModelBox(gun31, 49, 130, 0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, false));

		gun29 = new ModelRenderer(this);
		gun29.setRotationPoint(-3.2F, -31.5F, -3.6F);
		gun.addChild(gun29);
		gun29.cubeList.add(new ModelBox(gun29, 60, 21, 0.0F, 0.0F, 0.0F, 1, 5, 3, 0.0F, false));

		gun28 = new ModelRenderer(this);
		gun28.setRotationPoint(-0.8F, -31.5F, -3.6F);
		gun.addChild(gun28);
		gun28.cubeList.add(new ModelBox(gun28, 61, 32, 0.0F, 0.0F, 0.0F, 1, 5, 3, 0.0F, false));

		gun22 = new ModelRenderer(this);
		gun22.setRotationPoint(-3.0F, -31.5F, -5.3F);
		gun.addChild(gun22);
		gun22.cubeList.add(new ModelBox(gun22, 35, 67, 0.0F, 0.0F, 0.0F, 3, 6, 2, 0.0F, false));

		gun21 = new ModelRenderer(this);
		gun21.setRotationPoint(-3.2F, -26.5F, -4.3F);
		gun.addChild(gun21);
		setRotationAngle(gun21, 2.8256F, 0.0F, 0.0F);
		gun21.cubeList.add(new ModelBox(gun21, 62, 58, 0.01F, 0.0F, 0.0F, 1, 6, 1, 0.0F, false));

		gun20 = new ModelRenderer(this);
		gun20.setRotationPoint(-0.8F, -26.5F, -4.3F);
		gun.addChild(gun20);
		setRotationAngle(gun20, 2.8256F, 0.0F, 0.0F);
		gun20.cubeList.add(new ModelBox(gun20, 73, 47, -0.01F, 0.0F, 0.0F, 1, 6, 1, 0.0F, false));

		gun17 = new ModelRenderer(this);
		gun17.setRotationPoint(-3.0F, -26.8F, -7.4F);
		gun.addChild(gun17);
		gun17.cubeList.add(new ModelBox(gun17, 10, 88, 0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F, false));

		gun16 = new ModelRenderer(this);
		gun16.setRotationPoint(-0.8F, -26.5F, -5.5F);
		gun.addChild(gun16);
		setRotationAngle(gun16, 2.8256F, 0.0F, 0.0F);
		gun16.cubeList.add(new ModelBox(gun16, 73, 10, 0.0F, 0.0F, 0.0F, 1, 6, 2, 0.0F, false));

		gun15 = new ModelRenderer(this);
		gun15.setRotationPoint(-3.2F, -26.5F, -5.5F);
		gun.addChild(gun15);
		setRotationAngle(gun15, 2.8256F, 0.0F, 0.0F);
		gun15.cubeList.add(new ModelBox(gun15, 34, 77, 0.0F, 0.0F, 0.0F, 3, 6, 2, 0.0F, false));

		gun9 = new ModelRenderer(this);
		gun9.setRotationPoint(-0.5F, -35.0F, -26.5F);
		gun.addChild(gun9);
		gun9.cubeList.add(new ModelBox(gun9, 146, 0, 0.0F, 0.0F, 0.0F, 1, 4, 28, 0.0F, false));

		gun8 = new ModelRenderer(this);
		gun8.setRotationPoint(-3.4F, -35.0F, -26.5F);
		gun.addChild(gun8);
		gun8.cubeList.add(new ModelBox(gun8, 145, 92, 0.0F, 0.0F, 0.0F, 3, 4, 28, 0.0F, false));

		gun7 = new ModelRenderer(this);
		gun7.setRotationPoint(-3.0F, -32.0F, -16.5F);
		gun.addChild(gun7);
		gun7.cubeList.add(new ModelBox(gun7, 59, 78, 0.0F, 0.0F, 0.0F, 3, 6, 2, 0.0F, false));

		gun6 = new ModelRenderer(this);
		gun6.setRotationPoint(-2.5F, -27.0F, -14.5F);
		gun.addChild(gun6);
		gun6.cubeList.add(new ModelBox(gun6, 165, 32, 0.0F, 0.01F, 0.0F, 2, 1, 9, 0.0F, false));

		gun5 = new ModelRenderer(this);
		gun5.setRotationPoint(-0.8F, -31.0F, -7.5F);
		gun.addChild(gun5);
		gun5.cubeList.add(new ModelBox(gun5, 0, 0, 0.01F, 0.0F, 0.0F, 1, 5, 2, 0.0F, false));

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(-3.9F, -33.0F, -8.5F);
		gun.addChild(bone23);
		setRotationAngle(bone23, 0.5061F, 0.0F, 0.0F);
		bone23.cubeList.add(new ModelBox(bone23, 128, 162, -0.2F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
		bone23.cubeList.add(new ModelBox(bone23, 107, 65, -0.21F, -0.8F, -0.9F, 1, 2, 2, 0.0F, false));
		bone23.cubeList.add(new ModelBox(bone23, 139, 162, -0.2F, -0.3F, 0.3F, 1, 1, 1, 0.0F, false));
		bone23.cubeList.add(new ModelBox(bone23, 151, 162, -0.2F, -0.3F, -1.1F, 1, 1, 1, 0.0F, false));
		bone23.cubeList.add(new ModelBox(bone23, 162, 115, -0.2F, 0.4F, -0.5F, 1, 1, 1, 0.0F, false));

		gun166 = new ModelRenderer(this);
		gun166.setRotationPoint(0.0F, -3.0F, -7.0F);
		bone23.addChild(gun166);
		setRotationAngle(gun166, -0.0873F, 0.0F, 0.0F);
		gun166.cubeList.add(new ModelBox(gun166, 0, 115, 0.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, false));

		gun180 = new ModelRenderer(this);
		gun180.setRotationPoint(-0.1F, -1.85F, 0.0F);
		bone23.addChild(gun180);
		setRotationAngle(gun180, -1.7474F, 0.0F, 0.0F);
		gun180.cubeList.add(new ModelBox(gun180, 107, 55, 0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F, false));

		gun170 = new ModelRenderer(this);
		gun170.setRotationPoint(0.0F, 2.2F, 0.4F);
		bone23.addChild(gun170);
		setRotationAngle(gun170, 2.6397F, 0.0F, 0.0F);
		gun170.cubeList.add(new ModelBox(gun170, 124, 32, -0.001F, 0.0F, 0.0F, 1, 1, 8, 0.0F, false));

		gun171 = new ModelRenderer(this);
		gun171.setRotationPoint(0.0F, -2.0F, -7.0F);
		bone23.addChild(gun171);
		setRotationAngle(gun171, 0.9666F, 0.0F, 0.0F);
		gun171.cubeList.add(new ModelBox(gun171, 78, 31, 0.01F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun168 = new ModelRenderer(this);
		gun168.setRotationPoint(0.0F, -0.3F, 1.9F);
		bone23.addChild(gun168);
		setRotationAngle(gun168, -1.8961F, 0.0F, 0.0F);
		gun168.cubeList.add(new ModelBox(gun168, 0, 46, 0.001F, 0.0F, 0.0F, 1, 4, 2, 0.0F, false));
		gun168.cubeList.add(new ModelBox(gun168, 10, 46, 0.001F, 4.0F, 0.3F, 1, 3, 1, 0.0F, false));

		gun167 = new ModelRenderer(this);
		gun167.setRotationPoint(0.0F, -2.45F, -0.1F);
		bone23.addChild(gun167);
		setRotationAngle(gun167, -0.8179F, 0.0F, 0.0F);
		gun167.cubeList.add(new ModelBox(gun167, 116, 111, 0.02F, 0.0F, 0.0F, 1, 2, 3, 0.0F, false));

		gun179 = new ModelRenderer(this);
		gun179.setRotationPoint(-0.1F, -1.0F, 0.5F);
		bone23.addChild(gun179);
		setRotationAngle(gun179, -2.6025F, 0.0F, 0.0F);
		gun179.cubeList.add(new ModelBox(gun179, 162, 99, -0.001F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun169 = new ModelRenderer(this);
		gun169.setRotationPoint(0.0F, 1.7F, 1.3F);
		bone23.addChild(gun169);
		setRotationAngle(gun169, -2.6397F, 0.0F, 0.0F);
		gun169.cubeList.add(new ModelBox(gun169, 163, 0, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		barrel = new ModelRenderer(this);
		barrel.setRotationPoint(-1.0F, -36.8F, -85.5F);
		gun.addChild(barrel);
		

		barrel2 = new ModelRenderer(this);
		barrel2.setRotationPoint(1.0F, 36.8F, 85.5F);
		barrel.addChild(barrel2);
		

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-1.5F, -37.8F, -85.5F);
		barrel2.addChild(bone);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.4363F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 49, 93, 0.0F, 0.0F, 0.0F, 2, 1, 45, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.4363F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 92, -2.0F, 0.0F, 0.0F, 2, 1, 45, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-1.5F, -32.4F, -85.5F);
		barrel2.addChild(bone4);
		

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone4.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.4363F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, 0.0F, -1.0F, 0.0F, 2, 1, 45, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone4.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.4363F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 46, -2.0F, -1.0F, 0.0F, 2, 1, 45, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(1.2F, -35.1F, -85.5F);
		barrel2.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, 1.5708F);
		

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.4363F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 49, 1, 0.0F, 0.0F, 0.0F, 2, 1, 45, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 70.2F, 0.0F);
		bone2.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.4363F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 76, 106, -29.4208F, -63.3535F, 45.0F, 2, 1, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.4363F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 107, 114, -2.1268F, 0.2719F, 45.0F, 2, 1, 1, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 49, 47, -2.0F, 0.0F, 0.0F, 2, 1, 45, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-4.2F, -35.1F, -85.5F);
		barrel2.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.0F, -1.5708F);
		

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.4363F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 98, 0, -2.0F, 0.0F, 0.0F, 2, 1, 44, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 0.4363F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 98, 47, 0.0F, 0.0F, 0.0F, 2, 1, 44, 0.0F, false));

		barrelouter = new ModelRenderer(this);
		barrelouter.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrel.addChild(barrelouter);
		

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-0.5F, 4.4F, 0.0F);
		barrelouter.addChild(bone8);
		

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone8.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.4363F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 20, 133, 0.0F, -2.0F, 0.0F, 2, 2, 2, 0.05F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone8.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 0.4363F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 110, 133, -2.0F, -2.0F, 0.0F, 2, 2, 2, 0.051F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter.addChild(bone6);
		setRotationAngle(bone6, 0.0F, 0.0F, 1.5708F);
		

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone6.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, 0.4363F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 134, 36, 0.0F, 0.0F, 0.0F, 2, 2, 2, 0.052F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone6.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.4363F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 145, 108, -2.0F, 0.0F, 0.0F, 2, 2, 2, 0.05F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter.addChild(bone7);
		setRotationAngle(bone7, 0.0F, 0.0F, -1.5708F);
		

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone7.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -0.4363F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 124, 133, -2.0F, 0.0F, 0.0F, 2, 2, 2, 0.05F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone7.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, 0.4363F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 134, 32, 0.0F, 0.0F, 0.0F, 2, 2, 2, 0.052F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter.addChild(bone5);
		

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, 0.4363F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 145, 112, 0.0F, 0.0F, 0.0F, 2, 2, 2, 0.051F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, -0.4363F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 109, 157, -2.0F, 0.0F, 0.0F, 2, 2, 2, 0.05F, false));

		barrelouter3 = new ModelRenderer(this);
		barrelouter3.setRotationPoint(0.0F, 0.0F, 26.0F);
		barrel.addChild(barrelouter3);
		

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(-0.5F, 4.4F, 0.0F);
		barrelouter3.addChild(bone13);
		

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone13.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, -0.4363F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 176, 20, 0.0F, -1.0F, 0.0F, 2, 1, 4, 0.1F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone13.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, 0.4363F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 37, 176, -2.0F, -1.0F, 0.0F, 2, 1, 4, 0.1F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter3.addChild(bone14);
		setRotationAngle(bone14, 0.0F, 0.0F, 1.5708F);
		

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone14.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, 0.4363F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 176, 10, 0.0F, 0.0F, 0.0F, 2, 1, 4, 0.1F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone14.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, -0.4363F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 176, 15, -2.0F, 0.0F, 0.0F, 2, 1, 4, 0.1F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter3.addChild(bone15);
		setRotationAngle(bone15, 0.0F, 0.0F, -1.5708F);
		

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone15.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, -0.4363F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 176, 0, -2.0F, 0.0F, 0.0F, 2, 1, 4, 0.1F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone15.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, 0.4363F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 176, 5, 0.0F, 0.0F, 0.0F, 2, 1, 4, 0.1F, false));

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter3.addChild(bone16);
		

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone16.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, 0.4363F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 29, 174, 0.0F, 0.0F, 0.0F, 2, 1, 4, 0.1F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone16.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.0F, -0.4363F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 175, 162, -2.0F, 0.0F, 0.0F, 2, 1, 4, 0.1F, false));

		barrelouter4 = new ModelRenderer(this);
		barrelouter4.setRotationPoint(0.0F, 0.0F, 42.9F);
		barrel.addChild(barrelouter4);
		

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(-0.5F, 4.4F, 0.0F);
		barrelouter4.addChild(bone17);
		

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone17.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, -0.4363F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 130, 116, 0.0F, -1.0F, 0.0F, 2, 1, 1, 0.1F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone17.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, 0.0F, 0.4363F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 87, 131, -2.0F, -1.0F, 0.0F, 2, 1, 1, 0.1F, false));

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter4.addChild(bone18);
		setRotationAngle(bone18, 0.0F, 0.0F, 1.5708F);
		bone18.cubeList.add(new ModelBox(bone18, 126, 116, -0.5F, 0.3F, 2.0F, 1, 1, 2, 0.0F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone18.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, 0.0F, 0.4363F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 130, 41, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.1F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone18.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.0F, 0.0F, -0.4363F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 130, 98, -2.0F, 0.0F, 0.0F, 2, 1, 1, 0.1F, false));

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter4.addChild(bone19);
		setRotationAngle(bone19, 0.0F, 0.0F, -1.5708F);
		

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone19.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.0F, 0.0F, -0.4363F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 128, 106, -2.0F, 0.0F, 0.0F, 2, 1, 1, 0.1F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone19.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.0F, 0.0F, 0.4363F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 128, 124, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.1F, false));

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter4.addChild(bone20);
		

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone20.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.0F, 0.0F, 0.4363F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 58, 115, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.1F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone20.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.0F, 0.0F, -0.4363F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 126, 60, -2.0F, 0.0F, 0.0F, 2, 1, 1, 0.1F, false));

		barrelouter2 = new ModelRenderer(this);
		barrelouter2.setRotationPoint(0.0F, 0.0F, 4.0F);
		barrel.addChild(barrelouter2);
		

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-0.5F, 4.4F, 0.0F);
		barrelouter2.addChild(bone9);
		

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone9.addChild(cube_r34);
		setRotationAngle(cube_r34, 0.0F, 0.0F, -0.4363F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 67, 0.0F, -1.0F, 0.0F, 2, 1, 20, 0.05F, false));

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone9.addChild(cube_r35);
		setRotationAngle(cube_r35, 0.0F, 0.0F, 0.4363F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 49, 68, -2.0F, -1.0F, 0.0F, 2, 1, 20, 0.05F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter2.addChild(bone10);
		setRotationAngle(bone10, 0.0F, 0.0F, 1.5708F);
		

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone10.addChild(cube_r36);
		setRotationAngle(cube_r36, 0.0F, 0.0F, 0.4363F);
		cube_r36.cubeList.add(new ModelBox(cube_r36, 49, 21, 0.0F, 0.0F, 0.0F, 2, 1, 20, 0.05F, false));

		cube_r37 = new ModelRenderer(this);
		cube_r37.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone10.addChild(cube_r37);
		setRotationAngle(cube_r37, 0.0F, 0.0F, -0.4363F);
		cube_r37.cubeList.add(new ModelBox(cube_r37, 49, 47, -2.0F, 0.0F, 0.0F, 2, 1, 20, 0.05F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter2.addChild(bone11);
		setRotationAngle(bone11, 0.0F, 0.0F, -1.5708F);
		

		cube_r38 = new ModelRenderer(this);
		cube_r38.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone11.addChild(cube_r38);
		setRotationAngle(cube_r38, 0.0F, 0.0F, -0.4363F);
		cube_r38.cubeList.add(new ModelBox(cube_r38, 0, 46, -2.0F, 0.0F, 0.0F, 2, 1, 20, 0.05F, false));

		cube_r39 = new ModelRenderer(this);
		cube_r39.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone11.addChild(cube_r39);
		setRotationAngle(cube_r39, 0.0F, 0.0F, 0.4363F);
		cube_r39.cubeList.add(new ModelBox(cube_r39, 49, 0, 0.0F, 0.0F, 0.0F, 2, 1, 20, 0.05F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter2.addChild(bone12);
		

		cube_r40 = new ModelRenderer(this);
		cube_r40.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone12.addChild(cube_r40);
		setRotationAngle(cube_r40, 0.0F, 0.0F, 0.4363F);
		cube_r40.cubeList.add(new ModelBox(cube_r40, 0, 0, 0.0F, 0.0F, 0.0F, 2, 1, 20, 0.05F, false));

		cube_r41 = new ModelRenderer(this);
		cube_r41.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone12.addChild(cube_r41);
		setRotationAngle(cube_r41, 0.0F, 0.0F, -0.4363F);
		cube_r41.cubeList.add(new ModelBox(cube_r41, 0, 21, -2.0F, 0.0F, 0.0F, 2, 1, 20, 0.05F, false));

		ironsights = new ModelRenderer(this);
		ironsights.setRotationPoint(1.0F, -1.2F, 1.5F);
		barrel.addChild(ironsights);
		ironsights.cubeList.add(new ModelBox(ironsights, 38, 0, -1.1F, -2.1F, -1.4F, 1, 4, 2, -0.3F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 145, 108, -2.1F, -0.9F, 32.6F, 2, 3, 9, -0.3F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 117, 0, -2.9F, -0.9F, 32.6F, 2, 3, 9, -0.299F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 158, 108, -2.9F, -1.1F, 35.6F, 1, 1, 6, -0.301F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 158, 16, -1.1F, -1.1F, 35.6F, 1, 1, 6, -0.301F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 98, 37, -2.9F, -1.96F, 33.52F, 1, 2, 2, -0.301F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 49, 32, -2.5F, -1.76F, 33.92F, 2, 1, 8, -0.301F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 86, 73, -3.0F, -1.56F, 41.22F, 3, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 86, 60, -3.0F, -1.76F, 41.22F, 3, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 86, 52, -3.0F, -1.96F, 41.22F, 3, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 125, 161, -1.0F, -2.16F, 41.22F, 1, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 98, 161, -1.2F, -2.16F, 41.22F, 1, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 161, 67, -1.4F, -2.16F, 41.22F, 1, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 161, 65, -1.6F, -2.16F, 41.22F, 1, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 161, 61, -1.7F, -2.16F, 41.22F, 1, 1, 1, -0.401F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 161, 45, -1.7F, -2.26F, 41.22F, 1, 1, 1, -0.402F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 161, 47, -1.6F, -2.26F, 41.22F, 1, 1, 1, -0.401F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 161, 51, -1.4F, -2.26F, 41.22F, 1, 1, 1, -0.401F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 161, 53, -1.2F, -2.26F, 41.22F, 1, 1, 1, -0.401F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 161, 59, -1.0F, -2.26F, 41.22F, 1, 1, 1, -0.401F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 136, 159, -2.3F, -2.26F, 41.22F, 1, 1, 1, -0.402F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 159, 140, -2.4F, -2.26F, 41.22F, 1, 1, 1, -0.401F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 159, 142, -2.6F, -2.26F, 41.22F, 1, 1, 1, -0.401F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 76, 160, -2.8F, -2.26F, 41.22F, 1, 1, 1, -0.401F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 160, 124, -3.0F, -2.26F, 41.22F, 1, 1, 1, -0.401F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 160, 126, -2.3F, -2.16F, 41.22F, 1, 1, 1, -0.401F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 128, 160, -2.4F, -2.16F, 41.22F, 1, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 160, 128, -2.8F, -2.16F, 41.22F, 1, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 139, 160, -3.0F, -2.16F, 41.22F, 1, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 161, 24, -2.6F, -2.16F, 41.22F, 1, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 58, 93, -1.1F, -1.96F, 33.52F, 1, 2, 2, -0.301F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 24, 21, -2.9F, -2.1F, -1.4F, 1, 4, 2, -0.3F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 65, 21, -2.0F, -2.2F, -1.4F, 1, 2, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 16, 46, -1.1F, -1.3F, -1.8F, 1, 3, 1, -0.3F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 49, 0, -2.9F, -1.3F, -1.8F, 1, 3, 1, -0.3F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 73, 81, -2.5F, -1.1F, -1.5F, 2, 1, 2, -0.201F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 49, 74, -2.5F, -0.1F, -1.5F, 2, 1, 2, -0.201F, false));

		cube_r42 = new ModelRenderer(this);
		cube_r42.setRotationPoint(-0.4F, -1.66F, 35.22F);
		ironsights.addChild(cube_r42);
		setRotationAngle(cube_r42, -0.5236F, 0.0F, 0.0F);
		cube_r42.cubeList.add(new ModelBox(cube_r42, 73, 31, -0.7F, -0.3F, -0.3F, 1, 2, 3, -0.302F, false));
		cube_r42.cubeList.add(new ModelBox(cube_r42, 73, 76, -2.5F, -0.3F, -0.3F, 1, 2, 3, -0.302F, false));

		cube_r43 = new ModelRenderer(this);
		cube_r43.setRotationPoint(-2.7F, -1.36F, 40.72F);
		ironsights.addChild(cube_r43);
		setRotationAngle(cube_r43, 0.3665F, 0.0F, 0.0F);
		cube_r43.cubeList.add(new ModelBox(cube_r43, 0, 162, -0.4F, -0.3F, -0.3F, 1, 1, 1, -0.15F, false));
		cube_r43.cubeList.add(new ModelBox(cube_r43, 136, 161, -0.1F, -0.3F, -0.3F, 1, 1, 1, -0.151F, false));
		cube_r43.cubeList.add(new ModelBox(cube_r43, 9, 162, 1.5F, -0.3F, -0.3F, 1, 1, 1, -0.151F, false));
		cube_r43.cubeList.add(new ModelBox(cube_r43, 17, 162, 1.8F, -0.3F, -0.3F, 1, 1, 1, -0.15F, false));

		cube_r44 = new ModelRenderer(this);
		cube_r44.setRotationPoint(-0.4F, -1.16F, 33.92F);
		ironsights.addChild(cube_r44);
		setRotationAngle(cube_r44, 0.3665F, 0.0F, 0.0F);
		cube_r44.cubeList.add(new ModelBox(cube_r44, 49, 89, -2.6F, -0.3F, -0.3F, 3, 1, 1, -0.1F, false));

		cube_r45 = new ModelRenderer(this);
		cube_r45.setRotationPoint(-0.8F, -0.6F, 32.9F);
		ironsights.addChild(cube_r45);
		setRotationAngle(cube_r45, -0.7156F, 0.0F, 0.0F);
		cube_r45.cubeList.add(new ModelBox(cube_r45, 49, 63, -1.7F, -0.7F, -0.3F, 2, 1, 1, -0.302F, false));
		cube_r45.cubeList.add(new ModelBox(cube_r45, 73, 68, -0.3F, -1.7F, -0.3F, 1, 2, 2, -0.302F, false));
		cube_r45.cubeList.add(new ModelBox(cube_r45, 98, 47, -2.1F, -1.7F, -0.3F, 1, 2, 2, -0.302F, false));

		gun4 = new ModelRenderer(this);
		gun4.setRotationPoint(-3.2F, -31.0F, -7.5F);
		gun.addChild(gun4);
		gun4.cubeList.add(new ModelBox(gun4, 83, 76, -0.01F, 0.0F, 0.0F, 3, 5, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gun.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}