package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Tavor21Handguard extends ModelBase {
	private final ModelRenderer handguard;
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
	private final ModelRenderer cube_r11;

	public Tavor21Handguard() {
		textureWidth = 432;
		textureHeight = 432;

		handguard = new ModelRenderer(this);
		handguard.setRotationPoint(0.0F, 24.0F, 0.0F);
		handguard.cubeList.add(new ModelBox(handguard, 346, 223, -4.0F, -35.8646F, -30.9322F, 5, 5, 18, -0.025F, false));
		handguard.cubeList.add(new ModelBox(handguard, 350, 417, -4.0F, -35.8646F, -31.5322F, 5, 2, 1, -0.025F, false));
		handguard.cubeList.add(new ModelBox(handguard, 144, 420, -0.95F, -34.15F, -29.1F, 2, 2, 2, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-4.4F, -30.1F, -29.7F);
		handguard.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.2618F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 422, 365, 0.2F, -3.4F, 0.0F, 1, 3, 1, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 422, 407, 4.6F, -2.4F, 0.0F, 1, 2, 1, -0.2F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-4.4F, -30.1F, -27.7F);
		handguard.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.2618F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 368, 422, 0.2F, -3.4F, 0.0F, 1, 3, 1, -0.2F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 422, 361, 4.6F, -3.4F, 0.0F, 1, 3, 1, -0.2F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-4.4F, -30.1F, -25.7F);
		handguard.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.2618F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 422, 369, 0.2F, -3.4F, 0.0F, 1, 3, 1, -0.2F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 364, 422, 4.6F, -3.4F, 0.0F, 1, 3, 1, -0.2F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-4.4F, -30.1F, -23.7F);
		handguard.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.2618F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 372, 422, 0.2F, -3.4F, 0.0F, 1, 3, 1, -0.2F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 422, 357, 4.6F, -3.4F, 0.0F, 1, 3, 1, -0.2F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-4.4F, -30.1F, -21.7F);
		handguard.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.2618F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 422, 373, 0.2F, -3.4F, 0.0F, 1, 3, 1, -0.2F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 360, 422, 4.6F, -3.4F, 0.0F, 1, 3, 1, -0.2F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-4.4F, -30.1F, -17.7F);
		handguard.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.2618F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 422, 132, 0.2F, -3.4F, 0.0F, 1, 4, 1, -0.2F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 422, 127, 4.6F, -3.4F, 0.0F, 1, 4, 1, -0.2F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-4.4F, -30.1F, -19.7F);
		handguard.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.2618F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 422, 137, 0.2F, -3.4F, 0.0F, 1, 4, 1, -0.2F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 422, 122, 4.6F, -3.4F, 0.0F, 1, 4, 1, -0.2F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-1.5F, -29.9887F, -30.3797F);
		handguard.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.2182F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 422, 423, -1.7679F, 0.091F, -0.4875F, 1, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 408, 147, -2.501F, -5.591F, -0.5125F, 5, 6, 1, -0.025F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 420, 171, -1.2321F, 0.091F, -0.4875F, 3, 1, 1, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-1.5F, -29.9887F, -30.3797F);
		handguard.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.1555F, -0.1536F, 0.7734F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 424, -1.4786F, 1.0216F, -0.4875F, 1, 1, 1, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 424, 0, 1.0216F, -1.4786F, -0.4875F, 1, 1, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-1.5F, -30.2735F, -19.9197F);
		handguard.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.0618F, 0.0617F, 0.7835F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 258, 388, -1.4786F, 1.0216F, -10.9875F, 1, 1, 17, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 222, 388, 1.0216F, -1.4786F, -10.9875F, 1, 1, 17, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-1.5F, -30.2735F, -19.9197F);
		handguard.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.0873F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 100, 370, -2.501F, -1.591F, -11.0125F, 5, 2, 17, -0.025F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 388, 293, -1.7679F, 0.0911F, -10.9875F, 1, 1, 17, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 222, 370, -1.2321F, 0.0911F, -10.9875F, 3, 1, 17, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handguard.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}