package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Tavor21BarrelSBR extends ModelBase {
	private final ModelRenderer barrelSBR;
	private final ModelRenderer Barrel_r1;
	private final ModelRenderer Barrel_r2;
	private final ModelRenderer Barrel_r3;
	private final ModelRenderer Barrel_r4;
	private final ModelRenderer flashider;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer mk12gasblock;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;

	public Tavor21BarrelSBR() {
		textureWidth = 432;
		textureHeight = 432;

		barrelSBR = new ModelRenderer(this);
		barrelSBR.setRotationPoint(-1.5F, -11.2429F, -39.501F);
		barrelSBR.cubeList.add(new ModelBox(barrelSBR, 248, 50, -0.5F, -0.2071F, 4.5F, 1, 1, 48, -0.1F, false));
		barrelSBR.cubeList.add(new ModelBox(barrelSBR, 294, 389, -0.5F, -3.6071F, 31.5F, 1, 1, 15, -0.2F, false));
		barrelSBR.cubeList.add(new ModelBox(barrelSBR, 248, 99, -1.0657F, 0.3586F, 4.5F, 1, 1, 48, -0.1F, false));
		barrelSBR.cubeList.add(new ModelBox(barrelSBR, 102, 248, 0.0657F, 0.3586F, 4.5F, 1, 1, 48, -0.1F, false));
		barrelSBR.cubeList.add(new ModelBox(barrelSBR, 102, 297, -0.5F, 0.9243F, 4.5F, 1, 1, 48, -0.1F, false));

		Barrel_r1 = new ModelRenderer(this);
		Barrel_r1.setRotationPoint(1.0142F, 2.6728F, 2.0F);
		barrelSBR.addChild(Barrel_r1);
		setRotationAngle(Barrel_r1, 0.0F, 0.0F, -0.7854F);
		Barrel_r1.cubeList.add(new ModelBox(Barrel_r1, 200, 297, -0.5F, -2.5F, 2.5F, 1, 1, 48, -0.1F, false));

		Barrel_r2 = new ModelRenderer(this);
		Barrel_r2.setRotationPoint(-1.0142F, -0.1556F, 2.0F);
		barrelSBR.addChild(Barrel_r2);
		setRotationAngle(Barrel_r2, 0.0F, 0.0F, -0.7854F);
		Barrel_r2.cubeList.add(new ModelBox(Barrel_r2, 200, 248, -0.5F, 1.5F, 2.5F, 1, 1, 48, -0.1F, false));

		Barrel_r3 = new ModelRenderer(this);
		Barrel_r3.setRotationPoint(1.0142F, 1.8728F, 2.0F);
		barrelSBR.addChild(Barrel_r3);
		setRotationAngle(Barrel_r3, 0.0F, 0.0F, -0.7854F);
		Barrel_r3.cubeList.add(new ModelBox(Barrel_r3, 248, 197, -0.5F, -2.5F, 2.5F, 1, 1, 48, -0.1F, false));

		Barrel_r4 = new ModelRenderer(this);
		Barrel_r4.setRotationPoint(-1.0142F, -0.9556F, 2.0F);
		barrelSBR.addChild(Barrel_r4);
		setRotationAngle(Barrel_r4, 0.0F, 0.0F, -0.7854F);
		Barrel_r4.cubeList.add(new ModelBox(Barrel_r4, 248, 148, -0.5F, 1.5F, 2.5F, 1, 1, 48, -0.1F, false));

		flashider = new ModelRenderer(this);
		flashider.setRotationPoint(-0.5F, 0.3F, -17.749F);
		barrelSBR.addChild(flashider);
		flashider.cubeList.add(new ModelBox(flashider, 256, 413, 0.0F, 0.7071F, 17.6F, 1, 1, 5, 0.0F, false));
		flashider.cubeList.add(new ModelBox(flashider, 296, 423, -0.7071F, 0.0F, 21.6F, 1, 1, 1, 0.0F, false));
		flashider.cubeList.add(new ModelBox(flashider, 300, 423, 0.0F, -0.7071F, 21.6F, 1, 1, 1, 0.0F, false));
		flashider.cubeList.add(new ModelBox(flashider, 304, 423, 0.7071F, 0.0F, 21.6F, 1, 1, 1, 0.0F, false));
		flashider.cubeList.add(new ModelBox(flashider, 308, 423, 0.7071F, 0.0F, 17.6F, 1, 1, 1, 0.0F, false));
		flashider.cubeList.add(new ModelBox(flashider, 312, 423, 0.0F, -0.7071F, 17.6F, 1, 1, 1, 0.0F, false));
		flashider.cubeList.add(new ModelBox(flashider, 316, 423, -0.7071F, 0.0F, 17.6F, 1, 1, 1, 0.0F, false));
		flashider.cubeList.add(new ModelBox(flashider, 424, 12, 0.0F, 0.7071F, 23.35F, 1, 1, 1, 0.0F, false));
		flashider.cubeList.add(new ModelBox(flashider, 424, 10, -0.7071F, 0.0F, 23.35F, 1, 1, 1, 0.0F, false));
		flashider.cubeList.add(new ModelBox(flashider, 424, 4, 0.0F, -0.7071F, 23.35F, 1, 1, 1, 0.0F, false));
		flashider.cubeList.add(new ModelBox(flashider, 4, 424, 0.7071F, 0.0F, 23.35F, 1, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.0F, 1.0F, 22.85F);
		flashider.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 424, 2, -0.5F, -0.5F, 0.5F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 42, 414, -0.5F, -0.5F, -5.25F, 1, 1, 5, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.0F, 0.0F, 22.85F);
		flashider.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 424, 6, -0.5F, -0.5F, 0.5F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 30, 414, -0.5F, -0.5F, -5.25F, 1, 1, 5, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 22.85F);
		flashider.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.7854F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 424, 8, -0.5F, -0.5F, 0.5F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 326, 413, -0.5F, -0.5F, -5.25F, 1, 1, 5, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 1.0F, 22.85F);
		flashider.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 424, 14, -0.5F, -0.5F, 0.5F, 1, 1, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 362, 412, -0.5F, -0.5F, -5.25F, 1, 1, 5, 0.0F, false));

		mk12gasblock = new ModelRenderer(this);
		mk12gasblock.setRotationPoint(1.5F, 37.8929F, 40.501F);
		barrelSBR.addChild(mk12gasblock);
		mk12gasblock.cubeList.add(new ModelBox(mk12gasblock, 420, 382, -1.2929F, -37.5929F, 4.0F, 1, 1, 2, 0.0F, false));
		mk12gasblock.cubeList.add(new ModelBox(mk12gasblock, 190, 419, -2.0F, -40.3F, 4.0F, 1, 3, 2, 0.0F, false));
		mk12gasblock.cubeList.add(new ModelBox(mk12gasblock, 12, 422, -2.7071F, -37.5929F, 4.0F, 1, 1, 2, 0.0F, false));
		mk12gasblock.cubeList.add(new ModelBox(mk12gasblock, 422, 16, -2.0F, -36.8858F, 4.0F, 1, 1, 2, 0.0F, false));
		mk12gasblock.cubeList.add(new ModelBox(mk12gasblock, 418, 415, -1.2929F, -37.5929F, -10.0F, 1, 1, 3, 0.0F, false));
		mk12gasblock.cubeList.add(new ModelBox(mk12gasblock, 418, 189, -2.0F, -39.3F, -10.0F, 1, 2, 3, 0.0F, false));
		mk12gasblock.cubeList.add(new ModelBox(mk12gasblock, 422, 19, -2.0F, -40.3F, -9.0F, 1, 1, 2, 0.0F, false));
		mk12gasblock.cubeList.add(new ModelBox(mk12gasblock, 182, 419, -2.5F, -42.0F, 4.0F, 2, 2, 2, 0.0F, false));
		mk12gasblock.cubeList.add(new ModelBox(mk12gasblock, 136, 419, -2.5F, -42.0F, -9.0F, 2, 2, 2, 0.0F, false));
		mk12gasblock.cubeList.add(new ModelBox(mk12gasblock, 362, 418, -2.7071F, -37.5929F, -10.0F, 1, 1, 3, 0.0F, false));
		mk12gasblock.cubeList.add(new ModelBox(mk12gasblock, 284, 418, -2.0F, -36.8858F, -10.0F, 1, 1, 3, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-2.0F, -36.5929F, -6.5F);
		mk12gasblock.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.7854F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 276, 418, -0.5F, -0.5F, -3.5F, 1, 1, 3, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 18, 422, -0.5F, -0.5F, 10.5F, 1, 1, 2, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-1.0F, -36.5929F, -6.5F);
		mk12gasblock.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 370, 418, -0.5F, -0.5F, -3.5F, 1, 1, 3, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 420, 395, -0.5F, -0.5F, 10.5F, 1, 1, 2, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-2.0F, -37.5929F, -6.5F);
		mk12gasblock.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 378, 418, -0.5F, -0.5F, -3.5F, 1, 1, 3, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 420, 392, -0.5F, -0.5F, 10.5F, 1, 1, 2, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-1.0F, -37.5929F, -6.5F);
		mk12gasblock.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 418, 411, -0.5F, -0.5F, -3.5F, 1, 1, 3, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 420, 385, -0.5F, -0.5F, 10.5F, 1, 1, 2, 0.0F, false));
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