package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class NGSWRMetalMag extends ModelBase {
	private final ModelRenderer magazine;
	private final ModelRenderer cube_r119;
	private final ModelRenderer cube_r120;
	private final ModelRenderer cube_r121;
	private final ModelRenderer cube_r122;
	private final ModelRenderer cube_r123;
	private final ModelRenderer cube_r124;
	private final ModelRenderer cube_r125;

	public NGSWRMetalMag() {
		textureWidth = 256;
		textureHeight = 256;

		magazine = new ModelRenderer(this);
		magazine.setRotationPoint(0.25F, -3.8F, -24.0F);
		magazine.cubeList.add(new ModelBox(magazine, 0, 211, -1.0F, -6.0F, 0.0F, 1, 15, 2, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 0, 234, -3.25F, -6.001F, -0.1F, 3, 15, 7, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 20, 239, -3.251F, -6.002F, 6.4F, 3, 15, 2, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 94, 235, -0.8F, -6.0F, 3.8F, 1, 16, 5, -0.2F, false));
		magazine.cubeList.add(new ModelBox(magazine, 86, 225, -0.799F, 8.9F, 7.799F, 1, 2, 1, -0.2F, false));
		magazine.cubeList.add(new ModelBox(magazine, 131, 235, -3.7F, -6.0F, 3.8F, 1, 16, 5, -0.2F, false));
		magazine.cubeList.add(new ModelBox(magazine, 106, 212, -3.701F, 8.9F, 7.799F, 1, 2, 1, -0.2F, false));
		magazine.cubeList.add(new ModelBox(magazine, 106, 212, -3.7F, 8.4F, 1.2F, 1, 1, 1, -0.2F, false));
		magazine.cubeList.add(new ModelBox(magazine, 86, 225, -0.798F, 8.4F, 1.2F, 1, 1, 1, -0.2F, false));
		magazine.cubeList.add(new ModelBox(magazine, 19, 209, -3.5F, -6.0F, 0.0F, 1, 15, 2, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 47, 241, -3.25F, -4.0F, 8.15F, 3, 14, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 76, 215, -3.249F, 9.7F, 8.149F, 3, 1, 1, 0.0F, false));

		cube_r119 = new ModelRenderer(this);
		cube_r119.setRotationPoint(-2.5F, 9.0F, 0.0F);
		magazine.addChild(cube_r119);
		setRotationAngle(cube_r119, 1.3788F, 0.0F, 0.0F);
		cube_r119.cubeList.add(new ModelBox(cube_r119, 178, 179, -1.001F, 7.1764F, -0.1424F, 1, 1, 1, 0.0F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 145, 204, -1.002F, 4.0764F, -0.1414F, 1, 4, 1, 0.0F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 148, 233, -0.999F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 208, 172, 1.499F, 7.1764F, -0.1424F, 1, 1, 1, 0.0F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 224, 204, 1.498F, 4.0764F, -0.1414F, 1, 4, 1, 0.0F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 147, 237, -0.748F, 7.5F, -0.001F, 3, 1, 1, 0.0F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 110, 209, -0.749F, 0.0F, -0.002F, 3, 8, 2, 0.0F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 115, 180, 1.501F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 148, 233, -0.999F, 0.8F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 115, 180, 1.501F, 0.8F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r120 = new ModelRenderer(this);
		cube_r120.setRotationPoint(-3.3F, -6.0F, 7.4F);
		magazine.addChild(cube_r120);
		setRotationAngle(cube_r120, 0.0F, 0.0F, 0.3491F);
		cube_r120.cubeList.add(new ModelBox(cube_r120, 224, 226, 0.0F, -1.0F, -4.001F, 1, 1, 5, 0.0F, false));

		cube_r121 = new ModelRenderer(this);
		cube_r121.setRotationPoint(-0.2F, -6.0F, 7.4F);
		magazine.addChild(cube_r121);
		setRotationAngle(cube_r121, 0.0F, 0.0F, -0.3491F);
		cube_r121.cubeList.add(new ModelBox(cube_r121, 231, 242, -1.0F, -1.0F, -4.001F, 1, 1, 5, 0.0F, false));

		cube_r122 = new ModelRenderer(this);
		cube_r122.setRotationPoint(-3.5F, -6.0F, 6.5F);
		magazine.addChild(cube_r122);
		setRotationAngle(cube_r122, 0.0F, 0.0F, 0.3491F);
		

		cube_r123 = new ModelRenderer(this);
		cube_r123.setRotationPoint(0.0F, -6.0F, 6.5F);
		magazine.addChild(cube_r123);
		setRotationAngle(cube_r123, 0.0F, 0.0F, -0.3491F);
		

		cube_r124 = new ModelRenderer(this);
		cube_r124.setRotationPoint(-3.5F, -5.9F, 4.5F);
		magazine.addChild(cube_r124);
		setRotationAngle(cube_r124, 0.0F, 0.0F, 0.3491F);
		

		cube_r125 = new ModelRenderer(this);
		cube_r125.setRotationPoint(0.0F, -5.9F, 4.5F);
		magazine.addChild(cube_r125);
		setRotationAngle(cube_r125, 0.0F, 0.0F, -0.3491F);
		
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		magazine.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}