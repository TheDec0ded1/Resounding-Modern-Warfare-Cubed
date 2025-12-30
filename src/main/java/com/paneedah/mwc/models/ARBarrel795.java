package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ARBarrel795 extends ModelBase {
	private final ModelRenderer barrel795;
	private final ModelRenderer cubem9a91_r1;
	private final ModelRenderer cubem9a91_r2;
	private final ModelRenderer cubem9a91_r3;
	private final ModelRenderer cubem9a91_r4;
	private final ModelRenderer flashider2;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer mk12gasblock2;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;

	public ARBarrel795() {
		textureWidth = 336;
		textureHeight = 336;

		barrel795 = new ModelRenderer(this);
		barrel795.setRotationPoint(-1.5F, -13.8929F, -39.501F);
		barrel795.cubeList.add(new ModelBox(barrel795, 246, 114, -0.5F, -1.2071F, -4.5F, 1, 1, 23, -0.1F, false));
		barrel795.cubeList.add(new ModelBox(barrel795, 246, 281, -0.5F, -2.5071F, 4.5F, 1, 1, 14, -0.2F, false));
		barrel795.cubeList.add(new ModelBox(barrel795, 246, 138, -1.0657F, -0.6414F, -4.5F, 1, 1, 23, -0.1F, false));
		barrel795.cubeList.add(new ModelBox(barrel795, 144, 246, 0.0657F, -0.6414F, -4.5F, 1, 1, 23, -0.1F, false));
		barrel795.cubeList.add(new ModelBox(barrel795, 48, 253, -0.5F, -0.0757F, -4.5F, 1, 1, 23, -0.1F, false));

		cubem9a91_r1 = new ModelRenderer(this);
		cubem9a91_r1.setRotationPoint(1.0142F, 1.6728F, 0.0F);
		barrel795.addChild(cubem9a91_r1);
		setRotationAngle(cubem9a91_r1, 0.0F, 0.0F, -0.7854F);
		cubem9a91_r1.cubeList.add(new ModelBox(cubem9a91_r1, 256, 0, -0.5F, -2.5F, -4.5F, 1, 1, 23, -0.1F, false));

		cubem9a91_r2 = new ModelRenderer(this);
		cubem9a91_r2.setRotationPoint(-1.0142F, -1.1556F, 0.0F);
		barrel795.addChild(cubem9a91_r2);
		setRotationAngle(cubem9a91_r2, 0.0F, 0.0F, -0.7854F);
		cubem9a91_r2.cubeList.add(new ModelBox(cubem9a91_r2, 0, 253, -0.5F, 1.5F, -4.5F, 1, 1, 23, -0.1F, false));

		cubem9a91_r3 = new ModelRenderer(this);
		cubem9a91_r3.setRotationPoint(1.0142F, 0.8728F, 0.0F);
		barrel795.addChild(cubem9a91_r3);
		setRotationAngle(cubem9a91_r3, 0.0F, 0.0F, -0.7854F);
		cubem9a91_r3.cubeList.add(new ModelBox(cubem9a91_r3, 248, 48, -0.5F, -2.5F, -4.5F, 1, 1, 23, -0.1F, false));

		cubem9a91_r4 = new ModelRenderer(this);
		cubem9a91_r4.setRotationPoint(-1.0142F, -1.9556F, 0.0F);
		barrel795.addChild(cubem9a91_r4);
		setRotationAngle(cubem9a91_r4, 0.0F, 0.0F, -0.7854F);
		cubem9a91_r4.cubeList.add(new ModelBox(cubem9a91_r4, 246, 162, -0.5F, 1.5F, -4.5F, 1, 1, 23, -0.1F, false));

		flashider2 = new ModelRenderer(this);
		flashider2.setRotationPoint(-0.5F, 0.3F, -17.749F);
		barrel795.addChild(flashider2);
		flashider2.cubeList.add(new ModelBox(flashider2, 120, 188, 0.0F, -0.2929F, 8.5F, 1, 1, 5, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 144, 316, -0.7071F, -1.0F, 12.5F, 1, 1, 1, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 316, 144, 0.0F, -1.7071F, 12.5F, 1, 1, 1, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 316, 146, 0.7071F, -1.0F, 12.5F, 1, 1, 1, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 148, 316, 0.7071F, -1.0F, 8.5F, 1, 1, 1, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 316, 148, 0.0F, -1.7071F, 8.5F, 1, 1, 1, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 316, 150, -0.7071F, -1.0F, 8.5F, 1, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.0F, 0.0F, 12.0F);
		flashider2.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 162, 298, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(1.0F, -1.0F, 12.0F);
		flashider2.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 78, 292, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, -1.0F, 12.0F);
		flashider2.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.7854F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 174, 285, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 0.0F, 12.0F);
		flashider2.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.7854F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 120, 182, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		mk12gasblock2 = new ModelRenderer(this);
		mk12gasblock2.setRotationPoint(1.5F, 37.8929F, 40.501F);
		barrel795.addChild(mk12gasblock2);
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 68, 306, -1.2929F, -38.5929F, -38.0F, 1, 1, 3, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 16, 305, -2.0F, -40.3F, -38.0F, 1, 2, 3, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 130, 306, -2.7071F, -38.5929F, -38.0F, 1, 1, 3, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 306, 257, -2.0F, -37.8858F, -38.0F, 1, 1, 3, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-2.0F, -37.5929F, -35.5F);
		mk12gasblock2.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.7854F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 306, 261, -0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-1.0F, -37.5929F, -35.5F);
		mk12gasblock2.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -0.7854F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 122, 306, -0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-2.0F, -38.5929F, -35.5F);
		mk12gasblock2.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, -0.7854F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 114, 306, -0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-1.0F, -38.5929F, -35.5F);
		mk12gasblock2.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, -0.7854F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 106, 306, -0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		barrel795.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}