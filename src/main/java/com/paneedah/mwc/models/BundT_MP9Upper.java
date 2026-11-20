package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class BundT_MP9Upper extends ModelBase {
	private final ModelRenderer mp9upper;
	private final ModelRenderer bone9_r1;
	private final ModelRenderer bone8_r1;
	private final ModelRenderer bone9_r2;
	private final ModelRenderer bone10_r1;
	private final ModelRenderer bone9_r3;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer irons;
	private final ModelRenderer sights;
	private final ModelRenderer ironsights_r1;
	private final ModelRenderer ironsights_r2;
	private final ModelRenderer bone23;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;

	public BundT_MP9Upper() {
		textureWidth = 240;
		textureHeight = 240;

		mp9upper = new ModelRenderer(this);
		mp9upper.setRotationPoint(0.0F, 21.0F, 0.0F);
		mp9upper.cubeList.add(new ModelBox(mp9upper, 44, 122, -3.999F, -33.9F, -21.725F, 5, 3, 16, 0.0F, false));
		mp9upper.cubeList.add(new ModelBox(mp9upper, 56, 158, 0.001F, -33.9F, -5.725F, 1, 3, 12, 0.0F, false));
		mp9upper.cubeList.add(new ModelBox(mp9upper, 86, 232, 0.501F, -31.3F, -1.225F, 1, 1, 1, 0.0F, false));
		mp9upper.cubeList.add(new ModelBox(mp9upper, 0, 71, -0.865F, -34.4F, -21.725F, 1, 1, 28, 0.0F, false));
		mp9upper.cubeList.add(new ModelBox(mp9upper, 160, 176, -2.615F, -34.4F, -5.725F, 1, 1, 9, 0.0F, false));
		mp9upper.cubeList.add(new ModelBox(mp9upper, 88, 217, -1.865F, -34.9F, 2.275F, 1, 1, 2, 0.0F, false));
		mp9upper.cubeList.add(new ModelBox(mp9upper, 228, 105, -2.165F, -34.899F, 2.275F, 1, 1, 2, 0.0F, false));
		mp9upper.cubeList.add(new ModelBox(mp9upper, 18, 215, -1.865F, -34.9F, -21.725F, 1, 1, 4, 0.0F, false));
		mp9upper.cubeList.add(new ModelBox(mp9upper, 214, 210, -2.165F, -34.899F, -21.725F, 1, 1, 4, 0.0F, false));
		mp9upper.cubeList.add(new ModelBox(mp9upper, 134, 105, -3.133F, -34.4F, -21.725F, 1, 1, 16, 0.0F, false));
		mp9upper.cubeList.add(new ModelBox(mp9upper, 48, 223, -3.133F, -34.4F, 3.275F, 1, 1, 3, 0.0F, false));
		mp9upper.cubeList.add(new ModelBox(mp9upper, 104, 64, -1.115F, -33.9F, 5.65F, 1, 1, 5, 0.0F, false));
		mp9upper.cubeList.add(new ModelBox(mp9upper, 82, 207, -2.883F, -33.9F, 5.65F, 1, 1, 5, 0.0F, false));
		mp9upper.cubeList.add(new ModelBox(mp9upper, 196, 14, -3.999F, -33.9F, 3.275F, 4, 3, 3, 0.0F, false));
		mp9upper.cubeList.add(new ModelBox(mp9upper, 166, 54, -3.999F, -33.4F, 5.65F, 5, 3, 5, -0.002F, false));
		mp9upper.cubeList.add(new ModelBox(mp9upper, 192, 157, -2.499F, -35.2827F, 4.1989F, 2, 1, 6, 0.0F, false));
		mp9upper.cubeList.add(new ModelBox(mp9upper, 180, 176, -3.998F, -31.35F, -5.725F, 1, 1, 9, 0.0F, false));
		mp9upper.cubeList.add(new ModelBox(mp9upper, 186, 113, -4.325F, -31.75F, -22.125F, 1, 1, 8, -0.3F, false));
		mp9upper.cubeList.add(new ModelBox(mp9upper, 42, 200, -4.325F, -32.5F, -22.125F, 1, 1, 6, -0.3F, false));
		mp9upper.cubeList.add(new ModelBox(mp9upper, 214, 171, -4.325F, -33.25F, -22.125F, 1, 1, 4, -0.3F, false));
		mp9upper.cubeList.add(new ModelBox(mp9upper, 228, 127, -4.325F, -34.0F, -22.025F, 1, 1, 2, -0.3F, false));
		mp9upper.cubeList.add(new ModelBox(mp9upper, 160, 186, 0.325F, -31.75F, -22.125F, 1, 1, 8, -0.3F, false));
		mp9upper.cubeList.add(new ModelBox(mp9upper, 200, 171, 0.325F, -32.5F, -22.125F, 1, 1, 6, -0.3F, false));
		mp9upper.cubeList.add(new ModelBox(mp9upper, 214, 176, 0.325F, -33.25F, -22.125F, 1, 1, 4, -0.3F, false));
		mp9upper.cubeList.add(new ModelBox(mp9upper, 134, 228, 0.325F, -34.0F, -22.025F, 1, 1, 2, -0.3F, false));
		mp9upper.cubeList.add(new ModelBox(mp9upper, 134, 233, -1.9F, -35.6429F, 4.675F, 1, 1, 1, -0.35F, false));
		mp9upper.cubeList.add(new ModelBox(mp9upper, 138, 233, -2.1F, -35.6429F, 4.675F, 1, 1, 1, -0.35F, false));
		mp9upper.cubeList.add(new ModelBox(mp9upper, 150, 233, -2.4535F, -35.9965F, 4.675F, 1, 1, 1, -0.35F, false));
		mp9upper.cubeList.add(new ModelBox(mp9upper, 154, 233, -2.4535F, -36.1964F, 4.675F, 1, 1, 1, -0.35F, false));
		mp9upper.cubeList.add(new ModelBox(mp9upper, 166, 233, -2.1F, -36.55F, 4.675F, 1, 1, 1, -0.35F, false));
		mp9upper.cubeList.add(new ModelBox(mp9upper, 170, 233, -1.9F, -36.55F, 4.675F, 1, 1, 1, -0.35F, false));
		mp9upper.cubeList.add(new ModelBox(mp9upper, 182, 233, -1.5465F, -36.1964F, 4.675F, 1, 1, 1, -0.35F, false));
		mp9upper.cubeList.add(new ModelBox(mp9upper, 186, 233, -1.5465F, -35.9965F, 4.675F, 1, 1, 1, -0.35F, false));

		bone9_r1 = new ModelRenderer(this);
		bone9_r1.setRotationPoint(-1.8455F, -35.2827F, 4.4817F);
		mp9upper.addChild(bone9_r1);
		setRotationAngle(bone9_r1, -0.7854F, 0.0F, 0.0F);
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 122, 226, -0.9285F, -1.5F, -0.5F, 1, 2, 2, -0.3F, false));
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 128, 226, 0.6215F, -1.5F, -0.5F, 1, 2, 2, -0.3F, false));

		bone8_r1 = new ModelRenderer(this);
		bone8_r1.setRotationPoint(-1.2146F, -35.9525F, 5.175F);
		mp9upper.addChild(bone8_r1);
		setRotationAngle(bone8_r1, 0.0F, 0.0F, 0.7854F);
		bone8_r1.cubeList.add(new ModelBox(bone8_r1, 178, 233, -0.35F, -0.5F, -0.5F, 1, 1, 1, -0.35F, false));
		bone8_r1.cubeList.add(new ModelBox(bone8_r1, 174, 233, -0.55F, -0.5F, -0.5F, 1, 1, 1, -0.35F, false));

		bone9_r2 = new ModelRenderer(this);
		bone9_r2.setRotationPoint(-0.159F, -34.5383F, 5.175F);
		mp9upper.addChild(bone9_r2);
		setRotationAngle(bone9_r2, 0.0F, 0.0F, 0.7854F);
		bone9_r2.cubeList.add(new ModelBox(bone9_r2, 162, 233, -2.65F, -0.2F, -0.5F, 1, 1, 1, -0.35F, false));
		bone9_r2.cubeList.add(new ModelBox(bone9_r2, 158, 233, -2.65F, -0.4F, -0.5F, 1, 1, 1, -0.35F, false));

		bone10_r1 = new ModelRenderer(this);
		bone10_r1.setRotationPoint(0.4824F, -33.8969F, 5.175F);
		mp9upper.addChild(bone10_r1);
		setRotationAngle(bone10_r1, 0.0F, 0.0F, 0.7854F);
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 146, 233, -2.65F, -0.4F, -0.5F, 1, 1, 1, -0.35F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 142, 233, -2.65F, -0.2F, -0.5F, 1, 1, 1, -0.35F, false));

		bone9_r3 = new ModelRenderer(this);
		bone9_r3.setRotationPoint(-1.8561F, -35.3111F, 5.175F);
		mp9upper.addChild(bone9_r3);
		setRotationAngle(bone9_r3, 0.0F, 0.0F, 0.7854F);
		bone9_r3.cubeList.add(new ModelBox(bone9_r3, 90, 233, -0.55F, -0.5F, -0.5F, 1, 1, 1, -0.35F, false));
		bone9_r3.cubeList.add(new ModelBox(bone9_r3, 40, 233, -0.35F, -0.5F, -0.5F, 1, 1, 1, -0.35F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.548F, -34.217F, 1.775F);
		mp9upper.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -1.0472F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 58, 71, -0.5F, 0.5F, -23.5F, 1, 1, 28, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-1.499F, -34.9291F, 4.5524F);
		mp9upper.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.7854F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 226, 3, -1.0F, -0.5F, -2.0F, 2, 1, 2, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.599F, -32.6F, 10.35F);
		mp9upper.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.48F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 96, 232, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.002F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-2.0811F, -33.9947F, 8.15F);
		mp9upper.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 146, 207, -1.634F, -0.5F, -2.5F, 1, 1, 5, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-0.9169F, -32.391F, 8.15F);
		mp9upper.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.7854F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 104, 207, 0.634F, -0.5F, -2.5F, 1, 1, 5, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-2.45F, -34.217F, 12.775F);
		mp9upper.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 1.0472F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 222, 215, -0.5F, 0.5F, -9.5F, 1, 1, 3, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 44, 141, -0.5F, 0.5F, -34.5F, 1, 1, 16, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-2.7675F, -32.7366F, -1.2375F);
		mp9upper.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.3927F, 0.0F, -1.0908F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 226, 0, -0.748F, 0.8665F, 2.6583F, 2, 1, 2, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-2.8675F, -32.7366F, -1.2375F);
		mp9upper.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -1.0908F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 220, 76, -1.752F, -0.3625F, 2.5125F, 3, 1, 2, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 220, 73, -1.752F, -0.3625F, -4.4875F, 3, 1, 2, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-2.7675F, -32.7366F, -1.2375F);
		mp9upper.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.3927F, 0.0F, -1.0908F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 226, 6, -0.748F, 0.8665F, -4.6583F, 2, 1, 2, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-1.499F, -29.4527F, 13.092F);
		mp9upper.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.3927F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 208, 51, -2.501F, -1.5F, -8.0F, 5, 1, 2, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-1.499F, -29.5559F, -10.7479F);
		mp9upper.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.1309F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 82, 213, -2.501F, -2.85F, -11.5F, 5, 3, 1, 0.0F, false));

		irons = new ModelRenderer(this);
		irons.setRotationPoint(0.0F, -33.7F, -36.9F);
		mp9upper.addChild(irons);
		

		sights = new ModelRenderer(this);
		sights.setRotationPoint(0.0F, 0.0F, 0.0F);
		irons.addChild(sights);
		sights.cubeList.add(new ModelBox(sights, 230, 215, -2.0F, -2.35F, 16.125F, 1, 2, 1, -0.4F, false));

		ironsights_r1 = new ModelRenderer(this);
		ironsights_r1.setRotationPoint(-1.5F, -1.35F, 17.5F);
		sights.addChild(ironsights_r1);
		setRotationAngle(ironsights_r1, -0.3054F, 0.0F, 0.0F);
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 104, 226, -0.5F, -0.375F, -1.275F, 1, 2, 2, -0.425F, false));

		ironsights_r2 = new ModelRenderer(this);
		ironsights_r2.setRotationPoint(-1.5F, -1.35F, 16.5F);
		sights.addChild(ironsights_r2);
		setRotationAngle(ironsights_r2, 0.3054F, 0.0F, 0.0F);
		ironsights_r2.cubeList.add(new ModelBox(ironsights_r2, 98, 226, -0.5F, -0.6F, -1.475F, 1, 2, 2, -0.425F, false));

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(-1.5217F, -34.9739F, -11.7435F);
		mp9upper.addChild(bone23);
		bone23.cubeList.add(new ModelBox(bone23, 38, 229, -0.9783F, -0.5261F, -6.7565F, 2, 1, 1, -0.199F, false));
		bone23.cubeList.add(new ModelBox(bone23, 152, 229, -0.9783F, -0.5261F, -2.9065F, 2, 1, 1, -0.199F, false));
		bone23.cubeList.add(new ModelBox(bone23, 230, 9, -0.9783F, -0.5261F, -1.6565F, 2, 1, 1, -0.199F, false));
		bone23.cubeList.add(new ModelBox(bone23, 230, 11, -0.9783F, -0.5261F, -0.4065F, 2, 1, 1, -0.199F, false));
		bone23.cubeList.add(new ModelBox(bone23, 230, 13, -0.9783F, -0.5261F, 0.8435F, 2, 1, 1, -0.199F, false));
		bone23.cubeList.add(new ModelBox(bone23, 230, 39, -0.9783F, -0.5261F, -6.6565F, 2, 1, 1, -0.199F, false));
		bone23.cubeList.add(new ModelBox(bone23, 230, 37, -0.9783F, -0.5261F, -5.4065F, 2, 1, 1, -0.199F, false));
		bone23.cubeList.add(new ModelBox(bone23, 230, 35, -0.9783F, -0.5261F, -4.1565F, 2, 1, 1, -0.199F, false));
		bone23.cubeList.add(new ModelBox(bone23, 230, 15, -0.9783F, -0.5261F, 2.0935F, 2, 1, 1, -0.199F, false));
		bone23.cubeList.add(new ModelBox(bone23, 230, 17, -0.9783F, -0.5261F, 3.3435F, 2, 1, 1, -0.199F, false));
		bone23.cubeList.add(new ModelBox(bone23, 230, 19, -0.9783F, -0.5261F, 4.5935F, 2, 1, 1, -0.199F, false));
		bone23.cubeList.add(new ModelBox(bone23, 230, 21, -0.9783F, -0.5261F, 5.8435F, 2, 1, 1, -0.199F, false));
		bone23.cubeList.add(new ModelBox(bone23, 228, 108, -0.9783F, -0.5261F, 7.0935F, 2, 1, 1, -0.199F, false));
		bone23.cubeList.add(new ModelBox(bone23, 230, 23, -0.9783F, -0.5261F, 8.3435F, 2, 1, 1, -0.199F, false));
		bone23.cubeList.add(new ModelBox(bone23, 230, 25, -0.9783F, -0.5261F, 9.5935F, 2, 1, 1, -0.199F, false));
		bone23.cubeList.add(new ModelBox(bone23, 230, 27, -0.9783F, -0.5261F, 10.8435F, 2, 1, 1, -0.199F, false));
		bone23.cubeList.add(new ModelBox(bone23, 230, 29, -0.9783F, -0.5261F, 12.0935F, 2, 1, 1, -0.199F, false));
		bone23.cubeList.add(new ModelBox(bone23, 230, 31, -0.9783F, -0.5261F, 13.3435F, 2, 1, 1, -0.198F, false));
		bone23.cubeList.add(new ModelBox(bone23, 230, 33, -0.9783F, -0.5261F, 13.6435F, 2, 1, 1, -0.199F, false));
		bone23.cubeList.add(new ModelBox(bone23, 46, 100, -1.0783F, 0.0739F, -6.5565F, 1, 1, 21, 0.0F, false));
		bone23.cubeList.add(new ModelBox(bone23, 0, 100, -0.8783F, 0.0739F, -6.5565F, 2, 1, 21, -0.001F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-0.7783F, -0.3261F, -40.5565F);
		bone23.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, 0.8901F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 90, 100, -0.25F, -0.05F, 33.8F, 1, 1, 21, -0.35F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 100, 232, -0.2F, -0.2F, 54.2F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 108, 232, -0.2F, -0.2F, 53.9F, 1, 1, 1, -0.197F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 68, 192, -0.2F, -0.2F, 47.65F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 118, 232, -0.2F, -0.2F, 46.4F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 232, 120, -0.2F, -0.2F, 45.15F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 122, 232, -0.2F, -0.2F, 43.9F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 232, 122, -0.2F, -0.2F, 52.65F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 126, 232, -0.2F, -0.2F, 51.4F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 232, 130, -0.2F, -0.2F, 50.15F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 232, 132, -0.2F, -0.2F, 48.9F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 232, 134, -0.2F, -0.2F, 42.65F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 232, 136, -0.2F, -0.2F, 41.4F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 232, 138, -0.2F, -0.2F, 40.15F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 232, 140, -0.2F, -0.2F, 38.9F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 232, 174, -0.2F, -0.2F, 37.65F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 36, 233, -0.2F, -0.2F, 33.9F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 32, 233, -0.2F, -0.2F, 35.15F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 28, 233, -0.2F, -0.2F, 36.4F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 232, 176, -0.2F, -0.2F, 33.8F, 1, 1, 1, -0.198F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(0.8217F, -0.3261F, -40.5565F);
		bone23.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, -0.8901F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 116, 64, -0.75F, -0.05F, 33.8F, 1, 1, 21, -0.35F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 232, 178, -0.8F, -0.2F, 54.2F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 202, 232, -0.8F, -0.2F, 53.9F, 1, 1, 1, -0.197F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 104, 192, -0.8F, -0.2F, 47.65F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 206, 232, -0.8F, -0.2F, 46.4F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 232, 208, -0.8F, -0.2F, 45.15F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 210, 232, -0.8F, -0.2F, 43.9F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 232, 210, -0.8F, -0.2F, 52.65F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 232, 212, -0.8F, -0.2F, 51.4F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 232, 218, -0.8F, -0.2F, 50.15F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 232, 220, -0.8F, -0.2F, 48.9F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 232, 222, -0.8F, -0.2F, 42.65F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 232, 224, -0.8F, -0.2F, 41.4F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 232, 229, -0.8F, -0.2F, 40.15F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 232, 231, -0.8F, -0.2F, 38.9F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 8, 233, -0.8F, -0.2F, 37.65F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 24, 233, -0.8F, -0.2F, 36.4F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 20, 233, -0.8F, -0.2F, 35.15F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 16, 233, -0.8F, -0.2F, 33.9F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 12, 233, -0.8F, -0.2F, 33.8F, 1, 1, 1, -0.198F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		mp9upper.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}