package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBU88Magazine extends ModelBase {
	private final ModelRenderer magazine;
	private final ModelRenderer magazine_r1;
	private final ModelRenderer magazine_r2;
	private final ModelRenderer magazine_r3;
	private final ModelRenderer magazine_r4;
	private final ModelRenderer feedlip;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r8;

	public QBU88Magazine() {
		textureWidth = 576;
		textureHeight = 576;

		magazine = new ModelRenderer(this);
		magazine.setRotationPoint(-1.5F, -5.7F, 13.0F);
		magazine.cubeList.add(new ModelBox(magazine, 240, 419, -2.0F, -3.8F, 3.0F, 4, 11, 8, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 27, 524, -2.25F, -3.8F, 3.0F, 1, 4, 8, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 133, 526, 1.25F, -3.8F, 3.0F, 1, 4, 8, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 273, 526, -2.75F, 0.8F, 5.0F, 4, 8, 2, -0.4F, false));
		magazine.cubeList.add(new ModelBox(magazine, 286, 526, -2.75F, 0.4F, 3.0F, 4, 8, 2, -0.4F, false));
		magazine.cubeList.add(new ModelBox(magazine, 325, 526, -1.25F, 0.4F, 3.0F, 4, 8, 2, -0.4F, false));
		magazine.cubeList.add(new ModelBox(magazine, 312, 526, -1.25F, 0.8F, 5.0F, 4, 8, 2, -0.4F, false));
		magazine.cubeList.add(new ModelBox(magazine, 351, 526, -2.75F, 1.2F, 7.0F, 4, 8, 2, -0.4F, false));
		magazine.cubeList.add(new ModelBox(magazine, 338, 526, -1.25F, 1.2F, 7.0F, 4, 8, 2, -0.4F, false));
		magazine.cubeList.add(new ModelBox(magazine, 243, 526, -2.0F, 7.2F, 7.0F, 4, 2, 4, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 429, 134, -2.0F, 7.3F, 3.0F, 4, 1, 4, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 446, 134, -2.0F, 6.8F, 3.0F, 4, 1, 4, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 493, 538, -1.0F, -2.8F, 10.0F, 2, 1, 2, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 506, 396, -2.0F, -3.8F, 0.0F, 4, 11, 2, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 451, 416, -2.0F, -4.0F, 1.4F, 4, 13, 2, -0.2F, false));
		magazine.cubeList.add(new ModelBox(magazine, 527, 328, -2.0F, -4.0F, -0.6F, 4, 3, 2, -0.2F, false));
		magazine.cubeList.add(new ModelBox(magazine, 527, 294, -2.0F, -4.0F, 9.4F, 4, 5, 2, -0.2F, false));

		magazine_r1 = new ModelRenderer(this);
		magazine_r1.setRotationPoint(0.0F, 12.4052F, 0.0466F);
		magazine.addChild(magazine_r1);
		setRotationAngle(magazine_r1, -0.2182F, 0.0F, 0.0F);
		magazine_r1.cubeList.add(new ModelBox(magazine_r1, 512, 523, -2.0F, -4.7F, -1.1F, 4, 1, 11, 0.2F, false));
		magazine_r1.cubeList.add(new ModelBox(magazine_r1, 490, 50, -2.0F, -5.5F, 2.0F, 4, 1, 8, 0.0F, false));

		magazine_r2 = new ModelRenderer(this);
		magazine_r2.setRotationPoint(0.0F, 12.3532F, -0.1667F);
		magazine.addChild(magazine_r2);
		setRotationAngle(magazine_r2, -0.2182F, 0.0F, 0.0F);
		magazine_r2.cubeList.add(new ModelBox(magazine_r2, 529, 267, -2.0F, -5.5F, -1.0F, 4, 1, 2, 0.0F, false));

		magazine_r3 = new ModelRenderer(this);
		magazine_r3.setRotationPoint(0.0F, -2.5283F, 10.9155F);
		magazine.addChild(magazine_r3);
		setRotationAngle(magazine_r3, -0.2182F, 0.0F, 0.0F);
		magazine_r3.cubeList.add(new ModelBox(magazine_r3, 539, 94, -1.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

		magazine_r4 = new ModelRenderer(this);
		magazine_r4.setRotationPoint(0.0F, -2.0717F, 10.9155F);
		magazine.addChild(magazine_r4);
		setRotationAngle(magazine_r4, 0.2182F, 0.0F, 0.0F);
		magazine_r4.cubeList.add(new ModelBox(magazine_r4, 539, 90, -1.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

		feedlip = new ModelRenderer(this);
		feedlip.setRotationPoint(1.0F, 29.2F, 3.0F);
		magazine.addChild(feedlip);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.2929F, -32.2929F, 7.0F);
		feedlip.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 171, 526, 0.0F, -1.0F, -7.0F, 1, 1, 8, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.2929F, -32.2929F, 7.0F);
		feedlip.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 190, 526, 0.0F, -1.0F, -7.0F, 1, 1, 8, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		magazine.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}