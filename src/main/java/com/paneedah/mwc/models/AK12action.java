package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AK12action extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r4_r1;

	public AK12action() {
		textureWidth = 200;
		textureHeight = 200;

		action = new ModelRenderer(this);
		action.setRotationPoint(0.5F, -11.5F, -27.0F);
		action.cubeList.add(new ModelBox(action, 152, 54, -1.0F, 0.0F, 0.0F, 1, 1, 11, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 16, 30, -5.1F, -2.0F, -6.0F, 4, 1, 1, -0.2F, false));
		action.cubeList.add(new ModelBox(action, 152, 42, -4.0F, 0.0F, 0.0F, 1, 1, 11, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-4.0F, 0.0F, 2.0F);
		action.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.3316F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 112, 0, 0.0F, -2.0F, -8.0F, 1, 1, 6, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 60, 127, 0.0F, -2.0F, -2.0F, 1, 2, 11, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 2.0F);
		action.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.3316F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 112, 7, -1.0F, -2.0F, -8.0F, 1, 1, 6, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 134, 40, -1.0F, -2.0F, -2.0F, 1, 2, 11, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-0.2F, -2.0F, -6.1F);
		action.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, -0.2443F, 0.0F);
		

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-3.8F, -2.0F, -6.1F);
		action.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.2443F, 0.0F);
		

		cube_r4_r1 = new ModelRenderer(this);
		cube_r4_r1.setRotationPoint(-1.5822F, 0.5F, 0.3549F);
		cube_r4.addChild(cube_r4_r1);
		setRotationAngle(cube_r4_r1, 0.0F, -0.48F, 0.0F);
		cube_r4_r1.cubeList.add(new ModelBox(cube_r4_r1, 56, 0, -1.0F, -0.5F, -0.8F, 2, 1, 1, -0.1F, false));
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