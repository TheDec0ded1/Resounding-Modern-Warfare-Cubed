package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class BundT_MP9Stock extends ModelBase {
	private final ModelRenderer stock;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;

	public BundT_MP9Stock() {
		textureWidth = 240;
		textureHeight = 240;

		stock = new ModelRenderer(this);
		stock.setRotationPoint(0.0F, 24.0F, 0.0F);
		stock.cubeList.add(new ModelBox(stock, 0, 35, -1.999F, -33.5827F, 11.1989F, 1, 1, 35, 0.1F, false));
		stock.cubeList.add(new ModelBox(stock, 184, 228, -3.999F, -33.1827F, 10.7989F, 2, 2, 1, 0.1F, false));
		stock.cubeList.add(new ModelBox(stock, 116, 86, -2.0F, -32.9827F, 38.1989F, 1, 2, 8, 0.1F, false));
		stock.cubeList.add(new ModelBox(stock, 226, 134, -2.0F, -31.6099F, 42.4545F, 1, 2, 2, -0.1F, false));
		stock.cubeList.add(new ModelBox(stock, 216, 230, -1.999F, -29.8099F, 43.4545F, 1, 2, 1, -0.1F, false));
		stock.cubeList.add(new ModelBox(stock, 226, 138, -2.0F, -28.5099F, 42.7545F, 1, 2, 2, -0.1F, false));
		stock.cubeList.add(new ModelBox(stock, 98, 192, -2.8061F, -30.7756F, 44.2989F, 1, 14, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 78, 141, -2.1919F, -30.7756F, 44.298F, 2, 14, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 72, 35, -1.999F, -33.5827F, 11.1989F, 1, 2, 27, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 74, 0, -1.999F, -31.9827F, 11.1989F, 1, 1, 27, 0.1F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.499F, -25.3393F, 43.9295F);
		stock.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 62, 207, -0.5F, -1.5F, -1.0F, 1, 10, 2, -0.1F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-1.499F, -30.2756F, 43.2616F);
		stock.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.7854F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 226, 130, -0.5F, -1.0F, -2.0F, 1, 2, 2, -0.1F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-0.899F, -30.7756F, 42.2989F);
		stock.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 228, 183, -0.5F, -0.5F, 2.0F, 1, 1, 2, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-14.2612F, -18.6133F, -1.7011F);
		stock.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 178, 228, -0.5F, -17.7F, 46.0F, 1, 1, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		stock.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}