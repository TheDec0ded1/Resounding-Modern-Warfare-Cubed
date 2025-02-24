package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class MiniUziStock extends ModelBase {
	private final ModelRenderer Stock;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer Stock2;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;

	public MiniUziStock() {
		textureWidth = 256;
		textureHeight = 256;

		Stock = new ModelRenderer(this);
		Stock.setRotationPoint(3.4F, 29.9F, -6.6F);
		Stock.cubeList.add(new ModelBox(Stock, 174, 206, -7.8586F, -44.0F, 16.4243F, 1, 4, 1, -0.1F, false));
		Stock.cubeList.add(new ModelBox(Stock, 40, 207, -7.2929F, -44.0F, 15.8586F, 1, 4, 1, -0.1F, false));
		Stock.cubeList.add(new ModelBox(Stock, 40, 200, -6.7272F, -44.0F, 15.4243F, 1, 4, 2, -0.1F, false));
		Stock.cubeList.add(new ModelBox(Stock, 88, 207, -7.2929F, -44.0F, 16.9899F, 1, 4, 1, -0.1F, false));
		Stock.cubeList.add(new ModelBox(Stock, 180, 200, -7.2929F, -43.9F, 16.3899F, 1, 6, 1, 0.1F, false));
		Stock.cubeList.add(new ModelBox(Stock, 47, 198, -7.0F, -43.1F, 16.0F, 3, 3, 2, 0.0F, false));
		Stock.cubeList.add(new ModelBox(Stock, 130, 199, -6.0F, -43.1F, 18.0F, 2, 3, 2, 0.0F, false));
		Stock.cubeList.add(new ModelBox(Stock, 51, 183, -6.5F, -38.1F, 46.0F, 3, 12, 2, 0.0F, false));
		Stock.cubeList.add(new ModelBox(Stock, 106, 23, -6.5F, -26.1F, 46.0F, 3, 1, 1, 0.0F, false));
		Stock.cubeList.add(new ModelBox(Stock, 211, 211, -5.2071F, -25.3929F, 46.0F, 1, 1, 1, 0.0F, false));
		Stock.cubeList.add(new ModelBox(Stock, 50, 212, -5.7929F, -25.3929F, 46.0F, 1, 1, 1, 0.0F, false));
		Stock.cubeList.add(new ModelBox(Stock, 207, 119, -5.7929F, -38.8071F, 46.0F, 1, 1, 2, 0.0F, false));
		Stock.cubeList.add(new ModelBox(Stock, 207, 115, -5.2071F, -38.8071F, 46.0F, 1, 1, 2, 0.0F, false));
		Stock.cubeList.add(new ModelBox(Stock, 113, 212, -5.7929F, -26.3929F, 47.0F, 1, 1, 1, 0.0F, false));
		Stock.cubeList.add(new ModelBox(Stock, 60, 212, -5.2071F, -26.3929F, 47.0F, 1, 1, 1, 0.0F, false));
		Stock.cubeList.add(new ModelBox(Stock, 206, 30, -5.5F, -42.6F, 19.2F, 1, 2, 2, 0.0F, false));
		Stock.cubeList.add(new ModelBox(Stock, 200, 132, -6.0F, -43.3F, 19.6F, 2, 2, 2, -0.4F, false));
		Stock.cubeList.add(new ModelBox(Stock, 200, 137, -6.0F, -41.9F, 19.6F, 2, 2, 2, -0.4F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-5.0F, -40.1935F, 18.2884F);
		Stock.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 84, 107, -1.0F, -1.7104F, 11.9701F, 2, 2, 18, -0.4F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-5.0F, -40.1882F, 18.1664F);
		Stock.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.1309F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 43, 107, -1.0F, -0.3436F, 12.2731F, 2, 2, 18, -0.4F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-5.0F, -40.103F, 18.6968F);
		Stock.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.1309F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 126, -0.5F, -1.0104F, 12.0701F, 1, 2, 17, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-5.0F, -39.9573F, 26.1753F);
		Stock.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.3054F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 95, 158, -0.5F, -1.0104F, -6.1299F, 1, 2, 11, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 29, 158, -1.0F, -1.7104F, -6.0299F, 2, 2, 11, -0.4F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-5.0F, -39.952F, 26.2973F);
		Stock.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.3054F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 155, 157, -1.0F, -0.3436F, -5.7269F, 2, 2, 11, -0.4F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-0.6716F, -22.5645F, 48.0F);
		Stock.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 55, 212, -0.5F, -5.5F, -1.0F, 1, 1, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-0.136F, -20.4431F, 48.0F);
		Stock.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 118, 212, -0.5F, -8.5F, -1.0F, 1, 1, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-0.6716F, -21.5645F, 47.0F);
		Stock.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 108, 211, -0.5F, -5.5F, -1.0F, 1, 1, 1, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-0.136F, -19.4431F, 47.0F);
		Stock.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.7854F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 211, 208, -0.5F, -8.5F, -1.0F, 1, 1, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-3.6716F, -35.9787F, 47.0F);
		Stock.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.7854F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 107, 207, -0.5F, -3.5F, -1.0F, 1, 1, 2, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-4.2071F, -38.1F, 47.0F);
		Stock.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.7854F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 100, 207, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-6.3929F, -43.0F, 17.3243F);
		Stock.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, -0.7854F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 99, 182, -0.5F, -1.0F, -0.5F, 1, 4, 1, -0.1F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-7.1929F, -43.0F, 17.3243F);
		Stock.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, -0.7854F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 119, 203, -0.5F, -1.0F, -0.5F, 1, 4, 1, -0.1F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-7.1929F, -43.0F, 16.5243F);
		Stock.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, -0.7854F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 207, -0.5F, -1.0F, -0.5F, 1, 4, 1, -0.1F, false));

		Stock2 = new ModelRenderer(this);
		Stock2.setRotationPoint(0.0F, 1.2F, 0.0F);
		Stock.addChild(Stock2);
		Stock2.cubeList.add(new ModelBox(Stock2, 123, 212, -7.8586F, -41.0F, 16.4243F, 1, 1, 1, -0.1F, false));
		Stock2.cubeList.add(new ModelBox(Stock2, 144, 212, -7.2929F, -41.0F, 15.8586F, 1, 1, 1, -0.1F, false));
		Stock2.cubeList.add(new ModelBox(Stock2, 93, 207, -6.7272F, -41.0F, 15.4243F, 1, 1, 2, -0.1F, false));
		Stock2.cubeList.add(new ModelBox(Stock2, 149, 212, -7.2929F, -41.0F, 16.9899F, 1, 1, 1, -0.1F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-6.3929F, -43.0F, 17.3243F);
		Stock2.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, -0.7854F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 56, 158, -0.5F, 2.0F, -0.5F, 1, 1, 1, -0.1F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-7.1929F, -43.0F, 17.3243F);
		Stock2.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, -0.7854F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 61, 158, -0.5F, 2.0F, -0.5F, 1, 1, 1, -0.1F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-7.1929F, -43.0F, 16.5243F);
		Stock2.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, -0.7854F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 212, 129, -0.5F, 2.0F, -0.5F, 1, 1, 1, -0.1F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Stock.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}