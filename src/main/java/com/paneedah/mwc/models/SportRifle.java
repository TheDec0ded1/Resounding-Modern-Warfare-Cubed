package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SportRifle extends ModelBase {
	private final ModelRenderer sportrifle;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer DustCover5_r3;
	private final ModelRenderer DustCover4_r3;
	private final ModelRenderer DustCover10_r7;
	private final ModelRenderer DustCover8_r5;
	private final ModelRenderer DustCover8_r4_r2;
	private final ModelRenderer DustCover10_r8;
	private final ModelRenderer bone26;
	private final ModelRenderer DustCover13_r5;
	private final ModelRenderer bone27;
	private final ModelRenderer DustCover9_r5;
	private final ModelRenderer DustCover9_r5_r2;
	private final ModelRenderer DustCover14_r7;
	private final ModelRenderer DustCover55_r5_r2;
	private final ModelRenderer DustCover14_r8;
	private final ModelRenderer bone28;
	private final ModelRenderer DustCover7_r3;
	private final ModelRenderer bone29;
	private final ModelRenderer DustCover8_r6;
	private final ModelRenderer bone30;
	private final ModelRenderer DustCover9_r6;
	private final ModelRenderer bone31;
	private final ModelRenderer DustCover10_r9;
	private final ModelRenderer bone32;
	private final ModelRenderer DustCover11_r3;
	private final ModelRenderer bone33;
	private final ModelRenderer DustCover12_r3;
	private final ModelRenderer bone34;
	private final ModelRenderer DustCover13_r6;
	private final ModelRenderer bone35;
	private final ModelRenderer DustCover14_r9;
	private final ModelRenderer rails8;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer rails9;
	private final ModelRenderer cube_r33;
	private final ModelRenderer cube_r34;
	private final ModelRenderer rails10;
	private final ModelRenderer cube_r35;
	private final ModelRenderer cube_r36;
	private final ModelRenderer gunparts3;

	public SportRifle() {
		textureWidth = 256;
		textureHeight = 256;

		sportrifle = new ModelRenderer(this);
		sportrifle.setRotationPoint(0.0F, 24.0F, 0.0F);
		sportrifle.cubeList.add(new ModelBox(sportrifle, 104, 126, -3.9314F, -34.7314F, -53.8F, 1, 2, 15, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 134, 61, -3.9314F, -33.7314F, -40.0F, 1, 1, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 23, 108, -0.0686F, -34.7314F, -53.8F, 1, 2, 15, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 86, 158, -0.2686F, -36.1314F, -36.2F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 63, 158, -3.7314F, -36.1314F, -36.2F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 20, 100, -3.9314F, -36.1314F, -39.8F, 1, 2, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 6, 100, -0.0686F, -36.1314F, -39.8F, 1, 2, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 141, 157, -0.2686F, -36.1314F, -40.6F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 137, 157, -3.7314F, -36.1314F, -40.6F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 98, 32, -3.7314F, -36.1314F, -42.4F, 1, 2, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 97, 48, -0.2686F, -36.1314F, -42.4F, 1, 2, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 131, 157, -3.7314F, -36.1314F, -43.2F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 127, 157, -0.2686F, -36.1314F, -43.2F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 100, 157, -3.7314F, -36.1314F, -44.0F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 92, 157, -0.2686F, -36.1314F, -44.0F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 157, 79, -3.7314F, -36.1314F, -44.8F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 157, 76, -0.2686F, -36.1314F, -44.8F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 157, 70, -3.7314F, -36.1314F, -45.6F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 157, 67, -0.2686F, -36.1314F, -45.6F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 157, 57, -3.7314F, -36.1314F, -46.4F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 157, 54, -0.2686F, -36.1314F, -46.4F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 157, 48, -3.7314F, -36.1314F, -47.2F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 157, 45, -0.2686F, -36.1314F, -47.2F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 154, 156, -3.7314F, -36.1314F, -48.0F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 156, 33, -0.2686F, -36.1314F, -48.0F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 156, 23, -3.7314F, -36.1314F, -48.8F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 155, 150, -0.2686F, -36.1314F, -48.8F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 21, 94, -3.7314F, -36.1314F, -50.6F, 1, 2, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 53, 93, -0.2686F, -36.1314F, -50.6F, 1, 2, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 155, 127, -0.2686F, -36.1314F, -51.4F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 151, 59, -3.7314F, -36.1314F, -51.4F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 90, 32, -0.2686F, -36.1314F, -53.2F, 1, 2, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 89, 48, -3.7314F, -36.1314F, -53.2F, 1, 2, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 74, 86, -3.9314F, -36.1314F, -53.8F, 1, 2, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 74, 80, -0.0686F, -36.1314F, -53.8F, 1, 2, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 21, 80, -3.9314F, -36.1314F, -38.0F, 1, 2, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 72, 8, -0.0686F, -36.1314F, -38.0F, 1, 2, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 102, 12, -3.9314F, -38.8314F, -41.7F, 1, 3, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 14, 100, -0.0686F, -38.8314F, -41.7F, 1, 3, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 77, 210, -3.9314F, -36.8314F, -53.7F, 1, 1, 13, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 0, 210, -0.0686F, -36.8314F, -53.7F, 1, 1, 13, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 67, 80, -3.9314F, -34.7314F, -40.2F, 1, 1, 5, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 59, 32, -0.0686F, -34.7314F, -40.2F, 1, 1, 5, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 0, 19, -0.0686F, -36.5314F, -53.2F, 1, 1, 18, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 0, 0, -3.9314F, -36.5314F, -53.2F, 1, 1, 18, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 33, 134, -0.0686F, -36.5314F, -53.8F, 1, 1, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 23, 134, -3.9314F, -36.5314F, -53.8F, 1, 1, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 209, 204, -0.0686F, -38.8314F, -53.7F, 1, 1, 13, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 62, 209, -3.9314F, -38.8314F, -53.7F, 1, 1, 13, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 10, 134, -0.0686F, -33.7314F, -40.0F, 1, 1, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 63, 8, -2.5F, -32.0F, -40.5F, 2, 1, 5, 0.0F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 47, 32, -2.299F, -34.1979F, -40.9867F, 3, 1, 6, 0.0F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 0, 29, -3.7F, -34.199F, -41.0051F, 3, 1, 6, 0.0F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 90, 189, -3.9314F, -34.7314F, -69.8F, 1, 2, 16, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 86, 132, -3.9314F, -33.7314F, -56.0F, 1, 1, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 41, 40, -0.0686F, -34.7314F, -69.8F, 1, 2, 16, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 71, 16, -3.8314F, -36.1314F, -55.8F, 1, 2, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 71, 0, -0.1686F, -36.1314F, -55.8F, 1, 2, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 140, 115, -0.2686F, -36.1314F, -56.6F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 140, 112, -3.7314F, -36.1314F, -56.6F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 69, 67, -3.7314F, -36.1314F, -58.4F, 1, 2, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 68, 48, -0.2686F, -36.1314F, -58.4F, 1, 2, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 129, 115, -3.7314F, -36.1314F, -59.2F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 129, 112, -0.2686F, -36.1314F, -59.2F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 129, 109, -3.7314F, -36.1314F, -60.0F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 129, 106, -0.2686F, -36.1314F, -60.0F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 129, 103, -3.7314F, -36.1314F, -60.8F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 128, 71, -0.2686F, -36.1314F, -60.8F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 122, 45, -3.7314F, -36.1314F, -61.6F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 122, 41, -0.2686F, -36.1314F, -61.6F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 122, 34, -3.7314F, -36.1314F, -62.4F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 122, 30, -0.2686F, -36.1314F, -62.4F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 17, 121, -3.7314F, -36.1314F, -63.2F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 75, 118, -0.2686F, -36.1314F, -63.2F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 16, 113, -3.7314F, -36.1314F, -64.0F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 5, 112, -0.2686F, -36.1314F, -64.0F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 111, 45, -3.7314F, -36.1314F, -64.8F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 111, 41, -0.2686F, -36.1314F, -64.8F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 68, 40, -3.7314F, -36.1314F, -66.6F, 1, 2, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 50, 67, -0.2686F, -36.1314F, -66.6F, 1, 2, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 111, 32, -0.2686F, -36.1314F, -67.4F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 74, 109, -3.7314F, -36.1314F, -67.4F, 1, 2, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 63, 0, -0.2686F, -36.1314F, -69.2F, 1, 2, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 62, 16, -3.7314F, -36.1314F, -69.2F, 1, 2, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 59, 48, -3.9314F, -36.1314F, -69.8F, 1, 2, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 59, 40, -0.0686F, -36.1314F, -69.8F, 1, 2, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 14, 80, -3.9314F, -38.8314F, -57.7F, 1, 3, 5, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 0, 80, -0.0686F, -38.8314F, -57.7F, 1, 3, 5, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 47, 208, -3.9314F, -36.8314F, -69.7F, 1, 1, 13, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 19, 208, -0.0686F, -36.8314F, -69.7F, 1, 1, 13, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 165, 29, -3.9314F, -36.8314F, -69.8F, 1, 1, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 165, 27, -0.0686F, -36.8314F, -69.8F, 1, 1, 1, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 120, 95, -3.9314F, -34.7314F, -56.2F, 1, 1, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 120, 87, -0.0686F, -34.7314F, -56.2F, 1, 1, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 190, 195, -0.0686F, -36.5314F, -69.2F, 1, 1, 15, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 158, 195, -3.9314F, -36.5314F, -69.2F, 1, 1, 15, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 15, 118, -0.0686F, -36.5314F, -69.8F, 1, 1, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 73, 115, -3.9314F, -36.5314F, -69.8F, 1, 1, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 29, 91, -0.0686F, -38.8314F, -66.7F, 1, 1, 10, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 82, 87, -3.9314F, -38.8314F, -66.7F, 1, 1, 10, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 114, 17, -0.0686F, -33.7314F, -56.0F, 1, 1, 2, -0.3F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 49, 112, -2.5F, -34.3486F, -54.001F, 2, 2, 1, 0.0F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 47, 0, -3.6297F, -37.962F, -54.001F, 2, 4, 1, 0.0F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 40, 112, -1.3703F, -37.962F, -54.001F, 2, 2, 1, 0.0F, false));
		sportrifle.cubeList.add(new ModelBox(sportrifle, 0, 122, -1.3703F, -35.962F, -54.001F, 3, 2, 1, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-1.5F, -38.4304F, -53.501F);
		sportrifle.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, 2.7053F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 135, 106, -1.7322F, -1.3246F, -0.5F, 2, 1, 1, 0.0F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-1.5F, -38.4304F, -53.501F);
		sportrifle.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, 2.3562F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 165, 25, -1.5167F, -0.8975F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-1.5F, -38.4304F, -53.501F);
		sportrifle.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, 3.1416F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 111, 95, -1.0F, -0.855F, -0.5F, 2, 2, 1, 0.0F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-1.5F, -38.4304F, -53.501F);
		sportrifle.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.0F, -2.3562F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 165, 23, 0.5167F, -0.8975F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-1.5F, -38.4304F, -53.501F);
		sportrifle.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, -2.7053F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 134, 72, -0.2678F, -1.3246F, -0.5F, 2, 1, 1, 0.0F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(-3.2071F, -33.0557F, -53.501F);
		sportrifle.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, 0.0F, -0.7854F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 165, 19, 0.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-0.5F, -33.7628F, -53.501F);
		sportrifle.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, 0.0F, 0.7854F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 13, 165, 0.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(-3.6297F, -33.962F, -53.501F);
		sportrifle.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.0F, 0.0F, -0.4363F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 77, 132, 0.0F, 0.0F, -0.5F, 2, 1, 1, 0.0F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(-0.2766F, -34.3846F, -53.501F);
		sportrifle.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.0F, 0.0F, 0.4363F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 69, 132, -1.0F, 0.0F, -0.5F, 2, 1, 1, 0.0F, false));

		DustCover5_r3 = new ModelRenderer(this);
		DustCover5_r3.setRotationPoint(-2.2F, -32.599F, -37.5051F);
		sportrifle.addChild(DustCover5_r3);
		setRotationAngle(DustCover5_r3, -0.48F, 0.0F, 0.0F);
		DustCover5_r3.cubeList.add(new ModelBox(DustCover5_r3, 118, 52, -1.5F, -0.5F, -2.5F, 3, 1, 5, 0.0F, false));

		DustCover4_r3 = new ModelRenderer(this);
		DustCover4_r3.setRotationPoint(-0.799F, -32.5979F, -37.4867F);
		sportrifle.addChild(DustCover4_r3);
		setRotationAngle(DustCover4_r3, -0.48F, 0.0F, 0.0F);
		DustCover4_r3.cubeList.add(new ModelBox(DustCover4_r3, 40, 116, -1.5F, -0.5F, -2.5F, 3, 1, 5, 0.0F, false));

		DustCover10_r7 = new ModelRenderer(this);
		DustCover10_r7.setRotationPoint(-1.5F, -38.1072F, -52.883F);
		sportrifle.addChild(DustCover10_r7);
		setRotationAngle(DustCover10_r7, 2.618F, 0.0F, 0.0F);
		DustCover10_r7.cubeList.add(new ModelBox(DustCover10_r7, 0, 100, 1.4314F, -1.9696F, -1.4366F, 1, 3, 1, -0.3F, false));
		DustCover10_r7.cubeList.add(new ModelBox(DustCover10_r7, 164, 155, 1.4314F, -0.5696F, -0.3366F, 1, 1, 1, -0.3F, false));
		DustCover10_r7.cubeList.add(new ModelBox(DustCover10_r7, 164, 149, -2.4314F, -0.5696F, -0.3366F, 1, 1, 1, -0.3F, false));
		DustCover10_r7.cubeList.add(new ModelBox(DustCover10_r7, 139, 164, 1.4314F, -0.2696F, -0.6366F, 1, 1, 1, -0.3F, false));
		DustCover10_r7.cubeList.add(new ModelBox(DustCover10_r7, 135, 164, -2.4314F, -0.2696F, -0.6366F, 1, 1, 1, -0.3F, false));
		DustCover10_r7.cubeList.add(new ModelBox(DustCover10_r7, 131, 164, 1.4314F, -0.6696F, -0.6366F, 1, 1, 1, -0.3F, false));
		DustCover10_r7.cubeList.add(new ModelBox(DustCover10_r7, 164, 127, -2.4314F, -0.6696F, -0.6366F, 1, 1, 1, -0.3F, false));
		DustCover10_r7.cubeList.add(new ModelBox(DustCover10_r7, 127, 164, 1.4314F, -1.0696F, -0.6366F, 1, 1, 1, -0.3F, false));
		DustCover10_r7.cubeList.add(new ModelBox(DustCover10_r7, 85, 164, -2.4314F, -1.0696F, -0.6366F, 1, 1, 1, -0.3F, false));
		DustCover10_r7.cubeList.add(new ModelBox(DustCover10_r7, 90, 108, 1.4314F, -1.7696F, -1.0366F, 1, 2, 1, -0.3F, false));
		DustCover10_r7.cubeList.add(new ModelBox(DustCover10_r7, 63, 108, -2.4314F, -1.7696F, -1.0366F, 1, 2, 1, -0.3F, false));
		DustCover10_r7.cubeList.add(new ModelBox(DustCover10_r7, 5, 108, 1.4314F, -1.0696F, -1.0366F, 1, 2, 1, -0.3F, false));
		DustCover10_r7.cubeList.add(new ModelBox(DustCover10_r7, 63, 104, -2.4314F, -1.0696F, -1.0366F, 1, 2, 1, -0.3F, false));
		DustCover10_r7.cubeList.add(new ModelBox(DustCover10_r7, 99, 66, -2.4314F, -1.9696F, -1.4366F, 1, 3, 1, -0.3F, false));
		DustCover10_r7.cubeList.add(new ModelBox(DustCover10_r7, 99, 61, 1.4314F, -8.6695F, 10.1682F, 1, 3, 1, -0.3F, false));
		DustCover10_r7.cubeList.add(new ModelBox(DustCover10_r7, 79, 164, 1.4314F, -7.2695F, 11.2682F, 1, 1, 1, -0.3F, false));
		DustCover10_r7.cubeList.add(new ModelBox(DustCover10_r7, 73, 164, -2.4314F, -7.2695F, 11.2682F, 1, 1, 1, -0.3F, false));
		DustCover10_r7.cubeList.add(new ModelBox(DustCover10_r7, 69, 164, 1.4314F, -6.9695F, 10.9682F, 1, 1, 1, -0.3F, false));
		DustCover10_r7.cubeList.add(new ModelBox(DustCover10_r7, 62, 164, -2.4314F, -6.9695F, 10.9682F, 1, 1, 1, -0.3F, false));
		DustCover10_r7.cubeList.add(new ModelBox(DustCover10_r7, 56, 164, 1.4314F, -7.3695F, 10.9682F, 1, 1, 1, -0.3F, false));
		DustCover10_r7.cubeList.add(new ModelBox(DustCover10_r7, 50, 164, -2.4314F, -7.3695F, 10.9682F, 1, 1, 1, -0.3F, false));
		DustCover10_r7.cubeList.add(new ModelBox(DustCover10_r7, 46, 164, 1.4314F, -7.7695F, 10.9682F, 1, 1, 1, -0.3F, false));
		DustCover10_r7.cubeList.add(new ModelBox(DustCover10_r7, 40, 164, -2.4314F, -7.7695F, 10.9682F, 1, 1, 1, -0.3F, false));
		DustCover10_r7.cubeList.add(new ModelBox(DustCover10_r7, 35, 72, 1.4314F, -8.4695F, 10.5682F, 1, 2, 1, -0.3F, false));
		DustCover10_r7.cubeList.add(new ModelBox(DustCover10_r7, 35, 68, -2.4314F, -8.4695F, 10.5682F, 1, 2, 1, -0.3F, false));
		DustCover10_r7.cubeList.add(new ModelBox(DustCover10_r7, 35, 63, 1.4314F, -7.7695F, 10.5682F, 1, 2, 1, -0.3F, false));
		DustCover10_r7.cubeList.add(new ModelBox(DustCover10_r7, 35, 59, -2.4314F, -7.7695F, 10.5682F, 1, 2, 1, -0.3F, false));
		DustCover10_r7.cubeList.add(new ModelBox(DustCover10_r7, 47, 96, -2.4314F, -8.6695F, 10.1682F, 1, 3, 1, -0.3F, false));

		DustCover8_r5 = new ModelRenderer(this);
		DustCover8_r5.setRotationPoint(-1.5F, -38.1072F, -52.883F);
		sportrifle.addChild(DustCover8_r5);
		setRotationAngle(DustCover8_r5, -3.1416F, 0.0F, 0.0F);
		DustCover8_r5.cubeList.add(new ModelBox(DustCover8_r5, 41, 96, 1.4314F, -2.2758F, -0.183F, 1, 3, 1, -0.3F, false));
		DustCover8_r5.cubeList.add(new ModelBox(DustCover8_r5, 35, 96, -2.4314F, -2.2758F, -0.183F, 1, 3, 1, -0.3F, false));
		DustCover8_r5.cubeList.add(new ModelBox(DustCover8_r5, 20, 9, 1.4314F, -2.2759F, 12.517F, 1, 3, 3, -0.3F, false));
		DustCover8_r5.cubeList.add(new ModelBox(DustCover8_r5, 20, 0, -2.4314F, -2.2759F, 12.517F, 1, 3, 3, -0.3F, false));

		DustCover8_r4_r2 = new ModelRenderer(this);
		DustCover8_r4_r2.setRotationPoint(0.0F, -5.5831F, 8.8021F);
		DustCover8_r5.addChild(DustCover8_r4_r2);
		setRotationAngle(DustCover8_r4_r2, -0.6109F, 0.0F, 0.0F);
		DustCover8_r4_r2.cubeList.add(new ModelBox(DustCover8_r4_r2, 12, 29, 1.4314F, -1.5F, 7.0F, 1, 3, 2, -0.3F, false));
		DustCover8_r4_r2.cubeList.add(new ModelBox(DustCover8_r4_r2, 0, 29, -2.4314F, -1.5F, 7.0F, 1, 3, 2, -0.3F, false));

		DustCover10_r8 = new ModelRenderer(this);
		DustCover10_r8.setRotationPoint(-1.5F, -37.8252F, -41.5768F);
		sportrifle.addChild(DustCover10_r8);
		setRotationAngle(DustCover10_r8, -0.5236F, 0.0F, 0.0F);
		DustCover10_r8.cubeList.add(new ModelBox(DustCover10_r8, 33, 164, -2.4314F, 0.575F, 0.3F, 1, 1, 1, -0.3F, false));
		DustCover10_r8.cubeList.add(new ModelBox(DustCover10_r8, 27, 164, -2.4314F, 0.375F, 0.3F, 1, 1, 1, -0.3F, false));
		DustCover10_r8.cubeList.add(new ModelBox(DustCover10_r8, 23, 164, 1.4314F, 0.325F, 0.3F, 1, 1, 1, -0.3F, false));
		DustCover10_r8.cubeList.add(new ModelBox(DustCover10_r8, 17, 164, 1.4314F, 0.525F, 0.3F, 1, 1, 1, -0.3F, false));
		DustCover10_r8.cubeList.add(new ModelBox(DustCover10_r8, 35, 53, -2.4314F, -0.3F, -0.1F, 1, 2, 1, -0.3F, false));
		DustCover10_r8.cubeList.add(new ModelBox(DustCover10_r8, 29, 96, -2.4314F, -1.0F, -0.5F, 1, 3, 1, -0.3F, false));
		DustCover10_r8.cubeList.add(new ModelBox(DustCover10_r8, 95, 81, 1.4314F, -1.0F, -0.5F, 1, 3, 1, -0.3F, false));
		DustCover10_r8.cubeList.add(new ModelBox(DustCover10_r8, 35, 49, 1.4314F, -0.3F, -0.1F, 1, 2, 1, -0.3F, false));
		DustCover10_r8.cubeList.add(new ModelBox(DustCover10_r8, 164, 15, -2.4314F, 8.575F, -13.5564F, 1, 1, 1, -0.3F, false));
		DustCover10_r8.cubeList.add(new ModelBox(DustCover10_r8, 164, 13, -2.4314F, 8.375F, -13.5564F, 1, 1, 1, -0.3F, false));
		DustCover10_r8.cubeList.add(new ModelBox(DustCover10_r8, 164, 11, 1.4314F, 8.325F, -13.5564F, 1, 1, 1, -0.3F, false));
		DustCover10_r8.cubeList.add(new ModelBox(DustCover10_r8, 10, 164, 1.4314F, 8.525F, -13.5564F, 1, 1, 1, -0.3F, false));
		DustCover10_r8.cubeList.add(new ModelBox(DustCover10_r8, 35, 9, -2.4314F, 7.7F, -13.9564F, 1, 2, 1, -0.3F, false));
		DustCover10_r8.cubeList.add(new ModelBox(DustCover10_r8, 95, 75, -2.4314F, 7.0F, -14.3564F, 1, 3, 1, -0.3F, false));
		DustCover10_r8.cubeList.add(new ModelBox(DustCover10_r8, 95, 12, 1.4314F, 7.0F, -14.3564F, 1, 3, 1, -0.3F, false));
		DustCover10_r8.cubeList.add(new ModelBox(DustCover10_r8, 35, 0, 1.4314F, 7.7F, -13.9564F, 1, 2, 1, -0.3F, false));

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(-0.5F, -32.4F, -44.5F);
		sportrifle.addChild(bone26);
		

		DustCover13_r5 = new ModelRenderer(this);
		DustCover13_r5.setRotationPoint(0.0F, -0.4899F, 0.0F);
		bone26.addChild(DustCover13_r5);
		setRotationAngle(DustCover13_r5, 0.0F, 0.0F, -0.7854F);
		DustCover13_r5.cubeList.add(new ModelBox(DustCover13_r5, 132, 19, -0.8F, 0.0F, 3.9F, 2, 1, 1, -0.3F, false));
		DustCover13_r5.cubeList.add(new ModelBox(DustCover13_r5, 121, 3, -1.8F, 0.0F, 6.4F, 2, 1, 2, -0.3F, false));
		DustCover13_r5.cubeList.add(new ModelBox(DustCover13_r5, 121, 0, -0.8F, 0.0F, 5.0F, 2, 1, 2, -0.3F, false));
		DustCover13_r5.cubeList.add(new ModelBox(DustCover13_r5, 60, 131, -0.8F, 0.0F, 1.7F, 2, 1, 1, -0.3F, false));
		DustCover13_r5.cubeList.add(new ModelBox(DustCover13_r5, 131, 22, -0.8F, 0.0F, 2.8F, 2, 1, 1, -0.3F, false));
		DustCover13_r5.cubeList.add(new ModelBox(DustCover13_r5, 129, 130, -0.8F, 0.0F, -0.5F, 2, 1, 1, -0.3F, false));
		DustCover13_r5.cubeList.add(new ModelBox(DustCover13_r5, 130, 123, -0.8F, 0.0F, 0.6F, 2, 1, 1, -0.3F, false));
		DustCover13_r5.cubeList.add(new ModelBox(DustCover13_r5, 121, 130, -0.8F, 0.0F, -2.7F, 2, 1, 1, -0.3F, false));
		DustCover13_r5.cubeList.add(new ModelBox(DustCover13_r5, 112, 130, -0.8F, 0.0F, -1.6F, 2, 1, 1, -0.3F, false));
		DustCover13_r5.cubeList.add(new ModelBox(DustCover13_r5, 104, 130, -0.8F, 0.0F, -4.9F, 2, 1, 1, -0.3F, false));
		DustCover13_r5.cubeList.add(new ModelBox(DustCover13_r5, 37, 130, -0.8F, 0.0F, -3.8F, 2, 1, 1, -0.3F, false));
		DustCover13_r5.cubeList.add(new ModelBox(DustCover13_r5, 14, 130, -0.8F, 0.0F, -7.1F, 2, 1, 1, -0.3F, false));
		DustCover13_r5.cubeList.add(new ModelBox(DustCover13_r5, 129, 55, -0.8F, 0.0F, -6.0F, 2, 1, 1, -0.3F, false));
		DustCover13_r5.cubeList.add(new ModelBox(DustCover13_r5, 129, 48, -0.8F, 0.0F, -8.2F, 2, 1, 1, -0.3F, false));
		DustCover13_r5.cubeList.add(new ModelBox(DustCover13_r5, 129, 37, -0.8F, 0.0F, -9.3F, 2, 1, 1, -0.3F, false));
		DustCover13_r5.cubeList.add(new ModelBox(DustCover13_r5, 111, 87, 0.2F, 0.0F, -9.3F, 1, 1, 2, -0.3F, false));
		DustCover13_r5.cubeList.add(new ModelBox(DustCover13_r5, 109, 13, -1.0F, 0.0F, -9.3F, 1, 1, 2, -0.3F, false));
		DustCover13_r5.cubeList.add(new ModelBox(DustCover13_r5, 126, 195, 0.2F, 0.0F, -8.7F, 1, 1, 15, -0.3F, false));
		DustCover13_r5.cubeList.add(new ModelBox(DustCover13_r5, 48, 172, -1.0F, 0.0F, -8.7F, 1, 1, 17, -0.3F, false));
		DustCover13_r5.cubeList.add(new ModelBox(DustCover13_r5, 37, 127, -0.8F, 0.0F, -12.1F, 2, 1, 1, -0.3F, false));
		DustCover13_r5.cubeList.add(new ModelBox(DustCover13_r5, 12, 127, -0.8F, 0.0F, -11.0F, 2, 1, 1, -0.3F, false));
		DustCover13_r5.cubeList.add(new ModelBox(DustCover13_r5, 6, 127, -0.8F, 0.0F, -14.3F, 2, 1, 1, -0.3F, false));
		DustCover13_r5.cubeList.add(new ModelBox(DustCover13_r5, 0, 127, -0.8F, 0.0F, -13.2F, 2, 1, 1, -0.3F, false));
		DustCover13_r5.cubeList.add(new ModelBox(DustCover13_r5, 126, 119, -0.8F, 0.0F, -16.5F, 2, 1, 1, -0.3F, false));
		DustCover13_r5.cubeList.add(new ModelBox(DustCover13_r5, 81, 125, -0.8F, 0.0F, -15.4F, 2, 1, 1, -0.3F, false));
		DustCover13_r5.cubeList.add(new ModelBox(DustCover13_r5, 125, 61, -0.8F, 0.0F, -18.7F, 2, 1, 1, -0.3F, false));
		DustCover13_r5.cubeList.add(new ModelBox(DustCover13_r5, 124, 123, -0.8F, 0.0F, -17.6F, 2, 1, 1, -0.3F, false));
		DustCover13_r5.cubeList.add(new ModelBox(DustCover13_r5, 118, 123, -0.8F, 0.0F, -20.9F, 2, 1, 1, -0.3F, false));
		DustCover13_r5.cubeList.add(new ModelBox(DustCover13_r5, 112, 123, -0.8F, 0.0F, -19.8F, 2, 1, 1, -0.3F, false));
		DustCover13_r5.cubeList.add(new ModelBox(DustCover13_r5, 122, 116, -0.8F, 0.0F, -23.1F, 2, 1, 1, -0.3F, false));
		DustCover13_r5.cubeList.add(new ModelBox(DustCover13_r5, 122, 107, -0.8F, 0.0F, -22.0F, 2, 1, 1, -0.3F, false));
		DustCover13_r5.cubeList.add(new ModelBox(DustCover13_r5, 103, 122, -0.8F, 0.0F, -24.2F, 2, 1, 1, -0.3F, false));
		DustCover13_r5.cubeList.add(new ModelBox(DustCover13_r5, 121, 6, -0.8F, 0.0F, -25.3F, 2, 1, 1, -0.3F, false));
		DustCover13_r5.cubeList.add(new ModelBox(DustCover13_r5, 88, 104, 0.2F, 0.0F, -25.3F, 1, 1, 2, -0.3F, false));
		DustCover13_r5.cubeList.add(new ModelBox(DustCover13_r5, 73, 99, -1.0F, 0.0F, -25.3F, 1, 1, 2, -0.3F, false));
		DustCover13_r5.cubeList.add(new ModelBox(DustCover13_r5, 109, 194, 0.2F, 0.0F, -24.7F, 1, 1, 15, -0.3F, false));
		DustCover13_r5.cubeList.add(new ModelBox(DustCover13_r5, 194, 0, -1.0F, 0.0F, -24.7F, 1, 1, 15, -0.3F, false));

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(-7.2F, -32.4F, -44.5F);
		sportrifle.addChild(bone27);
		setRotationAngle(bone27, 0.0F, 0.0F, 1.5708F);
		

		DustCover9_r5 = new ModelRenderer(this);
		DustCover9_r5.setRotationPoint(19.8902F, 2.1934F, 0.1F);
		bone27.addChild(DustCover9_r5);
		setRotationAngle(DustCover9_r5, 0.0F, 0.0F, 0.7854F);
		DustCover9_r5.cubeList.add(new ModelBox(DustCover9_r5, 97, 55, -23.1744F, 13.6256F, -9.3F, 1, 1, 2, -0.3F, false));
		DustCover9_r5.cubeList.add(new ModelBox(DustCover9_r5, 207, 190, -23.1744F, 13.6256F, -9.2F, 1, 1, 13, -0.3F, false));
		DustCover9_r5.cubeList.add(new ModelBox(DustCover9_r5, 92, 207, -24.3744F, 13.6256F, -9.2F, 1, 1, 13, -0.3F, false));
		DustCover9_r5.cubeList.add(new ModelBox(DustCover9_r5, 53, 97, -24.3744F, 13.6256F, -9.3F, 1, 1, 2, -0.3F, false));
		DustCover9_r5.cubeList.add(new ModelBox(DustCover9_r5, 120, 119, -24.1744F, 13.6256F, -9.3F, 2, 1, 2, -0.3F, false));
		DustCover9_r5.cubeList.add(new ModelBox(DustCover9_r5, 112, 119, -24.1744F, 13.6256F, 1.8F, 2, 1, 2, -0.3F, false));
		DustCover9_r5.cubeList.add(new ModelBox(DustCover9_r5, 29, 80, -23.1744F, 13.6256F, -22.2F, 1, 1, 10, -0.3F, false));
		DustCover9_r5.cubeList.add(new ModelBox(DustCover9_r5, 119, 69, -24.1744F, 13.6256F, -22.8F, 2, 1, 2, -0.3F, false));
		DustCover9_r5.cubeList.add(new ModelBox(DustCover9_r5, 117, 22, -24.1744F, 13.6256F, -14.2F, 2, 1, 2, -0.3F, false));
		DustCover9_r5.cubeList.add(new ModelBox(DustCover9_r5, 53, 87, -24.1744F, 13.6256F, -13.3F, 2, 1, 4, -0.3F, false));
		DustCover9_r5.cubeList.add(new ModelBox(DustCover9_r5, 175, 195, -24.3744F, 13.6256F, -22.3F, 1, 1, 13, -0.3F, false));

		DustCover9_r5_r2 = new ModelRenderer(this);
		DustCover9_r5_r2.setRotationPoint(-22.9303F, 14.1256F, -22.2023F);
		DustCover9_r5.addChild(DustCover9_r5_r2);
		setRotationAngle(DustCover9_r5_r2, 0.0F, 0.48F, 0.0F);
		DustCover9_r5_r2.cubeList.add(new ModelBox(DustCover9_r5_r2, 164, 9, -0.1847F, -0.5F, -0.6452F, 1, 1, 1, -0.3F, false));
		DustCover9_r5_r2.cubeList.add(new ModelBox(DustCover9_r5_r2, 31, 119, -1.0F, -0.5F, -1.0F, 2, 1, 1, -0.3F, false));

		DustCover14_r7 = new ModelRenderer(this);
		DustCover14_r7.setRotationPoint(10.5201F, -7.4071F, 0.1F);
		bone27.addChild(DustCover14_r7);
		setRotationAngle(DustCover14_r7, 0.0F, 0.0F, -0.7854F);
		DustCover14_r7.cubeList.add(new ModelBox(DustCover14_r7, 81, 114, -13.1744F, -12.3744F, 1.8F, 2, 1, 2, -0.3F, false));
		DustCover14_r7.cubeList.add(new ModelBox(DustCover14_r7, 109, 22, -13.1744F, -12.3744F, -9.3F, 2, 1, 2, -0.3F, false));
		DustCover14_r7.cubeList.add(new ModelBox(DustCover14_r7, 71, 20, -12.1744F, -12.3744F, -9.3F, 1, 1, 2, -0.3F, false));
		DustCover14_r7.cubeList.add(new ModelBox(DustCover14_r7, 68, 52, -13.3744F, -12.3744F, -9.3F, 1, 1, 2, -0.3F, false));
		DustCover14_r7.cubeList.add(new ModelBox(DustCover14_r7, 143, 195, -12.1744F, -12.3744F, -9.2F, 1, 1, 13, -0.3F, false));
		DustCover14_r7.cubeList.add(new ModelBox(DustCover14_r7, 40, 191, -13.3744F, -12.3744F, -9.2F, 1, 1, 13, -0.3F, false));
		DustCover14_r7.cubeList.add(new ModelBox(DustCover14_r7, 106, 36, -13.1744F, -12.3744F, -14.2F, 2, 1, 2, -0.3F, false));
		DustCover14_r7.cubeList.add(new ModelBox(DustCover14_r7, 20, 54, -13.1744F, -12.3744F, -22.8F, 2, 1, 2, -0.3F, false));
		DustCover14_r7.cubeList.add(new ModelBox(DustCover14_r7, 77, 48, -12.1744F, -12.3744F, -22.2F, 1, 1, 10, -0.3F, false));
		DustCover14_r7.cubeList.add(new ModelBox(DustCover14_r7, 47, 16, -13.3744F, -12.3744F, -22.3F, 1, 1, 13, -0.3F, false));
		DustCover14_r7.cubeList.add(new ModelBox(DustCover14_r7, 62, 24, -13.1744F, -12.3744F, -13.3F, 2, 1, 4, -0.3F, false));

		DustCover55_r5_r2 = new ModelRenderer(this);
		DustCover55_r5_r2.setRotationPoint(-11.9303F, -11.8744F, -22.2023F);
		DustCover14_r7.addChild(DustCover55_r5_r2);
		setRotationAngle(DustCover55_r5_r2, 0.0F, 0.48F, 0.0F);
		DustCover55_r5_r2.cubeList.add(new ModelBox(DustCover55_r5_r2, 164, 6, -0.1847F, -0.5F, -0.6452F, 1, 1, 1, -0.3F, false));
		DustCover55_r5_r2.cubeList.add(new ModelBox(DustCover55_r5_r2, 23, 119, -1.0F, -0.5F, -1.0F, 2, 1, 1, -0.3F, false));

		DustCover14_r8 = new ModelRenderer(this);
		DustCover14_r8.setRotationPoint(-0.1314F, -4.5586F, 0.0F);
		bone27.addChild(DustCover14_r8);
		setRotationAngle(DustCover14_r8, 0.0F, 0.0F, -0.7854F);
		DustCover14_r8.cubeList.add(new ModelBox(DustCover14_r8, 87, 114, -1.1536F, -0.3536F, 3.9F, 2, 1, 1, -0.3F, false));
		DustCover14_r8.cubeList.add(new ModelBox(DustCover14_r8, 10, 54, -0.2536F, -0.3536F, 6.4F, 2, 1, 2, -0.3F, false));
		DustCover14_r8.cubeList.add(new ModelBox(DustCover14_r8, 0, 54, -1.1536F, -0.3536F, 5.0F, 2, 1, 2, -0.3F, false));
		DustCover14_r8.cubeList.add(new ModelBox(DustCover14_r8, 31, 112, -1.1536F, -0.3536F, 1.7F, 2, 1, 1, -0.3F, false));
		DustCover14_r8.cubeList.add(new ModelBox(DustCover14_r8, 23, 112, -1.1536F, -0.3536F, 2.8F, 2, 1, 1, -0.3F, false));
		DustCover14_r8.cubeList.add(new ModelBox(DustCover14_r8, 111, 78, -1.1536F, -0.3536F, -0.5F, 2, 1, 1, -0.3F, false));
		DustCover14_r8.cubeList.add(new ModelBox(DustCover14_r8, 111, 61, -1.1536F, -0.3536F, 0.6F, 2, 1, 1, -0.3F, false));
		DustCover14_r8.cubeList.add(new ModelBox(DustCover14_r8, 104, 108, -1.1536F, -0.3536F, -2.7F, 2, 1, 1, -0.3F, false));
		DustCover14_r8.cubeList.add(new ModelBox(DustCover14_r8, 96, 108, -1.1536F, -0.3536F, -1.6F, 2, 1, 1, -0.3F, false));
		DustCover14_r8.cubeList.add(new ModelBox(DustCover14_r8, 106, 56, -1.1536F, -0.3536F, -4.9F, 2, 1, 1, -0.3F, false));
		DustCover14_r8.cubeList.add(new ModelBox(DustCover14_r8, 76, 104, -1.1536F, -0.3536F, -3.8F, 2, 1, 1, -0.3F, false));
		DustCover14_r8.cubeList.add(new ModelBox(DustCover14_r8, 50, 104, -1.1536F, -0.3536F, -7.1F, 2, 1, 1, -0.3F, false));
		DustCover14_r8.cubeList.add(new ModelBox(DustCover14_r8, 100, 101, -1.1536F, -0.3536F, -6.0F, 2, 1, 1, -0.3F, false));
		DustCover14_r8.cubeList.add(new ModelBox(DustCover14_r8, 94, 101, -1.1536F, -0.3536F, -8.2F, 2, 1, 1, -0.3F, false));
		DustCover14_r8.cubeList.add(new ModelBox(DustCover14_r8, 88, 101, -1.1536F, -0.3536F, -9.3F, 2, 1, 1, -0.3F, false));
		DustCover14_r8.cubeList.add(new ModelBox(DustCover14_r8, 68, 44, -0.1536F, -0.3536F, -9.3F, 1, 1, 2, -0.3F, false));
		DustCover14_r8.cubeList.add(new ModelBox(DustCover14_r8, 62, 20, -1.3536F, -0.3536F, -9.3F, 1, 1, 2, -0.3F, false));
		DustCover14_r8.cubeList.add(new ModelBox(DustCover14_r8, 111, 83, -0.1536F, -0.3536F, -8.7F, 1, 1, 16, -0.3F, false));
		DustCover14_r8.cubeList.add(new ModelBox(DustCover14_r8, 193, 174, -1.3536F, -0.3536F, -8.7F, 1, 1, 15, -0.3F, false));
		DustCover14_r8.cubeList.add(new ModelBox(DustCover14_r8, 82, 101, -1.1536F, -0.3536F, -12.1F, 2, 1, 1, -0.3F, false));
		DustCover14_r8.cubeList.add(new ModelBox(DustCover14_r8, 98, 98, -1.1536F, -0.3536F, -11.0F, 2, 1, 1, -0.3F, false));
		DustCover14_r8.cubeList.add(new ModelBox(DustCover14_r8, 92, 98, -1.1536F, -0.3536F, -14.3F, 2, 1, 1, -0.3F, false));
		DustCover14_r8.cubeList.add(new ModelBox(DustCover14_r8, 98, 39, -1.1536F, -0.3536F, -13.2F, 2, 1, 1, -0.3F, false));
		DustCover14_r8.cubeList.add(new ModelBox(DustCover14_r8, 98, 36, -1.1536F, -0.3536F, -16.5F, 2, 1, 1, -0.3F, false));
		DustCover14_r8.cubeList.add(new ModelBox(DustCover14_r8, 97, 52, -1.1536F, -0.3536F, -15.4F, 2, 1, 1, -0.3F, false));
		DustCover14_r8.cubeList.add(new ModelBox(DustCover14_r8, 90, 36, -1.1536F, -0.3536F, -18.7F, 2, 1, 1, -0.3F, false));
		DustCover14_r8.cubeList.add(new ModelBox(DustCover14_r8, 89, 52, -1.1536F, -0.3536F, -17.6F, 2, 1, 1, -0.3F, false));
		DustCover14_r8.cubeList.add(new ModelBox(DustCover14_r8, 71, 4, -1.1536F, -0.3536F, -20.9F, 2, 1, 1, -0.3F, false));
		DustCover14_r8.cubeList.add(new ModelBox(DustCover14_r8, 63, 4, -1.1536F, -0.3536F, -19.8F, 2, 1, 1, -0.3F, false));
		DustCover14_r8.cubeList.add(new ModelBox(DustCover14_r8, 50, 53, -1.1536F, -0.3536F, -23.1F, 2, 1, 1, -0.3F, false));
		DustCover14_r8.cubeList.add(new ModelBox(DustCover14_r8, 41, 53, -1.1536F, -0.3536F, -22.0F, 2, 1, 1, -0.3F, false));
		DustCover14_r8.cubeList.add(new ModelBox(DustCover14_r8, 50, 45, -1.1536F, -0.3536F, -24.2F, 2, 1, 1, -0.3F, false));
		DustCover14_r8.cubeList.add(new ModelBox(DustCover14_r8, 0, 46, -1.1536F, -0.3536F, -25.3F, 2, 1, 1, -0.3F, false));
		DustCover14_r8.cubeList.add(new ModelBox(DustCover14_r8, 59, 52, -0.1536F, -0.3536F, -25.3F, 1, 1, 2, -0.3F, false));
		DustCover14_r8.cubeList.add(new ModelBox(DustCover14_r8, 59, 44, -1.3536F, -0.3536F, -25.3F, 1, 1, 2, -0.3F, false));
		DustCover14_r8.cubeList.add(new ModelBox(DustCover14_r8, 193, 151, -0.1536F, -0.3536F, -24.7F, 1, 1, 15, -0.3F, false));
		DustCover14_r8.cubeList.add(new ModelBox(DustCover14_r8, 73, 193, -1.3536F, -0.3536F, -24.7F, 1, 1, 15, -0.3F, false));

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(-1.5F, -36.8252F, -42.7768F);
		sportrifle.addChild(bone28);
		

		DustCover7_r3 = new ModelRenderer(this);
		DustCover7_r3.setRotationPoint(0.0F, -1.0F, 0.0F);
		bone28.addChild(DustCover7_r3);
		setRotationAngle(DustCover7_r3, -0.5236F, 0.0F, 0.0F);
		DustCover7_r3.cubeList.add(new ModelBox(DustCover7_r3, 95, 6, -2.4314F, -1.0F, -0.5F, 1, 3, 1, -0.3F, false));
		DustCover7_r3.cubeList.add(new ModelBox(DustCover7_r3, 94, 87, 1.4314F, -1.0F, -0.5F, 1, 3, 1, -0.3F, false));
		DustCover7_r3.cubeList.add(new ModelBox(DustCover7_r3, 14, 94, -2.4314F, 7.0F, -14.3564F, 1, 3, 1, -0.3F, false));
		DustCover7_r3.cubeList.add(new ModelBox(DustCover7_r3, 7, 94, 1.4314F, 7.0F, -14.3564F, 1, 3, 1, -0.3F, false));

		bone29 = new ModelRenderer(this);
		bone29.setRotationPoint(-1.5F, -36.8252F, -43.8768F);
		sportrifle.addChild(bone29);
		

		DustCover8_r6 = new ModelRenderer(this);
		DustCover8_r6.setRotationPoint(0.0F, -1.0F, 0.0F);
		bone29.addChild(DustCover8_r6);
		setRotationAngle(DustCover8_r6, -0.5236F, 0.0F, 0.0F);
		DustCover8_r6.cubeList.add(new ModelBox(DustCover8_r6, 0, 94, -2.4314F, -1.0F, -0.5F, 1, 3, 1, -0.3F, false));
		DustCover8_r6.cubeList.add(new ModelBox(DustCover8_r6, 75, 93, 1.4314F, -1.0F, -0.5F, 1, 3, 1, -0.3F, false));
		DustCover8_r6.cubeList.add(new ModelBox(DustCover8_r6, 93, 66, -2.4314F, 7.0F, -14.3564F, 1, 3, 1, -0.3F, false));
		DustCover8_r6.cubeList.add(new ModelBox(DustCover8_r6, 93, 61, 1.4314F, 7.0F, -14.3564F, 1, 3, 1, -0.3F, false));

		bone30 = new ModelRenderer(this);
		bone30.setRotationPoint(-1.5F, -36.8252F, -45.0768F);
		sportrifle.addChild(bone30);
		

		DustCover9_r6 = new ModelRenderer(this);
		DustCover9_r6.setRotationPoint(0.0F, -1.0F, 0.0F);
		bone30.addChild(DustCover9_r6);
		setRotationAngle(DustCover9_r6, -0.5236F, 0.0F, 0.0F);
		DustCover9_r6.cubeList.add(new ModelBox(DustCover9_r6, 88, 92, -2.4314F, -1.0F, -0.5F, 1, 3, 1, -0.3F, false));
		DustCover9_r6.cubeList.add(new ModelBox(DustCover9_r6, 82, 92, 1.4314F, -1.0F, -0.5F, 1, 3, 1, -0.3F, false));
		DustCover9_r6.cubeList.add(new ModelBox(DustCover9_r6, 47, 91, -2.4314F, 7.0F, -14.3564F, 1, 3, 1, -0.3F, false));
		DustCover9_r6.cubeList.add(new ModelBox(DustCover9_r6, 41, 91, 1.4314F, 7.0F, -14.3564F, 1, 3, 1, -0.3F, false));

		bone31 = new ModelRenderer(this);
		bone31.setRotationPoint(-1.5F, -36.8252F, -46.2768F);
		sportrifle.addChild(bone31);
		

		DustCover10_r9 = new ModelRenderer(this);
		DustCover10_r9.setRotationPoint(0.0F, -1.0F, 0.0F);
		bone31.addChild(DustCover10_r9);
		setRotationAngle(DustCover10_r9, -0.5236F, 0.0F, 0.0F);
		DustCover10_r9.cubeList.add(new ModelBox(DustCover10_r9, 35, 91, -2.4314F, -1.0F, -0.5F, 1, 3, 1, -0.3F, false));
		DustCover10_r9.cubeList.add(new ModelBox(DustCover10_r9, 29, 91, 1.4314F, -1.0F, -0.5F, 1, 3, 1, -0.3F, false));
		DustCover10_r9.cubeList.add(new ModelBox(DustCover10_r9, 88, 87, -2.4314F, 7.0F, -14.3564F, 1, 3, 1, -0.3F, false));
		DustCover10_r9.cubeList.add(new ModelBox(DustCover10_r9, 88, 80, 1.4314F, 7.0F, -14.3564F, 1, 3, 1, -0.3F, false));

		bone32 = new ModelRenderer(this);
		bone32.setRotationPoint(-1.5F, -36.8252F, -47.5268F);
		sportrifle.addChild(bone32);
		

		DustCover11_r3 = new ModelRenderer(this);
		DustCover11_r3.setRotationPoint(0.0F, -1.0F, 0.0F);
		bone32.addChild(DustCover11_r3);
		setRotationAngle(DustCover11_r3, -0.5236F, 0.0F, 0.0F);
		DustCover11_r3.cubeList.add(new ModelBox(DustCover11_r3, 88, 75, -2.4314F, -1.0F, -0.5F, 1, 3, 1, -0.3F, false));
		DustCover11_r3.cubeList.add(new ModelBox(DustCover11_r3, 82, 87, 1.4314F, -1.0F, -0.5F, 1, 3, 1, -0.3F, false));
		DustCover11_r3.cubeList.add(new ModelBox(DustCover11_r3, 61, 87, -2.4314F, 7.0F, -14.3564F, 1, 3, 1, -0.3F, false));
		DustCover11_r3.cubeList.add(new ModelBox(DustCover11_r3, 53, 87, 1.4314F, 7.0F, -14.3564F, 1, 3, 1, -0.3F, false));

		bone33 = new ModelRenderer(this);
		bone33.setRotationPoint(-1.5F, -36.8252F, -48.8268F);
		sportrifle.addChild(bone33);
		

		DustCover12_r3 = new ModelRenderer(this);
		DustCover12_r3.setRotationPoint(0.0F, -1.0F, 0.0F);
		bone33.addChild(DustCover12_r3);
		setRotationAngle(DustCover12_r3, -0.5236F, 0.0F, 0.0F);
		DustCover12_r3.cubeList.add(new ModelBox(DustCover12_r3, 82, 80, -2.4314F, -1.0F, -0.5F, 1, 3, 1, -0.3F, false));
		DustCover12_r3.cubeList.add(new ModelBox(DustCover12_r3, 82, 75, 1.4314F, -1.0F, -0.5F, 1, 3, 1, -0.3F, false));

		bone34 = new ModelRenderer(this);
		bone34.setRotationPoint(-1.5F, -36.8252F, -50.2268F);
		sportrifle.addChild(bone34);
		

		DustCover13_r6 = new ModelRenderer(this);
		DustCover13_r6.setRotationPoint(0.0F, -1.0F, 0.0F);
		bone34.addChild(DustCover13_r6);
		setRotationAngle(DustCover13_r6, -0.5236F, 0.0F, 0.0F);
		DustCover13_r6.cubeList.add(new ModelBox(DustCover13_r6, 75, 75, -2.4314F, -1.0F, -0.5F, 1, 3, 1, -0.3F, false));
		DustCover13_r6.cubeList.add(new ModelBox(DustCover13_r6, 70, 58, 1.4314F, -1.0F, -0.5F, 1, 3, 1, -0.3F, false));

		bone35 = new ModelRenderer(this);
		bone35.setRotationPoint(-1.5F, -36.8252F, -51.5268F);
		sportrifle.addChild(bone35);
		

		DustCover14_r9 = new ModelRenderer(this);
		DustCover14_r9.setRotationPoint(0.0F, -1.0F, 0.0F);
		bone35.addChild(DustCover14_r9);
		setRotationAngle(DustCover14_r9, -0.5236F, 0.0F, 0.0F);
		DustCover14_r9.cubeList.add(new ModelBox(DustCover14_r9, 62, 24, -2.4314F, -1.0F, -0.5F, 1, 3, 1, -0.3F, false));
		DustCover14_r9.cubeList.add(new ModelBox(DustCover14_r9, 60, 58, 1.4314F, -1.0F, -0.5F, 1, 3, 1, -0.3F, false));
		DustCover14_r9.cubeList.add(new ModelBox(DustCover14_r9, 51, 58, -2.4314F, 5.7F, -12.1047F, 1, 3, 1, -0.3F, false));
		DustCover14_r9.cubeList.add(new ModelBox(DustCover14_r9, 41, 58, 1.4314F, 5.7F, -12.1047F, 1, 3, 1, -0.3F, false));

		rails8 = new ModelRenderer(this);
		rails8.setRotationPoint(-1.5F, -30.9743F, -50.8005F);
		sportrifle.addChild(rails8);
		setRotationAngle(rails8, 3.1416F, 0.0F, 0.0F);
		rails8.cubeList.add(new ModelBox(rails8, 164, 4, 0.0F, -0.2007F, 0.7005F, 1, 1, 1, -0.2F, false));
		rails8.cubeList.add(new ModelBox(rails8, 4, 164, 0.0F, -0.2007F, 1.9005F, 1, 1, 1, -0.2F, false));
		rails8.cubeList.add(new ModelBox(rails8, 164, 2, -1.0F, -0.1993F, 0.6995F, 1, 1, 1, -0.2F, false));
		rails8.cubeList.add(new ModelBox(rails8, 164, 0, -1.0F, -0.1993F, 1.8995F, 1, 1, 1, -0.2F, false));
		rails8.cubeList.add(new ModelBox(rails8, 0, 164, 0.0F, -0.2007F, -4.0995F, 1, 1, 1, -0.2F, false));
		rails8.cubeList.add(new ModelBox(rails8, 162, 163, 0.0F, -0.2007F, -2.8995F, 1, 1, 1, -0.2F, false));
		rails8.cubeList.add(new ModelBox(rails8, 163, 160, 0.0F, -0.2007F, -1.6995F, 1, 1, 1, -0.2F, false));
		rails8.cubeList.add(new ModelBox(rails8, 158, 163, 0.0F, -0.2007F, -0.4995F, 1, 1, 1, -0.2F, false));
		rails8.cubeList.add(new ModelBox(rails8, 163, 157, -1.0F, -0.1993F, -4.1005F, 1, 1, 1, -0.2F, false));
		rails8.cubeList.add(new ModelBox(rails8, 150, 163, -1.0F, -0.1993F, -2.9005F, 1, 1, 1, -0.2F, false));
		rails8.cubeList.add(new ModelBox(rails8, 144, 163, -1.0F, -0.1993F, -1.7005F, 1, 1, 1, -0.2F, false));
		rails8.cubeList.add(new ModelBox(rails8, 82, 163, -1.0F, -0.1993F, -0.5005F, 1, 1, 1, -0.2F, false));
		rails8.cubeList.add(new ModelBox(rails8, 59, 163, 0.0F, -0.2007F, -8.8995F, 1, 1, 1, -0.2F, false));
		rails8.cubeList.add(new ModelBox(rails8, 162, 107, 0.0F, -0.2007F, -7.6995F, 1, 1, 1, -0.2F, false));
		rails8.cubeList.add(new ModelBox(rails8, 162, 98, 0.0F, -0.2007F, -6.4995F, 1, 1, 1, -0.2F, false));
		rails8.cubeList.add(new ModelBox(rails8, 162, 89, 0.0F, -0.2007F, -5.2995F, 1, 1, 1, -0.2F, false));
		rails8.cubeList.add(new ModelBox(rails8, 86, 162, -1.0F, -0.1993F, -8.9005F, 1, 1, 1, -0.2F, false));
		rails8.cubeList.add(new ModelBox(rails8, 79, 162, -1.0F, -0.1993F, -7.7005F, 1, 1, 1, -0.2F, false));
		rails8.cubeList.add(new ModelBox(rails8, 73, 162, -1.0F, -0.1993F, -6.5005F, 1, 1, 1, -0.2F, false));
		rails8.cubeList.add(new ModelBox(rails8, 69, 162, -1.0F, -0.1993F, -5.3005F, 1, 1, 1, -0.2F, false));
		rails8.cubeList.add(new ModelBox(rails8, 63, 162, 0.0F, -0.2007F, -10.0995F, 1, 1, 1, -0.2F, false));
		rails8.cubeList.add(new ModelBox(rails8, 56, 162, -1.0F, -0.1993F, -10.1005F, 1, 1, 1, -0.2F, false));
		rails8.cubeList.add(new ModelBox(rails8, 132, 0, -1.0F, 0.3743F, -15.2995F, 2, 1, 18, 0.0F, false));
		rails8.cubeList.add(new ModelBox(rails8, 50, 162, 0.0F, -0.2006F, 16.7005F, 1, 1, 1, -0.2F, false));
		rails8.cubeList.add(new ModelBox(rails8, 46, 162, 0.0F, -0.2006F, 17.9005F, 1, 1, 1, -0.2F, false));
		rails8.cubeList.add(new ModelBox(rails8, 141, 161, -1.0F, -0.1992F, 16.6995F, 1, 1, 1, -0.2F, false));
		rails8.cubeList.add(new ModelBox(rails8, 121, 161, -1.0F, -0.1992F, 17.8995F, 1, 1, 1, -0.2F, false));
		rails8.cubeList.add(new ModelBox(rails8, 117, 161, 0.0F, -0.2006F, 11.9005F, 1, 1, 1, -0.2F, false));
		rails8.cubeList.add(new ModelBox(rails8, 113, 161, 0.0F, -0.2006F, 13.1005F, 1, 1, 1, -0.2F, false));
		rails8.cubeList.add(new ModelBox(rails8, 109, 161, 0.0F, -0.2006F, 14.3005F, 1, 1, 1, -0.2F, false));
		rails8.cubeList.add(new ModelBox(rails8, 161, 100, 0.0F, -0.2006F, 15.5005F, 1, 1, 1, -0.2F, false));
		rails8.cubeList.add(new ModelBox(rails8, 161, 91, -1.0F, -0.1992F, 11.8995F, 1, 1, 1, -0.2F, false));
		rails8.cubeList.add(new ModelBox(rails8, 161, 85, -1.0F, -0.1992F, 13.0995F, 1, 1, 1, -0.2F, false));
		rails8.cubeList.add(new ModelBox(rails8, 161, 79, -1.0F, -0.1992F, 14.2995F, 1, 1, 1, -0.2F, false));
		rails8.cubeList.add(new ModelBox(rails8, 161, 70, -1.0F, -0.1992F, 15.4995F, 1, 1, 1, -0.2F, false));
		rails8.cubeList.add(new ModelBox(rails8, 161, 63, 0.0F, -0.2006F, 7.1005F, 1, 1, 1, -0.2F, false));
		rails8.cubeList.add(new ModelBox(rails8, 161, 57, 0.0F, -0.2006F, 8.3005F, 1, 1, 1, -0.2F, false));
		rails8.cubeList.add(new ModelBox(rails8, 161, 48, 0.0F, -0.2006F, 9.5005F, 1, 1, 1, -0.2F, false));
		rails8.cubeList.add(new ModelBox(rails8, 103, 159, 0.0F, -0.2006F, 10.7005F, 1, 1, 1, -0.2F, false));
		rails8.cubeList.add(new ModelBox(rails8, 158, 107, -1.0F, -0.1992F, 7.0995F, 1, 1, 1, -0.2F, false));
		rails8.cubeList.add(new ModelBox(rails8, 37, 158, -1.0F, -0.1992F, 8.2995F, 1, 1, 1, -0.2F, false));
		rails8.cubeList.add(new ModelBox(rails8, 33, 158, -1.0F, -0.1992F, 9.4995F, 1, 1, 1, -0.2F, false));
		rails8.cubeList.add(new ModelBox(rails8, 27, 158, -1.0F, -0.1992F, 10.6995F, 1, 1, 1, -0.2F, false));
		rails8.cubeList.add(new ModelBox(rails8, 23, 158, 0.0F, -0.2006F, 5.9005F, 1, 1, 1, -0.2F, false));
		rails8.cubeList.add(new ModelBox(rails8, 14, 158, -1.0F, -0.1992F, 5.8995F, 1, 1, 1, -0.2F, false));
		rails8.cubeList.add(new ModelBox(rails8, 10, 158, -1.0F, -0.1992F, 4.6995F, 1, 1, 1, -0.2F, false));
		rails8.cubeList.add(new ModelBox(rails8, 4, 158, 0.0F, -0.2006F, 4.7005F, 1, 1, 1, -0.2F, false));
		rails8.cubeList.add(new ModelBox(rails8, 0, 158, -1.0F, -0.1992F, 3.4995F, 1, 1, 1, -0.2F, false));
		rails8.cubeList.add(new ModelBox(rails8, 157, 85, 0.0F, -0.2006F, 3.5005F, 1, 1, 1, -0.2F, false));
		rails8.cubeList.add(new ModelBox(rails8, 41, 58, -1.0F, 0.3744F, 3.7005F, 2, 1, 15, 0.0F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(-0.8F, 24.0743F, -25.2495F);
		rails8.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.0F, 0.0F, -0.7854F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 157, 63, 16.2236F, -17.2236F, 25.95F, 1, 1, 1, -0.201F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 79, 156, 16.2236F, -17.2236F, 27.15F, 1, 1, 1, -0.201F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 73, 156, 16.2236F, -17.2236F, 21.15F, 1, 1, 1, -0.201F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 69, 156, 16.2236F, -17.2236F, 22.35F, 1, 1, 1, -0.201F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 56, 156, 16.2236F, -17.2236F, 23.55F, 1, 1, 1, -0.201F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 50, 156, 16.2236F, -17.2236F, 24.75F, 1, 1, 1, -0.201F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 46, 156, 16.2236F, -17.2236F, 16.35F, 1, 1, 1, -0.201F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 156, 38, 16.2236F, -17.2236F, 17.55F, 1, 1, 1, -0.201F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 156, 28, 16.2236F, -17.2236F, 18.75F, 1, 1, 1, -0.201F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 155, 140, 16.2236F, -17.2236F, 19.95F, 1, 1, 1, -0.201F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 152, 102, 16.2236F, -17.2236F, 15.15F, 1, 1, 1, -0.201F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 17, 149, 16.2235F, -17.2235F, 41.95F, 1, 1, 1, -0.201F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 17, 147, 16.2235F, -17.2235F, 43.15F, 1, 1, 1, -0.201F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 146, 30, 16.2235F, -17.2235F, 37.15F, 1, 1, 1, -0.201F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 146, 12, 16.2235F, -17.2235F, 38.35F, 1, 1, 1, -0.201F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 146, 9, 16.2235F, -17.2235F, 39.55F, 1, 1, 1, -0.201F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 146, 3, 16.2235F, -17.2235F, 40.75F, 1, 1, 1, -0.201F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 146, 0, 16.2235F, -17.2235F, 32.35F, 1, 1, 1, -0.201F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 121, 145, 16.2235F, -17.2235F, 33.55F, 1, 1, 1, -0.201F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 50, 145, 16.2235F, -17.2235F, 34.75F, 1, 1, 1, -0.201F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 33, 145, 16.2235F, -17.2235F, 35.95F, 1, 1, 1, -0.201F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 10, 145, 16.2235F, -17.2235F, 31.15F, 1, 1, 1, -0.201F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 108, 143, 16.2235F, -17.2235F, 29.95F, 1, 1, 1, -0.201F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 142, 141, 16.2235F, -17.2235F, 28.75F, 1, 1, 1, -0.201F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(0.8F, 24.0743F, -21.9995F);
		rails8.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.0F, 0.0F, -0.7854F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 142, 135, 16.2236F, -17.2236F, 22.7F, 1, 1, 1, -0.201F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 56, 142, 16.2236F, -17.2236F, 23.9F, 1, 1, 1, -0.201F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 27, 142, 16.2236F, -17.2236F, 17.9F, 1, 1, 1, -0.201F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 4, 142, 16.2236F, -17.2236F, 19.1F, 1, 1, 1, -0.201F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 139, 110, 16.2236F, -17.2236F, 20.3F, 1, 1, 1, -0.201F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 139, 103, 16.2236F, -17.2236F, 21.5F, 1, 1, 1, -0.201F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 139, 100, 16.2236F, -17.2236F, 13.1F, 1, 1, 1, -0.201F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 50, 139, 16.2236F, -17.2236F, 14.3F, 1, 1, 1, -0.201F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 139, 37, 16.2236F, -17.2236F, 15.5F, 1, 1, 1, -0.201F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 139, 28, 16.2236F, -17.2236F, 16.7F, 1, 1, 1, -0.201F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 27, 139, 16.2236F, -17.2236F, 11.9F, 1, 1, 1, -0.201F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 4, 139, 16.2235F, -17.2235F, 38.7F, 1, 1, 1, -0.201F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 138, 69, 16.2235F, -17.2235F, 39.9F, 1, 1, 1, -0.201F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 138, 66, 16.2235F, -17.2235F, 33.9F, 1, 1, 1, -0.201F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 40, 138, 16.2235F, -17.2235F, 35.1F, 1, 1, 1, -0.201F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 17, 138, 16.2235F, -17.2235F, 36.3F, 1, 1, 1, -0.201F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 137, 56, 16.2235F, -17.2235F, 37.5F, 1, 1, 1, -0.201F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 50, 136, 16.2235F, -17.2235F, 29.1F, 1, 1, 1, -0.201F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 136, 13, 16.2235F, -17.2235F, 30.3F, 1, 1, 1, -0.201F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 136, 9, 16.2235F, -17.2235F, 31.5F, 1, 1, 1, -0.201F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 136, 4, 16.2235F, -17.2235F, 32.7F, 1, 1, 1, -0.201F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 136, 0, 16.2235F, -17.2235F, 27.9F, 1, 1, 1, -0.201F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 63, 135, 16.2235F, -17.2235F, 26.7F, 1, 1, 1, -0.201F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 135, 40, 16.2235F, -17.2235F, 25.5F, 1, 1, 1, -0.201F, false));

		rails9 = new ModelRenderer(this);
		rails9.setRotationPoint(-1.5F, -40.1993F, -47.0831F);
		sportrifle.addChild(rails9);
		rails9.cubeList.add(new ModelBox(rails9, 27, 134, 0.0F, -0.5257F, -0.3821F, 1, 1, 1, -0.2F, false));
		rails9.cubeList.add(new ModelBox(rails9, 4, 134, 0.0F, -0.5257F, 0.8179F, 1, 1, 1, -0.2F, false));
		rails9.cubeList.add(new ModelBox(rails9, 98, 133, 0.0F, -0.5257F, 2.0179F, 1, 1, 1, -0.2F, false));
		rails9.cubeList.add(new ModelBox(rails9, 70, 24, 0.0F, -0.5257F, 3.2179F, 1, 1, 3, -0.2F, false));
		rails9.cubeList.add(new ModelBox(rails9, 133, 83, -1.0F, -0.5243F, -0.3831F, 1, 1, 1, -0.2F, false));
		rails9.cubeList.add(new ModelBox(rails9, 62, 133, -1.0F, -0.5243F, 0.8169F, 1, 1, 1, -0.2F, false));
		rails9.cubeList.add(new ModelBox(rails9, 50, 130, -1.0F, -0.5243F, 2.0169F, 1, 1, 1, -0.2F, false));
		rails9.cubeList.add(new ModelBox(rails9, 30, 68, -1.0F, -0.5243F, 3.2169F, 1, 1, 3, -0.2F, false));
		rails9.cubeList.add(new ModelBox(rails9, 20, 68, -0.4F, -0.5243F, 3.2169F, 1, 1, 3, -0.2F, false));
		rails9.cubeList.add(new ModelBox(rails9, 121, 126, 0.0F, -0.5257F, -6.5321F, 1, 1, 6, -0.2F, false));
		rails9.cubeList.add(new ModelBox(rails9, 104, 126, -1.0F, -0.5243F, -6.5331F, 1, 1, 6, -0.2F, false));
		rails9.cubeList.add(new ModelBox(rails9, 23, 115, -0.5F, -0.5243F, -6.5331F, 1, 1, 6, -0.2F, false));
		rails9.cubeList.add(new ModelBox(rails9, 77, 61, -1.0F, 0.0493F, -6.3321F, 2, 1, 12, 0.0F, false));
		rails9.cubeList.add(new ModelBox(rails9, 30, 34, -1.0F, 0.0493F, 5.0929F, 2, 1, 1, 0.0F, false));
		rails9.cubeList.add(new ModelBox(rails9, 27, 130, 0.0F, -0.5257F, -16.3821F, 1, 1, 1, -0.2F, false));
		rails9.cubeList.add(new ModelBox(rails9, 4, 130, 0.0F, -0.5257F, -15.1821F, 1, 1, 1, -0.2F, false));
		rails9.cubeList.add(new ModelBox(rails9, 128, 101, 0.0F, -0.5257F, -13.9821F, 1, 1, 1, -0.2F, false));
		rails9.cubeList.add(new ModelBox(rails9, 10, 68, 0.0F, -0.5257F, -12.7821F, 1, 1, 3, -0.2F, false));
		rails9.cubeList.add(new ModelBox(rails9, 128, 80, -1.0F, -0.5243F, -16.3831F, 1, 1, 1, -0.2F, false));
		rails9.cubeList.add(new ModelBox(rails9, 17, 126, -1.0F, -0.5243F, -15.1831F, 1, 1, 1, -0.2F, false));
		rails9.cubeList.add(new ModelBox(rails9, 17, 124, -1.0F, -0.5243F, -13.9831F, 1, 1, 1, -0.2F, false));
		rails9.cubeList.add(new ModelBox(rails9, 0, 68, -1.0F, -0.5243F, -12.7831F, 1, 1, 3, -0.2F, false));
		rails9.cubeList.add(new ModelBox(rails9, 30, 63, -0.4F, -0.5243F, -12.7831F, 1, 1, 3, -0.2F, false));
		rails9.cubeList.add(new ModelBox(rails9, 20, 63, 0.0F, -0.5257F, -19.5321F, 1, 1, 3, -0.2F, false));
		rails9.cubeList.add(new ModelBox(rails9, 10, 63, -1.0F, -0.5243F, -19.5331F, 1, 1, 3, -0.2F, false));
		rails9.cubeList.add(new ModelBox(rails9, 0, 63, -0.5F, -0.5243F, -19.5331F, 1, 1, 3, -0.2F, false));
		rails9.cubeList.add(new ModelBox(rails9, 152, 23, -1.0F, 0.0493F, -19.3321F, 2, 1, 9, 0.0F, false));
		rails9.cubeList.add(new ModelBox(rails9, 20, 34, -1.0F, 0.0493F, -10.9071F, 2, 1, 1, 0.0F, false));
		rails9.cubeList.add(new ModelBox(rails9, 30, 25, -1.0F, 0.0493F, -7.9071F, 2, 1, 1, 0.0F, false));
		rails9.cubeList.add(new ModelBox(rails9, 75, 123, -1.0F, -0.5243F, -7.7081F, 1, 1, 1, -0.2F, false));
		rails9.cubeList.add(new ModelBox(rails9, 123, 22, -0.4F, -0.5243F, -7.7081F, 1, 1, 1, -0.2F, false));
		rails9.cubeList.add(new ModelBox(rails9, 95, 122, 0.0F, -0.5257F, -7.7071F, 1, 1, 1, -0.2F, false));
		rails9.cubeList.add(new ModelBox(rails9, 87, 122, 0.0F, -0.5257F, -8.1071F, 1, 1, 1, -0.2F, false));
		rails9.cubeList.add(new ModelBox(rails9, 118, 119, -0.4F, -0.5243F, -8.1081F, 1, 1, 1, -0.2F, false));
		rails9.cubeList.add(new ModelBox(rails9, 117, 61, -1.0F, -0.5243F, -8.1081F, 1, 1, 1, -0.2F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(-0.8F, 23.7493F, -21.5321F);
		rails9.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.0F, 0.0F, -0.7854F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 115, 22, 16.2236F, -17.2236F, 21.15F, 1, 1, 1, -0.201F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 111, 63, 16.2236F, -17.2236F, 22.35F, 1, 1, 1, -0.201F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 106, 101, 16.2236F, -17.2236F, 23.55F, 1, 1, 1, -0.201F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 30, 59, 16.2236F, -17.2236F, 24.75F, 1, 1, 3, -0.201F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 23, 108, 16.2236F, -17.2236F, 15.0F, 1, 1, 6, -0.201F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 23, 104, 16.2236F, -17.2236F, 5.15F, 1, 1, 1, -0.201F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 103, 97, 16.2236F, -17.2236F, 6.35F, 1, 1, 1, -0.201F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 43, 103, 16.2236F, -17.2236F, 7.55F, 1, 1, 1, -0.201F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 20, 59, 16.2236F, -17.2236F, 8.75F, 1, 1, 3, -0.201F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 34, 103, 16.2236F, -17.2236F, 13.825F, 1, 1, 1, -0.201F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 102, 93, 16.2236F, -17.2236F, 13.425F, 1, 1, 1, -0.201F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 10, 59, 16.2236F, -17.2236F, 2.0F, 1, 1, 3, -0.201F, false));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(0.8F, 23.7493F, -18.2821F);
		rails9.addChild(cube_r34);
		setRotationAngle(cube_r34, 0.0F, 0.0F, -0.7854F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 100, 41, 16.2236F, -17.2236F, 17.9F, 1, 1, 1, -0.201F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 89, 21, 16.2236F, -17.2236F, 19.1F, 1, 1, 1, -0.201F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 22, 88, 16.2236F, -17.2236F, 20.3F, 1, 1, 1, -0.201F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 59, 16.2236F, -17.2236F, 21.5F, 1, 1, 3, -0.201F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 96, 104, 16.2236F, -17.2236F, 11.75F, 1, 1, 6, -0.201F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 8, 88, 16.2236F, -17.2236F, 1.9F, 1, 1, 1, -0.201F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 85, 70, 16.2236F, -17.2236F, 3.1F, 1, 1, 1, -0.201F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 51, 75, 16.2236F, -17.2236F, 4.3F, 1, 1, 1, -0.201F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 30, 53, 16.2236F, -17.2236F, 5.5F, 1, 1, 3, -0.201F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 74, 29, 16.2236F, -17.2236F, 10.575F, 1, 1, 1, -0.201F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 57, 10, 16.2236F, -17.2236F, 10.175F, 1, 1, 1, -0.201F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 30, 49, 16.2236F, -17.2236F, -1.25F, 1, 1, 3, -0.201F, false));

		rails10 = new ModelRenderer(this);
		rails10.setRotationPoint(0.9F, -34.4993F, -47.0831F);
		sportrifle.addChild(rails10);
		setRotationAngle(rails10, 3.1416F, 0.0F, -1.5708F);
		

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(-0.8F, 23.7493F, -21.5321F);
		rails10.addChild(cube_r35);
		setRotationAngle(cube_r35, 0.0F, 0.0F, -0.7854F);
		

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(0.8F, 23.7493F, -18.2821F);
		rails10.addChild(cube_r36);
		setRotationAngle(cube_r36, 0.0F, 0.0F, -0.7854F);
		

		gunparts3 = new ModelRenderer(this);
		gunparts3.setRotationPoint(0.0F, 0.0F, 0.0F);
		sportrifle.addChild(gunparts3);
		gunparts3.cubeList.add(new ModelBox(gunparts3, 81, 126, -2.2F, -35.9F, -54.0F, 1, 1, 21, 0.0F, false));
		gunparts3.cubeList.add(new ModelBox(gunparts3, 115, 123, -2.0F, -36.0F, -54.0F, 1, 1, 21, 0.0F, false));
		gunparts3.cubeList.add(new ModelBox(gunparts3, 112, 101, -1.8F, -35.9F, -54.0F, 1, 1, 21, 0.0F, false));
		gunparts3.cubeList.add(new ModelBox(gunparts3, 111, 61, -1.7F, -35.7F, -54.0F, 1, 1, 21, 0.0F, false));
		gunparts3.cubeList.add(new ModelBox(gunparts3, 109, 0, -2.3F, -35.7F, -54.0F, 1, 1, 21, 0.0F, false));
		gunparts3.cubeList.add(new ModelBox(gunparts3, 0, 108, -2.2F, -35.5F, -54.0F, 1, 1, 21, 0.0F, false));
		gunparts3.cubeList.add(new ModelBox(gunparts3, 58, 106, -1.8F, -35.5F, -54.0F, 1, 1, 21, 0.0F, false));
		gunparts3.cubeList.add(new ModelBox(gunparts3, 106, 30, -2.0F, -35.4F, -54.0F, 1, 1, 21, 0.0F, false));
		gunparts3.cubeList.add(new ModelBox(gunparts3, 20, 68, -2.2F, -38.5F, -56.1F, 1, 1, 8, 0.0F, false));
		gunparts3.cubeList.add(new ModelBox(gunparts3, 0, 68, -2.2F, -38.5F, -49.0F, 1, 1, 8, 0.0F, false));
		gunparts3.cubeList.add(new ModelBox(gunparts3, 20, 59, -1.8F, -38.5F, -56.1F, 1, 1, 8, 0.0F, false));
		gunparts3.cubeList.add(new ModelBox(gunparts3, 0, 59, -1.8F, -38.5F, -49.0F, 1, 1, 8, 0.0F, false));
		gunparts3.cubeList.add(new ModelBox(gunparts3, 41, 48, -1.8F, -38.9F, -55.1F, 1, 1, 7, 0.0F, false));
		gunparts3.cubeList.add(new ModelBox(gunparts3, 41, 40, -1.8F, -38.9F, -48.0F, 1, 1, 7, 0.0F, false));
		gunparts3.cubeList.add(new ModelBox(gunparts3, 90, 32, -2.2F, -38.9F, -54.1F, 1, 1, 6, 0.0F, false));
		gunparts3.cubeList.add(new ModelBox(gunparts3, 89, 48, -2.2F, -38.9F, -47.0F, 1, 1, 6, 0.0F, false));
		gunparts3.cubeList.add(new ModelBox(gunparts3, 20, 49, -1.7F, -38.7F, -56.1F, 1, 1, 8, 0.0F, false));
		gunparts3.cubeList.add(new ModelBox(gunparts3, 0, 49, -1.7F, -38.7F, -49.0F, 1, 1, 8, 0.0F, false));
		gunparts3.cubeList.add(new ModelBox(gunparts3, 20, 40, -2.3F, -38.7F, -56.1F, 1, 1, 8, 0.0F, false));
		gunparts3.cubeList.add(new ModelBox(gunparts3, 0, 40, -2.3F, -38.7F, -49.0F, 1, 1, 8, 0.0F, false));
		gunparts3.cubeList.add(new ModelBox(gunparts3, 20, 28, -2.0F, -38.4F, -56.1F, 1, 1, 8, 0.0F, false));
		gunparts3.cubeList.add(new ModelBox(gunparts3, 20, 19, -2.0F, -38.4F, -49.0F, 1, 1, 8, 0.0F, false));
		gunparts3.cubeList.add(new ModelBox(gunparts3, 20, 9, -2.0F, -39.0F, -56.1F, 1, 1, 8, 0.0F, false));
		gunparts3.cubeList.add(new ModelBox(gunparts3, 20, 0, -2.0F, -39.0F, -49.0F, 1, 1, 8, 0.0F, false));
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