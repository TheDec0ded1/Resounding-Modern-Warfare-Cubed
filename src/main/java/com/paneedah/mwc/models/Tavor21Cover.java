package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Tavor21Cover extends ModelBase {
	private final ModelRenderer cover;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
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
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;

	public Tavor21Cover() {
		textureWidth = 432;
		textureHeight = 432;

		cover = new ModelRenderer(this);
		cover.setRotationPoint(0.0F, 24.0F, 0.0F);
		cover.cubeList.add(new ModelBox(cover, 202, 420, -3.0F, -39.4688F, -32.1259F, 3, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-3.3577F, -37.4641F, -22.0657F);
		cover.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.7854F, 0.0F, 0.2182F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 424, 53, -0.5F, 5.8993F, 4.9801F, 1, 1, 1, -0.1F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 404, 382, -0.5F, 4.9801F, 5.8993F, 1, 1, 1, -0.1F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 424, 57, -0.5F, -5.9801F, -6.8993F, 1, 1, 1, -0.1F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 424, 61, -0.5F, -6.8993F, -5.9801F, 1, 1, 1, -0.1F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-3.3577F, -37.4641F, -22.0657F);
		cover.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.2182F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 54, 424, -0.5F, -0.25F, 8.0657F, 1, 1, 1, -0.1F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 424, 55, -0.5F, -0.75F, 8.0657F, 1, 1, 1, -0.1F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 74, 389, -0.5F, -1.3157F, -8.5F, 1, 1, 17, -0.1F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 110, 389, -0.5F, 0.3157F, -8.5F, 1, 1, 17, -0.1F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 58, 424, -0.5F, -0.25F, -9.0657F, 1, 1, 1, -0.1F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 424, 59, -0.5F, -0.75F, -9.0657F, 1, 1, 1, -0.1F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-0.1335F, -37.3002F, -30.4657F);
		cover.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.7854F, 0.0F, -0.2182F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 46, 424, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-0.2F, -37.6F, -31.1314F);
		cover.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.2182F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 424, 49, 0.0F, -0.5F, 0.0F, 1, 1, 1, -0.1F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 50, 424, 0.0F, 0.0F, 0.0F, 1, 1, 1, -0.1F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 42, 424, 0.0F, -0.5F, 17.1314F, 1, 1, 1, -0.1F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 30, 424, 0.0F, 0.0F, 17.1314F, 1, 1, 1, -0.1F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.1478F, -36.031F, -30.4657F);
		cover.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.7854F, 0.0F, -0.2182F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 424, 51, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.1478F, -36.031F, -13.6657F);
		cover.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.7854F, 0.0F, -0.2182F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 38, 424, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-0.1335F, -37.3002F, -13.6657F);
		cover.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.7854F, 0.0F, -0.2182F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 34, 424, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-0.294F, -38.024F, -12.5657F);
		cover.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.2182F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 38, 389, 0.0F, 1.0F, -18.0F, 1, 1, 17, -0.1F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-0.4307F, -38.6404F, -12.5657F);
		cover.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.2182F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 388, 311, 0.0F, 0.0F, -18.0F, 1, 1, 17, -0.1F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-3.4473F, -37.1275F, -31.097F);
		cover.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 0.4363F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 250, 420, 0.0F, -1.0F, -1.0F, 1, 1, 2, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-3.4473F, -37.1275F, -31.097F);
		cover.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 0.3054F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 346, 103, 0.0F, 0.0F, -1.0F, 1, 1, 23, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-0.4253F, -36.709F, -31.097F);
		cover.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -0.4363F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 244, 420, 0.0F, -1.0F, -1.0F, 1, 1, 2, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-0.4727F, -36.8309F, -31.097F);
		cover.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.3054F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 346, 79, 0.0F, 0.0F, -1.0F, 1, 1, 23, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-1.6096F, -38.7976F, -9.9596F);
		cover.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0602F, -0.0106F, 0.1742F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 408, 161, -1.5F, 0.5F, -4.0F, 1, 2, 5, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 393, -1.5F, -0.5F, -12.0F, 1, 1, 13, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-1.6096F, -38.0307F, -22.9235F);
		cover.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0344F, -0.0061F, 0.1744F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 400, 343, -1.5F, -0.5F, -9.0F, 1, 1, 10, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-1.3904F, -38.0307F, -22.9235F);
		cover.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0344F, 0.0061F, -0.1744F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 402, 49, 0.5F, -0.5F, -9.0F, 1, 1, 10, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-2.5F, -38.2831F, -23.1139F);
		cover.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0349F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 374, 412, -0.5F, 0.5F, -9.0F, 3, 2, 1, 0.0F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 196, 416, -0.5F, -0.5F, -9.0F, 3, 1, 3, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-1.5F, -38.2831F, -22.9389F);
		cover.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0349F, 0.0F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 294, 405, 0.5F, -0.5F, -7.0F, 1, 1, 8, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 170, 406, -1.5F, -0.5F, -7.0F, 1, 1, 8, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-1.3904F, -38.7976F, -9.9596F);
		cover.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0602F, 0.0106F, -0.1742F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 394, 79, 0.5F, -0.5F, -12.0F, 1, 1, 13, 0.0F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 408, 154, 0.5F, 0.5F, -4.0F, 1, 2, 5, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-0.5F, -39.05F, -9.975F);
		cover.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0611F, 0.0F, 0.0F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 256, 419, -1.5F, -0.5F, -6.0F, 1, 1, 3, 0.0F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 392, 278, -2.5F, -0.5F, -12.0F, 1, 1, 13, 0.0F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 392, 264, -0.5F, -0.5F, -12.0F, 1, 1, 13, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		cover.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}