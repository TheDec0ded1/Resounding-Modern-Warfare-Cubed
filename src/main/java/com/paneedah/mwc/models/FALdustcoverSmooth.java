package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FALdustcoverSmooth extends ModelBase {
	private final ModelRenderer dustcover;
	private final ModelRenderer cube_r1;
	private final ModelRenderer bone60;
	private final ModelRenderer bone61;
	private final ModelRenderer bone89;
	private final ModelRenderer bone63;
	private final ModelRenderer bone64;

	public FALdustcoverSmooth() {
		textureWidth = 528;
		textureHeight = 528;

		dustcover = new ModelRenderer(this);
		dustcover.setRotationPoint(-1.2857F, -16.018F, -19.4559F);
		dustcover.cubeList.add(new ModelBox(dustcover, 204, 378, -0.7143F, -1.0907F, -8.1911F, 1, 1, 32, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 380, 266, -0.0143F, -0.3907F, -8.1911F, 1, 1, 32, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 254, 466, -1.4143F, -0.3907F, 2.8089F, 1, 1, 21, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 128, 434, -1.6143F, -0.5907F, 2.0089F, 1, 1, 1, -0.2F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 196, 435, -1.7143F, -0.6907F, 1.5089F, 1, 1, 1, -0.3F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.7143F, -0.0173F, 3.3943F);
		dustcover.addChild(cube_r1);
		setRotationAngle(cube_r1, 1.1781F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 474, 518, -1.001F, -2.0F, -1.0F, 2, 2, 1, -0.3F, false));

		bone60 = new ModelRenderer(this);
		bone60.setRotationPoint(0.2857F, -1.082F, -7.1441F);
		dustcover.addChild(bone60);
		setRotationAngle(bone60, 0.0F, 0.0F, 0.7854F);
		bone60.cubeList.add(new ModelBox(bone60, 380, 299, 0.0F, 0.0F, -1.0F, 1, 1, 32, 0.0F, false));
		bone60.cubeList.add(new ModelBox(bone60, 382, 231, -0.7071F, 0.7071F, -1.0F, 1, 1, 32, 0.0F, false));

		bone61 = new ModelRenderer(this);
		bone61.setRotationPoint(0.7857F, 0.018F, -7.2941F);
		dustcover.addChild(bone61);
		setRotationAngle(bone61, 0.0F, 0.0F, 0.7854F);
		bone61.cubeList.add(new ModelBox(bone61, 0, 385, 0.0F, 0.0F, -1.0F, 1, 1, 32, 0.0F, false));
		bone61.cubeList.add(new ModelBox(bone61, 298, 466, -1.4293F, 1.3435F, 10.05F, 1, 1, 21, 0.0F, false));

		bone89 = new ModelRenderer(this);
		bone89.setRotationPoint(-0.4293F, 2.3435F, 10.0F);
		bone61.addChild(bone89);
		setRotationAngle(bone89, 1.1694F, 0.0F, 0.0F);
		

		bone63 = new ModelRenderer(this);
		bone63.setRotationPoint(1.4857F, 0.718F, -7.2441F);
		dustcover.addChild(bone63);
		setRotationAngle(bone63, 0.0F, 0.0F, -0.3142F);
		bone63.cubeList.add(new ModelBox(bone63, 66, 385, -1.0F, 0.0F, -1.0F, 1, 1, 32, 0.0F, false));

		bone64 = new ModelRenderer(this);
		bone64.setRotationPoint(-1.9143F, 0.718F, -7.2441F);
		dustcover.addChild(bone64);
		setRotationAngle(bone64, 0.0F, 0.0F, 0.3142F);
		bone64.cubeList.add(new ModelBox(bone64, 342, 466, 0.0F, -0.05F, 10.0F, 1, 1, 21, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		dustcover.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}