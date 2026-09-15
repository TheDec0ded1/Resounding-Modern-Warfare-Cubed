package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class HK237Handguard extends ModelBase {
	private final ModelRenderer handguardHK237;
	private final ModelRenderer bone8;
	private final ModelRenderer bone_r32;
	private final ModelRenderer bone_r33;
	private final ModelRenderer bone_r34;
	private final ModelRenderer bone_r35;
	private final ModelRenderer bone_r36;
	private final ModelRenderer bone_r37;
	private final ModelRenderer bone_r38;
	private final ModelRenderer bone_r39;
	private final ModelRenderer bone_r40;
	private final ModelRenderer bone_r41;
	private final ModelRenderer bone_r46;
	private final ModelRenderer handguard3;
	private final ModelRenderer rails5;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r13;
	private final ModelRenderer rails6;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;

	public HK237Handguard() {
		textureWidth = 512;
		textureHeight = 512;

		handguardHK237 = new ModelRenderer(this);
		handguardHK237.setRotationPoint(0.0F, 23.0F, 0.0F);
		

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, 0.0F, 0.0F);
		handguardHK237.addChild(bone8);
		bone8.cubeList.add(new ModelBox(bone8, 490, 465, -1.3F, -36.2882F, -27.2F, 2, 2, 2, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 400, 385, -3.7F, -36.2882F, -27.2F, 3, 2, 2, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 422, 415, -2.3F, -35.5882F, -45.703F, 2, 1, 23, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 432, 282, -2.5F, -34.7882F, -45.701F, 2, 1, 23, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 230, 389, -2.7F, -40.0F, -47.699F, 1, 1, 25, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 282, 389, -1.3F, -40.0F, -47.699F, 1, 1, 25, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 386, 0, -2.5F, -40.75F, -47.699F, 2, 1, 25, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 486, 40, -4.0658F, -37.4941F, -29.701F, 1, 1, 7, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 502, 36, -4.0658F, -37.4941F, -32.701F, 1, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 486, 48, 0.0658F, -37.4941F, -29.701F, 1, 1, 7, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 444, 494, -4.4158F, -37.1441F, -32.351F, 1, 1, 2, -0.35F, false));
		bone8.cubeList.add(new ModelBox(bone8, 450, 494, -4.4158F, -37.8441F, -32.351F, 1, 1, 2, -0.35F, false));
		bone8.cubeList.add(new ModelBox(bone8, 456, 494, 0.4158F, -37.8441F, -32.351F, 1, 1, 2, -0.35F, false));
		bone8.cubeList.add(new ModelBox(bone8, 462, 494, 0.4158F, -37.1441F, -32.351F, 1, 1, 2, -0.35F, false));
		bone8.cubeList.add(new ModelBox(bone8, 502, 38, 0.0658F, -37.4941F, -32.701F, 1, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 468, 494, -4.4158F, -37.1441F, -35.351F, 1, 1, 2, -0.35F, false));
		bone8.cubeList.add(new ModelBox(bone8, 474, 494, -4.4158F, -37.8441F, -35.351F, 1, 1, 2, -0.35F, false));
		bone8.cubeList.add(new ModelBox(bone8, 40, 502, -4.0658F, -37.4941F, -35.701F, 1, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 502, 40, 0.0658F, -37.4941F, -35.701F, 1, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 480, 494, 0.4158F, -37.8441F, -35.351F, 1, 1, 2, -0.35F, false));
		bone8.cubeList.add(new ModelBox(bone8, 486, 494, 0.4158F, -37.1441F, -35.351F, 1, 1, 2, -0.35F, false));
		bone8.cubeList.add(new ModelBox(bone8, 492, 494, 0.4158F, -37.1441F, -38.351F, 1, 1, 2, -0.35F, false));
		bone8.cubeList.add(new ModelBox(bone8, 0, 495, 0.4158F, -37.8441F, -38.351F, 1, 1, 2, -0.35F, false));
		bone8.cubeList.add(new ModelBox(bone8, 502, 42, 0.0658F, -37.4941F, -38.701F, 1, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 44, 502, -4.0658F, -37.4941F, -38.701F, 1, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 6, 495, -4.4158F, -37.8441F, -38.351F, 1, 1, 2, -0.35F, false));
		bone8.cubeList.add(new ModelBox(bone8, 12, 495, -4.4158F, -37.1441F, -38.351F, 1, 1, 2, -0.35F, false));
		bone8.cubeList.add(new ModelBox(bone8, 18, 495, -4.4158F, -37.1441F, -41.351F, 1, 1, 2, -0.35F, false));
		bone8.cubeList.add(new ModelBox(bone8, 24, 495, -4.4158F, -37.8441F, -41.351F, 1, 1, 2, -0.35F, false));
		bone8.cubeList.add(new ModelBox(bone8, 502, 44, -4.0658F, -37.4941F, -41.701F, 1, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 502, 46, 0.0658F, -37.4941F, -41.701F, 1, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 30, 495, 0.4158F, -37.8441F, -41.351F, 1, 1, 2, -0.35F, false));
		bone8.cubeList.add(new ModelBox(bone8, 36, 495, 0.4158F, -37.1441F, -41.351F, 1, 1, 2, -0.35F, false));
		bone8.cubeList.add(new ModelBox(bone8, 42, 495, 0.4158F, -37.1441F, -44.351F, 1, 1, 2, -0.35F, false));
		bone8.cubeList.add(new ModelBox(bone8, 48, 495, 0.4158F, -37.8441F, -44.351F, 1, 1, 2, -0.35F, false));
		bone8.cubeList.add(new ModelBox(bone8, 54, 495, 0.0658F, -37.4941F, -45.701F, 1, 1, 2, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 60, 495, -4.0658F, -37.4941F, -45.701F, 1, 1, 2, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 66, 495, -4.4158F, -37.8441F, -44.351F, 1, 1, 2, -0.35F, false));
		bone8.cubeList.add(new ModelBox(bone8, 72, 495, -4.4158F, -37.1441F, -44.351F, 1, 1, 2, -0.35F, false));

		bone_r32 = new ModelRenderer(this);
		bone_r32.setRotationPoint(-2.7F, -40.0F, -50.7F);
		bone8.addChild(bone_r32);
		setRotationAngle(bone_r32, 0.0F, 0.0F, 0.9774F);
		bone_r32.cubeList.add(new ModelBox(bone_r32, 386, 26, 0.0F, -1.0F, 3.0F, 1, 1, 25, 0.0F, false));

		bone_r33 = new ModelRenderer(this);
		bone_r33.setRotationPoint(-0.3F, -40.0F, -50.7F);
		bone8.addChild(bone_r33);
		setRotationAngle(bone_r33, 0.0F, 0.0F, -0.9774F);
		bone_r33.cubeList.add(new ModelBox(bone_r33, 386, 52, -1.0F, -1.0F, 3.0F, 1, 1, 25, 0.0F, false));

		bone_r34 = new ModelRenderer(this);
		bone_r34.setRotationPoint(-2.55F, -39.1F, -29.7F);
		bone8.addChild(bone_r34);
		setRotationAngle(bone_r34, 0.0F, 0.0F, -0.4014F);
		bone_r34.cubeList.add(new ModelBox(bone_r34, 486, 56, -0.9219F, -0.1841F, -0.001F, 1, 1, 7, 0.0F, false));
		bone_r34.cubeList.add(new ModelBox(bone_r34, 48, 502, -0.9219F, -0.1841F, -4.001F, 1, 1, 1, 0.0F, false));
		bone_r34.cubeList.add(new ModelBox(bone_r34, 502, 48, -0.9219F, -0.1841F, -8.001F, 1, 1, 1, 0.0F, false));
		bone_r34.cubeList.add(new ModelBox(bone_r34, 502, 50, -0.9219F, -0.1841F, -12.001F, 1, 1, 1, 0.0F, false));
		bone_r34.cubeList.add(new ModelBox(bone_r34, 490, 469, -0.9219F, -0.1841F, -18.001F, 1, 1, 3, 0.0F, false));
		bone_r34.cubeList.add(new ModelBox(bone_r34, 334, 389, -0.3219F, -0.1851F, -18.002F, 1, 1, 25, 0.0F, false));

		bone_r35 = new ModelRenderer(this);
		bone_r35.setRotationPoint(-2.55F, -35.2F, -29.7F);
		bone8.addChild(bone_r35);
		setRotationAngle(bone_r35, 0.0F, 0.0F, 0.4014F);
		bone_r35.cubeList.add(new ModelBox(bone_r35, 486, 64, -0.8F, -0.5289F, -0.001F, 1, 1, 7, 0.0F, false));
		bone_r35.cubeList.add(new ModelBox(bone_r35, 52, 502, -0.8F, -0.5289F, -4.001F, 1, 1, 1, 0.0F, false));
		bone_r35.cubeList.add(new ModelBox(bone_r35, 502, 52, -0.8F, -0.5289F, -8.001F, 1, 1, 1, 0.0F, false));
		bone_r35.cubeList.add(new ModelBox(bone_r35, 502, 54, -0.8F, -0.5289F, -12.001F, 1, 1, 1, 0.0F, false));
		bone_r35.cubeList.add(new ModelBox(bone_r35, 56, 502, -0.8F, -0.5289F, -16.001F, 1, 1, 1, 0.0F, false));
		bone_r35.cubeList.add(new ModelBox(bone_r35, 242, 464, -0.2F, -0.5279F, -15.002F, 1, 1, 22, 0.0F, false));

		bone_r36 = new ModelRenderer(this);
		bone_r36.setRotationPoint(-0.45F, -35.2F, -29.7F);
		bone8.addChild(bone_r36);
		setRotationAngle(bone_r36, 0.0F, 0.0F, -0.4014F);
		bone_r36.cubeList.add(new ModelBox(bone_r36, 486, 72, -0.2F, -0.5289F, -0.001F, 1, 1, 7, 0.0F, false));
		bone_r36.cubeList.add(new ModelBox(bone_r36, 502, 56, -0.2F, -0.5289F, -4.001F, 1, 1, 1, 0.0F, false));
		bone_r36.cubeList.add(new ModelBox(bone_r36, 502, 58, -0.2F, -0.5289F, -8.001F, 1, 1, 1, 0.0F, false));
		bone_r36.cubeList.add(new ModelBox(bone_r36, 60, 502, -0.2F, -0.5289F, -12.001F, 1, 1, 1, 0.0F, false));
		bone_r36.cubeList.add(new ModelBox(bone_r36, 502, 60, -0.2F, -0.5289F, -16.001F, 1, 1, 1, 0.0F, false));
		bone_r36.cubeList.add(new ModelBox(bone_r36, 288, 464, -0.8F, -0.5279F, -15.002F, 1, 1, 22, 0.0F, false));

		bone_r37 = new ModelRenderer(this);
		bone_r37.setRotationPoint(-0.45F, -39.1F, -29.7F);
		bone8.addChild(bone_r37);
		setRotationAngle(bone_r37, 0.0F, 0.0F, 0.4014F);
		bone_r37.cubeList.add(new ModelBox(bone_r37, 486, 80, -0.0781F, -0.1841F, -0.001F, 1, 1, 7, 0.0F, false));
		bone_r37.cubeList.add(new ModelBox(bone_r37, 502, 62, -0.0781F, -0.1841F, -4.001F, 1, 1, 1, 0.0F, false));
		bone_r37.cubeList.add(new ModelBox(bone_r37, 64, 502, -0.0781F, -0.1841F, -8.001F, 1, 1, 1, 0.0F, false));
		bone_r37.cubeList.add(new ModelBox(bone_r37, 502, 64, -0.0781F, -0.1841F, -12.001F, 1, 1, 1, 0.0F, false));
		bone_r37.cubeList.add(new ModelBox(bone_r37, 490, 473, -0.0781F, -0.1841F, -18.001F, 1, 1, 3, 0.0F, false));
		bone_r37.cubeList.add(new ModelBox(bone_r37, 386, 389, -0.6781F, -0.1851F, -18.002F, 1, 1, 25, 0.0F, false));

		bone_r38 = new ModelRenderer(this);
		bone_r38.setRotationPoint(-3.85F, -37.8F, -29.7F);
		bone8.addChild(bone_r38);
		setRotationAngle(bone_r38, 0.0F, 0.0F, 0.4014F);
		bone_r38.cubeList.add(new ModelBox(bone_r38, 486, 88, -0.0781F, -1.1841F, -0.002F, 1, 1, 7, 0.0F, false));
		bone_r38.cubeList.add(new ModelBox(bone_r38, 502, 66, -0.0841F, -1.1694F, -4.001F, 1, 1, 1, 0.0F, false));
		bone_r38.cubeList.add(new ModelBox(bone_r38, 68, 502, -0.0841F, -1.1694F, -8.001F, 1, 1, 1, 0.0F, false));
		bone_r38.cubeList.add(new ModelBox(bone_r38, 502, 68, -0.0841F, -1.1694F, -12.001F, 1, 1, 1, 0.0F, false));
		bone_r38.cubeList.add(new ModelBox(bone_r38, 86, 495, -0.0841F, -1.1694F, -17.001F, 1, 1, 2, 0.0F, false));
		bone_r38.cubeList.add(new ModelBox(bone_r38, 222, 415, -0.0791F, -0.6341F, -17.001F, 1, 1, 24, 0.0F, false));

		bone_r39 = new ModelRenderer(this);
		bone_r39.setRotationPoint(-3.85F, -36.5F, -29.7F);
		bone8.addChild(bone_r39);
		setRotationAngle(bone_r39, 0.0F, 0.0F, -0.4014F);
		bone_r39.cubeList.add(new ModelBox(bone_r39, 486, 96, -0.2F, 0.4711F, -0.003F, 1, 1, 7, 0.0F, false));
		bone_r39.cubeList.add(new ModelBox(bone_r39, 502, 70, -0.2F, 0.4711F, -4.0F, 1, 1, 1, 0.0F, false));
		bone_r39.cubeList.add(new ModelBox(bone_r39, 72, 502, -0.2F, 0.4711F, -8.0F, 1, 1, 1, 0.0F, false));
		bone_r39.cubeList.add(new ModelBox(bone_r39, 502, 72, -0.2F, 0.4711F, -12.0F, 1, 1, 1, 0.0F, false));
		bone_r39.cubeList.add(new ModelBox(bone_r39, 502, 74, -0.2F, 0.4711F, -16.0F, 1, 1, 1, 0.0F, false));
		bone_r39.cubeList.add(new ModelBox(bone_r39, 444, 156, -0.201F, -0.0789F, -16.001F, 1, 1, 23, 0.0F, false));

		bone_r40 = new ModelRenderer(this);
		bone_r40.setRotationPoint(0.85F, -36.5F, -29.7F);
		bone8.addChild(bone_r40);
		setRotationAngle(bone_r40, 0.0F, 0.0F, 0.4014F);
		bone_r40.cubeList.add(new ModelBox(bone_r40, 486, 104, -0.8F, 0.4711F, -0.003F, 1, 1, 7, 0.0F, false));
		bone_r40.cubeList.add(new ModelBox(bone_r40, 502, 76, -0.8F, 0.4711F, -4.0F, 1, 1, 1, 0.0F, false));
		bone_r40.cubeList.add(new ModelBox(bone_r40, 502, 78, -0.8F, 0.4711F, -8.0F, 1, 1, 1, 0.0F, false));
		bone_r40.cubeList.add(new ModelBox(bone_r40, 80, 502, -0.8F, 0.4711F, -12.0F, 1, 1, 1, 0.0F, false));
		bone_r40.cubeList.add(new ModelBox(bone_r40, 502, 80, -0.8F, 0.4711F, -16.0F, 1, 1, 1, 0.0F, false));
		bone_r40.cubeList.add(new ModelBox(bone_r40, 446, 122, -0.799F, -0.0789F, -16.001F, 1, 1, 23, 0.0F, false));

		bone_r41 = new ModelRenderer(this);
		bone_r41.setRotationPoint(0.85F, -37.8F, -29.7F);
		bone8.addChild(bone_r41);
		setRotationAngle(bone_r41, 0.0F, 0.0F, -0.4014F);
		bone_r41.cubeList.add(new ModelBox(bone_r41, 486, 112, -0.9219F, -1.1841F, -0.002F, 1, 1, 7, 0.0F, false));
		bone_r41.cubeList.add(new ModelBox(bone_r41, 502, 82, -0.9219F, -1.1841F, -4.0F, 1, 1, 1, 0.0F, false));
		bone_r41.cubeList.add(new ModelBox(bone_r41, 84, 502, -0.9219F, -1.1841F, -8.0F, 1, 1, 1, 0.0F, false));
		bone_r41.cubeList.add(new ModelBox(bone_r41, 502, 84, -0.9219F, -1.1841F, -12.0F, 1, 1, 1, 0.0F, false));
		bone_r41.cubeList.add(new ModelBox(bone_r41, 92, 495, -0.9219F, -1.1841F, -17.0F, 1, 1, 2, 0.0F, false));
		bone_r41.cubeList.add(new ModelBox(bone_r41, 272, 415, -0.9209F, -0.6341F, -17.001F, 1, 1, 24, 0.0F, false));

		bone_r46 = new ModelRenderer(this);
		bone_r46.setRotationPoint(-3.9F, -35.3F, -26.8F);
		bone8.addChild(bone_r46);
		setRotationAngle(bone_r46, -0.3316F, 0.0F, 0.0F);
		bone_r46.cubeList.add(new ModelBox(bone_r46, 502, 86, 0.0F, -0.5161F, 0.1666F, 1, 1, 1, -0.1F, false));
		bone_r46.cubeList.add(new ModelBox(bone_r46, 88, 502, 3.8F, -0.5161F, 0.1666F, 1, 1, 1, -0.1F, false));

		handguard3 = new ModelRenderer(this);
		handguard3.setRotationPoint(-2.7F, -36.2F, -50.7F);
		bone8.addChild(handguard3);
		handguard3.cubeList.add(new ModelBox(handguard3, 450, 355, 0.0F, 0.6108F, 4.998F, 1, 1, 23, 0.0F, false));

		rails5 = new ModelRenderer(this);
		rails5.setRotationPoint(-2.3F, -43.1F, -39.75F);
		handguardHK237.addChild(rails5);
		rails5.cubeList.add(new ModelBox(rails5, 398, 497, -0.2F, 1.7F, 16.15F, 2, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 404, 497, -0.2F, 1.7F, 14.95F, 2, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 410, 497, -0.2F, 1.7F, 13.75F, 2, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 416, 497, -0.2F, 1.7F, 12.55F, 2, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 422, 497, -0.2F, 1.7F, 11.35F, 2, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 428, 497, -0.2F, 1.7F, 10.15F, 2, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 434, 497, -0.2F, 1.7F, 8.95F, 2, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 440, 497, -0.2F, 1.7F, 7.75F, 2, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 446, 497, -0.2F, 1.7F, 6.55F, 2, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 452, 497, -0.2F, 1.7F, 5.35F, 2, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 458, 497, -0.2F, 1.7F, 4.15F, 2, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 464, 497, -0.2F, 1.7F, 2.95F, 2, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 470, 497, -0.2F, 1.7F, 1.75F, 2, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 476, 497, -0.2F, 1.7F, 0.55F, 2, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 482, 497, -0.2F, 1.7F, -0.65F, 2, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 488, 497, -0.2F, 1.7F, -1.85F, 2, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 494, 497, -0.2F, 1.7F, -3.05F, 2, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 0, 498, -0.2F, 1.7F, -4.25F, 2, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 498, 0, -0.2F, 1.7F, -5.45F, 2, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 498, 2, -0.2F, 1.7F, -6.65F, 2, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 6, 498, -0.2F, 1.7F, -7.85F, 2, 1, 1, -0.2F, false));
		rails5.cubeList.add(new ModelBox(rails5, 12, 498, -0.2F, 1.7F, -8.15F, 2, 1, 1, -0.2F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, -1.0F, 0.0F);
		rails5.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 502, 88, -2.8506F, 1.8506F, 16.15F, 1, 1, 1, -0.201F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 502, 90, -2.8506F, 1.8506F, 14.95F, 1, 1, 1, -0.201F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 92, 502, -2.8506F, 1.8506F, 13.75F, 1, 1, 1, -0.201F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 502, 92, -2.8506F, 1.8506F, 12.55F, 1, 1, 1, -0.201F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 502, 94, -2.8506F, 1.8506F, 11.35F, 1, 1, 1, -0.201F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 96, 502, -2.8506F, 1.8506F, 10.15F, 1, 1, 1, -0.201F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 502, 96, -2.8506F, 1.8506F, 8.95F, 1, 1, 1, -0.201F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 502, 98, -2.8506F, 1.8506F, 7.75F, 1, 1, 1, -0.201F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 502, 100, -2.8506F, 1.8506F, 6.55F, 1, 1, 1, -0.201F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 502, 102, -2.8506F, 1.8506F, 5.35F, 1, 1, 1, -0.201F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 502, 104, -2.8506F, 1.8506F, 4.15F, 1, 1, 1, -0.201F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 502, 106, -2.8506F, 1.8506F, 2.95F, 1, 1, 1, -0.201F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 502, 108, -2.8506F, 1.8506F, 1.75F, 1, 1, 1, -0.201F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 502, 110, -2.8506F, 1.8506F, 0.55F, 1, 1, 1, -0.201F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 502, 112, -2.8506F, 1.8506F, -0.65F, 1, 1, 1, -0.201F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 502, 114, -2.8506F, 1.8506F, -1.85F, 1, 1, 1, -0.201F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 502, 116, -2.8506F, 1.8506F, -3.05F, 1, 1, 1, -0.201F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 502, 118, -2.8506F, 1.8506F, -4.25F, 1, 1, 1, -0.201F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 502, 152, -2.8506F, 1.8506F, -5.45F, 1, 1, 1, -0.201F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 502, 154, -2.8506F, 1.8506F, -6.65F, 1, 1, 1, -0.201F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 502, 156, -2.8506F, 1.8506F, -7.85F, 1, 1, 1, -0.201F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 502, 158, -2.8506F, 1.8506F, -8.15F, 1, 1, 1, -0.201F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 170, 391, -2.9996F, 1.8746F, -7.599F, 1, 1, 25, -0.35F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(1.6F, -1.0F, 3.25F);
		rails5.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.7854F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 502, 160, -2.8506F, 1.8506F, 12.9F, 1, 1, 1, -0.201F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 502, 162, -2.8506F, 1.8506F, 11.7F, 1, 1, 1, -0.201F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 502, 164, -2.8506F, 1.8506F, 10.5F, 1, 1, 1, -0.201F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 502, 166, -2.8506F, 1.8506F, 9.3F, 1, 1, 1, -0.201F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 502, 168, -2.8506F, 1.8506F, 8.1F, 1, 1, 1, -0.201F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 502, 170, -2.8506F, 1.8506F, 6.9F, 1, 1, 1, -0.201F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 502, 172, -2.8506F, 1.8506F, 5.7F, 1, 1, 1, -0.201F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 502, 174, -2.8506F, 1.8506F, 4.5F, 1, 1, 1, -0.201F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 502, 176, -2.8506F, 1.8506F, 3.3F, 1, 1, 1, -0.201F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 502, 178, -2.8506F, 1.8506F, 2.1F, 1, 1, 1, -0.201F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 502, 180, -2.8506F, 1.8506F, 0.9F, 1, 1, 1, -0.201F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 502, 182, -2.8506F, 1.8506F, -0.3F, 1, 1, 1, -0.201F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 502, 184, -2.8506F, 1.8506F, -1.5F, 1, 1, 1, -0.201F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 502, 186, -2.8506F, 1.8506F, -2.7F, 1, 1, 1, -0.201F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 502, 188, -2.8506F, 1.8506F, -3.9F, 1, 1, 1, -0.201F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 502, 190, -2.8506F, 1.8506F, -5.1F, 1, 1, 1, -0.201F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 502, 192, -2.8506F, 1.8506F, -6.3F, 1, 1, 1, -0.201F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 502, 194, -2.8506F, 1.8506F, -7.5F, 1, 1, 1, -0.201F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 502, 196, -2.8506F, 1.8506F, -8.7F, 1, 1, 1, -0.201F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 502, 198, -2.8506F, 1.8506F, -9.9F, 1, 1, 1, -0.201F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 502, 200, -2.8506F, 1.8506F, -11.1F, 1, 1, 1, -0.201F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 502, 202, -2.8506F, 1.8506F, -11.4F, 1, 1, 1, -0.201F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 394, 130, -2.8746F, 1.9996F, -10.849F, 1, 1, 25, -0.35F, false));

		rails6 = new ModelRenderer(this);
		rails6.setRotationPoint(-1.5F, -33.4286F, -38.0768F);
		handguardHK237.addChild(rails6);
		setRotationAngle(rails6, 0.0F, 0.0F, -3.1416F);
		rails6.cubeList.add(new ModelBox(rails6, 450, 379, -1.0F, -0.2714F, 9.6768F, 2, 1, 5, -0.2F, false));
		rails6.cubeList.add(new ModelBox(rails6, 18, 498, -1.0F, -0.2714F, 8.4768F, 2, 1, 1, -0.2F, false));
		rails6.cubeList.add(new ModelBox(rails6, 24, 498, -1.0F, -0.2714F, 7.2768F, 2, 1, 1, -0.2F, false));
		rails6.cubeList.add(new ModelBox(rails6, 30, 498, -1.0F, -0.2714F, 6.0768F, 2, 1, 1, -0.2F, false));
		rails6.cubeList.add(new ModelBox(rails6, 36, 498, -1.0F, -0.2714F, 4.8768F, 2, 1, 1, -0.2F, false));
		rails6.cubeList.add(new ModelBox(rails6, 42, 498, -1.0F, -0.2714F, 3.6768F, 2, 1, 1, -0.2F, false));
		rails6.cubeList.add(new ModelBox(rails6, 48, 498, -1.0F, -0.2714F, 2.4768F, 2, 1, 1, -0.2F, false));
		rails6.cubeList.add(new ModelBox(rails6, 54, 498, -1.0F, -0.2714F, 1.2768F, 2, 1, 1, -0.2F, false));
		rails6.cubeList.add(new ModelBox(rails6, 60, 498, -1.0F, -0.2714F, 0.0768F, 2, 1, 1, -0.2F, false));
		rails6.cubeList.add(new ModelBox(rails6, 66, 498, -1.0F, -0.2714F, -1.1232F, 2, 1, 1, -0.2F, false));
		rails6.cubeList.add(new ModelBox(rails6, 72, 498, -1.0F, -0.2714F, -2.3232F, 2, 1, 1, -0.2F, false));
		rails6.cubeList.add(new ModelBox(rails6, 84, 498, -1.0F, -0.2714F, -3.5232F, 2, 1, 1, -0.2F, false));
		rails6.cubeList.add(new ModelBox(rails6, 90, 498, -1.0F, -0.2714F, -4.7232F, 2, 1, 1, -0.2F, false));
		rails6.cubeList.add(new ModelBox(rails6, 96, 498, -1.0F, -0.2714F, -5.9232F, 2, 1, 1, -0.2F, false));
		rails6.cubeList.add(new ModelBox(rails6, 498, 146, -1.0F, -0.2714F, -7.1232F, 2, 1, 1, -0.2F, false));
		rails6.cubeList.add(new ModelBox(rails6, 498, 148, -1.0F, -0.2714F, -7.7232F, 2, 1, 1, -0.2F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-0.8F, -2.9714F, -1.6732F);
		rails6.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -0.7854F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 486, 270, -2.8506F, 1.8506F, 11.35F, 1, 1, 5, -0.201F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 502, 204, -2.8506F, 1.8506F, 10.15F, 1, 1, 1, -0.201F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 502, 206, -2.8506F, 1.8506F, 8.95F, 1, 1, 1, -0.201F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 502, 208, -2.8506F, 1.8506F, 7.75F, 1, 1, 1, -0.201F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 502, 210, -2.8506F, 1.8506F, 6.55F, 1, 1, 1, -0.201F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 502, 212, -2.8506F, 1.8506F, 5.35F, 1, 1, 1, -0.201F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 502, 214, -2.8506F, 1.8506F, 4.15F, 1, 1, 1, -0.201F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 502, 216, -2.8506F, 1.8506F, 2.95F, 1, 1, 1, -0.201F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 502, 218, -2.8506F, 1.8506F, 1.75F, 1, 1, 1, -0.201F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 502, 220, -2.8506F, 1.8506F, 0.55F, 1, 1, 1, -0.201F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 502, 222, -2.8506F, 1.8506F, -0.65F, 1, 1, 1, -0.201F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 502, 224, -2.8506F, 1.8506F, -1.85F, 1, 1, 1, -0.201F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 502, 226, -2.8506F, 1.8506F, -3.05F, 1, 1, 1, -0.201F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 502, 228, -2.8506F, 1.8506F, -4.25F, 1, 1, 1, -0.201F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 502, 230, -2.8506F, 1.8506F, -5.45F, 1, 1, 1, -0.201F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 502, 232, -2.8506F, 1.8506F, -6.05F, 1, 1, 1, -0.201F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 386, 282, -2.9996F, 1.8746F, -5.599F, 1, 1, 18, -0.35F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.8F, -2.9714F, 1.5768F);
		rails6.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, -0.7854F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 486, 385, -2.8506F, 1.8506F, 8.1F, 1, 1, 5, -0.201F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 502, 234, -2.8506F, 1.8506F, 6.9F, 1, 1, 1, -0.201F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 502, 236, -2.8506F, 1.8506F, 5.7F, 1, 1, 1, -0.201F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 502, 238, -2.8506F, 1.8506F, 4.5F, 1, 1, 1, -0.201F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 502, 240, -2.8506F, 1.8506F, 3.3F, 1, 1, 1, -0.201F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 502, 242, -2.8506F, 1.8506F, 2.1F, 1, 1, 1, -0.201F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 502, 244, -2.8506F, 1.8506F, 0.9F, 1, 1, 1, -0.201F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 502, 246, -2.8506F, 1.8506F, -0.3F, 1, 1, 1, -0.201F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 502, 248, -2.8506F, 1.8506F, -1.5F, 1, 1, 1, -0.201F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 502, 250, -2.8506F, 1.8506F, -2.7F, 1, 1, 1, -0.201F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 502, 252, -2.8506F, 1.8506F, -3.9F, 1, 1, 1, -0.201F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 502, 254, -2.8506F, 1.8506F, -5.1F, 1, 1, 1, -0.201F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 502, 256, -2.8506F, 1.8506F, -6.3F, 1, 1, 1, -0.201F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 502, 258, -2.8506F, 1.8506F, -7.5F, 1, 1, 1, -0.201F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 502, 260, -2.8506F, 1.8506F, -8.7F, 1, 1, 1, -0.201F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 502, 262, -2.8506F, 1.8506F, -9.3F, 1, 1, 1, -0.201F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 394, 181, -2.8746F, 1.9996F, -8.849F, 1, 1, 18, -0.35F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handguardHK237.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}