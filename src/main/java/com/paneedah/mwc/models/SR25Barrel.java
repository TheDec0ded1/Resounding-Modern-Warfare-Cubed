package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SR25Barrel extends ModelBase {
	private final ModelRenderer barrelSR25;
	private final ModelRenderer cube_r1;
	private final ModelRenderer bone3;
	private final ModelRenderer gun_r1;
	private final ModelRenderer gun_r2;
	private final ModelRenderer gun_r3;
	private final ModelRenderer gun_r4;
	private final ModelRenderer gun_r5;
	private final ModelRenderer gun_r6;
	private final ModelRenderer gun_r7;
	private final ModelRenderer gun_r8;
	private final ModelRenderer gun_r9;
	private final ModelRenderer gun_r10;
	private final ModelRenderer gun_r11;
	private final ModelRenderer gun_r12;
	private final ModelRenderer gun_r13;
	private final ModelRenderer gun_r14;
	private final ModelRenderer gun_r15;
	private final ModelRenderer gun_r16;
	private final ModelRenderer gun_r17;
	private final ModelRenderer bone4;
	private final ModelRenderer gun_r18;
	private final ModelRenderer gun_r19;
	private final ModelRenderer gun_r20;
	private final ModelRenderer gun_r21;
	private final ModelRenderer bone7;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer bone11;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;

	public SR25Barrel() {
		textureWidth = 544;
		textureHeight = 544;

		barrelSR25 = new ModelRenderer(this);
		barrelSR25.setRotationPoint(0.0F, 14.5392F, -84.55F);
		barrelSR25.cubeList.add(new ModelBox(barrelSR25, 114, 496, -2.0F, -31.9392F, 42.549F, 1, 1, 21, -0.2F, false));
		barrelSR25.cubeList.add(new ModelBox(barrelSR25, 496, 158, -2.0F, -31.2791F, 14.4302F, 1, 1, 21, -0.2F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.5F, -30.5426F, 32.5143F);
		barrelSR25.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 370, 164, -0.5F, -0.5F, 2.5F, 1, 1, 8, -0.2F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, -2.425F, 27.5F);
		barrelSR25.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 336, 174, -1.999F, -26.125F, -47.5F, 1, 1, 40, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 328, 338, -2.7061F, -26.8321F, -47.5F, 1, 1, 40, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 246, 339, -1.2919F, -26.8321F, -47.5F, 1, 1, 40, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 82, 340, -1.999F, -27.5392F, -47.5F, 1, 1, 40, 0.0F, false));

		gun_r1 = new ModelRenderer(this);
		gun_r1.setRotationPoint(-3.0597F, -25.7714F, -10.0F);
		bone3.addChild(gun_r1);
		setRotationAngle(gun_r1, 0.0F, 0.0F, 0.7854F);
		gun_r1.cubeList.add(new ModelBox(gun_r1, 102, 0, -0.5F, -2.0F, -37.5F, 1, 1, 50, 0.0F, false));

		gun_r2 = new ModelRenderer(this);
		gun_r2.setRotationPoint(-0.6454F, -27.1857F, -10.0F);
		bone3.addChild(gun_r2);
		setRotationAngle(gun_r2, 0.0F, 0.0F, 0.7854F);
		gun_r2.cubeList.add(new ModelBox(gun_r2, 0, 102, -0.5F, 0.0F, -37.5F, 1, 1, 50, 0.0F, false));

		gun_r3 = new ModelRenderer(this);
		gun_r3.setRotationPoint(-2.3525F, -25.4785F, -10.0F);
		bone3.addChild(gun_r3);
		setRotationAngle(gun_r3, 0.0F, 0.0F, 0.7854F);
		gun_r3.cubeList.add(new ModelBox(gun_r3, 0, 51, -0.5F, -1.0F, -37.5F, 1, 1, 50, 0.0F, false));

		gun_r4 = new ModelRenderer(this);
		gun_r4.setRotationPoint(0.0617F, -26.8928F, -10.0F);
		bone3.addChild(gun_r4);
		setRotationAngle(gun_r4, 0.0F, 0.0F, 0.7854F);
		gun_r4.cubeList.add(new ModelBox(gun_r4, 0, 0, -0.5F, 1.0F, -37.5F, 1, 1, 50, 0.0F, false));

		gun_r5 = new ModelRenderer(this);
		gun_r5.setRotationPoint(-1.499F, -26.3321F, 10.5037F);
		bone3.addChild(gun_r5);
		setRotationAngle(gun_r5, -0.0087F, 0.0F, -1.5708F);
		gun_r5.cubeList.add(new ModelBox(gun_r5, 312, 457, -0.5F, 0.3642F, -17.9925F, 1, 1, 38, 0.0F, false));

		gun_r6 = new ModelRenderer(this);
		gun_r6.setRotationPoint(-1.499F, -25.783F, 10.5055F);
		bone3.addChild(gun_r6);
		setRotationAngle(gun_r6, 0.0056F, -0.0067F, 2.4434F);
		gun_r6.cubeList.add(new ModelBox(gun_r6, 156, 457, -1.0766F, -0.8393F, -17.9942F, 1, 1, 38, 0.0F, false));

		gun_r7 = new ModelRenderer(this);
		gun_r7.setRotationPoint(-1.499F, -25.783F, 10.5055F);
		bone3.addChild(gun_r7);
		setRotationAngle(gun_r7, 0.0056F, 0.0067F, 2.2689F);
		gun_r7.cubeList.add(new ModelBox(gun_r7, 446, 0, -0.697F, -0.907F, -17.999F, 1, 1, 38, 0.0F, false));

		gun_r8 = new ModelRenderer(this);
		gun_r8.setRotationPoint(-1.499F, -25.783F, 10.5055F);
		bone3.addChild(gun_r8);
		setRotationAngle(gun_r8, 0.0056F, -0.0067F, -2.2689F);
		gun_r8.cubeList.add(new ModelBox(gun_r8, 0, 439, -0.303F, -0.907F, -17.999F, 1, 1, 38, 0.0F, false));

		gun_r9 = new ModelRenderer(this);
		gun_r9.setRotationPoint(-1.499F, -25.783F, 10.5055F);
		bone3.addChild(gun_r9);
		setRotationAngle(gun_r9, 0.0056F, 0.0067F, -2.4434F);
		gun_r9.cubeList.add(new ModelBox(gun_r9, 432, 78, 0.0766F, -0.8393F, -17.9942F, 1, 1, 38, 0.0F, false));

		gun_r10 = new ModelRenderer(this);
		gun_r10.setRotationPoint(-1.499F, -26.8812F, 10.5055F);
		bone3.addChild(gun_r10);
		setRotationAngle(gun_r10, 0.0056F, -0.0067F, 0.8726F);
		gun_r10.cubeList.add(new ModelBox(gun_r10, 432, 39, -0.303F, -0.907F, -17.999F, 1, 1, 38, 0.0F, false));

		gun_r11 = new ModelRenderer(this);
		gun_r11.setRotationPoint(-1.499F, -26.8812F, 10.5055F);
		bone3.addChild(gun_r11);
		setRotationAngle(gun_r11, 0.0056F, 0.0067F, 0.6982F);
		gun_r11.cubeList.add(new ModelBox(gun_r11, 430, 119, 0.0766F, -0.8393F, -17.9942F, 1, 1, 38, 0.0F, false));

		gun_r12 = new ModelRenderer(this);
		gun_r12.setRotationPoint(-1.499F, -26.8812F, 10.5055F);
		bone3.addChild(gun_r12);
		setRotationAngle(gun_r12, 0.0056F, -0.0067F, -0.6982F);
		gun_r12.cubeList.add(new ModelBox(gun_r12, 78, 420, -1.0766F, -0.8393F, -17.9942F, 1, 1, 38, 0.0F, false));

		gun_r13 = new ModelRenderer(this);
		gun_r13.setRotationPoint(-1.499F, -26.3321F, 10.5037F);
		bone3.addChild(gun_r13);
		setRotationAngle(gun_r13, 0.0087F, 0.0F, -1.5708F);
		gun_r13.cubeList.add(new ModelBox(gun_r13, 234, 419, -0.5F, -1.3642F, -17.9925F, 1, 1, 38, 0.0F, false));

		gun_r14 = new ModelRenderer(this);
		gun_r14.setRotationPoint(-1.499F, -26.3321F, 2.5018F);
		bone3.addChild(gun_r14);
		setRotationAngle(gun_r14, 0.0F, 0.0F, -1.5708F);
		gun_r14.cubeList.add(new ModelBox(gun_r14, 468, 208, -0.5F, 0.2071F, -10.0018F, 1, 1, 4, 0.0F, false));

		gun_r15 = new ModelRenderer(this);
		gun_r15.setRotationPoint(-1.499F, -26.3321F, 10.5037F);
		bone3.addChild(gun_r15);
		setRotationAngle(gun_r15, -0.0087F, 0.0F, 0.0F);
		gun_r15.cubeList.add(new ModelBox(gun_r15, 398, 418, -0.5F, 0.3642F, -17.9925F, 1, 1, 38, 0.0F, false));

		gun_r16 = new ModelRenderer(this);
		gun_r16.setRotationPoint(-1.499F, -26.8812F, 10.5055F);
		bone3.addChild(gun_r16);
		setRotationAngle(gun_r16, 0.0056F, 0.0067F, -0.8726F);
		gun_r16.cubeList.add(new ModelBox(gun_r16, 320, 418, -0.697F, -0.907F, -17.999F, 1, 1, 38, 0.0F, false));

		gun_r17 = new ModelRenderer(this);
		gun_r17.setRotationPoint(-1.499F, -26.3321F, 10.5037F);
		bone3.addChild(gun_r17);
		setRotationAngle(gun_r17, 0.0087F, 0.0F, 0.0F);
		gun_r17.cubeList.add(new ModelBox(gun_r17, 418, 164, -0.5F, -1.3642F, -17.9925F, 1, 1, 38, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 2.425F, -27.5F);
		barrelSR25.addChild(bone4);
		bone4.cubeList.add(new ModelBox(bone4, 144, 489, -2.9182F, -31.695F, 39.9F, 1, 1, 3, 0.15F, false));
		bone4.cubeList.add(new ModelBox(bone4, 492, 447, -1.0798F, -31.695F, 39.9F, 1, 1, 3, 0.15F, false));
		bone4.cubeList.add(new ModelBox(bone4, 492, 451, -1.999F, -32.6142F, 39.9F, 1, 1, 3, 0.15F, false));
		bone4.cubeList.add(new ModelBox(bone4, 136, 469, -2.499F, -33.5642F, 39.9F, 2, 2, 3, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 146, 473, -2.499F, -30.4642F, 39.9F, 2, 1, 3, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 496, 197, -1.999F, -30.7757F, 39.9F, 1, 1, 3, 0.15F, false));

		gun_r18 = new ModelRenderer(this);
		gun_r18.setRotationPoint(0.2117F, -31.6056F, 35.4F);
		bone4.addChild(gun_r18);
		setRotationAngle(gun_r18, 0.0F, 0.0F, 0.7854F);
		gun_r18.cubeList.add(new ModelBox(gun_r18, 122, 492, -0.5F, 1.0F, 4.5F, 1, 1, 3, 0.15F, false));

		gun_r19 = new ModelRenderer(this);
		gun_r19.setRotationPoint(-0.4955F, -32.1985F, 35.4F);
		bone4.addChild(gun_r19);
		setRotationAngle(gun_r19, 0.0F, 0.0F, 0.7854F);
		gun_r19.cubeList.add(new ModelBox(gun_r19, 114, 492, -0.5F, 0.0F, 4.5F, 1, 1, 3, 0.15F, false));

		gun_r20 = new ModelRenderer(this);
		gun_r20.setRotationPoint(-3.2097F, -30.7843F, 35.4F);
		bone4.addChild(gun_r20);
		setRotationAngle(gun_r20, 0.0F, 0.0F, 0.7854F);
		gun_r20.cubeList.add(new ModelBox(gun_r20, 130, 490, -0.5F, -2.0F, 4.5F, 1, 1, 3, 0.15F, false));

		gun_r21 = new ModelRenderer(this);
		gun_r21.setRotationPoint(-2.5025F, -30.1914F, 35.4F);
		bone4.addChild(gun_r21);
		setRotationAngle(gun_r21, 0.0F, 0.0F, 0.7854F);
		gun_r21.cubeList.add(new ModelBox(gun_r21, 488, 364, -0.5F, -1.0F, 4.5F, 1, 1, 3, 0.15F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-7.0981F, -34.5845F, 32.132F);
		bone4.addChild(bone7);
		bone7.cubeList.add(new ModelBox(bone7, 512, 514, 4.5995F, 0.2706F, 8.788F, 2, 1, 1, -0.199F, false));
		bone7.cubeList.add(new ModelBox(bone7, 202, 515, 4.5995F, 0.2706F, 9.988F, 2, 1, 1, -0.198F, false));
		bone7.cubeList.add(new ModelBox(bone7, 208, 515, 4.5995F, 0.2706F, 7.538F, 2, 1, 1, -0.199F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-9.1993F, -1.0809F, -13.907F);
		bone7.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.8901F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 496, 364, 9.7655F, -9.9526F, 21.695F, 1, 1, 3, -0.35F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 522, 81, 9.8155F, -10.1026F, 21.445F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 522, 83, 9.8155F, -10.1026F, 23.895F, 1, 1, 1, -0.197F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 84, 522, 9.8155F, -10.1026F, 22.695F, 1, 1, 1, -0.198F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-7.5993F, -1.0809F, -13.907F);
		bone7.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.8901F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 374, 496, 6.854F, 11.8055F, 21.695F, 1, 1, 3, -0.35F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 522, 85, 6.804F, 11.6555F, 21.445F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 522, 87, 6.804F, 11.6555F, 23.895F, 1, 1, 1, -0.197F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 88, 522, 6.804F, 11.6555F, 22.695F, 1, 1, 1, -0.198F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(-1.4981F, -28.5545F, 32.132F);
		bone4.addChild(bone11);
		setRotationAngle(bone11, 0.0F, 0.0F, -3.1416F);
		

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-14.7993F, -1.1109F, -13.907F);
		bone11.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.8901F);
		

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-13.1993F, -1.1109F, -13.907F);
		bone11.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.8901F);
		
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		barrelSR25.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}