package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Stoner63StockFolding extends ModelBase {
	private final ModelRenderer stockFolder;
	private final ModelRenderer stockFull;
	private final ModelRenderer stock_r1;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bone6;
	private final ModelRenderer bone10;
	private final ModelRenderer bone11;
	private final ModelRenderer bone19;
	private final ModelRenderer bone20;
	private final ModelRenderer bone21;
	private final ModelRenderer bone22;
	private final ModelRenderer bone23;
	private final ModelRenderer bone24;
	private final ModelRenderer bone25;
	private final ModelRenderer bone19_r1;
	private final ModelRenderer bone18_r1;
	private final ModelRenderer bone17_r1;
	private final ModelRenderer bone26;

	public Stoner63StockFolding() {
		textureWidth = 592;
		textureHeight = 592;

		stockFolder = new ModelRenderer(this);
		stockFolder.setRotationPoint(0.0F, 27.0F, 2.0F);
		stockFolder.cubeList.add(new ModelBox(stockFolder, 514, 549, -3.5F, -44.3F, 1.9F, 4, 9, 3, 0.0F, false));
		stockFolder.cubeList.add(new ModelBox(stockFolder, 266, 537, -4.5F, -44.3F, 3.9F, 1, 9, 1, 0.0F, false));

		stockFull = new ModelRenderer(this);
		stockFull.setRotationPoint(0.0F, -40.2087F, 39.1814F);
		stockFolder.addChild(stockFull);
		stockFull.cubeList.add(new ModelBox(stockFull, 559, 355, -3.5F, 13.4971F, -4.732F, 4, 1, 3, 0.0F, false));
		stockFull.cubeList.add(new ModelBox(stockFull, 474, 564, -3.499F, -3.1028F, -33.8816F, 4, 3, 1, 0.0F, false));
		stockFull.cubeList.add(new ModelBox(stockFull, 466, 559, -3.499F, -1.6528F, -32.8816F, 4, 1, 3, 0.0F, false));
		stockFull.cubeList.add(new ModelBox(stockFull, 569, 122, -3.499F, -2.4528F, -32.8816F, 4, 1, 1, 0.0F, false));
		stockFull.cubeList.add(new ModelBox(stockFull, 261, 571, -2.999F, -4.0028F, -33.8816F, 3, 1, 1, 0.0F, false));
		stockFull.cubeList.add(new ModelBox(stockFull, 245, 571, -2.999F, -4.0028F, -34.2816F, 3, 1, 1, 0.0F, false));
		stockFull.cubeList.add(new ModelBox(stockFull, 556, 505, -3.498F, -3.1028F, -34.2816F, 4, 8, 1, 0.0F, false));
		stockFull.cubeList.add(new ModelBox(stockFull, 71, 488, -3.5F, -0.6538F, -34.1804F, 4, 5, 30, 0.0F, false));
		stockFull.cubeList.add(new ModelBox(stockFull, 0, 524, -3.0F, -1.5538F, -28.1804F, 3, 1, 27, 0.0F, false));

		stock_r1 = new ModelRenderer(this);
		stock_r1.setRotationPoint(-1.5F, 4.7962F, -16.6804F);
		stockFull.addChild(stock_r1);
		setRotationAngle(stock_r1, -0.0436F, 0.0F, 0.0F);
		stock_r1.cubeList.add(new ModelBox(stock_r1, 246, 316, -2.0F, -1.0F, -17.5F, 4, 2, 21, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.001F, -4.0028F, -33.8815F);
		stockFull.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, -0.4538F);
		bone2.cubeList.add(new ModelBox(bone2, 579, 360, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 10, 579, -1.001F, 0.0F, -0.4F, 1, 1, 1, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-2.999F, -4.0028F, -33.8815F);
		stockFull.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.0F, 0.4538F);
		bone3.cubeList.add(new ModelBox(bone3, 579, 363, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 15, 579, -0.001F, 0.0F, -0.4F, 1, 1, 1, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, -1.5537F, -28.1804F);
		stockFull.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 0.0F, -0.4538F);
		bone4.cubeList.add(new ModelBox(bone4, 531, 518, -1.0F, 0.0F, 0.0F, 1, 1, 27, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-3.0F, -1.5537F, -28.1804F);
		stockFull.addChild(bone6);
		setRotationAngle(bone6, 0.0F, 0.0F, 0.4538F);
		bone6.cubeList.add(new ModelBox(bone6, 532, 0, 0.0F, 0.0F, 0.0F, 1, 1, 27, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.0F, -3.9129F, -34.0743F);
		stockFull.addChild(bone10);
		setRotationAngle(bone10, -0.3927F, 0.0F, 0.0F);
		bone10.cubeList.add(new ModelBox(bone10, 548, 206, -3.5F, 0.4076F, 1.9617F, 4, 1, 6, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 364, 567, -3.5F, 0.4076F, 0.9617F, 4, 2, 1, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 493, 549, -3.0F, -0.5F, 1.0F, 3, 2, 7, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(0.0F, -0.5F, 1.0F);
		bone10.addChild(bone11);
		setRotationAngle(bone11, 0.0F, 0.0F, -0.4538F);
		bone11.cubeList.add(new ModelBox(bone11, 68, 554, -1.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, false));

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(-3.0F, -0.5F, 1.0F);
		bone10.addChild(bone19);
		setRotationAngle(bone19, 0.0F, 0.0F, 0.4538F);
		bone19.cubeList.add(new ModelBox(bone19, 85, 554, 0.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, false));

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(-1.5F, 11.5F, -11.25F);
		stockFull.addChild(bone20);
		setRotationAngle(bone20, 0.0F, -0.7854F, 0.0F);
		bone20.cubeList.add(new ModelBox(bone20, 350, 575, 0.9849F, 1.35F, 0.9849F, 1, 2, 1, 0.0F, false));

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(0.0F, 0.0F, 0.0F);
		stockFull.addChild(bone21);
		setRotationAngle(bone21, -0.0873F, 0.0F, 0.0F);
		bone21.cubeList.add(new ModelBox(bone21, 317, 536, -3.5F, -0.7491F, -4.5218F, 4, 15, 5, 0.0F, false));

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(0.0F, -0.5F, 0.0F);
		stockFull.addChild(bone22);
		setRotationAngle(bone22, -0.7418F, 0.0F, 0.0F);
		bone22.cubeList.add(new ModelBox(bone22, 567, 514, -3.5F, -0.5168F, -0.7389F, 4, 1, 1, 0.0F, false));

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(0.0F, -0.8801F, -0.6956F);
		stockFull.addChild(bone23);
		setRotationAngle(bone23, -0.1745F, 0.0F, 0.0F);
		bone23.cubeList.add(new ModelBox(bone23, 72, 569, -3.5F, -0.5793F, -0.5944F, 4, 1, 1, 0.0F, false));

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(0.0F, 13.8699F, -0.9456F);
		stockFull.addChild(bone24);
		setRotationAngle(bone24, -1.309F, 0.0F, 0.0F);
		bone24.cubeList.add(new ModelBox(bone24, 83, 569, -3.5F, -0.078F, -0.5977F, 4, 1, 1, 0.0F, false));

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(0.0F, 13.3699F, -4.9456F);
		stockFull.addChild(bone25);
		setRotationAngle(bone25, -0.3927F, 0.0F, 0.0F);
		

		bone19_r1 = new ModelRenderer(this);
		bone19_r1.setRotationPoint(-1.5005F, 10.1873F, -9.0281F);
		bone25.addChild(bone19_r1);
		setRotationAngle(bone19_r1, 1.213F, 0.0F, 0.0F);
		bone19_r1.cubeList.add(new ModelBox(bone19_r1, 437, 328, -1.9995F, -8.0945F, 10.9449F, 4, 5, 7, 0.0F, false));

		bone18_r1 = new ModelRenderer(this);
		bone18_r1.setRotationPoint(-1.5005F, 6.6323F, -11.9883F);
		bone25.addChild(bone18_r1);
		setRotationAngle(bone18_r1, 0.8639F, 0.0F, 0.0F);
		bone18_r1.cubeList.add(new ModelBox(bone18_r1, 535, 505, -1.9995F, -4.1436F, 8.0839F, 4, 6, 6, 0.0F, false));

		bone17_r1 = new ModelRenderer(this);
		bone17_r1.setRotationPoint(-1.5005F, 1.0369F, -22.8943F);
		bone25.addChild(bone17_r1);
		setRotationAngle(bone17_r1, 0.1222F, 0.0F, 0.0F);
		bone17_r1.cubeList.add(new ModelBox(bone17_r1, 340, 482, -1.9995F, -7.2099F, 17.3571F, 4, 10, 6, 0.0F, false));

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(0.0F, 11.3295F, -33.3165F);
		stockFull.addChild(bone26);
		setRotationAngle(bone26, -0.1745F, 0.0F, 0.0F);
		
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		stockFolder.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}