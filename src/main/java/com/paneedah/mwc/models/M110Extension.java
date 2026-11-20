package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M110Extension extends ModelBase {
	private final ModelRenderer extension;
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

	public M110Extension() {
		textureWidth = 544;
		textureHeight = 544;

		extension = new ModelRenderer(this);
		extension.setRotationPoint(0.0F, 31.25F, -2.0F);
		extension.cubeList.add(new ModelBox(extension, 420, 153, -2.0F, -47.1F, 4.999F, 1, 1, 28, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.2701F, -45.2934F, 18.499F);
		extension.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 1.1781F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 174, 448, -1.2413F, -0.7241F, -13.5F, 1, 1, 28, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.2701F, -45.2934F, 18.499F);
		extension.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 1.9635F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 116, 448, 0.2413F, -0.7241F, -13.5F, 1, 1, 28, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-0.2701F, -45.2934F, 18.499F);
		extension.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 58, 448, -0.5F, -0.5766F, -13.5F, 1, 1, 28, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.5F, -44.0635F, 18.499F);
		extension.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 2.7489F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 448, -1.2413F, -0.7241F, -13.5F, 1, 1, 28, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.5F, -44.0635F, 18.499F);
		extension.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -2.7489F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 272, 444, 0.2413F, -0.7241F, -13.5F, 1, 1, 28, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-2.0F, -44.8135F, 18.5F);
		extension.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 3.1416F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 56, 515, -1.5F, -0.5766F, 13.5F, 2, 2, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.5F, -44.0635F, 18.499F);
		extension.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 3.1416F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 424, 441, -0.5F, -0.5766F, -13.5F, 1, 1, 28, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-2.7299F, -45.2934F, 18.499F);
		extension.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -1.9635F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 366, 441, -1.2413F, -0.7241F, -13.5F, 1, 1, 28, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-2.7299F, -45.2934F, 18.499F);
		extension.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -1.1781F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 422, 87, 0.2413F, -0.7241F, -13.5F, 1, 1, 28, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-2.7299F, -45.2934F, 18.499F);
		extension.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -1.5708F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 422, 58, -0.5F, -0.5766F, -13.5F, 1, 1, 28, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-2.2706F, -46.4467F, 18.499F);
		extension.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.3927F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 422, 29, -0.5F, -0.5F, -13.5F, 1, 1, 28, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-0.7294F, -46.4467F, 18.499F);
		extension.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, 0.3927F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 422, 0, -0.5F, -0.5F, -13.5F, 1, 1, 28, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		extension.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}