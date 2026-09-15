package com.paneedah.mwc.models;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QJY88Grip extends ModelBase {
	private final ModelRenderer grip;
	private final ModelRenderer grip3_r1;
	private final ModelRenderer grip3_r2;
	private final ModelRenderer grip4_r1;
	private final ModelRenderer grip5_r1;
	private final ModelRenderer grip13_r1;

	public QJY88Grip() {
		textureWidth = 512;
		textureHeight = 512;

		grip = new ModelRenderer(this);
		grip.setRotationPoint(0.0F, 23.0F, 2.0F);
		grip.cubeList.add(new ModelBox(grip, 122, 485, -3.0F, -31.0F, -1.0F, 3, 5, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 104, 485, -3.499F, -31.0F, -6.0F, 4, 4, 5, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 474, 124, -3.499F, -32.0F, -6.0F, 4, 1, 9, 0.0F, false));

		grip3_r1 = new ModelRenderer(this);
		grip3_r1.setRotationPoint(-3.5F, -26.0F, -5.5F);
		grip.addChild(grip3_r1);
		setRotationAngle(grip3_r1, 0.3718F, 0.0F, 0.0F);
		grip3_r1.cubeList.add(new ModelBox(grip3_r1, 392, 188, 0.001F, 3.0F, -0.5F, 4, 1, 1, 0.0F, false));
		grip3_r1.cubeList.add(new ModelBox(grip3_r1, 286, 326, 0.0F, -1.5F, 0.0F, 4, 12, 4, 0.0F, false));

		grip3_r2 = new ModelRenderer(this);
		grip3_r2.setRotationPoint(-3.5F, -29.0F, -1.0F);
		grip.addChild(grip3_r2);
		setRotationAngle(grip3_r2, -1.0782F, 0.0F, 0.0F);
		grip3_r2.cubeList.add(new ModelBox(grip3_r2, 456, 160, -0.001F, 0.0F, 0.0F, 4, 3, 12, 0.0F, false));
		grip3_r2.cubeList.add(new ModelBox(grip3_r2, 470, 28, 0.499F, -1.0F, 0.0F, 3, 1, 12, 0.0F, false));

		grip4_r1 = new ModelRenderer(this);
		grip4_r1.setRotationPoint(-3.5F, -16.8F, -2.6F);
		grip.addChild(grip4_r1);
		setRotationAngle(grip4_r1, 0.2231F, 0.0F, 0.0F);
		grip4_r1.cubeList.add(new ModelBox(grip4_r1, 480, 368, 0.001F, 0.0F, 0.0F, 4, 1, 7, 0.0F, false));
		grip4_r1.cubeList.add(new ModelBox(grip4_r1, 404, 356, 0.0F, -0.001F, 6.45F, 4, 1, 1, 0.0F, false));
		grip4_r1.cubeList.add(new ModelBox(grip4_r1, 414, 356, 0.5F, 0.0F, 7.421F, 3, 1, 1, 0.0F, false));
		grip4_r1.cubeList.add(new ModelBox(grip4_r1, 454, 391, 0.501F, -0.25F, 7.42F, 3, 1, 1, 0.0F, false));

		grip5_r1 = new ModelRenderer(this);
		grip5_r1.setRotationPoint(-3.5F, -16.8F, -2.6F);
		grip.addChild(grip5_r1);
		setRotationAngle(grip5_r1, 1.0782F, 0.0F, 0.0F);
		grip5_r1.cubeList.add(new ModelBox(grip5_r1, 464, 452, -0.001F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

		grip13_r1 = new ModelRenderer(this);
		grip13_r1.setRotationPoint(-3.6F, -26.0F, -5.5F);
		grip.addChild(grip13_r1);
		setRotationAngle(grip13_r1, 0.3665F, 0.0F, 0.0F);
		grip13_r1.cubeList.add(new ModelBox(grip13_r1, 192, 395, 3.2F, 0.5F, 1.0F, 1, 9, 4, 0.0F, false));
		grip13_r1.cubeList.add(new ModelBox(grip13_r1, 192, 408, 0.0F, 0.5F, 1.0F, 1, 9, 4, 0.0F, false));
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