package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class BanditMask extends ModelBiped {
	private final ModelRenderer head_thing;
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

	public BanditMask() {
		textureWidth = 128;
		textureHeight = 128;

		head_thing = new ModelRenderer(this);
		head_thing.setRotationPoint(0.0F, 0.0F, 0.0F);
		head_thing.cubeList.add(new ModelBox(head_thing, 0, 16, -4.0F, -7.8F, -4.0F, 8, 3, 8, 0.3F, false));
		head_thing.cubeList.add(new ModelBox(head_thing, 24, 0, -3.5F, -8.8F, -3.5F, 7, 1, 7, 0.0F, false));
		head_thing.cubeList.add(new ModelBox(head_thing, 54, 0, -4.0F, -6.6F, 3.75F, 8, 5, 1, 0.1F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 23.6F, 0.0F);
		head_thing.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.0592F, 0.0399F, -0.1569F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 32, 8, 0.1F, -25.8F, -6.1F, 5, 1, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 23.7F, 0.0F);
		head_thing.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.0599F, -0.0389F, 0.1743F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 12, 43, -4.6F, -25.8F, -6.1F, 4, 1, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 24.0F, 0.0F);
		head_thing.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.0181F, 0.383F, -1.3708F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 24, 20, 20.0F, -5.7F, 13.95F, 4, 1, 1, 0.1F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 24.0F, 0.0F);
		head_thing.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.384F, -0.9948F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 34, 20, 16.2F, -15.9F, 12.55F, 4, 1, 1, 0.1F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 24.0F, 0.0F);
		head_thing.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.1376F, -0.0262F, -0.0987F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 32, 47, 6.35F, -29.0F, -4.5F, 1, 3, 5, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 24.0F, 0.0F);
		head_thing.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.1376F, 0.0262F, 0.0987F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 32, 55, -7.35F, -29.0F, -4.5F, 1, 3, 5, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 23.8F, 0.0F);
		head_thing.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.1578F, -0.009F, -0.0544F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 44, 0, -3.15F, -26.3F, 0.0F, 1, 2, 8, -0.1F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 23.8F, 0.0F);
		head_thing.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.1578F, 0.009F, 0.0544F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 48, 32, 2.15F, -26.3F, 0.0F, 1, 2, 8, -0.1F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 24.0F, 0.0F);
		head_thing.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0909F, -0.0522F, -0.0699F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 56, 12, 1.8F, -26.0F, -2.3F, 4, 2, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 24.0F, 0.0F);
		head_thing.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.056F, 0.0522F, 0.0699F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 42, 36, -5.8F, -26.0F, -3.3F, 5, 2, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head_thing.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}