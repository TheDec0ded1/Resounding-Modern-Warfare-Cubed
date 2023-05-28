package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class K1AStock extends ModelBase {
	private final ModelRenderer stock;
	private final ModelRenderer bone102;
	private final ModelRenderer bone103;
	private final ModelRenderer bone104;

	public K1AStock() {
		textureWidth = 512;
		textureHeight = 256;

		stock = new ModelRenderer(this);
		stock.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		bone102 = new ModelRenderer(this);
		bone102.setRotationPoint(0.0F, 0.0F, 0.0F);
		stock.addChild(bone102);
		bone102.cubeList.add(new ModelBox(bone102, 139, 32, -3.5F, -39.0F, 5.5F, 4, 5, 31, 0.0F, false));
		bone102.cubeList.add(new ModelBox(bone102, 148, 41, -3.0F, -39.5F, 5.5F, 3, 4, 22, 0.0F, false));
		bone102.cubeList.add(new ModelBox(bone102, 148, 41, -3.0F, -37.5F, 5.5F, 3, 4, 22, 0.0F, false));
		bone102.cubeList.add(new ModelBox(bone102, 136, 29, -3.5F, -40.9F, 31.5F, 4, 2, 5, 0.0F, false));
		bone102.cubeList.add(new ModelBox(bone102, 136, 29, -3.0F, -41.65F, 31.5F, 3, 4, 5, 0.0F, false));
		bone102.cubeList.add(new ModelBox(bone102, 136, 29, -3.0F, -29.45F, 31.5F, 3, 4, 5, 0.0F, false));
		bone102.cubeList.add(new ModelBox(bone102, 136, 29, -3.5F, -34.0F, 31.5F, 4, 8, 5, 0.0F, false));

		bone103 = new ModelRenderer(this);
		bone103.setRotationPoint(-1.5F, -41.0F, 29.0F);
		stock.addChild(bone103);
		setRotationAngle(bone103, 0.5236F, 0.0F, 0.0F);
		bone103.cubeList.add(new ModelBox(bone103, 137, 30, -2.0F, 1.3366F, -2.8849F, 4, 4, 5, 0.0F, false));
		bone103.cubeList.add(new ModelBox(bone103, 136, 29, -1.5F, 0.6871F, -3.5099F, 3, 4, 6, 0.0F, false));

		bone104 = new ModelRenderer(this);
		bone104.setRotationPoint(-1.5F, -41.0F, 29.0F);
		stock.addChild(bone104);
		setRotationAngle(bone104, -0.5236F, 0.0F, 0.0F);
		bone104.cubeList.add(new ModelBox(bone104, 126, 19, -2.0F, 5.7404F, -5.3349F, 4, 6, 15, 0.0F, false));
		bone104.cubeList.add(new ModelBox(bone104, 138, 31, -2.0F, 4.7404F, 3.6651F, 4, 1, 3, 0.0F, false));
		bone104.cubeList.add(new ModelBox(bone104, 125, 18, -1.5F, 8.2167F, -7.0599F, 3, 4, 17, 0.0F, false));
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