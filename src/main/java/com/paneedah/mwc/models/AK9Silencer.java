package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AK9Silencer extends ModelBase {
	private final ModelRenderer suppressor;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;

	public AK9Silencer() {
		textureWidth = 320;
		textureHeight = 320;

		suppressor = new ModelRenderer(this);
		suppressor.setRotationPoint(-1.5F, -11.5858F, -55.6F);
		suppressor.cubeList.add(new ModelBox(suppressor, 74, 304, -1.0F, -2.4142F, -3.0F, 2, 2, 4, 0.0F, false));
		suppressor.cubeList.add(new ModelBox(suppressor, 146, 304, -2.4142F, -1.0F, -3.0F, 2, 2, 4, 0.0F, false));
		suppressor.cubeList.add(new ModelBox(suppressor, 304, 178, 0.4142F, -1.0F, -3.0F, 2, 2, 4, 0.0F, false));
		suppressor.cubeList.add(new ModelBox(suppressor, 304, 159, -1.0F, 0.4142F, -3.0F, 2, 2, 4, 0.0F, false));
		suppressor.cubeList.add(new ModelBox(suppressor, 214, 233, -1.0F, -2.3142F, -19.3F, 2, 1, 17, -0.075F, false));
		suppressor.cubeList.add(new ModelBox(suppressor, 242, 189, -2.3081F, -1.0061F, -18.3F, 1, 2, 16, -0.075F, false));
		suppressor.cubeList.add(new ModelBox(suppressor, 224, 101, -1.0F, 1.3021F, -19.3F, 2, 1, 17, -0.075F, false));
		suppressor.cubeList.add(new ModelBox(suppressor, 240, 21, 1.3081F, -1.0061F, -18.3F, 1, 2, 16, -0.075F, false));
		suppressor.cubeList.add(new ModelBox(suppressor, 314, 23, -1.0F, -2.4892F, -1.25F, 2, 2, 1, 0.05F, false));
		suppressor.cubeList.add(new ModelBox(suppressor, 18, 314, -2.4849F, -1.0043F, -1.25F, 2, 2, 1, 0.05F, false));
		suppressor.cubeList.add(new ModelBox(suppressor, 214, 313, 0.4849F, -1.0043F, -1.25F, 2, 2, 1, 0.05F, false));
		suppressor.cubeList.add(new ModelBox(suppressor, 202, 313, -1.0F, 0.4806F, -1.25F, 2, 2, 1, 0.05F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(12.4642F, 1.0457F, 0.75F);
		suppressor.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 314, 14, -9.0711F, 7.0711F, -2.0F, 2, 2, 1, 0.05F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(2.3642F, 1.0457F, 0.75F);
		suppressor.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.7854F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 296, 14, -3.4142F, 1.4142F, -2.0F, 2, 2, 1, 0.05F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.05F, -1.0543F, 1.75F);
		suppressor.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 314, 17, -1.0F, -1.0F, -3.0F, 2, 2, 1, 0.05F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(1.05F, -1.0543F, 1.75F);
		suppressor.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 0.7854F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 314, 20, -1.0F, -1.0F, -3.0F, 2, 2, 1, 0.05F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(2.4892F, 0.9189F, -4.3F);
		suppressor.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, 0.7854F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 224, 83, -3.4142F, 2.4142F, -15.0F, 2, 1, 17, -0.075F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(12.3392F, 0.9189F, -4.3F);
		suppressor.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, 0.7854F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 234, 48, -8.0711F, 7.0711F, -15.0F, 1, 2, 17, -0.075F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-0.925F, -0.9311F, -3.3F);
		suppressor.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, 0.7854F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 132, 236, -1.0F, -1.0F, -16.0F, 1, 2, 17, -0.075F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.925F, -0.9311F, -3.3F);
		suppressor.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, 0.7854F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 176, 233, -1.0F, -1.0F, -16.0F, 2, 1, 17, -0.075F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(12.4142F, 1.0F, -1.0F);
		suppressor.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, 0.7854F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 304, 184, -9.0711F, 7.0711F, -2.0F, 2, 2, 4, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(2.4142F, 1.0F, -1.0F);
		suppressor.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, 0.7854F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 238, 119, -3.4142F, 1.4142F, -2.0F, 2, 2, 4, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-1.0F, -1.0F, 0.0F);
		suppressor.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, 0.7854F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 304, 127, -1.0F, -1.0F, -3.0F, 2, 2, 4, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(1.0F, -1.0F, 0.0F);
		suppressor.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, 0.7854F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 86, 304, -1.0F, -1.0F, -3.0F, 2, 2, 4, 0.0F, false));
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