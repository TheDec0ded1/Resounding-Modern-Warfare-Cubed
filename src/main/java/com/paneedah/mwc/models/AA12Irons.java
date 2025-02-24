package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AA12Irons extends ModelBase {
	private final ModelRenderer ironsights;
	private final ModelRenderer sights;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;

	public AA12Irons() {
		textureWidth = 512;
		textureHeight = 512;

		ironsights = new ModelRenderer(this);
		ironsights.setRotationPoint(0.0F, -24.6F, -42.8F);
		ironsights.cubeList.add(new ModelBox(ironsights, 113, 37, -2.5F, -1.96F, 41.22F, 2, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 57, 124, -1.7F, -2.16F, 41.22F, 1, 1, 1, -0.401F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 45, 124, -1.7F, -2.36F, 41.22F, 1, 1, 1, -0.402F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 40, 124, -2.3F, -2.36F, 41.22F, 1, 1, 1, -0.402F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 35, 124, -2.3F, -2.16F, 41.22F, 1, 1, 1, -0.401F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 15, 124, -2.3F, -2.56F, 41.22F, 1, 1, 1, -0.401F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 20, 124, -2.1F, -2.56F, 41.22F, 1, 1, 1, -0.402F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 25, 124, -1.7F, -2.56F, 41.22F, 1, 1, 1, -0.401F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 10, 124, -1.9F, -2.56F, 41.22F, 1, 1, 1, -0.402F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 51, 71, -2.0F, -2.2F, -13.2F, 1, 2, 1, -0.4F, false));

		sights = new ModelRenderer(this);
		sights.setRotationPoint(0.0F, 48.6F, 42.8F);
		ironsights.addChild(sights);
		sights.cubeList.add(new ModelBox(sights, 20, 90, -2.5F, -50.0F, -56.5F, 2, 5, 1, 0.0F, false));
		sights.cubeList.add(new ModelBox(sights, 113, 34, -2.5F, -50.0F, -55.5F, 2, 1, 1, 0.0F, false));
		sights.cubeList.add(new ModelBox(sights, 80, 11, -2.5F, -48.2F, -55.8F, 2, 3, 1, -0.1F, false));
		sights.cubeList.add(new ModelBox(sights, 66, 0, -2.9F, -52.5812F, -2.4872F, 1, 3, 3, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 66, 36, -1.1F, -52.5812F, -2.4872F, 1, 3, 3, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 25, 18, -1.1F, -52.5812F, -2.7872F, 1, 3, 2, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 26, 36, -2.9F, -52.5812F, -2.7872F, 1, 3, 2, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 90, 0, -2.5F, -50.0F, -2.4F, 2, 5, 1, 0.0F, false));
		sights.cubeList.add(new ModelBox(sights, 113, 16, -2.5F, -50.0F, -1.4F, 2, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.1F, -49.6556F, 0.8488F);
		sights.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 80, 93, -1.0F, -3.0F, -2.0F, 1, 3, 2, -0.4F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 25, 95, -2.8F, -3.0F, -2.0F, 1, 3, 2, -0.4F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.5F, -45.0428F, 1.0526F);
		sights.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.1309F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 90, -1.0F, -5.0F, -1.0F, 2, 5, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1.5F, -45.0428F, -53.8474F);
		sights.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.1309F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 90, 12, -1.0F, -5.0F, -1.0F, 2, 5, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ironsights.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}