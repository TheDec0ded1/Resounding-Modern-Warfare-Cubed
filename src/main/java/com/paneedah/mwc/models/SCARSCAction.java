package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SCARSCAction extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer action_r1;

	public SCARSCAction() {
		textureWidth = 360;
		textureHeight = 360;

		action = new ModelRenderer(this);
		action.setRotationPoint(-0.25F, -15.7F, -45.0F);
		action.cubeList.add(new ModelBox(action, 256, 187, -1.0F, -2.0F, 8.0F, 1, 2, 21, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 26, 6, -2.3F, -1.35F, 11.8F, 3, 1, 1, -0.05F, false));
		action.cubeList.add(new ModelBox(action, 165, 256, -2.5F, -2.0F, 8.0F, 1, 2, 21, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 0, 24, -3.3F, 1.5F, 21.0F, 1, 2, 10, 0.0F, false));

		action_r1 = new ModelRenderer(this);
		action_r1.setRotationPoint(-1.1036F, -0.2277F, 12.3F);
		action.addChild(action_r1);
		setRotationAngle(action_r1, 0.0F, 0.0F, 0.3054F);
		action_r1.cubeList.add(new ModelBox(action_r1, 150, 41, 1.7F, -1.6F, -0.9F, 1, 1, 1, -0.3F, false));
		action_r1.cubeList.add(new ModelBox(action_r1, 150, 45, 1.7F, -1.6F, -0.1F, 1, 1, 1, -0.3F, false));
		action_r1.cubeList.add(new ModelBox(action_r1, 57, 150, 1.7F, -2.0F, -0.1F, 1, 1, 1, -0.3F, false));
		action_r1.cubeList.add(new ModelBox(action_r1, 150, 55, 1.7F, -2.0F, -0.9F, 1, 1, 1, -0.3F, false));
		action_r1.cubeList.add(new ModelBox(action_r1, 53, 150, 1.7F, -2.0F, -0.5F, 1, 1, 1, -0.3F, false));
		action_r1.cubeList.add(new ModelBox(action_r1, 150, 59, 1.7F, -1.2F, -0.1F, 1, 1, 1, -0.3F, false));
		action_r1.cubeList.add(new ModelBox(action_r1, 150, 57, 1.7F, -1.2F, -0.5F, 1, 1, 1, -0.3F, false));
		action_r1.cubeList.add(new ModelBox(action_r1, 61, 150, 1.7F, -1.2F, -0.9F, 1, 1, 1, -0.3F, false));
		action_r1.cubeList.add(new ModelBox(action_r1, 150, 41, 3.7F, -1.6F, -0.9F, 1, 1, 1, -0.3F, false));
		action_r1.cubeList.add(new ModelBox(action_r1, 150, 45, 3.7F, -1.6F, -0.1F, 1, 1, 1, -0.3F, false));
		action_r1.cubeList.add(new ModelBox(action_r1, 57, 150, 3.7F, -2.0F, -0.1F, 1, 1, 1, -0.3F, false));
		action_r1.cubeList.add(new ModelBox(action_r1, 150, 55, 3.7F, -2.0F, -0.9F, 1, 1, 1, -0.3F, false));
		action_r1.cubeList.add(new ModelBox(action_r1, 53, 150, 3.7F, -2.0F, -0.5F, 1, 1, 1, -0.3F, false));
		action_r1.cubeList.add(new ModelBox(action_r1, 150, 59, 3.7F, -1.2F, -0.1F, 1, 1, 1, -0.3F, false));
		action_r1.cubeList.add(new ModelBox(action_r1, 150, 57, 3.7F, -1.2F, -0.5F, 1, 1, 1, -0.3F, false));
		action_r1.cubeList.add(new ModelBox(action_r1, 61, 150, 3.7F, -1.2F, -0.9F, 1, 1, 1, -0.3F, false));
		action_r1.cubeList.add(new ModelBox(action_r1, 26, 6, 1.3F, -1.6F, -0.5F, 3, 1, 1, -0.05F, false));
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