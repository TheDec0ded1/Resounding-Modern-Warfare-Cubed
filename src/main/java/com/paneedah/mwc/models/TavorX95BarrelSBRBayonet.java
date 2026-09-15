package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class TavorX95BarrelSBRBayonet extends ModelBase {
	private final ModelRenderer barrelBayonetSBR;
	private final ModelRenderer cubexr1;
	private final ModelRenderer cubexr2;
	private final ModelRenderer cubexr3;
	private final ModelRenderer cubexr4;
	private final ModelRenderer flashider3;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer mk12gasblock3;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;

	public TavorX95BarrelSBRBayonet() {
		textureWidth = 560;
		textureHeight = 560;

		barrelBayonetSBR = new ModelRenderer(this);
		barrelBayonetSBR.setRotationPoint(-1.5F, -11.2429F, -39.501F);
		barrelBayonetSBR.cubeList.add(new ModelBox(barrelBayonetSBR, 0, 228, -0.5F, -0.2071F, -1.5F, 1, 1, 54, -0.1F, false));
		barrelBayonetSBR.cubeList.add(new ModelBox(barrelBayonetSBR, 44, 510, -0.5F, -3.6071F, 31.5F, 1, 1, 15, -0.2F, false));
		barrelBayonetSBR.cubeList.add(new ModelBox(barrelBayonetSBR, 228, 0, -1.0657F, 0.3586F, -1.5F, 1, 1, 54, -0.1F, false));
		barrelBayonetSBR.cubeList.add(new ModelBox(barrelBayonetSBR, 228, 55, 0.0657F, 0.3586F, -1.5F, 1, 1, 54, -0.1F, false));
		barrelBayonetSBR.cubeList.add(new ModelBox(barrelBayonetSBR, 220, 228, -0.5F, 0.9243F, -1.5F, 1, 1, 54, -0.1F, false));

		cubexr1 = new ModelRenderer(this);
		cubexr1.setRotationPoint(1.0142F, 2.6728F, 2.0F);
		barrelBayonetSBR.addChild(cubexr1);
		setRotationAngle(cubexr1, 0.0F, 0.0F, -0.7854F);
		cubexr1.cubeList.add(new ModelBox(cubexr1, 0, 283, -0.5F, -2.5F, -3.5F, 1, 1, 54, -0.1F, false));

		cubexr2 = new ModelRenderer(this);
		cubexr2.setRotationPoint(-1.0142F, -0.1556F, 2.0F);
		barrelBayonetSBR.addChild(cubexr2);
		setRotationAngle(cubexr2, 0.0F, 0.0F, -0.7854F);
		cubexr2.cubeList.add(new ModelBox(cubexr2, 228, 165, -0.5F, 1.5F, -3.5F, 1, 1, 54, -0.1F, false));

		cubexr3 = new ModelRenderer(this);
		cubexr3.setRotationPoint(1.0142F, 1.8728F, 2.0F);
		barrelBayonetSBR.addChild(cubexr3);
		setRotationAngle(cubexr3, 0.0F, 0.0F, -0.7854F);
		cubexr3.cubeList.add(new ModelBox(cubexr3, 228, 110, -0.5F, -2.5F, -3.5F, 1, 1, 54, -0.1F, false));

		cubexr4 = new ModelRenderer(this);
		cubexr4.setRotationPoint(-1.0142F, -0.9556F, 2.0F);
		barrelBayonetSBR.addChild(cubexr4);
		setRotationAngle(cubexr4, 0.0F, 0.0F, -0.7854F);
		cubexr4.cubeList.add(new ModelBox(cubexr4, 110, 228, -0.5F, 1.5F, -3.5F, 1, 1, 54, -0.1F, false));

		flashider3 = new ModelRenderer(this);
		flashider3.setRotationPoint(-0.5F, 0.3F, -17.749F);
		barrelBayonetSBR.addChild(flashider3);
		flashider3.cubeList.add(new ModelBox(flashider3, 76, 526, 0.0F, 0.7071F, 11.6F, 1, 1, 5, 0.0F, false));
		flashider3.cubeList.add(new ModelBox(flashider3, 284, 544, -0.7071F, 0.0F, 15.6F, 1, 1, 1, 0.0F, false));
		flashider3.cubeList.add(new ModelBox(flashider3, 544, 285, 0.0F, -0.7071F, 15.6F, 1, 1, 1, 0.0F, false));
		flashider3.cubeList.add(new ModelBox(flashider3, 544, 287, 0.7071F, 0.0F, 15.6F, 1, 1, 1, 0.0F, false));
		flashider3.cubeList.add(new ModelBox(flashider3, 288, 544, 0.7071F, 0.0F, 11.6F, 1, 1, 1, 0.0F, false));
		flashider3.cubeList.add(new ModelBox(flashider3, 292, 544, 0.0F, -0.7071F, 11.6F, 1, 1, 1, 0.0F, false));
		flashider3.cubeList.add(new ModelBox(flashider3, 544, 295, -0.7071F, 0.0F, 11.6F, 1, 1, 1, 0.0F, false));
		flashider3.cubeList.add(new ModelBox(flashider3, 534, 4, -0.5F, 0.3071F, 30.1F, 2, 2, 2, 0.0F, false));
		flashider3.cubeList.add(new ModelBox(flashider3, 538, 68, 0.7071F, 0.0F, 30.1F, 1, 1, 2, 0.0F, false));
		flashider3.cubeList.add(new ModelBox(flashider3, 538, 71, 0.0F, -0.7071F, 30.1F, 1, 1, 2, 0.0F, false));
		flashider3.cubeList.add(new ModelBox(flashider3, 74, 538, -0.7071F, 0.0F, 30.1F, 1, 1, 2, 0.0F, false));
		flashider3.cubeList.add(new ModelBox(flashider3, 544, 297, 0.0F, 0.7071F, 17.35F, 1, 1, 1, 0.0F, false));
		flashider3.cubeList.add(new ModelBox(flashider3, 544, 299, -0.7071F, 0.0F, 17.35F, 1, 1, 1, 0.0F, false));
		flashider3.cubeList.add(new ModelBox(flashider3, 308, 544, 0.0F, -0.7071F, 17.35F, 1, 1, 1, 0.0F, false));
		flashider3.cubeList.add(new ModelBox(flashider3, 312, 544, 0.7071F, 0.0F, 17.35F, 1, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.0F, 1.0F, 16.85F);
		flashider3.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 316, 544, -0.5F, -0.5F, 0.5F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 538, 74, -0.5F, -0.5F, 13.25F, 1, 1, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 88, 526, -0.5F, -0.5F, -5.25F, 1, 1, 5, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(1.0F, 0.0F, 16.85F);
		flashider3.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.7854F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 304, 544, -0.5F, -0.5F, 0.5F, 1, 1, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 68, 538, -0.5F, -0.5F, 13.25F, 1, 1, 2, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 526, 84, -0.5F, -0.5F, -5.25F, 1, 1, 5, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 0.0F, 16.85F);
		flashider3.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.7854F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 300, 544, -0.5F, -0.5F, 0.5F, 1, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 538, 65, -0.5F, -0.5F, 13.25F, 1, 1, 2, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 526, 78, -0.5F, -0.5F, -5.25F, 1, 1, 5, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, 1.0F, 16.85F);
		flashider3.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -0.7854F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 296, 544, -0.5F, -0.5F, 0.5F, 1, 1, 1, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 538, 62, -0.5F, -0.5F, 13.25F, 1, 1, 2, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 64, 526, -0.5F, -0.5F, -5.25F, 1, 1, 5, 0.0F, false));

		mk12gasblock3 = new ModelRenderer(this);
		mk12gasblock3.setRotationPoint(1.5F, 37.8929F, 40.501F);
		barrelBayonetSBR.addChild(mk12gasblock3);
		mk12gasblock3.cubeList.add(new ModelBox(mk12gasblock3, 538, 77, -1.2929F, -37.5929F, 4.0F, 1, 1, 2, 0.0F, false));
		mk12gasblock3.cubeList.add(new ModelBox(mk12gasblock3, 486, 534, -2.0F, -40.3F, 4.0F, 1, 3, 2, 0.0F, false));
		mk12gasblock3.cubeList.add(new ModelBox(mk12gasblock3, 86, 538, -2.7071F, -37.5929F, 4.0F, 1, 1, 2, 0.0F, false));
		mk12gasblock3.cubeList.add(new ModelBox(mk12gasblock3, 538, 86, -2.0F, -36.8858F, 4.0F, 1, 1, 2, 0.0F, false));
		mk12gasblock3.cubeList.add(new ModelBox(mk12gasblock3, 534, 112, -1.2929F, -37.5929F, -10.0F, 1, 1, 3, 0.0F, false));
		mk12gasblock3.cubeList.add(new ModelBox(mk12gasblock3, 530, 258, -2.0F, -39.3F, -10.0F, 1, 2, 3, 0.0F, false));
		mk12gasblock3.cubeList.add(new ModelBox(mk12gasblock3, 538, 92, -2.0F, -40.3F, -9.0F, 1, 1, 2, 0.0F, false));
		mk12gasblock3.cubeList.add(new ModelBox(mk12gasblock3, 534, 124, -2.5F, -42.0F, 4.0F, 2, 2, 2, 0.0F, false));
		mk12gasblock3.cubeList.add(new ModelBox(mk12gasblock3, 216, 534, -2.5F, -42.0F, -9.0F, 2, 2, 2, 0.0F, false));
		mk12gasblock3.cubeList.add(new ModelBox(mk12gasblock3, 534, 229, -2.7071F, -37.5929F, -10.0F, 1, 1, 3, 0.0F, false));
		mk12gasblock3.cubeList.add(new ModelBox(mk12gasblock3, 232, 534, -2.0F, -36.8858F, -10.0F, 1, 1, 3, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-2.0F, -36.5929F, -6.5F);
		mk12gasblock3.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.7854F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 534, 233, -0.5F, -0.5F, -3.5F, 1, 1, 3, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 538, 89, -0.5F, -0.5F, 10.5F, 1, 1, 2, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-1.0F, -36.5929F, -6.5F);
		mk12gasblock3.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -0.7854F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 224, 534, -0.5F, -0.5F, -3.5F, 1, 1, 3, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 538, 83, -0.5F, -0.5F, 10.5F, 1, 1, 2, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-2.0F, -37.5929F, -6.5F);
		mk12gasblock3.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, -0.7854F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 534, 120, -0.5F, -0.5F, -3.5F, 1, 1, 3, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 538, 80, -0.5F, -0.5F, 10.5F, 1, 1, 2, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-1.0F, -37.5929F, -6.5F);
		mk12gasblock3.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, -0.7854F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 534, 116, -0.5F, -0.5F, -3.5F, 1, 1, 3, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 80, 538, -0.5F, -0.5F, 10.5F, 1, 1, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		barrelBayonetSBR.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}