package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M110Suppressor extends ModelBase {
	private final ModelRenderer suppressorM110;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;
	private final ModelRenderer cube_r34;
	private final ModelRenderer cube_r35;
	private final ModelRenderer cube_r36;

	public M110Suppressor() {
		textureWidth = 544;
		textureHeight = 544;

		suppressorM110 = new ModelRenderer(this);
		suppressorM110.setRotationPoint(0.0F, 24.0F, 0.0F);
		suppressorM110.cubeList.add(new ModelBox(suppressorM110, 512, 353, -2.5F, -40.625F, -74.25F, 2, 2, 2, 0.0F, false));
		suppressorM110.cubeList.add(new ModelBox(suppressorM110, 228, 41, -3.5F, -40.875F, -73.75F, 4, 2, 1, 0.0F, false));
		suppressorM110.cubeList.add(new ModelBox(suppressorM110, 512, 365, -3.9142F, -39.2108F, -74.25F, 2, 2, 2, 0.0F, false));
		suppressorM110.cubeList.add(new ModelBox(suppressorM110, 512, 369, -1.0858F, -39.2108F, -74.25F, 2, 2, 2, 0.0F, false));
		suppressorM110.cubeList.add(new ModelBox(suppressorM110, 512, 377, -2.5F, -37.7966F, -74.25F, 2, 2, 2, 0.0F, false));
		suppressorM110.cubeList.add(new ModelBox(suppressorM110, 260, 174, -2.5F, -37.863F, -113.15F, 2, 2, 39, -0.05F, false));
		suppressorM110.cubeList.add(new ModelBox(suppressorM110, 262, 88, -1.1565F, -39.2065F, -113.15F, 2, 2, 39, -0.05F, false));
		suppressorM110.cubeList.add(new ModelBox(suppressorM110, 262, 129, -3.8435F, -39.2065F, -113.15F, 2, 2, 39, -0.05F, false));
		suppressorM110.cubeList.add(new ModelBox(suppressorM110, 246, 297, -2.5F, -40.55F, -113.15F, 2, 2, 39, -0.05F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.2571F, -38.4494F, -75.15F);
		suppressorM110.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 164, 297, -1.0F, -2.0F, -38.0F, 2, 2, 39, -0.05F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-3.1571F, -38.4494F, -75.15F);
		suppressorM110.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, 0.7854F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 264, 41, -1.0F, -2.0F, -38.0F, 2, 2, 39, -0.05F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-1.2571F, -36.5494F, -75.15F);
		suppressorM110.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, 0.7854F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 262, 0, -1.0F, -2.0F, -38.0F, 2, 2, 39, -0.05F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(-3.1571F, -36.5494F, -75.15F);
		suppressorM110.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.0F, 0.0F, 0.7854F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 82, 260, -1.0F, -2.0F, -38.0F, 2, 2, 39, -0.05F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(-3.2071F, -36.5037F, -73.25F);
		suppressorM110.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.0F, 0.0F, 0.7854F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 512, 500, -1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F, false));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(-1.2071F, -36.5037F, -73.25F);
		suppressorM110.addChild(cube_r34);
		setRotationAngle(cube_r34, 0.0F, 0.0F, 0.7854F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 512, 373, -1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F, false));

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(-3.2071F, -38.5037F, -73.25F);
		suppressorM110.addChild(cube_r35);
		setRotationAngle(cube_r35, 0.0F, 0.0F, 0.7854F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 512, 361, -1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F, false));

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(-1.2071F, -38.5037F, -73.25F);
		suppressorM110.addChild(cube_r36);
		setRotationAngle(cube_r36, 0.0F, 0.0F, 0.7854F);
		cube_r36.cubeList.add(new ModelBox(cube_r36, 512, 357, -1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		suppressorM110.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}