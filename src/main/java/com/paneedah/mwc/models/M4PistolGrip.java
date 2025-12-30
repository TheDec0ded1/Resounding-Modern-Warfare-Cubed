package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M4PistolGrip extends ModelBase {
	private final ModelRenderer grip;
	private final ModelRenderer grip3_r1;
	private final ModelRenderer grip3_r2;
	private final ModelRenderer grip4_r1;
	private final ModelRenderer grip5_r1;
	private final ModelRenderer grip13_r1;

	public M4PistolGrip() {
		textureWidth = 416;
		textureHeight = 416;

		grip = new ModelRenderer(this);
		grip.setRotationPoint(0.0F, 24.0F, 0.0F);
		grip.cubeList.add(new ModelBox(grip, 300, 247, -3.0F, -31.0F, -1.0F, 3, 5, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 48, 214, -3.499F, -31.0F, -6.0F, 4, 5, 5, 0.0F, false));

		grip3_r1 = new ModelRenderer(this);
		grip3_r1.setRotationPoint(-3.5F, -26.0F, -5.5F);
		grip.addChild(grip3_r1);
		setRotationAngle(grip3_r1, 0.3718F, 0.0F, 0.0F);
		grip3_r1.cubeList.add(new ModelBox(grip3_r1, 224, 130, 0.001F, 3.0F, -0.5F, 4, 1, 1, 0.0F, false));
		grip3_r1.cubeList.add(new ModelBox(grip3_r1, 180, 132, 0.0F, -0.5F, 0.0F, 4, 11, 4, 0.0F, false));

		grip3_r2 = new ModelRenderer(this);
		grip3_r2.setRotationPoint(-3.5F, -29.0F, -1.0F);
		grip.addChild(grip3_r2);
		setRotationAngle(grip3_r2, -1.0782F, 0.0F, 0.0F);
		grip3_r2.cubeList.add(new ModelBox(grip3_r2, 362, 217, -0.001F, 0.0F, 0.0F, 4, 3, 12, 0.0F, false));
		grip3_r2.cubeList.add(new ModelBox(grip3_r2, 318, 234, 0.499F, -1.0F, 0.0F, 3, 1, 12, 0.0F, false));

		grip4_r1 = new ModelRenderer(this);
		grip4_r1.setRotationPoint(-3.5F, -16.8F, -2.6F);
		grip.addChild(grip4_r1);
		setRotationAngle(grip4_r1, 0.2231F, 0.0F, 0.0F);
		grip4_r1.cubeList.add(new ModelBox(grip4_r1, 214, 122, 0.001F, 0.0F, 0.0F, 4, 1, 7, 0.0F, false));
		grip4_r1.cubeList.add(new ModelBox(grip4_r1, 326, 117, 0.0F, -0.001F, 6.45F, 4, 1, 1, 0.0F, false));
		grip4_r1.cubeList.add(new ModelBox(grip4_r1, 362, 232, 0.5F, 0.0F, 7.421F, 3, 1, 1, 0.0F, false));
		grip4_r1.cubeList.add(new ModelBox(grip4_r1, 364, 139, 0.501F, -0.25F, 7.42F, 3, 1, 1, 0.0F, false));

		grip5_r1 = new ModelRenderer(this);
		grip5_r1.setRotationPoint(-3.5F, -16.8F, -2.6F);
		grip.addChild(grip5_r1);
		setRotationAngle(grip5_r1, 1.0782F, 0.0F, 0.0F);
		grip5_r1.cubeList.add(new ModelBox(grip5_r1, 282, 119, -0.001F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

		grip13_r1 = new ModelRenderer(this);
		grip13_r1.setRotationPoint(-3.6F, -26.0F, -5.5F);
		grip.addChild(grip13_r1);
		setRotationAngle(grip13_r1, 0.3665F, 0.0F, 0.0F);
		grip13_r1.cubeList.add(new ModelBox(grip13_r1, 164, 208, 3.2F, 0.5F, 1.0F, 1, 9, 4, 0.0F, false));
		grip13_r1.cubeList.add(new ModelBox(grip13_r1, 180, 301, 0.0F, 0.5F, 1.0F, 1, 9, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		grip.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}