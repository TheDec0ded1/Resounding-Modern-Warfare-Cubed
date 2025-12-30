package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Stoner63LMGBelt extends ModelWithAttachments {
	private final ModelRenderer belt;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;

	public Stoner63LMGBelt() {
		textureWidth = 576;
		textureHeight = 576;

		belt = new ModelRenderer(this);
		belt.setRotationPoint(5.2188F, -15.8344F, -21.2188F);
		belt.cubeList.add(new ModelBox(belt, 0, 554, -5.25F, -3.225F, 0.5F, 2, 1, 2, -0.1F, false));
		belt.cubeList.add(new ModelBox(belt, 292, 554, -3.25F, -3.125F, 0.5F, 2, 1, 2, -0.1F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-6.75F, -2.025F, -2.5F);
		belt.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 551, 257, -1.0F, -1.0F, -1.5F, 2, 2, 3, -0.5F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 551, 335, -1.0F, -1.0F, 2.5F, 2, 2, 3, -0.3F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 445, 542, -1.0F, -1.0F, 0.5F, 2, 2, 6, -0.4F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-5.0F, -2.425F, -2.5F);
		belt.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.5236F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 551, 263, -1.0F, -1.0F, -1.5F, 2, 2, 3, -0.5F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 551, 341, -1.0F, -1.0F, 2.5F, 2, 2, 3, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 428, 542, -1.0F, -1.0F, 0.5F, 2, 2, 6, -0.4F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-3.25F, -2.425F, -2.5F);
		belt.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.3927F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 551, 269, -1.0F, -1.0F, -1.5F, 2, 2, 3, -0.5F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 551, 379, -1.0F, -1.0F, 2.5F, 2, 2, 3, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 479, 542, -1.0F, -1.0F, 0.5F, 2, 2, 6, -0.4F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.5F, -2.425F, -2.5F);
		belt.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.2618F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 551, 311, -1.0F, -1.0F, -1.5F, 2, 2, 3, -0.5F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 551, 347, -1.0F, -1.0F, 2.5F, 2, 2, 3, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 462, 542, -1.0F, -1.0F, 0.5F, 2, 2, 6, -0.4F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.25F, -2.425F, -2.5F);
		belt.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.5236F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 551, 317, -1.0F, -1.0F, -1.5F, 2, 2, 3, -0.5F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 551, 385, -1.0F, -1.0F, 2.5F, 2, 2, 3, -0.3F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 182, 543, -1.0F, -1.0F, 0.5F, 2, 2, 6, -0.4F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(2.0F, -1.425F, -2.5F);
		belt.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.3927F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 551, 323, -1.0F, -1.0F, -1.5F, 2, 2, 3, -0.5F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 551, 391, -1.0F, -1.0F, 2.5F, 2, 2, 3, -0.3F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 199, 543, -1.0F, -1.0F, 0.5F, 2, 2, 6, -0.4F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(2.75F, 0.075F, -2.5F);
		belt.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.2618F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 551, 329, -1.0F, -1.0F, -1.5F, 2, 2, 3, -0.5F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 551, 397, -1.0F, -1.0F, 2.5F, 2, 2, 3, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 276, 543, -1.0F, -1.0F, 0.5F, 2, 2, 6, -0.4F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-6.75F, -2.025F, 1.5F);
		belt.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.3054F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 388, 554, 6.0F, -2.9F, -1.0F, 2, 1, 2, -0.1F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 554, 374, 5.0F, -2.9F, -1.0F, 2, 1, 2, -0.1F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-6.75F, -2.025F, 1.5F);
		belt.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.2618F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 553, 521, 0.0F, -0.7F, -1.0F, 2, 1, 2, -0.1F, false));
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