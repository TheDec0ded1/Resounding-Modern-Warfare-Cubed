package com.paneedah.mwc.models;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBZ191Stock extends ModelBase {
	private final ModelRenderer stock;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer buttpad;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;
	private final ModelRenderer cube_r34;

	public QBZ191Stock() {
		textureWidth = 400;
		textureHeight = 400;

		stock = new ModelRenderer(this);
		stock.setRotationPoint(0.0F, 23.7F, 6.0F);
		stock.cubeList.add(new ModelBox(stock, 306, 309, -3.8694F, -37.2123F, 7.0F, 1, 2, 24, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 320, 281, -0.1336F, -37.2123F, 7.0F, 1, 2, 24, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 0, 282, -3.0F, -34.8F, 7.0F, 3, 3, 24, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 372, 247, -3.0F, -25.9612F, 25.2317F, 3, 3, 6, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-2.0F, -31.8F, 17.1F);
		stock.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.7854F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 106, 301, -1.0F, -2.5F, -1.0F, 3, 3, 13, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-2.5F, -30.4112F, 26.8817F);
		stock.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.1745F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 256, 298, 0.0F, -2.3F, 3.0F, 2, 8, 2, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-1.5F, -31.7112F, 26.2817F);
		stock.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.1745F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 292, 192, -1.0F, -1.0F, -1.5F, 2, 2, 3, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-1.041F, -33.7981F, 8.0F);
		stock.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.7854F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 256, 309, -1.0F, -3.0F, -1.0F, 1, 2, 24, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.8664F, -33.7981F, 8.0F);
		stock.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.7854F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 138, 300, -1.0F, -2.0F, -1.0F, 2, 1, 24, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(1.5735F, -36.5052F, 8.0F);
		stock.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -0.7854F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 309, -1.0F, -3.0F, -1.0F, 1, 2, 24, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-1.7481F, -36.5052F, 8.0F);
		stock.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.7854F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 204, 298, -1.0F, -2.0F, -1.0F, 2, 1, 24, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-1.828F, -38.3F, 8.0F);
		stock.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -0.3054F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 106, 325, -0.5F, -0.5F, -1.0F, 1, 1, 24, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-1.175F, -38.3F, 8.0F);
		stock.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, 0.3054F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 190, 323, -0.5F, -0.5F, -1.0F, 1, 1, 24, 0.0F, false));

		buttpad = new ModelRenderer(this);
		buttpad.setRotationPoint(0.0F, 0.3F, -6.0F);
		stock.addChild(buttpad);
		buttpad.cubeList.add(new ModelBox(buttpad, 382, 265, -2.5F, -39.75F, 37.0F, 2, 2, 2, 0.0F, false));
		buttpad.cubeList.add(new ModelBox(buttpad, 138, 274, -0.768F, -38.75F, 37.0F, 2, 15, 2, 0.0F, false));
		buttpad.cubeList.add(new ModelBox(buttpad, 190, 300, -4.2321F, -38.75F, 37.0F, 2, 15, 2, 0.0F, false));
		buttpad.cubeList.add(new ModelBox(buttpad, 146, 350, -2.5F, -37.75F, 37.0F, 2, 15, 2, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-3.366F, -23.25F, 38.0F);
		buttpad.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, 0.5236F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 322, 389, -1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.366F, -23.25F, 38.0F);
		buttpad.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, -0.5236F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 314, 389, -1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-2.366F, -37.5179F, 38.0F);
		buttpad.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, -0.5236F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 306, 389, -1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-0.634F, -37.5179F, 38.0F);
		buttpad.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, 0.5236F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 298, 389, -1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-1.5F, -24.85F, 39.3F);
		buttpad.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.7854F, 0.0F, 0.0F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 288, 389, -2.0F, -2.0F, 0.0F, 4, 1, 1, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-1.5F, -23.85F, 39.3F);
		buttpad.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.7854F, 0.0F, 0.0F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 242, 389, -2.0F, -2.0F, 0.0F, 4, 1, 1, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-1.5F, -22.85F, 39.3F);
		buttpad.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.7854F, 0.0F, 0.0F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 388, 374, -2.0F, -2.0F, 0.0F, 4, 1, 1, 0.0F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-1.5F, -28.85F, 39.3F);
		buttpad.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.7854F, 0.0F, 0.0F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 388, 372, -2.0F, -2.0F, 0.0F, 4, 1, 1, 0.0F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-1.5F, -27.85F, 39.3F);
		buttpad.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.7854F, 0.0F, 0.0F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 386, 333, -2.0F, -2.0F, 0.0F, 4, 1, 1, 0.0F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-1.5F, -26.85F, 39.3F);
		buttpad.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.7854F, 0.0F, 0.0F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 386, 331, -2.0F, -2.0F, 0.0F, 4, 1, 1, 0.0F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-1.5F, -25.85F, 39.3F);
		buttpad.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.7854F, 0.0F, 0.0F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 386, 199, -2.0F, -2.0F, 0.0F, 4, 1, 1, 0.0F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(-1.5F, -32.85F, 39.3F);
		buttpad.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.7854F, 0.0F, 0.0F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 386, 97, -2.0F, -2.0F, 0.0F, 4, 1, 1, 0.0F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-1.5F, -31.85F, 39.3F);
		buttpad.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.7854F, 0.0F, 0.0F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 358, 373, -2.0F, -2.0F, 0.0F, 4, 1, 1, 0.0F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(-1.5F, -30.85F, 39.3F);
		buttpad.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.7854F, 0.0F, 0.0F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 372, 184, -2.0F, -2.0F, 0.0F, 4, 1, 1, 0.0F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(-1.5F, -29.85F, 39.3F);
		buttpad.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.7854F, 0.0F, 0.0F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 90, 371, -2.0F, -2.0F, 0.0F, 4, 1, 1, 0.0F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(-1.5F, -33.85F, 39.3F);
		buttpad.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.7854F, 0.0F, 0.0F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 340, 307, -2.0F, -2.0F, 0.0F, 4, 1, 1, 0.0F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(-1.5F, -34.85F, 39.3F);
		buttpad.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.7854F, 0.0F, 0.0F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 330, 307, -2.0F, -2.0F, 0.0F, 4, 1, 1, 0.0F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(-1.5F, -35.85F, 39.3F);
		buttpad.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.7854F, 0.0F, 0.0F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 320, 307, -2.0F, -2.0F, 0.0F, 4, 1, 1, 0.0F, false));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(-1.5F, -36.85F, 39.3F);
		buttpad.addChild(cube_r34);
		setRotationAngle(cube_r34, 0.7854F, 0.0F, 0.0F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 294, 162, -2.0F, -2.0F, 0.0F, 4, 1, 1, 0.0F, false));
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