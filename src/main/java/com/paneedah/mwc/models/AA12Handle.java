package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AA12Handle extends ModelWithAttachments {
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

	public AA12Handle() {
		textureWidth = 512;
		textureHeight = 512;

		handle = new ModelRenderer(this);
		handle.setRotationPoint(0.0F, 24.0F, 0.0F);
		handle.cubeList.add(new ModelBox(handle, 90, 126, -2.5F, -45.2F, -30.0F, 2, 1, 31, 0.0F, false));
		handle.cubeList.add(new ModelBox(handle, 73, 66, -2.5F, -45.5F, -30.6F, 2, 1, 3, 0.0F, false));
		handle.cubeList.add(new ModelBox(handle, 59, 77, -2.0F, -45.8F, -30.6F, 1, 1, 3, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.5F, -47.6645F, -30.0587F);
		handle.addChild(cube_r1);
		setRotationAngle(cube_r1, 1.9635F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 105, 119, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.5F, -46.8522F, -29.86F);
		handle.addChild(cube_r2);
		setRotationAngle(cube_r2, 1.6581F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 110, 119, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1.5F, -46.0988F, -29.9591F);
		handle.addChild(cube_r3);
		setRotationAngle(cube_r3, 1.2217F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 115, 120, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.5F, -48.4332F, -30.2355F);
		handle.addChild(cube_r4);
		setRotationAngle(cube_r4, 1.5708F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 95, 119, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.5F, -48.5082F, -30.2355F);
		handle.addChild(cube_r5);
		setRotationAngle(cube_r5, 1.5708F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 100, 119, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-1.5F, -48.3179F, -29.5825F);
		handle.addChild(cube_r6);
		setRotationAngle(cube_r6, 1.0036F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 79, 121, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.5F, -47.7699F, -28.9844F);
		handle.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.6545F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 123, 79, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-1.0F, -43.6435F, -31.1142F);
		handle.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.3054F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 74, 121, -1.0F, -2.0F, 3.0F, 1, 1, 1, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-1.0F, -44.2991F, -31.2135F);
		handle.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.3927F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 123, 82, -1.0F, -2.0F, 3.0F, 1, 1, 1, 0.0F, false));
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