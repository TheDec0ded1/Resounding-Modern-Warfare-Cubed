package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SR3VikhrAction extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer Action1;

	public SR3VikhrAction() {
		textureWidth = 256;
		textureHeight = 256;

		action = new ModelRenderer(this);
		action.setRotationPoint(0.4F, 24.1F, 1.3F);
		action.cubeList.add(new ModelBox(action, 98, 193, -2.9F, -38.15F, -44.4F, 2, 2, 18, -0.2F, false));
		action.cubeList.add(new ModelBox(action, 217, 65, -1.4F, -37.95F, -43.1F, 2, 1, 2, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 53, 140, -4.4F, -37.95F, -43.1F, 2, 1, 2, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-3.284F, -37.45F, -41.033F);
		action.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -0.5236F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 240, 230, -1.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-3.284F, -37.45F, -43.167F);
		action.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.5236F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 241, 118, -1.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-0.516F, -37.45F, -41.033F);
		action.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.5236F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 72, 242, -1.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-0.516F, -37.45F, -43.167F);
		action.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, -0.5236F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 242, 62, -1.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

		Action1 = new ModelRenderer(this);
		Action1.setRotationPoint(-3.58F, -34.7F, -26.5F);
		action.addChild(Action1);
		setRotationAngle(Action1, 0.0F, 0.0F, -1.3582F);
		Action1.cubeList.add(new ModelBox(Action1, 217, 53, 0.0F, 0.0F, -0.1F, 3, 2, 9, 0.0F, false));
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