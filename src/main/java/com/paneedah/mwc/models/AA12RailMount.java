package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AA12RailMount extends ModelBase {
	private final ModelRenderer railMount;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer railBlack;
	private final ModelRenderer cube_r60;
	private final ModelRenderer cube_r61;

	public AA12RailMount() {
		textureWidth = 512;
		textureHeight = 512;

		railMount = new ModelRenderer(this);
		railMount.setRotationPoint(0.0F, 24.0F, 0.0F);
		railMount.cubeList.add(new ModelBox(railMount, 101, 92, -1.0F, -48.85F, -1.75F, 1, 1, 9, 0.0F, false));
		railMount.cubeList.add(new ModelBox(railMount, 101, 34, -3.0F, -48.85F, -1.75F, 1, 1, 9, 0.0F, false));
		railMount.cubeList.add(new ModelBox(railMount, 54, 36, -3.0F, -47.85F, 5.25F, 1, 3, 1, 0.0F, false));
		railMount.cubeList.add(new ModelBox(railMount, 57, 10, -1.0F, -47.85F, 5.25F, 1, 3, 1, 0.0F, false));
		railMount.cubeList.add(new ModelBox(railMount, 40, 36, -3.0F, -47.85F, 0.25F, 1, 3, 1, 0.0F, false));
		railMount.cubeList.add(new ModelBox(railMount, 43, 10, -1.0F, -47.85F, 0.25F, 1, 3, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.5F, -45.75F, -1.75F);
		railMount.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.7854F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 113, 48, -1.5F, -0.5F, 2.5F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 113, 45, 0.5F, -0.5F, 2.5F, 1, 1, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.5F, -50.05F, 8.35F);
		railMount.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.7854F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 113, 40, 0.5F, -0.5F, -3.5F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 104, 112, -1.5F, -0.5F, -3.5F, 1, 1, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1.5F, -45.75F, 3.25F);
		railMount.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.7854F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 113, 95, -1.5F, -0.5F, 2.5F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 113, 92, 0.5F, -0.5F, 2.5F, 1, 1, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.5F, -50.05F, 3.35F);
		railMount.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.7854F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 113, 56, 0.5F, -0.5F, -3.5F, 1, 1, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 113, 53, -1.5F, -0.5F, -3.5F, 1, 1, 1, 0.0F, false));

		railBlack = new ModelRenderer(this);
		railBlack.setRotationPoint(-1.5847F, -49.6769F, 5.1423F);
		railMount.addChild(railBlack);
		setRotationAngle(railBlack, 0.0F, 0.0F, 0.0F);
		railBlack.cubeList.add(new ModelBox(railBlack, 113, 7, -0.9231F, -0.2846F, -5.8423F, 2, 1, 1, -0.199F, false));
		railBlack.cubeList.add(new ModelBox(railBlack, 113, 3, -0.9231F, -0.2846F, -4.5923F, 2, 1, 1, -0.199F, false));
		railBlack.cubeList.add(new ModelBox(railBlack, 112, 29, -0.9231F, -0.2846F, -3.3423F, 2, 1, 1, -0.199F, false));
		railBlack.cubeList.add(new ModelBox(railBlack, 112, 23, -0.9231F, -0.2846F, -2.0923F, 2, 1, 1, -0.199F, false));
		railBlack.cubeList.add(new ModelBox(railBlack, 79, 111, -0.9231F, -0.2846F, -0.8423F, 2, 1, 1, -0.199F, false));
		railBlack.cubeList.add(new ModelBox(railBlack, 108, 63, -0.9231F, -0.2846F, 0.4077F, 2, 1, 1, -0.199F, false));
		railBlack.cubeList.add(new ModelBox(railBlack, 105, 29, -0.9231F, -0.2846F, 1.6577F, 2, 1, 1, -0.199F, false));
		railBlack.cubeList.add(new ModelBox(railBlack, 39, 111, -0.8231F, 0.3154F, -7.1423F, 2, 1, 9, -0.001F, false));
		railBlack.cubeList.add(new ModelBox(railBlack, 69, 66, -0.8231F, 0.3154F, 1.4577F, 2, 1, 1, -0.002F, false));
		railBlack.cubeList.add(new ModelBox(railBlack, 66, 0, -1.0231F, 0.3154F, -7.1423F, 1, 1, 9, 0.0F, false));
		railBlack.cubeList.add(new ModelBox(railBlack, 101, 103, -1.0231F, 0.3154F, 1.4577F, 1, 1, 1, -0.003F, false));
		railBlack.cubeList.add(new ModelBox(railBlack, 101, 63, -0.9231F, -0.2846F, -7.1423F, 2, 1, 1, -0.199F, false));
		railBlack.cubeList.add(new ModelBox(railBlack, 90, 7, -0.9231F, -0.2846F, -7.3423F, 2, 1, 1, -0.199F, false));

		cube_r60 = new ModelRenderer(this);
		cube_r60.setRotationPoint(-14.7231F, -0.4846F, -7.1423F);
		railBlack.addChild(cube_r60);
		setRotationAngle(cube_r60, 0.0F, 0.0F, 0.8901F);
		cube_r60.cubeList.add(new ModelBox(cube_r60, 90, 119, 8.9214F, -10.8283F, 0.0F, 1, 1, 1, -0.198F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 118, 82, 8.9214F, -10.8283F, -0.2F, 1, 1, 1, -0.198F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 118, 68, 8.8714F, -10.6783F, 0.4F, 1, 1, 9, -0.35F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 118, 79, 8.9214F, -10.8283F, 8.8F, 1, 1, 1, -0.198F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 118, 74, 8.9214F, -10.8283F, 7.55F, 1, 1, 1, -0.198F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 118, 71, 8.9214F, -10.8283F, 6.3F, 1, 1, 1, -0.198F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 118, 68, 8.9214F, -10.8283F, 5.05F, 1, 1, 1, -0.198F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 20, 118, 8.9214F, -10.8283F, 3.8F, 1, 1, 1, -0.198F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 114, 117, 8.9214F, -10.8283F, 2.55F, 1, 1, 1, -0.198F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 57, 117, 8.9214F, -10.8283F, 1.3F, 1, 1, 1, -0.198F, false));

		cube_r61 = new ModelRenderer(this);
		cube_r61.setRotationPoint(-13.1231F, -0.4846F, -7.1423F);
		railBlack.addChild(cube_r61);
		setRotationAngle(cube_r61, 0.0F, 0.0F, -0.8901F);
		cube_r61.cubeList.add(new ModelBox(cube_r61, 43, 117, 7.6996F, 10.9317F, 0.0F, 1, 1, 1, -0.198F, false));
		cube_r61.cubeList.add(new ModelBox(cube_r61, 27, 117, 7.6996F, 10.9317F, -0.2F, 1, 1, 1, -0.198F, false));
		cube_r61.cubeList.add(new ModelBox(cube_r61, 62, 121, 7.7496F, 11.0817F, 0.4F, 1, 1, 9, -0.35F, false));
		cube_r61.cubeList.add(new ModelBox(cube_r61, 15, 117, 7.6996F, 10.9317F, 8.8F, 1, 1, 1, -0.198F, false));
		cube_r61.cubeList.add(new ModelBox(cube_r61, 10, 117, 7.6996F, 10.9317F, 7.55F, 1, 1, 1, -0.198F, false));
		cube_r61.cubeList.add(new ModelBox(cube_r61, 5, 117, 7.6996F, 10.9317F, 6.3F, 1, 1, 1, -0.198F, false));
		cube_r61.cubeList.add(new ModelBox(cube_r61, 0, 117, 7.6996F, 10.9317F, 5.05F, 1, 1, 1, -0.198F, false));
		cube_r61.cubeList.add(new ModelBox(cube_r61, 116, 111, 7.6996F, 10.9317F, 3.8F, 1, 1, 1, -0.198F, false));
		cube_r61.cubeList.add(new ModelBox(cube_r61, 116, 26, 7.6996F, 10.9317F, 2.55F, 1, 1, 1, -0.198F, false));
		cube_r61.cubeList.add(new ModelBox(cube_r61, 53, 115, 7.6996F, 10.9317F, 1.3F, 1, 1, 1, -0.198F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		railMount.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}