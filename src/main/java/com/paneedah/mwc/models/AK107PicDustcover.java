package com.paneedah.mwc.models;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AK107PicDustcover extends ModelBase {
	private final ModelRenderer dustcoverBARS_RAS;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer bone6;
	private final ModelRenderer DustCover23;
	private final ModelRenderer DustCover24;
	private final ModelRenderer DustCover25;
	private final ModelRenderer bone7;
	private final ModelRenderer DustCover26;
	private final ModelRenderer DustCover27;
	private final ModelRenderer DustCover28;
	private final ModelRenderer DustCover29;
	private final ModelRenderer DustCover30;
	private final ModelRenderer DustCover31;
	private final ModelRenderer DustCover32;
	private final ModelRenderer DustCover33;
	private final ModelRenderer DustCover34;
	private final ModelRenderer DustCover35;
	private final ModelRenderer bone8;
	private final ModelRenderer bone5_r1;
	private final ModelRenderer bone5_r2;
	private final ModelRenderer cube_r50;
	private final ModelRenderer cube_r51;
	private final ModelRenderer irons2;
	private final ModelRenderer bone10_r1;
	private final ModelRenderer bone11_r1;

	public AK107PicDustcover() {
		textureWidth = 400;
		textureHeight = 400;

		dustcoverBARS_RAS = new ModelRenderer(this);
		dustcoverBARS_RAS.setRotationPoint(0.0F, 24.0F, 0.0F);
		dustcoverBARS_RAS.cubeList.add(new ModelBox(dustcoverBARS_RAS, 72, 376, -3.8F, -37.65F, -34.5F, 1, 2, 2, 0.0F, false));
		dustcoverBARS_RAS.cubeList.add(new ModelBox(dustcoverBARS_RAS, 362, 326, -3.8F, -37.65F, -8.5F, 1, 2, 10, 0.0F, false));
		dustcoverBARS_RAS.cubeList.add(new ModelBox(dustcoverBARS_RAS, 232, 383, -3.8F, -37.65F, -9.5F, 1, 1, 1, 0.0F, false));
		dustcoverBARS_RAS.cubeList.add(new ModelBox(dustcoverBARS_RAS, 328, 76, -0.2F, -37.65F, -27.5F, 1, 2, 29, 0.0F, false));
		dustcoverBARS_RAS.cubeList.add(new ModelBox(dustcoverBARS_RAS, 74, 225, -0.2F, -37.65F, -34.5F, 1, 1, 7, 0.0F, false));
		dustcoverBARS_RAS.cubeList.add(new ModelBox(dustcoverBARS_RAS, 310, 266, -1.8524F, -39.9595F, -34.2F, 1, 1, 35, 0.0F, false));
		dustcoverBARS_RAS.cubeList.add(new ModelBox(dustcoverBARS_RAS, 312, 191, -2.1476F, -39.959F, -34.2F, 1, 1, 35, 0.0F, false));
		dustcoverBARS_RAS.cubeList.add(new ModelBox(dustcoverBARS_RAS, 322, 374, -2.5F, -40.4F, -36.0F, 2, 2, 2, 0.0F, false));
		dustcoverBARS_RAS.cubeList.add(new ModelBox(dustcoverBARS_RAS, 80, 375, -2.5F, -40.9F, -1.4F, 2, 2, 2, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.9F, -43.9939F, -37.3995F);
		dustcoverBARS_RAS.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.7854F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 194, 379, -1.0F, -2.0F, 11.0F, 1, 1, 2, -0.1F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-2.9554F, -38.3825F, -15.5F);
		dustcoverBARS_RAS.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.3927F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 240, 383, -0.4996F, 0.0F, 16.0F, 1, 1, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 152, 376, -0.5F, -1.0F, -19.0F, 1, 2, 2, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 262, 339, -0.5F, -1.0F, -5.7F, 1, 2, 22, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-0.0446F, -38.3825F, -15.5F);
		dustcoverBARS_RAS.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.3927F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 236, 383, -0.5004F, 0.0F, 16.0F, 1, 1, 1, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 254, 154, -0.5F, -1.0F, -18.7F, 1, 2, 35, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-3.0804F, -38.4074F, -22.1058F);
		dustcoverBARS_RAS.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.6545F, 0.0F, 0.3927F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 380, 227, -0.4996F, -0.4F, 0.5F, 1, 2, 1, -0.125F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-3.5004F, -37.0668F, -30.3045F);
		dustcoverBARS_RAS.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.6545F, 0.0F, 0.3927F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 226, 380, -0.5F, -0.8F, -3.0F, 1, 2, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-2.1712F, -38.3811F, -30.3523F);
		dustcoverBARS_RAS.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.3927F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 136, 379, -1.4998F, -1.0F, 8.3F, 1, 1, 2, -0.275F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-2.129F, -38.2871F, -30.5042F);
		dustcoverBARS_RAS.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 0.3927F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 362, 227, -1.5F, -1.0F, -2.7F, 1, 1, 2, -0.2F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-1.0833F, -39.516F, -16.2F);
		dustcoverBARS_RAS.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -1.0908F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 310, 230, -0.5F, 0.0F, -18.0F, 1, 1, 35, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-1.9167F, -39.516F, -16.2F);
		dustcoverBARS_RAS.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 1.0908F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 144, 304, -0.5F, 0.0F, -18.0F, 1, 1, 35, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-3.8F, -37.0F, 2.5F);
		dustcoverBARS_RAS.addChild(bone6);
		

		DustCover23 = new ModelRenderer(this);
		DustCover23.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone6.addChild(DustCover23);
		DustCover23.cubeList.add(new ModelBox(DustCover23, 290, 36, 0.0F, 0.349F, -0.999F, 4, 1, 2, 0.0F, false));

		DustCover24 = new ModelRenderer(this);
		DustCover24.setRotationPoint(0.0F, 0.0F, -12.0F);
		bone6.addChild(DustCover24);
		

		DustCover25 = new ModelRenderer(this);
		DustCover25.setRotationPoint(3.6F, 0.0F, -27.0F);
		bone6.addChild(DustCover25);
		DustCover25.cubeList.add(new ModelBox(DustCover25, 130, 379, 0.0F, 0.35F, 26.0F, 1, 1, 2, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-1.3F, -37.7F, 2.2F);
		dustcoverBARS_RAS.addChild(bone7);
		

		DustCover26 = new ModelRenderer(this);
		DustCover26.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone7.addChild(DustCover26);
		setRotationAngle(DustCover26, -0.9295F, 0.0F, 0.0F);
		DustCover26.cubeList.add(new ModelBox(DustCover26, 306, 374, -0.001F, -0.2393F, -0.3205F, 2, 2, 2, 0.0F, false));

		DustCover27 = new ModelRenderer(this);
		DustCover27.setRotationPoint(0.1F, -1.8F, -1.32F);
		bone7.addChild(DustCover27);
		setRotationAngle(DustCover27, -0.9295F, 0.0F, 0.0F);
		DustCover27.cubeList.add(new ModelBox(DustCover27, 370, 71, 0.0F, -0.2393F, -0.0205F, 1, 1, 4, 0.0F, false));

		DustCover28 = new ModelRenderer(this);
		DustCover28.setRotationPoint(-0.7F, -2.3F, -1.7F);
		bone7.addChild(DustCover28);
		setRotationAngle(DustCover28, -0.9295F, 0.0F, 0.0F);
		DustCover28.cubeList.add(new ModelBox(DustCover28, 132, 370, 0.0F, -0.2393F, 0.2795F, 1, 1, 4, 0.0F, false));

		DustCover29 = new ModelRenderer(this);
		DustCover29.setRotationPoint(-1.5F, -1.8F, -1.32F);
		bone7.addChild(DustCover29);
		setRotationAngle(DustCover29, -0.9295F, 0.0F, 0.0F);
		DustCover29.cubeList.add(new ModelBox(DustCover29, 142, 370, 0.0F, -0.2393F, -0.0205F, 1, 1, 4, 0.0F, false));

		DustCover30 = new ModelRenderer(this);
		DustCover30.setRotationPoint(-2.4F, 0.0F, 0.0F);
		bone7.addChild(DustCover30);
		setRotationAngle(DustCover30, -0.9295F, 0.0F, 0.0F);
		DustCover30.cubeList.add(new ModelBox(DustCover30, 314, 374, 0.001F, -0.2393F, -0.3205F, 2, 2, 2, 0.0F, false));

		DustCover31 = new ModelRenderer(this);
		DustCover31.setRotationPoint(-3.9F, -52.5F, -21.5F);
		dustcoverBARS_RAS.addChild(DustCover31);
		setRotationAngle(DustCover31, 0.0F, 0.0F, -0.7808F);
		DustCover31.cubeList.add(new ModelBox(DustCover31, 346, 227, -10.4176F, 10.3718F, 0.3F, 2, 1, 2, 0.0F, false));

		DustCover32 = new ModelRenderer(this);
		DustCover32.setRotationPoint(-3.9F, -52.5F, -21.5F);
		dustcoverBARS_RAS.addChild(DustCover32);
		DustCover32.cubeList.add(new ModelBox(DustCover32, 142, 379, -0.1F, 14.7F, 0.3F, 1, 1, 2, 0.0F, false));

		DustCover33 = new ModelRenderer(this);
		DustCover33.setRotationPoint(-3.8F, -52.5F, -19.1F);
		dustcoverBARS_RAS.addChild(DustCover33);
		setRotationAngle(DustCover33, 0.0F, 0.0F, -0.7436F);
		DustCover33.cubeList.add(new ModelBox(DustCover33, 362, 24, -10.0247F, 10.752F, -1.0F, 1, 1, 11, 0.0F, false));

		DustCover34 = new ModelRenderer(this);
		DustCover34.setRotationPoint(-3.8F, -52.5F, -10.1F);
		dustcoverBARS_RAS.addChild(DustCover34);
		setRotationAngle(DustCover34, -0.8923F, 0.0F, 0.0F);
		DustCover34.cubeList.add(new ModelBox(DustCover34, 170, 379, -0.1F, 8.4475F, 12.0718F, 1, 1, 2, 0.0F, false));

		DustCover35 = new ModelRenderer(this);
		DustCover35.setRotationPoint(-3.8F, -52.5F, -19.1F);
		dustcoverBARS_RAS.addChild(DustCover35);
		DustCover35.cubeList.add(new ModelBox(DustCover35, 362, 302, -0.099F, 14.7F, -1.0F, 1, 1, 11, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-0.7F, -40.475F, -39.65F);
		dustcoverBARS_RAS.addChild(bone8);
		bone8.cubeList.add(new ModelBox(bone8, 378, 379, -1.8F, -0.2F, 10.8F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 0, 380, -1.8F, -0.2F, 12.05F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 6, 380, -1.8F, -0.2F, 13.3F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 12, 380, -1.8F, -0.2F, 14.55F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 18, 380, -1.8F, -0.2F, 15.8F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 24, 380, -1.8F, -0.2F, 17.05F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 30, 380, -1.8F, -0.2F, 18.3F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 36, 380, -1.8F, -0.2F, 19.55F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 354, 227, -1.8F, -0.2F, 20.8F, 2, 1, 2, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 42, 380, -1.8F, -0.2F, 24.55F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 340, 74, -1.8F, -0.2F, 23.3F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 72, 380, -1.8F, -0.2F, 22.05F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 48, 380, -1.8F, -0.2F, 25.8F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 54, 380, -1.8F, -0.2F, 27.05F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 60, 380, -1.8F, -0.2F, 28.3F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 66, 380, -1.8F, -0.2F, 29.55F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 380, 66, -1.8F, -0.2F, 30.8F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 380, 68, -1.8F, -0.2F, 32.05F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 380, 70, -1.8F, -0.2F, 33.3F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 180, 80, -1.7F, 0.4F, 4.05F, 2, 1, 36, -0.001F, false));
		bone8.cubeList.add(new ModelBox(bone8, 238, 193, -1.9F, 0.4F, 4.05F, 1, 1, 36, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 54, 334, -0.401F, -0.798F, 34.75F, 1, 2, 6, -0.301F, false));
		bone8.cubeList.add(new ModelBox(bone8, 332, 66, -2.199F, -0.8F, 34.75F, 1, 2, 6, -0.3F, false));
		bone8.cubeList.add(new ModelBox(bone8, 234, 380, -2.199F, -0.8107F, 34.1268F, 1, 2, 1, -0.3F, false));
		bone8.cubeList.add(new ModelBox(bone8, 230, 380, -0.401F, -0.8087F, 34.1268F, 1, 2, 1, -0.301F, false));

		bone5_r1 = new ModelRenderer(this);
		bone5_r1.setRotationPoint(-0.8F, -0.7118F, 39.4834F);
		bone8.addChild(bone5_r1);
		setRotationAngle(bone5_r1, 0.5672F, 0.0F, 0.0F);
		bone5_r1.cubeList.add(new ModelBox(bone5_r1, 158, 376, 0.397F, -0.999F, -1.0F, 1, 2, 2, -0.301F, false));
		bone5_r1.cubeList.add(new ModelBox(bone5_r1, 164, 376, -1.397F, -1.001F, -1.0F, 1, 2, 2, -0.3F, false));

		bone5_r2 = new ModelRenderer(this);
		bone5_r2.setRotationPoint(-0.8F, -0.4104F, 37.2139F);
		bone8.addChild(bone5_r2);
		setRotationAngle(bone5_r2, 0.2182F, 0.0F, 0.0F);
		bone5_r2.cubeList.add(new ModelBox(bone5_r2, 54, 342, -1.398F, -1.001F, -3.0F, 1, 2, 6, -0.3F, false));
		bone5_r2.cubeList.add(new ModelBox(bone5_r2, 342, 107, 0.398F, -0.999F, -3.0F, 1, 2, 6, -0.301F, false));

		cube_r50 = new ModelRenderer(this);
		cube_r50.setRotationPoint(-1.6F, 0.0F, -1.25F);
		bone8.addChild(cube_r50);
		setRotationAngle(cube_r50, 0.0F, 0.0F, 0.8901F);
		cube_r50.cubeList.add(new ModelBox(cube_r50, 326, 150, -0.25F, -0.05F, 5.2F, 1, 1, 30, -0.35F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 244, 383, -0.2F, -0.2F, 34.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 248, 383, -0.2F, -0.2F, 33.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 302, 383, -0.2F, -0.2F, 32.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 306, 383, -0.2F, -0.2F, 30.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 310, 383, -0.2F, -0.2F, 29.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 314, 383, -0.2F, -0.2F, 28.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 318, 383, -0.2F, -0.2F, 27.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 322, 383, -0.2F, -0.2F, 25.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 258, 380, -0.2F, -0.2F, 24.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 20, 384, -0.2F, -0.2F, 23.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 182, 379, -0.2F, -0.2F, 22.05F, 1, 1, 2, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 338, 383, -0.2F, -0.2F, 20.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 342, 383, -0.2F, -0.2F, 19.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 352, 383, -0.2F, -0.2F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 356, 383, -0.2F, -0.2F, 17.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 360, 383, -0.2F, -0.2F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 364, 383, -0.2F, -0.2F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 368, 383, -0.2F, -0.2F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 372, 383, -0.2F, -0.2F, 12.05F, 1, 1, 1, -0.198F, false));

		cube_r51 = new ModelRenderer(this);
		cube_r51.setRotationPoint(0.0F, 0.0F, -1.25F);
		bone8.addChild(cube_r51);
		setRotationAngle(cube_r51, 0.0F, 0.0F, -0.8901F);
		cube_r51.cubeList.add(new ModelBox(cube_r51, 72, 327, -0.75F, -0.05F, 5.2F, 1, 1, 30, -0.35F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 376, 383, -0.8F, -0.2F, 34.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 380, 383, -0.8F, -0.2F, 33.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 0, 384, -0.8F, -0.2F, 32.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 384, 0, -0.8F, -0.2F, 30.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 384, 2, -0.8F, -0.2F, 29.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 4, 384, -0.8F, -0.2F, 28.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 384, 4, -0.8F, -0.2F, 27.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 384, 6, -0.8F, -0.2F, 25.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 254, 380, -0.8F, -0.2F, 24.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 384, 18, -0.8F, -0.2F, 23.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 188, 379, -0.8F, -0.2F, 22.05F, 1, 1, 2, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 8, 384, -0.8F, -0.2F, 20.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 384, 8, -0.8F, -0.2F, 19.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 384, 10, -0.8F, -0.2F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 12, 384, -0.8F, -0.2F, 17.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 384, 12, -0.8F, -0.2F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 384, 14, -0.8F, -0.2F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 16, 384, -0.8F, -0.2F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 384, 16, -0.8F, -0.2F, 12.05F, 1, 1, 1, -0.198F, false));

		irons2 = new ModelRenderer(this);
		irons2.setRotationPoint(-1.5F, -46.2465F, 2.5F);
		dustcoverBARS_RAS.addChild(irons2);
		setRotationAngle(irons2, -1.5708F, 0.0F, 0.0F);
		

		bone10_r1 = new ModelRenderer(this);
		bone10_r1.setRotationPoint(0.0F, 0.0786F, 0.1625F);
		irons2.addChild(bone10_r1);
		setRotationAngle(bone10_r1, 1.5708F, 0.0F, 0.0F);
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 242, 380, -0.0465F, 4.0214F, -3.2375F, 1, 2, 1, -0.35F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 384, 38, -0.4F, 4.575F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 384, 36, -0.6F, 4.575F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 238, 380, -0.9535F, 4.0214F, -3.2375F, 1, 2, 1, -0.35F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 384, 22, -0.4F, 3.6679F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 384, 20, -0.6F, 3.6679F, -3.2375F, 1, 1, 1, -0.35F, false));

		bone11_r1 = new ModelRenderer(this);
		bone11_r1.setRotationPoint(0.0F, 0.0786F, 0.1625F);
		irons2.addChild(bone11_r1);
		setRotationAngle(bone11_r1, 1.5708F, -0.7854F, 0.0F);
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 44, 384, 3.2214F, 2.6679F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 384, 42, 3.2214F, 2.8678F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 384, 40, 2.6679F, 3.2214F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 40, 384, 2.8679F, 3.2214F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 36, 384, 2.3143F, 2.8678F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 32, 384, 2.3143F, 2.6679F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 28, 384, 2.8679F, 2.3143F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 24, 384, 2.6679F, 2.3143F, -3.2375F, 1, 1, 1, -0.35F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		dustcoverBARS_RAS.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}