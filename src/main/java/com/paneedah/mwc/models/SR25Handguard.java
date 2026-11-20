package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SR25Handguard extends ModelBase {
	private final ModelRenderer handguardSR25;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer WIP3;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;

	public SR25Handguard() {
		textureWidth = 544;
		textureHeight = 544;

		handguardSR25 = new ModelRenderer(this);
		handguardSR25.setRotationPoint(0.0F, 24.0F, 0.0F);
		handguardSR25.cubeList.add(new ModelBox(handguardSR25, 102, 92, -3.0F, -41.95F, -68.925F, 3, 1, 40, -0.05F, false));
		handguardSR25.cubeList.add(new ModelBox(handguardSR25, 204, 0, 1.0506F, -39.8994F, -68.925F, 1, 3, 40, -0.05F, false));
		handguardSR25.cubeList.add(new ModelBox(handguardSR25, 0, 153, -3.0F, -35.8488F, -68.925F, 3, 1, 40, -0.05F, false));
		handguardSR25.cubeList.add(new ModelBox(handguardSR25, 164, 215, -5.0506F, -39.8994F, -68.925F, 1, 3, 40, -0.05F, false));
		handguardSR25.cubeList.add(new ModelBox(handguardSR25, 488, 158, -2.5F, -36.0F, -61.0F, 2, 2, 2, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-5.0713F, -36.2423F, -29.925F);
		handguardSR25.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 82, 215, 0.5F, -0.5F, -39.0F, 1, 3, 40, -0.05F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.6571F, -36.2423F, -29.925F);
		handguardSR25.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 102, 133, -1.5F, -0.5F, -39.0F, 3, 1, 40, -0.05F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-0.7571F, -40.5565F, -29.925F);
		handguardSR25.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.7854F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 194, 0.5F, -0.5F, -39.0F, 1, 3, 40, -0.05F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-3.6571F, -40.5565F, -29.925F);
		handguardSR25.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.7854F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 102, 51, -1.5F, -0.5F, -39.0F, 3, 1, 40, -0.05F, false));

		WIP3 = new ModelRenderer(this);
		WIP3.setRotationPoint(0.5F, -47.1347F, -36.3831F);
		handguardSR25.addChild(WIP3);
		WIP3.cubeList.add(new ModelBox(WIP3, 408, 164, -5.6213F, 7.2213F, 7.4F, 2, 3, 3, 0.0F, false));
		WIP3.cubeList.add(new ModelBox(WIP3, 418, 203, -3.5F, 5.1F, 7.4F, 3, 1, 3, 0.0F, false));
		WIP3.cubeList.add(new ModelBox(WIP3, 144, 481, 1.0213F, 8.1213F, 7.3F, 1, 1, 3, -0.1F, false));
		WIP3.cubeList.add(new ModelBox(WIP3, 58, 482, -2.4F, 4.7F, 7.3F, 1, 1, 3, -0.1F, false));
		WIP3.cubeList.add(new ModelBox(WIP3, 66, 482, -2.6F, 11.7426F, 7.3F, 1, 1, 3, -0.1F, false));
		WIP3.cubeList.add(new ModelBox(WIP3, 122, 488, -6.0213F, 8.1213F, 7.3F, 1, 1, 3, -0.1F, false));
		WIP3.cubeList.add(new ModelBox(WIP3, 418, 207, -0.3787F, 7.2213F, 7.4F, 2, 3, 3, 0.0F, false));
		WIP3.cubeList.add(new ModelBox(WIP3, 422, 371, -3.5F, 11.3426F, 7.4F, 3, 1, 3, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(1.2678F, 10.5749F, 9.4F);
		WIP3.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 0.7854F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 156, 387, -1.0F, -0.5F, -2.0F, 1, 3, 3, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-5.8033F, 4.0695F, 9.3F);
		WIP3.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, 0.7854F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 114, 488, 9.0F, 1.0F, -2.0F, 1, 1, 3, -0.1F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-7.2175F, 2.6553F, 9.3F);
		WIP3.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.0F, 0.7854F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 136, 486, 11.0F, -1.0F, -2.0F, 1, 1, 3, -0.1F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-12.6924F, 4.423F, 9.3F);
		WIP3.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, 0.7854F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 144, 485, 9.0F, -1.5F, -2.0F, 1, 1, 3, -0.1F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 484, 451, 11.0F, -1.5F, -2.0F, 1, 1, 3, -0.1F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(-4.7728F, 5.1F, 9.3F);
		WIP3.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, 0.0F, 0.7854F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 484, 447, 0.5F, -1.0F, -2.0F, 1, 1, 3, -0.1F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-3.3586F, 6.5142F, 9.3F);
		WIP3.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, 0.0F, 0.7854F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 136, 482, -1.5F, 1.0F, -2.0F, 1, 1, 3, -0.1F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(0.4192F, 6.8678F, 9.3F);
		WIP3.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.0F, 0.0F, 0.7854F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 480, 158, 0.0F, -1.0F, -2.0F, 1, 1, 3, -0.1F, false));
		cube_r29.cubeList.add(new ModelBox(cube_r29, 478, 211, -2.0F, -1.0F, -2.0F, 1, 1, 3, -0.1F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(0.5607F, 6.8678F, 9.4F);
		WIP3.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.0F, 0.0F, 0.7854F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 328, 125, -2.0F, -0.5F, -2.0F, 3, 2, 3, 0.0F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(-3.8535F, 6.8678F, 25.4F);
		WIP3.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.0F, 0.0F, 0.7854F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 416, 119, -1.0F, -1.5F, -18.0F, 2, 3, 3, 0.0F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(-4.5607F, 10.5749F, 25.4F);
		WIP3.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.0F, 0.0F, 0.7854F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 410, 375, -1.0F, -0.5F, -18.0F, 3, 1, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handguardSR25.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}