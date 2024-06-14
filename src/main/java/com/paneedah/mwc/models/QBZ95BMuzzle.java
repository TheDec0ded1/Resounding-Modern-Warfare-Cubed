package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBZ95BMuzzle extends ModelBase {
	private final ModelRenderer muzzle;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;

	public QBZ95BMuzzle() {
		textureWidth = 512;
		textureHeight = 512;

		muzzle = new ModelRenderer(this);
		muzzle.setRotationPoint(-1.5F, -11.0559F, -32.7588F);
		muzzle.cubeList.add(new ModelBox(muzzle, 152, 90, -0.5F, 0.7701F, 0.5588F, 1, 1, 5, 0.4F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 147, 144, -1.7728F, -0.5027F, 0.5588F, 1, 1, 5, 0.4F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 147, 136, 0.7728F, -0.5027F, 0.5588F, 1, 1, 5, 0.4F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 19, 145, -0.5F, -1.7755F, 0.5588F, 1, 1, 5, 0.4F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 131, 104, -1.0F, -2.4755F, 4.9588F, 2, 1, 1, 0.0F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 114, 28, -2.4142F, -1.0613F, 4.9588F, 1, 2, 1, 0.0F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 11, 125, -1.0F, 1.3529F, 4.9588F, 2, 1, 1, 0.0F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 109, 96, 1.4142F, -1.0613F, 4.9588F, 1, 2, 1, 0.0F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 100, 28, -2.4142F, -1.0613F, 2.9588F, 1, 2, 1, 0.0F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 30, 104, -1.0F, 1.3529F, 2.9588F, 2, 1, 1, 0.0F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 101, 95, 1.4142F, -1.0613F, 2.9588F, 1, 2, 1, 0.0F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 123, 65, -1.0F, -2.4755F, 2.9588F, 2, 1, 1, 0.0F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 137, 149, -2.4142F, -1.0613F, 0.7588F, 1, 2, 1, 0.0F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 137, 165, -1.0F, 1.3529F, 0.7588F, 2, 1, 1, 0.0F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 150, 40, 1.4142F, -1.0613F, 0.7588F, 1, 2, 1, 0.0F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 151, 165, -1.0F, -2.4755F, 0.7588F, 2, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(2.4142F, -1.0613F, -39.2412F);
		muzzle.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 150, 46, -1.0F, -2.0F, 40.0F, 1, 2, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 107, -1.0F, -2.0F, 42.2F, 1, 2, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 108, 82, -1.0F, -2.0F, 44.2F, 1, 2, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.7071F, 1.6458F, -39.2412F);
		muzzle.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 144, 165, -1.0F, -1.0F, 40.0F, 2, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 117, 94, -1.0F, -1.0F, 42.2F, 2, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 125, -1.0F, -1.0F, 44.2F, 2, 1, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1.0F, 0.9387F, -39.2412F);
		muzzle.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.7854F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 150, 19, -1.0F, -1.0F, 40.0F, 1, 2, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 100, 69, -1.0F, -1.0F, 42.2F, 1, 2, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 114, 69, -1.0F, -1.0F, 44.2F, 1, 2, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-0.2929F, -1.7684F, -39.2412F);
		muzzle.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 165, 119, -2.0F, -1.0F, 40.0F, 2, 1, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 17, 85, -2.0F, -1.0F, 42.2F, 2, 1, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 65, 127, -2.0F, -1.0F, 44.2F, 2, 1, 1, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(1.6071F, -0.9027F, -39.4412F);
		muzzle.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.7854F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 121, 146, -1.0F, -1.0F, 40.0F, 1, 1, 5, 0.4F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-0.1929F, -0.9027F, -39.4412F);
		muzzle.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 147, 128, -1.0F, -1.0F, 40.0F, 1, 1, 5, 0.4F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(1.6071F, 0.8973F, -39.4412F);
		muzzle.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 137, 149, -1.0F, -1.0F, 40.0F, 1, 1, 5, 0.4F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-0.1929F, 0.8973F, -39.4412F);
		muzzle.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 150, 83, -1.0F, -1.0F, 40.0F, 1, 1, 5, 0.4F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		muzzle.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}