package com.paneedah.mwc.models;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QCW05Mag extends ModelBase {
	private final ModelRenderer magazine;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer bone5;
	private final ModelRenderer cube_r5;
	private final ModelRenderer bone6;
	private final ModelRenderer cube_r6;

	public QCW05Mag() {
		textureWidth = 320;
		textureHeight = 320;

		magazine = new ModelRenderer(this);
		magazine.setRotationPoint(0.0F, 24.0F, 0.0F);
		magazine.cubeList.add(new ModelBox(magazine, 257, 230, -4.5F, -36.0F, 8.85F, 6, 7, 6, -0.05F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-6.7027F, -36.3036F, 11.85F);
		magazine.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 153, 285, 2.0F, 2.5F, -2.0F, 1, 1, 5, -0.05F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-4.0755F, -36.3036F, 11.85F);
		magazine.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.7854F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 49, 285, 2.0F, 2.5F, -2.0F, 1, 1, 5, -0.05F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.5F, -26.2F, 11.45F);
		magazine.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.1396F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 97, 279, -3.0F, -3.5F, 1.0F, 6, 6, 2, -0.15F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 278, 276, -3.0F, -3.5F, -1.0F, 6, 6, 2, -0.15F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 80, 278, -3.0F, -3.5F, -3.0F, 6, 6, 2, -0.15F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 258, 29, -3.0F, -3.5F, -3.0F, 6, 6, 6, -0.25F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-1.5F, -20.7535F, 10.6845F);
		magazine.addChild(bone5);
		setRotationAngle(bone5, -0.1745F, 0.0F, 0.0F);
		

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, -6.2684F, 0.2849F);
		bone5.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.1396F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 114, 279, -3.0F, 2.5F, 1.0F, 6, 6, 2, -0.15F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 280, 181, -3.0F, 2.5F, -1.0F, 6, 6, 2, -0.15F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 281, 108, -3.0F, 2.5F, -3.0F, 6, 6, 2, -0.15F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 260, 155, -3.0F, 2.5F, -3.0F, 6, 6, 6, -0.25F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-1.5F, -13.8599F, 9.469F);
		magazine.addChild(bone6);
		setRotationAngle(bone6, -0.3054F, 0.0F, 0.0F);
		

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, -7.8384F, -1.1259F);
		bone6.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.1396F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 239, 266, -3.0F, 8.0F, -3.0F, 6, 1, 6, -0.05F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 281, 72, -3.0F, 2.5F, 1.0F, 6, 6, 2, -0.15F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 281, 63, -3.0F, 2.5F, -1.0F, 6, 6, 2, -0.15F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 281, 54, -3.0F, 2.5F, -3.0F, 6, 6, 2, -0.15F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 260, 168, -3.0F, 2.5F, -3.0F, 6, 6, 6, -0.25F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		magazine.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}