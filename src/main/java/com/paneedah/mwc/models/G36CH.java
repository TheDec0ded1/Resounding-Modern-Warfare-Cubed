package com.paneedah.mwc.models;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class G36CH extends ModelBase {
	private final ModelRenderer carryhandle;
	private final ModelRenderer cube_r101;
	private final ModelRenderer cube_r102;
	private final ModelRenderer cube_r103;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
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

	public G36CH() {
		textureWidth = 220;
		textureHeight = 220;

		carryhandle = new ModelRenderer(this);
		carryhandle.setRotationPoint(0.0F, 24.0F, 0.0F);
		carryhandle.cubeList.add(new ModelBox(carryhandle, 3, 20, -0.75F, -43.0F, -12.5F, 1, 2, 17, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 63, 64, -1.55F, -47.0F, -39.2F, 2, 1, 27, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 16, 63, -3.451F, -47.001F, -39.201F, 2, 1, 27, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 26, 73, -2.75F, -46.7F, -12.525F, 2, 1, 17, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 164, 88, -3.451F, -45.501F, 4.501F, 1, 2, 1, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 164, 88, -0.55F, -45.5F, 4.5F, 1, 2, 1, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 164, 88, -0.55F, -45.25F, 4.5F, 1, 2, 1, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 164, 88, -3.451F, -45.251F, 4.501F, 1, 2, 1, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 164, 88, -2.2571F, -46.2071F, 4.5F, 2, 1, 1, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 164, 88, -2.7439F, -43.5439F, 4.501F, 2, 1, 1, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 164, 88, -2.7439F, -46.2081F, 4.501F, 2, 1, 1, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 164, 88, -2.2571F, -43.5429F, 4.5F, 2, 1, 1, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 26, 73, -1.25F, -46.7F, -12.525F, 1, 1, 17, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 96, 35, -0.547F, -42.0144F, -42.9873F, 1, 1, 2, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 96, 30, -0.547F, -43.0144F, -42.2373F, 1, 1, 2, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 86, 93, -3.451F, -43.0116F, -42.2369F, 1, 1, 2, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 96, 30, -0.547F, -44.0144F, -41.2373F, 1, 1, 2, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 86, 93, -3.451F, -44.0116F, -41.2369F, 1, 1, 2, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 86, 93, -3.451F, -45.0116F, -40.3369F, 1, 1, 2, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 96, 30, -0.547F, -45.0144F, -40.3373F, 1, 1, 2, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 86, 93, -3.451F, -46.0116F, -39.6369F, 1, 1, 2, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 96, 30, -0.547F, -46.0144F, -39.6373F, 1, 1, 2, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 145, 13, -0.55F, -47.2F, -39.175F, 1, 1, 16, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 49, 143, -3.45F, -47.2F, -39.175F, 1, 1, 16, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 62, 156, -1.95F, -47.6F, -39.475F, 1, 1, 3, -0.4F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 64, 158, -3.15F, -47.6F, -16.475F, 2, 1, 1, -0.4F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 64, 158, -1.75F, -47.6F, -16.475F, 2, 1, 1, -0.4F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 150, 18, -0.55F, -47.2F, -23.5F, 1, 1, 11, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 54, 148, -3.45F, -47.2F, -23.175F, 1, 1, 11, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 102, 1, -3.451F, -42.0116F, -42.9869F, 1, 1, 2, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 154, 147, -3.25F, -43.0F, -12.5F, 3, 2, 17, 0.001F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 154, 147, -3.45F, -45.0F, -12.5F, 3, 2, 17, 0.001F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 15, 146, -0.55F, -45.0F, -12.5F, 1, 2, 17, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 154, 147, -3.45F, -46.0F, -12.5F, 3, 1, 17, 0.001F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 3, 20, -0.55F, -46.0F, -12.5F, 1, 1, 17, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 96, 9, -2.5F, -41.5F, 1.4F, 2, 1, 3, 0.001F, false));

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
		cube_r103.setRotationPoint(-0.75F, -46.5F, -3.625F);
		carryhandle.addChild(cube_r103);
		setRotationAngle(cube_r103, 0.0F, 0.0F, 0.7854F);
		cube_r103.cubeList.add(new ModelBox(cube_r103, 143, 12, 0.2021F, -0.495F, -8.875F, 1, 1, 17, 0.0F, false));
		cube_r103.cubeList.add(new ModelBox(cube_r103, 15, 146, -1.557F, 1.2627F, -8.874F, 1, 1, 17, 0.0F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(-0.75F, -46.0F, 13.375F);
		carryhandle.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.0F, 0.0F, 0.7854F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 175, 87, 0.2021F, -0.495F, -8.875F, 1, 1, 1, 0.0F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 190, 88, -1.557F, 1.2627F, -8.874F, 1, 1, 1, 0.0F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(-0.75F, -43.75F, 13.375F);
		carryhandle.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.0F, 0.0F, 0.7854F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 175, 87, 0.2021F, -0.495F, -8.875F, 1, 1, 1, 0.0F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 190, 88, -1.557F, 1.2627F, -8.874F, 1, 1, 1, 0.0F, false));

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
		cube_r106.cubeList.add(new ModelBox(cube_r106, 41, 38, -1.7F, -0.8172F, -0.8967F, 1, 3, 1, 0.0F, false));
		cube_r106.cubeList.add(new ModelBox(cube_r106, 66, 109, 1.202F, -0.8192F, -0.8987F, 1, 3, 1, 0.0F, false));
		cube_r106.cubeList.add(new ModelBox(cube_r106, 41, 38, -1.7F, -3.8172F, -0.8967F, 1, 3, 1, 0.0F, false));
		cube_r106.cubeList.add(new ModelBox(cube_r106, 66, 109, 1.202F, -3.8192F, -0.8987F, 1, 3, 1, 0.0F, false));
		cube_r106.cubeList.add(new ModelBox(cube_r106, 66, 109, 1.202F, -4.8192F, -0.8987F, 1, 1, 1, 0.0F, false));
		cube_r106.cubeList.add(new ModelBox(cube_r106, 41, 38, -1.7F, -4.8172F, -0.8967F, 1, 1, 1, 0.0F, false));

		cube_r107 = new ModelRenderer(this);
		cube_r107.setRotationPoint(-2.25F, -41.575F, -42.55F);
		carryhandle.addChild(cube_r107);
		setRotationAngle(cube_r107, -0.6545F, 0.0F, 0.0F);
		cube_r107.cubeList.add(new ModelBox(cube_r107, 18, 0, -1.2F, -2.5172F, -0.7467F, 1, 4, 1, 0.0F, false));
		cube_r107.cubeList.add(new ModelBox(cube_r107, 29, 109, 1.702F, -2.5192F, -0.7487F, 1, 4, 1, -0.002F, false));
		cube_r107.cubeList.add(new ModelBox(cube_r107, 29, 109, 1.702F, -6.5192F, -0.7487F, 1, 4, 1, -0.002F, false));
		cube_r107.cubeList.add(new ModelBox(cube_r107, 18, 0, -1.2F, -6.5172F, -0.7467F, 1, 4, 1, 0.0F, false));

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
		

		DustCover4_r2 = new ModelRenderer(this);
		DustCover4_r2.setRotationPoint(-2.0961F, -3.475F, -14.15F);
		rail.addChild(DustCover4_r2);
		setRotationAngle(DustCover4_r2, 0.0F, 0.0F, 1.1781F);
		

		DustCover3_r1 = new ModelRenderer(this);
		DustCover3_r1.setRotationPoint(0.3126F, -3.475F, -14.15F);
		rail.addChild(DustCover3_r1);
		setRotationAngle(DustCover3_r1, 0.0F, 0.0F, -1.1781F);
		

		teeth = new ModelRenderer(this);
		teeth.setRotationPoint(-0.8918F, -0.2489F, 18.65F);
		rail.addChild(teeth);
		

		DustCover9_r2 = new ModelRenderer(this);
		DustCover9_r2.setRotationPoint(-0.9F, -3.3343F, -45.498F);
		teeth.addChild(DustCover9_r2);
		setRotationAngle(DustCover9_r2, 0.0F, 0.0F, 0.7854F);
		

		DustCover8_r3 = new ModelRenderer(this);
		DustCover8_r3.setRotationPoint(0.9F, -3.3343F, -45.498F);
		teeth.addChild(DustCover8_r3);
		setRotationAngle(DustCover8_r3, 0.0F, 0.0F, -0.7854F);
		
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