package com.paneedah.mwc.models;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M93RStock extends ModelBase {
	private final ModelRenderer stock;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;

	public M93RStock() {
		textureWidth = 512;
		textureHeight = 256;

		stock = new ModelRenderer(this);
		stock.setRotationPoint(0.0F, 25.25F, -0.3F);
		stock.cubeList.add(new ModelBox(stock, 141, 23, -2.0F, -21.75F, 3.0F, 1, 3, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 128, 10, -2.5F, -18.75F, 5.0F, 2, 3, 16, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 128, 10, -2.5F, -18.75F, 21.0F, 2, 1, 16, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 148, 23, -2.5F, -20.75F, 37.0F, 2, 9, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 141, 23, -2.5F, -18.75F, 3.0F, 4, 3, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 139, 21, 0.5F, -18.75F, -2.0F, 1, 3, 5, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.5F, -17.799F, -2.549F);
		stock.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.5236F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 141, 23, 2.0F, -1.5F, -1.5F, 1, 3, 3, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.5F, -17.3566F, 44.4011F);
		stock.addChild(cube_r2);
		setRotationAngle(cube_r2, -1.309F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 141, 23, 0.0F, 6.6F, -3.2F, 1, 1, 3, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 137, 19, -1.0F, 7.6F, -3.5F, 2, 1, 7, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1.5F, -17.4146F, 35.8274F);
		stock.addChild(cube_r3);
		setRotationAngle(cube_r3, -2.0508F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 141, 23, -1.0F, -0.5F, -3.5F, 2, 1, 3, 0.0F, false));
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