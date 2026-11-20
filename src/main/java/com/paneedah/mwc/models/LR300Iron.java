package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class LR300Iron extends ModelBase {
	private final ModelRenderer sight1;
	private final ModelRenderer sight6;
	private final ModelRenderer sight7;
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;

	public LR300Iron() {
		textureWidth = 128;
		textureHeight = 64;

		sight1 = new ModelRenderer(this);
		sight1.setRotationPoint(0.0F, 0.0F, 0.0F);
		sight1.cubeList.add(new ModelBox(sight1, -1, -1, 0.0F, 0.0F, 2.0F, 3, 1, 3, 0.0F, true));

		sight6 = new ModelRenderer(this);
		sight6.setRotationPoint(1.0F, -1.5F, 0.0F);
		sight6.cubeList.add(new ModelBox(sight6, 0, 0, 0.0F, 0.0F, 2.0F, 1, 2, 1, 0.0F, true));

		sight7 = new ModelRenderer(this);
		sight7.setRotationPoint(0.0F, 0.5F, 0.0F);
		sight7.cubeList.add(new ModelBox(sight7, 0, 0, 0.0F, 0.5F, 2.0F, 3, 3, 2, 0.0F, true));

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -0.5F, -27.0F, 2.0F, 1, 7, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 2.5F, -27.0F, 2.0F, 1, 7, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 8, 19, -0.5F, -21.8038F, 2.0F, 4, 6, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 9, 20, -0.5F, -21.3618F, 4.0521F, 4, 5, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 9, 20, -0.5F, -16.8118F, 4.0521F, 4, 1, 2, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.5F, -23.5F, 3.0F);
		bb_main.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.5236F, 0.0F, 0.0F);
		

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.5F, -23.4689F, 2.884F);
		bb_main.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.3491F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -1.5F, 1.0635F, 0.2564F, 3, 2, 2, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -2.0F, -2.9365F, 0.2564F, 1, 6, 2, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, 1.0F, -2.9365F, 0.2564F, 1, 6, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		sight1.render(f5);
		sight6.render(f5);
		sight7.render(f5);
		bb_main.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}