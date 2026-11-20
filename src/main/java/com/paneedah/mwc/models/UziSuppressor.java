package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class UziSuppressor extends ModelBase {
	private final ModelRenderer Suppressor;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;

	public UziSuppressor() {
		textureWidth = 512;
		textureHeight = 512;

		Suppressor = new ModelRenderer(this);
		Suppressor.setRotationPoint(0.0F, 18.075F, 0.6F);
		Suppressor.cubeList.add(new ModelBox(Suppressor, 0, 0, -2.5F, -31.65F, -69.0F, 2, 2, 36, 0.1F, false));
		Suppressor.cubeList.add(new ModelBox(Suppressor, 77, 0, -0.9444F, -30.0944F, -69.0F, 2, 2, 36, 0.1F, false));
		Suppressor.cubeList.add(new ModelBox(Suppressor, 77, 117, -2.5F, -28.5387F, -69.0F, 2, 2, 36, 0.1F, false));
		Suppressor.cubeList.add(new ModelBox(Suppressor, 77, 78, -4.0556F, -30.0944F, -69.0F, 2, 2, 36, 0.1F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.6F, -30.1944F, -34.0F);
		Suppressor.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 78, -1.0F, -1.0F, -35.0F, 2, 2, 36, 0.1F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.6F, -27.9944F, -34.0F);
		Suppressor.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 117, -1.0F, -1.0F, -35.0F, 2, 2, 36, 0.1F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-0.4F, -27.9944F, -34.0F);
		Suppressor.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.7854F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 77, 39, -1.0F, -1.0F, -35.0F, 2, 2, 36, 0.1F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-0.4F, -30.1944F, -34.0F);
		Suppressor.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 39, -1.0F, -1.0F, -35.0F, 2, 2, 36, 0.1F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Suppressor.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}