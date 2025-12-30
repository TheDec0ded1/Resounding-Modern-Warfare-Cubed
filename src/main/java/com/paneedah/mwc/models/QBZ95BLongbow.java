package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBZ95BLongbow extends ModelBase {
	private final ModelRenderer longbow;
	private final ModelRenderer cube_r1;
	private final ModelRenderer bone50;
	private final ModelRenderer cube_r121;
	private final ModelRenderer cube_r122;
	private final ModelRenderer base;
	private final ModelRenderer upperhandguard2;
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
	private final ModelRenderer cube_r18;
	private final ModelRenderer bone9;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;

	public QBZ95BLongbow() {
		textureWidth = 384;
		textureHeight = 384;

		longbow = new ModelRenderer(this);
		longbow.setRotationPoint(0.0F, 24.2F, -3.0F);
		longbow.cubeList.add(new ModelBox(longbow, 131, 305, -1.0F, -46.0F, -11.0F, 1, 1, 20, 0.0F, false));
		longbow.cubeList.add(new ModelBox(longbow, 174, 305, -3.0F, -46.0F, -11.0F, 1, 1, 20, 0.0F, false));
		longbow.cubeList.add(new ModelBox(longbow, 182, 327, -3.0F, -44.0F, -2.0F, 1, 1, 11, 0.0F, false));
		longbow.cubeList.add(new ModelBox(longbow, 207, 328, -1.0F, -44.0F, -2.0F, 1, 1, 11, 0.0F, false));
		longbow.cubeList.add(new ModelBox(longbow, 376, 90, -3.0F, -45.0F, 8.0F, 1, 1, 1, 0.0F, false));
		longbow.cubeList.add(new ModelBox(longbow, 112, 376, -1.0F, -45.0F, 8.0F, 1, 1, 1, 0.0F, false));
		longbow.cubeList.add(new ModelBox(longbow, 117, 376, -3.0F, -45.0F, 6.0F, 1, 1, 1, 0.0F, false));
		longbow.cubeList.add(new ModelBox(longbow, 376, 124, -1.0F, -45.0F, 6.0F, 1, 1, 1, 0.0F, false));
		longbow.cubeList.add(new ModelBox(longbow, 376, 131, -3.0F, -45.0F, -2.0F, 1, 1, 1, 0.0F, false));
		longbow.cubeList.add(new ModelBox(longbow, 376, 134, -1.0F, -45.0F, -2.0F, 1, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.5F, -44.367F, -3.5431F);
		longbow.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.48F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 371, 24, -1.5F, -1.4F, -0.5F, 1, 1, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 371, 20, 0.5F, -1.4F, -0.5F, 1, 1, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 376, 140, -1.5F, -0.5F, -2.6F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 376, 137, 0.5F, -0.5F, -2.6F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 184, 358, 0.5F, -0.5F, -2.0F, 1, 1, 4, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 173, 358, -1.5F, -0.5F, -2.0F, 1, 1, 4, 0.0F, false));

		bone50 = new ModelRenderer(this);
		bone50.setRotationPoint(-1.4737F, -55.9631F, -2.9368F);
		longbow.addChild(bone50);
		setRotationAngle(bone50, 0.0F, 0.0F, 0.0F);
		bone50.cubeList.add(new ModelBox(bone50, 376, 157, -0.0238F, 8.7368F, -5.6132F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 376, 160, -0.0238F, 8.7368F, -6.8132F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 197, 376, -0.0238F, 8.7368F, -4.3632F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 240, 376, -0.0238F, 8.7368F, -3.1132F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 376, 332, -0.0238F, 8.7368F, -1.8632F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 376, 335, -0.0238F, 8.7368F, -0.6132F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 376, 338, -0.0238F, 8.7368F, 0.6368F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 192, 378, -0.0238F, 8.7368F, 3.1368F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 376, 341, -0.0238F, 8.7368F, 1.8868F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 351, 376, -0.0238F, 8.7368F, 5.6368F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 376, 375, -0.0238F, 8.7368F, 4.3868F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 15, 377, -0.0238F, 8.7368F, 8.1368F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 122, 377, -0.0238F, 8.7368F, 6.8868F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 230, 377, -0.0238F, 8.7368F, 10.6368F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 235, 377, -0.0238F, 8.7368F, 9.3868F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 250, 377, -1.0213F, 8.7344F, 10.6378F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 217, 378, -1.0213F, 8.7344F, 9.3878F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 255, 377, -1.0213F, 8.7344F, 8.1378F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 267, 377, -1.0213F, 8.7344F, 6.8878F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 272, 377, -1.0213F, 8.7344F, 5.6378F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 202, 378, -1.0213F, 8.7344F, 4.3878F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 277, 377, -1.0213F, 8.7344F, 3.1378F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 282, 377, -1.0213F, 8.7344F, 1.8878F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 287, 377, -1.0213F, 8.7344F, -0.6122F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 377, 300, -1.0213F, 8.7344F, 0.6378F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 377, 303, -1.0213F, 8.7344F, -1.8622F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 377, 306, -1.0213F, 8.7344F, -3.1122F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 309, 377, -1.0213F, 8.7344F, -4.3622F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 377, 309, -1.0213F, 8.7344F, -5.6122F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 377, 312, -1.0213F, 8.7344F, -6.8122F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 292, 46, -0.1738F, 9.3368F, -7.5632F, 1, 1, 19, -0.001F, false));
		bone50.cubeList.add(new ModelBox(bone50, 39, 315, -0.8738F, 9.3368F, -7.5632F, 1, 1, 19, 0.0F, false));

		cube_r121 = new ModelRenderer(this);
		cube_r121.setRotationPoint(-14.7737F, -0.3632F, -12.4632F);
		bone50.addChild(cube_r121);
		setRotationAngle(cube_r121, 0.0F, 0.0F, 0.8901F);
		cube_r121.cubeList.add(new ModelBox(cube_r121, 314, 377, 15.8063F, -5.1883F, 21.85F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 319, 377, 15.8063F, -5.1883F, 23.1F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 324, 377, 15.8063F, -5.1883F, 19.35F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 329, 377, 15.8063F, -5.1883F, 20.6F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 334, 377, 15.8063F, -5.1883F, 16.85F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 339, 377, 15.8063F, -5.1883F, 18.1F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 344, 377, 15.8063F, -5.1883F, 14.35F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 207, 378, 15.8063F, -5.1883F, 15.6F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 356, 377, 15.8063F, -5.1883F, 13.1F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 377, 371, 15.8063F, -5.1883F, 11.85F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 0, 378, 15.8063F, -5.1883F, 10.6F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 5, 378, 15.8063F, -5.1883F, 9.35F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 10, 378, 15.8068F, -5.1894F, 8.102F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 20, 378, 15.8068F, -5.1894F, 6.852F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 378, 20, 15.8068F, -5.1894F, 5.652F, 1, 1, 1, -0.198F, false));

		cube_r122 = new ModelRenderer(this);
		cube_r122.setRotationPoint(-13.1737F, -0.3632F, -12.4632F);
		bone50.addChild(cube_r122);
		setRotationAngle(cube_r122, 0.0F, 0.0F, -0.8901F);
		cube_r122.cubeList.add(new ModelBox(cube_r122, 378, 23, 0.7516F, 16.4939F, 21.85F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 25, 378, 0.7516F, 16.4939F, 23.1F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 378, 26, 0.7516F, 16.4939F, 19.35F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 30, 378, 0.7516F, 16.4939F, 20.6F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 71, 378, 0.7516F, 16.4939F, 16.85F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 76, 378, 0.7516F, 16.4939F, 18.1F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 81, 378, 0.7516F, 16.4939F, 14.35F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 212, 378, 0.7516F, 16.4939F, 15.6F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 86, 378, 0.7516F, 16.4939F, 13.1F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 91, 378, 0.7516F, 16.4939F, 11.85F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 96, 378, 0.7516F, 16.4939F, 10.6F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 101, 378, 0.7516F, 16.4939F, 9.35F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 106, 378, 0.7516F, 16.4939F, 8.1F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 127, 378, 0.7516F, 16.4939F, 6.85F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 132, 378, 0.7516F, 16.4939F, 5.65F, 1, 1, 1, -0.198F, false));

		base = new ModelRenderer(this);
		base.setRotationPoint(0.0F, -0.2F, 3.0F);
		longbow.addChild(base);
		

		upperhandguard2 = new ModelRenderer(this);
		upperhandguard2.setRotationPoint(0.0F, 0.0F, 0.0F);
		base.addChild(upperhandguard2);
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 158, 37, -0.7071F, -37.9071F, -21.7F, 1, 1, 33, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 158, 72, -3.2929F, -37.9071F, -21.7F, 1, 1, 33, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 268, 203, -0.4071F, -39.5071F, -17.35F, 1, 1, 26, -0.3F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 126, 277, -0.8071F, -39.5071F, -17.35F, 1, 1, 26, -0.3F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 181, 277, -3.5929F, -39.5071F, -17.35F, 1, 1, 26, -0.3F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 236, 277, -3.1929F, -39.5071F, -17.35F, 1, 1, 26, -0.3F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 358, 142, -2.4071F, -41.5921F, -21.4897F, 3, 1, 3, -0.3F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 363, 104, -3.5929F, -41.5921F, -21.4897F, 2, 1, 3, -0.3F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 373, 282, -3.5929F, -39.4921F, -18.5897F, 2, 1, 1, -0.3F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 367, 161, -2.4071F, -39.4921F, -18.5897F, 3, 1, 1, -0.3F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 361, 269, -2.4071F, -41.8921F, -20.4397F, 3, 1, 2, -0.3F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 366, 317, -3.5929F, -41.8921F, -20.4397F, 2, 1, 2, -0.3F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 13, 356, -3.5929F, -39.5921F, -21.9897F, 1, 1, 5, -0.3F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 356, 14, -0.4071F, -39.5921F, -21.9897F, 1, 1, 5, -0.3F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 115, 292, -0.7071F, -47.9071F, 8.3F, 1, 9, 3, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 296, 351, -3.2929F, -47.9071F, 8.3F, 1, 9, 3, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 167, 373, -0.7071F, -47.9071F, 7.4F, 1, 3, 1, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 373, 285, -3.2929F, -47.9071F, 7.4F, 1, 3, 1, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 137, 378, -0.7071F, -47.9071F, 10.5F, 1, 1, 1, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 142, 378, -3.2929F, -47.9071F, 10.5F, 1, 1, 1, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 26, 356, -0.7071F, -45.8071F, 6.3F, 1, 3, 2, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 206, 359, -3.2929F, -45.8071F, 6.3F, 1, 3, 2, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 192, 374, -0.7071F, -38.9071F, 4.25F, 1, 2, 1, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 205, 374, -3.2929F, -38.9071F, 4.25F, 1, 2, 1, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 151, 358, -0.7071F, -38.9071F, 7.0F, 1, 2, 4, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 162, 358, -3.2929F, -38.9071F, 7.0F, 1, 2, 4, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 374, 209, -0.7071F, -38.9071F, -0.75F, 1, 2, 1, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 210, 374, -3.2929F, -38.9071F, -0.75F, 1, 2, 1, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 374, 213, -0.7071F, -38.9071F, -3.5F, 1, 2, 1, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 215, 374, -3.2929F, -38.9071F, -3.5F, 1, 2, 1, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 374, 217, -0.7071F, -38.9071F, -8.5F, 1, 2, 1, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 220, 374, -3.2929F, -38.9071F, -8.5F, 1, 2, 1, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 374, 221, -3.2929F, -38.9071F, -11.25F, 1, 2, 1, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 225, 374, -0.7071F, -38.9071F, -11.25F, 1, 2, 1, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 352, 231, -3.2929F, -38.9071F, -20.25F, 1, 2, 5, 0.0F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 352, 239, -0.7071F, -38.9071F, -20.25F, 1, 2, 5, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.6284F, -44.3071F, 6.0582F);
		upperhandguard2.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -0.4363F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 373, 321, -0.5F, -1.5F, -0.5F, 1, 3, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-0.3716F, -44.3071F, 6.0582F);
		upperhandguard2.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.4363F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 373, 295, -0.5F, -1.5F, -0.5F, 1, 3, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.5F, -46.5031F, 7.1222F);
		upperhandguard2.addChild(cube_r4);
		setRotationAngle(cube_r4, -3.0107F, 0.0F, 3.1416F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 187, 374, 0.7929F, -1.0878F, -0.4969F, 1, 2, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 374, 184, -1.7929F, -1.0878F, -0.4969F, 1, 2, 1, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.5F, -36.2002F, 8.64F);
		upperhandguard2.addChild(cube_r5);
		setRotationAngle(cube_r5, -2.1817F, 0.0F, 3.1416F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 182, 374, -1.7929F, -2.404F, 2.3778F, 1, 2, 1, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 374, 180, 0.7929F, -2.404F, 2.3778F, 1, 2, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-1.5F, -44.0002F, 10.84F);
		upperhandguard2.addChild(cube_r6);
		setRotationAngle(cube_r6, 2.2689F, 0.0F, 3.1416F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 177, 374, -1.7929F, -2.404F, 2.3778F, 1, 2, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 374, 176, 0.7929F, -2.404F, 2.3778F, 1, 2, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.5F, -43.8002F, -12.26F);
		upperhandguard2.addChild(cube_r7);
		setRotationAngle(cube_r7, 2.2689F, 0.0F, 3.1416F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 374, 172, 0.7929F, -2.404F, 6.3778F, 1, 2, 1, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 172, 374, -1.7929F, -2.404F, 6.3778F, 1, 2, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-1.7F, -34.5267F, -14.6191F);
		upperhandguard2.addChild(cube_r8);
		setRotationAngle(cube_r8, 2.5307F, 0.0F, 3.1416F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 187, 378, 0.7929F, -9.404F, 0.5778F, 1, 1, 1, -0.2F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 172, 378, 0.7929F, -9.404F, 0.2778F, 1, 1, 1, -0.2F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-1.3F, -34.5267F, -14.6191F);
		upperhandguard2.addChild(cube_r9);
		setRotationAngle(cube_r9, 2.5307F, 0.0F, 3.1416F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 182, 378, -1.7929F, -9.404F, 0.5778F, 1, 1, 1, -0.2F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 177, 378, -1.7929F, -9.404F, 0.2778F, 1, 1, 1, -0.2F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-1.5F, -44.3002F, -14.26F);
		upperhandguard2.addChild(cube_r10);
		setRotationAngle(cube_r10, 2.5307F, 0.0F, 3.1416F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 17, 347, -1.7929F, -1.404F, -0.6222F, 1, 1, 7, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 347, 0.7929F, -1.404F, -0.6222F, 1, 1, 7, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-1.5F, -39.2897F, -18.4661F);
		upperhandguard2.addChild(cube_r11);
		setRotationAngle(cube_r11, -3.1416F, 0.0F, 3.1416F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 167, 378, -1.7929F, -1.904F, 0.1778F, 1, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 315, 367, -1.2071F, -1.904F, 0.1778F, 3, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 365, 248, -1.2071F, -3.404F, -0.6222F, 3, 3, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 373, 290, -1.7929F, -3.404F, -0.6222F, 1, 3, 1, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-1.5F, -44.4031F, -14.1778F);
		upperhandguard2.addChild(cube_r12);
		setRotationAngle(cube_r12, -3.1416F, 0.0F, 3.1416F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 162, 378, 0.7929F, -1.404F, -0.6222F, 1, 1, 1, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 157, 378, -1.7929F, -1.404F, -0.6222F, 1, 1, 1, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-1.5F, -46.5031F, 7.1222F);
		upperhandguard2.addChild(cube_r13);
		setRotationAngle(cube_r13, -3.1416F, 0.0F, 3.1416F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 152, 378, -1.7929F, -1.404F, -0.6222F, 1, 1, 1, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 147, 378, 0.7929F, -1.404F, -0.6222F, 1, 1, 1, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-1.5F, -42.99F, 10.5792F);
		upperhandguard2.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.1309F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 371, 43, -1.7929F, -4.5F, 0.5F, 1, 4, 1, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 19, 371, 0.7929F, -4.5F, 0.5F, 1, 4, 1, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-1.5F, -40.4921F, -19.6433F);
		upperhandguard2.addChild(cube_r15);
		setRotationAngle(cube_r15, -1.0472F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 327, 364, -2.0929F, -1.5F, -1.0F, 1, 2, 3, -0.3F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 292, 364, 1.0929F, -1.5F, -1.0F, 1, 2, 3, -0.3F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-1.5F, -40.4921F, -20.6897F);
		upperhandguard2.addChild(cube_r18);
		setRotationAngle(cube_r18, 1.0472F, 0.0F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 365, 243, -2.0929F, -0.5F, -2.0F, 1, 1, 3, -0.3F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 365, 238, 1.0929F, -0.5F, -2.0F, 1, 1, 3, -0.3F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-1.4736F, -51.4631F, -29.4368F);
		longbow.addChild(bone9);
		setRotationAngle(bone9, 0.0F, 0.0F, 0.0F);
		

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-14.7737F, -0.3632F, -12.4632F);
		bone9.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, 0.8901F);
		

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-13.1737F, -0.3632F, -12.4632F);
		bone9.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, -0.8901F);
		
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