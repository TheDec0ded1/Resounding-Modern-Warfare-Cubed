package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class TavorX95RCS_SBR extends ModelBase {
	private final ModelRenderer railcoversSideSBR;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;

	public TavorX95RCS_SBR() {
		textureWidth = 560;
		textureHeight = 560;

		railcoversSideSBR = new ModelRenderer(this);
		railcoversSideSBR.setRotationPoint(0.225F, -12.25F, -17.0F);
		railcoversSideSBR.cubeList.add(new ModelBox(railcoversSideSBR, 64, 428, 0.0F, -2.0F, -8.0F, 1, 4, 9, 0.0F, false));
		railcoversSideSBR.cubeList.add(new ModelBox(railcoversSideSBR, 64, 441, -4.422F, -2.0F, -8.0F, 1, 4, 9, 0.0F, false));
		railcoversSideSBR.cubeList.add(new ModelBox(railcoversSideSBR, 514, 535, 0.001F, 1.5F, -2.7F, 1, 2, 2, 0.0F, false));
		railcoversSideSBR.cubeList.add(new ModelBox(railcoversSideSBR, 520, 535, -4.423F, 1.5F, -2.7F, 1, 2, 2, 0.0F, false));
		railcoversSideSBR.cubeList.add(new ModelBox(railcoversSideSBR, 116, 541, -4.422F, 2.0F, -8.0F, 1, 2, 1, 0.0F, false));
		railcoversSideSBR.cubeList.add(new ModelBox(railcoversSideSBR, 120, 541, 0.0F, 2.0F, -8.0F, 1, 2, 1, 0.0F, false));
		railcoversSideSBR.cubeList.add(new ModelBox(railcoversSideSBR, 458, 84, 0.2F, 3.2F, -7.475F, 1, 1, 10, -0.2F, false));
		railcoversSideSBR.cubeList.add(new ModelBox(railcoversSideSBR, 510, 221, -4.622F, 3.2F, -7.475F, 1, 1, 10, -0.2F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-3.3613F, -0.5858F, 8.75F);
		railcoversSideSBR.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 24, 536, 0.0F, -2.0F, -17.0F, 3, 1, 1, -0.25F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 536, 0.0F, -2.0F, -14.5F, 3, 1, 1, -0.25F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 8, 536, 0.0F, -2.0F, -16.5F, 3, 1, 1, -0.25F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 536, 0.0F, -2.0F, -12.5F, 3, 1, 1, -0.25F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 534, 535, 0.0F, -2.0F, -10.5F, 3, 1, 1, -0.25F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 526, 535, 0.0F, -2.0F, -8.5F, 3, 1, 1, -0.25F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 128, 525, 1.9F, -2.0002F, -17.0F, 1, 1, 9, -0.25F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 108, 525, 0.0F, -2.0002F, -17.0F, 1, 1, 9, -0.25F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(1.3535F, -0.5858F, 8.75F);
		railcoversSideSBR.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.7854F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 48, 540, 0.0F, -4.0F, -17.0F, 1, 3, 1, -0.25F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 44, 540, 0.0F, -4.0F, -14.5F, 1, 3, 1, -0.25F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 40, 540, 0.0F, -4.0F, -16.5F, 1, 3, 1, -0.25F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 36, 540, 0.0F, -4.0F, -12.5F, 1, 3, 1, -0.25F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 32, 540, 0.0F, -4.0F, -10.5F, 1, 3, 1, -0.25F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 538, 539, 0.0F, -4.0F, -8.5F, 1, 3, 1, -0.25F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 460, 524, 0.0005F, -3.9F, -17.0F, 1, 1, 9, -0.25F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 440, 524, 0.0005F, -2.0F, -17.0F, 1, 1, 9, -0.25F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-1.4985F, -0.6536F, -5.3799F);
		railcoversSideSBR.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.2182F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 136, 541, 1.4975F, 2.5F, -0.5F, 1, 2, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 402, 541, -2.9225F, 2.5F, -0.5F, 1, 2, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 538, 35, -3.2025F, -0.5F, -0.5F, 1, 4, 1, -0.2F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 24, 538, 1.7975F, -0.5F, -0.5F, 1, 4, 1, -0.2F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-1.9235F, -0.6536F, -7.3799F);
		railcoversSideSBR.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.2182F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 356, 541, -2.4975F, 2.5F, -0.5F, 1, 2, 1, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 132, 541, 1.9225F, 2.5F, -0.5F, 1, 2, 1, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 538, 30, -2.7775F, -0.5F, -0.5F, 1, 4, 1, -0.2F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 28, 538, 2.2225F, -0.5F, -0.5F, 1, 4, 1, -0.2F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-1.9235F, -0.6536F, -3.3799F);
		railcoversSideSBR.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.2182F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 212, 541, -2.4975F, 2.5F, -0.5F, 1, 2, 1, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 128, 541, 1.9225F, 2.5F, -0.5F, 1, 2, 1, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 538, 40, -2.7775F, -0.5F, -0.5F, 1, 4, 1, -0.2F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 20, 538, 2.2225F, -0.5F, -0.5F, 1, 4, 1, -0.2F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-1.9235F, -0.6536F, -1.3799F);
		railcoversSideSBR.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.2182F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 208, 541, -2.4975F, 2.5F, -0.5F, 1, 2, 1, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 124, 541, 1.9225F, 2.5F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-6.5985F, -0.6536F, 0.6201F);
		railcoversSideSBR.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.2182F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 536, 153, 1.8975F, -0.5F, -0.5F, 1, 4, 1, -0.2F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 536, 148, 6.8975F, -0.5F, -0.5F, 1, 4, 1, -0.2F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-1.4985F, -0.4036F, 0.6201F);
		railcoversSideSBR.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.2182F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 432, 531, 1.4975F, -1.0F, -0.5F, 1, 5, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 116, 535, -2.9225F, -0.8F, -0.5F, 1, 5, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		railcoversSideSBR.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}