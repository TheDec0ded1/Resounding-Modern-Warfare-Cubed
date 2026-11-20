package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FALhandleL1A1 extends ModelWithAttachments {
	private final ModelRenderer handle;
	private final ModelRenderer action_r1;
	private final ModelRenderer bone9;

	public FALhandleL1A1() {
		textureWidth = 576;
		textureHeight = 576;

		handle = new ModelRenderer(this);
		handle.setRotationPoint(3.3732F, -12.5947F, -23.0041F);
		handle.cubeList.add(new ModelBox(handle, 416, 535, -2.8385F, -1.0099F, -3.4395F, 1, 1, 15, 0.0F, false));
		handle.cubeList.add(new ModelBox(handle, 178, 558, -2.3385F, -1.0099F, -4.6395F, 1, 1, 1, 0.0F, false));
		handle.cubeList.add(new ModelBox(handle, 558, 188, -2.3382F, -0.4099F, -4.6395F, 1, 1, 1, 0.0F, false));
		handle.cubeList.add(new ModelBox(handle, 448, 535, -2.8382F, -0.4099F, -3.4399F, 1, 1, 15, 0.0F, false));

		action_r1 = new ModelRenderer(this);
		action_r1.setRotationPoint(-1.9385F, -0.1849F, -6.1395F);
		handle.addChild(action_r1);
		setRotationAngle(action_r1, 0.0F, 0.1396F, 0.0F);
		action_r1.cubeList.add(new ModelBox(action_r1, 188, 550, -0.8F, -1.0F, -2.5F, 1, 2, 5, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-1.0732F, -0.0053F, -3.8459F);
		handle.addChild(bone9);
		setRotationAngle(bone9, 0.0F, -0.5585F, 0.0F);
		bone9.cubeList.add(new ModelBox(bone9, 558, 190, -1.106F, -1.0F, 0.3021F, 1, 1, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 558, 192, -1.105F, -0.4F, 0.3021F, 1, 1, 1, 0.0F, false));
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