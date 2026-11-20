package com.paneedah.mwc.models;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBZ191Upper extends ModelBase {
	private final ModelRenderer upper;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r50;
	private final ModelRenderer cube_r51;

	public QBZ191Upper() {
		textureWidth = 400;
		textureHeight = 400;

		upper = new ModelRenderer(this);
		upper.setRotationPoint(-1.0078F, -11.9659F, -2.0F);
		upper.cubeList.add(new ModelBox(upper, 198, 396, 1.0176F, -1.0F, -2.0F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 386, 325, -0.6061F, -4.3374F, -2.0F, 2, 3, 3, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 390, 275, -2.6763F, -5.748F, -1.4477F, 1, 2, 2, -0.3F, false));
		upper.cubeList.add(new ModelBox(upper, 276, 390, 0.6939F, -5.748F, -1.4477F, 1, 2, 2, -0.3F, false));
		upper.cubeList.add(new ModelBox(upper, 340, 389, -2.5061F, -3.8481F, -0.1477F, 4, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 294, 160, -2.7061F, -5.3481F, -0.8477F, 5, 1, 1, -0.1F, false));
		upper.cubeList.add(new ModelBox(upper, 186, 387, -2.3763F, -4.3374F, -2.0F, 2, 3, 3, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 396, 319, -3.0F, -1.0F, -2.0F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 282, 27, 0.7588F, -1.0341F, -27.6F, 1, 1, 26, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 282, 390, 0.7588F, -0.0341F, -27.6F, 1, 2, 2, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 356, 307, -2.7412F, -1.0341F, -16.0F, 1, 1, 14, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 100, 331, -2.7412F, -1.0341F, -27.6F, 1, 3, 2, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 346, 269, -2.9412F, -0.8341F, -25.8F, 1, 1, 10, -0.2F, false));
		upper.cubeList.add(new ModelBox(upper, 120, 389, -3.1412F, 0.783F, -27.8313F, 1, 1, 4, -0.2F, false));
		upper.cubeList.add(new ModelBox(upper, 182, 393, -3.1412F, -0.817F, -27.8313F, 1, 2, 1, -0.2F, false));
		upper.cubeList.add(new ModelBox(upper, 54, 282, -3.3412F, -0.917F, -27.9313F, 1, 1, 13, -0.3F, false));
		upper.cubeList.add(new ModelBox(upper, 396, 275, -3.1412F, -1.517F, -16.1313F, 1, 1, 1, -0.1F, false));
		upper.cubeList.add(new ModelBox(upper, 396, 277, -1.9251F, -2.8441F, -16.1313F, 1, 1, 1, -0.1F, false));
		upper.cubeList.add(new ModelBox(upper, 240, 323, 1.2588F, -1.8341F, -24.0F, 1, 2, 7, -0.2F, false));
		upper.cubeList.add(new ModelBox(upper, 278, 396, 1.3F, -1.2F, -22.6F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 282, 396, 1.3F, -1.2F, -19.5F, 1, 1, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.9446F, -1.4376F, -20.0F);
		upper.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.9599F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 372, 237, -1.0F, -2.0F, -4.0F, 2, 3, 7, -0.2F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-2.476F, -1.4416F, -15.6313F);
		upper.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.7418F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 186, 393, -0.5F, -1.5F, -0.5F, 1, 2, 1, -0.1F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-2.7412F, -1.0341F, -2.6F);
		upper.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 0.8727F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 390, 335, 0.0F, -2.0F, -25.0F, 1, 2, 2, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 354, 201, 0.0F, -2.0F, -13.4F, 1, 2, 14, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(1.116F, -0.268F, -1.6F);
		upper.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.8727F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 266, 281, 0.0F, -2.0F, -26.0F, 1, 2, 26, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-3.0F, -1.0F, -1.0F);
		upper.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 0.3491F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 310, 393, 0.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(1.0779F, -0.658F, -1.0F);
		upper.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -0.3491F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 178, 393, 0.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-2.6763F, -5.0219F, -0.5924F);
		upper.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.6545F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 390, 271, 0.0F, -0.3F, -1.0F, 1, 2, 2, -0.3F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 270, 390, 3.3702F, -0.3F, -1.0F, 1, 2, 2, -0.3F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.3078F, -4.5091F, -50.45F);
		upper.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 392, 170, -1.8F, 0.1F, 22.9F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 392, 172, -1.8F, 0.1F, 22.65F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 392, 174, -1.8F, 0.1F, 23.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 392, 176, -1.8F, 0.1F, 24.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 392, 178, -1.8F, 0.1F, 25.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 392, 180, -1.8F, 0.1F, 27.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 392, 182, -1.8F, 0.1F, 28.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 392, 216, -1.8F, 0.1F, 29.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 392, 218, -1.8F, 0.1F, 30.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 392, 220, -1.8F, 0.1F, 32.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 222, 392, -1.8F, 0.1F, 33.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 392, 222, -1.8F, 0.1F, 34.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 142, 393, -1.8F, 0.1F, 35.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 392, 224, -1.8F, 0.1F, 37.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 392, 279, -1.8F, 0.1F, 38.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 392, 281, -1.8F, 0.1F, 39.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 392, 283, -1.8F, 0.1F, 40.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 392, 285, -1.8F, 0.1F, 42.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 392, 287, -1.8F, 0.1F, 43.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 392, 289, -1.8F, 0.1F, 44.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 392, 291, -1.8F, 0.1F, 45.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 246, 197, -1.45F, 0.7F, 22.85F, 1, 1, 27, -0.001F, false));
		bone3.cubeList.add(new ModelBox(bone3, 210, 241, -0.7F, 0.7F, 22.85F, 1, 2, 27, -0.001F, false));
		bone3.cubeList.add(new ModelBox(bone3, 266, 164, -1.9F, 0.7F, 22.85F, 1, 1, 27, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 156, 325, -1.9F, 1.7F, 34.45F, 1, 1, 16, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 250, 332, -1.9F, 1.7F, 22.85F, 1, 1, 2, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 110, 389, -1.9F, 0.3F, 46.6F, 1, 1, 4, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 386, 85, -1.7F, 0.3F, 46.6F, 2, 1, 4, -0.001F, false));

		cube_r50 = new ModelRenderer(this);
		cube_r50.setRotationPoint(-1.6F, 0.0F, -1.25F);
		bone3.addChild(cube_r50);
		setRotationAngle(cube_r50, 0.0F, 0.0F, 0.8901F);
		cube_r50.cubeList.add(new ModelBox(cube_r50, 336, 0, -0.0169F, 0.1388F, 24.2F, 1, 1, 24, -0.35F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 396, 199, 0.0331F, -0.0112F, 47.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 202, 396, 0.0331F, -0.0112F, 45.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 396, 208, 0.0331F, -0.0112F, 44.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 396, 210, 0.0331F, -0.0112F, 43.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 212, 396, 0.0331F, -0.0112F, 42.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 396, 212, 0.0331F, -0.0112F, 40.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 396, 214, 0.0331F, -0.0112F, 39.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 216, 396, 0.0331F, -0.0112F, 38.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 396, 323, 0.0331F, -0.0112F, 37.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 220, 396, 0.0331F, -0.0112F, 35.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 224, 396, 0.0331F, -0.0112F, 34.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 396, 226, 0.0331F, -0.0112F, 33.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 228, 396, 0.0331F, -0.0112F, 32.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 396, 228, 0.0331F, -0.0112F, 30.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 396, 230, 0.0331F, -0.0112F, 29.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 396, 232, 0.0331F, -0.0112F, 28.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 396, 234, 0.0331F, -0.0112F, 27.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 396, 236, 0.0331F, -0.0112F, 25.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 396, 238, 0.0331F, -0.0112F, 24.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 396, 240, 0.0331F, -0.0112F, 23.9F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 396, 242, 0.0331F, -0.0112F, 24.15F, 1, 1, 1, -0.198F, false));

		cube_r51 = new ModelRenderer(this);
		cube_r51.setRotationPoint(0.0F, 0.0F, -1.25F);
		bone3.addChild(cube_r51);
		setRotationAngle(cube_r51, 0.0F, 0.0F, -0.8901F);
		cube_r51.cubeList.add(new ModelBox(cube_r51, 336, 25, -0.9831F, 0.1388F, 24.2F, 1, 1, 24, -0.35F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 396, 244, -1.0331F, -0.0112F, 47.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 396, 246, -1.0331F, -0.0112F, 45.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 396, 248, -1.0331F, -0.0112F, 44.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 250, 396, -1.0331F, -0.0112F, 43.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 396, 250, -1.0331F, -0.0112F, 42.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 396, 252, -1.0331F, -0.0112F, 40.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 254, 396, -1.0331F, -0.0112F, 39.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 396, 254, -1.0331F, -0.0112F, 38.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 396, 325, -1.0331F, -0.0112F, 37.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 396, 256, -1.0331F, -0.0112F, 35.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 258, 396, -1.0331F, -0.0112F, 34.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 396, 258, -1.0331F, -0.0112F, 33.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 396, 260, -1.0331F, -0.0112F, 32.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 262, 396, -1.0331F, -0.0112F, 30.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 396, 262, -1.0331F, -0.0112F, 29.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 396, 264, -1.0331F, -0.0112F, 28.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 266, 396, -1.0331F, -0.0112F, 27.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 270, 396, -1.0331F, -0.0112F, 25.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 396, 271, -1.0331F, -0.0112F, 24.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 396, 273, -1.0331F, -0.0112F, 23.9F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 274, 396, -1.0331F, -0.0112F, 24.15F, 1, 1, 1, -0.198F, false));
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