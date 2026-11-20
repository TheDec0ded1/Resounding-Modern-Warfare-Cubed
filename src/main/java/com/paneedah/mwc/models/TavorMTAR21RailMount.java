package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class TavorMTAR21RailMount extends ModelBase {
	private final ModelRenderer railedupper;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r50;
	private final ModelRenderer cube_r51;

	public TavorMTAR21RailMount() {
		textureWidth = 320;
		textureHeight = 320;

		railedupper = new ModelRenderer(this);
		railedupper.setRotationPoint(0.0F, 23.75F, 0.0F);
		railedupper.cubeList.add(new ModelBox(railedupper, 120, 176, -3.5F, -40.2F, -13.15F, 4, 1, 23, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.5613F, -40.2347F, 2.35F);
		railedupper.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.2618F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 228, 113, 1.0F, -0.5F, -14.5F, 1, 1, 22, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.4387F, -40.2347F, 2.35F);
		railedupper.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.2618F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 226, 168, -2.0F, -0.5F, -14.5F, 1, 1, 22, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-0.7F, -42.5F, -34.75F);
		railedupper.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 298, 208, -1.8F, 0.475F, 22.35F, 2, 1, 2, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 300, 71, -1.8F, 0.475F, 24.6F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 300, 94, -1.8F, 0.475F, 25.85F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 300, 96, -1.8F, 0.475F, 27.1F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 300, 98, -1.8F, 0.475F, 28.35F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 300, 100, -1.8F, 0.475F, 29.6F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 300, 102, -1.8F, 0.475F, 30.85F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 300, 104, -1.8F, 0.475F, 32.1F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 300, 106, -1.8F, 0.475F, 33.35F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 300, 108, -1.8F, 0.475F, 34.6F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 300, 125, -1.8F, 0.475F, 35.85F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 300, 127, -1.8F, 0.475F, 37.1F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 100, 301, -1.8F, 0.475F, 38.35F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 300, 129, -1.8F, 0.475F, 39.6F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 300, 131, -1.8F, 0.475F, 40.85F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 300, 133, -1.8F, 0.475F, 42.1F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 300, 135, -1.8F, 0.475F, 43.35F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 136, 300, -1.8F, 0.475F, 43.75F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 216, 222, -1.7F, 1.075F, 22.55F, 2, 2, 22, -0.001F, false));
		bone3.cubeList.add(new ModelBox(bone3, 224, 89, -1.9F, 1.075F, 22.55F, 1, 2, 22, 0.0F, false));

		cube_r50 = new ModelRenderer(this);
		cube_r50.setRotationPoint(-1.6F, 0.0F, -1.25F);
		bone3.addChild(cube_r50);
		setRotationAngle(cube_r50, 0.0F, 0.0F, 0.8901F);
		cube_r50.cubeList.add(new ModelBox(cube_r50, 112, 224, 0.2746F, 0.3748F, 24.0F, 1, 1, 22, -0.35F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 302, 24, 0.3246F, 0.2248F, 45.0F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 302, 26, 0.3246F, 0.2248F, 44.6F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 302, 28, 0.3246F, 0.2248F, 43.35F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 302, 30, 0.3246F, 0.2248F, 42.1F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 302, 32, 0.3246F, 0.2248F, 40.85F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 304, 274, 0.3246F, 0.2248F, 39.6F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 302, 34, 0.3246F, 0.2248F, 38.35F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 88, 302, 0.3246F, 0.2248F, 37.1F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 92, 302, 0.3246F, 0.2248F, 35.85F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 96, 302, 0.3246F, 0.2248F, 34.6F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 118, 302, 0.3246F, 0.2248F, 33.35F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 122, 302, 0.3246F, 0.2248F, 32.1F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 126, 302, 0.3246F, 0.2248F, 30.85F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 130, 302, 0.3246F, 0.2248F, 29.6F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 134, 302, 0.3246F, 0.2248F, 28.35F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 138, 302, 0.3246F, 0.2248F, 27.1F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 304, 48, 0.3246F, 0.2248F, 25.85F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 300, 82, 0.3246F, 0.2248F, 23.6F, 1, 1, 2, -0.198F, false));

		cube_r51 = new ModelRenderer(this);
		cube_r51.setRotationPoint(0.0F, 0.0F, -1.25F);
		bone3.addChild(cube_r51);
		setRotationAngle(cube_r51, 0.0F, 0.0F, -0.8901F);
		cube_r51.cubeList.add(new ModelBox(cube_r51, 226, 145, -1.2746F, 0.3748F, 24.0F, 1, 1, 22, -0.35F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 142, 302, -1.3246F, 0.2248F, 45.0F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 146, 302, -1.3246F, 0.2248F, 44.6F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 150, 302, -1.3246F, 0.2248F, 43.35F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 154, 302, -1.3246F, 0.2248F, 42.1F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 158, 302, -1.3246F, 0.2248F, 40.85F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 304, 272, -1.3246F, 0.2248F, 39.6F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 162, 302, -1.3246F, 0.2248F, 38.35F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 166, 302, -1.3246F, 0.2248F, 37.1F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 170, 302, -1.3246F, 0.2248F, 35.85F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 190, 302, -1.3246F, 0.2248F, 34.6F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 194, 302, -1.3246F, 0.2248F, 33.35F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 208, 302, -1.3246F, 0.2248F, 32.1F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 212, 302, -1.3246F, 0.2248F, 30.85F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 216, 302, -1.3246F, 0.2248F, 29.6F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 220, 302, -1.3246F, 0.2248F, 28.35F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 224, 302, -1.3246F, 0.2248F, 27.1F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 228, 302, -1.3246F, 0.2248F, 25.85F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 300, 85, -1.3246F, 0.2248F, 23.6F, 1, 1, 2, -0.198F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		railedupper.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}