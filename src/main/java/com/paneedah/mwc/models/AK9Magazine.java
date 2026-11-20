package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AK9Magazine extends ModelBase {
	private final ModelRenderer mag;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5_r1;
	private final ModelRenderer bone11;
	private final ModelRenderer bone9_r1;
	private final ModelRenderer bone8_r1;
	private final ModelRenderer bone7_r1;
	private final ModelRenderer bone12;
	private final ModelRenderer bone9_r2;
	private final ModelRenderer bone13;

	public AK9Magazine() {
		textureWidth = 320;
		textureHeight = 320;

		mag = new ModelRenderer(this);
		mag.setRotationPoint(0.0F, 23.7F, 0.1F);
		

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-1.5F, -28.6927F, -23.9674F);
		mag.addChild(bone4);
		setRotationAngle(bone4, -0.1745F, 0.0F, 0.0F);
		

		bone5_r1 = new ModelRenderer(this);
		bone5_r1.setRotationPoint(0.0F, 0.3407F, 0.0908F);
		bone4.addChild(bone5_r1);
		setRotationAngle(bone5_r1, 0.1309F, 0.0F, 0.0F);
		bone5_r1.cubeList.add(new ModelBox(bone5_r1, 294, 254, -2.0F, -4.0121F, -1.3689F, 4, 6, 7, 0.0F, false));
		bone5_r1.cubeList.add(new ModelBox(bone5_r1, 64, 304, -1.5F, -3.9947F, -3.0185F, 3, 6, 2, -0.001F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(-1.5F, -28.6927F, -23.9674F);
		mag.addChild(bone11);
		setRotationAngle(bone11, -0.3054F, 0.0F, 0.0F);
		

		bone9_r1 = new ModelRenderer(this);
		bone9_r1.setRotationPoint(0.002F, 4.5041F, 1.3595F);
		bone11.addChild(bone9_r1);
		setRotationAngle(bone9_r1, 0.3927F, 0.0F, 0.0F);
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 310, 227, -1.5F, 1.0F, -3.625F, 3, 1, 1, 0.001F, false));

		bone8_r1 = new ModelRenderer(this);
		bone8_r1.setRotationPoint(0.002F, 5.1992F, 1.7889F);
		bone11.addChild(bone8_r1);
		setRotationAngle(bone8_r1, 0.1745F, 0.0F, 0.0F);
		bone8_r1.cubeList.add(new ModelBox(bone8_r1, 222, 304, -1.5F, -3.0F, -3.625F, 3, 4, 2, 0.001F, false));

		bone7_r1 = new ModelRenderer(this);
		bone7_r1.setRotationPoint(-0.001F, 4.6776F, 1.315F);
		bone11.addChild(bone7_r1);
		setRotationAngle(bone7_r1, 0.1745F, 0.0F, 0.0F);
		bone7_r1.cubeList.add(new ModelBox(bone7_r1, 170, 295, -2.0F, -3.0F, -1.625F, 4, 6, 7, 0.001F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(-3.1883F, -23.3512F, -24.1008F);
		mag.addChild(bone12);
		setRotationAngle(bone12, -0.4363F, 0.0F, 0.0F);
		

		bone9_r2 = new ModelRenderer(this);
		bone9_r2.setRotationPoint(1.6883F, 4.7017F, 1.0352F);
		bone12.addChild(bone9_r2);
		setRotationAngle(bone9_r2, 0.1745F, 0.0F, 0.0F);
		bone9_r2.cubeList.add(new ModelBox(bone9_r2, 126, 100, -2.0F, 3.0F, -3.125F, 4, 1, 9, 0.0F, false));
		bone9_r2.cubeList.add(new ModelBox(bone9_r2, 192, 295, -2.0F, -3.0F, -1.625F, 4, 6, 7, 0.0F, false));
		bone9_r2.cubeList.add(new ModelBox(bone9_r2, 160, 297, -1.5F, -4.0F, -3.075F, 3, 7, 2, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(-3.1883F, -17.745F, -25.2985F);
		mag.addChild(bone13);
		setRotationAngle(bone13, -0.6545F, 0.0F, 0.0F);
		
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		mag.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}