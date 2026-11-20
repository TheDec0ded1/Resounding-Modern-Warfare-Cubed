package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class MP510Mag extends ModelBase {
	private final ModelRenderer magazine30;
	private final ModelRenderer bone23;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer bone24;
	private final ModelRenderer bone25;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer bone26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;

	public MP510Mag() {
		textureWidth = 280;
		textureHeight = 300;

		magazine30 = new ModelRenderer(this);
		magazine30.setRotationPoint(-1.5F, 2.7314F, -19.6454F);
		setRotationAngle(magazine30, 0.1309F, 0.0F, 0.0F);
		magazine30.cubeList.add(new ModelBox(magazine30, 0, 0, -1.0F, -11.375F, 4.65F, 2, 2, 2, 0.0F, false));

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(0.0F, -6.4236F, 4.0209F);
		magazine30.addChild(bone23);
		setRotationAngle(bone23, -0.3054F, 0.0F, 0.0F);
		bone23.cubeList.add(new ModelBox(bone23, 24, 35, -1.5F, -5.5008F, -3.0F, 3, 21, 4, 0.0F, false));
		bone23.cubeList.add(new ModelBox(bone23, 23, 34, -2.0F, -1.0008F, -3.75F, 4, 1, 5, -0.25F, false));
		bone23.cubeList.add(new ModelBox(bone23, 23, 34, -2.0F, 14.9992F, -3.75F, 4, 1, 5, -0.25F, false));
		bone23.cubeList.add(new ModelBox(bone23, 27, 38, -2.0F, 2.9992F, 0.45F, 4, 1, 1, -0.25F, false));
		bone23.cubeList.add(new ModelBox(bone23, 27, 38, -2.0F, 6.9992F, 0.45F, 4, 1, 1, -0.25F, false));
		bone23.cubeList.add(new ModelBox(bone23, 26, 37, -2.0F, 6.9992F, -3.25F, 4, 1, 2, -0.25F, false));
		bone23.cubeList.add(new ModelBox(bone23, 26, 37, -2.0F, 2.9992F, -3.25F, 4, 1, 2, -0.25F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(2.2776F, 0.0F, -2.8034F);
		bone23.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, -0.3054F, 0.0F);
		

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.7224F, 0.0F, -2.8034F);
		bone23.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.3054F, 0.0F);
		

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(2.2776F, 0.0F, -1.8034F);
		bone23.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, -0.3054F, 0.0F);
		

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.7224F, 0.0F, -1.8034F);
		bone23.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.3054F, 0.0F);
		

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(3.0F, 0.0F, 0.0F);
		bone23.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, 0.3491F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 131, 3, -6.1311F, -4.6048F, -1.0054F, 1, 1, 2, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone23.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, -0.3491F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 131, 10, 2.312F, -5.6309F, -1.0054F, 1, 1, 2, 0.0F, false));

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(0.0F, -1.4664F, 3.3682F);
		magazine30.addChild(bone24);
		setRotationAngle(bone24, -0.4363F, 0.0F, 0.0F);
		

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(0.0463F, 2.8216F, 1.253F);
		magazine30.addChild(bone25);
		setRotationAngle(bone25, -0.4712F, 0.0F, 0.0F);
		

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(2.2313F, -2.7855F, -4.1693F);
		bone25.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, -0.3054F, 0.0F);
		

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(0.6762F, -2.7855F, -4.1693F);
		bone25.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.3054F, 0.0F);
		

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(2.2313F, -2.7855F, -3.1693F);
		bone25.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, -0.3054F, 0.0F);
		

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(0.6762F, -2.7855F, -3.1693F);
		bone25.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.3054F, 0.0F);
		

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(0.0463F, 5.3158F, -0.4874F);
		magazine30.addChild(bone26);
		setRotationAngle(bone26, -0.6545F, 0.0F, 0.0F);
		

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(2.2313F, 2.2648F, -4.2034F);
		bone26.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, -0.3054F, 0.0F);
		

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(0.6762F, 2.2648F, -4.2034F);
		bone26.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, 0.3054F, 0.0F);
		

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(2.2313F, 2.2648F, -3.2034F);
		bone26.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.0F, -0.3054F, 0.0F);
		

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(0.6762F, 2.2648F, -3.2034F);
		bone26.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.0F, 0.3054F, 0.0F);
		
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		magazine30.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}