package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AK12Handguard extends ModelBase {
	private final ModelRenderer handguard;
	private final ModelRenderer bone12;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer bone11;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer bone13;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer bone9;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer bone10;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer gun81_r1;
	private final ModelRenderer gun80_r1;
	private final ModelRenderer gun86_r1;
	private final ModelRenderer gun98_r1;
	private final ModelRenderer gun97_r1;
	private final ModelRenderer gun97_r2;
	private final ModelRenderer gun96_r1;
	private final ModelRenderer gun142_r1;
	private final ModelRenderer gun141_r1;
	private final ModelRenderer gun144_r1;
	private final ModelRenderer gun143_r1;
	private final ModelRenderer gun157_r1;
	private final ModelRenderer gun156_r1;
	private final ModelRenderer gun159_r1;
	private final ModelRenderer gun158_r1;
	private final ModelRenderer gun160_r1;
	private final ModelRenderer gun161_r1;
	private final ModelRenderer gun163_r1;
	private final ModelRenderer gun165_r1;
	private final ModelRenderer gun219_r1;
	private final ModelRenderer gun239_r1;
	private final ModelRenderer gun344_r1;
	private final ModelRenderer gun364_r1;

	public AK12Handguard() {
		textureWidth = 200;
		textureHeight = 200;

		handguard = new ModelRenderer(this);
		handguard.setRotationPoint(0.0F, 24.0F, 0.0F);
		handguard.cubeList.add(new ModelBox(handguard, 101, 107, -2.5F, -34.0F, -45.001F, 2, 2, 18, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 51, 146, -1.2F, -37.7F, -44.9F, 1, 1, 9, -0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 132, -3.0F, -34.5F, -45.0F, 3, 1, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 164, 114, -2.8F, -37.7F, -44.9F, 2, 1, 9, -0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 159, 162, -0.1F, -35.0F, -43.0F, 1, 1, 10, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 14, 164, -3.9F, -35.0F, -43.0F, 1, 1, 10, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 159, 93, -2.999F, -36.8F, -45.0F, 3, 2, 9, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 163, 136, -2.999F, -38.2F, -45.0F, 3, 1, 9, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 61, 96, -3.001F, -37.0F, -37.5F, 3, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 86, 94, -3.001F, -37.0F, -41.3F, 3, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 58, 94, -3.001F, -37.0F, -45.0F, 3, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 96, 81, -3.0F, -37.0F, -37.0F, 3, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 14, 96, -3.0F, -37.0F, -40.6F, 3, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 50, 94, -3.0F, -37.0F, -44.5F, 3, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 97, 71, -3.0F, -38.1F, -40.6F, 3, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 97, 73, -3.0F, -38.1F, -41.3F, 3, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 97, 75, -3.0F, -38.1F, -37.5F, 3, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 97, 77, -3.0F, -38.1F, -37.0F, 3, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 97, 83, -3.0F, -38.1F, -44.5F, 3, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 97, 85, -3.0F, -38.1F, -45.0F, 3, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 58, 164, 0.0F, -35.6F, -43.0F, 1, 1, 10, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 156, 0, 0.1F, -34.4F, -43.0F, 1, 1, 11, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 36, 164, -4.0F, -35.6F, -43.0F, 1, 1, 10, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 153, 22, -4.1F, -34.4F, -43.0F, 1, 1, 11, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 50, 81, -4.0F, -34.8F, -28.0F, 5, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 22, 132, -3.798F, -33.6F, -28.0F, 4, 2, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 55, 61, -0.198F, -33.6F, -28.0F, 1, 2, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 16, 20, -3.8F, -35.2F, -35.0F, 1, 2, 8, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 39, 106, -0.2F, -35.2F, -35.0F, 1, 2, 8, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 46, 60, -1.201F, -39.4F, -34.001F, 1, 2, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 38, 44, -2.801F, -39.401F, -34.002F, 2, 2, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 26, 74, -2.8F, -39.201F, -36.0F, 2, 1, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 28, 52, -1.2F, -39.2F, -36.0F, 1, 1, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 101, 6, -0.95F, -39.3F, -36.0F, 1, 1, 1, -0.2F, false));
		handguard.cubeList.add(new ModelBox(handguard, 101, 4, -0.85F, -39.3F, -34.1F, 1, 1, 1, -0.3F, false));
		handguard.cubeList.add(new ModelBox(handguard, 101, 2, -3.15F, -39.3F, -34.1F, 1, 1, 1, -0.3F, false));
		handguard.cubeList.add(new ModelBox(handguard, 101, 0, -3.05F, -39.3F, -36.0F, 1, 1, 1, -0.2F, false));
		handguard.cubeList.add(new ModelBox(handguard, 36, 90, -3.0F, -38.2F, -36.0F, 3, 2, 3, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(-0.7F, -36.0F, -51.7F);
		handguard.addChild(bone12);
		bone12.cubeList.add(new ModelBox(bone12, 69, 115, -1.8F, -3.5F, 6.5F, 2, 1, 1, -0.199F, false));
		bone12.cubeList.add(new ModelBox(bone12, 116, 60, -1.8F, -3.5F, 7.75F, 2, 1, 1, -0.199F, false));
		bone12.cubeList.add(new ModelBox(bone12, 164, 17, -1.8F, -3.5F, 9.0F, 2, 1, 1, -0.199F, false));
		bone12.cubeList.add(new ModelBox(bone12, 164, 18, -1.8F, -3.5F, 10.25F, 2, 1, 1, -0.199F, false));
		bone12.cubeList.add(new ModelBox(bone12, 116, 61, -1.8F, -3.5F, 11.5F, 2, 1, 1, -0.199F, false));
		bone12.cubeList.add(new ModelBox(bone12, 161, 103, -1.8F, -3.5F, 12.75F, 2, 1, 1, -0.199F, false));
		bone12.cubeList.add(new ModelBox(bone12, 115, 61, -1.8F, -3.5F, 14.05F, 2, 1, 1, -0.199F, false));
		bone12.cubeList.add(new ModelBox(bone12, 115, 61, -1.8F, -3.5F, 15.25F, 2, 1, 1, -0.199F, false));
		bone12.cubeList.add(new ModelBox(bone12, 133, 98, -1.7F, -2.9F, 6.7F, 2, 1, 9, -0.001F, false));
		bone12.cubeList.add(new ModelBox(bone12, 148, 95, -1.9F, -2.9F, 6.7F, 1, 1, 9, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-1.6F, 0.0F, -1.25F);
		bone12.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, 0.8901F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 134, 98, -2.8145F, -2.1268F, 8.15F, 1, 1, 9, -0.35F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 169, 98, -2.7645F, -2.2768F, 14.0F, 1, 1, 1, -0.198F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 118, 61, -2.7645F, -2.2768F, 15.3F, 1, 1, 1, -0.198F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 118, 61, -2.7645F, -2.2768F, 16.5F, 1, 1, 1, -0.198F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 166, 17, -2.7645F, -2.2768F, 12.75F, 1, 1, 1, -0.198F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 164, 15, -2.7645F, -2.2768F, 11.5F, 1, 1, 1, -0.198F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 164, 16, -2.7645F, -2.2768F, 10.25F, 1, 1, 1, -0.198F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 118, 61, -2.7645F, -2.2768F, 9.0F, 1, 1, 1, -0.198F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 169, 98, -2.7645F, -2.2768F, 7.75F, 1, 1, 1, -0.198F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(0.0F, 0.0F, -1.25F);
		bone12.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, -0.8901F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 134, 98, 1.8145F, -2.1268F, 8.15F, 1, 1, 9, -0.35F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 165, 16, 1.7645F, -2.2768F, 14.0F, 1, 1, 1, -0.198F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 70, 117, 1.7645F, -2.2768F, 15.3F, 1, 1, 1, -0.198F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 70, 117, 1.7645F, -2.2768F, 16.5F, 1, 1, 1, -0.198F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 166, 16, 1.7645F, -2.2768F, 12.75F, 1, 1, 1, -0.198F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 165, 15, 1.7645F, -2.2768F, 11.5F, 1, 1, 1, -0.198F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 164, 16, 1.7645F, -2.2768F, 10.25F, 1, 1, 1, -0.198F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 70, 111, 1.7645F, -2.2768F, 9.0F, 1, 1, 1, -0.198F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 70, 112, 1.7645F, -2.2768F, 7.75F, 1, 1, 1, -0.198F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(-1.55F, -31.78F, -40.355F);
		handguard.addChild(bone11);
		setRotationAngle(bone11, 0.0F, 0.0F, 3.1416F);
		bone11.cubeList.add(new ModelBox(bone11, 69, 115, -0.95F, -0.42F, -4.845F, 2, 1, 1, -0.199F, false));
		bone11.cubeList.add(new ModelBox(bone11, 116, 60, -0.95F, -0.42F, -3.595F, 2, 1, 1, -0.199F, false));
		bone11.cubeList.add(new ModelBox(bone11, 164, 17, -0.95F, -0.42F, -2.345F, 2, 1, 1, -0.199F, false));
		bone11.cubeList.add(new ModelBox(bone11, 164, 18, -0.95F, -0.42F, -1.095F, 2, 1, 1, -0.199F, false));
		bone11.cubeList.add(new ModelBox(bone11, 116, 61, -0.95F, -0.42F, 0.155F, 2, 1, 1, -0.199F, false));
		bone11.cubeList.add(new ModelBox(bone11, 161, 103, -0.95F, -0.42F, 1.405F, 2, 1, 1, -0.199F, false));
		bone11.cubeList.add(new ModelBox(bone11, 115, 61, -0.95F, -0.42F, 2.705F, 2, 1, 1, -0.199F, false));
		bone11.cubeList.add(new ModelBox(bone11, 115, 61, -0.95F, -0.42F, 3.905F, 2, 1, 1, -0.199F, false));
		bone11.cubeList.add(new ModelBox(bone11, 133, 98, -0.85F, 0.18F, -4.645F, 2, 1, 9, -0.001F, false));
		bone11.cubeList.add(new ModelBox(bone11, 148, 95, -1.05F, 0.18F, -4.645F, 1, 1, 9, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-0.75F, 2.88F, -12.595F);
		bone11.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, 0.8901F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 134, 98, -2.6591F, -2.0009F, 8.15F, 1, 1, 9, -0.35F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 169, 98, -2.6091F, -2.1509F, 14.0F, 1, 1, 1, -0.198F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 118, 61, -2.6091F, -2.1509F, 15.3F, 1, 1, 1, -0.198F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 118, 61, -2.6091F, -2.1509F, 16.5F, 1, 1, 1, -0.198F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 166, 17, -2.6091F, -2.1509F, 12.75F, 1, 1, 1, -0.198F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 164, 15, -2.6091F, -2.1509F, 11.5F, 1, 1, 1, -0.198F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 164, 16, -2.6091F, -2.1509F, 10.25F, 1, 1, 1, -0.198F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 118, 61, -2.6091F, -2.1509F, 9.0F, 1, 1, 1, -0.198F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 169, 98, -2.6091F, -2.1509F, 7.75F, 1, 1, 1, -0.198F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.85F, 2.88F, -12.595F);
		bone11.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, -0.8901F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 134, 98, 1.6591F, -2.0009F, 8.15F, 1, 1, 9, -0.35F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 165, 16, 1.6091F, -2.1509F, 14.0F, 1, 1, 1, -0.198F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 70, 117, 1.6091F, -2.1509F, 15.3F, 1, 1, 1, -0.198F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 70, 117, 1.6091F, -2.1509F, 16.5F, 1, 1, 1, -0.198F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 166, 16, 1.6091F, -2.1509F, 12.75F, 1, 1, 1, -0.198F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 165, 15, 1.6091F, -2.1509F, 11.5F, 1, 1, 1, -0.198F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 164, 16, 1.6091F, -2.1509F, 10.25F, 1, 1, 1, -0.198F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 70, 111, 1.6091F, -2.1509F, 9.0F, 1, 1, 1, -0.198F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 70, 112, 1.6091F, -2.1509F, 7.75F, 1, 1, 1, -0.198F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(-1.55F, -31.78F, -31.605F);
		handguard.addChild(bone13);
		setRotationAngle(bone13, 0.0F, 0.0F, 3.1416F);
		bone13.cubeList.add(new ModelBox(bone13, 69, 115, -0.95F, -0.42F, -4.845F, 2, 1, 1, -0.199F, false));
		bone13.cubeList.add(new ModelBox(bone13, 116, 60, -0.95F, -0.42F, -3.595F, 2, 1, 1, -0.199F, false));
		bone13.cubeList.add(new ModelBox(bone13, 164, 17, -0.95F, -0.42F, -2.345F, 2, 1, 1, -0.199F, false));
		bone13.cubeList.add(new ModelBox(bone13, 164, 18, -0.95F, -0.42F, -1.095F, 2, 1, 1, -0.199F, false));
		bone13.cubeList.add(new ModelBox(bone13, 116, 61, -0.95F, -0.42F, 0.155F, 2, 1, 1, -0.199F, false));
		bone13.cubeList.add(new ModelBox(bone13, 161, 103, -0.95F, -0.42F, 1.405F, 2, 1, 1, -0.199F, false));
		bone13.cubeList.add(new ModelBox(bone13, 115, 61, -0.95F, -0.42F, 2.705F, 2, 1, 1, -0.199F, false));
		bone13.cubeList.add(new ModelBox(bone13, 133, 98, -0.85F, 0.18F, -4.645F, 2, 1, 9, -0.001F, false));
		bone13.cubeList.add(new ModelBox(bone13, 148, 95, -1.05F, 0.18F, -4.645F, 1, 1, 9, 0.0F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-0.75F, 2.88F, -12.595F);
		bone13.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, 0.8901F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 134, 98, -2.6591F, -2.0009F, 8.15F, 1, 1, 9, -0.35F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 169, 98, -2.6091F, -2.1509F, 14.0F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 118, 61, -2.6091F, -2.1509F, 15.3F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 166, 17, -2.6091F, -2.1509F, 12.75F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 164, 15, -2.6091F, -2.1509F, 11.5F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 164, 16, -2.6091F, -2.1509F, 10.25F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 118, 61, -2.6091F, -2.1509F, 9.0F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 169, 98, -2.6091F, -2.1509F, 7.75F, 1, 1, 1, -0.198F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(0.85F, 2.88F, -12.595F);
		bone13.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, -0.8901F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 134, 98, 1.6591F, -2.0009F, 8.15F, 1, 1, 9, -0.35F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 165, 16, 1.6091F, -2.1509F, 14.0F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 70, 117, 1.6091F, -2.1509F, 15.3F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 166, 16, 1.6091F, -2.1509F, 12.75F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 165, 15, 1.6091F, -2.1509F, 11.5F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 164, 16, 1.6091F, -2.1509F, 10.25F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 70, 111, 1.6091F, -2.1509F, 9.0F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 70, 112, 1.6091F, -2.1509F, 7.75F, 1, 1, 1, -0.198F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(1.4615F, -42.3077F, -51.4769F);
		handguard.addChild(bone9);
		setRotationAngle(bone9, -3.1416F, 0.0F, -1.5708F);
		bone9.cubeList.add(new ModelBox(bone9, 69, 116, -8.7615F, 0.4078F, -9.8231F, 2, 1, 1, -0.199F, false));
		bone9.cubeList.add(new ModelBox(bone9, 72, 116, -8.7615F, 0.4078F, -8.5731F, 2, 1, 1, -0.199F, false));
		bone9.cubeList.add(new ModelBox(bone9, 69, 115, -8.7615F, 0.4078F, -7.3231F, 2, 1, 1, -0.199F, false));
		bone9.cubeList.add(new ModelBox(bone9, 115, 60, -8.6615F, 1.0078F, -9.5231F, 2, 1, 3, -0.001F, false));
		bone9.cubeList.add(new ModelBox(bone9, 116, 60, -8.8615F, 1.0078F, -9.5231F, 1, 1, 3, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-0.7615F, -0.3923F, -12.4231F);
		bone9.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, 0.8901F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 66, 112, -4.3816F, 6.641F, 2.2F, 1, 1, 4, -0.35F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 69, 115, -4.3316F, 6.491F, 5.1F, 1, 1, 1, -0.198F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 69, 113, -4.3316F, 6.491F, 3.85F, 1, 1, 1, -0.198F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 68, 113, -4.3316F, 6.491F, 2.6F, 1, 1, 1, -0.198F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.8385F, -0.3923F, -12.4231F);
		bone9.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, -0.8901F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 153, 100, -6.436F, -5.4822F, 2.2F, 1, 1, 4, -0.35F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 92, 98, -6.486F, -5.6322F, 5.1F, 1, 1, 1, -0.198F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 90, 99, -6.486F, -5.6322F, 3.85F, 1, 1, 1, -0.198F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 162, 103, -6.486F, -5.6322F, 2.6F, 1, 1, 1, -0.198F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(-3.2862F, -34.4462F, -43.4238F);
		handguard.addChild(bone10);
		setRotationAngle(bone10, -3.1416F, 0.0F, 1.5708F);
		bone10.cubeList.add(new ModelBox(bone10, 69, 116, -0.9F, -0.74F, -1.77F, 2, 1, 1, -0.199F, false));
		bone10.cubeList.add(new ModelBox(bone10, 72, 116, -0.9F, -0.74F, -0.52F, 2, 1, 1, -0.199F, false));
		bone10.cubeList.add(new ModelBox(bone10, 69, 115, -0.9F, -0.74F, 0.73F, 2, 1, 1, -0.199F, false));
		bone10.cubeList.add(new ModelBox(bone10, 115, 60, -0.8F, -0.14F, -1.47F, 2, 1, 3, -0.001F, false));
		bone10.cubeList.add(new ModelBox(bone10, 116, 60, -1.0F, -0.14F, -1.47F, 1, 1, 3, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(7.1F, -1.5401F, -4.37F);
		bone10.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, 0.8901F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 66, 112, -4.3816F, 6.641F, 2.2F, 1, 1, 4, -0.35F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 69, 115, -4.3316F, 6.491F, 5.1F, 1, 1, 1, -0.198F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 69, 113, -4.3316F, 6.491F, 3.85F, 1, 1, 1, -0.198F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 68, 113, -4.3316F, 6.491F, 2.6F, 1, 1, 1, -0.198F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(8.7F, -1.5401F, -4.37F);
		bone10.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, -0.8901F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 153, 100, -6.436F, -5.4822F, 2.2F, 1, 1, 4, -0.35F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 92, 98, -6.486F, -5.6322F, 5.1F, 1, 1, 1, -0.198F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 90, 99, -6.486F, -5.6322F, 3.85F, 1, 1, 1, -0.198F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 162, 103, -6.486F, -5.6322F, 2.6F, 1, 1, 1, -0.198F, false));

		gun81_r1 = new ModelRenderer(this);
		gun81_r1.setRotationPoint(0.8F, -35.2F, -35.0F);
		handguard.addChild(gun81_r1);
		setRotationAngle(gun81_r1, 0.0F, 0.0F, 1.1694F);
		gun81_r1.cubeList.add(new ModelBox(gun81_r1, 50, 84, -1.7F, -0.001F, -1.0F, 1, 1, 9, 0.0F, false));
		gun81_r1.cubeList.add(new ModelBox(gun81_r1, 14, 86, -1.0F, 0.0F, -1.0F, 1, 1, 9, 0.0F, false));

		gun80_r1 = new ModelRenderer(this);
		gun80_r1.setRotationPoint(-3.8F, -35.2F, -35.0F);
		handguard.addChild(gun80_r1);
		setRotationAngle(gun80_r1, 0.0F, 0.0F, -1.1694F);
		gun80_r1.cubeList.add(new ModelBox(gun80_r1, 86, 71, 0.7F, -0.001F, -1.0F, 1, 1, 9, 0.0F, false));
		gun80_r1.cubeList.add(new ModelBox(gun80_r1, 48, 164, 0.0F, 0.0F, -1.0F, 1, 1, 9, 0.0F, false));

		gun86_r1 = new ModelRenderer(this);
		gun86_r1.setRotationPoint(-0.2F, -31.6F, -28.0F);
		handguard.addChild(gun86_r1);
		setRotationAngle(gun86_r1, 2.0076F, 0.0F, 0.0F);
		gun86_r1.cubeList.add(new ModelBox(gun86_r1, 38, 39, 0.001F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));
		gun86_r1.cubeList.add(new ModelBox(gun86_r1, 112, 14, -3.599F, 0.0F, 0.0F, 4, 1, 2, 0.0F, false));

		gun98_r1 = new ModelRenderer(this);
		gun98_r1.setRotationPoint(-4.1F, -34.4F, -32.0F);
		handguard.addChild(gun98_r1);
		setRotationAngle(gun98_r1, 0.0F, 1.7846F, 0.0F);
		gun98_r1.cubeList.add(new ModelBox(gun98_r1, 56, 27, -2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun97_r1 = new ModelRenderer(this);
		gun97_r1.setRotationPoint(-4.0F, -35.6F, -33.0F);
		handguard.addChild(gun97_r1);
		setRotationAngle(gun97_r1, 0.0F, 1.7846F, 0.0F);
		gun97_r1.cubeList.add(new ModelBox(gun97_r1, 101, 101, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun97_r2 = new ModelRenderer(this);
		gun97_r2.setRotationPoint(1.1F, -34.4F, -32.0F);
		handguard.addChild(gun97_r2);
		setRotationAngle(gun97_r2, 0.0F, -1.7846F, 0.0F);
		gun97_r2.cubeList.add(new ModelBox(gun97_r2, 56, 25, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun96_r1 = new ModelRenderer(this);
		gun96_r1.setRotationPoint(1.0F, -35.6F, -33.0F);
		handguard.addChild(gun96_r1);
		setRotationAngle(gun96_r1, 0.0F, -1.7846F, 0.0F);
		gun96_r1.cubeList.add(new ModelBox(gun96_r1, 16, 102, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun142_r1 = new ModelRenderer(this);
		gun142_r1.setRotationPoint(-3.0F, -38.2F, -45.0F);
		handguard.addChild(gun142_r1);
		setRotationAngle(gun142_r1, 0.0F, 0.0F, -2.3423F);
		gun142_r1.cubeList.add(new ModelBox(gun142_r1, 90, 0, -1.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		gun141_r1 = new ModelRenderer(this);
		gun141_r1.setRotationPoint(0.0F, -38.2F, -45.0F);
		handguard.addChild(gun141_r1);
		setRotationAngle(gun141_r1, 0.0F, 0.0F, 2.3423F);
		gun141_r1.cubeList.add(new ModelBox(gun141_r1, 26, 164, 0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		gun144_r1 = new ModelRenderer(this);
		gun144_r1.setRotationPoint(1.0F, -35.6F, -43.0F);
		handguard.addChild(gun144_r1);
		setRotationAngle(gun144_r1, 0.0F, 0.0F, 0.5577F);
		gun144_r1.cubeList.add(new ModelBox(gun144_r1, 73, 127, -1.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F, false));

		gun143_r1 = new ModelRenderer(this);
		gun143_r1.setRotationPoint(-4.0F, -35.6F, -43.0F);
		handguard.addChild(gun143_r1);
		setRotationAngle(gun143_r1, 0.0F, 0.0F, -0.5577F);
		gun143_r1.cubeList.add(new ModelBox(gun143_r1, 93, 147, 0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F, false));

		gun157_r1 = new ModelRenderer(this);
		gun157_r1.setRotationPoint(-0.5F, -32.2F, -45.0F);
		handguard.addChild(gun157_r1);
		setRotationAngle(gun157_r1, 0.0F, 0.0F, 2.2679F);
		gun157_r1.cubeList.add(new ModelBox(gun157_r1, 124, 89, -2.0F, 0.0F, 0.001F, 2, 1, 18, 0.0F, false));

		gun156_r1 = new ModelRenderer(this);
		gun156_r1.setRotationPoint(-2.5F, -32.2F, -45.0F);
		handguard.addChild(gun156_r1);
		setRotationAngle(gun156_r1, 0.0F, 0.0F, -2.2679F);
		gun156_r1.cubeList.add(new ModelBox(gun156_r1, 0, 126, 0.0F, 0.0F, 0.001F, 2, 1, 18, 0.0F, false));

		gun159_r1 = new ModelRenderer(this);
		gun159_r1.setRotationPoint(1.1F, -33.4F, -43.0F);
		handguard.addChild(gun159_r1);
		setRotationAngle(gun159_r1, 0.0F, 0.0F, 0.8923F);
		gun159_r1.cubeList.add(new ModelBox(gun159_r1, 38, 146, -1.0F, 0.0F, 0.0F, 1, 2, 11, 0.0F, false));

		gun158_r1 = new ModelRenderer(this);
		gun158_r1.setRotationPoint(-4.1F, -33.4F, -43.0F);
		handguard.addChild(gun158_r1);
		setRotationAngle(gun158_r1, 0.0F, 0.0F, -0.8923F);
		gun158_r1.cubeList.add(new ModelBox(gun158_r1, 146, 93, 0.0F, 0.0F, 0.0F, 1, 2, 11, 0.0F, false));

		gun160_r1 = new ModelRenderer(this);
		gun160_r1.setRotationPoint(-3.1F, -35.9F, -45.0F);
		handguard.addChild(gun160_r1);
		setRotationAngle(gun160_r1, 0.0F, 0.0F, 0.6692F);
		

		gun161_r1 = new ModelRenderer(this);
		gun161_r1.setRotationPoint(-3.0F, -33.6F, -45.0F);
		handguard.addChild(gun161_r1);
		setRotationAngle(gun161_r1, 0.0F, 0.0F, -2.3423F);
		

		gun163_r1 = new ModelRenderer(this);
		gun163_r1.setRotationPoint(-0.7F, -35.2F, -45.0F);
		handguard.addChild(gun163_r1);
		setRotationAngle(gun163_r1, 0.0F, 0.0F, -0.7064F);
		

		gun165_r1 = new ModelRenderer(this);
		gun165_r1.setRotationPoint(-0.7F, -34.4F, -45.0F);
		handguard.addChild(gun165_r1);
		setRotationAngle(gun165_r1, 0.0F, 0.0F, -0.7238F);
		

		gun219_r1 = new ModelRenderer(this);
		gun219_r1.setRotationPoint(-2.7F, -39.1F, -45.0F);
		handguard.addChild(gun219_r1);
		setRotationAngle(gun219_r1, 0.0F, 0.0F, -0.2231F);
		

		gun239_r1 = new ModelRenderer(this);
		gun239_r1.setRotationPoint(-1.3F, -39.3F, -45.0F);
		handguard.addChild(gun239_r1);
		setRotationAngle(gun239_r1, 0.0F, 0.0F, 0.192F);
		

		gun344_r1 = new ModelRenderer(this);
		gun344_r1.setRotationPoint(-2.7F, -32.09F, -45.0F);
		handguard.addChild(gun344_r1);
		setRotationAngle(gun344_r1, 0.0F, 0.0F, -1.1154F);
		

		gun364_r1 = new ModelRenderer(this);
		gun364_r1.setRotationPoint(-0.8F, -32.95F, -42.5F);
		handguard.addChild(gun364_r1);
		setRotationAngle(gun364_r1, 0.0F, 0.0F, 1.1897F);
		
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handguard.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}