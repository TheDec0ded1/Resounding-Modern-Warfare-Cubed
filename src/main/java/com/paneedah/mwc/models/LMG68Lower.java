package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class LMG68Lower extends ModelBase {
	private final ModelRenderer lower;
	private final ModelRenderer gun_r1;
	private final ModelRenderer gun_r2;
	private final ModelRenderer gun_r3;
	private final ModelRenderer gun_r4;
	private final ModelRenderer gun_r5;
	private final ModelRenderer gun_r6;
	private final ModelRenderer gun_r7;
	private final ModelRenderer gun_r8;
	private final ModelRenderer gun_r9;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
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
	private final ModelRenderer gun_r21;
	private final ModelRenderer gun_r22;
	private final ModelRenderer gun_r23;
	private final ModelRenderer gun_r24;
	private final ModelRenderer gun39_r1;
	private final ModelRenderer gun38_r1;
	private final ModelRenderer gun63_r1;
	private final ModelRenderer gun63_r2_r1;
	private final ModelRenderer gun63_r1_r1;
	private final ModelRenderer gun152_r1;
	private final ModelRenderer gun156_r1;
	private final ModelRenderer gun67;

	public LMG68Lower() {
		textureWidth = 416;
		textureHeight = 416;

		lower = new ModelRenderer(this);
		lower.setRotationPoint(0.0F, 24.0F, 0.0F);
		lower.cubeList.add(new ModelBox(lower, 318, 21, -3.0F, -33.35F, -1.0F, 3, 1, 3, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 40, 377, -3.301F, -36.0F, -1.001F, 3, 3, 3, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 384, 30, -0.699F, -36.0F, -0.998F, 1, 3, 3, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 354, 321, -3.299F, -36.75F, -9.001F, 3, 1, 11, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 358, 287, -0.701F, -36.75F, -8.998F, 1, 1, 11, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 318, 301, -3.3F, -35.75F, -16.8F, 3, 4, 16, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 146, 260, -0.7F, -35.75F, -16.8F, 1, 4, 16, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 150, 367, -3.05F, -43.225F, 1.0F, 2, 7, 4, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 182, 366, -1.95F, -43.225F, 1.0F, 2, 7, 4, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 262, 377, -0.7F, -35.75F, -18.8F, 1, 3, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 382, 324, -3.3F, -35.75F, -18.8F, 3, 3, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 274, 255, -0.699F, -35.75F, -20.525F, 1, 2, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 334, 17, -3.301F, -35.75F, -20.525F, 3, 2, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 394, 381, -0.701F, -34.15F, -19.525F, 1, 1, 1, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 390, 224, -3.299F, -34.15F, -19.525F, 3, 1, 1, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 390, 226, -3.3F, -35.0429F, -21.2321F, 3, 1, 1, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 166, 395, -0.7F, -35.0429F, -21.2321F, 1, 1, 1, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 392, 306, -3.75F, -34.5202F, -21.6886F, 2, 1, 1, -0.45F, false));
		lower.cubeList.add(new ModelBox(lower, 306, 253, -3.25F, -34.5202F, -21.6886F, 4, 1, 1, -0.45F, false));
		lower.cubeList.add(new ModelBox(lower, 206, 385, -0.701F, -33.3F, -17.8F, 1, 1, 1, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 378, 375, -3.299F, -33.3F, -17.8F, 3, 1, 1, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 52, 377, -0.7F, -31.75F, -6.0F, 1, 1, 5, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 348, 121, -3.3F, -31.75F, -6.0F, 3, 1, 5, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 374, 319, -3.3F, -32.15F, -16.0F, 3, 1, 1, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 196, 383, -0.7F, -32.15F, -16.0F, 1, 1, 1, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 84, 318, -2.499F, -32.1F, -7.7F, 2, 6, 2, -0.075F, false));
		lower.cubeList.add(new ModelBox(lower, 376, 220, -2.5F, -27.1F, -12.55F, 2, 1, 5, -0.075F, false));
		lower.cubeList.add(new ModelBox(lower, 118, 392, -2.498F, -32.025F, -14.625F, 2, 2, 1, -0.075F, false));
		lower.cubeList.add(new ModelBox(lower, 392, 304, -2.5F, -31.9F, -14.8F, 2, 1, 1, -0.075F, false));
		lower.cubeList.add(new ModelBox(lower, 380, 209, -3.6934F, -38.6912F, 2.9F, 4, 3, 2, -0.1F, false));
		lower.cubeList.add(new ModelBox(lower, 304, 388, -0.0934F, -38.6912F, 2.9F, 1, 3, 2, -0.1F, false));
		lower.cubeList.add(new ModelBox(lower, 348, 176, -0.0433F, -38.7412F, -9.15F, 1, 1, 13, -0.15F, false));
		lower.cubeList.add(new ModelBox(lower, 348, 228, -0.0433F, -37.1412F, -9.15F, 1, 1, 13, -0.15F, false));
		lower.cubeList.add(new ModelBox(lower, 50, 257, -3.1173F, -36.426F, 2.8F, 3, 1, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 392, 126, -0.6694F, -36.426F, 2.8F, 1, 1, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 364, 97, -2.4933F, -32.1412F, -15.0F, 2, 1, 8, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 326, 287, -3.6934F, -38.2912F, -9.0F, 4, 2, 12, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 82, 355, -3.4933F, -38.7662F, -9.0F, 1, 1, 12, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 130, 392, -3.9893F, -40.5151F, -0.001F, 1, 1, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 150, 392, 0.0209F, -40.5313F, 0.0F, 1, 1, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 84, 398, -4.014F, -40.4901F, -0.851F, 1, 1, 1, -0.025F, false));
		lower.cubeList.add(new ModelBox(lower, 194, 395, 0.045F, -40.5063F, -0.85F, 1, 1, 1, -0.025F, false));
		lower.cubeList.add(new ModelBox(lower, 182, 395, -3.989F, -40.9151F, 0.099F, 1, 1, 1, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 178, 395, 0.02F, -40.9313F, 0.1F, 1, 1, 1, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 190, 395, -3.9893F, -41.515F, 0.9898F, 1, 1, 1, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 186, 395, 0.0209F, -41.515F, 0.9908F, 1, 1, 1, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 156, 392, -4.3143F, -40.1901F, -2.326F, 1, 1, 2, -0.325F, false));
		lower.cubeList.add(new ModelBox(lower, 392, 165, 0.3459F, -40.2063F, -2.325F, 1, 1, 2, -0.325F, false));
		lower.cubeList.add(new ModelBox(lower, 218, 395, 0.3459F, -40.5563F, -1.5F, 1, 1, 1, -0.325F, false));
		lower.cubeList.add(new ModelBox(lower, 252, 368, -4.3143F, -40.5401F, -1.501F, 1, 1, 1, -0.325F, false));
		lower.cubeList.add(new ModelBox(lower, 222, 395, 0.345F, -41.3563F, 0.5F, 1, 1, 1, -0.325F, false));
		lower.cubeList.add(new ModelBox(lower, 378, 299, -4.314F, -41.3401F, 0.499F, 1, 1, 1, -0.325F, false));

		gun_r1 = new ModelRenderer(this);
		gun_r1.setRotationPoint(0.0496F, -38.9587F, -6.75F);
		lower.addChild(gun_r1);
		setRotationAngle(gun_r1, 0.0F, 0.0F, 0.5672F);
		gun_r1.cubeList.add(new ModelBox(gun_r1, 382, 293, -0.4884F, -1.0048F, 4.75F, 1, 2, 4, 0.0F, false));

		gun_r2 = new ModelRenderer(this);
		gun_r2.setRotationPoint(-3.0303F, -38.9403F, 5.999F);
		lower.addChild(gun_r2);
		setRotationAngle(gun_r2, 0.0F, 0.0F, -0.5672F);
		gun_r2.cubeList.add(new ModelBox(gun_r2, 382, 287, -0.5F, -1.0F, -8.0F, 1, 2, 4, 0.0F, false));

		gun_r3 = new ModelRenderer(this);
		gun_r3.setRotationPoint(0.0824F, -36.2912F, -2.7F);
		lower.addChild(gun_r3);
		setRotationAngle(gun_r3, 0.0F, 0.0F, 0.7854F);
		gun_r3.cubeList.add(new ModelBox(gun_r3, 166, 352, -0.5F, -0.5F, -6.5F, 1, 1, 13, -0.2F, false));

		gun_r4 = new ModelRenderer(this);
		gun_r4.setRotationPoint(-1.6967F, -40.2451F, -0.8368F);
		lower.addChild(gun_r4);
		setRotationAngle(gun_r4, -1.0908F, 0.0F, 0.0F);
		gun_r4.cubeList.add(new ModelBox(gun_r4, 276, 296, -2.5933F, -2.4919F, -0.5005F, 1, 4, 1, -0.3F, false));

		gun_r5 = new ModelRenderer(this);
		gun_r5.setRotationPoint(-1.2717F, -40.2547F, -0.8507F);
		lower.addChild(gun_r5);
		setRotationAngle(gun_r5, -1.0908F, 0.0F, 0.0F);
		gun_r5.cubeList.add(new ModelBox(gun_r5, 42, 301, 1.5927F, -2.5081F, -0.4995F, 1, 4, 1, -0.3F, false));

		gun_r6 = new ModelRenderer(this);
		gun_r6.setRotationPoint(0.0482F, -42.0956F, -3.0046F);
		lower.addChild(gun_r6);
		setRotationAngle(gun_r6, 0.0F, 0.0F, -0.5672F);
		gun_r6.cubeList.add(new ModelBox(gun_r6, 394, 352, -0.4916F, -0.9877F, 3.9954F, 1, 2, 1, 0.0F, false));

		gun_r7 = new ModelRenderer(this);
		gun_r7.setRotationPoint(-3.0179F, -42.0876F, -4.2556F);
		lower.addChild(gun_r7);
		setRotationAngle(gun_r7, 0.0F, 0.0F, 0.5672F);
		gun_r7.cubeList.add(new ModelBox(gun_r7, 354, 394, -0.5115F, -0.9952F, 5.2454F, 1, 2, 1, 0.0F, false));

		gun_r8 = new ModelRenderer(this);
		gun_r8.setRotationPoint(-3.0303F, -40.515F, 2.5646F);
		lower.addChild(gun_r8);
		setRotationAngle(gun_r8, 0.0F, 0.5672F, 0.0F);
		gun_r8.cubeList.add(new ModelBox(gun_r8, 288, 377, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

		gun_r9 = new ModelRenderer(this);
		gun_r9.setRotationPoint(0.0619F, -40.515F, 2.5656F);
		lower.addChild(gun_r9);
		setRotationAngle(gun_r9, 0.0F, -0.5672F, 0.0F);
		gun_r9.cubeList.add(new ModelBox(gun_r9, 390, 228, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-3.0804F, -35.1456F, -6.0F);
		lower.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.9163F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 392, 123, 0.0F, -1.0F, 9.0F, 1, 1, 2, -0.2F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-0.315F, -35.9389F, -6.0F);
		lower.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.9163F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 124, 392, 0.0F, -1.0F, 9.0F, 1, 1, 2, -0.2F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-2.5067F, -31.1412F, -13.0F);
		lower.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.9163F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 286, 171, 0.0F, -1.0F, -2.0F, 1, 1, 9, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-1.1021F, -31.9346F, -13.0F);
		lower.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.9163F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 182, 248, 0.0F, -1.0F, -2.0F, 1, 1, 9, 0.0F, false));

		gun_r10 = new ModelRenderer(this);
		gun_r10.setRotationPoint(-2.4741F, -28.6F, -6.6083F);
		lower.addChild(gun_r10);
		setRotationAngle(gun_r10, 0.0F, -0.48F, 0.0F);
		gun_r10.cubeList.add(new ModelBox(gun_r10, 384, 97, -0.5F, -3.5F, -1.0F, 1, 6, 2, -0.075F, false));

		gun_r11 = new ModelRenderer(this);
		gun_r11.setRotationPoint(-0.5239F, -28.6F, -6.6083F);
		lower.addChild(gun_r11);
		setRotationAngle(gun_r11, 0.0F, 0.48F, 0.0F);
		gun_r11.cubeList.add(new ModelBox(gun_r11, 384, 36, -0.5F, -3.5F, -1.0F, 1, 6, 2, -0.075F, false));

		gun_r12 = new ModelRenderer(this);
		gun_r12.setRotationPoint(0.1022F, -38.5296F, 0.8F);
		lower.addChild(gun_r12);
		setRotationAngle(gun_r12, 0.0F, 0.0F, -0.8727F);
		gun_r12.cubeList.add(new ModelBox(gun_r12, 382, 299, -0.5F, -1.5F, 0.0F, 1, 2, 4, 0.0F, false));

		gun_r13 = new ModelRenderer(this);
		gun_r13.setRotationPoint(0.3234F, -38.6984F, -2.15F);
		lower.addChild(gun_r13);
		setRotationAngle(gun_r13, 0.0F, 0.0F, -0.5672F);
		gun_r13.cubeList.add(new ModelBox(gun_r13, 360, 345, -0.5F, -0.5F, -7.0F, 1, 1, 11, -0.15F, false));

		gun_r14 = new ModelRenderer(this);
		gun_r14.setRotationPoint(-1.499F, -29.5044F, -14.3967F);
		lower.addChild(gun_r14);
		setRotationAngle(gun_r14, -1.1781F, 0.0F, 0.0F);
		gun_r14.cubeList.add(new ModelBox(gun_r14, 376, 226, -1.0F, -0.5F, -2.5F, 2, 1, 5, -0.075F, false));

		gun_r15 = new ModelRenderer(this);
		gun_r15.setRotationPoint(-1.499F, -28.5155F, -14.6745F);
		lower.addChild(gun_r15);
		setRotationAngle(gun_r15, -0.7854F, 0.0F, 0.0F);
		gun_r15.cubeList.add(new ModelBox(gun_r15, 282, 76, -1.001F, -0.5F, 1.5F, 2, 1, 1, -0.075F, false));

		gun_r16 = new ModelRenderer(this);
		gun_r16.setRotationPoint(-1.499F, -33.2794F, -13.3941F);
		lower.addChild(gun_r16);
		setRotationAngle(gun_r16, -1.1781F, 0.0F, 0.0F);
		gun_r16.cubeList.add(new ModelBox(gun_r16, 392, 302, -1.001F, -0.5F, 1.5F, 2, 1, 1, -0.075F, false));

		gun_r17 = new ModelRenderer(this);
		gun_r17.setRotationPoint(-1.499F, -32.4748F, -14.5982F);
		lower.addChild(gun_r17);
		setRotationAngle(gun_r17, -0.7854F, 0.0F, 0.0F);
		gun_r17.cubeList.add(new ModelBox(gun_r17, 176, 375, -1.0F, -0.5F, 1.5F, 2, 1, 1, -0.075F, false));

		gun_r18 = new ModelRenderer(this);
		gun_r18.setRotationPoint(-1.499F, -31.2707F, -15.4028F);
		lower.addChild(gun_r18);
		setRotationAngle(gun_r18, -0.3927F, 0.0F, 0.0F);
		gun_r18.cubeList.add(new ModelBox(gun_r18, 392, 117, -1.001F, -0.5F, 1.5F, 2, 2, 1, -0.075F, false));

		gun_r19 = new ModelRenderer(this);
		gun_r19.setRotationPoint(-1.499F, -27.4957F, -14.5528F);
		lower.addChild(gun_r19);
		setRotationAngle(gun_r19, -0.3927F, 0.0F, 0.0F);
		gun_r19.cubeList.add(new ModelBox(gun_r19, 218, 82, -1.0F, -0.5F, 1.5F, 2, 1, 1, -0.075F, false));

		gun_r20 = new ModelRenderer(this);
		gun_r20.setRotationPoint(-1.0F, -32.0258F, -16.695F);
		lower.addChild(gun_r20);
		setRotationAngle(gun_r20, -0.4363F, 0.0F, 0.0F);
		gun_r20.cubeList.add(new ModelBox(gun_r20, 294, 375, -2.302F, -0.5F, -4.0F, 3, 1, 5, 0.0F, false));
		gun_r20.cubeList.add(new ModelBox(gun_r20, 382, 196, 0.302F, -0.5F, -4.0F, 1, 1, 5, 0.0F, false));

		gun_r21 = new ModelRenderer(this);
		gun_r21.setRotationPoint(-1.0F, -33.9702F, -20.5315F);
		lower.addChild(gun_r21);
		setRotationAngle(gun_r21, 0.7854F, 0.0F, 0.0F);
		gun_r21.cubeList.add(new ModelBox(gun_r21, 138, 388, 0.299F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
		gun_r21.cubeList.add(new ModelBox(gun_r21, 390, 188, -2.299F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));

		gun_r22 = new ModelRenderer(this);
		gun_r22.setRotationPoint(-1.0F, -35.0429F, -20.525F);
		lower.addChild(gun_r22);
		setRotationAngle(gun_r22, 0.7854F, 0.0F, 0.0F);
		gun_r22.cubeList.add(new ModelBox(gun_r22, 390, 186, -2.299F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));
		gun_r22.cubeList.add(new ModelBox(gun_r22, 318, 386, 0.299F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		gun_r23 = new ModelRenderer(this);
		gun_r23.setRotationPoint(-1.0F, -35.1041F, 1.7239F);
		lower.addChild(gun_r23);
		setRotationAngle(gun_r23, -0.6545F, 0.0F, 0.0F);
		gun_r23.cubeList.add(new ModelBox(gun_r23, 210, 370, -2.3F, -2.5F, -0.5015F, 3, 4, 2, 0.0F, false));
		gun_r23.cubeList.add(new ModelBox(gun_r23, 324, 100, 0.3F, -2.5F, -0.4985F, 1, 4, 2, 0.0F, false));

		gun_r24 = new ModelRenderer(this);
		gun_r24.setRotationPoint(-1.5F, -33.8444F, 2.5165F);
		lower.addChild(gun_r24);
		setRotationAngle(gun_r24, 0.9163F, 0.0F, 0.0F);
		gun_r24.cubeList.add(new ModelBox(gun_r24, 376, 237, -1.5F, -0.5F, -1.5F, 3, 1, 4, 0.0F, false));

		gun39_r1 = new ModelRenderer(this);
		gun39_r1.setRotationPoint(0.5F, -33.7F, -11.3F);
		lower.addChild(gun39_r1);
		setRotationAngle(gun39_r1, -0.3665F, 0.0F, 0.0F);
		gun39_r1.cubeList.add(new ModelBox(gun39_r1, 242, 76, -4.0F, -1.2334F, -0.0896F, 4, 1, 1, -0.1F, false));
		gun39_r1.cubeList.add(new ModelBox(gun39_r1, 272, 76, -4.0F, 0.2556F, -6.4804F, 4, 1, 1, -0.1F, false));

		gun38_r1 = new ModelRenderer(this);
		gun38_r1.setRotationPoint(0.5F, -32.7F, -7.6F);
		lower.addChild(gun38_r1);
		setRotationAngle(gun38_r1, -0.3665F, 0.0F, 0.0F);
		gun38_r1.cubeList.add(new ModelBox(gun38_r1, 252, 76, -4.0F, 0.4018F, -2.6753F, 4, 1, 1, -0.1F, false));
		gun38_r1.cubeList.add(new ModelBox(gun38_r1, 170, 395, -0.9F, 3.0998F, -7.6113F, 1, 1, 1, -0.25F, false));
		gun38_r1.cubeList.add(new ModelBox(gun38_r1, 174, 395, -4.1F, 3.0998F, -7.6113F, 1, 1, 1, -0.25F, false));

		gun63_r1 = new ModelRenderer(this);
		gun63_r1.setRotationPoint(-2.0F, -30.2F, -8.95F);
		lower.addChild(gun63_r1);
		setRotationAngle(gun63_r1, -0.409F, 0.0F, 0.0F);
		

		gun63_r2_r1 = new ModelRenderer(this);
		gun63_r2_r1.setRotationPoint(0.5F, -0.1205F, -0.1869F);
		gun63_r1.addChild(gun63_r2_r1);
		setRotationAngle(gun63_r2_r1, 0.1745F, 0.0F, 0.0F);
		gun63_r2_r1.cubeList.add(new ModelBox(gun63_r2_r1, 350, 394, -0.5F, 0.9403F, -0.4502F, 1, 2, 1, 0.0F, false));

		gun63_r1_r1 = new ModelRenderer(this);
		gun63_r1_r1.setRotationPoint(0.5F, 0.7954F, -1.335F);
		gun63_r1.addChild(gun63_r1_r1);
		setRotationAngle(gun63_r1_r1, 0.6545F, 0.0F, 0.0F);
		gun63_r1_r1.cubeList.add(new ModelBox(gun63_r1_r1, 46, 279, -0.5F, -2.9398F, 0.5219F, 1, 4, 1, 0.0F, false));

		gun152_r1 = new ModelRenderer(this);
		gun152_r1.setRotationPoint(-0.7F, -33.5F, -4.7F);
		lower.addChild(gun152_r1);
		setRotationAngle(gun152_r1, 0.7854F, 0.0F, 0.0F);
		gun152_r1.cubeList.add(new ModelBox(gun152_r1, 262, 76, -2.8F, -0.5303F, 0.5303F, 4, 1, 1, 0.0F, false));
		gun152_r1.cubeList.add(new ModelBox(gun152_r1, 292, 21, -3.3F, -12.4804F, -11.0055F, 5, 2, 2, -0.3F, false));

		gun156_r1 = new ModelRenderer(this);
		gun156_r1.setRotationPoint(0.6F, -33.4F, -4.5F);
		lower.addChild(gun156_r1);
		setRotationAngle(gun156_r1, -1.5708F, 0.0F, 0.0F);
		gun156_r1.cubeList.add(new ModelBox(gun156_r1, 270, 319, -1.0F, -1.0F, -0.75F, 1, 1, 2, 0.0F, false));
		gun156_r1.cubeList.add(new ModelBox(gun156_r1, 392, 120, -4.2F, -1.0F, -0.75F, 1, 1, 2, 0.0F, false));

		gun67 = new ModelRenderer(this);
		gun67.setRotationPoint(-3.3F, -33.5F, 1.5F);
		lower.addChild(gun67);
		setRotationAngle(gun67, -2.3423F, 0.0F, 0.0F);
		gun67.cubeList.add(new ModelBox(gun67, 210, 376, 0.001F, 0.0638F, -0.4959F, 3, 2, 4, 0.0F, false));
		gun67.cubeList.add(new ModelBox(gun67, 376, 214, 0.599F, 0.0638F, -0.4959F, 3, 2, 4, 0.0F, false));
		gun67.cubeList.add(new ModelBox(gun67, 224, 376, 0.299F, -0.7242F, 0.51F, 3, 2, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		lower.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}