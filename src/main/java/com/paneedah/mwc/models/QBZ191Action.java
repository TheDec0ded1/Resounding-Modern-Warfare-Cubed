package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBZ191Action extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer cube_r7;
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
	private final ModelRenderer Action5_r5_r1;
	private final ModelRenderer Action5_r4_r2;
	private final ModelRenderer Action5_r4_r3;
	private final ModelRenderer Action5_r3_r2;
	private final ModelRenderer Action4_r1;
	private final ModelRenderer Action3_r1;
	private final ModelRenderer Action9;

	public QBZ191Action() {
		textureWidth = 400;
		textureHeight = 400;

		action = new ModelRenderer(this);
		action.setRotationPoint(0.0F, 24.0F, 0.0F);
		action.cubeList.add(new ModelBox(action, 336, 50, -3.25F, -36.75F, -27.65F, 1, 1, 24, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 336, 75, -3.25F, -36.45F, -27.65F, 1, 1, 24, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 202, 367, -2.1893F, -38.8107F, -27.65F, 1, 1, 10, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-2.5429F, -36.0429F, -26.65F);
		action.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 322, 269, -1.0F, -2.0F, -1.0F, 2, 2, 10, 0.0F, false));

		action3 = new ModelRenderer(this);
		action3.setRotationPoint(9.3896F, 1.4F, -19.5963F);
		action.addChild(action3);
		setRotationAngle(action3, 0.0F, 0.1309F, 0.0F);
		

		Action7 = new ModelRenderer(this);
		Action7.setRotationPoint(-12.9F, -37.8F, -7.9F);
		action3.addChild(Action7);
		setRotationAngle(Action7, 0.0F, 2.4166F, 0.0F);
		Action7.cubeList.add(new ModelBox(Action7, 286, 396, 0.0894F, 0.199F, 0.2647F, 1, 1, 1, -0.101F, false));

		Action6 = new ModelRenderer(this);
		Action6.setRotationPoint(-12.9F, -37.8F, -8.9F);
		action3.addChild(Action6);
		Action6.cubeList.add(new ModelBox(Action6, 392, 293, 0.0F, 0.2F, -0.3F, 2, 1, 1, -0.1F, false));

		Action5 = new ModelRenderer(this);
		Action5.setRotationPoint(-15.1F, -37.8F, -8.3F);
		action3.addChild(Action5);
		setRotationAngle(Action5, 0.0F, 1.9879F, 0.0F);
		

		Action4 = new ModelRenderer(this);
		Action4.setRotationPoint(-13.6F, -37.8F, -9.5F);
		action3.addChild(Action4);
		setRotationAngle(Action4, 0.0F, -1.3756F, 0.0F);
		Action4.cubeList.add(new ModelBox(Action4, 396, 321, -0.1399F, 0.2F, -0.4137F, 1, 1, 1, -0.1F, false));

		Action8 = new ModelRenderer(this);
		Action8.setRotationPoint(-15.1F, -37.8F, -9.3F);
		action3.addChild(Action8);
		

		Action5_r1 = new ModelRenderer(this);
		Action5_r1.setRotationPoint(1.4807F, 0.398F, 0.376F);
		Action8.addChild(Action5_r1);
		setRotationAngle(Action5_r1, 0.0F, -0.2182F, 0.0F);
		Action5_r1.cubeList.add(new ModelBox(Action5_r1, 296, 396, -1.1605F, -0.6F, -0.6536F, 1, 1, 1, -0.199F, false));

		Action5_r3_r1 = new ModelRenderer(this);
		Action5_r3_r1.setRotationPoint(-0.1966F, -0.1F, -0.2459F);
		Action5_r1.addChild(Action5_r3_r1);
		setRotationAngle(Action5_r3_r1, 0.0F, 0.3927F, 0.0F);
		Action5_r3_r1.cubeList.add(new ModelBox(Action5_r3_r1, 300, 396, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.199F, false));
		Action5_r3_r1.cubeList.add(new ModelBox(Action5_r3_r1, 382, 184, -0.275F, -0.5F, -0.5F, 1, 1, 1, -0.199F, false));

		Action5_r4_r1 = new ModelRenderer(this);
		Action5_r4_r1.setRotationPoint(0.3135F, 0.9F, -0.4479F);
		Action5_r1.addChild(Action5_r4_r1);
		setRotationAngle(Action5_r4_r1, 0.0F, 0.2182F, 0.0F);
		Action5_r4_r1.cubeList.add(new ModelBox(Action5_r4_r1, 396, 299, -0.275F, -1.5F, -0.5F, 1, 1, 1, -0.199F, false));

		Action5_r2 = new ModelRenderer(this);
		Action5_r2.setRotationPoint(0.1821F, 0.398F, -0.0335F);
		Action8.addChild(Action5_r2);
		setRotationAngle(Action5_r2, 0.0F, -0.3927F, 0.0F);
		Action5_r2.cubeList.add(new ModelBox(Action5_r2, 396, 301, -0.5659F, -0.6F, -0.6076F, 1, 1, 1, -0.199F, false));
		Action5_r2.cubeList.add(new ModelBox(Action5_r2, 396, 303, -0.3659F, -0.6F, -0.6076F, 1, 1, 1, -0.199F, false));

		Action5_r5_r1 = new ModelRenderer(this);
		Action5_r5_r1.setRotationPoint(1.6794F, 0.502F, 0.2467F);
		Action5_r2.addChild(Action5_r5_r1);
		setRotationAngle(Action5_r5_r1, 0.0F, 0.0436F, 0.0F);
		Action5_r5_r1.cubeList.add(new ModelBox(Action5_r5_r1, 222, 390, -1.5F, -0.5F, -0.5F, 3, 1, 1, -0.299F, false));

		Action5_r4_r2 = new ModelRenderer(this);
		Action5_r4_r2.setRotationPoint(1.1794F, 0.502F, 0.5467F);
		Action5_r2.addChild(Action5_r4_r2);
		setRotationAngle(Action5_r4_r2, 0.0F, 0.0436F, 0.0F);
		Action5_r4_r2.cubeList.add(new ModelBox(Action5_r4_r2, 62, 393, -0.5F, -0.5F, -0.5F, 2, 1, 1, -0.299F, false));

		Action5_r4_r3 = new ModelRenderer(this);
		Action5_r4_r3.setRotationPoint(2.4198F, 0.502F, 0.5734F);
		Action5_r2.addChild(Action5_r4_r3);
		setRotationAngle(Action5_r4_r3, 0.0F, -0.6109F, 0.0F);
		Action5_r4_r3.cubeList.add(new ModelBox(Action5_r4_r3, 372, 265, -0.5F, -0.5F, -1.5F, 3, 1, 2, -0.299F, false));

		Action5_r3_r2 = new ModelRenderer(this);
		Action5_r3_r2.setRotationPoint(-0.1207F, 0.502F, 0.2513F);
		Action5_r2.addChild(Action5_r3_r2);
		setRotationAngle(Action5_r3_r2, 0.0F, -0.2618F, 0.0F);
		Action5_r3_r2.cubeList.add(new ModelBox(Action5_r3_r2, 392, 390, -0.5F, -0.5F, -0.5F, 2, 1, 1, -0.299F, false));

		Action4_r1 = new ModelRenderer(this);
		Action4_r1.setRotationPoint(1.6F, 0.7F, 0.3F);
		Action8.addChild(Action4_r1);
		setRotationAngle(Action4_r1, 0.0F, -0.2182F, 0.0F);
		Action4_r1.cubeList.add(new ModelBox(Action4_r1, 392, 392, -1.1953F, -0.5F, -0.4567F, 2, 1, 1, -0.099F, false));

		Action3_r1 = new ModelRenderer(this);
		Action3_r1.setRotationPoint(0.128F, 0.7F, -0.1641F);
		Action8.addChild(Action3_r1);
		setRotationAngle(Action3_r1, 0.0F, -0.3927F, 0.0F);
		Action3_r1.cubeList.add(new ModelBox(Action3_r1, 304, 396, -0.3659F, -0.5F, -0.4077F, 1, 1, 1, -0.099F, false));

		Action9 = new ModelRenderer(this);
		Action9.setRotationPoint(-13.6F, -37.8F, -9.5F);
		action3.addChild(Action9);
		Action9.cubeList.add(new ModelBox(Action9, 392, 295, 0.2F, 0.2F, -0.2F, 2, 1, 1, -0.1F, false));
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