package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class HK416_Barrel115 extends ModelBase {
	private final ModelRenderer barrel115;
	private final ModelRenderer barrel_r1;
	private final ModelRenderer barrel_r2;
	private final ModelRenderer barrel_r3;
	private final ModelRenderer barrel_r4;
	private final ModelRenderer flashider3;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer mk12gasblock3;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;

	public HK416_Barrel115() {
		textureWidth = 432;
		textureHeight = 432;

		barrel115 = new ModelRenderer(this);
		barrel115.setRotationPoint(-1.5F, -13.8929F, -39.501F);
		barrel115.cubeList.add(new ModelBox(barrel115, 0, 148, -0.5F, -1.2071F, -14.5F, 1, 1, 33, -0.1F, false));
		barrel115.cubeList.add(new ModelBox(barrel115, 276, 0, -0.5F, -2.9071F, -7.5F, 1, 1, 26, -0.2F, false));
		barrel115.cubeList.add(new ModelBox(barrel115, 148, 0, -1.0657F, -0.6414F, -14.5F, 1, 1, 33, -0.1F, false));
		barrel115.cubeList.add(new ModelBox(barrel115, 148, 34, 0.0657F, -0.6414F, -14.5F, 1, 1, 33, -0.1F, false));
		barrel115.cubeList.add(new ModelBox(barrel115, 136, 148, -0.5F, -0.0757F, -14.5F, 1, 1, 33, -0.1F, false));

		barrel_r1 = new ModelRenderer(this);
		barrel_r1.setRotationPoint(1.0142F, 1.6728F, 0.0F);
		barrel115.addChild(barrel_r1);
		setRotationAngle(barrel_r1, 0.0F, 0.0F, -0.7854F);
		barrel_r1.cubeList.add(new ModelBox(barrel_r1, 0, 182, -0.5F, -2.5F, -14.5F, 1, 1, 33, -0.1F, false));

		barrel_r2 = new ModelRenderer(this);
		barrel_r2.setRotationPoint(-1.0142F, -1.1556F, 0.0F);
		barrel115.addChild(barrel_r2);
		setRotationAngle(barrel_r2, 0.0F, 0.0F, -0.7854F);
		barrel_r2.cubeList.add(new ModelBox(barrel_r2, 148, 102, -0.5F, 1.5F, -14.5F, 1, 1, 33, -0.1F, false));

		barrel_r3 = new ModelRenderer(this);
		barrel_r3.setRotationPoint(1.0142F, 0.8728F, 0.0F);
		barrel115.addChild(barrel_r3);
		setRotationAngle(barrel_r3, 0.0F, 0.0F, -0.7854F);
		barrel_r3.cubeList.add(new ModelBox(barrel_r3, 148, 68, -0.5F, -2.5F, -14.5F, 1, 1, 33, -0.1F, false));

		barrel_r4 = new ModelRenderer(this);
		barrel_r4.setRotationPoint(-1.0142F, -1.9556F, 0.0F);
		barrel115.addChild(barrel_r4);
		setRotationAngle(barrel_r4, 0.0F, 0.0F, -0.7854F);
		barrel_r4.cubeList.add(new ModelBox(barrel_r4, 68, 148, -0.5F, 1.5F, -14.5F, 1, 1, 33, -0.1F, false));

		flashider3 = new ModelRenderer(this);
		flashider3.setRotationPoint(-0.5F, 0.3F, -17.749F);
		barrel115.addChild(flashider3);
		flashider3.cubeList.add(new ModelBox(flashider3, 116, 408, 0.0F, -0.2929F, -0.75F, 1, 1, 5, 0.0F, false));
		flashider3.cubeList.add(new ModelBox(flashider3, 424, 38, -0.7071F, -1.0F, 3.25F, 1, 1, 1, 0.0F, false));
		flashider3.cubeList.add(new ModelBox(flashider3, 424, 40, 0.0F, -1.7071F, 3.25F, 1, 1, 1, 0.0F, false));
		flashider3.cubeList.add(new ModelBox(flashider3, 424, 42, 0.7071F, -1.0F, 3.25F, 1, 1, 1, 0.0F, false));
		flashider3.cubeList.add(new ModelBox(flashider3, 82, 424, 0.7071F, -1.0F, -0.75F, 1, 1, 1, 0.0F, false));
		flashider3.cubeList.add(new ModelBox(flashider3, 86, 424, 0.0F, -1.7071F, -0.75F, 1, 1, 1, 0.0F, false));
		flashider3.cubeList.add(new ModelBox(flashider3, 90, 424, -0.7071F, -1.0F, -0.75F, 1, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.0F, 0.0F, 2.75F);
		flashider3.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 408, 209, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(1.0F, -1.0F, 2.75F);
		flashider3.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, -0.7854F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 206, 408, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.0F, -1.0F, 2.75F);
		flashider3.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, -0.7854F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 194, 408, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.0F, 0.0F, 2.75F);
		flashider3.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, -0.7854F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 104, 408, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		mk12gasblock3 = new ModelRenderer(this);
		mk12gasblock3.setRotationPoint(1.5F, 37.8929F, 40.501F);
		barrel115.addChild(mk12gasblock3);
		mk12gasblock3.cubeList.add(new ModelBox(mk12gasblock3, 218, 408, -1.2929F, -38.5929F, -53.5F, 1, 1, 5, 0.0F, false));
		mk12gasblock3.cubeList.add(new ModelBox(mk12gasblock3, 410, 247, -2.0F, -40.8F, -48.0F, 1, 1, 4, 0.0F, false));
		mk12gasblock3.cubeList.add(new ModelBox(mk12gasblock3, 404, 314, -2.0F, -40.8F, -29.7F, 1, 1, 6, 0.0F, false));
		mk12gasblock3.cubeList.add(new ModelBox(mk12gasblock3, 408, 279, -2.7071F, -38.5929F, -53.5F, 1, 1, 5, 0.0F, false));
		mk12gasblock3.cubeList.add(new ModelBox(mk12gasblock3, 408, 300, -2.0F, -37.8858F, -53.5F, 1, 1, 5, 0.0F, false));
		mk12gasblock3.cubeList.add(new ModelBox(mk12gasblock3, 398, 417, -2.0F, -36.8858F, -53.5F, 1, 1, 2, 0.0F, false));
		mk12gasblock3.cubeList.add(new ModelBox(mk12gasblock3, 310, 406, -2.0F, -40.1858F, -53.5F, 1, 2, 5, 0.0F, false));
		mk12gasblock3.cubeList.add(new ModelBox(mk12gasblock3, 404, 417, -2.0F, -40.8929F, -52.7929F, 1, 1, 2, 0.0F, false));
		mk12gasblock3.cubeList.add(new ModelBox(mk12gasblock3, 410, 252, -2.0F, -41.2179F, -51.7929F, 1, 1, 4, -0.15F, false));
		mk12gasblock3.cubeList.add(new ModelBox(mk12gasblock3, 94, 424, -2.0F, -40.2279F, -48.7929F, 1, 1, 1, -0.15F, false));
		mk12gasblock3.cubeList.add(new ModelBox(mk12gasblock3, 410, 267, -2.495F, -40.7229F, -51.7929F, 1, 1, 4, -0.15F, false));
		mk12gasblock3.cubeList.add(new ModelBox(mk12gasblock3, 412, 239, -1.505F, -40.7229F, -51.7929F, 1, 1, 4, -0.15F, false));
		mk12gasblock3.cubeList.add(new ModelBox(mk12gasblock3, 412, 387, -2.5F, -38.0858F, -50.7F, 2, 2, 2, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-2.0F, -37.5929F, -48.0F);
		mk12gasblock3.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, -0.7854F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 408, 306, -0.5F, -0.5F, -5.5F, 1, 1, 5, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-1.5F, -39.8322F, -52.4393F);
		mk12gasblock3.addChild(cube_r22);
		setRotationAngle(cube_r22, -0.7854F, 0.0F, 0.0F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 98, 424, -0.5F, -0.5F, -1.0F, 1, 1, 1, 0.0F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-1.85F, -39.8729F, -50.7929F);
		mk12gasblock3.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, 0.7854F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 412, 45, -0.5F, -0.5F, -1.0F, 1, 1, 4, -0.15F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-1.15F, -39.8729F, -50.7929F);
		mk12gasblock3.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, 0.7854F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 410, 407, -0.5F, -0.5F, -1.0F, 1, 1, 4, -0.15F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-1.85F, -40.5729F, -50.7929F);
		mk12gasblock3.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.0F, 0.7854F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 410, 262, -0.5F, -0.5F, -1.0F, 1, 1, 4, -0.15F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-1.15F, -40.5729F, -50.7929F);
		mk12gasblock3.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, 0.7854F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 410, 257, -0.5F, -0.5F, -1.0F, 1, 1, 4, -0.15F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(-1.0F, -37.5929F, -48.0F);
		mk12gasblock3.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, 0.0F, -0.7854F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 408, 273, -0.5F, -0.5F, -5.5F, 1, 1, 5, 0.0F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-2.0F, -38.5929F, -48.0F);
		mk12gasblock3.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, 0.0F, -0.7854F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 242, 408, -0.5F, -0.5F, -5.5F, 1, 1, 5, 0.0F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(-1.0F, -38.5929F, -48.0F);
		mk12gasblock3.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.0F, 0.0F, -0.7854F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 230, 408, -0.5F, -0.5F, -5.5F, 1, 1, 5, 0.0F, false));
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