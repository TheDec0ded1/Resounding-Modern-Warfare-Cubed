package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class OSV96Stock extends ModelBase {
	private final ModelRenderer stock;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;

	public OSV96Stock() {
		textureWidth = 688;
		textureHeight = 688;

		stock = new ModelRenderer(this);
		stock.setRotationPoint(0.0F, 24.0F, 0.0F);
		stock.cubeList.add(new ModelBox(stock, 608, 256, -3.0F, -44.35F, 17.8F, 3, 1, 21, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 120, 649, -3.5F, -33.35F, 17.8F, 4, 1, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 286, 634, -2.0203F, -37.5683F, 17.8F, 3, 1, 18, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 224, 635, -3.9797F, -37.5683F, 17.8F, 2, 1, 18, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 656, 573, -3.9797F, -29.5683F, 33.675F, 2, 1, 5, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 656, 216, -2.0203F, -29.5683F, 33.675F, 3, 1, 5, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 368, 598, 0.6868F, -43.2754F, 17.8F, 1, 6, 21, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 242, 608, -4.6868F, -43.2754F, 17.8F, 1, 6, 21, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 62, 643, -4.6868F, -37.2754F, 35.75F, 1, 8, 4, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 520, 650, 0.6868F, -37.2754F, 35.75F, 1, 8, 4, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 592, 667, 0.6868F, -30.2754F, 34.2F, 1, 1, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 598, 667, -4.6868F, -30.2754F, 34.2F, 1, 1, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 584, 455, -1.7929F, -37.0571F, 17.8F, 3, 4, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 298, 665, -4.2071F, -37.0571F, 17.8F, 3, 4, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 224, 654, -4.0F, -44.55F, 38.8F, 5, 16, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 524, 457, -4.0F, -29.1358F, 38.8F, 5, 1, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 286, 608, 0.7071F, -43.8429F, 38.8F, 1, 15, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 568, 646, -4.7071F, -43.8429F, 38.8F, 1, 15, 2, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.3536F, -28.4893F, 19.8F);
		stock.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 622, 667, -1.0F, -0.5F, 19.0F, 1, 1, 2, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-4.3536F, -28.4893F, 19.8F);
		stock.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.7854F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 616, 667, 0.0F, -0.5F, 19.0F, 1, 1, 2, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(1.3536F, -43.4893F, 19.8F);
		stock.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 610, 667, -1.0F, -0.5F, 19.0F, 1, 1, 2, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.5F, -38.6452F, 45.2801F);
		stock.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.3927F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 506, 456, -3.0F, -7.175F, -2.575F, 6, 1, 3, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-1.5F, -28.2912F, 41.5325F);
		stock.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.3927F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 618, 532, -2.5F, -0.5F, -1.0F, 5, 1, 1, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-4.3536F, -43.4893F, 19.8F);
		stock.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.7854F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 604, 667, 0.0F, -0.5F, 19.0F, 1, 1, 2, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-3.5747F, -43.391F, 18.8F);
		stock.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.5672F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 608, 345, -1.0F, -0.5F, -1.0F, 2, 1, 21, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.5747F, -43.391F, 18.8F);
		stock.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 0.5672F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 608, 323, -1.0F, -0.5F, -1.0F, 2, 1, 21, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.5F, -30.9358F, 18.8F);
		stock.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -0.7854F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 44, 670, 1.0F, -2.0F, -1.0F, 1, 1, 1, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-3.5F, -30.9358F, 18.8F);
		stock.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.7854F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 40, 670, 1.0F, -2.0F, -1.0F, 1, 1, 1, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-1.5F, -31.1077F, 35.0824F);
		stock.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.9163F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 324, 665, 2.1868F, -0.5F, -1.0F, 1, 2, 3, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 316, 665, -3.1868F, -0.5F, -1.0F, 1, 2, 3, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-1.5F, -31.8718F, 34.9079F);
		stock.addChild(cube_r15);
		setRotationAngle(cube_r15, -2.397F, -0.5956F, 0.5468F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 666, 105, 1.3266F, 1.1802F, -1.5F, 1, 1, 3, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 666, 101, -2.1802F, -2.3266F, -1.5F, 1, 1, 3, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-1.5F, -31.8718F, 34.9079F);
		stock.addChild(cube_r16);
		setRotationAngle(cube_r16, -2.2253F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 182, 658, -0.5203F, -0.3965F, -1.5F, 3, 1, 3, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 662, 528, -2.4797F, -0.3965F, -1.5F, 2, 1, 3, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-1.5F, -24.5492F, 34.1195F);
		stock.addChild(cube_r17);
		setRotationAngle(cube_r17, -1.5708F, -0.7854F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 520, 667, 1.3266F, 1.1802F, -6.5F, 1, 1, 2, 0.0F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 182, 667, -2.1802F, -2.3266F, -6.5F, 1, 1, 2, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-1.5F, -24.5492F, 34.1195F);
		stock.addChild(cube_r18);
		setRotationAngle(cube_r18, -1.5708F, 0.0F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 306, 665, -0.5203F, -0.3964F, -6.5F, 3, 1, 2, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 666, 121, -2.4797F, -0.3964F, -6.5F, 2, 1, 2, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-1.5F, -31.0683F, 35.6536F);
		stock.addChild(cube_r19);
		setRotationAngle(cube_r19, -1.5708F, -0.7854F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 656, 585, -2.1802F, -2.3266F, -6.5F, 1, 1, 5, 0.0F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 656, 579, 1.3266F, 1.1802F, -6.5F, 1, 1, 5, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-1.5F, -31.0683F, 35.6536F);
		stock.addChild(cube_r20);
		setRotationAngle(cube_r20, -1.5708F, 0.0F, 0.0F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 656, 553, -2.4797F, -0.3964F, -6.5F, 2, 1, 5, 0.0F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 654, 361, -0.5203F, -0.3964F, -6.5F, 3, 1, 5, 0.0F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(0.9797F, -27.1541F, 34.75F);
		stock.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, -0.7854F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 612, 656, 1.0F, -2.0F, -0.55F, 1, 1, 5, 0.0F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-3.9797F, -27.1541F, 35.225F);
		stock.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.0F, -0.7854F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 600, 656, 1.0F, -2.0F, -1.0F, 1, 1, 5, 0.0F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-3.9797F, -35.1541F, 18.8F);
		stock.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, -0.7854F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 482, 650, 1.0F, -2.0F, -1.0F, 1, 1, 18, 0.0F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(0.9797F, -35.1541F, 18.8F);
		stock.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, 0.0F, -0.7854F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 444, 650, 1.0F, -2.0F, -1.0F, 1, 1, 18, 0.0F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-1.5F, -35.549F, 21.3409F);
		stock.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.5236F, 0.0F, 0.0F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 654, 314, -1.0F, -2.5F, -3.2F, 2, 3, 6, 0.0F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 592, 523, -2.0F, 0.5F, -3.8F, 4, 1, 9, 0.0F, false));
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