package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class LMG68Suppressor extends ModelBase {
	private final ModelRenderer slx_suppressor;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r14;

	public LMG68Suppressor() {
		textureWidth = 416;
		textureHeight = 416;

		slx_suppressor = new ModelRenderer(this);
		slx_suppressor.setRotationPoint(0.0F, 23.7F, 0.0F);
		slx_suppressor.cubeList.add(new ModelBox(slx_suppressor, 378, 369, -2.499F, -43.225F, -91.55F, 2, 2, 4, 0.0F, false));
		slx_suppressor.cubeList.add(new ModelBox(slx_suppressor, 380, 112, -1.0848F, -41.8108F, -91.55F, 2, 2, 4, 0.0F, false));
		slx_suppressor.cubeList.add(new ModelBox(slx_suppressor, 310, 380, -3.9132F, -41.8108F, -91.55F, 2, 2, 4, 0.0F, false));
		slx_suppressor.cubeList.add(new ModelBox(slx_suppressor, 380, 118, -2.499F, -40.3966F, -91.55F, 2, 2, 4, 0.0F, false));
		slx_suppressor.cubeList.add(new ModelBox(slx_suppressor, 332, 37, -2.499F, -43.375F, -106.05F, 2, 1, 15, 0.1F, false));
		slx_suppressor.cubeList.add(new ModelBox(slx_suppressor, 168, 335, 0.0566F, -41.8194F, -106.05F, 1, 2, 15, 0.1F, false));
		slx_suppressor.cubeList.add(new ModelBox(slx_suppressor, 0, 332, -2.499F, -39.2637F, -106.05F, 2, 1, 15, 0.1F, false));
		slx_suppressor.cubeList.add(new ModelBox(slx_suppressor, 398, 74, -1.999F, -40.2637F, -106.05F, 1, 1, 1, 0.1F, false));
		slx_suppressor.cubeList.add(new ModelBox(slx_suppressor, 332, 104, -4.0546F, -41.8194F, -106.05F, 1, 2, 15, 0.1F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-3.3061F, -39.0123F, -92.05F);
		slx_suppressor.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 330, 144, -1.0F, -1.0F, -14.0F, 2, 1, 15, 0.1F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-3.3061F, -41.2123F, -92.05F);
		slx_suppressor.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 392, 248, 0.0F, -1.25F, -14.0F, 1, 1, 2, 0.1F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 334, 0, -1.0F, -2.0F, -14.0F, 1, 2, 15, 0.1F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.1061F, -39.0123F, -92.05F);
		slx_suppressor.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 74, 338, 0.0F, -2.0F, -14.0F, 1, 2, 15, 0.1F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-1.1061F, -41.2123F, -92.05F);
		slx_suppressor.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 398, 72, -0.25F, -1.0F, -14.0F, 1, 1, 1, 0.1F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 332, 21, -1.0F, -2.0F, -14.0F, 2, 1, 15, 0.1F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-3.2061F, -41.1037F, -88.55F);
		slx_suppressor.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 0.7854F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 380, 124, -1.0F, -2.0F, -3.0F, 2, 2, 4, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-3.2061F, -39.1037F, -88.55F);
		slx_suppressor.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 0.7854F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 380, 203, -1.0F, -2.0F, -3.0F, 2, 2, 4, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-1.2061F, -39.1037F, -88.55F);
		slx_suppressor.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 0.7854F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 380, 106, -1.0F, -2.0F, -3.0F, 2, 2, 4, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-1.2061F, -41.1037F, -88.55F);
		slx_suppressor.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, 0.7854F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 120, 379, -1.0F, -2.0F, -3.0F, 2, 2, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		slx_suppressor.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}