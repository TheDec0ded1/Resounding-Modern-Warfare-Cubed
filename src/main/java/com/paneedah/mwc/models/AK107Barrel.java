package com.paneedah.mwc.models;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AK107Barrel extends ModelBase {
	private final ModelRenderer barrelGroup;
	private final ModelRenderer gun251_r1;
	private final ModelRenderer gun250_r1;
	private final ModelRenderer gun250_r2;
	private final ModelRenderer gun249_r1;
	private final ModelRenderer gun250_r3;
	private final ModelRenderer gun249_r2;
	private final ModelRenderer gun249_r3;
	private final ModelRenderer gun248_r1;
	private final ModelRenderer gun249_r4;
	private final ModelRenderer gun250_r4;
	private final ModelRenderer gun249_r5;
	private final ModelRenderer gun248_r2;
	private final ModelRenderer gun250_r5;
	private final ModelRenderer gun249_r6;
	private final ModelRenderer gun251_r2;
	private final ModelRenderer gun250_r6;
	private final ModelRenderer gun251_r3;
	private final ModelRenderer gun250_r7;
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

	public AK107Barrel() {
		textureWidth = 400;
		textureHeight = 400;

		barrelGroup = new ModelRenderer(this);
		barrelGroup.setRotationPoint(-2.0F, -15.0F, -60.0F);
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 238, 377, 0.0F, 2.4F, -8.05F, 1, 1, 2, -0.15F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 90, 218, 0.0F, -0.6F, -15.95F, 1, 1, 36, 0.0F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 90, 180, -0.8192F, -0.0264F, -15.95F, 1, 2, 36, 0.0F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 180, 117, 0.8192F, -0.0264F, -15.95F, 1, 2, 36, 0.0F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 232, 377, 0.0F, 3.3899F, -8.05F, 1, 1, 2, -0.15F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 226, 377, 0.495F, 2.895F, -8.05F, 1, 1, 2, -0.15F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 220, 377, -0.495F, 2.895F, -8.05F, 1, 1, 2, -0.15F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 8, 373, -0.495F, 2.895F, 1.15F, 1, 1, 3, -0.15F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 0, 373, 0.495F, 2.895F, 1.15F, 1, 1, 3, -0.15F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 372, 366, 0.0F, 3.3899F, 1.15F, 1, 1, 3, -0.15F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 72, 372, 0.0F, 2.4F, 1.15F, 1, 1, 3, -0.15F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 214, 368, 0.0F, 2.4F, -17.85F, 1, 1, 4, -0.15F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 352, 366, 0.495F, 2.895F, -17.85F, 1, 1, 4, -0.15F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 366, 181, -0.495F, 2.895F, -17.85F, 1, 1, 4, -0.15F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 284, 363, 0.0F, 3.3899F, -17.85F, 1, 1, 4, -0.15F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 264, 363, 0.0F, -0.2007F, 0.7F, 1, 1, 4, -0.125F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 274, 363, 0.0F, 0.325F, 0.7F, 1, 1, 4, -0.125F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 254, 363, 0.0F, 0.8599F, 0.7F, 1, 1, 4, -0.125F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 244, 363, 0.5303F, 0.3296F, 0.7F, 1, 1, 4, -0.125F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 234, 363, -0.5303F, 0.3296F, 0.7F, 1, 1, 4, -0.125F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 0, 0, 0.0F, 2.5F, -17.0F, 1, 1, 44, -0.2F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 184, 375, 0.0F, 0.7F, 1.675F, 1, 2, 2, -0.1F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 90, 0, 0.0F, 3.3485F, -17.0F, 1, 1, 44, -0.2F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 0, 180, 0.0F, 4.2314F, -16.2F, 1, 1, 44, -0.2F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 90, 45, 0.4243F, 2.9243F, -17.0F, 1, 1, 44, -0.2F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 90, 90, -0.4243F, 2.9243F, -17.0F, 1, 1, 44, -0.2F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 56, 372, 0.0F, 2.175F, -20.5F, 1, 1, 3, 0.0F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 360, 371, 0.0F, 3.5892F, -20.5F, 1, 1, 3, 0.0F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 352, 371, 0.7071F, 2.8821F, -20.5F, 1, 1, 3, 0.0F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 120, 371, -0.7071F, 2.8821F, -20.5F, 1, 1, 3, 0.0F, false));

		gun251_r1 = new ModelRenderer(this);
		gun251_r1.setRotationPoint(1.0F, 3.8821F, -29.0F);
		barrelGroup.addChild(gun251_r1);
		setRotationAngle(gun251_r1, 0.0F, 0.0F, -0.7854F);
		gun251_r1.cubeList.add(new ModelBox(gun251_r1, 104, 371, -0.5F, -0.5F, 8.5F, 1, 1, 3, 0.0F, false));

		gun250_r1 = new ModelRenderer(this);
		gun250_r1.setRotationPoint(0.0F, 3.8821F, -29.0F);
		barrelGroup.addChild(gun250_r1);
		setRotationAngle(gun250_r1, 0.0F, 0.0F, -0.7854F);
		gun250_r1.cubeList.add(new ModelBox(gun250_r1, 112, 371, -0.5F, -0.5F, 8.5F, 1, 1, 3, 0.0F, false));

		gun250_r2 = new ModelRenderer(this);
		gun250_r2.setRotationPoint(1.0F, 2.8821F, -29.0F);
		barrelGroup.addChild(gun250_r2);
		setRotationAngle(gun250_r2, 0.0F, 0.0F, -0.7854F);
		gun250_r2.cubeList.add(new ModelBox(gun250_r2, 368, 371, -0.5F, -0.5F, 8.5F, 1, 1, 3, 0.0F, false));

		gun249_r1 = new ModelRenderer(this);
		gun249_r1.setRotationPoint(0.0F, 2.8821F, -29.0F);
		barrelGroup.addChild(gun249_r1);
		setRotationAngle(gun249_r1, 0.0F, 0.0F, -0.7854F);
		gun249_r1.cubeList.add(new ModelBox(gun249_r1, 48, 372, -0.5F, -0.5F, 8.5F, 1, 1, 3, 0.0F, false));

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

		gun249_r4 = new ModelRenderer(this);
		gun249_r4.setRotationPoint(0.125F, 1.2046F, 9.2F);
		barrelGroup.addChild(gun249_r4);
		setRotationAngle(gun249_r4, 0.0F, 0.0F, -0.7854F);
		gun249_r4.cubeList.add(new ModelBox(gun249_r4, 360, 66, -0.5F, -0.5F, -8.5F, 1, 1, 4, -0.125F, false));

		gun250_r4 = new ModelRenderer(this);
		gun250_r4.setRotationPoint(0.875F, 1.2046F, 9.2F);
		barrelGroup.addChild(gun250_r4);
		setRotationAngle(gun250_r4, 0.0F, 0.0F, -0.7854F);
		gun250_r4.cubeList.add(new ModelBox(gun250_r4, 360, 71, -0.5F, -0.5F, -8.5F, 1, 1, 4, -0.125F, false));

		gun249_r5 = new ModelRenderer(this);
		gun249_r5.setRotationPoint(0.875F, 0.4546F, 9.2F);
		barrelGroup.addChild(gun249_r5);
		setRotationAngle(gun249_r5, 0.0F, 0.0F, -0.7854F);
		gun249_r5.cubeList.add(new ModelBox(gun249_r5, 214, 363, -0.5F, -0.5F, -8.5F, 1, 1, 4, -0.125F, false));

		gun248_r2 = new ModelRenderer(this);
		gun248_r2.setRotationPoint(0.125F, 0.4546F, 9.2F);
		barrelGroup.addChild(gun248_r2);
		setRotationAngle(gun248_r2, 0.0F, 0.0F, -0.7854F);
		gun248_r2.cubeList.add(new ModelBox(gun248_r2, 224, 363, -0.5F, -0.5F, -8.5F, 1, 1, 4, -0.125F, false));

		gun250_r5 = new ModelRenderer(this);
		gun250_r5.setRotationPoint(0.15F, 3.745F, -10.35F);
		barrelGroup.addChild(gun250_r5);
		setRotationAngle(gun250_r5, 0.0F, 0.0F, -0.7854F);
		gun250_r5.cubeList.add(new ModelBox(gun250_r5, 294, 363, -0.5F, -0.5F, -7.5F, 1, 1, 4, -0.15F, false));
		gun250_r5.cubeList.add(new ModelBox(gun250_r5, 40, 373, -0.5F, -0.5F, 11.5F, 1, 1, 3, -0.15F, false));
		gun250_r5.cubeList.add(new ModelBox(gun250_r5, 36, 377, -0.5F, -0.5F, 2.3F, 1, 1, 2, -0.15F, false));

		gun249_r6 = new ModelRenderer(this);
		gun249_r6.setRotationPoint(0.15F, 3.045F, -10.35F);
		barrelGroup.addChild(gun249_r6);
		setRotationAngle(gun249_r6, 0.0F, 0.0F, -0.7854F);
		gun249_r6.cubeList.add(new ModelBox(gun249_r6, 366, 186, -0.5F, -0.5F, -7.5F, 1, 1, 4, -0.15F, false));
		gun249_r6.cubeList.add(new ModelBox(gun249_r6, 16, 373, -0.5F, -0.5F, 11.5F, 1, 1, 3, -0.15F, false));
		gun249_r6.cubeList.add(new ModelBox(gun249_r6, 214, 377, -0.5F, -0.5F, 2.3F, 1, 1, 2, -0.15F, false));

		gun251_r2 = new ModelRenderer(this);
		gun251_r2.setRotationPoint(0.85F, 3.745F, -10.35F);
		barrelGroup.addChild(gun251_r2);
		setRotationAngle(gun251_r2, 0.0F, 0.0F, -0.7854F);
		gun251_r2.cubeList.add(new ModelBox(gun251_r2, 362, 366, -0.5F, -0.5F, -7.5F, 1, 1, 4, -0.15F, false));
		gun251_r2.cubeList.add(new ModelBox(gun251_r2, 32, 373, -0.5F, -0.5F, 11.5F, 1, 1, 3, -0.15F, false));
		gun251_r2.cubeList.add(new ModelBox(gun251_r2, 42, 377, -0.5F, -0.5F, 2.3F, 1, 1, 2, -0.15F, false));

		gun250_r6 = new ModelRenderer(this);
		gun250_r6.setRotationPoint(0.85F, 3.045F, -10.35F);
		barrelGroup.addChild(gun250_r6);
		setRotationAngle(gun250_r6, 0.0F, 0.0F, -0.7854F);
		gun250_r6.cubeList.add(new ModelBox(gun250_r6, 368, 107, -0.5F, -0.5F, -7.5F, 1, 1, 4, -0.15F, false));
		gun250_r6.cubeList.add(new ModelBox(gun250_r6, 24, 373, -0.5F, -0.5F, 11.5F, 1, 1, 3, -0.15F, false));
		gun250_r6.cubeList.add(new ModelBox(gun250_r6, 208, 377, -0.5F, -0.5F, 2.3F, 1, 1, 2, -0.15F, false));

		gun251_r3 = new ModelRenderer(this);
		gun251_r3.setRotationPoint(-0.1228F, 0.0964F, 5.05F);
		barrelGroup.addChild(gun251_r3);
		setRotationAngle(gun251_r3, 0.0F, 0.0F, -0.6109F);
		gun251_r3.cubeList.add(new ModelBox(gun251_r3, 164, 231, -0.5F, -0.5F, -21.0F, 1, 1, 36, 0.0F, false));

		gun250_r7 = new ModelRenderer(this);
		gun250_r7.setRotationPoint(1.1228F, 0.0964F, 5.05F);
		barrelGroup.addChild(gun250_r7);
		setRotationAngle(gun250_r7, 0.0F, 0.0F, 0.6109F);
		gun250_r7.cubeList.add(new ModelBox(gun250_r7, 0, 225, -0.5F, -0.5F, -21.0F, 1, 1, 36, 0.0F, false));

		irons = new ModelRenderer(this);
		irons.setRotationPoint(2.0F, 35.4F, 131.45F);
		barrelGroup.addChild(irons);
		

		frontSightBlock = new ModelRenderer(this);
		frontSightBlock.setRotationPoint(0.0F, 0.0F, -1.0F);
		irons.addChild(frontSightBlock);
		frontSightBlock.cubeList.add(new ModelBox(frontSightBlock, 364, 113, -2.0F, -37.7F, -147.45F, 1, 2, 1, -0.4F, false));

		ironsights_r1 = new ModelRenderer(this);
		ironsights_r1.setRotationPoint(-1.5F, -37.4123F, -146.4153F);
		frontSightBlock.addChild(ironsights_r1);
		setRotationAngle(ironsights_r1, 0.0F, -1.5708F, 0.0F);
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 6, 377, -1.4F, 2.3F, -1.0F, 1, 1, 2, -0.2F, false));
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 118, 375, -1.4F, 1.1F, -1.0F, 1, 2, 2, -0.2F, false));

		ironsights_r2 = new ModelRenderer(this);
		ironsights_r2.setRotationPoint(-1.5F, -38.3123F, -147.1403F);
		frontSightBlock.addChild(ironsights_r2);
		setRotationAngle(ironsights_r2, 0.0F, -1.5708F, 0.0F);
		ironsights_r2.cubeList.add(new ModelBox(ironsights_r2, 30, 377, -0.375F, 2.3F, -1.0F, 1, 1, 2, -0.1F, false));

		ironsights_r3 = new ModelRenderer(this);
		ironsights_r3.setRotationPoint(-1.5F, -37.4123F, -146.8403F);
		frontSightBlock.addChild(ironsights_r3);
		setRotationAngle(ironsights_r3, 0.0F, -1.5708F, 0.0F);
		ironsights_r3.cubeList.add(new ModelBox(ironsights_r3, 12, 377, -0.375F, 2.3F, -1.0F, 1, 1, 2, -0.2F, false));
		ironsights_r3.cubeList.add(new ModelBox(ironsights_r3, 158, 264, -0.375F, 1.1F, -1.0F, 1, 2, 2, -0.2F, false));

		ironsights_r4 = new ModelRenderer(this);
		ironsights_r4.setRotationPoint(-0.299F, -38.1871F, -147.0153F);
		frontSightBlock.addChild(ironsights_r4);
		setRotationAngle(ironsights_r4, 0.0F, -1.5708F, -0.48F);
		ironsights_r4.cubeList.add(new ModelBox(ironsights_r4, 376, 370, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r5 = new ModelRenderer(this);
		ironsights_r5.setRotationPoint(-1.814F, -37.7253F, -147.0153F);
		frontSightBlock.addChild(ironsights_r5);
		setRotationAngle(ironsights_r5, 0.0F, -1.5708F, 0.48F);
		ironsights_r5.cubeList.add(new ModelBox(ironsights_r5, 376, 187, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r6 = new ModelRenderer(this);
		ironsights_r6.setRotationPoint(0.1627F, -36.7533F, -147.0153F);
		frontSightBlock.addChild(ironsights_r6);
		setRotationAngle(ironsights_r6, 0.0F, -1.5708F, 0.48F);
		ironsights_r6.cubeList.add(new ModelBox(ironsights_r6, 376, 184, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r7 = new ModelRenderer(this);
		ironsights_r7.setRotationPoint(-2.2757F, -37.215F, -147.0153F);
		frontSightBlock.addChild(ironsights_r7);
		setRotationAngle(ironsights_r7, 0.0F, -1.5708F, -0.48F);
		ironsights_r7.cubeList.add(new ModelBox(ironsights_r7, 376, 181, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r8 = new ModelRenderer(this);
		ironsights_r8.setRotationPoint(-1.5F, -32.45F, -146.15F);
		frontSightBlock.addChild(ironsights_r8);
		setRotationAngle(ironsights_r8, -1.5708F, -0.7418F, 1.5708F);
		ironsights_r8.cubeList.add(new ModelBox(ironsights_r8, 0, 377, -1.4F, -1.0F, -1.0F, 1, 1, 2, -0.2F, false));

		ironsights_r9 = new ModelRenderer(this);
		ironsights_r9.setRotationPoint(-1.5F, -33.525F, -138.95F);
		frontSightBlock.addChild(ironsights_r9);
		setRotationAngle(ironsights_r9, 0.0F, -1.5708F, 0.0F);
		ironsights_r9.cubeList.add(new ModelBox(ironsights_r9, 190, 375, 0.6F, 1.0F, -1.0F, 1, 2, 2, -0.2F, false));
		ironsights_r9.cubeList.add(new ModelBox(ironsights_r9, 196, 375, 1.2F, 1.0F, -1.0F, 1, 2, 2, -0.2F, false));

		ironsights_r10 = new ModelRenderer(this);
		ironsights_r10.setRotationPoint(-1.5F, -32.825F, -130.55F);
		frontSightBlock.addChild(ironsights_r10);
		setRotationAngle(ironsights_r10, 0.0F, -1.5708F, 0.0F);
		ironsights_r10.cubeList.add(new ModelBox(ironsights_r10, 24, 377, 1.2F, 1.0F, -1.0F, 1, 1, 2, -0.2F, false));

		ironsights_r11 = new ModelRenderer(this);
		ironsights_r11.setRotationPoint(-1.5F, -32.7F, -146.35F);
		frontSightBlock.addChild(ironsights_r11);
		setRotationAngle(ironsights_r11, 0.0F, -1.5708F, 0.0F);
		ironsights_r11.cubeList.add(new ModelBox(ironsights_r11, 202, 375, -1.1F, 0.3F, -1.0F, 1, 2, 2, -0.2F, false));
		ironsights_r11.cubeList.add(new ModelBox(ironsights_r11, 96, 371, -1.4F, -1.0F, -1.0F, 2, 2, 2, -0.2F, false));

		ironsights_r12 = new ModelRenderer(this);
		ironsights_r12.setRotationPoint(-1.5F, -32.825F, -146.45F);
		frontSightBlock.addChild(ironsights_r12);
		setRotationAngle(ironsights_r12, 0.0F, -1.5708F, 0.0F);
		ironsights_r12.cubeList.add(new ModelBox(ironsights_r12, 142, 375, 0.6F, 1.0F, -1.0F, 1, 2, 2, -0.2F, false));
		ironsights_r12.cubeList.add(new ModelBox(ironsights_r12, 136, 375, 1.2F, 1.0F, -1.0F, 1, 2, 2, -0.2F, false));

		ironsights_r13 = new ModelRenderer(this);
		ironsights_r13.setRotationPoint(-2.7F, -30.3644F, -145.1391F);
		frontSightBlock.addChild(ironsights_r13);
		setRotationAngle(ironsights_r13, 0.0F, -1.5708F, 0.0F);
		ironsights_r13.cubeList.add(new ModelBox(ironsights_r13, 94, 375, -1.4F, -4.0F, -2.0F, 1, 3, 2, -0.4F, false));

		ironsights_r14 = new ModelRenderer(this);
		ironsights_r14.setRotationPoint(-2.3F, -30.3644F, -145.1391F);
		frontSightBlock.addChild(ironsights_r14);
		setRotationAngle(ironsights_r14, 0.0F, -1.5708F, 0.0F);
		ironsights_r14.cubeList.add(new ModelBox(ironsights_r14, 100, 375, -1.4F, -4.0F, -2.0F, 1, 3, 2, -0.4F, false));

		ironsights_r15 = new ModelRenderer(this);
		ironsights_r15.setRotationPoint(-2.7F, -30.9123F, -146.6153F);
		frontSightBlock.addChild(ironsights_r15);
		setRotationAngle(ironsights_r15, 0.0F, -1.5708F, 0.0F);
		ironsights_r15.cubeList.add(new ModelBox(ironsights_r15, 346, 373, -1.4F, -4.0F, -2.0F, 1, 3, 2, -0.4F, false));

		ironsights_r16 = new ModelRenderer(this);
		ironsights_r16.setRotationPoint(-2.3F, -30.9123F, -146.6153F);
		frontSightBlock.addChild(ironsights_r16);
		setRotationAngle(ironsights_r16, 0.0F, -1.5708F, 0.0F);
		ironsights_r16.cubeList.add(new ModelBox(ironsights_r16, 48, 366, -1.4F, -4.0F, -2.0F, 1, 3, 2, -0.4F, false));

		ironsights_r17 = new ModelRenderer(this);
		ironsights_r17.setRotationPoint(-1.3F, -34.4234F, -145.488F);
		frontSightBlock.addChild(ironsights_r17);
		setRotationAngle(ironsights_r17, 1.5708F, -1.3526F, -1.5708F);
		ironsights_r17.cubeList.add(new ModelBox(ironsights_r17, 106, 375, -1.3F, -2.0F, -1.0F, 1, 3, 2, -0.4F, false));
		ironsights_r17.cubeList.add(new ModelBox(ironsights_r17, 124, 375, -1.4F, -0.9F, -1.0F, 1, 2, 2, -0.4F, false));

		ironsights_r18 = new ModelRenderer(this);
		ironsights_r18.setRotationPoint(-1.7F, -34.4234F, -145.488F);
		frontSightBlock.addChild(ironsights_r18);
		setRotationAngle(ironsights_r18, 1.5708F, -1.3526F, -1.5708F);
		ironsights_r18.cubeList.add(new ModelBox(ironsights_r18, 112, 375, -1.3F, -2.0F, -1.0F, 1, 3, 2, -0.4F, false));
		ironsights_r18.cubeList.add(new ModelBox(ironsights_r18, 130, 375, -1.4F, -0.9F, -1.0F, 1, 2, 2, -0.4F, false));

		ironsights_r19 = new ModelRenderer(this);
		ironsights_r19.setRotationPoint(-1.7F, -34.7234F, -145.288F);
		frontSightBlock.addChild(ironsights_r19);
		setRotationAngle(ironsights_r19, 1.5708F, -1.3526F, -1.5708F);
		ironsights_r19.cubeList.add(new ModelBox(ironsights_r19, 88, 375, -1.4F, -2.0F, -1.0F, 1, 3, 2, -0.4F, false));

		ironsights_r20 = new ModelRenderer(this);
		ironsights_r20.setRotationPoint(-1.3F, -34.7234F, -145.288F);
		frontSightBlock.addChild(ironsights_r20);
		setRotationAngle(ironsights_r20, 1.5708F, -1.3526F, -1.5708F);
		ironsights_r20.cubeList.add(new ModelBox(ironsights_r20, 48, 361, -1.4F, -2.0F, -1.0F, 1, 3, 2, -0.4F, false));
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