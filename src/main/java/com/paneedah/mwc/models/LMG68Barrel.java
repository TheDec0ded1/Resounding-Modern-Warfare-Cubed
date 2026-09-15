package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class LMG68Barrel extends ModelBase {
	private final ModelRenderer barrel;
	private final ModelRenderer bone;
	private final ModelRenderer gun_r1;
	private final ModelRenderer gun_r2;
	private final ModelRenderer gun_r3;
	private final ModelRenderer gun_r4;
	private final ModelRenderer gun_r5;
	private final ModelRenderer gun_r6;
	private final ModelRenderer gun_r7;
	private final ModelRenderer gun_r8;
	private final ModelRenderer gun_r9;
	private final ModelRenderer gun_r10;
	private final ModelRenderer gun_r11;
	private final ModelRenderer gun_r12;
	private final ModelRenderer gun_r13;
	private final ModelRenderer gun_r14;
	private final ModelRenderer gun_r15;
	private final ModelRenderer gun_r16;
	private final ModelRenderer gun_r17;
	private final ModelRenderer gun_r18;
	private final ModelRenderer gun_r19;
	private final ModelRenderer gun_r20;
	private final ModelRenderer bone2;
	private final ModelRenderer gun_r21;
	private final ModelRenderer gun_r22;
	private final ModelRenderer gun_r23;
	private final ModelRenderer gun_r24;
	private final ModelRenderer gun_r25;
	private final ModelRenderer gun_r26;
	private final ModelRenderer gun_r27;
	private final ModelRenderer gun_r28;
	private final ModelRenderer gun_r29;
	private final ModelRenderer gun_r30;
	private final ModelRenderer gun_r31;
	private final ModelRenderer gun_r32;
	private final ModelRenderer gun_r33;
	private final ModelRenderer gun_r34;
	private final ModelRenderer gun_r35;
	private final ModelRenderer gun_r36;
	private final ModelRenderer gun_r37;

	public LMG68Barrel() {
		textureWidth = 416;
		textureHeight = 416;

		barrel = new ModelRenderer(this);
		barrel.setRotationPoint(-0.5F, 17.7F, 0.0F);
		

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.5F, -3.3858F, -58.05F);
		barrel.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 382, 334, -1.999F, -27.25F, -5.7F, 1, 1, 4, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 382, 339, -2.7061F, -27.9571F, -5.7F, 1, 1, 4, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 382, 357, -1.2919F, -27.9571F, -5.7F, 1, 1, 4, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 382, 362, -1.999F, -28.6642F, -5.7F, 1, 1, 4, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 312, 366, -2.499F, -28.4142F, -11.2F, 2, 2, 7, -0.4F, false));
		bone.cubeList.add(new ModelBox(bone, 322, 383, -1.999F, -27.25F, -13.7F, 1, 1, 4, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 270, 383, -2.7061F, -27.9571F, -13.7F, 1, 1, 4, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 244, 383, -1.2919F, -27.9571F, -13.7F, 1, 1, 4, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 234, 383, -1.999F, -28.6642F, -13.7F, 1, 1, 4, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 270, 388, -1.999F, -28.6642F, -17.7F, 1, 1, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 246, 388, -1.2919F, -27.9571F, -17.7F, 1, 1, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 238, 388, -2.7061F, -27.9571F, -17.7F, 1, 1, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 230, 388, -1.999F, -27.25F, -17.7F, 1, 1, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 384, 0, -1.999F, -27.0257F, -21.5F, 1, 1, 4, 0.15F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 384, -2.9182F, -27.945F, -21.5F, 1, 1, 4, 0.15F, false));
		bone.cubeList.add(new ModelBox(bone, 382, 383, -1.0798F, -27.945F, -21.5F, 1, 1, 4, 0.15F, false));
		bone.cubeList.add(new ModelBox(bone, 372, 383, -1.999F, -28.8642F, -21.5F, 1, 1, 4, 0.15F, false));
		bone.cubeList.add(new ModelBox(bone, 396, 397, -1.0798F, -31.82F, -17.7F, 1, 1, 1, 0.15F, false));
		bone.cubeList.add(new ModelBox(bone, 392, 397, -2.9182F, -31.82F, -17.7F, 1, 1, 1, 0.15F, false));
		bone.cubeList.add(new ModelBox(bone, 230, 392, -1.999F, -31.1507F, -17.7F, 1, 4, 1, 0.15F, false));
		bone.cubeList.add(new ModelBox(bone, 398, 26, -2.9182F, -31.82F, -15.7F, 1, 1, 1, 0.15F, false));
		bone.cubeList.add(new ModelBox(bone, 310, 386, -1.999F, -33.5392F, -17.7F, 1, 2, 3, 0.15F, false));
		bone.cubeList.add(new ModelBox(bone, 234, 392, -1.999F, -31.1507F, -15.7F, 1, 4, 1, 0.15F, false));
		bone.cubeList.add(new ModelBox(bone, 398, 22, -1.0798F, -31.82F, -15.7F, 1, 1, 1, 0.15F, false));
		bone.cubeList.add(new ModelBox(bone, 56, 398, -1.999F, -30.9007F, 12.3F, 1, 1, 1, 0.15F, false));
		bone.cubeList.add(new ModelBox(bone, 398, 45, -1.0798F, -31.82F, 10.3F, 1, 1, 1, 0.15F, false));
		bone.cubeList.add(new ModelBox(bone, 40, 398, -1.0798F, -31.82F, 12.3F, 1, 1, 1, 0.15F, false));
		bone.cubeList.add(new ModelBox(bone, 32, 398, -2.9182F, -31.82F, 10.3F, 1, 1, 1, 0.15F, false));
		bone.cubeList.add(new ModelBox(bone, 28, 398, -2.9182F, -31.82F, 12.3F, 1, 1, 1, 0.15F, false));
		bone.cubeList.add(new ModelBox(bone, 386, 375, -1.999F, -33.5392F, 10.3F, 1, 2, 3, 0.15F, false));
		bone.cubeList.add(new ModelBox(bone, 362, 369, -2.8475F, -31.8407F, 13.5F, 1, 1, 7, 0.1F, false));
		bone.cubeList.add(new ModelBox(bone, 38, 369, -1.999F, -30.9922F, 13.5F, 1, 1, 7, 0.1F, false));
		bone.cubeList.add(new ModelBox(bone, 236, 368, -1.1505F, -31.8407F, 13.5F, 1, 1, 7, 0.1F, false));
		bone.cubeList.add(new ModelBox(bone, 220, 368, -1.999F, -32.6892F, 13.5F, 1, 1, 7, 0.1F, false));
		bone.cubeList.add(new ModelBox(bone, 398, 70, -1.999F, -32.6892F, -29.5F, 1, 1, 1, 0.1F, false));
		bone.cubeList.add(new ModelBox(bone, 398, 68, -1.1505F, -31.8407F, -29.5F, 1, 1, 1, 0.1F, false));
		bone.cubeList.add(new ModelBox(bone, 398, 66, -1.999F, -30.9922F, -29.5F, 1, 1, 1, 0.1F, false));
		bone.cubeList.add(new ModelBox(bone, 64, 398, -2.8475F, -31.8407F, -29.5F, 1, 1, 1, 0.1F, false));
		bone.cubeList.add(new ModelBox(bone, 366, 388, -1.999F, -28.4142F, -16.2F, 1, 1, 3, -0.15F, false));
		bone.cubeList.add(new ModelBox(bone, 358, 388, -1.504F, -27.9192F, -16.2F, 1, 1, 3, -0.15F, false));
		bone.cubeList.add(new ModelBox(bone, 350, 388, -2.494F, -27.9192F, -16.2F, 1, 1, 3, -0.15F, false));
		bone.cubeList.add(new ModelBox(bone, 342, 388, -1.999F, -27.4243F, -16.2F, 1, 1, 3, -0.15F, false));

		gun_r1 = new ModelRenderer(this);
		gun_r1.setRotationPoint(-0.0883F, -28.1299F, -14.7F);
		bone.addChild(gun_r1);
		setRotationAngle(gun_r1, 0.0F, 0.0F, 0.7854F);
		gun_r1.cubeList.add(new ModelBox(gun_r1, 374, 388, -0.5F, 1.0F, -1.5F, 1, 1, 3, -0.15F, false));

		gun_r2 = new ModelRenderer(this);
		gun_r2.setRotationPoint(-2.2026F, -26.7157F, -14.7F);
		bone.addChild(gun_r2);
		setRotationAngle(gun_r2, 0.0F, 0.0F, 0.7854F);
		gun_r2.cubeList.add(new ModelBox(gun_r2, 382, 388, -0.5F, -1.0F, -1.5F, 1, 1, 3, -0.15F, false));

		gun_r3 = new ModelRenderer(this);
		gun_r3.setRotationPoint(-0.7954F, -28.1228F, -14.7F);
		bone.addChild(gun_r3);
		setRotationAngle(gun_r3, 0.0F, 0.0F, 0.7854F);
		gun_r3.cubeList.add(new ModelBox(gun_r3, 0, 389, -0.5F, 0.0F, -1.5F, 1, 1, 3, -0.15F, false));

		gun_r4 = new ModelRenderer(this);
		gun_r4.setRotationPoint(-2.9097F, -26.7086F, -14.7F);
		bone.addChild(gun_r4);
		setRotationAngle(gun_r4, 0.0F, 0.0F, 0.7854F);
		gun_r4.cubeList.add(new ModelBox(gun_r4, 8, 389, -0.5F, -2.0F, -1.5F, 1, 1, 3, -0.15F, false));

		gun_r5 = new ModelRenderer(this);
		gun_r5.setRotationPoint(-3.1597F, -30.88F, -33.0F);
		bone.addChild(gun_r5);
		setRotationAngle(gun_r5, 0.0F, 0.0F, 0.7854F);
		gun_r5.cubeList.add(new ModelBox(gun_r5, 398, 62, -0.5F, -2.0F, 3.5F, 1, 1, 1, 0.1F, false));
		gun_r5.cubeList.add(new ModelBox(gun_r5, 0, 370, -0.5F, -2.0F, 46.5F, 1, 1, 7, 0.1F, false));

		gun_r6 = new ModelRenderer(this);
		gun_r6.setRotationPoint(-2.4526F, -30.3871F, -33.0F);
		bone.addChild(gun_r6);
		setRotationAngle(gun_r6, 0.0F, 0.0F, 0.7854F);
		gun_r6.cubeList.add(new ModelBox(gun_r6, 398, 64, -0.5F, -1.0F, 3.5F, 1, 1, 1, 0.1F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 346, 369, -0.5F, -1.0F, 46.5F, 1, 1, 7, 0.1F, false));

		gun_r7 = new ModelRenderer(this);
		gun_r7.setRotationPoint(0.1617F, -31.8013F, -33.0F);
		bone.addChild(gun_r7);
		setRotationAngle(gun_r7, 0.0F, 0.0F, 0.7854F);
		gun_r7.cubeList.add(new ModelBox(gun_r7, 68, 398, -0.5F, 1.0F, 3.5F, 1, 1, 1, 0.1F, false));
		gun_r7.cubeList.add(new ModelBox(gun_r7, 22, 369, -0.5F, 1.0F, 46.5F, 1, 1, 7, 0.1F, false));

		gun_r8 = new ModelRenderer(this);
		gun_r8.setRotationPoint(-0.5454F, -32.2942F, -33.0F);
		bone.addChild(gun_r8);
		setRotationAngle(gun_r8, 0.0F, 0.0F, 0.7854F);
		gun_r8.cubeList.add(new ModelBox(gun_r8, 72, 398, -0.5F, 0.0F, 3.5F, 1, 1, 1, 0.1F, false));
		gun_r8.cubeList.add(new ModelBox(gun_r8, 104, 368, -0.5F, 0.0F, 46.5F, 1, 1, 7, 0.1F, false));

		gun_r9 = new ModelRenderer(this);
		gun_r9.setRotationPoint(-3.2097F, -30.9093F, 14.8F);
		bone.addChild(gun_r9);
		setRotationAngle(gun_r9, 0.0F, 0.0F, 0.7854F);
		gun_r9.cubeList.add(new ModelBox(gun_r9, 398, 28, -0.5F, -2.0F, -2.5F, 1, 1, 1, 0.15F, false));
		gun_r9.cubeList.add(new ModelBox(gun_r9, 398, 30, -0.5F, -2.0F, -4.5F, 1, 1, 1, 0.15F, false));
		gun_r9.cubeList.add(new ModelBox(gun_r9, 398, 24, -0.5F, -2.0F, -30.5F, 1, 1, 1, 0.15F, false));
		gun_r9.cubeList.add(new ModelBox(gun_r9, 12, 398, -0.5F, -2.0F, -32.5F, 1, 1, 1, 0.15F, false));

		gun_r10 = new ModelRenderer(this);
		gun_r10.setRotationPoint(-2.5025F, -30.3164F, 12.8F);
		bone.addChild(gun_r10);
		setRotationAngle(gun_r10, 0.0F, 0.0F, 0.7854F);
		gun_r10.cubeList.add(new ModelBox(gun_r10, 398, 32, -0.5F, -1.0F, -2.5F, 1, 1, 1, 0.15F, false));
		gun_r10.cubeList.add(new ModelBox(gun_r10, 398, 36, -0.5F, -1.0F, -0.5F, 1, 1, 1, 0.15F, false));
		gun_r10.cubeList.add(new ModelBox(gun_r10, 24, 398, -0.5F, -1.0F, -28.5F, 1, 1, 1, 0.15F, false));
		gun_r10.cubeList.add(new ModelBox(gun_r10, 4, 398, -0.5F, -1.0F, -30.5F, 1, 1, 1, 0.15F, false));

		gun_r11 = new ModelRenderer(this);
		gun_r11.setRotationPoint(-0.4955F, -32.3235F, 14.8F);
		bone.addChild(gun_r11);
		setRotationAngle(gun_r11, 0.0F, 0.0F, 0.7854F);
		gun_r11.cubeList.add(new ModelBox(gun_r11, 398, 43, -0.5F, 0.0F, -2.5F, 1, 1, 1, 0.15F, false));
		gun_r11.cubeList.add(new ModelBox(gun_r11, 44, 398, -0.5F, 0.0F, -4.5F, 1, 1, 1, 0.15F, false));
		gun_r11.cubeList.add(new ModelBox(gun_r11, 20, 398, -0.5F, 0.0F, -30.5F, 1, 1, 1, 0.15F, false));
		gun_r11.cubeList.add(new ModelBox(gun_r11, 8, 398, -0.5F, 0.0F, -32.5F, 1, 1, 1, 0.15F, false));

		gun_r12 = new ModelRenderer(this);
		gun_r12.setRotationPoint(0.2117F, -31.7306F, 12.8F);
		bone.addChild(gun_r12);
		setRotationAngle(gun_r12, 0.0F, 0.0F, 0.7854F);
		gun_r12.cubeList.add(new ModelBox(gun_r12, 48, 398, -0.5F, 1.0F, -2.5F, 1, 1, 1, 0.15F, false));
		gun_r12.cubeList.add(new ModelBox(gun_r12, 52, 398, -0.5F, 1.0F, -0.5F, 1, 1, 1, 0.15F, false));
		gun_r12.cubeList.add(new ModelBox(gun_r12, 16, 398, -0.5F, 1.0F, -28.5F, 1, 1, 1, 0.15F, false));
		gun_r12.cubeList.add(new ModelBox(gun_r12, 0, 398, -0.5F, 1.0F, -30.5F, 1, 1, 1, 0.15F, false));

		gun_r13 = new ModelRenderer(this);
		gun_r13.setRotationPoint(-3.2097F, -27.0343F, -19.0F);
		bone.addChild(gun_r13);
		setRotationAngle(gun_r13, 0.0F, 0.0F, 0.7854F);
		gun_r13.cubeList.add(new ModelBox(gun_r13, 332, 383, -0.5F, -2.0F, -2.5F, 1, 1, 4, 0.15F, false));

		gun_r14 = new ModelRenderer(this);
		gun_r14.setRotationPoint(-0.4955F, -28.4485F, -19.0F);
		bone.addChild(gun_r14);
		setRotationAngle(gun_r14, 0.0F, 0.0F, 0.7854F);
		gun_r14.cubeList.add(new ModelBox(gun_r14, 342, 383, -0.5F, 0.0F, -2.5F, 1, 1, 4, 0.15F, false));

		gun_r15 = new ModelRenderer(this);
		gun_r15.setRotationPoint(-2.5025F, -26.4414F, -19.0F);
		bone.addChild(gun_r15);
		setRotationAngle(gun_r15, 0.0F, 0.0F, 0.7854F);
		gun_r15.cubeList.add(new ModelBox(gun_r15, 352, 383, -0.5F, -1.0F, -2.5F, 1, 1, 4, 0.15F, false));

		gun_r16 = new ModelRenderer(this);
		gun_r16.setRotationPoint(0.2117F, -27.8556F, -19.0F);
		bone.addChild(gun_r16);
		setRotationAngle(gun_r16, 0.0F, 0.0F, 0.7854F);
		gun_r16.cubeList.add(new ModelBox(gun_r16, 362, 383, -0.5F, 1.0F, -2.5F, 1, 1, 4, 0.15F, false));

		gun_r17 = new ModelRenderer(this);
		gun_r17.setRotationPoint(0.0617F, -28.0178F, -16.2F);
		bone.addChild(gun_r17);
		setRotationAngle(gun_r17, 0.0F, 0.0F, 0.7854F);
		gun_r17.cubeList.add(new ModelBox(gun_r17, 296, 388, -0.5F, 1.0F, -1.5F, 1, 1, 3, 0.0F, false));
		gun_r17.cubeList.add(new ModelBox(gun_r17, 186, 383, -0.5F, 1.0F, 2.5F, 1, 1, 4, 0.0F, false));
		gun_r17.cubeList.add(new ModelBox(gun_r17, 40, 383, -0.5F, 1.0F, 10.5F, 1, 1, 4, 0.0F, false));

		gun_r18 = new ModelRenderer(this);
		gun_r18.setRotationPoint(-2.3525F, -26.6036F, -16.2F);
		bone.addChild(gun_r18);
		setRotationAngle(gun_r18, 0.0F, 0.0F, 0.7854F);
		gun_r18.cubeList.add(new ModelBox(gun_r18, 318, 388, -0.5F, -1.0F, -1.5F, 1, 1, 3, 0.0F, false));
		gun_r18.cubeList.add(new ModelBox(gun_r18, 176, 383, -0.5F, -1.0F, 2.5F, 1, 1, 4, 0.0F, false));
		gun_r18.cubeList.add(new ModelBox(gun_r18, 50, 383, -0.5F, -1.0F, 10.5F, 1, 1, 4, 0.0F, false));

		gun_r19 = new ModelRenderer(this);
		gun_r19.setRotationPoint(-0.6454F, -28.3107F, -16.2F);
		bone.addChild(gun_r19);
		setRotationAngle(gun_r19, 0.0F, 0.0F, 0.7854F);
		gun_r19.cubeList.add(new ModelBox(gun_r19, 326, 388, -0.5F, 0.0F, -1.5F, 1, 1, 3, 0.0F, false));
		gun_r19.cubeList.add(new ModelBox(gun_r19, 132, 383, -0.5F, 0.0F, 2.5F, 1, 1, 4, 0.0F, false));
		gun_r19.cubeList.add(new ModelBox(gun_r19, 60, 383, -0.5F, 0.0F, 10.5F, 1, 1, 4, 0.0F, false));

		gun_r20 = new ModelRenderer(this);
		gun_r20.setRotationPoint(-3.0597F, -26.8964F, -16.2F);
		bone.addChild(gun_r20);
		setRotationAngle(gun_r20, 0.0F, 0.0F, 0.7854F);
		gun_r20.cubeList.add(new ModelBox(gun_r20, 334, 388, -0.5F, -2.0F, -1.5F, 1, 1, 3, 0.0F, false));
		gun_r20.cubeList.add(new ModelBox(gun_r20, 90, 383, -0.5F, -2.0F, 2.5F, 1, 1, 4, 0.0F, false));
		gun_r20.cubeList.add(new ModelBox(gun_r20, 70, 383, -0.5F, -2.0F, 10.5F, 1, 1, 4, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.5F, -8.3858F, -76.05F);
		barrel.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 366, 45, -1.999F, -26.125F, -14.5F, 1, 1, 7, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 384, 344, -1.999F, -25.375F, 0.3F, 1, 3, 3, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 130, 388, -2.7061F, -26.8321F, -10.5F, 1, 1, 3, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 176, 388, -1.2919F, -26.8321F, -10.5F, 1, 1, 3, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 184, 388, -1.999F, -27.5392F, -10.5F, 1, 1, 3, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 222, 382, -2.499F, -29.0392F, 27.75F, 2, 1, 4, 0.0F, false));

		gun_r21 = new ModelRenderer(this);
		gun_r21.setRotationPoint(-3.0597F, -25.7714F, -10.0F);
		bone2.addChild(gun_r21);
		setRotationAngle(gun_r21, 0.0F, 0.0F, 0.7854F);
		gun_r21.cubeList.add(new ModelBox(gun_r21, 260, 322, -0.5F, -2.0F, -4.5F, 1, 1, 17, 0.0F, false));

		gun_r22 = new ModelRenderer(this);
		gun_r22.setRotationPoint(-0.6454F, -27.1857F, -10.0F);
		bone2.addChild(gun_r22);
		setRotationAngle(gun_r22, 0.0F, 0.0F, 0.7854F);
		gun_r22.cubeList.add(new ModelBox(gun_r22, 318, 321, -0.5F, 0.0F, -4.5F, 1, 1, 17, 0.0F, false));

		gun_r23 = new ModelRenderer(this);
		gun_r23.setRotationPoint(-2.3525F, -25.4786F, -10.0F);
		bone2.addChild(gun_r23);
		setRotationAngle(gun_r23, 0.0F, 0.0F, 0.7854F);
		gun_r23.cubeList.add(new ModelBox(gun_r23, 200, 343, -0.5F, -1.0F, -1.5F, 1, 1, 14, 0.0F, false));

		gun_r24 = new ModelRenderer(this);
		gun_r24.setRotationPoint(0.0617F, -26.8928F, -10.0F);
		bone2.addChild(gun_r24);
		setRotationAngle(gun_r24, 0.0F, 0.0F, 0.7854F);
		gun_r24.cubeList.add(new ModelBox(gun_r24, 248, 340, -0.5F, 1.0F, -1.5F, 1, 1, 14, 0.0F, false));

		gun_r25 = new ModelRenderer(this);
		gun_r25.setRotationPoint(-1.499F, -26.3321F, 10.5037F);
		bone2.addChild(gun_r25);
		setRotationAngle(gun_r25, -0.0087F, 0.0F, -1.5708F);
		gun_r25.cubeList.add(new ModelBox(gun_r25, 86, 0, -0.5F, 0.3642F, -17.9925F, 1, 1, 38, 0.0F, false));

		gun_r26 = new ModelRenderer(this);
		gun_r26.setRotationPoint(-1.499F, -25.783F, 10.5055F);
		bone2.addChild(gun_r26);
		setRotationAngle(gun_r26, 0.0056F, -0.0067F, 2.4434F);
		gun_r26.cubeList.add(new ModelBox(gun_r26, 78, 162, -1.0766F, -0.8393F, -17.9942F, 1, 1, 38, 0.0F, false));

		gun_r27 = new ModelRenderer(this);
		gun_r27.setRotationPoint(-1.499F, -25.783F, 10.5055F);
		bone2.addChild(gun_r27);
		setRotationAngle(gun_r27, 0.0056F, 0.0067F, 2.2689F);
		gun_r27.cubeList.add(new ModelBox(gun_r27, 156, 162, -0.697F, -0.907F, -17.999F, 1, 1, 38, 0.0F, false));

		gun_r28 = new ModelRenderer(this);
		gun_r28.setRotationPoint(-1.499F, -25.783F, 10.5055F);
		bone2.addChild(gun_r28);
		setRotationAngle(gun_r28, 0.0056F, -0.0067F, -2.2689F);
		gun_r28.cubeList.add(new ModelBox(gun_r28, 164, 0, -0.303F, -0.907F, -17.999F, 1, 1, 38, 0.0F, false));

		gun_r29 = new ModelRenderer(this);
		gun_r29.setRotationPoint(-1.499F, -25.783F, 10.5055F);
		bone2.addChild(gun_r29);
		setRotationAngle(gun_r29, 0.0056F, 0.0067F, -2.4434F);
		gun_r29.cubeList.add(new ModelBox(gun_r29, 164, 39, 0.0766F, -0.8393F, -17.9942F, 1, 1, 38, 0.0F, false));

		gun_r30 = new ModelRenderer(this);
		gun_r30.setRotationPoint(-1.499F, -26.8812F, 10.5055F);
		bone2.addChild(gun_r30);
		setRotationAngle(gun_r30, 0.0056F, -0.0067F, 0.8726F);
		gun_r30.cubeList.add(new ModelBox(gun_r30, 156, 123, -0.303F, -0.907F, -17.999F, 1, 1, 38, 0.0F, false));

		gun_r31 = new ModelRenderer(this);
		gun_r31.setRotationPoint(-1.499F, -26.8812F, 10.5055F);
		bone2.addChild(gun_r31);
		setRotationAngle(gun_r31, 0.0056F, 0.0067F, 0.6982F);
		gun_r31.cubeList.add(new ModelBox(gun_r31, 0, 162, 0.0766F, -0.8393F, -17.9942F, 1, 1, 38, 0.0F, false));

		gun_r32 = new ModelRenderer(this);
		gun_r32.setRotationPoint(-1.499F, -26.8812F, 10.5055F);
		bone2.addChild(gun_r32);
		setRotationAngle(gun_r32, 0.0056F, -0.0067F, -0.6982F);
		gun_r32.cubeList.add(new ModelBox(gun_r32, 156, 84, -1.0766F, -0.8393F, -17.9942F, 1, 1, 38, 0.0F, false));

		gun_r33 = new ModelRenderer(this);
		gun_r33.setRotationPoint(-1.499F, -26.3321F, 10.5037F);
		bone2.addChild(gun_r33);
		setRotationAngle(gun_r33, 0.0087F, 0.0F, -1.5708F);
		gun_r33.cubeList.add(new ModelBox(gun_r33, 0, 123, -0.5F, -1.3642F, -17.9925F, 1, 1, 38, 0.0F, false));

		gun_r34 = new ModelRenderer(this);
		gun_r34.setRotationPoint(-1.499F, -26.3321F, 2.5018F);
		bone2.addChild(gun_r34);
		setRotationAngle(gun_r34, 0.0F, 0.0F, -1.5708F);
		gun_r34.cubeList.add(new ModelBox(gun_r34, 80, 383, -0.5F, 0.2071F, -10.0018F, 1, 1, 4, 0.0F, false));

		gun_r35 = new ModelRenderer(this);
		gun_r35.setRotationPoint(-1.499F, -26.3321F, 10.5037F);
		bone2.addChild(gun_r35);
		setRotationAngle(gun_r35, -0.0087F, 0.0F, 0.0F);
		gun_r35.cubeList.add(new ModelBox(gun_r35, 78, 84, -0.5F, 0.3642F, -17.9925F, 1, 1, 38, 0.0F, false));

		gun_r36 = new ModelRenderer(this);
		gun_r36.setRotationPoint(-1.499F, -26.8812F, 10.5055F);
		bone2.addChild(gun_r36);
		setRotationAngle(gun_r36, 0.0056F, 0.0067F, -0.8726F);
		gun_r36.cubeList.add(new ModelBox(gun_r36, 78, 123, -0.697F, -0.907F, -17.999F, 1, 1, 38, 0.0F, false));

		gun_r37 = new ModelRenderer(this);
		gun_r37.setRotationPoint(-1.499F, -26.3321F, 10.5037F);
		bone2.addChild(gun_r37);
		setRotationAngle(gun_r37, 0.0087F, 0.0F, 0.0F);
		gun_r37.cubeList.add(new ModelBox(gun_r37, 0, 84, -0.5F, -1.3642F, -17.9925F, 1, 1, 38, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		barrel.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}