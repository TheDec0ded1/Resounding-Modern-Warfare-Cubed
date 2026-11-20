package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.10.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class PKMAction extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer cube_r1;

	public PKMAction() {
		textureWidth = 512;
		textureHeight = 512;

		action = new ModelRenderer(this);
		action.setRotationPoint(-3.0F, -62.0F, -2.0F);
		action.cubeList.add(new ModelBox(action, 133, 147, -1.0F, 52.0F, -20.5F, 2, 2, 2, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 94, 76, -1.9F, 52.0F, -20.5F, 2, 1, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 86, 88, -3.9F, 52.0F, -20.1F, 2, 1, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 96, 4, -1.9F, 52.0F, -20.1F, 2, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.8537F, 54.0F, -20.8007F);
		action.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -0.3054F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 62, 25, -1.7F, -2.0F, 0.0F, 3, 1, 1, 0.0F, false));
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