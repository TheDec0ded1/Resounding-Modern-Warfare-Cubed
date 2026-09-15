package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class BundT_MP9Handle extends ModelWithAttachments {
	private final ModelRenderer handle;

	public BundT_MP9Handle() {
		textureWidth = 240;
		textureHeight = 240;

		handle = new ModelRenderer(this);
		handle.setRotationPoint(0.0F, 24.0F, 0.0F);
		handle.cubeList.add(new ModelBox(handle, 0, 122, -2.499F, -37.2827F, -9.4011F, 2, 1, 20, 0.0F, false));
		handle.cubeList.add(new ModelBox(handle, 220, 96, -0.499F, -38.2827F, 7.5989F, 1, 2, 3, 0.0F, false));
		handle.cubeList.add(new ModelBox(handle, 220, 101, -3.499F, -38.2827F, 7.5989F, 1, 2, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handle.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}