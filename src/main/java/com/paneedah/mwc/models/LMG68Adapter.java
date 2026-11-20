package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class LMG68Adapter extends ModelBase {
	private final ModelRenderer adapter;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer railbase_r1;
	private final ModelRenderer gun_r1;
	private final ModelRenderer gun_r2;
	private final ModelRenderer gun_r3;
	private final ModelRenderer gun_r4;

	public LMG68Adapter() {
		textureWidth = 416;
		textureHeight = 416;

		adapter = new ModelRenderer(this);
		adapter.setRotationPoint(-2.091F, -20.1503F, 24.0F);
		adapter.cubeList.add(new ModelBox(adapter, 92, 284, -0.909F, -0.0747F, -21.0F, 3, 1, 20, 0.0F, false));
		adapter.cubeList.add(new ModelBox(adapter, 138, 284, -0.909F, 1.3253F, -20.8F, 3, 1, 20, -0.2F, false));
		adapter.cubeList.add(new ModelBox(adapter, 184, 284, -0.909F, 2.5253F, -20.8F, 3, 1, 20, -0.2F, false));
		adapter.cubeList.add(new ModelBox(adapter, 286, 106, -0.909F, 4.0253F, -20.8F, 3, 1, 20, -0.2F, false));
		adapter.cubeList.add(new ModelBox(adapter, 28, 377, -0.909F, 0.9253F, -21.5F, 3, 4, 3, 0.0F, false));
		adapter.cubeList.add(new ModelBox(adapter, 218, 305, 0.2476F, -0.612F, -21.0F, 1, 1, 20, 0.0F, false));
		adapter.cubeList.add(new ModelBox(adapter, 42, 306, -0.0656F, -0.6119F, -21.0F, 1, 1, 20, 0.0F, false));
		adapter.cubeList.add(new ModelBox(adapter, 288, 76, -0.0656F, 0.4626F, -21.0F, 1, 4, 20, 0.0F, false));
		adapter.cubeList.add(new ModelBox(adapter, 0, 288, 0.2476F, 0.4626F, -21.0F, 1, 4, 20, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.591F, 3.1198F, -18.739F);
		adapter.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.3927F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 392, 105, 0.75F, -1.0F, -1.0F, 1, 2, 2, 0.05F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 392, 109, -1.75F, -1.0F, -1.0F, 1, 2, 2, 0.05F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-1.134F, 13.7003F, -18.1F);
		adapter.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.1309F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 316, 394, 0.0F, -9.5F, -3.5F, 2, 1, 1, 0.05F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 322, 394, 1.5F, -9.5F, -3.5F, 2, 1, 1, 0.05F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.134F, 11.2003F, -18.1F);
		adapter.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.1309F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 394, 157, 0.0F, -9.5F, -3.5F, 2, 1, 1, 0.05F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 394, 285, 1.5F, -9.5F, -3.5F, 2, 1, 1, 0.05F, false));

		railbase_r1 = new ModelRenderer(this);
		railbase_r1.setRotationPoint(0.592F, -1.1726F, -21.1846F);
		adapter.addChild(railbase_r1);
		setRotationAngle(railbase_r1, -0.9163F, 0.0F, 0.0F);
		railbase_r1.cubeList.add(new ModelBox(railbase_r1, 10, 384, -1.0F, -1.0F, -1.0F, 2, 2, 3, -0.001F, false));

		gun_r1 = new ModelRenderer(this);
		gun_r1.setRotationPoint(-0.475F, 1.1961F, -0.75F);
		adapter.addChild(gun_r1);
		setRotationAngle(gun_r1, 0.0F, 0.0F, 0.5672F);
		gun_r1.cubeList.add(new ModelBox(gun_r1, 306, 171, -0.5115F, -0.9952F, -20.25F, 1, 1, 20, 0.0F, false));

		gun_r2 = new ModelRenderer(this);
		gun_r2.setRotationPoint(1.6693F, 1.1939F, -11.0F);
		adapter.addChild(gun_r2);
		setRotationAngle(gun_r2, 0.0F, 0.0F, -0.5672F);
		gun_r2.cubeList.add(new ModelBox(gun_r2, 306, 232, -0.5F, -1.0F, -10.0F, 1, 1, 20, 0.0F, false));

		gun_r3 = new ModelRenderer(this);
		gun_r3.setRotationPoint(1.1443F, 0.5022F, -0.75F);
		adapter.addChild(gun_r3);
		setRotationAngle(gun_r3, 0.0F, 0.0F, 0.5672F);
		gun_r3.cubeList.add(new ModelBox(gun_r3, 176, 305, -0.5115F, -0.9952F, -20.25F, 1, 1, 20, 0.0F, false));

		gun_r4 = new ModelRenderer(this);
		gun_r4.setRotationPoint(0.05F, 0.5F, -11.0F);
		adapter.addChild(gun_r4);
		setRotationAngle(gun_r4, 0.0F, 0.0F, -0.5672F);
		gun_r4.cubeList.add(new ModelBox(gun_r4, 134, 305, -0.5F, -1.0F, -10.0F, 1, 1, 20, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		adapter.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}