package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class LMG68Tray extends ModelBase {
	private final ModelRenderer tray;
	private final ModelRenderer gun_r1;
	private final ModelRenderer gun_r2;
	private final ModelRenderer gun_r3;
	private final ModelRenderer gun_r4;

	public LMG68Tray() {
		textureWidth = 416;
		textureHeight = 416;

		tray = new ModelRenderer(this);
		tray.setRotationPoint(3.6709F, 18.2975F, -9.7632F);
		tray.cubeList.add(new ModelBox(tray, 278, 354, -4.3F, -36.65F, -26.001F, 3, 1, 11, -0.325F, false));
		tray.cubeList.add(new ModelBox(tray, 306, 354, -8.3F, -36.65F, -26.001F, 3, 1, 11, -0.325F, false));
		tray.cubeList.add(new ModelBox(tray, 390, 313, -6.3F, -36.65F, -16.001F, 3, 1, 1, -0.325F, false));
		tray.cubeList.add(new ModelBox(tray, 286, 181, -6.3F, -36.65F, -26.001F, 3, 1, 2, -0.325F, false));
		tray.cubeList.add(new ModelBox(tray, 384, 255, -3.3F, -38.65F, -15.976F, 3, 5, 1, -0.325F, false));
		tray.cubeList.add(new ModelBox(tray, 384, 249, -3.3F, -38.65F, -26.026F, 3, 5, 1, -0.325F, false));

		gun_r1 = new ModelRenderer(this);
		gun_r1.setRotationPoint(-0.0339F, -36.15F, -25.7209F);
		tray.addChild(gun_r1);
		setRotationAngle(gun_r1, 0.0F, 0.3054F, 0.0F);
		gun_r1.cubeList.add(new ModelBox(gun_r1, 16, 370, -1.0F, -2.5F, -0.5F, 2, 5, 1, -0.325F, false));

		gun_r2 = new ModelRenderer(this);
		gun_r2.setRotationPoint(-0.0339F, -36.15F, -15.2811F);
		tray.addChild(gun_r2);
		setRotationAngle(gun_r2, 0.0F, -0.3054F, 0.0F);
		gun_r2.cubeList.add(new ModelBox(gun_r2, 156, 386, -1.0F, -2.5F, -0.5F, 2, 5, 1, -0.325F, false));

		gun_r3 = new ModelRenderer(this);
		gun_r3.setRotationPoint(-1.2725F, -36.6301F, -20.001F);
		tray.addChild(gun_r3);
		setRotationAngle(gun_r3, 0.0F, 0.0F, 1.1345F);
		gun_r3.cubeList.add(new ModelBox(gun_r3, 356, 333, 1.0F, -0.5F, -6.0F, 2, 1, 11, -0.325F, false));

		gun_r4 = new ModelRenderer(this);
		gun_r4.setRotationPoint(-1.196F, -35.7752F, -20.001F);
		tray.addChild(gun_r4);
		setRotationAngle(gun_r4, 0.0F, 0.0F, 0.6545F);
		gun_r4.cubeList.add(new ModelBox(gun_r4, 356, 301, -1.0F, -0.5F, -6.0F, 2, 1, 11, -0.325F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		tray.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}