package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QCW05 extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer bone;
	private final ModelRenderer sights;
	private final ModelRenderer frontsight;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer irons;
	private final ModelRenderer cube_r189;
	private final ModelRenderer cube_r190;
	private final ModelRenderer cube_r191;
	private final ModelRenderer cube_r192;
	private final ModelRenderer cube_r193;
	private final ModelRenderer cube_r194;
	private final ModelRenderer barrelandreciever;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer mag_release;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer bone8;
	private final ModelRenderer handguard_r1;

	public QCW05() {
		textureWidth = 320;
		textureHeight = 320;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		gun.cubeList.add(new ModelBox(gun, 258, 0, -5.0F, -36.1F, 8.6F, 7, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 258, 9, -5.0F, -33.1F, 8.6F, 7, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 212, 265, -5.0F, -32.1F, 8.85F, 7, 2, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 262, 220, -4.5F, -33.1F, 15.6F, 6, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 258, 18, -4.5F, -35.9F, 16.1F, 6, 3, 7, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 208, 284, -4.5F, -36.1F, 15.6F, 6, 3, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 193, 284, -4.5F, -36.1F, 22.6F, 6, 4, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 256, 54, -4.5F, -36.1F, 16.6F, 6, 1, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 35, 291, -5.0F, -35.1F, 14.6F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 281, 142, -5.0F, -34.1F, 8.6F, 1, 1, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 281, 134, -4.75F, -35.1F, 8.6F, 1, 1, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 231, 274, 0.75F, -35.1F, 8.6F, 1, 2, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 253, 196, -4.0F, -36.1F, 7.35F, 5, 4, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 188, 302, -1.999F, -32.4F, -8.1F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 290, 301, -1.999F, -32.4F, -8.5F, 1, 2, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.499F, -30.7553F, -8.5437F);
		gun.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.829F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 218, 302, -0.5F, -1.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1.499F, -30.2001F, -7.8918F);
		gun.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.829F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 213, 302, -0.5F, 0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.499F, -30.1582F, -8.1645F);
		gun.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.4363F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 193, 302, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.8502F, -32.1F, 17.0752F);
		gun.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.6109F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 208, 295, 3.0F, -4.0F, -1.0F, 1, 4, 2, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-3.6073F, -34.6F, 15.3544F);
		gun.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, -0.6109F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 131, 294, -1.0F, -1.5F, -1.0F, 1, 4, 2, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-7.4771F, -32.1F, 6.6342F);
		gun.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, -0.3491F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 256, 291, 3.0F, -4.0F, -1.0F, 2, 4, 2, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-2.1008F, -32.1F, 9.0284F);
		gun.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.3491F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 219, 291, 2.0F, -4.0F, -1.0F, 2, 4, 2, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-2.0F, -33.4952F, 6.7823F);
		gun.addChild(bone2);
		

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, -1.0F, -3.0F);
		bone2.addChild(cube_r9);
		setRotationAngle(cube_r9, -1.1781F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 212, 203, -2.0F, -4.0F, 2.0F, 5, 1, 4, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.9546F, 2.5606F, 4.1959F);
		bone2.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.9429F, 0.2781F, -0.0153F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 295, 276, 2.5F, 0.5F, -4.0F, 1, 1, 3, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.519F, 1.9413F, 2.5704F);
		bone2.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.9429F, -0.2781F, 0.0153F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 235, 295, -3.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.5532F, 3.0327F, 3.6451F);
		bone2.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.9671F, 0.0998F, -0.1434F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 287, 204, 2.5F, -0.5F, -4.0F, 1, 2, 4, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.7073F, 2.3962F, 1.9786F);
		bone2.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.9671F, -0.0998F, 0.1434F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 17, 286, -3.5F, -1.5F, -2.5F, 1, 2, 4, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-1.5F, -31.4261F, 17.8807F);
		gun.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 3.1416F, 0.0F);
		

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-0.5F, -3.0692F, -5.0484F);
		bone3.addChild(cube_r14);
		setRotationAngle(cube_r14, -1.1781F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 257, 244, -2.0F, -6.7716F, 3.148F, 5, 1, 4, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.362F, 0.5834F, 2.0446F);
		bone3.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.9497F, 0.2427F, -0.0417F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 12, 302, 1.779F, -2.1682F, -0.6554F, 1, 1, 1, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 300, 301, 1.779F, -1.8682F, -0.4054F, 1, 1, 1, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.0532F, 0.9636F, 1.5966F);
		bone3.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.9671F, 0.0998F, -0.1434F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 293, 249, 2.2012F, -2.9575F, -1.3054F, 1, 2, 3, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(1.0F, -45.1F, -2.0F);
		gun.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 248, 274, -4.0F, 1.1F, 4.4F, 3, 10, 3, -0.3F, false));
		bone.cubeList.add(new ModelBox(bone, 77, 268, -5.0F, 8.5F, 4.4F, 5, 4, 5, -0.3F, false));
		bone.cubeList.add(new ModelBox(bone, 82, 210, -3.5F, 0.7F, -4.0F, 2, 1, 9, -0.3F, false));
		bone.cubeList.add(new ModelBox(bone, 293, 255, -4.0F, 0.7F, 3.0F, 3, 1, 2, -0.3F, false));
		bone.cubeList.add(new ModelBox(bone, 256, 42, -4.0F, 1.1F, -5.0F, 3, 1, 10, -0.3F, false));
		bone.cubeList.add(new ModelBox(bone, 175, 286, -4.0F, 0.7F, -1.0F, 3, 1, 3, -0.3F, false));
		bone.cubeList.add(new ModelBox(bone, 261, 286, -4.0F, 0.7F, -5.0F, 3, 1, 3, -0.3F, false));

		sights = new ModelRenderer(this);
		sights.setRotationPoint(0.0F, 1.0F, -2.0F);
		gun.addChild(sights);
		

		frontsight = new ModelRenderer(this);
		frontsight.setRotationPoint(0.0F, 0.0F, 8.0F);
		sights.addChild(frontsight);
		frontsight.cubeList.add(new ModelBox(frontsight, 293, 243, -2.5F, -41.8F, -21.9F, 2, 3, 2, -0.2F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 291, 285, -2.5F, -41.8F, -22.5F, 2, 3, 2, -0.2F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 173, 296, -2.5F, -45.8F, -22.5F, 2, 2, 2, -0.2F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 298, 272, -2.5F, -45.3F, -21.7F, 2, 1, 1, -0.1F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 296, 144, -2.5F, -45.8F, -21.9F, 2, 2, 2, -0.2F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 298, 5, -2.5F, -44.2F, -22.5F, 2, 3, 1, -0.2F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 298, 0, -2.5F, -44.2F, -20.9F, 2, 3, 1, -0.2F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 153, 292, -0.4893F, -47.8847F, -22.7F, 1, 2, 3, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 16, 293, -3.4475F, -47.8847F, -22.7F, 1, 2, 3, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 188, 290, -2.6368F, -48.7695F, -22.7F, 2, 1, 3, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 175, 291, -2.3F, -48.7695F, -22.7F, 2, 1, 3, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 300, 225, -2.0F, -46.3F, -21.75F, 1, 1, 1, -0.2F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 75, 288, -2.0F, -47.4F, -21.75F, 1, 2, 1, -0.4F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-2.5684F, -47.8595F, -21.7F);
		frontsight.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, 0.7418F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 67, 292, -0.5F, -1.0F, -1.0F, 1, 2, 3, -0.4F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-0.3684F, -47.8595F, -21.7F);
		frontsight.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, -0.7418F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 58, 292, -0.5F, -1.0F, -1.0F, 1, 2, 3, -0.4F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-2.5684F, -45.9099F, -21.7F);
		frontsight.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, -0.7418F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 49, 292, -0.5F, -1.0F, -1.0F, 1, 2, 3, -0.4F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-0.3684F, -45.9099F, -21.7F);
		frontsight.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, 0.7418F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 287, 291, -0.5F, -1.0F, -1.0F, 1, 2, 3, -0.4F, false));

		irons = new ModelRenderer(this);
		irons.setRotationPoint(-6.5F, -37.5F, 10.25F);
		sights.addChild(irons);
		irons.cubeList.add(new ModelBox(irons, 298, 129, 4.5F, -10.55F, -5.75F, 1, 1, 2, -0.35F, false));
		irons.cubeList.add(new ModelBox(irons, 147, 298, 4.2F, -10.55F, -5.75F, 1, 1, 2, -0.35F, false));
		irons.cubeList.add(new ModelBox(irons, 298, 149, 4.8F, -10.55F, -5.75F, 1, 1, 2, -0.35F, false));
		irons.cubeList.add(new ModelBox(irons, 297, 183, 3.9F, -10.35F, -5.7F, 1, 2, 2, -0.4F, false));
		irons.cubeList.add(new ModelBox(irons, 297, 188, 5.1F, -10.35F, -5.7F, 1, 2, 2, -0.4F, false));
		irons.cubeList.add(new ModelBox(irons, 296, 50, 4.0F, -9.2F, -5.8F, 2, 1, 2, -0.3F, false));
		irons.cubeList.add(new ModelBox(irons, 287, 211, 3.5F, -9.0F, -5.699F, 3, 3, 2, -0.4F, false));

		cube_r189 = new ModelRenderer(this);
		cube_r189.setRotationPoint(3.9F, -10.7F, -1.7F);
		irons.addChild(cube_r189);
		setRotationAngle(cube_r189, 0.0F, 0.0F, 0.7854F);
		cube_r189.cubeList.add(new ModelBox(cube_r189, 298, 73, 1.2728F, 0.2728F, -4.001F, 1, 1, 2, -0.4F, false));
		cube_r189.cubeList.add(new ModelBox(cube_r189, 298, 77, 1.0728F, 0.2728F, -4.001F, 1, 1, 2, -0.4F, false));

		cube_r190 = new ModelRenderer(this);
		cube_r190.setRotationPoint(6.1F, -10.7F, -1.7F);
		irons.addChild(cube_r190);
		setRotationAngle(cube_r190, 0.0F, 0.0F, -0.7854F);
		cube_r190.cubeList.add(new ModelBox(cube_r190, 298, 81, -2.2728F, 0.2728F, -4.001F, 1, 1, 2, -0.4F, false));
		cube_r190.cubeList.add(new ModelBox(cube_r190, 154, 298, -2.0728F, 0.2728F, -4.001F, 1, 1, 2, -0.4F, false));

		cube_r191 = new ModelRenderer(this);
		cube_r191.setRotationPoint(3.85F, -11.8F, -1.7F);
		irons.addChild(cube_r191);
		setRotationAngle(cube_r191, 0.0F, 0.0F, -0.7854F);
		cube_r191.cubeList.add(new ModelBox(cube_r191, 161, 298, -1.3428F, 1.2768F, -4.048F, 1, 1, 2, -0.35F, false));
		cube_r191.cubeList.add(new ModelBox(cube_r191, 85, 298, -1.2878F, 1.2778F, -4.049F, 1, 1, 2, -0.35F, false));

		cube_r192 = new ModelRenderer(this);
		cube_r192.setRotationPoint(3.9F, -11.7F, -1.7F);
		irons.addChild(cube_r192);
		setRotationAngle(cube_r192, 0.0F, 0.0F, -0.7854F);
		cube_r192.cubeList.add(new ModelBox(cube_r192, 298, 85, -1.4728F, 1.2728F, -4.001F, 1, 1, 2, -0.4F, false));
		cube_r192.cubeList.add(new ModelBox(cube_r192, 298, 89, -1.2728F, 1.2728F, -4.001F, 1, 1, 2, -0.4F, false));

		cube_r193 = new ModelRenderer(this);
		cube_r193.setRotationPoint(6.1F, -11.7F, -1.7F);
		irons.addChild(cube_r193);
		setRotationAngle(cube_r193, 0.0F, 0.0F, 0.7854F);
		cube_r193.cubeList.add(new ModelBox(cube_r193, 298, 93, 0.2728F, 1.2728F, -4.001F, 1, 1, 2, -0.4F, false));
		cube_r193.cubeList.add(new ModelBox(cube_r193, 298, 97, 0.4728F, 1.2728F, -4.001F, 1, 1, 2, -0.4F, false));

		cube_r194 = new ModelRenderer(this);
		cube_r194.setRotationPoint(6.15F, -11.8F, -1.7F);
		irons.addChild(cube_r194);
		setRotationAngle(cube_r194, 0.0F, 0.0F, 0.7854F);
		cube_r194.cubeList.add(new ModelBox(cube_r194, 298, 165, 0.3428F, 1.2768F, -4.048F, 1, 1, 2, -0.35F, false));
		cube_r194.cubeList.add(new ModelBox(cube_r194, 298, 101, 0.2878F, 1.2778F, -4.049F, 1, 1, 2, -0.35F, false));

		barrelandreciever = new ModelRenderer(this);
		barrelandreciever.setRotationPoint(0.0F, 0.0F, -27.0F);
		gun.addChild(barrelandreciever);
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 0, 0, -2.0F, -36.3F, -1.4F, 1, 1, 37, -0.1F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 0, 39, -2.0F, -37.4314F, -1.4F, 1, 1, 37, -0.1F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 77, 0, -2.5657F, -36.8657F, -1.4F, 1, 1, 37, -0.1F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 77, 39, -1.4343F, -36.8657F, -1.4F, 1, 1, 37, -0.1F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-1.1929F, -36.7657F, -10.4F);
		barrelandreciever.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, -0.7854F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 77, 117, -1.0F, -1.0F, 9.0F, 1, 1, 37, -0.1F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-0.3929F, -36.7657F, -10.4F);
		barrelandreciever.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, -0.7854F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 117, -1.0F, -1.0F, 9.0F, 1, 1, 37, -0.1F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-0.3929F, -35.9657F, -10.4F);
		barrelandreciever.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, -0.7854F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 77, 78, -1.0F, -1.0F, 9.0F, 1, 1, 37, -0.1F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-1.1929F, -35.9657F, -10.4F);
		barrelandreciever.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, -0.7854F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 78, -1.0F, -1.0F, 9.0F, 1, 1, 37, -0.1F, false));

		mag_release = new ModelRenderer(this);
		mag_release.setRotationPoint(0.0F, 0.0F, 0.0F);
		gun.addChild(mag_release);
		mag_release.cubeList.add(new ModelBox(mag_release, 282, 229, -5.1F, -32.1F, 9.85F, 1, 1, 6, 0.0F, false));
		mag_release.cubeList.add(new ModelBox(mag_release, 121, 179, -4.5F, -32.1F, 14.85F, 6, 1, 1, 0.0F, false));
		mag_release.cubeList.add(new ModelBox(mag_release, 298, 69, 0.7F, -32.1F, 14.85F, 1, 1, 2, 0.0F, false));
		mag_release.cubeList.add(new ModelBox(mag_release, 17, 302, 0.7F, -31.1F, 14.85F, 1, 1, 1, 0.0F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-10.3F, -34.3426F, 7.3647F);
		mag_release.addChild(cube_r25);
		setRotationAngle(cube_r25, -0.7854F, 0.0F, 0.0F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 302, 243, 11.0F, -4.0F, 8.0F, 1, 1, 1, 0.0F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-10.3F, -34.3527F, 7.3748F);
		mag_release.addChild(cube_r26);
		setRotationAngle(cube_r26, -0.7854F, 0.0F, 0.0F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 40, 282, 11.0F, -4.4F, 8.0F, 1, 1, 1, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(1.0F, -3.4F, -8.8F);
		gun.addChild(bone8);
		bone8.cubeList.add(new ModelBox(bone8, 230, 150, -5.4F, -31.1F, 5.6F, 6, 2, 2, -0.3F, false));
		bone8.cubeList.add(new ModelBox(bone8, 281, 150, -5.5F, -31.1F, -0.4F, 6, 2, 2, -0.3F, false));
		bone8.cubeList.add(new ModelBox(bone8, 285, 160, -3.9F, -30.7F, 14.1F, 5, 2, 2, -0.3F, false));
		bone8.cubeList.add(new ModelBox(bone8, 285, 155, -6.1F, -30.7F, 14.1F, 5, 2, 2, -0.3F, false));

		handguard_r1 = new ModelRenderer(this);
		handguard_r1.setRotationPoint(0.2F, -29.8F, 6.65F);
		bone8.addChild(handguard_r1);
		setRotationAngle(handguard_r1, -1.5708F, 0.0F, -0.3316F);
		handguard_r1.cubeList.add(new ModelBox(handguard_r1, 182, 298, -0.5F, -0.5F, -1.0F, 1, 1, 2, -0.3F, false));
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