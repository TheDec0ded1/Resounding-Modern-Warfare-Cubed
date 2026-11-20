package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Mk20Action extends ModelWithAttachments {
	private final ModelRenderer action;

	public Mk20Action() {
		textureWidth = 360;
		textureHeight = 360;

		action = new ModelRenderer(this);
		action.setRotationPoint(-0.25F, -15.7F, -45.0F);
		action.cubeList.add(new ModelBox(action, 248, 179, -1.0F, -2.0F, 0.0F, 1, 2, 29, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 26, 6, -0.5F, -1.35F, 10.8F, 3, 1, 1, -0.05F, false));
		action.cubeList.add(new ModelBox(action, 40, 150, -0.5F, -1.35F, 10.8F, 1, 1, 1, 0.05F, false));
		action.cubeList.add(new ModelBox(action, 61, 150, 1.9F, -0.95F, 10.4F, 1, 1, 1, -0.3F, false));
		action.cubeList.add(new ModelBox(action, 150, 57, 1.9F, -0.95F, 10.8F, 1, 1, 1, -0.3F, false));
		action.cubeList.add(new ModelBox(action, 150, 59, 1.9F, -0.95F, 11.2F, 1, 1, 1, -0.3F, false));
		action.cubeList.add(new ModelBox(action, 53, 150, 1.9F, -1.75F, 10.8F, 1, 1, 1, -0.3F, false));
		action.cubeList.add(new ModelBox(action, 150, 55, 1.9F, -1.75F, 10.4F, 1, 1, 1, -0.3F, false));
		action.cubeList.add(new ModelBox(action, 57, 150, 1.9F, -1.75F, 11.2F, 1, 1, 1, -0.3F, false));
		action.cubeList.add(new ModelBox(action, 150, 45, 1.9F, -1.35F, 11.2F, 1, 1, 1, -0.3F, false));
		action.cubeList.add(new ModelBox(action, 150, 41, 1.9F, -1.35F, 10.4F, 1, 1, 1, -0.3F, false));
		action.cubeList.add(new ModelBox(action, 157, 248, -2.5F, -2.0F, 0.0F, 1, 2, 29, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 276, 207, -1.0F, -2.0F, 29.0F, 1, 2, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 185, 276, -2.5F, -2.0F, 29.0F, 1, 2, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 0, 24, -3.3F, 1.5F, 21.0F, 1, 2, 10, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 7, 31, -3.3F, 1.5F, 18.0F, 1, 2, 3, 0.0F, false));
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