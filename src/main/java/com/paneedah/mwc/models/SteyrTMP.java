package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SteyrTMP extends ModelWithAttachments {
	private final ModelRenderer tmp;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer muzzle;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;

	public SteyrTMP() {
		textureWidth = 288;
		textureHeight = 288;

		tmp = new ModelRenderer(this);
		tmp.setRotationPoint(0.0F, 24.0F, 0.0F);
		tmp.cubeList.add(new ModelBox(tmp, 52, 252, -2.5F, -36.6347F, -22.8831F, 2, 1, 6, 0.0F, false));
		tmp.cubeList.add(new ModelBox(tmp, 248, 70, -2.5F, -35.5847F, -27.8831F, 2, 1, 7, -0.2F, false));
		tmp.cubeList.add(new ModelBox(tmp, 250, 171, -0.3686F, -34.4534F, -27.8831F, 1, 2, 7, -0.2F, false));
		tmp.cubeList.add(new ModelBox(tmp, 248, 62, -2.5F, -32.322F, -27.8831F, 2, 1, 7, -0.2F, false));
		tmp.cubeList.add(new ModelBox(tmp, 250, 180, -3.6314F, -34.4534F, -27.8831F, 1, 2, 7, -0.2F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.3464F, -32.2998F, -23.8831F);
		tmp.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 124, 250, -1.0F, -0.5F, -4.0F, 2, 1, 7, -0.2F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-3.3607F, -32.2998F, -23.8831F);
		tmp.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 250, 242, 0.0F, -0.5F, -4.0F, 1, 2, 7, -0.2F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1.0535F, -34.6069F, -23.8831F);
		tmp.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.7854F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 178, 250, 0.0F, -0.5F, -4.0F, 1, 2, 7, -0.2F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-2.6536F, -34.6069F, -23.8831F);
		tmp.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 248, 78, -1.0F, -0.5F, -4.0F, 2, 1, 7, -0.2F, false));

		muzzle = new ModelRenderer(this);
		muzzle.setRotationPoint(-3.5607F, -32.092F, -27.1831F);
		tmp.addChild(muzzle);
		muzzle.cubeList.add(new ModelBox(muzzle, 50, 191, 1.0607F, 0.0607F, -8.0F, 2, 1, 10, 0.0F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 234, 148, -0.3536F, -2.3535F, -8.0F, 1, 2, 10, 0.0F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 60, 240, 3.4749F, -2.3535F, -8.0F, 1, 2, 10, 0.0F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 232, 231, 1.0607F, -3.7678F, -8.0F, 2, 1, 10, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.7071F, -2.7071F, -1.0F);
		muzzle.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.7854F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 232, 220, -1.0F, -0.5F, -7.0F, 2, 1, 10, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(2.7071F, -2.7071F, -1.0F);
		muzzle.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 134, 238, 0.0F, -0.5F, -7.0F, 1, 2, 10, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(3.4142F, 0.0F, -1.0F);
		muzzle.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 232, 209, -1.0F, -0.5F, -7.0F, 2, 1, 10, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 0.0F, -1.0F);
		muzzle.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 234, 136, 0.0F, -0.5F, -7.0F, 1, 2, 10, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		tmp.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}