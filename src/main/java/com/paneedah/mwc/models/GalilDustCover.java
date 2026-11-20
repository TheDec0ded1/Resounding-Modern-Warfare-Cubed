package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class GalilDustCover extends ModelBase {
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
	private final ModelRenderer bone6;
	private final ModelRenderer DustCover8_r1;
	private final ModelRenderer DustCover9_r1;
	private final ModelRenderer DustCover7_r1;
	private final ModelRenderer DustCover6_r1;
	private final ModelRenderer DustCover9_r2;
	private final ModelRenderer DustCover8_r2;
	private final ModelRenderer DustCover8_r3;
	private final ModelRenderer DustCover7_r2;
	private final ModelRenderer DustCover6_r2;
	private final ModelRenderer DustCover5_r1;
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
	private final ModelRenderer rearIron;

	public GalilDustCover() {
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
		DustCover35.cubeList.add(new ModelBox(DustCover35, 115, 29, 0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

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
		DustCover1.cubeList.add(new ModelBox(DustCover1, 61, 14, 0.0F, 0.0F, 0.0F, 1, 1, 20, 0.0F, false));
		DustCover1.cubeList.add(new ModelBox(DustCover1, 48, 124, -0.5F, 0.0F, 20.0F, 2, 1, 14, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(4.0F, 39.5F, 33.9F);
		DustCover1.addChild(bone6);
		bone6.cubeList.add(new ModelBox(bone6, 58, 134, -5.1F, -40.7F, -3.5F, 1, 2, 4, -0.4F, false));
		bone6.cubeList.add(new ModelBox(bone6, 61, 137, -5.1F, -43.3613F, -1.6273F, 1, 2, 1, -0.4F, false));
		bone6.cubeList.add(new ModelBox(bone6, 61, 137, -5.1F, -43.3613F, -1.8273F, 1, 2, 1, -0.4F, false));
		bone6.cubeList.add(new ModelBox(bone6, 61, 137, -5.1F, -43.3613F, -2.0273F, 1, 2, 1, -0.4F, false));
		bone6.cubeList.add(new ModelBox(bone6, 61, 137, -5.1F, -43.3613F, -2.3727F, 1, 2, 1, -0.4F, false));
		bone6.cubeList.add(new ModelBox(bone6, 61, 137, -5.1F, -43.3613F, -2.1727F, 1, 2, 1, -0.4F, false));
		bone6.cubeList.add(new ModelBox(bone6, 58, 134, -2.9F, -40.7F, -3.5F, 1, 2, 4, -0.4F, false));
		bone6.cubeList.add(new ModelBox(bone6, 61, 137, -2.9F, -43.3613F, -1.6273F, 1, 2, 1, -0.4F, false));
		bone6.cubeList.add(new ModelBox(bone6, 61, 137, -2.9F, -43.3613F, -1.8273F, 1, 2, 1, -0.4F, false));
		bone6.cubeList.add(new ModelBox(bone6, 61, 137, -2.9F, -43.3613F, -2.0273F, 1, 2, 1, -0.4F, false));
		bone6.cubeList.add(new ModelBox(bone6, 61, 137, -2.9F, -43.3613F, -2.3727F, 1, 2, 1, -0.4F, false));
		bone6.cubeList.add(new ModelBox(bone6, 61, 137, -2.9F, -43.3613F, -2.1727F, 1, 2, 1, -0.4F, false));
		bone6.cubeList.add(new ModelBox(bone6, 61, 137, -4.5F, -40.8F, -0.5F, 2, 2, 1, -0.4F, false));
		bone6.cubeList.add(new ModelBox(bone6, 60, 136, -4.5F, -41.1F, -1.9F, 2, 1, 2, -0.4F, false));
		bone6.cubeList.add(new ModelBox(bone6, 61, 137, -5.0F, -40.1F, -0.5F, 3, 1, 1, -0.4F, false));
		bone6.cubeList.add(new ModelBox(bone6, 61, 137, -5.0F, -41.2F, -2.0F, 3, 1, 1, -0.3F, false));
		bone6.cubeList.add(new ModelBox(bone6, 55, 131, -5.0F, -40.6F, -7.0F, 3, 2, 7, -0.5F, false));
		bone6.cubeList.add(new ModelBox(bone6, 60, 136, -5.0F, -41.6F, -6.5F, 3, 2, 2, -0.5F, false));
		bone6.cubeList.add(new ModelBox(bone6, 38, 184, -4.0F, -41.3F, -5.2F, 1, 1, 2, -0.2F, false));
		bone6.cubeList.add(new ModelBox(bone6, 38, 184, -4.6F, -41.3F, -4.6F, 1, 1, 2, -0.2F, false));
		bone6.cubeList.add(new ModelBox(bone6, 38, 184, -3.4F, -41.3F, -4.6F, 1, 1, 2, -0.2F, false));

		DustCover8_r1 = new ModelRenderer(this);
		DustCover8_r1.setRotationPoint(-2.4F, -42.2892F, -1.9067F);
		bone6.addChild(DustCover8_r1);
		setRotationAngle(DustCover8_r1, -0.6981F, 0.0F, 0.0F);
		DustCover8_r1.cubeList.add(new ModelBox(DustCover8_r1, 60, 136, -0.5F, -0.5F, -1.0F, 1, 1, 2, -0.4F, false));
		DustCover8_r1.cubeList.add(new ModelBox(DustCover8_r1, 60, 136, -2.7F, -0.5F, -1.0F, 1, 1, 2, -0.4F, false));

		DustCover9_r1 = new ModelRenderer(this);
		DustCover9_r1.setRotationPoint(-2.4F, -42.2892F, -1.0933F);
		bone6.addChild(DustCover9_r1);
		setRotationAngle(DustCover9_r1, 0.6981F, 0.0F, 0.0F);
		DustCover9_r1.cubeList.add(new ModelBox(DustCover9_r1, 60, 136, -0.5F, -0.5F, -1.0F, 1, 1, 2, -0.4F, false));
		DustCover9_r1.cubeList.add(new ModelBox(DustCover9_r1, 60, 136, -2.7F, -0.5F, -1.0F, 1, 1, 2, -0.4F, false));

		DustCover7_r1 = new ModelRenderer(this);
		DustCover7_r1.setRotationPoint(-2.4F, -42.6447F, -1.711F);
		bone6.addChild(DustCover7_r1);
		setRotationAngle(DustCover7_r1, -0.5236F, 0.0F, 0.0F);
		DustCover7_r1.cubeList.add(new ModelBox(DustCover7_r1, 58, 140, -0.5F, 0.0F, -1.0F, 1, 1, 2, -0.4F, false));
		DustCover7_r1.cubeList.add(new ModelBox(DustCover7_r1, 58, 140, -2.7F, 0.0F, -1.0F, 1, 1, 2, -0.4F, false));

		DustCover6_r1 = new ModelRenderer(this);
		DustCover6_r1.setRotationPoint(-2.4F, -41.7786F, -0.789F);
		bone6.addChild(DustCover6_r1);
		setRotationAngle(DustCover6_r1, 0.5236F, 0.0F, 0.0F);
		DustCover6_r1.cubeList.add(new ModelBox(DustCover6_r1, 57, 135, -0.5F, -1.0F, -1.0F, 1, 1, 2, -0.4F, false));
		DustCover6_r1.cubeList.add(new ModelBox(DustCover6_r1, 57, 135, -2.7F, -1.0F, -1.0F, 1, 1, 2, -0.4F, false));

		DustCover9_r2 = new ModelRenderer(this);
		DustCover9_r2.setRotationPoint(-2.4F, -42.3633F, -1.1386F);
		bone6.addChild(DustCover9_r2);
		setRotationAngle(DustCover9_r2, 1.2217F, 0.0F, 0.0F);
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 60, 136, -0.5F, -0.5F, -1.0F, 1, 1, 2, -0.4F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 60, 136, -2.7F, -0.5F, -1.0F, 1, 1, 2, -0.4F, false));

		DustCover8_r2 = new ModelRenderer(this);
		DustCover8_r2.setRotationPoint(-2.4F, -42.3633F, -1.8614F);
		bone6.addChild(DustCover8_r2);
		setRotationAngle(DustCover8_r2, -1.2217F, 0.0F, 0.0F);
		DustCover8_r2.cubeList.add(new ModelBox(DustCover8_r2, 60, 136, -0.5F, -0.5F, -1.0F, 1, 1, 2, -0.4F, false));
		DustCover8_r2.cubeList.add(new ModelBox(DustCover8_r2, 60, 136, -2.7F, -0.5F, -1.0F, 1, 1, 2, -0.4F, false));

		DustCover8_r3 = new ModelRenderer(this);
		DustCover8_r3.setRotationPoint(-2.4F, -42.3979F, -1.1929F);
		bone6.addChild(DustCover8_r3);
		setRotationAngle(DustCover8_r3, 0.7854F, 0.0F, 0.0F);
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 60, 136, -0.5F, -0.5F, -1.0F, 1, 1, 2, -0.4F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 60, 136, -2.7F, -0.5F, -1.0F, 1, 1, 2, -0.4F, false));

		DustCover7_r2 = new ModelRenderer(this);
		DustCover7_r2.setRotationPoint(-2.4F, -42.3979F, -1.8071F);
		bone6.addChild(DustCover7_r2);
		setRotationAngle(DustCover7_r2, -0.7854F, 0.0F, 0.0F);
		DustCover7_r2.cubeList.add(new ModelBox(DustCover7_r2, 60, 136, -0.5F, -0.5F, -1.0F, 1, 1, 2, -0.4F, false));
		DustCover7_r2.cubeList.add(new ModelBox(DustCover7_r2, 60, 136, -2.7F, -0.5F, -1.0F, 1, 1, 2, -0.4F, false));

		DustCover6_r2 = new ModelRenderer(this);
		DustCover6_r2.setRotationPoint(-2.4F, -40.7243F, -2.3652F);
		bone6.addChild(DustCover6_r2);
		setRotationAngle(DustCover6_r2, -0.2618F, 0.0F, 0.0F);
		DustCover6_r2.cubeList.add(new ModelBox(DustCover6_r2, 58, 140, -0.5F, -2.0F, -1.0F, 1, 3, 2, -0.4F, false));
		DustCover6_r2.cubeList.add(new ModelBox(DustCover6_r2, 58, 140, -2.7F, -2.0F, -1.0F, 1, 3, 2, -0.4F, false));

		DustCover5_r1 = new ModelRenderer(this);
		DustCover5_r1.setRotationPoint(-2.4F, -40.7243F, -0.6348F);
		bone6.addChild(DustCover5_r1);
		setRotationAngle(DustCover5_r1, 0.2618F, 0.0F, 0.0F);
		DustCover5_r1.cubeList.add(new ModelBox(DustCover5_r1, 56, 134, -0.5F, -2.0F, -2.0F, 1, 3, 3, -0.4F, false));
		DustCover5_r1.cubeList.add(new ModelBox(DustCover5_r1, 56, 134, -2.7F, -2.0F, -2.0F, 1, 3, 3, -0.4F, false));

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
		DustCover36.cubeList.add(new ModelBox(DustCover36, 85, 39, 0.001F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		DustCover12 = new ModelRenderer(this);
		DustCover12.setRotationPoint(-3.8F, -37.5F, -10.1F);
		dustcover.addChild(DustCover12);
		setRotationAngle(DustCover12, -0.8923F, 0.0F, 0.0F);
		DustCover12.cubeList.add(new ModelBox(DustCover12, 63, 63, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		DustCover11 = new ModelRenderer(this);
		DustCover11.setRotationPoint(-3.8F, -37.5F, -19.1F);
		dustcover.addChild(DustCover11);
		DustCover11.cubeList.add(new ModelBox(DustCover11, 66, 99, 0.001F, 0.0F, 8.0F, 1, 1, 1, 0.0F, false));

		DustCover13 = new ModelRenderer(this);
		DustCover13.setRotationPoint(-3.8F, -35.0F, -9.5F);
		dustcover.addChild(DustCover13);
		setRotationAngle(DustCover13, 2.1935F, 0.0F, 0.0F);
		DustCover13.cubeList.add(new ModelBox(DustCover13, 28, 80, -0.001F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		DustCover20 = new ModelRenderer(this);
		DustCover20.setRotationPoint(-0.3F, -37.5F, -25.0F);
		dustcover.addChild(DustCover20);
		DustCover20.cubeList.add(new ModelBox(DustCover20, 89, 106, 0.0F, 0.0F, 0.0F, 1, 2, 27, 0.0F, false));

		DustCover38 = new ModelRenderer(this);
		DustCover38.setRotationPoint(-0.2F, -37.5F, -33.5F);
		dustcover.addChild(DustCover38);
		DustCover38.cubeList.add(new ModelBox(DustCover38, 35, 90, 0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		DustCover37 = new ModelRenderer(this);
		DustCover37.setRotationPoint(-0.2F, -37.0F, -33.5F);
		dustcover.addChild(DustCover37);
		DustCover37.cubeList.add(new ModelBox(DustCover37, 35, 80, -0.001F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		DustCover18 = new ModelRenderer(this);
		DustCover18.setRotationPoint(-3.8F, -36.0F, 2.5F);
		dustcover.addChild(DustCover18);
		DustCover18.cubeList.add(new ModelBox(DustCover18, 79, 72, 0.0F, -0.001F, 0.001F, 4, 1, 1, 0.0F, false));

		DustCover17 = new ModelRenderer(this);
		DustCover17.setRotationPoint(-3.8F, -36.0F, -9.5F);
		dustcover.addChild(DustCover17);
		DustCover17.cubeList.add(new ModelBox(DustCover17, 82, 89, 0.0F, 0.0F, 0.0F, 1, 1, 12, 0.0F, false));

		DustCover19 = new ModelRenderer(this);
		DustCover19.setRotationPoint(-0.2F, -36.0F, -24.5F);
		dustcover.addChild(DustCover19);
		DustCover19.cubeList.add(new ModelBox(DustCover19, 83, 0, 0.0F, -0.002F, 0.002F, 1, 1, 28, 0.0F, false));

		rearIron = new ModelRenderer(this);
		rearIron.setRotationPoint(0.0F, -1.9F, 41.0F);
		dustcover.addChild(rearIron);
		rearIron.cubeList.add(new ModelBox(rearIron, 41, 117, -1.6F, -40.56F, -42.78F, 1, 1, 1, -0.4F, false));
		rearIron.cubeList.add(new ModelBox(rearIron, 97, 64, -1.8F, -40.56F, -42.78F, 1, 1, 1, -0.4F, false));
		rearIron.cubeList.add(new ModelBox(rearIron, 98, 24, -1.6F, -40.16F, -42.78F, 1, 1, 1, -0.4F, false));
		rearIron.cubeList.add(new ModelBox(rearIron, 98, 39, -1.7F, -40.16F, -42.78F, 1, 1, 1, -0.4F, false));
		rearIron.cubeList.add(new ModelBox(rearIron, 98, 22, -1.7F, -40.36F, -42.78F, 1, 1, 1, -0.4F, false));
		rearIron.cubeList.add(new ModelBox(rearIron, 98, 24, -1.6F, -40.36F, -42.78F, 1, 1, 1, -0.401F, false));
		rearIron.cubeList.add(new ModelBox(rearIron, 98, 29, -1.8F, -40.66F, -42.78F, 1, 1, 1, -0.4F, false));
		rearIron.cubeList.add(new ModelBox(rearIron, 95, 29, -1.6F, -40.66F, -42.78F, 1, 1, 1, -0.4F, false));
		rearIron.cubeList.add(new ModelBox(rearIron, 70, 135, -2.3F, -40.36F, -42.78F, 1, 1, 1, -0.4F, false));
		rearIron.cubeList.add(new ModelBox(rearIron, 97, 93, -2.4F, -40.36F, -42.78F, 1, 1, 1, -0.401F, false));
		rearIron.cubeList.add(new ModelBox(rearIron, 75, 92, -2.0F, -40.66F, -42.78F, 1, 1, 1, -0.4F, false));
		rearIron.cubeList.add(new ModelBox(rearIron, 82, 80, -2.2F, -40.66F, -42.78F, 1, 1, 1, -0.4F, false));
		rearIron.cubeList.add(new ModelBox(rearIron, 94, 100, -2.4F, -40.66F, -42.78F, 1, 1, 1, -0.4F, false));
		rearIron.cubeList.add(new ModelBox(rearIron, 97, 96, -2.3F, -40.16F, -42.78F, 1, 1, 1, -0.4F, false));
		rearIron.cubeList.add(new ModelBox(rearIron, 62, 136, -2.4F, -40.16F, -42.78F, 1, 1, 1, -0.4F, false));
		rearIron.cubeList.add(new ModelBox(rearIron, 98, 2, -2.2F, -40.56F, -42.78F, 1, 1, 1, -0.4F, false));
		rearIron.cubeList.add(new ModelBox(rearIron, 73, 136, -2.4F, -40.56F, -42.78F, 1, 1, 1, -0.4F, false));
		rearIron.cubeList.add(new ModelBox(rearIron, 98, 0, -2.0F, -40.56F, -42.78F, 1, 1, 1, -0.4F, false));
		rearIron.cubeList.add(new ModelBox(rearIron, 98, 0, -2.0F, -39.86F, -42.78F, 1, 1, 1, -0.4F, false));
		rearIron.cubeList.add(new ModelBox(rearIron, 73, 136, -2.4F, -39.86F, -42.78F, 1, 1, 1, -0.4F, false));
		rearIron.cubeList.add(new ModelBox(rearIron, 98, 2, -2.2F, -39.86F, -42.78F, 1, 1, 1, -0.4F, false));
		rearIron.cubeList.add(new ModelBox(rearIron, 94, 100, -2.4F, -39.96F, -42.78F, 1, 1, 1, -0.4F, false));
		rearIron.cubeList.add(new ModelBox(rearIron, 82, 80, -2.2F, -39.96F, -42.78F, 1, 1, 1, -0.4F, false));
		rearIron.cubeList.add(new ModelBox(rearIron, 75, 92, -2.0F, -39.96F, -42.78F, 1, 1, 1, -0.4F, false));
		rearIron.cubeList.add(new ModelBox(rearIron, 95, 29, -1.6F, -39.96F, -42.78F, 1, 1, 1, -0.4F, false));
		rearIron.cubeList.add(new ModelBox(rearIron, 98, 29, -1.8F, -39.96F, -42.78F, 1, 1, 1, -0.4F, false));
		rearIron.cubeList.add(new ModelBox(rearIron, 97, 64, -1.8F, -39.86F, -42.78F, 1, 1, 1, -0.4F, false));
		rearIron.cubeList.add(new ModelBox(rearIron, 41, 117, -1.6F, -39.86F, -42.78F, 1, 1, 1, -0.4F, false));
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