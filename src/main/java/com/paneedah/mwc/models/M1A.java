package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M1A extends ModelWithAttachments{
	private final ModelRenderer gun;
	private final ModelRenderer gun61_r1;
	private final ModelRenderer gun60_r1;
	private final ModelRenderer gun104_r1;
	private final ModelRenderer gun105_r1;
	private final ModelRenderer gun104_r2;
	private final ModelRenderer gun103_r1;
	private final ModelRenderer gun105_r2;
	private final ModelRenderer gun104_r3;
	private final ModelRenderer gun101_r1;
	private final ModelRenderer gun102_r1;
	private final ModelRenderer gun102_r2;
	private final ModelRenderer gun103_r2;
	private final ModelRenderer gun100_r1;
	private final ModelRenderer gun103_r3;
	private final ModelRenderer gun102_r3;
	private final ModelRenderer gun427_r1;
	private final ModelRenderer gun429_r1;
	private final ModelRenderer gun178;
	private final ModelRenderer gun176;
	private final ModelRenderer gun174;
	private final ModelRenderer gun172;
	private final ModelRenderer gun118;
	private final ModelRenderer gun117;
	private final ModelRenderer gun116;
	private final ModelRenderer gun115;
	private final ModelRenderer gun114;
	private final ModelRenderer gun107;
	private final ModelRenderer gun95;
	private final ModelRenderer gun94;
	private final ModelRenderer gun92;
	private final ModelRenderer gun89;
	private final ModelRenderer gun88;
	private final ModelRenderer gun87;
	private final ModelRenderer gun83;
	private final ModelRenderer gun81;
	private final ModelRenderer gun79;
	private final ModelRenderer gun75;
	private final ModelRenderer bone2;
	private final ModelRenderer gun79_r1;
	private final ModelRenderer gun78_r1;
	private final ModelRenderer gun78_r2;
	private final ModelRenderer bone7;
	private final ModelRenderer gun80_r1;
	private final ModelRenderer gun81_r1;
	private final ModelRenderer gun80_r2;
	private final ModelRenderer gun79_r2;
	private final ModelRenderer gun81_r2;
	private final ModelRenderer gun80_r3;
	private final ModelRenderer gun79_r3;
	private final ModelRenderer gun24;
	private final ModelRenderer gun23;
	private final ModelRenderer gun22;
	private final ModelRenderer gun20;
	private final ModelRenderer gun19;

	public M1A() {
		textureWidth = 340;
		textureHeight = 340;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		gun.cubeList.add(new ModelBox(gun, 101, 146, -3.0F, -40.9F, -26.01F, 3, 1, 3, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 111, 4, -2.7F, -41.2F, -23.71F, 3, 2, 1, -0.301F, false));
		gun.cubeList.add(new ModelBox(gun, 15, 47, -3.3F, -41.2F, -23.71F, 2, 2, 1, -0.302F, false));
		gun.cubeList.add(new ModelBox(gun, 124, 62, -3.0F, -40.48F, -25.6F, 3, 1, 3, -0.101F, false));
		gun.cubeList.add(new ModelBox(gun, 73, 82, -3.0F, -40.3F, -23.4F, 3, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 30, -2.8F, -40.1F, -24.2F, 3, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 73, 0, -3.2F, -40.1F, -24.2F, 1, 1, 1, -0.201F, false));
		gun.cubeList.add(new ModelBox(gun, 51, 75, -3.0F, -31.0F, -27.3F, 3, 1, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 51, 68, -3.5F, -31.1F, -27.3F, 4, 1, 6, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 51, 21, -3.3F, -39.7F, -39.0F, 1, 3, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 35, 94, -3.5F, -36.5F, -16.5F, 1, 2, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 115, 58, -3.65F, -36.7F, -13.5F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 188, 258, -3.8F, -37.3F, -39.0F, 1, 1, 27, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 178, 183, -3.8F, -38.1F, -32.3F, 1, 1, 18, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 73, 47, -3.7F, -39.0F, -32.3F, 1, 2, 7, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 47, -3.65F, -38.8F, -60.0F, 1, 2, 21, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 51, 82, -0.1F, -39.5F, -34.5F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 65, 68, -0.15F, -40.0F, -35.0F, 1, 2, 2, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 70, 0.0F, -39.0F, -26.5F, 1, 2, 2, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 115, 76, 0.3F, -37.6F, -26.5F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 23, 47, -2.5F, -40.3F, -39.0F, 2, 4, 3, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 73, 82, -0.1F, -37.6F, -29.5F, 1, 1, 1, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 69, 140, -0.1F, -38.3F, -38.5F, 1, 1, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 69, 151, -0.1F, -37.0F, -38.5F, 1, 1, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 140, -0.3F, -40.0F, -38.5F, 1, 1, 6, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 82, 29, -0.3F, -38.2F, -27.5F, 1, 2, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 71, 94, -0.3F, -39.3F, -38.5F, 1, 4, 11, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 23, -0.5F, -39.1F, -27.5F, 1, 3, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 124, 54, -3.5F, -39.8F, -18.5F, 4, 5, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 35, -2.0F, -30.8F, -19.5F, 1, 3, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 145, 146, -3.0F, -26.95F, -16.05F, 3, 1, 3, 0.0F, false));

		gun61_r1 = new ModelRenderer(this);
		gun61_r1.setRotationPoint(0.5F, -38.35F, -11.1F);
		gun.addChild(gun61_r1);
		setRotationAngle(gun61_r1, -1.2217F, 0.0F, 0.0F);
		gun61_r1.cubeList.add(new ModelBox(gun61_r1, 102, 62, -4.0F, 0.0F, 0.0F, 4, 1, 3, -0.002F, false));

		gun60_r1 = new ModelRenderer(this);
		gun60_r1.setRotationPoint(0.5F, -38.7F, -16.1F);
		gun.addChild(gun60_r1);
		setRotationAngle(gun60_r1, -0.0698F, 0.0F, 0.0F);
		gun60_r1.cubeList.add(new ModelBox(gun60_r1, 73, 75, -4.0F, 0.0F, 0.0F, 4, 2, 5, -0.001F, false));

		gun104_r1 = new ModelRenderer(this);
		gun104_r1.setRotationPoint(-3.55F, -36.8F, -75.9F);
		gun.addChild(gun104_r1);
		setRotationAngle(gun104_r1, 0.0F, 0.0F, 0.2094F);
		gun104_r1.cubeList.add(new ModelBox(gun104_r1, 41, 47, 0.1F, -2.1F, -7.0F, 1, 2, 1, 0.0F, false));
		gun104_r1.cubeList.add(new ModelBox(gun104_r1, 192, 44, 0.35F, -2.05F, -7.1F, 2, 2, 34, -0.002F, false));

		gun105_r1 = new ModelRenderer(this);
		gun105_r1.setRotationPoint(-1.5F, -39.6F, -75.9F);
		gun.addChild(gun105_r1);
		setRotationAngle(gun105_r1, 0.0F, 0.0F, -0.4363F);
		gun105_r1.cubeList.add(new ModelBox(gun105_r1, 67, 26, -1.65F, 0.0F, -7.0F, 1, 1, 1, -0.001F, false));
		gun105_r1.cubeList.add(new ModelBox(gun105_r1, 66, 58, -1.0F, 0.0F, -7.0F, 1, 1, 1, 0.0F, false));
		gun105_r1.cubeList.add(new ModelBox(gun105_r1, 0, 94, -1.0F, 0.0F, 26.9F, 1, 1, 7, 0.0F, false));
		gun105_r1.cubeList.add(new ModelBox(gun105_r1, 0, 78, -1.65F, 0.0F, 26.9F, 1, 1, 7, -0.001F, false));

		gun104_r2 = new ModelRenderer(this);
		gun104_r2.setRotationPoint(-1.5F, -39.6F, -75.9F);
		gun.addChild(gun104_r2);
		setRotationAngle(gun104_r2, 0.0F, 0.0F, 0.4363F);
		gun104_r2.cubeList.add(new ModelBox(gun104_r2, 41, 63, 0.65F, 0.0F, -7.0F, 1, 1, 1, -0.001F, false));
		gun104_r2.cubeList.add(new ModelBox(gun104_r2, 29, 54, 0.0F, 0.0F, -7.0F, 1, 1, 1, 0.0F, false));
		gun104_r2.cubeList.add(new ModelBox(gun104_r2, 23, 81, 0.65F, 0.0F, 26.9F, 1, 1, 7, -0.001F, false));
		gun104_r2.cubeList.add(new ModelBox(gun104_r2, 98, 93, 0.0F, 0.0F, 26.9F, 1, 1, 7, 0.0F, false));

		gun103_r1 = new ModelRenderer(this);
		gun103_r1.setRotationPoint(0.55F, -36.8F, -75.9F);
		gun.addChild(gun103_r1);
		setRotationAngle(gun103_r1, 0.0F, 0.0F, -0.2094F);
		gun103_r1.cubeList.add(new ModelBox(gun103_r1, 35, 47, -1.1F, -2.1F, -7.0F, 1, 2, 1, 0.0F, false));
		gun103_r1.cubeList.add(new ModelBox(gun103_r1, 219, 177, -2.35F, -2.05F, -7.1F, 2, 2, 34, -0.001F, false));
		gun103_r1.cubeList.add(new ModelBox(gun103_r1, 73, 29, -1.1F, -2.1F, 26.9F, 1, 2, 7, 0.0F, false));

		gun105_r2 = new ModelRenderer(this);
		gun105_r2.setRotationPoint(-1.5F, -39.35F, -49.0F);
		gun.addChild(gun105_r2);
		setRotationAngle(gun105_r2, 0.0F, 0.0F, -0.4363F);
		gun105_r2.cubeList.add(new ModelBox(gun105_r2, 187, 223, -1.35F, 0.0F, -34.0F, 1, 1, 34, -0.001F, false));
		gun105_r2.cubeList.add(new ModelBox(gun105_r2, 226, 129, -1.0F, 0.0F, -34.0F, 1, 1, 34, 0.0F, false));

		gun104_r3 = new ModelRenderer(this);
		gun104_r3.setRotationPoint(-1.5F, -39.35F, -49.0F);
		gun.addChild(gun104_r3);
		setRotationAngle(gun104_r3, 0.0F, 0.0F, 0.4363F);
		gun104_r3.cubeList.add(new ModelBox(gun104_r3, 224, 213, 0.35F, 0.0F, -34.0F, 1, 1, 34, -0.001F, false));
		gun104_r3.cubeList.add(new ModelBox(gun104_r3, 54, 227, 0.0F, 0.0F, -34.0F, 1, 1, 34, 0.0F, false));

		gun101_r1 = new ModelRenderer(this);
		gun101_r1.setRotationPoint(-1.5F, -40.1F, -61.0F);
		gun.addChild(gun101_r1);
		setRotationAngle(gun101_r1, 0.0F, 0.0F, -0.4363F);
		gun101_r1.cubeList.add(new ModelBox(gun101_r1, 61, 26, -2.0F, 0.0F, -1.0F, 2, 1, 2, 0.0F, false));
		gun101_r1.cubeList.add(new ModelBox(gun101_r1, 23, 94, -2.0F, 0.0F, 19.0F, 2, 1, 3, -0.001F, false));

		gun102_r1 = new ModelRenderer(this);
		gun102_r1.setRotationPoint(-1.5F, -40.1F, -61.0F);
		gun.addChild(gun102_r1);
		setRotationAngle(gun102_r1, 0.0F, 0.0F, 0.4363F);
		gun102_r1.cubeList.add(new ModelBox(gun102_r1, 23, 54, 0.0F, 0.0F, -1.0F, 2, 1, 2, -0.001F, false));
		gun102_r1.cubeList.add(new ModelBox(gun102_r1, 84, 82, 0.0F, 0.0F, 19.0F, 2, 1, 3, -0.001F, false));

		gun102_r2 = new ModelRenderer(this);
		gun102_r2.setRotationPoint(0.8F, -37.2F, -61.0F);
		gun.addChild(gun102_r2);
		setRotationAngle(gun102_r2, 0.0F, 0.0F, -0.2094F);
		gun102_r2.cubeList.add(new ModelBox(gun102_r2, 38, 11, -1.0F, -2.0F, -1.0F, 1, 2, 2, 0.0F, false));
		gun102_r2.cubeList.add(new ModelBox(gun102_r2, 12, 70, -1.0F, -2.0F, 19.0F, 1, 2, 3, -0.001F, false));

		gun103_r2 = new ModelRenderer(this);
		gun103_r2.setRotationPoint(-3.8F, -37.2F, -61.0F);
		gun.addChild(gun103_r2);
		setRotationAngle(gun103_r2, 0.0F, 0.0F, 0.2094F);
		gun103_r2.cubeList.add(new ModelBox(gun103_r2, 14, 35, 0.0F, -2.0F, -1.0F, 1, 2, 2, -0.001F, false));
		gun103_r2.cubeList.add(new ModelBox(gun103_r2, 23, 98, 0.0F, -2.0F, 19.0F, 1, 1, 3, -0.001F, false));

		gun100_r1 = new ModelRenderer(this);
		gun100_r1.setRotationPoint(-3.55F, -38.8F, -25.5F);
		gun.addChild(gun100_r1);
		setRotationAngle(gun100_r1, -0.0698F, 0.0F, 0.0F);
		gun100_r1.cubeList.add(new ModelBox(gun100_r1, 51, 21, -0.15F, -0.2F, -0.2F, 1, 2, 8, -0.201F, false));

		gun103_r3 = new ModelRenderer(this);
		gun103_r3.setRotationPoint(-3.8F, -37.6F, -14.2F);
		gun.addChild(gun103_r3);
		setRotationAngle(gun103_r3, 0.925F, 0.0F, 0.0F);
		

		gun102_r3 = new ModelRenderer(this);
		gun102_r3.setRotationPoint(-3.8F, -37.6F, -15.2F);
		gun.addChild(gun102_r3);
		setRotationAngle(gun102_r3, -0.925F, 0.0F, 0.0F);
		

		gun427_r1 = new ModelRenderer(this);
		gun427_r1.setRotationPoint(0.0F, -40.3F, -22.6F);
		gun.addChild(gun427_r1);
		setRotationAngle(gun427_r1, -1.4312F, 0.0F, 0.0F);
		gun427_r1.cubeList.add(new ModelBox(gun427_r1, 63, 75, -3.0F, -4.2F, 0.0F, 3, 4, 1, -0.001F, false));

		gun429_r1 = new ModelRenderer(this);
		gun429_r1.setRotationPoint(0.2F, -40.0F, -25.8F);
		gun.addChild(gun429_r1);
		setRotationAngle(gun429_r1, -0.7854F, 0.0F, 0.0F);
		gun429_r1.cubeList.add(new ModelBox(gun429_r1, 73, 2, -3.3F, -0.72F, -0.28F, 1, 1, 1, -0.202F, false));
		gun429_r1.cubeList.add(new ModelBox(gun429_r1, 51, 27, -3.1F, -0.72F, -0.28F, 3, 1, 1, -0.203F, false));

		gun178 = new ModelRenderer(this);
		gun178.setRotationPoint(-2.0F, -28.15F, -13.9F);
		gun.addChild(gun178);
		setRotationAngle(gun178, -2.0076F, 0.0F, 0.0F);
		gun178.cubeList.add(new ModelBox(gun178, 111, 70, 0.0F, 0.0F, -1.0F, 1, 1, 2, 0.0F, false));

		gun176 = new ModelRenderer(this);
		gun176.setRotationPoint(-2.0F, -31.0F, -14.1F);
		gun.addChild(gun176);
		setRotationAngle(gun176, -1.2641F, 0.0F, 0.0F);
		gun176.cubeList.add(new ModelBox(gun176, 111, 75, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun174 = new ModelRenderer(this);
		gun174.setRotationPoint(-2.5F, -30.3F, -26.5F);
		gun.addChild(gun174);
		setRotationAngle(gun174, 0.3346F, 0.0F, 0.0F);
		gun174.cubeList.add(new ModelBox(gun174, 65, 31, 0.0F, 0.5583F, 1.6057F, 2, 3, 1, 0.0F, false));

		gun172 = new ModelRenderer(this);
		gun172.setRotationPoint(-3.5F, -30.1F, -27.0F);
		gun.addChild(gun172);
		setRotationAngle(gun172, 2.9371F, 0.0F, 0.0F);
		gun172.cubeList.add(new ModelBox(gun172, 226, 151, 0.0F, 0.0F, 0.0F, 4, 1, 10, 0.001F, false));

		gun118 = new ModelRenderer(this);
		gun118.setRotationPoint(-2.5F, -40.3F, -39.0F);
		gun.addChild(gun118);
		setRotationAngle(gun118, 0.0F, 0.0F, 0.8976F);
		gun118.cubeList.add(new ModelBox(gun118, 61, 107, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.001F, false));

		gun117 = new ModelRenderer(this);
		gun117.setRotationPoint(0.7F, -40.0F, -38.0F);
		gun.addChild(gun117);
		setRotationAngle(gun117, 0.0F, 0.0F, 1.8326F);
		

		gun116 = new ModelRenderer(this);
		gun116.setRotationPoint(0.7F, -40.0F, -38.5F);
		gun.addChild(gun116);
		setRotationAngle(gun116, 0.0F, 0.0F, 1.8326F);
		

		gun115 = new ModelRenderer(this);
		gun115.setRotationPoint(-0.5F, -40.3F, -38.5F);
		gun.addChild(gun115);
		setRotationAngle(gun115, 0.0F, 0.0F, 0.2244F);
		gun115.cubeList.add(new ModelBox(gun115, 73, 8, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun114 = new ModelRenderer(this);
		gun114.setRotationPoint(-0.5F, -40.3F, -38.0F);
		gun.addChild(gun114);
		setRotationAngle(gun114, 0.0F, 0.0F, 0.2244F);
		gun114.cubeList.add(new ModelBox(gun114, 115, 50, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.001F, false));

		gun107 = new ModelRenderer(this);
		gun107.setRotationPoint(-5.0F, -37.0F, -15.5F);
		gun.addChild(gun107);
		setRotationAngle(gun107, 0.2618F, 0.0F, 0.0F);
		

		gun95 = new ModelRenderer(this);
		gun95.setRotationPoint(-0.15F, -40.0F, -35.0F);
		gun.addChild(gun95);
		setRotationAngle(gun95, -0.2603F, 0.0F, 0.0F);
		gun95.cubeList.add(new ModelBox(gun95, 67, 13, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun94 = new ModelRenderer(this);
		gun94.setRotationPoint(-0.15F, -40.0F, -33.0F);
		gun.addChild(gun94);
		setRotationAngle(gun94, -1.3384F, 0.0F, 0.0F);
		gun94.cubeList.add(new ModelBox(gun94, 115, 68, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun92 = new ModelRenderer(this);
		gun92.setRotationPoint(1.3F, -37.8F, -26.5F);
		gun.addChild(gun92);
		setRotationAngle(gun92, 0.0F, 0.0F, 2.6025F);
		gun92.cubeList.add(new ModelBox(gun92, 115, 71, 0.1027F, -0.1716F, 0.0F, 1, 1, 2, -0.002F, false));

		gun89 = new ModelRenderer(this);
		gun89.setRotationPoint(0.5F, -38.2F, -27.5F);
		gun.addChild(gun89);
		setRotationAngle(gun89, 0.0F, 0.0F, 0.8551F);
		gun89.cubeList.add(new ModelBox(gun89, 35, 75, 0.1509F, 0.1312F, 0.0F, 1, 1, 4, 0.0F, false));

		gun88 = new ModelRenderer(this);
		gun88.setRotationPoint(0.9F, -38.3F, -38.5F);
		gun.addChild(gun88);
		setRotationAngle(gun88, 0.0F, -2.0442F, 0.0F);
		gun88.cubeList.add(new ModelBox(gun88, 35, 0, 0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

		gun87 = new ModelRenderer(this);
		gun87.setRotationPoint(0.7F, -40.0F, -38.5F);
		gun.addChild(gun87);
		setRotationAngle(gun87, 0.0F, -2.0442F, 0.0F);
		gun87.cubeList.add(new ModelBox(gun87, 41, 0, 0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

		gun83 = new ModelRenderer(this);
		gun83.setRotationPoint(0.9F, -38.3F, -38.5F);
		gun.addChild(gun83);
		setRotationAngle(gun83, 0.0F, 0.0F, 2.8256F);
		gun83.cubeList.add(new ModelBox(gun83, 45, 151, 0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F, false));

		gun81 = new ModelRenderer(this);
		gun81.setRotationPoint(-0.3F, -40.0F, -32.5F);
		gun.addChild(gun81);
		setRotationAngle(gun81, -0.2557F, 0.0F, 0.0F);
		gun81.cubeList.add(new ModelBox(gun81, 13, 108, 0.0F, 0.0F, 0.0F, 1, 1, 3, -0.002F, false));

		gun79 = new ModelRenderer(this);
		gun79.setRotationPoint(-0.3F, -39.6F, -27.5F);
		gun.addChild(gun79);
		setRotationAngle(gun79, -1.3756F, 0.0F, 0.0F);
		gun79.cubeList.add(new ModelBox(gun79, 115, 79, 0.0F, 0.0582F, 0.2943F, 1, 1, 2, -0.001F, false));

		gun75 = new ModelRenderer(this);
		gun75.setRotationPoint(-3.5F, -39.8F, -15.5F);
		gun.addChild(gun75);
		setRotationAngle(gun75, -1.041F, 0.0F, 0.0F);
		gun75.cubeList.add(new ModelBox(gun75, 84, 102, 0.0F, 0.0F, 0.0F, 4, 1, 2, -0.002F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-0.7F, -39.5F, -15.5F);
		gun.addChild(bone2);
		

		gun79_r1 = new ModelRenderer(this);
		gun79_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(gun79_r1);
		setRotationAngle(gun79_r1, -0.0622F, 0.0412F, 0.5906F);
		gun79_r1.cubeList.add(new ModelBox(gun79_r1, 9, 94, 0.44F, 0.0F, -0.55F, 1, 1, 5, -0.001F, false));
		gun79_r1.cubeList.add(new ModelBox(gun79_r1, 9, 102, 0.0F, 0.0F, -0.55F, 1, 1, 5, 0.0F, false));

		gun78_r1 = new ModelRenderer(this);
		gun78_r1.setRotationPoint(-1.6F, 0.0F, 0.0F);
		bone2.addChild(gun78_r1);
		setRotationAngle(gun78_r1, -0.0622F, -0.0412F, -0.5906F);
		gun78_r1.cubeList.add(new ModelBox(gun78_r1, 32, 105, -1.44F, 0.0F, -0.55F, 1, 1, 5, -0.001F, false));
		gun78_r1.cubeList.add(new ModelBox(gun78_r1, 107, 93, -1.0F, 0.0F, -0.55F, 1, 1, 5, 0.0F, false));

		gun78_r2 = new ModelRenderer(this);
		gun78_r2.setRotationPoint(0.2F, 0.0F, 0.1F);
		bone2.addChild(gun78_r2);
		setRotationAngle(gun78_r2, -0.0746F, 0.0006F, 0.0F);
		gun78_r2.cubeList.add(new ModelBox(gun78_r2, 145, 93, -2.0F, -0.2F, -0.4F, 2, 1, 5, -0.2F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-0.7F, -39.1F, -10.99F);
		gun.addChild(bone7);
		setRotationAngle(bone7, -1.1519F, 0.0F, 0.0F);
		

		gun80_r1 = new ModelRenderer(this);
		gun80_r1.setRotationPoint(3.0F, 0.0F, -0.01F);
		bone7.addChild(gun80_r1);
		setRotationAngle(gun80_r1, -0.0808F, -0.4835F, 0.3336F);
		gun80_r1.cubeList.add(new ModelBox(gun80_r1, 51, 35, -2.8097F, 0.4727F, 1.0227F, 2, 1, 1, -0.401F, false));
		gun80_r1.cubeList.add(new ModelBox(gun80_r1, 39, 38, -2.5097F, 0.4727F, 1.4027F, 2, 1, 1, -0.401F, false));
		gun80_r1.cubeList.add(new ModelBox(gun80_r1, 14, 39, -2.6097F, 0.4727F, 1.2127F, 2, 1, 1, -0.402F, false));

		gun81_r1 = new ModelRenderer(this);
		gun81_r1.setRotationPoint(3.0F, 0.0F, -0.01F);
		bone7.addChild(gun81_r1);
		setRotationAngle(gun81_r1, -0.0715F, 0.0212F, 0.2944F);
		gun81_r1.cubeList.add(new ModelBox(gun81_r1, 39, 65, -3.2703F, 0.4727F, -0.1686F, 1, 1, 2, -0.403F, false));

		gun80_r2 = new ModelRenderer(this);
		gun80_r2.setRotationPoint(3.0F, 0.0F, -0.01F);
		bone7.addChild(gun80_r2);
		setRotationAngle(gun80_r2, -0.0715F, 0.0212F, 0.2944F);
		gun80_r2.cubeList.add(new ModelBox(gun80_r2, 35, 52, -2.6303F, 0.8727F, 0.7314F, 1, 1, 4, 0.0F, false));
		gun80_r2.cubeList.add(new ModelBox(gun80_r2, 35, 47, -2.8703F, 0.8727F, 0.7314F, 1, 1, 4, 0.001F, false));

		gun79_r2 = new ModelRenderer(this);
		gun79_r2.setRotationPoint(-1.6F, 0.0F, -0.01F);
		bone7.addChild(gun79_r2);
		setRotationAngle(gun79_r2, -0.0715F, -0.0212F, -0.2944F);
		gun79_r2.cubeList.add(new ModelBox(gun79_r2, 35, 58, -1.24F, 0.0F, 0.73F, 1, 1, 4, 0.0F, false));
		gun79_r2.cubeList.add(new ModelBox(gun79_r2, 61, 13, -1.0F, 0.0F, 0.73F, 1, 1, 4, 0.001F, false));

		gun81_r2 = new ModelRenderer(this);
		gun81_r2.setRotationPoint(-1.6F, 0.0F, -0.01F);
		bone7.addChild(gun81_r2);
		setRotationAngle(gun81_r2, -0.0808F, 0.4835F, -0.3336F);
		gun81_r2.cubeList.add(new ModelBox(gun81_r2, 23, 62, -2.0F, -0.4F, 0.01F, 2, 1, 1, -0.401F, false));
		gun81_r2.cubeList.add(new ModelBox(gun81_r2, 65, 35, -1.9F, -0.4F, -0.18F, 2, 1, 1, -0.402F, false));
		gun81_r2.cubeList.add(new ModelBox(gun81_r2, 51, 72, -1.7F, -0.4F, -0.37F, 2, 1, 1, -0.401F, false));

		gun80_r3 = new ModelRenderer(this);
		gun80_r3.setRotationPoint(-1.6F, 0.0F, -0.01F);
		bone7.addChild(gun80_r3);
		setRotationAngle(gun80_r3, -0.0715F, -0.0212F, -0.2944F);
		gun80_r3.cubeList.add(new ModelBox(gun80_r3, 51, 75, -0.6F, -0.4F, -0.17F, 1, 1, 2, -0.403F, false));

		gun79_r3 = new ModelRenderer(this);
		gun79_r3.setRotationPoint(0.2F, 0.0F, 0.09F);
		bone7.addChild(gun79_r3);
		setRotationAngle(gun79_r3, -0.0746F, 0.0006F, 0.0F);
		gun79_r3.cubeList.add(new ModelBox(gun79_r3, 81, 129, -2.0F, -0.2F, -0.37F, 2, 1, 5, -0.2F, false));

		gun24 = new ModelRenderer(this);
		gun24.setRotationPoint(-3.0F, -29.3F, -18.0F);
		gun.addChild(gun24);
		setRotationAngle(gun24, 2.7338F, 0.0F, 0.0F);
		gun24.cubeList.add(new ModelBox(gun24, 124, 146, 0.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F, false));

		gun23 = new ModelRenderer(this);
		gun23.setRotationPoint(-3.0F, -27.3F, -17.5F);
		gun.addChild(gun23);
		setRotationAngle(gun23, 1.8961F, 0.0F, 0.0F);
		gun23.cubeList.add(new ModelBox(gun23, 98, 109, 0.0F, 0.0F, 0.0F, 3, 1, 4, 0.0F, false));

		gun22 = new ModelRenderer(this);
		gun22.setRotationPoint(-3.0F, -25.95F, -16.05F);
		gun.addChild(gun22);
		setRotationAngle(gun22, 2.4166F, 0.0F, 0.0F);
		gun22.cubeList.add(new ModelBox(gun22, 23, 30, 0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F, false));

		gun20 = new ModelRenderer(this);
		gun20.setRotationPoint(-3.0F, -27.3F, -11.6F);
		gun.addChild(gun20);
		setRotationAngle(gun20, -2.3794F, 0.0F, 0.0F);
		gun20.cubeList.add(new ModelBox(gun20, 35, 7, 0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F, false));

		gun19 = new ModelRenderer(this);
		gun19.setRotationPoint(-3.0F, -30.2F, -10.7F);
		gun.addChild(gun19);
		setRotationAngle(gun19, -1.8961F, 0.0F, 0.0F);
		gun19.cubeList.add(new ModelBox(gun19, 7, 147, 0.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F, false));
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