package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M110Barrel extends ModelBase {
	private final ModelRenderer barrelM110;
	private final ModelRenderer cube_r1;
	private final ModelRenderer bone27;
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
	private final ModelRenderer bone26;
	private final ModelRenderer gun_r18;
	private final ModelRenderer gun_r19;
	private final ModelRenderer gun_r20;
	private final ModelRenderer gun_r21;
	private final ModelRenderer gun_r22;
	private final ModelRenderer gun_r23;
	private final ModelRenderer gun_r24;
	private final ModelRenderer gun_r25;
	private final ModelRenderer bone10;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer bone9;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;

	public M110Barrel() {
		textureWidth = 544;
		textureHeight = 544;

		barrelM110 = new ModelRenderer(this);
		barrelM110.setRotationPoint(0.0F, 14.5392F, -84.55F);
		barrelM110.cubeList.add(new ModelBox(barrelM110, 286, 473, -2.0F, -31.9392F, 42.549F, 1, 1, 21, -0.2F, false));
		barrelM110.cubeList.add(new ModelBox(barrelM110, 140, 477, -2.0F, -31.2791F, 14.4302F, 1, 1, 21, -0.2F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.5F, -30.5426F, 32.5143F);
		barrelM110.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 368, 158, -0.5F, -0.5F, 2.5F, 1, 1, 8, -0.2F, false));

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(0.0F, -2.425F, 27.5F);
		barrelM110.addChild(bone27);
		bone27.cubeList.add(new ModelBox(bone27, 474, 209, -1.999F, -26.125F, -32.5F, 1, 1, 25, 0.0F, false));
		bone27.cubeList.add(new ModelBox(bone27, 474, 235, -2.7061F, -26.8321F, -32.5F, 1, 1, 25, 0.0F, false));
		bone27.cubeList.add(new ModelBox(bone27, 474, 261, -1.2919F, -26.8321F, -32.5F, 1, 1, 25, 0.0F, false));
		bone27.cubeList.add(new ModelBox(bone27, 474, 287, -1.999F, -27.5392F, -32.5F, 1, 1, 25, 0.0F, false));

		gun_r1 = new ModelRenderer(this);
		gun_r1.setRotationPoint(-3.0597F, -25.7714F, -10.0F);
		bone27.addChild(gun_r1);
		setRotationAngle(gun_r1, 0.0F, 0.0F, 0.7854F);
		gun_r1.cubeList.add(new ModelBox(gun_r1, 72, 379, -0.5F, -2.0F, -22.5F, 1, 1, 35, 0.0F, false));

		gun_r2 = new ModelRenderer(this);
		gun_r2.setRotationPoint(-0.6454F, -27.1857F, -10.0F);
		bone27.addChild(gun_r2);
		setRotationAngle(gun_r2, 0.0F, 0.0F, 0.7854F);
		gun_r2.cubeList.add(new ModelBox(gun_r2, 0, 379, -0.5F, 0.0F, -22.5F, 1, 1, 35, 0.0F, false));

		gun_r3 = new ModelRenderer(this);
		gun_r3.setRotationPoint(-2.3525F, -25.4785F, -10.0F);
		bone27.addChild(gun_r3);
		setRotationAngle(gun_r3, 0.0F, 0.0F, 0.7854F);
		gun_r3.cubeList.add(new ModelBox(gun_r3, 228, 377, -0.5F, -1.0F, -22.5F, 1, 1, 35, 0.0F, false));

		gun_r4 = new ModelRenderer(this);
		gun_r4.setRotationPoint(0.0617F, -26.8928F, -10.0F);
		bone27.addChild(gun_r4);
		setRotationAngle(gun_r4, 0.0F, 0.0F, 0.7854F);
		gun_r4.cubeList.add(new ModelBox(gun_r4, 156, 377, -0.5F, 1.0F, -22.5F, 1, 1, 35, 0.0F, false));

		gun_r5 = new ModelRenderer(this);
		gun_r5.setRotationPoint(-1.499F, -26.3321F, 10.5037F);
		bone27.addChild(gun_r5);
		setRotationAngle(gun_r5, -0.0087F, 0.0F, -1.5708F);
		gun_r5.cubeList.add(new ModelBox(gun_r5, 344, 0, -0.5F, 0.3642F, -17.9925F, 1, 1, 38, 0.0F, false));

		gun_r6 = new ModelRenderer(this);
		gun_r6.setRotationPoint(-1.499F, -25.783F, 10.5055F);
		bone27.addChild(gun_r6);
		setRotationAngle(gun_r6, 0.0056F, -0.0067F, 2.4434F);
		gun_r6.cubeList.add(new ModelBox(gun_r6, 342, 170, -1.0766F, -0.8393F, -17.9942F, 1, 1, 38, 0.0F, false));

		gun_r7 = new ModelRenderer(this);
		gun_r7.setRotationPoint(-1.499F, -25.783F, 10.5055F);
		bone27.addChild(gun_r7);
		setRotationAngle(gun_r7, 0.0056F, 0.0067F, 2.2689F);
		gun_r7.cubeList.add(new ModelBox(gun_r7, 78, 340, -0.697F, -0.907F, -17.999F, 1, 1, 38, 0.0F, false));

		gun_r8 = new ModelRenderer(this);
		gun_r8.setRotationPoint(-1.499F, -25.783F, 10.5055F);
		bone27.addChild(gun_r8);
		setRotationAngle(gun_r8, 0.0056F, -0.0067F, -2.2689F);
		gun_r8.cubeList.add(new ModelBox(gun_r8, 0, 340, -0.303F, -0.907F, -17.999F, 1, 1, 38, 0.0F, false));

		gun_r9 = new ModelRenderer(this);
		gun_r9.setRotationPoint(-1.499F, -25.783F, 10.5055F);
		bone27.addChild(gun_r9);
		setRotationAngle(gun_r9, 0.0056F, 0.0067F, -2.4434F);
		gun_r9.cubeList.add(new ModelBox(gun_r9, 234, 338, 0.0766F, -0.8393F, -17.9942F, 1, 1, 38, 0.0F, false));

		gun_r10 = new ModelRenderer(this);
		gun_r10.setRotationPoint(-1.499F, -26.8812F, 10.5055F);
		bone27.addChild(gun_r10);
		setRotationAngle(gun_r10, 0.0056F, -0.0067F, 0.8726F);
		gun_r10.cubeList.add(new ModelBox(gun_r10, 156, 338, -0.303F, -0.907F, -17.999F, 1, 1, 38, 0.0F, false));

		gun_r11 = new ModelRenderer(this);
		gun_r11.setRotationPoint(-1.499F, -26.8812F, 10.5055F);
		bone27.addChild(gun_r11);
		setRotationAngle(gun_r11, 0.0056F, 0.0067F, 0.6982F);
		gun_r11.cubeList.add(new ModelBox(gun_r11, 328, 334, 0.0766F, -0.8393F, -17.9942F, 1, 1, 38, 0.0F, false));

		gun_r12 = new ModelRenderer(this);
		gun_r12.setRotationPoint(-1.499F, -26.8812F, 10.5055F);
		bone27.addChild(gun_r12);
		setRotationAngle(gun_r12, 0.0056F, -0.0067F, -0.6982F);
		gun_r12.cubeList.add(new ModelBox(gun_r12, 330, 215, -1.0766F, -0.8393F, -17.9942F, 1, 1, 38, 0.0F, false));

		gun_r13 = new ModelRenderer(this);
		gun_r13.setRotationPoint(-1.499F, -26.3321F, 10.5037F);
		bone27.addChild(gun_r13);
		setRotationAngle(gun_r13, 0.0087F, 0.0F, -1.5708F);
		gun_r13.cubeList.add(new ModelBox(gun_r13, 328, 295, -0.5F, -1.3642F, -17.9925F, 1, 1, 38, 0.0F, false));

		gun_r14 = new ModelRenderer(this);
		gun_r14.setRotationPoint(-1.499F, -26.3321F, 2.5018F);
		bone27.addChild(gun_r14);
		setRotationAngle(gun_r14, 0.0F, 0.0F, -1.5708F);
		gun_r14.cubeList.add(new ModelBox(gun_r14, 386, 77, -0.5F, 0.2071F, -10.0018F, 1, 1, 4, 0.0F, false));

		gun_r15 = new ModelRenderer(this);
		gun_r15.setRotationPoint(-1.499F, -26.3321F, 10.5037F);
		bone27.addChild(gun_r15);
		setRotationAngle(gun_r15, -0.0087F, 0.0F, 0.0F);
		gun_r15.cubeList.add(new ModelBox(gun_r15, 328, 256, -0.5F, 0.3642F, -17.9925F, 1, 1, 38, 0.0F, false));

		gun_r16 = new ModelRenderer(this);
		gun_r16.setRotationPoint(-1.499F, -26.8812F, 10.5055F);
		bone27.addChild(gun_r16);
		setRotationAngle(gun_r16, 0.0056F, 0.0067F, -0.8726F);
		gun_r16.cubeList.add(new ModelBox(gun_r16, 78, 301, -0.697F, -0.907F, -17.999F, 1, 1, 38, 0.0F, false));

		gun_r17 = new ModelRenderer(this);
		gun_r17.setRotationPoint(-1.499F, -26.3321F, 10.5037F);
		bone27.addChild(gun_r17);
		setRotationAngle(gun_r17, 0.0087F, 0.0F, 0.0F);
		gun_r17.cubeList.add(new ModelBox(gun_r17, 0, 301, -0.5F, -1.3642F, -17.9925F, 1, 1, 38, 0.0F, false));

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(0.0F, 2.425F, -27.5F);
		barrelM110.addChild(bone26);
		bone26.cubeList.add(new ModelBox(bone26, 62, 515, -2.8475F, -31.6907F, 20.5F, 1, 1, 2, 0.1F, false));
		bone26.cubeList.add(new ModelBox(bone26, 68, 515, -1.999F, -30.8422F, 20.5F, 1, 1, 2, 0.1F, false));
		bone26.cubeList.add(new ModelBox(bone26, 74, 515, -1.1505F, -31.6907F, 20.5F, 1, 1, 2, 0.1F, false));
		bone26.cubeList.add(new ModelBox(bone26, 80, 515, -1.999F, -32.5392F, 20.5F, 1, 1, 2, 0.1F, false));
		bone26.cubeList.add(new ModelBox(bone26, 226, 516, -1.999F, -32.5392F, 37.7F, 1, 1, 2, 0.1F, false));
		bone26.cubeList.add(new ModelBox(bone26, 232, 516, -1.1505F, -31.6907F, 37.7F, 1, 1, 2, 0.1F, false));
		bone26.cubeList.add(new ModelBox(bone26, 244, 516, -1.999F, -30.8422F, 37.7F, 1, 1, 2, 0.1F, false));
		bone26.cubeList.add(new ModelBox(bone26, 290, 516, -2.8475F, -31.6907F, 37.7F, 1, 1, 2, 0.1F, false));
		bone26.cubeList.add(new ModelBox(bone26, 244, 521, -1.1505F, -31.6907F, 15.5F, 1, 1, 1, 0.1F, false));
		bone26.cubeList.add(new ModelBox(bone26, 280, 521, -2.8475F, -31.6907F, 15.5F, 1, 1, 1, 0.1F, false));
		bone26.cubeList.add(new ModelBox(bone26, 472, 524, -1.999F, -32.5392F, 15.5F, 1, 1, 1, 0.1F, false));
		bone26.cubeList.add(new ModelBox(bone26, 524, 500, -1.999F, -30.8422F, 15.5F, 1, 1, 1, 0.1F, false));
		bone26.cubeList.add(new ModelBox(bone26, 454, 116, -2.9182F, -31.695F, 39.9F, 1, 1, 3, 0.15F, false));
		bone26.cubeList.add(new ModelBox(bone26, 462, 437, -1.0798F, -31.695F, 39.9F, 1, 1, 3, 0.15F, false));
		bone26.cubeList.add(new ModelBox(bone26, 470, 116, -1.999F, -32.6142F, 39.9F, 1, 1, 3, 0.15F, false));
		bone26.cubeList.add(new ModelBox(bone26, 396, 77, -2.499F, -33.5642F, 39.9F, 2, 2, 3, 0.0F, false));
		bone26.cubeList.add(new ModelBox(bone26, 274, 170, -2.499F, -30.2642F, 39.9F, 2, 1, 3, 0.0F, false));
		bone26.cubeList.add(new ModelBox(bone26, 470, 437, -1.999F, -30.7757F, 39.9F, 1, 1, 3, 0.15F, false));

		gun_r18 = new ModelRenderer(this);
		gun_r18.setRotationPoint(0.2117F, -31.6056F, 35.4F);
		bone26.addChild(gun_r18);
		setRotationAngle(gun_r18, 0.0F, 0.0F, 0.7854F);
		gun_r18.cubeList.add(new ModelBox(gun_r18, 462, 116, -0.5F, 1.0F, 4.5F, 1, 1, 3, 0.15F, false));

		gun_r19 = new ModelRenderer(this);
		gun_r19.setRotationPoint(-0.4955F, -32.1985F, 35.4F);
		bone26.addChild(gun_r19);
		setRotationAngle(gun_r19, 0.0F, 0.0F, 0.7854F);
		gun_r19.cubeList.add(new ModelBox(gun_r19, 456, 250, -0.5F, 0.0F, 4.5F, 1, 1, 3, 0.15F, false));

		gun_r20 = new ModelRenderer(this);
		gun_r20.setRotationPoint(-3.2097F, -30.7843F, 35.4F);
		bone26.addChild(gun_r20);
		setRotationAngle(gun_r20, 0.0F, 0.0F, 0.7854F);
		gun_r20.cubeList.add(new ModelBox(gun_r20, 454, 437, -0.5F, -2.0F, 4.5F, 1, 1, 3, 0.15F, false));

		gun_r21 = new ModelRenderer(this);
		gun_r21.setRotationPoint(-2.5025F, -30.1914F, 35.4F);
		bone26.addChild(gun_r21);
		setRotationAngle(gun_r21, 0.0F, 0.0F, 0.7854F);
		gun_r21.cubeList.add(new ModelBox(gun_r21, 448, 250, -0.5F, -1.0F, 4.5F, 1, 1, 3, 0.15F, false));

		gun_r22 = new ModelRenderer(this);
		gun_r22.setRotationPoint(-3.1597F, -30.73F, 35.2F);
		bone26.addChild(gun_r22);
		setRotationAngle(gun_r22, 0.0F, 0.0F, 0.7854F);
		gun_r22.cubeList.add(new ModelBox(gun_r22, 296, 516, -0.5F, -2.0F, 2.5F, 1, 1, 2, 0.1F, false));
		gun_r22.cubeList.add(new ModelBox(gun_r22, 386, 158, -0.5F, -2.0F, -19.7F, 1, 1, 7, 0.1F, false));

		gun_r23 = new ModelRenderer(this);
		gun_r23.setRotationPoint(-2.4526F, -30.2371F, 35.2F);
		bone26.addChild(gun_r23);
		setRotationAngle(gun_r23, 0.0F, 0.0F, 0.7854F);
		gun_r23.cubeList.add(new ModelBox(gun_r23, 284, 516, -0.5F, -1.0F, 2.5F, 1, 1, 2, 0.1F, false));
		gun_r23.cubeList.add(new ModelBox(gun_r23, 402, 158, -0.5F, -1.0F, -19.7F, 1, 1, 7, 0.1F, false));

		gun_r24 = new ModelRenderer(this);
		gun_r24.setRotationPoint(0.1617F, -31.6513F, 35.2F);
		bone26.addChild(gun_r24);
		setRotationAngle(gun_r24, 0.0F, 0.0F, 0.7854F);
		gun_r24.cubeList.add(new ModelBox(gun_r24, 238, 516, -0.5F, 1.0F, 2.5F, 1, 1, 2, 0.1F, false));
		gun_r24.cubeList.add(new ModelBox(gun_r24, 408, 243, -0.5F, 1.0F, -19.7F, 1, 1, 7, 0.1F, false));

		gun_r25 = new ModelRenderer(this);
		gun_r25.setRotationPoint(-0.5454F, -32.1442F, 35.2F);
		bone26.addChild(gun_r25);
		setRotationAngle(gun_r25, 0.0F, 0.0F, 0.7854F);
		gun_r25.cubeList.add(new ModelBox(gun_r25, 18, 516, -0.5F, 0.0F, 2.5F, 1, 1, 2, 0.1F, false));
		gun_r25.cubeList.add(new ModelBox(gun_r25, 424, 243, -0.5F, 0.0F, -19.7F, 1, 1, 7, 0.1F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(-7.0981F, -34.5845F, 32.132F);
		bone26.addChild(bone10);
		bone10.cubeList.add(new ModelBox(bone10, 182, 519, 4.5995F, 0.2706F, 8.788F, 2, 1, 1, -0.199F, false));
		bone10.cubeList.add(new ModelBox(bone10, 188, 519, 4.5995F, 0.2706F, 9.988F, 2, 1, 1, -0.198F, false));
		bone10.cubeList.add(new ModelBox(bone10, 194, 519, 4.5995F, 0.2706F, 7.538F, 2, 1, 1, -0.199F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-9.1993F, -1.0809F, -13.907F);
		bone10.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, 0.8901F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 510, 420, 9.7655F, -9.9526F, 21.695F, 1, 1, 3, -0.35F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 524, 502, 9.8155F, -10.1026F, 21.445F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 524, 504, 9.8155F, -10.1026F, 23.895F, 1, 1, 1, -0.197F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 524, 506, 9.8155F, -10.1026F, 22.695F, 1, 1, 1, -0.198F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-7.5993F, -1.0809F, -13.907F);
		bone10.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.8901F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 510, 424, 6.854F, 11.8055F, 21.695F, 1, 1, 3, -0.35F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 524, 508, 6.804F, 11.6555F, 21.445F, 1, 1, 1, -0.198F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 510, 524, 6.804F, 11.6555F, 23.895F, 1, 1, 1, -0.197F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 524, 510, 6.804F, 11.6555F, 22.695F, 1, 1, 1, -0.198F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-1.4981F, -28.5545F, 32.132F);
		bone26.addChild(bone9);
		setRotationAngle(bone9, 0.0F, 0.0F, -3.1416F);
		bone9.cubeList.add(new ModelBox(bone9, 200, 519, -1.0005F, 0.2406F, 8.788F, 2, 1, 1, -0.199F, false));
		bone9.cubeList.add(new ModelBox(bone9, 206, 519, -1.0005F, 0.2406F, 9.988F, 2, 1, 1, -0.198F, false));
		bone9.cubeList.add(new ModelBox(bone9, 212, 519, -1.0005F, 0.2406F, 7.538F, 2, 1, 1, -0.199F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-14.7993F, -1.1109F, -13.907F);
		bone9.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.8901F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 510, 428, 9.7655F, -9.9526F, 21.695F, 1, 1, 3, -0.35F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 524, 512, 9.8155F, -10.1026F, 21.445F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 514, 524, 9.8155F, -10.1026F, 23.895F, 1, 1, 1, -0.197F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 524, 514, 9.8155F, -10.1026F, 22.695F, 1, 1, 1, -0.198F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-13.1993F, -1.1109F, -13.907F);
		bone9.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.8901F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 510, 432, 6.854F, 11.8055F, 21.695F, 1, 1, 3, -0.35F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 524, 516, 6.804F, 11.6555F, 21.445F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 518, 524, 6.804F, 11.6555F, 23.895F, 1, 1, 1, -0.197F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 524, 518, 6.804F, 11.6555F, 22.695F, 1, 1, 1, -0.198F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		barrelM110.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}