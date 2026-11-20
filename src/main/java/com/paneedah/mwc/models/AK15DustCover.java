package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AK15DustCover extends ModelBase {
	private final ModelRenderer dustcover;
	private final ModelRenderer DustCover19;
	private final ModelRenderer DustCover17;
	private final ModelRenderer DustCover18;
	private final ModelRenderer DustCover37;
	private final ModelRenderer DustCover38;
	private final ModelRenderer DustCover20;
	private final ModelRenderer DustCover13;
	private final ModelRenderer DustCover11;
	private final ModelRenderer DustCover12;
	private final ModelRenderer DustCover36;
	private final ModelRenderer DustCover14;
	private final ModelRenderer DustCover15;
	private final ModelRenderer DustCover47;
	private final ModelRenderer DustCover16;
	private final ModelRenderer DustCover22_r1;
	private final ModelRenderer DustCover20_r1;
	private final ModelRenderer DustCover1;
	private final ModelRenderer DustCover2;
	private final ModelRenderer DustCover4;
	private final ModelRenderer DustCover3;
	private final ModelRenderer DustCover22;
	private final ModelRenderer DustCover35;
	private final ModelRenderer DustCover5;
	private final ModelRenderer DustCover44;
	private final ModelRenderer DustCover10;
	private final ModelRenderer DustCover9;
	private final ModelRenderer DustCover8;
	private final ModelRenderer DustCover42;
	private final ModelRenderer DustCover41;
	private final ModelRenderer DustCover43;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r50;
	private final ModelRenderer cube_r51;

	public AK15DustCover() {
		textureWidth = 416;
		textureHeight = 416;

		dustcover = new ModelRenderer(this);
		dustcover.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		DustCover19 = new ModelRenderer(this);
		DustCover19.setRotationPoint(-0.2F, -36.0F, -24.5F);
		dustcover.addChild(DustCover19);
		DustCover19.cubeList.add(new ModelBox(DustCover19, 71, 233, 0.0F, 0.0F, 0.0F, 1, 1, 26, 0.0F, false));

		DustCover17 = new ModelRenderer(this);
		DustCover17.setRotationPoint(-3.8F, -36.0F, -9.5F);
		dustcover.addChild(DustCover17);
		DustCover17.cubeList.add(new ModelBox(DustCover17, 333, 0, -0.001F, 0.0F, 0.0F, 1, 1, 12, 0.0F, false));

		DustCover18 = new ModelRenderer(this);
		DustCover18.setRotationPoint(-3.8F, -36.0F, 2.5F);
		dustcover.addChild(DustCover18);
		DustCover18.cubeList.add(new ModelBox(DustCover18, 387, 290, -0.1F, 0.099F, 0.001F, 4, 1, 1, 0.0F, false));
		DustCover18.cubeList.add(new ModelBox(DustCover18, 399, 168, 3.7F, 0.098F, 0.002F, 1, 1, 1, 0.0F, false));

		DustCover37 = new ModelRenderer(this);
		DustCover37.setRotationPoint(-0.2F, -37.0F, -33.5F);
		dustcover.addChild(DustCover37);
		DustCover37.cubeList.add(new ModelBox(DustCover37, 69, 356, 0.001F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		DustCover38 = new ModelRenderer(this);
		DustCover38.setRotationPoint(-0.2F, -37.5F, -33.5F);
		dustcover.addChild(DustCover38);
		DustCover38.cubeList.add(new ModelBox(DustCover38, 90, 356, 0.002F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		DustCover20 = new ModelRenderer(this);
		DustCover20.setRotationPoint(-0.3F, -37.5F, -25.0F);
		dustcover.addChild(DustCover20);
		DustCover20.cubeList.add(new ModelBox(DustCover20, 213, 197, 0.001F, 0.0F, 0.0F, 1, 2, 27, 0.0F, false));

		DustCover13 = new ModelRenderer(this);
		DustCover13.setRotationPoint(-3.8F, -35.0F, -9.5F);
		dustcover.addChild(DustCover13);
		setRotationAngle(DustCover13, 2.1935F, 0.0F, 0.0F);
		DustCover13.cubeList.add(new ModelBox(DustCover13, 392, 325, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		DustCover11 = new ModelRenderer(this);
		DustCover11.setRotationPoint(-3.8F, -37.5F, -19.1F);
		dustcover.addChild(DustCover11);
		DustCover11.cubeList.add(new ModelBox(DustCover11, 327, 355, 0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		DustCover12 = new ModelRenderer(this);
		DustCover12.setRotationPoint(-3.8F, -37.5F, -10.1F);
		dustcover.addChild(DustCover12);
		setRotationAngle(DustCover12, -0.8923F, 0.0F, 0.0F);
		DustCover12.cubeList.add(new ModelBox(DustCover12, 399, 171, -0.001F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		DustCover36 = new ModelRenderer(this);
		DustCover36.setRotationPoint(-0.2F, -37.5F, -24.5F);
		dustcover.addChild(DustCover36);
		setRotationAngle(DustCover36, -1.1525F, 0.0F, 0.0F);
		DustCover36.cubeList.add(new ModelBox(DustCover36, 392, 329, -0.001F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		DustCover14 = new ModelRenderer(this);
		DustCover14.setRotationPoint(-3.7F, -37.5F, -10.1F);
		dustcover.addChild(DustCover14);
		DustCover14.cubeList.add(new ModelBox(DustCover14, 333, 92, -0.001F, 0.0F, 0.0F, 1, 1, 12, 0.0F, false));

		DustCover15 = new ModelRenderer(this);
		DustCover15.setRotationPoint(-3.7F, -36.5F, -9.1F);
		dustcover.addChild(DustCover15);
		DustCover15.cubeList.add(new ModelBox(DustCover15, 191, 341, -0.001F, 0.0F, 0.0F, 1, 1, 11, 0.0F, false));

		DustCover47 = new ModelRenderer(this);
		DustCover47.setRotationPoint(-3.7F, -36.5F, -9.5F);
		dustcover.addChild(DustCover47);
		DustCover47.cubeList.add(new ModelBox(DustCover47, 399, 206, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		DustCover16 = new ModelRenderer(this);
		DustCover16.setRotationPoint(-3.8F, -37.2F, -8.1F);
		dustcover.addChild(DustCover16);
		DustCover16.cubeList.add(new ModelBox(DustCover16, 165, 391, 2.699F, 1.3F, 9.45F, 2, 1, 2, 0.0F, false));
		DustCover16.cubeList.add(new ModelBox(DustCover16, 209, 391, -0.101F, 1.3F, 9.45F, 2, 1, 2, 0.0F, false));
		DustCover16.cubeList.add(new ModelBox(DustCover16, 333, 392, 2.7F, -0.301F, 9.45F, 2, 2, 1, 0.0F, false));
		DustCover16.cubeList.add(new ModelBox(DustCover16, 357, 392, -0.1F, -0.301F, 9.45F, 2, 2, 1, 0.0F, false));

		DustCover22_r1 = new ModelRenderer(this);
		DustCover22_r1.setRotationPoint(3.3F, -0.3F, 10.45F);
		DustCover16.addChild(DustCover22_r1);
		setRotationAngle(DustCover22_r1, -0.9425F, 0.0F, 0.0F);
		DustCover22_r1.cubeList.add(new ModelBox(DustCover22_r1, 399, 231, -1.5F, 0.0F, -2.2F, 1, 1, 1, 0.0F, false));
		DustCover22_r1.cubeList.add(new ModelBox(DustCover22_r1, 218, 391, -2.0F, -0.002F, -1.6F, 2, 1, 2, 0.0F, false));
		DustCover22_r1.cubeList.add(new ModelBox(DustCover22_r1, 0, 387, -3.399F, -0.001F, 0.0F, 3, 1, 2, 0.0F, false));
		DustCover22_r1.cubeList.add(new ModelBox(DustCover22_r1, 392, 34, -0.599F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

		DustCover20_r1 = new ModelRenderer(this);
		DustCover20_r1.setRotationPoint(0.6F, 0.5F, 10.25F);
		DustCover16.addChild(DustCover20_r1);
		setRotationAngle(DustCover20_r1, -0.384F, 0.0F, 0.0F);
		DustCover20_r1.cubeList.add(new ModelBox(DustCover20_r1, 404, 177, -0.9F, -0.001F, 0.0F, 1, 1, 1, -0.1F, false));
		DustCover20_r1.cubeList.add(new ModelBox(DustCover20_r1, 239, 399, 3.3F, -0.001F, 0.0F, 1, 1, 1, -0.1F, false));

		DustCover1 = new ModelRenderer(this);
		DustCover1.setRotationPoint(-2.0F, -39.8F, -33.5F);
		dustcover.addChild(DustCover1);
		DustCover1.cubeList.add(new ModelBox(DustCover1, 152, 161, 0.0F, 0.0F, 0.0F, 1, 1, 34, 0.0F, false));

		DustCover2 = new ModelRenderer(this);
		DustCover2.setRotationPoint(-1.0F, -39.8F, -33.5F);
		dustcover.addChild(DustCover2);
		setRotationAngle(DustCover2, 0.0F, 0.0F, 0.5949F);
		DustCover2.cubeList.add(new ModelBox(DustCover2, 0, 162, 0.0F, 0.0F, 0.0F, 1, 1, 34, 0.0F, false));

		DustCover4 = new ModelRenderer(this);
		DustCover4.setRotationPoint(-2.0F, -39.8F, -33.5F);
		dustcover.addChild(DustCover4);
		setRotationAngle(DustCover4, 0.0F, 0.0F, 0.9295F);
		DustCover4.cubeList.add(new ModelBox(DustCover4, 166, 0, 0.0F, 0.0F, 0.0F, 1, 1, 34, 0.0F, false));

		DustCover3 = new ModelRenderer(this);
		DustCover3.setRotationPoint(-0.17F, -39.25F, -33.5F);
		dustcover.addChild(DustCover3);
		setRotationAngle(DustCover3, 0.0F, 0.0F, 1.4871F);
		DustCover3.cubeList.add(new ModelBox(DustCover3, 160, 80, 0.0F, 0.0F, -0.001F, 2, 1, 34, 0.0F, false));

		DustCover22 = new ModelRenderer(this);
		DustCover22.setRotationPoint(0.7F, -37.5F, -25.0F);
		dustcover.addChild(DustCover22);
		setRotationAngle(DustCover22, 0.0F, 0.0F, 2.3051F);
		DustCover22.cubeList.add(new ModelBox(DustCover22, 213, 227, 0.0F, 0.0F, 0.0F, 1, 2, 26, 0.0F, false));

		DustCover35 = new ModelRenderer(this);
		DustCover35.setRotationPoint(0.8F, -37.5F, -33.5F);
		dustcover.addChild(DustCover35);
		setRotationAngle(DustCover35, 0.0F, 0.0F, 2.3051F);
		DustCover35.cubeList.add(new ModelBox(DustCover35, 306, 355, 0.0F, 0.0F, 0.0F, 1, 2, 9, 0.0F, false));

		DustCover5 = new ModelRenderer(this);
		DustCover5.setRotationPoint(-2.8F, -39.2F, -21.5F);
		dustcover.addChild(DustCover5);
		setRotationAngle(DustCover5, 0.0F, 0.0F, 0.1115F);
		DustCover5.cubeList.add(new ModelBox(DustCover5, 0, 261, 0.0F, 0.0F, -0.001F, 1, 2, 22, 0.0F, false));

		DustCover44 = new ModelRenderer(this);
		DustCover44.setRotationPoint(-3.7F, -37.5F, -11.0F);
		dustcover.addChild(DustCover44);
		setRotationAngle(DustCover44, 0.0F, 0.0F, -0.7436F);
		DustCover44.cubeList.add(new ModelBox(DustCover44, 322, 291, 0.0F, 0.0F, 0.0F, 2, 1, 12, 0.0F, false));

		DustCover10 = new ModelRenderer(this);
		DustCover10.setRotationPoint(-3.8F, -37.5F, -19.1F);
		dustcover.addChild(DustCover10);
		setRotationAngle(DustCover10, 0.0F, 0.0F, -0.7436F);
		DustCover10.cubeList.add(new ModelBox(DustCover10, 23, 354, 0.0F, 0.0F, 0.0F, 2, 1, 9, 0.0F, false));

		DustCover9 = new ModelRenderer(this);
		DustCover9.setRotationPoint(-3.9F, -37.5F, -21.5F);
		dustcover.addChild(DustCover9);
		DustCover9.cubeList.add(new ModelBox(DustCover9, 387, 293, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		DustCover8 = new ModelRenderer(this);
		DustCover8.setRotationPoint(-3.9F, -37.5F, -21.5F);
		dustcover.addChild(DustCover8);
		setRotationAngle(DustCover8, 0.0F, 0.0F, -0.7808F);
		DustCover8.cubeList.add(new ModelBox(DustCover8, 102, 386, 0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));

		DustCover42 = new ModelRenderer(this);
		DustCover42.setRotationPoint(-2.0F, -39.8F, 0.5F);
		dustcover.addChild(DustCover42);
		setRotationAngle(DustCover42, -0.9295F, 0.0F, 0.0F);
		DustCover42.cubeList.add(new ModelBox(DustCover42, 43, 374, 0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));

		DustCover41 = new ModelRenderer(this);
		DustCover41.setRotationPoint(-2.8F, -39.3F, 0.88F);
		dustcover.addChild(DustCover41);
		setRotationAngle(DustCover41, -0.9295F, 0.0F, 0.0F);
		DustCover41.cubeList.add(new ModelBox(DustCover41, 35, 381, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		DustCover43 = new ModelRenderer(this);
		DustCover43.setRotationPoint(-1.2F, -39.3F, 0.88F);
		dustcover.addChild(DustCover43);
		setRotationAngle(DustCover43, -0.9295F, 0.0F, 0.0F);
		DustCover43.cubeList.add(new ModelBox(DustCover43, 381, 42, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-0.7F, -40.225F, -39.65F);
		dustcover.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 396, 6, -1.8F, -0.2F, 7.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 7, 396, -1.8F, -0.2F, 5.85F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 396, 9, -1.8F, -0.2F, 8.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 396, 12, -1.8F, -0.2F, 9.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 14, 396, -1.8F, -0.2F, 10.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 21, 396, -1.8F, -0.2F, 12.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 36, 396, -1.8F, -0.2F, 13.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 43, 396, -1.8F, -0.2F, 14.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 76, 396, -1.8F, -0.2F, 15.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 94, 396, -1.8F, -0.2F, 17.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 396, 234, -1.8F, -0.2F, 18.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 396, 237, -1.8F, -0.2F, 19.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 242, 396, -1.8F, -0.2F, 20.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 259, 396, -1.8F, -0.2F, 22.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 102, 383, -1.8F, -0.2F, 23.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 396, 293, -1.8F, -0.2F, 24.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 298, 396, -1.8F, -0.2F, 25.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 331, 396, -1.8F, -0.2F, 27.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 354, 396, -1.8F, -0.2F, 28.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 28, 397, -1.8F, -0.2F, 29.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 50, 397, -1.8F, -0.2F, 30.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 65, 397, -1.8F, -0.2F, 32.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 114, 397, -1.8F, -0.2F, 33.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 121, 397, -1.8F, -0.2F, 34.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 128, 397, -1.8F, -0.2F, 35.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 397, 141, -1.8F, -0.2F, 37.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 397, 144, -1.8F, -0.2F, 38.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 397, 147, -1.8F, -0.2F, 39.25F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 397, 150, -1.8F, -0.2F, 38.75F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 79, 161, -1.7F, 0.4F, 6.05F, 2, 1, 34, -0.001F, false));
		bone3.cubeList.add(new ModelBox(bone3, 71, 197, -1.9F, 0.4F, 6.05F, 1, 1, 34, 0.0F, false));

		cube_r50 = new ModelRenderer(this);
		cube_r50.setRotationPoint(-1.6F, 0.0F, -1.25F);
		bone3.addChild(cube_r50);
		setRotationAngle(cube_r50, 0.0F, 0.0F, 0.8901F);
		cube_r50.cubeList.add(new ModelBox(cube_r50, 142, 197, -0.25F, -0.05F, 7.2F, 1, 1, 34, -0.35F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 401, 60, -0.2F, -0.2F, 40.5F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 259, 402, -0.2F, -0.2F, 40.0F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 401, 63, -0.2F, -0.2F, 39.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 401, 66, -0.2F, -0.2F, 38.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 401, 69, -0.2F, -0.2F, 37.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 401, 72, -0.2F, -0.2F, 35.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 401, 75, -0.2F, -0.2F, 34.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 82, 401, -0.2F, -0.2F, 33.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 100, 401, -0.2F, -0.2F, 32.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 401, 108, -0.2F, -0.2F, 30.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 401, 111, -0.2F, -0.2F, 29.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 401, 117, -0.2F, -0.2F, 28.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 401, 120, -0.2F, -0.2F, 27.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 401, 123, -0.2F, -0.2F, 25.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 354, 76, -0.2F, -0.2F, 24.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 401, 126, -0.2F, -0.2F, 23.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 133, 401, -0.2F, -0.2F, 22.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 138, 401, -0.2F, -0.2F, 20.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 143, 401, -0.2F, -0.2F, 19.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 148, 401, -0.2F, -0.2F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 153, 401, -0.2F, -0.2F, 17.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 158, 401, -0.2F, -0.2F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 163, 401, -0.2F, -0.2F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 168, 401, -0.2F, -0.2F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 173, 401, -0.2F, -0.2F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 178, 401, -0.2F, -0.2F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 204, 401, -0.2F, -0.2F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 209, 401, -0.2F, -0.2F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 214, 401, -0.2F, -0.2F, 7.1F, 1, 1, 1, -0.198F, false));

		cube_r51 = new ModelRenderer(this);
		cube_r51.setRotationPoint(0.0F, 0.0F, -1.25F);
		bone3.addChild(cube_r51);
		setRotationAngle(cube_r51, 0.0F, 0.0F, -0.8901F);
		cube_r51.cubeList.add(new ModelBox(cube_r51, 0, 198, -0.75F, -0.05F, 7.2F, 1, 1, 34, -0.35F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 219, 401, -0.8F, -0.2F, 40.5F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 264, 402, -0.8F, -0.2F, 40.0F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 224, 401, -0.8F, -0.2F, 39.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 229, 401, -0.8F, -0.2F, 38.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 234, 401, -0.8F, -0.2F, 37.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 249, 401, -0.8F, -0.2F, 35.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 401, 300, -0.8F, -0.2F, 34.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 401, 303, -0.8F, -0.2F, 33.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 401, 306, -0.8F, -0.2F, 32.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 401, 309, -0.8F, -0.2F, 30.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 401, 312, -0.8F, -0.2F, 29.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 401, 400, -0.8F, -0.2F, 28.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 17, 402, -0.8F, -0.2F, 27.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 22, 402, -0.8F, -0.2F, 25.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 156, 377, -0.8F, -0.2F, 24.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 32, 402, -0.8F, -0.2F, 23.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 37, 402, -0.8F, -0.2F, 22.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 42, 402, -0.8F, -0.2F, 20.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 69, 402, -0.8F, -0.2F, 19.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 74, 402, -0.8F, -0.2F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 87, 402, -0.8F, -0.2F, 17.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 92, 402, -0.8F, -0.2F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 105, 402, -0.8F, -0.2F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 183, 402, -0.8F, -0.2F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 402, 218, -0.8F, -0.2F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 402, 221, -0.8F, -0.2F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 239, 402, -0.8F, -0.2F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 244, 402, -0.8F, -0.2F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 254, 402, -0.8F, -0.2F, 7.1F, 1, 1, 1, -0.198F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		dustcover.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}