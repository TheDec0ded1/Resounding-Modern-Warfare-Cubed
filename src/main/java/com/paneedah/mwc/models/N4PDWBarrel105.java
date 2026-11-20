package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class N4PDWBarrel105 extends ModelBase {
	private final ModelRenderer barrel105;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r14;
	private final ModelRenderer flashider3;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer mk12gasblock3;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;

	public N4PDWBarrel105() {
		textureWidth = 288;
		textureHeight = 288;

		barrel105 = new ModelRenderer(this);
		barrel105.setRotationPoint(-1.5F, -13.8929F, -39.501F);
		barrel105.cubeList.add(new ModelBox(barrel105, 0, 0, -0.5F, -1.2071F, -7.5F, 1, 1, 26, -0.1F, false));
		barrel105.cubeList.add(new ModelBox(barrel105, 244, 0, -0.5F, -2.5071F, 4.5F, 1, 1, 14, -0.2F, false));
		barrel105.cubeList.add(new ModelBox(barrel105, 0, 27, -1.0657F, -0.6414F, -7.5F, 1, 1, 26, -0.1F, false));
		barrel105.cubeList.add(new ModelBox(barrel105, 0, 54, 0.0657F, -0.6414F, -7.5F, 1, 1, 26, -0.1F, false));
		barrel105.cubeList.add(new ModelBox(barrel105, 0, 81, -0.5F, -0.0757F, -7.5F, 1, 1, 26, -0.1F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.0142F, 1.6728F, 0.0F);
		barrel105.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 54, 81, -0.5F, -2.5F, -7.5F, 1, 1, 26, -0.1F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-1.0142F, -1.1556F, 0.0F);
		barrel105.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.7854F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 54, 54, -0.5F, 1.5F, -7.5F, 1, 1, 26, -0.1F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(1.0142F, 0.8728F, 0.0F);
		barrel105.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.7854F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 54, 27, -0.5F, -2.5F, -7.5F, 1, 1, 26, -0.1F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-1.0142F, -1.9556F, 0.0F);
		barrel105.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -0.7854F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 54, 0, -0.5F, 1.5F, -7.5F, 1, 1, 26, -0.1F, false));

		flashider3 = new ModelRenderer(this);
		flashider3.setRotationPoint(-0.5F, 0.3F, -17.749F);
		barrel105.addChild(flashider3);
		flashider3.cubeList.add(new ModelBox(flashider3, 148, 266, 0.0F, -0.2929F, 5.5F, 1, 1, 5, 0.0F, false));
		flashider3.cubeList.add(new ModelBox(flashider3, 160, 266, -0.7071F, -1.0F, 5.5F, 1, 1, 5, 0.0F, false));
		flashider3.cubeList.add(new ModelBox(flashider3, 248, 266, 0.0F, -1.7071F, 5.5F, 1, 1, 5, 0.0F, false));
		flashider3.cubeList.add(new ModelBox(flashider3, 260, 266, 0.7071F, -1.0F, 5.5F, 1, 1, 5, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(1.0F, 0.0F, 9.0F);
		flashider3.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, -0.7854F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 48, 267, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(1.0F, -1.0F, 9.0F);
		flashider3.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, -0.7854F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 236, 266, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.0F, -1.0F, 9.0F);
		flashider3.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, -0.7854F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 224, 266, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.0F, 0.0F, 9.0F);
		flashider3.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, -0.7854F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 36, 266, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		mk12gasblock3 = new ModelRenderer(this);
		mk12gasblock3.setRotationPoint(1.5F, 37.8929F, 40.501F);
		barrel105.addChild(mk12gasblock3);
		mk12gasblock3.cubeList.add(new ModelBox(mk12gasblock3, 268, 43, -1.2929F, -38.5929F, -38.0F, 1, 1, 3, 0.0F, false));
		mk12gasblock3.cubeList.add(new ModelBox(mk12gasblock3, 126, 267, -2.0F, -40.3F, -38.0F, 1, 2, 3, 0.0F, false));
		mk12gasblock3.cubeList.add(new ModelBox(mk12gasblock3, 180, 271, -2.7071F, -38.5929F, -38.0F, 1, 1, 3, 0.0F, false));
		mk12gasblock3.cubeList.add(new ModelBox(mk12gasblock3, 188, 271, -2.0F, -37.8858F, -38.0F, 1, 1, 3, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-2.0F, -37.5929F, -35.5F);
		mk12gasblock3.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, -0.7854F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 196, 271, -0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-1.0F, -37.5929F, -35.5F);
		mk12gasblock3.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, -0.7854F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 172, 271, -0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-2.0F, -38.5929F, -35.5F);
		mk12gasblock3.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, -0.7854F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 134, 271, -0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-1.0F, -38.5929F, -35.5F);
		mk12gasblock3.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, -0.7854F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 116, 270, -0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		barrel105.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}