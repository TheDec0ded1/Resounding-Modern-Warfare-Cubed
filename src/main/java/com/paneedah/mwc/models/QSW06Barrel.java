package com.paneedah.mwc.models;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QSW06Barrel extends ModelBase {
	private final ModelRenderer barrelQSW06;
	private final ModelRenderer gun108_r2;
	private final ModelRenderer gun109_r3;
	private final ModelRenderer gun110_r2;
	private final ModelRenderer gun109_r4;

	public QSW06Barrel() {
		textureWidth = 400;
		textureHeight = 400;

		barrelQSW06 = new ModelRenderer(this);
		barrelQSW06.setRotationPoint(0.0F, 24.25F, 3.0F);
		barrelQSW06.cubeList.add(new ModelBox(barrelQSW06, 55, 163, -3.0F, -36.8F, -35.5F, 1, 1, 25, 0.0F, false));
		barrelQSW06.cubeList.add(new ModelBox(barrelQSW06, 181, 160, -1.0F, -36.8F, -35.5F, 1, 1, 25, 0.0F, false));
		barrelQSW06.cubeList.add(new ModelBox(barrelQSW06, 358, 351, -1.0F, -35.8F, -17.5F, 1, 1, 7, 0.0F, false));
		barrelQSW06.cubeList.add(new ModelBox(barrelQSW06, 146, 373, -1.0F, -34.8F, -14.5F, 1, 1, 4, 0.0F, false));
		barrelQSW06.cubeList.add(new ModelBox(barrelQSW06, 17, 359, -3.0F, -35.8F, -17.5F, 1, 1, 7, 0.0F, false));
		barrelQSW06.cubeList.add(new ModelBox(barrelQSW06, 157, 373, -3.0F, -34.8F, -14.5F, 1, 1, 4, 0.0F, false));
		barrelQSW06.cubeList.add(new ModelBox(barrelQSW06, 183, 131, -2.0F, -37.8F, -35.5F, 1, 1, 25, 0.0F, false));
		barrelQSW06.cubeList.add(new ModelBox(barrelQSW06, 181, 187, -2.0F, -35.8F, -35.5F, 1, 1, 25, 0.0F, false));

		gun108_r2 = new ModelRenderer(this);
		gun108_r2.setRotationPoint(-1.0F, -37.8F, -35.5F);
		barrelQSW06.addChild(gun108_r2);
		setRotationAngle(gun108_r2, 0.0F, 0.0F, -0.7854F);
		gun108_r2.cubeList.add(new ModelBox(gun108_r2, 108, 188, -1.0F, 0.4F, 0.0F, 1, 1, 25, -0.002F, false));
		gun108_r2.cubeList.add(new ModelBox(gun108_r2, 189, 96, -1.0F, 0.0F, 0.0F, 1, 1, 25, -0.001F, false));

		gun109_r3 = new ModelRenderer(this);
		gun109_r3.setRotationPoint(-1.0F, -34.8F, -35.5F);
		barrelQSW06.addChild(gun109_r3);
		setRotationAngle(gun109_r3, 0.0F, 0.0F, 0.7854F);
		gun109_r3.cubeList.add(new ModelBox(gun109_r3, 102, 240, -1.0F, -1.4F, 0.0F, 1, 1, 21, -0.002F, false));
		gun109_r3.cubeList.add(new ModelBox(gun109_r3, 55, 190, -1.0F, -1.0F, 0.0F, 1, 1, 25, -0.001F, false));

		gun110_r2 = new ModelRenderer(this);
		gun110_r2.setRotationPoint(-2.0F, -34.8F, -35.5F);
		barrelQSW06.addChild(gun110_r2);
		setRotationAngle(gun110_r2, 0.0F, 0.0F, -0.7854F);
		gun110_r2.cubeList.add(new ModelBox(gun110_r2, 49, 242, 0.0F, -1.4F, 0.0F, 1, 1, 21, -0.002F, false));
		gun110_r2.cubeList.add(new ModelBox(gun110_r2, 0, 191, 0.0F, -1.0F, 0.0F, 1, 1, 25, -0.001F, false));

		gun109_r4 = new ModelRenderer(this);
		gun109_r4.setRotationPoint(-2.0F, -37.8F, -35.5F);
		barrelQSW06.addChild(gun109_r4);
		setRotationAngle(gun109_r4, 0.0F, 0.0F, 0.7854F);
		gun109_r4.cubeList.add(new ModelBox(gun109_r4, 193, 0, 0.0F, 0.4F, 0.0F, 1, 1, 25, -0.002F, false));
		gun109_r4.cubeList.add(new ModelBox(gun109_r4, 193, 27, 0.0F, 0.0F, 0.0F, 1, 1, 25, -0.001F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		barrelQSW06.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}