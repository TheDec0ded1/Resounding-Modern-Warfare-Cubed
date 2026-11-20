package com.paneedah.mwc.models;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class MPIKMStock extends ModelBase {
	private final ModelRenderer stock;
	private final ModelRenderer gun365;
	private final ModelRenderer gun349;
	private final ModelRenderer gun348;
	private final ModelRenderer gun245;
	private final ModelRenderer gun244;
	private final ModelRenderer gun243;
	private final ModelRenderer gun242;
	private final ModelRenderer gun241;
	private final ModelRenderer gun240;
	private final ModelRenderer gun239;
	private final ModelRenderer gun238;
	private final ModelRenderer gun237;
	private final ModelRenderer gun236;
	private final ModelRenderer gun235;
	private final ModelRenderer gun234;
	private final ModelRenderer gun233;

	public MPIKMStock() {
		textureWidth = 200;
		textureHeight = 200;

		stock = new ModelRenderer(this);
		stock.setRotationPoint(0.0F, 24.2F, 3.0F);
		setRotationAngle(stock, 0.0873F, 0.0F, 0.0F);
		

		gun365 = new ModelRenderer(this);
		gun365.setRotationPoint(-2.5F, -36.0F, 3.5F);
		stock.addChild(gun365);
		setRotationAngle(gun365, -0.1859F, 0.0F, 0.0F);
		gun365.cubeList.add(new ModelBox(gun365, 27, 19, 0.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F, false));

		gun349 = new ModelRenderer(this);
		gun349.setRotationPoint(-0.1F, -33.5F, 8.5F);
		stock.addChild(gun349);
		setRotationAngle(gun349, -0.1859F, 0.0F, 0.0F);
		

		gun348 = new ModelRenderer(this);
		gun348.setRotationPoint(-0.4F, -32.6F, 7.5F);
		stock.addChild(gun348);
		setRotationAngle(gun348, -0.1859F, 0.0F, 0.0F);
		

		gun245 = new ModelRenderer(this);
		gun245.setRotationPoint(-1.1F, -33.9F, 30.8F);
		stock.addChild(gun245);
		setRotationAngle(gun245, -0.0873F, 0.0F, 0.0F);
		gun245.cubeList.add(new ModelBox(gun245, 35, 19, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun244 = new ModelRenderer(this);
		gun244.setRotationPoint(-0.6F, -32.9F, 29.7F);
		stock.addChild(gun244);
		setRotationAngle(gun244, -0.0873F, 0.0F, 0.0F);
		gun244.cubeList.add(new ModelBox(gun244, 12, 19, 0.0F, 0.0F, 0.0F, 1, 10, 2, 0.0F, false));

		gun243 = new ModelRenderer(this);
		gun243.setRotationPoint(-3.4F, -32.9F, 29.7F);
		stock.addChild(gun243);
		setRotationAngle(gun243, -0.0873F, 0.0F, 0.0F);
		gun243.cubeList.add(new ModelBox(gun243, 47, 0, 0.0F, 0.0F, 0.0F, 3, 10, 2, 0.0F, false));

		gun242 = new ModelRenderer(this);
		gun242.setRotationPoint(-2.9F, -33.9F, 30.8F);
		stock.addChild(gun242);
		setRotationAngle(gun242, -0.0873F, 0.0F, 0.0F);
		gun242.cubeList.add(new ModelBox(gun242, 6, 80, 0.0F, -0.001F, 0.001F, 2, 2, 1, 0.0F, false));

		gun241 = new ModelRenderer(this);
		gun241.setRotationPoint(-3.5F, -23.9F, 28.6F);
		stock.addChild(gun241);
		setRotationAngle(gun241, -0.1115F, 0.0F, 0.0F);
		gun241.cubeList.add(new ModelBox(gun241, 79, 70, 0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

		gun240 = new ModelRenderer(this);
		gun240.setRotationPoint(-3.5F, -29.7F, 26.4F);
		stock.addChild(gun240);
		setRotationAngle(gun240, -0.1115F, 0.0F, 0.0F);
		gun240.cubeList.add(new ModelBox(gun240, 23, 40, 0.002F, 0.0F, 0.0F, 4, 6, 4, 0.0F, false));

		gun239 = new ModelRenderer(this);
		gun239.setRotationPoint(-3.5F, -33.6F, 3.5F);
		stock.addChild(gun239);
		setRotationAngle(gun239, -0.2974F, 0.0F, 0.0F);
		gun239.cubeList.add(new ModelBox(gun239, 0, 83, -0.001F, 0.0F, 0.0F, 4, 3, 27, 0.0F, false));

		gun238 = new ModelRenderer(this);
		gun238.setRotationPoint(-3.5F, -34.6F, 12.75F);
		stock.addChild(gun238);
		setRotationAngle(gun238, -0.0873F, 0.0F, 0.0F);
		gun238.cubeList.add(new ModelBox(gun238, 0, 113, 0.0F, 0.0F, 0.0F, 4, 4, 18, 0.0F, false));

		gun237 = new ModelRenderer(this);
		gun237.setRotationPoint(-3.0F, -35.5F, 12.95F);
		stock.addChild(gun237);
		setRotationAngle(gun237, -0.0873F, 0.0F, 0.0F);
		gun237.cubeList.add(new ModelBox(gun237, 140, 53, 0.0F, 0.0F, 0.0F, 3, 2, 18, 0.0F, false));

		gun236 = new ModelRenderer(this);
		gun236.setRotationPoint(-3.0F, -33.2F, 8.5F);
		stock.addChild(gun236);
		setRotationAngle(gun236, 0.4833F, 0.0F, 0.0F);
		gun236.cubeList.add(new ModelBox(gun236, 0, 144, -0.001F, 0.0F, 0.0F, 3, 2, 5, 0.0F, false));

		gun235 = new ModelRenderer(this);
		gun235.setRotationPoint(-3.5F, -32.3F, 8.5F);
		stock.addChild(gun235);
		setRotationAngle(gun235, 0.4833F, 0.0F, 0.0F);
		gun235.cubeList.add(new ModelBox(gun235, 0, 123, -0.002F, 0.0F, 0.0F, 4, 2, 5, 0.0F, false));

		gun234 = new ModelRenderer(this);
		gun234.setRotationPoint(-3.0F, -35.9F, 3.5F);
		stock.addChild(gun234);
		setRotationAngle(gun234, -0.1859F, 0.0F, 0.0F);
		gun234.cubeList.add(new ModelBox(gun234, 141, 95, 0.0F, 0.0F, 0.0F, 3, 2, 11, 0.0F, false));

		gun233 = new ModelRenderer(this);
		gun233.setRotationPoint(-3.5F, -34.9F, 3.5F);
		stock.addChild(gun233);
		setRotationAngle(gun233, -0.1859F, 0.0F, 0.0F);
		gun233.cubeList.add(new ModelBox(gun233, 82, 75, 0.001F, 0.0F, 0.0F, 4, 4, 27, 0.0F, false));
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