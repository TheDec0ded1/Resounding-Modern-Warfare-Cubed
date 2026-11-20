package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Stoner63CarbineBarrel extends ModelBase {
	private final ModelRenderer barrelCarbine;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer barrel2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer frontsight2;
	private final ModelRenderer bone10_r1;
	private final ModelRenderer bone10_r2;

	public Stoner63CarbineBarrel() {
		textureWidth = 592;
		textureHeight = 592;

		barrelCarbine = new ModelRenderer(this);
		barrelCarbine.setRotationPoint(0.0F, 24.0F, -1.0F);
		barrelCarbine.cubeList.add(new ModelBox(barrelCarbine, 355, 562, -2.5F, -41.4F, -86.6F, 2, 6, 2, 0.0F, false));
		barrelCarbine.cubeList.add(new ModelBox(barrelCarbine, 342, 567, -2.5F, -37.4F, -75.0F, 2, 3, 2, 0.0F, false));
		barrelCarbine.cubeList.add(new ModelBox(barrelCarbine, 569, 171, -2.0F, -44.4F, -86.6F, 1, 3, 2, 0.0F, false));
		barrelCarbine.cubeList.add(new ModelBox(barrelCarbine, 394, 559, -3.0F, -44.6F, -87.1F, 3, 9, 1, -0.2F, false));
		barrelCarbine.cubeList.add(new ModelBox(barrelCarbine, 364, 562, -3.0F, -44.7F, -87.1F, 3, 1, 3, -0.2F, false));
		barrelCarbine.cubeList.add(new ModelBox(barrelCarbine, 227, 571, -3.0F, -44.7F, -84.8F, 3, 1, 1, -0.2F, false));
		barrelCarbine.cubeList.add(new ModelBox(barrelCarbine, 403, 559, -3.0F, -44.6F, -84.8F, 3, 9, 1, -0.2F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.4583F, -44.7366F, -85.45F);
		barrelCarbine.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.1309F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 319, 567, -0.5F, -1.5F, -1.5F, 1, 2, 3, -0.2F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.2061F, -38.488F, -87.05F);
		barrelCarbine.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.1309F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 310, 567, -2.0F, -8.0F, 0.0F, 1, 2, 3, -0.2F, false));

		barrel2 = new ModelRenderer(this);
		barrel2.setRotationPoint(0.0F, 9.0F, -25.0F);
		barrelCarbine.addChild(barrel2);
		barrel2.cubeList.add(new ModelBox(barrel2, 314, 280, -1.2929F, -46.5929F, -62.0F, 1, 1, 60, 0.0F, false));
		barrel2.cubeList.add(new ModelBox(barrel2, 246, 342, -2.0F, -47.3F, -62.0F, 1, 1, 60, 0.0F, false));
		barrel2.cubeList.add(new ModelBox(barrel2, 0, 378, -2.7071F, -46.5929F, -62.0F, 1, 1, 60, 0.0F, false));
		barrel2.cubeList.add(new ModelBox(barrel2, 123, 378, -2.0F, -45.8858F, -62.0F, 1, 1, 60, 0.0F, false));
		barrel2.cubeList.add(new ModelBox(barrel2, 553, 29, -1.0808F, -46.5808F, -69.0F, 1, 1, 7, 0.15F, false));
		barrel2.cubeList.add(new ModelBox(barrel2, 34, 553, -2.0F, -47.5F, -69.0F, 1, 1, 7, 0.15F, false));
		barrel2.cubeList.add(new ModelBox(barrel2, 245, 553, -2.9192F, -46.5808F, -69.0F, 1, 1, 7, 0.15F, false));
		barrel2.cubeList.add(new ModelBox(barrel2, 51, 554, -2.0F, -45.6615F, -69.0F, 1, 1, 7, 0.15F, false));
		barrel2.cubeList.add(new ModelBox(barrel2, 305, 573, -1.1515F, -46.5765F, -50.0F, 1, 1, 2, 0.1F, false));
		barrel2.cubeList.add(new ModelBox(barrel2, 149, 573, -2.0F, -47.425F, -50.0F, 1, 1, 2, 0.1F, false));
		barrel2.cubeList.add(new ModelBox(barrel2, 572, 567, -2.8485F, -46.5765F, -50.0F, 1, 1, 2, 0.1F, false));
		barrel2.cubeList.add(new ModelBox(barrel2, 572, 563, -2.0F, -45.7279F, -50.0F, 1, 1, 2, 0.1F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-0.85F, -45.4308F, -111.5F);
		barrel2.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.7854F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 579, -0.5F, -0.5F, 42.5F, 1, 1, 1, 0.15F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 572, 551, -0.5F, -0.5F, 47.5F, 1, 1, 2, 0.15F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-2.15F, -45.4308F, -111.5F);
		barrel2.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 577, 578, -0.5F, -0.5F, 42.5F, 1, 1, 1, 0.15F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 572, 555, -0.5F, -0.5F, 47.5F, 1, 1, 2, 0.15F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-2.15F, -46.7308F, -111.5F);
		barrel2.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.7854F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 572, 578, -0.5F, -0.5F, 42.5F, 1, 1, 1, 0.15F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 572, 547, -0.5F, -0.5F, 47.5F, 1, 1, 2, 0.15F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-0.85F, -46.7308F, -111.5F);
		barrel2.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 567, 578, -0.5F, -0.5F, 42.5F, 1, 1, 1, 0.15F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 503, 572, -0.5F, -0.5F, 47.5F, 1, 1, 2, 0.15F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-2.1F, -45.4765F, -91.5F);
		barrel2.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 572, 559, -0.5F, -0.5F, 41.5F, 1, 1, 2, 0.1F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-0.9F, -45.4765F, -91.5F);
		barrel2.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 572, 571, -0.5F, -0.5F, 41.5F, 1, 1, 2, 0.1F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-2.1F, -46.6765F, -91.5F);
		barrel2.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.7854F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 206, 573, -0.5F, -0.5F, 41.5F, 1, 1, 2, 0.1F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-0.9F, -46.6765F, -91.5F);
		barrel2.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.7854F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 236, 573, -0.5F, -0.5F, 41.5F, 1, 1, 2, 0.1F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-2.0F, -45.5929F, -45.5F);
		barrel2.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.7854F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 246, 404, -0.5F, -0.5F, -16.5F, 1, 1, 60, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-1.0F, -45.5929F, -45.5F);
		barrel2.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -0.7854F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 369, 342, -0.5F, -0.5F, -16.5F, 1, 1, 60, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-2.0F, -46.5929F, -45.5F);
		barrel2.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.7854F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 123, 316, -0.5F, -0.5F, -16.5F, 1, 1, 60, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-1.0F, -46.5929F, -45.5F);
		barrel2.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -0.7854F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 316, -0.5F, -0.5F, -16.5F, 1, 1, 60, 0.0F, false));

		frontsight2 = new ModelRenderer(this);
		frontsight2.setRotationPoint(-1.4835F, -48.9599F, -46.5128F);
		barrelCarbine.addChild(frontsight2);
		setRotationAngle(frontsight2, -1.5708F, 0.0F, 0.0F);
		

		bone10_r1 = new ModelRenderer(this);
		bone10_r1.setRotationPoint(-0.0165F, -2.4107F, 4.7351F);
		frontsight2.addChild(bone10_r1);
		setRotationAngle(bone10_r1, 1.5708F, 0.0F, 0.0F);
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 575, 346, -0.5F, -1.7153F, -41.25F, 1, 2, 1, -0.4F, false));

		bone10_r2 = new ModelRenderer(this);
		bone10_r2.setRotationPoint(-0.0165F, -2.4107F, 4.4351F);
		frontsight2.addChild(bone10_r2);
		setRotationAngle(bone10_r2, 1.5708F, 0.0F, 0.0F);
		bone10_r2.cubeList.add(new ModelBox(bone10_r2, 5, 579, -0.5F, -0.6153F, -41.25F, 1, 1, 1, -0.2F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		barrelCarbine.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}