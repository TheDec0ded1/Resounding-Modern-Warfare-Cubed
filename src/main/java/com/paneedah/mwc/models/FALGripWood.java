package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FALGripWood extends ModelBase {
	private final ModelRenderer grip;
	private final ModelRenderer grip9;
	private final ModelRenderer grip11;
	private final ModelRenderer grip8;
	private final ModelRenderer grip5;
	private final ModelRenderer grip4;
	private final ModelRenderer grip6;
	private final ModelRenderer grip3;
	private final ModelRenderer grip2;
	private final ModelRenderer grip12;
	private final ModelRenderer grip1;
	private final ModelRenderer grip7;
	private final ModelRenderer grip10;
	private final ModelRenderer grip13;
	private final ModelRenderer grip14;
	private final ModelRenderer grip15;
	private final ModelRenderer grip16;
	private final ModelRenderer grip17;
	private final ModelRenderer grip18;
	private final ModelRenderer grip19;
	private final ModelRenderer grip20;

	public FALGripWood() {
		textureWidth = 400;
		textureHeight = 400;

		grip = new ModelRenderer(this);
		grip.setRotationPoint(0.2F, 24.0F, 0.0F);
		

		grip9 = new ModelRenderer(this);
		grip9.setRotationPoint(0.1F, 0.0F, 0.0F);
		grip.addChild(grip9);
		setRotationAngle(grip9, 0.1309F, 0.0F, 0.0F);
		

		grip11 = new ModelRenderer(this);
		grip11.setRotationPoint(-3.5F, -27.5F, -5.5F);
		grip9.addChild(grip11);
		setRotationAngle(grip11, 0.2603F, 0.0F, 0.0F);
		grip11.cubeList.add(new ModelBox(grip11, 8, 94, 0.0F, 9.0F, -1.0F, 3, 1, 1, 0.0F, false));

		grip8 = new ModelRenderer(this);
		grip8.setRotationPoint(-3.5F, -27.5F, -7.0F);
		grip9.addChild(grip8);
		setRotationAngle(grip8, 1.041F, 0.0F, 0.0F);
		

		grip5 = new ModelRenderer(this);
		grip5.setRotationPoint(-3.5F, -35.9421F, -2.6803F);
		grip9.addChild(grip5);
		setRotationAngle(grip5, -0.48F, 0.0F, 0.0F);
		grip5.cubeList.add(new ModelBox(grip5, 87, 22, 0.001F, 2.8223F, 2.547F, 3, 2, 3, 0.0F, false));

		grip4 = new ModelRenderer(this);
		grip4.setRotationPoint(-3.5F, -24.2F, 1.5F);
		grip9.addChild(grip4);
		setRotationAngle(grip4, -2.6769F, 0.0F, 0.0F);
		grip4.cubeList.add(new ModelBox(grip4, 323, 179, 0.0F, -4.8492F, -0.5117F, 3, 10, 2, 0.0F, false));

		grip6 = new ModelRenderer(this);
		grip6.setRotationPoint(-3.5F, -24.1417F, -3.803F);
		grip9.addChild(grip6);
		setRotationAngle(grip6, -2.8078F, 0.0F, 0.0F);
		grip6.cubeList.add(new ModelBox(grip6, 321, 175, -0.001F, -4.8492F, -4.5117F, 3, 16, 6, 0.0F, false));

		grip3 = new ModelRenderer(this);
		grip3.setRotationPoint(-1.5F, -30.9726F, 7.7963F);
		grip9.addChild(grip3);
		setRotationAngle(grip3, -2.5165F, 0.0F, 0.0F);
		grip3.cubeList.add(new ModelBox(grip3, 6, 89, -2.0F, 3.7874F, 3.0476F, 3, 5, 4, 0.0F, false));

		grip2 = new ModelRenderer(this);
		grip2.setRotationPoint(-3.5F, -27.5F, -5.5F);
		grip9.addChild(grip2);
		setRotationAngle(grip2, 0.2603F, 0.0F, 0.0F);
		grip2.cubeList.add(new ModelBox(grip2, 97, 102, 0.0F, 8.0F, 0.0F, 3, 2, 6, 0.0F, false));

		grip12 = new ModelRenderer(this);
		grip12.setRotationPoint(-3.5F, -18.5F, -4.2F);
		grip9.addChild(grip12);
		setRotationAngle(grip12, 0.9295F, 0.0F, 0.0F);
		grip12.cubeList.add(new ModelBox(grip12, 5, 94, 0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F, false));

		grip1 = new ModelRenderer(this);
		grip1.setRotationPoint(-3.5F, -31.5F, -7.0F);
		grip9.addChild(grip1);
		grip1.cubeList.add(new ModelBox(grip1, 4, 92, -0.002F, 0.1305F, 5.9914F, 3, 4, 1, 0.0F, false));

		grip7 = new ModelRenderer(this);
		grip7.setRotationPoint(0.2F, 0.0F, 0.0F);
		grip.addChild(grip7);
		setRotationAngle(grip7, 0.1309F, 0.0F, 0.0F);
		

		grip10 = new ModelRenderer(this);
		grip10.setRotationPoint(-3.5F, -27.5F, -5.5F);
		grip7.addChild(grip10);
		setRotationAngle(grip10, 0.2603F, 0.0F, 0.0F);
		grip10.cubeList.add(new ModelBox(grip10, 67, 106, 2.3F, 9.0F, -1.0F, 1, 1, 1, 0.0F, false));

		grip13 = new ModelRenderer(this);
		grip13.setRotationPoint(-3.5F, -27.5F, -7.0F);
		grip7.addChild(grip13);
		setRotationAngle(grip13, 1.041F, 0.0F, 0.0F);
		

		grip14 = new ModelRenderer(this);
		grip14.setRotationPoint(-3.5F, -35.9421F, -2.6803F);
		grip7.addChild(grip14);
		setRotationAngle(grip14, -0.48F, 0.0F, 0.0F);
		grip14.cubeList.add(new ModelBox(grip14, 93, 21, 2.299F, 2.8223F, 2.547F, 1, 2, 3, 0.0F, false));

		grip15 = new ModelRenderer(this);
		grip15.setRotationPoint(-3.5F, -24.2F, 1.5F);
		grip7.addChild(grip15);
		setRotationAngle(grip15, -2.6769F, 0.0F, 0.0F);
		grip15.cubeList.add(new ModelBox(grip15, 322, 183, 2.3F, -4.8492F, -0.5117F, 1, 10, 2, 0.0F, false));

		grip16 = new ModelRenderer(this);
		grip16.setRotationPoint(-3.5F, -24.1417F, -3.803F);
		grip7.addChild(grip16);
		setRotationAngle(grip16, -2.8078F, 0.0F, 0.0F);
		grip16.cubeList.add(new ModelBox(grip16, 289, 350, 2.301F, -4.8492F, -4.5117F, 1, 16, 6, 0.0F, false));

		grip17 = new ModelRenderer(this);
		grip17.setRotationPoint(-1.5F, -30.9726F, 7.7963F);
		grip7.addChild(grip17);
		setRotationAngle(grip17, -2.5165F, 0.0F, 0.0F);
		grip17.cubeList.add(new ModelBox(grip17, 5, 88, 0.3F, 3.7874F, 3.0476F, 1, 5, 4, 0.0F, false));

		grip18 = new ModelRenderer(this);
		grip18.setRotationPoint(-3.5F, -27.5F, -5.5F);
		grip7.addChild(grip18);
		setRotationAngle(grip18, 0.2603F, 0.0F, 0.0F);
		grip18.cubeList.add(new ModelBox(grip18, 100, 102, 2.3F, 8.0F, 0.0F, 1, 2, 6, 0.0F, false));

		grip19 = new ModelRenderer(this);
		grip19.setRotationPoint(-3.5F, -18.5F, -4.2F);
		grip7.addChild(grip19);
		setRotationAngle(grip19, 0.9295F, 0.0F, 0.0F);
		grip19.cubeList.add(new ModelBox(grip19, 104, 106, 2.3F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		grip20 = new ModelRenderer(this);
		grip20.setRotationPoint(-3.5F, -31.5F, -7.0F);
		grip7.addChild(grip20);
		grip20.cubeList.add(new ModelBox(grip20, 123, 234, 2.302F, 0.1305F, 5.9914F, 1, 4, 1, 0.0F, false));
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