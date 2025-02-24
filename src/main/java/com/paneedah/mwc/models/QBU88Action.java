package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBU88Action extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer action2;
	private final ModelRenderer Action7;
	private final ModelRenderer Action6;
	private final ModelRenderer Action5;
	private final ModelRenderer Action4;
	private final ModelRenderer Action3;
	private final ModelRenderer Action5_r1;
	private final ModelRenderer Action5_r2;
	private final ModelRenderer Action4_r1;
	private final ModelRenderer Action3_r1;
	private final ModelRenderer Action8;

	public QBU88Action() {
		textureWidth = 576;
		textureHeight = 576;

		action = new ModelRenderer(this);
		action.setRotationPoint(-2.3027F, -13.4652F, 0.54F);
		action.cubeList.add(new ModelBox(action, 525, 210, -2.081F, 1.3362F, 11.66F, 2, 2, 9, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 358, 140, -0.2973F, -0.7662F, -20.04F, 1, 1, 32, -0.2F, false));
		action.cubeList.add(new ModelBox(action, 0, 385, 0.127F, -0.342F, -20.04F, 1, 1, 32, -0.2F, false));
		action.cubeList.add(new ModelBox(action, 67, 385, -0.7216F, -0.342F, -20.04F, 1, 1, 32, -0.2F, false));
		action.cubeList.add(new ModelBox(action, 407, 260, -0.2973F, 0.0823F, -20.04F, 1, 1, 32, -0.2F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.6098F, 0.458F, -34.04F);
		action.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 201, 385, -1.0F, -1.0F, 14.0F, 1, 1, 32, -0.2F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.2098F, 0.458F, -34.04F);
		action.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 134, 385, -1.0F, -1.0F, 14.0F, 1, 1, 32, -0.2F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-0.1801F, -0.2248F, -31.74F);
		action.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.7854F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 375, 379, -0.5F, -0.3828F, 11.7F, 1, 1, 32, -0.2F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(1.2098F, -0.142F, -34.04F);
		action.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 308, 379, -1.0F, -1.0F, 14.0F, 1, 1, 32, -0.2F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-0.7521F, 0.8525F, 12.06F);
		action.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.4363F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 462, 60, -1.0F, -2.0F, -0.4F, 2, 3, 9, 0.0F, false));

		action2 = new ModelRenderer(this);
		action2.setRotationPoint(2.2027F, 35.8651F, 16.46F);
		action.addChild(action2);
		

		Action7 = new ModelRenderer(this);
		Action7.setRotationPoint(-3.8F, -36.2F, -24.9F);
		action2.addChild(Action7);
		setRotationAngle(Action7, 0.0F, 2.4166F, 0.0F);
		Action7.cubeList.add(new ModelBox(Action7, 164, 490, 0.0894F, 0.199F, 0.2647F, 1, 1, 1, -0.101F, false));

		Action6 = new ModelRenderer(this);
		Action6.setRotationPoint(-3.8F, -36.2F, -25.9F);
		action2.addChild(Action6);
		Action6.cubeList.add(new ModelBox(Action6, 462, 171, 0.0F, 0.2F, -0.3F, 2, 1, 1, -0.1F, false));

		Action5 = new ModelRenderer(this);
		Action5.setRotationPoint(-6.0F, -36.2F, -25.3F);
		action2.addChild(Action5);
		setRotationAngle(Action5, 0.0F, 1.9879F, 0.0F);
		

		Action4 = new ModelRenderer(this);
		Action4.setRotationPoint(-4.5F, -36.2F, -26.5F);
		action2.addChild(Action4);
		setRotationAngle(Action4, 0.0F, -1.3756F, 0.0F);
		Action4.cubeList.add(new ModelBox(Action4, 462, 441, -0.1399F, 0.2F, -0.4137F, 1, 1, 1, -0.1F, false));

		Action3 = new ModelRenderer(this);
		Action3.setRotationPoint(-6.0F, -36.2F, -26.3F);
		action2.addChild(Action3);
		

		Action5_r1 = new ModelRenderer(this);
		Action5_r1.setRotationPoint(1.4807F, 0.398F, 0.376F);
		Action3.addChild(Action5_r1);
		setRotationAngle(Action5_r1, 0.0F, -0.2182F, 0.0F);
		Action5_r1.cubeList.add(new ModelBox(Action5_r1, 302, 542, -1.1953F, -0.6F, -0.4567F, 2, 1, 1, -0.199F, false));

		Action5_r2 = new ModelRenderer(this);
		Action5_r2.setRotationPoint(0.1821F, 0.398F, -0.0335F);
		Action3.addChild(Action5_r2);
		setRotationAngle(Action5_r2, 0.0F, -0.3927F, 0.0F);
		Action5_r2.cubeList.add(new ModelBox(Action5_r2, 543, 506, -0.5659F, -0.6F, -0.4077F, 1, 1, 1, -0.199F, false));
		Action5_r2.cubeList.add(new ModelBox(Action5_r2, 291, 498, -0.3659F, -0.6F, -0.4077F, 1, 1, 1, -0.199F, false));

		Action4_r1 = new ModelRenderer(this);
		Action4_r1.setRotationPoint(1.6F, 0.7F, 0.3F);
		Action3.addChild(Action4_r1);
		setRotationAngle(Action4_r1, 0.0F, -0.2182F, 0.0F);
		Action4_r1.cubeList.add(new ModelBox(Action4_r1, 412, 542, -1.1953F, -0.5F, -0.4567F, 2, 1, 1, -0.099F, false));

		Action3_r1 = new ModelRenderer(this);
		Action3_r1.setRotationPoint(0.128F, 0.7F, -0.1641F);
		Action3.addChild(Action3_r1);
		setRotationAngle(Action3_r1, 0.0F, -0.3927F, 0.0F);
		Action3_r1.cubeList.add(new ModelBox(Action3_r1, 546, 24, -0.3659F, -0.5F, -0.4077F, 1, 1, 1, -0.099F, false));

		Action8 = new ModelRenderer(this);
		Action8.setRotationPoint(-4.5F, -36.2F, -26.5F);
		action2.addChild(Action8);
		Action8.cubeList.add(new ModelBox(Action8, 467, 257, 0.2F, 0.2F, -0.2F, 2, 1, 1, -0.1F, false));
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