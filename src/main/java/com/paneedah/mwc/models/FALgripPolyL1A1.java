package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FALgripPolyL1A1 extends ModelBase {
	private final ModelRenderer gripL1A1;
	private final ModelRenderer grip9;
	private final ModelRenderer grip5;
	private final ModelRenderer grip4;
	private final ModelRenderer grip6;
	private final ModelRenderer grip3;
	private final ModelRenderer grip2;
	private final ModelRenderer grip1;
	private final ModelRenderer grip7;
	private final ModelRenderer grip14;
	private final ModelRenderer grip15;
	private final ModelRenderer grip16;
	private final ModelRenderer grip17;
	private final ModelRenderer grip18;
	private final ModelRenderer grip20;

	public FALgripPolyL1A1() {
		textureWidth = 576;
		textureHeight = 576;

		gripL1A1 = new ModelRenderer(this);
		gripL1A1.setRotationPoint(0.2F, 24.0F, 6.0F);
		gripL1A1.cubeList.add(new ModelBox(gripL1A1, 106, 492, -3.401F, -31.4824F, -11.3622F, 2, 4, 6, 0.0F, false));
		gripL1A1.cubeList.add(new ModelBox(gripL1A1, 106, 502, -2.001F, -31.4824F, -11.3622F, 2, 4, 6, 0.0F, false));

		grip9 = new ModelRenderer(this);
		grip9.setRotationPoint(0.1F, 0.0F, 0.0F);
		gripL1A1.addChild(grip9);
		setRotationAngle(grip9, 0.1309F, 0.0F, 0.0F);
		

		grip5 = new ModelRenderer(this);
		grip5.setRotationPoint(-3.5F, -35.9421F, -2.6803F);
		grip9.addChild(grip5);
		setRotationAngle(grip5, -0.48F, 0.0F, 0.0F);
		grip5.cubeList.add(new ModelBox(grip5, 554, 448, 0.001F, 2.0275F, 2.9832F, 3, 3, 2, 0.0F, false));

		grip4 = new ModelRenderer(this);
		grip4.setRotationPoint(-3.5F, -24.2F, 1.5F);
		grip9.addChild(grip4);
		setRotationAngle(grip4, -2.6769F, 0.0F, 0.0F);
		grip4.cubeList.add(new ModelBox(grip4, 210, 284, 0.0F, -4.5126F, -0.015F, 3, 10, 2, 0.0F, false));

		grip6 = new ModelRenderer(this);
		grip6.setRotationPoint(-3.5F, -24.1417F, -3.803F);
		grip9.addChild(grip6);
		setRotationAngle(grip6, -2.8078F, 0.0F, 0.0F);
		grip6.cubeList.add(new ModelBox(grip6, 88, 515, -0.001F, -4.4909F, -4.0201F, 3, 10, 6, 0.0F, false));

		grip3 = new ModelRenderer(this);
		grip3.setRotationPoint(-1.5F, -30.9726F, 7.7963F);
		grip9.addChild(grip3);
		setRotationAngle(grip3, -2.5165F, 0.0F, 0.0F);
		grip3.cubeList.add(new ModelBox(grip3, 328, 385, -2.0F, 3.7874F, 3.0476F, 3, 5, 4, 0.0F, false));

		grip2 = new ModelRenderer(this);
		grip2.setRotationPoint(-3.5F, -27.5F, -5.5F);
		grip9.addChild(grip2);
		setRotationAngle(grip2, 0.2603F, 0.0F, 0.0F);
		grip2.cubeList.add(new ModelBox(grip2, 322, 162, 0.0F, 7.8417F, -0.9083F, 3, 2, 6, 0.0F, false));

		grip1 = new ModelRenderer(this);
		grip1.setRotationPoint(-3.5F, -31.5F, -7.0F);
		grip9.addChild(grip1);
		grip1.cubeList.add(new ModelBox(grip1, 256, 377, -0.002F, 0.0522F, 5.3965F, 3, 4, 1, 0.0F, false));

		grip7 = new ModelRenderer(this);
		grip7.setRotationPoint(0.2F, 0.0F, 0.0F);
		gripL1A1.addChild(grip7);
		setRotationAngle(grip7, 0.1309F, 0.0F, 0.0F);
		

		grip14 = new ModelRenderer(this);
		grip14.setRotationPoint(-3.5F, -35.9421F, -2.6803F);
		grip7.addChild(grip14);
		setRotationAngle(grip14, -0.48F, 0.0F, 0.0F);
		grip14.cubeList.add(new ModelBox(grip14, 314, 466, 2.299F, 2.0275F, 2.9832F, 1, 3, 2, 0.0F, false));

		grip15 = new ModelRenderer(this);
		grip15.setRotationPoint(-3.5F, -24.2F, 1.5F);
		grip7.addChild(grip15);
		setRotationAngle(grip15, -2.6769F, 0.0F, 0.0F);
		grip15.cubeList.add(new ModelBox(grip15, 68, 269, 2.3F, -4.5126F, -0.015F, 1, 10, 2, 0.0F, false));

		grip16 = new ModelRenderer(this);
		grip16.setRotationPoint(-3.5F, -24.1417F, -3.803F);
		grip7.addChild(grip16);
		setRotationAngle(grip16, -2.8078F, 0.0F, 0.0F);
		grip16.cubeList.add(new ModelBox(grip16, 282, 170, 2.301F, -4.4909F, -4.0201F, 1, 10, 6, 0.0F, false));

		grip17 = new ModelRenderer(this);
		grip17.setRotationPoint(-1.5F, -30.9726F, 7.7963F);
		grip7.addChild(grip17);
		setRotationAngle(grip17, -2.5165F, 0.0F, 0.0F);
		grip17.cubeList.add(new ModelBox(grip17, 244, 471, 0.3F, 3.7874F, 3.0476F, 1, 5, 4, 0.0F, false));

		grip18 = new ModelRenderer(this);
		grip18.setRotationPoint(-3.5F, -27.5F, -5.5F);
		grip7.addChild(grip18);
		setRotationAngle(grip18, 0.2603F, 0.0F, 0.0F);
		grip18.cubeList.add(new ModelBox(grip18, 542, 219, 2.3F, 7.8417F, -0.9083F, 1, 2, 6, 0.0F, false));

		grip20 = new ModelRenderer(this);
		grip20.setRotationPoint(-3.5F, -31.5F, -7.0F);
		grip7.addChild(grip20);
		grip20.cubeList.add(new ModelBox(grip20, 240, 509, 2.302F, 0.1305F, 5.3914F, 1, 4, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gripL1A1.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}