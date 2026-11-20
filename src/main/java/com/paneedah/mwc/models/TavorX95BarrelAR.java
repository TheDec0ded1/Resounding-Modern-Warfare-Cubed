package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class TavorX95BarrelAR extends ModelBase {
	private final ModelRenderer barrelAR;
	private final ModelRenderer a606_r1;
	private final ModelRenderer a606_r2;
	private final ModelRenderer a606_r3;
	private final ModelRenderer a606_r4;
	private final ModelRenderer flashider2;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer mk12gasblock2;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;

	public TavorX95BarrelAR() {
		textureWidth = 560;
		textureHeight = 560;

		barrelAR = new ModelRenderer(this);
		barrelAR.setRotationPoint(-1.5F, -11.2429F, -39.501F);
		barrelAR.cubeList.add(new ModelBox(barrelAR, 0, 0, -0.5F, -0.2071F, -2.5F, 1, 1, 56, -0.1F, false));
		barrelAR.cubeList.add(new ModelBox(barrelAR, 380, 509, -0.5F, -3.6071F, 32.5F, 1, 1, 15, -0.2F, false));
		barrelAR.cubeList.add(new ModelBox(barrelAR, 0, 57, -1.0657F, 0.3586F, -2.5F, 1, 1, 56, -0.1F, false));
		barrelAR.cubeList.add(new ModelBox(barrelAR, 0, 114, 0.0657F, 0.3586F, -2.5F, 1, 1, 56, -0.1F, false));
		barrelAR.cubeList.add(new ModelBox(barrelAR, 0, 171, -0.5F, 0.9243F, -2.5F, 1, 1, 56, -0.1F, false));

		a606_r1 = new ModelRenderer(this);
		a606_r1.setRotationPoint(1.0142F, 2.6728F, 3.0F);
		barrelAR.addChild(a606_r1);
		setRotationAngle(a606_r1, 0.0F, 0.0F, -0.7854F);
		a606_r1.cubeList.add(new ModelBox(a606_r1, 114, 171, -0.5F, -2.5F, -5.5F, 1, 1, 56, -0.1F, false));

		a606_r2 = new ModelRenderer(this);
		a606_r2.setRotationPoint(-1.0142F, -0.1556F, 3.0F);
		barrelAR.addChild(a606_r2);
		setRotationAngle(a606_r2, 0.0F, 0.0F, -0.7854F);
		a606_r2.cubeList.add(new ModelBox(a606_r2, 114, 114, -0.5F, 1.5F, -5.5F, 1, 1, 56, -0.1F, false));

		a606_r3 = new ModelRenderer(this);
		a606_r3.setRotationPoint(1.0142F, 1.8728F, 3.0F);
		barrelAR.addChild(a606_r3);
		setRotationAngle(a606_r3, 0.0F, 0.0F, -0.7854F);
		a606_r3.cubeList.add(new ModelBox(a606_r3, 114, 57, -0.5F, -2.5F, -5.5F, 1, 1, 56, -0.1F, false));

		a606_r4 = new ModelRenderer(this);
		a606_r4.setRotationPoint(-1.0142F, -0.9556F, 3.0F);
		barrelAR.addChild(a606_r4);
		setRotationAngle(a606_r4, 0.0F, 0.0F, -0.7854F);
		a606_r4.cubeList.add(new ModelBox(a606_r4, 114, 0, -0.5F, 1.5F, -5.5F, 1, 1, 56, -0.1F, false));

		flashider2 = new ModelRenderer(this);
		flashider2.setRotationPoint(-0.5F, 0.3F, -17.749F);
		barrelAR.addChild(flashider2);
		flashider2.cubeList.add(new ModelBox(flashider2, 386, 525, 0.0F, 0.7071F, 10.6F, 1, 1, 5, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 534, 543, -0.7071F, 0.0F, 14.6F, 1, 1, 1, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 538, 543, 0.0F, -0.7071F, 14.6F, 1, 1, 1, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 542, 543, 0.7071F, 0.0F, 14.6F, 1, 1, 1, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 0, 544, 0.7071F, 0.0F, 10.6F, 1, 1, 1, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 4, 544, 0.0F, -0.7071F, 10.6F, 1, 1, 1, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 8, 544, -0.7071F, 0.0F, 10.6F, 1, 1, 1, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 544, 10, 0.0F, 0.7071F, 16.35F, 1, 1, 1, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 544, 12, -0.7071F, 0.0F, 16.35F, 1, 1, 1, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 36, 544, 0.0F, -0.7071F, 16.35F, 1, 1, 1, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 40, 544, 0.7071F, 0.0F, 16.35F, 1, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.0F, 1.0F, 15.85F);
		flashider2.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 44, 544, -0.5F, -0.5F, 0.5F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 526, -0.5F, -0.5F, -5.25F, 1, 1, 5, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(1.0F, 0.0F, 15.85F);
		flashider2.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.7854F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 32, 544, -0.5F, -0.5F, 0.5F, 1, 1, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 526, -0.5F, -0.5F, -5.25F, 1, 1, 5, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 0.0F, 15.85F);
		flashider2.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.7854F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 544, 28, -0.5F, -0.5F, 0.5F, 1, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 398, 525, -0.5F, -0.5F, -5.25F, 1, 1, 5, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, 1.0F, 15.85F);
		flashider2.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -0.7854F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 544, 8, -0.5F, -0.5F, 0.5F, 1, 1, 1, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 374, 525, -0.5F, -0.5F, -5.25F, 1, 1, 5, 0.0F, false));

		mk12gasblock2 = new ModelRenderer(this);
		mk12gasblock2.setRotationPoint(1.5F, 37.8929F, 40.501F);
		barrelAR.addChild(mk12gasblock2);
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 502, 537, -1.2929F, -37.5929F, 5.0F, 1, 1, 2, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 464, 534, -2.0F, -40.3F, 5.0F, 1, 3, 2, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 0, 538, -2.7071F, -37.5929F, 5.0F, 1, 1, 2, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 6, 538, -2.0F, -36.8858F, 5.0F, 1, 1, 2, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 532, 225, -1.2929F, -37.5929F, -9.0F, 1, 1, 3, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 530, 54, -2.0F, -39.3F, -9.0F, 1, 2, 3, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 538, 11, -2.0F, -40.3F, -8.0F, 1, 1, 2, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 532, 479, -2.5F, -42.0F, 5.0F, 2, 2, 2, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 532, 483, -2.5F, -42.0F, -8.0F, 2, 2, 2, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 532, 491, -2.7071F, -37.5929F, -9.0F, 1, 1, 3, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 532, 495, -2.0F, -36.8858F, -9.0F, 1, 1, 3, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-2.0F, -36.5929F, -5.5F);
		mk12gasblock2.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.7854F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 532, 499, -0.5F, -0.5F, -3.5F, 1, 1, 3, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 538, 8, -0.5F, -0.5F, 10.5F, 1, 1, 2, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-1.0F, -36.5929F, -5.5F);
		mk12gasblock2.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -0.7854F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 532, 487, -0.5F, -0.5F, -3.5F, 1, 1, 3, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 532, 537, -0.5F, -0.5F, 10.5F, 1, 1, 2, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-2.0F, -37.5929F, -5.5F);
		mk12gasblock2.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, -0.7854F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 532, 306, -0.5F, -0.5F, -3.5F, 1, 1, 3, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 526, 537, -0.5F, -0.5F, 10.5F, 1, 1, 2, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-1.0F, -37.5929F, -5.5F);
		mk12gasblock2.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, -0.7854F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 532, 302, -0.5F, -0.5F, -3.5F, 1, 1, 3, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 508, 537, -0.5F, -0.5F, 10.5F, 1, 1, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		barrelAR.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}