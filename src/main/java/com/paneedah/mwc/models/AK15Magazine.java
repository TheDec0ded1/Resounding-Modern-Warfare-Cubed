package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AK15Magazine extends ModelBase {
	private final ModelRenderer ak15Magazine;
	private final ModelRenderer Magazine1;
	private final ModelRenderer Magazine2;
	private final ModelRenderer Magazine3;
	private final ModelRenderer Magazine4;
	private final ModelRenderer Magazine5;
	private final ModelRenderer Magazine6;
	private final ModelRenderer Magazine7;
	private final ModelRenderer Magazine8;
	private final ModelRenderer bone13;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
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
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;

	public AK15Magazine() {
		textureWidth = 416;
		textureHeight = 416;

		ak15Magazine = new ModelRenderer(this);
		ak15Magazine.setRotationPoint(0.0F, 24.0F, 0.0F);
		ak15Magazine.cubeList.add(new ModelBox(ak15Magazine, 342, 373, -0.5F, -32.6627F, -23.0229F, 1, 2, 5, 0.0F, false));
		ak15Magazine.cubeList.add(new ModelBox(ak15Magazine, 355, 373, -3.5F, -32.6627F, -23.0229F, 1, 2, 5, 0.0F, false));
		ak15Magazine.cubeList.add(new ModelBox(ak15Magazine, 249, 398, -2.5F, -31.6627F, -19.0229F, 2, 1, 1, 0.0F, false));

		Magazine1 = new ModelRenderer(this);
		Magazine1.setRotationPoint(-3.5F, -32.0F, -25.0F);
		ak15Magazine.addChild(Magazine1);
		setRotationAngle(Magazine1, -0.1859F, 0.0F, 0.0F);
		Magazine1.cubeList.add(new ModelBox(Magazine1, 113, 308, 0.0F, 0.0F, 0.0F, 4, 8, 7, 0.0F, false));
		Magazine1.cubeList.add(new ModelBox(Magazine1, 13, 374, 0.0F, 1.0F, -2.6F, 4, 2, 3, -0.2F, false));
		Magazine1.cubeList.add(new ModelBox(Magazine1, 124, 373, 0.0F, 2.0F, -2.6F, 4, 4, 3, -0.4F, false));
		Magazine1.cubeList.add(new ModelBox(Magazine1, 28, 374, 0.0F, 4.5F, -2.6F, 4, 2, 3, -0.2F, false));

		Magazine2 = new ModelRenderer(this);
		Magazine2.setRotationPoint(-3.5F, -23.0F, -19.6F);
		ak15Magazine.addChild(Magazine2);
		setRotationAngle(Magazine2, -2.0076F, 0.0F, 0.0F);
		Magazine2.cubeList.add(new ModelBox(Magazine2, 331, 144, 0.0F, 0.0F, 0.0F, 4, 7, 8, 0.0F, false));
		Magazine2.cubeList.add(new ModelBox(Magazine2, 379, 51, 0.0F, 6.7F, 2.15F, 4, 3, 2, -0.2F, false));
		Magazine2.cubeList.add(new ModelBox(Magazine2, 379, 57, 0.0F, 6.7F, 5.65F, 4, 3, 2, -0.2F, false));
		Magazine2.cubeList.add(new ModelBox(Magazine2, 235, 342, 0.0F, 6.7F, -0.35F, 4, 3, 8, -0.4F, false));

		Magazine3 = new ModelRenderer(this);
		Magazine3.setRotationPoint(-3.5F, -10.0F, -27.8F);
		ak15Magazine.addChild(Magazine3);
		setRotationAngle(Magazine3, -2.5281F, 0.0F, 0.0F);
		Magazine3.cubeList.add(new ModelBox(Magazine3, 335, 42, 0.0F, 0.0F, 0.0F, 4, 7, 8, 0.0F, false));
		Magazine3.cubeList.add(new ModelBox(Magazine3, 379, 69, 0.0F, 6.4F, 1.2F, 4, 3, 2, -0.2F, false));
		Magazine3.cubeList.add(new ModelBox(Magazine3, 376, 234, 0.0F, 0.0F, 7.0F, 4, 7, 1, 0.1F, false));

		Magazine4 = new ModelRenderer(this);
		Magazine4.setRotationPoint(-3.5F, -16.0F, -22.8F);
		ak15Magazine.addChild(Magazine4);
		setRotationAngle(Magazine4, -2.2679F, 0.0F, 0.0F);
		Magazine4.cubeList.add(new ModelBox(Magazine4, 339, 324, 0.0F, 0.0F, 0.0F, 4, 7, 8, 0.0F, false));
		Magazine4.cubeList.add(new ModelBox(Magazine4, 379, 63, 0.0F, 6.5F, 3.5F, 4, 3, 2, -0.2F, false));
		Magazine4.cubeList.add(new ModelBox(Magazine4, 50, 342, 0.0F, 6.5F, 0.5F, 4, 3, 8, -0.4F, false));

		Magazine5 = new ModelRenderer(this);
		Magazine5.setRotationPoint(-3.0F, -32.3F, -26.6F);
		ak15Magazine.addChild(Magazine5);
		setRotationAngle(Magazine5, -0.1859F, 0.0F, 0.0F);
		Magazine5.cubeList.add(new ModelBox(Magazine5, 75, 342, 0.0F, 0.0F, -1.0F, 3, 8, 3, 0.0F, false));

		Magazine6 = new ModelRenderer(this);
		Magazine6.setRotationPoint(-3.0F, -25.0F, -26.0F);
		ak15Magazine.addChild(Magazine6);
		setRotationAngle(Magazine6, -2.0076F, 0.0F, 0.0F);
		Magazine6.cubeList.add(new ModelBox(Magazine6, 356, 165, 0.0F, 0.0F, 0.0F, 3, 3, 7, 0.0F, false));

		Magazine7 = new ModelRenderer(this);
		Magazine7.setRotationPoint(-3.0F, -19.0F, -28.7F);
		ak15Magazine.addChild(Magazine7);
		setRotationAngle(Magazine7, -2.2679F, 0.0F, 0.0F);
		Magazine7.cubeList.add(new ModelBox(Magazine7, 235, 363, 0.0F, 0.0F, 0.0F, 3, 3, 6, 0.0F, false));

		Magazine8 = new ModelRenderer(this);
		Magazine8.setRotationPoint(-3.0F, -15.2F, -31.5F);
		ak15Magazine.addChild(Magazine8);
		setRotationAngle(Magazine8, -2.5281F, 0.0F, 0.0F);
		Magazine8.cubeList.add(new ModelBox(Magazine8, 0, 354, 0.0F, 0.0F, 0.0F, 3, 3, 8, 0.0F, false));
		Magazine8.cubeList.add(new ModelBox(Magazine8, 98, 391, 0.0F, 0.0F, 6.975F, 3, 3, 1, 0.1F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(-1.5F, -28.0F, -21.9F);
		ak15Magazine.addChild(bone13);
		bone13.cubeList.add(new ModelBox(bone13, 354, 67, -2.5F, 1.7F, -4.3F, 5, 1, 7, -0.3F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 17.2223F, -10.8852F);
		bone13.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.9599F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 236, 192, -2.5F, -4.4731F, 2.3536F, 5, 3, 1, -0.3F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 17.9475F, -11.2265F);
		bone13.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.9599F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 380, 264, -2.5F, -4.6769F, 0.1464F, 5, 3, 1, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 386, 231, -2.5F, -3.3769F, -1.4536F, 5, 1, 1, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 46, 383, -2.5F, -3.0769F, -1.4536F, 5, 2, 1, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 249, 192, -2.5F, -3.0269F, -3.3536F, 5, 3, 1, -0.3F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 12.75F, -6.162F);
		bone13.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.6545F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 373, -2.5F, -4.3383F, 2.4424F, 5, 8, 1, -0.3F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 13.072F, -6.1851F);
		bone13.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.6545F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 380, 259, -2.5F, -0.6617F, 0.3576F, 5, 3, 1, -0.3F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 383, 12, -2.5F, 0.4133F, -1.5424F, 5, 2, 1, -0.3F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 381, 48, -2.5F, 1.8133F, -1.5424F, 5, 1, 1, -0.3F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 380, 254, -2.5F, -3.9617F, 0.3576F, 5, 3, 1, -0.3F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 383, 8, -2.5F, -2.4617F, -1.5424F, 5, 2, 1, -0.3F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 181, 36, -2.5F, -2.8617F, -1.5424F, 5, 2, 1, -0.3F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 308, 273, -2.5F, -3.1617F, -3.4424F, 5, 7, 1, -0.3F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 2.7093F, 6.29F);
		bone13.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.4363F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 143, 372, -2.5F, 3.4F, -3.8F, 5, 8, 1, -0.3F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, -2.2667F, -4.5031F);
		bone13.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.4363F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 373, 209, -2.5F, 4.525F, 2.2F, 5, 7, 1, -0.3F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 383, 0, -2.5F, 5.925F, 4.25F, 5, 2, 1, -0.3F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 380, 249, -2.5F, 7.775F, 6.15F, 5, 3, 1, -0.3F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 378, 287, -2.5F, 9.925F, 4.25F, 5, 1, 1, -0.3F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 383, 4, -2.5F, 8.525F, 4.25F, 5, 2, 1, -0.3F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 383, -2.5F, 5.325F, 4.25F, 5, 2, 1, -0.3F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 186, 380, -2.5F, 4.575F, 6.15F, 5, 3, 1, -0.3F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.0F, 10.6148F, -4.1162F);
		bone13.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.3403F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 166, 36, -2.5F, 1.6F, 0.4F, 5, 1, 2, -0.3F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 276, 184, -2.5F, 1.6F, -4.3F, 5, 1, 6, -0.3F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.0F, 10.6148F, -4.1162F);
		bone13.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.4276F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 358, 134, -2.5F, 4.8F, -4.1F, 5, 1, 6, -0.3F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 175, 116, -2.5F, 4.8F, -4.7F, 5, 1, 2, -0.3F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.0F, 16.8298F, -10.2009F);
		bone13.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.6021F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 282, 386, -2.5F, -0.5F, -3.0F, 5, 1, 1, -0.3F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 360, 0, -2.5F, -0.5F, -2.6F, 5, 1, 6, -0.3F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.0F, 10.6148F, -4.1162F);
		bone13.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.2531F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 355, 260, -2.5F, 5.4F, -6.5F, 5, 1, 7, -0.3F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.0F, 10.6148F, -4.1162F);
		bone13.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.1658F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 355, 251, -2.5F, 2.3F, -5.3F, 5, 1, 7, -0.3F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.0F, 10.6148F, -4.1162F);
		bone13.addChild(cube_r18);
		setRotationAngle(cube_r18, -0.1222F, 0.0F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 164, 355, -2.5F, -0.6F, -3.7F, 5, 1, 7, -0.3F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.0F, 7.5297F, -2.4662F);
		bone13.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.2531F, 0.0F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 139, 355, -2.5F, 1.9F, -4.325F, 5, 1, 7, -0.3F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 235, 354, -2.5F, -1.1F, -3.725F, 5, 1, 7, -0.3F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.0F, 7.5297F, -2.4662F);
		bone13.addChild(cube_r20);
		setRotationAngle(cube_r20, -0.0785F, 0.0F, 0.0F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 191, 354, -2.5F, -0.3F, -3.925F, 5, 1, 7, -0.3F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(0.0F, 4.8596F, -1.7024F);
		bone13.addChild(cube_r21);
		setRotationAngle(cube_r21, -0.0349F, 0.0F, 0.0F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 354, 58, -2.5F, -0.5F, -3.35F, 5, 1, 7, -0.3F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone13.addChild(cube_r22);
		setRotationAngle(cube_r22, -0.2182F, 0.0F, 0.0F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 368, 373, -2.5F, -1.6F, -3.8F, 5, 6, 1, -0.3F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 375, 197, -2.5F, 1.65F, 0.2F, 5, 3, 1, -0.3F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 382, 382, -2.5F, 2.375F, -1.7F, 5, 2, 1, -0.3F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 223, 192, -2.5F, -1.2F, -1.7F, 5, 3, 1, -0.3F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 360, 130, -2.5F, -0.6F, 0.2F, 5, 2, 1, -0.3F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 56, 376, -2.5F, -0.475F, 2.2F, 5, 5, 1, -0.3F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 114, 354, -2.5F, 3.7F, -3.8F, 5, 1, 7, -0.3F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 333, 134, -2.5F, 0.8F, -3.8F, 5, 1, 7, -0.3F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-1.8815F, -1.4508F, 0.168F);
		bone13.addChild(cube_r23);
		setRotationAngle(cube_r23, -0.3873F, 0.0665F, 0.1615F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 53, 250, -0.5F, -1.0F, -3.5F, 1, 2, 7, -0.3F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-5.8147F, 0.9411F, -0.3898F);
		bone13.addChild(cube_r24);
		setRotationAngle(cube_r24, -0.3873F, -0.0665F, -0.1615F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 297, 216, 7.5F, -2.05F, -3.9F, 1, 2, 7, -0.3F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone13.addChild(cube_r25);
		setRotationAngle(cube_r25, -0.3927F, 0.0F, 0.0F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 283, 273, -2.5F, -1.05F, -3.9F, 5, 1, 7, -0.3F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ak15Magazine.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}