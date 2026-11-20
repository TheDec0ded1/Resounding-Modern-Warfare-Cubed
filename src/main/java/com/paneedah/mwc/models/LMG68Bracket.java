package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class LMG68Bracket extends ModelBase {
	private final ModelRenderer bracket;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;

	public LMG68Bracket() {
		textureWidth = 416;
		textureHeight = 416;

		bracket = new ModelRenderer(this);
		bracket.setRotationPoint(0.0F, 23.7F, 0.0F);
		bracket.cubeList.add(new ModelBox(bracket, 376, 166, -3.499F, -34.525F, -32.8F, 4, 1, 4, 0.0F, false));
		bracket.cubeList.add(new ModelBox(bracket, 348, 242, -3.499F, -33.525F, -35.8F, 4, 1, 9, 0.0F, false));
		bracket.cubeList.add(new ModelBox(bracket, 270, 392, -3.499F, -32.525F, -35.8F, 1, 1, 2, 0.0F, false));
		bracket.cubeList.add(new ModelBox(bracket, 392, 273, -0.499F, -32.525F, -35.8F, 1, 1, 2, 0.0F, false));
		bracket.cubeList.add(new ModelBox(bracket, 72, 368, -3.499F, -32.525F, -33.8F, 1, 2, 7, 0.0F, false));
		bracket.cubeList.add(new ModelBox(bracket, 88, 368, -0.499F, -32.525F, -33.8F, 1, 2, 7, 0.0F, false));
		bracket.cubeList.add(new ModelBox(bracket, 376, 171, -0.299F, -33.225F, -36.3F, 1, 1, 6, 0.0F, false));
		bracket.cubeList.add(new ModelBox(bracket, 376, 178, -3.699F, -33.225F, -36.3F, 1, 1, 6, 0.0F, false));
		bracket.cubeList.add(new ModelBox(bracket, 310, 391, -2.2061F, -33.525F, -27.0929F, 2, 3, 1, 0.0F, false));
		bracket.cubeList.add(new ModelBox(bracket, 394, 260, -2.7919F, -33.525F, -27.0929F, 1, 3, 1, 0.0F, false));
		bracket.cubeList.add(new ModelBox(bracket, 154, 395, -2.7919F, -33.525F, -36.5071F, 1, 2, 1, 0.0F, false));
		bracket.cubeList.add(new ModelBox(bracket, 392, 257, -2.2061F, -33.525F, -36.5071F, 2, 2, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.7919F, -33.025F, -26.8F);
		bracket.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.7854F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 394, 198, -0.5F, -0.5F, -0.5F, 1, 3, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-0.2061F, -33.025F, -26.8F);
		bracket.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.7854F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 200, 394, -0.5F, -0.5F, -0.5F, 1, 3, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-2.7919F, -33.025F, -35.8F);
		bracket.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.7854F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 150, 395, -0.5F, -0.5F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-0.2061F, -33.025F, -35.8F);
		bracket.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.7854F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 138, 395, -0.5F, -0.5F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-1.499F, -31.5082F, -34.3324F);
		bracket.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.6109F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 276, 392, -2.0F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 392, 276, 1.0F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bracket.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}