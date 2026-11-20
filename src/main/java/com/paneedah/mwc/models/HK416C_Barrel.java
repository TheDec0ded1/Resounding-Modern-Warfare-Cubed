package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class HK416C_Barrel extends ModelBase {
	private final ModelRenderer barrelC;
	private final ModelRenderer barrel_r1;
	private final ModelRenderer barrel_r2;
	private final ModelRenderer barrel_r3;
	private final ModelRenderer barrel_r4;
	private final ModelRenderer flashider4;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer mk12gasblock4;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;

	public HK416C_Barrel() {
		textureWidth = 432;
		textureHeight = 432;

		barrelC = new ModelRenderer(this);
		barrelC.setRotationPoint(-1.5F, -13.8929F, -39.501F);
		barrelC.cubeList.add(new ModelBox(barrelC, 68, 182, -0.5F, -1.2071F, -11.5F, 1, 1, 30, -0.1F, false));
		barrelC.cubeList.add(new ModelBox(barrelC, 216, 118, -0.5F, -2.9071F, -4.5F, 1, 1, 16, -0.2F, false));
		barrelC.cubeList.add(new ModelBox(barrelC, 130, 182, -1.0657F, -0.6414F, -11.5F, 1, 1, 30, -0.1F, false));
		barrelC.cubeList.add(new ModelBox(barrelC, 192, 182, 0.0657F, -0.6414F, -11.5F, 1, 1, 30, -0.1F, false));
		barrelC.cubeList.add(new ModelBox(barrelC, 192, 213, -0.5F, -0.0757F, -11.5F, 1, 1, 30, -0.1F, false));

		barrel_r1 = new ModelRenderer(this);
		barrel_r1.setRotationPoint(1.0142F, 1.6728F, 0.0F);
		barrelC.addChild(barrel_r1);
		setRotationAngle(barrel_r1, 0.0F, 0.0F, -0.7854F);
		barrel_r1.cubeList.add(new ModelBox(barrel_r1, 0, 216, -0.5F, -2.5F, -11.5F, 1, 1, 30, -0.1F, false));

		barrel_r2 = new ModelRenderer(this);
		barrel_r2.setRotationPoint(-1.0142F, -1.1556F, 0.0F);
		barrelC.addChild(barrel_r2);
		setRotationAngle(barrel_r2, 0.0F, 0.0F, -0.7854F);
		barrel_r2.cubeList.add(new ModelBox(barrel_r2, 130, 213, -0.5F, 1.5F, -11.5F, 1, 1, 30, -0.1F, false));

		barrel_r3 = new ModelRenderer(this);
		barrel_r3.setRotationPoint(1.0142F, 0.8728F, 0.0F);
		barrelC.addChild(barrel_r3);
		setRotationAngle(barrel_r3, 0.0F, 0.0F, -0.7854F);
		barrel_r3.cubeList.add(new ModelBox(barrel_r3, 68, 213, -0.5F, -2.5F, -11.5F, 1, 1, 30, -0.1F, false));

		barrel_r4 = new ModelRenderer(this);
		barrel_r4.setRotationPoint(-1.0142F, -1.9556F, 0.0F);
		barrelC.addChild(barrel_r4);
		setRotationAngle(barrel_r4, 0.0F, 0.0F, -0.7854F);
		barrel_r4.cubeList.add(new ModelBox(barrel_r4, 204, 136, -0.5F, 1.5F, -11.5F, 1, 1, 30, -0.1F, false));

		flashider4 = new ModelRenderer(this);
		flashider4.setRotationPoint(-0.5F, 0.3F, -17.749F);
		barrelC.addChild(flashider4);
		flashider4.cubeList.add(new ModelBox(flashider4, 358, 409, 0.0F, -0.2929F, 1.55F, 1, 1, 5, 0.0F, false));
		flashider4.cubeList.add(new ModelBox(flashider4, 426, 4, -0.7071F, -1.0F, 5.55F, 1, 1, 1, 0.0F, false));
		flashider4.cubeList.add(new ModelBox(flashider4, 426, 6, 0.0F, -1.7071F, 5.55F, 1, 1, 1, 0.0F, false));
		flashider4.cubeList.add(new ModelBox(flashider4, 8, 426, 0.7071F, -1.0F, 5.55F, 1, 1, 1, 0.0F, false));
		flashider4.cubeList.add(new ModelBox(flashider4, 426, 8, 0.7071F, -1.0F, 1.55F, 1, 1, 1, 0.0F, false));
		flashider4.cubeList.add(new ModelBox(flashider4, 426, 10, 0.0F, -1.7071F, 1.55F, 1, 1, 1, 0.0F, false));
		flashider4.cubeList.add(new ModelBox(flashider4, 12, 426, -0.7071F, -1.0F, 1.55F, 1, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.0F, 0.0F, 5.05F);
		flashider4.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 410, 137, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(1.0F, -1.0F, 5.05F);
		flashider4.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, -0.7854F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 410, 94, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.0F, -1.0F, 5.05F);
		flashider4.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, -0.7854F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 370, 409, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.0F, 0.0F, 5.05F);
		flashider4.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, -0.7854F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 382, 408, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		mk12gasblock4 = new ModelRenderer(this);
		mk12gasblock4.setRotationPoint(1.5F, 37.8929F, 40.501F);
		barrelC.addChild(mk12gasblock4);
		mk12gasblock4.cubeList.add(new ModelBox(mk12gasblock4, 410, 143, -1.2929F, -38.5929F, -50.5F, 1, 1, 5, 0.0F, false));
		mk12gasblock4.cubeList.add(new ModelBox(mk12gasblock4, 334, 412, -2.0F, -40.8F, -45.0F, 1, 1, 4, 0.0F, false));
		mk12gasblock4.cubeList.add(new ModelBox(mk12gasblock4, 404, 321, -2.0F, -40.8F, -29.7F, 1, 1, 6, 0.0F, false));
		mk12gasblock4.cubeList.add(new ModelBox(mk12gasblock4, 410, 167, -2.7071F, -38.5929F, -50.5F, 1, 1, 5, 0.0F, false));
		mk12gasblock4.cubeList.add(new ModelBox(mk12gasblock4, 410, 173, -2.0F, -37.8858F, -50.5F, 1, 1, 5, 0.0F, false));
		mk12gasblock4.cubeList.add(new ModelBox(mk12gasblock4, 322, 406, -2.0F, -40.1858F, -50.5F, 1, 2, 5, 0.0F, false));
		mk12gasblock4.cubeList.add(new ModelBox(mk12gasblock4, 418, 100, -2.0F, -40.8929F, -49.7929F, 1, 1, 2, 0.0F, false));
		mk12gasblock4.cubeList.add(new ModelBox(mk12gasblock4, 344, 412, -2.0F, -41.2179F, -48.7929F, 1, 1, 4, -0.15F, false));
		mk12gasblock4.cubeList.add(new ModelBox(mk12gasblock4, 426, 12, -2.0F, -40.2279F, -45.7929F, 1, 1, 1, -0.15F, false));
		mk12gasblock4.cubeList.add(new ModelBox(mk12gasblock4, 42, 413, -2.495F, -40.7229F, -48.7929F, 1, 1, 4, -0.15F, false));
		mk12gasblock4.cubeList.add(new ModelBox(mk12gasblock4, 72, 413, -1.505F, -40.7229F, -48.7929F, 1, 1, 4, -0.15F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-2.0F, -37.5929F, -45.0F);
		mk12gasblock4.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, -0.7854F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 410, 179, -0.5F, -0.5F, -5.5F, 1, 1, 5, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-1.5F, -39.8322F, -49.4393F);
		mk12gasblock4.addChild(cube_r22);
		setRotationAngle(cube_r22, -0.7854F, 0.0F, 0.0F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 426, 14, -0.5F, -0.5F, -1.0F, 1, 1, 1, 0.0F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-1.85F, -39.8729F, -47.7929F);
		mk12gasblock4.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, 0.7854F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 62, 413, -0.5F, -0.5F, -1.0F, 1, 1, 4, -0.15F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-1.15F, -39.8729F, -47.7929F);
		mk12gasblock4.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, 0.7854F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 52, 413, -0.5F, -0.5F, -1.0F, 1, 1, 4, -0.15F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-1.85F, -40.5729F, -47.7929F);
		mk12gasblock4.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.0F, 0.7854F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 32, 413, -0.5F, -0.5F, -1.0F, 1, 1, 4, -0.15F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-1.15F, -40.5729F, -47.7929F);
		mk12gasblock4.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, 0.7854F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 410, 412, -0.5F, -0.5F, -1.0F, 1, 1, 4, -0.15F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(-1.0F, -37.5929F, -45.0F);
		mk12gasblock4.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, 0.0F, -0.7854F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 410, 161, -0.5F, -0.5F, -5.5F, 1, 1, 5, 0.0F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-2.0F, -38.5929F, -45.0F);
		mk12gasblock4.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, 0.0F, -0.7854F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 410, 155, -0.5F, -0.5F, -5.5F, 1, 1, 5, 0.0F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(-1.0F, -38.5929F, -45.0F);
		mk12gasblock4.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.0F, 0.0F, -0.7854F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 410, 149, -0.5F, -0.5F, -5.5F, 1, 1, 5, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		barrelC.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}