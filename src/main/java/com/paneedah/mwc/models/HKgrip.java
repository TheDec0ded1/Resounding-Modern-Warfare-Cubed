package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class HKgrip extends ModelBase {
	private final ModelRenderer HKgrip;
	private final ModelRenderer grip3_r3;
	private final ModelRenderer grip8_r6;
	private final ModelRenderer grip8_r7;
	private final ModelRenderer grip9_r3;
	private final ModelRenderer grip12_r6;
	private final ModelRenderer grip12_r7;
	private final ModelRenderer grip10_r5;
	private final ModelRenderer grip10_r6;
	private final ModelRenderer grip8_r8;
	private final ModelRenderer grip7_r3;
	private final ModelRenderer grip12_r8;

	public HKgrip() {
		textureWidth = 256;
		textureHeight = 256;

		HKgrip = new ModelRenderer(this);
		HKgrip.setRotationPoint(0.0F, 24.0F, 0.0F);
		HKgrip.cubeList.add(new ModelBox(HKgrip, 240, 78, -3.0F, -31.0F, -1.0F, 3, 5, 1, 0.0F, false));
		HKgrip.cubeList.add(new ModelBox(HKgrip, 224, 214, -3.499F, -31.0F, -6.0F, 4, 5, 5, 0.0F, false));

		grip3_r3 = new ModelRenderer(this);
		grip3_r3.setRotationPoint(-3.5F, -25.7F, -5.25F);
		HKgrip.addChild(grip3_r3);
		setRotationAngle(grip3_r3, 0.3194F, 0.0F, 0.0F);
		grip3_r3.cubeList.add(new ModelBox(grip3_r3, 132, 219, 0.001F, -0.5053F, -0.0148F, 4, 1, 1, 0.0F, false));
		grip3_r3.cubeList.add(new ModelBox(grip3_r3, 214, 0, 0.002F, 0.4947F, -0.0148F, 4, 9, 5, 0.0F, false));

		grip8_r6 = new ModelRenderer(this);
		grip8_r6.setRotationPoint(-2.1F, -29.7F, 0.0F);
		HKgrip.addChild(grip8_r6);
		setRotationAngle(grip8_r6, -0.7243F, 0.0F, 0.0F);
		grip8_r6.cubeList.add(new ModelBox(grip8_r6, 236, 49, -1.0F, -3.2247F, -2.1988F, 3, 5, 2, 0.0F, false));
		grip8_r6.cubeList.add(new ModelBox(grip8_r6, 36, 192, 1.2F, -3.2257F, -2.1998F, 1, 5, 2, 0.0F, false));

		grip8_r7 = new ModelRenderer(this);
		grip8_r7.setRotationPoint(-3.5F, -26.25F, -1.0F);
		HKgrip.addChild(grip8_r7);
		setRotationAngle(grip8_r7, -1.0345F, 0.0F, 0.0F);
		grip8_r7.cubeList.add(new ModelBox(grip8_r7, 112, 228, -0.001F, -1.0114F, -1.9936F, 4, 1, 5, 0.0F, false));

		grip9_r3 = new ModelRenderer(this);
		grip9_r3.setRotationPoint(-3.5F, -23.9F, 1.4F);
		HKgrip.addChild(grip9_r3);
		setRotationAngle(grip9_r3, -1.2789F, 0.0F, 0.0F);
		grip9_r3.cubeList.add(new ModelBox(grip9_r3, 232, 119, 0.001F, -0.0863F, -0.2873F, 4, 1, 4, 0.0F, false));

		grip12_r6 = new ModelRenderer(this);
		grip12_r6.setRotationPoint(-3.5F, -15.75F, 0.15F);
		HKgrip.addChild(grip12_r6);
		setRotationAngle(grip12_r6, 0.2269F, 0.0F, 0.0F);
		grip12_r6.cubeList.add(new ModelBox(grip12_r6, 186, 233, -0.001F, -2.2923F, 0.0675F, 4, 2, 3, 0.0F, false));

		grip12_r7 = new ModelRenderer(this);
		grip12_r7.setRotationPoint(-3.5F, -16.85F, -2.85F);
		HKgrip.addChild(grip12_r7);
		setRotationAngle(grip12_r7, -0.0349F, 0.0F, 0.0F);
		grip12_r7.cubeList.add(new ModelBox(grip12_r7, 174, 60, 0.001F, -1.2998F, 0.9895F, 4, 1, 2, 0.0F, false));
		grip12_r7.cubeList.add(new ModelBox(grip12_r7, 236, 15, 0.0F, -0.2998F, -0.0105F, 4, 1, 3, 0.0F, false));

		grip10_r5 = new ModelRenderer(this);
		grip10_r5.setRotationPoint(-3.5F, -20.1F, 2.55F);
		HKgrip.addChild(grip10_r5);
		setRotationAngle(grip10_r5, -1.3662F, 0.0F, 0.0F);
		grip10_r5.cubeList.add(new ModelBox(grip10_r5, 236, 19, 0.0F, -0.0609F, -0.2937F, 4, 1, 3, 0.0F, false));

		grip10_r6 = new ModelRenderer(this);
		grip10_r6.setRotationPoint(-3.0F, -20.3F, 3.05F);
		HKgrip.addChild(grip10_r6);
		setRotationAngle(grip10_r6, -1.3662F, 0.0F, 0.0F);
		grip10_r6.cubeList.add(new ModelBox(grip10_r6, 122, 242, 0.0F, -0.0609F, 2.4563F, 3, 1, 1, 0.0F, false));
		grip10_r6.cubeList.add(new ModelBox(grip10_r6, 122, 238, -0.001F, -0.0619F, -0.2937F, 3, 1, 3, 0.0F, false));

		grip8_r8 = new ModelRenderer(this);
		grip8_r8.setRotationPoint(-3.0F, -24.1F, 1.9F);
		HKgrip.addChild(grip8_r8);
		setRotationAngle(grip8_r8, -1.2789F, 0.0F, 0.0F);
		grip8_r8.cubeList.add(new ModelBox(grip8_r8, 234, 24, 0.0F, -0.0863F, -0.2873F, 3, 1, 4, 0.0F, false));

		grip7_r3 = new ModelRenderer(this);
		grip7_r3.setRotationPoint(-3.0F, -27.25F, -1.0F);
		HKgrip.addChild(grip7_r3);
		setRotationAngle(grip7_r3, -1.0345F, 0.0F, 0.0F);
		grip7_r3.cubeList.add(new ModelBox(grip7_r3, 234, 29, -0.001F, -1.0114F, 0.0064F, 3, 1, 4, 0.0F, false));

		grip12_r8 = new ModelRenderer(this);
		grip12_r8.setRotationPoint(-3.6F, -26.3F, -5.7F);
		HKgrip.addChild(grip12_r8);
		setRotationAngle(grip12_r8, 0.302F, 0.0F, 0.0F);
		grip12_r8.cubeList.add(new ModelBox(grip12_r8, 230, 74, 0.0F, 0.4931F, 0.9802F, 1, 9, 4, 0.0F, false));
		grip12_r8.cubeList.add(new ModelBox(grip12_r8, 84, 230, 3.2F, 0.4931F, 0.9802F, 1, 9, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		HKgrip.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}