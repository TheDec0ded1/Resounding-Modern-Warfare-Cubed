package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class BanditCarrier3 extends ModelBiped {
	private final ModelRenderer platecarrier;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;
	private final ModelRenderer cube_r34;
	private final ModelRenderer cube_r35;

	public BanditCarrier3() {
		textureWidth = 85;
		textureHeight = 128;

		platecarrier = new ModelRenderer(this);
		platecarrier.setRotationPoint(0.0F, 0.0F, 0.0F);
		platecarrier.cubeList.add(new ModelBox(platecarrier, 27, 22, -3.5F, 1.75F, -2.58F, 7, 9, 5, -0.1F, false));
		platecarrier.cubeList.add(new ModelBox(platecarrier, 24, 36, -3.0F, 5.45F, -3.07F, 6, 5, 6, 0.0F, false));
		platecarrier.cubeList.add(new ModelBox(platecarrier, 27, 11, -4.0F, 6.25F, -2.62F, 8, 4, 5, 0.1F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(3.5F, 1.75F, -2.5F);
		platecarrier.addChild(cube_r28);
		setRotationAngle(cube_r28, -0.192F, 0.0F, -0.1571F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 0, -2.0F, -2.0F, 0.0F, 2, 2, 1, 0.0F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(-3.5F, 1.75F, -2.5F);
		platecarrier.addChild(cube_r29);
		setRotationAngle(cube_r29, -0.192F, 0.0F, 0.1571F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 3, 0.0F, -2.0F, 0.0F, 2, 2, 1, 0.0F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(-3.0F, 0.05F, 2.1F);
		platecarrier.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.1396F, 0.0F, -0.1222F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 16, 0.0F, 0.0F, -1.0F, 2, 2, 1, 0.0F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(3.0F, 0.05F, 2.1F);
		platecarrier.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.1396F, 0.0F, 0.1222F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 19, -2.0F, 0.0F, -1.0F, 2, 2, 1, 0.0F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(3.2F, -0.25F, -1.9F);
		platecarrier.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.0F, -0.0698F, 0.0F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 48, 11, -2.0F, 0.0F, -0.05F, 2, 1, 4, 0.0F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(-3.2F, -0.25F, -1.9F);
		platecarrier.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.0F, 0.0698F, 0.0F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 58, 7, 0.0F, 0.0F, -0.05F, 2, 1, 4, 0.0F, false));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(-0.5F, 4.65F, -4.05F);
		platecarrier.addChild(cube_r34);
		setRotationAngle(cube_r34, 0.05F, -0.065F, -0.025F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 58, 32, 0.0F, 0.0F, -0.22F, 3, 5, 2, 0.0F, false));

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(-4.6F, 5.05F, -3.35F);
		platecarrier.addChild(cube_r35);
		setRotationAngle(cube_r35, -0.0433F, 0.2406F, -0.1798F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 58, 57, 0.0F, 0.0F, -0.22F, 3, 5, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		platecarrier.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}