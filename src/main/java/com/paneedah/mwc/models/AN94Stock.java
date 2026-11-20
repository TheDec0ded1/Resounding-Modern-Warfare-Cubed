package com.paneedah.mwc.models;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AN94Stock extends ModelBase {
	private final ModelRenderer stock;
	private final ModelRenderer gun371_r1;
	private final ModelRenderer gun370_r1;
	private final ModelRenderer gun368_r1;

	public AN94Stock() {
		textureWidth = 512;
		textureHeight = 256;

		stock = new ModelRenderer(this);
		stock.setRotationPoint(-1.0F, -7.1938F, -0.5075F);
		stock.cubeList.add(new ModelBox(stock, 200, 202, -2.5F, -3.1552F, 7.2565F, 4, 1, 23, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 200, 202, -1.5F, -4.1552F, 7.2565F, 2, 1, 23, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 220, 222, -1.5F, 5.8448F, 27.2565F, 2, 1, 3, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 150, 49, -1.5F, 5.8448F, 30.2565F, 2, 1, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 150, 49, -1.5F, -4.1552F, 30.2565F, 2, 1, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 150, 49, -2.5F, -3.1552F, 30.2565F, 4, 9, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 208, 210, -2.5F, -2.1552F, 15.2565F, 4, 3, 15, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 218, 220, -2.5F, 0.8448F, 25.2565F, 4, 4, 5, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 220, 222, -2.5F, 4.8448F, 27.2565F, 4, 1, 3, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 220, 222, -2.5F, 0.8448F, 19.4815F, 4, 2, 3, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 220, 222, -2.5F, 0.8448F, 22.2815F, 4, 3, 3, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 222, 224, -2.5F, 3.6448F, 24.2815F, 4, 1, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 219, 221, -2.5F, 0.8448F, 16.5315F, 4, 1, 4, 0.0F, false));

		gun371_r1 = new ModelRenderer(this);
		gun371_r1.setRotationPoint(-0.5F, 1.5038F, 22.8155F);
		stock.addChild(gun371_r1);
		setRotationAngle(gun371_r1, -0.3491F, 0.0F, 0.0F);
		gun371_r1.cubeList.add(new ModelBox(gun371_r1, 185, 224, -1.0F, 2.5F, 5.0F, 2, 1, 1, 0.0F, false));
		gun371_r1.cubeList.add(new ModelBox(gun371_r1, 222, 224, -2.0F, 1.5F, 5.0F, 4, 1, 1, 0.0F, false));

		gun370_r1 = new ModelRenderer(this);
		gun370_r1.setRotationPoint(-0.5F, 1.2882F, 22.3347F);
		stock.addChild(gun370_r1);
		setRotationAngle(gun370_r1, -0.3491F, 0.0F, 0.0F);
		gun370_r1.cubeList.add(new ModelBox(gun370_r1, 173, 212, -1.0F, 2.5F, -7.0F, 2, 1, 13, 0.0F, false));
		gun370_r1.cubeList.add(new ModelBox(gun370_r1, 210, 212, -2.0F, 1.5F, -7.0F, 4, 1, 13, 0.0F, false));

		gun368_r1 = new ModelRenderer(this);
		gun368_r1.setRotationPoint(0.0F, -1.0F, 0.0F);
		stock.addChild(gun368_r1);
		setRotationAngle(gun368_r1, -0.0873F, 0.0F, 0.0F);
		gun368_r1.cubeList.add(new ModelBox(gun368_r1, 211, 213, -2.5F, -2.8052F, 4.0065F, 4, 4, 12, 0.0F, false));
		gun368_r1.cubeList.add(new ModelBox(gun368_r1, 145, 215, -1.5F, -3.8052F, 4.0065F, 2, 6, 12, 0.0F, false));
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