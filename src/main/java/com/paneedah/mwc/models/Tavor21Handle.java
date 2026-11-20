package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Tavor21Handle extends ModelWithAttachments {
	private final ModelRenderer handle;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;

	public Tavor21Handle() {
		textureWidth = 432;
		textureHeight = 432;

		handle = new ModelRenderer(this);
		handle.setRotationPoint(0.0F, 24.0F, 0.0F);
		handle.cubeList.add(new ModelBox(handle, 298, 293, -1.3F, -37.3F, -29.9F, 1, 1, 44, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(2.7302F, -38.2809F, -30.1122F);
		handle.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.48F, -0.3491F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 420, 111, -1.0F, -1.0F, -1.0F, 2, 2, 2, -0.3F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.6659F, -37.8935F, -29.7F);
		handle.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.48F, -0.3491F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 224, 420, 1.275F, -1.0F, -0.85F, 1, 2, 2, -0.2F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(1.6659F, -37.8935F, -29.7F);
		handle.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.3491F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 218, 420, -1.0F, -1.0F, -0.95F, 1, 2, 2, -0.2F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(1.6659F, -37.8935F, -29.7F);
		handle.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.2182F, -0.3491F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 104, 420, -1.0F, -1.0F, -1.0F, 2, 2, 2, -0.3F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, -37.5F, -24.5F);
		handle.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.3491F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 210, 420, -1.8F, -0.3F, -5.7F, 3, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handle.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}