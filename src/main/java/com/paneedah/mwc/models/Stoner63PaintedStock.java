package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Stoner63PaintedStock extends ModelBase {
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
	private final ModelRenderer bone17_r1;
	private final ModelRenderer bone18;

	public Stoner63PaintedStock() {
		textureWidth = 576;
		textureHeight = 576;

		stock = new ModelRenderer(this);
		stock.setRotationPoint(0.0F, -13.2087F, 38.1814F);
		stock.cubeList.add(new ModelBox(stock, 301, 543, -3.5F, 13.4971F, 0.268F, 4, 1, 3, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 479, 547, -3.499F, -3.1028F, -33.8816F, 4, 3, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 553, 272, -2.999F, -4.0028F, -33.8816F, 3, 1, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 553, 508, -2.999F, -4.0028F, -34.2816F, 3, 1, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 467, 537, -3.498F, -3.1028F, -34.2816F, 4, 8, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 459, 194, -3.5F, -0.6538F, -28.1804F, 4, 5, 29, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 459, 36, -3.0F, -1.5538F, -28.1804F, 3, 1, 32, 0.0F, false));

		bone93 = new ModelRenderer(this);
		bone93.setRotationPoint(0.001F, -4.0028F, -33.8815F);
		stock.addChild(bone93);
		setRotationAngle(bone93, 0.0F, 0.0F, -0.4538F);
		bone93.cubeList.add(new ModelBox(bone93, 492, 560, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		bone93.cubeList.add(new ModelBox(bone93, 561, 67, -1.001F, 0.0F, -0.4F, 1, 1, 1, 0.0F, false));

		bone94 = new ModelRenderer(this);
		bone94.setRotationPoint(-2.999F, -4.0028F, -33.8815F);
		stock.addChild(bone94);
		setRotationAngle(bone94, 0.0F, 0.0F, 0.4538F);
		bone94.cubeList.add(new ModelBox(bone94, 516, 560, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		bone94.cubeList.add(new ModelBox(bone94, 70, 561, -0.001F, 0.0F, -0.4F, 1, 1, 1, 0.0F, false));

		bone97 = new ModelRenderer(this);
		bone97.setRotationPoint(0.0F, -1.5537F, -28.1804F);
		stock.addChild(bone97);
		setRotationAngle(bone97, 0.0F, 0.0F, -0.4538F);
		bone97.cubeList.add(new ModelBox(bone97, 67, 491, -1.0F, 0.0F, 0.0F, 1, 1, 32, 0.0F, false));

		bone98 = new ModelRenderer(this);
		bone98.setRotationPoint(-3.0F, -1.5537F, -28.1804F);
		stock.addChild(bone98);
		setRotationAngle(bone98, 0.0F, 0.0F, 0.4538F);
		bone98.cubeList.add(new ModelBox(bone98, 134, 491, 0.0F, 0.0F, 0.0F, 1, 1, 32, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(0.0F, -3.9129F, -34.0743F);
		stock.addChild(bone12);
		setRotationAngle(bone12, -0.3927F, 0.0F, 0.0F);
		bone12.cubeList.add(new ModelBox(bone12, 532, 279, -3.5F, 0.4076F, 1.9617F, 4, 5, 6, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 18, 549, -3.5F, 0.4076F, 0.9617F, 4, 2, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 532, 335, -3.0F, -0.5F, 1.0F, 3, 3, 7, 0.0F, false));

		bone95 = new ModelRenderer(this);
		bone95.setRotationPoint(0.0F, -0.5F, 1.0F);
		bone12.addChild(bone95);
		setRotationAngle(bone95, 0.0F, 0.0F, -0.4538F);
		bone95.cubeList.add(new ModelBox(bone95, 121, 427, -1.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, false));

		bone96 = new ModelRenderer(this);
		bone96.setRotationPoint(-3.0F, -0.5F, 1.0F);
		bone12.addChild(bone96);
		setRotationAngle(bone96, 0.0F, 0.0F, 0.4538F);
		bone96.cubeList.add(new ModelBox(bone96, 121, 436, 0.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, false));

		bone86 = new ModelRenderer(this);
		bone86.setRotationPoint(-1.5F, 11.5F, -11.25F);
		stock.addChild(bone86);
		setRotationAngle(bone86, 0.0F, -0.7854F, 0.0F);
		bone86.cubeList.add(new ModelBox(bone86, 328, 557, -0.5F, -0.75F, -0.5F, 1, 2, 1, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(0.0F, 0.0F, 0.0F);
		stock.addChild(bone13);
		setRotationAngle(bone13, -0.0873F, 0.0F, 0.0F);
		bone13.cubeList.add(new ModelBox(bone13, 41, 528, -3.5F, -1.185F, 0.4592F, 4, 15, 5, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 201, 513, -3.501F, 4.251F, -18.5218F, 4, 5, 19, 0.0F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(0.0F, -0.5F, 0.0F);
		stock.addChild(bone14);
		setRotationAngle(bone14, -0.7418F, 0.0F, 0.0F);
		bone14.cubeList.add(new ModelBox(bone14, 551, 37, -3.5F, -3.8949F, 2.9474F, 4, 1, 1, 0.0F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(0.0F, -0.8801F, -0.6956F);
		stock.addChild(bone15);
		setRotationAngle(bone15, -0.1745F, 0.0F, 0.0F);
		bone15.cubeList.add(new ModelBox(bone15, 551, 40, -3.5F, -1.4474F, 4.3297F, 4, 1, 1, 0.0F, false));

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(0.0F, 13.8699F, -0.9456F);
		stock.addChild(bone16);
		setRotationAngle(bone16, -1.309F, 0.0F, 0.0F);
		bone16.cubeList.add(new ModelBox(bone16, 551, 43, -3.5F, -4.9076F, 0.6964F, 4, 1, 1, 0.0F, false));

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(0.0F, 13.3699F, -4.9456F);
		stock.addChild(bone17);
		setRotationAngle(bone17, -0.3927F, 0.0F, 0.0F);
		

		bone17_r1 = new ModelRenderer(this);
		bone17_r1.setRotationPoint(-1.5005F, 1.0369F, -22.8943F);
		bone17.addChild(bone17_r1);
		setRotationAngle(bone17_r1, 0.1222F, 0.0F, 0.0F);
		bone17_r1.cubeList.add(new ModelBox(bone17_r1, 338, 122, -1.9995F, -3.5461F, -7.8248F, 4, 5, 36, 0.0F, false));

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(0.0F, 11.3295F, -33.3165F);
		stock.addChild(bone18);
		setRotationAngle(bone18, -0.1745F, 0.0F, 0.0F);
		
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