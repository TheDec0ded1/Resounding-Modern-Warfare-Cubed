package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AX50Casing extends ModelWithAttachments {
	private final ModelRenderer casing;
	private final ModelRenderer shell2;
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
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;

	public AX50Casing() {
		textureWidth = 32;
		textureHeight = 32;

		casing = new ModelRenderer(this);
		casing.setRotationPoint(-1.6F, -15.25F, -38.2F);
		setRotationAngle(casing, 1.5708F, 0.0F, 0.0F);
		

		shell2 = new ModelRenderer(this);
		shell2.setRotationPoint(0.5F, -2.0F, -0.25F);
		casing.addChild(shell2);
		shell2.cubeList.add(new ModelBox(shell2, 0, 0, -1.0F, -7.0F, -1.0F, 1, 9, 1, 0.0F, false));
		shell2.cubeList.add(new ModelBox(shell2, 5, 0, -0.29F, -7.0F, -0.28F, 1, 9, 1, 0.001F, false));
		shell2.cubeList.add(new ModelBox(shell2, 10, 0, -1.71F, -7.0F, -0.28F, 1, 9, 1, 0.001F, false));
		shell2.cubeList.add(new ModelBox(shell2, 20, 20, -1.0F, -9.0F, -0.8614F, 1, 3, 1, -0.049F, false));
		shell2.cubeList.add(new ModelBox(shell2, 20, 5, -1.0F, -9.0F, 0.27F, 1, 3, 1, -0.049F, false));
		shell2.cubeList.add(new ModelBox(shell2, 0, 22, -0.4343F, -9.0F, -0.2957F, 1, 3, 1, -0.049F, false));
		shell2.cubeList.add(new ModelBox(shell2, 5, 22, -1.5657F, -9.0F, -0.2957F, 1, 3, 1, -0.049F, false));
		shell2.cubeList.add(new ModelBox(shell2, 0, 11, -1.0F, -7.0F, 0.45F, 1, 9, 1, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.0F, -7.0F, 1.43F);
		shell2.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.4389F, 0.6743F, 0.6447F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 15, 22, 0.0F, -1.0F, -1.0F, 1, 1, 1, -0.001F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, -7.0F, 1.43F);
		shell2.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.4389F, -0.6743F, -0.6447F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 25, 0, -1.0F, -1.0F, -1.0F, 1, 1, 1, -0.001F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, -7.0F, -1.0F);
		shell2.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.4389F, 0.6743F, -0.6447F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 25, 6, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.001F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-1.0F, -7.0F, -1.0F);
		shell2.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.4389F, -0.6743F, 0.6447F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 25, 9, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.001F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-1.0F, 0.0F, -1.0F);
		shell2.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, -0.7854F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 5, 11, 0.0F, -7.0F, 0.0F, 1, 9, 1, -0.001F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-1.0F, 0.0F, 1.45F);
		shell2.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.7854F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 10, 11, 0.0F, -7.0F, -1.0F, 1, 9, 1, -0.001F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-0.1F, -6.7F, -0.82F);
		shell2.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.7854F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 20, 15, -0.8693F, -2.351F, -0.0585F, 1, 3, 1, -0.1F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-0.9F, -6.7F, -0.82F);
		shell2.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, -0.7854F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 10, 22, -0.1307F, -2.351F, -0.0585F, 1, 3, 1, -0.1F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-0.1F, -6.7F, 1.22F);
		shell2.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, -0.7854F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 20, 10, -0.8632F, -2.351F, -0.9354F, 1, 3, 1, -0.1F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-0.9F, -6.7F, 1.22F);
		shell2.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.7854F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 20, 0, -0.1368F, -2.351F, -0.9354F, 1, 3, 1, -0.1F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.0F, 0.0F, 1.45F);
		shell2.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, -0.7854F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 15, 0, -1.0F, -7.0F, -1.0F, 1, 9, 1, -0.001F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.0F, 0.0F, -1.0F);
		shell2.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.7854F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 15, 11, -1.0F, -7.0F, 0.0F, 1, 9, 1, -0.001F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-1.03F, -7.0F, -1.0F);
		shell2.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.4538F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 25, 12, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.001F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-1.03F, -7.0F, 1.46F);
		shell2.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.4538F, 0.0F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 25, 3, 0.0F, -1.0F, -1.0F, 1, 1, 1, 0.001F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-1.71F, -7.0F, -0.28F);
		shell2.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, 0.4538F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 15, 25, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.001F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.71F, -7.0F, -0.28F);
		shell2.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, -0.4538F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 25, 15, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.001F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		casing.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}