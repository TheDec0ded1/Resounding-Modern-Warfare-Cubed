package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Glock17Barrel extends ModelBase {
	private final ModelRenderer G17barrel;
	private final ModelRenderer gun32_r2;

	public Glock17Barrel() {
		textureWidth = 224;
		textureHeight = 224;

		G17barrel = new ModelRenderer(this);
		G17barrel.setRotationPoint(-2.0F, -13.3F, -28.8F);
		G17barrel.cubeList.add(new ModelBox(G17barrel, 82, 178, -0.3F, -0.6F, 13.3F, 2, 2, 5, 0.0F, false));
		G17barrel.cubeList.add(new ModelBox(G17barrel, 78, 106, 0.0F, 2.3F, -0.2F, 2, 2, 17, -0.3F, false));
		G17barrel.cubeList.add(new ModelBox(G17barrel, 160, 185, -0.6F, -0.3F, 13.3F, 1, 2, 5, 0.0F, false));

		gun32_r2 = new ModelRenderer(this);
		gun32_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		G17barrel.addChild(gun32_r2);
		setRotationAngle(gun32_r2, -0.0372F, 0.0F, 0.0F);
		gun32_r2.cubeList.add(new ModelBox(gun32_r2, 0, 108, 0.0F, 0.0F, 0.0F, 2, 2, 17, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		G17barrel.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}