package com.paneedah.mwc.models;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QJY88Handguard extends ModelBase {
	private final ModelRenderer handguard;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;

	public QJY88Handguard() {
		textureWidth = 512;
		textureHeight = 512;

		handguard = new ModelRenderer(this);
		handguard.setRotationPoint(0.0F, 26.0F, 2.0F);
		handguard.cubeList.add(new ModelBox(handguard, 408, 99, -4.0F, -36.5F, -63.0F, 5, 1, 26, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 356, 425, -4.6493F, -41.4289F, -63.0F, 1, 3, 26, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 410, 425, 0.6493F, -41.4289F, -63.0F, 1, 3, 26, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 486, 393, 0.649F, -42.0289F, -45.0F, 1, 1, 8, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 486, 384, -4.649F, -42.0289F, -45.0F, 1, 1, 8, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 448, 502, -4.7493F, -41.3289F, -39.1F, 1, 3, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 70, 484, -4.1F, -36.4F, -39.1F, 3, 1, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 494, 344, -1.9F, -36.399F, -39.1F, 3, 1, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 98, 495, 0.7493F, -41.3289F, -39.1F, 1, 3, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 196, 503, 0.7493F, -41.3289F, -42.1F, 1, 3, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 496, 497, -4.1F, -36.4F, -42.1F, 3, 1, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 502, 464, -4.7493F, -41.3289F, -42.1F, 1, 3, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 344, 497, -1.9F, -36.399F, -42.1F, 3, 1, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 388, 503, -4.7493F, -41.3289F, -45.1F, 1, 3, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 498, 47, -1.9F, -36.399F, -45.1F, 3, 1, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 498, 44, -4.1F, -36.4F, -48.1F, 3, 1, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 498, 41, -4.1F, -36.4F, -45.1F, 3, 1, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 382, 503, -4.7493F, -41.3289F, -48.1F, 1, 3, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 498, -1.9F, -36.399F, -48.1F, 3, 1, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 270, 503, 0.7493F, -41.3289F, -48.1F, 1, 3, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 208, 503, 0.7493F, -41.3289F, -45.1F, 1, 3, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 504, 318, -4.7493F, -41.3289F, -51.1F, 1, 3, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 498, 59, -1.9F, -36.399F, -51.1F, 3, 1, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 498, 56, -4.1F, -36.4F, -54.1F, 3, 1, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 498, 53, -4.1F, -36.4F, -51.1F, 3, 1, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 504, 313, -4.7493F, -41.3289F, -54.1F, 1, 3, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 498, 50, -1.9F, -36.399F, -54.1F, 3, 1, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 92, 504, 0.7493F, -41.3289F, -54.1F, 1, 3, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 86, 504, 0.7493F, -41.3289F, -51.1F, 1, 3, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 504, 389, -4.7493F, -41.3289F, -57.1F, 1, 3, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 498, 71, -1.9F, -36.399F, -57.1F, 3, 1, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 498, 68, -4.1F, -36.4F, -60.1F, 3, 1, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 498, 65, -4.1F, -36.4F, -57.1F, 3, 1, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 504, 384, -4.7493F, -41.3289F, -60.1F, 1, 3, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 498, 62, -1.9F, -36.399F, -60.1F, 3, 1, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 342, 504, 0.7493F, -41.3289F, -60.1F, 1, 3, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 504, 339, 0.7493F, -41.3289F, -57.1F, 1, 3, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 406, 504, -4.7493F, -41.3289F, -63.1F, 1, 3, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 476, 493, -1.9F, -40.399F, -63.1F, 3, 5, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 466, 493, -4.1F, -40.4F, -63.1F, 3, 5, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 400, 504, 0.7493F, -41.3289F, -63.1F, 1, 3, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 252, 38, 0.25F, -39.0F, -44.0F, 1, 6, 3, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 54, 436, -4.25F, -39.0F, -44.0F, 1, 6, 3, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(2.0763F, -35.1836F, -62.1F);
		handguard.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.2182F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 504, 394, -2.0F, -3.0F, -1.0F, 1, 3, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 504, 334, -2.0F, -3.0F, 5.0F, 1, 3, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 348, 504, -2.0F, -3.0F, 2.0F, 1, 3, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 80, 504, -2.0F, -3.0F, 11.0F, 1, 3, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 122, 504, -2.0F, -3.0F, 8.0F, 1, 3, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 202, 503, -2.0F, -3.0F, 17.0F, 1, 3, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 276, 503, -2.0F, -3.0F, 14.0F, 1, 3, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 502, 486, -2.0F, -3.0F, 20.0F, 1, 3, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 264, 501, -2.0F, -3.0F, 23.0F, 1, 3, 2, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.1474F, -35.8329F, -62.1F);
		handguard.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.2182F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 412, 504, -2.0F, -3.0F, -1.0F, 1, 3, 2, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 354, 504, -2.0F, -3.0F, 2.0F, 1, 3, 2, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 394, 504, -2.0F, -3.0F, 5.0F, 1, 3, 2, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 504, 295, -2.0F, -3.0F, 8.0F, 1, 3, 2, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 504, 323, -2.0F, -3.0F, 11.0F, 1, 3, 2, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 376, 503, -2.0F, -3.0F, 14.0F, 1, 3, 2, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 454, 503, -2.0F, -3.0F, 17.0F, 1, 3, 2, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 502, 481, -2.0F, -3.0F, 20.0F, 1, 3, 2, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 442, 501, -2.0F, -3.0F, 23.0F, 1, 3, 2, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(1.9763F, -35.2836F, -38.0F);
		handguard.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.2182F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 302, 425, -2.0F, -3.0F, -25.0F, 1, 3, 26, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-2.0474F, -35.9329F, -38.0F);
		handguard.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.2182F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 248, 425, -2.0F, -3.0F, -25.0F, 1, 3, 26, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.5F, -40.8419F, -48.8524F);
		handguard.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.1745F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 494, 339, 2.149F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 378, 494, -3.149F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));
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