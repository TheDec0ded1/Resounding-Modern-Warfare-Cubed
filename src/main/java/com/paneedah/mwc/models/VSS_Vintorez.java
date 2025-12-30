package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class VSS_Vintorez extends ModelWithAttachments {
	private final ModelRenderer vss;
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
	private final ModelRenderer gun172_r1;
	private final ModelRenderer gun173_r2;
	private final ModelRenderer gun171;
	private final ModelRenderer gun168;
	private final ModelRenderer gun167;
	private final ModelRenderer gun179;
	private final ModelRenderer gun169;
	private final ModelRenderer gun4;
	private final ModelRenderer barrel3;
	private final ModelRenderer barrel4;
	private final ModelRenderer bone21;
	private final ModelRenderer cube_r46;
	private final ModelRenderer cube_r47;
	private final ModelRenderer bone22;
	private final ModelRenderer cube_r48;
	private final ModelRenderer cube_r49;
	private final ModelRenderer bone24;
	private final ModelRenderer cube_r50;
	private final ModelRenderer cube_r51;
	private final ModelRenderer cube_r52;
	private final ModelRenderer bone25;
	private final ModelRenderer cube_r53;
	private final ModelRenderer cube_r54;
	private final ModelRenderer barrelouter5;
	private final ModelRenderer bone26;
	private final ModelRenderer cube_r55;
	private final ModelRenderer cube_r56;
	private final ModelRenderer bone27;
	private final ModelRenderer cube_r57;
	private final ModelRenderer cube_r58;
	private final ModelRenderer bone28;
	private final ModelRenderer cube_r59;
	private final ModelRenderer cube_r60;
	private final ModelRenderer bone29;
	private final ModelRenderer cube_r61;
	private final ModelRenderer cube_r62;
	private final ModelRenderer barrelouter6;
	private final ModelRenderer bone30;
	private final ModelRenderer cube_r63;
	private final ModelRenderer cube_r64;
	private final ModelRenderer bone31;
	private final ModelRenderer cube_r65;
	private final ModelRenderer cube_r66;
	private final ModelRenderer bone32;
	private final ModelRenderer cube_r67;
	private final ModelRenderer cube_r68;
	private final ModelRenderer bone33;
	private final ModelRenderer cube_r69;
	private final ModelRenderer cube_r70;
	private final ModelRenderer barrelouter7;
	private final ModelRenderer bone36;
	private final ModelRenderer cube_r71;
	private final ModelRenderer cube_r72;
	private final ModelRenderer bone37;
	private final ModelRenderer cube_r73;
	private final ModelRenderer cube_r74;
	private final ModelRenderer bone38;
	private final ModelRenderer cube_r75;
	private final ModelRenderer cube_r76;
	private final ModelRenderer bone39;
	private final ModelRenderer cube_r77;
	private final ModelRenderer cube_r78;
	private final ModelRenderer barrelouter8;
	private final ModelRenderer bone40;
	private final ModelRenderer cube_r79;
	private final ModelRenderer cube_r80;
	private final ModelRenderer bone41;
	private final ModelRenderer cube_r81;
	private final ModelRenderer cube_r82;
	private final ModelRenderer bone42;
	private final ModelRenderer cube_r83;
	private final ModelRenderer cube_r84;
	private final ModelRenderer bone43;
	private final ModelRenderer cube_r85;
	private final ModelRenderer cube_r86;
	private final ModelRenderer ironsights2;
	private final ModelRenderer cube_r87;
	private final ModelRenderer cube_r88;
	private final ModelRenderer cube_r89;
	private final ModelRenderer cube_r90;
	private final ModelRenderer fireSelector2;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;

	public VSS_Vintorez() {
		textureWidth = 240;
		textureHeight = 240;

		vss = new ModelRenderer(this);
		vss.setRotationPoint(0.1F, 23.7F, 0.0F);
		

		TRIGGER = new ModelRenderer(this);
		TRIGGER.setRotationPoint(-2.0F, -31.2F, -10.5F);
		vss.addChild(TRIGGER);
		setRotationAngle(TRIGGER, 0.4461F, 0.0F, 0.0F);
		TRIGGER.cubeList.add(new ModelBox(TRIGGER, 121, 226, -0.1F, -1.3453F, 0.8412F, 1, 2, 1, -0.2F, false));

		gun13TRIGGER = new ModelRenderer(this);
		gun13TRIGGER.setRotationPoint(-2.0F, -28.0F, -9.7F);
		vss.addChild(gun13TRIGGER);
		setRotationAngle(gun13TRIGGER, -2.6397F, 0.0F, 0.0F);
		gun13TRIGGER.cubeList.add(new ModelBox(gun13TRIGGER, 226, 168, -0.1F, 1.0629F, -0.9219F, 1, 1, 1, -0.199F, false));

		gun12TRIGGER = new ModelRenderer(this);
		gun12TRIGGER.setRotationPoint(-2.0F, -28.7F, -9.1F);
		vss.addChild(gun12TRIGGER);
		setRotationAngle(gun12TRIGGER, -2.3051F, 0.0F, 0.0F);
		gun12TRIGGER.cubeList.add(new ModelBox(gun12TRIGGER, 226, 171, -0.101F, 0.7308F, -0.9755F, 1, 1, 1, -0.2F, false));

		gun11TRIGGER = new ModelRenderer(this);
		gun11TRIGGER.setRotationPoint(-2.0F, -31.8F, -9.0F);
		vss.addChild(gun11TRIGGER);
		setRotationAngle(gun11TRIGGER, -0.3718F, 0.0F, 0.0F);
		gun11TRIGGER.cubeList.add(new ModelBox(gun11TRIGGER, 109, 224, -0.1F, -0.9317F, -0.3633F, 1, 3, 1, -0.199F, false));

		gun137 = new ModelRenderer(this);
		gun137.setRotationPoint(-1.7F, -38.3F, 0.85F);
		vss.addChild(gun137);
		setRotationAngle(gun137, -1.0038F, 0.0F, 0.0F);
		gun137.cubeList.add(new ModelBox(gun137, 212, 230, -0.1F, 1.7487F, -0.0465F, 1, 1, 1, -0.2F, false));

		gun136 = new ModelRenderer(this);
		gun136.setRotationPoint(-1.7F, -38.7F, -0.1F);
		vss.addChild(gun136);
		setRotationAngle(gun136, -0.409F, 0.0F, 0.0F);
		gun136.cubeList.add(new ModelBox(gun136, 226, 149, -0.1F, 1.4892F, -0.7341F, 1, 1, 1, -0.2F, false));

		gun135 = new ModelRenderer(this);
		gun135.setRotationPoint(-2.3F, -38.3F, 0.85F);
		vss.addChild(gun135);
		setRotationAngle(gun135, -1.0038F, 0.0F, 0.0F);
		gun135.cubeList.add(new ModelBox(gun135, 217, 230, -0.1F, 1.7487F, -0.0465F, 1, 1, 1, -0.2F, false));

		gun134 = new ModelRenderer(this);
		gun134.setRotationPoint(-2.3F, -38.7F, -0.1F);
		vss.addChild(gun134);
		setRotationAngle(gun134, -0.409F, 0.0F, 0.0F);
		gun134.cubeList.add(new ModelBox(gun134, 226, 159, -0.1F, 1.4892F, -0.7341F, 1, 1, 1, -0.2F, false));

		gun133 = new ModelRenderer(this);
		gun133.setRotationPoint(-2.0F, -38.35F, 1.12F);
		vss.addChild(gun133);
		setRotationAngle(gun133, -1.1897F, 0.0F, 0.0F);
		gun133.cubeList.add(new ModelBox(gun133, 129, 231, -0.1F, 1.7271F, 0.2775F, 1, 1, 1, -0.2F, false));

		gun132 = new ModelRenderer(this);
		gun132.setRotationPoint(-2.0F, -38.9F, 0.3F);
		vss.addChild(gun132);
		setRotationAngle(gun132, -0.5949F, 0.0F, 0.0F);
		gun132.cubeList.add(new ModelBox(gun132, 222, 230, -0.1F, 1.6597F, -0.497F, 1, 1, 1, -0.2F, false));

		gun131 = new ModelRenderer(this);
		gun131.setRotationPoint(-2.0F, -38.4F, -0.6F);
		vss.addChild(gun131);
		setRotationAngle(gun131, 0.5205F, 0.0F, 0.0F);
		gun131.cubeList.add(new ModelBox(gun131, 226, 202, -0.1F, 0.365F, -1.5713F, 1, 1, 1, -0.2F, false));

		gun115 = new ModelRenderer(this);
		gun115.setRotationPoint(0.9F, -33.8F, 0.5F);
		vss.addChild(gun115);
		setRotationAngle(gun115, 0.0F, 0.0F, 2.491F);
		gun115.cubeList.add(new ModelBox(gun115, 226, 205, -0.0029F, 0.2014F, -1.98F, 1, 1, 1, -0.2F, false));

		gun114 = new ModelRenderer(this);
		gun114.setRotationPoint(0.9F, -33.8F, -3.0F);
		vss.addChild(gun114);
		setRotationAngle(gun114, 0.0F, 0.0F, 2.491F);
		gun114.cubeList.add(new ModelBox(gun114, 226, 208, -0.0029F, 0.2014F, -1.99F, 1, 1, 1, -0.2F, false));

		gun113 = new ModelRenderer(this);
		gun113.setRotationPoint(-0.1F, -34.8F, 0.5F);
		vss.addChild(gun113);
		gun113.cubeList.add(new ModelBox(gun113, 226, 211, -0.2F, 0.0F, -1.98F, 1, 1, 1, -0.2F, false));

		gun112 = new ModelRenderer(this);
		gun112.setRotationPoint(-0.1F, -34.8F, -3.0F);
		vss.addChild(gun112);
		gun112.cubeList.add(new ModelBox(gun112, 92, 227, -0.2F, 0.0F, -1.99F, 1, 1, 1, -0.2F, false));

		gun111 = new ModelRenderer(this);
		gun111.setRotationPoint(-0.1F, -35.0F, -3.0F);
		vss.addChild(gun111);
		gun111.cubeList.add(new ModelBox(gun111, 97, 227, -0.22F, 0.0F, -2.01F, 1, 1, 1, -0.2F, false));

		gun110 = new ModelRenderer(this);
		gun110.setRotationPoint(-0.1F, -35.0F, -2.5F);
		vss.addChild(gun110);
		gun110.cubeList.add(new ModelBox(gun110, 143, 196, -0.21F, 0.0F, -2.0F, 1, 1, 4, -0.2F, false));

		gun109 = new ModelRenderer(this);
		gun109.setRotationPoint(0.9F, -33.8F, -12.5F);
		vss.addChild(gun109);
		setRotationAngle(gun109, 0.0F, 0.0F, 2.491F);
		gun109.cubeList.add(new ModelBox(gun109, 167, 227, 0.0051F, 0.2074F, -1.01F, 1, 1, 1, -0.2F, false));

		gun108 = new ModelRenderer(this);
		gun108.setRotationPoint(0.9F, -33.8F, -9.5F);
		vss.addChild(gun108);
		setRotationAngle(gun108, 0.0F, 0.0F, 2.491F);
		gun108.cubeList.add(new ModelBox(gun108, 172, 227, 0.0051F, 0.2074F, -0.99F, 1, 1, 1, -0.2F, false));

		gun107 = new ModelRenderer(this);
		gun107.setRotationPoint(-0.1F, -34.8F, -9.5F);
		vss.addChild(gun107);
		gun107.cubeList.add(new ModelBox(gun107, 227, 188, -0.21F, 0.0F, -0.99F, 1, 1, 1, -0.2F, false));

		gun106 = new ModelRenderer(this);
		gun106.setRotationPoint(-0.1F, -34.8F, -12.5F);
		vss.addChild(gun106);
		gun106.cubeList.add(new ModelBox(gun106, 227, 191, -0.21F, 0.0F, -1.01F, 1, 1, 1, -0.2F, false));

		gun105 = new ModelRenderer(this);
		gun105.setRotationPoint(-0.1F, -35.0F, -12.5F);
		vss.addChild(gun105);
		gun105.cubeList.add(new ModelBox(gun105, 33, 197, -0.2F, 0.0F, -1.0F, 1, 1, 4, -0.2F, false));

		gun104 = new ModelRenderer(this);
		gun104.setRotationPoint(0.9F, -33.7F, -4.5F);
		vss.addChild(gun104);
		setRotationAngle(gun104, 0.0F, 0.0F, 2.3423F);
		gun104.cubeList.add(new ModelBox(gun104, 227, 194, 0.6045F, -0.3767F, -1.9624F, 1, 1, 1, -0.2F, false));

		gun103 = new ModelRenderer(this);
		gun103.setRotationPoint(0.9F, -33.7F, -7.5F);
		vss.addChild(gun103);
		setRotationAngle(gun103, 0.0F, 0.0F, 2.3423F);
		gun103.cubeList.add(new ModelBox(gun103, 227, 223, 0.6056F, -0.3756F, -1.2397F, 1, 1, 1, -0.2F, false));

		gun102 = new ModelRenderer(this);
		gun102.setRotationPoint(-0.1F, -33.7F, -4.5F);
		vss.addChild(gun102);
		gun102.cubeList.add(new ModelBox(gun102, 227, 226, -0.2343F, 0.5F, -1.9624F, 1, 1, 1, -0.2F, false));

		gun101 = new ModelRenderer(this);
		gun101.setRotationPoint(-0.1F, -33.7F, -7.5F);
		vss.addChild(gun101);
		gun101.cubeList.add(new ModelBox(gun101, 228, 0, -0.2359F, 0.5F, -1.2397F, 1, 1, 1, -0.2F, false));

		gun100 = new ModelRenderer(this);
		gun100.setRotationPoint(0.9F, -33.5F, -4.5F);
		vss.addChild(gun100);
		setRotationAngle(gun100, 0.0F, -3.0115F, 0.0F);
		gun100.cubeList.add(new ModelBox(gun100, 230, 116, -0.0093F, 0.5F, 1.6124F, 1, 1, 1, -0.2F, false));

		gun99 = new ModelRenderer(this);
		gun99.setRotationPoint(0.9F, -33.5F, -6.5F);
		vss.addChild(gun99);
		setRotationAngle(gun99, 0.0F, -1.7102F, 0.0F);
		gun99.cubeList.add(new ModelBox(gun99, 228, 3, -1.5567F, 0.5F, 0.4204F, 1, 1, 1, -0.2F, false));

		gun98 = new ModelRenderer(this);
		gun98.setRotationPoint(-0.2F, -33.5F, -6.5F);
		vss.addChild(gun98);
		gun98.cubeList.add(new ModelBox(gun98, 139, 224, -0.2F, 0.49F, -1.6F, 1, 1, 2, -0.2F, false));

		gun97 = new ModelRenderer(this);
		gun97.setRotationPoint(-0.1F, -33.5F, -4.5F);
		vss.addChild(gun97);
		gun97.cubeList.add(new ModelBox(gun97, 228, 6, -0.2243F, 0.5F, -1.9724F, 1, 1, 1, -0.2F, false));

		gun96 = new ModelRenderer(this);
		gun96.setRotationPoint(-0.1F, -33.5F, -7.5F);
		vss.addChild(gun96);
		gun96.cubeList.add(new ModelBox(gun96, 228, 9, -0.2259F, 0.5F, -1.2297F, 1, 1, 1, -0.2F, false));

		gun95 = new ModelRenderer(this);
		gun95.setRotationPoint(0.9F, -33.7F, -14.5F);
		vss.addChild(gun95);
		setRotationAngle(gun95, 0.0F, 0.0F, 2.3423F);
		gun95.cubeList.add(new ModelBox(gun95, 228, 12, 0.5876F, -0.3941F, -0.99F, 1, 1, 1, -0.2F, false));

		gun94 = new ModelRenderer(this);
		gun94.setRotationPoint(0.9F, -33.7F, -17.5F);
		vss.addChild(gun94);
		setRotationAngle(gun94, 0.0F, 0.0F, 2.3423F);
		gun94.cubeList.add(new ModelBox(gun94, 228, 15, 0.5876F, -0.3941F, -0.99F, 1, 1, 1, -0.2F, false));

		gun93 = new ModelRenderer(this);
		gun93.setRotationPoint(0.9F, -33.7F, -17.0F);
		vss.addChild(gun93);
		setRotationAngle(gun93, 0.0F, 0.0F, 2.3423F);
		gun93.cubeList.add(new ModelBox(gun93, 228, 18, 0.5976F, -0.3941F, -1.01F, 1, 1, 1, -0.2F, false));

		gun92 = new ModelRenderer(this);
		gun92.setRotationPoint(-0.1F, -33.7F, -17.0F);
		vss.addChild(gun92);
		gun92.cubeList.add(new ModelBox(gun92, 73, 228, -0.22F, 0.5F, -1.0F, 1, 1, 1, -0.2F, false));

		gun91 = new ModelRenderer(this);
		gun91.setRotationPoint(-0.1F, -33.7F, -14.5F);
		vss.addChild(gun91);
		gun91.cubeList.add(new ModelBox(gun91, 78, 228, -0.21F, 0.5F, -0.99F, 1, 1, 1, -0.2F, false));

		gun90 = new ModelRenderer(this);
		gun90.setRotationPoint(-0.1F, -33.7F, -17.5F);
		vss.addChild(gun90);
		gun90.cubeList.add(new ModelBox(gun90, 114, 228, -0.21F, 0.5F, -0.99F, 1, 1, 1, -0.2F, false));

		gun89 = new ModelRenderer(this);
		gun89.setRotationPoint(-0.4F, -35.0F, -22.0F);
		vss.addChild(gun89);
		

		gun88 = new ModelRenderer(this);
		gun88.setRotationPoint(-0.1F, -35.0F, -22.0F);
		vss.addChild(gun88);
		

		gun87 = new ModelRenderer(this);
		gun87.setRotationPoint(-0.1F, -33.5F, -17.5F);
		vss.addChild(gun87);
		gun87.cubeList.add(new ModelBox(gun87, 176, 214, -0.2F, 0.5F, -0.985F, 1, 1, 4, -0.2F, false));

		gun86 = new ModelRenderer(this);
		gun86.setRotationPoint(-0.35F, -32.8F, -24.0F);
		vss.addChild(gun86);
		

		gun85 = new ModelRenderer(this);
		gun85.setRotationPoint(-0.1F, -33.6F, -25.5F);
		vss.addChild(gun85);
		setRotationAngle(gun85, 2.1935F, 0.0F, 0.0F);
		gun85.cubeList.add(new ModelBox(gun85, 228, 123, -0.23F, 0.5509F, -0.5187F, 1, 1, 1, -0.2F, false));
		gun85.cubeList.add(new ModelBox(gun85, 228, 126, -0.23F, 0.8509F, -0.5187F, 1, 1, 1, -0.2F, false));

		gun84 = new ModelRenderer(this);
		gun84.setRotationPoint(0.9F, -34.0F, -22.0F);
		vss.addChild(gun84);
		setRotationAngle(gun84, 0.0F, 0.0F, 2.2679F);
		gun84.cubeList.add(new ModelBox(gun84, 213, 101, -0.0965F, 0.235F, -0.5F, 2, 1, 1, -0.2F, false));

		gun83 = new ModelRenderer(this);
		gun83.setRotationPoint(-0.1F, -33.5F, -26.0F);
		vss.addChild(gun83);
		

		gun82 = new ModelRenderer(this);
		gun82.setRotationPoint(-0.1F, -33.5F, -26.5F);
		vss.addChild(gun82);
		gun82.cubeList.add(new ModelBox(gun82, 228, 129, -0.23F, -0.4791F, 0.9958F, 1, 1, 1, -0.2F, false));

		gun81 = new ModelRenderer(this);
		gun81.setRotationPoint(-0.1F, -34.0F, -26.5F);
		vss.addChild(gun81);
		gun81.cubeList.add(new ModelBox(gun81, 131, 228, -0.23F, -0.5791F, 0.9958F, 1, 1, 1, -0.2F, false));

		gun80 = new ModelRenderer(this);
		gun80.setRotationPoint(-0.1F, -35.0F, -26.5F);
		vss.addChild(gun80);
		gun80.cubeList.add(new ModelBox(gun80, 187, 214, -0.2F, 0.0F, 1.0F, 1, 1, 4, -0.2F, false));

		gun79 = new ModelRenderer(this);
		gun79.setRotationPoint(-0.4F, -35.0F, -17.5F);
		vss.addChild(gun79);
		gun79.cubeList.add(new ModelBox(gun79, 104, 185, -0.16F, 0.0F, -0.99F, 1, 3, 18, -0.2F, false));
		gun79.cubeList.add(new ModelBox(gun79, 213, 81, -0.16F, 0.0F, -7.99F, 1, 3, 4, -0.2F, false));

		gun78 = new ModelRenderer(this);
		gun78.setRotationPoint(-0.4F, -35.0F, -26.5F);
		vss.addChild(gun78);
		

		gun77 = new ModelRenderer(this);
		gun77.setRotationPoint(-0.6F, -31.6F, -7.5F);
		vss.addChild(gun77);
		gun77.cubeList.add(new ModelBox(gun77, 125, 207, 0.01F, -1.0F, -0.01F, 1, 1, 7, -0.2F, false));

		gun76 = new ModelRenderer(this);
		gun76.setRotationPoint(-3.4F, -28.3F, -19.5F);
		vss.addChild(gun76);
		gun76.cubeList.add(new ModelBox(gun76, 228, 132, -0.2F, -0.1F, 1.7F, 1, 1, 1, -0.2F, false));

		gun75 = new ModelRenderer(this);
		gun75.setRotationPoint(-0.6F, -28.3F, -19.5F);
		vss.addChild(gun75);
		gun75.cubeList.add(new ModelBox(gun75, 198, 214, 0.02F, -0.9F, -0.9F, 1, 1, 4, -0.2F, false));

		gun74 = new ModelRenderer(this);
		gun74.setRotationPoint(-3.4F, -27.8F, -19.0F);
		vss.addChild(gun74);
		gun74.cubeList.add(new ModelBox(gun74, 228, 135, -0.2F, -1.2F, 1.5F, 1, 1, 1, -0.2F, false));
		gun74.cubeList.add(new ModelBox(gun74, 161, 219, -0.2F, -1.2F, -0.9F, 1, 1, 3, -0.2F, false));

		gun73 = new ModelRenderer(this);
		gun73.setRotationPoint(-0.6F, -27.8F, -19.0F);
		vss.addChild(gun73);
		gun73.cubeList.add(new ModelBox(gun73, 146, 224, 0.02F, -0.9F, 0.2F, 1, 1, 2, -0.2F, false));

		gun72 = new ModelRenderer(this);
		gun72.setRotationPoint(-0.6F, -29.0F, -23.0F);
		vss.addChild(gun72);
		gun72.cubeList.add(new ModelBox(gun72, 208, 188, 0.02F, -1.2F, -1.3F, 1, 1, 8, -0.2F, false));

		gun71 = new ModelRenderer(this);
		gun71.setRotationPoint(-3.4F, -29.0F, -23.0F);
		vss.addChild(gun71);
		gun71.cubeList.add(new ModelBox(gun71, 210, 104, -0.2F, -1.2F, -1.3F, 1, 1, 8, -0.2F, false));

		gun70 = new ModelRenderer(this);
		gun70.setRotationPoint(-3.4F, -28.8F, -22.5F);
		vss.addChild(gun70);
		gun70.cubeList.add(new ModelBox(gun70, 213, 42, -0.19F, -0.8F, 0.4F, 1, 1, 5, -0.2F, false));
		gun70.cubeList.add(new ModelBox(gun70, 136, 228, -0.19F, -0.8F, 5.0F, 1, 1, 1, -0.2F, false));

		gun69 = new ModelRenderer(this);
		gun69.setRotationPoint(-0.6F, -28.8F, -22.5F);
		vss.addChild(gun69);
		gun69.cubeList.add(new ModelBox(gun69, 211, 159, 0.01F, -0.925F, 0.1F, 1, 1, 6, -0.2F, false));

		gun68 = new ModelRenderer(this);
		gun68.setRotationPoint(-3.5F, -26.25F, -17.5F);
		vss.addChild(gun68);
		setRotationAngle(gun68, 1.3013F, 0.0F, 0.0F);
		gun68.cubeList.add(new ModelBox(gun68, 162, 117, -0.155F, -0.3267F, 1.0099F, 3, 1, 1, -0.199F, false));
		gun68.cubeList.add(new ModelBox(gun68, 73, 225, 1.995F, -0.3267F, 1.0099F, 2, 1, 1, -0.199F, false));

		gun67 = new ModelRenderer(this);
		gun67.setRotationPoint(-3.5F, -28.8F, -26.5F);
		vss.addChild(gun67);
		setRotationAngle(gun67, 1.3013F, 0.0F, 0.0F);
		gun67.cubeList.add(new ModelBox(gun67, 213, 22, -0.155F, -0.3267F, 1.0099F, 3, 10, 1, -0.2F, false));
		gun67.cubeList.add(new ModelBox(gun67, 213, 89, 1.995F, -0.3267F, 1.0099F, 2, 10, 1, -0.2F, false));

		gun66 = new ModelRenderer(this);
		gun66.setRotationPoint(-3.4F, -30.2F, -14.5F);
		vss.addChild(gun66);
		setRotationAngle(gun66, 2.3051F, 0.0F, 0.0F);
		gun66.cubeList.add(new ModelBox(gun66, 153, 224, -0.181F, -0.3691F, 1.7021F, 2, 2, 1, -0.201F, false));

		gun65 = new ModelRenderer(this);
		gun65.setRotationPoint(-3.4F, -31.2F, -16.5F);
		vss.addChild(gun65);
		

		gun64 = new ModelRenderer(this);
		gun64.setRotationPoint(-0.6F, -30.9F, -15.1F);
		vss.addChild(gun64);
		setRotationAngle(gun64, -2.4166F, 0.0F, 0.0F);
		gun64.cubeList.add(new ModelBox(gun64, 80, 225, -1.01F, 0.8485F, -0.6631F, 2, 1, 1, -0.2F, false));

		gun63 = new ModelRenderer(this);
		gun63.setRotationPoint(-3.4F, -31.9F, -15.5F);
		vss.addChild(gun63);
		setRotationAngle(gun63, -1.7299F, 0.0F, 0.0F);
		gun63.cubeList.add(new ModelBox(gun63, 211, 152, -0.21F, 0.1584F, -0.5874F, 3, 1, 5, -0.2F, false));

		gun62 = new ModelRenderer(this);
		gun62.setRotationPoint(-0.6F, -31.9F, -15.5F);
		vss.addChild(gun62);
		setRotationAngle(gun62, -1.7299F, 0.0F, 0.0F);
		gun62.cubeList.add(new ModelBox(gun62, 213, 8, -0.965F, 0.1584F, -0.5874F, 2, 1, 5, -0.2F, false));

		gun61 = new ModelRenderer(this);
		gun61.setRotationPoint(-3.3F, -30.0F, -7.0F);
		vss.addChild(gun61);
		gun61.cubeList.add(new ModelBox(gun61, 228, 138, -0.2F, -1.0F, 0.0F, 1, 1, 1, -0.2F, false));

		gun60 = new ModelRenderer(this);
		gun60.setRotationPoint(-0.7F, -30.0F, -7.0F);
		vss.addChild(gun60);
		gun60.cubeList.add(new ModelBox(gun60, 141, 228, 0.4F, -1.0F, 0.0F, 1, 1, 1, -0.2F, false));

		gun59 = new ModelRenderer(this);
		gun59.setRotationPoint(-3.4F, -31.8F, -26.5F);
		vss.addChild(gun59);
		gun59.cubeList.add(new ModelBox(gun59, 162, 104, -0.18F, -0.925F, 1.0F, 3, 3, 9, -0.2F, false));
		gun59.cubeList.add(new ModelBox(gun59, 86, 220, -0.18F, -1.0F, 9.5F, 3, 3, 1, -0.2F, false));

		gun58 = new ModelRenderer(this);
		gun58.setRotationPoint(-0.6F, -31.8F, -26.5F);
		vss.addChild(gun58);
		gun58.cubeList.add(new ModelBox(gun58, 187, 104, -0.98F, -2.925F, 1.0F, 2, 5, 9, -0.2F, false));
		gun58.cubeList.add(new ModelBox(gun58, 213, 15, -0.98F, -3.2F, 4.0F, 2, 1, 5, -0.2F, false));
		gun58.cubeList.add(new ModelBox(gun58, 87, 225, 0.02F, -1.5F, 9.6F, 1, 3, 1, -0.2F, false));

		gun52 = new ModelRenderer(this);
		gun52.setRotationPoint(-3.2F, -35.0F, -0.6F);
		vss.addChild(gun52);
		gun52.cubeList.add(new ModelBox(gun52, 213, 34, -0.2F, 0.0F, -2.2F, 3, 4, 3, -0.2F, false));

		gun51 = new ModelRenderer(this);
		gun51.setRotationPoint(-0.8F, -35.0F, -0.6F);
		vss.addChild(gun51);
		gun51.cubeList.add(new ModelBox(gun51, 0, 214, -1.0F, 0.0F, -2.2F, 2, 4, 3, -0.199F, false));

		gun50 = new ModelRenderer(this);
		gun50.setRotationPoint(-3.3F, -30.8F, -7.7F);
		vss.addChild(gun50);
		setRotationAngle(gun50, 0.0F, 0.0F, -0.3961F);
		gun50.cubeList.add(new ModelBox(gun50, 146, 228, 0.2742F, -1.3546F, -0.01F, 1, 1, 1, -0.2F, false));

		gun49 = new ModelRenderer(this);
		gun49.setRotationPoint(0.3F, -30.8F, -7.7F);
		vss.addChild(gun49);
		setRotationAngle(gun49, 0.0F, 0.0F, 1.9705F);
		gun49.cubeList.add(new ModelBox(gun49, 151, 228, -1.2748F, 0.4615F, -0.01F, 1, 1, 1, -0.2F, false));

		gun48 = new ModelRenderer(this);
		gun48.setRotationPoint(-0.6F, -31.8F, -16.5F);
		vss.addChild(gun48);
		gun48.cubeList.add(new ModelBox(gun48, 176, 202, -1.0F, -1.0F, 0.0F, 2, 1, 10, -0.2F, false));

		gun47 = new ModelRenderer(this);
		gun47.setRotationPoint(-3.4F, -31.8F, -16.5F);
		vss.addChild(gun47);
		gun47.cubeList.add(new ModelBox(gun47, 201, 202, -0.19F, -1.0F, 0.0F, 2, 1, 10, -0.2F, false));

		gun46 = new ModelRenderer(this);
		gun46.setRotationPoint(-2.5F, -30.0F, -7.7F);
		vss.addChild(gun46);
		gun46.cubeList.add(new ModelBox(gun46, 114, 225, 0.0F, -1.0F, 0.0F, 2, 1, 1, -0.2F, false));

		gun45 = new ModelRenderer(this);
		gun45.setRotationPoint(-3.1F, -31.0F, -7.7F);
		vss.addChild(gun45);
		gun45.cubeList.add(new ModelBox(gun45, 48, 203, -0.2F, -1.01F, -0.01F, 1, 5, 1, -0.2F, false));

		gun44 = new ModelRenderer(this);
		gun44.setRotationPoint(-0.9F, -31.0F, -7.7F);
		vss.addChild(gun44);
		gun44.cubeList.add(new ModelBox(gun44, 222, 223, 0.0F, -1.01F, -0.01F, 1, 5, 1, -0.2F, false));

		gun43 = new ModelRenderer(this);
		gun43.setRotationPoint(0.4F, -30.6F, -7.5F);
		vss.addChild(gun43);
		setRotationAngle(gun43, 0.0F, 0.0F, 2.2679F);
		gun43.cubeList.add(new ModelBox(gun43, 86, 211, -0.9981F, 0.716F, -0.01F, 1, 1, 7, -0.2F, false));

		gun42 = new ModelRenderer(this);
		gun42.setRotationPoint(-3.4F, -30.6F, -7.5F);
		vss.addChild(gun42);
		setRotationAngle(gun42, 0.0F, 0.0F, -0.6692F);
		gun42.cubeList.add(new ModelBox(gun42, 211, 123, 0.6143F, -1.2134F, -0.01F, 1, 1, 7, -0.2F, false));

		gun41 = new ModelRenderer(this);
		gun41.setRotationPoint(-3.4F, -31.6F, -7.5F);
		vss.addChild(gun41);
		gun41.cubeList.add(new ModelBox(gun41, 211, 132, -0.19F, -1.1F, -0.01F, 1, 1, 7, -0.2F, false));

		gun40 = new ModelRenderer(this);
		gun40.setRotationPoint(-3.3F, -30.2F, -3.0F);
		vss.addChild(gun40);
		setRotationAngle(gun40, -0.7436F, 0.0F, 0.0F);
		gun40.cubeList.add(new ModelBox(gun40, 228, 152, -0.2F, -0.6302F, -1.5306F, 1, 1, 1, -0.2F, false));

		gun39 = new ModelRenderer(this);
		gun39.setRotationPoint(-0.7F, -30.2F, -3.0F);
		vss.addChild(gun39);
		setRotationAngle(gun39, -0.7436F, 0.0F, 0.0F);
		gun39.cubeList.add(new ModelBox(gun39, 228, 155, 0.2F, -0.6302F, -1.5306F, 1, 1, 1, -0.2F, false));

		gun38 = new ModelRenderer(this);
		gun38.setRotationPoint(-2.5F, -25.7F, -14.8F);
		vss.addChild(gun38);
		setRotationAngle(gun38, -1.45F, 0.0F, 0.0F);
		gun38.cubeList.add(new ModelBox(gun38, 177, 225, -0.001F, -0.3301F, -1.6174F, 2, 1, 1, -0.299F, false));
		gun38.cubeList.add(new ModelBox(gun38, 184, 225, -0.001F, -0.3301F, -1.2174F, 2, 1, 1, -0.299F, false));

		gun37 = new ModelRenderer(this);
		gun37.setRotationPoint(-3.0F, -30.5F, -14.5F);
		vss.addChild(gun37);
		setRotationAngle(gun37, 2.3051F, 0.0F, 0.0F);
		gun37.cubeList.add(new ModelBox(gun37, 40, 221, 0.029F, 0.3959F, 0.631F, 3, 2, 1, -0.2F, false));

		gun36 = new ModelRenderer(this);
		gun36.setRotationPoint(-0.9F, -27.5F, -16.0F);
		vss.addChild(gun36);
		gun36.cubeList.add(new ModelBox(gun36, 156, 228, 0.1F, -1.0F, 0.0F, 1, 1, 1, -0.2F, false));

		gun35 = new ModelRenderer(this);
		gun35.setRotationPoint(-0.9F, -29.4F, -15.5F);
		vss.addChild(gun35);
		setRotationAngle(gun35, -0.7064F, 0.0F, 0.0F);
		

		gun34 = new ModelRenderer(this);
		gun34.setRotationPoint(-3.1F, -28.5F, -16.0F);
		vss.addChild(gun34);
		gun34.cubeList.add(new ModelBox(gun34, 161, 228, -0.1F, 0.0F, 0.0F, 1, 1, 1, -0.2F, false));

		gun33 = new ModelRenderer(this);
		gun33.setRotationPoint(-2.5F, -26.0F, -16.2F);
		vss.addChild(gun33);
		setRotationAngle(gun33, 0.5949F, 0.0F, 0.0F);
		gun33.cubeList.add(new ModelBox(gun33, 191, 225, 0.0F, -0.8257F, 0.921F, 2, 1, 1, -0.3F, false));
		gun33.cubeList.add(new ModelBox(gun33, 198, 225, 0.0F, -1.2257F, 0.921F, 2, 1, 1, -0.3F, false));

		gun32 = new ModelRenderer(this);
		gun32.setRotationPoint(-2.5F, -31.0F, -8.5F);
		vss.addChild(gun32);
		setRotationAngle(gun32, 0.9666F, 0.0F, 0.0F);
		gun32.cubeList.add(new ModelBox(gun32, 103, 219, -0.5F, -0.8681F, 0.823F, 3, 2, 2, -0.2F, false));

		gun31 = new ModelRenderer(this);
		gun31.setRotationPoint(-2.5F, -29.2F, -7.8F);
		vss.addChild(gun31);
		setRotationAngle(gun31, -0.2231F, 0.0F, 0.0F);
		gun31.cubeList.add(new ModelBox(gun31, 160, 224, 0.0F, -1.2752F, -0.1213F, 2, 2, 1, -0.2F, false));

		gun29 = new ModelRenderer(this);
		gun29.setRotationPoint(-3.2F, -31.5F, -3.6F);
		vss.addChild(gun29);
		

		gun28 = new ModelRenderer(this);
		gun28.setRotationPoint(-0.8F, -31.5F, -3.6F);
		vss.addChild(gun28);
		

		gun22 = new ModelRenderer(this);
		gun22.setRotationPoint(-3.0F, -31.5F, -5.3F);
		vss.addChild(gun22);
		

		gun21 = new ModelRenderer(this);
		gun21.setRotationPoint(-3.2F, -26.5F, -4.3F);
		vss.addChild(gun21);
		setRotationAngle(gun21, 2.8256F, 0.0F, 0.0F);
		

		gun20 = new ModelRenderer(this);
		gun20.setRotationPoint(-0.8F, -26.5F, -4.3F);
		vss.addChild(gun20);
		setRotationAngle(gun20, 2.8256F, 0.0F, 0.0F);
		

		gun17 = new ModelRenderer(this);
		gun17.setRotationPoint(-3.0F, -26.8F, -7.4F);
		vss.addChild(gun17);
		gun17.cubeList.add(new ModelBox(gun17, 208, 198, 0.0F, -1.0F, -0.1F, 3, 1, 2, -0.2F, false));

		gun16 = new ModelRenderer(this);
		gun16.setRotationPoint(-0.8F, -26.5F, -5.5F);
		vss.addChild(gun16);
		setRotationAngle(gun16, 2.8256F, 0.0F, 0.0F);
		

		gun15 = new ModelRenderer(this);
		gun15.setRotationPoint(-3.2F, -26.5F, -5.5F);
		vss.addChild(gun15);
		setRotationAngle(gun15, 2.8256F, 0.0F, 0.0F);
		gun15.cubeList.add(new ModelBox(gun15, 213, 49, -0.2F, 0.6505F, 0.3108F, 3, 6, 2, -0.2F, false));

		gun9 = new ModelRenderer(this);
		gun9.setRotationPoint(-0.5F, -35.0F, -26.5F);
		vss.addChild(gun9);
		

		gun8 = new ModelRenderer(this);
		gun8.setRotationPoint(-3.4F, -35.0F, -26.5F);
		vss.addChild(gun8);
		gun8.cubeList.add(new ModelBox(gun8, 158, 120, -0.2F, 1.0F, 1.0F, 1, 2, 25, -0.2F, false));
		gun8.cubeList.add(new ModelBox(gun8, 158, 148, -0.2F, 0.5F, 1.0F, 1, 2, 25, -0.2F, false));

		gun7 = new ModelRenderer(this);
		gun7.setRotationPoint(-3.0F, -32.0F, -16.5F);
		vss.addChild(gun7);
		gun7.cubeList.add(new ModelBox(gun7, 213, 58, 0.0F, -1.1F, 0.1F, 3, 6, 2, -0.2F, false));
		gun7.cubeList.add(new ModelBox(gun7, 211, 141, 0.4F, -1.1F, 10.5F, 3, 6, 4, -0.3F, false));
		gun7.cubeList.add(new ModelBox(gun7, 143, 185, -0.4F, -1.1F, 10.5F, 2, 6, 4, -0.3F, false));
		gun7.cubeList.add(new ModelBox(gun7, 220, 89, 0.0F, 1.9F, -0.5F, 3, 3, 1, -0.2F, false));

		gun6 = new ModelRenderer(this);
		gun6.setRotationPoint(-2.5F, -27.0F, -14.5F);
		vss.addChild(gun6);
		gun6.cubeList.add(new ModelBox(gun6, 0, 203, -0.5F, -0.99F, -0.3F, 3, 1, 9, -0.2F, false));

		gun5 = new ModelRenderer(this);
		gun5.setRotationPoint(-0.8F, -31.0F, -7.5F);
		vss.addChild(gun5);
		gun5.cubeList.add(new ModelBox(gun5, 136, 216, 0.01F, -1.0F, 0.0F, 1, 5, 2, -0.2F, false));

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(-3.9F, -33.0F, -8.5F);
		vss.addChild(bone23);
		setRotationAngle(bone23, 0.5061F, 0.0F, 0.0F);
		

		gun166 = new ModelRenderer(this);
		gun166.setRotationPoint(0.0F, -3.0F, -7.0F);
		bone23.addChild(gun166);
		setRotationAngle(gun166, -0.0873F, 0.0F, 0.0F);
		

		gun180 = new ModelRenderer(this);
		gun180.setRotationPoint(-0.1F, -1.85F, 0.0F);
		bone23.addChild(gun180);
		setRotationAngle(gun180, -1.7474F, 0.0F, 0.0F);
		

		gun170 = new ModelRenderer(this);
		gun170.setRotationPoint(0.0F, 2.2F, 0.4F);
		bone23.addChild(gun170);
		setRotationAngle(gun170, 2.6397F, 0.0F, 0.0F);
		

		gun172_r1 = new ModelRenderer(this);
		gun172_r1.setRotationPoint(0.42F, 1.3945F, 8.0665F);
		gun170.addChild(gun172_r1);
		setRotationAngle(gun172_r1, 0.1571F, 0.0F, 0.0F);
		

		gun173_r2 = new ModelRenderer(this);
		gun173_r2.setRotationPoint(0.42F, 1.3476F, 8.3628F);
		gun170.addChild(gun173_r2);
		setRotationAngle(gun173_r2, 0.1571F, 0.0F, 0.0F);
		

		gun171 = new ModelRenderer(this);
		gun171.setRotationPoint(0.0F, -2.0F, -7.0F);
		bone23.addChild(gun171);
		setRotationAngle(gun171, 0.9666F, 0.0F, 0.0F);
		

		gun168 = new ModelRenderer(this);
		gun168.setRotationPoint(0.0F, -0.3F, 1.9F);
		bone23.addChild(gun168);
		setRotationAngle(gun168, -1.8961F, 0.0F, 0.0F);
		

		gun167 = new ModelRenderer(this);
		gun167.setRotationPoint(0.0F, -2.45F, -0.1F);
		bone23.addChild(gun167);
		setRotationAngle(gun167, -0.8179F, 0.0F, 0.0F);
		

		gun179 = new ModelRenderer(this);
		gun179.setRotationPoint(-0.1F, -1.0F, 0.5F);
		bone23.addChild(gun179);
		setRotationAngle(gun179, -2.6025F, 0.0F, 0.0F);
		

		gun169 = new ModelRenderer(this);
		gun169.setRotationPoint(0.0F, 1.7F, 1.3F);
		bone23.addChild(gun169);
		setRotationAngle(gun169, -2.6397F, 0.0F, 0.0F);
		

		gun4 = new ModelRenderer(this);
		gun4.setRotationPoint(-3.2F, -31.0F, -7.5F);
		vss.addChild(gun4);
		gun4.cubeList.add(new ModelBox(gun4, 11, 214, -0.21F, -1.0F, 0.0F, 3, 5, 2, -0.2F, false));

		barrel3 = new ModelRenderer(this);
		barrel3.setRotationPoint(-1.1F, -21.5F, -81.8F);
		vss.addChild(barrel3);
		

		barrel4 = new ModelRenderer(this);
		barrel4.setRotationPoint(1.0F, 36.8F, 85.5F);
		barrel3.addChild(barrel4);
		

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(-1.5F, -37.8F, -85.5F);
		barrel4.addChild(bone21);
		

		cube_r46 = new ModelRenderer(this);
		cube_r46.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone21.addChild(cube_r46);
		setRotationAngle(cube_r46, 0.0F, 0.0F, 0.4363F);
		cube_r46.cubeList.add(new ModelBox(cube_r46, 81, 0, -6.0007F, -12.8698F, 7.5F, 2, 1, 38, -0.1F, false));

		cube_r47 = new ModelRenderer(this);
		cube_r47.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone21.addChild(cube_r47);
		setRotationAngle(cube_r47, 0.0F, 0.0F, -0.4363F);
		cube_r47.cubeList.add(new ModelBox(cube_r47, 81, 40, 4.0885F, -12.8289F, 7.498F, 2, 1, 38, -0.1F, false));

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(-1.5F, -32.4F, -85.5F);
		barrel4.addChild(bone22);
		

		cube_r48 = new ModelRenderer(this);
		cube_r48.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone22.addChild(cube_r48);
		setRotationAngle(cube_r48, 0.0F, 0.0F, -0.4363F);
		cube_r48.cubeList.add(new ModelBox(cube_r48, 0, 0, 6.1488F, -14.187F, 7.5F, 2, 1, 38, -0.1F, false));

		cube_r49 = new ModelRenderer(this);
		cube_r49.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone22.addChild(cube_r49);
		setRotationAngle(cube_r49, 0.0F, 0.0F, 0.4363F);
		cube_r49.cubeList.add(new ModelBox(cube_r49, 0, 40, -8.0611F, -14.228F, 7.498F, 2, 1, 38, -0.1F, false));

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(1.2F, -35.1F, -85.5F);
		barrel4.addChild(bone24);
		setRotationAngle(bone24, 0.0F, 0.0F, 1.5708F);
		

		cube_r50 = new ModelRenderer(this);
		cube_r50.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone24.addChild(cube_r50);
		setRotationAngle(cube_r50, 0.0F, 0.0F, 0.4363F);
		cube_r50.cubeList.add(new ModelBox(cube_r50, 79, 120, -13.0187F, 6.21F, 7.5F, 2, 1, 37, -0.1F, false));

		cube_r51 = new ModelRenderer(this);
		cube_r51.setRotationPoint(0.0F, 70.2F, 0.0F);
		bone24.addChild(cube_r51);
		setRotationAngle(cube_r51, 0.0F, 0.0F, 0.4363F);
		cube_r51.cubeList.add(new ModelBox(cube_r51, 222, 219, -42.6152F, -57.2947F, 44.2F, 2, 1, 2, -0.1F, false));

		cube_r52 = new ModelRenderer(this);
		cube_r52.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone24.addChild(cube_r52);
		setRotationAngle(cube_r52, 0.0F, 0.0F, -0.4363F);
		cube_r52.cubeList.add(new ModelBox(cube_r52, 0, 222, -15.0848F, -5.8098F, 44.2F, 2, 1, 2, -0.1F, false));
		cube_r52.cubeList.add(new ModelBox(cube_r52, 0, 120, -15.0381F, -5.9394F, 7.5F, 2, 1, 37, -0.1F, false));

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(-4.2F, -35.1F, -85.5F);
		barrel4.addChild(bone25);
		setRotationAngle(bone25, 0.0F, 0.0F, -1.5708F);
		

		cube_r53 = new ModelRenderer(this);
		cube_r53.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone25.addChild(cube_r53);
		setRotationAngle(cube_r53, 0.0F, 0.0F, -0.4363F);
		cube_r53.cubeList.add(new ModelBox(cube_r53, 81, 80, 10.9778F, 6.2977F, 7.498F, 2, 1, 38, -0.1F, false));

		cube_r54 = new ModelRenderer(this);
		cube_r54.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone25.addChild(cube_r54);
		setRotationAngle(cube_r54, 0.0F, 0.0F, 0.4363F);
		cube_r54.cubeList.add(new ModelBox(cube_r54, 0, 80, 13.079F, -5.8518F, 7.502F, 2, 1, 38, -0.1F, false));

		barrelouter5 = new ModelRenderer(this);
		barrelouter5.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrel3.addChild(barrelouter5);
		

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(-0.5F, 4.4F, 0.0F);
		barrelouter5.addChild(bone26);
		

		cube_r55 = new ModelRenderer(this);
		cube_r55.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone26.addChild(cube_r55);
		setRotationAngle(cube_r55, 0.0F, 0.0F, -0.4363F);
		cube_r55.cubeList.add(new ModelBox(cube_r55, 220, 94, 6.1559F, -15.144F, 6.099F, 2, 2, 2, -0.05F, false));

		cube_r56 = new ModelRenderer(this);
		cube_r56.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone26.addChild(cube_r56);
		setRotationAngle(cube_r56, 0.0F, 0.0F, 0.4363F);
		cube_r56.cubeList.add(new ModelBox(cube_r56, 152, 219, -8.0683F, -15.1863F, 6.1F, 2, 2, 2, -0.049F, false));

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter5.addChild(bone27);
		setRotationAngle(bone27, 0.0F, 0.0F, 1.5708F);
		

		cube_r57 = new ModelRenderer(this);
		cube_r57.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone27.addChild(cube_r57);
		setRotationAngle(cube_r57, 0.0F, 0.0F, 0.4363F);
		cube_r57.cubeList.add(new ModelBox(cube_r57, 22, 221, -13.0546F, 6.154F, 6.101F, 2, 2, 2, -0.048F, false));

		cube_r58 = new ModelRenderer(this);
		cube_r58.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone27.addChild(cube_r58);
		setRotationAngle(cube_r58, 0.0F, 0.0F, -0.4363F);
		cube_r58.cubeList.add(new ModelBox(cube_r58, 195, 220, -15.0619F, -6.0262F, 6.099F, 2, 2, 2, -0.05F, false));

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter5.addChild(bone28);
		setRotationAngle(bone28, 0.0F, 0.0F, -1.5708F);
		

		cube_r59 = new ModelRenderer(this);
		cube_r59.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone28.addChild(cube_r59);
		setRotationAngle(cube_r59, 0.0F, 0.0F, -0.4363F);
		cube_r59.cubeList.add(new ModelBox(cube_r59, 220, 214, 11.0129F, 6.2393F, 6.099F, 2, 2, 2, -0.05F, false));

		cube_r60 = new ModelRenderer(this);
		cube_r60.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone28.addChild(cube_r60);
		setRotationAngle(cube_r60, 0.0F, 0.0F, 0.4363F);
		cube_r60.cubeList.add(new ModelBox(cube_r60, 143, 219, 13.1026F, -5.9346F, 6.101F, 2, 2, 2, -0.048F, false));

		bone29 = new ModelRenderer(this);
		bone29.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter5.addChild(bone29);
		

		cube_r61 = new ModelRenderer(this);
		cube_r61.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone29.addChild(cube_r61);
		setRotationAngle(cube_r61, 0.0F, 0.0F, 0.4363F);
		cube_r61.cubeList.add(new ModelBox(cube_r61, 204, 220, -6.0203F, -12.971F, 6.1F, 2, 2, 2, -0.049F, false));

		cube_r62 = new ModelRenderer(this);
		cube_r62.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone29.addChild(cube_r62);
		setRotationAngle(cube_r62, 0.0F, 0.0F, -0.4363F);
		cube_r62.cubeList.add(new ModelBox(cube_r62, 213, 220, 4.1097F, -12.9308F, 6.099F, 2, 2, 2, -0.05F, false));

		barrelouter6 = new ModelRenderer(this);
		barrelouter6.setRotationPoint(0.0F, 0.0F, 26.0F);
		barrel3.addChild(barrelouter6);
		

		bone30 = new ModelRenderer(this);
		bone30.setRotationPoint(-0.5F, 4.4F, 0.0F);
		barrelouter6.addChild(bone30);
		

		cube_r63 = new ModelRenderer(this);
		cube_r63.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone30.addChild(cube_r63);
		setRotationAngle(cube_r63, 0.0F, 0.0F, -0.4363F);
		cube_r63.cubeList.add(new ModelBox(cube_r63, 49, 221, 6.1014F, -14.0262F, 7.5F, 2, 1, 2, 0.0F, false));

		cube_r64 = new ModelRenderer(this);
		cube_r64.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone30.addChild(cube_r64);
		setRotationAngle(cube_r64, 0.0F, 0.0F, 0.4363F);
		cube_r64.cubeList.add(new ModelBox(cube_r64, 76, 221, -8.056F, -14.0474F, 7.498F, 2, 1, 2, 0.0F, false));

		bone31 = new ModelRenderer(this);
		bone31.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter6.addChild(bone31);
		setRotationAngle(bone31, 0.0F, 0.0F, 1.5708F);
		

		cube_r65 = new ModelRenderer(this);
		cube_r65.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone31.addChild(cube_r65);
		setRotationAngle(cube_r65, 0.0F, 0.0F, 0.4363F);
		cube_r65.cubeList.add(new ModelBox(cube_r65, 123, 222, -12.9913F, 6.0764F, 7.5F, 2, 1, 2, 0.0F, false));

		cube_r66 = new ModelRenderer(this);
		cube_r66.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone31.addChild(cube_r66);
		setRotationAngle(cube_r66, 0.0F, 0.0F, -0.4363F);
		cube_r66.cubeList.add(new ModelBox(cube_r66, 9, 222, -15.0059F, -6.0452F, 7.5F, 2, 1, 2, 0.0F, false));

		bone32 = new ModelRenderer(this);
		bone32.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter6.addChild(bone32);
		setRotationAngle(bone32, 0.0F, 0.0F, -1.5708F);
		

		cube_r67 = new ModelRenderer(this);
		cube_r67.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone32.addChild(cube_r67);
		setRotationAngle(cube_r67, 0.0F, 0.0F, -0.4363F);
		cube_r67.cubeList.add(new ModelBox(cube_r67, 222, 30, 10.9702F, 6.1218F, 7.498F, 2, 1, 2, 0.0F, false));

		cube_r68 = new ModelRenderer(this);
		cube_r68.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone32.addChild(cube_r68);
		setRotationAngle(cube_r68, 0.0F, 0.0F, 0.4363F);
		cube_r68.cubeList.add(new ModelBox(cube_r68, 219, 198, 13.027F, -5.9999F, 7.502F, 2, 1, 2, 0.0F, false));

		bone33 = new ModelRenderer(this);
		bone33.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter6.addChild(bone33);
		

		cube_r69 = new ModelRenderer(this);
		cube_r69.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone33.addChild(cube_r69);
		setRotationAngle(cube_r69, 0.0F, 0.0F, 0.4363F);
		cube_r69.cubeList.add(new ModelBox(cube_r69, 222, 22, -6.0203F, -12.971F, 7.5F, 2, 1, 2, 0.0F, false));

		cube_r70 = new ModelRenderer(this);
		cube_r70.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone33.addChild(cube_r70);
		setRotationAngle(cube_r70, 0.0F, 0.0F, -0.4363F);
		cube_r70.cubeList.add(new ModelBox(cube_r70, 222, 26, 4.0657F, -12.9499F, 7.498F, 2, 1, 2, 0.0F, false));

		barrelouter7 = new ModelRenderer(this);
		barrelouter7.setRotationPoint(0.0F, 0.0F, 42.9F);
		barrel3.addChild(barrelouter7);
		

		bone36 = new ModelRenderer(this);
		bone36.setRotationPoint(-0.5F, 4.4F, 0.0F);
		barrelouter7.addChild(bone36);
		

		cube_r71 = new ModelRenderer(this);
		cube_r71.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone36.addChild(cube_r71);
		setRotationAngle(cube_r71, 0.0F, 0.0F, -0.4363F);
		cube_r71.cubeList.add(new ModelBox(cube_r71, 205, 225, 6.1014F, -14.0262F, 0.5F, 2, 1, 1, 0.0F, false));

		cube_r72 = new ModelRenderer(this);
		cube_r72.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone36.addChild(cube_r72);
		setRotationAngle(cube_r72, 0.0F, 0.0F, 0.4363F);
		cube_r72.cubeList.add(new ModelBox(cube_r72, 14, 226, -8.056F, -14.0474F, 0.498F, 2, 1, 1, 0.0F, false));

		bone37 = new ModelRenderer(this);
		bone37.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter7.addChild(bone37);
		setRotationAngle(bone37, 0.0F, 0.0F, 1.5708F);
		bone37.cubeList.add(new ModelBox(bone37, 31, 225, -14.8187F, 0.2655F, 1.3F, 1, 1, 2, -0.1F, false));

		cube_r73 = new ModelRenderer(this);
		cube_r73.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone37.addChild(cube_r73);
		setRotationAngle(cube_r73, 0.0F, 0.0F, 0.4363F);
		cube_r73.cubeList.add(new ModelBox(cube_r73, 226, 74, -12.9913F, 6.0764F, 0.5F, 2, 1, 1, 0.0F, false));

		cube_r74 = new ModelRenderer(this);
		cube_r74.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone37.addChild(cube_r74);
		setRotationAngle(cube_r74, 0.0F, 0.0F, -0.4363F);
		cube_r74.cubeList.add(new ModelBox(cube_r74, 226, 46, -15.0059F, -6.0452F, 0.5F, 2, 1, 1, 0.0F, false));

		bone38 = new ModelRenderer(this);
		bone38.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter7.addChild(bone38);
		setRotationAngle(bone38, 0.0F, 0.0F, -1.5708F);
		

		cube_r75 = new ModelRenderer(this);
		cube_r75.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone38.addChild(cube_r75);
		setRotationAngle(cube_r75, 0.0F, 0.0F, -0.4363F);
		cube_r75.cubeList.add(new ModelBox(cube_r75, 226, 71, 10.9702F, 6.1218F, 0.498F, 2, 1, 1, 0.0F, false));

		cube_r76 = new ModelRenderer(this);
		cube_r76.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone38.addChild(cube_r76);
		setRotationAngle(cube_r76, 0.0F, 0.0F, 0.4363F);
		cube_r76.cubeList.add(new ModelBox(cube_r76, 180, 117, 13.027F, -5.9999F, 0.502F, 2, 1, 1, 0.0F, false));

		bone39 = new ModelRenderer(this);
		bone39.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter7.addChild(bone39);
		

		cube_r77 = new ModelRenderer(this);
		cube_r77.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone39.addChild(cube_r77);
		setRotationAngle(cube_r77, 0.0F, 0.0F, 0.4363F);
		cube_r77.cubeList.add(new ModelBox(cube_r77, 226, 65, -6.0203F, -12.971F, 0.5F, 2, 1, 1, 0.0F, false));

		cube_r78 = new ModelRenderer(this);
		cube_r78.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone39.addChild(cube_r78);
		setRotationAngle(cube_r78, 0.0F, 0.0F, -0.4363F);
		cube_r78.cubeList.add(new ModelBox(cube_r78, 226, 68, 4.0657F, -12.9499F, 0.498F, 2, 1, 1, 0.0F, false));

		barrelouter8 = new ModelRenderer(this);
		barrelouter8.setRotationPoint(0.0F, 0.0F, 4.0F);
		barrel3.addChild(barrelouter8);
		

		bone40 = new ModelRenderer(this);
		bone40.setRotationPoint(-0.5F, 4.4F, 0.0F);
		barrelouter8.addChild(bone40);
		

		cube_r79 = new ModelRenderer(this);
		cube_r79.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone40.addChild(cube_r79);
		setRotationAngle(cube_r79, 0.0F, 0.0F, -0.4363F);
		

		cube_r80 = new ModelRenderer(this);
		cube_r80.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone40.addChild(cube_r80);
		setRotationAngle(cube_r80, 0.0F, 0.0F, 0.4363F);
		

		bone41 = new ModelRenderer(this);
		bone41.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter8.addChild(bone41);
		setRotationAngle(bone41, 0.0F, 0.0F, 1.5708F);
		

		cube_r81 = new ModelRenderer(this);
		cube_r81.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone41.addChild(cube_r81);
		setRotationAngle(cube_r81, 0.0F, 0.0F, 0.4363F);
		

		cube_r82 = new ModelRenderer(this);
		cube_r82.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone41.addChild(cube_r82);
		setRotationAngle(cube_r82, 0.0F, 0.0F, -0.4363F);
		

		bone42 = new ModelRenderer(this);
		bone42.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter8.addChild(bone42);
		setRotationAngle(bone42, 0.0F, 0.0F, -1.5708F);
		

		cube_r83 = new ModelRenderer(this);
		cube_r83.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone42.addChild(cube_r83);
		setRotationAngle(cube_r83, 0.0F, 0.0F, -0.4363F);
		

		cube_r84 = new ModelRenderer(this);
		cube_r84.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone42.addChild(cube_r84);
		setRotationAngle(cube_r84, 0.0F, 0.0F, 0.4363F);
		

		bone43 = new ModelRenderer(this);
		bone43.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter8.addChild(bone43);
		

		cube_r85 = new ModelRenderer(this);
		cube_r85.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone43.addChild(cube_r85);
		setRotationAngle(cube_r85, 0.0F, 0.0F, 0.4363F);
		

		cube_r86 = new ModelRenderer(this);
		cube_r86.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone43.addChild(cube_r86);
		setRotationAngle(cube_r86, 0.0F, 0.0F, -0.4363F);
		

		ironsights2 = new ModelRenderer(this);
		ironsights2.setRotationPoint(-22.1F, -11.7F, -2.2F);
		barrel3.addChild(ironsights2);
		ironsights2.cubeList.add(new ModelBox(ironsights2, 95, 220, 22.0F, -5.8F, 8.5F, 1, 4, 2, -0.3F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 104, 207, 21.0F, -4.6F, 37.5F, 2, 3, 8, -0.3F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 208, 176, 20.2F, -4.6F, 37.5F, 2, 3, 8, -0.299F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 213, 67, 20.2F, -4.8F, 40.5F, 1, 1, 5, -0.301F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 213, 74, 22.0F, -4.8F, 40.5F, 1, 1, 5, -0.301F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 224, 49, 20.2F, -5.66F, 38.42F, 1, 2, 2, -0.301F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 211, 114, 20.6F, -5.46F, 38.82F, 2, 1, 7, -0.301F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 171, 117, 20.1F, -5.26F, 45.12F, 3, 1, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 224, 54, 20.1F, -5.46F, 45.12F, 3, 1, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 224, 57, 20.1F, -5.66F, 45.12F, 3, 1, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 177, 228, 22.1F, -5.86F, 45.12F, 1, 1, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 182, 228, 21.9F, -5.86F, 45.12F, 1, 1, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 187, 228, 21.7F, -5.86F, 45.12F, 1, 1, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 192, 228, 21.5F, -5.86F, 45.12F, 1, 1, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 197, 228, 21.4F, -5.86F, 45.12F, 1, 1, 1, -0.401F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 228, 197, 21.4F, -5.96F, 45.12F, 1, 1, 1, -0.402F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 202, 228, 21.5F, -5.96F, 45.12F, 1, 1, 1, -0.401F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 207, 228, 21.7F, -5.96F, 45.12F, 1, 1, 1, -0.401F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 0, 229, 21.9F, -5.96F, 45.12F, 1, 1, 1, -0.401F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 5, 229, 22.1F, -5.96F, 45.12F, 1, 1, 1, -0.401F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 10, 229, 20.8F, -5.96F, 45.12F, 1, 1, 1, -0.402F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 15, 229, 20.7F, -5.96F, 45.12F, 1, 1, 1, -0.401F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 20, 229, 20.5F, -5.96F, 45.12F, 1, 1, 1, -0.401F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 25, 229, 20.3F, -5.96F, 45.12F, 1, 1, 1, -0.401F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 30, 229, 20.1F, -5.96F, 45.12F, 1, 1, 1, -0.401F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 35, 229, 20.8F, -5.86F, 45.12F, 1, 1, 1, -0.401F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 40, 229, 20.7F, -5.86F, 45.12F, 1, 1, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 45, 229, 20.3F, -5.86F, 45.12F, 1, 1, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 50, 229, 20.1F, -5.86F, 45.12F, 1, 1, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 55, 229, 20.5F, -5.86F, 45.12F, 1, 1, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 224, 60, 22.0F, -5.66F, 38.42F, 1, 2, 2, -0.301F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 170, 220, 20.2F, -5.8F, 8.5F, 1, 4, 2, -0.3F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 126, 226, 21.1F, -5.9F, 8.5F, 1, 2, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 212, 225, 22.0F, -5.0F, 8.1F, 1, 3, 1, -0.3F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 217, 225, 20.2F, -5.0F, 8.1F, 1, 3, 1, -0.3F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 58, 221, 20.6F, -4.8F, 8.4F, 2, 1, 2, -0.201F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 67, 221, 20.6F, -3.8F, 8.4F, 2, 1, 2, -0.201F, false));

		cube_r87 = new ModelRenderer(this);
		cube_r87.setRotationPoint(-0.4F, -1.66F, 35.22F);
		ironsights2.addChild(cube_r87);
		setRotationAngle(cube_r87, -0.5236F, 0.0F, 0.0F);
		cube_r87.cubeList.add(new ModelBox(cube_r87, 44, 197, 22.4F, -5.9543F, 2.0935F, 1, 2, 3, -0.302F, false));
		cube_r87.cubeList.add(new ModelBox(cube_r87, 114, 219, 20.6F, -5.9543F, 2.0935F, 1, 2, 3, -0.302F, false));

		cube_r88 = new ModelRenderer(this);
		cube_r88.setRotationPoint(-2.7F, -1.36F, 40.72F);
		ironsights2.addChild(cube_r88);
		setRotationAngle(cube_r88, 0.3665F, 0.0F, 0.0F);
		cube_r88.cubeList.add(new ModelBox(cube_r88, 60, 229, 22.7F, -2.3567F, 4.6669F, 1, 1, 1, -0.15F, false));
		cube_r88.cubeList.add(new ModelBox(cube_r88, 65, 229, 23.0F, -2.3567F, 4.6669F, 1, 1, 1, -0.151F, false));
		cube_r88.cubeList.add(new ModelBox(cube_r88, 229, 89, 24.6F, -2.3567F, 4.6669F, 1, 1, 1, -0.151F, false));
		cube_r88.cubeList.add(new ModelBox(cube_r88, 229, 92, 24.9F, -2.3567F, 4.6669F, 1, 1, 1, -0.15F, false));

		cube_r89 = new ModelRenderer(this);
		cube_r89.setRotationPoint(-0.4F, -1.16F, 33.92F);
		ironsights2.addChild(cube_r89);
		setRotationAngle(cube_r89, 0.3665F, 0.0F, 0.0F);
		cube_r89.cubeList.add(new ModelBox(cube_r89, 224, 81, 20.5F, -1.9984F, 5.6005F, 3, 1, 1, -0.1F, false));

		cube_r90 = new ModelRenderer(this);
		cube_r90.setRotationPoint(-0.8F, -0.6F, 32.9F);
		ironsights2.addChild(cube_r90);
		setRotationAngle(cube_r90, -0.7156F, 0.0F, 0.0F);
		cube_r90.cubeList.add(new ModelBox(cube_r90, 0, 226, 21.4F, -6.7071F, 0.9706F, 2, 1, 1, -0.302F, false));
		cube_r90.cubeList.add(new ModelBox(cube_r90, 224, 84, 22.8F, -7.7071F, 0.9706F, 1, 2, 2, -0.302F, false));
		cube_r90.cubeList.add(new ModelBox(cube_r90, 102, 224, 21.0F, -7.7071F, 0.9706F, 1, 2, 2, -0.302F, false));

		fireSelector2 = new ModelRenderer(this);
		fireSelector2.setRotationPoint(-0.1F, 0.3F, 0.0F);
		vss.addChild(fireSelector2);
		fireSelector2.cubeList.add(new ModelBox(fireSelector2, 229, 95, -3.7F, -33.8F, -8.0F, 1, 1, 1, 0.0F, false));
		fireSelector2.cubeList.add(new ModelBox(fireSelector2, 209, 214, -3.3F, -33.8292F, -11.1084F, 1, 1, 4, 0.1F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.7F, -32.3529F, -9.7388F);
		fireSelector2.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.2618F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 186, 220, -1.0F, -2.0F, -3.0F, 1, 1, 3, -0.1F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-3.15F, -32.4402F, -13.9569F);
		fireSelector2.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.2618F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 31, 221, -1.15F, -0.1575F, -2.1964F, 2, 1, 2, -0.4F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 59, 225, -0.85F, -1.1575F, -2.1964F, 1, 1, 2, -0.4F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 211, 167, -0.15F, -0.6575F, -1.6964F, 1, 1, 6, 0.1F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-2.3F, -31.825F, -7.1F);
		fireSelector2.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.1309F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 177, 220, -1.0F, -2.0F, -3.0F, 1, 1, 3, 0.1F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-2.7F, -31.9F, -7.7F);
		fireSelector2.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.1309F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 220, 99, -1.0F, -2.0F, -3.0F, 1, 1, 3, -0.1F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		vss.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}