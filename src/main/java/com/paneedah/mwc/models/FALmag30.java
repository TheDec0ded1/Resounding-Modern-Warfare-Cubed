package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FALmag30 extends ModelBase {
	private final ModelRenderer mag30;
	private final ModelRenderer bone135;
	private final ModelRenderer bone136;

	public FALmag30() {
		textureWidth = 528;
		textureHeight = 528;

		mag30 = new ModelRenderer(this);
		mag30.setRotationPoint(2.75F, -6.5F, -15.5F);
		mag30.cubeList.add(new ModelBox(mag30, 220, 471, -5.75F, -3.952F, -11.3533F, 3, 25, 10, 0.0F, false));
		mag30.cubeList.add(new ModelBox(mag30, 424, 485, -6.0F, -3.952F, -10.3533F, 1, 25, 3, 0.0F, false));
		mag30.cubeList.add(new ModelBox(mag30, 124, 494, -3.5F, -3.952F, -10.3533F, 1, 25, 3, 0.0F, false));
		mag30.cubeList.add(new ModelBox(mag30, 132, 494, -3.5F, -3.952F, -5.3533F, 1, 25, 3, 0.0F, false));
		mag30.cubeList.add(new ModelBox(mag30, 74, 495, -6.0F, -3.952F, -5.3533F, 1, 25, 3, 0.0F, false));

		bone135 = new ModelRenderer(this);
		bone135.setRotationPoint(-4.25F, 18.548F, -27.1033F);
		mag30.addChild(bone135);
		setRotationAngle(bone135, -0.1745F, 0.0F, 0.0F);
		bone135.cubeList.add(new ModelBox(bone135, 500, 332, -1.501F, -2.1166F, 15.9023F, 3, 2, 10, 0.0F, false));

		bone136 = new ModelRenderer(this);
		bone136.setRotationPoint(-3.25F, -7.452F, -6.3533F);
		mag30.addChild(bone136);
		setRotationAngle(bone136, 0.0F, 0.0F, 0.7854F);
		bone136.cubeList.add(new ModelBox(bone136, 502, 0, 1.8284F, 2.1213F, -5.0F, 1, 1, 10, 0.0F, false));
		bone136.cubeList.add(new ModelBox(bone136, 502, 11, 0.7071F, 3.2426F, -5.0F, 1, 1, 10, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		mag30.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}