package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class MicroUziHandle extends ModelWithAttachments {
	private final ModelRenderer handle;
	private final ModelRenderer Release1;
	private final ModelRenderer Release2;
	private final ModelRenderer Release3;
	private final ModelRenderer Release4;
	private final ModelRenderer Release6;
	private final ModelRenderer Release11_r1;
	private final ModelRenderer Release10_r1;
	private final ModelRenderer Release9_r1;

	public MicroUziHandle() {
		textureWidth = 256;
		textureHeight = 256;

		handle = new ModelRenderer(this);
		handle.setRotationPoint(0.0F, 24.0F, 7.0F);
		

		Release1 = new ModelRenderer(this);
		Release1.setRotationPoint(-1.9F, -39.6F, -22.5F);
		handle.addChild(Release1);
		Release1.cubeList.add(new ModelBox(Release1, 135, 0, 0.0F, 0.0F, -1.0F, 1, 1, 12, 0.0F, false));

		Release2 = new ModelRenderer(this);
		Release2.setRotationPoint(-2.1F, -39.6F, -22.5F);
		handle.addChild(Release2);
		Release2.cubeList.add(new ModelBox(Release2, 140, 110, 0.0F, 0.0F, -1.0F, 1, 1, 12, 0.0F, false));

		Release3 = new ModelRenderer(this);
		Release3.setRotationPoint(-0.9F, -39.6F, -22.5F);
		handle.addChild(Release3);
		setRotationAngle(Release3, 0.0F, 0.0F, 0.7854F);
		Release3.cubeList.add(new ModelBox(Release3, 140, 124, 0.0F, 0.0F, -1.0F, 1, 1, 12, 0.0F, false));

		Release4 = new ModelRenderer(this);
		Release4.setRotationPoint(-2.1F, -39.6F, -22.5F);
		handle.addChild(Release4);
		setRotationAngle(Release4, 0.0F, 0.0F, 0.7854F);
		Release4.cubeList.add(new ModelBox(Release4, 140, 138, 0.0F, 0.0F, -1.0F, 1, 1, 12, 0.0F, false));

		Release6 = new ModelRenderer(this);
		Release6.setRotationPoint(-2.1F, -40.3F, -22.3F);
		handle.addChild(Release6);
		Release6.cubeList.add(new ModelBox(Release6, 55, 182, 0.1F, 0.5F, 0.0F, 1, 2, 1, 0.0F, false));
		Release6.cubeList.add(new ModelBox(Release6, 136, 176, -0.15F, -0.2F, -0.5F, 2, 1, 2, -0.3F, false));
		Release6.cubeList.add(new ModelBox(Release6, 177, 0, -0.65F, -0.2F, -0.5F, 2, 1, 2, -0.3F, false));
		Release6.cubeList.add(new ModelBox(Release6, 182, 65, 0.75F, -1.5F, -0.4F, 1, 2, 1, -0.2F, false));
		Release6.cubeList.add(new ModelBox(Release6, 182, 69, -0.55F, -1.5F, -0.4F, 1, 2, 1, -0.2F, false));
		Release6.cubeList.add(new ModelBox(Release6, 178, 149, -0.4F, -0.5F, -0.4F, 2, 1, 1, -0.2F, false));

		Release11_r1 = new ModelRenderer(this);
		Release11_r1.setRotationPoint(0.95F, -0.3F, 0.1F);
		Release6.addChild(Release11_r1);
		setRotationAngle(Release11_r1, 0.0F, 0.0F, -0.7854F);
		Release11_r1.cubeList.add(new ModelBox(Release11_r1, 136, 184, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.2F, false));

		Release10_r1 = new ModelRenderer(this);
		Release10_r1.setRotationPoint(0.25F, -0.3F, 0.1F);
		Release6.addChild(Release10_r1);
		setRotationAngle(Release10_r1, 0.0F, 0.0F, -0.7854F);
		Release10_r1.cubeList.add(new ModelBox(Release10_r1, 131, 184, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.2F, false));

		Release9_r1 = new ModelRenderer(this);
		Release9_r1.setRotationPoint(0.6F, 0.1F, 0.4F);
		Release6.addChild(Release9_r1);
		setRotationAngle(Release9_r1, 0.7854F, 0.0F, 0.0F);
		Release9_r1.cubeList.add(new ModelBox(Release9_r1, 141, 184, 0.15F, -0.5F, -0.5F, 1, 1, 1, -0.2F, false));
		Release9_r1.cubeList.add(new ModelBox(Release9_r1, 146, 184, -1.15F, -0.5F, -0.5F, 1, 1, 1, -0.2F, false));
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