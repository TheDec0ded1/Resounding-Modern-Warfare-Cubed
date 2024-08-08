package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SaigaSporterMag extends ModelBase {
	private final ModelRenderer mag;
	private final ModelRenderer bone5;

	public SaigaSporterMag() {
		textureWidth = 512;
		textureHeight = 512;

		mag = new ModelRenderer(this);
		mag.setRotationPoint(0.0F, 23.7F, 0.1F);
		

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-1.5F, -28.6927F, -23.9674F);
		mag.addChild(bone5);
		setRotationAngle(bone5, -0.1745F, 0.0F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 26, 56, -1.5F, -2.6593F, -2.7842F, 3, 6, 2, -0.001F, false));
		bone5.cubeList.add(new ModelBox(bone5, 0, 56, -2.0F, -2.6593F, -1.5342F, 4, 6, 7, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 28, 13, -2.0F, 3.3373F, -2.548F, 4, 1, 8, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		mag.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}