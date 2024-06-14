package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ShAK_12Silencer extends ModelBase {
	private final ModelRenderer tac_suppressor2;
	private final ModelRenderer gun2;
	private final ModelRenderer gun3;
	private final ModelRenderer gun4;
	private final ModelRenderer gun5;
	private final ModelRenderer gun6;
	private final ModelRenderer gun7;
	private final ModelRenderer gun8;
	private final ModelRenderer gun9;
	private final ModelRenderer gun10;
	private final ModelRenderer gun11;
	private final ModelRenderer barrel4;
	private final ModelRenderer barrel5;
	private final ModelRenderer bone46;
	private final ModelRenderer cube_r75;
	private final ModelRenderer cube_r76;
	private final ModelRenderer bone47;
	private final ModelRenderer cube_r101;
	private final ModelRenderer cube_r102;
	private final ModelRenderer bone48;
	private final ModelRenderer cube_r103;
	private final ModelRenderer cube_r104;
	private final ModelRenderer cube_r105;
	private final ModelRenderer bone49;
	private final ModelRenderer cube_r106;
	private final ModelRenderer cube_r116;
	private final ModelRenderer barrelouter5;
	private final ModelRenderer bone50;
	private final ModelRenderer cube_r117;
	private final ModelRenderer cube_r118;
	private final ModelRenderer bone51;
	private final ModelRenderer cube_r119;
	private final ModelRenderer cube_r120;
	private final ModelRenderer bone52;
	private final ModelRenderer cube_r121;
	private final ModelRenderer cube_r122;
	private final ModelRenderer bone53;
	private final ModelRenderer cube_r123;
	private final ModelRenderer cube_r124;
	private final ModelRenderer barrelouter6;
	private final ModelRenderer bone54;
	private final ModelRenderer cube_r125;
	private final ModelRenderer cube_r126;
	private final ModelRenderer bone55;
	private final ModelRenderer cube_r127;
	private final ModelRenderer cube_r128;
	private final ModelRenderer bone56;
	private final ModelRenderer cube_r129;
	private final ModelRenderer cube_r130;
	private final ModelRenderer bone57;
	private final ModelRenderer cube_r131;
	private final ModelRenderer cube_r132;
	private final ModelRenderer barrelouter7;
	private final ModelRenderer bone58;
	private final ModelRenderer cube_r133;
	private final ModelRenderer cube_r134;
	private final ModelRenderer bone59;
	private final ModelRenderer cube_r135;
	private final ModelRenderer cube_r136;
	private final ModelRenderer bone60;
	private final ModelRenderer cube_r137;
	private final ModelRenderer cube_r138;
	private final ModelRenderer bone61;
	private final ModelRenderer cube_r139;
	private final ModelRenderer cube_r140;
	private final ModelRenderer barrelouter8;
	private final ModelRenderer bone62;
	private final ModelRenderer cube_r141;
	private final ModelRenderer cube_r142;
	private final ModelRenderer bone63;
	private final ModelRenderer cube_r143;
	private final ModelRenderer cube_r144;
	private final ModelRenderer bone64;
	private final ModelRenderer cube_r145;
	private final ModelRenderer cube_r146;
	private final ModelRenderer bone65;
	private final ModelRenderer cube_r147;
	private final ModelRenderer cube_r148;

	public ShAK_12Silencer() {
		textureWidth = 512;
		textureHeight = 512;

		tac_suppressor2 = new ModelRenderer(this);
		tac_suppressor2.setRotationPoint(-3.5F, -15.0F, -10.5F);
		

		gun2 = new ModelRenderer(this);
		gun2.setRotationPoint(1.5F, -1.0F, -122.0F);
		tac_suppressor2.addChild(gun2);
		gun2.cubeList.add(new ModelBox(gun2, 212, 198, 0.0F, 2.0F, 95.0F, 1, 3, 30, 0.0F, false));

		gun3 = new ModelRenderer(this);
		gun3.setRotationPoint(0.5F, 0.0F, -122.0F);
		tac_suppressor2.addChild(gun3);
		gun3.cubeList.add(new ModelBox(gun3, 48, 178, 0.0F, 2.0F, 95.0F, 3, 1, 30, 0.0F, false));

		gun4 = new ModelRenderer(this);
		gun4.setRotationPoint(0.5F, 0.0F, -122.0F);
		tac_suppressor2.addChild(gun4);
		setRotationAngle(gun4, 0.0F, 0.0F, -0.7854F);
		gun4.cubeList.add(new ModelBox(gun4, 126, 244, -1.4142F, 1.4142F, 95.0F, 1, 1, 30, 0.0F, false));

		gun5 = new ModelRenderer(this);
		gun5.setRotationPoint(0.5F, 1.0F, -122.0F);
		tac_suppressor2.addChild(gun5);
		setRotationAngle(gun5, 0.0F, 0.0F, -0.7854F);
		gun5.cubeList.add(new ModelBox(gun5, 94, 243, -1.4142F, 1.4142F, 95.0F, 1, 1, 30, 0.0F, false));

		gun6 = new ModelRenderer(this);
		gun6.setRotationPoint(1.5F, -1.0F, -122.0F);
		tac_suppressor2.addChild(gun6);
		setRotationAngle(gun6, 0.0F, 0.0F, 0.7854F);
		gun6.cubeList.add(new ModelBox(gun6, 239, 140, 1.4142F, 1.4142F, 95.0F, 1, 1, 30, 0.0F, false));

		gun7 = new ModelRenderer(this);
		gun7.setRotationPoint(2.5F, -1.0F, -122.0F);
		tac_suppressor2.addChild(gun7);
		setRotationAngle(gun7, 0.0F, 0.0F, 0.7854F);
		gun7.cubeList.add(new ModelBox(gun7, 239, 109, 1.4142F, 1.4142F, 95.0F, 1, 1, 30, 0.0F, false));

		gun8 = new ModelRenderer(this);
		gun8.setRotationPoint(2.5F, -1.0F, -122.0F);
		tac_suppressor2.addChild(gun8);
		setRotationAngle(gun8, 0.0F, 0.0F, 0.7854F);
		gun8.cubeList.add(new ModelBox(gun8, 239, 78, 1.8142F, 1.4142F, 95.0F, 1, 1, 30, 0.0F, false));

		gun9 = new ModelRenderer(this);
		gun9.setRotationPoint(0.5F, 1.0F, -122.0F);
		tac_suppressor2.addChild(gun9);
		setRotationAngle(gun9, 0.0F, 0.0F, -0.7854F);
		gun9.cubeList.add(new ModelBox(gun9, 226, 231, -1.4142F, 1.8142F, 95.0F, 1, 1, 30, 0.0F, false));

		gun10 = new ModelRenderer(this);
		gun10.setRotationPoint(2.5F, 2.0F, -122.0F);
		tac_suppressor2.addChild(gun10);
		setRotationAngle(gun10, 0.0F, 0.0F, -2.3562F);
		gun10.cubeList.add(new ModelBox(gun10, 0, 223, -1.4142F, -1.4142F, 95.0F, 1, 1, 30, 0.0F, false));

		gun11 = new ModelRenderer(this);
		gun11.setRotationPoint(2.5F, 2.0F, -122.0F);
		tac_suppressor2.addChild(gun11);
		setRotationAngle(gun11, 0.0F, 0.0F, -2.3562F);
		gun11.cubeList.add(new ModelBox(gun11, 217, 0, -1.4142F, -1.0142F, 95.0F, 1, 1, 30, 0.0F, false));

		barrel4 = new ModelRenderer(this);
		barrel4.setRotationPoint(2.5F, 2.2F, -75.0F);
		tac_suppressor2.addChild(barrel4);
		

		barrel5 = new ModelRenderer(this);
		barrel5.setRotationPoint(1.0F, 36.8F, 85.5F);
		barrel4.addChild(barrel5);
		

		bone46 = new ModelRenderer(this);
		bone46.setRotationPoint(-1.5F, -37.8F, -85.5F);
		barrel5.addChild(bone46);
		

		cube_r75 = new ModelRenderer(this);
		cube_r75.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone46.addChild(cube_r75);
		setRotationAngle(cube_r75, 0.0F, 0.0F, 0.4363F);
		cube_r75.cubeList.add(new ModelBox(cube_r75, 0, 178, -0.216F, -2.768F, -0.9F, 2, 1, 44, 1.0F, false));

		cube_r76 = new ModelRenderer(this);
		cube_r76.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone46.addChild(cube_r76);
		setRotationAngle(cube_r76, 0.0F, 0.0F, -0.4363F);
		cube_r76.cubeList.add(new ModelBox(cube_r76, 169, 0, -0.8954F, -2.3537F, -0.9F, 2, 1, 44, 1.0F, false));

		bone47 = new ModelRenderer(this);
		bone47.setRotationPoint(-1.5F, -32.4F, -85.5F);
		barrel5.addChild(bone47);
		

		cube_r101 = new ModelRenderer(this);
		cube_r101.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone47.addChild(cube_r101);
		setRotationAngle(cube_r101, 0.0F, 0.0F, -0.4363F);
		cube_r101.cubeList.add(new ModelBox(cube_r101, 72, 167, 0.8939F, -0.6125F, -0.9F, 2, 1, 44, 1.0F, false));

		cube_r102 = new ModelRenderer(this);
		cube_r102.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone47.addChild(cube_r102);
		setRotationAngle(cube_r102, 0.0F, 0.0F, 0.4363F);
		cube_r102.cubeList.add(new ModelBox(cube_r102, 167, 46, -2.0053F, -1.0268F, -0.9F, 2, 1, 44, 1.0F, false));

		bone48 = new ModelRenderer(this);
		bone48.setRotationPoint(1.2F, -35.1F, -85.5F);
		barrel5.addChild(bone48);
		setRotationAngle(bone48, 0.0F, 0.0F, 1.5708F);
		

		cube_r103 = new ModelRenderer(this);
		cube_r103.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone48.addChild(cube_r103);
		setRotationAngle(cube_r103, 0.0F, 0.0F, 0.4363F);
		cube_r103.cubeList.add(new ModelBox(cube_r103, 155, 153, -1.5028F, -1.2599F, -0.9F, 2, 1, 44, 1.0F, false));

		cube_r104 = new ModelRenderer(this);
		cube_r104.setRotationPoint(0.0F, 70.2F, 0.0F);
		bone48.addChild(cube_r104);
		setRotationAngle(cube_r104, 0.0F, 0.0F, 0.4363F);
		

		cube_r105 = new ModelRenderer(this);
		cube_r105.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone48.addChild(cube_r105);
		setRotationAngle(cube_r105, 0.0F, 0.0F, -0.4363F);
		cube_r105.cubeList.add(new ModelBox(cube_r105, 155, 108, -2.8777F, -2.3699F, -0.9F, 2, 1, 44, 1.0F, false));

		bone49 = new ModelRenderer(this);
		bone49.setRotationPoint(-4.2F, -35.1F, -85.5F);
		barrel5.addChild(bone49);
		setRotationAngle(bone49, 0.0F, 0.0F, -1.5708F);
		

		cube_r106 = new ModelRenderer(this);
		cube_r106.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone49.addChild(cube_r106);
		setRotationAngle(cube_r106, 0.0F, 0.0F, -0.4363F);
		cube_r106.cubeList.add(new ModelBox(cube_r106, 107, 122, -0.9116F, -0.3714F, -0.9F, 2, 1, 44, 1.0F, false));

		cube_r116 = new ModelRenderer(this);
		cube_r116.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone49.addChild(cube_r116);
		setRotationAngle(cube_r116, 0.0F, 0.0F, 0.4363F);
		cube_r116.cubeList.add(new ModelBox(cube_r116, 59, 121, 1.2921F, -1.4813F, -0.9F, 2, 1, 44, 1.0F, false));

		barrelouter5 = new ModelRenderer(this);
		barrelouter5.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrel4.addChild(barrelouter5);
		

		bone50 = new ModelRenderer(this);
		bone50.setRotationPoint(-0.5F, 4.4F, 0.0F);
		barrelouter5.addChild(bone50);
		

		cube_r117 = new ModelRenderer(this);
		cube_r117.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone50.addChild(cube_r117);
		setRotationAngle(cube_r117, 0.0F, 0.0F, -0.4363F);
		cube_r117.cubeList.add(new ModelBox(cube_r117, 120, 3, 0.9398F, -1.5499F, -3.9F, 2, 2, 2, 1.05F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 32, 113, 0.9398F, -1.5499F, 45.1F, 2, 2, 2, 1.05F, false));

		cube_r118 = new ModelRenderer(this);
		cube_r118.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone50.addChild(cube_r118);
		setRotationAngle(cube_r118, 0.0F, 0.0F, 0.4363F);
		cube_r118.cubeList.add(new ModelBox(cube_r118, 26, 136, -1.9727F, -2.0022F, -3.899F, 2, 2, 2, 1.051F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 135, 108, -1.9727F, -2.0022F, 45.101F, 2, 2, 2, 1.051F, false));

		bone51 = new ModelRenderer(this);
		bone51.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter5.addChild(bone51);
		setRotationAngle(bone51, 0.0F, 0.0F, 1.5708F);
		

		cube_r119 = new ModelRenderer(this);
		cube_r119.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone51.addChild(cube_r119);
		setRotationAngle(cube_r119, 0.0F, 0.0F, 0.4363F);
		cube_r119.cubeList.add(new ModelBox(cube_r119, 16, 136, -1.5558F, -1.3558F, -3.898F, 2, 2, 2, 1.052F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 67, 133, -1.5558F, -1.3558F, 45.102F, 2, 2, 2, 1.052F, false));

		cube_r120 = new ModelRenderer(this);
		cube_r120.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone51.addChild(cube_r120);
		setRotationAngle(cube_r120, 0.0F, 0.0F, -0.4363F);
		cube_r120.cubeList.add(new ModelBox(cube_r120, 79, 121, -2.882F, -2.4954F, -3.9F, 2, 2, 2, 1.05F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 120, 108, -2.882F, -2.4954F, 45.1F, 2, 2, 2, 1.05F, false));

		bone52 = new ModelRenderer(this);
		bone52.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter5.addChild(bone52);
		setRotationAngle(bone52, 0.0F, 0.0F, -1.5708F);
		

		cube_r121 = new ModelRenderer(this);
		cube_r121.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone52.addChild(cube_r121);
		setRotationAngle(cube_r121, 0.0F, 0.0F, -0.4363F);
		cube_r121.cubeList.add(new ModelBox(cube_r121, 20, 113, -0.896F, -0.3911F, -3.9F, 2, 2, 2, 1.05F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 8, 113, -0.896F, -0.3911F, 45.1F, 2, 2, 2, 1.05F, false));

		cube_r122 = new ModelRenderer(this);
		cube_r122.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone52.addChild(cube_r122);
		setRotationAngle(cube_r122, 0.0F, 0.0F, 0.4363F);
		cube_r122.cubeList.add(new ModelBox(cube_r122, 0, 136, 1.3328F, -1.5243F, -3.898F, 2, 2, 2, 1.052F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 120, 112, 1.3328F, -1.5243F, 45.102F, 2, 2, 2, 1.052F, false));

		bone53 = new ModelRenderer(this);
		bone53.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter5.addChild(bone53);
		

		cube_r123 = new ModelRenderer(this);
		cube_r123.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone53.addChild(cube_r123);
		setRotationAngle(cube_r123, 0.0F, 0.0F, 0.4363F);
		cube_r123.cubeList.add(new ModelBox(cube_r123, 8, 136, -0.1957F, -2.8863F, -3.899F, 2, 2, 2, 1.051F, false));
		cube_r123.cubeList.add(new ModelBox(cube_r123, 13, 124, -0.1957F, -2.8863F, 45.101F, 2, 2, 2, 1.051F, false));

		cube_r124 = new ModelRenderer(this);
		cube_r124.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone53.addChild(cube_r124);
		setRotationAngle(cube_r124, 0.0F, 0.0F, -0.4363F);
		cube_r124.cubeList.add(new ModelBox(cube_r124, 59, 133, -0.8354F, -2.4361F, -3.9F, 2, 2, 2, 1.05F, false));
		cube_r124.cubeList.add(new ModelBox(cube_r124, 107, 132, -0.8354F, -2.4361F, 45.1F, 2, 2, 2, 1.05F, false));

		barrelouter6 = new ModelRenderer(this);
		barrelouter6.setRotationPoint(0.0F, 0.0F, 26.0F);
		barrel4.addChild(barrelouter6);
		

		bone54 = new ModelRenderer(this);
		bone54.setRotationPoint(-0.5F, 4.4F, 0.0F);
		barrelouter6.addChild(bone54);
		

		cube_r125 = new ModelRenderer(this);
		cube_r125.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone54.addChild(cube_r125);
		setRotationAngle(cube_r125, 0.0F, 0.0F, -0.4363F);
		

		cube_r126 = new ModelRenderer(this);
		cube_r126.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone54.addChild(cube_r126);
		setRotationAngle(cube_r126, 0.0F, 0.0F, 0.4363F);
		

		bone55 = new ModelRenderer(this);
		bone55.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter6.addChild(bone55);
		setRotationAngle(bone55, 0.0F, 0.0F, 1.5708F);
		

		cube_r127 = new ModelRenderer(this);
		cube_r127.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone55.addChild(cube_r127);
		setRotationAngle(cube_r127, 0.0F, 0.0F, 0.4363F);
		

		cube_r128 = new ModelRenderer(this);
		cube_r128.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone55.addChild(cube_r128);
		setRotationAngle(cube_r128, 0.0F, 0.0F, -0.4363F);
		

		bone56 = new ModelRenderer(this);
		bone56.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter6.addChild(bone56);
		setRotationAngle(bone56, 0.0F, 0.0F, -1.5708F);
		

		cube_r129 = new ModelRenderer(this);
		cube_r129.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone56.addChild(cube_r129);
		setRotationAngle(cube_r129, 0.0F, 0.0F, -0.4363F);
		

		cube_r130 = new ModelRenderer(this);
		cube_r130.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone56.addChild(cube_r130);
		setRotationAngle(cube_r130, 0.0F, 0.0F, 0.4363F);
		

		bone57 = new ModelRenderer(this);
		bone57.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter6.addChild(bone57);
		

		cube_r131 = new ModelRenderer(this);
		cube_r131.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone57.addChild(cube_r131);
		setRotationAngle(cube_r131, 0.0F, 0.0F, 0.4363F);
		

		cube_r132 = new ModelRenderer(this);
		cube_r132.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone57.addChild(cube_r132);
		setRotationAngle(cube_r132, 0.0F, 0.0F, -0.4363F);
		

		barrelouter7 = new ModelRenderer(this);
		barrelouter7.setRotationPoint(0.0F, 0.0F, 42.9F);
		barrel4.addChild(barrelouter7);
		

		bone58 = new ModelRenderer(this);
		bone58.setRotationPoint(-0.5F, 4.4F, 0.0F);
		barrelouter7.addChild(bone58);
		

		cube_r133 = new ModelRenderer(this);
		cube_r133.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone58.addChild(cube_r133);
		setRotationAngle(cube_r133, 0.0F, 0.0F, -0.4363F);
		

		cube_r134 = new ModelRenderer(this);
		cube_r134.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone58.addChild(cube_r134);
		setRotationAngle(cube_r134, 0.0F, 0.0F, 0.4363F);
		

		bone59 = new ModelRenderer(this);
		bone59.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter7.addChild(bone59);
		setRotationAngle(bone59, 0.0F, 0.0F, 1.5708F);
		

		cube_r135 = new ModelRenderer(this);
		cube_r135.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone59.addChild(cube_r135);
		setRotationAngle(cube_r135, 0.0F, 0.0F, 0.4363F);
		

		cube_r136 = new ModelRenderer(this);
		cube_r136.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone59.addChild(cube_r136);
		setRotationAngle(cube_r136, 0.0F, 0.0F, -0.4363F);
		

		bone60 = new ModelRenderer(this);
		bone60.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter7.addChild(bone60);
		setRotationAngle(bone60, 0.0F, 0.0F, -1.5708F);
		

		cube_r137 = new ModelRenderer(this);
		cube_r137.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone60.addChild(cube_r137);
		setRotationAngle(cube_r137, 0.0F, 0.0F, -0.4363F);
		

		cube_r138 = new ModelRenderer(this);
		cube_r138.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone60.addChild(cube_r138);
		setRotationAngle(cube_r138, 0.0F, 0.0F, 0.4363F);
		

		bone61 = new ModelRenderer(this);
		bone61.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter7.addChild(bone61);
		

		cube_r139 = new ModelRenderer(this);
		cube_r139.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone61.addChild(cube_r139);
		setRotationAngle(cube_r139, 0.0F, 0.0F, 0.4363F);
		

		cube_r140 = new ModelRenderer(this);
		cube_r140.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone61.addChild(cube_r140);
		setRotationAngle(cube_r140, 0.0F, 0.0F, -0.4363F);
		

		barrelouter8 = new ModelRenderer(this);
		barrelouter8.setRotationPoint(0.0F, 0.0F, 4.0F);
		barrel4.addChild(barrelouter8);
		

		bone62 = new ModelRenderer(this);
		bone62.setRotationPoint(-0.5F, 4.4F, 0.0F);
		barrelouter8.addChild(bone62);
		

		cube_r141 = new ModelRenderer(this);
		cube_r141.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone62.addChild(cube_r141);
		setRotationAngle(cube_r141, 0.0F, 0.0F, -0.4363F);
		

		cube_r142 = new ModelRenderer(this);
		cube_r142.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone62.addChild(cube_r142);
		setRotationAngle(cube_r142, 0.0F, 0.0F, 0.4363F);
		

		bone63 = new ModelRenderer(this);
		bone63.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter8.addChild(bone63);
		setRotationAngle(bone63, 0.0F, 0.0F, 1.5708F);
		

		cube_r143 = new ModelRenderer(this);
		cube_r143.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone63.addChild(cube_r143);
		setRotationAngle(cube_r143, 0.0F, 0.0F, 0.4363F);
		

		cube_r144 = new ModelRenderer(this);
		cube_r144.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone63.addChild(cube_r144);
		setRotationAngle(cube_r144, 0.0F, 0.0F, -0.4363F);
		

		bone64 = new ModelRenderer(this);
		bone64.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter8.addChild(bone64);
		setRotationAngle(bone64, 0.0F, 0.0F, -1.5708F);
		

		cube_r145 = new ModelRenderer(this);
		cube_r145.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone64.addChild(cube_r145);
		setRotationAngle(cube_r145, 0.0F, 0.0F, -0.4363F);
		

		cube_r146 = new ModelRenderer(this);
		cube_r146.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone64.addChild(cube_r146);
		setRotationAngle(cube_r146, 0.0F, 0.0F, 0.4363F);
		

		bone65 = new ModelRenderer(this);
		bone65.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter8.addChild(bone65);
		

		cube_r147 = new ModelRenderer(this);
		cube_r147.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone65.addChild(cube_r147);
		setRotationAngle(cube_r147, 0.0F, 0.0F, 0.4363F);
		

		cube_r148 = new ModelRenderer(this);
		cube_r148.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone65.addChild(cube_r148);
		setRotationAngle(cube_r148, 0.0F, 0.0F, -0.4363F);
		
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		tac_suppressor2.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}