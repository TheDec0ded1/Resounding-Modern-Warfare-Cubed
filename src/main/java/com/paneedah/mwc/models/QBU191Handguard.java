package com.paneedah.mwc.models;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBU191Handguard extends ModelBase {
	private final ModelRenderer handguardQBU;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;

	public QBU191Handguard() {
		textureWidth = 416;
		textureHeight = 416;

		handguardQBU = new ModelRenderer(this);
		handguardQBU.setRotationPoint(0.0F, 46.6F, 2.5F);
		handguardQBU.cubeList.add(new ModelBox(handguardQBU, 328, 193, -3.0F, -61.8F, -37.0F, 3, 1, 5, -0.1F, false));
		handguardQBU.cubeList.add(new ModelBox(handguardQBU, 74, 313, -4.9799F, -59.8201F, -38.0F, 2, 3, 6, -0.1F, false));
		handguardQBU.cubeList.add(new ModelBox(handguardQBU, 56, 331, -0.0201F, -59.8201F, -38.0F, 2, 3, 6, -0.1F, false));
		handguardQBU.cubeList.add(new ModelBox(handguardQBU, 248, 0, -3.0F, -61.75F, -74.3F, 3, 1, 39, -0.1F, false));
		handguardQBU.cubeList.add(new ModelBox(handguardQBU, 384, 267, -3.0F, -63.25F, -72.9F, 3, 2, 5, -0.4F, false));
		handguardQBU.cubeList.add(new ModelBox(handguardQBU, 368, 311, -3.0F, -62.7689F, -74.426F, 3, 2, 3, -0.4F, false));
		handguardQBU.cubeList.add(new ModelBox(handguardQBU, 234, 396, -3.0F, -64.3761F, -70.5456F, 1, 2, 2, -0.4F, false));
		handguardQBU.cubeList.add(new ModelBox(handguardQBU, 328, 312, -3.3F, -64.3761F, -70.5456F, 4, 2, 2, -0.6F, false));
		handguardQBU.cubeList.add(new ModelBox(handguardQBU, 240, 396, -1.0F, -64.3761F, -70.5456F, 1, 2, 2, -0.4F, false));
		handguardQBU.cubeList.add(new ModelBox(handguardQBU, 384, 146, -4.0F, -57.1F, -37.1F, 5, 3, 5, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.6546F, -56.8984F, -54.75F);
		handguardQBU.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 1.5708F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 384, 194, -2.9425F, -1.2546F, 16.05F, 3, 1, 3, -0.1F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.6546F, -56.8984F, -54.75F);
		handguardQBU.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 392, 0.0864F, -0.8464F, 16.25F, 1, 3, 3, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 138, 395, 0.0864F, -0.8464F, -19.75F, 1, 3, 2, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 90, 395, 0.0864F, -0.8464F, -13.75F, 1, 3, 2, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 66, 395, 0.0864F, -0.8464F, -7.75F, 1, 3, 2, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 42, 395, 0.0864F, -0.8464F, -1.75F, 1, 3, 2, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 28, 394, 0.0864F, -0.8464F, 4.25F, 1, 3, 2, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 166, 315, 0.0864F, -0.8464F, 10.25F, 1, 3, 2, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 250, 277, -0.0136F, 1.0536F, -19.25F, 1, 1, 38, -0.2F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 248, 120, -0.0136F, -1.0465F, -19.65F, 1, 1, 39, -0.2F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-3.6546F, -59.7833F, -85.75F);
		handguardQBU.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -2.3562F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 318, 395, 0.0864F, -0.8464F, 11.25F, 1, 3, 2, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 126, 395, 0.0864F, -0.8464F, 17.25F, 1, 3, 2, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 78, 395, 0.0864F, -0.8464F, 23.25F, 1, 3, 2, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 54, 395, 0.0864F, -0.8464F, 29.25F, 1, 3, 2, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 192, 394, 0.0864F, -0.8464F, 35.25F, 1, 3, 2, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 146, 390, 0.0864F, -0.8464F, 47.25F, 1, 3, 3, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 166, 305, 0.0864F, -0.8464F, 41.25F, 1, 3, 2, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 248, 199, -0.0136F, 1.0536F, 11.75F, 1, 1, 38, -0.2F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 248, 80, -0.0136F, -1.0465F, 11.35F, 1, 1, 39, -0.2F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-2.9425F, -56.1862F, -85.75F);
		handguardQBU.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 2.3562F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 268, 395, 0.0864F, -0.8464F, 11.25F, 1, 3, 2, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 96, 395, 0.0864F, -0.8464F, 17.25F, 1, 3, 2, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 72, 395, 0.0864F, -0.8464F, 23.25F, 1, 3, 2, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 48, 395, 0.0864F, -0.8464F, 29.25F, 1, 3, 2, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 186, 394, 0.0864F, -0.8464F, 35.25F, 1, 3, 2, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 34, 391, 0.0864F, -0.8464F, 47.25F, 1, 3, 3, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 166, 310, 0.0864F, -0.8464F, 41.25F, 1, 3, 2, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 250, 238, -0.0136F, 1.0536F, 11.75F, 1, 1, 38, -0.2F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 92, 248, -0.0136F, -1.0464F, 11.35F, 1, 1, 39, -0.2F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(1.3142F, -60.66F, -70.5F);
		handguardQBU.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 132, 395, -1.0F, -1.7F, -4.0F, 1, 3, 2, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 84, 395, -1.0F, -1.7F, 2.0F, 1, 3, 2, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 60, 395, -1.0F, -1.7F, 8.0F, 1, 3, 2, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 198, 394, -1.0F, -1.7F, 14.0F, 1, 3, 2, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 166, 320, -1.0F, -1.7F, 20.0F, 1, 3, 2, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 268, 389, -1.0F, -1.7F, 32.0F, 1, 3, 3, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 166, 300, -1.0F, -1.7F, 26.0F, 1, 3, 2, -0.3F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-2.9425F, -56.1862F, -54.75F);
		handguardQBU.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 3.1416F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 352, 312, -2.9425F, -1.2546F, 16.05F, 3, 1, 3, -0.1F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-8.7454F, -63.8741F, -54.35F);
		handguardQBU.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -1.5708F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 148, 326, -8.9425F, 7.7454F, -19.95F, 1, 1, 36, -0.1F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-10.7454F, -63.8741F, -54.35F);
		handguardQBU.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -1.5708F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 74, 325, -8.9425F, 7.7454F, -19.95F, 1, 1, 36, -0.1F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-6.8362F, -57.7833F, -54.35F);
		handguardQBU.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -1.5708F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 324, 316, -0.9425F, 7.7454F, -19.95F, 1, 1, 36, -0.1F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-6.8362F, -59.7833F, -54.35F);
		handguardQBU.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -1.5708F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 250, 316, -0.9425F, 7.7454F, -19.95F, 1, 1, 36, -0.1F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-3.6546F, -57.7833F, -54.35F);
		handguardQBU.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -1.5708F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 294, -0.9425F, -1.2546F, -19.95F, 1, 1, 36, -0.1F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-3.6546F, -59.7833F, -54.35F);
		handguardQBU.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -1.5708F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 178, 394, -2.4425F, -1.2546F, -19.95F, 2, 1, 2, -0.1F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 178, 397, -4.8425F, 1.0704F, -19.95F, 1, 2, 2, -0.1F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 170, 394, -2.4425F, 4.5704F, -19.95F, 2, 1, 2, -0.1F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 398, 356, -2.4425F, 4.5704F, -13.95F, 2, 1, 1, -0.1F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 398, 354, -2.4425F, -1.2546F, -13.95F, 2, 1, 1, -0.1F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 400, 198, -4.8425F, 1.0704F, -13.95F, 1, 2, 1, -0.1F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 398, 352, -2.4425F, 4.5704F, -8.95F, 2, 1, 1, -0.1F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 398, 350, -2.4425F, -1.2546F, -8.95F, 2, 1, 1, -0.1F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 400, 190, -4.8425F, 1.0704F, -8.95F, 1, 2, 1, -0.1F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 398, 348, -2.4425F, 4.5704F, -3.95F, 2, 1, 1, -0.1F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 398, 346, -2.4425F, -1.2546F, -3.95F, 2, 1, 1, -0.1F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 400, 187, -4.8425F, 1.0704F, -3.95F, 1, 2, 1, -0.1F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 398, 344, -2.4425F, 4.5704F, 1.05F, 2, 1, 1, -0.1F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 398, 342, -2.4425F, -1.2546F, 1.05F, 2, 1, 1, -0.1F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 400, 184, -4.8425F, 1.0704F, 1.05F, 1, 2, 1, -0.1F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 398, 340, -2.4425F, 4.5704F, 6.05F, 2, 1, 1, -0.1F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 398, 338, -2.4425F, -1.2546F, 6.05F, 2, 1, 1, -0.1F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 400, 181, -4.8425F, 1.0704F, 6.05F, 1, 2, 1, -0.1F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 400, 178, -4.8425F, 1.0704F, 11.05F, 1, 2, 1, -0.1F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 398, 336, -2.4425F, 4.5704F, 11.05F, 2, 1, 1, -0.1F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 398, 334, -2.4425F, -1.2546F, 11.05F, 2, 1, 1, -0.1F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 92, 288, -0.9425F, -1.2546F, -19.95F, 1, 1, 36, -0.1F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 340, 312, -2.9425F, -1.2546F, 15.65F, 3, 1, 3, -0.1F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(1.1728F, -57.8316F, -35.0F);
		handguardQBU.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, -0.7854F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 172, 248, 1.0F, -1.7F, -39.0F, 1, 1, 38, -0.2F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(1.3142F, -60.5186F, -35.4F);
		handguardQBU.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, -0.7854F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 248, 40, -1.0F, -2.0F, -39.0F, 1, 1, 39, -0.2F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-1.5F, -63.2305F, -70.378F);
		handguardQBU.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.3927F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 384, 274, -1.5F, -1.0F, -4.1F, 3, 2, 5, -0.4F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(1.3142F, -54.7988F, -33.0F);
		handguardQBU.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, -0.7854F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 384, 281, 0.0F, -3.0F, -4.0F, 2, 2, 5, -0.1F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-4.3142F, -54.7988F, -33.0F);
		handguardQBU.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, -0.7854F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 208, 371, 1.0F, -2.0F, -4.0F, 2, 2, 5, -0.1F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-0.1F, -59.013F, -33.0F);
		handguardQBU.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, -0.7854F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 208, 363, 0.0F, -2.0F, -4.0F, 2, 3, 5, -0.1F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-2.9F, -59.013F, -33.0F);
		handguardQBU.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, -0.7854F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 384, 260, -1.0F, -2.0F, -4.0F, 3, 2, 5, -0.1F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-0.7F, -62.775F, -79.95F);
		handguardQBU.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 398, 358, -1.8F, -0.2F, 12.05F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 18, 392, -1.8F, -0.2F, 13.3F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 398, 360, -1.8F, -0.2F, 14.55F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 398, 362, -1.8F, -0.2F, 15.8F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 398, 364, -1.8F, -0.2F, 17.05F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 380, 398, -1.8F, -0.2F, 18.3F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 26, 399, -1.8F, -0.2F, 19.55F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 32, 399, -1.8F, -0.2F, 20.8F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 154, 399, -1.8F, -0.2F, 22.05F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 160, 399, -1.8F, -0.2F, 23.3F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 166, 399, -1.8F, -0.2F, 24.55F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 172, 399, -1.8F, -0.2F, 25.8F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 184, 399, -1.8F, -0.2F, 27.05F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 190, 399, -1.8F, -0.2F, 28.3F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 196, 399, -1.8F, -0.2F, 29.55F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 308, 399, -1.8F, -0.2F, 30.8F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 386, 399, -1.8F, -0.2F, 32.05F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 392, 399, -1.8F, -0.2F, 33.3F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 398, 399, -1.8F, -0.2F, 34.55F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 400, 0, -1.8F, -0.2F, 35.8F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 400, 2, -1.8F, -0.2F, 37.05F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 400, 4, -1.8F, -0.2F, 38.3F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 6, 400, -1.8F, -0.2F, 39.55F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 400, 6, -1.8F, -0.2F, 40.8F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 400, 8, -1.8F, -0.2F, 42.05F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 400, 10, -1.8F, -0.2F, 43.3F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 12, 400, -1.8F, -0.2F, 44.55F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 400, 12, -1.8F, -0.2F, 45.8F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 400, 14, -1.8F, -0.2F, 47.05F, 2, 1, 1, -0.198F, false));
		bone2.cubeList.add(new ModelBox(bone2, 248, 160, -1.7F, 0.4F, 9.85F, 2, 1, 38, -0.001F, false));
		bone2.cubeList.add(new ModelBox(bone2, 172, 287, -1.9F, 0.4F, 9.85F, 1, 1, 38, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.6F, 0.0F, -1.25F);
		bone2.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.8901F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 326, 199, -0.25F, -0.05F, 13.2F, 1, 1, 36, -0.35F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 400, 272, -0.2F, -0.2F, 48.3F, 1, 1, 1, -0.197F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 400, 274, -0.2F, -0.2F, 47.05F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 400, 276, -0.2F, -0.2F, 45.8F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 278, 400, -0.2F, -0.2F, 44.55F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 400, 278, -0.2F, -0.2F, 43.3F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 282, 400, -0.2F, -0.2F, 42.05F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 286, 400, -0.2F, -0.2F, 40.8F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 290, 400, -0.2F, -0.2F, 39.55F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 294, 400, -0.2F, -0.2F, 38.3F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 298, 400, -0.2F, -0.2F, 37.05F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 302, 400, -0.2F, -0.2F, 35.8F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 318, 400, -0.2F, -0.2F, 34.55F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 322, 400, -0.2F, -0.2F, 33.3F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 326, 400, -0.2F, -0.2F, 32.05F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 380, 400, -0.2F, -0.2F, 30.8F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 400, 395, -0.2F, -0.2F, 29.55F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 400, 397, -0.2F, -0.2F, 28.3F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 401, -0.2F, -0.2F, 27.05F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 401, -0.2F, -0.2F, 25.8F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 28, 401, -0.2F, -0.2F, 24.55F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 32, 401, -0.2F, -0.2F, 23.3F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 154, 401, -0.2F, -0.2F, 22.05F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 158, 401, -0.2F, -0.2F, 20.8F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 162, 401, -0.2F, -0.2F, 19.55F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 166, 401, -0.2F, -0.2F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 170, 401, -0.2F, -0.2F, 17.05F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 174, 401, -0.2F, -0.2F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 204, 394, -0.2F, -0.2F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 178, 401, -0.2F, -0.2F, 13.3F, 1, 1, 1, -0.198F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 0.0F, -1.25F);
		bone2.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.8901F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 328, 40, -0.75F, -0.05F, 13.2F, 1, 1, 36, -0.35F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 182, 401, -0.8F, -0.2F, 48.3F, 1, 1, 1, -0.197F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 186, 401, -0.8F, -0.2F, 47.05F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 190, 401, -0.8F, -0.2F, 45.8F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 194, 401, -0.8F, -0.2F, 44.55F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 198, 401, -0.8F, -0.2F, 43.3F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 306, 401, -0.8F, -0.2F, 42.05F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 310, 401, -0.8F, -0.2F, 40.8F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 384, 401, -0.8F, -0.2F, 39.55F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 388, 401, -0.8F, -0.2F, 38.3F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 392, 401, -0.8F, -0.2F, 37.05F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 396, 401, -0.8F, -0.2F, 35.8F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 400, 401, -0.8F, -0.2F, 34.55F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 4, 402, -0.8F, -0.2F, 33.3F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 8, 402, -0.8F, -0.2F, 32.05F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 12, 402, -0.8F, -0.2F, 30.8F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 16, 402, -0.8F, -0.2F, 29.55F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 20, 402, -0.8F, -0.2F, 28.3F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 402, 35, -0.8F, -0.2F, 27.05F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 36, 402, -0.8F, -0.2F, 25.8F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 402, 37, -0.8F, -0.2F, 24.55F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 402, 39, -0.8F, -0.2F, 23.3F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 40, 402, -0.8F, -0.2F, 22.05F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 402, 41, -0.8F, -0.2F, 20.8F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 402, 43, -0.8F, -0.2F, 19.55F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 44, 402, -0.8F, -0.2F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 402, 45, -0.8F, -0.2F, 17.05F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 402, 47, -0.8F, -0.2F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 202, 400, -0.8F, -0.2F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 48, 402, -0.8F, -0.2F, 13.3F, 1, 1, 1, -0.198F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handguardQBU.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}