package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Stoner63LMGCover extends ModelWithAttachments {
	private final ModelRenderer feedCover;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
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
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer rearSight;
	private final ModelRenderer irons2;
	private final ModelRenderer bone11_r1;
	private final ModelRenderer bone11_r2;

	public Stoner63LMGCover() {
		textureWidth = 576;
		textureHeight = 576;

		feedCover = new ModelRenderer(this);
		feedCover.setRotationPoint(-1.4986F, -18.605F, -29.0277F);
		feedCover.cubeList.add(new ModelBox(feedCover, 526, 89, -3.2514F, -1.995F, 1.9277F, 1, 1, 13, 0.0F, false));
		feedCover.cubeList.add(new ModelBox(feedCover, 41, 548, -3.8514F, -1.395F, 7.4277F, 1, 1, 5, -0.2F, false));
		feedCover.cubeList.add(new ModelBox(feedCover, 529, 450, -2.5443F, -2.4021F, 14.9277F, 5, 1, 7, 0.0F, false));
		feedCover.cubeList.add(new ModelBox(feedCover, 15, 546, 2.4557F, -2.4021F, 14.3277F, 1, 4, 5, 0.0F, false));
		feedCover.cubeList.add(new ModelBox(feedCover, 551, 249, 3.4557F, -2.4021F, 14.7277F, 1, 4, 3, 0.0F, false));
		feedCover.cubeList.add(new ModelBox(feedCover, 129, 553, 4.4557F, -2.4021F, 14.1277F, 1, 4, 2, 0.0F, false));
		feedCover.cubeList.add(new ModelBox(feedCover, 526, 0, -2.5443F, -2.7021F, 1.9277F, 9, 1, 13, 0.0F, false));
		feedCover.cubeList.add(new ModelBox(feedCover, 496, 544, -2.5443F, -1.995F, 1.2206F, 9, 1, 1, 0.0F, false));
		feedCover.cubeList.add(new ModelBox(feedCover, 62, 545, -2.5443F, -1.995F, 6.2206F, 9, 1, 1, 0.0F, false));
		feedCover.cubeList.add(new ModelBox(feedCover, 528, 64, -2.5443F, -1.995F, 12.2206F, 9, 1, 1, 0.0F, false));
		feedCover.cubeList.add(new ModelBox(feedCover, 276, 528, -3.2514F, -0.995F, 11.9277F, 1, 4, 10, 0.0F, false));
		feedCover.cubeList.add(new ModelBox(feedCover, 394, 544, -3.2514F, -0.995F, 1.9277F, 1, 3, 6, 0.0F, false));
		feedCover.cubeList.add(new ModelBox(feedCover, 256, 549, -1.4514F, -0.995F, -1.0723F, 1, 2, 4, 0.0F, false));
		feedCover.cubeList.add(new ModelBox(feedCover, 549, 404, 0.4486F, -0.995F, -1.0723F, 1, 2, 4, 0.0F, false));
		feedCover.cubeList.add(new ModelBox(feedCover, 528, 547, 0.4486F, -1.995F, 0.9277F, 1, 1, 5, 0.0F, false));
		feedCover.cubeList.add(new ModelBox(feedCover, 428, 535, -1.4514F, -1.995F, 0.9277F, 1, 1, 5, 0.0F, false));
		feedCover.cubeList.add(new ModelBox(feedCover, 115, 557, 2.1628F, -0.995F, 20.9277F, 1, 4, 1, 0.0F, false));
		feedCover.cubeList.add(new ModelBox(feedCover, 336, 563, 2.1628F, -1.695F, 20.9277F, 1, 1, 1, 0.0F, false));
		feedCover.cubeList.add(new ModelBox(feedCover, 529, 538, -3.2514F, -1.695F, 14.9277F, 1, 1, 7, 0.0F, false));
		feedCover.cubeList.add(new ModelBox(feedCover, 526, 215, 6.1628F, -1.995F, 1.9277F, 1, 1, 13, 0.0F, false));
		feedCover.cubeList.add(new ModelBox(feedCover, 528, 50, 6.8628F, -1.795F, 1.9277F, 2, 1, 12, -0.2F, false));
		feedCover.cubeList.add(new ModelBox(feedCover, 532, 290, 7.7628F, -2.02F, 3.9277F, 1, 1, 9, 0.0F, false));
		feedCover.cubeList.add(new ModelBox(feedCover, 534, 249, -3.2514F, 0.005F, 21.9277F, 1, 3, 7, 0.0F, false));
		feedCover.cubeList.add(new ModelBox(feedCover, 529, 459, -2.5443F, -0.7021F, 21.9277F, 5, 1, 7, 0.0F, false));
		feedCover.cubeList.add(new ModelBox(feedCover, 557, 369, 1.9557F, -1.7021F, 26.9277F, 1, 1, 2, 0.0F, false));
		feedCover.cubeList.add(new ModelBox(feedCover, 557, 551, -3.0443F, -1.7021F, 26.9277F, 1, 1, 2, 0.0F, false));
		feedCover.cubeList.add(new ModelBox(feedCover, 552, 446, -2.0443F, -1.7021F, 26.9277F, 4, 1, 1, 0.0F, false));
		feedCover.cubeList.add(new ModelBox(feedCover, 516, 374, -3.0443F, -2.2021F, 28.9277F, 6, 2, 3, 0.0F, false));
		feedCover.cubeList.add(new ModelBox(feedCover, 41, 525, 2.1628F, 0.005F, 21.9277F, 1, 3, 7, 0.0F, false));
		feedCover.cubeList.add(new ModelBox(feedCover, 425, 551, 5.1628F, -0.995F, 12.9277F, 2, 4, 2, 0.0F, false));
		feedCover.cubeList.add(new ModelBox(feedCover, 529, 468, 2.1628F, 2.005F, 12.9277F, 3, 1, 5, 0.0F, false));
		feedCover.cubeList.add(new ModelBox(feedCover, 167, 553, 1.1287F, 0.005F, 12.9688F, 2, 2, 2, 0.0F, false));
		feedCover.cubeList.add(new ModelBox(feedCover, 532, 279, -0.0255F, -0.695F, 19.9892F, 2, 2, 8, 0.0F, false));
		feedCover.cubeList.add(new ModelBox(feedCover, 532, 322, 1.9745F, 0.005F, 19.9892F, 1, 2, 8, 0.0F, false));
		feedCover.cubeList.add(new ModelBox(feedCover, 532, 311, -1.0255F, 0.005F, 19.9892F, 1, 2, 8, 0.0F, false));
		feedCover.cubeList.add(new ModelBox(feedCover, 136, 553, 2.1628F, 2.005F, 17.9277F, 1, 1, 3, 0.0F, false));
		feedCover.cubeList.add(new ModelBox(feedCover, 558, 117, 3.1628F, 2.005F, 17.5277F, 1, 1, 2, 0.0F, false));
		feedCover.cubeList.add(new ModelBox(feedCover, 120, 558, 5.1628F, 2.005F, 14.2277F, 1, 1, 2, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.1486F, -2.395F, 27.2277F);
		feedCover.addChild(cube_r1);
		setRotationAngle(cube_r1, 1.5708F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 145, 553, -2.45F, -2.8F, -0.5F, 4, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 156, 553, -2.05F, 1.8F, -0.5F, 4, 1, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.1486F, -2.395F, 26.8277F);
		feedCover.addChild(cube_r2);
		setRotationAngle(cube_r2, 1.5708F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 535, 554, -1.75F, -1.8F, -0.5F, 1, 5, 1, -0.1F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 404, 554, 0.75F, -1.9F, -0.5F, 1, 5, 1, -0.2F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 553, 517, -1.95F, -0.3F, -0.5F, 3, 2, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1.1514F, -1.495F, 27.2277F);
		feedCover.addChild(cube_r3);
		setRotationAngle(cube_r3, 1.5708F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 54, 548, -2.05F, 1.8F, -0.5F, 7, 1, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(6.9532F, -0.2808F, 16.5727F);
		feedCover.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.4233F, -0.3897F, -0.8702F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 532, 333, -0.5F, -2.5F, -1.5F, 1, 1, 8, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(5.3388F, 7.0979F, 15.5442F);
		feedCover.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, -0.5672F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 532, 343, -0.5F, -9.5F, -1.5F, 1, 1, 8, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(5.9352F, 0.505F, 15.9241F);
		feedCover.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, -0.5672F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 441, 532, -0.5F, 1.5F, -1.5F, 1, 1, 8, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 510, 531, -0.5F, -2.2F, -1.5F, 1, 4, 8, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.4216F, 0.005F, 13.8936F);
		feedCover.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.2618F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 343, 535, -0.0776F, 0.0F, -0.7102F, 1, 2, 7, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.5238F, 1.005F, 14.67F);
		feedCover.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.2618F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 534, 260, -2.9754F, -1.0F, -1.4867F, 1, 2, 7, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-0.5443F, 1.305F, 14.1524F);
		feedCover.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.2618F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 460, 532, -1.0777F, -2.0F, -0.7102F, 2, 2, 7, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(4.9306F, 2.4799F, 18.4277F);
		feedCover.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 0.7854F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 411, 535, -4.0F, -0.5F, 3.5F, 1, 1, 7, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-0.0694F, 2.4799F, 18.4277F);
		feedCover.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 0.7854F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 41, 536, -4.0F, -0.5F, 3.5F, 1, 1, 7, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-2.5443F, -1.495F, 1.9277F);
		feedCover.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.7854F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 356, 563, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(6.4557F, -1.495F, 1.9277F);
		feedCover.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.7854F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 351, 563, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(8.9306F, 0.4799F, 5.4277F);
		feedCover.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, 0.7854F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 546, 538, -8.8083F, 4.5912F, 1.5F, 1, 1, 6, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 366, 563, -6.687F, 3.4699F, 2.5F, 1, 1, 1, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 361, 563, -6.687F, 3.4699F, 5.5F, 1, 1, 1, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 293, 546, -6.687F, 2.4699F, 1.5F, 1, 1, 6, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 528, 35, -4.0F, -0.5F, -3.5F, 1, 1, 13, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(10.3448F, 0.4799F, 4.4277F);
		feedCover.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, 0.7854F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 558, -8.8083F, 5.5912F, 4.5F, 1, 1, 2, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(4.9306F, 0.7799F, 17.4277F);
		feedCover.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, 0.7854F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 331, 563, -4.0F, -0.5F, 3.5F, 1, 1, 1, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-0.0694F, 0.7799F, 17.4277F);
		feedCover.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, 0.7854F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 318, 538, -4.0F, -0.5F, -2.5F, 1, 1, 7, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-0.0694F, 0.4799F, 5.4277F);
		feedCover.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, 0.7854F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 526, 200, -4.0F, -0.5F, -3.5F, 1, 1, 13, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(1.4557F, 7.3954F, 19.3766F);
		feedCover.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.829F, 0.0F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 471, 551, -4.0F, -7.7F, -4.5F, 5, 1, 1, 0.0F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 547, 112, -4.0F, -8.5F, -5.5F, 5, 1, 3, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(1.4557F, 5.1837F, 14.3672F);
		feedCover.addChild(cube_r20);
		setRotationAngle(cube_r20, -0.3927F, 0.0F, 0.0F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 547, 109, -4.0F, -7.5F, -2.5F, 8, 1, 1, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(5.8557F, -1.4021F, 0.4277F);
		feedCover.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, -0.7854F, 0.0F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 474, 559, 3.0F, -1.5F, 4.5F, 1, 1, 1, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(5.8557F, -1.4021F, 4.9277F);
		feedCover.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, -0.7854F, 0.0F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 524, 559, 3.0F, -1.5F, 4.5F, 1, 1, 1, 0.0F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-0.1443F, -1.4021F, 0.4277F);
		feedCover.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, -0.7854F, 0.0F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 346, 563, 3.0F, -1.5F, 4.5F, 1, 1, 1, 0.0F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-0.1443F, -1.4021F, 4.9277F);
		feedCover.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, -0.7854F, 0.0F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 341, 563, 3.0F, -1.5F, 4.5F, 1, 1, 1, 0.0F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(1.9557F, -1.995F, 1.9277F);
		feedCover.addChild(cube_r25);
		setRotationAngle(cube_r25, -0.7854F, 0.0F, 0.0F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 41, 545, -4.5F, -0.5F, -0.5F, 9, 1, 1, 0.0F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-0.6514F, 1.505F, 4.9277F);
		feedCover.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, 0.6109F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 28, 546, -4.0F, -0.5F, 2.5F, 1, 3, 5, -0.3F, false));

		rearSight = new ModelRenderer(this);
		rearSight.setRotationPoint(1.4986F, 43.605F, 33.7777F);
		feedCover.addChild(rearSight);
		

		irons2 = new ModelRenderer(this);
		irons2.setRotationPoint(-1.5F, -52.7465F, -1.15F);
		rearSight.addChild(irons2);
		setRotationAngle(irons2, -1.5708F, 0.0F, 0.0F);
		

		bone11_r1 = new ModelRenderer(this);
		bone11_r1.setRotationPoint(0.0F, 0.0786F, 0.1625F);
		irons2.addChild(bone11_r1);
		setRotationAngle(bone11_r1, 1.5708F, 0.0F, 0.0F);
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 557, 365, -0.9964F, 5.2214F, -3.3375F, 2, 2, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 449, 559, -0.0465F, 4.4214F, -3.3375F, 1, 2, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 282, 563, -0.4F, 4.975F, -3.3375F, 1, 1, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 277, 563, -0.6F, 4.975F, -3.3375F, 1, 1, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 444, 559, -0.9535F, 4.4214F, -3.3375F, 1, 2, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 563, 235, -0.4F, 4.0679F, -3.3375F, 1, 1, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 235, 563, -0.6F, 4.0679F, -3.3375F, 1, 1, 1, -0.35F, false));

		bone11_r2 = new ModelRenderer(this);
		bone11_r2.setRotationPoint(0.0F, 0.0786F, 0.1625F);
		irons2.addChild(bone11_r2);
		setRotationAngle(bone11_r2, 1.5708F, -0.7854F, 0.0F);
		bone11_r2.cubeList.add(new ModelBox(bone11_r2, 311, 563, 3.5043F, 2.9507F, -3.3375F, 1, 1, 1, -0.35F, false));
		bone11_r2.cubeList.add(new ModelBox(bone11_r2, 306, 563, 3.5043F, 3.1507F, -3.3375F, 1, 1, 1, -0.35F, false));
		bone11_r2.cubeList.add(new ModelBox(bone11_r2, 301, 563, 2.9507F, 3.5043F, -3.3375F, 1, 1, 1, -0.35F, false));
		bone11_r2.cubeList.add(new ModelBox(bone11_r2, 296, 563, 3.1507F, 3.5043F, -3.3375F, 1, 1, 1, -0.35F, false));
		bone11_r2.cubeList.add(new ModelBox(bone11_r2, 272, 563, 2.5972F, 3.1507F, -3.3375F, 1, 1, 1, -0.35F, false));
		bone11_r2.cubeList.add(new ModelBox(bone11_r2, 255, 563, 2.5972F, 2.9507F, -3.3375F, 1, 1, 1, -0.35F, false));
		bone11_r2.cubeList.add(new ModelBox(bone11_r2, 250, 563, 3.1507F, 2.5971F, -3.3375F, 1, 1, 1, -0.35F, false));
		bone11_r2.cubeList.add(new ModelBox(bone11_r2, 240, 563, 2.9507F, 2.5971F, -3.3375F, 1, 1, 1, -0.35F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		feedCover.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}