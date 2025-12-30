package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBB95 extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer barrelandreciever;
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
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer frontsight;
	private final ModelRenderer cube_r30;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;
	private final ModelRenderer cube_r34;
	private final ModelRenderer cube_r35;
	private final ModelRenderer cube_r36;
	private final ModelRenderer irons;
	private final ModelRenderer cube_r189;
	private final ModelRenderer cube_r190;
	private final ModelRenderer cube_r191;
	private final ModelRenderer cube_r192;
	private final ModelRenderer cube_r193;
	private final ModelRenderer cube_r194;

	public QBB95() {
		textureWidth = 480;
		textureHeight = 480;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		barrelandreciever = new ModelRenderer(this);
		barrelandreciever.setRotationPoint(0.0F, 0.0F, 0.0F);
		gun.addChild(barrelandreciever);
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 0, 0, -2.0F, -35.0F, -59.4F, 1, 1, 72, -0.1F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 147, 222, -2.0F, -36.1314F, -59.4F, 1, 1, 72, -0.1F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 147, 74, -2.5657F, -35.5657F, -59.4F, 1, 1, 72, -0.1F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 0, 148, -1.4343F, -35.5657F, -59.4F, 1, 1, 72, -0.1F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 459, 425, -2.0F, -36.2564F, -61.2F, 1, 1, 2, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 459, 417, -1.2929F, -35.5493F, -61.2F, 1, 1, 2, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 416, 459, -2.7071F, -35.5493F, -61.2F, 1, 1, 2, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 409, 459, -2.0F, -34.8422F, -61.2F, 1, 1, 2, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 462, 44, -2.0F, -34.8422F, -65.8F, 1, 1, 1, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 462, 30, -2.7071F, -35.5493F, -65.8F, 1, 1, 1, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 462, 27, -1.2929F, -35.5493F, -65.8F, 1, 1, 1, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 461, 393, -2.0F, -36.2564F, -65.8F, 1, 1, 1, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 163, 443, -2.0F, -37.3828F, -33.4F, 1, 1, 6, -0.2F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 380, 442, -2.4243F, -37.8071F, -33.4F, 1, 1, 6, -0.2F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 365, 442, -1.5757F, -37.8071F, -33.4F, 1, 1, 6, -0.2F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 249, 431, -2.0007F, -37.8071F, -28.4F, 1, 1, 10, -0.2F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 389, 23, -2.0007F, -38.5071F, -19.4F, 1, 1, 21, -0.2F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 293, 442, -2.0F, -38.2314F, -33.4F, 1, 1, 6, -0.2F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 446, 424, -3.7F, -34.7F, 11.7F, 5, 4, 1, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 453, 34, -4.3F, -34.7F, 11.7F, 2, 4, 1, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 398, 324, -3.7F, -31.7F, 12.1F, 5, 1, 2, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 453, 48, -4.3F, -31.7F, 12.1F, 2, 1, 2, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 427, 354, 0.3F, -31.5343F, 13.5F, 1, 1, 11, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 424, 237, -4.3F, -31.5343F, 13.5F, 1, 1, 11, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 228, 382, -3.7F, -31.7F, 23.9F, 5, 1, 8, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 160, 412, -4.3F, -31.7F, 23.9F, 2, 1, 15, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 382, 414, -3.0F, -32.0F, 28.0F, 3, 1, 13, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 434, 49, -3.5F, -31.0F, 36.0F, 4, 3, 5, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 446, 417, -2.634F, -28.5F, 36.0F, 1, 1, 5, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 431, 347, -2.366F, -28.5F, 36.0F, 2, 1, 5, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 189, 450, -3.8F, -35.0F, 12.0F, 1, 4, 3, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 160, 394, -3.7F, -33.7F, 15.0F, 1, 2, 8, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 0, 394, -3.8F, -35.0F, 23.0F, 1, 4, 18, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 207, 432, -3.8F, -32.0F, 15.0F, 1, 1, 8, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 434, 0, -3.8F, -34.5F, 15.0F, 1, 1, 8, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 198, 450, -0.2F, -35.0F, 12.0F, 1, 4, 3, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 261, 450, -0.2F, -35.1F, 9.0F, 1, 4, 3, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 207, 450, -3.8F, -35.1F, 9.0F, 1, 4, 3, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 434, 20, -0.2F, -32.0F, 15.0F, 1, 1, 8, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 434, 10, -0.2F, -34.5F, 15.0F, 1, 1, 8, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 140, 415, -0.3F, -33.7F, 15.0F, 1, 2, 8, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 39, 394, -0.2F, -35.0F, 23.0F, 1, 4, 18, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 256, 330, -4.0F, -35.0F, 11.0F, 1, 1, 30, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 389, 0, 0.0F, -35.0F, 11.0F, 1, 1, 21, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 437, 296, 0.0F, -35.0F, 35.0F, 1, 1, 6, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 453, 58, 0.0F, -34.0F, 39.0F, 1, 3, 2, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 453, 52, -4.0F, -34.0F, 39.0F, 1, 3, 2, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 450, 397, 0.0F, -34.0F, 36.3F, 1, 3, 3, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 444, 459, -4.0F, -34.0F, 38.3F, 1, 3, 1, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 127, 431, -3.0F, -45.7F, 8.4F, 3, 13, 3, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 424, 211, -2.5F, -46.1F, -2.0F, 2, 1, 11, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 449, 193, -3.0F, -46.1F, 6.0F, 3, 1, 3, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 226, 416, -3.0F, -45.7F, -3.0F, 3, 1, 12, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 449, 224, -3.0F, -46.1F, 2.0F, 3, 1, 3, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 449, 229, -3.0F, -46.1F, -2.0F, 3, 1, 3, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 153, 444, -2.5F, -40.0F, -35.0F, 2, 6, 2, -0.1F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 270, 450, -2.5F, -39.0F, -19.1F, 2, 5, 2, -0.1F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 253, 458, 0.0F, -33.1071F, 32.6071F, 1, 1, 2, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 461, 375, 0.0F, -33.8142F, 32.9F, 1, 1, 1, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 461, 378, 0.0F, -33.1071F, 32.1929F, 1, 1, 1, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 461, 384, 0.0F, -32.4F, 32.9F, 1, 1, 1, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 120, 454, 0.1F, -33.6F, 38.4F, 1, 2, 2, 0.1F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 461, 320, -4.1F, -32.7F, 39.6F, 1, 1, 1, 0.1F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -32.8849F, 35.1021F);
		barrelandreciever.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.7854F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 461, 381, 0.0F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -32.8849F, 34.1021F);
		barrelandreciever.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.7854F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 380, 461, 0.0F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -33.8849F, 34.1021F);
		barrelandreciever.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.7854F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 315, 461, 0.0F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -33.8849F, 35.1021F);
		barrelandreciever.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.7854F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 461, 314, 0.0F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.925F, -32.6071F, 33.7071F);
		barrelandreciever.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, -0.1745F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 451, 258, -0.5F, -0.5F, -2.0F, 1, 1, 3, -0.3F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, -29.5F, 23.5F);
		barrelandreciever.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.2618F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 134, 460, -2.5F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 453, 90, -3.0F, -2.0F, 0.0F, 3, 2, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.525F, -34.6904F, 35.1531F);
		barrelandreciever.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.5672F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 5, 461, 1.5F, -1.5F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-1.525F, -34.6904F, 31.8469F);
		barrelandreciever.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.5672F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 461, 1.5F, -1.5F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-2.0F, -30.7397F, 36.0311F);
		barrelandreciever.addChild(cube_r9);
		setRotationAngle(cube_r9, 1.3526F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 451, 86, -1.5F, -3.4F, -0.5F, 4, 2, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-2.0F, -30.0957F, 35.9524F);
		barrelandreciever.addChild(cube_r10);
		setRotationAngle(cube_r10, 1.0036F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 451, 263, -1.5F, -1.8F, -0.5F, 4, 1, 1, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-2.0F, -29.7729F, 35.8328F);
		barrelandreciever.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.7854F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 449, 183, -1.5F, -1.5F, -0.5F, 4, 2, 2, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-2.0F, -29.6501F, 35.8221F);
		barrelandreciever.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.6109F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 451, 82, -1.5F, -0.5F, -0.5F, 4, 2, 1, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-2.0F, -28.6272F, 36.3265F);
		barrelandreciever.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.3054F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 451, 221, -1.5F, -0.5F, -0.5F, 4, 1, 1, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-2.817F, -28.183F, 37.5F);
		barrelandreciever.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -1.0472F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 446, 410, -0.5F, -0.5F, -1.5F, 1, 1, 5, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-0.183F, -28.183F, 37.5F);
		barrelandreciever.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, 1.0472F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 446, 347, -0.5F, -0.5F, -1.5F, 1, 1, 5, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-1.5F, -31.1172F, 24.2F);
		barrelandreciever.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.7854F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 208, 412, -2.2F, -0.5F, -0.5F, 5, 1, 1, -0.3F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 127, 460, -2.8F, -0.5F, -0.5F, 2, 1, 1, -0.3F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-1.5F, -31.1172F, 13.8F);
		barrelandreciever.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.7854F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 195, 412, -2.2F, -0.5F, -0.5F, 5, 1, 1, -0.3F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 101, 460, -2.8F, -0.5F, -0.5F, 2, 1, 1, -0.3F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-0.4929F, -37.6071F, -35.4F);
		barrelandreciever.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, -0.7854F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 308, 442, -1.0F, -1.0F, 2.0F, 1, 1, 6, -0.2F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-1.8828F, -37.69F, -33.1F);
		barrelandreciever.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, -0.7854F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 350, 442, -0.5F, -0.3828F, -0.3F, 1, 1, 6, -0.2F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-0.4929F, -37.0071F, -35.4F);
		barrelandreciever.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, -0.7854F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 443, -1.0F, -1.0F, 2.0F, 1, 1, 6, -0.2F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-1.0929F, -37.0071F, -35.4F);
		barrelandreciever.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, -0.7854F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 15, 443, -1.0F, -1.0F, 2.0F, 1, 1, 6, -0.2F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-0.2929F, -34.5493F, -106.0F);
		barrelandreciever.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, -0.7854F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 301, 450, -1.0F, -1.0F, 41.0F, 1, 1, 4, 0.0F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 462, 38, -1.0F, -1.0F, 40.2F, 1, 1, 1, 0.0F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 459, 413, -1.0F, -1.0F, 44.8F, 1, 1, 2, 0.0F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-0.2929F, -35.5493F, -106.0F);
		barrelandreciever.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, -0.7854F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 312, 450, -1.0F, -1.0F, 41.0F, 1, 1, 4, 0.0F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 461, 404, -1.0F, -1.0F, 40.2F, 1, 1, 1, 0.0F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 423, 459, -1.0F, -1.0F, 44.8F, 1, 1, 2, 0.0F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-1.2929F, -35.5493F, -106.0F);
		barrelandreciever.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, -0.7854F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 334, 450, -1.0F, -1.0F, 41.0F, 1, 1, 4, 0.0F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 462, 24, -1.0F, -1.0F, 40.2F, 1, 1, 1, 0.0F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 459, 421, -1.0F, -1.0F, 44.8F, 1, 1, 2, 0.0F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-1.2929F, -34.5493F, -106.0F);
		barrelandreciever.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.0F, -0.7854F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 345, 450, -1.0F, -1.0F, 41.0F, 1, 1, 4, 0.0F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 462, 41, -1.0F, -1.0F, 40.2F, 1, 1, 1, 0.0F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 459, 409, -1.0F, -1.0F, 44.8F, 1, 1, 2, 0.0F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-1.1929F, -35.4657F, -32.4F);
		barrelandreciever.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, -0.7854F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 147, 148, -1.0F, -1.0F, -27.0F, 1, 1, 72, -0.1F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(-0.3929F, -35.4657F, -32.4F);
		barrelandreciever.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, 0.0F, -0.7854F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 222, -1.0F, -1.0F, -27.0F, 1, 1, 72, -0.1F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-0.3929F, -34.6657F, -32.4F);
		barrelandreciever.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, 0.0F, -0.7854F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 147, 0, -1.0F, -1.0F, -27.0F, 1, 1, 72, -0.1F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(-1.1929F, -34.6657F, -32.4F);
		barrelandreciever.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.0F, 0.0F, -0.7854F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 74, -1.0F, -1.0F, -27.0F, 1, 1, 72, -0.1F, false));

		frontsight = new ModelRenderer(this);
		frontsight.setRotationPoint(0.0F, 0.0F, -2.0F);
		gun.addChild(frontsight);
		frontsight.cubeList.add(new ModelBox(frontsight, 428, 451, -1.2F, -43.1459F, -34.244F, 1, 1, 3, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 419, 451, -2.8F, -43.1459F, -34.244F, 1, 1, 3, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 451, 435, -1.2F, -43.3459F, -34.244F, 1, 1, 3, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 451, 430, -2.8F, -43.3459F, -34.244F, 1, 1, 3, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 452, 296, -1.2F, -43.5243F, -33.6119F, 1, 1, 3, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 437, 451, -2.8F, -43.5243F, -33.6119F, 1, 1, 3, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 458, 458, -1.2F, -43.5243F, -34.2369F, 1, 1, 2, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 458, 454, -2.8F, -43.5243F, -34.2369F, 1, 1, 2, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 398, 451, -2.5F, -44.8F, -34.0F, 2, 2, 2, -0.2F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 452, 301, -2.5F, -44.8F, -33.15F, 2, 2, 2, -0.2F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 452, 311, -2.5F, -45.5F, -33.15F, 2, 2, 2, -0.2F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 452, 306, -2.5F, -45.5F, -34.0F, 2, 2, 2, -0.2F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 162, 451, -0.4893F, -47.5847F, -34.2F, 1, 2, 3, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 142, 451, -3.4475F, -47.5847F, -34.2F, 1, 2, 3, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 113, 459, -0.7893F, -47.0847F, -33.175F, 1, 1, 2, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 73, 459, -3.1475F, -47.0847F, -33.175F, 1, 1, 2, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 244, 459, -0.7893F, -47.0847F, -33.3F, 1, 1, 2, -0.3F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 120, 459, -3.1475F, -47.0847F, -33.3F, 1, 1, 2, -0.3F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 450, 404, -2.6368F, -48.4695F, -34.2F, 2, 1, 3, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 57, 451, -2.3F, -48.4695F, -34.2F, 2, 1, 3, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 461, 338, -2.0F, -46.0F, -33.55F, 1, 1, 1, -0.2F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 440, 410, -2.0F, -47.1F, -33.55F, 1, 2, 1, -0.4F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(-1.5F, -43.8F, -32.0F);
		frontsight.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.2182F, 0.0F, 0.0F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 48, 451, -1.0F, -0.8F, -1.0F, 2, 4, 2, -0.2F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(-2.5684F, -47.5595F, -33.2F);
		frontsight.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.0F, 0.0F, 0.7418F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 451, 198, -0.5F, -1.0F, -1.0F, 1, 2, 3, -0.4F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(-0.3684F, -47.5595F, -33.2F);
		frontsight.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.0F, 0.0F, -0.7418F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 451, 204, -0.5F, -1.0F, -1.0F, 1, 2, 3, -0.4F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(-2.5684F, -45.6099F, -33.2F);
		frontsight.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.0F, 0.0F, -0.7418F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 133, 451, -0.5F, -1.0F, -1.0F, 1, 2, 3, -0.4F, false));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(-0.3684F, -45.6099F, -33.2F);
		frontsight.addChild(cube_r34);
		setRotationAngle(cube_r34, 0.0F, 0.0F, 0.7418F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 106, 451, -0.5F, -1.0F, -1.0F, 1, 2, 3, -0.4F, false));

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(-0.7F, -40.2851F, -31.4535F);
		frontsight.addChild(cube_r35);
		setRotationAngle(cube_r35, 0.3054F, 0.0F, 0.0F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 88, 451, -0.5F, -2.975F, -1.325F, 1, 2, 3, -0.4F, false));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 97, 451, -2.1F, -2.975F, -1.325F, 1, 2, 3, -0.4F, false));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 171, 451, -2.1F, -3.275F, -2.0F, 1, 4, 2, -0.4F, false));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 254, 451, -0.5F, -3.275F, -2.0F, 1, 4, 2, -0.4F, false));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 257, 424, -0.5F, -2.975F, -2.0F, 1, 4, 2, -0.4F, false));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 178, 443, -2.1F, -2.975F, -2.0F, 1, 4, 2, -0.4F, false));

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(-0.7F, -40.2851F, -30.7535F);
		frontsight.addChild(cube_r36);
		setRotationAngle(cube_r36, 0.3054F, 0.0F, 0.0F);
		cube_r36.cubeList.add(new ModelBox(cube_r36, 39, 451, -0.5F, -2.0F, -2.0F, 1, 3, 3, -0.4F, false));
		cube_r36.cubeList.add(new ModelBox(cube_r36, 338, 443, -1.7F, -2.0F, -2.1F, 2, 3, 3, -0.4F, false));
		cube_r36.cubeList.add(new ModelBox(cube_r36, 371, 433, -1.9F, -2.0F, -2.1F, 2, 3, 3, -0.4F, false));
		cube_r36.cubeList.add(new ModelBox(cube_r36, 18, 451, -2.1F, -2.0F, -2.0F, 1, 3, 3, -0.4F, false));

		irons = new ModelRenderer(this);
		irons.setRotationPoint(-6.5F, -37.5F, 10.25F);
		gun.addChild(irons);
		irons.cubeList.add(new ModelBox(irons, 71, 427, 4.5F, -10.35F, -1.75F, 1, 1, 2, -0.35F, false));
		irons.cubeList.add(new ModelBox(irons, 267, 458, 4.2F, -10.35F, -1.75F, 1, 1, 2, -0.35F, false));
		irons.cubeList.add(new ModelBox(irons, 458, 450, 4.8F, -10.35F, -1.75F, 1, 1, 2, -0.35F, false));
		irons.cubeList.add(new ModelBox(irons, 151, 453, 3.9F, -10.15F, -1.7F, 1, 2, 2, -0.4F, false));
		irons.cubeList.add(new ModelBox(irons, 453, 154, 5.1F, -10.15F, -1.7F, 1, 2, 2, -0.4F, false));
		irons.cubeList.add(new ModelBox(irons, 453, 40, 4.0F, -9.0F, -1.8F, 2, 1, 2, -0.3F, false));
		irons.cubeList.add(new ModelBox(irons, 450, 392, 3.5F, -8.8F, -1.799F, 3, 2, 2, -0.3F, false));

		cube_r189 = new ModelRenderer(this);
		cube_r189.setRotationPoint(3.9F, -10.7F, -1.7F);
		irons.addChild(cube_r189);
		setRotationAngle(cube_r189, 0.0F, 0.0F, 0.7854F);
		cube_r189.cubeList.add(new ModelBox(cube_r189, 120, 444, 1.4142F, 0.4142F, -0.001F, 1, 1, 2, -0.4F, false));
		cube_r189.cubeList.add(new ModelBox(cube_r189, 458, 109, 1.2142F, 0.4142F, -0.001F, 1, 1, 2, -0.4F, false));

		cube_r190 = new ModelRenderer(this);
		cube_r190.setRotationPoint(6.1F, -10.7F, -1.7F);
		irons.addChild(cube_r190);
		setRotationAngle(cube_r190, 0.0F, 0.0F, -0.7854F);
		cube_r190.cubeList.add(new ModelBox(cube_r190, 458, 113, -2.4142F, 0.4142F, -0.001F, 1, 1, 2, -0.4F, false));
		cube_r190.cubeList.add(new ModelBox(cube_r190, 458, 117, -2.2142F, 0.4142F, -0.001F, 1, 1, 2, -0.4F, false));

		cube_r191 = new ModelRenderer(this);
		cube_r191.setRotationPoint(3.85F, -11.8F, -1.7F);
		irons.addChild(cube_r191);
		setRotationAngle(cube_r191, 0.0F, 0.0F, -0.7854F);
		cube_r191.cubeList.add(new ModelBox(cube_r191, 458, 121, -1.4842F, 1.4182F, -0.048F, 1, 1, 2, -0.35F, false));
		cube_r191.cubeList.add(new ModelBox(cube_r191, 145, 458, -1.4292F, 1.4192F, -0.049F, 1, 1, 2, -0.35F, false));

		cube_r192 = new ModelRenderer(this);
		cube_r192.setRotationPoint(3.9F, -11.7F, -1.7F);
		irons.addChild(cube_r192);
		setRotationAngle(cube_r192, 0.0F, 0.0F, -0.7854F);
		cube_r192.cubeList.add(new ModelBox(cube_r192, 167, 458, -1.6142F, 1.4142F, -0.001F, 1, 1, 2, -0.4F, false));
		cube_r192.cubeList.add(new ModelBox(cube_r192, 187, 458, -1.4142F, 1.4142F, -0.001F, 1, 1, 2, -0.4F, false));

		cube_r193 = new ModelRenderer(this);
		cube_r193.setRotationPoint(6.1F, -11.7F, -1.7F);
		irons.addChild(cube_r193);
		setRotationAngle(cube_r193, 0.0F, 0.0F, 0.7854F);
		cube_r193.cubeList.add(new ModelBox(cube_r193, 194, 458, 0.4142F, 1.4142F, -0.001F, 1, 1, 2, -0.4F, false));
		cube_r193.cubeList.add(new ModelBox(cube_r193, 201, 458, 0.6142F, 1.4142F, -0.001F, 1, 1, 2, -0.4F, false));

		cube_r194 = new ModelRenderer(this);
		cube_r194.setRotationPoint(6.15F, -11.8F, -1.7F);
		irons.addChild(cube_r194);
		setRotationAngle(cube_r194, 0.0F, 0.0F, 0.7854F);
		cube_r194.cubeList.add(new ModelBox(cube_r194, 208, 458, 0.4842F, 1.4182F, -0.048F, 1, 1, 2, -0.35F, false));
		cube_r194.cubeList.add(new ModelBox(cube_r194, 458, 250, 0.4292F, 1.4192F, -0.049F, 1, 1, 2, -0.35F, false));
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