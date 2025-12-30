package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Stoner63RifleAction extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer action_r1;
	private final ModelRenderer action_r2;
	private final ModelRenderer action_r3;
	private final ModelRenderer action_r4;

	public Stoner63RifleAction() {
		textureWidth = 592;
		textureHeight = 592;

		action = new ModelRenderer(this);
		action.setRotationPoint(0.0F, 19.0F, 2.0F);
		action.cubeList.add(new ModelBox(action, 369, 404, -2.5657F, -35.9093F, -76.001F, 1, 1, 46, -0.1F, false));
		action.cubeList.add(new ModelBox(action, 437, 280, -2.0F, -35.3436F, -76.001F, 1, 1, 46, -0.1F, false));
		action.cubeList.add(new ModelBox(action, 95, 440, -1.4343F, -35.9093F, -76.001F, 1, 1, 46, -0.1F, false));
		action.cubeList.add(new ModelBox(action, 0, 440, -2.0F, -36.475F, -76.001F, 1, 1, 46, -0.1F, false));
		action.cubeList.add(new ModelBox(action, 340, 466, -3.2F, -35.4F, -30.1F, 3, 4, 11, 0.0F, false));

		action_r1 = new ModelRenderer(this);
		action_r1.setRotationPoint(-0.4858F, -35.8093F, -55.001F);
		action.addChild(action_r1);
		setRotationAngle(action_r1, 0.0F, 0.0F, 0.7854F);
		action_r1.cubeList.add(new ModelBox(action_r1, 369, 452, -1.5F, 0.5F, -21.0F, 1, 1, 46, -0.1F, false));

		action_r2 = new ModelRenderer(this);
		action_r2.setRotationPoint(-1.9F, -36.4235F, -55.001F);
		action.addChild(action_r2);
		setRotationAngle(action_r2, 0.0F, 0.0F, 0.7854F);
		action_r2.cubeList.add(new ModelBox(action_r2, 453, 70, 0.5F, 0.5F, -21.0F, 1, 1, 46, -0.1F, false));

		action_r3 = new ModelRenderer(this);
		action_r3.setRotationPoint(-1.1F, -34.3951F, -55.001F);
		action.addChild(action_r3);
		setRotationAngle(action_r3, 0.0F, 0.0F, 0.7854F);
		action_r3.cubeList.add(new ModelBox(action_r3, 453, 118, -1.5F, -1.5F, -21.0F, 1, 1, 46, -0.1F, false));

		action_r4 = new ModelRenderer(this);
		action_r4.setRotationPoint(-2.5142F, -35.0093F, -55.001F);
		action.addChild(action_r4);
		setRotationAngle(action_r4, 0.0F, 0.0F, 0.7854F);
		action_r4.cubeList.add(new ModelBox(action_r4, 453, 166, 0.5F, -1.5F, -21.0F, 1, 1, 46, -0.1F, false));
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