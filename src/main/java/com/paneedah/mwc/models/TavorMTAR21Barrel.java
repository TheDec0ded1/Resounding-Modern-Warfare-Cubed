package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class TavorMTAR21Barrel extends ModelBase {
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

	public TavorMTAR21Barrel() {
		textureWidth = 320;
		textureHeight = 320;

		barrelSBR = new ModelRenderer(this);
		barrelSBR.setRotationPoint(-1.5F, -11.2429F, -39.501F);
		barrelSBR.cubeList.add(new ModelBox(barrelSBR, 0, 0, -0.5F, -0.2071F, 10.5F, 1, 1, 43, -0.1F, false));
		barrelSBR.cubeList.add(new ModelBox(barrelSBR, 228, 263, -0.5F, -3.6071F, 32.5F, 1, 1, 15, -0.2F, false));
		barrelSBR.cubeList.add(new ModelBox(barrelSBR, 0, 44, -1.0657F, 0.3586F, 10.5F, 1, 1, 43, -0.1F, false));
		barrelSBR.cubeList.add(new ModelBox(barrelSBR, 0, 88, 0.0657F, 0.3586F, 10.5F, 1, 1, 43, -0.1F, false));
		barrelSBR.cubeList.add(new ModelBox(barrelSBR, 0, 132, -0.5F, 0.9243F, 10.5F, 1, 1, 43, -0.1F, false));

		Barrel_r1 = new ModelRenderer(this);
		Barrel_r1.setRotationPoint(1.0142F, 2.6728F, 3.0F);
		barrelSBR.addChild(Barrel_r1);
		setRotationAngle(Barrel_r1, 0.0F, 0.0F, -0.7854F);
		Barrel_r1.cubeList.add(new ModelBox(Barrel_r1, 88, 132, -0.5F, -2.5F, 7.5F, 1, 1, 43, -0.1F, false));

		Barrel_r2 = new ModelRenderer(this);
		Barrel_r2.setRotationPoint(-1.0142F, -0.1556F, 3.0F);
		barrelSBR.addChild(Barrel_r2);
		setRotationAngle(Barrel_r2, 0.0F, 0.0F, -0.7854F);
		Barrel_r2.cubeList.add(new ModelBox(Barrel_r2, 88, 88, -0.5F, 1.5F, 7.5F, 1, 1, 43, -0.1F, false));

		Barrel_r3 = new ModelRenderer(this);
		Barrel_r3.setRotationPoint(1.0142F, 1.8728F, 3.0F);
		barrelSBR.addChild(Barrel_r3);
		setRotationAngle(Barrel_r3, 0.0F, 0.0F, -0.7854F);
		Barrel_r3.cubeList.add(new ModelBox(Barrel_r3, 88, 44, -0.5F, -2.5F, 7.5F, 1, 1, 43, -0.1F, false));

		Barrel_r4 = new ModelRenderer(this);
		Barrel_r4.setRotationPoint(-1.0142F, -0.9556F, 3.0F);
		barrelSBR.addChild(Barrel_r4);
		setRotationAngle(Barrel_r4, 0.0F, 0.0F, -0.7854F);
		Barrel_r4.cubeList.add(new ModelBox(Barrel_r4, 88, 0, -0.5F, 1.5F, 7.5F, 1, 1, 43, -0.1F, false));

		flashider = new ModelRenderer(this);
		flashider.setRotationPoint(-0.5F, 0.3F, -17.749F);
		barrelSBR.addChild(flashider);
		flashider.cubeList.add(new ModelBox(flashider, 88, 293, 0.0F, 0.7071F, 23.6F, 1, 1, 5, 0.0F, false));
		flashider.cubeList.add(new ModelBox(flashider, 114, 301, -0.7071F, 0.0F, 27.6F, 1, 1, 1, 0.0F, false));
		flashider.cubeList.add(new ModelBox(flashider, 174, 301, 0.0F, -0.7071F, 27.6F, 1, 1, 1, 0.0F, false));
		flashider.cubeList.add(new ModelBox(flashider, 178, 301, 0.7071F, 0.0F, 27.6F, 1, 1, 1, 0.0F, false));
		flashider.cubeList.add(new ModelBox(flashider, 182, 301, 0.7071F, 0.0F, 23.6F, 1, 1, 1, 0.0F, false));
		flashider.cubeList.add(new ModelBox(flashider, 186, 301, 0.0F, -0.7071F, 23.6F, 1, 1, 1, 0.0F, false));
		flashider.cubeList.add(new ModelBox(flashider, 200, 301, -0.7071F, 0.0F, 23.6F, 1, 1, 1, 0.0F, false));
		flashider.cubeList.add(new ModelBox(flashider, 302, 12, 0.0F, 0.7071F, 29.35F, 1, 1, 1, 0.0F, false));
		flashider.cubeList.add(new ModelBox(flashider, 302, 10, -0.7071F, 0.0F, 29.35F, 1, 1, 1, 0.0F, false));
		flashider.cubeList.add(new ModelBox(flashider, 302, 4, 0.0F, -0.7071F, 29.35F, 1, 1, 1, 0.0F, false));
		flashider.cubeList.add(new ModelBox(flashider, 302, 2, 0.7071F, 0.0F, 29.35F, 1, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.0F, 1.0F, 28.85F);
		flashider.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 302, 0, -0.5F, -0.5F, 0.5F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 214, 293, -0.5F, -0.5F, -5.25F, 1, 1, 5, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.0F, 0.0F, 28.85F);
		flashider.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 302, 6, -0.5F, -0.5F, 0.5F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 164, 293, -0.5F, -0.5F, -5.25F, 1, 1, 5, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 28.85F);
		flashider.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.7854F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 302, 8, -0.5F, -0.5F, 0.5F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 152, 293, -0.5F, -0.5F, -5.25F, 1, 1, 5, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 1.0F, 28.85F);
		flashider.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 302, 14, -0.5F, -0.5F, 0.5F, 1, 1, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 292, 272, -0.5F, -0.5F, -5.25F, 1, 1, 5, 0.0F, false));

		mk12gasblock = new ModelRenderer(this);
		mk12gasblock.setRotationPoint(1.5F, 37.8929F, 40.501F);
		barrelSBR.addChild(mk12gasblock);
		mk12gasblock.cubeList.add(new ModelBox(mk12gasblock, 94, 299, -1.2929F, -37.5929F, 5.0F, 1, 1, 2, 0.0F, false));
		mk12gasblock.cubeList.add(new ModelBox(mk12gasblock, 168, 216, -2.0F, -40.3F, 5.0F, 1, 3, 2, 0.0F, false));
		mk12gasblock.cubeList.add(new ModelBox(mk12gasblock, 168, 299, -2.7071F, -37.5929F, 5.0F, 1, 1, 2, 0.0F, false));
		mk12gasblock.cubeList.add(new ModelBox(mk12gasblock, 214, 299, -2.0F, -36.8858F, 5.0F, 1, 1, 2, 0.0F, false));
		mk12gasblock.cubeList.add(new ModelBox(mk12gasblock, 298, 115, -1.2929F, -37.5929F, -9.0F, 1, 1, 3, 0.0F, false));
		mk12gasblock.cubeList.add(new ModelBox(mk12gasblock, 44, 296, -2.0F, -39.3F, -9.0F, 1, 2, 3, 0.0F, false));
		mk12gasblock.cubeList.add(new ModelBox(mk12gasblock, 278, 299, -2.0F, -40.3F, -8.0F, 1, 1, 2, 0.0F, false));
		mk12gasblock.cubeList.add(new ModelBox(mk12gasblock, 120, 298, -2.5F, -42.0F, 5.0F, 2, 2, 2, 0.0F, false));
		mk12gasblock.cubeList.add(new ModelBox(mk12gasblock, 298, 119, -2.5F, -42.0F, -8.0F, 2, 2, 2, 0.0F, false));
		mk12gasblock.cubeList.add(new ModelBox(mk12gasblock, 176, 297, -2.7071F, -37.5929F, -9.0F, 1, 1, 3, 0.0F, false));
		mk12gasblock.cubeList.add(new ModelBox(mk12gasblock, 52, 297, -2.0F, -36.8858F, -9.0F, 1, 1, 3, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-2.0F, -36.5929F, -5.5F);
		mk12gasblock.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.7854F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 296, 229, -0.5F, -0.5F, -3.5F, 1, 1, 3, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 220, 299, -0.5F, -0.5F, 10.5F, 1, 1, 2, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-1.0F, -36.5929F, -5.5F);
		mk12gasblock.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 184, 297, -0.5F, -0.5F, -3.5F, 1, 1, 3, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 162, 299, -0.5F, -0.5F, 10.5F, 1, 1, 2, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-2.0F, -37.5929F, -5.5F);
		mk12gasblock.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 252, 297, -0.5F, -0.5F, -3.5F, 1, 1, 3, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 156, 299, -0.5F, -0.5F, 10.5F, 1, 1, 2, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-1.0F, -37.5929F, -5.5F);
		mk12gasblock.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 298, 111, -0.5F, -0.5F, -3.5F, 1, 1, 3, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 150, 299, -0.5F, -0.5F, 10.5F, 1, 1, 2, 0.0F, false));
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