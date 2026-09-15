package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Type20Cover extends ModelBase {
	private final ModelRenderer covers;
	private final ModelRenderer cube_r75;
	private final ModelRenderer cube_r77;
	private final ModelRenderer cube_r76;
	private final ModelRenderer cube_r74;
	private final ModelRenderer cube_r72;
	private final ModelRenderer cube_r73;

	public Type20Cover() {
		textureWidth = 210;
		textureHeight = 210;

		covers = new ModelRenderer(this);
		covers.setRotationPoint(0.0F, 24.0F, 0.0F);
		covers.cubeList.add(new ModelBox(covers, 17, 84, 1.05F, -38.0F, -46.2F, 1, 2, 5, -0.099F, false));
		covers.cubeList.add(new ModelBox(covers, 51, 83, 1.05F, -38.0F, -41.2F, 1, 2, 5, -0.099F, false));
		covers.cubeList.add(new ModelBox(covers, 78, 55, -5.05F, -38.0F, -46.2F, 1, 2, 5, -0.099F, false));
		covers.cubeList.add(new ModelBox(covers, 78, 39, -5.05F, -38.0F, -41.2F, 1, 2, 5, -0.099F, false));
		covers.cubeList.add(new ModelBox(covers, 39, 65, -2.5F, -33.4F, -45.3F, 2, 1, 5, -0.1F, false));
		covers.cubeList.add(new ModelBox(covers, 57, 65, -2.5F, -33.4F, -50.3F, 2, 1, 5, -0.1F, false));

		cube_r75 = new ModelRenderer(this);
		cube_r75.setRotationPoint(-4.95F, -37.9F, -45.0F);
		covers.addChild(cube_r75);
		setRotationAngle(cube_r75, 0.0F, 0.0F, 0.8552F);
		cube_r75.cubeList.add(new ModelBox(cube_r75, 70, 92, -0.1F, -0.9F, -1.2F, 1, 1, 5, -0.1F, false));
		cube_r75.cubeList.add(new ModelBox(cube_r75, 50, 92, -0.1F, -0.9F, 3.8F, 1, 1, 5, -0.1F, false));

		cube_r77 = new ModelRenderer(this);
		cube_r77.setRotationPoint(1.95F, -37.9F, -45.0F);
		covers.addChild(cube_r77);
		setRotationAngle(cube_r77, 0.0F, 0.0F, -0.8552F);
		cube_r77.cubeList.add(new ModelBox(cube_r77, 93, 55, -0.9F, -0.9F, -1.2F, 1, 1, 5, -0.1F, false));
		cube_r77.cubeList.add(new ModelBox(cube_r77, 93, 61, -0.9F, -0.9F, 3.8F, 1, 1, 5, -0.1F, false));

		cube_r76 = new ModelRenderer(this);
		cube_r76.setRotationPoint(1.95F, -36.1F, -40.0F);
		covers.addChild(cube_r76);
		setRotationAngle(cube_r76, 0.0F, 0.0F, 0.8552F);
		cube_r76.cubeList.add(new ModelBox(cube_r76, 93, 39, -0.9F, -0.1F, -1.2F, 1, 1, 5, -0.1F, false));
		cube_r76.cubeList.add(new ModelBox(cube_r76, 93, 45, -0.9F, -0.1F, -6.2F, 1, 1, 5, -0.1F, false));

		cube_r74 = new ModelRenderer(this);
		cube_r74.setRotationPoint(-4.95F, -36.1F, -40.0F);
		covers.addChild(cube_r74);
		setRotationAngle(cube_r74, 0.0F, 0.0F, -0.8552F);
		cube_r74.cubeList.add(new ModelBox(cube_r74, 93, 14, -0.1F, -0.1F, -1.2F, 1, 1, 5, -0.1F, false));
		cube_r74.cubeList.add(new ModelBox(cube_r74, 85, 92, -0.1F, -0.1F, -6.2F, 1, 1, 5, -0.1F, false));

		cube_r72 = new ModelRenderer(this);
		cube_r72.setRotationPoint(-2.4F, -32.5F, -45.2F);
		covers.addChild(cube_r72);
		setRotationAngle(cube_r72, 0.0F, 0.0F, 0.8552F);
		cube_r72.cubeList.add(new ModelBox(cube_r72, 35, 92, -0.9F, -0.9F, -0.1F, 1, 1, 5, -0.1F, false));
		cube_r72.cubeList.add(new ModelBox(cube_r72, 15, 92, -0.9F, -0.9F, -5.1F, 1, 1, 5, -0.1F, false));

		cube_r73 = new ModelRenderer(this);
		cube_r73.setRotationPoint(-0.6F, -32.5F, -50.2F);
		covers.addChild(cube_r73);
		setRotationAngle(cube_r73, 0.0F, 0.0F, -0.8552F);
		cube_r73.cubeList.add(new ModelBox(cube_r73, 87, 70, -0.1F, -0.9F, -0.1F, 1, 1, 5, -0.1F, false));
		cube_r73.cubeList.add(new ModelBox(cube_r73, 86, 85, -0.1F, -0.9F, 4.9F, 1, 1, 5, -0.1F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		covers.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}