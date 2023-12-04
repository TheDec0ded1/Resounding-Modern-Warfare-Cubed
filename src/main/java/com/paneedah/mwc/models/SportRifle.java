package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SportRifle extends ModelBase {
	private final ModelRenderer sportrifle;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer DustCover5_r2;
	private final ModelRenderer DustCover4_r2;
	private final ModelRenderer DustCover10_r4;
	private final ModelRenderer DustCover8_r3;
	private final ModelRenderer DustCover8_r4_r1;
	private final ModelRenderer DustCover10_r5;
	private final ModelRenderer bone11;
	private final ModelRenderer DustCover13_r3;
	private final ModelRenderer bone12;
	private final ModelRenderer DustCover9_r3;
	private final ModelRenderer DustCover9_r5_r1;
	private final ModelRenderer DustCover14_r4;
	private final ModelRenderer DustCover55_r5_r1;
	private final ModelRenderer DustCover14_r5;
	private final ModelRenderer bone13;
	private final ModelRenderer DustCover7_r2;
	private final ModelRenderer bone14;
	private final ModelRenderer DustCover8_r4;
	private final ModelRenderer bone15;
	private final ModelRenderer DustCover9_r4;
	private final ModelRenderer bone16;
	private final ModelRenderer DustCover10_r6;
	private final ModelRenderer bone17;
	private final ModelRenderer DustCover11_r2;
	private final ModelRenderer bone18;
	private final ModelRenderer DustCover12_r2;
	private final ModelRenderer bone19;
	private final ModelRenderer DustCover13_r4;
	private final ModelRenderer bone20;
	private final ModelRenderer DustCover14_r6;
	private final ModelRenderer rails5;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer rails6;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer rails7;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer gunparts2;

	public SportRifle() {
		textureWidth = 200;
		textureHeight = 200;

		sportrifle = new ModelRenderer(this);
		sportrifle.setRotationPoint(0.0F, 24.0F, 0.0F);
		sportrifle.cubeList.add(new ModelBox(sportrifle, 48, 120, -3.9314F, -34.7314F, -53.8F, 1, 2, 15, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 61, 133, -3.9314F, -33.7314F, -40.0F, 1, 1, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 48, 122, -0.0686F, -34.7314F, -53.8F, 1, 2, 15, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 62, 136, -0.2686F, -36.1314F, -36.2F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 62, 134, -3.7314F, -36.1314F, -36.2F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 61, 133, -3.9314F, -36.1314F, -39.8F, 1, 2, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 61, 135, -0.0686F, -36.1314F, -39.8F, 1, 2, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 62, 136, -0.2686F, -36.1314F, -40.6F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 62, 134, -3.7314F, -36.1314F, -40.6F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 61, 133, -3.7314F, -36.1314F, -42.4F, 1, 2, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 61, 135, -0.2686F, -36.1314F, -42.4F, 1, 2, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 62, 134, -3.7314F, -36.1314F, -43.2F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 62, 136, -0.2686F, -36.1314F, -43.2F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 62, 134, -3.7314F, -36.1314F, -44.0F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 62, 136, -0.2686F, -36.1314F, -44.0F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 62, 134, -3.7314F, -36.1314F, -44.8F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 62, 136, -0.2686F, -36.1314F, -44.8F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 62, 134, -3.7314F, -36.1314F, -45.6F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 62, 136, -0.2686F, -36.1314F, -45.6F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 62, 134, -3.7314F, -36.1314F, -46.4F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 62, 136, -0.2686F, -36.1314F, -46.4F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 62, 134, -3.7314F, -36.1314F, -47.2F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 62, 136, -0.2686F, -36.1314F, -47.2F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 62, 134, -3.7314F, -36.1314F, -48.0F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 62, 136, -0.2686F, -36.1314F, -48.0F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 62, 134, -3.7314F, -36.1314F, -48.8F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 62, 136, -0.2686F, -36.1314F, -48.8F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 61, 133, -3.7314F, -36.1314F, -50.6F, 1, 2, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 61, 135, -0.2686F, -36.1314F, -50.6F, 1, 2, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 62, 136, -0.2686F, -36.1314F, -51.4F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 62, 134, -3.7314F, -36.1314F, -51.4F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 61, 135, -0.2686F, -36.1314F, -53.2F, 1, 2, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 61, 133, -3.7314F, -36.1314F, -53.2F, 1, 2, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 61, 133, -3.9314F, -36.1314F, -53.8F, 1, 2, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 61, 135, -0.0686F, -36.1314F, -53.8F, 1, 2, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 61, 133, -3.9314F, -36.1314F, -38.0F, 1, 2, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 61, 135, -0.0686F, -36.1314F, -38.0F, 1, 2, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 62, 134, -3.9314F, -38.8314F, -41.7F, 1, 3, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 62, 136, -0.0686F, -38.8314F, -41.7F, 1, 3, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 50, 122, -3.9314F, -36.8314F, -53.7F, 1, 1, 13, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 50, 124, -0.0686F, -36.8314F, -53.7F, 1, 1, 13, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 58, 130, -3.9314F, -34.7314F, -40.2F, 1, 1, 5, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 58, 132, -0.0686F, -34.7314F, -40.2F, 1, 1, 5, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 45, 119, -0.0686F, -36.5314F, -53.2F, 1, 1, 18, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 45, 117, -3.9314F, -36.5314F, -53.2F, 1, 1, 18, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 61, 135, -0.0686F, -36.5314F, -53.8F, 1, 1, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 61, 133, -3.9314F, -36.5314F, -53.8F, 1, 1, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 50, 124, -0.0686F, -38.8314F, -53.7F, 1, 1, 13, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 50, 122, -3.9314F, -38.8314F, -53.7F, 1, 1, 13, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 61, 133, -0.0686F, -33.7314F, -40.0F, 1, 1, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 34, 34, -2.5F, -32.0F, -40.5F, 2, 1, 5, 0.0F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 72, 172, -2.299F, -34.1979F, -40.9867F, 3, 1, 6, 0.0F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 72, 172, -3.7F, -34.199F, -41.0051F, 3, 1, 6, 0.0F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 47, 119, -3.9314F, -34.7314F, -69.8F, 1, 2, 16, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 61, 133, -3.9314F, -33.7314F, -56.0F, 1, 1, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 47, 121, -0.0686F, -34.7314F, -69.8F, 1, 2, 16, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 61, 133, -3.8314F, -36.1314F, -55.8F, 1, 2, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 61, 135, -0.1686F, -36.1314F, -55.8F, 1, 2, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 62, 136, -0.2686F, -36.1314F, -56.6F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 62, 134, -3.7314F, -36.1314F, -56.6F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 61, 133, -3.7314F, -36.1314F, -58.4F, 1, 2, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 61, 135, -0.2686F, -36.1314F, -58.4F, 1, 2, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 62, 134, -3.7314F, -36.1314F, -59.2F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 62, 136, -0.2686F, -36.1314F, -59.2F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 62, 134, -3.7314F, -36.1314F, -60.0F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 62, 136, -0.2686F, -36.1314F, -60.0F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 62, 134, -3.7314F, -36.1314F, -60.8F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 62, 136, -0.2686F, -36.1314F, -60.8F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 62, 134, -3.7314F, -36.1314F, -61.6F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 62, 136, -0.2686F, -36.1314F, -61.6F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 62, 134, -3.7314F, -36.1314F, -62.4F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 62, 136, -0.2686F, -36.1314F, -62.4F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 62, 134, -3.7314F, -36.1314F, -63.2F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 62, 136, -0.2686F, -36.1314F, -63.2F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 62, 134, -3.7314F, -36.1314F, -64.0F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 62, 136, -0.2686F, -36.1314F, -64.0F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 62, 134, -3.7314F, -36.1314F, -64.8F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 62, 136, -0.2686F, -36.1314F, -64.8F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 61, 133, -3.7314F, -36.1314F, -66.6F, 1, 2, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 61, 135, -0.2686F, -36.1314F, -66.6F, 1, 2, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 62, 136, -0.2686F, -36.1314F, -67.4F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 62, 134, -3.7314F, -36.1314F, -67.4F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 61, 135, -0.2686F, -36.1314F, -69.2F, 1, 2, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 61, 133, -3.7314F, -36.1314F, -69.2F, 1, 2, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 61, 133, -3.9314F, -36.1314F, -69.8F, 1, 2, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 61, 135, -0.0686F, -36.1314F, -69.8F, 1, 2, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 58, 130, -3.9314F, -38.8314F, -57.7F, 1, 3, 5, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 58, 132, -0.0686F, -38.8314F, -57.7F, 1, 3, 5, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 50, 122, -3.9314F, -36.8314F, -69.7F, 1, 1, 13, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 50, 124, -0.0686F, -36.8314F, -69.7F, 1, 1, 13, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 62, 134, -3.9314F, -36.8314F, -69.8F, 1, 1, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 62, 136, -0.0686F, -36.8314F, -69.8F, 1, 1, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 61, 133, -3.9314F, -34.7314F, -56.2F, 1, 1, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 61, 135, -0.0686F, -34.7314F, -56.2F, 1, 1, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 48, 122, -0.0686F, -36.5314F, -69.2F, 1, 1, 15, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 48, 120, -3.9314F, -36.5314F, -69.2F, 1, 1, 15, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 61, 135, -0.0686F, -36.5314F, -69.8F, 1, 1, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 61, 133, -3.9314F, -36.5314F, -69.8F, 1, 1, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 53, 127, -0.0686F, -38.8314F, -66.7F, 1, 1, 10, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 53, 125, -3.9314F, -38.8314F, -66.7F, 1, 1, 10, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 61, 133, -0.0686F, -33.7314F, -56.0F, 1, 1, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 49, 4, -2.5F, -34.3486F, -54.001F, 2, 2, 1, 0.0F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 49, 4, -3.6297F, -37.962F, -54.001F, 2, 4, 1, 0.0F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 49, 4, -1.3703F, -37.962F, -54.001F, 2, 2, 1, 0.0F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 49, 4, -1.3703F, -35.962F, -54.001F, 3, 2, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.5F, -38.4304F, -53.501F);
		sportrifle.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 2.7053F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 49, 4, -1.7322F, -1.3246F, -0.5F, 2, 1, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.5F, -38.4304F, -53.501F);
		sportrifle.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 2.3562F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 49, 4, -1.5167F, -0.8975F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1.5F, -38.4304F, -53.501F);
		sportrifle.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 3.1416F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 49, 4, -1.0F, -0.855F, -0.5F, 2, 2, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.5F, -38.4304F, -53.501F);
		sportrifle.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -2.3562F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 49, 4, 0.5167F, -0.8975F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.5F, -38.4304F, -53.501F);
		sportrifle.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -2.7053F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 49, 4, -0.2678F, -1.3246F, -0.5F, 2, 1, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-3.2071F, -33.0557F, -53.501F);
		sportrifle.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 49, 4, 0.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-0.5F, -33.7628F, -53.501F);
		sportrifle.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 49, 4, 0.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-3.6297F, -33.962F, -53.501F);
		sportrifle.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -0.4363F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 49, 4, 0.0F, 0.0F, -0.5F, 2, 1, 1, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-0.2766F, -34.3846F, -53.501F);
		sportrifle.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, 0.4363F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 49, 4, -1.0F, 0.0F, -0.5F, 2, 1, 1, 0.0F, false));

		DustCover5_r2 = new ModelRenderer(this);
		DustCover5_r2.setRotationPoint(-2.2F, -32.599F, -37.5051F);
		sportrifle.addChild(DustCover5_r2);
		setRotationAngle(DustCover5_r2, -0.48F, 0.0F, 0.0F);
		DustCover5_r2.cubeList.add(new ModelBox(DustCover5_r2, 35, 120, -1.5F, -0.5F, -2.5F, 3, 1, 5, 0.0F, false));

		DustCover4_r2 = new ModelRenderer(this);
		DustCover4_r2.setRotationPoint(-0.799F, -32.5979F, -37.4867F);
		sportrifle.addChild(DustCover4_r2);
		setRotationAngle(DustCover4_r2, -0.48F, 0.0F, 0.0F);
		DustCover4_r2.cubeList.add(new ModelBox(DustCover4_r2, 56, 134, -1.5F, -0.5F, -2.5F, 3, 1, 5, 0.0F, false));

		DustCover10_r4 = new ModelRenderer(this);
		DustCover10_r4.setRotationPoint(-1.5F, -38.1072F, -52.883F);
		sportrifle.addChild(DustCover10_r4);
		setRotationAngle(DustCover10_r4, 2.618F, 0.0F, 0.0F);
		DustCover10_r4.cubeList.add(new ModelBox(DustCover10_r4, 62, 136, 1.4314F, -1.9696F, -1.4366F, 1, 3, 1, -0.3F, false));
		DustCover10_r4.cubeList.add(new ModelBox(DustCover10_r4, 62, 136, 1.4314F, -0.5696F, -0.3366F, 1, 1, 1, -0.3F, false));
		DustCover10_r4.cubeList.add(new ModelBox(DustCover10_r4, 62, 134, -2.4314F, -0.5696F, -0.3366F, 1, 1, 1, -0.3F, false));
		DustCover10_r4.cubeList.add(new ModelBox(DustCover10_r4, 62, 136, 1.4314F, -0.2696F, -0.6366F, 1, 1, 1, -0.3F, false));
		DustCover10_r4.cubeList.add(new ModelBox(DustCover10_r4, 62, 134, -2.4314F, -0.2696F, -0.6366F, 1, 1, 1, -0.3F, false));
		DustCover10_r4.cubeList.add(new ModelBox(DustCover10_r4, 62, 136, 1.4314F, -0.6696F, -0.6366F, 1, 1, 1, -0.3F, false));
		DustCover10_r4.cubeList.add(new ModelBox(DustCover10_r4, 62, 134, -2.4314F, -0.6696F, -0.6366F, 1, 1, 1, -0.3F, false));
		DustCover10_r4.cubeList.add(new ModelBox(DustCover10_r4, 62, 136, 1.4314F, -1.0696F, -0.6366F, 1, 1, 1, -0.3F, false));
		DustCover10_r4.cubeList.add(new ModelBox(DustCover10_r4, 62, 134, -2.4314F, -1.0696F, -0.6366F, 1, 1, 1, -0.3F, false));
		DustCover10_r4.cubeList.add(new ModelBox(DustCover10_r4, 62, 136, 1.4314F, -1.7696F, -1.0366F, 1, 2, 1, -0.3F, false));
		DustCover10_r4.cubeList.add(new ModelBox(DustCover10_r4, 62, 134, -2.4314F, -1.7696F, -1.0366F, 1, 2, 1, -0.3F, false));
		DustCover10_r4.cubeList.add(new ModelBox(DustCover10_r4, 62, 136, 1.4314F, -1.0696F, -1.0366F, 1, 2, 1, -0.3F, false));
		DustCover10_r4.cubeList.add(new ModelBox(DustCover10_r4, 62, 134, -2.4314F, -1.0696F, -1.0366F, 1, 2, 1, -0.3F, false));
		DustCover10_r4.cubeList.add(new ModelBox(DustCover10_r4, 62, 134, -2.4314F, -1.9696F, -1.4366F, 1, 3, 1, -0.3F, false));
		DustCover10_r4.cubeList.add(new ModelBox(DustCover10_r4, 62, 136, 1.4314F, -8.6695F, 10.1682F, 1, 3, 1, -0.3F, false));
		DustCover10_r4.cubeList.add(new ModelBox(DustCover10_r4, 62, 136, 1.4314F, -7.2695F, 11.2682F, 1, 1, 1, -0.3F, false));
		DustCover10_r4.cubeList.add(new ModelBox(DustCover10_r4, 62, 134, -2.4314F, -7.2695F, 11.2682F, 1, 1, 1, -0.3F, false));
		DustCover10_r4.cubeList.add(new ModelBox(DustCover10_r4, 62, 136, 1.4314F, -6.9695F, 10.9682F, 1, 1, 1, -0.3F, false));
		DustCover10_r4.cubeList.add(new ModelBox(DustCover10_r4, 62, 134, -2.4314F, -6.9695F, 10.9682F, 1, 1, 1, -0.3F, false));
		DustCover10_r4.cubeList.add(new ModelBox(DustCover10_r4, 62, 136, 1.4314F, -7.3695F, 10.9682F, 1, 1, 1, -0.3F, false));
		DustCover10_r4.cubeList.add(new ModelBox(DustCover10_r4, 62, 134, -2.4314F, -7.3695F, 10.9682F, 1, 1, 1, -0.3F, false));
		DustCover10_r4.cubeList.add(new ModelBox(DustCover10_r4, 62, 136, 1.4314F, -7.7695F, 10.9682F, 1, 1, 1, -0.3F, false));
		DustCover10_r4.cubeList.add(new ModelBox(DustCover10_r4, 62, 134, -2.4314F, -7.7695F, 10.9682F, 1, 1, 1, -0.3F, false));
		DustCover10_r4.cubeList.add(new ModelBox(DustCover10_r4, 62, 136, 1.4314F, -8.4695F, 10.5682F, 1, 2, 1, -0.3F, false));
		DustCover10_r4.cubeList.add(new ModelBox(DustCover10_r4, 62, 134, -2.4314F, -8.4695F, 10.5682F, 1, 2, 1, -0.3F, false));
		DustCover10_r4.cubeList.add(new ModelBox(DustCover10_r4, 62, 136, 1.4314F, -7.7695F, 10.5682F, 1, 2, 1, -0.3F, false));
		DustCover10_r4.cubeList.add(new ModelBox(DustCover10_r4, 62, 134, -2.4314F, -7.7695F, 10.5682F, 1, 2, 1, -0.3F, false));
		DustCover10_r4.cubeList.add(new ModelBox(DustCover10_r4, 62, 134, -2.4314F, -8.6695F, 10.1682F, 1, 3, 1, -0.3F, false));

		DustCover8_r3 = new ModelRenderer(this);
		DustCover8_r3.setRotationPoint(-1.5F, -38.1072F, -52.883F);
		sportrifle.addChild(DustCover8_r3);
		setRotationAngle(DustCover8_r3, -3.1416F, 0.0F, 0.0F);
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 62, 136, 1.4314F, -2.2758F, -0.183F, 1, 3, 1, -0.3F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 62, 134, -2.4314F, -2.2758F, -0.183F, 1, 3, 1, -0.3F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 60, 134, 1.4314F, -2.2759F, 12.517F, 1, 3, 3, -0.3F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 60, 132, -2.4314F, -2.2759F, 12.517F, 1, 3, 3, -0.3F, false));

		DustCover8_r4_r1 = new ModelRenderer(this);
		DustCover8_r4_r1.setRotationPoint(0.0F, -5.5831F, 8.8021F);
		DustCover8_r3.addChild(DustCover8_r4_r1);
		setRotationAngle(DustCover8_r4_r1, -0.6109F, 0.0F, 0.0F);
		DustCover8_r4_r1.cubeList.add(new ModelBox(DustCover8_r4_r1, 61, 135, 1.4314F, -1.5F, 7.0F, 1, 3, 2, -0.3F, false));
		DustCover8_r4_r1.cubeList.add(new ModelBox(DustCover8_r4_r1, 61, 133, -2.4314F, -1.5F, 7.0F, 1, 3, 2, -0.3F, false));

		DustCover10_r5 = new ModelRenderer(this);
		DustCover10_r5.setRotationPoint(-1.5F, -37.8252F, -41.5768F);
		sportrifle.addChild(DustCover10_r5);
		setRotationAngle(DustCover10_r5, -0.5236F, 0.0F, 0.0F);
		DustCover10_r5.cubeList.add(new ModelBox(DustCover10_r5, 62, 134, -2.4314F, 0.575F, 0.3F, 1, 1, 1, -0.3F, false));
		DustCover10_r5.cubeList.add(new ModelBox(DustCover10_r5, 62, 134, -2.4314F, 0.375F, 0.3F, 1, 1, 1, -0.3F, false));
		DustCover10_r5.cubeList.add(new ModelBox(DustCover10_r5, 62, 136, 1.4314F, 0.325F, 0.3F, 1, 1, 1, -0.3F, false));
		DustCover10_r5.cubeList.add(new ModelBox(DustCover10_r5, 62, 136, 1.4314F, 0.525F, 0.3F, 1, 1, 1, -0.3F, false));
		DustCover10_r5.cubeList.add(new ModelBox(DustCover10_r5, 62, 134, -2.4314F, -0.3F, -0.1F, 1, 2, 1, -0.3F, false));
		DustCover10_r5.cubeList.add(new ModelBox(DustCover10_r5, 62, 134, -2.4314F, -1.0F, -0.5F, 1, 3, 1, -0.3F, false));
		DustCover10_r5.cubeList.add(new ModelBox(DustCover10_r5, 62, 136, 1.4314F, -1.0F, -0.5F, 1, 3, 1, -0.3F, false));
		DustCover10_r5.cubeList.add(new ModelBox(DustCover10_r5, 62, 136, 1.4314F, -0.3F, -0.1F, 1, 2, 1, -0.3F, false));
		DustCover10_r5.cubeList.add(new ModelBox(DustCover10_r5, 62, 134, -2.4314F, 8.575F, -13.5564F, 1, 1, 1, -0.3F, false));
		DustCover10_r5.cubeList.add(new ModelBox(DustCover10_r5, 62, 134, -2.4314F, 8.375F, -13.5564F, 1, 1, 1, -0.3F, false));
		DustCover10_r5.cubeList.add(new ModelBox(DustCover10_r5, 62, 136, 1.4314F, 8.325F, -13.5564F, 1, 1, 1, -0.3F, false));
		DustCover10_r5.cubeList.add(new ModelBox(DustCover10_r5, 62, 136, 1.4314F, 8.525F, -13.5564F, 1, 1, 1, -0.3F, false));
		DustCover10_r5.cubeList.add(new ModelBox(DustCover10_r5, 62, 134, -2.4314F, 7.7F, -13.9564F, 1, 2, 1, -0.3F, false));
		DustCover10_r5.cubeList.add(new ModelBox(DustCover10_r5, 62, 134, -2.4314F, 7.0F, -14.3564F, 1, 3, 1, -0.3F, false));
		DustCover10_r5.cubeList.add(new ModelBox(DustCover10_r5, 62, 136, 1.4314F, 7.0F, -14.3564F, 1, 3, 1, -0.3F, false));
		DustCover10_r5.cubeList.add(new ModelBox(DustCover10_r5, 62, 136, 1.4314F, 7.7F, -13.9564F, 1, 2, 1, -0.3F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(-0.5F, -32.4F, -44.5F);
		sportrifle.addChild(bone11);
		

		DustCover13_r3 = new ModelRenderer(this);
		DustCover13_r3.setRotationPoint(0.0F, -0.4899F, 0.0F);
		bone11.addChild(DustCover13_r3);
		setRotationAngle(DustCover13_r3, 0.0F, 0.0F, -0.7854F);
		DustCover13_r3.cubeList.add(new ModelBox(DustCover13_r3, 38, 38, -0.8F, 0.0F, 3.9F, 2, 1, 1, -0.3F, false));
		DustCover13_r3.cubeList.add(new ModelBox(DustCover13_r3, 37, 37, -1.8F, 0.0F, 6.4F, 2, 1, 2, -0.3F, false));
		DustCover13_r3.cubeList.add(new ModelBox(DustCover13_r3, 37, 37, -0.8F, 0.0F, 5.0F, 2, 1, 2, -0.3F, false));
		DustCover13_r3.cubeList.add(new ModelBox(DustCover13_r3, 38, 38, -0.8F, 0.0F, 1.7F, 2, 1, 1, -0.3F, false));
		DustCover13_r3.cubeList.add(new ModelBox(DustCover13_r3, 38, 38, -0.8F, 0.0F, 2.8F, 2, 1, 1, -0.3F, false));
		DustCover13_r3.cubeList.add(new ModelBox(DustCover13_r3, 38, 38, -0.8F, 0.0F, -0.5F, 2, 1, 1, -0.3F, false));
		DustCover13_r3.cubeList.add(new ModelBox(DustCover13_r3, 38, 38, -0.8F, 0.0F, 0.6F, 2, 1, 1, -0.3F, false));
		DustCover13_r3.cubeList.add(new ModelBox(DustCover13_r3, 38, 38, -0.8F, 0.0F, -2.7F, 2, 1, 1, -0.3F, false));
		DustCover13_r3.cubeList.add(new ModelBox(DustCover13_r3, 38, 38, -0.8F, 0.0F, -1.6F, 2, 1, 1, -0.3F, false));
		DustCover13_r3.cubeList.add(new ModelBox(DustCover13_r3, 38, 38, -0.8F, 0.0F, -4.9F, 2, 1, 1, -0.3F, false));
		DustCover13_r3.cubeList.add(new ModelBox(DustCover13_r3, 38, 38, -0.8F, 0.0F, -3.8F, 2, 1, 1, -0.3F, false));
		DustCover13_r3.cubeList.add(new ModelBox(DustCover13_r3, 38, 38, -0.8F, 0.0F, -7.1F, 2, 1, 1, -0.3F, false));
		DustCover13_r3.cubeList.add(new ModelBox(DustCover13_r3, 38, 38, -0.8F, 0.0F, -6.0F, 2, 1, 1, -0.3F, false));
		DustCover13_r3.cubeList.add(new ModelBox(DustCover13_r3, 38, 38, -0.8F, 0.0F, -8.2F, 2, 1, 1, -0.3F, false));
		DustCover13_r3.cubeList.add(new ModelBox(DustCover13_r3, 38, 38, -0.8F, 0.0F, -9.3F, 2, 1, 1, -0.3F, false));
		DustCover13_r3.cubeList.add(new ModelBox(DustCover13_r3, 37, 37, 0.2F, 0.0F, -9.3F, 1, 1, 2, -0.3F, false));
		DustCover13_r3.cubeList.add(new ModelBox(DustCover13_r3, 37, 37, -1.0F, 0.0F, -9.3F, 1, 1, 2, -0.3F, false));
		DustCover13_r3.cubeList.add(new ModelBox(DustCover13_r3, 24, 24, 0.2F, 0.0F, -8.7F, 1, 1, 15, -0.3F, false));
		DustCover13_r3.cubeList.add(new ModelBox(DustCover13_r3, 22, 22, -1.0F, 0.0F, -8.7F, 1, 1, 17, -0.3F, false));
		DustCover13_r3.cubeList.add(new ModelBox(DustCover13_r3, 38, 38, -0.8F, 0.0F, -12.1F, 2, 1, 1, -0.3F, false));
		DustCover13_r3.cubeList.add(new ModelBox(DustCover13_r3, 38, 38, -0.8F, 0.0F, -11.0F, 2, 1, 1, -0.3F, false));
		DustCover13_r3.cubeList.add(new ModelBox(DustCover13_r3, 38, 38, -0.8F, 0.0F, -14.3F, 2, 1, 1, -0.3F, false));
		DustCover13_r3.cubeList.add(new ModelBox(DustCover13_r3, 38, 38, -0.8F, 0.0F, -13.2F, 2, 1, 1, -0.3F, false));
		DustCover13_r3.cubeList.add(new ModelBox(DustCover13_r3, 38, 38, -0.8F, 0.0F, -16.5F, 2, 1, 1, -0.3F, false));
		DustCover13_r3.cubeList.add(new ModelBox(DustCover13_r3, 38, 38, -0.8F, 0.0F, -15.4F, 2, 1, 1, -0.3F, false));
		DustCover13_r3.cubeList.add(new ModelBox(DustCover13_r3, 38, 38, -0.8F, 0.0F, -18.7F, 2, 1, 1, -0.3F, false));
		DustCover13_r3.cubeList.add(new ModelBox(DustCover13_r3, 38, 38, -0.8F, 0.0F, -17.6F, 2, 1, 1, -0.3F, false));
		DustCover13_r3.cubeList.add(new ModelBox(DustCover13_r3, 38, 38, -0.8F, 0.0F, -20.9F, 2, 1, 1, -0.3F, false));
		DustCover13_r3.cubeList.add(new ModelBox(DustCover13_r3, 38, 38, -0.8F, 0.0F, -19.8F, 2, 1, 1, -0.3F, false));
		DustCover13_r3.cubeList.add(new ModelBox(DustCover13_r3, 38, 38, -0.8F, 0.0F, -23.1F, 2, 1, 1, -0.3F, false));
		DustCover13_r3.cubeList.add(new ModelBox(DustCover13_r3, 38, 38, -0.8F, 0.0F, -22.0F, 2, 1, 1, -0.3F, false));
		DustCover13_r3.cubeList.add(new ModelBox(DustCover13_r3, 38, 38, -0.8F, 0.0F, -24.2F, 2, 1, 1, -0.3F, false));
		DustCover13_r3.cubeList.add(new ModelBox(DustCover13_r3, 38, 38, -0.8F, 0.0F, -25.3F, 2, 1, 1, -0.3F, false));
		DustCover13_r3.cubeList.add(new ModelBox(DustCover13_r3, 37, 37, 0.2F, 0.0F, -25.3F, 1, 1, 2, -0.3F, false));
		DustCover13_r3.cubeList.add(new ModelBox(DustCover13_r3, 37, 37, -1.0F, 0.0F, -25.3F, 1, 1, 2, -0.3F, false));
		DustCover13_r3.cubeList.add(new ModelBox(DustCover13_r3, 24, 24, 0.2F, 0.0F, -24.7F, 1, 1, 15, -0.3F, false));
		DustCover13_r3.cubeList.add(new ModelBox(DustCover13_r3, 24, 24, -1.0F, 0.0F, -24.7F, 1, 1, 15, -0.3F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(-7.2F, -32.4F, -44.5F);
		sportrifle.addChild(bone12);
		setRotationAngle(bone12, 0.0F, 0.0F, 1.5708F);
		

		DustCover9_r3 = new ModelRenderer(this);
		DustCover9_r3.setRotationPoint(19.8902F, 2.1934F, 0.1F);
		bone12.addChild(DustCover9_r3);
		setRotationAngle(DustCover9_r3, 0.0F, 0.0F, 0.7854F);
		DustCover9_r3.cubeList.add(new ModelBox(DustCover9_r3, 37, 37, -23.1744F, 13.6256F, -9.3F, 1, 1, 2, -0.3F, false));
		DustCover9_r3.cubeList.add(new ModelBox(DustCover9_r3, 26, 26, -23.1744F, 13.6256F, -9.2F, 1, 1, 13, -0.3F, false));
		DustCover9_r3.cubeList.add(new ModelBox(DustCover9_r3, 26, 26, -24.3744F, 13.6256F, -9.2F, 1, 1, 13, -0.3F, false));
		DustCover9_r3.cubeList.add(new ModelBox(DustCover9_r3, 37, 37, -24.3744F, 13.6256F, -9.3F, 1, 1, 2, -0.3F, false));
		DustCover9_r3.cubeList.add(new ModelBox(DustCover9_r3, 37, 37, -24.1744F, 13.6256F, -9.3F, 2, 1, 2, -0.3F, false));
		DustCover9_r3.cubeList.add(new ModelBox(DustCover9_r3, 37, 37, -24.1744F, 13.6256F, 1.8F, 2, 1, 2, -0.3F, false));
		DustCover9_r3.cubeList.add(new ModelBox(DustCover9_r3, 29, 29, -23.1744F, 13.6256F, -22.2F, 1, 1, 10, -0.3F, false));
		DustCover9_r3.cubeList.add(new ModelBox(DustCover9_r3, 37, 37, -24.1744F, 13.6256F, -22.8F, 2, 1, 2, -0.3F, false));
		DustCover9_r3.cubeList.add(new ModelBox(DustCover9_r3, 37, 37, -24.1744F, 13.6256F, -14.2F, 2, 1, 2, -0.3F, false));
		DustCover9_r3.cubeList.add(new ModelBox(DustCover9_r3, 35, 35, -24.1744F, 13.6256F, -13.3F, 2, 1, 4, -0.3F, false));
		DustCover9_r3.cubeList.add(new ModelBox(DustCover9_r3, 26, 26, -24.3744F, 13.6256F, -22.3F, 1, 1, 13, -0.3F, false));

		DustCover9_r5_r1 = new ModelRenderer(this);
		DustCover9_r5_r1.setRotationPoint(-22.9303F, 14.1256F, -22.2023F);
		DustCover9_r3.addChild(DustCover9_r5_r1);
		setRotationAngle(DustCover9_r5_r1, 0.0F, 0.48F, 0.0F);
		DustCover9_r5_r1.cubeList.add(new ModelBox(DustCover9_r5_r1, 38, 38, -0.1847F, -0.5F, -0.6452F, 1, 1, 1, -0.3F, false));
		DustCover9_r5_r1.cubeList.add(new ModelBox(DustCover9_r5_r1, 38, 38, -1.0F, -0.5F, -1.0F, 2, 1, 1, -0.3F, false));

		DustCover14_r4 = new ModelRenderer(this);
		DustCover14_r4.setRotationPoint(10.5201F, -7.4071F, 0.1F);
		bone12.addChild(DustCover14_r4);
		setRotationAngle(DustCover14_r4, 0.0F, 0.0F, -0.7854F);
		DustCover14_r4.cubeList.add(new ModelBox(DustCover14_r4, 37, 37, -13.1744F, -12.3744F, 1.8F, 2, 1, 2, -0.3F, false));
		DustCover14_r4.cubeList.add(new ModelBox(DustCover14_r4, 37, 37, -13.1744F, -12.3744F, -9.3F, 2, 1, 2, -0.3F, false));
		DustCover14_r4.cubeList.add(new ModelBox(DustCover14_r4, 37, 37, -12.1744F, -12.3744F, -9.3F, 1, 1, 2, -0.3F, false));
		DustCover14_r4.cubeList.add(new ModelBox(DustCover14_r4, 37, 37, -13.3744F, -12.3744F, -9.3F, 1, 1, 2, -0.3F, false));
		DustCover14_r4.cubeList.add(new ModelBox(DustCover14_r4, 26, 26, -12.1744F, -12.3744F, -9.2F, 1, 1, 13, -0.3F, false));
		DustCover14_r4.cubeList.add(new ModelBox(DustCover14_r4, 26, 26, -13.3744F, -12.3744F, -9.2F, 1, 1, 13, -0.3F, false));
		DustCover14_r4.cubeList.add(new ModelBox(DustCover14_r4, 37, 37, -13.1744F, -12.3744F, -14.2F, 2, 1, 2, -0.3F, false));
		DustCover14_r4.cubeList.add(new ModelBox(DustCover14_r4, 37, 37, -13.1744F, -12.3744F, -22.8F, 2, 1, 2, -0.3F, false));
		DustCover14_r4.cubeList.add(new ModelBox(DustCover14_r4, 29, 29, -12.1744F, -12.3744F, -22.2F, 1, 1, 10, -0.3F, false));
		DustCover14_r4.cubeList.add(new ModelBox(DustCover14_r4, 26, 26, -13.3744F, -12.3744F, -22.3F, 1, 1, 13, -0.3F, false));
		DustCover14_r4.cubeList.add(new ModelBox(DustCover14_r4, 35, 35, -13.1744F, -12.3744F, -13.3F, 2, 1, 4, -0.3F, false));

		DustCover55_r5_r1 = new ModelRenderer(this);
		DustCover55_r5_r1.setRotationPoint(-11.9303F, -11.8744F, -22.2023F);
		DustCover14_r4.addChild(DustCover55_r5_r1);
		setRotationAngle(DustCover55_r5_r1, 0.0F, 0.48F, 0.0F);
		DustCover55_r5_r1.cubeList.add(new ModelBox(DustCover55_r5_r1, 38, 38, -0.1847F, -0.5F, -0.6452F, 1, 1, 1, -0.3F, false));
		DustCover55_r5_r1.cubeList.add(new ModelBox(DustCover55_r5_r1, 38, 38, -1.0F, -0.5F, -1.0F, 2, 1, 1, -0.3F, false));

		DustCover14_r5 = new ModelRenderer(this);
		DustCover14_r5.setRotationPoint(-0.1314F, -4.5586F, 0.0F);
		bone12.addChild(DustCover14_r5);
		setRotationAngle(DustCover14_r5, 0.0F, 0.0F, -0.7854F);
		DustCover14_r5.cubeList.add(new ModelBox(DustCover14_r5, 38, 38, -1.1536F, -0.3536F, 3.9F, 2, 1, 1, -0.3F, false));
		DustCover14_r5.cubeList.add(new ModelBox(DustCover14_r5, 37, 37, -0.2536F, -0.3536F, 6.4F, 2, 1, 2, -0.3F, false));
		DustCover14_r5.cubeList.add(new ModelBox(DustCover14_r5, 37, 37, -1.1536F, -0.3536F, 5.0F, 2, 1, 2, -0.3F, false));
		DustCover14_r5.cubeList.add(new ModelBox(DustCover14_r5, 38, 38, -1.1536F, -0.3536F, 1.7F, 2, 1, 1, -0.3F, false));
		DustCover14_r5.cubeList.add(new ModelBox(DustCover14_r5, 38, 38, -1.1536F, -0.3536F, 2.8F, 2, 1, 1, -0.3F, false));
		DustCover14_r5.cubeList.add(new ModelBox(DustCover14_r5, 38, 38, -1.1536F, -0.3536F, -0.5F, 2, 1, 1, -0.3F, false));
		DustCover14_r5.cubeList.add(new ModelBox(DustCover14_r5, 38, 38, -1.1536F, -0.3536F, 0.6F, 2, 1, 1, -0.3F, false));
		DustCover14_r5.cubeList.add(new ModelBox(DustCover14_r5, 38, 38, -1.1536F, -0.3536F, -2.7F, 2, 1, 1, -0.3F, false));
		DustCover14_r5.cubeList.add(new ModelBox(DustCover14_r5, 38, 38, -1.1536F, -0.3536F, -1.6F, 2, 1, 1, -0.3F, false));
		DustCover14_r5.cubeList.add(new ModelBox(DustCover14_r5, 38, 38, -1.1536F, -0.3536F, -4.9F, 2, 1, 1, -0.3F, false));
		DustCover14_r5.cubeList.add(new ModelBox(DustCover14_r5, 38, 38, -1.1536F, -0.3536F, -3.8F, 2, 1, 1, -0.3F, false));
		DustCover14_r5.cubeList.add(new ModelBox(DustCover14_r5, 38, 38, -1.1536F, -0.3536F, -7.1F, 2, 1, 1, -0.3F, false));
		DustCover14_r5.cubeList.add(new ModelBox(DustCover14_r5, 38, 38, -1.1536F, -0.3536F, -6.0F, 2, 1, 1, -0.3F, false));
		DustCover14_r5.cubeList.add(new ModelBox(DustCover14_r5, 38, 38, -1.1536F, -0.3536F, -8.2F, 2, 1, 1, -0.3F, false));
		DustCover14_r5.cubeList.add(new ModelBox(DustCover14_r5, 38, 38, -1.1536F, -0.3536F, -9.3F, 2, 1, 1, -0.3F, false));
		DustCover14_r5.cubeList.add(new ModelBox(DustCover14_r5, 37, 37, -0.1536F, -0.3536F, -9.3F, 1, 1, 2, -0.3F, false));
		DustCover14_r5.cubeList.add(new ModelBox(DustCover14_r5, 37, 37, -1.3536F, -0.3536F, -9.3F, 1, 1, 2, -0.3F, false));
		DustCover14_r5.cubeList.add(new ModelBox(DustCover14_r5, 23, 23, -0.1536F, -0.3536F, -8.7F, 1, 1, 16, -0.3F, false));
		DustCover14_r5.cubeList.add(new ModelBox(DustCover14_r5, 24, 24, -1.3536F, -0.3536F, -8.7F, 1, 1, 15, -0.3F, false));
		DustCover14_r5.cubeList.add(new ModelBox(DustCover14_r5, 38, 38, -1.1536F, -0.3536F, -12.1F, 2, 1, 1, -0.3F, false));
		DustCover14_r5.cubeList.add(new ModelBox(DustCover14_r5, 38, 38, -1.1536F, -0.3536F, -11.0F, 2, 1, 1, -0.3F, false));
		DustCover14_r5.cubeList.add(new ModelBox(DustCover14_r5, 38, 38, -1.1536F, -0.3536F, -14.3F, 2, 1, 1, -0.3F, false));
		DustCover14_r5.cubeList.add(new ModelBox(DustCover14_r5, 38, 38, -1.1536F, -0.3536F, -13.2F, 2, 1, 1, -0.3F, false));
		DustCover14_r5.cubeList.add(new ModelBox(DustCover14_r5, 38, 38, -1.1536F, -0.3536F, -16.5F, 2, 1, 1, -0.3F, false));
		DustCover14_r5.cubeList.add(new ModelBox(DustCover14_r5, 38, 38, -1.1536F, -0.3536F, -15.4F, 2, 1, 1, -0.3F, false));
		DustCover14_r5.cubeList.add(new ModelBox(DustCover14_r5, 38, 38, -1.1536F, -0.3536F, -18.7F, 2, 1, 1, -0.3F, false));
		DustCover14_r5.cubeList.add(new ModelBox(DustCover14_r5, 38, 38, -1.1536F, -0.3536F, -17.6F, 2, 1, 1, -0.3F, false));
		DustCover14_r5.cubeList.add(new ModelBox(DustCover14_r5, 38, 38, -1.1536F, -0.3536F, -20.9F, 2, 1, 1, -0.3F, false));
		DustCover14_r5.cubeList.add(new ModelBox(DustCover14_r5, 38, 38, -1.1536F, -0.3536F, -19.8F, 2, 1, 1, -0.3F, false));
		DustCover14_r5.cubeList.add(new ModelBox(DustCover14_r5, 38, 38, -1.1536F, -0.3536F, -23.1F, 2, 1, 1, -0.3F, false));
		DustCover14_r5.cubeList.add(new ModelBox(DustCover14_r5, 38, 38, -1.1536F, -0.3536F, -22.0F, 2, 1, 1, -0.3F, false));
		DustCover14_r5.cubeList.add(new ModelBox(DustCover14_r5, 38, 38, -1.1536F, -0.3536F, -24.2F, 2, 1, 1, -0.3F, false));
		DustCover14_r5.cubeList.add(new ModelBox(DustCover14_r5, 38, 38, -1.1536F, -0.3536F, -25.3F, 2, 1, 1, -0.3F, false));
		DustCover14_r5.cubeList.add(new ModelBox(DustCover14_r5, 37, 37, -0.1536F, -0.3536F, -25.3F, 1, 1, 2, -0.3F, false));
		DustCover14_r5.cubeList.add(new ModelBox(DustCover14_r5, 37, 37, -1.3536F, -0.3536F, -25.3F, 1, 1, 2, -0.3F, false));
		DustCover14_r5.cubeList.add(new ModelBox(DustCover14_r5, 24, 24, -0.1536F, -0.3536F, -24.7F, 1, 1, 15, -0.3F, false));
		DustCover14_r5.cubeList.add(new ModelBox(DustCover14_r5, 24, 24, -1.3536F, -0.3536F, -24.7F, 1, 1, 15, -0.3F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(-1.5F, -36.8252F, -42.7768F);
		sportrifle.addChild(bone13);
		

		DustCover7_r2 = new ModelRenderer(this);
		DustCover7_r2.setRotationPoint(0.0F, -1.0F, 0.0F);
		bone13.addChild(DustCover7_r2);
		setRotationAngle(DustCover7_r2, -0.5236F, 0.0F, 0.0F);
		DustCover7_r2.cubeList.add(new ModelBox(DustCover7_r2, 62, 134, -2.4314F, -1.0F, -0.5F, 1, 3, 1, -0.3F, false));
		DustCover7_r2.cubeList.add(new ModelBox(DustCover7_r2, 62, 136, 1.4314F, -1.0F, -0.5F, 1, 3, 1, -0.3F, false));
		DustCover7_r2.cubeList.add(new ModelBox(DustCover7_r2, 62, 134, -2.4314F, 7.0F, -14.3564F, 1, 3, 1, -0.3F, false));
		DustCover7_r2.cubeList.add(new ModelBox(DustCover7_r2, 62, 136, 1.4314F, 7.0F, -14.3564F, 1, 3, 1, -0.3F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(-1.5F, -36.8252F, -43.8768F);
		sportrifle.addChild(bone14);
		

		DustCover8_r4 = new ModelRenderer(this);
		DustCover8_r4.setRotationPoint(0.0F, -1.0F, 0.0F);
		bone14.addChild(DustCover8_r4);
		setRotationAngle(DustCover8_r4, -0.5236F, 0.0F, 0.0F);
		DustCover8_r4.cubeList.add(new ModelBox(DustCover8_r4, 62, 134, -2.4314F, -1.0F, -0.5F, 1, 3, 1, -0.3F, false));
		DustCover8_r4.cubeList.add(new ModelBox(DustCover8_r4, 62, 136, 1.4314F, -1.0F, -0.5F, 1, 3, 1, -0.3F, false));
		DustCover8_r4.cubeList.add(new ModelBox(DustCover8_r4, 62, 134, -2.4314F, 7.0F, -14.3564F, 1, 3, 1, -0.3F, false));
		DustCover8_r4.cubeList.add(new ModelBox(DustCover8_r4, 62, 136, 1.4314F, 7.0F, -14.3564F, 1, 3, 1, -0.3F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(-1.5F, -36.8252F, -45.0768F);
		sportrifle.addChild(bone15);
		

		DustCover9_r4 = new ModelRenderer(this);
		DustCover9_r4.setRotationPoint(0.0F, -1.0F, 0.0F);
		bone15.addChild(DustCover9_r4);
		setRotationAngle(DustCover9_r4, -0.5236F, 0.0F, 0.0F);
		DustCover9_r4.cubeList.add(new ModelBox(DustCover9_r4, 62, 134, -2.4314F, -1.0F, -0.5F, 1, 3, 1, -0.3F, false));
		DustCover9_r4.cubeList.add(new ModelBox(DustCover9_r4, 62, 136, 1.4314F, -1.0F, -0.5F, 1, 3, 1, -0.3F, false));
		DustCover9_r4.cubeList.add(new ModelBox(DustCover9_r4, 62, 134, -2.4314F, 7.0F, -14.3564F, 1, 3, 1, -0.3F, false));
		DustCover9_r4.cubeList.add(new ModelBox(DustCover9_r4, 62, 136, 1.4314F, 7.0F, -14.3564F, 1, 3, 1, -0.3F, false));

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(-1.5F, -36.8252F, -46.2768F);
		sportrifle.addChild(bone16);
		

		DustCover10_r6 = new ModelRenderer(this);
		DustCover10_r6.setRotationPoint(0.0F, -1.0F, 0.0F);
		bone16.addChild(DustCover10_r6);
		setRotationAngle(DustCover10_r6, -0.5236F, 0.0F, 0.0F);
		DustCover10_r6.cubeList.add(new ModelBox(DustCover10_r6, 62, 134, -2.4314F, -1.0F, -0.5F, 1, 3, 1, -0.3F, false));
		DustCover10_r6.cubeList.add(new ModelBox(DustCover10_r6, 62, 136, 1.4314F, -1.0F, -0.5F, 1, 3, 1, -0.3F, false));
		DustCover10_r6.cubeList.add(new ModelBox(DustCover10_r6, 62, 134, -2.4314F, 7.0F, -14.3564F, 1, 3, 1, -0.3F, false));
		DustCover10_r6.cubeList.add(new ModelBox(DustCover10_r6, 62, 136, 1.4314F, 7.0F, -14.3564F, 1, 3, 1, -0.3F, false));

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(-1.5F, -36.8252F, -47.5268F);
		sportrifle.addChild(bone17);
		

		DustCover11_r2 = new ModelRenderer(this);
		DustCover11_r2.setRotationPoint(0.0F, -1.0F, 0.0F);
		bone17.addChild(DustCover11_r2);
		setRotationAngle(DustCover11_r2, -0.5236F, 0.0F, 0.0F);
		DustCover11_r2.cubeList.add(new ModelBox(DustCover11_r2, 62, 134, -2.4314F, -1.0F, -0.5F, 1, 3, 1, -0.3F, false));
		DustCover11_r2.cubeList.add(new ModelBox(DustCover11_r2, 62, 136, 1.4314F, -1.0F, -0.5F, 1, 3, 1, -0.3F, false));
		DustCover11_r2.cubeList.add(new ModelBox(DustCover11_r2, 62, 134, -2.4314F, 7.0F, -14.3564F, 1, 3, 1, -0.3F, false));
		DustCover11_r2.cubeList.add(new ModelBox(DustCover11_r2, 62, 136, 1.4314F, 7.0F, -14.3564F, 1, 3, 1, -0.3F, false));

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(-1.5F, -36.8252F, -48.8268F);
		sportrifle.addChild(bone18);
		

		DustCover12_r2 = new ModelRenderer(this);
		DustCover12_r2.setRotationPoint(0.0F, -1.0F, 0.0F);
		bone18.addChild(DustCover12_r2);
		setRotationAngle(DustCover12_r2, -0.5236F, 0.0F, 0.0F);
		DustCover12_r2.cubeList.add(new ModelBox(DustCover12_r2, 62, 134, -2.4314F, -1.0F, -0.5F, 1, 3, 1, -0.3F, false));
		DustCover12_r2.cubeList.add(new ModelBox(DustCover12_r2, 62, 136, 1.4314F, -1.0F, -0.5F, 1, 3, 1, -0.3F, false));

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(-1.5F, -36.8252F, -50.2268F);
		sportrifle.addChild(bone19);
		

		DustCover13_r4 = new ModelRenderer(this);
		DustCover13_r4.setRotationPoint(0.0F, -1.0F, 0.0F);
		bone19.addChild(DustCover13_r4);
		setRotationAngle(DustCover13_r4, -0.5236F, 0.0F, 0.0F);
		DustCover13_r4.cubeList.add(new ModelBox(DustCover13_r4, 62, 134, -2.4314F, -1.0F, -0.5F, 1, 3, 1, -0.3F, false));
		DustCover13_r4.cubeList.add(new ModelBox(DustCover13_r4, 62, 136, 1.4314F, -1.0F, -0.5F, 1, 3, 1, -0.3F, false));

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(-1.5F, -36.8252F, -51.5268F);
		sportrifle.addChild(bone20);
		

		DustCover14_r6 = new ModelRenderer(this);
		DustCover14_r6.setRotationPoint(0.0F, -1.0F, 0.0F);
		bone20.addChild(DustCover14_r6);
		setRotationAngle(DustCover14_r6, -0.5236F, 0.0F, 0.0F);
		DustCover14_r6.cubeList.add(new ModelBox(DustCover14_r6, 62, 134, -2.4314F, -1.0F, -0.5F, 1, 3, 1, -0.3F, false));
		DustCover14_r6.cubeList.add(new ModelBox(DustCover14_r6, 62, 136, 1.4314F, -1.0F, -0.5F, 1, 3, 1, -0.3F, false));
		DustCover14_r6.cubeList.add(new ModelBox(DustCover14_r6, 62, 134, -2.4314F, 5.7F, -12.1047F, 1, 3, 1, -0.3F, false));
		DustCover14_r6.cubeList.add(new ModelBox(DustCover14_r6, 62, 136, 1.4314F, 5.7F, -12.1047F, 1, 3, 1, -0.3F, false));

		rails5 = new ModelRenderer(this);
		rails5.setRotationPoint(-1.5F, -30.9743F, -50.8005F);
		sportrifle.addChild(rails5);
		setRotationAngle(rails5, 3.1416F, 0.0F, 0.0F);
		rails5.cubeList.add(new ModelBox(rails5, 62, 83, 0.0F, -0.2007F, 0.7005F, 1, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 68, 83, 0.0F, -0.2007F, 1.9005F, 1, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 62, 83, -1.0F, -0.1993F, 0.6995F, 1, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 68, 83, -1.0F, -0.1993F, 1.8995F, 1, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 62, 83, 0.0F, -0.2007F, -4.0995F, 1, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 68, 83, 0.0F, -0.2007F, -2.8995F, 1, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 53, 83, 0.0F, -0.2007F, -1.6995F, 1, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 97, 63, 0.0F, -0.2007F, -0.4995F, 1, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 62, 83, -1.0F, -0.1993F, -4.1005F, 1, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 68, 83, -1.0F, -0.1993F, -2.9005F, 1, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 53, 83, -1.0F, -0.1993F, -1.7005F, 1, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 97, 63, -1.0F, -0.1993F, -0.5005F, 1, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 62, 83, 0.0F, -0.2007F, -8.8995F, 1, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 68, 83, 0.0F, -0.2007F, -7.6995F, 1, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 53, 83, 0.0F, -0.2007F, -6.4995F, 1, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 97, 63, 0.0F, -0.2007F, -5.2995F, 1, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 62, 83, -1.0F, -0.1993F, -8.9005F, 1, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 68, 83, -1.0F, -0.1993F, -7.7005F, 1, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 53, 83, -1.0F, -0.1993F, -6.5005F, 1, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 97, 63, -1.0F, -0.1993F, -5.3005F, 1, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 97, 63, 0.0F, -0.2007F, -10.0995F, 1, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 97, 63, -1.0F, -0.1993F, -10.1005F, 1, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 21, 21, -1.0F, 0.3743F, -15.2995F, 2, 1, 18, 0.0F, false));
		rails5.cubeList.add(new ModelBox(rails5, 62, 83, 0.0F, -0.2006F, 16.7005F, 1, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 68, 83, 0.0F, -0.2006F, 17.9005F, 1, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 62, 83, -1.0F, -0.1992F, 16.6995F, 1, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 68, 83, -1.0F, -0.1992F, 17.8995F, 1, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 62, 83, 0.0F, -0.2006F, 11.9005F, 1, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 68, 83, 0.0F, -0.2006F, 13.1005F, 1, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 53, 83, 0.0F, -0.2006F, 14.3005F, 1, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 97, 63, 0.0F, -0.2006F, 15.5005F, 1, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 62, 83, -1.0F, -0.1992F, 11.8995F, 1, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 68, 83, -1.0F, -0.1992F, 13.0995F, 1, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 53, 83, -1.0F, -0.1992F, 14.2995F, 1, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 97, 63, -1.0F, -0.1992F, 15.4995F, 1, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 62, 83, 0.0F, -0.2006F, 7.1005F, 1, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 68, 83, 0.0F, -0.2006F, 8.3005F, 1, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 53, 83, 0.0F, -0.2006F, 9.5005F, 1, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 97, 63, 0.0F, -0.2006F, 10.7005F, 1, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 62, 83, -1.0F, -0.1992F, 7.0995F, 1, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 68, 83, -1.0F, -0.1992F, 8.2995F, 1, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 53, 83, -1.0F, -0.1992F, 9.4995F, 1, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 97, 63, -1.0F, -0.1992F, 10.6995F, 1, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 97, 63, 0.0F, -0.2006F, 5.9005F, 1, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 97, 63, -1.0F, -0.1992F, 5.8995F, 1, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 97, 63, -1.0F, -0.1992F, 4.6995F, 1, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 97, 63, 0.0F, -0.2006F, 4.7005F, 1, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 97, 63, -1.0F, -0.1992F, 3.4995F, 1, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 97, 63, 0.0F, -0.2006F, 3.5005F, 1, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 24, 24, -1.0F, 0.3744F, 3.7005F, 2, 1, 15, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-0.8F, 24.0743F, -25.2495F);
		rails5.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 5, 59, 16.2236F, -17.2236F, 25.95F, 1, 1, 1, -0.201F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 5, 59, 16.2236F, -17.2236F, 27.15F, 1, 1, 1, -0.201F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 5, 59, 16.2236F, -17.2236F, 21.15F, 1, 1, 1, -0.201F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 5, 59, 16.2236F, -17.2236F, 22.35F, 1, 1, 1, -0.201F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 5, 59, 16.2236F, -17.2236F, 23.55F, 1, 1, 1, -0.201F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 5, 59, 16.2236F, -17.2236F, 24.75F, 1, 1, 1, -0.201F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 5, 59, 16.2236F, -17.2236F, 16.35F, 1, 1, 1, -0.201F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 5, 59, 16.2236F, -17.2236F, 17.55F, 1, 1, 1, -0.201F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 5, 59, 16.2236F, -17.2236F, 18.75F, 1, 1, 1, -0.201F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 5, 59, 16.2236F, -17.2236F, 19.95F, 1, 1, 1, -0.201F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 5, 59, 16.2236F, -17.2236F, 15.15F, 1, 1, 1, -0.201F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 5, 59, 16.2235F, -17.2235F, 41.95F, 1, 1, 1, -0.201F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 5, 59, 16.2235F, -17.2235F, 43.15F, 1, 1, 1, -0.201F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 5, 59, 16.2235F, -17.2235F, 37.15F, 1, 1, 1, -0.201F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 5, 59, 16.2235F, -17.2235F, 38.35F, 1, 1, 1, -0.201F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 5, 59, 16.2235F, -17.2235F, 39.55F, 1, 1, 1, -0.201F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 5, 59, 16.2235F, -17.2235F, 40.75F, 1, 1, 1, -0.201F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 5, 59, 16.2235F, -17.2235F, 32.35F, 1, 1, 1, -0.201F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 5, 59, 16.2235F, -17.2235F, 33.55F, 1, 1, 1, -0.201F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 5, 59, 16.2235F, -17.2235F, 34.75F, 1, 1, 1, -0.201F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 5, 59, 16.2235F, -17.2235F, 35.95F, 1, 1, 1, -0.201F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 5, 59, 16.2235F, -17.2235F, 31.15F, 1, 1, 1, -0.201F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 5, 59, 16.2235F, -17.2235F, 29.95F, 1, 1, 1, -0.201F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 5, 59, 16.2235F, -17.2235F, 28.75F, 1, 1, 1, -0.201F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.8F, 24.0743F, -21.9995F);
		rails5.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.7854F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 101, 64, 16.2236F, -17.2236F, 22.7F, 1, 1, 1, -0.201F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 101, 64, 16.2236F, -17.2236F, 23.9F, 1, 1, 1, -0.201F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 101, 64, 16.2236F, -17.2236F, 17.9F, 1, 1, 1, -0.201F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 101, 64, 16.2236F, -17.2236F, 19.1F, 1, 1, 1, -0.201F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 101, 64, 16.2236F, -17.2236F, 20.3F, 1, 1, 1, -0.201F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 101, 64, 16.2236F, -17.2236F, 21.5F, 1, 1, 1, -0.201F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 101, 64, 16.2236F, -17.2236F, 13.1F, 1, 1, 1, -0.201F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 101, 64, 16.2236F, -17.2236F, 14.3F, 1, 1, 1, -0.201F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 101, 64, 16.2236F, -17.2236F, 15.5F, 1, 1, 1, -0.201F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 101, 64, 16.2236F, -17.2236F, 16.7F, 1, 1, 1, -0.201F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 101, 64, 16.2236F, -17.2236F, 11.9F, 1, 1, 1, -0.201F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 101, 64, 16.2235F, -17.2235F, 38.7F, 1, 1, 1, -0.201F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 101, 64, 16.2235F, -17.2235F, 39.9F, 1, 1, 1, -0.201F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 101, 64, 16.2235F, -17.2235F, 33.9F, 1, 1, 1, -0.201F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 101, 64, 16.2235F, -17.2235F, 35.1F, 1, 1, 1, -0.201F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 101, 64, 16.2235F, -17.2235F, 36.3F, 1, 1, 1, -0.201F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 101, 64, 16.2235F, -17.2235F, 37.5F, 1, 1, 1, -0.201F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 101, 64, 16.2235F, -17.2235F, 29.1F, 1, 1, 1, -0.201F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 101, 64, 16.2235F, -17.2235F, 30.3F, 1, 1, 1, -0.201F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 101, 64, 16.2235F, -17.2235F, 31.5F, 1, 1, 1, -0.201F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 101, 64, 16.2235F, -17.2235F, 32.7F, 1, 1, 1, -0.201F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 101, 64, 16.2235F, -17.2235F, 27.9F, 1, 1, 1, -0.201F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 101, 64, 16.2235F, -17.2235F, 26.7F, 1, 1, 1, -0.201F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 101, 64, 16.2235F, -17.2235F, 25.5F, 1, 1, 1, -0.201F, false));

		rails6 = new ModelRenderer(this);
		rails6.setRotationPoint(-1.5F, -40.1993F, -47.0831F);
		sportrifle.addChild(rails6);
		rails6.cubeList.add(new ModelBox(rails6, 62, 83, 0.0F, -0.5257F, -0.3821F, 1, 1, 1, -0.2F, false));
		rails6.cubeList.add(new ModelBox(rails6, 68, 83, 0.0F, -0.5257F, 0.8179F, 1, 1, 1, -0.2F, false));
		rails6.cubeList.add(new ModelBox(rails6, 53, 83, 0.0F, -0.5257F, 2.0179F, 1, 1, 1, -0.2F, false));
		rails6.cubeList.add(new ModelBox(rails6, 95, 61, 0.0F, -0.5257F, 3.2179F, 1, 1, 3, -0.2F, false));
		rails6.cubeList.add(new ModelBox(rails6, 62, 83, -1.0F, -0.5243F, -0.3831F, 1, 1, 1, -0.2F, false));
		rails6.cubeList.add(new ModelBox(rails6, 68, 83, -1.0F, -0.5243F, 0.8169F, 1, 1, 1, -0.2F, false));
		rails6.cubeList.add(new ModelBox(rails6, 53, 83, -1.0F, -0.5243F, 2.0169F, 1, 1, 1, -0.2F, false));
		rails6.cubeList.add(new ModelBox(rails6, 95, 61, -1.0F, -0.5243F, 3.2169F, 1, 1, 3, -0.2F, false));
		rails6.cubeList.add(new ModelBox(rails6, 95, 61, -0.4F, -0.5243F, 3.2169F, 1, 1, 3, -0.2F, false));
		rails6.cubeList.add(new ModelBox(rails6, 154, 42, 0.0F, -0.5257F, -6.5321F, 1, 1, 6, -0.2F, false));
		rails6.cubeList.add(new ModelBox(rails6, 118, 42, -1.0F, -0.5243F, -6.5331F, 1, 1, 6, -0.2F, false));
		rails6.cubeList.add(new ModelBox(rails6, 137, 59, -0.5F, -0.5243F, -6.5331F, 1, 1, 6, -0.2F, false));
		rails6.cubeList.add(new ModelBox(rails6, 29, 27, -1.0F, 0.0493F, -6.3321F, 2, 1, 12, 0.0F, false));
		rails6.cubeList.add(new ModelBox(rails6, 50, 5, -1.0F, 0.0493F, 5.0929F, 2, 1, 1, 0.0F, false));
		rails6.cubeList.add(new ModelBox(rails6, 62, 83, 0.0F, -0.5257F, -16.3821F, 1, 1, 1, -0.2F, false));
		rails6.cubeList.add(new ModelBox(rails6, 68, 83, 0.0F, -0.5257F, -15.1821F, 1, 1, 1, -0.2F, false));
		rails6.cubeList.add(new ModelBox(rails6, 53, 83, 0.0F, -0.5257F, -13.9821F, 1, 1, 1, -0.2F, false));
		rails6.cubeList.add(new ModelBox(rails6, 95, 61, 0.0F, -0.5257F, -12.7821F, 1, 1, 3, -0.2F, false));
		rails6.cubeList.add(new ModelBox(rails6, 62, 83, -1.0F, -0.5243F, -16.3831F, 1, 1, 1, -0.2F, false));
		rails6.cubeList.add(new ModelBox(rails6, 68, 83, -1.0F, -0.5243F, -15.1831F, 1, 1, 1, -0.2F, false));
		rails6.cubeList.add(new ModelBox(rails6, 53, 83, -1.0F, -0.5243F, -13.9831F, 1, 1, 1, -0.2F, false));
		rails6.cubeList.add(new ModelBox(rails6, 95, 61, -1.0F, -0.5243F, -12.7831F, 1, 1, 3, -0.2F, false));
		rails6.cubeList.add(new ModelBox(rails6, 95, 61, -0.4F, -0.5243F, -12.7831F, 1, 1, 3, -0.2F, false));
		rails6.cubeList.add(new ModelBox(rails6, 157, 45, 0.0F, -0.5257F, -19.5321F, 1, 1, 3, -0.2F, false));
		rails6.cubeList.add(new ModelBox(rails6, 121, 45, -1.0F, -0.5243F, -19.5331F, 1, 1, 3, -0.2F, false));
		rails6.cubeList.add(new ModelBox(rails6, 140, 62, -0.5F, -0.5243F, -19.5331F, 1, 1, 3, -0.2F, false));
		rails6.cubeList.add(new ModelBox(rails6, 32, 30, -1.0F, 0.0493F, -19.3321F, 2, 1, 9, 0.0F, false));
		rails6.cubeList.add(new ModelBox(rails6, 50, 5, -1.0F, 0.0493F, -10.9071F, 2, 1, 1, 0.0F, false));
		rails6.cubeList.add(new ModelBox(rails6, 50, 5, -1.0F, 0.0493F, -7.9071F, 2, 1, 1, 0.0F, false));
		rails6.cubeList.add(new ModelBox(rails6, 97, 63, -1.0F, -0.5243F, -7.7081F, 1, 1, 1, -0.2F, false));
		rails6.cubeList.add(new ModelBox(rails6, 97, 63, -0.4F, -0.5243F, -7.7081F, 1, 1, 1, -0.2F, false));
		rails6.cubeList.add(new ModelBox(rails6, 97, 63, 0.0F, -0.5257F, -7.7071F, 1, 1, 1, -0.2F, false));
		rails6.cubeList.add(new ModelBox(rails6, 97, 63, 0.0F, -0.5257F, -8.1071F, 1, 1, 1, -0.2F, false));
		rails6.cubeList.add(new ModelBox(rails6, 97, 63, -0.4F, -0.5243F, -8.1081F, 1, 1, 1, -0.2F, false));
		rails6.cubeList.add(new ModelBox(rails6, 97, 63, -1.0F, -0.5243F, -8.1081F, 1, 1, 1, -0.2F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-0.8F, 23.7493F, -21.5321F);
		rails6.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.7854F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 5, 59, 16.2236F, -17.2236F, 21.15F, 1, 1, 1, -0.201F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 5, 59, 16.2236F, -17.2236F, 22.35F, 1, 1, 1, -0.201F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 5, 59, 16.2236F, -17.2236F, 23.55F, 1, 1, 1, -0.201F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 3, 57, 16.2236F, -17.2236F, 24.75F, 1, 1, 3, -0.201F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 54, 16.2236F, -17.2236F, 15.0F, 1, 1, 6, -0.201F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 5, 59, 16.2236F, -17.2236F, 5.15F, 1, 1, 1, -0.201F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 5, 59, 16.2236F, -17.2236F, 6.35F, 1, 1, 1, -0.201F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 5, 59, 16.2236F, -17.2236F, 7.55F, 1, 1, 1, -0.201F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 3, 57, 16.2236F, -17.2236F, 8.75F, 1, 1, 3, -0.201F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 5, 59, 16.2236F, -17.2236F, 13.825F, 1, 1, 1, -0.201F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 5, 59, 16.2236F, -17.2236F, 13.425F, 1, 1, 1, -0.201F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 3, 57, 16.2236F, -17.2236F, 2.0F, 1, 1, 3, -0.201F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.8F, 23.7493F, -18.2821F);
		rails6.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.7854F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 101, 64, 16.2236F, -17.2236F, 17.9F, 1, 1, 1, -0.201F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 101, 64, 16.2236F, -17.2236F, 19.1F, 1, 1, 1, -0.201F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 101, 64, 16.2236F, -17.2236F, 20.3F, 1, 1, 1, -0.201F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 99, 62, 16.2236F, -17.2236F, 21.5F, 1, 1, 3, -0.201F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 115, 53, 16.2236F, -17.2236F, 11.75F, 1, 1, 6, -0.201F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 101, 64, 16.2236F, -17.2236F, 1.9F, 1, 1, 1, -0.201F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 101, 64, 16.2236F, -17.2236F, 3.1F, 1, 1, 1, -0.201F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 101, 64, 16.2236F, -17.2236F, 4.3F, 1, 1, 1, -0.201F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 99, 62, 16.2236F, -17.2236F, 5.5F, 1, 1, 3, -0.201F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 101, 64, 16.2236F, -17.2236F, 10.575F, 1, 1, 1, -0.201F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 101, 64, 16.2236F, -17.2236F, 10.175F, 1, 1, 1, -0.201F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 118, 56, 16.2236F, -17.2236F, -1.25F, 1, 1, 3, -0.201F, false));

		rails7 = new ModelRenderer(this);
		rails7.setRotationPoint(0.9F, -34.4993F, -47.0831F);
		sportrifle.addChild(rails7);
		setRotationAngle(rails7, 3.1416F, 0.0F, -1.5708F);
		

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-0.8F, 23.7493F, -21.5321F);
		rails7.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -0.7854F);
		

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.8F, 23.7493F, -18.2821F);
		rails7.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.7854F);
		

		gunparts2 = new ModelRenderer(this);
		gunparts2.setRotationPoint(0.0F, 0.0F, 0.0F);
		sportrifle.addChild(gunparts2);
		gunparts2.cubeList.add(new ModelBox(gunparts2, 117, 70, -2.2F, -35.9F, -54.0F, 1, 1, 21, 0.0F, false));
		gunparts2.cubeList.add(new ModelBox(gunparts2, 118, 106, -2.0F, -36.0F, -54.0F, 1, 1, 21, 0.0F, false));
		gunparts2.cubeList.add(new ModelBox(gunparts2, 124, 128, -1.8F, -35.9F, -54.0F, 1, 1, 21, 0.0F, false));
		gunparts2.cubeList.add(new ModelBox(gunparts2, 0, 135, -1.7F, -35.7F, -54.0F, 1, 1, 21, 0.0F, false));
		gunparts2.cubeList.add(new ModelBox(gunparts2, 68, 135, -2.3F, -35.7F, -54.0F, 1, 1, 21, 0.0F, false));
		gunparts2.cubeList.add(new ModelBox(gunparts2, 91, 136, -2.2F, -35.5F, -54.0F, 1, 1, 21, 0.0F, false));
		gunparts2.cubeList.add(new ModelBox(gunparts2, 139, 27, -1.8F, -35.5F, -54.0F, 1, 1, 21, 0.0F, false));
		gunparts2.cubeList.add(new ModelBox(gunparts2, 23, 140, -2.0F, -35.4F, -54.0F, 1, 1, 21, 0.0F, false));
		gunparts2.cubeList.add(new ModelBox(gunparts2, 118, 115, -2.2F, -38.5F, -56.1F, 1, 1, 8, 0.0F, false));
		gunparts2.cubeList.add(new ModelBox(gunparts2, 118, 115, -2.2F, -38.5F, -49.0F, 1, 1, 8, 0.0F, false));
		gunparts2.cubeList.add(new ModelBox(gunparts2, 64, 120, -1.8F, -38.5F, -56.1F, 1, 1, 8, 0.0F, false));
		gunparts2.cubeList.add(new ModelBox(gunparts2, 64, 120, -1.8F, -38.5F, -49.0F, 1, 1, 8, 0.0F, false));
		gunparts2.cubeList.add(new ModelBox(gunparts2, 139, 27, -1.8F, -38.9F, -55.1F, 1, 1, 7, 0.0F, false));
		gunparts2.cubeList.add(new ModelBox(gunparts2, 139, 27, -1.8F, -38.9F, -48.0F, 1, 1, 7, 0.0F, false));
		gunparts2.cubeList.add(new ModelBox(gunparts2, 115, 53, -2.2F, -38.9F, -54.1F, 1, 1, 6, 0.0F, false));
		gunparts2.cubeList.add(new ModelBox(gunparts2, 115, 53, -2.2F, -38.9F, -47.0F, 1, 1, 6, 0.0F, false));
		gunparts2.cubeList.add(new ModelBox(gunparts2, 44, 126, -1.7F, -38.7F, -56.1F, 1, 1, 8, 0.0F, false));
		gunparts2.cubeList.add(new ModelBox(gunparts2, 44, 126, -1.7F, -38.7F, -49.0F, 1, 1, 8, 0.0F, false));
		gunparts2.cubeList.add(new ModelBox(gunparts2, 127, 93, -2.3F, -38.7F, -56.1F, 1, 1, 8, 0.0F, false));
		gunparts2.cubeList.add(new ModelBox(gunparts2, 127, 93, -2.3F, -38.7F, -49.0F, 1, 1, 8, 0.0F, false));
		gunparts2.cubeList.add(new ModelBox(gunparts2, 0, 135, -2.0F, -38.4F, -56.1F, 1, 1, 8, 0.0F, false));
		gunparts2.cubeList.add(new ModelBox(gunparts2, 0, 135, -2.0F, -38.4F, -49.0F, 1, 1, 8, 0.0F, false));
		gunparts2.cubeList.add(new ModelBox(gunparts2, 23, 135, -2.0F, -39.0F, -56.1F, 1, 1, 8, 0.0F, false));
		gunparts2.cubeList.add(new ModelBox(gunparts2, 23, 135, -2.0F, -39.0F, -49.0F, 1, 1, 8, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		sportrifle.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}