package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Glock34TTBarrel extends ModelBase {
	private final ModelRenderer G34razorbackbarrel;
	private final ModelRenderer gun32_r1;

	public Glock34TTBarrel() {
		textureWidth = 240;
		textureHeight = 240;

		G34razorbackbarrel = new ModelRenderer(this);
		G34razorbackbarrel.setRotationPoint(-2.0F, -13.3F, -28.8F);
		G34razorbackbarrel.cubeList.add(new ModelBox(G34razorbackbarrel, 55, 94, 0.0F, 2.3F, -3.2F, 2, 2, 20, -0.3F, false));
		G34razorbackbarrel.cubeList.add(new ModelBox(G34razorbackbarrel, 176, 198, -0.3F, -0.6F, 13.3F, 2, 2, 5, 0.0F, false));
		G34razorbackbarrel.cubeList.add(new ModelBox(G34razorbackbarrel, 55, 83, -0.6F, -0.3F, 13.3F, 1, 2, 5, 0.0F, false));

		gun32_r1 = new ModelRenderer(this);
		gun32_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		G34razorbackbarrel.addChild(gun32_r1);
		setRotationAngle(gun32_r1, -0.0372F, 0.0F, 0.0F);
		gun32_r1.cubeList.add(new ModelBox(gun32_r1, 0, 98, 0.0F, 0.0F, -3.0F, 2, 2, 20, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		G34razorbackbarrel.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}