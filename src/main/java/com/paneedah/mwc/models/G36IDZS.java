package com.paneedah.mwc.models;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class G36IDZS extends ModelBase {
	private final ModelRenderer stock;
	private final ModelRenderer bone2;
	private final ModelRenderer stock_r1;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;
	private final ModelRenderer cube_r34;
	private final ModelRenderer cube_r35;
	private final ModelRenderer cube_r36;
	private final ModelRenderer cube_r37;
	private final ModelRenderer cube_r43;
	private final ModelRenderer cube_r38;
	private final ModelRenderer cube_r39;
	private final ModelRenderer cube_r40;
	private final ModelRenderer cube_r41;
	private final ModelRenderer cube_r42;

	public G36IDZS() {
		textureWidth = 220;
		textureHeight = 220;

		stock = new ModelRenderer(this);
		stock.setRotationPoint(0.0F, 24.0F, 17.05F);
		stock.cubeList.add(new ModelBox(stock, 110, 79, -1.625F, -41.0F, -12.5F, 2, 1, 2, 0.002F, false));
		stock.cubeList.add(new ModelBox(stock, 82, 27, -3.375F, -40.999F, -12.5F, 2, 1, 2, 0.001F, false));
		stock.cubeList.add(new ModelBox(stock, 0, 47, -3.501F, -30.7863F, 16.7088F, 4, 2, 3, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 47, 47, -3.5F, -40.0F, -12.5F, 4, 9, 3, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 33, 91, -4.5F, -40.0F, -12.5F, 1, 9, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 94, 72, -3.5F, -40.0F, -10.075F, 4, 1, 1, -0.001F, false));
		stock.cubeList.add(new ModelBox(stock, 42, 92, -3.5F, -39.0F, -9.5F, 4, 8, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 42, 92, -3.0F, -38.0F, -7.5F, 3, 3, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 43, 93, -3.0F, -38.0F, -5.5F, 3, 2, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 43, 93, -3.0F, -38.2F, -4.5F, 3, 1, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 43, 93, -3.0F, -36.0F, -7.5F, 3, 2, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 151, 110, -3.5F, -39.6F, 15.5F, 4, 18, 3, 0.002F, false));
		stock.cubeList.add(new ModelBox(stock, 151, 110, -3.5F, -22.1F, 15.5F, 4, 2, 3, 0.002F, false));
		stock.cubeList.add(new ModelBox(stock, 53, 71, -3.0F, -38.6F, -7.5F, 3, 1, 10, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 58, 76, -2.9F, -32.4F, -0.6F, 3, 1, 5, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 58, 76, -3.5F, -33.4F, -0.4F, 4, 1, 5, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 16, 71, -3.5F, -33.4F, 3.6F, 4, 3, 5, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 51, 0, -3.5F, -33.4F, 8.6F, 4, 3, 5, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 39, 4, -3.5F, -33.4F, 13.6F, 4, 3, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 168, 80, -2.5F, -33.0F, -7.5F, 2, 2, 7, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 93, 201, -2.5F, -38.6F, 8.5F, 2, 1, 4, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 39, 5, -3.0F, -38.6F, 12.5F, 3, 1, 3, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 53, 88, -3.0F, -39.6F, 14.5F, 3, 1, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 79, 192, -2.5F, -38.6F, 2.5F, 2, 1, 6, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 76, 196, -3.5F, -39.4F, 0.5F, 4, 2, 7, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 166, 193, -3.5F, -39.4F, -6.5F, 4, 2, 7, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 126, 186, -3.5F, -40.4F, -6.3F, 4, 1, 6, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, -1.6F, -17.05F);
		stock.addChild(bone2);
		

		stock_r1 = new ModelRenderer(this);
		stock_r1.setRotationPoint(-1.5F, -39.5F, 16.55F);
		bone2.addChild(stock_r1);
		setRotationAngle(stock_r1, -2.3126F, 0.0F, 0.0F);
		stock_r1.cubeList.add(new ModelBox(stock_r1, 55, 73, -1.5F, -0.5F, 4.0F, 3, 1, 8, 0.0F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(-1.5F, -27.7705F, 12.0186F);
		stock.addChild(cube_r31);
		setRotationAngle(cube_r31, -1.0908F, 0.0F, 0.0F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 25, 57, -0.999F, -1.5F, 3.5F, 2, 2, 5, 0.0F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(-1.5F, -29.1864F, 8.1633F);
		stock.addChild(cube_r32);
		setRotationAngle(cube_r32, -0.6981F, 0.0F, 0.0F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 38, 36, -0.998F, -1.5F, 0.0F, 2, 2, 9, -0.003F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(-1.5F, -29.1864F, 8.1633F);
		stock.addChild(cube_r33);
		setRotationAngle(cube_r33, -0.3927F, 0.0F, 0.0F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 30, 26, -1.0F, -0.7432F, -7.774F, 2, 2, 17, 0.0F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 36, 33, -1.0F, -2.7432F, -2.774F, 2, 2, 12, 0.0F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 41, 37, -1.0F, -4.7432F, 3.226F, 2, 2, 6, 0.0F, false));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(-0.5F, -51.7301F, -9.5581F);
		stock.addChild(cube_r34);
		setRotationAngle(cube_r34, -0.5585F, 0.0F, 0.0F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 180, 87, -2.999F, 6.113F, 8.4865F, 4, 2, 2, -0.002F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 182, 87, -2.999F, 8.113F, 8.4865F, 4, 2, 2, -0.002F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 180, 88, -3.599F, 7.113F, 11.4865F, 5, 1, 1, -0.002F, false));

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(0.625F, -39.7301F, -9.5581F);
		stock.addChild(cube_r35);
		setRotationAngle(cube_r35, -0.6109F, 0.0F, 0.0F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 18, 73, -4.0F, -0.4989F, -1.5F, 2, 1, 4, 0.0F, false));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 108, 74, -2.25F, -0.4999F, -1.5F, 2, 1, 4, 0.0F, false));

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(-1.5F, -37.5F, -2.5F);
		stock.addChild(cube_r36);
		setRotationAngle(cube_r36, -0.1745F, 0.0F, 0.0F);
		cube_r36.cubeList.add(new ModelBox(cube_r36, 122, 200, -2.001F, -3.2677F, 2.6354F, 4, 1, 5, 0.0F, false));
		cube_r36.cubeList.add(new ModelBox(cube_r36, 95, 197, -2.001F, -3.2677F, -2.3646F, 4, 1, 5, 0.0F, false));

		cube_r37 = new ModelRenderer(this);
		cube_r37.setRotationPoint(-1.501F, -20.9224F, 7.5659F);
		stock.addChild(cube_r37);
		setRotationAngle(cube_r37, -0.6109F, 0.0F, 0.0F);
		cube_r37.cubeList.add(new ModelBox(cube_r37, 96, 99, -1.999F, -5.6861F, -13.7218F, 4, 3, 1, 0.0F, false));

		cube_r43 = new ModelRenderer(this);
		cube_r43.setRotationPoint(-1.501F, -27.9224F, 12.5659F);
		stock.addChild(cube_r43);
		cube_r43.cubeList.add(new ModelBox(cube_r43, 134, 53, -1.999F, -3.4972F, -13.8804F, 4, 1, 5, 0.0F, false));

		cube_r38 = new ModelRenderer(this);
		cube_r38.setRotationPoint(-1.5F, -36.8366F, 14.0727F);
		stock.addChild(cube_r38);
		setRotationAngle(cube_r38, 0.3491F, 0.0F, 0.0F);
		cube_r38.cubeList.add(new ModelBox(cube_r38, 172, 133, -1.5F, -2.195F, -0.8746F, 3, 1, 3, 0.0F, false));

		cube_r39 = new ModelRenderer(this);
		cube_r39.setRotationPoint(-1.5F, -33.5747F, 15.459F);
		stock.addChild(cube_r39);
		setRotationAngle(cube_r39, -0.5672F, 0.0F, 0.0F);
		

		cube_r40 = new ModelRenderer(this);
		cube_r40.setRotationPoint(-1.5F, -37.8F, 17.0F);
		stock.addChild(cube_r40);
		setRotationAngle(cube_r40, 0.1309F, 0.0F, 0.0F);
		cube_r40.cubeList.add(new ModelBox(cube_r40, 0, 47, -2.001F, -1.5863F, -1.2912F, 4, 9, 3, 0.0F, false));

		cube_r41 = new ModelRenderer(this);
		cube_r41.setRotationPoint(-1.5F, -29.0F, 17.0F);
		stock.addChild(cube_r41);
		setRotationAngle(cube_r41, -0.0873F, 0.0F, 0.0F);
		cube_r41.cubeList.add(new ModelBox(cube_r41, 94, 56, -2.001F, -0.3046F, 1.6454F, 4, 9, 1, 0.0F, false));

		cube_r42 = new ModelRenderer(this);
		cube_r42.setRotationPoint(-0.2071F, -40.0F, -4.0F);
		stock.addChild(cube_r42);
		setRotationAngle(cube_r42, 0.0F, 0.0F, 0.7854F);
		cube_r42.cubeList.add(new ModelBox(cube_r42, 113, 66, -0.5F, -0.5F, -8.5F, 1, 1, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		stock.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}