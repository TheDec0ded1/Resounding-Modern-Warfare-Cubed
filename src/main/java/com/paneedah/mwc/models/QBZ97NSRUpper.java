package com.paneedah.mwc.models;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBZ97NSRUpper extends ModelBase {
	private final ModelRenderer upper;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r50;
	private final ModelRenderer cube_r51;

	public QBZ97NSRUpper() {
		textureWidth = 432;
		textureHeight = 432;

		upper = new ModelRenderer(this);
		upper.setRotationPoint(0.0F, 24.0F, 0.0F);
		upper.cubeList.add(new ModelBox(upper, 339, 76, -0.7392F, -39.3F, -14.0F, 1, 3, 25, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 339, 105, -3.2858F, -39.3F, -14.0F, 1, 3, 25, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 189, 328, -0.7392F, -42.3F, 8.0F, 1, 3, 4, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 192, 402, -3.2858F, -42.3F, 8.0F, 3, 3, 4, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 331, 342, -3.2858F, -38.0F, -35.0F, 1, 1, 22, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 341, 0, -0.7392F, -38.0F, -35.0F, 1, 1, 22, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 377, 412, -0.7392F, -39.0F, -35.0F, 1, 1, 2, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 218, 412, -3.2858F, -39.0F, -35.0F, 1, 1, 2, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 420, 67, -0.7392F, -39.0F, -29.0F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 420, 64, -3.2858F, -39.0F, -29.0F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 420, 73, -0.7392F, -39.0F, -24.0F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 420, 70, -3.2858F, -39.0F, -24.0F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 79, 420, -0.7392F, -39.0F, -19.0F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 420, 76, -3.2858F, -39.0F, -19.0F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 236, 343, -3.5858F, -39.6F, -35.3F, 1, 1, 22, -0.3F, false));
		upper.cubeList.add(new ModelBox(upper, 189, 343, -0.4392F, -39.6F, -35.3F, 1, 1, 22, -0.3F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-7.2933F, -29.4359F, -28.5F);
		upper.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.48F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 420, 98, -1.0F, -12.0F, -3.5F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 94, 420, -1.0F, -12.0F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 420, 89, -1.0F, -12.0F, 3.5F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 84, 420, -1.0F, -12.0F, 7.5F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 384, 412, -1.0F, -12.0F, -6.5F, 1, 1, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 420, 82, -1.0F, -12.0F, 11.0F, 1, 1, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.1126F, -37.419F, -46.5F);
		upper.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.48F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 99, 420, 0.0F, -3.0F, 14.5F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 420, 95, 0.0F, -3.0F, 17.5F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 420, 92, 0.0F, -3.0F, 21.5F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 89, 420, 0.0F, -3.0F, 25.5F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 391, 412, 0.0F, -3.0F, 11.5F, 1, 1, 2, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 420, 79, 0.0F, -3.0F, 29.0F, 1, 1, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-4.0039F, -36.4044F, -17.2F);
		upper.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.48F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 246, 141, -1.0F, -5.0F, -18.1F, 1, 1, 45, -0.3F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-3.1441F, -38.0563F, -37.1686F);
		upper.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.829F, 0.0F, 0.48F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 293, 405, -1.0F, -4.0F, -2.0F, 1, 2, 3, -0.3F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.1191F, -38.0563F, -37.1686F);
		upper.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.829F, 0.0F, -0.48F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 172, 409, 0.0F, -4.0F, -2.0F, 1, 2, 3, -0.3F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-3.7269F, -36.9367F, -14.3F);
		upper.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.48F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 286, 346, -1.0F, -3.0F, -21.0F, 1, 1, 19, -0.3F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.7019F, -36.9367F, -14.3F);
		upper.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.48F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 246, 94, 0.0F, -4.4F, -21.0F, 1, 1, 45, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 129, 351, 0.0F, -3.0F, -21.0F, 1, 1, 19, -0.3F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-0.7F, -42.0F, -41.45F);
		upper.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 413, 201, -1.8F, -0.2F, 7.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 241, 413, -1.8F, -0.2F, 5.85F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 248, 413, -1.8F, -0.2F, 8.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 413, 252, -1.8F, -0.2F, 9.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 255, 413, -1.8F, -0.2F, 10.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 413, 255, -1.8F, -0.2F, 12.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 413, 258, -1.8F, -0.2F, 13.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 413, 261, -1.8F, -0.2F, 14.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 262, 413, -1.8F, -0.2F, 15.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 413, 264, -1.8F, -0.2F, 17.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 413, 267, -1.8F, -0.2F, 18.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 413, 270, -1.8F, -0.2F, 19.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 413, 273, -1.8F, -0.2F, 20.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 413, 276, -1.8F, -0.2F, 22.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 413, 279, -1.8F, -0.2F, 23.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 413, 62, -1.8F, -0.2F, 24.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 413, 306, -1.8F, -0.2F, 25.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 413, 309, -1.8F, -0.2F, 27.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 413, 312, -1.8F, -0.2F, 28.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 413, 315, -1.8F, -0.2F, 29.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 413, 318, -1.8F, -0.2F, 30.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 413, 321, -1.8F, -0.2F, 32.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 413, 80, -1.8F, -0.2F, 33.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 413, 324, -1.8F, -0.2F, 34.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 413, 327, -1.8F, -0.2F, 35.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 366, 414, -1.8F, -0.2F, 37.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 413, 330, -1.8F, -0.2F, 38.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 413, 97, -1.8F, -0.2F, 39.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 413, 333, -1.8F, -0.2F, 40.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 345, 414, -1.8F, -0.2F, 42.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 181, 414, -1.8F, -0.2F, 43.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 413, 77, -1.8F, -0.2F, 44.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 338, 414, -1.8F, -0.2F, 45.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 63, 411, -1.8F, -0.2F, 47.05F, 2, 1, 2, -0.198F, false));
		bone3.cubeList.add(new ModelBox(bone3, 384, 306, -1.8F, -0.2F, 47.95F, 2, 1, 2, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 246, 0, -1.7F, 0.4F, 4.75F, 2, 1, 45, -0.001F, false));
		bone3.cubeList.add(new ModelBox(bone3, 246, 47, -1.9F, 0.4F, 4.75F, 1, 1, 45, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 72, 411, -1.8F, -0.2F, 4.55F, 2, 1, 2, -0.199F, false));

		cube_r50 = new ModelRenderer(this);
		cube_r50.setRotationPoint(-1.6F, 0.0F, -1.25F);
		bone3.addChild(cube_r50);
		setRotationAngle(cube_r50, 0.0F, 0.0F, 0.8901F);
		cube_r50.cubeList.add(new ModelBox(cube_r50, 398, 412, -0.2F, -0.2F, 5.8F, 1, 1, 2, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 246, 188, -0.25F, -0.05F, 7.2F, 1, 1, 42, -0.35F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 310, 411, -0.2F, -0.2F, 49.2F, 1, 1, 2, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 21, 413, -0.2F, -0.2F, 48.3F, 1, 1, 2, -0.197F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 420, 101, -0.2F, -0.2F, 47.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 416, 339, -0.2F, -0.2F, 45.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 104, 420, -0.2F, -0.2F, 44.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 420, 272, -0.2F, -0.2F, 43.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 420, 104, -0.2F, -0.2F, 42.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 131, 417, -0.2F, -0.2F, 40.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 420, 107, -0.2F, -0.2F, 39.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 420, 281, -0.2F, -0.2F, 38.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 109, 420, -0.2F, -0.2F, 37.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 420, 110, -0.2F, -0.2F, 35.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 30, 417, -0.2F, -0.2F, 34.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 420, 113, -0.2F, -0.2F, 33.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 420, 116, -0.2F, -0.2F, 32.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 420, 119, -0.2F, -0.2F, 30.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 420, 122, -0.2F, -0.2F, 29.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 125, 420, -0.2F, -0.2F, 28.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 420, 125, -0.2F, -0.2F, 27.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 304, 416, -0.2F, -0.2F, 25.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 130, 420, -0.2F, -0.2F, 24.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 135, 420, -0.2F, -0.2F, 23.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 140, 420, -0.2F, -0.2F, 22.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 145, 420, -0.2F, -0.2F, 20.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 150, 420, -0.2F, -0.2F, 19.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 155, 420, -0.2F, -0.2F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 160, 420, -0.2F, -0.2F, 17.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 175, 420, -0.2F, -0.2F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 180, 420, -0.2F, -0.2F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 420, 183, -0.2F, -0.2F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 420, 186, -0.2F, -0.2F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 420, 189, -0.2F, -0.2F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 420, 192, -0.2F, -0.2F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 420, 195, -0.2F, -0.2F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 420, 198, -0.2F, -0.2F, 7.1F, 1, 1, 1, -0.198F, false));

		cube_r51 = new ModelRenderer(this);
		cube_r51.setRotationPoint(0.0F, 0.0F, -1.25F);
		bone3.addChild(cube_r51);
		setRotationAngle(cube_r51, 0.0F, 0.0F, -0.8901F);
		cube_r51.cubeList.add(new ModelBox(cube_r51, 28, 413, -0.8F, -0.2F, 5.8F, 1, 1, 2, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 246, 232, -0.75F, -0.05F, 7.2F, 1, 1, 42, -0.35F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 317, 411, -0.8F, -0.2F, 49.2F, 1, 1, 2, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 413, 46, -0.8F, -0.2F, 48.3F, 1, 1, 2, -0.197F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 420, 201, -0.8F, -0.2F, 47.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 373, 416, -0.8F, -0.2F, 45.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 203, 420, -0.8F, -0.2F, 44.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 420, 275, -0.8F, -0.2F, 43.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 208, 420, -0.8F, -0.2F, 42.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 178, 417, -0.8F, -0.2F, 40.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 213, 420, -0.8F, -0.2F, 39.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 289, 420, -0.8F, -0.2F, 38.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 218, 420, -0.8F, -0.2F, 37.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 420, 222, -0.8F, -0.2F, 35.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 126, 417, -0.8F, -0.2F, 34.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 223, 420, -0.8F, -0.2F, 33.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 420, 225, -0.8F, -0.2F, 32.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 228, 420, -0.8F, -0.2F, 30.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 233, 420, -0.8F, -0.2F, 29.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 238, 420, -0.8F, -0.2F, 28.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 420, 239, -0.8F, -0.2F, 27.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 416, 336, -0.8F, -0.2F, 25.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 420, 242, -0.8F, -0.2F, 24.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 243, 420, -0.8F, -0.2F, 23.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 420, 245, -0.8F, -0.2F, 22.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 248, 420, -0.8F, -0.2F, 20.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 420, 248, -0.8F, -0.2F, 19.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 420, 251, -0.8F, -0.2F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 253, 420, -0.8F, -0.2F, 17.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 420, 254, -0.8F, -0.2F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 420, 257, -0.8F, -0.2F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 258, 420, -0.8F, -0.2F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 420, 260, -0.8F, -0.2F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 263, 420, -0.8F, -0.2F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 420, 263, -0.8F, -0.2F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 420, 266, -0.8F, -0.2F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 420, 269, -0.8F, -0.2F, 7.1F, 1, 1, 1, -0.198F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		upper.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}