package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AK400Dustcover extends ModelBase {
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
	private final ModelRenderer bone10;
	private final ModelRenderer irons2;
	private final ModelRenderer bone10_r1;
	private final ModelRenderer bone11_r1;
	private final ModelRenderer sightbase;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer bone11;

	public AK400Dustcover() {
		textureWidth = 416;
		textureHeight = 416;

		dustcover = new ModelRenderer(this);
		dustcover.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		DustCover19 = new ModelRenderer(this);
		DustCover19.setRotationPoint(-0.2F, -36.0F, -24.5F);
		dustcover.addChild(DustCover19);
		DustCover19.cubeList.add(new ModelBox(DustCover19, 249, 178, 0.0F, 0.0F, 0.0F, 1, 1, 26, 0.0F, false));

		DustCover17 = new ModelRenderer(this);
		DustCover17.setRotationPoint(-3.8F, -36.0F, -9.5F);
		dustcover.addChild(DustCover17);
		DustCover17.cubeList.add(new ModelBox(DustCover17, 349, 64, -0.001F, 0.0F, 0.0F, 1, 1, 12, 0.0F, false));

		DustCover18 = new ModelRenderer(this);
		DustCover18.setRotationPoint(-3.8F, -36.0F, 2.5F);
		dustcover.addChild(DustCover18);
		DustCover18.cubeList.add(new ModelBox(DustCover18, 337, 315, -0.1F, 0.099F, 0.001F, 4, 1, 1, 0.0F, false));
		DustCover18.cubeList.add(new ModelBox(DustCover18, 396, 101, 3.7F, 0.098F, 0.002F, 1, 1, 1, 0.0F, false));

		DustCover37 = new ModelRenderer(this);
		DustCover37.setRotationPoint(-0.2F, -37.0F, -33.5F);
		dustcover.addChild(DustCover37);
		DustCover37.cubeList.add(new ModelBox(DustCover37, 331, 367, 0.001F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		DustCover38 = new ModelRenderer(this);
		DustCover38.setRotationPoint(-0.2F, -37.5F, -33.5F);
		dustcover.addChild(DustCover38);
		DustCover38.cubeList.add(new ModelBox(DustCover38, 352, 367, 0.002F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		DustCover20 = new ModelRenderer(this);
		DustCover20.setRotationPoint(-0.3F, -37.5F, -25.0F);
		dustcover.addChild(DustCover20);
		DustCover20.cubeList.add(new ModelBox(DustCover20, 134, 212, 0.001F, 0.0F, 0.0F, 1, 2, 27, 0.0F, false));

		DustCover13 = new ModelRenderer(this);
		DustCover13.setRotationPoint(-3.8F, -35.0F, -9.5F);
		dustcover.addChild(DustCover13);
		setRotationAngle(DustCover13, 2.1935F, 0.0F, 0.0F);
		DustCover13.cubeList.add(new ModelBox(DustCover13, 0, 390, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		DustCover11 = new ModelRenderer(this);
		DustCover11.setRotationPoint(-3.8F, -37.5F, -19.1F);
		dustcover.addChild(DustCover11);
		DustCover11.cubeList.add(new ModelBox(DustCover11, 200, 367, 0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		DustCover12 = new ModelRenderer(this);
		DustCover12.setRotationPoint(-3.8F, -37.5F, -10.1F);
		dustcover.addChild(DustCover12);
		setRotationAngle(DustCover12, -0.8923F, 0.0F, 0.0F);
		DustCover12.cubeList.add(new ModelBox(DustCover12, 396, 104, -0.001F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		DustCover36 = new ModelRenderer(this);
		DustCover36.setRotationPoint(-0.2F, -37.5F, -24.5F);
		dustcover.addChild(DustCover36);
		setRotationAngle(DustCover36, -1.1525F, 0.0F, 0.0F);
		DustCover36.cubeList.add(new ModelBox(DustCover36, 390, 13, -0.001F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		DustCover14 = new ModelRenderer(this);
		DustCover14.setRotationPoint(-3.7F, -37.5F, -10.1F);
		dustcover.addChild(DustCover14);
		DustCover14.cubeList.add(new ModelBox(DustCover14, 349, 78, -0.001F, 0.0F, 0.0F, 1, 1, 12, 0.0F, false));

		DustCover15 = new ModelRenderer(this);
		DustCover15.setRotationPoint(-3.7F, -36.5F, -9.1F);
		dustcover.addChild(DustCover15);
		DustCover15.cubeList.add(new ModelBox(DustCover15, 150, 355, -0.001F, 0.0F, 0.0F, 1, 1, 11, 0.0F, false));

		DustCover47 = new ModelRenderer(this);
		DustCover47.setRotationPoint(-3.7F, -36.5F, -9.5F);
		dustcover.addChild(DustCover47);
		DustCover47.cubeList.add(new ModelBox(DustCover47, 396, 107, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		DustCover16 = new ModelRenderer(this);
		DustCover16.setRotationPoint(-3.8F, -37.2F, -8.1F);
		dustcover.addChild(DustCover16);
		DustCover16.cubeList.add(new ModelBox(DustCover16, 296, 208, 2.699F, 1.3F, 9.45F, 2, 1, 2, 0.0F, false));
		DustCover16.cubeList.add(new ModelBox(DustCover16, 203, 388, -0.101F, 1.3F, 9.45F, 2, 1, 2, 0.0F, false));
		DustCover16.cubeList.add(new ModelBox(DustCover16, 29, 390, 2.7F, -0.301F, 9.45F, 2, 2, 1, 0.0F, false));
		DustCover16.cubeList.add(new ModelBox(DustCover16, 58, 390, -0.1F, -0.301F, 9.45F, 2, 2, 1, 0.0F, false));

		DustCover22_r1 = new ModelRenderer(this);
		DustCover22_r1.setRotationPoint(3.3F, -0.3F, 10.45F);
		DustCover16.addChild(DustCover22_r1);
		setRotationAngle(DustCover22_r1, -0.9425F, 0.0F, 0.0F);
		DustCover22_r1.cubeList.add(new ModelBox(DustCover22_r1, 396, 110, -1.5F, 0.0F, -2.2F, 1, 1, 1, 0.0F, false));
		DustCover22_r1.cubeList.add(new ModelBox(DustCover22_r1, 212, 388, -2.0F, -0.002F, -1.6F, 2, 1, 2, 0.0F, false));
		DustCover22_r1.cubeList.add(new ModelBox(DustCover22_r1, 382, 298, -3.399F, -0.001F, 0.0F, 3, 1, 2, 0.0F, false));
		DustCover22_r1.cubeList.add(new ModelBox(DustCover22_r1, 389, 20, -0.599F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

		DustCover20_r1 = new ModelRenderer(this);
		DustCover20_r1.setRotationPoint(0.6F, 0.5F, 10.25F);
		DustCover16.addChild(DustCover20_r1);
		setRotationAngle(DustCover20_r1, -0.384F, 0.0F, 0.0F);
		DustCover20_r1.cubeList.add(new ModelBox(DustCover20_r1, 205, 399, -0.9F, -0.001F, 0.0F, 1, 1, 1, -0.1F, false));
		DustCover20_r1.cubeList.add(new ModelBox(DustCover20_r1, 396, 113, 3.3F, -0.001F, 0.0F, 1, 1, 1, -0.1F, false));

		DustCover1 = new ModelRenderer(this);
		DustCover1.setRotationPoint(-2.0F, -39.8F, -33.5F);
		dustcover.addChild(DustCover1);
		DustCover1.cubeList.add(new ModelBox(DustCover1, 182, 36, 0.0F, 0.0F, 0.0F, 1, 1, 34, 0.0F, false));

		DustCover2 = new ModelRenderer(this);
		DustCover2.setRotationPoint(-1.0F, -39.8F, -33.5F);
		dustcover.addChild(DustCover2);
		setRotationAngle(DustCover2, 0.0F, 0.0F, 0.5949F);
		DustCover2.cubeList.add(new ModelBox(DustCover2, 182, 72, 0.0F, 0.0F, 0.0F, 1, 1, 34, 0.0F, false));

		DustCover4 = new ModelRenderer(this);
		DustCover4.setRotationPoint(-2.0F, -39.8F, -33.5F);
		dustcover.addChild(DustCover4);
		setRotationAngle(DustCover4, 0.0F, 0.0F, 0.9295F);
		DustCover4.cubeList.add(new ModelBox(DustCover4, 182, 108, 0.0F, 0.0F, 0.0F, 1, 1, 34, 0.0F, false));

		DustCover3 = new ModelRenderer(this);
		DustCover3.setRotationPoint(-0.17F, -39.25F, -33.5F);
		dustcover.addChild(DustCover3);
		setRotationAngle(DustCover3, 0.0F, 0.0F, 1.4871F);
		DustCover3.cubeList.add(new ModelBox(DustCover3, 182, 0, 0.0F, 0.0F, -0.001F, 2, 1, 34, 0.0F, false));

		DustCover22 = new ModelRenderer(this);
		DustCover22.setRotationPoint(0.7F, -37.5F, -25.0F);
		dustcover.addChild(DustCover22);
		setRotationAngle(DustCover22, 0.0F, 0.0F, 2.3051F);
		DustCover22.cubeList.add(new ModelBox(DustCover22, 248, 241, 0.0F, 0.0F, 0.0F, 1, 2, 26, 0.0F, false));

		DustCover35 = new ModelRenderer(this);
		DustCover35.setRotationPoint(0.8F, -37.5F, -33.5F);
		dustcover.addChild(DustCover35);
		setRotationAngle(DustCover35, 0.0F, 0.0F, 2.3051F);
		DustCover35.cubeList.add(new ModelBox(DustCover35, 359, 302, 0.0F, 0.0F, 0.0F, 1, 2, 9, 0.0F, false));

		DustCover5 = new ModelRenderer(this);
		DustCover5.setRotationPoint(-2.8F, -39.2F, -21.5F);
		dustcover.addChild(DustCover5);
		setRotationAngle(DustCover5, 0.0F, 0.0F, 0.1115F);
		DustCover5.cubeList.add(new ModelBox(DustCover5, 134, 184, 0.0F, 0.0F, -0.001F, 1, 2, 22, 0.0F, false));

		DustCover44 = new ModelRenderer(this);
		DustCover44.setRotationPoint(-3.7F, -37.5F, -11.0F);
		dustcover.addChild(DustCover44);
		setRotationAngle(DustCover44, 0.0F, 0.0F, -0.7436F);
		DustCover44.cubeList.add(new ModelBox(DustCover44, 349, 50, 0.0F, 0.0F, 0.0F, 2, 1, 12, 0.0F, false));

		DustCover10 = new ModelRenderer(this);
		DustCover10.setRotationPoint(-3.8F, -37.5F, -19.1F);
		dustcover.addChild(DustCover10);
		setRotationAngle(DustCover10, 0.0F, 0.0F, -0.7436F);
		DustCover10.cubeList.add(new ModelBox(DustCover10, 359, 291, 0.0F, 0.0F, 0.0F, 2, 1, 9, 0.0F, false));

		DustCover9 = new ModelRenderer(this);
		DustCover9.setRotationPoint(-3.9F, -37.5F, -21.5F);
		dustcover.addChild(DustCover9);
		DustCover9.cubeList.add(new ModelBox(DustCover9, 99, 384, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		DustCover8 = new ModelRenderer(this);
		DustCover8.setRotationPoint(-3.9F, -37.5F, -21.5F);
		dustcover.addChild(DustCover8);
		setRotationAngle(DustCover8, 0.0F, 0.0F, -0.7808F);
		DustCover8.cubeList.add(new ModelBox(DustCover8, 382, 254, 0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));

		DustCover42 = new ModelRenderer(this);
		DustCover42.setRotationPoint(-2.0F, -39.8F, 0.5F);
		dustcover.addChild(DustCover42);
		setRotationAngle(DustCover42, -0.9295F, 0.0F, 0.0F);
		DustCover42.cubeList.add(new ModelBox(DustCover42, 289, 171, 0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));

		DustCover41 = new ModelRenderer(this);
		DustCover41.setRotationPoint(-2.8F, -39.3F, 0.88F);
		dustcover.addChild(DustCover41);
		setRotationAngle(DustCover41, -0.9295F, 0.0F, 0.0F);
		DustCover41.cubeList.add(new ModelBox(DustCover41, 378, 41, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		DustCover43 = new ModelRenderer(this);
		DustCover43.setRotationPoint(-1.2F, -39.3F, 0.88F);
		dustcover.addChild(DustCover43);
		setRotationAngle(DustCover43, -0.9295F, 0.0F, 0.0F);
		DustCover43.cubeList.add(new ModelBox(DustCover43, 378, 47, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-0.7F, -40.225F, -39.65F);
		dustcover.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 393, 281, -1.8F, -0.2F, 7.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 293, 393, -1.8F, -0.2F, 5.85F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 393, 296, -1.8F, -0.2F, 8.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 393, 299, -1.8F, -0.2F, 9.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 300, 393, -1.8F, -0.2F, 10.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 307, 393, -1.8F, -0.2F, 12.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 314, 393, -1.8F, -0.2F, 13.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 321, 393, -1.8F, -0.2F, 14.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 393, 327, -1.8F, -0.2F, 15.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 393, 330, -1.8F, -0.2F, 17.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 393, 333, -1.8F, -0.2F, 18.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 344, 393, -1.8F, -0.2F, 19.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 351, 393, -1.8F, -0.2F, 20.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 394, -1.8F, -0.2F, 22.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 233, 379, -1.8F, -0.2F, 23.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 28, 394, -1.8F, -0.2F, 24.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 394, 28, -1.8F, -0.2F, 25.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 394, 31, -1.8F, -0.2F, 27.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 394, 34, -1.8F, -0.2F, 28.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 394, 37, -1.8F, -0.2F, 29.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 394, 40, -1.8F, -0.2F, 30.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 55, 394, -1.8F, -0.2F, 32.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 62, 394, -1.8F, -0.2F, 33.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 91, 394, -1.8F, -0.2F, 34.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 98, 394, -1.8F, -0.2F, 35.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 105, 394, -1.8F, -0.2F, 37.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 112, 394, -1.8F, -0.2F, 37.25F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 182, 144, -1.7F, 0.4F, 6.05F, 2, 1, 32, -0.001F, false));
		bone3.cubeList.add(new ModelBox(bone3, 182, 178, -1.9F, 0.4F, 6.05F, 1, 1, 32, 0.0F, false));

		cube_r50 = new ModelRenderer(this);
		cube_r50.setRotationPoint(-1.6F, 0.0F, -1.25F);
		bone3.addChild(cube_r50);
		setRotationAngle(cube_r50, 0.0F, 0.0F, 0.8901F);
		cube_r50.cubeList.add(new ModelBox(cube_r50, 0, 184, -0.25F, -0.05F, 7.2F, 1, 1, 32, -0.35F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 291, 396, -0.2F, -0.2F, 38.5F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 296, 396, -0.2F, -0.2F, 38.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 301, 396, -0.2F, -0.2F, 37.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 306, 396, -0.2F, -0.2F, 35.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 311, 396, -0.2F, -0.2F, 34.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 316, 396, -0.2F, -0.2F, 33.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 321, 396, -0.2F, -0.2F, 32.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 326, 396, -0.2F, -0.2F, 30.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 331, 396, -0.2F, -0.2F, 29.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 343, 396, -0.2F, -0.2F, 28.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 348, 396, -0.2F, -0.2F, 27.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 353, 396, -0.2F, -0.2F, 25.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 330, 384, -0.2F, -0.2F, 24.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 363, 396, -0.2F, -0.2F, 23.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 368, 396, -0.2F, -0.2F, 22.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 373, 396, -0.2F, -0.2F, 20.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 378, 396, -0.2F, -0.2F, 19.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 383, 396, -0.2F, -0.2F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 396, 395, -0.2F, -0.2F, 17.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 0, 397, -0.2F, -0.2F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 397, 13, -0.2F, -0.2F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 14, 397, -0.2F, -0.2F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 397, 16, -0.2F, -0.2F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 19, 397, -0.2F, -0.2F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 24, 397, -0.2F, -0.2F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 29, 397, -0.2F, -0.2F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 51, 397, -0.2F, -0.2F, 7.1F, 1, 1, 1, -0.198F, false));

		cube_r51 = new ModelRenderer(this);
		cube_r51.setRotationPoint(0.0F, 0.0F, -1.25F);
		bone3.addChild(cube_r51);
		setRotationAngle(cube_r51, 0.0F, 0.0F, -0.8901F);
		cube_r51.cubeList.add(new ModelBox(cube_r51, 67, 184, -0.75F, -0.05F, 7.2F, 1, 1, 32, -0.35F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 56, 397, -0.8F, -0.2F, 38.5F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 61, 397, -0.8F, -0.2F, 38.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 89, 397, -0.8F, -0.2F, 37.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 94, 397, -0.8F, -0.2F, 35.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 99, 397, -0.8F, -0.2F, 34.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 104, 397, -0.8F, -0.2F, 33.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 109, 397, -0.8F, -0.2F, 32.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 114, 397, -0.8F, -0.2F, 30.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 163, 397, -0.8F, -0.2F, 29.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 180, 397, -0.8F, -0.2F, 28.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 397, 191, -0.8F, -0.2F, 27.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 397, 194, -0.8F, -0.2F, 25.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 364, 384, -0.8F, -0.2F, 24.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 397, 197, -0.8F, -0.2F, 23.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 397, 200, -0.8F, -0.2F, 22.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 397, 203, -0.8F, -0.2F, 20.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 397, 206, -0.8F, -0.2F, 19.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 397, 209, -0.8F, -0.2F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 397, 212, -0.8F, -0.2F, 17.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 397, 215, -0.8F, -0.2F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 397, 218, -0.8F, -0.2F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 397, 221, -0.8F, -0.2F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 397, 224, -0.8F, -0.2F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 397, 227, -0.8F, -0.2F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 397, 230, -0.8F, -0.2F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 397, 233, -0.8F, -0.2F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 397, 236, -0.8F, -0.2F, 7.1F, 1, 1, 1, -0.198F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.0F, 0.1F, 0.3F);
		dustcover.addChild(bone10);
		

		irons2 = new ModelRenderer(this);
		irons2.setRotationPoint(-1.5F, -46.0465F, 2.2F);
		bone10.addChild(irons2);
		setRotationAngle(irons2, -1.5708F, 0.0F, 0.0F);
		

		bone10_r1 = new ModelRenderer(this);
		bone10_r1.setRotationPoint(0.0F, 0.0786F, 0.1625F);
		irons2.addChild(bone10_r1);
		setRotationAngle(bone10_r1, 1.5708F, 0.0F, 0.0F);
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 396, 48, -0.0465F, 4.0214F, -3.2375F, 1, 2, 1, -0.35F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 398, 9, -0.4F, 4.575F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 398, 6, -0.6F, 4.575F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 46, 396, -0.9535F, 4.0214F, -3.2375F, 1, 2, 1, -0.35F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 397, 342, -0.4F, 3.6679F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 397, 339, -0.6F, 3.6679F, -3.2375F, 1, 1, 1, -0.35F, false));

		bone11_r1 = new ModelRenderer(this);
		bone11_r1.setRotationPoint(0.0F, 0.0786F, 0.1625F);
		irons2.addChild(bone11_r1);
		setRotationAngle(bone11_r1, 1.5708F, -0.7854F, 0.0F);
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 398, 43, 3.2214F, 2.6679F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 398, 25, 3.2214F, 2.8679F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 398, 22, 2.6679F, 3.2214F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 398, 19, 2.8679F, 3.2214F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 5, 398, 2.3143F, 2.8679F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 398, 3, 2.3143F, 2.6679F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 398, 0, 2.8679F, 2.3143F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 397, 345, 2.6679F, 2.3143F, -3.2375F, 1, 1, 1, -0.35F, false));

		sightbase = new ModelRenderer(this);
		sightbase.setRotationPoint(-1.0F, 2.4F, -0.5F);
		bone10.addChild(sightbase);
		sightbase.cubeList.add(new ModelBox(sightbase, 396, 52, -1.0F, -43.0F, -1.0F, 1, 2, 1, -0.2F, false));
		sightbase.cubeList.add(new ModelBox(sightbase, 396, 66, -1.4243F, -43.0F, -0.5757F, 1, 2, 1, -0.2F, false));
		sightbase.cubeList.add(new ModelBox(sightbase, 396, 78, -0.5757F, -43.0F, -0.5757F, 1, 2, 1, -0.2F, false));
		sightbase.cubeList.add(new ModelBox(sightbase, 74, 396, -1.0F, -43.0F, -0.1515F, 1, 2, 1, -0.2F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.5071F, -41.0F, 0.2243F);
		sightbase.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.7854F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 396, 70, -1.0F, -2.0F, -1.0F, 1, 2, 1, -0.2F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.0929F, -41.0F, 0.2243F);
		sightbase.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.7854F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 396, 74, -1.0F, -2.0F, -1.0F, 1, 2, 1, -0.2F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.5071F, -41.0F, -0.3757F);
		sightbase.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.7854F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 69, 396, -1.0F, -2.0F, -1.0F, 1, 2, 1, -0.2F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-0.0929F, -41.0F, -0.3757F);
		sightbase.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.7854F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 396, 62, -1.0F, -2.0F, -1.0F, 1, 2, 1, -0.2F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone10.addChild(bone11);
		bone11.cubeList.add(new ModelBox(bone11, 382, 269, -2.5F, -41.0F, -2.6F, 2, 1, 3, -0.3F, false));
		bone11.cubeList.add(new ModelBox(bone11, 382, 274, -3.0F, -40.925F, -2.9F, 3, 2, 2, -0.2F, false));
		bone11.cubeList.add(new ModelBox(bone11, 173, 209, -3.0F, -40.525F, -2.5F, 3, 1, 1, 0.0F, false));
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