package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AEK971SStock extends ModelBase {
	private final ModelRenderer stockS;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;

	public AEK971SStock() {
		textureWidth = 416;
		textureHeight = 416;

		stockS = new ModelRenderer(this);
		stockS.setRotationPoint(0.0F, 24.0F, 2.0F);
		stockS.cubeList.add(new ModelBox(stockS, 332, 66, 0.0F, -34.0F, -1.0F, 1, 1, 26, 0.0F, false));
		stockS.cubeList.add(new ModelBox(stockS, 332, 93, -4.0F, -34.0F, -1.0F, 1, 1, 26, 0.0F, false));
		stockS.cubeList.add(new ModelBox(stockS, 400, 62, 0.35F, -34.0F, 23.5F, 1, 1, 2, -0.1F, false));
		stockS.cubeList.add(new ModelBox(stockS, 56, 400, -4.35F, -34.0F, 23.5F, 1, 1, 2, -0.1F, false));
		stockS.cubeList.add(new ModelBox(stockS, 386, 315, -3.7843F, -34.5657F, 23.5F, 4, 2, 2, -0.1F, false));
		stockS.cubeList.add(new ModelBox(stockS, 196, 42, -3.7843F, -33.4343F, 23.5F, 4, 1, 2, -0.1F, false));
		stockS.cubeList.add(new ModelBox(stockS, 400, 137, -0.2157F, -33.4343F, 23.5F, 1, 1, 2, -0.1F, false));
		stockS.cubeList.add(new ModelBox(stockS, 166, 398, -0.2157F, -34.5657F, 23.5F, 1, 2, 2, -0.1F, false));
		stockS.cubeList.add(new ModelBox(stockS, 386, 111, -3.5F, -34.475F, 25.4F, 4, 2, 5, 0.0F, false));
		stockS.cubeList.add(new ModelBox(stockS, 168, 182, -3.5F, -32.475F, 28.401F, 4, 9, 2, 0.0F, false));
		stockS.cubeList.add(new ModelBox(stockS, 62, 300, 0.5F, -31.275F, 28.401F, 1, 5, 2, 0.0F, false));
		stockS.cubeList.add(new ModelBox(stockS, 62, 307, -4.5F, -31.275F, 28.401F, 1, 5, 2, 0.0F, false));
		stockS.cubeList.add(new ModelBox(stockS, 208, 42, -3.5F, -24.0304F, 28.4F, 4, 1, 2, 0.0F, false));
		stockS.cubeList.add(new ModelBox(stockS, 400, 229, -2.5F, -24.0304F, 26.4F, 2, 1, 1, 0.0F, false));
		stockS.cubeList.add(new ModelBox(stockS, 248, 258, -2.0F, -32.592F, 27.5044F, 1, 9, 1, 0.0F, false));
		stockS.cubeList.add(new ModelBox(stockS, 172, 398, -3.0F, -24.0304F, 27.4F, 3, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-4.5267F, -27.9493F, 28.9F);
		stockS.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.3054F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 152, 277, -0.5F, -1.0F, -0.5F, 1, 6, 2, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(1.5267F, -27.9493F, 28.9F);
		stockS.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.3054F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 152, 285, -0.5F, -1.0F, -0.5F, 1, 6, 2, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-3.3239F, -33.3709F, 28.9F);
		stockS.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.3054F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 152, 269, -0.5F, -1.0F, -0.5F, 1, 6, 2, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.3239F, -33.3709F, 28.9F);
		stockS.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.3054F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 152, 261, -0.5F, -1.0F, -0.5F, 1, 6, 2, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-1.5F, -25.092F, 27.3044F);
		stockS.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.3054F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 404, 111, -0.5F, -8.2F, 0.5F, 1, 1, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 222, 401, -0.5F, -3.0F, 0.5F, 1, 2, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 334, 350, -0.5F, -8.0F, 1.5F, 1, 4, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 224, 293, -0.5F, -8.0F, -0.5F, 1, 9, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.5F, -24.092F, 27.1044F);
		stockS.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.6981F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 110, 404, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(2.6797F, -26.736F, 53.5F);
		stockS.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 400, 53, -0.5F, -9.5F, -30.0F, 1, 1, 2, -0.1F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(2.6797F, -27.536F, 53.5F);
		stockS.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.7854F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 400, 56, -0.5F, -9.5F, -30.0F, 1, 1, 2, -0.1F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.6843F, -33.1F, 53.5F);
		stockS.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.7854F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 400, 59, -0.5F, -0.5F, -30.0F, 1, 1, 2, -0.1F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.6843F, -33.9F, 53.5F);
		stockS.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.7854F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 400, 134, -0.5F, -0.5F, -30.0F, 1, 1, 2, -0.1F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		stockS.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}