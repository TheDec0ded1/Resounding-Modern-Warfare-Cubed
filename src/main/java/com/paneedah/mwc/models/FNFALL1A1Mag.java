package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FNFALL1A1Mag extends ModelBase {
	private final ModelRenderer mag;
	private final ModelRenderer bone26;
	private final ModelRenderer bone87;
	private final ModelRenderer bone99;
	private final ModelRenderer mag_r1;
	private final ModelRenderer bone100;
	private final ModelRenderer mag_r2;

	public FNFALL1A1Mag() {
		textureWidth = 400;
		textureHeight = 400;

		mag = new ModelRenderer(this);
		mag.setRotationPoint(2.75F, -6.5F, -18.5F);
		mag.cubeList.add(new ModelBox(mag, 0, 0, -5.75F, -3.952F, -11.3533F, 3, 13, 10, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 0, 130, -6.0F, -3.952F, -10.3533F, 1, 13, 3, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 52, 68, -3.5F, -3.952F, -10.3533F, 1, 13, 3, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 14, 99, -3.5F, -3.952F, -5.3533F, 1, 13, 3, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 81, 96, -6.0F, -3.952F, -5.3533F, 1, 13, 3, 0.0F, false));

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(-4.25F, 9.548F, -28.9783F);
		mag.addChild(bone26);
		setRotationAngle(bone26, -0.1745F, 0.0F, 0.0F);
		bone26.cubeList.add(new ModelBox(bone26, 69, 29, -1.5F, 7.7315F, 17.6385F, 3, 2, 10, 0.0F, false));

		bone87 = new ModelRenderer(this);
		bone87.setRotationPoint(-3.25F, -7.452F, -6.3533F);
		mag.addChild(bone87);
		setRotationAngle(bone87, 0.0F, 0.0F, 0.7854F);
		bone87.cubeList.add(new ModelBox(bone87, 63, 81, 1.8284F, 2.1213F, -5.0F, 1, 1, 10, 0.0F, false));
		bone87.cubeList.add(new ModelBox(bone87, 69, 41, 0.7071F, 3.2426F, -5.0F, 1, 1, 10, 0.0F, false));

		bone99 = new ModelRenderer(this);
		bone99.setRotationPoint(0.0F, 0.0F, 0.0F);
		mag.addChild(bone99);
		

		mag_r1 = new ModelRenderer(this);
		mag_r1.setRotationPoint(-2.75F, 41.1145F, 15.7704F);
		bone99.addChild(mag_r1);
		setRotationAngle(mag_r1, -0.0873F, 0.0F, 0.0F);
		mag_r1.cubeList.add(new ModelBox(mag_r1, 0, 0, -3.0F, -30.452F, -29.8533F, 3, 7, 10, 0.0F, false));
		mag_r1.cubeList.add(new ModelBox(mag_r1, 14, 99, -0.75F, -30.452F, -23.8533F, 1, 7, 3, 0.0F, false));
		mag_r1.cubeList.add(new ModelBox(mag_r1, 52, 68, -0.75F, -30.452F, -28.8533F, 1, 7, 3, 0.0F, false));
		mag_r1.cubeList.add(new ModelBox(mag_r1, 0, 130, -3.25F, -30.452F, -28.8533F, 1, 7, 3, 0.0F, false));
		mag_r1.cubeList.add(new ModelBox(mag_r1, 81, 96, -3.25F, -30.452F, -23.8533F, 1, 7, 3, 0.0F, false));

		bone100 = new ModelRenderer(this);
		bone100.setRotationPoint(0.0F, 0.0F, 0.0F);
		mag.addChild(bone100);
		setRotationAngle(bone100, -0.0873F, 0.0F, 0.0F);
		

		mag_r2 = new ModelRenderer(this);
		mag_r2.setRotationPoint(-2.75F, 48.198F, 16.5641F);
		bone100.addChild(mag_r2);
		setRotationAngle(mag_r2, -0.0873F, 0.0F, 0.0F);
		mag_r2.cubeList.add(new ModelBox(mag_r2, 0, 0, -3.0F, -30.452F, -29.8533F, 3, 7, 10, 0.0F, false));
		mag_r2.cubeList.add(new ModelBox(mag_r2, 14, 99, -0.75F, -30.452F, -23.8533F, 1, 7, 3, 0.0F, false));
		mag_r2.cubeList.add(new ModelBox(mag_r2, 52, 68, -0.75F, -30.452F, -28.8533F, 1, 7, 3, 0.0F, false));
		mag_r2.cubeList.add(new ModelBox(mag_r2, 0, 130, -3.25F, -30.452F, -28.8533F, 1, 7, 3, 0.0F, false));
		mag_r2.cubeList.add(new ModelBox(mag_r2, 81, 96, -3.25F, -30.452F, -23.8533F, 1, 7, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		mag.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}