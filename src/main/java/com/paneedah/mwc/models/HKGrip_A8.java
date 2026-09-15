package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class HKGrip_A8 extends ModelBase {
	private final ModelRenderer HKgripA8;
	private final ModelRenderer grip3_r4;
	private final ModelRenderer grip3_r3_r1;
	private final ModelRenderer grip3_r3_r2;
	private final ModelRenderer grip8_r9;
	private final ModelRenderer grip12_r11;

	public HKGrip_A8() {
		textureWidth = 256;
		textureHeight = 256;

		HKgripA8 = new ModelRenderer(this);
		HKgripA8.setRotationPoint(0.0F, 24.0F, 0.0F);
		HKgripA8.cubeList.add(new ModelBox(HKgripA8, 240, 142, -3.0F, -31.0F, -1.0F, 3, 5, 1, 0.0F, false));
		HKgripA8.cubeList.add(new ModelBox(HKgripA8, 224, 224, -3.499F, -31.0F, -6.0F, 4, 5, 5, 0.0F, false));

		grip3_r4 = new ModelRenderer(this);
		grip3_r4.setRotationPoint(-3.5F, -25.7F, -5.25F);
		HKgripA8.addChild(grip3_r4);
		setRotationAngle(grip3_r4, 0.3194F, 0.0F, 0.0F);
		

		grip3_r3_r1 = new ModelRenderer(this);
		grip3_r3_r1.setRotationPoint(2.0F, 2.4947F, 1.4852F);
		grip3_r4.addChild(grip3_r3_r1);
		setRotationAngle(grip3_r3_r1, 0.1309F, 0.0F, 0.0F);
		grip3_r3_r1.cubeList.add(new ModelBox(grip3_r3_r1, 94, 230, -1.498F, -3.1801F, 3.3371F, 3, 14, 1, 0.0F, false));
		grip3_r3_r1.cubeList.add(new ModelBox(grip3_r3_r1, 184, 81, -1.998F, 9.8199F, 1.5871F, 4, 1, 2, 0.0F, false));
		grip3_r3_r1.cubeList.add(new ModelBox(grip3_r3_r1, 142, 204, -1.998F, -3.1801F, -1.4129F, 4, 13, 5, 0.0F, false));

		grip3_r3_r2 = new ModelRenderer(this);
		grip3_r3_r2.setRotationPoint(2.002F, 11.593F, 3.7794F);
		grip3_r4.addChild(grip3_r3_r2);
		setRotationAngle(grip3_r3_r2, -0.1745F, 0.0F, 0.0F);
		grip3_r3_r2.cubeList.add(new ModelBox(grip3_r3_r2, 212, 52, -2.5F, 0.3F, -3.0F, 5, 1, 7, 0.0F, false));

		grip8_r9 = new ModelRenderer(this);
		grip8_r9.setRotationPoint(-2.1F, -29.7F, 0.0F);
		HKgripA8.addChild(grip8_r9);
		setRotationAngle(grip8_r9, -0.7243F, 0.0F, 0.0F);
		grip8_r9.cubeList.add(new ModelBox(grip8_r9, 102, 236, -1.0F, -3.2247F, -2.1988F, 3, 5, 2, 0.0F, false));
		grip8_r9.cubeList.add(new ModelBox(grip8_r9, 36, 199, 1.2F, -3.2257F, -2.1998F, 1, 5, 2, 0.0F, false));

		grip12_r11 = new ModelRenderer(this);
		grip12_r11.setRotationPoint(-3.6F, -26.3F, -5.7F);
		HKgripA8.addChild(grip12_r11);
		grip12_r11.cubeList.add(new ModelBox(grip12_r11, 176, 242, 0.0F, -0.2885F, 4.0641F, 1, 1, 2, 0.0F, false));
		grip12_r11.cubeList.add(new ModelBox(grip12_r11, 182, 242, 3.2F, -0.2885F, 4.0641F, 1, 1, 2, 0.0F, false));
		grip12_r11.cubeList.add(new ModelBox(grip12_r11, 188, 242, 3.2F, 1.7115F, 5.0641F, 1, 1, 2, 0.0F, false));
		grip12_r11.cubeList.add(new ModelBox(grip12_r11, 194, 242, 0.0F, 1.7115F, 5.0641F, 1, 1, 2, 0.0F, false));
		grip12_r11.cubeList.add(new ModelBox(grip12_r11, 36, 206, 0.0F, 1.7115F, 1.2641F, 1, 1, 2, 0.0F, false));
		grip12_r11.cubeList.add(new ModelBox(grip12_r11, 242, 126, 3.2F, 1.7115F, 1.2641F, 1, 1, 2, 0.0F, false));
		grip12_r11.cubeList.add(new ModelBox(grip12_r11, 242, 214, 0.0F, 3.7115F, 5.9641F, 1, 1, 2, 0.0F, false));
		grip12_r11.cubeList.add(new ModelBox(grip12_r11, 242, 217, 3.2F, 3.7115F, 5.9641F, 1, 1, 2, 0.0F, false));
		grip12_r11.cubeList.add(new ModelBox(grip12_r11, 220, 242, 3.2F, 3.7115F, 2.1641F, 1, 1, 2, 0.0F, false));
		grip12_r11.cubeList.add(new ModelBox(grip12_r11, 242, 220, 0.0F, 3.7115F, 2.1641F, 1, 1, 2, 0.0F, false));
		grip12_r11.cubeList.add(new ModelBox(grip12_r11, 242, 223, 3.2F, 5.7115F, 3.1641F, 1, 1, 2, 0.0F, false));
		grip12_r11.cubeList.add(new ModelBox(grip12_r11, 226, 242, 3.2F, 5.7115F, 6.9641F, 1, 1, 2, 0.0F, false));
		grip12_r11.cubeList.add(new ModelBox(grip12_r11, 242, 226, 0.0F, 5.7115F, 6.9641F, 1, 1, 2, 0.0F, false));
		grip12_r11.cubeList.add(new ModelBox(grip12_r11, 242, 229, 0.0F, 5.7115F, 3.1641F, 1, 1, 2, 0.0F, false));
		grip12_r11.cubeList.add(new ModelBox(grip12_r11, 232, 242, 0.0F, 7.7115F, 4.1641F, 1, 1, 2, 0.0F, false));
		grip12_r11.cubeList.add(new ModelBox(grip12_r11, 34, 243, 0.0F, 7.7115F, 7.9641F, 1, 1, 2, 0.0F, false));
		grip12_r11.cubeList.add(new ModelBox(grip12_r11, 84, 243, 3.2F, 7.7115F, 7.9641F, 1, 1, 2, 0.0F, false));
		grip12_r11.cubeList.add(new ModelBox(grip12_r11, 238, 242, 3.2F, 7.7115F, 4.1641F, 1, 1, 2, 0.0F, false));
		grip12_r11.cubeList.add(new ModelBox(grip12_r11, 242, 129, 0.0F, 9.7115F, 5.0641F, 1, 1, 2, 0.0F, false));
		grip12_r11.cubeList.add(new ModelBox(grip12_r11, 164, 242, 3.2F, 9.7115F, 5.0641F, 1, 1, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		HKgripA8.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}