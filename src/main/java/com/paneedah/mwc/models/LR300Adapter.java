package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class LR300Adapter extends ModelBase {
	private final ModelRenderer extension;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r10;
	private final ModelRenderer extension_r1;
	private final ModelRenderer extension_r2;
	private final ModelRenderer extension_r3;
	private final ModelRenderer extension_r4;
	private final ModelRenderer extension_r5;
	private final ModelRenderer extension_r6;
	private final ModelRenderer extension_r7;
	private final ModelRenderer extension_r8;
	private final ModelRenderer extension_r9;
	private final ModelRenderer extension_r10;
	private final ModelRenderer extension_r11;

	public LR300Adapter() {
		textureWidth = 368;
		textureHeight = 368;

		extension = new ModelRenderer(this);
		extension.setRotationPoint(0.0F, 31.25F, -2.0F);
		extension.cubeList.add(new ModelBox(extension, 294, 346, -2.0F, -47.225F, 4.499F, 1, 1, 2, 0.05F, false));
		extension.cubeList.add(new ModelBox(extension, 198, 335, -2.5F, -47.3F, 6.0F, 2, 5, 3, 0.0F, false));
		extension.cubeList.add(new ModelBox(extension, 40, 343, -2.5F, -44.3F, 9.0F, 2, 2, 2, 0.0F, false));
		extension.cubeList.add(new ModelBox(extension, 72, 343, -2.5F, -47.3F, 9.0F, 2, 2, 2, 0.0F, false));
		extension.cubeList.add(new ModelBox(extension, 198, 346, -2.0F, -45.3F, 9.0F, 1, 1, 2, 0.0F, false));
		extension.cubeList.add(new ModelBox(extension, 204, 343, -0.5F, -47.3F, 6.0F, 1, 6, 1, 0.0F, false));
		extension.cubeList.add(new ModelBox(extension, 66, 342, -0.7929F, -47.301F, 6.7071F, 2, 6, 1, 0.0F, false));
		extension.cubeList.add(new ModelBox(extension, 322, 343, -0.5F, -47.3F, 7.4142F, 1, 6, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.1464F, -45.3F, 8.7678F);
		extension.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -0.7854F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 318, 343, -1.0F, -2.0F, -1.5F, 1, 6, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.1464F, -45.3F, 7.7678F);
		extension.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, -0.7854F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 304, 342, -1.0F, -2.0F, -1.5F, 1, 6, 1, 0.0F, false));

		extension_r1 = new ModelRenderer(this);
		extension_r1.setRotationPoint(-2.8606F, -45.2878F, 17.999F);
		extension.addChild(extension_r1);
		setRotationAngle(extension_r1, 0.0F, 0.0F, -1.5708F);
		extension_r1.cubeList.add(new ModelBox(extension_r1, 78, 347, -0.5F, -0.5766F, -13.5F, 1, 1, 2, 0.05F, false));

		extension_r2 = new ModelRenderer(this);
		extension_r2.setRotationPoint(-2.8453F, -45.3648F, 17.999F);
		extension.addChild(extension_r2);
		setRotationAngle(extension_r2, 0.0F, 0.0F, -1.1781F);
		extension_r2.cubeList.add(new ModelBox(extension_r2, 72, 347, 0.2413F, -0.7241F, -13.5F, 1, 1, 2, 0.05F, false));

		extension_r3 = new ModelRenderer(this);
		extension_r3.setRotationPoint(-2.8453F, -45.2107F, 17.999F);
		extension.addChild(extension_r3);
		setRotationAngle(extension_r3, 0.0F, 0.0F, -1.9635F);
		extension_r3.cubeList.add(new ModelBox(extension_r3, 60, 347, -1.2413F, -0.7241F, -13.5F, 1, 1, 2, 0.05F, false));

		extension_r4 = new ModelRenderer(this);
		extension_r4.setRotationPoint(-1.5F, -43.9272F, 17.999F);
		extension.addChild(extension_r4);
		setRotationAngle(extension_r4, 0.0F, 0.0F, 3.1416F);
		extension_r4.cubeList.add(new ModelBox(extension_r4, 54, 347, -0.5F, -0.5766F, -13.5F, 1, 1, 2, 0.05F, false));

		extension_r5 = new ModelRenderer(this);
		extension_r5.setRotationPoint(-1.5771F, -43.9425F, 17.999F);
		extension.addChild(extension_r5);
		setRotationAngle(extension_r5, 0.0F, 0.0F, -2.7489F);
		extension_r5.cubeList.add(new ModelBox(extension_r5, 40, 347, 0.2413F, -0.7241F, -13.5F, 1, 1, 2, 0.05F, false));

		extension_r6 = new ModelRenderer(this);
		extension_r6.setRotationPoint(-1.4229F, -43.9425F, 17.999F);
		extension.addChild(extension_r6);
		setRotationAngle(extension_r6, 0.0F, 0.0F, 2.7489F);
		extension_r6.cubeList.add(new ModelBox(extension_r6, 180, 346, -1.2413F, -0.7241F, -13.5F, 1, 1, 2, 0.05F, false));

		extension_r7 = new ModelRenderer(this);
		extension_r7.setRotationPoint(-0.1394F, -45.2878F, 17.999F);
		extension.addChild(extension_r7);
		setRotationAngle(extension_r7, 0.0F, 0.0F, 1.5708F);
		extension_r7.cubeList.add(new ModelBox(extension_r7, 34, 347, -0.5F, -0.5766F, -13.5F, 1, 1, 2, 0.05F, false));

		extension_r8 = new ModelRenderer(this);
		extension_r8.setRotationPoint(-0.1547F, -45.2107F, 17.999F);
		extension.addChild(extension_r8);
		setRotationAngle(extension_r8, 0.0F, 0.0F, 1.9635F);
		extension_r8.cubeList.add(new ModelBox(extension_r8, 28, 347, 0.2413F, -0.7241F, -13.5F, 1, 1, 2, 0.05F, false));

		extension_r9 = new ModelRenderer(this);
		extension_r9.setRotationPoint(-0.1547F, -45.3648F, 17.999F);
		extension.addChild(extension_r9);
		setRotationAngle(extension_r9, 0.0F, 0.0F, 1.1781F);
		extension_r9.cubeList.add(new ModelBox(extension_r9, 22, 347, -1.2413F, -0.7241F, -13.5F, 1, 1, 2, 0.05F, false));

		extension_r10 = new ModelRenderer(this);
		extension_r10.setRotationPoint(-2.3477F, -46.5564F, 17.999F);
		extension.addChild(extension_r10);
		setRotationAngle(extension_r10, 0.0F, 0.0F, -0.3927F);
		extension_r10.cubeList.add(new ModelBox(extension_r10, 16, 347, -0.5F, -0.5F, -13.5F, 1, 1, 2, 0.05F, false));

		extension_r11 = new ModelRenderer(this);
		extension_r11.setRotationPoint(-0.6523F, -46.5564F, 17.999F);
		extension.addChild(extension_r11);
		setRotationAngle(extension_r11, 0.0F, 0.0F, 0.3927F);
		extension_r11.cubeList.add(new ModelBox(extension_r11, 344, 346, -0.5F, -0.5F, -13.5F, 1, 1, 2, 0.05F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		extension.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}