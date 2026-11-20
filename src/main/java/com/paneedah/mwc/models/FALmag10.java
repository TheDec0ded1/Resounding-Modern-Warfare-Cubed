package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FALmag10 extends ModelBase {
	private final ModelRenderer mag10;
	private final ModelRenderer bone8;
	private final ModelRenderer bone205;

	public FALmag10() {
		textureWidth = 528;
		textureHeight = 528;

		mag10 = new ModelRenderer(this);
		mag10.setRotationPoint(2.75F, -6.5F, -15.5F);
		mag10.cubeList.add(new ModelBox(mag10, 496, 377, -5.75F, -3.952F, -11.3533F, 3, 9, 10, 0.0F, false));
		mag10.cubeList.add(new ModelBox(mag10, 370, 506, -6.0F, -3.952F, -10.3533F, 1, 9, 3, 0.0F, false));
		mag10.cubeList.add(new ModelBox(mag10, 174, 508, -3.5F, -3.952F, -10.3533F, 1, 9, 3, 0.0F, false));
		mag10.cubeList.add(new ModelBox(mag10, 182, 508, -3.5F, -3.952F, -5.3533F, 1, 9, 3, 0.0F, false));
		mag10.cubeList.add(new ModelBox(mag10, 190, 508, -6.0F, -3.952F, -5.3533F, 1, 9, 3, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-4.25F, 15.048F, -6.3533F);
		mag10.addChild(bone8);
		setRotationAngle(bone8, -0.1745F, 0.0F, 0.0F);
		bone8.cubeList.add(new ModelBox(bone8, 500, 344, -1.501F, -10.9799F, -6.6602F, 3, 2, 10, 0.0F, false));

		bone205 = new ModelRenderer(this);
		bone205.setRotationPoint(-3.25F, -7.452F, -6.3533F);
		mag10.addChild(bone205);
		setRotationAngle(bone205, 0.0F, 0.0F, 0.7854F);
		bone205.cubeList.add(new ModelBox(bone205, 502, 44, 1.8284F, 2.1213F, -5.0F, 1, 1, 10, 0.0F, false));
		bone205.cubeList.add(new ModelBox(bone205, 502, 55, 0.7071F, 3.2426F, -5.0F, 1, 1, 10, 0.0F, false));
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