package com.paneedah.mwc.models;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QSW06Silencer extends ModelBase {
	private final ModelRenderer suppressor;
	private final ModelRenderer barrelouter6;
	private final ModelRenderer bone30;
	private final ModelRenderer cube_r79;
	private final ModelRenderer cube_r80;
	private final ModelRenderer bone31;
	private final ModelRenderer cube_r81;
	private final ModelRenderer cube_r82;
	private final ModelRenderer bone32;
	private final ModelRenderer cube_r83;
	private final ModelRenderer cube_r84;
	private final ModelRenderer bone33;
	private final ModelRenderer cube_r85;
	private final ModelRenderer cube_r86;

	public QSW06Silencer() {
		textureWidth = 400;
		textureHeight = 400;

		suppressor = new ModelRenderer(this);
		suppressor.setRotationPoint(-1.0F, -17.8F, -90.35F);
		

		barrelouter6 = new ModelRenderer(this);
		barrelouter6.setRotationPoint(0.0F, 0.0F, 4.0F);
		suppressor.addChild(barrelouter6);
		

		bone30 = new ModelRenderer(this);
		bone30.setRotationPoint(-0.5F, 4.4F, 0.0F);
		barrelouter6.addChild(bone30);
		

		cube_r79 = new ModelRenderer(this);
		cube_r79.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone30.addChild(cube_r79);
		setRotationAngle(cube_r79, 0.0F, 0.0F, -0.4363F);
		cube_r79.cubeList.add(new ModelBox(cube_r79, 0, 99, -1.6904F, 1.6253F, 26.0F, 2, 2, 29, 0.05F, false));

		cube_r80 = new ModelRenderer(this);
		cube_r80.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone30.addChild(cube_r80);
		setRotationAngle(cube_r80, 0.0F, 0.0F, 0.4363F);
		cube_r80.cubeList.add(new ModelBox(cube_r80, 63, 99, -0.3096F, 1.6253F, 26.0F, 2, 2, 29, 0.05F, false));

		bone31 = new ModelRenderer(this);
		bone31.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter6.addChild(bone31);
		setRotationAngle(bone31, 0.0F, 0.0F, 1.5708F);
		

		cube_r81 = new ModelRenderer(this);
		cube_r81.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone31.addChild(cube_r81);
		setRotationAngle(cube_r81, 0.0F, 0.0F, 0.4363F);
		cube_r81.cubeList.add(new ModelBox(cube_r81, 126, 99, 3.6253F, -1.6904F, 26.0F, 2, 2, 29, 0.05F, false));

		cube_r82 = new ModelRenderer(this);
		cube_r82.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone31.addChild(cube_r82);
		setRotationAngle(cube_r82, 0.0F, 0.0F, -0.4363F);
		cube_r82.cubeList.add(new ModelBox(cube_r82, 130, 0, 1.6253F, 1.6903F, 26.0F, 2, 2, 29, 0.05F, false));

		bone32 = new ModelRenderer(this);
		bone32.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter6.addChild(bone32);
		setRotationAngle(bone32, 0.0F, 0.0F, -1.5708F);
		

		cube_r83 = new ModelRenderer(this);
		cube_r83.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone32.addChild(cube_r83);
		setRotationAngle(cube_r83, 0.0F, 0.0F, -0.4363F);
		cube_r83.cubeList.add(new ModelBox(cube_r83, 130, 32, -5.6253F, -1.6904F, 26.0F, 2, 2, 29, 0.05F, false));

		cube_r84 = new ModelRenderer(this);
		cube_r84.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone32.addChild(cube_r84);
		setRotationAngle(cube_r84, 0.0F, 0.0F, 0.4363F);
		cube_r84.cubeList.add(new ModelBox(cube_r84, 130, 64, -3.6253F, 1.6903F, 26.0F, 2, 2, 29, 0.05F, false));

		bone33 = new ModelRenderer(this);
		bone33.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter6.addChild(bone33);
		

		cube_r85 = new ModelRenderer(this);
		cube_r85.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone33.addChild(cube_r85);
		setRotationAngle(cube_r85, 0.0F, 0.0F, 0.4363F);
		cube_r85.cubeList.add(new ModelBox(cube_r85, 0, 131, 1.6904F, 3.6253F, 26.0F, 2, 2, 29, 0.05F, false));

		cube_r86 = new ModelRenderer(this);
		cube_r86.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone33.addChild(cube_r86);
		setRotationAngle(cube_r86, 0.0F, 0.0F, -0.4363F);
		cube_r86.cubeList.add(new ModelBox(cube_r86, 63, 131, -3.6904F, 3.6253F, 26.0F, 2, 2, 29, 0.05F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		suppressor.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}