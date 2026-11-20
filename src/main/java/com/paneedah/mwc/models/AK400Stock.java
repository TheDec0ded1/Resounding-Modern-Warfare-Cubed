package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AK400Stock extends ModelBase {
	private final ModelRenderer stock2;
	private final ModelRenderer bone;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer cheekRiser;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer trunnionBits;

	public AK400Stock() {
		textureWidth = 416;
		textureHeight = 416;

		stock2 = new ModelRenderer(this);
		stock2.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		stock2.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 378, 0, -3.5F, -35.4F, 3.0F, 4, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 349, 120, -2.5F, -36.4F, 5.0F, 2, 1, 11, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 394, 122, -2.5F, -36.4F, 15.95F, 2, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 332, 230, -2.5F, -36.4F, 23.95F, 2, 2, 5, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 281, 390, -2.5F, -22.5716F, 27.95F, 2, 2, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 385, -2.5F, -36.4F, 28.95F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 31, 385, -2.5F, -22.5716F, 28.95F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 378, 5, -3.5F, -35.4F, 5.0F, 4, 5, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 382, 259, -3.5F, -33.4F, 3.0F, 4, 3, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 135, 385, -3.5F, -33.4F, 4.0F, 4, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 385, 140, -3.5F, -31.4F, 4.0F, 4, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 158, 393, -2.0F, -28.0F, 25.1F, 1, 3, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 142, 394, -2.0F, -28.0F, 24.275F, 1, 3, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 397, 239, -2.0F, -25.7F, 24.375F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 397, 242, -2.0F, -26.0F, 26.1F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 397, 245, -2.0F, -28.0F, 26.1F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 324, 368, -2.0F, -28.0F, 27.1F, 1, 6, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 397, 248, -2.0F, -22.2F, 27.1F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 397, 251, -2.0F, -22.2F, 26.3F, 1, 1, 1, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, -7.0F, 39.0F);
		stock2.addChild(bone4);
		setRotationAngle(bone4, 0.7854F, 0.0F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 388, 242, -2.5F, -44.8306F, -5.2527F, 2, 1, 2, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, -7.0F, 39.0F);
		stock2.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 352, 315, -3.9142F, -27.9858F, -33.0F, 2, 3, 10, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 349, 133, -2.5142F, -28.4858F, -33.0F, 2, 4, 10, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 349, 148, -2.5142F, -28.7358F, -24.7F, 2, 4, 10, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 48, 357, -1.8142F, -26.7358F, -20.7F, 1, 1, 10, 0.2F, false));
		bone5.cubeList.add(new ModelBox(bone5, 198, 382, -1.8142F, -25.7358F, -14.7F, 1, 1, 4, -0.2F, false));
		bone5.cubeList.add(new ModelBox(bone5, 348, 255, -1.8142F, -25.1358F, -14.7F, 1, 1, 4, -0.2F, false));
		bone5.cubeList.add(new ModelBox(bone5, 378, 163, -1.8142F, -24.5358F, -14.7F, 1, 1, 4, -0.2F, false));
		bone5.cubeList.add(new ModelBox(bone5, 40, 385, -2.5142F, -25.0358F, -16.1F, 2, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 252, 397, -2.0F, -24.2206F, -16.4529F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 97, 357, -2.7142F, -28.5358F, -24.8F, 1, 1, 10, 0.1F, false));
		bone5.cubeList.add(new ModelBox(bone5, 143, 368, -2.7142F, -25.9358F, -24.8F, 1, 1, 9, 0.1F, false));
		bone5.cubeList.add(new ModelBox(bone5, 164, 368, -1.3142F, -25.9358F, -24.8F, 1, 1, 9, 0.1F, false));
		bone5.cubeList.add(new ModelBox(bone5, 120, 357, -1.3142F, -28.5358F, -24.8F, 1, 1, 10, 0.1F, false));
		bone5.cubeList.add(new ModelBox(bone5, 252, 357, -2.0142F, -29.2358F, -24.7F, 1, 1, 10, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 221, 368, -2.0142F, -25.2358F, -24.7F, 1, 1, 9, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 351, 0, -3.0142F, -25.3858F, -33.0F, 3, 2, 10, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 255, 27, -3.7142F, -24.4858F, -29.6F, 2, 1, 7, -0.4F, false));
		bone5.cubeList.add(new ModelBox(bone5, 171, 260, -3.7142F, -23.9858F, -29.6F, 2, 1, 7, -0.4F, false));
		bone5.cubeList.add(new ModelBox(bone5, 274, 27, -1.3142F, -23.9858F, -29.6F, 2, 1, 7, -0.4F, false));
		bone5.cubeList.add(new ModelBox(bone5, 303, 261, -1.3142F, -24.4858F, -29.6F, 2, 1, 7, -0.4F, false));
		bone5.cubeList.add(new ModelBox(bone5, 227, 356, -3.6642F, -25.0858F, -33.0F, 2, 1, 10, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 306, 356, -1.3392F, -25.0858F, -33.0F, 2, 1, 10, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 233, 382, -1.3392F, -24.3858F, -32.2F, 2, 1, 3, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 244, 382, -3.6642F, -24.3858F, -32.2F, 2, 1, 3, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 348, 353, -1.0892F, -27.9858F, -33.0F, 2, 3, 10, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 72, 339, -3.9142F, -27.9858F, -11.05F, 3, 13, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 107, 276, -1.0892F, -27.9858F, -11.05F, 2, 13, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 161, 271, -1.0892F, -27.9858F, -10.05F, 2, 13, 2, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 0, 369, -3.9142F, -27.9858F, -10.05F, 3, 13, 2, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 389, 44, -0.8858F, -28.1858F, -23.85F, 2, 1, 2, -0.2F, false));
		bone5.cubeList.add(new ModelBox(bone5, 389, 24, -4.1142F, -28.1858F, -23.85F, 2, 1, 2, -0.2F, false));
		bone5.cubeList.add(new ModelBox(bone5, 394, 125, -0.8858F, -28.1858F, -15.25F, 2, 1, 1, -0.2F, false));
		bone5.cubeList.add(new ModelBox(bone5, 394, 143, -4.1142F, -28.1858F, -15.25F, 2, 1, 1, -0.2F, false));
		bone5.cubeList.add(new ModelBox(bone5, 163, 394, -0.8858F, -28.1858F, -14.85F, 2, 1, 1, -0.2F, false));
		bone5.cubeList.add(new ModelBox(bone5, 254, 394, -4.1142F, -28.1858F, -14.85F, 2, 1, 1, -0.2F, false));
		bone5.cubeList.add(new ModelBox(bone5, 378, 169, -4.1142F, -28.1858F, -14.25F, 1, 1, 4, -0.2F, false));
		bone5.cubeList.add(new ModelBox(bone5, 251, 171, -4.225F, -21.5356F, -15.0702F, 4, 1, 5, -0.3F, false));
		bone5.cubeList.add(new ModelBox(bone5, 308, 20, -1.775F, -21.5356F, -15.0702F, 3, 1, 5, -0.3F, false));
		bone5.cubeList.add(new ModelBox(bone5, 378, 175, 0.1142F, -28.1858F, -14.25F, 1, 1, 4, -0.2F, false));
		bone5.cubeList.add(new ModelBox(bone5, 107, 291, -3.9142F, -25.3858F, -33.0F, 2, 2, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 389, 118, -1.0892F, -25.3858F, -33.0F, 2, 2, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 272, 394, -3.9142F, -24.9858F, -28.0F, 2, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 279, 394, -1.0892F, -24.9858F, -28.0F, 2, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 390, 314, -2.1F, -24.8206F, -16.8529F, 2, 2, 1, -0.4F, false));
		bone5.cubeList.add(new ModelBox(bone5, 391, 0, -2.9F, -24.8206F, -16.8529F, 2, 2, 1, -0.4F, false));
		bone5.cubeList.add(new ModelBox(bone5, 376, 127, -2.9F, -14.7858F, -14.3786F, 2, 1, 4, -0.4F, false));
		bone5.cubeList.add(new ModelBox(bone5, 377, 232, -2.1F, -14.7858F, -14.3786F, 2, 1, 4, -0.4F, false));
		bone5.cubeList.add(new ModelBox(bone5, 7, 391, -2.9F, -24.8206F, -16.7529F, 2, 2, 1, -0.4F, false));
		bone5.cubeList.add(new ModelBox(bone5, 391, 58, -2.1F, -24.8206F, -16.7529F, 2, 2, 1, -0.4F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, 8.0F, 10.0F);
		stock2.addChild(bone7);
		setRotationAngle(bone7, 0.0F, 0.0F, -0.7854F);
		bone7.cubeList.add(new ModelBox(bone7, 0, 357, 27.6278F, -33.1633F, -4.0F, 2, 1, 10, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 271, 397, 28.6278F, -33.1633F, -5.0F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 276, 397, 30.042F, -31.7491F, -5.0F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 25, 357, 30.042F, -31.7491F, -4.0F, 1, 2, 10, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 358, 395, 30.042F, -31.7491F, 5.95F, 1, 2, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 7, 395, 27.6278F, -33.1633F, 5.95F, 2, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 395, 376, 30.042F, -31.7491F, 13.95F, 1, 2, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 245, 395, 27.6278F, -33.1633F, 13.95F, 2, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 391, 395, 30.042F, -31.7491F, 17.95F, 1, 2, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 395, 324, 27.6278F, -33.1633F, 17.95F, 2, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 336, 395, 19.8472F, -21.5591F, 17.95F, 2, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 41, 396, 18.4354F, -23.9709F, 17.95F, 1, 2, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 389, 53, 30.042F, -31.7491F, 18.95F, 1, 2, 2, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 388, 246, 27.6278F, -33.1633F, 18.95F, 2, 1, 2, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 389, 63, 18.4354F, -23.9709F, 18.95F, 1, 2, 2, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 388, 250, 19.8472F, -21.5591F, 18.95F, 2, 1, 2, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 385, 143, 30.042F, -31.7491F, 14.95F, 1, 1, 3, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 146, 385, 28.6278F, -33.1633F, 14.95F, 1, 1, 3, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 281, 397, 28.2136F, -33.1633F, -5.0F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 397, 314, 30.042F, -31.3349F, -5.0F, 1, 1, 1, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-3.5F, -31.0F, 18.5F);
		stock2.addChild(bone8);
		setRotationAngle(bone8, -0.3491F, 0.0F, 0.0F);
		bone8.cubeList.add(new ModelBox(bone8, 389, 68, -0.4108F, -2.8904F, -3.7125F, 2, 3, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 389, 73, 2.4142F, -2.8904F, -3.7125F, 2, 3, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 82, 332, 2.4142F, -5.6265F, 3.8051F, 2, 4, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 37, 333, -0.4108F, -5.6265F, 3.8051F, 2, 4, 1, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-3.225F, -29.4F, 23.5F);
		stock2.addChild(bone9);
		setRotationAngle(bone9, 0.2618F, 0.0F, 0.0F);
		bone9.cubeList.add(new ModelBox(bone9, 378, 181, -1.0F, -2.0F, 0.0F, 4, 4, 1, -0.3F, false));
		bone9.cubeList.add(new ModelBox(bone9, 175, 385, 1.225F, -1.0133F, -0.6115F, 1, 6, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 342, 20, 1.225F, 4.5867F, 0.5885F, 1, 4, 2, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 82, 320, 0.325F, -1.4133F, -1.0115F, 2, 10, 1, -0.4F, false));
		bone9.cubeList.add(new ModelBox(bone9, 37, 321, 1.125F, -1.4133F, -1.0115F, 2, 10, 1, -0.4F, false));
		bone9.cubeList.add(new ModelBox(bone9, 68, 384, 1.45F, -2.0F, 0.0F, 3, 4, 1, -0.3F, false));

		cheekRiser = new ModelRenderer(this);
		cheekRiser.setRotationPoint(0.0F, 0.0F, 0.0F);
		stock2.addChild(cheekRiser);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.537F, -38.2756F, 9.6597F);
		cheekRiser.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.1615F, -0.0665F, -0.3873F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 398, 56, -2.0F, -0.5F, -7.5F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 348, 210, -3.0F, -0.5F, -6.5F, 2, 1, 13, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.463F, -38.2756F, 9.6597F);
		cheekRiser.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.1615F, 0.0665F, 0.3873F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 398, 59, 1.0F, -0.5F, -7.5F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 348, 195, 1.0F, -0.5F, -6.5F, 2, 1, 13, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.6522F, -37.8613F, 9.5866F);
		cheekRiser.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.1745F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 117, 340, -2.0F, -0.5F, -8.5F, 1, 1, 15, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 340, -3.3045F, -0.5F, -8.5F, 2, 1, 15, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-1.5F, -37.1075F, 9.4537F);
		cheekRiser.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.1745F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 72, 356, -3.0F, -0.5F, -4.5F, 1, 1, 11, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 175, 355, 2.0F, -0.5F, -4.5F, 1, 1, 11, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.5F, -35.0106F, 9.8496F);
		cheekRiser.addChild(cube_r7);
		setRotationAngle(cube_r7, 1.3963F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 157, 398, -3.0F, 4.0F, 0.5F, 1, 1, 1, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 245, 398, 2.0F, 4.0F, 0.5F, 1, 1, 1, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 396, 82, -3.0F, 1.8F, -1.1F, 1, 2, 1, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 84, 396, 2.0F, 1.8F, -1.1F, 1, 2, 1, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 129, 236, 2.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 389, 122, -3.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 389, 28, 2.0F, -1.6F, 0.5F, 1, 6, 1, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 389, 36, -3.0F, -1.6F, 0.5F, 1, 6, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-1.5F, -35.0106F, 9.8496F);
		cheekRiser.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.8727F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 249, 387, -3.0F, -4.0F, -0.5F, 1, 6, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 339, 387, 2.0F, -4.0F, -0.5F, 1, 6, 1, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(4.5F, -33.3651F, 12.2326F);
		cheekRiser.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.7854F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 358, 389, -4.0F, -4.0F, 0.0F, 1, 4, 1, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 130, 389, -9.0F, -4.0F, 0.0F, 1, 4, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-0.5F, -33.0F, 12.0F);
		cheekRiser.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.3491F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 249, 206, -4.0F, -1.0F, -1.0F, 6, 1, 2, 0.0F, false));

		trunnionBits = new ModelRenderer(this);
		trunnionBits.setRotationPoint(0.0F, 3.0F, -0.2F);
		stock2.addChild(trunnionBits);
		trunnionBits.cubeList.add(new ModelBox(trunnionBits, 389, 9, -3.8F, -36.3F, 0.3F, 2, 1, 2, 0.0F, false));
		trunnionBits.cubeList.add(new ModelBox(trunnionBits, 395, 361, -0.8F, -36.3F, 1.3F, 2, 1, 1, 0.0F, false));
		trunnionBits.cubeList.add(new ModelBox(trunnionBits, 398, 302, -0.2F, -34.8F, 0.5F, 1, 1, 1, 0.0F, false));
		trunnionBits.cubeList.add(new ModelBox(trunnionBits, 398, 305, -3.8F, -34.8F, 0.5F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		stock2.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}