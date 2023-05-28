package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Kedr30Mag extends ModelBase {
	private final ModelRenderer mag;
	private final ModelRenderer mag5_r1;
	private final ModelRenderer mag4_r1;
	private final ModelRenderer mag4_r2;
	private final ModelRenderer mag3_r1;

	public Kedr30Mag() {
		textureWidth = 180;
		textureHeight = 180;

		mag = new ModelRenderer(this);
		mag.setRotationPoint(0.0F, 22.8F, 0.0F);
		mag.cubeList.add(new ModelBox(mag, 28, 35, -2.5F, -29.0F, -19.1F, 2, 17, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 34, 70, -2.0F, -27.0F, -15.4F, 1, 15, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 40, 49, -2.0F, -27.9F, -15.6F, 1, 1, 1, -0.1F, false));
		mag.cubeList.add(new ModelBox(mag, 53, 70, -0.9F, -29.0F, -16.4F, 1, 14, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 38, 70, -3.1F, -29.0F, -16.4F, 1, 14, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 46, 70, -0.9F, -29.0F, -18.3F, 1, 14, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 42, 70, -3.1F, -29.0F, -18.3F, 1, 14, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 65, 79, -2.0F, -30.001F, -15.901F, 1, 1, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 36, 0, -3.0F, -29.001F, -18.9F, 3, 17, 4, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 36, 0, -3.0F, -12.001F, -18.9F, 3, 8, 4, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 28, 35, -2.5F, -12.0F, -19.1F, 2, 8, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 46, 70, -0.9F, -15.0F, -18.3F, 1, 8, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 53, 70, -0.9F, -15.0F, -16.4F, 1, 8, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 42, 70, -3.1F, -15.0F, -18.3F, 1, 8, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 38, 70, -3.1F, -15.0F, -16.4F, 1, 8, 1, 0.0F, false));

		mag5_r1 = new ModelRenderer(this);
		mag5_r1.setRotationPoint(-3.0F, -29.001F, -18.9F);
		mag.addChild(mag5_r1);
		setRotationAngle(mag5_r1, -0.7854F, 0.0F, 0.1745F);
		mag5_r1.cubeList.add(new ModelBox(mag5_r1, 21, 30, -0.001F, -2.8F, -0.001F, 1, 1, 1, 0.0F, false));
		mag5_r1.cubeList.add(new ModelBox(mag5_r1, 8, 23, 0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		mag4_r1 = new ModelRenderer(this);
		mag4_r1.setRotationPoint(0.0F, -29.001F, -18.9F);
		mag.addChild(mag4_r1);
		setRotationAngle(mag4_r1, -0.7854F, 0.0F, -0.1745F);
		mag4_r1.cubeList.add(new ModelBox(mag4_r1, 52, 47, -0.999F, -2.8F, -0.001F, 1, 1, 1, 0.0F, false));
		mag4_r1.cubeList.add(new ModelBox(mag4_r1, 29, 0, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		mag4_r2 = new ModelRenderer(this);
		mag4_r2.setRotationPoint(-3.0F, -29.001F, -14.9F);
		mag.addChild(mag4_r2);
		setRotationAngle(mag4_r2, 0.0F, 0.0F, 0.1745F);
		mag4_r2.cubeList.add(new ModelBox(mag4_r2, 20, 46, -0.002F, -1.0F, -3.0F, 1, 1, 1, 0.0F, false));
		mag4_r2.cubeList.add(new ModelBox(mag4_r2, 36, 53, 0.0F, -2.0F, -2.002F, 1, 2, 2, 0.0F, false));

		mag3_r1 = new ModelRenderer(this);
		mag3_r1.setRotationPoint(0.0F, -29.001F, -14.9F);
		mag.addChild(mag3_r1);
		setRotationAngle(mag3_r1, 0.0F, 0.0F, -0.1745F);
		mag3_r1.cubeList.add(new ModelBox(mag3_r1, 52, 38, -0.998F, -1.0F, -3.0F, 1, 1, 1, 0.0F, false));
		mag3_r1.cubeList.add(new ModelBox(mag3_r1, 50, 53, -1.0F, -2.0F, -2.002F, 1, 2, 2, 0.0F, false));
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