package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Stoner63RifleBarrel extends ModelBase {
	private final ModelRenderer barrelRifle;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer barrel;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer frontsight3;
	private final ModelRenderer bone9_r1;
	private final ModelRenderer bone9_r2;

	public Stoner63RifleBarrel() {
		textureWidth = 592;
		textureHeight = 592;

		barrelRifle = new ModelRenderer(this);
		barrelRifle.setRotationPoint(0.0F, 24.0F, -1.0F);
		barrelRifle.cubeList.add(new ModelBox(barrelRifle, 454, 560, -2.5F, -41.4F, -86.6F, 2, 7, 2, 0.0F, false));
		barrelRifle.cubeList.add(new ModelBox(barrelRifle, 569, 165, -2.0F, -44.4F, -86.6F, 1, 3, 2, 0.0F, false));
		barrelRifle.cubeList.add(new ModelBox(barrelRifle, 559, 333, -3.0F, -44.6F, -87.1F, 3, 9, 1, -0.2F, false));
		barrelRifle.cubeList.add(new ModelBox(barrelRifle, 342, 562, -3.0F, -44.7F, -87.1F, 3, 1, 3, -0.2F, false));
		barrelRifle.cubeList.add(new ModelBox(barrelRifle, 570, 389, -3.0F, -44.7F, -84.8F, 3, 1, 1, -0.2F, false));
		barrelRifle.cubeList.add(new ModelBox(barrelRifle, 559, 344, -3.0F, -44.6F, -84.8F, 3, 9, 1, -0.2F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.4583F, -44.7366F, -85.45F);
		barrelRifle.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.1309F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 412, 566, -0.5F, -1.5F, -1.5F, 1, 2, 3, -0.2F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.2061F, -38.488F, -87.05F);
		barrelRifle.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.1309F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 143, 566, -2.0F, -8.0F, 0.0F, 1, 2, 3, -0.2F, false));

		barrel = new ModelRenderer(this);
		barrel.setRotationPoint(0.0F, 9.0F, -25.0F);
		barrelRifle.addChild(barrel);
		barrel.cubeList.add(new ModelBox(barrel, 0, 0, -1.2929F, -46.5929F, -79.0F, 1, 1, 77, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 157, 79, -2.0F, -47.3F, -79.0F, 1, 1, 77, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 157, 158, -2.7071F, -46.5929F, -79.0F, 1, 1, 77, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 237, -2.0F, -45.8858F, -79.0F, 1, 1, 77, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 17, 553, -1.0808F, -46.5808F, -86.0F, 1, 1, 7, 0.15F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 553, -2.0F, -47.5F, -86.0F, 1, 1, 7, 0.15F, false));
		barrel.cubeList.add(new ModelBox(barrel, 449, 551, -2.9192F, -46.5808F, -86.0F, 1, 1, 7, 0.15F, false));
		barrel.cubeList.add(new ModelBox(barrel, 432, 551, -2.0F, -45.6615F, -86.0F, 1, 1, 7, 0.15F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-0.85F, -45.4308F, -128.5F);
		barrel.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.7854F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 507, 578, -0.5F, -0.5F, 42.5F, 1, 1, 1, 0.15F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 115, 572, -0.5F, -0.5F, 47.5F, 1, 1, 2, 0.15F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-2.15F, -45.4308F, -128.5F);
		barrel.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 578, 508, -0.5F, -0.5F, 42.5F, 1, 1, 1, 0.15F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 84, 572, -0.5F, -0.5F, 47.5F, 1, 1, 2, 0.15F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-2.15F, -46.7308F, -128.5F);
		barrel.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.7854F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 578, 511, -0.5F, -0.5F, 42.5F, 1, 1, 1, 0.15F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 142, 572, -0.5F, -0.5F, 47.5F, 1, 1, 2, 0.15F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-0.85F, -46.7308F, -128.5F);
		barrel.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 578, 514, -0.5F, -0.5F, 42.5F, 1, 1, 1, 0.15F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 572, 360, -0.5F, -0.5F, 47.5F, 1, 1, 2, 0.15F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-2.0F, -45.5929F, -45.5F);
		barrel.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 157, 237, -0.5F, -0.5F, -33.5F, 1, 1, 77, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-1.0F, -45.5929F, -45.5F);
		barrel.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 158, -0.5F, -0.5F, -33.5F, 1, 1, 77, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-2.0F, -46.5929F, -45.5F);
		barrel.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.7854F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 157, 0, -0.5F, -0.5F, -33.5F, 1, 1, 77, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-1.0F, -46.5929F, -45.5F);
		barrel.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.7854F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 79, -0.5F, -0.5F, -33.5F, 1, 1, 77, 0.0F, false));

		frontsight3 = new ModelRenderer(this);
		frontsight3.setRotationPoint(-1.4835F, -48.9599F, -46.5128F);
		barrelRifle.addChild(frontsight3);
		setRotationAngle(frontsight3, -1.5708F, 0.0F, 0.0F);
		

		bone9_r1 = new ModelRenderer(this);
		bone9_r1.setRotationPoint(-0.0165F, -2.4107F, 4.7351F);
		frontsight3.addChild(bone9_r1);
		setRotationAngle(bone9_r1, 1.5708F, 0.0F, 0.0F);
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 312, 573, -0.5F, -1.7153F, -41.25F, 1, 2, 1, -0.4F, false));

		bone9_r2 = new ModelRenderer(this);
		bone9_r2.setRotationPoint(-0.0165F, -2.4107F, 4.4351F);
		frontsight3.addChild(bone9_r2);
		setRotationAngle(bone9_r2, 1.5708F, 0.0F, 0.0F);
		bone9_r2.cubeList.add(new ModelBox(bone9_r2, 397, 575, -0.5F, -0.6153F, -41.25F, 1, 1, 1, -0.2F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		barrelRifle.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}