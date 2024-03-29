package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SL8CH extends ModelBase {
	private final ModelRenderer carryhandle;
	private final ModelRenderer carryhandle_r1;
	private final ModelRenderer carryhandle_r2;
	private final ModelRenderer carryhandle_r3;
	private final ModelRenderer carryhandle_r4;
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

	public SL8CH() {
		textureWidth = 220;
		textureHeight = 220;

		carryhandle = new ModelRenderer(this);
		carryhandle.setRotationPoint(0.0F, 24.0F, 0.0F);
		carryhandle.cubeList.add(new ModelBox(carryhandle, 0, 17, -0.75F, -43.0F, -18.5F, 1, 2, 20, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 47, 48, -1.75F, -44.0F, -41.5F, 2, 1, 43, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 0, 47, -3.25F, -44.0F, -41.5F, 2, 1, 43, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 23, 70, -3.25F, -43.0F, -39.5F, 2, 1, 20, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 70, 71, -1.75F, -43.0F, -39.5F, 2, 1, 20, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 62, 63, -1.75F, -44.0F, -69.5F, 2, 1, 28, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 15, 62, -3.25F, -44.0F, -69.5F, 2, 1, 28, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 20, 67, -3.25F, -43.0F, -64.5F, 2, 1, 23, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 67, 68, -1.75F, -43.0F, -64.5F, 2, 1, 23, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 41, 88, -3.25F, -43.4F, -66.5F, 2, 1, 2, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 88, 89, -1.75F, -43.4F, -66.5F, 2, 1, 2, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 83, 113, -0.75F, -43.0F, -20.0F, 1, 1, 2, -0.001F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 95, 34, -2.75F, -42.0F, -43.0F, 3, 1, 3, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 95, 29, -2.75F, -43.0F, -42.25F, 3, 1, 3, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 85, 92, -3.25F, -43.0F, -42.25F, 1, 1, 3, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 101, 0, -3.25F, -42.0F, -43.0F, 1, 1, 3, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 151, 144, -3.25F, -43.0F, -18.5F, 3, 2, 20, 0.001F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 166, 159, -3.25F, -43.0F, -23.5F, 1, 2, 5, 0.001F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 15, 32, -0.75F, -43.0F, -23.5F, 1, 2, 5, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 15, 32, -0.75F, -42.3F, -35.5F, 1, 1, 5, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 166, 159, -3.25F, -42.3F, -35.5F, 1, 1, 5, 0.001F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 168, 161, -3.25F, -42.3F, -30.5F, 1, 1, 3, 0.001F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 17, 34, -0.75F, -42.3F, -30.5F, 1, 1, 3, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 168, 161, -3.25F, -43.0F, 1.5F, 3, 2, 3, 0.001F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 40, 87, -3.25F, -44.0F, 1.5F, 2, 1, 3, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 87, 88, -1.75F, -44.0F, 1.5F, 2, 1, 3, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 17, 34, -0.75F, -43.0F, 1.5F, 1, 2, 3, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 95, 8, -2.5F, -41.5F, 1.4F, 2, 1, 4, 0.001F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 11, 109, -3.25F, -43.0F, -20.0F, 1, 1, 2, -0.001F, false));

		carryhandle_r1 = new ModelRenderer(this);
		carryhandle_r1.setRotationPoint(-1.0F, -43.6775F, -36.4222F);
		carryhandle.addChild(carryhandle_r1);
		setRotationAngle(carryhandle_r1, -1.0036F, 0.0F, 0.0F);
		carryhandle_r1.cubeList.add(new ModelBox(carryhandle_r1, 170, 163, -2.25F, -0.5F, 1.5F, 1, 1, 1, 0.001F, false));
		carryhandle_r1.cubeList.add(new ModelBox(carryhandle_r1, 19, 36, 0.25F, -0.5F, 1.5F, 1, 1, 1, 0.0F, false));

		carryhandle_r2 = new ModelRenderer(this);
		carryhandle_r2.setRotationPoint(-1.0F, -43.3775F, -24.4222F);
		carryhandle.addChild(carryhandle_r2);
		setRotationAngle(carryhandle_r2, -1.0036F, 0.0F, 0.0F);
		carryhandle_r2.cubeList.add(new ModelBox(carryhandle_r2, 18, 35, 0.25F, -0.5F, 0.5F, 1, 1, 2, 0.0F, false));
		carryhandle_r2.cubeList.add(new ModelBox(carryhandle_r2, 169, 162, -2.25F, -0.5F, 0.5F, 1, 1, 2, 0.001F, false));

		carryhandle_r3 = new ModelRenderer(this);
		carryhandle_r3.setRotationPoint(-1.0F, -42.4124F, -27.3837F);
		carryhandle.addChild(carryhandle_r3);
		setRotationAngle(carryhandle_r3, 1.0036F, 0.0F, 0.0F);
		carryhandle_r3.cubeList.add(new ModelBox(carryhandle_r3, 170, 163, -2.25F, -0.5F, -1.0F, 1, 1, 1, 0.001F, false));
		carryhandle_r3.cubeList.add(new ModelBox(carryhandle_r3, 19, 36, 0.25F, -0.5F, -1.0F, 1, 1, 1, 0.0F, false));

		carryhandle_r4 = new ModelRenderer(this);
		carryhandle_r4.setRotationPoint(-1.5F, -42.5F, -52.5F);
		carryhandle.addChild(carryhandle_r4);
		setRotationAngle(carryhandle_r4, -0.0436F, 0.0F, 0.0F);
		carryhandle_r4.cubeList.add(new ModelBox(carryhandle_r4, 16, 63, -1.75F, 0.1F, -17.0F, 2, 1, 27, 0.0F, false));
		carryhandle_r4.cubeList.add(new ModelBox(carryhandle_r4, 63, 64, -0.25F, 0.1F, -17.0F, 2, 1, 27, 0.0F, false));

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
		

		cube_r104 = new ModelRenderer(this);
		cube_r104.setRotationPoint(-2.75F, -36.4831F, -20.6854F);
		carryhandle.addChild(cube_r104);
		setRotationAngle(cube_r104, -0.5672F, 0.0F, 0.0F);
		

		cube_r105 = new ModelRenderer(this);
		cube_r105.setRotationPoint(-2.75F, -36.4704F, -9.5288F);
		carryhandle.addChild(cube_r105);
		setRotationAngle(cube_r105, -0.5672F, 0.0F, 0.0F);
		

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
		

		cube_r109 = new ModelRenderer(this);
		cube_r109.setRotationPoint(1.0F, -44.6F, 1.4F);
		carryhandle.addChild(cube_r109);
		setRotationAngle(cube_r109, -0.5411F, 0.0F, 0.0F);
		

		rail = new ModelRenderer(this);
		rail.setRotationPoint(-0.6082F, -40.7113F, -11.2F);
		carryhandle.addChild(rail);
		rail.cubeList.add(new ModelBox(rail, 0, 0, -1.8918F, -3.3387F, -30.252F, 2, 0, 37, 0.3F, false));
		rail.cubeList.add(new ModelBox(rail, 32, 32, -1.8918F, -3.3387F, -58.002F, 2, 0, 5, 0.3F, false));
		rail.cubeList.add(new ModelBox(rail, 29, 29, -1.8918F, -3.3387F, 7.348F, 2, 0, 8, 0.3F, false));

		DustCover4_r2 = new ModelRenderer(this);
		DustCover4_r2.setRotationPoint(-2.0961F, -3.475F, -14.15F);
		rail.addChild(DustCover4_r2);
		setRotationAngle(DustCover4_r2, 0.0F, 0.0F, 1.1781F);
		DustCover4_r2.cubeList.add(new ModelBox(DustCover4_r2, 53, 0, -0.5F, -0.5F, -16.5F, 2, 1, 38, -0.3F, false));
		DustCover4_r2.cubeList.add(new ModelBox(DustCover4_r2, 85, 32, -0.5F, -0.5F, -44.45F, 2, 1, 6, -0.3F, false));
		DustCover4_r2.cubeList.add(new ModelBox(DustCover4_r2, 81, 28, -0.5F, -0.5F, 20.9F, 2, 1, 9, -0.3F, false));

		DustCover3_r1 = new ModelRenderer(this);
		DustCover3_r1.setRotationPoint(0.3126F, -3.475F, -14.15F);
		rail.addChild(DustCover3_r1);
		setRotationAngle(DustCover3_r1, 0.0F, 0.0F, -1.1781F);
		DustCover3_r1.cubeList.add(new ModelBox(DustCover3_r1, 0, 91, -1.5F, -0.5F, -16.5F, 2, 1, 38, -0.3F, false));
		DustCover3_r1.cubeList.add(new ModelBox(DustCover3_r1, 32, 123, -1.5F, -0.5F, -44.45F, 2, 1, 6, -0.3F, false));
		DustCover3_r1.cubeList.add(new ModelBox(DustCover3_r1, 28, 119, -1.5F, -0.5F, 20.9F, 2, 1, 9, -0.3F, false));

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
		teeth.cubeList.add(new ModelBox(teeth, 116, 82, -1.0F, -4.0F, -4.9F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 116, 79, -1.0F, -4.0F, -4.1F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 116, 76, -1.0F, -4.0F, -5.7F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 116, 76, -1.0F, -4.0F, -14.3F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 116, 82, -1.0F, -4.0F, -14.6F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 116, 76, -1.0F, -4.0F, -6.5F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 116, 72, -1.0F, -4.0F, -7.275F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 116, 72, -1.0F, -4.0F, -8.075F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 116, 48, -1.0F, -4.0F, -8.6F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 116, 48, -1.0F, -4.0F, -25.6F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 116, 72, -1.0F, -4.0F, -27.275F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 116, 76, -1.0F, -4.0F, -28.8F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 116, 79, -1.0F, -4.0F, -30.6F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 116, 82, -1.0F, -4.0F, -29.3F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 116, 76, -1.0F, -4.0F, -27.5F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 116, 72, -1.0F, -4.0F, -26.075F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 60, 116, -1.0F, -4.0F, -10.225F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 116, 46, -1.0F, -4.0F, -11.85F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 42, 116, -1.0F, -4.0F, -37.875F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 116, 41, -1.0F, -4.0F, -36.25F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 116, 39, -1.0F, -4.0F, -26.5F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 30, 116, -1.0F, -4.0F, -28.125F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 116, 22, -1.0F, -4.0F, -29.95F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 116, 17, -1.0F, -4.0F, -31.375F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 116, 15, -1.0F, -4.0F, -34.625F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 42, 116, -1.0F, -4.0F, -77.05F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 116, 41, -1.0F, -4.0F, -75.425F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 116, 15, -1.0F, -4.0F, -73.8F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 116, 11, -1.0F, -4.0F, -33.0F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 3, 94, -1.0F, -4.0F, -73.5F, 2, 1, 35, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 115, 58, -1.0F, -4.0F, -33.8F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 115, 44, -1.0F, -4.0F, -34.15F, 2, 1, 1, -0.1F, false));

		DustCover9_r2 = new ModelRenderer(this);
		DustCover9_r2.setRotationPoint(-0.9F, -3.3343F, -45.498F);
		teeth.addChild(DustCover9_r2);
		setRotationAngle(DustCover9_r2, 0.0F, 0.0F, 0.7854F);
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 108, 102, -0.5F, -0.5F, 11.347F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 9, 55, -0.5F, -0.5F, -28.003F, 1, 1, 35, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 42, 109, -0.5F, -0.5F, 11.697F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 102, 110, -0.5F, -0.5F, 12.497F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 0, 111, -0.5F, -0.5F, 10.872F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 87, 113, -0.5F, -0.5F, 14.122F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 23, 114, -0.5F, -0.5F, 15.547F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 65, 115, -0.5F, -0.5F, 17.372F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 5, 116, -0.5F, -0.5F, 18.997F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 83, 116, -0.5F, -0.5F, 9.247F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 116, 94, -0.5F, -0.5F, 7.622F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 0, 111, -0.5F, -0.5F, -28.303F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 83, 116, -0.5F, -0.5F, -29.928F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 116, 94, -0.5F, -0.5F, -31.553F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 116, 96, -0.5F, -0.5F, 22.247F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 100, 116, -0.5F, -0.5F, 20.622F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 116, 102, -0.5F, -0.5F, 25.497F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 116, 107, -0.5F, -0.5F, 23.872F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 116, 112, -0.5F, -0.5F, 27.122F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 116, 116, -0.5F, -0.5F, 28.747F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 117, 0, -0.5F, -0.5F, 30.372F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 23, 117, -0.5F, -0.5F, 31.997F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 23, 117, -0.5F, -0.5F, 40.597F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 117, 0, -0.5F, -0.5F, 41.397F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 116, 116, -0.5F, -0.5F, 39.797F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 116, 116, -0.5F, -0.5F, 31.197F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 23, 117, -0.5F, -0.5F, 30.897F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 116, 116, -0.5F, -0.5F, 38.997F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 116, 112, -0.5F, -0.5F, 38.222F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 116, 112, -0.5F, -0.5F, 37.422F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 116, 102, -0.5F, -0.5F, 36.897F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 116, 102, -0.5F, -0.5F, 19.897F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 116, 112, -0.5F, -0.5F, 18.222F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 116, 116, -0.5F, -0.5F, 16.697F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 117, 0, -0.5F, -0.5F, 14.897F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 23, 117, -0.5F, -0.5F, 16.197F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 116, 116, -0.5F, -0.5F, 17.997F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 116, 112, -0.5F, -0.5F, 19.422F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 116, 107, -0.5F, -0.5F, 35.272F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 116, 96, -0.5F, -0.5F, 33.647F, 1, 1, 1, -0.1F, false));

		DustCover8_r3 = new ModelRenderer(this);
		DustCover8_r3.setRotationPoint(0.9F, -3.3343F, -45.498F);
		teeth.addChild(DustCover8_r3);
		setRotationAngle(DustCover8_r3, 0.0F, 0.0F, -0.7854F);
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 102, 108, -0.5F, -0.5F, 11.347F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 57, 3, -0.5F, -0.5F, -28.003F, 1, 1, 35, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 0, 109, -0.5F, -0.5F, 11.697F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 108, 110, -0.5F, -0.5F, 12.497F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 42, 111, -0.5F, -0.5F, 10.872F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 60, 111, -0.5F, -0.5F, 14.122F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 4, 114, -0.5F, -0.5F, 15.547F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 108, 114, -0.5F, -0.5F, 17.372F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 88, 115, -0.5F, -0.5F, 18.997F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 116, 92, -0.5F, -0.5F, 9.247F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 96, 116, -0.5F, -0.5F, 7.622F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 42, 111, -0.5F, -0.5F, -28.303F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 116, 92, -0.5F, -0.5F, -29.928F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 96, 116, -0.5F, -0.5F, -31.553F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 116, 98, -0.5F, -0.5F, 22.247F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 116, 100, -0.5F, -0.5F, 20.622F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 104, 116, -0.5F, -0.5F, 25.497F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 108, 116, -0.5F, -0.5F, 23.872F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 116, 110, -0.5F, -0.5F, 27.122F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 116, 114, -0.5F, -0.5F, 28.747F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 0, 117, -0.5F, -0.5F, 30.372F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 19, 117, -0.5F, -0.5F, 31.997F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 19, 117, -0.5F, -0.5F, 40.597F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 0, 117, -0.5F, -0.5F, 41.397F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 116, 114, -0.5F, -0.5F, 39.797F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 116, 114, -0.5F, -0.5F, 31.197F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 19, 117, -0.5F, -0.5F, 30.897F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 116, 114, -0.5F, -0.5F, 38.997F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 116, 110, -0.5F, -0.5F, 38.222F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 116, 110, -0.5F, -0.5F, 37.422F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 104, 116, -0.5F, -0.5F, 36.897F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 104, 116, -0.5F, -0.5F, 19.897F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 116, 110, -0.5F, -0.5F, 18.222F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 116, 114, -0.5F, -0.5F, 16.697F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 0, 117, -0.5F, -0.5F, 14.897F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 19, 117, -0.5F, -0.5F, 16.197F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 116, 114, -0.5F, -0.5F, 17.997F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 116, 110, -0.5F, -0.5F, 19.422F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 108, 116, -0.5F, -0.5F, 35.272F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 116, 98, -0.5F, -0.5F, 33.647F, 1, 1, 1, -0.1F, false));
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