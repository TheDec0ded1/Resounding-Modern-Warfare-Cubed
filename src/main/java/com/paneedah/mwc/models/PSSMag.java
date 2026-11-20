package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class PSSMag extends ModelBase {
	private final ModelRenderer mag;
	private final ModelRenderer mag7;
	private final ModelRenderer mag6;
	private final ModelRenderer mag5;
	private final ModelRenderer mag3;
	private final ModelRenderer mag2;
	private final ModelRenderer mag4;
	private final ModelRenderer mag1;

	public PSSMag() {
		textureWidth = 150;
		textureHeight = 150;

		mag = new ModelRenderer(this);
		mag.setRotationPoint(0.0F, 21.0F, -0.5F);
		

		mag7 = new ModelRenderer(this);
		mag7.setRotationPoint(-2.5F, -28.7F, -5.4F);
		mag.addChild(mag7);
		setRotationAngle(mag7, 0.2231F, 0.0F, 0.0F);
		mag7.cubeList.add(new ModelBox(mag7, 70, 81, -0.15F, 0.3F, 0.2F, 2, 13, 3, 0.0F, false));
		mag7.cubeList.add(new ModelBox(mag7, 70, 81, 0.15F, 0.3F, 0.2F, 2, 13, 3, 0.0F, false));
		mag7.cubeList.add(new ModelBox(mag7, 72, 83, -0.15F, 0.3F, 3.2F, 2, 13, 1, 0.0F, false));
		mag7.cubeList.add(new ModelBox(mag7, 72, 83, 0.15F, 0.3F, 3.2F, 2, 13, 1, 0.0F, false));

		mag6 = new ModelRenderer(this);
		mag6.setRotationPoint(-3.0F, -17.7F, -2.4F);
		mag.addChild(mag6);
		mag6.cubeList.add(new ModelBox(mag6, 93, 68, 1.75F, -0.2F, -0.3F, 1, 2, 3, 0.0F, false));
		mag6.cubeList.add(new ModelBox(mag6, 93, 68, 1.749F, -0.201F, 1.3F, 1, 2, 3, 0.0F, false));
		mag6.cubeList.add(new ModelBox(mag6, 93, 68, 0.25F, -0.2F, -0.3F, 2, 2, 3, 0.0F, false));
		mag6.cubeList.add(new ModelBox(mag6, 93, 68, 0.249F, -0.201F, 1.3F, 2, 2, 3, 0.0F, false));

		mag5 = new ModelRenderer(this);
		mag5.setRotationPoint(-3.0F, -30.4F, -5.6F);
		mag.addChild(mag5);
		setRotationAngle(mag5, 0.1487F, 0.0F, 0.0F);
		mag5.cubeList.add(new ModelBox(mag5, 88, 8, 1.751F, 0.1482F, 0.989F, 1, 3, 4, 0.0F, false));
		mag5.cubeList.add(new ModelBox(mag5, 91, 11, 1.751F, 0.1482F, -0.011F, 1, 3, 1, 0.0F, false));
		mag5.cubeList.add(new ModelBox(mag5, 88, 8, 0.251F, 0.1482F, 0.989F, 2, 3, 4, 0.0F, false));
		mag5.cubeList.add(new ModelBox(mag5, 91, 11, 0.251F, 0.1482F, -0.011F, 2, 3, 1, 0.0F, false));

		mag3 = new ModelRenderer(this);
		mag3.setRotationPoint(-3.0F, -29.9F, -6.4F);
		mag.addChild(mag3);
		setRotationAngle(mag3, 0.2231F, 0.0F, 0.0F);
		mag3.cubeList.add(new ModelBox(mag3, 0, 111, 1.749F, 0.3F, 0.0F, 1, 14, 1, 0.0F, false));
		mag3.cubeList.add(new ModelBox(mag3, 0, 111, 0.249F, 0.3F, 0.0F, 2, 14, 1, 0.0F, false));

		mag2 = new ModelRenderer(this);
		mag2.setRotationPoint(-0.3F, -15.9F, -4.6F);
		mag.addChild(mag2);
		setRotationAngle(mag2, -0.0744F, 0.0F, 0.0F);
		

		mag4 = new ModelRenderer(this);
		mag4.setRotationPoint(-3.0F, -29.9F, -3.4F);
		mag.addChild(mag4);
		setRotationAngle(mag4, 0.2231F, 0.0F, 0.0F);
		mag4.cubeList.add(new ModelBox(mag4, 12, 111, 1.75F, 0.5213F, 1.8752F, 1, 14, 1, 0.0F, false));
		mag4.cubeList.add(new ModelBox(mag4, 12, 111, 0.25F, 0.5213F, 1.8752F, 2, 14, 1, 0.0F, false));

		mag1 = new ModelRenderer(this);
		mag1.setRotationPoint(-3.7F, -15.9F, -4.6F);
		mag.addChild(mag1);
		setRotationAngle(mag1, -0.0744F, 0.0F, 0.0F);
		mag1.cubeList.add(new ModelBox(mag1, 0, 14, 0.7F, -1.0747F, 1.1191F, 3, 1, 6, 0.0F, false));
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