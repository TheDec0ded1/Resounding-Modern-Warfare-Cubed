package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Stoner63AutoRifleHandle extends ModelWithAttachments {
	private final ModelRenderer handle;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;

	public Stoner63AutoRifleHandle() {
		textureWidth = 576;
		textureHeight = 576;

		handle = new ModelRenderer(this);
		handle.setRotationPoint(0.7555F, -16.5461F, -39.885F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-3.3341F, 3.3893F, -15.4038F);
		handle.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -3.1416F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 153, 556, 0.6286F, -1.9932F, 20.9138F, 1, 2, 1, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 158, 556, 0.6286F, -1.9932F, 22.3138F, 1, 2, 1, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 163, 556, 0.6286F, -1.9932F, 23.7138F, 1, 2, 1, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 168, 556, 0.6286F, -1.9932F, 25.1138F, 1, 2, 1, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 535, 372, 0.8286F, -1.4682F, 25.3138F, 1, 1, 6, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 550, 553, 1.2286F, -1.9932F, 32.0138F, 2, 2, 1, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 317, 552, 0.6286F, -1.9932F, 31.0138F, 1, 2, 2, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 555, 260, 0.6286F, -1.9932F, 9.6138F, 1, 2, 1, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 25, 556, 0.6286F, -1.9932F, 11.0138F, 1, 2, 1, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 30, 556, 0.6286F, -1.9932F, 12.4138F, 1, 2, 1, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 35, 556, 0.6286F, -1.9932F, 13.8138F, 1, 2, 1, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 50, 556, 0.6286F, -1.9932F, 15.2138F, 1, 2, 1, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 556, 66, 0.6286F, -1.9932F, 16.6138F, 1, 2, 1, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 556, 97, 0.6286F, -1.9932F, 18.0138F, 1, 2, 1, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 556, 101, 0.6286F, -1.9932F, 19.4138F, 1, 2, 1, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 555, 244, 0.6286F, -1.9932F, 4.0138F, 1, 2, 1, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 555, 248, 0.6286F, -1.9932F, 5.4138F, 1, 2, 1, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 555, 252, 0.6286F, -1.9932F, 6.8138F, 1, 2, 1, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 555, 256, 0.6286F, -1.9932F, 8.2138F, 1, 2, 1, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 555, 236, 0.6286F, -1.9932F, 1.2138F, 1, 2, 1, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 555, 240, 0.6286F, -1.9932F, 2.6138F, 1, 2, 1, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 215, 555, 0.6286F, -1.9932F, -0.1862F, 1, 2, 1, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 552, 151, -1.3714F, -1.9932F, -1.5862F, 3, 2, 1, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 459, 0, 0.6286F, -0.7432F, -1.5862F, 1, 1, 34, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 458, 441, 0.6286F, -2.1682F, -1.5862F, 1, 1, 34, -0.2F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-3.3341F, 3.3893F, -15.4038F);
		handle.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.5236F, 3.1416F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 543, 553, -13.9841F, -1.9932F, 29.1319F, 2, 2, 1, -0.2F, false));
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