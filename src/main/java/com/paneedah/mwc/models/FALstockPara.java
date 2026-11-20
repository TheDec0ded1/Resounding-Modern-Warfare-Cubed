package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FALstockPara extends ModelBase {
	private final ModelRenderer foldingstock;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer stock2;
	private final ModelRenderer oops_r1;
	private final ModelRenderer oops_r2;
	private final ModelRenderer oops_r3;
	private final ModelRenderer oops_r4;
	private final ModelRenderer oops_r5;
	private final ModelRenderer oops_r6;
	private final ModelRenderer oops_r7;
	private final ModelRenderer stock_r1;
	private final ModelRenderer stock_r2;
	private final ModelRenderer stock_r3;
	private final ModelRenderer stock_r4;
	private final ModelRenderer stock_r5;
	private final ModelRenderer stock_r6;
	private final ModelRenderer stock_r7;
	private final ModelRenderer stock_r8;
	private final ModelRenderer stock_r9;
	private final ModelRenderer stock_r10;
	private final ModelRenderer stock_r11;
	private final ModelRenderer stock_r12;
	private final ModelRenderer stock_r13;
	private final ModelRenderer stock_r14;
	private final ModelRenderer stock_r15;
	private final ModelRenderer stock_r16;
	private final ModelRenderer stock_r17;
	private final ModelRenderer stock_r18;
	private final ModelRenderer stock_r19;
	private final ModelRenderer stock_r20;
	private final ModelRenderer stock_r21;
	private final ModelRenderer stock_r22;
	private final ModelRenderer stock_r23;

	public FALstockPara() {
		textureWidth = 624;
		textureHeight = 624;

		foldingstock = new ModelRenderer(this);
		foldingstock.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.1F, -35.5856F, 9.064F);
		foldingstock.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.0968F, -0.0883F, -0.7375F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 272, 600, -1.8F, -4.0F, -2.0F, 2, 2, 3, -0.01F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.7F, -36.6856F, 9.064F);
		foldingstock.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.1309F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 222, 600, -1.8F, -4.0F, -2.0F, 2, 2, 3, -0.01F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 466, 515, -2.601F, -2.0F, -1.004F, 1, 7, 2, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 548, 406, -1.998F, -2.0F, -1.0F, 3, 7, 2, 0.0F, false));

		stock2 = new ModelRenderer(this);
		stock2.setRotationPoint(-1.5F, -31.4458F, 31.6758F);
		foldingstock.addChild(stock2);
		

		oops_r1 = new ModelRenderer(this);
		oops_r1.setRotationPoint(0.5068F, 1.3339F, -4.5965F);
		stock2.addChild(oops_r1);
		setRotationAngle(oops_r1, -0.0062F, 0.0062F, 0.7854F);
		oops_r1.cubeList.add(new ModelBox(oops_r1, 150, 610, 1.0078F, 3.1388F, 10.5657F, 1, 1, 1, 0.0F, false));
		oops_r1.cubeList.add(new ModelBox(oops_r1, 84, 610, 2.4221F, 1.7246F, 10.5657F, 1, 1, 1, 0.0F, false));
		oops_r1.cubeList.add(new ModelBox(oops_r1, 80, 610, 2.4221F, 4.553F, 10.5657F, 1, 1, 1, 0.0F, false));
		oops_r1.cubeList.add(new ModelBox(oops_r1, 76, 610, 3.8363F, 3.1388F, 10.5657F, 1, 1, 1, 0.0F, false));
		oops_r1.cubeList.add(new ModelBox(oops_r1, 536, 604, 3.071F, 5.202F, 11.5494F, 1, 1, 3, 0.0F, false));
		oops_r1.cubeList.add(new ModelBox(oops_r1, 604, 534, 4.4852F, 3.7878F, 11.5494F, 1, 1, 3, 0.0F, false));
		oops_r1.cubeList.add(new ModelBox(oops_r1, 528, 604, -6.1214F, -3.9904F, 11.5494F, 1, 1, 3, 0.0F, false));
		oops_r1.cubeList.add(new ModelBox(oops_r1, 520, 604, -4.7072F, -5.4046F, 11.5494F, 1, 1, 3, 0.0F, false));
		oops_r1.cubeList.add(new ModelBox(oops_r1, 584, 443, -2.7272F, -2.5761F, -14.3386F, 1, 1, 13, -0.1F, false));
		oops_r1.cubeList.add(new ModelBox(oops_r1, 506, 385, -4.8136F, -4.8039F, 10.4784F, 1, 1, 2, 0.0F, false));
		oops_r1.cubeList.add(new ModelBox(oops_r1, 530, 327, -4.8404F, -4.6894F, -14.6F, 1, 1, 26, -0.1F, false));

		oops_r2 = new ModelRenderer(this);
		oops_r2.setRotationPoint(0.0F, -1.5734F, -7.9437F);
		stock2.addChild(oops_r2);
		setRotationAngle(oops_r2, -0.7854F, 0.0F, 0.0F);
		oops_r2.cubeList.add(new ModelBox(oops_r2, 146, 610, -0.5F, 0.0F, -1.5F, 1, 1, 1, 0.0F, false));

		oops_r3 = new ModelRenderer(this);
		oops_r3.setRotationPoint(0.0F, -1.5734F, -10.9437F);
		stock2.addChild(oops_r3);
		setRotationAngle(oops_r3, -0.7854F, 0.0F, 0.0F);
		oops_r3.cubeList.add(new ModelBox(oops_r3, 142, 610, -0.5F, 0.0F, -1.5F, 1, 1, 1, 0.0F, false));

		oops_r4 = new ModelRenderer(this);
		oops_r4.setRotationPoint(0.0F, -3.5364F, -10.9264F);
		stock2.addChild(oops_r4);
		setRotationAngle(oops_r4, -0.7854F, 0.0F, 0.0F);
		oops_r4.cubeList.add(new ModelBox(oops_r4, 610, 137, -0.5F, 0.0F, -1.5F, 1, 1, 1, 0.0F, false));

		oops_r5 = new ModelRenderer(this);
		oops_r5.setRotationPoint(0.0F, -3.5364F, -7.9264F);
		stock2.addChild(oops_r5);
		setRotationAngle(oops_r5, -0.7854F, 0.0F, 0.0F);
		oops_r5.cubeList.add(new ModelBox(oops_r5, 610, 135, -0.5F, 0.0F, -1.5F, 1, 1, 1, 0.0F, false));

		oops_r6 = new ModelRenderer(this);
		oops_r6.setRotationPoint(1.0068F, 1.0839F, -20.5965F);
		stock2.addChild(oops_r6);
		setRotationAngle(oops_r6, -0.0087F, 0.0F, 0.0F);
		oops_r6.cubeList.add(new ModelBox(oops_r6, 392, 592, -1.5078F, -5.0679F, 8.5657F, 1, 2, 3, 0.0F, false));

		oops_r7 = new ModelRenderer(this);
		oops_r7.setRotationPoint(0.5068F, 1.3339F, -4.5965F);
		stock2.addChild(oops_r7);
		setRotationAngle(oops_r7, -0.0087F, 0.0F, 0.0F);
		oops_r7.cubeList.add(new ModelBox(oops_r7, 460, 172, -1.5068F, -5.0679F, 10.5657F, 2, 9, 1, 0.0F, false));
		oops_r7.cubeList.add(new ModelBox(oops_r7, 606, 140, -2.2139F, 3.6392F, 10.5657F, 2, 2, 1, 0.0F, false));
		oops_r7.cubeList.add(new ModelBox(oops_r7, 600, 140, -0.7997F, 3.6392F, 10.5657F, 2, 2, 1, 0.0F, false));
		oops_r7.cubeList.add(new ModelBox(oops_r7, 414, 232, -1.5068F, 5.3463F, 10.5657F, 2, 1, 1, 0.0F, false));
		oops_r7.cubeList.add(new ModelBox(oops_r7, 400, 586, -1.5068F, 6.2641F, 11.5494F, 2, 1, 3, 0.0F, false));
		oops_r7.cubeList.add(new ModelBox(oops_r7, 452, 493, -2.2139F, -6.443F, 11.5494F, 2, 13, 3, 0.0F, false));
		oops_r7.cubeList.add(new ModelBox(oops_r7, 450, 172, -0.7997F, -6.443F, 11.5494F, 2, 13, 3, 0.0F, false));
		oops_r7.cubeList.add(new ModelBox(oops_r7, 520, 308, -1.5068F, -7.1501F, 11.5494F, 2, 1, 3, 0.0F, false));
		oops_r7.cubeList.add(new ModelBox(oops_r7, 424, 525, -1.0068F, -3.7086F, -14.3386F, 1, 1, 13, -0.1F, false));
		oops_r7.cubeList.add(new ModelBox(oops_r7, 500, 385, -1.0068F, -6.8006F, 10.4784F, 1, 1, 2, 0.0F, false));
		oops_r7.cubeList.add(new ModelBox(oops_r7, 530, 300, -1.0068F, -6.6972F, -14.6F, 1, 1, 26, -0.1F, false));

		stock_r1 = new ModelRenderer(this);
		stock_r1.setRotationPoint(0.5068F, 1.3339F, -4.5965F);
		stock2.addChild(stock_r1);
		setRotationAngle(stock_r1, 0.3947F, -0.3671F, -2.4304F);
		stock_r1.cubeList.add(new ModelBox(stock_r1, 582, 277, 0.8767F, -0.4058F, -3.1501F, 1, 1, 17, -0.1F, false));

		stock_r2 = new ModelRenderer(this);
		stock_r2.setRotationPoint(0.5068F, 1.3339F, -4.5965F);
		stock2.addChild(stock_r2);
		setRotationAngle(stock_r2, 0.5323F, 0.0F, -3.1416F);
		stock_r2.cubeList.add(new ModelBox(stock_r2, 582, 259, 0.0068F, 0.3744F, -3.1501F, 1, 1, 17, -0.1F, false));

		stock_r3 = new ModelRenderer(this);
		stock_r3.setRotationPoint(0.5068F, 1.3339F, -4.5965F);
		stock2.addChild(stock_r3);
		setRotationAngle(stock_r3, 0.0F, -0.5323F, -1.5708F);
		stock_r3.cubeList.add(new ModelBox(stock_r3, 582, 241, 0.9401F, -1.5725F, -3.1501F, 1, 1, 17, -0.1F, false));

		stock_r4 = new ModelRenderer(this);
		stock_r4.setRotationPoint(0.5068F, 1.3339F, -4.5965F);
		stock2.addChild(stock_r4);
		setRotationAngle(stock_r4, -0.3947F, -0.3671F, -0.7112F);
		stock_r4.cubeList.add(new ModelBox(stock_r4, 36, 580, 0.1599F, -2.4424F, -3.1501F, 1, 1, 17, -0.1F, false));

		stock_r5 = new ModelRenderer(this);
		stock_r5.setRotationPoint(0.5068F, 1.3339F, -4.5965F);
		stock2.addChild(stock_r5);
		setRotationAngle(stock_r5, 0.0F, 0.5323F, 1.5708F);
		stock_r5.cubeList.add(new ModelBox(stock_r5, 108, 579, -1.9401F, -0.5589F, -3.1501F, 1, 1, 17, -0.1F, false));

		stock_r6 = new ModelRenderer(this);
		stock_r6.setRotationPoint(0.5068F, 1.3339F, -4.5965F);
		stock2.addChild(stock_r6);
		setRotationAngle(stock_r6, 0.3947F, 0.3671F, 2.4304F);
		stock_r6.cubeList.add(new ModelBox(stock_r6, 72, 579, -1.1599F, 0.311F, -3.1501F, 1, 1, 17, -0.1F, false));

		stock_r7 = new ModelRenderer(this);
		stock_r7.setRotationPoint(0.5068F, 1.3339F, -4.5965F);
		stock2.addChild(stock_r7);
		setRotationAngle(stock_r7, -0.3947F, 0.3671F, 0.7112F);
		stock_r7.cubeList.add(new ModelBox(stock_r7, 0, 579, -1.8767F, -1.7256F, -3.1501F, 1, 1, 17, -0.1F, false));

		stock_r8 = new ModelRenderer(this);
		stock_r8.setRotationPoint(0.5068F, 1.3339F, -4.5965F);
		stock2.addChild(stock_r8);
		setRotationAngle(stock_r8, -0.5323F, 0.0F, 0.0F);
		stock_r8.cubeList.add(new ModelBox(stock_r8, 164, 577, -1.0068F, -2.5058F, -3.1501F, 1, 1, 17, -0.1F, false));

		stock_r9 = new ModelRenderer(this);
		stock_r9.setRotationPoint(0.5068F, 1.3339F, -4.5965F);
		stock2.addChild(stock_r9);
		setRotationAngle(stock_r9, 0.0062F, -0.0062F, -2.3562F);
		stock_r9.cubeList.add(new ModelBox(stock_r9, 586, 189, 1.7272F, 0.4447F, -14.3386F, 1, 1, 13, -0.1F, false));
		stock_r9.cubeList.add(new ModelBox(stock_r9, 592, 238, 3.8136F, 2.3897F, 10.4784F, 1, 1, 2, 0.0F, false));
		stock_r9.cubeList.add(new ModelBox(stock_r9, 180, 532, 3.8404F, 2.558F, -14.6F, 1, 1, 26, -0.1F, false));

		stock_r10 = new ModelRenderer(this);
		stock_r10.setRotationPoint(0.5068F, 1.3339F, -4.5965F);
		stock2.addChild(stock_r10);
		setRotationAngle(stock_r10, 0.0087F, 0.0F, -3.1416F);
		stock_r10.cubeList.add(new ModelBox(stock_r10, 586, 175, 0.0068F, 1.5772F, -14.3386F, 1, 1, 13, -0.1F, false));
		stock_r10.cubeList.add(new ModelBox(stock_r10, 590, 378, 0.0068F, 4.3864F, 10.4784F, 1, 1, 2, 0.0F, false));
		stock_r10.cubeList.add(new ModelBox(stock_r10, 532, 187, 0.0068F, 4.5658F, -14.6F, 1, 1, 26, -0.1F, false));

		stock_r11 = new ModelRenderer(this);
		stock_r11.setRotationPoint(0.5068F, 1.3339F, -4.5965F);
		stock2.addChild(stock_r11);
		setRotationAngle(stock_r11, 0.0F, -0.0087F, -1.5708F);
		stock_r11.cubeList.add(new ModelBox(stock_r11, 586, 121, 2.1429F, -1.5725F, -14.3386F, 1, 1, 13, -0.1F, false));
		stock_r11.cubeList.add(new ModelBox(stock_r11, 586, 238, 5.0935F, -1.7139F, 10.4784F, 1, 1, 2, 0.0F, false));
		stock_r11.cubeList.add(new ModelBox(stock_r11, 532, 214, 5.1315F, -1.5725F, -14.6F, 1, 1, 26, -0.1F, false));

		stock_r12 = new ModelRenderer(this);
		stock_r12.setRotationPoint(0.5068F, 1.3339F, -4.5965F);
		stock2.addChild(stock_r12);
		setRotationAngle(stock_r12, -0.0062F, -0.0062F, -0.7854F);
		stock_r12.cubeList.add(new ModelBox(stock_r12, 364, 592, 1.0104F, -3.2929F, -14.3386F, 1, 1, 13, -0.1F, false));
		stock_r12.cubeList.add(new ModelBox(stock_r12, 584, 378, 3.0968F, -5.5207F, 10.4784F, 1, 1, 2, 0.0F, false));
		stock_r12.cubeList.add(new ModelBox(stock_r12, 530, 160, 3.1237F, -5.4061F, -14.6F, 1, 1, 26, -0.1F, false));

		stock_r13 = new ModelRenderer(this);
		stock_r13.setRotationPoint(0.5068F, 1.3339F, -4.5965F);
		stock2.addChild(stock_r13);
		setRotationAngle(stock_r13, 0.0F, 0.0087F, 1.5708F);
		stock_r13.cubeList.add(new ModelBox(stock_r13, 586, 107, -3.1429F, -0.5589F, -14.3386F, 1, 1, 13, -0.1F, false));
		stock_r13.cubeList.add(new ModelBox(stock_r13, 300, 545, -6.0935F, -0.7003F, 10.4784F, 1, 1, 2, 0.0F, false));
		stock_r13.cubeList.add(new ModelBox(stock_r13, 530, 354, -6.1315F, -0.5589F, -14.6F, 1, 1, 26, -0.1F, false));

		stock_r14 = new ModelRenderer(this);
		stock_r14.setRotationPoint(0.5068F, 1.3339F, -4.5965F);
		stock2.addChild(stock_r14);
		setRotationAngle(stock_r14, 0.0062F, 0.0062F, 2.3562F);
		stock_r14.cubeList.add(new ModelBox(stock_r14, 584, 457, -2.0104F, 1.1615F, -14.3386F, 1, 1, 13, -0.1F, false));
		stock_r14.cubeList.add(new ModelBox(stock_r14, 512, 385, -4.0968F, 3.1065F, 10.4784F, 1, 1, 2, 0.0F, false));
		stock_r14.cubeList.add(new ModelBox(stock_r14, 126, 532, -4.1237F, 3.2747F, -14.6F, 1, 1, 26, -0.1F, false));

		stock_r15 = new ModelRenderer(this);
		stock_r15.setRotationPoint(0.5068F, 1.0339F, -31.1965F);
		stock2.addChild(stock_r15);
		setRotationAngle(stock_r15, 0.0F, 0.0087F, 1.5708F);
		stock_r15.cubeList.add(new ModelBox(stock_r15, 478, 419, -6.0935F, -0.7003F, 8.4784F, 4, 1, 4, 0.0F, false));

		stock_r16 = new ModelRenderer(this);
		stock_r16.setRotationPoint(0.5068F, 1.0339F, -31.1965F);
		stock2.addChild(stock_r16);
		setRotationAngle(stock_r16, -0.0062F, 0.0062F, 0.7854F);
		stock_r16.cubeList.add(new ModelBox(stock_r16, 212, 600, -4.8136F, -4.8039F, 8.4784F, 1, 1, 4, 0.0F, false));

		stock_r17 = new ModelRenderer(this);
		stock_r17.setRotationPoint(0.5068F, 1.0339F, -31.1965F);
		stock2.addChild(stock_r17);
		setRotationAngle(stock_r17, -0.0087F, 0.0F, 0.0F);
		stock_r17.cubeList.add(new ModelBox(stock_r17, 190, 600, -1.0068F, -6.8006F, 8.4784F, 1, 1, 4, 0.0F, false));

		stock_r18 = new ModelRenderer(this);
		stock_r18.setRotationPoint(0.5068F, 1.0339F, -31.1965F);
		stock2.addChild(stock_r18);
		setRotationAngle(stock_r18, -0.0062F, -0.0062F, -0.7854F);
		stock_r18.cubeList.add(new ModelBox(stock_r18, 180, 600, 3.0968F, -5.5207F, 8.4784F, 1, 1, 4, 0.0F, false));

		stock_r19 = new ModelRenderer(this);
		stock_r19.setRotationPoint(0.5068F, 1.0339F, -31.1965F);
		stock2.addChild(stock_r19);
		setRotationAngle(stock_r19, 0.0F, -0.0087F, -1.5708F);
		stock_r19.cubeList.add(new ModelBox(stock_r19, 212, 39, 6.4935F, -0.1639F, 7.9784F, 3, 2, 1, 0.0F, false));
		stock_r19.cubeList.add(new ModelBox(stock_r19, 306, 518, 2.0935F, -1.7139F, 8.4784F, 4, 1, 4, 0.0F, false));

		stock_r20 = new ModelRenderer(this);
		stock_r20.setRotationPoint(0.4068F, 1.0339F, -31.1965F);
		stock2.addChild(stock_r20);
		setRotationAngle(stock_r20, 0.0F, -0.0087F, -1.5708F);
		stock_r20.cubeList.add(new ModelBox(stock_r20, 508, 168, 2.0935F, -2.9639F, 7.9784F, 6, 2, 2, 0.0F, false));

		stock_r21 = new ModelRenderer(this);
		stock_r21.setRotationPoint(0.5068F, 4.0338F, -31.2139F);
		stock2.addChild(stock_r21);
		setRotationAngle(stock_r21, 0.0062F, -0.0062F, -2.3562F);
		stock_r21.cubeList.add(new ModelBox(stock_r21, 600, 135, 3.8136F, 2.3897F, 8.4784F, 1, 1, 4, 0.0F, false));

		stock_r22 = new ModelRenderer(this);
		stock_r22.setRotationPoint(0.5068F, 4.0338F, -31.2139F);
		stock2.addChild(stock_r22);
		setRotationAngle(stock_r22, 0.0087F, 0.0F, -3.1416F);
		stock_r22.cubeList.add(new ModelBox(stock_r22, 596, 598, 0.0068F, 4.3864F, 8.4784F, 1, 1, 4, 0.0F, false));

		stock_r23 = new ModelRenderer(this);
		stock_r23.setRotationPoint(0.5068F, 4.0338F, -31.2139F);
		stock2.addChild(stock_r23);
		setRotationAngle(stock_r23, 0.0062F, 0.0062F, 2.3562F);
		stock_r23.cubeList.add(new ModelBox(stock_r23, 598, 375, -4.0968F, 3.1065F, 8.4784F, 1, 1, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		foldingstock.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}