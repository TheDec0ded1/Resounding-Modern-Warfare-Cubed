package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBZ03_Magazine extends ModelBase {
	private final ModelRenderer magazine;
	private final ModelRenderer feedlip;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer segment;
	private final ModelRenderer segment2;
	private final ModelRenderer segment3;
	private final ModelRenderer segment4;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer bone3;

	public QBZ03_Magazine() {
		textureWidth = 416;
		textureHeight = 416;

		magazine = new ModelRenderer(this);
		magazine.setRotationPoint(-1.5F, -8.4F, -24.0F);
		magazine.cubeList.add(new ModelBox(magazine, 344, 218, -2.0F, -2.1F, 0.0F, 4, 2, 9, 0.0F, false));

		feedlip = new ModelRenderer(this);
		feedlip.setRotationPoint(1.0F, 30.9F, 1.0F);
		magazine.addChild(feedlip);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.2929F, -32.2929F, 7.0F);
		feedlip.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 377, 319, 0.0F, -1.0F, -5.0F, 1, 1, 6, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.2929F, -32.2929F, 7.0F);
		feedlip.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 311, 382, 0.0F, -1.0F, -5.0F, 1, 1, 6, 0.0F, false));

		segment = new ModelRenderer(this);
		segment.setRotationPoint(1.0F, 1.9F, 1.7F);
		magazine.addChild(segment);
		segment.cubeList.add(new ModelBox(segment, 210, 395, -2.0F, -2.1554F, 6.121F, 2, 1, 1, 0.0F, false));
		segment.cubeList.add(new ModelBox(segment, 348, 181, -3.0F, -2.0F, -1.7F, 4, 1, 8, 0.0F, false));
		segment.cubeList.add(new ModelBox(segment, 373, 181, 0.5F, -2.0F, -1.7F, 1, 1, 8, -0.2F, false));
		segment.cubeList.add(new ModelBox(segment, 332, 376, -3.5F, -2.0F, -1.7F, 1, 1, 8, -0.2F, false));

		segment2 = new ModelRenderer(this);
		segment2.setRotationPoint(0.0F, 1.4F, 6.4F);
		magazine.addChild(segment2);
		setRotationAngle(segment2, -0.0873F, 0.0F, 0.0F);
		segment2.cubeList.add(new ModelBox(segment2, 355, 388, -1.0F, -0.8639F, 1.3547F, 2, 5, 1, 0.0F, false));
		segment2.cubeList.add(new ModelBox(segment2, 358, 291, -2.0F, -0.8119F, -6.4573F, 4, 5, 8, 0.0F, false));
		segment2.cubeList.add(new ModelBox(segment2, 82, 392, -2.5F, -0.4441F, -6.0412F, 1, 4, 1, -0.2F, false));
		segment2.cubeList.add(new ModelBox(segment2, 150, 392, 1.5F, -0.4441F, -6.0412F, 1, 4, 1, -0.2F, false));
		segment2.cubeList.add(new ModelBox(segment2, 103, 390, -2.5F, -0.6969F, -3.1523F, 1, 5, 1, -0.2F, false));
		segment2.cubeList.add(new ModelBox(segment2, 108, 390, 1.5F, -0.6969F, -3.1523F, 1, 5, 1, -0.2F, false));
		segment2.cubeList.add(new ModelBox(segment2, 155, 392, 1.5F, -0.9583F, -0.1637F, 1, 4, 1, -0.2F, false));
		segment2.cubeList.add(new ModelBox(segment2, 160, 392, -2.5F, -0.9583F, -0.1637F, 1, 4, 1, -0.2F, false));

		segment3 = new ModelRenderer(this);
		segment3.setRotationPoint(0.0F, 6.4F, 6.4F);
		magazine.addChild(segment3);
		setRotationAngle(segment3, -0.2182F, 0.0F, 0.0F);
		segment3.cubeList.add(new ModelBox(segment3, 383, 388, -1.0F, -1.0882F, 0.7922F, 2, 5, 1, 0.0F, false));
		segment3.cubeList.add(new ModelBox(segment3, 358, 305, -2.0F, -1.1916F, -7.0231F, 4, 5, 8, 0.0F, false));
		segment3.cubeList.add(new ModelBox(segment3, 379, 124, -2.5F, 0.5024F, -6.9216F, 1, 1, 8, -0.2F, false));
		segment3.cubeList.add(new ModelBox(segment3, 381, 134, 1.5F, 0.5024F, -6.9216F, 1, 1, 8, -0.2F, false));
		segment3.cubeList.add(new ModelBox(segment3, 165, 392, 1.5F, -1.0702F, -6.6406F, 1, 4, 1, -0.2F, false));
		segment3.cubeList.add(new ModelBox(segment3, 392, 181, -2.5F, -1.0702F, -6.6406F, 1, 4, 1, -0.2F, false));
		segment3.cubeList.add(new ModelBox(segment3, 113, 390, 1.5F, -1.6979F, -3.8093F, 1, 5, 1, -0.2F, false));
		segment3.cubeList.add(new ModelBox(segment3, 118, 390, -2.5F, -1.6979F, -3.8093F, 1, 5, 1, -0.2F, false));
		segment3.cubeList.add(new ModelBox(segment3, 362, 388, 1.5F, -2.3472F, -0.8804F, 1, 6, 1, -0.2F, false));
		segment3.cubeList.add(new ModelBox(segment3, 138, 389, -2.5F, -2.3472F, -0.8804F, 1, 6, 1, -0.2F, false));

		segment4 = new ModelRenderer(this);
		segment4.setRotationPoint(0.0F, 12.4F, 6.4F);
		magazine.addChild(segment4);
		setRotationAngle(segment4, -0.2618F, 0.0F, 0.0F);
		segment4.cubeList.add(new ModelBox(segment4, 123, 390, 1.5F, -2.5425F, -2.2826F, 1, 5, 1, -0.2F, false));
		segment4.cubeList.add(new ModelBox(segment4, 390, 229, 1.5F, -2.7651F, -5.224F, 1, 5, 1, -0.2F, false));
		segment4.cubeList.add(new ModelBox(segment4, 381, 144, 1.5F, 0.307F, -8.6239F, 1, 1, 8, -0.2F, false));
		segment4.cubeList.add(new ModelBox(segment4, 390, 236, 1.5F, -3.0136F, -8.0688F, 1, 5, 1, -0.2F, false));
		segment4.cubeList.add(new ModelBox(segment4, 390, 243, -2.5F, -2.5425F, -2.2826F, 1, 5, 1, -0.2F, false));
		segment4.cubeList.add(new ModelBox(segment4, 190, 381, -2.5F, 0.307F, -8.6239F, 1, 1, 8, -0.2F, false));
		segment4.cubeList.add(new ModelBox(segment4, 390, 250, -2.5F, -2.7651F, -5.224F, 1, 5, 1, -0.2F, false));
		segment4.cubeList.add(new ModelBox(segment4, 258, 390, -2.5F, -3.0136F, -8.0688F, 1, 5, 1, -0.2F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(1.0F, -0.7819F, -7.5557F);
		segment4.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.0873F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 364, 355, -3.0F, -2.0F, -1.0F, 4, 5, 8, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(1.0F, 1.0113F, -6.7508F);
		segment4.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 389, 20, -2.0F, -3.5896F, 5.8724F, 2, 5, 1, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(1.0F, 5.0324F, -7.5139F);
		segment4.addChild(bone3);
		setRotationAngle(bone3, -0.2182F, 0.0F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 165, 368, -3.0F, -3.6067F, -1.9675F, 4, 5, 8, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 389, 27, -2.0F, -3.5896F, 5.8724F, 2, 5, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 295, 28, -3.0F, 1.2933F, -2.2675F, 4, 1, 9, 0.1F, false));
		bone3.cubeList.add(new ModelBox(bone3, 263, 390, 0.5F, -4.2146F, 4.4877F, 1, 5, 1, -0.2F, false));
		bone3.cubeList.add(new ModelBox(bone3, 209, 381, 0.5F, 0.135F, -1.9535F, 1, 1, 8, -0.2F, false));
		bone3.cubeList.add(new ModelBox(bone3, 268, 390, 0.5F, -3.7952F, 1.5679F, 1, 5, 1, -0.2F, false));
		bone3.cubeList.add(new ModelBox(bone3, 392, 218, 0.5F, -3.4221F, -1.2633F, 1, 4, 1, -0.2F, false));
		bone3.cubeList.add(new ModelBox(bone3, 273, 390, -3.5F, -4.2146F, 4.4877F, 1, 5, 1, -0.2F, false));
		bone3.cubeList.add(new ModelBox(bone3, 25, 382, -3.5F, 0.135F, -1.9535F, 1, 1, 8, -0.2F, false));
		bone3.cubeList.add(new ModelBox(bone3, 278, 390, -3.5F, -3.7952F, 1.5679F, 1, 5, 1, -0.2F, false));
		bone3.cubeList.add(new ModelBox(bone3, 283, 392, -3.5F, -3.4221F, -1.2633F, 1, 4, 1, -0.2F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		magazine.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}