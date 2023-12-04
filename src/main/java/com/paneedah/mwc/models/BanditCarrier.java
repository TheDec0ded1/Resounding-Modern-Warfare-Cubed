package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class BanditCarrier extends ModelBiped {
	private final ModelRenderer platecarrier;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;

	public BanditCarrier() {
		textureWidth = 128;
		textureHeight = 128;

		platecarrier = new ModelRenderer(this);
		platecarrier.setRotationPoint(0.0F, 0.0F, 0.0F);
		platecarrier.cubeList.add(new ModelBox(platecarrier, 27, 22, -3.5F, 1.75F, -2.58F, 7, 9, 5, -0.1F, false));
		platecarrier.cubeList.add(new ModelBox(platecarrier, 24, 36, -3.0F, 5.45F, -3.07F, 6, 5, 6, 0.0F, false));
		platecarrier.cubeList.add(new ModelBox(platecarrier, 27, 11, -4.0F, 6.25F, -2.62F, 8, 4, 5, 0.1F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(3.5F, 1.75F, -2.5F);
		platecarrier.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.192F, 0.0F, -0.1571F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, -2.0F, -2.0F, 0.0F, 2, 2, 1, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-3.5F, 1.75F, -2.5F);
		platecarrier.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.192F, 0.0F, 0.1571F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 3, 0.0F, -2.0F, 0.0F, 2, 2, 1, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-3.0F, 0.05F, 2.1F);
		platecarrier.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.1396F, 0.0F, -0.1222F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 16, 0.0F, 0.0F, -1.0F, 2, 2, 1, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(3.0F, 0.05F, 2.1F);
		platecarrier.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.1396F, 0.0F, 0.1222F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 19, -2.0F, 0.0F, -1.0F, 2, 2, 1, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(3.2F, -0.25F, -1.9F);
		platecarrier.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, -0.0698F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 48, 11, -2.0F, 0.0F, -0.05F, 2, 1, 4, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-3.2F, -0.25F, -1.9F);
		platecarrier.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0698F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 58, 7, 0.0F, 0.0F, -0.05F, 2, 1, 4, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-0.5F, 4.65F, -4.05F);
		platecarrier.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.05F, -0.065F, -0.025F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 58, 32, 0.0F, 0.0F, -0.22F, 3, 5, 2, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-4.6F, 5.05F, -3.35F);
		platecarrier.addChild(cube_r18);
		setRotationAngle(cube_r18, -0.0433F, 0.2406F, -0.1798F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 58, 57, 0.0F, 0.0F, -0.22F, 3, 5, 2, 0.0F, false));
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