package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class OSV96Mag extends ModelBase {
	private final ModelRenderer magazine;
	private final ModelRenderer cube_r1;
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
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;

	public OSV96Mag() {
		textureWidth = 688;
		textureHeight = 688;

		magazine = new ModelRenderer(this);
		magazine.setRotationPoint(0.0F, 24.0F, 0.0F);
		magazine.cubeList.add(new ModelBox(magazine, 18, 667, -2.5F, -33.0F, -41.0F, 2, 2, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 24, 667, -1.0858F, -31.5858F, -41.0F, 2, 2, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 666, 142, -2.5F, -31.1716F, -41.0F, 2, 3, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 30, 667, -3.9142F, -31.5858F, -41.0F, 2, 2, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 606, 662, -3.5F, -36.0F, -17.5F, 4, 4, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 608, 101, -4.5F, -36.0F, -40.0F, 6, 11, 23, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 608, 390, -4.75F, -36.0F, -39.0F, 1, 2, 21, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 608, 413, 0.75F, -36.0F, -39.0F, 1, 2, 21, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 494, 444, -4.5F, -25.0F, -28.0F, 6, 1, 11, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 38, 643, 1.2F, -28.0F, -32.0F, 1, 1, 11, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 652, 367, 1.2F, -32.0F, -32.0F, 1, 1, 11, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 288, 653, -5.2F, -28.0F, -32.0F, 1, 1, 11, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 264, 653, -5.2F, -32.0F, -32.0F, 1, 1, 11, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 16, 670, 0.5F, -25.0F, -28.5F, 1, 1, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 12, 670, -4.5F, -25.0F, -28.5F, 1, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-4.3603F, -29.5F, -33.8828F);
		magazine.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -0.1745F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 192, 663, -0.5F, -2.5F, -2.0F, 1, 1, 4, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 202, 663, -0.5F, 1.5F, -2.0F, 1, 1, 4, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-6.9678F, -28.3535F, -26.5F);
		magazine.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.7854F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 652, 427, 1.0F, 1.5F, -5.5F, 1, 1, 11, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-4.8464F, -29.4749F, -26.5F);
		magazine.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 652, 593, -2.0F, 1.5F, -5.5F, 1, 1, 11, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(13.9883F, -13.8475F, -23.5F);
		magazine.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 608, 593, 1.0F, -27.5F, -15.5F, 1, 1, 21, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(19.7812F, -15.9688F, -23.5F);
		magazine.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 608, 615, -1.0F, -26.5F, -15.5F, 1, 1, 21, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(18.367F, -16.5546F, -23.5F);
		magazine.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.7854F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 608, 367, 1.0F, -27.5F, -15.5F, 1, 2, 21, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(15.4025F, -18.6759F, -23.5F);
		magazine.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.7854F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 608, 301, -2.0F, -26.5F, -15.5F, 2, 1, 21, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-2.018F, -31.6465F, -26.5F);
		magazine.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.7854F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 652, 605, -2.0F, -2.5F, -5.5F, 1, 1, 11, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-4.1393F, -28.5251F, -26.5F);
		magazine.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -0.7854F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 652, 617, 1.0F, -2.5F, -5.5F, 1, 1, 11, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-13.1908F, -29.5F, -29.7975F);
		magazine.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.3491F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 666, 113, 4.5F, -2.5F, 11.0F, 1, 1, 3, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 666, 117, 4.5F, 1.5F, 11.0F, 1, 1, 3, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.7939F, -29.5F, -33.2177F);
		magazine.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, -0.3491F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 554, 665, 4.5F, -2.5F, 11.0F, 1, 1, 3, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 584, 665, 4.5F, 1.5F, 11.0F, 1, 1, 3, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(1.3603F, -29.5F, -33.8828F);
		magazine.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.1745F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 616, 662, -0.5F, 1.5F, -2.0F, 1, 1, 4, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 626, 662, -0.5F, -2.5F, -2.0F, 1, 1, 4, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(1.8464F, -29.5251F, -26.5F);
		magazine.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, -0.7854F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 652, 403, 1.0F, -2.5F, -5.5F, 1, 1, 11, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-0.982F, -28.3535F, -26.5F);
		magazine.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, -0.7854F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 652, 415, 1.0F, 1.5F, -5.5F, 1, 1, 11, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(3.9678F, -30.6465F, -26.5F);
		magazine.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, -0.7854F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 652, 379, -2.0F, -2.5F, -5.5F, 1, 1, 11, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(1.1393F, -29.4749F, -26.5F);
		magazine.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, -0.7854F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 652, 391, -2.0F, 1.5F, -5.5F, 1, 1, 11, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-1.5F, -31.4692F, -27.8901F);
		magazine.addChild(cube_r20);
		setRotationAngle(cube_r20, -0.0873F, 0.0F, 0.0F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 608, 135, -3.0F, 6.5F, -11.5F, 6, 1, 23, 0.0F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-0.5F, -29.5858F, -40.5F);
		magazine.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, -0.7854F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 36, 667, -1.0F, -1.0F, -0.5F, 2, 2, 1, 0.0F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-2.5F, -29.5858F, -40.5F);
		magazine.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.0F, -0.7854F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 42, 667, -1.0F, -1.0F, -0.5F, 2, 2, 1, 0.0F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-0.5F, -31.5858F, -40.5F);
		magazine.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, -0.7854F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 667, -1.0F, -1.0F, -0.5F, 2, 2, 1, 0.0F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(-2.5F, -31.5858F, -40.5F);
		magazine.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, 0.0F, -0.7854F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 646, 436, -1.0F, -1.0F, -0.5F, 2, 2, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		magazine.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}