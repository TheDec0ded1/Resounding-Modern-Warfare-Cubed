package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class GalilStock extends ModelBase {
	private final ModelRenderer stock;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;

	public GalilStock() {
		textureWidth = 200;
		textureHeight = 200;

		stock = new ModelRenderer(this);
		stock.setRotationPoint(0.0F, 24.0F, 0.0F);
		stock.cubeList.add(new ModelBox(stock, 42, 5, -3.3F, -35.1675F, 4.3967F, 4, 4, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 42, 5, -2.3F, -35.1675F, 6.3967F, 3, 1, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 42, 5, -4.3F, -36.1675F, 6.3967F, 3, 1, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 43, 6, -2.3F, -34.1675F, 7.3967F, 3, 1, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 42, 5, -2.5F, -35.1675F, 8.5967F, 2, 4, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 43, 6, -3.0F, -34.9675F, 36.5967F, 3, 1, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 43, 6, -3.0F, -23.5675F, 36.5967F, 3, 1, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 47, 1, -3.5F, -33.9675F, 36.5967F, 4, 10, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 47, 1, -2.5F, -33.9675F, 35.5967F, 2, 10, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 47, 1, -3.5F, -24.5675F, 36.5967F, 4, 1, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 90, 107, -2.0F, -34.7675F, 10.5967F, 1, 1, 26, 0.2F, false));
		stock.cubeList.add(new ModelBox(stock, 105, 122, -2.0F, -32.6675F, 10.5967F, 1, 1, 11, 0.2F, false));
		stock.cubeList.add(new ModelBox(stock, 115, 132, -2.0F, -33.6675F, 19.5967F, 1, 1, 1, 0.2F, false));
		stock.cubeList.add(new ModelBox(stock, 48, 0, -4.5F, -36.1675F, 6.5967F, 2, 5, 2, -0.4F, false));
		stock.cubeList.add(new ModelBox(stock, 48, 0, -4.5F, -35.4675F, 6.5967F, 2, 3, 2, -0.3F, false));
		stock.cubeList.add(new ModelBox(stock, 42, 5, -2.5F, -33.1675F, 6.5967F, 2, 1, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 43, 6, -2.5F, -34.1675F, 6.5967F, 2, 1, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 42, 5, -4.3F, -32.1675F, 6.3967F, 5, 1, 2, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-3.211F, -33.9675F, 8.2535F);
		stock.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.829F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 47, -1, -1.0F, -1.5F, -1.0F, 2, 3, 3, -0.3F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.5F, -35.4113F, 15.9908F);
		stock.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.5236F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 115, 132, -0.5F, -0.5F, 23.2F, 1, 1, 1, 0.2F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 99, 116, -0.5F, -0.5F, 6.5F, 1, 1, 17, 0.2F, false));
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