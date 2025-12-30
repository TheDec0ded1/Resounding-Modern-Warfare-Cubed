package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Glock26TTSlide extends ModelWithAttachments {
	private final ModelRenderer G26razorbackslide;
	private final ModelRenderer slide59_r1;
	private final ModelRenderer slide70_r1;
	private final ModelRenderer slide57_r1;
	private final ModelRenderer slide58_r1;
	private final ModelRenderer slide57_r2;
	private final ModelRenderer slide57_r3;
	private final ModelRenderer slide16_r1;
	private final ModelRenderer slide15_r1;
	private final ModelRenderer slide19_r1;
	private final ModelRenderer slide23_r2;
	private final ModelRenderer slide22_r2;
	private final ModelRenderer slide21_r3;
	private final ModelRenderer slide21_r4;
	private final ModelRenderer slide20_r2;
	private final ModelRenderer slide19_r2;
	private final ModelRenderer slide17_r1;
	private final ModelRenderer slide16_r2;
	private final ModelRenderer slide15_r2;
	private final ModelRenderer slide14_r1;
	private final ModelRenderer slide15_r3;
	private final ModelRenderer slide14_r2;
	private final ModelRenderer slide34_r1;
	private final ModelRenderer slide34_r2;
	private final ModelRenderer slide34_r3;
	private final ModelRenderer slide33_r1;
	private final ModelRenderer slide32_r1;
	private final ModelRenderer slide33_r2;
	private final ModelRenderer slide32_r2;
	private final ModelRenderer slide31_r1;
	private final ModelRenderer slide42_r1;
	private final ModelRenderer slide41_r1;
	private final ModelRenderer slide38_r1;
	private final ModelRenderer slide35_r1;
	private final ModelRenderer slide35_r2;
	private final ModelRenderer slide34_r4;
	private final ModelRenderer slide29_r1;
	private final ModelRenderer slide29_r2;
	private final ModelRenderer slide30_r1;
	private final ModelRenderer slide28_r1;
	private final ModelRenderer sights2;
	private final ModelRenderer front2;
	private final ModelRenderer dot_r1;
	private final ModelRenderer rear4;
	private final ModelRenderer sights_r1;
	private final ModelRenderer sights_r2;
	private final ModelRenderer rear5;
	private final ModelRenderer sights_r3;
	private final ModelRenderer sights_r4;
	private final ModelRenderer sights_r5;
	private final ModelRenderer sights_r6;
	private final ModelRenderer mark_r1;
	private final ModelRenderer rear6;
	private final ModelRenderer sights_r7;
	private final ModelRenderer sights_r8;
	private final ModelRenderer mark_r2;

	public Glock26TTSlide() {
		textureWidth = 192;
		textureHeight = 192;

		G26razorbackslide = new ModelRenderer(this);
		G26razorbackslide.setRotationPoint(0.0F, 24.0F, 0.0F);
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 86, 168, -2.5F, -37.5F, 0.9F, 3, 2, 1, 0.0F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 133, 163, -2.3F, -37.5F, -23.499F, 2, 5, 1, 0.0F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 52, 170, -0.7F, -37.5F, -23.501F, 1, 5, 1, 0.0F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 41, 71, -3.1F, -36.0F, -16.5F, 1, 2, 18, 0.0F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 0, 75, 0.1F, -36.0F, -16.5F, 1, 2, 18, 0.0F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 149, 101, -3.1F, -35.0F, -23.5F, 1, 1, 5, 0.0F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 149, 108, 0.1F, -35.0F, -23.5F, 1, 1, 5, 0.0F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 155, 115, -3.1F, -37.0F, -23.5F, 1, 2, 4, 0.0F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 13, 156, 0.1F, -37.0F, -23.5F, 1, 2, 4, 0.0F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 180, 89, 0.1F, -37.0F, -19.5F, 1, 2, 1, 0.0F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 15, 180, -3.1F, -37.0F, -19.5F, 1, 2, 1, 0.0F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 172, 37, -3.101F, -35.5F, -18.5F, 1, 1, 2, 0.0F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 172, 41, 0.099F, -35.5F, -18.5F, 1, 1, 2, 0.0F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 173, 99, 0.099F, -36.5F, -18.5F, 1, 1, 2, 0.0F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 76, 173, -3.101F, -36.5F, -18.5F, 1, 1, 2, 0.0F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 128, 103, -3.099F, -37.5F, -7.5F, 1, 2, 9, 0.0F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 80, 71, 0.101F, -37.5F, -15.5F, 1, 2, 17, 0.0F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 70, 104, -2.4F, -38.1F, -10.5F, 2, 1, 12, 0.0F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 161, 149, -3.0F, -38.2F, -2.75F, 4, 1, 1, 0.0F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 96, 41, -2.5F, -38.201F, -4.75F, 3, 1, 5, 0.0F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 53, 26, -0.6F, -38.101F, -18.5F, 1, 1, 20, 0.0F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 181, 0, -0.6F, -38.101F, -23.5F, 1, 1, 1, 0.0F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 28, 150, -0.35F, -38.35F, -22.75F, 1, 1, 5, -0.25F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 41, 150, -2.65F, -38.351F, -22.75F, 1, 1, 5, -0.25F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 124, 134, -3.099F, -37.501F, -23.5F, 1, 1, 8, 0.0F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 134, 124, 0.101F, -37.501F, -23.5F, 1, 1, 8, 0.0F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 181, 8, -3.2F, -37.501F, 1.001F, 1, 1, 1, 0.0F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 181, 31, -3.201F, -37.501F, 0.601F, 1, 1, 1, 0.0F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 49, 181, 0.199F, -37.501F, 0.601F, 1, 1, 1, 0.0F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 54, 181, 0.199F, -37.501F, 1.001F, 1, 1, 1, 0.0F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 162, 174, -3.4F, -37.001F, -7.8F, 1, 2, 1, -0.2F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 41, 175, -3.401F, -37.7F, -7.801F, 1, 2, 1, -0.2F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 59, 181, -3.199F, -37.501F, -16.5F, 1, 1, 1, 0.0F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 119, 173, -3.199F, -37.001F, 1.0F, 1, 3, 1, 0.0F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 76, 181, -3.099F, -35.901F, 0.9F, 1, 1, 1, -0.001F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 81, 181, -1.5F, -35.901F, 0.9F, 1, 1, 1, -0.001F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 106, 181, 0.101F, -35.901F, 0.9F, 1, 1, 1, -0.001F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 124, 173, 0.2F, -37.001F, 1.0F, 1, 3, 1, 0.0F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 46, 175, -3.45F, -35.75F, -0.25F, 1, 2, 1, -0.25F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 175, 92, 0.45F, -35.75F, -0.25F, 1, 2, 1, -0.25F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 175, 114, -3.45F, -35.75F, -2.25F, 1, 2, 1, -0.25F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 175, 118, 0.45F, -35.75F, -2.25F, 1, 2, 1, -0.25F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 175, 122, -3.45F, -35.75F, -1.25F, 1, 2, 1, -0.25F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 175, 126, 0.45F, -35.75F, -1.25F, 1, 2, 1, -0.25F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 141, 175, -3.45F, -35.75F, -3.25F, 1, 2, 1, -0.25F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 175, 152, 0.45F, -35.75F, -3.25F, 1, 2, 1, -0.25F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 175, 156, -3.45F, -35.75F, -5.25F, 1, 2, 1, -0.25F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 176, 0, 0.45F, -35.75F, -5.25F, 1, 2, 1, -0.25F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 14, 176, -3.45F, -35.75F, -4.25F, 1, 2, 1, -0.25F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 19, 176, 0.45F, -35.75F, -4.25F, 1, 2, 1, -0.25F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 146, 176, -3.45F, -35.75F, -6.25F, 1, 2, 1, -0.25F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 167, 176, 0.45F, -35.75F, -6.25F, 1, 2, 1, -0.25F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 172, 176, -3.45F, -35.75F, -7.25F, 1, 2, 1, -0.25F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 0, 177, 0.45F, -35.75F, -7.25F, 1, 2, 1, -0.25F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 179, 168, 0.45F, -35.75F, -16.25F, 1, 2, 1, -0.25F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 51, 177, -3.45F, -35.75F, -19.25F, 1, 2, 1, -0.25F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 56, 177, 0.45F, -35.75F, -19.25F, 1, 2, 1, -0.25F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 61, 177, -3.45F, -35.75F, -20.25F, 1, 2, 1, -0.25F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 76, 177, 0.45F, -35.75F, -20.25F, 1, 2, 1, -0.25F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 81, 177, -3.45F, -35.75F, -21.25F, 1, 2, 1, -0.25F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 177, 85, 0.45F, -35.75F, -21.25F, 1, 2, 1, -0.25F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 106, 177, -3.45F, -35.75F, -22.25F, 1, 2, 1, -0.25F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 129, 177, 0.45F, -35.75F, -22.25F, 1, 2, 1, -0.25F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 0, 111, -3.45F, -34.75F, -18.75F, 1, 1, 12, -0.25F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 27, 117, 0.45F, -34.75F, -18.75F, 1, 1, 12, -0.25F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 68, 165, -3.451F, -34.75F, -22.25F, 1, 1, 3, -0.25F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 77, 165, 0.449F, -34.75F, -22.25F, 1, 1, 3, -0.25F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 129, 150, -3.199F, -36.001F, -16.0F, 1, 1, 5, 0.0F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 166, 115, -3.2F, -36.201F, -10.5F, 1, 1, 3, 0.0F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 185, 107, -0.6F, -38.1F, 1.002F, 1, 1, 1, 0.0F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 54, 150, -2.4F, -38.099F, 1.003F, 2, 1, 1, 0.0F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 11, 163, -2.4F, -38.1F, -18.5F, 2, 1, 3, 0.0F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 172, 24, -2.4F, -38.1F, -23.5F, 2, 1, 1, 0.0F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 126, 181, -3.0F, -37.0F, -10.499F, 1, 1, 1, 0.0F, false));
		G26razorbackslide.cubeList.add(new ModelBox(G26razorbackslide, 172, 45, -2.9F, -37.0F, -9.5F, 1, 1, 2, 0.0F, false));

		slide59_r1 = new ModelRenderer(this);
		slide59_r1.setRotationPoint(-2.75F, -38.15F, -2.1F);
		G26razorbackslide.addChild(slide59_r1);
		setRotationAngle(slide59_r1, 0.0F, 0.0F, -0.6545F);
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 149, 181, -1.0F, 0.0F, 0.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 111, 185, -0.5F, 0.0F, -2.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 185, 113, -1.0F, 0.0F, -2.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 154, 181, -0.5F, 0.0F, -20.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 181, 172, -0.5F, 0.0F, -4.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 181, 180, -1.0F, 0.0F, -20.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 5, 182, -1.0F, 0.0F, -4.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 182, 83, -0.5F, 0.0F, 1.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 86, 182, -1.0F, 0.0F, 1.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 182, 86, -1.0F, 0.0F, -1.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 140, 166, -0.5F, 0.0F, -18.0F, 1, 1, 3, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 91, 182, -0.5F, 0.0F, -19.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 96, 182, -0.5F, 0.0F, -3.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 166, 152, -1.0F, 0.0F, -18.0F, 1, 1, 3, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 101, 182, -1.0F, 0.0F, -19.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 111, 182, -1.0F, 0.0F, -3.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 116, 182, -0.5F, 0.0F, -21.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 121, 182, -0.5F, 0.0F, -5.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 131, 182, -1.0F, 0.0F, -21.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 182, 142, -1.0F, 0.0F, -5.0F, 1, 1, 1, -0.25F, false));

		slide70_r1 = new ModelRenderer(this);
		slide70_r1.setRotationPoint(1.55F, -37.53F, -28.1F);
		G26razorbackslide.addChild(slide70_r1);
		setRotationAngle(slide70_r1, 0.0F, 0.0F, 0.6545F);
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 182, 158, -1.5F, 0.0F, 5.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 159, 182, -1.5F, 0.0F, 7.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 182, 161, -1.5F, 0.0F, 6.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 182, 175, -1.5F, 0.0F, 21.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 183, 3, -1.0F, 0.0F, 5.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 20, 183, -1.0F, 0.0F, 7.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 25, 183, -1.0F, 0.0F, 6.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 30, 183, -1.0F, 0.0F, 21.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 116, 185, -1.5F, 0.0F, 24.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 185, 116, -1.0F, 0.0F, 24.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 35, 183, -1.0F, 0.0F, 26.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 40, 183, -1.5F, 0.0F, 22.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 64, 183, -1.0F, 0.0F, 22.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 69, 183, -1.5F, 0.0F, 23.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 183, 129, -1.0F, 0.0F, 23.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 183, 132, -1.0F, 0.0F, 25.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 183, 135, -1.5F, 0.0F, 27.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 136, 183, -1.0F, 0.0F, 27.0F, 1, 1, 1, -0.25F, false));

		slide57_r1 = new ModelRenderer(this);
		slide57_r1.setRotationPoint(0.4F, -38.1F, -34.75F);
		G26razorbackslide.addChild(slide57_r1);
		setRotationAngle(slide57_r1, 0.0F, 0.0F, 0.6545F);
		slide57_r1.cubeList.add(new ModelBox(slide57_r1, 183, 138, 0.0F, -0.001F, 15.0F, 1, 1, 1, 0.0F, false));
		slide57_r1.cubeList.add(new ModelBox(slide57_r1, 172, 49, 0.0F, -0.001F, 15.5F, 1, 1, 2, 0.0F, false));
		slide57_r1.cubeList.add(new ModelBox(slide57_r1, 172, 59, 0.0F, -0.001F, 18.25F, 1, 1, 2, 0.0F, false));
		slide57_r1.cubeList.add(new ModelBox(slide57_r1, 0, 137, 0.0F, 0.0F, 19.75F, 1, 1, 8, 0.0F, false));
		slide57_r1.cubeList.add(new ModelBox(slide57_r1, 181, 183, 0.0F, -0.001F, 35.0F, 1, 1, 1, 0.0F, false));
		slide57_r1.cubeList.add(new ModelBox(slide57_r1, 10, 184, 0.0F, 0.0F, 35.75F, 1, 1, 1, 0.0F, false));

		slide58_r1 = new ModelRenderer(this);
		slide58_r1.setRotationPoint(0.31F, -38.1F, -28.5F);
		G26razorbackslide.addChild(slide58_r1);
		setRotationAngle(slide58_r1, 0.0F, 0.0F, 0.6545F);
		slide58_r1.cubeList.add(new ModelBox(slide58_r1, 53, 0, 0.0F, -0.001F, 5.0F, 1, 1, 24, 0.0F, false));

		slide57_r2 = new ModelRenderer(this);
		slide57_r2.setRotationPoint(-2.3F, -38.1F, -28.5F);
		G26razorbackslide.addChild(slide57_r2);
		setRotationAngle(slide57_r2, 0.0F, 0.0F, -0.6545F);
		slide57_r2.cubeList.add(new ModelBox(slide57_r2, 140, 91, -1.0F, -0.001F, 5.0F, 1, 1, 8, 0.0F, false));
		slide57_r2.cubeList.add(new ModelBox(slide57_r2, 142, 77, -1.0F, -0.001F, 21.0F, 1, 1, 8, 0.0F, false));

		slide57_r3 = new ModelRenderer(this);
		slide57_r3.setRotationPoint(-2.4F, -38.1F, -8.0F);
		G26razorbackslide.addChild(slide57_r3);
		setRotationAngle(slide57_r3, 0.0F, 0.0F, -0.6545F);
		slide57_r3.cubeList.add(new ModelBox(slide57_r3, 184, 11, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		slide57_r3.cubeList.add(new ModelBox(slide57_r3, 184, 14, -1.0F, -0.001F, -8.5F, 1, 1, 1, 0.0F, false));
		slide57_r3.cubeList.add(new ModelBox(slide57_r3, 167, 0, -1.0F, -0.001F, -2.5F, 1, 1, 3, 0.0F, false));
		slide57_r3.cubeList.add(new ModelBox(slide57_r3, 15, 184, -1.0F, -0.001F, 8.25F, 1, 1, 1, 0.0F, false));
		slide57_r3.cubeList.add(new ModelBox(slide57_r3, 184, 17, -1.0F, 0.0F, 9.0F, 1, 1, 1, 0.0F, false));

		slide16_r1 = new ModelRenderer(this);
		slide16_r1.setRotationPoint(-0.9F, -38.2F, -20.5F);
		G26razorbackslide.addChild(slide16_r1);
		setRotationAngle(slide16_r1, 0.0F, 0.8378F, 0.0F);
		slide16_r1.cubeList.add(new ModelBox(slide16_r1, 184, 20, -1.4864F, -0.001F, 1.3382F, 1, 1, 1, -0.1F, false));

		slide15_r1 = new ModelRenderer(this);
		slide15_r1.setRotationPoint(-1.1F, -38.2F, -20.5F);
		G26razorbackslide.addChild(slide15_r1);
		setRotationAngle(slide15_r1, 0.0F, -0.8378F, 0.0F);
		slide15_r1.cubeList.add(new ModelBox(slide15_r1, 184, 23, 0.4864F, -0.001F, 1.3382F, 1, 1, 1, -0.1F, false));

		slide19_r1 = new ModelRenderer(this);
		slide19_r1.setRotationPoint(-3.2F, -36.201F, -10.5F);
		G26razorbackslide.addChild(slide19_r1);
		setRotationAngle(slide19_r1, -1.2915F, 0.0F, 0.0F);
		slide19_r1.cubeList.add(new ModelBox(slide19_r1, 184, 26, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		slide23_r2 = new ModelRenderer(this);
		slide23_r2.setRotationPoint(-0.5F, -36.501F, 0.55F);
		G26razorbackslide.addChild(slide23_r2);
		setRotationAngle(slide23_r2, -0.7854F, 0.0F, 0.0F);
		slide23_r2.cubeList.add(new ModelBox(slide23_r2, 170, 53, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide22_r2 = new ModelRenderer(this);
		slide22_r2.setRotationPoint(-0.5F, -36.301F, 0.55F);
		G26razorbackslide.addChild(slide22_r2);
		setRotationAngle(slide22_r2, -0.7854F, 0.0F, 0.0F);
		slide22_r2.cubeList.add(new ModelBox(slide22_r2, 170, 56, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide21_r3 = new ModelRenderer(this);
		slide21_r3.setRotationPoint(-0.5F, -35.901F, 0.55F);
		G26razorbackslide.addChild(slide21_r3);
		setRotationAngle(slide21_r3, -0.7854F, 0.0F, 0.0F);
		slide21_r3.cubeList.add(new ModelBox(slide21_r3, 68, 170, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide21_r4 = new ModelRenderer(this);
		slide21_r4.setRotationPoint(-0.5F, -36.101F, 0.55F);
		G26razorbackslide.addChild(slide21_r4);
		setRotationAngle(slide21_r4, -0.7854F, 0.0F, 0.0F);
		slide21_r4.cubeList.add(new ModelBox(slide21_r4, 170, 71, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide20_r2 = new ModelRenderer(this);
		slide20_r2.setRotationPoint(-0.5F, -35.701F, 0.55F);
		G26razorbackslide.addChild(slide20_r2);
		setRotationAngle(slide20_r2, -0.7854F, 0.0F, 0.0F);
		slide20_r2.cubeList.add(new ModelBox(slide20_r2, 170, 74, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide19_r2 = new ModelRenderer(this);
		slide19_r2.setRotationPoint(0.201F, -36.501F, -16.5F);
		G26razorbackslide.addChild(slide19_r2);
		setRotationAngle(slide19_r2, 0.3316F, 0.0F, 0.0F);
		slide19_r2.cubeList.add(new ModelBox(slide19_r2, 184, 34, -3.401F, 0.601F, 0.0F, 1, 1, 1, 0.0F, false));
		slide19_r2.cubeList.add(new ModelBox(slide19_r2, 184, 37, -3.4F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		slide17_r1 = new ModelRenderer(this);
		slide17_r1.setRotationPoint(1.0F, -38.2F, -2.75F);
		G26razorbackslide.addChild(slide17_r1);
		setRotationAngle(slide17_r1, 0.0F, -1.2043F, 0.0F);
		slide17_r1.cubeList.add(new ModelBox(slide17_r1, 173, 111, -2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		slide16_r2 = new ModelRenderer(this);
		slide16_r2.setRotationPoint(1.0F, -38.2F, -1.75F);
		G26razorbackslide.addChild(slide16_r2);
		setRotationAngle(slide16_r2, 0.0F, 1.2043F, 0.0F);
		slide16_r2.cubeList.add(new ModelBox(slide16_r2, 148, 173, -2.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

		slide15_r2 = new ModelRenderer(this);
		slide15_r2.setRotationPoint(-3.0F, -38.2F, -1.75F);
		G26razorbackslide.addChild(slide15_r2);
		setRotationAngle(slide15_r2, 0.0F, -1.2043F, 0.0F);
		slide15_r2.cubeList.add(new ModelBox(slide15_r2, 167, 173, 0.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

		slide14_r1 = new ModelRenderer(this);
		slide14_r1.setRotationPoint(-3.0F, -38.2F, -2.75F);
		G26razorbackslide.addChild(slide14_r1);
		setRotationAngle(slide14_r1, 0.0F, 1.2043F, 0.0F);
		slide14_r1.cubeList.add(new ModelBox(slide14_r1, 0, 174, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		slide15_r3 = new ModelRenderer(this);
		slide15_r3.setRotationPoint(0.0F, -38.3F, -2.95F);
		G26razorbackslide.addChild(slide15_r3);
		setRotationAngle(slide15_r3, 0.0F, -0.5411F, 0.0F);
		slide15_r3.cubeList.add(new ModelBox(slide15_r3, 184, 40, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		slide14_r2 = new ModelRenderer(this);
		slide14_r2.setRotationPoint(-2.0F, -38.3F, -2.95F);
		G26razorbackslide.addChild(slide14_r2);
		setRotationAngle(slide14_r2, 0.0F, 0.5411F, 0.0F);
		slide14_r2.cubeList.add(new ModelBox(slide14_r2, 184, 43, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		slide34_r1 = new ModelRenderer(this);
		slide34_r1.setRotationPoint(1.45F, -34.95F, -3.1F);
		G26razorbackslide.addChild(slide34_r1);
		setRotationAngle(slide34_r1, 0.384F, 0.0F, 0.0F);
		slide34_r1.cubeList.add(new ModelBox(slide34_r1, 177, 142, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide34_r1.cubeList.add(new ModelBox(slide34_r1, 151, 177, -4.9F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide34_r1.cubeList.add(new ModelBox(slide34_r1, 156, 177, -1.001F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide34_r1.cubeList.add(new ModelBox(slide34_r1, 177, 160, -4.901F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));

		slide34_r2 = new ModelRenderer(this);
		slide34_r2.setRotationPoint(1.45F, -34.95F, -7.1F);
		G26razorbackslide.addChild(slide34_r2);
		setRotationAngle(slide34_r2, 0.384F, 0.0F, 0.0F);
		slide34_r2.cubeList.add(new ModelBox(slide34_r2, 177, 176, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide34_r2.cubeList.add(new ModelBox(slide34_r2, 179, 164, -1.0F, -5.3717F, -8.3446F, 1, 2, 1, -0.25F, false));
		slide34_r2.cubeList.add(new ModelBox(slide34_r2, 178, 4, -4.9F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));

		slide34_r3 = new ModelRenderer(this);
		slide34_r3.setRotationPoint(1.45F, -35.95F, -11.1F);
		G26razorbackslide.addChild(slide34_r3);
		setRotationAngle(slide34_r3, -0.384F, 0.0F, 0.0F);
		

		slide33_r1 = new ModelRenderer(this);
		slide33_r1.setRotationPoint(1.45F, -34.95F, -6.1F);
		G26razorbackslide.addChild(slide33_r1);
		setRotationAngle(slide33_r1, 0.384F, 0.0F, 0.0F);
		slide33_r1.cubeList.add(new ModelBox(slide33_r1, 5, 178, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide33_r1.cubeList.add(new ModelBox(slide33_r1, 86, 178, -4.9F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide33_r1.cubeList.add(new ModelBox(slide33_r1, 91, 178, -1.001F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide33_r1.cubeList.add(new ModelBox(slide33_r1, 179, 146, -1.001F, -3.1246F, -0.9272F, 1, 2, 1, -0.25F, false));
		slide33_r1.cubeList.add(new ModelBox(slide33_r1, 10, 180, -1.001F, -6.4963F, -9.2717F, 1, 2, 1, -0.25F, false));
		slide33_r1.cubeList.add(new ModelBox(slide33_r1, 96, 178, -4.901F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));

		slide32_r1 = new ModelRenderer(this);
		slide32_r1.setRotationPoint(1.45F, -34.95F, -27.1F);
		G26razorbackslide.addChild(slide32_r1);
		setRotationAngle(slide32_r1, 0.384F, 0.0F, 0.0F);
		slide32_r1.cubeList.add(new ModelBox(slide32_r1, 101, 178, -1.0F, -0.1268F, 4.6359F, 1, 2, 1, -0.25F, false));
		slide32_r1.cubeList.add(new ModelBox(slide32_r1, 111, 178, -4.9F, -0.1268F, 4.6359F, 1, 2, 1, -0.25F, false));
		slide32_r1.cubeList.add(new ModelBox(slide32_r1, 116, 178, -1.001F, -0.8768F, 4.6359F, 1, 2, 1, -0.25F, false));
		slide32_r1.cubeList.add(new ModelBox(slide32_r1, 121, 178, -4.901F, -0.8768F, 4.6359F, 1, 2, 1, -0.25F, false));

		slide33_r2 = new ModelRenderer(this);
		slide33_r2.setRotationPoint(1.45F, -34.95F, -2.1F);
		G26razorbackslide.addChild(slide33_r2);
		setRotationAngle(slide33_r2, 0.384F, 0.0F, 0.0F);
		slide33_r2.cubeList.add(new ModelBox(slide33_r2, 178, 130, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide33_r2.cubeList.add(new ModelBox(slide33_r2, 134, 178, -4.9F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide33_r2.cubeList.add(new ModelBox(slide33_r2, 178, 134, -1.001F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide33_r2.cubeList.add(new ModelBox(slide33_r2, 178, 138, -4.901F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));

		slide32_r2 = new ModelRenderer(this);
		slide32_r2.setRotationPoint(1.45F, -34.95F, -5.1F);
		G26razorbackslide.addChild(slide32_r2);
		setRotationAngle(slide32_r2, 0.384F, 0.0F, 0.0F);
		slide32_r2.cubeList.add(new ModelBox(slide32_r2, 161, 178, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide32_r2.cubeList.add(new ModelBox(slide32_r2, 179, 11, -4.9F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide32_r2.cubeList.add(new ModelBox(slide32_r2, 179, 15, -1.001F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide32_r2.cubeList.add(new ModelBox(slide32_r2, 179, 19, -4.901F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));

		slide31_r1 = new ModelRenderer(this);
		slide31_r1.setRotationPoint(1.45F, -34.95F, -26.1F);
		G26razorbackslide.addChild(slide31_r1);
		setRotationAngle(slide31_r1, 0.384F, 0.0F, 0.0F);
		slide31_r1.cubeList.add(new ModelBox(slide31_r1, 179, 23, -1.0F, -0.1268F, 4.6359F, 1, 2, 1, -0.25F, false));
		slide31_r1.cubeList.add(new ModelBox(slide31_r1, 24, 179, -4.9F, -0.1268F, 4.6359F, 1, 2, 1, -0.25F, false));
		slide31_r1.cubeList.add(new ModelBox(slide31_r1, 179, 27, -1.001F, -0.8768F, 4.6359F, 1, 2, 1, -0.25F, false));
		slide31_r1.cubeList.add(new ModelBox(slide31_r1, 29, 179, -4.901F, -0.8768F, 4.6359F, 1, 2, 1, -0.25F, false));

		slide42_r1 = new ModelRenderer(this);
		slide42_r1.setRotationPoint(1.45F, -34.95F, -25.1F);
		G26razorbackslide.addChild(slide42_r1);
		setRotationAngle(slide42_r1, 0.384F, 0.0F, 0.0F);
		slide42_r1.cubeList.add(new ModelBox(slide42_r1, 34, 179, -1.001F, -0.8768F, 4.6359F, 1, 2, 1, -0.25F, false));
		slide42_r1.cubeList.add(new ModelBox(slide42_r1, 179, 35, -4.901F, -0.8768F, 4.6359F, 1, 2, 1, -0.25F, false));
		slide42_r1.cubeList.add(new ModelBox(slide42_r1, 39, 179, -1.0F, -0.1268F, 4.6359F, 1, 2, 1, -0.25F, false));
		slide42_r1.cubeList.add(new ModelBox(slide42_r1, 179, 39, -4.9F, -0.1268F, 4.6359F, 1, 2, 1, -0.25F, false));

		slide41_r1 = new ModelRenderer(this);
		slide41_r1.setRotationPoint(1.45F, -34.95F, -21.1F);
		G26razorbackslide.addChild(slide41_r1);
		setRotationAngle(slide41_r1, 0.384F, 0.0F, 0.0F);
		slide41_r1.cubeList.add(new ModelBox(slide41_r1, 179, 43, -1.001F, -2.0007F, 1.8544F, 1, 2, 1, -0.25F, false));
		slide41_r1.cubeList.add(new ModelBox(slide41_r1, 44, 179, -4.901F, -2.0007F, 1.8544F, 1, 2, 1, -0.25F, false));

		slide38_r1 = new ModelRenderer(this);
		slide38_r1.setRotationPoint(1.45F, -34.95F, -4.1F);
		G26razorbackslide.addChild(slide38_r1);
		setRotationAngle(slide38_r1, 0.384F, 0.0F, 0.0F);
		slide38_r1.cubeList.add(new ModelBox(slide38_r1, 180, 125, -1.001F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide38_r1.cubeList.add(new ModelBox(slide38_r1, 144, 180, -4.901F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide38_r1.cubeList.add(new ModelBox(slide38_r1, 180, 150, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide38_r1.cubeList.add(new ModelBox(slide38_r1, 180, 154, -4.9F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));

		slide35_r1 = new ModelRenderer(this);
		slide35_r1.setRotationPoint(1.45F, -34.95F, -1.1F);
		G26razorbackslide.addChild(slide35_r1);
		setRotationAngle(slide35_r1, 0.384F, 0.0F, 0.0F);
		slide35_r1.cubeList.add(new ModelBox(slide35_r1, 179, 47, -1.001F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide35_r1.cubeList.add(new ModelBox(slide35_r1, 179, 51, -4.901F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide35_r1.cubeList.add(new ModelBox(slide35_r1, 179, 55, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide35_r1.cubeList.add(new ModelBox(slide35_r1, 179, 59, -4.9F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));

		slide35_r2 = new ModelRenderer(this);
		slide35_r2.setRotationPoint(1.45F, -34.95F, 0.9F);
		G26razorbackslide.addChild(slide35_r2);
		setRotationAngle(slide35_r2, 0.384F, 0.0F, 0.0F);
		slide35_r2.cubeList.add(new ModelBox(slide35_r2, 174, 15, -1.001F, -2.75F, 0.0F, 1, 3, 1, -0.25F, false));
		slide35_r2.cubeList.add(new ModelBox(slide35_r2, 25, 174, -4.901F, -2.75F, 0.0F, 1, 3, 1, -0.25F, false));

		slide34_r4 = new ModelRenderer(this);
		slide34_r4.setRotationPoint(1.45F, -34.95F, -0.1F);
		G26razorbackslide.addChild(slide34_r4);
		setRotationAngle(slide34_r4, 0.384F, 0.0F, 0.0F);
		slide34_r4.cubeList.add(new ModelBox(slide34_r4, 179, 63, -1.001F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide34_r4.cubeList.add(new ModelBox(slide34_r4, 66, 179, -4.901F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide34_r4.cubeList.add(new ModelBox(slide34_r4, 179, 67, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide34_r4.cubeList.add(new ModelBox(slide34_r4, 71, 179, -4.9F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));

		slide29_r1 = new ModelRenderer(this);
		slide29_r1.setRotationPoint(1.45F, -34.95F, -21.1F);
		G26razorbackslide.addChild(slide29_r1);
		setRotationAngle(slide29_r1, 0.384F, 0.0F, 0.0F);
		slide29_r1.cubeList.add(new ModelBox(slide29_r1, 179, 71, -1.0F, -1.2507F, 1.8544F, 1, 2, 1, -0.25F, false));
		slide29_r1.cubeList.add(new ModelBox(slide29_r1, 179, 75, -4.9F, -1.2507F, 1.8544F, 1, 2, 1, -0.25F, false));

		slide29_r2 = new ModelRenderer(this);
		slide29_r2.setRotationPoint(1.099F, -34.75F, -16.1F);
		G26razorbackslide.addChild(slide29_r2);
		setRotationAngle(slide29_r2, 0.384F, 0.0F, 0.0F);
		slide29_r2.cubeList.add(new ModelBox(slide29_r2, 48, 157, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));
		slide29_r2.cubeList.add(new ModelBox(slide29_r2, 139, 179, -1.0F, -1.5973F, 0.9967F, 1, 2, 1, 0.0F, false));
		slide29_r2.cubeList.add(new ModelBox(slide29_r2, 59, 161, -4.2F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		slide30_r1 = new ModelRenderer(this);
		slide30_r1.setRotationPoint(-2.101F, -34.35F, -24.7F);
		G26razorbackslide.addChild(slide30_r1);
		setRotationAngle(slide30_r1, 0.384F, 0.0F, 0.0F);
		

		slide28_r1 = new ModelRenderer(this);
		slide28_r1.setRotationPoint(1.099F, -34.75F, -21.2F);
		G26razorbackslide.addChild(slide28_r1);
		setRotationAngle(slide28_r1, 0.384F, 0.0F, 0.0F);
		

		sights2 = new ModelRenderer(this);
		sights2.setRotationPoint(0.0F, 0.0F, 0.0F);
		G26razorbackslide.addChild(sights2);
		

		front2 = new ModelRenderer(this);
		front2.setRotationPoint(0.5F, 8.0F, 0.0F);
		sights2.addChild(front2);
		front2.cubeList.add(new ModelBox(front2, 180, 117, -2.0F, -47.4874F, -23.5475F, 1, 2, 1, -0.2F, false));

		dot_r1 = new ModelRenderer(this);
		dot_r1.setRotationPoint(-1.5F, -46.7359F, -22.9144F);
		front2.addChild(dot_r1);
		setRotationAngle(dot_r1, 0.1309F, 0.0F, 0.0F);
		dot_r1.cubeList.add(new ModelBox(dot_r1, 89, 185, -0.5F, -0.775F, -0.4375F, 1, 1, 1, -0.3F, false));
		dot_r1.cubeList.add(new ModelBox(dot_r1, 180, 113, -0.5F, -0.725F, -0.5625F, 1, 2, 1, -0.2F, false));

		rear4 = new ModelRenderer(this);
		rear4.setRotationPoint(0.0F, -0.3F, 23.3F);
		sights2.addChild(rear4);
		rear4.cubeList.add(new ModelBox(rear4, 174, 173, -2.0F, -38.8874F, -23.1474F, 2, 1, 1, -0.2F, false));

		sights_r1 = new ModelRenderer(this);
		sights_r1.setRotationPoint(-1.0F, -38.5021F, -22.7088F);
		rear4.addChild(sights_r1);
		setRotationAngle(sights_r1, -0.1309F, 0.0F, 0.0F);
		sights_r1.cubeList.add(new ModelBox(sights_r1, 173, 107, -1.0F, -0.35F, -0.5F, 2, 2, 1, -0.2F, false));

		sights_r2 = new ModelRenderer(this);
		sights_r2.setRotationPoint(-1.0F, -38.5021F, -22.5861F);
		rear4.addChild(sights_r2);
		setRotationAngle(sights_r2, 0.1309F, 0.0F, 0.0F);
		sights_r2.cubeList.add(new ModelBox(sights_r2, 173, 103, -1.0F, -0.35F, -0.5F, 2, 2, 1, -0.2F, false));

		rear5 = new ModelRenderer(this);
		rear5.setRotationPoint(0.0F, -0.9F, 23.3F);
		sights2.addChild(rear5);
		rear5.cubeList.add(new ModelBox(rear5, 185, 89, -1.0F, -38.5874F, -23.1474F, 1, 1, 1, -0.2F, false));

		sights_r3 = new ModelRenderer(this);
		sights_r3.setRotationPoint(0.8527F, -36.2677F, -22.6474F);
		rear5.addChild(sights_r3);
		setRotationAngle(sights_r3, 0.0F, 0.0F, -1.1345F);
		sights_r3.cubeList.add(new ModelBox(sights_r3, 7, 175, -1.0F, -3.5F, -0.5F, 2, 1, 1, -0.2F, false));

		sights_r4 = new ModelRenderer(this);
		sights_r4.setRotationPoint(-0.3756F, -36.8711F, -22.6474F);
		rear5.addChild(sights_r4);
		setRotationAngle(sights_r4, 0.0F, 0.0F, -0.4363F);
		sights_r4.cubeList.add(new ModelBox(sights_r4, 180, 121, 0.0F, -1.5F, -0.5F, 1, 2, 1, -0.2F, false));

		sights_r5 = new ModelRenderer(this);
		sights_r5.setRotationPoint(-1.0F, -37.9021F, -22.7088F);
		rear5.addChild(sights_r5);
		setRotationAngle(sights_r5, -0.1309F, 0.0F, 0.0F);
		sights_r5.cubeList.add(new ModelBox(sights_r5, 94, 185, 0.0F, -0.65F, -0.5F, 1, 1, 1, -0.2F, false));

		sights_r6 = new ModelRenderer(this);
		sights_r6.setRotationPoint(-1.0F, -37.9021F, -22.5861F);
		rear5.addChild(sights_r6);
		setRotationAngle(sights_r6, 0.1309F, 0.0F, 0.0F);
		sights_r6.cubeList.add(new ModelBox(sights_r6, 185, 104, 0.0F, -0.65F, -0.5F, 1, 1, 1, -0.2F, false));

		mark_r1 = new ModelRenderer(this);
		mark_r1.setRotationPoint(-1.0F, -37.9021F, -22.4611F);
		rear5.addChild(mark_r1);
		setRotationAngle(mark_r1, 0.1309F, 0.0F, 0.0F);
		mark_r1.cubeList.add(new ModelBox(mark_r1, 185, 92, 0.0F, -0.65F, -0.5F, 1, 1, 1, -0.3F, false));

		rear6 = new ModelRenderer(this);
		rear6.setRotationPoint(-1.75F, -0.9F, 23.3F);
		sights2.addChild(rear6);
		rear6.cubeList.add(new ModelBox(rear6, 185, 95, -0.25F, -38.5874F, -23.1474F, 1, 1, 1, -0.2F, false));

		sights_r7 = new ModelRenderer(this);
		sights_r7.setRotationPoint(0.75F, -37.9021F, -22.7088F);
		rear6.addChild(sights_r7);
		setRotationAngle(sights_r7, -0.1309F, 0.0F, 0.0F);
		sights_r7.cubeList.add(new ModelBox(sights_r7, 99, 185, -1.0F, -0.65F, -0.5F, 1, 1, 1, -0.2F, false));

		sights_r8 = new ModelRenderer(this);
		sights_r8.setRotationPoint(0.75F, -37.9021F, -22.5861F);
		rear6.addChild(sights_r8);
		setRotationAngle(sights_r8, 0.1309F, 0.0F, 0.0F);
		sights_r8.cubeList.add(new ModelBox(sights_r8, 185, 101, -1.0F, -0.65F, -0.5F, 1, 1, 1, -0.2F, false));

		mark_r2 = new ModelRenderer(this);
		mark_r2.setRotationPoint(0.75F, -37.9021F, -22.4611F);
		rear6.addChild(mark_r2);
		setRotationAngle(mark_r2, 0.1309F, 0.0F, 0.0F);
		mark_r2.cubeList.add(new ModelBox(mark_r2, 185, 98, -1.0F, -0.65F, -0.5F, 1, 1, 1, -0.3F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		G26razorbackslide.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}