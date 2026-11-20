package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M14A1Body extends ModelWithAttachments {
	private final ModelRenderer defaultchassis;
	private final ModelRenderer gun272;
	private final ModelRenderer gun271;
	private final ModelRenderer gun268;
	private final ModelRenderer gun267;
	private final ModelRenderer gun266;
	private final ModelRenderer gun265;
	private final ModelRenderer gun264;
	private final ModelRenderer gun213;
	private final ModelRenderer gun214;
	private final ModelRenderer gun212;
	private final ModelRenderer gun211;
	private final ModelRenderer gun210;
	private final ModelRenderer gun202;
	private final ModelRenderer gun201;
	private final ModelRenderer gun192;
	private final ModelRenderer gun191;
	private final ModelRenderer gun190;
	private final ModelRenderer gun189;
	private final ModelRenderer gun188;
	private final ModelRenderer gun185;
	private final ModelRenderer gun184;
	private final ModelRenderer gun183;
	private final ModelRenderer gun182;
	private final ModelRenderer gun181;
	private final ModelRenderer gun170;
	private final ModelRenderer gun169;
	private final ModelRenderer gun168;
	private final ModelRenderer gun167;
	private final ModelRenderer gun59;
	private final ModelRenderer gun58;
	private final ModelRenderer gun57;
	private final ModelRenderer gun56;
	private final ModelRenderer gun55;
	private final ModelRenderer gun54;
	private final ModelRenderer gun53;
	private final ModelRenderer gun52;
	private final ModelRenderer gun51;
	private final ModelRenderer gun50;
	private final ModelRenderer gun49;
	private final ModelRenderer gun48;
	private final ModelRenderer gun36;
	private final ModelRenderer gun35;
	private final ModelRenderer gun34;
	private final ModelRenderer gun33;
	private final ModelRenderer gun32;
	private final ModelRenderer gun31;
	private final ModelRenderer gun30;
	private final ModelRenderer gun29;
	private final ModelRenderer gun28;
	private final ModelRenderer gun26;
	private final ModelRenderer gun17;
	private final ModelRenderer gun16;
	private final ModelRenderer gun13;
	private final ModelRenderer gun12;
	private final ModelRenderer gun10;
	private final ModelRenderer gun9;
	private final ModelRenderer gun7;
	private final ModelRenderer gun6;
	private final ModelRenderer gun4;
	private final ModelRenderer gun3;
	private final ModelRenderer gun2;
	private final ModelRenderer gun1;
	private final ModelRenderer gun269;
	private final ModelRenderer barrel;

	public M14A1Body() {
		textureWidth = 340;
		textureHeight = 340;

		defaultchassis = new ModelRenderer(this);
		defaultchassis.setRotationPoint(0.0F, 24.0F, 0.0F);
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 51, 82, -3.5F, -18.6F, 26.7F, 4, 1, 5, 0.0F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 0, 0, -4.0F, -33.6F, 26.7F, 5, 15, 5, 0.0F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 124, 14, -3.0F, -34.6F, 26.7F, 3, 1, 5, 0.0F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 232, 0, -3.0F, -34.5F, -0.3F, 3, 2, 27, 0.0F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 45, 204, -4.0F, -31.75F, 18.7F, 5, 13, 8, 0.0F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 23, 34, -4.0F, -32.2F, -2.7F, 5, 2, 6, -0.001F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 90, 227, -3.5F, -23.75F, 18.7F, 4, 6, 8, 0.0F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 230, 80, -4.0F, -33.5F, 0.7F, 5, 2, 26, -0.001F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 28, 259, -4.0F, -37.2F, -82.0F, 1, 2, 22, 0.0F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 71, 94, 0.0F, -35.4F, -27.0F, 1, 2, 3, -0.001F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 145, 121, -4.0F, -36.7F, -27.0F, 4, 3, 3, -0.001F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 159, 227, -4.0F, -36.7F, -24.0F, 5, 3, 8, -0.001F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 73, 21, -3.01F, -36.7F, -16.5F, 4, 3, 5, 0.0F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 111, 0, -4.0F, -35.2F, -16.5F, 1, 1, 3, 0.0F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 102, 37, -4.01F, -34.0F, -30.0F, 5, 1, 3, 0.0F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 73, 68, -4.0F, -36.2F, -13.5F, 1, 2, 2, 0.0F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 187, 227, -4.0F, -36.7F, -35.0F, 5, 3, 8, 0.0F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 23, 23, 0.0F, -36.7F, -39.0F, 1, 3, 4, 0.0F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 82, 47, -4.0F, -36.3F, -40.0F, 1, 2, 5, 0.0F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 0, 47, -3.0F, -35.2F, -82.0F, 3, 2, 45, 0.0F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 257, 164, -4.0F, -34.2F, -27.0F, 5, 4, 25, 0.0F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 47, 132, -3.51F, -16.4F, -4.7F, 4, 1, 3, -0.001F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 121, 111, -3.5F, -16.4F, -1.7F, 4, 1, 2, -0.001F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 124, 79, -3.51F, -18.1F, -5.7F, 4, 2, 4, 0.0F, false));

		gun272 = new ModelRenderer(this);
		gun272.setRotationPoint(-4.5F, -31.5F, 0.3F);
		defaultchassis.addChild(gun272);
		setRotationAngle(gun272, 1.3013F, 0.0F, 0.0F);
		

		gun271 = new ModelRenderer(this);
		gun271.setRotationPoint(-4.5F, -26.5F, 9.3F);
		defaultchassis.addChild(gun271);
		setRotationAngle(gun271, 2.3794F, 0.0F, 0.0F);
		

		gun268 = new ModelRenderer(this);
		gun268.setRotationPoint(-2.5F, -37.0F, 0.3F);
		defaultchassis.addChild(gun268);
		setRotationAngle(gun268, 0.0F, 0.0F, 1.041F);
		

		gun267 = new ModelRenderer(this);
		gun267.setRotationPoint(-4.5F, -34.5F, 0.3F);
		defaultchassis.addChild(gun267);
		setRotationAngle(gun267, 0.0F, 0.0F, -1.1154F);
		

		gun266 = new ModelRenderer(this);
		gun266.setRotationPoint(-0.3F, -36.85F, 0.3F);
		defaultchassis.addChild(gun266);
		setRotationAngle(gun266, 0.0F, 0.0F, 0.632F);
		

		gun265 = new ModelRenderer(this);
		gun265.setRotationPoint(-0.5F, -37.0F, 0.3F);
		defaultchassis.addChild(gun265);
		setRotationAngle(gun265, 0.0F, 0.0F, 0.632F);
		

		gun264 = new ModelRenderer(this);
		gun264.setRotationPoint(1.5F, -34.5F, 0.3F);
		defaultchassis.addChild(gun264);
		setRotationAngle(gun264, 0.0F, 0.0F, 2.6397F);
		

		gun213 = new ModelRenderer(this);
		gun213.setRotationPoint(-3.6F, -35.2F, -83.0F);
		defaultchassis.addChild(gun213);
		setRotationAngle(gun213, 0.0F, 0.0F, -0.7064F);
		gun213.cubeList.add(new ModelBox(gun213, 66, 0, 0.0F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));

		gun214 = new ModelRenderer(this);
		gun214.setRotationPoint(0.6F, -35.2F, -83.0F);
		defaultchassis.addChild(gun214);
		setRotationAngle(gun214, 0.0F, 0.0F, 2.3051F);
		gun214.cubeList.add(new ModelBox(gun214, 64, 85, 0.0F, 0.0F, 0.0F, 2, 1, 1, -0.001F, false));

		gun212 = new ModelRenderer(this);
		gun212.setRotationPoint(-2.5F, -35.8F, -83.0F);
		defaultchassis.addChild(gun212);
		gun212.cubeList.add(new ModelBox(gun212, 111, 57, 0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, false));

		gun211 = new ModelRenderer(this);
		gun211.setRotationPoint(-1.4F, -37.2F, -83.0F);
		defaultchassis.addChild(gun211);
		gun211.cubeList.add(new ModelBox(gun211, 61, 111, 0.0F, 0.0F, 0.0F, 2, 2, 1, 0.001F, false));

		gun210 = new ModelRenderer(this);
		gun210.setRotationPoint(-3.6F, -37.2F, -83.0F);
		defaultchassis.addChild(gun210);
		gun210.cubeList.add(new ModelBox(gun210, 111, 21, 0.0F, 0.0F, 0.0F, 3, 2, 1, 0.001F, false));

		gun202 = new ModelRenderer(this);
		gun202.setRotationPoint(-3.0F, -19.4F, 14.0F);
		defaultchassis.addChild(gun202);
		setRotationAngle(gun202, -0.7436F, 0.0F, 0.0F);
		gun202.cubeList.add(new ModelBox(gun202, 23, 89, 0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun201 = new ModelRenderer(this);
		gun201.setRotationPoint(-3.0F, -18.85F, 13.9F);
		defaultchassis.addChild(gun201);
		setRotationAngle(gun201, 1.3384F, 0.0F, 0.0F);
		gun201.cubeList.add(new ModelBox(gun201, 86, 75, 0.0F, 0.0F, 0.0F, 3, 4, 1, 0.0F, false));

		gun192 = new ModelRenderer(this);
		gun192.setRotationPoint(-4.0F, -20.1F, 12.9F);
		defaultchassis.addChild(gun192);
		setRotationAngle(gun192, 1.3384F, 0.0F, 0.0F);
		gun192.cubeList.add(new ModelBox(gun192, 185, 156, 0.01F, 0.0F, 0.0F, 5, 6, 13, 0.0F, false));

		gun191 = new ModelRenderer(this);
		gun191.setRotationPoint(-4.0F, -22.5F, 10.6F);
		defaultchassis.addChild(gun191);
		setRotationAngle(gun191, 0.8179F, 0.0F, 0.0F);
		gun191.cubeList.add(new ModelBox(gun191, 73, 8, 0.0F, 0.0F, 0.0F, 5, 4, 4, -0.001F, false));

		gun190 = new ModelRenderer(this);
		gun190.setRotationPoint(-4.0F, -26.8F, 7.7F);
		defaultchassis.addChild(gun190);
		setRotationAngle(gun190, 0.5949F, 0.0F, 0.0F);
		gun190.cubeList.add(new ModelBox(gun190, 178, 202, 0.0F, 0.0F, 0.0F, 5, 6, 10, 0.0F, false));

		gun189 = new ModelRenderer(this);
		gun189.setRotationPoint(-4.0F, -29.45F, 4.5F);
		defaultchassis.addChild(gun189);
		setRotationAngle(gun189, 0.8551F, 0.0F, 0.0F);
		gun189.cubeList.add(new ModelBox(gun189, 23, 11, 0.0F, 0.0F, 0.0F, 5, 5, 5, -0.001F, false));
		gun189.cubeList.add(new ModelBox(gun189, 23, 11, 0.0F, 5.0F, 3.2F, 5, 5, 5, -0.001F, false));

		gun188 = new ModelRenderer(this);
		gun188.setRotationPoint(-4.0F, -31.5F, 0.5F);
		defaultchassis.addChild(gun188);
		setRotationAngle(gun188, 1.0782F, 0.0F, 0.0F);
		gun188.cubeList.add(new ModelBox(gun188, 23, 127, 0.0F, 0.0F, 0.0F, 5, 5, 2, 0.0F, false));
		gun188.cubeList.add(new ModelBox(gun188, 23, 127, 0.0F, 3.8F, 2.0F, 5, 5, 2, 0.0F, false));
		gun188.cubeList.add(new ModelBox(gun188, 23, 127, 0.0F, 7.0F, 3.9F, 5, 5, 2, 0.0F, false));

		gun185 = new ModelRenderer(this);
		gun185.setRotationPoint(-3.5F, -19.2F, 12.9F);
		defaultchassis.addChild(gun185);
		setRotationAngle(gun185, 1.3384F, 0.0F, 0.0F);
		gun185.cubeList.add(new ModelBox(gun185, 35, 23, 0.0F, 0.0F, 0.0F, 4, 6, 1, 0.0F, false));

		gun184 = new ModelRenderer(this);
		gun184.setRotationPoint(-3.5F, -21.9F, 10.0F);
		defaultchassis.addChild(gun184);
		setRotationAngle(gun184, 0.8179F, 0.0F, 0.0F);
		gun184.cubeList.add(new ModelBox(gun184, 23, 75, 0.0F, 0.0F, 0.0F, 4, 4, 1, -0.001F, false));

		gun183 = new ModelRenderer(this);
		gun183.setRotationPoint(-3.5F, -26.8F, 6.3F);
		defaultchassis.addChild(gun183);
		setRotationAngle(gun183, 0.6692F, 0.0F, 0.0F);
		gun183.cubeList.add(new ModelBox(gun183, 145, 113, 0.0F, 0.0F, 0.0F, 4, 6, 2, 0.0F, false));

		gun182 = new ModelRenderer(this);
		gun182.setRotationPoint(-3.5F, -29.4F, 2.5F);
		defaultchassis.addChild(gun182);
		setRotationAngle(gun182, 0.9666F, 0.0F, 0.0F);
		gun182.cubeList.add(new ModelBox(gun182, 147, 26, 0.0F, 1.0F, 0.0F, 4, 4, 2, -0.001F, false));

		gun181 = new ModelRenderer(this);
		gun181.setRotationPoint(-3.5F, -30.65F, -0.5F);
		defaultchassis.addChild(gun181);
		setRotationAngle(gun181, 1.1154F, 0.0F, 0.0F);
		gun181.cubeList.add(new ModelBox(gun181, 32, 81, 0.0F, 0.0F, 0.0F, 4, 5, 2, 0.0F, false));

		gun170 = new ModelRenderer(this);
		gun170.setRotationPoint(-3.0F, -33.1F, -76.2F);
		defaultchassis.addChild(gun170);
		setRotationAngle(gun170, 0.632F, 0.0F, 0.0F);
		gun170.cubeList.add(new ModelBox(gun170, 23, 102, 0.0F, 7.6799F, 10.489F, 3, 1, 1, 0.0F, false));

		gun169 = new ModelRenderer(this);
		gun169.setRotationPoint(-3.0F, -35.1F, -76.0F);
		defaultchassis.addChild(gun169);
		gun169.cubeList.add(new ModelBox(gun169, 47, 118, 0.0F, 0.0F, 13.0F, 3, 2, 5, 0.0F, false));
		gun169.cubeList.add(new ModelBox(gun169, 197, 54, -0.5F, 2.5F, 18.0F, 4, 9, 2, 0.0F, false));
		gun169.cubeList.add(new ModelBox(gun169, 236, 137, -0.55F, 2.0F, 17.0F, 3, 10, 1, 0.0F, false));
		gun169.cubeList.add(new ModelBox(gun169, 236, 137, -0.55F, 12.0F, 17.0F, 3, 5, 1, 0.0F, false));
		gun169.cubeList.add(new ModelBox(gun169, 197, 54, -0.5F, 11.5F, 18.0F, 4, 5, 2, 0.0F, false));
		gun169.cubeList.add(new ModelBox(gun169, 205, 52, -1.5F, 11.5F, 18.0F, 1, 5, 2, 0.0F, false));
		gun169.cubeList.add(new ModelBox(gun169, 205, 52, -1.5F, 2.5F, 18.0F, 1, 9, 2, 0.0F, false));

		gun168 = new ModelRenderer(this);
		gun168.setRotationPoint(-4.0F, -36.9F, -60.0F);
		defaultchassis.addChild(gun168);
		gun168.cubeList.add(new ModelBox(gun168, 98, 115, 0.0F, 0.0F, 0.0F, 1, 1, 21, -0.002F, false));

		gun167 = new ModelRenderer(this);
		gun167.setRotationPoint(-4.0F, -36.2F, -60.0F);
		defaultchassis.addChild(gun167);
		gun167.cubeList.add(new ModelBox(gun167, 0, 116, 0.0F, 0.0F, 0.0F, 1, 1, 21, -0.001F, false));

		gun59 = new ModelRenderer(this);
		gun59.setRotationPoint(-3.0F, -35.1F, -1.7F);
		defaultchassis.addChild(gun59);
		setRotationAngle(gun59, -0.2603F, 0.0F, 0.0F);
		gun59.cubeList.add(new ModelBox(gun59, 98, 131, 0.0F, 0.0F, 0.0F, 3, 2, 3, -0.001F, false));

		gun58 = new ModelRenderer(this);
		gun58.setRotationPoint(-3.0F, -36.37F, -8.55F);
		defaultchassis.addChild(gun58);
		setRotationAngle(gun58, -0.1859F, 0.0F, 0.0F);
		gun58.cubeList.add(new ModelBox(gun58, 51, 47, 0.0F, 0.0F, 0.0F, 3, 1, 7, 0.0F, false));

		gun57 = new ModelRenderer(this);
		gun57.setRotationPoint(-3.5F, -36.7F, -11.5F);
		defaultchassis.addChild(gun57);
		setRotationAngle(gun57, -0.1115F, 0.0F, 0.0F);
		gun57.cubeList.add(new ModelBox(gun57, 102, 83, 0.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

		gun56 = new ModelRenderer(this);
		gun56.setRotationPoint(-4.0F, -34.45F, -1.8F);
		defaultchassis.addChild(gun56);
		setRotationAngle(gun56, -0.409F, 0.0F, 0.0F);
		gun56.cubeList.add(new ModelBox(gun56, 124, 67, -0.01F, 0.0F, 0.0F, 5, 3, 3, 0.0F, false));

		gun55 = new ModelRenderer(this);
		gun55.setRotationPoint(-4.0F, -36.25F, -8.55F);
		defaultchassis.addChild(gun55);
		setRotationAngle(gun55, -0.2603F, 0.0F, 0.0F);
		gun55.cubeList.add(new ModelBox(gun55, 61, 228, -0.01F, 0.0F, 0.0F, 5, 3, 7, 0.0F, false));

		gun54 = new ModelRenderer(this);
		gun54.setRotationPoint(-4.0F, -36.7F, -11.5F);
		defaultchassis.addChild(gun54);
		setRotationAngle(gun54, -0.1487F, 0.0F, 0.0F);
		gun54.cubeList.add(new ModelBox(gun54, 124, 73, 0.01F, 0.0F, 0.0F, 5, 3, 3, 0.0F, false));

		gun53 = new ModelRenderer(this);
		gun53.setRotationPoint(-4.0F, -36.2F, -13.5F);
		defaultchassis.addChild(gun53);
		setRotationAngle(gun53, -0.4461F, 0.0F, 0.0F);
		gun53.cubeList.add(new ModelBox(gun53, 67, 21, 0.0F, 0.0F, 0.0F, 1, 2, 1, -0.002F, false));

		gun52 = new ModelRenderer(this);
		gun52.setRotationPoint(-4.0F, -36.7F, -16.0F);
		defaultchassis.addChild(gun52);
		setRotationAngle(gun52, -1.2269F, 0.0F, 0.0F);
		gun52.cubeList.add(new ModelBox(gun52, 109, 115, 0.0F, 0.0F, 0.0F, 1, 1, 2, -0.002F, false));

		gun51 = new ModelRenderer(this);
		gun51.setRotationPoint(-4.0F, -36.7F, -35.0F);
		defaultchassis.addChild(gun51);
		setRotationAngle(gun51, -1.3013F, 0.0F, 0.0F);
		gun51.cubeList.add(new ModelBox(gun51, 17, 70, 0.0F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));

		gun50 = new ModelRenderer(this);
		gun50.setRotationPoint(0.0F, -36.7F, -24.0F);
		defaultchassis.addChild(gun50);
		setRotationAngle(gun50, -0.2231F, 0.0F, 0.0F);
		gun50.cubeList.add(new ModelBox(gun50, 23, 70, 0.0F, 0.0F, 0.0F, 1, 2, 1, -0.002F, false));

		gun49 = new ModelRenderer(this);
		gun49.setRotationPoint(0.0F, -36.7F, -27.0F);
		defaultchassis.addChild(gun49);
		setRotationAngle(gun49, -1.3756F, 0.0F, 0.0F);
		gun49.cubeList.add(new ModelBox(gun49, 116, 0, 0.0F, 0.0F, 0.0F, 1, 1, 2, -0.002F, false));

		gun48 = new ModelRenderer(this);
		gun48.setRotationPoint(1.0F, -35.4F, -27.0F);
		defaultchassis.addChild(gun48);
		setRotationAngle(gun48, 0.0F, 0.0F, 2.8256F);
		gun48.cubeList.add(new ModelBox(gun48, 108, 109, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun36 = new ModelRenderer(this);
		gun36.setRotationPoint(1.0F, -35.2F, -82.0F);
		defaultchassis.addChild(gun36);
		setRotationAngle(gun36, 0.0F, 0.0F, 1.9333F);
		gun36.cubeList.add(new ModelBox(gun36, 90, 183, 0.0F, 0.0F, 0.0F, 1, 1, 42, 0.0F, false));

		gun35 = new ModelRenderer(this);
		gun35.setRotationPoint(0.55F, -34.0F, -82.0F);
		defaultchassis.addChild(gun35);
		setRotationAngle(gun35, 0.0F, 0.0F, -2.8256F);
		gun35.cubeList.add(new ModelBox(gun35, 133, 183, 0.0F, 0.0F, 0.0F, 1, 1, 43, 0.0F, false));

		gun34 = new ModelRenderer(this);
		gun34.setRotationPoint(0.0F, -33.2F, -82.0F);
		defaultchassis.addChild(gun34);
		setRotationAngle(gun34, 0.0F, 0.0F, -2.6025F);
		gun34.cubeList.add(new ModelBox(gun34, 98, 93, 0.0F, 0.0F, 0.0F, 1, 1, 45, 0.0F, false));

		gun33 = new ModelRenderer(this);
		gun33.setRotationPoint(-4.0F, -35.2F, -82.0F);
		defaultchassis.addChild(gun33);
		setRotationAngle(gun33, 0.0F, 0.0F, -0.409F);
		gun33.cubeList.add(new ModelBox(gun33, 0, 184, 0.0F, 0.0F, 0.0F, 1, 1, 43, 0.0F, false));

		gun32 = new ModelRenderer(this);
		gun32.setRotationPoint(-3.5F, -34.0F, -82.0F);
		defaultchassis.addChild(gun32);
		setRotationAngle(gun32, 0.0F, 0.0F, -1.9333F);
		gun32.cubeList.add(new ModelBox(gun32, 48, 138, 0.0F, 0.0F, 0.0F, 1, 1, 44, 0.0F, false));

		gun31 = new ModelRenderer(this);
		gun31.setRotationPoint(-3.0F, -33.2F, -82.0F);
		defaultchassis.addChild(gun31);
		setRotationAngle(gun31, 0.0F, 0.0F, -2.1192F);
		gun31.cubeList.add(new ModelBox(gun31, 100, 0, 0.0F, 0.0F, 0.0F, 1, 1, 45, 0.0F, false));

		gun30 = new ModelRenderer(this);
		gun30.setRotationPoint(-4.0F, -33.6F, -42.55F);
		defaultchassis.addChild(gun30);
		setRotationAngle(gun30, 2.2679F, 0.0F, 0.0F);
		gun30.cubeList.add(new ModelBox(gun30, 124, 37, -0.01F, 0.0F, 0.0F, 5, 2, 2, 0.0F, false));

		gun29 = new ModelRenderer(this);
		gun29.setRotationPoint(-4.0F, -32.45F, -37.6F);
		defaultchassis.addChild(gun29);
		setRotationAngle(gun29, 2.9394F, 0.0F, 0.0F);
		gun29.cubeList.add(new ModelBox(gun29, 51, 55, 0.005F, -0.04F, 0.0F, 5, 3, 5, 0.0F, false));

		gun28 = new ModelRenderer(this);
		gun28.setRotationPoint(-3.0F, -37.2F, -82.0F);
		defaultchassis.addChild(gun28);
		gun28.cubeList.add(new ModelBox(gun28, 51, 47, 0.0F, 0.0F, 0.0F, 4, 2, 43, 0.0F, false));

		gun26 = new ModelRenderer(this);
		gun26.setRotationPoint(-4.0F, -30.2F, -27.0F);
		defaultchassis.addChild(gun26);
		setRotationAngle(gun26, 2.9371F, 0.0F, 0.0F);
		gun26.cubeList.add(new ModelBox(gun26, 190, 107, 0.01F, 0.0F, 0.0F, 5, 3, 12, 0.0F, false));

		gun17 = new ModelRenderer(this);
		gun17.setRotationPoint(-3.5F, -15.4F, -4.7F);
		defaultchassis.addChild(gun17);
		setRotationAngle(gun17, 2.5281F, 0.0F, 0.0F);
		gun17.cubeList.add(new ModelBox(gun17, 35, 30, 0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

		gun16 = new ModelRenderer(this);
		gun16.setRotationPoint(-3.5F, -16.1F, -5.7F);
		defaultchassis.addChild(gun16);
		setRotationAngle(gun16, 0.9666F, 0.0F, 0.0F);
		gun16.cubeList.add(new ModelBox(gun16, 23, 42, 0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

		gun13 = new ModelRenderer(this);
		gun13.setRotationPoint(-3.5F, -22.2F, -0.2F);
		defaultchassis.addChild(gun13);
		setRotationAngle(gun13, -2.6397F, 0.0F, 0.0F);
		gun13.cubeList.add(new ModelBox(gun13, 11, 23, 0.01F, 0.0F, 0.0F, 4, 7, 1, 0.0F, false));

		gun12 = new ModelRenderer(this);
		gun12.setRotationPoint(-3.5F, -15.4F, 0.3F);
		defaultchassis.addChild(gun12);
		setRotationAngle(gun12, 2.3423F, 0.0F, 0.0F);
		gun12.cubeList.add(new ModelBox(gun12, 33, 42, 0.0F, 0.0F, 0.0F, 4, 1, 1, 0.001F, false));

		gun10 = new ModelRenderer(this);
		gun10.setRotationPoint(-3.5F, -16.4F, 1.3F);
		defaultchassis.addChild(gun10);
		setRotationAngle(gun10, -2.3794F, 0.0F, 0.0F);
		gun10.cubeList.add(new ModelBox(gun10, 51, 39, 0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

		gun9 = new ModelRenderer(this);
		gun9.setRotationPoint(-3.5F, -16.4F, 1.3F);
		defaultchassis.addChild(gun9);
		setRotationAngle(gun9, -2.8999F, 0.0F, 0.0F);
		gun9.cubeList.add(new ModelBox(gun9, 124, 21, 0.01F, 0.0F, 0.0F, 4, 6, 3, -0.001F, false));

		gun7 = new ModelRenderer(this);
		gun7.setRotationPoint(-3.5F, -30.5F, -2.7F);
		defaultchassis.addChild(gun7);
		setRotationAngle(gun7, -1.7846F, 0.0F, 0.0F);
		gun7.cubeList.add(new ModelBox(gun7, 0, 133, 0.01F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

		gun6 = new ModelRenderer(this);
		gun6.setRotationPoint(-3.5F, -31.0F, -1.5F);
		defaultchassis.addChild(gun6);
		setRotationAngle(gun6, -2.3423F, 0.0F, 0.0F);
		gun6.cubeList.add(new ModelBox(gun6, 124, 30, 0.0F, 0.0F, 0.0F, 4, 3, 4, 0.0F, false));

		gun4 = new ModelRenderer(this);
		gun4.setRotationPoint(-3.5F, -30.2F, -12.0F);
		defaultchassis.addChild(gun4);
		setRotationAngle(gun4, 1.0782F, 0.0F, 0.0F);
		gun4.cubeList.add(new ModelBox(gun4, 133, 46, 0.01F, 0.0F, 0.0F, 4, 3, 2, 0.0F, false));

		gun3 = new ModelRenderer(this);
		gun3.setRotationPoint(-3.5F, -22.7F, -9.3F);
		defaultchassis.addChild(gun3);
		setRotationAngle(gun3, 1.3013F, 0.0F, 0.0F);
		gun3.cubeList.add(new ModelBox(gun3, 145, 127, 0.01F, 0.0F, 0.0F, 4, 1, 3, -0.001F, false));

		gun2 = new ModelRenderer(this);
		gun2.setRotationPoint(-3.5F, -24.5F, -8.3F);
		defaultchassis.addChild(gun2);
		setRotationAngle(gun2, -0.5205F, 0.0F, 0.0F);
		gun2.cubeList.add(new ModelBox(gun2, 0, 110, 0.01F, 0.0F, 0.0F, 4, 2, 3, 0.0F, false));

		gun1 = new ModelRenderer(this);
		gun1.setRotationPoint(-3.5F, -32.5F, -5.2F);
		defaultchassis.addChild(gun1);
		setRotationAngle(gun1, -1.1897F, 0.0F, 0.0F);
		gun1.cubeList.add(new ModelBox(gun1, 94, 159, 0.0F, 0.0F, 0.0F, 4, 6, 16, 0.001F, false));

		gun269 = new ModelRenderer(this);
		gun269.setRotationPoint(-2.8F, -36.8F, 0.3F);
		defaultchassis.addChild(gun269);
		setRotationAngle(gun269, 0.0F, 0.0F, 1.041F);
		

		barrel = new ModelRenderer(this);
		barrel.setRotationPoint(0.0F, 24.0F, 0.0F);
		barrel.cubeList.add(new ModelBox(barrel, 102, 0, -1.75F, -38.75F, -104.0F, 1, 1, 20, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 51, 21, -1.85F, -38.9F, -104.0F, 1, 1, 20, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 102, 67, -2.0F, -39.0F, -104.0F, 1, 1, 20, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 51, 68, -2.15F, -38.9F, -104.0F, 1, 1, 20, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 102, 21, -2.25F, -38.75F, -104.0F, 1, 1, 20, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 51, 47, -2.15F, -38.6F, -104.0F, 1, 1, 20, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 102, 46, -2.0F, -38.5F, -104.0F, 1, 1, 20, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 51, 0, -1.85F, -38.6F, -104.0F, 1, 1, 20, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 61, 21, -2.0F, -40.5F, -106.0F, 1, 2, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 61, 13, -2.0F, -40.5F, -106.5F, 1, 2, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 121, 115, -1.55F, -38.75F, -114.0F, 1, 1, 10, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 21, 140, -1.75F, -39.0F, -114.0F, 1, 1, 10, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 45, 140, -2.0F, -39.2F, -114.0F, 1, 1, 10, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 23, 116, -2.25F, -39.0F, -114.0F, 1, 1, 10, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 23, 94, -2.45F, -38.75F, -114.0F, 1, 1, 10, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 121, 93, -1.75F, -38.5F, -114.0F, 1, 1, 10, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 73, 118, -2.0F, -38.3F, -114.0F, 1, 1, 10, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 23, 70, -2.25F, -38.5F, -114.0F, 1, 1, 10, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 35, 75, -2.0F, -37.5F, -106.7F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 23, 105, -2.0F, -38.0F, -107.0F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 111, 29, -1.55F, -38.75F, -90.0F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 111, 32, -1.75F, -39.0F, -90.0F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 37, 111, -2.0F, -39.2F, -90.0F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 111, 46, -2.25F, -39.0F, -90.0F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 111, 49, -2.45F, -38.75F, -90.0F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 111, 54, -2.25F, -38.5F, -90.0F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 23, 108, -1.75F, -38.5F, -90.0F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 15, 0, -2.0F, -38.3F, -90.0F, 1, 3, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 121, 126, -2.0F, -36.2F, -89.0F, 1, 1, 6, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 102, 46, -1.75F, -36.0F, -90.0F, 1, 1, 7, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 39, 105, -2.0F, -35.75F, -92.0F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 102, 54, -1.55F, -35.75F, -90.0F, 1, 1, 7, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 102, 67, -1.75F, -35.5F, -90.0F, 1, 1, 7, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 102, 8, -2.0F, -35.3F, -90.0F, 1, 1, 7, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 102, 0, -2.25F, -36.0F, -90.0F, 1, 1, 7, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 102, 29, -2.45F, -35.75F, -90.0F, 1, 1, 7, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 102, 21, -2.25F, -35.5F, -90.0F, 1, 1, 7, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 73, 77, -1.55F, -38.75F, -84.0F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 35, 77, -1.75F, -39.0F, -84.0F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 16, 79, -2.0F, -39.2F, -84.0F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 17, 77, -1.75F, -38.5F, -84.0F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 9, 78, -2.0F, -38.3F, -84.0F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 41, 75, -2.25F, -39.0F, -84.0F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 41, 77, -2.45F, -38.75F, -84.0F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 73, 75, -2.25F, -38.5F, -84.0F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		defaultchassis.render(f5);
		barrel.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}