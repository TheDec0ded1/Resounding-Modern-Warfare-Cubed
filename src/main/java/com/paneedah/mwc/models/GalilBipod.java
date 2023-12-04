package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class GalilBipod extends ModelBase {
	private final ModelRenderer bipod;
	private final ModelRenderer gun313_r1;

	public GalilBipod() {
		textureWidth = 200;
		textureHeight = 200;

		bipod = new ModelRenderer(this);
		bipod.setRotationPoint(0.0F, 24.0F, 0.0F);
		bipod.cubeList.add(new ModelBox(bipod, 51, 135, -2.0F, -31.3F, -66.9F, 1, 1, 1, 0.1F, false));
		bipod.cubeList.add(new ModelBox(bipod, 35, 135, -3.0F, -31.9F, -66.9F, 3, 1, 4, 0.1F, false));
		bipod.cubeList.add(new ModelBox(bipod, 62, 19, -1.0F, -31.9F, -34.7F, 1, 2, 1, 0.3F, false));
		bipod.cubeList.add(new ModelBox(bipod, 10, 10, -1.0F, -31.9F, -62.7F, 1, 1, 29, 0.1F, false));
		bipod.cubeList.add(new ModelBox(bipod, 60, 14, -2.5F, -34.0F, -66.4F, 2, 2, 2, 0.0F, false));

		gun313_r1 = new ModelRenderer(this);
		gun313_r1.setRotationPoint(-2.5F, -31.4F, -49.2F);
		bipod.addChild(gun313_r1);
		setRotationAngle(gun313_r1, 0.0F, 0.0F, -1.5708F);
		gun313_r1.cubeList.add(new ModelBox(gun313_r1, 10, 10, -0.5F, -0.5F, -13.5F, 1, 1, 29, 0.1F, false));
		gun313_r1.cubeList.add(new ModelBox(gun313_r1, 61, 18, -1.5F, -0.5F, 14.5F, 2, 1, 1, 0.3F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bipod.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}