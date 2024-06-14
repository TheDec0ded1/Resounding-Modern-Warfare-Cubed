package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SVUStock extends ModelBase {
	private final ModelRenderer stock;
	private final ModelRenderer grip5_r1;
	private final ModelRenderer grip4_r1;
	private final ModelRenderer grip5_r2;
	private final ModelRenderer grip9_r5;
	private final ModelRenderer grip8_r2;
	private final ModelRenderer grip9_r6;
	private final ModelRenderer grip3_r1;
	private final ModelRenderer grip3_r3_r1;
	private final ModelRenderer grip3_r2_r1;
	private final ModelRenderer grip2_r1;
	private final ModelRenderer grip5_r5_r1;
	private final ModelRenderer grip4_r4_r1;
	private final ModelRenderer grip3_r3_r2;

	public SVUStock() {
		textureWidth = 256;
		textureHeight = 256;

		stock = new ModelRenderer(this);
		stock.setRotationPoint(-1.5F, -3.5F, 45.2F);
		setRotationAngle(stock, -0.1309F, 0.0F, 0.0F);
		stock.cubeList.add(new ModelBox(stock, 20, 0, -2.0F, -1.0F, -2.5F, 4, 2, 5, 0.001F, false));

		grip5_r1 = new ModelRenderer(this);
		grip5_r1.setRotationPoint(1.3F, -1.25F, -48.7F);
		stock.addChild(grip5_r1);
		setRotationAngle(grip5_r1, 0.2443F, 0.0F, 0.0F);
		grip5_r1.cubeList.add(new ModelBox(grip5_r1, 40, 0, 0.0F, 10.7926F, 47.0613F, 1, 3, 6, 0.0F, false));
		grip5_r1.cubeList.add(new ModelBox(grip5_r1, 0, 40, -3.6F, 10.7926F, 47.0613F, 1, 3, 6, 0.0F, false));

		grip4_r1 = new ModelRenderer(this);
		grip4_r1.setRotationPoint(1.3F, -1.75F, -51.5F);
		stock.addChild(grip4_r1);
		setRotationAngle(grip4_r1, -0.1745F, 0.0F, 0.0F);
		grip4_r1.cubeList.add(new ModelBox(grip4_r1, 29, 26, 0.0F, -9.5375F, 48.6031F, 1, 3, 3, 0.001F, false));
		grip4_r1.cubeList.add(new ModelBox(grip4_r1, 10, 0, -3.6F, -9.5375F, 48.6031F, 1, 3, 3, 0.001F, false));

		grip5_r2 = new ModelRenderer(this);
		grip5_r2.setRotationPoint(1.3F, -3.75F, -50.9F);
		stock.addChild(grip5_r2);
		setRotationAngle(grip5_r2, 0.0698F, 0.0F, 0.0F);
		grip5_r2.cubeList.add(new ModelBox(grip5_r2, 0, 49, 0.0F, 4.4126F, 48.7412F, 1, 1, 6, 0.002F, false));
		grip5_r2.cubeList.add(new ModelBox(grip5_r2, 19, 46, -3.6F, 4.4126F, 48.7412F, 1, 1, 6, 0.002F, false));

		grip9_r5 = new ModelRenderer(this);
		grip9_r5.setRotationPoint(1.5F, -10.6F, -33.4F);
		stock.addChild(grip9_r5);
		setRotationAngle(grip9_r5, -0.0454F, -0.0262F, -0.523F);
		

		grip8_r2 = new ModelRenderer(this);
		grip8_r2.setRotationPoint(-1.5F, -10.6F, -33.4F);
		stock.addChild(grip8_r2);
		setRotationAngle(grip8_r2, -0.0454F, 0.0262F, 0.523F);
		

		grip9_r6 = new ModelRenderer(this);
		grip9_r6.setRotationPoint(-1.5F, -10.6F, -33.4F);
		stock.addChild(grip9_r6);
		setRotationAngle(grip9_r6, -0.0524F, 0.0F, 0.0F);
		

		grip3_r1 = new ModelRenderer(this);
		grip3_r1.setRotationPoint(2.0F, 2.0F, -48.0F);
		stock.addChild(grip3_r1);
		setRotationAngle(grip3_r1, -0.4363F, 0.0F, 0.0F);
		grip3_r1.cubeList.add(new ModelBox(grip3_r1, 20, 14, -3.998F, -21.1318F, 40.8136F, 4, 1, 3, -0.001F, false));

		grip3_r3_r1 = new ModelRenderer(this);
		grip3_r3_r1.setRotationPoint(-1.998F, -20.6149F, 45.1378F);
		grip3_r1.addChild(grip3_r3_r1);
		setRotationAngle(grip3_r3_r1, -0.5672F, 0.0F, 0.0F);
		grip3_r3_r1.cubeList.add(new ModelBox(grip3_r3_r1, 20, 14, -2.0F, -0.5F, 1.5F, 4, 1, 3, -0.001F, false));

		grip3_r2_r1 = new ModelRenderer(this);
		grip3_r2_r1.setRotationPoint(-1.998F, -20.2041F, 45.0921F);
		grip3_r1.addChild(grip3_r2_r1);
		setRotationAngle(grip3_r2_r1, -0.3054F, 0.0F, 0.0F);
		grip3_r2_r1.cubeList.add(new ModelBox(grip3_r2_r1, 20, 14, -2.0F, -0.5F, -1.5F, 4, 1, 3, -0.001F, false));

		grip2_r1 = new ModelRenderer(this);
		grip2_r1.setRotationPoint(2.0F, 2.0F, -48.0F);
		stock.addChild(grip2_r1);
		setRotationAngle(grip2_r1, 0.1222F, 0.0F, 0.0F);
		grip2_r1.cubeList.add(new ModelBox(grip2_r1, 0, 19, -4.0F, 2.758F, 50.8908F, 4, 8, 3, 0.0F, false));
		grip2_r1.cubeList.add(new ModelBox(grip2_r1, 80, 16, 0.0F, -3.742F, 30.3908F, 1, 2, 12, 0.0F, false));
		grip2_r1.cubeList.add(new ModelBox(grip2_r1, 80, 16, 0.0F, -5.742F, 30.3908F, 1, 2, 12, 0.0F, false));
		grip2_r1.cubeList.add(new ModelBox(grip2_r1, 20, 7, 0.0F, -5.742F, 29.1908F, 1, 2, 2, 0.0F, false));
		grip2_r1.cubeList.add(new ModelBox(grip2_r1, 32, 10, 0.0F, -5.742F, 27.3908F, 1, 1, 2, 0.0F, false));
		grip2_r1.cubeList.add(new ModelBox(grip2_r1, 20, 7, 0.0F, -3.742F, 42.3908F, 1, 2, 2, 0.0F, false));
		grip2_r1.cubeList.add(new ModelBox(grip2_r1, 20, 7, 0.0F, -5.742F, 42.3908F, 1, 2, 2, 0.0F, false));
		grip2_r1.cubeList.add(new ModelBox(grip2_r1, 80, 41, -4.0F, 2.758F, 49.8908F, 4, 6, 1, 0.0F, false));
		grip2_r1.cubeList.add(new ModelBox(grip2_r1, 27, 46, -4.0F, 2.258F, 48.8908F, 4, 5, 1, 0.0F, false));
		grip2_r1.cubeList.add(new ModelBox(grip2_r1, 27, 46, -4.0F, 1.258F, 47.8908F, 4, 5, 1, 0.0F, false));
		grip2_r1.cubeList.add(new ModelBox(grip2_r1, 27, 46, -4.0F, 0.258F, 46.8908F, 4, 5, 1, 0.0F, false));
		grip2_r1.cubeList.add(new ModelBox(grip2_r1, 28, 34, -4.0F, 9.758F, 50.6908F, 4, 1, 1, 0.0F, false));

		grip5_r5_r1 = new ModelRenderer(this);
		grip5_r5_r1.setRotationPoint(2.5495F, -2.4835F, 38.3908F);
		grip2_r1.addChild(grip5_r5_r1);
		setRotationAngle(grip5_r5_r1, 0.0F, 0.0F, -1.2392F);
		grip5_r5_r1.cubeList.add(new ModelBox(grip5_r5_r1, 11, 9, 2.5F, -6.3F, 4.0F, 1, 2, 2, 0.0F, false));
		grip5_r5_r1.cubeList.add(new ModelBox(grip5_r5_r1, 136, 0, 2.5F, -6.3F, -11.0F, 1, 2, 15, 0.0F, false));

		grip4_r4_r1 = new ModelRenderer(this);
		grip4_r4_r1.setRotationPoint(2.2205F, -3.7295F, 38.3908F);
		grip2_r1.addChild(grip4_r4_r1);
		setRotationAngle(grip4_r4_r1, 0.0F, 0.0F, -0.7592F);
		grip4_r4_r1.cubeList.add(new ModelBox(grip4_r4_r1, 11, 9, -0.5F, -4.3F, 4.0F, 1, 2, 2, 0.0F, false));
		grip4_r4_r1.cubeList.add(new ModelBox(grip4_r4_r1, 136, 0, -0.5F, -4.3F, -11.0F, 1, 2, 15, 0.0F, false));

		grip3_r3_r2 = new ModelRenderer(this);
		grip3_r3_r2.setRotationPoint(0.5F, -6.6918F, 26.8553F);
		grip2_r1.addChild(grip3_r3_r2);
		setRotationAngle(grip3_r3_r2, -0.7854F, 0.0F, 0.0F);
		grip3_r3_r2.cubeList.add(new ModelBox(grip3_r3_r2, 27, 60, -0.5F, -1.0F, 2.0F, 1, 2, 4, 0.0F, false));
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