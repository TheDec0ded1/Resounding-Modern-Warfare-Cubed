package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Mini14Mag30 extends ModelBase {
	private final ModelRenderer mag;
	private final ModelRenderer mag4;
	private final ModelRenderer mag9_r1;
	private final ModelRenderer mag6_r1;
	private final ModelRenderer mag5_r1;
	private final ModelRenderer mag3;
	private final ModelRenderer mag7_r1;
	private final ModelRenderer mag5_r2;
	private final ModelRenderer mag5_r3;
	private final ModelRenderer mag1;
	private final ModelRenderer mag4_r1;
	private final ModelRenderer mag3_r1;
	private final ModelRenderer mag2_r1;
	private final ModelRenderer mag2;
	private final ModelRenderer mag5_r4;
	private final ModelRenderer mag4_r2;
	private final ModelRenderer mag3_r2;

	public Mini14Mag30() {
		textureWidth = 340;
		textureHeight = 340;

		mag = new ModelRenderer(this);
		mag.setRotationPoint(0.0F, 21.9F, 5.0F);
		setRotationAngle(mag, 0.0698F, 0.0F, 0.0F);
		

		mag4 = new ModelRenderer(this);
		mag4.setRotationPoint(-3.0F, -16.1F, -28.5F);
		mag.addChild(mag4);
		setRotationAngle(mag4, 2.9743F, 0.0F, 0.0F);
		mag4.cubeList.add(new ModelBox(mag4, 219, 183, 0.0F, 13.0F, 1.0F, 3, 6, 6, 0.001F, false));

		mag9_r1 = new ModelRenderer(this);
		mag9_r1.setRotationPoint(1.5F, -1.0033F, 5.8753F);
		mag4.addChild(mag9_r1);
		setRotationAngle(mag9_r1, -0.2182F, 0.0F, 0.0F);
		mag9_r1.cubeList.add(new ModelBox(mag9_r1, 219, 187, 1.0F, -3.0F, -2.75F, 1, 1, 6, 0.001F, false));
		mag9_r1.cubeList.add(new ModelBox(mag9_r1, 219, 187, -2.0F, -3.0F, -2.75F, 1, 1, 6, 0.001F, false));
		mag9_r1.cubeList.add(new ModelBox(mag9_r1, 219, 187, -1.5F, -3.0F, -2.75F, 3, 6, 6, 0.001F, false));

		mag6_r1 = new ModelRenderer(this);
		mag6_r1.setRotationPoint(1.5F, 4.7196F, 4.7369F);
		mag4.addChild(mag6_r1);
		setRotationAngle(mag6_r1, -0.1745F, 0.0F, 0.0F);
		mag6_r1.cubeList.add(new ModelBox(mag6_r1, 219, 189, -1.5F, -3.0F, -2.75F, 3, 6, 6, 0.001F, false));

		mag5_r1 = new ModelRenderer(this);
		mag5_r1.setRotationPoint(1.5F, 10.3383F, 3.9972F);
		mag4.addChild(mag5_r1);
		setRotationAngle(mag5_r1, -0.0873F, 0.0F, 0.0F);
		mag5_r1.cubeList.add(new ModelBox(mag5_r1, 219, 196, -1.5F, -3.0F, -2.75F, 3, 6, 6, 0.001F, false));

		mag3 = new ModelRenderer(this);
		mag3.setRotationPoint(-3.5F, -16.1F, -28.5F);
		mag.addChild(mag3);
		setRotationAngle(mag3, 2.9743F, 0.0F, 0.0F);
		mag3.cubeList.add(new ModelBox(mag3, 48, 95, 0.0F, 13.0F, 6.0F, 4, 6, 2, 0.0F, false));
		mag3.cubeList.add(new ModelBox(mag3, 49, 96, 0.0F, 13.0F, 4.0F, 4, 6, 1, 0.0F, false));

		mag7_r1 = new ModelRenderer(this);
		mag7_r1.setRotationPoint(2.0F, -1.0033F, 5.8753F);
		mag3.addChild(mag7_r1);
		setRotationAngle(mag7_r1, -0.2182F, 0.0F, 0.0F);
		mag7_r1.cubeList.add(new ModelBox(mag7_r1, 49, 100, -2.0F, -3.0F, 0.25F, 4, 6, 1, 0.0F, false));
		mag7_r1.cubeList.add(new ModelBox(mag7_r1, 48, 99, -2.0F, -3.0F, 2.25F, 4, 6, 2, 0.0F, false));

		mag5_r2 = new ModelRenderer(this);
		mag5_r2.setRotationPoint(2.0F, 4.7196F, 4.7369F);
		mag3.addChild(mag5_r2);
		setRotationAngle(mag5_r2, -0.1745F, 0.0F, 0.0F);
		mag5_r2.cubeList.add(new ModelBox(mag5_r2, 48, 101, -2.0F, -3.0F, 2.25F, 4, 6, 2, 0.0F, false));
		mag5_r2.cubeList.add(new ModelBox(mag5_r2, 49, 102, -2.0F, -3.0F, 0.25F, 4, 6, 1, 0.0F, false));

		mag5_r3 = new ModelRenderer(this);
		mag5_r3.setRotationPoint(2.0F, 10.3383F, 3.9972F);
		mag3.addChild(mag5_r3);
		setRotationAngle(mag5_r3, -0.0873F, 0.0F, 0.0F);
		mag5_r3.cubeList.add(new ModelBox(mag5_r3, 49, 109, -2.0F, -3.0F, 0.25F, 4, 6, 1, 0.0F, false));
		mag5_r3.cubeList.add(new ModelBox(mag5_r3, 48, 108, -2.0F, -3.0F, 2.25F, 4, 6, 2, 0.0F, false));

		mag1 = new ModelRenderer(this);
		mag1.setRotationPoint(-3.5F, -16.1F, -28.5F);
		mag.addChild(mag1);
		setRotationAngle(mag1, 2.9743F, 0.0F, 0.0F);
		mag1.cubeList.add(new ModelBox(mag1, 51, 0, 0.0F, 13.0F, 0.0F, 4, 6, 1, 0.0F, false));

		mag4_r1 = new ModelRenderer(this);
		mag4_r1.setRotationPoint(2.0F, -1.0033F, 5.8753F);
		mag1.addChild(mag4_r1);
		setRotationAngle(mag4_r1, -0.2182F, 0.0F, 0.0F);
		mag4_r1.cubeList.add(new ModelBox(mag4_r1, 51, 4, -2.0F, -3.0F, -3.75F, 4, 6, 1, 0.0F, false));

		mag3_r1 = new ModelRenderer(this);
		mag3_r1.setRotationPoint(2.0F, 4.7196F, 4.7369F);
		mag1.addChild(mag3_r1);
		setRotationAngle(mag3_r1, -0.1745F, 0.0F, 0.0F);
		mag3_r1.cubeList.add(new ModelBox(mag3_r1, 51, 6, -2.0F, -3.0F, -3.75F, 4, 6, 1, 0.0F, false));

		mag2_r1 = new ModelRenderer(this);
		mag2_r1.setRotationPoint(2.0F, 10.3383F, 3.9972F);
		mag1.addChild(mag2_r1);
		setRotationAngle(mag2_r1, -0.0873F, 0.0F, 0.0F);
		mag2_r1.cubeList.add(new ModelBox(mag2_r1, 51, 13, -2.0F, -3.0F, -3.75F, 4, 6, 1, 0.0F, false));

		mag2 = new ModelRenderer(this);
		mag2.setRotationPoint(-3.5F, -16.1F, -28.5F);
		mag.addChild(mag2);
		setRotationAngle(mag2, 2.9743F, 0.0F, 0.0F);
		mag2.cubeList.add(new ModelBox(mag2, 226, 226, 0.0F, 13.0F, 2.0F, 4, 6, 1, 0.0F, false));

		mag5_r4 = new ModelRenderer(this);
		mag5_r4.setRotationPoint(2.0F, -1.0033F, 5.8753F);
		mag2.addChild(mag5_r4);
		setRotationAngle(mag5_r4, -0.2182F, 0.0F, 0.0F);
		mag5_r4.cubeList.add(new ModelBox(mag5_r4, 226, 230, -2.0F, -3.0F, -1.75F, 4, 6, 1, 0.0F, false));

		mag4_r2 = new ModelRenderer(this);
		mag4_r2.setRotationPoint(2.0F, 4.7196F, 4.7369F);
		mag2.addChild(mag4_r2);
		setRotationAngle(mag4_r2, -0.1745F, 0.0F, 0.0F);
		mag4_r2.cubeList.add(new ModelBox(mag4_r2, 226, 232, -2.0F, -3.0F, -1.75F, 4, 6, 1, 0.0F, false));

		mag3_r2 = new ModelRenderer(this);
		mag3_r2.setRotationPoint(2.0F, 10.3383F, 3.9972F);
		mag2.addChild(mag3_r2);
		setRotationAngle(mag3_r2, -0.0873F, 0.0F, 0.0F);
		mag3_r2.cubeList.add(new ModelBox(mag3_r2, 226, 239, -2.0F, -3.0F, -1.75F, 4, 6, 1, 0.0F, false));
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