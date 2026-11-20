package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class LMG68Handle extends ModelWithAttachments {
	private final ModelRenderer handle;

	public LMG68Handle() {
		textureWidth = 416;
		textureHeight = 416;

		handle = new ModelRenderer(this);
		handle.setRotationPoint(0.0F, 23.7F, -1.0F);
		handle.cubeList.add(new ModelBox(handle, 16, 377, 0.65F, -38.125F, -21.7F, 1, 2, 5, -0.2F, false));
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