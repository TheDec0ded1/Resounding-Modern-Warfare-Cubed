package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class HK237Barrel extends ModelBase {
	private final ModelRenderer barrelHK237;
	private final ModelRenderer barrel_r1;
	private final ModelRenderer barrel_r2;
	private final ModelRenderer barrel_r3;
	private final ModelRenderer barrel_r4;
	private final ModelRenderer flashider5;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer mk12gasblock5;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;

	public HK237Barrel() {
		textureWidth = 512;
		textureHeight = 512;

		barrelHK237 = new ModelRenderer(this);
		barrelHK237.setRotationPoint(-1.5F, -13.8929F, -39.501F);
		barrelHK237.cubeList.add(new ModelBox(barrelHK237, 132, 295, -0.5F, -1.2071F, -10.5F, 1, 1, 29, -0.1F, false));
		barrelHK237.cubeList.add(new ModelBox(barrelHK237, 378, 303, -0.5F, -2.9071F, -7.5F, 1, 1, 26, -0.2F, false));
		barrelHK237.cubeList.add(new ModelBox(barrelHK237, 0, 297, -1.0657F, -0.6414F, -10.5F, 1, 1, 29, -0.1F, false));
		barrelHK237.cubeList.add(new ModelBox(barrelHK237, 60, 297, 0.0657F, -0.6414F, -10.5F, 1, 1, 29, -0.1F, false));
		barrelHK237.cubeList.add(new ModelBox(barrelHK237, 120, 325, -0.5F, -0.0757F, -10.5F, 1, 1, 29, -0.1F, false));

		barrel_r1 = new ModelRenderer(this);
		barrel_r1.setRotationPoint(1.0142F, 1.6728F, 0.0F);
		barrelHK237.addChild(barrel_r1);
		setRotationAngle(barrel_r1, 0.0F, 0.0F, -0.7854F);
		barrel_r1.cubeList.add(new ModelBox(barrel_r1, 326, 215, -0.5F, -2.5F, -10.5F, 1, 1, 29, -0.1F, false));

		barrel_r2 = new ModelRenderer(this);
		barrel_r2.setRotationPoint(-1.0142F, -1.1556F, 0.0F);
		barrelHK237.addChild(barrel_r2);
		setRotationAngle(barrel_r2, 0.0F, 0.0F, -0.7854F);
		barrel_r2.cubeList.add(new ModelBox(barrel_r2, 318, 303, -0.5F, 1.5F, -10.5F, 1, 1, 29, -0.1F, false));

		barrel_r3 = new ModelRenderer(this);
		barrel_r3.setRotationPoint(1.0142F, 0.8728F, 0.0F);
		barrelHK237.addChild(barrel_r3);
		setRotationAngle(barrel_r3, 0.0F, 0.0F, -0.7854F);
		barrel_r3.cubeList.add(new ModelBox(barrel_r3, 192, 305, -0.5F, -2.5F, -10.5F, 1, 1, 29, -0.1F, false));

		barrel_r4 = new ModelRenderer(this);
		barrel_r4.setRotationPoint(-1.0142F, -1.9556F, 0.0F);
		barrelHK237.addChild(barrel_r4);
		setRotationAngle(barrel_r4, 0.0F, 0.0F, -0.7854F);
		barrel_r4.cubeList.add(new ModelBox(barrel_r4, 258, 303, -0.5F, 1.5F, -10.5F, 1, 1, 29, -0.1F, false));

		flashider5 = new ModelRenderer(this);
		flashider5.setRotationPoint(-0.5F, 0.3F, -17.749F);
		barrelHK237.addChild(flashider5);
		flashider5.cubeList.add(new ModelBox(flashider5, 486, 391, 0.0F, -0.2929F, 3.3F, 1, 1, 5, 0.0F, false));
		flashider5.cubeList.add(new ModelBox(flashider5, 502, 264, -0.7071F, -1.0F, 7.3F, 1, 1, 1, 0.0F, false));
		flashider5.cubeList.add(new ModelBox(flashider5, 502, 266, 0.0F, -1.7071F, 7.3F, 1, 1, 1, 0.0F, false));
		flashider5.cubeList.add(new ModelBox(flashider5, 502, 268, 0.7071F, -1.0F, 7.3F, 1, 1, 1, 0.0F, false));
		flashider5.cubeList.add(new ModelBox(flashider5, 502, 270, 0.7071F, -1.0F, 3.3F, 1, 1, 1, 0.0F, false));
		flashider5.cubeList.add(new ModelBox(flashider5, 502, 272, 0.0F, -1.7071F, 3.3F, 1, 1, 1, 0.0F, false));
		flashider5.cubeList.add(new ModelBox(flashider5, 502, 274, -0.7071F, -1.0F, 3.3F, 1, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.0F, 0.0F, 6.8F);
		flashider5.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 486, 403, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(1.0F, -1.0F, 6.8F);
		flashider5.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, -0.7854F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 400, 486, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.0F, -1.0F, 6.8F);
		flashider5.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, -0.7854F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 486, 397, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.0F, 0.0F, 6.8F);
		flashider5.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, -0.7854F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 388, 486, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		mk12gasblock5 = new ModelRenderer(this);
		mk12gasblock5.setRotationPoint(1.5F, 37.8929F, 40.501F);
		barrelHK237.addChild(mk12gasblock5);
		mk12gasblock5.cubeList.add(new ModelBox(mk12gasblock5, 490, 477, -1.2929F, -38.5929F, -48.5F, 1, 1, 3, 0.0F, false));
		mk12gasblock5.cubeList.add(new ModelBox(mk12gasblock5, 234, 487, -2.0F, -40.8F, -45.0F, 1, 1, 4, 0.0F, false));
		mk12gasblock5.cubeList.add(new ModelBox(mk12gasblock5, 156, 410, -2.0F, -40.8F, -29.7F, 1, 1, 6, 0.0F, false));
		mk12gasblock5.cubeList.add(new ModelBox(mk12gasblock5, 104, 491, -2.7071F, -38.5929F, -48.5F, 1, 1, 3, 0.0F, false));
		mk12gasblock5.cubeList.add(new ModelBox(mk12gasblock5, 112, 491, -2.0F, -37.8858F, -48.5F, 1, 1, 3, 0.0F, false));
		mk12gasblock5.cubeList.add(new ModelBox(mk12gasblock5, 222, 391, -2.0F, -40.1858F, -48.5F, 1, 2, 3, 0.0F, false));
		mk12gasblock5.cubeList.add(new ModelBox(mk12gasblock5, 120, 491, -2.0F, -40.6858F, -50.1F, 1, 1, 3, 0.0F, false));
		mk12gasblock5.cubeList.add(new ModelBox(mk12gasblock5, 244, 487, -2.0F, -41.2179F, -48.6429F, 1, 1, 4, -0.15F, false));
		mk12gasblock5.cubeList.add(new ModelBox(mk12gasblock5, 502, 289, -2.0F, -40.2279F, -45.7929F, 1, 1, 1, -0.15F, false));
		mk12gasblock5.cubeList.add(new ModelBox(mk12gasblock5, 274, 487, -2.495F, -40.7229F, -48.6429F, 1, 1, 4, -0.15F, false));
		mk12gasblock5.cubeList.add(new ModelBox(mk12gasblock5, 304, 487, -1.505F, -40.7229F, -48.6429F, 1, 1, 4, -0.15F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-2.0F, -37.5929F, -45.0F);
		mk12gasblock5.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, -0.7854F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 128, 491, -0.5F, -0.5F, -3.5F, 1, 1, 3, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-1.85F, -39.8729F, -47.6429F);
		mk12gasblock5.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, 0.7854F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 294, 487, -0.5F, -0.5F, -1.0F, 1, 1, 4, -0.15F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-1.15F, -39.8729F, -47.6429F);
		mk12gasblock5.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, 0.7854F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 284, 487, -0.5F, -0.5F, -1.0F, 1, 1, 4, -0.15F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-1.85F, -40.5729F, -47.6429F);
		mk12gasblock5.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, 0.7854F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 264, 487, -0.5F, -0.5F, -1.0F, 1, 1, 4, -0.15F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-1.15F, -40.5729F, -47.6429F);
		mk12gasblock5.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.0F, 0.7854F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 254, 487, -0.5F, -0.5F, -1.0F, 1, 1, 4, -0.15F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-1.0F, -37.5929F, -45.0F);
		mk12gasblock5.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, -0.7854F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 96, 491, -0.5F, -0.5F, -3.5F, 1, 1, 3, 0.0F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(-2.0F, -38.5929F, -45.0F);
		mk12gasblock5.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, 0.0F, -0.7854F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 88, 491, -0.5F, -0.5F, -3.5F, 1, 1, 3, 0.0F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-1.0F, -38.5929F, -45.0F);
		mk12gasblock5.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, 0.0F, -0.7854F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 490, 481, -0.5F, -0.5F, -3.5F, 1, 1, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		barrelHK237.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}