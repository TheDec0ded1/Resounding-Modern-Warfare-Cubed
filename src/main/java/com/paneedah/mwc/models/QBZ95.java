package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBZ95 extends ModelWithAttachments {
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

	public QBZ95() {
		textureWidth = 512;
		textureHeight = 512;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		barrelandreciever = new ModelRenderer(this);
		barrelandreciever.setRotationPoint(0.0F, 0.0F, 0.0F);
		gun.addChild(barrelandreciever);
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 55, 110, -2.0F, -35.0F, -39.4F, 1, 1, 52, -0.1F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 61, 154, -2.0F, -34.5F, -39.4F, 1, 1, 1, -0.1F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 0, 0, -2.0F, -36.1314F, -39.4F, 1, 1, 52, -0.1F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 0, 108, -2.5657F, -35.5657F, -39.4F, 1, 1, 52, -0.1F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 55, 56, -1.4343F, -35.5657F, -39.4F, 1, 1, 52, -0.1F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 0, 108, -2.0F, -35.1328F, -46.9F, 1, 1, 8, -0.2F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 110, 23, -2.4243F, -35.5571F, -46.9F, 1, 1, 8, -0.2F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 110, 33, -1.5757F, -35.5571F, -46.9F, 1, 1, 8, -0.2F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 110, 66, -2.0F, -35.9814F, -46.9F, 1, 1, 8, -0.2F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 133, 66, -2.0F, -36.1314F, -48.2F, 1, 1, 2, -0.1F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 99, 148, -1.4343F, -35.5657F, -48.2F, 1, 1, 2, -0.1F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 149, 151, -2.5657F, -35.5657F, -48.2F, 1, 1, 2, -0.1F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 154, 93, -2.0F, -35.0F, -48.2F, 1, 1, 2, -0.1F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 28, 144, -2.0F, -35.0F, -52.8F, 1, 1, 1, -0.1F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 150, 141, -2.5657F, -35.5657F, -52.8F, 1, 1, 1, -0.1F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 151, 129, -1.4343F, -35.5657F, -52.8F, 1, 1, 1, -0.1F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 144, 153, -2.0F, -36.1314F, -52.8F, 1, 1, 1, -0.1F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 110, 120, -2.0F, -37.3828F, -33.4F, 1, 1, 6, -0.2F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 132, 120, -2.4243F, -37.8071F, -33.4F, 1, 1, 6, -0.2F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 0, 141, -1.5757F, -37.8071F, -33.4F, 1, 1, 6, -0.2F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, -1, 24, -2.0007F, -37.8071F, -28.4F, 1, 1, 10, -0.2F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 0, 54, -2.0007F, -38.5071F, -19.4F, 1, 1, 21, -0.2F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 132, 142, -2.0F, -38.2314F, -33.4F, 1, 1, 6, -0.2F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 110, 46, -3.7F, -34.7F, 11.7F, 5, 4, 1, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 83, 23, -4.3F, -34.7F, 11.7F, 2, 4, 1, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 15, 100, -3.7F, -31.7F, 12.1F, 5, 1, 2, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 119, 158, -4.3F, -31.7F, 12.1F, 2, 1, 2, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 22, 131, 0.3F, -31.5343F, 13.5F, 1, 1, 11, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 77, 132, -4.3F, -31.5343F, 13.5F, 1, 1, 11, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 133, 23, -3.7F, -31.7F, 23.9F, 5, 1, 8, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 200, 66, -4.3F, -31.7F, 23.9F, 2, 1, 15, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 184, 34, -3.0F, -32.0F, 28.0F, 3, 1, 13, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 55, 67, -3.5F, -31.0F, 36.0F, 4, 3, 5, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 94, 23, -2.634F, -28.5F, 36.0F, 1, 1, 5, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 133, 13, -2.366F, -28.5F, 36.0F, 2, 1, 5, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 0, 36, -3.8F, -35.0F, 12.0F, 1, 4, 3, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 0, 77, -3.7F, -33.7F, 15.0F, 1, 2, 8, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 229, 121, -3.8F, -35.0F, 23.0F, 1, 4, 18, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 55, 132, -3.8F, -32.0F, 15.0F, 1, 1, 8, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 0, 131, -3.8F, -34.5F, 15.0F, 1, 1, 8, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 12, 25, -0.2F, -35.0F, 12.0F, 1, 4, 3, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 0, 25, -0.2F, -35.1F, 9.0F, 1, 4, 3, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 25, 0, -3.8F, -35.1F, 9.0F, 1, 4, 3, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 0, 118, -0.2F, -32.0F, 15.0F, 1, 1, 8, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 55, 120, -0.2F, -34.5F, 15.0F, 1, 1, 8, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 55, 56, -0.3F, -33.7F, 15.0F, 1, 2, 8, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 0, 229, -0.2F, -35.0F, 23.0F, 1, 4, 18, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 99, 206, -4.0F, -35.0F, 11.0F, 1, 1, 30, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 55, 0, 0.0F, -35.0F, 11.0F, 1, 1, 21, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 147, 43, 0.0F, -35.0F, 35.0F, 1, 1, 6, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 55, 79, 0.0F, -34.0F, 39.0F, 1, 3, 2, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 78, 79, -4.0F, -34.0F, 39.0F, 1, 3, 2, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 66, 79, 0.0F, -34.0F, 36.3F, 1, 3, 3, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 55, 67, -4.0F, -34.0F, 38.3F, 1, 3, 1, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 55, 23, -3.0F, -45.7F, 8.4F, 3, 13, 3, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 25, 25, -2.5F, -46.1F, -2.0F, 2, 1, 11, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 123, 100, -3.0F, -46.1F, 6.0F, 3, 1, 3, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 159, 142, -3.0F, -45.7F, -3.0F, 3, 1, 12, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 123, 46, -3.0F, -46.1F, 2.0F, 3, 1, 3, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 110, 100, -3.0F, -46.1F, -2.0F, 3, 1, 3, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 43, 120, -2.5F, -40.0F, -35.0F, 2, 8, 2, -0.1F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 13, 0, -2.5F, -39.0F, -19.1F, 2, 5, 2, -0.1F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 142, 164, 0.0F, -33.1071F, 32.6071F, 1, 1, 2, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 40, 166, 0.0F, -33.8142F, 32.9F, 1, 1, 1, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 15, 166, 0.0F, -33.1071F, 32.1929F, 1, 1, 1, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 0, 166, 0.0F, -32.4F, 32.9F, 1, 1, 1, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 121, 110, 0.1F, -33.6F, 38.4F, 1, 2, 2, 0.1F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 165, 164, -4.1F, -32.7F, 39.6F, 1, 1, 1, 0.1F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -32.8849F, 35.1021F);
		barrelandreciever.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.7854F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 5, 166, 0.0F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -32.8849F, 34.1021F);
		barrelandreciever.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.7854F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 10, 166, 0.0F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -33.8849F, 34.1021F);
		barrelandreciever.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.7854F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 20, 166, 0.0F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -33.8849F, 35.1021F);
		barrelandreciever.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.7854F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 35, 166, 0.0F, 0.9F, -0.8F, 1, 1, 1, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.925F, -32.6071F, 33.7071F);
		barrelandreciever.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, -0.1745F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 159, 115, -0.5F, -0.5F, -2.0F, 1, 1, 3, -0.3F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, -29.5F, 23.5F);
		barrelandreciever.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.2618F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 133, 28, -2.5F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 110, 158, -3.0F, -2.0F, 0.0F, 3, 2, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.525F, -34.6903F, 35.153F);
		barrelandreciever.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.5672F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 143, 110, 1.5F, -1.5F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-1.525F, -34.6903F, 31.847F);
		barrelandreciever.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.5672F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 143, 132, 1.5F, -1.5F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-2.0F, -30.7397F, 36.0311F);
		barrelandreciever.addChild(cube_r9);
		setRotationAngle(cube_r9, 1.3526F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 81, 102, -1.5F, -3.4F, -0.5F, 4, 2, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-2.0F, -30.0957F, 35.9523F);
		barrelandreciever.addChild(cube_r10);
		setRotationAngle(cube_r10, 1.0036F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 41, 61, -1.5F, -1.8F, -0.5F, 4, 1, 1, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-2.0F, -29.7729F, 35.8328F);
		barrelandreciever.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.7854F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 141, 89, -1.5F, -1.5F, -0.5F, 4, 2, 2, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-2.0F, -29.6501F, 35.8221F);
		barrelandreciever.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.6109F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 96, 115, -1.5F, -0.5F, -0.5F, 4, 2, 1, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-2.0F, -28.6272F, 36.3265F);
		barrelandreciever.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.3054F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 41, 114, -1.5F, -0.5F, -0.5F, 4, 1, 1, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-2.817F, -28.183F, 37.5F);
		barrelandreciever.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -1.0472F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 93, 121, -0.5F, -0.5F, -1.5F, 1, 1, 5, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-0.183F, -28.183F, 37.5F);
		barrelandreciever.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, 1.0472F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 143, 110, -0.5F, -0.5F, -1.5F, 1, 1, 5, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-1.5F, -31.1172F, 24.2F);
		barrelandreciever.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.7854F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 90, 93, -2.2F, -0.5F, -0.5F, 5, 1, 1, -0.3F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 136, -2.8F, -0.5F, -0.5F, 2, 1, 1, -0.3F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-1.5F, -31.1172F, 13.8F);
		barrelandreciever.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.7854F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 68, 102, -2.2F, -0.5F, -0.5F, 5, 1, 1, -0.3F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 132, 137, -2.8F, -0.5F, -0.5F, 2, 1, 1, -0.3F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-0.4929F, -37.6071F, -35.4F);
		barrelandreciever.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, -0.7854F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 110, 142, -1.0F, -1.0F, 2.0F, 1, 1, 6, -0.2F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-1.8828F, -37.6899F, -33.1F);
		barrelandreciever.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, -0.7854F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 55, 142, -0.5F, -0.3828F, -0.3F, 1, 1, 6, -0.2F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-0.4929F, -37.0071F, -35.4F);
		barrelandreciever.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, -0.7854F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 132, 89, -1.0F, -1.0F, 2.0F, 1, 1, 6, -0.2F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-1.0929F, -37.0071F, -35.4F);
		barrelandreciever.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, -0.7854F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 78, 121, -1.0F, -1.0F, 2.0F, 1, 1, 6, -0.2F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-0.3929F, -34.6657F, -93.0F);
		barrelandreciever.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, -0.7854F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 95, 33, -1.0F, -1.0F, 41.0F, 1, 1, 4, -0.1F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 150, 119, -1.0F, -1.0F, 40.2F, 1, 1, 1, -0.1F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 154, 56, -1.0F, -1.0F, 44.8F, 1, 1, 2, -0.1F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 110, 0, -1.0F, -1.0F, 53.6F, 1, 1, 52, -0.1F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-0.3929F, -35.4657F, -93.0F);
		barrelandreciever.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, -0.7854F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 40, 79, -1.0F, -1.0F, 41.0F, 1, 1, 4, -0.1F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 153, -1.0F, -1.0F, 40.2F, 1, 1, 1, -0.1F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 133, 70, -1.0F, -1.0F, 44.8F, 1, 1, 2, -0.1F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 54, -1.0F, -1.0F, 53.6F, 1, 1, 52, -0.1F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-1.1929F, -35.4657F, -93.0F);
		barrelandreciever.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, -0.7854F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 41, 73, -1.0F, -1.0F, 41.0F, 1, 1, 4, -0.1F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 151, 132, -1.0F, -1.0F, 40.2F, 1, 1, 1, -0.1F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 44, 147, -1.0F, -1.0F, 44.8F, 1, 1, 2, -0.1F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 55, 2, -1.0F, -1.0F, 53.6F, 1, 1, 52, -0.1F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-1.1929F, -34.6657F, -93.0F);
		barrelandreciever.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.0F, -0.7854F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 40, 14, -1.0F, -1.0F, 41.0F, 1, 1, 4, -0.1F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 83, 145, -1.0F, -1.0F, 40.2F, 1, 1, 1, -0.1F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 154, 89, -1.0F, -1.0F, 44.8F, 1, 1, 2, -0.1F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 110, 54, -1.0F, -1.0F, 53.6F, 1, 1, 52, -0.1F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-0.4929F, -35.3571F, -83.9F);
		barrelandreciever.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, -0.7854F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 110, 56, -1.0F, -1.0F, 37.0F, 1, 1, 8, -0.2F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(-1.0929F, -35.3571F, -83.9F);
		barrelandreciever.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, 0.0F, -0.7854F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 55, 110, -1.0F, -1.0F, 37.0F, 1, 1, 8, -0.2F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-0.4929F, -34.7571F, -83.9F);
		barrelandreciever.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, 0.0F, -0.7854F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 110, 10, -1.0F, -1.0F, 37.0F, 1, 1, 8, -0.2F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(-1.0929F, -34.7571F, -83.9F);
		barrelandreciever.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.0F, 0.0F, -0.7854F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 110, 0, -1.0F, -1.0F, 37.0F, 1, 1, 8, -0.2F, false));

		frontsight = new ModelRenderer(this);
		frontsight.setRotationPoint(0.0F, 0.0F, -2.0F);
		gun.addChild(frontsight);
		frontsight.cubeList.add(new ModelBox(frontsight, 147, 124, -1.2F, -43.1459F, -34.244F, 1, 1, 3, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 147, 146, -2.8F, -43.1459F, -34.244F, 1, 1, 3, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 77, 145, -1.2F, -43.3459F, -34.244F, 1, 1, 3, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 86, 145, -2.8F, -43.3459F, -34.244F, 1, 1, 3, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 22, 144, -1.2F, -43.5243F, -33.6119F, 1, 1, 3, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 31, 144, -2.8F, -43.5243F, -33.6119F, 1, 1, 3, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 70, 164, -1.2F, -43.5243F, -34.2369F, 1, 1, 2, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 77, 164, -2.8F, -43.5243F, -34.2369F, 1, 1, 2, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 143, 13, -2.5F, -44.8F, -34.0F, 2, 2, 2, -0.2F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 119, 142, -2.5F, -44.8F, -33.15F, 2, 2, 2, -0.2F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 9, 141, -2.5F, -45.5F, -33.15F, 2, 2, 2, -0.2F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 64, 142, -2.5F, -45.5F, -34.0F, 2, 2, 2, -0.2F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 119, 120, -0.4893F, -47.5847F, -34.2F, 1, 2, 3, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 121, 0, -3.4475F, -47.5847F, -34.2F, 1, 2, 3, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 45, 48, -0.7893F, -47.0847F, -33.175F, 1, 1, 2, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 54, 164, -3.1475F, -47.0847F, -33.175F, 1, 1, 2, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 42, 162, -0.7893F, -47.0847F, -33.3F, 1, 1, 2, -0.3F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 49, 162, -3.1475F, -47.0847F, -33.3F, 1, 1, 2, -0.3F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 77, 132, -2.6367F, -48.4695F, -34.2F, 2, 1, 3, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 87, 121, -2.3F, -48.4695F, -34.2F, 2, 1, 3, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 165, 161, -2.0F, -46.0F, -33.55F, 1, 1, 1, -0.2F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 151, 110, -2.0F, -47.1F, -33.55F, 1, 2, 1, -0.4F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(-1.5F, -43.8F, -32.0F);
		frontsight.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.2182F, 0.0F, 0.0F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 12, 36, -1.0F, -0.8F, -1.0F, 2, 4, 2, -0.2F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(-2.5684F, -47.5595F, -33.2F);
		frontsight.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.0F, 0.0F, 0.7418F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 66, 120, -0.5F, -1.0F, -1.0F, 1, 2, 3, -0.4F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(-0.3684F, -47.5595F, -33.2F);
		frontsight.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.0F, 0.0F, -0.7418F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 11, 118, -0.5F, -1.0F, -1.0F, 1, 2, 3, -0.4F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(-2.5684F, -45.6099F, -33.2F);
		frontsight.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.0F, 0.0F, -0.7418F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 121, 10, -0.5F, -1.0F, -1.0F, 1, 2, 3, -0.4F, false));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(-0.3684F, -45.6099F, -33.2F);
		frontsight.addChild(cube_r34);
		setRotationAngle(cube_r34, 0.0F, 0.0F, 0.7418F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 121, 23, -0.5F, -1.0F, -1.0F, 1, 2, 3, -0.4F, false));

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(-0.7F, -40.2851F, -31.4535F);
		frontsight.addChild(cube_r35);
		setRotationAngle(cube_r35, 0.3054F, 0.0F, 0.0F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 133, 0, -0.5F, -2.975F, -1.325F, 1, 2, 3, -0.4F, false));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 121, 66, -2.1F, -2.975F, -1.325F, 1, 2, 3, -0.4F, false));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 55, 0, -2.1F, -3.275F, -2.0F, 1, 4, 2, -0.4F, false));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 25, 38, -0.5F, -3.275F, -2.0F, 1, 4, 2, -0.4F, false));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 55, 56, -0.5F, -2.975F, -2.0F, 1, 4, 2, -0.4F, false));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 55, 11, -2.1F, -2.975F, -2.0F, 1, 4, 2, -0.4F, false));

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(-0.7F, -40.2851F, -30.7535F);
		frontsight.addChild(cube_r36);
		setRotationAngle(cube_r36, 0.3054F, 0.0F, 0.0F);
		cube_r36.cubeList.add(new ModelBox(cube_r36, 66, 89, -0.5F, -2.0F, -2.0F, 1, 3, 3, -0.4F, false));
		cube_r36.cubeList.add(new ModelBox(cube_r36, 41, 38, -1.7F, -2.0F, -2.1F, 2, 3, 3, -0.4F, false));
		cube_r36.cubeList.add(new ModelBox(cube_r36, 41, 54, -1.9F, -2.0F, -2.1F, 2, 3, 3, -0.4F, false));
		cube_r36.cubeList.add(new ModelBox(cube_r36, 11, 108, -2.1F, -2.0F, -2.0F, 1, 3, 3, -0.4F, false));

		irons = new ModelRenderer(this);
		irons.setRotationPoint(-6.5F, -37.5F, 10.25F);
		gun.addChild(irons);
		irons.cubeList.add(new ModelBox(irons, 165, 46, 4.5F, -10.35F, -1.75F, 1, 1, 2, -0.35F, false));
		irons.cubeList.add(new ModelBox(irons, 165, 34, 4.2F, -10.35F, -1.75F, 1, 1, 2, -0.35F, false));
		irons.cubeList.add(new ModelBox(irons, 165, 28, 4.8F, -10.35F, -1.75F, 1, 1, 2, -0.35F, false));
		irons.cubeList.add(new ModelBox(irons, 133, 23, 3.9F, -10.15F, -1.7F, 1, 2, 2, -0.4F, false));
		irons.cubeList.add(new ModelBox(irons, 132, 132, 5.1F, -10.15F, -1.7F, 1, 2, 2, -0.4F, false));
		irons.cubeList.add(new ModelBox(irons, 137, 158, 4.0F, -9.0F, -1.8F, 2, 1, 2, -0.3F, false));
		irons.cubeList.add(new ModelBox(irons, 77, 137, 3.5F, -8.8F, -1.799F, 3, 2, 2, -0.3F, false));

		cube_r189 = new ModelRenderer(this);
		cube_r189.setRotationPoint(3.9F, -10.7F, -1.7F);
		irons.addChild(cube_r189);
		setRotationAngle(cube_r189, 0.0F, 0.0F, 0.7854F);
		cube_r189.cubeList.add(new ModelBox(cube_r189, 165, 24, 1.4142F, 0.4142F, -0.001F, 1, 1, 2, -0.4F, false));
		cube_r189.cubeList.add(new ModelBox(cube_r189, 165, 20, 1.2142F, 0.4142F, -0.001F, 1, 1, 2, -0.4F, false));

		cube_r190 = new ModelRenderer(this);
		cube_r190.setRotationPoint(6.1F, -10.7F, -1.7F);
		irons.addChild(cube_r190);
		setRotationAngle(cube_r190, 0.0F, 0.0F, -0.7854F);
		cube_r190.cubeList.add(new ModelBox(cube_r190, 165, 16, -2.4142F, 0.4142F, -0.001F, 1, 1, 2, -0.4F, false));
		cube_r190.cubeList.add(new ModelBox(cube_r190, 165, 12, -2.2142F, 0.4142F, -0.001F, 1, 1, 2, -0.4F, false));

		cube_r191 = new ModelRenderer(this);
		cube_r191.setRotationPoint(3.85F, -11.8F, -1.7F);
		irons.addChild(cube_r191);
		setRotationAngle(cube_r191, 0.0F, 0.0F, -0.7854F);
		cube_r191.cubeList.add(new ModelBox(cube_r191, 165, 8, -1.4842F, 1.4182F, -0.048F, 1, 1, 2, -0.35F, false));
		cube_r191.cubeList.add(new ModelBox(cube_r191, 165, 42, -1.4292F, 1.4192F, -0.049F, 1, 1, 2, -0.35F, false));

		cube_r192 = new ModelRenderer(this);
		cube_r192.setRotationPoint(3.9F, -11.7F, -1.7F);
		irons.addChild(cube_r192);
		setRotationAngle(cube_r192, 0.0F, 0.0F, -0.7854F);
		cube_r192.cubeList.add(new ModelBox(cube_r192, 165, 4, -1.6142F, 1.4142F, -0.001F, 1, 1, 2, -0.4F, false));
		cube_r192.cubeList.add(new ModelBox(cube_r192, 165, 0, -1.4142F, 1.4142F, -0.001F, 1, 1, 2, -0.4F, false));

		cube_r193 = new ModelRenderer(this);
		cube_r193.setRotationPoint(6.1F, -11.7F, -1.7F);
		irons.addChild(cube_r193);
		setRotationAngle(cube_r193, 0.0F, 0.0F, 0.7854F);
		cube_r193.cubeList.add(new ModelBox(cube_r193, 149, 164, 0.4142F, 1.4142F, -0.001F, 1, 1, 2, -0.4F, false));
		cube_r193.cubeList.add(new ModelBox(cube_r193, 164, 148, 0.6142F, 1.4142F, -0.001F, 1, 1, 2, -0.4F, false));

		cube_r194 = new ModelRenderer(this);
		cube_r194.setRotationPoint(6.15F, -11.8F, -1.7F);
		irons.addChild(cube_r194);
		setRotationAngle(cube_r194, 0.0F, 0.0F, 0.7854F);
		cube_r194.cubeList.add(new ModelBox(cube_r194, 164, 144, 0.4842F, 1.4182F, -0.048F, 1, 1, 2, -0.35F, false));
		cube_r194.cubeList.add(new ModelBox(cube_r194, 165, 38, 0.4292F, 1.4192F, -0.049F, 1, 1, 2, -0.35F, false));
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