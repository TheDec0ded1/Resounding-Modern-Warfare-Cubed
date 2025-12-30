package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Stoner63RifleHandguard extends ModelBase {
	private final ModelRenderer handguard;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;

	public Stoner63RifleHandguard() {
		textureWidth = 592;
		textureHeight = 592;

		handguard = new ModelRenderer(this);
		handguard.setRotationPoint(0.0F, 27.0F, 2.0F);
		handguard.cubeList.add(new ModelBox(handguard, 455, 39, -4.0F, -37.0F, -66.0F, 5, 1, 29, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 530, 214, 0.7071F, -41.7071F, -62.0F, 1, 5, 26, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 530, 246, -4.7071F, -41.7071F, -62.0F, 1, 5, 26, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 355, 575, 0.7071F, -41.7071F, -63.0F, 1, 2, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 575, 350, -4.7071F, -41.7071F, -63.0F, 1, 2, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 25, 579, 0.7071F, -39.7071F, -62.6F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 20, 579, -4.7071F, -39.7071F, -62.6F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 394, 551, -4.0F, -37.4F, -37.1F, 5, 2, 5, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 377, 562, -0.4F, -38.075F, -34.1F, 1, 2, 4, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 511, 562, -3.6F, -38.075F, -34.1F, 1, 2, 4, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.5F, -36.53F, -39.3854F);
		handguard.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.2618F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 453, 273, -2.5F, -0.5F, -1.5F, 5, 1, 4, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.9393F, -37.7678F, -51.5F);
		handguard.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 339, 534, -2.0F, -0.5F, -10.5F, 1, 1, 26, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(2.0607F, -37.7678F, -51.5F);
		handguard.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.7854F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 532, 278, -2.0F, -0.5F, -10.5F, 1, 1, 26, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-4.0411F, -39.2071F, -35.102F);
		handguard.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.1745F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 481, 328, -0.5F, -2.5F, -1.0F, 1, 5, 4, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(1.0411F, -39.2071F, -35.102F);
		handguard.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, -0.1745F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 147, 556, -0.5F, -2.5F, -1.0F, 1, 5, 4, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.6938F, -39.2071F, -64.8676F);
		handguard.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.1745F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 322, 557, -0.5F, -2.5F, -1.0F, 1, 5, 4, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-3.6938F, -39.2071F, -64.8676F);
		handguard.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, -0.1745F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 311, 557, -0.5F, -2.5F, -1.0F, 1, 5, 4, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-1.5F, -39.2082F, -62.4948F);
		handguard.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.3927F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 328, 567, 2.2071F, -2.5F, -0.5F, 1, 5, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 517, 569, -3.2071F, -2.5F, -0.5F, 1, 5, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handguard.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}