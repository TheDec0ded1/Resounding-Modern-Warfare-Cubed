package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M110Stock extends ModelBase {
	private final ModelRenderer stockM110;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;
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

	public M110Stock() {
		textureWidth = 544;
		textureHeight = 544;

		stockM110 = new ModelRenderer(this);
		stockM110.setRotationPoint(0.0F, 22.8F, 1.0F);
		stockM110.cubeList.add(new ModelBox(stockM110, 388, 373, -1.65F, -37.4F, 2.351F, 2, 2, 32, 0.001F, false));
		stockM110.cubeList.add(new ModelBox(stockM110, 406, 254, -3.35F, -37.4F, 2.352F, 2, 2, 32, 0.001F, false));
		stockM110.cubeList.add(new ModelBox(stockM110, 260, 514, -3.75F, -33.75F, 27.0F, 1, 2, 2, 0.0F, false));
		stockM110.cubeList.add(new ModelBox(stockM110, 272, 514, -3.751F, -32.3358F, 28.4142F, 1, 2, 2, 0.0F, false));
		stockM110.cubeList.add(new ModelBox(stockM110, 406, 77, -3.752F, -32.3358F, 25.5858F, 1, 2, 3, 0.0F, false));
		stockM110.cubeList.add(new ModelBox(stockM110, 390, 514, -3.75F, -30.9216F, 27.0F, 1, 2, 2, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-3.0F, -30.3358F, 29.0F);
		stockM110.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.7854F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 514, 400, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-3.0F, -30.3358F, 27.0F);
		stockM110.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.7854F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 396, 514, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-3.0F, -32.3358F, 29.0F);
		stockM110.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.7854F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 278, 514, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(-3.0F, -32.3358F, 27.0F);
		stockM110.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.7854F, 0.0F, 0.0F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 266, 514, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(-1.5F, -33.0F, 4.0F);
		stockM110.addChild(cube_r33);
		setRotationAngle(cube_r33, -0.4363F, 0.0F, 0.0F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 262, 170, -2.0F, -1.0F, -1.0F, 4, 2, 2, 0.0F, false));

		receiver16_r1 = new ModelRenderer(this);
		receiver16_r1.setRotationPoint(-3.35F, -37.4F, 2.35F);
		stockM110.addChild(receiver16_r1);
		setRotationAngle(receiver16_r1, 0.0F, 0.0F, 0.4014F);
		receiver16_r1.cubeList.add(new ModelBox(receiver16_r1, 300, 411, -0.001F, -1.4F, -0.0001F, 1, 1, 32, 0.0F, false));
		receiver16_r1.cubeList.add(new ModelBox(receiver16_r1, 406, 288, 0.0F, -1.0F, 0.0F, 2, 1, 32, 0.0F, false));

		receiver19_r1 = new ModelRenderer(this);
		receiver19_r1.setRotationPoint(0.0F, -30.7F, 10.25F);
		stockM110.addChild(receiver19_r1);
		setRotationAngle(receiver19_r1, -0.3491F, 0.0F, 0.0F);
		receiver19_r1.cubeList.add(new ModelBox(receiver19_r1, 456, 382, -3.001F, -0.0603F, 0.3421F, 3, 1, 23, 0.0F, false));

		receiver18_r1 = new ModelRenderer(this);
		receiver18_r1.setRotationPoint(0.0F, -32.3F, 1.95F);
		stockM110.addChild(receiver18_r1);
		setRotationAngle(receiver18_r1, -0.192F, 0.0F, 0.0F);
		receiver18_r1.cubeList.add(new ModelBox(receiver18_r1, 344, 158, -3.0F, -0.0184F, 0.1908F, 3, 1, 9, 0.0F, false));

		receiver23_r1 = new ModelRenderer(this);
		receiver23_r1.setRotationPoint(-3.35F, -36.4F, 33.35F);
		stockM110.addChild(receiver23_r1);
		setRotationAngle(receiver23_r1, -0.1658F, -0.0052F, -0.0279F);
		receiver23_r1.cubeList.add(new ModelBox(receiver23_r1, 232, 448, -0.0279F, 4.9859F, -29.8349F, 1, 5, 14, 0.0F, false));
		receiver23_r1.cubeList.add(new ModelBox(receiver23_r1, 300, 396, -0.0279F, 2.9859F, -15.8349F, 1, 8, 5, 0.0F, false));
		receiver23_r1.cubeList.add(new ModelBox(receiver23_r1, 312, 356, -0.0279F, 1.9859F, -10.8349F, 1, 10, 5, 0.0F, false));
		receiver23_r1.cubeList.add(new ModelBox(receiver23_r1, 312, 338, -0.0279F, 0.9859F, -5.8349F, 1, 12, 6, 0.0F, false));

		receiver22_r1 = new ModelRenderer(this);
		receiver22_r1.setRotationPoint(0.35F, -36.4F, 33.35F);
		stockM110.addChild(receiver22_r1);
		setRotationAngle(receiver22_r1, -0.1658F, 0.0052F, 0.0279F);
		receiver22_r1.cubeList.add(new ModelBox(receiver22_r1, 328, 498, -0.9721F, 4.9859F, -29.8349F, 1, 5, 14, 0.0F, false));
		receiver22_r1.cubeList.add(new ModelBox(receiver22_r1, 132, 415, -0.9721F, 2.9859F, -15.8349F, 1, 8, 5, 0.0F, false));
		receiver22_r1.cubeList.add(new ModelBox(receiver22_r1, 144, 379, -0.9721F, 1.9859F, -10.8349F, 1, 10, 5, 0.0F, false));
		receiver22_r1.cubeList.add(new ModelBox(receiver22_r1, 440, 354, -0.9721F, 0.9859F, -5.8349F, 1, 12, 6, 0.0F, false));

		receiver21_r1 = new ModelRenderer(this);
		receiver21_r1.setRotationPoint(-3.35F, -36.4F, 33.35F);
		stockM110.addChild(receiver21_r1);
		setRotationAngle(receiver21_r1, -0.3752F, -0.0052F, -0.0279F);
		receiver21_r1.cubeList.add(new ModelBox(receiver21_r1, 48, 477, -0.0289F, 12.03F, -18.6335F, 1, 2, 22, 0.0F, false));

		receiver20_r1 = new ModelRenderer(this);
		receiver20_r1.setRotationPoint(0.35F, -36.4F, 33.35F);
		stockM110.addChild(receiver20_r1);
		setRotationAngle(receiver20_r1, -0.3752F, 0.0052F, 0.0279F);
		receiver20_r1.cubeList.add(new ModelBox(receiver20_r1, 94, 477, -0.9711F, 12.03F, -18.6335F, 1, 2, 22, 0.0F, false));

		receiver19_r2 = new ModelRenderer(this);
		receiver19_r2.setRotationPoint(-3.35F, -36.4F, 34.35F);
		stockM110.addChild(receiver19_r2);
		setRotationAngle(receiver19_r2, -0.1658F, 0.0F, -0.0279F);
		receiver19_r2.cubeList.add(new ModelBox(receiver19_r2, 226, 477, -0.0279F, 0.9859F, -0.835F, 2, 13, 1, 0.0F, false));

		receiver18_r4 = new ModelRenderer(this);
		receiver18_r4.setRotationPoint(0.35F, -36.4F, 34.35F);
		stockM110.addChild(receiver18_r4);
		setRotationAngle(receiver18_r4, -0.1658F, 0.0F, 0.0279F);
		receiver18_r4.cubeList.add(new ModelBox(receiver18_r4, 480, 105, -1.9721F, 0.9859F, -0.835F, 2, 13, 1, 0.0F, false));

		receiver19_r3 = new ModelRenderer(this);
		receiver19_r3.setRotationPoint(-3.35F, -36.4F, 2.0F);
		stockM110.addChild(receiver19_r3);
		setRotationAngle(receiver19_r3, 0.0F, 0.0F, -0.0873F);
		receiver19_r3.cubeList.add(new ModelBox(receiver19_r3, 144, 413, -0.0872F, 0.9962F, 0.0F, 1, 4, 31, 0.0F, false));

		receiver18_r5 = new ModelRenderer(this);
		receiver18_r5.setRotationPoint(0.35F, -36.4F, 2.0F);
		stockM110.addChild(receiver18_r5);
		setRotationAngle(receiver18_r5, 0.0F, 0.0F, 0.0873F);
		receiver18_r5.cubeList.add(new ModelBox(receiver18_r5, 208, 413, -0.9128F, 0.9962F, 0.0F, 1, 4, 31, 0.0F, false));

		receiver16_r2 = new ModelRenderer(this);
		receiver16_r2.setRotationPoint(0.35F, -37.4F, 2.35F);
		stockM110.addChild(receiver16_r2);
		setRotationAngle(receiver16_r2, 0.0F, 0.0F, -0.4014F);
		receiver16_r2.cubeList.add(new ModelBox(receiver16_r2, 406, 321, -2.0F, -1.0F, 0.0F, 2, 1, 32, 0.0F, false));
		receiver16_r2.cubeList.add(new ModelBox(receiver16_r2, 0, 415, -0.999F, -1.4F, -0.0001F, 1, 1, 32, 0.0F, false));

		receiver17_r1 = new ModelRenderer(this);
		receiver17_r1.setRotationPoint(-1.5F, -39.25F, 2.35F);
		stockM110.addChild(receiver17_r1);
		setRotationAngle(receiver17_r1, 0.0F, 0.0F, -0.4014F);
		receiver17_r1.cubeList.add(new ModelBox(receiver17_r1, 388, 407, -1.4F, -0.001F, 0.0049F, 1, 2, 32, 0.0F, false));
		receiver17_r1.cubeList.add(new ModelBox(receiver17_r1, 66, 415, -1.0F, 0.0F, 0.002F, 1, 1, 32, 0.0F, false));

		receiver17_r2 = new ModelRenderer(this);
		receiver17_r2.setRotationPoint(-1.5F, -39.25F, 2.35F);
		stockM110.addChild(receiver17_r2);
		setRotationAngle(receiver17_r2, 0.0F, 0.0F, 0.4014F);
		receiver17_r2.cubeList.add(new ModelBox(receiver17_r2, 420, 120, 0.0F, 0.0F, 0.0F, 1, 1, 32, 0.0F, false));
		receiver17_r2.cubeList.add(new ModelBox(receiver17_r2, 408, 209, 0.4F, -0.001F, 0.001F, 1, 2, 32, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		stockM110.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}