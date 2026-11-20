package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class TavorX95BarrelSBR extends ModelBase {
	private final ModelRenderer barrelSBR;
	private final ModelRenderer cubexr1;
	private final ModelRenderer cubexr2;
	private final ModelRenderer cubexr3;
	private final ModelRenderer cubexr4;
	private final ModelRenderer flashider4;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer mk12gasblock4;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;

	public TavorX95BarrelSBR() {
		textureWidth = 560;
		textureHeight = 560;

		barrelSBR = new ModelRenderer(this);
		barrelSBR.setRotationPoint(-1.5F, -11.2429F, -39.501F);
		barrelSBR.cubeList.add(new ModelBox(barrelSBR, 392, 379, -0.5F, -0.2071F, 12.5F, 1, 1, 41, -0.1F, false));
		barrelSBR.cubeList.add(new ModelBox(barrelSBR, 76, 510, -0.5F, -3.6071F, 32.5F, 1, 1, 15, -0.2F, false));
		barrelSBR.cubeList.add(new ModelBox(barrelSBR, 408, 268, -1.0657F, 0.3586F, 12.5F, 1, 1, 41, -0.1F, false));
		barrelSBR.cubeList.add(new ModelBox(barrelSBR, 408, 310, 0.0657F, 0.3586F, 12.5F, 1, 1, 41, -0.1F, false));
		barrelSBR.cubeList.add(new ModelBox(barrelSBR, 426, 190, -0.5F, 0.9243F, 12.5F, 1, 1, 41, -0.1F, false));

		cubexr1 = new ModelRenderer(this);
		cubexr1.setRotationPoint(1.0142F, 2.6728F, 3.0F);
		barrelSBR.addChild(cubexr1);
		setRotationAngle(cubexr1, 0.0F, 0.0F, -0.7854F);
		cubexr1.cubeList.add(new ModelBox(cubexr1, 84, 427, -0.5F, -2.5F, 9.5F, 1, 1, 41, -0.1F, false));

		cubexr2 = new ModelRenderer(this);
		cubexr2.setRotationPoint(-1.0142F, -0.1556F, 3.0F);
		barrelSBR.addChild(cubexr2);
		setRotationAngle(cubexr2, 0.0F, 0.0F, -0.7854F);
		cubexr2.cubeList.add(new ModelBox(cubexr2, 268, 424, -0.5F, 1.5F, 9.5F, 1, 1, 41, -0.1F, false));

		cubexr3 = new ModelRenderer(this);
		cubexr3.setRotationPoint(1.0142F, 1.8728F, 3.0F);
		barrelSBR.addChild(cubexr3);
		setRotationAngle(cubexr3, 0.0F, 0.0F, -0.7854F);
		cubexr3.cubeList.add(new ModelBox(cubexr3, 184, 424, -0.5F, -2.5F, 9.5F, 1, 1, 41, -0.1F, false));

		cubexr4 = new ModelRenderer(this);
		cubexr4.setRotationPoint(-1.0142F, -0.9556F, 3.0F);
		barrelSBR.addChild(cubexr4);
		setRotationAngle(cubexr4, 0.0F, 0.0F, -0.7854F);
		cubexr4.cubeList.add(new ModelBox(cubexr4, 392, 421, -0.5F, 1.5F, 9.5F, 1, 1, 41, -0.1F, false));

		flashider4 = new ModelRenderer(this);
		flashider4.setRotationPoint(-0.5F, 0.3F, -17.749F);
		barrelSBR.addChild(flashider4);
		flashider4.cubeList.add(new ModelBox(flashider4, 526, 178, 0.0F, 0.7071F, 25.6F, 1, 1, 5, 0.0F, false));
		flashider4.cubeList.add(new ModelBox(flashider4, 320, 544, -0.7071F, 0.0F, 29.6F, 1, 1, 1, 0.0F, false));
		flashider4.cubeList.add(new ModelBox(flashider4, 324, 544, 0.0F, -0.7071F, 29.6F, 1, 1, 1, 0.0F, false));
		flashider4.cubeList.add(new ModelBox(flashider4, 328, 544, 0.7071F, 0.0F, 29.6F, 1, 1, 1, 0.0F, false));
		flashider4.cubeList.add(new ModelBox(flashider4, 332, 544, 0.7071F, 0.0F, 25.6F, 1, 1, 1, 0.0F, false));
		flashider4.cubeList.add(new ModelBox(flashider4, 336, 544, 0.0F, -0.7071F, 25.6F, 1, 1, 1, 0.0F, false));
		flashider4.cubeList.add(new ModelBox(flashider4, 340, 544, -0.7071F, 0.0F, 25.6F, 1, 1, 1, 0.0F, false));
		flashider4.cubeList.add(new ModelBox(flashider4, 348, 544, 0.0F, 0.7071F, 31.35F, 1, 1, 1, 0.0F, false));
		flashider4.cubeList.add(new ModelBox(flashider4, 352, 544, -0.7071F, 0.0F, 31.35F, 1, 1, 1, 0.0F, false));
		flashider4.cubeList.add(new ModelBox(flashider4, 364, 544, 0.0F, -0.7071F, 31.35F, 1, 1, 1, 0.0F, false));
		flashider4.cubeList.add(new ModelBox(flashider4, 368, 544, 0.7071F, 0.0F, 31.35F, 1, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.0F, 1.0F, 30.85F);
		flashider4.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 372, 544, -0.5F, -0.5F, 0.5F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 526, 284, -0.5F, -0.5F, -5.25F, 1, 1, 5, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(1.0F, 0.0F, 30.85F);
		flashider4.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.7854F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 360, 544, -0.5F, -0.5F, 0.5F, 1, 1, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 526, 278, -0.5F, -0.5F, -5.25F, 1, 1, 5, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 0.0F, 30.85F);
		flashider4.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.7854F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 356, 544, -0.5F, -0.5F, 0.5F, 1, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 526, 272, -0.5F, -0.5F, -5.25F, 1, 1, 5, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, 1.0F, 30.85F);
		flashider4.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -0.7854F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 344, 544, -0.5F, -0.5F, 0.5F, 1, 1, 1, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 526, 172, -0.5F, -0.5F, -5.25F, 1, 1, 5, 0.0F, false));

		mk12gasblock4 = new ModelRenderer(this);
		mk12gasblock4.setRotationPoint(1.5F, 37.8929F, 40.501F);
		barrelSBR.addChild(mk12gasblock4);
		mk12gasblock4.cubeList.add(new ModelBox(mk12gasblock4, 538, 95, -1.2929F, -37.5929F, 5.0F, 1, 1, 2, 0.0F, false));
		mk12gasblock4.cubeList.add(new ModelBox(mk12gasblock4, 492, 534, -2.0F, -40.3F, 5.0F, 1, 3, 2, 0.0F, false));
		mk12gasblock4.cubeList.add(new ModelBox(mk12gasblock4, 106, 538, -2.7071F, -37.5929F, 5.0F, 1, 1, 2, 0.0F, false));
		mk12gasblock4.cubeList.add(new ModelBox(mk12gasblock4, 538, 136, -2.0F, -36.8858F, 5.0F, 1, 1, 2, 0.0F, false));
		mk12gasblock4.cubeList.add(new ModelBox(mk12gasblock4, 534, 237, -1.2929F, -37.5929F, -9.0F, 1, 1, 3, 0.0F, false));
		mk12gasblock4.cubeList.add(new ModelBox(mk12gasblock4, 530, 263, -2.0F, -39.3F, -9.0F, 1, 2, 3, 0.0F, false));
		mk12gasblock4.cubeList.add(new ModelBox(mk12gasblock4, 538, 170, -2.0F, -40.3F, -8.0F, 1, 1, 2, 0.0F, false));
		mk12gasblock4.cubeList.add(new ModelBox(mk12gasblock4, 534, 245, -2.5F, -42.0F, 5.0F, 2, 2, 2, 0.0F, false));
		mk12gasblock4.cubeList.add(new ModelBox(mk12gasblock4, 248, 534, -2.5F, -42.0F, -8.0F, 2, 2, 2, 0.0F, false));
		mk12gasblock4.cubeList.add(new ModelBox(mk12gasblock4, 256, 534, -2.7071F, -37.5929F, -9.0F, 1, 1, 3, 0.0F, false));
		mk12gasblock4.cubeList.add(new ModelBox(mk12gasblock4, 264, 534, -2.0F, -36.8858F, -9.0F, 1, 1, 3, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-2.0F, -36.5929F, -5.5F);
		mk12gasblock4.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.7854F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 272, 534, -0.5F, -0.5F, -3.5F, 1, 1, 3, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 538, 139, -0.5F, -0.5F, 10.5F, 1, 1, 2, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-1.0F, -36.5929F, -5.5F);
		mk12gasblock4.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -0.7854F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 534, 249, -0.5F, -0.5F, -3.5F, 1, 1, 3, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 538, 101, -0.5F, -0.5F, 10.5F, 1, 1, 2, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-2.0F, -37.5929F, -5.5F);
		mk12gasblock4.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, -0.7854F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 534, 241, -0.5F, -0.5F, -3.5F, 1, 1, 3, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 100, 538, -0.5F, -0.5F, 10.5F, 1, 1, 2, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-1.0F, -37.5929F, -5.5F);
		mk12gasblock4.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, -0.7854F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 240, 534, -0.5F, -0.5F, -3.5F, 1, 1, 3, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 538, 98, -0.5F, -0.5F, 10.5F, 1, 1, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		barrelSBR.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}