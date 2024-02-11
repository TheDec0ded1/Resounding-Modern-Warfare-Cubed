package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AKSUStock extends ModelBase {
	private final ModelRenderer stock;
	private final ModelRenderer gun366;
	private final ModelRenderer gun366_r1;
	private final ModelRenderer gun366_r1_r1;
	private final ModelRenderer gun349;
	private final ModelRenderer gun348;
	private final ModelRenderer gun2;
	private final ModelRenderer gun245_r1;
	private final ModelRenderer gun3;
	private final ModelRenderer gun244_r1;
	private final ModelRenderer gun4;
	private final ModelRenderer gun243_r1;
	private final ModelRenderer gun5;
	private final ModelRenderer gun242_r1;
	private final ModelRenderer gun6;
	private final ModelRenderer gun241_r1;
	private final ModelRenderer gun7;
	private final ModelRenderer gun237_r1;
	private final ModelRenderer gun8;

	public AKSUStock() {
		textureWidth = 512;
		textureHeight = 256;

		stock = new ModelRenderer(this);
		stock.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		gun366 = new ModelRenderer(this);
		gun366.setRotationPoint(-3.5F, -31.6F, 12.5F);
		stock.addChild(gun366);
		setRotationAngle(gun366, -0.3346F, 0.0F, 0.0F);
		

		gun366_r1 = new ModelRenderer(this);
		gun366_r1.setRotationPoint(3.503F, 30.1958F, -13.6951F);
		gun366.addChild(gun366_r1);
		setRotationAngle(gun366_r1, -0.0436F, 0.0F, 0.0F);
		

		gun366_r1_r1 = new ModelRenderer(this);
		gun366_r1_r1.setRotationPoint(-1.003F, -31.8419F, 24.22F);
		gun366_r1.addChild(gun366_r1_r1);
		setRotationAngle(gun366_r1_r1, 0.0873F, 0.0F, 0.0F);
		gun366_r1_r1.cubeList.add(new ModelBox(gun366_r1_r1, 116, 0, -1.999F, 1.416F, -18.9123F, 3, 2, 25, 0.0F, false));

		gun349 = new ModelRenderer(this);
		gun349.setRotationPoint(-0.1F, -33.5F, 8.5F);
		stock.addChild(gun349);
		setRotationAngle(gun349, -0.1859F, 0.0F, 0.0F);
		gun349.cubeList.add(new ModelBox(gun349, 147, 22, -4.3F, -0.2376F, -3.6061F, 1, 3, 1, 0.0F, false));

		gun348 = new ModelRenderer(this);
		gun348.setRotationPoint(-0.4F, -32.6F, 7.5F);
		stock.addChild(gun348);
		setRotationAngle(gun348, -0.1859F, 0.0F, 0.0F);
		gun348.cubeList.add(new ModelBox(gun348, 147, 20, -3.6F, -0.2376F, -3.6061F, 1, 1, 3, 0.0F, false));

		gun2 = new ModelRenderer(this);
		gun2.setRotationPoint(-1.1F, -33.9F, 30.8F);
		stock.addChild(gun2);
		setRotationAngle(gun2, -0.0873F, 0.0F, 0.0F);
		

		gun245_r1 = new ModelRenderer(this);
		gun245_r1.setRotationPoint(0.1F, 6.2541F, -6.3647F);
		gun2.addChild(gun245_r1);
		setRotationAngle(gun245_r1, 0.0873F, 0.0F, 0.0F);
		gun245_r1.cubeList.add(new ModelBox(gun245_r1, 153, 9, -0.1F, -7.4347F, 6.2145F, 1, 3, 1, 0.0F, false));

		gun3 = new ModelRenderer(this);
		gun3.setRotationPoint(-0.6F, -32.9F, 29.7F);
		stock.addChild(gun3);
		setRotationAngle(gun3, -0.0873F, 0.0F, 0.0F);
		

		gun244_r1 = new ModelRenderer(this);
		gun244_r1.setRotationPoint(-0.4F, 5.162F, -5.356F);
		gun3.addChild(gun244_r1);
		setRotationAngle(gun244_r1, 0.0873F, 0.0F, 0.0F);
		gun244_r1.cubeList.add(new ModelBox(gun244_r1, 153, 3, 0.4F, -6.1412F, 5.1799F, 1, 11, 2, 0.0F, false));

		gun4 = new ModelRenderer(this);
		gun4.setRotationPoint(-3.4F, -32.9F, 29.7F);
		stock.addChild(gun4);
		setRotationAngle(gun4, -0.0873F, 0.0F, 0.0F);
		

		gun243_r1 = new ModelRenderer(this);
		gun243_r1.setRotationPoint(2.4F, 5.162F, -5.356F);
		gun4.addChild(gun243_r1);
		setRotationAngle(gun243_r1, 0.0873F, 0.0F, 0.0F);
		gun243_r1.cubeList.add(new ModelBox(gun243_r1, 142, 17, -2.4F, -6.1412F, 5.1792F, 3, 11, 2, 0.0F, false));

		gun5 = new ModelRenderer(this);
		gun5.setRotationPoint(-2.9F, -33.9F, 30.8F);
		stock.addChild(gun5);
		setRotationAngle(gun5, -0.0873F, 0.0F, 0.0F);
		

		gun242_r1 = new ModelRenderer(this);
		gun242_r1.setRotationPoint(1.9F, 6.2541F, -6.3647F);
		gun5.addChild(gun242_r1);
		setRotationAngle(gun242_r1, 0.0873F, 0.0F, 0.0F);
		gun242_r1.cubeList.add(new ModelBox(gun242_r1, 161, 11, -1.9F, -7.4345F, 6.2139F, 2, 3, 1, 0.0F, false));

		gun6 = new ModelRenderer(this);
		gun6.setRotationPoint(-3.5F, -23.9F, 28.6F);
		stock.addChild(gun6);
		setRotationAngle(gun6, -0.1115F, 0.0F, 0.0F);
		

		gun241_r1 = new ModelRenderer(this);
		gun241_r1.setRotationPoint(2.5F, -3.7764F, -5.1378F);
		gun6.addChild(gun241_r1);
		setRotationAngle(gun241_r1, 0.0873F, 0.0F, 0.0F);
		gun241_r1.cubeList.add(new ModelBox(gun241_r1, 136, 17, -1.999F, 2.9009F, 4.9727F, 3, 2, 1, 0.0F, false));

		gun7 = new ModelRenderer(this);
		gun7.setRotationPoint(-3.0F, -35.5F, 12.95F);
		stock.addChild(gun7);
		setRotationAngle(gun7, -0.1002F, 0.0F, 0.0F);
		

		gun237_r1 = new ModelRenderer(this);
		gun237_r1.setRotationPoint(2.0F, 6.1421F, 11.6371F);
		gun7.addChild(gun237_r1);
		setRotationAngle(gun237_r1, 0.0873F, 0.0F, 0.0F);
		gun237_r1.cubeList.add(new ModelBox(gun237_r1, 115, 8, -2.0F, -7.542F, -18.6552F, 3, 2, 25, 0.0F, false));

		gun8 = new ModelRenderer(this);
		gun8.setRotationPoint(-3.5F, -35.9F, -1.5F);
		stock.addChild(gun8);
		setRotationAngle(gun8, -1.5708F, 0.0F, 0.0F);
		gun8.cubeList.add(new ModelBox(gun8, 136, 24, 0.0F, -8.8966F, -0.109F, 4, 4, 5, 0.0F, false));
		gun8.cubeList.add(new ModelBox(gun8, 136, 24, 0.0F, -8.8966F, 0.591F, 4, 4, 5, 0.0F, false));
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