package com.paneedah.mwc.models;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class amd65stock extends ModelBase {
	private final ModelRenderer stock;
	private final ModelRenderer gun82_r1;
	private final ModelRenderer gun245;
	private final ModelRenderer gun244;
	private final ModelRenderer gun243;
	private final ModelRenderer gun242;

	public amd65stock() {
		textureWidth = 200;
		textureHeight = 200;

		stock = new ModelRenderer(this);
		stock.setRotationPoint(0.0F, 24.2F, 1.4F);
		setRotationAngle(stock, 0.0436F, 0.0F, 0.0F);
		stock.cubeList.add(new ModelBox(stock, 54, 127, -1.999F, -29.8371F, 21.5346F, 1, 1, 8, 0.0F, false));

		gun82_r1 = new ModelRenderer(this);
		gun82_r1.setRotationPoint(-1.499F, -32.7F, 14.6F);
		stock.addChild(gun82_r1);
		setRotationAngle(gun82_r1, -0.1745F, 0.0F, 0.0F);
		gun82_r1.cubeList.add(new ModelBox(gun82_r1, 42, 115, -0.5F, 1.6F, -12.5F, 1, 1, 20, 0.0F, false));

		gun245 = new ModelRenderer(this);
		gun245.setRotationPoint(-1.1F, -33.9F, 30.8F);
		stock.addChild(gun245);
		setRotationAngle(gun245, -0.0873F, 0.0F, 0.0F);
		gun245.cubeList.add(new ModelBox(gun245, 35, 19, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));
		gun245.cubeList.add(new ModelBox(gun245, 35, 19, 0.0F, 10.2077F, 0.0456F, 1, 2, 1, 0.0F, false));
		gun245.cubeList.add(new ModelBox(gun245, 35, 19, 0.0F, -0.0063F, -1.0012F, 1, 2, 1, 0.0F, false));
		gun245.cubeList.add(new ModelBox(gun245, 35, 19, 0.0F, 10.2014F, -0.9556F, 1, 2, 1, 0.0F, false));

		gun244 = new ModelRenderer(this);
		gun244.setRotationPoint(-0.6F, -32.9F, 29.7F);
		stock.addChild(gun244);
		setRotationAngle(gun244, -0.0873F, 0.0F, 0.0F);
		gun244.cubeList.add(new ModelBox(gun244, 13, 20, 0.0F, 0.0F, 1.0F, 1, 10, 1, 0.0F, false));
		gun244.cubeList.add(new ModelBox(gun244, 13, 20, 0.0F, -0.0063F, -0.0012F, 1, 10, 1, 0.0F, false));

		gun243 = new ModelRenderer(this);
		gun243.setRotationPoint(-3.4F, -32.9F, 29.7F);
		stock.addChild(gun243);
		setRotationAngle(gun243, -0.0873F, 0.0F, 0.0F);
		gun243.cubeList.add(new ModelBox(gun243, 48, 1, 0.0F, 0.0F, 1.0F, 3, 10, 1, 0.0F, false));
		gun243.cubeList.add(new ModelBox(gun243, 48, 1, 0.0F, -0.0063F, -0.0012F, 3, 10, 1, 0.0F, false));

		gun242 = new ModelRenderer(this);
		gun242.setRotationPoint(-2.9F, -33.9F, 30.8F);
		stock.addChild(gun242);
		setRotationAngle(gun242, -0.0873F, 0.0F, 0.0F);
		gun242.cubeList.add(new ModelBox(gun242, 6, 80, 0.0F, -0.001F, 0.001F, 2, 2, 1, 0.0F, false));
		gun242.cubeList.add(new ModelBox(gun242, 6, 80, 0.0F, 10.2067F, 0.0466F, 2, 2, 1, 0.0F, false));
		gun242.cubeList.add(new ModelBox(gun242, 6, 80, 0.0F, -0.0073F, -1.0002F, 2, 2, 1, 0.0F, false));
		gun242.cubeList.add(new ModelBox(gun242, 6, 80, 0.0F, 10.2004F, -0.9546F, 2, 2, 1, 0.0F, false));
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