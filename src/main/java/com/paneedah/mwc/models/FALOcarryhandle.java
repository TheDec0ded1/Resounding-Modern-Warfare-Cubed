package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FALOcarryhandle extends ModelBase {
	private final ModelRenderer carryhandleFALO;
	private final ModelRenderer bone80;
	private final ModelRenderer bone80_r1;
	private final ModelRenderer bone7;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;

	public FALOcarryhandle() {
		textureWidth = 624;
		textureHeight = 624;

		carryhandleFALO = new ModelRenderer(this);
		carryhandleFALO.setRotationPoint(-1.1332F, -16.3229F, -30.1436F);
		carryhandleFALO.cubeList.add(new ModelBox(carryhandleFALO, 574, 449, -5.3157F, 6.1249F, -0.5F, 1, 1, 1, 0.0F, false));
		carryhandleFALO.cubeList.add(new ModelBox(carryhandleFALO, 60, 520, -5.3157F, 3.1249F, 0.5F, 1, 4, 1, 0.0F, false));

		bone80 = new ModelRenderer(this);
		bone80.setRotationPoint(0.0F, 0.0F, 0.0F);
		carryhandleFALO.addChild(bone80);
		setRotationAngle(bone80, 0.0F, 0.0F, 0.5236F);
		

		bone80_r1 = new ModelRenderer(this);
		bone80_r1.setRotationPoint(-2.1145F, 2.9889F, 1.0F);
		bone80.addChild(bone80_r1);
		setRotationAngle(bone80_r1, 0.0F, 0.0F, 0.1745F);
		bone80_r1.cubeList.add(new ModelBox(bone80_r1, 64, 471, -0.5F, -3.5F, -0.5F, 1, 6, 1, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-4.7668F, 28.6229F, -15.0564F);
		carryhandleFALO.addChild(bone7);
		bone7.cubeList.add(new ModelBox(bone7, 584, 32, -1.0F, -24.0F, 2.0F, 2, 2, 13, -0.2F, false));
		bone7.cubeList.add(new ModelBox(bone7, 584, 47, -2.1314F, -22.8686F, 2.0F, 2, 2, 13, -0.2F, false));
		bone7.cubeList.add(new ModelBox(bone7, 584, 77, -1.0F, -21.7373F, 2.0F, 2, 2, 13, -0.2F, false));
		bone7.cubeList.add(new ModelBox(bone7, 584, 160, 0.1314F, -22.8686F, 2.0F, 2, 2, 13, -0.2F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0929F, -21.9615F, 0.0F);
		bone7.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 584, 295, -1.0F, -2.0F, 2.0F, 2, 2, 13, -0.2F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.8F, -19.6544F, 0.0F);
		bone7.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 584, 92, -2.0F, -2.0F, 2.0F, 2, 2, 13, -0.2F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-2.2142F, -19.6544F, 0.0F);
		bone7.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.7854F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 584, 62, -1.0F, -3.0F, 2.0F, 2, 2, 13, -0.2F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.5071F, -21.9615F, 0.0F);
		bone7.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 358, 401, -1.0F, -2.0F, 2.0F, 3, 2, 13, -0.2F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		carryhandleFALO.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}