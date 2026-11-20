package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class BanditCarrier2 extends ModelBiped {
	private final ModelRenderer chestharness;
	private final ModelRenderer body_r1;
	private final ModelRenderer body_r2;
	private final ModelRenderer body_r3;
	private final ModelRenderer body_r4;
	private final ModelRenderer body_r5;
	private final ModelRenderer body_r6;

	public BanditCarrier2() {
		textureWidth = 100;
		textureHeight = 64;

		chestharness = new ModelRenderer(this);
		chestharness.setRotationPoint(0.0F, 0.0F, 0.0F);
		chestharness.cubeList.add(new ModelBox(chestharness, 36, 24, -3.999F, 6.0F, -2.75F, 8, 5, 1, 0.1F, false));
		chestharness.cubeList.add(new ModelBox(chestharness, 0, 27, -3.4F, 3.25F, -2.65F, 1, 3, 1, 0.0F, false));
		chestharness.cubeList.add(new ModelBox(chestharness, 24, 0, 2.4F, 3.25F, -2.65F, 1, 3, 1, 0.0F, false));
		chestharness.cubeList.add(new ModelBox(chestharness, 16, 43, 1.8F, -0.05F, -2.0F, 2, 1, 4, 0.1F, false));
		chestharness.cubeList.add(new ModelBox(chestharness, 40, 33, -3.8F, -0.05F, -2.0F, 2, 1, 4, 0.1F, false));
		chestharness.cubeList.add(new ModelBox(chestharness, 24, 0, -4.636F, 7.9791F, -2.5516F, 9, 3, 5, 0.0F, false));

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(-3.9F, 3.25F, -2.75F);
		chestharness.addChild(body_r1);
		setRotationAngle(body_r1, -0.1047F, 0.0F, 0.0F);
		body_r1.cubeList.add(new ModelBox(body_r1, 0, 16, 0.1F, -3.0F, 0.0F, 2, 3, 1, 0.0F, false));
		body_r1.cubeList.add(new ModelBox(body_r1, 26, 20, 5.7F, -3.0F, 0.0F, 2, 3, 1, 0.0F, false));

		body_r2 = new ModelRenderer(this);
		body_r2.setRotationPoint(3.9F, 0.45F, 2.55F);
		chestharness.addChild(body_r2);
		setRotationAngle(body_r2, -0.0524F, 0.0F, 0.2793F);
		body_r2.cubeList.add(new ModelBox(body_r2, 0, 20, -2.0F, 0.0F, -1.0F, 2, 3, 1, 0.0F, false));

		body_r3 = new ModelRenderer(this);
		body_r3.setRotationPoint(-3.9F, 0.45F, 2.55F);
		chestharness.addChild(body_r3);
		setRotationAngle(body_r3, -0.0524F, 0.0F, -0.2793F);
		body_r3.cubeList.add(new ModelBox(body_r3, 26, 16, 0.0F, 0.0F, -1.0F, 2, 3, 1, 0.0F, false));

		body_r4 = new ModelRenderer(this);
		body_r4.setRotationPoint(-2.9F, 3.05F, 2.35F);
		chestharness.addChild(body_r4);
		setRotationAngle(body_r4, 0.0F, 0.0F, -0.8727F);
		body_r4.cubeList.add(new ModelBox(body_r4, 28, 43, 0.0F, -0.2F, -1.0F, 1, 9, 1, -0.1F, false));

		body_r5 = new ModelRenderer(this);
		body_r5.setRotationPoint(2.9F, 3.05F, 2.35F);
		chestharness.addChild(body_r5);
		setRotationAngle(body_r5, 0.0F, 0.0F, 0.8727F);
		body_r5.cubeList.add(new ModelBox(body_r5, 32, 43, -1.0F, 0.0F, -0.97F, 1, 9, 1, -0.1F, false));

		body_r6 = new ModelRenderer(this);
		body_r6.setRotationPoint(-2.6F, 11.5F, -4.15F);
		chestharness.addChild(body_r6);
		setRotationAngle(body_r6, 0.0F, 0.3316F, 0.0524F);
		body_r6.cubeList.add(new ModelBox(body_r6, 0, 0, -2.0F, -5.0F, 0.0F, 2, 5, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		chestharness.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}