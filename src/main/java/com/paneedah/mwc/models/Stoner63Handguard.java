package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Stoner63Handguard extends ModelBase {
	private final ModelRenderer handguard;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;

	public Stoner63Handguard() {
		textureWidth = 576;
		textureHeight = 576;

		handguard = new ModelRenderer(this);
		handguard.setRotationPoint(0.0F, 27.0F, 2.0F);
		handguard.cubeList.add(new ModelBox(handguard, 457, 353, -4.0F, -38.0F, -62.0F, 5, 2, 24, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 445, 551, -4.0F, -37.7071F, -62.7071F, 5, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 458, 551, -4.0F, -37.7071F, -38.2929F, 5, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 260, 330, 0.7071F, -40.7071F, -62.0F, 1, 4, 24, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 67, 461, -4.7071F, -40.7071F, -62.0F, 1, 4, 24, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-4.7071F, -34.5858F, -51.0F);
		handguard.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 496, 130, 1.5F, -1.5F, -11.0F, 1, 1, 24, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.7071F, -37.4142F, -51.0F);
		handguard.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 496, 104, -1.5F, -0.5F, -11.0F, 1, 1, 24, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(1.0F, -40.7071F, -50.0F);
		handguard.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.7854F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 308, 502, -0.5F, -0.5F, -12.0F, 1, 1, 24, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-4.0F, -40.7071F, -50.0F);
		handguard.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 257, 502, -0.5F, -0.5F, -12.0F, 1, 1, 24, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-3.9858F, -38.7071F, -62.0F);
		handguard.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.7854F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 434, 556, -0.5F, -2.0F, -0.5F, 1, 4, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-3.9858F, -38.7071F, -38.0F);
		handguard.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.7854F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 439, 556, -0.5F, -2.0F, -0.5F, 1, 4, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(1.0F, -38.7071F, -62.0F);
		handguard.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.7854F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 77, 556, -0.5F, -2.0F, -0.5F, 1, 4, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(1.0F, -38.7071F, -38.0F);
		handguard.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.7854F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 512, 555, -0.5F, -2.0F, -0.5F, 1, 4, 1, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-2.0F, -17.6152F, -80.3848F);
		handguard.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.7854F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 551, 275, -2.0F, -1.0F, 26.0F, 5, 1, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-2.0F, -17.6152F, -56.3848F);
		handguard.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.7854F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 550, 502, -2.0F, -1.0F, 26.0F, 5, 1, 1, 0.0F, false));
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