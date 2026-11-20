package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AS_Action extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer Action7;
	private final ModelRenderer Action6;
	private final ModelRenderer Action5;
	private final ModelRenderer Action4;
	private final ModelRenderer Action3;
	private final ModelRenderer Action5_r1;
	private final ModelRenderer Action5_r2;
	private final ModelRenderer Action4_r1;
	private final ModelRenderer Action3_r1;
	private final ModelRenderer Action2;
	private final ModelRenderer Action1;

	public AS_Action() {
		textureWidth = 256;
		textureHeight = 256;

		action = new ModelRenderer(this);
		action.setRotationPoint(0.5F, 24.6F, 1.3F);
		

		Action7 = new ModelRenderer(this);
		Action7.setRotationPoint(-3.8F, -36.2F, -24.9F);
		action.addChild(Action7);
		setRotationAngle(Action7, 0.0F, 2.4166F, 0.0F);
		Action7.cubeList.add(new ModelBox(Action7, 242, 200, -0.0191F, 0.199F, 0.3059F, 1, 1, 1, -0.201F, false));

		Action6 = new ModelRenderer(this);
		Action6.setRotationPoint(-3.8F, -36.2F, -25.9F);
		action.addChild(Action6);
		Action6.cubeList.add(new ModelBox(Action6, 242, 203, 0.0F, 0.2F, -0.3F, 1, 1, 1, -0.2F, false));

		Action5 = new ModelRenderer(this);
		Action5.setRotationPoint(-6.0F, -36.2F, -25.3F);
		action.addChild(Action5);
		setRotationAngle(Action5, 0.0F, 1.9879F, 0.0F);
		

		Action4 = new ModelRenderer(this);
		Action4.setRotationPoint(-4.5F, -36.2F, -26.5F);
		action.addChild(Action4);
		setRotationAngle(Action4, 0.0F, -1.3756F, 0.0F);
		Action4.cubeList.add(new ModelBox(Action4, 239, 72, -0.1612F, 0.2F, -0.3962F, 1, 1, 1, -0.2F, false));

		Action3 = new ModelRenderer(this);
		Action3.setRotationPoint(-6.0F, -36.2F, -26.3F);
		action.addChild(Action3);
		

		Action5_r1 = new ModelRenderer(this);
		Action5_r1.setRotationPoint(1.4807F, 0.398F, 0.376F);
		Action3.addChild(Action5_r1);
		setRotationAngle(Action5_r1, 0.0F, -0.2182F, 0.0F);
		Action5_r1.cubeList.add(new ModelBox(Action5_r1, 212, 242, -1.0F, -0.5F, -0.5F, 1, 1, 1, -0.299F, false));

		Action5_r2 = new ModelRenderer(this);
		Action5_r2.setRotationPoint(0.1821F, 0.398F, -0.0335F);
		Action3.addChild(Action5_r2);
		setRotationAngle(Action5_r2, 0.0F, -0.3927F, 0.0F);
		Action5_r2.cubeList.add(new ModelBox(Action5_r2, 242, 209, -0.2F, -0.5F, -0.5F, 1, 1, 1, -0.299F, false));
		Action5_r2.cubeList.add(new ModelBox(Action5_r2, 207, 242, 0.0F, -0.5F, -0.5F, 1, 1, 1, -0.299F, false));

		Action4_r1 = new ModelRenderer(this);
		Action4_r1.setRotationPoint(1.6F, 0.7F, 0.3F);
		Action3.addChild(Action4_r1);
		setRotationAngle(Action4_r1, 0.0F, -0.2182F, 0.0F);
		Action4_r1.cubeList.add(new ModelBox(Action4_r1, 176, 236, -1.0F, -0.5F, -0.5F, 2, 1, 1, -0.199F, false));

		Action3_r1 = new ModelRenderer(this);
		Action3_r1.setRotationPoint(0.128F, 0.7F, -0.1641F);
		Action3.addChild(Action3_r1);
		setRotationAngle(Action3_r1, 0.0F, -0.3927F, 0.0F);
		Action3_r1.cubeList.add(new ModelBox(Action3_r1, 242, 206, 0.0F, -0.5F, -0.5F, 1, 1, 1, -0.199F, false));

		Action2 = new ModelRenderer(this);
		Action2.setRotationPoint(-4.5F, -36.2F, -26.5F);
		action.addChild(Action2);
		Action2.cubeList.add(new ModelBox(Action2, 10, 238, 0.0F, 0.2F, -0.2F, 2, 1, 1, -0.2F, false));

		Action1 = new ModelRenderer(this);
		Action1.setRotationPoint(-3.68F, -35.2F, -26.5F);
		action.addChild(Action1);
		setRotationAngle(Action1, 0.0F, 0.0F, -1.3582F);
		Action1.cubeList.add(new ModelBox(Action1, 210, 104, 0.0F, 0.0F, 0.0F, 3, 2, 9, 0.0F, false));
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