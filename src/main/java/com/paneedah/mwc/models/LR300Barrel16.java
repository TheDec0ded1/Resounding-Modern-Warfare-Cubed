package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class LR300Barrel16 extends ModelBase {
	private final ModelRenderer barrel16;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer flashider3;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer mk12gasblock3;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;

	public LR300Barrel16() {
		textureWidth = 368;
		textureHeight = 368;

		barrel16 = new ModelRenderer(this);
		barrel16.setRotationPoint(-1.5F, -13.8929F, -39.501F);
		barrel16.cubeList.add(new ModelBox(barrel16, 0, 0, -0.5F, -1.2071F, -24.5F, 1, 1, 43, -0.1F, false));
		barrel16.cubeList.add(new ModelBox(barrel16, 240, 72, -0.5F, -3.7071F, -6.5F, 1, 1, 23, -0.1F, false));
		barrel16.cubeList.add(new ModelBox(barrel16, 0, 44, -1.0657F, -0.6414F, -24.5F, 1, 1, 43, -0.1F, false));
		barrel16.cubeList.add(new ModelBox(barrel16, 0, 88, 0.0657F, -0.6414F, -24.5F, 1, 1, 43, -0.1F, false));
		barrel16.cubeList.add(new ModelBox(barrel16, 0, 132, -0.5F, -0.0757F, -24.5F, 1, 1, 43, -0.1F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.0142F, 1.6728F, 0.0F);
		barrel16.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 88, 132, -0.5F, -2.5F, -24.5F, 1, 1, 43, -0.1F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-1.0142F, -1.1556F, 0.0F);
		barrel16.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.7854F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 88, 88, -0.5F, 1.5F, -24.5F, 1, 1, 43, -0.1F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(1.0142F, 0.8728F, 0.0F);
		barrel16.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.7854F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 88, 44, -0.5F, -2.5F, -24.5F, 1, 1, 43, -0.1F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-1.0142F, -1.9556F, 0.0F);
		barrel16.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -0.7854F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 88, 0, -0.5F, 1.5F, -24.5F, 1, 1, 43, -0.1F, false));

		flashider3 = new ModelRenderer(this);
		flashider3.setRotationPoint(-0.5F, 0.3F, -17.749F);
		barrel16.addChild(flashider3);
		flashider3.cubeList.add(new ModelBox(flashider3, 244, 335, 0.0F, -0.2429F, -11.5F, 1, 1, 5, 0.0F, false));
		flashider3.cubeList.add(new ModelBox(flashider3, 350, 283, -0.7071F, -0.95F, -7.5F, 1, 1, 1, 0.0F, false));
		flashider3.cubeList.add(new ModelBox(flashider3, 350, 285, 0.0F, -1.6571F, -7.5F, 1, 1, 1, 0.0F, false));
		flashider3.cubeList.add(new ModelBox(flashider3, 350, 287, 0.7071F, -0.95F, -7.5F, 1, 1, 1, 0.0F, false));
		flashider3.cubeList.add(new ModelBox(flashider3, 350, 289, 0.7071F, -0.95F, -11.5F, 1, 1, 1, 0.0F, false));
		flashider3.cubeList.add(new ModelBox(flashider3, 350, 291, 0.0F, -1.6571F, -11.5F, 1, 1, 1, 0.0F, false));
		flashider3.cubeList.add(new ModelBox(flashider3, 350, 293, -0.7071F, -0.95F, -11.5F, 1, 1, 1, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(1.0F, 0.05F, -8.0F);
		flashider3.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.7854F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 268, 336, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(1.0F, -0.95F, -8.0F);
		flashider3.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -0.7854F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 256, 336, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.0F, -0.95F, -8.0F);
		flashider3.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, -0.7854F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 60, 336, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.0F, 0.05F, -8.0F);
		flashider3.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, -0.7854F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 232, 335, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		mk12gasblock3 = new ModelRenderer(this);
		mk12gasblock3.setRotationPoint(1.5F, 37.8929F, 40.501F);
		barrel16.addChild(mk12gasblock3);
		mk12gasblock3.cubeList.add(new ModelBox(mk12gasblock3, 36, 337, -1.2929F, -38.5929F, -48.8F, 1, 1, 5, 0.0F, false));
		mk12gasblock3.cubeList.add(new ModelBox(mk12gasblock3, 330, 42, -2.5F, -40.8F, -48.8F, 2, 2, 5, 0.0F, false));
		mk12gasblock3.cubeList.add(new ModelBox(mk12gasblock3, 344, 259, -2.0F, -41.55F, -50.8F, 1, 2, 2, 0.0F, false));
		mk12gasblock3.cubeList.add(new ModelBox(mk12gasblock3, 80, 343, -2.5F, -42.6F, -48.8F, 2, 2, 2, 0.0F, false));
		mk12gasblock3.cubeList.add(new ModelBox(mk12gasblock3, 108, 337, -2.7071F, -38.5929F, -48.8F, 1, 1, 5, 0.0F, false));
		mk12gasblock3.cubeList.add(new ModelBox(mk12gasblock3, 120, 337, -2.0F, -37.8858F, -48.8F, 1, 1, 5, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-2.0F, -37.5929F, -44.3F);
		mk12gasblock3.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, -0.7854F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 132, 337, -0.5F, -0.5F, -4.5F, 1, 1, 5, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-1.0F, -37.5929F, -44.3F);
		mk12gasblock3.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, -0.7854F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 96, 337, -0.5F, -0.5F, -4.5F, 1, 1, 5, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-2.0F, -38.5929F, -44.3F);
		mk12gasblock3.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, -0.7854F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 84, 337, -0.5F, -0.5F, -4.5F, 1, 1, 5, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-1.0F, -38.5929F, -44.3F);
		mk12gasblock3.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, -0.7854F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 72, 337, -0.5F, -0.5F, -4.5F, 1, 1, 5, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		barrel16.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}