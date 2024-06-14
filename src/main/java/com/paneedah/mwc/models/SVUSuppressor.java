package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SVUSuppressor extends ModelBase {
	private final ModelRenderer suppressor;
	private final ModelRenderer barrel3;
	private final ModelRenderer bone30;
	private final ModelRenderer cube_r173;
	private final ModelRenderer cube_r174;
	private final ModelRenderer bone31;
	private final ModelRenderer cube_r175;
	private final ModelRenderer cube_r176;
	private final ModelRenderer bone32;
	private final ModelRenderer cube_r177;
	private final ModelRenderer cube_r178;
	private final ModelRenderer cube_r179;
	private final ModelRenderer bone33;
	private final ModelRenderer cube_r180;
	private final ModelRenderer cube_r181;
	private final ModelRenderer barrelouter;
	private final ModelRenderer bone34;
	private final ModelRenderer cube_r182;
	private final ModelRenderer cube_r183;
	private final ModelRenderer bone35;
	private final ModelRenderer cube_r184;
	private final ModelRenderer cube_r185;
	private final ModelRenderer bone36;
	private final ModelRenderer cube_r186;
	private final ModelRenderer cube_r195;
	private final ModelRenderer bone37;
	private final ModelRenderer cube_r196;
	private final ModelRenderer cube_r197;
	private final ModelRenderer barrelouter2;
	private final ModelRenderer bone38;
	private final ModelRenderer cube_r198;
	private final ModelRenderer cube_r199;
	private final ModelRenderer bone39;
	private final ModelRenderer cube_r200;
	private final ModelRenderer cube_r201;
	private final ModelRenderer bone40;
	private final ModelRenderer cube_r202;
	private final ModelRenderer cube_r203;
	private final ModelRenderer bone41;
	private final ModelRenderer cube_r204;
	private final ModelRenderer cube_r205;
	private final ModelRenderer barrelouter5;
	private final ModelRenderer bone42;
	private final ModelRenderer cube_r206;
	private final ModelRenderer cube_r207;
	private final ModelRenderer bone43;
	private final ModelRenderer cube_r208;
	private final ModelRenderer cube_r209;
	private final ModelRenderer bone44;
	private final ModelRenderer cube_r210;
	private final ModelRenderer cube_r211;
	private final ModelRenderer bone45;
	private final ModelRenderer cube_r212;
	private final ModelRenderer cube_r213;
	private final ModelRenderer barrelouter6;
	private final ModelRenderer bone46;
	private final ModelRenderer cube_r214;
	private final ModelRenderer cube_r215;
	private final ModelRenderer bone47;
	private final ModelRenderer cube_r216;
	private final ModelRenderer cube_r217;
	private final ModelRenderer bone48;
	private final ModelRenderer cube_r218;
	private final ModelRenderer cube_r219;
	private final ModelRenderer bone49;
	private final ModelRenderer cube_r220;
	private final ModelRenderer cube_r221;
	private final ModelRenderer bone;

	public SVUSuppressor() {
		textureWidth = 256;
		textureHeight = 256;

		suppressor = new ModelRenderer(this);
		suppressor.setRotationPoint(-1.0F, -13.5F, -85.5F);
		

		barrel3 = new ModelRenderer(this);
		barrel3.setRotationPoint(1.0F, 36.8F, 85.5F);
		suppressor.addChild(barrel3);
		

		bone30 = new ModelRenderer(this);
		bone30.setRotationPoint(-1.5F, -37.8F, -85.5F);
		barrel3.addChild(bone30);
		

		cube_r173 = new ModelRenderer(this);
		cube_r173.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone30.addChild(cube_r173);
		setRotationAngle(cube_r173, 0.0F, 0.0F, 0.4363F);
		

		cube_r174 = new ModelRenderer(this);
		cube_r174.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone30.addChild(cube_r174);
		setRotationAngle(cube_r174, 0.0F, 0.0F, -0.4363F);
		

		bone31 = new ModelRenderer(this);
		bone31.setRotationPoint(-1.5F, -32.4F, -85.5F);
		barrel3.addChild(bone31);
		

		cube_r175 = new ModelRenderer(this);
		cube_r175.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone31.addChild(cube_r175);
		setRotationAngle(cube_r175, 0.0F, 0.0F, -0.4363F);
		

		cube_r176 = new ModelRenderer(this);
		cube_r176.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone31.addChild(cube_r176);
		setRotationAngle(cube_r176, 0.0F, 0.0F, 0.4363F);
		

		bone32 = new ModelRenderer(this);
		bone32.setRotationPoint(1.2F, -35.1F, -85.5F);
		barrel3.addChild(bone32);
		setRotationAngle(bone32, 0.0F, 0.0F, 1.5708F);
		

		cube_r177 = new ModelRenderer(this);
		cube_r177.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone32.addChild(cube_r177);
		setRotationAngle(cube_r177, 0.0F, 0.0F, 0.4363F);
		

		cube_r178 = new ModelRenderer(this);
		cube_r178.setRotationPoint(0.0F, 70.2F, 0.0F);
		bone32.addChild(cube_r178);
		setRotationAngle(cube_r178, 0.0F, 0.0F, 0.4363F);
		

		cube_r179 = new ModelRenderer(this);
		cube_r179.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone32.addChild(cube_r179);
		setRotationAngle(cube_r179, 0.0F, 0.0F, -0.4363F);
		

		bone33 = new ModelRenderer(this);
		bone33.setRotationPoint(-4.2F, -35.1F, -85.5F);
		barrel3.addChild(bone33);
		setRotationAngle(bone33, 0.0F, 0.0F, -1.5708F);
		

		cube_r180 = new ModelRenderer(this);
		cube_r180.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone33.addChild(cube_r180);
		setRotationAngle(cube_r180, 0.0F, 0.0F, -0.4363F);
		

		cube_r181 = new ModelRenderer(this);
		cube_r181.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone33.addChild(cube_r181);
		setRotationAngle(cube_r181, 0.0F, 0.0F, 0.4363F);
		

		barrelouter = new ModelRenderer(this);
		barrelouter.setRotationPoint(0.0F, 0.0F, 0.0F);
		suppressor.addChild(barrelouter);
		

		bone34 = new ModelRenderer(this);
		bone34.setRotationPoint(-0.5F, 4.4F, 0.0F);
		barrelouter.addChild(bone34);
		

		cube_r182 = new ModelRenderer(this);
		cube_r182.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone34.addChild(cube_r182);
		setRotationAngle(cube_r182, 0.0F, 0.0F, -0.4363F);
		cube_r182.cubeList.add(new ModelBox(cube_r182, 20, 133, -0.4648F, -1.003F, 17.1F, 2, 2, 2, 0.05F, false));
		cube_r182.cubeList.add(new ModelBox(cube_r182, 20, 133, -0.3672F, -1.8049F, 15.699F, 2, 2, 2, -0.55F, false));
		cube_r182.cubeList.add(new ModelBox(cube_r182, 20, 133, -0.3672F, -1.8049F, 13.899F, 2, 2, 2, -0.55F, false));
		cube_r182.cubeList.add(new ModelBox(cube_r182, 20, 133, -0.3672F, -0.9049F, 14.799F, 2, 1, 2, -0.55F, false));

		cube_r183 = new ModelRenderer(this);
		cube_r183.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone34.addChild(cube_r183);
		setRotationAngle(cube_r183, 0.0F, 0.0F, 0.4363F);
		cube_r183.cubeList.add(new ModelBox(cube_r183, 110, 133, -1.5352F, -1.003F, 17.1F, 2, 2, 2, 0.051F, false));
		cube_r183.cubeList.add(new ModelBox(cube_r183, 110, 133, -1.5352F, -1.003F, 30.2F, 2, 2, 2, 0.051F, false));
		cube_r183.cubeList.add(new ModelBox(cube_r183, 110, 133, -1.6054F, -1.8192F, 15.7F, 2, 2, 2, -0.549F, false));
		cube_r183.cubeList.add(new ModelBox(cube_r183, 110, 133, -1.6054F, -1.8192F, 13.9F, 2, 2, 2, -0.549F, false));
		cube_r183.cubeList.add(new ModelBox(cube_r183, 110, 133, -1.6054F, -0.9172F, 14.802F, 2, 1, 2, -0.549F, false));

		bone35 = new ModelRenderer(this);
		bone35.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter.addChild(bone35);
		setRotationAngle(bone35, 0.0F, 0.0F, 1.5708F);
		

		cube_r184 = new ModelRenderer(this);
		cube_r184.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone35.addChild(cube_r184);
		setRotationAngle(cube_r184, 0.0F, 0.0F, 0.4363F);
		cube_r184.cubeList.add(new ModelBox(cube_r184, 134, 36, 0.997F, -0.4649F, 17.1F, 2, 2, 2, 0.052F, false));
		cube_r184.cubeList.add(new ModelBox(cube_r184, 134, 36, 0.997F, -0.4649F, 30.2F, 2, 2, 2, 0.052F, false));
		cube_r184.cubeList.add(new ModelBox(cube_r184, 134, 36, 1.0785F, 0.3339F, 15.701F, 2, 2, 2, -0.548F, false));
		cube_r184.cubeList.add(new ModelBox(cube_r184, 134, 36, 1.0785F, 0.3339F, 13.901F, 2, 2, 2, -0.548F, false));

		cube_r185 = new ModelRenderer(this);
		cube_r185.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone35.addChild(cube_r185);
		setRotationAngle(cube_r185, 0.0F, 0.0F, -0.4363F);
		cube_r185.cubeList.add(new ModelBox(cube_r185, 145, 108, -1.003F, 0.4648F, 17.1F, 2, 2, 2, 0.05F, false));
		cube_r185.cubeList.add(new ModelBox(cube_r185, 145, 108, -1.08F, 1.2628F, 15.699F, 2, 2, 2, -0.55F, false));
		cube_r185.cubeList.add(new ModelBox(cube_r185, 145, 108, -1.08F, 1.2628F, 13.899F, 2, 2, 2, -0.55F, false));

		bone36 = new ModelRenderer(this);
		bone36.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter.addChild(bone36);
		setRotationAngle(bone36, 0.0F, 0.0F, -1.5708F);
		

		cube_r186 = new ModelRenderer(this);
		cube_r186.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone36.addChild(cube_r186);
		setRotationAngle(cube_r186, 0.0F, 0.0F, -0.4363F);
		cube_r186.cubeList.add(new ModelBox(cube_r186, 124, 133, -2.997F, -0.4649F, 17.1F, 2, 2, 2, 0.05F, false));
		cube_r186.cubeList.add(new ModelBox(cube_r186, 124, 133, -3.0922F, 0.359F, 15.699F, 2, 2, 2, -0.55F, false));
		cube_r186.cubeList.add(new ModelBox(cube_r186, 124, 133, -3.0922F, 0.359F, 13.899F, 2, 2, 2, -0.55F, false));

		cube_r195 = new ModelRenderer(this);
		cube_r195.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone36.addChild(cube_r195);
		setRotationAngle(cube_r195, 0.0F, 0.0F, 0.4363F);
		cube_r195.cubeList.add(new ModelBox(cube_r195, 134, 32, -0.997F, 0.4648F, 17.1F, 2, 2, 2, 0.052F, false));
		cube_r195.cubeList.add(new ModelBox(cube_r195, 134, 32, -0.997F, 0.4648F, 30.2F, 2, 2, 2, 0.052F, false));
		cube_r195.cubeList.add(new ModelBox(cube_r195, 134, 32, -0.9074F, 1.2943F, 15.701F, 2, 2, 2, -0.548F, false));
		cube_r195.cubeList.add(new ModelBox(cube_r195, 134, 32, -0.9074F, 1.2943F, 13.901F, 2, 2, 2, -0.548F, false));

		bone37 = new ModelRenderer(this);
		bone37.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter.addChild(bone37);
		

		cube_r196 = new ModelRenderer(this);
		cube_r196.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone37.addChild(cube_r196);
		setRotationAngle(cube_r196, 0.0F, 0.0F, 0.4363F);
		cube_r196.cubeList.add(new ModelBox(cube_r196, 145, 112, 0.4648F, 0.997F, 17.1F, 2, 2, 2, 0.051F, false));
		cube_r196.cubeList.add(new ModelBox(cube_r196, 145, 112, 0.4648F, 0.997F, 30.2F, 2, 2, 2, 0.051F, false));
		cube_r196.cubeList.add(new ModelBox(cube_r196, 145, 112, 0.5658F, 1.805F, 15.7F, 2, 2, 2, -0.549F, false));
		cube_r196.cubeList.add(new ModelBox(cube_r196, 145, 112, 0.5658F, 1.805F, 13.9F, 2, 2, 2, -0.549F, false));
		cube_r196.cubeList.add(new ModelBox(cube_r196, 145, 112, 0.5658F, 1.903F, 14.802F, 2, 1, 2, -0.549F, false));

		cube_r197 = new ModelRenderer(this);
		cube_r197.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone37.addChild(cube_r197);
		setRotationAngle(cube_r197, 0.0F, 0.0F, -0.4363F);
		cube_r197.cubeList.add(new ModelBox(cube_r197, 109, 157, -2.4648F, 0.997F, 17.1F, 2, 2, 2, 0.05F, false));
		cube_r197.cubeList.add(new ModelBox(cube_r197, 109, 157, -2.5366F, 1.8172F, 15.699F, 2, 2, 2, -0.55F, false));
		cube_r197.cubeList.add(new ModelBox(cube_r197, 109, 157, -2.5366F, 1.8172F, 13.899F, 2, 2, 2, -0.55F, false));
		cube_r197.cubeList.add(new ModelBox(cube_r197, 109, 157, -2.5366F, 1.9172F, 14.799F, 2, 1, 2, -0.55F, false));

		barrelouter2 = new ModelRenderer(this);
		barrelouter2.setRotationPoint(0.0F, 0.0F, 26.0F);
		suppressor.addChild(barrelouter2);
		

		bone38 = new ModelRenderer(this);
		bone38.setRotationPoint(-0.5F, 4.4F, 0.0F);
		barrelouter2.addChild(bone38);
		

		cube_r198 = new ModelRenderer(this);
		cube_r198.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone38.addChild(cube_r198);
		setRotationAngle(cube_r198, 0.0F, 0.0F, -0.4363F);
		cube_r198.cubeList.add(new ModelBox(cube_r198, 179, 23, -0.4648F, -0.003F, -9.0F, 2, 1, 1, 0.2F, false));
		cube_r198.cubeList.add(new ModelBox(cube_r198, 178, 22, -0.4648F, -0.003F, 4.1F, 2, 1, 2, 0.2F, false));

		cube_r199 = new ModelRenderer(this);
		cube_r199.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone38.addChild(cube_r199);
		setRotationAngle(cube_r199, 0.0F, 0.0F, 0.4363F);
		cube_r199.cubeList.add(new ModelBox(cube_r199, 40, 179, -1.5352F, -0.003F, -9.0F, 2, 1, 1, 0.2F, false));
		cube_r199.cubeList.add(new ModelBox(cube_r199, 39, 178, -1.5352F, -0.003F, 4.1F, 2, 1, 2, 0.2F, false));

		bone39 = new ModelRenderer(this);
		bone39.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter2.addChild(bone39);
		setRotationAngle(bone39, 0.0F, 0.0F, 1.5708F);
		

		cube_r200 = new ModelRenderer(this);
		cube_r200.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone39.addChild(cube_r200);
		setRotationAngle(cube_r200, 0.0F, 0.0F, 0.4363F);
		cube_r200.cubeList.add(new ModelBox(cube_r200, 179, 13, 0.997F, -0.4649F, -9.0F, 2, 1, 1, 0.2F, false));
		cube_r200.cubeList.add(new ModelBox(cube_r200, 178, 12, 0.997F, -0.4649F, 4.1F, 2, 1, 2, 0.2F, false));

		cube_r201 = new ModelRenderer(this);
		cube_r201.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone39.addChild(cube_r201);
		setRotationAngle(cube_r201, 0.0F, 0.0F, -0.4363F);
		cube_r201.cubeList.add(new ModelBox(cube_r201, 179, 18, -1.003F, 0.4648F, -9.0F, 2, 1, 1, 0.2F, false));
		cube_r201.cubeList.add(new ModelBox(cube_r201, 178, 17, -1.003F, 0.4648F, 4.1F, 2, 1, 2, 0.2F, false));

		bone40 = new ModelRenderer(this);
		bone40.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter2.addChild(bone40);
		setRotationAngle(bone40, 0.0F, 0.0F, -1.5708F);
		

		cube_r202 = new ModelRenderer(this);
		cube_r202.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone40.addChild(cube_r202);
		setRotationAngle(cube_r202, 0.0F, 0.0F, -0.4363F);
		cube_r202.cubeList.add(new ModelBox(cube_r202, 179, 3, -2.997F, -0.4649F, -9.0F, 2, 1, 1, 0.2F, false));
		cube_r202.cubeList.add(new ModelBox(cube_r202, 178, 2, -2.997F, -0.4649F, 4.1F, 2, 1, 2, 0.2F, false));

		cube_r203 = new ModelRenderer(this);
		cube_r203.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone40.addChild(cube_r203);
		setRotationAngle(cube_r203, 0.0F, 0.0F, 0.4363F);
		cube_r203.cubeList.add(new ModelBox(cube_r203, 179, 8, -0.997F, 0.4648F, -9.0F, 2, 1, 1, 0.2F, false));
		cube_r203.cubeList.add(new ModelBox(cube_r203, 178, 7, -0.997F, 0.4648F, 4.1F, 2, 1, 2, 0.2F, false));

		bone41 = new ModelRenderer(this);
		bone41.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter2.addChild(bone41);
		

		cube_r204 = new ModelRenderer(this);
		cube_r204.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone41.addChild(cube_r204);
		setRotationAngle(cube_r204, 0.0F, 0.0F, 0.4363F);
		cube_r204.cubeList.add(new ModelBox(cube_r204, 32, 177, 0.4648F, 0.997F, -9.0F, 2, 1, 1, 0.2F, false));
		cube_r204.cubeList.add(new ModelBox(cube_r204, 31, 176, 0.4648F, 0.997F, 4.1F, 2, 1, 2, 0.2F, false));

		cube_r205 = new ModelRenderer(this);
		cube_r205.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone41.addChild(cube_r205);
		setRotationAngle(cube_r205, 0.0F, 0.0F, -0.4363F);
		cube_r205.cubeList.add(new ModelBox(cube_r205, 178, 165, -2.4648F, 0.997F, -9.0F, 2, 1, 1, 0.2F, false));
		cube_r205.cubeList.add(new ModelBox(cube_r205, 177, 164, -2.4648F, 0.997F, 4.1F, 2, 1, 2, 0.2F, false));

		barrelouter5 = new ModelRenderer(this);
		barrelouter5.setRotationPoint(0.0F, 0.0F, 42.9F);
		suppressor.addChild(barrelouter5);
		

		bone42 = new ModelRenderer(this);
		bone42.setRotationPoint(-0.5F, 4.4F, 0.0F);
		barrelouter5.addChild(bone42);
		

		cube_r206 = new ModelRenderer(this);
		cube_r206.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone42.addChild(cube_r206);
		setRotationAngle(cube_r206, 0.0F, 0.0F, -0.4363F);
		

		cube_r207 = new ModelRenderer(this);
		cube_r207.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone42.addChild(cube_r207);
		setRotationAngle(cube_r207, 0.0F, 0.0F, 0.4363F);
		

		bone43 = new ModelRenderer(this);
		bone43.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter5.addChild(bone43);
		setRotationAngle(bone43, 0.0F, 0.0F, 1.5708F);
		

		cube_r208 = new ModelRenderer(this);
		cube_r208.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone43.addChild(cube_r208);
		setRotationAngle(cube_r208, 0.0F, 0.0F, 0.4363F);
		

		cube_r209 = new ModelRenderer(this);
		cube_r209.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone43.addChild(cube_r209);
		setRotationAngle(cube_r209, 0.0F, 0.0F, -0.4363F);
		

		bone44 = new ModelRenderer(this);
		bone44.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter5.addChild(bone44);
		setRotationAngle(bone44, 0.0F, 0.0F, -1.5708F);
		

		cube_r210 = new ModelRenderer(this);
		cube_r210.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone44.addChild(cube_r210);
		setRotationAngle(cube_r210, 0.0F, 0.0F, -0.4363F);
		

		cube_r211 = new ModelRenderer(this);
		cube_r211.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone44.addChild(cube_r211);
		setRotationAngle(cube_r211, 0.0F, 0.0F, 0.4363F);
		

		bone45 = new ModelRenderer(this);
		bone45.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter5.addChild(bone45);
		

		cube_r212 = new ModelRenderer(this);
		cube_r212.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone45.addChild(cube_r212);
		setRotationAngle(cube_r212, 0.0F, 0.0F, 0.4363F);
		

		cube_r213 = new ModelRenderer(this);
		cube_r213.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone45.addChild(cube_r213);
		setRotationAngle(cube_r213, 0.0F, 0.0F, -0.4363F);
		

		barrelouter6 = new ModelRenderer(this);
		barrelouter6.setRotationPoint(0.0F, 0.0F, 4.0F);
		suppressor.addChild(barrelouter6);
		

		bone46 = new ModelRenderer(this);
		bone46.setRotationPoint(-0.5F, 4.4F, 0.0F);
		barrelouter6.addChild(bone46);
		

		cube_r214 = new ModelRenderer(this);
		cube_r214.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone46.addChild(cube_r214);
		setRotationAngle(cube_r214, 0.0F, 0.0F, -0.4363F);
		cube_r214.cubeList.add(new ModelBox(cube_r214, 6, 73, -0.4648F, -0.003F, 14.0F, 2, 1, 14, 0.05F, false));

		cube_r215 = new ModelRenderer(this);
		cube_r215.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone46.addChild(cube_r215);
		setRotationAngle(cube_r215, 0.0F, 0.0F, 0.4363F);
		cube_r215.cubeList.add(new ModelBox(cube_r215, 55, 74, -1.5352F, -0.003F, 14.0F, 2, 1, 14, 0.05F, false));

		bone47 = new ModelRenderer(this);
		bone47.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter6.addChild(bone47);
		setRotationAngle(bone47, 0.0F, 0.0F, 1.5708F);
		

		cube_r216 = new ModelRenderer(this);
		cube_r216.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone47.addChild(cube_r216);
		setRotationAngle(cube_r216, 0.0F, 0.0F, 0.4363F);
		cube_r216.cubeList.add(new ModelBox(cube_r216, 55, 27, 0.997F, -0.4649F, 14.0F, 2, 1, 14, 0.05F, false));

		cube_r217 = new ModelRenderer(this);
		cube_r217.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone47.addChild(cube_r217);
		setRotationAngle(cube_r217, 0.0F, 0.0F, -0.4363F);
		cube_r217.cubeList.add(new ModelBox(cube_r217, 55, 53, -1.003F, 0.4648F, 14.0F, 2, 1, 14, 0.05F, false));

		bone48 = new ModelRenderer(this);
		bone48.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter6.addChild(bone48);
		setRotationAngle(bone48, 0.0F, 0.0F, -1.5708F);
		

		cube_r218 = new ModelRenderer(this);
		cube_r218.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone48.addChild(cube_r218);
		setRotationAngle(cube_r218, 0.0F, 0.0F, -0.4363F);
		cube_r218.cubeList.add(new ModelBox(cube_r218, 6, 52, -2.997F, -0.4649F, 14.0F, 2, 1, 14, 0.05F, false));

		cube_r219 = new ModelRenderer(this);
		cube_r219.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone48.addChild(cube_r219);
		setRotationAngle(cube_r219, 0.0F, 0.0F, 0.4363F);
		cube_r219.cubeList.add(new ModelBox(cube_r219, 55, 6, -0.997F, 0.4648F, 14.0F, 2, 1, 14, 0.05F, false));

		bone49 = new ModelRenderer(this);
		bone49.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter6.addChild(bone49);
		

		cube_r220 = new ModelRenderer(this);
		cube_r220.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone49.addChild(cube_r220);
		setRotationAngle(cube_r220, 0.0F, 0.0F, 0.4363F);
		cube_r220.cubeList.add(new ModelBox(cube_r220, 6, 6, 0.4648F, 0.997F, 14.0F, 2, 1, 14, 0.05F, false));

		cube_r221 = new ModelRenderer(this);
		cube_r221.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone49.addChild(cube_r221);
		setRotationAngle(cube_r221, 0.0F, 0.0F, -0.4363F);
		cube_r221.cubeList.add(new ModelBox(cube_r221, 6, 27, -2.4648F, 0.997F, 14.0F, 2, 1, 14, 0.05F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		suppressor.addChild(bone);
		
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		suppressor.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}