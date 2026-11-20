package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class BundT_MP9 extends ModelWithAttachments {
	private final ModelRenderer mp9;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer muzzle;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;

	public BundT_MP9() {
		textureWidth = 240;
		textureHeight = 240;

		mp9 = new ModelRenderer(this);
		mp9.setRotationPoint(0.0F, 24.0F, 0.0F);
		mp9.cubeList.add(new ModelBox(mp9, 74, 28, -2.5F, -36.6347F, -22.8831F, 2, 1, 6, 0.0F, false));
		mp9.cubeList.add(new ModelBox(mp9, 88, 64, -2.5F, -35.5847F, -26.8831F, 2, 1, 6, -0.2F, false));
		mp9.cubeList.add(new ModelBox(mp9, 68, 194, -0.3686F, -34.4534F, -26.8831F, 1, 2, 6, -0.2F, false));
		mp9.cubeList.add(new ModelBox(mp9, 72, 64, -2.5F, -32.322F, -26.8831F, 2, 1, 6, -0.2F, false));
		mp9.cubeList.add(new ModelBox(mp9, 194, 86, -3.6314F, -34.4534F, -26.8831F, 1, 2, 6, -0.2F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.3464F, -32.2998F, -23.8831F);
		mp9.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 40, 193, -1.0F, -0.5F, -3.0F, 2, 1, 6, -0.2F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-3.3607F, -32.2998F, -23.8831F);
		mp9.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 104, 194, 0.0F, -0.5F, -3.0F, 1, 2, 6, -0.2F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.0535F, -34.6069F, -23.8831F);
		mp9.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 194, 20, 0.0F, -0.5F, -3.0F, 1, 2, 6, -0.2F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-2.6536F, -34.6069F, -23.8831F);
		mp9.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 90, 28, -1.0F, -0.5F, -3.0F, 2, 1, 6, -0.2F, false));

		muzzle = new ModelRenderer(this);
		muzzle.setRotationPoint(-3.5607F, -32.092F, -27.1831F);
		mp9.addChild(muzzle);
		muzzle.cubeList.add(new ModelBox(muzzle, 230, 82, 1.0607F, 0.0607F, 3.6F, 2, 1, 1, 0.0F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 224, 230, -0.3536F, -2.3535F, 3.6F, 1, 2, 1, 0.0F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 228, 230, 3.4749F, -2.3535F, 3.6F, 1, 2, 1, 0.0F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 230, 86, 1.0607F, -3.7678F, 3.6F, 2, 1, 1, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.7071F, -2.7071F, 1.6F);
		muzzle.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.7854F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 86, 230, -1.0F, -0.5F, 2.0F, 2, 1, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(2.7071F, -2.7071F, 1.6F);
		muzzle.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.7854F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 230, 226, 0.0F, -0.5F, 2.0F, 1, 2, 1, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(3.4142F, 0.0F, 1.6F);
		muzzle.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.7854F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 230, 84, -1.0F, -0.5F, 2.0F, 2, 1, 1, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, 0.0F, 1.6F);
		muzzle.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -0.7854F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 220, 230, 0.0F, -0.5F, 2.0F, 1, 2, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		mp9.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}