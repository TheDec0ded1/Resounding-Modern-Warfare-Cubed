package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AKMBarrel extends ModelBase {
	private final ModelRenderer barrelGroup;
	private final ModelRenderer gun250_r1;
	private final ModelRenderer gun249_r1;
	private final ModelRenderer gun249_r2;
	private final ModelRenderer gun248_r1;
	private final ModelRenderer gun252_r1;
	private final ModelRenderer gun250_r2;
	private final ModelRenderer gun249_r3;
	private final ModelRenderer gun250_r3;
	private final ModelRenderer gun249_r4;
	private final ModelRenderer gun248_r2;
	private final ModelRenderer gun250_r4;
	private final ModelRenderer gun249_r5;
	private final ModelRenderer gun251_r1;
	private final ModelRenderer gun250_r5;
	private final ModelRenderer gun248_r3;
	private final ModelRenderer gun249_r6;
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
	private final ModelRenderer ironsights_r21;
	private final ModelRenderer ironsights_r22;
	private final ModelRenderer sights;
	private final ModelRenderer ironsights_r23;
	private final ModelRenderer ironsights_r24;
	private final ModelRenderer ironsights_r25;
	private final ModelRenderer ironsights_r26;
	private final ModelRenderer ironsights_r27;
	private final ModelRenderer cube_r2;

	public AKMBarrel() {
		textureWidth = 320;
		textureHeight = 320;

		barrelGroup = new ModelRenderer(this);
		barrelGroup.setRotationPoint(-2.0F, -15.0F, -60.0F);
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 90, 219, 0.0F, -0.2172F, -1.1F, 1, 1, 26, -0.1F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 0, 229, 0.0F, 0.9142F, -1.1F, 1, 1, 26, -0.1F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 144, 243, 0.5657F, 0.3485F, -1.1F, 1, 1, 26, -0.1F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 198, 244, -0.5657F, 0.3485F, -1.1F, 1, 1, 26, -0.1F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 210, 301, 0.0F, 2.4F, -5.85F, 1, 1, 3, -0.15F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 180, 301, 0.0F, 3.3899F, -5.85F, 1, 1, 3, -0.15F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 172, 301, 0.495F, 2.895F, -5.85F, 1, 1, 3, -0.15F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 164, 301, -0.495F, 2.895F, -5.85F, 1, 1, 3, -0.15F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 300, 292, 0.0F, 2.4F, -17.35F, 1, 1, 3, -0.15F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 224, 300, 0.495F, 2.895F, -17.35F, 1, 1, 3, -0.15F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 194, 300, -0.495F, 2.895F, -17.35F, 1, 1, 3, -0.15F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 72, 300, 0.0F, 3.3899F, -17.35F, 1, 1, 3, -0.15F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 286, 296, 0.0F, -0.2007F, -3.8F, 1, 1, 4, -0.125F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 296, 296, 0.0F, 0.325F, -3.8F, 1, 1, 4, -0.125F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 276, 296, 0.0F, 0.8599F, -3.8F, 1, 1, 4, -0.125F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 40, 296, 0.5303F, 0.3296F, -3.8F, 1, 1, 4, -0.125F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 30, 296, -0.5303F, 0.3296F, -3.8F, 1, 1, 4, -0.125F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 0, 0, 0.0F, 2.5F, -18.0F, 1, 1, 45, -0.2F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 92, 0, 0.0F, 3.3485F, -18.0F, 1, 1, 45, -0.2F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 0, 184, 0.0F, 4.2314F, -16.2F, 1, 1, 44, -0.2F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 92, 46, 0.4243F, 2.9243F, -18.0F, 1, 1, 45, -0.2F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 92, 92, -0.4243F, 2.9243F, -18.0F, 1, 1, 45, -0.2F, false));

		gun250_r1 = new ModelRenderer(this);
		gun250_r1.setRotationPoint(0.8F, 3.7243F, 10.5F);
		barrelGroup.addChild(gun250_r1);
		setRotationAngle(gun250_r1, 0.0F, 0.0F, -0.7854F);
		gun250_r1.cubeList.add(new ModelBox(gun250_r1, 92, 138, -0.5F, -0.5F, -28.5F, 1, 1, 45, -0.2F, false));

		gun249_r1 = new ModelRenderer(this);
		gun249_r1.setRotationPoint(0.2F, 3.7243F, 10.5F);
		barrelGroup.addChild(gun249_r1);
		setRotationAngle(gun249_r1, 0.0F, 0.0F, -0.7854F);
		gun249_r1.cubeList.add(new ModelBox(gun249_r1, 0, 138, -0.5F, -0.5F, -28.5F, 1, 1, 45, -0.2F, false));

		gun249_r2 = new ModelRenderer(this);
		gun249_r2.setRotationPoint(0.8F, 3.1243F, 10.5F);
		barrelGroup.addChild(gun249_r2);
		setRotationAngle(gun249_r2, 0.0F, 0.0F, -0.7854F);
		gun249_r2.cubeList.add(new ModelBox(gun249_r2, 0, 92, -0.5F, -0.5F, -28.5F, 1, 1, 45, -0.2F, false));

		gun248_r1 = new ModelRenderer(this);
		gun248_r1.setRotationPoint(0.2F, 3.1243F, 10.5F);
		barrelGroup.addChild(gun248_r1);
		setRotationAngle(gun248_r1, 0.0F, 0.0F, -0.7854F);
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 0, 46, -0.5F, -0.5F, -28.5F, 1, 1, 45, -0.2F, false));

		gun252_r1 = new ModelRenderer(this);
		gun252_r1.setRotationPoint(0.5F, 0.6676F, -2.9062F);
		barrelGroup.addChild(gun252_r1);
		setRotationAngle(gun252_r1, -0.829F, 0.0F, 0.0F);
		gun252_r1.cubeList.add(new ModelBox(gun252_r1, 256, 304, -0.5F, 0.0F, 0.4F, 1, 3, 1, -0.1F, false));

		gun250_r2 = new ModelRenderer(this);
		gun250_r2.setRotationPoint(0.5F, 1.5926F, -4.9812F);
		barrelGroup.addChild(gun250_r2);
		setRotationAngle(gun250_r2, -0.829F, 0.0F, 0.0F);
		gun250_r2.cubeList.add(new ModelBox(gun250_r2, 206, 304, -0.5F, -2.0F, 0.4F, 1, 3, 1, -0.1F, false));

		gun249_r3 = new ModelRenderer(this);
		gun249_r3.setRotationPoint(0.125F, 1.2046F, 4.7F);
		barrelGroup.addChild(gun249_r3);
		setRotationAngle(gun249_r3, 0.0F, 0.0F, -0.7854F);
		gun249_r3.cubeList.add(new ModelBox(gun249_r3, 10, 296, -0.5F, -0.5F, -8.5F, 1, 1, 4, -0.125F, false));

		gun250_r3 = new ModelRenderer(this);
		gun250_r3.setRotationPoint(0.875F, 1.2046F, 4.7F);
		barrelGroup.addChild(gun250_r3);
		setRotationAngle(gun250_r3, 0.0F, 0.0F, -0.7854F);
		gun250_r3.cubeList.add(new ModelBox(gun250_r3, 20, 296, -0.5F, -0.5F, -8.5F, 1, 1, 4, -0.125F, false));

		gun249_r4 = new ModelRenderer(this);
		gun249_r4.setRotationPoint(0.875F, 0.4546F, 4.7F);
		barrelGroup.addChild(gun249_r4);
		setRotationAngle(gun249_r4, 0.0F, 0.0F, -0.7854F);
		gun249_r4.cubeList.add(new ModelBox(gun249_r4, 296, 21, -0.5F, -0.5F, -8.5F, 1, 1, 4, -0.125F, false));

		gun248_r2 = new ModelRenderer(this);
		gun248_r2.setRotationPoint(0.125F, 0.4546F, 4.7F);
		barrelGroup.addChild(gun248_r2);
		setRotationAngle(gun248_r2, 0.0F, 0.0F, -0.7854F);
		gun248_r2.cubeList.add(new ModelBox(gun248_r2, 296, 26, -0.5F, -0.5F, -8.5F, 1, 1, 4, -0.125F, false));

		gun250_r4 = new ModelRenderer(this);
		gun250_r4.setRotationPoint(0.15F, 3.745F, -9.85F);
		barrelGroup.addChild(gun250_r4);
		setRotationAngle(gun250_r4, 0.0F, 0.0F, -0.7854F);
		gun250_r4.cubeList.add(new ModelBox(gun250_r4, 80, 300, -0.5F, -0.5F, -7.5F, 1, 1, 3, -0.15F, false));
		gun250_r4.cubeList.add(new ModelBox(gun250_r4, 132, 301, -0.5F, -0.5F, 4.0F, 1, 1, 3, -0.15F, false));

		gun249_r5 = new ModelRenderer(this);
		gun249_r5.setRotationPoint(0.15F, 3.045F, -9.85F);
		barrelGroup.addChild(gun249_r5);
		setRotationAngle(gun249_r5, 0.0F, 0.0F, -0.7854F);
		gun249_r5.cubeList.add(new ModelBox(gun249_r5, 202, 300, -0.5F, -0.5F, -7.5F, 1, 1, 3, -0.15F, false));
		gun249_r5.cubeList.add(new ModelBox(gun249_r5, 156, 301, -0.5F, -0.5F, 4.0F, 1, 1, 3, -0.15F, false));

		gun251_r1 = new ModelRenderer(this);
		gun251_r1.setRotationPoint(0.85F, 3.745F, -9.85F);
		barrelGroup.addChild(gun251_r1);
		setRotationAngle(gun251_r1, 0.0F, 0.0F, -0.7854F);
		gun251_r1.cubeList.add(new ModelBox(gun251_r1, 300, 284, -0.5F, -0.5F, -7.5F, 1, 1, 3, -0.15F, false));
		gun251_r1.cubeList.add(new ModelBox(gun251_r1, 140, 301, -0.5F, -0.5F, 4.0F, 1, 1, 3, -0.15F, false));

		gun250_r5 = new ModelRenderer(this);
		gun250_r5.setRotationPoint(0.85F, 3.045F, -9.85F);
		barrelGroup.addChild(gun250_r5);
		setRotationAngle(gun250_r5, 0.0F, 0.0F, -0.7854F);
		gun250_r5.cubeList.add(new ModelBox(gun250_r5, 300, 288, -0.5F, -0.5F, -7.5F, 1, 1, 3, -0.15F, false));
		gun250_r5.cubeList.add(new ModelBox(gun250_r5, 148, 301, -0.5F, -0.5F, 4.0F, 1, 1, 3, -0.15F, false));

		gun248_r3 = new ModelRenderer(this);
		gun248_r3.setRotationPoint(0.1F, 1.2485F, 6.4F);
		barrelGroup.addChild(gun248_r3);
		setRotationAngle(gun248_r3, 0.0F, 0.0F, -0.7854F);
		gun248_r3.cubeList.add(new ModelBox(gun248_r3, 254, 142, -0.5F, -0.5F, -7.5F, 1, 1, 26, -0.1F, false));

		gun249_r6 = new ModelRenderer(this);
		gun249_r6.setRotationPoint(0.9F, 1.2485F, 6.4F);
		barrelGroup.addChild(gun249_r6);
		setRotationAngle(gun249_r6, 0.0F, 0.0F, -0.7854F);
		gun249_r6.cubeList.add(new ModelBox(gun249_r6, 254, 115, -0.5F, -0.5F, -7.5F, 1, 1, 26, -0.1F, false));

		gun248_r4 = new ModelRenderer(this);
		gun248_r4.setRotationPoint(0.9F, 0.4485F, 6.4F);
		barrelGroup.addChild(gun248_r4);
		setRotationAngle(gun248_r4, 0.0F, 0.0F, -0.7854F);
		gun248_r4.cubeList.add(new ModelBox(gun248_r4, 252, 244, -0.5F, -0.5F, -7.5F, 1, 1, 26, -0.1F, false));

		gun247_r1 = new ModelRenderer(this);
		gun247_r1.setRotationPoint(0.1F, 0.4485F, 6.4F);
		barrelGroup.addChild(gun247_r1);
		setRotationAngle(gun247_r1, 0.0F, 0.0F, -0.7854F);
		gun247_r1.cubeList.add(new ModelBox(gun247_r1, 54, 246, -0.5F, -0.5F, -7.5F, 1, 1, 26, -0.1F, false));

		irons = new ModelRenderer(this);
		irons.setRotationPoint(2.0F, 35.4F, 131.45F);
		barrelGroup.addChild(irons);
		

		frontSightBlock = new ModelRenderer(this);
		frontSightBlock.setRotationPoint(0.0F, 0.0F, -1.0F);
		irons.addChild(frontSightBlock);
		

		ironsights_r1 = new ModelRenderer(this);
		ironsights_r1.setRotationPoint(-1.5F, -38.3123F, -146.8403F);
		frontSightBlock.addChild(ironsights_r1);
		setRotationAngle(ironsights_r1, 0.0F, -1.5708F, 0.0F);
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 194, 304, -0.375F, 2.3F, -1.0F, 1, 1, 2, -0.1F, false));

		ironsights_r2 = new ModelRenderer(this);
		ironsights_r2.setRotationPoint(-1.5F, -37.4123F, -146.3403F);
		frontSightBlock.addChild(ironsights_r2);
		setRotationAngle(ironsights_r2, 0.0F, -1.5708F, 0.0F);
		ironsights_r2.cubeList.add(new ModelBox(ironsights_r2, 300, 301, -1.375F, 2.3F, -1.0F, 2, 1, 2, -0.2F, false));
		ironsights_r2.cubeList.add(new ModelBox(ironsights_r2, 42, 301, -1.374F, 1.1F, -1.0F, 2, 2, 2, -0.2F, false));

		ironsights_r3 = new ModelRenderer(this);
		ironsights_r3.setRotationPoint(-1.5F, -37.3123F, -146.4153F);
		frontSightBlock.addChild(ironsights_r3);
		setRotationAngle(ironsights_r3, 0.0F, -1.5708F, 0.0F);
		ironsights_r3.cubeList.add(new ModelBox(ironsights_r3, 0, 302, -1.4F, 1.0F, -1.0F, 1, 2, 2, -0.2F, false));

		ironsights_r4 = new ModelRenderer(this);
		ironsights_r4.setRotationPoint(-0.299F, -38.1871F, -146.5153F);
		frontSightBlock.addChild(ironsights_r4);
		setRotationAngle(ironsights_r4, 0.0F, -1.5708F, -0.48F);
		ironsights_r4.cubeList.add(new ModelBox(ironsights_r4, 250, 304, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r5 = new ModelRenderer(this);
		ironsights_r5.setRotationPoint(0.1627F, -36.7533F, -146.5153F);
		frontSightBlock.addChild(ironsights_r5);
		setRotationAngle(ironsights_r5, 0.0F, -1.5708F, 0.48F);
		ironsights_r5.cubeList.add(new ModelBox(ironsights_r5, 276, 304, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r6 = new ModelRenderer(this);
		ironsights_r6.setRotationPoint(-1.814F, -37.7253F, -146.5153F);
		frontSightBlock.addChild(ironsights_r6);
		setRotationAngle(ironsights_r6, 0.0F, -1.5708F, 0.48F);
		ironsights_r6.cubeList.add(new ModelBox(ironsights_r6, 282, 304, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r7 = new ModelRenderer(this);
		ironsights_r7.setRotationPoint(-2.2757F, -37.215F, -146.5153F);
		frontSightBlock.addChild(ironsights_r7);
		setRotationAngle(ironsights_r7, 0.0F, -1.5708F, -0.48F);
		ironsights_r7.cubeList.add(new ModelBox(ironsights_r7, 288, 304, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r8 = new ModelRenderer(this);
		ironsights_r8.setRotationPoint(-0.299F, -38.1871F, -147.0153F);
		frontSightBlock.addChild(ironsights_r8);
		setRotationAngle(ironsights_r8, 0.0F, -1.5708F, -0.48F);
		ironsights_r8.cubeList.add(new ModelBox(ironsights_r8, 72, 304, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r9 = new ModelRenderer(this);
		ironsights_r9.setRotationPoint(-1.814F, -37.7253F, -147.0153F);
		frontSightBlock.addChild(ironsights_r9);
		setRotationAngle(ironsights_r9, 0.0F, -1.5708F, 0.48F);
		ironsights_r9.cubeList.add(new ModelBox(ironsights_r9, 56, 304, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r10 = new ModelRenderer(this);
		ironsights_r10.setRotationPoint(0.1627F, -36.7533F, -147.0153F);
		frontSightBlock.addChild(ironsights_r10);
		setRotationAngle(ironsights_r10, 0.0F, -1.5708F, 0.48F);
		ironsights_r10.cubeList.add(new ModelBox(ironsights_r10, 50, 304, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r11 = new ModelRenderer(this);
		ironsights_r11.setRotationPoint(-2.2757F, -37.215F, -147.0153F);
		frontSightBlock.addChild(ironsights_r11);
		setRotationAngle(ironsights_r11, 0.0F, -1.5708F, -0.48F);
		ironsights_r11.cubeList.add(new ModelBox(ironsights_r11, 260, 303, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r12 = new ModelRenderer(this);
		ironsights_r12.setRotationPoint(-1.5F, -32.825F, -136.95F);
		frontSightBlock.addChild(ironsights_r12);
		setRotationAngle(ironsights_r12, 0.0F, -1.5708F, 0.0F);
		ironsights_r12.cubeList.add(new ModelBox(ironsights_r12, 302, 35, 0.6F, 1.0F, -1.0F, 1, 2, 2, -0.2F, false));
		ironsights_r12.cubeList.add(new ModelBox(ironsights_r12, 302, 80, 1.2F, 1.0F, -1.0F, 1, 2, 2, -0.2F, false));

		ironsights_r13 = new ModelRenderer(this);
		ironsights_r13.setRotationPoint(-1.5F, -32.825F, -135.45F);
		frontSightBlock.addChild(ironsights_r13);
		setRotationAngle(ironsights_r13, 0.0F, -1.5708F, 0.0F);
		ironsights_r13.cubeList.add(new ModelBox(ironsights_r13, 84, 304, 1.2F, 1.0F, -1.0F, 1, 1, 2, -0.2F, false));

		ironsights_r14 = new ModelRenderer(this);
		ironsights_r14.setRotationPoint(-1.5F, -32.7F, -146.35F);
		frontSightBlock.addChild(ironsights_r14);
		setRotationAngle(ironsights_r14, 0.0F, -1.5708F, 0.0F);
		ironsights_r14.cubeList.add(new ModelBox(ironsights_r14, 10, 301, -1.1F, 0.3F, -1.0F, 2, 2, 2, -0.2F, false));

		ironsights_r15 = new ModelRenderer(this);
		ironsights_r15.setRotationPoint(-1.5F, -32.35F, -145.7F);
		frontSightBlock.addChild(ironsights_r15);
		setRotationAngle(ironsights_r15, 0.0F, -1.5708F, 0.0F);
		ironsights_r15.cubeList.add(new ModelBox(ironsights_r15, 302, 84, -0.4F, -1.0F, -1.0F, 1, 2, 2, -0.2F, false));

		ironsights_r16 = new ModelRenderer(this);
		ironsights_r16.setRotationPoint(-1.5F, -32.35F, -146.3F);
		frontSightBlock.addChild(ironsights_r16);
		setRotationAngle(ironsights_r16, 0.0F, -1.5708F, 0.0F);
		ironsights_r16.cubeList.add(new ModelBox(ironsights_r16, 58, 300, -1.4F, -1.0F, -1.0F, 2, 2, 2, -0.2F, false));

		ironsights_r17 = new ModelRenderer(this);
		ironsights_r17.setRotationPoint(-2.7F, -30.9123F, -146.6153F);
		frontSightBlock.addChild(ironsights_r17);
		setRotationAngle(ironsights_r17, 0.0F, -1.5708F, 0.0F);
		ironsights_r17.cubeList.add(new ModelBox(ironsights_r17, 188, 301, -1.4F, -4.0F, -2.0F, 1, 3, 2, -0.4F, false));

		ironsights_r18 = new ModelRenderer(this);
		ironsights_r18.setRotationPoint(-2.3F, -30.9123F, -146.6153F);
		frontSightBlock.addChild(ironsights_r18);
		setRotationAngle(ironsights_r18, 0.0F, -1.5708F, 0.0F);
		ironsights_r18.cubeList.add(new ModelBox(ironsights_r18, 232, 300, -1.4F, -4.0F, -2.0F, 1, 3, 2, -0.4F, false));

		ironsights_r19 = new ModelRenderer(this);
		ironsights_r19.setRotationPoint(-1.3F, -34.2484F, -144.988F);
		frontSightBlock.addChild(ironsights_r19);
		setRotationAngle(ironsights_r19, 1.5708F, -1.3526F, -1.5708F);
		ironsights_r19.cubeList.add(new ModelBox(ironsights_r19, 266, 179, -1.3F, -2.0F, -1.0F, 1, 4, 2, -0.4F, false));

		ironsights_r20 = new ModelRenderer(this);
		ironsights_r20.setRotationPoint(-1.7F, -34.2484F, -144.988F);
		frontSightBlock.addChild(ironsights_r20);
		setRotationAngle(ironsights_r20, 1.5708F, -1.3526F, -1.5708F);
		ironsights_r20.cubeList.add(new ModelBox(ironsights_r20, 66, 300, -1.3F, -2.0F, -1.0F, 1, 4, 2, -0.4F, false));

		ironsights_r21 = new ModelRenderer(this);
		ironsights_r21.setRotationPoint(-1.7F, -34.7234F, -144.788F);
		frontSightBlock.addChild(ironsights_r21);
		setRotationAngle(ironsights_r21, 1.5708F, -1.3526F, -1.5708F);
		ironsights_r21.cubeList.add(new ModelBox(ironsights_r21, 238, 299, -1.401F, -2.0F, -1.0F, 1, 5, 2, -0.4F, false));

		ironsights_r22 = new ModelRenderer(this);
		ironsights_r22.setRotationPoint(-1.3F, -34.7234F, -144.788F);
		frontSightBlock.addChild(ironsights_r22);
		setRotationAngle(ironsights_r22, 1.5708F, -1.3526F, -1.5708F);
		ironsights_r22.cubeList.add(new ModelBox(ironsights_r22, 270, 298, -1.4F, -2.0F, -1.0F, 1, 5, 2, -0.4F, false));

		sights = new ModelRenderer(this);
		sights.setRotationPoint(0.0F, -35.9F, -146.35F);
		irons.addChild(sights);
		sights.cubeList.add(new ModelBox(sights, 288, 73, -2.5F, -1.76F, 35.92F, 2, 1, 6, -0.301F, false));
		sights.cubeList.add(new ModelBox(sights, 238, 212, -3.1F, -1.56F, 41.22F, 3, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 246, 212, -3.1F, -1.76F, 41.22F, 3, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 254, 212, -3.1F, -1.96F, 41.22F, 3, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 306, 245, -0.9F, -1.96F, 41.22F, 1, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 246, 306, -0.9F, -1.76F, 41.22F, 1, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 306, 247, -0.9F, -1.56F, 41.22F, 1, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 306, 249, -0.9F, -2.16F, 41.22F, 1, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 306, 251, -1.1F, -2.16F, 41.22F, 1, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 306, 253, -1.3F, -2.16F, 41.22F, 1, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 306, 255, -1.5F, -2.16F, 41.22F, 1, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 306, 257, -1.7F, -2.16F, 41.22F, 1, 1, 1, -0.401F, false));
		sights.cubeList.add(new ModelBox(sights, 306, 259, -1.7F, -2.26F, 41.22F, 1, 1, 1, -0.402F, false));
		sights.cubeList.add(new ModelBox(sights, 260, 306, -1.5F, -2.26F, 41.22F, 1, 1, 1, -0.401F, false));
		sights.cubeList.add(new ModelBox(sights, 306, 261, -1.3F, -2.26F, 41.22F, 1, 1, 1, -0.401F, false));
		sights.cubeList.add(new ModelBox(sights, 306, 263, -1.1F, -2.26F, 41.22F, 1, 1, 1, -0.401F, false));
		sights.cubeList.add(new ModelBox(sights, 306, 265, -0.9F, -2.26F, 41.22F, 1, 1, 1, -0.401F, false));
		sights.cubeList.add(new ModelBox(sights, 306, 267, -2.3F, -2.26F, 41.22F, 1, 1, 1, -0.402F, false));
		sights.cubeList.add(new ModelBox(sights, 306, 269, -2.5F, -2.26F, 41.22F, 1, 1, 1, -0.401F, false));
		sights.cubeList.add(new ModelBox(sights, 306, 296, -2.7F, -2.26F, 41.22F, 1, 1, 1, -0.401F, false));
		sights.cubeList.add(new ModelBox(sights, 306, 298, -2.9F, -2.26F, 41.22F, 1, 1, 1, -0.401F, false));
		sights.cubeList.add(new ModelBox(sights, 306, 304, -3.1F, -2.26F, 41.22F, 1, 1, 1, -0.401F, false));
		sights.cubeList.add(new ModelBox(sights, 306, 306, -2.3F, -2.16F, 41.22F, 1, 1, 1, -0.401F, false));
		sights.cubeList.add(new ModelBox(sights, 4, 307, -2.5F, -2.16F, 41.22F, 1, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 22, 307, -2.9F, -2.16F, 41.22F, 1, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 26, 307, -3.1F, -2.16F, 41.22F, 1, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 30, 307, -2.7F, -2.16F, 41.22F, 1, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 46, 305, -2.0F, -1.8F, -2.1F, 1, 2, 1, -0.4F, false));

		ironsights_r23 = new ModelRenderer(this);
		ironsights_r23.setRotationPoint(-1.95F, -2.5444F, 38.3787F);
		sights.addChild(ironsights_r23);
		setRotationAngle(ironsights_r23, -1.5708F, -1.1781F, 1.5708F);
		ironsights_r23.cubeList.add(new ModelBox(ironsights_r23, 292, 301, -0.4F, 1.0F, 0.0F, 3, 2, 1, -0.2F, false));

		ironsights_r24 = new ModelRenderer(this);
		ironsights_r24.setRotationPoint(-0.05F, -2.5444F, 38.3787F);
		sights.addChild(ironsights_r24);
		setRotationAngle(ironsights_r24, -1.5708F, -1.1781F, 1.5708F);
		ironsights_r24.cubeList.add(new ModelBox(ironsights_r24, 284, 301, -0.4F, 1.0F, 0.0F, 3, 2, 1, -0.2F, false));

		ironsights_r25 = new ModelRenderer(this);
		ironsights_r25.setRotationPoint(-0.05F, -2.7123F, 36.3347F);
		sights.addChild(ironsights_r25);
		setRotationAngle(ironsights_r25, 0.0F, -1.5708F, 0.0F);
		ironsights_r25.cubeList.add(new ModelBox(ironsights_r25, 304, 76, -0.4F, 1.0F, 0.0F, 2, 2, 1, -0.2F, false));

		ironsights_r26 = new ModelRenderer(this);
		ironsights_r26.setRotationPoint(-1.55F, -2.3123F, 36.5347F);
		sights.addChild(ironsights_r26);
		setRotationAngle(ironsights_r26, 0.0F, -1.5708F, 0.0F);
		ironsights_r26.cubeList.add(new ModelBox(ironsights_r26, 78, 304, -0.4F, 1.0F, -1.0F, 1, 1, 2, -0.1F, false));

		ironsights_r27 = new ModelRenderer(this);
		ironsights_r27.setRotationPoint(-1.95F, -2.7123F, 36.3347F);
		sights.addChild(ironsights_r27);
		setRotationAngle(ironsights_r27, 0.0F, -1.5708F, 0.0F);
		ironsights_r27.cubeList.add(new ModelBox(ironsights_r27, 304, 73, -0.4F, 1.0F, 0.0F, 2, 2, 1, -0.2F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.7F, -1.36F, 40.72F);
		sights.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.3665F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 34, 307, -0.8F, -0.2783F, -0.5226F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 38, 307, 2.2F, -0.2783F, -0.5226F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 42, 307, 1.7F, -0.2783F, -0.5226F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 50, 307, -0.3F, -0.2783F, -0.5226F, 1, 1, 1, 0.0F, false));
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