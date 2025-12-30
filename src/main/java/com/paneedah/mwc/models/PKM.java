package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.10.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class PKM extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer gun383;
	private final ModelRenderer gun384;
	private final ModelRenderer gun385;
	private final ModelRenderer gun382;
	private final ModelRenderer gun381;
	private final ModelRenderer gun366;
	private final ModelRenderer gun113;
	private final ModelRenderer gun112;
	private final ModelRenderer gun111;
	private final ModelRenderer gun110;
	private final ModelRenderer gun107;
	private final ModelRenderer feedWay;
	private final ModelRenderer bone;
	private final ModelRenderer gun160;
	private final ModelRenderer gun161;
	private final ModelRenderer gun162;
	private final ModelRenderer gun163;
	private final ModelRenderer gun165;
	private final ModelRenderer gun168;
	private final ModelRenderer gun14_r1;
	private final ModelRenderer gun17_r1_r1_r1;
	private final ModelRenderer gun23_r1;
	private final ModelRenderer gun52_r3_r1_r1;
	private final ModelRenderer gun42_r2_r1_r1;
	private final ModelRenderer gun54_r2_r1_r1;
	private final ModelRenderer gun41_r1_r1_r1;
	private final ModelRenderer gun45_r1_r1_r1;
	private final ModelRenderer gun50_r1_r1_r1;
	private final ModelRenderer gun51_r3_r1_r1;
	private final ModelRenderer gun51_r2_r1_r1;
	private final ModelRenderer gun51_r1_r1_r1;
	private final ModelRenderer gun52_r4_r1_r1;
	private final ModelRenderer gun52_r1_r1_r1;
	private final ModelRenderer gun53_r4_r1_r1;
	private final ModelRenderer gun53_r3_r1_r1;
	private final ModelRenderer gun53_r2_r1_r1;
	private final ModelRenderer gun53_r1_r1_r1;
	private final ModelRenderer gun54_r3_r1_r1;
	private final ModelRenderer gun54_r1_r1_r1;
	private final ModelRenderer gun55_r1_r1_r1;
	private final ModelRenderer gun83_r1_r1_r1;
	private final ModelRenderer gun109_r1_r1_r1;
	private final ModelRenderer gun110_r1_r1_r1;

	private final ModelRenderer cube_r1_r1_r1;
	private final ModelRenderer cube_r2_r1_r1;

	public PKM() {
		textureWidth = 512;
		textureHeight = 512;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		gun.cubeList.add(new ModelBox(gun, 130, 120, 0.3F, -35.5F, -40.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 25, 130, 0.3F, -32.4F, -40.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 129, 52, -0.3F, -33.0F, -45.0F, 1, 1, 1, 0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 97, 64, 0.3F, -32.4F, 0.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 130, 122, 0.3F, -35.5F, -31.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 33, 90, 0.5F, -35.5F, -26.4F, 1, 1, 11, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 12, 26, 0.3F, -35.5F, -29.1F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 97, 66, 0.3F, -35.5F, 0.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 16, 85, 0.3F, -35.5F, 1.9F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 27, 142, 0.201F, -36.0F, -16.5F, 1, 5, 20, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 27, 142, 0.201F, -36.0F, -25.5F, 1, 2, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 37, 0, 0.201F, -36.0F, -40.5F, 1, 5, 15, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 37, 153, -4.301F, -34.2885F, -11.4661F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 137, 155, -4.701F, -33.3F, -23.2F, 1, 1, 1, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 96, 94, -4.701F, -34.7F, -23.2F, 1, 2, 1, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 115, 155, -4.701F, -33.3F, -1.8F, 1, 1, 1, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 66, 95, -4.701F, -34.7F, -1.8F, 1, 2, 1, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 98, 169, -4.701F, -34.7F, -22.8F, 1, 1, 2, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 169, 62, -4.701F, -33.3F, -22.8F, 1, 1, 2, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 25, 238, -4.701F, -34.7F, -22.2F, 1, 1, 21, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 170, 214, -4.701F, -33.3F, -22.2F, 1, 1, 21, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 169, 239, -4.301F, -35.0F, -22.5F, 1, 1, 21, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 27, 37, -4.301F, -35.0F, -23.5F, 1, 3, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 26, 48, -4.301F, -35.0F, -1.5F, 1, 3, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 97, 239, -4.301F, -33.0F, -22.5F, 1, 1, 21, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 26, 168, -4.201F, -33.0F, -22.5F, 1, 2, 21, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 98, 169, -4.201F, -36.0F, -22.5F, 1, 2, 21, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 16, 13, -4.201F, -36.0F, -1.5F, 1, 5, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 173, 72, -4.201F, -36.0F, -40.5F, 1, 5, 18, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 13, 114, 0.2F, -30.4F, -33.7F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 170, 284, 0.2F, -31.4F, -40.5F, 1, 1, 44, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 37, 20, -3.6F, -29.201F, -34.201F, 4, 1, 8, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 133, -3.1F, -29.901F, -33.701F, 3, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 72, 123, -4.2F, -30.401F, -33.701F, 5, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 284, -4.2F, -31.401F, -40.501F, 5, 1, 44, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 53, 20, -2.5F, -29.0281F, -14.9432F, 2, 5, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 103, -3.0F, -30.8F, -15.5F, 3, 2, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 33, 30, -2.5F, -29.5F, -7.5F, 2, 6, 1, 0.0F, false));

		gun14_r1 = new ModelRenderer(this);
		gun14_r1.setRotationPoint(0.0F, -40.1732F, -30.3682F);
		gun.addChild(gun14_r1);
		setRotationAngle(gun14_r1, -2.3423F, 0.0F, 0.0F);
		gun14_r1.cubeList.add(new ModelBox(gun14_r1, 115, 46, -2.5F, -28.735F, -4.6889F, 2, 1, 1, 0.0F, false));

		gun17_r1_r1_r1 = new ModelRenderer(this);
		gun17_r1_r1_r1.setRotationPoint(0.0F, 0.186F, 0.0651F);
		gun.addChild(gun17_r1_r1_r1);
		setRotationAngle(gun17_r1_r1_r1, -0.0873F, 0.0F, 0.0F);
		gun17_r1_r1_r1.cubeList.add(new ModelBox(gun17_r1_r1_r1, 171, 35, -2.5F, -23.2484F, -16.2373F, 2, 1, 7, 0.0F, false));

		gun23_r1 = new ModelRenderer(this);
		gun23_r1.setRotationPoint(0.0F, -54.9394F, -9.3247F);
		gun.addChild(gun23_r1);
		setRotationAngle(gun23_r1, 2.4538F, 0.0F, 0.0F);
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 52, 117, -2.5F, -27.4505F, -16.2824F, 2, 1, 1, 0.0F, false));

		gun41_r1_r1_r1 = new ModelRenderer(this);
		gun41_r1_r1_r1.setRotationPoint(0.0F, 4.0083F, 9.8489F);
		gun.addChild(gun41_r1_r1_r1);
		setRotationAngle(gun41_r1_r1_r1, 0.5236F, 0.0F, 0.0F);
		gun41_r1_r1_r1.cubeList.add(new ModelBox(gun41_r1_r1_r1, 14, 26, -4.2F, -48.2079F, -14.9491F, 5, 1, 2, 0.0F, false));
		gun41_r1_r1_r1.cubeList.add(new ModelBox(gun41_r1_r1_r1, 158, 85, 0.2F, -48.2069F, -14.9481F, 1, 1, 2, 0.0F, false));

		gun42_r2_r1_r1 = new ModelRenderer(this);
		gun42_r2_r1_r1.setRotationPoint(0.0F, 11.1724F, 3.6312F);
		gun.addChild(gun42_r2_r1_r1);
		setRotationAngle(gun42_r2_r1_r1, -0.5236F, 0.0F, 0.0F);
		gun42_r2_r1_r1.cubeList.add(new ModelBox(gun42_r2_r1_r1, 0, 26, -4.2F, -17.4721F, -54.6171F, 5, 1, 2, 0.0F, false));
		gun42_r2_r1_r1.cubeList.add(new ModelBox(gun42_r2_r1_r1, 158, 82, 0.2F, -17.4711F, -54.6161F, 1, 1, 2, 0.0F, false));

		gun45_r1_r1_r1 = new ModelRenderer(this);
		gun45_r1_r1_r1.setRotationPoint(1.4631F, 2.8865F, 0.0F);
		gun.addChild(gun45_r1_r1_r1);
		setRotationAngle(gun45_r1_r1_r1, 0.0F, 0.0F, -0.3054F);
		gun45_r1_r1_r1.cubeList.add(new ModelBox(gun45_r1_r1_r1, 72, 14, 4.8095F, -40.0103F, -30.2F, 2, 6, 3, 0.0F, false));

		gun50_r1_r1_r1 = new ModelRenderer(this);
		gun50_r1_r1_r1.setRotationPoint(0.0F, 16.5625F, -36.2648F);
		gun.addChild(gun50_r1_r1_r1);
		setRotationAngle(gun50_r1_r1_r1, -1.1781F, 0.0F, 0.0F);
		gun50_r1_r1_r1.cubeList.add(new ModelBox(gun50_r1_r1_r1, 137, 153, -4.301F, -51.6263F, -32.1794F, 1, 1, 1, 0.0F, false));

		gun51_r3_r1_r1 = new ModelRenderer(this);
		gun51_r3_r1_r1.setRotationPoint(0.0F, 13.3141F, 37.6103F);
		gun.addChild(gun51_r3_r1_r1);
		setRotationAngle(gun51_r3_r1_r1, 1.1781F, 0.0F, 0.0F);
		gun51_r3_r1_r1.cubeList.add(new ModelBox(gun51_r3_r1_r1, 131, 153, -4.301F, -54.2574F, 26.5736F, 1, 1, 1, 0.0F, false));

		gun51_r2_r1_r1 = new ModelRenderer(this);
		gun51_r2_r1_r1.setRotationPoint(0.0F, 18.3416F, -38.8138F);
		gun.addChild(gun51_r2_r1_r1);
		setRotationAngle(gun51_r2_r1_r1, -1.1781F, 0.0F, 0.0F);
		gun51_r2_r1_r1.cubeList.add(new ModelBox(gun51_r2_r1_r1, 109, 153, -4.301F, -55.103F, -35.3264F, 1, 1, 1, 0.0F, false));

		gun52_r4_r1_r1 = new ModelRenderer(this);
		gun52_r4_r1_r1.setRotationPoint(0.0F, 15.0932F, 40.1593F);
		gun.addChild(gun52_r4_r1_r1);
		setRotationAngle(gun52_r4_r1_r1, 1.1781F, 0.0F, 0.0F);
		gun52_r4_r1_r1.cubeList.add(new ModelBox(gun52_r4_r1_r1, 115, 153, -4.301F, -57.734F, 29.7206F, 1, 1, 1, 0.0F, false));

		gun53_r4_r1_r1 = new ModelRenderer(this);
		gun53_r4_r1_r1.setRotationPoint(0.0F, 7.1085F, 43.4666F);
		gun.addChild(gun53_r4_r1_r1);
		setRotationAngle(gun53_r4_r1_r1, 1.1781F, 0.0F, 0.0F);
		gun53_r4_r1_r1.cubeList.add(new ModelBox(gun53_r4_r1_r1, 151, 74, -4.301F, -64.2012F, 18.3993F, 1, 1, 1, 0.0F, false));

		gun52_r3_r1_r1 = new ModelRenderer(this);
		gun52_r3_r1_r1.setRotationPoint(0.0F, 26.3262F, -35.5064F);
		gun.addChild(gun52_r3_r1_r1);
		setRotationAngle(gun52_r3_r1_r1, -1.1781F, 0.0F, 0.0F);
		gun52_r3_r1_r1.cubeList.add(new ModelBox(gun52_r3_r1_r1, 66, 152, -4.301F, -48.6358F, -46.6476F, 1, 1, 1, 0.0F, false));

		gun51_r1_r1_r1 = new ModelRenderer(this);
		gun51_r1_r1_r1.setRotationPoint(0.0F, 24.5471F, -32.9576F);
		gun.addChild(gun51_r1_r1_r1);
		setRotationAngle(gun51_r1_r1_r1, -1.1781F, 0.0F, 0.0F);
		gun51_r1_r1_r1.cubeList.add(new ModelBox(gun51_r1_r1_r1, 43, 153, -4.301F, -45.1592F, -43.5007F, 1, 1, 1, 0.0F, false));

		gun54_r3_r1_r1 = new ModelRenderer(this);
		gun54_r3_r1_r1.setRotationPoint(0.0F, -0.3057F, 46.5377F);
		gun.addChild(gun54_r3_r1_r1);
		setRotationAngle(gun54_r3_r1_r1, 1.1781F, 0.0F, 0.0F);
		gun54_r3_r1_r1.cubeList.add(new ModelBox(gun54_r3_r1_r1, 149, 130, -4.301F, -70.2064F, 7.8868F, 1, 1, 1, 0.0F, false));

		gun53_r3_r1_r1 = new ModelRenderer(this);
		gun53_r3_r1_r1.setRotationPoint(0.0F, 33.7405F, -32.4354F);
		gun.addChild(gun53_r3_r1_r1);
		setRotationAngle(gun53_r3_r1_r1, -1.1781F, 0.0F, 0.0F);
		gun53_r3_r1_r1.cubeList.add(new ModelBox(gun53_r3_r1_r1, 149, 134, -4.301F, -42.6306F, -57.1602F, 1, 1, 1, 0.0F, false));

		gun53_r2_r1_r1 = new ModelRenderer(this);
		gun53_r2_r1_r1.setRotationPoint(0.0F, -2.0848F, 43.9887F);
		gun.addChild(gun53_r2_r1_r1);
		setRotationAngle(gun53_r2_r1_r1, 1.1781F, 0.0F, 0.0F);
		gun53_r2_r1_r1.cubeList.add(new ModelBox(gun53_r2_r1_r1, 20, 151, -4.301F, -66.7298F, 4.7398F, 1, 1, 1, 0.0F, false));

		gun52_r1_r1_r1 = new ModelRenderer(this);
		gun52_r1_r1_r1.setRotationPoint(0.0F, 31.9613F, -29.8865F);
		gun.addChild(gun52_r1_r1_r1);
		setRotationAngle(gun52_r1_r1_r1, -1.1781F, 0.0F, 0.0F);
		gun52_r1_r1_r1.cubeList.add(new ModelBox(gun52_r1_r1_r1, 151, 72, -4.301F, -39.154F, -54.0132F, 1, 1, 1, 0.0F, false));

		gun55_r1_r1_r1 = new ModelRenderer(this);
		gun55_r1_r1_r1.setRotationPoint(0.0F, -9.0342F, 50.1531F);
		gun.addChild(gun55_r1_r1_r1);
		setRotationAngle(gun55_r1_r1_r1, 1.1781F, 0.0F, 0.0F);
		gun55_r1_r1_r1.cubeList.add(new ModelBox(gun55_r1_r1_r1, 149, 120, -4.301F, -77.2761F, -4.4893F, 1, 1, 1, 0.0F, false));

		gun54_r2_r1_r1 = new ModelRenderer(this);
		gun54_r2_r1_r1.setRotationPoint(0.0F, 42.4689F, -28.8199F);
		gun.addChild(gun54_r2_r1_r1);
		setRotationAngle(gun54_r2_r1_r1, -1.1781F, 0.0F, 0.0F);
		gun54_r2_r1_r1.cubeList.add(new ModelBox(gun54_r2_r1_r1, 149, 124, -4.301F, -35.5609F, -69.5362F, 1, 1, 1, 0.0F, false));

		gun54_r1_r1_r1 = new ModelRenderer(this);
		gun54_r1_r1_r1.setRotationPoint(0.0F, -10.8133F, 47.6042F);
		gun.addChild(gun54_r1_r1_r1);
		setRotationAngle(gun54_r1_r1_r1, 1.1781F, 0.0F, 0.0F);
		gun54_r1_r1_r1.cubeList.add(new ModelBox(gun54_r1_r1_r1, 98, 56, -4.301F, -73.7995F, -7.6362F, 1, 1, 1, 0.0F, false));

		gun53_r1_r1_r1 = new ModelRenderer(this);
		gun53_r1_r1_r1.setRotationPoint(0.0F, 40.69F, -26.271F);
		gun.addChild(gun53_r1_r1_r1);
		setRotationAngle(gun53_r1_r1_r1, -1.1781F, 0.0F, 0.0F);
		gun53_r1_r1_r1.cubeList.add(new ModelBox(gun53_r1_r1_r1, 98, 58, -4.301F, -32.0842F, -66.3893F, 1, 1, 1, 0.0F, false));

		gun83_r1_r1_r1 = new ModelRenderer(this);
		gun83_r1_r1_r1.setRotationPoint(0.0499F, 0.5629F, 0.0F);
		gun.addChild(gun83_r1_r1_r1);
		setRotationAngle(gun83_r1_r1_r1, 0.0F, 0.0F, -0.1309F);
		gun83_r1_r1_r1.cubeList.add(new ModelBox(gun83_r1_r1_r1, 0, 142, 5.0204F, -35.0995F, -25.5F, 1, 4, 9, 0.0F, false));

		gun109_r1_r1_r1 = new ModelRenderer(this);
		gun109_r1_r1_r1.setRotationPoint(0.6598F, 0.0F, 2.3694F);
		gun.addChild(gun109_r1_r1_r1);
		setRotationAngle(gun109_r1_r1_r1, 0.0F, 0.3054F, 0.0F);
		gun109_r1_r1_r1.cubeList.add(new ModelBox(gun109_r1_r1_r1, 89, 102, 8.426F, -35.5F, -28.0202F, 1, 1, 1, -0.1F, false));

		gun110_r1_r1_r1 = new ModelRenderer(this);
		gun110_r1_r1_r1.setRotationPoint(-0.5033F, 0.0F, 1.3201F);
		gun.addChild(gun110_r1_r1_r1);
		setRotationAngle(gun110_r1_r1_r1, 0.0F, -0.3054F, 0.0F);
		gun110_r1_r1_r1.cubeList.add(new ModelBox(gun110_r1_r1_r1, 77, 102, -4.1422F, -35.5F, -16.714F, 1, 1, 1, -0.1F, false));

		gun383 = new ModelRenderer(this);
		gun383.setRotationPoint(-2.0F, -38.4F, -14.7F);
		gun.addChild(gun383);
		setRotationAngle(gun383, -0.1115F, 0.0F, 0.0F);
		gun383.cubeList.add(new ModelBox(gun383, 144, 60, 0.0F, 4.969F, 0.5563F, 1, 1, 7, 0.0F, false));

		gun384 = new ModelRenderer(this);
		gun384.setRotationPoint(-2.0F, -37.6F, -8.0F);
		gun.addChild(gun384);
		setRotationAngle(gun384, 0.2231F, 0.0F, 0.0F);
		gun384.cubeList.add(new ModelBox(gun384, 105, 18, -0.001F, 4.8761F, -1.1063F, 1, 1, 3, 0.0F, false));

		gun385 = new ModelRenderer(this);
		gun385.setRotationPoint(-2.0F, -38.2F, -5.1F);
		gun.addChild(gun385);
		setRotationAngle(gun385, 0.0372F, 0.0F, 0.0F);
		gun385.cubeList.add(new ModelBox(gun385, 129, 173, 0.0F, 4.9965F, -0.186F, 1, 1, 5, 0.0F, false));

		gun382 = new ModelRenderer(this);
		gun382.setRotationPoint(-2.0F, -38.1F, -18.7F);
		gun.addChild(gun382);
		setRotationAngle(gun382, 0.0744F, 0.0F, 0.0F);
		gun382.cubeList.add(new ModelBox(gun382, 30, 193, -0.001F, 4.9862F, -0.3717F, 1, 1, 4, 0.0F, false));
		gun382.cubeList.add(new ModelBox(gun382, 181, 26, 0.0F, 4.3048F, -8.1314F, 1, 1, 4, 0.0F, false));

		gun381 = new ModelRenderer(this);
		gun381.setRotationPoint(-2.0F, -38.5F, -22.5F);
		gun.addChild(gun381);
		setRotationAngle(gun381, -0.1115F, 0.0F, 0.0F);
		gun381.cubeList.add(new ModelBox(gun381, 60, 191, 0.0F, 4.969F, 0.5563F, 1, 1, 4, 0.0F, false));

		gun366 = new ModelRenderer(this);
		gun366.setRotationPoint(-3.0F, -36.0F, -0.5F);
		gun.addChild(gun366);
		gun366.cubeList.add(new ModelBox(gun366, 72, 169, -1.0F, 0.001F, -0.001F, 5, 5, 4, 0.0F, false));
		gun366.cubeList.add(new ModelBox(gun366, 33, 121, -1.0F, 0.001F, -40.001F, 5, 5, 6, 0.0F, false));
		gun366.cubeList.add(new ModelBox(gun366, 94, 285, -0.5F, 1.501F, -53.001F, 4, 4, 13, 0.0F, false));
		gun366.cubeList.add(new ModelBox(gun366, 193, 27, -0.5F, -3.999F, -35.201F, 4, 4, 2, 0.0F, false));

		gun113 = new ModelRenderer(this);
		gun113.setRotationPoint(-2.0F, -28.0F, -9.7F);
		gun.addChild(gun113);
		setRotationAngle(gun113, -2.6397F, 0.0F, 0.0F);
		gun113.cubeList.add(new ModelBox(gun113, 155, 108, -0.001F, -1.7533F, 0.9622F, 1, 1, 1, 0.0F, false));

		gun112 = new ModelRenderer(this);
		gun112.setRotationPoint(-2.0F, -28.7F, -9.1F);
		gun.addChild(gun112);
		setRotationAngle(gun112, -2.3051F, 0.0F, 0.0F);
		gun112.cubeList.add(new ModelBox(gun112, 144, 46, 0.0F, -1.3401F, 1.4846F, 1, 1, 1, 0.0F, false));

		gun111 = new ModelRenderer(this);
		gun111.setRotationPoint(-2.0F, -31.8F, -9.0F);
		gun.addChild(gun111);
		setRotationAngle(gun111, -0.3718F, 0.0F, 0.0F);
		gun111.cubeList.add(new ModelBox(gun111, 17, 37, -0.001F, 1.8633F, 0.7266F, 1, 3, 1, 0.0F, false));

		gun110 = new ModelRenderer(this);
		gun110.setRotationPoint(-2.0F, -31.2F, -10.5F);
		gun.addChild(gun110);
		setRotationAngle(gun110, 0.4461F, 0.0F, 0.0F);
		gun110.cubeList.add(new ModelBox(gun110, 60, 95, 0.0F, 1.8043F, -0.8629F, 1, 2, 1, 0.0F, false));

		gun107 = new ModelRenderer(this);
		gun107.setRotationPoint(-3.8F, -34.8F, 0.5F);
		gun.addChild(gun107);
		gun107.cubeList.add(new ModelBox(gun107, 144, 44, -0.5F, -0.7F, 1.4F, 1, 1, 1, 0.0F, false));
		gun107.cubeList.add(new ModelBox(gun107, 149, 110, -0.5F, -0.7F, -0.5F, 1, 1, 1, 0.0F, false));
		gun107.cubeList.add(new ModelBox(gun107, 149, 106, -0.5F, 2.4F, -0.5F, 1, 1, 1, 0.0F, false));
		gun107.cubeList.add(new ModelBox(gun107, 155, 96, 0.1F, 1.8F, -45.5F, 1, 1, 1, 0.3F, false));
		gun107.cubeList.add(new ModelBox(gun107, 155, 98, -0.5F, 2.4F, -40.5F, 1, 1, 1, 0.0F, false));
		gun107.cubeList.add(new ModelBox(gun107, 43, 155, -0.5F, 2.4F, -31.9F, 1, 1, 1, 0.0F, false));
		gun107.cubeList.add(new ModelBox(gun107, 154, 116, -0.5F, 2.4F, -34.9F, 1, 1, 1, 0.0F, false));
		gun107.cubeList.add(new ModelBox(gun107, 37, 155, -0.5F, 2.4F, -27.5F, 1, 1, 1, 0.0F, false));
		gun107.cubeList.add(new ModelBox(gun107, 155, 17, -0.5F, 2.4F, -25.6F, 1, 1, 1, 0.0F, false));
		gun107.cubeList.add(new ModelBox(gun107, 155, 106, -0.5F, -0.7F, -40.5F, 1, 1, 1, 0.0F, false));

		feedWay = new ModelRenderer(this);
		feedWay.setRotationPoint(0.0F, 0.0F, 0.0F);
		gun.addChild(feedWay);
		feedWay.cubeList.add(new ModelBox(feedWay, 288, 0, -0.9F, -36.4F, -35.2F, 2, 1, 14, 0.0F, false));
		feedWay.cubeList.add(new ModelBox(feedWay, 288, 15, -4.1F, -36.4F, -35.2F, 2, 1, 14, 0.0F, false));
		feedWay.cubeList.add(new ModelBox(feedWay, 124, 10, -1.9F, -37.6F, -35.2F, 3, 1, 6, 0.0F, false));
		feedWay.cubeList.add(new ModelBox(feedWay, 0, 125, -4.1F, -37.6F, -35.2F, 3, 1, 6, 0.0F, false));
		feedWay.cubeList.add(new ModelBox(feedWay, 52, 81, -1.9F, -37.4F, -35.2F, 3, 1, 6, 0.0F, false));
		feedWay.cubeList.add(new ModelBox(feedWay, 52, 113, -4.1F, -37.4F, -35.2F, 3, 1, 6, 0.0F, false));
		feedWay.cubeList.add(new ModelBox(feedWay, 126, 72, -2.5133F, -37.6175F, -29.2F, 1, 1, 7, 0.0F, false));
		feedWay.cubeList.add(new ModelBox(feedWay, 124, 41, -2.4867F, -37.6175F, -29.2F, 2, 1, 7, 0.0F, false));

		cube_r1_r1_r1 = new ModelRenderer(this);
		cube_r1_r1_r1.setRotationPoint(9.9964F, 11.1959F, 0.0F);
		feedWay.addChild(cube_r1_r1_r1);
		setRotationAngle(cube_r1_r1_r1, 0.0F, 0.0F, -0.6545F);
		cube_r1_r1_r1.cubeList.add(new ModelBox(cube_r1_r1_r1, 20, 133, 17.7912F, -46.3416F, -29.2F, 2, 1, 7, 0.0F, false));

		cube_r2_r1_r1 = new ModelRenderer(this);
		cube_r2_r1_r1.setRotationPoint(-9.0127F, 11.9506F, 0.0F);
		feedWay.addChild(cube_r2_r1_r1);
		setRotationAngle(cube_r2_r1_r1, 0.0F, 0.0F, 0.6545F);
		cube_r2_r1_r1.cubeList.add(new ModelBox(cube_r2_r1_r1, 124, 111, -23.4111F, -44.5153F, -29.2F, 2, 1, 7, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-2.0F, -40.0F, -70.5F);
		gun.addChild(bone);
		

		gun160 = new ModelRenderer(this);
		gun160.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(gun160);
		gun160.cubeList.add(new ModelBox(gun160, 216, 0, 0.0F, 6.3F, -6.6F, 1, 1, 24, -0.1F, false));
		gun160.cubeList.add(new ModelBox(gun160, 144, 143, 0.0F, 7.4314F, -6.6F, 1, 1, 24, -0.1F, false));

		gun161 = new ModelRenderer(this);
		gun161.setRotationPoint(-1.0F, 1.0F, 0.0F);
		bone.addChild(gun161);
		gun161.cubeList.add(new ModelBox(gun161, 144, 214, 0.4343F, 5.8657F, -6.6F, 1, 1, 24, -0.1F, false));
		gun161.cubeList.add(new ModelBox(gun161, 0, 168, 1.5657F, 5.8657F, -6.6F, 1, 1, 24, -0.1F, false));

		gun162 = new ModelRenderer(this);
		gun162.setRotationPoint(-1.0F, 1.0F, 0.0F);
		bone.addChild(gun162);
		setRotationAngle(gun162, 0.0F, 0.0F, -0.7854F);
		gun162.cubeList.add(new ModelBox(gun162, 72, 214, -3.9406F, 4.4962F, -6.6F, 1, 1, 24, -0.1F, false));

		gun163 = new ModelRenderer(this);
		gun163.setRotationPoint(-1.0F, 2.0F, 0.0F);
		bone.addChild(gun163);
		setRotationAngle(gun163, 0.0F, 0.0F, -0.7854F);
		gun163.cubeList.add(new ModelBox(gun163, 0, 213, -3.7991F, 4.3548F, -6.6F, 1, 1, 24, -0.1F, false));

		gun165 = new ModelRenderer(this);
		gun165.setRotationPoint(1.0F, 0.0F, 0.0F);
		bone.addChild(gun165);
		setRotationAngle(gun165, 0.0F, 0.0F, 0.7854F);
		gun165.cubeList.add(new ModelBox(gun165, 72, 169, 4.3548F, 4.4962F, -6.6F, 1, 1, 24, -0.1F, false));

		gun168 = new ModelRenderer(this);
		gun168.setRotationPoint(1.0F, 3.0F, 0.0F);
		bone.addChild(gun168);
		setRotationAngle(gun168, 0.0F, 0.0F, -2.3562F);
		gun168.cubeList.add(new ModelBox(gun168, 144, 168, -3.7991F, -3.9406F, -6.6F, 1, 1, 24, -0.1F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gun.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}