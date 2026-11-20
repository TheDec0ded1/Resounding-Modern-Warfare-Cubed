package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QJY88Handle extends ModelWithAttachments {
	private final ModelRenderer handle;

	public QJY88Handle() {
		textureWidth = 512;
		textureHeight = 512;

		handle = new ModelRenderer(this);
		handle.setRotationPoint(-5.35F, -14.95F, -19.0F);
		handle.cubeList.add(new ModelBox(handle, 368, 198, -3.65F, -0.5F, 1.0F, 5, 1, 1, 0.0F, false));
		handle.cubeList.add(new ModelBox(handle, 470, 41, 0.65F, -0.5F, -8.0F, 1, 1, 13, 0.0F, false));
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