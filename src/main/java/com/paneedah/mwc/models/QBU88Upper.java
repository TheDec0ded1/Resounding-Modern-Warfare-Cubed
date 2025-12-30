package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBU88Upper extends ModelBase {
	private final ModelRenderer upper;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer grip_r1;
	private final ModelRenderer grip_r2;
	private final ModelRenderer grip_r3;
	private final ModelRenderer grip_r4;

	public QBU88Upper() {
		textureWidth = 544;
		textureHeight = 544;

		upper = new ModelRenderer(this);
		upper.setRotationPoint(-0.5F, -12.75F, -14.75F);
		upper.cubeList.add(new ModelBox(upper, 467, 133, -3.5F, -2.85F, -29.95F, 5, 3, 3, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 0, 479, -1.5063F, -2.9104F, -23.95F, 1, 1, 23, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 429, 74, -3.0F, -3.0F, -0.95F, 4, 2, 26, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 488, 30, -2.75F, -2.5F, 1.0F, 4, 1, 19, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 488, 51, -3.25F, -2.5F, 1.0F, 4, 1, 19, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 489, 350, -3.25F, -3.0F, 22.05F, 1, 2, 3, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 279, 473, 0.0F, -1.0F, -0.95F, 1, 1, 26, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-0.2672F, -2.2832F, -19.95F);
		upper.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, 0.3054F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 484, 133, -0.5F, -0.5F, -4.0F, 1, 1, 23, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-3.9329F, -1.9026F, -20.95F);
		upper.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, 0.7854F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 147, 479, 2.5355F, -3.5355F, -3.0F, 1, 1, 23, 0.0F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-1.7328F, -2.2832F, -19.95F);
		upper.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, 1.2654F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 98, 479, -0.5F, -0.5F, -4.0F, 1, 1, 23, 0.0F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-3.0671F, -1.9026F, -20.95F);
		upper.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, 0.7854F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 49, 479, 0.0F, -1.0F, -3.0F, 1, 1, 23, 0.0F, false));

		grip_r1 = new ModelRenderer(this);
		grip_r1.setRotationPoint(0.6872F, -1.3062F, 20.05F);
		upper.addChild(grip_r1);
		setRotationAngle(grip_r1, 0.0F, 0.0F, -0.2182F);
		grip_r1.cubeList.add(new ModelBox(grip_r1, 529, 118, -0.5F, -1.5F, 3.0F, 1, 2, 2, 0.0F, false));
		grip_r1.cubeList.add(new ModelBox(grip_r1, 114, 450, -0.5F, -0.5F, -47.0F, 1, 2, 26, 0.0F, false));

		grip_r2 = new ModelRenderer(this);
		grip_r2.setRotationPoint(0.6872F, -6.3062F, -8.95F);
		upper.addChild(grip_r2);
		setRotationAngle(grip_r2, 0.0F, 0.0F, -0.2182F);
		grip_r2.cubeList.add(new ModelBox(grip_r2, 524, 525, -1.2F, 4.9F, -18.0F, 1, 1, 3, -0.2F, false));

		grip_r3 = new ModelRenderer(this);
		grip_r3.setRotationPoint(-2.6872F, -6.3062F, -8.95F);
		upper.addChild(grip_r3);
		setRotationAngle(grip_r3, 0.0F, 0.0F, 0.2182F);
		grip_r3.cubeList.add(new ModelBox(grip_r3, 515, 525, 0.2F, 4.9F, -18.0F, 1, 1, 3, -0.2F, false));

		grip_r4 = new ModelRenderer(this);
		grip_r4.setRotationPoint(-2.6872F, -1.3062F, -8.95F);
		upper.addChild(grip_r4);
		setRotationAngle(grip_r4, 0.0F, 0.0F, 0.2182F);
		grip_r4.cubeList.add(new ModelBox(grip_r4, 169, 450, -0.5F, -0.5F, -18.0F, 1, 2, 26, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		upper.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}