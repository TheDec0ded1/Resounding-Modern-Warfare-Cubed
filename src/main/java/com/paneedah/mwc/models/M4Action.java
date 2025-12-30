package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M4Action extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer receiver16_r8;
	private final ModelRenderer receiver16_r9;
	private final ModelRenderer receiver15_r8;
	private final ModelRenderer receiver16_r10;

	public M4Action() {
		textureWidth = 416;
		textureHeight = 416;

		action = new ModelRenderer(this);
		action.setRotationPoint(0.1F, 23.5F, 1.8F);
		

		receiver16_r8 = new ModelRenderer(this);
		receiver16_r8.setRotationPoint(-2.3F, -38.8F, -15.0F);
		action.addChild(receiver16_r8);
		setRotationAngle(receiver16_r8, 0.0F, 0.0F, -0.4014F);
		receiver16_r8.cubeList.add(new ModelBox(receiver16_r8, 370, 285, -1.0F, -0.001F, -0.999F, 1, 1, 4, 0.0F, false));
		receiver16_r8.cubeList.add(new ModelBox(receiver16_r8, 382, 107, -1.0F, 0.0F, -7.499F, 1, 1, 3, 0.0F, false));
		receiver16_r8.cubeList.add(new ModelBox(receiver16_r8, 178, 377, -0.7556F, 0.0088F, -5.001F, 1, 1, 4, 0.0F, false));

		receiver16_r9 = new ModelRenderer(this);
		receiver16_r9.setRotationPoint(-3.6F, -37.5F, -16.5F);
		action.addChild(receiver16_r9);
		setRotationAngle(receiver16_r9, 0.0F, 0.0F, -0.4014F);
		receiver16_r9.cubeList.add(new ModelBox(receiver16_r9, 32, 372, 0.0F, 0.0F, 0.5F, 1, 1, 4, 0.0F, false));
		receiver16_r9.cubeList.add(new ModelBox(receiver16_r9, 382, 111, 0.0F, 0.0F, -6.0F, 1, 1, 3, 0.0F, false));
		receiver16_r9.cubeList.add(new ModelBox(receiver16_r9, 168, 377, 0.0132F, 0.2225F, -3.501F, 1, 1, 4, 0.0F, false));

		receiver15_r8 = new ModelRenderer(this);
		receiver15_r8.setRotationPoint(-3.6F, -37.5F, -16.5F);
		action.addChild(receiver15_r8);
		setRotationAngle(receiver15_r8, 0.0F, 0.0F, 0.4014F);
		receiver15_r8.cubeList.add(new ModelBox(receiver15_r8, 32, 377, 0.0F, -1.0F, 0.5F, 1, 1, 4, 0.0F, false));
		receiver15_r8.cubeList.add(new ModelBox(receiver15_r8, 382, 115, 0.0F, -1.0F, -6.0F, 1, 1, 3, 0.0F, false));

		receiver16_r10 = new ModelRenderer(this);
		receiver16_r10.setRotationPoint(-3.5F, -37.3F, -19.5F);
		action.addChild(receiver16_r10);
		setRotationAngle(receiver16_r10, 0.0F, 0.0F, 0.4014F);
		receiver16_r10.cubeList.add(new ModelBox(receiver16_r10, 148, 377, 0.0F, -1.3F, -0.501F, 1, 1, 4, 0.0F, false));
		receiver16_r10.cubeList.add(new ModelBox(receiver16_r10, 158, 377, -0.001F, -1.0F, -0.501F, 1, 1, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		action.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}