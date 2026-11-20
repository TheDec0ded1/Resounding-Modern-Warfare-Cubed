package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Tavor21BarrelAR extends ModelBase {
	private final ModelRenderer barrelAR;
	private final ModelRenderer Barrel_r1;
	private final ModelRenderer Barrel_r2;
	private final ModelRenderer Barrel_r3;
	private final ModelRenderer Barrel_r4;
	private final ModelRenderer flashider2;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer mk12gasblock2;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;

	public Tavor21BarrelAR() {
		textureWidth = 432;
		textureHeight = 432;

		barrelAR = new ModelRenderer(this);
		barrelAR.setRotationPoint(-1.5F, -11.2429F, -39.501F);
		barrelAR.cubeList.add(new ModelBox(barrelAR, 0, 0, -0.5F, -0.2071F, -8.5F, 1, 1, 61, -0.1F, false));
		barrelAR.cubeList.add(new ModelBox(barrelAR, 180, 390, -0.5F, -3.6071F, 31.5F, 1, 1, 15, -0.2F, false));
		barrelAR.cubeList.add(new ModelBox(barrelAR, 0, 62, -1.0657F, 0.3586F, -8.5F, 1, 1, 61, -0.1F, false));
		barrelAR.cubeList.add(new ModelBox(barrelAR, 0, 124, 0.0657F, 0.3586F, -8.5F, 1, 1, 61, -0.1F, false));
		barrelAR.cubeList.add(new ModelBox(barrelAR, 0, 186, -0.5F, 0.9243F, -8.5F, 1, 1, 61, -0.1F, false));

		Barrel_r1 = new ModelRenderer(this);
		Barrel_r1.setRotationPoint(1.0142F, 2.6728F, 2.0F);
		barrelAR.addChild(Barrel_r1);
		setRotationAngle(Barrel_r1, 0.0F, 0.0F, -0.7854F);
		Barrel_r1.cubeList.add(new ModelBox(Barrel_r1, 124, 186, -0.5F, -2.5F, -10.5F, 1, 1, 61, -0.1F, false));

		Barrel_r2 = new ModelRenderer(this);
		Barrel_r2.setRotationPoint(-1.0142F, -0.1556F, 2.0F);
		barrelAR.addChild(Barrel_r2);
		setRotationAngle(Barrel_r2, 0.0F, 0.0F, -0.7854F);
		Barrel_r2.cubeList.add(new ModelBox(Barrel_r2, 124, 124, -0.5F, 1.5F, -10.5F, 1, 1, 61, -0.1F, false));

		Barrel_r3 = new ModelRenderer(this);
		Barrel_r3.setRotationPoint(1.0142F, 1.8728F, 2.0F);
		barrelAR.addChild(Barrel_r3);
		setRotationAngle(Barrel_r3, 0.0F, 0.0F, -0.7854F);
		Barrel_r3.cubeList.add(new ModelBox(Barrel_r3, 124, 62, -0.5F, -2.5F, -10.5F, 1, 1, 61, -0.1F, false));

		Barrel_r4 = new ModelRenderer(this);
		Barrel_r4.setRotationPoint(-1.0142F, -0.9556F, 2.0F);
		barrelAR.addChild(Barrel_r4);
		setRotationAngle(Barrel_r4, 0.0F, 0.0F, -0.7854F);
		Barrel_r4.cubeList.add(new ModelBox(Barrel_r4, 124, 0, -0.5F, 1.5F, -10.5F, 1, 1, 61, -0.1F, false));

		flashider2 = new ModelRenderer(this);
		flashider2.setRotationPoint(-0.5F, 0.3F, -17.749F);
		barrelAR.addChild(flashider2);
		flashider2.cubeList.add(new ModelBox(flashider2, 112, 414, 0.0F, 0.7071F, 4.6F, 1, 1, 5, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 98, 424, -0.7071F, 0.0F, 8.6F, 1, 1, 1, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 102, 424, 0.0F, -0.7071F, 8.6F, 1, 1, 1, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 106, 424, 0.7071F, 0.0F, 8.6F, 1, 1, 1, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 424, 107, 0.7071F, 0.0F, 4.6F, 1, 1, 1, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 424, 109, 0.0F, -0.7071F, 4.6F, 1, 1, 1, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 110, 424, -0.7071F, 0.0F, 4.6F, 1, 1, 1, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 96, 420, -0.5F, 0.3071F, 23.1F, 2, 2, 2, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 82, 422, 0.7071F, 0.0F, 23.1F, 1, 1, 2, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 422, 81, 0.0F, -0.7071F, 23.1F, 1, 1, 2, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 422, 78, -0.7071F, 0.0F, 23.1F, 1, 1, 2, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 118, 424, 0.0F, 0.7071F, 10.35F, 1, 1, 1, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 122, 424, -0.7071F, 0.0F, 10.35F, 1, 1, 1, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 144, 424, 0.0F, -0.7071F, 10.35F, 1, 1, 1, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 148, 424, 0.7071F, 0.0F, 10.35F, 1, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.0F, 1.0F, 9.85F);
		flashider2.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 166, 424, -0.5F, -0.5F, 0.5F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 76, 422, -0.5F, -0.5F, 13.25F, 1, 1, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 232, 414, -0.5F, -0.5F, -5.25F, 1, 1, 5, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.0F, 0.0F, 9.85F);
		flashider2.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 130, 424, -0.5F, -0.5F, 0.5F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 422, 84, -0.5F, -0.5F, 13.25F, 1, 1, 2, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 220, 414, -0.5F, -0.5F, -5.25F, 1, 1, 5, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 9.85F);
		flashider2.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.7854F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 126, 424, -0.5F, -0.5F, 0.5F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 422, 87, -0.5F, -0.5F, 13.25F, 1, 1, 2, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 124, 414, -0.5F, -0.5F, -5.25F, 1, 1, 5, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 1.0F, 9.85F);
		flashider2.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 114, 424, -0.5F, -0.5F, 0.5F, 1, 1, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 88, 422, -0.5F, -0.5F, 13.25F, 1, 1, 2, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 100, 414, -0.5F, -0.5F, -5.25F, 1, 1, 5, 0.0F, false));

		mk12gasblock2 = new ModelRenderer(this);
		mk12gasblock2.setRotationPoint(1.5F, 37.8929F, 40.501F);
		barrelAR.addChild(mk12gasblock2);
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 422, 25, -1.2929F, -37.5929F, 4.0F, 1, 1, 2, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 420, 155, -2.0F, -40.3F, 4.0F, 1, 3, 2, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 422, 37, -2.7071F, -37.5929F, 4.0F, 1, 1, 2, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 422, 40, -2.0F, -36.8858F, 4.0F, 1, 1, 2, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 292, 419, -1.2929F, -37.5929F, -10.0F, 1, 1, 3, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 418, 194, -2.0F, -39.3F, -10.0F, 1, 2, 3, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 422, 46, -2.0F, -40.3F, -9.0F, 1, 1, 2, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 418, 419, -2.5F, -42.0F, 4.0F, 2, 2, 2, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 0, 420, -2.5F, -42.0F, -9.0F, 2, 2, 2, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 38, 420, -2.7071F, -37.5929F, -10.0F, 1, 1, 3, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 46, 420, -2.0F, -36.8858F, -10.0F, 1, 1, 3, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-2.0F, -36.5929F, -6.5F);
		mk12gasblock2.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.7854F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 54, 420, -0.5F, -0.5F, -3.5F, 1, 1, 3, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 422, 43, -0.5F, -0.5F, 10.5F, 1, 1, 2, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-1.0F, -36.5929F, -6.5F);
		mk12gasblock2.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 30, 420, -0.5F, -0.5F, -3.5F, 1, 1, 3, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 422, 34, -0.5F, -0.5F, 10.5F, 1, 1, 2, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-2.0F, -37.5929F, -6.5F);
		mk12gasblock2.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 326, 419, -0.5F, -0.5F, -3.5F, 1, 1, 3, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 422, 31, -0.5F, -0.5F, 10.5F, 1, 1, 2, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-1.0F, -37.5929F, -6.5F);
		mk12gasblock2.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 300, 419, -0.5F, -0.5F, -3.5F, 1, 1, 3, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 422, 28, -0.5F, -0.5F, 10.5F, 1, 1, 2, 0.0F, false));
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