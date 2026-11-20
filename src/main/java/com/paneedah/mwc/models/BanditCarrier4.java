package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class BanditCarrier4 extends ModelBiped {
	private final ModelRenderer chestharness;
	private final ModelRenderer body_r1;
	private final ModelRenderer body_r2;
	private final ModelRenderer body_r3;
	private final ModelRenderer body_r4;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;
	private final ModelRenderer bone5;

	public BanditCarrier4() {
		textureWidth = 64;
		textureHeight = 64;

		chestharness = new ModelRenderer(this);
		chestharness.setRotationPoint(0.0F, 0.0F, 0.0F);
		chestharness.cubeList.add(new ModelBox(chestharness, 0, 32, -3.4F, 3.25F, -2.65F, 1, 3, 1, 0.0F, false));
		chestharness.cubeList.add(new ModelBox(chestharness, 0, 16, 2.4F, 3.25F, -2.65F, 1, 3, 1, 0.0F, false));
		chestharness.cubeList.add(new ModelBox(chestharness, 0, 48, -4.0F, -0.25F, -2.0F, 2, 1, 4, 0.1F, false));
		chestharness.cubeList.add(new ModelBox(chestharness, 0, 53, 2.0F, -0.25F, -2.0F, 2, 1, 4, 0.1F, true));
		chestharness.cubeList.add(new ModelBox(chestharness, 32, 32, -4.0F, 7.9791F, -1.6516F, 8, 3, 4, 0.2F, false));

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(-2.9F, 3.05F, 2.35F);
		chestharness.addChild(body_r1);
		setRotationAngle(body_r1, 0.0F, 0.0F, -0.8727F);
		body_r1.cubeList.add(new ModelBox(body_r1, 48, 5, 0.0F, -0.4F, -1.0F, 1, 9, 1, -0.1F, false));

		body_r2 = new ModelRenderer(this);
		body_r2.setRotationPoint(2.9F, 3.05F, 2.35F);
		chestharness.addChild(body_r2);
		setRotationAngle(body_r2, 0.0F, 0.0F, 0.8727F);
		body_r2.cubeList.add(new ModelBox(body_r2, 12, 48, -1.0F, -0.4F, -0.97F, 1, 9, 1, -0.1F, false));

		body_r3 = new ModelRenderer(this);
		body_r3.setRotationPoint(3.0F, 11.5F, -4.15F);
		chestharness.addChild(body_r3);
		setRotationAngle(body_r3, 0.0F, -0.3316F, -0.0524F);
		body_r3.cubeList.add(new ModelBox(body_r3, 0, 0, 0.0F, -6.0F, 0.0F, 2, 6, 2, 0.0F, false));

		body_r4 = new ModelRenderer(this);
		body_r4.setRotationPoint(-3.0F, 11.5F, -4.15F);
		chestharness.addChild(body_r4);
		setRotationAngle(body_r4, 0.0F, 0.3316F, 0.0524F);
		body_r4.cubeList.add(new ModelBox(body_r4, 24, 0, -2.0F, -6.0F, 0.0F, 2, 6, 2, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(3.9F, 0.45F, 2.55F);
		chestharness.addChild(bone6);
		setRotationAngle(bone6, -0.0524F, 0.0F, 0.2793F);
		bone6.cubeList.add(new ModelBox(bone6, 36, 16, -2.0F, 0.0F, -1.0F, 2, 3, 1, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-3.9F, 0.45F, 2.55F);
		chestharness.addChild(bone7);
		setRotationAngle(bone7, -0.0524F, 0.0F, -0.2793F);
		bone7.cubeList.add(new ModelBox(bone7, 28, 32, 0.0F, 0.0F, -1.0F, 2, 3, 1, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(3.9F, 3.25F, -2.75F);
		chestharness.addChild(bone5);
		setRotationAngle(bone5, -0.1047F, 0.0F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 12, 32, -2.0F, -3.0F, 0.0F, 2, 3, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 20, 16, -7.8F, -3.0F, 0.0F, 2, 3, 1, 0.0F, false));
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