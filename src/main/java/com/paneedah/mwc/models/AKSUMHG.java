package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AKSUMHG extends ModelBase {
	private final ModelRenderer polymerhandguard;
	private final ModelRenderer gun148;
	private final ModelRenderer gun149;
	private final ModelRenderer gun150;
	private final ModelRenderer gun151;
	private final ModelRenderer gun152;
	private final ModelRenderer gun153;
	private final ModelRenderer gun154;
	private final ModelRenderer gun155;
	private final ModelRenderer gun156;
	private final ModelRenderer gun158;
	private final ModelRenderer gun162;
	private final ModelRenderer gun164;
	private final ModelRenderer gun168;
	private final ModelRenderer gun183;
	private final ModelRenderer gun184;
	private final ModelRenderer gun185;
	private final ModelRenderer gun186;
	private final ModelRenderer gun187;
	private final ModelRenderer gun188;
	private final ModelRenderer gun189;
	private final ModelRenderer gun190;
	private final ModelRenderer gun191;
	private final ModelRenderer gun209;
	private final ModelRenderer gun210;
	private final ModelRenderer gun211;
	private final ModelRenderer gun212;
	private final ModelRenderer gun214;
	private final ModelRenderer gun215;
	private final ModelRenderer gun216;
	private final ModelRenderer gun217;
	private final ModelRenderer gun218;
	private final ModelRenderer gun219;
	private final ModelRenderer gun220;
	private final ModelRenderer gun221;
	private final ModelRenderer gun222;
	private final ModelRenderer gun223;
	private final ModelRenderer gun224;
	private final ModelRenderer gun225;
	private final ModelRenderer gun226;
	private final ModelRenderer gun227;
	private final ModelRenderer gun228;
	private final ModelRenderer gun229;
	private final ModelRenderer gun230;
	private final ModelRenderer gun231;
	private final ModelRenderer gun232;
	private final ModelRenderer gun245;
	private final ModelRenderer gun248_r1;
	private final ModelRenderer gun250;
	private final ModelRenderer gun253_r1;
	private final ModelRenderer bone17;
	private final ModelRenderer bone18;
	private final ModelRenderer bone19;
	private final ModelRenderer bone20;
	private final ModelRenderer bone21;
	private final ModelRenderer bone22;
	private final ModelRenderer bone2;
	private final ModelRenderer gun348_r3_r1;
	private final ModelRenderer bone;
	private final ModelRenderer gun248_r2_r1;

	public AKSUMHG() {
		textureWidth = 128;
		textureHeight = 128;

		polymerhandguard = new ModelRenderer(this);
		polymerhandguard.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		gun148 = new ModelRenderer(this);
		gun148.setRotationPoint(-4.0F, -37.0F, -41.5F);
		polymerhandguard.addChild(gun148);
		gun148.cubeList.add(new ModelBox(gun148, 84, 32, 0.0F, 0.0F, 0.0F, 5, 4, 5, 0.0F, false));

		gun149 = new ModelRenderer(this);
		gun149.setRotationPoint(-4.0F, -36.5F, -53.5F);
		polymerhandguard.addChild(gun149);
		gun149.cubeList.add(new ModelBox(gun149, 60, 3, 0.0F, 0.0F, 3.0F, 5, 2, 9, 0.0F, false));
		gun149.cubeList.add(new ModelBox(gun149, 60, 3, 0.0F, 2.0F, 3.0F, 5, 2, 9, 0.0F, false));

		gun150 = new ModelRenderer(this);
		gun150.setRotationPoint(-0.1F, -36.9F, -36.5F);
		polymerhandguard.addChild(gun150);
		gun150.cubeList.add(new ModelBox(gun150, 12, 6, 0.0F, 0.0F, 0.002F, 1, 5, 1, 0.0F, false));

		gun151 = new ModelRenderer(this);
		gun151.setRotationPoint(-3.9F, -36.9F, -36.5F);
		polymerhandguard.addChild(gun151);
		gun151.cubeList.add(new ModelBox(gun151, 12, 0, 0.0F, 0.0F, 0.002F, 1, 5, 1, 0.0F, false));

		gun152 = new ModelRenderer(this);
		gun152.setRotationPoint(-3.0F, -32.0F, -36.5F);
		polymerhandguard.addChild(gun152);
		gun152.cubeList.add(new ModelBox(gun152, 26, 19, 0.0F, 0.0F, 0.001F, 3, 1, 1, 0.0F, false));

		gun153 = new ModelRenderer(this);
		gun153.setRotationPoint(0.0F, -31.0F, -36.5F);
		polymerhandguard.addChild(gun153);
		setRotationAngle(gun153, 0.0F, 0.0F, -2.3423F);
		gun153.cubeList.add(new ModelBox(gun153, 30, 1, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun154 = new ModelRenderer(this);
		gun154.setRotationPoint(0.9F, -31.9F, -36.5F);
		polymerhandguard.addChild(gun154);
		setRotationAngle(gun154, 0.0F, 0.0F, 2.3794F);
		gun154.cubeList.add(new ModelBox(gun154, 29, 28, 0.0F, 0.0F, -0.001F, 1, 1, 1, 0.0F, false));

		gun155 = new ModelRenderer(this);
		gun155.setRotationPoint(-3.9F, -31.9F, -36.5F);
		polymerhandguard.addChild(gun155);
		setRotationAngle(gun155, 0.0F, 0.0F, -0.7064F);
		gun155.cubeList.add(new ModelBox(gun155, 29, 25, 0.0F, 0.0F, -0.001F, 1, 1, 1, 0.0F, false));

		gun156 = new ModelRenderer(this);
		gun156.setRotationPoint(-3.0F, -31.0F, -36.5F);
		polymerhandguard.addChild(gun156);
		setRotationAngle(gun156, 0.0F, 0.0F, -2.4166F);
		gun156.cubeList.add(new ModelBox(gun156, 29, 22, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun158 = new ModelRenderer(this);
		gun158.setRotationPoint(-3.0F, -34.0F, -53.5F);
		polymerhandguard.addChild(gun158);
		gun158.cubeList.add(new ModelBox(gun158, 3, 72, 0.0F, 1.5F, 3.0F, 3, 1, 9, 0.0F, false));
		gun158.cubeList.add(new ModelBox(gun158, 9, 78, 0.0F, 1.5F, 12.0F, 3, 1, 3, 0.0F, false));
		gun158.cubeList.add(new ModelBox(gun158, 3, 72, 0.0F, 0.5F, 3.0F, 3, 1, 9, 0.0F, false));

		gun162 = new ModelRenderer(this);
		gun162.setRotationPoint(-4.0F, -38.9F, -53.5F);
		polymerhandguard.addChild(gun162);
		gun162.cubeList.add(new ModelBox(gun162, 43, 52, 0.001F, 0.0F, 2.999F, 5, 1, 12, 0.0F, false));

		gun164 = new ModelRenderer(this);
		gun164.setRotationPoint(-4.0F, -38.3F, -53.5F);
		polymerhandguard.addChild(gun164);
		gun164.cubeList.add(new ModelBox(gun164, 39, 38, 0.0F, 0.0F, 3.0F, 5, 1, 12, 0.0F, false));

		gun168 = new ModelRenderer(this);
		gun168.setRotationPoint(-4.0F, -36.9F, -53.5F);
		polymerhandguard.addChild(gun168);
		gun168.cubeList.add(new ModelBox(gun168, 60, 21, 0.0F, -0.1F, 3.0F, 5, 1, 9, 0.0F, false));

		gun183 = new ModelRenderer(this);
		gun183.setRotationPoint(-3.0F, -39.8F, -53.5F);
		polymerhandguard.addChild(gun183);
		setRotationAngle(gun183, 0.0175F, 0.0F, 0.0F);
		gun183.cubeList.add(new ModelBox(gun183, 43, 66, 0.0F, 0.0525F, 2.9995F, 3, 1, 12, 0.0F, false));

		gun184 = new ModelRenderer(this);
		gun184.setRotationPoint(-4.0F, -38.9F, -53.5F);
		polymerhandguard.addChild(gun184);
		setRotationAngle(gun184, 0.0F, 0.0F, -0.7064F);
		gun184.cubeList.add(new ModelBox(gun184, 33, 80, 0.0F, 0.0F, 3.0F, 1, 1, 12, 0.0F, false));

		gun185 = new ModelRenderer(this);
		gun185.setRotationPoint(-3.0F, -39.8F, -53.5F);
		polymerhandguard.addChild(gun185);
		setRotationAngle(gun185, 0.0F, 0.0F, 0.8179F);
		gun185.cubeList.add(new ModelBox(gun185, 79, 19, -0.001F, 0.0F, 2.999F, 1, 1, 12, 0.0F, false));

		gun186 = new ModelRenderer(this);
		gun186.setRotationPoint(0.0F, -39.8F, -53.5F);
		polymerhandguard.addChild(gun186);
		setRotationAngle(gun186, 0.0F, 0.0F, 0.7436F);
		gun186.cubeList.add(new ModelBox(gun186, 79, 2, 0.0F, -0.001F, 2.999F, 1, 1, 12, 0.0F, false));

		gun187 = new ModelRenderer(this);
		gun187.setRotationPoint(1.0F, -38.9F, -53.5F);
		polymerhandguard.addChild(gun187);
		setRotationAngle(gun187, 0.0F, 0.0F, 2.3051F);
		gun187.cubeList.add(new ModelBox(gun187, 18, 71, 0.0F, 0.0F, 3.0F, 1, 1, 12, 0.0F, false));

		gun188 = new ModelRenderer(this);
		gun188.setRotationPoint(-4.0F, -33.5F, -38.5F);
		polymerhandguard.addChild(gun188);
		gun188.cubeList.add(new ModelBox(gun188, 19, 13, 0.001F, 0.0F, 0.0F, 5, 3, 1, 0.0F, false));

		gun189 = new ModelRenderer(this);
		gun189.setRotationPoint(-4.0F, -30.5F, -38.5F);
		polymerhandguard.addChild(gun189);
		setRotationAngle(gun189, 2.6025F, 0.0F, 0.0F);
		gun189.cubeList.add(new ModelBox(gun189, 84, 33, -0.001F, 0.0F, 0.0F, 5, 3, 5, 0.0F, false));

		gun190 = new ModelRenderer(this);
		gun190.setRotationPoint(-4.0F, -30.5F, -37.5F);
		polymerhandguard.addChild(gun190);
		setRotationAngle(gun190, 2.1192F, 0.0F, 0.0F);
		gun190.cubeList.add(new ModelBox(gun190, 19, 31, 0.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F, false));

		gun191 = new ModelRenderer(this);
		gun191.setRotationPoint(-4.0F, -33.0F, -37.5F);
		polymerhandguard.addChild(gun191);
		gun191.cubeList.add(new ModelBox(gun191, 0, 31, 0.001F, 0.0F, 0.0F, 5, 2, 1, 0.0F, false));

		gun209 = new ModelRenderer(this);
		gun209.setRotationPoint(-3.5F, -38.1F, -53.5F);
		polymerhandguard.addChild(gun209);
		gun209.cubeList.add(new ModelBox(gun209, 22, 57, 0.001F, 0.0F, 3.001F, 4, 1, 12, 0.0F, false));

		gun210 = new ModelRenderer(this);
		gun210.setRotationPoint(-3.5F, -37.0F, -53.5F);
		polymerhandguard.addChild(gun210);
		gun210.cubeList.add(new ModelBox(gun210, 3, 58, 0.001F, 0.0F, 3.0F, 4, 1, 10, 0.0F, false));

		gun211 = new ModelRenderer(this);
		gun211.setRotationPoint(-3.5F, -37.5F, -53.5F);
		polymerhandguard.addChild(gun211);
		gun211.cubeList.add(new ModelBox(gun211, 19, 28, 0.0F, 0.0F, 3.0F, 4, 1, 2, 0.0F, false));

		gun212 = new ModelRenderer(this);
		gun212.setRotationPoint(-3.5F, -37.5F, -47.5F);
		polymerhandguard.addChild(gun212);
		gun212.cubeList.add(new ModelBox(gun212, 19, 25, 0.0F, 0.0F, 3.0F, 4, 1, 2, 0.0F, false));

		gun214 = new ModelRenderer(this);
		gun214.setRotationPoint(-3.0F, -37.5F, -51.5F);
		polymerhandguard.addChild(gun214);
		gun214.cubeList.add(new ModelBox(gun214, 63, 68, 0.0F, 0.0F, 3.0F, 3, 1, 11, 0.0F, false));

		gun215 = new ModelRenderer(this);
		gun215.setRotationPoint(-2.9F, -39.7F, -54.0F);
		polymerhandguard.addChild(gun215);
		gun215.cubeList.add(new ModelBox(gun215, 19, 3, 0.0F, 0.0F, 2.998F, 2, 1, 1, 0.0F, false));

		gun216 = new ModelRenderer(this);
		gun216.setRotationPoint(-1.1F, -39.7F, -54.0F);
		polymerhandguard.addChild(gun216);
		gun216.cubeList.add(new ModelBox(gun216, 27, 4, 0.0F, 0.0F, 2.999F, 1, 1, 1, 0.0F, false));

		gun217 = new ModelRenderer(this);
		gun217.setRotationPoint(-3.9F, -38.7F, -54.0F);
		polymerhandguard.addChild(gun217);
		gun217.cubeList.add(new ModelBox(gun217, 7, 25, 0.0F, 0.0F, 2.999F, 3, 4, 1, 0.0F, false));
		gun217.cubeList.add(new ModelBox(gun217, 7, 25, 0.0F, 4.0F, 2.999F, 3, 1, 1, 0.0F, false));

		gun218 = new ModelRenderer(this);
		gun218.setRotationPoint(-1.1F, -38.7F, -54.0F);
		polymerhandguard.addChild(gun218);
		gun218.cubeList.add(new ModelBox(gun218, 11, 18, 0.0F, 0.0F, 2.998F, 2, 4, 1, 0.0F, false));
		gun218.cubeList.add(new ModelBox(gun218, 11, 18, 0.0F, 4.0F, 2.998F, 2, 1, 1, 0.0F, false));

		gun219 = new ModelRenderer(this);
		gun219.setRotationPoint(-2.9F, -35.2F, -54.0F);
		polymerhandguard.addChild(gun219);
		gun219.cubeList.add(new ModelBox(gun219, 19, 0, 0.0F, 1.0F, 2.997F, 2, 2, 1, 0.0F, false));

		gun220 = new ModelRenderer(this);
		gun220.setRotationPoint(-1.1F, -35.2F, -54.0F);
		polymerhandguard.addChild(gun220);
		gun220.cubeList.add(new ModelBox(gun220, 12, 12, 0.0F, 1.0F, 3.0F, 1, 2, 1, 0.0F, false));

		gun221 = new ModelRenderer(this);
		gun221.setRotationPoint(-3.9F, -34.7F, -54.0F);
		polymerhandguard.addChild(gun221);
		setRotationAngle(gun221, 0.0F, 0.0F, -0.4833F);
		gun221.cubeList.add(new ModelBox(gun221, 27, 2, -0.4647F, 0.8855F, 3.001F, 1, 1, 1, 0.0F, false));

		gun222 = new ModelRenderer(this);
		gun222.setRotationPoint(-2.9F, -33.2F, -54.0F);
		polymerhandguard.addChild(gun222);
		setRotationAngle(gun222, 0.0F, 0.0F, -2.2679F);
		gun222.cubeList.add(new ModelBox(gun222, 27, 0, -0.7667F, -0.642F, 3.0F, 1, 1, 1, 0.0F, false));

		gun223 = new ModelRenderer(this);
		gun223.setRotationPoint(-0.1F, -33.2F, -54.0F);
		polymerhandguard.addChild(gun223);
		setRotationAngle(gun223, 0.0F, 0.0F, -2.4363F);
		gun223.cubeList.add(new ModelBox(gun223, 0, 27, -0.6483F, -0.7614F, 2.999F, 1, 1, 1, 0.0F, false));

		gun224 = new ModelRenderer(this);
		gun224.setRotationPoint(0.9F, -34.7F, -54.0F);
		polymerhandguard.addChild(gun224);
		setRotationAngle(gun224, 0.0F, 0.0F, 2.0448F);
		gun224.cubeList.add(new ModelBox(gun224, 26, 21, 0.8897F, -0.4565F, 3.001F, 1, 1, 1, 0.0F, false));

		gun225 = new ModelRenderer(this);
		gun225.setRotationPoint(-0.1F, -39.7F, -54.0F);
		polymerhandguard.addChild(gun225);
		setRotationAngle(gun225, 0.0F, 0.0F, 0.7808F);
		gun225.cubeList.add(new ModelBox(gun225, 0, 25, 0.0F, 0.0F, 3.001F, 1, 1, 1, 0.0F, false));

		gun226 = new ModelRenderer(this);
		gun226.setRotationPoint(0.9F, -38.7F, -54.0F);
		polymerhandguard.addChild(gun226);
		setRotationAngle(gun226, 0.0F, 0.0F, 2.3794F);
		gun226.cubeList.add(new ModelBox(gun226, 19, 21, 0.0F, 0.0F, 3.0F, 1, 1, 1, 0.0F, false));

		gun227 = new ModelRenderer(this);
		gun227.setRotationPoint(-2.9F, -39.7F, -54.0F);
		polymerhandguard.addChild(gun227);
		setRotationAngle(gun227, 0.0F, 0.0F, 0.8179F);
		gun227.cubeList.add(new ModelBox(gun227, 0, 20, 0.0F, 0.0F, 3.001F, 1, 1, 1, 0.0F, false));

		gun228 = new ModelRenderer(this);
		gun228.setRotationPoint(-3.9F, -38.7F, -54.0F);
		polymerhandguard.addChild(gun228);
		setRotationAngle(gun228, 0.0F, 0.0F, -0.7808F);
		gun228.cubeList.add(new ModelBox(gun228, 19, 19, 0.0F, 0.0F, 3.0F, 1, 1, 1, 0.0F, false));

		gun229 = new ModelRenderer(this);
		gun229.setRotationPoint(-3.0F, -33.0F, -53.5F);
		polymerhandguard.addChild(gun229);
		setRotationAngle(gun229, 0.0F, 0.0F, -2.3423F);
		gun229.cubeList.add(new ModelBox(gun229, 2, 84, -1.0753F, -1.0458F, 3.0F, 1, 1, 9, 0.0F, false));
		gun229.cubeList.add(new ModelBox(gun229, 8, 90, -1.0753F, -1.0458F, 12.0F, 1, 1, 3, 0.0F, false));

		gun230 = new ModelRenderer(this);
		gun230.setRotationPoint(-4.0F, -34.0F, -53.5F);
		polymerhandguard.addChild(gun230);
		setRotationAngle(gun230, 0.0F, 0.0F, -0.7808F);
		gun230.cubeList.add(new ModelBox(gun230, 62, 3, -1.0558F, 1.0655F, 3.0F, 1, 1, 9, 0.0F, false));
		gun230.cubeList.add(new ModelBox(gun230, 68, 9, -1.0558F, 1.0655F, 12.0F, 1, 1, 3, 0.0F, false));

		gun231 = new ModelRenderer(this);
		gun231.setRotationPoint(1.0F, -34.0F, -53.5F);
		polymerhandguard.addChild(gun231);
		setRotationAngle(gun231, 0.0F, 0.0F, 2.3794F);
		gun231.cubeList.add(new ModelBox(gun231, 64, 3, 1.0358F, -1.085F, 3.0F, 1, 1, 9, 0.0F, false));
		gun231.cubeList.add(new ModelBox(gun231, 70, 9, 1.0358F, -1.085F, 12.0F, 1, 1, 3, 0.0F, false));

		gun232 = new ModelRenderer(this);
		gun232.setRotationPoint(0.0F, -33.0F, -53.5F);
		polymerhandguard.addChild(gun232);
		setRotationAngle(gun232, 0.0F, 0.0F, -2.3794F);
		gun232.cubeList.add(new ModelBox(gun232, 69, 56, -1.0358F, -1.085F, 3.0F, 1, 1, 9, 0.0F, false));
		gun232.cubeList.add(new ModelBox(gun232, 75, 62, -1.0358F, -1.085F, 12.0F, 1, 1, 3, 0.0F, false));

		gun245 = new ModelRenderer(this);
		gun245.setRotationPoint(-4.2F, -34.4F, -53.5F);
		polymerhandguard.addChild(gun245);
		setRotationAngle(gun245, 0.0F, 0.0F, -0.7854F);
		

		gun248_r1 = new ModelRenderer(this);
		gun248_r1.setRotationPoint(0.6717F, 3.1466F, -2.5F);
		gun245.addChild(gun248_r1);
		setRotationAngle(gun248_r1, -1.5708F, -0.7854F, 0.7854F);
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 1, 11, 2.4395F, -6.2579F, -4.3F, 1, 1, 4, 0.0F, false));
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 1, 11, 3.0052F, -6.8236F, -4.3F, 1, 1, 4, 0.0F, false));
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 4, 14, 2.4395F, -6.2579F, -6.25F, 1, 1, 1, 0.0F, false));
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 4, 14, 3.0052F, -6.8236F, -6.25F, 1, 1, 1, 0.0F, false));
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 4, 14, 3.5709F, -7.3892F, -6.25F, 1, 1, 1, 0.0F, false));
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 4, 14, 4.1366F, -7.9549F, -6.25F, 1, 1, 1, 0.0F, false));
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 1, 11, 3.5709F, -7.3893F, -4.3F, 1, 1, 4, 0.0F, false));
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 1, 11, 4.1366F, -7.955F, -4.3F, 1, 1, 4, 0.0F, false));
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 4, 14, 4.7022F, -8.5206F, -6.25F, 1, 1, 1, 0.0F, false));
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 4, 14, 5.2679F, -9.0863F, -6.25F, 1, 1, 1, 0.0F, false));
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 1, 11, 4.7022F, -8.5206F, -4.3F, 1, 1, 4, 0.0F, false));
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 1, 11, 5.2679F, -9.0863F, -4.3F, 1, 1, 4, 0.0F, false));
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 4, 14, 5.8336F, -9.652F, -6.25F, 1, 1, 1, 0.0F, false));
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 4, 14, 6.3993F, -10.2177F, -6.25F, 1, 1, 1, 0.0F, false));
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 1, 11, 5.8336F, -9.652F, -4.3F, 1, 1, 4, 0.0F, false));
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 1, 11, 6.3993F, -10.2177F, -4.3F, 1, 1, 4, 0.0F, false));
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 4, 14, 6.965F, -10.7834F, -6.25F, 1, 1, 1, 0.0F, false));
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 4, 14, 7.5307F, -11.3491F, -6.25F, 1, 1, 1, 0.0F, false));
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 1, 11, 6.965F, -10.7834F, -4.3F, 1, 1, 4, 0.0F, false));
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 1, 11, 7.5307F, -11.3491F, -4.3F, 1, 1, 4, 0.0F, false));
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 4, 14, 8.0964F, -11.9147F, -6.25F, 1, 1, 1, 0.0F, false));
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 4, 14, 8.6621F, -12.4804F, -6.25F, 1, 1, 1, 0.0F, false));
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 1, 11, 8.0964F, -11.9147F, -4.3F, 1, 1, 4, 0.0F, false));
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 1, 11, 8.6621F, -12.4804F, -4.3F, 1, 1, 4, 0.0F, false));
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 4, 14, 9.2277F, -13.0461F, -6.25F, 1, 1, 1, 0.0F, false));
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 4, 14, 9.7934F, -13.6118F, -6.25F, 1, 1, 1, 0.0F, false));
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 4, 14, 2.4395F, -6.2579F, -5.65F, 1, 1, 1, 0.0F, false));
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 4, 14, 3.0052F, -6.8236F, -5.65F, 1, 1, 1, 0.0F, false));
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 4, 14, 3.5709F, -7.3892F, -5.65F, 1, 1, 1, 0.0F, false));
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 4, 14, 4.1366F, -7.9549F, -5.65F, 1, 1, 1, 0.0F, false));
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 4, 14, 4.7022F, -8.5206F, -5.65F, 1, 1, 1, 0.0F, false));
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 4, 14, 5.2679F, -9.0863F, -5.65F, 1, 1, 1, 0.0F, false));
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 4, 14, 5.8336F, -9.652F, -5.65F, 1, 1, 1, 0.0F, false));
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 4, 14, 6.3993F, -10.2177F, -5.65F, 1, 1, 1, 0.0F, false));
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 4, 14, 6.965F, -10.7834F, -5.65F, 1, 1, 1, 0.0F, false));
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 4, 14, 7.5307F, -11.3491F, -5.65F, 1, 1, 1, 0.0F, false));
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 4, 14, 8.0964F, -11.9147F, -5.65F, 1, 1, 1, 0.0F, false));
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 4, 14, 8.6621F, -12.4804F, -5.65F, 1, 1, 1, 0.0F, false));
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 4, 14, 9.2277F, -13.0461F, -5.65F, 1, 1, 1, 0.0F, false));
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 4, 14, 9.7934F, -13.6118F, -5.65F, 1, 1, 1, 0.0F, false));
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 1, 11, 9.2277F, -13.0461F, -4.3F, 1, 1, 4, 0.0F, false));
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 0, 10, 9.7934F, -13.6118F, -4.3F, 1, 1, 5, 0.0F, false));
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 0, 10, 11.4905F, -15.3089F, -4.3F, 1, 1, 5, 0.0F, false));
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, -1, 9, 10.9248F, -14.7432F, -4.3F, 1, 1, 6, 0.0F, false));
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, -1, 9, 10.3592F, -14.1775F, -4.3F, 1, 1, 6, 0.0F, false));

		gun250 = new ModelRenderer(this);
		gun250.setRotationPoint(1.2F, -35.0F, -53.5F);
		polymerhandguard.addChild(gun250);
		setRotationAngle(gun250, 0.0F, 0.0F, 2.3562F);
		

		gun253_r1 = new ModelRenderer(this);
		gun253_r1.setRotationPoint(3.5709F, 0.2475F, -2.5F);
		gun250.addChild(gun253_r1);
		setRotationAngle(gun253_r1, 1.5708F, 0.7854F, 0.7854F);
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 1, 20, -6.8943F, 3.0759F, -4.3F, 1, 1, 4, 0.0F, false));
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 1, 20, -6.3286F, 2.5102F, -4.3F, 1, 1, 4, 0.0F, false));
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 4, 23, -6.8943F, 3.0759F, -6.25F, 1, 1, 1, 0.0F, false));
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 4, 23, -6.3286F, 2.5102F, -6.25F, 1, 1, 1, 0.0F, false));
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 4, 23, -8.0256F, 4.2073F, -6.25F, 1, 1, 1, 0.0F, false));
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 4, 23, -7.4599F, 3.6416F, -6.25F, 1, 1, 1, 0.0F, false));
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 1, 20, -8.0256F, 4.2073F, -4.3F, 1, 1, 4, 0.0F, false));
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 1, 20, -7.4599F, 3.6416F, -4.3F, 1, 1, 4, 0.0F, false));
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 4, 23, -9.157F, 5.3386F, -6.25F, 1, 1, 1, 0.0F, false));
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 4, 23, -8.5913F, 4.7729F, -6.25F, 1, 1, 1, 0.0F, false));
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 1, 20, -9.157F, 5.3386F, -4.3F, 1, 1, 4, 0.0F, false));
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 1, 20, -8.5913F, 4.7729F, -4.3F, 1, 1, 4, 0.0F, false));
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 4, 23, -10.2884F, 6.47F, -6.25F, 1, 1, 1, 0.0F, false));
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 4, 23, -9.7227F, 5.9043F, -6.25F, 1, 1, 1, 0.0F, false));
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 1, 20, -10.2884F, 6.47F, -4.3F, 1, 1, 4, 0.0F, false));
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 1, 20, -9.7227F, 5.9043F, -4.3F, 1, 1, 4, 0.0F, false));
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 4, 23, -11.4198F, 7.6014F, -6.25F, 1, 1, 1, 0.0F, false));
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 4, 23, -10.8541F, 7.0357F, -6.25F, 1, 1, 1, 0.0F, false));
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 1, 20, -11.4198F, 7.6014F, -4.3F, 1, 1, 4, 0.0F, false));
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 1, 20, -10.8541F, 7.0357F, -4.3F, 1, 1, 4, 0.0F, false));
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 4, 23, -12.5511F, 8.7328F, -6.25F, 1, 1, 1, 0.0F, false));
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 4, 23, -11.9854F, 8.1671F, -6.25F, 1, 1, 1, 0.0F, false));
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 1, 20, -12.5511F, 8.7328F, -4.3F, 1, 1, 4, 0.0F, false));
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 1, 20, -11.9854F, 8.1671F, -4.3F, 1, 1, 4, 0.0F, false));
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 4, 23, -13.6825F, 9.8641F, -6.25F, 1, 1, 1, 0.0F, false));
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 4, 23, -13.1168F, 9.2984F, -6.25F, 1, 1, 1, 0.0F, false));
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 4, 23, -6.8943F, 3.0759F, -5.65F, 1, 1, 1, 0.0F, false));
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 4, 23, -6.3286F, 2.5102F, -5.65F, 1, 1, 1, 0.0F, false));
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 4, 23, -8.0256F, 4.2073F, -5.65F, 1, 1, 1, 0.0F, false));
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 4, 23, -7.4599F, 3.6416F, -5.65F, 1, 1, 1, 0.0F, false));
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 4, 23, -9.157F, 5.3386F, -5.65F, 1, 1, 1, 0.0F, false));
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 4, 23, -8.5913F, 4.7729F, -5.65F, 1, 1, 1, 0.0F, false));
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 4, 23, -10.2884F, 6.47F, -5.65F, 1, 1, 1, 0.0F, false));
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 4, 23, -9.7227F, 5.9043F, -5.65F, 1, 1, 1, 0.0F, false));
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 4, 23, -11.4198F, 7.6014F, -5.65F, 1, 1, 1, 0.0F, false));
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 4, 23, -10.8541F, 7.0357F, -5.65F, 1, 1, 1, 0.0F, false));
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 4, 23, -12.5511F, 8.7328F, -5.65F, 1, 1, 1, 0.0F, false));
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 4, 23, -11.9854F, 8.1671F, -5.65F, 1, 1, 1, 0.0F, false));
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 4, 23, -13.6825F, 9.8641F, -5.65F, 1, 1, 1, 0.0F, false));
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 4, 23, -13.1168F, 9.2984F, -5.65F, 1, 1, 1, 0.0F, false));
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 0, 19, -13.6825F, 9.8641F, -4.3F, 1, 1, 5, 0.0F, false));
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 1, 20, -13.1168F, 9.2984F, -4.3F, 1, 1, 4, 0.0F, false));
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, -1, 18, -14.2482F, 10.4299F, -4.3F, 1, 1, 6, 0.0F, false));
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, -1, 18, -14.8139F, 10.9955F, -4.3F, 1, 1, 6, 0.0F, false));
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 0, 19, -15.3796F, 11.5612F, -4.3F, 1, 1, 5, 0.0F, false));

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(1.2497F, -38.8498F, -67.475F);
		polymerhandguard.addChild(bone17);
		setRotationAngle(bone17, -1.5708F, 0.0F, 0.7854F);
		

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone17.addChild(bone18);
		setRotationAngle(bone18, 0.0F, 0.0F, -0.7854F);
		bone18.cubeList.add(new ModelBox(bone18, 19, 21, 17.0667F, -22.5667F, 2.2681F, 1, 1, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 19, 21, 17.0667F, -22.5667F, 2.8181F, 1, 1, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 19, 21, 16.501F, -22.001F, 2.8181F, 1, 1, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 19, 21, 16.501F, -22.001F, 2.2681F, 1, 1, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 19, 21, 15.9353F, -21.4353F, 2.8181F, 1, 1, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 19, 21, 15.9353F, -21.4353F, 2.2681F, 1, 1, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 19, 21, 15.3696F, -20.8696F, 2.8181F, 1, 1, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 19, 21, 15.3696F, -20.8696F, 2.2681F, 1, 1, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 19, 21, 14.804F, -20.3039F, 2.2681F, 1, 1, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 19, 21, 14.804F, -20.3039F, 2.8181F, 1, 1, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 19, 21, 14.2383F, -19.7382F, 2.2681F, 1, 1, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 19, 21, 14.2383F, -19.7382F, 2.8181F, 1, 1, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 19, 21, 13.6726F, -19.1726F, 2.2681F, 1, 1, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 19, 21, 13.6726F, -19.1726F, 2.8181F, 1, 1, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 19, 21, 13.1069F, -18.6069F, 2.8181F, 1, 1, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 19, 21, 13.1069F, -18.6069F, 2.2681F, 1, 1, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 19, 21, 12.5412F, -18.0412F, 2.2681F, 1, 1, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 19, 21, 12.5412F, -18.0412F, 2.8181F, 1, 1, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 19, 21, 11.9755F, -17.4755F, 2.8181F, 1, 1, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 19, 21, 11.9755F, -17.4755F, 2.2681F, 1, 1, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 19, 21, 11.4098F, -16.9098F, 2.8181F, 1, 1, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 19, 21, 10.8441F, -16.3441F, 2.2681F, 1, 1, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 19, 21, 11.4098F, -16.9098F, 2.2681F, 1, 1, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 19, 21, 10.8441F, -16.3441F, 2.8181F, 1, 1, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 19, 21, 9.7128F, -15.2127F, 2.2681F, 1, 1, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 19, 21, 10.2785F, -15.7784F, 2.2681F, 1, 1, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 19, 21, 9.7128F, -15.2127F, 2.8181F, 1, 1, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 19, 21, 10.2785F, -15.7784F, 2.8181F, 1, 1, 1, 0.0F, false));

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(0.0F, 0.0F, 0.0F);
		polymerhandguard.addChild(bone19);
		setRotationAngle(bone19, -1.5708F, 0.0F, -0.7854F);
		

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(-2.8962F, -29.9038F, -64.475F);
		bone19.addChild(bone20);
		setRotationAngle(bone20, 0.0F, 0.0F, -0.7854F);
		bone20.cubeList.add(new ModelBox(bone20, 4, 9, -27.8719F, 70.0678F, 36.8171F, 1, 1, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 4, 9, -27.8719F, 70.0678F, 36.2671F, 1, 1, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 4, 9, -28.4376F, 70.6334F, 36.8171F, 1, 1, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 4, 9, -29.0033F, 71.1991F, 36.8171F, 1, 1, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 4, 9, -28.4376F, 70.6334F, 36.2671F, 1, 1, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 4, 9, -29.0033F, 71.1991F, 36.2671F, 1, 1, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 4, 9, -29.569F, 71.7648F, 36.8171F, 1, 1, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 4, 9, -30.1347F, 72.3305F, 36.8171F, 1, 1, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 4, 9, -29.569F, 71.7648F, 36.2671F, 1, 1, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 4, 9, -30.1347F, 72.3305F, 36.2671F, 1, 1, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 4, 9, -30.7004F, 72.8962F, 36.8171F, 1, 1, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 4, 9, -31.2661F, 73.4619F, 36.8171F, 1, 1, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 4, 9, -30.7004F, 72.8962F, 36.2671F, 1, 1, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 4, 9, -31.2661F, 73.4619F, 36.2671F, 1, 1, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 4, 9, -31.8317F, 74.0275F, 36.8171F, 1, 1, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 4, 9, -32.3974F, 74.5932F, 36.8171F, 1, 1, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 4, 9, -31.8317F, 74.0275F, 36.2671F, 1, 1, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 4, 9, -32.3974F, 74.5932F, 36.2671F, 1, 1, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 4, 9, -32.9631F, 75.1589F, 36.8171F, 1, 1, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 4, 9, -33.5288F, 75.7246F, 36.8171F, 1, 1, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 4, 9, -32.9631F, 75.1589F, 36.2671F, 1, 1, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 4, 9, -33.5288F, 75.7246F, 36.2671F, 1, 1, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 4, 9, -34.0945F, 76.2903F, 36.8171F, 1, 1, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 4, 9, -34.6602F, 76.856F, 36.8171F, 1, 1, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 4, 9, -34.0945F, 76.2903F, 36.2671F, 1, 1, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 4, 9, -34.6602F, 76.856F, 36.2671F, 1, 1, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 4, 9, -35.2258F, 77.4217F, 36.2671F, 1, 1, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 4, 9, -35.2258F, 77.4217F, 36.8171F, 1, 1, 1, 0.0F, false));

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(0.0F, 0.0F, 0.0F);
		polymerhandguard.addChild(bone21);
		setRotationAngle(bone21, -1.5708F, 0.0F, -1.5708F);
		

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(56.7807F, -45.5807F, -120.8F);
		bone21.addChild(bone22);
		setRotationAngle(bone22, 0.0F, 0.0F, -0.7854F);
		bone22.cubeList.add(new ModelBox(bone22, 14, 32, -79.7827F, 54.0454F, 117.6959F, 1, 1, 3, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 14, 32, -80.3484F, 54.6111F, 117.6959F, 1, 1, 3, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 14, 32, -79.217F, 53.4797F, 117.6959F, 1, 1, 3, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 14, 32, -78.6513F, 52.9141F, 117.6959F, 1, 1, 3, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 14, 32, -78.0856F, 52.3484F, 117.6959F, 1, 1, 3, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 14, 32, -77.5199F, 51.7827F, 117.6959F, 1, 1, 3, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 14, 32, -76.9542F, 51.217F, 117.6959F, 1, 1, 3, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 14, 32, -76.3885F, 50.6513F, 117.696F, 1, 1, 3, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 14, 32, -75.8228F, 50.0856F, 117.696F, 1, 1, 3, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 14, 32, -72.9944F, 47.2572F, 117.696F, 1, 1, 3, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 14, 32, -74.1258F, 48.3886F, 117.696F, 1, 1, 3, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 14, 32, -73.5601F, 47.8229F, 117.696F, 1, 1, 3, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 14, 32, -75.2572F, 49.5199F, 117.696F, 1, 1, 3, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 14, 32, -74.6915F, 48.9542F, 117.696F, 1, 1, 3, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 15, 34, -72.9237F, 47.1865F, 119.904F, 1, 1, 1, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 15, 34, -80.2776F, 54.5404F, 119.904F, 1, 1, 1, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 15, 34, -79.7119F, 53.9747F, 119.904F, 1, 1, 1, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 15, 34, -79.1462F, 53.409F, 119.904F, 1, 1, 1, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 15, 34, -78.5806F, 52.8434F, 119.904F, 1, 1, 1, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 15, 34, -78.0149F, 52.2777F, 119.904F, 1, 1, 1, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 15, 34, -77.4492F, 51.712F, 119.904F, 1, 1, 1, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 15, 34, -75.7521F, 50.0149F, 119.904F, 1, 1, 1, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 15, 34, -76.3178F, 50.5806F, 119.904F, 1, 1, 1, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 15, 34, -75.1864F, 49.4493F, 119.904F, 1, 1, 1, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 15, 34, -74.6207F, 48.8836F, 119.904F, 1, 1, 1, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 15, 34, -74.0551F, 48.3179F, 119.904F, 1, 1, 1, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 15, 34, -73.4894F, 47.7522F, 119.904F, 1, 1, 1, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 15, 34, -76.8835F, 51.1463F, 119.904F, 1, 1, 1, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.4151F, -36.7652F, -41.0F);
		polymerhandguard.addChild(bone2);
		

		gun348_r3_r1 = new ModelRenderer(this);
		gun348_r3_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(gun348_r3_r1);
		setRotationAngle(gun348_r3_r1, 0.0F, 0.0F, 0.7854F);
		gun348_r3_r1.cubeList.add(new ModelBox(gun348_r3_r1, 44, 50, -0.5F, -0.5F, -9.5F, 1, 1, 14, 0.0F, false));
		gun348_r3_r1.cubeList.add(new ModelBox(gun348_r3_r1, 46, 52, -1.0657F, -1.0657F, -9.5F, 1, 1, 12, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-3.4349F, -36.9652F, -41.0F);
		polymerhandguard.addChild(bone);
		

		gun248_r2_r1 = new ModelRenderer(this);
		gun248_r2_r1.setRotationPoint(0.0F, 0.2F, 0.0F);
		bone.addChild(gun248_r2_r1);
		setRotationAngle(gun248_r2_r1, 0.0F, 0.0F, 0.7854F);
		gun248_r2_r1.cubeList.add(new ModelBox(gun248_r2_r1, 44, 50, -0.5F, -0.5F, -9.5F, 1, 1, 14, 0.0F, false));
		gun248_r2_r1.cubeList.add(new ModelBox(gun248_r2_r1, 46, 52, -1.0657F, -1.0657F, -9.5F, 1, 1, 12, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		polymerhandguard.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}