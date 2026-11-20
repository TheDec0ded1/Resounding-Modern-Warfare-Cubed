package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SR3MPDustCover extends ModelBase {
	private final ModelRenderer dustcover;
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
	private final ModelRenderer opticmount;
	private final ModelRenderer vssm_dustcover;
	private final ModelRenderer vssm_dustcover_r1;
	private final ModelRenderer vssm_dustcover_r2;
	private final ModelRenderer vssm_dustcover_r3;
	private final ModelRenderer vssm_dustcover_r4;
	private final ModelRenderer vssm_dustcover_r5;
	private final ModelRenderer vssm_dustcover_r6;
	private final ModelRenderer cube_r46;
	private final ModelRenderer cube_r47;
	private final ModelRenderer cube_r48;
	private final ModelRenderer cube_r49;
	private final ModelRenderer cube_r50;
	private final ModelRenderer cube_r51;
	private final ModelRenderer cube_r52;
	private final ModelRenderer cube_r53;
	private final ModelRenderer gun138;
	private final ModelRenderer gun165;
	private final ModelRenderer vssm_dustcover2;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer gun25;
	private final ModelRenderer gun26;

	public SR3MPDustCover() {
		textureWidth = 256;
		textureHeight = 256;

		dustcover = new ModelRenderer(this);
		dustcover.setRotationPoint(0.0F, 24.0F, 0.0F);
		dustcover.cubeList.add(new ModelBox(dustcover, 162, 92, -2.0F, -39.35F, -11.0F, 1, 1, 4, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 162, 97, -2.0F, -39.35F, -17.0F, 1, 1, 4, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 163, 0, -2.0F, -39.35F, -23.0F, 1, 1, 4, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 98, 129, -2.0F, -39.35F, -27.0F, 1, 1, 2, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 64, 164, -2.0F, -39.3F, -6.5F, 1, 1, 1, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 68, 164, -2.0F, -39.3F, -12.5F, 1, 1, 1, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 164, 74, -2.0F, -39.3F, -18.5F, 1, 1, 1, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 164, 76, -2.0F, -39.3F, -24.5F, 1, 1, 1, 0.0F, false));

		gun118 = new ModelRenderer(this);
		gun118.setRotationPoint(-1.0F, -39.2F, -26.5F);
		dustcover.addChild(gun118);
		setRotationAngle(gun118, 0.0F, 0.0F, 0.4461F);
		gun118.cubeList.add(new ModelBox(gun118, 179, 88, 0.0F, 0.0F, 0.01F, 1, 2, 26, 0.0F, false));

		gun120 = new ModelRenderer(this);
		gun120.setRotationPoint(-0.1F, -38.75F, -26.5F);
		dustcover.addChild(gun120);
		setRotationAngle(gun120, 0.0F, 0.0F, 1.1897F);
		gun120.cubeList.add(new ModelBox(gun120, 190, 143, 0.0F, 0.0F, 0.0F, 1, 1, 26, 0.0F, false));

		gun123 = new ModelRenderer(this);
		gun123.setRotationPoint(0.25F, -37.8F, -26.5F);
		dustcover.addChild(gun123);
		setRotationAngle(gun123, 0.0F, 0.0F, 1.45F);
		gun123.cubeList.add(new ModelBox(gun123, 76, 139, 0.0F, 0.0F, 0.0F, 3, 1, 27, 0.0F, false));

		gun119 = new ModelRenderer(this);
		gun119.setRotationPoint(-2.0F, -39.2F, -26.5F);
		dustcover.addChild(gun119);
		setRotationAngle(gun119, 0.0F, 0.0F, 1.0782F);
		gun119.cubeList.add(new ModelBox(gun119, 192, 170, 0.0F, 0.0F, 0.01F, 1, 1, 26, 0.0F, false));

		gun121 = new ModelRenderer(this);
		gun121.setRotationPoint(-2.9F, -38.7F, -26.5F);
		dustcover.addChild(gun121);
		setRotationAngle(gun121, 0.0F, 0.0F, 0.3346F);
		gun121.cubeList.add(new ModelBox(gun121, 143, 191, 0.0F, 0.0F, 0.0F, 1, 1, 26, 0.0F, false));

		gun142 = new ModelRenderer(this);
		gun142.setRotationPoint(-3.2F, -37.8F, -14.5F);
		dustcover.addChild(gun142);
		setRotationAngle(gun142, 0.0F, 0.0F, 0.1487F);
		gun142.cubeList.add(new ModelBox(gun142, 220, 170, 0.0F, 0.0F, 0.0F, 1, 1, 15, 0.0F, false));
		gun142.cubeList.add(new ModelBox(gun142, 0, 155, 0.0F, 0.5F, 0.0F, 1, 1, 6, -0.001F, false));
		gun142.cubeList.add(new ModelBox(gun142, 49, 21, 0.0F, 1.0F, 6.0F, 1, 2, 9, 0.0F, false));

		gun116 = new ModelRenderer(this);
		gun116.setRotationPoint(-2.0F, -39.2F, -26.5F);
		dustcover.addChild(gun116);
		gun116.cubeList.add(new ModelBox(gun116, 171, 197, 0.0F, 0.0F, 0.0F, 1, 1, 26, 0.0F, false));

		gun186 = new ModelRenderer(this);
		gun186.setRotationPoint(-2.0F, -39.35F, -4.5F);
		dustcover.addChild(gun186);
		gun186.cubeList.add(new ModelBox(gun186, 109, 161, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun158 = new ModelRenderer(this);
		gun158.setRotationPoint(-2.0F, -39.3F, -6.5F);
		dustcover.addChild(gun158);
		setRotationAngle(gun158, 0.0F, 0.0F, 1.0782F);
		gun158.cubeList.add(new ModelBox(gun158, 46, 163, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun162 = new ModelRenderer(this);
		gun162.setRotationPoint(-2.9F, -38.8F, -6.5F);
		dustcover.addChild(gun162);
		setRotationAngle(gun162, 0.0F, 0.0F, 0.3346F);
		gun162.cubeList.add(new ModelBox(gun162, 163, 2, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun182 = new ModelRenderer(this);
		gun182.setRotationPoint(-3.25F, -37.9F, -6.5F);
		dustcover.addChild(gun182);
		setRotationAngle(gun182, 0.0F, 0.0F, 0.1487F);
		gun182.cubeList.add(new ModelBox(gun182, 0, 67, 0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

		gun181 = new ModelRenderer(this);
		gun181.setRotationPoint(-3.25F, -37.9F, -12.5F);
		dustcover.addChild(gun181);
		setRotationAngle(gun181, 0.0F, 0.0F, 0.1487F);
		gun181.cubeList.add(new ModelBox(gun181, 162, 97, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun181.cubeList.add(new ModelBox(gun181, 8, 159, 0.0F, 0.5F, 0.0F, 1, 1, 1, -0.001F, false));

		gun157 = new ModelRenderer(this);
		gun157.setRotationPoint(-2.0F, -39.3F, -12.5F);
		dustcover.addChild(gun157);
		setRotationAngle(gun157, 0.0F, 0.0F, 1.0782F);
		gun157.cubeList.add(new ModelBox(gun157, 98, 163, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun161 = new ModelRenderer(this);
		gun161.setRotationPoint(-2.9F, -38.8F, -12.5F);
		dustcover.addChild(gun161);
		setRotationAngle(gun161, 0.0F, 0.0F, 0.3346F);
		gun161.cubeList.add(new ModelBox(gun161, 163, 5, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun160 = new ModelRenderer(this);
		gun160.setRotationPoint(-2.9F, -38.8F, -18.5F);
		dustcover.addChild(gun160);
		setRotationAngle(gun160, 0.0F, 0.0F, 0.3346F);
		gun160.cubeList.add(new ModelBox(gun160, 163, 7, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun156 = new ModelRenderer(this);
		gun156.setRotationPoint(-2.0F, -39.3F, -18.5F);
		dustcover.addChild(gun156);
		setRotationAngle(gun156, 0.0F, 0.0F, 1.0782F);
		gun156.cubeList.add(new ModelBox(gun156, 163, 146, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun155 = new ModelRenderer(this);
		gun155.setRotationPoint(-2.0F, -39.3F, -24.5F);
		dustcover.addChild(gun155);
		setRotationAngle(gun155, 0.0F, 0.0F, 1.0782F);
		gun155.cubeList.add(new ModelBox(gun155, 163, 148, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun159 = new ModelRenderer(this);
		gun159.setRotationPoint(-2.9F, -38.8F, -24.5F);
		dustcover.addChild(gun159);
		setRotationAngle(gun159, 0.0F, 0.0F, 0.3346F);
		gun159.cubeList.add(new ModelBox(gun159, 39, 163, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun163 = new ModelRenderer(this);
		gun163.setRotationPoint(-2.5F, -38.3F, -26.5F);
		dustcover.addChild(gun163);
		setRotationAngle(gun163, 0.0F, 0.0F, 1.041F);
		gun163.cubeList.add(new ModelBox(gun163, 116, 19, 0.0F, 0.0F, 0.0F, 1, 1, 12, 0.0F, false));

		gun164 = new ModelRenderer(this);
		gun164.setRotationPoint(-3.75F, -36.9F, -14.5F);
		dustcover.addChild(gun164);
		setRotationAngle(gun164, -0.0873F, 0.0F, 0.0F);
		gun164.cubeList.add(new ModelBox(gun164, 17, 162, -0.2F, -0.2F, -0.2F, 1, 1, 6, -0.2F, false));
		gun164.cubeList.add(new ModelBox(gun164, 125, 159, -0.2F, -0.2F, 5.2F, 1, 1, 1, -0.201F, false));

		gun146 = new ModelRenderer(this);
		gun146.setRotationPoint(-1.0F, -39.3F, -6.5F);
		dustcover.addChild(gun146);
		setRotationAngle(gun146, 0.0F, 0.0F, 0.4461F);
		gun146.cubeList.add(new ModelBox(gun146, 9, 164, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun150 = new ModelRenderer(this);
		gun150.setRotationPoint(-0.1F, -38.9F, -6.5F);
		dustcover.addChild(gun150);
		setRotationAngle(gun150, 0.0F, 0.0F, 1.1897F);
		gun150.cubeList.add(new ModelBox(gun150, 163, 150, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun154 = new ModelRenderer(this);
		gun154.setRotationPoint(0.3F, -37.95F, -6.5F);
		dustcover.addChild(gun154);
		setRotationAngle(gun154, 0.0F, 0.0F, 1.45F);
		gun154.cubeList.add(new ModelBox(gun154, 68, 106, 0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun145 = new ModelRenderer(this);
		gun145.setRotationPoint(-1.0F, -39.3F, -12.5F);
		dustcover.addChild(gun145);
		setRotationAngle(gun145, 0.0F, 0.0F, 0.4461F);
		gun145.cubeList.add(new ModelBox(gun145, 17, 164, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun149 = new ModelRenderer(this);
		gun149.setRotationPoint(-0.1F, -38.9F, -12.5F);
		dustcover.addChild(gun149);
		setRotationAngle(gun149, 0.0F, 0.0F, 1.1897F);
		gun149.cubeList.add(new ModelBox(gun149, 163, 153, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun153 = new ModelRenderer(this);
		gun153.setRotationPoint(0.3F, -37.95F, -12.5F);
		dustcover.addChild(gun153);
		setRotationAngle(gun153, 0.0F, 0.0F, 1.45F);
		gun153.cubeList.add(new ModelBox(gun153, 0, 109, 0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun144 = new ModelRenderer(this);
		gun144.setRotationPoint(-1.0F, -39.3F, -18.5F);
		dustcover.addChild(gun144);
		setRotationAngle(gun144, 0.0F, 0.0F, 0.4461F);
		gun144.cubeList.add(new ModelBox(gun144, 164, 23, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun148 = new ModelRenderer(this);
		gun148.setRotationPoint(-0.1F, -38.9F, -18.5F);
		dustcover.addChild(gun148);
		setRotationAngle(gun148, 0.0F, 0.0F, 1.1897F);
		gun148.cubeList.add(new ModelBox(gun148, 154, 163, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun152 = new ModelRenderer(this);
		gun152.setRotationPoint(0.3F, -37.95F, -18.5F);
		dustcover.addChild(gun152);
		setRotationAngle(gun152, 0.0F, 0.0F, 1.45F);
		gun152.cubeList.add(new ModelBox(gun152, 116, 60, 0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun143 = new ModelRenderer(this);
		gun143.setRotationPoint(-1.0F, -39.3F, -24.5F);
		dustcover.addChild(gun143);
		setRotationAngle(gun143, 0.0F, 0.0F, 0.4461F);
		gun143.cubeList.add(new ModelBox(gun143, 56, 164, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun147 = new ModelRenderer(this);
		gun147.setRotationPoint(-0.1F, -38.9F, -24.5F);
		dustcover.addChild(gun147);
		setRotationAngle(gun147, 0.0F, 0.0F, 1.1897F);
		gun147.cubeList.add(new ModelBox(gun147, 0, 164, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun151 = new ModelRenderer(this);
		gun151.setRotationPoint(0.3F, -37.95F, -24.5F);
		dustcover.addChild(gun151);
		setRotationAngle(gun151, 0.0F, 0.0F, 1.45F);
		gun151.cubeList.add(new ModelBox(gun151, 116, 78, 0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun117 = new ModelRenderer(this);
		gun117.setRotationPoint(0.25F, -35.7F, -26.5F);
		dustcover.addChild(gun117);
		setRotationAngle(gun117, 0.0F, 0.0F, 0.7436F);
		gun117.cubeList.add(new ModelBox(gun117, 160, 162, 0.0F, 0.0F, -0.01F, 1, 1, 28, 0.0F, false));

		gun128 = new ModelRenderer(this);
		gun128.setRotationPoint(-2.0F, -39.2F, -0.5F);
		dustcover.addChild(gun128);
		setRotationAngle(gun128, -0.8378F, 0.0F, 0.0F);
		gun128.cubeList.add(new ModelBox(gun128, 165, 38, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun130 = new ModelRenderer(this);
		gun130.setRotationPoint(-2.5F, -39.0F, -0.3F);
		dustcover.addChild(gun130);
		setRotationAngle(gun130, -0.8378F, 0.0F, 0.0F);
		gun130.cubeList.add(new ModelBox(gun130, 132, 60, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun129 = new ModelRenderer(this);
		gun129.setRotationPoint(-3.0F, -38.5F, 0.15F);
		dustcover.addChild(gun129);
		setRotationAngle(gun129, -0.8378F, 0.0F, 0.0F);
		gun129.cubeList.add(new ModelBox(gun129, 83, 85, 0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F, false));

		gun126 = new ModelRenderer(this);
		gun126.setRotationPoint(0.3F, -37.0F, 0.5F);
		dustcover.addChild(gun126);
		setRotationAngle(gun126, 0.0F, 0.0F, 1.4128F);
		gun126.cubeList.add(new ModelBox(gun126, 26, 133, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun124 = new ModelRenderer(this);
		gun124.setRotationPoint(-3.3F, -37.0F, 0.5F);
		dustcover.addChild(gun124);
		gun124.cubeList.add(new ModelBox(gun124, 9, 108, 0.0F, 0.0F, 0.02F, 3, 2, 1, 0.0F, false));

		gun125 = new ModelRenderer(this);
		gun125.setRotationPoint(-0.7F, -37.0F, 0.5F);
		dustcover.addChild(gun125);
		gun125.cubeList.add(new ModelBox(gun125, 0, 82, 0.0F, 0.0F, 0.01F, 1, 2, 1, 0.0F, false));

		gun127 = new ModelRenderer(this);
		gun127.setRotationPoint(-3.3F, -37.0F, 0.5F);
		dustcover.addChild(gun127);
		setRotationAngle(gun127, 0.0F, 0.0F, 0.1745F);
		gun127.cubeList.add(new ModelBox(gun127, 78, 36, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun139 = new ModelRenderer(this);
		gun139.setRotationPoint(-3.75F, -36.4F, -8.55F);
		dustcover.addChild(gun139);
		setRotationAngle(gun139, -0.8179F, 0.0F, 0.0F);
		gun139.cubeList.add(new ModelBox(gun139, 10, 126, -0.21F, -0.2F, -0.2F, 1, 1, 2, -0.2F, false));

		opticmount = new ModelRenderer(this);
		opticmount.setRotationPoint(0.0F, 7.0F, 0.0F);
		dustcover.addChild(opticmount);
		

		vssm_dustcover = new ModelRenderer(this);
		vssm_dustcover.setRotationPoint(-0.5F, -35.45F, -26.5F);
		opticmount.addChild(vssm_dustcover);
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 86, 178, -2.0F, -11.3F, 0.0F, 2, 1, 21, -0.1F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 123, 19, -1.0F, -11.8F, 18.2F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 123, 21, -1.0F, -11.8F, 17.8F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 109, 123, -2.0F, -11.8F, 18.2F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 49, 124, -2.0F, -11.8F, 17.8F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 126, 93, -1.0F, -11.8F, 19.4F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 126, 95, -1.0F, -11.8F, 19.8F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 126, 111, -2.0F, -11.8F, 19.8F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 127, 37, -2.0F, -11.8F, 19.4F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 59, 130, -1.0F, -11.8F, 20.2F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 40, 131, -2.0F, -11.8F, 20.2F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 33, 117, -1.0F, -11.8F, 13.4F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 40, 118, -1.0F, -11.8F, 13.0F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 24, 120, -2.0F, -11.8F, 13.4F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 73, 120, -2.0F, -11.8F, 13.0F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 90, 121, -1.0F, -11.8F, 14.6F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 98, 121, -1.0F, -11.8F, 15.0F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 109, 121, -2.0F, -11.8F, 15.0F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 24, 122, -2.0F, -11.8F, 14.6F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 122, 49, -1.0F, -11.8F, 16.6F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 60, 122, -1.0F, -11.8F, 16.2F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 122, 65, -2.0F, -11.8F, 16.6F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 122, 67, -2.0F, -11.8F, 16.2F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 110, 101, -1.0F, -11.8F, 8.6F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 110, 103, -1.0F, -11.8F, 8.2F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 73, 112, -2.0F, -11.8F, 8.6F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 98, 113, -2.0F, -11.8F, 8.2F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 18, 115, -1.0F, -11.8F, 9.8F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 24, 115, -1.0F, -11.8F, 10.2F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 33, 115, -2.0F, -11.8F, 10.2F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 116, 47, -2.0F, -11.8F, 9.8F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 116, 54, -1.0F, -11.8F, 11.8F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 116, 70, -1.0F, -11.8F, 11.4F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 116, 72, -2.0F, -11.8F, 11.8F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 73, 116, -2.0F, -11.8F, 11.4F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 90, 12, -1.0F, -11.8F, 3.8F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 90, 21, -1.0F, -11.8F, 3.4F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 90, 33, -2.0F, -11.8F, 3.8F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 26, 92, -2.0F, -11.8F, 3.4F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 98, 2, -1.0F, -11.8F, 5.0F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 101, 88, -1.0F, -11.8F, 5.4F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 98, 101, -2.0F, -11.8F, 5.4F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 33, 104, -2.0F, -11.8F, 5.0F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 78, 17, -1.0F, -11.8F, 0.6F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 12, 82, -1.0F, -11.8F, 0.2F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 84, 21, -2.0F, -11.8F, 0.6F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 84, 23, -2.0F, -11.8F, 0.2F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 64, 68, -1.0F, -11.8F, -0.2F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 77, 10, -2.0F, -11.8F, -0.2F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 41, 85, -1.0F, -11.8F, 1.8F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 81, 85, -1.0F, -11.8F, 2.2F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 34, 88, -2.0F, -11.8F, 2.2F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 90, 0, -2.0F, -11.8F, 1.8F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 33, 106, -1.0F, -11.8F, 7.0F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 110, 37, -1.0F, -11.8F, 6.6F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 110, 39, -2.0F, -11.8F, 7.0F, 1, 1, 1, -0.301F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 110, 60, -2.0F, -11.8F, 6.6F, 1, 1, 1, -0.301F, false));

		vssm_dustcover_r1 = new ModelRenderer(this);
		vssm_dustcover_r1.setRotationPoint(0.1989F, -11.4476F, 18.3307F);
		vssm_dustcover.addChild(vssm_dustcover_r1);
		setRotationAngle(vssm_dustcover_r1, 0.0F, -0.3054F, 1.0908F);
		vssm_dustcover_r1.cubeList.add(new ModelBox(vssm_dustcover_r1, 219, 218, 1.8F, -0.3F, -3.5F, 1, 1, 4, -0.1F, false));

		vssm_dustcover_r2 = new ModelRenderer(this);
		vssm_dustcover_r2.setRotationPoint(0.6133F, -10.6515F, 10.5F);
		vssm_dustcover.addChild(vssm_dustcover_r2);
		setRotationAngle(vssm_dustcover_r2, 0.0F, 0.0F, 1.0908F);
		vssm_dustcover_r2.cubeList.add(new ModelBox(vssm_dustcover_r2, 223, 220, 1.6F, -0.3F, 5.1F, 1, 1, 1, -0.1F, false));
		vssm_dustcover_r2.cubeList.add(new ModelBox(vssm_dustcover_r2, 220, 217, 0.8F, -0.3F, 4.6F, 1, 1, 4, -0.1F, false));
		vssm_dustcover_r2.cubeList.add(new ModelBox(vssm_dustcover_r2, 122, 184, 0.8F, -0.3F, -10.5F, 2, 1, 16, -0.1F, false));

		vssm_dustcover_r3 = new ModelRenderer(this);
		vssm_dustcover_r3.setRotationPoint(2.15F, -11.6763F, 12.5F);
		vssm_dustcover.addChild(vssm_dustcover_r3);
		setRotationAngle(vssm_dustcover_r3, 0.0F, 0.0F, 1.5708F);
		vssm_dustcover_r3.cubeList.add(new ModelBox(vssm_dustcover_r3, 217, 216, 5.8F, -0.7F, -5.5F, 2, 2, 6, -0.1F, false));

		vssm_dustcover_r4 = new ModelRenderer(this);
		vssm_dustcover_r4.setRotationPoint(1.3369F, -11.1702F, 10.5F);
		vssm_dustcover.addChild(vssm_dustcover_r4);
		setRotationAngle(vssm_dustcover_r4, 0.0F, 0.0F, 1.3963F);
		vssm_dustcover_r4.cubeList.add(new ModelBox(vssm_dustcover_r4, 207, 206, 2.8F, -0.3F, -10.5F, 2, 1, 16, -0.1F, false));

		vssm_dustcover_r5 = new ModelRenderer(this);
		vssm_dustcover_r5.setRotationPoint(2.15F, -9.4763F, 10.5F);
		vssm_dustcover.addChild(vssm_dustcover_r5);
		setRotationAngle(vssm_dustcover_r5, 0.0F, 0.0F, 1.5708F);
		vssm_dustcover_r5.cubeList.add(new ModelBox(vssm_dustcover_r5, 207, 206, 2.8F, -0.3F, -10.5F, 1, 1, 16, -0.1F, false));

		vssm_dustcover_r6 = new ModelRenderer(this);
		vssm_dustcover_r6.setRotationPoint(0.3705F, -10.3348F, 10.5F);
		vssm_dustcover.addChild(vssm_dustcover_r6);
		setRotationAngle(vssm_dustcover_r6, 0.0F, 0.0F, 0.6545F);
		vssm_dustcover_r6.cubeList.add(new ModelBox(vssm_dustcover_r6, 202, 201, -1.0F, -0.3F, -10.5F, 2, 1, 21, -0.1F, false));

		cube_r46 = new ModelRenderer(this);
		cube_r46.setRotationPoint(-2.2F, 0.2F, 0.0F);
		vssm_dustcover.addChild(cube_r46);
		setRotationAngle(cube_r46, 0.0F, 0.0F, 0.2793F);
		

		cube_r47 = new ModelRenderer(this);
		cube_r47.setRotationPoint(0.2F, 0.2F, 0.0F);
		vssm_dustcover.addChild(cube_r47);
		setRotationAngle(cube_r47, 0.0F, 0.0F, -0.2793F);
		

		cube_r48 = new ModelRenderer(this);
		cube_r48.setRotationPoint(0.2F, 0.2F, 0.0F);
		vssm_dustcover.addChild(cube_r48);
		setRotationAngle(cube_r48, 0.5236F, 0.0F, -0.2793F);
		

		cube_r49 = new ModelRenderer(this);
		cube_r49.setRotationPoint(-2.2F, 0.2F, 0.0F);
		vssm_dustcover.addChild(cube_r49);
		setRotationAngle(cube_r49, 0.5236F, 0.0F, 0.2793F);
		

		cube_r50 = new ModelRenderer(this);
		cube_r50.setRotationPoint(-2.2F, 0.2F, -1.0F);
		vssm_dustcover.addChild(cube_r50);
		setRotationAngle(cube_r50, -0.4712F, 0.0F, 0.2793F);
		

		cube_r51 = new ModelRenderer(this);
		cube_r51.setRotationPoint(-0.5F, 4.4F, 27.0F);
		vssm_dustcover.addChild(cube_r51);
		setRotationAngle(cube_r51, 0.2269F, 0.0F, 0.0F);
		

		cube_r52 = new ModelRenderer(this);
		cube_r52.setRotationPoint(-1.7F, -0.5F, 7.3F);
		vssm_dustcover.addChild(cube_r52);
		setRotationAngle(cube_r52, 0.0F, 0.0F, 0.8029F);
		cube_r52.cubeList.add(new ModelBox(cube_r52, 110, 98, -8.2131F, -7.9409F, -0.3F, 1, 1, 1, -0.302F, false));
		cube_r52.cubeList.add(new ModelBox(cube_r52, 110, 78, -8.2131F, -7.9409F, -0.7F, 1, 1, 1, -0.302F, false));
		cube_r52.cubeList.add(new ModelBox(cube_r52, 89, 89, -8.2131F, -7.9409F, -5.1F, 1, 1, 1, -0.302F, false));
		cube_r52.cubeList.add(new ModelBox(cube_r52, 89, 42, -8.2131F, -7.9409F, -5.5F, 1, 1, 1, -0.302F, false));
		cube_r52.cubeList.add(new ModelBox(cube_r52, 32, 63, -8.2131F, -7.9409F, -7.5F, 1, 1, 1, -0.302F, false));
		cube_r52.cubeList.add(new ModelBox(cube_r52, 84, 33, -8.2131F, -7.9409F, -7.1F, 1, 1, 1, -0.302F, false));
		cube_r52.cubeList.add(new ModelBox(cube_r52, 84, 31, -8.2131F, -7.9409F, -6.7F, 1, 1, 1, -0.302F, false));
		cube_r52.cubeList.add(new ModelBox(cube_r52, 98, 103, -8.2131F, -7.9409F, -1.9F, 1, 1, 1, -0.302F, false));
		cube_r52.cubeList.add(new ModelBox(cube_r52, 101, 98, -8.2131F, -7.9409F, -2.3F, 1, 1, 1, -0.302F, false));
		cube_r52.cubeList.add(new ModelBox(cube_r52, 98, 0, -8.2131F, -7.9409F, -3.9F, 1, 1, 1, -0.302F, false));
		cube_r52.cubeList.add(new ModelBox(cube_r52, 40, 92, -8.2131F, -7.9409F, -3.5F, 1, 1, 1, -0.302F, false));
		cube_r52.cubeList.add(new ModelBox(cube_r52, 24, 117, -8.2131F, -7.9409F, 4.5F, 1, 1, 1, -0.302F, false));
		cube_r52.cubeList.add(new ModelBox(cube_r52, 18, 117, -8.2131F, -7.9409F, 4.1F, 1, 1, 1, -0.302F, false));
		cube_r52.cubeList.add(new ModelBox(cube_r52, 116, 21, -8.2131F, -7.9409F, 2.9F, 1, 1, 1, -0.302F, false));
		cube_r52.cubeList.add(new ModelBox(cube_r52, 116, 19, -8.2131F, -7.9409F, 2.5F, 1, 1, 1, -0.302F, false));
		cube_r52.cubeList.add(new ModelBox(cube_r52, 73, 114, -8.2131F, -7.9409F, 0.9F, 1, 1, 1, -0.302F, false));
		cube_r52.cubeList.add(new ModelBox(cube_r52, 49, 114, -8.2131F, -7.9409F, 1.3F, 1, 1, 1, -0.302F, false));
		cube_r52.cubeList.add(new ModelBox(cube_r52, 122, 72, -8.2131F, -7.9409F, 9.3F, 1, 1, 1, -0.302F, false));
		cube_r52.cubeList.add(new ModelBox(cube_r52, 122, 70, -8.2131F, -7.9409F, 8.9F, 1, 1, 1, -0.302F, false));
		cube_r52.cubeList.add(new ModelBox(cube_r52, 18, 122, -8.2131F, -7.9409F, 7.7F, 1, 1, 1, -0.302F, false));
		cube_r52.cubeList.add(new ModelBox(cube_r52, 122, 5, -8.2131F, -7.9409F, 7.3F, 1, 1, 1, -0.302F, false));
		cube_r52.cubeList.add(new ModelBox(cube_r52, 121, 12, -8.2131F, -7.9409F, 5.7F, 1, 1, 1, -0.302F, false));
		cube_r52.cubeList.add(new ModelBox(cube_r52, 120, 116, -8.2131F, -7.9409F, 6.1F, 1, 1, 1, -0.302F, false));
		cube_r52.cubeList.add(new ModelBox(cube_r52, 132, 47, -8.2131F, -7.9409F, 12.9F, 1, 1, 1, -0.302F, false));
		cube_r52.cubeList.add(new ModelBox(cube_r52, 127, 12, -8.2131F, -7.9409F, 12.5F, 1, 1, 1, -0.302F, false));
		cube_r52.cubeList.add(new ModelBox(cube_r52, 126, 113, -8.2131F, -7.9409F, 12.1F, 1, 1, 1, -0.302F, false));
		cube_r52.cubeList.add(new ModelBox(cube_r52, 126, 78, -8.2131F, -7.9409F, 10.5F, 1, 1, 1, -0.302F, false));
		cube_r52.cubeList.add(new ModelBox(cube_r52, 60, 124, -8.2131F, -7.9409F, 10.9F, 1, 1, 1, -0.302F, false));

		cube_r53 = new ModelRenderer(this);
		cube_r53.setRotationPoint(-0.3F, -0.5F, 7.3F);
		vssm_dustcover.addChild(cube_r53);
		setRotationAngle(cube_r53, 0.0F, 0.0F, -0.8029F);
		cube_r53.cubeList.add(new ModelBox(cube_r53, 109, 11, 7.2131F, -7.9409F, -0.3F, 1, 1, 1, -0.302F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 40, 106, 7.2131F, -7.9409F, -0.7F, 1, 1, 1, -0.302F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 90, 10, 7.2131F, -7.9409F, -5.1F, 1, 1, 1, -0.302F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 90, 2, 7.2131F, -7.9409F, -5.5F, 1, 1, 1, -0.302F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 65, 75, 7.2131F, -7.9409F, -7.5F, 1, 1, 1, -0.302F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 84, 12, 7.2131F, -7.9409F, -6.7F, 1, 1, 1, -0.302F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 84, 10, 7.2131F, -7.9409F, -7.1F, 1, 1, 1, -0.302F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 59, 104, 7.2131F, -7.9409F, -1.9F, 1, 1, 1, -0.302F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 40, 104, 7.2131F, -7.9409F, -2.3F, 1, 1, 1, -0.302F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 90, 31, 7.2131F, -7.9409F, -3.5F, 1, 1, 1, -0.302F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 90, 23, 7.2131F, -7.9409F, -3.9F, 1, 1, 1, -0.302F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 116, 67, 7.2131F, -7.9409F, 4.5F, 1, 1, 1, -0.302F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 116, 65, 7.2131F, -7.9409F, 4.1F, 1, 1, 1, -0.302F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 116, 52, 7.2131F, -7.9409F, 2.9F, 1, 1, 1, -0.302F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 116, 49, 7.2131F, -7.9409F, 2.5F, 1, 1, 1, -0.302F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 49, 112, 7.2131F, -7.9409F, 1.3F, 1, 1, 1, -0.302F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 98, 111, 7.2131F, -7.9409F, 0.9F, 1, 1, 1, -0.302F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 122, 54, 7.2131F, -7.9409F, 9.3F, 1, 1, 1, -0.302F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 122, 52, 7.2131F, -7.9409F, 8.9F, 1, 1, 1, -0.302F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 49, 122, 7.2131F, -7.9409F, 7.7F, 1, 1, 1, -0.302F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 122, 47, 7.2131F, -7.9409F, 7.3F, 1, 1, 1, -0.302F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 18, 120, 7.2131F, -7.9409F, 6.1F, 1, 1, 1, -0.302F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 73, 118, 7.2131F, -7.9409F, 5.7F, 1, 1, 1, -0.302F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 114, 129, 7.2131F, -7.9409F, 12.9F, 1, 1, 1, -0.302F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 102, 129, 7.2131F, -7.9409F, 12.5F, 1, 1, 1, -0.302F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 128, 32, 7.2131F, -7.9409F, 12.1F, 1, 1, 1, -0.302F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 98, 123, 7.2131F, -7.9409F, 10.9F, 1, 1, 1, -0.302F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 37, 123, 7.2131F, -7.9409F, 10.5F, 1, 1, 1, -0.302F, false));

		gun138 = new ModelRenderer(this);
		gun138.setRotationPoint(-3.25F, 2.55F, 12.0F);
		vssm_dustcover.addChild(gun138);
		setRotationAngle(gun138, -0.0873F, 0.0F, 0.0F);
		

		gun165 = new ModelRenderer(this);
		gun165.setRotationPoint(-3.25F, 3.05F, 17.95F);
		vssm_dustcover.addChild(gun165);
		setRotationAngle(gun165, -0.8198F, -0.0596F, 0.0638F);
		

		vssm_dustcover2 = new ModelRenderer(this);
		vssm_dustcover2.setRotationPoint(2.1F, -43.543F, -13.1803F);
		opticmount.addChild(vssm_dustcover2);
		setRotationAngle(vssm_dustcover2, 0.0F, 0.0F, 1.309F);
		vssm_dustcover2.cubeList.add(new ModelBox(vssm_dustcover2, 94, 186, -1.0F, -0.007F, -13.3197F, 2, 1, 13, -0.1F, false));
		vssm_dustcover2.cubeList.add(new ModelBox(vssm_dustcover2, 40, 118, 0.0F, -0.507F, -1.1197F, 1, 1, 1, -0.301F, false));
		vssm_dustcover2.cubeList.add(new ModelBox(vssm_dustcover2, 73, 120, -1.0F, -0.507F, -1.1197F, 1, 1, 1, -0.301F, false));
		vssm_dustcover2.cubeList.add(new ModelBox(vssm_dustcover2, 110, 101, 0.0F, -0.507F, -4.7197F, 1, 1, 1, -0.301F, false));
		vssm_dustcover2.cubeList.add(new ModelBox(vssm_dustcover2, 110, 103, 0.0F, -0.507F, -5.1197F, 1, 1, 1, -0.301F, false));
		vssm_dustcover2.cubeList.add(new ModelBox(vssm_dustcover2, 73, 112, -1.0F, -0.507F, -4.7197F, 1, 1, 1, -0.301F, false));
		vssm_dustcover2.cubeList.add(new ModelBox(vssm_dustcover2, 98, 113, -1.0F, -0.507F, -5.1197F, 1, 1, 1, -0.301F, false));
		vssm_dustcover2.cubeList.add(new ModelBox(vssm_dustcover2, 18, 115, 0.0F, -0.507F, -3.5197F, 1, 1, 1, -0.301F, false));
		vssm_dustcover2.cubeList.add(new ModelBox(vssm_dustcover2, 24, 115, 0.0F, -0.507F, -3.1197F, 1, 1, 1, -0.301F, false));
		vssm_dustcover2.cubeList.add(new ModelBox(vssm_dustcover2, 33, 115, -1.0F, -0.507F, -3.1197F, 1, 1, 1, -0.301F, false));
		vssm_dustcover2.cubeList.add(new ModelBox(vssm_dustcover2, 116, 47, -1.0F, -0.507F, -3.5197F, 1, 1, 1, -0.301F, false));
		vssm_dustcover2.cubeList.add(new ModelBox(vssm_dustcover2, 116, 54, 0.0F, -0.507F, -1.5197F, 1, 1, 1, -0.301F, false));
		vssm_dustcover2.cubeList.add(new ModelBox(vssm_dustcover2, 116, 70, 0.0F, -0.507F, -1.9197F, 1, 1, 1, -0.301F, false));
		vssm_dustcover2.cubeList.add(new ModelBox(vssm_dustcover2, 116, 72, -1.0F, -0.507F, -1.5197F, 1, 1, 1, -0.301F, false));
		vssm_dustcover2.cubeList.add(new ModelBox(vssm_dustcover2, 73, 116, -1.0F, -0.507F, -1.9197F, 1, 1, 1, -0.301F, false));
		vssm_dustcover2.cubeList.add(new ModelBox(vssm_dustcover2, 90, 12, 0.0F, -0.507F, -9.5197F, 1, 1, 1, -0.301F, false));
		vssm_dustcover2.cubeList.add(new ModelBox(vssm_dustcover2, 90, 21, 0.0F, -0.507F, -9.9197F, 1, 1, 1, -0.301F, false));
		vssm_dustcover2.cubeList.add(new ModelBox(vssm_dustcover2, 90, 33, -1.0F, -0.507F, -9.5197F, 1, 1, 1, -0.301F, false));
		vssm_dustcover2.cubeList.add(new ModelBox(vssm_dustcover2, 26, 92, -1.0F, -0.507F, -9.9197F, 1, 1, 1, -0.301F, false));
		vssm_dustcover2.cubeList.add(new ModelBox(vssm_dustcover2, 98, 2, 0.0F, -0.507F, -8.3197F, 1, 1, 1, -0.301F, false));
		vssm_dustcover2.cubeList.add(new ModelBox(vssm_dustcover2, 101, 88, 0.0F, -0.507F, -7.9197F, 1, 1, 1, -0.301F, false));
		vssm_dustcover2.cubeList.add(new ModelBox(vssm_dustcover2, 98, 101, -1.0F, -0.507F, -7.9197F, 1, 1, 1, -0.301F, false));
		vssm_dustcover2.cubeList.add(new ModelBox(vssm_dustcover2, 33, 104, -1.0F, -0.507F, -8.3197F, 1, 1, 1, -0.301F, false));
		vssm_dustcover2.cubeList.add(new ModelBox(vssm_dustcover2, 78, 17, 0.0F, -0.507F, -12.7197F, 1, 1, 1, -0.301F, false));
		vssm_dustcover2.cubeList.add(new ModelBox(vssm_dustcover2, 12, 82, 0.0F, -0.507F, -13.1197F, 1, 1, 1, -0.301F, false));
		vssm_dustcover2.cubeList.add(new ModelBox(vssm_dustcover2, 84, 21, -1.0F, -0.507F, -12.7197F, 1, 1, 1, -0.301F, false));
		vssm_dustcover2.cubeList.add(new ModelBox(vssm_dustcover2, 84, 23, -1.0F, -0.507F, -13.1197F, 1, 1, 1, -0.301F, false));
		vssm_dustcover2.cubeList.add(new ModelBox(vssm_dustcover2, 64, 68, 0.0F, -0.507F, -13.5197F, 1, 1, 1, -0.301F, false));
		vssm_dustcover2.cubeList.add(new ModelBox(vssm_dustcover2, 77, 10, -1.0F, -0.507F, -13.5197F, 1, 1, 1, -0.301F, false));
		vssm_dustcover2.cubeList.add(new ModelBox(vssm_dustcover2, 41, 85, 0.0F, -0.507F, -11.5197F, 1, 1, 1, -0.301F, false));
		vssm_dustcover2.cubeList.add(new ModelBox(vssm_dustcover2, 81, 85, 0.0F, -0.507F, -11.1197F, 1, 1, 1, -0.301F, false));
		vssm_dustcover2.cubeList.add(new ModelBox(vssm_dustcover2, 34, 88, -1.0F, -0.507F, -11.1197F, 1, 1, 1, -0.301F, false));
		vssm_dustcover2.cubeList.add(new ModelBox(vssm_dustcover2, 90, 0, -1.0F, -0.507F, -11.5197F, 1, 1, 1, -0.301F, false));
		vssm_dustcover2.cubeList.add(new ModelBox(vssm_dustcover2, 33, 106, 0.0F, -0.507F, -6.3197F, 1, 1, 1, -0.301F, false));
		vssm_dustcover2.cubeList.add(new ModelBox(vssm_dustcover2, 110, 37, 0.0F, -0.507F, -6.7197F, 1, 1, 1, -0.301F, false));
		vssm_dustcover2.cubeList.add(new ModelBox(vssm_dustcover2, 110, 39, -1.0F, -0.507F, -6.3197F, 1, 1, 1, -0.301F, false));
		vssm_dustcover2.cubeList.add(new ModelBox(vssm_dustcover2, 110, 60, -1.0F, -0.507F, -6.7197F, 1, 1, 1, -0.301F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.2F, 13.493F, -13.3197F);
		vssm_dustcover2.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.2793F);
		

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(1.2F, 13.493F, -13.3197F);
		vssm_dustcover2.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.2793F);
		

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(1.2F, 13.493F, -13.3197F);
		vssm_dustcover2.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.5236F, 0.0F, -0.2793F);
		

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.2F, 13.493F, -13.3197F);
		vssm_dustcover2.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.5236F, 0.0F, 0.2793F);
		

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-1.2F, 13.493F, -14.3197F);
		vssm_dustcover2.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.4712F, 0.0F, 0.2793F);
		

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.5F, 17.693F, 13.6803F);
		vssm_dustcover2.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.2269F, 0.0F, 0.0F);
		

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-0.7F, 12.793F, -6.0197F);
		vssm_dustcover2.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.8029F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 110, 98, -9.6519F, -9.3301F, -0.3F, 1, 1, 1, -0.302F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 110, 78, -9.6519F, -9.3301F, -0.7F, 1, 1, 1, -0.302F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 89, 89, -9.6519F, -9.3301F, -5.1F, 1, 1, 1, -0.302F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 89, 42, -9.6519F, -9.3301F, -5.5F, 1, 1, 1, -0.302F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 32, 63, -9.6519F, -9.3301F, -7.5F, 1, 1, 1, -0.302F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 84, 33, -9.6519F, -9.3301F, -7.1F, 1, 1, 1, -0.302F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 84, 31, -9.6519F, -9.3301F, -6.7F, 1, 1, 1, -0.302F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 98, 103, -9.6519F, -9.3301F, -1.9F, 1, 1, 1, -0.302F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 101, 98, -9.6519F, -9.3301F, -2.3F, 1, 1, 1, -0.302F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 98, 0, -9.6519F, -9.3301F, -3.9F, 1, 1, 1, -0.302F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 40, 92, -9.6519F, -9.3301F, -3.5F, 1, 1, 1, -0.302F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 24, 117, -9.6519F, -9.3301F, 4.5F, 1, 1, 1, -0.302F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 18, 117, -9.6519F, -9.3301F, 4.1F, 1, 1, 1, -0.302F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 116, 21, -9.6519F, -9.3301F, 2.9F, 1, 1, 1, -0.302F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 116, 19, -9.6519F, -9.3301F, 2.5F, 1, 1, 1, -0.302F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 73, 114, -9.6519F, -9.3301F, 0.9F, 1, 1, 1, -0.302F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 49, 114, -9.6519F, -9.3301F, 1.3F, 1, 1, 1, -0.302F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 121, 12, -9.6519F, -9.3301F, 4.9F, 1, 1, 1, -0.302F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.7F, 12.793F, -6.0197F);
		vssm_dustcover2.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.8029F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 109, 11, 8.6519F, -9.3301F, -0.3F, 1, 1, 1, -0.302F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 40, 106, 8.6519F, -9.3301F, -0.7F, 1, 1, 1, -0.302F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 90, 10, 8.6519F, -9.3301F, -5.1F, 1, 1, 1, -0.302F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 90, 2, 8.6519F, -9.3301F, -5.5F, 1, 1, 1, -0.302F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 65, 75, 8.6519F, -9.3301F, -7.5F, 1, 1, 1, -0.302F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 84, 12, 8.6519F, -9.3301F, -6.7F, 1, 1, 1, -0.302F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 84, 10, 8.6519F, -9.3301F, -7.1F, 1, 1, 1, -0.302F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 59, 104, 8.6519F, -9.3301F, -1.9F, 1, 1, 1, -0.302F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 40, 104, 8.6519F, -9.3301F, -2.3F, 1, 1, 1, -0.302F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 90, 31, 8.6519F, -9.3301F, -3.5F, 1, 1, 1, -0.302F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 90, 23, 8.6519F, -9.3301F, -3.9F, 1, 1, 1, -0.302F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 116, 67, 8.6519F, -9.3301F, 4.5F, 1, 1, 1, -0.302F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 116, 65, 8.6519F, -9.3301F, 4.1F, 1, 1, 1, -0.302F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 116, 52, 8.6519F, -9.3301F, 2.9F, 1, 1, 1, -0.302F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 116, 49, 8.6519F, -9.3301F, 2.5F, 1, 1, 1, -0.302F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 49, 112, 8.6519F, -9.3301F, 1.3F, 1, 1, 1, -0.302F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 98, 111, 8.6519F, -9.3301F, 0.9F, 1, 1, 1, -0.302F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 73, 118, 8.6519F, -9.3301F, 4.9F, 1, 1, 1, -0.302F, false));

		gun25 = new ModelRenderer(this);
		gun25.setRotationPoint(-2.25F, 15.843F, -1.3197F);
		vssm_dustcover2.addChild(gun25);
		setRotationAngle(gun25, -0.0873F, 0.0F, 0.0F);
		

		gun26 = new ModelRenderer(this);
		gun26.setRotationPoint(-2.25F, 16.343F, 4.6303F);
		vssm_dustcover2.addChild(gun26);
		setRotationAngle(gun26, -0.8198F, -0.0596F, 0.0638F);
		
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		dustcover.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}