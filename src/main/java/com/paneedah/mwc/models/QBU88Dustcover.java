package com.paneedah.mwc.models;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBU88Dustcover extends ModelBase {
	private final ModelRenderer dustcover;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cover;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;
	private final ModelRenderer cube_r34;
	private final ModelRenderer cube_r35;
	private final ModelRenderer cube_r36;
	private final ModelRenderer cube_r37;
	private final ModelRenderer cube_r38;
	private final ModelRenderer cube_r39;
	private final ModelRenderer cube_r40;
	private final ModelRenderer cube_r41;
	private final ModelRenderer cube_r42;

	public QBU88Dustcover() {
		textureWidth = 576;
		textureHeight = 576;

		dustcover = new ModelRenderer(this);
		dustcover.setRotationPoint(0.0F, 24.0F, 0.0F);
		dustcover.cubeList.add(new ModelBox(dustcover, 492, 147, -4.0F, -26.3F, 40.8F, 5, 3, 7, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 416, 76, -3.134F, -23.8F, 40.8F, 1, 1, 7, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 524, 476, -2.866F, -23.8F, 40.8F, 3, 1, 7, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-3.317F, -23.483F, 42.3F);
		dustcover.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, -1.0472F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 542, 156, -0.5F, -0.5F, -1.5F, 1, 1, 7, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.317F, -23.483F, 42.3F);
		dustcover.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, 1.0472F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 450, 500, -0.5F, -0.5F, -1.5F, 1, 1, 7, 0.0F, false));

		cover = new ModelRenderer(this);
		cover.setRotationPoint(0.0F, 9.3F, -2.7F);
		dustcover.addChild(cover);
		cover.cubeList.add(new ModelBox(cover, 342, 296, 0.5937F, -45.9526F, 13.0F, 1, 2, 37, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 282, 389, 0.5937F, -43.9526F, 15.0F, 1, 1, 35, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 0, 349, -0.1455F, -47.9526F, 13.0F, 1, 1, 37, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 386, 556, -4.5813F, -45.9526F, 13.0F, 1, 2, 2, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 410, 557, -3.8671F, -47.9526F, 13.0F, 1, 1, 2, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 450, 512, -3.8671F, -47.9526F, 24.0F, 1, 1, 26, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 516, 147, -4.0671F, -48.6776F, 13.4F, 1, 1, 10, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 238, 500, -4.0671F, -48.6776F, 23.4F, 1, 2, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 346, 530, -4.0671F, -48.6776F, 13.0F, 1, 2, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 560, 250, -4.7481F, -45.8834F, 13.0F, 1, 1, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 560, 358, -4.7481F, -45.8834F, 23.4F, 1, 1, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 342, 179, -2.6063F, -49.3604F, 12.4F, 1, 1, 38, -0.4F, false));
		cover.cubeList.add(new ModelBox(cover, 342, 218, -1.4063F, -49.3604F, 12.4F, 1, 1, 38, -0.4F, false));
		cover.cubeList.add(new ModelBox(cover, 76, 387, -4.5813F, -43.9526F, 15.0F, 1, 1, 35, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 0, 488, -4.5813F, -45.9526F, 24.0F, 1, 2, 26, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 222, 488, 0.5937F, -43.5906F, 43.2037F, 1, 8, 7, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 450, 485, -4.5813F, -43.5906F, 43.2037F, 1, 8, 7, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 394, 476, -4.5813F, -43.4905F, 38.4037F, 1, 1, 5, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 394, 470, 0.5937F, -43.4905F, 38.4037F, 1, 1, 5, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 62, 463, -4.5813F, -42.4905F, 42.4037F, 1, 4, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 62, 458, 0.5937F, -42.4905F, 42.4037F, 1, 4, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 560, 360, -4.5813F, -42.4905F, 41.4037F, 1, 1, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 552, 560, 0.5937F, -42.4905F, 41.4037F, 1, 1, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 200, 515, -4.7813F, -44.7526F, 14.8F, 1, 1, 10, -0.2F, false));
		cover.cubeList.add(new ModelBox(cover, 516, 81, -4.7813F, -45.3526F, 14.8F, 1, 1, 10, -0.2F, false));
		cover.cubeList.add(new ModelBox(cover, 0, 387, -2.0063F, -48.9604F, 13.0F, 1, 1, 37, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 58, 458, 0.5937F, -45.9526F, 50.0F, 1, 12, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 20, 561, -0.1455F, -47.9526F, 50.0F, 1, 1, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 276, 557, -1.4063F, -49.3604F, 49.4F, 1, 2, 2, -0.4F, false));
		cover.cubeList.add(new ModelBox(cover, 8, 561, -2.0063F, -48.9604F, 50.0F, 1, 1, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 164, 295, -3.4141F, -45.8918F, 50.0F, 4, 11, 2, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 542, 232, -3.5141F, -48.1418F, 49.7F, 4, 3, 2, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 542, 237, -3.5141F, -35.6418F, 49.7F, 4, 3, 2, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 66, 425, -3.5735F, -45.8918F, 50.0F, 1, 11, 2, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 546, 140, -3.4141F, -34.8918F, 50.0F, 4, 3, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 480, 245, -3.5735F, -34.8918F, 50.0F, 1, 3, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 270, 557, -2.6063F, -49.3604F, 49.4F, 1, 2, 2, -0.4F, false));
		cover.cubeList.add(new ModelBox(cover, 560, 560, -3.8671F, -47.9526F, 50.0F, 1, 1, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 72, 425, -4.5813F, -45.9526F, 50.0F, 1, 12, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 560, 364, -4.5813F, -34.5526F, 50.0F, 1, 1, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 36, 561, 0.5937F, -34.5526F, 50.0F, 1, 1, 1, 0.0F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-3.885F, -46.0754F, 25.0F);
		cover.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, 0.6109F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 476, 559, -0.5F, -1.5F, 25.0F, 1, 2, 1, 0.0F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 486, 397, -0.5F, -1.5F, -1.0F, 1, 2, 26, 0.0F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 392, 556, -0.5F, -1.5F, -12.0F, 1, 2, 2, 0.0F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-4.2806F, -32.5989F, 24.0F);
		cover.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, 0.7854F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 560, 362, 0.0F, -1.0F, 26.0F, 1, 1, 1, 0.0F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-3.707F, -32.5989F, 24.0F);
		cover.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.0F, 0.7854F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 28, 561, 2.5355F, -3.5355F, 26.0F, 1, 1, 1, 0.0F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-3.8671F, -47.9526F, 24.0F);
		cover.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, 0.7854F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 561, 0.0F, -1.0F, 26.0F, 1, 1, 1, 0.0F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 416, 557, 0.0F, -1.0F, -11.0F, 1, 1, 2, 0.0F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 504, 512, 0.0F, -1.0F, 0.0F, 1, 1, 26, 0.0F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(0.9665F, -33.2261F, 25.0F);
		cover.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.0F, 0.0F, 0.3054F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 32, 561, -0.5F, -0.5F, 25.0F, 1, 1, 1, 0.0F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(-3.9541F, -33.2261F, 25.0F);
		cover.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.0F, 0.0F, 1.2654F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 562, 102, -0.5F, -0.5F, 25.0F, 1, 1, 1, 0.0F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(-2.5328F, -48.3332F, 25.0F);
		cover.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.0F, 0.0F, 1.2654F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 4, 561, -0.5F, -0.5F, 25.0F, 1, 1, 1, 0.0F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 76, 349, -0.5F, -0.5F, -12.0F, 1, 1, 37, 0.0F, false));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(-0.4798F, -48.3332F, 25.0F);
		cover.addChild(cube_r34);
		setRotationAngle(cube_r34, 0.0F, 0.0F, 0.3054F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 12, 561, -0.5F, -0.5F, 25.0F, 1, 1, 1, 0.0F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 356, 0, -0.5F, -0.5F, -12.0F, 1, 1, 37, 0.0F, false));

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(-4.1455F, -47.9526F, 24.0F);
		cover.addChild(cube_r35);
		setRotationAngle(cube_r35, 0.0F, 0.0F, 0.7854F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 16, 561, 2.5355F, -3.5355F, 26.0F, 1, 1, 1, 0.0F, false));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 356, 38, 2.5355F, -3.5355F, -11.0F, 1, 1, 37, 0.0F, false));

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(0.8974F, -46.0754F, 15.0F);
		cover.addChild(cube_r36);
		setRotationAngle(cube_r36, 0.0F, 0.0F, -0.6109F);
		cube_r36.cubeList.add(new ModelBox(cube_r36, 498, 559, -0.5F, -1.5F, 35.0F, 1, 2, 1, 0.0F, false));
		cube_r36.cubeList.add(new ModelBox(cube_r36, 342, 257, -0.5F, -1.5F, -2.0F, 1, 2, 37, 0.0F, false));

		cube_r37 = new ModelRenderer(this);
		cube_r37.setRotationPoint(-1.2438F, -44.0132F, 16.5465F);
		cover.addChild(cube_r37);
		setRotationAngle(cube_r37, -0.3491F, 0.0F, 0.0F);
		cube_r37.cubeList.add(new ModelBox(cube_r37, 340, 533, 1.8375F, -6.6F, 18.5F, 1, 1, 4, 0.0F, false));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 546, 97, -3.3375F, -6.6F, 18.5F, 1, 1, 4, 0.0F, false));

		cube_r38 = new ModelRenderer(this);
		cube_r38.setRotationPoint(-1.4938F, -34.6379F, 43.7889F);
		cover.addChild(cube_r38);
		setRotationAngle(cube_r38, -1.4835F, 0.0F, 0.0F);
		cube_r38.cubeList.add(new ModelBox(cube_r38, 66, 438, -3.0875F, -6.5F, -1.0F, 1, 7, 3, 0.0F, false));
		cube_r38.cubeList.add(new ModelBox(cube_r38, 540, 277, -2.9125F, -6.5F, -1.0F, 6, 7, 3, 0.0F, false));

		cube_r39 = new ModelRenderer(this);
		cube_r39.setRotationPoint(-1.4938F, -38.5806F, 42.6475F);
		cover.addChild(cube_r39);
		setRotationAngle(cube_r39, -1.2217F, 0.0F, 0.0F);
		cube_r39.cubeList.add(new ModelBox(cube_r39, 350, 508, -2.9125F, -0.5F, -1.0F, 6, 1, 4, 0.0F, false));
		cube_r39.cubeList.add(new ModelBox(cube_r39, 546, 102, -3.0875F, -0.5F, -1.0F, 1, 1, 4, 0.0F, false));

		cube_r40 = new ModelRenderer(this);
		cube_r40.setRotationPoint(-1.4938F, -40.752F, 41.0075F);
		cover.addChild(cube_r40);
		setRotationAngle(cube_r40, -0.7854F, 0.0F, 0.0F);
		cube_r40.cubeList.add(new ModelBox(cube_r40, 544, 372, -3.0875F, -1.5F, -2.0F, 1, 2, 4, 0.0F, false));
		cube_r40.cubeList.add(new ModelBox(cube_r40, 544, 476, 2.0875F, -1.5F, -2.0F, 1, 2, 4, 0.0F, false));

		cube_r41 = new ModelRenderer(this);
		cube_r41.setRotationPoint(-1.7438F, -44.0132F, 14.6465F);
		cover.addChild(cube_r41);
		setRotationAngle(cube_r41, -0.7854F, 0.0F, 0.0F);
		cube_r41.cubeList.add(new ModelBox(cube_r41, 558, 46, -2.8375F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));
		cube_r41.cubeList.add(new ModelBox(cube_r41, 18, 558, 2.3375F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

		cube_r42 = new ModelRenderer(this);
		cube_r42.setRotationPoint(-5.5671F, -47.6776F, 15.5F);
		cover.addChild(cube_r42);
		setRotationAngle(cube_r42, 0.0F, 0.0F, 0.6109F);
		cube_r42.cubeList.add(new ModelBox(cube_r42, 196, 559, 1.7F, -1.0F, 7.9F, 1, 2, 1, 0.0F, false));
		cube_r42.cubeList.add(new ModelBox(cube_r42, 538, 156, 1.7F, -1.0F, -2.5F, 1, 2, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		dustcover.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}