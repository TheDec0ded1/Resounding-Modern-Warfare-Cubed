package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class LMG68Belt extends ModelWithAttachments {
	private final ModelRenderer belt;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;

	public LMG68Belt() {
		textureWidth = 416;
		textureHeight = 416;

		belt = new ModelRenderer(this);
		belt.setRotationPoint(4.5938F, -15.4344F, -29.4187F);
		setRotationAngle(belt, 0.0F, 0.0F, 0.3927F);
		belt.cubeList.add(new ModelBox(belt, 354, 17, -5.25F, -3.225F, -0.5F, 2, 1, 3, -0.1F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-6.75F, -2.025F, -3.8F);
		belt.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 378, -1.0F, -1.0F, -1.5F, 2, 2, 4, -0.5F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 250, 377, -1.0F, -1.0F, 2.8F, 2, 2, 4, -0.3F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 56, 346, -1.0F, -1.0F, 0.8F, 2, 2, 7, -0.4F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-5.0F, -2.425F, -3.8F);
		belt.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.5236F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 374, 377, -1.0F, -1.0F, -1.5F, 2, 2, 4, -0.5F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 188, 377, -1.0F, -1.0F, 2.8F, 2, 2, 4, -0.3F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 230, 343, -1.0F, -1.0F, 0.8F, 2, 2, 7, -0.4F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-3.25F, -2.425F, -3.8F);
		belt.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.3927F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 362, 377, -1.0F, -1.0F, -1.5F, 2, 2, 4, -0.5F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 132, 377, -1.0F, -1.0F, 2.8F, 2, 2, 4, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 364, 132, -1.0F, -1.0F, 0.8F, 2, 2, 7, -0.4F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-6.75F, -2.025F, 1.5F);
		belt.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.2618F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 344, 17, 0.0F, -0.7F, -2.0F, 2, 1, 3, -0.1F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		belt.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}