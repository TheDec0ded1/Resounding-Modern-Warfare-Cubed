package com.paneedah.mwc.models;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class G36CCH extends ModelBase {
	private final ModelRenderer carryhandle;
	private final ModelRenderer cube_r101;
	private final ModelRenderer cube_r102;
	private final ModelRenderer cube_r103;
	private final ModelRenderer cube_r104;
	private final ModelRenderer cube_r105;
	private final ModelRenderer cube_r106;
	private final ModelRenderer cube_r107;
	private final ModelRenderer cube_r108;
	private final ModelRenderer cube_r109;
	private final ModelRenderer rail;
	private final ModelRenderer DustCover4_r2;
	private final ModelRenderer DustCover3_r1;
	private final ModelRenderer teeth;
	private final ModelRenderer DustCover9_r2;
	private final ModelRenderer DustCover8_r3;

	public G36CCH() {
		textureWidth = 220;
		textureHeight = 220;

		carryhandle = new ModelRenderer(this);
		carryhandle.setRotationPoint(0.0F, 24.0F, 0.0F);
		carryhandle.cubeList.add(new ModelBox(carryhandle, 0, 17, -0.75F, -43.0F, -18.5F, 1, 2, 20, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 47, 48, -1.75F, -44.0F, -41.5F, 2, 1, 43, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 0, 47, -3.25F, -44.0F, -41.5F, 2, 1, 43, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 96, 113, -0.749F, -42.55F, -30.5F, 1, 1, 2, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 42, 109, -0.749F, -43.55F, -31.5F, 1, 1, 4, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 83, 113, -0.75F, -43.0F, -20.0F, 1, 1, 2, -0.001F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 62, 82, -3.5F, -44.3F, -4.5F, 4, 1, 6, 0.004F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 0, 39, -3.0F, -44.6F, -3.6F, 3, 1, 5, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 81, 75, -1.0F, -45.63F, -3.3F, 1, 1, 3, -0.001F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 63, 39, -3.0F, -45.63F, -3.3F, 1, 1, 3, -0.001F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 11, 39, -2.0F, -45.38F, -2.9F, 1, 1, 3, -0.001F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 20, 83, -3.7F, -44.9F, -4.298F, 1, 1, 6, -0.199F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 86, 100, -3.7F, -46.8F, -4.698F, 1, 3, 3, -0.201F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 33, 16, -3.7F, -46.8F, -2.298F, 1, 3, 1, -0.198F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 22, 30, -0.3F, -44.9F, -4.298F, 1, 1, 6, -0.199F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 18, 11, -0.3F, -46.8F, -2.298F, 1, 3, 1, -0.198F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 82, 21, -0.3F, -46.8F, -4.698F, 1, 3, 3, -0.201F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 95, 34, -2.75F, -42.0F, -43.0F, 3, 1, 3, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 95, 29, -2.75F, -43.0F, -42.25F, 3, 1, 3, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 85, 92, -3.25F, -43.0F, -42.25F, 1, 1, 3, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 101, 0, -3.25F, -42.0F, -43.0F, 1, 1, 3, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 151, 144, -3.25F, -43.0F, -18.5F, 3, 2, 20, 0.001F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 95, 8, -2.5F, -41.5F, 1.4F, 2, 1, 4, 0.001F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 11, 109, -3.25F, -43.0F, -20.0F, 1, 1, 2, -0.001F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 104, 29, -3.251F, -42.55F, -30.5F, 1, 1, 2, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 96, 108, -3.251F, -43.55F, -31.5F, 1, 1, 4, 0.0F, false));

		cube_r101 = new ModelRenderer(this);
		cube_r101.setRotationPoint(-1.5F, -42.0F, -1.0F);
		carryhandle.addChild(cube_r101);
		setRotationAngle(cube_r101, -0.3927F, 0.0F, 0.0F);
		cube_r101.cubeList.add(new ModelBox(cube_r101, 27, 65, -2.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r101.cubeList.add(new ModelBox(cube_r101, 27, 117, 1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r102 = new ModelRenderer(this);
		cube_r102.setRotationPoint(-1.5F, -42.0F, -11.0F);
		carryhandle.addChild(cube_r102);
		setRotationAngle(cube_r102, -0.3927F, 0.0F, 0.0F);
		cube_r102.cubeList.add(new ModelBox(cube_r102, 66, 0, -2.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r102.cubeList.add(new ModelBox(cube_r102, 117, 31, 1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r103 = new ModelRenderer(this);
		cube_r103.setRotationPoint(-2.75F, -42.7776F, -27.5036F);
		carryhandle.addChild(cube_r103);
		setRotationAngle(cube_r103, 0.5672F, 0.0F, 0.0F);
		cube_r103.cubeList.add(new ModelBox(cube_r103, 102, 92, -0.499F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));
		cube_r103.cubeList.add(new ModelBox(cube_r103, 0, 104, 1.999F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));

		cube_r104 = new ModelRenderer(this);
		cube_r104.setRotationPoint(-2.75F, -36.4831F, -20.6854F);
		carryhandle.addChild(cube_r104);
		setRotationAngle(cube_r104, -0.5672F, 0.0F, 0.0F);
		cube_r104.cubeList.add(new ModelBox(cube_r104, 79, 103, -0.499F, 0.0F, -14.0F, 1, 1, 3, 0.0F, false));
		cube_r104.cubeList.add(new ModelBox(cube_r104, 19, 104, 1.999F, 0.0F, -14.0F, 1, 1, 3, 0.0F, false));

		cube_r105 = new ModelRenderer(this);
		cube_r105.setRotationPoint(-2.75F, -36.4704F, -9.5288F);
		carryhandle.addChild(cube_r105);
		setRotationAngle(cube_r105, -0.5672F, 0.0F, 0.0F);
		cube_r105.cubeList.add(new ModelBox(cube_r105, 0, 109, -0.5F, 0.0F, -14.0F, 1, 1, 4, -0.002F, false));
		cube_r105.cubeList.add(new ModelBox(cube_r105, 60, 109, 2.0F, 0.0F, -14.0F, 1, 1, 4, -0.002F, false));

		cube_r106 = new ModelRenderer(this);
		cube_r106.setRotationPoint(-1.75F, -42.4944F, -39.4835F);
		carryhandle.addChild(cube_r106);
		setRotationAngle(cube_r106, -0.6545F, 0.0F, 0.0F);
		cube_r106.cubeList.add(new ModelBox(cube_r106, 41, 38, -1.499F, -1.5F, -0.5F, 1, 3, 1, 0.0F, false));
		cube_r106.cubeList.add(new ModelBox(cube_r106, 66, 109, -1.001F, -1.5F, -0.5F, 3, 3, 1, 0.0F, false));

		cube_r107 = new ModelRenderer(this);
		cube_r107.setRotationPoint(-2.25F, -41.575F, -42.55F);
		carryhandle.addChild(cube_r107);
		setRotationAngle(cube_r107, -0.6545F, 0.0F, 0.0F);
		cube_r107.cubeList.add(new ModelBox(cube_r107, 18, 0, -0.999F, -2.5F, -0.75F, 1, 4, 1, 0.0F, false));
		cube_r107.cubeList.add(new ModelBox(cube_r107, 29, 109, -0.501F, -2.5F, -0.75F, 3, 4, 1, -0.002F, false));

		cube_r108 = new ModelRenderer(this);
		cube_r108.setRotationPoint(-0.1F, -44.7F, 1.502F);
		carryhandle.addChild(cube_r108);
		setRotationAngle(cube_r108, -0.5585F, 0.0F, 0.0F);
		cube_r108.cubeList.add(new ModelBox(cube_r108, 80, 55, -0.2F, -0.2F, -3.8F, 1, 2, 4, -0.2F, false));
		cube_r108.cubeList.add(new ModelBox(cube_r108, 87, 39, -3.6F, -0.2F, -3.8F, 1, 2, 4, -0.2F, false));

		cube_r109 = new ModelRenderer(this);
		cube_r109.setRotationPoint(1.0F, -44.6F, 1.4F);
		carryhandle.addChild(cube_r109);
		setRotationAngle(cube_r109, -0.5411F, 0.0F, 0.0F);
		cube_r109.cubeList.add(new ModelBox(cube_r109, 101, 15, -2.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));
		cube_r109.cubeList.add(new ModelBox(cube_r109, 38, 60, -3.0F, 0.0F, -1.5F, 1, 1, 1, -0.001F, false));
		cube_r109.cubeList.add(new ModelBox(cube_r109, 6, 65, -3.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));
		cube_r109.cubeList.add(new ModelBox(cube_r109, 5, 104, -4.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

		rail = new ModelRenderer(this);
		rail.setRotationPoint(-0.6082F, -40.7113F, -11.2F);
		carryhandle.addChild(rail);
		rail.cubeList.add(new ModelBox(rail, 0, 0, -1.8918F, -3.3387F, -30.252F, 2, 0, 37, 0.3F, false));

		DustCover4_r2 = new ModelRenderer(this);
		DustCover4_r2.setRotationPoint(-2.0961F, -3.475F, -14.15F);
		rail.addChild(DustCover4_r2);
		setRotationAngle(DustCover4_r2, 0.0F, 0.0F, 1.1781F);
		DustCover4_r2.cubeList.add(new ModelBox(DustCover4_r2, 53, 0, -0.5F, -0.5F, -16.5F, 2, 1, 38, -0.3F, false));

		DustCover3_r1 = new ModelRenderer(this);
		DustCover3_r1.setRotationPoint(0.3126F, -3.475F, -14.15F);
		rail.addChild(DustCover3_r1);
		setRotationAngle(DustCover3_r1, 0.0F, 0.0F, -1.1781F);
		DustCover3_r1.cubeList.add(new ModelBox(DustCover3_r1, 0, 91, -1.5F, -0.5F, -16.5F, 2, 1, 38, -0.3F, false));

		teeth = new ModelRenderer(this);
		teeth.setRotationPoint(-0.8918F, -0.2489F, 18.65F);
		rail.addChild(teeth);
		teeth.cubeList.add(new ModelBox(teeth, 116, 82, -1.0F, -4.0F, -13.5F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 116, 79, -1.0F, -4.0F, -15.125F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 116, 76, -1.0F, -4.0F, -16.75F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 116, 72, -1.0F, -4.0F, -18.375F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 60, 116, -1.0F, -4.0F, -21.625F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 116, 48, -1.0F, -4.0F, -20.0F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 48, 116, -1.0F, -4.0F, -24.875F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 116, 46, -1.0F, -4.0F, -23.25F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 42, 116, -1.0F, -4.0F, -37.875F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 116, 41, -1.0F, -4.0F, -36.25F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 116, 39, -1.0F, -4.0F, -26.5F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 30, 116, -1.0F, -4.0F, -28.125F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 116, 22, -1.0F, -4.0F, -29.75F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 116, 17, -1.0F, -4.0F, -31.375F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 116, 15, -1.0F, -4.0F, -34.625F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 116, 11, -1.0F, -4.0F, -33.0F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 115, 63, -1.0F, -4.0F, -49.25F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 115, 58, -1.0F, -4.0F, -39.5F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 115, 56, -1.0F, -4.0F, -41.125F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 115, 44, -1.0F, -4.0F, -42.75F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 115, 20, -1.0F, -4.0F, -44.375F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 115, 9, -1.0F, -4.0F, -47.625F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 115, 7, -1.0F, -4.0F, -46.0F, 2, 1, 1, -0.1F, false));

		DustCover9_r2 = new ModelRenderer(this);
		DustCover9_r2.setRotationPoint(-0.9F, -3.3343F, -45.498F);
		teeth.addChild(DustCover9_r2);
		setRotationAngle(DustCover9_r2, 0.0F, 0.0F, 0.7854F);
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 104, 85, -0.5F, -0.5F, -0.503F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 106, 41, -0.5F, -0.5F, -2.128F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 96, 108, -0.5F, -0.5F, 1.122F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 108, 102, -0.5F, -0.5F, 2.747F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 108, 108, -0.5F, -0.5F, 4.372F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 42, 109, -0.5F, -0.5F, 5.997F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 60, 109, -0.5F, -0.5F, -3.753F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 102, 110, -0.5F, -0.5F, 12.497F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 0, 111, -0.5F, -0.5F, 10.872F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 87, 113, -0.5F, -0.5F, 14.122F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 23, 114, -0.5F, -0.5F, 15.747F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 65, 115, -0.5F, -0.5F, 17.372F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 5, 116, -0.5F, -0.5F, 18.997F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 83, 116, -0.5F, -0.5F, 9.247F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 116, 94, -0.5F, -0.5F, 7.622F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 116, 96, -0.5F, -0.5F, 22.247F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 100, 116, -0.5F, -0.5F, 20.622F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 116, 102, -0.5F, -0.5F, 25.497F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 116, 107, -0.5F, -0.5F, 23.872F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 116, 112, -0.5F, -0.5F, 27.122F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 116, 116, -0.5F, -0.5F, 28.747F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 117, 0, -0.5F, -0.5F, 30.372F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 23, 117, -0.5F, -0.5F, 31.997F, 1, 1, 1, -0.1F, false));

		DustCover8_r3 = new ModelRenderer(this);
		DustCover8_r3.setRotationPoint(0.9F, -3.3343F, -45.498F);
		teeth.addChild(DustCover8_r3);
		setRotationAngle(DustCover8_r3, 0.0F, 0.0F, -0.7854F);
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 106, 39, -0.5F, -0.5F, -0.503F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 107, 92, -0.5F, -0.5F, -2.128F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 88, 108, -0.5F, -0.5F, 1.122F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 102, 108, -0.5F, -0.5F, 2.747F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 108, 104, -0.5F, -0.5F, 4.372F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 0, 109, -0.5F, -0.5F, 5.997F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 96, 110, -0.5F, -0.5F, -3.753F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 108, 110, -0.5F, -0.5F, 12.497F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 42, 111, -0.5F, -0.5F, 10.872F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 60, 111, -0.5F, -0.5F, 14.122F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 4, 114, -0.5F, -0.5F, 15.747F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 108, 114, -0.5F, -0.5F, 17.372F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 88, 115, -0.5F, -0.5F, 18.997F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 116, 92, -0.5F, -0.5F, 9.247F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 96, 116, -0.5F, -0.5F, 7.622F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 116, 98, -0.5F, -0.5F, 22.247F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 116, 100, -0.5F, -0.5F, 20.622F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 104, 116, -0.5F, -0.5F, 25.497F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 108, 116, -0.5F, -0.5F, 23.872F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 116, 110, -0.5F, -0.5F, 27.122F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 116, 114, -0.5F, -0.5F, 28.747F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 0, 117, -0.5F, -0.5F, 30.372F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 19, 117, -0.5F, -0.5F, 31.997F, 1, 1, 1, -0.1F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		carryhandle.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}