package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AK12DustCover extends ModelBase {
	private final ModelRenderer dustcover;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer bone7;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer bone8;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer gun25_r1;
	private final ModelRenderer gun26_r1;
	private final ModelRenderer gun27_r1;
	private final ModelRenderer gun26_r2;
	private final ModelRenderer gun308_r1;
	private final ModelRenderer gun307_r1;
	private final ModelRenderer gun307_r2;
	private final ModelRenderer gun306_r1;

	public AK12DustCover() {
		textureWidth = 200;
		textureHeight = 200;

		dustcover = new ModelRenderer(this);
		dustcover.setRotationPoint(0.0F, 24.0F, 0.0F);
		dustcover.cubeList.add(new ModelBox(dustcover, 38, 1, -2.6F, -39.001F, -33.0F, 2, 1, 34, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 76, 0, -1.4F, -39.001F, -33.0F, 1, 1, 34, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 76, 35, -1.2F, -38.35F, -33.0F, 1, 1, 34, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 61, 107, 0.0F, -35.7F, -16.2F, 1, 1, 19, -0.2F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 90, 10, -2.999F, -35.701F, 2.201F, 4, 1, 1, -0.2F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 0, 70, -4.0F, -35.7F, -16.2F, 1, 1, 15, -0.2F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 100, 88, -4.0F, -35.7F, -1.8F, 1, 1, 1, -0.2F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 101, 56, -4.0F, -35.7F, 1.8F, 1, 1, 1, -0.2F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 56, 21, -4.0F, -35.7F, 2.2F, 2, 1, 1, -0.2F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 38, 36, -2.8F, -38.35F, -33.0F, 2, 1, 34, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, 0.0F, 0.0F);
		dustcover.addChild(bone5);
		

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-0.7F, -43.1F, -47.75F);
		bone5.addChild(bone6);
		bone6.cubeList.add(new ModelBox(bone6, 128, 60, -1.8F, 3.5F, 38.0F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 129, 60, -1.8F, 3.5F, 36.8F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 129, 60, -1.8F, 3.5F, 39.25F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 129, 61, -1.8F, 3.5F, 40.5F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 129, 60, -1.8F, 3.5F, 41.75F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 129, 61, -1.8F, 3.5F, 43.0F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 128, 60, -1.8F, 3.5F, 44.25F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 127, 61, -1.8F, 3.5F, 45.5F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 128, 61, -1.8F, 3.5F, 46.75F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 129, 60, -1.8F, 3.5F, 47.95F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 59, 17, -1.7F, 4.1F, 35.7F, 2, 1, 13, -0.001F, false));
		bone6.cubeList.add(new ModelBox(bone6, 46, 51, -1.9F, 4.1F, 35.7F, 1, 1, 13, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 141, 72, -1.8F, 3.5F, 35.5F, 2, 1, 1, -0.199F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-1.6F, 0.0F, -1.25F);
		bone6.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 0.8901F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 130, 59, 2.6754F, 2.1285F, 36.75F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 58, 54, 2.6254F, 2.2785F, 35.15F, 1, 1, 15, -0.35F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 130, 62, 2.6754F, 2.1285F, 48.0F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 129, 63, 2.6754F, 2.1285F, 49.2F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 130, 61, 2.6754F, 2.1285F, 46.75F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 129, 60, 2.6754F, 2.1285F, 45.5F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 131, 60, 2.6754F, 2.1285F, 44.25F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 129, 61, 2.6754F, 2.1285F, 43.0F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 136, 72, 2.6754F, 2.1285F, 41.75F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 130, 61, 2.6754F, 2.1285F, 40.5F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 130, 62, 2.6754F, 2.1285F, 39.25F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 130, 61, 2.6754F, 2.1285F, 38.05F, 1, 1, 1, -0.198F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 0.0F, -1.25F);
		bone6.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.8901F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 129, 59, -3.6754F, 2.1285F, 36.75F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 59, 54, -3.6254F, 2.2785F, 35.15F, 1, 1, 15, -0.35F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 72, 8, -3.6754F, 2.1285F, 48.0F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 129, 58, -3.6754F, 2.1285F, 49.2F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 131, 63, -3.6754F, 2.1285F, 46.75F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 128, 61, -3.6754F, 2.1285F, 45.5F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 129, 60, -3.6754F, 2.1285F, 44.25F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 131, 60, -3.6754F, 2.1285F, 43.0F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 129, 62, -3.6754F, 2.1285F, 41.75F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 130, 62, -3.6754F, 2.1285F, 40.5F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 131, 62, -3.6754F, 2.1285F, 39.25F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 131, 62, -3.6754F, 2.1285F, 38.05F, 1, 1, 1, -0.198F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-0.7F, -43.1F, -61.45F);
		bone5.addChild(bone7);
		bone7.cubeList.add(new ModelBox(bone7, 128, 60, -1.8F, 3.5F, 38.0F, 2, 1, 1, -0.199F, false));
		bone7.cubeList.add(new ModelBox(bone7, 129, 60, -1.8F, 3.5F, 36.8F, 2, 1, 1, -0.199F, false));
		bone7.cubeList.add(new ModelBox(bone7, 129, 60, -1.8F, 3.5F, 39.25F, 2, 1, 1, -0.199F, false));
		bone7.cubeList.add(new ModelBox(bone7, 129, 61, -1.8F, 3.5F, 40.5F, 2, 1, 1, -0.199F, false));
		bone7.cubeList.add(new ModelBox(bone7, 129, 60, -1.8F, 3.5F, 41.75F, 2, 1, 1, -0.199F, false));
		bone7.cubeList.add(new ModelBox(bone7, 129, 61, -1.8F, 3.5F, 43.0F, 2, 1, 1, -0.199F, false));
		bone7.cubeList.add(new ModelBox(bone7, 128, 60, -1.8F, 3.5F, 44.25F, 2, 1, 1, -0.199F, false));
		bone7.cubeList.add(new ModelBox(bone7, 127, 61, -1.8F, 3.5F, 45.5F, 2, 1, 1, -0.199F, false));
		bone7.cubeList.add(new ModelBox(bone7, 128, 61, -1.8F, 3.5F, 46.75F, 2, 1, 1, -0.199F, false));
		bone7.cubeList.add(new ModelBox(bone7, 129, 60, -1.8F, 3.5F, 47.95F, 2, 1, 1, -0.199F, false));
		bone7.cubeList.add(new ModelBox(bone7, 59, 17, -1.7F, 4.1F, 35.7F, 2, 1, 13, -0.001F, false));
		bone7.cubeList.add(new ModelBox(bone7, 46, 51, -1.9F, 4.1F, 35.7F, 1, 1, 13, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 141, 72, -1.8F, 3.5F, 35.5F, 2, 1, 1, -0.199F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-1.6F, 0.0F, -1.25F);
		bone7.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 0.8901F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 130, 59, 2.6754F, 2.1285F, 36.75F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 58, 54, 2.6254F, 2.2785F, 35.15F, 1, 1, 15, -0.35F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 130, 62, 2.6754F, 2.1285F, 48.0F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 129, 63, 2.6754F, 2.1285F, 49.2F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 130, 61, 2.6754F, 2.1285F, 46.75F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 129, 60, 2.6754F, 2.1285F, 45.5F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 131, 60, 2.6754F, 2.1285F, 44.25F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 129, 61, 2.6754F, 2.1285F, 43.0F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 136, 72, 2.6754F, 2.1285F, 41.75F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 130, 61, 2.6754F, 2.1285F, 40.5F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 130, 62, 2.6754F, 2.1285F, 39.25F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 130, 61, 2.6754F, 2.1285F, 38.05F, 1, 1, 1, -0.198F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, 0.0F, -1.25F);
		bone7.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -0.8901F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 129, 59, -3.6754F, 2.1285F, 36.75F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 59, 54, -3.6254F, 2.2785F, 35.15F, 1, 1, 15, -0.35F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 72, 8, -3.6754F, 2.1285F, 48.0F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 129, 58, -3.6754F, 2.1285F, 49.2F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 131, 63, -3.6754F, 2.1285F, 46.75F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 128, 61, -3.6754F, 2.1285F, 45.5F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 129, 60, -3.6754F, 2.1285F, 44.25F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 131, 60, -3.6754F, 2.1285F, 43.0F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 129, 62, -3.6754F, 2.1285F, 41.75F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 130, 62, -3.6754F, 2.1285F, 40.5F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 131, 62, -3.6754F, 2.1285F, 39.25F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 131, 62, -3.6754F, 2.1285F, 38.05F, 1, 1, 1, -0.198F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-0.7F, -43.1F, -75.15F);
		bone5.addChild(bone8);
		bone8.cubeList.add(new ModelBox(bone8, 129, 60, -1.8F, 3.5F, 41.75F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 129, 61, -1.8F, 3.5F, 43.0F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 128, 60, -1.8F, 3.5F, 44.25F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 127, 61, -1.8F, 3.5F, 45.5F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 128, 61, -1.8F, 3.5F, 46.75F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 129, 60, -1.8F, 3.5F, 47.95F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 65, 22, -1.7F, 4.1F, 41.7F, 2, 1, 7, -0.001F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-1.6F, 0.0F, -1.25F);
		bone8.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, 0.8901F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 65, 61, 2.6254F, 2.2785F, 43.15F, 1, 1, 7, -0.35F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 130, 62, 2.6754F, 2.1285F, 48.0F, 1, 1, 1, -0.198F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 129, 63, 2.6754F, 2.1285F, 49.2F, 1, 1, 1, -0.198F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 130, 61, 2.6754F, 2.1285F, 46.75F, 1, 1, 1, -0.198F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 129, 60, 2.6754F, 2.1285F, 45.5F, 1, 1, 1, -0.198F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 131, 60, 2.6754F, 2.1285F, 44.25F, 1, 1, 1, -0.198F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 129, 61, 2.6754F, 2.1285F, 43.0F, 1, 1, 1, -0.198F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.0F, 0.0F, -1.25F);
		bone8.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -0.8901F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 66, 61, -3.6254F, 2.2785F, 43.15F, 1, 1, 7, -0.35F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 72, 8, -3.6754F, 2.1285F, 48.0F, 1, 1, 1, -0.198F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 129, 58, -3.6754F, 2.1285F, 49.2F, 1, 1, 1, -0.198F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 131, 63, -3.6754F, 2.1285F, 46.75F, 1, 1, 1, -0.198F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 128, 61, -3.6754F, 2.1285F, 45.5F, 1, 1, 1, -0.198F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 129, 60, -3.6754F, 2.1285F, 44.25F, 1, 1, 1, -0.198F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 131, 60, -3.6754F, 2.1285F, 43.0F, 1, 1, 1, -0.198F, false));

		gun25_r1 = new ModelRenderer(this);
		gun25_r1.setRotationPoint(-3.8F, -35.5F, -16.0F);
		dustcover.addChild(gun25_r1);
		setRotationAngle(gun25_r1, 0.0F, 0.0F, -1.2392F);
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 55, 146, 2.0F, 0.0F, -17.0F, 1, 1, 17, 0.0F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 56, 4, 0.0F, -0.001F, 16.6F, 2, 1, 1, 0.0F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 133, 4, 0.0F, 0.0F, 0.0F, 3, 1, 17, 0.0F, false));

		gun26_r1 = new ModelRenderer(this);
		gun26_r1.setRotationPoint(0.8F, -35.5F, -16.0F);
		dustcover.addChild(gun26_r1);
		setRotationAngle(gun26_r1, 0.0F, 0.0F, 1.2392F);
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 19, 146, -3.0F, 0.0F, -17.0F, 1, 1, 17, 0.0F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 56, 2, -2.0F, -0.001F, 16.6F, 2, 1, 1, 0.0F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 121, 128, -3.0F, 0.0F, 0.0F, 3, 1, 17, 0.0F, false));

		gun27_r1 = new ModelRenderer(this);
		gun27_r1.setRotationPoint(-3.8F, -35.5F, 2.8F);
		dustcover.addChild(gun27_r1);
		setRotationAngle(gun27_r1, 0.0F, 0.5411F, -1.2392F);
		gun27_r1.cubeList.add(new ModelBox(gun27_r1, 90, 59, 0.0F, 0.0F, -1.0F, 3, 1, 1, 0.0F, false));

		gun26_r2 = new ModelRenderer(this);
		gun26_r2.setRotationPoint(0.8F, -35.5F, 2.8F);
		dustcover.addChild(gun26_r2);
		setRotationAngle(gun26_r2, 0.0F, -0.5411F, 1.2392F);
		gun26_r2.cubeList.add(new ModelBox(gun26_r2, 25, 93, -3.0F, 0.0F, -1.0F, 3, 1, 1, 0.0F, false));

		gun308_r1 = new ModelRenderer(this);
		gun308_r1.setRotationPoint(-1.35F, -39.0F, 1.0F);
		dustcover.addChild(gun308_r1);
		setRotationAngle(gun308_r1, -1.2672F, 0.0F, 0.0F);
		gun308_r1.cubeList.add(new ModelBox(gun308_r1, 112, 11, -0.051F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun308_r1.cubeList.add(new ModelBox(gun308_r1, 38, 56, -1.251F, -0.001F, 0.0F, 2, 1, 1, 0.0F, false));

		gun307_r1 = new ModelRenderer(this);
		gun307_r1.setRotationPoint(-1.8F, -35.5F, 3.0F);
		dustcover.addChild(gun307_r1);
		setRotationAngle(gun307_r1, 0.576F, 0.0F, 0.0F);
		gun307_r1.cubeList.add(new ModelBox(gun307_r1, 56, 12, -1.001F, -3.4F, -1.0F, 2, 1, 1, 0.0F, false));
		gun307_r1.cubeList.add(new ModelBox(gun307_r1, 101, 54, 0.599F, -3.4F, -0.999F, 1, 1, 1, 0.0F, false));
		gun307_r1.cubeList.add(new ModelBox(gun307_r1, 28, 9, -1.0F, -3.0F, -0.999F, 2, 3, 1, 0.0F, false));
		gun307_r1.cubeList.add(new ModelBox(gun307_r1, 56, 36, 0.6F, -3.0F, -1.0F, 1, 3, 1, 0.0F, false));

		gun307_r2 = new ModelRenderer(this);
		gun307_r2.setRotationPoint(-3.8F, -35.5F, 3.0F);
		dustcover.addChild(gun307_r2);
		setRotationAngle(gun307_r2, 0.5568F, -0.1501F, 0.2443F);
		gun307_r2.cubeList.add(new ModelBox(gun307_r2, 56, 8, 0.0F, -3.0F, -1.0F, 1, 3, 1, 0.0F, false));

		gun306_r1 = new ModelRenderer(this);
		gun306_r1.setRotationPoint(0.8F, -35.5F, 3.0F);
		dustcover.addChild(gun306_r1);
		setRotationAngle(gun306_r1, 0.5568F, 0.1501F, -0.2443F);
		gun306_r1.cubeList.add(new ModelBox(gun306_r1, 56, 17, -1.0F, -3.0F, -1.0F, 1, 3, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		dustcover.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}