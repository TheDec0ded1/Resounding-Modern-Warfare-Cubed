package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class OSV96Grip extends ModelBase {
	private final ModelRenderer grip;
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

	public OSV96Grip() {
		textureWidth = 688;
		textureHeight = 688;

		grip = new ModelRenderer(this);
		grip.setRotationPoint(0.0F, 33.0F, 2.0F);
		grip.cubeList.add(new ModelBox(grip, 550, 457, -3.5F, -39.8366F, -7.7932F, 4, 2, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 628, 436, -3.5F, -40.4738F, -7.0971F, 4, 3, 5, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 646, 439, -3.5F, -40.8238F, -5.597F, 4, 1, 4, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 656, 273, -3.5F, -37.4706F, -8.1593F, 4, 1, 3, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.5F, -32.1111F, -10.0915F);
		grip.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.4363F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 286, 631, -2.0F, -12.0F, 4.0F, 4, 2, 1, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.5F, -40.0196F, -7.4763F);
		grip.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.5236F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 110, 649, -2.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-1.5F, -28.882F, -5.2185F);
		grip.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.4363F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 640, 532, -2.0F, 0.0F, 4.0F, 4, 1, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.5F, -32.2919F, -1.4347F);
		grip.addChild(cube_r7);
		setRotationAngle(cube_r7, 1.0036F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 636, 656, -2.001F, -3.0F, 3.0F, 4, 3, 2, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-1.5F, -32.6717F, -2.1062F);
		grip.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.6545F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 656, 567, -2.001F, -1.0F, 2.0F, 4, 3, 3, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-1.5F, -28.6953F, -2.093F);
		grip.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.4363F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 586, 656, -2.001F, 2.0F, 1.2F, 4, 1, 3, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 264, 635, -2.0F, -9.5F, -0.2F, 4, 12, 5, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-1.5F, -29.2967F, -0.1856F);
		grip.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.4363F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 654, 645, -2.001F, -3.0F, 2.0F, 4, 6, 3, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-1.5F, -38.5527F, -7.513F);
		grip.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0873F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 578, 628, -2.0F, -2.7F, -0.5F, 4, 1, 8, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-1.5F, -29.5239F, 1.6732F);
		grip.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.3054F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 272, 665, -2.0F, -11.0F, -1.0F, 4, 3, 1, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-1.5F, -37.2206F, -7.7263F);
		grip.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.5236F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 630, 532, -2.0F, -1.0F, -0.5F, 4, 1, 1, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-1.5F, -27.1874F, 0.8452F);
		grip.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.3054F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 618, 523, -2.0F, 0.0F, -3.0F, 4, 1, 8, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		grip.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}