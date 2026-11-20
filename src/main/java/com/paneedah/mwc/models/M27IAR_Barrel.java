package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M27IAR_Barrel extends ModelBase {
	private final ModelRenderer barrel165;
	private final ModelRenderer barrel_r1;
	private final ModelRenderer barrel_r2;
	private final ModelRenderer barrel_r3;
	private final ModelRenderer barrel_r4;
	private final ModelRenderer flashider2;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer mk12gasblock2;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;

	public M27IAR_Barrel() {
		textureWidth = 416;
		textureHeight = 416;

		barrel165 = new ModelRenderer(this);
		barrel165.setRotationPoint(-1.5F, -13.8929F, -39.501F);
		barrel165.cubeList.add(new ModelBox(barrel165, 0, 0, -0.5F, -1.2071F, -34.5F, 1, 1, 53, -0.1F, false));
		barrel165.cubeList.add(new ModelBox(barrel165, 288, 286, -0.5F, -2.9071F, -7.5F, 1, 1, 26, -0.2F, false));
		barrel165.cubeList.add(new ModelBox(barrel165, 0, 54, -1.0657F, -0.6414F, -34.5F, 1, 1, 53, -0.1F, false));
		barrel165.cubeList.add(new ModelBox(barrel165, 0, 108, 0.0657F, -0.6414F, -34.5F, 1, 1, 53, -0.1F, false));
		barrel165.cubeList.add(new ModelBox(barrel165, 0, 162, -0.5F, -0.0757F, -34.5F, 1, 1, 53, -0.1F, false));

		barrel_r1 = new ModelRenderer(this);
		barrel_r1.setRotationPoint(1.0142F, 1.6728F, 0.0F);
		barrel165.addChild(barrel_r1);
		setRotationAngle(barrel_r1, 0.0F, 0.0F, -0.7854F);
		barrel_r1.cubeList.add(new ModelBox(barrel_r1, 108, 162, -0.5F, -2.5F, -34.5F, 1, 1, 53, -0.1F, false));

		barrel_r2 = new ModelRenderer(this);
		barrel_r2.setRotationPoint(-1.0142F, -1.1556F, 0.0F);
		barrel165.addChild(barrel_r2);
		setRotationAngle(barrel_r2, 0.0F, 0.0F, -0.7854F);
		barrel_r2.cubeList.add(new ModelBox(barrel_r2, 108, 108, -0.5F, 1.5F, -34.5F, 1, 1, 53, -0.1F, false));

		barrel_r3 = new ModelRenderer(this);
		barrel_r3.setRotationPoint(1.0142F, 0.8728F, 0.0F);
		barrel165.addChild(barrel_r3);
		setRotationAngle(barrel_r3, 0.0F, 0.0F, -0.7854F);
		barrel_r3.cubeList.add(new ModelBox(barrel_r3, 108, 54, -0.5F, -2.5F, -34.5F, 1, 1, 53, -0.1F, false));

		barrel_r4 = new ModelRenderer(this);
		barrel_r4.setRotationPoint(-1.0142F, -1.9556F, 0.0F);
		barrel165.addChild(barrel_r4);
		setRotationAngle(barrel_r4, 0.0F, 0.0F, -0.7854F);
		barrel_r4.cubeList.add(new ModelBox(barrel_r4, 108, 0, -0.5F, 1.5F, -34.5F, 1, 1, 53, -0.1F, false));

		flashider2 = new ModelRenderer(this);
		flashider2.setRotationPoint(-0.5F, 0.3F, -17.749F);
		barrel165.addChild(flashider2);
		flashider2.cubeList.add(new ModelBox(flashider2, 92, 375, 0.0F, -0.2929F, -21.5F, 1, 1, 5, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 282, 393, -0.7071F, -1.0F, -17.5F, 1, 1, 1, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 286, 393, 0.0F, -1.7071F, -17.5F, 1, 1, 1, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 304, 393, 0.7071F, -1.0F, -17.5F, 1, 1, 1, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 308, 393, 0.7071F, -1.0F, -21.5F, 1, 1, 1, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 312, 393, 0.0F, -1.7071F, -21.5F, 1, 1, 1, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 316, 393, -0.7071F, -1.0F, -21.5F, 1, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.0F, 0.0F, -18.0F);
		flashider2.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 244, 376, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(1.0F, -1.0F, -18.0F);
		flashider2.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 232, 376, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, -1.0F, -18.0F);
		flashider2.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 104, 375, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 0.0F, -18.0F);
		flashider2.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 286, 372, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		mk12gasblock2 = new ModelRenderer(this);
		mk12gasblock2.setRotationPoint(1.5F, 37.8929F, 40.501F);
		barrel165.addChild(mk12gasblock2);
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 256, 376, -1.2929F, -38.5929F, -53.5F, 1, 1, 5, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 278, 308, -2.0F, -40.8F, -48.0F, 1, 1, 4, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 186, 327, -2.0F, -40.8F, -29.7F, 1, 1, 6, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 166, 378, -2.7071F, -38.5929F, -53.5F, 1, 1, 5, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 178, 378, -2.0F, -37.8858F, -53.5F, 1, 1, 5, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 368, 386, -2.0F, -36.8858F, -53.5F, 1, 1, 2, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 220, 365, -2.0F, -40.1858F, -53.5F, 1, 2, 5, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 386, 368, -2.0F, -40.8929F, -52.7929F, 1, 1, 2, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 366, 378, -2.0F, -41.2179F, -51.7929F, 1, 1, 4, -0.15F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 40, 394, -2.0F, -40.2279F, -48.7929F, 1, 1, 1, -0.15F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 372, 333, -2.495F, -40.7229F, -51.7929F, 1, 1, 4, -0.15F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 280, 378, -1.505F, -40.7229F, -51.7929F, 1, 1, 4, -0.15F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 368, 216, -2.5F, -38.0858F, -50.7F, 2, 2, 2, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 170, 387, -2.7071F, -38.5929F, -61.0F, 1, 1, 2, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 188, 387, -1.2929F, -38.5929F, -61.0F, 1, 1, 2, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 22, 384, -2.0F, -39.3F, -61.0F, 1, 3, 2, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-1.0F, -37.5929F, -55.5F);
		mk12gasblock2.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.7854F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 194, 387, -0.5F, -0.5F, -5.5F, 1, 1, 2, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 354, 376, -0.5F, -0.5F, 2.0F, 1, 1, 5, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-1.0F, -38.5929F, -55.5F);
		mk12gasblock2.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -0.7854F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 182, 387, -0.5F, -0.5F, -5.5F, 1, 1, 2, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 268, 376, -0.5F, -0.5F, 2.0F, 1, 1, 5, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-2.0F, -37.5929F, -55.5F);
		mk12gasblock2.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, -0.7854F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 176, 387, -0.5F, -0.5F, -5.5F, 1, 1, 2, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 190, 378, -0.5F, -0.5F, 2.0F, 1, 1, 5, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-2.0F, -38.5929F, -55.5F);
		mk12gasblock2.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, -0.7854F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 164, 387, -0.5F, -0.5F, -5.5F, 1, 1, 2, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 342, 376, -0.5F, -0.5F, 2.0F, 1, 1, 5, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-1.5F, -39.8322F, -52.4393F);
		mk12gasblock2.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.7854F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 36, 394, -0.5F, -0.5F, -1.0F, 1, 1, 1, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-1.85F, -39.8729F, -50.7929F);
		mk12gasblock2.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, 0.7854F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 222, 378, -0.5F, -0.5F, -1.0F, 1, 1, 4, -0.15F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-1.15F, -39.8729F, -50.7929F);
		mk12gasblock2.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, 0.7854F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 212, 378, -0.5F, -0.5F, -1.0F, 1, 1, 4, -0.15F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-1.85F, -40.5729F, -50.7929F);
		mk12gasblock2.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, 0.7854F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 362, 333, -0.5F, -0.5F, -1.0F, 1, 1, 4, -0.15F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-1.15F, -40.5729F, -50.7929F);
		mk12gasblock2.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, 0.7854F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 352, 333, -0.5F, -0.5F, -1.0F, 1, 1, 4, -0.15F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		barrel165.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}