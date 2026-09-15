package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class HK416A5Barrel115 extends ModelBase {
	private final ModelRenderer barrel115;
	private final ModelRenderer barrel_r1;
	private final ModelRenderer barrel_r2;
	private final ModelRenderer barrel_r3;
	private final ModelRenderer barrel_r4;
	private final ModelRenderer flashider2;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer mk12gasblock2;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;

	public HK416A5Barrel115() {
		textureWidth = 512;
		textureHeight = 512;

		barrel115 = new ModelRenderer(this);
		barrel115.setRotationPoint(-1.5F, -13.8929F, -39.501F);
		barrel115.cubeList.add(new ModelBox(barrel115, 210, 175, -0.5F, -1.2071F, -13.5F, 1, 1, 32, -0.1F, false));
		barrel115.cubeList.add(new ModelBox(barrel115, 238, 362, -0.5F, -2.9071F, -7.5F, 1, 1, 26, -0.2F, false));
		barrel115.cubeList.add(new ModelBox(barrel115, 210, 208, -1.0657F, -0.6414F, -13.5F, 1, 1, 32, -0.1F, false));
		barrel115.cubeList.add(new ModelBox(barrel115, 0, 231, 0.0657F, -0.6414F, -13.5F, 1, 1, 32, -0.1F, false));
		barrel115.cubeList.add(new ModelBox(barrel115, 0, 264, -0.5F, -0.0757F, -13.5F, 1, 1, 32, -0.1F, false));

		barrel_r1 = new ModelRenderer(this);
		barrel_r1.setRotationPoint(1.0142F, 1.6728F, 0.0F);
		barrel115.addChild(barrel_r1);
		setRotationAngle(barrel_r1, 0.0F, 0.0F, -0.7854F);
		barrel_r1.cubeList.add(new ModelBox(barrel_r1, 66, 264, -0.5F, -2.5F, -13.5F, 1, 1, 32, -0.1F, false));

		barrel_r2 = new ModelRenderer(this);
		barrel_r2.setRotationPoint(-1.0142F, -1.1556F, 0.0F);
		barrel115.addChild(barrel_r2);
		setRotationAngle(barrel_r2, 0.0F, 0.0F, -0.7854F);
		barrel_r2.cubeList.add(new ModelBox(barrel_r2, 198, 241, -0.5F, 1.5F, -13.5F, 1, 1, 32, -0.1F, false));

		barrel_r3 = new ModelRenderer(this);
		barrel_r3.setRotationPoint(1.0142F, 0.8728F, 0.0F);
		barrel115.addChild(barrel_r3);
		setRotationAngle(barrel_r3, 0.0F, 0.0F, -0.7854F);
		barrel_r3.cubeList.add(new ModelBox(barrel_r3, 132, 231, -0.5F, -2.5F, -13.5F, 1, 1, 32, -0.1F, false));

		barrel_r4 = new ModelRenderer(this);
		barrel_r4.setRotationPoint(-1.0142F, -1.9556F, 0.0F);
		barrel115.addChild(barrel_r4);
		setRotationAngle(barrel_r4, 0.0F, 0.0F, -0.7854F);
		barrel_r4.cubeList.add(new ModelBox(barrel_r4, 66, 231, -0.5F, 1.5F, -13.5F, 1, 1, 32, -0.1F, false));

		flashider2 = new ModelRenderer(this);
		flashider2.setRotationPoint(-0.5F, 0.3F, -17.749F);
		barrel115.addChild(flashider2);
		flashider2.cubeList.add(new ModelBox(flashider2, 120, 303, 0.0F, -0.2929F, -0.5F, 1, 1, 5, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 330, 499, -0.7071F, -1.0F, 3.5F, 1, 1, 1, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 334, 499, 0.0F, -1.7071F, 3.5F, 1, 1, 1, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 338, 499, 0.7071F, -1.0F, 3.5F, 1, 1, 1, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 342, 499, 0.7071F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 346, 499, 0.0F, -1.7071F, -0.5F, 1, 1, 1, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 350, 499, -0.7071F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.0F, 0.0F, 3.0F);
		flashider2.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 180, 325, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(1.0F, -1.0F, 3.0F);
		flashider2.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, -0.7854F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 120, 315, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.0F, -1.0F, 3.0F);
		flashider2.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, -0.7854F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 120, 309, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.0F, 0.0F, 3.0F);
		flashider2.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, -0.7854F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 120, 297, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		mk12gasblock2 = new ModelRenderer(this);
		mk12gasblock2.setRotationPoint(1.5F, 37.8929F, 40.501F);
		barrel115.addChild(mk12gasblock2);
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 222, 400, -1.2929F, -38.5929F, -51.5F, 1, 1, 3, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 374, 210, -2.0F, -40.8F, -48.0F, 1, 1, 4, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 196, 189, -2.0F, -40.8F, -29.7F, 1, 1, 6, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 222, 408, -2.7071F, -38.5929F, -51.5F, 1, 1, 3, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 410, 385, -2.0F, -37.8858F, -51.5F, 1, 1, 3, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 230, 376, -2.0F, -40.1858F, -51.5F, 1, 2, 3, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 424, 290, -2.0F, -40.6858F, -53.1F, 1, 1, 3, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 196, 442, -2.0F, -41.2179F, -51.6429F, 1, 1, 4, -0.15F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 374, 499, -2.0F, -40.2279F, -48.7929F, 1, 1, 1, -0.15F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 106, 396, -2.495F, -40.7229F, -51.6429F, 1, 1, 4, -0.15F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 438, 277, -1.505F, -40.7229F, -51.6429F, 1, 1, 4, -0.15F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 418, 385, -2.5F, -38.0858F, -50.7F, 2, 2, 2, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-2.0F, -37.5929F, -48.0F);
		mk12gasblock2.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, -0.7854F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 412, 200, -0.5F, -0.5F, -3.5F, 1, 1, 3, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-1.85F, -39.8729F, -50.6429F);
		mk12gasblock2.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, 0.7854F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 436, 355, -0.5F, -0.5F, -1.0F, 1, 1, 4, -0.15F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-1.15F, -39.8729F, -50.6429F);
		mk12gasblock2.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, 0.7854F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 106, 401, -0.5F, -0.5F, -1.0F, 1, 1, 4, -0.15F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-1.85F, -40.5729F, -50.6429F);
		mk12gasblock2.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, 0.7854F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 106, 391, -0.5F, -0.5F, -1.0F, 1, 1, 4, -0.15F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-1.15F, -40.5729F, -50.6429F);
		mk12gasblock2.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.0F, 0.7854F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 106, 386, -0.5F, -0.5F, -1.0F, 1, 1, 4, -0.15F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-1.0F, -37.5929F, -48.0F);
		mk12gasblock2.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, -0.7854F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 106, 406, -0.5F, -0.5F, -3.5F, 1, 1, 3, 0.0F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(-2.0F, -38.5929F, -48.0F);
		mk12gasblock2.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, 0.0F, -0.7854F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 222, 404, -0.5F, -0.5F, -3.5F, 1, 1, 3, 0.0F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-1.0F, -38.5929F, -48.0F);
		mk12gasblock2.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, 0.0F, -0.7854F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 404, 200, -0.5F, -0.5F, -3.5F, 1, 1, 3, 0.0F, false));
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