package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBU88Dustcover extends ModelBase {
	private final ModelRenderer dustcover;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cover;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;

	public QBU88Dustcover() {
		textureWidth = 576;
		textureHeight = 576;

		dustcover = new ModelRenderer(this);
		dustcover.setRotationPoint(0.0F, 24.0F, 0.0F);
		dustcover.cubeList.add(new ModelBox(dustcover, 265, 503, -4.0F, -26.3F, 40.8F, 5, 3, 7, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 451, 432, -3.134F, -23.8F, 40.8F, 1, 1, 7, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 268, 404, -2.866F, -23.8F, 40.8F, 3, 1, 7, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-3.317F, -23.483F, 42.3F);
		dustcover.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -1.0472F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 209, 526, -0.5F, -0.5F, -1.5F, 1, 1, 7, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.317F, -23.483F, 42.3F);
		dustcover.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 1.0472F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 151, 493, -0.5F, -0.5F, -1.5F, 1, 1, 7, 0.0F, false));

		cover = new ModelRenderer(this);
		cover.setRotationPoint(0.0F, 9.3F, -2.7F);
		dustcover.addChild(cover);
		cover.cubeList.add(new ModelBox(cover, 330, 300, 0.5937F, -45.9526F, 13.0F, 1, 2, 37, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 358, 37, 0.5937F, -43.9526F, 15.0F, 1, 1, 35, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 330, 340, -0.1455F, -47.9526F, 13.0F, 1, 1, 37, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 540, 293, -4.5813F, -45.9526F, 13.0F, 1, 2, 2, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 391, 540, -3.8671F, -47.9526F, 13.0F, 1, 1, 2, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 472, 294, -3.8671F, -47.9526F, 24.0F, 1, 1, 26, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 265, 514, -4.0671F, -48.6776F, 13.4F, 1, 1, 10, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 231, 495, -4.0671F, -48.6776F, 23.4F, 1, 2, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 231, 499, -4.0671F, -48.6776F, 13.0F, 1, 2, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 12, 546, -4.7481F, -45.8834F, 13.0F, 1, 1, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 546, 12, -4.7481F, -45.8834F, 23.4F, 1, 1, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 330, 180, -2.6063F, -49.3604F, 12.4F, 1, 1, 38, -0.4F, false));
		cover.cubeList.add(new ModelBox(cover, 330, 220, -1.4063F, -49.3604F, 12.4F, 1, 1, 38, -0.4F, false));
		cover.cubeList.add(new ModelBox(cover, 358, 0, -4.5813F, -43.9526F, 15.0F, 1, 1, 35, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 468, 445, -4.5813F, -45.9526F, 24.0F, 1, 2, 26, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 308, 362, 0.5937F, -43.5906F, 43.2037F, 1, 8, 7, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 308, 346, -4.5813F, -43.5906F, 43.2037F, 1, 8, 7, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 527, 309, -4.5813F, -43.4905F, 38.4037F, 1, 1, 5, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 527, 302, 0.5937F, -43.4905F, 38.4037F, 1, 1, 5, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 164, 479, -4.5813F, -42.4905F, 42.4037F, 1, 4, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 291, 475, 0.5937F, -42.4905F, 42.4037F, 1, 4, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 543, 528, -4.5813F, -42.4905F, 41.4037F, 1, 1, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 474, 544, 0.5937F, -42.4905F, 41.4037F, 1, 1, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 525, 198, -4.7813F, -44.7526F, 14.8F, 1, 1, 10, -0.2F, false));
		cover.cubeList.add(new ModelBox(cover, 525, 222, -4.7813F, -45.3526F, 14.8F, 1, 1, 10, -0.2F, false));
		cover.cubeList.add(new ModelBox(cover, 231, 346, -2.0063F, -48.9604F, 13.0F, 1, 1, 37, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 325, 360, 0.5937F, -45.9526F, 50.0F, 1, 12, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 544, 542, -0.1455F, -47.9526F, 50.0F, 1, 1, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 541, 512, -1.4063F, -49.3604F, 49.4F, 1, 2, 2, -0.4F, false));
		cover.cubeList.add(new ModelBox(cover, 544, 539, -2.0063F, -48.9604F, 50.0F, 1, 1, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 151, 479, -3.4141F, -45.8918F, 50.0F, 4, 11, 2, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 527, 316, -3.5141F, -48.1418F, 49.7F, 4, 3, 2, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 527, 322, -3.5141F, -35.6418F, 49.7F, 4, 3, 2, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 442, 387, -3.5735F, -45.8918F, 50.0F, 1, 11, 2, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 426, 532, -3.4141F, -34.8918F, 50.0F, 4, 3, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 325, 374, -3.5735F, -34.8918F, 50.0F, 1, 3, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 509, 541, -2.6063F, -49.3604F, 49.4F, 1, 2, 2, -0.4F, false));
		cover.cubeList.add(new ModelBox(cover, 479, 544, -3.8671F, -47.9526F, 50.0F, 1, 1, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 325, 346, -4.5813F, -45.9526F, 50.0F, 1, 12, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 28, 544, -4.5813F, -34.5526F, 50.0F, 1, 1, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 107, 545, 0.5937F, -34.5526F, 50.0F, 1, 1, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-3.885F, -46.0754F, 25.0F);
		cover.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.6109F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 41, 537, -0.5F, -1.5F, 25.0F, 1, 2, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 451, 387, -0.5F, -1.5F, -1.0F, 1, 2, 26, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 312, 540, -0.5F, -1.5F, -12.0F, 1, 2, 2, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-4.2806F, -32.5989F, 24.0F);
		cover.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 545, 48, 0.0F, -1.0F, 26.0F, 1, 1, 1, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-3.707F, -32.5989F, 24.0F);
		cover.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.7854F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 7, 544, 2.5355F, -3.5355F, 26.0F, 1, 1, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-3.8671F, -47.9526F, 24.0F);
		cover.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 484, 544, 0.0F, -1.0F, 26.0F, 1, 1, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 398, 540, 0.0F, -1.0F, -11.0F, 1, 1, 2, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 472, 322, 0.0F, -1.0F, 0.0F, 1, 1, 26, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.9665F, -33.2261F, 25.0F);
		cover.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.3054F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 23, 544, -0.5F, -0.5F, 25.0F, 1, 1, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-3.9541F, -33.2261F, 25.0F);
		cover.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 1.2654F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 545, 51, -0.5F, -0.5F, 25.0F, 1, 1, 1, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-2.5328F, -48.3332F, 25.0F);
		cover.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 1.2654F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 500, 544, -0.5F, -0.5F, 25.0F, 1, 1, 1, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 346, -0.5F, -0.5F, -12.0F, 1, 1, 37, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-0.4798F, -48.3332F, 25.0F);
		cover.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 0.3054F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 530, 543, -0.5F, -0.5F, 25.0F, 1, 1, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 77, 346, -0.5F, -0.5F, -12.0F, 1, 1, 37, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-4.1455F, -47.9526F, 24.0F);
		cover.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 0.7854F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 543, 531, 2.5355F, -3.5355F, 26.0F, 1, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 154, 346, 2.5355F, -3.5355F, -11.0F, 1, 1, 37, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.8974F, -46.0754F, 15.0F);
		cover.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -0.6109F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 432, 540, -0.5F, -1.5F, 35.0F, 1, 2, 1, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 330, 260, -0.5F, -1.5F, -2.0F, 1, 2, 37, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-1.2438F, -44.0132F, 16.5465F);
		cover.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.3491F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 426, 526, 1.8375F, -6.6F, 18.5F, 1, 1, 4, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 529, 255, -3.3375F, -6.6F, 18.5F, 1, 1, 4, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-1.4938F, -34.6379F, 43.7889F);
		cover.addChild(cube_r14);
		setRotationAngle(cube_r14, -1.4835F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 442, 401, -3.0875F, -6.5F, -1.0F, 1, 7, 3, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 152, 526, -2.9125F, -6.5F, -1.0F, 6, 7, 3, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-1.4938F, -38.5806F, 42.6475F);
		cover.addChild(cube_r15);
		setRotationAngle(cube_r15, -1.2217F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 358, 174, -2.9125F, -0.5F, -1.0F, 6, 1, 4, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 529, 261, -3.0875F, -0.5F, -1.0F, 1, 1, 4, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-1.4938F, -40.752F, 41.0075F);
		cover.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.7854F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 224, 477, -3.0875F, -1.5F, -2.0F, 1, 2, 4, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 224, 484, 2.0875F, -1.5F, -2.0F, 1, 2, 4, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-1.7438F, -44.0132F, 14.6465F);
		cover.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.7854F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 246, 541, -2.8375F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 239, 541, 2.3375F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-5.5671F, -47.6776F, 15.5F);
		cover.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, 0.6109F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 291, 490, 1.7F, -1.0F, 7.9F, 1, 2, 1, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 291, 486, 1.7F, -1.0F, -2.5F, 1, 2, 1, 0.0F, false));
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