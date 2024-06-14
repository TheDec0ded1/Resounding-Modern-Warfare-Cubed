package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.10.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class PKPStock extends ModelBase {
	private final ModelRenderer pkpStock;
	private final ModelRenderer bone9;
	private final ModelRenderer bone10;
	private final ModelRenderer bone13;
	private final ModelRenderer bone14;
	private final ModelRenderer bone11;
	private final ModelRenderer bone15;
	private final ModelRenderer bone12;
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

	public PKPStock() {
		textureWidth = 512;
		textureHeight = 512;

		pkpStock = new ModelRenderer(this);
		pkpStock.setRotationPoint(0.0F, 24.0F, 0.0F);
		pkpStock.cubeList.add(new ModelBox(pkpStock, 72, 72, -2.8F, -36.0F, 3.5F, 4, 1, 29, 0.0F, false));
		pkpStock.cubeList.add(new ModelBox(pkpStock, 0, 103, -4.2F, -36.0F, 3.5F, 2, 1, 29, 0.0F, false));
		pkpStock.cubeList.add(new ModelBox(pkpStock, 33, 103, -2.8F, -37.0F, 32.5F, 4, 13, 2, 0.0F, false));
		pkpStock.cubeList.add(new ModelBox(pkpStock, 62, 121, -4.2F, -37.0F, 32.5F, 2, 13, 2, 0.0F, false));
		pkpStock.cubeList.add(new ModelBox(pkpStock, 105, 102, -2.8F, -37.0F, 34.5F, 4, 13, 1, 0.0F, false));
		pkpStock.cubeList.add(new ModelBox(pkpStock, 115, 32, -4.2F, -37.0F, 34.5F, 2, 13, 1, 0.0F, false));
		pkpStock.cubeList.add(new ModelBox(pkpStock, 117, 112, 0.2F, -38.0F, 34.5F, 1, 1, 1, 0.0F, false));
		pkpStock.cubeList.add(new ModelBox(pkpStock, 117, 114, -4.2F, -38.0F, 34.5F, 1, 1, 1, 0.0F, false));
		pkpStock.cubeList.add(new ModelBox(pkpStock, 92, 61, -3.5F, -38.0F, 34.5F, 4, 1, 1, -0.2F, false));
		pkpStock.cubeList.add(new ModelBox(pkpStock, 242, 0, -3.4F, -27.4F, 17.5F, 4, 2, 15, 0.0F, false));
		pkpStock.cubeList.add(new ModelBox(pkpStock, 72, 263, -3.4F, -35.4F, 3.5F, 4, 5, 13, 0.0F, false));
		pkpStock.cubeList.add(new ModelBox(pkpStock, 144, 143, -2.4F, -38.0F, 32.5F, 2, 2, 2, 0.0F, false));
		pkpStock.cubeList.add(new ModelBox(pkpStock, 72, 56, -2.8F, -31.4F, 3.5F, 4, 1, 6, 0.0F, false));
		pkpStock.cubeList.add(new ModelBox(pkpStock, 105, 125, -2.8F, -35.4F, 3.5F, 4, 4, 1, 0.0F, false));
		pkpStock.cubeList.add(new ModelBox(pkpStock, 23, 13, -4.2F, -35.4F, 3.5F, 2, 4, 1, 0.0F, false));
		pkpStock.cubeList.add(new ModelBox(pkpStock, 173, 72, -4.2F, -31.4F, 3.5F, 2, 1, 6, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.0594F, -30.9F, 12.2684F);
		pkpStock.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -0.2618F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 72, 132, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.9406F, -30.9F, 12.2684F);
		pkpStock.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.2618F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 134, 0, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1.4F, -26.9F, 13.5F);
		pkpStock.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.3054F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 14, 71, -2.0F, -3.6F, 0.4F, 4, 7, 4, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.4F, -34.4F, 16.5F);
		pkpStock.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.7418F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 72, 51, -2.0F, -1.5F, -0.5F, 4, 2, 1, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-3.3515F, -36.1414F, 15.0F);
		pkpStock.addChild(bone9);
		bone9.cubeList.add(new ModelBox(bone9, 144, 96, 0.5615F, -0.8485F, -5.5F, 3, 1, 23, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 216, 214, 0.1414F, -0.8485F, -5.5F, 1, 1, 23, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(3.8444F, 0.1414F, 0.0F);
		bone9.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.7854F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 144, 239, -0.5F, -0.5F, -5.5F, 1, 1, 23, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 72, 239, -0.9F, -0.5F, -5.5F, 1, 1, 23, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone9.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 238, -0.7F, -0.5F, -5.5F, 1, 1, 23, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 216, 238, -0.3F, -0.5F, -5.5F, 1, 1, 23, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(-3.3515F, -27.1414F, 15.0F);
		pkpStock.addChild(bone10);
		setRotationAngle(bone10, 1.8762F, 0.0F, 0.0F);
		bone10.cubeList.add(new ModelBox(bone10, 144, 143, 1.2444F, -1.8103F, -3.1792F, 2, 1, 8, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 124, 102, 0.6586F, -1.8103F, -3.1792F, 1, 1, 8, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(-1.525F, -25.1036F, 25.0F);
		pkpStock.addChild(bone13);
		setRotationAngle(bone13, -3.1416F, 0.0F, 0.0F);
		bone13.cubeList.add(new ModelBox(bone13, 131, 285, -0.5821F, -0.4107F, -7.5F, 2, 1, 15, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 256, 285, -1.1679F, -0.4107F, -7.5F, 1, 1, 15, 0.0F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(-1.525F, -27.5036F, 19.0F);
		pkpStock.addChild(bone14);
		setRotationAngle(bone14, -1.2654F, 0.0F, 0.0F);
		bone14.cubeList.add(new ModelBox(bone14, 117, 120, -0.5821F, 0.3198F, -6.6783F, 2, 1, 9, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 121, 88, -1.1679F, 0.3198F, -6.6783F, 1, 1, 9, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(-3.3515F, -26.1414F, 41.0F);
		pkpStock.addChild(bone11);
		bone11.cubeList.add(new ModelBox(bone11, 109, 72, 0.6586F, -1.9657F, -23.5F, 1, 1, 15, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 172, 285, 1.2444F, -1.9657F, -23.5F, 2, 1, 15, 0.0F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(-3.3515F, -29.1414F, 41.0F);
		pkpStock.addChild(bone15);
		

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(1.7015F, -4.6756F, -9.347F);
		bone15.addChild(cube_r7);
		setRotationAngle(cube_r7, 1.3526F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 156, 26, -1.0429F, 1.848F, -8.9247F, 1, 1, 1, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 86, 4, -0.4571F, 1.848F, -8.9247F, 2, 1, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(1.7015F, -4.6756F, -9.647F);
		bone15.addChild(cube_r8);
		setRotationAngle(cube_r8, 1.3526F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 86, 76, -0.4571F, -1.652F, -0.2247F, 2, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 156, 149, -1.0429F, -1.652F, -0.2247F, 1, 1, 1, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(1.7015F, -4.6756F, -9.647F);
		bone15.addChild(cube_r9);
		setRotationAngle(cube_r9, 2.5744F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 62, 20, -1.0429F, -0.6051F, -1.9944F, 1, 2, 3, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 180, 143, -0.4571F, -0.6051F, -1.9944F, 2, 2, 3, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(1.7015F, -3.4703F, -7.502F);
		bone15.addChild(cube_r10);
		setRotationAngle(cube_r10, 1.0036F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 61, 156, -0.4571F, -0.2934F, -2.8731F, 2, 1, 2, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 22, 90, -1.0429F, -0.2934F, -2.8731F, 1, 1, 2, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(1.7015F, -3.8769F, -8.636F);
		bone15.addChild(cube_r11);
		setRotationAngle(cube_r11, 1.7017F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 114, 13, -0.4571F, -0.2934F, -1.8731F, 2, 1, 2, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 13, 133, -1.0429F, -0.2934F, -1.8731F, 1, 1, 2, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(1.7015F, -4.6756F, -9.647F);
		bone15.addChild(cube_r12);
		setRotationAngle(cube_r12, 2.1817F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 24, 99, -0.4571F, -0.2934F, -1.8731F, 2, 1, 1, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 103, 64, -1.0429F, -0.2934F, -1.8731F, 1, 1, 1, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(1.7015F, 1.6548F, -10.8166F);
		bone15.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.8727F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 123, 132, -1.0429F, -0.5F, 0.7F, 1, 2, 2, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 105, 54, -0.4571F, -0.5F, 0.7F, 2, 2, 2, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(1.7015F, -1.0338F, -8.8233F);
		bone15.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.3491F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 21, 127, -0.4571F, 0.0F, -0.5F, 2, 1, 2, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 21, 133, -1.0429F, 0.0F, -0.5F, 1, 1, 2, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(1.7015F, 1.9343F, -12.1F);
		bone15.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.48F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 43, 103, -0.4571F, -0.5F, 1.0F, 2, 1, 1, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 103, 66, -1.0429F, -0.5F, 1.0F, 1, 1, 1, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(-3.3515F, -39.1414F, 15.0F);
		pkpStock.addChild(bone12);
		setRotationAngle(bone12, 3.1416F, 0.0F, 0.0F);
		bone12.cubeList.add(new ModelBox(bone12, 0, 193, 0.5615F, -5.1314F, -17.5F, 3, 1, 17, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 33, 103, 0.1414F, -5.1314F, -17.5F, 1, 1, 17, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		pkpStock.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}