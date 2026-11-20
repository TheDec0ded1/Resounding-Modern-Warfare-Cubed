package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class MiniUziHandguard extends ModelBase {
	private final ModelRenderer Handguard;
	private final ModelRenderer gun117;
	private final ModelRenderer gun116;
	private final ModelRenderer gun118;
	private final ModelRenderer gun30;
	private final ModelRenderer gun149;
	private final ModelRenderer gun70;
	private final ModelRenderer gun69;
	private final ModelRenderer gun71;
	private final ModelRenderer gun72;
	private final ModelRenderer gun73;
	private final ModelRenderer gun74;
	private final ModelRenderer gun75;
	private final ModelRenderer gun191;
	private final ModelRenderer gun192;
	private final ModelRenderer gun190;
	private final ModelRenderer gun189;
	private final ModelRenderer gun193;
	private final ModelRenderer gun194;
	private final ModelRenderer gun125;
	private final ModelRenderer gun124;
	private final ModelRenderer gun123;
	private final ModelRenderer gun122;
	private final ModelRenderer gun150;
	private final ModelRenderer gun151;
	private final ModelRenderer gun168;
	private final ModelRenderer gun167;
	private final ModelRenderer gun166;
	private final ModelRenderer gun165;
	private final ModelRenderer gun169;
	private final ModelRenderer gun170;
	private final ModelRenderer gun153;
	private final ModelRenderer gun152;

	public MiniUziHandguard() {
		textureWidth = 256;
		textureHeight = 256;

		Handguard = new ModelRenderer(this);
		Handguard.setRotationPoint(0.0F, 23.0F, 5.0F);
		

		gun117 = new ModelRenderer(this);
		gun117.setRotationPoint(-0.9F, -34.5F, -17.5F);
		Handguard.addChild(gun117);
		

		gun116 = new ModelRenderer(this);
		gun116.setRotationPoint(-0.9F, -36.3F, -21.5F);
		Handguard.addChild(gun116);
		gun116.cubeList.add(new ModelBox(gun116, 195, 26, 0.0F, 0.0F, 0.0F, 2, 4, 3, 0.0F, false));

		gun118 = new ModelRenderer(this);
		gun118.setRotationPoint(0.1F, -34.5F, -16.5F);
		Handguard.addChild(gun118);
		setRotationAngle(gun118, -2.1935F, 0.0F, 0.0F);
		

		gun30 = new ModelRenderer(this);
		gun30.setRotationPoint(-4.1F, -36.3F, -21.5F);
		Handguard.addChild(gun30);
		gun30.cubeList.add(new ModelBox(gun30, 77, 192, 0.0F, 0.0F, 0.0F, 4, 4, 3, 0.0F, false));

		gun149 = new ModelRenderer(this);
		gun149.setRotationPoint(-4.1F, -33.0F, -27.5F);
		Handguard.addChild(gun149);
		gun149.cubeList.add(new ModelBox(gun149, 102, 72, 0.0F, 0.0F, 0.0F, 4, 1, 9, 0.0F, false));

		gun70 = new ModelRenderer(this);
		gun70.setRotationPoint(-3.1F, -32.0F, -27.5F);
		Handguard.addChild(gun70);
		gun70.cubeList.add(new ModelBox(gun70, 56, 161, 0.0F, 0.0F, 0.0F, 2, 1, 9, 0.0F, false));

		gun69 = new ModelRenderer(this);
		gun69.setRotationPoint(-0.9F, -33.0F, -27.5F);
		Handguard.addChild(gun69);
		gun69.cubeList.add(new ModelBox(gun69, 162, 66, 0.0F, 0.0F, 0.0F, 2, 1, 9, 0.0F, false));

		gun71 = new ModelRenderer(this);
		gun71.setRotationPoint(-1.9F, -32.0F, -27.5F);
		Handguard.addChild(gun71);
		gun71.cubeList.add(new ModelBox(gun71, 162, 77, 0.0F, 0.0F, 0.0F, 2, 1, 9, 0.0F, false));

		gun72 = new ModelRenderer(this);
		gun72.setRotationPoint(-4.1F, -32.0F, -27.5F);
		Handguard.addChild(gun72);
		setRotationAngle(gun72, 0.0F, 0.0F, -0.7854F);
		gun72.cubeList.add(new ModelBox(gun72, 143, 171, 0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		gun73 = new ModelRenderer(this);
		gun73.setRotationPoint(-3.1F, -31.0F, -27.5F);
		Handguard.addChild(gun73);
		setRotationAngle(gun73, 0.0F, 0.0F, -2.3562F);
		gun73.cubeList.add(new ModelBox(gun73, 164, 171, 0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		gun74 = new ModelRenderer(this);
		gun74.setRotationPoint(1.1F, -32.0F, -27.5F);
		Handguard.addChild(gun74);
		setRotationAngle(gun74, 0.0F, 0.0F, 2.3562F);
		gun74.cubeList.add(new ModelBox(gun74, 21, 172, 0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		gun75 = new ModelRenderer(this);
		gun75.setRotationPoint(0.1F, -31.0F, -27.5F);
		Handguard.addChild(gun75);
		setRotationAngle(gun75, 0.0F, 0.0F, -2.3562F);
		gun75.cubeList.add(new ModelBox(gun75, 42, 172, 0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		gun191 = new ModelRenderer(this);
		gun191.setRotationPoint(-0.9F, -36.8F, -22.5F);
		Handguard.addChild(gun191);
		gun191.cubeList.add(new ModelBox(gun191, 202, 64, 0.0F, 0.0F, 0.0F, 2, 4, 1, 0.0F, false));

		gun192 = new ModelRenderer(this);
		gun192.setRotationPoint(-4.1F, -36.8F, -22.5F);
		Handguard.addChild(gun192);
		gun192.cubeList.add(new ModelBox(gun192, 202, 123, 0.0F, 0.0F, 0.0F, 2, 4, 1, 0.0F, false));

		gun190 = new ModelRenderer(this);
		gun190.setRotationPoint(1.1F, -34.8F, -29.5F);
		Handguard.addChild(gun190);
		setRotationAngle(gun190, 0.0F, 0.0F, 2.9557F);
		gun190.cubeList.add(new ModelBox(gun190, 82, 182, 0.0F, 0.0F, 0.0F, 1, 2, 7, 0.0F, false));

		gun189 = new ModelRenderer(this);
		gun189.setRotationPoint(-4.1F, -34.8F, -29.5F);
		Handguard.addChild(gun189);
		setRotationAngle(gun189, 0.0F, 0.0F, -1.3756F);
		gun189.cubeList.add(new ModelBox(gun189, 63, 182, 0.0F, 0.0F, 0.0F, 2, 1, 7, 0.0F, false));

		gun193 = new ModelRenderer(this);
		gun193.setRotationPoint(-4.1F, -36.8F, -22.5F);
		Handguard.addChild(gun193);
		setRotationAngle(gun193, -1.0038F, 0.0F, 0.0F);
		gun193.cubeList.add(new ModelBox(gun193, 145, 158, 0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F, false));

		gun194 = new ModelRenderer(this);
		gun194.setRotationPoint(0.1F, -36.8F, -22.5F);
		Handguard.addChild(gun194);
		setRotationAngle(gun194, -1.0038F, 0.0F, 0.0F);
		gun194.cubeList.add(new ModelBox(gun194, 166, 199, 0.0F, 0.0F, 0.0F, 1, 4, 2, 0.0F, false));

		gun125 = new ModelRenderer(this);
		gun125.setRotationPoint(-4.1F, -34.8F, -29.5F);
		Handguard.addChild(gun125);
		gun125.cubeList.add(new ModelBox(gun125, 120, 168, 0.0F, 0.0F, 0.0F, 4, 2, 7, 0.0F, false));

		gun124 = new ModelRenderer(this);
		gun124.setRotationPoint(-0.9F, -34.8F, -29.5F);
		Handguard.addChild(gun124);
		gun124.cubeList.add(new ModelBox(gun124, 181, 88, 0.0F, 0.0F, 0.0F, 2, 2, 7, 0.0F, false));

		gun123 = new ModelRenderer(this);
		gun123.setRotationPoint(-1.3F, -36.8F, -29.5F);
		Handguard.addChild(gun123);
		gun123.cubeList.add(new ModelBox(gun123, 84, 172, 0.0F, 0.0F, 0.0F, 2, 1, 8, 0.0F, false));

		gun122 = new ModelRenderer(this);
		gun122.setRotationPoint(-3.7F, -36.8F, -29.5F);
		Handguard.addChild(gun122);
		gun122.cubeList.add(new ModelBox(gun122, 120, 158, 0.0F, 0.0F, 0.0F, 4, 1, 8, 0.0F, false));

		gun150 = new ModelRenderer(this);
		gun150.setRotationPoint(-3.7F, -37.1F, -29.5F);
		Handguard.addChild(gun150);
		setRotationAngle(gun150, -0.0349F, 0.0F, 0.0F);
		gun150.cubeList.add(new ModelBox(gun150, 0, 161, 0.0F, 0.0F, 0.0F, 4, 1, 8, 0.0F, false));

		gun151 = new ModelRenderer(this);
		gun151.setRotationPoint(-1.3F, -37.1F, -29.5F);
		Handguard.addChild(gun151);
		setRotationAngle(gun151, -0.0349F, 0.0F, 0.0F);
		gun151.cubeList.add(new ModelBox(gun151, 174, 38, 0.0F, 0.0F, 0.0F, 2, 1, 8, 0.0F, false));

		gun168 = new ModelRenderer(this);
		gun168.setRotationPoint(1.1F, -32.8F, -29.5F);
		Handguard.addChild(gun168);
		setRotationAngle(gun168, 0.0F, 0.0F, 2.3562F);
		gun168.cubeList.add(new ModelBox(gun168, 206, 163, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun167 = new ModelRenderer(this);
		gun167.setRotationPoint(-4.1F, -32.8F, -29.5F);
		Handguard.addChild(gun167);
		setRotationAngle(gun167, 0.0F, 0.0F, -0.7854F);
		gun167.cubeList.add(new ModelBox(gun167, 167, 206, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun166 = new ModelRenderer(this);
		gun166.setRotationPoint(-3.1F, -32.8F, -29.5F);
		Handguard.addChild(gun166);
		gun166.cubeList.add(new ModelBox(gun166, 202, 70, 0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

		gun165 = new ModelRenderer(this);
		gun165.setRotationPoint(-1.9F, -32.8F, -29.5F);
		Handguard.addChild(gun165);
		gun165.cubeList.add(new ModelBox(gun165, 92, 203, 0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

		gun169 = new ModelRenderer(this);
		gun169.setRotationPoint(0.1F, -31.8F, -29.5F);
		Handguard.addChild(gun169);
		setRotationAngle(gun169, 0.0F, 0.0F, -2.3562F);
		gun169.cubeList.add(new ModelBox(gun169, 207, 171, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun170 = new ModelRenderer(this);
		gun170.setRotationPoint(-3.1F, -31.8F, -29.5F);
		Handguard.addChild(gun170);
		setRotationAngle(gun170, 0.0F, 0.0F, -2.3562F);
		gun170.cubeList.add(new ModelBox(gun170, 207, 196, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun153 = new ModelRenderer(this);
		gun153.setRotationPoint(-4.1F, -36.8F, -21.5F);
		Handguard.addChild(gun153);
		setRotationAngle(gun153, -0.7854F, 0.0F, 0.0F);
		gun153.cubeList.add(new ModelBox(gun153, 131, 23, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun152 = new ModelRenderer(this);
		gun152.setRotationPoint(-0.9F, -36.8F, -21.5F);
		Handguard.addChild(gun152);
		setRotationAngle(gun152, -0.7854F, 0.0F, 0.0F);
		gun152.cubeList.add(new ModelBox(gun152, 138, 23, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Handguard.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}