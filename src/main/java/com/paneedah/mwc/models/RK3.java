package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class RK3 extends ModelBase {
	private final ModelRenderer rk3;
	private final ModelRenderer gun2;
	private final ModelRenderer gun3;
	private final ModelRenderer gun4;
	private final ModelRenderer gun40_r1;
	private final ModelRenderer gun5;
	private final ModelRenderer gun32;
	private final ModelRenderer gun31;
	private final ModelRenderer gun11;
	private final ModelRenderer gun10;
	private final ModelRenderer gun9;
	private final ModelRenderer gun8;
	private final ModelRenderer gun6;
	private final ModelRenderer gun7;
	private final ModelRenderer gun33;
	private final ModelRenderer gun34;
	private final ModelRenderer gun35;
	private final ModelRenderer gun1;

	public RK3() {
		textureWidth = 200;
		textureHeight = 200;

		rk3 = new ModelRenderer(this);
		rk3.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		gun2 = new ModelRenderer(this);
		gun2.setRotationPoint(-3.5F, -21.0F, -2.2F);
		rk3.addChild(gun2);
		setRotationAngle(gun2, -0.4856F, 0.0F, 0.0F);
		gun2.cubeList.add(new ModelBox(gun2, 44, 4, 0.0F, 0.0F, 0.0F, 4, 2, 2, 0.0F, false));

		gun3 = new ModelRenderer(this);
		gun3.setRotationPoint(-3.5F, -25.0F, -4.3F);
		rk3.addChild(gun3);
		setRotationAngle(gun3, -0.4856F, 0.0F, 0.0F);
		gun3.cubeList.add(new ModelBox(gun3, 45, 5, 0.0F, 0.0F, 0.0F, 4, 2, 2, 0.0F, false));

		gun4 = new ModelRenderer(this);
		gun4.setRotationPoint(-3.5F, -24.2F, 1.5F);
		rk3.addChild(gun4);
		setRotationAngle(gun4, 0.4067F, 0.0F, 0.0F);
		

		gun40_r1 = new ModelRenderer(this);
		gun40_r1.setRotationPoint(4.0F, 0.0F, 1.0F);
		gun4.addChild(gun40_r1);
		setRotationAngle(gun40_r1, -0.0524F, 0.0F, 0.0F);
		gun40_r1.cubeList.add(new ModelBox(gun40_r1, 43, 2, -4.0F, 0.0F, -2.0F, 4, 7, 2, 0.0F, false));

		gun5 = new ModelRenderer(this);
		gun5.setRotationPoint(-3.5F, -27.7F, -1.5F);
		rk3.addChild(gun5);
		setRotationAngle(gun5, 0.7041F, 0.0F, 0.0F);
		gun5.cubeList.add(new ModelBox(gun5, 43, 4, 0.001F, 1.0F, -1.0F, 4, 4, 2, 0.0F, false));

		gun32 = new ModelRenderer(this);
		gun32.setRotationPoint(-0.4F, -27.5F, -5.9F);
		rk3.addChild(gun32);
		setRotationAngle(gun32, 0.481F, 0.0F, 0.0F);
		

		gun31 = new ModelRenderer(this);
		gun31.setRotationPoint(-3.6F, -27.5F, -5.9F);
		rk3.addChild(gun31);
		setRotationAngle(gun31, 0.481F, 0.0F, 0.0F);
		

		gun11 = new ModelRenderer(this);
		gun11.setRotationPoint(-3.5F, -29.2F, 0.67F);
		rk3.addChild(gun11);
		setRotationAngle(gun11, -2.1564F, 0.0F, 0.0F);
		gun11.cubeList.add(new ModelBox(gun11, 43, 4, 0.001F, -1.6668F, -1.1054F, 4, 1, 2, 0.0F, false));

		gun10 = new ModelRenderer(this);
		gun10.setRotationPoint(-3.5F, -30.0F, -0.4F);
		rk3.addChild(gun10);
		gun10.cubeList.add(new ModelBox(gun10, 95, 64, 0.002F, 0.0F, 2.0F, 4, 1, 1, 0.0F, false));

		gun9 = new ModelRenderer(this);
		gun9.setRotationPoint(-3.5F, -26.5F, -7.0F);
		rk3.addChild(gun9);
		setRotationAngle(gun9, 1.2269F, 0.0F, 0.0F);
		gun9.cubeList.add(new ModelBox(gun9, 44, 6, 0.001F, 0.0F, 0.0F, 4, 2, 1, 0.0F, false));

		gun8 = new ModelRenderer(this);
		gun8.setRotationPoint(-3.5F, -30.5F, -7.0F);
		rk3.addChild(gun8);
		gun8.cubeList.add(new ModelBox(gun8, 70, 172, 0.0F, 0.0F, 0.0F, 4, 4, 7, 0.0F, false));

		gun6 = new ModelRenderer(this);
		gun6.setRotationPoint(-3.5F, -15.5F, 3.0F);
		rk3.addChild(gun6);
		setRotationAngle(gun6, 2.491F, 0.0F, 0.0F);
		gun6.cubeList.add(new ModelBox(gun6, 42, 5, 0.001F, 0.0F, 0.0F, 4, 3, 2, 0.0F, false));

		gun7 = new ModelRenderer(this);
		gun7.setRotationPoint(-3.5F, -28.5F, -1.5F);
		rk3.addChild(gun7);
		setRotationAngle(gun7, 0.481F, 0.0F, 0.0F);
		gun7.cubeList.add(new ModelBox(gun7, 46, 5, -0.001F, 1.0F, 0.0F, 4, 3, 1, 0.0F, false));

		gun33 = new ModelRenderer(this);
		gun33.setRotationPoint(-3.5F, -17.5F, -1.0F);
		rk3.addChild(gun33);
		gun33.cubeList.add(new ModelBox(gun33, 40, 3, 0.0F, 0.0F, 0.0F, 4, 2, 4, 0.0F, false));

		gun34 = new ModelRenderer(this);
		gun34.setRotationPoint(-3.5F, -30.0F, -1.0F);
		rk3.addChild(gun34);
		setRotationAngle(gun34, -2.5281F, 0.0F, 0.0F);
		

		gun35 = new ModelRenderer(this);
		gun35.setRotationPoint(-3.5F, -26.5F, -6.0F);
		rk3.addChild(gun35);
		setRotationAngle(gun35, 0.481F, 0.0F, 0.0F);
		gun35.cubeList.add(new ModelBox(gun35, 99, 171, 0.002F, 0.0F, 0.0F, 4, 12, 5, 0.0F, false));

		gun1 = new ModelRenderer(this);
		gun1.setRotationPoint(-3.5F, -31.0F, -7.0F);
		rk3.addChild(gun1);
		gun1.cubeList.add(new ModelBox(gun1, 36, 3, 0.001F, 0.0F, -0.001F, 4, 1, 7, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		rk3.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}