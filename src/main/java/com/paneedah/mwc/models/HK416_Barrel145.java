package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class HK416_Barrel145 extends ModelBase {
	private final ModelRenderer barrel145;
	private final ModelRenderer barrel_r1;
	private final ModelRenderer barrel_r2;
	private final ModelRenderer barrel_r3;
	private final ModelRenderer barrel_r4;
	private final ModelRenderer barrel_r5;
	private final ModelRenderer barrel_r6;
	private final ModelRenderer barrel_r7;
	private final ModelRenderer barrel_r8;
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
	private final ModelRenderer cube_r29;

	public HK416_Barrel145() {
		textureWidth = 432;
		textureHeight = 432;

		barrel145 = new ModelRenderer(this);
		barrel145.setRotationPoint(-1.5F, -13.8929F, -39.501F);
		barrel145.cubeList.add(new ModelBox(barrel145, 0, 0, -0.5F, -1.2071F, -17.5F, 1, 1, 36, -0.1F, false));
		barrel145.cubeList.add(new ModelBox(barrel145, 274, 58, -0.5F, -2.9071F, -7.5F, 1, 1, 26, -0.2F, false));
		barrel145.cubeList.add(new ModelBox(barrel145, 0, 37, -1.0657F, -0.6414F, -17.5F, 1, 1, 36, -0.1F, false));
		barrel145.cubeList.add(new ModelBox(barrel145, 0, 74, 0.0657F, -0.6414F, -17.5F, 1, 1, 36, -0.1F, false));
		barrel145.cubeList.add(new ModelBox(barrel145, 0, 111, -0.5F, -0.0757F, -17.5F, 1, 1, 36, -0.1F, false));
		barrel145.cubeList.add(new ModelBox(barrel145, 250, 118, -0.5F, -1.2071F, -28.5F, 1, 1, 7, -0.1F, false));
		barrel145.cubeList.add(new ModelBox(barrel145, 250, 126, -1.0657F, -0.6414F, -28.5F, 1, 1, 7, -0.1F, false));
		barrel145.cubeList.add(new ModelBox(barrel145, 378, 94, 0.0657F, -0.6414F, -28.5F, 1, 1, 7, -0.1F, false));
		barrel145.cubeList.add(new ModelBox(barrel145, 270, 398, -0.5F, -0.0757F, -28.5F, 1, 1, 7, -0.1F, false));
		barrel145.cubeList.add(new ModelBox(barrel145, 312, 112, -0.5F, -1.1321F, -22.2F, 1, 1, 5, -0.15F, false));
		barrel145.cubeList.add(new ModelBox(barrel145, 132, 393, -0.995F, -0.6371F, -22.2F, 1, 1, 5, -0.15F, false));
		barrel145.cubeList.add(new ModelBox(barrel145, 334, 406, -0.005F, -0.6371F, -22.2F, 1, 1, 5, -0.15F, false));
		barrel145.cubeList.add(new ModelBox(barrel145, 56, 407, -0.5F, -0.1422F, -22.2F, 1, 1, 5, -0.15F, false));

		barrel_r1 = new ModelRenderer(this);
		barrel_r1.setRotationPoint(1.0642F, 1.6271F, -31.7F);
		barrel145.addChild(barrel_r1);
		setRotationAngle(barrel_r1, 0.0F, 0.0F, -0.7854F);
		barrel_r1.cubeList.add(new ModelBox(barrel_r1, 68, 407, -0.5F, -2.5F, 9.5F, 1, 1, 5, -0.15F, false));

		barrel_r2 = new ModelRenderer(this);
		barrel_r2.setRotationPoint(-1.0642F, -1.2013F, -31.7F);
		barrel145.addChild(barrel_r2);
		setRotationAngle(barrel_r2, 0.0F, 0.0F, -0.7854F);
		barrel_r2.cubeList.add(new ModelBox(barrel_r2, 44, 407, -0.5F, 1.5F, 9.5F, 1, 1, 5, -0.15F, false));

		barrel_r3 = new ModelRenderer(this);
		barrel_r3.setRotationPoint(1.0642F, 0.9271F, -31.7F);
		barrel145.addChild(barrel_r3);
		setRotationAngle(barrel_r3, 0.0F, 0.0F, -0.7854F);
		barrel_r3.cubeList.add(new ModelBox(barrel_r3, 32, 407, -0.5F, -2.5F, 9.5F, 1, 1, 5, -0.15F, false));

		barrel_r4 = new ModelRenderer(this);
		barrel_r4.setRotationPoint(-1.0642F, -1.9014F, -31.7F);
		barrel145.addChild(barrel_r4);
		setRotationAngle(barrel_r4, 0.0F, 0.0F, -0.7854F);
		barrel_r4.cubeList.add(new ModelBox(barrel_r4, 346, 406, -0.5F, 1.5F, 9.5F, 1, 1, 5, -0.15F, false));

		barrel_r5 = new ModelRenderer(this);
		barrel_r5.setRotationPoint(1.0142F, 1.6728F, -40.0F);
		barrel145.addChild(barrel_r5);
		setRotationAngle(barrel_r5, 0.0F, 0.0F, -0.7854F);
		barrel_r5.cubeList.add(new ModelBox(barrel_r5, 286, 398, -0.5F, -2.5F, 11.5F, 1, 1, 7, -0.1F, false));
		barrel_r5.cubeList.add(new ModelBox(barrel_r5, 74, 111, -0.5F, -2.5F, 22.5F, 1, 1, 36, -0.1F, false));

		barrel_r6 = new ModelRenderer(this);
		barrel_r6.setRotationPoint(-1.0142F, -1.1556F, -40.0F);
		barrel145.addChild(barrel_r6);
		setRotationAngle(barrel_r6, 0.0F, 0.0F, -0.7854F);
		barrel_r6.cubeList.add(new ModelBox(barrel_r6, 254, 398, -0.5F, 1.5F, 11.5F, 1, 1, 7, -0.1F, false));
		barrel_r6.cubeList.add(new ModelBox(barrel_r6, 74, 74, -0.5F, 1.5F, 22.5F, 1, 1, 36, -0.1F, false));

		barrel_r7 = new ModelRenderer(this);
		barrel_r7.setRotationPoint(1.0142F, 0.8728F, -40.0F);
		barrel145.addChild(barrel_r7);
		setRotationAngle(barrel_r7, 0.0F, 0.0F, -0.7854F);
		barrel_r7.cubeList.add(new ModelBox(barrel_r7, 396, 239, -0.5F, -2.5F, 11.5F, 1, 1, 7, -0.1F, false));
		barrel_r7.cubeList.add(new ModelBox(barrel_r7, 74, 37, -0.5F, -2.5F, 22.5F, 1, 1, 36, -0.1F, false));

		barrel_r8 = new ModelRenderer(this);
		barrel_r8.setRotationPoint(-1.0142F, -1.9556F, -40.0F);
		barrel145.addChild(barrel_r8);
		setRotationAngle(barrel_r8, 0.0F, 0.0F, -0.7854F);
		barrel_r8.cubeList.add(new ModelBox(barrel_r8, 394, 94, -0.5F, 1.5F, 11.5F, 1, 1, 7, -0.1F, false));
		barrel_r8.cubeList.add(new ModelBox(barrel_r8, 74, 0, -0.5F, 1.5F, 22.5F, 1, 1, 36, -0.1F, false));

		flashider2 = new ModelRenderer(this);
		flashider2.setRotationPoint(-0.5F, 0.3F, -17.749F);
		barrel145.addChild(flashider2);
		flashider2.cubeList.add(new ModelBox(flashider2, 132, 407, 0.0F, -0.2929F, -15.5F, 1, 1, 5, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 116, 423, -0.7071F, -1.0F, -11.5F, 1, 1, 1, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 120, 423, 0.0F, -1.7071F, -11.5F, 1, 1, 1, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 124, 423, 0.7071F, -1.0F, -11.5F, 1, 1, 1, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 128, 423, 0.7071F, -1.0F, -15.5F, 1, 1, 1, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 132, 423, 0.0F, -1.7071F, -15.5F, 1, 1, 1, 0.0F, false));
		flashider2.cubeList.add(new ModelBox(flashider2, 136, 423, -0.7071F, -1.0F, -15.5F, 1, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.0F, 0.0F, -12.0F);
		flashider2.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 168, 407, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(1.0F, -1.0F, -12.0F);
		flashider2.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, -0.7854F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 156, 407, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.0F, -1.0F, -12.0F);
		flashider2.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, -0.7854F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 144, 407, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.0F, 0.0F, -12.0F);
		flashider2.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, -0.7854F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 80, 407, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		mk12gasblock2 = new ModelRenderer(this);
		mk12gasblock2.setRotationPoint(1.5F, 37.8929F, 40.501F);
		barrel145.addChild(mk12gasblock2);
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 398, 407, -1.2929F, -38.5929F, -53.5F, 1, 1, 5, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 302, 53, -2.0F, -40.8F, -48.0F, 1, 1, 4, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 180, 399, -2.0F, -40.8F, -29.7F, 1, 1, 6, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 408, 26, -2.7071F, -38.5929F, -53.5F, 1, 1, 5, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 408, 32, -2.0F, -37.8858F, -53.5F, 1, 1, 5, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 386, 417, -2.0F, -36.8858F, -53.5F, 1, 1, 2, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 32, 400, -2.0F, -40.1858F, -53.5F, 1, 2, 5, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 392, 417, -2.0F, -40.8929F, -52.7929F, 1, 1, 2, 0.0F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 410, 202, -2.0F, -41.2179F, -51.7929F, 1, 1, 4, -0.15F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 12, 424, -2.0F, -40.2279F, -48.7929F, 1, 1, 1, -0.15F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 394, 296, -2.495F, -40.7229F, -51.7929F, 1, 1, 4, -0.15F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 410, 197, -1.505F, -40.7229F, -51.7929F, 1, 1, 4, -0.15F, false));
		mk12gasblock2.cubeList.add(new ModelBox(mk12gasblock2, 408, 215, -2.5F, -38.0858F, -50.7F, 2, 2, 2, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-2.0F, -37.5929F, -48.0F);
		mk12gasblock2.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, -0.7854F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 92, 408, -0.5F, -0.5F, -5.5F, 1, 1, 5, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-1.5F, -39.8322F, -52.4393F);
		mk12gasblock2.addChild(cube_r22);
		setRotationAngle(cube_r22, -0.7854F, 0.0F, 0.0F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 8, 424, -0.5F, -0.5F, -1.0F, 1, 1, 1, 0.0F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-1.85F, -39.8729F, -50.7929F);
		mk12gasblock2.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, 0.7854F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 410, 192, -0.5F, -0.5F, -1.0F, 1, 1, 4, -0.15F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-1.15F, -39.8729F, -50.7929F);
		mk12gasblock2.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, 0.7854F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 402, 45, -0.5F, -0.5F, -1.0F, 1, 1, 4, -0.15F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-1.85F, -40.5729F, -50.7929F);
		mk12gasblock2.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.0F, 0.7854F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 384, 296, -0.5F, -0.5F, -1.0F, 1, 1, 4, -0.15F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-1.15F, -40.5729F, -50.7929F);
		mk12gasblock2.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, 0.7854F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 312, 53, -0.5F, -0.5F, -1.0F, 1, 1, 4, -0.15F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(-1.0F, -37.5929F, -48.0F);
		mk12gasblock2.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, 0.0F, -0.7854F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 408, 20, -0.5F, -0.5F, -5.5F, 1, 1, 5, 0.0F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-2.0F, -38.5929F, -48.0F);
		mk12gasblock2.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, 0.0F, -0.7854F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 12, 408, -0.5F, -0.5F, -5.5F, 1, 1, 5, 0.0F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(-1.0F, -38.5929F, -48.0F);
		mk12gasblock2.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.0F, 0.0F, -0.7854F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 408, -0.5F, -0.5F, -5.5F, 1, 1, 5, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		barrel145.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}