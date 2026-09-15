package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class LR300Barrel115 extends ModelBase {
	private final ModelRenderer barrel115;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer flashider;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer mk12gasblock;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;

	public LR300Barrel115() {
		textureWidth = 368;
		textureHeight = 368;

		barrel115 = new ModelRenderer(this);
		barrel115.setRotationPoint(-1.5F, -13.8929F, -39.501F);
		barrel115.cubeList.add(new ModelBox(barrel115, 0, 176, -0.5F, -1.2071F, -12.5F, 1, 1, 31, -0.1F, false));
		barrel115.cubeList.add(new ModelBox(barrel115, 240, 48, -0.5F, -3.7071F, -6.5F, 1, 1, 23, -0.1F, false));
		barrel115.cubeList.add(new ModelBox(barrel115, 176, 0, -1.0657F, -0.6414F, -12.5F, 1, 1, 31, -0.1F, false));
		barrel115.cubeList.add(new ModelBox(barrel115, 176, 32, 0.0657F, -0.6414F, -12.5F, 1, 1, 31, -0.1F, false));
		barrel115.cubeList.add(new ModelBox(barrel115, 128, 176, -0.5F, -0.0757F, -12.5F, 1, 1, 31, -0.1F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.0142F, 1.6728F, 0.0F);
		barrel115.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 176, 128, -0.5F, -2.5F, -12.5F, 1, 1, 31, -0.1F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-1.0142F, -1.1556F, 0.0F);
		barrel115.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.7854F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 176, 96, -0.5F, 1.5F, -12.5F, 1, 1, 31, -0.1F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(1.0142F, 0.8728F, 0.0F);
		barrel115.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.7854F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 176, 64, -0.5F, -2.5F, -12.5F, 1, 1, 31, -0.1F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-1.0142F, -1.9556F, 0.0F);
		barrel115.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -0.7854F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 64, 176, -0.5F, 1.5F, -12.5F, 1, 1, 31, -0.1F, false));

		flashider = new ModelRenderer(this);
		flashider.setRotationPoint(-0.5F, 0.3F, -17.749F);
		barrel115.addChild(flashider);
		flashider.cubeList.add(new ModelBox(flashider, 330, 66, 0.0F, -0.2429F, 0.5F, 1, 1, 5, 0.0F, false));
		flashider.cubeList.add(new ModelBox(flashider, 350, 107, -0.7071F, -0.95F, 4.5F, 1, 1, 1, 0.0F, false));
		flashider.cubeList.add(new ModelBox(flashider, 350, 109, 0.0F, -1.6571F, 4.5F, 1, 1, 1, 0.0F, false));
		flashider.cubeList.add(new ModelBox(flashider, 110, 350, 0.7071F, -0.95F, 4.5F, 1, 1, 1, 0.0F, false));
		flashider.cubeList.add(new ModelBox(flashider, 350, 111, 0.7071F, -0.95F, 0.5F, 1, 1, 1, 0.0F, false));
		flashider.cubeList.add(new ModelBox(flashider, 114, 350, 0.0F, -1.6571F, 0.5F, 1, 1, 1, 0.0F, false));
		flashider.cubeList.add(new ModelBox(flashider, 144, 350, -0.7071F, -0.95F, 0.5F, 1, 1, 1, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(1.0F, 0.05F, 4.0F);
		flashider.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.7854F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 126, 331, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(1.0F, -0.95F, 4.0F);
		flashider.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -0.7854F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 330, 78, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.0F, -0.95F, 4.0F);
		flashider.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, -0.7854F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 330, 72, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.0F, 0.05F, 4.0F);
		flashider.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, -0.7854F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 330, 60, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		mk12gasblock = new ModelRenderer(this);
		mk12gasblock.setRotationPoint(1.5F, 37.8929F, 40.501F);
		barrel115.addChild(mk12gasblock);
		mk12gasblock.cubeList.add(new ModelBox(mk12gasblock, 138, 331, -1.2929F, -38.5929F, -48.8F, 1, 1, 5, 0.0F, false));
		mk12gasblock.cubeList.add(new ModelBox(mk12gasblock, 36, 330, -2.5F, -40.8F, -48.8F, 2, 2, 5, 0.0F, false));
		mk12gasblock.cubeList.add(new ModelBox(mk12gasblock, 48, 344, -2.0F, -41.55F, -50.8F, 1, 2, 2, 0.0F, false));
		mk12gasblock.cubeList.add(new ModelBox(mk12gasblock, 32, 343, -2.5F, -42.6F, -48.8F, 2, 2, 2, 0.0F, false));
		mk12gasblock.cubeList.add(new ModelBox(mk12gasblock, 186, 331, -2.7071F, -38.5929F, -48.8F, 1, 1, 5, 0.0F, false));
		mk12gasblock.cubeList.add(new ModelBox(mk12gasblock, 318, 332, -2.0F, -37.8858F, -48.8F, 1, 1, 5, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-2.0F, -37.5929F, -44.3F);
		mk12gasblock.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, -0.7854F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 330, 332, -0.5F, -0.5F, -4.5F, 1, 1, 5, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-1.0F, -37.5929F, -44.3F);
		mk12gasblock.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, -0.7854F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 174, 331, -0.5F, -0.5F, -4.5F, 1, 1, 5, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-2.0F, -38.5929F, -44.3F);
		mk12gasblock.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, -0.7854F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 162, 331, -0.5F, -0.5F, -4.5F, 1, 1, 5, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-1.0F, -38.5929F, -44.3F);
		mk12gasblock.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, -0.7854F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 150, 331, -0.5F, -0.5F, -4.5F, 1, 1, 5, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		barrel115.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}