package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class TavorX95Handle extends ModelWithAttachments {
	private final ModelRenderer handle;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r10;
	private final ModelRenderer track;

	public TavorX95Handle() {
		textureWidth = 560;
		textureHeight = 560;

		handle = new ModelRenderer(this);
		handle.setRotationPoint(0.0F, 24.0F, -3.0F);
		handle.cubeList.add(new ModelBox(handle, 408, 352, -1.3F, -37.3F, -9.9F, 1, 1, 25, 0.0F, false));
		handle.cubeList.add(new ModelBox(handle, 492, 350, -1.2234F, -37.5076F, -10.2F, 3, 1, 1, 0.0F, false));
		handle.cubeList.add(new ModelBox(handle, 530, 19, 1.2766F, -38.0076F, -11.65F, 1, 2, 3, -0.2F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(2.0985F, -37.0076F, -10.0183F);
		handle.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.48F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 532, 0.206F, -1.0F, -0.4781F, 2, 2, 2, -0.3F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 126, 535, 1.286F, -1.0F, -0.4854F, 1, 2, 2, -0.2F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(2.0985F, -37.0076F, -10.0183F);
		handle.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.2182F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 8, 532, -0.895F, -1.0F, -0.6507F, 2, 2, 2, -0.3F, false));

		track = new ModelRenderer(this);
		track.setRotationPoint(-0.294F, -47.024F, -16.5657F);
		
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