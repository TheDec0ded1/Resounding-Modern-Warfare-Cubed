package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FALgripOSW extends ModelBase {
	private final ModelRenderer gripSAW;
	private final ModelRenderer Grip21;
	private final ModelRenderer Grip22;
	private final ModelRenderer Grip23;
	private final ModelRenderer Grip24;
	private final ModelRenderer Grip25;
	private final ModelRenderer Grip26;

	public FALgripOSW() {
		textureWidth = 384;
		textureHeight = 384;

		gripSAW = new ModelRenderer(this);
		gripSAW.setRotationPoint(-1.0F, 5.3125F, 65.4125F);
		

		Grip21 = new ModelRenderer(this);
		Grip21.setRotationPoint(-0.5F, -1.6125F, -2.4125F);
		gripSAW.addChild(Grip21);
		setRotationAngle(Grip21, 0.2231F, 0.0F, 0.0F);
		Grip21.cubeList.add(new ModelBox(Grip21, 192, 336, -2.0F, -25.0168F, -65.0781F, 4, 14, 6, -0.002F, false));

		Grip22 = new ModelRenderer(this);
		Grip22.setRotationPoint(-0.5F, 0.3875F, 4.5875F);
		gripSAW.addChild(Grip22);
		setRotationAngle(Grip22, -1.1897F, 0.0F, 0.0F);
		Grip22.cubeList.add(new ModelBox(Grip22, 338, 250, -1.999F, 60.3309F, -35.6454F, 4, 2, 11, 0.0F, false));

		Grip23 = new ModelRenderer(this);
		Grip23.setRotationPoint(-0.5F, -1.6125F, 7.5875F);
		gripSAW.addChild(Grip23);
		setRotationAngle(Grip23, -2.6769F, 0.0F, 0.0F);
		Grip23.cubeList.add(new ModelBox(Grip23, 180, 95, -2.001F, 39.8641F, 57.2001F, 4, 2, 5, -0.002F, false));

		Grip24 = new ModelRenderer(this);
		Grip24.setRotationPoint(-0.5F, -2.6125F, -2.4125F);
		gripSAW.addChild(Grip24);
		Grip24.cubeList.add(new ModelBox(Grip24, 334, 302, -2.0F, -10.1F, -69.0F, 4, 1, 10, 0.1F, false));

		Grip25 = new ModelRenderer(this);
		Grip25.setRotationPoint(-0.5F, 11.2875F, -0.5125F);
		gripSAW.addChild(Grip25);
		setRotationAngle(Grip25, 1.1154F, 0.0F, 0.0F);
		Grip25.cubeList.add(new ModelBox(Grip25, 252, 241, -2.001F, -66.3652F, -21.3694F, 4, 1, 2, 0.0F, false));

		Grip26 = new ModelRenderer(this);
		Grip26.setRotationPoint(-0.5F, -1.6125F, -2.4125F);
		gripSAW.addChild(Grip26);
		setRotationAngle(Grip26, 0.2231F, 0.0F, 0.0F);
		Grip26.cubeList.add(new ModelBox(Grip26, 164, 33, -2.0F, -12.0168F, -66.0781F, 4, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gripSAW.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}