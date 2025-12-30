package com.paneedah.mwc.models;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QSZ92GBarrel extends ModelBase {
	private final ModelRenderer barrel92_9G;
	private final ModelRenderer gun108_r3;
	private final ModelRenderer gun109_r5;
	private final ModelRenderer gun110_r3;
	private final ModelRenderer gun109_r6;

	public QSZ92GBarrel() {
		textureWidth = 400;
		textureHeight = 400;

		barrel92_9G = new ModelRenderer(this);
		barrel92_9G.setRotationPoint(0.0F, 24.25F, 3.0F);
		barrel92_9G.cubeList.add(new ModelBox(barrel92_9G, 246, 21, -3.0F, -36.8F, -29.5F, 1, 1, 19, 0.0F, false));
		barrel92_9G.cubeList.add(new ModelBox(barrel92_9G, 251, 239, -1.0F, -36.8F, -29.5F, 1, 1, 19, 0.0F, false));
		barrel92_9G.cubeList.add(new ModelBox(barrel92_9G, 34, 360, -1.0F, -35.8F, -17.5F, 1, 1, 7, 0.0F, false));
		barrel92_9G.cubeList.add(new ModelBox(barrel92_9G, 374, 366, -1.0F, -34.8F, -14.5F, 1, 1, 4, 0.0F, false));
		barrel92_9G.cubeList.add(new ModelBox(barrel92_9G, 51, 360, -3.0F, -35.8F, -17.5F, 1, 1, 7, 0.0F, false));
		barrel92_9G.cubeList.add(new ModelBox(barrel92_9G, 374, 372, -3.0F, -34.8F, -14.5F, 1, 1, 4, 0.0F, false));
		barrel92_9G.cubeList.add(new ModelBox(barrel92_9G, 259, 208, -2.0F, -37.8F, -29.5F, 1, 1, 19, 0.0F, false));
		barrel92_9G.cubeList.add(new ModelBox(barrel92_9G, 251, 260, -2.0F, -35.8F, -29.5F, 1, 1, 19, 0.0F, false));

		gun108_r3 = new ModelRenderer(this);
		gun108_r3.setRotationPoint(-1.0F, -37.8F, -35.5F);
		barrel92_9G.addChild(gun108_r3);
		setRotationAngle(gun108_r3, 0.0F, 0.0F, -0.7854F);
		gun108_r3.cubeList.add(new ModelBox(gun108_r3, 206, 262, -1.0F, 0.4F, 6.0F, 1, 1, 19, -0.002F, false));
		gun108_r3.cubeList.add(new ModelBox(gun108_r3, 94, 263, -1.0F, 0.0F, 6.0F, 1, 1, 19, -0.001F, false));

		gun109_r5 = new ModelRenderer(this);
		gun109_r5.setRotationPoint(-1.0F, -34.8F, -35.5F);
		barrel92_9G.addChild(gun109_r5);
		setRotationAngle(gun109_r5, 0.0F, 0.0F, 0.7854F);
		gun109_r5.cubeList.add(new ModelBox(gun109_r5, 213, 283, -1.0F, -1.4F, 6.0F, 1, 1, 15, -0.002F, false));
		gun109_r5.cubeList.add(new ModelBox(gun109_r5, 0, 264, -1.0F, -1.0F, 6.0F, 1, 1, 19, -0.001F, false));

		gun110_r3 = new ModelRenderer(this);
		gun110_r3.setRotationPoint(-2.0F, -34.8F, -35.5F);
		barrel92_9G.addChild(gun110_r3);
		setRotationAngle(gun110_r3, 0.0F, 0.0F, -0.7854F);
		gun110_r3.cubeList.add(new ModelBox(gun110_r3, 287, 52, 0.0F, -1.4F, 6.0F, 1, 1, 15, -0.002F, false));
		gun110_r3.cubeList.add(new ModelBox(gun110_r3, 135, 264, 0.0F, -1.0F, 6.0F, 1, 1, 19, -0.001F, false));

		gun109_r6 = new ModelRenderer(this);
		gun109_r6.setRotationPoint(-2.0F, -37.8F, -35.5F);
		barrel92_9G.addChild(gun109_r6);
		setRotationAngle(gun109_r6, 0.0F, 0.0F, 0.7854F);
		gun109_r6.cubeList.add(new ModelBox(gun109_r6, 41, 265, 0.0F, 0.4F, 6.0F, 1, 1, 19, -0.002F, false));
		gun109_r6.cubeList.add(new ModelBox(gun109_r6, 247, 281, 0.0F, 0.0F, 6.0F, 1, 1, 19, -0.001F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		barrel92_9G.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}