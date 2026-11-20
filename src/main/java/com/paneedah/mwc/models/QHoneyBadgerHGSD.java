package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QHoneyBadgerHGSD extends ModelBase {
	private final ModelRenderer handguardSD;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer bone5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;

	public QHoneyBadgerHGSD() {
		textureWidth = 400;
		textureHeight = 400;

		handguardSD = new ModelRenderer(this);
		handguardSD.setRotationPoint(0.0F, 24.0F, 0.0F);
		handguardSD.cubeList.add(new ModelBox(handguardSD, 326, 156, -2.501F, -36.5476F, -28.7F, 2, 1, 6, 0.0F, false));
		handguardSD.cubeList.add(new ModelBox(handguardSD, 0, 78, -2.501F, -41.201F, -59.7F, 2, 1, 37, 0.0F, false));
		handguardSD.cubeList.add(new ModelBox(handguardSD, 382, 368, -2.5F, -41.201F, -60.3F, 2, 1, 1, 0.0F, false));
		handguardSD.cubeList.add(new ModelBox(handguardSD, 342, 65, -0.0868F, -38.9618F, -26.7F, 1, 2, 5, 0.0F, false));
		handguardSD.cubeList.add(new ModelBox(handguardSD, 68, 342, -3.9152F, -38.9618F, -26.7F, 1, 2, 5, 0.0F, false));
		handguardSD.cubeList.add(new ModelBox(handguardSD, 152, 37, 0.1132F, -39.1618F, -60.5F, 1, 1, 34, -0.2F, false));
		handguardSD.cubeList.add(new ModelBox(handguardSD, 152, 72, 0.1132F, -37.7618F, -60.5F, 1, 1, 34, -0.2F, false));
		handguardSD.cubeList.add(new ModelBox(handguardSD, 236, 387, -0.0868F, -38.4618F, -31.2F, 1, 1, 1, 0.0F, false));
		handguardSD.cubeList.add(new ModelBox(handguardSD, 240, 387, -0.0868F, -38.4618F, -35.7F, 1, 1, 1, 0.0F, false));
		handguardSD.cubeList.add(new ModelBox(handguardSD, 244, 387, -0.0868F, -38.4618F, -60.2F, 1, 1, 1, 0.0F, false));
		handguardSD.cubeList.add(new ModelBox(handguardSD, 248, 387, -0.0868F, -38.4618F, -60.3F, 1, 1, 1, 0.0F, false));
		handguardSD.cubeList.add(new ModelBox(handguardSD, 280, 388, -0.0868F, -38.4618F, -40.2F, 1, 1, 1, 0.0F, false));
		handguardSD.cubeList.add(new ModelBox(handguardSD, 284, 388, -0.0868F, -38.4618F, -44.7F, 1, 1, 1, 0.0F, false));
		handguardSD.cubeList.add(new ModelBox(handguardSD, 336, 388, -0.0868F, -38.4618F, -53.7F, 1, 1, 1, 0.0F, false));
		handguardSD.cubeList.add(new ModelBox(handguardSD, 340, 388, -0.0868F, -38.4618F, -49.2F, 1, 1, 1, 0.0F, false));
		handguardSD.cubeList.add(new ModelBox(handguardSD, 388, 372, -0.0868F, -38.4618F, -57.7F, 1, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-3.0581F, -37.3168F, -33.25F);
		handguardSD.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 2.3562F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 152, 0, 0.0571F, -1.845F, -27.25F, 1, 1, 36, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 148, 148, 0.0571F, -0.445F, -27.25F, 1, 1, 36, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 388, 152, -0.1429F, -1.145F, 4.05F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 360, 388, -0.1429F, -1.145F, -26.95F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 388, 352, -0.1429F, -1.145F, -22.95F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 352, 388, -0.1429F, -1.145F, -18.45F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 388, 261, -0.1429F, -1.145F, -9.45F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 388, 259, -0.1429F, -1.145F, -13.95F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 388, 150, -0.1429F, -1.145F, -0.45F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 376, 387, -0.1429F, -1.145F, -27.05F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 304, 387, -0.1429F, -1.145F, -4.95F, 1, 1, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-0.501F, -39.6689F, -43.7F);
		handguardSD.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 388, 370, -0.5F, 0.0F, -16.5F, 1, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 388, 344, -0.5F, 0.0F, -12.5F, 1, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 344, 388, -0.5F, 0.0F, -8.0F, 1, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 388, 273, -0.5F, 0.0F, 1.0F, 1, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 388, 271, -0.5F, 0.0F, -3.5F, 1, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 368, 387, -0.5F, 0.0F, -16.6F, 1, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 220, 387, -0.5F, 0.0F, 5.5F, 1, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 216, 387, -0.5F, 0.0F, 10.0F, 1, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 212, 387, -0.5F, 0.0F, 14.5F, 1, 1, 1, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-0.856F, -36.4047F, -55.25F);
		handguardSD.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 0.7854F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 388, 368, -0.1429F, -1.145F, -4.95F, 1, 1, 1, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 332, 388, -0.1429F, -1.145F, -0.95F, 1, 1, 1, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 328, 388, -0.1429F, -1.145F, 3.55F, 1, 1, 1, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 308, 388, -0.1429F, -1.145F, 12.55F, 1, 1, 1, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 288, 388, -0.1429F, -1.145F, 8.05F, 1, 1, 1, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 372, 387, -0.1429F, -1.145F, -5.05F, 1, 1, 1, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 260, 387, -0.1429F, -1.145F, 17.05F, 1, 1, 1, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 256, 387, -0.1429F, -1.145F, 21.55F, 1, 1, 1, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 252, 387, -0.1429F, -1.145F, 26.05F, 1, 1, 1, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 74, 148, 0.0571F, -0.445F, -5.25F, 1, 1, 36, -0.2F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 116, 0.0571F, -1.845F, -5.25F, 1, 1, 36, -0.2F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-2.996F, -39.4568F, -55.25F);
		handguardSD.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -2.3562F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 388, 366, -0.7F, -0.5F, -4.95F, 1, 1, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 348, 388, -0.7F, -0.5F, 3.55F, 1, 1, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 388, 346, -0.7F, -0.5F, -0.95F, 1, 1, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 388, 269, -0.7F, -0.5F, 8.05F, 1, 1, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 388, 267, -0.7F, -0.5F, 12.55F, 1, 1, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 388, 62, -0.7F, -0.5F, -5.05F, 1, 1, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 232, 387, -0.7F, -0.5F, 17.05F, 1, 1, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 228, 387, -0.7F, -0.5F, 21.55F, 1, 1, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 224, 387, -0.7F, -0.5F, 26.05F, 1, 1, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 78, 111, -0.5F, 0.2F, -5.25F, 1, 1, 36, -0.2F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 78, 74, -0.5F, -1.2F, -5.25F, 1, 1, 36, -0.2F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-3.0581F, -37.3168F, -57.25F);
		handguardSD.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -3.1416F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 364, 388, -0.1429F, 0.145F, -0.45F, 1, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 388, 350, -0.1429F, 0.145F, 8.05F, 1, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 388, 348, -0.1429F, 0.145F, 3.55F, 1, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 388, 265, -0.1429F, 0.145F, 12.55F, 1, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 388, 263, -0.1429F, 0.145F, 17.05F, 1, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 300, 387, -0.1429F, 0.145F, -3.05F, 1, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 296, 387, -0.1429F, 0.145F, -2.95F, 1, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 292, 387, -0.1429F, 0.145F, 21.55F, 1, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 276, 387, -0.1429F, 0.145F, 26.05F, 1, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 153, 0.0571F, 0.845F, -3.25F, 1, 1, 34, -0.2F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 152, 107, 0.0571F, -0.555F, -3.25F, 1, 1, 34, -0.2F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-0.856F, -36.4047F, -59.25F);
		handguardSD.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, 1.5708F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 356, 388, -0.1429F, 0.145F, -0.45F, 1, 1, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 324, 388, -0.1429F, 0.145F, 8.05F, 1, 1, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 320, 388, -0.1429F, 0.145F, 3.55F, 1, 1, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 316, 388, -0.1429F, 0.145F, 12.55F, 1, 1, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 312, 388, -0.1429F, 0.145F, 17.05F, 1, 1, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 136, 185, 0.0571F, -0.555F, -1.25F, 1, 1, 32, -0.2F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 70, 185, 0.0571F, 0.845F, -1.25F, 1, 1, 32, -0.2F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 272, 387, -0.1429F, 0.145F, 26.05F, 1, 1, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 268, 387, -0.1429F, 0.145F, -1.05F, 1, 1, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 264, 387, -0.1429F, 0.145F, 21.55F, 1, 1, 1, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.4889F, -38.9618F, -14.6F);
		handguardSD.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, -0.7854F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 78, 37, -0.5F, -0.5F, -45.9F, 1, 1, 36, -0.2F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-0.501F, -39.9517F, -14.6F);
		handguardSD.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, -0.7854F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 78, 0, -0.5F, -0.5F, -45.9F, 1, 1, 36, -0.2F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-1.501F, -37.9618F, -23.7F);
		handguardSD.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, 0.7854F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 80, 376, -2.4142F, -1.0F, -1.0F, 1, 2, 3, 0.0F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 72, 376, 1.4142F, -1.0F, -1.0F, 1, 2, 3, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-1.501F, -37.9618F, -23.7F);
		handguardSD.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, -0.7854F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 64, 376, -2.4142F, -1.0F, -1.0F, 1, 2, 3, 0.0F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 56, 376, 1.4142F, -1.0F, -1.0F, 1, 2, 3, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-1.5152F, -35.8597F, -25.6913F);
		handguardSD.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.3927F, 0.0F, 1.5708F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 208, 387, -0.5F, -0.0408F, 0.6087F, 1, 1, 1, 0.0F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 204, 387, -0.5F, -0.9592F, -1.6087F, 1, 1, 1, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-1.5237F, -41.3381F, -33.2368F);
		handguardSD.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 382, 370, -0.9737F, -0.5632F, -27.2632F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 382, 372, -0.9737F, -0.5629F, -26.9132F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 382, 374, -0.9737F, -0.5632F, -6.4632F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 382, 376, -0.9737F, -0.5632F, -5.2132F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 382, 378, -0.9737F, -0.5632F, -3.9632F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 382, 380, -0.9737F, -0.5632F, -2.7132F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 382, 382, -0.9737F, -0.5632F, -1.4632F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 280, 380, -0.9737F, -0.5632F, 1.0368F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 0, 383, -0.9737F, -0.5632F, -0.2132F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 6, 383, -0.9737F, -0.5632F, 3.5368F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 12, 383, -0.9737F, -0.5632F, 2.2868F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 18, 383, -0.9737F, -0.5632F, 6.0368F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 24, 383, -0.9737F, -0.5632F, 4.7868F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 48, 383, -0.9737F, -0.5632F, -7.7132F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 54, 383, -0.9737F, -0.5632F, -10.2132F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 60, 383, -0.9737F, -0.5632F, -8.9632F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 66, 383, -0.9737F, -0.5632F, -12.7132F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 72, 383, -0.9737F, -0.5632F, -11.4632F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 78, 383, -0.9737F, -0.5632F, -13.9632F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 84, 383, -0.9737F, -0.5632F, -15.2132F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 90, 383, -0.9737F, -0.5632F, -16.4632F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 96, 383, -0.9737F, -0.5632F, -17.7132F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 102, 383, -0.9737F, -0.5632F, -18.9632F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 108, 383, -0.9737F, -0.5632F, -26.4632F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 114, 383, -0.9737F, -0.5632F, -25.2132F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 120, 383, -0.9737F, -0.5632F, -23.9632F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 126, 383, -0.9737F, -0.5632F, -21.4632F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 132, 383, -0.9737F, -0.5632F, -22.7132F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 138, 383, -0.9737F, -0.5632F, -20.2132F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 30, 383, -0.9737F, -0.5632F, 8.5368F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 36, 383, -0.9737F, -0.5632F, 9.7368F, 2, 1, 1, -0.198F, false));
		bone5.cubeList.add(new ModelBox(bone5, 42, 383, -0.9737F, -0.5632F, 7.2868F, 2, 1, 1, -0.199F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-14.7737F, -0.3632F, -12.4632F);
		bone5.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.8901F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, 8.5605F, -10.93F, -14.7F, 1, 1, 38, -0.35F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 388, 154, 8.6105F, -11.08F, 19.75F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 156, 388, 8.6105F, -11.08F, 22.2F, 1, 1, 1, -0.197F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 388, 156, 8.6105F, -11.08F, 21.0F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 388, 158, 8.6105F, -11.08F, 17.25F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 160, 388, 8.6105F, -11.08F, 18.5F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 388, 160, 8.6105F, -11.08F, 14.75F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 388, 162, 8.6105F, -11.08F, 16.0F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 164, 388, 8.6105F, -11.08F, 12.25F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 84, 381, 8.6105F, -11.08F, 13.5F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 388, 164, 8.6105F, -11.08F, 11.0F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 388, 166, 8.6105F, -11.08F, 9.75F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 168, 388, 8.6105F, -11.08F, 8.5F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 388, 168, 8.6105F, -11.08F, 7.25F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 388, 170, 8.6105F, -11.08F, 6.0F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 4, 389, 8.6105F, -11.08F, -6.5F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 8, 389, 8.6105F, -11.08F, -5.25F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 12, 389, 8.6105F, -11.08F, -4.0F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 16, 389, 8.6105F, -11.08F, -2.75F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 20, 389, 8.6105F, -11.08F, -1.5F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 24, 389, 8.6105F, -11.08F, 1.0F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 28, 389, 8.6105F, -11.08F, -0.25F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 32, 389, 8.6105F, -11.08F, 3.5F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 36, 389, 8.6105F, -11.08F, 2.25F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 44, 389, 8.6105F, -11.08F, -7.75F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 48, 389, 8.6105F, -11.08F, -10.25F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 52, 389, 8.6105F, -11.08F, -9.0F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 56, 389, 8.6105F, -11.08F, -11.5F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 60, 389, 8.6105F, -11.08F, -12.75F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 64, 389, 8.6105F, -11.08F, -14.0F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 40, 389, 8.6105F, -11.08F, 4.75F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 172, 388, 8.6105F, -11.08F, -14.8F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 388, 172, 8.6105F, -11.0798F, -14.45F, 1, 1, 1, -0.198F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-13.1737F, -0.3632F, -12.4632F);
		bone5.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.8901F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 39, 8.0605F, 10.83F, -14.7F, 1, 1, 38, -0.35F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 388, 174, 8.0105F, 10.68F, 19.75F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 388, 176, 8.0105F, 10.68F, 22.2F, 1, 1, 1, -0.197F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 388, 178, 8.0105F, 10.68F, 21.0F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 388, 180, 8.0105F, 10.68F, 17.25F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 388, 182, 8.0105F, 10.68F, 18.5F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 184, 388, 8.0105F, 10.68F, 14.75F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 388, 184, 8.0105F, 10.68F, 16.0F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 388, 186, 8.0105F, 10.68F, 12.25F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 176, 383, 8.0105F, 10.68F, 13.5F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 188, 388, 8.0105F, 10.68F, 11.0F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 192, 388, 8.0105F, 10.68F, 9.75F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 388, 249, 8.0105F, 10.68F, 8.5F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 388, 251, 8.0105F, 10.68F, 7.25F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 388, 253, 8.0105F, 10.68F, 6.0F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 388, 374, 8.0105F, 10.68F, -6.5F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 388, 376, 8.0105F, 10.68F, -5.25F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 388, 378, 8.0105F, 10.68F, -4.0F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 380, 388, 8.0105F, 10.68F, -2.75F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 388, 380, 8.0105F, 10.68F, -1.5F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 388, 382, 8.0105F, 10.68F, 1.0F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 384, 388, 8.0105F, 10.68F, -0.25F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 388, 386, 8.0105F, 10.68F, 3.5F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 388, 388, 8.0105F, 10.68F, 2.25F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 68, 389, 8.0105F, 10.68F, -7.75F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 72, 389, 8.0105F, 10.68F, -10.25F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 76, 389, 8.0105F, 10.68F, -9.0F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 80, 389, 8.0105F, 10.68F, -11.5F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 84, 389, 8.0105F, 10.68F, -12.75F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 88, 389, 8.0105F, 10.68F, -14.0F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 389, 8.0105F, 10.68F, 4.75F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 388, 255, 8.0105F, 10.68F, -14.8F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 388, 257, 8.0105F, 10.6802F, -14.45F, 1, 1, 1, -0.198F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handguardSD.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}