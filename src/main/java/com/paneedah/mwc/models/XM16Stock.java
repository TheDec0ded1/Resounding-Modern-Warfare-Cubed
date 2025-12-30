package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class XM16Stock extends ModelBase {
	private final ModelRenderer m16stock;
	private final ModelRenderer receiver16_r1;
	private final ModelRenderer receiver19_r1;
	private final ModelRenderer receiver18_r1;
	private final ModelRenderer receiver23_r1;
	private final ModelRenderer receiver22_r1;
	private final ModelRenderer receiver21_r1;
	private final ModelRenderer receiver20_r1;
	private final ModelRenderer receiver19_r2;
	private final ModelRenderer receiver18_r4;
	private final ModelRenderer receiver19_r3;
	private final ModelRenderer receiver18_r5;
	private final ModelRenderer receiver16_r2;
	private final ModelRenderer receiver17_r1;
	private final ModelRenderer receiver17_r2;

	public XM16Stock() {
		textureWidth = 672;
		textureHeight = 672;

		m16stock = new ModelRenderer(this);
		m16stock.setRotationPoint(0.0F, 22.8F, 1.0F);
		m16stock.cubeList.add(new ModelBox(m16stock, 498, 296, -1.65F, -37.4F, 2.351F, 2, 2, 32, 0.001F, false));
		m16stock.cubeList.add(new ModelBox(m16stock, 498, 330, -3.35F, -37.4F, 2.352F, 2, 2, 32, 0.001F, false));

		receiver16_r1 = new ModelRenderer(this);
		receiver16_r1.setRotationPoint(-3.35F, -37.4F, 2.35F);
		m16stock.addChild(receiver16_r1);
		setRotationAngle(receiver16_r1, 0.0F, 0.0F, 0.4014F);
		receiver16_r1.cubeList.add(new ModelBox(receiver16_r1, 436, 519, -0.001F, -1.4F, -0.0001F, 1, 1, 32, 0.0F, false));
		receiver16_r1.cubeList.add(new ModelBox(receiver16_r1, 498, 364, 0.0F, -1.0F, 0.0F, 2, 1, 32, 0.0F, false));

		receiver19_r1 = new ModelRenderer(this);
		receiver19_r1.setRotationPoint(0.0F, -30.7F, 10.25F);
		m16stock.addChild(receiver19_r1);
		setRotationAngle(receiver19_r1, -0.3491F, 0.0F, 0.0F);
		receiver19_r1.cubeList.add(new ModelBox(receiver19_r1, 502, 34, -3.001F, -0.0603F, 0.3421F, 3, 1, 23, 0.0F, false));

		receiver18_r1 = new ModelRenderer(this);
		receiver18_r1.setRotationPoint(0.0F, -32.3F, 1.95F);
		m16stock.addChild(receiver18_r1);
		setRotationAngle(receiver18_r1, -0.192F, 0.0F, 0.0F);
		receiver18_r1.cubeList.add(new ModelBox(receiver18_r1, 612, 123, -3.0F, -0.0184F, 0.1908F, 3, 1, 9, 0.0F, false));

		receiver23_r1 = new ModelRenderer(this);
		receiver23_r1.setRotationPoint(-3.35F, -36.4F, 33.35F);
		m16stock.addChild(receiver23_r1);
		setRotationAngle(receiver23_r1, -0.1658F, -0.0052F, -0.0279F);
		receiver23_r1.cubeList.add(new ModelBox(receiver23_r1, 144, 585, -0.0279F, 4.9859F, -29.8349F, 1, 5, 14, 0.0F, false));
		receiver23_r1.cubeList.add(new ModelBox(receiver23_r1, 610, 570, -0.0279F, 2.9859F, -15.8349F, 1, 8, 5, 0.0F, false));
		receiver23_r1.cubeList.add(new ModelBox(receiver23_r1, 486, 296, -0.0279F, 1.9859F, -10.8349F, 1, 10, 5, 0.0F, false));
		receiver23_r1.cubeList.add(new ModelBox(receiver23_r1, 368, 582, -0.0279F, 0.9859F, -5.8349F, 1, 12, 6, 0.0F, false));

		receiver22_r1 = new ModelRenderer(this);
		receiver22_r1.setRotationPoint(0.35F, -36.4F, 33.35F);
		m16stock.addChild(receiver22_r1);
		setRotationAngle(receiver22_r1, -0.1658F, 0.0052F, 0.0279F);
		receiver22_r1.cubeList.add(new ModelBox(receiver22_r1, 624, 570, -0.9721F, 4.9859F, -29.8349F, 1, 5, 14, 0.0F, false));
		receiver22_r1.cubeList.add(new ModelBox(receiver22_r1, 266, 641, -0.9721F, 2.9859F, -15.8349F, 1, 8, 5, 0.0F, false));
		receiver22_r1.cubeList.add(new ModelBox(receiver22_r1, 152, 641, -0.9721F, 1.9859F, -10.8349F, 1, 10, 5, 0.0F, false));
		receiver22_r1.cubeList.add(new ModelBox(receiver22_r1, 296, 628, -0.9721F, 0.9859F, -5.8349F, 1, 12, 6, 0.0F, false));

		receiver21_r1 = new ModelRenderer(this);
		receiver21_r1.setRotationPoint(-3.35F, -36.4F, 33.35F);
		m16stock.addChild(receiver21_r1);
		setRotationAngle(receiver21_r1, -0.3752F, -0.0052F, -0.0279F);
		receiver21_r1.cubeList.add(new ModelBox(receiver21_r1, 606, 252, -0.0289F, 12.03F, -18.6335F, 1, 2, 22, 0.0F, false));

		receiver20_r1 = new ModelRenderer(this);
		receiver20_r1.setRotationPoint(0.35F, -36.4F, 33.35F);
		m16stock.addChild(receiver20_r1);
		setRotationAngle(receiver20_r1, -0.3752F, 0.0052F, 0.0279F);
		receiver20_r1.cubeList.add(new ModelBox(receiver20_r1, 416, 606, -0.9711F, 12.03F, -18.6335F, 1, 2, 22, 0.0F, false));

		receiver19_r2 = new ModelRenderer(this);
		receiver19_r2.setRotationPoint(-3.35F, -36.4F, 34.35F);
		m16stock.addChild(receiver19_r2);
		setRotationAngle(receiver19_r2, -0.1658F, 0.0F, -0.0279F);
		receiver19_r2.cubeList.add(new ModelBox(receiver19_r2, 320, 555, -0.0279F, 0.9859F, -0.835F, 2, 13, 1, 0.0F, false));

		receiver18_r4 = new ModelRenderer(this);
		receiver18_r4.setRotationPoint(0.35F, -36.4F, 34.35F);
		m16stock.addChild(receiver18_r4);
		setRotationAngle(receiver18_r4, -0.1658F, 0.0F, 0.0279F);
		receiver18_r4.cubeList.add(new ModelBox(receiver18_r4, 558, 501, -1.9721F, 0.9859F, -0.835F, 2, 13, 1, 0.0F, false));

		receiver19_r3 = new ModelRenderer(this);
		receiver19_r3.setRotationPoint(-3.35F, -36.4F, 2.0F);
		m16stock.addChild(receiver19_r3);
		setRotationAngle(receiver19_r3, 0.0F, 0.0F, -0.0873F);
		receiver19_r3.cubeList.add(new ModelBox(receiver19_r3, 502, 519, -0.0872F, 0.9962F, 0.0F, 1, 4, 31, 0.0F, false));

		receiver18_r5 = new ModelRenderer(this);
		receiver18_r5.setRotationPoint(0.35F, -36.4F, 2.0F);
		m16stock.addChild(receiver18_r5);
		setRotationAngle(receiver18_r5, 0.0F, 0.0F, 0.0873F);
		receiver18_r5.cubeList.add(new ModelBox(receiver18_r5, 0, 520, -0.9128F, 0.9962F, 0.0F, 1, 4, 31, 0.0F, false));

		receiver16_r2 = new ModelRenderer(this);
		receiver16_r2.setRotationPoint(0.35F, -37.4F, 2.35F);
		m16stock.addChild(receiver16_r2);
		setRotationAngle(receiver16_r2, 0.0F, 0.0F, -0.4014F);
		receiver16_r2.cubeList.add(new ModelBox(receiver16_r2, 498, 397, -2.0F, -1.0F, 0.0F, 2, 1, 32, 0.0F, false));
		receiver16_r2.cubeList.add(new ModelBox(receiver16_r2, 64, 523, -0.999F, -1.4F, -0.0001F, 1, 1, 32, 0.0F, false));

		receiver17_r1 = new ModelRenderer(this);
		receiver17_r1.setRotationPoint(-1.5F, -39.25F, 2.35F);
		m16stock.addChild(receiver17_r1);
		setRotationAngle(receiver17_r1, 0.0F, 0.0F, -0.4014F);
		receiver17_r1.cubeList.add(new ModelBox(receiver17_r1, 502, 0, -1.4F, -0.001F, 0.0049F, 1, 2, 32, 0.0F, false));
		receiver17_r1.cubeList.add(new ModelBox(receiver17_r1, 130, 523, -1.0F, 0.0F, 0.002F, 1, 1, 32, 0.0F, false));

		receiver17_r2 = new ModelRenderer(this);
		receiver17_r2.setRotationPoint(-1.5F, -39.25F, 2.35F);
		m16stock.addChild(receiver17_r2);
		setRotationAngle(receiver17_r2, 0.0F, 0.0F, 0.4014F);
		receiver17_r2.cubeList.add(new ModelBox(receiver17_r2, 196, 523, 0.0F, 0.0F, 0.0F, 1, 1, 32, 0.0F, false));
		receiver17_r2.cubeList.add(new ModelBox(receiver17_r2, 370, 519, 0.4F, -0.001F, 0.001F, 1, 2, 32, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		m16stock.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}