package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AS_Stock extends ModelBase {
	private final ModelRenderer asval_stock;
	private final ModelRenderer cube_r119;
	private final ModelRenderer cube_r120;
	private final ModelRenderer cube_r123;
	private final ModelRenderer cube_r124;
	private final ModelRenderer cube_r125;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r127;
	private final ModelRenderer cube_r128;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r130;
	private final ModelRenderer cube_r131;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;

	public AS_Stock() {
		textureWidth = 256;
		textureHeight = 256;

		asval_stock = new ModelRenderer(this);
		asval_stock.setRotationPoint(0.5F, -6.6F, 14.6F);
		asval_stock.cubeList.add(new ModelBox(asval_stock, 208, 194, -2.39F, -1.9F, -20.3F, 2, 1, 6, 0.0F, false));
		asval_stock.cubeList.add(new ModelBox(asval_stock, 213, 76, -2.39F, -1.4F, -20.3F, 2, 1, 6, -0.001F, false));
		asval_stock.cubeList.add(new ModelBox(asval_stock, 213, 84, -3.59F, -1.9F, -20.3F, 2, 1, 6, 0.0F, false));
		asval_stock.cubeList.add(new ModelBox(asval_stock, 213, 92, -3.59F, -1.4F, -20.3F, 2, 1, 6, -0.001F, false));
		asval_stock.cubeList.add(new ModelBox(asval_stock, 232, 53, -3.199F, -5.8127F, -15.3389F, 3, 3, 1, -0.2F, false));
		asval_stock.cubeList.add(new ModelBox(asval_stock, 0, 238, -3.799F, -5.8127F, -15.3389F, 1, 3, 1, -0.2F, false));

		cube_r119 = new ModelRenderer(this);
		cube_r119.setRotationPoint(0.5F, -3.95F, 10.55F);
		asval_stock.addChild(cube_r119);
		setRotationAngle(cube_r119, -0.1887F, -0.8638F, 0.1442F);
		cube_r119.cubeList.add(new ModelBox(cube_r119, 47, 201, -18.883F, 2.031F, -14.36F, 1, 4, 1, -0.001F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 211, 233, -19.653F, 2.031F, -15.001F, 1, 4, 1, -0.001F, false));

		cube_r120 = new ModelRenderer(this);
		cube_r120.setRotationPoint(0.0F, -0.85F, 11.55F);
		asval_stock.addChild(cube_r120);
		setRotationAngle(cube_r120, -0.1222F, 0.0F, 0.0F);
		cube_r120.cubeList.add(new ModelBox(cube_r120, 236, 146, -3.1F, 1.0322F, -20.9317F, 2, 2, 1, -0.002F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 197, 238, -1.5F, 1.0322F, -20.9317F, 1, 2, 1, 0.0F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 236, 150, -1.5F, 1.0322F, -22.9317F, 1, 1, 2, 0.0F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 112, 228, -1.3F, -1.1178F, -23.9317F, 1, 1, 4, -0.202F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 5, 238, -1.3F, -1.1178F, -20.7317F, 1, 3, 1, -0.201F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 27, 234, -1.3F, -1.1178F, -24.4317F, 1, 4, 1, -0.201F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 215, 16, -3.1F, -0.9178F, -24.9317F, 2, 2, 5, -0.001F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 236, 154, -3.1F, 1.0322F, -23.9317F, 2, 2, 1, -0.002F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 222, 171, -2.8F, 1.8322F, -23.4317F, 2, 1, 3, 0.0F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 239, 3, -1.5F, 1.0322F, -23.9317F, 1, 2, 1, 0.0F, false));

		cube_r123 = new ModelRenderer(this);
		cube_r123.setRotationPoint(-0.2F, -2.95F, 12.15F);
		asval_stock.addChild(cube_r123);
		setRotationAngle(cube_r123, -0.1228F, 0.1039F, -0.0128F);
		cube_r123.cubeList.add(new ModelBox(cube_r123, 232, 58, 1.0033F, 2.0306F, -24.1531F, 1, 1, 3, 0.0F, false));

		cube_r124 = new ModelRenderer(this);
		cube_r124.setRotationPoint(-3.0F, -1.8F, 42.449F);
		asval_stock.addChild(cube_r124);
		setRotationAngle(cube_r124, -0.0498F, 0.0162F, 0.3138F);
		cube_r124.cubeList.add(new ModelBox(cube_r124, 228, 131, -0.111F, -0.0204F, -29.5433F, 1, 3, 3, 0.0F, false));

		cube_r125 = new ModelRenderer(this);
		cube_r125.setRotationPoint(-1.0F, -1.8F, 42.449F);
		asval_stock.addChild(cube_r125);
		setRotationAngle(cube_r125, -0.0498F, -0.0162F, -0.3138F);
		cube_r125.cubeList.add(new ModelBox(cube_r125, 130, 229, -1.0792F, -0.0822F, -29.5433F, 1, 3, 3, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-3.92F, 8.05F, 41.93F);
		asval_stock.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.0462F, -0.0246F, -0.4881F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 230, 76, -0.0638F, -0.0957F, -29.5433F, 1, 2, 3, 0.001F, false));

		cube_r127 = new ModelRenderer(this);
		cube_r127.setRotationPoint(-3.92F, 1.05F, 42.3F);
		asval_stock.addChild(cube_r127);
		setRotationAngle(cube_r127, -0.0524F, 0.0F, 0.0F);
		cube_r127.cubeList.add(new ModelBox(cube_r127, 150, 224, -0.1F, -0.0527F, -29.5433F, 1, 7, 3, 0.001F, false));
		cube_r127.cubeList.add(new ModelBox(cube_r127, 159, 224, 2.74F, -0.0527F, -29.5433F, 1, 7, 3, 0.001F, false));

		cube_r128 = new ModelRenderer(this);
		cube_r128.setRotationPoint(-0.08F, 8.05F, 41.93F);
		asval_stock.addChild(cube_r128);
		setRotationAngle(cube_r128, -0.0462F, 0.0246F, 0.4881F);
		cube_r128.cubeList.add(new ModelBox(cube_r128, 230, 82, -1.1128F, -0.0019F, -29.5433F, 1, 2, 3, 0.001F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1.0F, -1.8F, 42.449F);
		asval_stock.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.0524F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 228, 71, -2.1F, 10.5673F, -29.5433F, 2, 1, 3, 0.001F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 226, 220, -2.1F, 0.9473F, -27.5433F, 2, 10, 1, 0.001F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 139, 229, -2.1F, -0.0527F, -29.5433F, 2, 1, 3, 0.001F, false));

		cube_r130 = new ModelRenderer(this);
		cube_r130.setRotationPoint(-1.0F, -3.8F, 15.549F);
		asval_stock.addChild(cube_r130);
		setRotationAngle(cube_r130, -0.4189F, 0.0F, 0.0F);
		cube_r130.cubeList.add(new ModelBox(cube_r130, 0, 187, -2.1F, 10.8098F, -20.1674F, 2, 2, 21, -0.5F, false));

		cube_r131 = new ModelRenderer(this);
		cube_r131.setRotationPoint(-1.0F, -3.4F, 15.449F);
		asval_stock.addChild(cube_r131);
		setRotationAngle(cube_r131, -0.0524F, 0.0F, 0.0F);
		cube_r131.cubeList.add(new ModelBox(cube_r131, 168, 224, -2.101F, 9.7058F, -4.5208F, 2, 2, 4, -0.499F, false));
		cube_r131.cubeList.add(new ModelBox(cube_r131, 181, 224, -2.101F, 2.6072F, -25.8362F, 2, 2, 4, -0.499F, false));
		cube_r131.cubeList.add(new ModelBox(cube_r131, 158, 120, -2.1F, 0.1009F, -25.9262F, 2, 2, 25, -0.5F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.5F, -3.95F, 10.55F);
		asval_stock.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.1222F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 118, 234, -1.5F, 2.0322F, -23.9317F, 1, 4, 1, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, -4.6F, 9.55F);
		asval_stock.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.1222F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 233, 218, -3.8F, 1.7322F, -24.2317F, 3, 2, 1, -0.201F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 233, 222, -3.5F, 2.4322F, -23.9317F, 2, 1, 2, 0.098F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 230, 0, -3.5F, 3.0322F, -23.9317F, 2, 4, 2, 0.1F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 230, 88, -1.5F, 2.0322F, -23.9317F, 1, 5, 2, 0.101F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-3.0F, -2.2F, 36.249F);
		asval_stock.addChild(bone2);
		setRotationAngle(bone2, -0.2094F, 0.0F, 0.0F);
		

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(2.92F, 2.85F, -0.149F);
		bone2.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.0524F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 230, 96, -1.0035F, 7.2262F, -32.167F, 1, 2, 3, -0.1F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 216, 227, -1.4035F, 6.139F, -32.1584F, 1, 4, 3, 0.001F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(2.0F, 0.0F, 0.0F);
		bone2.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0698F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 230, 7, -2.1F, 3.1066F, -32.8876F, 2, 1, 3, 0.001F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(2.0F, 0.0F, 0.0F);
		bone2.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0026F, 0.0187F, -0.3137F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 230, 116, -2.1493F, 5.014F, -32.6313F, 1, 2, 3, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(2.0F, -0.1247F, 0.5869F);
		bone2.addChild(bone3);
		setRotationAngle(bone3, -0.0698F, 0.0F, 0.0F);
		

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.0524F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 230, 12, -2.4038F, 16.157F, -31.7383F, 2, 1, 3, 0.001F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.92F, 9.85F, -0.519F);
		bone3.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.0462F, 0.0246F, 0.4881F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 55, 231, 1.2431F, 5.0763F, -31.7387F, 1, 2, 3, 0.001F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		asval_stock.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}