package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class LMG68Stock extends ModelBase {
	private final ModelRenderer stock;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;

	public LMG68Stock() {
		textureWidth = 416;
		textureHeight = 416;

		stock = new ModelRenderer(this);
		stock.setRotationPoint(0.0F, 23.7F, 3.0F);
		stock.cubeList.add(new ModelBox(stock, 212, 326, -2.499F, -44.675F, 12.0F, 2, 1, 16, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 0, 312, -3.499F, -41.675F, 12.0F, 4, 4, 16, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 162, 375, -3.499F, -37.675F, 25.0F, 4, 6, 3, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 386, 55, -2.815F, -30.7956F, 25.0F, 2, 1, 3, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 24, 389, -1.183F, -30.7956F, 25.0F, 1, 1, 3, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 120, 368, -3.999F, -43.675F, 28.0F, 5, 10, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 162, 395, -2.0093F, -33.7113F, 28.0F, 1, 2, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 392, 34, -3.0093F, -30.7113F, 28.0F, 3, 1, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 384, 354, -3.5F, -37.675F, 24.5F, 4, 1, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 334, 394, -2.499F, -44.675F, 28.0F, 2, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0837F, -43.4243F, 20.0F);
		stock.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.3054F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 40, 327, 0.0F, -0.5F, -8.0F, 1, 3, 16, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-3.0817F, -43.4243F, 20.0F);
		stock.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.3054F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 330, 68, -1.0F, -0.5F, -8.0F, 1, 3, 16, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-3.0737F, -43.716F, 21.0F);
		stock.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.5672F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 328, 394, -1.0F, -0.5F, 7.0F, 2, 1, 1, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 326, 270, -1.0F, -0.5F, -9.0F, 2, 1, 16, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0757F, -43.716F, 21.0F);
		stock.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.5672F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 340, 394, -1.0F, -0.5F, 7.0F, 2, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 326, 253, -1.0F, -0.5F, -9.0F, 2, 1, 16, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-1.499F, -34.9455F, 14.852F);
		stock.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.2618F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 254, 383, -1.0F, -3.5F, -1.0F, 2, 7, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-2.499F, -41.1231F, 15.1178F);
		stock.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.2182F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 384, 285, -1.0F, 2.0F, 3.0F, 4, 1, 1, 0.025F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-2.499F, -39.0231F, 20.3178F);
		stock.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.2182F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 382, 367, -1.0F, 2.0F, 3.0F, 4, 1, 1, -0.025F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 306, 100, -1.0F, 1.5F, -1.0F, 4, 1, 5, -0.025F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-2.499F, -40.0231F, 13.3178F);
		stock.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.1309F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 290, 68, -1.001F, 1.5F, -1.0F, 4, 1, 7, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-1.499F, -33.6773F, 15.9853F);
		stock.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.1309F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 194, 358, -1.0F, 1.5F, -1.0F, 2, 1, 11, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-1.499F, -34.9455F, 14.252F);
		stock.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.3927F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 156, 378, -1.0F, -3.5F, -1.0F, 2, 7, 1, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-1.499F, -35.2955F, 25.377F);
		stock.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.1745F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 200, 377, -2.0F, -3.5F, -1.0F, 4, 7, 1, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(1.5037F, -40.175F, 26.2687F);
		stock.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.3054F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 268, 370, -2.0F, -3.5F, -1.5F, 1, 9, 3, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-1.6405F, -40.175F, 27.1708F);
		stock.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, -0.3054F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 84, 306, -2.0F, -3.5F, -1.5F, 1, 9, 3, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-3.4814F, -31.7432F, 16.0F);
		stock.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, -0.2618F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 390, 214, 0.0F, -2.0F, 12.0F, 2, 4, 1, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-1.4485F, -32.2608F, 16.0F);
		stock.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, 0.2618F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 390, 181, 0.0F, -2.0F, 12.0F, 2, 4, 1, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-0.6961F, -28.3861F, 26.5F);
		stock.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, 0.3491F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 384, 10, -2.0F, -3.5F, -1.5F, 2, 2, 3, 0.0F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-0.4225F, -29.0701F, 26.5F);
		stock.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, -0.3491F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 382, 319, -2.0F, -3.5F, -1.5F, 2, 2, 3, 0.0F, false));
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