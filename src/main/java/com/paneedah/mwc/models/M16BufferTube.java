package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M16BufferTube extends ModelBase {
	private final ModelRenderer extension;
	private final ModelRenderer cubeSR2_r1;
	private final ModelRenderer cubeSR2_r2;
	private final ModelRenderer cubeSR2_r3;
	private final ModelRenderer cubeSR2_r4;
	private final ModelRenderer cubeSR2_r5;
	private final ModelRenderer cubeSR2_r6;
	private final ModelRenderer cubeSR2_r7;
	private final ModelRenderer cubeSR2_r8;
	private final ModelRenderer cubeSR2_r9;
	private final ModelRenderer cubeSR2_r10;
	private final ModelRenderer cubeSR2_r11;
	private final ModelRenderer cubeSR2_r12;

	public M16BufferTube() {
		textureWidth = 672;
		textureHeight = 672;

		extension = new ModelRenderer(this);
		extension.setRotationPoint(0.0F, 31.25F, -2.0F);
		extension.cubeList.add(new ModelBox(extension, 548, 252, -2.0F, -47.1F, 4.999F, 1, 1, 28, 0.0F, false));

		cubeSR2_r1 = new ModelRenderer(this);
		cubeSR2_r1.setRotationPoint(-0.2701F, -45.2934F, 18.499F);
		extension.addChild(cubeSR2_r1);
		setRotationAngle(cubeSR2_r1, 0.0F, 0.0F, 1.1781F);
		cubeSR2_r1.cubeList.add(new ModelBox(cubeSR2_r1, 436, 552, -1.2413F, -0.7241F, -13.5F, 1, 1, 28, 0.0F, false));

		cubeSR2_r2 = new ModelRenderer(this);
		cubeSR2_r2.setRotationPoint(-0.2701F, -45.2934F, 18.499F);
		extension.addChild(cubeSR2_r2);
		setRotationAngle(cubeSR2_r2, 0.0F, 0.0F, 1.9635F);
		cubeSR2_r2.cubeList.add(new ModelBox(cubeSR2_r2, 326, 553, 0.2413F, -0.7241F, -13.5F, 1, 1, 28, 0.0F, false));

		cubeSR2_r3 = new ModelRenderer(this);
		cubeSR2_r3.setRotationPoint(-0.2701F, -45.2934F, 18.499F);
		extension.addChild(cubeSR2_r3);
		setRotationAngle(cubeSR2_r3, 0.0F, 0.0F, 1.5708F);
		cubeSR2_r3.cubeList.add(new ModelBox(cubeSR2_r3, 554, 105, -0.5F, -0.5766F, -13.5F, 1, 1, 28, 0.0F, false));

		cubeSR2_r4 = new ModelRenderer(this);
		cubeSR2_r4.setRotationPoint(-1.5F, -44.0635F, 18.499F);
		extension.addChild(cubeSR2_r4);
		setRotationAngle(cubeSR2_r4, 0.0F, 0.0F, 2.7489F);
		cubeSR2_r4.cubeList.add(new ModelBox(cubeSR2_r4, 494, 554, -1.2413F, -0.7241F, -13.5F, 1, 1, 28, 0.0F, false));

		cubeSR2_r5 = new ModelRenderer(this);
		cubeSR2_r5.setRotationPoint(-1.5F, -44.0635F, 18.499F);
		extension.addChild(cubeSR2_r5);
		setRotationAngle(cubeSR2_r5, 0.0F, 0.0F, -2.7489F);
		cubeSR2_r5.cubeList.add(new ModelBox(cubeSR2_r5, 552, 554, 0.2413F, -0.7241F, -13.5F, 1, 1, 28, 0.0F, false));

		cubeSR2_r6 = new ModelRenderer(this);
		cubeSR2_r6.setRotationPoint(-2.0F, -44.8135F, 18.499F);
		extension.addChild(cubeSR2_r6);
		setRotationAngle(cubeSR2_r6, 0.0F, 0.0F, 3.1416F);
		cubeSR2_r6.cubeList.add(new ModelBox(cubeSR2_r6, 486, 653, -1.5F, -0.5766F, 13.5F, 2, 2, 1, 0.0F, false));

		cubeSR2_r7 = new ModelRenderer(this);
		cubeSR2_r7.setRotationPoint(-1.5F, -44.0635F, 18.499F);
		extension.addChild(cubeSR2_r7);
		setRotationAngle(cubeSR2_r7, 0.0F, 0.0F, 3.1416F);
		cubeSR2_r7.cubeList.add(new ModelBox(cubeSR2_r7, 0, 555, -0.5F, -0.5766F, -13.5F, 1, 1, 28, 0.0F, false));

		cubeSR2_r8 = new ModelRenderer(this);
		cubeSR2_r8.setRotationPoint(-2.7299F, -45.2934F, 18.499F);
		extension.addChild(cubeSR2_r8);
		setRotationAngle(cubeSR2_r8, 0.0F, 0.0F, -1.9635F);
		cubeSR2_r8.cubeList.add(new ModelBox(cubeSR2_r8, 262, 555, -1.2413F, -0.7241F, -13.5F, 1, 1, 28, 0.0F, false));

		cubeSR2_r9 = new ModelRenderer(this);
		cubeSR2_r9.setRotationPoint(-2.7299F, -45.2934F, 18.499F);
		extension.addChild(cubeSR2_r9);
		setRotationAngle(cubeSR2_r9, 0.0F, 0.0F, -1.1781F);
		cubeSR2_r9.cubeList.add(new ModelBox(cubeSR2_r9, 58, 556, 0.2413F, -0.7241F, -13.5F, 1, 1, 28, 0.0F, false));

		cubeSR2_r10 = new ModelRenderer(this);
		cubeSR2_r10.setRotationPoint(-2.7299F, -45.2934F, 18.499F);
		extension.addChild(cubeSR2_r10);
		setRotationAngle(cubeSR2_r10, 0.0F, 0.0F, -1.5708F);
		cubeSR2_r10.cubeList.add(new ModelBox(cubeSR2_r10, 116, 556, -0.5F, -0.5766F, -13.5F, 1, 1, 28, 0.0F, false));

		cubeSR2_r11 = new ModelRenderer(this);
		cubeSR2_r11.setRotationPoint(-2.2706F, -46.4467F, 18.499F);
		extension.addChild(cubeSR2_r11);
		setRotationAngle(cubeSR2_r11, 0.0F, 0.0F, -0.3927F);
		cubeSR2_r11.cubeList.add(new ModelBox(cubeSR2_r11, 550, 175, -0.5F, -0.5F, -13.5F, 1, 1, 28, 0.0F, false));

		cubeSR2_r12 = new ModelRenderer(this);
		cubeSR2_r12.setRotationPoint(-0.7294F, -46.4467F, 18.499F);
		extension.addChild(cubeSR2_r12);
		setRotationAngle(cubeSR2_r12, 0.0F, 0.0F, 0.3927F);
		cubeSR2_r12.cubeList.add(new ModelBox(cubeSR2_r12, 550, 146, -0.5F, -0.5F, -13.5F, 1, 1, 28, 0.0F, false));
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