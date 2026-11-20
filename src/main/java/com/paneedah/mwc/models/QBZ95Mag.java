package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBZ95Mag extends ModelBase {
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

	public QBZ95Mag() {
		textureWidth = 464;
		textureHeight = 464;

		magazine = new ModelRenderer(this);
		magazine.setRotationPoint(-1.5F, -6.9F, 14.0F);
		magazine.cubeList.add(new ModelBox(magazine, 201, 248, -2.0F, -2.1F, 0.0F, 4, 2, 9, 0.0F, false));

		feedlip = new ModelRenderer(this);
		feedlip.setRotationPoint(1.0F, 30.9F, 1.0F);
		magazine.addChild(feedlip);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.2929F, -32.2929F, 7.0F);
		feedlip.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 163, 426, 0.0F, -1.0F, -5.0F, 1, 1, 6, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.2929F, -32.2929F, 7.0F);
		feedlip.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 148, 426, 0.0F, -1.0F, -5.0F, 1, 1, 6, 0.0F, false));

		segment = new ModelRenderer(this);
		segment.setRotationPoint(1.0F, 1.9F, 1.7F);
		magazine.addChild(segment);
		segment.cubeList.add(new ModelBox(segment, 440, 443, -2.0F, -2.1554F, 6.121F, 2, 1, 1, 0.0F, false));
		segment.cubeList.add(new ModelBox(segment, 376, 414, -3.0F, -2.0F, -1.7F, 4, 1, 8, 0.0F, false));
		segment.cubeList.add(new ModelBox(segment, 114, 418, 0.5F, -2.0F, -1.7F, 1, 1, 8, -0.2F, false));
		segment.cubeList.add(new ModelBox(segment, 419, 183, -3.5F, -2.0F, -1.7F, 1, 1, 8, -0.2F, false));

		segment2 = new ModelRenderer(this);
		segment2.setRotationPoint(0.0F, 1.4F, 6.4F);
		magazine.addChild(segment2);
		setRotationAngle(segment2, -0.0873F, 0.0F, 0.0F);
		segment2.cubeList.add(new ModelBox(segment2, 409, 437, -1.0F, -0.8639F, 1.3547F, 2, 5, 1, 0.0F, false));
		segment2.cubeList.add(new ModelBox(segment2, 199, 403, -2.0F, -0.8119F, -6.4573F, 4, 5, 8, 0.0F, false));
		segment2.cubeList.add(new ModelBox(segment2, 394, 442, -2.5F, -0.4441F, -6.0412F, 1, 4, 1, -0.2F, false));
		segment2.cubeList.add(new ModelBox(segment2, 389, 442, 1.5F, -0.4441F, -6.0412F, 1, 4, 1, -0.2F, false));
		segment2.cubeList.add(new ModelBox(segment2, 152, 440, -2.5F, -0.6969F, -3.1523F, 1, 5, 1, -0.2F, false));
		segment2.cubeList.add(new ModelBox(segment2, 147, 440, 1.5F, -0.6969F, -3.1523F, 1, 5, 1, -0.2F, false));
		segment2.cubeList.add(new ModelBox(segment2, 428, 442, 1.5F, -0.9583F, -0.1637F, 1, 4, 1, -0.2F, false));
		segment2.cubeList.add(new ModelBox(segment2, 423, 442, -2.5F, -0.9583F, -0.1637F, 1, 4, 1, -0.2F, false));

		segment3 = new ModelRenderer(this);
		segment3.setRotationPoint(0.0F, 6.4F, 6.4F);
		magazine.addChild(segment3);
		setRotationAngle(segment3, -0.2182F, 0.0F, 0.0F);
		segment3.cubeList.add(new ModelBox(segment3, 24, 438, -1.0F, -1.0882F, 0.7922F, 2, 5, 1, 0.0F, false));
		segment3.cubeList.add(new ModelBox(segment3, 224, 403, -2.0F, -1.1916F, -7.0231F, 4, 5, 8, 0.0F, false));
		segment3.cubeList.add(new ModelBox(segment3, 419, 213, -2.5F, 0.5024F, -6.9216F, 1, 1, 8, -0.2F, false));
		segment3.cubeList.add(new ModelBox(segment3, 419, 203, 1.5F, 0.5024F, -6.9216F, 1, 1, 8, -0.2F, false));
		segment3.cubeList.add(new ModelBox(segment3, 404, 442, 1.5F, -1.0702F, -6.6405F, 1, 4, 1, -0.2F, false));
		segment3.cubeList.add(new ModelBox(segment3, 399, 442, -2.5F, -1.0702F, -6.6405F, 1, 4, 1, -0.2F, false));
		segment3.cubeList.add(new ModelBox(segment3, 162, 440, 1.5F, -1.6979F, -3.8093F, 1, 5, 1, -0.2F, false));
		segment3.cubeList.add(new ModelBox(segment3, 157, 440, -2.5F, -1.6979F, -3.8093F, 1, 5, 1, -0.2F, false));
		segment3.cubeList.add(new ModelBox(segment3, 340, 439, 1.5F, -2.3472F, -0.8804F, 1, 6, 1, -0.2F, false));
		segment3.cubeList.add(new ModelBox(segment3, 18, 439, -2.5F, -2.3472F, -0.8804F, 1, 6, 1, -0.2F, false));

		segment4 = new ModelRenderer(this);
		segment4.setRotationPoint(0.0F, 12.4F, 6.4F);
		magazine.addChild(segment4);
		setRotationAngle(segment4, -0.2618F, 0.0F, 0.0F);
		segment4.cubeList.add(new ModelBox(segment4, 167, 440, 1.5F, -2.5425F, -2.2826F, 1, 5, 1, -0.2F, false));
		segment4.cubeList.add(new ModelBox(segment4, 172, 440, 1.5F, -2.7651F, -5.224F, 1, 5, 1, -0.2F, false));
		segment4.cubeList.add(new ModelBox(segment4, 419, 223, 1.5F, 0.307F, -8.6239F, 1, 1, 8, -0.2F, false));
		segment4.cubeList.add(new ModelBox(segment4, 440, 175, 1.5F, -3.0136F, -8.0688F, 1, 5, 1, -0.2F, false));
		segment4.cubeList.add(new ModelBox(segment4, 177, 440, -2.5F, -2.5425F, -2.2826F, 1, 5, 1, -0.2F, false));
		segment4.cubeList.add(new ModelBox(segment4, 421, 306, -2.5F, 0.307F, -8.6239F, 1, 1, 8, -0.2F, false));
		segment4.cubeList.add(new ModelBox(segment4, 182, 440, -2.5F, -2.7651F, -5.224F, 1, 5, 1, -0.2F, false));
		segment4.cubeList.add(new ModelBox(segment4, 187, 440, -2.5F, -3.0136F, -8.0688F, 1, 5, 1, -0.2F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(1.0F, -0.7818F, -7.5557F);
		segment4.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.0873F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 125, 404, -3.0F, -2.0F, -1.0F, 4, 5, 8, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(1.0F, 1.0113F, -6.7508F);
		segment4.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 31, 438, -2.0F, -3.5896F, 5.8724F, 2, 5, 1, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(1.0F, 5.0324F, -7.5139F);
		segment4.addChild(bone3);
		setRotationAngle(bone3, -0.2182F, 0.0F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 407, 370, -3.0F, -3.6067F, -1.9675F, 4, 5, 8, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 38, 438, -2.0F, -3.5896F, 5.8724F, 2, 5, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 155, 347, -3.0F, 1.2932F, -2.2675F, 4, 1, 9, 0.1F, false));
		bone3.cubeList.add(new ModelBox(bone3, 192, 440, 0.5F, -4.2146F, 4.4877F, 1, 5, 1, -0.2F, false));
		bone3.cubeList.add(new ModelBox(bone3, 421, 316, 0.5F, 0.135F, -1.9535F, 1, 1, 8, -0.2F, false));
		bone3.cubeList.add(new ModelBox(bone3, 197, 440, 0.5F, -3.7952F, 1.5679F, 1, 5, 1, -0.2F, false));
		bone3.cubeList.add(new ModelBox(bone3, 249, 411, 0.5F, -3.4221F, -1.2633F, 1, 4, 1, -0.2F, false));
		bone3.cubeList.add(new ModelBox(bone3, 214, 440, -3.5F, -4.2146F, 4.4877F, 1, 5, 1, -0.2F, false));
		bone3.cubeList.add(new ModelBox(bone3, 421, 326, -3.5F, 0.135F, -1.9535F, 1, 1, 8, -0.2F, false));
		bone3.cubeList.add(new ModelBox(bone3, 219, 440, -3.5F, -3.7952F, 1.5679F, 1, 5, 1, -0.2F, false));
		bone3.cubeList.add(new ModelBox(bone3, 440, 260, -3.5F, -3.4221F, -1.2633F, 1, 4, 1, -0.2F, false));
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