package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class CQGrip extends ModelBase {
	private final ModelRenderer grip;
	private final ModelRenderer grip3_r1;
	private final ModelRenderer grip3_r2;
	private final ModelRenderer grip4_r1;
	private final ModelRenderer grip5_r1;
	private final ModelRenderer grip13_r1;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;

	public CQGrip() {
		textureWidth = 200;
		textureHeight = 200;

		grip = new ModelRenderer(this);
		grip.setRotationPoint(0.0F, 24.0F, 0.0F);
		grip.cubeList.add(new ModelBox(grip, 0, 19, -3.0F, -31.0F, -1.0F, 3, 5, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 20, 19, -3.499F, -31.0F, -6.0F, 4, 5, 5, 0.0F, false));

		grip3_r1 = new ModelRenderer(this);
		grip3_r1.setRotationPoint(-3.5F, -26.0F, -30.5F);
		grip.addChild(grip3_r1);
		setRotationAngle(grip3_r1, 0.5463F, 0.0F, 0.0F);
		grip3_r1.cubeList.add(new ModelBox(grip3_r1, 0, 0, 0.001F, 12.7292F, 20.9337F, 4, 5, 4, 0.0F, false));

		grip3_r2 = new ModelRenderer(this);
		grip3_r2.setRotationPoint(-3.5F, -26.75F, -1.75F);
		grip.addChild(grip3_r2);
		setRotationAngle(grip3_r2, -0.9473F, 0.0F, 0.0F);
		grip3_r2.cubeList.add(new ModelBox(grip3_r2, 7, 68, 0.001F, -0.7918F, -0.1904F, 4, 3, 5, 0.0F, false));
		grip3_r2.cubeList.add(new ModelBox(grip3_r2, 93, 32, 0.501F, -1.7918F, -0.1904F, 3, 1, 5, 0.0F, false));

		grip4_r1 = new ModelRenderer(this);
		grip4_r1.setRotationPoint(-3.5F, -16.8F, -2.6F);
		grip.addChild(grip4_r1);
		setRotationAngle(grip4_r1, 0.2231F, 0.0F, 0.0F);
		

		grip5_r1 = new ModelRenderer(this);
		grip5_r1.setRotationPoint(-3.5F, -16.8F, -2.6F);
		grip.addChild(grip5_r1);
		setRotationAngle(grip5_r1, 1.0782F, 0.0F, 0.0F);
		

		grip13_r1 = new ModelRenderer(this);
		grip13_r1.setRotationPoint(-3.6F, -27.25F, -31.0F);
		grip.addChild(grip13_r1);
		setRotationAngle(grip13_r1, 0.3665F, 0.0F, 0.0F);
		grip13_r1.cubeList.add(new ModelBox(grip13_r1, 43, 19, 3.2F, 9.4588F, 24.3397F, 1, 9, 4, 0.0F, false));
		grip13_r1.cubeList.add(new ModelBox(grip13_r1, 43, 43, 0.0F, 9.4588F, 24.3397F, 1, 9, 4, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		grip.addChild(bone);
		setRotationAngle(bone, 0.1745F, 0.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -3.499F, -23.2385F, 0.4225F, 4, 6, 4, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-1.501F, -20.5297F, 5.4197F);
		grip.addChild(bone2);
		setRotationAngle(bone2, 1.8762F, 0.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 7, 68, -1.998F, -5.7112F, -1.2324F, 4, 3, 5, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 93, 32, -1.498F, -2.7614F, -0.9197F, 3, 1, 5, 0.0F, false));
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