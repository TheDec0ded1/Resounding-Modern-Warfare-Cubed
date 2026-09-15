package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class TavorMTAR21LowerRail extends ModelBase {
	private final ModelRenderer railLower;
	private final ModelRenderer cube_r62;
	private final ModelRenderer cube_r63;

	public TavorMTAR21LowerRail() {
		textureWidth = 320;
		textureHeight = 320;

		railLower = new ModelRenderer(this);
		railLower.setRotationPoint(11.7F, -6.0F, -32.75F);
		setRotationAngle(railLower, 0.0F, 0.0F, -3.1416F);
		railLower.cubeList.add(new ModelBox(railLower, 226, 300, 12.2F, -0.2F, 7.05F, 2, 1, 1, -0.199F, false));
		railLower.cubeList.add(new ModelBox(railLower, 242, 300, 12.2F, -0.2F, 8.3F, 2, 1, 1, -0.199F, false));
		railLower.cubeList.add(new ModelBox(railLower, 300, 278, 12.2F, -0.2F, 9.55F, 2, 1, 1, -0.199F, false));
		railLower.cubeList.add(new ModelBox(railLower, 300, 280, 12.2F, -0.2F, 12.05F, 2, 1, 1, -0.199F, false));
		railLower.cubeList.add(new ModelBox(railLower, 300, 282, 12.2F, -0.2F, 10.8F, 2, 1, 1, -0.199F, false));
		railLower.cubeList.add(new ModelBox(railLower, 284, 300, 12.2F, -0.2F, 14.55F, 2, 1, 1, -0.199F, false));
		railLower.cubeList.add(new ModelBox(railLower, 300, 284, 12.2F, -0.2F, 13.3F, 2, 1, 1, -0.199F, false));
		railLower.cubeList.add(new ModelBox(railLower, 300, 286, 12.2F, -0.2F, 17.05F, 2, 1, 1, -0.199F, false));
		railLower.cubeList.add(new ModelBox(railLower, 300, 288, 12.2F, -0.2F, 15.8F, 2, 1, 1, -0.199F, false));
		railLower.cubeList.add(new ModelBox(railLower, 290, 300, 12.2F, -0.2F, 19.55F, 2, 1, 1, -0.199F, false));
		railLower.cubeList.add(new ModelBox(railLower, 296, 300, 12.2F, -0.2F, 19.95F, 2, 1, 1, -0.198F, false));
		railLower.cubeList.add(new ModelBox(railLower, 300, 298, 12.2F, -0.2F, 18.3F, 2, 1, 1, -0.199F, false));
		railLower.cubeList.add(new ModelBox(railLower, 44, 251, 12.3F, 0.4F, 5.75F, 2, 1, 15, -0.001F, false));
		railLower.cubeList.add(new ModelBox(railLower, 260, 263, 12.1F, 0.4F, 5.75F, 1, 1, 15, 0.0F, false));

		cube_r62 = new ModelRenderer(this);
		cube_r62.setRotationPoint(-1.6F, 0.0F, -1.25F);
		railLower.addChild(cube_r62);
		setRotationAngle(cube_r62, 0.0F, 0.0F, 0.8901F);
		cube_r62.cubeList.add(new ModelBox(cube_r62, 264, 235, 8.5605F, -10.93F, 7.4F, 1, 1, 14, -0.35F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 304, 50, 8.6105F, -11.08F, 19.55F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 304, 52, 8.6105F, -11.08F, 21.2F, 1, 1, 1, -0.197F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 304, 54, 8.6105F, -11.08F, 20.8F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 304, 56, 8.6105F, -11.08F, 17.05F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 88, 304, 8.6105F, -11.08F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 92, 304, 8.6105F, -11.08F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 96, 304, 8.6105F, -11.08F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 116, 304, 8.6105F, -11.08F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 120, 304, 8.6105F, -11.08F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 124, 304, 8.6105F, -11.08F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 128, 304, 8.6105F, -11.08F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 132, 304, 8.6105F, -11.08F, 8.3F, 1, 1, 1, -0.198F, false));

		cube_r63 = new ModelRenderer(this);
		cube_r63.setRotationPoint(0.0F, 0.0F, -1.25F);
		railLower.addChild(cube_r63);
		setRotationAngle(cube_r63, 0.0F, 0.0F, -0.8901F);
		cube_r63.cubeList.add(new ModelBox(cube_r63, 154, 266, 8.0605F, 10.83F, 7.4F, 1, 1, 14, -0.35F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 136, 304, 8.0105F, 10.68F, 19.55F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 140, 304, 8.0105F, 10.68F, 21.2F, 1, 1, 1, -0.197F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 144, 304, 8.0105F, 10.68F, 20.8F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 148, 304, 8.0105F, 10.68F, 17.05F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 152, 304, 8.0105F, 10.68F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 156, 304, 8.0105F, 10.68F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 304, 159, 8.0105F, 10.68F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 160, 304, 8.0105F, 10.68F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 304, 161, 8.0105F, 10.68F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 164, 304, 8.0105F, 10.68F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 168, 304, 8.0105F, 10.68F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 190, 304, 8.0105F, 10.68F, 8.3F, 1, 1, 1, -0.198F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		railLower.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}