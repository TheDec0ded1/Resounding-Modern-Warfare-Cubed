package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.10.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class PKMStock extends ModelBase {
	private final ModelRenderer pkmStock;
	private final ModelRenderer bone29;
	private final ModelRenderer bone30;
	private final ModelRenderer bone31;
	private final ModelRenderer bone32;
	private final ModelRenderer bone33;
	private final ModelRenderer bone34;
	private final ModelRenderer bone35;
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

	public PKMStock() {
		textureWidth = 512;
		textureHeight = 512;

		pkmStock = new ModelRenderer(this);
		pkmStock.setRotationPoint(0.0F, 24.0F, 0.0F);
		pkmStock.cubeList.add(new ModelBox(pkmStock, 0, 0, -2.8F, -36.0F, 3.5F, 4, 1, 29, 0.0F, false));
		pkmStock.cubeList.add(new ModelBox(pkmStock, 72, 102, -4.2F, -36.0F, 3.5F, 2, 1, 29, 0.0F, false));
		pkmStock.cubeList.add(new ModelBox(pkmStock, 37, 0, -2.8F, -37.0F, 32.5F, 4, 13, 2, 0.0F, false));
		pkmStock.cubeList.add(new ModelBox(pkmStock, 109, 72, -4.2F, -37.0F, 32.5F, 2, 13, 2, 0.0F, false));
		pkmStock.cubeList.add(new ModelBox(pkmStock, 105, 32, -2.8F, -37.0F, 34.5F, 4, 13, 1, 0.0F, false));
		pkmStock.cubeList.add(new ModelBox(pkmStock, 64, 55, -4.2F, -37.0F, 34.5F, 2, 13, 1, 0.0F, false));
		pkmStock.cubeList.add(new ModelBox(pkmStock, 5, 103, 0.2F, -38.0F, 34.5F, 1, 1, 1, 0.0F, false));
		pkmStock.cubeList.add(new ModelBox(pkmStock, 96, 102, -4.2F, -38.0F, 34.5F, 1, 1, 1, 0.0F, false));
		pkmStock.cubeList.add(new ModelBox(pkmStock, 86, 10, -3.5F, -38.0F, 34.5F, 4, 1, 1, -0.2F, false));
		pkmStock.cubeList.add(new ModelBox(pkmStock, 169, 52, -2.8F, -27.4F, 17.5F, 4, 2, 15, 0.0F, false));
		pkmStock.cubeList.add(new ModelBox(pkmStock, 107, 261, -2.8F, -35.4F, 3.5F, 4, 5, 13, 0.0F, false));
		pkmStock.cubeList.add(new ModelBox(pkmStock, 117, 124, -2.4F, -38.0F, 32.5F, 2, 2, 2, 0.0F, false));
		pkmStock.cubeList.add(new ModelBox(pkmStock, 0, 30, -4.2F, -35.4F, 3.5F, 2, 5, 13, 0.0F, false));
		pkmStock.cubeList.add(new ModelBox(pkmStock, 54, 285, -4.2F, -27.4F, 17.5F, 2, 2, 15, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.2F, -26.9F, 13.5F);
		pkmStock.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.3054F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -2.0F, -3.6F, 0.4F, 2, 7, 4, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 54, 0, -0.6F, -3.6F, 0.4F, 4, 7, 4, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.4F, -34.4F, 16.5F);
		pkmStock.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.7418F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 72, 39, -2.0F, -1.5F, -0.5F, 4, 2, 1, 0.0F, false));

		bone29 = new ModelRenderer(this);
		bone29.setRotationPoint(-3.3515F, -36.1414F, 15.0F);
		pkmStock.addChild(bone29);
		bone29.cubeList.add(new ModelBox(bone29, 144, 72, 0.5615F, -0.8485F, -5.5F, 3, 1, 23, 0.0F, false));
		bone29.cubeList.add(new ModelBox(bone29, 216, 143, 0.1414F, -0.8485F, -5.5F, 1, 1, 23, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(3.8444F, 0.1414F, 0.0F);
		bone29.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.7854F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 216, 25, -0.5F, -0.5F, -5.5F, 1, 1, 23, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 216, 167, -0.9F, -0.5F, -5.5F, 1, 1, 23, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone29.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 216, 72, -0.7F, -0.5F, -5.5F, 1, 1, 23, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 216, 96, -0.3F, -0.5F, -5.5F, 1, 1, 23, 0.0F, false));

		bone30 = new ModelRenderer(this);
		bone30.setRotationPoint(-3.3515F, -27.1414F, 15.0F);
		pkmStock.addChild(bone30);
		setRotationAngle(bone30, 1.8762F, 0.0F, 0.0F);
		bone30.cubeList.add(new ModelBox(bone30, 122, 132, 1.2444F, -1.8103F, -3.1792F, 2, 1, 8, 0.0F, false));
		bone30.cubeList.add(new ModelBox(bone30, 124, 32, 0.6586F, -1.8103F, -3.1792F, 1, 1, 8, 0.0F, false));

		bone31 = new ModelRenderer(this);
		bone31.setRotationPoint(-1.525F, -25.1036F, 25.0F);
		pkmStock.addChild(bone31);
		setRotationAngle(bone31, -3.1416F, 0.0F, 0.0F);
		bone31.cubeList.add(new ModelBox(bone31, 242, 49, -1.8821F, -0.4107F, -7.5F, 4, 1, 15, 0.0F, false));

		bone32 = new ModelRenderer(this);
		bone32.setRotationPoint(-1.525F, -27.5036F, 19.0F);
		pkmStock.addChild(bone32);
		setRotationAngle(bone32, -1.2654F, 0.0F, 0.0F);
		bone32.cubeList.add(new ModelBox(bone32, 0, 48, -1.8821F, 0.3198F, -6.6783F, 4, 1, 9, 0.0F, false));

		bone33 = new ModelRenderer(this);
		bone33.setRotationPoint(-3.3515F, -26.1414F, 41.0F);
		pkmStock.addChild(bone33);
		bone33.cubeList.add(new ModelBox(bone33, 0, 262, -0.0556F, -1.9657F, -23.5F, 4, 1, 15, 0.0F, false));

		bone34 = new ModelRenderer(this);
		bone34.setRotationPoint(-3.3515F, -29.1414F, 41.0F);
		pkmStock.addChild(bone34);
		

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(1.7015F, -4.6756F, -9.347F);
		bone34.addChild(cube_r5);
		setRotationAngle(cube_r5, 1.3526F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 156, 2, -1.0429F, 1.848F, -8.9247F, 1, 1, 1, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 33, 76, -0.4571F, 1.848F, -8.9247F, 2, 1, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(2.4015F, -4.6756F, -9.647F);
		bone34.addChild(cube_r6);
		setRotationAngle(cube_r6, 1.3526F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 23, -2.4571F, -1.652F, -0.2247F, 4, 1, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(2.4015F, -4.6756F, -9.647F);
		bone34.addChild(cube_r7);
		setRotationAngle(cube_r7, 2.5744F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 72, 96, -2.4571F, -0.6051F, -1.9944F, 4, 2, 3, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(2.4015F, -3.4703F, -7.502F);
		bone34.addChild(cube_r8);
		setRotationAngle(cube_r8, 1.0036F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 154, 92, -2.4571F, -0.2934F, -2.8731F, 4, 1, 2, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(2.4015F, -3.8769F, -8.636F);
		bone34.addChild(cube_r9);
		setRotationAngle(cube_r9, 1.7017F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 72, 9, -2.4571F, -0.2934F, -1.8731F, 4, 1, 2, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(2.4015F, -4.6756F, -9.647F);
		bone34.addChild(cube_r10);
		setRotationAngle(cube_r10, 2.1817F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 16, 23, -2.4571F, -0.2934F, -1.8731F, 4, 1, 1, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(2.4015F, 1.6548F, -10.8166F);
		bone34.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.8727F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 79, -2.4571F, -0.5F, 0.7F, 4, 2, 2, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(2.4015F, -1.0338F, -8.8233F);
		bone34.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.3491F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 86, 79, -2.4571F, 0.0F, -0.5F, 4, 1, 2, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(2.4015F, 1.9343F, -12.1F);
		bone34.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.48F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 17, 55, -2.4571F, -0.5F, 1.0F, 4, 1, 1, 0.0F, false));

		bone35 = new ModelRenderer(this);
		bone35.setRotationPoint(-3.3515F, -39.1414F, 15.0F);
		pkmStock.addChild(bone35);
		setRotationAngle(bone35, 3.1416F, 0.0F, 0.0F);
		bone35.cubeList.add(new ModelBox(bone35, 144, 52, -0.0385F, -5.1314F, -17.5F, 4, 1, 17, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		pkmStock.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}