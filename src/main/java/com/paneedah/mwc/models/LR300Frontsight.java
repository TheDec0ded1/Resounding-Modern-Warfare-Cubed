package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class LR300Frontsight extends ModelBase {
	private final ModelRenderer frontsight;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;

	public LR300Frontsight() {
		textureWidth = 368;
		textureHeight = 368;

		frontsight = new ModelRenderer(this);
		frontsight.setRotationPoint(0.0F, 5.1F, 0.9F);
		frontsight.cubeList.add(new ModelBox(frontsight, 342, 147, -2.5F, -25.2738F, -49.0068F, 2, 3, 2, -0.2F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 342, 152, -2.5F, -25.2738F, -48.3568F, 2, 3, 2, -0.2F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 128, 349, -2.0F, -26.3F, -48.45F, 1, 2, 1, -0.4F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.825F, -25.5849F, -47.9314F);
		frontsight.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.3927F, 0.0F, 0.1309F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 350, 154, -0.5F, -1.0733F, -0.6829F, 1, 1, 1, -0.3F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-2.175F, -25.5849F, -47.9314F);
		frontsight.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.3927F, 0.0F, -0.1309F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 154, 350, -0.5F, -1.0733F, -0.6829F, 1, 1, 1, -0.3F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-2.175F, -25.5849F, -47.9314F);
		frontsight.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.6109F, 0.0F, -0.1309F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 346, 195, -0.5F, -0.3926F, -1.158F, 1, 1, 2, -0.3F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-0.825F, -25.5849F, -47.9314F);
		frontsight.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.6109F, 0.0F, 0.1309F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 346, 192, -0.5F, -0.3926F, -1.158F, 1, 1, 2, -0.3F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-2.175F, -25.5849F, -47.9314F);
		frontsight.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.1309F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 144, 344, -0.5F, -0.5403F, -1.1791F, 1, 2, 2, -0.3F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 124, 349, -0.5F, -1.021F, -0.5801F, 1, 2, 1, -0.3F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-0.825F, -25.5849F, -47.9314F);
		frontsight.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, 0.1309F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 344, 110, -0.5F, -0.5403F, -1.1791F, 1, 2, 2, -0.3F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 120, 349, -0.5F, -1.021F, -0.5801F, 1, 2, 1, -0.3F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-0.825F, -25.5849F, -47.9314F);
		frontsight.addChild(cube_r15);
		setRotationAngle(cube_r15, 1.0908F, 0.0F, 0.1309F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 192, 346, -0.5F, -0.5266F, -1.0051F, 1, 1, 2, -0.3F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-2.175F, -25.5849F, -47.9314F);
		frontsight.addChild(cube_r16);
		setRotationAngle(cube_r16, 1.0908F, 0.0F, -0.1309F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 346, 189, -0.5F, -0.5266F, -1.0051F, 1, 1, 2, -0.3F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-2.175F, -25.5849F, -47.9314F);
		frontsight.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.6981F, 0.0F, -0.1309F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 344, 106, -0.5F, -0.4057F, -0.9916F, 1, 2, 2, -0.3F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-0.825F, -25.5849F, -47.9314F);
		frontsight.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.6981F, 0.0F, 0.1309F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 344, 102, -0.5F, -0.4057F, -0.9916F, 1, 2, 2, -0.3F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		frontsight.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}