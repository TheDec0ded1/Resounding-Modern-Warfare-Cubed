package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class MinimiStockB extends ModelWithAttachments {
	private final ModelRenderer mk48para_stock;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r12;

	public MinimiStockB() {
		textureWidth = 350;
		textureHeight = 350;

		mk48para_stock = new ModelRenderer(this);
		mk48para_stock.setRotationPoint(3.0F, 10.25F, 77.0F);
		setRotationAngle(mk48para_stock, -0.0873F, 0.0F, 0.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.0F, -9.8F, -70.9F);
		mk48para_stock.addChild(cube_r1);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 207, 129, -3.499F, -10.55F, 9.898F, 2, 2, 23, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 222, 144, -3.499F, -10.55F, 1.898F, 2, 2, 8, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.0F, -4.8F, -73.4F);
		mk48para_stock.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.2618F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 207, 129, -3.499F, -10.55F, 9.898F, 2, 2, 23, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 222, 144, -3.499F, -10.55F, 1.898F, 2, 2, 8, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-2.999F, -20.85F, -37.002F);
		mk48para_stock.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.0524F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 100, 98, -3.0F, 0.0F, -2.0F, 3, 11, 2, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 100, 98, -3.0F, 11.0F, -2.0F, 3, 7, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		mk48para_stock.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}