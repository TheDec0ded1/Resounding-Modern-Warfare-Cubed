package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class OSV96Action extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;

	public OSV96Action() {
		textureWidth = 688;
		textureHeight = 688;

		action = new ModelRenderer(this);
		action.setRotationPoint(-0.5F, 26.4F, 29.8F);
		action.cubeList.add(new ModelBox(action, 138, 608, -3.9F, -43.2F, -69.0F, 6, 3, 22, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 608, 159, -3.9F, -45.2F, -69.0F, 6, 1, 22, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 528, 444, -2.9F, -44.2F, -69.0F, 4, 1, 12, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 560, 444, -3.9F, -44.2F, -57.0F, 6, 1, 10, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-5.2F, -44.0F, -68.1F);
		action.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -0.3054F, 0.1745F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 484, 457, -5.4F, -0.5F, 0.8F, 9, 1, 2, -0.2F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-5.2F, -44.0F, -68.1F);
		action.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.1745F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 460, 457, -7.0F, -0.5F, -1.0F, 10, 1, 2, -0.1F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-3.1929F, -45.2F, -60.5F);
		action.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 608, 278, -0.5F, -0.5F, -8.5F, 1, 1, 22, 0.0F, false));
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