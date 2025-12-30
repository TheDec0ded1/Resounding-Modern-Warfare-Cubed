package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Stoner63LMGAction extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer action_r1;

	public Stoner63LMGAction() {
		textureWidth = 576;
		textureHeight = 576;

		action = new ModelRenderer(this);
		action.setRotationPoint(-1.5722F, -16.1861F, -34.8453F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.265F, -2.1276F, 31.8453F);
		action.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -0.5236F, -3.1416F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 316, 563, -0.5F, -2.0F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.0064F, 3.0292F, -7.4435F);
		action.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -3.1416F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 459, 104, -2.7714F, -0.8432F, 27.1888F, 3, 4, 13, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 338, 61, -1.5714F, -1.9182F, -31.7122F, 1, 1, 59, -0.1F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 260, 380, -1.0057F, -1.3525F, -31.7122F, 1, 1, 59, -0.1F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 338, 0, -1.5714F, -0.7868F, -31.7122F, 1, 1, 59, -0.1F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 139, 330, -2.1371F, -1.3525F, -31.7122F, 1, 1, 59, -0.1F, false));

		action_r1 = new ModelRenderer(this);
		action_r1.setRotationPoint(-1.0064F, 3.0292F, -7.4435F);
		action.addChild(action_r1);
		setRotationAngle(action_r1, 0.0F, 0.0F, -2.3562F);
		action_r1.cubeList.add(new ModelBox(action_r1, 381, 380, -2.4261F, -0.3452F, -31.7122F, 1, 1, 59, -0.1F, false));
		action_r1.cubeList.add(new ModelBox(action_r1, 139, 391, -1.8604F, 0.2205F, -31.7122F, 1, 1, 59, -0.1F, false));
		action_r1.cubeList.add(new ModelBox(action_r1, 0, 400, -1.8604F, -0.9109F, -31.7122F, 1, 1, 59, -0.1F, false));
		action_r1.cubeList.add(new ModelBox(action_r1, 260, 441, -1.2947F, -0.3452F, -31.7122F, 1, 1, 59, -0.1F, false));
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