package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FALOhandguard extends ModelBase {
	private final ModelRenderer handguardFALO;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer gun_r1;
	private final ModelRenderer gun_r2;

	public FALOhandguard() {
		textureWidth = 624;
		textureHeight = 624;

		handguardFALO = new ModelRenderer(this);
		handguardFALO.setRotationPoint(-1.499F, -16.8813F, -52.45F);
		handguardFALO.cubeList.add(new ModelBox(handguardFALO, 474, 609, -1.4546F, -0.0391F, 0.501F, 1, 1, 1, 0.175F, false));
		handguardFALO.cubeList.add(new ModelBox(handguardFALO, 306, 204, -1.5046F, 5.8843F, 0.501F, 3, 1, 1, 0.175F, false));
		handguardFALO.cubeList.add(new ModelBox(handguardFALO, 482, 609, -0.5F, -0.9937F, 0.501F, 1, 1, 1, 0.175F, false));
		handguardFALO.cubeList.add(new ModelBox(handguardFALO, 486, 609, 0.4546F, -0.0391F, 0.501F, 1, 1, 1, 0.175F, false));
		handguardFALO.cubeList.add(new ModelBox(handguardFALO, 462, 505, 2.1163F, 2.2226F, 0.501F, 1, 3, 1, 0.175F, false));
		handguardFALO.cubeList.add(new ModelBox(handguardFALO, 60, 530, -3.1163F, 2.2226F, 0.501F, 1, 3, 1, 0.175F, false));
		handguardFALO.cubeList.add(new ModelBox(handguardFALO, 88, 570, -3.4438F, 2.0476F, 1.25F, 1, 3, 1, 0.0F, false));
		handguardFALO.cubeList.add(new ModelBox(handguardFALO, 538, 451, -1.5225F, 6.5189F, 1.25F, 3, 1, 20, 0.0F, false));
		handguardFALO.cubeList.add(new ModelBox(handguardFALO, 88, 574, 2.4438F, 2.0476F, 1.25F, 1, 3, 1, 0.0F, false));
		handguardFALO.cubeList.add(new ModelBox(handguardFALO, 494, 609, 2.4438F, 4.3976F, 1.25F, 1, 1, 1, 0.0F, false));
		handguardFALO.cubeList.add(new ModelBox(handguardFALO, 498, 609, -3.4438F, 4.3976F, 1.25F, 1, 1, 1, 0.0F, false));
		handguardFALO.cubeList.add(new ModelBox(handguardFALO, 468, 309, 2.4438F, 4.3976F, 19.25F, 1, 1, 2, 0.0F, false));
		handguardFALO.cubeList.add(new ModelBox(handguardFALO, 474, 169, -3.4438F, 4.3976F, 19.25F, 1, 1, 2, 0.0F, false));
		handguardFALO.cubeList.add(new ModelBox(handguardFALO, 226, 605, -3.4438F, 2.0476F, 19.25F, 1, 3, 2, 0.0F, false));
		handguardFALO.cubeList.add(new ModelBox(handguardFALO, 296, 605, 2.4438F, 2.0476F, 19.25F, 1, 3, 2, 0.0F, false));
		handguardFALO.cubeList.add(new ModelBox(handguardFALO, 554, 572, 2.4438F, 2.0476F, 2.25F, 1, 1, 17, 0.0F, false));
		handguardFALO.cubeList.add(new ModelBox(handguardFALO, 92, 559, 2.1938F, 2.5476F, 2.25F, 1, 3, 17, 0.0F, false));
		handguardFALO.cubeList.add(new ModelBox(handguardFALO, 364, 574, -3.4438F, 2.0476F, 2.25F, 1, 1, 17, 0.0F, false));
		handguardFALO.cubeList.add(new ModelBox(handguardFALO, 128, 559, -3.1938F, 2.5476F, 2.25F, 1, 3, 17, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.3367F, 6.1047F, 1.5F);
		handguardFALO.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 408, 232, -1.0F, -1.0F, -1.0F, 2, 1, 1, 0.175F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(2.3367F, 6.1047F, 1.5F);
		handguardFALO.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 206, 609, -1.0F, -1.0F, -1.0F, 1, 2, 1, 0.175F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(9.8078F, -0.9663F, 20.25F);
		handguardFALO.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.7854F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 232, 606, -1.0F, 9.0F, -1.0F, 1, 3, 2, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 564, 553, -1.25F, 10.0F, -18.0F, 1, 2, 17, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 272, 575, -1.0F, 9.0F, -18.0F, 1, 1, 17, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 580, 295, -1.0F, 9.0F, -19.0F, 1, 3, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(2.0296F, 2.0476F, 20.25F);
		handguardFALO.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 182, 39, -2.0F, -1.0F, -1.0F, 3, 1, 2, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 558, 425, -1.0F, -0.75F, -18.0F, 2, 1, 17, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 482, 572, -2.0F, -1.0F, -18.0F, 1, 1, 17, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 314, 243, -2.0F, -1.0F, -19.0F, 3, 1, 1, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(5.7486F, -0.9663F, 20.25F);
		handguardFALO.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.7854F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 180, 162, -2.0F, 10.0F, -1.0F, 3, 1, 2, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 164, 559, -1.0F, 9.75F, -18.0F, 2, 1, 17, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 202, 576, -2.0F, 10.0F, -18.0F, 1, 1, 17, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 322, 243, -2.0F, 10.0F, -19.0F, 3, 1, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-2.0296F, 2.0476F, 20.25F);
		handguardFALO.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 158, 579, -1.0F, -2.0F, -1.0F, 1, 3, 2, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 36, 561, -0.75F, -1.0F, -18.0F, 1, 2, 17, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 518, 572, -1.0F, -2.0F, -18.0F, 1, 1, 17, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 88, 566, -1.0F, -2.0F, -19.0F, 1, 3, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(1.6296F, 2.0476F, 1.5F);
		handguardFALO.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 330, 243, -1.0F, -1.0F, -1.0F, 2, 1, 1, 0.175F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-1.6296F, 2.0476F, 1.5F);
		handguardFALO.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 588, 608, -1.0F, -1.0F, -1.0F, 1, 2, 1, 0.175F, false));

		gun_r1 = new ModelRenderer(this);
		gun_r1.setRotationPoint(1.0286F, -0.5676F, 2.0F);
		handguardFALO.addChild(gun_r1);
		setRotationAngle(gun_r1, 0.0F, 0.0F, 0.7854F);
		gun_r1.cubeList.add(new ModelBox(gun_r1, 490, 609, -0.5F, 0.0F, -1.5F, 1, 1, 1, 0.175F, false));

		gun_r2 = new ModelRenderer(this);
		gun_r2.setRotationPoint(-1.7357F, 0.8466F, 2.0F);
		handguardFALO.addChild(gun_r2);
		setRotationAngle(gun_r2, 0.0F, 0.0F, 0.7854F);
		gun_r2.cubeList.add(new ModelBox(gun_r2, 478, 609, -0.5F, -2.0F, -1.5F, 1, 1, 1, 0.175F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handguardFALO.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}