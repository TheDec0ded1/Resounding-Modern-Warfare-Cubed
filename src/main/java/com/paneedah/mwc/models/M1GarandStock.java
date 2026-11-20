package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M1GarandStock extends ModelBase {
	private final ModelRenderer stock;
	private final ModelRenderer socomchassis_r1;
	private final ModelRenderer socomchassis_r2;
	private final ModelRenderer gun25_r1;
	private final ModelRenderer gun24_r1;
	private final ModelRenderer gun23_r1;
	private final ModelRenderer gun26_r1;
	private final ModelRenderer gun28_r1;
	private final ModelRenderer gun27_r1;
	private final ModelRenderer gun25_r2;
	private final ModelRenderer gun25_r3;
	private final ModelRenderer gun27_r2;
	private final ModelRenderer gun28_r2;
	private final ModelRenderer gun26_r2;
	private final ModelRenderer gun25_r4;
	private final ModelRenderer gun25_r5;
	private final ModelRenderer gun24_r2;
	private final ModelRenderer gun26_r3;
	private final ModelRenderer gun24_r3;
	private final ModelRenderer gun23_r2;
	private final ModelRenderer gun22_r1;
	private final ModelRenderer gun22_r2;
	private final ModelRenderer gun21_r1;
	private final ModelRenderer gun24_r4;
	private final ModelRenderer gun23_r3;
	private final ModelRenderer gun21_r2;
	private final ModelRenderer gun20_r1;
	private final ModelRenderer gun59_r1;
	private final ModelRenderer gun58_r1;
	private final ModelRenderer gun58_r2;
	private final ModelRenderer gun59_r2;
	private final ModelRenderer gun108;
	private final ModelRenderer gun112;
	private final ModelRenderer gun113;
	private final ModelRenderer gun119;
	private final ModelRenderer gun120;
	private final ModelRenderer gun157;
	private final ModelRenderer gun158;
	private final ModelRenderer gun187;
	private final ModelRenderer gun199;
	private final ModelRenderer gun200_r1;
	private final ModelRenderer gun200_r2;
	private final ModelRenderer gun200;
	private final ModelRenderer gun201_r1;
	private final ModelRenderer gun201_r2;
	private final ModelRenderer gun215;
	private final ModelRenderer gun216_r1;
	private final ModelRenderer gun216_r2;
	private final ModelRenderer gun216;
	private final ModelRenderer gun217_r1;
	private final ModelRenderer gun217_r2;
	private final ModelRenderer gun217;
	private final ModelRenderer gun218_r1;
	private final ModelRenderer gun218_r2;
	private final ModelRenderer gun218;
	private final ModelRenderer gun219_r1;
	private final ModelRenderer gun219_r2;
	private final ModelRenderer gun221;
	private final ModelRenderer gun222_r1;
	private final ModelRenderer gun222;
	private final ModelRenderer gun223_r1;
	private final ModelRenderer gun223_r2;
	private final ModelRenderer standard_cover;
	private final ModelRenderer gun164;
	private final ModelRenderer gun163;
	private final ModelRenderer gun162;
	private final ModelRenderer gun161;
	private final ModelRenderer gun160;
	private final ModelRenderer gun159;
	private final ModelRenderer gun156;
	private final ModelRenderer gun147;
	private final ModelRenderer gun142;
	private final ModelRenderer gun138;
	private final ModelRenderer gun124;
	private final ModelRenderer gun123;
	private final ModelRenderer barrel;
	private final ModelRenderer gun164_r1;
	private final ModelRenderer gun165_r1;
	private final ModelRenderer gun164_r2;
	private final ModelRenderer gun163_r1;
	private final ModelRenderer gun164_r3;
	private final ModelRenderer gun165_r2;
	private final ModelRenderer gun164_r4;
	private final ModelRenderer gun163_r2;
	private final ModelRenderer gun164_r5;
	private final ModelRenderer gun163_r3;
	private final ModelRenderer gun163_r4;
	private final ModelRenderer gun162_r1;
	private final ModelRenderer ironsights;
	private final ModelRenderer ironsights_r1;
	private final ModelRenderer ironsights_r2;

	public M1GarandStock() {
		textureWidth = 496;
		textureHeight = 496;

		stock = new ModelRenderer(this);
		stock.setRotationPoint(0.0F, 24.0F, 0.0F);
		stock.cubeList.add(new ModelBox(stock, 446, 284, -4.0F, -35.7F, -25.0F, 5, 3, 18, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 454, 60, -4.002F, -33.0F, -28.0F, 5, 1, 3, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 446, 261, -3.999F, -35.7F, -44.0F, 5, 3, 19, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 448, 145, -4.001F, -35.7F, -60.625F, 5, 2, 17, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 393, 316, -4.001F, -36.7F, -60.625F, 5, 1, 12, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 393, 0, -0.001F, -36.7F, -60.625F, 1, 1, 30, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 435, 367, -4.001F, -33.2F, -25.0F, 5, 3, 20, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 436, 391, -3.75F, -30.2F, -25.0F, 4, 1, 21, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 448, 122, -0.25F, -30.201F, -25.0F, 1, 1, 21, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 393, 32, -3.5F, -32.02F, 5.25F, 4, 6, 26, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 261, 415, -3.5F, -26.02F, 28.25F, 4, 6, 3, 0.003F, false));
		stock.cubeList.add(new ModelBox(stock, 393, 65, -2.5F, -33.02F, 5.05F, 2, 3, 26, 0.001F, false));

		socomchassis_r1 = new ModelRenderer(this);
		socomchassis_r1.setRotationPoint(-1.4936F, -32.7429F, -47.2F);
		stock.addChild(socomchassis_r1);
		setRotationAngle(socomchassis_r1, -0.0524F, 0.0F, 0.0F);
		socomchassis_r1.cubeList.add(new ModelBox(socomchassis_r1, 212, 330, -1.5064F, -0.1571F, -13.5F, 3, 2, 35, 0.0F, false));

		socomchassis_r2 = new ModelRenderer(this);
		socomchassis_r2.setRotationPoint(-1.5064F, -38.0162F, -68.5F);
		stock.addChild(socomchassis_r2);
		setRotationAngle(socomchassis_r2, 0.0F, 0.0F, 3.1416F);
		socomchassis_r2.cubeList.add(new ModelBox(socomchassis_r2, 383, 404, -0.9851F, -0.7628F, -16.5F, 2, 2, 24, 0.0F, false));

		gun25_r1 = new ModelRenderer(this);
		gun25_r1.setRotationPoint(0.5F, -26.36F, 3.9F);
		stock.addChild(gun25_r1);
		setRotationAngle(gun25_r1, -0.2793F, 0.0F, 0.0F);
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 435, 342, -3.999F, -3.4172F, 5.0819F, 4, 3, 21, 0.0F, false));

		gun24_r1 = new ModelRenderer(this);
		gun24_r1.setRotationPoint(0.5F, -23.36F, -1.1F);
		stock.addChild(gun24_r1);
		setRotationAngle(gun24_r1, 0.4538F, 0.0F, 0.0F);
		gun24_r1.cubeList.add(new ModelBox(gun24_r1, 0, 449, -3.998F, -2.9093F, 4.0556F, 4, 6, 8, 0.0F, false));

		gun23_r1 = new ModelRenderer(this);
		gun23_r1.setRotationPoint(0.5F, -29.2F, -2.6F);
		stock.addChild(gun23_r1);
		setRotationAngle(gun23_r1, -1.309F, 0.0F, 0.0F);
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 278, 464, -3.999F, -4.5708F, 6.26F, 4, 1, 2, 0.0F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 456, 0, -3.499F, -3.5708F, 2.26F, 3, 1, 6, 0.0F, false));

		gun26_r1 = new ModelRenderer(this);
		gun26_r1.setRotationPoint(0.5F, -32.52F, -6.55F);
		stock.addChild(gun26_r1);
		setRotationAngle(gun26_r1, -0.2443F, 0.0F, 0.0F);
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 454, 52, -4.0F, -0.2391F, 5.0934F, 4, 2, 5, 0.0F, false));

		gun28_r1 = new ModelRenderer(this);
		gun28_r1.setRotationPoint(-2.5F, -33.52F, -6.55F);
		stock.addChild(gun28_r1);
		setRotationAngle(gun28_r1, -0.1745F, -0.1745F, -0.7854F);
		gun28_r1.cubeList.add(new ModelBox(gun28_r1, 390, 457, -1.2283F, -0.1808F, 5.093F, 1, 1, 5, 0.0F, false));
		gun28_r1.cubeList.add(new ModelBox(gun28_r1, 403, 457, -0.8283F, -0.1798F, 5.093F, 1, 1, 5, 0.0F, false));

		gun27_r1 = new ModelRenderer(this);
		gun27_r1.setRotationPoint(-0.5F, -33.52F, -6.55F);
		stock.addChild(gun27_r1);
		setRotationAngle(gun27_r1, -0.1745F, -0.1745F, -0.7854F);
		gun27_r1.cubeList.add(new ModelBox(gun27_r1, 416, 457, -0.8293F, 0.2202F, 5.093F, 1, 1, 5, 0.0F, false));
		gun27_r1.cubeList.add(new ModelBox(gun27_r1, 429, 457, -0.8283F, -0.1798F, 5.093F, 1, 1, 5, 0.0F, false));

		gun25_r2 = new ModelRenderer(this);
		gun25_r2.setRotationPoint(-0.5F, -33.52F, -6.55F);
		stock.addChild(gun25_r2);
		setRotationAngle(gun25_r2, -0.2443F, 0.0F, 0.0F);
		gun25_r2.cubeList.add(new ModelBox(gun25_r2, 179, 457, -2.0F, -0.2391F, 5.0934F, 2, 2, 5, 0.0F, false));

		gun25_r3 = new ModelRenderer(this);
		gun25_r3.setRotationPoint(0.5F, -33.02F, 0.25F);
		stock.addChild(gun25_r3);
		setRotationAngle(gun25_r3, -1.0647F, 0.0F, 0.0F);
		gun25_r3.cubeList.add(new ModelBox(gun25_r3, 261, 405, -4.0F, -3.8885F, 3.2985F, 4, 6, 3, 0.004F, false));

		gun27_r2 = new ModelRenderer(this);
		gun27_r2.setRotationPoint(-2.5F, -34.02F, 0.25F);
		stock.addChild(gun27_r2);
		setRotationAngle(gun27_r2, -1.1868F, 0.3316F, -0.6807F);
		gun27_r2.cubeList.add(new ModelBox(gun27_r2, 125, 396, -3.6228F, -3.9022F, 2.4149F, 1, 4, 1, -0.001F, false));
		gun27_r2.cubeList.add(new ModelBox(gun27_r2, 96, 449, -3.2228F, -3.9022F, 2.4149F, 1, 4, 1, 0.0F, false));

		gun28_r2 = new ModelRenderer(this);
		gun28_r2.setRotationPoint(-0.5F, -34.02F, 0.25F);
		stock.addChild(gun28_r2);
		setRotationAngle(gun28_r2, -1.1868F, -0.3316F, 0.6807F);
		gun28_r2.cubeList.add(new ModelBox(gun28_r2, 109, 468, 2.5228F, -3.9022F, 2.4159F, 1, 4, 1, 0.0F, false));
		gun28_r2.cubeList.add(new ModelBox(gun28_r2, 7, 469, 2.2228F, -3.9022F, 2.4149F, 1, 4, 1, 0.0F, false));

		gun26_r2 = new ModelRenderer(this);
		gun26_r2.setRotationPoint(-2.5F, -34.02F, 0.25F);
		stock.addChild(gun26_r2);
		setRotationAngle(gun26_r2, 0.0F, 0.0F, -0.7854F);
		gun26_r2.cubeList.add(new ModelBox(gun26_r2, 393, 122, -2.1071F, 0.7061F, 4.8F, 1, 1, 26, -0.001F, false));

		gun25_r4 = new ModelRenderer(this);
		gun25_r4.setRotationPoint(-2.5F, -34.02F, 0.25F);
		stock.addChild(gun25_r4);
		setRotationAngle(gun25_r4, 0.0F, 0.0F, -0.7854F);
		gun25_r4.cubeList.add(new ModelBox(gun25_r4, 393, 150, -1.7071F, 0.7071F, 4.799F, 1, 1, 26, -0.001F, false));

		gun25_r5 = new ModelRenderer(this);
		gun25_r5.setRotationPoint(-0.5F, -34.02F, 0.25F);
		stock.addChild(gun25_r5);
		setRotationAngle(gun25_r5, 0.0F, 0.0F, -0.7854F);
		gun25_r5.cubeList.add(new ModelBox(gun25_r5, 393, 178, -1.7081F, 1.1071F, 4.8F, 1, 1, 26, -0.001F, false));
		gun25_r5.cubeList.add(new ModelBox(gun25_r5, 393, 206, -1.7071F, 0.7071F, 4.799F, 1, 1, 26, -0.001F, false));

		gun24_r2 = new ModelRenderer(this);
		gun24_r2.setRotationPoint(-0.5F, -34.02F, 0.25F);
		stock.addChild(gun24_r2);
		setRotationAngle(gun24_r2, -1.0647F, 0.0F, 0.0F);
		gun24_r2.cubeList.add(new ModelBox(gun24_r2, 277, 368, -2.0F, -3.8885F, 3.2985F, 2, 6, 3, 0.0F, false));

		gun26_r3 = new ModelRenderer(this);
		gun26_r3.setRotationPoint(0.5F, -27.12F, 12.25F);
		stock.addChild(gun26_r3);
		setRotationAngle(gun26_r3, -0.0873F, 0.0F, 0.0F);
		gun26_r3.cubeList.add(new ModelBox(gun26_r3, 436, 414, -3.998F, -0.4398F, 5.0681F, 4, 4, 12, 0.0F, false));

		gun24_r3 = new ModelRenderer(this);
		gun24_r3.setRotationPoint(-2.5F, -36.22F, -8.45F);
		stock.addChild(gun24_r3);
		setRotationAngle(gun24_r3, -0.48F, 0.5498F, 0.7854F);
		gun24_r3.cubeList.add(new ModelBox(gun24_r3, 209, 457, -2.0097F, -1.512F, 4.4356F, 1, 1, 6, 0.0F, false));

		gun23_r2 = new ModelRenderer(this);
		gun23_r2.setRotationPoint(-0.5F, -36.22F, -8.45F);
		stock.addChild(gun23_r2);
		setRotationAngle(gun23_r2, -0.48F, -0.5498F, -0.7854F);
		gun23_r2.cubeList.add(new ModelBox(gun23_r2, 224, 457, 1.0097F, -1.512F, 4.4356F, 1, 1, 6, 0.0F, false));

		gun22_r1 = new ModelRenderer(this);
		gun22_r1.setRotationPoint(-0.5F, -36.22F, -8.45F);
		stock.addChild(gun22_r1);
		setRotationAngle(gun22_r1, -0.7156F, 0.0F, 0.0F);
		gun22_r1.cubeList.add(new ModelBox(gun22_r1, 164, 457, -2.0F, -2.5257F, 4.4296F, 2, 3, 5, 0.0F, false));

		gun22_r2 = new ModelRenderer(this);
		gun22_r2.setRotationPoint(0.5F, -31.4F, -3.3F);
		stock.addChild(gun22_r2);
		setRotationAngle(gun22_r2, -0.9599F, 0.0F, 0.0F);
		gun22_r2.cubeList.add(new ModelBox(gun22_r2, 450, 100, -3.999F, -2.5221F, 3.6871F, 4, 2, 6, 0.002F, false));
		gun22_r2.cubeList.add(new ModelBox(gun22_r2, 454, 32, -3.499F, -1.5221F, 3.6871F, 3, 2, 6, 0.001F, false));

		gun21_r1 = new ModelRenderer(this);
		gun21_r1.setRotationPoint(0.5F, -34.2F, -9.0F);
		stock.addChild(gun21_r1);
		setRotationAngle(gun21_r1, -0.4014F, 0.0F, 0.0F);
		gun21_r1.cubeList.add(new ModelBox(gun21_r1, 446, 306, -3.999F, -0.033F, 4.9933F, 4, 2, 6, 0.0F, false));
		gun21_r1.cubeList.add(new ModelBox(gun21_r1, 450, 109, -3.499F, -0.033F, 4.9933F, 3, 3, 6, 0.0F, false));

		gun24_r4 = new ModelRenderer(this);
		gun24_r4.setRotationPoint(-4.0F, -34.2F, -10.0F);
		stock.addChild(gun24_r4);
		setRotationAngle(gun24_r4, -0.6981F, 0.2209F, 0.2686F);
		gun24_r4.cubeList.add(new ModelBox(gun24_r4, 442, 457, -0.8366F, -4.5345F, 3.8015F, 1, 1, 5, 0.0F, false));

		gun23_r3 = new ModelRenderer(this);
		gun23_r3.setRotationPoint(1.0F, -34.2F, -10.0F);
		stock.addChild(gun23_r3);
		setRotationAngle(gun23_r3, -0.6981F, -0.2209F, -0.2686F);
		gun23_r3.cubeList.add(new ModelBox(gun23_r3, 455, 457, -0.1634F, -4.5345F, 3.8015F, 1, 1, 5, 0.0F, false));

		gun21_r2 = new ModelRenderer(this);
		gun21_r2.setRotationPoint(1.0F, -34.2F, -10.0F);
		stock.addChild(gun21_r2);
		setRotationAngle(gun21_r2, -0.3665F, -0.0873F, 0.0349F);
		gun21_r2.cubeList.add(new ModelBox(gun21_r2, 239, 457, -0.5293F, -0.8508F, 5.0055F, 1, 3, 5, 0.0F, false));

		gun20_r1 = new ModelRenderer(this);
		gun20_r1.setRotationPoint(-4.0F, -34.2F, -10.0F);
		stock.addChild(gun20_r1);
		setRotationAngle(gun20_r1, -0.3665F, 0.0873F, -0.0349F);
		gun20_r1.cubeList.add(new ModelBox(gun20_r1, 252, 457, -0.4707F, -0.8508F, 5.0055F, 1, 3, 5, 0.0F, false));

		gun59_r1 = new ModelRenderer(this);
		gun59_r1.setRotationPoint(1.001F, -36.44F, -10.02F);
		stock.addChild(gun59_r1);
		setRotationAngle(gun59_r1, -0.1833F, -0.7505F, 0.1257F);
		gun59_r1.cubeList.add(new ModelBox(gun59_r1, 121, 470, 2.5007F, 0.3225F, 4.8922F, 1, 3, 1, 0.0F, false));
		gun59_r1.cubeList.add(new ModelBox(gun59_r1, 433, 464, 1.5017F, 0.3235F, 3.6922F, 2, 3, 2, 0.0F, false));

		gun58_r1 = new ModelRenderer(this);
		gun58_r1.setRotationPoint(-3.999F, -36.44F, -10.02F);
		stock.addChild(gun58_r1);
		setRotationAngle(gun58_r1, -0.1833F, 0.7505F, -0.1257F);
		gun58_r1.cubeList.add(new ModelBox(gun58_r1, 227, 470, -3.5027F, 0.3235F, 4.8922F, 1, 3, 1, 0.0F, false));
		gun58_r1.cubeList.add(new ModelBox(gun58_r1, 442, 464, -3.5017F, 0.3245F, 3.6922F, 2, 3, 2, 0.0F, false));

		gun58_r2 = new ModelRenderer(this);
		gun58_r2.setRotationPoint(1.001F, -36.4346F, -9.9957F);
		stock.addChild(gun58_r2);
		setRotationAngle(gun58_r2, -0.8901F, -0.1047F, 0.0F);
		gun58_r2.cubeList.add(new ModelBox(gun58_r2, 369, 464, -0.4775F, -3.2351F, 3.9066F, 1, 1, 4, 0.0F, false));
		gun58_r2.cubeList.add(new ModelBox(gun58_r2, 471, 60, -0.4785F, -2.5351F, 5.5066F, 1, 1, 1, 0.0F, false));
		gun58_r2.cubeList.add(new ModelBox(gun58_r2, 75, 471, -0.4765F, -2.5351F, 4.7066F, 1, 1, 1, 0.0F, false));

		gun59_r2 = new ModelRenderer(this);
		gun59_r2.setRotationPoint(-3.999F, -36.4346F, -9.9957F);
		stock.addChild(gun59_r2);
		setRotationAngle(gun59_r2, -0.8901F, 0.1047F, 0.0F);
		gun59_r2.cubeList.add(new ModelBox(gun59_r2, 471, 77, -0.5235F, -2.5351F, 5.5066F, 1, 1, 1, 0.0F, false));
		gun59_r2.cubeList.add(new ModelBox(gun59_r2, 471, 80, -0.5215F, -2.5351F, 4.7066F, 1, 1, 1, 0.0F, false));
		gun59_r2.cubeList.add(new ModelBox(gun59_r2, 380, 464, -0.5225F, -3.2351F, 3.9066F, 1, 1, 4, 0.0F, false));

		gun108 = new ModelRenderer(this);
		gun108.setRotationPoint(-3.6F, -35.2F, -83.0F);
		stock.addChild(gun108);
		setRotationAngle(gun108, 0.0F, 0.0F, -0.7064F);
		gun108.cubeList.add(new ModelBox(gun108, 471, 83, -0.2018F, 0.9311F, -3.0F, 1, 1, 1, 0.0F, false));
		gun108.cubeList.add(new ModelBox(gun108, 247, 471, 3.9076F, -0.9432F, -3.0F, 1, 1, 1, 0.0F, false));

		gun112 = new ModelRenderer(this);
		gun112.setRotationPoint(0.6F, -35.2F, -83.0F);
		stock.addChild(gun112);
		setRotationAngle(gun112, 0.0F, 0.0F, 2.3051F);
		gun112.cubeList.add(new ModelBox(gun112, 471, 100, 0.9248F, -0.2556F, -3.0F, 1, 1, 1, 0.0F, false));
		gun112.cubeList.add(new ModelBox(gun112, 252, 471, -0.834F, 3.9008F, -3.0F, 1, 1, 1, 0.0F, false));

		gun113 = new ModelRenderer(this);
		gun113.setRotationPoint(-2.5F, -35.8F, -83.0F);
		stock.addChild(gun113);
		gun113.cubeList.add(new ModelBox(gun113, 446, 470, 0.0F, 1.2F, -3.0F, 2, 1, 1, 0.0F, false));
		gun113.cubeList.add(new ModelBox(gun113, 12, 471, 0.021F, -3.303F, -3.0F, 2, 1, 1, 0.0F, false));

		gun119 = new ModelRenderer(this);
		gun119.setRotationPoint(-1.4F, -37.2F, -83.0F);
		stock.addChild(gun119);
		gun119.cubeList.add(new ModelBox(gun119, 451, 464, -1.4299F, -1.1423F, -3.0F, 3, 4, 1, 0.0F, false));

		gun120 = new ModelRenderer(this);
		gun120.setRotationPoint(-3.6F, -37.2F, -83.0F);
		stock.addChild(gun120);
		gun120.cubeList.add(new ModelBox(gun120, 391, 469, 0.4509F, -1.1607F, -3.0F, 1, 4, 1, 0.0F, false));

		gun157 = new ModelRenderer(this);
		gun157.setRotationPoint(-3.0F, -33.1F, -72.2F);
		stock.addChild(gun157);
		setRotationAngle(gun157, 0.632F, 0.0F, 0.0F);
		gun157.cubeList.add(new ModelBox(gun157, 450, 119, 0.0F, 7.7086F, 7.9892F, 3, 1, 1, 0.0F, false));
		gun157.cubeList.add(new ModelBox(gun157, 75, 468, 0.0F, -8.6899F, -11.3607F, 3, 1, 1, 0.0F, false));

		gun158 = new ModelRenderer(this);
		gun158.setRotationPoint(-3.0F, -35.1F, -76.0F);
		stock.addChild(gun158);
		

		gun187 = new ModelRenderer(this);
		gun187.setRotationPoint(-4.0F, -36.7F, -11.5F);
		stock.addChild(gun187);
		setRotationAngle(gun187, -0.1313F, 0.0F, 0.0F);
		gun187.cubeList.add(new ModelBox(gun187, 456, 26, 0.001F, 0.4022F, 4.5922F, 5, 3, 2, 0.0F, false));
		gun187.cubeList.add(new ModelBox(gun187, 460, 464, 1.51F, 0.4012F, 6.1822F, 2, 3, 2, 0.0F, false));

		gun199 = new ModelRenderer(this);
		gun199.setRotationPoint(1.0F, -35.2F, -82.0F);
		stock.addChild(gun199);
		setRotationAngle(gun199, 0.0F, 0.0F, 1.9333F);
		gun199.cubeList.add(new ModelBox(gun199, 159, 405, 0.1773F, 0.4675F, -3.0F, 1, 1, 24, 0.0F, false));

		gun200_r1 = new ModelRenderer(this);
		gun200_r1.setRotationPoint(1.4987F, 2.0985F, 28.5F);
		gun199.addChild(gun200_r1);
		setRotationAngle(gun200_r1, 0.0186F, 0.049F, 0.0005F);
		gun200_r1.cubeList.add(new ModelBox(gun200_r1, 204, 368, 0.3413F, -2.7964F, -7.1144F, 1, 1, 35, 0.0F, false));

		gun200_r2 = new ModelRenderer(this);
		gun200_r2.setRotationPoint(-4.9234F, 4.5479F, 6.5F);
		gun199.addChild(gun200_r2);
		setRotationAngle(gun200_r2, 0.0F, 0.0F, -3.1416F);
		gun200_r2.cubeList.add(new ModelBox(gun200_r2, 435, 316, -4.6491F, -0.3689F, -9.5F, 1, 1, 24, 0.0F, false));

		gun200 = new ModelRenderer(this);
		gun200.setRotationPoint(0.55F, -34.0F, -82.0F);
		stock.addChild(gun200);
		setRotationAngle(gun200, 0.0F, 0.0F, -2.8256F);
		gun200.cubeList.add(new ModelBox(gun200, 210, 405, 0.4752F, -0.1554F, -3.0F, 1, 1, 24, 0.0F, false));

		gun201_r1 = new ModelRenderer(this);
		gun201_r1.setRotationPoint(2.1111F, -0.1191F, 28.5F);
		gun200.addChild(gun201_r1);
		setRotationAngle(gun201_r1, 0.0498F, -0.0163F, -0.0004F);
		gun201_r1.cubeList.add(new ModelBox(gun201_r1, 362, 367, -2.7226F, -1.7513F, -7.1144F, 1, 1, 35, 0.0F, false));

		gun201_r2 = new ModelRenderer(this);
		gun201_r2.setRotationPoint(4.2592F, 6.4099F, 6.5F);
		gun200.addChild(gun201_r2);
		setRotationAngle(gun201_r2, 0.0F, 0.0F, -3.1416F);
		gun201_r2.cubeList.add(new ModelBox(gun201_r2, 408, 431, -0.5299F, 3.3465F, -9.5F, 1, 1, 24, 0.0F, false));

		gun215 = new ModelRenderer(this);
		gun215.setRotationPoint(0.0F, -33.2F, -82.0F);
		stock.addChild(gun215);
		setRotationAngle(gun215, 0.0F, 0.0F, -2.6025F);
		gun215.cubeList.add(new ModelBox(gun215, 0, 423, 0.3678F, -0.2878F, -3.0F, 1, 1, 24, 0.0F, false));

		gun216_r1 = new ModelRenderer(this);
		gun216_r1.setRotationPoint(1.9711F, 0.3857F, 28.5F);
		gun215.addChild(gun216_r1);
		setRotationAngle(gun216_r1, 0.0449F, -0.0269F, -0.0006F);
		gun216_r1.cubeList.add(new ModelBox(gun216_r1, 289, 367, -2.9813F, -2.0744F, -7.1144F, 1, 1, 35, 0.0F, false));

		gun216_r2 = new ModelRenderer(this);
		gun216_r2.setRotationPoint(5.5106F, 6.2776F, 6.5F);
		gun215.addChild(gun216_r2);
		setRotationAngle(gun216_r2, 0.0F, 0.0F, 3.1416F);
		gun216_r2.cubeList.add(new ModelBox(gun216_r2, 357, 431, 0.2237F, 2.3808F, -9.5F, 1, 1, 24, 0.0F, false));

		gun216 = new ModelRenderer(this);
		gun216.setRotationPoint(-4.0F, -35.2F, -82.0F);
		stock.addChild(gun216);
		setRotationAngle(gun216, 0.0F, 0.0F, -0.409F);
		gun216.cubeList.add(new ModelBox(gun216, 51, 423, 0.4588F, 0.1988F, -3.0F, 1, 1, 24, 0.0F, false));

		gun217_r1 = new ModelRenderer(this);
		gun217_r1.setRotationPoint(2.0383F, 1.5997F, 28.5F);
		gun216.addChild(gun217_r1);
		setRotationAngle(gun217_r1, -0.048F, -0.0208F, 0.0005F);
		gun217_r1.cubeList.add(new ModelBox(gun217_r1, 131, 367, -2.8209F, 0.2058F, -7.1144F, 1, 1, 35, 0.0F, false));

		gun217_r2 = new ModelRenderer(this);
		gun217_r2.setRotationPoint(4.76F, -4.7118F, 6.5F);
		gun216.addChild(gun217_r2);
		setRotationAngle(gun217_r2, 0.0F, 0.0F, 3.1416F);
		gun217_r2.cubeList.add(new ModelBox(gun217_r2, 306, 431, -0.1642F, -4.6663F, -9.5F, 1, 1, 24, 0.0F, false));

		gun217 = new ModelRenderer(this);
		gun217.setRotationPoint(-3.5F, -34.0F, -82.0F);
		stock.addChild(gun217);
		setRotationAngle(gun217, 0.0F, 0.0F, -1.9333F);
		gun217.cubeList.add(new ModelBox(gun217, 102, 431, -0.1773F, 0.4675F, -3.0F, 1, 1, 24, 0.0F, false));

		gun218_r1 = new ModelRenderer(this);
		gun218_r1.setRotationPoint(-0.2039F, 2.0685F, 28.5F);
		gun217.addChild(gun218_r1);
		setRotationAngle(gun218_r1, 0.0186F, -0.049F, -0.0005F);
		gun218_r1.cubeList.add(new ModelBox(gun218_r1, 362, 330, -1.636F, -2.7663F, -7.1144F, 1, 1, 35, 0.0F, false));

		gun218_r2 = new ModelRenderer(this);
		gun218_r2.setRotationPoint(6.2272F, 4.4939F, 6.5F);
		gun217.addChild(gun218_r2);
		setRotationAngle(gun218_r2, 0.0F, 0.0F, -3.1416F);
		gun218_r2.cubeList.add(new ModelBox(gun218_r2, 255, 431, 3.3543F, -0.3389F, -9.5F, 1, 1, 24, 0.0F, false));

		gun218 = new ModelRenderer(this);
		gun218.setRotationPoint(-3.0F, -33.2F, -82.0F);
		stock.addChild(gun218);
		setRotationAngle(gun218, 0.0F, 0.0F, -2.1192F);
		gun218.cubeList.add(new ModelBox(gun218, 153, 431, -0.3173F, 0.4171F, -3.0F, 1, 1, 24, 0.0F, false));

		gun219_r1 = new ModelRenderer(this);
		gun219_r1.setRotationPoint(0.3606F, 1.9856F, 28.5F);
		gun218.addChild(gun219_r1);
		setRotationAngle(gun219_r1, 0.0273F, -0.0447F, -0.0006F);
		gun219_r1.cubeList.add(new ModelBox(gun219_r1, 289, 330, -2.0399F, -3.0114F, -7.1144F, 1, 1, 35, 0.0F, false));

		gun219_r2 = new ModelRenderer(this);
		gun219_r2.setRotationPoint(6.2327F, 5.5579F, 6.5F);
		gun218.addChild(gun219_r2);
		setRotationAngle(gun219_r2, 0.0F, 0.0F, -3.1416F);
		gun219_r2.cubeList.add(new ModelBox(gun219_r2, 204, 431, 2.3592F, 0.2869F, -9.5F, 1, 1, 24, 0.0F, false));

		gun221 = new ModelRenderer(this);
		gun221.setRotationPoint(-3.0F, -37.2F, -82.0F);
		stock.addChild(gun221);
		gun221.cubeList.add(new ModelBox(gun221, 393, 95, -0.5F, 0.0F, -3.0F, 4, 2, 24, 0.0F, false));

		gun222_r1 = new ModelRenderer(this);
		gun222_r1.setRotationPoint(1.5064F, 4.4571F, 34.8F);
		gun221.addChild(gun222_r1);
		setRotationAngle(gun222_r1, -0.0524F, 0.0F, 0.0F);
		gun222_r1.cubeList.add(new ModelBox(gun222_r1, 131, 330, -2.5044F, -1.1571F, -13.5F, 5, 1, 35, 0.0F, false));

		gun222 = new ModelRenderer(this);
		gun222.setRotationPoint(-4.0F, -30.2F, -27.0F);
		stock.addChild(gun222);
		setRotationAngle(gun222, 2.9371F, 0.0F, 0.0F);
		

		gun223_r1 = new ModelRenderer(this);
		gun223_r1.setRotationPoint(2.745F, 2.4099F, 9.3755F);
		gun222.addChild(gun223_r1);
		setRotationAngle(gun223_r1, -0.2618F, 0.0F, 0.0F);
		gun223_r1.cubeList.add(new ModelBox(gun223_r1, 308, 457, -0.005F, 0.1046F, -11.9158F, 2, 1, 5, 0.0F, false));
		gun223_r1.cubeList.add(new ModelBox(gun223_r1, 147, 457, -2.495F, 0.1046F, -11.9158F, 3, 1, 5, 0.0F, false));

		gun223_r2 = new ModelRenderer(this);
		gun223_r2.setRotationPoint(2.755F, -1.692F, 21.1855F);
		gun222.addChild(gun223_r2);
		setRotationAngle(gun223_r2, -0.2618F, 0.0F, 0.0F);
		gun223_r2.cubeList.add(new ModelBox(gun223_r2, 96, 457, -2.755F, 8.0167F, -21.8122F, 5, 2, 4, 0.0F, false));

		standard_cover = new ModelRenderer(this);
		standard_cover.setRotationPoint(0.0F, 0.0F, 0.0F);
		stock.addChild(standard_cover);
		standard_cover.cubeList.add(new ModelBox(standard_cover, 179, 465, -0.0745F, -37.1529F, -34.5F, 1, 2, 3, 0.0F, false));
		standard_cover.cubeList.add(new ModelBox(standard_cover, 393, 261, -0.0745F, -37.1529F, -60.5F, 1, 2, 25, 0.0F, false));
		standard_cover.cubeList.add(new ModelBox(standard_cover, 471, 26, -0.1105F, -37.0439F, -35.5F, 1, 2, 1, 0.0F, false));
		standard_cover.cubeList.add(new ModelBox(standard_cover, 453, 470, -2.5F, -39.6F, -35.5F, 2, 1, 1, 0.0F, false));
		standard_cover.cubeList.add(new ModelBox(standard_cover, 467, 470, -3.8918F, -37.0373F, -61.5F, 1, 3, 1, 0.0F, false));
		standard_cover.cubeList.add(new ModelBox(standard_cover, 448, 243, -3.8918F, -37.1373F, -60.5F, 1, 2, 12, 0.0F, false));
		standard_cover.cubeList.add(new ModelBox(standard_cover, 385, 470, -0.1105F, -37.0439F, -61.5F, 1, 3, 1, 0.0F, false));
		standard_cover.cubeList.add(new ModelBox(standard_cover, 460, 470, -2.5F, -39.6F, -61.5F, 2, 1, 1, 0.0F, false));
		standard_cover.cubeList.add(new ModelBox(standard_cover, 469, 426, -2.5023F, -33.6813F, -61.5F, 2, 2, 1, 0.0F, false));

		gun164 = new ModelRenderer(this);
		gun164.setRotationPoint(0.9F, -38.3F, -43.0F);
		standard_cover.addChild(gun164);
		setRotationAngle(gun164, 0.0F, 0.0F, 2.88F);
		gun164.cubeList.add(new ModelBox(gun164, 215, 465, 0.272F, -1.1147F, 8.5F, 1, 1, 3, 0.0F, false));
		gun164.cubeList.add(new ModelBox(gun164, 277, 404, 0.272F, -1.1147F, -17.5F, 1, 1, 25, 0.0F, false));

		gun163 = new ModelRenderer(this);
		gun163.setRotationPoint(0.25F, -40.0F, -43.0F);
		standard_cover.addChild(gun163);
		setRotationAngle(gun163, 0.0F, 0.0F, 1.122F);
		gun163.cubeList.add(new ModelBox(gun163, 224, 465, 0.8757F, 0.4406F, 8.5F, 1, 1, 3, 0.0F, false));
		gun163.cubeList.add(new ModelBox(gun163, 106, 404, 0.8757F, 0.4406F, -17.5F, 1, 1, 25, 0.0F, false));

		gun162 = new ModelRenderer(this);
		gun162.setRotationPoint(-0.5F, -40.7F, -43.0F);
		standard_cover.addChild(gun162);
		setRotationAngle(gun162, 0.0F, 0.0F, 0.748F);
		gun162.cubeList.add(new ModelBox(gun162, 126, 466, 0.6802F, 0.7331F, 8.5F, 1, 1, 3, 0.0F, false));
		gun162.cubeList.add(new ModelBox(gun162, 53, 396, 0.6802F, 0.7331F, -17.5F, 1, 1, 25, 0.0F, false));

		gun161 = new ModelRenderer(this);
		gun161.setRotationPoint(-2.5F, -40.7F, -43.0F);
		standard_cover.addChild(gun161);
		gun161.cubeList.add(new ModelBox(gun161, 391, 464, 0.0F, 1.0F, 8.5F, 2, 1, 3, 0.0F, false));
		gun161.cubeList.add(new ModelBox(gun161, 393, 234, 0.0F, 1.0F, -17.5F, 2, 1, 25, 0.0F, false));

		gun160 = new ModelRenderer(this);
		gun160.setRotationPoint(-2.5F, -40.7F, -43.0F);
		standard_cover.addChild(gun160);
		setRotationAngle(gun160, 0.0F, 0.0F, 0.8228F);
		gun160.cubeList.add(new ModelBox(gun160, 135, 466, 0.7331F, 0.6802F, 8.5F, 1, 1, 3, 0.0F, false));
		gun160.cubeList.add(new ModelBox(gun160, 0, 396, 0.7331F, 0.6802F, -17.5F, 1, 1, 25, 0.0F, false));

		gun159 = new ModelRenderer(this);
		gun159.setRotationPoint(-3.2F, -40.0F, -43.0F);
		standard_cover.addChild(gun159);
		setRotationAngle(gun159, 0.0F, 0.0F, 0.4114F);
		gun159.cubeList.add(new ModelBox(gun159, 158, 466, 0.3617F, 0.9116F, 8.5F, 1, 1, 3, 0.0F, false));
		gun159.cubeList.add(new ModelBox(gun159, 393, 289, 0.3617F, 0.9116F, -17.5F, 1, 1, 25, 0.0F, false));

		gun156 = new ModelRenderer(this);
		gun156.setRotationPoint(-3.2F, -39.9F, -46.0F);
		standard_cover.addChild(gun156);
		setRotationAngle(gun156, 0.0F, 0.0F, 0.4114F);
		gun156.cubeList.add(new ModelBox(gun156, 471, 103, 0.3617F, 0.9116F, 10.5F, 1, 1, 1, 0.0F, false));
		gun156.cubeList.add(new ModelBox(gun156, 183, 471, 0.3617F, 0.9116F, -15.5F, 1, 1, 1, 0.0F, false));
		gun156.cubeList.add(new ModelBox(gun156, 193, 471, 5.1591F, 4.5376F, -15.5F, 1, 1, 1, 0.0F, false));

		gun147 = new ModelRenderer(this);
		gun147.setRotationPoint(-3.8F, -38.2F, -82.0F);
		standard_cover.addChild(gun147);
		setRotationAngle(gun147, 0.0F, 0.0F, -1.309F);
		gun147.cubeList.add(new ModelBox(gun147, 178, 471, -1.1468F, 0.2123F, 20.5F, 1, 1, 1, 0.0F, false));
		gun147.cubeList.add(new ModelBox(gun147, 198, 471, -3.6076F, 4.5536F, 20.5F, 1, 1, 1, 0.0F, false));
		gun147.cubeList.add(new ModelBox(gun147, 188, 471, -1.1468F, 0.2123F, 46.5F, 1, 1, 1, 0.0F, false));
		gun147.cubeList.add(new ModelBox(gun147, 330, 404, -1.0502F, 0.1864F, 21.5F, 1, 1, 25, 0.0F, false));
		gun147.cubeList.add(new ModelBox(gun147, 167, 466, -1.0502F, 0.1864F, 47.5F, 1, 1, 3, 0.0F, false));

		gun142 = new ModelRenderer(this);
		gun142.setRotationPoint(-2.5F, -40.6F, -50.0F);
		standard_cover.addChild(gun142);
		setRotationAngle(gun142, 0.0F, 0.0F, 0.8228F);
		gun142.cubeList.add(new ModelBox(gun142, 471, 106, 0.7331F, 0.6802F, 14.5F, 1, 1, 1, 0.0F, false));
		gun142.cubeList.add(new ModelBox(gun142, 173, 471, 0.7331F, 0.6802F, -11.5F, 1, 1, 1, 0.0F, false));
		gun142.cubeList.add(new ModelBox(gun142, 232, 471, 6.8967F, 3.6019F, -11.5F, 1, 1, 1, 0.0F, false));

		gun138 = new ModelRenderer(this);
		gun138.setRotationPoint(0.2F, -39.9F, -46.0F);
		standard_cover.addChild(gun138);
		setRotationAngle(gun138, 0.0F, 0.0F, 1.122F);
		gun138.cubeList.add(new ModelBox(gun138, 126, 471, 0.8974F, 0.3955F, 10.5F, 1, 1, 1, 0.0F, false));
		gun138.cubeList.add(new ModelBox(gun138, 168, 471, 0.8974F, 0.3955F, -15.5F, 1, 1, 1, 0.0F, false));
		gun138.cubeList.add(new ModelBox(gun138, 471, 45, 4.3015F, 5.366F, -15.5F, 1, 1, 1, 0.0F, false));

		gun124 = new ModelRenderer(this);
		gun124.setRotationPoint(-0.5F, -40.6F, -50.0F);
		standard_cover.addChild(gun124);
		setRotationAngle(gun124, 0.0F, 0.0F, 0.748F);
		gun124.cubeList.add(new ModelBox(gun124, 131, 471, 0.6802F, 0.7331F, 14.5F, 1, 1, 1, 0.0F, false));
		gun124.cubeList.add(new ModelBox(gun124, 163, 471, 0.6802F, 0.7331F, -11.5F, 1, 1, 1, 0.0F, false));
		gun124.cubeList.add(new ModelBox(gun124, 237, 471, 3.5985F, 6.8998F, -11.5F, 1, 1, 1, 0.0F, false));

		gun123 = new ModelRenderer(this);
		gun123.setRotationPoint(0.8F, -38.2F, -82.0F);
		standard_cover.addChild(gun123);
		setRotationAngle(gun123, 0.0F, 0.0F, 2.9172F);
		gun123.cubeList.add(new ModelBox(gun123, 136, 471, 0.17F, -1.147F, 46.5F, 1, 1, 1, 0.0F, false));
		gun123.cubeList.add(new ModelBox(gun123, 158, 471, 0.17F, -1.147F, 20.5F, 1, 1, 1, 0.0F, false));
		gun123.cubeList.add(new ModelBox(gun123, 242, 471, 4.4559F, -3.8193F, 20.5F, 1, 1, 1, 0.0F, false));

		barrel = new ModelRenderer(this);
		barrel.setRotationPoint(0.5F, -2.0F, -5.0F);
		stock.addChild(barrel);
		barrel.cubeList.add(new ModelBox(barrel, 0, 66, -2.5F, -36.75F, -98.5F, 1, 1, 64, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 213, 470, -3.0F, -38.2F, -96.8F, 2, 2, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 291, 464, -3.0F, -34.9F, -98.6F, 2, 2, 3, -0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 220, 470, -3.0F, -38.2F, -97.6F, 2, 2, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 131, 66, -1.7929F, -36.0429F, -98.5F, 1, 1, 64, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 198, -2.5F, -35.3358F, -98.5F, 1, 1, 64, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 132, -3.2071F, -36.0429F, -98.5F, 1, 1, 64, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 151, 470, -2.5F, -36.55F, -100.1F, 1, 1, 2, -0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 114, 470, -1.9343F, -35.9843F, -100.1F, 1, 1, 2, -0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 31, 470, -3.0657F, -35.9843F, -100.1F, 1, 1, 2, -0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 469, 466, -2.5F, -35.4186F, -100.1F, 1, 1, 2, -0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 262, 264, -2.5F, -34.05F, -98.5F, 1, 1, 64, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 264, -1.7929F, -33.3429F, -98.5F, 1, 1, 64, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 262, 198, -3.2071F, -33.3429F, -98.5F, 1, 1, 64, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 262, 66, -2.5F, -32.6358F, -98.5F, 1, 1, 64, 0.0F, false));

		gun164_r1 = new ModelRenderer(this);
		gun164_r1.setRotationPoint(-1.5F, -32.3429F, -96.0F);
		barrel.addChild(gun164_r1);
		setRotationAngle(gun164_r1, 0.0F, 0.0F, 0.7854F);
		gun164_r1.cubeList.add(new ModelBox(gun164_r1, 262, 0, -0.5F, -0.5F, -2.5F, 1, 1, 64, 0.0F, false));

		gun165_r1 = new ModelRenderer(this);
		gun165_r1.setRotationPoint(-2.5F, -32.3429F, -96.0F);
		barrel.addChild(gun165_r1);
		setRotationAngle(gun165_r1, 0.0F, 0.0F, 0.7854F);
		gun165_r1.cubeList.add(new ModelBox(gun165_r1, 262, 132, -0.5F, -0.5F, -2.5F, 1, 1, 64, 0.0F, false));

		gun164_r2 = new ModelRenderer(this);
		gun164_r2.setRotationPoint(-2.5F, -33.3429F, -96.0F);
		barrel.addChild(gun164_r2);
		setRotationAngle(gun164_r2, 0.0F, 0.0F, 0.7854F);
		gun164_r2.cubeList.add(new ModelBox(gun164_r2, 131, 264, -0.5F, -0.5F, -2.5F, 1, 1, 64, 0.0F, false));

		gun163_r1 = new ModelRenderer(this);
		gun163_r1.setRotationPoint(-1.5F, -33.3429F, -96.0F);
		barrel.addChild(gun163_r1);
		setRotationAngle(gun163_r1, 0.0F, 0.0F, 0.7854F);
		gun163_r1.cubeList.add(new ModelBox(gun163_r1, 0, 330, -0.5F, -0.5F, -2.5F, 1, 1, 64, 0.0F, false));

		gun164_r3 = new ModelRenderer(this);
		gun164_r3.setRotationPoint(-1.6F, -35.0843F, -100.6F);
		barrel.addChild(gun164_r3);
		setRotationAngle(gun164_r3, 0.0F, 0.0F, 0.7854F);
		gun164_r3.cubeList.add(new ModelBox(gun164_r3, 469, 462, -0.5F, -0.5F, 0.5F, 1, 1, 2, -0.1F, false));

		gun165_r2 = new ModelRenderer(this);
		gun165_r2.setRotationPoint(-2.4F, -35.0843F, -100.6F);
		barrel.addChild(gun165_r2);
		setRotationAngle(gun165_r2, 0.0F, 0.0F, 0.7854F);
		gun165_r2.cubeList.add(new ModelBox(gun165_r2, 24, 470, -0.5F, -0.5F, 0.5F, 1, 1, 2, -0.1F, false));

		gun164_r4 = new ModelRenderer(this);
		gun164_r4.setRotationPoint(-2.4F, -35.8843F, -100.6F);
		barrel.addChild(gun164_r4);
		setRotationAngle(gun164_r4, 0.0F, 0.0F, 0.7854F);
		gun164_r4.cubeList.add(new ModelBox(gun164_r4, 144, 470, -0.5F, -0.5F, 0.5F, 1, 1, 2, -0.1F, false));

		gun163_r2 = new ModelRenderer(this);
		gun163_r2.setRotationPoint(-1.6F, -35.8843F, -100.6F);
		barrel.addChild(gun163_r2);
		setRotationAngle(gun163_r2, 0.0F, 0.0F, 0.7854F);
		gun163_r2.cubeList.add(new ModelBox(gun163_r2, 206, 470, -0.5F, -0.5F, 0.5F, 1, 1, 2, -0.1F, false));

		gun164_r5 = new ModelRenderer(this);
		gun164_r5.setRotationPoint(-2.5F, -35.0429F, -96.0F);
		barrel.addChild(gun164_r5);
		setRotationAngle(gun164_r5, 0.0F, 0.0F, 0.7854F);
		gun164_r5.cubeList.add(new ModelBox(gun164_r5, 131, 132, -0.5F, -0.5F, -2.5F, 1, 1, 64, 0.0F, false));

		gun163_r3 = new ModelRenderer(this);
		gun163_r3.setRotationPoint(-1.5F, -35.0429F, -96.0F);
		barrel.addChild(gun163_r3);
		setRotationAngle(gun163_r3, 0.0F, 0.0F, 0.7854F);
		gun163_r3.cubeList.add(new ModelBox(gun163_r3, 131, 198, -0.5F, -0.5F, -2.5F, 1, 1, 64, 0.0F, false));

		gun163_r4 = new ModelRenderer(this);
		gun163_r4.setRotationPoint(-2.5F, -36.0429F, -96.0F);
		barrel.addChild(gun163_r4);
		setRotationAngle(gun163_r4, 0.0F, 0.0F, 0.7854F);
		gun163_r4.cubeList.add(new ModelBox(gun163_r4, 131, 0, -0.5F, -0.5F, -2.5F, 1, 1, 64, 0.0F, false));

		gun162_r1 = new ModelRenderer(this);
		gun162_r1.setRotationPoint(-1.5F, -36.0429F, -96.0F);
		barrel.addChild(gun162_r1);
		setRotationAngle(gun162_r1, 0.0F, 0.0F, 0.7854F);
		gun162_r1.cubeList.add(new ModelBox(gun162_r1, 0, 0, -0.5F, -0.5F, -2.5F, 1, 1, 64, 0.0F, false));

		ironsights = new ModelRenderer(this);
		ironsights.setRotationPoint(-0.5F, -38.2F, -50.7F);
		barrel.addChild(ironsights);
		ironsights.cubeList.add(new ModelBox(ironsights, 471, 41, -2.0F, -1.4F, -46.55F, 1, 2, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 257, 471, -2.0F, -0.5F, -46.55F, 1, 1, 1, -0.2F, false));

		ironsights_r1 = new ModelRenderer(this);
		ironsights_r1.setRotationPoint(-0.8888F, -1.198F, -39.7F);
		ironsights.addChild(ironsights_r1);
		setRotationAngle(ironsights_r1, 0.0F, 0.0F, 0.3491F);
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 47, 468, 0.2093F, -0.5132F, -7.0F, 1, 2, 2, -0.4F, false));
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 54, 468, 0.2093F, -0.5132F, -7.6F, 1, 2, 2, -0.4F, false));

		ironsights_r2 = new ModelRenderer(this);
		ironsights_r2.setRotationPoint(-2.1112F, -1.198F, -39.7F);
		ironsights.addChild(ironsights_r2);
		setRotationAngle(ironsights_r2, 0.0F, 0.0F, -0.3491F);
		ironsights_r2.cubeList.add(new ModelBox(ironsights_r2, 61, 468, -1.1858F, -0.5047F, -7.0F, 1, 2, 2, -0.4F, false));
		ironsights_r2.cubeList.add(new ModelBox(ironsights_r2, 68, 468, -1.1858F, -0.5047F, -7.6F, 1, 2, 2, -0.4F, false));
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