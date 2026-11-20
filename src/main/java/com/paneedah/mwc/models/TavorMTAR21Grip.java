package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class TavorMTAR21Grip extends ModelBase {
	private final ModelRenderer grip;
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
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;

	public TavorMTAR21Grip() {
		textureWidth = 320;
		textureHeight = 320;

		grip = new ModelRenderer(this);
		grip.setRotationPoint(-1.5F, 6.1262F, 7.203F);
		grip.cubeList.add(new ModelBox(grip, 250, 82, -1.999F, -13.55F, -9.3F, 4, 3, 4, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 296, 223, -1.499F, -13.55F, -9.9F, 3, 3, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 12, 296, -1.498F, -10.5968F, -10.3622F, 3, 1, 3, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 192, 298, -1.499F, -13.55F, -5.8F, 3, 3, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 236, 291, -0.998F, -10.2679F, -16.8459F, 2, 1, 6, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 300, 147, -0.998F, -9.4019F, -16.4459F, 2, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -14.0333F, -4.4075F);
		grip.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.9163F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 214, 276, -2.001F, -1.0F, -0.5F, 4, 2, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.5F, -14.0333F, -3.9075F);
		grip.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.9163F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 200, 298, -1.001F, -1.0F, -0.5F, 3, 2, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.002F, -12.825F, -17.8F);
		grip.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.0698F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 284, 19, -2.001F, -1.275F, -0.425F, 4, 2, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-0.998F, -9.0849F, -16.2629F);
		grip.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.5236F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 168, 209, 0.0F, -5.5F, -0.5F, 2, 6, 1, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-0.998F, -8.6519F, -15.8789F);
		grip.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.5236F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 300, 145, 0.0F, -1.0F, -0.5F, 2, 1, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-0.5F, -4.4263F, -5.3387F);
		grip.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 112, 215, -0.999F, -3.7597F, 1.4578F, 3, 8, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-0.5F, -4.4263F, -5.3387F);
		grip.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.5672F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 298, 192, -1.001F, -5.2001F, 2.9161F, 3, 3, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-0.5F, -2.0488F, -1.9371F);
		grip.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.3054F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 284, 298, -1.0F, -10.0F, -1.0F, 3, 1, 1, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-0.5F, -4.636F, -13.7019F);
		grip.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.4363F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 298, 202, -1.0F, -12.0F, 4.0F, 3, 2, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.002F, -9.9324F, -10.6041F);
		grip.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.4363F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 300, 143, -1.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-0.499F, -10.7931F, -6.1141F);
		grip.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.7854F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 242, 298, -1.001F, 4.0966F, 0.4466F, 3, 1, 1, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, -4.636F, -14.2019F);
		grip.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.4363F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 34, 263, -2.0F, -12.0F, 4.0F, 4, 2, 1, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-0.5F, -13.1459F, -9.6792F);
		grip.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.5236F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 298, 123, -1.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.001F, -4.6931F, -5.8141F);
		grip.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.7854F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 296, 80, -2.001F, 4.0966F, 0.4466F, 4, 1, 1, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.0F, -4.4263F, -5.8387F);
		grip.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.5672F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 294, 257, -2.001F, -5.2001F, 1.9161F, 4, 3, 2, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.0F, -4.4263F, -5.8387F);
		grip.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0873F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 48, 208, -2.0F, -6.8794F, -2.9266F, 4, 11, 4, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 78, 251, -1.999F, -3.7597F, 0.4578F, 4, 8, 2, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.0F, -2.0488F, -2.4371F);
		grip.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.3054F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 296, 78, -2.0F, -10.0F, -1.0F, 4, 1, 1, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-0.5F, -10.3468F, -9.9292F);
		grip.addChild(cube_r18);
		setRotationAngle(cube_r18, -0.5236F, 0.0F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 176, 281, -1.0F, -1.0F, -0.5F, 3, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		grip.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}