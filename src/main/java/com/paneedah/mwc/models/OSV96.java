package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class OSV96 extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r50;
	private final ModelRenderer cube_r51;
	private final ModelRenderer gun13TRIGGER2;
	private final ModelRenderer gun12TRIGGER2;
	private final ModelRenderer gun11TRIGGER2;
	private final ModelRenderer TRIGGER2;
	private final ModelRenderer barrel;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;
	private final ModelRenderer cube_r34;
	private final ModelRenderer cube_r35;
	private final ModelRenderer cube_r36;
	private final ModelRenderer cube_r37;
	private final ModelRenderer cube_r38;
	private final ModelRenderer cube_r39;
	private final ModelRenderer cube_r40;
	private final ModelRenderer cube_r41;
	private final ModelRenderer cube_r42;
	private final ModelRenderer cube_r43;
	private final ModelRenderer cube_r44;
	private final ModelRenderer cube_r45;
	private final ModelRenderer cube_r46;
	private final ModelRenderer cube_r47;
	private final ModelRenderer cube_r48;
	private final ModelRenderer cube_r49;
	private final ModelRenderer cube_r52;
	private final ModelRenderer cube_r53;
	private final ModelRenderer cube_r54;
	private final ModelRenderer cube_r55;
	private final ModelRenderer cube_r56;
	private final ModelRenderer cube_r57;
	private final ModelRenderer cube_r58;
	private final ModelRenderer cube_r59;
	private final ModelRenderer cube_r60;
	private final ModelRenderer cube_r61;
	private final ModelRenderer cube_r62;
	private final ModelRenderer cube_r63;

	public OSV96() {
		textureWidth = 688;
		textureHeight = 688;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.4F, 29.8F);
		gun.cubeList.add(new ModelBox(gun, 656, 559, -4.0F, -44.0F, -70.0F, 5, 7, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 414, 534, -4.0F, -44.0F, -69.0F, 5, 1, 57, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 414, 592, -2.0F, -42.7F, -69.0F, 1, 1, 57, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 72, 608, -4.0F, -38.0F, -46.0F, 5, 4, 28, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 110, 640, -4.0F, -38.0F, -18.0F, 5, 3, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 666, 109, -2.5F, -35.0F, -18.0F, 2, 2, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 656, 254, -4.5F, -36.2F, -42.6F, 6, 3, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 538, 457, -4.0F, -35.525F, -13.0F, 5, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 608, 436, -4.0F, -34.0F, -46.0F, 5, 2, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 648, 656, -2.5F, -33.1F, -42.6F, 2, 4, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 652, 629, -2.5F, -29.3929F, -41.8929F, 2, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 460, 444, -4.0F, -34.0F, -41.5F, 5, 1, 12, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 296, 534, 0.7071F, -43.2929F, -70.0F, 1, 6, 58, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 654, 323, 1.1071F, -40.2929F, -73.0F, 2, 3, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 654, 332, 2.4071F, -39.7929F, -73.5F, 1, 2, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 312, 653, 2.4071F, -39.2929F, -84.5F, 1, 1, 11, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 574, 656, 2.4071F, -39.7929F, -89.5F, 1, 2, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 410, 641, 1.7071F, -41.2929F, -57.0F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 410, 625, -4.7071F, -43.2929F, -70.0F, 1, 7, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 186, 634, -4.7071F, -43.2929F, -30.0F, 1, 6, 18, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 146, 651, -4.7071F, -43.2929F, -47.0F, 1, 1, 17, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 110, 651, -4.7071F, -41.2929F, -47.0F, 1, 2, 17, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 592, 444, -4.7071F, -39.2929F, -69.0F, 1, 2, 39, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 608, 182, -4.9571F, -37.2929F, -66.0F, 1, 3, 23, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 194, 608, 0.9429F, -37.2929F, -66.0F, 1, 3, 23, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 654, 351, -5.0571F, -37.7929F, -72.0F, 1, 4, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 410, 638, -5.0571F, -39.6929F, -70.0F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 4, 670, -5.0571F, -38.6929F, -69.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 8, 670, -5.055F, -38.6929F, -68.8F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 654, 341, 1.0429F, -37.7929F, -72.0F, 1, 4, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 656, 210, -4.4571F, -37.7929F, -72.0F, 6, 4, 2, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.9393F, -41.5251F, -53.0F);
		gun.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 296, 598, -2.5F, -1.0F, 6.0F, 1, 1, 35, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 538, 665, -2.5F, -1.0F, -17.0F, 1, 1, 3, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(2.0607F, -41.5251F, -69.0F);
		gun.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.7854F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 538, 534, -2.5F, -1.0F, -1.0F, 1, 1, 58, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-5.2071F, -39.3478F, -67.1564F);
		gun.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.1745F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 238, 654, 0.5011F, -0.9F, -2.1F, 1, 2, 8, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-4.5571F, -37.2182F, -66.959F);
		gun.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.5672F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 670, -0.4989F, -1.0F, -3.05F, 1, 1, 1, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 546, 665, -0.4989F, -1.0F, -2.5F, 1, 1, 3, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(2.3071F, -38.7929F, -68.25F);
		gun.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.7854F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 410, 633, -0.5F, -2.0F, -0.5F, 1, 4, 1, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(2.3071F, -38.7929F, -71.75F);
		gun.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.7854F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 292, 620, -0.5F, -2.0F, -0.5F, 1, 4, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-1.5F, -32.9543F, -46.0155F);
		gun.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0873F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 530, 593, -2.499F, 0.4F, 0.0F, 5, 1, 34, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-1.5F, -27.7565F, -41.1151F);
		gun.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.7854F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 458, 669, -1.0F, -2.0F, -0.1F, 2, 1, 1, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-1.5F, -30.5F, -45.5F);
		gun.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.3491F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 562, 665, -1.0F, -2.0F, -0.1F, 2, 4, 1, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-0.7F, -43.1F, -64.75F);
		gun.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 130, 649, -1.8F, -2.2F, 7.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 650, 532, -1.8F, -2.2F, 5.85F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 656, 591, -1.8F, -2.2F, 8.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 662, 591, -1.8F, -2.2F, 9.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 668, 359, -1.8F, -2.2F, 10.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 668, 521, -1.8F, -2.2F, 12.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 668, 565, -1.8F, -2.2F, 13.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 668, 591, -1.8F, -2.2F, 14.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 272, 669, -1.8F, -2.2F, 15.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 404, 669, -1.8F, -2.2F, 17.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 488, 669, -1.8F, -2.2F, 18.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 410, 669, -1.8F, -2.2F, 19.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 416, 669, -1.8F, -2.2F, 20.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 422, 669, -1.8F, -2.2F, 22.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 428, 669, -1.8F, -2.2F, 23.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 434, 669, -1.8F, -2.2F, 24.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 440, 669, -1.8F, -2.2F, 25.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 446, 669, -1.8F, -2.2F, 27.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 452, 669, -1.8F, -2.2F, 28.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 608, -1.7F, -1.6F, -4.9F, 2, 1, 34, -0.001F, false));
		bone3.cubeList.add(new ModelBox(bone3, 608, 0, -1.9F, -1.6F, -4.9F, 1, 1, 34, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 406, 647, -1.8F, -2.2F, 4.55F, 2, 1, 2, -0.199F, false));

		cube_r50 = new ModelRenderer(this);
		cube_r50.setRotationPoint(-1.6F, -2.775F, -1.25F);
		bone3.addChild(cube_r50);
		setRotationAngle(cube_r50, 0.0F, 0.0F, 0.8901F);
		cube_r50.cubeList.add(new ModelBox(cube_r50, 6, 667, 0.4029F, 0.2899F, 5.799F, 1, 1, 2, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 608, 208, 0.3529F, 0.4399F, 7.199F, 1, 1, 23, -0.35F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 282, 645, 0.4029F, 0.2899F, 29.549F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 574, 646, 0.4029F, 0.2899F, 28.299F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 282, 647, 0.4029F, 0.2899F, 27.049F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 574, 648, 0.4029F, 0.2899F, 25.799F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 282, 649, 0.4029F, 0.2899F, 24.549F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 574, 650, 0.4029F, 0.2899F, 23.299F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 182, 651, 0.4029F, 0.2899F, 22.049F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 282, 651, 0.4029F, 0.2899F, 20.799F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 574, 652, 0.4029F, 0.2899F, 19.549F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 182, 653, 0.4029F, 0.2899F, 18.299F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 574, 654, 0.4029F, 0.2899F, 17.049F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 68, 655, 0.4029F, 0.2899F, 15.799F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 182, 655, 0.4029F, 0.2899F, 14.549F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 68, 657, 0.4029F, 0.2899F, 13.299F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 596, 660, 0.4029F, 0.2899F, 12.049F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 50, 662, 0.4029F, 0.2899F, 10.799F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 592, 665, 0.4029F, 0.2899F, 9.549F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 526, 667, 0.4029F, 0.2899F, 8.299F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 312, 668, 0.4029F, 0.2899F, 7.099F, 1, 1, 1, -0.198F, false));

		cube_r51 = new ModelRenderer(this);
		cube_r51.setRotationPoint(0.0F, -2.775F, -1.25F);
		bone3.addChild(cube_r51);
		setRotationAngle(cube_r51, 0.0F, 0.0F, -0.8901F);
		cube_r51.cubeList.add(new ModelBox(cube_r51, 12, 667, -1.4029F, 0.2899F, 5.799F, 1, 1, 2, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 608, 232, -1.3529F, 0.4399F, 7.199F, 1, 1, 23, -0.35F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 574, 668, -1.4029F, 0.2899F, 29.549F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 244, 669, -1.4029F, 0.2899F, 28.299F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 278, 669, -1.4029F, 0.2899F, 27.049F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 494, 669, -1.4029F, 0.2899F, 25.799F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 498, 669, -1.4029F, 0.2899F, 24.549F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 502, 669, -1.4029F, 0.2899F, 23.299F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 506, 669, -1.4029F, 0.2899F, 22.049F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 510, 669, -1.4029F, 0.2899F, 20.799F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 514, 669, -1.4029F, 0.2899F, 19.549F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 526, 669, -1.4029F, 0.2899F, 18.299F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 538, 669, -1.4029F, 0.2899F, 17.049F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 542, 669, -1.4029F, 0.2899F, 15.799F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 546, 669, -1.4029F, 0.2899F, 14.549F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 550, 669, -1.4029F, 0.2899F, 13.299F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 554, 669, -1.4029F, 0.2899F, 12.049F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 558, 669, -1.4029F, 0.2899F, 10.799F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 584, 669, -1.4029F, 0.2899F, 9.549F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 588, 669, -1.4029F, 0.2899F, 8.299F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 666, 669, -1.4029F, 0.2899F, 7.099F, 1, 1, 1, -0.198F, false));

		gun13TRIGGER2 = new ModelRenderer(this);
		gun13TRIGGER2.setRotationPoint(-1.5F, -29.8731F, -38.582F);
		gun.addChild(gun13TRIGGER2);
		setRotationAngle(gun13TRIGGER2, -2.6397F, 0.0F, 0.0F);
		gun13TRIGGER2.cubeList.add(new ModelBox(gun13TRIGGER2, 20, 670, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.199F, false));

		gun12TRIGGER2 = new ModelRenderer(this);
		gun12TRIGGER2.setRotationPoint(-1.501F, -30.1777F, -38.195F);
		gun.addChild(gun12TRIGGER2);
		setRotationAngle(gun12TRIGGER2, -2.3051F, 0.0F, 0.0F);
		gun12TRIGGER2.cubeList.add(new ModelBox(gun12TRIGGER2, 24, 670, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.2F, false));

		gun11TRIGGER2 = new ModelRenderer(this);
		gun11TRIGGER2.setRotationPoint(-1.5F, -31.5209F, -37.5791F);
		gun.addChild(gun11TRIGGER2);
		setRotationAngle(gun11TRIGGER2, -0.3718F, 0.0F, 0.0F);
		gun11TRIGGER2.cubeList.add(new ModelBox(gun11TRIGGER2, 282, 635, -0.5F, -1.5F, -0.5F, 1, 3, 1, -0.199F, false));

		TRIGGER2 = new ModelRenderer(this);
		TRIGGER2.setRotationPoint(-1.5F, -32.3902F, -37.939F);
		gun.addChild(TRIGGER2);
		setRotationAngle(TRIGGER2, 0.4461F, 0.0F, 0.0F);
		TRIGGER2.cubeList.add(new ModelBox(TRIGGER2, 282, 639, -0.5F, -1.0F, -0.5F, 1, 2, 1, -0.2F, false));

		barrel = new ModelRenderer(this);
		barrel.setRotationPoint(0.0F, 7.0F, 0.0F);
		gun.addChild(barrel);
		barrel.cubeList.add(new ModelBox(barrel, 0, 0, -2.5F, -48.0F, -183.0F, 2, 2, 113, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 230, 0, -2.5F, -45.1716F, -183.0F, 2, 2, 113, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 230, 230, -3.9142F, -46.5858F, -183.0F, 2, 2, 113, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 230, 345, -1.0858F, -46.5858F, -183.0F, 2, 2, 113, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 358, 653, -2.5F, -48.3F, -73.0F, 2, 2, 3, 0.2F, false));
		barrel.cubeList.add(new ModelBox(barrel, 204, 658, -0.8029F, -46.6029F, -73.0F, 2, 2, 3, 0.2F, false));
		barrel.cubeList.add(new ModelBox(barrel, 358, 658, -2.5F, -44.9059F, -73.0F, 2, 2, 3, 0.2F, false));
		barrel.cubeList.add(new ModelBox(barrel, 78, 659, -4.1971F, -46.6029F, -73.0F, 2, 2, 3, 0.2F, false));
		barrel.cubeList.add(new ModelBox(barrel, 662, 523, -0.8029F, -46.6029F, -100.0F, 2, 2, 3, 0.2F, false));
		barrel.cubeList.add(new ModelBox(barrel, 662, 439, -2.5F, -48.3F, -100.0F, 2, 2, 3, 0.2F, false));
		barrel.cubeList.add(new ModelBox(barrel, 182, 662, -4.1971F, -46.6029F, -100.0F, 2, 2, 3, 0.2F, false));
		barrel.cubeList.add(new ModelBox(barrel, 30, 662, -2.5F, -44.9059F, -100.0F, 2, 2, 3, 0.2F, false));
		barrel.cubeList.add(new ModelBox(barrel, 10, 662, -4.1971F, -46.6029F, -109.0F, 2, 2, 3, 0.2F, false));
		barrel.cubeList.add(new ModelBox(barrel, 656, 661, -2.5F, -48.3F, -109.0F, 2, 2, 3, 0.2F, false));
		barrel.cubeList.add(new ModelBox(barrel, 656, 182, -2.5F, -43.0F, -76.0F, 2, 1, 6, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 656, 238, -5.1131F, -46.6131F, -76.0F, 1, 2, 6, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 656, 246, 1.1131F, -46.6131F, -76.0F, 1, 2, 6, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 666, 124, -2.5F, -43.0F, -78.0F, 2, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 666, 127, -2.5F, -43.0F, -84.0F, 2, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 666, 130, -2.5F, -43.0F, -90.0F, 2, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 666, 133, -2.5F, -43.0F, -96.0F, 2, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 642, 523, -2.5F, -43.0F, -108.0F, 2, 1, 8, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 666, 146, -5.1131F, -46.6131F, -82.0F, 1, 2, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 70, 664, -5.1131F, -45.6131F, -90.0F, 1, 1, 4, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 50, 664, -5.1131F, -46.6131F, -86.0F, 1, 1, 4, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 90, 664, 1.1131F, -45.6131F, -90.0F, 1, 1, 4, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 336, 653, 1.1131F, -46.6131F, -86.0F, 1, 2, 10, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 646, 661, -2.5F, -44.9059F, -109.0F, 2, 2, 3, 0.2F, false));
		barrel.cubeList.add(new ModelBox(barrel, 586, 660, -0.8029F, -46.6029F, -109.0F, 2, 2, 3, 0.2F, false));
		barrel.cubeList.add(new ModelBox(barrel, 654, 637, -4.5F, -49.3F, -175.9F, 6, 6, 2, 0.2F, false));
		barrel.cubeList.add(new ModelBox(barrel, 530, 628, -5.0F, -48.3F, -200.2F, 7, 1, 17, 0.2F, false));
		barrel.cubeList.add(new ModelBox(barrel, 374, 666, -5.0F, -46.9F, -188.2F, 2, 3, 1, 0.2F, false));
		barrel.cubeList.add(new ModelBox(barrel, 380, 666, 0.0F, -46.9F, -188.2F, 2, 3, 1, 0.2F, false));
		barrel.cubeList.add(new ModelBox(barrel, 386, 666, -5.0F, -46.9F, -191.2F, 2, 3, 1, 0.2F, false));
		barrel.cubeList.add(new ModelBox(barrel, 392, 666, 0.0F, -46.9F, -191.2F, 2, 3, 1, 0.2F, false));
		barrel.cubeList.add(new ModelBox(barrel, 398, 666, 0.0F, -46.9F, -194.2F, 2, 3, 1, 0.2F, false));
		barrel.cubeList.add(new ModelBox(barrel, 636, 666, -5.0F, -46.9F, -194.2F, 2, 3, 1, 0.2F, false));
		barrel.cubeList.add(new ModelBox(barrel, 642, 666, 0.0F, -46.9F, -200.2F, 2, 3, 1, 0.2F, false));
		barrel.cubeList.add(new ModelBox(barrel, 648, 666, -5.0F, -46.9F, -197.2F, 2, 3, 1, 0.2F, false));
		barrel.cubeList.add(new ModelBox(barrel, 654, 666, 0.0F, -46.9F, -197.2F, 2, 3, 1, 0.2F, false));
		barrel.cubeList.add(new ModelBox(barrel, 660, 666, -5.0F, -46.9F, -200.2F, 2, 3, 1, 0.2F, false));
		barrel.cubeList.add(new ModelBox(barrel, 348, 665, 0.0F, -46.9F, -185.2F, 2, 3, 2, 0.2F, false));
		barrel.cubeList.add(new ModelBox(barrel, 530, 665, -5.0F, -46.9F, -185.2F, 2, 3, 2, 0.2F, false));
		barrel.cubeList.add(new ModelBox(barrel, 138, 633, -5.0F, -43.8F, -200.2F, 7, 1, 17, 0.2F, false));
		barrel.cubeList.add(new ModelBox(barrel, 368, 647, -7.7686F, -52.9686F, -98.0F, 2, 2, 17, -0.2F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 643, -8.9F, -51.8373F, -98.0F, 2, 2, 17, -0.2F, false));
		barrel.cubeList.add(new ModelBox(barrel, 616, 637, -10.0314F, -52.9686F, -98.0F, 2, 2, 17, -0.2F, false));
		barrel.cubeList.add(new ModelBox(barrel, 578, 637, -8.9F, -54.1F, -98.0F, 2, 2, 17, -0.2F, false));
		barrel.cubeList.add(new ModelBox(barrel, 654, 306, -1.2F, -50.4F, -76.0F, 3, 2, 6, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 654, 654, -0.9071F, -51.1071F, -76.0F, 2, 1, 6, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 54, 655, -2.9071F, -51.1071F, -76.0F, 1, 3, 6, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 624, 656, -3.9071F, -51.4071F, -72.0F, 1, 1, 5, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 470, 669, -5.2F, -51.4071F, -71.7071F, 2, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 666, 150, -5.9071F, -51.4071F, -70.0F, 2, 3, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 668, 353, -5.1417F, -46.5594F, -70.0F, 2, 2, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 668, 356, -5.9071F, -42.7116F, -70.0F, 2, 2, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 464, 669, -5.9071F, -51.4071F, -71.0F, 2, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 476, 669, -5.2F, -41.7071F, -71.7071F, 2, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 482, 669, -5.9071F, -41.7071F, -71.0F, 2, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 38, 655, -0.9071F, -48.6929F, -76.0F, 2, 1, 6, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(1.0929F, -47.6929F, -71.0F);
		barrel.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.7854F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 656, 266, 0.0F, -1.0F, -5.0F, 1, 1, 6, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(1.0929F, -49.6929F, -71.0F);
		barrel.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -0.7854F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 656, 259, 0.0F, -1.0F, -5.0F, 1, 1, 6, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-4.8464F, -41.2071F, -70.6465F);
		barrel.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, -0.7854F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 36, 670, -1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 292, 608, -0.5F, -10.3F, -0.5F, 1, 11, 1, 0.2F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 32, 670, -1.0F, -10.2F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-2.1022F, -44.058F, -71.0F);
		barrel.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, 0.3927F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 356, 668, -3.0F, 0.7F, 1.0F, 2, 2, 1, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-3.4034F, -50.2019F, -71.0F);
		barrel.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, -0.3927F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 668, 350, -3.0F, 0.7F, 1.0F, 2, 2, 1, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-9.4071F, -52.0615F, -96.0F);
		barrel.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, 0.7854F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 328, 634, -1.0F, -2.0F, -2.0F, 3, 2, 17, -0.2F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-10.1142F, -49.7544F, -96.0F);
		barrel.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, 0.7854F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 72, 640, -1.0F, -3.0F, -2.0F, 2, 2, 17, -0.2F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-7.1F, -49.7544F, -96.0F);
		barrel.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, 0.7854F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 530, 646, -2.0F, -2.0F, -2.0F, 2, 2, 17, -0.2F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-7.8071F, -52.0615F, -96.0F);
		barrel.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, 0.7854F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 406, 650, -1.0F, -2.0F, -2.0F, 2, 2, 17, -0.2F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-1.0071F, -46.0958F, -107.0F);
		barrel.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.0F, 0.7854F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 98, 659, -1.0F, -2.0F, -2.0F, 2, 2, 3, 0.2F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 596, 662, -1.0F, -2.0F, 7.0F, 2, 2, 3, 0.2F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 194, 658, -1.0F, -2.0F, 34.0F, 2, 2, 3, 0.2F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-0.3F, -42.9887F, -107.0F);
		barrel.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, 0.7854F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 636, 661, -2.0F, -2.0F, -2.0F, 2, 2, 3, 0.2F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 520, 662, -2.0F, -2.0F, 7.0F, 2, 2, 3, 0.2F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 214, 658, -2.0F, -2.0F, 34.0F, 2, 2, 3, 0.2F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(-1.5F, -50.3F, -144.5F);
		barrel.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, 0.0F, 0.4363F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 248, 664, 1.7F, -0.7F, 35.5F, 1, 3, 3, 0.3F, false));
		cube_r27.cubeList.add(new ModelBox(cube_r27, 28, 670, 1.7F, -0.6F, 68.25F, 1, 1, 1, 0.4F, false));
		cube_r27.cubeList.add(new ModelBox(cube_r27, 592, 485, 1.7F, -0.6F, 38.5F, 1, 1, 37, 0.2F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-4.4039F, -46.4135F, -83.7695F);
		barrel.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.2502F, -0.0779F, 0.2956F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 60, 664, -0.5F, -0.5F, -2.0F, 1, 1, 4, 0.0F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(1.4039F, -46.4135F, -83.7695F);
		barrel.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.2502F, 0.0779F, -0.2956F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 664, 159, -0.5F, -0.5F, -2.0F, 1, 1, 4, 0.0F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(1.2734F, -44.6429F, -91.6892F);
		barrel.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.2657F, 0.1685F, 0.0456F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 664, 169, -0.5F, -0.5F, -2.0F, 1, 1, 4, 0.0F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(-4.2734F, -44.6429F, -91.6892F);
		barrel.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.2657F, -0.1685F, -0.0456F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 664, 164, -0.5F, -0.5F, -2.0F, 1, 1, 4, 0.0F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(1.6131F, -45.6125F, -87.8024F);
		barrel.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.2618F, 0.0F, 0.0F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 100, 664, -0.5F, -0.5F, -2.0F, 1, 1, 4, 0.0F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 80, 664, -6.7263F, -0.5F, -2.0F, 1, 1, 4, 0.0F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(-4.5492F, -45.8648F, -87.558F);
		barrel.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.2618F, 0.0F, -0.3927F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 262, 665, -1.0F, -0.5F, -9.5F, 1, 1, 4, 0.0F, false));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(2.7377F, -48.7342F, -75.9669F);
		barrel.addChild(cube_r34);
		setRotationAngle(cube_r34, 0.2618F, 0.0F, 0.3927F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 238, 664, 0.0F, -0.5F, -21.5F, 1, 1, 4, 0.0F, false));

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(0.6152F, -43.61F, -75.5F);
		barrel.addChild(cube_r35);
		setRotationAngle(cube_r35, 0.0F, 0.0F, 0.3927F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 656, 546, 0.0F, -0.5F, -23.5F, 1, 1, 6, 0.0F, false));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 340, 665, 0.0F, -1.5F, -17.5F, 1, 2, 3, 0.0F, false));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 368, 625, 0.0F, -1.5F, -14.5F, 1, 2, 20, 0.0F, false));

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(-3.6152F, -43.61F, -87.5F);
		barrel.addChild(cube_r36);
		setRotationAngle(cube_r36, 0.0F, 0.0F, -0.3927F);
		cube_r36.cubeList.add(new ModelBox(cube_r36, 656, 539, -1.0F, -0.5F, -11.5F, 1, 1, 6, 0.0F, false));
		cube_r36.cubeList.add(new ModelBox(cube_r36, 332, 665, -1.0F, -1.5F, -5.5F, 1, 2, 3, 0.0F, false));
		cube_r36.cubeList.add(new ModelBox(cube_r36, 286, 625, -1.0F, -1.5F, -2.5F, 1, 2, 4, 0.0F, false));
		cube_r36.cubeList.add(new ModelBox(cube_r36, 194, 668, -1.0F, -1.5F, 5.5F, 1, 1, 2, 0.0F, false));
		cube_r36.cubeList.add(new ModelBox(cube_r36, 656, 532, -1.0F, -0.5F, 5.5F, 1, 1, 6, 0.0F, false));
		cube_r36.cubeList.add(new ModelBox(cube_r36, 656, 222, -1.0F, -1.5F, 11.5F, 1, 2, 6, 0.0F, false));

		cube_r37 = new ModelRenderer(this);
		cube_r37.setRotationPoint(0.2325F, -42.8446F, -95.5F);
		barrel.addChild(cube_r37);
		setRotationAngle(cube_r37, 0.0F, 0.0F, -0.3927F);
		cube_r37.cubeList.add(new ModelBox(cube_r37, 654, 297, -1.0F, -0.5F, -12.5F, 1, 1, 8, 0.0F, false));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 668, 344, -1.0F, -0.5F, -0.5F, 1, 1, 2, 0.0F, false));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 668, 341, -1.0F, -0.5F, 5.5F, 1, 1, 2, 0.0F, false));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 218, 668, -1.0F, -0.5F, 11.5F, 1, 1, 2, 0.0F, false));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 608, 35, 0.0F, -0.5F, -12.5F, 1, 1, 32, 0.0F, false));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 200, 668, -1.0F, -0.5F, 17.5F, 1, 1, 2, 0.0F, false));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 656, 189, -1.0F, -0.5F, 19.5F, 2, 1, 6, 0.0F, false));

		cube_r38 = new ModelRenderer(this);
		cube_r38.setRotationPoint(-3.2325F, -42.8446F, -95.5F);
		barrel.addChild(cube_r38);
		setRotationAngle(cube_r38, 0.0F, 0.0F, 0.3927F);
		cube_r38.cubeList.add(new ModelBox(cube_r38, 654, 288, 0.0F, -0.5F, -12.5F, 1, 1, 8, 0.0F, false));
		cube_r38.cubeList.add(new ModelBox(cube_r38, 668, 347, 0.0F, -0.5F, -0.5F, 1, 1, 2, 0.0F, false));
		cube_r38.cubeList.add(new ModelBox(cube_r38, 306, 668, 0.0F, -0.5F, 5.5F, 1, 1, 2, 0.0F, false));
		cube_r38.cubeList.add(new ModelBox(cube_r38, 212, 668, 0.0F, -0.5F, 11.5F, 1, 1, 2, 0.0F, false));
		cube_r38.cubeList.add(new ModelBox(cube_r38, 608, 68, -1.0F, -0.5F, -12.5F, 1, 1, 32, 0.0F, false));
		cube_r38.cubeList.add(new ModelBox(cube_r38, 206, 668, 0.0F, -0.5F, 17.5F, 1, 1, 2, 0.0F, false));
		cube_r38.cubeList.add(new ModelBox(cube_r38, 656, 196, -1.0F, -0.5F, 19.5F, 2, 1, 6, 0.0F, false));

		cube_r39 = new ModelRenderer(this);
		cube_r39.setRotationPoint(1.9218F, -47.0751F, -75.5F);
		barrel.addChild(cube_r39);
		setRotationAngle(cube_r39, 0.0F, 0.0F, -0.3927F);
		cube_r39.cubeList.add(new ModelBox(cube_r39, 358, 663, -1.0F, -0.5F, -6.5F, 1, 1, 4, 0.0F, false));
		cube_r39.cubeList.add(new ModelBox(cube_r39, 654, 278, -1.0F, -1.5F, -2.5F, 1, 2, 8, 0.0F, false));

		cube_r40 = new ModelRenderer(this);
		cube_r40.setRotationPoint(2.0508F, -46.7636F, -79.0607F);
		barrel.addChild(cube_r40);
		setRotationAngle(cube_r40, 0.2618F, 0.0F, -0.3927F);
		cube_r40.cubeList.add(new ModelBox(cube_r40, 212, 663, -1.0F, -1.5F, -2.5F, 1, 1, 4, 0.0F, false));

		cube_r41 = new ModelRenderer(this);
		cube_r41.setRotationPoint(-5.0508F, -46.7636F, -79.0607F);
		barrel.addChild(cube_r41);
		setRotationAngle(cube_r41, 0.2618F, 0.0F, 0.3927F);
		cube_r41.cubeList.add(new ModelBox(cube_r41, 568, 663, 0.0F, -1.5F, -2.5F, 1, 1, 4, 0.0F, false));

		cube_r42 = new ModelRenderer(this);
		cube_r42.setRotationPoint(-4.9218F, -47.0751F, -79.5F);
		barrel.addChild(cube_r42);
		setRotationAngle(cube_r42, 0.0F, 0.0F, 0.3927F);
		cube_r42.cubeList.add(new ModelBox(cube_r42, 628, 667, 0.0F, -0.5F, -2.5F, 1, 1, 2, 0.0F, false));
		cube_r42.cubeList.add(new ModelBox(cube_r42, 188, 668, 0.0F, -1.5F, 1.5F, 1, 1, 2, 0.0F, false));
		cube_r42.cubeList.add(new ModelBox(cube_r42, 656, 230, 0.0F, -1.5F, 3.5F, 1, 2, 6, 0.0F, false));

		cube_r43 = new ModelRenderer(this);
		cube_r43.setRotationPoint(-3.2325F, -48.3816F, -71.5F);
		barrel.addChild(cube_r43);
		setRotationAngle(cube_r43, 0.0F, 0.0F, -0.3927F);
		cube_r43.cubeList.add(new ModelBox(cube_r43, 656, 203, -1.0F, -0.5F, -4.5F, 2, 1, 6, 0.0F, false));

		cube_r44 = new ModelRenderer(this);
		cube_r44.setRotationPoint(-3.4071F, -46.0958F, -107.0F);
		barrel.addChild(cube_r44);
		setRotationAngle(cube_r44, 0.0F, 0.0F, 0.7854F);
		cube_r44.cubeList.add(new ModelBox(cube_r44, 0, 662, -1.0F, -2.0F, -2.0F, 2, 2, 3, 0.2F, false));
		cube_r44.cubeList.add(new ModelBox(cube_r44, 560, 455, -8.0F, -2.0F, 7.0F, 9, 2, 3, 0.2F, false));
		cube_r44.cubeList.add(new ModelBox(cube_r44, 88, 659, -1.0F, -2.0F, 34.0F, 2, 2, 3, 0.2F, false));

		cube_r45 = new ModelRenderer(this);
		cube_r45.setRotationPoint(-4.1142F, -42.9887F, -107.0F);
		barrel.addChild(cube_r45);
		setRotationAngle(cube_r45, 0.0F, 0.0F, 0.7854F);
		cube_r45.cubeList.add(new ModelBox(cube_r45, 20, 662, -1.0F, -3.0F, -2.0F, 2, 2, 3, 0.2F, false));
		cube_r45.cubeList.add(new ModelBox(cube_r45, 40, 662, -1.0F, -3.0F, 7.0F, 2, 2, 3, 0.2F, false));
		cube_r45.cubeList.add(new ModelBox(cube_r45, 68, 659, -1.0F, -3.0F, 34.0F, 2, 2, 3, 0.2F, false));

		cube_r46 = new ModelRenderer(this);
		cube_r46.setRotationPoint(-2.7338F, -46.0718F, -109.1885F);
		barrel.addChild(cube_r46);
		setRotationAngle(cube_r46, 0.0087F, 0.0F, -1.5708F);
		cube_r46.cubeList.add(new ModelBox(cube_r46, 148, 534, -1.4938F, -1.3491F, -35.9983F, 2, 2, 72, 0.0F, false));

		cube_r47 = new ModelRenderer(this);
		cube_r47.setRotationPoint(-1.3F, -44.3691F, -109.1885F);
		barrel.addChild(cube_r47);
		setRotationAngle(cube_r47, 0.0087F, 0.0F, 3.1416F);
		cube_r47.cubeList.add(new ModelBox(cube_r47, 0, 534, -0.8F, -1.3492F, -35.9983F, 2, 2, 72, 0.0F, false));

		cube_r48 = new ModelRenderer(this);
		cube_r48.setRotationPoint(-1.2974F, -44.4744F, -109.1878F);
		barrel.addChild(cube_r48);
		setRotationAngle(cube_r48, 0.005F, -0.0071F, 2.5307F);
		cube_r48.cubeList.add(new ModelBox(cube_r48, 444, 460, -2.0093F, -1.2805F, -35.99F, 2, 2, 72, 0.0F, false));

		cube_r49 = new ModelRenderer(this);
		cube_r49.setRotationPoint(-1.3491F, -44.4477F, -109.1878F);
		barrel.addChild(cube_r49);
		setRotationAngle(cube_r49, -0.0071F, 0.005F, 0.6108F);
		cube_r49.cubeList.add(new ModelBox(cube_r49, 460, 370, -0.4856F, -1.3175F, -35.9983F, 2, 2, 72, 0.0F, false));

		cube_r52 = new ModelRenderer(this);
		cube_r52.setRotationPoint(-1.6509F, -44.4477F, -109.1878F);
		barrel.addChild(cube_r52);
		setRotationAngle(cube_r52, 0.005F, -0.0071F, -2.1817F);
		cube_r52.cubeList.add(new ModelBox(cube_r52, 460, 296, -0.6825F, -1.5144F, -35.9983F, 2, 2, 72, 0.0F, false));

		cube_r53 = new ModelRenderer(this);
		cube_r53.setRotationPoint(-1.7026F, -44.4744F, -109.1878F);
		barrel.addChild(cube_r53);
		setRotationAngle(cube_r53, -0.0071F, 0.005F, 2.1816F);
		cube_r53.cubeList.add(new ModelBox(cube_r53, 296, 460, -0.7195F, 0.0093F, -35.99F, 2, 2, 72, 0.0F, false));

		cube_r54 = new ModelRenderer(this);
		cube_r54.setRotationPoint(-2.6553F, -46.2227F, -109.1878F);
		barrel.addChild(cube_r54);
		setRotationAngle(cube_r54, 0.005F, -0.0071F, -0.6109F);
		cube_r54.cubeList.add(new ModelBox(cube_r54, 460, 222, -0.9657F, -1.1099F, -35.9983F, 2, 2, 72, 0.0F, false));

		cube_r55 = new ModelRenderer(this);
		cube_r55.setRotationPoint(-2.6036F, -46.2993F, -109.1878F);
		barrel.addChild(cube_r55);
		setRotationAngle(cube_r55, -0.0071F, 0.005F, -2.5307F);
		cube_r55.cubeList.add(new ModelBox(cube_r55, 460, 148, -1.0028F, -0.3952F, -35.9943F, 2, 2, 72, 0.0F, false));

		cube_r56 = new ModelRenderer(this);
		cube_r56.setRotationPoint(-2.7119F, -48.1633F, -74.1971F);
		barrel.addChild(cube_r56);
		setRotationAngle(cube_r56, 0.005F, -0.0071F, 0.9599F);
		cube_r56.cubeList.add(new ModelBox(cube_r56, 148, 460, 1.0F, -2.0F, -71.0F, 2, 2, 72, 0.0F, false));

		cube_r57 = new ModelRenderer(this);
		cube_r57.setRotationPoint(7.2039F, -41.2849F, -74.2507F);
		barrel.addChild(cube_r57);
		setRotationAngle(cube_r57, -0.0071F, 0.005F, -0.9599F);
		cube_r57.cubeList.add(new ModelBox(cube_r57, 460, 74, -1.0F, -9.8F, -71.0F, 2, 2, 72, 0.0F, false));

		cube_r58 = new ModelRenderer(this);
		cube_r58.setRotationPoint(0.3884F, -39.7779F, -74.1912F);
		barrel.addChild(cube_r58);
		setRotationAngle(cube_r58, 0.0F, 0.0087F, 0.0F);
		cube_r58.cubeList.add(new ModelBox(cube_r58, 460, 0, -1.0F, -6.8F, -71.0F, 2, 2, 72, 0.0F, false));

		cube_r59 = new ModelRenderer(this);
		cube_r59.setRotationPoint(-1.3F, -46.4913F, -74.1825F);
		barrel.addChild(cube_r59);
		setRotationAngle(cube_r59, 0.0087F, 0.0F, 0.0F);
		cube_r59.cubeList.add(new ModelBox(cube_r59, 0, 460, -1.2F, -2.0F, -71.0F, 2, 2, 72, 0.0F, false));

		cube_r60 = new ModelRenderer(this);
		cube_r60.setRotationPoint(-3.9142F, -43.1716F, -71.0F);
		barrel.addChild(cube_r60);
		setRotationAngle(cube_r60, 0.0F, 0.0F, 0.7854F);
		cube_r60.cubeList.add(new ModelBox(cube_r60, 0, 345, -1.0F, -3.0F, -112.0F, 2, 2, 113, 0.0F, false));

		cube_r61 = new ModelRenderer(this);
		cube_r61.setRotationPoint(-3.2071F, -45.8787F, -71.0F);
		barrel.addChild(cube_r61);
		setRotationAngle(cube_r61, 0.0F, 0.0F, 0.7854F);
		cube_r61.cubeList.add(new ModelBox(cube_r61, 230, 115, -1.0F, -2.0F, -112.0F, 2, 2, 113, 0.0F, false));

		cube_r62 = new ModelRenderer(this);
		cube_r62.setRotationPoint(-0.5F, -43.1716F, -71.0F);
		barrel.addChild(cube_r62);
		setRotationAngle(cube_r62, 0.0F, 0.0F, 0.7854F);
		cube_r62.cubeList.add(new ModelBox(cube_r62, 0, 230, -2.0F, -2.0F, -112.0F, 2, 2, 113, 0.0F, false));

		cube_r63 = new ModelRenderer(this);
		cube_r63.setRotationPoint(-1.2071F, -45.8787F, -71.0F);
		barrel.addChild(cube_r63);
		setRotationAngle(cube_r63, 0.0F, 0.0F, 0.7854F);
		cube_r63.cubeList.add(new ModelBox(cube_r63, 0, 115, -1.0F, -2.0F, -112.0F, 2, 2, 113, 0.0F, false));
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