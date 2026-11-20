package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBZ95BMag extends ModelBase {
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

	public QBZ95BMag() {
		textureWidth = 384;
		textureHeight = 384;

		magazine = new ModelRenderer(this);
		magazine.setRotationPoint(-1.5F, -6.9F, 14.0F);
		magazine.cubeList.add(new ModelBox(magazine, 323, 217, -2.0F, -2.1F, 0.0F, 4, 2, 9, 0.0F, false));

		feedlip = new ModelRenderer(this);
		feedlip.setRotationPoint(1.0F, 30.9F, 1.0F);
		magazine.addChild(feedlip);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.2929F, -32.2929F, 7.0F);
		feedlip.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 232, 350, 0.0F, -1.0F, -5.0F, 1, 1, 6, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.2929F, -32.2929F, 7.0F);
		feedlip.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 350, 223, 0.0F, -1.0F, -5.0F, 1, 1, 6, 0.0F, false));

		segment = new ModelRenderer(this);
		segment.setRotationPoint(1.0F, 1.9F, 1.7F);
		magazine.addChild(segment);
		segment.cubeList.add(new ModelBox(segment, 373, 326, -2.0F, -2.1554F, 6.121F, 2, 1, 1, 0.0F, false));
		segment.cubeList.add(new ModelBox(segment, 333, 137, -3.0F, -2.0F, -1.7F, 4, 1, 8, 0.0F, false));
		segment.cubeList.add(new ModelBox(segment, 124, 340, 0.5F, -2.0F, -1.7F, 1, 1, 8, -0.2F, false));
		segment.cubeList.add(new ModelBox(segment, 143, 340, -3.5F, -2.0F, -1.7F, 1, 1, 8, -0.2F, false));

		segment2 = new ModelRenderer(this);
		segment2.setRotationPoint(0.0F, 1.4F, 6.4F);
		magazine.addChild(segment2);
		setRotationAngle(segment2, -0.0873F, 0.0F, 0.0F);
		segment2.cubeList.add(new ModelBox(segment2, 126, 238, -1.0F, -0.8639F, 1.3547F, 2, 5, 1, 0.0F, false));
		segment2.cubeList.add(new ModelBox(segment2, 323, 203, -2.0F, -0.8119F, -6.4573F, 4, 5, 8, 0.0F, false));
		segment2.cubeList.add(new ModelBox(segment2, 371, 49, -2.5F, -0.4441F, -6.0412F, 1, 4, 1, -0.2F, false));
		segment2.cubeList.add(new ModelBox(segment2, 371, 55, 1.5F, -0.4441F, -6.0412F, 1, 4, 1, -0.2F, false));
		segment2.cubeList.add(new ModelBox(segment2, 57, 285, -2.5F, -0.6969F, -3.1523F, 1, 5, 1, -0.2F, false));
		segment2.cubeList.add(new ModelBox(segment2, 32, 367, 1.5F, -0.6969F, -3.1523F, 1, 5, 1, -0.2F, false));
		segment2.cubeList.add(new ModelBox(segment2, 371, 61, 1.5F, -0.9583F, -0.1637F, 1, 4, 1, -0.2F, false));
		segment2.cubeList.add(new ModelBox(segment2, 371, 139, -2.5F, -0.9583F, -0.1637F, 1, 4, 1, -0.2F, false));

		segment3 = new ModelRenderer(this);
		segment3.setRotationPoint(0.0F, 6.4F, 6.4F);
		magazine.addChild(segment3);
		setRotationAngle(segment3, -0.2182F, 0.0F, 0.0F);
		segment3.cubeList.add(new ModelBox(segment3, 284, 100, -1.0F, -1.0882F, 0.7922F, 2, 5, 1, 0.0F, false));
		segment3.cubeList.add(new ModelBox(segment3, 256, 324, -2.0F, -1.1916F, -7.0231F, 4, 5, 8, 0.0F, false));
		segment3.cubeList.add(new ModelBox(segment3, 181, 340, -2.5F, 0.5024F, -6.9216F, 1, 1, 8, -0.2F, false));
		segment3.cubeList.add(new ModelBox(segment3, 232, 340, 1.5F, 0.5024F, -6.9216F, 1, 1, 8, -0.2F, false));
		segment3.cubeList.add(new ModelBox(segment3, 252, 371, 1.5F, -1.0702F, -6.6405F, 1, 4, 1, -0.2F, false));
		segment3.cubeList.add(new ModelBox(segment3, 257, 371, -2.5F, -1.0702F, -6.6405F, 1, 4, 1, -0.2F, false));
		segment3.cubeList.add(new ModelBox(segment3, 134, 367, 1.5F, -1.6979F, -3.8093F, 1, 5, 1, -0.2F, false));
		segment3.cubeList.add(new ModelBox(segment3, 341, 367, -2.5F, -1.6979F, -3.8093F, 1, 5, 1, -0.2F, false));
		segment3.cubeList.add(new ModelBox(segment3, 336, 364, 1.5F, -2.3472F, -0.8804F, 1, 6, 1, -0.2F, false));
		segment3.cubeList.add(new ModelBox(segment3, 167, 365, -2.5F, -2.3472F, -0.8804F, 1, 6, 1, -0.2F, false));

		segment4 = new ModelRenderer(this);
		segment4.setRotationPoint(0.0F, 12.4F, 6.4F);
		magazine.addChild(segment4);
		setRotationAngle(segment4, -0.2618F, 0.0F, 0.0F);
		segment4.cubeList.add(new ModelBox(segment4, 346, 367, 1.5F, -2.5425F, -2.2826F, 1, 5, 1, -0.2F, false));
		segment4.cubeList.add(new ModelBox(segment4, 367, 365, 1.5F, -2.7651F, -5.224F, 1, 5, 1, -0.2F, false));
		segment4.cubeList.add(new ModelBox(segment4, 77, 341, 1.5F, 0.307F, -8.6239F, 1, 1, 8, -0.2F, false));
		segment4.cubeList.add(new ModelBox(segment4, 9, 368, 1.5F, -3.0136F, -8.0688F, 1, 5, 1, -0.2F, false));
		segment4.cubeList.add(new ModelBox(segment4, 14, 368, -2.5F, -2.5425F, -2.2826F, 1, 5, 1, -0.2F, false));
		segment4.cubeList.add(new ModelBox(segment4, 200, 341, -2.5F, 0.307F, -8.6239F, 1, 1, 8, -0.2F, false));
		segment4.cubeList.add(new ModelBox(segment4, 368, 273, -2.5F, -2.7651F, -5.224F, 1, 5, 1, -0.2F, false));
		segment4.cubeList.add(new ModelBox(segment4, 368, 280, -2.5F, -3.0136F, -8.0688F, 1, 5, 1, -0.2F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(1.0F, -0.7818F, -7.5557F);
		segment4.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.0873F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 325, 166, -3.0F, -2.0F, -1.0F, 4, 5, 8, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(1.0F, 1.0113F, -6.7508F);
		segment4.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 281, 324, -2.0F, -3.5896F, 5.8724F, 2, 5, 1, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(1.0F, 5.0324F, -7.5139F);
		segment4.addChild(bone3);
		setRotationAngle(bone3, -0.2182F, 0.0F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 80, 327, -3.0F, -3.6067F, -1.9675F, 4, 5, 8, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 281, 331, -2.0F, -3.5896F, 5.8724F, 2, 5, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 325, 192, -3.0F, 1.2932F, -2.2675F, 4, 1, 9, 0.1F, false));
		bone3.cubeList.add(new ModelBox(bone3, 368, 287, 0.5F, -4.2146F, 4.4877F, 1, 5, 1, -0.2F, false));
		bone3.cubeList.add(new ModelBox(bone3, 272, 341, 0.5F, 0.135F, -1.9535F, 1, 1, 8, -0.2F, false));
		bone3.cubeList.add(new ModelBox(bone3, 368, 294, 0.5F, -3.7952F, 1.5679F, 1, 5, 1, -0.2F, false));
		bone3.cubeList.add(new ModelBox(bone3, 368, 359, 0.5F, -3.4221F, -1.2633F, 1, 4, 1, -0.2F, false));
		bone3.cubeList.add(new ModelBox(bone3, 369, 0, -3.5F, -4.2146F, 4.4877F, 1, 5, 1, -0.2F, false));
		bone3.cubeList.add(new ModelBox(bone3, 291, 341, -3.5F, 0.135F, -1.9535F, 1, 1, 8, -0.2F, false));
		bone3.cubeList.add(new ModelBox(bone3, 369, 7, -3.5F, -3.7952F, 1.5679F, 1, 5, 1, -0.2F, false));
		bone3.cubeList.add(new ModelBox(bone3, 369, 14, -3.5F, -3.4221F, -1.2633F, 1, 4, 1, -0.2F, false));
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