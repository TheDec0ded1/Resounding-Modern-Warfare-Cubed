package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AK12BHandguard extends ModelBase {
	private final ModelRenderer handguard_b;
	private final ModelRenderer bone14;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer bone16;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer bone15;
	private final ModelRenderer bone7_r1;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r54_r1;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r55_r1;
	private final ModelRenderer gun82_r1;
	private final ModelRenderer gun81_r2;
	private final ModelRenderer gun84_r1;
	private final ModelRenderer gun83_r1;
	private final ModelRenderer gun84_r2;
	private final ModelRenderer gun83_r2;
	private final ModelRenderer gun82_r2;
	private final ModelRenderer gun87_r1;
	private final ModelRenderer gun88_r1;
	private final ModelRenderer gun143_r2;
	private final ModelRenderer gun142_r2;
	private final ModelRenderer gun158_r2;
	private final ModelRenderer gun157_r2;

	public AK12BHandguard() {
		textureWidth = 200;
		textureHeight = 200;

		handguard_b = new ModelRenderer(this);
		handguard_b.setRotationPoint(0.0F, 24.0F, 0.0F);
		handguard_b.cubeList.add(new ModelBox(handguard_b, 40, 106, -2.5F, -34.0F, -45.001F, 2, 2, 18, 0.0F, false));
		handguard_b.cubeList.add(new ModelBox(handguard_b, 164, 104, -2.8F, -37.7F, -44.9F, 2, 1, 9, 0.0F, false));
		handguard_b.cubeList.add(new ModelBox(handguard_b, 145, 162, -2.999F, -38.2F, -45.0F, 3, 1, 9, 0.0F, false));
		handguard_b.cubeList.add(new ModelBox(handguard_b, 36, 80, -4.0F, -34.8F, -28.0F, 5, 2, 1, 0.0F, false));
		handguard_b.cubeList.add(new ModelBox(handguard_b, 121, 131, -3.798F, -33.6F, -28.0F, 4, 2, 1, 0.0F, false));
		handguard_b.cubeList.add(new ModelBox(handguard_b, 49, 0, -0.198F, -33.6F, -28.0F, 1, 2, 1, 0.0F, false));
		handguard_b.cubeList.add(new ModelBox(handguard_b, 78, 127, -3.8F, -35.2F, -45.0F, 1, 2, 18, 0.0F, false));
		handguard_b.cubeList.add(new ModelBox(handguard_b, 40, 126, -0.2F, -35.2F, -45.0F, 1, 2, 18, 0.0F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(-0.7F, -36.0F, -51.7F);
		handguard_b.addChild(bone14);
		bone14.cubeList.add(new ModelBox(bone14, 154, 166, -1.8F, -3.6F, 8.3F, 2, 1, 1, -0.199F, false));
		bone14.cubeList.add(new ModelBox(bone14, 154, 166, -1.8F, -3.6F, 9.55F, 2, 1, 1, -0.199F, false));
		bone14.cubeList.add(new ModelBox(bone14, 154, 166, -1.8F, -3.6F, 7.05F, 2, 1, 1, -0.199F, false));
		bone14.cubeList.add(new ModelBox(bone14, 154, 166, -1.8F, -3.6F, 10.8F, 2, 1, 1, -0.199F, false));
		bone14.cubeList.add(new ModelBox(bone14, 154, 166, -1.8F, -3.6F, 12.05F, 2, 1, 1, -0.199F, false));
		bone14.cubeList.add(new ModelBox(bone14, 154, 166, -1.8F, -3.6F, 13.3F, 2, 1, 1, -0.199F, false));
		bone14.cubeList.add(new ModelBox(bone14, 154, 166, -1.8F, -3.6F, 14.55F, 2, 1, 1, -0.199F, false));
		bone14.cubeList.add(new ModelBox(bone14, 154, 166, -1.8F, -3.6F, 15.85F, 2, 1, 1, -0.199F, false));
		bone14.cubeList.add(new ModelBox(bone14, 154, 166, -1.8F, -3.6F, 17.05F, 2, 1, 1, -0.199F, false));
		bone14.cubeList.add(new ModelBox(bone14, 129, 115, -1.7F, -3.0F, 6.7F, 2, 1, 12, -0.001F, false));
		bone14.cubeList.add(new ModelBox(bone14, 130, 115, -1.9F, -3.0F, 6.7F, 1, 1, 12, 0.0F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-1.6F, 0.0F, -1.25F);
		bone14.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.0F, 0.8901F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 84, 134, -2.8922F, -2.1897F, 8.15F, 1, 1, 12, -0.35F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 154, 165, -2.8422F, -2.3397F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 154, 165, -2.8422F, -2.3397F, 17.1F, 1, 1, 1, -0.198F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 154, 165, -2.8422F, -2.3397F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 154, 165, -2.8422F, -2.3397F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 154, 165, -2.8422F, -2.3397F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 154, 165, -2.8422F, -2.3397F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 154, 165, -2.8422F, -2.3397F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 154, 165, -2.8422F, -2.3397F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 154, 165, -2.8422F, -2.3397F, 8.3F, 1, 1, 1, -0.198F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(0.0F, 0.0F, -1.25F);
		bone14.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, -0.8901F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 149, 134, 1.8922F, -2.1897F, 8.15F, 1, 1, 12, -0.35F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 154, 165, 1.8422F, -2.3397F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 154, 165, 1.8422F, -2.3397F, 17.1F, 1, 1, 1, -0.198F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 154, 165, 1.8422F, -2.3397F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 154, 165, 1.8422F, -2.3397F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 154, 165, 1.8422F, -2.3397F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 154, 165, 1.8422F, -2.3397F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 154, 165, 1.8422F, -2.3397F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 154, 165, 1.8422F, -2.3397F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 154, 165, 1.8422F, -2.3397F, 8.3F, 1, 1, 1, -0.198F, false));

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(-1.5455F, -31.9909F, -39.1182F);
		handguard_b.addChild(bone16);
		setRotationAngle(bone16, 0.0F, 0.0F, -3.1416F);
		bone16.cubeList.add(new ModelBox(bone16, 154, 166, -0.9545F, -0.6091F, -4.8318F, 2, 1, 1, -0.199F, false));
		bone16.cubeList.add(new ModelBox(bone16, 154, 166, -0.9545F, -0.6091F, -3.5818F, 2, 1, 1, -0.199F, false));
		bone16.cubeList.add(new ModelBox(bone16, 154, 166, -0.9545F, -0.6091F, -6.0818F, 2, 1, 1, -0.199F, false));
		bone16.cubeList.add(new ModelBox(bone16, 154, 166, -0.9545F, -0.6091F, -2.3318F, 2, 1, 1, -0.199F, false));
		bone16.cubeList.add(new ModelBox(bone16, 154, 166, -0.9545F, -0.6091F, -1.0818F, 2, 1, 1, -0.199F, false));
		bone16.cubeList.add(new ModelBox(bone16, 154, 166, -0.9545F, -0.6091F, 0.1682F, 2, 1, 1, -0.199F, false));
		bone16.cubeList.add(new ModelBox(bone16, 154, 166, -0.9545F, -0.6091F, 1.4182F, 2, 1, 1, -0.199F, false));
		bone16.cubeList.add(new ModelBox(bone16, 154, 166, -0.9545F, -0.6091F, 2.7182F, 2, 1, 1, -0.199F, false));
		bone16.cubeList.add(new ModelBox(bone16, 154, 166, -0.9545F, -0.6091F, 3.9182F, 2, 1, 1, -0.199F, false));
		bone16.cubeList.add(new ModelBox(bone16, 154, 166, -0.9545F, -0.6091F, 8.9182F, 2, 1, 1, -0.199F, false));
		bone16.cubeList.add(new ModelBox(bone16, 154, 166, -0.9545F, -0.6091F, 10.0182F, 2, 1, 1, -0.199F, false));
		bone16.cubeList.add(new ModelBox(bone16, 154, 166, -0.9545F, -0.6091F, 6.4182F, 2, 1, 1, -0.199F, false));
		bone16.cubeList.add(new ModelBox(bone16, 154, 166, -0.9545F, -0.6091F, 7.7182F, 2, 1, 1, -0.199F, false));
		bone16.cubeList.add(new ModelBox(bone16, 154, 166, -0.9545F, -0.6091F, 5.1682F, 2, 1, 1, -0.199F, false));
		bone16.cubeList.add(new ModelBox(bone16, 124, 110, -0.8545F, -0.0091F, -5.8818F, 2, 1, 17, -0.001F, false));
		bone16.cubeList.add(new ModelBox(bone16, 125, 110, -1.0545F, -0.0091F, -5.8818F, 1, 1, 17, 0.0F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(-0.7545F, 2.9909F, -13.8318F);
		bone16.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.0F, 0.0F, 0.8901F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 79, 129, -2.8922F, -2.1897F, 7.6F, 1, 1, 17, -0.35F, false));
		cube_r29.cubeList.add(new ModelBox(cube_r29, 154, 165, -2.8422F, -2.3397F, 15.25F, 1, 1, 1, -0.198F, false));
		cube_r29.cubeList.add(new ModelBox(cube_r29, 154, 165, -2.8422F, -2.3397F, 16.55F, 1, 1, 1, -0.198F, false));
		cube_r29.cubeList.add(new ModelBox(cube_r29, 154, 165, -2.8422F, -2.3397F, 17.75F, 1, 1, 1, -0.198F, false));
		cube_r29.cubeList.add(new ModelBox(cube_r29, 154, 165, -2.8422F, -2.3397F, 14.0F, 1, 1, 1, -0.198F, false));
		cube_r29.cubeList.add(new ModelBox(cube_r29, 154, 165, -2.8422F, -2.3397F, 22.75F, 1, 1, 1, -0.198F, false));
		cube_r29.cubeList.add(new ModelBox(cube_r29, 154, 165, -2.8422F, -2.3397F, 23.85F, 1, 1, 1, -0.198F, false));
		cube_r29.cubeList.add(new ModelBox(cube_r29, 154, 165, -2.8422F, -2.3397F, 21.55F, 1, 1, 1, -0.198F, false));
		cube_r29.cubeList.add(new ModelBox(cube_r29, 154, 165, -2.8422F, -2.3397F, 20.25F, 1, 1, 1, -0.198F, false));
		cube_r29.cubeList.add(new ModelBox(cube_r29, 154, 165, -2.8422F, -2.3397F, 19.0F, 1, 1, 1, -0.198F, false));
		cube_r29.cubeList.add(new ModelBox(cube_r29, 154, 165, -2.8422F, -2.3397F, 12.75F, 1, 1, 1, -0.198F, false));
		cube_r29.cubeList.add(new ModelBox(cube_r29, 154, 165, -2.8422F, -2.3397F, 11.5F, 1, 1, 1, -0.198F, false));
		cube_r29.cubeList.add(new ModelBox(cube_r29, 154, 165, -2.8422F, -2.3397F, 10.25F, 1, 1, 1, -0.198F, false));
		cube_r29.cubeList.add(new ModelBox(cube_r29, 154, 165, -2.8422F, -2.3397F, 9.0F, 1, 1, 1, -0.198F, false));
		cube_r29.cubeList.add(new ModelBox(cube_r29, 154, 165, -2.8422F, -2.3397F, 7.75F, 1, 1, 1, -0.198F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(0.8455F, 2.9909F, -13.8318F);
		bone16.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.0F, 0.0F, -0.8901F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 144, 129, 1.8922F, -2.1897F, 7.6F, 1, 1, 17, -0.35F, false));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 154, 165, 1.8422F, -2.3397F, 15.25F, 1, 1, 1, -0.198F, false));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 154, 165, 1.8422F, -2.3397F, 16.55F, 1, 1, 1, -0.198F, false));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 154, 165, 1.8422F, -2.3397F, 17.75F, 1, 1, 1, -0.198F, false));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 154, 165, 1.8422F, -2.3397F, 14.0F, 1, 1, 1, -0.198F, false));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 154, 165, 1.8422F, -2.3397F, 22.75F, 1, 1, 1, -0.198F, false));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 154, 165, 1.8422F, -2.3397F, 23.85F, 1, 1, 1, -0.198F, false));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 154, 165, 1.8422F, -2.3397F, 21.55F, 1, 1, 1, -0.198F, false));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 154, 165, 1.8422F, -2.3397F, 20.25F, 1, 1, 1, -0.198F, false));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 154, 165, 1.8422F, -2.3397F, 19.0F, 1, 1, 1, -0.198F, false));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 154, 165, 1.8422F, -2.3397F, 12.75F, 1, 1, 1, -0.198F, false));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 154, 165, 1.8422F, -2.3397F, 11.5F, 1, 1, 1, -0.198F, false));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 154, 165, 1.8422F, -2.3397F, 10.25F, 1, 1, 1, -0.198F, false));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 154, 165, 1.8422F, -2.3397F, 9.0F, 1, 1, 1, -0.198F, false));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 154, 165, 1.8422F, -2.3397F, 7.75F, 1, 1, 1, -0.198F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(3.4545F, -38.9909F, -39.1182F);
		handguard_b.addChild(bone15);
		setRotationAngle(bone15, 0.0F, 0.0F, 1.5708F);
		bone15.cubeList.add(new ModelBox(bone15, 154, 166, 3.7455F, 1.6909F, -4.2818F, 2, 1, 1, -0.199F, false));
		bone15.cubeList.add(new ModelBox(bone15, 154, 166, 3.7455F, 1.6909F, -3.0318F, 2, 1, 1, -0.199F, false));
		bone15.cubeList.add(new ModelBox(bone15, 154, 166, 3.7455F, 1.6909F, -5.5318F, 2, 1, 1, -0.199F, false));
		bone15.cubeList.add(new ModelBox(bone15, 154, 166, 3.7455F, 1.6909F, -1.7818F, 2, 1, 1, -0.199F, false));
		bone15.cubeList.add(new ModelBox(bone15, 154, 166, 3.7455F, 1.6909F, -0.5318F, 2, 1, 1, -0.199F, false));
		bone15.cubeList.add(new ModelBox(bone15, 154, 166, 3.7455F, 1.6909F, 0.7182F, 2, 1, 1, -0.199F, false));
		bone15.cubeList.add(new ModelBox(bone15, 154, 166, 3.7455F, 1.6909F, 1.9682F, 2, 1, 1, -0.199F, false));
		bone15.cubeList.add(new ModelBox(bone15, 154, 166, 3.7455F, 1.6909F, 3.2682F, 2, 1, 1, -0.199F, false));
		bone15.cubeList.add(new ModelBox(bone15, 154, 166, 3.7455F, 1.6909F, 4.4682F, 2, 1, 1, -0.199F, false));
		bone15.cubeList.add(new ModelBox(bone15, 154, 166, 3.7455F, 1.6909F, 5.7682F, 2, 1, 1, -0.199F, false));
		bone15.cubeList.add(new ModelBox(bone15, 129, 115, 3.8455F, 2.2909F, -5.3318F, 2, 1, 12, -0.001F, false));
		bone15.cubeList.add(new ModelBox(bone15, 130, 115, 3.6455F, 2.2909F, -5.3318F, 1, 1, 12, 0.0F, false));

		bone7_r1 = new ModelRenderer(this);
		bone7_r1.setRotationPoint(4.7455F, 2.4909F, 0.6182F);
		bone15.addChild(bone7_r1);
		setRotationAngle(bone7_r1, 0.0F, 0.0F, -3.1416F);
		bone7_r1.cubeList.add(new ModelBox(bone7_r1, 154, 166, -1.0F, -5.7F, 5.15F, 2, 1, 1, -0.199F, false));
		bone7_r1.cubeList.add(new ModelBox(bone7_r1, 130, 115, -1.1F, -5.1F, -5.95F, 1, 1, 12, 0.0F, false));
		bone7_r1.cubeList.add(new ModelBox(bone7_r1, 129, 115, -0.9F, -5.1F, -5.95F, 2, 1, 12, -0.001F, false));
		bone7_r1.cubeList.add(new ModelBox(bone7_r1, 154, 166, -1.0F, -5.7F, 3.85F, 2, 1, 1, -0.199F, false));
		bone7_r1.cubeList.add(new ModelBox(bone7_r1, 154, 166, -1.0F, -5.7F, 2.65F, 2, 1, 1, -0.199F, false));
		bone7_r1.cubeList.add(new ModelBox(bone7_r1, 154, 166, -1.0F, -5.7F, 1.35F, 2, 1, 1, -0.199F, false));
		bone7_r1.cubeList.add(new ModelBox(bone7_r1, 154, 166, -1.0F, -5.7F, 0.1F, 2, 1, 1, -0.199F, false));
		bone7_r1.cubeList.add(new ModelBox(bone7_r1, 154, 166, -1.0F, -5.7F, -1.15F, 2, 1, 1, -0.199F, false));
		bone7_r1.cubeList.add(new ModelBox(bone7_r1, 154, 166, -1.0F, -5.7F, -2.4F, 2, 1, 1, -0.199F, false));
		bone7_r1.cubeList.add(new ModelBox(bone7_r1, 154, 166, -1.0F, -5.7F, -6.15F, 2, 1, 1, -0.199F, false));
		bone7_r1.cubeList.add(new ModelBox(bone7_r1, 154, 166, -1.0F, -5.7F, -3.65F, 2, 1, 1, -0.199F, false));
		bone7_r1.cubeList.add(new ModelBox(bone7_r1, 154, 166, -1.0F, -5.7F, -4.9F, 2, 1, 1, -0.199F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(-0.7545F, 2.9909F, -13.8318F);
		bone15.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, 0.0F, 0.8901F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 84, 134, 1.8531F, -4.3948F, 8.15F, 1, 1, 12, -0.35F, false));
		cube_r27.cubeList.add(new ModelBox(cube_r27, 154, 165, 1.9031F, -4.5448F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r27.cubeList.add(new ModelBox(cube_r27, 154, 165, 1.9031F, -4.5448F, 17.1F, 1, 1, 1, -0.198F, false));
		cube_r27.cubeList.add(new ModelBox(cube_r27, 154, 165, 1.9031F, -4.5448F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r27.cubeList.add(new ModelBox(cube_r27, 154, 165, 1.9031F, -4.5448F, 19.6F, 1, 1, 1, -0.198F, false));
		cube_r27.cubeList.add(new ModelBox(cube_r27, 154, 165, 1.9031F, -4.5448F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r27.cubeList.add(new ModelBox(cube_r27, 154, 165, 1.9031F, -4.5448F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r27.cubeList.add(new ModelBox(cube_r27, 154, 165, 1.9031F, -4.5448F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r27.cubeList.add(new ModelBox(cube_r27, 154, 165, 1.9031F, -4.5448F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r27.cubeList.add(new ModelBox(cube_r27, 154, 165, 1.9031F, -4.5448F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r27.cubeList.add(new ModelBox(cube_r27, 154, 165, 1.9031F, -4.5448F, 8.3F, 1, 1, 1, -0.198F, false));

		cube_r54_r1 = new ModelRenderer(this);
		cube_r54_r1.setRotationPoint(3.0728F, -4.5889F, 14.45F);
		cube_r27.addChild(cube_r54_r1);
		setRotationAngle(cube_r54_r1, 0.0F, 0.0F, -3.1416F);
		cube_r54_r1.cubeList.add(new ModelBox(cube_r54_r1, 154, 165, -4.9777F, -3.0396F, 5.15F, 1, 1, 1, -0.198F, false));
		cube_r54_r1.cubeList.add(new ModelBox(cube_r54_r1, 154, 165, -4.9777F, -3.0396F, -6.15F, 1, 1, 1, -0.198F, false));
		cube_r54_r1.cubeList.add(new ModelBox(cube_r54_r1, 154, 165, -4.9777F, -3.0396F, -4.9F, 1, 1, 1, -0.198F, false));
		cube_r54_r1.cubeList.add(new ModelBox(cube_r54_r1, 154, 165, -4.9777F, -3.0396F, -3.65F, 1, 1, 1, -0.198F, false));
		cube_r54_r1.cubeList.add(new ModelBox(cube_r54_r1, 154, 165, -4.9777F, -3.0396F, -2.4F, 1, 1, 1, -0.198F, false));
		cube_r54_r1.cubeList.add(new ModelBox(cube_r54_r1, 154, 165, -4.9777F, -3.0396F, -1.15F, 1, 1, 1, -0.198F, false));
		cube_r54_r1.cubeList.add(new ModelBox(cube_r54_r1, 154, 165, -4.9777F, -3.0396F, 0.1F, 1, 1, 1, -0.198F, false));
		cube_r54_r1.cubeList.add(new ModelBox(cube_r54_r1, 154, 165, -4.9777F, -3.0396F, 3.85F, 1, 1, 1, -0.198F, false));
		cube_r54_r1.cubeList.add(new ModelBox(cube_r54_r1, 154, 165, -4.9777F, -3.0396F, 2.65F, 1, 1, 1, -0.198F, false));
		cube_r54_r1.cubeList.add(new ModelBox(cube_r54_r1, 154, 165, -4.9777F, -3.0396F, 1.35F, 1, 1, 1, -0.198F, false));
		cube_r54_r1.cubeList.add(new ModelBox(cube_r54_r1, 84, 134, -5.0277F, -2.8896F, -6.3F, 1, 1, 12, -0.35F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(0.8455F, 2.9909F, -13.8318F);
		bone15.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, 0.0F, -0.8901F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 149, 134, 3.0627F, 2.9103F, 8.15F, 1, 1, 12, -0.35F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 154, 165, 3.0127F, 2.7603F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 154, 165, 3.0127F, 2.7603F, 17.1F, 1, 1, 1, -0.198F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 154, 165, 3.0127F, 2.7603F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 154, 165, 3.0127F, 2.7603F, 19.6F, 1, 1, 1, -0.198F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 154, 165, 3.0127F, 2.7603F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 154, 165, 3.0127F, 2.7603F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 154, 165, 3.0127F, 2.7603F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 154, 165, 3.0127F, 2.7603F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 154, 165, 3.0127F, 2.7603F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 154, 165, 3.0127F, 2.7603F, 8.3F, 1, 1, 1, -0.198F, false));

		cube_r55_r1 = new ModelRenderer(this);
		cube_r55_r1.setRotationPoint(2.843F, 2.7162F, 14.45F);
		cube_r28.addChild(cube_r55_r1);
		setRotationAngle(cube_r55_r1, 0.0F, 0.0F, 3.1416F);
		cube_r55_r1.cubeList.add(new ModelBox(cube_r55_r1, 154, 165, 3.9777F, -3.0396F, 5.15F, 1, 1, 1, -0.198F, false));
		cube_r55_r1.cubeList.add(new ModelBox(cube_r55_r1, 154, 165, 3.9777F, -3.0396F, -6.15F, 1, 1, 1, -0.198F, false));
		cube_r55_r1.cubeList.add(new ModelBox(cube_r55_r1, 154, 165, 3.9777F, -3.0396F, -4.9F, 1, 1, 1, -0.198F, false));
		cube_r55_r1.cubeList.add(new ModelBox(cube_r55_r1, 154, 165, 3.9777F, -3.0396F, -3.65F, 1, 1, 1, -0.198F, false));
		cube_r55_r1.cubeList.add(new ModelBox(cube_r55_r1, 154, 165, 3.9777F, -3.0396F, -2.4F, 1, 1, 1, -0.198F, false));
		cube_r55_r1.cubeList.add(new ModelBox(cube_r55_r1, 154, 165, 3.9777F, -3.0396F, -1.15F, 1, 1, 1, -0.198F, false));
		cube_r55_r1.cubeList.add(new ModelBox(cube_r55_r1, 154, 165, 3.9777F, -3.0396F, 0.1F, 1, 1, 1, -0.198F, false));
		cube_r55_r1.cubeList.add(new ModelBox(cube_r55_r1, 154, 165, 3.9777F, -3.0396F, 3.85F, 1, 1, 1, -0.198F, false));
		cube_r55_r1.cubeList.add(new ModelBox(cube_r55_r1, 154, 165, 3.9777F, -3.0396F, 2.65F, 1, 1, 1, -0.198F, false));
		cube_r55_r1.cubeList.add(new ModelBox(cube_r55_r1, 154, 165, 3.9777F, -3.0396F, 1.35F, 1, 1, 1, -0.198F, false));
		cube_r55_r1.cubeList.add(new ModelBox(cube_r55_r1, 149, 134, 4.0277F, -2.8896F, -6.3F, 1, 1, 12, -0.35F, false));

		gun82_r1 = new ModelRenderer(this);
		gun82_r1.setRotationPoint(0.8F, -35.2F, -35.0F);
		handguard_b.addChild(gun82_r1);
		setRotationAngle(gun82_r1, 0.0F, 0.0F, 1.2043F);
		gun82_r1.cubeList.add(new ModelBox(gun82_r1, 20, 59, -1.7F, -0.001F, 2.0F, 1, 1, 6, 0.0F, false));
		gun82_r1.cubeList.add(new ModelBox(gun82_r1, 0, 70, -1.0F, 0.0F, 2.0F, 1, 1, 6, 0.0F, false));

		gun81_r2 = new ModelRenderer(this);
		gun81_r2.setRotationPoint(-3.8F, -35.2F, -35.0F);
		handguard_b.addChild(gun81_r2);
		setRotationAngle(gun81_r2, 0.0F, 0.0F, -1.309F);
		gun81_r2.cubeList.add(new ModelBox(gun81_r2, 38, 60, 0.7F, -0.001F, 2.0F, 1, 1, 6, 0.0F, false));
		gun81_r2.cubeList.add(new ModelBox(gun81_r2, 36, 71, 1.5F, -0.001F, -10.0F, 1, 1, 12, 0.0F, false));
		gun81_r2.cubeList.add(new ModelBox(gun81_r2, 76, 13, 2.0F, 0.0F, -10.0F, 1, 1, 12, 0.0F, false));
		gun81_r2.cubeList.add(new ModelBox(gun81_r2, 27, 35, 1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));
		gun81_r2.cubeList.add(new ModelBox(gun81_r2, 55, 64, 1.0F, 0.0F, -3.0F, 1, 1, 1, 0.0F, false));
		gun81_r2.cubeList.add(new ModelBox(gun81_r2, 65, 0, 1.0F, 0.0F, -6.0F, 1, 1, 1, 0.0F, false));
		gun81_r2.cubeList.add(new ModelBox(gun81_r2, 38, 20, 1.0F, 0.0F, -10.0F, 1, 1, 2, 0.0F, false));
		gun81_r2.cubeList.add(new ModelBox(gun81_r2, 76, 49, 0.0F, 0.0F, -10.0F, 1, 1, 12, 0.0F, false));
		gun81_r2.cubeList.add(new ModelBox(gun81_r2, 0, 77, 0.0F, 0.0F, 2.0F, 1, 1, 6, 0.0F, false));

		gun84_r1 = new ModelRenderer(this);
		gun84_r1.setRotationPoint(0.8F, -35.2F, -47.0F);
		handguard_b.addChild(gun84_r1);
		setRotationAngle(gun84_r1, 0.0F, 0.0F, 1.309F);
		gun84_r1.cubeList.add(new ModelBox(gun84_r1, 72, 71, -2.5F, -0.001F, 2.0F, 1, 1, 12, 0.0F, false));
		gun84_r1.cubeList.add(new ModelBox(gun84_r1, 76, 0, -3.0F, 0.0F, 2.0F, 1, 1, 12, 0.0F, false));
		gun84_r1.cubeList.add(new ModelBox(gun84_r1, 38, 17, -2.0F, 0.0F, 12.0F, 1, 1, 2, 0.0F, false));
		gun84_r1.cubeList.add(new ModelBox(gun84_r1, 65, 2, -2.0F, 0.0F, 9.0F, 1, 1, 1, 0.0F, false));
		gun84_r1.cubeList.add(new ModelBox(gun84_r1, 65, 4, -2.0F, 0.0F, 6.0F, 1, 1, 1, 0.0F, false));
		gun84_r1.cubeList.add(new ModelBox(gun84_r1, 38, 25, -2.0F, 0.0F, 2.0F, 1, 1, 2, 0.0F, false));
		gun84_r1.cubeList.add(new ModelBox(gun84_r1, 76, 36, -1.0F, 0.0F, 2.0F, 1, 1, 12, 0.0F, false));

		gun83_r1 = new ModelRenderer(this);
		gun83_r1.setRotationPoint(-3.5F, -37.1F, -40.0F);
		handguard_b.addChild(gun83_r1);
		setRotationAngle(gun83_r1, 0.0F, 0.0F, 0.2618F);
		gun83_r1.cubeList.add(new ModelBox(gun83_r1, 38, 36, 0.0F, -1.0F, 0.0F, 1, 1, 7, 0.0F, false));

		gun84_r2 = new ModelRenderer(this);
		gun84_r2.setRotationPoint(-3.5F, -37.1F, -40.0F);
		handguard_b.addChild(gun84_r2);
		setRotationAngle(gun84_r2, 0.0F, -0.0524F, 0.2618F);
		gun84_r2.cubeList.add(new ModelBox(gun84_r2, 48, 119, 0.0F, -1.0F, -4.0F, 1, 1, 4, 0.0F, false));

		gun83_r2 = new ModelRenderer(this);
		gun83_r2.setRotationPoint(0.5F, -37.1F, -40.0F);
		handguard_b.addChild(gun83_r2);
		setRotationAngle(gun83_r2, 0.0F, 0.0524F, -0.2618F);
		gun83_r2.cubeList.add(new ModelBox(gun83_r2, 120, 101, -1.0F, -1.0F, -4.0F, 1, 1, 4, 0.0F, false));

		gun82_r2 = new ModelRenderer(this);
		gun82_r2.setRotationPoint(0.5F, -37.1F, -40.0F);
		handguard_b.addChild(gun82_r2);
		setRotationAngle(gun82_r2, 0.0F, 0.0F, -0.2618F);
		gun82_r2.cubeList.add(new ModelBox(gun82_r2, 38, 44, -1.0F, -1.0F, 0.0F, 1, 1, 7, 0.0F, false));

		gun87_r1 = new ModelRenderer(this);
		gun87_r1.setRotationPoint(-0.2F, -31.6F, -28.0F);
		handguard_b.addChild(gun87_r1);
		setRotationAngle(gun87_r1, 2.0076F, 0.0F, 0.0F);
		gun87_r1.cubeList.add(new ModelBox(gun87_r1, 27, 38, 0.001F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));
		gun87_r1.cubeList.add(new ModelBox(gun87_r1, 76, 9, -3.599F, 0.0F, 0.0F, 4, 1, 2, 0.0F, false));

		gun88_r1 = new ModelRenderer(this);
		gun88_r1.setRotationPoint(1.0F, -34.8F, -28.0F);
		handguard_b.addChild(gun88_r1);
		setRotationAngle(gun88_r1, -1.117F, 0.0F, 0.0F);
		gun88_r1.cubeList.add(new ModelBox(gun88_r1, 12, 99, -4.999F, 0.0F, 0.0F, 5, 1, 2, 0.0F, false));

		gun143_r2 = new ModelRenderer(this);
		gun143_r2.setRotationPoint(-3.0F, -38.2F, -45.0F);
		handguard_b.addChild(gun143_r2);
		setRotationAngle(gun143_r2, 0.0F, 0.0F, -2.0595F);
		gun143_r2.cubeList.add(new ModelBox(gun143_r2, 72, 84, -1.0F, 0.0F, -0.002F, 1, 1, 12, 0.0F, false));

		gun142_r2 = new ModelRenderer(this);
		gun142_r2.setRotationPoint(0.0F, -38.2F, -45.0F);
		handguard_b.addChild(gun142_r2);
		setRotationAngle(gun142_r2, 0.0F, 0.0F, 2.0595F);
		gun142_r2.cubeList.add(new ModelBox(gun142_r2, 0, 86, 0.0F, 0.0F, -0.002F, 1, 1, 12, 0.0F, false));

		gun158_r2 = new ModelRenderer(this);
		gun158_r2.setRotationPoint(-0.5F, -32.2F, -45.0F);
		handguard_b.addChild(gun158_r2);
		setRotationAngle(gun158_r2, 0.0F, 0.0F, 2.2679F);
		gun158_r2.cubeList.add(new ModelBox(gun158_r2, 112, 35, -2.0F, 0.0F, 0.001F, 2, 1, 18, 0.0F, false));

		gun157_r2 = new ModelRenderer(this);
		gun157_r2.setRotationPoint(-2.5F, -32.2F, -45.0F);
		handguard_b.addChild(gun157_r2);
		setRotationAngle(gun157_r2, 0.0F, 0.0F, -2.2679F);
		gun157_r2.cubeList.add(new ModelBox(gun157_r2, 123, 109, 0.0F, 0.0F, 0.001F, 2, 1, 18, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handguard_b.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}