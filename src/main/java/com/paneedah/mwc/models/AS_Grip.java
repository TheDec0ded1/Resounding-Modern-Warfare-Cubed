package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AS_Grip extends ModelBase {
	private final ModelRenderer grip2;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;

	public AS_Grip() {
		textureWidth = 256;
		textureHeight = 256;

		grip2 = new ModelRenderer(this);
		grip2.setRotationPoint(0.0F, 24.0F, 0.0F);
		grip2.cubeList.add(new ModelBox(grip2, 182, 34, -2.8F, -31.0F, -5.8F, 3, 1, 6, 0.0F, false));
		grip2.cubeList.add(new ModelBox(grip2, 192, 150, -2.8F, -30.2F, -5.8F, 3, 1, 5, -0.001F, false));
		grip2.cubeList.add(new ModelBox(grip2, 155, 197, -2.8F, -29.2F, -6.2F, 3, 2, 4, -0.001F, false));
		grip2.cubeList.add(new ModelBox(grip2, 67, 200, -2.798F, -18.6485F, -4.8285F, 3, 1, 4, 0.0F, false));
		grip2.cubeList.add(new ModelBox(grip2, 193, 130, -2.8F, -27.95F, -6.65F, 3, 1, 2, 0.0F, false));
		grip2.cubeList.add(new ModelBox(grip2, 210, 63, -3.2F, -29.2F, -6.2F, 1, 2, 4, -0.001F, false));
		grip2.cubeList.add(new ModelBox(grip2, 201, 29, -3.2F, -30.2F, -5.8F, 1, 1, 5, -0.001F, false));
		grip2.cubeList.add(new ModelBox(grip2, 193, 87, -3.2F, -31.0F, -5.8F, 1, 1, 6, 0.001F, false));
		grip2.cubeList.add(new ModelBox(grip2, 217, 137, -3.198F, -18.6485F, -4.8285F, 1, 1, 4, -0.001F, false));
		grip2.cubeList.add(new ModelBox(grip2, 46, 228, -3.2F, -27.95F, -6.65F, 1, 1, 2, -0.001F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-3.6F, -29.1F, 16.6F);
		grip2.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.4538F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 207, 225, 0.4F, 8.1121F, -20.9658F, 1, 4, 1, -0.003F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 203, 219, 0.8F, 8.1121F, -20.9658F, 3, 4, 1, -0.002F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-3.6F, -20.95F, 23.6F);
		grip2.addChild(cube_r10);
		setRotationAngle(cube_r10, -1.2392F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 193, 122, 0.402F, 21.5357F, -15.9734F, 1, 1, 6, -0.003F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 182, 42, 0.802F, 21.5357F, -15.9734F, 3, 1, 6, -0.001F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-3.6F, -20.95F, 23.6F);
		grip2.addChild(cube_r11);
		setRotationAngle(cube_r11, -1.4312F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 82, 200, 0.404F, 23.0457F, -5.684F, 1, 1, 5, -0.001F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 178, 80, 0.804F, 23.0457F, -5.684F, 3, 1, 5, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-3.6F, -15.8F, 17.9F);
		grip2.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.7854F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 232, 32, 0.402F, -18.0857F, -14.0573F, 1, 1, 1, -0.002F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 225, 56, 0.802F, -18.0857F, -14.0573F, 3, 1, 1, -0.001F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-3.6F, -14.8F, 21.9F);
		grip2.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.4712F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 46, 232, 0.402F, -13.8558F, -18.9586F, 1, 1, 1, -0.002F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 231, 163, 0.402F, -13.8558F, -18.2586F, 1, 1, 1, -0.003F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 225, 59, 0.802F, -13.8558F, -18.9586F, 3, 1, 1, -0.001F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 197, 119, 0.802F, -13.8558F, -18.2586F, 3, 1, 1, -0.002F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-3.6F, -26.65F, 21.3F);
		grip2.addChild(cube_r14);
		setRotationAngle(cube_r14, -1.3439F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 150, 152, 0.4F, 22.3985F, -6.8903F, 1, 4, 10, 0.002F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 141, 137, 0.8F, 22.3985F, -6.8903F, 3, 4, 10, 0.001F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-3.6F, -28.1F, 23.6F);
		grip2.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.8378F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 14, 230, 0.402F, 16.117F, -18.067F, 1, 3, 1, -0.003F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 220, 150, 0.802F, 16.117F, -18.067F, 3, 3, 1, -0.002F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		grip2.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}