package com.paneedah.mwc.models;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ScarHMag extends ModelBase {
	private final ModelRenderer magazine2;
	private final ModelRenderer cube_r118;
	private final ModelRenderer cube_r119;

	public ScarHMag() {
		textureWidth = 360;
		textureHeight = 360;

		magazine2 = new ModelRenderer(this);
		magazine2.setRotationPoint(0.25F, 6.0F, -24.95F);
		magazine2.cubeList.add(new ModelBox(magazine2, 114, 343, -1.0F, -17.7F, -0.65F, 1, 15, 1, 0.1F, false));
		magazine2.cubeList.add(new ModelBox(magazine2, 19, 323, -1.35F, -17.7F, -0.45F, 1, 18, 4, 0.098F, false));
		magazine2.cubeList.add(new ModelBox(magazine2, 62, 323, -3.25F, -17.7F, 4.55F, 3, 18, 3, 0.098F, false));
		magazine2.cubeList.add(new ModelBox(magazine2, 8, 311, -2.15F, -17.7F, 2.85F, 2, 18, 2, 0.097F, false));
		magazine2.cubeList.add(new ModelBox(magazine2, 139, 342, -0.7F, -0.4F, -0.85F, 1, 1, 9, 0.0F, false));
		magazine2.cubeList.add(new ModelBox(magazine2, 280, 338, -1.0F, -0.5F, 6.55F, 1, 1, 2, 0.099F, false));
		magazine2.cubeList.add(new ModelBox(magazine2, 42, 342, -0.7F, -2.4F, -1.15F, 1, 3, 1, -0.1F, false));
		magazine2.cubeList.add(new ModelBox(magazine2, 110, 343, -1.0F, -17.7F, -0.15F, 1, 15, 1, 0.099F, false));
		magazine2.cubeList.add(new ModelBox(magazine2, 65, 342, -1.0F, -17.7F, 1.6F, 1, 15, 2, 0.1F, false));
		magazine2.cubeList.add(new ModelBox(magazine2, 101, 302, -1.0F, -17.7F, 4.1F, 1, 15, 2, 0.1F, false));
		magazine2.cubeList.add(new ModelBox(magazine2, 11, 304, -1.0F, -2.9F, 4.1F, 1, 1, 2, 0.101F, false));
		magazine2.cubeList.add(new ModelBox(magazine2, 73, 311, -1.0F, -17.7F, 7.1F, 1, 16, 1, 0.1F, false));
		magazine2.cubeList.add(new ModelBox(magazine2, 48, 329, -3.5F, -17.7F, 7.1F, 1, 16, 1, 0.1F, false));
		magazine2.cubeList.add(new ModelBox(magazine2, 16, 311, -3.5F, -17.7F, 4.1F, 1, 15, 2, 0.1F, false));
		magazine2.cubeList.add(new ModelBox(magazine2, 101, 329, -3.5F, -17.7F, 1.6F, 1, 15, 2, 0.1F, false));
		magazine2.cubeList.add(new ModelBox(magazine2, 16, 341, -3.5F, -17.7F, -0.15F, 1, 15, 1, 0.099F, false));
		magazine2.cubeList.add(new ModelBox(magazine2, 112, 315, -3.5F, -17.7F, -0.65F, 1, 15, 1, 0.1F, false));
		magazine2.cubeList.add(new ModelBox(magazine2, 7, 323, -3.15F, -17.7F, -0.45F, 2, 18, 4, 0.097F, false));
		magazine2.cubeList.add(new ModelBox(magazine2, 42, 339, -3.5F, -2.9F, 4.1F, 1, 1, 2, 0.101F, false));
		magazine2.cubeList.add(new ModelBox(magazine2, 30, 330, -3.5F, -0.5F, 6.55F, 1, 1, 2, 0.099F, false));
		magazine2.cubeList.add(new ModelBox(magazine2, 139, 342, -3.8F, -0.4F, -0.85F, 1, 1, 9, 0.0F, false));
		magazine2.cubeList.add(new ModelBox(magazine2, 254, 348, -3.8F, -2.4F, -1.15F, 1, 3, 1, -0.1F, false));
		magazine2.cubeList.add(new ModelBox(magazine2, 0, 311, -3.35F, -17.7F, 2.85F, 2, 18, 2, 0.096F, false));
		magazine2.cubeList.add(new ModelBox(magazine2, 220, 323, -3.25F, -15.7F, 7.55F, 3, 16, 1, 0.099F, false));
		magazine2.cubeList.add(new ModelBox(magazine2, 0, 341, -3.25F, -17.7F, -1.0F, 3, 18, 1, 0.099F, false));

		cube_r118 = new ModelRenderer(this);
		cube_r118.setRotationPoint(-3.5F, 10.0F, 0.25F);
		magazine2.addChild(cube_r118);
		setRotationAngle(cube_r118, 1.3736F, 0.0F, 0.0F);
		cube_r118.cubeList.add(new ModelBox(cube_r118, 226, 348, 0.0F, 4.4292F, 12.2775F, 1, 1, 1, 0.099F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 214, 346, 0.0F, 1.4292F, 12.2775F, 1, 2, 1, 0.098F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 49, 323, 0.0F, -3.3708F, 12.2775F, 1, 1, 1, 0.098F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 32, 341, 0.0F, -2.9708F, 12.2775F, 1, 1, 1, 0.097F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 210, 346, 0.0F, -1.1708F, 12.2775F, 1, 3, 1, 0.099F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 64, 339, 2.5F, -2.9708F, 12.2775F, 1, 1, 1, 0.097F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 11, 302, 2.5F, -3.3708F, 12.2775F, 1, 1, 1, 0.098F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 48, 339, 2.5F, 4.4292F, 12.2775F, 1, 1, 1, 0.099F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 28, 339, 2.5F, 1.4292F, 12.2775F, 1, 2, 1, 0.098F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 4, 330, 2.5F, -1.1708F, 12.2775F, 1, 3, 1, 0.099F, false));

		cube_r119 = new ModelRenderer(this);
		cube_r119.setRotationPoint(-3.5F, 10.2F, 0.25F);
		magazine2.addChild(cube_r119);
		setRotationAngle(cube_r119, -0.192F, 0.0F, 0.0F);
		cube_r119.cubeList.add(new ModelBox(cube_r119, 55, 315, -0.2F, -12.4949F, -3.7069F, 1, 1, 10, -0.1F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 55, 326, 2.7F, -12.4949F, -3.7069F, 1, 1, 10, -0.1F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		magazine2.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}