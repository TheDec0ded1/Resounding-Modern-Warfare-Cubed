package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QHoneyBadgerHandle extends ModelWithAttachments {
	private final ModelRenderer raptorSL;
	private final ModelRenderer handle_r1;
	private final ModelRenderer handle_r2;
	private final ModelRenderer handle_r3;
	private final ModelRenderer handle_r4;
	private final ModelRenderer handle_r5;
	private final ModelRenderer handle_r6;
	private final ModelRenderer handle_r7;
	private final ModelRenderer handle_r8;
	private final ModelRenderer handle_r9;

	public QHoneyBadgerHandle() {
		textureWidth = 400;
		textureHeight = 400;

		raptorSL = new ModelRenderer(this);
		raptorSL.setRotationPoint(-1.1535F, -16.865F, 0.1597F);
		raptorSL.cubeList.add(new ModelBox(raptorSL, 278, 95, -1.3465F, -0.36F, -21.3607F, 2, 1, 22, -0.05F, false));
		raptorSL.cubeList.add(new ModelBox(raptorSL, 232, 383, -0.8478F, -0.56F, -0.1522F, 1, 1, 1, 0.0F, false));
		raptorSL.cubeList.add(new ModelBox(raptorSL, 348, 19, -1.8478F, -0.56F, 0.4228F, 3, 1, 2, 0.0F, false));

		handle_r1 = new ModelRenderer(this);
		handle_r1.setRotationPoint(-2.9761F, -0.36F, 0.6718F);
		raptorSL.addChild(handle_r1);
		setRotationAngle(handle_r1, 0.0F, 0.2182F, 0.0F);
		handle_r1.cubeList.add(new ModelBox(handle_r1, 322, 356, -0.5F, -0.5F, -0.5F, 1, 2, 2, -0.3F, false));

		handle_r2 = new ModelRenderer(this);
		handle_r2.setRotationPoint(2.2805F, -0.36F, 0.6718F);
		raptorSL.addChild(handle_r2);
		setRotationAngle(handle_r2, 0.0F, -0.2182F, 0.0F);
		handle_r2.cubeList.add(new ModelBox(handle_r2, 284, 351, -0.5F, -0.5F, -0.5F, 1, 2, 2, -0.3F, false));

		handle_r3 = new ModelRenderer(this);
		handle_r3.setRotationPoint(1.9775F, -0.36F, 1.7347F);
		raptorSL.addChild(handle_r3);
		setRotationAngle(handle_r3, 0.0F, 0.2182F, 0.0F);
		handle_r3.cubeList.add(new ModelBox(handle_r3, 380, 275, -1.5F, -0.5F, -0.5F, 2, 2, 1, -0.3F, false));

		handle_r4 = new ModelRenderer(this);
		handle_r4.setRotationPoint(-2.673F, -0.36F, 1.7347F);
		raptorSL.addChild(handle_r4);
		setRotationAngle(handle_r4, 0.0F, -0.2182F, 0.0F);
		handle_r4.cubeList.add(new ModelBox(handle_r4, 274, 380, -0.5F, -0.5F, -0.5F, 2, 2, 1, -0.3F, false));

		handle_r5 = new ModelRenderer(this);
		handle_r5.setRotationPoint(-2.9761F, -0.36F, 0.3678F);
		raptorSL.addChild(handle_r5);
		setRotationAngle(handle_r5, 0.0F, -0.2182F, 0.0F);
		handle_r5.cubeList.add(new ModelBox(handle_r5, 268, 380, -0.5F, -0.5F, -0.5F, 2, 2, 1, -0.3F, false));

		handle_r6 = new ModelRenderer(this);
		handle_r6.setRotationPoint(2.2805F, -0.36F, 0.3678F);
		raptorSL.addChild(handle_r6);
		setRotationAngle(handle_r6, 0.0F, 0.2182F, 0.0F);
		handle_r6.cubeList.add(new ModelBox(handle_r6, 262, 380, -1.5F, -0.5F, -0.5F, 2, 2, 1, -0.3F, false));

		handle_r7 = new ModelRenderer(this);
		handle_r7.setRotationPoint(-1.2215F, -0.06F, 0.2393F);
		raptorSL.addChild(handle_r7);
		setRotationAngle(handle_r7, 0.0F, -0.3927F, 0.0F);
		handle_r7.cubeList.add(new ModelBox(handle_r7, 224, 383, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		handle_r8 = new ModelRenderer(this);
		handle_r8.setRotationPoint(0.4285F, -0.06F, 0.2393F);
		raptorSL.addChild(handle_r8);
		setRotationAngle(handle_r8, 0.0F, 0.3927F, 0.0F);
		handle_r8.cubeList.add(new ModelBox(handle_r8, 228, 383, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		handle_r9 = new ModelRenderer(this);
		handle_r9.setRotationPoint(0.6446F, 0.04F, -0.9921F);
		raptorSL.addChild(handle_r9);
		setRotationAngle(handle_r9, 0.0F, 0.3927F, 0.0F);
		handle_r9.cubeList.add(new ModelBox(handle_r9, 322, 360, -0.5F, -0.5F, -0.2F, 1, 1, 2, -0.2F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		raptorSL.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}