package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QHoneyBadgerSilencerSD extends ModelBase {
	private final ModelRenderer suppressorSD;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;

	public QHoneyBadgerSilencerSD() {
		textureWidth = 400;
		textureHeight = 400;

		suppressorSD = new ModelRenderer(this);
		suppressorSD.setRotationPoint(0.0F, 24.0F, 0.0F);
		suppressorSD.cubeList.add(new ModelBox(suppressorSD, 0, 188, -2.5F, -40.25F, -67.0F, 2, 2, 27, -0.1F, false));
		suppressorSD.cubeList.add(new ModelBox(suppressorSD, 92, 389, -2.0F, -39.2F, -67.301F, 1, 1, 1, 0.0F, false));
		suppressorSD.cubeList.add(new ModelBox(suppressorSD, 104, 389, -2.7071F, -38.4929F, -67.301F, 1, 1, 1, 0.0F, false));
		suppressorSD.cubeList.add(new ModelBox(suppressorSD, 112, 389, -1.2929F, -38.4929F, -67.301F, 1, 1, 1, 0.0F, false));
		suppressorSD.cubeList.add(new ModelBox(suppressorSD, 120, 389, -2.0F, -37.7858F, -67.301F, 1, 1, 1, 0.0F, false));
		suppressorSD.cubeList.add(new ModelBox(suppressorSD, 0, 217, -1.2272F, -38.9772F, -67.0F, 2, 2, 27, -0.1F, false));
		suppressorSD.cubeList.add(new ModelBox(suppressorSD, 116, 218, -2.5F, -37.7044F, -67.0F, 2, 2, 27, -0.1F, false));
		suppressorSD.cubeList.add(new ModelBox(suppressorSD, 222, 37, -3.7728F, -38.9772F, -67.0F, 2, 2, 27, -0.1F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.6F, -37.0772F, -41.001F);
		suppressorSD.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 222, 66, -1.0F, -1.0F, -26.0F, 2, 2, 27, -0.1F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-2.4F, -37.0772F, -41.001F);
		suppressorSD.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 58, 218, -1.0F, -1.0F, -26.0F, 2, 2, 27, -0.1F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-0.6F, -38.8772F, -41.001F);
		suppressorSD.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.7854F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 202, 214, -1.0F, -1.0F, -26.0F, 2, 2, 27, -0.1F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-2.4F, -38.8772F, -41.001F);
		suppressorSD.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.7854F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 202, 185, -1.0F, -1.0F, -26.0F, 2, 2, 27, -0.1F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-2.0F, -37.4929F, -66.8F);
		suppressorSD.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 0.7854F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 116, 389, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-1.0F, -37.4929F, -66.8F);
		suppressorSD.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, 0.7854F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 108, 389, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-2.0F, -38.4929F, -66.8F);
		suppressorSD.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, 0.7854F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 100, 389, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-1.0F, -38.4929F, -66.8F);
		suppressorSD.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, 0.7854F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 96, 389, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		suppressorSD.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}