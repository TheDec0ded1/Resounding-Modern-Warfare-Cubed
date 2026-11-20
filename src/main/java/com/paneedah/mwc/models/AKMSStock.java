package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AKMSStock extends ModelBase {
	private final ModelRenderer stock;
	private final ModelRenderer gun365;
	private final ModelRenderer gun349;
	private final ModelRenderer gun348;
	private final ModelRenderer gun245;
	private final ModelRenderer gun43;
	private final ModelRenderer gun244;
	private final ModelRenderer gun243;
	private final ModelRenderer gun242;
	private final ModelRenderer gun241;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer gun240;
	private final ModelRenderer gun239;
	private final ModelRenderer gun238;
	private final ModelRenderer gun237;
	private final ModelRenderer gun236;
	private final ModelRenderer gun235;
	private final ModelRenderer gun234;
	private final ModelRenderer gun233;

	public AKMSStock() {
		textureWidth = 200;
		textureHeight = 200;

		stock = new ModelRenderer(this);
		stock.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		gun365 = new ModelRenderer(this);
		gun365.setRotationPoint(2.6F, -36.0F, 3.5F);
		stock.addChild(gun365);
		setRotationAngle(gun365, -0.0986F, 0.0F, 0.0F);
		gun365.cubeList.add(new ModelBox(gun365, 44, 120, -1.75F, 3.0F, -2.4F, 1, 1, 18, 0.0F, false));
		gun365.cubeList.add(new ModelBox(gun365, 44, 120, -7.35F, 3.0F, -2.4F, 1, 1, 18, 0.0F, false));
		gun365.cubeList.add(new ModelBox(gun365, 44, 120, -7.35F, 3.4F, -2.4F, 1, 1, 18, 0.0F, false));
		gun365.cubeList.add(new ModelBox(gun365, 44, 120, -1.75F, 3.4F, -2.4F, 1, 1, 18, 0.0F, false));
		gun365.cubeList.add(new ModelBox(gun365, 44, 120, -7.35F, 3.4F, 8.7F, 1, 1, 18, 0.0F, false));
		gun365.cubeList.add(new ModelBox(gun365, 44, 120, -1.75F, 3.4F, 8.7F, 1, 1, 18, 0.0F, false));
		gun365.cubeList.add(new ModelBox(gun365, 44, 120, -7.35F, 3.0F, 8.7F, 1, 1, 18, 0.0F, false));
		gun365.cubeList.add(new ModelBox(gun365, 44, 120, -1.75F, 3.0F, 8.7F, 1, 1, 18, 0.0F, false));

		gun349 = new ModelRenderer(this);
		gun349.setRotationPoint(-0.1F, -33.5F, 8.5F);
		stock.addChild(gun349);
		setRotationAngle(gun349, -0.1859F, 0.0F, 0.0F);
		gun349.cubeList.add(new ModelBox(gun349, 20, 0, 0.9F, 1.2334F, -9.0223F, 1, 2, 1, -0.3F, false));

		gun348 = new ModelRenderer(this);
		gun348.setRotationPoint(-0.4F, -32.6F, 7.5F);
		stock.addChild(gun348);
		setRotationAngle(gun348, -0.1859F, 0.0F, 0.0F);
		gun348.cubeList.add(new ModelBox(gun348, 60, 29, 1.1F, 0.7334F, -8.7223F, 1, 1, 2, -0.3F, false));

		gun245 = new ModelRenderer(this);
		gun245.setRotationPoint(0.5F, -31.9F, -0.3F);
		stock.addChild(gun245);
		gun245.cubeList.add(new ModelBox(gun245, 50, 135, -5.0F, -1.2F, -1.0F, 6, 2, 2, -0.3F, false));
		gun245.cubeList.add(new ModelBox(gun245, 50, 135, -5.0F, -2.6F, -1.0F, 6, 2, 2, -0.3F, false));
		gun245.cubeList.add(new ModelBox(gun245, 50, 135, -5.0F, -1.9F, -0.3F, 6, 2, 2, -0.3F, false));
		gun245.cubeList.add(new ModelBox(gun245, 50, 135, -5.0F, -1.9F, -1.7F, 6, 2, 2, -0.3F, false));

		gun43 = new ModelRenderer(this);
		gun43.setRotationPoint(0.5F, -32.3F, -1.0F);
		stock.addChild(gun43);
		setRotationAngle(gun43, -0.7854F, 0.0F, 0.0F);
		gun43.cubeList.add(new ModelBox(gun43, 51, 136, -5.0F, -1.0636F, -0.0636F, 6, 2, 1, -0.3F, false));
		gun43.cubeList.add(new ModelBox(gun43, 51, 136, -5.0F, -1.0636F, -0.4636F, 6, 2, 1, -0.3F, false));
		gun43.cubeList.add(new ModelBox(gun43, 51, 136, -5.0F, -1.0636F, -0.6536F, 6, 2, 1, -0.3F, false));
		gun43.cubeList.add(new ModelBox(gun43, 51, 136, -5.0F, -2.6335F, -0.6536F, 6, 2, 1, -0.3F, false));
		gun43.cubeList.add(new ModelBox(gun43, 51, 136, -5.0F, -2.6335F, -0.2536F, 6, 2, 1, -0.3F, false));
		gun43.cubeList.add(new ModelBox(gun43, 51, 136, -5.0F, -2.6335F, -0.0636F, 6, 2, 1, -0.3F, false));
		gun43.cubeList.add(new ModelBox(gun43, 50, 135, -5.0F, -1.0536F, -0.0737F, 6, 1, 2, -0.3F, false));
		gun43.cubeList.add(new ModelBox(gun43, 50, 135, -5.0F, -1.6435F, -0.0737F, 6, 1, 2, -0.3F, false));
		gun43.cubeList.add(new ModelBox(gun43, 50, 135, -5.0F, -1.2435F, -0.0737F, 6, 1, 2, -0.3F, false));
		gun43.cubeList.add(new ModelBox(gun43, 50, 135, -5.0F, -1.6435F, -1.6435F, 6, 1, 2, -0.3F, false));
		gun43.cubeList.add(new ModelBox(gun43, 50, 135, -5.0F, -1.4536F, -1.6435F, 6, 1, 2, -0.3F, false));
		gun43.cubeList.add(new ModelBox(gun43, 50, 135, -5.0F, -1.0536F, -1.6435F, 6, 1, 2, -0.3F, false));

		gun244 = new ModelRenderer(this);
		gun244.setRotationPoint(-0.6F, -32.9F, 29.7F);
		stock.addChild(gun244);
		setRotationAngle(gun244, -0.0873F, 0.0F, 0.0F);
		gun244.cubeList.add(new ModelBox(gun244, 13, 20, 1.0F, 0.0523F, 0.4023F, 1, 10, 1, 0.0F, false));
		gun244.cubeList.add(new ModelBox(gun244, 13, 20, 1.0F, 2.0523F, -0.5977F, 1, 2, 1, 0.0F, false));

		gun243 = new ModelRenderer(this);
		gun243.setRotationPoint(-3.4F, -32.9F, 29.7F);
		stock.addChild(gun243);
		setRotationAngle(gun243, -0.0873F, 0.0F, 0.0F);
		gun243.cubeList.add(new ModelBox(gun243, 48, 1, -1.0F, 0.0523F, 0.4023F, 1, 10, 1, 0.0F, false));
		gun243.cubeList.add(new ModelBox(gun243, 48, 1, -1.0F, 2.0523F, -0.5977F, 1, 2, 1, 0.0F, false));

		gun242 = new ModelRenderer(this);
		gun242.setRotationPoint(-2.9F, -33.9F, 30.8F);
		stock.addChild(gun242);
		setRotationAngle(gun242, -0.0873F, 0.0F, 0.0F);
		gun242.cubeList.add(new ModelBox(gun242, 6, 80, -0.6F, 10.0513F, -0.5967F, 2, 2, 1, 0.0F, false));
		gun242.cubeList.add(new ModelBox(gun242, 6, 80, 1.4F, 10.0513F, -0.5967F, 2, 2, 1, 0.0F, false));

		gun241 = new ModelRenderer(this);
		gun241.setRotationPoint(-3.5F, -23.9F, 28.6F);
		stock.addChild(gun241);
		setRotationAngle(gun241, -0.0873F, 0.0F, 0.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(6.8284F, 1.8976F, 0.723F);
		gun241.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 52, 136, -1.7F, -3.0F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 52, 136, -2.0F, -3.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(2.1213F, 2.6047F, 0.723F);
		gun241.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 52, 136, -1.0F, -3.3F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 52, 136, -1.0F, -3.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun240 = new ModelRenderer(this);
		gun240.setRotationPoint(-3.5F, -29.7F, 26.4F);
		stock.addChild(gun240);
		setRotationAngle(gun240, -0.1115F, 0.0F, 0.0F);
		

		gun239 = new ModelRenderer(this);
		gun239.setRotationPoint(-3.5F, -33.6F, 3.5F);
		stock.addChild(gun239);
		setRotationAngle(gun239, -0.2974F, 0.0F, 0.0F);
		

		gun238 = new ModelRenderer(this);
		gun238.setRotationPoint(-3.5F, -34.6F, 12.75F);
		stock.addChild(gun238);
		setRotationAngle(gun238, -0.0873F, 0.0F, 0.0F);
		

		gun237 = new ModelRenderer(this);
		gun237.setRotationPoint(-3.0F, -35.5F, 12.95F);
		stock.addChild(gun237);
		setRotationAngle(gun237, -0.0873F, 0.0F, 0.0F);
		

		gun236 = new ModelRenderer(this);
		gun236.setRotationPoint(-3.0F, -33.2F, 8.5F);
		stock.addChild(gun236);
		setRotationAngle(gun236, 0.4833F, 0.0F, 0.0F);
		

		gun235 = new ModelRenderer(this);
		gun235.setRotationPoint(-3.5F, -32.3F, 8.5F);
		stock.addChild(gun235);
		setRotationAngle(gun235, 0.4833F, 0.0F, 0.0F);
		

		gun234 = new ModelRenderer(this);
		gun234.setRotationPoint(-3.0F, -35.9F, 3.5F);
		stock.addChild(gun234);
		setRotationAngle(gun234, -0.1859F, 0.0F, 0.0F);
		

		gun233 = new ModelRenderer(this);
		gun233.setRotationPoint(-3.5F, -34.9F, 3.5F);
		stock.addChild(gun233);
		setRotationAngle(gun233, -0.1859F, 0.0F, 0.0F);
		
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