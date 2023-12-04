package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AK200DustCover extends ModelBase {
	private final ModelRenderer dustcover;
	private final ModelRenderer DustCover40;
	private final ModelRenderer DustCover39;
	private final ModelRenderer DustCover43;
	private final ModelRenderer DustCover41;
	private final ModelRenderer DustCover42;
	private final ModelRenderer DustCover8;
	private final ModelRenderer DustCover9;
	private final ModelRenderer DustCover10;
	private final ModelRenderer DustCover44;
	private final ModelRenderer DustCover5;
	private final ModelRenderer DustCover22;
	private final ModelRenderer DustCover35;
	private final ModelRenderer DustCover3;
	private final ModelRenderer DustCover2;
	private final ModelRenderer DustCover4;
	private final ModelRenderer DustCover1;
	private final ModelRenderer DustCover16;
	private final ModelRenderer DustCover47;
	private final ModelRenderer DustCover15;
	private final ModelRenderer DustCover21;
	private final ModelRenderer DustCover14;
	private final ModelRenderer DustCover36;
	private final ModelRenderer DustCover12;
	private final ModelRenderer DustCover11;
	private final ModelRenderer DustCover13;
	private final ModelRenderer DustCover20;
	private final ModelRenderer DustCover38;
	private final ModelRenderer DustCover37;
	private final ModelRenderer DustCover18;
	private final ModelRenderer DustCover17;
	private final ModelRenderer DustCover19;
	private final ModelRenderer bone3;
	private final ModelRenderer bone6_r1;
	private final ModelRenderer cube_r50;
	private final ModelRenderer cube_r51;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;

	public AK200DustCover() {
		textureWidth = 200;
		textureHeight = 200;

		dustcover = new ModelRenderer(this);
		dustcover.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		DustCover40 = new ModelRenderer(this);
		DustCover40.setRotationPoint(-3.7F, -37.5F, 2.2F);
		dustcover.addChild(DustCover40);
		setRotationAngle(DustCover40, -0.9295F, 0.0F, 0.0F);
		DustCover40.cubeList.add(new ModelBox(DustCover40, 0, 85, 0.001F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

		DustCover39 = new ModelRenderer(this);
		DustCover39.setRotationPoint(-1.3F, -37.5F, 2.2F);
		dustcover.addChild(DustCover39);
		setRotationAngle(DustCover39, -0.9295F, 0.0F, 0.0F);
		DustCover39.cubeList.add(new ModelBox(DustCover39, 83, 29, -0.001F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

		DustCover43 = new ModelRenderer(this);
		DustCover43.setRotationPoint(-1.2F, -39.3F, 0.88F);
		dustcover.addChild(DustCover43);
		setRotationAngle(DustCover43, -0.9295F, 0.0F, 0.0F);
		DustCover43.cubeList.add(new ModelBox(DustCover43, 28, 66, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		DustCover41 = new ModelRenderer(this);
		DustCover41.setRotationPoint(-2.8F, -39.3F, 0.88F);
		dustcover.addChild(DustCover41);
		setRotationAngle(DustCover41, -0.9295F, 0.0F, 0.0F);
		DustCover41.cubeList.add(new ModelBox(DustCover41, 65, 49, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		DustCover42 = new ModelRenderer(this);
		DustCover42.setRotationPoint(-2.0F, -39.8F, 0.5F);
		dustcover.addChild(DustCover42);
		setRotationAngle(DustCover42, -0.9295F, 0.0F, 0.0F);
		DustCover42.cubeList.add(new ModelBox(DustCover42, 63, 28, 0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));

		DustCover8 = new ModelRenderer(this);
		DustCover8.setRotationPoint(-3.9F, -37.5F, -21.5F);
		dustcover.addChild(DustCover8);
		setRotationAngle(DustCover8, 0.0F, 0.0F, -0.7808F);
		DustCover8.cubeList.add(new ModelBox(DustCover8, 65, 70, 0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));

		DustCover9 = new ModelRenderer(this);
		DustCover9.setRotationPoint(-3.9F, -37.5F, -21.5F);
		dustcover.addChild(DustCover9);
		DustCover9.cubeList.add(new ModelBox(DustCover9, 82, 35, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		DustCover10 = new ModelRenderer(this);
		DustCover10.setRotationPoint(-3.8F, -37.5F, -19.1F);
		dustcover.addChild(DustCover10);
		setRotationAngle(DustCover10, 0.0F, 0.0F, -0.7436F);
		DustCover10.cubeList.add(new ModelBox(DustCover10, 115, 39, 0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		DustCover44 = new ModelRenderer(this);
		DustCover44.setRotationPoint(-3.7F, -37.5F, -11.0F);
		dustcover.addChild(DustCover44);
		setRotationAngle(DustCover44, 0.0F, 0.0F, -0.7436F);
		DustCover44.cubeList.add(new ModelBox(DustCover44, 141, 108, 0.0F, 0.0F, 0.0F, 1, 1, 12, 0.0F, false));

		DustCover5 = new ModelRenderer(this);
		DustCover5.setRotationPoint(-2.8F, -39.2F, -21.5F);
		dustcover.addChild(DustCover5);
		setRotationAngle(DustCover5, 0.0F, 0.0F, 0.3346F);
		DustCover5.cubeList.add(new ModelBox(DustCover5, 115, 29, 0.0F, 0.0F, -0.001F, 1, 2, 22, 0.0F, false));

		DustCover22 = new ModelRenderer(this);
		DustCover22.setRotationPoint(0.7F, -37.5F, -25.0F);
		dustcover.addChild(DustCover22);
		setRotationAngle(DustCover22, 0.0F, 0.0F, 2.3051F);
		DustCover22.cubeList.add(new ModelBox(DustCover22, 113, 0, 0.0F, 0.0F, 0.0F, 1, 1, 26, 0.0F, false));

		DustCover35 = new ModelRenderer(this);
		DustCover35.setRotationPoint(0.8F, -37.5F, -33.5F);
		dustcover.addChild(DustCover35);
		setRotationAngle(DustCover35, 0.0F, 0.0F, 2.3051F);
		DustCover35.cubeList.add(new ModelBox(DustCover35, 115, 29, 0.05F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		DustCover3 = new ModelRenderer(this);
		DustCover3.setRotationPoint(-0.17F, -39.25F, -33.5F);
		dustcover.addChild(DustCover3);
		setRotationAngle(DustCover3, 0.0F, 0.0F, 1.3013F);
		DustCover3.cubeList.add(new ModelBox(DustCover3, 41, 40, 0.0F, 0.0F, -0.001F, 2, 1, 34, 0.0F, false));

		DustCover2 = new ModelRenderer(this);
		DustCover2.setRotationPoint(-1.0F, -39.8F, -33.5F);
		dustcover.addChild(DustCover2);
		setRotationAngle(DustCover2, 0.0F, 0.0F, 0.5949F);
		DustCover2.cubeList.add(new ModelBox(DustCover2, 79, 35, 0.0F, 0.0F, 0.0F, 1, 1, 34, 0.0F, false));

		DustCover4 = new ModelRenderer(this);
		DustCover4.setRotationPoint(-2.0F, -39.8F, -33.5F);
		dustcover.addChild(DustCover4);
		setRotationAngle(DustCover4, 0.0F, 0.0F, 0.9295F);
		DustCover4.cubeList.add(new ModelBox(DustCover4, 46, 75, 0.0F, 0.0F, 0.0F, 1, 1, 34, 0.0F, false));

		DustCover1 = new ModelRenderer(this);
		DustCover1.setRotationPoint(-2.0F, -39.8F, -33.5F);
		dustcover.addChild(DustCover1);
		DustCover1.cubeList.add(new ModelBox(DustCover1, 47, 0, 0.0F, 0.0F, 0.0F, 1, 1, 34, 0.0F, false));

		DustCover16 = new ModelRenderer(this);
		DustCover16.setRotationPoint(-3.8F, -37.2F, -8.1F);
		dustcover.addChild(DustCover16);
		

		DustCover47 = new ModelRenderer(this);
		DustCover47.setRotationPoint(-3.7F, -36.5F, -9.5F);
		dustcover.addChild(DustCover47);
		DustCover47.cubeList.add(new ModelBox(DustCover47, 64, 28, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		DustCover15 = new ModelRenderer(this);
		DustCover15.setRotationPoint(-3.7F, -36.5F, -9.1F);
		dustcover.addChild(DustCover15);
		DustCover15.cubeList.add(new ModelBox(DustCover15, 147, 128, -0.001F, 0.0F, 0.0F, 1, 1, 11, 0.0F, false));

		DustCover21 = new ModelRenderer(this);
		DustCover21.setRotationPoint(-0.2F, -37.2F, -22.5F);
		dustcover.addChild(DustCover21);
		

		DustCover14 = new ModelRenderer(this);
		DustCover14.setRotationPoint(-3.7F, -37.5F, -10.1F);
		dustcover.addChild(DustCover14);
		DustCover14.cubeList.add(new ModelBox(DustCover14, 131, 53, 0.0F, 0.0F, 0.0F, 1, 1, 12, 0.0F, false));

		DustCover36 = new ModelRenderer(this);
		DustCover36.setRotationPoint(-0.2F, -37.5F, -24.5F);
		dustcover.addChild(DustCover36);
		setRotationAngle(DustCover36, -1.1525F, 0.0F, 0.0F);
		DustCover36.cubeList.add(new ModelBox(DustCover36, 85, 39, -0.074F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		DustCover12 = new ModelRenderer(this);
		DustCover12.setRotationPoint(-3.8F, -37.5F, -10.1F);
		dustcover.addChild(DustCover12);
		setRotationAngle(DustCover12, -0.8923F, 0.0F, 0.0F);
		DustCover12.cubeList.add(new ModelBox(DustCover12, 63, 63, 0.075F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		DustCover11 = new ModelRenderer(this);
		DustCover11.setRotationPoint(-3.8F, -37.5F, -19.1F);
		dustcover.addChild(DustCover11);
		DustCover11.cubeList.add(new ModelBox(DustCover11, 58, 91, 0.001F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		DustCover13 = new ModelRenderer(this);
		DustCover13.setRotationPoint(-3.8F, -35.0F, -9.5F);
		dustcover.addChild(DustCover13);
		setRotationAngle(DustCover13, 2.1935F, 0.0F, 0.0F);
		DustCover13.cubeList.add(new ModelBox(DustCover13, 28, 80, 0.074F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		DustCover20 = new ModelRenderer(this);
		DustCover20.setRotationPoint(-0.3F, -37.5F, -25.0F);
		dustcover.addChild(DustCover20);
		DustCover20.cubeList.add(new ModelBox(DustCover20, 89, 106, 0.0F, 0.0F, 0.0F, 1, 2, 27, 0.0F, false));

		DustCover38 = new ModelRenderer(this);
		DustCover38.setRotationPoint(-0.2F, -37.5F, -33.5F);
		dustcover.addChild(DustCover38);
		DustCover38.cubeList.add(new ModelBox(DustCover38, 35, 90, -0.0335F, 0.0371F, 0.0F, 1, 1, 9, 0.0F, false));

		DustCover37 = new ModelRenderer(this);
		DustCover37.setRotationPoint(-0.2F, -37.0F, -33.5F);
		dustcover.addChild(DustCover37);
		DustCover37.cubeList.add(new ModelBox(DustCover37, 35, 80, -0.026F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		DustCover18 = new ModelRenderer(this);
		DustCover18.setRotationPoint(-3.8F, -36.0F, 2.5F);
		dustcover.addChild(DustCover18);
		DustCover18.cubeList.add(new ModelBox(DustCover18, 79, 72, 0.075F, -0.001F, 0.001F, 4, 1, 1, 0.0F, false));

		DustCover17 = new ModelRenderer(this);
		DustCover17.setRotationPoint(-3.8F, -36.0F, -9.5F);
		dustcover.addChild(DustCover17);
		DustCover17.cubeList.add(new ModelBox(DustCover17, 82, 89, 0.075F, 0.0F, 0.0F, 1, 1, 12, 0.0F, false));

		DustCover19 = new ModelRenderer(this);
		DustCover19.setRotationPoint(-0.2F, -36.0F, -24.5F);
		dustcover.addChild(DustCover19);
		DustCover19.cubeList.add(new ModelBox(DustCover19, 83, 0, -0.075F, -0.002F, 0.002F, 1, 1, 28, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-0.7F, -43.1F, -6.75F);
		dustcover.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 45, 5, -1.8F, 2.5F, -3.5F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 45, 5, -1.8F, 2.5F, -4.7F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 45, 5, -1.8F, 2.5F, -2.25F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 45, 5, -1.8F, 2.5F, -1.0F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 45, 5, -1.8F, 2.5F, 0.25F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 45, 5, -1.8F, 2.5F, 1.5F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 45, 5, -1.8F, 2.5F, 2.75F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 45, 5, -1.8F, 2.5F, 4.0F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 45, 5, -1.8F, 2.5F, 5.25F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 45, 5, -1.8F, 2.5F, 6.4F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 49, 124, -1.7F, 3.1F, -5.8F, 2, 1, 13, -0.001F, false));
		bone3.cubeList.add(new ModelBox(bone3, 50, 124, -1.9F, 3.1F, -5.8F, 1, 1, 13, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 62, 136, -1.9F, 3.1F, 6.8F, 1, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 61, 136, -1.7F, 3.1F, 6.8F, 2, 1, 1, -0.001F, false));
		bone3.cubeList.add(new ModelBox(bone3, 61, 135, -1.9F, 5.1569F, 8.2513F, 1, 2, 2, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 60, 135, -1.7F, 5.1569F, 8.2513F, 2, 2, 2, -0.001F, false));
		bone3.cubeList.add(new ModelBox(bone3, 45, 5, -1.8F, 2.5F, -6.0F, 2, 1, 1, -0.199F, false));

		bone6_r1 = new ModelRenderer(this);
		bone6_r1.setRotationPoint(-0.8F, 4.5483F, 8.2811F);
		bone3.addChild(bone6_r1);
		setRotationAngle(bone6_r1, -0.6981F, 0.0F, 0.0F);
		bone6_r1.cubeList.add(new ModelBox(bone6_r1, 60, 135, 0.3F, -0.9998F, 0.0994F, 1, 2, 2, -0.201F, false));
		bone6_r1.cubeList.add(new ModelBox(bone6_r1, 61, 135, -1.3F, -1.0002F, 0.1006F, 1, 2, 2, -0.2F, false));
		bone6_r1.cubeList.add(new ModelBox(bone6_r1, 59, 134, 0.3F, -0.9998F, -1.5006F, 1, 2, 3, -0.201F, false));
		bone6_r1.cubeList.add(new ModelBox(bone6_r1, 60, 134, -1.3F, -1.0002F, -1.4994F, 1, 2, 3, -0.2F, false));

		cube_r50 = new ModelRenderer(this);
		cube_r50.setRotationPoint(-1.6F, 0.0F, -1.25F);
		bone3.addChild(cube_r50);
		setRotationAngle(cube_r50, 0.0F, 0.0F, 0.8901F);
		cube_r50.cubeList.add(new ModelBox(cube_r50, 45, 5, 1.8983F, 1.4992F, -4.75F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 50, 126, 1.8483F, 1.6492F, -4.35F, 1, 1, 13, -0.35F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 45, 5, 1.8983F, 1.4992F, 6.5F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 45, 5, 1.8983F, 1.4992F, 7.65F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 45, 5, 1.8983F, 1.4992F, 5.25F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 45, 5, 1.8983F, 1.4992F, 4.0F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 45, 5, 1.8983F, 1.4992F, 2.75F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 45, 5, 1.8983F, 1.4992F, 1.5F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 45, 5, 1.8983F, 1.4992F, 0.25F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 45, 5, 1.8983F, 1.4992F, -1.0F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 45, 5, 1.8983F, 1.4992F, -2.25F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 45, 5, 1.8983F, 1.4992F, -3.45F, 1, 1, 1, -0.198F, false));

		cube_r51 = new ModelRenderer(this);
		cube_r51.setRotationPoint(0.0F, 0.0F, -1.25F);
		bone3.addChild(cube_r51);
		setRotationAngle(cube_r51, 0.0F, 0.0F, -0.8901F);
		cube_r51.cubeList.add(new ModelBox(cube_r51, 45, 5, -2.8983F, 1.4992F, -4.75F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 49, 124, -2.8483F, 1.6492F, -4.35F, 1, 1, 13, -0.35F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 45, 5, -2.8983F, 1.4992F, 6.5F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 45, 5, -2.8983F, 1.4992F, 7.65F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 45, 5, -2.8983F, 1.4992F, 5.25F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 45, 5, -2.8983F, 1.4992F, 4.0F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 45, 5, -2.8983F, 1.4992F, 2.75F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 45, 5, -2.8983F, 1.4992F, 1.5F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 45, 5, -2.8983F, 1.4992F, 0.25F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 45, 5, -2.8983F, 1.4992F, -1.0F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 45, 5, -2.8983F, 1.4992F, -2.25F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 45, 5, -2.8983F, 1.4992F, -3.45F, 1, 1, 1, -0.198F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-0.7F, -43.1F, -19.25F);
		dustcover.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 45, 5, -1.8F, 2.5F, -3.5F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 45, 5, -1.8F, 2.5F, -4.7F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 45, 5, -1.8F, 2.5F, -2.25F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 45, 5, -1.8F, 2.5F, -1.0F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 45, 5, -1.8F, 2.5F, 0.25F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 45, 5, -1.8F, 2.5F, 1.5F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 45, 5, -1.8F, 2.5F, 2.75F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 45, 5, -1.8F, 2.5F, 4.0F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 45, 5, -1.8F, 2.5F, 5.25F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 49, 124, -1.7F, 3.1F, -5.8F, 2, 1, 13, -0.001F, false));
		bone2.cubeList.add(new ModelBox(bone2, 50, 124, -1.9F, 3.1F, -5.8F, 1, 1, 13, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 45, 5, -1.8F, 2.5F, -6.0F, 2, 1, 1, -0.199F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.6F, 0.0F, -1.25F);
		bone2.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.8901F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 45, 5, 1.8983F, 1.4992F, -4.75F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 50, 126, 1.8483F, 1.6492F, -4.35F, 1, 1, 13, -0.35F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 45, 5, 1.8983F, 1.4992F, 6.5F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 45, 5, 1.8983F, 1.4992F, 5.25F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 45, 5, 1.8983F, 1.4992F, 4.0F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 45, 5, 1.8983F, 1.4992F, 2.75F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 45, 5, 1.8983F, 1.4992F, 1.5F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 45, 5, 1.8983F, 1.4992F, 0.25F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 45, 5, 1.8983F, 1.4992F, -1.0F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 45, 5, 1.8983F, 1.4992F, -2.25F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 45, 5, 1.8983F, 1.4992F, -3.45F, 1, 1, 1, -0.198F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, -1.25F);
		bone2.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.8901F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 45, 5, -2.8983F, 1.4992F, -4.75F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 49, 124, -2.8483F, 1.6492F, -4.35F, 1, 1, 13, -0.35F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 45, 5, -2.8983F, 1.4992F, 6.5F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 45, 5, -2.8983F, 1.4992F, 5.25F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 45, 5, -2.8983F, 1.4992F, 4.0F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 45, 5, -2.8983F, 1.4992F, 2.75F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 45, 5, -2.8983F, 1.4992F, 1.5F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 45, 5, -2.8983F, 1.4992F, 0.25F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 45, 5, -2.8983F, 1.4992F, -1.0F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 45, 5, -2.8983F, 1.4992F, -2.25F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 45, 5, -2.8983F, 1.4992F, -3.45F, 1, 1, 1, -0.198F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-0.7F, -43.1F, -31.75F);
		dustcover.addChild(bone4);
		bone4.cubeList.add(new ModelBox(bone4, 45, 5, -1.8F, 2.5F, -1.0F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 45, 5, -1.8F, 2.5F, 0.25F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 45, 5, -1.8F, 2.5F, 1.5F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 45, 5, -1.8F, 2.5F, 2.75F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 45, 5, -1.8F, 2.5F, 4.0F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 45, 5, -1.8F, 2.5F, 5.25F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 53, 128, -1.7F, 3.1F, -1.8F, 2, 1, 9, -0.001F, false));
		bone4.cubeList.add(new ModelBox(bone4, 54, 128, -1.9F, 3.1F, -1.8F, 1, 1, 9, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 56, 131, -1.7F, 2.8F, -6.8F, 2, 1, 6, -0.001F, false));
		bone4.cubeList.add(new ModelBox(bone4, 57, 131, -1.9F, 2.8F, -6.8F, 1, 1, 6, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 60, 135, -1.7F, 2.3F, -6.8F, 2, 1, 2, -0.001F, false));
		bone4.cubeList.add(new ModelBox(bone4, 61, 135, -1.9F, 2.3F, -6.8F, 1, 1, 2, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.6F, 0.0F, -1.25F);
		bone4.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.8901F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 55, 131, 1.8483F, 1.6492F, 0.65F, 1, 1, 8, -0.35F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 45, 5, 1.8983F, 1.4992F, 6.5F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 45, 5, 1.8983F, 1.4992F, 5.25F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 45, 5, 1.8983F, 1.4992F, 4.0F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 45, 5, 1.8983F, 1.4992F, 2.75F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 45, 5, 1.8983F, 1.4992F, 1.5F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 45, 5, 1.8983F, 1.4992F, 0.25F, 1, 1, 1, -0.198F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.0F, -1.25F);
		bone4.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.8901F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 54, 129, -2.8483F, 1.6492F, 0.65F, 1, 1, 8, -0.35F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 45, 5, -2.8983F, 1.4992F, 6.5F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 45, 5, -2.8983F, 1.4992F, 5.25F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 45, 5, -2.8983F, 1.4992F, 4.0F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 45, 5, -2.8983F, 1.4992F, 2.75F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 45, 5, -2.8983F, 1.4992F, 1.5F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 45, 5, -2.8983F, 1.4992F, 0.25F, 1, 1, 1, -0.198F, false));
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