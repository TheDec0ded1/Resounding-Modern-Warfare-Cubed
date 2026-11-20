package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;

import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SR3MHGF extends ModelWithAttachments {
	private final ModelRenderer sr3m_handguard;
	private final ModelRenderer gun10;
	private final ModelRenderer gun11;
	private final ModelRenderer gun12;
	private final ModelRenderer gun13;
	private final ModelRenderer gun196;
	private final ModelRenderer gun198;
	private final ModelRenderer gun215;
	private final ModelRenderer gun19;
	private final ModelRenderer gun217;
	private final ModelRenderer gun218;
	private final ModelRenderer gun219;
	private final ModelRenderer gun220;
	private final ModelRenderer gun221;
	private final ModelRenderer gun222;
	private final ModelRenderer gun223;
	private final ModelRenderer gun224;
	private final ModelRenderer gun225_r1;
	private final ModelRenderer gun3;
	private final ModelRenderer gun226_r1;
	private final ModelRenderer gun225_r2;
	private final ModelRenderer gun225;
	private final ModelRenderer gun2;
	private final ModelRenderer gun14;
	private final ModelRenderer gun18;
	private final ModelRenderer gun23;
	private final ModelRenderer gun24;
	private final ModelRenderer gun227;
	private final ModelRenderer gun228;
	private final ModelRenderer gun229;
	private final ModelRenderer gun230;
	private final ModelRenderer gun231;
	private final ModelRenderer gun232;
	private final ModelRenderer gun233;
	private final ModelRenderer gun234;
	private final ModelRenderer gun235;
	private final ModelRenderer gun236;
	private final ModelRenderer gun237;
	private final ModelRenderer gun238;

	public SR3MHGF() {
		textureWidth = 256;
		textureHeight = 256;

		sr3m_handguard = new ModelRenderer(this);
		sr3m_handguard.setRotationPoint(0.0F, 25.0F, -7.0F);
		sr3m_handguard.cubeList.add(new ModelBox(sr3m_handguard, 57, 89, -3.0F, -30.0F, -20.5F, 3, 1, 1, -0.001F, false));

		gun10 = new ModelRenderer(this);
		gun10.setRotationPoint(-3.0F, -32.8F, -41.5F);
		sr3m_handguard.addChild(gun10);
		gun10.cubeList.add(new ModelBox(gun10, 168, 124, 0.0F, -1.1F, 0.0F, 3, 3, 3, 0.001F, false));
		gun10.cubeList.add(new ModelBox(gun10, 170, 126, 0.0F, -1.1F, -1.0F, 3, 3, 1, 0.001F, false));

		gun11 = new ModelRenderer(this);
		gun11.setRotationPoint(-4.1F, -31.0F, -28.5F);
		sr3m_handguard.addChild(gun11);
		

		gun12 = new ModelRenderer(this);
		gun12.setRotationPoint(-4.1F, -32.0F, -33.5F);
		sr3m_handguard.addChild(gun12);
		

		gun13 = new ModelRenderer(this);
		gun13.setRotationPoint(-4.1F, -31.5F, -31.5F);
		sr3m_handguard.addChild(gun13);
		

		gun196 = new ModelRenderer(this);
		gun196.setRotationPoint(-4.1F, -33.0F, -37.0F);
		sr3m_handguard.addChild(gun196);
		

		gun198 = new ModelRenderer(this);
		gun198.setRotationPoint(-4.1F, -32.5F, -36.5F);
		sr3m_handguard.addChild(gun198);
		

		gun215 = new ModelRenderer(this);
		gun215.setRotationPoint(-4.1F, -32.5F, -27.5F);
		sr3m_handguard.addChild(gun215);
		gun215.cubeList.add(new ModelBox(gun215, 101, 24, 0.4575F, -0.3496F, 2.99F, 1, 3, 5, 0.0F, false));
		gun215.cubeList.add(new ModelBox(gun215, 2, 10, 3.7606F, -0.4538F, 2.99F, 1, 3, 5, 0.0F, false));

		gun19 = new ModelRenderer(this);
		gun19.setRotationPoint(-4.1F, -32.5F, -28.5F);
		sr3m_handguard.addChild(gun19);
		gun19.cubeList.add(new ModelBox(gun19, 105, 28, 0.4575F, -0.3496F, 2.99F, 1, 1, 1, 0.0F, false));
		gun19.cubeList.add(new ModelBox(gun19, 6, 14, 3.7606F, -0.4538F, 2.99F, 1, 1, 1, 0.0F, false));

		gun217 = new ModelRenderer(this);
		gun217.setRotationPoint(0.2F, -31.0F, -28.5F);
		sr3m_handguard.addChild(gun217);
		

		gun218 = new ModelRenderer(this);
		gun218.setRotationPoint(0.2F, -31.5F, -31.5F);
		sr3m_handguard.addChild(gun218);
		

		gun219 = new ModelRenderer(this);
		gun219.setRotationPoint(0.2F, -32.1F, -35.0F);
		sr3m_handguard.addChild(gun219);
		

		gun220 = new ModelRenderer(this);
		gun220.setRotationPoint(0.2F, -32.0F, -27.5F);
		sr3m_handguard.addChild(gun220);
		

		gun221 = new ModelRenderer(this);
		gun221.setRotationPoint(0.2F, -33.0F, -39.5F);
		sr3m_handguard.addChild(gun221);
		

		gun222 = new ModelRenderer(this);
		gun222.setRotationPoint(0.2F, -32.0F, -39.5F);
		sr3m_handguard.addChild(gun222);
		setRotationAngle(gun222, 1.3614F, 0.0F, 0.0F);
		

		gun223 = new ModelRenderer(this);
		gun223.setRotationPoint(-3.0F, -31.8F, -41.5F);
		sr3m_handguard.addChild(gun223);
		setRotationAngle(gun223, 1.3614F, 0.0F, 0.0F);
		

		gun224 = new ModelRenderer(this);
		gun224.setRotationPoint(-4.1F, -32.5F, -41.5F);
		sr3m_handguard.addChild(gun224);
		setRotationAngle(gun224, 1.3614F, 0.0F, 0.0F);
		

		gun225_r1 = new ModelRenderer(this);
		gun225_r1.setRotationPoint(2.49F, 9.163F, -1.3253F);
		gun224.addChild(gun225_r1);
		setRotationAngle(gun225_r1, 0.0873F, 0.0F, 0.0F);
		gun225_r1.cubeList.add(new ModelBox(gun225_r1, 108, 19, 1.3F, -5.5F, 2.5F, 1, 13, 1, 0.0F, false));
		gun225_r1.cubeList.add(new ModelBox(gun225_r1, 108, 19, -2.1F, -5.5F, 2.5F, 1, 13, 1, 0.0F, false));

		gun3 = new ModelRenderer(this);
		gun3.setRotationPoint(-4.1F, -33.5F, -41.5F);
		sr3m_handguard.addChild(gun3);
		setRotationAngle(gun3, 1.3614F, 0.0F, 0.0F);
		

		gun226_r1 = new ModelRenderer(this);
		gun226_r1.setRotationPoint(2.49F, 9.184F, -1.3159F);
		gun3.addChild(gun226_r1);
		setRotationAngle(gun226_r1, 0.0873F, 0.0F, 0.0F);
		gun226_r1.cubeList.add(new ModelBox(gun226_r1, 9, 31, 1.3F, -1.4F, 2.5F, 1, 9, 1, 0.0F, false));

		gun225_r2 = new ModelRenderer(this);
		gun225_r2.setRotationPoint(2.49F, 9.2837F, -1.3072F);
		gun3.addChild(gun225_r2);
		setRotationAngle(gun225_r2, 0.0873F, 0.0F, 0.0F);
		gun225_r2.cubeList.add(new ModelBox(gun225_r2, 108, 19, -2.1F, -1.5F, 2.5F, 1, 9, 1, 0.0F, false));

		gun225 = new ModelRenderer(this);
		gun225.setRotationPoint(-4.1F, -36.5F, -41.5F);
		sr3m_handguard.addChild(gun225);
		setRotationAngle(gun225, 0.0F, 0.0F, 1.5708F);
		gun225.cubeList.add(new ModelBox(gun225, 217, 40, 3.5462F, -4.7606F, -0.01F, 2, 1, 3, 0.0F, false));
		gun225.cubeList.add(new ModelBox(gun225, 217, 40, 3.6504F, -1.4575F, -0.01F, 2, 1, 3, 0.0F, false));
		gun225.cubeList.add(new ModelBox(gun225, 219, 42, 3.5462F, -4.7606F, -1.01F, 2, 1, 1, 0.0F, false));
		gun225.cubeList.add(new ModelBox(gun225, 219, 42, 3.6504F, -1.4575F, -1.01F, 2, 1, 1, 0.0F, false));

		gun2 = new ModelRenderer(this);
		gun2.setRotationPoint(-1.4909F, -29.9017F, -40.01F);
		sr3m_handguard.addChild(gun2);
		setRotationAngle(gun2, 0.0F, -0.9599F, 1.5708F);
		gun2.cubeList.add(new ModelBox(gun2, 217, 40, -1.3747F, -2.1516F, 1.7222F, 2, 1, 3, 0.0F, false));
		gun2.cubeList.add(new ModelBox(gun2, 217, 40, -1.2705F, 1.1516F, 1.7222F, 2, 1, 3, 0.0F, false));

		gun14 = new ModelRenderer(this);
		gun14.setRotationPoint(-1.4909F, -29.7262F, -24.4261F);
		sr3m_handguard.addChild(gun14);
		setRotationAngle(gun14, -3.1416F, -0.6109F, -1.5708F);
		gun14.cubeList.add(new ModelBox(gun14, 215, 38, 0.0989F, -2.1809F, -2.9404F, 2, 1, 5, 0.0F, false));
		gun14.cubeList.add(new ModelBox(gun14, 3, 33, 0.0989F, 1.2191F, -2.9404F, 2, 1, 5, 0.0F, false));

		gun18 = new ModelRenderer(this);
		gun18.setRotationPoint(-1.51F, -29.5133F, -22.2063F);
		sr3m_handguard.addChild(gun18);
		setRotationAngle(gun18, -3.1416F, -1.1781F, -1.5708F);
		gun18.cubeList.add(new ModelBox(gun18, 26, 128, -0.3061F, -2.2F, -1.3807F, 2, 1, 1, 0.0F, false));
		gun18.cubeList.add(new ModelBox(gun18, 101, 23, -0.3061F, 1.2F, -1.3807F, 2, 1, 1, 0.0F, false));

		gun23 = new ModelRenderer(this);
		gun23.setRotationPoint(-1.51F, -29.4272F, -21.4196F);
		sr3m_handguard.addChild(gun23);
		setRotationAngle(gun23, -3.1416F, -0.6545F, -1.5708F);
		gun23.cubeList.add(new ModelBox(gun23, 25, 127, 0.366F, -2.2F, -1.366F, 1, 1, 2, 0.0F, false));
		gun23.cubeList.add(new ModelBox(gun23, 100, 22, 0.366F, 1.2F, -1.366F, 1, 1, 2, 0.0F, false));

		gun24 = new ModelRenderer(this);
		gun24.setRotationPoint(-1.51F, -29.4272F, -21.4196F);
		sr3m_handguard.addChild(gun24);
		setRotationAngle(gun24, -3.1416F, 0.0F, -1.5708F);
		gun24.cubeList.add(new ModelBox(gun24, 36, 235, 0.2522F, -2.2F, -1.9153F, 7, 1, 1, 0.0F, false));
		gun24.cubeList.add(new ModelBox(gun24, 23, 128, 0.2522F, 1.2F, -1.9153F, 7, 1, 1, 0.0F, false));

		gun227 = new ModelRenderer(this);
		gun227.setRotationPoint(-4.1F, -36.5F, -41.5F);
		sr3m_handguard.addChild(gun227);
		gun227.cubeList.add(new ModelBox(gun227, 49, 93, 0.4575F, -0.3496F, -0.01F, 2, 4, 15, 0.0F, false));
		gun227.cubeList.add(new ModelBox(gun227, 63, 107, 0.4575F, -0.3496F, -1.01F, 2, 4, 1, 0.0F, false));
		gun227.cubeList.add(new ModelBox(gun227, 57, 101, 0.4575F, -0.3496F, 14.99F, 2, 4, 7, 0.0F, false));

		gun228 = new ModelRenderer(this);
		gun228.setRotationPoint(0.2F, -36.5F, -39.5F);
		sr3m_handguard.addChild(gun228);
		gun228.cubeList.add(new ModelBox(gun228, 30, 219, -1.5394F, -0.4538F, -2.01F, 2, 4, 15, 0.0F, false));
		gun228.cubeList.add(new ModelBox(gun228, 44, 233, -1.5394F, -0.4538F, -3.01F, 2, 4, 1, 0.0F, false));
		gun228.cubeList.add(new ModelBox(gun228, 38, 227, -1.5394F, -0.4538F, 12.99F, 2, 4, 7, 0.0F, false));

		gun229 = new ModelRenderer(this);
		gun229.setRotationPoint(-3.2F, -38.8F, -41.5F);
		sr3m_handguard.addChild(gun229);
		setRotationAngle(gun229, 0.0F, 0.0F, 0.2231F);
		gun229.cubeList.add(new ModelBox(gun229, 205, 0, 0.0F, 1.0F, -0.01F, 2, 1, 15, 0.0F, false));
		gun229.cubeList.add(new ModelBox(gun229, 213, 8, 0.0F, 1.0F, 14.99F, 2, 1, 7, 0.0F, false));
		gun229.cubeList.add(new ModelBox(gun229, 85, 6, 0.0F, 0.0F, -0.01F, 2, 1, 2, 0.0F, false));
		gun229.cubeList.add(new ModelBox(gun229, 219, 14, 0.0F, 1.0F, -1.01F, 2, 1, 1, 0.0F, false));
		gun229.cubeList.add(new ModelBox(gun229, 86, 7, 0.0F, 0.0F, -1.01F, 2, 1, 1, 0.0F, false));
		gun229.cubeList.add(new ModelBox(gun229, 151, 133, -0.4F, -0.4F, 1.39F, 2, 1, 12, -0.401F, false));
		gun229.cubeList.add(new ModelBox(gun229, 25, 83, 0.0F, 0.0F, 4.49F, 2, 1, 1, 0.0F, false));
		gun229.cubeList.add(new ModelBox(gun229, 25, 83, 0.0F, 0.0F, 7.99F, 2, 1, 1, 0.0F, false));
		gun229.cubeList.add(new ModelBox(gun229, 90, 161, 0.0F, 0.0F, 11.99F, 2, 1, 4, 0.0F, false));
		gun229.cubeList.add(new ModelBox(gun229, 93, 164, 0.0F, 0.0F, 11.49F, 2, 1, 1, 0.0F, false));
		gun229.cubeList.add(new ModelBox(gun229, 90, 161, 0.0F, 0.0F, 15.99F, 2, 1, 4, 0.0F, false));
		gun229.cubeList.add(new ModelBox(gun229, 92, 163, 0.0F, 0.0F, 19.99F, 2, 1, 2, 0.0F, false));

		gun230 = new ModelRenderer(this);
		gun230.setRotationPoint(0.2F, -38.9F, -41.5F);
		sr3m_handguard.addChild(gun230);
		setRotationAngle(gun230, 0.0F, 0.0F, 1.3384F);
		gun230.cubeList.add(new ModelBox(gun230, 30, 221, 1.0F, 0.0F, -0.01F, 1, 2, 15, 0.0F, false));
		gun230.cubeList.add(new ModelBox(gun230, 132, 225, 1.0F, 0.0F, 14.99F, 1, 2, 7, 0.0F, false));
		gun230.cubeList.add(new ModelBox(gun230, 39, 139, -0.4F, -0.4F, -0.01F, 1, 2, 15, -0.401F, false));
		gun230.cubeList.add(new ModelBox(gun230, 25, 78, 0.0F, 0.0F, -0.01F, 1, 2, 2, 0.0F, false));
		gun230.cubeList.add(new ModelBox(gun230, 26, 79, 0.0F, 0.0F, -1.01F, 1, 2, 1, 0.0F, false));
		gun230.cubeList.add(new ModelBox(gun230, 44, 235, 1.0F, 0.0F, -1.01F, 1, 2, 1, 0.0F, false));
		gun230.cubeList.add(new ModelBox(gun230, 99, 56, 0.0F, 0.0F, 4.49F, 1, 2, 1, 0.0F, false));
		gun230.cubeList.add(new ModelBox(gun230, 99, 56, 0.0F, 0.0F, 7.99F, 1, 2, 1, 0.0F, false));
		gun230.cubeList.add(new ModelBox(gun230, 10, 46, 0.0F, 0.0F, 11.99F, 1, 2, 4, 0.0F, false));
		gun230.cubeList.add(new ModelBox(gun230, 13, 49, 0.0F, 0.0F, 11.49F, 1, 2, 1, 0.0F, false));
		gun230.cubeList.add(new ModelBox(gun230, 10, 46, 0.0F, 0.0F, 15.99F, 1, 2, 4, 0.0F, false));
		gun230.cubeList.add(new ModelBox(gun230, 12, 48, 0.0F, 0.0F, 19.99F, 1, 2, 2, 0.0F, false));

		gun231 = new ModelRenderer(this);
		gun231.setRotationPoint(-2.3F, -39.32F, -41.5F);
		sr3m_handguard.addChild(gun231);
		setRotationAngle(gun231, 0.0F, 0.0F, 1.041F);
		gun231.cubeList.add(new ModelBox(gun231, 141, 219, 0.0F, 0.0F, 0.01F, 1, 1, 15, 0.0F, false));
		gun231.cubeList.add(new ModelBox(gun231, 155, 233, 0.0F, 0.0F, -0.99F, 1, 1, 1, 0.0F, false));
		gun231.cubeList.add(new ModelBox(gun231, 149, 227, 0.0F, 0.0F, 15.01F, 1, 1, 7, 0.0F, false));

		gun232 = new ModelRenderer(this);
		gun232.setRotationPoint(-2.0F, -39.5F, -41.5F);
		sr3m_handguard.addChild(gun232);
		setRotationAngle(gun232, 0.0F, 0.0F, 1.041F);
		gun232.cubeList.add(new ModelBox(gun232, 123, 201, 0.0F, 0.0F, 0.0F, 2, 1, 15, 0.0F, false));
		gun232.cubeList.add(new ModelBox(gun232, 137, 215, 0.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));
		gun232.cubeList.add(new ModelBox(gun232, 131, 209, 0.0F, 0.0F, 15.0F, 2, 1, 7, 0.0F, false));

		gun233 = new ModelRenderer(this);
		gun233.setRotationPoint(-0.7F, -39.35F, -41.5F);
		sr3m_handguard.addChild(gun233);
		setRotationAngle(gun233, 0.0F, 0.0F, 0.4461F);
		gun233.cubeList.add(new ModelBox(gun233, 0, 155, 0.0F, 0.0F, 0.01F, 1, 1, 15, 0.0F, false));
		gun233.cubeList.add(new ModelBox(gun233, 14, 169, 0.0F, 0.0F, -0.99F, 1, 1, 1, 0.0F, false));
		gun233.cubeList.add(new ModelBox(gun233, 8, 163, 0.0F, 0.0F, 15.01F, 1, 1, 7, 0.0F, false));

		gun234 = new ModelRenderer(this);
		gun234.setRotationPoint(-1.0F, -39.5F, -41.5F);
		sr3m_handguard.addChild(gun234);
		setRotationAngle(gun234, 0.0F, 0.0F, 0.4461F);
		gun234.cubeList.add(new ModelBox(gun234, 53, 217, 0.0F, 0.0F, 0.0F, 1, 2, 15, 0.0F, false));
		gun234.cubeList.add(new ModelBox(gun234, 67, 231, 0.0F, 0.0F, -1.0F, 1, 2, 1, 0.0F, false));
		gun234.cubeList.add(new ModelBox(gun234, 61, 225, 0.0F, 0.0F, 15.0F, 1, 2, 7, 0.0F, false));

		gun235 = new ModelRenderer(this);
		gun235.setRotationPoint(-2.0F, -39.5F, -41.5F);
		sr3m_handguard.addChild(gun235);
		gun235.cubeList.add(new ModelBox(gun235, 209, 116, 0.0F, 0.0F, -0.02F, 1, 2, 15, 0.0F, false));
		gun235.cubeList.add(new ModelBox(gun235, 223, 130, 0.0F, 0.0F, -1.02F, 1, 2, 1, 0.0F, false));

		gun236 = new ModelRenderer(this);
		gun236.setRotationPoint(-1.5F, -31.4F, -32.55F);
		sr3m_handguard.addChild(gun236);
		setRotationAngle(gun236, 1.4399F, 0.0F, 0.0F);
		gun236.cubeList.add(new ModelBox(gun236, 52, 96, -1.5F, -5.1F, -1.0F, 2, 6, 2, 0.0F, false));
		gun236.cubeList.add(new ModelBox(gun236, 52, 96, -1.0F, -5.1F, -0.6F, 2, 3, 2, 0.0F, false));
		gun236.cubeList.add(new ModelBox(gun236, 52, 96, -1.0F, -5.1F, -1.4F, 2, 3, 2, 0.0F, false));
		gun236.cubeList.add(new ModelBox(gun236, 52, 96, -0.5F, -5.1F, -1.0F, 2, 6, 2, 0.0F, false));
		gun236.cubeList.add(new ModelBox(gun236, 52, 96, -0.5F, 0.9F, -1.0F, 2, 4, 2, 0.0F, false));
		gun236.cubeList.add(new ModelBox(gun236, 52, 96, -1.5F, 0.9F, -1.0F, 2, 4, 2, 0.0F, false));
		gun236.cubeList.add(new ModelBox(gun236, 52, 96, -1.0F, -1.7F, -1.4F, 2, 1, 2, 0.0F, false));
		gun236.cubeList.add(new ModelBox(gun236, 52, 96, -1.0F, -1.7F, -0.6F, 2, 1, 2, 0.0F, false));
		gun236.cubeList.add(new ModelBox(gun236, 52, 96, -1.0F, -0.3F, -0.6F, 2, 1, 2, 0.0F, false));
		gun236.cubeList.add(new ModelBox(gun236, 52, 96, -1.0F, -0.3F, -1.4F, 2, 1, 2, 0.0F, false));
		gun236.cubeList.add(new ModelBox(gun236, 52, 96, -1.0F, 1.1F, -1.4F, 2, 1, 2, 0.0F, false));
		gun236.cubeList.add(new ModelBox(gun236, 52, 96, -1.0F, 1.1F, -0.6F, 2, 1, 2, 0.0F, false));
		gun236.cubeList.add(new ModelBox(gun236, 52, 96, -1.0F, 2.5F, -1.4F, 2, 2, 2, 0.0F, false));
		gun236.cubeList.add(new ModelBox(gun236, 52, 96, -1.0F, 2.5F, -0.6F, 2, 2, 2, 0.0F, false));
		gun236.cubeList.add(new ModelBox(gun236, 1, 184, -0.5F, -5.6F, -0.5F, 1, 6, 1, 0.0F, false));

		gun237 = new ModelRenderer(this);
		gun237.setRotationPoint(-1.5F, -37.0F, -41.5F);
		sr3m_handguard.addChild(gun237);
		gun237.cubeList.add(new ModelBox(gun237, 33, 115, 0.0F, 0.0F, 0.0F, 1, 3, 5, 0.0F, false));

		gun238 = new ModelRenderer(this);
		gun238.setRotationPoint(-2.5F, -38.0F, -41.5F);
		sr3m_handguard.addChild(gun238);
		gun238.cubeList.add(new ModelBox(gun238, 98, 111, 0.0F, 0.0F, 0.0F, 2, 5, 5, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		sr3m_handguard.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}