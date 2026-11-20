package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Tavor21SightsFolded extends ModelBase {
	private final ModelRenderer sights_folded;

	public Tavor21SightsFolded() {
		textureWidth = 432;
		textureHeight = 432;

		sights_folded = new ModelRenderer(this);
		sights_folded.setRotationPoint(-1.4977F, -16.1743F, -30.6138F);
		setRotationAngle(sights_folded, -1.5708F, 0.0F, 0.0F);
		sights_folded.cubeList.add(new ModelBox(sights_folded, 422, 404, -0.4988F, -5.1745F, 0.5683F, 1, 2, 1, -0.35F, false));
		sights_folded.cubeList.add(new ModelBox(sights_folded, 406, 422, -0.5004F, -4.1585F, 0.5939F, 1, 2, 1, 0.0F, false));
		sights_folded.cubeList.add(new ModelBox(sights_folded, 422, 102, -0.3254F, -2.3335F, 0.4189F, 1, 4, 1, -0.175F, false));
		sights_folded.cubeList.add(new ModelBox(sights_folded, 422, 117, -0.6754F, -2.3335F, 0.4189F, 1, 4, 1, -0.175F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		sights_folded.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}