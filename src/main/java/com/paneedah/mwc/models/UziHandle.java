package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class UziHandle extends ModelWithAttachments {
	private final ModelRenderer handle;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer Release1;
	private final ModelRenderer Release2;
	private final ModelRenderer Release3;
	private final ModelRenderer Release4;
	private final ModelRenderer Release6;

	public UziHandle() {
		textureWidth = 512;
		textureHeight = 512;

		handle = new ModelRenderer(this);
		handle.setRotationPoint(0.0F, 24.0F, 3.0F);
		handle.cubeList.add(new ModelBox(handle, 154, 346, -2.6485F, -41.1F, -22.375F, 2, 1, 2, -0.4F, false));
		handle.cubeList.add(new ModelBox(handle, 220, 346, -2.6485F, -41.1F, -23.2235F, 2, 1, 2, -0.4F, false));
		handle.cubeList.add(new ModelBox(handle, 327, 346, -2.4F, -41.1F, -22.375F, 2, 1, 2, -0.4F, false));
		handle.cubeList.add(new ModelBox(handle, 318, 346, -2.4F, -41.1F, -23.2235F, 2, 1, 2, -0.4F, false));
		handle.cubeList.add(new ModelBox(handle, 352, 108, -2.0414F, -40.6F, -21.7336F, 1, 1, 1, -0.1F, false));
		handle.cubeList.add(new ModelBox(handle, 352, 194, -1.4757F, -40.6F, -22.2993F, 1, 1, 1, -0.1F, false));
		handle.cubeList.add(new ModelBox(handle, 101, 352, -2.0414F, -40.6F, -22.8649F, 1, 1, 1, -0.1F, false));
		handle.cubeList.add(new ModelBox(handle, 352, 191, -2.6071F, -40.6F, -22.2993F, 1, 1, 1, -0.1F, false));
		handle.cubeList.add(new ModelBox(handle, 300, 337, -0.9757F, -42.1F, -22.7993F, 1, 2, 2, -0.4F, false));
		handle.cubeList.add(new ModelBox(handle, 261, 345, -3.0728F, -42.1F, -22.7993F, 1, 2, 2, -0.4F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.5728F, -40.7F, -22.2993F);
		handle.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.4363F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 347, -0.3F, -0.8F, -0.5F, 1, 2, 2, -0.4F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.4757F, -40.7F, -22.2993F);
		handle.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.4363F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 345, 346, -0.7F, -0.8F, -0.5F, 1, 2, 2, -0.4F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1.9414F, -39.1F, -22.1993F);
		handle.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, -0.7854F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 352, 185, -0.5F, -1.5F, -0.5F, 1, 1, 1, -0.1F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.1414F, -39.1F, -22.1993F);
		handle.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, -0.7854F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 352, 188, -0.5F, -1.5F, -0.5F, 1, 1, 1, -0.1F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.1414F, -39.1F, -21.3993F);
		handle.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, -0.7854F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 106, 352, -0.5F, -1.5F, -0.5F, 1, 1, 1, -0.1F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-1.9414F, -39.1F, -21.3993F);
		handle.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, -0.7854F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 191, 352, -0.5F, -1.5F, -0.5F, 1, 1, 1, -0.1F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.1172F, -39.6F, -22.3993F);
		handle.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, -0.7854F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 352, -1.5F, -2.5F, 0.1F, 1, 2, 1, -0.4F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 334, 350, -1.5F, -2.5F, 0.3F, 1, 2, 1, -0.4F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 229, 346, -1.5F, -2.5F, 0.5F, 1, 2, 1, -0.4F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.1899F, -39.6F, -20.4922F);
		handle.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, -0.7854F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 352, 10, -1.5F, -2.5F, -0.1F, 1, 2, 1, -0.4F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 344, 351, -1.5F, -2.5F, -0.3F, 1, 2, 1, -0.4F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 324, 350, -1.5F, -2.5F, -0.5F, 1, 2, 1, -0.4F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.1899F, -39.6F, -23.1064F);
		handle.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, -0.7854F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 352, 6, -0.9F, -2.5F, 0.5F, 1, 2, 1, -0.4F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 339, 350, -0.7F, -2.5F, 0.5F, 1, 2, 1, -0.4F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 177, 340, -0.5F, -2.5F, 0.5F, 1, 2, 1, -0.4F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-1.1172F, -39.6F, -21.1993F);
		handle.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, -0.7854F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 349, 351, -1.1F, -2.5F, 0.5F, 1, 2, 1, -0.4F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 329, 350, -1.3F, -2.5F, 0.5F, 1, 2, 1, -0.4F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 198, 336, -1.5F, -2.5F, 0.5F, 1, 2, 1, -0.4F, false));

		Release1 = new ModelRenderer(this);
		Release1.setRotationPoint(-1.9F, -39.6F, -22.5F);
		handle.addChild(Release1);
		Release1.cubeList.add(new ModelBox(Release1, 268, 50, 0.0F, 0.0F, -1.0F, 1, 1, 14, 0.0F, false));

		Release2 = new ModelRenderer(this);
		Release2.setRotationPoint(-2.1F, -39.6F, -22.5F);
		handle.addChild(Release2);
		Release2.cubeList.add(new ModelBox(Release2, 268, 66, 0.0F, 0.0F, -1.0F, 1, 1, 14, 0.0F, false));

		Release3 = new ModelRenderer(this);
		Release3.setRotationPoint(-0.9F, -39.6F, -22.5F);
		handle.addChild(Release3);
		setRotationAngle(Release3, 0.0F, 0.0F, 0.7854F);
		Release3.cubeList.add(new ModelBox(Release3, 268, 82, 0.0F, 0.0F, -1.0F, 1, 1, 14, 0.0F, false));

		Release4 = new ModelRenderer(this);
		Release4.setRotationPoint(-2.1F, -39.6F, -22.5F);
		handle.addChild(Release4);
		setRotationAngle(Release4, 0.0F, 0.0F, 0.7854F);
		Release4.cubeList.add(new ModelBox(Release4, 268, 98, 0.0F, 0.0F, -1.0F, 1, 1, 14, 0.0F, false));

		Release6 = new ModelRenderer(this);
		Release6.setRotationPoint(-2.1F, -40.3F, -22.3F);
		handle.addChild(Release6);
		Release6.cubeList.add(new ModelBox(Release6, 334, 311, 0.1F, -0.5F, 0.0F, 1, 2, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handle.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}