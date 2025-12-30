package com.paneedah.mwc.models;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QZS92Barrel extends ModelBase {
	private final ModelRenderer barrel;
	private final ModelRenderer gun108_r1;
	private final ModelRenderer gun109_r1;
	private final ModelRenderer gun110_r1;
	private final ModelRenderer gun109_r2;

	public QZS92Barrel() {
		textureWidth = 400;
		textureHeight = 400;

		barrel = new ModelRenderer(this);
		barrel.setRotationPoint(0.0F, 24.25F, 3.0F);
		barrel.cubeList.add(new ModelBox(barrel, 193, 54, -3.0F, -36.8F, -33.5F, 1, 1, 23, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 108, 215, -1.0F, -36.8F, -33.5F, 1, 1, 23, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 358, 342, -1.0F, -35.8F, -17.5F, 1, 1, 7, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 333, 372, -1.0F, -34.8F, -14.5F, 1, 1, 4, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 358, 333, -3.0F, -35.8F, -17.5F, 1, 1, 7, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 371, 285, -3.0F, -34.8F, -14.5F, 1, 1, 4, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 161, 214, -2.0F, -37.8F, -33.5F, 1, 1, 23, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 210, 214, -2.0F, -35.8F, -33.5F, 1, 1, 23, 0.0F, false));

		gun108_r1 = new ModelRenderer(this);
		gun108_r1.setRotationPoint(-1.0F, -37.8F, -35.5F);
		barrel.addChild(gun108_r1);
		setRotationAngle(gun108_r1, 0.0F, 0.0F, -0.7854F);
		gun108_r1.cubeList.add(new ModelBox(gun108_r1, 236, 123, -1.0F, 0.4F, 2.0F, 1, 1, 23, -0.002F, false));
		gun108_r1.cubeList.add(new ModelBox(gun108_r1, 157, 239, -1.0F, 0.0F, 2.0F, 1, 1, 23, -0.001F, false));

		gun109_r1 = new ModelRenderer(this);
		gun109_r1.setRotationPoint(-1.0F, -34.8F, -35.5F);
		barrel.addChild(gun109_r1);
		setRotationAngle(gun109_r1, 0.0F, 0.0F, 0.7854F);
		gun109_r1.cubeList.add(new ModelBox(gun109_r1, 0, 243, -1.0F, -1.4F, 2.0F, 1, 1, 19, -0.002F, false));
		gun109_r1.cubeList.add(new ModelBox(gun109_r1, 53, 217, -1.0F, -1.0F, 2.0F, 1, 1, 23, -0.001F, false));

		gun110_r1 = new ModelRenderer(this);
		gun110_r1.setRotationPoint(-2.0F, -34.8F, -35.5F);
		barrel.addChild(gun110_r1);
		setRotationAngle(gun110_r1, 0.0F, 0.0F, -0.7854F);
		gun110_r1.cubeList.add(new ModelBox(gun110_r1, 246, 0, 0.0F, -1.4F, 2.0F, 1, 1, 19, -0.002F, false));
		gun110_r1.cubeList.add(new ModelBox(gun110_r1, 0, 218, 0.0F, -1.0F, 2.0F, 1, 1, 23, -0.001F, false));

		gun109_r2 = new ModelRenderer(this);
		gun109_r2.setRotationPoint(-2.0F, -37.8F, -35.5F);
		barrel.addChild(gun109_r2);
		setRotationAngle(gun109_r2, 0.0F, 0.0F, 0.7854F);
		gun109_r2.cubeList.add(new ModelBox(gun109_r2, 234, 158, 0.0F, 0.4F, 2.0F, 1, 1, 23, -0.002F, false));
		gun109_r2.cubeList.add(new ModelBox(gun109_r2, 234, 183, 0.0F, 0.0F, 2.0F, 1, 1, 23, -0.001F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		barrel.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}