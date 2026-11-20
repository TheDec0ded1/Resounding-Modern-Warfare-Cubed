package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class LR300Handguard extends ModelBase {
	private final ModelRenderer handguard;
	private final ModelRenderer cube_r1;
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
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;

	public LR300Handguard() {
		textureWidth = 368;
		textureHeight = 368;

		handguard = new ModelRenderer(this);
		handguard.setRotationPoint(0.0F, 21.7F, 1.0F);
		handguard.cubeList.add(new ModelBox(handguard, 240, 251, -2.5F, -33.7F, -43.7F, 2, 1, 20, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 346, 12, -2.0059F, -40.1866F, -26.701F, 1, 1, 2, -0.3F, false));
		handguard.cubeList.add(new ModelBox(handguard, 346, 15, -2.0059F, -40.1866F, -29.201F, 1, 1, 2, -0.3F, false));
		handguard.cubeList.add(new ModelBox(handguard, 346, 18, -2.0059F, -40.1866F, -31.701F, 1, 1, 2, -0.3F, false));
		handguard.cubeList.add(new ModelBox(handguard, 346, 63, -2.0059F, -40.1866F, -34.201F, 1, 1, 2, -0.3F, false));
		handguard.cubeList.add(new ModelBox(handguard, 346, 66, -2.0059F, -40.1866F, -36.701F, 1, 1, 2, -0.3F, false));
		handguard.cubeList.add(new ModelBox(handguard, 346, 69, -2.0059F, -40.1866F, -39.201F, 1, 1, 2, -0.3F, false));
		handguard.cubeList.add(new ModelBox(handguard, 346, 84, -2.0059F, -40.1866F, -41.701F, 1, 1, 2, -0.3F, false));
		handguard.cubeList.add(new ModelBox(handguard, 342, 332, -2.0059F, -40.1866F, -45.201F, 1, 1, 3, -0.3F, false));
		handguard.cubeList.add(new ModelBox(handguard, 150, 346, -2.0059F, -40.1866F, -45.701F, 1, 1, 2, -0.3F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.0137F, -33.7137F, -34.7F);
		handguard.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 44, 256, 1.0F, -4.5F, -9.0F, 2, 1, 20, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(1.0137F, -33.7137F, -34.7F);
		handguard.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -1.5708F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 256, 1.0F, -0.5F, -9.0F, 2, 1, 20, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-3.9961F, -40.0115F, -35.702F);
		handguard.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -1.1781F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 164, 346, -0.6F, 1.5F, -6.0F, 1, 1, 2, -0.3F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 346, 162, -0.6F, 1.5F, -10.0F, 1, 1, 2, -0.3F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 16, 343, -0.6F, 1.5F, -9.5F, 1, 1, 3, -0.3F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 132, 346, -0.6F, 1.5F, -1.0F, 1, 1, 2, -0.3F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 126, 346, -0.6F, 1.5F, -3.5F, 1, 1, 2, -0.3F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 120, 346, -0.6F, 1.5F, 4.0F, 1, 1, 2, -0.3F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 84, 347, -0.6F, 1.5F, 1.5F, 1, 1, 2, -0.3F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 346, 90, -0.6F, 1.5F, 6.5F, 1, 1, 2, -0.3F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 346, 87, -0.6F, 1.5F, 9.0F, 1, 1, 2, -0.3F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 240, 185, -1.0F, 1.5F, -10.0F, 1, 1, 21, -0.3F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.9941F, -40.0115F, -36.201F);
		handguard.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, 1.1781F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 138, 346, -0.4F, 1.5F, -9.5F, 1, 1, 2, -0.3F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 346, 9, -0.4F, 1.5F, -5.5F, 1, 1, 2, -0.3F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 342, 303, -0.4F, 1.5F, -9.0F, 1, 1, 3, -0.3F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 346, 6, -0.4F, 1.5F, -0.5F, 1, 1, 2, -0.3F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 346, 3, -0.4F, 1.5F, -3.0F, 1, 1, 2, -0.3F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 346, 0, -0.4F, 1.5F, 4.5F, 1, 1, 2, -0.3F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 346, -0.4F, 1.5F, 2.0F, 1, 1, 2, -0.3F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 208, 345, -0.4F, 1.5F, 7.0F, 1, 1, 2, -0.3F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 344, 343, -0.4F, 1.5F, 9.5F, 1, 1, 2, -0.3F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 240, 119, 0.0F, 1.5F, -9.5F, 1, 1, 21, -0.3F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-0.1694F, -41.3572F, -35.701F);
		handguard.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, 0.3927F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 240, 163, -0.8F, 1.5F, -10.0F, 1, 1, 21, -0.3F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-2.8326F, -41.3572F, -35.702F);
		handguard.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -0.3927F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 240, 229, -0.2F, 1.5F, -10.0F, 1, 1, 21, -0.3F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-3.7838F, -40.4315F, -35.702F);
		handguard.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, -0.9163F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 240, 207, -0.2F, 1.5F, -10.0F, 1, 1, 21, -0.3F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.7818F, -40.4315F, -35.701F);
		handguard.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, 0.9163F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 240, 141, -0.8F, 1.5F, -10.0F, 1, 1, 21, -0.3F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-3.669F, -37.4462F, -34.7F);
		handguard.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, -1.1781F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 284, 161, -1.0F, -0.5F, -9.0F, 1, 1, 20, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.6691F, -37.4462F, -34.7F);
		handguard.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, 1.1781F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 284, 140, 0.0F, -0.5F, -9.0F, 1, 1, 20, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-3.2325F, -37.8827F, -34.7F);
		handguard.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, -0.3927F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 284, 119, 0.0F, -0.5F, -9.0F, 1, 1, 20, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.2325F, -37.8827F, -34.7F);
		handguard.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, 0.3927F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 168, 279, -1.0F, -0.5F, -9.0F, 1, 1, 20, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-2.3087F, -33.1619F, -34.7F);
		handguard.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, 0.3927F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 126, 277, -1.0F, -0.5F, -9.0F, 1, 1, 20, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-0.6913F, -33.1619F, -34.7F);
		handguard.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, -0.3927F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 84, 277, 0.0F, -0.5F, -9.0F, 1, 1, 20, 0.0F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-3.0703F, -37.284F, -34.7F);
		handguard.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, 0.7854F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 42, 277, -1.0F, -0.5F, -9.0F, 1, 1, 20, 0.0F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(0.0703F, -37.284F, -34.7F);
		handguard.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, -0.7854F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 277, 0.0F, -0.5F, -9.0F, 1, 1, 20, 0.0F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(0.0703F, -33.4362F, -34.7F);
		handguard.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.0F, -0.7854F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 258, 272, 0.0F, -0.5F, -9.0F, 1, 1, 20, 0.0F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-3.0703F, -33.4362F, -34.7F);
		handguard.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, 0.7854F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 216, 272, -1.0F, -0.5F, -9.0F, 1, 1, 20, 0.0F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(0.6691F, -33.9811F, -34.7F);
		handguard.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, 0.0F, -1.1781F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 174, 258, 0.0F, -0.5F, -9.0F, 1, 1, 20, 0.0F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-3.669F, -33.9811F, -34.7F);
		handguard.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, 0.0F, 1.1781F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 132, 256, -1.0F, -0.5F, -9.0F, 1, 1, 20, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handguard.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}