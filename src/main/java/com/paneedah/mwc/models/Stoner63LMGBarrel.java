package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Stoner63LMGBarrel extends ModelBase {
	private final ModelRenderer barrelLMG;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer barrel;
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
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer barrelCarbine;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer frontsight3;
	private final ModelRenderer bone10_r1;
	private final ModelRenderer bone10_r2;

	public Stoner63LMGBarrel() {
		textureWidth = 576;
		textureHeight = 576;

		barrelLMG = new ModelRenderer(this);
		barrelLMG.setRotationPoint(-1.55F, -18.4831F, -86.375F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.5286F, 4.8263F, 31.0862F);
		barrelLMG.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -3.1416F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 71, 548, -3.5714F, -2.0432F, -30.5112F, 4, 6, 1, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 505, 547, -3.5714F, -2.0432F, -32.8112F, 4, 6, 1, -0.2F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.5286F, 2.3263F, 31.0862F);
		barrelLMG.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -3.1416F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 552, 429, -3.5714F, -5.1432F, -30.5112F, 4, 1, 1, -0.2F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 547, 151, -3.5714F, -5.1432F, -32.8112F, 4, 1, 3, -0.2F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1.5286F, 5.2263F, 31.0862F);
		barrelLMG.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -3.1416F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 547, 142, -3.0714F, -1.8432F, -32.3112F, 3, 6, 2, 0.0F, false));

		barrel = new ModelRenderer(this);
		barrel.setRotationPoint(1.5F, 51.4831F, 60.375F);
		barrelLMG.addChild(barrel);
		

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-2.5286F, -46.1568F, -29.2888F);
		barrel.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 2.3562F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 562, 526, -3.0084F, 1.4125F, -56.7112F, 1, 1, 1, 0.15F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 527, 562, -3.9277F, 0.4932F, -56.7112F, 1, 1, 1, 0.15F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 562, 529, -3.0084F, -0.426F, -56.7112F, 1, 1, 1, 0.15F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 562, 532, -2.0892F, 0.4932F, -56.7112F, 1, 1, 1, 0.15F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 170, -3.9277F, 0.4932F, -51.7112F, 1, 1, 78, 0.15F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 159, 170, -3.0084F, 1.4125F, -51.7112F, 1, 1, 78, 0.15F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 250, -3.0084F, -0.426F, -51.7112F, 1, 1, 78, 0.15F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 159, 250, -2.0892F, 0.4932F, -51.7112F, 1, 1, 78, 0.15F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-2.5993F, -46.1861F, -24.2888F);
		barrel.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -3.1416F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 549, 411, -0.6522F, 1.9761F, -15.7112F, 1, 1, 4, 0.2F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-2.5786F, -46.1361F, -24.2888F);
		barrel.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 2.3562F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 549, 417, -2.0892F, 0.4932F, -15.7112F, 1, 1, 4, 0.2F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-2.4786F, -46.1361F, -24.2888F);
		barrel.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 2.3562F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 549, 423, -3.0084F, -0.426F, -15.7112F, 1, 1, 4, 0.2F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-2.5286F, -49.0154F, -27.2888F);
		barrel.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -3.1416F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 171, 558, -1.5714F, 1.0568F, -12.7112F, 1, 3, 1, 0.2F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 166, 558, -1.5714F, 1.0568F, -9.7112F, 1, 3, 1, 0.2F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-4.5385F, -51.9158F, -25.9523F);
		barrel.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.5672F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 182, 524, -2.4343F, -0.5079F, 0.3665F, 1, 1, 6, 0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 120, 545, -3.2828F, 0.3406F, 0.3665F, 1, 1, 6, 0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 150, 545, -4.1314F, -0.5079F, 0.3665F, 1, 1, 6, 0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 546, -3.2828F, -1.3564F, 0.3665F, 1, 1, 6, 0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 563, 143, -2.4343F, -0.4921F, 8.5477F, 1, 1, 1, 0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 167, 563, -3.2828F, 0.3565F, 8.5477F, 1, 1, 1, 0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 208, 563, -4.1314F, -0.4921F, 8.5477F, 1, 1, 1, 0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 563, 229, -3.2828F, -1.3406F, 8.5477F, 1, 1, 1, 0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 112, 563, -3.2828F, 0.3565F, -2.8146F, 1, 1, 1, 0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 563, 140, -2.4343F, -0.4921F, -2.8146F, 1, 1, 1, 0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 91, 563, -4.1314F, -0.4921F, -2.8146F, 1, 1, 1, 0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 58, 563, -3.2828F, -1.3406F, -2.8146F, 1, 1, 1, 0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 529, 438, -3.2828F, -0.4564F, -5.6335F, 1, 1, 10, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 548, 235, -2.5757F, -0.4564F, -6.3406F, 6, 1, 1, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 203, 532, 3.1314F, -0.4564F, -15.0477F, 1, 1, 9, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-4.5385F, -51.9158F, -25.9523F);
		barrel.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -1.3526F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 224, 532, -2.4622F, -1.6248F, 0.3665F, 1, 1, 6, 0.1F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 135, 545, -1.6136F, -2.4734F, 0.3665F, 1, 1, 6, 0.1F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 165, 545, -3.3107F, -2.4734F, 0.3665F, 1, 1, 6, 0.1F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 335, 545, -2.4622F, -3.3219F, 0.3665F, 1, 1, 6, 0.1F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 162, 563, -2.4734F, -1.6136F, 8.5477F, 1, 1, 1, 0.1F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 203, 563, -1.6248F, -2.4622F, 8.5477F, 1, 1, 1, 0.1F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 213, 563, -3.3219F, -2.4622F, 8.5477F, 1, 1, 1, 0.1F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 218, 563, -2.4734F, -3.3107F, 8.5477F, 1, 1, 1, 0.1F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 96, 563, -1.6248F, -2.4622F, -2.8146F, 1, 1, 1, 0.1F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 125, 563, -2.4734F, -1.6136F, -2.8146F, 1, 1, 1, 0.1F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 86, 563, -3.3219F, -2.4622F, -2.8146F, 1, 1, 1, 0.1F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 81, 563, -2.4734F, -3.3107F, -2.8146F, 1, 1, 1, 0.1F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-4.5385F, -51.9158F, -25.9523F);
		barrel.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.1745F, 0.0F, -0.5672F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 54, 557, -3.2828F, 1.4728F, 6.2126F, 1, 1, 2, 0.1F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 557, 51, -3.2828F, -1.288F, -1.5846F, 1, 1, 2, 0.1F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-4.5385F, -51.9158F, -25.9523F);
		barrel.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.1745F, 0.0F, -1.3526F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 557, 55, -2.4734F, -0.4673F, 6.5547F, 1, 1, 2, 0.1F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 557, 47, -2.4734F, -3.2282F, -1.2425F, 1, 1, 2, 0.1F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-4.5385F, -51.9158F, -25.9523F);
		barrel.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, -0.1745F, -1.3526F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 557, 59, -0.4784F, -2.4622F, 6.5567F, 1, 1, 2, 0.1F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 557, 43, -3.2392F, -2.4622F, -1.2405F, 1, 1, 2, 0.1F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-4.5385F, -51.9158F, -25.9523F);
		barrel.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, -0.1745F, -0.5672F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 108, 557, -1.2755F, -0.4921F, 6.6973F, 1, 1, 2, 0.1F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 557, 39, -4.0364F, -0.4921F, -1.1F, 1, 1, 2, 0.1F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-4.5385F, -51.9158F, -25.9523F);
		barrel.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.1745F, -1.3526F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 558, 121, -4.4084F, -2.4622F, 5.8713F, 1, 1, 2, 0.1F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 557, 35, -1.6476F, -2.4622F, -1.9259F, 1, 1, 2, 0.1F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-4.5385F, -51.9158F, -25.9523F);
		barrel.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.1745F, 0.0F, -0.5672F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 557, 353, -3.2828F, -2.4572F, 6.2154F, 1, 1, 2, 0.1F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 517, 556, -3.2828F, 0.3036F, -1.5818F, 1, 1, 2, 0.1F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-4.5385F, -51.9158F, -25.9523F);
		barrel.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.1745F, 0.0F, -1.3526F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 557, 357, -2.4734F, -4.3974F, 5.8733F, 1, 1, 2, 0.1F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 487, 556, -2.4734F, -1.6365F, -1.9239F, 1, 1, 2, 0.1F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-4.5385F, -51.9158F, -25.9523F);
		barrel.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.1745F, -0.5672F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 557, 361, -5.2056F, -0.4921F, 5.7308F, 1, 1, 2, 0.1F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 480, 556, -2.4447F, -0.4921F, -2.0665F, 1, 1, 2, 0.1F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-4.5385F, -51.9158F, -25.9523F);
		barrel.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, -0.7854F, -0.5672F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 42, 563, -6.3048F, -0.4564F, -2.6621F, 1, 1, 1, 0.0F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 37, 563, -2.355F, -0.4564F, -7.1977F, 1, 1, 1, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-2.5286F, -52.4154F, -24.2888F);
		barrel.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, -3.1416F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 54, 551, -1.5714F, 1.0568F, -15.7112F, 1, 1, 4, 0.2F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-2.5286F, -46.1154F, -24.2888F);
		barrel.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, -3.1416F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 308, 547, -1.5714F, 1.0568F, -15.7112F, 1, 4, 4, 0.2F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-2.5786F, -46.2361F, -24.2888F);
		barrel.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, 2.3562F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 236, 550, -3.0084F, 1.4125F, -15.7112F, 1, 1, 4, 0.2F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-2.4579F, -46.1861F, -24.2888F);
		barrel.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, -3.1416F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 409, 550, -2.4906F, 1.9761F, -15.7112F, 1, 1, 4, 0.2F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-2.4786F, -46.2361F, -24.2888F);
		barrel.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, 2.3562F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 550, 496, -3.9277F, 0.4932F, -15.7112F, 1, 1, 4, 0.2F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-2.5286F, -46.1568F, -29.2888F);
		barrel.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.0F, -3.1416F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 0, -1.5714F, 2.8953F, -56.7112F, 1, 1, 83, 0.15F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 85, -2.4906F, 1.9761F, -56.7112F, 1, 1, 83, 0.15F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 169, 0, -1.5714F, 1.0568F, -56.7112F, 1, 1, 83, 0.15F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 169, 85, -0.6522F, 1.9761F, -56.7112F, 1, 1, 83, 0.15F, false));

		barrelCarbine = new ModelRenderer(this);
		barrelCarbine.setRotationPoint(1.55F, 40.4831F, 85.375F);
		barrelLMG.addChild(barrelCarbine);
		barrelCarbine.cubeList.add(new ModelBox(barrelCarbine, 479, 532, -2.5F, -40.4F, -86.6F, 2, 6, 2, 0.0F, false));
		barrelCarbine.cubeList.add(new ModelBox(barrelCarbine, 335, 553, -2.0F, -43.4F, -86.6F, 1, 3, 2, 0.0F, false));
		barrelCarbine.cubeList.add(new ModelBox(barrelCarbine, 350, 545, -3.0F, -43.6F, -87.1F, 3, 9, 1, -0.2F, false));
		barrelCarbine.cubeList.add(new ModelBox(barrelCarbine, 549, 176, -3.0F, -43.7F, -87.1F, 3, 1, 3, -0.2F, false));
		barrelCarbine.cubeList.add(new ModelBox(barrelCarbine, 236, 556, -3.0F, -43.7F, -84.8F, 3, 1, 1, -0.2F, false));
		barrelCarbine.cubeList.add(new ModelBox(barrelCarbine, 496, 547, -3.0F, -43.6F, -84.8F, 3, 9, 1, -0.2F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-0.4583F, -43.7366F, -85.45F);
		barrelCarbine.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, 0.1309F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 189, 552, -0.5F, -1.5F, -1.5F, 1, 2, 3, -0.2F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(-0.2061F, -37.488F, -87.05F);
		barrelCarbine.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, 0.0F, -0.1309F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 180, 552, -2.0F, -8.0F, 0.0F, 1, 2, 3, -0.2F, false));

		frontsight3 = new ModelRenderer(this);
		frontsight3.setRotationPoint(-1.4835F, -48.9599F, -46.5128F);
		barrelCarbine.addChild(frontsight3);
		setRotationAngle(frontsight3, -1.5708F, 0.0F, 0.0F);
		

		bone10_r1 = new ModelRenderer(this);
		bone10_r1.setRotationPoint(-0.0165F, -2.4107F, 4.7351F);
		frontsight3.addChild(bone10_r1);
		setRotationAngle(bone10_r1, 1.5708F, 0.0F, 0.0F);
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 398, 559, -0.5F, -0.7153F, -41.25F, 1, 2, 1, -0.4F, false));

		bone10_r2 = new ModelRenderer(this);
		bone10_r2.setRotationPoint(-0.0165F, -2.4107F, 4.4351F);
		frontsight3.addChild(bone10_r2);
		setRotationAngle(bone10_r2, 1.5708F, 0.0F, 0.0F);
		bone10_r2.cubeList.add(new ModelBox(bone10_r2, 563, 232, -0.5F, 0.3847F, -41.25F, 1, 1, 1, -0.2F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		barrelLMG.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}