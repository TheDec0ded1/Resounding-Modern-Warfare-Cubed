package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Glock17TTBarrel extends ModelBase {
	private final ModelRenderer G17razorbackbarrel;
	private final ModelRenderer gun32_r1;

	public Glock17TTBarrel() {
		textureWidth = 224;
		textureHeight = 224;

		G17razorbackbarrel = new ModelRenderer(this);
		G17razorbackbarrel.setRotationPoint(-2.0F, -13.3F, -28.8F);
		G17razorbackbarrel.cubeList.add(new ModelBox(G17razorbackbarrel, 0, 88, 0.0F, 2.3F, -0.2F, 2, 2, 17, -0.3F, false));
		G17razorbackbarrel.cubeList.add(new ModelBox(G17razorbackbarrel, 147, 185, -0.6F, -0.3F, 13.3F, 1, 2, 5, 0.0F, false));
		G17razorbackbarrel.cubeList.add(new ModelBox(G17razorbackbarrel, 157, 146, -0.3F, -0.6F, 13.3F, 2, 2, 5, 0.0F, false));

		gun32_r1 = new ModelRenderer(this);
		gun32_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		G17razorbackbarrel.addChild(gun32_r1);
		setRotationAngle(gun32_r1, -0.0372F, 0.0F, 0.0F);
		gun32_r1.cubeList.add(new ModelBox(gun32_r1, 39, 106, 0.0F, 0.0F, 0.0F, 2, 2, 17, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		G17razorbackbarrel.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}