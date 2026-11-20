package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M110Handle extends ModelWithAttachments {
	private final ModelRenderer handle;
	private final ModelRenderer handle_r1;
	private final ModelRenderer handle_r2;
	private final ModelRenderer handle_r3;
	private final ModelRenderer handle_r4;
	private final ModelRenderer handle_r5;
	private final ModelRenderer handle_r6;
	private final ModelRenderer handle_r7;
	private final ModelRenderer handle_r8;

	public M110Handle() {
		textureWidth = 544;
		textureHeight = 544;

		handle = new ModelRenderer(this);
		handle.setRotationPoint(-1.1535F, -17.665F, 0.3597F);
		handle.cubeList.add(new ModelBox(handle, 0, 477, -1.3465F, -0.36F, -21.3607F, 2, 1, 22, -0.05F, false));
		handle.cubeList.add(new ModelBox(handle, 216, 521, 1.4285F, -0.46F, 0.1393F, 1, 1, 1, -0.2F, false));
		handle.cubeList.add(new ModelBox(handle, 520, 150, -2.8215F, -0.561F, 0.6393F, 1, 2, 1, 0.0F, false));
		handle.cubeList.add(new ModelBox(handle, 520, 153, 1.1285F, -0.561F, 0.6393F, 1, 2, 1, 0.0F, false));
		handle.cubeList.add(new ModelBox(handle, 360, 168, -1.8478F, -0.56F, 0.8563F, 3, 1, 1, 0.0F, false));
		handle.cubeList.add(new ModelBox(handle, 370, 254, -1.8478F, 0.04F, 0.8557F, 3, 1, 1, 0.0F, false));
		handle.cubeList.add(new ModelBox(handle, 232, 521, -0.8478F, -0.56F, -0.1522F, 1, 1, 1, 0.0F, false));
		handle.cubeList.add(new ModelBox(handle, 362, 254, -1.8478F, -0.561F, 0.4228F, 3, 1, 1, 0.0F, false));

		handle_r1 = new ModelRenderer(this);
		handle_r1.setRotationPoint(-1.2215F, -0.06F, 0.2393F);
		handle.addChild(handle_r1);
		setRotationAngle(handle_r1, 0.0F, -0.3927F, 0.0F);
		handle_r1.cubeList.add(new ModelBox(handle_r1, 228, 521, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		handle_r2 = new ModelRenderer(this);
		handle_r2.setRotationPoint(0.4285F, -0.06F, 0.2393F);
		handle.addChild(handle_r2);
		setRotationAngle(handle_r2, 0.0F, 0.3927F, 0.0F);
		handle_r2.cubeList.add(new ModelBox(handle_r2, 224, 521, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		handle_r3 = new ModelRenderer(this);
		handle_r3.setRotationPoint(2.7535F, -0.06F, 1.7212F);
		handle.addChild(handle_r3);
		setRotationAngle(handle_r3, 0.0F, -0.2182F, 0.0F);
		handle_r3.cubeList.add(new ModelBox(handle_r3, 220, 521, -1.8444F, -0.5F, -0.921F, 1, 1, 1, 0.0F, false));

		handle_r4 = new ModelRenderer(this);
		handle_r4.setRotationPoint(0.6446F, 0.04F, -0.9921F);
		handle.addChild(handle_r4);
		setRotationAngle(handle_r4, 0.0F, 0.3927F, 0.0F);
		handle_r4.cubeList.add(new ModelBox(handle_r4, 50, 515, -0.5F, -0.5F, -0.2F, 1, 1, 2, -0.2F, false));

		handle_r5 = new ModelRenderer(this);
		handle_r5.setRotationPoint(-3.4465F, -0.06F, 0.5573F);
		handle.addChild(handle_r5);
		setRotationAngle(handle_r5, 0.0F, -0.2182F, 0.0F);
		handle_r5.cubeList.add(new ModelBox(handle_r5, 136, 520, 0.8444F, -0.5F, -0.079F, 1, 2, 1, 0.0F, false));

		handle_r6 = new ModelRenderer(this);
		handle_r6.setRotationPoint(3.0921F, 0.04F, 1.2692F);
		handle.addChild(handle_r6);
		setRotationAngle(handle_r6, 0.0F, -0.2182F, 0.0F);
		handle_r6.cubeList.add(new ModelBox(handle_r6, 428, 516, -2.8444F, -0.5F, -0.921F, 2, 1, 1, -0.2F, false));

		handle_r7 = new ModelRenderer(this);
		handle_r7.setRotationPoint(-3.2014F, -0.06F, 1.2356F);
		handle.addChild(handle_r7);
		setRotationAngle(handle_r7, 0.0F, 0.2182F, 0.0F);
		handle_r7.cubeList.add(new ModelBox(handle_r7, 212, 521, 0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		handle_r8 = new ModelRenderer(this);
		handle_r8.setRotationPoint(0.5559F, -0.06F, 1.4758F);
		handle.addChild(handle_r8);
		setRotationAngle(handle_r8, 0.0F, 0.2182F, 0.0F);
		handle_r8.cubeList.add(new ModelBox(handle_r8, 132, 520, 0.5F, -0.5F, -0.5F, 1, 2, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handle.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}