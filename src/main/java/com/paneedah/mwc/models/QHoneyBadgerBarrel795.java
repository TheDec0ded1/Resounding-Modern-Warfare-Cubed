package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QHoneyBadgerBarrel795 extends ModelBase {
	private final ModelRenderer barrel795;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer flashider2;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer mk12gasblock2;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;

	public QHoneyBadgerBarrel795() {
		textureWidth = 400;
		textureHeight = 400;

		barrel795 = new ModelRenderer(this);
		barrel795.setRotationPoint(-1.5F, -13.8929F, -39.501F);
		barrel795.cubeList.add(new ModelBox(barrel795, 90, 320, -0.5F, -1.2071F, -1.5F, 1, 1, 20, -0.1F, false));
		barrel795.cubeList.add(new ModelBox(barrel795, 226, 28, -0.5F, -2.5071F, 10.5F, 1, 1, 8, -0.2F, false));
		barrel795.cubeList.add(new ModelBox(barrel795, 0, 321, -1.0657F, -0.6414F, -1.5F, 1, 1, 20, -0.1F, false));
		barrel795.cubeList.add(new ModelBox(barrel795, 42, 321, 0.0657F, -0.6414F, -1.5F, 1, 1, 20, -0.1F, false));
		barrel795.cubeList.add(new ModelBox(barrel795, 326, 95, -0.5F, -0.0757F, -1.5F, 1, 1, 20, -0.1F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.0142F, 1.6728F, 0.0F);
		barrel795.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 326, 116, -0.5F, -2.5F, -1.5F, 1, 1, 20, -0.1F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-1.0142F, -1.1556F, 0.0F);
		barrel795.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 326, 44, -0.5F, 1.5F, -1.5F, 1, 1, 20, -0.1F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(1.0142F, 0.8728F, 0.0F);
		barrel795.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.7854F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 326, 23, -0.5F, -2.5F, -1.5F, 1, 1, 20, -0.1F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-1.0142F, -1.9556F, 0.0F);
		barrel795.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.7854F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 322, 74, -0.5F, 1.5F, -1.5F, 1, 1, 20, -0.1F, false));

		flashider2 = new ModelRenderer(this);
		flashider2.setRotationPoint(-0.5F, 0.3F, -17.749F);
		barrel795.addChild(flashider2);
		flashider2.cubeList.add(new ModelBox(flashider2, 290, 332, 0.0F, -0.2929F, 11.5F, 1, 1, 5, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 342, 156, -0.7071F, -1.0F, 11.5F, 1, 1, 5, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 348, 308, 0.0F, -1.7071F, 11.5F, 1, 1, 5, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 68, 349, 0.7071F, -1.0F, 11.5F, 1, 1, 5, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(1.0F, 0.0F, 15.0F);
		flashider2.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.7854F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 52, 359, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(1.0F, -1.0F, 15.0F);
		flashider2.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, -0.7854F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 118, 348, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.0F, -1.0F, 15.0F);
		flashider2.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, -0.7854F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 166, 347, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.0F, 0.0F, 15.0F);
		flashider2.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, -0.7854F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 248, 179, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		mk12gasblock2 = new ModelRenderer(this);
		mk12gasblock2.setRotationPoint(1.5F, 37.8929F, 40.501F);
		barrel795.addChild(mk12gasblock2);
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 128, 376, -1.2929F, -38.5929F, -32.0F, 1, 1, 3, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 372, 308, -2.0F, -40.3F, -32.0F, 1, 2, 3, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 376, 268, -2.7071F, -38.5929F, -32.0F, 1, 1, 3, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 0, 377, -2.0F, -37.8858F, -32.0F, 1, 1, 3, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-2.0F, -37.5929F, -29.5F);
		mk12gasblock2.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, -0.7854F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 8, 377, -0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-1.0F, -37.5929F, -29.5F);
		mk12gasblock2.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, -0.7854F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 376, 264, -0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-2.0F, -38.5929F, -29.5F);
		mk12gasblock2.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, -0.7854F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 154, 376, -0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-1.0F, -38.5929F, -29.5F);
		mk12gasblock2.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, -0.7854F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 376, 150, -0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		barrel795.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}