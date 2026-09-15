package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Tavor21LowerRail extends ModelBase {
	private final ModelRenderer rail_lower;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;

	public Tavor21LowerRail() {
		textureWidth = 432;
		textureHeight = 432;

		rail_lower = new ModelRenderer(this);
		rail_lower.setRotationPoint(-1.5401F, -5.8352F, -24.671F);
		setRotationAngle(rail_lower, 0.0F, 0.0F, 3.1416F);
		rail_lower.cubeList.add(new ModelBox(rail_lower, 348, 425, -1.0352F, -1.5848F, -0.329F, 1, 1, 1, -0.199F, false));
		rail_lower.cubeList.add(new ModelBox(rail_lower, 352, 425, -1.0352F, -1.5848F, 0.921F, 1, 1, 1, -0.199F, false));
		rail_lower.cubeList.add(new ModelBox(rail_lower, 356, 425, -1.0352F, -1.5848F, 2.171F, 1, 1, 1, -0.199F, false));
		rail_lower.cubeList.add(new ModelBox(rail_lower, 380, 425, -1.0352F, -1.5848F, 3.421F, 1, 1, 1, -0.199F, false));
		rail_lower.cubeList.add(new ModelBox(rail_lower, 384, 425, -1.0352F, -1.5848F, 4.671F, 1, 1, 1, -0.199F, false));
		rail_lower.cubeList.add(new ModelBox(rail_lower, 388, 425, -1.0352F, -1.5848F, 5.921F, 1, 1, 1, -0.199F, false));
		rail_lower.cubeList.add(new ModelBox(rail_lower, 392, 425, -1.0352F, -1.5848F, 7.171F, 1, 1, 1, -0.199F, false));
		rail_lower.cubeList.add(new ModelBox(rail_lower, 392, 0, -1.1352F, -0.9848F, -5.329F, 2, 2, 14, -0.001F, false));
		rail_lower.cubeList.add(new ModelBox(rail_lower, 392, 33, 0.0648F, -0.9848F, -5.329F, 1, 2, 14, 0.0F, false));
		rail_lower.cubeList.add(new ModelBox(rail_lower, 396, 425, -1.0352F, -1.5848F, -1.629F, 1, 1, 1, -0.199F, false));
		rail_lower.cubeList.add(new ModelBox(rail_lower, 400, 425, -0.0364F, -1.5869F, 7.172F, 1, 1, 1, -0.199F, false));
		rail_lower.cubeList.add(new ModelBox(rail_lower, 426, 289, -1.0352F, -1.5848F, 7.771F, 1, 1, 1, -0.199F, false));
		rail_lower.cubeList.add(new ModelBox(rail_lower, 292, 386, -0.0364F, -1.5869F, 7.772F, 1, 1, 1, -0.199F, false));
		rail_lower.cubeList.add(new ModelBox(rail_lower, 404, 425, -0.0364F, -1.5869F, 5.922F, 1, 1, 1, -0.199F, false));
		rail_lower.cubeList.add(new ModelBox(rail_lower, 408, 425, -0.0364F, -1.5869F, 4.672F, 1, 1, 1, -0.199F, false));
		rail_lower.cubeList.add(new ModelBox(rail_lower, 418, 425, -0.0364F, -1.5869F, 3.422F, 1, 1, 1, -0.199F, false));
		rail_lower.cubeList.add(new ModelBox(rail_lower, 422, 425, -0.0364F, -1.5869F, 2.172F, 1, 1, 1, -0.199F, false));
		rail_lower.cubeList.add(new ModelBox(rail_lower, 0, 426, -0.0364F, -1.5869F, 0.922F, 1, 1, 1, -0.199F, false));
		rail_lower.cubeList.add(new ModelBox(rail_lower, 4, 426, -1.0352F, -1.5848F, -5.479F, 1, 1, 1, -0.199F, false));
		rail_lower.cubeList.add(new ModelBox(rail_lower, 28, 426, -0.0364F, -1.5869F, -5.478F, 1, 1, 1, -0.199F, false));
		rail_lower.cubeList.add(new ModelBox(rail_lower, 32, 426, -0.0364F, -1.5869F, -0.328F, 1, 1, 1, -0.199F, false));
		rail_lower.cubeList.add(new ModelBox(rail_lower, 36, 426, -0.0364F, -1.5869F, -1.628F, 1, 1, 1, -0.199F, false));
		rail_lower.cubeList.add(new ModelBox(rail_lower, 40, 426, -0.0364F, -1.5869F, -4.228F, 1, 1, 1, -0.199F, false));
		rail_lower.cubeList.add(new ModelBox(rail_lower, 44, 426, -1.0352F, -1.5848F, -4.229F, 1, 1, 1, -0.199F, false));
		rail_lower.cubeList.add(new ModelBox(rail_lower, 48, 426, -1.0352F, -1.5848F, -2.929F, 1, 1, 1, -0.199F, false));
		rail_lower.cubeList.add(new ModelBox(rail_lower, 52, 426, -0.0364F, -1.5869F, -2.928F, 1, 1, 1, -0.199F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(16.4648F, -0.3848F, -4.329F);
		rail_lower.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.0F, -0.8901F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 56, 426, -9.9032F, -13.0305F, 2.7F, 1, 1, 1, -0.198F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 94, 426, -9.9032F, -13.0305F, 11.5F, 1, 1, 1, -0.198F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 426, 291, -9.9032F, -13.0305F, 12.1F, 1, 1, 1, -0.198F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 98, 426, -9.9032F, -13.0305F, 10.25F, 1, 1, 1, -0.198F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 102, 426, -9.9032F, -13.0305F, 9.0F, 1, 1, 1, -0.198F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 426, 102, -9.9032F, -13.0305F, 7.75F, 1, 1, 1, -0.198F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 426, 104, -9.9032F, -13.0305F, 6.5F, 1, 1, 1, -0.198F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 106, 426, -9.9032F, -13.0305F, 5.25F, 1, 1, 1, -0.198F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 110, 426, -9.9032F, -13.0305F, -1.15F, 1, 1, 1, -0.198F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 114, 426, -9.9032F, -13.0305F, 4.0F, 1, 1, 1, -0.198F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 426, 117, -9.9032F, -13.0305F, 0.1F, 1, 1, 1, -0.198F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 118, 426, -9.9032F, -13.0305F, 1.4F, 1, 1, 1, -0.198F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(14.8648F, -0.3848F, -4.329F);
		rail_lower.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, 0.8901F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 426, 119, -10.8575F, 11.3718F, 2.7F, 1, 1, 1, -0.198F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 426, 121, -10.8575F, 11.3718F, 11.5F, 1, 1, 1, -0.198F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 318, 426, -10.8575F, 11.3718F, 12.1F, 1, 1, 1, -0.198F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 122, 426, -10.8575F, 11.3718F, 10.25F, 1, 1, 1, -0.198F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 426, 123, -10.8575F, 11.3718F, 9.0F, 1, 1, 1, -0.198F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 426, 125, -10.8575F, 11.3718F, 7.75F, 1, 1, 1, -0.198F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 126, 426, -10.8575F, 11.3718F, 6.5F, 1, 1, 1, -0.198F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 426, 127, -10.8575F, 11.3718F, 5.25F, 1, 1, 1, -0.198F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 426, 129, -10.8575F, 11.3718F, -1.15F, 1, 1, 1, -0.198F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 130, 426, -10.8575F, 11.3718F, 4.0F, 1, 1, 1, -0.198F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 426, 131, -10.8575F, 11.3718F, 0.1F, 1, 1, 1, -0.198F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 426, 133, -10.8575F, 11.3718F, 1.4F, 1, 1, 1, -0.198F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		rail_lower.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}