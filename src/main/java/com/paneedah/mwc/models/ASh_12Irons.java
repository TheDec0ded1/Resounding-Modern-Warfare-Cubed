package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ASh_12Irons extends ModelBase {
	private final ModelRenderer irons;
	private final ModelRenderer ironsights;
	private final ModelRenderer cube_r42;
	private final ModelRenderer cube_r43;
	private final ModelRenderer cube_r44;
	private final ModelRenderer cube_r45;
	private final ModelRenderer ironsights2;
	private final ModelRenderer ironsights_r1;
	private final ModelRenderer ironsights_r2;
	private final ModelRenderer ironsights_r3;
	private final ModelRenderer ironsights_r4;
	private final ModelRenderer rails2;
	private final ModelRenderer cube_r82;
	private final ModelRenderer cube_r46;

	public ASh_12Irons() {
		textureWidth = 512;
		textureHeight = 512;

		irons = new ModelRenderer(this);
		irons.setRotationPoint(0.0F, 23.0F, 0.0F);
		irons.cubeList.add(new ModelBox(irons, 42, 0, -3.0F, -46.0F, 4.0F, 3, 5, 4, 0.0F, false));
		irons.cubeList.add(new ModelBox(irons, 28, 29, -3.0F, -47.0F, -14.0F, 3, 6, 2, 0.0F, false));
		irons.cubeList.add(new ModelBox(irons, 102, 36, -3.0F, -43.0F, -36.7F, 3, 2, 2, 0.0F, false));
		irons.cubeList.add(new ModelBox(irons, 49, 15, -2.5F, -47.0F, -36.7F, 2, 4, 2, 0.0F, false));
		irons.cubeList.add(new ModelBox(irons, 120, 0, -3.3F, -46.5F, -12.3F, 2, 1, 20, -0.3F, false));
		irons.cubeList.add(new ModelBox(irons, 273, 0, -2.7F, -46.5F, -12.3F, 3, 1, 20, -0.3F, false));
		irons.cubeList.add(new ModelBox(irons, 120, 137, -3.3F, -46.9F, -12.3F, 1, 1, 1, -0.3F, false));
		irons.cubeList.add(new ModelBox(irons, 136, 137, -0.7F, -46.9F, -12.3F, 1, 1, 1, -0.3F, false));
		irons.cubeList.add(new ModelBox(irons, 95, 137, -3.3F, -46.9F, -10.15F, 1, 1, 1, -0.3F, false));
		irons.cubeList.add(new ModelBox(irons, 99, 137, -0.7F, -46.9F, -10.15F, 1, 1, 1, -0.3F, false));
		irons.cubeList.add(new ModelBox(irons, 87, 137, -3.3F, -46.9F, -8.0F, 1, 1, 1, -0.3F, false));
		irons.cubeList.add(new ModelBox(irons, 91, 137, -0.7F, -46.9F, -8.0F, 1, 1, 1, -0.3F, false));
		irons.cubeList.add(new ModelBox(irons, 74, 62, -3.3F, -46.9F, -3.3F, 1, 1, 4, -0.3F, false));
		irons.cubeList.add(new ModelBox(irons, 13, 87, -0.7F, -46.9F, -3.3F, 1, 1, 4, -0.3F, false));
		irons.cubeList.add(new ModelBox(irons, 74, 88, -3.3F, -46.9F, -6.05F, 1, 1, 4, -0.3F, false));
		irons.cubeList.add(new ModelBox(irons, 96, 78, -0.7F, -46.9F, -6.05F, 1, 1, 4, -0.3F, false));
		irons.cubeList.add(new ModelBox(irons, 85, 0, -1.7F, -47.3F, -12.3F, 2, 1, 13, -0.3F, false));
		irons.cubeList.add(new ModelBox(irons, 26, 87, -3.3F, -47.3F, -12.3F, 2, 1, 13, -0.3F, false));

		ironsights = new ModelRenderer(this);
		ironsights.setRotationPoint(0.0F, -45.7F, -34.0F);
		irons.addChild(ironsights);
		ironsights.cubeList.add(new ModelBox(ironsights, 120, 62, -2.9F, -1.1F, 35.6F, 1, 1, 6, -0.301F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 120, 53, -1.1F, -1.1F, 35.6F, 1, 1, 6, -0.301F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 33, 87, -2.9F, -1.96F, 33.52F, 1, 2, 2, -0.301F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 26, 15, -2.5F, -1.76F, 33.92F, 2, 1, 8, -0.301F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 96, 83, -3.0F, -1.56F, 41.22F, 3, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 44, 83, -3.0F, -1.76F, 41.22F, 3, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 132, 98, -2.5F, -3.158F, 41.22F, 2, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 0, 55, -3.0F, -2.958F, 41.22F, 3, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 72, 7, -3.0F, -1.96F, 41.22F, 3, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 93, 144, -1.0F, -2.16F, 41.22F, 1, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 144, 92, -1.2F, -2.16F, 41.22F, 1, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 144, 90, -1.4F, -2.16F, 41.22F, 1, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 144, 88, -1.6F, -2.16F, 41.22F, 1, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 144, 86, -1.593F, -2.359F, 41.221F, 1, 1, 1, -0.401F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 84, 144, -1.395F, -2.359F, 41.221F, 1, 1, 1, -0.401F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 80, 144, -1.197F, -2.359F, 41.221F, 1, 1, 1, -0.401F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 144, 78, -0.999F, -2.359F, 41.221F, 1, 1, 1, -0.401F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 71, 144, -2.405F, -2.359F, 41.221F, 1, 1, 1, -0.401F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 67, 144, -2.603F, -2.359F, 41.221F, 1, 1, 1, -0.401F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 63, 144, -2.801F, -2.359F, 41.221F, 1, 1, 1, -0.401F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 59, 144, -2.999F, -2.359F, 41.221F, 1, 1, 1, -0.401F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 144, 54, -2.4F, -2.16F, 41.22F, 1, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 144, 52, -2.8F, -2.16F, 41.22F, 1, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 144, 50, -3.0F, -2.16F, 41.22F, 1, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 49, 144, -2.6F, -2.16F, 41.22F, 1, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 8, 55, -3.0F, -2.758F, 41.22F, 3, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 32, 136, -1.0F, -2.558F, 41.22F, 1, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 40, 136, -1.2F, -2.558F, 41.22F, 1, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 59, 137, -1.4F, -2.558F, 41.22F, 1, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 63, 137, -1.6F, -2.558F, 41.22F, 1, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 67, 137, -2.4F, -2.558F, 41.22F, 1, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 71, 137, -2.8F, -2.558F, 41.22F, 1, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 79, 137, -3.0F, -2.558F, 41.22F, 1, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 83, 137, -2.6F, -2.558F, 41.22F, 1, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 78, 78, -1.1F, -1.96F, 33.52F, 1, 2, 2, -0.301F, false));

		cube_r42 = new ModelRenderer(this);
		cube_r42.setRotationPoint(-0.4F, -1.66F, 35.22F);
		ironsights.addChild(cube_r42);
		setRotationAngle(cube_r42, -0.5236F, 0.0F, 0.0F);
		cube_r42.cubeList.add(new ModelBox(cube_r42, 64, 129, -0.7F, -0.3F, -0.3F, 1, 1, 3, -0.302F, false));
		cube_r42.cubeList.add(new ModelBox(cube_r42, 107, 128, -2.5F, -0.3F, -0.3F, 1, 1, 3, -0.302F, false));
		cube_r42.cubeList.add(new ModelBox(cube_r42, 5, 29, -2.5F, 0.1F, -0.3F, 1, 1, 2, -0.302F, false));
		cube_r42.cubeList.add(new ModelBox(cube_r42, 18, 29, -0.7F, 0.1F, -0.3F, 1, 1, 2, -0.302F, false));
		cube_r42.cubeList.add(new ModelBox(cube_r42, 5, 0, -2.5F, 0.3F, -0.3F, 1, 1, 2, -0.302F, false));
		cube_r42.cubeList.add(new ModelBox(cube_r42, 18, 0, -0.7F, 0.3F, -0.3F, 1, 1, 2, -0.302F, false));

		cube_r43 = new ModelRenderer(this);
		cube_r43.setRotationPoint(-2.7F, -1.36F, 36.72F);
		ironsights.addChild(cube_r43);
		setRotationAngle(cube_r43, 0.3665F, 0.0F, 0.0F);
		cube_r43.cubeList.add(new ModelBox(cube_r43, 144, 48, -0.4F, -0.3F, -0.3F, 1, 1, 1, -0.15F, false));
		cube_r43.cubeList.add(new ModelBox(cube_r43, 144, 46, -0.1F, -0.3F, -0.3F, 1, 1, 1, -0.151F, false));
		cube_r43.cubeList.add(new ModelBox(cube_r43, 144, 38, 1.5F, -0.3F, -0.3F, 1, 1, 1, -0.151F, false));
		cube_r43.cubeList.add(new ModelBox(cube_r43, 144, 28, 1.8F, -0.3F, -0.3F, 1, 1, 1, -0.15F, false));

		cube_r44 = new ModelRenderer(this);
		cube_r44.setRotationPoint(-0.4F, -1.16F, 33.92F);
		ironsights.addChild(cube_r44);
		setRotationAngle(cube_r44, 0.3665F, 0.0F, 0.0F);
		cube_r44.cubeList.add(new ModelBox(cube_r44, 13, 68, -2.6F, -0.3F, -0.3F, 3, 1, 1, -0.1F, false));

		cube_r45 = new ModelRenderer(this);
		cube_r45.setRotationPoint(-0.8F, -0.6F, 32.9F);
		ironsights.addChild(cube_r45);
		setRotationAngle(cube_r45, -0.7156F, 0.0F, 0.0F);
		

		ironsights2 = new ModelRenderer(this);
		ironsights2.setRotationPoint(0.0F, 12.5F, 10.5F);
		ironsights.addChild(ironsights2);
		ironsights2.cubeList.add(new ModelBox(ironsights2, 78, 29, -2.0F, -15.1F, -12.7F, 1, 2, 1, -0.4F, false));

		ironsights_r1 = new ModelRenderer(this);
		ironsights_r1.setRotationPoint(-0.2232F, -1.5062F, -11.9F);
		ironsights2.addChild(ironsights_r1);
		setRotationAngle(ironsights_r1, 0.0F, 0.0F, 0.5236F);
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 34, 61, -7.0F, -12.0583F, -1.0F, 1, 2, 2, -0.3F, false));
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 26, 61, -7.0F, -12.0583F, -1.6F, 1, 2, 2, -0.3F, false));

		ironsights_r2 = new ModelRenderer(this);
		ironsights_r2.setRotationPoint(-0.4232F, -2.5187F, -11.9F);
		ironsights2.addChild(ironsights_r2);
		setRotationAngle(ironsights_r2, 0.0F, 0.0F, -0.5236F);
		ironsights_r2.cubeList.add(new ModelBox(ironsights_r2, 59, 45, 6.0F, -12.0583F, -1.0F, 1, 2, 2, -0.3F, false));
		ironsights_r2.cubeList.add(new ModelBox(ironsights_r2, 50, 9, 6.0F, -12.0583F, -1.6F, 1, 2, 2, -0.3F, false));

		ironsights_r3 = new ModelRenderer(this);
		ironsights_r3.setRotationPoint(-2.5768F, -2.5187F, -11.9F);
		ironsights2.addChild(ironsights_r3);
		setRotationAngle(ironsights_r3, 0.0F, 0.0F, 0.5236F);
		ironsights_r3.cubeList.add(new ModelBox(ironsights_r3, 0, 77, -7.0F, -12.0583F, -1.0F, 1, 2, 2, -0.3F, false));
		ironsights_r3.cubeList.add(new ModelBox(ironsights_r3, 36, 76, -7.0F, -12.0583F, -1.6F, 1, 2, 2, -0.3F, false));

		ironsights_r4 = new ModelRenderer(this);
		ironsights_r4.setRotationPoint(-2.7768F, -1.5062F, -11.9F);
		ironsights2.addChild(ironsights_r4);
		setRotationAngle(ironsights_r4, 0.0F, 0.0F, -0.5236F);
		ironsights_r4.cubeList.add(new ModelBox(ironsights_r4, 50, 61, 6.0F, -12.0583F, -1.0F, 1, 2, 2, -0.3F, false));
		ironsights_r4.cubeList.add(new ModelBox(ironsights_r4, 42, 61, 6.0F, -12.0583F, -1.6F, 1, 2, 2, -0.3F, false));

		rails2 = new ModelRenderer(this);
		rails2.setRotationPoint(-2.3F, -8.3F, -39.85F);
		irons.addChild(rails2);
		rails2.cubeList.add(new ModelBox(rails2, 39, 145, 0.8F, -39.575F, 35.55F, 1, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 136, 16, 0.8F, -39.575F, 36.75F, 1, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 136, 14, -0.2F, -39.5736F, 36.749F, 1, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 102, 117, -0.2F, -39.5736F, 37.949F, 1, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 5, 120, 0.8F, -39.575F, 37.95F, 1, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 144, 128, -0.2F, -39.5736F, 39.149F, 1, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 115, 145, 0.8F, -39.575F, 39.15F, 1, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 30, 145, -0.2F, -39.5736F, 35.549F, 1, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 14, 136, 0.8F, -39.575F, 30.75F, 1, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 6, 136, 0.8F, -39.575F, 31.95F, 1, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 121, 135, 0.8F, -39.575F, 33.15F, 1, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 52, 135, 0.8F, -39.575F, 34.35F, 1, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 135, 38, -0.2F, -39.5736F, 30.749F, 1, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 134, 102, -0.2F, -39.5736F, 31.949F, 1, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 134, 66, -0.2F, -39.5736F, 33.149F, 1, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 134, 25, -0.2F, -39.5736F, 34.349F, 1, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 65, 133, 0.8F, -39.575F, 25.95F, 1, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 133, 62, 0.8F, -39.575F, 27.15F, 1, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 132, 118, 0.8F, -39.575F, 28.35F, 1, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 73, 132, 0.8F, -39.575F, 29.55F, 1, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 53, 128, -0.2F, -39.5736F, 25.949F, 1, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 122, 127, -0.2F, -39.5736F, 27.149F, 1, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 99, 127, -0.2F, -39.5736F, 28.349F, 1, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 127, 77, -0.2F, -39.5736F, 29.549F, 1, 1, 1, -0.2F, false));
		rails2.cubeList.add(new ModelBox(rails2, 26, 61, -0.5F, -39.3F, 25.95F, 1, 1, 14, -0.3F, false));
		rails2.cubeList.add(new ModelBox(rails2, 26, 0, -0.2F, -39.3F, 25.95F, 1, 1, 14, -0.3F, false));
		rails2.cubeList.add(new ModelBox(rails2, 120, 46, 0.1F, -39.3F, 25.95F, 2, 1, 14, -0.301F, false));

		cube_r82 = new ModelRenderer(this);
		cube_r82.setRotationPoint(0.0F, -1.0F, 0.0F);
		rails2.addChild(cube_r82);
		setRotationAngle(cube_r82, 0.0F, 0.0F, -0.7854F);
		cube_r82.cubeList.add(new ModelBox(cube_r82, 26, 145, 26.3353F, -27.3352F, 35.55F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 20, 127, 26.3353F, -27.3352F, 36.75F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 144, 144, 26.3353F, -27.3352F, 37.95F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 119, 145, 26.3353F, -27.3352F, 39.15F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 73, 126, 26.3353F, -27.3352F, 30.75F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 53, 126, 26.3353F, -27.3352F, 31.95F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 122, 125, 26.3353F, -27.3352F, 33.15F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 84, 125, 26.3353F, -27.3352F, 34.35F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 5, 125, 26.3353F, -27.3352F, 25.95F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 125, 0, 26.3353F, -27.3352F, 27.15F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 73, 124, 26.3353F, -27.3352F, 28.35F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 53, 124, 26.3353F, -27.3352F, 29.55F, 1, 1, 1, -0.201F, false));

		cube_r46 = new ModelRenderer(this);
		cube_r46.setRotationPoint(1.6F, -1.0F, 3.25F);
		rails2.addChild(cube_r46);
		setRotationAngle(cube_r46, 0.0F, 0.0F, -0.7854F);
		cube_r46.cubeList.add(new ModelBox(cube_r46, 17, 145, 26.3353F, -27.3352F, 32.3F, 1, 1, 1, -0.201F, false));
		cube_r46.cubeList.add(new ModelBox(cube_r46, 31, 124, 26.3353F, -27.3352F, 33.5F, 1, 1, 1, -0.201F, false));
		cube_r46.cubeList.add(new ModelBox(cube_r46, 144, 142, 26.3353F, -27.3352F, 34.7F, 1, 1, 1, -0.201F, false));
		cube_r46.cubeList.add(new ModelBox(cube_r46, 111, 145, 26.3353F, -27.3352F, 35.9F, 1, 1, 1, -0.201F, false));
		cube_r46.cubeList.add(new ModelBox(cube_r46, 19, 124, 26.3353F, -27.3352F, 27.5F, 1, 1, 1, -0.201F, false));
		cube_r46.cubeList.add(new ModelBox(cube_r46, 59, 123, 26.3353F, -27.3352F, 28.7F, 1, 1, 1, -0.201F, false));
		cube_r46.cubeList.add(new ModelBox(cube_r46, 59, 121, 26.3353F, -27.3352F, 29.9F, 1, 1, 1, -0.201F, false));
		cube_r46.cubeList.add(new ModelBox(cube_r46, 120, 94, 26.3353F, -27.3352F, 31.1F, 1, 1, 1, -0.201F, false));
		cube_r46.cubeList.add(new ModelBox(cube_r46, 120, 92, 26.3353F, -27.3352F, 22.7F, 1, 1, 1, -0.201F, false));
		cube_r46.cubeList.add(new ModelBox(cube_r46, 120, 87, 26.3353F, -27.3352F, 23.9F, 1, 1, 1, -0.201F, false));
		cube_r46.cubeList.add(new ModelBox(cube_r46, 120, 85, 26.3353F, -27.3352F, 25.1F, 1, 1, 1, -0.201F, false));
		cube_r46.cubeList.add(new ModelBox(cube_r46, 20, 120, 26.3353F, -27.3352F, 26.3F, 1, 1, 1, -0.201F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		irons.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}