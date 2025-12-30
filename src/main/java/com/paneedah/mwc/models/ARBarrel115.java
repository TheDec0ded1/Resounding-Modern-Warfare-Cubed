package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ARBarrel115 extends ModelBase {
	private final ModelRenderer barrel115;
	private final ModelRenderer cuber1;
	private final ModelRenderer cuber2;
	private final ModelRenderer cuber3;
	private final ModelRenderer cuber4;
	private final ModelRenderer flashider;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r16;
	private final ModelRenderer mk12gasblock;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;

	public ARBarrel115() {
		textureWidth = 432;
		textureHeight = 432;

		barrel115 = new ModelRenderer(this);
		barrel115.setRotationPoint(-1.5F, -13.8929F, -39.501F);
		barrel115.cubeList.add(new ModelBox(barrel115, 150, 0, -0.5F, -1.2071F, -13.5F, 1, 1, 32, -0.1F, false));
		barrel115.cubeList.add(new ModelBox(barrel115, 312, 215, -0.5F, -2.5071F, -7.5F, 1, 1, 26, -0.2F, false));
		barrel115.cubeList.add(new ModelBox(barrel115, 150, 33, -1.0657F, -0.6414F, -13.5F, 1, 1, 32, -0.1F, false));
		barrel115.cubeList.add(new ModelBox(barrel115, 150, 66, 0.0657F, -0.6414F, -13.5F, 1, 1, 32, -0.1F, false));
		barrel115.cubeList.add(new ModelBox(barrel115, 0, 187, -0.5F, -0.0757F, -13.5F, 1, 1, 32, -0.1F, false));

		cuber1 = new ModelRenderer(this);
		cuber1.setRotationPoint(1.0142F, 1.6728F, 0.0F);
		barrel115.addChild(cuber1);
		setRotationAngle(cuber1, 0.0F, 0.0F, -0.7854F);
		cuber1.cubeList.add(new ModelBox(cuber1, 206, 185, -0.5F, -2.5F, -13.5F, 1, 1, 32, -0.1F, false));

		cuber2 = new ModelRenderer(this);
		cuber2.setRotationPoint(-1.0142F, -1.1556F, 0.0F);
		barrel115.addChild(cuber2);
		setRotationAngle(cuber2, 0.0F, 0.0F, -0.7854F);
		cuber2.cubeList.add(new ModelBox(cuber2, 140, 185, -0.5F, 1.5F, -13.5F, 1, 1, 32, -0.1F, false));

		cuber3 = new ModelRenderer(this);
		cuber3.setRotationPoint(1.0142F, 0.8728F, 0.0F);
		barrel115.addChild(cuber3);
		setRotationAngle(cuber3, 0.0F, 0.0F, -0.7854F);
		cuber3.cubeList.add(new ModelBox(cuber3, 74, 185, -0.5F, -2.5F, -13.5F, 1, 1, 32, -0.1F, false));

		cuber4 = new ModelRenderer(this);
		cuber4.setRotationPoint(-1.0142F, -1.9556F, 0.0F);
		barrel115.addChild(cuber4);
		setRotationAngle(cuber4, 0.0F, 0.0F, -0.7854F);
		cuber4.cubeList.add(new ModelBox(cuber4, 150, 99, -0.5F, 1.5F, -13.5F, 1, 1, 32, -0.1F, false));

		flashider = new ModelRenderer(this);
		flashider.setRotationPoint(-0.5F, 0.3F, -17.749F);
		barrel115.addChild(flashider);
		flashider.cubeList.add(new ModelBox(flashider, 66, 393, 0.0F, -0.2929F, -0.5F, 1, 1, 5, 0.0F, false));
		flashider.cubeList.add(new ModelBox(flashider, 352, 406, -0.7071F, -1.0F, 3.5F, 1, 1, 1, 0.0F, false));
		flashider.cubeList.add(new ModelBox(flashider, 406, 353, 0.0F, -1.7071F, 3.5F, 1, 1, 1, 0.0F, false));
		flashider.cubeList.add(new ModelBox(flashider, 406, 355, 0.7071F, -1.0F, 3.5F, 1, 1, 1, 0.0F, false));
		flashider.cubeList.add(new ModelBox(flashider, 356, 406, 0.7071F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
		flashider.cubeList.add(new ModelBox(flashider, 406, 357, 0.0F, -1.7071F, -0.5F, 1, 1, 1, 0.0F, false));
		flashider.cubeList.add(new ModelBox(flashider, 406, 359, -0.7071F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.0F, 0.0F, 3.0F);
		flashider.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 146, 393, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(1.0F, -1.0F, 3.0F);
		flashider.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 134, 393, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, -1.0F, 3.0F);
		flashider.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.7854F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 122, 393, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.0F, 0.0F, 3.0F);
		flashider.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, -0.7854F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 390, 135, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		mk12gasblock = new ModelRenderer(this);
		mk12gasblock.setRotationPoint(1.5F, 37.8929F, 40.501F);
		barrel115.addChild(mk12gasblock);
		mk12gasblock.cubeList.add(new ModelBox(mk12gasblock, 398, 361, -1.2929F, -38.5929F, -50.0F, 1, 1, 3, 0.0F, false));
		mk12gasblock.cubeList.add(new ModelBox(mk12gasblock, 50, 348, -2.0F, -40.3F, -50.0F, 1, 2, 3, 0.0F, false));
		mk12gasblock.cubeList.add(new ModelBox(mk12gasblock, 398, 377, -2.7071F, -38.5929F, -50.0F, 1, 1, 3, 0.0F, false));
		mk12gasblock.cubeList.add(new ModelBox(mk12gasblock, 394, 398, -2.0F, -37.8858F, -50.0F, 1, 1, 3, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-2.0F, -37.5929F, -47.5F);
		mk12gasblock.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, -0.7854F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 64, 399, -0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-1.0F, -37.5929F, -47.5F);
		mk12gasblock.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, -0.7854F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 398, 373, -0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-2.0F, -38.5929F, -47.5F);
		mk12gasblock.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, -0.7854F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 398, 369, -0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-1.0F, -38.5929F, -47.5F);
		mk12gasblock.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, -0.7854F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 398, 365, -0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F, false));
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