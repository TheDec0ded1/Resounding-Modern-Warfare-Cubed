package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class TavorX95BarrelCarbine extends ModelBase {
	private final ModelRenderer barrelCarbine;
	private final ModelRenderer cubexr1;
	private final ModelRenderer cubexr2;
	private final ModelRenderer cubexr3;
	private final ModelRenderer cubexr4;
	private final ModelRenderer flashider;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer mk12gasblock;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;

	public TavorX95BarrelCarbine() {
		textureWidth = 560;
		textureHeight = 560;

		barrelCarbine = new ModelRenderer(this);
		barrelCarbine.setRotationPoint(-1.5F, -11.2429F, -39.501F);
		barrelCarbine.cubeList.add(new ModelBox(barrelCarbine, 312, 283, -0.5F, -0.2071F, 6.5F, 1, 1, 47, -0.1F, false));
		barrelCarbine.cubeList.add(new ModelBox(barrelCarbine, 496, 95, -0.5F, -3.6071F, 32.5F, 1, 1, 15, -0.2F, false));
		barrelCarbine.cubeList.add(new ModelBox(barrelCarbine, 330, 220, -1.0657F, 0.3586F, 6.5F, 1, 1, 47, -0.1F, false));
		barrelCarbine.cubeList.add(new ModelBox(barrelCarbine, 312, 331, 0.0657F, 0.3586F, 6.5F, 1, 1, 47, -0.1F, false));
		barrelCarbine.cubeList.add(new ModelBox(barrelCarbine, 338, 0, -0.5F, 0.9243F, 6.5F, 1, 1, 47, -0.1F, false));

		cubexr1 = new ModelRenderer(this);
		cubexr1.setRotationPoint(1.0142F, 2.6728F, 3.0F);
		barrelCarbine.addChild(cubexr1);
		setRotationAngle(cubexr1, 0.0F, 0.0F, -0.7854F);
		cubexr1.cubeList.add(new ModelBox(cubexr1, 338, 48, -0.5F, -2.5F, 3.5F, 1, 1, 47, -0.1F, false));

		cubexr2 = new ModelRenderer(this);
		cubexr2.setRotationPoint(-1.0142F, -0.1556F, 3.0F);
		barrelCarbine.addChild(cubexr2);
		setRotationAngle(cubexr2, 0.0F, 0.0F, -0.7854F);
		cubexr2.cubeList.add(new ModelBox(cubexr2, 0, 338, -0.5F, 1.5F, 3.5F, 1, 1, 47, -0.1F, false));

		cubexr3 = new ModelRenderer(this);
		cubexr3.setRotationPoint(1.0142F, 1.8728F, 3.0F);
		barrelCarbine.addChild(cubexr3);
		setRotationAngle(cubexr3, 0.0F, 0.0F, -0.7854F);
		cubexr3.cubeList.add(new ModelBox(cubexr3, 206, 334, -0.5F, -2.5F, 3.5F, 1, 1, 47, -0.1F, false));

		cubexr4 = new ModelRenderer(this);
		cubexr4.setRotationPoint(-1.0142F, -0.9556F, 3.0F);
		barrelCarbine.addChild(cubexr4);
		setRotationAngle(cubexr4, 0.0F, 0.0F, -0.7854F);
		cubexr4.cubeList.add(new ModelBox(cubexr4, 110, 334, -0.5F, 1.5F, 3.5F, 1, 1, 47, -0.1F, false));

		flashider = new ModelRenderer(this);
		flashider.setRotationPoint(-0.5F, 0.3F, -17.749F);
		barrelCarbine.addChild(flashider);
		flashider.cubeList.add(new ModelBox(flashider, 524, 395, 0.0F, 0.7071F, 19.6F, 1, 1, 5, 0.0F, false));
		flashider.cubeList.add(new ModelBox(flashider, 542, 18, -0.7071F, 0.0F, 23.6F, 1, 1, 1, 0.0F, false));
		flashider.cubeList.add(new ModelBox(flashider, 542, 20, 0.0F, -0.7071F, 23.6F, 1, 1, 1, 0.0F, false));
		flashider.cubeList.add(new ModelBox(flashider, 542, 22, 0.7071F, 0.0F, 23.6F, 1, 1, 1, 0.0F, false));
		flashider.cubeList.add(new ModelBox(flashider, 542, 24, 0.7071F, 0.0F, 19.6F, 1, 1, 1, 0.0F, false));
		flashider.cubeList.add(new ModelBox(flashider, 542, 26, 0.0F, -0.7071F, 19.6F, 1, 1, 1, 0.0F, false));
		flashider.cubeList.add(new ModelBox(flashider, 542, 30, -0.7071F, 0.0F, 19.6F, 1, 1, 1, 0.0F, false));
		flashider.cubeList.add(new ModelBox(flashider, 542, 111, 0.0F, 0.7071F, 25.35F, 1, 1, 1, 0.0F, false));
		flashider.cubeList.add(new ModelBox(flashider, 110, 542, -0.7071F, 0.0F, 25.35F, 1, 1, 1, 0.0F, false));
		flashider.cubeList.add(new ModelBox(flashider, 52, 542, 0.0F, -0.7071F, 25.35F, 1, 1, 1, 0.0F, false));
		flashider.cubeList.add(new ModelBox(flashider, 542, 42, 0.7071F, 0.0F, 25.35F, 1, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.0F, 1.0F, 24.85F);
		flashider.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 542, 40, -0.5F, -0.5F, 0.5F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 350, 525, -0.5F, -0.5F, -5.25F, 1, 1, 5, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(1.0F, 0.0F, 24.85F);
		flashider.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.7854F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 90, 542, -0.5F, -0.5F, 0.5F, 1, 1, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 338, 525, -0.5F, -0.5F, -5.25F, 1, 1, 5, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 0.0F, 24.85F);
		flashider.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.7854F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 94, 542, -0.5F, -0.5F, 0.5F, 1, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 326, 525, -0.5F, -0.5F, -5.25F, 1, 1, 5, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, 1.0F, 24.85F);
		flashider.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -0.7854F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 542, 113, -0.5F, -0.5F, 0.5F, 1, 1, 1, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 84, 421, -0.5F, -0.5F, -5.25F, 1, 1, 5, 0.0F, false));

		mk12gasblock = new ModelRenderer(this);
		mk12gasblock.setRotationPoint(1.5F, 37.8929F, 40.501F);
		barrelCarbine.addChild(mk12gasblock);
		mk12gasblock.cubeList.add(new ModelBox(mk12gasblock, 536, 321, -1.2929F, -37.5929F, 5.0F, 1, 1, 2, 0.0F, false));
		mk12gasblock.cubeList.add(new ModelBox(mk12gasblock, 94, 532, -2.0F, -40.3F, 5.0F, 1, 3, 2, 0.0F, false));
		mk12gasblock.cubeList.add(new ModelBox(mk12gasblock, 94, 537, -2.7071F, -37.5929F, 5.0F, 1, 1, 2, 0.0F, false));
		mk12gasblock.cubeList.add(new ModelBox(mk12gasblock, 304, 537, -2.0F, -36.8858F, 5.0F, 1, 1, 2, 0.0F, false));
		mk12gasblock.cubeList.add(new ModelBox(mk12gasblock, 416, 531, -1.2929F, -37.5929F, -9.0F, 1, 1, 3, 0.0F, false));
		mk12gasblock.cubeList.add(new ModelBox(mk12gasblock, 530, 14, -2.0F, -39.3F, -9.0F, 1, 2, 3, 0.0F, false));
		mk12gasblock.cubeList.add(new ModelBox(mk12gasblock, 322, 537, -2.0F, -40.3F, -8.0F, 1, 1, 2, 0.0F, false));
		mk12gasblock.cubeList.add(new ModelBox(mk12gasblock, 0, 532, -2.5F, -42.0F, 5.0F, 2, 2, 2, 0.0F, false));
		mk12gasblock.cubeList.add(new ModelBox(mk12gasblock, 424, 531, -2.5F, -42.0F, -8.0F, 2, 2, 2, 0.0F, false));
		mk12gasblock.cubeList.add(new ModelBox(mk12gasblock, 372, 531, -2.7071F, -37.5929F, -9.0F, 1, 1, 3, 0.0F, false));
		mk12gasblock.cubeList.add(new ModelBox(mk12gasblock, 364, 531, -2.0F, -36.8858F, -9.0F, 1, 1, 3, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-2.0F, -36.5929F, -5.5F);
		mk12gasblock.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.7854F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 356, 531, -0.5F, -0.5F, -3.5F, 1, 1, 3, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 316, 537, -0.5F, -0.5F, 10.5F, 1, 1, 2, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-1.0F, -36.5929F, -5.5F);
		mk12gasblock.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -0.7854F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 380, 531, -0.5F, -0.5F, -3.5F, 1, 1, 3, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 402, 536, -0.5F, -0.5F, 10.5F, 1, 1, 2, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-2.0F, -37.5929F, -5.5F);
		mk12gasblock.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, -0.7854F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 388, 531, -0.5F, -0.5F, -3.5F, 1, 1, 3, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 536, 398, -0.5F, -0.5F, 10.5F, 1, 1, 2, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-1.0F, -37.5929F, -5.5F);
		mk12gasblock.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, -0.7854F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 396, 531, -0.5F, -0.5F, -3.5F, 1, 1, 3, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 536, 395, -0.5F, -0.5F, 10.5F, 1, 1, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		barrelCarbine.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}