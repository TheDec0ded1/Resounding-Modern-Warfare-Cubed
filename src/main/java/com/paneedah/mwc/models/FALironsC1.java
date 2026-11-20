package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FALironsC1 extends ModelBase {
	private final ModelRenderer ironsC1;
	private final ModelRenderer bone10_r1;
	private final ModelRenderer bone9_r1;
	private final ModelRenderer bone9_r2;
	private final ModelRenderer bone8_r1;
	private final ModelRenderer bone36;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;

	public FALironsC1() {
		textureWidth = 576;
		textureHeight = 576;

		ironsC1 = new ModelRenderer(this);
		ironsC1.setRotationPoint(-6.5F, -9.2F, 6.55F);
		ironsC1.cubeList.add(new ModelBox(ironsC1, 560, 2, 4.4F, -11.3161F, -2.1161F, 1, 1, 1, -0.35F, false));
		ironsC1.cubeList.add(new ModelBox(ironsC1, 560, 4, 4.6F, -11.3161F, -2.1161F, 1, 1, 1, -0.35F, false));
		ironsC1.cubeList.add(new ModelBox(ironsC1, 560, 6, 4.0465F, -10.7625F, -2.1161F, 1, 1, 1, -0.35F, false));
		ironsC1.cubeList.add(new ModelBox(ironsC1, 80, 560, 4.0465F, -10.9625F, -2.1161F, 1, 1, 1, -0.35F, false));
		ironsC1.cubeList.add(new ModelBox(ironsC1, 100, 560, 4.4F, -10.4089F, -2.1161F, 1, 1, 1, -0.35F, false));
		ironsC1.cubeList.add(new ModelBox(ironsC1, 104, 560, 4.6F, -10.4089F, -2.1161F, 1, 1, 1, -0.35F, false));
		ironsC1.cubeList.add(new ModelBox(ironsC1, 130, 560, 4.9535F, -10.9625F, -2.1161F, 1, 1, 1, -0.35F, false));
		ironsC1.cubeList.add(new ModelBox(ironsC1, 134, 560, 4.9535F, -10.7625F, -2.1161F, 1, 1, 1, -0.35F, false));

		bone10_r1 = new ModelRenderer(this);
		bone10_r1.setRotationPoint(6.9824F, -8.6629F, -1.6161F);
		ironsC1.addChild(bone10_r1);
		setRotationAngle(bone10_r1, 0.0F, 0.0F, 0.7854F);
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 126, 560, -2.65F, -0.4F, -0.5F, 1, 1, 1, -0.35F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 122, 560, -2.65F, -0.2F, -0.5F, 1, 1, 1, -0.35F, false));

		bone9_r1 = new ModelRenderer(this);
		bone9_r1.setRotationPoint(4.6439F, -10.0771F, -1.6161F);
		ironsC1.addChild(bone9_r1);
		setRotationAngle(bone9_r1, 0.0F, 0.0F, 0.7854F);
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 118, 560, -0.55F, -0.5F, -0.5F, 1, 1, 1, -0.35F, false));
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 108, 560, -0.35F, -0.5F, -0.5F, 1, 1, 1, -0.35F, false));

		bone9_r2 = new ModelRenderer(this);
		bone9_r2.setRotationPoint(6.341F, -9.3044F, -1.6161F);
		ironsC1.addChild(bone9_r2);
		setRotationAngle(bone9_r2, 0.0F, 0.0F, 0.7854F);
		bone9_r2.cubeList.add(new ModelBox(bone9_r2, 96, 560, -2.65F, -0.2F, -0.5F, 1, 1, 1, -0.35F, false));
		bone9_r2.cubeList.add(new ModelBox(bone9_r2, 92, 560, -2.65F, -0.4F, -0.5F, 1, 1, 1, -0.35F, false));

		bone8_r1 = new ModelRenderer(this);
		bone8_r1.setRotationPoint(5.2854F, -10.7186F, -1.6161F);
		ironsC1.addChild(bone8_r1);
		setRotationAngle(bone8_r1, 0.0F, 0.0F, 0.7854F);
		bone8_r1.cubeList.add(new ModelBox(bone8_r1, 88, 560, -0.35F, -0.5F, -0.5F, 1, 1, 1, -0.35F, false));
		bone8_r1.cubeList.add(new ModelBox(bone8_r1, 84, 560, -0.55F, -0.5F, -0.5F, 1, 1, 1, -0.35F, false));

		bone36 = new ModelRenderer(this);
		bone36.setRotationPoint(6.5F, 37.0F, -9.75F);
		ironsC1.addChild(bone36);
		bone36.cubeList.add(new ModelBox(bone36, 138, 560, -1.2929F, -46.6589F, 7.6339F, 1, 1, 1, 0.0F, false));
		bone36.cubeList.add(new ModelBox(bone36, 174, 560, -2.7071F, -46.6589F, 7.6339F, 1, 1, 1, 0.0F, false));
		bone36.cubeList.add(new ModelBox(bone36, 558, 80, -2.0F, -46.9519F, 7.6339F, 1, 2, 1, 0.0F, false));
		bone36.cubeList.add(new ModelBox(bone36, 58, 466, -2.5F, -46.8518F, 7.9339F, 2, 4, 1, 0.0F, false));
		bone36.cubeList.add(new ModelBox(bone36, 58, 487, -1.0F, -44.6518F, 7.5339F, 1, 2, 2, 0.0F, false));
		bone36.cubeList.add(new ModelBox(bone36, 314, 487, -3.0F, -44.6518F, 7.5339F, 1, 2, 2, 0.0F, false));
		bone36.cubeList.add(new ModelBox(bone36, 320, 412, -1.2F, -48.2518F, 7.5339F, 1, 5, 2, -0.3F, false));
		bone36.cubeList.add(new ModelBox(bone36, 320, 419, -2.8F, -48.2518F, 7.5339F, 1, 5, 2, -0.3F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.0F, -46.6589F, 8.1339F);
		bone36.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 190, 560, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-2.0F, -46.6589F, 8.1339F);
		bone36.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 186, 560, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-2.0F, -45.6589F, 8.1339F);
		bone36.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.7854F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 182, 560, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-1.0F, -45.6589F, 8.1339F);
		bone36.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 178, 560, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ironsC1.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}