package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBZ95Longbow extends ModelBase {
	private final ModelRenderer longbow;
	private final ModelRenderer cube_r1;
	private final ModelRenderer bone50;
	private final ModelRenderer cube_r121;
	private final ModelRenderer cube_r122;
	private final ModelRenderer base;
	private final ModelRenderer upperhandguard2;
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
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;

	public QBZ95Longbow() {
		textureWidth = 464;
		textureHeight = 464;

		longbow = new ModelRenderer(this);
		longbow.setRotationPoint(0.0F, 24.2F, -3.0F);
		longbow.cubeList.add(new ModelBox(longbow, 376, 191, -1.0F, -46.0F, -11.0F, 1, 1, 20, 0.0F, false));
		longbow.cubeList.add(new ModelBox(longbow, 376, 213, -3.0F, -46.0F, -11.0F, 1, 1, 20, 0.0F, false));
		longbow.cubeList.add(new ModelBox(longbow, 64, 413, -3.0F, -44.0F, -2.0F, 1, 1, 11, 0.0F, false));
		longbow.cubeList.add(new ModelBox(longbow, 0, 413, -1.0F, -44.0F, -2.0F, 1, 1, 11, 0.0F, false));
		longbow.cubeList.add(new ModelBox(longbow, 288, 448, -3.0F, -45.0F, 8.0F, 1, 1, 1, 0.0F, false));
		longbow.cubeList.add(new ModelBox(longbow, 283, 448, -1.0F, -45.0F, 8.0F, 1, 1, 1, 0.0F, false));
		longbow.cubeList.add(new ModelBox(longbow, 298, 448, -3.0F, -45.0F, 6.0F, 1, 1, 1, 0.0F, false));
		longbow.cubeList.add(new ModelBox(longbow, 293, 448, -1.0F, -45.0F, 6.0F, 1, 1, 1, 0.0F, false));
		longbow.cubeList.add(new ModelBox(longbow, 308, 448, -3.0F, -45.0F, -2.0F, 1, 1, 1, 0.0F, false));
		longbow.cubeList.add(new ModelBox(longbow, 303, 448, -1.0F, -45.0F, -2.0F, 1, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.5F, -44.367F, -3.5431F);
		longbow.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.48F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 61, 443, -1.5F, -1.4F, -0.5F, 1, 1, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 68, 443, 0.5F, -1.4F, -0.5F, 1, 1, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 313, 448, -1.5F, -0.5F, -2.6F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 448, 348, 0.5F, -0.5F, -2.6F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 429, 94, 0.5F, -0.5F, -2.0F, 1, 1, 4, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 429, 100, -1.5F, -0.5F, -2.0F, 1, 1, 4, 0.0F, false));

		bone50 = new ModelRenderer(this);
		bone50.setRotationPoint(-1.4737F, -55.9631F, -2.9368F);
		longbow.addChild(bone50);
		setRotationAngle(bone50, 0.0F, 0.0F, 0.0F);
		bone50.cubeList.add(new ModelBox(bone50, 447, 186, -0.0238F, 8.7368F, -5.6132F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 447, 189, -0.0238F, 8.7368F, -6.8132F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 191, 447, -0.0238F, 8.7368F, -4.3632F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 447, 192, -0.0238F, 8.7368F, -3.1132F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 447, 195, -0.0238F, 8.7368F, -1.8632F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 196, 447, -0.0238F, 8.7368F, -0.6132F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 447, 198, -0.0238F, 8.7368F, 0.6368F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 449, 116, -0.0238F, 8.7368F, 3.1368F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 447, 201, -0.0238F, 8.7368F, 1.8868F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 447, 204, -0.0238F, 8.7368F, 5.6368F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 447, 207, -0.0238F, 8.7368F, 4.3868F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 447, 210, -0.0238F, 8.7368F, 8.1368F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 447, 213, -0.0238F, 8.7368F, 6.8868F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 214, 447, -0.0238F, 8.7368F, 10.6368F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 447, 216, -0.0238F, 8.7368F, 9.3868F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 219, 447, -1.0213F, 8.7344F, 10.6378F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 449, 141, -1.0213F, 8.7344F, 9.3878F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 447, 219, -1.0213F, 8.7344F, 8.1378F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 447, 222, -1.0213F, 8.7344F, 6.8878F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 447, 225, -1.0213F, 8.7344F, 5.6378F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 449, 128, -1.0213F, 8.7344F, 4.3878F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 447, 228, -1.0213F, 8.7344F, 3.1378F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 447, 266, -1.0213F, 8.7344F, 1.8878F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 268, 447, -1.0213F, 8.7344F, -0.6122F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 447, 269, -1.0213F, 8.7344F, 0.6378F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 447, 297, -1.0213F, 8.7344F, -1.8622F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 447, 300, -1.0213F, 8.7344F, -3.1122F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 447, 303, -1.0213F, 8.7344F, -4.3622F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 447, 306, -1.0213F, 8.7344F, -5.6122F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 447, 309, -1.0213F, 8.7344F, -6.8122F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 43, 391, -0.1738F, 9.3368F, -7.5632F, 1, 1, 19, -0.001F, false));
		bone50.cubeList.add(new ModelBox(bone50, 84, 392, -0.8738F, 9.3368F, -7.5632F, 1, 1, 19, 0.0F, false));

		cube_r121 = new ModelRenderer(this);
		cube_r121.setRotationPoint(-14.7737F, -0.3632F, -12.4632F);
		bone50.addChild(cube_r121);
		setRotationAngle(cube_r121, 0.0F, 0.0F, 0.8901F);
		cube_r121.cubeList.add(new ModelBox(cube_r121, 447, 312, 15.8063F, -5.1883F, 21.85F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 447, 315, 15.8063F, -5.1883F, 23.1F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 447, 318, 15.8063F, -5.1883F, 19.35F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 447, 321, 15.8063F, -5.1883F, 20.6F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 447, 324, 15.8063F, -5.1883F, 16.85F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 447, 327, 15.8063F, -5.1883F, 18.1F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 447, 330, 15.8063F, -5.1883F, 14.35F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 131, 449, 15.8063F, -5.1883F, 15.6F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 447, 333, 15.8063F, -5.1883F, 13.1F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 336, 447, 15.8063F, -5.1883F, 11.85F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 447, 336, 15.8063F, -5.1883F, 10.6F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 447, 339, 15.8063F, -5.1883F, 9.35F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 447, 342, 15.8068F, -5.1894F, 8.102F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 447, 345, 15.8068F, -5.1894F, 6.852F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 447, 425, 15.8068F, -5.1894F, 5.652F, 1, 1, 1, -0.198F, false));

		cube_r122 = new ModelRenderer(this);
		cube_r122.setRotationPoint(-13.1737F, -0.3632F, -12.4632F);
		bone50.addChild(cube_r122);
		setRotationAngle(cube_r122, 0.0F, 0.0F, -0.8901F);
		cube_r122.cubeList.add(new ModelBox(cube_r122, 447, 428, 0.7516F, 16.4939F, 21.85F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 447, 431, 0.7516F, 16.4939F, 23.1F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 447, 443, 0.7516F, 16.4939F, 19.35F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 85, 448, 0.7516F, 16.4939F, 20.6F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 448, 132, 0.7516F, 16.4939F, 16.85F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 448, 135, 0.7516F, 16.4939F, 18.1F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 448, 138, 0.7516F, 16.4939F, 14.35F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 136, 449, 0.7516F, 16.4939F, 15.6F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 207, 448, 0.7516F, 16.4939F, 13.1F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 224, 448, 0.7516F, 16.4939F, 11.85F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 448, 272, 0.7516F, 16.4939F, 10.6F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 273, 448, 0.7516F, 16.4939F, 9.35F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 448, 275, 0.7516F, 16.4939F, 8.1F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 278, 448, 0.7516F, 16.4939F, 6.85F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 448, 278, 0.7516F, 16.4939F, 5.65F, 1, 1, 1, -0.198F, false));

		base = new ModelRenderer(this);
		base.setRotationPoint(0.0F, -0.2F, 3.0F);
		longbow.addChild(base);
		

		upperhandguard2 = new ModelRenderer(this);
		upperhandguard2.setRotationPoint(0.0F, 0.0F, 0.0F);
		base.addChild(upperhandguard2);
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 246, 96, -0.7071F, -37.9071F, -34.7F, 1, 1, 46, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 246, 144, -3.2929F, -37.9071F, -34.7F, 1, 1, 46, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 341, 57, -0.4071F, -39.5071F, -17.35F, 1, 1, 26, -0.3F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 341, 113, -0.8071F, -39.5071F, -17.35F, 1, 1, 26, -0.3F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 341, 29, -3.5929F, -39.5071F, -17.35F, 1, 1, 26, -0.3F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 341, 85, -3.1929F, -39.5071F, -17.35F, 1, 1, 26, -0.3F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 396, 119, -2.4071F, -41.5921F, -32.4897F, 3, 1, 14, -0.3F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 254, 401, -3.5929F, -41.5921F, -32.4897F, 2, 1, 14, -0.3F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 205, 438, -3.5929F, -41.5921F, -33.3897F, 2, 2, 2, -0.3F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 0, 434, -2.4071F, -41.5921F, -33.3897F, 3, 2, 2, -0.3F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 268, 444, -3.5929F, -40.5921F, -32.1897F, 2, 1, 1, -0.3F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 253, 440, -2.4071F, -40.5921F, -32.1897F, 3, 1, 1, -0.3F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 444, 0, -3.5929F, -39.4921F, -18.5897F, 2, 1, 1, -0.3F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 440, 129, -2.4071F, -39.4921F, -18.5897F, 3, 1, 1, -0.3F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 110, 443, -0.4071F, -41.0106F, -34.9872F, 1, 1, 2, -0.3F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 103, 443, -3.5929F, -41.0106F, -34.9872F, 1, 1, 2, -0.3F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 124, 443, -3.5929F, -40.8106F, -34.9872F, 1, 1, 2, -0.3F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 117, 443, -0.4071F, -40.8106F, -34.9872F, 1, 1, 2, -0.3F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 438, 213, -3.5929F, -40.5921F, -34.9897F, 1, 1, 3, -0.3F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 438, 208, -0.4071F, -40.5921F, -34.9897F, 1, 1, 3, -0.3F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 449, 88, -3.4929F, -41.0921F, -33.8897F, 1, 1, 1, -0.2F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 449, 85, -0.5071F, -41.0921F, -33.8897F, 1, 1, 1, -0.2F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 293, 434, -2.4071F, -41.8921F, -20.4397F, 3, 1, 2, -0.3F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 345, 439, -3.5929F, -41.8921F, -20.4397F, 2, 1, 2, -0.3F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 0, 393, -3.5929F, -39.5921F, -34.9897F, 1, 1, 18, -0.3F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 392, 256, -0.4071F, -39.5921F, -34.9897F, 1, 1, 18, -0.3F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 15, 426, -0.7071F, -47.9071F, 8.3F, 1, 9, 3, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 391, 424, -3.2929F, -47.9071F, 8.3F, 1, 9, 3, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 258, 444, -0.7071F, -47.9071F, 7.4F, 1, 3, 1, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 444, 62, -3.2929F, -47.9071F, 7.4F, 1, 3, 1, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 360, 448, -0.7071F, -47.9071F, 10.5F, 1, 1, 1, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 355, 448, -3.2929F, -47.9071F, 10.5F, 1, 1, 1, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 293, 438, -0.7071F, -45.8071F, 6.3F, 1, 3, 2, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 438, 291, -3.2929F, -45.8071F, 6.3F, 1, 3, 2, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 448, 351, -2.9929F, -39.9071F, -32.1F, 1, 1, 1, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 448, 354, -1.0071F, -39.9071F, -32.1F, 1, 1, 1, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 431, 33, -1.0071F, -40.9071F, -35.0F, 1, 4, 3, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 409, 429, -2.9929F, -40.9071F, -35.0F, 1, 4, 3, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 445, 175, -0.7071F, -38.9071F, -25.0F, 1, 2, 1, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 445, 179, -3.2929F, -38.9071F, -25.0F, 1, 2, 1, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 445, 434, -0.7071F, -38.9071F, -30.0F, 1, 2, 1, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 445, 416, -3.2929F, -38.9071F, -30.0F, 1, 2, 1, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 202, 446, -0.7071F, -38.9071F, -33.0F, 1, 2, 1, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 90, 446, -3.2929F, -38.9071F, -33.0F, 1, 2, 1, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 229, 445, -0.7071F, -38.9071F, 4.25F, 1, 2, 1, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 234, 445, -3.2929F, -38.9071F, 4.25F, 1, 2, 1, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 429, 57, -0.7071F, -38.9071F, 7.0F, 1, 2, 4, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 429, 83, -3.2929F, -38.9071F, 7.0F, 1, 2, 4, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 445, 289, -0.7071F, -38.9071F, -0.75F, 1, 2, 1, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 445, 285, -3.2929F, -38.9071F, -0.75F, 1, 2, 1, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 445, 259, -0.7071F, -38.9071F, -3.5F, 1, 2, 1, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 445, 251, -3.2929F, -38.9071F, -3.5F, 1, 2, 1, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 445, 395, -0.7071F, -38.9071F, -8.5F, 1, 2, 1, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 331, 445, -3.2929F, -38.9071F, -8.5F, 1, 2, 1, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 326, 445, -3.2929F, -38.9071F, -11.25F, 1, 2, 1, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 445, 293, -0.7071F, -38.9071F, -11.25F, 1, 2, 1, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 178, 426, -3.2929F, -38.9071F, -20.25F, 1, 2, 5, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 100, 426, -0.7071F, -38.9071F, -20.25F, 1, 2, 5, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-2.6284F, -44.3071F, 6.0582F);
		upperhandguard2.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, -0.4363F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 224, 443, -0.5F, -1.5F, -0.5F, 1, 3, 1, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-0.3716F, -44.3071F, 6.0582F);
		upperhandguard2.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.4363F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 384, 443, -0.5F, -1.5F, -0.5F, 1, 3, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-1.5F, -46.5031F, 7.1222F);
		upperhandguard2.addChild(cube_r6);
		setRotationAngle(cube_r6, -3.0107F, 0.0F, 3.1416F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 239, 445, 0.7929F, -1.0878F, -0.4969F, 1, 2, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 445, 247, -1.7929F, -1.0878F, -0.4969F, 1, 2, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.5F, -36.2002F, 8.64F);
		upperhandguard2.addChild(cube_r7);
		setRotationAngle(cube_r7, -2.1817F, 0.0F, 3.1416F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 320, 446, -1.7929F, -2.404F, 2.3778F, 1, 2, 1, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 345, 446, 0.7929F, -2.404F, 2.3778F, 1, 2, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-1.5F, -44.0002F, 10.84F);
		upperhandguard2.addChild(cube_r8);
		setRotationAngle(cube_r8, 2.2689F, 0.0F, 3.1416F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 244, 446, -1.7929F, -2.404F, 2.3778F, 1, 2, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 249, 446, 0.7929F, -2.404F, 2.3778F, 1, 2, 1, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-1.5F, -43.8002F, -12.26F);
		upperhandguard2.addChild(cube_r9);
		setRotationAngle(cube_r9, 2.2689F, 0.0F, 3.1416F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 445, 399, 0.7929F, -2.404F, 6.3778F, 1, 2, 1, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 445, 403, -1.7929F, -2.404F, 6.3778F, 1, 2, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-1.7F, -34.5267F, -14.6191F);
		upperhandguard2.addChild(cube_r10);
		setRotationAngle(cube_r10, 2.5307F, 0.0F, 3.1416F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 448, 384, 0.7929F, -9.404F, 0.5778F, 1, 1, 1, -0.2F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 384, 448, 0.7929F, -9.404F, 0.2778F, 1, 1, 1, -0.2F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-1.3F, -34.5267F, -14.6191F);
		upperhandguard2.addChild(cube_r11);
		setRotationAngle(cube_r11, 2.5307F, 0.0F, 3.1416F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 448, 387, -1.7929F, -9.404F, 0.5778F, 1, 1, 1, -0.2F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 448, 381, -1.7929F, -9.404F, 0.2778F, 1, 1, 1, -0.2F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-1.5F, -44.3002F, -14.26F);
		upperhandguard2.addChild(cube_r12);
		setRotationAngle(cube_r12, 2.5307F, 0.0F, 3.1416F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 45, 348, -1.7929F, -1.404F, -0.6222F, 1, 1, 7, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 45, 357, 0.7929F, -1.404F, -0.6222F, 1, 1, 7, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-1.5F, -39.2897F, -18.4661F);
		upperhandguard2.addChild(cube_r13);
		setRotationAngle(cube_r13, -3.1416F, 0.0F, 3.1416F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 95, 449, -1.7929F, -1.904F, 0.1778F, 1, 1, 1, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 244, 440, -1.2071F, -1.904F, 0.1778F, 3, 1, 1, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 64, 438, -1.2071F, -3.404F, -0.6222F, 3, 3, 1, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 263, 444, -1.7929F, -3.404F, -0.6222F, 1, 3, 1, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-1.5F, -44.4031F, -14.1778F);
		upperhandguard2.addChild(cube_r14);
		setRotationAngle(cube_r14, -3.1416F, 0.0F, 3.1416F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 448, 372, 0.7929F, -1.404F, -0.6222F, 1, 1, 1, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 448, 378, -1.7929F, -1.404F, -0.6222F, 1, 1, 1, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-1.5F, -46.5031F, 7.1222F);
		upperhandguard2.addChild(cube_r15);
		setRotationAngle(cube_r15, -3.1416F, 0.0F, 3.1416F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 448, 366, -1.7929F, -1.404F, -0.6222F, 1, 1, 1, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 448, 369, 0.7929F, -1.404F, -0.6222F, 1, 1, 1, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-1.5F, -42.99F, 10.5792F);
		upperhandguard2.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.1309F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 75, 443, -1.7929F, -4.5F, 0.5F, 1, 4, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 80, 443, 0.7929F, -4.5F, 0.5F, 1, 4, 1, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-1.5F, -40.4921F, -29.6897F);
		upperhandguard2.addChild(cube_r17);
		setRotationAngle(cube_r17, 1.0472F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 438, 188, -2.0929F, -0.5F, -2.0F, 1, 1, 3, -0.3F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 438, 193, 1.0929F, -0.5F, -2.0F, 1, 1, 3, -0.3F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-1.5F, -40.4921F, -31.6433F);
		upperhandguard2.addChild(cube_r18);
		setRotationAngle(cube_r18, -1.0472F, 0.0F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 434, 413, 1.0929F, -0.5F, -1.0F, 1, 1, 3, -0.3F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 427, 434, -2.0929F, -0.5F, -1.0F, 1, 1, 3, -0.3F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-1.5F, -40.4921F, -28.6433F);
		upperhandguard2.addChild(cube_r19);
		setRotationAngle(cube_r19, -1.0472F, 0.0F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 438, 198, -2.0929F, -0.5F, -1.0F, 1, 1, 3, -0.3F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 438, 203, 1.0929F, -0.5F, -1.0F, 1, 1, 3, -0.3F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-1.5F, -40.4921F, -26.6897F);
		upperhandguard2.addChild(cube_r20);
		setRotationAngle(cube_r20, 1.0472F, 0.0F, 0.0F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 438, 160, -2.0929F, -0.5F, -2.0F, 1, 1, 3, -0.3F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 438, 165, 1.0929F, -0.5F, -2.0F, 1, 1, 3, -0.3F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-1.5F, -40.4921F, -25.6433F);
		upperhandguard2.addChild(cube_r21);
		setRotationAngle(cube_r21, -1.0472F, 0.0F, 0.0F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 438, 170, -2.0929F, -0.5F, -1.0F, 1, 1, 3, -0.3F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 438, 183, 1.0929F, -0.5F, -1.0F, 1, 1, 3, -0.3F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-1.5F, -40.4921F, -22.6433F);
		upperhandguard2.addChild(cube_r22);
		setRotationAngle(cube_r22, -1.0472F, 0.0F, 0.0F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 124, 438, 1.0929F, -0.5F, -1.0F, 1, 1, 3, -0.3F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 438, 145, -2.0929F, -0.5F, -1.0F, 1, 1, 3, -0.3F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-1.5F, -40.4921F, -23.6897F);
		upperhandguard2.addChild(cube_r23);
		setRotationAngle(cube_r23, 1.0472F, 0.0F, 0.0F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 438, 150, 1.0929F, -0.5F, -2.0F, 1, 1, 3, -0.3F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 438, 155, -2.0929F, -0.5F, -2.0F, 1, 1, 3, -0.3F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-1.5F, -40.4921F, -19.6433F);
		upperhandguard2.addChild(cube_r24);
		setRotationAngle(cube_r24, -1.0472F, 0.0F, 0.0F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 275, 434, -2.0929F, -1.5F, -1.0F, 1, 2, 3, -0.3F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 284, 434, 1.0929F, -1.5F, -1.0F, 1, 2, 3, -0.3F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-1.5F, -40.4921F, -20.6897F);
		upperhandguard2.addChild(cube_r25);
		setRotationAngle(cube_r25, 1.0472F, 0.0F, 0.0F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 73, 438, -2.0929F, -0.5F, -2.0F, 1, 1, 3, -0.3F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 82, 438, 1.0929F, -0.5F, -2.0F, 1, 1, 3, -0.3F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-1.75F, -40.3949F, -33.5081F);
		upperhandguard2.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.3491F, 0.0F, 0.0F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 380, 439, -1.8429F, -1.0F, -1.3F, 2, 1, 2, -0.3F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 315, 434, -0.6571F, -1.0F, -1.3F, 3, 1, 2, -0.3F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 354, 439, -1.8429F, -1.0F, -1.0F, 2, 1, 2, -0.3F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 304, 434, -0.6571F, -1.0F, -1.0F, 3, 1, 2, -0.3F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-1.4736F, -51.4631F, -29.4368F);
		longbow.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 0.0F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 449, 63, -0.0238F, 8.7368F, 0.6368F, 1, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 389, 448, -0.0238F, 8.7368F, 3.1368F, 1, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 394, 448, -0.0238F, 8.7368F, 1.8868F, 1, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 399, 448, -0.0238F, 8.7368F, 5.6368F, 1, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 404, 448, -0.0238F, 8.7368F, 4.3868F, 1, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 409, 448, -0.0238F, 8.7368F, 8.1368F, 1, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 414, 448, -0.0238F, 8.7368F, 6.8868F, 1, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 419, 448, -0.0238F, 8.7368F, 10.6368F, 1, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 424, 448, -0.0238F, 8.7368F, 9.3868F, 1, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 448, 438, -1.0213F, 8.7344F, 10.6378F, 1, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 448, 446, -1.0213F, 8.7344F, 9.3878F, 1, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 449, 3, -1.0213F, 8.7344F, 8.1378F, 1, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 449, 6, -1.0213F, 8.7344F, 6.8878F, 1, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 449, 9, -1.0213F, 8.7344F, 5.6378F, 1, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 449, 12, -1.0213F, 8.7344F, 4.3878F, 1, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 449, 15, -1.0213F, 8.7344F, 3.1378F, 1, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 20, 449, -1.0213F, 8.7344F, 1.8878F, 1, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 72, 449, -1.0213F, 8.7344F, 0.6378F, 1, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 89, 413, -0.1738F, 9.3368F, 0.4368F, 1, 1, 11, -0.001F, false));
		bone4.cubeList.add(new ModelBox(bone4, 351, 414, -0.8738F, 9.3368F, 0.4368F, 1, 1, 11, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-14.7737F, -0.3632F, -12.4632F);
		bone4.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.8901F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 449, 21, 15.8063F, -5.1883F, 21.85F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 449, 24, 15.8063F, -5.1883F, 23.1F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 25, 449, 15.8063F, -5.1883F, 19.35F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 449, 27, 15.8063F, -5.1883F, 20.6F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 30, 449, 15.8063F, -5.1883F, 16.85F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 449, 30, 15.8063F, -5.1883F, 18.1F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 449, 33, 15.8063F, -5.1883F, 14.35F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 35, 449, 15.8063F, -5.1883F, 15.6F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 77, 449, 15.8063F, -5.1883F, 13.1F, 1, 1, 1, -0.198F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-13.1737F, -0.3632F, -12.4632F);
		bone4.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.8901F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 449, 39, 0.7516F, 16.4939F, 21.85F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 449, 42, 0.7516F, 16.4939F, 23.1F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 449, 45, 0.7516F, 16.4939F, 19.35F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 48, 449, 0.7516F, 16.4939F, 20.6F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 449, 48, 0.7516F, 16.4939F, 16.85F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 449, 51, 0.7516F, 16.4939F, 18.1F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 449, 54, 0.7516F, 16.4939F, 14.35F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 449, 60, 0.7516F, 16.4939F, 15.6F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 449, 82, 0.7516F, 16.4939F, 13.1F, 1, 1, 1, -0.198F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		longbow.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}