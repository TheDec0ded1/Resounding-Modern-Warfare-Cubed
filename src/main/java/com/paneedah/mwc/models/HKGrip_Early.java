package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class HKGrip_Early extends ModelBase {
	private final ModelRenderer HKgripEarly;
	private final ModelRenderer grip3_r2;
	private final ModelRenderer grip8_r4;
	private final ModelRenderer grip9_r2;
	private final ModelRenderer grip12_r2;
	private final ModelRenderer grip12_r4;
	private final ModelRenderer grip10_r3;
	private final ModelRenderer grip10_r4;
	private final ModelRenderer grip8_r5;
	private final ModelRenderer grip7_r2;
	private final ModelRenderer grip12_r5;

	public HKGrip_Early() {
		textureWidth = 256;
		textureHeight = 256;

		HKgripEarly = new ModelRenderer(this);
		HKgripEarly.setRotationPoint(0.0F, 23.75F, 0.0F);
		HKgripEarly.cubeList.add(new ModelBox(HKgripEarly, 238, 170, -3.0F, -30.75F, -1.0F, 3, 5, 1, 0.0F, false));
		HKgripEarly.cubeList.add(new ModelBox(HKgripEarly, 132, 222, -3.499F, -30.75F, -6.0F, 4, 5, 5, 0.0F, false));

		grip3_r2 = new ModelRenderer(this);
		grip3_r2.setRotationPoint(-3.5F, -25.7F, -5.25F);
		HKgripEarly.addChild(grip3_r2);
		setRotationAngle(grip3_r2, 0.3194F, 0.0F, 0.0F);
		grip3_r2.cubeList.add(new ModelBox(grip3_r2, 196, 60, 0.001F, -0.268F, -0.0933F, 4, 1, 1, 0.0F, false));
		grip3_r2.cubeList.add(new ModelBox(grip3_r2, 196, 81, 0.001F, 2.482F, -0.8933F, 4, 1, 1, 0.0F, false));
		grip3_r2.cubeList.add(new ModelBox(grip3_r2, 210, 165, 0.002F, 0.732F, -0.0933F, 4, 9, 5, 0.0F, false));

		grip8_r4 = new ModelRenderer(this);
		grip8_r4.setRotationPoint(-3.5F, -26.25F, -1.0F);
		HKgripEarly.addChild(grip8_r4);
		setRotationAngle(grip8_r4, -1.0345F, 0.0F, 0.0F);
		grip8_r4.cubeList.add(new ModelBox(grip8_r4, 0, 227, -0.001F, -0.8836F, -1.7787F, 4, 1, 5, 0.0F, false));

		grip9_r2 = new ModelRenderer(this);
		grip9_r2.setRotationPoint(-3.5F, -23.9F, 1.4F);
		HKgripEarly.addChild(grip9_r2);
		setRotationAngle(grip9_r2, -1.2789F, 0.0F, 0.0F);
		grip9_r2.cubeList.add(new ModelBox(grip9_r2, 232, 114, 0.001F, -0.0144F, -0.0479F, 4, 1, 4, 0.0F, false));

		grip12_r2 = new ModelRenderer(this);
		grip12_r2.setRotationPoint(-3.5F, -15.75F, 0.15F);
		HKgripEarly.addChild(grip12_r2);
		setRotationAngle(grip12_r2, 0.2269F, 0.0F, 0.0F);
		grip12_r2.cubeList.add(new ModelBox(grip12_r2, 144, 233, -0.001F, -2.0487F, 0.0113F, 4, 2, 3, 0.0F, false));

		grip12_r4 = new ModelRenderer(this);
		grip12_r4.setRotationPoint(-3.5F, -16.85F, -2.85F);
		HKgripEarly.addChild(grip12_r4);
		setRotationAngle(grip12_r4, -0.0349F, 0.0F, 0.0F);
		grip12_r4.cubeList.add(new ModelBox(grip12_r4, 172, 81, 0.001F, -1.05F, 0.9983F, 4, 1, 2, 0.0F, false));
		grip12_r4.cubeList.add(new ModelBox(grip12_r4, 234, 234, 0.0F, -0.05F, -0.0017F, 4, 1, 3, 0.0F, false));

		grip10_r3 = new ModelRenderer(this);
		grip10_r3.setRotationPoint(-3.5F, -20.1F, 2.55F);
		HKgripEarly.addChild(grip10_r3);
		setRotationAngle(grip10_r3, -1.3662F, 0.0F, 0.0F);
		grip10_r3.cubeList.add(new ModelBox(grip10_r3, 236, 11, 0.0F, -0.0102F, -0.049F, 4, 1, 3, 0.0F, false));

		grip10_r4 = new ModelRenderer(this);
		grip10_r4.setRotationPoint(-3.0F, -20.3F, 3.05F);
		HKgripEarly.addChild(grip10_r4);
		setRotationAngle(grip10_r4, -1.3662F, 0.0F, 0.0F);
		grip10_r4.cubeList.add(new ModelBox(grip10_r4, 238, 176, 0.0F, -0.0102F, 2.701F, 3, 1, 1, 0.0F, false));
		grip10_r4.cubeList.add(new ModelBox(grip10_r4, 20, 238, -0.001F, -0.0112F, -0.049F, 3, 1, 3, 0.0F, false));

		grip8_r5 = new ModelRenderer(this);
		grip8_r5.setRotationPoint(-3.0F, -24.1F, 1.9F);
		HKgripEarly.addChild(grip8_r5);
		setRotationAngle(grip8_r5, -1.2789F, 0.0F, 0.0F);
		grip8_r5.cubeList.add(new ModelBox(grip8_r5, 158, 233, 0.0F, -0.0144F, -0.0479F, 3, 1, 4, 0.0F, false));

		grip7_r2 = new ModelRenderer(this);
		grip7_r2.setRotationPoint(-3.0F, -27.25F, -1.0F);
		HKgripEarly.addChild(grip7_r2);
		setRotationAngle(grip7_r2, -1.0345F, 0.0F, 0.0F);
		grip7_r2.cubeList.add(new ModelBox(grip7_r2, 172, 233, -0.001F, -0.8836F, 0.2213F, 3, 1, 4, 0.0F, false));

		grip12_r5 = new ModelRenderer(this);
		grip12_r5.setRotationPoint(-3.6F, -26.3F, -5.7F);
		HKgripEarly.addChild(grip12_r5);
		setRotationAngle(grip12_r5, 0.302F, 0.0F, 0.0F);
		grip12_r5.cubeList.add(new ModelBox(grip12_r5, 54, 229, 0.0F, 0.7318F, 0.9059F, 1, 9, 4, 0.0F, false));
		grip12_r5.cubeList.add(new ModelBox(grip12_r5, 64, 229, 3.2F, 0.7318F, 0.9059F, 1, 9, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		HKgripEarly.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}