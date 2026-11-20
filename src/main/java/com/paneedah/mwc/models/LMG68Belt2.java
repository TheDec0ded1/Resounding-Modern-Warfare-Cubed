package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class LMG68Belt2 extends ModelWithAttachments {
	private final ModelRenderer belt2;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;

	public LMG68Belt2() {
		textureWidth = 416;
		textureHeight = 416;

		belt2 = new ModelRenderer(this);
		belt2.setRotationPoint(4.3688F, -16.1594F, -30.5688F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.1F, 0.0F, 0.0F);
		belt2.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 1.7802F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 276, 377, 1.1928F, -1.2589F, -4.15F, 2, 2, 4, -0.5F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 364, 150, 1.1928F, -1.2589F, -1.85F, 2, 2, 7, -0.4F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 76, 377, 1.1928F, -1.2589F, 0.15F, 2, 2, 4, -0.3F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-0.4F, 0.0F, 0.0F);
		belt2.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.6021F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 338, 377, -0.4752F, -1.1589F, -4.15F, 2, 2, 4, -0.5F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 366, 0, -0.4752F, -1.1589F, -1.85F, 2, 2, 7, -0.4F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 88, 377, -0.4752F, -1.1589F, 0.15F, 2, 2, 4, -0.3F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		belt2.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.5672F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 350, 377, -2.2246F, -1.7422F, -4.15F, 2, 2, 4, -0.5F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 364, 141, -2.2246F, -1.7422F, -1.85F, 2, 2, 7, -0.4F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 176, 377, -2.2246F, -1.7422F, 0.15F, 2, 2, 4, -0.3F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-0.1F, 0.0F, 0.0F);
		belt2.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 1.693F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 384, 265, -0.3184F, -0.9078F, 0.65F, 2, 1, 3, -0.1F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-0.4F, 0.0F, 0.0F);
		belt2.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 1.4312F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 384, 261, -1.3184F, -0.9078F, 0.65F, 2, 1, 3, -0.1F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
		belt2.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 0.829F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 384, 269, -3.125F, -1.1F, 0.65F, 2, 1, 3, -0.1F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		belt2.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}