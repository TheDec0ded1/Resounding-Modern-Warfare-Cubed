package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AA12BoxMag extends ModelBase {
	private final ModelRenderer magazine8;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;

	public AA12BoxMag() {
		textureWidth = 512;
		textureHeight = 512;

		magazine8 = new ModelRenderer(this);
		magazine8.setRotationPoint(-1.5F, -13.9295F, -24.2225F);
		setRotationAngle(magazine8, -0.0873F, 0.0F, 0.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 6.3488F, 7.6185F);
		magazine8.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 18, 2.6585F, -6.3698F, -7.9693F, 2, 2, 11, -0.3F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 59, 71, 4.3698F, -4.6585F, -7.9693F, 2, 2, 11, -0.3F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 6.3488F, 7.6185F);
		magazine8.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 90, 34, -2.0F, -6.684F, 3.0307F, 4, 25, 1, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 180, 0, -2.5F, -6.684F, -7.9693F, 5, 28, 11, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 75, 22, -1.5F, -6.684F, 1.7307F, 3, 25, 2, -0.3F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		magazine8.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}