package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class BundT_MP9Mag15 extends ModelBase {
	private final ModelRenderer b15rdmag;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;

	public BundT_MP9Mag15() {
		textureWidth = 240;
		textureHeight = 240;

		b15rdmag = new ModelRenderer(this);
		b15rdmag.setRotationPoint(-1.498F, 3.6F, -3.0F);
		b15rdmag.cubeList.add(new ModelBox(b15rdmag, 222, 52, -2.0F, 1.4F, 1.75F, 4, 1, 1, 0.0F, false));
		b15rdmag.cubeList.add(new ModelBox(b15rdmag, 82, 171, -1.5F, -12.8929F, 0.2429F, 3, 16, 4, 0.0F, false));
		b15rdmag.cubeList.add(new ModelBox(b15rdmag, 58, 184, -2.0F, -12.8929F, 0.2429F, 4, 16, 1, -0.1F, false));
		b15rdmag.cubeList.add(new ModelBox(b15rdmag, 206, 64, -2.0F, -12.8929F, 1.0429F, 4, 2, 3, -0.1F, false));
		b15rdmag.cubeList.add(new ModelBox(b15rdmag, 214, 161, -2.0F, -8.8929F, 1.0429F, 4, 1, 2, -0.1F, false));
		b15rdmag.cubeList.add(new ModelBox(b15rdmag, 214, 181, -2.0F, -2.8929F, 1.0429F, 4, 1, 2, -0.1F, false));
		b15rdmag.cubeList.add(new ModelBox(b15rdmag, 216, 127, -2.0F, 0.1071F, 1.0429F, 4, 1, 2, -0.1F, false));
		b15rdmag.cubeList.add(new ModelBox(b15rdmag, 216, 206, -2.0F, -5.8929F, 1.0429F, 4, 1, 2, -0.1F, false));
		b15rdmag.cubeList.add(new ModelBox(b15rdmag, 28, 183, -2.0F, -11.8929F, 2.0429F, 4, 15, 2, -0.1F, false));
		b15rdmag.cubeList.add(new ModelBox(b15rdmag, 218, 18, -2.0F, 2.1071F, 1.0429F, 4, 1, 2, 0.0F, false));
		b15rdmag.cubeList.add(new ModelBox(b15rdmag, 24, 224, -2.0F, 2.1071F, 2.4571F, 4, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 2.4607F, 1.3964F);
		b15rdmag.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.7854F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 224, 172, -2.0F, -1.0F, -0.5F, 4, 1, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 2.4607F, 2.3964F);
		b15rdmag.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.7854F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 224, 170, -2.0F, -1.0F, -0.5F, 4, 1, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.5464F, -11.7322F, 1.9429F);
		b15rdmag.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 16, 224, 0.5F, -1.0F, -1.0F, 1, 1, 3, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.8393F, -11.7322F, 1.9429F);
		b15rdmag.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 8, 224, 0.5F, -1.0F, -1.0F, 1, 1, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		b15rdmag.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}