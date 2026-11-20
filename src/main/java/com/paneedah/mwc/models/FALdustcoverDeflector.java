package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FALdustcoverDeflector extends ModelBase {
	private final ModelRenderer dustcover;
	private final ModelRenderer dustcover_r1;
	private final ModelRenderer dustcover_r2;
	private final ModelRenderer dustcover_r3;
	private final ModelRenderer bone60;
	private final ModelRenderer bone61;
	private final ModelRenderer bone89;
	private final ModelRenderer bone63;
	private final ModelRenderer bone64;

	public FALdustcoverDeflector() {
		textureWidth = 384;
		textureHeight = 384;

		dustcover = new ModelRenderer(this);
		dustcover.setRotationPoint(-1.2857F, -16.018F, -19.4559F);
		dustcover.cubeList.add(new ModelBox(dustcover, 142, 235, -0.7143F, -1.0907F, -8.1911F, 1, 1, 32, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 0, 236, -0.0143F, -0.3907F, -8.1911F, 1, 1, 32, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 302, 229, -1.4143F, -0.3907F, 2.8089F, 1, 1, 21, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 364, 255, -1.6143F, -0.5907F, 2.0089F, 1, 1, 1, -0.2F, false));

		dustcover_r1 = new ModelRenderer(this);
		dustcover_r1.setRotationPoint(-1.7815F, 2.8948F, 5.4765F);
		dustcover.addChild(dustcover_r1);
		setRotationAngle(dustcover_r1, -0.7854F, -0.0873F, 0.0F);
		dustcover_r1.cubeList.add(new ModelBox(dustcover_r1, 338, 359, -1.0F, -0.5F, -5.0F, 2, 1, 2, -0.25F, false));

		dustcover_r2 = new ModelRenderer(this);
		dustcover_r2.setRotationPoint(-3.0567F, 0.37F, -2.0345F);
		dustcover.addChild(dustcover_r2);
		setRotationAngle(dustcover_r2, 0.0F, -0.0873F, 0.0F);
		dustcover_r2.cubeList.add(new ModelBox(dustcover_r2, 248, 363, 0.925F, -0.2F, 4.5F, 2, 2, 1, -0.25F, false));

		dustcover_r3 = new ModelRenderer(this);
		dustcover_r3.setRotationPoint(-2.9643F, -0.6907F, -3.0911F);
		dustcover.addChild(dustcover_r3);
		setRotationAngle(dustcover_r3, 0.0F, -0.0873F, 0.0F);
		dustcover_r3.cubeList.add(new ModelBox(dustcover_r3, 304, 22, 0.925F, -0.2F, -4.5F, 2, 1, 10, -0.25F, false));

		bone60 = new ModelRenderer(this);
		bone60.setRotationPoint(0.2857F, -1.082F, -7.1441F);
		dustcover.addChild(bone60);
		setRotationAngle(bone60, 0.0F, 0.0F, 0.7854F);
		bone60.cubeList.add(new ModelBox(bone60, 236, 39, 0.0F, 0.0F, -1.0F, 1, 1, 32, 0.0F, false));
		bone60.cubeList.add(new ModelBox(bone60, 236, 72, -0.7071F, 0.7071F, -1.0F, 1, 1, 32, 0.0F, false));

		bone61 = new ModelRenderer(this);
		bone61.setRotationPoint(0.7857F, 0.018F, -7.2941F);
		dustcover.addChild(bone61);
		setRotationAngle(bone61, 0.0F, 0.0F, 0.7854F);
		bone61.cubeList.add(new ModelBox(bone61, 236, 105, 0.0F, 0.0F, -1.0F, 1, 1, 32, 0.0F, false));
		bone61.cubeList.add(new ModelBox(bone61, 304, 0, -1.4293F, 1.3435F, 10.05F, 1, 1, 21, 0.0F, false));

		bone89 = new ModelRenderer(this);
		bone89.setRotationPoint(-0.4293F, 2.3435F, 10.0F);
		bone61.addChild(bone89);
		setRotationAngle(bone89, 1.1694F, 0.0F, 0.0F);
		

		bone63 = new ModelRenderer(this);
		bone63.setRotationPoint(1.4857F, 0.718F, -7.2441F);
		dustcover.addChild(bone63);
		setRotationAngle(bone63, 0.0F, 0.0F, -0.3142F);
		bone63.cubeList.add(new ModelBox(bone63, 238, 0, -1.0F, 0.0F, -1.0F, 1, 1, 32, 0.0F, false));

		bone64 = new ModelRenderer(this);
		bone64.setRotationPoint(-1.9143F, 0.718F, -7.2441F);
		dustcover.addChild(bone64);
		setRotationAngle(bone64, 0.0F, 0.0F, 0.3142F);
		bone64.cubeList.add(new ModelBox(bone64, 304, 194, 0.0F, -0.05F, 10.0F, 1, 1, 21, 0.0F, false));
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