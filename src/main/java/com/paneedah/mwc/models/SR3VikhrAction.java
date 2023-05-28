package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;

import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SR3VikhrAction extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer Action7;
	private final ModelRenderer Action8;
	private final ModelRenderer Action6;
	private final ModelRenderer Action5;
	private final ModelRenderer Action4;
	private final ModelRenderer Action3;
	private final ModelRenderer Action2;
	private final ModelRenderer Action1;

	public SR3VikhrAction() {
		textureWidth = 256;
		textureHeight = 256;

		action = new ModelRenderer(this);
		action.setRotationPoint(0.1F, 24.0F, 0.0F);
		

		Action7 = new ModelRenderer(this);
		Action7.setRotationPoint(-3.8F, -36.2F, -24.9F);
		action.addChild(Action7);
		setRotationAngle(Action7, 0.0F, 2.4166F, 0.0F);
		Action7.cubeList.add(new ModelBox(Action7, 51, 117, 11.1647F, -2.575F, 14.0435F, 2, 2, 2, -0.1F, false));
		Action7.cubeList.add(new ModelBox(Action7, 102, 5, 10.9292F, -2.675F, 17.7875F, 2, 2, 2, -0.1F, false));

		Action8 = new ModelRenderer(this);
		Action8.setRotationPoint(-3.8F, -43.2F, -24.9F);
		action.addChild(Action8);
		setRotationAngle(Action8, 0.0F, 2.4166F, 0.0F);
		Action8.cubeList.add(new ModelBox(Action8, 51, 117, 9.0724F, 4.325F, 15.6917F, 2, 2, 2, -0.1F, false));
		Action8.cubeList.add(new ModelBox(Action8, 102, 5, 13.0214F, 4.425F, 16.1393F, 2, 2, 2, -0.1F, false));

		Action6 = new ModelRenderer(this);
		Action6.setRotationPoint(-3.8F, -36.2F, -25.9F);
		action.addChild(Action6);
		

		Action5 = new ModelRenderer(this);
		Action5.setRotationPoint(-6.0F, -38.2F, -48.3F);
		action.addChild(Action5);
		setRotationAngle(Action5, 0.0F, -1.5708F, 0.0F);
		Action5.cubeList.add(new ModelBox(Action5, 51, 117, 1.25F, -0.575F, -3.7F, 3, 2, 2, -0.1F, false));
		Action5.cubeList.add(new ModelBox(Action5, 100, 6, 1.25F, -0.675F, -7.1F, 3, 2, 2, -0.1F, false));

		Action4 = new ModelRenderer(this);
		Action4.setRotationPoint(-4.5F, -36.2F, -26.5F);
		action.addChild(Action4);
		setRotationAngle(Action4, 0.0F, -1.3756F, 0.0F);
		

		Action3 = new ModelRenderer(this);
		Action3.setRotationPoint(-6.0F, -36.2F, -26.3F);
		action.addChild(Action3);
		Action3.cubeList.add(new ModelBox(Action3, 164, 111, 2.9F, -2.5F, -17.0F, 3, 2, 9, -0.25F, false));

		Action2 = new ModelRenderer(this);
		Action2.setRotationPoint(-4.5F, -36.2F, -26.5F);
		action.addChild(Action2);
		

		Action1 = new ModelRenderer(this);
		Action1.setRotationPoint(-3.68F, -35.2F, -26.5F);
		action.addChild(Action1);
		setRotationAngle(Action1, 0.0F, 0.0F, -1.3582F);
		Action1.cubeList.add(new ModelBox(Action1, 164, 74, 0.0F, 0.0F, 0.0F, 3, 3, 12, 0.0F, false));
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