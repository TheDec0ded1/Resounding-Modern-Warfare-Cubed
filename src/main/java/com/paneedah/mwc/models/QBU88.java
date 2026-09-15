package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBU88 extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer grip_r1;
	private final ModelRenderer grip_r2;
	private final ModelRenderer grip_r3;
	private final ModelRenderer grip_r4;
	private final ModelRenderer barrel;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer barrelandreciever;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r31;
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;

	public QBU88() {
		textureWidth = 576;
		textureHeight = 576;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 23.1F, -31.0F);
		gun.cubeList.add(new ModelBox(gun, 554, 60, -5.0F, -32.2F, 41.0F, 2, 2, 2, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 554, 112, -5.4F, -33.2F, 76.0F, 2, 2, 2, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 206, 555, -5.1F, -32.7F, 75.2F, 2, 1, 2, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 554, 481, -4.7F, -31.7F, 40.2F, 2, 1, 2, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 554, 126, 0.2F, -33.2F, 76.0F, 2, 2, 2, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 554, 90, -0.4F, -32.2F, 41.0F, 2, 2, 2, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 390, 385, -4.5F, -38.2F, -13.5F, 6, 2, 2, -0.2F, false));

		grip_r1 = new ModelRenderer(this);
		grip_r1.setRotationPoint(-1.5F, -29.8029F, 23.5804F);
		gun.addChild(grip_r1);
		setRotationAngle(grip_r1, 0.2182F, 0.0F, 0.0F);
		grip_r1.cubeList.add(new ModelBox(grip_r1, 562, 104, -0.5F, -1.4773F, 0.0193F, 1, 1, 1, 0.0F, false));

		grip_r2 = new ModelRenderer(this);
		grip_r2.setRotationPoint(-1.5F, -29.8029F, 23.5804F);
		gun.addChild(grip_r2);
		setRotationAngle(grip_r2, -0.9599F, 0.0F, 0.0F);
		grip_r2.cubeList.add(new ModelBox(grip_r2, 148, 561, -0.5F, 0.4576F, 0.109F, 1, 1, 1, 0.0F, false));

		grip_r3 = new ModelRenderer(this);
		grip_r3.setRotationPoint(-1.5F, -29.8029F, 23.5804F);
		gun.addChild(grip_r3);
		setRotationAngle(grip_r3, -0.5236F, 0.0F, 0.0F);
		grip_r3.cubeList.add(new ModelBox(grip_r3, 144, 561, -0.5F, -0.1166F, -0.1883F, 1, 1, 1, 0.0F, false));

		grip_r4 = new ModelRenderer(this);
		grip_r4.setRotationPoint(-1.5F, -29.8029F, 23.5804F);
		gun.addChild(grip_r4);
		setRotationAngle(grip_r4, -0.1309F, 0.0F, 0.0F);
		grip_r4.cubeList.add(new ModelBox(grip_r4, 140, 561, -0.5F, -0.7971F, -0.2054F, 1, 1, 1, 0.0F, false));

		barrel = new ModelRenderer(this);
		barrel.setRotationPoint(0.0F, 0.0F, 0.0F);
		gun.addChild(barrel);
		barrel.cubeList.add(new ModelBox(barrel, 178, 89, -2.0F, -35.0F, -37.4F, 1, 1, 81, -0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 178, 171, -2.5657F, -35.5657F, -37.4F, 1, 1, 81, -0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 178, 253, -1.4343F, -35.5657F, -37.4F, 1, 1, 81, -0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 267, -2.0F, -36.1314F, -37.4F, 1, 1, 81, -0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 282, 335, -2.0F, -37.4314F, -11.4F, 1, 1, 53, -0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 434, 560, -2.5657F, -35.5657F, -44.4F, 1, 1, 1, -0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 430, 560, -2.0F, -36.1314F, -44.4F, 1, 1, 1, -0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 426, 560, -1.4343F, -35.5657F, -44.4F, 1, 1, 1, -0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 422, 560, -2.0F, -35.0F, -44.4F, 1, 1, 1, -0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 394, 463, -2.5F, -37.7314F, -14.9F, 2, 3, 4, -0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 560, 366, -2.0F, -36.2564F, -33.8F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 560, 368, -1.2929F, -35.5493F, -33.8F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 560, 370, -2.7071F, -35.5493F, -33.8F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 560, 372, -2.0F, -34.8422F, -33.8F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 560, 374, -2.0F, -36.2564F, -36.8F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 560, 376, -1.2929F, -35.5493F, -36.8F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 560, 378, -2.7071F, -35.5493F, -36.8F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 386, 560, -2.0F, -34.8422F, -36.8F, 1, 1, 1, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-1.2929F, -34.5493F, -75.8F);
		barrel.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, -0.7854F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 390, 560, -1.0F, -1.0F, 39.0F, 1, 1, 1, 0.0F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 394, 560, -1.0F, -1.0F, 42.0F, 1, 1, 1, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-0.2929F, -34.5493F, -75.8F);
		barrel.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, -0.7854F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 560, 396, -1.0F, -1.0F, 39.0F, 1, 1, 1, 0.0F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 560, 398, -1.0F, -1.0F, 42.0F, 1, 1, 1, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-1.2929F, -35.5493F, -75.8F);
		barrel.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, -0.7854F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 560, 400, -1.0F, -1.0F, 39.0F, 1, 1, 1, 0.0F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 410, 560, -1.0F, -1.0F, 42.0F, 1, 1, 1, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-0.2929F, -35.5493F, -75.8F);
		barrel.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, -0.7854F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 414, 560, -1.0F, -1.0F, 39.0F, 1, 1, 1, 0.0F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 418, 560, -1.0F, -1.0F, 42.0F, 1, 1, 1, 0.0F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(-0.3929F, -35.4657F, -32.4F);
		barrel.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, 0.0F, -0.7854F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 0, -1.0F, -1.0F, -12.0F, 1, 1, 88, -0.1F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-1.1929F, -35.4657F, -32.4F);
		barrel.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, 0.0F, -0.7854F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 89, -1.0F, -1.0F, -12.0F, 1, 1, 88, -0.1F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(-0.3929F, -34.6657F, -32.4F);
		barrel.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.0F, 0.0F, -0.7854F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 178, -1.0F, -1.0F, -12.0F, 1, 1, 88, -0.1F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(-1.1929F, -34.6657F, -32.4F);
		barrel.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.0F, 0.0F, -0.7854F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 178, 0, -1.0F, -1.0F, -12.0F, 1, 1, 88, -0.1F, false));

		barrelandreciever = new ModelRenderer(this);
		barrelandreciever.setRotationPoint(0.0F, 2.2F, 31.3F);
		gun.addChild(barrelandreciever);
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 542, 227, -3.7F, -34.7F, 11.7F, 5, 4, 1, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 200, 555, -4.3F, -34.7F, 11.7F, 2, 4, 1, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 482, 556, 0.3F, -35.7F, 11.7F, 1, 2, 2, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 556, 447, -4.3F, -35.7F, 11.7F, 1, 2, 2, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 200, 537, -3.7F, -30.225F, 23.3033F, 5, 1, 17, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 364, 538, -4.3F, -30.225F, 23.3033F, 2, 1, 17, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 242, 458, -3.0F, -32.0F, 28.0F, 3, 1, 13, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 432, 93, -3.8F, -35.0F, 12.0F, 1, 4, 29, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 432, 126, -0.2F, -35.0F, 12.0F, 1, 4, 29, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 442, 539, -3.8F, -31.0F, 22.0F, 1, 1, 19, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 128, 539, -0.2F, -31.0F, 22.0F, 1, 1, 19, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 284, 537, -4.2F, -30.4F, 22.4F, 1, 1, 19, -0.4F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 244, 537, 0.2F, -30.4F, 22.4F, 1, 1, 19, -0.4F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 466, 455, -4.25F, -35.0F, 13.0F, 1, 1, 28, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 470, 425, 0.5F, -35.0F, 13.0F, 1, 1, 28, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 548, 50, 0.0F, -34.925F, 23.6033F, 1, 5, 2, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 548, 57, -4.0F, -34.925F, 23.6033F, 1, 5, 2, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 40, 549, 0.0F, -34.925F, 36.6033F, 1, 5, 2, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 34, 549, -4.0F, -34.925F, 36.6033F, 1, 5, 2, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 448, 245, -2.5F, -42.101F, -14.0F, 2, 1, 11, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 406, 385, -3.0F, -42.1F, -6.0F, 3, 1, 3, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 356, 76, -3.0F, -41.7F, -15.0F, 3, 1, 12, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 518, 349, -3.0F, -42.1F, -10.0F, 3, 1, 3, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 450, 508, -3.0F, -42.1F, -14.0F, 3, 1, 3, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 522, 553, -2.5F, -30.25F, 27.9F, 2, 2, 2, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 264, 557, -2.0F, -30.5F, 29.15F, 1, 2, 2, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.0F, -27.8F, 24.2F);
		barrelandreciever.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.2618F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 556, 220, -2.5F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 554, 116, -3.0F, -2.0F, 0.0F, 3, 2, 1, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-1.5F, -28.0F, 29.7F);
		barrelandreciever.addChild(cube_r18);
		setRotationAngle(cube_r18, -0.1309F, 0.0F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 222, 503, -2.3F, -2.0F, -14.5F, 1, 1, 9, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 540, 243, 1.3F, -2.0F, -14.5F, 1, 1, 9, 0.0F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-1.5F, -30.8459F, 15.103F);
		barrelandreciever.addChild(cube_r23);
		setRotationAngle(cube_r23, -0.1309F, 0.0F, 0.0F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 536, 539, -2.8F, -0.5F, -3.1F, 1, 1, 12, -0.3F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 540, 1.8F, -0.5F, -3.1F, 1, 1, 12, -0.3F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-1.5F, -31.325F, 12.4F);
		barrelandreciever.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.7854F, 0.0F, 0.0F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 544, 560, 1.8F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 548, 560, -2.8F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-1.5F, -29.925F, 23.6F);
		barrelandreciever.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.7854F, 0.0F, 0.0F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 536, 560, 1.8F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 540, 560, -2.8F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-1.5F, -34.025F, 23.6F);
		barrelandreciever.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.7854F, 0.0F, 0.0F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 492, 560, 1.8F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 522, 560, -2.8F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(-1.5F, -34.0F, 12.4F);
		barrelandreciever.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.7854F, 0.0F, 0.0F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 484, 560, 1.8F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 488, 560, -2.8F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, -43.1F, 31.0F);
		gun.addChild(bone4);
		bone4.cubeList.add(new ModelBox(bone4, 54, 488, -1.0F, 1.65F, 8.5F, 1, 3, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 480, 249, -3.0F, 1.65F, 8.5F, 1, 3, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 510, 559, -1.0F, 2.3571F, 9.2071F, 1, 2, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 506, 559, -3.0F, 2.3571F, 9.2071F, 1, 2, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 518, 559, -1.0F, 2.3571F, 7.7929F, 1, 2, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 514, 559, -3.0F, 2.3571F, 7.7929F, 1, 2, 1, 0.0F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(-3.0F, 2.3571F, 10.2071F);
		bone4.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.7854F, 0.0F, 0.0F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 52, 561, 0.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 56, 561, 2.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(-1.0F, 2.3571F, 9.2071F);
		bone4.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.7854F, 0.0F, 0.0F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 44, 561, 0.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 48, 561, -2.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));
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