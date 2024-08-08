package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AS_Grip extends ModelBase {
	private final ModelRenderer grip2;
	private final ModelRenderer cube_r33;
	private final ModelRenderer cube_r34;
	private final ModelRenderer cube_r35;
	private final ModelRenderer cube_r36;
	private final ModelRenderer cube_r37;
	private final ModelRenderer cube_r38;
	private final ModelRenderer cube_r39;

	public AS_Grip() {
		textureWidth = 256;
		textureHeight = 256;

		grip2 = new ModelRenderer(this);
		grip2.setRotationPoint(0.0F, 24.0F, 0.0F);
		grip2.cubeList.add(new ModelBox(grip2, 129, 114, -2.6F, -31.0F, -5.8F, 3, 1, 6, 0.0F, false));
		grip2.cubeList.add(new ModelBox(grip2, 145, 53, -2.6F, -30.2F, -5.8F, 3, 1, 5, -0.001F, false));
		grip2.cubeList.add(new ModelBox(grip2, 148, 115, -2.6F, -29.2F, -6.2F, 3, 2, 4, -0.001F, false));
		grip2.cubeList.add(new ModelBox(grip2, 85, 116, -2.598F, -18.6485F, -4.8285F, 3, 1, 4, 0.0F, false));
		grip2.cubeList.add(new ModelBox(grip2, 96, 73, -2.6F, -27.95F, -6.65F, 3, 1, 2, 0.0F, false));
		grip2.cubeList.add(new ModelBox(grip2, 48, 51, -3.2F, -29.2F, -6.2F, 1, 2, 4, -0.001F, false));
		grip2.cubeList.add(new ModelBox(grip2, 65, 51, -3.2F, -30.2F, -5.8F, 1, 1, 5, -0.001F, false));
		grip2.cubeList.add(new ModelBox(grip2, 16, 54, -3.2F, -31.0F, -5.8F, 1, 1, 6, 0.001F, false));
		grip2.cubeList.add(new ModelBox(grip2, 27, 159, -3.198F, -18.6485F, -4.8285F, 1, 1, 4, -0.001F, false));
		grip2.cubeList.add(new ModelBox(grip2, 32, 165, -3.2F, -27.95F, -6.65F, 1, 1, 2, -0.001F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(-3.6F, -29.1F, 16.6F);
		grip2.addChild(cube_r33);
		setRotationAngle(cube_r33, -0.4538F, 0.0F, 0.0F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 19, 19, 0.4F, 8.1121F, -20.9658F, 1, 4, 1, -0.003F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 160, 15, 1.0F, 8.1121F, -20.9658F, 3, 4, 1, -0.002F, false));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(-3.6F, -20.95F, 23.6F);
		grip2.addChild(cube_r34);
		setRotationAngle(cube_r34, -1.2392F, 0.0F, 0.0F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 19, 19, 0.402F, 21.5357F, -15.9734F, 1, 1, 6, -0.003F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 88, 65, 1.002F, 21.5357F, -15.9734F, 3, 1, 6, -0.001F, false));

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(-3.6F, -20.95F, 23.6F);
		grip2.addChild(cube_r35);
		setRotationAngle(cube_r35, -1.4312F, 0.0F, 0.0F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 58, 35, 0.404F, 23.0457F, -5.684F, 1, 1, 5, -0.001F, false));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 12, 116, 1.004F, 23.0457F, -5.684F, 3, 1, 5, 0.0F, false));

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(-3.6F, -15.8F, 17.9F);
		grip2.addChild(cube_r36);
		setRotationAngle(cube_r36, 0.7854F, 0.0F, 0.0F);
		cube_r36.cubeList.add(new ModelBox(cube_r36, 100, 26, 0.402F, -18.0857F, -14.0573F, 1, 1, 1, -0.002F, false));
		cube_r36.cubeList.add(new ModelBox(cube_r36, 47, 73, 1.002F, -18.0857F, -14.0573F, 3, 1, 1, -0.001F, false));

		cube_r37 = new ModelRenderer(this);
		cube_r37.setRotationPoint(-3.6F, -14.8F, 21.9F);
		grip2.addChild(cube_r37);
		setRotationAngle(cube_r37, 0.4712F, 0.0F, 0.0F);
		cube_r37.cubeList.add(new ModelBox(cube_r37, 22, 101, 0.402F, -13.8558F, -18.9586F, 1, 1, 1, -0.002F, false));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 18, 48, 0.402F, -13.8558F, -18.2586F, 1, 1, 1, -0.003F, false));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 85, 0, 1.002F, -13.8558F, -18.9586F, 3, 1, 1, -0.001F, false));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 61, 9, 1.002F, -13.8558F, -18.2586F, 3, 1, 1, -0.002F, false));

		cube_r38 = new ModelRenderer(this);
		cube_r38.setRotationPoint(-3.6F, -26.65F, 21.3F);
		grip2.addChild(cube_r38);
		setRotationAngle(cube_r38, -1.3439F, 0.0F, 0.0F);
		cube_r38.cubeList.add(new ModelBox(cube_r38, 105, 94, 0.4F, 22.3985F, -6.8903F, 1, 4, 10, 0.002F, false));
		cube_r38.cubeList.add(new ModelBox(cube_r38, 45, 82, 1.0F, 22.3985F, -6.8903F, 3, 4, 10, 0.001F, false));

		cube_r39 = new ModelRenderer(this);
		cube_r39.setRotationPoint(-3.6F, -28.1F, 23.6F);
		grip2.addChild(cube_r39);
		setRotationAngle(cube_r39, -0.8378F, 0.0F, 0.0F);
		cube_r39.cubeList.add(new ModelBox(cube_r39, 29, 38, 0.402F, 16.117F, -18.067F, 1, 3, 1, -0.003F, false));
		cube_r39.cubeList.add(new ModelBox(cube_r39, 63, 161, 1.002F, 16.117F, -18.067F, 3, 3, 1, -0.002F, false));
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