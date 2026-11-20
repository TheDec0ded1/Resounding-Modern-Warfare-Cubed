package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FALadapterOSW extends ModelBase {
	private final ModelRenderer adapterARstock;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r14;
	private final ModelRenderer stock2;
	private final ModelRenderer stock_r1;
	private final ModelRenderer stock_r2;
	private final ModelRenderer extensionHK;
	private final ModelRenderer extension_r1;
	private final ModelRenderer extension_r2;
	private final ModelRenderer extension_r3;
	private final ModelRenderer extension_r4;
	private final ModelRenderer extension_r5;
	private final ModelRenderer extension_r6;
	private final ModelRenderer extension_r7;
	private final ModelRenderer extension_r8;
	private final ModelRenderer extension_r9;
	private final ModelRenderer extension_r10;
	private final ModelRenderer extension_r11;
	private final ModelRenderer extension_r12;
	private final ModelRenderer extension_r13;
	private final ModelRenderer extension_r14;
	private final ModelRenderer extension_r15;
	private final ModelRenderer extension_r16;
	private final ModelRenderer extension_r17;
	private final ModelRenderer extension_r18;
	private final ModelRenderer extension_r19;
	private final ModelRenderer extension_r20;
	private final ModelRenderer extension_r21;
	private final ModelRenderer extension_r22;
	private final ModelRenderer extension_r23;
	private final ModelRenderer extension_r24;
	private final ModelRenderer extension_r25;

	public FALadapterOSW() {
		textureWidth = 384;
		textureHeight = 384;

		adapterARstock = new ModelRenderer(this);
		adapterARstock.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.1F, -35.5856F, 9.064F);
		adapterARstock.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.0968F, -0.0883F, -0.7375F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 362, 307, -1.8F, -4.0F, -2.0F, 2, 2, 3, -0.01F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-0.7F, -36.6856F, 9.064F);
		adapterARstock.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.1309F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 362, 302, -1.8F, -4.0F, -2.0F, 2, 2, 3, -0.01F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 68, 85, -2.601F, -2.0F, -1.004F, 1, 7, 2, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 134, 294, -1.998F, -2.0F, -1.0F, 3, 7, 2, 0.0F, false));

		stock2 = new ModelRenderer(this);
		stock2.setRotationPoint(-1.5F, -31.4458F, 31.6758F);
		adapterARstock.addChild(stock2);
		

		stock_r1 = new ModelRenderer(this);
		stock_r1.setRotationPoint(0.5068F, 1.0339F, -31.1965F);
		stock2.addChild(stock_r1);
		setRotationAngle(stock_r1, 0.0F, -0.0087F, -1.5708F);
		stock_r1.cubeList.add(new ModelBox(stock_r1, 330, 365, 6.4935F, -0.1639F, 7.9784F, 3, 2, 1, 0.0F, false));

		stock_r2 = new ModelRenderer(this);
		stock_r2.setRotationPoint(0.4068F, 1.0339F, -31.1965F);
		stock2.addChild(stock_r2);
		setRotationAngle(stock_r2, 0.0F, -0.0087F, -1.5708F);
		stock_r2.cubeList.add(new ModelBox(stock_r2, 162, 29, 2.0935F, -2.9639F, 7.9784F, 6, 2, 2, 0.0F, false));

		extensionHK = new ModelRenderer(this);
		extensionHK.setRotationPoint(0.0F, 11.25F, 5.0F);
		adapterARstock.addChild(extensionHK);
		extensionHK.cubeList.add(new ModelBox(extensionHK, 200, 145, -2.0F, -47.1F, 4.999F, 1, 1, 23, 0.0F, false));
		extensionHK.cubeList.add(new ModelBox(extensionHK, 362, 334, -2.0F, -47.225F, 4.499F, 1, 1, 4, 0.05F, false));

		extension_r1 = new ModelRenderer(this);
		extension_r1.setRotationPoint(-2.8606F, -45.2878F, 17.999F);
		extensionHK.addChild(extension_r1);
		setRotationAngle(extension_r1, 0.0F, 0.0F, -1.5708F);
		extension_r1.cubeList.add(new ModelBox(extension_r1, 364, 322, -0.5F, -0.5766F, -13.5F, 1, 1, 4, 0.05F, false));

		extension_r2 = new ModelRenderer(this);
		extension_r2.setRotationPoint(-2.8453F, -45.3648F, 17.999F);
		extensionHK.addChild(extension_r2);
		setRotationAngle(extension_r2, 0.0F, 0.0F, -1.1781F);
		extension_r2.cubeList.add(new ModelBox(extension_r2, 364, 317, 0.2413F, -0.7241F, -13.5F, 1, 1, 4, 0.05F, false));

		extension_r3 = new ModelRenderer(this);
		extension_r3.setRotationPoint(-2.8453F, -45.2107F, 17.999F);
		extensionHK.addChild(extension_r3);
		setRotationAngle(extension_r3, 0.0F, 0.0F, -1.9635F);
		extension_r3.cubeList.add(new ModelBox(extension_r3, 364, 312, -1.2413F, -0.7241F, -13.5F, 1, 1, 4, 0.05F, false));

		extension_r4 = new ModelRenderer(this);
		extension_r4.setRotationPoint(-1.5F, -43.9272F, 17.999F);
		extensionHK.addChild(extension_r4);
		setRotationAngle(extension_r4, 0.0F, 0.0F, 3.1416F);
		extension_r4.cubeList.add(new ModelBox(extension_r4, 364, 111, -0.5F, -0.5766F, -13.5F, 1, 1, 4, 0.05F, false));

		extension_r5 = new ModelRenderer(this);
		extension_r5.setRotationPoint(-1.5771F, -43.9425F, 17.999F);
		extensionHK.addChild(extension_r5);
		setRotationAngle(extension_r5, 0.0F, 0.0F, -2.7489F);
		extension_r5.cubeList.add(new ModelBox(extension_r5, 364, 106, 0.2413F, -0.7241F, -13.5F, 1, 1, 4, 0.05F, false));

		extension_r6 = new ModelRenderer(this);
		extension_r6.setRotationPoint(-1.4229F, -43.9425F, 17.999F);
		extensionHK.addChild(extension_r6);
		setRotationAngle(extension_r6, 0.0F, 0.0F, 2.7489F);
		extension_r6.cubeList.add(new ModelBox(extension_r6, 364, 37, -1.2413F, -0.7241F, -13.5F, 1, 1, 4, 0.05F, false));

		extension_r7 = new ModelRenderer(this);
		extension_r7.setRotationPoint(-0.1394F, -45.2878F, 17.999F);
		extensionHK.addChild(extension_r7);
		setRotationAngle(extension_r7, 0.0F, 0.0F, 1.5708F);
		extension_r7.cubeList.add(new ModelBox(extension_r7, 364, 32, -0.5F, -0.5766F, -13.5F, 1, 1, 4, 0.05F, false));

		extension_r8 = new ModelRenderer(this);
		extension_r8.setRotationPoint(-0.1547F, -45.2107F, 17.999F);
		extensionHK.addChild(extension_r8);
		setRotationAngle(extension_r8, 0.0F, 0.0F, 1.9635F);
		extension_r8.cubeList.add(new ModelBox(extension_r8, 196, 363, 0.2413F, -0.7241F, -13.5F, 1, 1, 4, 0.05F, false));

		extension_r9 = new ModelRenderer(this);
		extension_r9.setRotationPoint(-0.1547F, -45.3648F, 17.999F);
		extensionHK.addChild(extension_r9);
		setRotationAngle(extension_r9, 0.0F, 0.0F, 1.1781F);
		extension_r9.cubeList.add(new ModelBox(extension_r9, 186, 363, -1.2413F, -0.7241F, -13.5F, 1, 1, 4, 0.05F, false));

		extension_r10 = new ModelRenderer(this);
		extension_r10.setRotationPoint(-2.3477F, -46.5564F, 17.999F);
		extensionHK.addChild(extension_r10);
		setRotationAngle(extension_r10, 0.0F, 0.0F, -0.3927F);
		extension_r10.cubeList.add(new ModelBox(extension_r10, 362, 344, -0.5F, -0.5F, -13.5F, 1, 1, 4, 0.05F, false));

		extension_r11 = new ModelRenderer(this);
		extension_r11.setRotationPoint(-0.6523F, -46.5564F, 17.999F);
		extensionHK.addChild(extension_r11);
		setRotationAngle(extension_r11, 0.0F, 0.0F, 0.3927F);
		extension_r11.cubeList.add(new ModelBox(extension_r11, 362, 339, -0.5F, -0.5F, -13.5F, 1, 1, 4, 0.05F, false));

		extension_r12 = new ModelRenderer(this);
		extension_r12.setRotationPoint(-0.2701F, -45.2934F, 18.499F);
		extensionHK.addChild(extension_r12);
		setRotationAngle(extension_r12, 0.0F, 0.0F, 1.1781F);
		extension_r12.cubeList.add(new ModelBox(extension_r12, 248, 145, -1.2413F, -0.7241F, -13.5F, 1, 1, 23, 0.0F, false));

		extension_r13 = new ModelRenderer(this);
		extension_r13.setRotationPoint(-0.2701F, -45.2934F, 18.499F);
		extensionHK.addChild(extension_r13);
		setRotationAngle(extension_r13, 0.0F, 0.0F, 1.9635F);
		extension_r13.cubeList.add(new ModelBox(extension_r13, 96, 247, 0.2413F, -0.7241F, -13.5F, 1, 1, 23, 0.0F, false));

		extension_r14 = new ModelRenderer(this);
		extension_r14.setRotationPoint(-0.2701F, -45.2934F, 18.499F);
		extensionHK.addChild(extension_r14);
		setRotationAngle(extension_r14, 0.0F, 0.0F, 1.5708F);
		extension_r14.cubeList.add(new ModelBox(extension_r14, 0, 247, -0.5F, -0.5766F, -13.5F, 1, 1, 23, 0.0F, false));

		extension_r15 = new ModelRenderer(this);
		extension_r15.setRotationPoint(-1.5F, -44.0635F, 18.499F);
		extensionHK.addChild(extension_r15);
		setRotationAngle(extension_r15, 0.0F, 0.0F, 2.7489F);
		extension_r15.cubeList.add(new ModelBox(extension_r15, 48, 246, -1.2413F, -0.7241F, -13.5F, 1, 1, 23, 0.0F, false));

		extension_r16 = new ModelRenderer(this);
		extension_r16.setRotationPoint(-1.5F, -44.0635F, 18.499F);
		extensionHK.addChild(extension_r16);
		setRotationAngle(extension_r16, 0.0F, 0.0F, -2.7489F);
		extension_r16.cubeList.add(new ModelBox(extension_r16, 244, 244, 0.2413F, -0.7241F, -13.5F, 1, 1, 23, 0.0F, false));

		extension_r17 = new ModelRenderer(this);
		extension_r17.setRotationPoint(-2.0F, -43.5696F, 13.101F);
		extensionHK.addChild(extension_r17);
		setRotationAngle(extension_r17, 0.6109F, 0.0F, 3.1416F);
		extension_r17.cubeList.add(new ModelBox(extension_r17, 214, 90, -1.5F, -0.5766F, -1.5F, 2, 2, 3, 0.0F, false));

		extension_r18 = new ModelRenderer(this);
		extension_r18.setRotationPoint(-2.0F, -44.8135F, 18.499F);
		extensionHK.addChild(extension_r18);
		setRotationAngle(extension_r18, 0.0F, 0.0F, 3.1416F);
		extension_r18.cubeList.add(new ModelBox(extension_r18, 116, 366, -1.5F, -0.5766F, 8.5F, 2, 2, 1, 0.0F, false));

		extension_r19 = new ModelRenderer(this);
		extension_r19.setRotationPoint(-2.0F, -42.8135F, 18.499F);
		extensionHK.addChild(extension_r19);
		setRotationAngle(extension_r19, 0.0F, 0.0F, 3.1416F);
		extension_r19.cubeList.add(new ModelBox(extension_r19, 252, 74, -1.5F, -0.5766F, -4.5F, 2, 2, 14, 0.0F, false));

		extension_r20 = new ModelRenderer(this);
		extension_r20.setRotationPoint(-1.5F, -44.0635F, 18.499F);
		extensionHK.addChild(extension_r20);
		setRotationAngle(extension_r20, 0.0F, 0.0F, 3.1416F);
		extension_r20.cubeList.add(new ModelBox(extension_r20, 196, 244, -0.5F, -0.5766F, -13.5F, 1, 1, 23, 0.0F, false));

		extension_r21 = new ModelRenderer(this);
		extension_r21.setRotationPoint(-2.7299F, -45.2934F, 18.499F);
		extensionHK.addChild(extension_r21);
		setRotationAngle(extension_r21, 0.0F, 0.0F, -1.9635F);
		extension_r21.cubeList.add(new ModelBox(extension_r21, 148, 244, -1.2413F, -0.7241F, -13.5F, 1, 1, 23, 0.0F, false));

		extension_r22 = new ModelRenderer(this);
		extension_r22.setRotationPoint(-2.7299F, -45.2934F, 18.499F);
		extensionHK.addChild(extension_r22);
		setRotationAngle(extension_r22, 0.0F, 0.0F, -1.1781F);
		extension_r22.cubeList.add(new ModelBox(extension_r22, 240, 193, 0.2413F, -0.7241F, -13.5F, 1, 1, 23, 0.0F, false));

		extension_r23 = new ModelRenderer(this);
		extension_r23.setRotationPoint(-2.7299F, -45.2934F, 18.499F);
		extensionHK.addChild(extension_r23);
		setRotationAngle(extension_r23, 0.0F, 0.0F, -1.5708F);
		extension_r23.cubeList.add(new ModelBox(extension_r23, 240, 169, -0.5F, -0.5766F, -13.5F, 1, 1, 23, 0.0F, false));

		extension_r24 = new ModelRenderer(this);
		extension_r24.setRotationPoint(-2.2706F, -46.4467F, 18.499F);
		extensionHK.addChild(extension_r24);
		setRotationAngle(extension_r24, 0.0F, 0.0F, -0.3927F);
		extension_r24.cubeList.add(new ModelBox(extension_r24, 100, 223, -0.5F, -0.5F, -13.5F, 1, 1, 23, 0.0F, false));

		extension_r25 = new ModelRenderer(this);
		extension_r25.setRotationPoint(-0.7294F, -46.4467F, 18.499F);
		extensionHK.addChild(extension_r25);
		setRotationAngle(extension_r25, 0.0F, 0.0F, 0.3927F);
		extension_r25.cubeList.add(new ModelBox(extension_r25, 0, 223, -0.5F, -0.5F, -13.5F, 1, 1, 23, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		adapterARstock.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}