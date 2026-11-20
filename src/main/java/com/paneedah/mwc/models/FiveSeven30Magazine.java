package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FiveSeven30Magazine extends ModelBase {
	private final ModelRenderer magazine;
	private final ModelRenderer cube_r30;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer magazine2;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;

	public FiveSeven30Magazine() {
		textureWidth = 128;
		textureHeight = 128;

		magazine = new ModelRenderer(this);
		magazine.setRotationPoint(0.0F, 8.0F, 3.0F);
		

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(1.0F, 0.5F, -0.5F);
		magazine.addChild(cube_r30);
		setRotationAngle(cube_r30, -0.0873F, 0.0F, 0.0F);
		

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(0.5F, 0.5F, -0.5F);
		magazine.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.3491F, 0.0F, 0.0F);
		

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(-2.25F, -1.1F, -0.3F);
		magazine.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.2094F, 0.0F, 0.0F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 45, 0, -0.25F, -13.0F, -0.3F, 2, 14, 1, 0.002F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 23, 48, -0.75F, -13.0F, -5.5F, 3, 13, 1, 0.002F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 0, -1.0F, -13.0F, -5.0F, 3, 13, 5, 0.0F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 31, 0, 1.5F, -13.0F, -5.0F, 1, 13, 5, 0.001F, false));

		magazine2 = new ModelRenderer(this);
		magazine2.setRotationPoint(0.0F, 14.0F, 4.3F);
		magazine2.cubeList.add(new ModelBox(magazine2, 24, 36, -3.5F, -1.1F, -7.3F, 4, 1, 7, 0.001F, false));
		magazine2.cubeList.add(new ModelBox(magazine2, 0, 54, -3.0F, -1.2F, -0.4F, 3, 1, 1, -0.101F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.0F, 0.5F, -0.5F);
		magazine2.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 50, 64, -4.0F, -1.0F, -7.7F, 3, 1, 1, 0.001F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 86, 39, -4.5F, -1.0F, -7.0F, 4, 1, 7, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.5F, 0.5F, -0.5F);
		magazine2.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.3491F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 60, 42, -3.5F, -0.9F, 0.7F, 3, 1, 1, -0.1F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 36, 64, -3.5F, -0.9F, -0.1F, 3, 1, 1, -0.1F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-2.25F, -1.1F, -0.3F);
		magazine2.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.2094F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 45, 0, -0.25F, -6.0F, -0.3F, 2, 7, 1, 0.002F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 23, 48, -0.75F, -7.0F, -5.5F, 3, 7, 1, 0.002F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -1.0F, -7.0F, -5.0F, 3, 7, 5, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 31, 0, 1.5F, -7.0F, -5.0F, 1, 7, 5, 0.001F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		magazine.render(f5);
		magazine2.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}