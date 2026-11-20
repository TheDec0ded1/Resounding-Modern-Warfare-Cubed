package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class LMG68Bolt extends ModelWithAttachments {
	private final ModelRenderer bolt;

	public LMG68Bolt() {
		textureWidth = 416;
		textureHeight = 416;

		bolt = new ModelRenderer(this);
		bolt.setRotationPoint(0.0F, 23.7F, 17.0F);
		bolt.cubeList.add(new ModelBox(bolt, 106, 338, -3.2F, -41.5F, -36.0F, 3, 5, 12, 0.0F, false));
		bolt.cubeList.add(new ModelBox(bolt, 234, 184, -0.7F, -41.5F, -36.0F, 1, 5, 12, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bolt.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}