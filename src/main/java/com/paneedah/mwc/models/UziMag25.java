package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class UziMag25 extends ModelBase {
	private final ModelRenderer magazine25;
	private final ModelRenderer mag9;
	private final ModelRenderer mag10;
	private final ModelRenderer mag4_r1;
	private final ModelRenderer mag3_r1;
	private final ModelRenderer mag11;
	private final ModelRenderer mag12;
	private final ModelRenderer mag13;
	private final ModelRenderer mag14;
	private final ModelRenderer mag15;
	private final ModelRenderer mag16;

	public UziMag25() {
		textureWidth = 512;
		textureHeight = 512;

		magazine25 = new ModelRenderer(this);
		magazine25.setRotationPoint(-9.0F, 21.0F, -1.0F);
		

		mag9 = new ModelRenderer(this);
		mag9.setRotationPoint(6.5F, -31.5F, -5.0F);
		magazine25.addChild(mag9);
		mag9.cubeList.add(new ModelBox(mag9, 91, 296, 0.0F, 0.0F, 0.0F, 2, 19, 5, 0.0F, false));

		mag10 = new ModelRenderer(this);
		mag10.setRotationPoint(6.0F, -31.5F, -4.5F);
		magazine25.addChild(mag10);
		mag10.cubeList.add(new ModelBox(mag10, 106, 296, 0.0F, 0.0F, 0.0F, 3, 19, 4, 0.0F, false));

		mag4_r1 = new ModelRenderer(this);
		mag4_r1.setRotationPoint(2.2929F, 0.0F, 2.5F);
		mag10.addChild(mag4_r1);
		setRotationAngle(mag4_r1, 0.0F, 0.0F, 0.7854F);
		mag4_r1.cubeList.add(new ModelBox(mag4_r1, 345, 42, -0.5F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));

		mag3_r1 = new ModelRenderer(this);
		mag3_r1.setRotationPoint(0.7071F, 0.0F, 2.5F);
		mag10.addChild(mag3_r1);
		setRotationAngle(mag3_r1, 0.0F, 0.0F, 0.7854F);
		mag3_r1.cubeList.add(new ModelBox(mag3_r1, 345, 37, -0.5F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));

		mag11 = new ModelRenderer(this);
		mag11.setRotationPoint(5.8F, -14.5F, -4.5F);
		magazine25.addChild(mag11);
		mag11.cubeList.add(new ModelBox(mag11, 341, 217, 0.0F, 1.0F, 0.0F, 1, 1, 4, 0.0F, false));

		mag12 = new ModelRenderer(this);
		mag12.setRotationPoint(5.8F, -14.5F, -0.5F);
		magazine25.addChild(mag12);
		setRotationAngle(mag12, 0.0F, 1.041F, 0.0F);
		mag12.cubeList.add(new ModelBox(mag12, 252, 353, 0.0F, 1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		mag13 = new ModelRenderer(this);
		mag13.setRotationPoint(9.2F, -14.5F, -0.5F);
		magazine25.addChild(mag13);
		setRotationAngle(mag13, 0.0F, -2.6025F, 0.0F);
		mag13.cubeList.add(new ModelBox(mag13, 257, 353, 0.0F, 1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		mag14 = new ModelRenderer(this);
		mag14.setRotationPoint(8.2F, -14.5F, -4.5F);
		magazine25.addChild(mag14);
		mag14.cubeList.add(new ModelBox(mag14, 341, 223, 0.0F, 1.0F, 0.0F, 1, 1, 4, 0.0F, false));

		mag15 = new ModelRenderer(this);
		mag15.setRotationPoint(8.65F, -14.5F, -3.65F);
		magazine25.addChild(mag15);
		setRotationAngle(mag15, 0.0F, 2.6025F, 0.0F);
		mag15.cubeList.add(new ModelBox(mag15, 262, 353, 0.0F, 1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		mag16 = new ModelRenderer(this);
		mag16.setRotationPoint(6.65F, -14.5F, -5.03F);
		magazine25.addChild(mag16);
		setRotationAngle(mag16, 0.0F, -1.041F, 0.0F);
		mag16.cubeList.add(new ModelBox(mag16, 267, 353, 0.0F, 1.0F, 0.0F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		magazine25.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}