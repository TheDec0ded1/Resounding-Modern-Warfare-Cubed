package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Mk11Frontsight extends ModelBase {
	private final ModelRenderer frontsightMk11;
	private final ModelRenderer cube_r1;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;

	public Mk11Frontsight() {
		textureWidth = 544;
		textureHeight = 544;

		frontsightMk11 = new ModelRenderer(this);
		frontsightMk11.setRotationPoint(0.0F, 24.0F, 0.0F);
		frontsightMk11.cubeList.add(new ModelBox(frontsightMk11, 68, 522, -0.5F, -41.5F, -70.65F, 1, 1, 1, -0.1F, false));
		frontsightMk11.cubeList.add(new ModelBox(frontsightMk11, 358, 510, -1.0F, -41.5F, -71.15F, 1, 1, 2, 0.0F, false));
		frontsightMk11.cubeList.add(new ModelBox(frontsightMk11, 470, 158, -2.8F, -41.5F, -72.15F, 2, 1, 3, 0.0F, false));
		frontsightMk11.cubeList.add(new ModelBox(frontsightMk11, 504, 197, -2.5F, -42.0F, -71.4F, 2, 1, 2, 0.0F, false));
		frontsightMk11.cubeList.add(new ModelBox(frontsightMk11, 80, 522, -2.0F, -42.6F, -70.15F, 1, 1, 1, -0.25F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.5F, -40.9393F, -71.7536F);
		frontsightMk11.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.7854F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 482, 514, -1.0F, -0.5F, 0.0F, 2, 1, 1, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-1.5F, -41.8717F, -71.5467F);
		frontsightMk11.addChild(bone2);
		setRotationAngle(bone2, 1.5708F, 0.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 220, 512, -0.5F, -0.4283F, 3.1467F, 1, 1, 2, -0.4F, false));
		bone2.cubeList.add(new ModelBox(bone2, 208, 512, 0.1F, -0.5212F, 3.6467F, 1, 1, 2, -0.35F, false));
		bone2.cubeList.add(new ModelBox(bone2, 202, 512, 0.1F, -0.3212F, 3.6467F, 1, 1, 2, -0.35F, false));
		bone2.cubeList.add(new ModelBox(bone2, 512, 200, -1.1F, -0.5212F, 3.6467F, 1, 1, 2, -0.35F, false));
		bone2.cubeList.add(new ModelBox(bone2, 214, 512, -1.1F, -0.3212F, 3.6467F, 1, 1, 2, -0.35F, false));
		bone2.cubeList.add(new ModelBox(bone2, 504, 364, -1.0F, -0.4212F, 2.2467F, 2, 1, 2, -0.25F, false));
		bone2.cubeList.add(new ModelBox(bone2, 380, 511, 0.1F, -0.7283F, 0.8467F, 1, 1, 2, -0.35F, false));
		bone2.cubeList.add(new ModelBox(bone2, 510, 367, -1.1F, -0.5283F, 0.8467F, 1, 1, 2, -0.35F, false));
		bone2.cubeList.add(new ModelBox(bone2, 512, 197, -1.1F, -0.7283F, 0.8467F, 1, 1, 2, -0.35F, false));
		bone2.cubeList.add(new ModelBox(bone2, 504, 200, -1.0F, -0.6283F, -0.2533F, 2, 1, 2, -0.25F, false));
		bone2.cubeList.add(new ModelBox(bone2, 500, 514, -1.0F, -0.2748F, -0.6069F, 2, 1, 1, -0.25F, false));
		bone2.cubeList.add(new ModelBox(bone2, 364, 510, 0.1F, -0.5283F, 0.8467F, 1, 1, 2, -0.35F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, -0.0015F, 0.0199F);
		bone2.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.7854F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 494, 514, -1.0F, -0.5328F, -0.5F, 2, 1, 1, -0.25F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, -0.0015F, 0.0199F);
		bone2.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.7854F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 488, 514, -1.0F, -2.2678F, 1.2349F, 2, 1, 1, -0.25F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		frontsightMk11.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}