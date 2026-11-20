package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Mini14 extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer gun_r1;
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
	private final ModelRenderer gun204;
	private final ModelRenderer gun205;
	private final ModelRenderer gun206;
	private final ModelRenderer gun209;
	private final ModelRenderer gun208;
	private final ModelRenderer gun207;
	private final ModelRenderer gun120;
	private final ModelRenderer gun108;
	private final ModelRenderer gun113;
	private final ModelRenderer gun112;
	private final ModelRenderer gun119;
	private final ModelRenderer barrel;
	private final ModelRenderer ironsights;
	private final ModelRenderer ironsights_r1;
	private final ModelRenderer ironsights_r2;
	private final ModelRenderer ironsights_r3;
	private final ModelRenderer cube_r42;
	private final ModelRenderer cube_r42_r1;
	private final ModelRenderer cube_r43;
	private final ModelRenderer cube_r44;
	private final ModelRenderer cube_r45;
	private final ModelRenderer cube_r45_r1;

	public Mini14() {
		textureWidth = 340;
		textureHeight = 340;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		gun.cubeList.add(new ModelBox(gun, 0, 30, -2.8F, -40.1F, -21.2F, 3, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 51, 75, -3.0F, -31.0F, -25.3F, 3, 1, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 51, 68, -3.5F, -31.1F, -25.3F, 4, 1, 6, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 51, 21, -3.3F, -39.7F, -33.0F, 1, 3, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 35, 94, -3.5F, -36.5F, -19.5F, 1, 2, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 198, 268, -3.8F, -37.3F, -33.0F, 1, 1, 17, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 183, 188, -3.8F, -38.6F, -28.8F, 1, 1, 13, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 73, 47, -3.7F, -39.0F, -26.3F, 1, 2, 7, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 23, 47, -2.5F, -40.3F, -33.0F, 2, 4, 3, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 2, 142, -0.3F, -40.0F, -32.5F, 1, 1, 4, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 82, 29, -0.1F, -39.3F, -25.8F, 1, 2, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 82, 29, -0.1F, -37.3F, -25.8F, 1, 2, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 71, 94, -0.3F, -39.3F, -32.5F, 1, 4, 11, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 3, 26, -0.3F, -39.3F, -21.5F, 1, 3, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 124, 54, -3.5F, -38.8F, -18.5F, 4, 4, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 35, -2.0F, -30.8F, -19.5F, 1, 3, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 145, 146, -3.0F, -26.95F, -16.05F, 3, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 111, 11, -3.0F, -39.9F, -68.0F, 3, 2, 1, 0.001F, false));

		gun_r1 = new ModelRenderer(this);
		gun_r1.setRotationPoint(-2.1F, -39.75F, -19.705F);
		gun.addChild(gun_r1);
		setRotationAngle(gun_r1, -0.0873F, 0.0F, 0.0F);
		gun_r1.cubeList.add(new ModelBox(gun_r1, 73, 0, -1.1F, -0.35F, -1.495F, 1, 1, 1, -0.201F, false));
		gun_r1.cubeList.add(new ModelBox(gun_r1, 73, 82, -0.9F, -0.55F, -0.695F, 3, 1, 5, 0.0F, false));
		gun_r1.cubeList.add(new ModelBox(gun_r1, 101, 146, -0.9F, -0.65F, -3.305F, 3, 1, 3, -0.1F, false));

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
		gun104_r1.cubeList.add(new ModelBox(gun104_r1, 203, 55, 0.35F, -2.05F, 9.9F, 2, 2, 23, -0.002F, false));

		gun105_r1 = new ModelRenderer(this);
		gun105_r1.setRotationPoint(-1.5F, -39.6F, -75.9F);
		gun.addChild(gun105_r1);
		setRotationAngle(gun105_r1, 0.0F, 0.0F, -0.4363F);
		gun105_r1.cubeList.add(new ModelBox(gun105_r1, 0, 94, -1.0F, 0.0F, 32.9F, 1, 1, 7, 0.0F, false));
		gun105_r1.cubeList.add(new ModelBox(gun105_r1, 0, 78, -1.65F, 0.0F, 32.9F, 1, 1, 7, -0.001F, false));

		gun104_r2 = new ModelRenderer(this);
		gun104_r2.setRotationPoint(-1.5F, -39.6F, -75.9F);
		gun.addChild(gun104_r2);
		setRotationAngle(gun104_r2, 0.0F, 0.0F, 0.4363F);
		gun104_r2.cubeList.add(new ModelBox(gun104_r2, 23, 81, 0.65F, 0.0F, 32.9F, 1, 1, 7, -0.001F, false));
		gun104_r2.cubeList.add(new ModelBox(gun104_r2, 98, 93, 0.0F, 0.0F, 32.9F, 1, 1, 7, 0.0F, false));

		gun103_r1 = new ModelRenderer(this);
		gun103_r1.setRotationPoint(0.55F, -36.8F, -75.9F);
		gun.addChild(gun103_r1);
		setRotationAngle(gun103_r1, 0.0F, 0.0F, -0.2094F);
		gun103_r1.cubeList.add(new ModelBox(gun103_r1, 230, 188, -2.35F, -2.05F, 9.9F, 2, 2, 23, -0.001F, false));
		gun103_r1.cubeList.add(new ModelBox(gun103_r1, 73, 29, -1.1F, -2.1F, 32.9F, 1, 2, 7, 0.0F, false));

		gun105_r2 = new ModelRenderer(this);
		gun105_r2.setRotationPoint(-1.5F, -39.35F, -49.0F);
		gun.addChild(gun105_r2);
		setRotationAngle(gun105_r2, 0.0F, 0.0F, -0.4363F);
		gun105_r2.cubeList.add(new ModelBox(gun105_r2, 198, 234, -1.35F, 0.0F, -17.0F, 1, 1, 23, -0.001F, false));
		gun105_r2.cubeList.add(new ModelBox(gun105_r2, 237, 140, -1.0F, 0.0F, -17.0F, 1, 1, 23, 0.0F, false));

		gun104_r3 = new ModelRenderer(this);
		gun104_r3.setRotationPoint(-1.5F, -39.35F, -49.0F);
		gun.addChild(gun104_r3);
		setRotationAngle(gun104_r3, 0.0F, 0.0F, 0.4363F);
		gun104_r3.cubeList.add(new ModelBox(gun104_r3, 235, 224, 0.35F, 0.0F, -17.0F, 1, 1, 23, -0.001F, false));
		gun104_r3.cubeList.add(new ModelBox(gun104_r3, 65, 238, 0.0F, 0.0F, -17.0F, 1, 1, 23, 0.0F, false));

		gun101_r1 = new ModelRenderer(this);
		gun101_r1.setRotationPoint(-1.5F, -40.1F, -61.0F);
		gun.addChild(gun101_r1);
		setRotationAngle(gun101_r1, 0.0F, 0.0F, -0.4363F);
		gun101_r1.cubeList.add(new ModelBox(gun101_r1, 23, 94, -2.0F, 0.0F, 25.0F, 2, 1, 3, -0.001F, false));

		gun102_r1 = new ModelRenderer(this);
		gun102_r1.setRotationPoint(-1.5F, -40.1F, -61.0F);
		gun.addChild(gun102_r1);
		setRotationAngle(gun102_r1, 0.0F, 0.0F, 0.4363F);
		gun102_r1.cubeList.add(new ModelBox(gun102_r1, 84, 82, 0.0F, 0.0F, 25.0F, 2, 1, 3, -0.001F, false));

		gun102_r2 = new ModelRenderer(this);
		gun102_r2.setRotationPoint(0.8F, -37.2F, -61.0F);
		gun.addChild(gun102_r2);
		setRotationAngle(gun102_r2, 0.0F, 0.0F, -0.2094F);
		gun102_r2.cubeList.add(new ModelBox(gun102_r2, 12, 70, -1.0F, -2.0F, 25.0F, 1, 2, 3, -0.001F, false));

		gun103_r2 = new ModelRenderer(this);
		gun103_r2.setRotationPoint(-3.8F, -37.2F, -61.0F);
		gun.addChild(gun103_r2);
		setRotationAngle(gun103_r2, 0.0F, 0.0F, 0.2094F);
		gun103_r2.cubeList.add(new ModelBox(gun103_r2, 23, 98, 0.0F, -2.0F, 25.0F, 1, 1, 3, -0.001F, false));

		gun100_r1 = new ModelRenderer(this);
		gun100_r1.setRotationPoint(-3.55F, -38.8F, -25.5F);
		gun.addChild(gun100_r1);
		setRotationAngle(gun100_r1, -0.0698F, 0.0F, 0.0F);
		gun100_r1.cubeList.add(new ModelBox(gun100_r1, 51, 21, -0.15F, -0.6185F, 5.7854F, 1, 2, 8, -0.201F, false));

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
		

		gun429_r1 = new ModelRenderer(this);
		gun429_r1.setRotationPoint(0.2F, -40.0F, -25.8F);
		gun.addChild(gun429_r1);
		setRotationAngle(gun429_r1, -0.7854F, 0.0F, 0.0F);
		

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
		gun174.cubeList.add(new ModelBox(gun174, 65, 31, 0.0F, 1.2151F, 3.4948F, 2, 3, 1, 0.0F, false));

		gun172 = new ModelRenderer(this);
		gun172.setRotationPoint(-3.5F, -30.1F, -27.0F);
		gun.addChild(gun172);
		setRotationAngle(gun172, 2.9371F, 0.0F, 0.0F);
		gun172.cubeList.add(new ModelBox(gun172, 229, 154, 0.0F, 0.4061F, -1.9583F, 4, 1, 7, 0.001F, false));

		gun118 = new ModelRenderer(this);
		gun118.setRotationPoint(-2.5F, -40.3F, -39.0F);
		gun.addChild(gun118);
		setRotationAngle(gun118, 0.0F, 0.0F, 0.8976F);
		gun118.cubeList.add(new ModelBox(gun118, 61, 107, 0.0F, 0.0F, 6.0F, 1, 1, 3, 0.001F, false));

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
		gun115.cubeList.add(new ModelBox(gun115, 73, 8, 0.0F, 0.0F, 6.0F, 1, 1, 1, 0.0F, false));

		gun114 = new ModelRenderer(this);
		gun114.setRotationPoint(-0.5F, -40.3F, -38.0F);
		gun.addChild(gun114);
		setRotationAngle(gun114, 0.0F, 0.0F, 0.2244F);
		gun114.cubeList.add(new ModelBox(gun114, 115, 50, 0.0F, 0.0F, 6.0F, 1, 1, 2, 0.001F, false));

		gun107 = new ModelRenderer(this);
		gun107.setRotationPoint(-5.0F, -37.0F, -15.5F);
		gun.addChild(gun107);
		setRotationAngle(gun107, 0.2618F, 0.0F, 0.0F);
		

		gun95 = new ModelRenderer(this);
		gun95.setRotationPoint(-0.15F, -40.0F, -35.0F);
		gun.addChild(gun95);
		setRotationAngle(gun95, -0.2603F, 0.0F, 0.0F);
		

		gun94 = new ModelRenderer(this);
		gun94.setRotationPoint(-0.15F, -40.0F, -33.0F);
		gun.addChild(gun94);
		setRotationAngle(gun94, -1.3384F, 0.0F, 0.0F);
		

		gun92 = new ModelRenderer(this);
		gun92.setRotationPoint(1.3F, -37.8F, -26.5F);
		gun.addChild(gun92);
		setRotationAngle(gun92, 0.0F, 0.0F, 2.6025F);
		

		gun89 = new ModelRenderer(this);
		gun89.setRotationPoint(0.5F, -38.2F, -27.5F);
		gun.addChild(gun89);
		setRotationAngle(gun89, 0.0F, 0.0F, 0.8551F);
		

		gun88 = new ModelRenderer(this);
		gun88.setRotationPoint(0.9F, -38.3F, -38.5F);
		gun.addChild(gun88);
		setRotationAngle(gun88, 0.0F, -2.0442F, 0.0F);
		

		gun87 = new ModelRenderer(this);
		gun87.setRotationPoint(0.7F, -40.0F, -38.5F);
		gun.addChild(gun87);
		setRotationAngle(gun87, 0.0F, -2.0442F, 0.0F);
		gun87.cubeList.add(new ModelBox(gun87, 41, 0, 5.3401F, 0.0F, -2.7355F, 1, 3, 1, 0.0F, false));

		gun83 = new ModelRenderer(this);
		gun83.setRotationPoint(0.9F, -38.3F, -38.5F);
		gun.addChild(gun83);
		setRotationAngle(gun83, 0.0F, 0.0F, 2.8256F);
		

		gun81 = new ModelRenderer(this);
		gun81.setRotationPoint(-0.3F, -40.0F, -34.5F);
		gun.addChild(gun81);
		setRotationAngle(gun81, -0.2557F, 0.0F, 0.0F);
		gun81.cubeList.add(new ModelBox(gun81, 13, 108, 0.0F, -1.5175F, 5.8049F, 1, 1, 3, -0.002F, false));

		gun79 = new ModelRenderer(this);
		gun79.setRotationPoint(-0.3F, -39.6F, -27.5F);
		gun.addChild(gun79);
		setRotationAngle(gun79, -1.3756F, 0.0F, 0.0F);
		

		gun75 = new ModelRenderer(this);
		gun75.setRotationPoint(-3.5F, -39.8F, -15.5F);
		gun.addChild(gun75);
		setRotationAngle(gun75, -1.041F, 0.0F, 0.0F);
		

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

		gun204 = new ModelRenderer(this);
		gun204.setRotationPoint(-2.9F, -39.9F, -77.0F);
		gun.addChild(gun204);
		setRotationAngle(gun204, 0.0F, 0.0F, 0.4114F);
		gun204.cubeList.add(new ModelBox(gun204, 82, 47, 0.0F, 0.0F, 9.0F, 1, 1, 1, 0.0F, false));

		gun205 = new ModelRenderer(this);
		gun205.setRotationPoint(-3.5F, -38.2F, -77.0F);
		gun.addChild(gun205);
		setRotationAngle(gun205, 0.0F, 0.0F, -1.309F);
		gun205.cubeList.add(new ModelBox(gun205, 82, 31, 0.0F, 0.0F, 9.0F, 1, 1, 1, 0.0F, false));

		gun206 = new ModelRenderer(this);
		gun206.setRotationPoint(-3.5F, -38.2F, -77.0F);
		gun.addChild(gun206);
		gun206.cubeList.add(new ModelBox(gun206, 61, 39, 0.0F, 0.0F, 9.0F, 3, 1, 1, 0.0F, false));

		gun209 = new ModelRenderer(this);
		gun209.setRotationPoint(-0.5F, -38.2F, -77.0F);
		gun.addChild(gun209);
		gun209.cubeList.add(new ModelBox(gun209, 9, 80, 0.0F, 0.0F, 9.0F, 1, 1, 1, 0.0F, false));

		gun208 = new ModelRenderer(this);
		gun208.setRotationPoint(0.5F, -38.2F, -77.0F);
		gun.addChild(gun208);
		setRotationAngle(gun208, 0.0F, 0.0F, 2.9172F);
		gun208.cubeList.add(new ModelBox(gun208, 16, 81, 0.0F, 0.0F, 9.0F, 1, 1, 1, 0.0F, false));

		gun207 = new ModelRenderer(this);
		gun207.setRotationPoint(-0.1F, -39.9F, -77.0F);
		gun.addChild(gun207);
		setRotationAngle(gun207, 0.0F, 0.0F, 1.122F);
		gun207.cubeList.add(new ModelBox(gun207, 82, 29, 0.0F, 0.0F, 9.0F, 1, 1, 1, 0.0F, false));

		gun120 = new ModelRenderer(this);
		gun120.setRotationPoint(-3.6F, -37.2F, -83.0F);
		gun.addChild(gun120);
		gun120.cubeList.add(new ModelBox(gun120, 111, 8, 0.0F, 0.0F, 15.0F, 3, 2, 1, 0.0F, false));

		gun108 = new ModelRenderer(this);
		gun108.setRotationPoint(-3.6F, -35.2F, -83.0F);
		gun.addChild(gun108);
		setRotationAngle(gun108, 0.0F, 0.0F, -0.7064F);
		gun108.cubeList.add(new ModelBox(gun108, 41, 58, 0.0F, 0.0F, 15.0F, 1, 2, 1, 0.0F, false));

		gun113 = new ModelRenderer(this);
		gun113.setRotationPoint(-2.5F, -35.8F, -83.0F);
		gun.addChild(gun113);
		gun113.cubeList.add(new ModelBox(gun113, 102, 3, 0.0F, 0.2F, 15.0F, 2, 2, 1, 0.0F, false));

		gun112 = new ModelRenderer(this);
		gun112.setRotationPoint(0.6F, -35.2F, -83.0F);
		gun.addChild(gun112);
		setRotationAngle(gun112, 0.0F, 0.0F, 2.3051F);
		gun112.cubeList.add(new ModelBox(gun112, 0, 74, 0.0F, 0.0F, 15.0F, 2, 1, 1, 0.0F, false));

		gun119 = new ModelRenderer(this);
		gun119.setRotationPoint(-1.4F, -37.2F, -83.0F);
		gun.addChild(gun119);
		gun119.cubeList.add(new ModelBox(gun119, 102, 0, 0.0F, 0.0F, 15.0F, 2, 2, 1, 0.0F, false));

		barrel = new ModelRenderer(this);
		barrel.setRotationPoint(0.0F, 0.0F, 0.0F);
		gun.addChild(barrel);
		barrel.cubeList.add(new ModelBox(barrel, 102, 0, -1.75F, -38.75F, -83.0F, 1, 1, 20, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 51, 21, -1.85F, -38.9F, -83.0F, 1, 1, 20, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 102, 67, -2.0F, -39.0F, -83.0F, 1, 1, 20, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 51, 68, -2.15F, -38.9F, -83.0F, 1, 1, 20, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 102, 21, -2.25F, -38.75F, -83.0F, 1, 1, 20, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 51, 47, -2.15F, -38.6F, -83.0F, 1, 1, 20, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 102, 46, -2.0F, -38.5F, -83.0F, 1, 1, 20, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 51, 0, -1.85F, -38.6F, -83.0F, 1, 1, 20, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 113, 11, -1.75F, -38.75F, -92.0F, 1, 1, 9, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 62, 32, -1.85F, -38.9F, -92.0F, 1, 1, 9, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 113, 78, -2.0F, -39.0F, -92.0F, 1, 1, 9, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 62, 79, -2.15F, -38.9F, -92.0F, 1, 1, 9, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 113, 32, -2.25F, -38.75F, -92.0F, 1, 1, 9, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 62, 58, -2.15F, -38.6F, -92.0F, 1, 1, 9, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 113, 57, -2.0F, -38.5F, -92.0F, 1, 1, 9, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 62, 11, -1.85F, -38.6F, -92.0F, 1, 1, 9, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 96, 29, -1.85F, -38.6F, -91.1F, 1, 1, 1, 0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 131, 68, -2.0F, -38.5F, -91.1F, 1, 1, 1, 0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 96, 60, -2.15F, -38.6F, -91.1F, 1, 1, 1, 0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 129, 27, -2.25F, -38.75F, -91.1F, 1, 1, 1, 0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 96, 79, -2.15F, -38.9F, -91.1F, 1, 1, 1, 0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 75, 44, -2.0F, -39.0F, -91.1F, 1, 1, 1, 0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 96, 31, -1.85F, -38.9F, -91.1F, 1, 1, 1, 0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 96, 58, -1.75F, -38.75F, -91.1F, 1, 1, 1, 0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 96, 29, -1.85F, -38.6F, -91.6F, 1, 1, 1, 0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 131, 68, -2.0F, -38.5F, -91.6F, 1, 1, 1, 0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 96, 60, -2.15F, -38.6F, -91.6F, 1, 1, 1, 0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 129, 27, -2.25F, -38.75F, -91.6F, 1, 1, 1, 0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 96, 79, -2.15F, -38.9F, -91.6F, 1, 1, 1, 0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 75, 44, -2.0F, -39.0F, -91.6F, 1, 1, 1, 0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 96, 31, -1.85F, -38.9F, -91.6F, 1, 1, 1, 0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 96, 58, -1.75F, -38.75F, -91.6F, 1, 1, 1, 0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 96, 23, -2.0F, -40.5F, -91.1F, 1, 2, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 96, 15, -2.0F, -40.5F, -91.6F, 1, 2, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 111, 29, -1.55F, -38.75F, -69.0F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 111, 32, -1.75F, -39.0F, -69.0F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 37, 111, -2.0F, -39.2F, -69.0F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 111, 46, -2.25F, -39.0F, -69.0F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 111, 49, -2.45F, -38.75F, -69.0F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 111, 54, -2.25F, -38.5F, -69.0F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 23, 108, -1.75F, -38.5F, -69.0F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 15, 0, -2.0F, -38.3F, -69.0F, 1, 3, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 121, 126, -2.0F, -36.2F, -68.0F, 1, 1, 6, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 102, 46, -1.75F, -36.0F, -69.0F, 1, 1, 7, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 40, 106, -2.0F, -35.75F, -70.0F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 102, 54, -1.55F, -35.75F, -69.0F, 1, 1, 7, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 102, 67, -1.75F, -35.5F, -69.0F, 1, 1, 7, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 102, 0, -2.25F, -36.0F, -69.0F, 1, 1, 7, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 102, 29, -2.45F, -35.75F, -69.0F, 1, 1, 7, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 102, 21, -2.25F, -35.5F, -69.0F, 1, 1, 7, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 73, 77, -1.55F, -38.75F, -63.0F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 35, 77, -1.75F, -39.0F, -63.0F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 17, 77, -1.75F, -38.5F, -63.0F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 9, 78, -2.0F, -38.3F, -63.0F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 41, 75, -2.25F, -39.0F, -63.0F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 41, 77, -2.45F, -38.75F, -63.0F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 73, 75, -2.25F, -38.5F, -63.0F, 1, 1, 1, 0.0F, false));

		ironsights = new ModelRenderer(this);
		ironsights.setRotationPoint(0.0F, -39.8F, -51.0F);
		gun.addChild(ironsights);
		ironsights.cubeList.add(new ModelBox(ironsights, 113, 178, -2.4F, -1.06F, 33.22F, 2, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 248, 125, -2.4F, -1.26F, 33.22F, 2, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 249, 125, -2.4F, -1.46F, 33.22F, 2, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 249, 125, -2.6F, -1.46F, 33.22F, 1, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 248, 125, -2.6F, -1.26F, 33.22F, 1, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 249, 125, -2.4F, -2.26F, 33.22F, 2, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 249, 125, -2.6F, -2.26F, 33.22F, 1, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 248, 125, -2.6F, -2.06F, 33.22F, 1, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 248, 125, -2.4F, -2.06F, 33.22F, 2, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 113, 178, -2.6F, -1.06F, 33.22F, 1, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 96, 83, -1.4F, -1.66F, 33.22F, 1, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 96, 81, -1.6F, -1.66F, 33.22F, 1, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 96, 77, -1.7F, -1.66F, 33.22F, 1, 1, 1, -0.401F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 96, 61, -1.7F, -1.86F, 33.22F, 1, 1, 1, -0.402F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 96, 63, -1.6F, -1.86F, 33.22F, 1, 1, 1, -0.401F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 96, 67, -1.4F, -1.86F, 33.22F, 1, 1, 1, -0.401F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 97, 78, -2.3F, -1.86F, 33.22F, 1, 1, 1, -0.402F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 96, 78, -2.4F, -1.86F, 33.22F, 1, 1, 1, -0.401F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 97, 78, -2.6F, -1.86F, 33.22F, 1, 1, 1, -0.401F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 97, 80, -2.3F, -1.66F, 33.22F, 1, 1, 1, -0.401F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 95, 74, -2.4F, -1.66F, 33.22F, 1, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 97, 71, -2.6F, -1.66F, 33.22F, 1, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 95, 25, -2.0F, -1.7F, -41.0F, 1, 2, 2, -0.4F, false));

		ironsights_r1 = new ModelRenderer(this);
		ironsights_r1.setRotationPoint(-0.8888F, -1.198F, -39.7F);
		ironsights.addChild(ironsights_r1);
		setRotationAngle(ironsights_r1, 0.0F, 0.0F, 0.3491F);
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 129, 24, -0.5F, -1.0F, -1.0F, 1, 2, 2, -0.4F, false));
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 129, 24, -0.5F, -1.0F, -1.3F, 1, 2, 2, -0.4F, false));

		ironsights_r2 = new ModelRenderer(this);
		ironsights_r2.setRotationPoint(-2.1112F, -1.198F, -39.7F);
		ironsights.addChild(ironsights_r2);
		setRotationAngle(ironsights_r2, 0.0F, 0.0F, -0.3491F);
		ironsights_r2.cubeList.add(new ModelBox(ironsights_r2, 95, 34, -0.5F, -1.0F, -1.0F, 1, 2, 2, -0.4F, false));
		ironsights_r2.cubeList.add(new ModelBox(ironsights_r2, 95, 34, -0.5F, -1.0F, -1.3F, 1, 2, 2, -0.4F, false));

		ironsights_r3 = new ModelRenderer(this);
		ironsights_r3.setRotationPoint(-1.5F, -0.33F, 32.3911F);
		ironsights.addChild(ironsights_r3);
		setRotationAngle(ironsights_r3, -3.1416F, 0.0F, 3.1416F);
		ironsights_r3.cubeList.add(new ModelBox(ironsights_r3, 236, 132, 0.4F, -1.53F, -2.3711F, 1, 2, 2, -0.301F, false));
		ironsights_r3.cubeList.add(new ModelBox(ironsights_r3, 239, 131, -1.4F, -1.53F, -2.3711F, 1, 2, 2, -0.301F, false));
		ironsights_r3.cubeList.add(new ModelBox(ironsights_r3, 164, 130, 0.4F, -0.67F, -0.2911F, 1, 1, 2, -0.301F, false));
		ironsights_r3.cubeList.add(new ModelBox(ironsights_r3, 162, 110, -1.4F, -0.67F, -0.2911F, 1, 1, 2, -0.301F, false));
		ironsights_r3.cubeList.add(new ModelBox(ironsights_r3, 248, 206, -1.4F, -0.47F, -3.2911F, 2, 2, 5, -0.299F, false));
		ironsights_r3.cubeList.add(new ModelBox(ironsights_r3, 221, 73, -0.6F, -0.47F, -3.2911F, 2, 2, 5, -0.3F, false));

		cube_r42 = new ModelRenderer(this);
		cube_r42.setRotationPoint(-0.4F, -1.66F, 35.22F);
		ironsights.addChild(cube_r42);
		setRotationAngle(cube_r42, -0.5236F, 0.0F, 0.0F);
		

		cube_r42_r1 = new ModelRenderer(this);
		cube_r42_r1.setRotationPoint(-1.1F, -0.7703F, 3.7942F);
		cube_r42.addChild(cube_r42_r1);
		setRotationAngle(cube_r42_r1, 2.0944F, 0.0F, 3.1416F);
		cube_r42_r1.cubeList.add(new ModelBox(cube_r42_r1, 203, 48, -1.4F, -4.1931F, 4.183F, 1, 2, 3, -0.302F, false));
		cube_r42_r1.cubeList.add(new ModelBox(cube_r42_r1, 204, 59, 0.4F, -4.1931F, 4.183F, 1, 2, 3, -0.302F, false));

		cube_r43 = new ModelRenderer(this);
		cube_r43.setRotationPoint(-2.7F, -1.36F, 40.72F);
		ironsights.addChild(cube_r43);
		setRotationAngle(cube_r43, 0.3665F, 0.0F, 0.0F);
		

		cube_r44 = new ModelRenderer(this);
		cube_r44.setRotationPoint(-0.4F, -1.16F, 33.92F);
		ironsights.addChild(cube_r44);
		setRotationAngle(cube_r44, 0.3665F, 0.0F, 0.0F);
		

		cube_r45 = new ModelRenderer(this);
		cube_r45.setRotationPoint(-0.8F, -0.6F, 32.9F);
		ironsights.addChild(cube_r45);
		setRotationAngle(cube_r45, -0.7156F, 0.0F, 0.0F);
		

		cube_r45_r1 = new ModelRenderer(this);
		cube_r45_r1.setRotationPoint(-0.7F, -3.8023F, 4.633F);
		cube_r45.addChild(cube_r45_r1);
		setRotationAngle(cube_r45_r1, 1.7104F, 0.0F, -3.1416F);
		cube_r45_r1.cubeList.add(new ModelBox(cube_r45_r1, 237, 131, -1.4F, -4.0549F, 2.3023F, 1, 2, 2, -0.302F, false));
		cube_r45_r1.cubeList.add(new ModelBox(cube_r45_r1, 197, 70, 0.4F, -4.0549F, 2.3023F, 1, 2, 2, -0.302F, false));
		cube_r45_r1.cubeList.add(new ModelBox(cube_r45_r1, 206, 63, -1.0F, -3.0549F, 2.3023F, 2, 1, 1, -0.302F, false));
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