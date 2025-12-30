package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Stoner63RifleHandle extends ModelWithAttachments {
	private final ModelRenderer handle;
	private final ModelRenderer cube_r1;

	public Stoner63RifleHandle() {
		textureWidth = 592;
		textureHeight = 592;

		handle = new ModelRenderer(this);
		handle.setRotationPoint(0.2F, 27.75F, 4.4F);
		handle.cubeList.add(new ModelBox(handle, 464, 482, 0.0F, -45.475F, -61.275F, 1, 1, 34, -0.2F, false));
		handle.cubeList.add(new ModelBox(handle, 0, 488, 0.0F, -44.05F, -61.275F, 1, 1, 34, -0.2F, false));
		handle.cubeList.add(new ModelBox(handle, 569, 149, -2.0F, -45.3F, -61.275F, 3, 2, 1, -0.2F, false));
		handle.cubeList.add(new ModelBox(handle, 322, 573, 0.0F, -45.3F, -59.875F, 1, 2, 1, -0.2F, false));
		handle.cubeList.add(new ModelBox(handle, 340, 573, 0.0F, -45.3F, -57.075F, 1, 2, 1, -0.2F, false));
		handle.cubeList.add(new ModelBox(handle, 573, 322, 0.0F, -45.3F, -58.475F, 1, 2, 1, -0.2F, false));
		handle.cubeList.add(new ModelBox(handle, 555, 573, 0.0F, -45.3F, -51.475F, 1, 2, 1, -0.2F, false));
		handle.cubeList.add(new ModelBox(handle, 550, 573, 0.0F, -45.3F, -52.875F, 1, 2, 1, -0.2F, false));
		handle.cubeList.add(new ModelBox(handle, 545, 573, 0.0F, -45.3F, -54.275F, 1, 2, 1, -0.2F, false));
		handle.cubeList.add(new ModelBox(handle, 345, 573, 0.0F, -45.3F, -55.675F, 1, 2, 1, -0.2F, false));
		handle.cubeList.add(new ModelBox(handle, 243, 574, 0.0F, -45.3F, -40.275F, 1, 2, 1, -0.2F, false));
		handle.cubeList.add(new ModelBox(handle, 227, 574, 0.0F, -45.3F, -41.675F, 1, 2, 1, -0.2F, false));
		handle.cubeList.add(new ModelBox(handle, 200, 574, 0.0F, -45.3F, -43.075F, 1, 2, 1, -0.2F, false));
		handle.cubeList.add(new ModelBox(handle, 195, 574, 0.0F, -45.3F, -44.475F, 1, 2, 1, -0.2F, false));
		handle.cubeList.add(new ModelBox(handle, 190, 574, 0.0F, -45.3F, -45.875F, 1, 2, 1, -0.2F, false));
		handle.cubeList.add(new ModelBox(handle, 185, 574, 0.0F, -45.3F, -47.275F, 1, 2, 1, -0.2F, false));
		handle.cubeList.add(new ModelBox(handle, 565, 573, 0.0F, -45.3F, -48.675F, 1, 2, 1, -0.2F, false));
		handle.cubeList.add(new ModelBox(handle, 560, 573, 0.0F, -45.3F, -50.075F, 1, 2, 1, -0.2F, false));
		handle.cubeList.add(new ModelBox(handle, 192, 569, 0.0F, -45.3F, -28.675F, 1, 2, 2, -0.2F, false));
		handle.cubeList.add(new ModelBox(handle, 358, 571, 0.6F, -45.3F, -27.675F, 2, 2, 1, -0.2F, false));
		handle.cubeList.add(new ModelBox(handle, 132, 556, 0.2F, -44.775F, -34.375F, 1, 1, 6, -0.2F, false));
		handle.cubeList.add(new ModelBox(handle, 263, 574, 0.0F, -45.3F, -34.575F, 1, 2, 1, -0.2F, false));
		handle.cubeList.add(new ModelBox(handle, 258, 574, 0.0F, -45.3F, -35.975F, 1, 2, 1, -0.2F, false));
		handle.cubeList.add(new ModelBox(handle, 253, 574, 0.0F, -45.3F, -37.375F, 1, 2, 1, -0.2F, false));
		handle.cubeList.add(new ModelBox(handle, 248, 574, 0.0F, -45.3F, -38.775F, 1, 2, 1, -0.2F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.8268F, -43.3F, -27.4678F);
		handle.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.5236F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 351, 571, 0.0F, -2.0F, 0.0F, 2, 2, 1, -0.2F, false));
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