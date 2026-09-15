package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AK74Handguard extends ModelBase {
	private final ModelRenderer handguardWood;
	private final ModelRenderer handguard_r1;
	private final ModelRenderer handguard_r2;
	private final ModelRenderer handguard_r3;
	private final ModelRenderer handguard_r4;
	private final ModelRenderer handguard_r5;
	private final ModelRenderer handguard_r6;
	private final ModelRenderer handguard_r7;
	private final ModelRenderer handguard_r8;
	private final ModelRenderer handguard_r9;
	private final ModelRenderer handguard_r10;
	private final ModelRenderer gun153_r1;
	private final ModelRenderer gun154_r1;
	private final ModelRenderer gun155_r1;
	private final ModelRenderer gun156_r1;
	private final ModelRenderer gun157_r1;
	private final ModelRenderer gun159_r1;
	private final ModelRenderer gun183_r1;
	private final ModelRenderer gun184_r1;
	private final ModelRenderer gun185_r1;
	private final ModelRenderer gun186_r1;
	private final ModelRenderer gun187_r1;
	private final ModelRenderer gun189_r1;
	private final ModelRenderer gun190_r1;
	private final ModelRenderer gun192_r1;
	private final ModelRenderer gun221_r1;
	private final ModelRenderer gun222_r1;
	private final ModelRenderer gun223_r1;
	private final ModelRenderer gun224_r1;
	private final ModelRenderer gun225_r1;
	private final ModelRenderer gun226_r1;
	private final ModelRenderer gun227_r1;
	private final ModelRenderer gun228_r1;
	private final ModelRenderer gun229_r1;
	private final ModelRenderer gun230_r1;
	private final ModelRenderer gun231_r1;
	private final ModelRenderer gun232_r1;
	private final ModelRenderer gun234_r1;
	private final ModelRenderer gun235_r1;
	private final ModelRenderer gun236_r1;
	private final ModelRenderer gun237_r1;
	private final ModelRenderer gun238_r1;
	private final ModelRenderer gun239_r1;
	private final ModelRenderer gun240_r1;
	private final ModelRenderer gun241_r1;

	public AK74Handguard() {
		textureWidth = 384;
		textureHeight = 384;

		handguardWood = new ModelRenderer(this);
		handguardWood.setRotationPoint(0.0F, 24.0F, 0.0F);
		handguardWood.cubeList.add(new ModelBox(handguardWood, 22, 338, -4.0F, -37.0F, -40.5F, 5, 4, 5, 0.0F, false));
		handguardWood.cubeList.add(new ModelBox(handguardWood, 216, 14, -4.0F, -35.0F, -53.5F, 5, 1, 13, 0.0F, false));
		handguardWood.cubeList.add(new ModelBox(handguardWood, 214, 75, -4.0F, -35.95F, -50.5F, 5, 1, 8, 0.0F, false));
		handguardWood.cubeList.add(new ModelBox(handguardWood, 18, 347, -3.658F, -36.8897F, -50.5F, 1, 1, 8, 0.0F, false));
		handguardWood.cubeList.add(new ModelBox(handguardWood, 36, 347, -0.342F, -36.8897F, -50.5F, 1, 1, 8, 0.0F, false));
		handguardWood.cubeList.add(new ModelBox(handguardWood, 278, 89, -3.0F, -34.0F, -53.5F, 3, 1, 12, 0.0F, false));
		handguardWood.cubeList.add(new ModelBox(handguardWood, 216, 28, -3.999F, -38.9F, -53.501F, 5, 1, 13, 0.0F, false));
		handguardWood.cubeList.add(new ModelBox(handguardWood, 278, 102, -4.0F, -38.3F, -53.5F, 5, 1, 3, 0.0F, false));
		handguardWood.cubeList.add(new ModelBox(handguardWood, 354, 36, -4.0F, -38.3F, -42.5F, 5, 1, 2, 0.0F, false));
		handguardWood.cubeList.add(new ModelBox(handguardWood, 216, 56, -4.0F, -36.9F, -53.5F, 5, 2, 3, 0.001F, false));
		handguardWood.cubeList.add(new ModelBox(handguardWood, 338, 48, -4.0F, -36.9F, -42.5F, 5, 2, 2, 0.001F, false));
		handguardWood.cubeList.add(new ModelBox(handguardWood, 322, 281, -3.999F, -33.5F, -37.5F, 5, 3, 1, 0.0F, false));
		handguardWood.cubeList.add(new ModelBox(handguardWood, 0, 360, -3.999F, -33.0F, -36.5F, 5, 2, 1, 0.0F, false));
		handguardWood.cubeList.add(new ModelBox(handguardWood, 348, 79, -3.0F, -31.5F, -38.5F, 3, 1, 1, 0.0F, false));
		handguardWood.cubeList.add(new ModelBox(handguardWood, 226, 227, -3.499F, -38.0F, -53.5F, 4, 2, 13, 0.0F, false));
		handguardWood.cubeList.add(new ModelBox(handguardWood, 108, 325, -2.9F, -39.7F, -54.002F, 2, 1, 1, 0.0F, false));
		handguardWood.cubeList.add(new ModelBox(handguardWood, 254, 367, -1.1F, -39.7F, -54.001F, 1, 1, 1, 0.0F, false));
		handguardWood.cubeList.add(new ModelBox(handguardWood, 338, 264, -3.9F, -38.7F, -54.001F, 3, 4, 1, 0.0F, false));
		handguardWood.cubeList.add(new ModelBox(handguardWood, 108, 320, -1.1F, -38.7F, -54.002F, 2, 4, 1, 0.0F, false));
		handguardWood.cubeList.add(new ModelBox(handguardWood, 370, 9, -2.9F, -35.2F, -54.003F, 2, 2, 1, 0.0F, false));
		handguardWood.cubeList.add(new ModelBox(handguardWood, 60, 271, -1.1F, -35.2F, -54.0F, 1, 2, 1, 0.0F, false));
		handguardWood.cubeList.add(new ModelBox(handguardWood, 212, 115, -4.5F, -35.0F, -51.5F, 6, 1, 10, 0.0F, false));

		handguard_r1 = new ModelRenderer(this);
		handguard_r1.setRotationPoint(-3.7427F, -37.7805F, -50.176F);
		handguardWood.addChild(handguard_r1);
		setRotationAngle(handguard_r1, 0.0F, 0.0F, 1.2217F);
		handguard_r1.cubeList.add(new ModelBox(handguard_r1, 334, 281, -0.5F, -0.5005F, -1.0F, 1, 1, 9, -0.3F, false));

		handguard_r2 = new ModelRenderer(this);
		handguard_r2.setRotationPoint(0.7447F, -37.7805F, -50.176F);
		handguardWood.addChild(handguard_r2);
		setRotationAngle(handguard_r2, 0.0F, 0.0F, -1.2217F);
		handguard_r2.cubeList.add(new ModelBox(handguard_r2, 336, 53, -0.5F, -0.5F, -1.0F, 1, 1, 9, -0.3F, false));

		handguard_r3 = new ModelRenderer(this);
		handguard_r3.setRotationPoint(-3.6145F, -37.7207F, -49.701F);
		handguardWood.addChild(handguard_r3);
		setRotationAngle(handguard_r3, 0.0F, 0.0F, 1.2217F);
		handguard_r3.cubeList.add(new ModelBox(handguard_r3, 168, 371, -0.5F, -0.5F, 2.0F, 1, 1, 2, -0.2F, false));

		handguard_r4 = new ModelRenderer(this);
		handguard_r4.setRotationPoint(0.6165F, -37.7207F, -49.701F);
		handguardWood.addChild(handguard_r4);
		setRotationAngle(handguard_r4, 0.0F, 0.0F, -1.2217F);
		handguard_r4.cubeList.add(new ModelBox(handguard_r4, 150, 371, -0.5F, -0.5003F, 2.0F, 1, 1, 2, -0.2F, false));

		handguard_r5 = new ModelRenderer(this);
		handguard_r5.setRotationPoint(1.0432F, -34.3695F, -46.5F);
		handguardWood.addChild(handguard_r5);
		setRotationAngle(handguard_r5, 0.0F, 0.0F, 1.2217F);
		handguard_r5.cubeList.add(new ModelBox(handguard_r5, 288, 346, -2.5F, -0.5F, -4.0F, 1, 1, 8, 0.0F, false));

		handguard_r6 = new ModelRenderer(this);
		handguard_r6.setRotationPoint(-2.6751F, -38.1282F, -46.5F);
		handguardWood.addChild(handguard_r6);
		setRotationAngle(handguard_r6, 0.0F, 0.0F, -1.2217F);
		handguard_r6.cubeList.add(new ModelBox(handguard_r6, 346, 264, -2.5F, -0.5F, -4.0F, 1, 1, 8, 0.0F, false));

		handguard_r7 = new ModelRenderer(this);
		handguard_r7.setRotationPoint(-5.1912F, -36.401F, -39.7022F);
		handguardWood.addChild(handguard_r7);
		setRotationAngle(handguard_r7, 0.0F, -0.5672F, 0.0F);
		handguard_r7.cubeList.add(new ModelBox(handguard_r7, 374, 152, -0.5F, -0.5F, -4.0F, 1, 1, 1, 0.0F, false));

		handguard_r8 = new ModelRenderer(this);
		handguard_r8.setRotationPoint(-5.1912F, -36.401F, -53.2978F);
		handguardWood.addChild(handguard_r8);
		setRotationAngle(handguard_r8, 0.0F, 0.5672F, 0.0F);
		handguard_r8.cubeList.add(new ModelBox(handguard_r8, 374, 154, -0.5F, -0.5F, 3.0F, 1, 1, 1, 0.0F, false));

		handguard_r9 = new ModelRenderer(this);
		handguard_r9.setRotationPoint(-1.5699F, -36.401F, -45.6059F);
		handguardWood.addChild(handguard_r9);
		setRotationAngle(handguard_r9, 0.0F, 0.5672F, 0.0F);
		handguard_r9.cubeList.add(new ModelBox(handguard_r9, 152, 374, -0.5F, -0.5F, 3.0F, 1, 1, 1, 0.0F, false));

		handguard_r10 = new ModelRenderer(this);
		handguard_r10.setRotationPoint(-1.5699F, -36.401F, -47.3941F);
		handguardWood.addChild(handguard_r10);
		setRotationAngle(handguard_r10, 0.0F, -0.5672F, 0.0F);
		handguard_r10.cubeList.add(new ModelBox(handguard_r10, 374, 150, -0.5F, -0.5F, -4.0F, 1, 1, 1, 0.0F, false));

		gun153_r1 = new ModelRenderer(this);
		gun153_r1.setRotationPoint(0.0F, -31.0F, -36.5F);
		handguardWood.addChild(gun153_r1);
		setRotationAngle(gun153_r1, 0.0F, 0.0F, -2.3423F);
		

		gun154_r1 = new ModelRenderer(this);
		gun154_r1.setRotationPoint(0.9F, -31.9F, -36.5F);
		handguardWood.addChild(gun154_r1);
		setRotationAngle(gun154_r1, 0.0F, 0.0F, 2.3794F);
		

		gun155_r1 = new ModelRenderer(this);
		gun155_r1.setRotationPoint(-3.9F, -31.9F, -36.5F);
		handguardWood.addChild(gun155_r1);
		setRotationAngle(gun155_r1, 0.0F, 0.0F, -0.7064F);
		

		gun156_r1 = new ModelRenderer(this);
		gun156_r1.setRotationPoint(-3.0F, -31.0F, -36.5F);
		handguardWood.addChild(gun156_r1);
		setRotationAngle(gun156_r1, 0.0F, 0.0F, -2.4166F);
		

		gun157_r1 = new ModelRenderer(this);
		gun157_r1.setRotationPoint(-4.0F, -34.0F, -53.5F);
		handguardWood.addChild(gun157_r1);
		setRotationAngle(gun157_r1, 1.4871F, 0.0F, 0.0F);
		gun157_r1.cubeList.add(new ModelBox(gun157_r1, 190, 337, 0.002F, 0.9965F, 0.0836F, 5, 16, 1, 0.0F, false));

		gun159_r1 = new ModelRenderer(this);
		gun159_r1.setRotationPoint(-3.0F, -33.0F, -53.5F);
		handguardWood.addChild(gun159_r1);
		setRotationAngle(gun159_r1, 1.4871F, 0.0F, 0.0F);
		gun159_r1.cubeList.add(new ModelBox(gun159_r1, 168, 341, 0.0F, 0.9965F, 0.0836F, 3, 17, 1, 0.0F, false));

		gun183_r1 = new ModelRenderer(this);
		gun183_r1.setRotationPoint(-3.0F, -39.8F, -53.5F);
		handguardWood.addChild(gun183_r1);
		setRotationAngle(gun183_r1, 0.0175F, 0.0F, 0.0F);
		gun183_r1.cubeList.add(new ModelBox(gun183_r1, 32, 257, 0.0F, 0.0F, 0.0F, 3, 1, 13, 0.0F, false));

		gun184_r1 = new ModelRenderer(this);
		gun184_r1.setRotationPoint(-4.0F, -38.9F, -53.5F);
		handguardWood.addChild(gun184_r1);
		setRotationAngle(gun184_r1, 0.0F, 0.0F, -0.7064F);
		gun184_r1.cubeList.add(new ModelBox(gun184_r1, 152, 287, 0.0F, 0.0F, 0.0F, 1, 1, 13, 0.0F, false));

		gun185_r1 = new ModelRenderer(this);
		gun185_r1.setRotationPoint(-3.0F, -39.8F, -53.5F);
		handguardWood.addChild(gun185_r1);
		setRotationAngle(gun185_r1, 0.0F, 0.0F, 0.8179F);
		gun185_r1.cubeList.add(new ModelBox(gun185_r1, 180, 288, -0.001F, 0.0F, -0.001F, 1, 1, 13, 0.0F, false));

		gun186_r1 = new ModelRenderer(this);
		gun186_r1.setRotationPoint(0.0F, -39.8F, -53.5F);
		handguardWood.addChild(gun186_r1);
		setRotationAngle(gun186_r1, 0.0F, 0.0F, 0.7436F);
		gun186_r1.cubeList.add(new ModelBox(gun186_r1, 58, 289, 0.0F, -0.001F, -0.001F, 1, 1, 13, 0.0F, false));

		gun187_r1 = new ModelRenderer(this);
		gun187_r1.setRotationPoint(1.0F, -38.9F, -53.5F);
		handguardWood.addChild(gun187_r1);
		setRotationAngle(gun187_r1, 0.0F, 0.0F, 2.3051F);
		gun187_r1.cubeList.add(new ModelBox(gun187_r1, 290, 224, 0.0F, 0.0F, 0.0F, 1, 1, 13, 0.0F, false));

		gun189_r1 = new ModelRenderer(this);
		gun189_r1.setRotationPoint(-4.0F, -30.5F, -38.5F);
		handguardWood.addChild(gun189_r1);
		setRotationAngle(gun189_r1, 2.6025F, 0.0F, 0.0F);
		gun189_r1.cubeList.add(new ModelBox(gun189_r1, 334, 291, -0.001F, 0.5134F, -0.8582F, 5, 2, 5, 0.0F, false));

		gun190_r1 = new ModelRenderer(this);
		gun190_r1.setRotationPoint(-4.0F, -30.5F, -37.5F);
		handguardWood.addChild(gun190_r1);
		setRotationAngle(gun190_r1, 2.1192F, 0.0F, 0.0F);
		gun190_r1.cubeList.add(new ModelBox(gun190_r1, 186, 61, 0.0F, 0.8534F, -0.5213F, 5, 1, 1, 0.0F, false));

		gun192_r1 = new ModelRenderer(this);
		gun192_r1.setRotationPoint(-3.0F, -30.5F, -39.5F);
		handguardWood.addChild(gun192_r1);
		setRotationAngle(gun192_r1, 2.6025F, 0.0F, 0.0F);
		gun192_r1.cubeList.add(new ModelBox(gun192_r1, 348, 171, -0.001F, 0.5134F, -0.8582F, 3, 2, 5, 0.0F, false));

		gun221_r1 = new ModelRenderer(this);
		gun221_r1.setRotationPoint(-3.9F, -34.7F, -54.0F);
		handguardWood.addChild(gun221_r1);
		setRotationAngle(gun221_r1, 0.0F, 0.0F, -0.4833F);
		gun221_r1.cubeList.add(new ModelBox(gun221_r1, 360, 367, 0.0F, 0.0F, 0.001F, 1, 1, 1, 0.0F, false));

		gun222_r1 = new ModelRenderer(this);
		gun222_r1.setRotationPoint(-2.9F, -33.2F, -54.0F);
		handguardWood.addChild(gun222_r1);
		setRotationAngle(gun222_r1, 0.0F, 0.0F, -2.2679F);
		gun222_r1.cubeList.add(new ModelBox(gun222_r1, 186, 368, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun223_r1 = new ModelRenderer(this);
		gun223_r1.setRotationPoint(-0.1F, -33.2F, -54.0F);
		handguardWood.addChild(gun223_r1);
		setRotationAngle(gun223_r1, 0.0F, 0.0F, -2.4363F);
		gun223_r1.cubeList.add(new ModelBox(gun223_r1, 144, 369, 0.0F, 0.0F, -0.001F, 1, 1, 1, 0.0F, false));

		gun224_r1 = new ModelRenderer(this);
		gun224_r1.setRotationPoint(0.9F, -34.7F, -54.0F);
		handguardWood.addChild(gun224_r1);
		setRotationAngle(gun224_r1, 0.0F, 0.0F, 2.0448F);
		gun224_r1.cubeList.add(new ModelBox(gun224_r1, 84, 371, 0.0F, 0.0F, 0.001F, 1, 1, 1, 0.0F, false));

		gun225_r1 = new ModelRenderer(this);
		gun225_r1.setRotationPoint(-0.1F, -39.7F, -54.0F);
		handguardWood.addChild(gun225_r1);
		setRotationAngle(gun225_r1, 0.0F, 0.0F, 0.7808F);
		gun225_r1.cubeList.add(new ModelBox(gun225_r1, 90, 373, 0.0F, 0.0F, 0.001F, 1, 1, 1, 0.0F, false));

		gun226_r1 = new ModelRenderer(this);
		gun226_r1.setRotationPoint(0.9F, -38.7F, -54.0F);
		handguardWood.addChild(gun226_r1);
		setRotationAngle(gun226_r1, 0.0F, 0.0F, 2.3794F);
		gun226_r1.cubeList.add(new ModelBox(gun226_r1, 282, 373, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun227_r1 = new ModelRenderer(this);
		gun227_r1.setRotationPoint(-2.9F, -39.7F, -54.0F);
		handguardWood.addChild(gun227_r1);
		setRotationAngle(gun227_r1, 0.0F, 0.0F, 0.8179F);
		gun227_r1.cubeList.add(new ModelBox(gun227_r1, 286, 373, 0.0F, 0.0F, 0.001F, 1, 1, 1, 0.0F, false));

		gun228_r1 = new ModelRenderer(this);
		gun228_r1.setRotationPoint(-3.9F, -38.7F, -54.0F);
		handguardWood.addChild(gun228_r1);
		setRotationAngle(gun228_r1, 0.0F, 0.0F, -0.7808F);
		gun228_r1.cubeList.add(new ModelBox(gun228_r1, 290, 373, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun229_r1 = new ModelRenderer(this);
		gun229_r1.setRotationPoint(-3.0F, -33.0F, -53.5F);
		handguardWood.addChild(gun229_r1);
		setRotationAngle(gun229_r1, 0.0F, 0.0F, -2.3423F);
		gun229_r1.cubeList.add(new ModelBox(gun229_r1, 310, 55, 0.0F, 0.0F, 0.0F, 1, 1, 12, 0.0F, false));

		gun230_r1 = new ModelRenderer(this);
		gun230_r1.setRotationPoint(-4.0F, -34.0F, -53.5F);
		handguardWood.addChild(gun230_r1);
		setRotationAngle(gun230_r1, 0.0F, 0.0F, -0.7808F);
		gun230_r1.cubeList.add(new ModelBox(gun230_r1, 334, 117, 0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		gun231_r1 = new ModelRenderer(this);
		gun231_r1.setRotationPoint(1.0F, -34.0F, -53.5F);
		handguardWood.addChild(gun231_r1);
		setRotationAngle(gun231_r1, 0.0F, 0.0F, 2.3794F);
		gun231_r1.cubeList.add(new ModelBox(gun231_r1, 310, 68, 0.0F, 0.0F, 0.0F, 1, 1, 12, 0.0F, false));

		gun232_r1 = new ModelRenderer(this);
		gun232_r1.setRotationPoint(0.0F, -33.0F, -53.5F);
		handguardWood.addChild(gun232_r1);
		setRotationAngle(gun232_r1, 0.0F, 0.0F, -2.3794F);
		gun232_r1.cubeList.add(new ModelBox(gun232_r1, 238, 177, 0.0F, 0.0F, 0.0F, 1, 1, 15, 0.0F, false));

		gun234_r1 = new ModelRenderer(this);
		gun234_r1.setRotationPoint(-4.5F, -35.0F, -52.5F);
		handguardWood.addChild(gun234_r1);
		setRotationAngle(gun234_r1, 0.0F, 0.0F, -0.7854F);
		gun234_r1.cubeList.add(new ModelBox(gun234_r1, 24, 327, 0.0F, 0.0F, 1.0F, 1, 1, 10, 0.0F, false));

		gun235_r1 = new ModelRenderer(this);
		gun235_r1.setRotationPoint(-4.5F, -34.0F, -52.5F);
		handguardWood.addChild(gun235_r1);
		setRotationAngle(gun235_r1, 0.0F, 0.0F, -0.7854F);
		gun235_r1.cubeList.add(new ModelBox(gun235_r1, 46, 327, 0.0F, 0.0F, 1.0F, 1, 1, 10, 0.0F, false));

		gun236_r1 = new ModelRenderer(this);
		gun236_r1.setRotationPoint(1.5F, -34.0F, -52.5F);
		handguardWood.addChild(gun236_r1);
		setRotationAngle(gun236_r1, 0.0F, 0.0F, 0.7854F);
		gun236_r1.cubeList.add(new ModelBox(gun236_r1, 68, 327, -1.0F, 0.0F, 1.0F, 1, 1, 10, 0.0F, false));

		gun237_r1 = new ModelRenderer(this);
		gun237_r1.setRotationPoint(1.5F, -35.0F, -52.5F);
		handguardWood.addChild(gun237_r1);
		setRotationAngle(gun237_r1, 0.0F, 0.0F, 0.7854F);
		gun237_r1.cubeList.add(new ModelBox(gun237_r1, 90, 327, -1.0F, 0.0F, 1.0F, 1, 1, 10, 0.0F, false));

		gun238_r1 = new ModelRenderer(this);
		gun238_r1.setRotationPoint(-4.5F, -35.0F, -52.5F);
		handguardWood.addChild(gun238_r1);
		setRotationAngle(gun238_r1, 0.0F, 0.7854F, 0.0F);
		gun238_r1.cubeList.add(new ModelBox(gun238_r1, 332, 373, -0.7071F, 0.0F, 0.7071F, 1, 1, 1, 0.0F, false));

		gun239_r1 = new ModelRenderer(this);
		gun239_r1.setRotationPoint(-4.5F, -35.0F, -41.5F);
		handguardWood.addChild(gun239_r1);
		setRotationAngle(gun239_r1, 0.0F, 0.7854F, 0.0F);
		gun239_r1.cubeList.add(new ModelBox(gun239_r1, 336, 373, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun240_r1 = new ModelRenderer(this);
		gun240_r1.setRotationPoint(1.5F, -35.0F, -41.5F);
		handguardWood.addChild(gun240_r1);
		setRotationAngle(gun240_r1, 0.0F, -2.3562F, 0.0F);
		gun240_r1.cubeList.add(new ModelBox(gun240_r1, 358, 373, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun241_r1 = new ModelRenderer(this);
		gun241_r1.setRotationPoint(1.5F, -35.0F, -52.5F);
		handguardWood.addChild(gun241_r1);
		setRotationAngle(gun241_r1, 0.0F, -2.3562F, 0.0F);
		gun241_r1.cubeList.add(new ModelBox(gun241_r1, 362, 373, 0.7071F, 0.0F, -0.7071F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handguardWood.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}