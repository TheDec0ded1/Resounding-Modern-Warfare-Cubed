package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class APBStock extends ModelBase {
	private final ModelRenderer apbstock;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;

	public APBStock() {
		textureWidth = 256;
		textureHeight = 256;

		apbstock = new ModelRenderer(this);
		apbstock.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.4558F, -29.164F, 39.8208F);
		apbstock.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.1293F, 0.1176F, -0.7341F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 117, 185, -0.5F, -1.0F, -12.5F, 1, 2, 5, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.5442F, -29.164F, 39.8208F);
		apbstock.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.1293F, -0.1176F, 0.7341F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 71, 149, -0.5F, -1.0F, -12.5F, 1, 2, 5, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-0.1512F, -16.5478F, 3.2561F);
		apbstock.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.1745F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 116, 186, -1.7F, -6.0F, 25.7F, 1, 1, 5, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 116, 186, -1.9976F, -6.0F, 25.7F, 1, 1, 5, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-0.5874F, -20.7166F, 42.5398F);
		apbstock.addChild(cube_r4);
		setRotationAngle(cube_r4, -1.5708F, 0.0F, 0.8727F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 107, 84, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-2.4126F, -20.7166F, 42.5398F);
		apbstock.addChild(cube_r5);
		setRotationAngle(cube_r5, -1.5708F, 0.0F, -0.8727F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 76, 150, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-1.4321F, -20.1908F, 42.5398F);
		apbstock.addChild(cube_r6);
		setRotationAngle(cube_r6, -1.5708F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 122, 186, -0.575F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.5F, -21.4763F, 42.5398F);
		apbstock.addChild(cube_r7);
		setRotationAngle(cube_r7, -1.5708F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 165, 112, -2.0F, -0.5F, -9.5F, 1, 1, 10, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 72, 149, 1.0F, -0.5F, -9.5F, 1, 1, 10, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-1.5F, -18.0F, 3.0F);
		apbstock.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.1745F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 55, 98, -2.0F, -6.0F, 0.7F, 1, 1, 40, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 56, 51, 1.0F, -6.0F, 0.7F, 1, 1, 40, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 118, 181, -1.5F, -7.0F, -1.0F, 3, 8, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		apbstock.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}