package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M16ChargingHandle extends ModelWithAttachments {
	private final ModelRenderer handle;
	private final ModelRenderer handle_r1;
	private final ModelRenderer handle_r2;
	private final ModelRenderer handle_r3;
	private final ModelRenderer handle_r4;
	private final ModelRenderer handle_r5;
	private final ModelRenderer handle_r6;
	private final ModelRenderer handle_r7;
	private final ModelRenderer handle_r8;

	public M16ChargingHandle() {
		textureWidth = 672;
		textureHeight = 672;

		handle = new ModelRenderer(this);
		handle.setRotationPoint(0.0F, 23.7F, -0.2F);
		handle.cubeList.add(new ModelBox(handle, 144, 606, -2.5F, -40.75F, -21.001F, 2, 1, 22, -0.05F, false));
		handle.cubeList.add(new ModelBox(handle, 528, 657, 0.275F, -40.75F, 0.499F, 1, 1, 1, -0.2F, false));
		handle.cubeList.add(new ModelBox(handle, 540, 657, -3.975F, -40.85F, 0.999F, 1, 1, 1, 0.0F, false));
		handle.cubeList.add(new ModelBox(handle, 658, 8, -0.025F, -40.85F, 0.999F, 1, 1, 1, 0.0F, false));
		handle.cubeList.add(new ModelBox(handle, 598, 218, -3.0013F, -40.85F, 1.2154F, 3, 1, 1, 0.0F, false));
		handle.cubeList.add(new ModelBox(handle, 544, 657, -2.0013F, -40.85F, -0.2174F, 1, 1, 1, 0.0F, false));
		handle.cubeList.add(new ModelBox(handle, 144, 604, -3.0013F, -40.85F, 0.7826F, 3, 1, 1, 0.0F, false));

		handle_r1 = new ModelRenderer(this);
		handle_r1.setRotationPoint(-2.375F, -40.35F, 0.599F);
		handle.addChild(handle_r1);
		setRotationAngle(handle_r1, 0.0F, -0.3927F, 0.0F);
		handle_r1.cubeList.add(new ModelBox(handle_r1, 590, 653, -0.5F, -0.5F, -1.5F, 1, 1, 2, 0.0F, false));

		handle_r2 = new ModelRenderer(this);
		handle_r2.setRotationPoint(-0.725F, -40.35F, 0.599F);
		handle.addChild(handle_r2);
		setRotationAngle(handle_r2, 0.0F, 0.3927F, 0.0F);
		handle_r2.cubeList.add(new ModelBox(handle_r2, 8, 654, -0.5F, -0.5F, -1.5F, 1, 1, 2, 0.0F, false));

		handle_r3 = new ModelRenderer(this);
		handle_r3.setRotationPoint(1.6F, -40.35F, 2.081F);
		handle.addChild(handle_r3);
		setRotationAngle(handle_r3, 0.0F, -0.2182F, 0.0F);
		handle_r3.cubeList.add(new ModelBox(handle_r3, 658, 6, -1.8444F, -0.5F, -0.921F, 1, 1, 1, 0.0F, false));

		handle_r4 = new ModelRenderer(this);
		handle_r4.setRotationPoint(-0.8089F, -40.25F, -0.6323F);
		handle.addChild(handle_r4);
		setRotationAngle(handle_r4, 0.0F, 0.3927F, 0.0F);
		handle_r4.cubeList.add(new ModelBox(handle_r4, 596, 653, -0.5F, -0.5F, -0.2F, 1, 1, 2, -0.2F, false));

		handle_r5 = new ModelRenderer(this);
		handle_r5.setRotationPoint(-4.6F, -40.35F, 0.917F);
		handle.addChild(handle_r5);
		setRotationAngle(handle_r5, 0.0F, -0.2182F, 0.0F);
		handle_r5.cubeList.add(new ModelBox(handle_r5, 536, 657, 0.8444F, -0.5F, -0.079F, 1, 1, 1, 0.0F, false));

		handle_r6 = new ModelRenderer(this);
		handle_r6.setRotationPoint(1.9385F, -40.25F, 1.629F);
		handle.addChild(handle_r6);
		setRotationAngle(handle_r6, 0.0F, -0.2182F, 0.0F);
		handle_r6.cubeList.add(new ModelBox(handle_r6, 650, 642, -2.8444F, -0.5F, -0.921F, 2, 1, 1, -0.2F, false));

		handle_r7 = new ModelRenderer(this);
		handle_r7.setRotationPoint(-4.3549F, -40.35F, 1.5954F);
		handle.addChild(handle_r7);
		setRotationAngle(handle_r7, 0.0F, 0.2182F, 0.0F);
		handle_r7.cubeList.add(new ModelBox(handle_r7, 532, 657, 0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		handle_r8 = new ModelRenderer(this);
		handle_r8.setRotationPoint(-0.5977F, -40.35F, 1.8355F);
		handle.addChild(handle_r8);
		setRotationAngle(handle_r8, 0.0F, 0.2182F, 0.0F);
		handle_r8.cubeList.add(new ModelBox(handle_r8, 524, 657, 0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
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