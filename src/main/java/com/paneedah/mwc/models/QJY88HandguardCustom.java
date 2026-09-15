package com.paneedah.mwc.models;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QJY88HandguardCustom extends ModelBase {
	private final ModelRenderer hg_mountdel;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;

	public QJY88HandguardCustom() {
		textureWidth = 512;
		textureHeight = 512;

		hg_mountdel = new ModelRenderer(this);
		hg_mountdel.setRotationPoint(0.0F, 26.0F, 2.0F);
		hg_mountdel.cubeList.add(new ModelBox(hg_mountdel, 0, 409, -4.0F, -36.5F, -63.0F, 5, 1, 26, 0.0F, false));
		hg_mountdel.cubeList.add(new ModelBox(hg_mountdel, 62, 427, -4.6493F, -41.4289F, -63.0F, 1, 3, 26, 0.0F, false));
		hg_mountdel.cubeList.add(new ModelBox(hg_mountdel, 116, 427, 0.6493F, -41.4289F, -63.0F, 1, 3, 26, 0.0F, false));
		hg_mountdel.cubeList.add(new ModelBox(hg_mountdel, 488, 165, 0.649F, -42.0289F, -45.0F, 1, 1, 8, 0.0F, false));
		hg_mountdel.cubeList.add(new ModelBox(hg_mountdel, 294, 488, -4.649F, -42.0289F, -45.0F, 1, 1, 8, 0.0F, false));
		hg_mountdel.cubeList.add(new ModelBox(hg_mountdel, 504, 469, -4.7493F, -41.3289F, -39.1F, 1, 3, 2, 0.0F, false));
		hg_mountdel.cubeList.add(new ModelBox(hg_mountdel, 498, 117, -4.1F, -36.4F, -39.1F, 3, 1, 2, 0.0F, false));
		hg_mountdel.cubeList.add(new ModelBox(hg_mountdel, 498, 120, -1.9F, -36.399F, -39.1F, 3, 1, 2, 0.0F, false));
		hg_mountdel.cubeList.add(new ModelBox(hg_mountdel, 482, 504, 0.7493F, -41.3289F, -39.1F, 1, 3, 2, 0.0F, false));
		hg_mountdel.cubeList.add(new ModelBox(hg_mountdel, 488, 504, 0.7493F, -41.3289F, -42.1F, 1, 3, 2, 0.0F, false));
		hg_mountdel.cubeList.add(new ModelBox(hg_mountdel, 134, 498, -4.1F, -36.4F, -42.1F, 3, 1, 2, 0.0F, false));
		hg_mountdel.cubeList.add(new ModelBox(hg_mountdel, 0, 505, -4.7493F, -41.3289F, -42.1F, 1, 3, 2, 0.0F, false));
		hg_mountdel.cubeList.add(new ModelBox(hg_mountdel, 144, 498, -1.9F, -36.399F, -42.1F, 3, 1, 2, 0.0F, false));
		hg_mountdel.cubeList.add(new ModelBox(hg_mountdel, 12, 505, -4.7493F, -41.3289F, -45.1F, 1, 3, 2, 0.0F, false));
		hg_mountdel.cubeList.add(new ModelBox(hg_mountdel, 154, 498, -1.9F, -36.399F, -45.1F, 3, 1, 2, 0.0F, false));
		hg_mountdel.cubeList.add(new ModelBox(hg_mountdel, 164, 498, -4.1F, -36.4F, -48.1F, 3, 1, 2, 0.0F, false));
		hg_mountdel.cubeList.add(new ModelBox(hg_mountdel, 226, 498, -4.1F, -36.4F, -45.1F, 3, 1, 2, 0.0F, false));
		hg_mountdel.cubeList.add(new ModelBox(hg_mountdel, 18, 505, -4.7493F, -41.3289F, -48.1F, 1, 3, 2, 0.0F, false));
		hg_mountdel.cubeList.add(new ModelBox(hg_mountdel, 236, 498, -1.9F, -36.399F, -48.1F, 3, 1, 2, 0.0F, false));
		hg_mountdel.cubeList.add(new ModelBox(hg_mountdel, 36, 505, 0.7493F, -41.3289F, -48.1F, 1, 3, 2, 0.0F, false));
		hg_mountdel.cubeList.add(new ModelBox(hg_mountdel, 42, 505, 0.7493F, -41.3289F, -45.1F, 1, 3, 2, 0.0F, false));
		hg_mountdel.cubeList.add(new ModelBox(hg_mountdel, 60, 505, -4.7493F, -41.3289F, -51.1F, 1, 3, 2, 0.0F, false));
		hg_mountdel.cubeList.add(new ModelBox(hg_mountdel, 246, 498, -1.9F, -36.399F, -51.1F, 3, 1, 2, 0.0F, false));
		hg_mountdel.cubeList.add(new ModelBox(hg_mountdel, 498, 402, -4.1F, -36.4F, -54.1F, 3, 1, 2, 0.0F, false));
		hg_mountdel.cubeList.add(new ModelBox(hg_mountdel, 498, 405, -4.1F, -36.4F, -51.1F, 3, 1, 2, 0.0F, false));
		hg_mountdel.cubeList.add(new ModelBox(hg_mountdel, 66, 505, -4.7493F, -41.3289F, -54.1F, 1, 3, 2, 0.0F, false));
		hg_mountdel.cubeList.add(new ModelBox(hg_mountdel, 418, 498, -1.9F, -36.399F, -54.1F, 3, 1, 2, 0.0F, false));
		hg_mountdel.cubeList.add(new ModelBox(hg_mountdel, 104, 505, 0.7493F, -41.3289F, -54.1F, 1, 3, 2, 0.0F, false));
		hg_mountdel.cubeList.add(new ModelBox(hg_mountdel, 110, 505, 0.7493F, -41.3289F, -51.1F, 1, 3, 2, 0.0F, false));
		hg_mountdel.cubeList.add(new ModelBox(hg_mountdel, 134, 505, -4.7493F, -41.3289F, -57.1F, 1, 3, 2, 0.0F, false));
		hg_mountdel.cubeList.add(new ModelBox(hg_mountdel, 428, 498, -1.9F, -36.399F, -57.1F, 3, 1, 2, 0.0F, false));
		hg_mountdel.cubeList.add(new ModelBox(hg_mountdel, 438, 498, -4.1F, -36.4F, -60.1F, 3, 1, 2, 0.0F, false));
		hg_mountdel.cubeList.add(new ModelBox(hg_mountdel, 498, 450, -4.1F, -36.4F, -57.1F, 3, 1, 2, 0.0F, false));
		hg_mountdel.cubeList.add(new ModelBox(hg_mountdel, 140, 505, -4.7493F, -41.3289F, -60.1F, 1, 3, 2, 0.0F, false));
		hg_mountdel.cubeList.add(new ModelBox(hg_mountdel, 498, 453, -1.9F, -36.399F, -60.1F, 3, 1, 2, 0.0F, false));
		hg_mountdel.cubeList.add(new ModelBox(hg_mountdel, 158, 505, 0.7493F, -41.3289F, -60.1F, 1, 3, 2, 0.0F, false));
		hg_mountdel.cubeList.add(new ModelBox(hg_mountdel, 164, 505, 0.7493F, -41.3289F, -57.1F, 1, 3, 2, 0.0F, false));
		hg_mountdel.cubeList.add(new ModelBox(hg_mountdel, 182, 505, -4.7493F, -41.3289F, -63.1F, 1, 3, 2, 0.0F, false));
		hg_mountdel.cubeList.add(new ModelBox(hg_mountdel, 104, 494, -1.9F, -40.399F, -63.1F, 3, 5, 2, 0.0F, false));
		hg_mountdel.cubeList.add(new ModelBox(hg_mountdel, 114, 494, -4.1F, -40.4F, -63.1F, 3, 5, 2, 0.0F, false));
		hg_mountdel.cubeList.add(new ModelBox(hg_mountdel, 188, 505, 0.7493F, -41.3289F, -63.1F, 1, 3, 2, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(2.0763F, -35.1836F, -62.1F);
		hg_mountdel.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.2182F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 214, 505, -2.0F, -3.0F, -1.0F, 1, 3, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 170, 505, -2.0F, -3.0F, 5.0F, 1, 3, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 152, 505, -2.0F, -3.0F, 2.0F, 1, 3, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 116, 505, -2.0F, -3.0F, 11.0F, 1, 3, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 98, 505, -2.0F, -3.0F, 8.0F, 1, 3, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 48, 505, -2.0F, -3.0F, 17.0F, 1, 3, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 30, 505, -2.0F, -3.0F, 14.0F, 1, 3, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 494, 504, -2.0F, -3.0F, 20.0F, 1, 3, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 476, 504, -2.0F, -3.0F, 23.0F, 1, 3, 2, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.1474F, -35.8329F, -62.1F);
		hg_mountdel.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.2182F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 176, 505, -2.0F, -3.0F, -1.0F, 1, 3, 2, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 146, 505, -2.0F, -3.0F, 2.0F, 1, 3, 2, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 128, 505, -2.0F, -3.0F, 5.0F, 1, 3, 2, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 72, 505, -2.0F, -3.0F, 8.0F, 1, 3, 2, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 54, 505, -2.0F, -3.0F, 11.0F, 1, 3, 2, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 24, 505, -2.0F, -3.0F, 14.0F, 1, 3, 2, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 6, 505, -2.0F, -3.0F, 17.0F, 1, 3, 2, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 500, 504, -2.0F, -3.0F, 20.0F, 1, 3, 2, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 504, 474, -2.0F, -3.0F, 23.0F, 1, 3, 2, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(1.9763F, -35.2836F, -38.0F);
		hg_mountdel.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.2182F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 440, 318, -2.0F, -3.0F, -25.0F, 1, 3, 26, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-2.0474F, -35.9329F, -38.0F);
		hg_mountdel.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.2182F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 436, -2.0F, -3.0F, -25.0F, 1, 3, 26, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.5F, -40.8419F, -48.8524F);
		hg_mountdel.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.1745F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 360, 496, 2.149F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 260, 496, -3.149F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		hg_mountdel.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}