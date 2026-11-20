package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class DDGrip extends ModelBase {
	private final ModelRenderer dd_grip;
	private final ModelRenderer grip3_r1;
	private final ModelRenderer grip9_r1;
	private final ModelRenderer grip9_r1_r1;
	private final ModelRenderer grip12_r1;
	private final ModelRenderer grip12_r2;
	private final ModelRenderer grip10_r1;
	private final ModelRenderer grip10_r2;
	private final ModelRenderer grip8_r3;
	private final ModelRenderer grip8_r3_r1;

	public DDGrip() {
		textureWidth = 432;
		textureHeight = 432;

		dd_grip = new ModelRenderer(this);
		dd_grip.setRotationPoint(0.0F, 23.7F, 0.0F);
		dd_grip.cubeList.add(new ModelBox(dd_grip, 182, 249, -3.0F, -30.7F, -1.0F, 3, 5, 1, 0.0F, false));
		dd_grip.cubeList.add(new ModelBox(dd_grip, 364, 173, -3.499F, -30.7F, -6.0F, 4, 5, 5, 0.0F, false));

		grip3_r1 = new ModelRenderer(this);
		grip3_r1.setRotationPoint(-3.5F, -25.7F, -5.25F);
		dd_grip.addChild(grip3_r1);
		setRotationAngle(grip3_r1, 0.3194F, 0.0F, 0.0F);
		grip3_r1.cubeList.add(new ModelBox(grip3_r1, 298, 149, 0.001F, -0.2205F, -0.109F, 4, 1, 3, 0.0F, false));
		grip3_r1.cubeList.add(new ModelBox(grip3_r1, 202, 132, 0.002F, 0.7795F, -0.109F, 4, 9, 5, 0.0F, false));

		grip9_r1 = new ModelRenderer(this);
		grip9_r1.setRotationPoint(-3.5F, -23.9F, 1.4F);
		dd_grip.addChild(grip9_r1);
		setRotationAngle(grip9_r1, -1.2789F, 0.0F, 0.0F);
		

		grip9_r1_r1 = new ModelRenderer(this);
		grip9_r1_r1.setRotationPoint(1.9995F, 0.7045F, -1.5124F);
		grip9_r1.addChild(grip9_r1_r1);
		setRotationAngle(grip9_r1_r1, 0.0873F, 0.0F, 0.0F);
		grip9_r1_r1.cubeList.add(new ModelBox(grip9_r1_r1, 366, 228, -1.9995F, -0.2318F, -4.4762F, 4, 1, 10, 0.0F, false));

		grip12_r1 = new ModelRenderer(this);
		grip12_r1.setRotationPoint(-3.5F, -15.75F, 0.15F);
		dd_grip.addChild(grip12_r1);
		setRotationAngle(grip12_r1, 0.2269F, 0.0F, 0.0F);
		grip12_r1.cubeList.add(new ModelBox(grip12_r1, 330, 242, -0.001F, -2.0F, -1.0F, 4, 2, 4, 0.0F, false));

		grip12_r2 = new ModelRenderer(this);
		grip12_r2.setRotationPoint(-3.5F, -16.85F, -2.85F);
		dd_grip.addChild(grip12_r2);
		setRotationAngle(grip12_r2, -0.0349F, 0.0F, 0.0F);
		grip12_r2.cubeList.add(new ModelBox(grip12_r2, 160, 146, 0.001F, -0.5003F, 1.0175F, 4, 1, 1, 0.0F, false));
		grip12_r2.cubeList.add(new ModelBox(grip12_r2, 202, 146, 0.001F, -6.4059F, -1.7903F, 4, 1, 1, -0.01F, false));
		grip12_r2.cubeList.add(new ModelBox(grip12_r2, 284, 215, -0.001F, 0.2535F, 0.0706F, 4, 1, 2, 0.0F, false));

		grip10_r1 = new ModelRenderer(this);
		grip10_r1.setRotationPoint(-3.5F, -20.1F, 2.55F);
		dd_grip.addChild(grip10_r1);
		setRotationAngle(grip10_r1, -1.3662F, 0.0F, 0.0F);
		grip10_r1.cubeList.add(new ModelBox(grip10_r1, 234, 303, 0.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

		grip10_r2 = new ModelRenderer(this);
		grip10_r2.setRotationPoint(-3.0F, -20.3F, 3.05F);
		dd_grip.addChild(grip10_r2);
		setRotationAngle(grip10_r2, -1.3662F, 0.0F, 0.0F);
		grip10_r2.cubeList.add(new ModelBox(grip10_r2, 290, 183, 0.0F, 0.0F, 2.75F, 3, 1, 1, 0.0F, false));
		grip10_r2.cubeList.add(new ModelBox(grip10_r2, 386, 379, -0.001F, -0.001F, 0.0F, 3, 1, 3, 0.0F, false));

		grip8_r3 = new ModelRenderer(this);
		grip8_r3.setRotationPoint(-3.0F, -24.1F, 1.9F);
		dd_grip.addChild(grip8_r3);
		setRotationAngle(grip8_r3, -1.2789F, 0.0F, 0.0F);
		

		grip8_r3_r1 = new ModelRenderer(this);
		grip8_r3_r1.setRotationPoint(1.4995F, 1.2337F, -1.4181F);
		grip8_r3.addChild(grip8_r3_r1);
		setRotationAngle(grip8_r3_r1, 0.0873F, 0.0F, 0.0F);
		grip8_r3_r1.cubeList.add(new ModelBox(grip8_r3_r1, 340, 173, -1.5005F, -0.7682F, -3.5238F, 3, 1, 9, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		dd_grip.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}