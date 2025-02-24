package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBZ03_Stock extends ModelBase {
	private final ModelRenderer stock;
	private final ModelRenderer folding;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
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
	private final ModelRenderer cube_r21;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;

	public QBZ03_Stock() {
		textureWidth = 416;
		textureHeight = 416;

		stock = new ModelRenderer(this);
		stock.setRotationPoint(0.0F, 24.8F, 0.0F);
		stock.cubeList.add(new ModelBox(stock, 15, 383, -1.0F, -38.0F, 5.0F, 2, 5, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 205, 391, 0.7F, -38.0F, 5.0F, 1, 5, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 397, 203, -2.05F, -39.25F, 5.0F, 1, 1, 1, 0.0F, false));

		folding = new ModelRenderer(this);
		folding.setRotationPoint(-1.5F, -34.3469F, 14.2548F);
		stock.addChild(folding);
		setRotationAngle(folding, -0.0436F, 0.0F, 0.0F);
		folding.cubeList.add(new ModelBox(folding, 201, 264, -1.5F, -2.7531F, -9.9548F, 3, 2, 30, 0.0F, false));
		folding.cubeList.add(new ModelBox(folding, 227, 353, 1.7071F, -2.046F, -5.9548F, 1, 1, 13, -0.2F, false));
		folding.cubeList.add(new ModelBox(folding, 256, 355, -2.7071F, -2.046F, -5.9548F, 1, 1, 13, -0.2F, false));
		folding.cubeList.add(new ModelBox(folding, 314, 355, 1.7071F, -0.246F, -4.5548F, 1, 1, 13, -0.2F, false));
		folding.cubeList.add(new ModelBox(folding, 285, 355, -2.7071F, -0.246F, -4.5548F, 1, 1, 13, -0.2F, false));
		folding.cubeList.add(new ModelBox(folding, 351, 376, -1.5F, -4.1531F, -10.0548F, 3, 2, 3, 0.0F, false));
		folding.cubeList.add(new ModelBox(folding, 129, 388, -2.2071F, -3.446F, -10.0548F, 1, 2, 3, 0.0F, false));
		folding.cubeList.add(new ModelBox(folding, 388, 57, 1.2071F, -3.446F, -10.0548F, 1, 2, 3, 0.0F, false));
		folding.cubeList.add(new ModelBox(folding, 268, 230, -1.5F, -0.3389F, -9.9548F, 3, 2, 30, 0.0F, false));
		folding.cubeList.add(new ModelBox(folding, 281, 196, -2.2071F, -2.046F, -9.9548F, 1, 3, 30, 0.0F, false));
		folding.cubeList.add(new ModelBox(folding, 268, 263, 1.2071F, -2.046F, -9.9548F, 1, 3, 30, 0.0F, false));
		folding.cubeList.add(new ModelBox(folding, 394, 380, -2.2071F, 1.954F, 6.8452F, 1, 1, 2, 0.0F, false));
		folding.cubeList.add(new ModelBox(folding, 284, 388, -1.5F, 2.6611F, 6.8452F, 3, 1, 2, 0.0F, false));
		folding.cubeList.add(new ModelBox(folding, 374, 394, 1.2071F, 1.954F, 6.8452F, 1, 1, 2, 0.0F, false));
		folding.cubeList.add(new ModelBox(folding, 153, 382, 1.2071F, 0.954F, 2.4452F, 1, 1, 8, 0.0F, false));
		folding.cubeList.add(new ModelBox(folding, 71, 382, -2.2071F, 0.954F, 2.4452F, 1, 1, 8, 0.0F, false));
		folding.cubeList.add(new ModelBox(folding, 397, 194, -2.2071F, 0.954F, 9.6452F, 1, 1, 1, 0.0F, false));
		folding.cubeList.add(new ModelBox(folding, 34, 396, 1.2071F, 0.954F, 9.6452F, 1, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 4.2385F, -15.8126F);
		folding.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 347, 28, -0.5F, -2.5703F, 35.4657F, 1, 6, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 2.4385F, -16.2126F);
		folding.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 265, 370, -0.5F, -2.5703F, 26.4657F, 1, 2, 10, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 3.9141F, -23.6754F);
		folding.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 389, 76, -0.5F, -2.5703F, 33.4657F, 1, 4, 2, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 9.9141F, -16.3754F);
		folding.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 243, 382, -0.5F, -2.5703F, 30.4657F, 1, 2, 6, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, -0.7714F, 8.5796F);
		folding.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.7418F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 198, 391, -0.5F, -1.0F, 3.0F, 1, 2, 2, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 5.2286F, 11.0796F);
		folding.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.7418F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 288, 370, -0.5F, -1.0F, -5.0F, 1, 2, 10, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 2.4649F, 9.3908F);
		folding.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.3185F, -0.3035F, 0.7363F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 258, 383, -1.4571F, 0.6642F, -1.0F, 1, 1, 5, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 271, 383, 0.6642F, -1.4571F, -1.0F, 1, 1, 5, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 2.4649F, 9.3908F);
		folding.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.4363F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 103, 383, -2.2071F, -0.8536F, -1.0F, 1, 1, 5, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 371, 58, -1.5F, -0.1464F, -1.0F, 3, 1, 5, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 116, 383, 1.2071F, -0.8536F, -1.0F, 1, 1, 5, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 2.4469F, 6.0086F);
		folding.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.1745F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 190, 368, -2.2071F, -0.8536F, -10.0F, 1, 1, 11, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 350, 124, -1.5F, -0.1464F, -10.0F, 3, 1, 11, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 215, 368, 1.2071F, -0.8536F, -10.0F, 1, 1, 11, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 2.4469F, 6.0086F);
		folding.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.124F, 0.1231F, 0.7777F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 364, 369, -1.4571F, 0.6642F, -10.0F, 1, 1, 11, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 370, 0.6642F, -1.4571F, -10.0F, 1, 1, 11, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 2.8076F, 7.8452F);
		folding.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 0.7854F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 394, 384, 0.6642F, -1.4571F, -1.0F, 1, 1, 2, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 395, -1.4571F, 0.6642F, -1.0F, 1, 1, 2, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-1.5F, 0.954F, 12.0452F);
		folding.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, 0.7854F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 126, 284, -0.5F, -0.5F, -22.0F, 1, 1, 30, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(1.5F, 0.954F, 12.0452F);
		folding.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, 0.7854F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 285, 159, -0.5F, -0.5F, -22.0F, 1, 1, 30, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-2.2071F, -0.8867F, -6.243F);
		folding.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.3927F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 43, 353, 0.0F, -2.0F, -2.0F, 1, 2, 4, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 43, 360, 3.4142F, -2.0F, -2.0F, 1, 2, 4, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-0.5F, -1.9227F, -6.8963F);
		folding.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.3927F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 44, 383, -1.0F, -2.0F, -1.0F, 3, 2, 4, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.5F, -2.9258F, -5.9396F);
		folding.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.2849F, 0.274F, 0.7459F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 383, 312, 0.2071F, -1.2071F, -1.5F, 1, 1, 4, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-0.5F, -2.9258F, -5.9396F);
		folding.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.2849F, 0.274F, 0.7459F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 383, 382, -1.2071F, 0.2071F, -1.5F, 1, 1, 4, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-1.5F, -3.446F, -9.0548F);
		folding.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, 0.7854F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 389, 66, -0.5F, -0.5F, -1.0F, 1, 1, 3, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(1.5F, -3.446F, -9.0548F);
		folding.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, 0.7854F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 389, 71, -0.5F, -0.5F, -1.0F, 1, 1, 3, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-1.5F, -2.046F, -8.9548F);
		folding.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, 0.7854F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 63, 284, -0.5F, -0.5F, -1.0F, 1, 1, 30, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(1.5F, -2.046F, -8.9548F);
		folding.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, 0.7854F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 284, -0.5F, -0.5F, -1.0F, 1, 1, 30, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-0.0065F, -1.4699F, 20.8109F);
		folding.addChild(bone);
		setRotationAngle(bone, -3.1416F, 0.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 228, 382, -2.4935F, -7.7035F, -1.0F, 5, 8, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 142, 384, -1.5013F, -0.0427F, -1.0F, 3, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 189, 291, -1.5013F, -10.6427F, -1.0F, 3, 3, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 344, 391, -0.8843F, -11.2718F, -1.0F, 1, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 21, 392, -0.1027F, -11.2718F, -1.0F, 1, 1, 2, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(1.8793F, -6.4598F, -36.4657F);
		bone.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, 1.2654F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 386, 281, -3.9976F, -0.9722F, 35.4657F, 3, 1, 2, 0.0F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-0.8843F, -8.9944F, -36.4657F);
		bone.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, 0.7854F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 243, 391, -1.6104F, -1.6104F, 35.4657F, 1, 1, 2, 0.0F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-1.8663F, -6.4598F, -36.4657F);
		bone.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, 0.3054F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 350, 291, -0.9722F, -3.9976F, 35.4657F, 1, 3, 2, 0.0F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(0.8973F, -8.9944F, -36.4657F);
		bone.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.0F, 0.7854F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 250, 391, -1.6104F, -1.6104F, 35.4657F, 1, 1, 2, 0.0F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-1.8819F, 2.1933F, -36.4657F);
		bone.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, 1.2654F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 35, 392, -1.9976F, -0.9722F, 35.4657F, 1, 1, 2, 0.0F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(1.8793F, 2.1933F, -36.4657F);
		bone.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, 0.0F, 0.3054F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 28, 392, -0.9722F, -1.9976F, 35.4657F, 1, 1, 2, 0.0F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-1.5013F, 2.8205F, -36.4657F);
		bone.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, 0.0F, 0.7854F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 210, 391, -1.6104F, -1.6104F, 35.4657F, 1, 1, 2, 0.0F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(1.4987F, 2.8205F, -36.4657F);
		bone.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.0F, 0.0F, 0.7854F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 217, 391, -1.6104F, -1.6104F, 35.4657F, 1, 1, 2, 0.0F, false));
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