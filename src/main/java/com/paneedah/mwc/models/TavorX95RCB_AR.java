package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class TavorX95RCB_AR extends ModelBase {
	private final ModelRenderer railcoverBottom;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r10;

	public TavorX95RCB_AR() {
		textureWidth = 560;
		textureHeight = 560;

		railcoverBottom = new ModelRenderer(this);
		railcoverBottom.setRotationPoint(0.0F, 24.0F, 0.0F);
		railcoverBottom.cubeList.add(new ModelBox(railcoverBottom, 260, 490, -2.0972F, -32.25F, -31.15F, 2, 1, 20, -0.15F, false));
		railcoverBottom.cubeList.add(new ModelBox(railcoverBottom, 304, 490, -2.8748F, -32.25F, -31.15F, 2, 1, 20, -0.15F, false));
		railcoverBottom.cubeList.add(new ModelBox(railcoverBottom, 530, 51, -3.5F, -32.25F, -31.0F, 4, 2, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-3.5359F, -31.6951F, -30.15F);
		railcoverBottom.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.5236F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 490, 232, -1.0F, -1.0F, -1.0F, 2, 1, 20, -0.15F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.5639F, -31.6951F, -30.15F);
		railcoverBottom.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.5236F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 216, 490, -1.0F, -1.0F, -1.0F, 2, 1, 20, -0.15F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		railcoverBottom.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}