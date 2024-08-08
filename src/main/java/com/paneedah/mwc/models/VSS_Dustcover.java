package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class VSS_Dustcover extends ModelBase {
	private final ModelRenderer dustcoverVSS;
	private final ModelRenderer gun118;
	private final ModelRenderer gun119_r1;
	private final ModelRenderer gun120;
	private final ModelRenderer gun123;
	private final ModelRenderer gun119;
	private final ModelRenderer gun120_r1;
	private final ModelRenderer gun121;
	private final ModelRenderer gun142;
	private final ModelRenderer gun116;
	private final ModelRenderer gun186;
	private final ModelRenderer gun158;
	private final ModelRenderer gun159_r1;
	private final ModelRenderer gun162;
	private final ModelRenderer gun182;
	private final ModelRenderer gun181;
	private final ModelRenderer gun157;
	private final ModelRenderer gun158_r1;
	private final ModelRenderer gun161;
	private final ModelRenderer gun160;
	private final ModelRenderer gun156;
	private final ModelRenderer gun157_r1;
	private final ModelRenderer gun155;
	private final ModelRenderer gun156_r1;
	private final ModelRenderer gun159;
	private final ModelRenderer gun163;
	private final ModelRenderer gun164;
	private final ModelRenderer gun146;
	private final ModelRenderer gun147_r1;
	private final ModelRenderer gun150;
	private final ModelRenderer gun154;
	private final ModelRenderer gun145;
	private final ModelRenderer gun146_r1;
	private final ModelRenderer gun149;
	private final ModelRenderer gun153;
	private final ModelRenderer gun144;
	private final ModelRenderer gun145_r1;
	private final ModelRenderer gun148;
	private final ModelRenderer gun152;
	private final ModelRenderer gun143;
	private final ModelRenderer gun144_r1;
	private final ModelRenderer gun147;
	private final ModelRenderer gun151;
	private final ModelRenderer gun117;
	private final ModelRenderer gun128;
	private final ModelRenderer gun130;
	private final ModelRenderer gun129;
	private final ModelRenderer gun130_r1;
	private final ModelRenderer gun129_r1;
	private final ModelRenderer gun126;
	private final ModelRenderer gun124;
	private final ModelRenderer gun125;
	private final ModelRenderer gun127;
	private final ModelRenderer gun139;

	public VSS_Dustcover() {
		textureWidth = 512;
		textureHeight = 512;

		dustcoverVSS = new ModelRenderer(this);
		dustcoverVSS.setRotationPoint(-0.5F, 29.5F, 0.0F);
		dustcoverVSS.cubeList.add(new ModelBox(dustcoverVSS, 153, 96, -1.4889F, -44.7932F, -9.2F, 1, 1, 4, -0.2F, false));
		dustcoverVSS.cubeList.add(new ModelBox(dustcoverVSS, 43, 162, -1.4889F, -44.7932F, -15.2F, 1, 1, 4, -0.2F, false));
		dustcoverVSS.cubeList.add(new ModelBox(dustcoverVSS, 153, 90, -1.4889F, -44.7932F, -21.2F, 1, 1, 4, -0.2F, false));
		dustcoverVSS.cubeList.add(new ModelBox(dustcoverVSS, 43, 176, -1.4889F, -44.7932F, -25.2F, 1, 1, 2, -0.2F, false));
		dustcoverVSS.cubeList.add(new ModelBox(dustcoverVSS, 154, 182, -1.4889F, -44.7432F, -4.7F, 1, 1, 1, -0.2F, false));
		dustcoverVSS.cubeList.add(new ModelBox(dustcoverVSS, 185, 6, -1.4889F, -44.7432F, -10.7F, 1, 1, 1, -0.2F, false));
		dustcoverVSS.cubeList.add(new ModelBox(dustcoverVSS, 198, 115, -1.4889F, -44.7432F, -16.7F, 1, 1, 1, -0.2F, false));
		dustcoverVSS.cubeList.add(new ModelBox(dustcoverVSS, 184, 174, -1.4889F, -44.7432F, -22.7F, 1, 1, 1, -0.2F, false));

		gun118 = new ModelRenderer(this);
		gun118.setRotationPoint(-1.0F, -39.2F, -26.5F);
		dustcoverVSS.addChild(gun118);
		setRotationAngle(gun118, 0.0F, 0.0F, 0.4461F);
		gun118.cubeList.add(new ModelBox(gun118, 78, 254, -2.1599F, -5.0192F, 1.0F, 1, 1, 24, -0.2F, false));

		gun119_r1 = new ModelRenderer(this);
		gun119_r1.setRotationPoint(-1.1879F, -4.5093F, 13.3F);
		gun118.addChild(gun119_r1);
		setRotationAngle(gun119_r1, 0.0F, 0.0F, 0.3491F);
		gun119_r1.cubeList.add(new ModelBox(gun119_r1, 169, 246, -0.4676F, -0.4323F, -12.3F, 1, 1, 24, -0.2F, false));

		gun120 = new ModelRenderer(this);
		gun120.setRotationPoint(-0.1F, -38.75F, -26.5F);
		dustcoverVSS.addChild(gun120);
		setRotationAngle(gun120, 0.0F, 0.0F, 1.1897F);
		gun120.cubeList.add(new ModelBox(gun120, 245, 199, -4.6618F, -2.3891F, 1.0F, 1, 1, 24, -0.2F, false));

		gun123 = new ModelRenderer(this);
		gun123.setRotationPoint(0.25F, -37.8F, -26.5F);
		dustcoverVSS.addChild(gun123);
		setRotationAngle(gun123, 0.0F, 0.0F, 1.45F);
		gun123.cubeList.add(new ModelBox(gun123, 215, 0, -5.4804F, -1.0884F, 1.0F, 3, 1, 24, -0.2F, false));
		gun123.cubeList.add(new ModelBox(gun123, 180, 96, -4.4804F, -1.0884F, 24.6F, 2, 1, 1, -0.2F, false));
		gun123.cubeList.add(new ModelBox(gun123, 73, 180, -5.3804F, -1.0884F, 24.6F, 2, 1, 1, -0.2F, false));

		gun119 = new ModelRenderer(this);
		gun119.setRotationPoint(-2.0F, -39.2F, -26.5F);
		dustcoverVSS.addChild(gun119);
		setRotationAngle(gun119, 0.0F, 0.0F, 1.0782F);
		gun119.cubeList.add(new ModelBox(gun119, 244, 173, -4.4395F, -3.2825F, 1.0F, 1, 1, 24, -0.2F, false));

		gun120_r1 = new ModelRenderer(this);
		gun120_r1.setRotationPoint(-3.9292F, -2.3139F, 13.3F);
		gun119.addChild(gun120_r1);
		setRotationAngle(gun120_r1, 0.0F, 0.0F, -0.3491F);
		gun120_r1.cubeList.add(new ModelBox(gun120_r1, 243, 107, -0.4339F, -0.4645F, -12.3F, 1, 1, 24, -0.2F, false));

		gun121 = new ModelRenderer(this);
		gun121.setRotationPoint(-2.9F, -38.7F, -26.5F);
		dustcoverVSS.addChild(gun121);
		setRotationAngle(gun121, 0.0F, 0.0F, 0.3346F);
		gun121.cubeList.add(new ModelBox(gun121, 43, 82, -1.1846F, -5.111F, 11.0F, 1, 1, 14, -0.2F, false));

		gun142 = new ModelRenderer(this);
		gun142.setRotationPoint(-3.2F, -37.8F, -14.5F);
		dustcoverVSS.addChild(gun142);
		setRotationAngle(gun142, 0.0F, 0.0F, 0.1487F);
		gun142.cubeList.add(new ModelBox(gun142, 0, 80, -0.2075F, -5.5532F, -1.0F, 1, 1, 14, -0.2F, false));
		gun142.cubeList.add(new ModelBox(gun142, 98, 61, -0.1966F, -6.2429F, -11.1F, 1, 1, 11, -0.3F, false));
		gun142.cubeList.add(new ModelBox(gun142, 184, 59, -0.2075F, -5.5532F, 12.6F, 1, 1, 1, -0.2F, false));
		gun142.cubeList.add(new ModelBox(gun142, 20, 140, -0.2085F, -4.9542F, 0.401F, 1, 1, 6, -0.201F, false));
		gun142.cubeList.add(new ModelBox(gun142, 192, 88, -0.2085F, -4.3542F, 5.401F, 1, 1, 1, -0.201F, false));
		gun142.cubeList.add(new ModelBox(gun142, 86, 27, -0.2075F, -4.9532F, 6.0F, 1, 2, 8, -0.2F, false));

		gun116 = new ModelRenderer(this);
		gun116.setRotationPoint(-2.0F, -39.2F, -26.5F);
		dustcoverVSS.addChild(gun116);
		gun116.cubeList.add(new ModelBox(gun116, 243, 67, 0.5111F, -5.3932F, 1.0F, 1, 1, 24, -0.2F, false));

		gun186 = new ModelRenderer(this);
		gun186.setRotationPoint(-2.0F, -39.35F, -4.5F);
		dustcoverVSS.addChild(gun186);
		

		gun158 = new ModelRenderer(this);
		gun158.setRotationPoint(-2.0F, -39.3F, -6.5F);
		dustcoverVSS.addChild(gun158);
		setRotationAngle(gun158, 0.0F, 0.0F, 1.0782F);
		gun158.cubeList.add(new ModelBox(gun158, 149, 182, -4.4835F, -3.3061F, 1.8F, 1, 1, 1, -0.2F, false));

		gun159_r1 = new ModelRenderer(this);
		gun159_r1.setRotationPoint(-3.8248F, -2.3161F, -6.7F);
		gun158.addChild(gun159_r1);
		setRotationAngle(gun159_r1, 0.0F, 0.0F, -0.3491F);
		gun159_r1.cubeList.add(new ModelBox(gun159_r1, 33, 164, -0.5661F, -0.5355F, 8.5F, 1, 1, 1, -0.2F, false));

		gun162 = new ModelRenderer(this);
		gun162.setRotationPoint(-2.9F, -38.8F, -6.5F);
		dustcoverVSS.addChild(gun162);
		setRotationAngle(gun162, 0.0F, 0.0F, 0.3346F);
		gun162.cubeList.add(new ModelBox(gun162, 30, 193, -1.201F, -5.1582F, 1.8F, 1, 1, 1, -0.2F, false));

		gun182 = new ModelRenderer(this);
		gun182.setRotationPoint(-3.25F, -37.9F, -6.5F);
		dustcoverVSS.addChild(gun182);
		setRotationAngle(gun182, 0.0F, 0.0F, 0.1487F);
		gun182.cubeList.add(new ModelBox(gun182, 106, 29, -0.1655F, -5.6101F, 1.8F, 1, 2, 1, -0.2F, false));

		gun181 = new ModelRenderer(this);
		gun181.setRotationPoint(-3.25F, -37.9F, -12.5F);
		dustcoverVSS.addChild(gun181);
		setRotationAngle(gun181, 0.0F, 0.0F, 0.1487F);
		gun181.cubeList.add(new ModelBox(gun181, 192, 63, -0.1655F, -5.6101F, 1.8F, 1, 1, 1, -0.2F, false));

		gun157 = new ModelRenderer(this);
		gun157.setRotationPoint(-2.0F, -39.3F, -12.5F);
		dustcoverVSS.addChild(gun157);
		setRotationAngle(gun157, 0.0F, 0.0F, 1.0782F);
		gun157.cubeList.add(new ModelBox(gun157, 189, 69, -4.4835F, -3.3061F, 1.8F, 1, 1, 1, -0.2F, false));

		gun158_r1 = new ModelRenderer(this);
		gun158_r1.setRotationPoint(-3.8248F, -2.3161F, -0.7F);
		gun157.addChild(gun158_r1);
		setRotationAngle(gun158_r1, 0.0F, 0.0F, -0.3491F);
		gun158_r1.cubeList.add(new ModelBox(gun158_r1, 144, 182, -0.5661F, -0.5355F, 2.5F, 1, 1, 1, -0.2F, false));

		gun161 = new ModelRenderer(this);
		gun161.setRotationPoint(-2.9F, -38.8F, -12.5F);
		dustcoverVSS.addChild(gun161);
		setRotationAngle(gun161, 0.0F, 0.0F, 0.3346F);
		gun161.cubeList.add(new ModelBox(gun161, 67, 189, -1.201F, -5.1582F, 1.8F, 1, 1, 1, -0.2F, false));

		gun160 = new ModelRenderer(this);
		gun160.setRotationPoint(-2.9F, -38.8F, -18.5F);
		dustcoverVSS.addChild(gun160);
		setRotationAngle(gun160, 0.0F, 0.0F, 0.3346F);
		

		gun156 = new ModelRenderer(this);
		gun156.setRotationPoint(-2.0F, -39.3F, -18.5F);
		dustcoverVSS.addChild(gun156);
		setRotationAngle(gun156, 0.0F, 0.0F, 1.0782F);
		gun156.cubeList.add(new ModelBox(gun156, 199, 97, -4.4835F, -3.3061F, 1.8F, 1, 1, 1, -0.2F, false));

		gun157_r1 = new ModelRenderer(this);
		gun157_r1.setRotationPoint(-3.8248F, -2.3161F, 5.3F);
		gun156.addChild(gun157_r1);
		setRotationAngle(gun157_r1, 0.0F, 0.0F, -0.3491F);
		gun157_r1.cubeList.add(new ModelBox(gun157_r1, 198, 75, -0.5661F, -0.5355F, -3.5F, 1, 1, 1, -0.2F, false));

		gun155 = new ModelRenderer(this);
		gun155.setRotationPoint(-2.0F, -39.3F, -24.5F);
		dustcoverVSS.addChild(gun155);
		setRotationAngle(gun155, 0.0F, 0.0F, 1.0782F);
		gun155.cubeList.add(new ModelBox(gun155, 58, 189, -4.4835F, -3.3061F, 1.8F, 1, 1, 1, -0.2F, false));

		gun156_r1 = new ModelRenderer(this);
		gun156_r1.setRotationPoint(-3.8248F, -2.3161F, 11.3F);
		gun155.addChild(gun156_r1);
		setRotationAngle(gun156_r1, 0.0F, 0.0F, -0.3491F);
		gun156_r1.cubeList.add(new ModelBox(gun156_r1, 139, 182, -0.5661F, -0.5355F, -9.5F, 1, 1, 1, -0.2F, false));

		gun159 = new ModelRenderer(this);
		gun159.setRotationPoint(-2.9F, -38.8F, -24.5F);
		dustcoverVSS.addChild(gun159);
		setRotationAngle(gun159, 0.0F, 0.0F, 0.3346F);
		

		gun163 = new ModelRenderer(this);
		gun163.setRotationPoint(-2.5F, -38.3F, -26.5F);
		dustcoverVSS.addChild(gun163);
		setRotationAngle(gun163, 0.0F, 0.0F, 1.041F);
		

		gun164 = new ModelRenderer(this);
		gun164.setRotationPoint(-3.75F, -36.9F, -14.5F);
		dustcoverVSS.addChild(gun164);
		setRotationAngle(gun164, -0.0873F, 0.0F, 0.0F);
		gun164.cubeList.add(new ModelBox(gun164, 129, 82, 0.7003F, -5.9045F, -1.6024F, 1, 1, 7, -0.3F, false));

		gun146 = new ModelRenderer(this);
		gun146.setRotationPoint(-1.0F, -39.3F, -6.5F);
		dustcoverVSS.addChild(gun146);
		setRotationAngle(gun146, 0.0F, 0.0F, 0.4461F);
		gun146.cubeList.add(new ModelBox(gun146, 25, 193, -2.1815F, -5.0643F, 1.8F, 1, 1, 1, -0.2F, false));

		gun147_r1 = new ModelRenderer(this);
		gun147_r1.setRotationPoint(-1.1949F, -4.4051F, -6.7F);
		gun146.addChild(gun147_r1);
		setRotationAngle(gun147_r1, 0.0F, 0.0F, 0.3491F);
		gun147_r1.cubeList.add(new ModelBox(gun147_r1, 194, 85, -0.5324F, -0.5677F, 8.5F, 1, 1, 1, -0.2F, false));

		gun150 = new ModelRenderer(this);
		gun150.setRotationPoint(-0.1F, -38.9F, -6.5F);
		dustcoverVSS.addChild(gun150);
		setRotationAngle(gun150, 0.0F, 0.0F, 1.1897F);
		gun150.cubeList.add(new ModelBox(gun150, 10, 184, -4.6618F, -2.3891F, 1.8F, 1, 1, 1, -0.2F, false));

		gun154 = new ModelRenderer(this);
		gun154.setRotationPoint(0.3F, -37.95F, -6.5F);
		dustcoverVSS.addChild(gun154);
		setRotationAngle(gun154, 0.0F, 0.0F, 1.45F);
		gun154.cubeList.add(new ModelBox(gun154, 60, 93, -5.4864F, -1.0388F, 1.8F, 3, 1, 1, -0.2F, false));

		gun145 = new ModelRenderer(this);
		gun145.setRotationPoint(-1.0F, -39.3F, -12.5F);
		dustcoverVSS.addChild(gun145);
		setRotationAngle(gun145, 0.0F, 0.0F, 0.4461F);
		gun145.cubeList.add(new ModelBox(gun145, 189, 32, -2.1815F, -5.0643F, 1.8F, 1, 1, 1, -0.2F, false));

		gun146_r1 = new ModelRenderer(this);
		gun146_r1.setRotationPoint(-1.1949F, -4.4051F, -0.7F);
		gun145.addChild(gun146_r1);
		setRotationAngle(gun146_r1, 0.0F, 0.0F, 0.3491F);
		gun146_r1.cubeList.add(new ModelBox(gun146_r1, 116, 193, -0.5324F, -0.5677F, 2.5F, 1, 1, 1, -0.2F, false));

		gun149 = new ModelRenderer(this);
		gun149.setRotationPoint(-0.1F, -38.9F, -12.5F);
		dustcoverVSS.addChild(gun149);
		setRotationAngle(gun149, 0.0F, 0.0F, 1.1897F);
		gun149.cubeList.add(new ModelBox(gun149, 189, 8, -4.6618F, -2.3891F, 1.8F, 1, 1, 1, -0.2F, false));

		gun153 = new ModelRenderer(this);
		gun153.setRotationPoint(0.3F, -37.95F, -12.5F);
		dustcoverVSS.addChild(gun153);
		setRotationAngle(gun153, 0.0F, 0.0F, 1.45F);
		gun153.cubeList.add(new ModelBox(gun153, 68, 149, -5.4864F, -1.0388F, 1.8F, 3, 1, 1, -0.2F, false));

		gun144 = new ModelRenderer(this);
		gun144.setRotationPoint(-1.0F, -39.3F, -18.5F);
		dustcoverVSS.addChild(gun144);
		setRotationAngle(gun144, 0.0F, 0.0F, 0.4461F);
		gun144.cubeList.add(new ModelBox(gun144, 199, 93, -2.1815F, -5.0643F, 1.8F, 1, 1, 1, -0.2F, false));

		gun145_r1 = new ModelRenderer(this);
		gun145_r1.setRotationPoint(-1.1949F, -4.4051F, 5.3F);
		gun144.addChild(gun145_r1);
		setRotationAngle(gun145_r1, 0.0F, 0.0F, 0.3491F);
		gun145_r1.cubeList.add(new ModelBox(gun145_r1, 200, 6, -0.5324F, -0.5677F, -3.5F, 1, 1, 1, -0.2F, false));

		gun148 = new ModelRenderer(this);
		gun148.setRotationPoint(-0.1F, -38.9F, -18.5F);
		dustcoverVSS.addChild(gun148);
		setRotationAngle(gun148, 0.0F, 0.0F, 1.1897F);
		gun148.cubeList.add(new ModelBox(gun148, 199, 85, -4.6618F, -2.3891F, 1.8F, 1, 1, 1, -0.2F, false));

		gun152 = new ModelRenderer(this);
		gun152.setRotationPoint(0.3F, -37.95F, -18.5F);
		dustcoverVSS.addChild(gun152);
		setRotationAngle(gun152, 0.0F, 0.0F, 1.45F);
		gun152.cubeList.add(new ModelBox(gun152, 156, 176, -5.4864F, -1.0388F, 1.8F, 3, 1, 1, -0.2F, false));

		gun143 = new ModelRenderer(this);
		gun143.setRotationPoint(-1.0F, -39.3F, -24.5F);
		dustcoverVSS.addChild(gun143);
		setRotationAngle(gun143, 0.0F, 0.0F, 0.4461F);
		gun143.cubeList.add(new ModelBox(gun143, 188, 176, -2.1815F, -5.0643F, 1.8F, 1, 1, 1, -0.2F, false));

		gun144_r1 = new ModelRenderer(this);
		gun144_r1.setRotationPoint(-1.1949F, -4.4051F, 11.3F);
		gun143.addChild(gun144_r1);
		setRotationAngle(gun144_r1, 0.0F, 0.0F, 0.3491F);
		gun144_r1.cubeList.add(new ModelBox(gun144_r1, 193, 115, -0.5324F, -0.5677F, -9.5F, 1, 1, 1, -0.2F, false));

		gun147 = new ModelRenderer(this);
		gun147.setRotationPoint(-0.1F, -38.9F, -24.5F);
		dustcoverVSS.addChild(gun147);
		setRotationAngle(gun147, 0.0F, 0.0F, 1.1897F);
		gun147.cubeList.add(new ModelBox(gun147, 159, 188, -4.6618F, -2.3891F, 1.8F, 1, 1, 1, -0.2F, false));

		gun151 = new ModelRenderer(this);
		gun151.setRotationPoint(0.3F, -37.95F, -24.5F);
		dustcoverVSS.addChild(gun151);
		setRotationAngle(gun151, 0.0F, 0.0F, 1.45F);
		gun151.cubeList.add(new ModelBox(gun151, 139, 51, -5.4864F, -1.0388F, 1.8F, 3, 1, 1, -0.2F, false));

		gun117 = new ModelRenderer(this);
		gun117.setRotationPoint(0.25F, -35.7F, -26.5F);
		dustcoverVSS.addChild(gun117);
		setRotationAngle(gun117, 0.0F, 0.0F, 0.7436F);
		gun117.cubeList.add(new ModelBox(gun117, 215, 120, -3.4993F, -4.3514F, 0.89F, 1, 1, 25, -0.2F, false));

		gun128 = new ModelRenderer(this);
		gun128.setRotationPoint(-2.0F, -39.2F, -0.5F);
		dustcoverVSS.addChild(gun128);
		setRotationAngle(gun128, -0.8378F, 0.0F, 0.0F);
		gun128.cubeList.add(new ModelBox(gun128, 188, 154, 0.5111F, -2.7829F, -4.8623F, 1, 1, 1, -0.2F, false));

		gun130 = new ModelRenderer(this);
		gun130.setRotationPoint(-2.5F, -39.0F, -0.3F);
		dustcoverVSS.addChild(gun130);
		setRotationAngle(gun130, -0.8378F, 0.0F, 0.0F);
		gun130.cubeList.add(new ModelBox(gun130, 180, 24, 0.5111F, -2.6931F, -4.9448F, 2, 1, 1, -0.2F, false));

		gun129 = new ModelRenderer(this);
		gun129.setRotationPoint(-3.0F, -38.5F, 0.15F);
		dustcoverVSS.addChild(gun129);
		setRotationAngle(gun129, -0.8378F, 0.0F, 0.0F);
		

		gun130_r1 = new ModelRenderer(this);
		gun130_r1.setRotationPoint(1.9111F, -1.614F, -3.6875F);
		gun129.addChild(gun130_r1);
		setRotationAngle(gun130_r1, -0.3054F, 0.0F, 0.0F);
		gun130_r1.cubeList.add(new ModelBox(gun130_r1, 181, 162, -0.9F, -0.5F, -1.5F, 2, 1, 1, 0.0F, false));

		gun129_r1 = new ModelRenderer(this);
		gun129_r1.setRotationPoint(1.9111F, -1.6003F, -3.7152F);
		gun129.addChild(gun129_r1);
		setRotationAngle(gun129_r1, -0.3491F, 0.0F, 0.0F);
		gun129_r1.cubeList.add(new ModelBox(gun129_r1, 180, 19, -0.9F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

		gun126 = new ModelRenderer(this);
		gun126.setRotationPoint(0.3F, -37.0F, 0.5F);
		dustcoverVSS.addChild(gun126);
		setRotationAngle(gun126, 0.0F, 0.0F, 1.4128F);
		gun126.cubeList.add(new ModelBox(gun126, 180, 14, -5.2058F, -0.9909F, -1.7956F, 2, 1, 1, -0.2F, false));

		gun124 = new ModelRenderer(this);
		gun124.setRotationPoint(-3.3F, -37.0F, 0.5F);
		dustcoverVSS.addChild(gun124);
		gun124.cubeList.add(new ModelBox(gun124, 74, 176, 1.6361F, -5.2555F, -1.7956F, 2, 2, 1, -0.2F, false));
		gun124.cubeList.add(new ModelBox(gun124, 160, 154, 1.0111F, -5.2555F, -1.7956F, 2, 2, 1, -0.2F, false));

		gun125 = new ModelRenderer(this);
		gun125.setRotationPoint(-0.7F, -37.0F, 0.5F);
		dustcoverVSS.addChild(gun125);
		

		gun127 = new ModelRenderer(this);
		gun127.setRotationPoint(-3.3F, -37.0F, 0.5F);
		dustcoverVSS.addChild(gun127);
		setRotationAngle(gun127, 0.0F, 0.0F, 0.1745F);
		gun127.cubeList.add(new ModelBox(gun127, 52, 66, -0.0586F, -5.3738F, -1.7956F, 1, 2, 1, -0.2F, false));

		gun139 = new ModelRenderer(this);
		gun139.setRotationPoint(-3.75F, -36.4F, -8.55F);
		dustcoverVSS.addChild(gun139);
		setRotationAngle(gun139, -0.8179F, 0.0F, 0.0F);
		gun139.cubeList.add(new ModelBox(gun139, 179, 3, 0.7003F, -3.8759F, -4.6766F, 1, 1, 2, -0.3F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		dustcoverVSS.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}