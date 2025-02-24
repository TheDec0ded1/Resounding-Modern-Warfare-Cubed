package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBZ03_Grip extends ModelBase {
	private final ModelRenderer grip;
	private final ModelRenderer Grip5;
	private final ModelRenderer Grip6;
	private final ModelRenderer Grip7;
	private final ModelRenderer Grip8;
	private final ModelRenderer Grip9;
	private final ModelRenderer Grip2;

	public QBZ03_Grip() {
		textureWidth = 416;
		textureHeight = 416;

		grip = new ModelRenderer(this);
		grip.setRotationPoint(0.0F, 22.0F, 0.0F);
		

		Grip5 = new ModelRenderer(this);
		Grip5.setRotationPoint(-1.5F, -20.0F, 63.0F);
		grip.addChild(Grip5);
		setRotationAngle(Grip5, 0.2231F, 0.0F, 0.0F);
		Grip5.cubeList.add(new ModelBox(Grip5, 343, 355, -2.0F, -24.6267F, -65.1666F, 4, 14, 6, 0.0F, false));

		Grip6 = new ModelRenderer(this);
		Grip6.setRotationPoint(-1.5F, -18.0F, 70.0F);
		grip.addChild(Grip6);
		setRotationAngle(Grip6, -1.1897F, 0.0F, 0.0F);
		Grip6.cubeList.add(new ModelBox(Grip6, 165, 353, -1.999F, 60.4797F, -36.2741F, 4, 2, 12, 0.0F, false));

		Grip7 = new ModelRenderer(this);
		Grip7.setRotationPoint(-1.5F, -20.0F, 73.0F);
		grip.addChild(Grip7);
		setRotationAngle(Grip7, -2.6769F, 0.0F, 0.0F);
		Grip7.cubeList.add(new ModelBox(Grip7, 369, 258, -2.0F, 40.4005F, 59.1689F, 4, 2, 2, 0.0F, false));

		Grip8 = new ModelRenderer(this);
		Grip8.setRotationPoint(-1.5F, -20.0F, 63.0F);
		grip.addChild(Grip8);
		setRotationAngle(Grip8, 0.2231F, 0.0F, 0.0F);
		Grip8.cubeList.add(new ModelBox(Grip8, 344, 388, -2.0F, -11.6267F, -66.1666F, 4, 1, 1, 0.0F, false));

		Grip9 = new ModelRenderer(this);
		Grip9.setRotationPoint(-1.5F, -7.1F, 64.9F);
		grip.addChild(Grip9);
		setRotationAngle(Grip9, 1.1154F, 0.0F, 0.0F);
		Grip9.cubeList.add(new ModelBox(Grip9, 383, 296, -2.001F, -66.1893F, -21.7286F, 4, 1, 2, 0.0F, false));

		Grip2 = new ModelRenderer(this);
		Grip2.setRotationPoint(-1.5F, -21.0F, 63.0F);
		grip.addChild(Grip2);
		Grip2.cubeList.add(new ModelBox(Grip2, 322, 28, -2.0F, -9.6F, -69.0F, 4, 1, 8, 0.0F, false));
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