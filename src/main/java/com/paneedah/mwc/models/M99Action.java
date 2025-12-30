package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M99Action extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer action_r1;
	private final ModelRenderer action10_r1;
	private final ModelRenderer action2_r1;
	private final ModelRenderer action14_r1;

	public M99Action() {
		textureWidth = 410;
		textureHeight = 410;

		action = new ModelRenderer(this);
		action.setRotationPoint(0.0F, 24.0F, 0.0F);
		action.cubeList.add(new ModelBox(action, 12, 169, -3.3F, -39.0F, -33.1F, 1, 1, 20, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 30, 31, -6.3F, -40.0F, -32.8F, 3, 1, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 30, 31, -10.3F, -40.0F, -32.8F, 4, 1, 1, 0.1F, false));
		action.cubeList.add(new ModelBox(action, 29, 30, -10.4F, -40.5F, -33.3F, 1, 2, 2, -0.2F, false));
		action.cubeList.add(new ModelBox(action, 29, 30, -7.0F, -40.5F, -33.3F, 1, 2, 2, -0.2F, false));
		action.cubeList.add(new ModelBox(action, 29, 30, -10.8F, -40.5F, -33.3F, 1, 1, 2, -0.2F, false));
		action.cubeList.add(new ModelBox(action, 30, 31, -10.8F, -40.5F, -33.3F, 1, 2, 1, -0.2F, false));
		action.cubeList.add(new ModelBox(action, 29, 30, -10.8F, -39.5F, -33.3F, 1, 1, 2, -0.2F, false));
		action.cubeList.add(new ModelBox(action, 30, 31, -10.8F, -40.5F, -32.3F, 1, 2, 1, -0.2F, false));

		action_r1 = new ModelRenderer(this);
		action_r1.setRotationPoint(-3.8F, -39.5F, -31.3F);
		action.addChild(action_r1);
		setRotationAngle(action_r1, 0.0F, -0.5236F, 0.0F);
		action_r1.cubeList.add(new ModelBox(action_r1, 30, 31, -0.5F, -0.5F, -1.3F, 1, 1, 1, 0.0F, false));

		action10_r1 = new ModelRenderer(this);
		action10_r1.setRotationPoint(-7.3F, -37.5F, -33.0F);
		action.addChild(action10_r1);
		setRotationAngle(action10_r1, 1.9333F, 0.0F, 0.0F);
		

		action2_r1 = new ModelRenderer(this);
		action2_r1.setRotationPoint(-4.8F, -38.5F, -33.0F);
		action.addChild(action2_r1);
		setRotationAngle(action2_r1, 0.0F, 0.0F, 1.5708F);
		action2_r1.cubeList.add(new ModelBox(action2_r1, 56, 56, -2.5F, -2.5F, -0.1F, 2, 1, 20, 0.0F, false));

		action14_r1 = new ModelRenderer(this);
		action14_r1.setRotationPoint(-9.3F, -39.0F, -33.55F);
		action.addChild(action14_r1);
		setRotationAngle(action14_r1, 1.9333F, 0.0F, 0.0F);
		
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