package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class TavorX95RCS_AR extends ModelBase {
	private final ModelRenderer railcoversSide;
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
	private final ModelRenderer cube_r19;

	public TavorX95RCS_AR() {
		textureWidth = 560;
		textureHeight = 560;

		railcoversSide = new ModelRenderer(this);
		railcoversSide.setRotationPoint(0.225F, -12.25F, -17.0F);
		railcoversSide.cubeList.add(new ModelBox(railcoversSide, 348, 492, 0.0F, -2.0F, -14.0F, 1, 4, 15, 0.0F, false));
		railcoversSide.cubeList.add(new ModelBox(railcoversSide, 492, 326, -4.422F, -2.0F, -14.0F, 1, 4, 15, 0.0F, false));
		railcoversSide.cubeList.add(new ModelBox(railcoversSide, 416, 535, 0.001F, 1.5F, -2.7F, 1, 2, 2, 0.0F, false));
		railcoversSide.cubeList.add(new ModelBox(railcoversSide, 410, 535, -4.423F, 1.5F, -2.7F, 1, 2, 2, 0.0F, false));
		railcoversSide.cubeList.add(new ModelBox(railcoversSide, 78, 541, -4.422F, 2.0F, -14.0F, 1, 2, 1, 0.0F, false));
		railcoversSide.cubeList.add(new ModelBox(railcoversSide, 74, 541, 0.0F, 2.0F, -14.0F, 1, 2, 1, 0.0F, false));
		railcoversSide.cubeList.add(new ModelBox(railcoversSide, 78, 493, 0.2F, 3.2F, -13.475F, 1, 1, 16, -0.2F, false));
		railcoversSide.cubeList.add(new ModelBox(railcoversSide, 44, 493, -4.622F, 3.2F, -13.475F, 1, 1, 16, -0.2F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.3535F, -0.5858F, 2.75F);
		railcoversSide.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 514, 539, 0.0F, -4.0F, -12.5F, 1, 3, 1, -0.25F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 494, 539, 0.0F, -4.0F, -17.0F, 1, 3, 1, -0.25F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 522, 539, 0.0F, -4.0F, -16.5F, 1, 3, 1, -0.25F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 518, 539, 0.0F, -4.0F, -14.5F, 1, 3, 1, -0.25F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 486, 539, 0.0F, -4.0F, -8.5F, 1, 3, 1, -0.25F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 490, 539, 0.0F, -4.0F, -10.5F, 1, 3, 1, -0.25F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 464, 539, 0.0F, -4.0F, -6.5F, 1, 3, 1, -0.25F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 418, 539, 0.0F, -4.0F, -4.5F, 1, 3, 1, -0.25F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 414, 539, 0.0F, -4.0F, -2.5F, 1, 3, 1, -0.25F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 112, 509, 0.0005F, -3.9F, -17.0F, 1, 1, 15, -0.25F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 500, 489, 0.0005F, -2.0F, -17.0F, 1, 1, 15, -0.25F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-3.3613F, -0.5858F, 2.75F);
		railcoversSide.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.7854F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 422, 535, 0.0F, -2.0F, -12.5F, 3, 1, 1, -0.25F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 394, 535, 0.0F, -2.0F, -17.0F, 3, 1, 1, -0.25F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 506, 535, 0.0F, -2.0F, -16.5F, 3, 1, 1, -0.25F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 498, 535, 0.0F, -2.0F, -14.5F, 3, 1, 1, -0.25F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 378, 535, 0.0F, -2.0F, -8.5F, 3, 1, 1, -0.25F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 386, 535, 0.0F, -2.0F, -10.5F, 3, 1, 1, -0.25F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 370, 535, 0.0F, -2.0F, -6.5F, 3, 1, 1, -0.25F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 362, 535, 0.0F, -2.0F, -4.5F, 3, 1, 1, -0.25F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 534, 324, 0.0F, -2.0F, -2.5F, 3, 1, 1, -0.25F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 506, 463, 1.9F, -2.0002F, -17.0F, 1, 1, 15, -0.25F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 500, 505, 0.0F, -2.0002F, -17.0F, 1, 1, 15, -0.25F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-1.9235F, -0.6536F, -9.3799F);
		railcoversSide.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.2182F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 196, 541, -2.4975F, 2.5F, -0.5F, 1, 2, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 82, 541, 1.9225F, 2.5F, -0.5F, 1, 2, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 16, 538, -2.7775F, -0.5F, -0.5F, 1, 4, 1, -0.2F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 12, 538, 2.2225F, -0.5F, -0.5F, 1, 4, 1, -0.2F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-1.9235F, -0.6536F, -11.3799F);
		railcoversSide.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.2182F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 200, 541, -2.4975F, 2.5F, -0.5F, 1, 2, 1, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 86, 541, 1.9225F, 2.5F, -0.5F, 1, 2, 1, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 538, 19, -2.7775F, -0.5F, -0.5F, 1, 4, 1, -0.2F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 538, 14, 2.2225F, -0.5F, -0.5F, 1, 4, 1, -0.2F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-1.4985F, -0.6536F, -13.3799F);
		railcoversSide.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.2182F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 98, 541, 1.4975F, 2.5F, -0.5F, 1, 2, 1, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 204, 541, -2.9225F, 2.5F, -0.5F, 1, 2, 1, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 106, 541, -3.2025F, 1.5F, -0.5F, 1, 2, 1, -0.2F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 102, 541, 1.7975F, 1.5F, -0.5F, 1, 2, 1, -0.2F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-1.4985F, -0.6536F, -5.3799F);
		railcoversSide.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.2182F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 66, 541, 1.4975F, 2.5F, -0.5F, 1, 2, 1, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 188, 541, -2.9225F, 2.5F, -0.5F, 1, 2, 1, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 482, 537, -3.2025F, -0.5F, -0.5F, 1, 4, 1, -0.2F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 470, 537, 1.7975F, -0.5F, -0.5F, 1, 4, 1, -0.2F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-1.9235F, -0.6536F, -7.3799F);
		railcoversSide.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.2182F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 192, 541, -2.4975F, 2.5F, -0.5F, 1, 2, 1, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 70, 541, 1.9225F, 2.5F, -0.5F, 1, 2, 1, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 498, 537, -2.7775F, -0.5F, -0.5F, 1, 4, 1, -0.2F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 474, 537, 2.2225F, -0.5F, -0.5F, 1, 4, 1, -0.2F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-1.9235F, -0.6536F, -3.3799F);
		railcoversSide.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.2182F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 184, 541, -2.4975F, 2.5F, -0.5F, 1, 2, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 62, 541, 1.9225F, 2.5F, -0.5F, 1, 2, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 478, 537, -2.7775F, -0.5F, -0.5F, 1, 4, 1, -0.2F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 398, 537, 2.2225F, -0.5F, -0.5F, 1, 4, 1, -0.2F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-1.9235F, -0.6536F, -1.3799F);
		railcoversSide.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.2182F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 180, 541, -2.4975F, 2.5F, -0.5F, 1, 2, 1, 0.0F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 8, 541, 1.9225F, 2.5F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-6.5985F, -0.6536F, 0.6201F);
		railcoversSide.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.2182F, 0.0F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 536, 143, 1.8975F, -0.5F, -0.5F, 1, 4, 1, -0.2F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 536, 107, 6.8975F, -0.5F, -0.5F, 1, 4, 1, -0.2F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-1.4985F, -0.4036F, 0.6201F);
		railcoversSide.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.2182F, 0.0F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 40, 518, 1.4975F, -1.0F, -0.5F, 1, 5, 1, 0.0F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 312, 534, -2.9225F, -0.8F, -0.5F, 1, 5, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		railcoversSide.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}