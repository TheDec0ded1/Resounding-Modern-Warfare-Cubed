package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class LR300Foregrip extends ModelBase {
	private final ModelRenderer foregrip;
	private final ModelRenderer grip3_r3;
	private final ModelRenderer grip3_r4;
	private final ModelRenderer grip4_r2;
	private final ModelRenderer grip5_r2;
	private final ModelRenderer grip13_r2;

	public LR300Foregrip() {
		textureWidth = 368;
		textureHeight = 368;

		foregrip = new ModelRenderer(this);
		foregrip.setRotationPoint(-2.9427F, -6.5143F, -34.0286F);
		setRotationAngle(foregrip, -0.3054F, 0.0F, 0.0F);
		foregrip.cubeList.add(new ModelBox(foregrip, 234, 341, -0.0573F, -6.4857F, 2.0286F, 3, 5, 1, 0.0F, false));
		foregrip.cubeList.add(new ModelBox(foregrip, 326, 217, -0.5563F, -6.4857F, -2.9714F, 4, 5, 5, 0.0F, false));

		grip3_r3 = new ModelRenderer(this);
		grip3_r3.setRotationPoint(-0.5573F, -1.4857F, -2.4714F);
		foregrip.addChild(grip3_r3);
		setRotationAngle(grip3_r3, 0.3718F, 0.0F, 0.0F);
		grip3_r3.cubeList.add(new ModelBox(grip3_r3, 144, 298, 0.001F, 3.0F, -0.5F, 4, 1, 1, 0.0F, false));
		grip3_r3.cubeList.add(new ModelBox(grip3_r3, 326, 147, 0.0F, -0.5F, 0.0F, 4, 11, 4, 0.0F, false));

		grip3_r4 = new ModelRenderer(this);
		grip3_r4.setRotationPoint(-0.5573F, -4.4857F, 2.0286F);
		foregrip.addChild(grip3_r4);
		setRotationAngle(grip3_r4, -1.0782F, 0.0F, 0.0F);
		grip3_r4.cubeList.add(new ModelBox(grip3_r4, 176, 300, -0.001F, 0.0F, 0.0F, 4, 3, 12, 0.0F, false));
		grip3_r4.cubeList.add(new ModelBox(grip3_r4, 238, 311, 0.499F, -1.0F, 0.0F, 3, 1, 12, 0.0F, false));

		grip4_r2 = new ModelRenderer(this);
		grip4_r2.setRotationPoint(-0.5573F, 7.7143F, 0.4286F);
		foregrip.addChild(grip4_r2);
		setRotationAngle(grip4_r2, 0.2231F, 0.0F, 0.0F);
		grip4_r2.cubeList.add(new ModelBox(grip4_r2, 326, 181, 0.001F, 0.0F, 0.0F, 4, 1, 7, 0.0F, false));
		grip4_r2.cubeList.add(new ModelBox(grip4_r2, 154, 298, 0.0F, -0.001F, 6.45F, 4, 1, 1, 0.0F, false));
		grip4_r2.cubeList.add(new ModelBox(grip4_r2, 344, 51, 0.5F, 0.0F, 7.421F, 3, 1, 1, 0.0F, false));
		grip4_r2.cubeList.add(new ModelBox(grip4_r2, 150, 344, 0.501F, -0.25F, 7.42F, 3, 1, 1, 0.0F, false));

		grip5_r2 = new ModelRenderer(this);
		grip5_r2.setRotationPoint(-0.5573F, 7.7143F, 0.4286F);
		foregrip.addChild(grip5_r2);
		setRotationAngle(grip5_r2, 1.0782F, 0.0F, 0.0F);
		grip5_r2.cubeList.add(new ModelBox(grip5_r2, 308, 117, -0.001F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

		grip13_r2 = new ModelRenderer(this);
		grip13_r2.setRotationPoint(-0.6573F, -1.4857F, -2.4714F);
		foregrip.addChild(grip13_r2);
		setRotationAngle(grip13_r2, 0.3665F, 0.0F, 0.0F);
		grip13_r2.cubeList.add(new ModelBox(grip13_r2, 330, 22, 3.2F, 0.5F, 1.0F, 1, 9, 4, 0.0F, false));
		grip13_r2.cubeList.add(new ModelBox(grip13_r2, 26, 330, 0.0F, 0.5F, 1.0F, 1, 9, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		foregrip.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}