package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FALhandguardT48 extends ModelBase {
	private final ModelRenderer handguardT48;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;

	public FALhandguardT48() {
		textureWidth = 384;
		textureHeight = 384;

		handguardT48 = new ModelRenderer(this);
		handguardT48.setRotationPoint(-1.499F, -16.8813F, -52.45F);
		handguardT48.cubeList.add(new ModelBox(handguardT48, 74, 227, -3.4438F, 2.0476F, 1.25F, 1, 3, 1, 0.0F, false));
		handguardT48.cubeList.add(new ModelBox(handguardT48, 302, 56, -1.5225F, 6.5189F, 1.25F, 3, 1, 20, 0.0F, false));
		handguardT48.cubeList.add(new ModelBox(handguardT48, 74, 231, 2.4438F, 2.0476F, 1.25F, 1, 3, 1, 0.0F, false));
		handguardT48.cubeList.add(new ModelBox(handguardT48, 36, 343, -3.1438F, 2.1476F, -13.75F, 1, 3, 15, 0.0F, false));
		handguardT48.cubeList.add(new ModelBox(handguardT48, 68, 343, 2.0988F, 2.1476F, -13.75F, 1, 3, 15, 0.0F, false));
		handguardT48.cubeList.add(new ModelBox(handguardT48, 346, 77, -1.0225F, 6.2689F, -13.75F, 2, 1, 15, 0.0F, false));
		handguardT48.cubeList.add(new ModelBox(handguardT48, 100, 365, 2.4438F, 4.3976F, 1.25F, 1, 1, 1, 0.0F, false));
		handguardT48.cubeList.add(new ModelBox(handguardT48, 104, 365, -3.4438F, 4.3976F, 1.25F, 1, 1, 1, 0.0F, false));
		handguardT48.cubeList.add(new ModelBox(handguardT48, 108, 334, -3.4438F, 2.0476F, -17.75F, 1, 3, 4, 0.0F, false));
		handguardT48.cubeList.add(new ModelBox(handguardT48, 120, 358, -3.4438F, 4.3976F, -17.75F, 1, 1, 4, 0.0F, false));
		handguardT48.cubeList.add(new ModelBox(handguardT48, 266, 33, -1.5225F, 6.5189F, -17.75F, 3, 1, 4, 0.0F, false));
		handguardT48.cubeList.add(new ModelBox(handguardT48, 130, 358, 2.4438F, 4.3976F, -17.75F, 1, 1, 4, 0.0F, false));
		handguardT48.cubeList.add(new ModelBox(handguardT48, 100, 358, 2.4438F, 2.0476F, -17.75F, 1, 3, 4, 0.0F, false));
		handguardT48.cubeList.add(new ModelBox(handguardT48, 346, 142, 2.4438F, 4.3976F, 19.25F, 1, 1, 2, 0.0F, false));
		handguardT48.cubeList.add(new ModelBox(handguardT48, 184, 356, -3.4438F, 4.3976F, 19.25F, 1, 1, 2, 0.0F, false));
		handguardT48.cubeList.add(new ModelBox(handguardT48, 342, 189, -3.4438F, 2.0476F, 19.25F, 1, 3, 2, 0.0F, false));
		handguardT48.cubeList.add(new ModelBox(handguardT48, 30, 357, 2.4438F, 2.0476F, 19.25F, 1, 3, 2, 0.0F, false));
		handguardT48.cubeList.add(new ModelBox(handguardT48, 310, 331, 2.4438F, 2.0476F, 2.25F, 1, 1, 17, 0.0F, false));
		handguardT48.cubeList.add(new ModelBox(handguardT48, 166, 298, 2.1938F, 2.5476F, 2.25F, 1, 3, 17, 0.0F, false));
		handguardT48.cubeList.add(new ModelBox(handguardT48, 154, 338, -3.4438F, 2.0476F, 2.25F, 1, 1, 17, 0.0F, false));
		handguardT48.cubeList.add(new ModelBox(handguardT48, 166, 318, -3.1938F, 2.5476F, 2.25F, 1, 3, 17, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(9.8078F, -0.9663F, 20.25F);
		handguardT48.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 216, 359, -1.0F, 9.0F, -1.0F, 1, 3, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 357, -1.0F, 9.0F, -38.0F, 1, 3, 4, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 202, 322, -1.25F, 10.0F, -18.0F, 1, 2, 17, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 238, 340, -1.0F, 9.0F, -18.0F, 1, 1, 17, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 298, 138, -1.0F, 9.0F, -19.0F, 1, 3, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(2.0296F, 2.0476F, 20.25F);
		handguardT48.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 190, 338, -2.0F, -1.0F, -1.0F, 3, 1, 2, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 280, 33, -1.0F, -1.0F, -38.0F, 2, 1, 4, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 236, 138, -1.0F, -0.75F, -18.0F, 2, 1, 17, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 328, 251, -2.0F, -1.0F, -18.0F, 1, 1, 17, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 360, 357, -2.0F, -1.0F, -19.0F, 3, 1, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(5.7486F, -0.9663F, 20.25F);
		handguardT48.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.7854F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 36, 322, -2.0F, 10.0F, -1.0F, 3, 1, 2, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 208, 257, -2.0F, 10.0F, -38.0F, 3, 1, 4, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 318, 313, -1.0F, 9.75F, -18.0F, 2, 1, 17, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 274, 340, -2.0F, 10.0F, -18.0F, 1, 1, 17, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 360, 359, -2.0F, 10.0F, -19.0F, 3, 1, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-2.0296F, 2.0476F, 20.25F);
		handguardT48.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 202, 287, -1.0F, -2.0F, -1.0F, 1, 3, 2, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 350, 287, -1.0F, -1.0F, -38.0F, 1, 2, 4, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 118, 322, -0.75F, -1.0F, -18.0F, 1, 2, 17, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 328, 269, -1.0F, -2.0F, -18.0F, 1, 1, 17, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 74, 223, -1.0F, -2.0F, -19.0F, 1, 3, 1, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.7296F, 2.1476F, 1.25F);
		handguardT48.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.7854F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 346, 109, -1.0F, -1.0F, -15.0F, 1, 2, 15, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(1.6846F, 2.1476F, 1.25F);
		handguardT48.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 346, 93, -1.0F, -1.0F, -15.0F, 2, 1, 15, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(1.6846F, 6.5618F, 1.25F);
		handguardT48.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 190, 341, -1.0F, -2.0F, -15.0F, 1, 3, 15, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-1.7296F, 6.5618F, 1.25F);
		handguardT48.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 341, -2.0F, -1.0F, -15.0F, 3, 1, 15, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handguardT48.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}