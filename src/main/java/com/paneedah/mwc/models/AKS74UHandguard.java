package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AKS74UHandguard extends ModelBase {
	private final ModelRenderer handguard;
	private final ModelRenderer handguard_r1;
	private final ModelRenderer handguard_r2;
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

	public AKS74UHandguard() {
		textureWidth = 128;
		textureHeight = 128;

		handguard = new ModelRenderer(this);
		handguard.setRotationPoint(0.0F, 24.0F, 0.0F);
		handguard.cubeList.add(new ModelBox(handguard, 46, 35, -4.0F, -36.9F, -39.5F, 5, 4, 3, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 15, -4.0F, -36.9F, -50.5F, 5, 4, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 41, 2, -4.0F, -34.5F, -50.5F, 5, 2, 7, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 46, 27, -4.0F, -34.5F, -44.5F, 5, 2, 6, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 32, 43, -3.2F, -36.5F, -50.5F, 4, 2, 7, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 48, 46, -3.2F, -36.5F, -44.5F, 4, 2, 6, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 32, 43, -3.8F, -36.5F, -50.5F, 4, 2, 7, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 48, 46, -3.8F, -36.5F, -44.5F, 4, 2, 6, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 8, 8, -0.1F, -36.9F, -36.498F, 1, 5, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 8, 2, -3.9F, -36.9F, -36.498F, 1, 5, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 19, 31, -3.0F, -32.0F, -36.499F, 3, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 2, -3.999F, -38.9F, -50.501F, 5, 1, 12, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 32, 29, -4.0F, -38.3F, -50.5F, 5, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 22, 7, -3.2F, -38.3F, -49.5F, 4, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 18, 21, -3.2F, -38.3F, -45.5F, 4, 1, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 22, 9, -3.2F, -38.3F, -40.5F, 4, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 18, 24, -4.0F, -38.3F, -39.5F, 5, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 14, 42, -3.2F, -38.3F, -50.5F, 4, 1, 10, -0.002F, false));
		handguard.cubeList.add(new ModelBox(handguard, 22, 9, -3.8F, -38.3F, -40.5F, 4, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 14, 42, -3.8F, -38.6F, -50.5F, 4, 1, 10, -0.002F, false));
		handguard.cubeList.add(new ModelBox(handguard, 18, 21, -3.8F, -38.3F, -45.5F, 4, 1, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 22, 7, -3.8F, -38.3F, -49.5F, 4, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 22, 9, -3.2F, -36.9F, -40.5F, 4, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 14, 42, -3.2F, -36.9F, -50.5F, 4, 1, 10, -0.002F, false));
		handguard.cubeList.add(new ModelBox(handguard, 18, 21, -3.2F, -36.9F, -45.5F, 4, 1, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 22, 7, -3.2F, -36.9F, -49.5F, 4, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 22, 9, -3.8F, -36.9F, -40.5F, 4, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 14, 42, -3.8F, -36.6F, -50.5F, 4, 1, 10, -0.002F, false));
		handguard.cubeList.add(new ModelBox(handguard, 18, 21, -3.8F, -36.9F, -45.5F, 4, 1, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 22, 7, -3.8F, -36.9F, -49.5F, 4, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 20, -3.999F, -34.0F, -38.5F, 5, 3, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 18, 18, -3.999F, -33.0F, -37.5F, 5, 2, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 19, 29, -3.0F, -32.0F, -39.5F, 3, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 29, -3.499F, -38.1F, -50.499F, 4, 1, 11, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 22, 2, -3.499F, -37.0F, -50.5F, 4, 1, 11, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 18, 15, -3.5F, -37.5F, -45.5F, 4, 1, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 18, 16, -3.0F, -37.5F, -50.5F, 3, 1, 12, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 34, -2.9F, -39.7F, -51.002F, 2, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 3, 37, -1.1F, -39.7F, -51.001F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 22, 2, -3.9F, -38.7F, -51.001F, 3, 4, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 28, -1.1F, -38.7F, -51.002F, 2, 4, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 19, 33, -1.1F, -34.7F, -51.002F, 2, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 22, 11, -3.9F, -34.7F, -51.001F, 3, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 5, 32, -2.9F, -34.2F, -51.003F, 2, 2, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 6, 28, -1.1F, -34.2F, -51.0F, 1, 2, 1, 0.0F, false));

		handguard_r1 = new ModelRenderer(this);
		handguard_r1.setRotationPoint(-1.5F, -42.9F, -41.5F);
		handguard.addChild(handguard_r1);
		setRotationAngle(handguard_r1, 0.7854F, 0.0F, 0.0F);
		handguard_r1.cubeList.add(new ModelBox(handguard_r1, 50, 16, -2.5F, 6.5F, -5.4F, 5, 1, 2, 0.0F, false));

		handguard_r2 = new ModelRenderer(this);
		handguard_r2.setRotationPoint(-1.5F, -42.9F, -47.0F);
		handguard.addChild(handguard_r2);
		setRotationAngle(handguard_r2, -0.7854F, 0.0F, 0.0F);
		handguard_r2.cubeList.add(new ModelBox(handguard_r2, 47, 43, -2.5F, 6.9F, 3.0F, 5, 1, 2, 0.0F, false));

		gun153_r1 = new ModelRenderer(this);
		gun153_r1.setRotationPoint(0.0F, -31.0F, -36.5F);
		handguard.addChild(gun153_r1);
		setRotationAngle(gun153_r1, 0.0F, 0.0F, -2.3423F);
		gun153_r1.cubeList.add(new ModelBox(gun153_r1, 26, 36, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun154_r1 = new ModelRenderer(this);
		gun154_r1.setRotationPoint(0.9F, -31.9F, -36.5F);
		handguard.addChild(gun154_r1);
		setRotationAngle(gun154_r1, 0.0F, 0.0F, 2.3794F);
		gun154_r1.cubeList.add(new ModelBox(gun154_r1, 22, 36, 0.0F, 0.0F, -0.001F, 1, 1, 1, 0.0F, false));

		gun155_r1 = new ModelRenderer(this);
		gun155_r1.setRotationPoint(-3.9F, -31.9F, -36.5F);
		handguard.addChild(gun155_r1);
		setRotationAngle(gun155_r1, 0.0F, 0.0F, -0.7064F);
		gun155_r1.cubeList.add(new ModelBox(gun155_r1, 0, 36, 0.0F, 0.0F, -0.001F, 1, 1, 1, 0.0F, false));

		gun156_r1 = new ModelRenderer(this);
		gun156_r1.setRotationPoint(-3.0F, -31.0F, -36.5F);
		handguard.addChild(gun156_r1);
		setRotationAngle(gun156_r1, 0.0F, 0.0F, -2.4166F);
		gun156_r1.cubeList.add(new ModelBox(gun156_r1, 32, 35, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun157_r1 = new ModelRenderer(this);
		gun157_r1.setRotationPoint(-4.0F, -34.0F, -53.5F);
		handguard.addChild(gun157_r1);
		setRotationAngle(gun157_r1, 1.4871F, 0.0F, 0.0F);
		

		gun159_r1 = new ModelRenderer(this);
		gun159_r1.setRotationPoint(-3.0F, -33.0F, -53.5F);
		handguard.addChild(gun159_r1);
		setRotationAngle(gun159_r1, 1.4871F, 0.0F, 0.0F);
		gun159_r1.cubeList.add(new ModelBox(gun159_r1, 0, 2, 0.0F, 3.1182F, -0.8226F, 3, 11, 1, 0.0F, false));
		gun159_r1.cubeList.add(new ModelBox(gun159_r1, 0, 2, 0.0F, 3.6182F, 0.1774F, 3, 11, 1, 0.5F, false));

		gun183_r1 = new ModelRenderer(this);
		gun183_r1.setRotationPoint(-3.0F, -39.8F, -53.5F);
		handguard.addChild(gun183_r1);
		setRotationAngle(gun183_r1, 0.0175F, 0.0F, 0.0F);
		gun183_r1.cubeList.add(new ModelBox(gun183_r1, 0, 15, 0.0F, 0.0525F, 2.9995F, 3, 1, 12, 0.0F, false));

		gun184_r1 = new ModelRenderer(this);
		gun184_r1.setRotationPoint(-4.0F, -38.9F, -53.5F);
		handguard.addChild(gun184_r1);
		setRotationAngle(gun184_r1, 0.0F, 0.0F, -0.7064F);
		gun184_r1.cubeList.add(new ModelBox(gun184_r1, 0, 41, 0.0F, 0.0F, 3.0F, 1, 1, 12, 0.0F, false));

		gun185_r1 = new ModelRenderer(this);
		gun185_r1.setRotationPoint(-3.0F, -39.8F, -53.5F);
		handguard.addChild(gun185_r1);
		setRotationAngle(gun185_r1, 0.0F, 0.0F, 0.8179F);
		gun185_r1.cubeList.add(new ModelBox(gun185_r1, 36, 14, -0.001F, 0.0F, 2.999F, 1, 1, 12, 0.0F, false));

		gun186_r1 = new ModelRenderer(this);
		gun186_r1.setRotationPoint(0.0F, -39.8F, -53.5F);
		handguard.addChild(gun186_r1);
		setRotationAngle(gun186_r1, 0.0F, 0.0F, 0.7436F);
		gun186_r1.cubeList.add(new ModelBox(gun186_r1, 32, 30, 0.0F, -0.001F, 2.999F, 1, 1, 12, 0.0F, false));

		gun187_r1 = new ModelRenderer(this);
		gun187_r1.setRotationPoint(1.0F, -38.9F, -53.5F);
		handguard.addChild(gun187_r1);
		setRotationAngle(gun187_r1, 0.0F, 0.0F, 2.3051F);
		gun187_r1.cubeList.add(new ModelBox(gun187_r1, 18, 29, 0.0F, 0.0F, 3.0F, 1, 1, 12, 0.0F, false));

		gun189_r1 = new ModelRenderer(this);
		gun189_r1.setRotationPoint(-4.0F, -30.5F, -38.5F);
		handguard.addChild(gun189_r1);
		setRotationAngle(gun189_r1, 2.6025F, 0.0F, 0.0F);
		gun189_r1.cubeList.add(new ModelBox(gun189_r1, 50, 12, -0.001F, 0.4291F, 0.2567F, 5, 2, 2, 0.0F, false));

		gun190_r1 = new ModelRenderer(this);
		gun190_r1.setRotationPoint(-4.0F, -30.5F, -37.5F);
		handguard.addChild(gun190_r1);
		setRotationAngle(gun190_r1, 2.1192F, 0.0F, 0.0F);
		gun190_r1.cubeList.add(new ModelBox(gun190_r1, 0, 24, 0.0F, 0.2607F, 0.4267F, 5, 1, 1, 0.0F, false));

		gun192_r1 = new ModelRenderer(this);
		gun192_r1.setRotationPoint(-3.0F, -30.5F, -39.5F);
		handguard.addChild(gun192_r1);
		setRotationAngle(gun192_r1, 2.6025F, 0.0F, 0.0F);
		

		gun221_r1 = new ModelRenderer(this);
		gun221_r1.setRotationPoint(-3.9F, -34.7F, -54.0F);
		handguard.addChild(gun221_r1);
		setRotationAngle(gun221_r1, 0.0F, 0.0F, -0.4833F);
		gun221_r1.cubeList.add(new ModelBox(gun221_r1, 19, 35, -0.4647F, 0.8855F, 3.001F, 1, 1, 1, 0.0F, false));

		gun222_r1 = new ModelRenderer(this);
		gun222_r1.setRotationPoint(-2.9F, -33.2F, -54.0F);
		handguard.addChild(gun222_r1);
		setRotationAngle(gun222_r1, 0.0F, 0.0F, -2.2679F);
		gun222_r1.cubeList.add(new ModelBox(gun222_r1, 33, 14, -0.7667F, -0.642F, 3.0F, 1, 1, 1, 0.0F, false));

		gun223_r1 = new ModelRenderer(this);
		gun223_r1.setRotationPoint(-0.1F, -33.2F, -54.0F);
		handguard.addChild(gun223_r1);
		setRotationAngle(gun223_r1, 0.0F, 0.0F, -2.4363F);
		gun223_r1.cubeList.add(new ModelBox(gun223_r1, 5, 35, -0.6483F, -0.7614F, 2.999F, 1, 1, 1, 0.0F, false));

		gun224_r1 = new ModelRenderer(this);
		gun224_r1.setRotationPoint(0.9F, -34.7F, -54.0F);
		handguard.addChild(gun224_r1);
		setRotationAngle(gun224_r1, 0.0F, 0.0F, 2.0448F);
		gun224_r1.cubeList.add(new ModelBox(gun224_r1, 32, 33, 0.8897F, -0.4565F, 3.001F, 1, 1, 1, 0.0F, false));

		gun225_r1 = new ModelRenderer(this);
		gun225_r1.setRotationPoint(-0.1F, -39.7F, -54.0F);
		handguard.addChild(gun225_r1);
		setRotationAngle(gun225_r1, 0.0F, 0.0F, 0.7808F);
		gun225_r1.cubeList.add(new ModelBox(gun225_r1, 32, 31, 0.0F, 0.0F, 3.001F, 1, 1, 1, 0.0F, false));

		gun226_r1 = new ModelRenderer(this);
		gun226_r1.setRotationPoint(0.9F, -38.7F, -54.0F);
		handguard.addChild(gun226_r1);
		setRotationAngle(gun226_r1, 0.0F, 0.0F, 2.3794F);
		gun226_r1.cubeList.add(new ModelBox(gun226_r1, 24, 34, 0.0F, 0.0F, 3.0F, 1, 1, 1, 0.0F, false));

		gun227_r1 = new ModelRenderer(this);
		gun227_r1.setRotationPoint(-2.9F, -39.7F, -54.0F);
		handguard.addChild(gun227_r1);
		setRotationAngle(gun227_r1, 0.0F, 0.0F, 0.8179F);
		gun227_r1.cubeList.add(new ModelBox(gun227_r1, 26, 32, 0.0F, 0.0F, 3.001F, 1, 1, 1, 0.0F, false));

		gun228_r1 = new ModelRenderer(this);
		gun228_r1.setRotationPoint(-3.9F, -38.7F, -54.0F);
		handguard.addChild(gun228_r1);
		setRotationAngle(gun228_r1, 0.0F, 0.0F, -0.7808F);
		gun228_r1.cubeList.add(new ModelBox(gun228_r1, 26, 30, 0.0F, 0.0F, 3.0F, 1, 1, 1, 0.0F, false));

		gun229_r1 = new ModelRenderer(this);
		gun229_r1.setRotationPoint(-3.0F, -33.0F, -53.5F);
		handguard.addChild(gun229_r1);
		setRotationAngle(gun229_r1, 0.0F, 0.0F, -2.3423F);
		

		gun230_r1 = new ModelRenderer(this);
		gun230_r1.setRotationPoint(-4.0F, -34.0F, -53.5F);
		handguard.addChild(gun230_r1);
		setRotationAngle(gun230_r1, 0.0F, 0.0F, -0.7808F);
		

		gun231_r1 = new ModelRenderer(this);
		gun231_r1.setRotationPoint(1.0F, -34.0F, -53.5F);
		handguard.addChild(gun231_r1);
		setRotationAngle(gun231_r1, 0.0F, 0.0F, 2.3794F);
		

		gun232_r1 = new ModelRenderer(this);
		gun232_r1.setRotationPoint(0.0F, -33.0F, -53.5F);
		handguard.addChild(gun232_r1);
		setRotationAngle(gun232_r1, 0.0F, 0.0F, -2.3794F);
		

		gun234_r1 = new ModelRenderer(this);
		gun234_r1.setRotationPoint(-4.5F, -35.0F, -52.5F);
		handguard.addChild(gun234_r1);
		setRotationAngle(gun234_r1, 0.0F, 0.0F, -0.7854F);
		

		gun235_r1 = new ModelRenderer(this);
		gun235_r1.setRotationPoint(-4.5F, -34.0F, -52.5F);
		handguard.addChild(gun235_r1);
		setRotationAngle(gun235_r1, 0.0F, 0.0F, -0.7854F);
		

		gun236_r1 = new ModelRenderer(this);
		gun236_r1.setRotationPoint(1.5F, -34.0F, -52.5F);
		handguard.addChild(gun236_r1);
		setRotationAngle(gun236_r1, 0.0F, 0.0F, 0.7854F);
		

		gun237_r1 = new ModelRenderer(this);
		gun237_r1.setRotationPoint(1.5F, -35.0F, -52.5F);
		handguard.addChild(gun237_r1);
		setRotationAngle(gun237_r1, 0.0F, 0.0F, 0.7854F);
		

		gun238_r1 = new ModelRenderer(this);
		gun238_r1.setRotationPoint(-4.5F, -35.0F, -52.5F);
		handguard.addChild(gun238_r1);
		setRotationAngle(gun238_r1, 0.0F, 0.7854F, 0.0F);
		

		gun239_r1 = new ModelRenderer(this);
		gun239_r1.setRotationPoint(-4.5F, -35.0F, -41.5F);
		handguard.addChild(gun239_r1);
		setRotationAngle(gun239_r1, 0.0F, 0.7854F, 0.0F);
		

		gun240_r1 = new ModelRenderer(this);
		gun240_r1.setRotationPoint(1.5F, -35.0F, -41.5F);
		handguard.addChild(gun240_r1);
		setRotationAngle(gun240_r1, 0.0F, -2.3562F, 0.0F);
		

		gun241_r1 = new ModelRenderer(this);
		gun241_r1.setRotationPoint(1.5F, -35.0F, -52.5F);
		handguard.addChild(gun241_r1);
		setRotationAngle(gun241_r1, 0.0F, -2.3562F, 0.0F);
		
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handguard.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}