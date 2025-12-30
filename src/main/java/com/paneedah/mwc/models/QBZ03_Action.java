package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBZ03_Action extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer cube_r5;
	private final ModelRenderer action3;
	private final ModelRenderer Action7;
	private final ModelRenderer Action6;
	private final ModelRenderer Action5;
	private final ModelRenderer Action4;
	private final ModelRenderer Action8;
	private final ModelRenderer Action5_r1;
	private final ModelRenderer Action5_r3_r1;
	private final ModelRenderer Action5_r4_r1;
	private final ModelRenderer Action5_r2;
	private final ModelRenderer Action4_r1;
	private final ModelRenderer Action3_r1;
	private final ModelRenderer Action9;

	public QBZ03_Action() {
		textureWidth = 416;
		textureHeight = 416;

		action = new ModelRenderer(this);
		action.setRotationPoint(0.0F, 24.0F, 0.0F);
		action.cubeList.add(new ModelBox(action, 350, 88, -3.7F, -37.7F, -31.0F, 5, 1, 16, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 350, 106, -3.7F, -36.7F, -31.0F, 5, 1, 16, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 352, 20, -2.7F, -39.432F, -31.0F, 2, 2, 16, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-2.834F, -37.2F, -24.0F);
		action.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.5236F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 352, 39, -1.0F, -2.0F, -7.0F, 1, 2, 16, 0.0F, false));

		action3 = new ModelRenderer(this);
		action3.setRotationPoint(8.4762F, 1.0F, -22.7037F);
		action.addChild(action3);
		setRotationAngle(action3, 0.0F, 0.1309F, 0.0F);
		

		Action7 = new ModelRenderer(this);
		Action7.setRotationPoint(-12.9F, -37.8F, -7.9F);
		action3.addChild(Action7);
		setRotationAngle(Action7, 0.0F, 2.4166F, 0.0F);
		Action7.cubeList.add(new ModelBox(Action7, 50, 397, 0.0894F, 0.199F, 0.2647F, 1, 1, 1, -0.101F, false));

		Action6 = new ModelRenderer(this);
		Action6.setRotationPoint(-12.9F, -37.8F, -8.9F);
		action3.addChild(Action6);
		Action6.cubeList.add(new ModelBox(Action6, 279, 395, 0.0F, 0.2F, -0.3F, 2, 1, 1, -0.1F, false));

		Action5 = new ModelRenderer(this);
		Action5.setRotationPoint(-15.1F, -37.8F, -8.3F);
		action3.addChild(Action5);
		setRotationAngle(Action5, 0.0F, 1.9879F, 0.0F);
		

		Action4 = new ModelRenderer(this);
		Action4.setRotationPoint(-13.6F, -37.8F, -9.5F);
		action3.addChild(Action4);
		setRotationAngle(Action4, 0.0F, -1.3756F, 0.0F);
		Action4.cubeList.add(new ModelBox(Action4, 96, 397, -0.1399F, 0.2F, -0.4137F, 1, 1, 1, -0.1F, false));

		Action8 = new ModelRenderer(this);
		Action8.setRotationPoint(-15.1F, -37.8F, -9.3F);
		action3.addChild(Action8);
		

		Action5_r1 = new ModelRenderer(this);
		Action5_r1.setRotationPoint(1.4807F, 0.398F, 0.376F);
		Action8.addChild(Action5_r1);
		setRotationAngle(Action5_r1, 0.0F, -0.2182F, 0.0F);
		Action5_r1.cubeList.add(new ModelBox(Action5_r1, 194, 397, -1.1605F, -0.6F, -0.6536F, 1, 1, 1, -0.199F, false));

		Action5_r3_r1 = new ModelRenderer(this);
		Action5_r3_r1.setRotationPoint(-0.1966F, -0.1F, -0.2459F);
		Action5_r1.addChild(Action5_r3_r1);
		setRotationAngle(Action5_r3_r1, 0.0F, 0.3927F, 0.0F);
		Action5_r3_r1.cubeList.add(new ModelBox(Action5_r3_r1, 111, 397, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.199F, false));
		Action5_r3_r1.cubeList.add(new ModelBox(Action5_r3_r1, 101, 397, -0.275F, -0.5F, -0.5F, 1, 1, 1, -0.199F, false));

		Action5_r4_r1 = new ModelRenderer(this);
		Action5_r4_r1.setRotationPoint(0.3135F, 0.9F, -0.4479F);
		Action5_r1.addChild(Action5_r4_r1);
		setRotationAngle(Action5_r4_r1, 0.0F, 0.2182F, 0.0F);
		Action5_r4_r1.cubeList.add(new ModelBox(Action5_r4_r1, 106, 397, -0.275F, -1.5F, -0.5F, 1, 1, 1, -0.199F, false));

		Action5_r2 = new ModelRenderer(this);
		Action5_r2.setRotationPoint(0.1821F, 0.398F, -0.0335F);
		Action8.addChild(Action5_r2);
		setRotationAngle(Action5_r2, 0.0F, -0.3927F, 0.0F);
		Action5_r2.cubeList.add(new ModelBox(Action5_r2, 116, 397, -0.5659F, -0.6F, -0.6076F, 1, 1, 1, -0.199F, false));
		Action5_r2.cubeList.add(new ModelBox(Action5_r2, 137, 397, -0.3659F, -0.6F, -0.6076F, 1, 1, 1, -0.199F, false));

		Action4_r1 = new ModelRenderer(this);
		Action4_r1.setRotationPoint(1.6F, 0.7F, 0.3F);
		Action8.addChild(Action4_r1);
		setRotationAngle(Action4_r1, 0.0F, -0.2182F, 0.0F);
		Action4_r1.cubeList.add(new ModelBox(Action4_r1, 392, 226, -1.1953F, -0.5F, -0.4567F, 2, 1, 1, -0.099F, false));

		Action3_r1 = new ModelRenderer(this);
		Action3_r1.setRotationPoint(0.128F, 0.7F, -0.1641F);
		Action8.addChild(Action3_r1);
		setRotationAngle(Action3_r1, 0.0F, -0.3927F, 0.0F);
		Action3_r1.cubeList.add(new ModelBox(Action3_r1, 397, 195, -0.3659F, -0.5F, -0.4077F, 1, 1, 1, -0.099F, false));

		Action9 = new ModelRenderer(this);
		Action9.setRotationPoint(-13.6F, -37.8F, -9.5F);
		action3.addChild(Action9);
		Action9.cubeList.add(new ModelBox(Action9, 395, 284, 0.2F, 0.2F, -0.2F, 2, 1, 1, -0.1F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		action.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}