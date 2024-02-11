package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ZM_LR300 extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer receiver17_r1;
	private final ModelRenderer receiver16_r1;
	private final ModelRenderer receiver18_r1;
	private final ModelRenderer receiver17_r2;
	private final ModelRenderer receiver17_r3;
	private final ModelRenderer receiver16_r2;
	private final ModelRenderer receiver15_r1;
	private final ModelRenderer receiver14_r1;
	private final ModelRenderer receiver16_r3;
	private final ModelRenderer receiver15_r2;
	private final ModelRenderer receiver16_r4;
	private final ModelRenderer receiver15_r3;
	private final ModelRenderer receiver14_r2;
	private final ModelRenderer receiver14_r3;
	private final ModelRenderer receiver17_r4;
	private final ModelRenderer receiver16_r5;
	private final ModelRenderer receiver16_r6;
	private final ModelRenderer receiver15_r4;
	private final ModelRenderer receiver15_r5;
	private final ModelRenderer gun30_r1;
	private final ModelRenderer gun29_r1;
	private final ModelRenderer gun28_r1;
	private final ModelRenderer gun39_r1;
	private final ModelRenderer gun38_r1;
	private final ModelRenderer gun37_r1;
	private final ModelRenderer gun37_r2;
	private final ModelRenderer gun51_r1;
	private final ModelRenderer gun53_r1;
	private final ModelRenderer gun58_r1;
	private final ModelRenderer gun63_r1;
	private final ModelRenderer gun80_r1;
	private final ModelRenderer gun82_r1;
	private final ModelRenderer gun152_r1;
	private final ModelRenderer gun156_r1;
	private final ModelRenderer bone_r1;
	private final ModelRenderer gun132;
	private final ModelRenderer gun67;
	private final ModelRenderer gun60;
	private final ModelRenderer receiver;
	private final ModelRenderer gun263_r1;
	private final ModelRenderer gun263_r2;
	private final ModelRenderer gun264_r1;
	private final ModelRenderer gun264_r2;
	private final ModelRenderer gun143_r1;
	private final ModelRenderer gun140_r1;
	private final ModelRenderer receiver18_r2;
	private final ModelRenderer receiver17_r5;
	private final ModelRenderer receiver14_r4;
	private final ModelRenderer receiver14_r5;
	private final ModelRenderer receiver13_r1;
	private final ModelRenderer receiver12_r1;
	private final ModelRenderer receiver15_r6;
	private final ModelRenderer receiver14_r6;
	private final ModelRenderer receiver14_r7;
	private final ModelRenderer receiver13_r2;
	private final ModelRenderer receiver13_r3;
	private final ModelRenderer receiver14_r8;
	private final ModelRenderer receiver14_r9;
	private final ModelRenderer receiver14_r9_r1;
	private final ModelRenderer receiver15_r7;
	private final ModelRenderer receiver14_r10;
	private final ModelRenderer receiver14_r11;
	private final ModelRenderer receiver13_r4;
	private final ModelRenderer receiver12_r2;
	private final ModelRenderer receiver12_r2_r1;
	private final ModelRenderer receiver13_r5;
	private final ModelRenderer receiver13_r6;
	private final ModelRenderer receiver12_r3;
	private final ModelRenderer receiver11_r1;
	private final ModelRenderer receiver16_r7;
	private final ModelRenderer receiver18_r3;
	private final ModelRenderer receiver17_r6;
	private final ModelRenderer gun125_r1;
	private final ModelRenderer gun170;
	private final ModelRenderer gun172_r1;
	private final ModelRenderer gun172_r2;
	private final ModelRenderer gun172_r2_r1;
	private final ModelRenderer gun264;
	private final ModelRenderer rails;
	private final ModelRenderer cube_r82;
	private final ModelRenderer cube_r83;
	private final ModelRenderer cube_r84;
	private final ModelRenderer cube_r85;
	private final ModelRenderer cube_r86;
	private final ModelRenderer handguard;
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

	public ZM_LR300() {
		textureWidth = 256;
		textureHeight = 256;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		gun.cubeList.add(new ModelBox(gun, 58, 13, -1.8F, -37.8F, -58.5F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 43, 49, -2.2F, -37.8F, -58.5F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 15, 48, -2.2F, -38.2F, -58.5F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 43, 43, -1.8F, -38.2F, -58.5F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 43, 27, -1.6F, -38.0F, -58.5F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 43, 13, -2.4F, -38.0F, -58.5F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 43, 0, -2.0F, -37.6F, -58.5F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 15, 42, -2.0F, -38.4F, -58.5F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 52, 52, -2.2F, -38.0F, -53.499F, 1, 1, 32, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 52, 10, -1.8F, -38.0F, -53.501F, 1, 1, 32, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 9, 51, -2.0F, -37.8F, -53.5F, 1, 1, 32, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 9, 9, -2.0F, -38.2F, -53.5F, 1, 1, 32, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 43, 13, -0.05F, -36.1F, -12.75F, 1, 2, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 86, 27, 0.0F, -34.6F, -12.751F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 86, 25, -0.3F, -35.6F, -13.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 86, 21, -0.3F, -35.6F, -12.5F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 58, 43, -0.35F, -32.8F, -16.5F, 1, 6, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 20, 86, -3.7F, -33.9F, -13.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 86, 19, -3.801F, -32.501F, -12.4F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 78, 4, -3.8F, -32.5F, -13.7F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 28, 34, -3.8F, -34.3F, -14.7F, 1, 3, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 58, 27, -3.8F, -35.3F, -21.4F, 1, 1, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 10, 84, -3.0F, -33.35F, -1.0F, 3, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 70, 26, -3.3F, -36.0F, -1.001F, 3, 3, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 19, 0, -0.7F, -36.0F, -0.998F, 1, 3, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 27, -3.501F, -35.7F, -22.7F, 4, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 28, 28, -0.4F, -33.5F, -16.3F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 50, 13, -0.35F, -36.0F, -16.5F, 1, 2, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 50, 57, -0.35F, -34.5F, -16.5F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 42, -3.5F, -36.0F, -13.2F, 4, 4, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 60, -3.5F, -36.0F, -21.2F, 4, 8, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 15, 33, -3.5F, -28.0F, -18.2F, 4, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 86, 17, -0.3F, -34.5F, -6.3F, 1, 1, 1, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 86, 15, -0.3F, -34.5F, -2.8F, 1, 1, 1, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 10, 86, -0.3F, -34.5F, -5.9F, 1, 1, 1, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 30, 84, -0.3F, -34.5F, -2.4F, 1, 1, 1, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -3.3F, -36.0F, -14.0F, 3, 5, 13, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 42, -0.7F, -36.0F, -14.0F, 1, 5, 13, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 58, 27, -3.001F, -32.0F, -13.8F, 3, 5, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 61, 0, -3.001F, -27.0F, -13.3F, 3, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 30, 55, -2.999F, -31.0F, -6.5F, 3, 5, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 31, 0, -2.6F, -39.401F, 1.0015F, 2, 4, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 33, -1.4F, -39.4F, 1.0025F, 1, 4, 2, 0.0F, false));

		receiver17_r1 = new ModelRenderer(this);
		receiver17_r1.setRotationPoint(0.25F, -37.5F, 2.35F);
		gun.addChild(receiver17_r1);
		setRotationAngle(receiver17_r1, 0.0F, 0.0F, 0.4014F);
		receiver17_r1.cubeList.add(new ModelBox(receiver17_r1, 49, 80, -0.999F, 0.3F, 0.0F, 1, 1, 2, 0.0F, false));
		receiver17_r1.cubeList.add(new ModelBox(receiver17_r1, 50, 49, -1.0F, 0.0F, 0.002F, 1, 1, 2, 0.0F, false));

		receiver16_r1 = new ModelRenderer(this);
		receiver16_r1.setRotationPoint(-3.25F, -37.5F, 2.35F);
		gun.addChild(receiver16_r1);
		setRotationAngle(receiver16_r1, 0.0F, 0.0F, -0.4014F);
		receiver16_r1.cubeList.add(new ModelBox(receiver16_r1, 43, 80, -0.001F, 0.3F, 0.0F, 1, 1, 2, 0.0F, false));
		receiver16_r1.cubeList.add(new ModelBox(receiver16_r1, 50, 43, 0.0F, 0.0F, 0.002F, 1, 1, 2, 0.0F, false));

		receiver18_r1 = new ModelRenderer(this);
		receiver18_r1.setRotationPoint(-1.5F, -35.75F, 2.35F);
		gun.addChild(receiver18_r1);
		setRotationAngle(receiver18_r1, 0.0F, 0.0F, -0.4014F);
		receiver18_r1.cubeList.add(new ModelBox(receiver18_r1, 78, 1, 0.35F, -0.999F, 0.001F, 1, 1, 2, 0.0F, false));
		receiver18_r1.cubeList.add(new ModelBox(receiver18_r1, 20, 80, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		receiver17_r2 = new ModelRenderer(this);
		receiver17_r2.setRotationPoint(-1.5F, -39.25F, 2.35F);
		gun.addChild(receiver17_r2);
		setRotationAngle(receiver17_r2, 0.0F, 0.0F, 0.4014F);
		receiver17_r2.cubeList.add(new ModelBox(receiver17_r2, 77, 76, 0.35F, -0.001F, 0.001F, 1, 1, 2, 0.0F, false));
		receiver17_r2.cubeList.add(new ModelBox(receiver17_r2, 16, 79, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));
		receiver17_r2.cubeList.add(new ModelBox(receiver17_r2, 77, 76, 0.7156F, -0.5533F, -27.049F, 1, 1, 2, 0.0F, false));
		receiver17_r2.cubeList.add(new ModelBox(receiver17_r2, 16, 79, -0.2344F, -0.5523F, -27.05F, 1, 1, 2, 0.0F, false));

		receiver17_r3 = new ModelRenderer(this);
		receiver17_r3.setRotationPoint(-1.5F, -35.75F, 2.35F);
		gun.addChild(receiver17_r3);
		setRotationAngle(receiver17_r3, 0.0F, 0.0F, 0.4014F);
		receiver17_r3.cubeList.add(new ModelBox(receiver17_r3, 77, 70, -1.35F, -0.999F, 0.001F, 1, 1, 2, 0.0F, false));
		receiver17_r3.cubeList.add(new ModelBox(receiver17_r3, 50, 33, -1.0F, -1.0F, 0.002F, 1, 1, 2, 0.0F, false));

		receiver16_r2 = new ModelRenderer(this);
		receiver16_r2.setRotationPoint(-1.5F, -39.25F, 2.35F);
		gun.addChild(receiver16_r2);
		setRotationAngle(receiver16_r2, 0.0F, 0.0F, -0.4014F);
		receiver16_r2.cubeList.add(new ModelBox(receiver16_r2, 77, 56, -1.35F, -0.001F, 0.001F, 1, 1, 2, 0.0F, false));
		receiver16_r2.cubeList.add(new ModelBox(receiver16_r2, 50, 27, -1.0F, 0.0F, 0.002F, 1, 1, 2, 0.0F, false));
		receiver16_r2.cubeList.add(new ModelBox(receiver16_r2, 77, 56, -1.7156F, -0.5533F, -27.049F, 1, 1, 2, 0.0F, false));
		receiver16_r2.cubeList.add(new ModelBox(receiver16_r2, 50, 27, -0.7656F, -0.5523F, -27.048F, 1, 1, 2, 0.0F, false));

		receiver15_r1 = new ModelRenderer(this);
		receiver15_r1.setRotationPoint(0.25F, -37.5F, 2.35F);
		gun.addChild(receiver15_r1);
		setRotationAngle(receiver15_r1, 0.0F, 0.0F, -0.4014F);
		receiver15_r1.cubeList.add(new ModelBox(receiver15_r1, 78, 36, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));
		receiver15_r1.cubeList.add(new ModelBox(receiver15_r1, 63, 76, -0.999F, -1.35F, -0.0001F, 1, 1, 2, 0.0F, false));
		receiver15_r1.cubeList.add(new ModelBox(receiver15_r1, 78, 36, -0.3384F, -1.095F, -27.0489F, 1, 1, 2, 0.0F, false));
		receiver15_r1.cubeList.add(new ModelBox(receiver15_r1, 63, 76, -0.3374F, -1.445F, -27.049F, 1, 1, 2, 0.0F, false));

		receiver14_r1 = new ModelRenderer(this);
		receiver14_r1.setRotationPoint(-3.25F, -37.5F, 2.35F);
		gun.addChild(receiver14_r1);
		setRotationAngle(receiver14_r1, 0.0F, 0.0F, 0.4014F);
		receiver14_r1.cubeList.add(new ModelBox(receiver14_r1, 78, 22, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));
		receiver14_r1.cubeList.add(new ModelBox(receiver14_r1, 76, 62, -0.001F, -1.35F, -0.0001F, 1, 1, 2, 0.0F, false));
		receiver14_r1.cubeList.add(new ModelBox(receiver14_r1, 78, 22, -0.6616F, -1.095F, -27.0489F, 1, 1, 2, 0.0F, false));
		receiver14_r1.cubeList.add(new ModelBox(receiver14_r1, 76, 62, -0.6626F, -1.445F, -27.049F, 1, 1, 2, 0.0F, false));

		receiver16_r3 = new ModelRenderer(this);
		receiver16_r3.setRotationPoint(-3.8F, -37.5F, 1.0F);
		gun.addChild(receiver16_r3);
		setRotationAngle(receiver16_r3, -0.925F, 0.0F, -0.2618F);
		receiver16_r3.cubeList.add(new ModelBox(receiver16_r3, 7, 48, 0.001F, -0.2F, 0.7F, 1, 2, 2, 0.0F, false));

		receiver15_r2 = new ModelRenderer(this);
		receiver15_r2.setRotationPoint(0.8F, -37.5F, 1.0F);
		gun.addChild(receiver15_r2);
		setRotationAngle(receiver15_r2, -0.925F, 0.0F, 0.2618F);
		receiver15_r2.cubeList.add(new ModelBox(receiver15_r2, 35, 34, -0.999F, -0.2F, 0.7F, 1, 2, 2, 0.0F, false));

		receiver16_r4 = new ModelRenderer(this);
		receiver16_r4.setRotationPoint(-3.37F, -35.9F, 0.0F);
		gun.addChild(receiver16_r4);
		setRotationAngle(receiver16_r4, 0.0F, 0.0F, -0.0524F);
		receiver16_r4.cubeList.add(new ModelBox(receiver16_r4, 53, 71, 0.0F, 0.0F, 0.001F, 1, 2, 3, 0.0F, false));

		receiver15_r3 = new ModelRenderer(this);
		receiver15_r3.setRotationPoint(0.37F, -35.9F, 0.0F);
		gun.addChild(receiver15_r3);
		setRotationAngle(receiver15_r3, 0.0F, 0.0F, 0.0524F);
		receiver15_r3.cubeList.add(new ModelBox(receiver15_r3, 43, 71, -1.0F, 0.0F, 0.001F, 1, 2, 3, 0.0F, false));

		receiver14_r2 = new ModelRenderer(this);
		receiver14_r2.setRotationPoint(0.8F, -37.5F, 1.0F);
		gun.addChild(receiver14_r2);
		setRotationAngle(receiver14_r2, 0.0F, 0.0F, 0.2618F);
		receiver14_r2.cubeList.add(new ModelBox(receiver14_r2, 63, 71, -2.0F, 0.0F, 0.0012F, 2, 2, 2, 0.0F, false));

		receiver14_r3 = new ModelRenderer(this);
		receiver14_r3.setRotationPoint(0.8F, -37.5F, 1.0F);
		gun.addChild(receiver14_r3);
		setRotationAngle(receiver14_r3, 0.0F, 0.0F, -0.4014F);
		receiver14_r3.cubeList.add(new ModelBox(receiver14_r3, 70, 8, -1.999F, -1.3F, 0.001F, 2, 1, 2, 0.0F, false));
		receiver14_r3.cubeList.add(new ModelBox(receiver14_r3, 76, 53, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		receiver17_r4 = new ModelRenderer(this);
		receiver17_r4.setRotationPoint(-2.6F, -39.4F, 1.0F);
		gun.addChild(receiver17_r4);
		setRotationAngle(receiver17_r4, 0.0F, 0.0F, -0.8029F);
		receiver17_r4.cubeList.add(new ModelBox(receiver17_r4, 53, 76, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		receiver16_r5 = new ModelRenderer(this);
		receiver16_r5.setRotationPoint(-0.4F, -39.4F, 1.0F);
		gun.addChild(receiver16_r5);
		setRotationAngle(receiver16_r5, 0.0F, 0.0F, 0.8029F);
		receiver16_r5.cubeList.add(new ModelBox(receiver16_r5, 76, 50, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		receiver16_r6 = new ModelRenderer(this);
		receiver16_r6.setRotationPoint(-1.5F, -37.5F, 3.1F);
		gun.addChild(receiver16_r6);
		setRotationAngle(receiver16_r6, 0.0F, 0.0F, -0.3316F);
		

		receiver15_r4 = new ModelRenderer(this);
		receiver15_r4.setRotationPoint(-3.8F, -37.5F, 1.0F);
		gun.addChild(receiver15_r4);
		setRotationAngle(receiver15_r4, 0.0F, 0.0F, -0.2618F);
		receiver15_r4.cubeList.add(new ModelBox(receiver15_r4, 71, 58, 0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

		receiver15_r5 = new ModelRenderer(this);
		receiver15_r5.setRotationPoint(-3.8F, -37.5F, 1.0F);
		gun.addChild(receiver15_r5);
		setRotationAngle(receiver15_r5, 0.0F, 0.0F, 0.4014F);
		receiver15_r5.cubeList.add(new ModelBox(receiver15_r5, 43, 76, -0.001F, -1.3F, 0.001F, 1, 1, 2, 0.0F, false));
		receiver15_r5.cubeList.add(new ModelBox(receiver15_r5, 58, 67, 0.0F, -1.0F, -0.001F, 2, 1, 2, 0.0F, false));

		gun30_r1 = new ModelRenderer(this);
		gun30_r1.setRotationPoint(-3.2F, -31.0F, -7.6F);
		gun.addChild(gun30_r1);
		setRotationAngle(gun30_r1, -2.3562F, 0.0F, 0.0F);
		gun30_r1.cubeList.add(new ModelBox(gun30_r1, 0, 65, 0.2F, -2.0F, -1.0F, 3, 2, 1, 0.0F, false));

		gun29_r1 = new ModelRenderer(this);
		gun29_r1.setRotationPoint(-3.2F, -27.0F, -7.6F);
		gun.addChild(gun29_r1);
		setRotationAngle(gun29_r1, -2.3562F, 0.0F, 0.0F);
		gun29_r1.cubeList.add(new ModelBox(gun29_r1, 31, 6, 0.2F, -1.0F, -2.0F, 3, 1, 2, 0.0F, false));

		gun28_r1 = new ModelRenderer(this);
		gun28_r1.setRotationPoint(-3.2F, -27.0F, -11.5F);
		gun.addChild(gun28_r1);
		setRotationAngle(gun28_r1, -2.3562F, 0.0F, 0.0F);
		gun28_r1.cubeList.add(new ModelBox(gun28_r1, 20, 24, 0.2F, 0.0F, 0.0F, 3, 2, 1, 0.0F, false));

		gun39_r1 = new ModelRenderer(this);
		gun39_r1.setRotationPoint(0.5F, -33.7F, -11.3F);
		gun.addChild(gun39_r1);
		setRotationAngle(gun39_r1, -0.3665F, 0.0F, 0.0F);
		gun39_r1.cubeList.add(new ModelBox(gun39_r1, 20, 84, -1.05F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		gun38_r1 = new ModelRenderer(this);
		gun38_r1.setRotationPoint(0.5F, -32.7F, -7.6F);
		gun.addChild(gun38_r1);
		setRotationAngle(gun38_r1, -0.3665F, 0.0F, 0.0F);
		gun38_r1.cubeList.add(new ModelBox(gun38_r1, 10, 84, -1.05F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		gun37_r1 = new ModelRenderer(this);
		gun37_r1.setRotationPoint(-3.4F, -33.0F, -4.2F);
		gun.addChild(gun37_r1);
		setRotationAngle(gun37_r1, -0.3665F, 0.0F, 0.0F);
		gun37_r1.cubeList.add(new ModelBox(gun37_r1, 73, 67, 0.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun37_r2 = new ModelRenderer(this);
		gun37_r2.setRotationPoint(-2.6F, -34.7F, -0.6F);
		gun.addChild(gun37_r2);
		setRotationAngle(gun37_r2, -0.3665F, 0.0F, 0.0F);
		gun37_r2.cubeList.add(new ModelBox(gun37_r2, 66, 54, 0.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));
		gun37_r2.cubeList.add(new ModelBox(gun37_r2, 48, 63, -0.8F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun51_r1 = new ModelRenderer(this);
		gun51_r1.setRotationPoint(-3.9F, -27.5F, -21.2F);
		gun.addChild(gun51_r1);
		setRotationAngle(gun51_r1, 1.3756F, 0.0F, 0.0F);
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 0, 18, 0.1F, 0.0806F, 0.0981F, 4, 8, 1, 0.0F, false));
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 58, 38, 0.101F, -0.4194F, 0.098F, 4, 1, 1, 0.0F, false));
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 72, 12, 3.7F, 0.08F, 0.098F, 1, 8, 1, 0.0F, false));
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 4, 84, 3.699F, -0.42F, 0.1F, 1, 1, 1, 0.0F, false));

		gun53_r1 = new ModelRenderer(this);
		gun53_r1.setRotationPoint(-3.5F, -32.0F, -11.2F);
		gun.addChild(gun53_r1);
		setRotationAngle(gun53_r1, -2.7884F, 0.0F, 0.0F);
		gun53_r1.cubeList.add(new ModelBox(gun53_r1, 71, 54, 2.999F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun58_r1 = new ModelRenderer(this);
		gun58_r1.setRotationPoint(-3.5F, -34.5F, -22.7F);
		gun.addChild(gun58_r1);
		setRotationAngle(gun58_r1, 0.9082F, 0.0F, 0.0F);
		gun58_r1.cubeList.add(new ModelBox(gun58_r1, 19, 7, -0.002F, -0.123F, 0.1577F, 4, 2, 1, 0.0F, false));

		gun63_r1 = new ModelRenderer(this);
		gun63_r1.setRotationPoint(-2.0F, -30.2F, -8.95F);
		gun.addChild(gun63_r1);
		setRotationAngle(gun63_r1, -0.409F, 0.0F, 0.0F);
		gun63_r1.cubeList.add(new ModelBox(gun63_r1, 15, 33, 0.0F, -2.0F, 0.0F, 1, 4, 1, 0.0F, false));

		gun80_r1 = new ModelRenderer(this);
		gun80_r1.setRotationPoint(-3.8F, -31.3F, -14.7F);
		gun.addChild(gun80_r1);
		setRotationAngle(gun80_r1, 0.0F, 0.0F, -0.2603F);
		gun80_r1.cubeList.add(new ModelBox(gun80_r1, 43, 6, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun82_r1 = new ModelRenderer(this);
		gun82_r1.setRotationPoint(-3.8F, -34.3F, -14.7F);
		gun.addChild(gun82_r1);
		setRotationAngle(gun82_r1, 0.0F, 0.7436F, 0.0F);
		gun82_r1.cubeList.add(new ModelBox(gun82_r1, 25, 0, 0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

		gun152_r1 = new ModelRenderer(this);
		gun152_r1.setRotationPoint(-0.7F, -33.5F, -4.7F);
		gun.addChild(gun152_r1);
		setRotationAngle(gun152_r1, 0.7854F, 0.0F, 0.0F);
		gun152_r1.cubeList.add(new ModelBox(gun152_r1, 80, 68, 0.2F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun156_r1 = new ModelRenderer(this);
		gun156_r1.setRotationPoint(0.6F, -33.4F, -4.5F);
		gun.addChild(gun156_r1);
		setRotationAngle(gun156_r1, -1.5708F, 0.0F, 0.0F);
		gun156_r1.cubeList.add(new ModelBox(gun156_r1, 76, 18, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		bone_r1 = new ModelRenderer(this);
		bone_r1.setRotationPoint(0.2F, -32.8F, -16.5F);
		gun.addChild(bone_r1);
		setRotationAngle(bone_r1, 0.0F, 0.0F, 0.7854F);
		bone_r1.cubeList.add(new ModelBox(bone_r1, 17, 76, -0.3636F, -0.3636F, -0.001F, 1, 1, 2, 0.0F, false));
		bone_r1.cubeList.add(new ModelBox(bone_r1, 76, 15, -1.0F, -1.0F, -0.001F, 1, 1, 2, 0.0F, false));

		gun132 = new ModelRenderer(this);
		gun132.setRotationPoint(-0.15F, -36.2F, -12.8F);
		gun.addChild(gun132);
		setRotationAngle(gun132, 0.0F, 0.0F, -1.2641F);
		gun132.cubeList.add(new ModelBox(gun132, 86, 6, -0.7277F, 0.2207F, -0.15F, 2, 1, 1, -0.2F, false));
		gun132.cubeList.add(new ModelBox(gun132, 86, 4, -0.727F, 0.22F, 0.25F, 2, 1, 1, -0.2F, false));

		gun67 = new ModelRenderer(this);
		gun67.setRotationPoint(-3.3F, -33.5F, 1.5F);
		gun.addChild(gun67);
		setRotationAngle(gun67, -2.3423F, 0.0F, 0.0F);
		gun67.cubeList.add(new ModelBox(gun67, 0, 76, 0.001F, 0.0638F, -1.4959F, 3, 2, 5, 0.0F, false));
		gun67.cubeList.add(new ModelBox(gun67, 68, 43, 0.599F, 0.0638F, -1.4959F, 3, 2, 5, 0.0F, false));
		gun67.cubeList.add(new ModelBox(gun67, 67, 77, 0.299F, -0.7242F, -0.49F, 3, 2, 4, 0.0F, false));

		gun60 = new ModelRenderer(this);
		gun60.setRotationPoint(-0.4F, -35.6F, -22.1F);
		gun.addChild(gun60);
		setRotationAngle(gun60, -0.3316F, 0.0F, 0.0F);
		gun60.cubeList.add(new ModelBox(gun60, 80, 61, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun60.cubeList.add(new ModelBox(gun60, 80, 53, -3.2F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver = new ModelRenderer(this);
		receiver.setRotationPoint(0.0F, 24.0F, 0.0F);
		receiver.cubeList.add(new ModelBox(receiver, 80, 50, -1.401F, -39.601F, -23.001F, 1, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 86, 2, -2.601F, -39.601F, -23.002F, 2, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 40, 85, -0.6F, -39.25F, -18.0F, 1, 1, 2, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 47, 80, -0.599F, -39.25F, -19.0F, 1, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 103, 109, -1.4F, -39.6F, -22.0F, 1, 1, 23, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 0, 109, -2.6F, -39.6F, -22.0F, 1, 1, 23, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 86, 43, -1.4F, -40.6F, -22.0F, 1, 1, 23, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 15, 42, -0.625F, -36.3F, -22.7F, 1, 1, 12, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 102, 85, -2.6F, -40.6F, -22.0F, 1, 1, 23, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 52, 85, -2.0F, -40.6F, -22.0F, 1, 1, 23, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 58, 13, -1.401F, -40.601F, -23.001F, 1, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 86, 0, -2.601F, -40.601F, -23.002F, 2, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 43, 29, -1.401F, -40.601F, -24.001F, 1, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 43, 33, -1.401F, -39.601F, -24.001F, 1, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 50, 46, -2.601F, -39.601F, -24.002F, 2, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 50, 52, -2.601F, -40.601F, -24.002F, 2, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 43, 27, -1.401F, -41.101F, -24.001F, 1, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 50, 36, -2.601F, -41.101F, -24.002F, 2, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 80, 28, -2.0F, -38.8F, -23.699F, 1, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 80, 26, -2.0F, -37.2F, -23.699F, 1, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 80, 18, -4.3F, -37.4F, -21.0F, 1, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 80, 15, -4.3F, -37.4F, -12.0F, 1, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 76, 12, -2.5F, -37.001F, -22.701F, 2, 2, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 18, 55, -3.4F, -37.1F, -21.201F, 1, 2, 10, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 35, 28, -3.4F, -37.1F, -22.701F, 1, 2, 2, 0.0F, false));

		gun263_r1 = new ModelRenderer(this);
		gun263_r1.setRotationPoint(-4.3F, -37.4F, -21.0F);
		receiver.addChild(gun263_r1);
		setRotationAngle(gun263_r1, 0.0F, 0.0F, -0.3491F);
		gun263_r1.cubeList.add(new ModelBox(gun263_r1, 80, 9, 0.0F, 0.0F, -0.001F, 1, 1, 1, 0.0F, false));
		gun263_r1.cubeList.add(new ModelBox(gun263_r1, 80, 7, 0.0F, 0.0F, 8.999F, 1, 1, 1, 0.0F, false));

		gun263_r2 = new ModelRenderer(this);
		gun263_r2.setRotationPoint(-3.8F, -37.5F, -21.0F);
		receiver.addChild(gun263_r2);
		setRotationAngle(gun263_r2, 0.0F, 0.0F, 0.4014F);
		gun263_r2.cubeList.add(new ModelBox(gun263_r2, 79, 73, 0.0F, -0.7F, 0.0F, 1, 1, 1, 0.0F, false));
		gun263_r2.cubeList.add(new ModelBox(gun263_r2, 79, 59, -0.001F, -1.22F, -0.001F, 1, 1, 1, 0.0F, false));
		gun263_r2.cubeList.add(new ModelBox(gun263_r2, 79, 45, 0.0F, -0.7F, 9.0F, 1, 1, 1, 0.0F, false));
		gun263_r2.cubeList.add(new ModelBox(gun263_r2, 79, 43, -0.001F, -1.22F, 8.999F, 1, 1, 1, 0.0F, false));

		gun264_r1 = new ModelRenderer(this);
		gun264_r1.setRotationPoint(-3.32F, -38.62F, -21.0F);
		receiver.addChild(gun264_r1);
		setRotationAngle(gun264_r1, 0.0F, 0.0F, 0.8203F);
		gun264_r1.cubeList.add(new ModelBox(gun264_r1, 79, 39, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun264_r1.cubeList.add(new ModelBox(gun264_r1, 20, 18, -0.101F, -1.1F, 0.5F, 1, 1, 9, -0.1F, false));
		gun264_r1.cubeList.add(new ModelBox(gun264_r1, 79, 33, 0.0F, -1.0F, 9.0F, 1, 1, 1, 0.0F, false));

		gun264_r2 = new ModelRenderer(this);
		gun264_r2.setRotationPoint(-4.5F, -36.8F, -22.4F);
		receiver.addChild(gun264_r2);
		setRotationAngle(gun264_r2, 0.0F, 0.0F, -0.9295F);
		gun264_r2.cubeList.add(new ModelBox(gun264_r2, 11, 76, 0.0F, 0.0F, 5.35F, 1, 1, 2, -0.2F, false));
		gun264_r2.cubeList.add(new ModelBox(gun264_r2, 58, 13, 0.0F, 0.0F, 0.0F, 1, 1, 12, -0.3F, false));

		gun143_r1 = new ModelRenderer(this);
		gun143_r1.setRotationPoint(-4.7F, -38.0F, 0.5F);
		receiver.addChild(gun143_r1);
		setRotationAngle(gun143_r1, 0.0F, -0.2603F, 0.0F);
		gun143_r1.cubeList.add(new ModelBox(gun143_r1, 6, 0, -3.2932F, -0.8F, -6.7559F, 2, 3, 1, -0.4F, false));
		gun143_r1.cubeList.add(new ModelBox(gun143_r1, 50, 19, -2.7932F, -0.3F, -8.2559F, 1, 1, 2, 0.0F, false));

		gun140_r1 = new ModelRenderer(this);
		gun140_r1.setRotationPoint(-3.1F, -37.8F, -6.0F);
		receiver.addChild(gun140_r1);
		setRotationAngle(gun140_r1, 0.0F, -0.2603F, 0.0F);
		gun140_r1.cubeList.add(new ModelBox(gun140_r1, 16, 60, -2.8032F, -0.3F, -4.1559F, 3, 1, 3, 0.0F, false));
		gun140_r1.cubeList.add(new ModelBox(gun140_r1, 61, 8, -2.8042F, -0.7F, -4.1569F, 3, 1, 3, 0.0F, false));

		receiver18_r2 = new ModelRenderer(this);
		receiver18_r2.setRotationPoint(-2.6F, -39.25F, 1.0F);
		receiver.addChild(receiver18_r2);
		setRotationAngle(receiver18_r2, 0.0F, 0.0F, -0.8029F);
		receiver18_r2.cubeList.add(new ModelBox(receiver18_r2, 0, 78, -0.9F, 0.0F, -0.4F, 1, 1, 1, 0.0F, false));

		receiver17_r5 = new ModelRenderer(this);
		receiver17_r5.setRotationPoint(-0.4F, -39.25F, 1.0F);
		receiver.addChild(receiver17_r5);
		setRotationAngle(receiver17_r5, 0.0F, 0.0F, 0.8029F);
		receiver17_r5.cubeList.add(new ModelBox(receiver17_r5, 67, 76, -0.1F, 0.0F, -0.4F, 1, 1, 1, 0.0F, false));

		receiver14_r4 = new ModelRenderer(this);
		receiver14_r4.setRotationPoint(-3.6F, -37.5F, -11.7F);
		receiver.addChild(receiver14_r4);
		setRotationAngle(receiver14_r4, 0.0F, 0.0F, -0.4014F);
		receiver14_r4.cubeList.add(new ModelBox(receiver14_r4, 43, 57, -0.2762F, -0.1172F, 0.001F, 1, 1, 13, 0.0F, false));
		receiver14_r4.cubeList.add(new ModelBox(receiver14_r4, 43, 13, -0.2762F, 0.8828F, 0.001F, 1, 1, 13, 0.0F, false));
		receiver14_r4.cubeList.add(new ModelBox(receiver14_r4, 19, 0, -0.4F, -0.2F, -8.999F, 1, 2, 10, -0.4F, false));
		receiver14_r4.cubeList.add(new ModelBox(receiver14_r4, 76, 9, 0.0F, 0.0F, -10.998F, 1, 1, 2, 0.0F, false));

		receiver14_r5 = new ModelRenderer(this);
		receiver14_r5.setRotationPoint(-3.2F, -37.5F, -23.7F);
		receiver.addChild(receiver14_r5);
		setRotationAngle(receiver14_r5, 0.0F, 0.0F, -0.4014F);
		receiver14_r5.cubeList.add(new ModelBox(receiver14_r5, 57, 76, 0.0F, 0.0F, 0.001F, 1, 1, 1, 0.0F, false));

		receiver13_r1 = new ModelRenderer(this);
		receiver13_r1.setRotationPoint(0.2F, -37.5F, -23.7F);
		receiver.addChild(receiver13_r1);
		setRotationAngle(receiver13_r1, 0.0F, 0.0F, 0.4014F);
		receiver13_r1.cubeList.add(new ModelBox(receiver13_r1, 47, 76, -1.0F, 0.0F, 0.001F, 1, 1, 1, 0.0F, false));

		receiver12_r1 = new ModelRenderer(this);
		receiver12_r1.setRotationPoint(0.6F, -37.5F, -22.7F);
		receiver.addChild(receiver12_r1);
		setRotationAngle(receiver12_r1, 0.0F, 0.0F, 0.4014F);
		receiver12_r1.cubeList.add(new ModelBox(receiver12_r1, 86, 0, -0.7238F, -0.1172F, 0.001F, 1, 1, 24, 0.0F, false));
		receiver12_r1.cubeList.add(new ModelBox(receiver12_r1, 0, 84, -0.7238F, 0.8828F, 0.001F, 1, 1, 24, 0.0F, false));

		receiver15_r6 = new ModelRenderer(this);
		receiver15_r6.setRotationPoint(-3.7F, -37.5F, 0.6F);
		receiver.addChild(receiver15_r6);
		setRotationAngle(receiver15_r6, -0.925F, 0.0F, -0.3142F);
		receiver15_r6.cubeList.add(new ModelBox(receiver15_r6, 43, 0, 0.001F, 0.3F, 0.5F, 1, 2, 1, 0.0F, false));

		receiver14_r6 = new ModelRenderer(this);
		receiver14_r6.setRotationPoint(0.7F, -37.5F, 0.6F);
		receiver.addChild(receiver14_r6);
		setRotationAngle(receiver14_r6, -0.925F, 0.0F, 0.3142F);
		receiver14_r6.cubeList.add(new ModelBox(receiver14_r6, 36, 42, -0.999F, 0.3F, 0.5F, 1, 2, 1, 0.0F, false));

		receiver14_r7 = new ModelRenderer(this);
		receiver14_r7.setRotationPoint(-3.7F, -37.5F, 0.6F);
		receiver.addChild(receiver14_r7);
		setRotationAngle(receiver14_r7, 0.0F, 0.0F, -0.3142F);
		receiver14_r7.cubeList.add(new ModelBox(receiver14_r7, 29, 42, 0.0F, 0.0F, 0.001F, 1, 2, 1, 0.0F, false));

		receiver13_r2 = new ModelRenderer(this);
		receiver13_r2.setRotationPoint(0.7F, -37.5F, 0.6F);
		receiver.addChild(receiver13_r2);
		setRotationAngle(receiver13_r2, 0.0F, 0.0F, 0.3142F);
		receiver13_r2.cubeList.add(new ModelBox(receiver13_r2, 22, 42, -1.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		receiver13_r3 = new ModelRenderer(this);
		receiver13_r3.setRotationPoint(0.7F, -37.5F, 0.6F);
		receiver.addChild(receiver13_r3);
		setRotationAngle(receiver13_r3, 0.0F, 0.0F, -0.4014F);
		receiver13_r3.cubeList.add(new ModelBox(receiver13_r3, 15, 76, -0.999F, -1.2F, 0.001F, 1, 1, 1, 0.0F, false));
		receiver13_r3.cubeList.add(new ModelBox(receiver13_r3, 0, 76, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver14_r8 = new ModelRenderer(this);
		receiver14_r8.setRotationPoint(-3.7F, -37.5F, 0.6F);
		receiver.addChild(receiver14_r8);
		setRotationAngle(receiver14_r8, 0.0F, 0.0F, 0.4014F);
		receiver14_r8.cubeList.add(new ModelBox(receiver14_r8, 70, 28, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		receiver14_r8.cubeList.add(new ModelBox(receiver14_r8, 70, 26, -0.001F, -1.2F, 0.001F, 1, 1, 1, 0.0F, false));

		receiver14_r9 = new ModelRenderer(this);
		receiver14_r9.setRotationPoint(-2.3F, -38.8F, -11.7F);
		receiver.addChild(receiver14_r9);
		setRotationAngle(receiver14_r9, 0.0F, 0.0F, -0.4014F);
		receiver14_r9.cubeList.add(new ModelBox(receiver14_r9, 75, 33, -1.0F, 0.0F, -10.999F, 1, 1, 2, 0.0F, false));

		receiver14_r9_r1 = new ModelRenderer(this);
		receiver14_r9_r1.setRotationPoint(-0.573F, 0.2958F, 6.5F);
		receiver14_r9.addChild(receiver14_r9_r1);
		setRotationAngle(receiver14_r9_r1, 0.0F, 0.0F, -0.2182F);
		receiver14_r9_r1.cubeList.add(new ModelBox(receiver14_r9_r1, 43, 43, -0.5814F, -0.5581F, -6.5F, 1, 1, 13, 0.0F, false));

		receiver15_r7 = new ModelRenderer(this);
		receiver15_r7.setRotationPoint(-1.9F, -36.2F, -23.7F);
		receiver.addChild(receiver15_r7);
		setRotationAngle(receiver15_r7, 0.0F, 0.0F, 0.4014F);
		receiver15_r7.cubeList.add(new ModelBox(receiver15_r7, 36, 69, -1.0F, -1.0F, -0.001F, 1, 1, 1, 0.0F, false));

		receiver14_r10 = new ModelRenderer(this);
		receiver14_r10.setRotationPoint(-1.1F, -36.2F, -23.7F);
		receiver.addChild(receiver14_r10);
		setRotationAngle(receiver14_r10, 0.0F, 0.0F, -0.4014F);
		receiver14_r10.cubeList.add(new ModelBox(receiver14_r10, 24, 69, 0.0F, -1.0F, -0.001F, 1, 1, 1, 0.0F, false));

		receiver14_r11 = new ModelRenderer(this);
		receiver14_r11.setRotationPoint(-1.9F, -38.8F, -23.7F);
		receiver.addChild(receiver14_r11);
		setRotationAngle(receiver14_r11, 0.0F, 0.0F, -0.4014F);
		receiver14_r11.cubeList.add(new ModelBox(receiver14_r11, 68, 45, -1.0F, 0.0F, 0.001F, 1, 1, 1, 0.0F, false));

		receiver13_r4 = new ModelRenderer(this);
		receiver13_r4.setRotationPoint(-1.1F, -38.8F, -23.7F);
		receiver.addChild(receiver13_r4);
		setRotationAngle(receiver13_r4, 0.0F, 0.0F, 0.4014F);
		receiver13_r4.cubeList.add(new ModelBox(receiver13_r4, 68, 43, 0.0F, 0.0F, 0.001F, 1, 1, 1, 0.0F, false));

		receiver12_r2 = new ModelRenderer(this);
		receiver12_r2.setRotationPoint(-0.7F, -38.8F, -22.7F);
		receiver.addChild(receiver12_r2);
		setRotationAngle(receiver12_r2, 0.0F, 0.0F, 0.4014F);
		

		receiver12_r2_r1 = new ModelRenderer(this);
		receiver12_r2_r1.setRotationPoint(0.573F, 0.2958F, 12.0F);
		receiver12_r2.addChild(receiver12_r2_r1);
		setRotationAngle(receiver12_r2_r1, 0.0F, 0.0F, 0.2182F);
		receiver12_r2_r1.cubeList.add(new ModelBox(receiver12_r2_r1, 76, 85, -0.4186F, -0.5581F, -12.0F, 1, 1, 24, 0.0F, false));

		receiver13_r5 = new ModelRenderer(this);
		receiver13_r5.setRotationPoint(-3.6F, -37.5F, -11.7F);
		receiver.addChild(receiver13_r5);
		setRotationAngle(receiver13_r5, 0.0F, 0.0F, 0.4014F);
		receiver13_r5.cubeList.add(new ModelBox(receiver13_r5, 43, 27, -0.2762F, -0.8828F, 0.0F, 1, 1, 13, 0.0F, false));
		receiver13_r5.cubeList.add(new ModelBox(receiver13_r5, 74, 3, 0.0F, -1.0F, -11.0F, 1, 1, 2, 0.0F, false));

		receiver13_r6 = new ModelRenderer(this);
		receiver13_r6.setRotationPoint(-3.2F, -37.5F, -23.7F);
		receiver.addChild(receiver13_r6);
		setRotationAngle(receiver13_r6, 0.0F, 0.0F, 0.4014F);
		receiver13_r6.cubeList.add(new ModelBox(receiver13_r6, 43, 68, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver12_r3 = new ModelRenderer(this);
		receiver12_r3.setRotationPoint(0.2F, -37.5F, -23.7F);
		receiver.addChild(receiver12_r3);
		setRotationAngle(receiver12_r3, 0.0F, 0.0F, -0.4014F);
		receiver12_r3.cubeList.add(new ModelBox(receiver12_r3, 68, 38, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver11_r1 = new ModelRenderer(this);
		receiver11_r1.setRotationPoint(0.6F, -37.5F, -22.7F);
		receiver.addChild(receiver11_r1);
		setRotationAngle(receiver11_r1, 0.0F, 0.0F, -0.4014F);
		receiver11_r1.cubeList.add(new ModelBox(receiver11_r1, 26, 85, -0.7238F, -0.8828F, 0.0F, 1, 1, 24, 0.0F, false));

		receiver16_r7 = new ModelRenderer(this);
		receiver16_r7.setRotationPoint(0.4F, -38.85F, -19.0F);
		receiver.addChild(receiver16_r7);
		setRotationAngle(receiver16_r7, 0.0F, 0.0F, 1.9705F);
		receiver16_r7.cubeList.add(new ModelBox(receiver16_r7, 36, 67, -0.3675F, 0.1557F, 0.0F, 1, 1, 1, 0.0F, false));
		receiver16_r7.cubeList.add(new ModelBox(receiver16_r7, 36, 84, -0.3685F, 0.1557F, 1.0F, 1, 1, 2, 0.0F, false));

		receiver18_r3 = new ModelRenderer(this);
		receiver18_r3.setRotationPoint(0.4F, -38.85F, -19.0F);
		receiver.addChild(receiver18_r3);
		setRotationAngle(receiver18_r3, 0.0F, -1.9333F, 0.0F);
		receiver18_r3.cubeList.add(new ModelBox(receiver18_r3, 15, 42, 0.0F, -0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		receiver17_r6 = new ModelRenderer(this);
		receiver17_r6.setRotationPoint(0.4F, -38.85F, -16.5F);
		receiver.addChild(receiver17_r6);
		setRotationAngle(receiver17_r6, 0.0F, 1.9333F, 0.0F);
		receiver17_r6.cubeList.add(new ModelBox(receiver17_r6, 37, 14, -0.4675F, -0.4F, -1.1773F, 1, 2, 1, 0.0F, false));

		gun125_r1 = new ModelRenderer(this);
		gun125_r1.setRotationPoint(-2.5F, -40.1F, -1.0F);
		receiver.addChild(gun125_r1);
		setRotationAngle(gun125_r1, -0.632F, 0.0F, 0.0F);
		

		gun170 = new ModelRenderer(this);
		gun170.setRotationPoint(-3.5F, -39.25F, -10.3F);
		receiver.addChild(gun170);
		setRotationAngle(gun170, 0.0F, 0.0F, -0.0524F);
		gun170.cubeList.add(new ModelBox(gun170, 58, 19, -1.3105F, 0.1987F, -1.2F, 3, 2, 3, 0.0F, false));

		gun172_r1 = new ModelRenderer(this);
		gun172_r1.setRotationPoint(-1.3F, -0.05F, 1.0F);
		gun170.addChild(gun172_r1);
		setRotationAngle(gun172_r1, 0.0F, -0.2618F, 0.0F);
		

		gun172_r2 = new ModelRenderer(this);
		gun172_r2.setRotationPoint(-1.3F, -0.05F, 0.0F);
		gun170.addChild(gun172_r2);
		setRotationAngle(gun172_r2, 0.0F, -0.9076F, 0.0F);
		

		gun172_r2_r1 = new ModelRenderer(this);
		gun172_r2_r1.setRotationPoint(1.4979F, 1.049F, -1.0031F);
		gun172_r2.addChild(gun172_r2_r1);
		setRotationAngle(gun172_r2_r1, 0.0F, -0.3927F, 0.0F);
		gun172_r2_r1.cubeList.add(new ModelBox(gun172_r2_r1, 48, 65, -2.1592F, -0.8003F, -1.8106F, 1, 2, 3, 0.0F, false));

		gun264 = new ModelRenderer(this);
		gun264.setRotationPoint(-3.7F, -34.2F, -20.0F);
		receiver.addChild(gun264);
		setRotationAngle(gun264, 0.0F, 0.0F, 0.1578F);
		gun264.cubeList.add(new ModelBox(gun264, 58, 43, -1.0F, -3.0F, -0.3F, 1, 3, 8, -0.3F, false));
		gun264.cubeList.add(new ModelBox(gun264, 43, 63, -0.85F, -2.7F, 0.25F, 1, 2, 3, -0.1F, false));
		gun264.cubeList.add(new ModelBox(gun264, 0, 60, -0.85F, -2.7F, 4.65F, 1, 2, 3, -0.1F, false));
		gun264.cubeList.add(new ModelBox(gun264, 24, 67, -1.0F, -1.3F, 3.45F, 1, 1, 1, -0.1F, false));
		gun264.cubeList.add(new ModelBox(gun264, 65, 15, -1.001F, -1.7F, 3.449F, 1, 1, 1, -0.1F, false));
		gun264.cubeList.add(new ModelBox(gun264, 19, 0, -1.0F, -3.0F, 7.1F, 1, 3, 1, -0.3F, false));
		gun264.cubeList.add(new ModelBox(gun264, 0, 0, -1.001F, -3.001F, 7.3F, 1, 3, 1, -0.3F, false));

		rails = new ModelRenderer(this);
		rails.setRotationPoint(-2.3F, -40.275F, -37.75F);
		receiver.addChild(rails);
		rails.cubeList.add(new ModelBox(rails, 72, 21, -0.2F, -1.0F, 36.55F, 2, 1, 2, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 50, 22, -0.2F, -1.0F, 35.35F, 2, 1, 1, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 22, 39, -0.2F, -1.0F, 34.15F, 2, 1, 1, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 77, 85, -0.2F, -1.0F, 32.95F, 2, 1, 1, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 68, 85, -0.2F, -1.0F, 31.75F, 2, 1, 1, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 62, 85, -0.2F, -1.0F, 30.55F, 2, 1, 1, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 50, 30, -0.2F, -1.0F, 29.35F, 2, 1, 1, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 52, 85, -0.2F, -1.0F, 28.15F, 2, 1, 1, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 44, 85, -0.2F, -1.0F, 26.95F, 2, 1, 1, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 61, 81, -0.2F, -1.0F, 25.75F, 2, 1, 1, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 55, 81, -0.2F, -1.0F, 24.55F, 2, 1, 1, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 86, 11, -0.2F, -1.0F, 23.35F, 2, 1, 1, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 86, 13, -0.2F, -1.0F, 22.15F, 2, 1, 1, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 86, 9, -0.2F, -1.0F, 20.95F, 2, 1, 1, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 77, 79, -0.2F, -1.0F, 19.75F, 2, 1, 1, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 11, 79, -0.2F, -1.0F, 18.55F, 2, 1, 1, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 76, 65, -0.2F, -1.0F, 17.35F, 2, 1, 1, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 64, 67, -0.2F, -1.0F, 16.15F, 2, 1, 1, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 50, 60, -0.2F, -1.0F, 14.95F, 2, 1, 1, -0.2F, false));

		cube_r82 = new ModelRenderer(this);
		cube_r82.setRotationPoint(0.0F, -1.0F, 0.0F);
		rails.addChild(cube_r82);
		setRotationAngle(cube_r82, 0.0F, 0.0F, -0.7854F);
		cube_r82.cubeList.add(new ModelBox(cube_r82, 26, 84, -0.9414F, -0.0586F, 36.55F, 1, 1, 2, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 43, 16, -0.9414F, -0.0586F, 35.35F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 43, 3, -0.9414F, -0.0586F, 34.15F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 43, 57, -0.9414F, -0.0586F, 32.95F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 43, 51, -0.9414F, -0.0586F, 31.75F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 36, 50, -0.9414F, -0.0586F, 30.55F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 43, 21, -0.9414F, -0.0586F, 29.35F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 29, 50, -0.9414F, -0.0586F, 28.15F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 22, 50, -0.9414F, -0.0586F, 26.95F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 15, 50, -0.9414F, -0.0586F, 25.75F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 50, 8, -0.9414F, -0.0586F, 24.55F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 86, 39, -0.9414F, -0.0586F, 23.35F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 86, 45, -0.9414F, -0.0586F, 22.15F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 86, 35, -0.9414F, -0.0586F, 20.95F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 50, 6, -0.9414F, -0.0586F, 19.75F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 50, 2, -0.9414F, -0.0586F, 18.55F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 50, 0, -0.9414F, -0.0586F, 17.35F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 0, 50, -0.9414F, -0.0586F, 16.15F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 43, 49, -0.9414F, -0.0586F, 14.95F, 1, 1, 1, -0.201F, false));

		cube_r83 = new ModelRenderer(this);
		cube_r83.setRotationPoint(1.6F, -1.0F, 3.25F);
		rails.addChild(cube_r83);
		setRotationAngle(cube_r83, 0.0F, 0.0F, -0.7854F);
		cube_r83.cubeList.add(new ModelBox(cube_r83, 0, 84, -0.9414F, -0.0586F, 33.3F, 1, 1, 2, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 43, 9, -0.9414F, -0.0586F, 32.1F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 37, 0, -0.9414F, -0.0586F, 30.9F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 36, 48, -0.9414F, -0.0586F, 29.7F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 29, 48, -0.9414F, -0.0586F, 28.5F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 22, 48, -0.9414F, -0.0586F, 27.3F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 43, 19, -0.9414F, -0.0586F, 26.1F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 15, 48, -0.9414F, -0.0586F, 24.9F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 0, 48, -0.9414F, -0.0586F, 23.7F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 43, 45, -0.9414F, -0.0586F, 22.5F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 36, 45, -0.9414F, -0.0586F, 21.3F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 86, 37, -0.9414F, -0.0586F, 20.1F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 86, 43, -0.9414F, -0.0586F, 18.9F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 86, 33, -0.9414F, -0.0586F, 17.7F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 29, 45, -0.9414F, -0.0586F, 16.5F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 22, 45, -0.9414F, -0.0586F, 15.3F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 15, 45, -0.9414F, -0.0586F, 14.1F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 43, 43, -0.9414F, -0.0586F, 12.9F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 43, 35, -0.9414F, -0.0586F, 11.7F, 1, 1, 1, -0.201F, false));

		cube_r84 = new ModelRenderer(this);
		cube_r84.setRotationPoint(0.0F, -1.0F, 38.35F);
		rails.addChild(cube_r84);
		setRotationAngle(cube_r84, -0.1745F, -0.1719F, -0.7703F);
		cube_r84.cubeList.add(new ModelBox(cube_r84, 86, 31, -0.9372F, -0.0628F, -0.1516F, 1, 1, 1, -0.2F, false));

		cube_r85 = new ModelRenderer(this);
		cube_r85.setRotationPoint(1.6F, -1.0F, 38.35F);
		rails.addChild(cube_r85);
		setRotationAngle(cube_r85, -0.1745F, 0.1719F, 0.7703F);
		cube_r85.cubeList.add(new ModelBox(cube_r85, 86, 29, -0.0628F, -0.0628F, -0.1516F, 1, 1, 1, -0.2F, false));

		cube_r86 = new ModelRenderer(this);
		cube_r86.setRotationPoint(1.6F, -1.0F, 38.35F);
		rails.addChild(cube_r86);
		setRotationAngle(cube_r86, -0.2443F, 0.0F, 0.0F);
		cube_r86.cubeList.add(new ModelBox(cube_r86, 71, 38, -1.8F, -0.0059F, -0.1516F, 2, 1, 2, -0.2F, false));

		handguard = new ModelRenderer(this);
		handguard.setRotationPoint(0.0F, 22.2F, 1.0F);
		handguard.cubeList.add(new ModelBox(handguard, 76, 113, -2.5F, -33.7F, -43.7F, 2, 1, 20, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 69, 43, -2.5F, -35.2F, -48.7F, 2, 1, 5, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 9, 8, -2.5F, -38.2F, -48.7F, 2, 2, 5, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 12, 11, -2.0F, -38.6F, -50.4F, 1, 2, 2, -0.2F, false));
		handguard.cubeList.add(new ModelBox(handguard, 11, 10, -2.5F, -39.2F, -48.7F, 2, 1, 3, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 11, 10, -2.5F, -39.0F, -45.8F, 2, 1, 3, -0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 73, 47, -2.5F, -36.2F, -44.7F, 2, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 73, 47, -2.5F, -36.2F, -48.7F, 2, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 73, 48, -2.5F, -34.2F, -44.7F, 2, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 73, 48, -2.5F, -34.2F, -46.7F, 2, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 73, 48, -2.5F, -34.2F, -48.7F, 2, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 107, 64, -2.0059F, -39.9865F, -26.701F, 1, 1, 2, -0.3F, false));
		handguard.cubeList.add(new ModelBox(handguard, 107, 64, -2.0059F, -39.9865F, -29.201F, 1, 1, 2, -0.3F, false));
		handguard.cubeList.add(new ModelBox(handguard, 107, 64, -2.0059F, -39.9865F, -31.701F, 1, 1, 2, -0.3F, false));
		handguard.cubeList.add(new ModelBox(handguard, 107, 64, -2.0059F, -39.9865F, -34.201F, 1, 1, 2, -0.3F, false));
		handguard.cubeList.add(new ModelBox(handguard, 107, 64, -2.0059F, -39.9865F, -36.701F, 1, 1, 2, -0.3F, false));
		handguard.cubeList.add(new ModelBox(handguard, 107, 64, -2.0059F, -39.9865F, -39.201F, 1, 1, 2, -0.3F, false));
		handguard.cubeList.add(new ModelBox(handguard, 107, 64, -2.0059F, -39.9865F, -41.701F, 1, 1, 2, -0.3F, false));
		handguard.cubeList.add(new ModelBox(handguard, 106, 63, -2.0059F, -39.9865F, -45.201F, 1, 1, 3, -0.3F, false));
		handguard.cubeList.add(new ModelBox(handguard, 107, 64, -2.0059F, -39.9865F, -45.701F, 1, 1, 2, -0.3F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.0137F, -33.7137F, -34.7F);
		handguard.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 50, 112, 1.0F, -4.5F, -9.0F, 2, 1, 20, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.0137F, -33.7137F, -34.7F);
		handguard.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -1.5708F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 113, 27, 1.0F, -0.5F, -9.0F, 2, 1, 20, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-3.9961F, -39.8115F, -35.702F);
		handguard.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -1.1781F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 82, 40, -0.6F, 1.5F, -6.0F, 1, 1, 2, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 82, 40, -0.6F, 1.5F, -10.0F, 1, 1, 2, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 81, 39, -0.6F, 1.5F, -9.5F, 1, 1, 3, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 82, 40, -0.6F, 1.5F, -1.0F, 1, 1, 2, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 82, 40, -0.6F, 1.5F, -3.5F, 1, 1, 2, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 82, 40, -0.6F, 1.5F, 4.0F, 1, 1, 2, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 82, 40, -0.6F, 1.5F, 1.5F, 1, 1, 2, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 82, 40, -0.6F, 1.5F, 6.5F, 1, 1, 2, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 82, 40, -0.6F, 1.5F, 9.0F, 1, 1, 2, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 63, 21, -1.0F, 1.5F, -10.0F, 1, 1, 21, -0.3F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.9941F, -39.8115F, -36.201F);
		handguard.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 1.1781F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 107, 64, -0.4F, 1.5F, -9.5F, 1, 1, 2, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 107, 64, -0.4F, 1.5F, -5.5F, 1, 1, 2, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 106, 63, -0.4F, 1.5F, -9.0F, 1, 1, 3, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 107, 64, -0.4F, 1.5F, -0.5F, 1, 1, 2, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 107, 64, -0.4F, 1.5F, -3.0F, 1, 1, 2, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 107, 64, -0.4F, 1.5F, 4.5F, 1, 1, 2, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 107, 64, -0.4F, 1.5F, 2.0F, 1, 1, 2, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 107, 64, -0.4F, 1.5F, 7.0F, 1, 1, 2, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 107, 64, -0.4F, 1.5F, 9.5F, 1, 1, 2, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 88, 45, 0.0F, 1.5F, -9.5F, 1, 1, 21, -0.3F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-0.1694F, -41.1572F, -35.701F);
		handguard.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.3927F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 88, 45, -0.8F, 1.5F, -10.0F, 1, 1, 21, -0.3F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-2.8326F, -41.1572F, -35.702F);
		handguard.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.3927F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 63, 21, -0.2F, 1.5F, -10.0F, 1, 1, 21, -0.3F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-3.7838F, -40.2315F, -35.702F);
		handguard.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.9163F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 63, 21, -0.2F, 1.5F, -10.0F, 1, 1, 21, -0.3F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.7818F, -40.2315F, -35.701F);
		handguard.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.9163F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 88, 45, -0.8F, 1.5F, -10.0F, 1, 1, 21, -0.3F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-3.669F, -37.4462F, -34.7F);
		handguard.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -1.1781F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 138, 3, -1.0F, -0.5F, -9.0F, 1, 1, 20, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.669F, -37.4462F, -34.7F);
		handguard.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 1.1781F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 72, 136, 0.0F, -0.5F, -9.0F, 1, 1, 20, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-3.2325F, -37.8827F, -34.7F);
		handguard.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.3927F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 2, 135, 0.0F, -0.5F, -9.0F, 1, 1, 20, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.2325F, -37.8827F, -34.7F);
		handguard.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, 0.3927F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 131, 119, -1.0F, -0.5F, -9.0F, 1, 1, 20, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-2.3087F, -33.1619F, -34.7F);
		handguard.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, 0.3927F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 102, 135, -1.0F, -0.5F, -9.0F, 1, 1, 20, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-0.6913F, -33.1619F, -34.7F);
		handguard.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -0.3927F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 48, 135, 0.0F, -0.5F, -9.0F, 1, 1, 20, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-3.0703F, -37.284F, -34.7F);
		handguard.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, 0.7854F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 114, 50, -1.0F, -0.5F, -9.0F, 1, 1, 20, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.0703F, -37.284F, -34.7F);
		handguard.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, -0.7854F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 114, 2, 0.0F, -0.5F, -9.0F, 1, 1, 20, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.0703F, -33.4362F, -34.7F);
		handguard.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, -0.7854F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 130, 96, 0.0F, -0.5F, -9.0F, 1, 1, 20, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-3.0703F, -33.4362F, -34.7F);
		handguard.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, 0.7854F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 129, 73, -1.0F, -0.5F, -9.0F, 1, 1, 20, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.669F, -33.9811F, -34.7F);
		handguard.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, -1.1781F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 139, 49, 0.0F, -0.5F, -9.0F, 1, 1, 20, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-3.669F, -33.9811F, -34.7F);
		handguard.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, 1.1781F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 139, 26, -1.0F, -0.5F, -9.0F, 1, 1, 20, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gun.render(f5);
		receiver.render(f5);
		handguard.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}