package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Mini14Mag20 extends ModelBase {
	private final ModelRenderer mag5;
	private final ModelRenderer mag6;
	private final ModelRenderer mag9_r1;
	private final ModelRenderer mag6_r1;
	private final ModelRenderer mag7;
	private final ModelRenderer mag6_r2;
	private final ModelRenderer mag6_r3;
	private final ModelRenderer mag8;
	private final ModelRenderer mag4_r1;
	private final ModelRenderer mag3_r1;
	private final ModelRenderer mag9;
	private final ModelRenderer mag5_r1;
	private final ModelRenderer mag4_r2;

	public Mini14Mag20() {
		textureWidth = 340;
		textureHeight = 340;

		mag5 = new ModelRenderer(this);
		mag5.setRotationPoint(0.0F, 21.9F, 5.0F);
		setRotationAngle(mag5, 0.0698F, 0.0F, 0.0F);
		

		mag6 = new ModelRenderer(this);
		mag6.setRotationPoint(-3.0F, -16.1F, -28.5F);
		mag5.addChild(mag6);
		setRotationAngle(mag6, 2.9743F, 0.0F, 0.0F);
		mag6.cubeList.add(new ModelBox(mag6, 219, 183, 0.0F, 13.0F, 1.0F, 3, 6, 6, 0.001F, false));

		mag9_r1 = new ModelRenderer(this);
		mag9_r1.setRotationPoint(1.5F, 4.7196F, 4.7369F);
		mag6.addChild(mag9_r1);
		setRotationAngle(mag9_r1, -0.1745F, 0.0F, 0.0F);
		mag9_r1.cubeList.add(new ModelBox(mag9_r1, 219, 189, 1.0F, -3.0F, -2.75F, 1, 1, 6, 0.001F, false));
		mag9_r1.cubeList.add(new ModelBox(mag9_r1, 219, 189, -2.0F, -3.0F, -2.75F, 1, 1, 6, 0.001F, false));
		mag9_r1.cubeList.add(new ModelBox(mag9_r1, 219, 189, -1.5F, -3.0F, -2.75F, 3, 6, 6, 0.001F, false));

		mag6_r1 = new ModelRenderer(this);
		mag6_r1.setRotationPoint(1.5F, 10.3383F, 3.9972F);
		mag6.addChild(mag6_r1);
		setRotationAngle(mag6_r1, -0.0873F, 0.0F, 0.0F);
		mag6_r1.cubeList.add(new ModelBox(mag6_r1, 219, 196, -1.5F, -3.0F, -2.75F, 3, 6, 6, 0.001F, false));

		mag7 = new ModelRenderer(this);
		mag7.setRotationPoint(-3.5F, -16.1F, -28.5F);
		mag5.addChild(mag7);
		setRotationAngle(mag7, 2.9743F, 0.0F, 0.0F);
		mag7.cubeList.add(new ModelBox(mag7, 48, 95, 0.0F, 13.0F, 6.0F, 4, 6, 2, 0.0F, false));
		mag7.cubeList.add(new ModelBox(mag7, 49, 96, 0.0F, 13.0F, 4.0F, 4, 6, 1, 0.0F, false));

		mag6_r2 = new ModelRenderer(this);
		mag6_r2.setRotationPoint(2.0F, 4.7196F, 4.7369F);
		mag7.addChild(mag6_r2);
		setRotationAngle(mag6_r2, -0.1745F, 0.0F, 0.0F);
		mag6_r2.cubeList.add(new ModelBox(mag6_r2, 48, 101, -2.0F, -3.0F, 2.25F, 4, 6, 2, 0.0F, false));
		mag6_r2.cubeList.add(new ModelBox(mag6_r2, 49, 102, -2.0F, -3.0F, 0.25F, 4, 6, 1, 0.0F, false));

		mag6_r3 = new ModelRenderer(this);
		mag6_r3.setRotationPoint(2.0F, 10.3383F, 3.9972F);
		mag7.addChild(mag6_r3);
		setRotationAngle(mag6_r3, -0.0873F, 0.0F, 0.0F);
		mag6_r3.cubeList.add(new ModelBox(mag6_r3, 49, 109, -2.0F, -3.0F, 0.25F, 4, 6, 1, 0.0F, false));
		mag6_r3.cubeList.add(new ModelBox(mag6_r3, 48, 108, -2.0F, -3.0F, 2.25F, 4, 6, 2, 0.0F, false));

		mag8 = new ModelRenderer(this);
		mag8.setRotationPoint(-3.5F, -16.1F, -28.5F);
		mag5.addChild(mag8);
		setRotationAngle(mag8, 2.9743F, 0.0F, 0.0F);
		mag8.cubeList.add(new ModelBox(mag8, 51, 0, 0.0F, 13.0F, 0.0F, 4, 6, 1, 0.0F, false));

		mag4_r1 = new ModelRenderer(this);
		mag4_r1.setRotationPoint(2.0F, 4.7196F, 4.7369F);
		mag8.addChild(mag4_r1);
		setRotationAngle(mag4_r1, -0.1745F, 0.0F, 0.0F);
		mag4_r1.cubeList.add(new ModelBox(mag4_r1, 51, 6, -2.0F, -3.0F, -3.75F, 4, 6, 1, 0.0F, false));

		mag3_r1 = new ModelRenderer(this);
		mag3_r1.setRotationPoint(2.0F, 10.3383F, 3.9972F);
		mag8.addChild(mag3_r1);
		setRotationAngle(mag3_r1, -0.0873F, 0.0F, 0.0F);
		mag3_r1.cubeList.add(new ModelBox(mag3_r1, 51, 13, -2.0F, -3.0F, -3.75F, 4, 6, 1, 0.0F, false));

		mag9 = new ModelRenderer(this);
		mag9.setRotationPoint(-3.5F, -16.1F, -28.5F);
		mag5.addChild(mag9);
		setRotationAngle(mag9, 2.9743F, 0.0F, 0.0F);
		mag9.cubeList.add(new ModelBox(mag9, 226, 226, 0.0F, 13.0F, 2.0F, 4, 6, 1, 0.0F, false));

		mag5_r1 = new ModelRenderer(this);
		mag5_r1.setRotationPoint(2.0F, 4.7196F, 4.7369F);
		mag9.addChild(mag5_r1);
		setRotationAngle(mag5_r1, -0.1745F, 0.0F, 0.0F);
		mag5_r1.cubeList.add(new ModelBox(mag5_r1, 226, 232, -2.0F, -3.0F, -1.75F, 4, 6, 1, 0.0F, false));

		mag4_r2 = new ModelRenderer(this);
		mag4_r2.setRotationPoint(2.0F, 10.3383F, 3.9972F);
		mag9.addChild(mag4_r2);
		setRotationAngle(mag4_r2, -0.0873F, 0.0F, 0.0F);
		mag4_r2.cubeList.add(new ModelBox(mag4_r2, 226, 239, -2.0F, -3.0F, -1.75F, 4, 6, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		mag5.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}