package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class VSSM_VintorezAction extends ModelWithAttachments {
	private final ModelRenderer vssm_action;
	private final ModelRenderer Action7;
	private final ModelRenderer Action6;
	private final ModelRenderer Action5;
	private final ModelRenderer Action4;
	private final ModelRenderer Action3;
	private final ModelRenderer Action2;
	private final ModelRenderer Action1;
	private final ModelRenderer Action1_r1;

	public VSSM_VintorezAction() {
		textureWidth = 256;
		textureHeight = 256;

		vssm_action = new ModelRenderer(this);
		vssm_action.setRotationPoint(0.4F, 24.1F, 1.3F);
		

		Action7 = new ModelRenderer(this);
		Action7.setRotationPoint(-3.8F, -36.2F, -24.9F);
		vssm_action.addChild(Action7);
		setRotationAngle(Action7, 0.0F, 2.4166F, 0.0F);
		Action7.cubeList.add(new ModelBox(Action7, 153, 82, -0.0191F, 0.199F, 0.3059F, 1, 1, 1, -0.201F, false));

		Action6 = new ModelRenderer(this);
		Action6.setRotationPoint(-3.8F, -36.2F, -25.9F);
		vssm_action.addChild(Action6);
		Action6.cubeList.add(new ModelBox(Action6, 72, 153, 0.0F, 0.2F, -0.3F, 1, 1, 1, -0.2F, false));

		Action5 = new ModelRenderer(this);
		Action5.setRotationPoint(-6.0F, -36.2F, -25.3F);
		vssm_action.addChild(Action5);
		setRotationAngle(Action5, 0.0F, 1.9879F, 0.0F);
		Action5.cubeList.add(new ModelBox(Action5, 53, 153, 0.1756F, 0.199F, 0.1841F, 1, 1, 1, -0.2F, false));

		Action4 = new ModelRenderer(this);
		Action4.setRotationPoint(-4.5F, -36.2F, -26.5F);
		vssm_action.addChild(Action4);
		setRotationAngle(Action4, 0.0F, -1.3756F, 0.0F);
		Action4.cubeList.add(new ModelBox(Action4, 30, 153, -0.1612F, 0.2F, -0.3962F, 1, 1, 1, -0.2F, false));

		Action3 = new ModelRenderer(this);
		Action3.setRotationPoint(-6.0F, -36.2F, -26.3F);
		vssm_action.addChild(Action3);
		Action3.cubeList.add(new ModelBox(Action3, 43, 11, 0.0F, 0.2F, -0.3F, 3, 1, 1, -0.199F, false));

		Action2 = new ModelRenderer(this);
		Action2.setRotationPoint(-4.5F, -36.2F, -26.5F);
		vssm_action.addChild(Action2);
		Action2.cubeList.add(new ModelBox(Action2, 73, 5, 0.0F, 0.2F, -0.2F, 2, 1, 1, -0.2F, false));

		Action1 = new ModelRenderer(this);
		Action1.setRotationPoint(-3.68F, -35.2F, -26.5F);
		vssm_action.addChild(Action1);
		setRotationAngle(Action1, 0.0F, 0.0F, -1.3582F);
		

		Action1_r1 = new ModelRenderer(this);
		Action1_r1.setRotationPoint(1.4F, 0.6F, 5.0F);
		Action1.addChild(Action1_r1);
		setRotationAngle(Action1_r1, 0.0F, 0.0F, 0.0349F);
		Action1_r1.cubeList.add(new ModelBox(Action1_r1, 0, 97, -1.5F, -0.5F, -5.0F, 3, 1, 10, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		vssm_action.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}