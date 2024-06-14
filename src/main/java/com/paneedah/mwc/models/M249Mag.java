package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M249Mag extends ModelBase {
	private final ModelRenderer mag;
	private final ModelRenderer Mag5;
	private final ModelRenderer Mag4;
	private final ModelRenderer Mag3;
	private final ModelRenderer Mag2;
	private final ModelRenderer Mag1;

	public M249Mag() {
		textureWidth = 128;
		textureHeight = 128;

		mag = new ModelRenderer(this);
		mag.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		Mag5 = new ModelRenderer(this);
		Mag5.setRotationPoint(12.0F, -22.5F, 42.0F);
		mag.addChild(Mag5);
		Mag5.cubeList.add(new ModelBox(Mag5, 30, 27, -2.0F, -9.6F, -69.0F, 1, 19, 10, 0.0F, false));

		Mag4 = new ModelRenderer(this);
		Mag4.setRotationPoint(-4.0F, -22.0F, 42.5F);
		mag.addChild(Mag4);
		setRotationAngle(Mag4, 0.0F, 0.0F, 0.7854F);
		Mag4.cubeList.add(new ModelBox(Mag4, 42, 18, -8.2024F, -5.374F, -68.999F, 5, 8, 9, 0.0F, false));

		Mag3 = new ModelRenderer(this);
		Mag3.setRotationPoint(-9.7F, -16.0F, 42.5F);
		mag.addChild(Mag3);
		Mag3.cubeList.add(new ModelBox(Mag3, 0, 27, -2.0F, -9.6F, -69.001F, 6, 12, 9, 0.0F, false));

		Mag2 = new ModelRenderer(this);
		Mag2.setRotationPoint(-3.0F, -22.5F, 43.5F);
		mag.addChild(Mag2);
		Mag2.cubeList.add(new ModelBox(Mag2, 41, 0, -2.0F, -9.6F, -69.0F, 12, 1, 7, 0.0F, false));

		Mag1 = new ModelRenderer(this);
		Mag1.setRotationPoint(-4.0F, -22.0F, 42.5F);
		mag.addChild(Mag1);
		Mag1.cubeList.add(new ModelBox(Mag1, 0, 0, -2.0F, -9.6F, -69.0F, 16, 18, 9, 0.0F, false));
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