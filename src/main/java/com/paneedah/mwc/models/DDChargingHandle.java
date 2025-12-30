package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class DDChargingHandle extends ModelWithAttachments {
	private final ModelRenderer handle;
	private final ModelRenderer block_r1;
	private final ModelRenderer block_r2;
	private final ModelRenderer block_r3;

	public DDChargingHandle() {
		textureWidth = 432;
		textureHeight = 432;

		handle = new ModelRenderer(this);
		handle.setRotationPoint(0.0F, 23.4F, -0.2F);
		handle.cubeList.add(new ModelBox(handle, 242, 361, -2.35F, -40.75F, -21.001F, 2, 1, 22, -0.2F, false));
		handle.cubeList.add(new ModelBox(handle, 352, 275, -2.5013F, -40.85F, 0.2154F, 2, 1, 2, 0.0F, false));

		block_r1 = new ModelRenderer(this);
		block_r1.setRotationPoint(-1.0089F, -40.25F, -0.6323F);
		handle.addChild(block_r1);
		setRotationAngle(block_r1, 0.0F, 0.3927F, 0.0F);
		block_r1.cubeList.add(new ModelBox(block_r1, 394, 238, -1.5F, -0.5F, -0.6F, 2, 1, 3, -0.2F, false));

		block_r2 = new ModelRenderer(this);
		block_r2.setRotationPoint(-4.1026F, -40.35F, 0.917F);
		handle.addChild(block_r2);
		setRotationAngle(block_r2, 0.0F, -0.2182F, 0.0F);
		block_r2.cubeList.add(new ModelBox(block_r2, 402, 0, -0.1556F, -0.5F, -0.079F, 2, 1, 1, 0.0F, false));

		block_r3 = new ModelRenderer(this);
		block_r3.setRotationPoint(-1.0977F, -40.35F, 1.8355F);
		handle.addChild(block_r3);
		setRotationAngle(block_r3, 0.0F, 0.2182F, 0.0F);
		block_r3.cubeList.add(new ModelBox(block_r3, 398, 381, 0.5F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));
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