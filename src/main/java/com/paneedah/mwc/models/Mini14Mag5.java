package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Mini14Mag5 extends ModelBase {
	private final ModelRenderer mag10;
	private final ModelRenderer mag11;
	private final ModelRenderer mag12;
	private final ModelRenderer mag13;
	private final ModelRenderer mag14;

	public Mini14Mag5() {
		textureWidth = 340;
		textureHeight = 340;

		mag10 = new ModelRenderer(this);
		mag10.setRotationPoint(0.0F, 21.2F, 5.0F);
		setRotationAngle(mag10, 0.0698F, 0.0F, 0.0F);
		

		mag11 = new ModelRenderer(this);
		mag11.setRotationPoint(-3.0F, -16.1F, -28.5F);
		mag10.addChild(mag11);
		setRotationAngle(mag11, 2.9743F, 0.0F, 0.0F);
		mag11.cubeList.add(new ModelBox(mag11, 219, 183, 0.0F, 13.0F, 1.0F, 3, 6, 6, 0.001F, false));
		mag11.cubeList.add(new ModelBox(mag11, 219, 183, -0.5F, 13.0F, 1.0F, 1, 1, 6, 0.001F, false));
		mag11.cubeList.add(new ModelBox(mag11, 219, 183, 2.5F, 13.0F, 1.0F, 1, 1, 6, 0.001F, false));

		mag12 = new ModelRenderer(this);
		mag12.setRotationPoint(-3.5F, -16.1F, -28.5F);
		mag10.addChild(mag12);
		setRotationAngle(mag12, 2.9743F, 0.0F, 0.0F);
		mag12.cubeList.add(new ModelBox(mag12, 48, 95, 0.0F, 13.0F, 6.0F, 4, 6, 2, 0.0F, false));
		mag12.cubeList.add(new ModelBox(mag12, 49, 96, 0.0F, 13.0F, 4.0F, 4, 6, 1, 0.0F, false));

		mag13 = new ModelRenderer(this);
		mag13.setRotationPoint(-3.5F, -16.1F, -28.5F);
		mag10.addChild(mag13);
		setRotationAngle(mag13, 2.9743F, 0.0F, 0.0F);
		mag13.cubeList.add(new ModelBox(mag13, 51, 0, 0.0F, 13.0F, 0.0F, 4, 6, 1, 0.0F, false));

		mag14 = new ModelRenderer(this);
		mag14.setRotationPoint(-3.5F, -16.1F, -28.5F);
		mag10.addChild(mag14);
		setRotationAngle(mag14, 2.9743F, 0.0F, 0.0F);
		mag14.cubeList.add(new ModelBox(mag14, 226, 226, 0.0F, 13.0F, 2.0F, 4, 6, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		mag10.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}