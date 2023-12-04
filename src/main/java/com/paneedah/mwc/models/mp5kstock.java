package com.paneedah.mwc.models;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class mp5kstock extends ModelBase {
	private final ModelRenderer mp5_stock_adapter2;
	private final ModelRenderer bone45_r1;
	private final ModelRenderer bone47_r1;
	private final ModelRenderer stock_mp5a5_connection2;
	private final ModelRenderer gun167_r2;
	private final ModelRenderer gun166_r2;
	private final ModelRenderer gun166_r3;
	private final ModelRenderer gun153_r2;
	private final ModelRenderer gun152_r2;
	private final ModelRenderer gun154_r2;
	private final ModelRenderer gun153_r3;
	private final ModelRenderer gun155_r2;
	private final ModelRenderer gun154_r7;
	private final ModelRenderer gun154_r8;
	private final ModelRenderer gun153_r4;
	private final ModelRenderer gun154_r9;
	private final ModelRenderer gun153_r5;
	private final ModelRenderer gun152_r3;
	private final ModelRenderer gun152_r4;
	private final ModelRenderer gun151_r2;
	private final ModelRenderer gun152_r5;
	private final ModelRenderer gun151_r3;
	private final ModelRenderer gun152_r6;
	private final ModelRenderer gun153_r6;
	private final ModelRenderer gun152_r7;
	private final ModelRenderer gun151_r4;
	private final ModelRenderer gun152_r8;
	private final ModelRenderer gun151_r5;
	private final ModelRenderer gun153_r7;
	private final ModelRenderer gun152_r9;
	private final ModelRenderer gun151_r6;
	private final ModelRenderer gun161_r16_r1;
	private final ModelRenderer gun151_r15_r1;
	private final ModelRenderer gun150_r2;
	private final ModelRenderer gun150_r8_r1;
	private final ModelRenderer gun150_r7_r1;
	private final ModelRenderer gun148_r2;
	private final ModelRenderer gun147_r3;
	private final ModelRenderer gun58_r2;
	private final ModelRenderer gun60_r5;
	private final ModelRenderer gun57_r2;
	private final ModelRenderer gun59_r9;
	private final ModelRenderer gun58_r3;
	private final ModelRenderer gun59_r10;
	private final ModelRenderer gun77_r20;
	private final ModelRenderer gun76_r30;
	private final ModelRenderer bone44;
	private final ModelRenderer gun149_r4;
	private final ModelRenderer gun149_r5;
	private final ModelRenderer bone46;
	private final ModelRenderer mp5_a5_stock;
	private final ModelRenderer gun167_r13;
	private final ModelRenderer gun166_r13;
	private final ModelRenderer gun166_r14_r1;
	private final ModelRenderer bone64;
	private final ModelRenderer bone65;
	private final ModelRenderer bone71;
	private final ModelRenderer gun154_r11;
	private final ModelRenderer gun155_r3;
	private final ModelRenderer gun154_r12;
	private final ModelRenderer gun153_r21;
	private final ModelRenderer gun155_r4;
	private final ModelRenderer bone72;
	private final ModelRenderer gun155_r5;
	private final ModelRenderer gun156_r1;
	private final ModelRenderer gun155_r6;
	private final ModelRenderer gun154_r13;
	private final ModelRenderer gun156_r2;
	private final ModelRenderer bone67;
	private final ModelRenderer bone69_r1;
	private final ModelRenderer gun167_r14;
	private final ModelRenderer gun167_r16_r1;
	private final ModelRenderer gun168_r6;
	private final ModelRenderer gun188_r8_r1;
	private final ModelRenderer bone70;
	private final ModelRenderer gun168_r7;
	private final ModelRenderer gun169_r2;
	private final ModelRenderer bone69;
	private final ModelRenderer gun168_r8;
	private final ModelRenderer gun169_r3;
	private final ModelRenderer bone68;
	private final ModelRenderer gun168_r9;
	private final ModelRenderer gun169_r4;
	private final ModelRenderer bone66;
	private final ModelRenderer bone66_r1;
	private final ModelRenderer gun169_r5;
	private final ModelRenderer gun169_r5_r1;
	private final ModelRenderer gun168_r10;
	private final ModelRenderer gun168_r10_r1;

	public mp5kstock() {
		textureWidth = 280;
		textureHeight = 300;

		mp5_stock_adapter2 = new ModelRenderer(this);
		mp5_stock_adapter2.setRotationPoint(-1.4496F, -9.6871F, 25.296F);
		mp5_stock_adapter2.cubeList.add(new ModelBox(mp5_stock_adapter2, 68, 67, -1.1504F, -6.0879F, -21.121F, 2, 4, 2, 0.001F, false));
		mp5_stock_adapter2.cubeList.add(new ModelBox(mp5_stock_adapter2, 68, 67, -1.1504F, -2.0879F, -21.121F, 2, 4, 2, 0.001F, false));

		bone45_r1 = new ModelRenderer(this);
		bone45_r1.setRotationPoint(1.4496F, 33.6871F, -25.296F);
		mp5_stock_adapter2.addChild(bone45_r1);
		setRotationAngle(bone45_r1, -1.5708F, 0.0F, 0.0F);
		bone45_r1.cubeList.add(new ModelBox(bone45_r1, 82, 140, -0.8F, -6.225F, -39.775F, 1, 2, 8, 0.0F, false));

		bone47_r1 = new ModelRenderer(this);
		bone47_r1.setRotationPoint(-1.2504F, -1.5629F, -10.796F);
		mp5_stock_adapter2.addChild(bone47_r1);
		setRotationAngle(bone47_r1, -1.5708F, 0.0F, 0.0F);
		bone47_r1.cubeList.add(new ModelBox(bone47_r1, 60, 137, -0.8F, 8.2F, -5.1F, 1, 1, 9, 0.0F, false));
		bone47_r1.cubeList.add(new ModelBox(bone47_r1, 61, 138, -0.5F, 8.3F, -4.5F, 1, 2, 8, 0.0F, false));

		stock_mp5a5_connection2 = new ModelRenderer(this);
		stock_mp5a5_connection2.setRotationPoint(1.3599F, -2.9372F, -21.2683F);
		mp5_stock_adapter2.addChild(stock_mp5a5_connection2);
		stock_mp5a5_connection2.cubeList.add(new ModelBox(stock_mp5a5_connection2, 35, 133, -1.9103F, -3.1757F, -0.0277F, 1, 1, 1, 0.0F, false));
		stock_mp5a5_connection2.cubeList.add(new ModelBox(stock_mp5a5_connection2, 139, 131, -1.0993F, -2.4325F, -0.0277F, 1, 1, 0, 0.0F, false));
		stock_mp5a5_connection2.cubeList.add(new ModelBox(stock_mp5a5_connection2, 137, 121, -2.7213F, -2.4325F, -0.0277F, 1, 1, 0, 0.0F, false));
		stock_mp5a5_connection2.cubeList.add(new ModelBox(stock_mp5a5_connection2, 155, 160, -1.7103F, 3.1243F, -2.0277F, 2, 2, 3, 0.0F, false));
		stock_mp5a5_connection2.cubeList.add(new ModelBox(stock_mp5a5_connection2, 93, 160, -3.1103F, 3.1243F, -2.0277F, 2, 2, 3, 0.001F, false));
		stock_mp5a5_connection2.cubeList.add(new ModelBox(stock_mp5a5_connection2, 121, 14, -0.1603F, 3.6243F, -1.1277F, 1, 1, 1, 0.0F, false));
		stock_mp5a5_connection2.cubeList.add(new ModelBox(stock_mp5a5_connection2, 121, 5, -3.6603F, 3.6243F, -1.0277F, 1, 1, 1, 0.0F, false));
		stock_mp5a5_connection2.cubeList.add(new ModelBox(stock_mp5a5_connection2, 121, 14, -0.1603F, -2.3757F, -1.0277F, 1, 1, 1, 0.0F, false));
		stock_mp5a5_connection2.cubeList.add(new ModelBox(stock_mp5a5_connection2, 121, 5, -3.6603F, -2.3757F, -1.0277F, 1, 1, 1, 0.0F, false));
		stock_mp5a5_connection2.cubeList.add(new ModelBox(stock_mp5a5_connection2, 94, 63, -2.9103F, -0.5502F, -0.0145F, 3, 4, 1, 0.0F, false));
		stock_mp5a5_connection2.cubeList.add(new ModelBox(stock_mp5a5_connection2, 94, 63, -2.4103F, -2.3502F, -0.0145F, 2, 2, 1, 0.0F, false));

		gun167_r2 = new ModelRenderer(this);
		gun167_r2.setRotationPoint(-1.9103F, -2.5348F, 0.6735F);
		stock_mp5a5_connection2.addChild(gun167_r2);
		setRotationAngle(gun167_r2, 0.3491F, 0.0F, 0.0F);
		

		gun166_r2 = new ModelRenderer(this);
		gun166_r2.setRotationPoint(-1.4103F, -1.7887F, 1.0027F);
		stock_mp5a5_connection2.addChild(gun166_r2);
		setRotationAngle(gun166_r2, 0.3491F, 0.0F, 0.0F);
		

		gun166_r3 = new ModelRenderer(this);
		gun166_r3.setRotationPoint(-2.1103F, 3.7513F, 0.6335F);
		stock_mp5a5_connection2.addChild(gun166_r3);
		setRotationAngle(gun166_r3, -2.1143F, 0.0F, 0.0F);
		

		gun153_r2 = new ModelRenderer(this);
		gun153_r2.setRotationPoint(-3.6805F, 0.9601F, -0.0277F);
		stock_mp5a5_connection2.addChild(gun153_r2);
		setRotationAngle(gun153_r2, 0.0F, 0.0F, -0.3927F);
		

		gun152_r2 = new ModelRenderer(this);
		gun152_r2.setRotationPoint(0.8599F, 0.9601F, -0.0277F);
		stock_mp5a5_connection2.addChild(gun152_r2);
		setRotationAngle(gun152_r2, 0.0F, 0.0F, 0.3927F);
		

		gun154_r2 = new ModelRenderer(this);
		gun154_r2.setRotationPoint(-3.3332F, 2.7581F, -0.0277F);
		stock_mp5a5_connection2.addChild(gun154_r2);
		setRotationAngle(gun154_r2, 0.0F, 0.0F, 0.3927F);
		

		gun153_r3 = new ModelRenderer(this);
		gun153_r3.setRotationPoint(0.5126F, 2.7581F, -0.0277F);
		stock_mp5a5_connection2.addChild(gun153_r3);
		setRotationAngle(gun153_r3, 0.0F, 0.0F, -0.3927F);
		

		gun155_r2 = new ModelRenderer(this);
		gun155_r2.setRotationPoint(-3.9324F, 2.8981F, -1.4277F);
		stock_mp5a5_connection2.addChild(gun155_r2);
		setRotationAngle(gun155_r2, 0.0F, 0.0F, -0.3927F);
		

		gun154_r7 = new ModelRenderer(this);
		gun154_r7.setRotationPoint(1.1117F, 2.8981F, -1.4277F);
		stock_mp5a5_connection2.addChild(gun154_r7);
		setRotationAngle(gun154_r7, 0.0F, 0.0F, 0.3927F);
		

		gun154_r8 = new ModelRenderer(this);
		gun154_r8.setRotationPoint(-3.9324F, 2.8981F, 0.3723F);
		stock_mp5a5_connection2.addChild(gun154_r8);
		setRotationAngle(gun154_r8, 0.0F, 0.0F, -0.3927F);
		

		gun153_r4 = new ModelRenderer(this);
		gun153_r4.setRotationPoint(1.1117F, 2.8981F, 0.3723F);
		stock_mp5a5_connection2.addChild(gun153_r4);
		setRotationAngle(gun153_r4, 0.0F, 0.0F, 0.3927F);
		

		gun154_r9 = new ModelRenderer(this);
		gun154_r9.setRotationPoint(-4.2797F, 0.8202F, -0.4277F);
		stock_mp5a5_connection2.addChild(gun154_r9);
		setRotationAngle(gun154_r9, 0.0F, 0.0F, 0.3927F);
		

		gun153_r5 = new ModelRenderer(this);
		gun153_r5.setRotationPoint(1.459F, 0.8202F, -0.4277F);
		stock_mp5a5_connection2.addChild(gun153_r5);
		setRotationAngle(gun153_r5, 0.0F, 0.0F, -0.3927F);
		

		gun152_r3 = new ModelRenderer(this);
		gun152_r3.setRotationPoint(1.459F, 0.8202F, 0.3723F);
		stock_mp5a5_connection2.addChild(gun152_r3);
		setRotationAngle(gun152_r3, 0.0F, 0.0F, -0.3927F);
		

		gun152_r4 = new ModelRenderer(this);
		gun152_r4.setRotationPoint(-3.7443F, 1.7723F, -0.0277F);
		stock_mp5a5_connection2.addChild(gun152_r4);
		setRotationAngle(gun152_r4, 0.0F, 0.0F, -0.1745F);
		

		gun151_r2 = new ModelRenderer(this);
		gun151_r2.setRotationPoint(0.9236F, 1.7723F, -0.0277F);
		stock_mp5a5_connection2.addChild(gun151_r2);
		setRotationAngle(gun151_r2, 0.0F, 0.0F, 0.1745F);
		

		gun152_r5 = new ModelRenderer(this);
		gun152_r5.setRotationPoint(-2.834F, -0.3144F, -0.0585F);
		stock_mp5a5_connection2.addChild(gun152_r5);
		setRotationAngle(gun152_r5, 0.0F, -0.7418F, 0.3927F);
		

		gun151_r3 = new ModelRenderer(this);
		gun151_r3.setRotationPoint(0.0134F, -0.3144F, -0.0585F);
		stock_mp5a5_connection2.addChild(gun151_r3);
		setRotationAngle(gun151_r3, 0.0F, 0.7418F, -0.3927F);
		

		gun152_r6 = new ModelRenderer(this);
		gun152_r6.setRotationPoint(-3.044F, -0.3469F, 1.1865F);
		stock_mp5a5_connection2.addChild(gun152_r6);
		setRotationAngle(gun152_r6, 0.3491F, 0.0F, 0.3927F);
		

		gun153_r6 = new ModelRenderer(this);
		gun153_r6.setRotationPoint(-2.4147F, -1.2506F, 1.0678F);
		stock_mp5a5_connection2.addChild(gun153_r6);
		setRotationAngle(gun153_r6, 0.3491F, -0.4363F, 0.1745F);
		

		gun152_r7 = new ModelRenderer(this);
		gun152_r7.setRotationPoint(-0.4059F, -1.2506F, 1.0678F);
		stock_mp5a5_connection2.addChild(gun152_r7);
		setRotationAngle(gun152_r7, 0.3491F, 0.4363F, -0.1745F);
		

		gun151_r4 = new ModelRenderer(this);
		gun151_r4.setRotationPoint(0.2234F, -0.3469F, 1.1865F);
		stock_mp5a5_connection2.addChild(gun151_r4);
		setRotationAngle(gun151_r4, 0.3491F, 0.0F, -0.3927F);
		

		gun152_r8 = new ModelRenderer(this);
		gun152_r8.setRotationPoint(-3.5031F, 0.7614F, 1.4723F);
		stock_mp5a5_connection2.addChild(gun152_r8);
		setRotationAngle(gun152_r8, 0.0F, 0.0F, 0.3927F);
		

		gun151_r5 = new ModelRenderer(this);
		gun151_r5.setRotationPoint(0.6825F, 0.7614F, 1.4723F);
		stock_mp5a5_connection2.addChild(gun151_r5);
		setRotationAngle(gun151_r5, 0.0F, 0.0F, -0.3927F);
		

		gun153_r7 = new ModelRenderer(this);
		gun153_r7.setRotationPoint(-0.0699F, -1.7793F, -1.5277F);
		stock_mp5a5_connection2.addChild(gun153_r7);
		setRotationAngle(gun153_r7, 0.0F, 0.0F, -0.3927F);
		

		gun152_r9 = new ModelRenderer(this);
		gun152_r9.setRotationPoint(-2.7507F, -1.7793F, -1.5277F);
		stock_mp5a5_connection2.addChild(gun152_r9);
		setRotationAngle(gun152_r9, 0.0F, 0.0F, 0.3927F);
		

		gun151_r6 = new ModelRenderer(this);
		gun151_r6.setRotationPoint(-2.4507F, -1.7793F, 0.4723F);
		stock_mp5a5_connection2.addChild(gun151_r6);
		setRotationAngle(gun151_r6, 0.0F, 0.0F, 0.3927F);
		

		gun161_r16_r1 = new ModelRenderer(this);
		gun161_r16_r1.setRotationPoint(4.1231F, 3.7209F, -4.001F);
		gun151_r6.addChild(gun161_r16_r1);
		setRotationAngle(gun161_r16_r1, 0.0F, 0.0F, -0.1309F);
		gun161_r16_r1.cubeList.add(new ModelBox(gun161_r16_r1, 0, 137, -0.5F, -2.0F, 3.5F, 1, 3, 1, 0.001F, false));

		gun151_r15_r1 = new ModelRenderer(this);
		gun151_r15_r1.setRotationPoint(0.2578F, 1.4185F, -0.001F);
		gun151_r6.addChild(gun151_r15_r1);
		setRotationAngle(gun151_r15_r1, 0.0F, 0.0F, -0.1309F);
		gun151_r15_r1.cubeList.add(new ModelBox(gun151_r15_r1, 0, 137, -0.5F, -2.0F, -0.5F, 1, 4, 1, 0.001F, false));

		gun150_r2 = new ModelRenderer(this);
		gun150_r2.setRotationPoint(-0.3699F, -1.7793F, 0.4723F);
		stock_mp5a5_connection2.addChild(gun150_r2);
		setRotationAngle(gun150_r2, 0.0F, 0.0F, -0.3927F);
		

		gun150_r8_r1 = new ModelRenderer(this);
		gun150_r8_r1.setRotationPoint(-4.1232F, 3.7209F, -4.001F);
		gun150_r2.addChild(gun150_r8_r1);
		setRotationAngle(gun150_r8_r1, 0.0F, 0.0F, 0.1309F);
		gun150_r8_r1.cubeList.add(new ModelBox(gun150_r8_r1, 71, 137, -0.5F, -2.0F, 3.5F, 1, 3, 1, 0.001F, false));

		gun150_r7_r1 = new ModelRenderer(this);
		gun150_r7_r1.setRotationPoint(-0.2579F, 1.4185F, -0.001F);
		gun150_r2.addChild(gun150_r7_r1);
		setRotationAngle(gun150_r7_r1, 0.0F, 0.0F, 0.1309F);
		gun150_r7_r1.cubeList.add(new ModelBox(gun150_r7_r1, 71, 137, -0.5F, -2.0F, -0.5F, 1, 4, 1, 0.001F, false));

		gun148_r2 = new ModelRenderer(this);
		gun148_r2.setRotationPoint(-1.9412F, -2.4693F, -0.5277F);
		stock_mp5a5_connection2.addChild(gun148_r2);
		setRotationAngle(gun148_r2, 0.0F, 0.0F, -0.7418F);
		gun148_r2.cubeList.add(new ModelBox(gun148_r2, 10, 124, -0.6F, -0.5F, 0.5F, 1, 1, 1, 0.0F, false));
		gun148_r2.cubeList.add(new ModelBox(gun148_r2, 83, 129, -0.5F, -0.5F, 0.5F, 1, 1, 1, 0.001F, false));

		gun147_r3 = new ModelRenderer(this);
		gun147_r3.setRotationPoint(-0.8795F, -2.4693F, -0.5277F);
		stock_mp5a5_connection2.addChild(gun147_r3);
		setRotationAngle(gun147_r3, 0.0F, 0.0F, 0.7418F);
		gun147_r3.cubeList.add(new ModelBox(gun147_r3, 50, 128, -0.4F, -0.5F, 0.5F, 1, 1, 1, 0.0F, false));
		gun147_r3.cubeList.add(new ModelBox(gun147_r3, 104, 131, -0.5F, -0.5F, 0.5F, 1, 1, 1, 0.001F, false));

		gun58_r2 = new ModelRenderer(this);
		gun58_r2.setRotationPoint(-3.1138F, 0.0022F, -13.0277F);
		stock_mp5a5_connection2.addChild(gun58_r2);
		setRotationAngle(gun58_r2, 0.0F, 0.0F, -2.5297F);
		

		gun60_r5 = new ModelRenderer(this);
		gun60_r5.setRotationPoint(-3.431F, 0.7211F, -1.0277F);
		stock_mp5a5_connection2.addChild(gun60_r5);
		setRotationAngle(gun60_r5, 0.0F, 0.0F, -2.9224F);
		

		gun57_r2 = new ModelRenderer(this);
		gun57_r2.setRotationPoint(0.2932F, 0.0022F, -13.0277F);
		stock_mp5a5_connection2.addChild(gun57_r2);
		setRotationAngle(gun57_r2, 0.0F, 0.0F, 2.5297F);
		

		gun59_r9 = new ModelRenderer(this);
		gun59_r9.setRotationPoint(0.6104F, 0.7211F, -1.0277F);
		stock_mp5a5_connection2.addChild(gun59_r9);
		setRotationAngle(gun59_r9, 0.0F, 0.0F, 2.9224F);
		

		gun58_r3 = new ModelRenderer(this);
		gun58_r3.setRotationPoint(-0.2749F, -0.5405F, -13.0277F);
		stock_mp5a5_connection2.addChild(gun58_r3);
		setRotationAngle(gun58_r3, 0.0F, 0.0F, 2.137F);
		

		gun59_r10 = new ModelRenderer(this);
		gun59_r10.setRotationPoint(-2.5457F, -0.5405F, -13.0277F);
		stock_mp5a5_connection2.addChild(gun59_r10);
		setRotationAngle(gun59_r10, 0.0F, 0.0F, -2.137F);
		

		gun77_r20 = new ModelRenderer(this);
		gun77_r20.setRotationPoint(-2.0235F, -1.318F, -1.0277F);
		stock_mp5a5_connection2.addChild(gun77_r20);
		setRotationAngle(gun77_r20, 0.0F, 0.0F, -2.1935F);
		

		gun76_r30 = new ModelRenderer(this);
		gun76_r30.setRotationPoint(-0.7971F, -1.318F, -14.0277F);
		stock_mp5a5_connection2.addChild(gun76_r30);
		setRotationAngle(gun76_r30, 0.0F, 0.0F, 2.1935F);
		

		bone44 = new ModelRenderer(this);
		bone44.setRotationPoint(1.2704F, 0.7603F, -0.2777F);
		stock_mp5a5_connection2.addChild(bone44);
		

		gun149_r4 = new ModelRenderer(this);
		gun149_r4.setRotationPoint(-0.0351F, -0.0848F, 0.0F);
		bone44.addChild(gun149_r4);
		setRotationAngle(gun149_r4, 0.0F, 0.0F, -0.7854F);
		

		gun149_r5 = new ModelRenderer(this);
		gun149_r5.setRotationPoint(-0.2341F, -1.9324F, 0.0F);
		bone44.addChild(gun149_r5);
		setRotationAngle(gun149_r5, 0.0F, 0.0F, -0.3927F);
		

		bone46 = new ModelRenderer(this);
		bone46.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone44.addChild(bone46);
		

		mp5_a5_stock = new ModelRenderer(this);
		mp5_a5_stock.setRotationPoint(1.3599F, -2.9372F, -18.2683F);
		mp5_stock_adapter2.addChild(mp5_a5_stock);
		mp5_a5_stock.cubeList.add(new ModelBox(mp5_a5_stock, 107, 0, -1.7103F, 0.4498F, 4.9855F, 2, 2, 20, 0.0F, false));
		mp5_a5_stock.cubeList.add(new ModelBox(mp5_a5_stock, 100, 106, -3.1103F, 0.4498F, 4.9855F, 2, 2, 20, 0.0F, false));
		mp5_a5_stock.cubeList.add(new ModelBox(mp5_a5_stock, 121, 13, -1.7103F, 0.4498F, -1.0145F, 2, 2, 6, 0.0F, false));
		mp5_a5_stock.cubeList.add(new ModelBox(mp5_a5_stock, 114, 120, -3.1103F, 0.4498F, -1.0145F, 2, 2, 6, 0.0F, false));
		mp5_a5_stock.cubeList.add(new ModelBox(mp5_a5_stock, 111, 3, -1.7103F, 2.4498F, -1.0145F, 2, 1, 16, 0.0F, false));
		mp5_a5_stock.cubeList.add(new ModelBox(mp5_a5_stock, 104, 110, -3.1103F, 2.4498F, -1.0145F, 2, 1, 16, 0.0F, false));
		mp5_a5_stock.cubeList.add(new ModelBox(mp5_a5_stock, 109, 230, -1.7103F, 1.0498F, 14.9855F, 2, 4, 3, 0.0F, false));
		mp5_a5_stock.cubeList.add(new ModelBox(mp5_a5_stock, 7, 231, -3.1103F, 1.0498F, 14.9855F, 2, 4, 3, 0.0F, false));
		mp5_a5_stock.cubeList.add(new ModelBox(mp5_a5_stock, 6, 230, -3.1103F, 8.6498F, 22.5855F, 2, 2, 4, 0.0F, false));
		mp5_a5_stock.cubeList.add(new ModelBox(mp5_a5_stock, 108, 229, -1.7103F, 8.6498F, 22.5855F, 2, 2, 4, 0.0F, false));
		mp5_a5_stock.cubeList.add(new ModelBox(mp5_a5_stock, 129, 129, -1.7103F, 0.4498F, 24.9855F, 2, 12, 2, 0.001F, false));
		mp5_a5_stock.cubeList.add(new ModelBox(mp5_a5_stock, 113, 129, -3.1103F, 0.4498F, 24.9855F, 2, 12, 2, 0.002F, false));

		gun167_r13 = new ModelRenderer(this);
		gun167_r13.setRotationPoint(-1.2103F, 0.0557F, 2.9747F);
		mp5_a5_stock.addChild(gun167_r13);
		setRotationAngle(gun167_r13, -0.5236F, 0.0F, 0.0F);
		

		gun166_r13 = new ModelRenderer(this);
		gun166_r13.setRotationPoint(-1.7103F, 7.2781F, 15.1619F);
		mp5_a5_stock.addChild(gun166_r13);
		setRotationAngle(gun166_r13, -0.3491F, 0.0F, 0.0F);
		

		gun166_r14_r1 = new ModelRenderer(this);
		gun166_r14_r1.setRotationPoint(0.3F, -2.0984F, 0.1527F);
		gun166_r13.addChild(gun166_r14_r1);
		setRotationAngle(gun166_r14_r1, -0.2618F, 0.0F, 0.0F);
		gun166_r14_r1.cubeList.add(new ModelBox(gun166_r14_r1, 101, 74, -1.7F, -1.4187F, -5.4614F, 2, 2, 4, -0.001F, false));
		gun166_r14_r1.cubeList.add(new ModelBox(gun166_r14_r1, 46, 100, -0.3F, -1.4187F, -5.4614F, 2, 2, 4, -0.001F, false));
		gun166_r14_r1.cubeList.add(new ModelBox(gun166_r14_r1, 92, 65, -1.7F, -1.4187F, -1.4614F, 2, 2, 13, -0.001F, false));
		gun166_r14_r1.cubeList.add(new ModelBox(gun166_r14_r1, 37, 91, -0.3F, -1.4187F, -1.4614F, 2, 2, 13, -0.001F, false));

		bone64 = new ModelRenderer(this);
		bone64.setRotationPoint(1.2704F, 0.7603F, -0.2777F);
		mp5_a5_stock.addChild(bone64);
		

		bone65 = new ModelRenderer(this);
		bone65.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone64.addChild(bone65);
		

		bone71 = new ModelRenderer(this);
		bone71.setRotationPoint(0.4933F, 0.7515F, -0.7777F);
		mp5_a5_stock.addChild(bone71);
		

		gun154_r11 = new ModelRenderer(this);
		gun154_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone71.addChild(gun154_r11);
		setRotationAngle(gun154_r11, 0.0F, 0.0F, -0.6109F);
		

		gun155_r3 = new ModelRenderer(this);
		gun155_r3.setRotationPoint(-0.6928F, -0.2075F, 3.1054F);
		bone71.addChild(gun155_r3);
		setRotationAngle(gun155_r3, 0.0F, -0.5236F, -0.5672F);
		

		gun154_r12 = new ModelRenderer(this);
		gun154_r12.setRotationPoint(-0.6928F, 1.4531F, 3.1054F);
		bone71.addChild(gun154_r12);
		setRotationAngle(gun154_r12, 0.0F, -0.5236F, 0.5672F);
		

		gun153_r21 = new ModelRenderer(this);
		gun153_r21.setRotationPoint(-0.4398F, 0.6228F, 3.5996F);
		bone71.addChild(gun153_r21);
		setRotationAngle(gun153_r21, 0.0F, -0.48F, 0.0F);
		

		gun155_r4 = new ModelRenderer(this);
		gun155_r4.setRotationPoint(0.0F, 1.2456F, 0.0F);
		bone71.addChild(gun155_r4);
		setRotationAngle(gun155_r4, 0.0F, 0.0F, 0.6109F);
		

		bone72 = new ModelRenderer(this);
		bone72.setRotationPoint(-3.3139F, 0.7515F, -0.7777F);
		mp5_a5_stock.addChild(bone72);
		

		gun155_r5 = new ModelRenderer(this);
		gun155_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone72.addChild(gun155_r5);
		setRotationAngle(gun155_r5, 0.0F, 0.0F, 0.6109F);
		

		gun156_r1 = new ModelRenderer(this);
		gun156_r1.setRotationPoint(0.6928F, -0.2075F, 3.1054F);
		bone72.addChild(gun156_r1);
		setRotationAngle(gun156_r1, 0.0F, 0.5236F, 0.5672F);
		

		gun155_r6 = new ModelRenderer(this);
		gun155_r6.setRotationPoint(0.6928F, 1.4531F, 3.1054F);
		bone72.addChild(gun155_r6);
		setRotationAngle(gun155_r6, 0.0F, 0.5236F, -0.5672F);
		

		gun154_r13 = new ModelRenderer(this);
		gun154_r13.setRotationPoint(0.4398F, 0.6228F, 3.5996F);
		bone72.addChild(gun154_r13);
		setRotationAngle(gun154_r13, 0.0F, 0.48F, 0.0F);
		

		gun156_r2 = new ModelRenderer(this);
		gun156_r2.setRotationPoint(0.0F, 1.2456F, 0.0F);
		bone72.addChild(gun156_r2);
		setRotationAngle(gun156_r2, 0.0F, 0.0F, -0.6109F);
		

		bone67 = new ModelRenderer(this);
		bone67.setRotationPoint(-0.771F, 0.0963F, 14.4855F);
		mp5_a5_stock.addChild(bone67);
		bone67.cubeList.add(new ModelBox(bone67, 106, 24, -1.6393F, -0.3464F, -8.5F, 2, 1, 21, 0.0F, false));
		bone67.cubeList.add(new ModelBox(bone67, 120, 38, -1.6393F, -0.3464F, -15.5F, 2, 1, 7, 0.0F, false));

		bone69_r1 = new ModelRenderer(this);
		bone69_r1.setRotationPoint(-0.645F, 3.4535F, -12.001F);
		bone67.addChild(bone69_r1);
		setRotationAngle(bone69_r1, 0.0F, 0.0F, -3.1416F);
		bone69_r1.cubeList.add(new ModelBox(bone69_r1, 113, 31, -0.9929F, -0.6F, -3.5F, 2, 1, 14, 0.0F, false));

		gun167_r14 = new ModelRenderer(this);
		gun167_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone67.addChild(gun167_r14);
		setRotationAngle(gun167_r14, 0.0F, 0.0F, 0.7854F);
		gun167_r14.cubeList.add(new ModelBox(gun167_r14, 25, 109, 0.0F, -0.5F, -8.5F, 1, 1, 21, -0.001F, false));
		gun167_r14.cubeList.add(new ModelBox(gun167_r14, 39, 123, 0.0F, -0.5F, -15.5F, 1, 1, 7, -0.001F, false));

		gun167_r16_r1 = new ModelRenderer(this);
		gun167_r16_r1.setRotationPoint(-1.5496F, -0.6375F, -12.001F);
		gun167_r14.addChild(gun167_r16_r1);
		setRotationAngle(gun167_r16_r1, 0.0F, 0.0F, -3.1416F);
		gun167_r16_r1.cubeList.add(new ModelBox(gun167_r16_r1, 32, 116, -3.2577F, -4.6719F, -3.5F, 1, 1, 14, -0.001F, false));

		gun168_r6 = new ModelRenderer(this);
		gun168_r6.setRotationPoint(-2.0F, 0.0F, 0.0F);
		bone67.addChild(gun168_r6);
		setRotationAngle(gun168_r6, 0.0F, 0.0F, 0.7854F);
		gun168_r6.cubeList.add(new ModelBox(gun168_r6, 107, 83, 0.0F, -0.5F, -8.5F, 1, 1, 21, -0.001F, false));
		gun168_r6.cubeList.add(new ModelBox(gun168_r6, 121, 97, 0.0F, -0.5F, -15.5F, 1, 1, 7, -0.001F, false));

		gun188_r8_r1 = new ModelRenderer(this);
		gun188_r8_r1.setRotationPoint(-0.1354F, -2.0517F, -12.001F);
		gun168_r6.addChild(gun188_r8_r1);
		setRotationAngle(gun188_r8_r1, 0.0F, 0.0F, -3.1416F);
		gun188_r8_r1.cubeList.add(new ModelBox(gun188_r8_r1, 114, 90, -4.672F, -3.2577F, -3.5F, 1, 1, 14, -0.001F, false));

		bone70 = new ModelRenderer(this);
		bone70.setRotationPoint(-1.3174F, -2.7526F, -0.0145F);
		mp5_a5_stock.addChild(bone70);
		

		gun168_r7 = new ModelRenderer(this);
		gun168_r7.setRotationPoint(0.5464F, -0.0512F, -5.5F);
		bone70.addChild(gun168_r7);
		setRotationAngle(gun168_r7, 0.0F, 0.0F, 0.7854F);
		

		gun169_r2 = new ModelRenderer(this);
		gun169_r2.setRotationPoint(-1.4536F, -0.0512F, -5.5F);
		bone70.addChild(gun169_r2);
		setRotationAngle(gun169_r2, 0.0F, 0.0F, 0.7854F);
		

		bone69 = new ModelRenderer(this);
		bone69.setRotationPoint(-1.3174F, -0.8526F, 5.9855F);
		mp5_a5_stock.addChild(bone69);
		setRotationAngle(bone69, -0.5236F, 0.0F, 0.0F);
		

		gun168_r8 = new ModelRenderer(this);
		gun168_r8.setRotationPoint(0.5464F, 0.4384F, 7.8466F);
		bone69.addChild(gun168_r8);
		setRotationAngle(gun168_r8, 0.0F, 0.0F, 0.7854F);
		

		gun169_r3 = new ModelRenderer(this);
		gun169_r3.setRotationPoint(-1.4536F, 0.4384F, 7.8466F);
		bone69.addChild(gun169_r3);
		setRotationAngle(gun169_r3, 0.0F, 0.0F, 0.7854F);
		

		bone68 = new ModelRenderer(this);
		bone68.setRotationPoint(-1.3174F, 12.8012F, 25.9855F);
		mp5_a5_stock.addChild(bone68);
		bone68.cubeList.add(new ModelBox(bone68, 0, 71, -1.0929F, -0.6024F, -1.0F, 2, 1, 2, 0.0F, false));

		gun168_r9 = new ModelRenderer(this);
		gun168_r9.setRotationPoint(0.5464F, 0.0512F, -11.5F);
		bone68.addChild(gun168_r9);
		setRotationAngle(gun168_r9, 0.0F, 0.0F, -0.7854F);
		gun168_r9.cubeList.add(new ModelBox(gun168_r9, 147, 88, 0.0F, -0.5F, 10.5F, 1, 1, 2, -0.001F, false));

		gun169_r4 = new ModelRenderer(this);
		gun169_r4.setRotationPoint(-1.4536F, 0.0512F, -11.5F);
		bone68.addChild(gun169_r4);
		setRotationAngle(gun169_r4, 0.0F, 0.0F, -0.7854F);
		gun169_r4.cubeList.add(new ModelBox(gun169_r4, 147, 91, 0.0F, -0.5F, 10.5F, 1, 1, 2, -0.001F, false));

		bone66 = new ModelRenderer(this);
		bone66.setRotationPoint(-2.4603F, 7.2781F, 15.1619F);
		mp5_a5_stock.addChild(bone66);
		setRotationAngle(bone66, -0.3491F, 0.0F, 0.0F);
		

		bone66_r1 = new ModelRenderer(this);
		bone66_r1.setRotationPoint(1.05F, -2.0984F, 0.1527F);
		bone66.addChild(bone66_r1);
		setRotationAngle(bone66_r1, -0.2618F, 0.0F, 0.0F);
		bone66_r1.cubeList.add(new ModelBox(bone66_r1, 61, 34, -1.0F, 0.2813F, -5.1614F, 2, 1, 17, 0.0F, false));

		gun169_r5 = new ModelRenderer(this);
		gun169_r5.setRotationPoint(0.0571F, 1.5F, -1.2F);
		bone66.addChild(gun169_r5);
		setRotationAngle(gun169_r5, 0.0F, 0.0F, 0.7854F);
		

		gun169_r5_r1 = new ModelRenderer(this);
		gun169_r5_r1.setRotationPoint(-1.8423F, -3.2465F, 1.3527F);
		gun169_r5.addChild(gun169_r5_r1);
		setRotationAngle(gun169_r5_r1, -0.1872F, 0.1841F, -0.0173F);
		gun169_r5_r1.cubeList.add(new ModelBox(gun169_r5_r1, 37, 8, -0.791F, 0.6132F, -5.1614F, 1, 1, 17, 0.0F, false));

		gun168_r10 = new ModelRenderer(this);
		gun168_r10.setRotationPoint(2.0429F, 1.5F, -1.2F);
		bone66.addChild(gun168_r10);
		setRotationAngle(gun168_r10, 0.0F, 0.0F, -0.7854F);
		

		gun168_r10_r1 = new ModelRenderer(this);
		gun168_r10_r1.setRotationPoint(1.8423F, -3.2465F, 1.3527F);
		gun168_r10.addChild(gun168_r10_r1);
		setRotationAngle(gun168_r10_r1, -0.1872F, -0.1841F, 0.0173F);
		gun168_r10_r1.cubeList.add(new ModelBox(gun168_r10_r1, 7, 60, -0.209F, 0.6132F, -5.1614F, 1, 1, 17, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		mp5_stock_adapter2.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}