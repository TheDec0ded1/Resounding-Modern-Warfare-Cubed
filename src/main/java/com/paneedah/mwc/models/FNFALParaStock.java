package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FNFALParaStock extends ModelBase {
	private final ModelRenderer stock;
	private final ModelRenderer stock_r1;
	private final ModelRenderer stock_r2;
	private final ModelRenderer stock_r3;
	private final ModelRenderer stock_r4;
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

	public FNFALParaStock() {
		textureWidth = 400;
		textureHeight = 400;

		stock = new ModelRenderer(this);
		stock.setRotationPoint(0.0F, -11.4587F, 38.6064F);
		stock.cubeList.add(new ModelBox(stock, 2, 15, -2.999F, -6.0028F, -33.8816F, 3, 1, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 9, 14, -2.999F, -6.0028F, -34.2816F, 3, 1, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 7, 16, -3.498F, -3.1028F, -34.2816F, 4, 6, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 7, 16, -3.498F, -5.1028F, -34.2816F, 4, 2, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 6, 14, -3.499F, -5.1028F, -33.8816F, 4, 2, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 6, 15, -4.498F, -4.1028F, -33.2816F, 5, 6, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 6, 15, -4.498F, 1.8972F, -33.2816F, 5, 3, 2, 0.0F, false));

		stock_r1 = new ModelRenderer(this);
		stock_r1.setRotationPoint(-1.4995F, 4.3732F, -25.4276F);
		stock.addChild(stock_r1);
		setRotationAngle(stock_r1, -0.0436F, 0.0F, 0.0F);
		stock_r1.cubeList.add(new ModelBox(stock_r1, 205, 134, -0.9995F, -0.1064F, -4.8449F, 1, 1, 18, 0.0F, false));
		stock_r1.cubeList.add(new ModelBox(stock_r1, 9, 13, -0.4995F, -4.1064F, 13.1551F, 1, 6, 3, 0.0F, false));
		stock_r1.cubeList.add(new ModelBox(stock_r1, 9, 13, -0.4995F, -4.1064F, 10.1551F, 1, 4, 3, 0.0F, false));
		stock_r1.cubeList.add(new ModelBox(stock_r1, 9, 13, -0.4995F, -4.1064F, -4.8449F, 1, 4, 3, 0.0F, false));
		stock_r1.cubeList.add(new ModelBox(stock_r1, 205, 134, 0.0005F, -0.1064F, -4.8449F, 1, 1, 18, 0.0F, false));
		stock_r1.cubeList.add(new ModelBox(stock_r1, 205, 134, -0.9995F, 0.8936F, -4.8449F, 1, 1, 18, 0.0F, false));
		stock_r1.cubeList.add(new ModelBox(stock_r1, 205, 134, 0.0005F, 0.8936F, -4.8449F, 1, 1, 18, 0.0F, false));

		stock_r2 = new ModelRenderer(this);
		stock_r2.setRotationPoint(-1.4995F, 4.0181F, -8.4723F);
		stock.addChild(stock_r2);
		setRotationAngle(stock_r2, -0.0436F, 0.0F, 0.0F);
		stock_r2.cubeList.add(new ModelBox(stock_r2, 204, 133, -1.0005F, -4.7936F, -22.1551F, 1, 1, 19, 0.0F, false));
		stock_r2.cubeList.add(new ModelBox(stock_r2, 204, 133, -0.0005F, -4.7936F, -22.1551F, 1, 1, 19, 0.0F, false));
		stock_r2.cubeList.add(new ModelBox(stock_r2, 204, 133, -1.0005F, -3.7936F, -22.1551F, 1, 1, 19, 0.0F, false));
		stock_r2.cubeList.add(new ModelBox(stock_r2, 204, 133, -0.0005F, -3.7936F, -22.1551F, 1, 1, 19, 0.0F, false));

		stock_r3 = new ModelRenderer(this);
		stock_r3.setRotationPoint(-1.4995F, 4.1378F, -19.488F);
		stock.addChild(stock_r3);
		setRotationAngle(stock_r3, -0.0436F, 0.0F, 0.0F);
		stock_r3.cubeList.add(new ModelBox(stock_r3, 212, 141, -0.0005F, -5.3936F, 7.8449F, 1, 1, 11, 0.0F, false));
		stock_r3.cubeList.add(new ModelBox(stock_r3, 212, 141, -1.0005F, -5.3936F, 7.8449F, 1, 1, 11, 0.0F, false));
		stock_r3.cubeList.add(new ModelBox(stock_r3, 212, 141, -1.0005F, -4.3936F, 7.8449F, 1, 1, 11, 0.0F, false));
		stock_r3.cubeList.add(new ModelBox(stock_r3, 212, 141, -0.0005F, -4.3936F, 7.8449F, 1, 1, 11, 0.0F, false));

		stock_r4 = new ModelRenderer(this);
		stock_r4.setRotationPoint(0.0F, 35.4587F, -38.6064F);
		stock.addChild(stock_r4);
		setRotationAngle(stock_r4, -0.0436F, 0.0F, 0.0F);
		stock_r4.cubeList.add(new ModelBox(stock_r4, 6, 15, -2.998F, -32.5615F, 5.3248F, 3, 3, 2, 0.0F, false));
		stock_r4.cubeList.add(new ModelBox(stock_r4, 6, 15, -2.998F, -37.5615F, 5.3248F, 3, 5, 2, 0.0F, false));

		bone93 = new ModelRenderer(this);
		bone93.setRotationPoint(0.001F, -4.0028F, -33.8815F);
		stock.addChild(bone93);
		setRotationAngle(bone93, 0.0F, 0.0F, -0.4538F);
		bone93.cubeList.add(new ModelBox(bone93, 8, 21, -0.1232F, -1.7976F, 0.0F, 1, 1, 1, 0.0F, false));
		bone93.cubeList.add(new ModelBox(bone93, 9, 16, -0.1242F, -1.7976F, -0.4F, 1, 1, 1, 0.0F, false));

		bone94 = new ModelRenderer(this);
		bone94.setRotationPoint(-2.999F, -4.0028F, -33.8815F);
		stock.addChild(bone94);
		setRotationAngle(bone94, 0.0F, 0.0F, 0.4538F);
		bone94.cubeList.add(new ModelBox(bone94, 12, 18, -0.8768F, -1.7976F, 0.0F, 1, 1, 1, 0.0F, false));
		bone94.cubeList.add(new ModelBox(bone94, 12, 17, -0.8778F, -1.7976F, -0.4F, 1, 1, 1, 0.0F, false));

		bone97 = new ModelRenderer(this);
		bone97.setRotationPoint(0.0F, -1.5537F, -28.1804F);
		stock.addChild(bone97);
		setRotationAngle(bone97, 0.0F, 0.0F, -0.4538F);
		

		bone98 = new ModelRenderer(this);
		bone98.setRotationPoint(-3.0F, -1.5537F, -28.1804F);
		stock.addChild(bone98);
		setRotationAngle(bone98, 0.0F, 0.0F, 0.4538F);
		

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(0.0F, -3.9129F, -34.0743F);
		stock.addChild(bone12);
		setRotationAngle(bone12, -0.3927F, 0.0F, 0.0F);
		

		bone95 = new ModelRenderer(this);
		bone95.setRotationPoint(0.0F, -0.5F, 1.0F);
		bone12.addChild(bone95);
		setRotationAngle(bone95, 0.0F, 0.0F, -0.4538F);
		

		bone96 = new ModelRenderer(this);
		bone96.setRotationPoint(-3.0F, -0.5F, 1.0F);
		bone12.addChild(bone96);
		setRotationAngle(bone96, 0.0F, 0.0F, 0.4538F);
		

		bone86 = new ModelRenderer(this);
		bone86.setRotationPoint(-1.5F, 11.5F, -11.25F);
		stock.addChild(bone86);
		setRotationAngle(bone86, 0.0F, -0.7854F, 0.0F);
		

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(0.0F, 0.0F, 0.0F);
		stock.addChild(bone13);
		setRotationAngle(bone13, -0.0873F, 0.0F, 0.0F);
		bone13.cubeList.add(new ModelBox(bone13, 77, 98, -3.5F, -0.0071F, -1.2618F, 4, 15, 2, 0.0F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(0.0F, -0.5F, 0.0F);
		stock.addChild(bone14);
		setRotationAngle(bone14, -0.7418F, 0.0F, 0.0F);
		bone14.cubeList.add(new ModelBox(bone14, 57, 27, -3.5F, -0.0864F, -0.0809F, 4, 1, 1, 0.0F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(0.0F, -0.8801F, -0.6956F);
		stock.addChild(bone15);
		setRotationAngle(bone15, -0.1745F, 0.0F, 0.0F);
		bone15.cubeList.add(new ModelBox(bone15, 0, 46, -3.5F, 0.1372F, -0.2708F, 4, 1, 1, 0.0F, false));

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(0.0F, 13.8699F, -0.9456F);
		stock.addChild(bone16);
		setRotationAngle(bone16, -1.309F, 0.0F, 0.0F);
		bone16.cubeList.add(new ModelBox(bone16, 33, 14, -3.5F, -0.0689F, 0.1885F, 4, 1, 1, 0.0F, false));

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(0.0F, 12.6199F, -4.6956F);
		stock.addChild(bone17);
		setRotationAngle(bone17, -0.6545F, 0.0F, 0.0F);
		bone17.cubeList.add(new ModelBox(bone17, 209, 139, -2.499F, -0.5544F, -10.7531F, 1, 1, 14, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 209, 139, -2.499F, -1.5544F, -10.7531F, 1, 1, 14, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 209, 139, -1.499F, -1.5544F, -10.7531F, 1, 1, 14, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 209, 139, -1.499F, -0.5544F, -10.7531F, 1, 1, 14, 0.0F, false));

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