package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FNFAL30Mag extends ModelBase {
	private final ModelRenderer mag;
	private final ModelRenderer bone26;
	private final ModelRenderer bone87;

	public FNFAL30Mag() {
		textureWidth = 400;
		textureHeight = 400;

		mag = new ModelRenderer(this);
		mag.setRotationPoint(2.75F, -6.5F, -18.5F);
		mag.cubeList.add(new ModelBox(mag, 0, 0, -5.75F, -3.952F, -11.3533F, 3, 18, 10, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 0, 130, -6.0F, -3.952F, -10.3533F, 1, 18, 3, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 52, 68, -3.5F, -3.952F, -10.3533F, 1, 18, 3, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 14, 99, -3.5F, -3.952F, -5.3533F, 1, 18, 3, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 81, 96, -6.0F, -3.952F, -5.3533F, 1, 18, 3, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 0, 0, -5.75F, 14.048F, -11.3533F, 3, 7, 10, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 14, 99, -3.5F, 14.048F, -5.3533F, 1, 7, 3, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 52, 68, -3.5F, 14.048F, -10.3533F, 1, 7, 3, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 0, 130, -6.0F, 14.048F, -10.3533F, 1, 7, 3, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 81, 96, -6.0F, 14.048F, -5.3533F, 1, 7, 3, 0.0F, false));

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(-4.25F, 18.548F, -27.1033F);
		mag.addChild(bone26);
		setRotationAngle(bone26, -0.1745F, 0.0F, 0.0F);
		bone26.cubeList.add(new ModelBox(bone26, 69, 29, -1.5F, -2.1166F, 15.9023F, 3, 2, 10, 0.0F, false));

		bone87 = new ModelRenderer(this);
		bone87.setRotationPoint(-3.25F, -7.452F, -6.3533F);
		mag.addChild(bone87);
		setRotationAngle(bone87, 0.0F, 0.0F, 0.7854F);
		bone87.cubeList.add(new ModelBox(bone87, 63, 81, 1.8284F, 2.1213F, -5.0F, 1, 1, 10, 0.0F, false));
		bone87.cubeList.add(new ModelBox(bone87, 69, 41, 0.7071F, 3.2426F, -5.0F, 1, 1, 10, 0.0F, false));
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