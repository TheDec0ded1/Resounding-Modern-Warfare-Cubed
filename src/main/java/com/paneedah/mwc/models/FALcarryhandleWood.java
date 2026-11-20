package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FALcarryhandleWood extends ModelBase {
	private final ModelRenderer carryhandle;
	private final ModelRenderer bone80;
	private final ModelRenderer ch;
	private final ModelRenderer gun169_r1;
	private final ModelRenderer gun168_r1;
	private final ModelRenderer gun163_r1;
	private final ModelRenderer gun164_r1;
	private final ModelRenderer gun167_r1;
	private final ModelRenderer gun162_r1;
	private final ModelRenderer gun166_r1;
	private final ModelRenderer gun160_r1;

	public FALcarryhandleWood() {
		textureWidth = 576;
		textureHeight = 576;

		carryhandle = new ModelRenderer(this);
		carryhandle.setRotationPoint(-1.1332F, -16.3229F, -30.1436F);
		carryhandle.cubeList.add(new ModelBox(carryhandle, 558, 194, -4.3157F, 6.1249F, 1.5F, 1, 1, 1, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 100, 531, -4.3157F, 3.1249F, 0.5F, 1, 4, 1, 0.0F, false));

		bone80 = new ModelRenderer(this);
		bone80.setRotationPoint(0.0F, 0.0F, 0.0F);
		carryhandle.addChild(bone80);
		setRotationAngle(bone80, 0.0F, 0.0F, 0.5236F);
		bone80.cubeList.add(new ModelBox(bone80, 64, 317, -2.1751F, -0.1359F, 0.5F, 1, 5, 1, 0.0F, false));

		ch = new ModelRenderer(this);
		ch.setRotationPoint(-11.6418F, 5.2729F, -0.8564F);
		carryhandle.addChild(ch);
		ch.cubeList.add(new ModelBox(ch, 396, 191, 6.8238F, 0.7217F, 3.0F, 2, 2, 10, 0.0F, false));
		ch.cubeList.add(new ModelBox(ch, 556, 432, 6.8238F, 0.7217F, 12.9F, 2, 2, 1, -0.001F, false));
		ch.cubeList.add(new ModelBox(ch, 218, 492, 6.8238F, 0.4217F, 3.0F, 2, 1, 10, 0.002F, false));
		ch.cubeList.add(new ModelBox(ch, 36, 545, 6.8238F, 0.0217F, 12.9F, 2, 1, 1, 0.001F, false));
		ch.cubeList.add(new ModelBox(ch, 546, 281, 6.8238F, 0.0217F, 10.5F, 2, 1, 1, 0.001F, false));
		ch.cubeList.add(new ModelBox(ch, 510, 549, 6.8238F, 0.0217F, 8.0F, 2, 1, 1, 0.001F, false));
		ch.cubeList.add(new ModelBox(ch, 552, 281, 6.8238F, 0.0217F, 5.5F, 2, 1, 1, 0.001F, false));
		ch.cubeList.add(new ModelBox(ch, 70, 554, 6.8238F, 0.0217F, 3.0F, 2, 1, 1, 0.001F, false));

		gun169_r1 = new ModelRenderer(this);
		gun169_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		ch.addChild(gun169_r1);
		setRotationAngle(gun169_r1, 0.6692F, 0.0F, 0.0F);
		gun169_r1.cubeList.add(new ModelBox(gun169_r1, 508, 557, 6.8238F, 2.4984F, 2.1238F, 2, 1, 1, 0.0F, false));

		gun168_r1 = new ModelRenderer(this);
		gun168_r1.setRotationPoint(0.0F, 0.0F, 2.5F);
		ch.addChild(gun168_r1);
		setRotationAngle(gun168_r1, 0.6692F, 0.0F, 0.0F);
		gun168_r1.cubeList.add(new ModelBox(gun168_r1, 514, 557, 6.8238F, 2.4984F, 2.1238F, 2, 1, 1, 0.0F, false));

		gun163_r1 = new ModelRenderer(this);
		gun163_r1.setRotationPoint(0.0F, 0.0F, 1.5F);
		ch.addChild(gun163_r1);
		setRotationAngle(gun163_r1, -0.6692F, 0.0F, 0.0F);
		gun163_r1.cubeList.add(new ModelBox(gun163_r1, 468, 557, 6.8238F, -2.4644F, 3.1507F, 2, 1, 1, 0.0F, false));

		gun164_r1 = new ModelRenderer(this);
		gun164_r1.setRotationPoint(0.0F, 0.0F, 4.0F);
		ch.addChild(gun164_r1);
		setRotationAngle(gun164_r1, -0.6692F, 0.0F, 0.0F);
		gun164_r1.cubeList.add(new ModelBox(gun164_r1, 486, 557, 6.8238F, -2.4644F, 3.1507F, 2, 1, 1, 0.0F, false));

		gun167_r1 = new ModelRenderer(this);
		gun167_r1.setRotationPoint(0.0F, 0.0F, 5.0F);
		ch.addChild(gun167_r1);
		setRotationAngle(gun167_r1, 0.6692F, 0.0F, 0.0F);
		gun167_r1.cubeList.add(new ModelBox(gun167_r1, 520, 557, 6.8238F, 2.4984F, 2.1238F, 2, 1, 1, 0.0F, false));

		gun162_r1 = new ModelRenderer(this);
		gun162_r1.setRotationPoint(0.0F, 0.0F, 6.5F);
		ch.addChild(gun162_r1);
		setRotationAngle(gun162_r1, -0.6692F, 0.0F, 0.0F);
		gun162_r1.cubeList.add(new ModelBox(gun162_r1, 492, 557, 6.8238F, -2.4644F, 3.1507F, 2, 1, 1, 0.0F, false));

		gun166_r1 = new ModelRenderer(this);
		gun166_r1.setRotationPoint(0.0F, 0.0F, 7.5F);
		ch.addChild(gun166_r1);
		setRotationAngle(gun166_r1, 0.6692F, 0.0F, 0.0F);
		gun166_r1.cubeList.add(new ModelBox(gun166_r1, 558, 8, 6.8238F, 2.4984F, 2.1238F, 2, 1, 1, 0.0F, false));

		gun160_r1 = new ModelRenderer(this);
		gun160_r1.setRotationPoint(0.0F, 0.0F, 11.5F);
		ch.addChild(gun160_r1);
		setRotationAngle(gun160_r1, -0.6692F, 0.0F, 0.0F);
		gun160_r1.cubeList.add(new ModelBox(gun160_r1, 498, 557, 6.8238F, -0.8515F, 1.1115F, 2, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		carryhandle.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}