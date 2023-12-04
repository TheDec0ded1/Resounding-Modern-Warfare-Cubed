package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class BanditHalfMask extends ModelBiped {
	private final ModelRenderer facebandana;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;

	public BanditHalfMask() {
		textureWidth = 100;
		textureHeight = 64;

		facebandana = new ModelRenderer(this);
		facebandana.setRotationPoint(0.0F, 0.0F, 0.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.15F, -0.1F, 3.88F);
		facebandana.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.7156F, 0.576F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 27, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.25F, -0.7F, 4.28F);
		facebandana.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.4712F, -0.4014F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 12, 43, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-4.25F, -2.5F, -3.7F);
		facebandana.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.1222F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 59, 3, -0.2F, -0.2F, -0.2F, 9, 3, 9, -0.2F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -3.45F, -4.7F);
		facebandana.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.1222F, -0.0873F, 0.2094F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 48, 12, 0.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, -2.5F, -4.75F);
		facebandana.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.1222F, 0.1047F, -0.1047F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 32, 8, -4.3F, 0.0F, 0.01F, 1, 2, 1, 0.0F, true));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, -2.5F, -4.75F);
		facebandana.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.1222F, -0.1047F, 0.1047F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 32, 8, 3.3F, 0.0F, 0.01F, 1, 2, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 1.3F, -4.35F);
		facebandana.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.1222F, -0.0698F, -0.2094F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 44, 8, 0.0F, -3.0F, 0.0F, 4, 3, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 1.3F, -4.35F);
		facebandana.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.1745F, 0.0873F, 0.192F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 47, 0, -4.0F, -3.0F, 0.0F, 4, 3, 1, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, -3.45F, -4.85F);
		facebandana.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.1396F, 0.1047F, -0.2269F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 48, 15, -4.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		facebandana.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}