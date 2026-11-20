package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class BundT_MP9Mag20 extends ModelBase {
	private final ModelRenderer b20;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r6;

	public BundT_MP9Mag20() {
		textureWidth = 240;
		textureHeight = 240;

		b20 = new ModelRenderer(this);
		b20.setRotationPoint(-1.498F, 3.6F, -3.0F);
		b20.cubeList.add(new ModelBox(b20, 124, 170, -1.5F, -12.8929F, 0.2429F, 3, 20, 4, 0.0F, false));
		b20.cubeList.add(new ModelBox(b20, 72, 173, -2.0F, -12.8929F, 0.2429F, 4, 20, 1, -0.1F, false));
		b20.cubeList.add(new ModelBox(b20, 206, 69, -2.0F, -12.8929F, 1.0429F, 4, 2, 3, -0.1F, false));
		b20.cubeList.add(new ModelBox(b20, 218, 21, -2.0F, -8.8929F, 1.0429F, 4, 1, 2, -0.1F, false));
		b20.cubeList.add(new ModelBox(b20, 218, 24, -2.0F, -2.8929F, 1.0429F, 4, 1, 2, -0.1F, false));
		b20.cubeList.add(new ModelBox(b20, 218, 27, -2.0F, 0.1071F, 1.0429F, 4, 1, 2, -0.1F, false));
		b20.cubeList.add(new ModelBox(b20, 218, 30, -2.0F, 3.1071F, 1.0429F, 4, 1, 2, -0.1F, false));
		b20.cubeList.add(new ModelBox(b20, 218, 33, -2.0F, 6.1071F, 1.0429F, 4, 1, 2, -0.1F, false));
		b20.cubeList.add(new ModelBox(b20, 218, 36, -2.0F, -5.8929F, 1.0429F, 4, 1, 2, -0.1F, false));
		b20.cubeList.add(new ModelBox(b20, 96, 171, -2.0F, -11.8929F, 2.0429F, 4, 19, 2, -0.1F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.5464F, -11.7322F, 1.9429F);
		b20.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 200, 224, 0.5F, -1.0F, -1.0F, 1, 1, 3, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.8393F, -11.7322F, 1.9429F);
		b20.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 224, 174, 0.5F, -1.0F, -1.0F, 1, 1, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		b20.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}