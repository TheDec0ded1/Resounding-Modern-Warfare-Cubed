package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AEK971Action extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer Action7;
	private final ModelRenderer Action6;
	private final ModelRenderer Action5;
	private final ModelRenderer Action4;
	private final ModelRenderer Action3;
	private final ModelRenderer Action2;
	private final ModelRenderer Action1;

	public AEK971Action() {
		textureWidth = 512;
		textureHeight = 256;

		action = new ModelRenderer(this);
		action.setRotationPoint(0.1F, 24.0F, -7.0F);
		

		Action7 = new ModelRenderer(this);
		Action7.setRotationPoint(-3.8F, -36.2F, -24.9F);
		action.addChild(Action7);
		setRotationAngle(Action7, 0.0F, 2.4166F, 0.0F);
		Action7.cubeList.add(new ModelBox(Action7, 199, 42, 0.0F, 0.0F, 0.0F, 1, 1, 1, -0.001F, false));

		Action6 = new ModelRenderer(this);
		Action6.setRotationPoint(-3.8F, -36.2F, -25.9F);
		action.addChild(Action6);
		Action6.cubeList.add(new ModelBox(Action6, 206, 41, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		Action5 = new ModelRenderer(this);
		Action5.setRotationPoint(-6.0F, -36.2F, -25.3F);
		action.addChild(Action5);
		setRotationAngle(Action5, 0.0F, 1.9879F, 0.0F);
		Action5.cubeList.add(new ModelBox(Action5, 202, 41, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		Action4 = new ModelRenderer(this);
		Action4.setRotationPoint(-4.5F, -36.2F, -26.5F);
		action.addChild(Action4);
		setRotationAngle(Action4, 0.0F, -1.3756F, 0.0F);
		Action4.cubeList.add(new ModelBox(Action4, 196, 42, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		Action3 = new ModelRenderer(this);
		Action3.setRotationPoint(-6.0F, -36.2F, -26.3F);
		action.addChild(Action3);
		Action3.cubeList.add(new ModelBox(Action3, 211, 42, 0.0F, 0.0F, 0.0F, 3, 1, 1, 0.001F, false));

		Action2 = new ModelRenderer(this);
		Action2.setRotationPoint(-4.5F, -36.2F, -26.5F);
		action.addChild(Action2);
		Action2.cubeList.add(new ModelBox(Action2, 208, 47, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		Action1 = new ModelRenderer(this);
		Action1.setRotationPoint(-3.68F, -35.2F, -26.5F);
		action.addChild(Action1);
		setRotationAngle(Action1, 0.0F, 0.0F, -1.3582F);
		Action1.cubeList.add(new ModelBox(Action1, 183, 30, -0.3F, 0.0F, 0.0F, 3, 3, 12, 0.0F, false));
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