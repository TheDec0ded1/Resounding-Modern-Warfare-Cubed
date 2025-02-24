package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBU88 extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer barrel;
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
	private final ModelRenderer barrelandreciever;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;

	public QBU88() {
		textureWidth = 576;
		textureHeight = 576;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 23.1F, -31.0F);
		gun.cubeList.add(new ModelBox(gun, 169, 472, -5.0F, -32.2F, 41.0F, 2, 2, 2, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 152, 537, -5.4F, -33.2F, 76.0F, 2, 2, 2, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 538, -5.1F, -32.7F, 75.2F, 2, 1, 2, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 433, 375, -4.7F, -31.7F, 40.2F, 2, 1, 2, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 161, 537, 0.2F, -33.2F, 76.0F, 2, 2, 2, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 536, 495, -0.4F, -32.2F, 41.0F, 2, 2, 2, -0.3F, false));

		barrel = new ModelRenderer(this);
		barrel.setRotationPoint(0.0F, 0.0F, 0.0F);
		gun.addChild(barrel);
		barrel.cubeList.add(new ModelBox(barrel, 0, 180, -2.0F, -35.0F, -37.4F, 1, 1, 81, -0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 165, 180, -2.5657F, -35.5657F, -37.4F, 1, 1, 81, -0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 263, -1.4343F, -35.5657F, -37.4F, 1, 1, 81, -0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 165, 263, -2.0F, -36.1314F, -37.4F, 1, 1, 81, -0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 400, 544, -2.5657F, -35.5657F, -44.4F, 1, 1, 1, -0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 395, 544, -2.0F, -36.1314F, -44.4F, 1, 1, 1, -0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 390, 544, -1.4343F, -35.5657F, -44.4F, 1, 1, 1, -0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 385, 544, -2.0F, -35.0F, -44.4F, 1, 1, 1, -0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 120, 527, -2.5F, -37.7314F, -14.9F, 2, 3, 4, -0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 544, 110, -2.0F, -36.2564F, -33.8F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 544, 113, -1.2929F, -35.5493F, -33.8F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 544, 116, -2.7071F, -35.5493F, -33.8F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 544, 119, -2.0F, -34.8422F, -33.8F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 544, 122, -2.0F, -36.2564F, -36.8F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 544, 125, -1.2929F, -35.5493F, -36.8F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 544, 128, -2.7071F, -35.5493F, -36.8F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 544, 152, -2.0F, -34.8422F, -36.8F, 1, 1, 1, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-1.2929F, -34.5493F, -75.8F);
		barrel.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, -0.7854F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 544, 155, -1.0F, -1.0F, 39.0F, 1, 1, 1, 0.0F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 544, 284, -1.0F, -1.0F, 42.0F, 1, 1, 1, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-0.2929F, -34.5493F, -75.8F);
		barrel.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, -0.7854F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 544, 287, -1.0F, -1.0F, 39.0F, 1, 1, 1, 0.0F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 340, 544, -1.0F, -1.0F, 42.0F, 1, 1, 1, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-1.2929F, -35.5493F, -75.8F);
		barrel.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, -0.7854F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 345, 544, -1.0F, -1.0F, 39.0F, 1, 1, 1, 0.0F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 370, 544, -1.0F, -1.0F, 42.0F, 1, 1, 1, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-0.2929F, -35.5493F, -75.8F);
		barrel.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, -0.7854F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 375, 544, -1.0F, -1.0F, 39.0F, 1, 1, 1, 0.0F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 380, 544, -1.0F, -1.0F, 42.0F, 1, 1, 1, 0.0F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-0.3929F, -38.0657F, -32.4F);
		barrel.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, -0.7854F);
		

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-1.1929F, -38.0657F, -32.4F);
		barrel.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, -0.7854F);
		

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-0.3929F, -37.2657F, -32.4F);
		barrel.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.0F, -0.7854F);
		

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-1.1929F, -37.2657F, -32.4F);
		barrel.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, -0.7854F);
		

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(-0.3929F, -35.4657F, -32.4F);
		barrel.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, 0.0F, -0.7854F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 0, -1.0F, -1.0F, -12.0F, 1, 1, 88, -0.1F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-1.1929F, -35.4657F, -32.4F);
		barrel.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, 0.0F, -0.7854F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 90, -1.0F, -1.0F, -12.0F, 1, 1, 88, -0.1F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(-0.3929F, -34.6657F, -32.4F);
		barrel.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.0F, 0.0F, -0.7854F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 179, 0, -1.0F, -1.0F, -12.0F, 1, 1, 88, -0.1F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(-1.1929F, -34.6657F, -32.4F);
		barrel.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.0F, 0.0F, -0.7854F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 179, 90, -1.0F, -1.0F, -12.0F, 1, 1, 88, -0.1F, false));

		barrelandreciever = new ModelRenderer(this);
		barrelandreciever.setRotationPoint(0.0F, 2.2F, 31.3F);
		gun.addChild(barrelandreciever);
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 396, 174, -3.7F, -34.7F, 11.7F, 5, 4, 1, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 486, 538, -4.3F, -34.7F, 11.7F, 2, 4, 1, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 540, 318, 0.3F, -35.7F, 11.7F, 1, 2, 2, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 540, 313, -4.3F, -35.7F, 11.7F, 1, 2, 2, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 47, 503, -3.7F, -30.225F, 23.3033F, 5, 1, 17, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 268, 385, -4.3F, -30.225F, 23.3033F, 2, 1, 17, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 479, 523, -3.0F, -32.0F, 28.0F, 3, 1, 13, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 409, 174, -3.8F, -35.0F, 12.0F, 1, 4, 29, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 409, 208, -0.2F, -35.0F, 12.0F, 1, 4, 29, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 174, 505, -3.8F, -31.0F, 22.0F, 1, 1, 19, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 133, 505, -0.2F, -31.0F, 22.0F, 1, 1, 19, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 517, 474, -4.2F, -30.4F, 22.4F, 1, 1, 19, -0.4F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 506, 375, 0.2F, -30.4F, 22.4F, 1, 1, 19, -0.4F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 431, 0, -4.25F, -35.0F, 13.0F, 1, 1, 28, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 431, 30, 0.5F, -35.0F, 13.0F, 1, 1, 28, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 244, 533, 0.0F, -34.925F, 23.6033F, 1, 5, 2, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 251, 533, -4.0F, -34.925F, 23.6033F, 1, 5, 2, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 88, 535, 0.0F, -34.925F, 36.6033F, 1, 5, 2, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 418, 534, -4.0F, -34.925F, 36.6033F, 1, 5, 2, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 525, 185, -2.5F, -42.1F, -14.0F, 2, 1, 11, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 527, 334, -3.0F, -42.1F, -6.0F, 3, 1, 3, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 431, 60, -3.0F, -41.7F, -15.0F, 3, 1, 12, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 527, 344, -3.0F, -42.1F, -10.0F, 3, 1, 3, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 527, 339, -3.0F, -42.1F, -14.0F, 3, 1, 3, -0.3F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 537, 76, -2.5F, -30.25F, 27.9F, 2, 2, 2, 0.0F, false));
		barrelandreciever.cubeList.add(new ModelBox(barrelandreciever, 319, 540, -2.0F, -30.5F, 29.15F, 1, 2, 2, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -27.8F, 24.2F);
		barrelandreciever.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.2618F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 295, 542, -2.5F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 538, 56, -3.0F, -2.0F, 0.0F, 3, 2, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.5F, -28.0F, 29.7F);
		barrelandreciever.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.1309F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 448, 242, -2.3F, -2.0F, -14.5F, 1, 1, 9, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 525, 244, 1.3F, -2.0F, -14.5F, 1, 1, 9, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1.5F, -30.8459F, 15.103F);
		barrelandreciever.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.1309F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 524, -2.8F, -0.5F, -3.1F, 1, 1, 12, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 525, 159, 1.8F, -0.5F, -3.1F, 1, 1, 12, -0.3F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.5F, -31.325F, 12.4F);
		barrelandreciever.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.7854F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 464, 544, 1.8F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 469, 544, -2.8F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.5F, -29.925F, 23.6F);
		barrelandreciever.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.7854F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 454, 544, 1.8F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 459, 544, -2.8F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-1.5F, -34.025F, 23.6F);
		barrelandreciever.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.7854F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 444, 544, 1.8F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 449, 544, -2.8F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.5F, -34.0F, 12.4F);
		barrelandreciever.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.7854F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 434, 544, 1.8F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 439, 544, -2.8F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, -43.1F, 31.0F);
		gun.addChild(bone4);
		bone4.cubeList.add(new ModelBox(bone4, 164, 485, -1.0F, 1.65F, 8.5F, 1, 3, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 291, 481, -3.0F, 1.65F, 8.5F, 1, 3, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 62, 543, -1.0F, 2.3571F, 9.2071F, 1, 2, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 419, 542, -3.0F, 2.3571F, 9.2071F, 1, 2, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 92, 543, -1.0F, 2.3571F, 7.7929F, 1, 2, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 87, 543, -3.0F, 2.3571F, 7.7929F, 1, 2, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-3.0F, 2.3571F, 10.2071F);
		bone4.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.7854F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 127, 545, 0.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 132, 545, 2.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-1.0F, 2.3571F, 9.2071F);
		bone4.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.7854F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 117, 545, 0.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 122, 545, -2.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));
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