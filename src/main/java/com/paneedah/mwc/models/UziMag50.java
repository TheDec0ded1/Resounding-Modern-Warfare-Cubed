package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class UziMag50 extends ModelBase {
	private final ModelRenderer magazine50;
	private final ModelRenderer mag25;
	private final ModelRenderer mag26;
	private final ModelRenderer mag4_r1;
	private final ModelRenderer mag3_r1;
	private final ModelRenderer mag27;
	private final ModelRenderer mag28;
	private final ModelRenderer mag29;
	private final ModelRenderer mag30;
	private final ModelRenderer mag31;
	private final ModelRenderer mag32;

	public UziMag50() {
		textureWidth = 512;
		textureHeight = 512;

		magazine50 = new ModelRenderer(this);
		magazine50.setRotationPoint(0.0F, 21.0F, 0.0F);
		

		mag25 = new ModelRenderer(this);
		mag25.setRotationPoint(-2.5F, -31.5F, -6.0F);
		magazine50.addChild(mag25);
		mag25.cubeList.add(new ModelBox(mag25, 41, 222, 0.0F, 0.0F, 0.0F, 2, 34, 5, 0.0F, false));

		mag26 = new ModelRenderer(this);
		mag26.setRotationPoint(-3.0F, -31.5F, -5.5F);
		magazine50.addChild(mag26);
		mag26.cubeList.add(new ModelBox(mag26, 214, 228, 0.0F, 0.0F, 0.0F, 3, 34, 4, 0.0F, false));

		mag4_r1 = new ModelRenderer(this);
		mag4_r1.setRotationPoint(2.2929F, 0.0F, 2.5F);
		mag26.addChild(mag4_r1);
		setRotationAngle(mag4_r1, 0.0F, 0.0F, 0.7854F);
		mag4_r1.cubeList.add(new ModelBox(mag4_r1, 252, 345, -0.5F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));

		mag3_r1 = new ModelRenderer(this);
		mag3_r1.setRotationPoint(0.7071F, 0.0F, 2.5F);
		mag26.addChild(mag3_r1);
		setRotationAngle(mag3_r1, 0.0F, 0.0F, 0.7854F);
		mag3_r1.cubeList.add(new ModelBox(mag3_r1, 243, 345, -0.5F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));

		mag27 = new ModelRenderer(this);
		mag27.setRotationPoint(-3.2F, -14.5F, -5.5F);
		magazine50.addChild(mag27);
		mag27.cubeList.add(new ModelBox(mag27, 341, 241, 0.0F, 16.0F, 0.0F, 1, 1, 4, 0.0F, false));

		mag28 = new ModelRenderer(this);
		mag28.setRotationPoint(-3.2F, -14.5F, -1.5F);
		magazine50.addChild(mag28);
		setRotationAngle(mag28, 0.0F, 1.041F, 0.0F);
		mag28.cubeList.add(new ModelBox(mag28, 292, 353, 0.0F, 16.0F, 0.0F, 1, 1, 1, 0.0F, false));

		mag29 = new ModelRenderer(this);
		mag29.setRotationPoint(0.2F, -14.5F, -1.5F);
		magazine50.addChild(mag29);
		setRotationAngle(mag29, 0.0F, -2.6025F, 0.0F);
		mag29.cubeList.add(new ModelBox(mag29, 297, 353, 0.0F, 16.0F, 0.0F, 1, 1, 1, 0.0F, false));

		mag30 = new ModelRenderer(this);
		mag30.setRotationPoint(-0.8F, -14.5F, -5.5F);
		magazine50.addChild(mag30);
		mag30.cubeList.add(new ModelBox(mag30, 341, 247, 0.0F, 16.0F, 0.0F, 1, 1, 4, 0.0F, false));

		mag31 = new ModelRenderer(this);
		mag31.setRotationPoint(-0.35F, -14.5F, -4.65F);
		magazine50.addChild(mag31);
		setRotationAngle(mag31, 0.0F, 2.6025F, 0.0F);
		mag31.cubeList.add(new ModelBox(mag31, 302, 353, 0.0F, 16.0F, 0.0F, 1, 1, 1, 0.0F, false));

		mag32 = new ModelRenderer(this);
		mag32.setRotationPoint(-2.35F, -14.5F, -6.03F);
		magazine50.addChild(mag32);
		setRotationAngle(mag32, 0.0F, -1.041F, 0.0F);
		mag32.cubeList.add(new ModelBox(mag32, 307, 353, 0.0F, 16.0F, 0.0F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		magazine50.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}