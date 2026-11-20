package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class BundT_MP9Action extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer cube_r1;

	public BundT_MP9Action() {
		textureWidth = 240;
		textureHeight = 240;

		action = new ModelRenderer(this);
		action.setRotationPoint(0.0F, 24.0F, 0.0F);
		action.cubeList.add(new ModelBox(action, 192, 164, -3.4F, -34.8F, -4.7F, 2, 1, 6, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.284F, -34.733F, -1.7F);
		action.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.5236F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 192, 46, -1.0F, -1.5F, -3.0F, 2, 2, 6, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		action.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}