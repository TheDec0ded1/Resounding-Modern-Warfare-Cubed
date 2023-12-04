package com.paneedah.mwc.models;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Type562Stock extends ModelBase {
	private final ModelRenderer stock;
	private final ModelRenderer gun82_r1;
	private final ModelRenderer gun365;
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
	private final ModelRenderer gun45;
	private final ModelRenderer gun43;

	public Type562Stock() {
		textureWidth = 200;
		textureHeight = 200;

		stock = new ModelRenderer(this);
		stock.setRotationPoint(0.0F, 24.0F, 0.0F);
		stock.cubeList.add(new ModelBox(stock, 37, 110, -2.299F, -36.0F, 5.0F, 2, 1, 25, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 50, 123, -2.299F, -31.3F, 5.0F, 2, 1, 12, 0.0F, false));

		gun82_r1 = new ModelRenderer(this);
		gun82_r1.setRotationPoint(-1.299F, -28.086F, 22.0912F);
		stock.addChild(gun82_r1);
		setRotationAngle(gun82_r1, -0.48F, 0.0F, 0.0F);
		gun82_r1.cubeList.add(new ModelBox(gun82_r1, 48, 121, -1.0F, -0.5F, -6.0F, 2, 1, 14, 0.0F, false));

		gun365 = new ModelRenderer(this);
		gun365.setRotationPoint(-2.5F, -36.0F, 4.5F);
		stock.addChild(gun365);
		setRotationAngle(gun365, -1.5822F, 0.0F, 0.0F);
		gun365.cubeList.add(new ModelBox(gun365, 27, 19, -2.0F, 0.0F, -0.3F, 1, 1, 4, 0.0F, false));
		gun365.cubeList.add(new ModelBox(gun365, 29, 21, -2.0F, 0.0F, 3.7F, 1, 1, 2, 0.0F, false));

		gun245 = new ModelRenderer(this);
		gun245.setRotationPoint(-1.1F, -33.9F, 30.8F);
		stock.addChild(gun245);
		setRotationAngle(gun245, -0.0873F, 0.0F, 0.0F);
		

		gun244 = new ModelRenderer(this);
		gun244.setRotationPoint(-0.6F, -32.9F, 29.7F);
		stock.addChild(gun244);
		setRotationAngle(gun244, -0.0873F, 0.0F, 0.0F);
		

		gun243 = new ModelRenderer(this);
		gun243.setRotationPoint(-3.4F, -32.9F, 29.7F);
		stock.addChild(gun243);
		setRotationAngle(gun243, -0.0873F, 0.0F, 0.0F);
		gun243.cubeList.add(new ModelBox(gun243, 47, 0, 0.601F, -2.0213F, -0.9811F, 3, 10, 2, 0.0F, false));

		gun242 = new ModelRenderer(this);
		gun242.setRotationPoint(-2.9F, -33.9F, 30.8F);
		stock.addChild(gun242);
		setRotationAngle(gun242, -0.0873F, 0.0F, 0.0F);
		gun242.cubeList.add(new ModelBox(gun242, 6, 80, 0.601F, -2.0223F, -0.9801F, 2, 2, 1, 0.0F, false));
		gun242.cubeList.add(new ModelBox(gun242, 6, 80, 0.601F, 8.0777F, -0.9801F, 2, 2, 1, 0.0F, false));

		gun241 = new ModelRenderer(this);
		gun241.setRotationPoint(-3.5F, -23.9F, 28.6F);
		stock.addChild(gun241);
		setRotationAngle(gun241, -0.1115F, 0.0F, 0.0F);
		

		gun240 = new ModelRenderer(this);
		gun240.setRotationPoint(-3.5F, -29.7F, 26.4F);
		stock.addChild(gun240);
		setRotationAngle(gun240, -0.1115F, 0.0F, 0.0F);
		gun240.cubeList.add(new ModelBox(gun240, 25, 42, 2.501F, -4.8506F, -10.1997F, 2, 5, 2, 0.0F, false));
		gun240.cubeList.add(new ModelBox(gun240, 25, 42, -0.099F, -4.8506F, -10.1997F, 2, 5, 2, 0.0F, false));

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
		gun237.cubeList.add(new ModelBox(gun237, 146, 59, 2.501F, 3.8446F, -8.1466F, 1, 1, 12, 0.0F, false));
		gun237.cubeList.add(new ModelBox(gun237, 146, 59, -0.099F, 3.8446F, -8.1466F, 1, 1, 12, 0.0F, false));

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
		gun233.setRotationPoint(-3.5F, -15.6F, 3.5F);
		stock.addChild(gun233);
		gun233.cubeList.add(new ModelBox(gun233, 97, 90, 3.001F, -20.0554F, 1.3034F, 1, 4, 12, 0.0F, false));

		gun45 = new ModelRenderer(this);
		gun45.setRotationPoint(-3.5F, -15.6F, 3.5F);
		stock.addChild(gun45);
		gun45.cubeList.add(new ModelBox(gun45, 97, 90, 0.401F, -20.0554F, 1.3034F, 1, 4, 12, 0.0F, false));

		gun43 = new ModelRenderer(this);
		gun43.setRotationPoint(8.8F, -36.0F, 3.5F);
		stock.addChild(gun43);
		setRotationAngle(gun43, 0.0F, -1.5708F, 0.0F);
		gun43.cubeList.add(new ModelBox(gun43, 0, 54, -0.4F, 0.001F, 7.999F, 2, 5, 4, 0.0F, false));
		gun43.cubeList.add(new ModelBox(gun43, 3, 57, -0.4F, 0.001F, 11.499F, 2, 5, 1, 0.0F, false));
		gun43.cubeList.add(new ModelBox(gun43, 3, 57, -0.4F, 4.701F, 11.499F, 2, 1, 1, 0.0F, false));
		gun43.cubeList.add(new ModelBox(gun43, 0, 54, -0.4F, 4.701F, 7.999F, 2, 1, 4, 0.0F, false));
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