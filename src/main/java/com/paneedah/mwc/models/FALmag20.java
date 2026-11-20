package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FALmag20 extends ModelBase {
	private final ModelRenderer mag20;
	private final ModelRenderer bone26;
	private final ModelRenderer bone87;

	public FALmag20() {
		textureWidth = 528;
		textureHeight = 528;

		mag20 = new ModelRenderer(this);
		mag20.setRotationPoint(2.75F, -6.5F, -15.5F);
		mag20.cubeList.add(new ModelBox(mag20, 246, 488, -5.75F, -3.952F, -11.3533F, 3, 18, 10, 0.0F, false));
		mag20.cubeList.add(new ModelBox(mag20, 254, 443, -6.0F, -3.952F, -10.3533F, 1, 18, 3, 0.0F, false));
		mag20.cubeList.add(new ModelBox(mag20, 82, 495, -3.5F, -3.952F, -10.3533F, 1, 18, 3, 0.0F, false));
		mag20.cubeList.add(new ModelBox(mag20, 30, 496, -3.5F, -3.952F, -5.3533F, 1, 18, 3, 0.0F, false));
		mag20.cubeList.add(new ModelBox(mag20, 502, 85, -6.0F, -3.952F, -5.3533F, 1, 18, 3, 0.0F, false));

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(-4.25F, 15.048F, -6.3533F);
		mag20.addChild(bone26);
		setRotationAngle(bone26, -0.1745F, 0.0F, 0.0F);
		bone26.cubeList.add(new ModelBox(bone26, 500, 304, -1.5F, -2.1166F, -5.0977F, 3, 2, 10, 0.0F, false));

		bone87 = new ModelRenderer(this);
		bone87.setRotationPoint(-3.25F, -7.452F, -6.3533F);
		mag20.addChild(bone87);
		setRotationAngle(bone87, 0.0F, 0.0F, 0.7854F);
		bone87.cubeList.add(new ModelBox(bone87, 410, 220, 1.8284F, 2.1213F, -5.0F, 1, 1, 10, 0.0F, false));
		bone87.cubeList.add(new ModelBox(bone87, 478, 501, 0.7071F, 3.2426F, -5.0F, 1, 1, 10, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		mag20.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}