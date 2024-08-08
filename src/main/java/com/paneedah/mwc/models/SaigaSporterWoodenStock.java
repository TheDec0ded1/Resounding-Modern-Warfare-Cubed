package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SaigaSporterWoodenStock extends ModelBase {
	private final ModelRenderer wooden_stock;
	private final ModelRenderer stock44_r4_r1;
	private final ModelRenderer stock55_r5_r1;
	private final ModelRenderer stock66_r6_r1;
	private final ModelRenderer stock55_r5_r2;
	private final ModelRenderer stock44_r4_r2;
	private final ModelRenderer stock66_r6_r2;
	private final ModelRenderer stock29_r2;
	private final ModelRenderer stock28_r3;
	private final ModelRenderer stock28_r4;
	private final ModelRenderer stock27_r2;
	private final ModelRenderer gun463_r2;
	private final ModelRenderer stock24_r9;
	private final ModelRenderer stock10_r2;
	private final ModelRenderer stock8_r3;
	private final ModelRenderer stock17_r5;
	private final ModelRenderer stock24_r10;
	private final ModelRenderer stock24_r11;
	private final ModelRenderer stock24_r12;
	private final ModelRenderer stock24_r13;
	private final ModelRenderer stock24_r14;
	private final ModelRenderer stock24_r15;
	private final ModelRenderer stock2_r4;
	private final ModelRenderer stock17_r6;
	private final ModelRenderer stock24_r16;
	private final ModelRenderer stock23_r2;
	private final ModelRenderer stock18_r2;
	private final ModelRenderer stock17_r7;
	private final ModelRenderer stock17_r8;
	private final ModelRenderer stock15_r2;
	private final ModelRenderer stock14_r2;
	private final ModelRenderer stock5_r2;
	private final ModelRenderer stock9_r2;
	private final ModelRenderer stock8_r4;
	private final ModelRenderer stock2_r5;
	private final ModelRenderer stock2_r6;
	private final ModelRenderer stock6_r2;

	public SaigaSporterWoodenStock() {
		textureWidth = 512;
		textureHeight = 512;

		wooden_stock = new ModelRenderer(this);
		wooden_stock.setRotationPoint(-0.5F, -53.7488F, 30.0807F);
		wooden_stock.cubeList.add(new ModelBox(wooden_stock, 25, 86, -1.1F, 45.2988F, -20.7807F, 1, 1, 5, 0.0F, false));
		wooden_stock.cubeList.add(new ModelBox(wooden_stock, 83, 73, -1.9F, 45.2988F, -20.7807F, 1, 1, 5, 0.0F, false));
		wooden_stock.cubeList.add(new ModelBox(wooden_stock, 171, 69, -2.0F, 42.997F, -16.0282F, 2, 1, 11, 0.0F, false));
		wooden_stock.cubeList.add(new ModelBox(wooden_stock, 26, 56, -0.2346F, 44.8448F, -16.0282F, 1, 2, 12, 0.0F, false));
		wooden_stock.cubeList.add(new ModelBox(wooden_stock, 26, 31, -2.7654F, 44.8448F, -16.0282F, 1, 2, 12, 0.0F, false));

		stock44_r4_r1 = new ModelRenderer(this);
		stock44_r4_r1.setRotationPoint(-1.0F, 45.5637F, -0.1382F);
		wooden_stock.addChild(stock44_r4_r1);
		setRotationAngle(stock44_r4_r1, -0.3927F, 0.0F, 0.0F);
		stock44_r4_r1.cubeList.add(new ModelBox(stock44_r4_r1, 114, 155, -1.0F, -0.5F, -5.5F, 2, 1, 11, 0.0F, false));

		stock55_r5_r1 = new ModelRenderer(this);
		stock55_r5_r1.setRotationPoint(-1.9207F, 46.3321F, -0.5148F);
		wooden_stock.addChild(stock55_r5_r1);
		setRotationAngle(stock55_r5_r1, -0.1766F, -0.4011F, -1.1421F);
		stock55_r5_r1.cubeList.add(new ModelBox(stock55_r5_r1, 171, 56, -1.0F, -0.5F, -5.5F, 2, 1, 11, 0.0F, false));

		stock66_r6_r1 = new ModelRenderer(this);
		stock66_r6_r1.setRotationPoint(-0.0793F, 46.3321F, -0.5148F);
		wooden_stock.addChild(stock66_r6_r1);
		setRotationAngle(stock66_r6_r1, -0.1766F, 0.4011F, 1.1421F);
		stock66_r6_r1.cubeList.add(new ModelBox(stock66_r6_r1, 141, 155, -1.0F, -0.5F, -5.5F, 2, 1, 11, 0.0F, false));

		stock55_r5_r2 = new ModelRenderer(this);
		stock55_r5_r2.setRotationPoint(-0.0793F, 44.1122F, -10.5282F);
		wooden_stock.addChild(stock55_r5_r2);
		setRotationAngle(stock55_r5_r2, 0.0F, 0.0F, 1.1781F);
		stock55_r5_r2.cubeList.add(new ModelBox(stock55_r5_r2, 74, 184, -1.0F, -0.5F, -5.5F, 2, 1, 11, 0.0F, false));

		stock44_r4_r2 = new ModelRenderer(this);
		stock44_r4_r2.setRotationPoint(-1.9207F, 44.1122F, -10.5282F);
		wooden_stock.addChild(stock44_r4_r2);
		setRotationAngle(stock44_r4_r2, 0.0F, 0.0F, -1.1781F);
		stock44_r4_r2.cubeList.add(new ModelBox(stock44_r4_r2, 0, 186, -1.0F, -0.5F, -5.5F, 2, 1, 11, 0.0F, false));

		stock66_r6_r2 = new ModelRenderer(this);
		stock66_r6_r2.setRotationPoint(0.2654F, 48.1137F, -0.7939F);
		wooden_stock.addChild(stock66_r6_r2);
		setRotationAngle(stock66_r6_r2, -0.4363F, 0.0F, 0.0F);
		stock66_r6_r2.cubeList.add(new ModelBox(stock66_r6_r2, 9, 149, -3.05F, -1.0F, -4.0F, 1, 2, 3, 0.0F, false));
		stock66_r6_r2.cubeList.add(new ModelBox(stock66_r6_r2, 57, 149, -0.5F, -1.0F, -4.0F, 1, 2, 3, 0.0F, false));

		stock29_r2 = new ModelRenderer(this);
		stock29_r2.setRotationPoint(0.0F, 0.0F, -0.3F);
		wooden_stock.addChild(stock29_r2);
		setRotationAngle(stock29_r2, -1.8589F, 0.0F, 0.0F);
		stock29_r2.cubeList.add(new ModelBox(stock29_r2, 26, 46, -3.1F, -22.7F, 47.1F, 4, 2, 3, 0.1F, false));

		stock28_r3 = new ModelRenderer(this);
		stock28_r3.setRotationPoint(0.0F, 62.0415F, -46.4761F);
		wooden_stock.addChild(stock28_r3);
		setRotationAngle(stock28_r3, -0.1164F, 0.0F, 0.0F);
		stock28_r3.cubeList.add(new ModelBox(stock28_r3, 244, 220, -1.103F, -18.7F, 35.0F, 2, 4, 16, 0.0F, false));
		stock28_r3.cubeList.add(new ModelBox(stock28_r3, 130, 170, -2.897F, -18.7F, 35.0F, 2, 4, 16, 0.0F, false));

		stock28_r4 = new ModelRenderer(this);
		stock28_r4.setRotationPoint(0.0F, 62.0415F, -46.4761F);
		wooden_stock.addChild(stock28_r4);
		setRotationAngle(stock28_r4, -0.3346F, 0.0F, 0.0F);
		stock28_r4.cubeList.add(new ModelBox(stock28_r4, 200, 148, -1.1F, -25.8F, 24.5F, 2, 4, 22, 0.0F, false));
		stock28_r4.cubeList.add(new ModelBox(stock28_r4, 160, 196, -2.9F, -25.8F, 24.5F, 2, 4, 22, 0.0F, false));

		stock27_r2 = new ModelRenderer(this);
		stock27_r2.setRotationPoint(0.0F, 62.0415F, -46.7761F);
		wooden_stock.addChild(stock27_r2);
		setRotationAngle(stock27_r2, -0.3346F, 0.0F, 0.0F);
		stock27_r2.cubeList.add(new ModelBox(stock27_r2, 57, 155, -2.1F, -21.9F, 46.5F, 2, 1, 2, 0.1F, false));
		stock27_r2.cubeList.add(new ModelBox(stock27_r2, 11, 17, -3.1F, -24.9F, 46.5F, 4, 3, 2, 0.1F, false));

		gun463_r2 = new ModelRenderer(this);
		gun463_r2.setRotationPoint(0.0F, 62.4594F, -51.249F);
		wooden_stock.addChild(gun463_r2);
		setRotationAngle(gun463_r2, -0.4461F, 0.0F, 0.0F);
		gun463_r2.cubeList.add(new ModelBox(gun463_r2, 0, 86, -2.9F, -28.5F, 13.6F, 1, 3, 8, 0.0F, false));

		stock24_r9 = new ModelRenderer(this);
		stock24_r9.setRotationPoint(-2.0F, 67.6059F, -44.1096F);
		wooden_stock.addChild(stock24_r9);
		setRotationAngle(stock24_r9, -0.1487F, 0.0F, 0.0F);
		stock24_r9.cubeList.add(new ModelBox(stock24_r9, 57, 114, -0.9F, -27.0F, 24.6F, 2, 2, 23, 0.0F, false));
		stock24_r9.cubeList.add(new ModelBox(stock24_r9, 114, 26, 0.9F, -27.0F, 24.6F, 2, 2, 23, 0.0F, false));

		stock10_r2 = new ModelRenderer(this);
		stock10_r2.setRotationPoint(-2.0F, 61.6672F, 13.1233F);
		wooden_stock.addChild(stock10_r2);
		setRotationAngle(stock10_r2, 2.1564F, 0.0F, 0.0F);
		stock10_r2.cubeList.add(new ModelBox(stock10_r2, 0, 56, -0.9F, -20.3F, 25.1F, 1, 4, 2, 0.0F, false));
		stock10_r2.cubeList.add(new ModelBox(stock10_r2, 14, 42, 1.9F, -20.3F, 25.1F, 1, 4, 2, 0.0F, false));
		stock10_r2.cubeList.add(new ModelBox(stock10_r2, 132, 143, 0.0F, -19.3F, 24.1F, 2, 3, 2, 0.0F, false));

		stock8_r3 = new ModelRenderer(this);
		stock8_r3.setRotationPoint(-2.0F, 76.9896F, -27.4551F);
		wooden_stock.addChild(stock8_r3);
		setRotationAngle(stock8_r3, 0.6579F, 0.0F, 0.0F);
		stock8_r3.cubeList.add(new ModelBox(stock8_r3, 57, 41, -0.9F, -19.9F, 22.0F, 1, 6, 2, 0.0F, false));
		stock8_r3.cubeList.add(new ModelBox(stock8_r3, 57, 30, 1.9F, -19.9F, 22.0F, 1, 6, 2, 0.0F, false));

		stock17_r5 = new ModelRenderer(this);
		stock17_r5.setRotationPoint(-2.0F, 36.5701F, -52.2013F);
		wooden_stock.addChild(stock17_r5);
		setRotationAngle(stock17_r5, -1.1719F, 0.0F, 0.0F);
		stock17_r5.cubeList.add(new ModelBox(stock17_r5, 14, 0, -0.89F, -30.4F, 21.5F, 1, 5, 4, 0.0F, false));
		stock17_r5.cubeList.add(new ModelBox(stock17_r5, 0, 0, 1.89F, -30.4F, 21.6F, 1, 5, 4, 0.0F, false));

		stock24_r10 = new ModelRenderer(this);
		stock24_r10.setRotationPoint(0.0F, 67.6059F, -44.1096F);
		wooden_stock.addChild(stock24_r10);
		setRotationAngle(stock24_r10, -0.1055F, -0.105F, -0.7798F);
		stock24_r10.cubeList.add(new ModelBox(stock24_r10, 57, 140, 18.6F, -19.6F, 47.3F, 1, 1, 2, 0.1F, false));
		stock24_r10.cubeList.add(new ModelBox(stock24_r10, 201, 112, 18.6F, -19.6F, 24.2F, 1, 1, 23, 0.0F, false));

		stock24_r11 = new ModelRenderer(this);
		stock24_r11.setRotationPoint(-2.0F, 67.6059F, -44.1096F);
		wooden_stock.addChild(stock24_r11);
		setRotationAngle(stock24_r11, -0.2342F, 0.2465F, 0.7809F);
		stock24_r11.cubeList.add(new ModelBox(stock24_r11, 135, 123, -18.3F, -19.9F, 42.0F, 1, 1, 2, 0.1F, false));
		stock24_r11.cubeList.add(new ModelBox(stock24_r11, 229, 47, -18.3F, -20.1F, 22.2F, 1, 1, 19, 0.0F, false));

		stock24_r12 = new ModelRenderer(this);
		stock24_r12.setRotationPoint(2.0F, 67.6059F, -44.1096F);
		wooden_stock.addChild(stock24_r12);
		setRotationAngle(stock24_r12, -0.2342F, -0.2465F, -0.7809F);
		stock24_r12.cubeList.add(new ModelBox(stock24_r12, 0, 229, 15.9F, -21.6F, 22.4F, 1, 1, 19, 0.0F, false));
		stock24_r12.cubeList.add(new ModelBox(stock24_r12, 135, 114, 15.8F, -21.6F, 42.0F, 1, 1, 2, 0.1F, false));

		stock24_r13 = new ModelRenderer(this);
		stock24_r13.setRotationPoint(2.0F, 67.6059F, -44.1096F);
		wooden_stock.addChild(stock24_r13);
		setRotationAngle(stock24_r13, -0.2877F, -0.3512F, -0.7996F);
		stock24_r13.cubeList.add(new ModelBox(stock24_r13, 135, 114, 17.4F, -21.2F, 5.2F, 1, 1, 7, 0.0F, false));

		stock24_r14 = new ModelRenderer(this);
		stock24_r14.setRotationPoint(-2.0F, 67.6059F, -44.1096F);
		wooden_stock.addChild(stock24_r14);
		setRotationAngle(stock24_r14, -0.2877F, 0.3512F, 0.7996F);
		stock24_r14.cubeList.add(new ModelBox(stock24_r14, 132, 134, -19.6F, -19.5F, 5.2F, 1, 1, 7, 0.0F, false));

		stock24_r15 = new ModelRenderer(this);
		stock24_r15.setRotationPoint(-2.0F, 67.6059F, -44.1096F);
		wooden_stock.addChild(stock24_r15);
		setRotationAngle(stock24_r15, -0.1055F, 0.105F, 0.7798F);
		stock24_r15.cubeList.add(new ModelBox(stock24_r15, 85, 200, -19.6F, -19.6F, 24.2F, 1, 1, 23, 0.0F, false));
		stock24_r15.cubeList.add(new ModelBox(stock24_r15, 132, 134, -19.6F, -19.6F, 47.3F, 1, 1, 2, 0.1F, false));

		stock2_r4 = new ModelRenderer(this);
		stock2_r4.setRotationPoint(-2.0F, 62.386F, -51.5726F);
		wooden_stock.addChild(stock2_r4);
		setRotationAngle(stock2_r4, -0.3734F, -0.2501F, -0.5634F);
		stock2_r4.cubeList.add(new ModelBox(stock2_r4, 114, 84, 15.7F, -23.65F, 13.9F, 1, 1, 8, 0.0F, false));

		stock17_r6 = new ModelRenderer(this);
		stock17_r6.setRotationPoint(-2.0F, 36.5701F, -52.2013F);
		wooden_stock.addChild(stock17_r6);
		setRotationAngle(stock17_r6, -1.2585F, 0.2523F, -0.6582F);
		stock17_r6.cubeList.add(new ModelBox(stock17_r6, 114, 12, -14.49F, -30.4F, 16.1F, 1, 5, 1, 0.0F, false));

		stock24_r16 = new ModelRenderer(this);
		stock24_r16.setRotationPoint(0.0F, 67.6059F, -44.1096F);
		wooden_stock.addChild(stock24_r16);
		setRotationAngle(stock24_r16, -0.4541F, 0.0F, 0.0F);
		stock24_r16.cubeList.add(new ModelBox(stock24_r16, 114, 0, -0.1F, -29.9F, 4.6F, 1, 3, 8, 0.0F, false));

		stock23_r2 = new ModelRenderer(this);
		stock23_r2.setRotationPoint(0.0F, 67.6059F, -44.4096F);
		wooden_stock.addChild(stock23_r2);
		setRotationAngle(stock23_r2, -0.1487F, 0.0F, 0.0F);
		stock23_r2.cubeList.add(new ModelBox(stock23_r2, 9, 155, -2.1F, -27.8F, 47.6F, 2, 1, 2, 0.1F, false));
		stock23_r2.cubeList.add(new ModelBox(stock23_r2, 10, 70, -3.1F, -27.0F, 47.6F, 4, 4, 2, 0.1F, false));

		stock18_r2 = new ModelRenderer(this);
		stock18_r2.setRotationPoint(0.0F, 62.0969F, -46.1477F);
		wooden_stock.addChild(stock18_r2);
		setRotationAngle(stock18_r2, -0.3346F, 0.0F, 0.0F);
		stock18_r2.cubeList.add(new ModelBox(stock18_r2, 221, 24, -2.0F, -21.8F, 25.1F, 2, 1, 21, 0.0F, false));

		stock17_r7 = new ModelRenderer(this);
		stock17_r7.setRotationPoint(0.0F, 36.5701F, -52.2013F);
		wooden_stock.addChild(stock17_r7);
		setRotationAngle(stock17_r7, -1.2585F, -0.2523F, 0.6582F);
		stock17_r7.cubeList.add(new ModelBox(stock17_r7, 114, 26, 13.49F, -30.4F, 16.1F, 1, 5, 1, 0.0F, false));

		stock17_r8 = new ModelRenderer(this);
		stock17_r8.setRotationPoint(0.0F, 36.5701F, -52.2013F);
		wooden_stock.addChild(stock17_r8);
		setRotationAngle(stock17_r8, -1.041F, 0.0F, 0.0F);
		stock17_r8.cubeList.add(new ModelBox(stock17_r8, 119, 159, -1.1F, -27.8F, 24.6F, 1, 4, 1, 0.0F, false));
		stock17_r8.cubeList.add(new ModelBox(stock17_r8, 114, 159, -1.9F, -27.8F, 24.6F, 1, 4, 1, 0.0F, false));

		stock15_r2 = new ModelRenderer(this);
		stock15_r2.setRotationPoint(0.0F, 47.5588F, -52.706F);
		wooden_stock.addChild(stock15_r2);
		setRotationAngle(stock15_r2, -0.7436F, 0.0F, 0.0F);
		stock15_r2.cubeList.add(new ModelBox(stock15_r2, 103, 103, -2.0F, -27.8F, 24.6F, 2, 3, 1, 0.0F, false));

		stock14_r2 = new ModelRenderer(this);
		stock14_r2.setRotationPoint(0.0F, 67.597F, -44.2282F);
		wooden_stock.addChild(stock14_r2);
		setRotationAngle(stock14_r2, -0.1487F, 0.0F, 0.0F);
		stock14_r2.cubeList.add(new ModelBox(stock14_r2, 57, 140, -2.0F, -27.8F, 24.6F, 2, 1, 23, 0.0F, false));

		stock5_r2 = new ModelRenderer(this);
		stock5_r2.setRotationPoint(0.0F, 63.5727F, -6.6733F);
		wooden_stock.addChild(stock5_r2);
		setRotationAngle(stock5_r2, 1.3756F, 0.0F, 0.0F);
		stock5_r2.cubeList.add(new ModelBox(stock5_r2, 67, 88, -2.0F, -25.5F, 12.0F, 2, 4, 1, 0.0F, false));

		stock9_r2 = new ModelRenderer(this);
		stock9_r2.setRotationPoint(0.0F, 67.6401F, 3.1376F);
		wooden_stock.addChild(stock9_r2);
		setRotationAngle(stock9_r2, 1.8589F, 0.0F, 0.0F);
		stock9_r2.cubeList.add(new ModelBox(stock9_r2, 45, 13, -2.0F, -18.2F, 20.3F, 2, 4, 2, 0.0F, false));

		stock8_r4 = new ModelRenderer(this);
		stock8_r4.setRotationPoint(0.0F, 76.9896F, -27.4551F);
		wooden_stock.addChild(stock8_r4);
		setRotationAngle(stock8_r4, 0.4833F, 0.0F, 0.0F);
		stock8_r4.cubeList.add(new ModelBox(stock8_r4, 0, 31, -2.0F, -23.5F, 17.5F, 2, 6, 2, 0.0F, false));

		stock2_r5 = new ModelRenderer(this);
		stock2_r5.setRotationPoint(0.0F, 62.386F, -51.5726F);
		wooden_stock.addChild(stock2_r5);
		setRotationAngle(stock2_r5, -0.3734F, 0.2501F, 0.5634F);
		stock2_r5.cubeList.add(new ModelBox(stock2_r5, 0, 98, -16.7F, -23.65F, 13.9F, 1, 1, 8, 0.0F, false));

		stock2_r6 = new ModelRenderer(this);
		stock2_r6.setRotationPoint(0.0F, 62.386F, -51.5726F);
		wooden_stock.addChild(stock2_r6);
		setRotationAngle(stock2_r6, -0.4461F, 0.0F, 0.0F);
		stock2_r6.cubeList.add(new ModelBox(stock2_r6, 114, 68, -1.1F, -29.25F, 13.6F, 1, 1, 8, 0.0F, false));
		stock2_r6.cubeList.add(new ModelBox(stock2_r6, 114, 58, -1.9F, -29.25F, 13.6F, 1, 1, 8, 0.0F, false));

		stock6_r2 = new ModelRenderer(this);
		stock6_r2.setRotationPoint(0.0F, 67.5481F, -8.6983F);
		wooden_stock.addChild(stock6_r2);
		setRotationAngle(stock6_r2, 1.2269F, 0.0F, 0.0F);
		stock6_r2.cubeList.add(new ModelBox(stock6_r2, 42, 0, -2.0F, -26.5F, 13.0F, 2, 8, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		wooden_stock.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}