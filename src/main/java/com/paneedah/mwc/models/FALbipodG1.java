package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FALbipodG1 extends ModelBase {
	private final ModelRenderer bipodG1;
	private final ModelRenderer gun_r1;
	private final ModelRenderer gun_r2;
	private final ModelRenderer gun_r3;
	private final ModelRenderer gun_r4;
	private final ModelRenderer gun_r5;
	private final ModelRenderer gun_r6;
	private final ModelRenderer gun_r7;
	private final ModelRenderer gun_r8;
	private final ModelRenderer gun_r9;
	private final ModelRenderer gun_r10;
	private final ModelRenderer gun_r11;
	private final ModelRenderer gun_r12;
	private final ModelRenderer gun_r13;
	private final ModelRenderer gun_r14;

	public FALbipodG1() {
		textureWidth = 624;
		textureHeight = 624;

		bipodG1 = new ModelRenderer(this);
		bipodG1.setRotationPoint(-1.499F, -13.06F, -73.25F);
		bipodG1.cubeList.add(new ModelBox(bipodG1, 218, 605, -0.5F, 0.6314F, -1.0F, 1, 1, 3, 0.3F, false));
		bipodG1.cubeList.add(new ModelBox(bipodG1, 280, 605, -0.5F, -1.6314F, -1.0F, 1, 1, 3, 0.3F, false));

		gun_r1 = new ModelRenderer(this);
		gun_r1.setRotationPoint(-2.21F, 3.0818F, 37.5F);
		bipodG1.addChild(gun_r1);
		setRotationAngle(gun_r1, 0.0F, 0.7854F, -0.9163F);
		gun_r1.cubeList.add(new ModelBox(gun_r1, 488, 604, -1.0F, -1.5F, -1.0F, 2, 3, 2, 0.0F, false));

		gun_r2 = new ModelRenderer(this);
		gun_r2.setRotationPoint(2.26F, 3.0818F, 37.5F);
		bipodG1.addChild(gun_r2);
		setRotationAngle(gun_r2, 0.0F, 0.7854F, 0.9163F);
		gun_r2.cubeList.add(new ModelBox(gun_r2, 480, 604, -1.0F, -1.5F, -1.0F, 2, 3, 2, 0.0F, false));

		gun_r3 = new ModelRenderer(this);
		gun_r3.setRotationPoint(2.9836F, -0.976F, 37.5F);
		bipodG1.addChild(gun_r3);
		setRotationAngle(gun_r3, 0.0F, 0.7854F, -0.3927F);
		gun_r3.cubeList.add(new ModelBox(gun_r3, 472, 604, -1.0F, -1.5F, -1.0F, 2, 3, 2, 0.0F, false));

		gun_r4 = new ModelRenderer(this);
		gun_r4.setRotationPoint(-2.9336F, -0.976F, 37.5F);
		bipodG1.addChild(gun_r4);
		setRotationAngle(gun_r4, 0.0F, 0.7854F, 0.3927F);
		gun_r4.cubeList.add(new ModelBox(gun_r4, 464, 604, -1.0F, -1.5F, -1.0F, 2, 3, 2, 0.0F, false));

		gun_r5 = new ModelRenderer(this);
		gun_r5.setRotationPoint(3.45F, -1.1314F, 37.5F);
		bipodG1.addChild(gun_r5);
		setRotationAngle(gun_r5, 0.0F, 0.7854F, 0.0F);
		gun_r5.cubeList.add(new ModelBox(gun_r5, 456, 604, -1.0F, 1.0F, -1.0F, 2, 3, 2, 0.0F, false));

		gun_r6 = new ModelRenderer(this);
		gun_r6.setRotationPoint(-3.4F, -1.1314F, 37.5F);
		bipodG1.addChild(gun_r6);
		setRotationAngle(gun_r6, 0.0F, 0.7854F, 0.0F);
		gun_r6.cubeList.add(new ModelBox(gun_r6, 448, 604, -1.0F, 1.0F, -1.0F, 2, 3, 2, 0.0F, false));

		gun_r7 = new ModelRenderer(this);
		gun_r7.setRotationPoint(0.4536F, -1.1536F, 2.5F);
		bipodG1.addChild(gun_r7);
		setRotationAngle(gun_r7, 0.0F, 0.0F, 0.7854F);
		gun_r7.cubeList.add(new ModelBox(gun_r7, 570, 608, 3.0F, -0.5F, 35.25F, 1, 1, 2, 0.0F, false));
		gun_r7.cubeList.add(new ModelBox(gun_r7, 390, 312, 2.5F, -1.0F, -0.5F, 2, 2, 36, 0.0F, false));

		gun_r8 = new ModelRenderer(this);
		gun_r8.setRotationPoint(-1.1607F, 0.2607F, 2.5F);
		bipodG1.addChild(gun_r8);
		setRotationAngle(gun_r8, 0.0F, 0.0F, 0.7854F);
		gun_r8.cubeList.add(new ModelBox(gun_r8, 564, 608, -1.0F, 1.5F, 35.25F, 1, 1, 2, 0.0F, false));
		gun_r8.cubeList.add(new ModelBox(gun_r8, 390, 350, -1.5F, 1.0F, -0.5F, 2, 2, 36, 0.0F, false));

		gun_r9 = new ModelRenderer(this);
		gun_r9.setRotationPoint(-4.6891F, -0.4465F, 0.0F);
		bipodG1.addChild(gun_r9);
		setRotationAngle(gun_r9, -0.48F, 0.0F, 0.7854F);
		gun_r9.cubeList.add(new ModelBox(gun_r9, 18, 608, 0.8F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

		gun_r10 = new ModelRenderer(this);
		gun_r10.setRotationPoint(-1.8607F, 0.2607F, -0.5F);
		bipodG1.addChild(gun_r10);
		setRotationAngle(gun_r10, 0.0F, 0.0F, 0.7854F);
		gun_r10.cubeList.add(new ModelBox(gun_r10, 440, 604, -1.0F, 0.5F, -0.5F, 1, 2, 3, 0.3F, false));
		gun_r10.cubeList.add(new ModelBox(gun_r10, 70, 428, -0.5F, -2.0F, -0.5F, 1, 5, 3, 0.3F, false));

		gun_r11 = new ModelRenderer(this);
		gun_r11.setRotationPoint(-1.1536F, 1.1535F, -0.5F);
		bipodG1.addChild(gun_r11);
		setRotationAngle(gun_r11, 0.0F, 0.0F, 0.7854F);
		gun_r11.cubeList.add(new ModelBox(gun_r11, 272, 605, -0.5F, -1.0F, -0.5F, 1, 1, 3, 0.3F, false));

		gun_r12 = new ModelRenderer(this);
		gun_r12.setRotationPoint(1.8607F, -0.2607F, -0.5F);
		bipodG1.addChild(gun_r12);
		setRotationAngle(gun_r12, 0.0F, 0.0F, 0.7854F);
		gun_r12.cubeList.add(new ModelBox(gun_r12, 210, 605, -0.5F, 1.0F, -0.5F, 1, 1, 3, 0.3F, false));

		gun_r13 = new ModelRenderer(this);
		gun_r13.setRotationPoint(4.6184F, -0.3757F, 0.0F);
		bipodG1.addChild(gun_r13);
		setRotationAngle(gun_r13, 0.0F, 0.48F, 0.7854F);
		gun_r13.cubeList.add(new ModelBox(gun_r13, 210, 162, -1.0F, 0.7F, -1.0F, 2, 1, 2, 0.0F, false));

		gun_r14 = new ModelRenderer(this);
		gun_r14.setRotationPoint(1.1536F, -1.1536F, -0.5F);
		bipodG1.addChild(gun_r14);
		setRotationAngle(gun_r14, 0.0F, 0.0F, 0.7854F);
		gun_r14.cubeList.add(new ModelBox(gun_r14, 312, 604, 2.0F, -0.4F, -0.5F, 2, 1, 3, 0.3F, false));
		gun_r14.cubeList.add(new ModelBox(gun_r14, 504, 308, -0.5F, 0.0F, -0.5F, 5, 1, 3, 0.3F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bipodG1.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}