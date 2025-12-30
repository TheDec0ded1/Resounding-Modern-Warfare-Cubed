package com.paneedah.mwc.models;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBU191Upper extends ModelBase {
	private final ModelRenderer upper;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r50;
	private final ModelRenderer cube_r51;

	public QBU191Upper() {
		textureWidth = 416;
		textureHeight = 416;

		upper = new ModelRenderer(this);
		upper.setRotationPoint(-1.0078F, -11.9659F, -2.0F);
		upper.cubeList.add(new ModelBox(upper, 402, 71, 1.0176F, -1.0F, -2.0F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 106, 390, -0.6061F, -4.3374F, -2.0F, 2, 3, 3, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 258, 396, -2.6763F, -5.748F, -1.4477F, 1, 2, 2, -0.3F, false));
		upper.cubeList.add(new ModelBox(upper, 396, 288, 0.6939F, -5.748F, -1.4477F, 1, 2, 2, -0.3F, false));
		upper.cubeList.add(new ModelBox(upper, 388, 26, -2.5061F, -3.8481F, -0.1477F, 4, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 388, 24, -2.7061F, -5.3481F, -0.8477F, 5, 1, 1, -0.1F, false));
		upper.cubeList.add(new ModelBox(upper, 116, 390, -2.3763F, -4.3374F, -2.0F, 2, 3, 3, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 290, 402, -3.0F, -1.0F, -2.0F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 276, 353, 0.7588F, -1.0341F, -27.6F, 1, 1, 26, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 396, 367, 0.7588F, -0.0341F, -27.6F, 1, 2, 2, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 208, 381, -2.7412F, -1.0341F, -16.0F, 1, 1, 14, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 324, 395, -2.7412F, -1.0341F, -27.6F, 1, 3, 2, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 332, 28, -2.9412F, -0.8341F, -25.8F, 1, 1, 10, -0.2F, false));
		upper.cubeList.add(new ModelBox(upper, 136, 390, -3.1412F, 0.783F, -27.8313F, 1, 1, 4, -0.2F, false));
		upper.cubeList.add(new ModelBox(upper, 138, 400, -3.1412F, -0.817F, -27.8313F, 1, 2, 1, -0.2F, false));
		upper.cubeList.add(new ModelBox(upper, 222, 326, -3.3412F, -0.917F, -27.9313F, 1, 1, 13, -0.3F, false));
		upper.cubeList.add(new ModelBox(upper, 246, 402, -3.1412F, -1.517F, -16.1313F, 1, 1, 1, -0.1F, false));
		upper.cubeList.add(new ModelBox(upper, 250, 402, -1.9251F, -2.8441F, -16.1313F, 1, 1, 1, -0.1F, false));
		upper.cubeList.add(new ModelBox(upper, 56, 340, 1.2588F, -1.8341F, -24.0F, 1, 2, 7, -0.2F, false));
		upper.cubeList.add(new ModelBox(upper, 254, 402, 1.3F, -1.2F, -22.6F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 258, 402, 1.3F, -1.2F, -19.5F, 1, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.9446F, -1.4376F, -20.0F);
		upper.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.9599F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 74, 294, -1.0F, -2.0F, -4.0F, 2, 3, 7, -0.2F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.476F, -1.4416F, -15.6313F);
		upper.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.7418F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 142, 400, -0.5F, -1.5F, -0.5F, 1, 2, 1, -0.1F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-2.7412F, -1.0341F, -2.6F);
		upper.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.8727F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 396, 371, 0.0F, -2.0F, -25.0F, 1, 2, 2, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 380, 379, 0.0F, -2.0F, -13.4F, 1, 2, 14, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(1.116F, -0.268F, -1.6F);
		upper.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.8727F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 222, 353, 0.0F, -2.0F, -26.0F, 1, 2, 26, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-3.0F, -1.0F, -1.0F);
		upper.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.3491F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 400, 175, 0.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(1.0779F, -0.658F, -1.0F);
		upper.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.3491F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 134, 400, 0.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-2.6763F, -5.0219F, -0.5924F);
		upper.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.6545F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 252, 396, 0.0F, -0.3F, -1.0F, 1, 2, 2, -0.3F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 246, 396, 3.3702F, -0.3F, -1.0F, 1, 2, 2, -0.3F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.3078F, -4.5091F, -50.45F);
		upper.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 400, 16, -1.8F, 0.1F, 22.9F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 18, 400, -1.8F, 0.1F, 22.65F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 400, 18, -1.8F, 0.1F, 23.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 400, 20, -1.8F, 0.1F, 24.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 400, 22, -1.8F, 0.1F, 25.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 400, 24, -1.8F, 0.1F, 27.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 38, 400, -1.8F, 0.1F, 28.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 44, 400, -1.8F, 0.1F, 29.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 50, 400, -1.8F, 0.1F, 30.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 56, 400, -1.8F, 0.1F, 32.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 62, 400, -1.8F, 0.1F, 33.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 68, 400, -1.8F, 0.1F, 34.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 116, 400, -1.8F, 0.1F, 35.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 74, 400, -1.8F, 0.1F, 37.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 80, 400, -1.8F, 0.1F, 38.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 86, 400, -1.8F, 0.1F, 39.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 92, 400, -1.8F, 0.1F, 40.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 98, 400, -1.8F, 0.1F, 42.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 400, 101, -1.8F, 0.1F, 43.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 400, 103, -1.8F, 0.1F, 44.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 104, 400, -1.8F, 0.1F, 45.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 328, 137, -1.45F, 0.7F, 22.85F, 1, 1, 27, -0.001F, false));
		bone3.cubeList.add(new ModelBox(bone3, 328, 108, -0.7F, 0.7F, 22.85F, 1, 2, 27, -0.001F, false));
		bone3.cubeList.add(new ModelBox(bone3, 328, 165, -1.9F, 0.7F, 22.85F, 1, 1, 27, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 276, 380, -1.9F, 1.7F, 34.45F, 1, 1, 16, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 398, 32, -1.9F, 1.7F, 22.85F, 1, 1, 2, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 126, 390, -1.9F, 0.3F, 46.6F, 1, 1, 4, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 380, 311, -1.7F, 0.3F, 46.6F, 2, 1, 4, -0.001F, false));

		cube_r50 = new ModelRenderer(this);
		cube_r50.setRotationPoint(-1.6F, 0.0F, -1.25F);
		bone3.addChild(cube_r50);
		setRotationAngle(cube_r50, 0.0F, 0.0F, 0.8901F);
		cube_r50.cubeList.add(new ModelBox(cube_r50, 158, 363, -0.0169F, 0.1388F, 24.2F, 1, 1, 24, -0.35F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 72, 402, 0.0331F, -0.0112F, 47.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 402, 73, 0.0331F, -0.0112F, 45.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 402, 75, 0.0331F, -0.0112F, 44.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 76, 402, 0.0331F, -0.0112F, 43.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 402, 77, 0.0331F, -0.0112F, 42.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 402, 79, 0.0331F, -0.0112F, 40.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 80, 402, 0.0331F, -0.0112F, 39.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 402, 81, 0.0331F, -0.0112F, 38.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 294, 402, 0.0331F, -0.0112F, 37.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 402, 83, 0.0331F, -0.0112F, 35.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 84, 402, 0.0331F, -0.0112F, 34.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 402, 85, 0.0331F, -0.0112F, 33.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 402, 87, 0.0331F, -0.0112F, 32.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 88, 402, 0.0331F, -0.0112F, 30.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 402, 89, 0.0331F, -0.0112F, 29.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 402, 91, 0.0331F, -0.0112F, 28.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 92, 402, 0.0331F, -0.0112F, 27.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 402, 93, 0.0331F, -0.0112F, 25.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 402, 95, 0.0331F, -0.0112F, 24.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 96, 402, 0.0331F, -0.0112F, 23.9F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 402, 97, 0.0331F, -0.0112F, 24.15F, 1, 1, 1, -0.198F, false));

		cube_r51 = new ModelRenderer(this);
		cube_r51.setRotationPoint(0.0F, 0.0F, -1.25F);
		bone3.addChild(cube_r51);
		setRotationAngle(cube_r51, 0.0F, 0.0F, -0.8901F);
		cube_r51.cubeList.add(new ModelBox(cube_r51, 330, 379, -0.9831F, 0.1388F, 24.2F, 1, 1, 24, -0.35F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 402, 99, -1.0331F, -0.0112F, 47.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 100, 402, -1.0331F, -0.0112F, 45.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 104, 402, -1.0331F, -0.0112F, 44.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 108, 402, -1.0331F, -0.0112F, 43.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 112, 402, -1.0331F, -0.0112F, 42.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 116, 402, -1.0331F, -0.0112F, 40.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 150, 402, -1.0331F, -0.0112F, 39.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 402, 193, -1.0331F, -0.0112F, 38.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 298, 402, -1.0331F, -0.0112F, 37.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 402, 195, -1.0331F, -0.0112F, 35.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 202, 402, -1.0331F, -0.0112F, 34.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 206, 402, -1.0331F, -0.0112F, 33.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 210, 402, -1.0331F, -0.0112F, 32.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 214, 402, -1.0331F, -0.0112F, 30.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 218, 402, -1.0331F, -0.0112F, 29.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 222, 402, -1.0331F, -0.0112F, 28.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 226, 402, -1.0331F, -0.0112F, 27.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 230, 402, -1.0331F, -0.0112F, 25.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 234, 402, -1.0331F, -0.0112F, 24.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 238, 402, -1.0331F, -0.0112F, 23.9F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 242, 402, -1.0331F, -0.0112F, 24.15F, 1, 1, 1, -0.198F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		upper.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}