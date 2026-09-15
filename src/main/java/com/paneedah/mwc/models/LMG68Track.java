package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class LMG68Track extends ModelWithAttachments {
	private final ModelRenderer track;
	private final ModelRenderer cube_r1;

	public LMG68Track() {
		textureWidth = 416;
		textureHeight = 416;

		track = new ModelRenderer(this);
		track.setRotationPoint(0.0F, 23.7F, 0.0F);
		track.cubeList.add(new ModelBox(track, 0, 239, -0.45F, -38.0F, -36.0F, 1, 2, 24, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.05F, -37.125F, -17.8F);
		track.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -0.7854F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 158, 395, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		track.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}