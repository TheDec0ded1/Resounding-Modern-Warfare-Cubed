package com.paneedah.mwc.models;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBZ191Magazine extends ModelBase {
	private final ModelRenderer magazine;
	private final ModelRenderer feedlip;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer segment;
	private final ModelRenderer segment_r1;
	private final ModelRenderer segment_r2;
	private final ModelRenderer segment_r3;
	private final ModelRenderer segment_r4;
	private final ModelRenderer segment_r5;
	private final ModelRenderer segment_r6;
	private final ModelRenderer segment_r7;
	private final ModelRenderer segment_r8;
	private final ModelRenderer segment_r9;
	private final ModelRenderer segment_r10;
	private final ModelRenderer segment_r11;
	private final ModelRenderer segment2;
	private final ModelRenderer segment3;
	private final ModelRenderer segment4;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5_r1;
	private final ModelRenderer bone4_r1;

	public QBZ191Magazine() {
		textureWidth = 400;
		textureHeight = 400;

		magazine = new ModelRenderer(this);
		magazine.setRotationPoint(-1.5F, -7.1F, -27.8F);
		magazine.cubeList.add(new ModelBox(magazine, 370, 291, -2.0F, -2.1F, 2.0F, 4, 2, 7, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 100, 389, -1.5F, -2.1F, 0.0F, 3, 3, 2, 0.0F, false));

		feedlip = new ModelRenderer(this);
		feedlip.setRotationPoint(1.0F, 30.9F, 1.0F);
		magazine.addChild(feedlip);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.2929F, -32.2929F, 7.0F);
		feedlip.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 370, 300, 0.0F, -1.0F, -5.0F, 1, 1, 6, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.2929F, -32.2929F, 7.0F);
		feedlip.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 16, 375, 0.0F, -1.0F, -5.0F, 1, 1, 6, 0.0F, false));

		segment = new ModelRenderer(this);
		segment.setRotationPoint(1.0F, 1.9F, 1.7F);
		magazine.addChild(segment);
		segment.cubeList.add(new ModelBox(segment, 204, 296, -2.0F, -2.1554F, 6.121F, 2, 1, 1, 0.0F, false));
		segment.cubeList.add(new ModelBox(segment, 302, 217, -3.0F, -2.0F, 0.3F, 4, 1, 6, 0.0F, false));
		segment.cubeList.add(new ModelBox(segment, 186, 371, 0.3F, -2.0F, -0.5F, 1, 1, 7, -0.2F, false));
		segment.cubeList.add(new ModelBox(segment, 372, 360, -3.3F, -2.0F, -0.5F, 1, 1, 7, -0.2F, false));
		segment.cubeList.add(new ModelBox(segment, 240, 332, -2.1F, -2.0F, -2.0F, 3, 1, 2, -0.2F, false));
		segment.cubeList.add(new ModelBox(segment, 238, 197, -2.9F, -2.0F, -2.0F, 2, 1, 2, -0.2F, false));

		segment_r1 = new ModelRenderer(this);
		segment_r1.setRotationPoint(-1.0F, 3.1723F, 0.5654F);
		segment.addChild(segment_r1);
		setRotationAngle(segment_r1, -0.48F, 0.0F, 0.0F);
		segment_r1.cubeList.add(new ModelBox(segment_r1, 326, 373, 1.3F, 9.7F, 0.0F, 1, 1, 7, -0.2F, false));
		segment_r1.cubeList.add(new ModelBox(segment_r1, 310, 373, -2.3F, 9.7F, 0.0F, 1, 1, 7, -0.2F, false));
		segment_r1.cubeList.add(new ModelBox(segment_r1, 146, 390, -1.9F, 9.7F, -1.5F, 2, 1, 2, -0.2F, false));
		segment_r1.cubeList.add(new ModelBox(segment_r1, 146, 367, -1.1F, 9.7F, -1.5F, 3, 1, 2, -0.2F, false));
		segment_r1.cubeList.add(new ModelBox(segment_r1, 246, 391, -1.8F, 10.1F, -0.8F, 1, 3, 1, -0.2F, false));
		segment_r1.cubeList.add(new ModelBox(segment_r1, 242, 391, 0.8F, 10.1F, -0.8F, 1, 3, 1, -0.2F, false));

		segment_r2 = new ModelRenderer(this);
		segment_r2.setRotationPoint(-1.0F, 3.1723F, 0.5654F);
		segment.addChild(segment_r2);
		setRotationAngle(segment_r2, -0.3927F, 0.0F, 0.0F);
		segment_r2.cubeList.add(new ModelBox(segment_r2, 294, 373, 1.3F, 5.6F, -0.7F, 1, 1, 7, -0.2F, false));
		segment_r2.cubeList.add(new ModelBox(segment_r2, 240, 373, -2.3F, 5.6F, -0.7F, 1, 1, 7, -0.2F, false));
		segment_r2.cubeList.add(new ModelBox(segment_r2, 138, 390, -1.9F, 5.6F, -2.2F, 2, 1, 2, -0.2F, false));
		segment_r2.cubeList.add(new ModelBox(segment_r2, 354, 156, -1.1F, 5.6F, -2.2F, 3, 1, 2, -0.2F, false));
		segment_r2.cubeList.add(new ModelBox(segment_r2, 50, 321, -1.8F, 6.1F, -1.6F, 1, 4, 1, -0.2F, false));
		segment_r2.cubeList.add(new ModelBox(segment_r2, 78, 296, 0.8F, 6.1F, -1.6F, 1, 4, 1, -0.2F, false));

		segment_r3 = new ModelRenderer(this);
		segment_r3.setRotationPoint(-1.0F, 3.1723F, 0.5654F);
		segment.addChild(segment_r3);
		setRotationAngle(segment_r3, -0.2618F, 0.0F, 0.0F);
		segment_r3.cubeList.add(new ModelBox(segment_r3, 122, 373, 1.3F, 2.0F, -1.4F, 1, 1, 7, -0.2F, false));
		segment_r3.cubeList.add(new ModelBox(segment_r3, 106, 373, -2.3F, 2.0F, -1.4F, 1, 1, 7, -0.2F, false));
		segment_r3.cubeList.add(new ModelBox(segment_r3, 344, 156, -1.1F, 2.0F, -2.9F, 3, 1, 2, -0.2F, false));
		segment_r3.cubeList.add(new ModelBox(segment_r3, 66, 390, -1.9F, 2.0F, -2.9F, 2, 1, 2, -0.2F, false));

		segment_r4 = new ModelRenderer(this);
		segment_r4.setRotationPoint(-1.0F, 3.1723F, 0.5654F);
		segment.addChild(segment_r4);
		setRotationAngle(segment_r4, -0.1745F, 0.0F, 0.0F);
		segment_r4.cubeList.add(new ModelBox(segment_r4, 90, 373, 1.3F, -1.7F, -1.6F, 1, 1, 7, -0.2F, false));
		segment_r4.cubeList.add(new ModelBox(segment_r4, 372, 368, -2.3F, -1.7F, -1.6F, 1, 1, 7, -0.2F, false));
		segment_r4.cubeList.add(new ModelBox(segment_r4, 368, 390, -1.8F, -4.7F, -2.5F, 1, 4, 1, -0.2F, false));
		segment_r4.cubeList.add(new ModelBox(segment_r4, 364, 390, 0.8F, -4.7F, -2.5F, 1, 4, 1, -0.2F, false));
		segment_r4.cubeList.add(new ModelBox(segment_r4, 334, 156, -1.1F, -1.7F, -3.1F, 3, 1, 2, -0.2F, false));
		segment_r4.cubeList.add(new ModelBox(segment_r4, 258, 238, -1.9F, -1.7F, -3.1F, 2, 1, 2, -0.2F, false));

		segment_r5 = new ModelRenderer(this);
		segment_r5.setRotationPoint(-1.0F, 3.1723F, 0.5654F);
		segment.addChild(segment_r5);
		setRotationAngle(segment_r5, -0.3054F, 0.0F, 0.0F);
		segment_r5.cubeList.add(new ModelBox(segment_r5, 380, 390, -1.8F, 2.3F, -2.2F, 1, 4, 1, -0.2F, false));
		segment_r5.cubeList.add(new ModelBox(segment_r5, 390, 376, 0.8F, 2.3F, -2.2F, 1, 4, 1, -0.2F, false));

		segment_r6 = new ModelRenderer(this);
		segment_r6.setRotationPoint(-1.0F, 3.1723F, 0.5654F);
		segment.addChild(segment_r6);
		setRotationAngle(segment_r6, -0.2182F, 0.0F, 0.0F);
		segment_r6.cubeList.add(new ModelBox(segment_r6, 376, 390, -1.8F, -1.3F, -2.5F, 1, 4, 1, -0.2F, false));
		segment_r6.cubeList.add(new ModelBox(segment_r6, 372, 390, 0.8F, -1.3F, -2.5F, 1, 4, 1, -0.2F, false));

		segment_r7 = new ModelRenderer(this);
		segment_r7.setRotationPoint(-1.0F, 16.4383F, -1.2823F);
		segment.addChild(segment_r7);
		setRotationAngle(segment_r7, -0.6545F, 0.0F, 0.0F);
		segment_r7.cubeList.add(new ModelBox(segment_r7, 210, 391, -2.3F, -2.5F, -0.9F, 1, 3, 1, -0.2F, false));
		segment_r7.cubeList.add(new ModelBox(segment_r7, 214, 386, 1.3F, -2.5F, -0.9F, 1, 3, 1, -0.2F, false));

		segment_r8 = new ModelRenderer(this);
		segment_r8.setRotationPoint(-1.0F, 0.5F, 6.0F);
		segment.addChild(segment_r8);
		setRotationAngle(segment_r8, -0.48F, 0.0F, 0.0F);
		segment_r8.cubeList.add(new ModelBox(segment_r8, 196, 387, -2.3F, 10.4F, 0.4F, 1, 5, 1, -0.2F, false));
		segment_r8.cubeList.add(new ModelBox(segment_r8, 234, 382, 1.3F, 10.4F, 0.4F, 1, 5, 1, -0.2F, false));

		segment_r9 = new ModelRenderer(this);
		segment_r9.setRotationPoint(-1.0F, 0.5F, 6.0F);
		segment.addChild(segment_r9);
		setRotationAngle(segment_r9, -0.3927F, 0.0F, 0.0F);
		segment_r9.cubeList.add(new ModelBox(segment_r9, 288, 374, 1.3F, 6.1F, -0.5F, 1, 5, 1, -0.2F, false));
		segment_r9.cubeList.add(new ModelBox(segment_r9, 350, 186, -2.3F, 6.1F, -0.5F, 1, 5, 1, -0.2F, false));

		segment_r10 = new ModelRenderer(this);
		segment_r10.setRotationPoint(-1.0F, 0.5F, 6.0F);
		segment.addChild(segment_r10);
		setRotationAngle(segment_r10, -0.2618F, 0.0F, 0.0F);
		segment_r10.cubeList.add(new ModelBox(segment_r10, 100, 342, 1.3F, 1.9F, -1.3F, 1, 5, 1, -0.2F, false));
		segment_r10.cubeList.add(new ModelBox(segment_r10, 100, 336, -2.3F, 1.9F, -1.3F, 1, 5, 1, -0.2F, false));

		segment_r11 = new ModelRenderer(this);
		segment_r11.setRotationPoint(-1.0F, 0.5F, 6.0F);
		segment.addChild(segment_r11);
		setRotationAngle(segment_r11, -0.1745F, 0.0F, 0.0F);
		segment_r11.cubeList.add(new ModelBox(segment_r11, 50, 315, 1.3F, -2.2F, -1.5F, 1, 5, 1, -0.2F, false));
		segment_r11.cubeList.add(new ModelBox(segment_r11, 50, 309, -2.3F, -2.2F, -1.5F, 1, 5, 1, -0.2F, false));

		segment2 = new ModelRenderer(this);
		segment2.setRotationPoint(0.0F, 1.4F, 6.4F);
		magazine.addChild(segment2);
		setRotationAngle(segment2, -0.0873F, 0.0F, 0.0F);
		segment2.cubeList.add(new ModelBox(segment2, 204, 278, -1.0F, -0.8639F, 1.3547F, 2, 5, 1, 0.0F, false));
		segment2.cubeList.add(new ModelBox(segment2, 50, 371, -2.0F, -0.8119F, -4.4573F, 4, 5, 6, 0.0F, false));
		segment2.cubeList.add(new ModelBox(segment2, 128, 317, -1.5F, -0.8119F, -6.4573F, 3, 5, 2, 0.0F, false));

		segment3 = new ModelRenderer(this);
		segment3.setRotationPoint(0.0F, 6.4F, 6.4F);
		magazine.addChild(segment3);
		setRotationAngle(segment3, -0.2182F, 0.0F, 0.0F);
		segment3.cubeList.add(new ModelBox(segment3, 204, 284, -1.0F, -1.0882F, 0.7922F, 2, 5, 1, 0.0F, false));
		segment3.cubeList.add(new ModelBox(segment3, 70, 371, -2.0F, -1.1916F, -5.0231F, 4, 5, 6, 0.0F, false));
		segment3.cubeList.add(new ModelBox(segment3, 90, 364, -1.5F, -1.1916F, -7.0231F, 3, 5, 2, 0.0F, false));

		segment4 = new ModelRenderer(this);
		segment4.setRotationPoint(0.0F, 12.4F, 6.4F);
		magazine.addChild(segment4);
		setRotationAngle(segment4, -0.2618F, 0.0F, 0.0F);
		

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(1.0F, -0.7819F, -7.5557F);
		segment4.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.0873F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 146, 371, -3.0F, -2.0F, 1.0F, 4, 5, 6, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 386, 66, -2.5F, -2.0F, -1.0F, 3, 5, 2, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(1.0F, 1.0113F, -6.7508F);
		segment4.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 204, 290, -2.0F, -3.5896F, 5.8724F, 2, 5, 1, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(1.0F, 5.0324F, -7.5139F);
		segment4.addChild(bone4);
		setRotationAngle(bone4, -0.2182F, 0.0F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 166, 371, -3.0F, -3.6067F, 0.0325F, 4, 5, 6, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 386, 73, -2.5F, -3.6067F, -1.9675F, 3, 5, 2, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 204, 272, -2.0F, -3.5896F, 5.8724F, 2, 5, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 106, 317, -3.0F, 1.2933F, -0.0675F, 4, 1, 7, 0.2F, false));
		bone4.cubeList.add(new ModelBox(bone4, 100, 348, -2.1791F, 1.2933F, -2.3228F, 2, 1, 1, 0.2F, false));
		bone4.cubeList.add(new ModelBox(bone4, 330, 393, -0.8209F, 1.2933F, -2.3228F, 1, 1, 1, 0.2F, false));

		bone5_r1 = new ModelRenderer(this);
		bone5_r1.setRotationPoint(-1.6619F, -2.2067F, -0.9847F);
		bone4.addChild(bone5_r1);
		setRotationAngle(bone5_r1, 0.0F, -0.3491F, 0.0F);
		bone5_r1.cubeList.add(new ModelBox(bone5_r1, 162, 390, -1.0F, 3.5F, -1.0F, 2, 1, 2, 0.2F, false));

		bone4_r1 = new ModelRenderer(this);
		bone4_r1.setRotationPoint(-0.3381F, 1.7933F, -0.9847F);
		bone4.addChild(bone4_r1);
		setRotationAngle(bone4_r1, 0.0F, 0.3491F, 0.0F);
		bone4_r1.cubeList.add(new ModelBox(bone4_r1, 154, 390, -1.0F, -0.5F, -1.0F, 2, 1, 2, 0.2F, false));
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