package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M110Mag10 extends ModelBase {
	private final ModelRenderer magazine;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;

	public M110Mag10() {
		textureWidth = 310;
		textureHeight = 310;

		magazine = new ModelRenderer(this);
		magazine.setRotationPoint(0.25F, -10.4F, -22.7F);
		magazine.cubeList.add(new ModelBox(magazine, 14, 86, -1.0F, 0.0F, 0.0F, 1, 9, 2, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 0, 0, -3.25F, -0.001F, -0.1F, 3, 9, 7, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 44, 116, -3.251F, -0.002F, 6.4F, 3, 9, 2, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 70, 117, -1.0F, 0.0F, 2.75F, 1, 9, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 62, 117, -1.0F, 0.1F, 4.5F, 1, 9, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 54, 116, -1.0F, 0.0F, 6.5F, 1, 10, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 112, 26, -0.8F, 0.0F, 7.8F, 1, 10, 1, -0.2F, false));
		magazine.cubeList.add(new ModelBox(magazine, 7, 41, -0.799F, 8.9F, 7.799F, 1, 2, 1, -0.2F, false));
		magazine.cubeList.add(new ModelBox(magazine, 108, 27, -3.7F, 0.0F, 7.8F, 1, 10, 1, -0.2F, false));
		magazine.cubeList.add(new ModelBox(magazine, 0, 41, -3.701F, 8.9F, 7.799F, 1, 2, 1, -0.2F, false));
		magazine.cubeList.add(new ModelBox(magazine, 20, 0, -3.5F, 0.0F, 0.0F, 1, 9, 2, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 66, 117, -3.5F, 0.0F, 2.75F, 1, 9, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 30, 116, -3.5F, 0.1F, 4.5F, 1, 9, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 34, 116, -3.5F, 0.0F, 6.5F, 1, 10, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 73, 83, -3.25F, 2.0F, 8.15F, 3, 8, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 8, 86, -3.249F, 9.7F, 8.149F, 3, 1, 1, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-2.5F, 9.0F, 0.0F);
		magazine.addChild(cube_r16);
		setRotationAngle(cube_r16, 1.3788F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 14, 44, -0.998F, 6.5F, -0.001F, 1, 1, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 14, 28, -0.999F, 2.8F, 0.0F, 1, 4, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 14, 41, -0.999F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 7, 44, 1.502F, 6.5F, -0.001F, 1, 1, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 22, 17, 1.501F, 2.8F, 0.0F, 1, 4, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 18, 76, -0.748F, 7.5F, -0.001F, 3, 1, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 28, -0.749F, 0.0F, -0.002F, 3, 8, 2, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 21, 41, 1.501F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-3.3F, -6.0F, 7.4F);
		magazine.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, 0.3491F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 41, 2.0523F, 4.6381F, -4.001F, 1, 1, 5, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-0.2F, -6.0F, 7.4F);
		magazine.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, -0.3491F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 14, 41, -3.0523F, 4.6381F, -4.001F, 1, 1, 5, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-3.5F, -6.0F, 6.5F);
		magazine.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, 0.3491F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 17, 0, 2.0523F, 4.6381F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.0F, -6.0F, 6.5F);
		magazine.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, -0.3491F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 43, 31, -3.0523F, 4.6381F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-3.5F, -5.9F, 4.5F);
		magazine.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, 0.3491F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 8, 28, 2.0523F, 4.6381F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(0.0F, -5.9F, 4.5F);
		magazine.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, -0.3491F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 44, -3.0523F, 4.6381F, 0.0F, 1, 1, 1, 0.0F, false));
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