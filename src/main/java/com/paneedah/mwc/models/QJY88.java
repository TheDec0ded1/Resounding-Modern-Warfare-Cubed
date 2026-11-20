package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QJY88 extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer DustCover21_r1;
	private final ModelRenderer DustCover22_r1;
	private final ModelRenderer DustCover29_r1;
	private final ModelRenderer DustCover27_r1;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer grip_r1;
	private final ModelRenderer grip_r2;
	private final ModelRenderer grip_r3;
	private final ModelRenderer grip_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer opticmount;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;

	public QJY88() {
		textureWidth = 512;
		textureHeight = 512;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 26.0F, 2.0F);
		gun.cubeList.add(new ModelBox(gun, 262, 152, -3.5F, -36.0F, -15.0F, 4, 1, 18, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 100, 94, -4.0F, -37.0F, -33.0F, 5, 1, 37, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 384, 475, -4.0F, -42.0F, -37.0F, 5, 6, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 134, 494, -3.5F, -44.0F, -34.0F, 4, 2, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 314, 454, -4.25F, -37.05F, -18.0F, 1, 1, 22, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 360, 454, -4.05F, -41.45F, -16.0F, 1, 1, 20, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 184, 50, 0.0F, -40.0F, -33.0F, 1, 3, 37, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 156, 467, -3.5F, -39.0F, 4.0F, 4, 6, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 408, 136, -4.0F, -42.0F, 4.0F, 5, 3, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 318, 502, -3.0F, -39.0F, 7.0F, 3, 3, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 328, 497, 0.5F, -42.0F, 4.0F, 1, 2, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 380, 318, -4.5F, -44.0F, 4.0F, 6, 2, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 392, 185, -4.5F, -45.0F, 5.0F, 6, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 364, 208, -4.5F, -42.9936F, 7.0065F, 6, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 100, 50, 0.5F, -42.0F, -37.0F, 1, 3, 41, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 444, 227, -4.5F, -40.0F, -21.0F, 1, 1, 25, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 388, 35, -4.5F, -39.0F, 2.0F, 6, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 422, 0, -5.1F, -42.2F, -21.2F, 3, 1, 27, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 100, 132, -1.1F, -42.199F, -33.2F, 2, 1, 39, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 470, 111, -4.1F, -42.199F, -32.8F, 2, 1, 12, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 506, 106, -5.1F, -41.9F, 4.8F, 2, 2, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 422, 356, -5.1F, -40.7F, -21.2F, 2, 1, 27, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 480, 358, -4.75F, -40.75F, -29.25F, 2, 1, 9, -0.25F, false));
		gun.cubeList.add(new ModelBox(gun, 170, 444, -4.75F, -42.25F, -29.25F, 2, 1, 9, -0.25F, false));
		gun.cubeList.add(new ModelBox(gun, 152, 456, -4.5F, -42.0F, -37.0F, 1, 3, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 456, 492, -4.0F, -40.0F, -33.0F, 1, 3, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 444, 199, -4.0F, -40.0F, -21.0F, 1, 3, 25, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 28, 465, -3.5F, -35.0F, -15.0F, 4, 3, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 378, 487, -2.5F, -32.0F, -7.0F, 2, 4, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 20, 489, -2.5F, -28.2929F, -13.7071F, 2, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 506, 414, 0.75F, -41.75F, -32.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 506, 416, 0.75F, -40.75F, -36.5F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 506, 456, 0.25F, -37.5F, -36.5F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 506, 458, -4.25F, -37.5F, -36.5F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 278, 508, -3.75F, -35.5F, -14.5F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 274, 508, -0.25F, -35.5F, -14.5F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 442, 506, -4.75F, -41.75F, -32.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 506, 418, -4.75F, -40.75F, -36.5F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 210, 508, -4.75F, -39.35F, 2.475F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 206, 508, 0.75F, -39.35F, 2.475F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 266, 508, 1.6F, -43.55F, 5.275F, 1, 1, 1, 0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 440, 347, -0.5519F, -42.6699F, -29.5782F, 6, 1, 8, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 54, 472, -4.5519F, -42.6699F, -32.5782F, 2, 1, 11, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 492, 313, -0.5519F, -42.6699F, -32.5782F, 2, 1, 4, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 426, 480, -4.5519F, -44.169F, -22.5782F, 6, 2, 1, -0.2F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -34.75F, -23.3F);
		gun.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -1.5708F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 494, 420, -0.75F, -0.75F, -0.5F, 1, 1, 4, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 494, 324, -0.25F, -1.75F, -0.5F, 1, 2, 4, -0.2F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -34.75F, -28.1F);
		gun.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 1.5708F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 388, 494, -0.75F, -0.75F, -3.5F, 1, 1, 4, -0.2F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 494, 318, -0.25F, -1.75F, -3.5F, 1, 2, 4, -0.2F, false));

		DustCover21_r1 = new ModelRenderer(this);
		DustCover21_r1.setRotationPoint(-6.1663F, -41.6487F, -25.0004F);
		gun.addChild(DustCover21_r1);
		setRotationAngle(DustCover21_r1, 0.0F, 0.0F, -1.5272F);
		DustCover21_r1.cubeList.add(new ModelBox(DustCover21_r1, 492, 295, -0.7087F, -1.1304F, -2.5F, 1, 1, 5, -0.15F, false));

		DustCover22_r1 = new ModelRenderer(this);
		DustCover22_r1.setRotationPoint(-6.1663F, -41.6487F, -25.0004F);
		gun.addChild(DustCover22_r1);
		setRotationAngle(DustCover22_r1, 0.0F, 0.0F, -1.789F);
		DustCover22_r1.cubeList.add(new ModelBox(DustCover22_r1, 368, 190, -0.4616F, -0.837F, -2.5F, 1, 3, 5, -0.2F, false));

		DustCover29_r1 = new ModelRenderer(this);
		DustCover29_r1.setRotationPoint(3.6642F, -41.2076F, -24.5782F);
		gun.addChild(DustCover29_r1);
		setRotationAngle(DustCover29_r1, 0.0F, 0.0F, 1.1432F);
		DustCover29_r1.cubeList.add(new ModelBox(DustCover29_r1, 70, 487, -0.616F, 1.0377F, -5.0F, 1, 1, 8, -0.2F, false));
		DustCover29_r1.cubeList.add(new ModelBox(DustCover29_r1, 286, 342, -0.2161F, -1.8623F, -5.0F, 1, 4, 8, -0.3F, false));

		DustCover27_r1 = new ModelRenderer(this);
		DustCover27_r1.setRotationPoint(3.6642F, -41.2076F, -24.5782F);
		gun.addChild(DustCover27_r1);
		setRotationAngle(DustCover27_r1, 0.0F, 0.0F, 0.5672F);
		DustCover27_r1.cubeList.add(new ModelBox(DustCover27_r1, 402, 486, 0.4348F, -1.7264F, -5.0F, 1, 1, 8, -0.3F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-3.1F, -34.0F, -9.0F);
		gun.addChild(cube_r3);
		setRotationAngle(cube_r3, 1.5708F, 0.2618F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 306, 506, -1.0F, -1.0F, -0.5F, 1, 2, 1, -0.1F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-2.8F, -34.0F, -8.0F);
		gun.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.7854F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 480, 500, -1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F, false));

		grip_r1 = new ModelRenderer(this);
		grip_r1.setRotationPoint(-1.5F, -30.7029F, -8.4196F);
		gun.addChild(grip_r1);
		setRotationAngle(grip_r1, 0.2182F, 0.0F, 0.0F);
		grip_r1.cubeList.add(new ModelBox(grip_r1, 506, 412, -0.5F, -1.4773F, 0.0193F, 1, 1, 1, 0.0F, false));

		grip_r2 = new ModelRenderer(this);
		grip_r2.setRotationPoint(-1.5F, -30.7029F, -8.4196F);
		gun.addChild(grip_r2);
		setRotationAngle(grip_r2, -0.9599F, 0.0F, 0.0F);
		grip_r2.cubeList.add(new ModelBox(grip_r2, 506, 410, -0.5F, 0.4576F, 0.109F, 1, 1, 1, 0.0F, false));

		grip_r3 = new ModelRenderer(this);
		grip_r3.setRotationPoint(-1.5F, -30.7029F, -8.4196F);
		gun.addChild(grip_r3);
		setRotationAngle(grip_r3, -0.5236F, 0.0F, 0.0F);
		grip_r3.cubeList.add(new ModelBox(grip_r3, 506, 408, -0.5F, -0.1166F, -0.1883F, 1, 1, 1, 0.0F, false));

		grip_r4 = new ModelRenderer(this);
		grip_r4.setRotationPoint(-1.5F, -30.7029F, -8.4196F);
		gun.addChild(grip_r4);
		setRotationAngle(grip_r4, -0.1309F, 0.0F, 0.0F);
		grip_r4.cubeList.add(new ModelBox(grip_r4, 338, 506, -0.5F, -0.7971F, -0.2054F, 1, 1, 1, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.5F, -30.2F, -13.7F);
		gun.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.1309F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 14, 491, -1.0F, -2.0F, -0.5F, 2, 4, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-1.5F, -27.2929F, -14.4142F);
		gun.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.7854F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 402, 188, -1.0F, -1.5F, -0.5F, 2, 1, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.5F, -27.2929F, -7.4142F);
		gun.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.7854F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 64, 393, -1.0F, -1.5F, -0.5F, 2, 1, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-4.5F, -39.6564F, 5.5851F);
		gun.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.6981F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 288, 210, 0.0F, -2.0F, 3.0F, 6, 1, 1, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-4.5F, -40.936F, 4.0873F);
		gun.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.3054F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 192, 421, 0.0F, -3.0F, 3.0F, 6, 2, 1, 0.0F, false));

		opticmount = new ModelRenderer(this);
		opticmount.setRotationPoint(0.0F, -2.0F, -2.0F);
		gun.addChild(opticmount);
		opticmount.cubeList.add(new ModelBox(opticmount, 80, 473, 1.575F, -42.0F, -3.0F, 1, 3, 11, 0.0F, false));
		opticmount.cubeList.add(new ModelBox(opticmount, 480, 145, 0.575F, -39.999F, -3.0F, 1, 1, 10, 0.0F, false));
		opticmount.cubeList.add(new ModelBox(opticmount, 468, 347, 2.075F, -41.5F, 2.0F, 1, 2, 5, 0.0F, false));
		opticmount.cubeList.add(new ModelBox(opticmount, 498, 84, 2.075F, -41.5F, -2.75F, 1, 2, 3, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(2.0143F, -40.5F, 2.3535F);
		opticmount.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, -0.7854F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 310, 506, -0.5F, -1.0F, -1.0F, 1, 2, 1, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(2.0143F, -40.5F, 0.6036F);
		opticmount.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, -0.7854F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 506, 279, -0.5F, -1.0F, -1.0F, 1, 2, 1, 0.0F, false));
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