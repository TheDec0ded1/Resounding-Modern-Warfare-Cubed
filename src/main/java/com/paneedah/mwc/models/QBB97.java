package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBB97 extends ModelWithAttachments {
	private final ModelRenderer righthand;
	private final ModelRenderer lefthand;
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
	private final ModelRenderer cube_r30;
	private final ModelRenderer cube_r31;
	private final ModelRenderer frontsight;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;
	private final ModelRenderer cube_r34;
	private final ModelRenderer cube_r35;
	private final ModelRenderer cube_r36;
	private final ModelRenderer cube_r37;
	private final ModelRenderer cube_r38;
	private final ModelRenderer irons;
	private final ModelRenderer cube_r189;
	private final ModelRenderer cube_r190;
	private final ModelRenderer cube_r191;
	private final ModelRenderer cube_r192;
	private final ModelRenderer cube_r193;
	private final ModelRenderer cube_r194;

	public QBB97() {
		textureWidth = 352;
		textureHeight = 352;

		righthand = new ModelRenderer(this);
		righthand.setRotationPoint(-4.4F, 0.7F, 25.9F);
		setRotationAngle(righthand, -0.0943F, -0.0834F, -0.0291F);
		righthand.cubeList.add(new ModelBox(righthand, 0, 0, -4.5F, -4.65F, -33.0F, 9, 9, 33, 0.0F, false));

		lefthand = new ModelRenderer(this);
		lefthand.setRotationPoint(13.0F, 1.0F, 11.7F);
		setRotationAngle(lefthand, 0.1431F, 0.4136F, 1.0075F);
		lefthand.cubeList.add(new ModelBox(lefthand, 0, 0, -4.4F, -4.55F, -38.0F, 9, 9, 38, 0.0F, false));

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		barrelandreciever = new ModelRenderer(this);
		barrelandreciever.setRotationPoint(0.0F, 0.0F, 0.0F);
		gun.addChild(barrelandreciever);
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 0, 0, -2.0F, -35.0F, -59.4F, 1, 1, 72, -0.1F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 146, 219, -2.0F, -36.1314F, -59.4F, 1, 1, 72, -0.1F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 146, 0, -2.5657F, -35.5657F, -59.4F, 1, 1, 72, -0.1F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 146, 73, -1.4343F, -35.5657F, -59.4F, 1, 1, 72, -0.1F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 142, 311, -2.0F, -36.2564F, -61.2F, 1, 1, 2, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 124, 311, -1.2929F, -35.5493F, -61.2F, 1, 1, 2, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 118, 311, -2.7071F, -35.5493F, -61.2F, 1, 1, 2, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 276, 310, -2.0F, -34.8422F, -61.2F, 1, 1, 2, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 286, 311, -2.0F, -34.8422F, -65.8F, 1, 1, 1, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 246, 311, -2.7071F, -35.5493F, -65.8F, 1, 1, 1, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 242, 311, -1.2929F, -35.5493F, -65.8F, 1, 1, 1, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 212, 311, -2.0F, -36.2564F, -65.8F, 1, 1, 1, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 292, 260, -2.0F, -37.3828F, -33.4F, 1, 1, 6, -0.2F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 292, 246, -2.4243F, -37.8071F, -33.4F, 1, 1, 6, -0.2F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 292, 239, -1.5757F, -37.8071F, -33.4F, 1, 1, 6, -0.2F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 292, 161, -2.0007F, -37.8071F, -28.4F, 1, 1, 10, -0.2F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 292, 49, -2.0007F, -38.5071F, -19.4F, 1, 1, 21, -0.2F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 292, 225, -2.0F, -38.2314F, -33.4F, 1, 1, 6, -0.2F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 186, 292, -3.0F, -45.7F, 8.4F, 3, 13, 3, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 292, 139, -2.5F, -46.1F, -2.0F, 2, 1, 11, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 262, 299, -3.0F, -46.1F, 6.0F, 3, 1, 3, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 292, 115, -3.0F, -45.7F, -3.0F, 3, 1, 12, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 216, 300, -3.0F, -46.1F, 2.0F, 3, 1, 3, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 300, 296, -3.0F, -46.1F, -2.0F, 3, 1, 3, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 254, 299, -2.5F, -40.0F, -35.0F, 2, 6, 2, -0.1F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 198, 301, -2.5F, -39.0F, -19.1F, 2, 5, 2, -0.1F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 276, 298, -3.7F, -34.7F, 11.7F, 5, 4, 1, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 294, 308, -4.3F, -34.7F, 11.7F, 2, 4, 1, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 292, 0, -4.3F, -31.7F, 11.9F, 2, 1, 27, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 292, 28, -3.7F, -31.7F, 11.9F, 5, 1, 20, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 106, 292, -3.0F, -32.0F, 28.0F, 3, 1, 13, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 262, 303, -3.8F, -35.0F, 12.0F, 1, 4, 3, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 62, 292, 0.0F, -35.0F, 11.0F, 1, 1, 21, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 0, 292, -4.0F, -35.0F, 11.0F, 1, 1, 30, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 262, 292, 0.0F, -35.0F, 35.0F, 1, 1, 6, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 308, 304, -4.0F, -34.0F, 39.0F, 1, 3, 2, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 232, 309, 0.0F, -34.0F, 39.0F, 1, 3, 2, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 238, 309, -4.0F, -34.0F, 38.3F, 1, 3, 1, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 242, 305, 0.0F, -34.0F, 36.3F, 1, 3, 3, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 292, 71, -3.8F, -35.0F, 23.0F, 1, 4, 18, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 292, 192, -3.8F, -32.0F, 15.0F, 1, 1, 8, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 198, 292, -3.8F, -34.5F, 15.0F, 1, 1, 8, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 292, 172, -3.7F, -33.7F, 15.0F, 1, 2, 8, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 292, 93, -0.2F, -35.0F, 23.0F, 1, 4, 18, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 292, 182, -0.3F, -33.7F, 15.0F, 1, 2, 8, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 292, 201, -0.2F, -34.5F, 15.0F, 1, 1, 8, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 292, 210, -0.2F, -32.0F, 15.0F, 1, 1, 8, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 270, 303, -0.2F, -35.0F, 12.0F, 1, 4, 3, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 148, 311, 0.0F, -33.1071F, 32.6071F, 1, 1, 2, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 290, 311, 0.0F, -33.8142F, 32.9F, 1, 1, 1, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 300, 311, 0.0F, -33.1071F, 32.1929F, 1, 1, 1, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 166, 312, 0.0F, -32.4F, 32.9F, 1, 1, 1, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 310, 172, 0.1F, -33.6F, 38.4F, 1, 2, 2, 0.1F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 204, 311, -4.1F, -32.7F, 39.6F, 1, 1, 1, 0.1F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 278, 303, -3.8F, -35.1F, 9.0F, 1, 4, 3, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 216, 304, -0.2F, -35.1F, 9.0F, 1, 4, 3, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 216, 292, -3.5F, -31.0F, 36.0F, 4, 3, 5, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 292, 286, -2.634F, -28.5F, 36.0F, 1, 1, 5, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 292, 274, -2.366F, -28.5F, 36.0F, 2, 1, 5, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 138, 292, -3.5F, -32.2592F, 14.388F, 4, 5, 9, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 288, 292, -4.6F, -31.2592F, 22.088F, 5, 2, 2, -0.5F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 292, 267, -0.875F, -31.2592F, 19.088F, 2, 2, 5, -0.5F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 288, 296, 0.0F, -29.9F, 18.7F, 1, 1, 5, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 158, 311, 0.0F, -31.3F, 18.7F, 1, 2, 1, -0.3F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.1F, -27.4F, 18.9F);
		barrelandreciever.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 164, 292, -4.0F, 0.0F, -5.0F, 1, 1, 10, -0.3F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 292, 128, -3.8F, 0.0F, -5.0F, 5, 1, 10, -0.3F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.5F, -30.6222F, 22.9171F);
		barrelandreciever.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.3054F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 292, 219, -2.0F, -1.0F, 0.5F, 4, 2, 4, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1.5F, -29.7592F, 22.288F);
		barrelandreciever.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.7418F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 308, 221, -2.0F, 0.0F, 0.5F, 4, 1, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.5F, -30.2913F, 13.1514F);
		barrelandreciever.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 292, 151, -2.0F, 2.0F, 1.5F, 4, 1, 9, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.5F, -31.4592F, 15.413F);
		barrelandreciever.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.7418F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 308, 219, -2.0F, 0.5F, -1.0F, 4, 1, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-2.0F, -30.7397F, 36.0311F);
		barrelandreciever.addChild(cube_r6);
		setRotationAngle(cube_r6, 1.3526F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 306, 228, -1.5F, -3.4F, -0.5F, 4, 2, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-2.817F, -28.183F, 37.5F);
		barrelandreciever.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -1.0472F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 292, 280, -0.5F, -0.5F, -1.5F, 1, 1, 5, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-0.183F, -28.183F, 37.5F);
		barrelandreciever.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 1.0472F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 276, 292, -0.5F, -0.5F, -1.5F, 1, 1, 5, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-2.0F, -30.0957F, 35.9524F);
		barrelandreciever.addChild(cube_r9);
		setRotationAngle(cube_r9, 1.0036F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 196, 308, -1.5F, -1.8F, -0.5F, 4, 1, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-2.0F, -29.7729F, 35.8328F);
		barrelandreciever.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.7854F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 300, 300, -1.5F, -1.5F, -0.5F, 4, 2, 2, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-2.0F, -29.6501F, 35.8221F);
		barrelandreciever.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.6109F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 306, 225, -1.5F, -0.5F, -0.5F, 4, 2, 1, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-2.0F, -28.6272F, 36.3265F);
		barrelandreciever.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.3054F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 186, 308, -1.5F, -0.5F, -0.5F, 4, 1, 1, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.925F, -32.6071F, 33.7071F);
		barrelandreciever.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, -0.1745F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 178, 308, -0.5F, -0.5F, -2.0F, 1, 1, 3, -0.3F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.0F, -32.8849F, 35.1021F);
		barrelandreciever.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.7854F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 162, 312, 0.0F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.0F, -32.8849F, 34.1021F);
		barrelandreciever.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.7854F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 304, 311, 0.0F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.0F, -33.8849F, 34.1021F);
		barrelandreciever.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.7854F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 308, 223, 0.0F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.0F, -33.8849F, 35.1021F);
		barrelandreciever.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.7854F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 250, 305, 0.0F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-1.525F, -34.6904F, 35.1531F);
		barrelandreciever.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.5672F, 0.0F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 154, 311, 1.5F, -1.5F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-1.525F, -34.6904F, 31.8469F);
		barrelandreciever.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.5672F, 0.0F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 282, 310, 1.5F, -1.5F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-0.4929F, -37.6071F, -35.4F);
		barrelandreciever.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, -0.7854F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 292, 232, -1.0F, -1.0F, 2.0F, 1, 1, 6, -0.2F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-1.8828F, -37.69F, -33.1F);
		barrelandreciever.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, -0.7854F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 234, 292, -0.5F, -0.3828F, -0.3F, 1, 1, 6, -0.2F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-0.4929F, -37.0071F, -35.4F);
		barrelandreciever.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, -0.7854F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 248, 292, -1.0F, -1.0F, 2.0F, 1, 1, 6, -0.2F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-1.0929F, -37.0071F, -35.4F);
		barrelandreciever.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, -0.7854F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 292, 253, -1.0F, -1.0F, 2.0F, 1, 1, 6, -0.2F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-0.2929F, -34.5493F, -106.0F);
		barrelandreciever.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, -0.7854F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 206, 301, -1.0F, -1.0F, 41.0F, 1, 1, 4, 0.0F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 250, 311, -1.0F, -1.0F, 40.2F, 1, 1, 1, 0.0F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 112, 311, -1.0F, -1.0F, 44.8F, 1, 1, 2, 0.0F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-0.2929F, -35.5493F, -106.0F);
		barrelandreciever.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.0F, -0.7854F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 288, 302, -1.0F, -1.0F, 41.0F, 1, 1, 4, 0.0F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 216, 311, -1.0F, -1.0F, 40.2F, 1, 1, 1, 0.0F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 136, 311, -1.0F, -1.0F, 44.8F, 1, 1, 2, 0.0F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-1.2929F, -35.5493F, -106.0F);
		barrelandreciever.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, -0.7854F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 164, 303, -1.0F, -1.0F, 41.0F, 1, 1, 4, 0.0F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 220, 311, -1.0F, -1.0F, 40.2F, 1, 1, 1, 0.0F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 130, 311, -1.0F, -1.0F, 44.8F, 1, 1, 2, 0.0F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(-1.2929F, -34.5493F, -106.0F);
		barrelandreciever.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, 0.0F, -0.7854F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 174, 303, -1.0F, -1.0F, 41.0F, 1, 1, 4, 0.0F, false));
		cube_r27.cubeList.add(new ModelBox(cube_r27, 254, 311, -1.0F, -1.0F, 40.2F, 1, 1, 1, 0.0F, false));
		cube_r27.cubeList.add(new ModelBox(cube_r27, 106, 311, -1.0F, -1.0F, 44.8F, 1, 1, 2, 0.0F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-1.1929F, -35.4657F, -32.4F);
		barrelandreciever.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, 0.0F, -0.7854F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 146, 146, -1.0F, -1.0F, -27.0F, 1, 1, 72, -0.1F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(-0.3929F, -35.4657F, -32.4F);
		barrelandreciever.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.0F, 0.0F, -0.7854F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 219, -1.0F, -1.0F, -27.0F, 1, 1, 72, -0.1F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(-0.3929F, -34.6657F, -32.4F);
		barrelandreciever.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.0F, 0.0F, -0.7854F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 146, -1.0F, -1.0F, -27.0F, 1, 1, 72, -0.1F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(-1.1929F, -34.6657F, -32.4F);
		barrelandreciever.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.0F, 0.0F, -0.7854F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 73, -1.0F, -1.0F, -27.0F, 1, 1, 72, -0.1F, false));

		frontsight = new ModelRenderer(this);
		frontsight.setRotationPoint(0.0F, 0.0F, -2.0F);
		gun.addChild(frontsight);
		frontsight.cubeList.add(new ModelBox(frontsight, 306, 263, -1.2F, -43.1459F, -34.244F, 1, 1, 3, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 306, 259, -2.8F, -43.1459F, -34.244F, 1, 1, 3, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 306, 271, -1.2F, -43.3459F, -34.244F, 1, 1, 3, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 306, 267, -2.8F, -43.3459F, -34.244F, 1, 1, 3, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 250, 307, -1.2F, -43.5243F, -33.6119F, 1, 1, 3, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 306, 275, -2.8F, -43.5243F, -33.6119F, 1, 1, 3, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 310, 215, -1.2F, -43.5243F, -34.2369F, 1, 1, 2, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 310, 212, -2.8F, -43.5243F, -34.2369F, 1, 1, 2, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 306, 243, -2.5F, -44.8F, -34.0F, 2, 2, 2, -0.2F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 286, 307, -2.5F, -44.8F, -33.15F, 2, 2, 2, -0.2F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 170, 308, -2.5F, -45.5F, -33.15F, 2, 2, 2, -0.2F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 162, 308, -2.5F, -45.5F, -34.0F, 2, 2, 2, -0.2F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 146, 306, -0.4893F, -47.5847F, -34.2F, 1, 2, 3, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 138, 306, -3.4475F, -47.5847F, -34.2F, 1, 2, 3, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 258, 310, -0.7893F, -47.0847F, -33.175F, 1, 1, 2, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 224, 310, -3.1475F, -47.0847F, -33.175F, 1, 1, 2, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 270, 310, -0.7893F, -47.0847F, -33.3F, 1, 1, 2, -0.3F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 264, 310, -3.1475F, -47.0847F, -33.3F, 1, 1, 2, -0.3F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 298, 304, -2.6368F, -48.4695F, -34.2F, 2, 1, 3, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 232, 305, -2.3F, -48.4695F, -34.2F, 2, 1, 3, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 208, 311, -2.0F, -46.0F, -33.55F, 1, 1, 1, -0.2F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 258, 307, -2.0F, -47.1F, -33.55F, 1, 2, 1, -0.4F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(-1.5F, -43.8F, -32.0F);
		frontsight.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.2182F, 0.0F, 0.0F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 304, 286, -1.0F, -0.8F, -1.0F, 2, 4, 2, -0.2F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(-2.5684F, -47.5595F, -33.2F);
		frontsight.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.0F, 0.0F, 0.7418F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 154, 306, -0.5F, -1.0F, -1.0F, 1, 2, 3, -0.4F, false));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(-0.3684F, -47.5595F, -33.2F);
		frontsight.addChild(cube_r34);
		setRotationAngle(cube_r34, 0.0F, 0.0F, -0.7418F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 206, 306, -0.5F, -1.0F, -1.0F, 1, 2, 3, -0.4F, false));

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(-2.5684F, -45.6099F, -33.2F);
		frontsight.addChild(cube_r35);
		setRotationAngle(cube_r35, 0.0F, 0.0F, -0.7418F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 130, 306, -0.5F, -1.0F, -1.0F, 1, 2, 3, -0.4F, false));

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(-0.3684F, -45.6099F, -33.2F);
		frontsight.addChild(cube_r36);
		setRotationAngle(cube_r36, 0.0F, 0.0F, 0.7418F);
		cube_r36.cubeList.add(new ModelBox(cube_r36, 122, 306, -0.5F, -1.0F, -1.0F, 1, 2, 3, -0.4F, false));

		cube_r37 = new ModelRenderer(this);
		cube_r37.setRotationPoint(-0.7F, -40.2851F, -31.4535F);
		frontsight.addChild(cube_r37);
		setRotationAngle(cube_r37, 0.3054F, 0.0F, 0.0F);
		cube_r37.cubeList.add(new ModelBox(cube_r37, 106, 306, -0.5F, -2.975F, -1.325F, 1, 2, 3, -0.4F, false));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 114, 306, -2.1F, -2.975F, -1.325F, 1, 2, 3, -0.4F, false));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 306, 247, -2.1F, -3.275F, -2.0F, 1, 4, 2, -0.4F, false));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 306, 253, -0.5F, -3.275F, -2.0F, 1, 4, 2, -0.4F, false));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 306, 231, -0.5F, -2.975F, -2.0F, 1, 4, 2, -0.4F, false));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 306, 237, -2.1F, -2.975F, -2.0F, 1, 4, 2, -0.4F, false));

		cube_r38 = new ModelRenderer(this);
		cube_r38.setRotationPoint(-0.7F, -40.2851F, -30.7535F);
		frontsight.addChild(cube_r38);
		setRotationAngle(cube_r38, 0.3054F, 0.0F, 0.0F);
		cube_r38.cubeList.add(new ModelBox(cube_r38, 304, 280, -0.5F, -2.0F, -2.0F, 1, 3, 3, -0.4F, false));
		cube_r38.cubeList.add(new ModelBox(cube_r38, 244, 299, -1.7F, -2.0F, -2.1F, 2, 3, 3, -0.4F, false));
		cube_r38.cubeList.add(new ModelBox(cube_r38, 234, 299, -1.9F, -2.0F, -2.1F, 2, 3, 3, -0.4F, false));
		cube_r38.cubeList.add(new ModelBox(cube_r38, 224, 304, -2.1F, -2.0F, -2.0F, 1, 3, 3, -0.4F, false));

		irons = new ModelRenderer(this);
		irons.setRotationPoint(-6.5F, -37.5F, 10.25F);
		gun.addChild(irons);
		irons.cubeList.add(new ModelBox(irons, 310, 176, 4.5F, -10.35F, -1.75F, 1, 1, 2, -0.35F, false));
		irons.cubeList.add(new ModelBox(irons, 310, 206, 4.2F, -10.35F, -1.75F, 1, 1, 2, -0.35F, false));
		irons.cubeList.add(new ModelBox(irons, 310, 209, 4.8F, -10.35F, -1.75F, 1, 1, 2, -0.35F, false));
		irons.cubeList.add(new ModelBox(irons, 228, 300, 3.9F, -10.15F, -1.7F, 1, 2, 2, -0.4F, false));
		irons.cubeList.add(new ModelBox(irons, 308, 309, 5.1F, -10.15F, -1.7F, 1, 2, 2, -0.4F, false));
		irons.cubeList.add(new ModelBox(irons, 300, 308, 4.0F, -9.0F, -1.8F, 2, 1, 2, -0.3F, false));
		irons.cubeList.add(new ModelBox(irons, 302, 292, 3.5F, -8.8F, -1.799F, 3, 2, 2, -0.3F, false));

		cube_r189 = new ModelRenderer(this);
		cube_r189.setRotationPoint(3.9F, -10.7F, -1.7F);
		irons.addChild(cube_r189);
		setRotationAngle(cube_r189, 0.0F, 0.0F, 0.7854F);
		cube_r189.cubeList.add(new ModelBox(cube_r189, 310, 179, 1.4142F, 0.4142F, -0.001F, 1, 1, 2, -0.4F, false));
		cube_r189.cubeList.add(new ModelBox(cube_r189, 310, 182, 1.2142F, 0.4142F, -0.001F, 1, 1, 2, -0.4F, false));

		cube_r190 = new ModelRenderer(this);
		cube_r190.setRotationPoint(6.1F, -10.7F, -1.7F);
		irons.addChild(cube_r190);
		setRotationAngle(cube_r190, 0.0F, 0.0F, -0.7854F);
		cube_r190.cubeList.add(new ModelBox(cube_r190, 310, 185, -2.4142F, 0.4142F, -0.001F, 1, 1, 2, -0.4F, false));
		cube_r190.cubeList.add(new ModelBox(cube_r190, 186, 310, -2.2142F, 0.4142F, -0.001F, 1, 1, 2, -0.4F, false));

		cube_r191 = new ModelRenderer(this);
		cube_r191.setRotationPoint(3.85F, -11.8F, -1.7F);
		irons.addChild(cube_r191);
		setRotationAngle(cube_r191, 0.0F, 0.0F, -0.7854F);
		cube_r191.cubeList.add(new ModelBox(cube_r191, 310, 188, -1.4842F, 1.4182F, -0.048F, 1, 1, 2, -0.35F, false));
		cube_r191.cubeList.add(new ModelBox(cube_r191, 310, 191, -1.4292F, 1.4192F, -0.049F, 1, 1, 2, -0.35F, false));

		cube_r192 = new ModelRenderer(this);
		cube_r192.setRotationPoint(3.9F, -11.7F, -1.7F);
		irons.addChild(cube_r192);
		setRotationAngle(cube_r192, 0.0F, 0.0F, -0.7854F);
		cube_r192.cubeList.add(new ModelBox(cube_r192, 192, 310, -1.6142F, 1.4142F, -0.001F, 1, 1, 2, -0.4F, false));
		cube_r192.cubeList.add(new ModelBox(cube_r192, 310, 194, -1.4142F, 1.4142F, -0.001F, 1, 1, 2, -0.4F, false));

		cube_r193 = new ModelRenderer(this);
		cube_r193.setRotationPoint(6.1F, -11.7F, -1.7F);
		irons.addChild(cube_r193);
		setRotationAngle(cube_r193, 0.0F, 0.0F, 0.7854F);
		cube_r193.cubeList.add(new ModelBox(cube_r193, 310, 197, 0.4142F, 1.4142F, -0.001F, 1, 1, 2, -0.4F, false));
		cube_r193.cubeList.add(new ModelBox(cube_r193, 198, 310, 0.6142F, 1.4142F, -0.001F, 1, 1, 2, -0.4F, false));

		cube_r194 = new ModelRenderer(this);
		cube_r194.setRotationPoint(6.15F, -11.8F, -1.7F);
		irons.addChild(cube_r194);
		setRotationAngle(cube_r194, 0.0F, 0.0F, 0.7854F);
		cube_r194.cubeList.add(new ModelBox(cube_r194, 310, 200, 0.4842F, 1.4182F, -0.048F, 1, 1, 2, -0.35F, false));
		cube_r194.cubeList.add(new ModelBox(cube_r194, 310, 203, 0.4292F, 1.4192F, -0.049F, 1, 1, 2, -0.35F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		righthand.render(f5);
		lefthand.render(f5);
		gun.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}