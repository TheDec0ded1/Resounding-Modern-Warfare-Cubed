package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.10.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class PKPBarrel extends ModelBase {
	private final ModelRenderer barrelPKP;
	private final ModelRenderer gun21_r3;
	private final ModelRenderer gun22_r5;
	private final ModelRenderer gun23_r5;
	private final ModelRenderer gun22_r6;
	private final ModelRenderer gun27_r3;
	private final ModelRenderer gun25_r7;
	private final ModelRenderer gun24_r5;
	private final ModelRenderer gun24_r6;
	private final ModelRenderer gun23_r6;
	private final ModelRenderer gun117;
	private final ModelRenderer gun118;
	private final ModelRenderer bone24;
	private final ModelRenderer gun119;
	private final ModelRenderer gun120;
	private final ModelRenderer gun121;
	private final ModelRenderer gun122;
	private final ModelRenderer gun123;
	private final ModelRenderer gun124;
	private final ModelRenderer bone25;
	private final ModelRenderer gun125;
	private final ModelRenderer gun126;
	private final ModelRenderer gun127;
	private final ModelRenderer gun128;
	private final ModelRenderer gun131;
	private final ModelRenderer gun132;
	private final ModelRenderer bone26;
	private final ModelRenderer gun133;
	private final ModelRenderer gun134;
	private final ModelRenderer gun135;
	private final ModelRenderer gun136;
	private final ModelRenderer gun137;
	private final ModelRenderer gun138;
	private final ModelRenderer bone27;
	private final ModelRenderer gun139;
	private final ModelRenderer gun140;
	private final ModelRenderer gun141;
	private final ModelRenderer gun142;
	private final ModelRenderer gun143;
	private final ModelRenderer gun144;
	private final ModelRenderer frontIron3;
	private final ModelRenderer gun_r1;
	private final ModelRenderer gun_r2;
	private final ModelRenderer gun_r3;
	private final ModelRenderer gun_r4;
	private final ModelRenderer gun_r5;
	private final ModelRenderer gun_r6;
	private final ModelRenderer gun_r7;
	private final ModelRenderer gun24_r1;
	private final ModelRenderer gun162_r1;
	private final ModelRenderer gun22_r1;
	private final ModelRenderer ironsights_r1;
	private final ModelRenderer ironsights_r2;
	private final ModelRenderer ironsights_r3;
	private final ModelRenderer ironsights_r4;
	private final ModelRenderer ironsights_r5;
	private final ModelRenderer ironsights_r6;
	private final ModelRenderer ironsights_r7;
	private final ModelRenderer ironsights_r8;
	private final ModelRenderer ironsights_r9;
	private final ModelRenderer ironsights_r10;
	private final ModelRenderer ironsights_r11;
	private final ModelRenderer ironsights_r12;
	private final ModelRenderer ironsights_r13;
	private final ModelRenderer ironsights_r14;
	private final ModelRenderer ironsights_r15;
	private final ModelRenderer ironsights_r16;

	public PKPBarrel() {
		textureWidth = 512;
		textureHeight = 512;

		barrelPKP = new ModelRenderer(this);
		barrelPKP.setRotationPoint(-2.0F, -13.5F, -55.7F);
		barrelPKP.cubeList.add(new ModelBox(barrelPKP, 256, 286, 0.9899F, 1.1399F, -17.0F, 1, 1, 38, 0.2F, false));
		barrelPKP.cubeList.add(new ModelBox(barrelPKP, 216, 285, 0.0F, 0.15F, -17.0F, 1, 1, 38, 0.2F, false));
		barrelPKP.cubeList.add(new ModelBox(barrelPKP, 109, 164, -0.5F, 0.55F, -22.6F, 2, 1, 3, 0.2F, false));
		barrelPKP.cubeList.add(new ModelBox(barrelPKP, 216, 262, -1.0F, -6.0436F, 1.9389F, 3, 1, 15, -0.3F, false));
		barrelPKP.cubeList.add(new ModelBox(barrelPKP, 177, 261, -1.0F, -5.6436F, 1.9389F, 3, 1, 15, -0.3F, false));
		barrelPKP.cubeList.add(new ModelBox(barrelPKP, 249, 259, -1.0F, -0.6436F, 1.9389F, 3, 2, 15, -0.3F, false));
		barrelPKP.cubeList.add(new ModelBox(barrelPKP, 155, 112, -1.0F, -5.2436F, 4.6389F, 3, 1, 2, -0.3F, false));
		barrelPKP.cubeList.add(new ModelBox(barrelPKP, 155, 102, -1.0F, -5.2436F, 8.6389F, 3, 1, 2, -0.3F, false));
		barrelPKP.cubeList.add(new ModelBox(barrelPKP, 59, 136, -1.0F, -5.2436F, 12.6389F, 3, 1, 2, -0.3F, false));
		barrelPKP.cubeList.add(new ModelBox(barrelPKP, 0, 13, -1.0F, -6.0436F, -0.4611F, 3, 7, 3, -0.3F, false));
		barrelPKP.cubeList.add(new ModelBox(barrelPKP, 129, 57, -1.0F, -6.0436F, 15.9389F, 3, 2, 3, -0.3F, false));
		barrelPKP.cubeList.add(new ModelBox(barrelPKP, 129, 25, -1.0F, -1.0436F, 15.9389F, 3, 2, 3, -0.3F, false));
		barrelPKP.cubeList.add(new ModelBox(barrelPKP, 72, 0, -1.0F, -6.0436F, 16.9389F, 3, 7, 2, -0.3F, false));
		barrelPKP.cubeList.add(new ModelBox(barrelPKP, 156, 20, 0.8485F, 1.0985F, -47.2F, 1, 1, 4, 0.1F, false));
		barrelPKP.cubeList.add(new ModelBox(barrelPKP, 156, 77, 0.0F, 0.25F, -47.2F, 1, 1, 4, 0.1F, false));

		gun_r1 = new ModelRenderer(this);
		gun_r1.setRotationPoint(0.5F, 2.2233F, -18.79F);
		barrelPKP.addChild(gun_r1);
		setRotationAngle(gun_r1, 0.3054F, 0.0F, 0.0F);
		gun_r1.cubeList.add(new ModelBox(gun_r1, 87, 143, -0.5F, -1.4899F, -2.0F, 1, 1, 4, 0.2F, false));

		gun_r2 = new ModelRenderer(this);
		gun_r2.setRotationPoint(-0.0833F, 1.6399F, -18.79F);
		barrelPKP.addChild(gun_r2);
		setRotationAngle(gun_r2, 0.0F, 0.3054F, 0.0F);
		gun_r2.cubeList.add(new ModelBox(gun_r2, 132, 88, 0.4899F, -0.5F, -2.0F, 1, 1, 4, 0.2F, false));

		gun_r3 = new ModelRenderer(this);
		gun_r3.setRotationPoint(0.5F, -2.8095F, 8.6906F);
		barrelPKP.addChild(gun_r3);
		setRotationAngle(gun_r3, 0.1745F, 0.0F, 0.0F);
		gun_r3.cubeList.add(new ModelBox(gun_r3, 156, 32, -1.5F, -0.5F, 7.4F, 3, 2, 2, -0.3F, false));

		gun_r4 = new ModelRenderer(this);
		gun_r4.setRotationPoint(0.5F, -4.2472F, 9.0379F);
		barrelPKP.addChild(gun_r4);
		setRotationAngle(gun_r4, 0.0F, 0.0F, 0.0F);
		gun_r4.cubeList.add(new ModelBox(gun_r4, 132, 93, -1.5F, 0.7F, 7.125F, 3, 2, 2, -0.3F, false));

		gun_r5 = new ModelRenderer(this);
		gun_r5.setRotationPoint(0.5F, -4.2472F, 9.0379F);
		barrelPKP.addChild(gun_r5);
		setRotationAngle(gun_r5, -0.1745F, 0.0F, 0.0F);
		gun_r5.cubeList.add(new ModelBox(gun_r5, 99, 164, -1.5F, 0.5F, 7.4F, 3, 2, 2, -0.3F, false));

		gun_r6 = new ModelRenderer(this);
		gun_r6.setRotationPoint(0.5F, -0.7105F, -18.1722F);
		barrelPKP.addChild(gun_r6);
		setRotationAngle(gun_r6, 0.2618F, 0.0F, 0.0F);
		gun_r6.cubeList.add(new ModelBox(gun_r6, 144, 120, -1.5F, -0.1F, -1.0F, 3, 1, 20, -0.3F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 216, 49, -1.5F, -0.5F, -1.0F, 3, 1, 20, -0.3F, false));

		gun_r7 = new ModelRenderer(this);
		gun_r7.setRotationPoint(0.0F, -0.5023F, -18.171F);
		barrelPKP.addChild(gun_r7);
		setRotationAngle(gun_r7, 0.8727F, 0.0F, 0.0F);
		gun_r7.cubeList.add(new ModelBox(gun_r7, 156, 116, -1.0F, -0.9F, -2.0F, 3, 1, 2, -0.3F, false));
		gun_r7.cubeList.add(new ModelBox(gun_r7, 37, 158, -1.0F, -1.0F, -2.0F, 3, 1, 2, -0.3F, false));

		gun21_r3 = new ModelRenderer(this);
		gun21_r3.setRotationPoint(1.6F, 0.6F, -54.0F);
		barrelPKP.addChild(gun21_r3);
		setRotationAngle(gun21_r3, 0.0F, 0.0F, -0.7854F);
		gun21_r3.cubeList.add(new ModelBox(gun21_r3, 288, 214, -1.0232F, -0.5425F, 37.0F, 1, 1, 38, 0.2F, false));
		gun21_r3.cubeList.add(new ModelBox(gun21_r3, 46, 95, -1.1354F, -0.5718F, 6.8F, 1, 1, 4, 0.1F, false));

		gun22_r5 = new ModelRenderer(this);
		gun22_r5.setRotationPoint(-0.6F, 0.6F, -54.0F);
		barrelPKP.addChild(gun22_r5);
		setRotationAngle(gun22_r5, 0.0F, 0.0F, 0.7854F);
		gun22_r5.cubeList.add(new ModelBox(gun22_r5, 288, 143, 0.0232F, -0.5425F, 37.0F, 1, 1, 38, 0.2F, false));
		gun22_r5.cubeList.add(new ModelBox(gun22_r5, 193, 107, 0.1354F, -0.5718F, 6.8F, 1, 1, 4, 0.1F, false));

		gun23_r5 = new ModelRenderer(this);
		gun23_r5.setRotationPoint(-0.6F, 1.6F, -54.0F);
		barrelPKP.addChild(gun23_r5);
		setRotationAngle(gun23_r5, 0.0F, 0.0F, -0.7854F);
		gun23_r5.cubeList.add(new ModelBox(gun23_r5, 288, 72, -0.7404F, 0.3061F, 37.0F, 1, 1, 38, 0.2F, false));
		gun23_r5.cubeList.add(new ModelBox(gun23_r5, 60, 95, -0.5697F, 0.2768F, 6.8F, 1, 1, 4, 0.1F, false));

		gun22_r6 = new ModelRenderer(this);
		gun22_r6.setRotationPoint(1.6F, 1.6F, -54.0F);
		barrelPKP.addChild(gun22_r6);
		setRotationAngle(gun22_r6, 0.0F, 0.0F, 0.7854F);
		gun22_r6.cubeList.add(new ModelBox(gun22_r6, 288, 0, -0.2596F, 0.3061F, 37.0F, 1, 1, 38, 0.2F, false));
		gun22_r6.cubeList.add(new ModelBox(gun22_r6, 131, 153, -0.4303F, 0.2768F, 6.8F, 1, 1, 4, 0.1F, false));

		gun27_r3 = new ModelRenderer(this);
		gun27_r3.setRotationPoint(1.0F, 0.0F, 0.0F);
		barrelPKP.addChild(gun27_r3);
		setRotationAngle(gun27_r3, 0.0133F, -0.0138F, 0.8203F);
		

		gun25_r7 = new ModelRenderer(this);
		gun25_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrelPKP.addChild(gun25_r7);
		setRotationAngle(gun25_r7, 0.0192F, 0.0F, 0.0F);
		

		gun24_r5 = new ModelRenderer(this);
		gun24_r5.setRotationPoint(-0.6F, 1.6F, 0.0F);
		barrelPKP.addChild(gun24_r5);
		setRotationAngle(gun24_r5, 0.0087F, -0.0148F, 0.0F);
		

		gun24_r6 = new ModelRenderer(this);
		gun24_r6.setRotationPoint(1.6F, 0.6F, 0.0F);
		barrelPKP.addChild(gun24_r6);
		setRotationAngle(gun24_r6, -0.0055F, 0.0163F, -0.8814F);
		

		gun23_r6 = new ModelRenderer(this);
		gun23_r6.setRotationPoint(1.6F, 1.6F, 0.0F);
		barrelPKP.addChild(gun23_r6);
		setRotationAngle(gun23_r6, 0.0087F, 0.0148F, 0.0F);
		

		gun117 = new ModelRenderer(this);
		gun117.setRotationPoint(-0.5F, 0.6F, -54.0F);
		barrelPKP.addChild(gun117);
		gun117.cubeList.add(new ModelBox(gun117, 132, 285, -0.49F, 0.5399F, 37.0F, 1, 1, 38, 0.2F, false));
		gun117.cubeList.add(new ModelBox(gun117, 153, 161, -0.3485F, 0.4985F, 6.8F, 1, 1, 4, 0.1F, false));

		gun24_r1 = new ModelRenderer(this);
		gun24_r1.setRotationPoint(1.5833F, 1.0399F, 35.21F);
		gun117.addChild(gun24_r1);
		setRotationAngle(gun24_r1, 0.0F, -0.3054F, 0.0F);
		gun24_r1.cubeList.add(new ModelBox(gun24_r1, 109, 153, -1.4899F, -0.5F, -2.0F, 1, 1, 4, 0.2F, false));

		gun118 = new ModelRenderer(this);
		gun118.setRotationPoint(0.0F, 1.2F, -54.0F);
		barrelPKP.addChild(gun118);
		gun118.cubeList.add(new ModelBox(gun118, 54, 285, 0.0F, 0.9299F, 37.0F, 1, 1, 38, 0.2F, false));
		gun118.cubeList.add(new ModelBox(gun118, 14, 162, 0.0F, 0.7471F, 6.8F, 1, 1, 4, 0.1F, false));

		gun22_r1 = new ModelRenderer(this);
		gun22_r1.setRotationPoint(0.5F, -0.1434F, 35.21F);
		gun118.addChild(gun22_r1);
		setRotationAngle(gun22_r1, -0.3054F, 0.0F, 0.0F);
		gun22_r1.cubeList.add(new ModelBox(gun22_r1, 37, 153, -0.5F, 0.4899F, -2.0F, 1, 1, 4, 0.2F, false));

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(0.0F, -2.6F, -35.5F);
		barrelPKP.addChild(bone24);
		

		gun119 = new ModelRenderer(this);
		gun119.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone24.addChild(gun119);
		gun119.cubeList.add(new ModelBox(gun119, 169, 59, 0.0F, 6.25F, 11.4F, 1, 1, 6, 0.0F, false));
		gun119.cubeList.add(new ModelBox(gun119, 169, 52, 0.0F, 7.6642F, 11.4F, 1, 1, 6, 0.0F, false));

		gun162_r1 = new ModelRenderer(this);
		gun162_r1.setRotationPoint(0.5F, 5.8161F, 10.333F);
		gun119.addChild(gun162_r1);
		setRotationAngle(gun162_r1, -1.0472F, 0.0F, 0.0F);
		gun162_r1.cubeList.add(new ModelBox(gun162_r1, 72, 32, -0.5F, -2.5F, -1.0F, 1, 3, 4, 0.0F, false));

		gun120 = new ModelRenderer(this);
		gun120.setRotationPoint(-1.0F, 1.0F, 0.0F);
		bone24.addChild(gun120);
		gun120.cubeList.add(new ModelBox(gun120, 154, 168, 0.2929F, 5.9571F, 11.4F, 1, 1, 6, 0.0F, false));
		gun120.cubeList.add(new ModelBox(gun120, 10, 168, 1.7071F, 5.9571F, 11.4F, 1, 1, 6, 0.0F, false));

		gun121 = new ModelRenderer(this);
		gun121.setRotationPoint(-1.0F, 1.0F, 0.0F);
		bone24.addChild(gun121);
		setRotationAngle(gun121, 0.0F, 0.0F, -0.7854F);
		gun121.cubeList.add(new ModelBox(gun121, 155, 10, -4.0052F, 4.4194F, 11.4F, 1, 1, 6, 0.0F, false));

		gun122 = new ModelRenderer(this);
		gun122.setRotationPoint(-1.0F, 2.0F, 0.0F);
		bone24.addChild(gun122);
		setRotationAngle(gun122, 0.0F, 0.0F, -0.7854F);
		gun122.cubeList.add(new ModelBox(gun122, 10, 155, -4.0052F, 4.4194F, 11.4F, 1, 1, 6, 0.0F, false));

		gun123 = new ModelRenderer(this);
		gun123.setRotationPoint(1.0F, 0.0F, 0.0F);
		bone24.addChild(gun123);
		setRotationAngle(gun123, 0.0F, 0.0F, 0.7854F);
		gun123.cubeList.add(new ModelBox(gun123, 13, 133, 4.4194F, 4.4194F, 11.4F, 1, 1, 6, 0.0F, false));

		gun124 = new ModelRenderer(this);
		gun124.setRotationPoint(1.0F, 3.0F, 0.0F);
		bone24.addChild(gun124);
		setRotationAngle(gun124, 0.0F, 0.0F, -2.3562F);
		gun124.cubeList.add(new ModelBox(gun124, 86, 72, -4.0052F, -4.0052F, 11.4F, 1, 1, 6, 0.0F, false));

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(0.0F, -5.9F, -41.4F);
		barrelPKP.addChild(bone25);
		

		gun125 = new ModelRenderer(this);
		gun125.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone25.addChild(gun125);
		gun125.cubeList.add(new ModelBox(gun125, 328, 0, 0.0F, 6.3F, -10.6F, 1, 1, 35, 0.0F, false));
		gun125.cubeList.add(new ModelBox(gun125, 262, 326, 0.0F, 7.7142F, -10.6F, 1, 1, 35, 0.0F, false));

		gun126 = new ModelRenderer(this);
		gun126.setRotationPoint(-1.0F, 1.0F, 0.0F);
		bone25.addChild(gun126);
		gun126.cubeList.add(new ModelBox(gun126, 225, 325, 0.2929F, 6.0071F, -10.6F, 1, 1, 35, 0.0F, false));
		gun126.cubeList.add(new ModelBox(gun126, 100, 325, 1.7071F, 6.0071F, -10.6F, 1, 1, 35, 0.0F, false));

		gun127 = new ModelRenderer(this);
		gun127.setRotationPoint(-1.0F, 1.0F, 0.0F);
		bone25.addChild(gun127);
		setRotationAngle(gun127, 0.0F, 0.0F, -0.7854F);
		gun127.cubeList.add(new ModelBox(gun127, 72, 32, -4.0406F, 4.4548F, -6.6F, 1, 1, 31, 0.0F, false));
		gun127.cubeList.add(new ModelBox(gun127, 89, 104, -4.0406F, 4.4548F, -10.6F, 1, 1, 1, 0.0F, false));

		gun128 = new ModelRenderer(this);
		gun128.setRotationPoint(-1.0F, 2.0F, 0.0F);
		bone25.addChild(gun128);
		setRotationAngle(gun128, 0.0F, 0.0F, -0.7854F);
		gun128.cubeList.add(new ModelBox(gun128, 72, 0, -4.0406F, 4.4548F, -6.6F, 1, 1, 31, 0.0F, false));
		gun128.cubeList.add(new ModelBox(gun128, 96, 104, -4.0406F, 4.4548F, -10.6F, 1, 1, 1, 0.0F, false));

		gun131 = new ModelRenderer(this);
		gun131.setRotationPoint(1.0F, 0.0F, 0.0F);
		bone25.addChild(gun131);
		setRotationAngle(gun131, 0.0F, 0.0F, 0.7854F);
		gun131.cubeList.add(new ModelBox(gun131, 0, 71, 4.4548F, 4.4548F, -6.6F, 1, 1, 31, 0.0F, false));
		gun131.cubeList.add(new ModelBox(gun131, 22, 88, 4.4548F, 4.4548F, -10.6F, 1, 1, 1, 0.0F, false));

		gun132 = new ModelRenderer(this);
		gun132.setRotationPoint(1.0F, 3.0F, 0.0F);
		bone25.addChild(gun132);
		setRotationAngle(gun132, 0.0F, 0.0F, -2.3562F);
		gun132.cubeList.add(new ModelBox(gun132, 0, 30, -4.0406F, -4.0406F, -6.6F, 1, 1, 31, 0.0F, false));
		gun132.cubeList.add(new ModelBox(gun132, 47, 0, -4.0406F, -4.0406F, -10.6F, 1, 1, 1, 0.0F, false));

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(0.0F, -5.9F, -66.4F);
		barrelPKP.addChild(bone26);
		

		gun133 = new ModelRenderer(this);
		gun133.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone26.addChild(gun133);
		

		gun134 = new ModelRenderer(this);
		gun134.setRotationPoint(-1.0F, 1.0F, 0.0F);
		bone26.addChild(gun134);
		

		gun135 = new ModelRenderer(this);
		gun135.setRotationPoint(-1.0F, 1.0F, 0.0F);
		bone26.addChild(gun135);
		setRotationAngle(gun135, 0.0F, 0.0F, -0.7854F);
		

		gun136 = new ModelRenderer(this);
		gun136.setRotationPoint(-1.0F, 2.0F, 0.0F);
		bone26.addChild(gun136);
		setRotationAngle(gun136, 0.0F, 0.0F, -0.7854F);
		

		gun137 = new ModelRenderer(this);
		gun137.setRotationPoint(1.0F, 0.0F, 0.0F);
		bone26.addChild(gun137);
		setRotationAngle(gun137, 0.0F, 0.0F, 0.7854F);
		

		gun138 = new ModelRenderer(this);
		gun138.setRotationPoint(1.0F, 3.0F, 0.0F);
		bone26.addChild(gun138);
		setRotationAngle(gun138, 0.0F, 0.0F, -2.3562F);
		

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(0.0F, -5.9F, -70.4F);
		barrelPKP.addChild(bone27);
		

		gun139 = new ModelRenderer(this);
		gun139.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone27.addChild(gun139);
		

		gun140 = new ModelRenderer(this);
		gun140.setRotationPoint(-1.0F, 1.0F, 0.0F);
		bone27.addChild(gun140);
		

		gun141 = new ModelRenderer(this);
		gun141.setRotationPoint(-1.0F, 1.0F, 0.0F);
		bone27.addChild(gun141);
		setRotationAngle(gun141, 0.0F, 0.0F, -0.7854F);
		

		gun142 = new ModelRenderer(this);
		gun142.setRotationPoint(-1.0F, 2.0F, 0.0F);
		bone27.addChild(gun142);
		setRotationAngle(gun142, 0.0F, 0.0F, -0.7854F);
		

		gun143 = new ModelRenderer(this);
		gun143.setRotationPoint(1.0F, 0.0F, 0.0F);
		bone27.addChild(gun143);
		setRotationAngle(gun143, 0.0F, 0.0F, 0.7854F);
		

		gun144 = new ModelRenderer(this);
		gun144.setRotationPoint(1.0F, 3.0F, 0.0F);
		bone27.addChild(gun144);
		setRotationAngle(gun144, 0.0F, 0.0F, -2.3562F);
		

		frontIron3 = new ModelRenderer(this);
		frontIron3.setRotationPoint(2.0F, 33.5F, 89.7F);
		barrelPKP.addChild(frontIron3);
		frontIron3.cubeList.add(new ModelBox(frontIron3, 60, 62, -2.0F, -40.2F, -136.4F, 1, 2, 1, -0.4F, false));

		ironsights_r1 = new ModelRenderer(this);
		ironsights_r1.setRotationPoint(-1.5F, -40.2623F, -135.6153F);
		frontIron3.addChild(ironsights_r1);
		setRotationAngle(ironsights_r1, 0.0F, -1.5708F, 0.0F);
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 86, 32, -1.4F, 1.0F, -1.0F, 1, 2, 2, -0.2F, false));

		ironsights_r2 = new ModelRenderer(this);
		ironsights_r2.setRotationPoint(-1.5F, -40.2623F, -134.8153F);
		frontIron3.addChild(ironsights_r2);
		setRotationAngle(ironsights_r2, 0.0F, -1.5708F, 0.0F);
		ironsights_r2.cubeList.add(new ModelBox(ironsights_r2, 31, 133, -0.4F, 3.0F, -1.0F, 1, 1, 2, -0.2F, false));

		ironsights_r3 = new ModelRenderer(this);
		ironsights_r3.setRotationPoint(-2.2757F, -40.115F, -135.3153F);
		frontIron3.addChild(ironsights_r3);
		setRotationAngle(ironsights_r3, 0.0F, -1.5708F, -0.48F);
		ironsights_r3.cubeList.add(new ModelBox(ironsights_r3, 39, 133, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r4 = new ModelRenderer(this);
		ironsights_r4.setRotationPoint(-1.814F, -40.6254F, -135.3153F);
		frontIron3.addChild(ironsights_r4);
		setRotationAngle(ironsights_r4, 0.0F, -1.5708F, 0.48F);
		ironsights_r4.cubeList.add(new ModelBox(ironsights_r4, 49, 133, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r5 = new ModelRenderer(this);
		ironsights_r5.setRotationPoint(-0.299F, -41.0871F, -135.3153F);
		frontIron3.addChild(ironsights_r5);
		setRotationAngle(ironsights_r5, 0.0F, -1.5708F, -0.48F);
		ironsights_r5.cubeList.add(new ModelBox(ironsights_r5, 135, 41, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r6 = new ModelRenderer(this);
		ironsights_r6.setRotationPoint(0.1627F, -39.6533F, -135.3153F);
		frontIron3.addChild(ironsights_r6);
		setRotationAngle(ironsights_r6, 0.0F, -1.5708F, 0.48F);
		ironsights_r6.cubeList.add(new ModelBox(ironsights_r6, 135, 44, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r7 = new ModelRenderer(this);
		ironsights_r7.setRotationPoint(-0.299F, -41.0871F, -136.2153F);
		frontIron3.addChild(ironsights_r7);
		setRotationAngle(ironsights_r7, 0.0F, -1.5708F, -0.48F);
		ironsights_r7.cubeList.add(new ModelBox(ironsights_r7, 135, 63, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r8 = new ModelRenderer(this);
		ironsights_r8.setRotationPoint(-1.814F, -40.6254F, -136.2153F);
		frontIron3.addChild(ironsights_r8);
		setRotationAngle(ironsights_r8, 0.0F, -1.5708F, 0.48F);
		ironsights_r8.cubeList.add(new ModelBox(ironsights_r8, 135, 72, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r9 = new ModelRenderer(this);
		ironsights_r9.setRotationPoint(0.1627F, -39.6533F, -136.2153F);
		frontIron3.addChild(ironsights_r9);
		setRotationAngle(ironsights_r9, 0.0F, -1.5708F, 0.48F);
		ironsights_r9.cubeList.add(new ModelBox(ironsights_r9, 135, 75, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r10 = new ModelRenderer(this);
		ironsights_r10.setRotationPoint(-2.2757F, -40.115F, -136.2153F);
		frontIron3.addChild(ironsights_r10);
		setRotationAngle(ironsights_r10, 0.0F, -1.5708F, -0.48F);
		ironsights_r10.cubeList.add(new ModelBox(ironsights_r10, 135, 111, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r11 = new ModelRenderer(this);
		ironsights_r11.setRotationPoint(-1.5F, -40.2623F, -135.1153F);
		frontIron3.addChild(ironsights_r11);
		setRotationAngle(ironsights_r11, 0.0F, -1.5708F, 0.0F);
		ironsights_r11.cubeList.add(new ModelBox(ironsights_r11, 42, 71, -1.4F, 1.0F, -1.0F, 2, 3, 2, -0.2F, false));

		ironsights_r12 = new ModelRenderer(this);
		ironsights_r12.setRotationPoint(-1.5F, -34.4F, -135.6F);
		frontIron3.addChild(ironsights_r12);
		setRotationAngle(ironsights_r12, 0.0F, -1.5708F, 0.0F);
		ironsights_r12.cubeList.add(new ModelBox(ironsights_r12, 0, 48, -1.4F, -4.0F, -1.0F, 1, 6, 2, -0.2F, false));

		ironsights_r13 = new ModelRenderer(this);
		ironsights_r13.setRotationPoint(-1.5F, -37.7F, -135.5F);
		frontIron3.addChild(ironsights_r13);
		setRotationAngle(ironsights_r13, 0.0F, -1.5708F, 0.0F);
		ironsights_r13.cubeList.add(new ModelBox(ironsights_r13, 109, 158, -1.4F, 1.0F, -1.0F, 3, 1, 2, -0.2F, false));
		ironsights_r13.cubeList.add(new ModelBox(ironsights_r13, 86, 91, -1.4F, 3.7F, -1.0F, 4, 1, 2, -0.2F, false));

		ironsights_r14 = new ModelRenderer(this);
		ironsights_r14.setRotationPoint(-1.5F, -37.1F, -135.2F);
		frontIron3.addChild(ironsights_r14);
		setRotationAngle(ironsights_r14, 0.0F, -1.5708F, 0.0F);
		ironsights_r14.cubeList.add(new ModelBox(ironsights_r14, 131, 158, -1.4F, 1.0F, -1.0F, 3, 1, 2, -0.2F, false));
		ironsights_r14.cubeList.add(new ModelBox(ironsights_r14, 0, 99, -1.4F, 3.7F, -1.0F, 4, 1, 2, -0.2F, false));

		ironsights_r15 = new ModelRenderer(this);
		ironsights_r15.setRotationPoint(-1.5F, -35.6F, -135.0F);
		frontIron3.addChild(ironsights_r15);
		setRotationAngle(ironsights_r15, 0.0F, -1.5708F, 0.0F);
		ironsights_r15.cubeList.add(new ModelBox(ironsights_r15, 78, 163, -1.4F, 1.0F, -1.0F, 3, 1, 2, -0.2F, false));

		ironsights_r16 = new ModelRenderer(this);
		ironsights_r16.setRotationPoint(-1.5F, -34.481F, -134.5433F);
		frontIron3.addChild(ironsights_r16);
		setRotationAngle(ironsights_r16, 1.5708F, -1.2217F, -1.5708F);
		ironsights_r16.cubeList.add(new ModelBox(ironsights_r16, 52, 71, 0.4F, -4.0F, -1.0F, 1, 6, 2, -0.2F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		barrelPKP.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}