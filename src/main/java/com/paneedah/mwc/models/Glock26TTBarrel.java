package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Glock26TTBarrel extends ModelBase {
	private final ModelRenderer G26razorbackbarrel;
	private final ModelRenderer gun32_r1;

	public Glock26TTBarrel() {
		textureWidth = 192;
		textureHeight = 192;

		G26razorbackbarrel = new ModelRenderer(this);
		G26razorbackbarrel.setRotationPoint(-2.0F, -13.3F, -28.8F);
		G26razorbackbarrel.cubeList.add(new ModelBox(G26razorbackbarrel, 104, 0, 0.0F, 2.3F, 4.8F, 2, 2, 12, -0.3F, false));
		G26razorbackbarrel.cubeList.add(new ModelBox(G26razorbackbarrel, 148, 12, -0.6F, -0.3F, 13.3F, 1, 2, 5, 0.0F, false));
		G26razorbackbarrel.cubeList.add(new ModelBox(G26razorbackbarrel, 144, 53, -0.3F, -0.6F, 13.3F, 2, 2, 5, 0.0F, false));

		gun32_r1 = new ModelRenderer(this);
		gun32_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		G26razorbackbarrel.addChild(gun32_r1);
		setRotationAngle(gun32_r1, -0.0372F, 0.0F, 0.0F);
		gun32_r1.cubeList.add(new ModelBox(gun32_r1, 96, 26, 0.0F, 0.0F, 5.0F, 2, 2, 12, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		G26razorbackbarrel.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}