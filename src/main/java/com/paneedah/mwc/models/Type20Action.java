package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Type20Action extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer cube_r122;
	private final ModelRenderer cube_r123;
	private final ModelRenderer cube_r124;
	private final ModelRenderer cube_r125;

	public Type20Action() {
		textureWidth = 210;
		textureHeight = 210;

		action = new ModelRenderer(this);
		action.setRotationPoint(-0.35F, -16.3F, -30.0F);
		action.cubeList.add(new ModelBox(action, 136, 84, -3.0F, 2.3F, 7.5F, 1, 2, 9, 0.0F, false));

		cube_r122 = new ModelRenderer(this);
		cube_r122.setRotationPoint(1.9F, 0.7F, 0.0F);
		action.addChild(cube_r122);
		setRotationAngle(cube_r122, 0.0F, 0.0F, -0.0698F);
		cube_r122.cubeList.add(new ModelBox(cube_r122, 9, 25, -2.0F, -1.0F, 0.0F, 2, 1, 1, -0.15F, false));

		cube_r123 = new ModelRenderer(this);
		cube_r123.setRotationPoint(2.9F, 0.6F, 0.25F);
		action.addChild(cube_r123);
		setRotationAngle(cube_r123, 0.0F, 0.0F, -0.0698F);
		cube_r123.cubeList.add(new ModelBox(cube_r123, 18, 25, -2.0F, -1.0F, 0.0F, 2, 1, 1, -0.001F, false));
		cube_r123.cubeList.add(new ModelBox(cube_r123, 0, 33, -2.0F, -1.0F, -0.5F, 2, 1, 1, 0.0F, false));

		cube_r124 = new ModelRenderer(this);
		cube_r124.setRotationPoint(-2.8F, 0.9F, 0.0F);
		action.addChild(cube_r124);
		setRotationAngle(cube_r124, 0.0F, 0.0F, 0.5236F);
		cube_r124.cubeList.add(new ModelBox(cube_r124, 0, 38, 0.0F, -1.0F, 0.0F, 1, 1, 17, 0.0F, false));

		cube_r125 = new ModelRenderer(this);
		cube_r125.setRotationPoint(0.5F, 0.9F, 0.0F);
		action.addChild(cube_r125);
		setRotationAngle(cube_r125, 0.0F, 0.0F, -0.5236F);
		cube_r125.cubeList.add(new ModelBox(cube_r125, 39, 0, -1.0F, -1.0F, 0.0F, 1, 1, 17, 0.0F, false));
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