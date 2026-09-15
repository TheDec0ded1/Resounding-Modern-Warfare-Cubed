package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AK74Barrel extends ModelBase {
	private final ModelRenderer barrelGroup;
	private final ModelRenderer gun251_r1;
	private final ModelRenderer gun250_r1;
	private final ModelRenderer gun250_r2;
	private final ModelRenderer gun249_r1;
	private final ModelRenderer gun250_r3;
	private final ModelRenderer gun249_r2;
	private final ModelRenderer gun249_r3;
	private final ModelRenderer gun248_r1;
	private final ModelRenderer gun252_r1;
	private final ModelRenderer gun251_r2;
	private final ModelRenderer gun250_r4;
	private final ModelRenderer gun249_r4;
	private final ModelRenderer gun249_r5;
	private final ModelRenderer gun250_r5;
	private final ModelRenderer gun249_r6;
	private final ModelRenderer gun248_r2;
	private final ModelRenderer gun250_r6;
	private final ModelRenderer gun249_r7;
	private final ModelRenderer gun251_r3;
	private final ModelRenderer gun250_r7;
	private final ModelRenderer gun248_r3;
	private final ModelRenderer gun249_r8;
	private final ModelRenderer gun248_r4;
	private final ModelRenderer gun247_r1;
	private final ModelRenderer irons;
	private final ModelRenderer frontSightBlock;
	private final ModelRenderer ironsights_r1;
	private final ModelRenderer ironsights_r2;
	private final ModelRenderer ironsights_r3;
	private final ModelRenderer ironsights_r4;
	private final ModelRenderer ironsights_r5;
	private final ModelRenderer ironsights_r6;
	private final ModelRenderer ironsights_r7;
	private final ModelRenderer ironsights_r8;
	private final ModelRenderer ironsights_r9;
	private final ModelRenderer ironsights_r10;
	private final ModelRenderer ironsights_r11;
	private final ModelRenderer ironsights_r12;
	private final ModelRenderer ironsights_r13;
	private final ModelRenderer ironsights_r14;
	private final ModelRenderer ironsights_r15;
	private final ModelRenderer ironsights_r16;
	private final ModelRenderer ironsights_r17;
	private final ModelRenderer ironsights_r18;
	private final ModelRenderer ironsights_r19;
	private final ModelRenderer ironsights_r20;
	private final ModelRenderer sights;
	private final ModelRenderer ironsights_r21;
	private final ModelRenderer ironsights_r22;
	private final ModelRenderer ironsights_r23;
	private final ModelRenderer ironsights_r24;
	private final ModelRenderer ironsights_r25;
	private final ModelRenderer cube_r2;

	public AK74Barrel() {
		textureWidth = 352;
		textureHeight = 352;

		barrelGroup = new ModelRenderer(this);
		barrelGroup.setRotationPoint(-2.0F, -15.0F, -60.0F);
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 90, 215, 0.0F, -0.2172F, -2.1F, 1, 1, 27, -0.1F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 216, 214, 0.0F, 0.9142F, -2.1F, 1, 1, 27, -0.1F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 218, 185, 0.5657F, 0.3485F, -2.1F, 1, 1, 27, -0.1F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 0, 225, -0.5657F, 0.3485F, -2.1F, 1, 1, 27, -0.1F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 326, 156, 0.0F, 2.4F, -7.85F, 1, 1, 5, -0.15F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 326, 150, 0.0F, 3.3899F, -7.85F, 1, 1, 5, -0.15F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 326, 144, 0.495F, 2.895F, -7.85F, 1, 1, 5, -0.15F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 326, 138, -0.495F, 2.895F, -7.85F, 1, 1, 5, -0.15F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 328, 90, 0.0F, 2.4F, -17.85F, 1, 1, 4, -0.15F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 328, 75, 0.495F, 2.895F, -17.85F, 1, 1, 4, -0.15F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 328, 57, -0.495F, 2.895F, -17.85F, 1, 1, 4, -0.15F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 328, 47, 0.0F, 3.3899F, -17.85F, 1, 1, 4, -0.15F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 328, 37, 0.0F, -0.2007F, -4.8F, 1, 1, 4, -0.125F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 328, 42, 0.0F, 0.325F, -4.8F, 1, 1, 4, -0.125F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 326, 311, 0.0F, 0.8599F, -4.8F, 1, 1, 4, -0.125F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 326, 306, 0.5303F, 0.3296F, -4.8F, 1, 1, 4, -0.125F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 326, 301, -0.5303F, 0.3296F, -4.8F, 1, 1, 4, -0.125F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 0, 0, 0.0F, 2.5F, -17.0F, 1, 1, 44, -0.2F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 272, 268, 0.0F, 1.7F, -4.525F, 1, 1, 1, -0.1F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 90, 0, 0.0F, 3.3485F, -17.0F, 1, 1, 44, -0.2F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 0, 180, 0.0F, 4.2314F, -16.2F, 1, 1, 44, -0.2F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 90, 45, 0.4243F, 2.9243F, -17.0F, 1, 1, 44, -0.2F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 90, 90, -0.4243F, 2.9243F, -17.0F, 1, 1, 44, -0.2F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 88, 331, 0.0F, 2.175F, -20.5F, 1, 1, 3, 0.0F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 40, 331, 0.0F, 3.5892F, -20.5F, 1, 1, 3, 0.0F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 32, 331, 0.7071F, 2.8821F, -20.5F, 1, 1, 3, 0.0F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 24, 331, -0.7071F, 2.8821F, -20.5F, 1, 1, 3, 0.0F, false));

		gun251_r1 = new ModelRenderer(this);
		gun251_r1.setRotationPoint(1.0F, 3.8821F, -29.0F);
		barrelGroup.addChild(gun251_r1);
		setRotationAngle(gun251_r1, 0.0F, 0.0F, -0.7854F);
		gun251_r1.cubeList.add(new ModelBox(gun251_r1, 330, 325, -0.5F, -0.5F, 8.5F, 1, 1, 3, 0.0F, false));

		gun250_r1 = new ModelRenderer(this);
		gun250_r1.setRotationPoint(0.0F, 3.8821F, -29.0F);
		barrelGroup.addChild(gun250_r1);
		setRotationAngle(gun250_r1, 0.0F, 0.0F, -0.7854F);
		gun250_r1.cubeList.add(new ModelBox(gun250_r1, 330, 329, -0.5F, -0.5F, 8.5F, 1, 1, 3, 0.0F, false));

		gun250_r2 = new ModelRenderer(this);
		gun250_r2.setRotationPoint(1.0F, 2.8821F, -29.0F);
		barrelGroup.addChild(gun250_r2);
		setRotationAngle(gun250_r2, 0.0F, 0.0F, -0.7854F);
		gun250_r2.cubeList.add(new ModelBox(gun250_r2, 48, 331, -0.5F, -0.5F, 8.5F, 1, 1, 3, 0.0F, false));

		gun249_r1 = new ModelRenderer(this);
		gun249_r1.setRotationPoint(0.0F, 2.8821F, -29.0F);
		barrelGroup.addChild(gun249_r1);
		setRotationAngle(gun249_r1, 0.0F, 0.0F, -0.7854F);
		gun249_r1.cubeList.add(new ModelBox(gun249_r1, 56, 331, -0.5F, -0.5F, 8.5F, 1, 1, 3, 0.0F, false));

		gun250_r3 = new ModelRenderer(this);
		gun250_r3.setRotationPoint(0.8F, 3.7243F, 10.5F);
		barrelGroup.addChild(gun250_r3);
		setRotationAngle(gun250_r3, 0.0F, 0.0F, -0.7854F);
		gun250_r3.cubeList.add(new ModelBox(gun250_r3, 90, 135, -0.5F, -0.5F, -27.5F, 1, 1, 44, -0.2F, false));

		gun249_r2 = new ModelRenderer(this);
		gun249_r2.setRotationPoint(0.2F, 3.7243F, 10.5F);
		barrelGroup.addChild(gun249_r2);
		setRotationAngle(gun249_r2, 0.0F, 0.0F, -0.7854F);
		gun249_r2.cubeList.add(new ModelBox(gun249_r2, 0, 135, -0.5F, -0.5F, -27.5F, 1, 1, 44, -0.2F, false));

		gun249_r3 = new ModelRenderer(this);
		gun249_r3.setRotationPoint(0.8F, 3.1243F, 10.5F);
		barrelGroup.addChild(gun249_r3);
		setRotationAngle(gun249_r3, 0.0F, 0.0F, -0.7854F);
		gun249_r3.cubeList.add(new ModelBox(gun249_r3, 0, 90, -0.5F, -0.5F, -27.5F, 1, 1, 44, -0.2F, false));

		gun248_r1 = new ModelRenderer(this);
		gun248_r1.setRotationPoint(0.2F, 3.1243F, 10.5F);
		barrelGroup.addChild(gun248_r1);
		setRotationAngle(gun248_r1, 0.0F, 0.0F, -0.7854F);
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 0, 45, -0.5F, -0.5F, -27.5F, 1, 1, 44, -0.2F, false));

		gun252_r1 = new ModelRenderer(this);
		gun252_r1.setRotationPoint(0.5F, 0.6676F, -3.9062F);
		barrelGroup.addChild(gun252_r1);
		setRotationAngle(gun252_r1, -0.829F, 0.0F, 0.0F);
		gun252_r1.cubeList.add(new ModelBox(gun252_r1, 338, 102, -0.5F, 0.0F, 0.4F, 1, 1, 1, -0.1F, false));

		gun251_r2 = new ModelRenderer(this);
		gun251_r2.setRotationPoint(0.5F, 1.8676F, -3.9062F);
		barrelGroup.addChild(gun251_r2);
		setRotationAngle(gun251_r2, -0.829F, 0.0F, 0.0F);
		gun251_r2.cubeList.add(new ModelBox(gun251_r2, 338, 100, -0.5F, 0.0F, 0.4F, 1, 1, 1, -0.1F, false));

		gun250_r4 = new ModelRenderer(this);
		gun250_r4.setRotationPoint(0.5F, 1.5926F, -4.9812F);
		barrelGroup.addChild(gun250_r4);
		setRotationAngle(gun250_r4, -0.829F, 0.0F, 0.0F);
		gun250_r4.cubeList.add(new ModelBox(gun250_r4, 338, 98, -0.5F, 0.0F, 0.4F, 1, 1, 1, -0.1F, false));

		gun249_r4 = new ModelRenderer(this);
		gun249_r4.setRotationPoint(0.5F, 2.5F, -5.425F);
		barrelGroup.addChild(gun249_r4);
		setRotationAngle(gun249_r4, -0.1745F, 0.0F, 0.0F);
		gun249_r4.cubeList.add(new ModelBox(gun249_r4, 176, 337, -0.5F, -2.0F, 0.35F, 1, 2, 1, -0.1F, false));

		gun249_r5 = new ModelRenderer(this);
		gun249_r5.setRotationPoint(0.125F, 1.2046F, 3.7F);
		barrelGroup.addChild(gun249_r5);
		setRotationAngle(gun249_r5, 0.0F, 0.0F, -0.7854F);
		gun249_r5.cubeList.add(new ModelBox(gun249_r5, 326, 268, -0.5F, -0.5F, -8.5F, 1, 1, 4, -0.125F, false));

		gun250_r5 = new ModelRenderer(this);
		gun250_r5.setRotationPoint(0.875F, 1.2046F, 3.7F);
		barrelGroup.addChild(gun250_r5);
		setRotationAngle(gun250_r5, 0.0F, 0.0F, -0.7854F);
		gun250_r5.cubeList.add(new ModelBox(gun250_r5, 326, 273, -0.5F, -0.5F, -8.5F, 1, 1, 4, -0.125F, false));

		gun249_r6 = new ModelRenderer(this);
		gun249_r6.setRotationPoint(0.875F, 0.4546F, 3.7F);
		barrelGroup.addChild(gun249_r6);
		setRotationAngle(gun249_r6, 0.0F, 0.0F, -0.7854F);
		gun249_r6.cubeList.add(new ModelBox(gun249_r6, 326, 278, -0.5F, -0.5F, -8.5F, 1, 1, 4, -0.125F, false));

		gun248_r2 = new ModelRenderer(this);
		gun248_r2.setRotationPoint(0.125F, 0.4546F, 3.7F);
		barrelGroup.addChild(gun248_r2);
		setRotationAngle(gun248_r2, 0.0F, 0.0F, -0.7854F);
		gun248_r2.cubeList.add(new ModelBox(gun248_r2, 326, 296, -0.5F, -0.5F, -8.5F, 1, 1, 4, -0.125F, false));

		gun250_r6 = new ModelRenderer(this);
		gun250_r6.setRotationPoint(0.15F, 3.745F, -10.35F);
		barrelGroup.addChild(gun250_r6);
		setRotationAngle(gun250_r6, 0.0F, 0.0F, -0.7854F);
		gun250_r6.cubeList.add(new ModelBox(gun250_r6, 328, 52, -0.5F, -0.5F, -7.5F, 1, 1, 4, -0.15F, false));
		gun250_r6.cubeList.add(new ModelBox(gun250_r6, 326, 31, -0.5F, -0.5F, 2.5F, 1, 1, 5, -0.15F, false));

		gun249_r7 = new ModelRenderer(this);
		gun249_r7.setRotationPoint(0.15F, 3.045F, -10.35F);
		barrelGroup.addChild(gun249_r7);
		setRotationAngle(gun249_r7, 0.0F, 0.0F, -0.7854F);
		gun249_r7.cubeList.add(new ModelBox(gun249_r7, 328, 70, -0.5F, -0.5F, -7.5F, 1, 1, 4, -0.15F, false));
		gun249_r7.cubeList.add(new ModelBox(gun249_r7, 326, 132, -0.5F, -0.5F, 2.5F, 1, 1, 5, -0.15F, false));

		gun251_r3 = new ModelRenderer(this);
		gun251_r3.setRotationPoint(0.85F, 3.745F, -10.35F);
		barrelGroup.addChild(gun251_r3);
		setRotationAngle(gun251_r3, 0.0F, 0.0F, -0.7854F);
		gun251_r3.cubeList.add(new ModelBox(gun251_r3, 328, 80, -0.5F, -0.5F, -7.5F, 1, 1, 4, -0.15F, false));
		gun251_r3.cubeList.add(new ModelBox(gun251_r3, 326, 120, -0.5F, -0.5F, 2.5F, 1, 1, 5, -0.15F, false));

		gun250_r7 = new ModelRenderer(this);
		gun250_r7.setRotationPoint(0.85F, 3.045F, -10.35F);
		barrelGroup.addChild(gun250_r7);
		setRotationAngle(gun250_r7, 0.0F, 0.0F, -0.7854F);
		gun250_r7.cubeList.add(new ModelBox(gun250_r7, 328, 85, -0.5F, -0.5F, -7.5F, 1, 1, 4, -0.15F, false));
		gun250_r7.cubeList.add(new ModelBox(gun250_r7, 326, 126, -0.5F, -0.5F, 2.5F, 1, 1, 5, -0.15F, false));

		gun248_r3 = new ModelRenderer(this);
		gun248_r3.setRotationPoint(0.1F, 1.2485F, 6.4F);
		barrelGroup.addChild(gun248_r3);
		setRotationAngle(gun248_r3, 0.0F, 0.0F, -0.7854F);
		gun248_r3.cubeList.add(new ModelBox(gun248_r3, 250, 115, -0.5F, -0.5F, -8.5F, 1, 1, 27, -0.1F, false));

		gun249_r8 = new ModelRenderer(this);
		gun249_r8.setRotationPoint(0.9F, 1.2485F, 6.4F);
		barrelGroup.addChild(gun249_r8);
		setRotationAngle(gun249_r8, 0.0F, 0.0F, -0.7854F);
		gun249_r8.cubeList.add(new ModelBox(gun249_r8, 112, 243, -0.5F, -0.5F, -8.5F, 1, 1, 27, -0.1F, false));

		gun248_r4 = new ModelRenderer(this);
		gun248_r4.setRotationPoint(0.9F, 0.4485F, 6.4F);
		barrelGroup.addChild(gun248_r4);
		setRotationAngle(gun248_r4, 0.0F, 0.0F, -0.7854F);
		gun248_r4.cubeList.add(new ModelBox(gun248_r4, 56, 243, -0.5F, -0.5F, -8.5F, 1, 1, 27, -0.1F, false));

		gun247_r1 = new ModelRenderer(this);
		gun247_r1.setRotationPoint(0.1F, 0.4485F, 6.4F);
		barrelGroup.addChild(gun247_r1);
		setRotationAngle(gun247_r1, 0.0F, 0.0F, -0.7854F);
		gun247_r1.cubeList.add(new ModelBox(gun247_r1, 216, 242, -0.5F, -0.5F, -8.5F, 1, 1, 27, -0.1F, false));

		irons = new ModelRenderer(this);
		irons.setRotationPoint(2.0F, 35.4F, 131.45F);
		barrelGroup.addChild(irons);
		

		frontSightBlock = new ModelRenderer(this);
		frontSightBlock.setRotationPoint(0.0F, 0.0F, -1.0F);
		irons.addChild(frontSightBlock);
		

		ironsights_r1 = new ModelRenderer(this);
		ironsights_r1.setRotationPoint(-1.5F, -37.4123F, -146.4153F);
		frontSightBlock.addChild(ironsights_r1);
		setRotationAngle(ironsights_r1, 0.0F, -1.5708F, 0.0F);
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 222, 336, -1.4F, 2.3F, -1.0F, 1, 1, 2, -0.2F, false));
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 334, 239, -1.4F, 1.1F, -1.0F, 1, 2, 2, -0.2F, false));

		ironsights_r2 = new ModelRenderer(this);
		ironsights_r2.setRotationPoint(-1.5F, -38.3123F, -147.1403F);
		frontSightBlock.addChild(ironsights_r2);
		setRotationAngle(ironsights_r2, 0.0F, -1.5708F, 0.0F);
		ironsights_r2.cubeList.add(new ModelBox(ironsights_r2, 336, 258, -0.375F, 2.3F, -1.0F, 1, 1, 2, -0.1F, false));

		ironsights_r3 = new ModelRenderer(this);
		ironsights_r3.setRotationPoint(-1.5F, -37.4123F, -146.8403F);
		frontSightBlock.addChild(ironsights_r3);
		setRotationAngle(ironsights_r3, 0.0F, -1.5708F, 0.0F);
		ironsights_r3.cubeList.add(new ModelBox(ironsights_r3, 336, 252, -0.375F, 2.3F, -1.0F, 1, 1, 2, -0.2F, false));
		ironsights_r3.cubeList.add(new ModelBox(ironsights_r3, 320, 19, -0.375F, 1.1F, -1.0F, 1, 2, 2, -0.2F, false));

		ironsights_r4 = new ModelRenderer(this);
		ironsights_r4.setRotationPoint(-0.299F, -38.1871F, -147.0153F);
		frontSightBlock.addChild(ironsights_r4);
		setRotationAngle(ironsights_r4, 0.0F, -1.5708F, -0.48F);
		ironsights_r4.cubeList.add(new ModelBox(ironsights_r4, 336, 62, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r5 = new ModelRenderer(this);
		ironsights_r5.setRotationPoint(-1.814F, -37.7253F, -147.0153F);
		frontSightBlock.addChild(ironsights_r5);
		setRotationAngle(ironsights_r5, 0.0F, -1.5708F, 0.48F);
		ironsights_r5.cubeList.add(new ModelBox(ironsights_r5, 234, 335, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r6 = new ModelRenderer(this);
		ironsights_r6.setRotationPoint(0.1627F, -36.7533F, -147.0153F);
		frontSightBlock.addChild(ironsights_r6);
		setRotationAngle(ironsights_r6, 0.0F, -1.5708F, 0.48F);
		ironsights_r6.cubeList.add(new ModelBox(ironsights_r6, 210, 335, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r7 = new ModelRenderer(this);
		ironsights_r7.setRotationPoint(-2.2757F, -37.215F, -147.0153F);
		frontSightBlock.addChild(ironsights_r7);
		setRotationAngle(ironsights_r7, 0.0F, -1.5708F, -0.48F);
		ironsights_r7.cubeList.add(new ModelBox(ironsights_r7, 204, 335, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r8 = new ModelRenderer(this);
		ironsights_r8.setRotationPoint(-1.5F, -32.45F, -146.15F);
		frontSightBlock.addChild(ironsights_r8);
		setRotationAngle(ironsights_r8, -1.5708F, -0.7418F, 1.5708F);
		ironsights_r8.cubeList.add(new ModelBox(ironsights_r8, 216, 336, -1.4F, -1.0F, -1.0F, 1, 1, 2, -0.2F, false));

		ironsights_r9 = new ModelRenderer(this);
		ironsights_r9.setRotationPoint(-1.5F, -33.525F, -138.95F);
		frontSightBlock.addChild(ironsights_r9);
		setRotationAngle(ironsights_r9, 0.0F, -1.5708F, 0.0F);
		ironsights_r9.cubeList.add(new ModelBox(ironsights_r9, 30, 335, 0.6F, 1.0F, -1.0F, 1, 2, 2, -0.2F, false));
		ironsights_r9.cubeList.add(new ModelBox(ironsights_r9, 36, 335, 1.2F, 1.0F, -1.0F, 1, 2, 2, -0.2F, false));

		ironsights_r10 = new ModelRenderer(this);
		ironsights_r10.setRotationPoint(-1.5F, -32.825F, -135.45F);
		frontSightBlock.addChild(ironsights_r10);
		setRotationAngle(ironsights_r10, 0.0F, -1.5708F, 0.0F);
		ironsights_r10.cubeList.add(new ModelBox(ironsights_r10, 336, 255, 1.2F, 1.0F, -1.0F, 1, 1, 2, -0.2F, false));

		ironsights_r11 = new ModelRenderer(this);
		ironsights_r11.setRotationPoint(-1.5F, -32.7F, -146.35F);
		frontSightBlock.addChild(ironsights_r11);
		setRotationAngle(ironsights_r11, 0.0F, -1.5708F, 0.0F);
		ironsights_r11.cubeList.add(new ModelBox(ironsights_r11, 42, 335, -1.1F, 0.3F, -1.0F, 1, 2, 2, -0.2F, false));
		ironsights_r11.cubeList.add(new ModelBox(ironsights_r11, 330, 289, -1.4F, -1.0F, -1.0F, 2, 2, 2, -0.2F, false));

		ironsights_r12 = new ModelRenderer(this);
		ironsights_r12.setRotationPoint(-1.5F, -32.825F, -146.45F);
		frontSightBlock.addChild(ironsights_r12);
		setRotationAngle(ironsights_r12, 0.0F, -1.5708F, 0.0F);
		ironsights_r12.cubeList.add(new ModelBox(ironsights_r12, 24, 335, 0.6F, 1.0F, -1.0F, 1, 2, 2, -0.2F, false));
		ironsights_r12.cubeList.add(new ModelBox(ironsights_r12, 0, 335, 1.2F, 1.0F, -1.0F, 1, 2, 2, -0.2F, false));

		ironsights_r13 = new ModelRenderer(this);
		ironsights_r13.setRotationPoint(-2.7F, -30.3644F, -145.1391F);
		frontSightBlock.addChild(ironsights_r13);
		setRotationAngle(ironsights_r13, 0.0F, -1.5708F, 0.0F);
		ironsights_r13.cubeList.add(new ModelBox(ironsights_r13, 180, 333, -1.4F, -4.0F, -2.0F, 1, 3, 2, -0.4F, false));

		ironsights_r14 = new ModelRenderer(this);
		ironsights_r14.setRotationPoint(-2.3F, -30.3644F, -145.1391F);
		frontSightBlock.addChild(ironsights_r14);
		setRotationAngle(ironsights_r14, 0.0F, -1.5708F, 0.0F);
		ironsights_r14.cubeList.add(new ModelBox(ironsights_r14, 248, 333, -1.4F, -4.0F, -2.0F, 1, 3, 2, -0.4F, false));

		ironsights_r15 = new ModelRenderer(this);
		ironsights_r15.setRotationPoint(-2.7F, -30.9123F, -146.6153F);
		frontSightBlock.addChild(ironsights_r15);
		setRotationAngle(ironsights_r15, 0.0F, -1.5708F, 0.0F);
		ironsights_r15.cubeList.add(new ModelBox(ironsights_r15, 12, 333, -1.4F, -4.0F, -2.0F, 1, 3, 2, -0.4F, false));

		ironsights_r16 = new ModelRenderer(this);
		ironsights_r16.setRotationPoint(-2.3F, -30.9123F, -146.6153F);
		frontSightBlock.addChild(ironsights_r16);
		setRotationAngle(ironsights_r16, 0.0F, -1.5708F, 0.0F);
		ironsights_r16.cubeList.add(new ModelBox(ironsights_r16, 280, 332, -1.4F, -4.0F, -2.0F, 1, 3, 2, -0.4F, false));

		ironsights_r17 = new ModelRenderer(this);
		ironsights_r17.setRotationPoint(-1.3F, -34.4234F, -145.488F);
		frontSightBlock.addChild(ironsights_r17);
		setRotationAngle(ironsights_r17, 1.5708F, -1.3526F, -1.5708F);
		ironsights_r17.cubeList.add(new ModelBox(ironsights_r17, 286, 333, -1.3F, -2.0F, -1.0F, 1, 3, 2, -0.4F, false));
		ironsights_r17.cubeList.add(new ModelBox(ironsights_r17, 334, 243, -1.4F, -0.9F, -1.0F, 1, 2, 2, -0.4F, false));

		ironsights_r18 = new ModelRenderer(this);
		ironsights_r18.setRotationPoint(-1.7F, -34.4234F, -145.488F);
		frontSightBlock.addChild(ironsights_r18);
		setRotationAngle(ironsights_r18, 1.5708F, -1.3526F, -1.5708F);
		ironsights_r18.cubeList.add(new ModelBox(ironsights_r18, 292, 333, -1.3F, -2.0F, -1.0F, 1, 3, 2, -0.4F, false));
		ironsights_r18.cubeList.add(new ModelBox(ironsights_r18, 334, 333, -1.4F, -0.9F, -1.0F, 1, 2, 2, -0.4F, false));

		ironsights_r19 = new ModelRenderer(this);
		ironsights_r19.setRotationPoint(-1.7F, -34.7234F, -145.288F);
		frontSightBlock.addChild(ironsights_r19);
		setRotationAngle(ironsights_r19, 1.5708F, -1.3526F, -1.5708F);
		ironsights_r19.cubeList.add(new ModelBox(ironsights_r19, 18, 333, -1.4F, -2.0F, -1.0F, 1, 3, 2, -0.4F, false));

		ironsights_r20 = new ModelRenderer(this);
		ironsights_r20.setRotationPoint(-1.3F, -34.7234F, -145.288F);
		frontSightBlock.addChild(ironsights_r20);
		setRotationAngle(ironsights_r20, 1.5708F, -1.3526F, -1.5708F);
		ironsights_r20.cubeList.add(new ModelBox(ironsights_r20, 274, 332, -1.4F, -2.0F, -1.0F, 1, 3, 2, -0.4F, false));

		sights = new ModelRenderer(this);
		sights.setRotationPoint(0.0F, -35.9F, -146.35F);
		irons.addChild(sights);
		sights.cubeList.add(new ModelBox(sights, 312, 230, -2.5F, -1.76F, 35.92F, 2, 1, 6, -0.301F, false));
		sights.cubeList.add(new ModelBox(sights, 334, 233, -3.1F, -1.56F, 41.22F, 3, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 334, 235, -3.1F, -1.76F, 41.22F, 3, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 334, 237, -3.1F, -1.96F, 41.22F, 3, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 338, 35, -0.9F, -1.96F, 41.22F, 1, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 338, 37, -0.9F, -1.76F, 41.22F, 1, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 338, 39, -0.9F, -1.56F, 41.22F, 1, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 338, 41, -0.9F, -2.16F, 41.22F, 1, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 338, 43, -1.1F, -2.16F, 41.22F, 1, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 338, 45, -1.3F, -2.16F, 41.22F, 1, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 338, 47, -1.5F, -2.16F, 41.22F, 1, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 338, 49, -1.7F, -2.16F, 41.22F, 1, 1, 1, -0.401F, false));
		sights.cubeList.add(new ModelBox(sights, 338, 51, -1.7F, -2.26F, 41.22F, 1, 1, 1, -0.402F, false));
		sights.cubeList.add(new ModelBox(sights, 338, 53, -1.5F, -2.26F, 41.22F, 1, 1, 1, -0.401F, false));
		sights.cubeList.add(new ModelBox(sights, 338, 55, -1.3F, -2.26F, 41.22F, 1, 1, 1, -0.401F, false));
		sights.cubeList.add(new ModelBox(sights, 338, 57, -1.1F, -2.26F, 41.22F, 1, 1, 1, -0.401F, false));
		sights.cubeList.add(new ModelBox(sights, 338, 59, -0.9F, -2.26F, 41.22F, 1, 1, 1, -0.401F, false));
		sights.cubeList.add(new ModelBox(sights, 338, 70, -2.3F, -2.26F, 41.22F, 1, 1, 1, -0.402F, false));
		sights.cubeList.add(new ModelBox(sights, 338, 72, -2.5F, -2.26F, 41.22F, 1, 1, 1, -0.401F, false));
		sights.cubeList.add(new ModelBox(sights, 338, 74, -2.7F, -2.26F, 41.22F, 1, 1, 1, -0.401F, false));
		sights.cubeList.add(new ModelBox(sights, 338, 76, -2.9F, -2.26F, 41.22F, 1, 1, 1, -0.401F, false));
		sights.cubeList.add(new ModelBox(sights, 338, 78, -3.1F, -2.26F, 41.22F, 1, 1, 1, -0.401F, false));
		sights.cubeList.add(new ModelBox(sights, 338, 80, -2.3F, -2.16F, 41.22F, 1, 1, 1, -0.401F, false));
		sights.cubeList.add(new ModelBox(sights, 338, 82, -2.5F, -2.16F, 41.22F, 1, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 338, 84, -2.9F, -2.16F, 41.22F, 1, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 338, 86, -3.1F, -2.16F, 41.22F, 1, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 338, 88, -2.7F, -2.16F, 41.22F, 1, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 172, 337, -2.0F, -1.8F, -2.1F, 1, 2, 1, -0.4F, false));

		ironsights_r21 = new ModelRenderer(this);
		ironsights_r21.setRotationPoint(-1.95F, -2.5444F, 38.3787F);
		sights.addChild(ironsights_r21);
		setRotationAngle(ironsights_r21, -1.5708F, -1.1781F, 1.5708F);
		ironsights_r21.cubeList.add(new ModelBox(ironsights_r21, 318, 140, -0.4F, 1.0F, 0.0F, 3, 2, 1, -0.2F, false));

		ironsights_r22 = new ModelRenderer(this);
		ironsights_r22.setRotationPoint(-0.05F, -2.5444F, 38.3787F);
		sights.addChild(ironsights_r22);
		setRotationAngle(ironsights_r22, -1.5708F, -1.1781F, 1.5708F);
		ironsights_r22.cubeList.add(new ModelBox(ironsights_r22, 286, 77, -0.4F, 1.0F, 0.0F, 3, 2, 1, -0.2F, false));

		ironsights_r23 = new ModelRenderer(this);
		ironsights_r23.setRotationPoint(-0.05F, -2.7123F, 36.3347F);
		sights.addChild(ironsights_r23);
		setRotationAngle(ironsights_r23, 0.0F, -1.5708F, 0.0F);
		ironsights_r23.cubeList.add(new ModelBox(ironsights_r23, 190, 336, -0.4F, 1.0F, 0.0F, 2, 2, 1, -0.2F, false));

		ironsights_r24 = new ModelRenderer(this);
		ironsights_r24.setRotationPoint(-1.55F, -2.3123F, 36.5347F);
		sights.addChild(ironsights_r24);
		setRotationAngle(ironsights_r24, 0.0F, -1.5708F, 0.0F);
		ironsights_r24.cubeList.add(new ModelBox(ironsights_r24, 254, 336, -0.4F, 1.0F, -1.0F, 1, 1, 2, -0.1F, false));

		ironsights_r25 = new ModelRenderer(this);
		ironsights_r25.setRotationPoint(-1.95F, -2.7123F, 36.3347F);
		sights.addChild(ironsights_r25);
		setRotationAngle(ironsights_r25, 0.0F, -1.5708F, 0.0F);
		ironsights_r25.cubeList.add(new ModelBox(ironsights_r25, 336, 65, -0.4F, 1.0F, 0.0F, 2, 2, 1, -0.2F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.7F, -1.36F, 40.72F);
		sights.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.3665F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 338, 90, -0.8F, -0.2783F, -0.5226F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 338, 92, 2.2F, -0.2783F, -0.5226F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 338, 94, 1.7F, -0.2783F, -0.5226F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 338, 96, -0.3F, -0.2783F, -0.5226F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		barrelGroup.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}