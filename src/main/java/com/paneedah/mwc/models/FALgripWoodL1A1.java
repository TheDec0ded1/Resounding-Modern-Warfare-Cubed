package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FALgripWoodL1A1 extends ModelBase {
	private final ModelRenderer gripL1A1Wood;
	private final ModelRenderer grip8;
	private final ModelRenderer grip10;
	private final ModelRenderer grip11;
	private final ModelRenderer grip12;
	private final ModelRenderer grip13;
	private final ModelRenderer grip19;
	private final ModelRenderer grip21;
	private final ModelRenderer grip22;
	private final ModelRenderer grip23;
	private final ModelRenderer grip24;
	private final ModelRenderer grip25;
	private final ModelRenderer grip26;
	private final ModelRenderer grip27;
	private final ModelRenderer grip28;

	public FALgripWoodL1A1() {
		textureWidth = 576;
		textureHeight = 576;

		gripL1A1Wood = new ModelRenderer(this);
		gripL1A1Wood.setRotationPoint(0.2F, 24.0F, 6.0F);
		gripL1A1Wood.cubeList.add(new ModelBox(gripL1A1Wood, 518, 283, -3.401F, -31.4824F, -11.3622F, 2, 4, 6, 0.0F, false));
		gripL1A1Wood.cubeList.add(new ModelBox(gripL1A1Wood, 540, 263, -2.001F, -31.4824F, -11.3622F, 2, 4, 6, 0.0F, false));

		grip8 = new ModelRenderer(this);
		grip8.setRotationPoint(0.1F, 0.0F, 0.0F);
		gripL1A1Wood.addChild(grip8);
		setRotationAngle(grip8, 0.1309F, 0.0F, 0.0F);
		

		grip10 = new ModelRenderer(this);
		grip10.setRotationPoint(-3.5F, -35.9421F, -2.6803F);
		grip8.addChild(grip10);
		setRotationAngle(grip10, -0.48F, 0.0F, 0.0F);
		grip10.cubeList.add(new ModelBox(grip10, 554, 453, 0.001F, 2.0275F, 2.9832F, 3, 3, 2, 0.0F, false));

		grip11 = new ModelRenderer(this);
		grip11.setRotationPoint(-3.5F, -24.2F, 1.5F);
		grip8.addChild(grip11);
		setRotationAngle(grip11, -2.6769F, 0.0F, 0.0F);
		grip11.cubeList.add(new ModelBox(grip11, 278, 300, 0.0F, -4.5126F, -0.015F, 3, 10, 2, 0.0F, false));

		grip12 = new ModelRenderer(this);
		grip12.setRotationPoint(-3.5F, -24.1417F, -3.803F);
		grip8.addChild(grip12);
		setRotationAngle(grip12, -2.8078F, 0.0F, 0.0F);
		grip12.cubeList.add(new ModelBox(grip12, 194, 515, -0.001F, -4.4909F, -4.0201F, 3, 10, 6, 0.0F, false));

		grip13 = new ModelRenderer(this);
		grip13.setRotationPoint(-1.5F, -30.9726F, 7.7963F);
		grip8.addChild(grip13);
		setRotationAngle(grip13, -2.5165F, 0.0F, 0.0F);
		grip13.cubeList.add(new ModelBox(grip13, 44, 504, -2.0F, 3.7874F, 3.0476F, 3, 5, 4, 0.0F, false));

		grip19 = new ModelRenderer(this);
		grip19.setRotationPoint(-3.5F, -27.5F, -5.5F);
		grip8.addChild(grip19);
		setRotationAngle(grip19, 0.2603F, 0.0F, 0.0F);
		grip19.cubeList.add(new ModelBox(grip19, 540, 255, 0.0F, 7.8417F, -0.9083F, 3, 2, 6, 0.0F, false));

		grip21 = new ModelRenderer(this);
		grip21.setRotationPoint(-3.5F, -31.5F, -7.0F);
		grip8.addChild(grip21);
		grip21.cubeList.add(new ModelBox(grip21, 528, 184, -0.002F, 0.0522F, 5.3965F, 3, 4, 1, 0.0F, false));

		grip22 = new ModelRenderer(this);
		grip22.setRotationPoint(0.2F, 0.0F, 0.0F);
		gripL1A1Wood.addChild(grip22);
		setRotationAngle(grip22, 0.1309F, 0.0F, 0.0F);
		

		grip23 = new ModelRenderer(this);
		grip23.setRotationPoint(-3.5F, -35.9421F, -2.6803F);
		grip22.addChild(grip23);
		setRotationAngle(grip23, -0.48F, 0.0F, 0.0F);
		grip23.cubeList.add(new ModelBox(grip23, 122, 468, 2.299F, 2.0275F, 2.9832F, 1, 3, 2, 0.0F, false));

		grip24 = new ModelRenderer(this);
		grip24.setRotationPoint(-3.5F, -24.2F, 1.5F);
		grip22.addChild(grip24);
		setRotationAngle(grip24, -2.6769F, 0.0F, 0.0F);
		grip24.cubeList.add(new ModelBox(grip24, 68, 281, 2.3F, -4.5126F, -0.015F, 1, 10, 2, 0.0F, false));

		grip25 = new ModelRenderer(this);
		grip25.setRotationPoint(-3.5F, -24.1417F, -3.803F);
		grip22.addChild(grip25);
		setRotationAngle(grip25, -2.8078F, 0.0F, 0.0F);
		grip25.cubeList.add(new ModelBox(grip25, 264, 334, 2.301F, -4.4909F, -4.0201F, 1, 10, 6, 0.0F, false));

		grip26 = new ModelRenderer(this);
		grip26.setRotationPoint(-1.5F, -30.9726F, 7.7963F);
		grip22.addChild(grip26);
		setRotationAngle(grip26, -2.5165F, 0.0F, 0.0F);
		grip26.cubeList.add(new ModelBox(grip26, 78, 547, 0.3F, 3.7874F, 3.0476F, 1, 5, 4, 0.0F, false));

		grip27 = new ModelRenderer(this);
		grip27.setRotationPoint(-3.5F, -27.5F, -5.5F);
		grip22.addChild(grip27);
		setRotationAngle(grip27, 0.2603F, 0.0F, 0.0F);
		grip27.cubeList.add(new ModelBox(grip27, 146, 546, 2.3F, 7.8417F, -0.9083F, 1, 2, 6, 0.0F, false));

		grip28 = new ModelRenderer(this);
		grip28.setRotationPoint(-3.5F, -31.5F, -7.0F);
		grip22.addChild(grip28);
		grip28.cubeList.add(new ModelBox(grip28, 342, 541, 2.302F, 0.1305F, 5.3914F, 1, 4, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gripL1A1Wood.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}