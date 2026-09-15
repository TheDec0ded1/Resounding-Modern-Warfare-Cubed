package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class TavorX95GripAR extends ModelBase {
	private final ModelRenderer gripAR;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;

	public TavorX95GripAR() {
		textureWidth = 560;
		textureHeight = 560;

		gripAR = new ModelRenderer(this);
		gripAR.setRotationPoint(-1.5F, 6.1262F, 7.203F);
		gripAR.cubeList.add(new ModelBox(gripAR, 524, 337, -1.999F, -13.55F, -9.3F, 4, 3, 4, 0.0F, false));
		gripAR.cubeList.add(new ModelBox(gripAR, 280, 534, -1.499F, -13.55F, -9.9F, 3, 3, 1, 0.0F, false));
		gripAR.cubeList.add(new ModelBox(gripAR, 44, 489, -1.498F, -10.5968F, -10.7622F, 3, 1, 3, 0.0F, false));
		gripAR.cubeList.add(new ModelBox(gripAR, 288, 534, -1.499F, -13.55F, -5.8F, 3, 3, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.002F, -12.825F, -17.8F);
		gripAR.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.0698F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 326, 531, -2.001F, -1.275F, -0.425F, 4, 2, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-0.498F, -9.0849F, -16.9629F);
		gripAR.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.3054F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 302, 334, -1.0F, -5.5F, -0.5F, 3, 14, 1, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-0.5F, -13.1459F, -9.6792F);
		gripAR.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.5236F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 536, 105, -1.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-0.5F, -14.0333F, -3.9075F);
		gripAR.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.9163F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 108, 535, -1.001F, -1.0F, -0.5F, 3, 2, 1, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.0F, -14.0333F, -4.4075F);
		gripAR.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.9163F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 530, 442, -2.001F, -1.0F, -0.5F, 4, 2, 1, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.0F, -4.636F, -14.2019F);
		gripAR.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.4363F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 530, 268, -2.0F, -12.0F, 4.0F, 4, 2, 1, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-0.5F, -4.636F, -13.7019F);
		gripAR.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.4363F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 100, 535, -1.0F, -12.0F, 4.0F, 3, 2, 1, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-0.5F, -4.4263F, -5.3387F);
		gripAR.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0873F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 100, 526, -0.999F, -3.7597F, 1.4578F, 3, 8, 1, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-0.5F, -4.4263F, -5.3387F);
		gripAR.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.5672F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 296, 534, -1.001F, -5.2001F, 2.9161F, 3, 3, 1, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-0.5F, -2.0488F, -1.9371F);
		gripAR.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.3054F, 0.0F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 86, 536, -1.0F, -10.0F, -1.0F, 3, 1, 1, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-0.499F, -10.7931F, -6.1141F);
		gripAR.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.7854F, 0.0F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 78, 536, -1.001F, 4.0966F, 0.4466F, 3, 1, 1, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.001F, -4.6931F, -5.8141F);
		gripAR.addChild(cube_r20);
		setRotationAngle(cube_r20, -0.7854F, 0.0F, 0.0F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 378, 218, -2.002F, 4.0966F, 0.4466F, 4, 1, 1, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(0.0F, -4.4263F, -5.8387F);
		gripAR.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.5672F, 0.0F, 0.0F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 526, 297, -2.001F, -5.2001F, 1.9161F, 4, 3, 2, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(0.0F, -4.4263F, -5.8387F);
		gripAR.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0873F, 0.0F, 0.0F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 346, 531, -1.499F, 3.1206F, -7.9266F, 3, 1, 2, 0.0F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 468, 264, -2.0F, 3.1206F, -5.9266F, 4, 1, 3, 0.0F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 64, 454, -2.0F, -6.8794F, -2.9266F, 4, 11, 4, 0.0F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 84, 397, -1.999F, -3.7597F, 0.4578F, 4, 8, 2, 0.0F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(0.0F, 1.9258F, -4.5789F);
		gripAR.addChild(cube_r23);
		setRotationAngle(cube_r23, -0.6545F, 0.0F, 0.0F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 336, 531, -1.5F, 3.1206F, -9.9266F, 3, 1, 2, 0.0F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(0.0F, -2.0488F, -2.4371F);
		gripAR.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.3054F, 0.0F, 0.0F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 302, 377, -2.0F, -10.0F, -1.0F, 4, 1, 1, 0.0F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-0.5F, -10.3468F, -9.9292F);
		gripAR.addChild(cube_r25);
		setRotationAngle(cube_r25, -0.5236F, 0.0F, 0.0F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 70, 536, -1.0F, -1.0F, -0.5F, 3, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gripAR.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}