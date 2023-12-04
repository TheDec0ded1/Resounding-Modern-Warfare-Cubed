package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Type64SMG extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer cube_r14_r1;
	private final ModelRenderer cube_r13_r1;
	private final ModelRenderer cube_r13_r2;
	private final ModelRenderer cube_r8_r1;
	private final ModelRenderer cube_r8_r2;
	private final ModelRenderer cube_r12_r1;
	private final ModelRenderer cube_r10_r1;
	private final ModelRenderer cube_r10_r2;
	private final ModelRenderer cube_r11_r1;
	private final ModelRenderer cube_r12_r2;
	private final ModelRenderer gun113;
	private final ModelRenderer gun112;
	private final ModelRenderer gun111;
	private final ModelRenderer gun110;
	private final ModelRenderer gun29;
	private final ModelRenderer gun30;
	private final ModelRenderer gun27;
	private final ModelRenderer gun25;
	private final ModelRenderer gun26;
	private final ModelRenderer gun24;
	private final ModelRenderer gun22;
	private final ModelRenderer gun23;
	private final ModelRenderer gun21;
	private final ModelRenderer gun20;
	private final ModelRenderer gun19;
	private final ModelRenderer gun18;
	private final ModelRenderer gun17;
	private final ModelRenderer gun16;
	private final ModelRenderer gun10;
	private final ModelRenderer gun11;
	private final ModelRenderer gun13;
	private final ModelRenderer gun12;
	private final ModelRenderer gun28;
	private final ModelRenderer dustcover;
	private final ModelRenderer gun118;
	private final ModelRenderer gun120;
	private final ModelRenderer gun123;
	private final ModelRenderer gun119;
	private final ModelRenderer gun121;
	private final ModelRenderer gun142;
	private final ModelRenderer gun116;
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
	private final ModelRenderer barrel3;
	private final ModelRenderer barrel4;
	private final ModelRenderer bone24;
	private final ModelRenderer cube_r46;
	private final ModelRenderer cube_r47;
	private final ModelRenderer bone25;
	private final ModelRenderer cube_r48;
	private final ModelRenderer cube_r49;
	private final ModelRenderer bone26;
	private final ModelRenderer cube_r50;
	private final ModelRenderer cube_r51;
	private final ModelRenderer cube_r52;
	private final ModelRenderer bone27;
	private final ModelRenderer cube_r53;
	private final ModelRenderer cube_r79;
	private final ModelRenderer barrelouter5;
	private final ModelRenderer bone28;
	private final ModelRenderer cube_r80;
	private final ModelRenderer cube_r81;
	private final ModelRenderer bone29;
	private final ModelRenderer cube_r82;
	private final ModelRenderer cube_r83;
	private final ModelRenderer bone30;
	private final ModelRenderer cube_r84;
	private final ModelRenderer cube_r85;
	private final ModelRenderer bone31;
	private final ModelRenderer cube_r86;
	private final ModelRenderer cube_r87;
	private final ModelRenderer barrelouter6;
	private final ModelRenderer bone32;
	private final ModelRenderer cube_r88;
	private final ModelRenderer cube_r89;
	private final ModelRenderer bone33;
	private final ModelRenderer cube_r90;
	private final ModelRenderer cube_r91;
	private final ModelRenderer bone34;
	private final ModelRenderer cube_r92;
	private final ModelRenderer cube_r93;
	private final ModelRenderer bone35;
	private final ModelRenderer cube_r94;
	private final ModelRenderer cube_r95;
	private final ModelRenderer barrelouter7;
	private final ModelRenderer bone36;
	private final ModelRenderer cube_r96;
	private final ModelRenderer cube_r97;
	private final ModelRenderer bone37;
	private final ModelRenderer cube_r98;
	private final ModelRenderer cube_r99;
	private final ModelRenderer bone38;
	private final ModelRenderer cube_r100;
	private final ModelRenderer cube_r101;
	private final ModelRenderer bone39;
	private final ModelRenderer cube_r102;
	private final ModelRenderer cube_r103;
	private final ModelRenderer barrelouter8;
	private final ModelRenderer bone40;
	private final ModelRenderer cube_r104;
	private final ModelRenderer cube_r105;
	private final ModelRenderer bone41;
	private final ModelRenderer cube_r106;
	private final ModelRenderer cube_r107;
	private final ModelRenderer bone42;
	private final ModelRenderer cube_r108;
	private final ModelRenderer cube_r109;
	private final ModelRenderer bone43;
	private final ModelRenderer cube_r110;
	private final ModelRenderer cube_r111;
	private final ModelRenderer ironsights2;
	private final ModelRenderer ironsights_r1;
	private final ModelRenderer ironsights_r2;
	private final ModelRenderer ironsights_r3;
	private final ModelRenderer ironsights_r4;
	private final ModelRenderer ironsights_r5;
	private final ModelRenderer ironsights_r6;
	private final ModelRenderer cube_r112;
	private final ModelRenderer cube_r113;
	private final ModelRenderer cube_r114;
	private final ModelRenderer cube_r115;
	private final ModelRenderer stock;
	private final ModelRenderer gun365;
	private final ModelRenderer gun244;
	private final ModelRenderer gun243;
	private final ModelRenderer gun242;
	private final ModelRenderer gun241;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer gun240;
	private final ModelRenderer gun239;
	private final ModelRenderer gun238;
	private final ModelRenderer gun237;
	private final ModelRenderer gun236;
	private final ModelRenderer gun235;
	private final ModelRenderer gun234;
	private final ModelRenderer gun233;

	public Type64SMG() {
		textureWidth = 256;
		textureHeight = 256;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		cube_r14_r1 = new ModelRenderer(this);
		cube_r14_r1.setRotationPoint(-1.4678F, -32.4851F, 11.8739F);
		gun.addChild(cube_r14_r1);
		setRotationAngle(cube_r14_r1, 0.0F, -0.1309F, 1.5708F);
		cube_r14_r1.cubeList.add(new ModelBox(cube_r14_r1, 167, 22, -0.5146F, -2.7426F, -8.5F, 1, 3, 7, 0.0F, false));

		cube_r13_r1 = new ModelRenderer(this);
		cube_r13_r1.setRotationPoint(-1.4678F, -32.4849F, 11.8701F);
		gun.addChild(cube_r13_r1);
		setRotationAngle(cube_r13_r1, 0.0F, -0.1309F, 1.5708F);
		cube_r13_r1.cubeList.add(new ModelBox(cube_r13_r1, 167, 22, -0.4854F, -0.2574F, -8.5F, 1, 3, 7, 0.0F, false));

		cube_r13_r2 = new ModelRenderer(this);
		cube_r13_r2.setRotationPoint(-10.2252F, -33.0028F, -10.5422F);
		gun.addChild(cube_r13_r2);
		setRotationAngle(cube_r13_r2, 0.0F, 0.0F, 1.5708F);
		cube_r13_r2.cubeList.add(new ModelBox(cube_r13_r2, 153, 8, 1.1F, -11.0F, -7.0F, 1, 2, 21, 0.0F, false));

		cube_r8_r1 = new ModelRenderer(this);
		cube_r8_r1.setRotationPoint(-27.9089F, -22.4059F, 10.01F);
		gun.addChild(cube_r8_r1);
		setRotationAngle(cube_r8_r1, 0.0F, 0.0F, 1.5708F);
		cube_r8_r1.cubeList.add(new ModelBox(cube_r8_r1, 64, 16, -9.4885F, -29.1837F, -36.5F, 1, 1, 30, 0.0F, false));
		cube_r8_r1.cubeList.add(new ModelBox(cube_r8_r1, 64, 16, -11.4885F, -29.1837F, -29.5F, 2, 1, 30, 0.0F, false));
		cube_r8_r1.cubeList.add(new ModelBox(cube_r8_r1, 87, 39, -11.4885F, -28.9337F, -36.0F, 2, 1, 7, 0.0F, false));
		cube_r8_r1.cubeList.add(new ModelBox(cube_r8_r1, 120, 186, -14.4885F, -28.4837F, -0.5F, 2, 4, 1, 0.0F, false));
		cube_r8_r1.cubeList.add(new ModelBox(cube_r8_r1, 120, 186, -12.4885F, -28.1837F, -0.5F, 3, 4, 1, 0.0F, false));
		cube_r8_r1.cubeList.add(new ModelBox(cube_r8_r1, 93, 45, -12.4885F, -28.1837F, -36.5F, 3, 4, 1, 0.0F, false));
		cube_r8_r1.cubeList.add(new ModelBox(cube_r8_r1, 93, 45, -11.4885F, -29.1837F, -36.5F, 2, 1, 1, 0.0F, false));

		cube_r8_r2 = new ModelRenderer(this);
		cube_r8_r2.setRotationPoint(-33.8252F, -34.0944F, -114.99F);
		gun.addChild(cube_r8_r2);
		setRotationAngle(cube_r8_r2, 0.0F, 0.0F, 1.5708F);
		cube_r8_r2.cubeList.add(new ModelBox(cube_r8_r2, 57, 55, -0.8F, -35.1F, 88.5F, 1, 1, 37, 0.0F, false));

		cube_r12_r1 = new ModelRenderer(this);
		cube_r12_r1.setRotationPoint(-1.2252F, -31.0895F, -19.5185F);
		gun.addChild(cube_r12_r1);
		setRotationAngle(cube_r12_r1, 0.0F, 0.0436F, 1.5708F);
		cube_r12_r1.cubeList.add(new ModelBox(cube_r12_r1, 165, 20, -0.5F, -2.5F, -7.0F, 1, 3, 9, 0.0F, false));

		cube_r10_r1 = new ModelRenderer(this);
		cube_r10_r1.setRotationPoint(-32.3941F, -40.3537F, 10.01F);
		gun.addChild(cube_r10_r1);
		setRotationAngle(cube_r10_r1, 0.0F, 0.0F, 1.5708F);
		cube_r10_r1.cubeList.add(new ModelBox(cube_r10_r1, 141, 43, 6.4885F, -29.1837F, -36.5F, 2, 1, 1, 0.0F, false));
		cube_r10_r1.cubeList.add(new ModelBox(cube_r10_r1, 135, 37, 6.4885F, -29.4337F, -36.0F, 2, 1, 7, 0.0F, false));
		cube_r10_r1.cubeList.add(new ModelBox(cube_r10_r1, 113, 14, 8.4885F, -29.1837F, -36.5F, 1, 1, 30, 0.0F, false));
		cube_r10_r1.cubeList.add(new ModelBox(cube_r10_r1, 112, 14, 6.4885F, -29.1837F, -29.5F, 2, 1, 30, 0.0F, false));

		cube_r10_r2 = new ModelRenderer(this);
		cube_r10_r2.setRotationPoint(-38.3104F, -30.6652F, -113.99F);
		gun.addChild(cube_r10_r2);
		setRotationAngle(cube_r10_r2, 0.0F, 0.0F, 1.5708F);
		cube_r10_r2.cubeList.add(new ModelBox(cube_r10_r2, 106, 54, -4.2F, -35.1F, 87.5F, 1, 1, 37, 0.0F, false));

		cube_r11_r1 = new ModelRenderer(this);
		cube_r11_r1.setRotationPoint(-2.7104F, -31.0603F, -19.5185F);
		gun.addChild(cube_r11_r1);
		setRotationAngle(cube_r11_r1, 0.0F, 0.0436F, 1.5708F);
		cube_r11_r1.cubeList.add(new ModelBox(cube_r11_r1, 165, 20, -0.5F, -1.5F, -7.0F, 1, 3, 9, 0.0F, false));

		cube_r12_r2 = new ModelRenderer(this);
		cube_r12_r2.setRotationPoint(8.2896F, -32.9736F, -10.5422F);
		gun.addChild(cube_r12_r2);
		setRotationAngle(cube_r12_r2, 0.0F, 0.0F, 1.5708F);
		cube_r12_r2.cubeList.add(new ModelBox(cube_r12_r2, 153, 8, 1.1F, 9.5F, -7.0F, 1, 3, 21, 0.0F, false));

		gun113 = new ModelRenderer(this);
		gun113.setRotationPoint(-2.0F, -28.0F, -9.7F);
		gun.addChild(gun113);
		setRotationAngle(gun113, -2.6397F, 0.0F, 0.0F);
		gun113.cubeList.add(new ModelBox(gun113, 134, 4, -0.001F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun112 = new ModelRenderer(this);
		gun112.setRotationPoint(-2.0F, -28.7F, -9.1F);
		gun.addChild(gun112);
		setRotationAngle(gun112, -2.3051F, 0.0F, 0.0F);
		gun112.cubeList.add(new ModelBox(gun112, 134, 4, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun111 = new ModelRenderer(this);
		gun111.setRotationPoint(-2.0F, -31.8F, -9.0F);
		gun.addChild(gun111);
		setRotationAngle(gun111, -0.3718F, 0.0F, 0.0F);
		gun111.cubeList.add(new ModelBox(gun111, 174, 95, -0.001F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

		gun110 = new ModelRenderer(this);
		gun110.setRotationPoint(-2.0F, -31.2F, -10.5F);
		gun.addChild(gun110);
		setRotationAngle(gun110, 0.4461F, 0.0F, 0.0F);
		gun110.cubeList.add(new ModelBox(gun110, 172, 28, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun29 = new ModelRenderer(this);
		gun29.setRotationPoint(-3.6F, -29.0F, -17.5F);
		gun.addChild(gun29);
		gun29.cubeList.add(new ModelBox(gun29, 103, 6, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun30 = new ModelRenderer(this);
		gun30.setRotationPoint(-0.4F, -29.0F, -17.5F);
		gun.addChild(gun30);
		gun30.cubeList.add(new ModelBox(gun30, 104, 6, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun27 = new ModelRenderer(this);
		gun27.setRotationPoint(-3.5F, -27.3F, -16.6F);
		gun.addChild(gun27);
		setRotationAngle(gun27, 1.45F, 0.0F, 0.0F);
		gun27.cubeList.add(new ModelBox(gun27, 148, 121, 0.002F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

		gun25 = new ModelRenderer(this);
		gun25.setRotationPoint(-3.5F, -32.5F, -18.0F);
		gun.addChild(gun25);
		gun25.cubeList.add(new ModelBox(gun25, 75, 153, 0.0F, 0.0F, 0.0F, 4, 5, 1, 0.0F, false));

		gun26 = new ModelRenderer(this);
		gun26.setRotationPoint(-3.5F, -27.5F, -18.0F);
		gun.addChild(gun26);
		setRotationAngle(gun26, 1.45F, 0.0F, 0.0F);
		gun26.cubeList.add(new ModelBox(gun26, 72, 155, 0.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F, false));

		gun24 = new ModelRenderer(this);
		gun24.setRotationPoint(-3.5F, -32.5F, -17.5F);
		gun.addChild(gun24);
		gun24.cubeList.add(new ModelBox(gun24, 74, 152, 0.001F, 0.0F, 0.0F, 4, 5, 2, 0.0F, false));

		gun22 = new ModelRenderer(this);
		gun22.setRotationPoint(-0.8F, -25.8F, -14.5F);
		gun.addChild(gun22);
		setRotationAngle(gun22, 2.4538F, 0.0F, 0.0F);
		gun22.cubeList.add(new ModelBox(gun22, 98, 39, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun23 = new ModelRenderer(this);
		gun23.setRotationPoint(-3.2F, -25.8F, -14.5F);
		gun.addChild(gun23);
		setRotationAngle(gun23, 2.4538F, 0.0F, 0.0F);
		gun23.cubeList.add(new ModelBox(gun23, 170, 29, 0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun21 = new ModelRenderer(this);
		gun21.setRotationPoint(-0.8F, -26.8F, -15.5F);
		gun.addChild(gun21);
		setRotationAngle(gun21, 0.7436F, 0.0F, 0.0F);
		gun21.cubeList.add(new ModelBox(gun21, 184, 29, -0.001F, 0.0F, -0.001F, 1, 1, 1, 0.0F, false));

		gun20 = new ModelRenderer(this);
		gun20.setRotationPoint(-3.2F, -26.8F, -15.5F);
		gun.addChild(gun20);
		setRotationAngle(gun20, 0.7436F, 0.0F, 0.0F);
		gun20.cubeList.add(new ModelBox(gun20, 158, 29, -0.001F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun19 = new ModelRenderer(this);
		gun19.setRotationPoint(-0.8F, -31.8F, -15.5F);
		gun.addChild(gun19);
		gun19.cubeList.add(new ModelBox(gun19, 37, 78, 0.001F, 0.0F, -0.001F, 1, 5, 1, 0.0F, false));

		gun18 = new ModelRenderer(this);
		gun18.setRotationPoint(-3.2F, -31.8F, -15.5F);
		gun.addChild(gun18);
		gun18.cubeList.add(new ModelBox(gun18, 35, 79, 0.0F, 0.0F, 0.0F, 3, 5, 1, 0.0F, false));

		gun17 = new ModelRenderer(this);
		gun17.setRotationPoint(-3.2F, -26.8F, -14.5F);
		gun.addChild(gun17);
		gun17.cubeList.add(new ModelBox(gun17, 149, 99, 0.0F, 0.0F, 0.0F, 3, 1, 7, 0.0F, false));

		gun16 = new ModelRenderer(this);
		gun16.setRotationPoint(-0.8F, -26.8F, -14.5F);
		gun.addChild(gun16);
		gun16.cubeList.add(new ModelBox(gun16, 72, 117, 0.001F, -0.001F, 0.0F, 1, 1, 7, 0.0F, false));

		gun10 = new ModelRenderer(this);
		gun10.setRotationPoint(-0.8F, -26.5F, -6.7F);
		gun.addChild(gun10);
		setRotationAngle(gun10, -2.3423F, 0.0F, 0.0F);
		gun10.cubeList.add(new ModelBox(gun10, 99, 49, 0.0F, -0.001F, 0.0F, 1, 1, 1, 0.0F, false));

		gun11 = new ModelRenderer(this);
		gun11.setRotationPoint(-3.2F, -26.5F, -6.7F);
		gun.addChild(gun11);
		setRotationAngle(gun11, -2.3423F, 0.0F, 0.0F);
		gun11.cubeList.add(new ModelBox(gun11, 181, 121, -0.001F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun13 = new ModelRenderer(this);
		gun13.setRotationPoint(-0.8F, -31.5F, -7.5F);
		gun.addChild(gun13);
		gun13.cubeList.add(new ModelBox(gun13, 68, 119, 0.001F, 0.0F, -0.001F, 1, 5, 1, 0.0F, false));

		gun12 = new ModelRenderer(this);
		gun12.setRotationPoint(-3.2F, -31.5F, -7.5F);
		gun.addChild(gun12);
		gun12.cubeList.add(new ModelBox(gun12, 118, 185, 0.0F, 0.0F, 0.0F, 3, 5, 1, 0.0F, false));

		gun28 = new ModelRenderer(this);
		gun28.setRotationPoint(-3.0F, -27.5F, -17.8F);
		gun.addChild(gun28);
		setRotationAngle(gun28, 0.2603F, 0.0F, 0.0F);
		gun28.cubeList.add(new ModelBox(gun28, 165, 28, 0.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F, false));

		dustcover = new ModelRenderer(this);
		dustcover.setRotationPoint(0.0F, -0.5F, 0.0F);
		gun.addChild(dustcover);
		

		gun118 = new ModelRenderer(this);
		gun118.setRotationPoint(-1.0F, -39.2F, -26.5F);
		dustcover.addChild(gun118);
		setRotationAngle(gun118, 0.0F, 0.0F, 0.4461F);
		gun118.cubeList.add(new ModelBox(gun118, 148, 96, 0.8629F, 1.8043F, 0.01F, 2, 1, 26, 0.0F, false));
		gun118.cubeList.add(new ModelBox(gun118, 163, 111, 0.8629F, 1.8043F, 26.01F, 2, 1, 11, 0.0F, false));

		gun120 = new ModelRenderer(this);
		gun120.setRotationPoint(8.9F, -38.75F, -26.5F);
		dustcover.addChild(gun120);
		setRotationAngle(gun120, 0.0F, 0.0F, 1.1897F);
		gun120.cubeList.add(new ModelBox(gun120, 190, 143, -0.7713F, 8.4124F, 0.01F, 1, 1, 26, 0.0F, false));
		gun120.cubeList.add(new ModelBox(gun120, 205, 158, -0.7713F, 8.4124F, 26.01F, 1, 1, 11, 0.0F, false));

		gun123 = new ModelRenderer(this);
		gun123.setRotationPoint(0.25F, -37.8F, -26.5F);
		dustcover.addChild(gun123);
		setRotationAngle(gun123, 0.0F, 0.0F, 1.45F);
		gun123.cubeList.add(new ModelBox(gun123, 77, 140, 2.5043F, -0.6069F, 0.01F, 1, 1, 26, 0.0F, false));
		gun123.cubeList.add(new ModelBox(gun123, 92, 155, 2.5043F, -0.6069F, 26.01F, 1, 1, 11, 0.0F, false));

		gun119 = new ModelRenderer(this);
		gun119.setRotationPoint(-2.0F, -39.2F, -26.5F);
		dustcover.addChild(gun119);
		setRotationAngle(gun119, 0.0F, 0.0F, 1.0782F);
		gun119.cubeList.add(new ModelBox(gun119, 161, 106, 1.7622F, 0.9458F, 12.01F, 1, 2, 14, 0.0F, false));
		gun119.cubeList.add(new ModelBox(gun119, 164, 109, 1.7622F, 0.9458F, 26.01F, 1, 2, 11, 0.0F, false));
		gun119.cubeList.add(new ModelBox(gun119, 172, 117, 1.7622F, 0.9458F, 0.01F, 1, 2, 4, 0.0F, false));

		gun121 = new ModelRenderer(this);
		gun121.setRotationPoint(-2.9F, -38.7F, -26.5F);
		dustcover.addChild(gun121);
		setRotationAngle(gun121, 0.0F, 0.0F, 0.3346F);
		gun121.cubeList.add(new ModelBox(gun121, 155, 203, -0.0112F, 2.5933F, 12.01F, 1, 1, 14, 0.0F, false));
		gun121.cubeList.add(new ModelBox(gun121, 158, 206, -0.0112F, 2.5933F, 26.01F, 1, 1, 11, 0.0F, false));
		gun121.cubeList.add(new ModelBox(gun121, 165, 213, -0.0112F, 2.5933F, 0.01F, 1, 1, 4, 0.0F, false));

		gun142 = new ModelRenderer(this);
		gun142.setRotationPoint(-3.2F, -37.8F, -14.5F);
		dustcover.addChild(gun142);
		setRotationAngle(gun142, 0.0F, 0.0F, 0.1487F);
		gun142.cubeList.add(new ModelBox(gun142, 229, 179, -0.4903F, 2.5466F, 8.01F, 1, 1, 6, 0.0F, false));
		gun142.cubeList.add(new ModelBox(gun142, 224, 174, -0.4903F, 2.5466F, 14.01F, 1, 1, 11, 0.0F, false));

		gun116 = new ModelRenderer(this);
		gun116.setRotationPoint(-2.0F, -39.2F, -26.5F);
		dustcover.addChild(gun116);
		gun116.cubeList.add(new ModelBox(gun116, 171, 197, 0.0F, 2.0F, 0.0F, 1, 1, 26, 0.0F, false));
		gun116.cubeList.add(new ModelBox(gun116, 186, 212, 0.0F, 2.0F, 26.0F, 1, 1, 11, 0.0F, false));

		gun181 = new ModelRenderer(this);
		gun181.setRotationPoint(-3.25F, -37.9F, -12.5F);
		dustcover.addChild(gun181);
		setRotationAngle(gun181, 0.0F, 0.0F, 0.1487F);
		

		gun157 = new ModelRenderer(this);
		gun157.setRotationPoint(-2.0F, -39.3F, -12.5F);
		dustcover.addChild(gun157);
		setRotationAngle(gun157, 0.0F, 0.0F, 1.0782F);
		

		gun161 = new ModelRenderer(this);
		gun161.setRotationPoint(-2.9F, -38.8F, -12.5F);
		dustcover.addChild(gun161);
		setRotationAngle(gun161, 0.0F, 0.0F, 0.3346F);
		

		gun160 = new ModelRenderer(this);
		gun160.setRotationPoint(-2.9F, -38.8F, -18.5F);
		dustcover.addChild(gun160);
		setRotationAngle(gun160, 0.0F, 0.0F, 0.3346F);
		

		gun156 = new ModelRenderer(this);
		gun156.setRotationPoint(-2.0F, -39.3F, -18.5F);
		dustcover.addChild(gun156);
		setRotationAngle(gun156, 0.0F, 0.0F, 1.0782F);
		

		gun155 = new ModelRenderer(this);
		gun155.setRotationPoint(-2.0F, -39.3F, -24.5F);
		dustcover.addChild(gun155);
		setRotationAngle(gun155, 0.0F, 0.0F, 1.0782F);
		

		gun159 = new ModelRenderer(this);
		gun159.setRotationPoint(-2.9F, -38.8F, -24.5F);
		dustcover.addChild(gun159);
		setRotationAngle(gun159, 0.0F, 0.0F, 0.3346F);
		

		gun163 = new ModelRenderer(this);
		gun163.setRotationPoint(-2.5F, -38.3F, -26.5F);
		dustcover.addChild(gun163);
		setRotationAngle(gun163, 0.0F, 0.0F, 1.041F);
		

		gun164 = new ModelRenderer(this);
		gun164.setRotationPoint(-3.75F, -36.9F, -14.5F);
		dustcover.addChild(gun164);
		setRotationAngle(gun164, -0.0873F, 0.0F, 0.0F);
		

		gun146 = new ModelRenderer(this);
		gun146.setRotationPoint(-1.0F, -39.3F, -6.5F);
		dustcover.addChild(gun146);
		setRotationAngle(gun146, 0.0F, 0.0F, 0.4461F);
		

		gun150 = new ModelRenderer(this);
		gun150.setRotationPoint(-0.1F, -38.9F, -6.5F);
		dustcover.addChild(gun150);
		setRotationAngle(gun150, 0.0F, 0.0F, 1.1897F);
		

		gun154 = new ModelRenderer(this);
		gun154.setRotationPoint(0.3F, -37.95F, -6.5F);
		dustcover.addChild(gun154);
		setRotationAngle(gun154, 0.0F, 0.0F, 1.45F);
		

		gun145 = new ModelRenderer(this);
		gun145.setRotationPoint(-1.0F, -39.3F, -12.5F);
		dustcover.addChild(gun145);
		setRotationAngle(gun145, 0.0F, 0.0F, 0.4461F);
		

		gun149 = new ModelRenderer(this);
		gun149.setRotationPoint(-0.1F, -38.9F, -12.5F);
		dustcover.addChild(gun149);
		setRotationAngle(gun149, 0.0F, 0.0F, 1.1897F);
		

		gun153 = new ModelRenderer(this);
		gun153.setRotationPoint(0.3F, -37.95F, -12.5F);
		dustcover.addChild(gun153);
		setRotationAngle(gun153, 0.0F, 0.0F, 1.45F);
		

		gun144 = new ModelRenderer(this);
		gun144.setRotationPoint(-1.0F, -39.3F, -18.5F);
		dustcover.addChild(gun144);
		setRotationAngle(gun144, 0.0F, 0.0F, 0.4461F);
		

		gun148 = new ModelRenderer(this);
		gun148.setRotationPoint(-0.1F, -38.9F, -18.5F);
		dustcover.addChild(gun148);
		setRotationAngle(gun148, 0.0F, 0.0F, 1.1897F);
		

		gun152 = new ModelRenderer(this);
		gun152.setRotationPoint(0.3F, -37.95F, -18.5F);
		dustcover.addChild(gun152);
		setRotationAngle(gun152, 0.0F, 0.0F, 1.45F);
		

		gun143 = new ModelRenderer(this);
		gun143.setRotationPoint(-1.0F, -39.3F, -24.5F);
		dustcover.addChild(gun143);
		setRotationAngle(gun143, 0.0F, 0.0F, 0.4461F);
		

		gun147 = new ModelRenderer(this);
		gun147.setRotationPoint(-0.1F, -38.9F, -24.5F);
		dustcover.addChild(gun147);
		setRotationAngle(gun147, 0.0F, 0.0F, 1.1897F);
		

		gun151 = new ModelRenderer(this);
		gun151.setRotationPoint(0.3F, -37.95F, -24.5F);
		dustcover.addChild(gun151);
		setRotationAngle(gun151, 0.0F, 0.0F, 1.45F);
		

		gun117 = new ModelRenderer(this);
		gun117.setRotationPoint(0.25F, -35.7F, -26.5F);
		dustcover.addChild(gun117);
		setRotationAngle(gun117, 0.0F, 0.0F, 0.7436F);
		

		gun128 = new ModelRenderer(this);
		gun128.setRotationPoint(-2.0F, -39.2F, -0.5F);
		dustcover.addChild(gun128);
		setRotationAngle(gun128, -0.8378F, 0.0F, 0.0F);
		

		gun130 = new ModelRenderer(this);
		gun130.setRotationPoint(-2.5F, -39.0F, -0.3F);
		dustcover.addChild(gun130);
		setRotationAngle(gun130, -0.8378F, 0.0F, 0.0F);
		

		gun129 = new ModelRenderer(this);
		gun129.setRotationPoint(-3.0F, -38.5F, 0.15F);
		dustcover.addChild(gun129);
		setRotationAngle(gun129, -0.8378F, 0.0F, 0.0F);
		

		gun126 = new ModelRenderer(this);
		gun126.setRotationPoint(0.3F, -37.0F, 0.5F);
		dustcover.addChild(gun126);
		setRotationAngle(gun126, 0.0F, 0.0F, 1.4128F);
		

		gun124 = new ModelRenderer(this);
		gun124.setRotationPoint(-3.3F, -37.0F, 0.5F);
		dustcover.addChild(gun124);
		

		gun125 = new ModelRenderer(this);
		gun125.setRotationPoint(-0.7F, -37.0F, 0.5F);
		dustcover.addChild(gun125);
		

		gun127 = new ModelRenderer(this);
		gun127.setRotationPoint(-3.3F, -37.0F, 0.5F);
		dustcover.addChild(gun127);
		setRotationAngle(gun127, 0.0F, 0.0F, 0.1745F);
		

		gun139 = new ModelRenderer(this);
		gun139.setRotationPoint(-3.75F, -36.4F, -8.55F);
		dustcover.addChild(gun139);
		setRotationAngle(gun139, -0.8179F, 0.0F, 0.0F);
		

		barrel3 = new ModelRenderer(this);
		barrel3.setRotationPoint(-1.0F, -36.8F, -70.5F);
		gun.addChild(barrel3);
		

		barrel4 = new ModelRenderer(this);
		barrel4.setRotationPoint(1.0F, 36.8F, 85.5F);
		barrel3.addChild(barrel4);
		

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(-1.5F, -37.8F, -85.5F);
		barrel4.addChild(bone24);
		

		cube_r46 = new ModelRenderer(this);
		cube_r46.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone24.addChild(cube_r46);
		setRotationAngle(cube_r46, 0.0F, 0.0F, 0.4363F);
		cube_r46.cubeList.add(new ModelBox(cube_r46, 50, 94, 0.0F, 0.0F, 0.0F, 2, 1, 44, 0.0F, false));
		cube_r46.cubeList.add(new ModelBox(cube_r46, 80, 124, 0.0F, 0.0F, -14.0F, 2, 1, 14, 0.0F, false));

		cube_r47 = new ModelRenderer(this);
		cube_r47.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone24.addChild(cube_r47);
		setRotationAngle(cube_r47, 0.0F, 0.0F, -0.4363F);
		cube_r47.cubeList.add(new ModelBox(cube_r47, 1, 93, -2.0F, 0.0F, 0.0F, 2, 1, 44, 0.0F, false));
		cube_r47.cubeList.add(new ModelBox(cube_r47, 31, 123, -2.0F, 0.0F, -14.0F, 2, 1, 14, 0.0F, false));

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(-1.5F, -32.4F, -85.5F);
		barrel4.addChild(bone25);
		

		cube_r48 = new ModelRenderer(this);
		cube_r48.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone25.addChild(cube_r48);
		setRotationAngle(cube_r48, 0.0F, 0.0F, -0.4363F);
		cube_r48.cubeList.add(new ModelBox(cube_r48, 1, 1, 0.0F, -1.0F, 0.0F, 2, 1, 44, 0.0F, false));
		cube_r48.cubeList.add(new ModelBox(cube_r48, 31, 31, 0.0F, -1.0F, -14.0F, 2, 1, 14, 0.0F, false));

		cube_r49 = new ModelRenderer(this);
		cube_r49.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone25.addChild(cube_r49);
		setRotationAngle(cube_r49, 0.0F, 0.0F, 0.4363F);
		cube_r49.cubeList.add(new ModelBox(cube_r49, 1, 47, -2.0F, -1.0F, 0.0F, 2, 1, 44, 0.0F, false));
		cube_r49.cubeList.add(new ModelBox(cube_r49, 31, 77, -2.0F, -1.0F, -14.0F, 2, 1, 14, 0.0F, false));

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(1.2F, -35.1F, -85.5F);
		barrel4.addChild(bone26);
		setRotationAngle(bone26, 0.0F, 0.0F, 1.5708F);
		

		cube_r50 = new ModelRenderer(this);
		cube_r50.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone26.addChild(cube_r50);
		setRotationAngle(cube_r50, 0.0F, 0.0F, 0.4363F);
		cube_r50.cubeList.add(new ModelBox(cube_r50, 50, 2, 0.0F, 0.0F, 0.0F, 2, 1, 44, 0.0F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 80, 32, 0.0F, 0.0F, -14.0F, 2, 1, 14, 0.0F, false));

		cube_r51 = new ModelRenderer(this);
		cube_r51.setRotationPoint(0.0F, 70.2F, 0.0F);
		bone26.addChild(cube_r51);
		setRotationAngle(cube_r51, 0.0F, 0.0F, 0.4363F);
		

		cube_r52 = new ModelRenderer(this);
		cube_r52.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone26.addChild(cube_r52);
		setRotationAngle(cube_r52, 0.0F, 0.0F, -0.4363F);
		cube_r52.cubeList.add(new ModelBox(cube_r52, 50, 48, -2.0F, 0.0F, 0.0F, 2, 1, 44, 0.0F, false));
		cube_r52.cubeList.add(new ModelBox(cube_r52, 80, 78, -2.0F, 0.0F, -14.0F, 2, 1, 14, 0.0F, false));

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(-4.2F, -35.1F, -85.5F);
		barrel4.addChild(bone27);
		setRotationAngle(bone27, 0.0F, 0.0F, -1.5708F);
		

		cube_r53 = new ModelRenderer(this);
		cube_r53.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone27.addChild(cube_r53);
		setRotationAngle(cube_r53, 0.0F, 0.0F, -0.4363F);
		cube_r53.cubeList.add(new ModelBox(cube_r53, 98, 0, -2.0F, 0.0F, 0.0F, 2, 1, 44, 0.0F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 128, 30, -2.0F, 0.0F, -14.0F, 2, 1, 14, 0.0F, false));

		cube_r79 = new ModelRenderer(this);
		cube_r79.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone27.addChild(cube_r79);
		setRotationAngle(cube_r79, 0.0F, 0.0F, 0.4363F);
		cube_r79.cubeList.add(new ModelBox(cube_r79, 98, 47, 0.0F, 0.0F, 0.0F, 2, 1, 44, 0.0F, false));
		cube_r79.cubeList.add(new ModelBox(cube_r79, 128, 77, 0.0F, 0.0F, -14.0F, 2, 1, 14, 0.0F, false));

		barrelouter5 = new ModelRenderer(this);
		barrelouter5.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrel3.addChild(barrelouter5);
		

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(-0.5F, 4.4F, 0.0F);
		barrelouter5.addChild(bone28);
		

		cube_r80 = new ModelRenderer(this);
		cube_r80.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone28.addChild(cube_r80);
		setRotationAngle(cube_r80, 0.0F, 0.0F, -0.4363F);
		cube_r80.cubeList.add(new ModelBox(cube_r80, 20, 133, 0.0F, -2.0F, -14.0F, 2, 2, 2, 0.05F, false));

		cube_r81 = new ModelRenderer(this);
		cube_r81.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone28.addChild(cube_r81);
		setRotationAngle(cube_r81, 0.0F, 0.0F, 0.4363F);
		cube_r81.cubeList.add(new ModelBox(cube_r81, 110, 133, -2.0F, -2.0F, -14.0F, 2, 2, 2, 0.051F, false));

		bone29 = new ModelRenderer(this);
		bone29.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter5.addChild(bone29);
		setRotationAngle(bone29, 0.0F, 0.0F, 1.5708F);
		

		cube_r82 = new ModelRenderer(this);
		cube_r82.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone29.addChild(cube_r82);
		setRotationAngle(cube_r82, 0.0F, 0.0F, 0.4363F);
		cube_r82.cubeList.add(new ModelBox(cube_r82, 134, 36, 0.0F, 0.0F, -14.0F, 2, 2, 2, 0.052F, false));

		cube_r83 = new ModelRenderer(this);
		cube_r83.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone29.addChild(cube_r83);
		setRotationAngle(cube_r83, 0.0F, 0.0F, -0.4363F);
		cube_r83.cubeList.add(new ModelBox(cube_r83, 145, 108, -2.0F, 0.0F, -14.0F, 2, 2, 2, 0.05F, false));

		bone30 = new ModelRenderer(this);
		bone30.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter5.addChild(bone30);
		setRotationAngle(bone30, 0.0F, 0.0F, -1.5708F);
		

		cube_r84 = new ModelRenderer(this);
		cube_r84.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone30.addChild(cube_r84);
		setRotationAngle(cube_r84, 0.0F, 0.0F, -0.4363F);
		cube_r84.cubeList.add(new ModelBox(cube_r84, 124, 133, -2.0F, 0.0F, -14.0F, 2, 2, 2, 0.05F, false));

		cube_r85 = new ModelRenderer(this);
		cube_r85.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone30.addChild(cube_r85);
		setRotationAngle(cube_r85, 0.0F, 0.0F, 0.4363F);
		cube_r85.cubeList.add(new ModelBox(cube_r85, 134, 32, 0.0F, 0.0F, -14.0F, 2, 2, 2, 0.052F, false));

		bone31 = new ModelRenderer(this);
		bone31.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter5.addChild(bone31);
		

		cube_r86 = new ModelRenderer(this);
		cube_r86.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone31.addChild(cube_r86);
		setRotationAngle(cube_r86, 0.0F, 0.0F, 0.4363F);
		cube_r86.cubeList.add(new ModelBox(cube_r86, 145, 112, 0.0F, 0.0F, -14.0F, 2, 2, 2, 0.051F, false));

		cube_r87 = new ModelRenderer(this);
		cube_r87.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone31.addChild(cube_r87);
		setRotationAngle(cube_r87, 0.0F, 0.0F, -0.4363F);
		cube_r87.cubeList.add(new ModelBox(cube_r87, 109, 157, -2.0F, 0.0F, -14.0F, 2, 2, 2, 0.05F, false));

		barrelouter6 = new ModelRenderer(this);
		barrelouter6.setRotationPoint(0.0F, 0.0F, 26.0F);
		barrel3.addChild(barrelouter6);
		

		bone32 = new ModelRenderer(this);
		bone32.setRotationPoint(-0.5F, 4.4F, 0.0F);
		barrelouter6.addChild(bone32);
		

		cube_r88 = new ModelRenderer(this);
		cube_r88.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone32.addChild(cube_r88);
		setRotationAngle(cube_r88, 0.0F, 0.0F, -0.4363F);
		cube_r88.cubeList.add(new ModelBox(cube_r88, 179, 23, 0.0F, -1.0F, -9.1F, 2, 1, 1, 0.1F, false));

		cube_r89 = new ModelRenderer(this);
		cube_r89.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone32.addChild(cube_r89);
		setRotationAngle(cube_r89, 0.0F, 0.0F, 0.4363F);
		cube_r89.cubeList.add(new ModelBox(cube_r89, 40, 179, -2.0F, -1.0F, -9.1F, 2, 1, 1, 0.1F, false));

		bone33 = new ModelRenderer(this);
		bone33.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter6.addChild(bone33);
		setRotationAngle(bone33, 0.0F, 0.0F, 1.5708F);
		

		cube_r90 = new ModelRenderer(this);
		cube_r90.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone33.addChild(cube_r90);
		setRotationAngle(cube_r90, 0.0F, 0.0F, 0.4363F);
		cube_r90.cubeList.add(new ModelBox(cube_r90, 179, 13, 0.0F, 0.0F, -9.1F, 2, 1, 1, 0.1F, false));

		cube_r91 = new ModelRenderer(this);
		cube_r91.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone33.addChild(cube_r91);
		setRotationAngle(cube_r91, 0.0F, 0.0F, -0.4363F);
		cube_r91.cubeList.add(new ModelBox(cube_r91, 179, 18, -2.0F, 0.0F, -9.1F, 2, 1, 1, 0.1F, false));

		bone34 = new ModelRenderer(this);
		bone34.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter6.addChild(bone34);
		setRotationAngle(bone34, 0.0F, 0.0F, -1.5708F);
		

		cube_r92 = new ModelRenderer(this);
		cube_r92.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone34.addChild(cube_r92);
		setRotationAngle(cube_r92, 0.0F, 0.0F, -0.4363F);
		cube_r92.cubeList.add(new ModelBox(cube_r92, 179, 3, -2.0F, 0.0F, -9.1F, 2, 1, 1, 0.1F, false));

		cube_r93 = new ModelRenderer(this);
		cube_r93.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone34.addChild(cube_r93);
		setRotationAngle(cube_r93, 0.0F, 0.0F, 0.4363F);
		cube_r93.cubeList.add(new ModelBox(cube_r93, 179, 8, 0.0F, 0.0F, -9.1F, 2, 1, 1, 0.1F, false));

		bone35 = new ModelRenderer(this);
		bone35.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter6.addChild(bone35);
		

		cube_r94 = new ModelRenderer(this);
		cube_r94.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone35.addChild(cube_r94);
		setRotationAngle(cube_r94, 0.0F, 0.0F, 0.4363F);
		cube_r94.cubeList.add(new ModelBox(cube_r94, 32, 177, 0.0F, 0.0F, -9.1F, 2, 1, 1, 0.1F, false));

		cube_r95 = new ModelRenderer(this);
		cube_r95.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone35.addChild(cube_r95);
		setRotationAngle(cube_r95, 0.0F, 0.0F, -0.4363F);
		cube_r95.cubeList.add(new ModelBox(cube_r95, 178, 165, -2.0F, 0.0F, -9.1F, 2, 1, 1, 0.1F, false));

		barrelouter7 = new ModelRenderer(this);
		barrelouter7.setRotationPoint(0.0F, 0.0F, 42.9F);
		barrel3.addChild(barrelouter7);
		

		bone36 = new ModelRenderer(this);
		bone36.setRotationPoint(-0.5F, 4.4F, 0.0F);
		barrelouter7.addChild(bone36);
		

		cube_r96 = new ModelRenderer(this);
		cube_r96.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone36.addChild(cube_r96);
		setRotationAngle(cube_r96, 0.0F, 0.0F, -0.4363F);
		cube_r96.cubeList.add(new ModelBox(cube_r96, 130, 116, 0.0F, -1.0F, 0.0F, 2, 1, 1, 0.1F, false));
		cube_r96.cubeList.add(new ModelBox(cube_r96, 130, 116, 0.0F, -1.0F, -3.0F, 2, 1, 1, 0.1F, false));

		cube_r97 = new ModelRenderer(this);
		cube_r97.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone36.addChild(cube_r97);
		setRotationAngle(cube_r97, 0.0F, 0.0F, 0.4363F);
		cube_r97.cubeList.add(new ModelBox(cube_r97, 87, 131, -2.0F, -1.0F, 0.0F, 2, 1, 1, 0.1F, false));
		cube_r97.cubeList.add(new ModelBox(cube_r97, 87, 131, -2.0F, -1.0F, -3.0F, 2, 1, 1, 0.1F, false));

		bone37 = new ModelRenderer(this);
		bone37.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter7.addChild(bone37);
		setRotationAngle(bone37, 0.0F, 0.0F, 1.5708F);
		

		cube_r98 = new ModelRenderer(this);
		cube_r98.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone37.addChild(cube_r98);
		setRotationAngle(cube_r98, 0.0F, 0.0F, 0.4363F);
		cube_r98.cubeList.add(new ModelBox(cube_r98, 130, 41, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.1F, false));
		cube_r98.cubeList.add(new ModelBox(cube_r98, 130, 41, 0.0F, 0.0F, -3.0F, 2, 1, 1, 0.1F, false));

		cube_r99 = new ModelRenderer(this);
		cube_r99.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone37.addChild(cube_r99);
		setRotationAngle(cube_r99, 0.0F, 0.0F, -0.4363F);
		cube_r99.cubeList.add(new ModelBox(cube_r99, 130, 98, -2.0F, 0.0F, 0.0F, 2, 1, 1, 0.1F, false));
		cube_r99.cubeList.add(new ModelBox(cube_r99, 130, 98, -2.0F, 0.0F, -3.0F, 2, 1, 1, 0.1F, false));

		bone38 = new ModelRenderer(this);
		bone38.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter7.addChild(bone38);
		setRotationAngle(bone38, 0.0F, 0.0F, -1.5708F);
		

		cube_r100 = new ModelRenderer(this);
		cube_r100.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone38.addChild(cube_r100);
		setRotationAngle(cube_r100, 0.0F, 0.0F, -0.4363F);
		cube_r100.cubeList.add(new ModelBox(cube_r100, 128, 106, -2.0F, 0.0F, 0.0F, 2, 1, 1, 0.1F, false));
		cube_r100.cubeList.add(new ModelBox(cube_r100, 128, 106, -2.0F, 0.0F, -3.0F, 2, 1, 1, 0.1F, false));

		cube_r101 = new ModelRenderer(this);
		cube_r101.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone38.addChild(cube_r101);
		setRotationAngle(cube_r101, 0.0F, 0.0F, 0.4363F);
		cube_r101.cubeList.add(new ModelBox(cube_r101, 128, 124, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.1F, false));
		cube_r101.cubeList.add(new ModelBox(cube_r101, 128, 124, 0.0F, 0.0F, -3.0F, 2, 1, 1, 0.1F, false));

		bone39 = new ModelRenderer(this);
		bone39.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter7.addChild(bone39);
		

		cube_r102 = new ModelRenderer(this);
		cube_r102.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone39.addChild(cube_r102);
		setRotationAngle(cube_r102, 0.0F, 0.0F, 0.4363F);
		cube_r102.cubeList.add(new ModelBox(cube_r102, 58, 115, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.1F, false));
		cube_r102.cubeList.add(new ModelBox(cube_r102, 58, 115, 0.0F, 0.0F, -3.0F, 2, 1, 1, 0.1F, false));

		cube_r103 = new ModelRenderer(this);
		cube_r103.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone39.addChild(cube_r103);
		setRotationAngle(cube_r103, 0.0F, 0.0F, -0.4363F);
		cube_r103.cubeList.add(new ModelBox(cube_r103, 126, 60, -2.0F, 0.0F, 0.0F, 2, 1, 1, 0.1F, false));
		cube_r103.cubeList.add(new ModelBox(cube_r103, 126, 60, -2.0F, 0.0F, -3.0F, 2, 1, 1, 0.1F, false));

		barrelouter8 = new ModelRenderer(this);
		barrelouter8.setRotationPoint(0.0F, 0.0F, 4.0F);
		barrel3.addChild(barrelouter8);
		

		bone40 = new ModelRenderer(this);
		bone40.setRotationPoint(-0.5F, 4.4F, 0.0F);
		barrelouter8.addChild(bone40);
		

		cube_r104 = new ModelRenderer(this);
		cube_r104.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone40.addChild(cube_r104);
		setRotationAngle(cube_r104, 0.0F, 0.0F, -0.4363F);
		cube_r104.cubeList.add(new ModelBox(cube_r104, 0, 67, 0.0F, -1.0F, -14.0F, 2, 1, 20, 0.05F, false));
		cube_r104.cubeList.add(new ModelBox(cube_r104, 18, 85, 0.0F, -1.0F, 36.8F, 2, 1, 2, 0.05F, false));

		cube_r105 = new ModelRenderer(this);
		cube_r105.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone40.addChild(cube_r105);
		setRotationAngle(cube_r105, 0.0F, 0.0F, 0.4363F);
		cube_r105.cubeList.add(new ModelBox(cube_r105, 49, 68, -2.0F, -1.0F, -14.0F, 2, 1, 20, 0.05F, false));
		cube_r105.cubeList.add(new ModelBox(cube_r105, 67, 86, -2.0F, -1.0F, 36.8F, 2, 1, 2, 0.05F, false));

		bone41 = new ModelRenderer(this);
		bone41.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter8.addChild(bone41);
		setRotationAngle(bone41, 0.0F, 0.0F, 1.5708F);
		

		cube_r106 = new ModelRenderer(this);
		cube_r106.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone41.addChild(cube_r106);
		setRotationAngle(cube_r106, 0.0F, 0.0F, 0.4363F);
		cube_r106.cubeList.add(new ModelBox(cube_r106, 49, 21, 0.0F, 0.0F, -14.0F, 2, 1, 20, 0.05F, false));
		cube_r106.cubeList.add(new ModelBox(cube_r106, 67, 39, 0.0F, 0.0F, 36.8F, 2, 1, 2, 0.05F, false));

		cube_r107 = new ModelRenderer(this);
		cube_r107.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone41.addChild(cube_r107);
		setRotationAngle(cube_r107, 0.0F, 0.0F, -0.4363F);
		cube_r107.cubeList.add(new ModelBox(cube_r107, 49, 47, -2.0F, 0.0F, -14.0F, 2, 1, 20, 0.05F, false));
		cube_r107.cubeList.add(new ModelBox(cube_r107, 67, 65, -2.0F, 0.0F, 36.8F, 2, 1, 2, 0.05F, false));

		bone42 = new ModelRenderer(this);
		bone42.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter8.addChild(bone42);
		setRotationAngle(bone42, 0.0F, 0.0F, -1.5708F);
		

		cube_r108 = new ModelRenderer(this);
		cube_r108.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone42.addChild(cube_r108);
		setRotationAngle(cube_r108, 0.0F, 0.0F, -0.4363F);
		cube_r108.cubeList.add(new ModelBox(cube_r108, 0, 46, -2.0F, 0.0F, -14.0F, 2, 1, 20, 0.05F, false));
		cube_r108.cubeList.add(new ModelBox(cube_r108, 18, 64, -2.0F, 0.0F, 36.8F, 2, 1, 2, 0.05F, false));

		cube_r109 = new ModelRenderer(this);
		cube_r109.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone42.addChild(cube_r109);
		setRotationAngle(cube_r109, 0.0F, 0.0F, 0.4363F);
		cube_r109.cubeList.add(new ModelBox(cube_r109, 49, 0, 0.0F, 0.0F, -14.0F, 2, 1, 20, 0.05F, false));
		cube_r109.cubeList.add(new ModelBox(cube_r109, 67, 18, 0.0F, 0.0F, 36.8F, 2, 1, 2, 0.05F, false));

		bone43 = new ModelRenderer(this);
		bone43.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter8.addChild(bone43);
		

		cube_r110 = new ModelRenderer(this);
		cube_r110.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone43.addChild(cube_r110);
		setRotationAngle(cube_r110, 0.0F, 0.0F, 0.4363F);
		cube_r110.cubeList.add(new ModelBox(cube_r110, 0, 0, 0.0F, 0.0F, -14.0F, 2, 1, 20, 0.05F, false));
		cube_r110.cubeList.add(new ModelBox(cube_r110, 18, 18, 0.0F, 0.0F, 36.8F, 2, 1, 2, 0.05F, false));

		cube_r111 = new ModelRenderer(this);
		cube_r111.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone43.addChild(cube_r111);
		setRotationAngle(cube_r111, 0.0F, 0.0F, -0.4363F);
		cube_r111.cubeList.add(new ModelBox(cube_r111, 0, 21, -2.0F, 0.0F, -14.0F, 2, 1, 20, 0.05F, false));
		cube_r111.cubeList.add(new ModelBox(cube_r111, 18, 39, -2.0F, 0.0F, 36.8F, 2, 1, 2, 0.05F, false));

		ironsights2 = new ModelRenderer(this);
		ironsights2.setRotationPoint(1.0F, -1.2F, 1.5F);
		barrel3.addChild(ironsights2);
		ironsights2.cubeList.add(new ModelBox(ironsights2, 38, 0, -1.1F, -1.1F, -15.4F, 1, 3, 2, -0.3F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 149, 112, -2.1F, -0.9F, 33.6F, 2, 3, 5, -0.3F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 121, 4, -2.9F, -0.9F, 33.6F, 2, 3, 5, -0.299F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 160, 110, -2.9F, -1.1F, 34.6F, 1, 1, 4, -0.301F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 160, 18, -1.1F, -1.3F, 34.6F, 1, 1, 4, -0.301F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 98, 37, -2.9F, -2.485F, 36.62F, 1, 2, 2, -0.301F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 86, 73, -3.0F, -1.56F, 37.22F, 3, 1, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 86, 73, -3.0F, -1.36F, 37.22F, 3, 1, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 86, 73, -3.0F, -1.16F, 37.22F, 3, 1, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 86, 60, -3.0F, -1.76F, 37.22F, 3, 1, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 86, 52, -3.0F, -1.96F, 37.22F, 3, 1, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 125, 161, -1.0F, -2.16F, 37.22F, 1, 1, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 98, 161, -1.2F, -2.16F, 37.22F, 1, 1, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 161, 67, -1.4F, -2.16F, 37.22F, 1, 1, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 161, 65, -1.6F, -2.16F, 37.22F, 1, 1, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 161, 61, -1.7F, -2.16F, 37.22F, 1, 1, 1, -0.401F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 161, 45, -1.7F, -2.26F, 37.22F, 1, 1, 1, -0.402F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 161, 47, -1.6F, -2.26F, 37.22F, 1, 1, 1, -0.401F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 161, 51, -1.4F, -2.26F, 37.22F, 1, 1, 1, -0.401F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 161, 53, -1.2F, -2.26F, 37.22F, 1, 1, 1, -0.401F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 161, 59, -1.0F, -2.26F, 37.22F, 1, 1, 1, -0.401F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 136, 159, -2.3F, -2.26F, 37.22F, 1, 1, 1, -0.402F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 159, 140, -2.4F, -2.26F, 37.22F, 1, 1, 1, -0.401F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 159, 142, -2.6F, -2.26F, 37.22F, 1, 1, 1, -0.401F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 76, 160, -2.8F, -2.26F, 37.22F, 1, 1, 1, -0.401F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 160, 124, -3.0F, -2.26F, 37.22F, 1, 1, 1, -0.401F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 160, 126, -2.3F, -2.16F, 37.22F, 1, 1, 1, -0.401F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 128, 160, -2.4F, -2.16F, 37.22F, 1, 1, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 160, 128, -2.8F, -2.16F, 37.22F, 1, 1, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 139, 160, -3.0F, -2.16F, 37.22F, 1, 1, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 161, 24, -2.6F, -2.16F, 37.22F, 1, 1, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 58, 93, -1.1F, -2.485F, 36.62F, 1, 2, 2, -0.301F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 58, 93, -1.1F, -3.185F, 36.62F, 1, 2, 2, -0.301F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 98, 37, -2.9F, -3.185F, 36.62F, 1, 2, 2, -0.301F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 24, 21, -2.9F, -1.1F, -15.4F, 1, 3, 2, -0.3F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 65, 21, -2.0F, -2.2F, -15.0F, 1, 2, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 49, 0, -3.1F, -0.7F, -14.9F, 1, 1, 1, -0.3F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 49, 0, -0.9F, -0.7F, -14.9F, 1, 1, 1, -0.3F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 73, 81, -2.8F, -3.3517F, -15.4F, 2, 1, 2, -0.3F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 73, 81, -2.2F, -3.3517F, -15.4F, 2, 1, 2, -0.3F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 49, 74, -2.5F, -1.1F, -15.4F, 2, 2, 2, -0.3F, false));

		ironsights_r1 = new ModelRenderer(this);
		ironsights_r1.setRotationPoint(-2.5768F, -2.5187F, -14.4F);
		ironsights2.addChild(ironsights_r1);
		setRotationAngle(ironsights_r1, 0.0F, 0.0F, 0.5236F);
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 38, 0, -0.5F, -0.8F, -1.0F, 1, 2, 2, -0.3F, false));

		ironsights_r2 = new ModelRenderer(this);
		ironsights_r2.setRotationPoint(-0.4232F, -2.5187F, -14.4F);
		ironsights2.addChild(ironsights_r2);
		setRotationAngle(ironsights_r2, 0.0F, 0.0F, -0.5236F);
		ironsights_r2.cubeList.add(new ModelBox(ironsights_r2, 24, 21, -0.5F, -0.8F, -1.0F, 1, 2, 2, -0.3F, false));

		ironsights_r3 = new ModelRenderer(this);
		ironsights_r3.setRotationPoint(-2.7768F, -1.5062F, -14.4F);
		ironsights2.addChild(ironsights_r3);
		setRotationAngle(ironsights_r3, 0.0F, 0.0F, -0.5236F);
		ironsights_r3.cubeList.add(new ModelBox(ironsights_r3, 24, 21, -0.5F, -0.8F, -1.0F, 1, 2, 2, -0.3F, false));

		ironsights_r4 = new ModelRenderer(this);
		ironsights_r4.setRotationPoint(-0.2232F, -1.5062F, -14.4F);
		ironsights2.addChild(ironsights_r4);
		setRotationAngle(ironsights_r4, 0.0F, 0.0F, 0.5236F);
		ironsights_r4.cubeList.add(new ModelBox(ironsights_r4, 38, 0, -0.5F, -0.8F, -1.0F, 1, 2, 2, -0.3F, false));

		ironsights_r5 = new ModelRenderer(this);
		ironsights_r5.setRotationPoint(-1.5F, -1.9291F, 37.1769F);
		ironsights2.addChild(ironsights_r5);
		setRotationAngle(ironsights_r5, 1.0472F, 0.0F, 0.0F);
		ironsights_r5.cubeList.add(new ModelBox(ironsights_r5, 58, 93, 0.4F, -1.0F, -1.0F, 1, 2, 2, -0.301F, false));
		ironsights_r5.cubeList.add(new ModelBox(ironsights_r5, 98, 37, -1.4F, -1.0F, -1.0F, 1, 2, 2, -0.301F, false));

		ironsights_r6 = new ModelRenderer(this);
		ironsights_r6.setRotationPoint(-1.501F, -1.236F, 35.7146F);
		ironsights2.addChild(ironsights_r6);
		setRotationAngle(ironsights_r6, 0.3491F, 0.0F, 0.0F);
		ironsights_r6.cubeList.add(new ModelBox(ironsights_r6, 97, 36, -1.4F, -1.0F, -1.0F, 1, 2, 3, -0.301F, false));
		ironsights_r6.cubeList.add(new ModelBox(ironsights_r6, 57, 92, 0.4F, -1.0F, -1.0F, 1, 2, 3, -0.301F, false));

		cube_r112 = new ModelRenderer(this);
		cube_r112.setRotationPoint(-0.4F, -1.66F, 35.22F);
		ironsights2.addChild(cube_r112);
		setRotationAngle(cube_r112, -0.5236F, 0.0F, 0.0F);
		

		cube_r113 = new ModelRenderer(this);
		cube_r113.setRotationPoint(-2.7F, -1.36F, 40.72F);
		ironsights2.addChild(cube_r113);
		setRotationAngle(cube_r113, 0.3665F, 0.0F, 0.0F);
		

		cube_r114 = new ModelRenderer(this);
		cube_r114.setRotationPoint(-0.4F, -1.16F, 33.92F);
		ironsights2.addChild(cube_r114);
		setRotationAngle(cube_r114, 0.3665F, 0.0F, 0.0F);
		

		cube_r115 = new ModelRenderer(this);
		cube_r115.setRotationPoint(-0.8F, -0.6F, 32.9F);
		ironsights2.addChild(cube_r115);
		setRotationAngle(cube_r115, -0.7156F, 0.0F, 0.0F);
		cube_r115.cubeList.add(new ModelBox(cube_r115, 49, 63, -1.7F, -1.3561F, 0.4547F, 2, 1, 1, -0.302F, false));
		cube_r115.cubeList.add(new ModelBox(cube_r115, 73, 68, -0.3F, -2.3561F, 0.4547F, 1, 2, 2, -0.302F, false));
		cube_r115.cubeList.add(new ModelBox(cube_r115, 98, 47, -2.1F, -2.3561F, 0.4547F, 1, 2, 2, -0.302F, false));

		stock = new ModelRenderer(this);
		stock.setRotationPoint(0.0F, -0.2F, 4.0F);
		gun.addChild(stock);
		

		gun365 = new ModelRenderer(this);
		gun365.setRotationPoint(2.6F, -36.0F, 3.5F);
		stock.addChild(gun365);
		setRotationAngle(gun365, -0.0986F, 0.0F, 0.0F);
		gun365.cubeList.add(new ModelBox(gun365, 158, 103, -1.75F, 3.0F, -2.4F, 1, 1, 18, 0.0F, false));
		gun365.cubeList.add(new ModelBox(gun365, 158, 104, -7.35F, 3.0F, -2.4F, 1, 1, 18, 0.0F, false));
		gun365.cubeList.add(new ModelBox(gun365, 173, 118, -1.95F, 2.6F, -5.4F, 1, 2, 3, 0.0F, false));
		gun365.cubeList.add(new ModelBox(gun365, 173, 119, -7.15F, 2.6F, -5.4F, 1, 2, 3, 0.0F, false));
		gun365.cubeList.add(new ModelBox(gun365, 157, 103, -7.35F, 3.4F, -2.4F, 1, 1, 18, 0.0F, false));
		gun365.cubeList.add(new ModelBox(gun365, 44, 120, -1.75F, 3.4F, -2.4F, 1, 1, 18, 0.0F, false));
		gun365.cubeList.add(new ModelBox(gun365, 158, 103, -7.35F, 3.4F, 8.7F, 1, 1, 18, 0.0F, false));
		gun365.cubeList.add(new ModelBox(gun365, 158, 103, -1.75F, 3.4F, 8.7F, 1, 1, 18, 0.0F, false));
		gun365.cubeList.add(new ModelBox(gun365, 157, 103, -7.35F, 3.0F, 8.7F, 1, 1, 18, 0.0F, false));
		gun365.cubeList.add(new ModelBox(gun365, 157, 103, -1.75F, 3.0F, 8.7F, 1, 1, 18, 0.0F, false));

		gun244 = new ModelRenderer(this);
		gun244.setRotationPoint(-0.6F, -32.9F, 29.7F);
		stock.addChild(gun244);
		setRotationAngle(gun244, -0.0873F, 0.0F, 0.0F);
		gun244.cubeList.add(new ModelBox(gun244, 20, 19, 1.0F, 0.0523F, 0.4023F, 1, 10, 1, 0.0F, false));
		gun244.cubeList.add(new ModelBox(gun244, 36, 23, 1.0F, 2.0523F, -0.5977F, 1, 2, 1, 0.0F, false));

		gun243 = new ModelRenderer(this);
		gun243.setRotationPoint(-3.4F, -32.9F, 29.7F);
		stock.addChild(gun243);
		setRotationAngle(gun243, -0.0873F, 0.0F, 0.0F);
		gun243.cubeList.add(new ModelBox(gun243, 20, 20, -1.0F, 0.0523F, 0.4023F, 1, 10, 1, 0.0F, false));
		gun243.cubeList.add(new ModelBox(gun243, 176, 28, -1.0F, 2.0523F, -0.5977F, 1, 2, 1, 0.0F, false));

		gun242 = new ModelRenderer(this);
		gun242.setRotationPoint(-2.9F, -33.9F, 30.8F);
		stock.addChild(gun242);
		setRotationAngle(gun242, -0.0873F, 0.0F, 0.0F);
		gun242.cubeList.add(new ModelBox(gun242, 179, 120, -0.6F, 10.0513F, -0.5967F, 2, 2, 1, 0.0F, false));
		gun242.cubeList.add(new ModelBox(gun242, 184, 121, 1.4F, 10.0513F, -0.5967F, 2, 2, 1, 0.0F, false));

		gun241 = new ModelRenderer(this);
		gun241.setRotationPoint(-3.5F, -23.9F, 28.6F);
		stock.addChild(gun241);
		setRotationAngle(gun241, -0.0873F, 0.0F, 0.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(6.8284F, 1.8976F, 0.723F);
		gun241.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 52, 136, -1.7F, -3.0F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 52, 136, -2.0F, -3.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(2.1213F, 2.6047F, 0.723F);
		gun241.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 68, 124, -1.0F, -3.3F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 48, 26, -1.0F, -3.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun240 = new ModelRenderer(this);
		gun240.setRotationPoint(-3.5F, -29.7F, 26.4F);
		stock.addChild(gun240);
		setRotationAngle(gun240, -0.1115F, 0.0F, 0.0F);
		

		gun239 = new ModelRenderer(this);
		gun239.setRotationPoint(-3.5F, -33.6F, 3.5F);
		stock.addChild(gun239);
		setRotationAngle(gun239, -0.2974F, 0.0F, 0.0F);
		

		gun238 = new ModelRenderer(this);
		gun238.setRotationPoint(-3.5F, -34.6F, 12.75F);
		stock.addChild(gun238);
		setRotationAngle(gun238, -0.0873F, 0.0F, 0.0F);
		

		gun237 = new ModelRenderer(this);
		gun237.setRotationPoint(-3.0F, -35.5F, 12.95F);
		stock.addChild(gun237);
		setRotationAngle(gun237, -0.0873F, 0.0F, 0.0F);
		

		gun236 = new ModelRenderer(this);
		gun236.setRotationPoint(-3.0F, -33.2F, 8.5F);
		stock.addChild(gun236);
		setRotationAngle(gun236, 0.4833F, 0.0F, 0.0F);
		

		gun235 = new ModelRenderer(this);
		gun235.setRotationPoint(-3.5F, -32.3F, 8.5F);
		stock.addChild(gun235);
		setRotationAngle(gun235, 0.4833F, 0.0F, 0.0F);
		

		gun234 = new ModelRenderer(this);
		gun234.setRotationPoint(-3.0F, -35.9F, 3.5F);
		stock.addChild(gun234);
		setRotationAngle(gun234, -0.1859F, 0.0F, 0.0F);
		

		gun233 = new ModelRenderer(this);
		gun233.setRotationPoint(-3.5F, -34.9F, 3.5F);
		stock.addChild(gun233);
		setRotationAngle(gun233, -0.1859F, 0.0F, 0.0F);
		
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