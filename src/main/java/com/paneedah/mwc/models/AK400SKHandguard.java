package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AK400SKHandguard extends ModelBase {
	private final ModelRenderer ak400skHandguard;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer bone6;
	private final ModelRenderer cube_r62;
	private final ModelRenderer cube_r63;
	private final ModelRenderer bone5;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;

	public AK400SKHandguard() {
		textureWidth = 192;
		textureHeight = 192;

		ak400skHandguard = new ModelRenderer(this);
		ak400skHandguard.setRotationPoint(0.0F, 24.0F, 0.0F);
		ak400skHandguard.cubeList.add(new ModelBox(ak400skHandguard, 174, 15, -2.5F, -39.25F, -53.5F, 2, 1, 2, 0.0F, false));
		ak400skHandguard.cubeList.add(new ModelBox(ak400skHandguard, 174, 19, -2.5F, -32.75F, -53.5F, 2, 1, 2, 0.0F, false));
		ak400skHandguard.cubeList.add(new ModelBox(ak400skHandguard, 0, 60, -3.4063F, -38.8274F, -53.5F, 1, 1, 18, 0.0F, false));
		ak400skHandguard.cubeList.add(new ModelBox(ak400skHandguard, 39, 60, -0.5937F, -38.8274F, -53.5F, 1, 1, 18, 0.0F, false));
		ak400skHandguard.cubeList.add(new ModelBox(ak400skHandguard, 80, 0, -3.9799F, -35.7082F, -53.5F, 1, 1, 16, 0.0F, false));
		ak400skHandguard.cubeList.add(new ModelBox(ak400skHandguard, 0, 80, -0.0201F, -35.7082F, -53.5F, 1, 1, 16, 0.0F, false));
		ak400skHandguard.cubeList.add(new ModelBox(ak400skHandguard, 70, 96, -3.9799F, -33.7082F, -53.5F, 1, 1, 16, 0.0F, false));
		ak400skHandguard.cubeList.add(new ModelBox(ak400skHandguard, 35, 80, -0.0201F, -33.7082F, -53.5F, 1, 1, 16, 0.0F, false));
		ak400skHandguard.cubeList.add(new ModelBox(ak400skHandguard, 60, 98, -3.9799F, -32.7082F, -40.5F, 1, 1, 3, 0.0F, false));
		ak400skHandguard.cubeList.add(new ModelBox(ak400skHandguard, 96, 119, -0.0201F, -32.7082F, -40.5F, 1, 1, 3, 0.0F, false));
		ak400skHandguard.cubeList.add(new ModelBox(ak400skHandguard, 130, 57, -3.9799F, -34.7082F, -53.5F, 1, 1, 1, 0.0F, false));
		ak400skHandguard.cubeList.add(new ModelBox(ak400skHandguard, 55, 180, -0.0201F, -34.7082F, -53.5F, 1, 1, 1, 0.0F, false));
		ak400skHandguard.cubeList.add(new ModelBox(ak400skHandguard, 155, 53, -3.9799F, -34.7082F, -48.5F, 1, 1, 1, 0.0F, false));
		ak400skHandguard.cubeList.add(new ModelBox(ak400skHandguard, 66, 180, -0.0201F, -34.7082F, -48.5F, 1, 1, 1, 0.0F, false));
		ak400skHandguard.cubeList.add(new ModelBox(ak400skHandguard, 45, 157, -3.9799F, -34.7082F, -43.5F, 1, 1, 1, 0.0F, false));
		ak400skHandguard.cubeList.add(new ModelBox(ak400skHandguard, 71, 180, -0.0201F, -34.7082F, -43.5F, 1, 1, 1, 0.0F, false));
		ak400skHandguard.cubeList.add(new ModelBox(ak400skHandguard, 45, 160, -3.9799F, -34.7082F, -38.5F, 1, 1, 1, 0.0F, false));
		ak400skHandguard.cubeList.add(new ModelBox(ak400skHandguard, 76, 180, -0.0201F, -34.7082F, -38.5F, 1, 1, 1, 0.0F, false));
		ak400skHandguard.cubeList.add(new ModelBox(ak400skHandguard, 78, 40, -0.5937F, -36.8274F, -53.5F, 1, 1, 18, 0.0F, false));
		ak400skHandguard.cubeList.add(new ModelBox(ak400skHandguard, 78, 20, -3.4063F, -36.8274F, -53.5F, 1, 1, 18, 0.0F, false));
		ak400skHandguard.cubeList.add(new ModelBox(ak400skHandguard, 153, 179, -0.5937F, -37.8274F, -53.5F, 1, 1, 1, 0.0F, false));
		ak400skHandguard.cubeList.add(new ModelBox(ak400skHandguard, 148, 179, -3.4063F, -37.8274F, -53.5F, 1, 1, 1, 0.0F, false));
		ak400skHandguard.cubeList.add(new ModelBox(ak400skHandguard, 50, 180, -0.5937F, -37.8274F, -48.5F, 1, 1, 1, 0.0F, false));
		ak400skHandguard.cubeList.add(new ModelBox(ak400skHandguard, 176, 179, -3.4063F, -37.8274F, -48.5F, 1, 1, 1, 0.0F, false));
		ak400skHandguard.cubeList.add(new ModelBox(ak400skHandguard, 63, 174, -0.5937F, -37.8274F, -43.5F, 1, 1, 2, 0.0F, false));
		ak400skHandguard.cubeList.add(new ModelBox(ak400skHandguard, 174, 60, -3.4063F, -37.8274F, -43.5F, 1, 1, 2, 0.0F, false));
		ak400skHandguard.cubeList.add(new ModelBox(ak400skHandguard, 96, 114, -0.5937F, -37.8274F, -37.5F, 1, 1, 3, 0.0F, false));
		ak400skHandguard.cubeList.add(new ModelBox(ak400skHandguard, 60, 108, -3.4063F, -37.8274F, -37.5F, 1, 1, 3, 0.0F, false));
		ak400skHandguard.cubeList.add(new ModelBox(ak400skHandguard, 116, 171, -0.3F, -35.9974F, -37.5063F, 1, 4, 2, 0.0F, false));
		ak400skHandguard.cubeList.add(new ModelBox(ak400skHandguard, 82, 170, -3.7F, -35.9974F, -37.5063F, 1, 4, 2, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.4435F, -36.9842F, -52.5F);
		ak400skHandguard.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.4363F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 41, 0, -1.0F, -2.5F, -1.0F, 1, 1, 18, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.195F, -38.3742F, -52.5F);
		ak400skHandguard.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.4363F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 39, 40, -1.0F, -0.5F, -1.0F, 1, 1, 18, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-3.3055F, -32.9209F, -44.5F);
		ak400skHandguard.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.48F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 105, 96, -0.5F, -0.5F, -9.0F, 2, 1, 12, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.3055F, -32.9209F, -44.5F);
		ak400skHandguard.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.48F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 105, 110, -1.5F, -0.5F, -9.0F, 2, 1, 12, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-3.2835F, -35.831F, -44.5F);
		ak400skHandguard.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.6109F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 78, 60, -0.5F, -0.5F, -9.0F, 1, 1, 16, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.2835F, -35.831F, -44.5F);
		ak400skHandguard.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.6109F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 78, 78, -0.5F, -0.5F, -9.0F, 1, 1, 16, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-1.5F, -32.7442F, -41.6945F);
		ak400skHandguard.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.3927F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 60, 103, -2.4799F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 172, 101, 1.4799F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-3.2F, -31.8043F, -38.9616F);
		ak400skHandguard.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.0873F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 159, 89, 2.9F, -0.5F, -1.5F, 1, 1, 5, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 113, 89, -0.5F, -0.5F, -1.5F, 4, 1, 5, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-3.2F, -31.8043F, -38.9616F);
		ak400skHandguard.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.2182F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 150, 133, 0.25F, -0.5F, -6.3F, 3, 1, 5, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-5.595F, -33.7082F, -37.6439F);
		ak400skHandguard.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, -0.1745F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 70, 87, 5.5F, -2.0F, -1.0F, 1, 4, 2, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-3.3138F, -33.7082F, -36.602F);
		ak400skHandguard.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.1745F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 70, 80, -0.5F, -2.0F, -1.0F, 1, 4, 2, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(11.7F, -28.0F, -54.25F);
		ak400skHandguard.addChild(bone6);
		setRotationAngle(bone6, 0.0F, 0.0F, -3.1416F);
		bone6.cubeList.add(new ModelBox(bone6, 56, 164, 12.2F, 2.8F, 3.3F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 69, 167, 12.2F, 2.8F, 2.1F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 172, 111, 12.2F, 2.8F, 4.55F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 70, 174, 12.2F, 2.8F, 5.8F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 123, 174, 12.2F, 2.8F, 7.05F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 130, 174, 12.2F, 2.8F, 8.3F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 162, 174, 12.2F, 2.8F, 9.55F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 169, 174, 12.2F, 2.8F, 12.05F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 9, 175, 12.2F, 2.8F, 10.8F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 0, 98, 12.3F, 3.4F, 0.75F, 2, 1, 13, -0.001F, false));
		bone6.cubeList.add(new ModelBox(bone6, 31, 98, 12.1F, 3.4F, 0.75F, 1, 1, 13, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 89, 173, 12.2F, 2.8F, 0.55F, 2, 1, 2, -0.199F, false));

		cube_r62 = new ModelRenderer(this);
		cube_r62.setRotationPoint(-1.6F, 0.0F, -1.25F);
		bone6.addChild(cube_r62);
		setRotationAngle(cube_r62, 0.0F, 0.0F, 0.8901F);
		cube_r62.cubeList.add(new ModelBox(cube_r62, 88, 128, 10.9419F, -9.192F, 1.8F, 1, 1, 2, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 0, 113, 10.8919F, -9.042F, 2.4F, 1, 1, 12, -0.35F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 63, 171, 10.9419F, -9.192F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 77, 174, 10.9419F, -9.192F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 176, 122, 10.9419F, -9.192F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 176, 125, 10.9419F, -9.192F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 176, 128, 10.9419F, -9.192F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 151, 176, 10.9419F, -9.192F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 156, 176, 10.9419F, -9.192F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 176, 173, 10.9419F, -9.192F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 176, 176, 10.9419F, -9.192F, 3.35F, 1, 1, 1, -0.198F, false));

		cube_r63 = new ModelRenderer(this);
		cube_r63.setRotationPoint(0.0F, 0.0F, -1.25F);
		bone6.addChild(cube_r63);
		setRotationAngle(cube_r63, 0.0F, 0.0F, -0.8901F);
		cube_r63.cubeList.add(new ModelBox(cube_r63, 174, 23, 5.6791F, 12.568F, 1.8F, 1, 1, 2, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 27, 113, 5.7291F, 12.718F, 2.4F, 1, 1, 12, -0.35F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 51, 177, 5.6791F, 12.568F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 56, 177, 5.6791F, 12.568F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 70, 177, 5.6791F, 12.568F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 75, 177, 5.6791F, 12.568F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 80, 177, 5.6791F, 12.568F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 85, 177, 5.6791F, 12.568F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 90, 177, 5.6791F, 12.568F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 123, 177, 5.6791F, 12.568F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 128, 177, 5.6791F, 12.568F, 3.35F, 1, 1, 1, -0.198F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-1.4737F, -39.8631F, -46.0368F);
		ak400skHandguard.addChild(bone5);
		setRotationAngle(bone5, 0.0F, 0.0F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 16, 175, -0.9737F, -0.5632F, -5.4132F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 23, 175, -0.9737F, -0.5632F, -4.1632F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 30, 175, -0.9737F, -0.5632F, -2.9132F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 37, 175, -0.9737F, -0.5632F, -1.6632F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 44, 175, -0.9737F, -0.5632F, 0.8368F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 98, 175, -0.9737F, -0.5632F, -0.4132F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 105, 175, -0.9737F, -0.5632F, 3.3368F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 137, 175, -0.9737F, -0.5632F, 2.0868F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 144, 175, -0.9737F, -0.5632F, 5.8368F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 175, 170, -0.9737F, -0.5632F, 4.5868F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 176, 27, -0.9737F, -0.5632F, 8.3368F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 176, 30, -0.9737F, -0.5632F, 9.5368F, 2, 1, 1, -0.198F, false));
		bone5.cubeList.add(new ModelBox(bone5, 176, 39, -0.9737F, -0.5632F, 9.7368F, 2, 1, 1, -0.198F, false));
		bone5.cubeList.add(new ModelBox(bone5, 176, 33, -0.9737F, -0.5632F, 7.0868F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 0, 0, -0.8737F, 0.0368F, -7.4632F, 2, 1, 18, -0.001F, false));
		bone5.cubeList.add(new ModelBox(bone5, 0, 20, -1.0737F, 0.0368F, -7.4632F, 1, 1, 18, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 174, 0, -0.9737F, -0.5632F, -7.6632F, 2, 1, 2, -0.199F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-14.7737F, -0.3632F, -12.4632F);
		bone5.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.8901F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 174, 52, 8.6105F, -11.08F, 4.8F, 1, 1, 2, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 39, 20, 8.5605F, -10.93F, 5.4F, 1, 1, 18, -0.35F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 161, 177, 8.6105F, -11.08F, 19.55F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 166, 177, 8.6105F, -11.08F, 22.0F, 1, 1, 1, -0.197F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 178, 167, 8.6105F, -11.08F, 22.2F, 1, 1, 1, -0.197F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 171, 177, 8.6105F, -11.08F, 20.8F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 178, 8.6105F, -11.08F, 17.05F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 5, 178, 8.6105F, -11.08F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 10, 178, 8.6105F, -11.08F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 15, 178, 8.6105F, -11.08F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 20, 178, 8.6105F, -11.08F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 25, 178, 8.6105F, -11.08F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 30, 178, 8.6105F, -11.08F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 35, 178, 8.6105F, -11.08F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 40, 178, 8.6105F, -11.08F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 178, 42, 8.6105F, -11.08F, 7.05F, 1, 1, 1, -0.198F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-13.1737F, -0.3632F, -12.4632F);
		bone5.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.8901F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 174, 56, 8.0105F, 10.68F, 4.8F, 1, 1, 2, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 40, 8.0605F, 10.83F, 5.4F, 1, 1, 18, -0.35F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 45, 178, 8.0105F, 10.68F, 19.55F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 178, 45, 8.0105F, 10.68F, 22.0F, 1, 1, 1, -0.197F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 179, 111, 8.0105F, 10.68F, 22.2F, 1, 1, 1, -0.197F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 178, 48, 8.0105F, 10.68F, 20.8F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 61, 178, 8.0105F, 10.68F, 17.05F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 95, 178, 8.0105F, 10.68F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 100, 178, 8.0105F, 10.68F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 105, 178, 8.0105F, 10.68F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 110, 178, 8.0105F, 10.68F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 115, 178, 8.0105F, 10.68F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 133, 178, 8.0105F, 10.68F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 138, 178, 8.0105F, 10.68F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 143, 178, 8.0105F, 10.68F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 178, 164, 8.0105F, 10.68F, 7.05F, 1, 1, 1, -0.198F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ak400skHandguard.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}