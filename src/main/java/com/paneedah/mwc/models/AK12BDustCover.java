package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AK12BDustCover extends ModelBase {
	private final ModelRenderer dustcover_b;
	private final ModelRenderer bone;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r50;
	private final ModelRenderer cube_r51;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer gun26_r3;
	private final ModelRenderer gun28_r1;
	private final ModelRenderer gun27_r2;
	private final ModelRenderer gun27_r3;
	private final ModelRenderer gun28_r2;
	private final ModelRenderer gun27_r4;
	private final ModelRenderer gun27_r5;
	private final ModelRenderer gun28_r3;
	private final ModelRenderer gun32_r1;
	private final ModelRenderer gun31_r1;
	private final ModelRenderer gun33_r1;
	private final ModelRenderer gun32_r2;
	private final ModelRenderer gun309_r1;
	private final ModelRenderer gun308_r2;
	private final ModelRenderer gun308_r3;
	private final ModelRenderer gun307_r3;

	public AK12BDustCover() {
		textureWidth = 200;
		textureHeight = 200;

		dustcover_b = new ModelRenderer(this);
		dustcover_b.setRotationPoint(0.0F, 24.0F, 0.0F);
		dustcover_b.cubeList.add(new ModelBox(dustcover_b, 0, 35, -2.6F, -39.001F, -33.0F, 2, 1, 34, 0.0F, false));
		dustcover_b.cubeList.add(new ModelBox(dustcover_b, 72, 72, -1.4F, -39.001F, -33.0F, 1, 1, 34, 0.0F, false));
		dustcover_b.cubeList.add(new ModelBox(dustcover_b, 36, 71, -1.2F, -38.35F, -33.0F, 1, 1, 34, 0.0F, false));
		dustcover_b.cubeList.add(new ModelBox(dustcover_b, 99, 145, 0.0F, -35.7F, -16.2F, 1, 1, 17, -0.2F, false));
		dustcover_b.cubeList.add(new ModelBox(dustcover_b, 101, 117, -2.899F, -35.701F, 0.201F, 4, 1, 3, -0.2F, false));
		dustcover_b.cubeList.add(new ModelBox(dustcover_b, 86, 81, -2.9F, -35.701F, -0.199F, 4, 1, 1, -0.2F, false));
		dustcover_b.cubeList.add(new ModelBox(dustcover_b, 38, 53, -4.0F, -35.7F, -16.2F, 1, 1, 15, -0.2F, false));
		dustcover_b.cubeList.add(new ModelBox(dustcover_b, 28, 78, -4.0F, -35.7F, -1.8F, 1, 1, 1, -0.2F, false));
		dustcover_b.cubeList.add(new ModelBox(dustcover_b, 17, 78, -4.0F, -35.7F, 1.8F, 1, 1, 1, -0.2F, false));
		dustcover_b.cubeList.add(new ModelBox(dustcover_b, 18, 13, -4.0F, -35.7F, 2.2F, 2, 1, 1, -0.2F, false));
		dustcover_b.cubeList.add(new ModelBox(dustcover_b, 0, 0, -2.8F, -38.35F, -33.0F, 2, 1, 34, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		dustcover_b.addChild(bone);
		

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-0.7F, -43.1F, -47.75F);
		bone.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 128, 60, -1.8F, 3.5F, 38.0F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 129, 60, -1.8F, 3.5F, 36.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 129, 60, -1.8F, 3.5F, 39.25F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 129, 61, -1.8F, 3.5F, 40.5F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 129, 60, -1.8F, 3.5F, 41.75F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 129, 61, -1.8F, 3.5F, 43.0F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 128, 60, -1.8F, 3.5F, 44.25F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 127, 61, -1.8F, 3.5F, 45.5F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 128, 61, -1.8F, 3.5F, 46.75F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 129, 60, -1.8F, 3.5F, 47.95F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 59, 17, -1.7F, 4.1F, 35.7F, 2, 1, 13, -0.001F, false));
		bone3.cubeList.add(new ModelBox(bone3, 46, 51, -1.9F, 4.1F, 35.7F, 1, 1, 13, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 141, 72, -1.8F, 3.5F, 35.5F, 2, 1, 1, -0.199F, false));

		cube_r50 = new ModelRenderer(this);
		cube_r50.setRotationPoint(-1.6F, 0.0F, -1.25F);
		bone3.addChild(cube_r50);
		setRotationAngle(cube_r50, 0.0F, 0.0F, 0.8901F);
		cube_r50.cubeList.add(new ModelBox(cube_r50, 130, 59, 2.6754F, 2.1285F, 36.75F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 58, 54, 2.6254F, 2.2785F, 35.15F, 1, 1, 15, -0.35F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 130, 62, 2.6754F, 2.1285F, 48.0F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 129, 63, 2.6754F, 2.1285F, 49.2F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 130, 61, 2.6754F, 2.1285F, 46.75F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 129, 60, 2.6754F, 2.1285F, 45.5F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 131, 60, 2.6754F, 2.1285F, 44.25F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 129, 61, 2.6754F, 2.1285F, 43.0F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 136, 72, 2.6754F, 2.1285F, 41.75F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 130, 61, 2.6754F, 2.1285F, 40.5F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 130, 62, 2.6754F, 2.1285F, 39.25F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 130, 61, 2.6754F, 2.1285F, 38.05F, 1, 1, 1, -0.198F, false));

		cube_r51 = new ModelRenderer(this);
		cube_r51.setRotationPoint(0.0F, 0.0F, -1.25F);
		bone3.addChild(cube_r51);
		setRotationAngle(cube_r51, 0.0F, 0.0F, -0.8901F);
		cube_r51.cubeList.add(new ModelBox(cube_r51, 129, 59, -3.6754F, 2.1285F, 36.75F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 59, 54, -3.6254F, 2.2785F, 35.15F, 1, 1, 15, -0.35F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 72, 8, -3.6754F, 2.1285F, 48.0F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 129, 58, -3.6754F, 2.1285F, 49.2F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 131, 63, -3.6754F, 2.1285F, 46.75F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 128, 61, -3.6754F, 2.1285F, 45.5F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 129, 60, -3.6754F, 2.1285F, 44.25F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 131, 60, -3.6754F, 2.1285F, 43.0F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 129, 62, -3.6754F, 2.1285F, 41.75F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 130, 62, -3.6754F, 2.1285F, 40.5F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 131, 62, -3.6754F, 2.1285F, 39.25F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 131, 62, -3.6754F, 2.1285F, 38.05F, 1, 1, 1, -0.198F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-0.7F, -43.1F, -61.45F);
		bone.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 128, 60, -1.8F, 3.5F, 38.0F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 129, 60, -1.8F, 3.5F, 36.8F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 129, 60, -1.8F, 3.5F, 39.25F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 129, 61, -1.8F, 3.5F, 40.5F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 129, 60, -1.8F, 3.5F, 41.75F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 129, 61, -1.8F, 3.5F, 43.0F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 128, 60, -1.8F, 3.5F, 44.25F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 127, 61, -1.8F, 3.5F, 45.5F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 128, 61, -1.8F, 3.5F, 46.75F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 129, 60, -1.8F, 3.5F, 47.95F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 59, 17, -1.7F, 4.1F, 35.7F, 2, 1, 13, -0.001F, false));
		bone2.cubeList.add(new ModelBox(bone2, 46, 51, -1.9F, 4.1F, 35.7F, 1, 1, 13, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 141, 72, -1.8F, 3.5F, 35.5F, 2, 1, 1, -0.199F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.6F, 0.0F, -1.25F);
		bone2.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.8901F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 130, 59, 2.6754F, 2.1285F, 36.75F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 58, 54, 2.6254F, 2.2785F, 35.15F, 1, 1, 15, -0.35F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 130, 62, 2.6754F, 2.1285F, 48.0F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 129, 63, 2.6754F, 2.1285F, 49.2F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 130, 61, 2.6754F, 2.1285F, 46.75F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 129, 60, 2.6754F, 2.1285F, 45.5F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 131, 60, 2.6754F, 2.1285F, 44.25F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 129, 61, 2.6754F, 2.1285F, 43.0F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 136, 72, 2.6754F, 2.1285F, 41.75F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 130, 61, 2.6754F, 2.1285F, 40.5F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 130, 62, 2.6754F, 2.1285F, 39.25F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 130, 61, 2.6754F, 2.1285F, 38.05F, 1, 1, 1, -0.198F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 0.0F, -1.25F);
		bone2.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.8901F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 129, 59, -3.6754F, 2.1285F, 36.75F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 59, 54, -3.6254F, 2.2785F, 35.15F, 1, 1, 15, -0.35F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 72, 8, -3.6754F, 2.1285F, 48.0F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 129, 58, -3.6754F, 2.1285F, 49.2F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 131, 63, -3.6754F, 2.1285F, 46.75F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 128, 61, -3.6754F, 2.1285F, 45.5F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 129, 60, -3.6754F, 2.1285F, 44.25F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 131, 60, -3.6754F, 2.1285F, 43.0F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 129, 62, -3.6754F, 2.1285F, 41.75F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 130, 62, -3.6754F, 2.1285F, 40.5F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 131, 62, -3.6754F, 2.1285F, 39.25F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 131, 62, -3.6754F, 2.1285F, 38.05F, 1, 1, 1, -0.198F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-0.7F, -43.1F, -75.15F);
		bone.addChild(bone4);
		bone4.cubeList.add(new ModelBox(bone4, 129, 60, -1.8F, 3.5F, 41.75F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 129, 61, -1.8F, 3.5F, 43.0F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 128, 60, -1.8F, 3.5F, 44.25F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 127, 61, -1.8F, 3.5F, 45.5F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 128, 61, -1.8F, 3.5F, 46.75F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 129, 60, -1.8F, 3.5F, 47.95F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 65, 22, -1.7F, 4.1F, 41.7F, 2, 1, 7, -0.001F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.6F, 0.0F, -1.25F);
		bone4.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.8901F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 65, 61, 2.6254F, 2.2785F, 43.15F, 1, 1, 7, -0.35F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 130, 62, 2.6754F, 2.1285F, 48.0F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 129, 63, 2.6754F, 2.1285F, 49.2F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 130, 61, 2.6754F, 2.1285F, 46.75F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 129, 60, 2.6754F, 2.1285F, 45.5F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 131, 60, 2.6754F, 2.1285F, 44.25F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 129, 61, 2.6754F, 2.1285F, 43.0F, 1, 1, 1, -0.198F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 0.0F, -1.25F);
		bone4.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.8901F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 66, 61, -3.6254F, 2.2785F, 43.15F, 1, 1, 7, -0.35F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 72, 8, -3.6754F, 2.1285F, 48.0F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 129, 58, -3.6754F, 2.1285F, 49.2F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 131, 63, -3.6754F, 2.1285F, 46.75F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 128, 61, -3.6754F, 2.1285F, 45.5F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 129, 60, -3.6754F, 2.1285F, 44.25F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 131, 60, -3.6754F, 2.1285F, 43.0F, 1, 1, 1, -0.198F, false));

		gun26_r3 = new ModelRenderer(this);
		gun26_r3.setRotationPoint(-3.8F, -35.5F, -16.0F);
		dustcover_b.addChild(gun26_r3);
		setRotationAngle(gun26_r3, 0.0F, 0.0F, -1.2392F);
		gun26_r3.cubeList.add(new ModelBox(gun26_r3, 145, 108, 2.0F, 0.0F, -17.0F, 1, 1, 17, 0.0F, false));
		gun26_r3.cubeList.add(new ModelBox(gun26_r3, 98, 127, 0.0F, 0.0F, 0.0F, 3, 1, 17, 0.0F, false));

		gun28_r1 = new ModelRenderer(this);
		gun28_r1.setRotationPoint(0.9F, -35.5F, 0.001F);
		dustcover_b.addChild(gun28_r1);
		setRotationAngle(gun28_r1, 0.0F, 0.0F, 1.2392F);
		gun28_r1.cubeList.add(new ModelBox(gun28_r1, 90, 49, -3.0F, -0.002F, 0.0F, 3, 1, 1, 0.0F, false));

		gun27_r2 = new ModelRenderer(this);
		gun27_r2.setRotationPoint(-3.9F, -35.5F, 0.001F);
		dustcover_b.addChild(gun27_r2);
		setRotationAngle(gun27_r2, 0.0F, 0.0F, -1.2392F);
		gun27_r2.cubeList.add(new ModelBox(gun27_r2, 90, 51, 0.0F, -0.002F, 0.0F, 3, 1, 1, 0.0F, false));
		gun27_r2.cubeList.add(new ModelBox(gun27_r2, 0, 13, 0.0F, -0.001F, 0.599F, 2, 1, 1, 0.0F, false));

		gun27_r3 = new ModelRenderer(this);
		gun27_r3.setRotationPoint(0.8F, -35.5F, -16.0F);
		dustcover_b.addChild(gun27_r3);
		setRotationAngle(gun27_r3, 0.0F, 0.0F, 1.2392F);
		gun27_r3.cubeList.add(new ModelBox(gun27_r3, 0, 70, -3.0F, 0.0F, -17.0F, 1, 1, 34, 0.0F, false));
		gun27_r3.cubeList.add(new ModelBox(gun27_r3, 20, 96, -2.1F, 0.201F, 0.0F, 1, 1, 6, 0.0F, false));
		gun27_r3.cubeList.add(new ModelBox(gun27_r3, 108, 70, -1.5F, 0.001F, 0.0F, 1, 1, 6, 0.0F, false));
		gun27_r3.cubeList.add(new ModelBox(gun27_r3, 108, 88, -2.0F, 0.0F, 6.0F, 2, 1, 11, 0.0F, false));
		gun27_r3.cubeList.add(new ModelBox(gun27_r3, 108, 77, -1.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));

		gun28_r2 = new ModelRenderer(this);
		gun28_r2.setRotationPoint(-3.9F, -35.5F, 2.8F);
		dustcover_b.addChild(gun28_r2);
		setRotationAngle(gun28_r2, 0.0F, 0.5411F, -1.2392F);
		gun28_r2.cubeList.add(new ModelBox(gun28_r2, 90, 53, 0.0F, 0.0F, -1.0F, 3, 1, 1, 0.0F, false));

		gun27_r4 = new ModelRenderer(this);
		gun27_r4.setRotationPoint(0.9F, -35.5F, 2.8F);
		dustcover_b.addChild(gun27_r4);
		setRotationAngle(gun27_r4, 0.0F, -0.5411F, 1.2392F);
		gun27_r4.cubeList.add(new ModelBox(gun27_r4, 90, 55, -3.0F, 0.0F, -1.0F, 3, 1, 1, 0.0F, false));

		gun27_r5 = new ModelRenderer(this);
		gun27_r5.setRotationPoint(0.9F, -35.5F, -16.4F);
		dustcover_b.addChild(gun27_r5);
		setRotationAngle(gun27_r5, 0.0F, 0.0F, 1.2392F);
		gun27_r5.cubeList.add(new ModelBox(gun27_r5, 18, 4, -2.0F, -0.001F, 17.0F, 2, 1, 1, 0.0F, false));

		gun28_r3 = new ModelRenderer(this);
		gun28_r3.setRotationPoint(0.8F, -35.5F, -16.0F);
		dustcover_b.addChild(gun28_r3);
		setRotationAngle(gun28_r3, 0.0F, -0.4014F, 1.2392F);
		gun28_r3.cubeList.add(new ModelBox(gun28_r3, 8, 77, -1.3F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun28_r3.cubeList.add(new ModelBox(gun28_r3, 11, 78, -1.0F, -0.001F, 0.0F, 1, 1, 1, 0.0F, false));

		gun32_r1 = new ModelRenderer(this);
		gun32_r1.setRotationPoint(-2.95F, -38.35F, -1.75F);
		dustcover_b.addChild(gun32_r1);
		setRotationAngle(gun32_r1, 0.0F, 0.0F, 0.4014F);
		gun32_r1.cubeList.add(new ModelBox(gun32_r1, 56, 40, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));
		gun32_r1.cubeList.add(new ModelBox(gun32_r1, 46, 56, 0.0F, 0.0F, -4.0F, 1, 2, 1, 0.0F, false));
		gun32_r1.cubeList.add(new ModelBox(gun32_r1, 56, 48, 0.0F, 0.0F, -8.0F, 1, 2, 1, 0.0F, false));

		gun31_r1 = new ModelRenderer(this);
		gun31_r1.setRotationPoint(-0.05F, -38.35F, -1.75F);
		dustcover_b.addChild(gun31_r1);
		setRotationAngle(gun31_r1, 0.0F, 0.0F, -0.4014F);
		gun31_r1.cubeList.add(new ModelBox(gun31_r1, 0, 59, -1.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));
		gun31_r1.cubeList.add(new ModelBox(gun31_r1, 8, 59, -1.0F, 0.0F, -4.0F, 1, 2, 1, 0.0F, false));
		gun31_r1.cubeList.add(new ModelBox(gun31_r1, 20, 59, -1.0F, 0.0F, -8.0F, 1, 2, 1, 0.0F, false));

		gun33_r1 = new ModelRenderer(this);
		gun33_r1.setRotationPoint(-3.68F, -36.5F, -1.75F);
		dustcover_b.addChild(gun33_r1);
		setRotationAngle(gun33_r1, 0.0F, 0.0F, -0.0175F);
		gun33_r1.cubeList.add(new ModelBox(gun33_r1, 76, 57, -0.05F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun33_r1.cubeList.add(new ModelBox(gun33_r1, 76, 62, -0.05F, 0.0F, -4.0F, 1, 1, 1, 0.0F, false));
		gun33_r1.cubeList.add(new ModelBox(gun33_r1, 76, 64, -0.05F, 0.0F, -8.0F, 1, 1, 1, 0.0F, false));

		gun32_r2 = new ModelRenderer(this);
		gun32_r2.setRotationPoint(0.72F, -36.5F, -1.75F);
		dustcover_b.addChild(gun32_r2);
		setRotationAngle(gun32_r2, 0.0F, 0.0F, 0.0175F);
		gun32_r2.cubeList.add(new ModelBox(gun32_r2, 66, 76, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun32_r2.cubeList.add(new ModelBox(gun32_r2, 76, 66, -1.0F, 0.0F, -4.0F, 1, 1, 1, 0.0F, false));
		gun32_r2.cubeList.add(new ModelBox(gun32_r2, 0, 77, -1.0F, 0.0F, -8.0F, 1, 1, 1, 0.0F, false));

		gun309_r1 = new ModelRenderer(this);
		gun309_r1.setRotationPoint(-1.35F, -39.0F, 1.0F);
		dustcover_b.addChild(gun309_r1);
		setRotationAngle(gun309_r1, -1.2672F, 0.0F, 0.0F);
		gun309_r1.cubeList.add(new ModelBox(gun309_r1, 0, 79, -0.051F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun309_r1.cubeList.add(new ModelBox(gun309_r1, 28, 4, -1.251F, -0.001F, 0.0F, 2, 1, 1, 0.0F, false));

		gun308_r2 = new ModelRenderer(this);
		gun308_r2.setRotationPoint(-1.8F, -35.5F, 3.0F);
		dustcover_b.addChild(gun308_r2);
		setRotationAngle(gun308_r2, 0.576F, 0.0F, 0.0F);
		gun308_r2.cubeList.add(new ModelBox(gun308_r2, 28, 13, -1.001F, -3.4F, -1.0F, 2, 1, 1, 0.0F, false));
		gun308_r2.cubeList.add(new ModelBox(gun308_r2, 100, 10, 0.599F, -3.4F, -0.999F, 1, 1, 1, 0.0F, false));
		gun308_r2.cubeList.add(new ModelBox(gun308_r2, 28, 0, -1.1F, -3.0F, -0.999F, 2, 3, 1, 0.0F, false));
		gun308_r2.cubeList.add(new ModelBox(gun308_r2, 49, 10, 0.7F, -3.0F, -1.0F, 1, 3, 1, 0.0F, false));

		gun308_r3 = new ModelRenderer(this);
		gun308_r3.setRotationPoint(-3.9F, -35.5F, 3.0F);
		dustcover_b.addChild(gun308_r3);
		setRotationAngle(gun308_r3, 0.5568F, -0.1501F, 0.2443F);
		gun308_r3.cubeList.add(new ModelBox(gun308_r3, 0, 44, 0.0F, -3.0F, -1.0F, 1, 3, 1, 0.0F, false));

		gun307_r3 = new ModelRenderer(this);
		gun307_r3.setRotationPoint(0.9F, -35.5F, 3.0F);
		dustcover_b.addChild(gun307_r3);
		setRotationAngle(gun307_r3, 0.5568F, 0.1501F, -0.2443F);
		gun307_r3.cubeList.add(new ModelBox(gun307_r3, 12, 44, -1.0F, -3.0F, -1.0F, 1, 3, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		dustcover_b.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}