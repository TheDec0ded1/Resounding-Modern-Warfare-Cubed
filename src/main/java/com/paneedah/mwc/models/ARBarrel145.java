package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ARBarrel145 extends ModelBase {
	private final ModelRenderer barrel145;
	private final ModelRenderer cubem9a91_r1;
	private final ModelRenderer cubem9a91_r2;
	private final ModelRenderer cubem9a91_r3;
	private final ModelRenderer cubem9a91_r4;
	private final ModelRenderer cubem9a91_r5;
	private final ModelRenderer cubem9a91_r6;
	private final ModelRenderer cubem9a91_r7;
	private final ModelRenderer cubem9a91_r8;
	private final ModelRenderer flashider2;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r16;
	private final ModelRenderer mk12gasblock2;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;

	public ARBarrel145() {
		textureWidth = 432;
		textureHeight = 432;

		barrel145 = new ModelRenderer(this);
		barrel145.setRotationPoint(-1.5F, -13.8929F, -39.501F);
		barrel145.cubeList.add(new ModelBox(barrel145, 76, 0, -0.5F, -1.2071F, -17.5F, 1, 1, 36, -0.1F, false));
		barrel145.cubeList.add(new ModelBox(barrel145, 310, 248, -0.5F, -2.5071F, -7.5F, 1, 1, 26, -0.2F, false));
		barrel145.cubeList.add(new ModelBox(barrel145, 76, 37, -1.0657F, -0.6414F, -17.5F, 1, 1, 36, -0.1F, false));
		barrel145.cubeList.add(new ModelBox(barrel145, 76, 74, 0.0657F, -0.6414F, -17.5F, 1, 1, 36, -0.1F, false));
		barrel145.cubeList.add(new ModelBox(barrel145, 148, 148, -0.5F, -0.0757F, -17.5F, 1, 1, 36, -0.1F, false));
		barrel145.cubeList.add(new ModelBox(barrel145, 386, 24, -0.5F, -1.2071F, -28.5F, 1, 1, 7, -0.1F, false));
		barrel145.cubeList.add(new ModelBox(barrel145, 386, 16, -1.0657F, -0.6414F, -28.5F, 1, 1, 7, -0.1F, false));
		barrel145.cubeList.add(new ModelBox(barrel145, 386, 8, 0.0657F, -0.6414F, -28.5F, 1, 1, 7, -0.1F, false));
		barrel145.cubeList.add(new ModelBox(barrel145, 234, 287, -0.5F, -0.0757F, -28.5F, 1, 1, 7, -0.1F, false));
		barrel145.cubeList.add(new ModelBox(barrel145, 390, 129, -0.5F, -1.1321F, -22.2F, 1, 1, 5, -0.15F, false));
		barrel145.cubeList.add(new ModelBox(barrel145, 390, 123, -0.995F, -0.6371F, -22.2F, 1, 1, 5, -0.15F, false));
		barrel145.cubeList.add(new ModelBox(barrel145, 390, 117, -0.005F, -0.6371F, -22.2F, 1, 1, 5, -0.15F, false));
		barrel145.cubeList.add(new ModelBox(barrel145, 390, 93, -0.5F, -0.1422F, -22.2F, 1, 1, 5, -0.15F, false));

		cubem9a91_r1 = new ModelRenderer(this);
		cubem9a91_r1.setRotationPoint(1.0642F, 1.6271F, -31.7F);
		barrel145.addChild(cubem9a91_r1);
		setRotationAngle(cubem9a91_r1, 0.0F, 0.0F, -0.7854F);
		cubem9a91_r1.cubeList.add(new ModelBox(cubem9a91_r1, 388, 164, -0.5F, -2.5F, 9.5F, 1, 1, 5, -0.15F, false));

		cubem9a91_r2 = new ModelRenderer(this);
		cubem9a91_r2.setRotationPoint(-1.0642F, -1.2013F, -31.7F);
		barrel145.addChild(cubem9a91_r2);
		setRotationAngle(cubem9a91_r2, 0.0F, 0.0F, -0.7854F);
		cubem9a91_r2.cubeList.add(new ModelBox(cubem9a91_r2, 390, 99, -0.5F, 1.5F, 9.5F, 1, 1, 5, -0.15F, false));

		cubem9a91_r3 = new ModelRenderer(this);
		cubem9a91_r3.setRotationPoint(1.0642F, 0.9271F, -31.7F);
		barrel145.addChild(cubem9a91_r3);
		setRotationAngle(cubem9a91_r3, 0.0F, 0.0F, -0.7854F);
		cubem9a91_r3.cubeList.add(new ModelBox(cubem9a91_r3, 390, 105, -0.5F, -2.5F, 9.5F, 1, 1, 5, -0.15F, false));

		cubem9a91_r4 = new ModelRenderer(this);
		cubem9a91_r4.setRotationPoint(-1.0642F, -1.9014F, -31.7F);
		barrel145.addChild(cubem9a91_r4);
		setRotationAngle(cubem9a91_r4, 0.0F, 0.0F, -0.7854F);
		cubem9a91_r4.cubeList.add(new ModelBox(cubem9a91_r4, 390, 111, -0.5F, 1.5F, 9.5F, 1, 1, 5, -0.15F, false));

		cubem9a91_r5 = new ModelRenderer(this);
		cubem9a91_r5.setRotationPoint(1.0142F, 1.6728F, -40.0F);
		barrel145.addChild(cubem9a91_r5);
		setRotationAngle(cubem9a91_r5, 0.0F, 0.0F, -0.7854F);
		cubem9a91_r5.cubeList.add(new ModelBox(cubem9a91_r5, 234, 279, -0.5F, -2.5F, 11.5F, 1, 1, 7, -0.1F, false));
		cubem9a91_r5.cubeList.add(new ModelBox(cubem9a91_r5, 0, 150, -0.5F, -2.5F, 22.5F, 1, 1, 36, -0.1F, false));

		cubem9a91_r6 = new ModelRenderer(this);
		cubem9a91_r6.setRotationPoint(-1.0142F, -1.1556F, -40.0F);
		barrel145.addChild(cubem9a91_r6);
		setRotationAngle(cubem9a91_r6, 0.0F, 0.0F, -0.7854F);
		cubem9a91_r6.cubeList.add(new ModelBox(cubem9a91_r6, 234, 295, -0.5F, 1.5F, 11.5F, 1, 1, 7, -0.1F, false));
		cubem9a91_r6.cubeList.add(new ModelBox(cubem9a91_r6, 74, 148, -0.5F, 1.5F, 22.5F, 1, 1, 36, -0.1F, false));

		cubem9a91_r7 = new ModelRenderer(this);
		cubem9a91_r7.setRotationPoint(1.0142F, 0.8728F, -40.0F);
		barrel145.addChild(cubem9a91_r7);
		setRotationAngle(cubem9a91_r7, 0.0F, 0.0F, -0.7854F);
		cubem9a91_r7.cubeList.add(new ModelBox(cubem9a91_r7, 212, 385, -0.5F, -2.5F, 11.5F, 1, 1, 7, -0.1F, false));
		cubem9a91_r7.cubeList.add(new ModelBox(cubem9a91_r7, 0, 113, -0.5F, -2.5F, 22.5F, 1, 1, 36, -0.1F, false));

		cubem9a91_r8 = new ModelRenderer(this);
		cubem9a91_r8.setRotationPoint(-1.0142F, -1.9556F, -40.0F);
		barrel145.addChild(cubem9a91_r8);
		setRotationAngle(cubem9a91_r8, 0.0F, 0.0F, -0.7854F);
		cubem9a91_r8.cubeList.add(new ModelBox(cubem9a91_r8, 386, 0, -0.5F, 1.5F, 11.5F, 1, 1, 7, -0.1F, false));
		cubem9a91_r8.cubeList.add(new ModelBox(cubem9a91_r8, 76, 111, -0.5F, 1.5F, 22.5F, 1, 1, 36, -0.1F, false));

		flashider2 = new ModelRenderer(this);
		flashider2.setRotationPoint(-0.5F, 0.3F, -17.749F);
		barrel145.addChild(flashider2);
		flashider2.cubeList.add(new ModelBox(flashider2, 386, 373, 0.0F, -0.2929F, -15.5F, 1, 1, 5, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 86, 406, -0.7071F, -1.0F, -11.5F, 1, 1, 1, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 406, 86, 0.0F, -1.7071F, -11.5F, 1, 1, 1, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 406, 88, 0.7071F, -1.0F, -11.5F, 1, 1, 1, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 90, 406, 0.7071F, -1.0F, -15.5F, 1, 1, 1, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 94, 406, 0.0F, -1.7071F, -15.5F, 1, 1, 1, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 98, 406, -0.7071F, -1.0F, -15.5F, 1, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.0F, 0.0F, -12.0F);
		flashider2.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 388, 158, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(1.0F, -1.0F, -12.0F);
		flashider2.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 388, 152, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, -1.0F, -12.0F);
		flashider2.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.7854F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 388, 146, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.0F, 0.0F, -12.0F);
		flashider2.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, -0.7854F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 386, 367, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		mk12gasblock2 = new ModelRenderer(this);
		mk12gasblock2.setRotationPoint(1.5F, 37.8929F, 40.501F);
		barrel145.addChild(mk12gasblock2);
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 118, 399, -1.2929F, -38.5929F, -50.0F, 1, 1, 3, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 50, 353, -2.0F, -40.3F, -50.0F, 1, 2, 3, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 150, 399, -2.7071F, -38.5929F, -50.0F, 1, 1, 3, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 158, 399, -2.0F, -37.8858F, -50.0F, 1, 1, 3, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-2.0F, -37.5929F, -47.5F);
		mk12gasblock2.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, -0.7854F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 166, 399, -0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-1.0F, -37.5929F, -47.5F);
		mk12gasblock2.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, -0.7854F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 142, 399, -0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-2.0F, -38.5929F, -47.5F);
		mk12gasblock2.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, -0.7854F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 134, 399, -0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-1.0F, -38.5929F, -47.5F);
		mk12gasblock2.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, -0.7854F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 126, 399, -0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		barrel145.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}