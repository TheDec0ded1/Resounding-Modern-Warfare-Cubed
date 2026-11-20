package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class VSSM_VintorezDustcover extends ModelBase {
	private final ModelRenderer vssm_dustcover;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r51_r1;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer gun2;
	private final ModelRenderer gun138_r1;
	private final ModelRenderer gun116;
	private final ModelRenderer gun165_r1;
	private final ModelRenderer bone50;
	private final ModelRenderer cube_r121;
	private final ModelRenderer cube_r122;

	public VSSM_VintorezDustcover() {
		textureWidth = 256;
		textureHeight = 256;

		vssm_dustcover = new ModelRenderer(this);
		vssm_dustcover.setRotationPoint(-0.5F, -14.15F, -27.7F);
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 89, 190, -1.499F, -0.799F, 2.001F, 1, 1, 25, -0.2F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 12, 109, -2.498F, 0.6F, 26.1F, 3, 3, 1, -0.2F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 0, 189, -2.098F, -0.8F, 2.0F, 1, 1, 25, -0.201F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 172, 122, -0.9F, -0.8F, 2.0F, 1, 1, 25, -0.201F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 171, 169, 0.0915F, 2.2615F, 1.999F, 1, 1, 26, -0.2F, false));
		vssm_dustcover.cubeList.add(new ModelBox(vssm_dustcover, 86, 42, -3.3244F, 2.8772F, 21.8745F, 1, 1, 5, -0.2F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-2.2F, 0.2F, 0.0F);
		vssm_dustcover.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, 0.2793F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 43, 97, -0.1776F, -0.5894F, 1.5F, 1, 1, 11, -0.203F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 76, 135, -0.1339F, -0.0204F, 26.6001F, 1, 1, 1, -0.201F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 52, 17, -0.1339F, 0.3796F, 26.6001F, 1, 2, 1, -0.202F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 40, -0.13F, 1.1473F, 21.1745F, 1, 2, 6, -0.2F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 129, 0, -0.13F, 1.7473F, 19.2745F, 1, 1, 3, -0.2F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 40, -0.129F, -0.4556F, 11.999F, 1, 2, 15, -0.2F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 58, 100, -0.129F, 1.1444F, 12.299F, 1, 1, 10, -0.2F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 172, 82, -0.131F, -1.0536F, 2.001F, 1, 1, 25, -0.202F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.2F, 0.2F, 0.0F);
		vssm_dustcover.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, -0.2793F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 144, 165, -0.8691F, -1.051F, 1.999F, 1, 4, 25, -0.2F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 52, 0, -0.8661F, -0.0204F, 26.6001F, 1, 2, 1, -0.201F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 11, 18, -0.8651F, 0.9516F, 26.6011F, 1, 2, 1, -0.202F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.2F, 0.2F, 0.0F);
		vssm_dustcover.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.5236F, 0.0F, -0.2793F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 162, 35, -0.8661F, 13.0595F, 22.8371F, 1, 1, 1, -0.203F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 162, 27, -0.8661F, 12.4595F, 22.8371F, 1, 1, 1, -0.203F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-2.2F, 0.2F, 0.0F);
		vssm_dustcover.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.5236F, 0.0F, 0.2793F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 120, 162, -0.1339F, 12.4595F, 22.8371F, 1, 1, 1, -0.203F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 161, 148, -0.1339F, 13.0595F, 22.8371F, 1, 1, 1, -0.203F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-2.2F, 0.2F, -1.0F);
		vssm_dustcover.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.4712F, 0.0F, 0.2793F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 11, 0, -0.1349F, -11.1542F, 25.4949F, 1, 2, 1, -0.203F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-0.5F, 4.4F, 27.0F);
		vssm_dustcover.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.2269F, 0.0F, 0.0F);
		

		cube_r51_r1 = new ModelRenderer(this);
		cube_r51_r1.setRotationPoint(-0.498F, -2.1744F, 0.625F);
		cube_r20.addChild(cube_r51_r1);
		setRotationAngle(cube_r51_r1, -0.1745F, 0.0F, 0.0F);
		cube_r51_r1.cubeList.add(new ModelBox(cube_r51_r1, 54, 111, -0.5F, -1.5F, -0.5F, 1, 3, 1, -0.2F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-1.7F, -0.5F, 7.3F);
		vssm_dustcover.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, 0.8029F);
		

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-0.3F, -0.5F, 7.3F);
		vssm_dustcover.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, -0.8029F);
		

		gun2 = new ModelRenderer(this);
		gun2.setRotationPoint(-3.25F, 2.55F, 12.0F);
		vssm_dustcover.addChild(gun2);
		setRotationAngle(gun2, -0.0873F, 0.0F, 0.0F);
		

		gun138_r1 = new ModelRenderer(this);
		gun138_r1.setRotationPoint(0.8349F, -0.5723F, 7.2318F);
		gun2.addChild(gun138_r1);
		setRotationAngle(gun138_r1, -0.003F, -0.0226F, 0.2608F);
		gun138_r1.cubeList.add(new ModelBox(gun138_r1, 86, 153, -0.6528F, -0.6567F, 1.1637F, 1, 1, 1, -0.201F, false));
		gun138_r1.cubeList.add(new ModelBox(gun138_r1, 60, 59, -0.6528F, -0.6567F, -7.2363F, 1, 1, 9, -0.2F, false));

		gun116 = new ModelRenderer(this);
		gun116.setRotationPoint(-3.25F, 3.05F, 17.95F);
		vssm_dustcover.addChild(gun116);
		setRotationAngle(gun116, -0.8198F, -0.0596F, 0.0638F);
		

		gun165_r1 = new ModelRenderer(this);
		gun165_r1.setRotationPoint(0.8814F, -1.2523F, 0.496F);
		gun116.addChild(gun165_r1);
		setRotationAngle(gun165_r1, -0.0015F, -0.1914F, 0.179F);
		gun165_r1.cubeList.add(new ModelBox(gun165_r1, 43, 139, -0.5633F, -1.8466F, 0.9575F, 1, 1, 2, -0.2F, false));

		bone50 = new ModelRenderer(this);
		bone50.setRotationPoint(-0.9737F, -10.3131F, 14.8632F);
		vssm_dustcover.addChild(bone50);
		setRotationAngle(bone50, 0.0F, 0.0F, 0.0F);
		bone50.cubeList.add(new ModelBox(bone50, 152, 152, -0.0238F, 8.7368F, -5.6132F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 152, 147, -0.0238F, 8.7368F, -6.8132F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 149, 162, -0.0238F, 8.7368F, -4.3632F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 20, 163, -0.0238F, 8.7368F, -3.1132F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 0, 163, -0.0238F, 8.7368F, -1.8632F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 152, 141, -0.0238F, 8.7368F, -0.6132F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 138, 152, -0.0238F, 8.7368F, 0.6368F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 129, 152, -0.0238F, 8.7368F, 3.1368F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 101, 152, -0.0238F, 8.7368F, 1.8868F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 96, 152, -0.0238F, 8.7368F, 5.6368F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 152, 75, -0.0238F, 8.7368F, 4.3868F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 103, 30, -0.0238F, 8.7368F, 8.1368F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 67, 152, -0.0238F, 8.7368F, 6.8868F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 109, 67, -0.0238F, 8.7368F, 10.6368F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 161, 144, -0.0238F, 8.7368F, 11.0368F, 1, 1, 1, -0.198F, false));
		bone50.cubeList.add(new ModelBox(bone50, 94, 49, -0.0238F, 8.7368F, 9.3868F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 161, 82, -1.0213F, 8.7344F, 11.0378F, 1, 1, 1, -0.198F, false));
		bone50.cubeList.add(new ModelBox(bone50, 103, 72, -1.0213F, 8.7344F, 10.6378F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 94, 7, -1.0213F, 8.7344F, 9.3878F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 68, 97, -1.0213F, 8.7344F, 8.1378F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 150, 113, -1.0213F, 8.7344F, 6.8878F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 119, 150, -1.0213F, 8.7344F, 5.6378F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 134, 150, -1.0213F, 8.7344F, 4.3878F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 143, 150, -1.0213F, 8.7344F, 3.1378F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 148, 150, -1.0213F, 8.7344F, 1.8878F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 0, 151, -1.0213F, 8.7344F, -0.6122F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 5, 151, -1.0213F, 8.7344F, 0.6378F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 162, 151, -1.0213F, 8.7344F, -1.8622F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 5, 163, -1.0213F, 8.7344F, -3.1122F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 128, 162, -1.0213F, 8.7344F, -4.3622F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 151, 42, -1.0213F, 8.7344F, -5.6122F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 43, 151, -1.0213F, 8.7344F, -6.8122F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 150, 70, -1.0213F, 8.7344F, -9.2122F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 76, 150, -0.0238F, 8.7368F, -9.2132F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 86, 150, -0.0238F, 8.7368F, -8.0132F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 150, 102, -1.0213F, 8.7344F, -8.0122F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 150, 15, -1.0213F, 8.7344F, -11.6122F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 150, 23, -0.0238F, 8.7368F, -11.6132F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 129, 149, -1.0213F, 8.7344F, -12.8122F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 149, 134, -0.0238F, 8.7368F, -12.8132F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 150, 26, -0.0238F, 8.7368F, -10.4132F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 30, 150, -1.0213F, 8.7344F, -10.4122F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 172, 0, -0.9238F, 9.3368F, -13.1632F, 2, 1, 25, -0.001F, false));
		bone50.cubeList.add(new ModelBox(bone50, 172, 42, -1.1238F, 9.3368F, -13.1632F, 1, 1, 25, 0.0F, false));
		bone50.cubeList.add(new ModelBox(bone50, 152, 60, -0.0238F, 8.7368F, -13.3632F, 1, 1, 1, -0.199F, false));
		bone50.cubeList.add(new ModelBox(bone50, 95, 143, -1.0238F, 8.7368F, -13.3632F, 1, 1, 1, -0.199F, false));

		cube_r121 = new ModelRenderer(this);
		cube_r121.setRotationPoint(-14.7737F, -0.3632F, -12.4632F);
		bone50.addChild(cube_r121);
		setRotationAngle(cube_r121, 0.0F, 0.0F, 0.8901F);
		cube_r121.cubeList.add(new ModelBox(cube_r121, 48, 152, 15.8063F, -5.1883F, -0.9F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 52, 28, 15.8063F, -5.1883F, 21.85F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 53, 162, 15.8063F, -5.1883F, 23.5F, 1, 1, 1, -0.197F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 161, 138, 15.8063F, -5.1883F, 23.1F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 152, 34, 15.8063F, -5.1883F, 19.35F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 94, 25, 15.8063F, -5.1883F, 20.6F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 25, 152, 15.8063F, -5.1883F, 16.85F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 20, 152, 15.8063F, -5.1883F, 18.1F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 15, 152, 15.8063F, -5.1883F, 14.35F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 10, 152, 15.8063F, -5.1883F, 15.6F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 151, 144, 15.8063F, -5.1883F, 13.1F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 151, 130, 15.8063F, -5.1883F, 11.85F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 159, 162, 15.8063F, -5.1883F, 10.6F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 15, 163, 15.8063F, -5.1883F, 9.35F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 144, 162, 15.8378F, -5.2271F, 8.1F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 151, 127, 15.8378F, -5.2271F, 6.85F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 151, 122, 15.8378F, -5.2271F, 5.65F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 150, 63, 15.8063F, -5.1883F, 3.25F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 106, 150, 15.8063F, -5.1883F, 4.45F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 150, 12, 15.8063F, -5.1883F, 0.85F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 149, 107, 15.8063F, -5.1883F, -0.35F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 52, 150, 15.8063F, -5.1883F, 2.05F, 1, 1, 1, -0.198F, false));

		cube_r122 = new ModelRenderer(this);
		cube_r122.setRotationPoint(-13.1737F, -0.3632F, -12.4632F);
		bone50.addChild(cube_r122);
		setRotationAngle(cube_r122, 0.0F, 0.0F, -0.8901F);
		cube_r122.cubeList.add(new ModelBox(cube_r122, 111, 151, 0.7516F, 16.4939F, -0.9F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 52, 11, 0.7516F, 16.4939F, 21.85F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 41, 162, 0.7516F, 16.4939F, 23.5F, 1, 1, 1, -0.197F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 161, 128, 0.7516F, 16.4939F, 23.1F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 91, 151, 0.7516F, 16.4939F, 19.35F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 26, 91, 0.7516F, 16.4939F, 20.6F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 151, 66, 0.7516F, 16.4939F, 16.85F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 62, 151, 0.7516F, 16.4939F, 18.1F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 151, 57, 0.7516F, 16.4939F, 14.35F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 57, 151, 0.7516F, 16.4939F, 15.6F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 151, 54, 0.7516F, 16.4939F, 13.1F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 151, 51, 0.7516F, 16.4939F, 11.85F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 154, 162, 0.7516F, 16.4939F, 10.6F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 10, 163, 0.7516F, 16.4939F, 9.35F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 133, 162, 0.7516F, 16.4939F, 8.1F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 151, 48, 0.7516F, 16.4939F, 6.85F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 151, 45, 0.7516F, 16.4939F, 5.65F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 71, 150, 0.7516F, 16.4939F, 3.25F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 150, 96, 0.7516F, 16.4939F, 4.45F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 150, 18, 0.7516F, 16.4939F, 0.85F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 149, 138, 0.7516F, 16.4939F, -0.35F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 150, 29, 0.7516F, 16.4939F, 2.05F, 1, 1, 1, -0.198F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		vssm_dustcover.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}