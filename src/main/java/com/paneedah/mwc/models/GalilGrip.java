package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class GalilGrip extends ModelBase {
	private final ModelRenderer grip;
	private final ModelRenderer gun11;
	private final ModelRenderer gun10;
	private final ModelRenderer gun9;
	private final ModelRenderer gun8;
	private final ModelRenderer gun6;
	private final ModelRenderer gun6_r1;
	private final ModelRenderer gun5;
	private final ModelRenderer gun5_r1;
	private final ModelRenderer gun4;
	private final ModelRenderer gun4_r1;
	private final ModelRenderer gun3;
	private final ModelRenderer gun2;
	private final ModelRenderer gun2_r1;
	private final ModelRenderer gun1;

	public GalilGrip() {
		textureWidth = 200;
		textureHeight = 200;

		grip = new ModelRenderer(this);
		grip.setRotationPoint(0.0F, 24.0F, -1.0F);
		

		gun11 = new ModelRenderer(this);
		gun11.setRotationPoint(-3.5F, -29.2F, 0.67F);
		grip.addChild(gun11);
		setRotationAngle(gun11, -2.1564F, 0.0F, 0.0F);
		gun11.cubeList.add(new ModelBox(gun11, 69, 0, -0.002F, 0.0F, 0.0F, 4, 1, 2, 0.0F, false));

		gun10 = new ModelRenderer(this);
		gun10.setRotationPoint(-3.5F, -30.0F, -0.4F);
		grip.addChild(gun10);
		gun10.cubeList.add(new ModelBox(gun10, 79, 67, 0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

		gun9 = new ModelRenderer(this);
		gun9.setRotationPoint(-3.5F, -26.5F, -7.0F);
		grip.addChild(gun9);
		setRotationAngle(gun9, 1.2269F, 0.0F, 0.0F);
		gun9.cubeList.add(new ModelBox(gun9, 79, 45, -0.001F, 0.0F, 0.0F, 4, 2, 1, 0.0F, false));

		gun8 = new ModelRenderer(this);
		gun8.setRotationPoint(-3.5F, -30.5F, -7.0F);
		grip.addChild(gun8);
		gun8.cubeList.add(new ModelBox(gun8, 17, 54, 0.001F, 0.0F, -0.001F, 4, 4, 7, 0.0F, false));

		gun6 = new ModelRenderer(this);
		gun6.setRotationPoint(-3.5F, -15.5F, 3.0F);
		grip.addChild(gun6);
		setRotationAngle(gun6, 2.491F, 0.0F, 0.0F);
		

		gun6_r1 = new ModelRenderer(this);
		gun6_r1.setRotationPoint(2.001F, 2.051F, -0.2805F);
		gun6.addChild(gun6_r1);
		setRotationAngle(gun6_r1, -0.7854F, 0.0F, 0.0F);
		gun6_r1.cubeList.add(new ModelBox(gun6_r1, 27, 0, -2.0F, -3.5272F, -0.3214F, 4, 3, 2, 0.0F, false));

		gun5 = new ModelRenderer(this);
		gun5.setRotationPoint(-3.5F, -28.5F, -1.5F);
		grip.addChild(gun5);
		setRotationAngle(gun5, 0.481F, 0.0F, 0.0F);
		

		gun5_r1 = new ModelRenderer(this);
		gun5_r1.setRotationPoint(2.0005F, 8.2558F, -2.2152F);
		gun5.addChild(gun5_r1);
		setRotationAngle(gun5_r1, -0.1745F, 0.0F, 0.0F);
		gun5_r1.cubeList.add(new ModelBox(gun5_r1, 0, 40, -2.0005F, -8.5575F, 1.2618F, 4, 12, 1, 0.0F, false));

		gun4 = new ModelRenderer(this);
		gun4.setRotationPoint(-3.5F, -17.5F, -1.0F);
		grip.addChild(gun4);
		

		gun4_r1 = new ModelRenderer(this);
		gun4_r1.setRotationPoint(2.0005F, -2.6561F, -0.1442F);
		gun4.addChild(gun4_r1);
		setRotationAngle(gun4_r1, 0.1309F, 0.0F, 0.0F);
		gun4_r1.cubeList.add(new ModelBox(gun4_r1, 47, 28, -1.9995F, 2.234F, -2.3812F, 4, 2, 4, 0.0F, false));

		gun3 = new ModelRenderer(this);
		gun3.setRotationPoint(-3.5F, -30.0F, 2.0F);
		grip.addChild(gun3);
		setRotationAngle(gun3, -2.5281F, 0.0F, 0.0F);
		gun3.cubeList.add(new ModelBox(gun3, 47, 35, -0.001F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

		gun2 = new ModelRenderer(this);
		gun2.setRotationPoint(-3.5F, -26.5F, -6.0F);
		grip.addChild(gun2);
		setRotationAngle(gun2, 0.481F, 0.0F, 0.0F);
		

		gun2_r1 = new ModelRenderer(this);
		gun2_r1.setRotationPoint(2.0005F, 8.5647F, 2.6995F);
		gun2.addChild(gun2_r1);
		setRotationAngle(gun2_r1, -0.1745F, 0.0F, 0.0F);
		gun2_r1.cubeList.add(new ModelBox(gun2_r1, 0, 0, -2.0005F, -8.8664F, -3.6529F, 4, 12, 5, 0.0F, false));

		gun1 = new ModelRenderer(this);
		gun1.setRotationPoint(-3.5F, -31.0F, -7.0F);
		grip.addChild(gun1);
		gun1.cubeList.add(new ModelBox(gun1, 113, 16, 0.0F, 0.0F, 0.0F, 4, 1, 9, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		grip.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}