package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FALmlokOSW extends ModelBase {
	private final ModelRenderer handguardDSA;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r14;
	private final ModelRenderer bone12;
	private final ModelRenderer bone13;
	private final ModelRenderer bone14;
	private final ModelRenderer rail3;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r13;

	public FALmlokOSW() {
		textureWidth = 384;
		textureHeight = 384;

		handguardDSA = new ModelRenderer(this);
		handguardDSA.setRotationPoint(0.0F, 24.0F, 1.0F);
		handguardDSA.cubeList.add(new ModelBox(handguardDSA, 96, 271, -2.5F, -41.8F, -50.65F, 2, 1, 22, 0.0F, false));
		handguardDSA.cubeList.add(new ModelBox(handguardDSA, 288, 190, -3.0F, -40.9032F, -50.6436F, 3, 1, 21, 0.0F, false));
		handguardDSA.cubeList.add(new ModelBox(handguardDSA, 360, 157, -3.0F, -34.6F, -30.55F, 3, 1, 2, -0.1F, false));
		handguardDSA.cubeList.add(new ModelBox(handguardDSA, 146, 365, -0.0201F, -38.5799F, -30.55F, 2, 3, 2, -0.1F, false));
		handguardDSA.cubeList.add(new ModelBox(handguardDSA, 154, 365, -4.9799F, -38.5799F, -30.55F, 2, 3, 2, -0.1F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.1929F, -34.9728F, -29.55F);
		handguardDSA.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 162, 365, -1.5F, -2.5F, -1.0F, 2, 3, 2, -0.1F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.6071F, -34.9728F, -29.55F);
		handguardDSA.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -0.7854F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 52, 192, -1.5F, -1.5F, -1.0F, 3, 2, 2, -0.1F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(-1.5F, -33.6606F, -51.1436F);
		handguardDSA.addChild(bone12);
		bone12.cubeList.add(new ModelBox(bone12, 144, 268, 0.5F, -0.5F, -1.5F, 1, 1, 23, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 250, 90, -1.5F, -0.5F, -1.5F, 1, 1, 23, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 364, 327, -0.5F, -0.5F, 17.5F, 1, 1, 4, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 374, 275, -0.5F, -0.5F, 12.5F, 1, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 374, 277, -0.5F, -0.5F, 7.5F, 1, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 302, 375, -0.5F, -0.5F, 2.5F, 1, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 266, 138, -1.5F, -1.5F, -6.5F, 3, 2, 5, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 250, 114, 2.8713F, -4.6213F, -1.5F, 1, 1, 23, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 252, 0, -3.8713F, -2.6213F, -1.5F, 1, 1, 23, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 316, 233, 1.8713F, -4.6213F, -6.5F, 2, 3, 5, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 144, 29, -4.0287F, -5.0213F, -3.2F, 8, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 144, 31, -4.0287F, -5.0213F, -6.2F, 8, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 306, 375, 2.8713F, -3.6213F, 2.5F, 1, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 374, 279, 2.8713F, -3.6213F, 7.5F, 1, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 374, 281, 2.8713F, -3.6213F, 12.5F, 1, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 40, 365, 2.8713F, -3.6213F, 17.5F, 1, 1, 4, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 252, 50, -3.8713F, -4.6213F, -1.5F, 1, 1, 23, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 192, 268, 2.8713F, -2.6213F, -1.5F, 1, 1, 23, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 144, 0, -3.6213F, -5.1213F, -6.5F, 1, 1, 28, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 132, 169, 2.6213F, -5.1213F, -6.5F, 1, 1, 28, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 282, 374, -3.3713F, -5.6213F, 1.5F, 1, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 374, 311, 2.3713F, -5.6213F, 1.5F, 1, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 374, 313, -3.3713F, -5.6213F, 19.5F, 1, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 374, 315, 2.3713F, -5.6213F, 19.5F, 1, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 120, 317, -3.8713F, -4.6213F, -6.5F, 2, 3, 5, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 310, 375, -3.8713F, -3.6213F, 2.5F, 1, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 374, 317, -3.8713F, -3.6213F, 7.5F, 1, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 374, 319, -3.8713F, -3.6213F, 12.5F, 1, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 50, 365, -3.8713F, -3.6213F, 17.5F, 1, 1, 4, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(-1.5F, -33.6606F, -51.1436F);
		handguardDSA.addChild(bone13);
		setRotationAngle(bone13, 0.0F, 0.0F, -0.7854F);
		bone13.cubeList.add(new ModelBox(bone13, 72, 337, 5.182F, -2.0607F, 2.5F, 1, 1, 17, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 130, 333, 5.182F, -2.0607F, 20.5F, 1, 1, 1, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 188, 354, 5.182F, -2.0607F, 0.5F, 1, 1, 1, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 130, 365, 5.182F, -4.0607F, 0.5F, 1, 2, 3, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 0, 355, 5.182F, -4.0607F, 12.5F, 1, 2, 9, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 60, 355, 5.182F, -4.0607F, 3.5F, 1, 1, 9, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 170, 365, 5.182F, -3.0607F, 9.25F, 1, 1, 1, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 36, 366, 5.182F, -3.0607F, 6.0F, 1, 1, 1, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 240, 268, 2.7071F, 0.4142F, -1.5F, 1, 1, 23, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 48, 270, 0.7071F, 0.4142F, -1.5F, 1, 1, 23, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 60, 365, 1.7071F, 0.4142F, 17.5F, 1, 1, 4, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 374, 321, 1.7071F, 0.4142F, 12.5F, 1, 1, 1, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 374, 323, 1.7071F, 0.4142F, 7.5F, 1, 1, 1, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 314, 375, 1.7071F, 0.4142F, 2.5F, 1, 1, 1, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 300, 233, 0.7071F, -0.5858F, -6.5F, 3, 2, 5, 0.0F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(0.7071F, -34.5748F, -51.1436F);
		handguardDSA.addChild(bone14);
		setRotationAngle(bone14, 0.0F, 0.0F, 0.7854F);
		bone14.cubeList.add(new ModelBox(bone14, 252, 217, -2.6213F, 2.6213F, -1.5F, 1, 1, 23, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 338, 160, -7.0962F, 0.1464F, 2.5F, 1, 1, 17, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 374, 325, -7.0962F, 0.1464F, 20.5F, 1, 1, 1, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 374, 327, -7.0962F, 0.1464F, 0.5F, 1, 1, 1, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 138, 365, -7.0962F, -1.8536F, 0.5F, 1, 2, 3, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 20, 355, -7.0962F, -1.8536F, 12.5F, 1, 2, 9, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 80, 355, -7.0962F, -1.8536F, 3.5F, 1, 1, 9, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 374, 329, -7.0962F, -0.8536F, 9.25F, 1, 1, 1, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 374, 365, -7.0962F, -0.8536F, 6.0F, 1, 1, 1, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 254, 24, -4.6213F, 2.6213F, -1.5F, 1, 1, 23, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 70, 365, -3.6213F, 2.6213F, 17.5F, 1, 1, 4, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 374, 367, -3.6213F, 2.6213F, 12.5F, 1, 1, 1, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 374, 369, -3.6213F, 2.6213F, 7.5F, 1, 1, 1, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 318, 375, -3.6213F, 2.6213F, 2.5F, 1, 1, 1, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 250, 138, -4.6213F, 1.6213F, -6.5F, 3, 2, 5, 0.0F, false));

		rail3 = new ModelRenderer(this);
		rail3.setRotationPoint(-1.5237F, -41.3381F, -41.5868F);
		handguardDSA.addChild(rail3);
		rail3.cubeList.add(new ModelBox(rail3, 278, 371, -0.9737F, -1.0632F, -8.9132F, 2, 1, 1, -0.199F, false));
		rail3.cubeList.add(new ModelBox(rail3, 290, 371, -0.9737F, -1.0632F, -7.6632F, 2, 1, 1, -0.199F, false));
		rail3.cubeList.add(new ModelBox(rail3, 296, 371, -0.9737F, -1.0632F, -6.4132F, 2, 1, 1, -0.199F, false));
		rail3.cubeList.add(new ModelBox(rail3, 302, 371, -0.9737F, -1.0632F, -5.1632F, 2, 1, 1, -0.199F, false));
		rail3.cubeList.add(new ModelBox(rail3, 308, 371, -0.9737F, -1.0632F, -3.9132F, 2, 1, 1, -0.199F, false));
		rail3.cubeList.add(new ModelBox(rail3, 314, 371, -0.9737F, -1.0632F, -9.2632F, 2, 1, 1, -0.199F, false));
		rail3.cubeList.add(new ModelBox(rail3, 320, 371, -0.9737F, -1.0632F, -2.6632F, 2, 1, 1, -0.199F, false));
		rail3.cubeList.add(new ModelBox(rail3, 326, 371, -0.9737F, -1.0632F, -0.1632F, 2, 1, 1, -0.199F, false));
		rail3.cubeList.add(new ModelBox(rail3, 332, 371, -0.9737F, -1.0632F, -1.4132F, 2, 1, 1, -0.199F, false));
		rail3.cubeList.add(new ModelBox(rail3, 338, 371, -0.9737F, -1.0632F, 2.3368F, 2, 1, 1, -0.199F, false));
		rail3.cubeList.add(new ModelBox(rail3, 344, 371, -0.9737F, -1.0632F, 1.0868F, 2, 1, 1, -0.199F, false));
		rail3.cubeList.add(new ModelBox(rail3, 350, 371, -0.9737F, -1.0632F, 4.8368F, 2, 1, 1, -0.199F, false));
		rail3.cubeList.add(new ModelBox(rail3, 356, 371, -0.9737F, -1.0632F, 3.5868F, 2, 1, 1, -0.199F, false));
		rail3.cubeList.add(new ModelBox(rail3, 362, 371, -0.9737F, -1.0632F, 7.3368F, 2, 1, 1, -0.199F, false));
		rail3.cubeList.add(new ModelBox(rail3, 30, 372, -0.9737F, -1.0632F, 8.5368F, 2, 1, 1, -0.198F, false));
		rail3.cubeList.add(new ModelBox(rail3, 368, 371, -0.9737F, -1.0632F, 10.9868F, 2, 1, 1, -0.198F, false));
		rail3.cubeList.add(new ModelBox(rail3, 0, 372, -0.9737F, -1.0632F, 9.7868F, 2, 1, 1, -0.198F, false));
		rail3.cubeList.add(new ModelBox(rail3, 6, 372, -0.9737F, -1.0632F, 12.1368F, 2, 1, 1, -0.198F, false));
		rail3.cubeList.add(new ModelBox(rail3, 12, 372, -0.9737F, -1.0632F, 6.0868F, 2, 1, 1, -0.199F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-14.7737F, -0.3632F, -12.4632F);
		rail3.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.8901F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 190, 292, 8.1719F, -11.2447F, 3.7F, 1, 1, 22, -0.35F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 374, 371, 8.2219F, -11.3947F, 18.55F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 330, 375, 8.2219F, -11.3947F, 21.0F, 1, 1, 1, -0.197F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 112, 375, 8.2219F, -11.3947F, 23.45F, 1, 1, 1, -0.197F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 116, 375, 8.2219F, -11.3947F, 22.25F, 1, 1, 1, -0.197F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 120, 375, 8.2219F, -11.3947F, 24.6F, 1, 1, 1, -0.197F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 168, 375, 8.2219F, -11.3947F, 19.8F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 172, 375, 8.2219F, -11.3947F, 16.05F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 176, 375, 8.2219F, -11.3947F, 17.3F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 180, 375, 8.2219F, -11.3947F, 13.55F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 184, 375, 8.2219F, -11.3947F, 14.8F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 188, 375, 8.2219F, -11.3947F, 11.05F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 192, 375, 8.2219F, -11.3947F, 12.3F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 196, 375, 8.2219F, -11.3947F, 9.8F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 200, 375, 8.2219F, -11.3947F, 8.55F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 204, 375, 8.2219F, -11.3947F, 7.3F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 208, 375, 8.2219F, -11.3947F, 6.05F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 212, 375, 8.2219F, -11.3947F, 4.8F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 216, 375, 8.2219F, -11.3947F, 3.55F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 220, 375, 8.2219F, -11.3947F, 3.2F, 1, 1, 1, -0.198F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-13.1737F, -0.3632F, -12.4632F);
		rail3.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.8901F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 236, 292, 8.4491F, 10.5153F, 3.7F, 1, 1, 22, -0.35F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 224, 375, 8.3991F, 10.3653F, 18.55F, 1, 1, 1, -0.198F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 334, 375, 8.3991F, 10.3653F, 21.0F, 1, 1, 1, -0.197F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 228, 375, 8.3991F, 10.3653F, 23.45F, 1, 1, 1, -0.197F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 232, 375, 8.3991F, 10.3653F, 22.25F, 1, 1, 1, -0.197F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 236, 375, 8.3991F, 10.3653F, 24.6F, 1, 1, 1, -0.197F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 240, 375, 8.3991F, 10.3653F, 19.8F, 1, 1, 1, -0.198F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 244, 375, 8.3991F, 10.3653F, 16.05F, 1, 1, 1, -0.198F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 248, 375, 8.3991F, 10.3653F, 17.3F, 1, 1, 1, -0.198F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 252, 375, 8.3991F, 10.3653F, 13.55F, 1, 1, 1, -0.198F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 256, 375, 8.3991F, 10.3653F, 14.8F, 1, 1, 1, -0.198F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 260, 375, 8.3991F, 10.3653F, 11.05F, 1, 1, 1, -0.198F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 264, 375, 8.3991F, 10.3653F, 12.3F, 1, 1, 1, -0.198F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 268, 375, 8.3991F, 10.3653F, 9.8F, 1, 1, 1, -0.198F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 272, 375, 8.3991F, 10.3653F, 8.55F, 1, 1, 1, -0.198F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 276, 375, 8.3991F, 10.3653F, 7.3F, 1, 1, 1, -0.198F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 286, 375, 8.3991F, 10.3653F, 6.05F, 1, 1, 1, -0.198F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 290, 375, 8.3991F, 10.3653F, 4.8F, 1, 1, 1, -0.198F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 294, 375, 8.3991F, 10.3653F, 3.55F, 1, 1, 1, -0.198F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 298, 375, 8.3991F, 10.3653F, 3.2F, 1, 1, 1, -0.198F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handguardDSA.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}