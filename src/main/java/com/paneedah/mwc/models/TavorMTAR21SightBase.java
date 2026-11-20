package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class TavorMTAR21SightBase extends ModelBase {
	private final ModelRenderer sightbase;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;

	public TavorMTAR21SightBase() {
		textureWidth = 320;
		textureHeight = 320;

		sightbase = new ModelRenderer(this);
		sightbase.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-3.0F, -41.0389F, 8.4642F);
		sightbase.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.124F, 0.1231F, -0.7777F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 264, 302, 1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.4142F, -41.0389F, 8.4642F);
		sightbase.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.124F, 0.1231F, -0.7777F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 302, 262, 1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-0.2929F, -37.2191F, 9.1377F);
		sightbase.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.1745F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 248, 302, -2.0F, -6.0F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 244, 302, -1.4142F, -6.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-2.0F, -38.0F, 9.0F);
		sightbase.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.1745F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 296, 218, -1.0F, -4.5F, 0.0F, 3, 4, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		sightbase.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}