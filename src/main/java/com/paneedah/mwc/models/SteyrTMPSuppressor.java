package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SteyrTMPSuppressor extends ModelBase {
	private final ModelRenderer suppressor;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer muzzle2;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;

	public SteyrTMPSuppressor() {
		textureWidth = 288;
		textureHeight = 288;

		suppressor = new ModelRenderer(this);
		suppressor.setRotationPoint(-3.5607F, -8.392F, -44.1831F);
		suppressor.cubeList.add(new ModelBox(suppressor, 0, 39, 1.0607F, -0.108F, -18.0F, 2, 2, 37, 0.4F, false));
		suppressor.cubeList.add(new ModelBox(suppressor, 78, 0, -0.9192F, -2.0879F, -18.0F, 2, 2, 37, 0.4F, false));
		suppressor.cubeList.add(new ModelBox(suppressor, 78, 78, 3.0406F, -2.0879F, -18.0F, 2, 2, 37, 0.4F, false));
		suppressor.cubeList.add(new ModelBox(suppressor, 78, 117, 1.0607F, -4.0678F, -18.0F, 2, 2, 37, 0.4F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.3071F, -2.8414F, -1.0F);
		suppressor.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 117, -1.0F, -0.5F, -17.0F, 2, 2, 37, 0.4F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(3.1071F, -2.8414F, -1.0F);
		suppressor.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 78, 39, -1.0F, -0.5F, -17.0F, 2, 2, 37, 0.4F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(3.8142F, 0.6657F, -1.0F);
		suppressor.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.7854F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 78, -1.0F, -1.5F, -17.0F, 2, 2, 37, 0.4F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-0.4F, 0.6657F, -1.0F);
		suppressor.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, 0.0F, -0.5F, -17.0F, 2, 2, 37, 0.4F, false));

		muzzle2 = new ModelRenderer(this);
		muzzle2.setRotationPoint(0.0F, 0.3F, 18.0F);
		suppressor.addChild(muzzle2);
		muzzle2.cubeList.add(new ModelBox(muzzle2, 278, 33, 1.0607F, 0.0607F, 1.0F, 2, 1, 1, 0.0F, false));
		muzzle2.cubeList.add(new ModelBox(muzzle2, 278, 58, -0.3536F, -2.3535F, 1.0F, 1, 2, 1, 0.0F, false));
		muzzle2.cubeList.add(new ModelBox(muzzle2, 278, 61, 3.4749F, -2.3535F, 1.0F, 1, 2, 1, 0.0F, false));
		muzzle2.cubeList.add(new ModelBox(muzzle2, 38, 278, 1.0607F, -3.7678F, 1.0F, 2, 1, 1, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.7071F, -2.7071F, -1.0F);
		muzzle2.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.7854F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 278, 37, -1.0F, -0.5F, 2.0F, 2, 1, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(2.7071F, -2.7071F, -1.0F);
		muzzle2.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 60, 278, 0.0F, -0.5F, 2.0F, 1, 2, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(3.4142F, 0.0F, -1.0F);
		muzzle2.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 278, 35, -1.0F, -0.5F, 2.0F, 2, 1, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 0.0F, -1.0F);
		muzzle2.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 56, 278, 0.0F, -0.5F, 2.0F, 1, 2, 1, 0.0F, false));
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