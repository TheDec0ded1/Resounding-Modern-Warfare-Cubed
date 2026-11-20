package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AK308Magazine extends ModelBase {
	private final ModelRenderer ak308Magazine;
	private final ModelRenderer cube_r110_r2;
	private final ModelRenderer cube_r440_r4_r1;
	private final ModelRenderer cube_r330_r3_r1;
	private final ModelRenderer cube_r110_r1;
	private final ModelRenderer bone44;
	private final ModelRenderer cube_r70;
	private final ModelRenderer cube_r116_r1;
	private final ModelRenderer cube_r115_r1;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;

	public AK308Magazine() {
		textureWidth = 432;
		textureHeight = 432;

		ak308Magazine = new ModelRenderer(this);
		ak308Magazine.setRotationPoint(0.0F, 24.0F, 0.5F);
		

		cube_r110_r2 = new ModelRenderer(this);
		cube_r110_r2.setRotationPoint(-1.5F, -28.2708F, -25.7696F);
		ak308Magazine.addChild(cube_r110_r2);
		cube_r110_r2.cubeList.add(new ModelBox(cube_r110_r2, 150, 392, -2.0F, -4.6262F, -1.72F, 4, 3, 9, 0.0F, false));
		cube_r110_r2.cubeList.add(new ModelBox(cube_r110_r2, 340, 404, -1.0F, -4.4127F, -4.8691F, 2, 3, 3, 0.2F, false));

		cube_r440_r4_r1 = new ModelRenderer(this);
		cube_r440_r4_r1.setRotationPoint(1.2929F, -4.6262F, 2.78F);
		cube_r110_r2.addChild(cube_r440_r4_r1);
		setRotationAngle(cube_r440_r4_r1, 0.0F, 0.0F, 0.7854F);
		cube_r440_r4_r1.cubeList.add(new ModelBox(cube_r440_r4_r1, 394, 18, -0.5F, -0.5F, -1.5F, 1, 1, 6, 0.0F, false));

		cube_r330_r3_r1 = new ModelRenderer(this);
		cube_r330_r3_r1.setRotationPoint(-1.2929F, -4.6262F, 2.78F);
		cube_r110_r2.addChild(cube_r330_r3_r1);
		setRotationAngle(cube_r330_r3_r1, 0.0F, 0.0F, 0.7854F);
		cube_r330_r3_r1.cubeList.add(new ModelBox(cube_r330_r3_r1, 392, 335, -0.5F, -0.5F, -1.5F, 1, 1, 6, 0.0F, false));

		cube_r110_r1 = new ModelRenderer(this);
		cube_r110_r1.setRotationPoint(-1.5F, -24.9195F, -26.9016F);
		ak308Magazine.addChild(cube_r110_r1);
		setRotationAngle(cube_r110_r1, -0.1919F, 0.0F, 0.0F);
		cube_r110_r1.cubeList.add(new ModelBox(cube_r110_r1, 147, 351, -1.0F, -5.2772F, -4.8411F, 2, 16, 3, 0.2F, false));
		cube_r110_r1.cubeList.add(new ModelBox(cube_r110_r1, 157, 184, -2.0F, -1.8805F, -4.2984F, 4, 2, 3, -0.1F, false));
		cube_r110_r1.cubeList.add(new ModelBox(cube_r110_r1, 110, 290, -2.0F, 2.1195F, -4.2984F, 4, 2, 3, -0.1F, false));
		cube_r110_r1.cubeList.add(new ModelBox(cube_r110_r1, 322, 179, -2.0F, 6.1195F, -4.2984F, 4, 2, 3, -0.1F, false));
		cube_r110_r1.cubeList.add(new ModelBox(cube_r110_r1, 284, 242, -2.0F, -5.0805F, -4.2984F, 4, 15, 3, -0.3F, false));
		cube_r110_r1.cubeList.add(new ModelBox(cube_r110_r1, 402, 163, -2.0F, -5.8805F, -4.2984F, 4, 2, 3, -0.1F, false));
		cube_r110_r1.cubeList.add(new ModelBox(cube_r110_r1, 375, 142, -2.0F, -6.4908F, -1.692F, 4, 17, 9, 0.0F, false));

		bone44 = new ModelRenderer(this);
		bone44.setRotationPoint(0.0F, -7.4F, 5.7F);
		ak308Magazine.addChild(bone44);
		setRotationAngle(bone44, 0.3055F, 0.0F, 0.0F);
		

		cube_r70 = new ModelRenderer(this);
		cube_r70.setRotationPoint(-2.7F, -29.2611F, -17.8859F);
		bone44.addChild(cube_r70);
		setRotationAngle(cube_r70, -0.192F, 0.0F, 0.0F);
		

		cube_r116_r1 = new ModelRenderer(this);
		cube_r116_r1.setRotationPoint(1.475F, 12.4651F, -9.6869F);
		cube_r70.addChild(cube_r116_r1);
		setRotationAngle(cube_r116_r1, -0.2182F, 0.0F, 0.0F);
		

		cube_r115_r1 = new ModelRenderer(this);
		cube_r115_r1.setRotationPoint(1.475F, 12.4651F, -9.6869F);
		cube_r70.addChild(cube_r115_r1);
		setRotationAngle(cube_r115_r1, -0.3054F, 0.0F, 0.0F);
		cube_r115_r1.cubeList.add(new ModelBox(cube_r115_r1, 292, 70, -2.075F, 1.3735F, -2.1942F, 3, 1, 9, 0.3F, false));
		cube_r115_r1.cubeList.add(new ModelBox(cube_r115_r1, 14, 412, -1.525F, 1.3735F, -4.7942F, 1, 1, 2, 0.3F, false));
		cube_r115_r1.cubeList.add(new ModelBox(cube_r115_r1, 412, 49, -0.025F, 1.3735F, -4.7942F, 1, 1, 2, 0.299F, false));
		cube_r115_r1.cubeList.add(new ModelBox(cube_r115_r1, 401, 250, 0.525F, 1.3735F, -2.1942F, 1, 1, 9, 0.299F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, -0.5F);
		ak308Magazine.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 392, 180, -4.0F, -20.3F, -29.05F, 5, 1, 9, -0.3F, false));
		bone.cubeList.add(new ModelBox(bone, 392, 191, -4.0F, -23.75F, -28.4F, 5, 1, 9, -0.3F, false));
		bone.cubeList.add(new ModelBox(bone, 206, 392, -4.0F, -27.225F, -27.775F, 5, 1, 9, -0.3F, false));
		bone.cubeList.add(new ModelBox(bone, 263, 70, -4.0F, -30.7F, -27.0F, 5, 1, 9, -0.3F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -28.2F, -22.5F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 177, 392, -4.0F, 11.0F, -5.5F, 5, 1, 9, -0.3F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, -28.2F, -22.65F);
		bone.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.1309F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 392, 169, -4.0F, 7.5F, -5.2F, 5, 1, 9, -0.3F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 269, 29, -4.0F, 0.5F, -4.8F, 5, 1, 9, -0.3F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, -28.2F, -22.675F);
		bone.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.1309F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 326, 106, -4.0F, 4.0F, -5.0F, 5, 1, 9, -0.3F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, -28.2F, -22.5F);
		bone.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.1745F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 285, 392, -4.0F, -1.75F, -5.1F, 5, 14, 1, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 325, 391, -4.0F, -2.0F, -2.9F, 5, 14, 2, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 219, 403, -4.0F, 0.9F, 0.1F, 5, 11, 1, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 302, 347, -4.0F, -2.8F, 2.1F, 5, 15, 2, -0.3F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ak308Magazine.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}