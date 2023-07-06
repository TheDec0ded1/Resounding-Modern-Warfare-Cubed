package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SR2M extends ModelWithAttachments {
	private final ModelRenderer topcover;
	private final ModelRenderer gun118;
	private final ModelRenderer gun120;
	private final ModelRenderer gun123;
	private final ModelRenderer gun119;
	private final ModelRenderer gun121;
	private final ModelRenderer gun142;
	private final ModelRenderer gun116;
	private final ModelRenderer gun186;
	private final ModelRenderer gun158;
	private final ModelRenderer gun162;
	private final ModelRenderer gun182;
	private final ModelRenderer gun181;
	private final ModelRenderer gun157;
	private final ModelRenderer gun161;
	private final ModelRenderer gun160;
	private final ModelRenderer gun156;
	private final ModelRenderer gun155;
	private final ModelRenderer gun159;
	private final ModelRenderer gun163;
	private final ModelRenderer gun164;
	private final ModelRenderer gun146;
	private final ModelRenderer gun150;
	private final ModelRenderer gun154;
	private final ModelRenderer gun145;
	private final ModelRenderer gun149;
	private final ModelRenderer gun153;
	private final ModelRenderer gun144;
	private final ModelRenderer gun148;
	private final ModelRenderer gun152;
	private final ModelRenderer gun143;
	private final ModelRenderer gun147;
	private final ModelRenderer gun151;
	private final ModelRenderer gun117;
	private final ModelRenderer gun128;
	private final ModelRenderer gun130;
	private final ModelRenderer gun129;
	private final ModelRenderer gun126;
	private final ModelRenderer gun124;
	private final ModelRenderer gun125;
	private final ModelRenderer gun127;
	private final ModelRenderer gun139;
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
	private final ModelRenderer ironsights;
	private final ModelRenderer ironsights_r5;
	private final ModelRenderer ironsights_r6;
	private final ModelRenderer cube_r42;
	private final ModelRenderer cube_r43;
	private final ModelRenderer cube_r44;
	private final ModelRenderer cube_r45;
	private final ModelRenderer bone;
	private final ModelRenderer ironsights_r1;
	private final ModelRenderer ironsights_r2;
	private final ModelRenderer bone2;
	private final ModelRenderer ironsights_r3;
	private final ModelRenderer ironsights_r4;
	private final ModelRenderer gun4;

	public SR2M() {
		textureWidth = 256;
		textureHeight = 256;

		topcover = new ModelRenderer(this);
		topcover.setRotationPoint(0.0F, 26.25F, 15.5F);
		

		gun118 = new ModelRenderer(this);
		gun118.setRotationPoint(-1.0F, -39.2F, -26.5F);
		topcover.addChild(gun118);
		setRotationAngle(gun118, 0.0F, 0.0F, 0.4461F);
		gun118.cubeList.add(new ModelBox(gun118, 154, 102, 0.0F, 0.0F, 6.31F, 1, 1, 21, 0.0F, false));
		gun118.cubeList.add(new ModelBox(gun118, 201, 110, 0.0F, 0.0F, 27.01F, 1, 1, 4, 0.0F, false));

		gun120 = new ModelRenderer(this);
		gun120.setRotationPoint(-0.1F, -38.75F, -26.5F);
		topcover.addChild(gun120);
		setRotationAngle(gun120, 0.0F, 0.0F, 1.1897F);
		gun120.cubeList.add(new ModelBox(gun120, 195, 148, 0.0F, 0.0F, 7.0F, 1, 1, 21, 0.0F, false));
		gun120.cubeList.add(new ModelBox(gun120, 213, 166, 0.0F, 0.0F, 28.0F, 1, 1, 3, 0.0F, false));
		gun120.cubeList.add(new ModelBox(gun120, 215, 168, 0.0F, 0.0F, 6.3F, 1, 1, 1, 0.0F, false));

		gun123 = new ModelRenderer(this);
		gun123.setRotationPoint(0.25F, -37.8F, -26.5F);
		topcover.addChild(gun123);
		setRotationAngle(gun123, 0.0F, 0.0F, 1.45F);
		gun123.cubeList.add(new ModelBox(gun123, 82, 145, 0.0F, 0.0F, 7.0F, 3, 1, 21, 0.0F, false));
		gun123.cubeList.add(new ModelBox(gun123, 100, 163, 0.0F, 0.0F, 28.0F, 3, 1, 3, 0.0F, false));
		gun123.cubeList.add(new ModelBox(gun123, 102, 165, 0.0F, 0.0F, 6.3F, 3, 1, 1, 0.0F, false));

		gun119 = new ModelRenderer(this);
		gun119.setRotationPoint(-2.0F, -39.2F, -26.5F);
		topcover.addChild(gun119);
		setRotationAngle(gun119, 0.0F, 0.0F, 1.0782F);
		gun119.cubeList.add(new ModelBox(gun119, 197, 175, 0.0F, 0.0F, 7.01F, 1, 1, 21, 0.0F, false));
		gun119.cubeList.add(new ModelBox(gun119, 215, 193, 0.0F, 0.0F, 28.01F, 1, 1, 3, 0.0F, false));
		gun119.cubeList.add(new ModelBox(gun119, 217, 195, 0.0F, 0.0F, 6.31F, 1, 1, 1, 0.0F, false));

		gun121 = new ModelRenderer(this);
		gun121.setRotationPoint(-2.9F, -38.7F, -26.5F);
		topcover.addChild(gun121);
		setRotationAngle(gun121, 0.0F, 0.0F, 0.3346F);
		gun121.cubeList.add(new ModelBox(gun121, 148, 196, 0.0F, 0.0F, 7.0F, 1, 1, 21, 0.0F, false));
		gun121.cubeList.add(new ModelBox(gun121, 166, 214, 0.0F, 0.0F, 28.0F, 1, 1, 3, 0.0F, false));
		gun121.cubeList.add(new ModelBox(gun121, 168, 216, 0.0F, 0.0F, 6.3F, 1, 1, 1, 0.0F, false));

		gun142 = new ModelRenderer(this);
		gun142.setRotationPoint(-3.2F, -37.8F, -14.5F);
		topcover.addChild(gun142);
		setRotationAngle(gun142, 0.0F, 0.0F, 0.1487F);
		gun142.cubeList.add(new ModelBox(gun142, 220, 170, 0.0F, 0.0F, 1.0F, 1, 1, 15, 0.0F, false));
		gun142.cubeList.add(new ModelBox(gun142, 0, 155, 0.0F, 0.5F, 0.0F, 1, 1, 6, -0.001F, false));
		gun142.cubeList.add(new ModelBox(gun142, 234, 184, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun142.cubeList.add(new ModelBox(gun142, 48, 20, 0.0F, 1.0F, 6.0F, 1, 2, 10, 0.0F, false));
		gun142.cubeList.add(new ModelBox(gun142, 232, 182, 0.0F, 0.0F, 16.0F, 1, 1, 3, 0.0F, false));
		gun142.cubeList.add(new ModelBox(gun142, 55, 27, 0.0F, 1.0F, 16.0F, 1, 2, 3, 0.0F, false));
		gun142.cubeList.add(new ModelBox(gun142, 56, 28, 0.0F, 1.0F, -5.7F, 1, 2, 2, 0.0F, false));
		gun142.cubeList.add(new ModelBox(gun142, 233, 183, 0.0F, 0.0F, -5.7F, 1, 1, 2, 0.0F, false));

		gun116 = new ModelRenderer(this);
		gun116.setRotationPoint(-2.0F, -39.2F, -26.5F);
		topcover.addChild(gun116);
		gun116.cubeList.add(new ModelBox(gun116, 176, 202, 0.0F, 0.0F, 7.0F, 1, 1, 21, 0.0F, false));
		gun116.cubeList.add(new ModelBox(gun116, 194, 220, 0.0F, 0.0F, 28.0F, 1, 1, 3, 0.0F, false));
		gun116.cubeList.add(new ModelBox(gun116, 196, 222, 0.0F, 0.0F, 6.3F, 1, 1, 1, 0.0F, false));

		gun186 = new ModelRenderer(this);
		gun186.setRotationPoint(-2.0F, -39.35F, -4.5F);
		topcover.addChild(gun186);
		

		gun158 = new ModelRenderer(this);
		gun158.setRotationPoint(-2.0F, -39.3F, -6.5F);
		topcover.addChild(gun158);
		setRotationAngle(gun158, 0.0F, 0.0F, 1.0782F);
		gun158.cubeList.add(new ModelBox(gun158, 46, 163, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun158.cubeList.add(new ModelBox(gun158, 46, 163, 0.0F, 0.0F, 5.5F, 1, 1, 1, 0.0F, false));

		gun162 = new ModelRenderer(this);
		gun162.setRotationPoint(-2.9F, -38.8F, -6.5F);
		topcover.addChild(gun162);
		setRotationAngle(gun162, 0.0F, 0.0F, 0.3346F);
		gun162.cubeList.add(new ModelBox(gun162, 163, 2, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun162.cubeList.add(new ModelBox(gun162, 163, 2, 0.0F, 0.0F, 5.5F, 1, 1, 1, 0.0F, false));

		gun182 = new ModelRenderer(this);
		gun182.setRotationPoint(-3.25F, -37.9F, -6.5F);
		topcover.addChild(gun182);
		setRotationAngle(gun182, 0.0F, 0.0F, 0.1487F);
		gun182.cubeList.add(new ModelBox(gun182, 0, 67, 0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));
		gun182.cubeList.add(new ModelBox(gun182, 0, 67, 0.0F, 0.0F, 5.5F, 1, 3, 1, 0.0F, false));

		gun181 = new ModelRenderer(this);
		gun181.setRotationPoint(-3.25F, -37.9F, -12.5F);
		topcover.addChild(gun181);
		setRotationAngle(gun181, 0.0F, 0.0F, 0.1487F);
		gun181.cubeList.add(new ModelBox(gun181, 162, 97, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun181.cubeList.add(new ModelBox(gun181, 8, 159, 0.0F, 0.5F, 0.0F, 1, 1, 1, -0.001F, false));

		gun157 = new ModelRenderer(this);
		gun157.setRotationPoint(-2.0F, -39.3F, -12.5F);
		topcover.addChild(gun157);
		setRotationAngle(gun157, 0.0F, 0.0F, 1.0782F);
		gun157.cubeList.add(new ModelBox(gun157, 98, 163, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun161 = new ModelRenderer(this);
		gun161.setRotationPoint(-2.9F, -38.8F, -12.5F);
		topcover.addChild(gun161);
		setRotationAngle(gun161, 0.0F, 0.0F, 0.3346F);
		gun161.cubeList.add(new ModelBox(gun161, 163, 5, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun160 = new ModelRenderer(this);
		gun160.setRotationPoint(-2.9F, -38.8F, -18.5F);
		topcover.addChild(gun160);
		setRotationAngle(gun160, 0.0F, 0.0F, 0.3346F);
		gun160.cubeList.add(new ModelBox(gun160, 163, 7, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun156 = new ModelRenderer(this);
		gun156.setRotationPoint(-2.0F, -39.3F, -18.5F);
		topcover.addChild(gun156);
		setRotationAngle(gun156, 0.0F, 0.0F, 1.0782F);
		gun156.cubeList.add(new ModelBox(gun156, 163, 146, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun155 = new ModelRenderer(this);
		gun155.setRotationPoint(-2.0F, -39.3F, -24.5F);
		topcover.addChild(gun155);
		setRotationAngle(gun155, 0.0F, 0.0F, 1.0782F);
		

		gun159 = new ModelRenderer(this);
		gun159.setRotationPoint(-2.9F, -38.8F, -24.5F);
		topcover.addChild(gun159);
		setRotationAngle(gun159, 0.0F, 0.0F, 0.3346F);
		

		gun163 = new ModelRenderer(this);
		gun163.setRotationPoint(-2.5F, -38.3F, -26.5F);
		topcover.addChild(gun163);
		setRotationAngle(gun163, 0.0F, 0.0F, 1.041F);
		

		gun164 = new ModelRenderer(this);
		gun164.setRotationPoint(-3.75F, -36.9F, -14.5F);
		topcover.addChild(gun164);
		setRotationAngle(gun164, -0.0873F, 0.0F, 0.0F);
		

		gun146 = new ModelRenderer(this);
		gun146.setRotationPoint(-1.0F, -39.3F, -6.5F);
		topcover.addChild(gun146);
		setRotationAngle(gun146, 0.0F, 0.0F, 0.4461F);
		gun146.cubeList.add(new ModelBox(gun146, 9, 164, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun146.cubeList.add(new ModelBox(gun146, 9, 164, 0.0F, 0.0F, 5.5F, 1, 1, 1, 0.0F, false));

		gun150 = new ModelRenderer(this);
		gun150.setRotationPoint(-0.1F, -38.9F, -6.5F);
		topcover.addChild(gun150);
		setRotationAngle(gun150, 0.0F, 0.0F, 1.1897F);
		gun150.cubeList.add(new ModelBox(gun150, 163, 150, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun150.cubeList.add(new ModelBox(gun150, 163, 150, 0.0F, 0.0F, 5.5F, 1, 1, 1, 0.0F, false));

		gun154 = new ModelRenderer(this);
		gun154.setRotationPoint(0.3F, -37.95F, -6.5F);
		topcover.addChild(gun154);
		setRotationAngle(gun154, 0.0F, 0.0F, 1.45F);
		gun154.cubeList.add(new ModelBox(gun154, 68, 106, 0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));
		gun154.cubeList.add(new ModelBox(gun154, 68, 106, 0.0F, 0.0F, 5.5F, 3, 1, 1, 0.0F, false));

		gun145 = new ModelRenderer(this);
		gun145.setRotationPoint(-1.0F, -39.3F, -12.5F);
		topcover.addChild(gun145);
		setRotationAngle(gun145, 0.0F, 0.0F, 0.4461F);
		gun145.cubeList.add(new ModelBox(gun145, 17, 164, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun149 = new ModelRenderer(this);
		gun149.setRotationPoint(-0.1F, -38.9F, -12.5F);
		topcover.addChild(gun149);
		setRotationAngle(gun149, 0.0F, 0.0F, 1.1897F);
		gun149.cubeList.add(new ModelBox(gun149, 163, 153, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun153 = new ModelRenderer(this);
		gun153.setRotationPoint(0.3F, -37.95F, -12.5F);
		topcover.addChild(gun153);
		setRotationAngle(gun153, 0.0F, 0.0F, 1.45F);
		gun153.cubeList.add(new ModelBox(gun153, 0, 109, 0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun144 = new ModelRenderer(this);
		gun144.setRotationPoint(-1.0F, -39.3F, -18.5F);
		topcover.addChild(gun144);
		setRotationAngle(gun144, 0.0F, 0.0F, 0.4461F);
		gun144.cubeList.add(new ModelBox(gun144, 164, 23, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun148 = new ModelRenderer(this);
		gun148.setRotationPoint(-0.1F, -38.9F, -18.5F);
		topcover.addChild(gun148);
		setRotationAngle(gun148, 0.0F, 0.0F, 1.1897F);
		gun148.cubeList.add(new ModelBox(gun148, 154, 163, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun152 = new ModelRenderer(this);
		gun152.setRotationPoint(0.3F, -37.95F, -18.5F);
		topcover.addChild(gun152);
		setRotationAngle(gun152, 0.0F, 0.0F, 1.45F);
		gun152.cubeList.add(new ModelBox(gun152, 116, 60, 0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun143 = new ModelRenderer(this);
		gun143.setRotationPoint(-1.0F, -39.3F, -24.5F);
		topcover.addChild(gun143);
		setRotationAngle(gun143, 0.0F, 0.0F, 0.4461F);
		

		gun147 = new ModelRenderer(this);
		gun147.setRotationPoint(-0.1F, -38.9F, -24.5F);
		topcover.addChild(gun147);
		setRotationAngle(gun147, 0.0F, 0.0F, 1.1897F);
		

		gun151 = new ModelRenderer(this);
		gun151.setRotationPoint(0.3F, -37.95F, -24.5F);
		topcover.addChild(gun151);
		setRotationAngle(gun151, 0.0F, 0.0F, 1.45F);
		

		gun117 = new ModelRenderer(this);
		gun117.setRotationPoint(-0.05F, -35.7F, -26.5F);
		topcover.addChild(gun117);
		setRotationAngle(gun117, 0.0F, 0.0F, 0.7436F);
		gun117.cubeList.add(new ModelBox(gun117, 167, 169, 0.0F, 0.0F, 6.99F, 1, 1, 21, 0.0F, false));
		gun117.cubeList.add(new ModelBox(gun117, 185, 187, 0.0F, 0.0F, 27.99F, 1, 1, 3, 0.0F, false));

		gun128 = new ModelRenderer(this);
		gun128.setRotationPoint(-2.0F, -39.2F, -0.5F);
		topcover.addChild(gun128);
		setRotationAngle(gun128, -0.8378F, 0.0F, 0.0F);
		

		gun130 = new ModelRenderer(this);
		gun130.setRotationPoint(-2.5F, -39.0F, -0.3F);
		topcover.addChild(gun130);
		setRotationAngle(gun130, -0.8378F, 0.0F, 0.0F);
		

		gun129 = new ModelRenderer(this);
		gun129.setRotationPoint(-3.0F, -38.5F, 0.15F);
		topcover.addChild(gun129);
		setRotationAngle(gun129, -0.8378F, 0.0F, 0.0F);
		

		gun126 = new ModelRenderer(this);
		gun126.setRotationPoint(0.3F, -37.0F, 0.5F);
		topcover.addChild(gun126);
		setRotationAngle(gun126, 0.0F, 0.0F, 1.4128F);
		

		gun124 = new ModelRenderer(this);
		gun124.setRotationPoint(-3.3F, -37.0F, 0.5F);
		topcover.addChild(gun124);
		gun124.cubeList.add(new ModelBox(gun124, 9, 108, 0.0F, 0.0F, 0.02F, 3, 2, 1, 0.0F, false));
		gun124.cubeList.add(new ModelBox(gun124, 9, 108, 0.0F, 0.0F, 3.02F, 3, 2, 1, 0.0F, false));

		gun125 = new ModelRenderer(this);
		gun125.setRotationPoint(-0.7F, -37.0F, 0.5F);
		topcover.addChild(gun125);
		gun125.cubeList.add(new ModelBox(gun125, 0, 82, 0.0F, 0.0F, 0.01F, 1, 2, 1, 0.0F, false));
		gun125.cubeList.add(new ModelBox(gun125, 0, 82, 0.0F, 0.0F, 3.01F, 1, 2, 1, 0.0F, false));

		gun127 = new ModelRenderer(this);
		gun127.setRotationPoint(-3.3F, -37.0F, 0.5F);
		topcover.addChild(gun127);
		setRotationAngle(gun127, 0.0F, 0.0F, 0.1745F);
		

		gun139 = new ModelRenderer(this);
		gun139.setRotationPoint(-3.75F, -36.4F, -8.55F);
		topcover.addChild(gun139);
		setRotationAngle(gun139, -0.8179F, 0.0F, 0.0F);
		

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 26.0F, 3.0F);
		

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
		gun137.cubeList.add(new ModelBox(gun137, 164, 80, 0.0F, -13.0935F, 9.2263F, 1, 1, 1, 0.0F, false));

		gun136 = new ModelRenderer(this);
		gun136.setRotationPoint(-1.7F, -38.7F, -0.1F);
		gun.addChild(gun136);
		setRotationAngle(gun136, -0.409F, 0.0F, 0.0F);
		gun136.cubeList.add(new ModelBox(gun136, 164, 82, 0.0F, -4.4819F, 12.226F, 1, 1, 1, 0.0F, false));

		gun135 = new ModelRenderer(this);
		gun135.setRotationPoint(-2.3F, -38.3F, 0.85F);
		gun.addChild(gun135);
		setRotationAngle(gun135, -1.0038F, 0.0F, 0.0F);
		gun135.cubeList.add(new ModelBox(gun135, 164, 87, 0.0F, -13.0935F, 9.2263F, 1, 1, 1, 0.0F, false));

		gun134 = new ModelRenderer(this);
		gun134.setRotationPoint(-2.3F, -38.7F, -0.1F);
		gun.addChild(gun134);
		setRotationAngle(gun134, -0.409F, 0.0F, 0.0F);
		gun134.cubeList.add(new ModelBox(gun134, 151, 164, 0.0F, -4.4819F, 12.226F, 1, 1, 1, 0.0F, false));

		gun133 = new ModelRenderer(this);
		gun133.setRotationPoint(-2.0F, -38.35F, 1.12F);
		gun.addChild(gun133);
		setRotationAngle(gun133, -1.1897F, 0.0F, 0.0F);
		gun133.cubeList.add(new ModelBox(gun133, 165, 32, 0.0F, -14.5732F, 6.6472F, 1, 1, 1, 0.0F, false));

		gun132 = new ModelRenderer(this);
		gun132.setRotationPoint(-2.0F, -38.9F, 0.3F);
		gun.addChild(gun132);
		setRotationAngle(gun132, -0.5949F, 0.0F, 0.0F);
		gun132.cubeList.add(new ModelBox(gun132, 165, 34, 0.0F, -8.3457F, 13.6716F, 1, 1, 1, 0.0F, false));

		gun131 = new ModelRenderer(this);
		gun131.setRotationPoint(-2.0F, -38.4F, -0.6F);
		gun.addChild(gun131);
		setRotationAngle(gun131, 0.5205F, 0.0F, 0.0F);
		gun131.cubeList.add(new ModelBox(gun131, 165, 36, 0.0F, 7.1158F, 10.9054F, 1, 1, 1, 0.0F, false));

		gun122 = new ModelRenderer(this);
		gun122.setRotationPoint(-3.75F, -35.2F, -26.5F);
		gun.addChild(gun122);
		

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
		gun79.cubeList.add(new ModelBox(gun79, 0, 92, 0.0F, 0.0F, 12.01F, 1, 4, 19, 0.0F, false));
		gun79.cubeList.add(new ModelBox(gun79, 15, 108, 0.0F, 0.0F, 31.01F, 1, 4, 3, 0.0F, false));

		gun78 = new ModelRenderer(this);
		gun78.setRotationPoint(-0.4F, -35.0F, -26.5F);
		gun.addChild(gun78);
		

		gun77 = new ModelRenderer(this);
		gun77.setRotationPoint(-0.6F, -31.6F, -7.5F);
		gun.addChild(gun77);
		

		gun76 = new ModelRenderer(this);
		gun76.setRotationPoint(-3.4F, -28.3F, -19.5F);
		gun.addChild(gun76);
		

		gun75 = new ModelRenderer(this);
		gun75.setRotationPoint(-0.6F, -28.3F, -19.5F);
		gun.addChild(gun75);
		

		gun74 = new ModelRenderer(this);
		gun74.setRotationPoint(-3.4F, -27.8F, -19.0F);
		gun.addChild(gun74);
		

		gun73 = new ModelRenderer(this);
		gun73.setRotationPoint(-0.6F, -27.8F, -19.0F);
		gun.addChild(gun73);
		

		gun72 = new ModelRenderer(this);
		gun72.setRotationPoint(-0.6F, -29.0F, -23.0F);
		gun.addChild(gun72);
		

		gun71 = new ModelRenderer(this);
		gun71.setRotationPoint(-3.4F, -29.0F, -23.0F);
		gun.addChild(gun71);
		

		gun70 = new ModelRenderer(this);
		gun70.setRotationPoint(-3.4F, -28.8F, -22.5F);
		gun.addChild(gun70);
		

		gun69 = new ModelRenderer(this);
		gun69.setRotationPoint(-0.6F, -28.8F, -22.5F);
		gun.addChild(gun69);
		

		gun68 = new ModelRenderer(this);
		gun68.setRotationPoint(-3.5F, -26.25F, -17.5F);
		gun.addChild(gun68);
		setRotationAngle(gun68, 1.3013F, 0.0F, 0.0F);
		

		gun67 = new ModelRenderer(this);
		gun67.setRotationPoint(-3.5F, -28.8F, -26.5F);
		gun.addChild(gun67);
		setRotationAngle(gun67, 1.3013F, 0.0F, 0.0F);
		

		gun66 = new ModelRenderer(this);
		gun66.setRotationPoint(-3.4F, -30.2F, -14.5F);
		gun.addChild(gun66);
		setRotationAngle(gun66, 2.3051F, 0.0F, 0.0F);
		

		gun65 = new ModelRenderer(this);
		gun65.setRotationPoint(-3.4F, -31.2F, -16.5F);
		gun.addChild(gun65);
		

		gun64 = new ModelRenderer(this);
		gun64.setRotationPoint(-0.6F, -30.9F, -15.1F);
		gun.addChild(gun64);
		setRotationAngle(gun64, -2.4166F, 0.0F, 0.0F);
		

		gun63 = new ModelRenderer(this);
		gun63.setRotationPoint(-3.4F, -31.9F, -15.5F);
		gun.addChild(gun63);
		setRotationAngle(gun63, -1.7299F, 0.0F, 0.0F);
		

		gun62 = new ModelRenderer(this);
		gun62.setRotationPoint(-0.6F, -31.9F, -15.5F);
		gun.addChild(gun62);
		setRotationAngle(gun62, -1.7299F, 0.0F, 0.0F);
		

		gun61 = new ModelRenderer(this);
		gun61.setRotationPoint(-3.3F, -30.0F, -7.0F);
		gun.addChild(gun61);
		

		gun60 = new ModelRenderer(this);
		gun60.setRotationPoint(-0.7F, -30.0F, -7.0F);
		gun.addChild(gun60);
		

		gun59 = new ModelRenderer(this);
		gun59.setRotationPoint(-3.4F, -31.8F, -26.5F);
		gun.addChild(gun59);
		

		gun58 = new ModelRenderer(this);
		gun58.setRotationPoint(-0.6F, -31.8F, -26.5F);
		gun.addChild(gun58);
		

		gun52 = new ModelRenderer(this);
		gun52.setRotationPoint(-3.2F, -35.0F, -0.6F);
		gun.addChild(gun52);
		gun52.cubeList.add(new ModelBox(gun52, 130, 0, 0.0F, 0.0F, 15.0F, 3, 5, 3, 0.0F, false));

		gun51 = new ModelRenderer(this);
		gun51.setRotationPoint(-0.8F, -35.0F, -0.6F);
		gun.addChild(gun51);
		gun51.cubeList.add(new ModelBox(gun51, 49, 32, 0.0F, 0.0F, 15.0F, 1, 5, 3, 0.001F, false));

		gun50 = new ModelRenderer(this);
		gun50.setRotationPoint(-3.3F, -30.8F, -7.7F);
		gun.addChild(gun50);
		setRotationAngle(gun50, 0.0F, 0.0F, -0.3961F);
		

		gun49 = new ModelRenderer(this);
		gun49.setRotationPoint(0.3F, -30.8F, -7.7F);
		gun.addChild(gun49);
		setRotationAngle(gun49, 0.0F, 0.0F, 1.9705F);
		

		gun48 = new ModelRenderer(this);
		gun48.setRotationPoint(-0.6F, -31.8F, -16.5F);
		gun.addChild(gun48);
		

		gun47 = new ModelRenderer(this);
		gun47.setRotationPoint(-3.4F, -31.8F, -16.5F);
		gun.addChild(gun47);
		

		gun46 = new ModelRenderer(this);
		gun46.setRotationPoint(-2.5F, -30.0F, -7.7F);
		gun.addChild(gun46);
		

		gun45 = new ModelRenderer(this);
		gun45.setRotationPoint(-3.1F, -31.0F, -7.7F);
		gun.addChild(gun45);
		

		gun44 = new ModelRenderer(this);
		gun44.setRotationPoint(-0.9F, -31.0F, -7.7F);
		gun.addChild(gun44);
		

		gun43 = new ModelRenderer(this);
		gun43.setRotationPoint(0.4F, -30.6F, -7.5F);
		gun.addChild(gun43);
		setRotationAngle(gun43, 0.0F, 0.0F, 2.2679F);
		

		gun42 = new ModelRenderer(this);
		gun42.setRotationPoint(-3.4F, -30.6F, -7.5F);
		gun.addChild(gun42);
		setRotationAngle(gun42, 0.0F, 0.0F, -0.6692F);
		

		gun41 = new ModelRenderer(this);
		gun41.setRotationPoint(-3.4F, -31.6F, -7.5F);
		gun.addChild(gun41);
		

		gun40 = new ModelRenderer(this);
		gun40.setRotationPoint(-3.3F, -30.2F, -3.0F);
		gun.addChild(gun40);
		setRotationAngle(gun40, -0.7436F, 0.0F, 0.0F);
		

		gun39 = new ModelRenderer(this);
		gun39.setRotationPoint(-0.7F, -30.2F, -3.0F);
		gun.addChild(gun39);
		setRotationAngle(gun39, -0.7436F, 0.0F, 0.0F);
		

		gun38 = new ModelRenderer(this);
		gun38.setRotationPoint(-2.5F, -25.7F, -14.8F);
		gun.addChild(gun38);
		setRotationAngle(gun38, -1.45F, 0.0F, 0.0F);
		

		gun37 = new ModelRenderer(this);
		gun37.setRotationPoint(-3.0F, -30.5F, -14.5F);
		gun.addChild(gun37);
		setRotationAngle(gun37, 2.3051F, 0.0F, 0.0F);
		

		gun36 = new ModelRenderer(this);
		gun36.setRotationPoint(-0.9F, -27.5F, -16.0F);
		gun.addChild(gun36);
		

		gun35 = new ModelRenderer(this);
		gun35.setRotationPoint(-0.9F, -29.4F, -15.5F);
		gun.addChild(gun35);
		setRotationAngle(gun35, -0.7064F, 0.0F, 0.0F);
		

		gun34 = new ModelRenderer(this);
		gun34.setRotationPoint(-3.1F, -28.5F, -16.0F);
		gun.addChild(gun34);
		

		gun33 = new ModelRenderer(this);
		gun33.setRotationPoint(-2.5F, -26.0F, -16.2F);
		gun.addChild(gun33);
		setRotationAngle(gun33, 0.5949F, 0.0F, 0.0F);
		

		gun32 = new ModelRenderer(this);
		gun32.setRotationPoint(-2.5F, -31.0F, -8.5F);
		gun.addChild(gun32);
		setRotationAngle(gun32, 0.9666F, 0.0F, 0.0F);
		

		gun31 = new ModelRenderer(this);
		gun31.setRotationPoint(-2.5F, -29.2F, -7.8F);
		gun.addChild(gun31);
		setRotationAngle(gun31, -0.2231F, 0.0F, 0.0F);
		

		gun29 = new ModelRenderer(this);
		gun29.setRotationPoint(-3.2F, -31.5F, -3.6F);
		gun.addChild(gun29);
		

		gun28 = new ModelRenderer(this);
		gun28.setRotationPoint(-0.8F, -31.5F, -3.6F);
		gun.addChild(gun28);
		

		gun22 = new ModelRenderer(this);
		gun22.setRotationPoint(-3.0F, -31.5F, -5.3F);
		gun.addChild(gun22);
		

		gun21 = new ModelRenderer(this);
		gun21.setRotationPoint(-3.2F, -26.5F, -4.3F);
		gun.addChild(gun21);
		setRotationAngle(gun21, 2.8256F, 0.0F, 0.0F);
		

		gun20 = new ModelRenderer(this);
		gun20.setRotationPoint(-0.8F, -26.5F, -4.3F);
		gun.addChild(gun20);
		setRotationAngle(gun20, 2.8256F, 0.0F, 0.0F);
		

		gun17 = new ModelRenderer(this);
		gun17.setRotationPoint(-3.0F, -26.8F, -7.4F);
		gun.addChild(gun17);
		

		gun16 = new ModelRenderer(this);
		gun16.setRotationPoint(-0.8F, -26.5F, -5.5F);
		gun.addChild(gun16);
		setRotationAngle(gun16, 2.8256F, 0.0F, 0.0F);
		

		gun15 = new ModelRenderer(this);
		gun15.setRotationPoint(-3.2F, -26.5F, -5.5F);
		gun.addChild(gun15);
		setRotationAngle(gun15, 2.8256F, 0.0F, 0.0F);
		

		gun9 = new ModelRenderer(this);
		gun9.setRotationPoint(-0.5F, -35.0F, -26.5F);
		gun.addChild(gun9);
		gun9.cubeList.add(new ModelBox(gun9, 146, 0, 0.0F, 0.0F, 12.0F, 1, 4, 28, 0.0F, false));

		gun8 = new ModelRenderer(this);
		gun8.setRotationPoint(-3.4F, -35.0F, -26.5F);
		gun.addChild(gun8);
		gun8.cubeList.add(new ModelBox(gun8, 145, 92, 0.0F, 0.0F, 12.0F, 3, 4, 28, 0.0F, false));
		gun8.cubeList.add(new ModelBox(gun8, 170, 117, 0.0F, 0.0F, 40.0F, 3, 4, 3, 0.0F, false));

		gun7 = new ModelRenderer(this);
		gun7.setRotationPoint(-3.0F, -32.0F, -16.5F);
		gun.addChild(gun7);
		

		gun6 = new ModelRenderer(this);
		gun6.setRotationPoint(-2.5F, -27.0F, -14.5F);
		gun.addChild(gun6);
		

		gun5 = new ModelRenderer(this);
		gun5.setRotationPoint(-0.8F, -31.0F, -7.5F);
		gun.addChild(gun5);
		

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(-3.9F, -33.0F, -8.5F);
		gun.addChild(bone23);
		setRotationAngle(bone23, 0.5061F, 0.0F, 0.0F);
		

		gun166 = new ModelRenderer(this);
		gun166.setRotationPoint(0.0F, -3.0F, -7.0F);
		bone23.addChild(gun166);
		setRotationAngle(gun166, -0.0873F, 0.0F, 0.0F);
		gun166.cubeList.add(new ModelBox(gun166, 0, 115, 0.0F, 5.2866F, 11.8765F, 1, 1, 7, 0.0F, false));

		gun180 = new ModelRenderer(this);
		gun180.setRotationPoint(-0.1F, -1.85F, 0.0F);
		bone23.addChild(gun180);
		setRotationAngle(gun180, -1.7474F, 0.0F, 0.0F);
		gun180.cubeList.add(new ModelBox(gun180, 107, 55, 0.0F, -12.3007F, 4.2064F, 1, 5, 1, 0.0F, false));

		gun170 = new ModelRenderer(this);
		gun170.setRotationPoint(0.0F, 2.2F, 0.4F);
		bone23.addChild(gun170);
		setRotationAngle(gun170, 2.6397F, 0.0F, 0.0F);
		gun170.cubeList.add(new ModelBox(gun170, 124, 32, -0.001F, -0.0547F, -12.9999F, 1, 1, 8, 0.0F, false));

		gun171 = new ModelRenderer(this);
		gun171.setRotationPoint(0.0F, -2.0F, -7.0F);
		bone23.addChild(gun171);
		setRotationAngle(gun171, 0.9666F, 0.0F, 0.0F);
		gun171.cubeList.add(new ModelBox(gun171, 78, 31, -0.001F, 12.3552F, 1.2037F, 1, 2, 1, 0.0F, false));

		gun168 = new ModelRenderer(this);
		gun168.setRotationPoint(0.0F, -0.3F, 1.9F);
		bone23.addChild(gun168);
		setRotationAngle(gun168, -1.8961F, 0.0F, 0.0F);
		gun168.cubeList.add(new ModelBox(gun168, 0, 46, 0.001F, -12.7881F, 2.3376F, 1, 4, 2, 0.0F, false));
		gun168.cubeList.add(new ModelBox(gun168, 10, 46, 0.001F, -8.7881F, 2.6376F, 1, 3, 1, 0.0F, false));

		gun167 = new ModelRenderer(this);
		gun167.setRotationPoint(0.0F, -2.45F, -0.1F);
		bone23.addChild(gun167);
		setRotationAngle(gun167, -0.8179F, 0.0F, 0.0F);
		gun167.cubeList.add(new ModelBox(gun167, 116, 111, 0.02F, -3.988F, 12.3732F, 1, 2, 3, 0.0F, false));

		gun179 = new ModelRenderer(this);
		gun179.setRotationPoint(-0.1F, -1.0F, 0.5F);
		bone23.addChild(gun179);
		setRotationAngle(gun179, -2.6025F, 0.0F, 0.0F);
		gun179.cubeList.add(new ModelBox(gun179, 162, 99, -0.001F, -11.2453F, -6.5226F, 1, 1, 1, 0.0F, false));

		gun169 = new ModelRenderer(this);
		gun169.setRotationPoint(0.0F, 1.7F, 1.3F);
		bone23.addChild(gun169);
		setRotationAngle(gun169, -2.6397F, 0.0F, 0.0F);
		gun169.cubeList.add(new ModelBox(gun169, 163, 0, 0.0F, -10.9949F, -6.9363F, 1, 1, 1, 0.0F, false));

		barrel = new ModelRenderer(this);
		barrel.setRotationPoint(-1.0F, -36.8F, -85.5F);
		gun.addChild(barrel);
		

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
		

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone13.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, 0.4363F);
		

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter3.addChild(bone14);
		setRotationAngle(bone14, 0.0F, 0.0F, 1.5708F);
		

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone14.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, 0.4363F);
		

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone14.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, -0.4363F);
		

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter3.addChild(bone15);
		setRotationAngle(bone15, 0.0F, 0.0F, -1.5708F);
		

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone15.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, -0.4363F);
		

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone15.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, 0.4363F);
		

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter3.addChild(bone16);
		

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone16.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, 0.4363F);
		

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone16.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.0F, -0.4363F);
		

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
		

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone17.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, 0.0F, 0.4363F);
		

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter4.addChild(bone18);
		setRotationAngle(bone18, 0.0F, 0.0F, 1.5708F);
		

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone18.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, 0.0F, 0.4363F);
		

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone18.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.0F, 0.0F, -0.4363F);
		

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter4.addChild(bone19);
		setRotationAngle(bone19, 0.0F, 0.0F, -1.5708F);
		

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone19.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.0F, 0.0F, -0.4363F);
		

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone19.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.0F, 0.0F, 0.4363F);
		

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter4.addChild(bone20);
		

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone20.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.0F, 0.0F, 0.4363F);
		

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone20.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.0F, 0.0F, -0.4363F);
		

		ironsights = new ModelRenderer(this);
		ironsights.setRotationPoint(1.0F, -1.2F, 1.5F);
		barrel.addChild(ironsights);
		ironsights.cubeList.add(new ModelBox(ironsights, 163, 109, -2.1F, -1.4F, 76.3F, 2, 3, 11, -0.3F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 164, 109, -2.9F, -1.4F, 76.3F, 2, 3, 11, -0.299F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 160, 106, -2.1F, -1.4F, 86.675F, 2, 3, 14, -0.3F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 161, 106, -2.9F, -1.4F, 86.675F, 2, 3, 14, -0.299F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 86, 73, -3.0F, -1.56F, 76.07F, 3, 2, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 86, 60, -3.0F, -1.76F, 76.07F, 3, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 86, 52, -3.0F, -1.96F, 76.07F, 3, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 161, 67, -1.4F, -2.16F, 76.07F, 1, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 161, 65, -1.6F, -2.16F, 76.07F, 1, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 161, 61, -1.7F, -2.16F, 76.07F, 1, 1, 1, -0.401F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 161, 45, -1.7F, -2.26F, 76.07F, 1, 1, 1, -0.402F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 161, 47, -1.6F, -2.26F, 76.07F, 1, 1, 1, -0.401F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 161, 51, -1.4F, -2.26F, 76.07F, 1, 1, 1, -0.401F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 161, 59, -1.2F, -2.16F, 76.07F, 1, 1, 1, -0.401F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 136, 159, -2.3F, -2.26F, 76.07F, 1, 1, 1, -0.402F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 159, 140, -2.4F, -2.26F, 76.07F, 1, 1, 1, -0.401F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 159, 142, -2.6F, -2.26F, 76.07F, 1, 1, 1, -0.401F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 160, 124, -2.8F, -2.16F, 76.07F, 1, 1, 1, -0.401F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 160, 126, -2.3F, -2.16F, 76.07F, 1, 1, 1, -0.401F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 128, 160, -2.4F, -2.16F, 76.07F, 1, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 161, 24, -2.6F, -2.16F, 76.07F, 1, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 1, 181, -1.1F, -2.7F, 54.8F, 1, 7, 2, -0.3F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 4, 183, -2.9F, -2.7F, 54.8F, 1, 7, 2, -0.3F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 1, 181, -1.1F, 4.3F, 54.8F, 1, 2, 2, -0.3F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 4, 183, -2.9F, 4.3F, 54.8F, 1, 2, 2, -0.3F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 65, 21, -2.0F, -2.2F, 54.6F, 1, 2, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 2, 185, -1.1F, -2.7F, 54.4F, 1, 7, 1, -0.3F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 121, 183, -2.9F, -2.7F, 54.4F, 1, 7, 1, -0.3F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 73, 81, -2.5F, -1.1F, 54.5F, 2, 1, 2, -0.201F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 2, 183, -2.5F, -0.5F, 54.6F, 2, 7, 2, -0.201F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 3, 184, -2.5F, 2.4F, 51.0F, 2, 6, 1, -0.201F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 115, 185, -2.5F, 2.4F, 52.6F, 2, 4, 3, -0.201F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 118, 185, -2.5F, 2.4F, 51.35F, 2, 4, 2, -0.201F, false));

		ironsights_r5 = new ModelRenderer(this);
		ironsights_r5.setRotationPoint(-1.5F, 5.821F, 52.361F);
		ironsights.addChild(ironsights_r5);
		setRotationAngle(ironsights_r5, -0.6981F, 0.0F, 0.0F);
		ironsights_r5.cubeList.add(new ModelBox(ironsights_r5, 3, 184, -1.0F, -0.5F, -0.5F, 2, 2, 1, -0.201F, false));

		ironsights_r6 = new ModelRenderer(this);
		ironsights_r6.setRotationPoint(-1.5F, 5.3906F, 51.9906F);
		ironsights.addChild(ironsights_r6);
		setRotationAngle(ironsights_r6, -0.1745F, 0.0F, 0.0F);
		ironsights_r6.cubeList.add(new ModelBox(ironsights_r6, 3, 184, -1.0F, 1.0F, -0.5F, 2, 2, 1, -0.201F, false));

		cube_r42 = new ModelRenderer(this);
		cube_r42.setRotationPoint(-1.5F, -2.4538F, 53.9092F);
		ironsights.addChild(cube_r42);
		setRotationAngle(cube_r42, 0.6109F, 0.0F, 0.0F);
		

		cube_r43 = new ModelRenderer(this);
		cube_r43.setRotationPoint(-2.7F, -1.36F, 40.72F);
		ironsights.addChild(cube_r43);
		setRotationAngle(cube_r43, 0.3665F, 0.0F, 0.0F);
		

		cube_r44 = new ModelRenderer(this);
		cube_r44.setRotationPoint(-0.4F, -1.16F, 33.92F);
		ironsights.addChild(cube_r44);
		setRotationAngle(cube_r44, 0.3665F, 0.0F, 0.0F);
		

		cube_r45 = new ModelRenderer(this);
		cube_r45.setRotationPoint(-1.499F, -1.6902F, 57.1199F);
		ironsights.addChild(cube_r45);
		setRotationAngle(cube_r45, -0.9774F, 0.0F, 0.0F);
		

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		ironsights.addChild(bone);
		

		ironsights_r1 = new ModelRenderer(this);
		ironsights_r1.setRotationPoint(-2.7038F, -2.2902F, 33.4F);
		bone.addChild(ironsights_r1);
		setRotationAngle(ironsights_r1, 0.0F, 0.0F, 0.2618F);
		

		ironsights_r2 = new ModelRenderer(this);
		ironsights_r2.setRotationPoint(-0.0374F, -2.9733F, 33.4F);
		bone.addChild(ironsights_r2);
		setRotationAngle(ironsights_r2, 0.0F, 0.0F, 0.2618F);
		

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
		ironsights.addChild(bone2);
		

		ironsights_r3 = new ModelRenderer(this);
		ironsights_r3.setRotationPoint(-0.0374F, -1.3243F, 33.4F);
		bone2.addChild(ironsights_r3);
		setRotationAngle(ironsights_r3, 0.0F, 0.0F, -0.2618F);
		

		ironsights_r4 = new ModelRenderer(this);
		ironsights_r4.setRotationPoint(-2.9626F, -2.9733F, 33.4F);
		bone2.addChild(ironsights_r4);
		setRotationAngle(ironsights_r4, 0.0F, 0.0F, -0.2618F);
		

		gun4 = new ModelRenderer(this);
		gun4.setRotationPoint(-3.2F, -31.0F, -7.5F);
		gun.addChild(gun4);
		
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		topcover.render(f5);
		gun.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}