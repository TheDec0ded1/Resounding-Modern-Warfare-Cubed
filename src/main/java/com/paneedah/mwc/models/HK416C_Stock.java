package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class HK416C_Stock extends ModelBase {
	private final ModelRenderer stockC;
	private final ModelRenderer stock_r1;
	private final ModelRenderer stock_r2;
	private final ModelRenderer stock_r3;
	private final ModelRenderer stock_r4;
	private final ModelRenderer extension_r2;
	private final ModelRenderer extension_r3;
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
	private final ModelRenderer extension_r26;
	private final ModelRenderer extension_r27;
	private final ModelRenderer extension_r54;
	private final ModelRenderer extension_r55;
	private final ModelRenderer extension_r56;
	private final ModelRenderer extension_r59;
	private final ModelRenderer extension_r60;
	private final ModelRenderer extension_r61;
	private final ModelRenderer extension_r62;
	private final ModelRenderer extension_r65;
	private final ModelRenderer extension_r66;

	public HK416C_Stock() {
		textureWidth = 432;
		textureHeight = 432;

		stockC = new ModelRenderer(this);
		stockC.setRotationPoint(0.0F, 31.25F, -2.0F);
		stockC.cubeList.add(new ModelBox(stockC, 374, 127, -2.0F, -47.1F, 5.999F, 1, 1, 9, 0.0F, false));
		stockC.cubeList.add(new ModelBox(stockC, 426, 16, -2.0F, -47.225F, 4.999F, 1, 1, 1, 0.05F, false));
		stockC.cubeList.add(new ModelBox(stockC, 418, 327, -2.0F, -47.225F, 13.999F, 1, 1, 2, 0.05F, false));
		stockC.cubeList.add(new ModelBox(stockC, 286, 225, -3.0F, -46.525F, 30.099F, 3, 8, 1, 0.0F, false));
		stockC.cubeList.add(new ModelBox(stockC, 58, 252, 0.0F, -44.825F, 30.099F, 1, 4, 1, 0.0F, false));
		stockC.cubeList.add(new ModelBox(stockC, 58, 257, -4.0F, -44.825F, 30.099F, 1, 4, 1, 0.0F, false));
		stockC.cubeList.add(new ModelBox(stockC, 12, 422, -2.5F, -38.525F, 30.099F, 2, 1, 1, 0.0F, false));
		stockC.cubeList.add(new ModelBox(stockC, 346, 247, -2.4625F, -47.4067F, 28.049F, 2, 1, 3, 0.0F, false));
		stockC.cubeList.add(new ModelBox(stockC, 402, 413, -1.6756F, -37.5068F, 28.049F, 1, 1, 3, 0.0F, false));
		stockC.cubeList.add(new ModelBox(stockC, 0, 414, -2.3244F, -37.5068F, 28.049F, 1, 1, 3, 0.0F, false));
		stockC.cubeList.add(new ModelBox(stockC, 394, 413, -2.5375F, -47.406F, 28.049F, 1, 1, 3, 0.0F, false));
		stockC.cubeList.add(new ModelBox(stockC, 404, 328, -2.0F, -47.225F, 7.049F, 1, 1, 6, 0.075F, false));
		stockC.cubeList.add(new ModelBox(stockC, 404, 335, -0.4975F, -45.7225F, 7.049F, 1, 1, 6, 0.075F, false));
		stockC.cubeList.add(new ModelBox(stockC, 404, 342, -3.5025F, -45.7225F, 7.049F, 1, 1, 6, 0.075F, false));
		stockC.cubeList.add(new ModelBox(stockC, 348, 137, -4.2378F, -43.4262F, 7.049F, 1, 2, 6, 0.075F, false));
		stockC.cubeList.add(new ModelBox(stockC, 156, 318, -3.1753F, -41.9861F, 7.049F, 3, 1, 6, 0.075F, false));
		stockC.cubeList.add(new ModelBox(stockC, 362, 415, -1.9753F, -41.4861F, 8.049F, 1, 2, 2, 0.075F, false));
		stockC.cubeList.add(new ModelBox(stockC, 404, 373, -0.8247F, -41.9861F, 7.049F, 1, 1, 6, 0.075F, false));
		stockC.cubeList.add(new ModelBox(stockC, 132, 378, 0.2378F, -43.4262F, 7.049F, 1, 2, 6, 0.075F, false));
		stockC.cubeList.add(new ModelBox(stockC, 136, 413, 0.2378F, -44.1262F, 28.049F, 1, 3, 3, 0.0F, false));
		stockC.cubeList.add(new ModelBox(stockC, 144, 413, -4.2378F, -44.1262F, 28.049F, 1, 3, 3, 0.0F, false));

		stock_r1 = new ModelRenderer(this);
		stock_r1.setRotationPoint(0.0105F, -39.4698F, 29.049F);
		stockC.addChild(stock_r1);
		setRotationAngle(stock_r1, 0.0F, 0.0F, 0.3927F);
		stock_r1.cubeList.add(new ModelBox(stock_r1, 366, 103, -0.5F, -2.0F, -1.0F, 1, 5, 3, 0.0F, false));

		stock_r2 = new ModelRenderer(this);
		stock_r2.setRotationPoint(-3.0105F, -39.4698F, 29.049F);
		stockC.addChild(stock_r2);
		setRotationAngle(stock_r2, 0.0F, 0.0F, -0.3927F);
		stock_r2.cubeList.add(new ModelBox(stock_r2, 286, 234, -0.5F, -2.0F, -1.0F, 1, 5, 3, 0.0F, false));

		stock_r3 = new ModelRenderer(this);
		stock_r3.setRotationPoint(0.496F, -44.9627F, 29.049F);
		stockC.addChild(stock_r3);
		setRotationAngle(stock_r3, 0.0F, 0.0F, -0.2618F);
		stock_r3.cubeList.add(new ModelBox(stock_r3, 160, 413, -0.5F, -2.0F, -1.0F, 1, 3, 3, 0.0F, false));

		stock_r4 = new ModelRenderer(this);
		stock_r4.setRotationPoint(-3.496F, -44.9627F, 29.049F);
		stockC.addChild(stock_r4);
		setRotationAngle(stock_r4, 0.0F, 0.0F, 0.2618F);
		stock_r4.cubeList.add(new ModelBox(stock_r4, 152, 413, -0.5F, -2.0F, -1.0F, 1, 3, 3, 0.0F, false));

		extension_r2 = new ModelRenderer(this);
		extension_r2.setRotationPoint(-3.5615F, -41.6624F, 23.549F);
		stockC.addChild(extension_r2);
		setRotationAngle(extension_r2, 0.0F, 0.0F, 0.3927F);
		extension_r2.cubeList.add(new ModelBox(extension_r2, 404, 380, -0.5F, -0.5F, -16.5F, 1, 1, 6, 0.075F, false));

		extension_r3 = new ModelRenderer(this);
		extension_r3.setRotationPoint(0.5615F, -41.6624F, 23.549F);
		stockC.addChild(extension_r3);
		setRotationAngle(extension_r3, 0.0F, 0.0F, -0.3927F);
		extension_r3.cubeList.add(new ModelBox(extension_r3, 180, 406, -0.5F, -0.5F, -16.5F, 1, 1, 6, 0.075F, false));

		extension_r6 = new ModelRenderer(this);
		extension_r6.setRotationPoint(-2.3862F, -46.5487F, 23.549F);
		stockC.addChild(extension_r6);
		setRotationAngle(extension_r6, 0.0F, 0.0F, -0.3927F);
		extension_r6.cubeList.add(new ModelBox(extension_r6, 254, 406, -0.5F, -0.5F, -16.5F, 1, 1, 6, 0.075F, false));

		extension_r7 = new ModelRenderer(this);
		extension_r7.setRotationPoint(-1.3993F, -43.6472F, 8.549F);
		stockC.addChild(extension_r7);
		setRotationAngle(extension_r7, 0.0F, 0.0F, -0.9599F);
		extension_r7.cubeList.add(new ModelBox(extension_r7, 404, 286, -1.7157F, -2.2278F, -1.5F, 2, 1, 6, 0.075F, false));

		extension_r8 = new ModelRenderer(this);
		extension_r8.setRotationPoint(-1.6007F, -43.6472F, 8.549F);
		stockC.addChild(extension_r8);
		setRotationAngle(extension_r8, 0.0F, 0.0F, 0.9599F);
		extension_r8.cubeList.add(new ModelBox(extension_r8, 404, 293, -0.2843F, -2.2278F, -1.5F, 2, 1, 6, 0.075F, false));

		extension_r9 = new ModelRenderer(this);
		extension_r9.setRotationPoint(-2.9029F, -45.338F, 23.549F);
		stockC.addChild(extension_r9);
		setRotationAngle(extension_r9, 0.0F, 0.0F, -1.1781F);
		extension_r9.cubeList.add(new ModelBox(extension_r9, 268, 406, 0.2413F, -0.7241F, -16.5F, 1, 1, 6, 0.075F, false));

		extension_r10 = new ModelRenderer(this);
		extension_r10.setRotationPoint(-0.0971F, -45.338F, 23.549F);
		stockC.addChild(extension_r10);
		setRotationAngle(extension_r10, 0.0F, 0.0F, 1.1781F);
		extension_r10.cubeList.add(new ModelBox(extension_r10, 282, 406, -1.2413F, -0.7241F, -16.5F, 1, 1, 6, 0.075F, false));

		extension_r11 = new ModelRenderer(this);
		extension_r11.setRotationPoint(-0.6138F, -46.5487F, 23.549F);
		stockC.addChild(extension_r11);
		setRotationAngle(extension_r11, 0.0F, 0.0F, 0.3927F);
		extension_r11.cubeList.add(new ModelBox(extension_r11, 296, 406, -0.5F, -0.5F, -16.5F, 1, 1, 6, 0.075F, false));

		extension_r12 = new ModelRenderer(this);
		extension_r12.setRotationPoint(-2.8606F, -45.2878F, 18.799F);
		stockC.addChild(extension_r12);
		setRotationAngle(extension_r12, 0.0F, 0.0F, -1.5708F);
		extension_r12.cubeList.add(new ModelBox(extension_r12, 426, 18, -0.5F, -0.5766F, -13.8F, 1, 1, 1, 0.05F, false));
		extension_r12.cubeList.add(new ModelBox(extension_r12, 418, 324, -0.5F, -0.5766F, -4.8F, 1, 1, 2, 0.05F, false));

		extension_r13 = new ModelRenderer(this);
		extension_r13.setRotationPoint(-2.8453F, -45.3648F, 18.799F);
		stockC.addChild(extension_r13);
		setRotationAngle(extension_r13, 0.0F, 0.0F, -1.1781F);
		extension_r13.cubeList.add(new ModelBox(extension_r13, 426, 20, 0.2413F, -0.7241F, -13.8F, 1, 1, 1, 0.05F, false));
		extension_r13.cubeList.add(new ModelBox(extension_r13, 418, 321, 0.2413F, -0.7241F, -4.8F, 1, 1, 2, 0.05F, false));

		extension_r14 = new ModelRenderer(this);
		extension_r14.setRotationPoint(-2.8453F, -45.2107F, 18.799F);
		stockC.addChild(extension_r14);
		setRotationAngle(extension_r14, 0.0F, 0.0F, -1.9635F);
		extension_r14.cubeList.add(new ModelBox(extension_r14, 426, 22, -1.2413F, -0.7241F, -13.8F, 1, 1, 1, 0.05F, false));
		extension_r14.cubeList.add(new ModelBox(extension_r14, 418, 318, -1.2413F, -0.7241F, -4.8F, 1, 1, 2, 0.05F, false));

		extension_r15 = new ModelRenderer(this);
		extension_r15.setRotationPoint(-1.5F, -43.9272F, 18.799F);
		stockC.addChild(extension_r15);
		setRotationAngle(extension_r15, 0.0F, 0.0F, 3.1416F);
		extension_r15.cubeList.add(new ModelBox(extension_r15, 426, 24, -0.5F, -0.5766F, -13.8F, 1, 1, 1, 0.05F, false));
		extension_r15.cubeList.add(new ModelBox(extension_r15, 418, 315, -0.5F, -0.5766F, -4.8F, 1, 1, 2, 0.05F, false));

		extension_r16 = new ModelRenderer(this);
		extension_r16.setRotationPoint(-1.5771F, -43.9425F, 18.799F);
		stockC.addChild(extension_r16);
		setRotationAngle(extension_r16, 0.0F, 0.0F, -2.7489F);
		extension_r16.cubeList.add(new ModelBox(extension_r16, 426, 26, 0.2413F, -0.7241F, -13.8F, 1, 1, 1, 0.05F, false));
		extension_r16.cubeList.add(new ModelBox(extension_r16, 418, 312, 0.2413F, -0.7241F, -4.8F, 1, 1, 2, 0.05F, false));

		extension_r17 = new ModelRenderer(this);
		extension_r17.setRotationPoint(-1.4229F, -43.9425F, 18.799F);
		stockC.addChild(extension_r17);
		setRotationAngle(extension_r17, 0.0F, 0.0F, 2.7489F);
		extension_r17.cubeList.add(new ModelBox(extension_r17, 426, 28, -1.2413F, -0.7241F, -13.8F, 1, 1, 1, 0.05F, false));
		extension_r17.cubeList.add(new ModelBox(extension_r17, 252, 418, -1.2413F, -0.7241F, -4.8F, 1, 1, 2, 0.05F, false));

		extension_r18 = new ModelRenderer(this);
		extension_r18.setRotationPoint(-0.1394F, -45.2878F, 18.799F);
		stockC.addChild(extension_r18);
		setRotationAngle(extension_r18, 0.0F, 0.0F, 1.5708F);
		extension_r18.cubeList.add(new ModelBox(extension_r18, 426, 30, -0.5F, -0.5766F, -13.8F, 1, 1, 1, 0.05F, false));
		extension_r18.cubeList.add(new ModelBox(extension_r18, 246, 418, -0.5F, -0.5766F, -4.8F, 1, 1, 2, 0.05F, false));

		extension_r19 = new ModelRenderer(this);
		extension_r19.setRotationPoint(-0.1547F, -45.2107F, 18.799F);
		stockC.addChild(extension_r19);
		setRotationAngle(extension_r19, 0.0F, 0.0F, 1.9635F);
		extension_r19.cubeList.add(new ModelBox(extension_r19, 426, 32, 0.2413F, -0.7241F, -13.8F, 1, 1, 1, 0.05F, false));
		extension_r19.cubeList.add(new ModelBox(extension_r19, 186, 418, 0.2413F, -0.7241F, -4.8F, 1, 1, 2, 0.05F, false));

		extension_r20 = new ModelRenderer(this);
		extension_r20.setRotationPoint(-0.1547F, -45.3648F, 18.799F);
		stockC.addChild(extension_r20);
		setRotationAngle(extension_r20, 0.0F, 0.0F, 1.1781F);
		extension_r20.cubeList.add(new ModelBox(extension_r20, 426, 34, -1.2413F, -0.7241F, -13.8F, 1, 1, 1, 0.05F, false));
		extension_r20.cubeList.add(new ModelBox(extension_r20, 180, 418, -1.2413F, -0.7241F, -4.8F, 1, 1, 2, 0.05F, false));

		extension_r21 = new ModelRenderer(this);
		extension_r21.setRotationPoint(-2.3477F, -46.5564F, 18.799F);
		stockC.addChild(extension_r21);
		setRotationAngle(extension_r21, 0.0F, 0.0F, -0.3927F);
		extension_r21.cubeList.add(new ModelBox(extension_r21, 426, 36, -0.5F, -0.5F, -13.8F, 1, 1, 1, 0.05F, false));
		extension_r21.cubeList.add(new ModelBox(extension_r21, 174, 418, -0.5F, -0.5F, -4.8F, 1, 1, 2, 0.05F, false));
		extension_r21.cubeList.add(new ModelBox(extension_r21, 318, 413, -0.8499F, -0.8582F, 9.25F, 1, 1, 3, 0.0F, false));

		extension_r22 = new ModelRenderer(this);
		extension_r22.setRotationPoint(-0.6523F, -46.5564F, 18.799F);
		stockC.addChild(extension_r22);
		setRotationAngle(extension_r22, 0.0F, 0.0F, 0.3927F);
		extension_r22.cubeList.add(new ModelBox(extension_r22, 426, 50, -0.5F, -0.5F, -13.8F, 1, 1, 1, 0.05F, false));
		extension_r22.cubeList.add(new ModelBox(extension_r22, 168, 418, -0.5F, -0.5F, -4.8F, 1, 1, 2, 0.05F, false));
		extension_r22.cubeList.add(new ModelBox(extension_r22, 326, 413, -0.1501F, -0.8582F, 9.25F, 1, 1, 3, 0.0F, false));

		extension_r23 = new ModelRenderer(this);
		extension_r23.setRotationPoint(-0.2701F, -45.2934F, 17.499F);
		stockC.addChild(extension_r23);
		setRotationAngle(extension_r23, 0.0F, 0.0F, 1.9635F);
		extension_r23.cubeList.add(new ModelBox(extension_r23, 384, 286, 0.2413F, -0.7241F, -11.5F, 1, 1, 9, 0.0F, false));

		extension_r24 = new ModelRenderer(this);
		extension_r24.setRotationPoint(-1.5F, -44.0635F, 17.499F);
		stockC.addChild(extension_r24);
		setRotationAngle(extension_r24, 0.0F, 0.0F, 3.1416F);
		extension_r24.cubeList.add(new ModelBox(extension_r24, 388, 209, -0.5F, -0.5766F, -11.5F, 1, 1, 9, 0.0F, false));

		extension_r25 = new ModelRenderer(this);
		extension_r25.setRotationPoint(-2.7299F, -45.2934F, 17.499F);
		stockC.addChild(extension_r25);
		setRotationAngle(extension_r25, 0.0F, 0.0F, -1.9635F);
		extension_r25.cubeList.add(new ModelBox(extension_r25, 380, 391, -1.2413F, -0.7241F, -11.5F, 1, 1, 9, 0.0F, false));

		extension_r26 = new ModelRenderer(this);
		extension_r26.setRotationPoint(-2.7299F, -45.2934F, 17.499F);
		stockC.addChild(extension_r26);
		setRotationAngle(extension_r26, 0.0F, 0.0F, -1.1781F);
		extension_r26.cubeList.add(new ModelBox(extension_r26, 394, 127, 0.2413F, -0.7241F, -11.5F, 1, 1, 9, 0.0F, false));

		extension_r27 = new ModelRenderer(this);
		extension_r27.setRotationPoint(-0.2701F, -45.2934F, 17.499F);
		stockC.addChild(extension_r27);
		setRotationAngle(extension_r27, 0.0F, 0.0F, 1.1781F);
		extension_r27.cubeList.add(new ModelBox(extension_r27, 396, 219, -1.2413F, -0.7241F, -11.5F, 1, 1, 9, 0.0F, false));

		extension_r54 = new ModelRenderer(this);
		extension_r54.setRotationPoint(0.5299F, -42.5434F, 11.499F);
		stockC.addChild(extension_r54);
		setRotationAngle(extension_r54, 0.0F, 0.0F, 1.5708F);
		extension_r54.cubeList.add(new ModelBox(extension_r54, 174, 273, -0.5F, -0.5766F, -7.5F, 1, 1, 26, 0.0F, false));

		extension_r55 = new ModelRenderer(this);
		extension_r55.setRotationPoint(-3.5299F, -42.5434F, 11.499F);
		stockC.addChild(extension_r55);
		setRotationAngle(extension_r55, 0.0F, 0.0F, -1.5708F);
		extension_r55.cubeList.add(new ModelBox(extension_r55, 228, 273, -0.5F, -0.5766F, -7.5F, 1, 1, 26, 0.0F, false));

		extension_r56 = new ModelRenderer(this);
		extension_r56.setRotationPoint(-0.2701F, -45.2934F, 18.499F);
		stockC.addChild(extension_r56);
		setRotationAngle(extension_r56, 0.0F, 0.0F, 1.5708F);
		extension_r56.cubeList.add(new ModelBox(extension_r56, 396, 229, -0.5F, -0.5766F, -12.5F, 1, 1, 9, 0.0F, false));

		extension_r59 = new ModelRenderer(this);
		extension_r59.setRotationPoint(-1.5F, -44.0635F, 18.499F);
		stockC.addChild(extension_r59);
		setRotationAngle(extension_r59, 0.0F, 0.0F, 2.7489F);
		extension_r59.cubeList.add(new ModelBox(extension_r59, 92, 398, -1.2413F, -0.7241F, -12.5F, 1, 1, 9, 0.0F, false));

		extension_r60 = new ModelRenderer(this);
		extension_r60.setRotationPoint(-1.5F, -44.0635F, 18.499F);
		stockC.addChild(extension_r60);
		setRotationAngle(extension_r60, 0.0F, 0.0F, -2.7489F);
		extension_r60.cubeList.add(new ModelBox(extension_r60, 112, 398, 0.2413F, -0.7241F, -12.5F, 1, 1, 9, 0.0F, false));

		extension_r61 = new ModelRenderer(this);
		extension_r61.setRotationPoint(-2.0F, -44.8135F, 7.499F);
		stockC.addChild(extension_r61);
		setRotationAngle(extension_r61, 0.0F, 0.0F, 3.1416F);
		extension_r61.cubeList.add(new ModelBox(extension_r61, 120, 418, -1.5F, -0.5766F, 7.7F, 2, 2, 1, 0.0F, false));

		extension_r62 = new ModelRenderer(this);
		extension_r62.setRotationPoint(-2.7299F, -45.2934F, 18.499F);
		stockC.addChild(extension_r62);
		setRotationAngle(extension_r62, 0.0F, 0.0F, -1.5708F);
		extension_r62.cubeList.add(new ModelBox(extension_r62, 194, 398, -0.5F, -0.5766F, -12.5F, 1, 1, 9, 0.0F, false));

		extension_r65 = new ModelRenderer(this);
		extension_r65.setRotationPoint(-2.2706F, -46.4467F, 18.499F);
		stockC.addChild(extension_r65);
		setRotationAngle(extension_r65, 0.0F, 0.0F, -0.3927F);
		extension_r65.cubeList.add(new ModelBox(extension_r65, 214, 398, -0.5F, -0.5F, -12.5F, 1, 1, 9, 0.0F, false));

		extension_r66 = new ModelRenderer(this);
		extension_r66.setRotationPoint(-0.7294F, -46.4467F, 18.499F);
		stockC.addChild(extension_r66);
		setRotationAngle(extension_r66, 0.0F, 0.0F, 0.3927F);
		extension_r66.cubeList.add(new ModelBox(extension_r66, 234, 398, -0.5F, -0.5F, -12.5F, 1, 1, 9, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		stockC.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}