package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FALOmag extends ModelBase {
	private final ModelRenderer magFALO;
	private final ModelRenderer bone182;
	private final ModelRenderer bone183;
	private final ModelRenderer bone184;
	private final ModelRenderer mag_r1;
	private final ModelRenderer bone185;
	private final ModelRenderer mag_r2;

	public FALOmag() {
		textureWidth = 528;
		textureHeight = 528;

		magFALO = new ModelRenderer(this);
		magFALO.setRotationPoint(2.75F, -6.5F, -15.5F);
		magFALO.cubeList.add(new ModelBox(magFALO, 204, 351, -5.75F, -3.952F, -11.3533F, 3, 13, 10, 0.0F, false));
		magFALO.cubeList.add(new ModelBox(magFALO, 246, 471, -6.0F, -3.952F, -10.3533F, 1, 13, 3, 0.0F, false));
		magFALO.cubeList.add(new ModelBox(magFALO, 42, 475, -3.5F, -3.952F, -10.3533F, 1, 13, 3, 0.0F, false));
		magFALO.cubeList.add(new ModelBox(magFALO, 468, 502, -3.5F, -3.952F, -5.3533F, 1, 13, 3, 0.0F, false));
		magFALO.cubeList.add(new ModelBox(magFALO, 236, 506, -6.0F, -3.952F, -5.3533F, 1, 13, 3, 0.0F, false));

		bone182 = new ModelRenderer(this);
		bone182.setRotationPoint(-4.25F, 9.548F, -28.9783F);
		magFALO.addChild(bone182);
		setRotationAngle(bone182, -0.1745F, 0.0F, 0.0F);
		

		bone183 = new ModelRenderer(this);
		bone183.setRotationPoint(-3.25F, -7.452F, -6.3533F);
		magFALO.addChild(bone183);
		setRotationAngle(bone183, 0.0F, 0.0F, 0.7854F);
		bone183.cubeList.add(new ModelBox(bone183, 502, 22, 1.8284F, 2.1213F, -5.0F, 1, 1, 10, 0.0F, false));
		bone183.cubeList.add(new ModelBox(bone183, 502, 33, 0.7071F, 3.2426F, -5.0F, 1, 1, 10, 0.0F, false));

		bone184 = new ModelRenderer(this);
		bone184.setRotationPoint(0.0F, 0.0F, 0.0F);
		magFALO.addChild(bone184);
		

		mag_r1 = new ModelRenderer(this);
		mag_r1.setRotationPoint(-2.75F, 41.1145F, 15.7704F);
		bone184.addChild(mag_r1);
		setRotationAngle(mag_r1, -0.0873F, 0.0F, 0.0F);
		mag_r1.cubeList.add(new ModelBox(mag_r1, 498, 219, -3.0F, -30.452F, -29.8533F, 3, 7, 10, 0.0F, false));
		mag_r1.cubeList.add(new ModelBox(mag_r1, 198, 508, -0.75F, -30.452F, -23.8533F, 1, 7, 3, 0.0F, false));
		mag_r1.cubeList.add(new ModelBox(mag_r1, 150, 509, -0.75F, -30.452F, -28.8533F, 1, 7, 3, 0.0F, false));
		mag_r1.cubeList.add(new ModelBox(mag_r1, 158, 509, -3.25F, -30.452F, -28.8533F, 1, 7, 3, 0.0F, false));
		mag_r1.cubeList.add(new ModelBox(mag_r1, 166, 509, -3.25F, -30.452F, -23.8533F, 1, 7, 3, 0.0F, false));

		bone185 = new ModelRenderer(this);
		bone185.setRotationPoint(0.0F, 0.0F, 0.0F);
		magFALO.addChild(bone185);
		setRotationAngle(bone185, -0.0873F, 0.0F, 0.0F);
		

		mag_r2 = new ModelRenderer(this);
		mag_r2.setRotationPoint(-2.75F, 48.198F, 16.5641F);
		bone185.addChild(mag_r2);
		setRotationAngle(mag_r2, -0.0873F, 0.0F, 0.0F);
		mag_r2.cubeList.add(new ModelBox(mag_r2, 498, 135, -3.0F, -30.452F, -29.8533F, 3, 8, 10, 0.0F, false));
		mag_r2.cubeList.add(new ModelBox(mag_r2, 510, 85, -0.75F, -30.452F, -23.8533F, 1, 7, 3, 0.0F, false));
		mag_r2.cubeList.add(new ModelBox(mag_r2, 90, 510, -0.75F, -30.452F, -28.8533F, 1, 7, 3, 0.0F, false));
		mag_r2.cubeList.add(new ModelBox(mag_r2, 510, 95, -3.25F, -30.452F, -28.8533F, 1, 7, 3, 0.0F, false));
		mag_r2.cubeList.add(new ModelBox(mag_r2, 98, 510, -3.25F, -30.452F, -23.8533F, 1, 7, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		magFALO.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}