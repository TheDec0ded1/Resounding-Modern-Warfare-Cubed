package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class BundT_MP9SideRail extends ModelBase {
	private final ModelRenderer siderail;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;

	public BundT_MP9SideRail() {
		textureWidth = 240;
		textureHeight = 240;

		siderail = new ModelRenderer(this);
		siderail.setRotationPoint(-4.5217F, -11.7739F, -15.1435F);
		setRotationAngle(siderail, 0.0F, 0.0F, -1.5708F);
		siderail.cubeList.add(new ModelBox(siderail, 230, 41, -0.9783F, -0.5261F, -6.7565F, 2, 1, 1, -0.199F, false));
		siderail.cubeList.add(new ModelBox(siderail, 230, 43, -0.9783F, -0.5261F, -2.9065F, 2, 1, 1, -0.199F, false));
		siderail.cubeList.add(new ModelBox(siderail, 44, 230, -0.9783F, -0.5261F, -1.6565F, 2, 1, 1, -0.199F, false));
		siderail.cubeList.add(new ModelBox(siderail, 230, 45, -0.9783F, -0.5261F, -0.4065F, 2, 1, 1, -0.199F, false));
		siderail.cubeList.add(new ModelBox(siderail, 230, 47, -0.9783F, -0.5261F, 0.8435F, 2, 1, 1, -0.199F, false));
		siderail.cubeList.add(new ModelBox(siderail, 230, 49, -0.9783F, -0.5261F, -6.6565F, 2, 1, 1, -0.199F, false));
		siderail.cubeList.add(new ModelBox(siderail, 50, 230, -0.9783F, -0.5261F, -5.4065F, 2, 1, 1, -0.199F, false));
		siderail.cubeList.add(new ModelBox(siderail, 230, 54, -0.9783F, -0.5261F, -4.1565F, 2, 1, 1, -0.199F, false));
		siderail.cubeList.add(new ModelBox(siderail, 56, 230, -0.9783F, -0.5261F, 2.0935F, 2, 1, 1, -0.199F, false));
		siderail.cubeList.add(new ModelBox(siderail, 230, 56, -0.9783F, -0.5261F, 3.3435F, 2, 1, 1, -0.199F, false));
		siderail.cubeList.add(new ModelBox(siderail, 230, 58, -0.9783F, -0.5261F, 4.5935F, 2, 1, 1, -0.199F, false));
		siderail.cubeList.add(new ModelBox(siderail, 166, 28, -1.0783F, 0.0739F, -6.5565F, 1, 1, 12, 0.0F, false));
		siderail.cubeList.add(new ModelBox(siderail, 82, 158, -0.8783F, 0.0739F, -6.5565F, 2, 1, 12, -0.001F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.7783F, -0.3261F, -40.5565F);
		siderail.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.8901F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 166, 41, -0.25F, -0.05F, 33.8F, 1, 1, 12, -0.35F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 198, 233, -0.2F, -0.2F, 45.15F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 214, 233, -0.2F, -0.2F, 43.9F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 218, 233, -0.2F, -0.2F, 42.65F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 222, 233, -0.2F, -0.2F, 41.4F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 226, 233, -0.2F, -0.2F, 40.15F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 230, 233, -0.2F, -0.2F, 38.9F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 234, -0.2F, -0.2F, 37.65F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 234, 0, -0.2F, -0.2F, 33.9F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 234, 2, -0.2F, -0.2F, 35.15F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 4, 234, -0.2F, -0.2F, 36.4F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 234, 4, -0.2F, -0.2F, 33.8F, 1, 1, 1, -0.198F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.8217F, -0.3261F, -40.5565F);
		siderail.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.8901F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 168, 86, -0.75F, -0.05F, 33.8F, 1, 1, 12, -0.35F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 234, 6, -0.8F, -0.2F, 45.15F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 44, 234, -0.8F, -0.2F, 43.9F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 48, 234, -0.8F, -0.2F, 42.65F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 52, 234, -0.8F, -0.2F, 41.4F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 56, 234, -0.8F, -0.2F, 40.15F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 60, 234, -0.8F, -0.2F, 38.9F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 234, 62, -0.8F, -0.2F, 37.65F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 64, 234, -0.8F, -0.2F, 36.4F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 234, 64, -0.8F, -0.2F, 35.15F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 234, 66, -0.8F, -0.2F, 33.9F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 68, 234, -0.8F, -0.2F, 33.8F, 1, 1, 1, -0.198F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		siderail.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}