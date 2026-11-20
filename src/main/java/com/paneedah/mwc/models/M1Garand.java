package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M1Garand extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer gun_r1;
	private final ModelRenderer gun_r2;
	private final ModelRenderer gun_r3;
	private final ModelRenderer gun_r4;
	private final ModelRenderer gun61_r1;
	private final ModelRenderer gun60_r1;
	private final ModelRenderer gun100_r1;
	private final ModelRenderer gun427_r1;
	private final ModelRenderer gun178;
	private final ModelRenderer gun176;
	private final ModelRenderer gun118;
	private final ModelRenderer gun115;
	private final ModelRenderer gun114;
	private final ModelRenderer gun87;
	private final ModelRenderer gun81;
	private final ModelRenderer gun75;
	private final ModelRenderer bone2;
	private final ModelRenderer gun79_r1;
	private final ModelRenderer gun78_r1;
	private final ModelRenderer gun78_r2;
	private final ModelRenderer bone7;
	private final ModelRenderer gun80_r1;
	private final ModelRenderer gun81_r1;
	private final ModelRenderer gun80_r2;
	private final ModelRenderer gun79_r2;
	private final ModelRenderer gun81_r2;
	private final ModelRenderer gun80_r3;
	private final ModelRenderer gun79_r3;
	private final ModelRenderer gun24;
	private final ModelRenderer gun23;
	private final ModelRenderer gun22;
	private final ModelRenderer gun20;
	private final ModelRenderer gun19;
	private final ModelRenderer sights;
	private final ModelRenderer bone13_r1;
	private final ModelRenderer bone13_r2;
	private final ModelRenderer bone11_r1;
	private final ModelRenderer bone8_r1;
	private final ModelRenderer bone9_r1;
	private final ModelRenderer bone10_r1;
	private final ModelRenderer bone9_r2;
	private final ModelRenderer bone9_r3;

	public M1Garand() {
		textureWidth = 496;
		textureHeight = 496;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		gun.cubeList.add(new ModelBox(gun, 115, 457, -3.0F, -39.1F, -17.7F, 3, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 451, 258, -0.75F, -40.4F, -12.4F, 1, 1, 1, -0.025F, false));
		gun.cubeList.add(new ModelBox(gun, 451, 258, -3.225F, -40.4F, -12.4F, 1, 1, 1, -0.025F, false));
		gun.cubeList.add(new ModelBox(gun, 451, 258, -3.225F, -39.7283F, -11.7282F, 2, 2, 1, -0.025F, false));
		gun.cubeList.add(new ModelBox(gun, 451, 258, -1.75F, -39.7283F, -11.7282F, 2, 2, 1, -0.025F, false));
		gun.cubeList.add(new ModelBox(gun, 468, 457, -4.1F, -40.7F, -13.1F, 1, 2, 2, -0.225F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 469, 0.2F, -40.7F, -13.1F, 1, 2, 2, -0.225F, false));
		gun.cubeList.add(new ModelBox(gun, 313, 464, -3.3F, -38.7F, -32.0F, 1, 3, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 469, 422, -3.3F, -36.7F, -29.0F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 448, 187, -3.8F, -37.1F, -27.3F, 1, 1, 18, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 454, 41, -3.7F, -38.0F, -27.3F, 1, 3, 7, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 277, 378, -2.5F, -39.3F, -32.0F, 2, 4, 3, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 91, 469, -0.025F, -39.075F, -31.5F, 1, 1, 2, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 262, 471, -0.025F, -39.075F, -30.0F, 1, 1, 1, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 302, 464, -0.4F, -39.175F, -29.6F, 1, 1, 4, -0.101F, false));
		gun.cubeList.add(new ModelBox(gun, 194, 457, -0.4F, -38.675F, -24.1F, 1, 1, 6, -0.101F, false));
		gun.cubeList.add(new ModelBox(gun, 448, 207, -0.3F, -38.3F, -31.5F, 1, 4, 13, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 448, 225, -0.025F, -38.3F, -31.5F, 1, 4, 13, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 450, 77, 0.175F, -37.1F, -29.5F, 1, 1, 9, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 265, 457, -0.5F, -38.6F, -18.5F, 1, 3, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 132, 457, -3.5F, -38.6F, -13.5F, 4, 5, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 428, 323, -2.0F, -29.8F, -14.5F, 1, 3, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 269, 466, -2.0F, -30.8F, -6.5F, 1, 3, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 459, 452, -3.0F, -25.95F, -11.05F, 3, 1, 3, 0.0F, false));

		gun_r1 = new ModelRenderer(this);
		gun_r1.setRotationPoint(0.875F, -37.0F, -19.7F);
		gun.addChild(gun_r1);
		setRotationAngle(gun_r1, 0.0F, 0.0F, -2.8798F);
		gun_r1.cubeList.add(new ModelBox(gun_r1, 102, 468, -0.5F, -1.0F, -1.0F, 1, 2, 2, -0.1F, false));

		gun_r2 = new ModelRenderer(this);
		gun_r2.setRotationPoint(-1.5F, -40.4347F, -18.7244F);
		gun.addChild(gun_r2);
		setRotationAngle(gun_r2, -0.9599F, 0.0F, 0.0F);
		gun_r2.cubeList.add(new ModelBox(gun_r2, 468, 119, -1.5F, -0.5F, 1.5F, 3, 1, 1, 0.0F, false));

		gun_r3 = new ModelRenderer(this);
		gun_r3.setRotationPoint(-1.4875F, -39.7032F, -12.425F);
		gun.addChild(gun_r3);
		setRotationAngle(gun_r3, -0.7854F, 0.0F, 0.0F);
		gun_r3.cubeList.add(new ModelBox(gun_r3, 451, 258, 0.7375F, -0.5F, -0.5F, 1, 1, 1, -0.025F, false));
		gun_r3.cubeList.add(new ModelBox(gun_r3, 451, 258, -1.7375F, -0.5F, -0.5F, 1, 1, 1, -0.025F, false));

		gun_r4 = new ModelRenderer(this);
		gun_r4.setRotationPoint(-1.4875F, -39.7032F, -11.425F);
		gun.addChild(gun_r4);
		setRotationAngle(gun_r4, -0.7854F, 0.0F, 0.0F);
		gun_r4.cubeList.add(new ModelBox(gun_r4, 451, 258, 0.7375F, -0.5F, -0.5F, 1, 1, 1, -0.025F, false));
		gun_r4.cubeList.add(new ModelBox(gun_r4, 451, 258, -1.7375F, -0.5F, -0.5F, 1, 1, 1, -0.025F, false));

		gun61_r1 = new ModelRenderer(this);
		gun61_r1.setRotationPoint(0.5F, -38.35F, -11.1F);
		gun.addChild(gun61_r1);
		setRotationAngle(gun61_r1, -1.2217F, 0.0F, 0.0F);
		gun61_r1.cubeList.add(new ModelBox(gun61_r1, 323, 457, -4.0F, -4.3564F, 2.6499F, 4, 1, 3, -0.002F, false));

		gun60_r1 = new ModelRenderer(this);
		gun60_r1.setRotationPoint(0.5F, -38.7F, -16.1F);
		gun.addChild(gun60_r1);
		setRotationAngle(gun60_r1, -0.0698F, 0.0F, 0.0F);
		gun60_r1.cubeList.add(new ModelBox(gun60_r1, 106, 396, -4.0F, 0.6488F, 5.0576F, 4, 2, 5, -0.001F, false));

		gun100_r1 = new ModelRenderer(this);
		gun100_r1.setRotationPoint(-3.55F, -38.8F, -25.5F);
		gun.addChild(gun100_r1);
		setRotationAngle(gun100_r1, -0.0698F, 0.0F, 0.0F);
		gun100_r1.cubeList.add(new ModelBox(gun100_r1, 450, 88, -0.15F, 0.4488F, 4.8576F, 1, 3, 8, -0.201F, false));

		gun427_r1 = new ModelRenderer(this);
		gun427_r1.setRotationPoint(0.0F, -40.3F, -22.6F);
		gun.addChild(gun427_r1);
		setRotationAngle(gun427_r1, -1.4312F, 0.0F, 0.0F);
		gun427_r1.cubeList.add(new ModelBox(gun427_r1, 402, 464, -3.0F, -8.9844F, 1.884F, 3, 4, 1, -0.001F, false));

		gun178 = new ModelRenderer(this);
		gun178.setRotationPoint(-2.0F, -28.15F, -13.9F);
		gun.addChild(gun178);
		setRotationAngle(gun178, -2.0076F, 0.0F, 0.0F);
		gun178.cubeList.add(new ModelBox(gun178, 469, 93, 0.0F, -4.9536F, -2.2091F, 1, 1, 2, 0.0F, false));

		gun176 = new ModelRenderer(this);
		gun176.setRotationPoint(-2.0F, -31.0F, -14.1F);
		gun.addChild(gun176);
		setRotationAngle(gun176, -1.2641F, 0.0F, 0.0F);
		gun176.cubeList.add(new ModelBox(gun176, 469, 109, 0.0F, -4.4648F, 2.4629F, 1, 1, 2, 0.0F, false));

		gun118 = new ModelRenderer(this);
		gun118.setRotationPoint(-2.5F, -40.3F, -39.0F);
		gun.addChild(gun118);
		setRotationAngle(gun118, 0.0F, 0.0F, 0.8976F);
		gun118.cubeList.add(new ModelBox(gun118, 206, 465, 0.7818F, 0.6235F, 7.0F, 1, 1, 3, 0.001F, false));

		gun115 = new ModelRenderer(this);
		gun115.setRotationPoint(-0.5F, -40.3F, -38.5F);
		gun.addChild(gun115);
		setRotationAngle(gun115, 0.0F, 0.0F, 0.2244F);
		gun115.cubeList.add(new ModelBox(gun115, 471, 48, 0.2225F, 0.9749F, 7.0F, 1, 1, 1, 0.0F, false));

		gun114 = new ModelRenderer(this);
		gun114.setRotationPoint(-0.5F, -40.3F, -38.0F);
		gun.addChild(gun114);
		setRotationAngle(gun114, 0.0F, 0.0F, 0.2244F);
		gun114.cubeList.add(new ModelBox(gun114, 469, 113, 0.2225F, 0.9749F, 7.0F, 1, 1, 2, 0.001F, false));

		gun87 = new ModelRenderer(this);
		gun87.setRotationPoint(0.7F, -40.0F, -38.5F);
		gun.addChild(gun87);
		setRotationAngle(gun87, 0.0F, -2.0442F, 0.0F);
		gun87.cubeList.add(new ModelBox(gun87, 19, 471, 6.2301F, 1.0F, -3.1914F, 1, 3, 1, 0.0F, false));

		gun81 = new ModelRenderer(this);
		gun81.setRotationPoint(-0.3F, -40.0F, -32.5F);
		gun.addChild(gun81);
		setRotationAngle(gun81, -0.2557F, 0.0F, 0.0F);
		gun81.cubeList.add(new ModelBox(gun81, 336, 464, -0.099F, -0.9257F, 6.7101F, 1, 1, 4, -0.102F, false));

		gun75 = new ModelRenderer(this);
		gun75.setRotationPoint(-3.5F, -39.8F, -15.5F);
		gun.addChild(gun75);
		setRotationAngle(gun75, -1.041F, 0.0F, 0.0F);
		gun75.cubeList.add(new ModelBox(gun75, 102, 464, 0.0F, -3.7081F, 3.5623F, 4, 1, 2, -0.002F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-0.7F, -39.5F, -15.5F);
		gun.addChild(bone2);
		

		gun79_r1 = new ModelRenderer(this);
		gun79_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(gun79_r1);
		setRotationAngle(gun79_r1, -0.0622F, 0.0412F, 0.5906F);
		gun79_r1.cubeList.add(new ModelBox(gun79_r1, 338, 457, 0.7904F, 0.517F, 4.5106F, 1, 1, 5, -0.001F, false));
		gun79_r1.cubeList.add(new ModelBox(gun79_r1, 351, 457, 0.3504F, 0.517F, 4.5106F, 1, 1, 5, 0.0F, false));

		gun78_r1 = new ModelRenderer(this);
		gun78_r1.setRotationPoint(-1.6F, 0.0F, 0.0F);
		bone2.addChild(gun78_r1);
		setRotationAngle(gun78_r1, -0.0622F, -0.0412F, -0.5906F);
		gun78_r1.cubeList.add(new ModelBox(gun78_r1, 364, 457, -1.7904F, 0.517F, 4.5106F, 1, 1, 5, -0.001F, false));
		gun78_r1.cubeList.add(new ModelBox(gun78_r1, 377, 457, -1.3504F, 0.517F, 4.5106F, 1, 1, 5, 0.0F, false));

		gun78_r2 = new ModelRenderer(this);
		gun78_r2.setRotationPoint(0.2F, 0.0F, 0.1F);
		bone2.addChild(gun78_r2);
		setRotationAngle(gun78_r2, -0.0746F, 0.0006F, 0.0F);
		gun78_r2.cubeList.add(new ModelBox(gun78_r2, 278, 457, -2.003F, 0.4246F, 4.6606F, 2, 1, 5, -0.2F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-0.7F, -39.1F, -10.99F);
		gun.addChild(bone7);
		setRotationAngle(bone7, -1.1519F, 0.0F, 0.0F);
		

		gun80_r1 = new ModelRenderer(this);
		gun80_r1.setRotationPoint(3.0F, 0.0F, -0.01F);
		bone7.addChild(gun80_r1);
		setRotationAngle(gun80_r1, -0.0808F, -0.4835F, 0.3336F);
		gun80_r1.cubeList.add(new ModelBox(gun80_r1, 89, 461, -2.6459F, -3.7078F, 3.9377F, 2, 1, 1, -0.401F, false));
		gun80_r1.cubeList.add(new ModelBox(gun80_r1, 468, 258, -2.3459F, -3.7078F, 4.3177F, 2, 1, 1, -0.401F, false));
		gun80_r1.cubeList.add(new ModelBox(gun80_r1, 469, 97, -2.4459F, -3.7078F, 4.1277F, 2, 1, 1, -0.402F, false));

		gun81_r1 = new ModelRenderer(this);
		gun81_r1.setRotationPoint(3.0F, 0.0F, -0.01F);
		bone7.addChild(gun81_r1);
		setRotationAngle(gun81_r1, -0.0715F, 0.0212F, 0.2944F);
		gun81_r1.cubeList.add(new ModelBox(gun81_r1, 322, 469, -4.5399F, -3.7077F, 2.4605F, 1, 1, 2, -0.403F, false));

		gun80_r2 = new ModelRenderer(this);
		gun80_r2.setRotationPoint(3.0F, 0.0F, -0.01F);
		bone7.addChild(gun80_r2);
		setRotationAngle(gun80_r2, -0.0715F, 0.0212F, 0.2944F);
		gun80_r2.cubeList.add(new ModelBox(gun80_r2, 347, 464, -3.8999F, -3.3077F, 3.3605F, 1, 1, 4, 0.0F, false));
		gun80_r2.cubeList.add(new ModelBox(gun80_r2, 358, 464, -4.1399F, -3.3077F, 3.3605F, 1, 1, 4, 0.001F, false));

		gun79_r2 = new ModelRenderer(this);
		gun79_r2.setRotationPoint(-1.6F, 0.0F, -0.01F);
		bone7.addChild(gun79_r2);
		setRotationAngle(gun79_r2, -0.0715F, -0.0212F, -0.2944F);
		gun79_r2.cubeList.add(new ModelBox(gun79_r2, 115, 464, 0.0296F, -4.1804F, 3.3591F, 1, 1, 4, 0.0F, false));
		gun79_r2.cubeList.add(new ModelBox(gun79_r2, 147, 464, 0.2696F, -4.1804F, 3.3591F, 1, 1, 4, 0.001F, false));

		gun81_r2 = new ModelRenderer(this);
		gun81_r2.setRotationPoint(-1.6F, 0.0F, -0.01F);
		bone7.addChild(gun81_r2);
		setRotationAngle(gun81_r2, -0.0808F, 0.4835F, -0.3336F);
		gun81_r2.cubeList.add(new ModelBox(gun81_r2, 403, 470, -2.1638F, -4.5805F, 2.925F, 2, 1, 1, -0.401F, false));
		gun81_r2.cubeList.add(new ModelBox(gun81_r2, 432, 470, -2.0638F, -4.5805F, 2.735F, 2, 1, 1, -0.402F, false));
		gun81_r2.cubeList.add(new ModelBox(gun81_r2, 439, 470, -1.8638F, -4.5805F, 2.545F, 2, 1, 1, -0.401F, false));

		gun80_r3 = new ModelRenderer(this);
		gun80_r3.setRotationPoint(-1.6F, 0.0F, -0.01F);
		bone7.addChild(gun80_r3);
		setRotationAngle(gun80_r3, -0.0715F, -0.0212F, -0.2944F);
		gun80_r3.cubeList.add(new ModelBox(gun80_r3, 329, 469, 0.6696F, -4.5804F, 2.4591F, 1, 1, 2, -0.403F, false));

		gun79_r3 = new ModelRenderer(this);
		gun79_r3.setRotationPoint(0.2F, 0.0F, 0.09F);
		bone7.addChild(gun79_r3);
		setRotationAngle(gun79_r3, -0.0746F, 0.0006F, 0.0F);
		gun79_r3.cubeList.add(new ModelBox(gun79_r3, 293, 457, -2.0018F, -4.569F, 2.259F, 2, 1, 5, -0.2F, false));

		gun24 = new ModelRenderer(this);
		gun24.setRotationPoint(-3.0F, -29.3F, -18.0F);
		gun.addChild(gun24);
		setRotationAngle(gun24, 2.7338F, 0.0F, 0.0F);
		gun24.cubeList.add(new ModelBox(gun24, 0, 464, 0.0F, 1.0649F, -4.9866F, 3, 1, 3, 0.0F, false));

		gun23 = new ModelRenderer(this);
		gun23.setRotationPoint(-3.0F, -27.3F, -17.5F);
		gun.addChild(gun23);
		setRotationAngle(gun23, 1.8961F, 0.0F, 0.0F);
		gun23.cubeList.add(new ModelBox(gun23, 261, 425, 0.0F, 4.4182F, -2.5455F, 3, 1, 4, 0.0F, false));

		gun22 = new ModelRenderer(this);
		gun22.setRotationPoint(-3.0F, -25.95F, -16.05F);
		gun.addChild(gun22);
		setRotationAngle(gun22, 2.4166F, 0.0F, 0.0F);
		gun22.cubeList.add(new ModelBox(gun22, 411, 464, 0.0F, 2.5671F, -4.4057F, 3, 1, 2, 0.0F, false));

		gun20 = new ModelRenderer(this);
		gun20.setRotationPoint(-3.0F, -27.3F, -11.6F);
		gun.addChild(gun20);
		setRotationAngle(gun20, -2.3794F, 0.0F, 0.0F);
		gun20.cubeList.add(new ModelBox(gun20, 422, 464, 0.0F, -4.1759F, -2.9261F, 3, 1, 2, 0.0F, false));

		gun19 = new ModelRenderer(this);
		gun19.setRotationPoint(-3.0F, -30.2F, -10.7F);
		gun.addChild(gun19);
		setRotationAngle(gun19, -1.8961F, 0.0F, 0.0F);
		gun19.cubeList.add(new ModelBox(gun19, 89, 464, 0.0F, -5.0574F, -0.6504F, 3, 1, 3, 0.0F, false));

		sights = new ModelRenderer(this);
		sights.setRotationPoint(-1.5F, -41.4464F, -17.725F);
		gun.addChild(sights);
		sights.cubeList.add(new ModelBox(sights, 267, 472, -0.4F, 1.2036F, 5.3F, 1, 1, 1, -0.35F, false));
		sights.cubeList.add(new ModelBox(sights, 472, 430, -0.6F, 1.2036F, 5.3F, 1, 1, 1, -0.35F, false));
		sights.cubeList.add(new ModelBox(sights, 472, 439, -0.9535F, 0.85F, 5.3F, 1, 1, 1, -0.35F, false));
		sights.cubeList.add(new ModelBox(sights, 472, 442, -0.9535F, 0.65F, 5.3F, 1, 1, 1, -0.35F, false));
		sights.cubeList.add(new ModelBox(sights, 472, 451, -0.6F, 0.2965F, 5.3F, 1, 1, 1, -0.35F, false));
		sights.cubeList.add(new ModelBox(sights, 472, 454, -0.4F, 0.2965F, 5.3F, 1, 1, 1, -0.35F, false));
		sights.cubeList.add(new ModelBox(sights, 473, 11, -0.0465F, 0.65F, 5.3F, 1, 1, 1, -0.35F, false));
		sights.cubeList.add(new ModelBox(sights, 197, 465, 1.349F, 1.1964F, 4.575F, 1, 2, 3, -0.35F, false));
		sights.cubeList.add(new ModelBox(sights, 13, 464, -2.35F, 1.1964F, 3.575F, 1, 2, 4, -0.35F, false));
		sights.cubeList.add(new ModelBox(sights, 425, 468, 1.349F, 2.0964F, 3.575F, 1, 2, 2, -0.35F, false));
		sights.cubeList.add(new ModelBox(sights, 283, 468, 1.349F, 0.2772F, 4.6558F, 1, 2, 2, -0.35F, false));
		sights.cubeList.add(new ModelBox(sights, 276, 468, -2.35F, 0.2772F, 4.6558F, 1, 2, 2, -0.35F, false));
		sights.cubeList.add(new ModelBox(sights, 473, 14, -0.0465F, 0.85F, 5.3F, 1, 1, 1, -0.35F, false));

		bone13_r1 = new ModelRenderer(this);
		bone13_r1.setRotationPoint(0.0F, 2.7278F, 3.2518F);
		sights.addChild(bone13_r1);
		setRotationAngle(bone13_r1, 0.5236F, 0.0F, 0.0F);
		bone13_r1.cubeList.add(new ModelBox(bone13_r1, 277, 396, 1.349F, -1.0F, -2.0F, 1, 2, 4, -0.35F, false));

		bone13_r2 = new ModelRenderer(this);
		bone13_r2.setRotationPoint(0.0F, 2.2535F, 4.2987F);
		sights.addChild(bone13_r2);
		setRotationAngle(bone13_r2, 0.7854F, 0.0F, 0.0F);
		bone13_r2.cubeList.add(new ModelBox(bone13_r2, 411, 468, -2.35F, -1.0F, 0.0F, 1, 2, 2, -0.35F, false));
		bone13_r2.cubeList.add(new ModelBox(bone13_r2, 418, 468, 1.349F, -1.0F, 0.0F, 1, 2, 2, -0.35F, false));

		bone11_r1 = new ModelRenderer(this);
		bone11_r1.setRotationPoint(0.0F, 2.2535F, 5.5987F);
		sights.addChild(bone11_r1);
		setRotationAngle(bone11_r1, 0.7854F, 0.0F, 0.0F);
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 84, 469, 1.349F, -1.0F, 0.0F, 1, 2, 2, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 469, 88, -2.35F, -1.0F, 0.0F, 1, 2, 2, -0.35F, false));

		bone8_r1 = new ModelRenderer(this);
		bone8_r1.setRotationPoint(0.2854F, 0.8939F, 5.8F);
		sights.addChild(bone8_r1);
		setRotationAngle(bone8_r1, 0.0F, 0.0F, 0.7854F);
		bone8_r1.cubeList.add(new ModelBox(bone8_r1, 473, 8, -0.35F, -0.5F, -0.5F, 1, 1, 1, -0.35F, false));
		bone8_r1.cubeList.add(new ModelBox(bone8_r1, 472, 470, -0.55F, -0.5F, -0.5F, 1, 1, 1, -0.35F, false));

		bone9_r1 = new ModelRenderer(this);
		bone9_r1.setRotationPoint(1.341F, 2.3081F, 5.8F);
		sights.addChild(bone9_r1);
		setRotationAngle(bone9_r1, 0.0F, 0.0F, 0.7854F);
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 472, 448, -2.65F, -0.2F, -0.5F, 1, 1, 1, -0.35F, false));
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 472, 445, -2.65F, -0.4F, -0.5F, 1, 1, 1, -0.35F, false));

		bone10_r1 = new ModelRenderer(this);
		bone10_r1.setRotationPoint(1.9824F, 2.9496F, 5.8F);
		sights.addChild(bone10_r1);
		setRotationAngle(bone10_r1, 0.0F, 0.0F, 0.7854F);
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 472, 436, -2.65F, -0.4F, -0.5F, 1, 1, 1, -0.35F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 472, 433, -2.65F, -0.2F, -0.5F, 1, 1, 1, -0.35F, false));

		bone9_r2 = new ModelRenderer(this);
		bone9_r2.setRotationPoint(0.0F, 1.7559F, 5.5862F);
		sights.addChild(bone9_r2);
		setRotationAngle(bone9_r2, 0.48F, 0.0F, 0.0F);
		bone9_r2.cubeList.add(new ModelBox(bone9_r2, 290, 470, -0.6F, -0.5F, -1.5F, 1, 1, 2, -0.35F, false));
		bone9_r2.cubeList.add(new ModelBox(bone9_r2, 297, 470, -0.4F, -0.5F, -1.5F, 1, 1, 2, -0.35F, false));

		bone9_r3 = new ModelRenderer(this);
		bone9_r3.setRotationPoint(-0.3561F, 1.5354F, 5.8F);
		sights.addChild(bone9_r3);
		setRotationAngle(bone9_r3, 0.0F, 0.0F, 0.7854F);
		bone9_r3.cubeList.add(new ModelBox(bone9_r3, 316, 471, -0.55F, -0.5F, -0.5F, 1, 1, 1, -0.35F, false));
		bone9_r3.cubeList.add(new ModelBox(bone9_r3, 311, 471, -0.35F, -0.5F, -0.5F, 1, 1, 1, -0.35F, false));
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