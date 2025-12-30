package com.paneedah.mwc.models;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBZ95Defender extends ModelBase {
	private final ModelRenderer defender;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer bone50;
	private final ModelRenderer cube_r121;
	private final ModelRenderer cube_r122;

	public QBZ95Defender() {
		textureWidth = 368;
		textureHeight = 368;

		defender = new ModelRenderer(this);
		defender.setRotationPoint(0.0F, 24.2F, -3.0F);
		defender.cubeList.add(new ModelBox(defender, 143, 338, -0.7071F, -48.1071F, 11.3F, 1, 11, 3, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 340, 250, -3.2929F, -48.1071F, 11.3F, 1, 11, 3, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 0, 304, -3.2929F, -39.8071F, -8.7F, 1, 2, 20, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 159, 302, -0.7071F, -39.8071F, -8.7F, 1, 2, 20, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 348, 204, -0.7071F, -43.8071F, -29.7F, 1, 4, 2, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 256, 340, -3.2929F, -43.8071F, -29.7F, 1, 4, 2, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 348, 107, -0.7071F, -42.6321F, -32.1F, 1, 3, 3, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 348, 100, -3.2929F, -42.6321F, -32.1F, 1, 3, 3, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 309, 342, -0.7071F, -48.1071F, 10.4F, 1, 3, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 76, 353, -3.2929F, -48.1071F, 10.4F, 1, 3, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 359, 282, -0.7071F, -48.1071F, 13.5F, 1, 1, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 313, 359, -3.2929F, -48.1071F, 13.5F, 1, 1, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 356, 40, -0.707F, -46.007F, -1.7F, 1, 2, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 43, 356, -3.293F, -46.007F, -1.7F, 1, 2, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 48, 356, -0.707F, -46.007F, -3.7F, 1, 2, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 356, 44, -3.293F, -46.007F, -3.7F, 1, 2, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 356, 52, -0.707F, -46.007F, -5.7F, 1, 2, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 356, 48, -3.293F, -46.007F, -5.7F, 1, 2, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 356, 72, -0.707F, -46.007F, -7.7F, 1, 2, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 356, 68, -3.293F, -46.007F, -7.7F, 1, 2, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 356, 64, -3.293F, -46.007F, -9.7F, 1, 2, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 356, 60, -0.707F, -46.007F, -9.7F, 1, 2, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 60, 356, -3.293F, -46.007F, -11.7F, 1, 2, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 356, 56, -0.707F, -46.007F, -11.7F, 1, 2, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 201, 356, -0.707F, -46.007F, -13.7F, 1, 2, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 196, 356, -3.293F, -46.007F, -13.7F, 1, 2, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 191, 356, -3.293F, -46.007F, -15.7F, 1, 2, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 186, 356, -0.707F, -46.007F, -15.7F, 1, 2, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 181, 356, -3.293F, -46.007F, -17.7F, 1, 2, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 132, 356, -0.707F, -46.007F, -17.7F, 1, 2, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 356, 118, -0.707F, -46.007F, -23.7F, 1, 2, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 356, 88, -3.293F, -46.007F, -23.7F, 1, 2, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 211, 356, -3.293F, -46.007F, -25.7F, 1, 2, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 206, 356, -0.707F, -46.007F, -25.7F, 1, 2, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 229, 356, -3.2929F, -46.0071F, -27.7F, 1, 2, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 224, 356, -0.7071F, -46.0071F, -27.7F, 1, 2, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 356, 84, -0.707F, -46.007F, -21.7F, 1, 2, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 81, 356, -3.293F, -46.007F, -21.7F, 1, 2, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 356, 80, -3.293F, -46.007F, -19.7F, 1, 2, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 356, 76, -0.707F, -46.007F, -19.7F, 1, 2, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 357, 162, -0.7071F, -39.7071F, -15.7F, 1, 2, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 357, 158, -3.2929F, -39.7071F, -15.7F, 1, 2, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 357, 154, -3.2929F, -39.7071F, -18.7F, 1, 2, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 357, 150, -0.7071F, -39.7071F, -18.7F, 1, 2, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 357, 146, -3.2929F, -39.7071F, -20.7F, 1, 2, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 357, 142, -0.7071F, -39.7071F, -20.7F, 1, 2, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 357, 128, -0.7071F, -39.7071F, -13.7F, 1, 2, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 357, 108, -3.2929F, -39.7071F, -13.7F, 1, 2, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 357, 104, -0.7071F, -39.7071F, -10.7F, 1, 2, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 357, 100, -3.2929F, -39.7071F, -10.7F, 1, 2, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 263, 356, -0.7071F, -39.7071F, -23.7F, 1, 2, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 258, 356, -3.2929F, -39.7071F, -23.7F, 1, 2, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 239, 356, -0.7071F, -39.7071F, -25.7F, 1, 2, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 234, 356, -3.2929F, -39.7071F, -25.7F, 1, 2, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 357, 170, -3.2929F, -39.7071F, -28.7F, 1, 2, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 357, 166, -0.7071F, -39.7071F, -28.7F, 1, 2, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 353, 342, -3.2929F, -39.7071F, -31.7F, 1, 2, 2, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 353, 337, -0.7071F, -39.7071F, -31.7F, 1, 2, 2, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 357, 178, -3.2929F, -39.7071F, -32.1F, 1, 2, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 357, 174, -0.7071F, -39.7071F, -32.1F, 1, 2, 1, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 214, 327, -0.7071F, -46.0071F, 0.3F, 1, 2, 11, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 210, 280, -3.2929F, -46.0071F, 0.3F, 1, 2, 11, 0.0F, false));
		defender.cubeList.add(new ModelBox(defender, 246, 220, -1.4071F, -46.3071F, -27.4F, 2, 1, 28, -0.3F, false));
		defender.cubeList.add(new ModelBox(defender, 246, 190, -3.5929F, -46.3071F, -27.4F, 2, 1, 28, -0.3F, false));
		defender.cubeList.add(new ModelBox(defender, 61, 248, -1.4071F, -44.7071F, -27.4F, 2, 1, 28, -0.3F, false));
		defender.cubeList.add(new ModelBox(defender, 0, 248, -3.5929F, -44.7071F, -27.4F, 2, 1, 28, -0.3F, false));
		defender.cubeList.add(new ModelBox(defender, 53, 278, -1.4071F, -40.1071F, -32.4F, 2, 1, 24, -0.3F, false));
		defender.cubeList.add(new ModelBox(defender, 0, 278, -3.5929F, -40.1071F, -32.4F, 2, 1, 24, -0.3F, false));
		defender.cubeList.add(new ModelBox(defender, 106, 280, -3.5929F, -38.6071F, -32.4F, 2, 1, 24, -0.3F, false));
		defender.cubeList.add(new ModelBox(defender, 236, 279, -1.4071F, -38.6071F, -32.4F, 2, 1, 24, -0.3F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.5F, -46.7031F, 10.1222F);
		defender.addChild(cube_r1);
		setRotationAngle(cube_r1, -3.0107F, 0.0F, 3.1416F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 38, 356, 0.7929F, -1.0878F, -0.4969F, 1, 2, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 356, 36, -1.7929F, -1.0878F, -0.4969F, 1, 2, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.5F, -36.8002F, 11.64F);
		defender.addChild(cube_r2);
		setRotationAngle(cube_r2, -2.1817F, 0.0F, 3.1416F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 33, 356, -1.7929F, -2.404F, 2.3778F, 1, 2, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 356, 32, 0.7929F, -2.404F, 2.3778F, 1, 2, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1.5F, -45.2002F, 13.84F);
		defender.addChild(cube_r3);
		setRotationAngle(cube_r3, 2.2689F, 0.0F, 3.1416F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 356, 28, -1.7929F, -2.404F, 2.3778F, 1, 2, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 28, 356, 0.7929F, -2.404F, 2.3778F, 1, 2, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-4.0858F, -46.7031F, 10.1278F);
		defender.addChild(cube_r4);
		setRotationAngle(cube_r4, -3.1416F, 0.0F, 3.1416F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 323, 359, -1.7929F, -1.404F, -0.6222F, 1, 1, 1, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.5F, -46.7031F, 10.1222F);
		defender.addChild(cube_r5);
		setRotationAngle(cube_r5, -3.1416F, 0.0F, 3.1416F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 318, 359, -1.7929F, -1.404F, -0.6222F, 1, 1, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-1.5F, -43.19F, 13.5792F);
		defender.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.1309F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 284, 311, -1.7929F, -4.5F, 0.5F, 1, 4, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 284, 305, 0.7929F, -4.5F, 0.5F, 1, 4, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.5F, -43.6919F, -29.0746F);
		defender.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.9163F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 19, 340, -1.7929F, 2.05F, -1.0F, 1, 1, 2, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 53, 354, 0.7929F, 2.05F, -1.0F, 1, 1, 2, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 229, 294, -1.7929F, -2.5F, -1.0F, 1, 5, 2, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 81, 348, 0.7929F, -2.5F, -1.0F, 1, 5, 2, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-1.5F, -38.9918F, -29.8746F);
		defender.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.9163F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 361, 66, -1.7929F, -2.5F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 68, 361, 0.7929F, -2.5F, 0.0F, 1, 1, 1, 0.0F, false));

		bone50 = new ModelRenderer(this);
		bone50.setRotationPoint(-1.4737F, -55.9631F, -2.9368F);
		defender.addChild(bone50);
		setRotationAngle(bone50, 0.0F, 0.0F, 0.0F);
		bone50.cubeList.add(new ModelBox(bone50, 293, 358, -0.0238F, 8.7368F, -5.6132F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 298, 358, -0.0238F, 8.7368F, -6.8132F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 303, 358, -0.0238F, 8.7368F, -4.3632F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 308, 358, -0.0238F, 8.7368F, -3.1132F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 332, 358, -0.0238F, 8.7368F, -1.8632F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 337, 358, -0.0238F, 8.7368F, -0.6132F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 342, 358, -0.0238F, 8.7368F, 0.6368F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 347, 358, -0.0238F, 8.7368F, 3.1368F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 352, 358, -0.0238F, 8.7368F, 1.8868F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 5, 359, -1.0213F, 8.7344F, 3.1378F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 10, 359, -1.0213F, 8.7344F, 1.8878F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 15, 359, -1.0213F, 8.7344F, -0.6122F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 20, 359, -1.0213F, 8.7344F, 0.6378F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 359, 95, -1.0213F, 8.7344F, -1.8622F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 101, 359, -1.0213F, 8.7344F, -3.1122F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 106, 359, -1.0213F, 8.7344F, -4.3622F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 111, 359, -1.0213F, 8.7344F, -5.6122F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 359, 112, -1.0213F, 8.7344F, -6.8122F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 361, 60, -0.0238F, 8.7368F, -24.2132F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 361, 57, -0.0238F, 8.7368F, -24.7632F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 361, 54, -0.0238F, 8.7368F, -22.9632F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 361, 51, -0.0238F, 8.7368F, -21.7132F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 50, 361, -0.0238F, 8.7368F, -20.4632F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 361, 48, -0.0238F, 8.7368F, -19.2132F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 361, 45, -0.0238F, 8.7368F, -17.9632F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 361, 42, -0.0238F, 8.7368F, -15.4632F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 361, 39, -0.0238F, 8.7368F, -16.7132F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 361, 36, -0.0238F, 8.7368F, -12.9632F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 361, 33, -0.0238F, 8.7368F, -14.2132F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 73, 361, -0.0238F, 8.7368F, -10.4632F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 361, 30, -0.0238F, 8.7368F, -11.7132F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 361, 27, -0.0238F, 8.7368F, -7.9632F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 361, 24, -0.0238F, 8.7368F, -9.2132F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 361, 21, -1.0213F, 8.7344F, -7.9622F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 361, 18, -1.0213F, 8.7344F, -9.2122F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 361, 72, -1.0213F, 8.7344F, -10.4622F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 361, 15, -1.0213F, 8.7344F, -11.7122F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 102, 347, -1.0213F, 8.7344F, -12.9622F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 361, 12, -1.0213F, 8.7344F, -14.2122F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 361, 9, -1.0213F, 8.7344F, -15.4622F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 361, 6, -1.0213F, 8.7344F, -16.7122F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 361, 3, -1.0213F, 8.7344F, -19.2122F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 361, 0, -1.0213F, 8.7344F, -17.9622F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 357, 360, -1.0213F, 8.7344F, -20.4622F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 360, 343, -1.0213F, 8.7344F, -21.7122F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 360, 340, -1.0213F, 8.7344F, -22.9622F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 360, 337, -1.0213F, 8.7344F, -24.2122F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 360, 317, -1.0213F, 8.7344F, -24.7622F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 246, 128, -0.1738F, 9.3368F, -24.5632F, 1, 1, 29, -0.001F, false));
		bone50.cubeList.add(new ModelBox(bone50, 246, 159, -0.8738F, 9.3368F, -24.5632F, 1, 1, 29, 0.0F, false));
		bone50.cubeList.add(new ModelBox(bone50, 332, 358, -0.0238F, 8.7368F, 4.4368F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 337, 358, -0.0238F, 8.7368F, 5.6868F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 342, 358, -0.0238F, 8.7368F, 6.9368F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 347, 358, -0.0238F, 8.7368F, 9.4368F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 352, 358, -0.0238F, 8.7368F, 8.1868F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 357, 191, -0.0238F, 8.7368F, 9.9368F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 0, 359, -1.0213F, 8.7344F, 9.9378F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 5, 359, -1.0213F, 8.7344F, 9.4378F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 10, 359, -1.0213F, 8.7344F, 8.1878F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 15, 359, -1.0213F, 8.7344F, 5.6878F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 20, 359, -1.0213F, 8.7344F, 6.9378F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 359, 95, -1.0213F, 8.7344F, 4.4378F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 268, 150, -0.1738F, 9.3368F, 3.7368F, 1, 1, 7, -0.001F, false));
		bone50.cubeList.add(new ModelBox(bone50, 268, 181, -0.8738F, 9.3368F, 3.7368F, 1, 1, 7, 0.0F, false));

		cube_r121 = new ModelRenderer(this);
		cube_r121.setRotationPoint(-14.7737F, -0.3632F, -12.4632F);
		bone50.addChild(cube_r121);
		setRotationAngle(cube_r121, 0.0F, 0.0F, 0.8901F);
		cube_r121.cubeList.add(new ModelBox(cube_r121, 359, 115, 15.8063F, -5.1883F, 14.35F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 359, 132, 15.8063F, -5.1883F, 15.6F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 359, 135, 15.8063F, -5.1883F, 13.1F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 359, 138, 15.8063F, -5.1883F, 11.85F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 157, 359, 15.8063F, -5.1883F, 10.6F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 357, 194, 15.8063F, -5.1883F, 22.4F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 359, 115, 15.8063F, -5.1883F, 20.65F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 359, 132, 15.8063F, -5.1883F, 21.9F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 359, 135, 15.8063F, -5.1883F, 19.4F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 359, 138, 15.8063F, -5.1883F, 18.15F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 157, 359, 15.8063F, -5.1883F, 16.9F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 162, 359, 15.8063F, -5.1883F, 9.35F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 167, 359, 15.8068F, -5.1894F, 8.102F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 359, 212, 15.8068F, -5.1894F, 6.852F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 359, 215, 15.8068F, -5.1894F, 5.652F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 360, 314, 15.8063F, -5.1883F, 3.25F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 360, 311, 15.8063F, -5.1883F, 4.5F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 360, 295, 15.8063F, -5.1883F, 0.75F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 259, 360, 15.8063F, -5.1883F, 2.0F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 254, 360, 15.8063F, -5.1883F, -1.75F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 236, 360, 15.8063F, -5.1883F, -0.5F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 231, 360, 15.8063F, -5.1883F, -4.25F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 226, 360, 15.8063F, -5.1883F, -3.0F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 221, 360, 15.8063F, -5.1883F, -5.5F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 208, 360, 15.8063F, -5.1883F, -6.75F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 203, 360, 15.8063F, -5.1883F, -8.0F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 198, 360, 15.8063F, -5.1883F, -9.25F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 193, 360, 15.8068F, -5.1894F, -10.498F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 188, 360, 15.8068F, -5.1894F, -11.748F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 183, 360, 15.8068F, -5.1894F, -12.298F, 1, 1, 1, -0.198F, false));

		cube_r122 = new ModelRenderer(this);
		cube_r122.setRotationPoint(-13.1737F, -0.3632F, -12.4632F);
		bone50.addChild(cube_r122);
		setRotationAngle(cube_r122, 0.0F, 0.0F, -0.8901F);
		cube_r122.cubeList.add(new ModelBox(cube_r122, 361, 63, 0.7516F, 16.4939F, 4.5F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 63, 361, 0.7516F, 16.4939F, 3.25F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 359, 218, 0.7516F, 16.4939F, 14.35F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 359, 221, 0.7516F, 16.4939F, 15.6F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 359, 224, 0.7516F, 16.4939F, 13.1F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 359, 227, 0.7516F, 16.4939F, 11.85F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 244, 359, 0.7516F, 16.4939F, 10.6F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 357, 197, 0.7516F, 16.4939F, 22.4F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 359, 218, 0.7516F, 16.4939F, 20.65F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 359, 221, 0.7516F, 16.4939F, 21.9F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 359, 224, 0.7516F, 16.4939F, 19.4F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 359, 227, 0.7516F, 16.4939F, 18.15F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 244, 359, 0.7516F, 16.4939F, 16.9F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 249, 359, 0.7516F, 16.4939F, 9.35F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 359, 273, 0.7516F, 16.4939F, 8.1F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 359, 276, 0.7516F, 16.4939F, 6.85F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 359, 279, 0.7516F, 16.4939F, 5.65F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 178, 360, 0.7516F, 16.4939F, 0.75F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 131, 360, 0.7516F, 16.4939F, 2.0F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 360, 125, 0.7516F, 16.4939F, -1.75F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 80, 360, 0.7516F, 16.4939F, -0.5F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 58, 360, 0.7516F, 16.4939F, -4.25F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 45, 360, 0.7516F, 16.4939F, -3.0F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 40, 360, 0.7516F, 16.4939F, -5.5F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 35, 360, 0.7516F, 16.4939F, -6.75F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 30, 360, 0.7516F, 16.4939F, -8.0F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 25, 360, 0.7516F, 16.4939F, -9.25F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 359, 334, 0.7516F, 16.4939F, -10.5F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 359, 331, 0.7516F, 16.4939F, -11.75F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 359, 328, 0.7516F, 16.4939F, -12.3F, 1, 1, 1, -0.198F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		defender.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}