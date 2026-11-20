package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M110Magazine10 extends ModelBase {
	private final ModelRenderer magazine10;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer cube_r31;

	public M110Magazine10() {
		textureWidth = 544;
		textureHeight = 544;

		magazine10 = new ModelRenderer(this);
		magazine10.setRotationPoint(0.25F, -2.4F, -22.7F);
		magazine10.cubeList.add(new ModelBox(magazine10, 178, 499, -1.0F, -9.0F, -1.0F, 1, 8, 2, 0.0F, false));
		magazine10.cubeList.add(new ModelBox(magazine10, 422, 498, -3.25F, -9.001F, 0.9F, 3, 9, 6, 0.0F, false));
		magazine10.cubeList.add(new ModelBox(magazine10, 168, 499, -3.25F, -9.001F, -1.1F, 3, 8, 2, 0.0F, false));
		magazine10.cubeList.add(new ModelBox(magazine10, 288, 431, -3.251F, -9.002F, 6.4F, 3, 9, 2, 0.0F, false));
		magazine10.cubeList.add(new ModelBox(magazine10, 174, 509, -1.0F, -9.0F, 2.75F, 1, 9, 1, 0.0F, false));
		magazine10.cubeList.add(new ModelBox(magazine10, 510, 400, -1.0F, -8.9F, 4.5F, 1, 9, 1, 0.0F, false));
		magazine10.cubeList.add(new ModelBox(magazine10, 324, 356, -1.0F, -9.0F, 6.5F, 1, 10, 1, 0.0F, false));
		magazine10.cubeList.add(new ModelBox(magazine10, 470, 243, -0.8F, -9.0F, 7.8F, 1, 10, 1, -0.2F, false));
		magazine10.cubeList.add(new ModelBox(magazine10, 112, 520, -0.799F, -0.1F, 7.799F, 1, 2, 1, -0.2F, false));
		magazine10.cubeList.add(new ModelBox(magazine10, 492, 458, -3.7F, -9.0F, 7.8F, 1, 10, 1, -0.2F, false));
		magazine10.cubeList.add(new ModelBox(magazine10, 116, 520, -3.701F, -0.1F, 7.799F, 1, 2, 1, -0.2F, false));
		magazine10.cubeList.add(new ModelBox(magazine10, 168, 509, -3.5F, -9.0F, -1.0F, 1, 8, 2, 0.0F, false));
		magazine10.cubeList.add(new ModelBox(magazine10, 28, 515, -3.5F, -9.0F, 1.0F, 1, 1, 2, 0.0F, false));
		magazine10.cubeList.add(new ModelBox(magazine10, 34, 515, -1.0F, -9.0F, 1.0F, 1, 1, 2, 0.0F, false));
		magazine10.cubeList.add(new ModelBox(magazine10, 178, 509, -3.5F, -9.0F, 2.75F, 1, 9, 1, 0.0F, false));
		magazine10.cubeList.add(new ModelBox(magazine10, 510, 410, -3.5F, -8.9F, 4.5F, 1, 9, 1, 0.0F, false));
		magazine10.cubeList.add(new ModelBox(magazine10, 282, 500, -3.5F, -9.0F, 6.5F, 1, 10, 1, 0.0F, false));
		magazine10.cubeList.add(new ModelBox(magazine10, 508, 391, -3.25F, -7.0F, 8.15F, 3, 8, 1, 0.0F, false));
		magazine10.cubeList.add(new ModelBox(magazine10, 352, 168, -3.249F, 0.7F, 8.149F, 3, 1, 1, 0.0F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-2.5F, 9.0F, 0.0F);
		magazine10.addChild(cube_r25);
		setRotationAngle(cube_r25, 1.3788F, 0.0F, 0.0F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 180, 521, -0.998F, 4.7826F, 8.8336F, 1, 1, 1, 0.0F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 508, 514, -0.999F, 1.0826F, 8.8346F, 1, 4, 1, 0.0F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 120, 520, -0.999F, -2.7174F, 8.8346F, 1, 2, 1, 0.0F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 184, 521, 1.502F, 4.7826F, 8.8336F, 1, 1, 1, 0.0F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 40, 515, 1.501F, 1.0826F, 8.8346F, 1, 4, 1, 0.0F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 354, 254, -0.748F, 5.7826F, 8.8336F, 3, 1, 1, 0.0F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 482, 458, -0.749F, -2.7174F, 8.8326F, 3, 9, 2, 0.0F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 124, 520, 1.501F, -2.7174F, 8.8346F, 1, 2, 1, 0.0F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-3.3F, -6.0F, 7.4F);
		magazine10.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, 0.3491F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 232, 467, -1.0262F, -3.819F, -4.001F, 1, 1, 5, 0.0F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(-0.2F, -6.0F, 7.4F);
		magazine10.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, 0.0F, -0.3491F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 244, 467, 0.0262F, -3.819F, -4.001F, 1, 1, 5, 0.0F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-3.5F, -6.0F, 6.5F);
		magazine10.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, 0.0F, 0.3491F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 188, 521, -1.0262F, -3.819F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(0.0F, -6.0F, 6.5F);
		magazine10.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.0F, 0.0F, -0.3491F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 192, 521, 0.0262F, -3.819F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(-3.5F, -5.9F, 4.5F);
		magazine10.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.0F, 0.0F, 0.3491F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 196, 521, -1.0262F, -3.819F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(0.0F, -5.9F, 4.5F);
		magazine10.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.0F, 0.0F, -0.3491F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 200, 521, 0.0262F, -3.819F, 0.0F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		magazine10.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}