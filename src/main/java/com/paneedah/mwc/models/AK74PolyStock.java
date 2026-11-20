package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AK74PolyStock extends ModelBase {
	private final ModelRenderer stock;
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
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;
	private final ModelRenderer cube_r34;
	private final ModelRenderer slingLoop;
	private final ModelRenderer cube_r35;
	private final ModelRenderer cube_r36;
	private final ModelRenderer cube_r82_r1;
	private final ModelRenderer cube_r80_r1;
	private final ModelRenderer cube_r79_r1;
	private final ModelRenderer cube_r78_r1;

	public AK74PolyStock() {
		textureWidth = 384;
		textureHeight = 384;

		stock = new ModelRenderer(this);
		stock.setRotationPoint(0.0F, 23.6F, -2.0F);
		stock.cubeList.add(new ModelBox(stock, 46, 0, -2.5F, -35.4308F, 12.8628F, 2, 1, 20, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 90, 0, -3.2071F, -34.7237F, 12.8628F, 1, 1, 20, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 306, 145, -3.2071F, -32.7237F, 20.8628F, 1, 1, 12, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 108, 228, -3.2071F, -33.7237F, 17.8628F, 1, 1, 15, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 246, 349, -3.407F, -33.9237F, 12.6628F, 1, 1, 6, -0.2F, false));
		stock.cubeList.add(new ModelBox(stock, 210, 61, -3.4071F, -33.5237F, 17.2628F, 1, 1, 1, -0.2F, false));
		stock.cubeList.add(new ModelBox(stock, 320, 312, -3.4071F, -33.1237F, 20.2628F, 1, 1, 1, -0.2F, false));
		stock.cubeList.add(new ModelBox(stock, 114, 301, -3.4071F, -32.1237F, 27.2628F, 1, 1, 1, -0.2F, false));
		stock.cubeList.add(new ModelBox(stock, 318, 232, -3.2071F, -31.7237F, 27.8628F, 1, 1, 5, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 342, 353, -3.2071F, -30.7237F, 28.8628F, 1, 5, 4, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 24, 321, -3.2069F, -33.7237F, 11.8628F, 1, 1, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 196, 223, -3.2071F, -26.1237F, 31.8628F, 1, 2, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 358, 166, -3.2071F, -26.1281F, 28.5782F, 1, 1, 4, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 34, 224, -0.7822F, -26.1237F, 31.8628F, 1, 2, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 352, 353, -0.782F, -30.7237F, 28.8628F, 1, 5, 4, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 302, 364, -0.7822F, -26.1281F, 28.8782F, 1, 1, 3, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 354, 144, -0.782F, -31.7237F, 27.8628F, 1, 1, 5, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 0, 229, -0.782F, -33.7237F, 17.8628F, 1, 1, 15, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 308, 81, -0.782F, -32.7237F, 20.8628F, 1, 1, 12, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 0, 105, -0.782F, -34.7237F, 12.8628F, 1, 1, 20, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 128, 347, -0.782F, -33.7237F, 11.8628F, 1, 1, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 260, 349, -0.582F, -33.9237F, 12.6628F, 1, 1, 6, -0.2F, false));
		stock.cubeList.add(new ModelBox(stock, 118, 224, -0.5821F, -33.5237F, 17.2628F, 1, 1, 1, -0.2F, false));
		stock.cubeList.add(new ModelBox(stock, 128, 345, -0.5821F, -33.1237F, 20.2628F, 1, 1, 1, -0.2F, false));
		stock.cubeList.add(new ModelBox(stock, 114, 303, -0.5821F, -32.1237F, 27.2628F, 1, 1, 1, -0.2F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.2374F, -28.34F, 16.6106F);
		stock.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.1872F, 0.1841F, 0.7681F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 90, 42, 0.0F, -1.0428F, -3.7453F, 1, 1, 20, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.4654F, -28.4388F, 16.601F);
		stock.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.124F, 0.1231F, 0.7777F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 340, 18, 0.0F, -1.3653F, -11.6401F, 1, 1, 8, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-3.2374F, -28.34F, 16.6106F);
		stock.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.1872F, 0.1841F, 0.7681F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 90, 21, 0.0F, -1.0428F, -3.7453F, 1, 1, 20, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-3.4654F, -28.4388F, 16.601F);
		stock.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.124F, 0.1231F, 0.7777F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 340, 9, 0.0F, -1.3653F, -11.6401F, 1, 1, 8, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-0.2821F, -32.0219F, 8.0541F);
		stock.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.1309F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 328, 368, -0.5002F, -0.5F, 5.0F, 1, 1, 2, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 322, 368, -2.9249F, -0.5F, 5.0F, 1, 1, 2, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.925F, -35.0772F, 15.4128F);
		stock.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.1309F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 260, 225, -1.7072F, 1.6536F, -1.5F, 1, 1, 14, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 64, 259, -4.1321F, 1.6536F, -1.5F, 1, 1, 14, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-0.2821F, -33.3311F, 8.0633F);
		stock.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.3927F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 162, 369, -0.5002F, -0.5F, 5.0F, 1, 1, 2, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 6, 369, -2.9249F, -0.5F, 5.0F, 1, 1, 2, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(10.8179F, -36.4708F, -4.3442F);
		stock.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.2618F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 314, 359, -11.4F, 0.6F, 18.2F, 1, 1, 4, -0.2F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 160, 359, -14.225F, 0.6F, 18.2F, 1, 1, 4, -0.2F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(8.6179F, -36.1274F, -2.6762F);
		stock.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.2618F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 254, 369, -9.3F, 0.6F, 20.2F, 1, 1, 2, -0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 102, 369, -11.925F, 0.6F, 20.2F, 1, 1, 2, -0.1F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(15.2179F, -36.1992F, 3.1789F);
		stock.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.2618F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 260, 369, -15.6999F, 0.5F, 24.2F, 1, 1, 2, -0.3F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 132, 369, -18.725F, 0.5F, 24.2F, 1, 1, 2, -0.3F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(11.9179F, -35.4697F, 3.2557F);
		stock.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.2618F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 324, 359, -12.5002F, 0.6F, 18.2F, 1, 1, 4, -0.2F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 214, 359, -15.325F, 0.6F, 18.2F, 1, 1, 4, -0.2F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.925F, -35.7346F, 15.3362F);
		stock.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.1309F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 192, 273, -1.7072F, 4.6536F, -1.5F, 1, 1, 14, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 272, 240, -4.1321F, 4.6536F, -1.5F, 1, 1, 14, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-0.5941F, -30.3431F, 27.4502F);
		stock.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.1855F, 0.3435F, -0.0631F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 282, 356, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(2.7179F, -33.115F, 9.4264F);
		stock.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.1745F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 118, 216, -3.5001F, -1.4F, 19.0F, 1, 3, 1, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 34, 216, -5.925F, -1.4F, 19.0F, 1, 3, 1, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 246, 132, -5.425F, -1.4F, 4.2F, 1, 3, 14, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 246, 115, -4.025F, -1.4F, 4.2F, 1, 3, 14, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-0.0405F, -30.1115F, 27.8964F);
		stock.addChild(cube_r15);
		setRotationAngle(cube_r15, 2.7489F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 266, 369, -0.7418F, 0.3722F, -0.8635F, 1, 1, 2, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 12, 369, -3.1666F, 0.3722F, -0.8635F, 1, 1, 2, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-0.0405F, -30.0114F, 27.8964F);
		stock.addChild(cube_r16);
		setRotationAngle(cube_r16, -3.0107F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 272, 369, -0.7418F, -1.302F, -0.6946F, 1, 1, 2, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 96, 369, -3.1666F, -1.302F, -0.6946F, 1, 1, 2, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.925F, -34.4577F, 12.6849F);
		stock.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.3491F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 364, 268, -1.7071F, -0.1465F, -2.5F, 1, 1, 3, 0.0F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 364, 264, -4.132F, -0.1465F, -2.5F, 1, 1, 3, 0.0F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 364, 186, -3.425F, -0.8536F, -2.5F, 2, 1, 3, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-0.5938F, -31.6364F, 14.3507F);
		stock.addChild(cube_r18);
		setRotationAngle(cube_r18, -0.1855F, -0.3435F, 0.0631F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 368, 93, -0.5F, -1.5F, -1.0F, 1, 2, 2, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(2.7179F, -32.615F, 9.3764F);
		stock.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.1745F, 0.0F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 272, 326, -3.4998F, -1.4F, -4.7F, 1, 4, 9, 0.0F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 252, 326, -5.925F, -1.4F, -4.7F, 1, 4, 9, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(6.7179F, -34.4206F, 7.9439F);
		stock.addChild(cube_r20);
		setRotationAngle(cube_r20, -0.2618F, 0.0F, 0.0F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 42, 356, -7.5F, 0.6F, 17.2F, 1, 1, 5, 0.0F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 252, 314, -7.5F, 1.6F, 11.4F, 1, 1, 11, 0.0F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 168, 147, -7.5F, 2.6F, 6.2F, 1, 1, 20, 0.0F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 30, 356, -9.925F, 0.6F, 17.2F, 1, 1, 5, 0.0F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 228, 314, -9.925F, 1.6F, 11.4F, 1, 1, 11, 0.0F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 168, 126, -9.925F, 2.6F, 6.2F, 1, 1, 20, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-1.0F, -33.7376F, 7.7608F);
		stock.addChild(cube_r21);
		setRotationAngle(cube_r21, -0.2618F, 0.0F, 0.0F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 46, 21, -1.5F, 2.6F, 6.2F, 2, 1, 20, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-1.5F, -34.4577F, 12.6849F);
		stock.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.2519F, 0.2443F, -0.7543F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 364, 252, 0.3107F, 0.1035F, -2.5F, 1, 1, 3, 0.0F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 120, 359, -1.1035F, -1.3107F, -2.5F, 1, 1, 3, 0.0F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-2.5714F, -29.9074F, 27.7146F);
		stock.addChild(cube_r23);
		setRotationAngle(cube_r23, 3.0024F, -0.346F, 0.0475F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 300, 355, -0.4289F, -0.637F, -0.6803F, 1, 2, 2, 0.0F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-0.3303F, -31.9296F, 19.9308F);
		stock.addChild(cube_r24);
		setRotationAngle(cube_r24, -0.1392F, 0.346F, -0.0475F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 246, 343, -0.55F, -0.5F, -6.9F, 1, 2, 2, 0.0F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-1.5F, -34.5772F, 15.3628F);
		stock.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.0F, -0.7854F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 88, 63, 0.3107F, 0.1036F, -2.5F, 1, 1, 20, 0.0F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 86, 84, -1.1035F, -1.3107F, -2.5F, 1, 1, 20, 0.0F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(3.6719F, -31.278F, 9.1406F);
		stock.addChild(cube_r26);
		setRotationAngle(cube_r26, -0.124F, -0.1231F, -0.7777F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 136, 349, -1.5F, -5.4F, -4.8F, 1, 1, 6, 0.0F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(-1.1565F, -34.0634F, 9.6318F);
		stock.addChild(cube_r27);
		setRotationAngle(cube_r27, -0.124F, -0.1231F, -0.7777F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 352, 233, -1.5F, -1.4F, -4.8F, 1, 1, 6, 0.0F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-2.0F, -33.6114F, 9.4992F);
		stock.addChild(cube_r28);
		setRotationAngle(cube_r28, -0.1745F, 0.0F, 0.0F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 348, 259, -0.5F, -1.4F, -4.8F, 2, 1, 4, -0.2F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(-2.0F, -33.3114F, 9.4992F);
		stock.addChild(cube_r29);
		setRotationAngle(cube_r29, -0.1745F, 0.0F, 0.0F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 348, 307, -0.5F, -1.4F, -4.8F, 2, 1, 6, 0.0F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(-1.0F, -33.2508F, 7.4576F);
		stock.addChild(cube_r30);
		setRotationAngle(cube_r30, -0.1745F, 0.0F, 0.0F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 292, 337, -1.5F, 2.6F, -1.8F, 2, 1, 8, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-0.1965F, -23.4909F, 33.0628F);
		stock.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 100, 229, -2.3035F, -11.94F, -1.0F, 2, 12, 2, -0.05F, false));
		bone.cubeList.add(new ModelBox(bone, 316, 252, -2.3035F, -0.6672F, -1.0F, 2, 1, 2, -0.05F, false));
		bone.cubeList.add(new ModelBox(bone, 78, 190, -0.6672F, -11.3036F, -1.0F, 1, 11, 2, -0.05F, false));
		bone.cubeList.add(new ModelBox(bone, 134, 244, -2.94F, -11.3036F, -1.0F, 1, 11, 2, -0.05F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.0F, 0.0F, 0.7854F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 348, 127, -1.0F, -0.5F, -1.0F, 1, 1, 2, -0.05F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(-1.9F, 0.0F, 0.0F);
		bone.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.0F, 0.0F, 0.7854F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 132, 337, -1.0F, -0.5F, -1.0F, 1, 1, 2, -0.05F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(-1.9F, -10.9F, 0.0F);
		bone.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.0F, 0.0F, 0.7854F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 328, 99, -1.0F, -0.5F, -1.0F, 1, 1, 2, -0.05F, false));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(0.0F, -10.9F, 0.0F);
		bone.addChild(cube_r34);
		setRotationAngle(cube_r34, 0.0F, 0.0F, 0.7854F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 240, 81, -1.0F, -0.5F, -1.0F, 1, 1, 2, -0.05F, false));

		slingLoop = new ModelRenderer(this);
		slingLoop.setRotationPoint(-3.3865F, -31.3924F, 7.8709F);
		stock.addChild(slingLoop);
		

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(3.4966F, 4.7691F, 18.6564F);
		slingLoop.addChild(cube_r35);
		setRotationAngle(cube_r35, 0.0F, -1.5708F, 0.0F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 300, 359, 0.0486F, -0.8239F, -0.4565F, 2, 1, 1, 0.0F, false));

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(4.8966F, 4.7691F, 19.7565F);
		slingLoop.addChild(cube_r36);
		setRotationAngle(cube_r36, 3.1416F, 0.0F, 3.1416F);
		cube_r36.cubeList.add(new ModelBox(cube_r36, 198, 271, 0.0486F, -0.8239F, -0.4565F, 2, 1, 1, -0.2F, false));

		cube_r82_r1 = new ModelRenderer(this);
		cube_r82_r1.setRotationPoint(4.2123F, 4.7941F, 19.1564F);
		slingLoop.addChild(cube_r82_r1);
		setRotationAngle(cube_r82_r1, -1.0475F, -0.0869F, 0.0076F);
		cube_r82_r1.cubeList.add(new ModelBox(cube_r82_r1, 344, 307, -0.5F, -0.9828F, 0.6815F, 1, 1, 1, -0.3F, false));
		cube_r82_r1.cubeList.add(new ModelBox(cube_r82_r1, 18, 344, -0.5F, -0.9828F, -1.6815F, 1, 1, 1, -0.3F, false));
		cube_r82_r1.cubeList.add(new ModelBox(cube_r82_r1, 288, 343, -0.5F, -0.9828F, 0.2815F, 1, 1, 1, -0.3F, false));
		cube_r82_r1.cubeList.add(new ModelBox(cube_r82_r1, 128, 343, -0.5F, -0.9828F, -1.2815F, 1, 1, 1, -0.3F, false));
		cube_r82_r1.cubeList.add(new ModelBox(cube_r82_r1, 156, 369, -0.5F, -0.0171F, -0.3185F, 1, 1, 2, -0.3F, false));
		cube_r82_r1.cubeList.add(new ModelBox(cube_r82_r1, 138, 369, -0.5F, -0.0172F, -1.6815F, 1, 1, 2, -0.3F, false));
		cube_r82_r1.cubeList.add(new ModelBox(cube_r82_r1, 128, 341, -0.5F, -0.3F, -1.9643F, 1, 1, 1, -0.3F, false));
		cube_r82_r1.cubeList.add(new ModelBox(cube_r82_r1, 288, 339, -0.5F, -0.3F, 0.9643F, 1, 1, 1, -0.3F, false));
		cube_r82_r1.cubeList.add(new ModelBox(cube_r82_r1, 80, 325, -0.5F, -0.7F, 0.9643F, 1, 1, 1, -0.3F, false));
		cube_r82_r1.cubeList.add(new ModelBox(cube_r82_r1, 24, 325, -0.5F, -0.7F, -1.9643F, 1, 1, 1, -0.3F, false));

		cube_r80_r1 = new ModelRenderer(this);
		cube_r80_r1.setRotationPoint(4.2123F, 4.7941F, 19.1564F);
		slingLoop.addChild(cube_r80_r1);
		setRotationAngle(cube_r80_r1, -1.8329F, -0.0869F, 0.0076F);
		cube_r80_r1.cubeList.add(new ModelBox(cube_r80_r1, 18, 342, -0.5F, -1.194F, 0.7597F, 1, 1, 1, -0.3F, false));
		cube_r80_r1.cubeList.add(new ModelBox(cube_r80_r1, 288, 341, -0.5F, 0.7597F, -1.194F, 1, 1, 1, -0.3F, false));
		cube_r80_r1.cubeList.add(new ModelBox(cube_r80_r1, 198, 323, -0.5F, 0.194F, -1.7597F, 1, 1, 1, -0.3F, false));
		cube_r80_r1.cubeList.add(new ModelBox(cube_r80_r1, 80, 323, -0.5F, -1.7597F, 0.194F, 1, 1, 1, -0.3F, false));

		cube_r79_r1 = new ModelRenderer(this);
		cube_r79_r1.setRotationPoint(4.2123F, 4.7941F, 19.1564F);
		slingLoop.addChild(cube_r79_r1);
		setRotationAngle(cube_r79_r1, -0.7421F, -0.0869F, 0.0076F);
		cube_r79_r1.cubeList.add(new ModelBox(cube_r79_r1, 24, 323, -0.5F, -1.1446F, -0.7695F, 1, 1, 1, -0.3F, false));

		cube_r78_r1 = new ModelRenderer(this);
		cube_r78_r1.setRotationPoint(4.2123F, 4.7941F, 19.1564F);
		slingLoop.addChild(cube_r78_r1);
		setRotationAngle(cube_r78_r1, -1.353F, -0.0869F, 0.0076F);
		cube_r78_r1.cubeList.add(new ModelBox(cube_r78_r1, 80, 321, -0.5F, -1.1446F, -0.2305F, 1, 1, 1, -0.3F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		stock.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}