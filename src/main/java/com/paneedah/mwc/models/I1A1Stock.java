package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class I1A1Stock extends ModelBase {
	private final ModelRenderer stock;
	private final ModelRenderer bone93;
	private final ModelRenderer bone94;
	private final ModelRenderer bone97;
	private final ModelRenderer bone98;
	private final ModelRenderer bone12;
	private final ModelRenderer bone95;
	private final ModelRenderer bone96;
	private final ModelRenderer bone86;
	private final ModelRenderer bone13;
	private final ModelRenderer bone14;
	private final ModelRenderer bone15;
	private final ModelRenderer bone16;
	private final ModelRenderer bone17;
	private final ModelRenderer bone18;

	public I1A1Stock() {
		textureWidth = 512;
		textureHeight = 256;

		stock = new ModelRenderer(this);
		stock.setRotationPoint(0.0F, -11.4587F, 38.6064F);
		stock.cubeList.add(new ModelBox(stock, 306, 237, -3.5F, 13.4972F, -4.7316F, 4, 1, 3, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 323, 236, -3.499F, -3.1028F, -33.8816F, 4, 3, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 312, 225, -2.999F, -4.0028F, -33.8816F, 3, 1, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 324, 232, -2.999F, -4.0028F, -34.2816F, 3, 1, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 315, 227, -3.498F, -3.1028F, -34.2816F, 4, 6, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 289, 218, -3.5F, -0.6538F, -28.1804F, 4, 5, 24, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 281, 213, -3.0F, -1.5538F, -28.1804F, 3, 1, 27, 0.0F, false));

		bone93 = new ModelRenderer(this);
		bone93.setRotationPoint(0.001F, -4.0028F, -33.8815F);
		stock.addChild(bone93);
		setRotationAngle(bone93, 0.0F, 0.0F, -0.4538F);
		bone93.cubeList.add(new ModelBox(bone93, 325, 235, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		bone93.cubeList.add(new ModelBox(bone93, 337, 235, -1.001F, 0.0F, -0.4F, 1, 1, 1, 0.0F, false));

		bone94 = new ModelRenderer(this);
		bone94.setRotationPoint(-2.999F, -4.0028F, -33.8815F);
		stock.addChild(bone94);
		setRotationAngle(bone94, 0.0F, 0.0F, 0.4538F);
		bone94.cubeList.add(new ModelBox(bone94, 316, 228, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		bone94.cubeList.add(new ModelBox(bone94, 320, 232, -0.001F, 0.0F, -0.4F, 1, 1, 1, 0.0F, false));

		bone97 = new ModelRenderer(this);
		bone97.setRotationPoint(0.0F, -1.5537F, -28.1804F);
		stock.addChild(bone97);
		setRotationAngle(bone97, 0.0F, 0.0F, -0.4538F);
		bone97.cubeList.add(new ModelBox(bone97, 283, 216, -1.0F, 0.0F, 0.0F, 1, 1, 27, 0.0F, false));

		bone98 = new ModelRenderer(this);
		bone98.setRotationPoint(-3.0F, -1.5537F, -28.1804F);
		stock.addChild(bone98);
		setRotationAngle(bone98, 0.0F, 0.0F, 0.4538F);
		bone98.cubeList.add(new ModelBox(bone98, 285, 216, 0.0F, 0.0F, 0.0F, 1, 1, 27, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(0.0F, -3.9129F, -34.0743F);
		stock.addChild(bone12);
		setRotationAngle(bone12, -0.3927F, 0.0F, 0.0F);
		bone12.cubeList.add(new ModelBox(bone12, 309, 229, -3.5F, 0.4076F, 1.9617F, 4, 5, 6, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 319, 238, -3.5F, 0.4076F, 0.9617F, 4, 2, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 317, 231, -3.0F, -0.5F, 1.0F, 3, 3, 7, 0.0F, false));

		bone95 = new ModelRenderer(this);
		bone95.setRotationPoint(0.0F, -0.5F, 1.0F);
		bone12.addChild(bone95);
		setRotationAngle(bone95, 0.0F, 0.0F, -0.4538F);
		bone95.cubeList.add(new ModelBox(bone95, 304, 225, -1.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, false));

		bone96 = new ModelRenderer(this);
		bone96.setRotationPoint(-3.0F, -0.5F, 1.0F);
		bone12.addChild(bone96);
		setRotationAngle(bone96, 0.0F, 0.0F, 0.4538F);
		bone96.cubeList.add(new ModelBox(bone96, 304, 229, 0.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, false));

		bone86 = new ModelRenderer(this);
		bone86.setRotationPoint(-1.5F, 11.5F, -11.25F);
		stock.addChild(bone86);
		setRotationAngle(bone86, 0.0F, -0.7854F, 0.0F);
		bone86.cubeList.add(new ModelBox(bone86, 320, 234, -0.5F, -1.25F, -0.5F, 1, 2, 1, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(0.0F, 0.0F, 0.0F);
		stock.addChild(bone13);
		setRotationAngle(bone13, -0.0873F, 0.0F, 0.0F);
		bone13.cubeList.add(new ModelBox(bone13, 316, 221, -3.5F, -0.749F, -4.5218F, 4, 15, 4, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 485, 234, -3.5F, -0.749F, -0.5218F, 4, 15, 1, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 312, 216, -3.501F, 4.251F, -16.5218F, 4, 5, 12, 0.0F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(0.0F, -0.5F, 0.0F);
		stock.addChild(bone14);
		setRotationAngle(bone14, -0.7418F, 0.0F, 0.0F);
		bone14.cubeList.add(new ModelBox(bone14, 477, 231, -3.5F, -0.5167F, -0.7388F, 4, 1, 1, 0.0F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(0.0F, -0.8801F, -0.6956F);
		stock.addChild(bone15);
		setRotationAngle(bone15, -0.1745F, 0.0F, 0.0F);
		bone15.cubeList.add(new ModelBox(bone15, 315, 233, -3.5F, -0.5792F, -0.5944F, 4, 1, 1, 0.0F, false));

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(0.0F, 13.8699F, -0.9456F);
		stock.addChild(bone16);
		setRotationAngle(bone16, -1.309F, 0.0F, 0.0F);
		bone16.cubeList.add(new ModelBox(bone16, 467, 239, -3.5F, -0.0784F, -0.5975F, 4, 1, 1, 0.0F, false));

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(0.0F, 13.3699F, -4.9456F);
		stock.addChild(bone17);
		setRotationAngle(bone17, -0.3927F, 0.0F, 0.0F);
		bone17.cubeList.add(new ModelBox(bone17, 285, 215, -3.499F, -4.0404F, -25.3709F, 4, 5, 26, 0.0F, false));

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(0.0F, 11.3295F, -33.3165F);
		stock.addChild(bone18);
		setRotationAngle(bone18, -0.1745F, 0.0F, 0.0F);
		bone18.cubeList.add(new ModelBox(bone18, 308, 228, -3.5F, -9.3785F, -2.3892F, 4, 2, 7, 0.0F, false));
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