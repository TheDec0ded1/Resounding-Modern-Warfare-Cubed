package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class HK416A5Barrel125 extends ModelBase {
	private final ModelRenderer barrel125;
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

	public HK416A5Barrel125() {
		textureWidth = 512;
		textureHeight = 512;

		barrel125 = new ModelRenderer(this);
		barrel125.setRotationPoint(-1.5F, -13.8929F, -39.501F);
		barrel125.cubeList.add(new ModelBox(barrel125, 0, 196, -0.5F, -1.2071F, -15.5F, 1, 1, 34, -0.1F, false));
		barrel125.cubeList.add(new ModelBox(barrel125, 368, 333, -0.5F, -2.9071F, -7.5F, 1, 1, 26, -0.2F, false));
		barrel125.cubeList.add(new ModelBox(barrel125, 196, 0, -1.0657F, -0.6414F, -15.5F, 1, 1, 34, -0.1F, false));
		barrel125.cubeList.add(new ModelBox(barrel125, 196, 35, 0.0657F, -0.6414F, -15.5F, 1, 1, 34, -0.1F, false));
		barrel125.cubeList.add(new ModelBox(barrel125, 140, 196, -0.5F, -0.0757F, -15.5F, 1, 1, 34, -0.1F, false));

		barrel_r1 = new ModelRenderer(this);
		barrel_r1.setRotationPoint(1.0142F, 1.6728F, 0.0F);
		barrel125.addChild(barrel_r1);
		setRotationAngle(barrel_r1, 0.0F, 0.0F, -0.7854F);
		barrel_r1.cubeList.add(new ModelBox(barrel_r1, 196, 140, -0.5F, -2.5F, -15.5F, 1, 1, 34, -0.1F, false));

		barrel_r2 = new ModelRenderer(this);
		barrel_r2.setRotationPoint(-1.0142F, -1.1556F, 0.0F);
		barrel125.addChild(barrel_r2);
		setRotationAngle(barrel_r2, 0.0F, 0.0F, -0.7854F);
		barrel_r2.cubeList.add(new ModelBox(barrel_r2, 196, 105, -0.5F, 1.5F, -15.5F, 1, 1, 34, -0.1F, false));

		barrel_r3 = new ModelRenderer(this);
		barrel_r3.setRotationPoint(1.0142F, 0.8728F, 0.0F);
		barrel125.addChild(barrel_r3);
		setRotationAngle(barrel_r3, 0.0F, 0.0F, -0.7854F);
		barrel_r3.cubeList.add(new ModelBox(barrel_r3, 196, 70, -0.5F, -2.5F, -15.5F, 1, 1, 34, -0.1F, false));

		barrel_r4 = new ModelRenderer(this);
		barrel_r4.setRotationPoint(-1.0142F, -1.9556F, 0.0F);
		barrel125.addChild(barrel_r4);
		setRotationAngle(barrel_r4, 0.0F, 0.0F, -0.7854F);
		barrel_r4.cubeList.add(new ModelBox(barrel_r4, 70, 196, -0.5F, 1.5F, -15.5F, 1, 1, 34, -0.1F, false));

		flashider4 = new ModelRenderer(this);
		flashider4.setRotationPoint(-0.5F, 0.3F, -17.749F);
		barrel125.addChild(flashider4);
		flashider4.cubeList.add(new ModelBox(flashider4, 486, 198, 0.0F, -0.2929F, -2.5F, 1, 1, 5, 0.0F, false));
		flashider4.cubeList.add(new ModelBox(flashider4, 502, 28, -0.7071F, -1.0F, 1.5F, 1, 1, 1, 0.0F, false));
		flashider4.cubeList.add(new ModelBox(flashider4, 502, 30, 0.0F, -1.7071F, 1.5F, 1, 1, 1, 0.0F, false));
		flashider4.cubeList.add(new ModelBox(flashider4, 32, 502, 0.7071F, -1.0F, 1.5F, 1, 1, 1, 0.0F, false));
		flashider4.cubeList.add(new ModelBox(flashider4, 502, 32, 0.7071F, -1.0F, -2.5F, 1, 1, 1, 0.0F, false));
		flashider4.cubeList.add(new ModelBox(flashider4, 502, 34, 0.0F, -1.7071F, -2.5F, 1, 1, 1, 0.0F, false));
		flashider4.cubeList.add(new ModelBox(flashider4, 36, 502, -0.7071F, -1.0F, -2.5F, 1, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.0F, 0.0F, 1.0F);
		flashider4.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 486, 216, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(1.0F, -1.0F, 1.0F);
		flashider4.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, -0.7854F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 486, 210, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.0F, -1.0F, 1.0F);
		flashider4.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, -0.7854F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 486, 204, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.0F, 0.0F, 1.0F);
		flashider4.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, -0.7854F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 486, 192, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		mk12gasblock4 = new ModelRenderer(this);
		mk12gasblock4.setRotationPoint(1.5F, 37.8929F, 40.501F);
		barrel125.addChild(mk12gasblock4);
		mk12gasblock4.cubeList.add(new ModelBox(mk12gasblock4, 488, 435, -1.2929F, -38.5929F, -51.5F, 1, 1, 3, 0.0F, false));
		mk12gasblock4.cubeList.add(new ModelBox(mk12gasblock4, 224, 487, -2.0F, -40.8F, -48.0F, 1, 1, 4, 0.0F, false));
		mk12gasblock4.cubeList.add(new ModelBox(mk12gasblock4, 238, 349, -2.0F, -40.8F, -29.7F, 1, 1, 6, 0.0F, false));
		mk12gasblock4.cubeList.add(new ModelBox(mk12gasblock4, 334, 490, -2.7071F, -38.5929F, -51.5F, 1, 1, 3, 0.0F, false));
		mk12gasblock4.cubeList.add(new ModelBox(mk12gasblock4, 342, 490, -2.0F, -37.8858F, -51.5F, 1, 1, 3, 0.0F, false));
		mk12gasblock4.cubeList.add(new ModelBox(mk12gasblock4, 386, 140, -2.0F, -40.1858F, -51.5F, 1, 2, 3, 0.0F, false));
		mk12gasblock4.cubeList.add(new ModelBox(mk12gasblock4, 350, 490, -2.0F, -40.6858F, -55.1F, 1, 1, 3, 0.0F, false));
		mk12gasblock4.cubeList.add(new ModelBox(mk12gasblock4, 486, 222, -2.0F, -41.2179F, -52.6429F, 1, 1, 5, -0.15F, false));
		mk12gasblock4.cubeList.add(new ModelBox(mk12gasblock4, 486, 228, -2.0F, -40.2279F, -52.6429F, 1, 1, 5, -0.15F, false));
		mk12gasblock4.cubeList.add(new ModelBox(mk12gasblock4, 486, 246, -2.495F, -40.7229F, -52.6429F, 1, 1, 5, -0.15F, false));
		mk12gasblock4.cubeList.add(new ModelBox(mk12gasblock4, 486, 264, -1.505F, -40.7229F, -52.6429F, 1, 1, 5, -0.15F, false));
		mk12gasblock4.cubeList.add(new ModelBox(mk12gasblock4, 358, 490, -2.5F, -38.0858F, -50.7F, 2, 2, 2, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-2.0F, -37.5929F, -48.0F);
		mk12gasblock4.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, -0.7854F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 490, 461, -0.5F, -0.5F, -3.5F, 1, 1, 3, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-1.85F, -39.8729F, -50.6429F);
		mk12gasblock4.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, 0.7854F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 486, 258, -0.5F, -0.5F, -2.0F, 1, 1, 5, -0.15F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-1.15F, -39.8729F, -50.6429F);
		mk12gasblock4.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, 0.7854F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 486, 252, -0.5F, -0.5F, -2.0F, 1, 1, 5, -0.15F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-1.85F, -40.5729F, -50.6429F);
		mk12gasblock4.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, 0.7854F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 486, 240, -0.5F, -0.5F, -2.0F, 1, 1, 5, -0.15F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-1.15F, -40.5729F, -50.6429F);
		mk12gasblock4.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.0F, 0.7854F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 486, 234, -0.5F, -0.5F, -2.0F, 1, 1, 5, -0.15F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-1.0F, -37.5929F, -48.0F);
		mk12gasblock4.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, -0.7854F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 80, 490, -0.5F, -0.5F, -3.5F, 1, 1, 3, 0.0F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(-2.0F, -38.5929F, -48.0F);
		mk12gasblock4.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, 0.0F, -0.7854F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 488, 457, -0.5F, -0.5F, -3.5F, 1, 1, 3, 0.0F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-1.0F, -38.5929F, -48.0F);
		mk12gasblock4.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, 0.0F, -0.7854F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 488, 453, -0.5F, -0.5F, -3.5F, 1, 1, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		barrel125.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}