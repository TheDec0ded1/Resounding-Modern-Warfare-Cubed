package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.10.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class PKMCover extends ModelWithAttachments {
	private final ModelRenderer topCoverRussian;
	private final ModelRenderer DustCover40;
	private final ModelRenderer DustCover39;
	private final ModelRenderer DustCover43;
	private final ModelRenderer DustCover41;
	private final ModelRenderer DustCover44;
	private final ModelRenderer DustCover22;
	private final ModelRenderer DustCover21;
	private final ModelRenderer DustCover20;
	private final ModelRenderer DustCover18;
	private final ModelRenderer DustCover17;
	private final ModelRenderer DustCover19;
	private final ModelRenderer ironsights;
	private final ModelRenderer cube_r42;
	private final ModelRenderer cube_r43;
	private final ModelRenderer cube_r44;
	private final ModelRenderer cube_r45;
	private final ModelRenderer gun377;
	private final ModelRenderer gun378;
	private final ModelRenderer gun379;
	private final ModelRenderer gun380;
	private final ModelRenderer gun129;
	private final ModelRenderer gun130;
	private final ModelRenderer cube_r42_r1;
	private final ModelRenderer cube_r44_r1;
	private final ModelRenderer cube_r43_r1;
	private final ModelRenderer cube_r44_r2;
	private final ModelRenderer cube_r45_r1;
	private final ModelRenderer DustCover48_r1;
	private final ModelRenderer DustCover47_r1;
	private final ModelRenderer DustCover47_r2;
	private final ModelRenderer DustCover46_r1;
	private final ModelRenderer DustCover26_r1;
	private final ModelRenderer DustCover25_r1;
	private final ModelRenderer DustCover25_r2;
	private final ModelRenderer DustCover24_r1;
	private final ModelRenderer DustCover23_r1;
	private final ModelRenderer DustCover23_r2;
	private final ModelRenderer DustCover25_r3;
	private final ModelRenderer DustCover25_r4;
	private final ModelRenderer DustCover24_r2;
	private final ModelRenderer DustCover29_r1;
	private final ModelRenderer DustCover28_r1;
	private final ModelRenderer DustCover27_r1;
	private final ModelRenderer DustCover26_r2;
	private final ModelRenderer DustCover25_r5;
	private final ModelRenderer DustCover24_r3;
	private final ModelRenderer DustCover25_r6;
	private final ModelRenderer DustCover26_r3;
	private final ModelRenderer DustCover25_r7;
	private final ModelRenderer DustCover26_r4;
	private final ModelRenderer DustCover25_r8;
	private final ModelRenderer DustCover24_r4;
	private final ModelRenderer DustCover23_r3;
	private final ModelRenderer DustCover24_r5;
	private final ModelRenderer DustCover25_r9;
	private final ModelRenderer DustCover24_r6;
	private final ModelRenderer DustCover24_r7;
	private final ModelRenderer DustCover24_r8;
	private final ModelRenderer DustCover23_r4;
	private final ModelRenderer DustCover24_r9;
	private final ModelRenderer DustCover23_r5;
	private final ModelRenderer DustCover22_r1;
	private final ModelRenderer DustCover23_r6;
	private final ModelRenderer DustCover22_r2;
	private final ModelRenderer DustCover21_r1;
	private final ModelRenderer DustCover22_r3;
	private final ModelRenderer ironsights_r1;

	public PKMCover() {
		textureWidth = 512;
		textureHeight = 512;

		topCoverRussian = new ModelRenderer(this);
		topCoverRussian.setRotationPoint(-1.5F, -16.3F, -34.7F);
		setRotationAngle(topCoverRussian, 0.0F, 0.0F, 0.0F);
		

		DustCover40 = new ModelRenderer(this);
		DustCover40.setRotationPoint(-2.2F, 1.8F, 37.0F);
		topCoverRussian.addChild(DustCover40);
		setRotationAngle(DustCover40, -0.9295F, 0.0F, 0.0F);
		DustCover40.cubeList.add(new ModelBox(DustCover40, 86, 169, -0.599F, 0.0F, -1.0F, 2, 1, 3, 0.0F, false));

		DustCover39 = new ModelRenderer(this);
		DustCover39.setRotationPoint(0.2F, 1.8F, 37.0F);
		topCoverRussian.addChild(DustCover39);
		setRotationAngle(DustCover39, -0.9295F, 0.0F, 0.0F);
		DustCover39.cubeList.add(new ModelBox(DustCover39, 171, 21, 0.599F, 0.0F, -1.0F, 2, 1, 3, 0.0F, false));

		DustCover43 = new ModelRenderer(this);
		DustCover43.setRotationPoint(0.3F, 0.0F, 35.68F);
		topCoverRussian.addChild(DustCover43);
		setRotationAngle(DustCover43, -0.9295F, 0.0F, 0.0F);
		DustCover43.cubeList.add(new ModelBox(DustCover43, 144, 161, -0.6F, -0.0203F, -0.86F, 2, 1, 5, 0.0F, false));

		DustCover41 = new ModelRenderer(this);
		DustCover41.setRotationPoint(-1.3F, 0.0F, 35.68F);
		topCoverRussian.addChild(DustCover41);
		setRotationAngle(DustCover41, -0.9295F, 0.0F, 0.0F);
		DustCover41.cubeList.add(new ModelBox(DustCover41, 144, 45, -0.6F, -0.0203F, -0.86F, 2, 1, 5, 0.0F, false));

		DustCover44 = new ModelRenderer(this);
		DustCover44.setRotationPoint(-2.2F, -1.2F, 23.8F);
		topCoverRussian.addChild(DustCover44);
		setRotationAngle(DustCover44, 0.0F, 0.0F, -0.7436F);
		DustCover44.cubeList.add(new ModelBox(DustCover44, 240, 120, -1.7953F, 1.0643F, -6.1982F, 1, 1, 18, 0.0F, false));

		DustCover48_r1 = new ModelRenderer(this);
		DustCover48_r1.setRotationPoint(1.555F, 1.5576F, -13.8757F);
		DustCover44.addChild(DustCover48_r1);
		setRotationAngle(DustCover48_r1, -0.3306F, -0.2901F, 0.0487F);
		DustCover48_r1.cubeList.add(new ModelBox(DustCover48_r1, 156, 79, -1.8815F, -2.0905F, -0.5003F, 1, 1, 1, 0.0F, false));

		DustCover47_r1 = new ModelRenderer(this);
		DustCover47_r1.setRotationPoint(2.4566F, -2.6677F, -9.1401F);
		DustCover44.addChild(DustCover47_r1);
		setRotationAngle(DustCover47_r1, -0.6345F, -0.4991F, 0.167F);
		DustCover47_r1.cubeList.add(new ModelBox(DustCover47_r1, 156, 143, -4.2343F, 3.7128F, -0.5684F, 1, 1, 1, 0.0F, false));
		DustCover47_r1.cubeList.add(new ModelBox(DustCover47_r1, 85, 116, -1.3623F, 0.5901F, 4.6542F, 1, 1, 2, 0.0F, false));

		DustCover47_r2 = new ModelRenderer(this);
		DustCover47_r2.setRotationPoint(2.184F, 0.8737F, -7.5926F);
		DustCover44.addChild(DustCover47_r2);
		setRotationAngle(DustCover47_r2, -0.228F, -0.205F, 0.0236F);
		DustCover47_r2.cubeList.add(new ModelBox(DustCover47_r2, 59, 65, -2.8951F, -0.9885F, 0.4993F, 1, 1, 1, -0.1F, false));

		DustCover46_r1 = new ModelRenderer(this);
		DustCover46_r1.setRotationPoint(1.8956F, 1.1873F, -9.459F);
		DustCover44.addChild(DustCover46_r1);
		setRotationAngle(DustCover46_r1, 0.0F, 0.0F, 0.0F);
		DustCover46_r1.cubeList.add(new ModelBox(DustCover46_r1, 15, 103, -2.761F, -1.1343F, -3.3495F, 1, 1, 6, 0.0F, false));

		DustCover22 = new ModelRenderer(this);
		DustCover22.setRotationPoint(2.2F, 1.8F, 9.8F);
		topCoverRussian.addChild(DustCover22);
		setRotationAngle(DustCover22, 0.0F, 0.0F, 2.3051F);
		DustCover22.cubeList.add(new ModelBox(DustCover22, 238, 191, -1.1447F, 0.2263F, 7.8018F, 1, 1, 18, 0.0F, false));

		DustCover26_r1 = new ModelRenderer(this);
		DustCover26_r1.setRotationPoint(-0.6824F, 3.5812F, 0.1243F);
		DustCover22.addChild(DustCover26_r1);
		setRotationAngle(DustCover26_r1, 0.3028F, 0.3191F, 0.0491F);
		DustCover26_r1.cubeList.add(new ModelBox(DustCover26_r1, 156, 152, -2.0732F, -1.9006F, -0.4989F, 1, 1, 1, 0.0F, false));

		DustCover25_r1 = new ModelRenderer(this);
		DustCover25_r1.setRotationPoint(-4.9138F, 4.4412F, 4.8588F);
		DustCover22.addChild(DustCover25_r1);
		setRotationAngle(DustCover25_r1, 0.5904F, 0.5526F, 0.172F);
		DustCover25_r1.cubeList.add(new ModelBox(DustCover25_r1, 156, 145, 3.7497F, -4.1973F, -0.5684F, 1, 1, 1, 0.0F, false));
		DustCover25_r1.cubeList.add(new ModelBox(DustCover25_r1, 49, 170, 0.6004F, -1.3545F, 4.6542F, 1, 1, 2, 0.0F, false));

		DustCover25_r2 = new ModelRenderer(this);
		DustCover25_r2.setRotationPoint(-1.3729F, 4.2045F, 6.4044F);
		DustCover22.addChild(DustCover25_r2);
		setRotationAngle(DustCover25_r2, 0.2082F, 0.2251F, 0.0236F);
		DustCover25_r2.cubeList.add(new ModelBox(DustCover25_r2, 148, 156, -0.9617F, -2.9039F, 0.5007F, 1, 1, 1, -0.1F, false));

		DustCover24_r1 = new ModelRenderer(this);
		DustCover24_r1.setRotationPoint(-1.0559F, 3.9183F, 4.541F);
		DustCover22.addChild(DustCover24_r1);
		setRotationAngle(DustCover24_r1, 0.0F, 0.0F, 0.0F);
		DustCover24_r1.cubeList.add(new ModelBox(DustCover24_r1, 192, 54, -1.1088F, -2.7712F, -3.3481F, 1, 1, 6, 0.0F, false));

		DustCover21 = new ModelRenderer(this);
		DustCover21.setRotationPoint(1.3F, 2.1F, 12.3F);
		topCoverRussian.addChild(DustCover21);
		DustCover21.cubeList.add(new ModelBox(DustCover21, 0, 284, 0.799F, -0.4013F, 6.1018F, 1, 1, 16, -0.1F, false));
		DustCover21.cubeList.add(new ModelBox(DustCover21, 144, 263, -4.401F, -0.4013F, 6.1018F, 1, 1, 16, -0.1F, false));

		DustCover23_r1 = new ModelRenderer(this);
		DustCover23_r1.setRotationPoint(-6.4005F, -0.5294F, 0.5952F);
		DustCover21.addChild(DustCover23_r1);
		setRotationAngle(DustCover23_r1, -0.2618F, 0.0F, 0.0F);
		DustCover23_r1.cubeList.add(new ModelBox(DustCover23_r1, 98, 169, 1.9995F, -1.358F, -2.2184F, 1, 1, 8, -0.1F, false));
		DustCover23_r1.cubeList.add(new ModelBox(DustCover23_r1, 26, 168, 7.1995F, -1.358F, -2.2184F, 1, 1, 8, -0.1F, false));

		DustCover20 = new ModelRenderer(this);
		DustCover20.setRotationPoint(1.2F, 1.8F, 9.8F);
		topCoverRussian.addChild(DustCover20);
		DustCover20.cubeList.add(new ModelBox(DustCover20, 176, 190, 0.599F, -1.0F, 8.2F, 1, 3, 18, 0.0F, false));
		DustCover20.cubeList.add(new ModelBox(DustCover20, 173, 96, -4.001F, -1.0F, 8.2F, 1, 3, 18, 0.0F, false));
		DustCover20.cubeList.add(new ModelBox(DustCover20, 155, 134, -6.001F, -2.5041F, -9.9754F, 3, 2, 1, 0.0F, false));
		DustCover20.cubeList.add(new ModelBox(DustCover20, 153, 56, -6.001F, -2.2041F, -1.1754F, 3, 2, 1, 0.0F, false));
		DustCover20.cubeList.add(new ModelBox(DustCover20, 155, 120, 0.599F, -1.5541F, -10.0004F, 1, 1, 3, 0.0F, false));
		DustCover20.cubeList.add(new ModelBox(DustCover20, 132, 90, 0.599F, -1.5541F, -7.3004F, 1, 1, 1, 0.0F, false));
		DustCover20.cubeList.add(new ModelBox(DustCover20, 135, 66, 0.599F, -1.5541F, -2.0004F, 1, 1, 1, 0.0F, false));
		DustCover20.cubeList.add(new ModelBox(DustCover20, 132, 88, 0.599F, -1.5541F, -2.3004F, 1, 1, 1, 0.0F, false));
		DustCover20.cubeList.add(new ModelBox(DustCover20, 33, 30, -0.1433F, -2.1714F, 7.8018F, 1, 2, 17, 0.0F, false));
		DustCover20.cubeList.add(new ModelBox(DustCover20, 33, 71, -3.265F, -2.1783F, 7.8018F, 1, 2, 17, 0.0F, false));
		DustCover20.cubeList.add(new ModelBox(DustCover20, 72, 194, -2.5579F, -2.8854F, 7.8018F, 2, 1, 17, 0.0F, false));
		DustCover20.cubeList.add(new ModelBox(DustCover20, 105, 102, -0.8504F, -2.8785F, 7.8018F, 1, 1, 17, 0.0F, false));
		DustCover20.cubeList.add(new ModelBox(DustCover20, 12, 85, -0.1433F, -3.5313F, -0.1961F, 1, 2, 8, 0.0F, false));
		DustCover20.cubeList.add(new ModelBox(DustCover20, 49, 167, -0.8504F, -4.2384F, -0.1961F, 1, 1, 8, 0.0F, false));
		DustCover20.cubeList.add(new ModelBox(DustCover20, 144, 152, -2.5579F, -4.2453F, -0.1961F, 2, 1, 8, 0.0F, false));
		DustCover20.cubeList.add(new ModelBox(DustCover20, 52, 103, -3.265F, -3.5382F, -0.1961F, 1, 2, 8, 0.0F, false));
		DustCover20.cubeList.add(new ModelBox(DustCover20, 193, 78, -6.001F, -3.534F, -6.1782F, 2, 2, 4, 0.0F, false));
		DustCover20.cubeList.add(new ModelBox(DustCover20, 40, 95, -4.001F, -2.534F, 0.0218F, 1, 2, 1, 0.0F, false));
		DustCover20.cubeList.add(new ModelBox(DustCover20, 52, 90, -4.001F, -2.534F, -0.3032F, 1, 2, 1, 0.0F, false));
		DustCover20.cubeList.add(new ModelBox(DustCover20, 151, 72, -5.2939F, -4.2411F, -6.1782F, 2, 1, 4, 0.0F, false));
		DustCover20.cubeList.add(new ModelBox(DustCover20, 108, 132, -3.1081F, -4.2411F, -6.9782F, 4, 1, 7, 0.0F, false));
		DustCover20.cubeList.add(new ModelBox(DustCover20, 86, 44, -4.001F, -3.534F, -6.9782F, 1, 2, 7, 0.0F, false));
		DustCover20.cubeList.add(new ModelBox(DustCover20, 85, 112, -3.2939F, -4.2411F, -6.9782F, 1, 1, 7, 0.0F, false));
		DustCover20.cubeList.add(new ModelBox(DustCover20, 125, 64, -6.001F, -3.134F, -9.9782F, 3, 1, 4, 0.0F, false));
		DustCover20.cubeList.add(new ModelBox(DustCover20, 86, 96, -6.001F, -2.534F, -9.9782F, 3, 1, 4, 0.0F, false));
		DustCover20.cubeList.add(new ModelBox(DustCover20, 117, 52, -6.701F, -3.334F, -10.0782F, 1, 1, 10, -0.3F, false));
		DustCover20.cubeList.add(new ModelBox(DustCover20, 0, 164, -6.001F, -2.534F, -2.1782F, 3, 1, 2, 0.0F, false));
		DustCover20.cubeList.add(new ModelBox(DustCover20, 131, 169, -6.001F, -3.134F, -2.1782F, 3, 1, 2, 0.0F, false));
		DustCover20.cubeList.add(new ModelBox(DustCover20, 62, 106, -4.001F, -2.534F, -9.9782F, 1, 1, 3, 0.0F, false));
		DustCover20.cubeList.add(new ModelBox(DustCover20, 105, 0, 0.599F, -3.534F, -6.9782F, 1, 2, 7, 0.0F, false));
		DustCover20.cubeList.add(new ModelBox(DustCover20, 16, 0, 0.599F, -0.8013F, 25.6018F, 1, 3, 1, 0.0F, false));
		DustCover20.cubeList.add(new ModelBox(DustCover20, 24, 0, -4.001F, -0.8013F, 25.6018F, 1, 3, 1, 0.0F, false));
		DustCover20.cubeList.add(new ModelBox(DustCover20, 96, 97, 0.599F, 0.7987F, 26.6018F, 1, 1, 1, 0.0F, false));
		DustCover20.cubeList.add(new ModelBox(DustCover20, 80, 0, -4.001F, 0.7987F, 26.6018F, 1, 1, 1, 0.0F, false));

		DustCover23_r2 = new ModelRenderer(this);
		DustCover23_r2.setRotationPoint(-1.2041F, -8.0284F, 3.1018F);
		DustCover20.addChild(DustCover23_r2);
		setRotationAngle(DustCover23_r2, -0.7854F, 0.0F, 0.0F);
		DustCover23_r2.cubeList.add(new ModelBox(DustCover23_r2, 162, 168, -2.0608F, -0.1499F, 6.5F, 1, 1, 2, 0.0F, false));
		DustCover23_r2.cubeList.add(new ModelBox(DustCover23_r2, 49, 156, -1.3537F, -0.857F, 6.5F, 2, 1, 2, 0.0F, false));
		DustCover23_r2.cubeList.add(new ModelBox(DustCover23_r2, 144, 168, 0.3537F, -0.8501F, 6.5F, 1, 1, 2, 0.0F, false));
		DustCover23_r2.cubeList.add(new ModelBox(DustCover23_r2, 26, 168, 1.0608F, -0.143F, 6.5F, 1, 1, 2, 0.0F, false));

		DustCover25_r3 = new ModelRenderer(this);
		DustCover25_r3.setRotationPoint(-1.2041F, -8.0284F, 3.1018F);
		DustCover20.addChild(DustCover25_r3);
		setRotationAngle(DustCover25_r3, -0.6155F, 0.5236F, 0.6155F);
		DustCover25_r3.cubeList.add(new ModelBox(DustCover25_r3, 154, 168, -1.5632F, 0.3512F, 6.5F, 1, 1, 2, 0.0F, false));

		DustCover25_r4 = new ModelRenderer(this);
		DustCover25_r4.setRotationPoint(-0.9541F, -3.8837F, 7.3896F);
		DustCover20.addChild(DustCover25_r4);
		setRotationAngle(DustCover25_r4, -0.3491F, 0.0F, 0.0F);
		DustCover25_r4.cubeList.add(new ModelBox(DustCover25_r4, 23, 107, -1.6037F, -0.5034F, 0.0F, 2, 1, 1, -0.1F, false));
		DustCover25_r4.cubeList.add(new ModelBox(DustCover25_r4, 144, 20, 0.1037F, -0.4966F, 0.0F, 1, 1, 1, -0.1F, false));

		DustCover24_r2 = new ModelRenderer(this);
		DustCover24_r2.setRotationPoint(-1.2041F, -8.0284F, 3.1018F);
		DustCover20.addChild(DustCover24_r2);
		setRotationAngle(DustCover24_r2, -0.6155F, -0.5236F, -0.6155F);
		DustCover24_r2.cubeList.add(new ModelBox(DustCover24_r2, 122, 168, 0.5584F, 0.3561F, 6.5F, 1, 1, 2, 0.0F, false));

		DustCover29_r1 = new ModelRenderer(this);
		DustCover29_r1.setRotationPoint(-7.6055F, -0.9138F, -5.0782F);
		DustCover20.addChild(DustCover29_r1);
		setRotationAngle(DustCover29_r1, 0.0F, 0.0F, 0.576F);
		DustCover29_r1.cubeList.add(new ModelBox(DustCover29_r1, 117, 20, -0.6F, 0.2F, -5.0F, 1, 1, 10, -0.2F, false));
		DustCover29_r1.cubeList.add(new ModelBox(DustCover29_r1, 0, 85, -0.2F, -2.7F, -5.0F, 1, 4, 10, -0.3F, false));

		DustCover28_r1 = new ModelRenderer(this);
		DustCover28_r1.setRotationPoint(-2.9403F, -3.8875F, -8.4782F);
		DustCover20.addChild(DustCover28_r1);
		setRotationAngle(DustCover28_r1, 0.0F, 0.0F, 0.7854F);
		DustCover28_r1.cubeList.add(new ModelBox(DustCover28_r1, 105, 9, -0.5F, 0.0F, 1.5F, 1, 1, 7, 0.0F, false));

		DustCover27_r1 = new ModelRenderer(this);
		DustCover27_r1.setRotationPoint(-4.9403F, -3.8875F, -7.6782F);
		DustCover20.addChild(DustCover27_r1);
		setRotationAngle(DustCover27_r1, 0.0F, 0.0F, 0.7854F);
		DustCover27_r1.cubeList.add(new ModelBox(DustCover27_r1, 98, 185, -0.5F, 0.0F, 1.5F, 1, 1, 4, 0.0F, false));

		DustCover26_r2 = new ModelRenderer(this);
		DustCover26_r2.setRotationPoint(0.5383F, -3.8875F, -8.4782F);
		DustCover20.addChild(DustCover26_r2);
		setRotationAngle(DustCover26_r2, 0.0F, 0.0F, -0.7854F);
		DustCover26_r2.cubeList.add(new ModelBox(DustCover26_r2, 144, 52, -0.5F, 0.0F, 1.5F, 1, 1, 7, 0.0F, false));

		DustCover25_r5 = new ModelRenderer(this);
		DustCover25_r5.setRotationPoint(0.5383F, -1.9077F, -11.5004F);
		DustCover20.addChild(DustCover25_r5);
		setRotationAngle(DustCover25_r5, 0.0F, 0.0F, -0.7854F);
		DustCover25_r5.cubeList.add(new ModelBox(DustCover25_r5, 155, 124, -0.5F, 0.0F, 1.5F, 1, 1, 3, 0.0F, false));

		DustCover24_r3 = new ModelRenderer(this);
		DustCover24_r3.setRotationPoint(-1.2041F, -1.8383F, -10.2711F);
		DustCover20.addChild(DustCover24_r3);
		setRotationAngle(DustCover24_r3, 0.4189F, 0.0F, 0.0F);
		DustCover24_r3.cubeList.add(new ModelBox(DustCover24_r3, 72, 84, -2.0608F, -0.1499F, 0.0F, 1, 2, 4, 0.0F, false));
		DustCover24_r3.cubeList.add(new ModelBox(DustCover24_r3, 89, 120, 1.0608F, -0.143F, -1.0F, 1, 2, 5, 0.0F, false));
		DustCover24_r3.cubeList.add(new ModelBox(DustCover24_r3, 193, 21, 0.3537F, -0.8501F, -1.0F, 1, 1, 5, 0.0F, false));
		DustCover24_r3.cubeList.add(new ModelBox(DustCover24_r3, 12, 125, -1.3537F, -0.857F, -1.0F, 2, 1, 5, 0.0F, false));

		DustCover25_r6 = new ModelRenderer(this);
		DustCover25_r6.setRotationPoint(-1.2041F, -1.8383F, -10.2711F);
		DustCover20.addChild(DustCover25_r6);
		setRotationAngle(DustCover25_r6, 0.305F, 0.2917F, -0.7402F);
		DustCover25_r6.cubeList.add(new ModelBox(DustCover25_r6, 23, 193, 0.5584F, 0.3561F, -1.0F, 1, 1, 5, 0.0F, false));

		DustCover26_r3 = new ModelRenderer(this);
		DustCover26_r3.setRotationPoint(-1.2041F, -1.8383F, -10.2711F);
		DustCover20.addChild(DustCover26_r3);
		setRotationAngle(DustCover26_r3, 0.305F, -0.2917F, 0.7402F);
		DustCover26_r3.cubeList.add(new ModelBox(DustCover26_r3, 35, 179, -1.5632F, 0.3512F, -1.0F, 1, 1, 5, 0.0F, false));

		DustCover25_r7 = new ModelRenderer(this);
		DustCover25_r7.setRotationPoint(-1.2041F, -3.6069F, 7.8485F);
		DustCover20.addChild(DustCover25_r7);
		setRotationAngle(DustCover25_r7, -0.3185F, -0.3035F, -0.7363F);
		DustCover25_r7.cubeList.add(new ModelBox(DustCover25_r7, 144, 26, 0.4548F, 0.4597F, -0.5F, 1, 1, 1, -0.2F, false));

		DustCover26_r4 = new ModelRenderer(this);
		DustCover26_r4.setRotationPoint(-1.2041F, -3.6069F, 7.8485F);
		DustCover20.addChild(DustCover26_r4);
		setRotationAngle(DustCover26_r4, -0.3185F, 0.3035F, 0.7363F);
		DustCover26_r4.cubeList.add(new ModelBox(DustCover26_r4, 144, 22, -1.4597F, 0.4548F, -0.5F, 1, 1, 1, -0.2F, false));

		DustCover25_r8 = new ModelRenderer(this);
		DustCover25_r8.setRotationPoint(-2.2043F, -3.8917F, -0.6961F);
		DustCover20.addChild(DustCover25_r8);
		setRotationAngle(DustCover25_r8, 0.0F, 0.0F, 0.7854F);
		DustCover25_r8.cubeList.add(new ModelBox(DustCover25_r8, 0, 168, -0.5F, 0.0F, 0.5F, 1, 1, 8, 0.0F, false));

		DustCover24_r4 = new ModelRenderer(this);
		DustCover24_r4.setRotationPoint(-0.204F, -3.8849F, -0.6961F);
		DustCover20.addChild(DustCover24_r4);
		setRotationAngle(DustCover24_r4, 0.0F, 0.0F, -0.7854F);
		DustCover24_r4.cubeList.add(new ModelBox(DustCover24_r4, 121, 164, -0.5F, 0.0F, 0.5F, 1, 1, 8, 0.0F, false));

		DustCover23_r3 = new ModelRenderer(this);
		DustCover23_r3.setRotationPoint(-0.204F, -2.5249F, 16.3018F);
		DustCover20.addChild(DustCover23_r3);
		setRotationAngle(DustCover23_r3, 0.0F, 0.0F, -0.7854F);
		DustCover23_r3.cubeList.add(new ModelBox(DustCover23_r3, 105, 32, -0.5F, 0.0F, -8.5F, 1, 1, 17, 0.0F, false));

		DustCover24_r5 = new ModelRenderer(this);
		DustCover24_r5.setRotationPoint(-2.2043F, -2.5318F, 16.3018F);
		DustCover20.addChild(DustCover24_r5);
		setRotationAngle(DustCover24_r5, 0.0F, 0.0F, 0.7854F);
		DustCover24_r5.cubeList.add(new ModelBox(DustCover24_r5, 105, 0, -0.5F, 0.0F, -8.5F, 1, 1, 17, 0.0F, false));

		DustCover25_r9 = new ModelRenderer(this);
		DustCover25_r9.setRotationPoint(-1.201F, -0.4093F, 5.441F);
		DustCover20.addChild(DustCover25_r9);
		setRotationAngle(DustCover25_r9, 0.0F, 0.0F, 0.0F);
		DustCover25_r9.cubeList.add(new ModelBox(DustCover25_r9, 18, 168, 1.8F, -0.2661F, 0.7519F, 1, 1, 2, 0.0F, false));
		DustCover25_r9.cubeList.add(new ModelBox(DustCover25_r9, 10, 168, -2.8F, -0.2658F, 0.7505F, 1, 1, 2, 0.0F, false));

		DustCover24_r6 = new ModelRenderer(this);
		DustCover24_r6.setRotationPoint(-1.201F, -1.1093F, 5.441F);
		DustCover20.addChild(DustCover24_r6);
		setRotationAngle(DustCover24_r6, 0.0F, 0.0F, 0.0F);
		DustCover24_r6.cubeList.add(new ModelBox(DustCover24_r6, 35, 193, 1.8F, -0.2661F, -2.2481F, 1, 1, 5, 0.0F, false));
		DustCover24_r6.cubeList.add(new ModelBox(DustCover24_r6, 193, 33, -2.8F, -0.2658F, -2.2495F, 1, 1, 5, 0.0F, false));

		DustCover24_r7 = new ModelRenderer(this);
		DustCover24_r7.setRotationPoint(-1.201F, -2.1093F, 4.441F);
		DustCover20.addChild(DustCover24_r7);
		setRotationAngle(DustCover24_r7, 0.0F, 0.0F, 0.0F);
		DustCover24_r7.cubeList.add(new ModelBox(DustCover24_r7, 192, 47, -2.8F, -0.2658F, -3.2495F, 1, 1, 6, 0.0F, false));
		DustCover24_r7.cubeList.add(new ModelBox(DustCover24_r7, 191, 131, 1.8F, -0.2661F, -3.2481F, 1, 1, 6, 0.0F, false));

		DustCover24_r8 = new ModelRenderer(this);
		DustCover24_r8.setRotationPoint(-1.201F, -2.9062F, 0.1243F);
		DustCover20.addChild(DustCover24_r8);
		setRotationAngle(DustCover24_r8, -0.4363F, 0.0F, 0.0F);
		DustCover24_r8.cubeList.add(new ModelBox(DustCover24_r8, 137, 20, 1.8F, -0.2654F, -0.4989F, 1, 1, 1, 0.0F, false));
		DustCover24_r8.cubeList.add(new ModelBox(DustCover24_r8, 144, 72, -2.8F, -0.265F, -0.5003F, 1, 1, 1, 0.0F, false));

		DustCover23_r4 = new ModelRenderer(this);
		DustCover23_r4.setRotationPoint(0.9959F, -4.8234F, -2.3412F);
		DustCover20.addChild(DustCover23_r4);
		setRotationAngle(DustCover23_r4, -0.7854F, 0.0F, 0.0F);
		DustCover23_r4.cubeList.add(new ModelBox(DustCover23_r4, 0, 168, -0.3969F, -0.7681F, 3.25F, 1, 1, 2, 0.0F, false));

		DustCover24_r9 = new ModelRenderer(this);
		DustCover24_r9.setRotationPoint(-3.3978F, -4.8265F, -2.3401F);
		DustCover20.addChild(DustCover24_r9);
		setRotationAngle(DustCover24_r9, -0.7854F, 0.0F, 0.0F);
		DustCover24_r9.cubeList.add(new ModelBox(DustCover24_r9, 161, 164, -0.6032F, -0.7648F, 3.25F, 1, 1, 2, 0.0F, false));

		DustCover23_r5 = new ModelRenderer(this);
		DustCover23_r5.setRotationPoint(-3.3978F, -3.4265F, 5.0599F);
		DustCover20.addChild(DustCover23_r5);
		setRotationAngle(DustCover23_r5, -0.7854F, 0.0F, 0.0F);
		DustCover23_r5.cubeList.add(new ModelBox(DustCover23_r5, 0, 133, -0.6032F, -0.7648F, 2.25F, 1, 1, 2, 0.0F, false));

		DustCover22_r1 = new ModelRenderer(this);
		DustCover22_r1.setRotationPoint(0.9959F, -3.4234F, 5.0588F);
		DustCover20.addChild(DustCover22_r1);
		setRotationAngle(DustCover22_r1, -0.7854F, 0.0F, 0.0F);
		DustCover22_r1.cubeList.add(new ModelBox(DustCover22_r1, 169, 52, -0.3969F, -0.7681F, 2.25F, 1, 1, 2, 0.0F, false));

		DustCover23_r6 = new ModelRenderer(this);
		DustCover23_r6.setRotationPoint(-1.1005F, -0.2667F, 2.9451F);
		DustCover20.addChild(DustCover23_r6);
		setRotationAngle(DustCover23_r6, -0.2618F, 0.0F, 0.0F);
		DustCover23_r6.cubeList.add(new ModelBox(DustCover23_r6, 124, 0, -2.9005F, -1.1877F, -1.508F, 1, 2, 8, 0.0F, false));
		DustCover23_r6.cubeList.add(new ModelBox(DustCover23_r6, 109, 88, 1.6995F, -1.1877F, -3.508F, 1, 2, 10, 0.0F, false));
		DustCover23_r6.cubeList.add(new ModelBox(DustCover23_r6, 52, 95, 1.6995F, -1.2989F, -4.2026F, 1, 2, 1, 0.0F, false));

		DustCover22_r2 = new ModelRenderer(this);
		DustCover22_r2.setRotationPoint(-1.1005F, 0.6333F, 4.7701F);
		DustCover20.addChild(DustCover22_r2);
		setRotationAngle(DustCover22_r2, -0.2618F, 0.0F, 0.0F);
		DustCover22_r2.cubeList.add(new ModelBox(DustCover22_r2, 27, 55, -2.9005F, -1.2989F, -4.2026F, 1, 2, 1, 0.0F, false));

		DustCover18 = new ModelRenderer(this);
		DustCover18.setRotationPoint(-2.3F, 3.3F, 37.3F);
		topCoverRussian.addChild(DustCover18);
		DustCover18.cubeList.add(new ModelBox(DustCover18, 16, 10, -0.6F, -0.001F, 0.001F, 5, 1, 1, 0.0F, false));

		DustCover17 = new ModelRenderer(this);
		DustCover17.setRotationPoint(-2.3F, 3.3F, 25.3F);
		topCoverRussian.addChild(DustCover17);
		DustCover17.cubeList.add(new ModelBox(DustCover17, 170, 120, -0.6F, 0.0F, -7.0F, 1, 1, 19, 0.0F, false));
		DustCover17.cubeList.add(new ModelBox(DustCover17, 5, 55, -0.6F, -2.5541F, -25.4504F, 1, 1, 1, 0.0F, false));
		DustCover17.cubeList.add(new ModelBox(DustCover17, 4, 48, -0.6F, -2.0365F, -15.7686F, 1, 1, 1, 0.0F, false));
		DustCover17.cubeList.add(new ModelBox(DustCover17, 52, 33, -0.6F, -2.0365F, -15.8186F, 1, 1, 1, 0.0F, false));
		DustCover17.cubeList.add(new ModelBox(DustCover17, 66, 51, -0.6F, 0.0F, -7.3F, 1, 1, 1, 0.0F, false));

		DustCover19 = new ModelRenderer(this);
		DustCover19.setRotationPoint(1.3F, 3.3F, 10.3F);
		topCoverRussian.addChild(DustCover19);
		DustCover19.cubeList.add(new ModelBox(DustCover19, 99, 143, 0.6F, 0.0F, 8.0F, 1, 1, 20, 0.0F, false));
		DustCover19.cubeList.add(new ModelBox(DustCover19, 0, 155, 0.6F, -2.5541F, -9.8004F, 1, 1, 3, 0.0F, false));
		DustCover19.cubeList.add(new ModelBox(DustCover19, 80, 179, 1.0F, -4.4541F, -7.6004F, 1, 1, 6, -0.2F, false));
		DustCover19.cubeList.add(new ModelBox(DustCover19, 134, 127, 0.6F, -2.5541F, -2.7004F, 1, 1, 1, 0.0F, false));
		DustCover19.cubeList.add(new ModelBox(DustCover19, 130, 127, 0.6F, -2.5541F, -2.8004F, 1, 1, 1, 0.0F, false));
		DustCover19.cubeList.add(new ModelBox(DustCover19, 137, 18, 0.6F, -2.5541F, -10.5004F, 1, 1, 1, 0.0F, false));
		DustCover19.cubeList.add(new ModelBox(DustCover19, 144, 28, 0.6F, 0.0F, 7.7F, 1, 1, 1, 0.0F, false));

		DustCover21_r1 = new ModelRenderer(this);
		DustCover21_r1.setRotationPoint(-1.2005F, -1.7667F, 2.4451F);
		DustCover19.addChild(DustCover21_r1);
		setRotationAngle(DustCover21_r1, -0.2618F, 0.0F, 0.0F);
		DustCover21_r1.cubeList.add(new ModelBox(DustCover21_r1, 144, 168, -2.9995F, 0.3123F, -2.208F, 1, 1, 8, 0.0F, false));
		DustCover21_r1.cubeList.add(new ModelBox(DustCover21_r1, 105, 120, 1.8005F, 0.3123F, -4.208F, 1, 1, 10, 0.0F, false));

		DustCover22_r3 = new ModelRenderer(this);
		DustCover22_r3.setRotationPoint(1.8467F, -2.3208F, -4.8004F);
		DustCover19.addChild(DustCover22_r3);
		setRotationAngle(DustCover22_r3, 0.0F, 0.0F, -0.2618F);
		DustCover22_r3.cubeList.add(new ModelBox(DustCover22_r3, 0, 71, -0.4F, -1.6F, -2.5F, 1, 3, 5, -0.2F, false));

		ironsights = new ModelRenderer(this);
		ironsights.setRotationPoint(1.5F, -1.7F, -15.3F);
		topCoverRussian.addChild(ironsights);
		

		ironsights_r1 = new ModelRenderer(this);
		ironsights_r1.setRotationPoint(-1.5F, -0.58F, 37.4511F);
		ironsights.addChild(ironsights_r1);
		setRotationAngle(ironsights_r1, -3.1416F, 0.0F, 3.1416F);
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 72, 123, 0.4F, -1.38F, -3.9311F, 1, 2, 2, -0.301F, false));
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 138, 68, -1.1F, -1.58F, 3.7689F, 1, 1, 1, -0.4F, false));
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 138, 88, -1.5F, -1.58F, 3.7689F, 1, 1, 1, -0.4F, false));
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 138, 90, -1.3F, -1.58F, 3.7689F, 1, 1, 1, -0.4F, false));
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 138, 120, -0.9F, -1.58F, 3.7689F, 1, 1, 1, -0.4F, false));
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 138, 122, -0.8F, -1.58F, 3.7689F, 1, 1, 1, -0.401F, false));
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 138, 127, -1.5F, -1.68F, 3.7689F, 1, 1, 1, -0.401F, false));
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 134, 138, -1.3F, -1.68F, 3.7689F, 1, 1, 1, -0.401F, false));
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 138, 138, -1.1F, -1.68F, 3.7689F, 1, 1, 1, -0.401F, false));
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 64, 139, -0.9F, -1.68F, 3.7689F, 1, 1, 1, -0.401F, false));
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 5, 142, -0.8F, -1.68F, 3.7689F, 1, 1, 1, -0.402F, false));
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 11, 142, 0.5F, -1.68F, 3.7689F, 1, 1, 1, -0.401F, false));
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 20, 142, 0.3F, -1.68F, 3.7689F, 1, 1, 1, -0.401F, false));
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 32, 142, 0.1F, -1.68F, 3.7689F, 1, 1, 1, -0.401F, false));
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 43, 142, -0.1F, -1.68F, 3.7689F, 1, 1, 1, -0.401F, false));
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 66, 142, -0.2F, -1.68F, 3.7689F, 1, 1, 1, -0.402F, false));
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 87, 143, -0.2F, -1.58F, 3.7689F, 1, 1, 1, -0.401F, false));
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 93, 143, -0.1F, -1.58F, 3.7689F, 1, 1, 1, -0.4F, false));
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 138, 143, 0.1F, -1.58F, 3.7689F, 1, 1, 1, -0.4F, false));
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 11, 144, 0.3F, -1.58F, 3.7689F, 1, 1, 1, -0.4F, false));
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 20, 144, 0.5F, -1.58F, 3.7689F, 1, 1, 1, -0.4F, false));
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 95, 37, -1.5F, -1.38F, 3.7689F, 3, 1, 1, -0.4F, false));
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 33, 118, -1.5F, -1.18F, 3.7689F, 3, 1, 1, -0.4F, false));
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 123, 18, -1.5F, -0.98F, 3.7689F, 3, 1, 1, -0.4F, false));
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 49, 152, -1.0F, -1.18F, -3.5311F, 2, 1, 8, -0.301F, false));
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 124, 10, -1.4F, -1.38F, -3.9311F, 1, 2, 2, -0.301F, false));
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 191, 117, 0.4F, -0.52F, -1.8511F, 1, 1, 6, -0.301F, false));
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 191, 124, -1.4F, -0.52F, -1.8511F, 1, 1, 6, -0.301F, false));
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 105, 18, -1.4F, -0.32F, -4.8511F, 2, 3, 9, -0.299F, false));
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 105, 50, -0.6F, -0.32F, -4.8511F, 2, 3, 9, -0.3F, false));

		cube_r42 = new ModelRenderer(this);
		cube_r42.setRotationPoint(-0.4F, -1.66F, 35.22F);
		ironsights.addChild(cube_r42);
		setRotationAngle(cube_r42, -0.5236F, 0.0F, 0.0F);
		

		cube_r42_r1 = new ModelRenderer(this);
		cube_r42_r1.setRotationPoint(-1.1F, -0.1802F, 2.4722F);
		cube_r42.addChild(cube_r42_r1);
		setRotationAngle(cube_r42_r1, 2.0944F, 0.0F, -3.1416F);
		cube_r42_r1.cubeList.add(new ModelBox(cube_r42_r1, 72, 102, -1.4F, -0.1198F, -2.7722F, 1, 2, 3, -0.302F, false));
		cube_r42_r1.cubeList.add(new ModelBox(cube_r42_r1, 0, 103, 0.4F, -0.1198F, -2.7722F, 1, 2, 3, -0.302F, false));

		cube_r43 = new ModelRenderer(this);
		cube_r43.setRotationPoint(-2.7F, -1.36F, 40.72F);
		ironsights.addChild(cube_r43);
		setRotationAngle(cube_r43, 0.3665F, 0.0F, 0.0F);
		

		cube_r44_r1 = new ModelRenderer(this);
		cube_r44_r1.setRotationPoint(1.2F, -2.4864F, -7.1F);
		cube_r43.addChild(cube_r44_r1);
		setRotationAngle(cube_r44_r1, 0.3491F, 0.0F, 3.1416F);
		cube_r44_r1.cubeList.add(new ModelBox(cube_r44_r1, 15, 110, -2.0F, -0.5F, -0.5F, 4, 1, 1, -0.15F, false));

		cube_r43_r1 = new ModelRenderer(this);
		cube_r43_r1.setRotationPoint(1.2F, -0.0432F, -2.4313F);
		cube_r43.addChild(cube_r43_r1);
		setRotationAngle(cube_r43_r1, -2.4086F, 0.0F, 3.1416F);
		cube_r43_r1.cubeList.add(new ModelBox(cube_r43_r1, 137, 50, 0.6F, 0.1432F, 3.0313F, 1, 1, 1, -0.15F, false));
		cube_r43_r1.cubeList.add(new ModelBox(cube_r43_r1, 137, 52, 0.3F, 0.1432F, 3.0313F, 1, 1, 1, -0.151F, false));
		cube_r43_r1.cubeList.add(new ModelBox(cube_r43_r1, 138, 25, -1.3F, 0.1432F, 3.0313F, 1, 1, 1, -0.151F, false));
		cube_r43_r1.cubeList.add(new ModelBox(cube_r43_r1, 138, 57, -1.6F, 0.1432F, 3.0313F, 1, 1, 1, -0.15F, false));

		cube_r44 = new ModelRenderer(this);
		cube_r44.setRotationPoint(-0.4F, -1.16F, 33.92F);
		ironsights.addChild(cube_r44);
		setRotationAngle(cube_r44, 0.3665F, 0.0F, 0.0F);
		

		cube_r44_r2 = new ModelRenderer(this);
		cube_r44_r2.setRotationPoint(-1.1F, 1.8068F, 3.0887F);
		cube_r44.addChild(cube_r44_r2);
		setRotationAngle(cube_r44_r2, -2.4086F, 0.0F, 3.1416F);
		cube_r44_r2.cubeList.add(new ModelBox(cube_r44_r2, 42, 76, -1.5F, -2.1068F, -3.3887F, 3, 1, 1, -0.1F, false));

		cube_r45 = new ModelRenderer(this);
		cube_r45.setRotationPoint(-0.8F, -0.6F, 32.9F);
		ironsights.addChild(cube_r45);
		setRotationAngle(cube_r45, -0.7156F, 0.0F, 0.0F);
		

		cube_r45_r1 = new ModelRenderer(this);
		cube_r45_r1.setRotationPoint(-0.7F, -2.9707F, 3.4478F);
		cube_r45.addChild(cube_r45_r1);
		setRotationAngle(cube_r45_r1, 1.7104F, 0.0F, -3.1416F);
		cube_r45_r1.cubeList.add(new ModelBox(cube_r45_r1, 117, 80, -1.4F, 1.2707F, -3.7478F, 1, 2, 2, -0.302F, false));
		cube_r45_r1.cubeList.add(new ModelBox(cube_r45_r1, 33, 121, 0.4F, 1.2707F, -3.7478F, 1, 2, 2, -0.302F, false));
		cube_r45_r1.cubeList.add(new ModelBox(cube_r45_r1, 15, 107, -1.0F, 2.2707F, -3.7478F, 2, 1, 1, -0.302F, false));

		gun377 = new ModelRenderer(this);
		gun377.setRotationPoint(-1.0F, 1.6F, 35.7F);
		topCoverRussian.addChild(gun377);
		setRotationAngle(gun377, -1.041F, 0.0F, 0.0F);
		gun377.cubeList.add(new ModelBox(gun377, 72, 90, -0.002F, -0.8863F, -0.5239F, 2, 1, 3, 0.0F, false));

		gun378 = new ModelRenderer(this);
		gun378.setRotationPoint(-1.0F, 1.6F, 33.7F);
		topCoverRussian.addChild(gun378);
		gun378.cubeList.add(new ModelBox(gun378, 114, 4, -0.001F, -0.9F, 0.5F, 2, 1, 2, 0.0F, false));

		gun379 = new ModelRenderer(this);
		gun379.setRotationPoint(-1.0F, 2.6F, 34.2F);
		topCoverRussian.addChild(gun379);
		setRotationAngle(gun379, 0.4833F, 0.0F, 0.0F);
		gun379.cubeList.add(new ModelBox(gun379, 124, 41, 0.0F, -0.5646F, 0.861F, 2, 3, 1, 0.0F, false));

		gun380 = new ModelRenderer(this);
		gun380.setRotationPoint(-1.0F, 2.0F, 33.7F);
		topCoverRussian.addChild(gun380);
		gun380.cubeList.add(new ModelBox(gun380, 64, 117, 0.001F, -0.9F, 0.5F, 2, 1, 1, 0.0F, false));

		gun129 = new ModelRenderer(this);
		gun129.setRotationPoint(-0.5F, 2.1F, 35.2F);
		topCoverRussian.addChild(gun129);
		gun129.cubeList.add(new ModelBox(gun129, 94, 116, -0.001F, -0.9F, 0.5F, 1, 1, 2, 0.0F, false));

		gun130 = new ModelRenderer(this);
		gun130.setRotationPoint(-0.5F, 2.1F, 37.2F);
		topCoverRussian.addChild(gun130);
		setRotationAngle(gun130, -1.3013F, 0.0F, 0.0F);
		gun130.cubeList.add(new ModelBox(gun130, 144, 48, 0.0F, -0.7216F, -0.7344F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		topCoverRussian.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}