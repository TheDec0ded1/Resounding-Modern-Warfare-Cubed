package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class HK416A5HKeyHandguard extends ModelBase {
	private final ModelRenderer handguardHKey;
	private final ModelRenderer bone7;
	private final ModelRenderer bone_r17;
	private final ModelRenderer bone_r18;
	private final ModelRenderer bone_r19;
	private final ModelRenderer bone_r20;
	private final ModelRenderer bone_r21;
	private final ModelRenderer bone_r22;
	private final ModelRenderer bone_r23;
	private final ModelRenderer bone_r24;
	private final ModelRenderer bone_r25;
	private final ModelRenderer bone_r26;
	private final ModelRenderer bone_r27;
	private final ModelRenderer bone_r28;
	private final ModelRenderer bone_r29;
	private final ModelRenderer bone_r30;
	private final ModelRenderer bone_r31;
	private final ModelRenderer handguard4;
	private final ModelRenderer rails3;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer rails4;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;

	public HK416A5HKeyHandguard() {
		textureWidth = 512;
		textureHeight = 512;

		handguardHKey = new ModelRenderer(this);
		handguardHKey.setRotationPoint(0.0F, 23.0F, 0.0F);
		

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, 0.0F, 0.0F);
		handguardHKey.addChild(bone7);
		bone7.cubeList.add(new ModelBox(bone7, 424, 294, -1.3F, -36.2882F, -27.2F, 2, 2, 2, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 394, 200, -3.7F, -36.2882F, -27.2F, 3, 2, 2, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 0, 385, -2.3F, -35.5882F, -47.703F, 2, 1, 25, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 104, 497, -2.3F, -35.5882F, -50.701F, 2, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 326, 274, -2.5F, -34.7882F, -50.701F, 2, 1, 28, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 266, 31, -2.7F, -40.0F, -52.699F, 1, 1, 30, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 266, 62, -1.3F, -40.0F, -52.699F, 1, 1, 30, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 132, 264, -2.5F, -40.75F, -52.699F, 2, 1, 30, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 124, 483, -4.0658F, -37.4941F, -29.701F, 1, 1, 7, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 326, 501, -4.0658F, -37.4941F, -32.701F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 0, 484, 0.0658F, -37.4941F, -29.701F, 1, 1, 7, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 280, 492, -4.4158F, -37.1441F, -32.351F, 1, 1, 2, -0.35F, false));
		bone7.cubeList.add(new ModelBox(bone7, 286, 492, -4.4158F, -37.8441F, -32.351F, 1, 1, 2, -0.35F, false));
		bone7.cubeList.add(new ModelBox(bone7, 292, 492, 0.4158F, -37.8441F, -32.351F, 1, 1, 2, -0.35F, false));
		bone7.cubeList.add(new ModelBox(bone7, 298, 492, 0.4158F, -37.1441F, -32.351F, 1, 1, 2, -0.35F, false));
		bone7.cubeList.add(new ModelBox(bone7, 330, 501, 0.0658F, -37.4941F, -32.701F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 304, 492, -4.4158F, -37.1441F, -35.351F, 1, 1, 2, -0.35F, false));
		bone7.cubeList.add(new ModelBox(bone7, 310, 492, -4.4158F, -37.8441F, -35.351F, 1, 1, 2, -0.35F, false));
		bone7.cubeList.add(new ModelBox(bone7, 334, 501, -4.0658F, -37.4941F, -35.701F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 338, 501, 0.0658F, -37.4941F, -35.701F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 316, 492, 0.4158F, -37.8441F, -35.351F, 1, 1, 2, -0.35F, false));
		bone7.cubeList.add(new ModelBox(bone7, 322, 492, 0.4158F, -37.1441F, -35.351F, 1, 1, 2, -0.35F, false));
		bone7.cubeList.add(new ModelBox(bone7, 328, 492, 0.4158F, -37.1441F, -38.351F, 1, 1, 2, -0.35F, false));
		bone7.cubeList.add(new ModelBox(bone7, 366, 492, 0.4158F, -37.8441F, -38.351F, 1, 1, 2, -0.35F, false));
		bone7.cubeList.add(new ModelBox(bone7, 342, 501, 0.0658F, -37.4941F, -38.701F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 346, 501, -4.0658F, -37.4941F, -38.701F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 372, 492, -4.4158F, -37.8441F, -38.351F, 1, 1, 2, -0.35F, false));
		bone7.cubeList.add(new ModelBox(bone7, 378, 492, -4.4158F, -37.1441F, -38.351F, 1, 1, 2, -0.35F, false));
		bone7.cubeList.add(new ModelBox(bone7, 384, 492, -4.4158F, -37.1441F, -41.351F, 1, 1, 2, -0.35F, false));
		bone7.cubeList.add(new ModelBox(bone7, 390, 492, -4.4158F, -37.8441F, -41.351F, 1, 1, 2, -0.35F, false));
		bone7.cubeList.add(new ModelBox(bone7, 350, 501, -4.0658F, -37.4941F, -41.701F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 354, 501, 0.0658F, -37.4941F, -41.701F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 396, 492, 0.4158F, -37.8441F, -41.351F, 1, 1, 2, -0.35F, false));
		bone7.cubeList.add(new ModelBox(bone7, 402, 492, 0.4158F, -37.1441F, -41.351F, 1, 1, 2, -0.35F, false));
		bone7.cubeList.add(new ModelBox(bone7, 492, 485, 0.4158F, -37.1441F, -44.351F, 1, 1, 2, -0.35F, false));
		bone7.cubeList.add(new ModelBox(bone7, 492, 488, 0.4158F, -37.8441F, -44.351F, 1, 1, 2, -0.35F, false));
		bone7.cubeList.add(new ModelBox(bone7, 358, 501, 0.0658F, -37.4941F, -44.701F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 362, 501, -4.0658F, -37.4941F, -44.701F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 492, 491, -4.4158F, -37.8441F, -44.351F, 1, 1, 2, -0.35F, false));
		bone7.cubeList.add(new ModelBox(bone7, 80, 494, -4.4158F, -37.1441F, -44.351F, 1, 1, 2, -0.35F, false));
		bone7.cubeList.add(new ModelBox(bone7, 494, 120, -4.4158F, -37.1441F, -47.351F, 1, 1, 2, -0.35F, false));
		bone7.cubeList.add(new ModelBox(bone7, 494, 123, -4.4158F, -37.8441F, -47.351F, 1, 1, 2, -0.35F, false));
		bone7.cubeList.add(new ModelBox(bone7, 366, 501, -4.0658F, -37.4941F, -47.701F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 370, 501, 0.0658F, -37.4941F, -47.701F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 494, 126, 0.4158F, -37.8441F, -47.351F, 1, 1, 2, -0.35F, false));
		bone7.cubeList.add(new ModelBox(bone7, 494, 129, 0.4158F, -37.1441F, -47.351F, 1, 1, 2, -0.35F, false));
		bone7.cubeList.add(new ModelBox(bone7, 494, 132, 0.4158F, -37.1441F, -50.351F, 1, 1, 2, -0.35F, false));
		bone7.cubeList.add(new ModelBox(bone7, 494, 135, 0.4158F, -37.8441F, -50.351F, 1, 1, 2, -0.35F, false));
		bone7.cubeList.add(new ModelBox(bone7, 494, 138, 0.0658F, -37.4941F, -51.701F, 1, 1, 2, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 494, 141, -4.0658F, -37.4941F, -51.701F, 1, 1, 2, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 334, 494, -4.4158F, -37.8441F, -50.351F, 1, 1, 2, -0.35F, false));
		bone7.cubeList.add(new ModelBox(bone7, 340, 494, -4.4158F, -37.1441F, -50.351F, 1, 1, 2, -0.35F, false));

		bone_r17 = new ModelRenderer(this);
		bone_r17.setRotationPoint(-2.7F, -40.0F, -50.7F);
		bone7.addChild(bone_r17);
		setRotationAngle(bone_r17, 0.0F, 0.0F, 0.9774F);
		bone_r17.cubeList.add(new ModelBox(bone_r17, 264, 241, 0.0F, -1.0F, -2.0F, 1, 1, 30, 0.0F, false));

		bone_r18 = new ModelRenderer(this);
		bone_r18.setRotationPoint(-0.3F, -40.0F, -50.7F);
		bone7.addChild(bone_r18);
		setRotationAngle(bone_r18, 0.0F, 0.0F, -0.9774F);
		bone_r18.cubeList.add(new ModelBox(bone_r18, 266, 0, -1.0F, -1.0F, -2.0F, 1, 1, 30, 0.0F, false));

		bone_r19 = new ModelRenderer(this);
		bone_r19.setRotationPoint(-2.55F, -39.1F, -29.7F);
		bone7.addChild(bone_r19);
		setRotationAngle(bone_r19, 0.0F, 0.0F, -0.4014F);
		bone_r19.cubeList.add(new ModelBox(bone_r19, 16, 484, -0.9219F, -0.1841F, -0.001F, 1, 1, 7, 0.0F, false));
		bone_r19.cubeList.add(new ModelBox(bone_r19, 494, 499, -0.9219F, -0.1841F, -4.001F, 1, 1, 1, 0.0F, false));
		bone_r19.cubeList.add(new ModelBox(bone_r19, 206, 501, -0.9219F, -0.1841F, -8.001F, 1, 1, 1, 0.0F, false));
		bone_r19.cubeList.add(new ModelBox(bone_r19, 238, 501, -0.9219F, -0.1841F, -12.001F, 1, 1, 1, 0.0F, false));
		bone_r19.cubeList.add(new ModelBox(bone_r19, 274, 501, -0.9219F, -0.1841F, -16.001F, 1, 1, 1, 0.0F, false));
		bone_r19.cubeList.add(new ModelBox(bone_r19, 286, 501, -0.9219F, -0.1841F, -20.001F, 1, 1, 1, 0.0F, false));
		bone_r19.cubeList.add(new ModelBox(bone_r19, 266, 93, -0.3219F, -0.1851F, -23.002F, 1, 1, 30, 0.0F, false));
		bone_r19.cubeList.add(new ModelBox(bone_r19, 498, 499, -0.9219F, -0.1841F, -23.0F, 1, 1, 1, 0.0F, false));

		bone_r20 = new ModelRenderer(this);
		bone_r20.setRotationPoint(-2.55F, -35.2F, -29.7F);
		bone7.addChild(bone_r20);
		setRotationAngle(bone_r20, 0.0F, 0.0F, 0.4014F);
		bone_r20.cubeList.add(new ModelBox(bone_r20, 32, 484, -0.8F, -0.5289F, -0.001F, 1, 1, 7, 0.0F, false));
		bone_r20.cubeList.add(new ModelBox(bone_r20, 0, 500, -0.8F, -0.5289F, -4.001F, 1, 1, 1, 0.0F, false));
		bone_r20.cubeList.add(new ModelBox(bone_r20, 198, 501, -0.8F, -0.5289F, -8.001F, 1, 1, 1, 0.0F, false));
		bone_r20.cubeList.add(new ModelBox(bone_r20, 230, 501, -0.8F, -0.5289F, -12.001F, 1, 1, 1, 0.0F, false));
		bone_r20.cubeList.add(new ModelBox(bone_r20, 424, 298, -0.8F, -0.5289F, -18.001F, 1, 1, 3, 0.0F, false));
		bone_r20.cubeList.add(new ModelBox(bone_r20, 444, 463, -0.2F, -0.5279F, -15.002F, 1, 1, 22, 0.0F, false));
		bone_r20.cubeList.add(new ModelBox(bone_r20, 4, 500, -0.8F, -0.5289F, -21.0F, 1, 1, 1, 0.0F, false));

		bone_r21 = new ModelRenderer(this);
		bone_r21.setRotationPoint(-0.45F, -35.2F, -29.7F);
		bone7.addChild(bone_r21);
		setRotationAngle(bone_r21, 0.0F, 0.0F, -0.4014F);
		bone_r21.cubeList.add(new ModelBox(bone_r21, 48, 484, -0.2F, -0.5289F, -0.001F, 1, 1, 7, 0.0F, false));
		bone_r21.cubeList.add(new ModelBox(bone_r21, 8, 500, -0.2F, -0.5289F, -4.001F, 1, 1, 1, 0.0F, false));
		bone_r21.cubeList.add(new ModelBox(bone_r21, 222, 501, -0.2F, -0.5289F, -8.001F, 1, 1, 1, 0.0F, false));
		bone_r21.cubeList.add(new ModelBox(bone_r21, 254, 501, -0.2F, -0.5289F, -12.001F, 1, 1, 1, 0.0F, false));
		bone_r21.cubeList.add(new ModelBox(bone_r21, 426, 385, -0.2F, -0.5289F, -18.001F, 1, 1, 3, 0.0F, false));
		bone_r21.cubeList.add(new ModelBox(bone_r21, 196, 464, -0.8F, -0.5279F, -15.002F, 1, 1, 22, 0.0F, false));
		bone_r21.cubeList.add(new ModelBox(bone_r21, 12, 500, -0.2F, -0.5289F, -21.0F, 1, 1, 1, 0.0F, false));

		bone_r22 = new ModelRenderer(this);
		bone_r22.setRotationPoint(-0.45F, -39.1F, -29.7F);
		bone7.addChild(bone_r22);
		setRotationAngle(bone_r22, 0.0F, 0.0F, 0.4014F);
		bone_r22.cubeList.add(new ModelBox(bone_r22, 64, 484, -0.0781F, -0.1841F, -0.001F, 1, 1, 7, 0.0F, false));
		bone_r22.cubeList.add(new ModelBox(bone_r22, 16, 500, -0.0781F, -0.1841F, -4.001F, 1, 1, 1, 0.0F, false));
		bone_r22.cubeList.add(new ModelBox(bone_r22, 214, 501, -0.0781F, -0.1841F, -8.001F, 1, 1, 1, 0.0F, false));
		bone_r22.cubeList.add(new ModelBox(bone_r22, 246, 501, -0.0781F, -0.1841F, -12.001F, 1, 1, 1, 0.0F, false));
		bone_r22.cubeList.add(new ModelBox(bone_r22, 266, 501, -0.0781F, -0.1841F, -16.001F, 1, 1, 1, 0.0F, false));
		bone_r22.cubeList.add(new ModelBox(bone_r22, 278, 501, -0.0781F, -0.1841F, -20.001F, 1, 1, 1, 0.0F, false));
		bone_r22.cubeList.add(new ModelBox(bone_r22, 266, 124, -0.6781F, -0.1851F, -23.002F, 1, 1, 30, 0.0F, false));
		bone_r22.cubeList.add(new ModelBox(bone_r22, 20, 500, -0.0781F, -0.1841F, -23.0F, 1, 1, 1, 0.0F, false));

		bone_r23 = new ModelRenderer(this);
		bone_r23.setRotationPoint(-3.85F, -37.8F, -29.7F);
		bone7.addChild(bone_r23);
		setRotationAngle(bone_r23, 0.0F, 0.0F, 0.4014F);
		bone_r23.cubeList.add(new ModelBox(bone_r23, 140, 484, -0.0781F, -1.1841F, -0.002F, 1, 1, 7, 0.0F, false));
		bone_r23.cubeList.add(new ModelBox(bone_r23, 194, 501, -0.0841F, -1.1694F, -4.001F, 1, 1, 1, 0.0F, false));
		bone_r23.cubeList.add(new ModelBox(bone_r23, 210, 501, -0.0841F, -1.1694F, -8.001F, 1, 1, 1, 0.0F, false));
		bone_r23.cubeList.add(new ModelBox(bone_r23, 242, 501, -0.0841F, -1.1694F, -12.001F, 1, 1, 1, 0.0F, false));
		bone_r23.cubeList.add(new ModelBox(bone_r23, 270, 501, -0.0841F, -1.1694F, -16.001F, 1, 1, 1, 0.0F, false));
		bone_r23.cubeList.add(new ModelBox(bone_r23, 290, 501, -0.0841F, -1.1694F, -20.001F, 1, 1, 1, 0.0F, false));
		bone_r23.cubeList.add(new ModelBox(bone_r23, 276, 155, -0.0791F, -0.6341F, -22.001F, 1, 1, 29, 0.0F, false));
		bone_r23.cubeList.add(new ModelBox(bone_r23, 24, 500, -0.0781F, -1.1841F, -22.999F, 1, 1, 1, 0.0F, false));

		bone_r24 = new ModelRenderer(this);
		bone_r24.setRotationPoint(-3.85F, -36.5F, -29.7F);
		bone7.addChild(bone_r24);
		setRotationAngle(bone_r24, 0.0F, 0.0F, -0.4014F);
		bone_r24.cubeList.add(new ModelBox(bone_r24, 156, 484, -0.2F, 0.4711F, -0.003F, 1, 1, 7, 0.0F, false));
		bone_r24.cubeList.add(new ModelBox(bone_r24, 28, 500, -0.2F, 0.4711F, -4.0F, 1, 1, 1, 0.0F, false));
		bone_r24.cubeList.add(new ModelBox(bone_r24, 202, 501, -0.2F, 0.4711F, -8.0F, 1, 1, 1, 0.0F, false));
		bone_r24.cubeList.add(new ModelBox(bone_r24, 234, 501, -0.2F, 0.4711F, -12.0F, 1, 1, 1, 0.0F, false));
		bone_r24.cubeList.add(new ModelBox(bone_r24, 428, 200, -0.2F, 0.4711F, -18.0F, 1, 1, 3, 0.0F, false));
		bone_r24.cubeList.add(new ModelBox(bone_r24, 144, 460, -0.201F, -0.0789F, -21.001F, 1, 1, 1, 0.0F, false));
		bone_r24.cubeList.add(new ModelBox(bone_r24, 438, 126, -0.551F, -0.4289F, -20.351F, 1, 1, 3, -0.35F, false));
		bone_r24.cubeList.add(new ModelBox(bone_r24, 386, 104, -0.201F, -0.0789F, -18.001F, 1, 1, 25, 0.0F, false));
		bone_r24.cubeList.add(new ModelBox(bone_r24, 32, 500, -0.2F, 0.4711F, -20.999F, 1, 1, 1, 0.0F, false));

		bone_r25 = new ModelRenderer(this);
		bone_r25.setRotationPoint(0.85F, -36.5F, -29.7F);
		bone7.addChild(bone_r25);
		setRotationAngle(bone_r25, 0.0F, 0.0F, 0.4014F);
		bone_r25.cubeList.add(new ModelBox(bone_r25, 486, 24, -0.8F, 0.4711F, -0.003F, 1, 1, 7, 0.0F, false));
		bone_r25.cubeList.add(new ModelBox(bone_r25, 36, 500, -0.8F, 0.4711F, -4.0F, 1, 1, 1, 0.0F, false));
		bone_r25.cubeList.add(new ModelBox(bone_r25, 226, 501, -0.8F, 0.4711F, -8.0F, 1, 1, 1, 0.0F, false));
		bone_r25.cubeList.add(new ModelBox(bone_r25, 258, 501, -0.8F, 0.4711F, -12.0F, 1, 1, 1, 0.0F, false));
		bone_r25.cubeList.add(new ModelBox(bone_r25, 148, 435, -0.8F, 0.4711F, -18.0F, 1, 1, 3, 0.0F, false));
		bone_r25.cubeList.add(new ModelBox(bone_r25, 40, 500, -0.799F, -0.0789F, -21.001F, 1, 1, 1, 0.0F, false));
		bone_r25.cubeList.add(new ModelBox(bone_r25, 438, 122, -0.449F, -0.4289F, -20.351F, 1, 1, 3, -0.35F, false));
		bone_r25.cubeList.add(new ModelBox(bone_r25, 386, 204, -0.799F, -0.0789F, -18.001F, 1, 1, 25, 0.0F, false));
		bone_r25.cubeList.add(new ModelBox(bone_r25, 44, 500, -0.8F, 0.4711F, -20.999F, 1, 1, 1, 0.0F, false));

		bone_r26 = new ModelRenderer(this);
		bone_r26.setRotationPoint(0.85F, -37.8F, -29.7F);
		bone7.addChild(bone_r26);
		setRotationAngle(bone_r26, 0.0F, 0.0F, -0.4014F);
		bone_r26.cubeList.add(new ModelBox(bone_r26, 486, 32, -0.9219F, -1.1841F, -0.002F, 1, 1, 7, 0.0F, false));
		bone_r26.cubeList.add(new ModelBox(bone_r26, 48, 500, -0.9219F, -1.1841F, -4.0F, 1, 1, 1, 0.0F, false));
		bone_r26.cubeList.add(new ModelBox(bone_r26, 218, 501, -0.9219F, -1.1841F, -8.0F, 1, 1, 1, 0.0F, false));
		bone_r26.cubeList.add(new ModelBox(bone_r26, 250, 501, -0.9219F, -1.1841F, -12.0F, 1, 1, 1, 0.0F, false));
		bone_r26.cubeList.add(new ModelBox(bone_r26, 262, 501, -0.9219F, -1.1841F, -16.0F, 1, 1, 1, 0.0F, false));
		bone_r26.cubeList.add(new ModelBox(bone_r26, 282, 501, -0.9219F, -1.1841F, -20.0F, 1, 1, 1, 0.0F, false));
		bone_r26.cubeList.add(new ModelBox(bone_r26, 276, 185, -0.9209F, -0.6341F, -22.001F, 1, 1, 29, 0.0F, false));
		bone_r26.cubeList.add(new ModelBox(bone_r26, 52, 500, -0.9219F, -1.1841F, -22.999F, 1, 1, 1, 0.0F, false));

		bone_r27 = new ModelRenderer(this);
		bone_r27.setRotationPoint(-3.85F, -36.5F, -47.0F);
		bone7.addChild(bone_r27);
		setRotationAngle(bone_r27, -0.7854F, 0.0F, -0.4014F);
		bone_r27.cubeList.add(new ModelBox(bone_r27, 92, 461, -0.1999F, 0.2831F, -0.6679F, 1, 1, 1, 0.0F, false));

		bone_r28 = new ModelRenderer(this);
		bone_r28.setRotationPoint(0.85F, -36.5F, -47.0F);
		bone7.addChild(bone_r28);
		setRotationAngle(bone_r28, -0.7854F, 0.0F, 0.4014F);
		bone_r28.cubeList.add(new ModelBox(bone_r28, 56, 500, -0.8001F, 0.2831F, -0.6679F, 1, 1, 1, 0.0F, false));

		bone_r29 = new ModelRenderer(this);
		bone_r29.setRotationPoint(-3.85F, -36.5F, -49.1F);
		bone7.addChild(bone_r29);
		setRotationAngle(bone_r29, -0.7854F, 0.0F, -0.4014F);
		bone_r29.cubeList.add(new ModelBox(bone_r29, 144, 462, -0.1999F, 0.2831F, -0.6679F, 1, 1, 1, 0.0F, false));

		bone_r30 = new ModelRenderer(this);
		bone_r30.setRotationPoint(0.85F, -36.5F, -49.1F);
		bone7.addChild(bone_r30);
		setRotationAngle(bone_r30, -0.7854F, 0.0F, 0.4014F);
		bone_r30.cubeList.add(new ModelBox(bone_r30, 60, 500, -0.8001F, 0.2831F, -0.6679F, 1, 1, 1, 0.0F, false));

		bone_r31 = new ModelRenderer(this);
		bone_r31.setRotationPoint(-3.9F, -35.3F, -26.8F);
		bone7.addChild(bone_r31);
		setRotationAngle(bone_r31, -0.3316F, 0.0F, 0.0F);
		bone_r31.cubeList.add(new ModelBox(bone_r31, 64, 500, 0.0F, -0.5161F, 0.1666F, 1, 1, 1, -0.1F, false));
		bone_r31.cubeList.add(new ModelBox(bone_r31, 68, 500, 3.8F, -0.5161F, 0.1666F, 1, 1, 1, -0.1F, false));

		handguard4 = new ModelRenderer(this);
		handguard4.setRotationPoint(-2.7F, -36.2F, -50.7F);
		bone7.addChild(handguard4);
		handguard4.cubeList.add(new ModelBox(handguard4, 72, 500, 0.0F, 0.6108F, 0.001F, 1, 1, 1, 0.0F, false));
		handguard4.cubeList.add(new ModelBox(handguard4, 386, 256, 0.0F, 0.6108F, 2.998F, 1, 1, 25, 0.0F, false));

		rails3 = new ModelRenderer(this);
		rails3.setRotationPoint(-2.3F, -43.1F, -39.75F);
		handguardHKey.addChild(rails3);
		rails3.cubeList.add(new ModelBox(rails3, 110, 497, -0.2F, 1.7F, 16.15F, 2, 1, 1, -0.2F, false));
		rails3.cubeList.add(new ModelBox(rails3, 116, 497, -0.2F, 1.7F, 14.95F, 2, 1, 1, -0.2F, false));
		rails3.cubeList.add(new ModelBox(rails3, 122, 497, -0.2F, 1.7F, 13.75F, 2, 1, 1, -0.2F, false));
		rails3.cubeList.add(new ModelBox(rails3, 128, 497, -0.2F, 1.7F, 12.55F, 2, 1, 1, -0.2F, false));
		rails3.cubeList.add(new ModelBox(rails3, 134, 497, -0.2F, 1.7F, 11.35F, 2, 1, 1, -0.2F, false));
		rails3.cubeList.add(new ModelBox(rails3, 140, 497, -0.2F, 1.7F, 10.15F, 2, 1, 1, -0.2F, false));
		rails3.cubeList.add(new ModelBox(rails3, 146, 497, -0.2F, 1.7F, 8.95F, 2, 1, 1, -0.2F, false));
		rails3.cubeList.add(new ModelBox(rails3, 152, 497, -0.2F, 1.7F, 7.75F, 2, 1, 1, -0.2F, false));
		rails3.cubeList.add(new ModelBox(rails3, 158, 497, -0.2F, 1.7F, 6.55F, 2, 1, 1, -0.2F, false));
		rails3.cubeList.add(new ModelBox(rails3, 164, 497, -0.2F, 1.7F, 5.35F, 2, 1, 1, -0.2F, false));
		rails3.cubeList.add(new ModelBox(rails3, 170, 497, -0.2F, 1.7F, 4.15F, 2, 1, 1, -0.2F, false));
		rails3.cubeList.add(new ModelBox(rails3, 176, 497, -0.2F, 1.7F, 2.95F, 2, 1, 1, -0.2F, false));
		rails3.cubeList.add(new ModelBox(rails3, 182, 497, -0.2F, 1.7F, 1.75F, 2, 1, 1, -0.2F, false));
		rails3.cubeList.add(new ModelBox(rails3, 188, 497, -0.2F, 1.7F, 0.55F, 2, 1, 1, -0.2F, false));
		rails3.cubeList.add(new ModelBox(rails3, 194, 497, -0.2F, 1.7F, -0.65F, 2, 1, 1, -0.2F, false));
		rails3.cubeList.add(new ModelBox(rails3, 200, 497, -0.2F, 1.7F, -1.85F, 2, 1, 1, -0.2F, false));
		rails3.cubeList.add(new ModelBox(rails3, 206, 497, -0.2F, 1.7F, -3.05F, 2, 1, 1, -0.2F, false));
		rails3.cubeList.add(new ModelBox(rails3, 212, 497, -0.2F, 1.7F, -4.25F, 2, 1, 1, -0.2F, false));
		rails3.cubeList.add(new ModelBox(rails3, 218, 497, -0.2F, 1.7F, -5.45F, 2, 1, 1, -0.2F, false));
		rails3.cubeList.add(new ModelBox(rails3, 224, 497, -0.2F, 1.7F, -6.65F, 2, 1, 1, -0.2F, false));
		rails3.cubeList.add(new ModelBox(rails3, 230, 497, -0.2F, 1.7F, -7.85F, 2, 1, 1, -0.2F, false));
		rails3.cubeList.add(new ModelBox(rails3, 236, 497, -0.2F, 1.7F, -9.05F, 2, 1, 1, -0.2F, false));
		rails3.cubeList.add(new ModelBox(rails3, 242, 497, -0.2F, 1.7F, -13.15F, 2, 1, 1, -0.2F, false));
		rails3.cubeList.add(new ModelBox(rails3, 248, 497, -0.2F, 1.7F, -12.65F, 2, 1, 1, -0.2F, false));
		rails3.cubeList.add(new ModelBox(rails3, 254, 497, -0.2F, 1.7F, -11.45F, 2, 1, 1, -0.2F, false));
		rails3.cubeList.add(new ModelBox(rails3, 260, 497, -0.2F, 1.7F, -10.25F, 2, 1, 1, -0.2F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.0F, -1.0F, 0.0F);
		rails3.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, -0.7854F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 82, 500, -2.8506F, 1.8506F, 16.15F, 1, 1, 1, -0.201F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 86, 500, -2.8506F, 1.8506F, 14.95F, 1, 1, 1, -0.201F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 90, 500, -2.8506F, 1.8506F, 13.75F, 1, 1, 1, -0.201F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 94, 500, -2.8506F, 1.8506F, 12.55F, 1, 1, 1, -0.201F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 98, 500, -2.8506F, 1.8506F, 11.35F, 1, 1, 1, -0.201F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 500, 120, -2.8506F, 1.8506F, 10.15F, 1, 1, 1, -0.201F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 500, 122, -2.8506F, 1.8506F, 8.95F, 1, 1, 1, -0.201F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 500, 124, -2.8506F, 1.8506F, 7.75F, 1, 1, 1, -0.201F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 500, 126, -2.8506F, 1.8506F, 6.55F, 1, 1, 1, -0.201F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 500, 128, -2.8506F, 1.8506F, 5.35F, 1, 1, 1, -0.201F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 500, 130, -2.8506F, 1.8506F, 4.15F, 1, 1, 1, -0.201F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 500, 132, -2.8506F, 1.8506F, 2.95F, 1, 1, 1, -0.201F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 500, 134, -2.8506F, 1.8506F, 1.75F, 1, 1, 1, -0.201F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 500, 136, -2.8506F, 1.8506F, 0.55F, 1, 1, 1, -0.201F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 500, 138, -2.8506F, 1.8506F, -0.65F, 1, 1, 1, -0.201F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 500, 140, -2.8506F, 1.8506F, -1.85F, 1, 1, 1, -0.201F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 500, 142, -2.8506F, 1.8506F, -3.05F, 1, 1, 1, -0.201F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 500, 144, -2.8506F, 1.8506F, -4.25F, 1, 1, 1, -0.201F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 500, 383, -2.8506F, 1.8506F, -5.45F, 1, 1, 1, -0.201F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 500, 497, -2.8506F, 1.8506F, -6.65F, 1, 1, 1, -0.201F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 76, 501, -2.8506F, 1.8506F, -7.85F, 1, 1, 1, -0.201F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 102, 501, -2.8506F, 1.8506F, -9.05F, 1, 1, 1, -0.201F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 310, 501, -2.8506F, 1.8506F, -13.15F, 1, 1, 1, -0.201F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 314, 501, -2.8506F, 1.8506F, -12.65F, 1, 1, 1, -0.201F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 318, 501, -2.8506F, 1.8506F, -11.45F, 1, 1, 1, -0.201F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 322, 501, -2.8506F, 1.8506F, -10.25F, 1, 1, 1, -0.201F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 264, 272, -2.9996F, 1.8746F, -12.599F, 1, 1, 30, -0.35F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(1.6F, -1.0F, 3.25F);
		rails3.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, -0.7854F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 106, 501, -2.8506F, 1.8506F, 12.9F, 1, 1, 1, -0.201F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 110, 501, -2.8506F, 1.8506F, 11.7F, 1, 1, 1, -0.201F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 114, 501, -2.8506F, 1.8506F, 10.5F, 1, 1, 1, -0.201F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 118, 501, -2.8506F, 1.8506F, 9.3F, 1, 1, 1, -0.201F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 122, 501, -2.8506F, 1.8506F, 8.1F, 1, 1, 1, -0.201F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 126, 501, -2.8506F, 1.8506F, 6.9F, 1, 1, 1, -0.201F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 130, 501, -2.8506F, 1.8506F, 5.7F, 1, 1, 1, -0.201F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 134, 501, -2.8506F, 1.8506F, 4.5F, 1, 1, 1, -0.201F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 138, 501, -2.8506F, 1.8506F, 3.3F, 1, 1, 1, -0.201F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 142, 501, -2.8506F, 1.8506F, 2.1F, 1, 1, 1, -0.201F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 146, 501, -2.8506F, 1.8506F, 0.9F, 1, 1, 1, -0.201F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 150, 501, -2.8506F, 1.8506F, -0.3F, 1, 1, 1, -0.201F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 154, 501, -2.8506F, 1.8506F, -1.5F, 1, 1, 1, -0.201F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 158, 501, -2.8506F, 1.8506F, -2.7F, 1, 1, 1, -0.201F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 162, 501, -2.8506F, 1.8506F, -3.9F, 1, 1, 1, -0.201F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 166, 501, -2.8506F, 1.8506F, -5.1F, 1, 1, 1, -0.201F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 170, 501, -2.8506F, 1.8506F, -6.3F, 1, 1, 1, -0.201F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 174, 501, -2.8506F, 1.8506F, -7.5F, 1, 1, 1, -0.201F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 178, 501, -2.8506F, 1.8506F, -8.7F, 1, 1, 1, -0.201F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 182, 501, -2.8506F, 1.8506F, -9.9F, 1, 1, 1, -0.201F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 186, 501, -2.8506F, 1.8506F, -11.1F, 1, 1, 1, -0.201F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 190, 501, -2.8506F, 1.8506F, -12.3F, 1, 1, 1, -0.201F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 294, 501, -2.8506F, 1.8506F, -16.4F, 1, 1, 1, -0.201F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 298, 501, -2.8506F, 1.8506F, -15.9F, 1, 1, 1, -0.201F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 302, 501, -2.8506F, 1.8506F, -14.7F, 1, 1, 1, -0.201F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 306, 501, -2.8506F, 1.8506F, -13.5F, 1, 1, 1, -0.201F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 196, 274, -2.8746F, 1.9996F, -15.849F, 1, 1, 30, -0.35F, false));

		rails4 = new ModelRenderer(this);
		rails4.setRotationPoint(-1.5F, -33.4286F, -38.0768F);
		handguardHKey.addChild(rails4);
		setRotationAngle(rails4, 0.0F, 0.0F, -3.1416F);
		rails4.cubeList.add(new ModelBox(rails4, 266, 497, -1.0F, -0.2714F, 14.4768F, 2, 1, 1, -0.2F, false));
		rails4.cubeList.add(new ModelBox(rails4, 272, 497, -1.0F, -0.2714F, 13.2768F, 2, 1, 1, -0.2F, false));
		rails4.cubeList.add(new ModelBox(rails4, 278, 497, -1.0F, -0.2714F, 12.0768F, 2, 1, 1, -0.2F, false));
		rails4.cubeList.add(new ModelBox(rails4, 284, 497, -1.0F, -0.2714F, 10.8768F, 2, 1, 1, -0.2F, false));
		rails4.cubeList.add(new ModelBox(rails4, 290, 497, -1.0F, -0.2714F, 9.6768F, 2, 1, 1, -0.2F, false));
		rails4.cubeList.add(new ModelBox(rails4, 296, 497, -1.0F, -0.2714F, 8.4768F, 2, 1, 1, -0.2F, false));
		rails4.cubeList.add(new ModelBox(rails4, 302, 497, -1.0F, -0.2714F, 7.2768F, 2, 1, 1, -0.2F, false));
		rails4.cubeList.add(new ModelBox(rails4, 308, 497, -1.0F, -0.2714F, 6.0768F, 2, 1, 1, -0.2F, false));
		rails4.cubeList.add(new ModelBox(rails4, 314, 497, -1.0F, -0.2714F, 4.8768F, 2, 1, 1, -0.2F, false));
		rails4.cubeList.add(new ModelBox(rails4, 320, 497, -1.0F, -0.2714F, 3.6768F, 2, 1, 1, -0.2F, false));
		rails4.cubeList.add(new ModelBox(rails4, 326, 497, -1.0F, -0.2714F, 2.4768F, 2, 1, 1, -0.2F, false));
		rails4.cubeList.add(new ModelBox(rails4, 332, 497, -1.0F, -0.2714F, 1.2768F, 2, 1, 1, -0.2F, false));
		rails4.cubeList.add(new ModelBox(rails4, 338, 497, -1.0F, -0.2714F, 0.0768F, 2, 1, 1, -0.2F, false));
		rails4.cubeList.add(new ModelBox(rails4, 344, 497, -1.0F, -0.2714F, -1.1232F, 2, 1, 1, -0.2F, false));
		rails4.cubeList.add(new ModelBox(rails4, 350, 497, -1.0F, -0.2714F, -2.3232F, 2, 1, 1, -0.2F, false));
		rails4.cubeList.add(new ModelBox(rails4, 356, 497, -1.0F, -0.2714F, -3.5232F, 2, 1, 1, -0.2F, false));
		rails4.cubeList.add(new ModelBox(rails4, 362, 497, -1.0F, -0.2714F, -4.7232F, 2, 1, 1, -0.2F, false));
		rails4.cubeList.add(new ModelBox(rails4, 368, 497, -1.0F, -0.2714F, -5.9232F, 2, 1, 1, -0.2F, false));
		rails4.cubeList.add(new ModelBox(rails4, 374, 497, -1.0F, -0.2714F, -7.1232F, 2, 1, 1, -0.2F, false));
		rails4.cubeList.add(new ModelBox(rails4, 380, 497, -1.0F, -0.2714F, -8.3232F, 2, 1, 1, -0.2F, false));
		rails4.cubeList.add(new ModelBox(rails4, 386, 497, -1.0F, -0.2714F, -9.5232F, 2, 1, 1, -0.2F, false));
		rails4.cubeList.add(new ModelBox(rails4, 392, 497, -1.0F, -0.2714F, -10.7232F, 2, 1, 1, -0.2F, false));
		rails4.cubeList.add(new ModelBox(rails4, 0, 492, -1.0F, -0.2714F, -12.9232F, 2, 1, 2, -0.2F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-0.8F, -2.9714F, -1.6732F);
		rails4.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 374, 501, -2.8506F, 1.8506F, 16.15F, 1, 1, 1, -0.201F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 378, 501, -2.8506F, 1.8506F, 14.95F, 1, 1, 1, -0.201F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 382, 501, -2.8506F, 1.8506F, 13.75F, 1, 1, 1, -0.201F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 386, 501, -2.8506F, 1.8506F, 12.55F, 1, 1, 1, -0.201F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 390, 501, -2.8506F, 1.8506F, 11.35F, 1, 1, 1, -0.201F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 394, 501, -2.8506F, 1.8506F, 10.15F, 1, 1, 1, -0.201F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 398, 501, -2.8506F, 1.8506F, 8.95F, 1, 1, 1, -0.201F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 402, 501, -2.8506F, 1.8506F, 7.75F, 1, 1, 1, -0.201F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 406, 501, -2.8506F, 1.8506F, 6.55F, 1, 1, 1, -0.201F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 410, 501, -2.8506F, 1.8506F, 5.35F, 1, 1, 1, -0.201F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 414, 501, -2.8506F, 1.8506F, 4.15F, 1, 1, 1, -0.201F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 418, 501, -2.8506F, 1.8506F, 2.95F, 1, 1, 1, -0.201F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 422, 501, -2.8506F, 1.8506F, 1.75F, 1, 1, 1, -0.201F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 426, 501, -2.8506F, 1.8506F, 0.55F, 1, 1, 1, -0.201F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 430, 501, -2.8506F, 1.8506F, -0.65F, 1, 1, 1, -0.201F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 434, 501, -2.8506F, 1.8506F, -1.85F, 1, 1, 1, -0.201F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 438, 501, -2.8506F, 1.8506F, -3.05F, 1, 1, 1, -0.201F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 442, 501, -2.8506F, 1.8506F, -4.25F, 1, 1, 1, -0.201F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 446, 501, -2.8506F, 1.8506F, -5.45F, 1, 1, 1, -0.201F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 450, 501, -2.8506F, 1.8506F, -6.65F, 1, 1, 1, -0.201F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 454, 501, -2.8506F, 1.8506F, -7.85F, 1, 1, 1, -0.201F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 458, 501, -2.8506F, 1.8506F, -9.05F, 1, 1, 1, -0.201F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 346, 494, -2.8506F, 1.8506F, -11.25F, 1, 1, 2, -0.201F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 356, -2.9996F, 1.8746F, -10.599F, 1, 1, 28, -0.35F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.8F, -2.9714F, 1.5768F);
		rails4.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 462, 501, -2.8506F, 1.8506F, 12.9F, 1, 1, 1, -0.201F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 466, 501, -2.8506F, 1.8506F, 11.7F, 1, 1, 1, -0.201F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 470, 501, -2.8506F, 1.8506F, 10.5F, 1, 1, 1, -0.201F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 474, 501, -2.8506F, 1.8506F, 9.3F, 1, 1, 1, -0.201F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 478, 501, -2.8506F, 1.8506F, 8.1F, 1, 1, 1, -0.201F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 482, 501, -2.8506F, 1.8506F, 6.9F, 1, 1, 1, -0.201F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 486, 501, -2.8506F, 1.8506F, 5.7F, 1, 1, 1, -0.201F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 490, 501, -2.8506F, 1.8506F, 4.5F, 1, 1, 1, -0.201F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 494, 501, -2.8506F, 1.8506F, 3.3F, 1, 1, 1, -0.201F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 498, 501, -2.8506F, 1.8506F, 2.1F, 1, 1, 1, -0.201F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 502, -2.8506F, 1.8506F, 0.9F, 1, 1, 1, -0.201F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 4, 502, -2.8506F, 1.8506F, -0.3F, 1, 1, 1, -0.201F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 502, 4, -2.8506F, 1.8506F, -1.5F, 1, 1, 1, -0.201F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 502, 6, -2.8506F, 1.8506F, -2.7F, 1, 1, 1, -0.201F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 8, 502, -2.8506F, 1.8506F, -3.9F, 1, 1, 1, -0.201F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 502, 8, -2.8506F, 1.8506F, -5.1F, 1, 1, 1, -0.201F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 502, 10, -2.8506F, 1.8506F, -6.3F, 1, 1, 1, -0.201F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 12, 502, -2.8506F, 1.8506F, -7.5F, 1, 1, 1, -0.201F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 502, 12, -2.8506F, 1.8506F, -8.7F, 1, 1, 1, -0.201F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 502, 14, -2.8506F, 1.8506F, -9.9F, 1, 1, 1, -0.201F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 16, 502, -2.8506F, 1.8506F, -11.1F, 1, 1, 1, -0.201F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 502, 16, -2.8506F, 1.8506F, -12.3F, 1, 1, 1, -0.201F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 352, 494, -2.8506F, 1.8506F, -14.5F, 1, 1, 2, -0.201F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 58, 357, -2.8746F, 1.9996F, -13.849F, 1, 1, 28, -0.35F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handguardHKey.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}