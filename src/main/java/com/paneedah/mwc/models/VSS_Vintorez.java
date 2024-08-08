package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.10.3
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
	private final ModelRenderer gun172_r1;
	private final ModelRenderer gun173_r1;
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

	public VSS_Vintorez() {
		textureWidth = 512;
		textureHeight = 512;

		vss = new ModelRenderer(this);
		vss.setRotationPoint(0.1F, 23.7F, 0.0F);
		

		TRIGGER = new ModelRenderer(this);
		TRIGGER.setRotationPoint(-2.0F, -31.2F, -10.5F);
		vss.addChild(TRIGGER);
		setRotationAngle(TRIGGER, 0.4461F, 0.0F, 0.0F);
		TRIGGER.cubeList.add(new ModelBox(TRIGGER, 11, 40, -0.1F, -1.3453F, 0.8412F, 1, 2, 1, -0.2F, false));

		gun13TRIGGER = new ModelRenderer(this);
		gun13TRIGGER.setRotationPoint(-2.0F, -28.0F, -9.7F);
		vss.addChild(gun13TRIGGER);
		setRotationAngle(gun13TRIGGER, -2.6397F, 0.0F, 0.0F);
		gun13TRIGGER.cubeList.add(new ModelBox(gun13TRIGGER, 185, 137, -0.1F, 1.0629F, -0.9219F, 1, 1, 1, -0.199F, false));

		gun12TRIGGER = new ModelRenderer(this);
		gun12TRIGGER.setRotationPoint(-2.0F, -28.7F, -9.1F);
		vss.addChild(gun12TRIGGER);
		setRotationAngle(gun12TRIGGER, -2.3051F, 0.0F, 0.0F);
		gun12TRIGGER.cubeList.add(new ModelBox(gun12TRIGGER, 134, 185, -0.101F, 0.7308F, -0.9755F, 1, 1, 1, -0.2F, false));

		gun11TRIGGER = new ModelRenderer(this);
		gun11TRIGGER.setRotationPoint(-2.0F, -31.8F, -9.0F);
		vss.addChild(gun11TRIGGER);
		setRotationAngle(gun11TRIGGER, -0.3718F, 0.0F, 0.0F);
		gun11TRIGGER.cubeList.add(new ModelBox(gun11TRIGGER, 64, 9, -0.1F, -0.9317F, -0.3633F, 1, 3, 1, -0.199F, false));

		gun137 = new ModelRenderer(this);
		gun137.setRotationPoint(-1.7F, -38.3F, 0.85F);
		vss.addChild(gun137);
		setRotationAngle(gun137, -1.0038F, 0.0F, 0.0F);
		gun137.cubeList.add(new ModelBox(gun137, 197, 29, -0.1F, 1.6182F, -0.4376F, 1, 1, 1, -0.2F, false));

		gun136 = new ModelRenderer(this);
		gun136.setRotationPoint(-1.7F, -38.7F, -0.1F);
		vss.addChild(gun136);
		setRotationAngle(gun136, -0.409F, 0.0F, 0.0F);
		gun136.cubeList.add(new ModelBox(gun136, 140, 131, -0.1F, 1.162F, -0.9849F, 1, 1, 1, -0.2F, false));

		gun135 = new ModelRenderer(this);
		gun135.setRotationPoint(-2.3F, -38.3F, 0.85F);
		vss.addChild(gun135);
		setRotationAngle(gun135, -1.0038F, 0.0F, 0.0F);
		gun135.cubeList.add(new ModelBox(gun135, 196, 60, -0.1F, 1.6182F, -0.4376F, 1, 1, 1, -0.2F, false));

		gun134 = new ModelRenderer(this);
		gun134.setRotationPoint(-2.3F, -38.7F, -0.1F);
		vss.addChild(gun134);
		setRotationAngle(gun134, -0.409F, 0.0F, 0.0F);
		gun134.cubeList.add(new ModelBox(gun134, 26, 91, -0.1F, 1.162F, -0.9849F, 1, 1, 1, -0.2F, false));

		gun133 = new ModelRenderer(this);
		gun133.setRotationPoint(-2.0F, -38.35F, 1.12F);
		vss.addChild(gun133);
		setRotationAngle(gun133, -1.1897F, 0.0F, 0.0F);
		gun133.cubeList.add(new ModelBox(gun133, 0, 200, -0.1F, 1.6712F, -0.131F, 1, 1, 1, -0.2F, false));

		gun132 = new ModelRenderer(this);
		gun132.setRotationPoint(-2.0F, -38.9F, 0.3F);
		vss.addChild(gun132);
		setRotationAngle(gun132, -0.5949F, 0.0F, 0.0F);
		gun132.cubeList.add(new ModelBox(gun132, 200, 18, -0.1F, 1.3845F, -0.804F, 1, 1, 1, -0.2F, false));

		gun131 = new ModelRenderer(this);
		gun131.setRotationPoint(-2.0F, -38.4F, -0.6F);
		vss.addChild(gun131);
		setRotationAngle(gun131, 0.5205F, 0.0F, 0.0F);
		gun131.cubeList.add(new ModelBox(gun131, 192, 2, -0.1F, -0.0317F, -1.4592F, 1, 1, 1, -0.2F, false));

		gun122 = new ModelRenderer(this);
		gun122.setRotationPoint(-3.75F, -35.2F, -26.5F);
		vss.addChild(gun122);
		gun122.cubeList.add(new ModelBox(gun122, 129, 22, 0.1F, -0.2F, 17.99F, 1, 1, 8, -0.2F, false));

		gun115 = new ModelRenderer(this);
		gun115.setRotationPoint(0.9F, -33.8F, 0.5F);
		vss.addChild(gun115);
		setRotationAngle(gun115, 0.0F, 0.0F, 2.491F);
		gun115.cubeList.add(new ModelBox(gun115, 184, 69, -0.162F, 0.0803F, -1.98F, 1, 1, 1, -0.2F, false));

		gun114 = new ModelRenderer(this);
		gun114.setRotationPoint(0.9F, -33.8F, -3.0F);
		vss.addChild(gun114);
		setRotationAngle(gun114, 0.0F, 0.0F, 2.491F);
		gun114.cubeList.add(new ModelBox(gun114, 177, 197, -0.162F, 0.0803F, -1.99F, 1, 1, 1, -0.2F, false));

		gun113 = new ModelRenderer(this);
		gun113.setRotationPoint(-0.1F, -34.8F, 0.5F);
		vss.addChild(gun113);
		gun113.cubeList.add(new ModelBox(gun113, 67, 184, 0.0F, 0.0F, -1.98F, 1, 1, 1, -0.2F, false));

		gun112 = new ModelRenderer(this);
		gun112.setRotationPoint(-0.1F, -34.8F, -3.0F);
		vss.addChild(gun112);
		gun112.cubeList.add(new ModelBox(gun112, 172, 197, 0.0F, 0.0F, -1.99F, 1, 1, 1, -0.2F, false));

		gun111 = new ModelRenderer(this);
		gun111.setRotationPoint(-0.1F, -35.0F, -3.0F);
		vss.addChild(gun111);
		gun111.cubeList.add(new ModelBox(gun111, 197, 191, -0.02F, 0.0F, -2.01F, 1, 1, 1, -0.2F, false));

		gun110 = new ModelRenderer(this);
		gun110.setRotationPoint(-0.1F, -35.0F, -2.5F);
		vss.addChild(gun110);
		gun110.cubeList.add(new ModelBox(gun110, 0, 160, -0.01F, 0.0F, -2.0F, 1, 1, 4, -0.2F, false));

		gun109 = new ModelRenderer(this);
		gun109.setRotationPoint(0.9F, -33.8F, -12.5F);
		vss.addChild(gun109);
		setRotationAngle(gun109, 0.0F, 0.0F, 2.491F);
		gun109.cubeList.add(new ModelBox(gun109, 129, 185, -0.154F, 0.0863F, -1.01F, 1, 1, 1, -0.2F, false));

		gun108 = new ModelRenderer(this);
		gun108.setRotationPoint(0.9F, -33.8F, -9.5F);
		vss.addChild(gun108);
		setRotationAngle(gun108, 0.0F, 0.0F, 2.491F);
		gun108.cubeList.add(new ModelBox(gun108, 185, 112, -0.154F, 0.0863F, -0.99F, 1, 1, 1, -0.2F, false));

		gun107 = new ModelRenderer(this);
		gun107.setRotationPoint(-0.1F, -34.8F, -9.5F);
		vss.addChild(gun107);
		gun107.cubeList.add(new ModelBox(gun107, 187, 191, -0.01F, 0.0F, -0.99F, 1, 1, 1, -0.2F, false));

		gun106 = new ModelRenderer(this);
		gun106.setRotationPoint(-0.1F, -34.8F, -12.5F);
		vss.addChild(gun106);
		gun106.cubeList.add(new ModelBox(gun106, 182, 191, -0.01F, 0.0F, -1.01F, 1, 1, 1, -0.2F, false));

		gun105 = new ModelRenderer(this);
		gun105.setRotationPoint(-0.1F, -35.0F, -12.5F);
		vss.addChild(gun105);
		gun105.cubeList.add(new ModelBox(gun105, 156, 0, 0.0F, 0.0F, -1.0F, 1, 1, 4, -0.2F, false));

		gun104 = new ModelRenderer(this);
		gun104.setRotationPoint(0.9F, -33.7F, -4.5F);
		vss.addChild(gun104);
		setRotationAngle(gun104, 0.0F, 0.0F, 2.3423F);
		gun104.cubeList.add(new ModelBox(gun104, 177, 191, 0.4651F, -0.5201F, -1.9624F, 1, 1, 1, -0.2F, false));

		gun103 = new ModelRenderer(this);
		gun103.setRotationPoint(0.9F, -33.7F, -7.5F);
		vss.addChild(gun103);
		setRotationAngle(gun103, 0.0F, 0.0F, 2.3423F);
		gun103.cubeList.add(new ModelBox(gun103, 144, 194, 0.4662F, -0.519F, -1.2397F, 1, 1, 1, -0.2F, false));

		gun102 = new ModelRenderer(this);
		gun102.setRotationPoint(-0.1F, -33.7F, -4.5F);
		vss.addChild(gun102);
		gun102.cubeList.add(new ModelBox(gun102, 172, 191, -0.0343F, 0.5F, -1.9624F, 1, 1, 1, -0.2F, false));

		gun101 = new ModelRenderer(this);
		gun101.setRotationPoint(-0.1F, -33.7F, -7.5F);
		vss.addChild(gun101);
		gun101.cubeList.add(new ModelBox(gun101, 194, 139, -0.0359F, 0.5F, -1.2397F, 1, 1, 1, -0.2F, false));

		gun100 = new ModelRenderer(this);
		gun100.setRotationPoint(0.9F, -33.5F, -4.5F);
		vss.addChild(gun100);
		setRotationAngle(gun100, 0.0F, -3.0115F, 0.0F);
		gun100.cubeList.add(new ModelBox(gun100, 20, 184, -0.2076F, 0.5F, 1.5865F, 1, 1, 1, -0.2F, false));

		gun99 = new ModelRenderer(this);
		gun99.setRotationPoint(0.9F, -33.5F, -6.5F);
		vss.addChild(gun99);
		setRotationAngle(gun99, 0.0F, -1.7102F, 0.0F);
		gun99.cubeList.add(new ModelBox(gun99, 0, 193, -1.5845F, 0.5F, 0.2223F, 1, 1, 1, -0.2F, false));

		gun98 = new ModelRenderer(this);
		gun98.setRotationPoint(-0.2F, -33.5F, -6.5F);
		vss.addChild(gun98);
		gun98.cubeList.add(new ModelBox(gun98, 93, 177, 0.0F, 0.49F, -1.6F, 1, 1, 2, -0.2F, false));

		gun97 = new ModelRenderer(this);
		gun97.setRotationPoint(-0.1F, -33.5F, -4.5F);
		vss.addChild(gun97);
		gun97.cubeList.add(new ModelBox(gun97, 191, 166, -0.0243F, 0.5F, -1.9724F, 1, 1, 1, -0.2F, false));

		gun96 = new ModelRenderer(this);
		gun96.setRotationPoint(-0.1F, -33.5F, -7.5F);
		vss.addChild(gun96);
		gun96.cubeList.add(new ModelBox(gun96, 139, 194, -0.0259F, 0.5F, -1.2297F, 1, 1, 1, -0.2F, false));

		gun95 = new ModelRenderer(this);
		gun95.setRotationPoint(0.9F, -33.7F, -14.5F);
		vss.addChild(gun95);
		setRotationAngle(gun95, 0.0F, 0.0F, 2.3423F);
		gun95.cubeList.add(new ModelBox(gun95, 191, 162, 0.4482F, -0.5375F, -0.99F, 1, 1, 1, -0.2F, false));

		gun94 = new ModelRenderer(this);
		gun94.setRotationPoint(0.9F, -33.7F, -17.5F);
		vss.addChild(gun94);
		setRotationAngle(gun94, 0.0F, 0.0F, 2.3423F);
		gun94.cubeList.add(new ModelBox(gun94, 159, 191, 0.4482F, -0.5375F, -0.99F, 1, 1, 1, -0.2F, false));

		gun93 = new ModelRenderer(this);
		gun93.setRotationPoint(0.9F, -33.7F, -17.0F);
		vss.addChild(gun93);
		setRotationAngle(gun93, 0.0F, 0.0F, 2.3423F);
		gun93.cubeList.add(new ModelBox(gun93, 154, 191, 0.4582F, -0.5375F, -1.01F, 1, 1, 1, -0.2F, false));

		gun92 = new ModelRenderer(this);
		gun92.setRotationPoint(-0.1F, -33.7F, -17.0F);
		vss.addChild(gun92);
		gun92.cubeList.add(new ModelBox(gun92, 149, 191, -0.02F, 0.5F, -1.0F, 1, 1, 1, -0.2F, false));

		gun91 = new ModelRenderer(this);
		gun91.setRotationPoint(-0.1F, -33.7F, -14.5F);
		vss.addChild(gun91);
		gun91.cubeList.add(new ModelBox(gun91, 191, 148, -0.01F, 0.5F, -0.99F, 1, 1, 1, -0.2F, false));

		gun90 = new ModelRenderer(this);
		gun90.setRotationPoint(-0.1F, -33.7F, -17.5F);
		vss.addChild(gun90);
		gun90.cubeList.add(new ModelBox(gun90, 144, 191, -0.01F, 0.5F, -0.99F, 1, 1, 1, -0.2F, false));

		gun89 = new ModelRenderer(this);
		gun89.setRotationPoint(-0.4F, -35.0F, -22.0F);
		vss.addChild(gun89);
		

		gun88 = new ModelRenderer(this);
		gun88.setRotationPoint(-0.1F, -35.0F, -22.0F);
		vss.addChild(gun88);
		

		gun87 = new ModelRenderer(this);
		gun87.setRotationPoint(-0.1F, -33.5F, -17.5F);
		vss.addChild(gun87);
		gun87.cubeList.add(new ModelBox(gun87, 146, 94, 0.0F, 0.5F, -0.985F, 1, 1, 4, -0.2F, false));

		gun86 = new ModelRenderer(this);
		gun86.setRotationPoint(-0.35F, -32.8F, -24.0F);
		vss.addChild(gun86);
		

		gun85 = new ModelRenderer(this);
		gun85.setRotationPoint(-0.1F, -33.6F, -25.5F);
		vss.addChild(gun85);
		setRotationAngle(gun85, 2.1935F, 0.0F, 0.0F);
		gun85.cubeList.add(new ModelBox(gun85, 191, 142, -0.03F, 0.5509F, -0.5187F, 1, 1, 1, -0.2F, false));
		gun85.cubeList.add(new ModelBox(gun85, 139, 191, -0.03F, 0.8509F, -0.5187F, 1, 1, 1, -0.2F, false));

		gun84 = new ModelRenderer(this);
		gun84.setRotationPoint(0.9F, -34.0F, -22.0F);
		vss.addChild(gun84);
		setRotationAngle(gun84, 0.0F, 0.0F, 2.2679F);
		gun84.cubeList.add(new ModelBox(gun84, 93, 181, -0.2249F, 0.0817F, -0.5F, 2, 1, 1, -0.2F, false));

		gun83 = new ModelRenderer(this);
		gun83.setRotationPoint(-0.1F, -33.5F, -26.0F);
		vss.addChild(gun83);
		

		gun82 = new ModelRenderer(this);
		gun82.setRotationPoint(-0.1F, -33.5F, -26.5F);
		vss.addChild(gun82);
		gun82.cubeList.add(new ModelBox(gun82, 134, 191, -0.03F, -0.4791F, 0.9958F, 1, 1, 1, -0.2F, false));

		gun81 = new ModelRenderer(this);
		gun81.setRotationPoint(-0.1F, -34.0F, -26.5F);
		vss.addChild(gun81);
		gun81.cubeList.add(new ModelBox(gun81, 191, 129, -0.03F, -0.5791F, 0.9958F, 1, 1, 1, -0.2F, false));

		gun80 = new ModelRenderer(this);
		gun80.setRotationPoint(-0.1F, -35.0F, -26.5F);
		vss.addChild(gun80);
		gun80.cubeList.add(new ModelBox(gun80, 155, 136, 0.0F, 0.0F, 1.0F, 1, 1, 4, -0.2F, false));

		gun79 = new ModelRenderer(this);
		gun79.setRotationPoint(-0.4F, -35.0F, -17.5F);
		vss.addChild(gun79);
		gun79.cubeList.add(new ModelBox(gun79, 274, 248, 0.04F, 0.0F, -0.99F, 1, 3, 18, -0.2F, false));
		gun79.cubeList.add(new ModelBox(gun79, 61, 148, 0.04F, 0.0F, -7.99F, 1, 3, 4, -0.2F, false));

		gun78 = new ModelRenderer(this);
		gun78.setRotationPoint(-0.4F, -35.0F, -26.5F);
		vss.addChild(gun78);
		

		gun77 = new ModelRenderer(this);
		gun77.setRotationPoint(-0.6F, -31.6F, -7.5F);
		vss.addChild(gun77);
		gun77.cubeList.add(new ModelBox(gun77, 64, 0, 0.21F, -1.0F, -0.01F, 1, 1, 7, -0.2F, false));

		gun76 = new ModelRenderer(this);
		gun76.setRotationPoint(-3.4F, -28.3F, -19.5F);
		vss.addChild(gun76);
		gun76.cubeList.add(new ModelBox(gun76, 129, 191, -0.2F, -0.1F, 1.7F, 1, 1, 1, -0.2F, false));

		gun75 = new ModelRenderer(this);
		gun75.setRotationPoint(-0.6F, -28.3F, -19.5F);
		vss.addChild(gun75);
		gun75.cubeList.add(new ModelBox(gun75, 155, 130, 0.02F, -0.9F, -0.9F, 1, 1, 4, -0.2F, false));

		gun74 = new ModelRenderer(this);
		gun74.setRotationPoint(-3.4F, -27.8F, -19.0F);
		vss.addChild(gun74);
		gun74.cubeList.add(new ModelBox(gun74, 191, 126, -0.2F, -1.2F, 1.5F, 1, 1, 1, -0.2F, false));
		gun74.cubeList.add(new ModelBox(gun74, 172, 137, -0.2F, -1.2F, -0.9F, 1, 1, 3, -0.2F, false));

		gun73 = new ModelRenderer(this);
		gun73.setRotationPoint(-0.6F, -27.8F, -19.0F);
		vss.addChild(gun73);
		gun73.cubeList.add(new ModelBox(gun73, 86, 177, 0.02F, -0.9F, 0.2F, 1, 1, 2, -0.2F, false));

		gun72 = new ModelRenderer(this);
		gun72.setRotationPoint(-0.6F, -29.0F, -23.0F);
		vss.addChild(gun72);
		gun72.cubeList.add(new ModelBox(gun72, 103, 125, 0.02F, -1.2F, -1.3F, 1, 1, 8, -0.2F, false));

		gun71 = new ModelRenderer(this);
		gun71.setRotationPoint(-3.4F, -29.0F, -23.0F);
		vss.addChild(gun71);
		gun71.cubeList.add(new ModelBox(gun71, 58, 122, -0.2F, -1.2F, -1.3F, 1, 1, 8, -0.2F, false));

		gun70 = new ModelRenderer(this);
		gun70.setRotationPoint(-3.4F, -28.8F, -22.5F);
		vss.addChild(gun70);
		gun70.cubeList.add(new ModelBox(gun70, 10, 146, -0.19F, -0.8F, 0.4F, 1, 1, 5, -0.2F, false));
		gun70.cubeList.add(new ModelBox(gun70, 191, 122, -0.19F, -0.8F, 5.0F, 1, 1, 1, -0.2F, false));

		gun69 = new ModelRenderer(this);
		gun69.setRotationPoint(-0.6F, -28.8F, -22.5F);
		vss.addChild(gun69);
		gun69.cubeList.add(new ModelBox(gun69, 140, 63, 0.01F, -0.925F, 0.1F, 1, 1, 6, -0.2F, false));

		gun68 = new ModelRenderer(this);
		gun68.setRotationPoint(-3.5F, -26.25F, -17.5F);
		vss.addChild(gun68);
		setRotationAngle(gun68, 1.3013F, 0.0F, 0.0F);
		gun68.cubeList.add(new ModelBox(gun68, 129, 176, -0.155F, -0.3267F, 1.0099F, 3, 1, 1, -0.199F, false));
		gun68.cubeList.add(new ModelBox(gun68, 181, 90, 1.995F, -0.3267F, 1.0099F, 2, 1, 1, -0.199F, false));

		gun67 = new ModelRenderer(this);
		gun67.setRotationPoint(-3.5F, -28.8F, -26.5F);
		vss.addChild(gun67);
		setRotationAngle(gun67, 1.3013F, 0.0F, 0.0F);
		gun67.cubeList.add(new ModelBox(gun67, 112, 59, -0.155F, -0.3267F, 1.0099F, 3, 10, 1, -0.2F, false));
		gun67.cubeList.add(new ModelBox(gun67, 153, 48, 1.995F, -0.3267F, 1.0099F, 2, 10, 1, -0.2F, false));

		gun66 = new ModelRenderer(this);
		gun66.setRotationPoint(-3.4F, -30.2F, -14.5F);
		vss.addChild(gun66);
		setRotationAngle(gun66, 2.3051F, 0.0F, 0.0F);
		gun66.cubeList.add(new ModelBox(gun66, 67, 177, -0.181F, -0.3691F, 1.7021F, 2, 2, 1, -0.201F, false));

		gun65 = new ModelRenderer(this);
		gun65.setRotationPoint(-3.4F, -31.2F, -16.5F);
		vss.addChild(gun65);
		

		gun64 = new ModelRenderer(this);
		gun64.setRotationPoint(-0.6F, -30.9F, -15.1F);
		vss.addChild(gun64);
		setRotationAngle(gun64, -2.4166F, 0.0F, 0.0F);
		gun64.cubeList.add(new ModelBox(gun64, 86, 181, -0.81F, 0.8485F, -0.6631F, 2, 1, 1, -0.2F, false));

		gun63 = new ModelRenderer(this);
		gun63.setRotationPoint(-3.4F, -31.9F, -15.5F);
		vss.addChild(gun63);
		setRotationAngle(gun63, -1.7299F, 0.0F, 0.0F);
		gun63.cubeList.add(new ModelBox(gun63, 100, 42, -0.21F, 0.1584F, -0.5874F, 3, 1, 5, -0.2F, false));

		gun62 = new ModelRenderer(this);
		gun62.setRotationPoint(-0.6F, -31.9F, -15.5F);
		vss.addChild(gun62);
		setRotationAngle(gun62, -1.7299F, 0.0F, 0.0F);
		gun62.cubeList.add(new ModelBox(gun62, 139, 100, -0.965F, 0.1584F, -0.5874F, 2, 1, 5, -0.2F, false));

		gun61 = new ModelRenderer(this);
		gun61.setRotationPoint(-3.3F, -30.0F, -7.0F);
		vss.addChild(gun61);
		gun61.cubeList.add(new ModelBox(gun61, 191, 103, -0.2F, -1.0F, 0.0F, 1, 1, 1, -0.2F, false));

		gun60 = new ModelRenderer(this);
		gun60.setRotationPoint(-0.7F, -30.0F, -7.0F);
		vss.addChild(gun60);
		gun60.cubeList.add(new ModelBox(gun60, 191, 97, 0.4F, -1.0F, 0.0F, 1, 1, 1, -0.2F, false));

		gun59 = new ModelRenderer(this);
		gun59.setRotationPoint(-3.4F, -31.8F, -26.5F);
		vss.addChild(gun59);
		gun59.cubeList.add(new ModelBox(gun59, 0, 96, -0.18F, -0.925F, 1.0F, 3, 3, 9, -0.2F, false));
		gun59.cubeList.add(new ModelBox(gun59, 86, 167, -0.18F, -1.0F, 9.5F, 3, 3, 1, -0.2F, false));

		gun58 = new ModelRenderer(this);
		gun58.setRotationPoint(-0.6F, -31.8F, -26.5F);
		vss.addChild(gun58);
		gun58.cubeList.add(new ModelBox(gun58, 86, 42, -0.98F, -2.925F, 1.0F, 2, 5, 9, -0.2F, false));
		gun58.cubeList.add(new ModelBox(gun58, 21, 49, 0.02F, -1.5F, 9.6F, 1, 3, 1, -0.2F, false));

		gun52 = new ModelRenderer(this);
		gun52.setRotationPoint(-3.2F, -35.0F, -0.6F);
		vss.addChild(gun52);
		gun52.cubeList.add(new ModelBox(gun52, 0, 80, -0.2F, 0.0F, -2.2F, 3, 4, 3, -0.2F, false));

		gun51 = new ModelRenderer(this);
		gun51.setRotationPoint(-0.8F, -35.0F, -0.6F);
		vss.addChild(gun51);
		gun51.cubeList.add(new ModelBox(gun51, 23, 148, -0.8F, 0.0F, -2.2F, 2, 4, 3, -0.199F, false));

		gun50 = new ModelRenderer(this);
		gun50.setRotationPoint(-3.3F, -30.8F, -7.7F);
		vss.addChild(gun50);
		setRotationAngle(gun50, 0.0F, 0.0F, -0.3961F);
		gun50.cubeList.add(new ModelBox(gun50, 54, 142, 0.2742F, -1.3546F, -0.01F, 1, 1, 1, -0.2F, false));

		gun49 = new ModelRenderer(this);
		gun49.setRotationPoint(0.3F, -30.8F, -7.7F);
		vss.addChild(gun49);
		setRotationAngle(gun49, 0.0F, 0.0F, 1.9705F);
		gun49.cubeList.add(new ModelBox(gun49, 192, 191, -1.3526F, 0.2773F, -0.01F, 1, 1, 1, -0.2F, false));

		gun48 = new ModelRenderer(this);
		gun48.setRotationPoint(-0.6F, -31.8F, -16.5F);
		vss.addChild(gun48);
		gun48.cubeList.add(new ModelBox(gun48, 43, 122, -0.8F, -1.0F, 0.0F, 2, 1, 10, -0.2F, false));

		gun47 = new ModelRenderer(this);
		gun47.setRotationPoint(-3.4F, -31.8F, -16.5F);
		vss.addChild(gun47);
		gun47.cubeList.add(new ModelBox(gun47, 0, 120, -0.19F, -1.0F, 0.0F, 2, 1, 10, -0.2F, false));

		gun46 = new ModelRenderer(this);
		gun46.setRotationPoint(-2.5F, -30.0F, -7.7F);
		vss.addChild(gun46);
		gun46.cubeList.add(new ModelBox(gun46, 181, 75, 0.0F, -1.0F, 0.0F, 2, 1, 1, -0.2F, false));

		gun45 = new ModelRenderer(this);
		gun45.setRotationPoint(-3.1F, -31.0F, -7.7F);
		vss.addChild(gun45);
		gun45.cubeList.add(new ModelBox(gun45, 58, 122, -0.2F, -1.01F, -0.01F, 1, 5, 1, -0.2F, false));

		gun44 = new ModelRenderer(this);
		gun44.setRotationPoint(-0.9F, -31.0F, -7.7F);
		vss.addChild(gun44);
		gun44.cubeList.add(new ModelBox(gun44, 15, 120, 0.2F, -1.01F, -0.01F, 1, 5, 1, -0.2F, false));

		gun43 = new ModelRenderer(this);
		gun43.setRotationPoint(0.4F, -30.6F, -7.5F);
		vss.addChild(gun43);
		setRotationAngle(gun43, 0.0F, 0.0F, 2.2679F);
		gun43.cubeList.add(new ModelBox(gun43, 129, 100, -1.1265F, 0.5627F, -0.01F, 1, 1, 7, -0.2F, false));

		gun42 = new ModelRenderer(this);
		gun42.setRotationPoint(-3.4F, -30.6F, -7.5F);
		vss.addChild(gun42);
		setRotationAngle(gun42, 0.0F, 0.0F, -0.6692F);
		gun42.cubeList.add(new ModelBox(gun42, 21, 40, 0.6143F, -1.2134F, -0.01F, 1, 1, 7, -0.2F, false));

		gun41 = new ModelRenderer(this);
		gun41.setRotationPoint(-3.4F, -31.6F, -7.5F);
		vss.addChild(gun41);
		gun41.cubeList.add(new ModelBox(gun41, 129, 91, -0.19F, -1.1F, -0.01F, 1, 1, 7, -0.2F, false));

		gun40 = new ModelRenderer(this);
		gun40.setRotationPoint(-3.3F, -30.2F, -3.0F);
		vss.addChild(gun40);
		setRotationAngle(gun40, -0.7436F, 0.0F, 0.0F);
		gun40.cubeList.add(new ModelBox(gun40, 196, 46, -0.2F, -0.6302F, -1.5306F, 1, 1, 1, -0.2F, false));

		gun39 = new ModelRenderer(this);
		gun39.setRotationPoint(-0.7F, -30.2F, -3.0F);
		vss.addChild(gun39);
		setRotationAngle(gun39, -0.7436F, 0.0F, 0.0F);
		gun39.cubeList.add(new ModelBox(gun39, 196, 42, 0.2F, -0.6302F, -1.5306F, 1, 1, 1, -0.2F, false));

		gun38 = new ModelRenderer(this);
		gun38.setRotationPoint(-2.5F, -25.7F, -14.8F);
		vss.addChild(gun38);
		setRotationAngle(gun38, -1.45F, 0.0F, 0.0F);
		gun38.cubeList.add(new ModelBox(gun38, 61, 181, -0.001F, -0.3301F, -1.6174F, 2, 1, 1, -0.299F, false));
		gun38.cubeList.add(new ModelBox(gun38, 129, 155, -0.001F, -0.3301F, -1.2174F, 2, 1, 1, -0.299F, false));

		gun37 = new ModelRenderer(this);
		gun37.setRotationPoint(-3.0F, -30.5F, -14.5F);
		vss.addChild(gun37);
		setRotationAngle(gun37, 2.3051F, 0.0F, 0.0F);
		gun37.cubeList.add(new ModelBox(gun37, 11, 132, 0.029F, 0.3959F, 0.631F, 3, 2, 1, -0.2F, false));

		gun36 = new ModelRenderer(this);
		gun36.setRotationPoint(-0.9F, -27.5F, -16.0F);
		vss.addChild(gun36);
		gun36.cubeList.add(new ModelBox(gun36, 197, 12, 0.1F, -1.0F, 0.0F, 1, 1, 1, -0.2F, false));

		gun35 = new ModelRenderer(this);
		gun35.setRotationPoint(-0.9F, -29.4F, -15.5F);
		vss.addChild(gun35);
		setRotationAngle(gun35, -0.7064F, 0.0F, 0.0F);
		

		gun34 = new ModelRenderer(this);
		gun34.setRotationPoint(-3.1F, -28.5F, -16.0F);
		vss.addChild(gun34);
		gun34.cubeList.add(new ModelBox(gun34, 191, 93, -0.1F, 0.0F, 0.0F, 1, 1, 1, -0.2F, false));

		gun33 = new ModelRenderer(this);
		gun33.setRotationPoint(-2.5F, -26.0F, -16.2F);
		vss.addChild(gun33);
		setRotationAngle(gun33, 0.5949F, 0.0F, 0.0F);
		gun33.cubeList.add(new ModelBox(gun33, 181, 33, 0.0F, -0.8257F, 0.921F, 2, 1, 1, -0.3F, false));
		gun33.cubeList.add(new ModelBox(gun33, 28, 181, 0.0F, -1.2257F, 0.921F, 2, 1, 1, -0.3F, false));

		gun32 = new ModelRenderer(this);
		gun32.setRotationPoint(-2.5F, -31.0F, -8.5F);
		vss.addChild(gun32);
		setRotationAngle(gun32, 0.9666F, 0.0F, 0.0F);
		gun32.cubeList.add(new ModelBox(gun32, 43, 11, -0.5F, -0.8681F, 0.823F, 3, 2, 2, -0.2F, false));

		gun31 = new ModelRenderer(this);
		gun31.setRotationPoint(-2.5F, -29.2F, -7.8F);
		vss.addChild(gun31);
		setRotationAngle(gun31, -0.2231F, 0.0F, 0.0F);
		gun31.cubeList.add(new ModelBox(gun31, 28, 177, 0.0F, -1.2752F, -0.1213F, 2, 2, 1, -0.2F, false));

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
		gun17.cubeList.add(new ModelBox(gun17, 0, 74, 0.0F, -1.0F, -0.1F, 3, 1, 2, -0.2F, false));

		gun16 = new ModelRenderer(this);
		gun16.setRotationPoint(-0.8F, -26.5F, -5.5F);
		vss.addChild(gun16);
		setRotationAngle(gun16, 2.8256F, 0.0F, 0.0F);
		

		gun15 = new ModelRenderer(this);
		gun15.setRotationPoint(-3.2F, -26.5F, -5.5F);
		vss.addChild(gun15);
		setRotationAngle(gun15, 2.8256F, 0.0F, 0.0F);
		gun15.cubeList.add(new ModelBox(gun15, 109, 145, -0.2F, 0.6505F, 0.3108F, 3, 6, 2, -0.2F, false));

		gun9 = new ModelRenderer(this);
		gun9.setRotationPoint(-0.5F, -35.0F, -26.5F);
		vss.addChild(gun9);
		

		gun8 = new ModelRenderer(this);
		gun8.setRotationPoint(-3.4F, -35.0F, -26.5F);
		vss.addChild(gun8);
		gun8.cubeList.add(new ModelBox(gun8, 0, 200, -0.2F, 0.0F, 1.0F, 3, 3, 25, -0.2F, false));

		gun7 = new ModelRenderer(this);
		gun7.setRotationPoint(-3.0F, -32.0F, -16.5F);
		vss.addChild(gun7);
		gun7.cubeList.add(new ModelBox(gun7, 43, 142, 0.0F, -1.1F, 0.1F, 3, 6, 2, -0.2F, false));
		gun7.cubeList.add(new ModelBox(gun7, 0, 40, 0.4F, -1.1F, 10.5F, 3, 6, 4, -0.3F, false));
		gun7.cubeList.add(new ModelBox(gun7, 43, 42, -0.4F, -1.1F, 10.5F, 2, 6, 4, -0.3F, false));
		gun7.cubeList.add(new ModelBox(gun7, 138, 168, 0.0F, 1.9F, -0.5F, 3, 3, 1, -0.2F, false));

		gun6 = new ModelRenderer(this);
		gun6.setRotationPoint(-2.5F, -27.0F, -14.5F);
		vss.addChild(gun6);
		gun6.cubeList.add(new ModelBox(gun6, 129, 11, -0.5F, -0.99F, -0.3F, 3, 1, 9, -0.2F, false));

		gun5 = new ModelRenderer(this);
		gun5.setRotationPoint(-0.8F, -31.0F, -7.5F);
		vss.addChild(gun5);
		gun5.cubeList.add(new ModelBox(gun5, 17, 58, 0.21F, -1.0F, 0.0F, 1, 5, 2, -0.2F, false));

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(-3.9F, -33.0F, -8.5F);
		vss.addChild(bone23);
		setRotationAngle(bone23, 0.5061F, 0.0F, 0.0F);
		bone23.cubeList.add(new ModelBox(bone23, 176, 183, -0.3F, -1.1749F, -0.403F, 1, 1, 1, -0.2F, false));
		bone23.cubeList.add(new ModelBox(bone23, 129, 60, -0.31F, -0.9749F, -0.803F, 1, 2, 2, -0.2F, false));
		bone23.cubeList.add(new ModelBox(bone23, 72, 183, -0.3F, -0.4749F, 0.397F, 1, 1, 1, -0.2F, false));
		bone23.cubeList.add(new ModelBox(bone23, 57, 193, -0.3F, -0.4749F, -1.003F, 1, 1, 1, -0.2F, false));
		bone23.cubeList.add(new ModelBox(bone23, 135, 162, -0.3F, 0.2251F, -0.403F, 1, 1, 1, -0.2F, false));

		gun166 = new ModelRenderer(this);
		gun166.setRotationPoint(0.0F, -3.0F, -7.0F);
		bone23.addChild(gun166);
		setRotationAngle(gun166, -0.0873F, 0.0F, 0.0F);
		gun166.cubeList.add(new ModelBox(gun166, 140, 54, -0.08F, -0.154F, 1.2185F, 1, 1, 6, -0.2F, false));

		gun180 = new ModelRenderer(this);
		gun180.setRotationPoint(-0.1F, -1.85F, 0.0F);
		bone23.addChild(gun180);
		setRotationAngle(gun180, -1.7474F, 0.0F, 0.0F);
		gun180.cubeList.add(new ModelBox(gun180, 129, 42, -0.1F, -0.0647F, -0.1892F, 1, 5, 1, -0.2F, false));

		gun170 = new ModelRenderer(this);
		gun170.setRotationPoint(0.0F, 2.2F, 0.4F);
		bone23.addChild(gun170);
		setRotationAngle(gun170, 2.6397F, 0.0F, 0.0F);
		gun170.cubeList.add(new ModelBox(gun170, 15, 120, -0.08F, 0.6945F, -0.0835F, 1, 1, 8, -0.2F, false));
		gun170.cubeList.add(new ModelBox(gun170, 76, 191, -0.08F, 0.5945F, 7.4165F, 1, 1, 1, -0.2F, false));
		gun170.cubeList.add(new ModelBox(gun170, 71, 191, -0.08F, 0.5945F, 8.0165F, 1, 1, 1, -0.2F, false));

		gun172_r1 = new ModelRenderer(this);
		gun172_r1.setRotationPoint(0.42F, 1.3945F, 8.0665F);
		gun170.addChild(gun172_r1);
		setRotationAngle(gun172_r1, 0.1571F, 0.0F, 0.0F);
		gun172_r1.cubeList.add(new ModelBox(gun172_r1, 53, 191, -0.5F, -0.5F, -0.65F, 1, 1, 1, -0.2F, false));

		gun173_r1 = new ModelRenderer(this);
		gun173_r1.setRotationPoint(0.42F, 1.3476F, 8.3628F);
		gun170.addChild(gun173_r1);
		setRotationAngle(gun173_r1, 0.1571F, 0.0F, 0.0F);
		gun173_r1.cubeList.add(new ModelBox(gun173_r1, 62, 191, -0.5F, -0.5F, -0.35F, 1, 1, 1, -0.2F, false));

		gun171 = new ModelRenderer(this);
		gun171.setRotationPoint(0.0F, -2.0F, -7.0F);
		bone23.addChild(gun171);
		setRotationAngle(gun171, 0.9666F, 0.0F, 0.0F);
		

		gun168 = new ModelRenderer(this);
		gun168.setRotationPoint(0.0F, -0.3F, 1.9F);
		bone23.addChild(gun168);
		setRotationAngle(gun168, -1.8961F, 0.0F, 0.0F);
		gun168.cubeList.add(new ModelBox(gun168, 60, 82, -0.08F, -0.0262F, -0.2944F, 1, 3, 2, -0.2F, false));
		gun168.cubeList.add(new ModelBox(gun168, 160, 48, -0.099F, 1.964F, -0.3967F, 1, 5, 1, -0.2F, false));
		gun168.cubeList.add(new ModelBox(gun168, 108, 135, -0.099F, 1.964F, 0.2033F, 1, 4, 1, -0.2F, false));

		gun167 = new ModelRenderer(this);
		gun167.setRotationPoint(0.0F, -2.45F, -0.1F);
		bone23.addChild(gun167);
		setRotationAngle(gun167, -0.8179F, 0.0F, 0.0F);
		gun167.cubeList.add(new ModelBox(gun167, 27, 166, -0.08F, -0.1904F, -0.0614F, 1, 2, 3, -0.2F, false));

		gun179 = new ModelRenderer(this);
		gun179.setRotationPoint(-0.1F, -1.0F, 0.5F);
		bone23.addChild(gun179);
		setRotationAngle(gun179, -2.6025F, 0.0F, 0.0F);
		gun179.cubeList.add(new ModelBox(gun179, 194, 7, -0.1F, 0.2668F, -0.0981F, 1, 1, 1, -0.2F, false));

		gun169 = new ModelRenderer(this);
		gun169.setRotationPoint(0.0F, 1.7F, 1.3F);
		bone23.addChild(gun169);
		setRotationAngle(gun169, -2.6397F, 0.0F, 0.0F);
		gun169.cubeList.add(new ModelBox(gun169, 15, 166, -0.08F, 0.3734F, -0.4624F, 1, 1, 1, -0.2F, false));

		gun4 = new ModelRenderer(this);
		gun4.setRotationPoint(-3.2F, -31.0F, -7.5F);
		vss.addChild(gun4);
		gun4.cubeList.add(new ModelBox(gun4, 129, 147, -0.21F, -1.0F, 0.0F, 3, 5, 2, -0.2F, false));

		barrel3 = new ModelRenderer(this);
		barrel3.setRotationPoint(-1.1F, -22.1F, -81.8F);
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
		cube_r46.cubeList.add(new ModelBox(cube_r46, 172, 120, -5.9162F, -12.6885F, 7.0F, 2, 1, 38, -0.2F, false));

		cube_r47 = new ModelRenderer(this);
		cube_r47.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone21.addChild(cube_r47);
		setRotationAngle(cube_r47, 0.0F, 0.0F, -0.4363F);
		cube_r47.cubeList.add(new ModelBox(cube_r47, 129, 42, 4.0916F, -12.6067F, 7.0F, 2, 1, 38, -0.2F, false));

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(-1.5F, -32.4F, -85.5F);
		barrel4.addChild(bone22);
		

		cube_r48 = new ModelRenderer(this);
		cube_r48.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone22.addChild(cube_r48);
		setRotationAngle(cube_r48, 0.0F, 0.0F, -0.4363F);
		cube_r48.cubeList.add(new ModelBox(cube_r48, 172, 80, 6.1765F, -14.2467F, 7.0F, 2, 1, 38, -0.2F, false));

		cube_r49 = new ModelRenderer(this);
		cube_r49.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone22.addChild(cube_r49);
		setRotationAngle(cube_r49, 0.0F, 0.0F, 0.4363F);
		cube_r49.cubeList.add(new ModelBox(cube_r49, 172, 40, -8.0012F, -14.3285F, 7.0F, 2, 1, 38, -0.2F, false));

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(1.2F, -35.1F, -85.5F);
		barrel4.addChild(bone24);
		setRotationAngle(bone24, 0.0F, 0.0F, 1.5708F);
		

		cube_r50 = new ModelRenderer(this);
		cube_r50.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone24.addChild(cube_r50);
		setRotationAngle(cube_r50, 0.0F, 0.0F, 0.4363F);
		cube_r50.cubeList.add(new ModelBox(cube_r50, 129, 2, -12.966F, 6.2788F, 7.0F, 2, 1, 38, -0.2F, false));

		cube_r51 = new ModelRenderer(this);
		cube_r51.setRotationPoint(0.0F, 70.2F, 0.0F);
		bone24.addChild(cube_r51);
		setRotationAngle(cube_r51, 0.0F, 0.0F, 0.4363F);
		cube_r51.cubeList.add(new ModelBox(cube_r51, 181, 27, -42.647F, -57.4072F, 44.4F, 2, 1, 1, -0.2F, false));

		cube_r52 = new ModelRenderer(this);
		cube_r52.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone24.addChild(cube_r52);
		setRotationAngle(cube_r52, 0.0F, 0.0F, -0.4363F);
		cube_r52.cubeList.add(new ModelBox(cube_r52, 139, 86, -14.9314F, -5.8656F, 44.4F, 2, 1, 1, -0.2F, false));
		cube_r52.cubeList.add(new ModelBox(cube_r52, 0, 40, -14.9692F, -5.814F, 7.0F, 2, 1, 38, -0.2F, false));

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(-4.2F, -35.1F, -85.5F);
		barrel4.addChild(bone25);
		setRotationAngle(bone25, 0.0F, 0.0F, -1.5708F);
		

		cube_r53 = new ModelRenderer(this);
		cube_r53.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone25.addChild(cube_r53);
		setRotationAngle(cube_r53, 0.0F, 0.0F, -0.4363F);
		cube_r53.cubeList.add(new ModelBox(cube_r53, 172, 0, 10.8842F, 6.4541F, 7.0F, 2, 1, 38, -0.2F, false));

		cube_r54 = new ModelRenderer(this);
		cube_r54.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone25.addChild(cube_r54);
		setRotationAngle(cube_r54, 0.0F, 0.0F, 0.4363F);
		cube_r54.cubeList.add(new ModelBox(cube_r54, 129, 162, 13.051F, -5.6387F, 7.0F, 2, 1, 38, -0.2F, false));

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
		cube_r55.cubeList.add(new ModelBox(cube_r55, 0, 172, 6.1836F, -15.2037F, 5.599F, 2, 2, 2, -0.15F, false));

		cube_r56 = new ModelRenderer(this);
		cube_r56.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone26.addChild(cube_r56);
		setRotationAngle(cube_r56, 0.0F, 0.0F, 0.4363F);
		cube_r56.cubeList.add(new ModelBox(cube_r56, 172, 132, -8.0084F, -15.2868F, 5.602F, 2, 2, 2, -0.149F, false));

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter5.addChild(bone27);
		setRotationAngle(bone27, 0.0F, 0.0F, 1.5708F);
		

		cube_r57 = new ModelRenderer(this);
		cube_r57.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone27.addChild(cube_r57);
		setRotationAngle(cube_r57, 0.0F, 0.0F, 0.4363F);
		cube_r57.cubeList.add(new ModelBox(cube_r57, 172, 152, -13.0019F, 6.2228F, 5.601F, 2, 2, 2, -0.148F, false));

		cube_r58 = new ModelRenderer(this);
		cube_r58.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone27.addChild(cube_r58);
		setRotationAngle(cube_r58, 0.0F, 0.0F, -0.4363F);
		cube_r58.cubeList.add(new ModelBox(cube_r58, 104, 168, -14.993F, -5.9008F, 5.599F, 2, 2, 2, -0.15F, false));

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter5.addChild(bone28);
		setRotationAngle(bone28, 0.0F, 0.0F, -1.5708F);
		

		cube_r59 = new ModelRenderer(this);
		cube_r59.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone28.addChild(cube_r59);
		setRotationAngle(cube_r59, 0.0F, 0.0F, -0.4363F);
		cube_r59.cubeList.add(new ModelBox(cube_r59, 172, 127, 10.9193F, 6.3957F, 5.601F, 2, 2, 2, -0.15F, false));

		cube_r60 = new ModelRenderer(this);
		cube_r60.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone28.addChild(cube_r60);
		setRotationAngle(cube_r60, 0.0F, 0.0F, 0.4363F);
		cube_r60.cubeList.add(new ModelBox(cube_r60, 172, 122, 13.0746F, -5.7215F, 5.599F, 2, 2, 2, -0.148F, false));

		bone29 = new ModelRenderer(this);
		bone29.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter5.addChild(bone29);
		

		cube_r61 = new ModelRenderer(this);
		cube_r61.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone29.addChild(cube_r61);
		setRotationAngle(cube_r61, 0.0F, 0.0F, 0.4363F);
		cube_r61.cubeList.add(new ModelBox(cube_r61, 172, 167, -5.9358F, -12.7897F, 5.6F, 2, 2, 2, -0.149F, false));

		cube_r62 = new ModelRenderer(this);
		cube_r62.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone29.addChild(cube_r62);
		setRotationAngle(cube_r62, 0.0F, 0.0F, -0.4363F);
		cube_r62.cubeList.add(new ModelBox(cube_r62, 156, 168, 4.1128F, -12.7086F, 5.601F, 2, 2, 2, -0.15F, false));

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
		cube_r63.cubeList.add(new ModelBox(cube_r63, 112, 23, 6.1291F, -14.0859F, 7.0F, 2, 1, 2, -0.1F, false));

		cube_r64 = new ModelRenderer(this);
		cube_r64.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone30.addChild(cube_r64);
		setRotationAngle(cube_r64, 0.0F, 0.0F, 0.4363F);
		cube_r64.cubeList.add(new ModelBox(cube_r64, 158, 82, -7.9961F, -14.1479F, 7.0F, 2, 1, 2, -0.1F, false));

		bone31 = new ModelRenderer(this);
		bone31.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter6.addChild(bone31);
		setRotationAngle(bone31, 0.0F, 0.0F, 1.5708F);
		

		cube_r65 = new ModelRenderer(this);
		cube_r65.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone31.addChild(cube_r65);
		setRotationAngle(cube_r65, 0.0F, 0.0F, 0.4363F);
		cube_r65.cubeList.add(new ModelBox(cube_r65, 95, 173, -12.9386F, 6.1452F, 7.0F, 2, 1, 2, -0.1F, false));

		cube_r66 = new ModelRenderer(this);
		cube_r66.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone31.addChild(cube_r66);
		setRotationAngle(cube_r66, 0.0F, 0.0F, -0.4363F);
		cube_r66.cubeList.add(new ModelBox(cube_r66, 43, 74, -14.937F, -5.9198F, 7.0F, 2, 1, 2, -0.1F, false));

		bone32 = new ModelRenderer(this);
		bone32.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter6.addChild(bone32);
		setRotationAngle(bone32, 0.0F, 0.0F, -1.5708F);
		

		cube_r67 = new ModelRenderer(this);
		cube_r67.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone32.addChild(cube_r67);
		setRotationAngle(cube_r67, 0.0F, 0.0F, -0.4363F);
		cube_r67.cubeList.add(new ModelBox(cube_r67, 156, 62, 10.8766F, 6.2782F, 7.0F, 2, 1, 2, -0.1F, false));

		cube_r68 = new ModelRenderer(this);
		cube_r68.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone32.addChild(cube_r68);
		setRotationAngle(cube_r68, 0.0F, 0.0F, 0.4363F);
		cube_r68.cubeList.add(new ModelBox(cube_r68, 156, 34, 12.999F, -5.7868F, 7.0F, 2, 1, 2, -0.1F, false));

		bone33 = new ModelRenderer(this);
		bone33.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter6.addChild(bone33);
		

		cube_r69 = new ModelRenderer(this);
		cube_r69.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone33.addChild(cube_r69);
		setRotationAngle(cube_r69, 0.0F, 0.0F, 0.4363F);
		cube_r69.cubeList.add(new ModelBox(cube_r69, 113, 173, -5.9358F, -12.7897F, 7.0F, 2, 1, 2, -0.1F, false));

		cube_r70 = new ModelRenderer(this);
		cube_r70.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone33.addChild(cube_r70);
		setRotationAngle(cube_r70, 0.0F, 0.0F, -0.4363F);
		cube_r70.cubeList.add(new ModelBox(cube_r70, 61, 74, 4.0688F, -12.7277F, 7.0F, 2, 1, 2, -0.1F, false));

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
		cube_r71.cubeList.add(new ModelBox(cube_r71, 73, 162, 6.1291F, -14.0859F, 0.0F, 2, 1, 1, -0.1F, false));

		cube_r72 = new ModelRenderer(this);
		cube_r72.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone36.addChild(cube_r72);
		setRotationAngle(cube_r72, 0.0F, 0.0F, 0.4363F);
		cube_r72.cubeList.add(new ModelBox(cube_r72, 21, 181, -7.9961F, -14.1479F, 0.0F, 2, 1, 1, -0.1F, false));

		bone37 = new ModelRenderer(this);
		bone37.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter7.addChild(bone37);
		setRotationAngle(bone37, 0.0F, 0.0F, 1.5708F);
		bone37.cubeList.add(new ModelBox(bone37, 30, 28, -14.8F, 0.2001F, 1.4F, 1, 1, 2, -0.2F, false));

		cube_r73 = new ModelRenderer(this);
		cube_r73.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone37.addChild(cube_r73);
		setRotationAngle(cube_r73, 0.0F, 0.0F, 0.4363F);
		cube_r73.cubeList.add(new ModelBox(cube_r73, 107, 181, -12.9386F, 6.1452F, 0.0F, 2, 1, 1, -0.1F, false));

		cube_r74 = new ModelRenderer(this);
		cube_r74.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone37.addChild(cube_r74);
		setRotationAngle(cube_r74, 0.0F, 0.0F, -0.4363F);
		cube_r74.cubeList.add(new ModelBox(cube_r74, 61, 111, -14.937F, -5.9198F, 0.0F, 2, 1, 1, -0.1F, false));

		bone38 = new ModelRenderer(this);
		bone38.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter7.addChild(bone38);
		setRotationAngle(bone38, 0.0F, 0.0F, -1.5708F);
		

		cube_r75 = new ModelRenderer(this);
		cube_r75.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone38.addChild(cube_r75);
		setRotationAngle(cube_r75, 0.0F, 0.0F, -0.4363F);
		cube_r75.cubeList.add(new ModelBox(cube_r75, 14, 181, 10.8766F, 6.2782F, 0.0F, 2, 1, 1, -0.1F, false));

		cube_r76 = new ModelRenderer(this);
		cube_r76.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone38.addChild(cube_r76);
		setRotationAngle(cube_r76, 0.0F, 0.0F, 0.4363F);
		cube_r76.cubeList.add(new ModelBox(cube_r76, 7, 181, 12.999F, -5.7868F, 0.0F, 2, 1, 1, -0.1F, false));

		bone39 = new ModelRenderer(this);
		bone39.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter7.addChild(bone39);
		

		cube_r77 = new ModelRenderer(this);
		cube_r77.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone39.addChild(cube_r77);
		setRotationAngle(cube_r77, 0.0F, 0.0F, 0.4363F);
		cube_r77.cubeList.add(new ModelBox(cube_r77, 181, 122, -5.9358F, -12.7897F, 0.0F, 2, 1, 1, -0.1F, false));

		cube_r78 = new ModelRenderer(this);
		cube_r78.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone39.addChild(cube_r78);
		setRotationAngle(cube_r78, 0.0F, 0.0F, -0.4363F);
		cube_r78.cubeList.add(new ModelBox(cube_r78, 31, 148, 4.0688F, -12.7277F, 0.0F, 2, 1, 1, -0.1F, false));

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
		ironsights2.cubeList.add(new ModelBox(ironsights2, 73, 18, 22.0F, -5.8F, 8.5F, 1, 4, 2, -0.3F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 60, 58, 21.0F, -4.6F, 37.5F, 2, 3, 8, -0.3F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 60, 42, 20.2F, -4.6F, 37.5F, 2, 3, 8, -0.299F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 145, 11, 20.2F, -4.8F, 40.5F, 1, 1, 5, -0.301F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 96, 144, 22.0F, -4.8F, 40.5F, 1, 1, 5, -0.301F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 73, 132, 20.2F, -5.66F, 38.42F, 1, 2, 2, -0.301F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 129, 42, 20.6F, -5.46F, 38.82F, 2, 1, 7, -0.301F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 58, 176, 20.1F, -5.26F, 45.12F, 3, 1, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 156, 173, 20.1F, -5.46F, 45.12F, 3, 1, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 147, 173, 20.1F, -5.66F, 45.12F, 3, 1, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 161, 13, 22.1F, -5.86F, 45.12F, 1, 1, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 33, 155, 21.9F, -5.86F, 45.12F, 1, 1, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 153, 136, 21.7F, -5.86F, 45.12F, 1, 1, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 153, 13, 21.5F, -5.86F, 45.12F, 1, 1, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 151, 88, 21.4F, -5.86F, 45.12F, 1, 1, 1, -0.401F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 195, 112, 21.4F, -5.96F, 45.12F, 1, 1, 1, -0.402F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 195, 99, 21.5F, -5.96F, 45.12F, 1, 1, 1, -0.401F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 195, 95, 21.7F, -5.96F, 45.12F, 1, 1, 1, -0.401F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 195, 91, 21.9F, -5.96F, 45.12F, 1, 1, 1, -0.401F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 195, 72, 22.1F, -5.96F, 45.12F, 1, 1, 1, -0.401F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 196, 26, 20.8F, -5.96F, 45.12F, 1, 1, 1, -0.402F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 196, 21, 20.7F, -5.96F, 45.12F, 1, 1, 1, -0.401F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 196, 4, 20.5F, -5.96F, 45.12F, 1, 1, 1, -0.401F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 61, 195, 20.3F, -5.96F, 45.12F, 1, 1, 1, -0.401F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 53, 195, 20.1F, -5.96F, 45.12F, 1, 1, 1, -0.401F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 103, 162, 20.8F, -5.86F, 45.12F, 1, 1, 1, -0.401F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 94, 162, 20.7F, -5.86F, 45.12F, 1, 1, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 76, 151, 20.3F, -5.86F, 45.12F, 1, 1, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 149, 101, 20.1F, -5.86F, 45.12F, 1, 1, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 162, 69, 20.5F, -5.86F, 45.12F, 1, 1, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 129, 122, 22.0F, -5.66F, 38.42F, 1, 2, 2, -0.301F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 64, 0, 20.2F, -5.8F, 8.5F, 1, 4, 2, -0.3F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 52, 42, 21.1F, -5.9F, 8.5F, 1, 2, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 138, 139, 22.0F, -5.0F, 8.1F, 1, 3, 1, -0.3F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 129, 139, 20.2F, -5.0F, 8.1F, 1, 3, 1, -0.3F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 155, 142, 20.6F, -4.8F, 8.4F, 2, 1, 2, -0.201F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 108, 154, 20.6F, -3.8F, 8.4F, 2, 1, 2, -0.201F, false));

		cube_r87 = new ModelRenderer(this);
		cube_r87.setRotationPoint(-0.4F, -1.66F, 35.22F);
		ironsights2.addChild(cube_r87);
		setRotationAngle(cube_r87, -0.5236F, 0.0F, 0.0F);
		cube_r87.cubeList.add(new ModelBox(cube_r87, 102, 122, 22.4F, -5.9543F, 2.0935F, 1, 2, 3, -0.302F, false));
		cube_r87.cubeList.add(new ModelBox(cube_r87, 86, 122, 20.6F, -5.9543F, 2.0935F, 1, 2, 3, -0.302F, false));

		cube_r88 = new ModelRenderer(this);
		cube_r88.setRotationPoint(-2.7F, -1.36F, 40.72F);
		ironsights2.addChild(cube_r88);
		setRotationAngle(cube_r88, 0.3665F, 0.0F, 0.0F);
		cube_r88.cubeList.add(new ModelBox(cube_r88, 185, 87, 22.7F, -2.3567F, 4.6669F, 1, 1, 1, -0.15F, false));
		cube_r88.cubeList.add(new ModelBox(cube_r88, 48, 191, 23.0F, -2.3567F, 4.6669F, 1, 1, 1, -0.151F, false));
		cube_r88.cubeList.add(new ModelBox(cube_r88, 192, 151, 24.6F, -2.3567F, 4.6669F, 1, 1, 1, -0.151F, false));
		cube_r88.cubeList.add(new ModelBox(cube_r88, 191, 21, 24.9F, -2.3567F, 4.6669F, 1, 1, 1, -0.15F, false));

		cube_r89 = new ModelRenderer(this);
		cube_r89.setRotationPoint(-0.4F, -1.16F, 33.92F);
		ironsights2.addChild(cube_r89);
		setRotationAngle(cube_r89, 0.3665F, 0.0F, 0.0F);
		cube_r89.cubeList.add(new ModelBox(cube_r89, 138, 173, 20.5F, -1.9984F, 5.6005F, 3, 1, 1, -0.1F, false));

		cube_r90 = new ModelRenderer(this);
		cube_r90.setRotationPoint(-0.8F, -0.6F, 32.9F);
		ironsights2.addChild(cube_r90);
		setRotationAngle(cube_r90, -0.7156F, 0.0F, 0.0F);
		cube_r90.cubeList.add(new ModelBox(cube_r90, 86, 32, 21.4F, -6.7071F, 0.9706F, 2, 1, 1, -0.302F, false));
		cube_r90.cubeList.add(new ModelBox(cube_r90, 57, 98, 22.8F, -7.7071F, 0.9706F, 1, 2, 2, -0.302F, false));
		cube_r90.cubeList.add(new ModelBox(cube_r90, 74, 93, 21.0F, -7.7071F, 0.9706F, 1, 2, 2, -0.302F, false));
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