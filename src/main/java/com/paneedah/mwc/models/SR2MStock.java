package com.paneedah.mwc.models;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SR2MStock extends ModelBase {
	private final ModelRenderer stock;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer bone34;
	private final ModelRenderer cube_r3;

	public SR2MStock() {
		textureWidth = 256;
		textureHeight = 256;

		stock = new ModelRenderer(this);
		stock.setRotationPoint(0.0F, 24.0F, 0.0F);
		stock.cubeList.add(new ModelBox(stock, 73, 153, -1.7F, -35.1F, 17.8F, 2, 2, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 73, 153, -3.9F, -35.1F, 17.8F, 2, 2, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 154, 100, 0.3F, -30.4827F, 23.218F, 1, 3, 21, -0.3F, false));
		stock.cubeList.add(new ModelBox(stock, 154, 100, -4.2F, -30.4827F, 23.218F, 1, 3, 21, -0.3F, false));
		stock.cubeList.add(new ModelBox(stock, 164, 110, 0.3F, -30.4827F, 43.618F, 1, 2, 10, -0.3F, false));
		stock.cubeList.add(new ModelBox(stock, 164, 110, -4.2F, -30.4827F, 43.618F, 1, 2, 10, -0.3F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-3.2F, -28.9827F, 48.618F);
		stock.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 1.5708F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 70, 113, -0.5F, -4.2F, -5.0F, 1, 5, 10, -0.3F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-3.7F, -29.4827F, 53.518F);
		stock.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -1.5708F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 78, 153, -1.3F, -3.0F, -0.5F, 1, 4, 1, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 78, 153, -1.3F, 0.4F, -0.5F, 1, 6, 1, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 78, 153, -1.3F, 0.4F, -5.0F, 1, 6, 1, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 78, 153, -1.3F, -3.0F, -5.0F, 1, 4, 1, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 78, 153, -0.9F, 0.4F, -0.5F, 1, 6, 1, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 78, 153, -0.9F, 0.4F, -5.0F, 1, 6, 1, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 77, 152, -0.5F, 0.4F, -1.5F, 1, 6, 2, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 75, 150, -0.5F, 3.6F, -4.2F, 1, 2, 4, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 77, 152, -0.5F, 0.4F, -5.0F, 1, 6, 2, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 78, 153, -0.9F, -3.0F, -0.5F, 1, 4, 1, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 78, 153, -0.9F, -3.0F, -5.0F, 1, 4, 1, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 76, 151, -0.5F, -3.0F, -2.5F, 1, 4, 3, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 75, 150, -0.5F, -3.0F, -5.0F, 1, 4, 4, -0.3F, false));

		bone34 = new ModelRenderer(this);
		bone34.setRotationPoint(-2.0F, -33.1F, 21.1F);
		stock.addChild(bone34);
		

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-0.3F, 0.0F, 0.0F);
		bone34.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.48F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 170, 116, -1.9F, -0.5F, -0.1F, 1, 2, 5, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 170, 116, 2.6F, -0.5F, -0.1F, 1, 2, 5, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 170, 116, -1.9F, -1.5F, -0.1F, 1, 1, 5, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 170, 116, 2.6F, -1.5F, -0.1F, 1, 1, 5, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 170, 116, -1.9F, -1.5F, 3.9F, 1, 3, 5, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 170, 116, 2.6F, -1.5F, 3.9F, 1, 3, 5, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 174, 120, 2.6F, -1.5F, -0.1F, 1, 3, 1, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 174, 120, -1.9F, -1.5F, -0.1F, 1, 3, 1, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 170, 116, -1.9F, 0.9F, -0.1F, 1, 3, 5, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 170, 116, 2.6F, 0.9F, -0.1F, 1, 3, 5, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 170, 116, 2.3F, 0.9F, -4.5F, 1, 3, 5, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 170, 116, -1.6F, 0.9F, -4.5F, 1, 3, 5, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 170, 116, 2.3F, -1.5F, -4.5F, 1, 3, 5, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 170, 116, -1.6F, -1.5F, -4.5F, 1, 3, 5, -0.3F, false));
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