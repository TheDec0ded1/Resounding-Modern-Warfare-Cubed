package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class KBP9A91Suppressor extends ModelBase {
	private final ModelRenderer Suppressor2;
	private final ModelRenderer bone25;
	private final ModelRenderer cube_r73;
	private final ModelRenderer cube_r74;
	private final ModelRenderer bone26;
	private final ModelRenderer cube_r75;
	private final ModelRenderer cube_r76;
	private final ModelRenderer bone27;
	private final ModelRenderer cube_r77;
	private final ModelRenderer cube_r78;
	private final ModelRenderer bone28;
	private final ModelRenderer cube_r79;
	private final ModelRenderer cube_r80;

	public KBP9A91Suppressor() {
		textureWidth = 220;
		textureHeight = 220;

		Suppressor2 = new ModelRenderer(this);
		Suppressor2.setRotationPoint(-1.5F, -22.5F, -51.5F);
		

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(0.0F, 0.2F, 0.0F);
		Suppressor2.addChild(bone25);
		

		cube_r73 = new ModelRenderer(this);
		cube_r73.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone25.addChild(cube_r73);
		setRotationAngle(cube_r73, 0.0F, 0.0F, -0.4363F);
		cube_r73.cubeList.add(new ModelBox(cube_r73, 0, 116, -5.4797F, 7.3496F, -33.099F, 2, 2, 34, 0.1F, false));

		cube_r74 = new ModelRenderer(this);
		cube_r74.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone25.addChild(cube_r74);
		setRotationAngle(cube_r74, 0.0F, 0.0F, 0.4363F);
		cube_r74.cubeList.add(new ModelBox(cube_r74, 38, 113, 3.4806F, 7.3492F, -33.099F, 2, 2, 34, 0.1F, false));

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(0.0F, 4.4F, 0.0F);
		Suppressor2.addChild(bone26);
		

		cube_r75 = new ModelRenderer(this);
		cube_r75.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone26.addChild(cube_r75);
		setRotationAngle(cube_r75, 0.0F, 0.0F, 0.4363F);
		cube_r75.cubeList.add(new ModelBox(cube_r75, 46, 0, 1.9767F, 6.6421F, -33.099F, 2, 2, 34, 0.1F, false));

		cube_r76 = new ModelRenderer(this);
		cube_r76.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone26.addChild(cube_r76);
		setRotationAngle(cube_r76, 0.0F, 0.0F, -0.4363F);
		cube_r76.cubeList.add(new ModelBox(cube_r76, 44, 77, -3.9758F, 6.6425F, -33.099F, 2, 2, 34, 0.1F, false));

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(2.1F, 2.3F, 0.0F);
		Suppressor2.addChild(bone27);
		setRotationAngle(bone27, 0.0F, 0.0F, 1.5708F);
		

		cube_r77 = new ModelRenderer(this);
		cube_r77.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone27.addChild(cube_r77);
		setRotationAngle(cube_r77, 0.0F, 0.0F, -0.4363F);
		cube_r77.cubeList.add(new ModelBox(cube_r77, 82, 72, 6.2441F, 3.0813F, -33.099F, 2, 2, 34, 0.1F, false));

		cube_r78 = new ModelRenderer(this);
		cube_r78.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone27.addChild(cube_r78);
		setRotationAngle(cube_r78, 0.0F, 0.0F, 0.4363F);
		cube_r78.cubeList.add(new ModelBox(cube_r78, 82, 108, 7.7475F, -4.3751F, -33.099F, 2, 2, 34, 0.1F, false));

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(-2.1F, 2.3F, 0.0F);
		Suppressor2.addChild(bone28);
		setRotationAngle(bone28, 0.0F, 0.0F, -1.5708F);
		

		cube_r79 = new ModelRenderer(this);
		cube_r79.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone28.addChild(cube_r79);
		setRotationAngle(cube_r79, 0.0F, 0.0F, 0.4363F);
		cube_r79.cubeList.add(new ModelBox(cube_r79, 79, 36, -8.2437F, 3.0822F, -33.099F, 2, 2, 34, 0.1F, false));

		cube_r80 = new ModelRenderer(this);
		cube_r80.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone28.addChild(cube_r80);
		setRotationAngle(cube_r80, 0.0F, 0.0F, -0.4363F);
		cube_r80.cubeList.add(new ModelBox(cube_r80, 0, 80, -9.748F, -4.3742F, -33.099F, 2, 2, 34, 0.1F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Suppressor2.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}