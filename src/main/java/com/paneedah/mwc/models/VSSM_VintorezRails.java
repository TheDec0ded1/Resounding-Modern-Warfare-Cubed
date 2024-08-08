package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class VSSM_VintorezRails extends ModelBase {
	private final ModelRenderer vssm_rails;
	private final ModelRenderer tri_rail_mount;
	private final ModelRenderer cube_r2;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer bone46;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer bone47;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer bone48;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer bone49;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer bone51;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer bone53;
	private final ModelRenderer cube_r117;
	private final ModelRenderer cube_r118;
	private final ModelRenderer bone52;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;

	public VSSM_VintorezRails() {
		textureWidth = 256;
		textureHeight = 256;

		vssm_rails = new ModelRenderer(this);
		vssm_rails.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		tri_rail_mount = new ModelRenderer(this);
		tri_rail_mount.setRotationPoint(-1.5F, -37.9F, -43.55F);
		vssm_rails.addChild(tri_rail_mount);
		setRotationAngle(tri_rail_mount, 0.0F, 3.1416F, 0.0F);
		tri_rail_mount.cubeList.add(new ModelBox(tri_rail_mount, 101, 124, 1.0126F, 0.1295F, -5.75F, 1, 1, 10, -0.2F, false));
		tri_rail_mount.cubeList.add(new ModelBox(tri_rail_mount, 102, 42, 1.0126F, -0.4705F, -5.75F, 1, 1, 9, -0.2F, false));
		tri_rail_mount.cubeList.add(new ModelBox(tri_rail_mount, 17, 80, -2.0126F, -0.4705F, -5.75F, 1, 1, 9, -0.2F, false));
		tri_rail_mount.cubeList.add(new ModelBox(tri_rail_mount, 15, 123, -2.0126F, 0.1295F, -5.75F, 1, 1, 10, -0.2F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.5F, 0.0F, 4.05F);
		tri_rail_mount.addChild(cube_r2);
		setRotationAngle(cube_r2, 1.0297F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 153, 109, -0.5126F, -0.6303F, -1.0825F, 1, 1, 1, -0.201F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 106, 153, -0.5126F, -1.2003F, -1.0825F, 1, 1, 1, -0.202F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 153, 105, 2.5126F, -1.2003F, -1.0825F, 1, 1, 1, -0.202F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 153, 99, 2.5126F, -0.6303F, -1.0825F, 1, 1, 1, -0.201F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(3.3F, 1.9F, 11.65F);
		tri_rail_mount.addChild(bone2);
		

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.925F);
		

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 1.2F, 0.0F);
		bone2.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.925F);
		

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-3.3F, 1.9F, 11.65F);
		tri_rail_mount.addChild(bone3);
		

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.925F);
		

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 1.2F, 0.0F);
		bone3.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.925F);
		

		bone46 = new ModelRenderer(this);
		bone46.setRotationPoint(0.6F, 5.7F, 11.65F);
		tri_rail_mount.addChild(bone46);
		setRotationAngle(bone46, 0.0F, 0.0F, 1.5708F);
		

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone46.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.925F);
		

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 1.2F, 0.0F);
		bone46.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.925F);
		

		bone47 = new ModelRenderer(this);
		bone47.setRotationPoint(3.0F, 2.4F, -3.55F);
		tri_rail_mount.addChild(bone47);
		

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone47.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 0.4363F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 80, -1.1655F, 0.4547F, -2.0F, 1, 2, 14, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone47.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.4363F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 43, 59, -1.4547F, -1.8345F, -2.0F, 1, 2, 14, 0.0F, false));

		bone48 = new ModelRenderer(this);
		bone48.setRotationPoint(-3.0F, 2.4F, -3.55F);
		tri_rail_mount.addChild(bone48);
		

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone48.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.4363F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 58, 0.1655F, 0.4547F, -2.0F, 1, 2, 14, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone48.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, 0.4363F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 43, 42, 0.4547F, -1.8345F, -2.0F, 1, 2, 14, 0.0F, false));

		bone49 = new ModelRenderer(this);
		bone49.setRotationPoint(0.0F, 5.4F, -3.55F);
		tri_rail_mount.addChild(bone49);
		setRotationAngle(bone49, 0.0F, 0.0F, 1.5708F);
		

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone49.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, 0.4363F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 43, 17, -1.0F, 0.0F, -2.0F, 1, 2, 14, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone49.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -0.4363F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 43, 0, -1.0F, -2.0F, -2.0F, 1, 2, 14, 0.0F, false));

		bone51 = new ModelRenderer(this);
		bone51.setRotationPoint(1.7F, -50.1F, -47.75F);
		vssm_rails.addChild(bone51);
		setRotationAngle(bone51, 0.0F, 0.0F, 1.5708F);
		bone51.cubeList.add(new ModelBox(bone51, 101, 149, 13.9F, -0.2F, 1.45F, 1, 1, 1, -0.199F, false));
		bone51.cubeList.add(new ModelBox(bone51, 96, 149, 13.9F, -0.2F, 2.7F, 1, 1, 1, -0.199F, false));
		bone51.cubeList.add(new ModelBox(bone51, 149, 93, 13.9F, -0.2F, 3.95F, 1, 1, 1, -0.199F, false));
		bone51.cubeList.add(new ModelBox(bone51, 149, 84, 13.9F, -0.2F, 5.2F, 1, 1, 1, -0.199F, false));
		bone51.cubeList.add(new ModelBox(bone51, 66, 149, 13.9F, -0.2F, 6.45F, 1, 1, 1, -0.199F, false));
		bone51.cubeList.add(new ModelBox(bone51, 47, 149, 13.9F, -0.2F, 7.7F, 1, 1, 1, -0.199F, false));
		bone51.cubeList.add(new ModelBox(bone51, 25, 149, 13.9F, -0.2F, 8.95F, 1, 1, 1, -0.199F, false));
		bone51.cubeList.add(new ModelBox(bone51, 43, 82, 14.0F, 0.4F, -3.85F, 2, 1, 13, -0.001F, false));
		bone51.cubeList.add(new ModelBox(bone51, 8, 11, 14.0F, 0.4F, 8.75F, 2, 1, 1, -0.002F, false));
		bone51.cubeList.add(new ModelBox(bone51, 86, 42, 13.8F, 0.4F, -3.85F, 1, 1, 13, 0.0F, false));
		bone51.cubeList.add(new ModelBox(bone51, 26, 50, 13.8F, 0.4F, 8.75F, 1, 1, 1, -0.003F, false));
		bone51.cubeList.add(new ModelBox(bone51, 20, 149, 13.9F, -0.2F, 0.15F, 1, 1, 1, -0.199F, false));
		bone51.cubeList.add(new ModelBox(bone51, 15, 149, 13.9F, -0.2F, -4.05F, 1, 1, 1, -0.199F, false));
		bone51.cubeList.add(new ModelBox(bone51, 145, 23, 14.8987F, -0.2016F, -4.049F, 1, 1, 1, -0.199F, false));
		bone51.cubeList.add(new ModelBox(bone51, 145, 26, 14.8987F, -0.2016F, 0.151F, 1, 1, 1, -0.199F, false));
		bone51.cubeList.add(new ModelBox(bone51, 145, 29, 14.8987F, -0.2016F, 1.451F, 1, 1, 1, -0.199F, false));
		bone51.cubeList.add(new ModelBox(bone51, 144, 6, 14.8987F, -0.2016F, -1.149F, 1, 1, 1, -0.199F, false));
		bone51.cubeList.add(new ModelBox(bone51, 53, 144, 13.9F, -0.2F, -1.15F, 1, 1, 1, -0.199F, false));
		bone51.cubeList.add(new ModelBox(bone51, 144, 85, 13.9F, -0.2F, -2.45F, 1, 1, 1, -0.199F, false));
		bone51.cubeList.add(new ModelBox(bone51, 86, 144, 14.8987F, -0.2016F, -2.449F, 1, 1, 1, -0.199F, false));
		bone51.cubeList.add(new ModelBox(bone51, 47, 145, 14.8987F, -0.2016F, 2.701F, 1, 1, 1, -0.199F, false));
		bone51.cubeList.add(new ModelBox(bone51, 134, 143, 13.9F, -0.2F, -3.7F, 1, 1, 1, -0.199F, false));
		bone51.cubeList.add(new ModelBox(bone51, 144, 3, 14.8987F, -0.2016F, -3.699F, 1, 1, 1, -0.199F, false));
		bone51.cubeList.add(new ModelBox(bone51, 58, 145, 14.8987F, -0.2016F, 3.951F, 1, 1, 1, -0.199F, false));
		bone51.cubeList.add(new ModelBox(bone51, 63, 145, 14.8987F, -0.2016F, 5.201F, 1, 1, 1, -0.199F, false));
		bone51.cubeList.add(new ModelBox(bone51, 145, 82, 14.8987F, -0.2016F, 6.451F, 1, 1, 1, -0.199F, false));
		bone51.cubeList.add(new ModelBox(bone51, 91, 145, 14.8987F, -0.2016F, 7.701F, 1, 1, 1, -0.199F, false));
		bone51.cubeList.add(new ModelBox(bone51, 145, 96, 14.8987F, -0.2016F, 8.951F, 1, 1, 1, -0.199F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-1.6F, 0.0F, -1.25F);
		bone51.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, 0.8901F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 10, 149, 9.6804F, -12.4011F, 1.4F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 149, 6, 9.6804F, -12.4011F, -2.8F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 149, 3, 9.6804F, -12.4011F, 10.2F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 149, 0, 9.6804F, -12.4011F, 8.95F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 139, 148, 9.6804F, -12.4011F, 7.7F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 115, 148, 9.6804F, -12.4011F, 6.45F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 148, 110, 9.6804F, -12.4011F, 5.2F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 110, 148, 9.6804F, -12.4011F, 3.95F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 129, 143, 9.6804F, -12.4011F, -2.45F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 148, 99, 9.6804F, -12.4011F, 2.7F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 144, 71, 9.6804F, -12.4011F, 0.1F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 76, 144, 9.6804F, -12.4011F, -1.2F, 1, 1, 1, -0.198F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(0.0F, 0.0F, -1.25F);
		bone51.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, -0.8901F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 91, 148, 9.0804F, 12.0011F, 1.4F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 148, 90, 9.0804F, 12.0011F, -2.8F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 148, 87, 9.0804F, 12.0011F, 10.2F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 148, 73, 9.0804F, 12.0011F, 8.95F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 61, 148, 9.0804F, 12.0011F, 7.7F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 56, 148, 9.0804F, 12.0011F, 6.45F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 5, 148, 9.0804F, 12.0011F, 5.2F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 148, 9.0804F, 12.0011F, 3.95F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 144, 0, 9.0804F, 12.0011F, -2.45F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 147, 147, 9.0804F, 12.0011F, 2.7F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 30, 144, 9.0804F, 12.0011F, 0.1F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 144, 93, 9.0804F, 12.0011F, -1.2F, 1, 1, 1, -0.198F, false));

		bone53 = new ModelRenderer(this);
		bone53.setRotationPoint(-4.7F, -50.1F, -47.75F);
		vssm_rails.addChild(bone53);
		setRotationAngle(bone53, 0.0F, 0.0F, -1.5708F);
		bone53.cubeList.add(new ModelBox(bone53, 147, 142, -15.9F, -0.2F, 1.45F, 1, 1, 1, -0.199F, false));
		bone53.cubeList.add(new ModelBox(bone53, 134, 147, -15.9F, -0.2F, 2.7F, 1, 1, 1, -0.199F, false));
		bone53.cubeList.add(new ModelBox(bone53, 147, 125, -15.9F, -0.2F, 3.95F, 1, 1, 1, -0.199F, false));
		bone53.cubeList.add(new ModelBox(bone53, 86, 147, -15.9F, -0.2F, 5.2F, 1, 1, 1, -0.199F, false));
		bone53.cubeList.add(new ModelBox(bone53, 73, 147, -15.9F, -0.2F, 6.45F, 1, 1, 1, -0.199F, false));
		bone53.cubeList.add(new ModelBox(bone53, 147, 60, -15.9F, -0.2F, 7.7F, 1, 1, 1, -0.199F, false));
		bone53.cubeList.add(new ModelBox(bone53, 51, 147, -15.9F, -0.2F, 8.95F, 1, 1, 1, -0.199F, false));
		bone53.cubeList.add(new ModelBox(bone53, 86, 15, -16.0F, 0.4F, -3.85F, 2, 1, 13, -0.001F, false));
		bone53.cubeList.add(new ModelBox(bone53, 60, 47, -16.0F, 0.4F, 8.75F, 2, 1, 1, -0.002F, false));
		bone53.cubeList.add(new ModelBox(bone53, 86, 82, -14.8F, 0.4F, -3.85F, 1, 1, 13, 0.0F, false));
		bone53.cubeList.add(new ModelBox(bone53, 43, 147, -14.8F, 0.4F, 8.75F, 1, 1, 1, -0.003F, false));
		bone53.cubeList.add(new ModelBox(bone53, 147, 34, -15.9F, -0.2F, 0.15F, 1, 1, 1, -0.199F, false));
		bone53.cubeList.add(new ModelBox(bone53, 30, 147, -15.9F, -0.2F, -4.05F, 1, 1, 1, -0.199F, false));
		bone53.cubeList.add(new ModelBox(bone53, 114, 145, -14.9013F, -0.202F, 8.951F, 1, 1, 1, -0.199F, false));
		bone53.cubeList.add(new ModelBox(bone53, 145, 114, -14.9013F, -0.202F, 7.701F, 1, 1, 1, -0.199F, false));
		bone53.cubeList.add(new ModelBox(bone53, 119, 145, -14.9013F, -0.202F, 6.451F, 1, 1, 1, -0.199F, false));
		bone53.cubeList.add(new ModelBox(bone53, 145, 136, -14.9013F, -0.202F, 5.201F, 1, 1, 1, -0.199F, false));
		bone53.cubeList.add(new ModelBox(bone53, 138, 145, -14.9013F, -0.202F, 3.951F, 1, 1, 1, -0.199F, false));
		bone53.cubeList.add(new ModelBox(bone53, 143, 145, -14.9013F, -0.202F, 2.701F, 1, 1, 1, -0.199F, false));
		bone53.cubeList.add(new ModelBox(bone53, 105, 143, -15.9F, -0.2F, -3.7F, 1, 1, 1, -0.199F, false));
		bone53.cubeList.add(new ModelBox(bone53, 143, 111, -14.9013F, -0.202F, -3.699F, 1, 1, 1, -0.199F, false));
		bone53.cubeList.add(new ModelBox(bone53, 10, 146, -14.9013F, -0.202F, 1.451F, 1, 1, 1, -0.199F, false));
		bone53.cubeList.add(new ModelBox(bone53, 15, 146, -14.9013F, -0.202F, 0.151F, 1, 1, 1, -0.199F, false));
		bone53.cubeList.add(new ModelBox(bone53, 144, 108, -14.9013F, -0.202F, -2.449F, 1, 1, 1, -0.199F, false));
		bone53.cubeList.add(new ModelBox(bone53, 0, 145, -15.9F, -0.2F, -2.45F, 1, 1, 1, -0.199F, false));
		bone53.cubeList.add(new ModelBox(bone53, 145, 12, -15.9F, -0.2F, -1.15F, 1, 1, 1, -0.199F, false));
		bone53.cubeList.add(new ModelBox(bone53, 145, 18, -14.9013F, -0.202F, -1.149F, 1, 1, 1, -0.199F, false));
		bone53.cubeList.add(new ModelBox(bone53, 20, 146, -14.9013F, -0.202F, -4.049F, 1, 1, 1, -0.199F, false));

		cube_r117 = new ModelRenderer(this);
		cube_r117.setRotationPoint(1.6F, 0.0F, -1.25F);
		bone53.addChild(cube_r117);
		setRotationAngle(cube_r117, 0.0F, 0.0F, -0.8901F);
		cube_r117.cubeList.add(new ModelBox(cube_r117, 146, 131, -10.6804F, -12.4011F, 1.4F, 1, 1, 1, -0.198F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 129, 146, -10.6804F, -12.4011F, -2.8F, 1, 1, 1, -0.198F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 146, 128, -10.6804F, -12.4011F, 10.2F, 1, 1, 1, -0.198F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 146, 122, -10.6804F, -12.4011F, 8.95F, 1, 1, 1, -0.198F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 106, 146, -10.6804F, -12.4011F, 7.7F, 1, 1, 1, -0.198F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 146, 104, -10.6804F, -12.4011F, 6.45F, 1, 1, 1, -0.198F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 101, 146, -10.6804F, -12.4011F, 5.2F, 1, 1, 1, -0.198F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 96, 146, -10.6804F, -12.4011F, 3.95F, 1, 1, 1, -0.198F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 110, 143, -10.6804F, -12.4011F, -2.45F, 1, 1, 1, -0.198F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 146, 68, -10.6804F, -12.4011F, 2.7F, 1, 1, 1, -0.198F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 144, 101, -10.6804F, -12.4011F, -1.2F, 1, 1, 1, -0.198F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 145, 15, -10.6804F, -12.4011F, 0.1F, 1, 1, 1, -0.198F, false));

		cube_r118 = new ModelRenderer(this);
		cube_r118.setRotationPoint(0.0F, 0.0F, -1.25F);
		bone53.addChild(cube_r118);
		setRotationAngle(cube_r118, 0.0F, 0.0F, 0.8901F);
		cube_r118.cubeList.add(new ModelBox(cube_r118, 68, 146, -10.0804F, 12.0011F, 1.4F, 1, 1, 1, -0.198F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 146, 65, -10.0804F, 12.0011F, -2.8F, 1, 1, 1, -0.198F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 146, 57, -10.0804F, 12.0011F, 10.2F, 1, 1, 1, -0.198F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 146, 54, -10.0804F, 12.0011F, 8.95F, 1, 1, 1, -0.198F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 146, 51, -10.0804F, 12.0011F, 7.7F, 1, 1, 1, -0.198F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 146, 48, -10.0804F, 12.0011F, 6.45F, 1, 1, 1, -0.198F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 146, 45, -10.0804F, 12.0011F, 5.2F, 1, 1, 1, -0.198F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 146, 42, -10.0804F, 12.0011F, 3.95F, 1, 1, 1, -0.198F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 100, 143, -10.0804F, 12.0011F, -2.45F, 1, 1, 1, -0.198F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 25, 146, -10.0804F, 12.0011F, 2.7F, 1, 1, 1, -0.198F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 144, 139, -10.0804F, 12.0011F, -1.2F, 1, 1, 1, -0.198F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 5, 145, -10.0804F, 12.0011F, 0.1F, 1, 1, 1, -0.198F, false));

		bone52 = new ModelRenderer(this);
		bone52.setRotationPoint(-1.5401F, -32.4352F, -44.671F);
		vssm_rails.addChild(bone52);
		setRotationAngle(bone52, 0.0F, 0.0F, 3.1416F);
		bone52.cubeList.add(new ModelBox(bone52, 19, 135, -1.0352F, -0.5848F, -1.629F, 1, 1, 1, -0.199F, false));
		bone52.cubeList.add(new ModelBox(bone52, 86, 134, -1.0352F, -0.5848F, -0.379F, 1, 1, 1, -0.199F, false));
		bone52.cubeList.add(new ModelBox(bone52, 129, 129, -1.0352F, -0.5848F, 0.871F, 1, 1, 1, -0.199F, false));
		bone52.cubeList.add(new ModelBox(bone52, 129, 122, -1.0352F, -0.5848F, 2.121F, 1, 1, 1, -0.199F, false));
		bone52.cubeList.add(new ModelBox(bone52, 129, 105, -1.0352F, -0.5848F, 3.371F, 1, 1, 1, -0.199F, false));
		bone52.cubeList.add(new ModelBox(bone52, 129, 98, -1.0352F, -0.5848F, 4.621F, 1, 1, 1, -0.199F, false));
		bone52.cubeList.add(new ModelBox(bone52, 129, 93, -1.0352F, -0.5848F, 5.871F, 1, 1, 1, -0.199F, false));
		bone52.cubeList.add(new ModelBox(bone52, 86, 0, -1.1352F, 0.0152F, -6.929F, 2, 1, 13, -0.001F, false));
		bone52.cubeList.add(new ModelBox(bone52, 8, 29, -1.1352F, 0.0152F, 5.671F, 2, 1, 1, -0.002F, false));
		bone52.cubeList.add(new ModelBox(bone52, 86, 57, 0.0648F, 0.0152F, -6.929F, 1, 1, 13, 0.0F, false));
		bone52.cubeList.add(new ModelBox(bone52, 143, 89, 0.0648F, 0.0152F, 5.671F, 1, 1, 1, -0.003F, false));
		bone52.cubeList.add(new ModelBox(bone52, 129, 90, -1.0352F, -0.5848F, -2.929F, 1, 1, 1, -0.199F, false));
		bone52.cubeList.add(new ModelBox(bone52, 111, 25, -1.0352F, -0.5848F, -7.129F, 1, 1, 1, -0.199F, false));
		bone52.cubeList.add(new ModelBox(bone52, 143, 75, -0.0364F, -0.5869F, 5.872F, 1, 1, 1, -0.199F, false));
		bone52.cubeList.add(new ModelBox(bone52, 71, 143, -0.0364F, -0.5869F, 4.622F, 1, 1, 1, -0.199F, false));
		bone52.cubeList.add(new ModelBox(bone52, 43, 143, -0.0364F, -0.5869F, 3.372F, 1, 1, 1, -0.199F, false));
		bone52.cubeList.add(new ModelBox(bone52, 25, 143, -0.0364F, -0.5869F, 2.122F, 1, 1, 1, -0.199F, false));
		bone52.cubeList.add(new ModelBox(bone52, 20, 143, -0.0364F, -0.5869F, 0.872F, 1, 1, 1, -0.199F, false));
		bone52.cubeList.add(new ModelBox(bone52, 15, 143, -0.0364F, -0.5869F, -0.378F, 1, 1, 1, -0.199F, false));
		bone52.cubeList.add(new ModelBox(bone52, 111, 10, -1.0352F, -0.5848F, -6.779F, 1, 1, 1, -0.199F, false));
		bone52.cubeList.add(new ModelBox(bone52, 10, 143, -0.0364F, -0.5869F, -6.778F, 1, 1, 1, -0.199F, false));
		bone52.cubeList.add(new ModelBox(bone52, 142, 142, -0.0364F, -0.5869F, -1.628F, 1, 1, 1, -0.199F, false));
		bone52.cubeList.add(new ModelBox(bone52, 142, 133, -0.0364F, -0.5869F, -2.928F, 1, 1, 1, -0.199F, false));
		bone52.cubeList.add(new ModelBox(bone52, 142, 126, -0.0364F, -0.5869F, -5.528F, 1, 1, 1, -0.199F, false));
		bone52.cubeList.add(new ModelBox(bone52, 109, 100, -1.0352F, -0.5848F, -5.529F, 1, 1, 1, -0.199F, false));
		bone52.cubeList.add(new ModelBox(bone52, 109, 92, -1.0352F, -0.5848F, -4.229F, 1, 1, 1, -0.199F, false));
		bone52.cubeList.add(new ModelBox(bone52, 116, 142, -0.0364F, -0.5869F, -4.228F, 1, 1, 1, -0.199F, false));
		bone52.cubeList.add(new ModelBox(bone52, 66, 142, -0.0364F, -0.5869F, -7.128F, 1, 1, 1, -0.199F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(16.4648F, -0.3848F, -4.329F);
		bone52.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.0F, -0.8901F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 115, 162, -10.6804F, -12.4011F, 1.4F, 1, 1, 1, -0.198F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 162, 107, -10.6804F, -12.4011F, -2.8F, 1, 1, 1, -0.198F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 104, 162, -10.6804F, -12.4011F, 10.2F, 1, 1, 1, -0.198F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 99, 162, -10.6804F, -12.4011F, 8.95F, 1, 1, 1, -0.198F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 162, 96, -10.6804F, -12.4011F, 7.7F, 1, 1, 1, -0.198F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 94, 162, -10.6804F, -12.4011F, 6.45F, 1, 1, 1, -0.198F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 89, 162, -10.6804F, -12.4011F, 5.2F, 1, 1, 1, -0.198F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 162, 85, -10.6804F, -12.4011F, 3.95F, 1, 1, 1, -0.198F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 73, 162, -10.6804F, -12.4011F, -2.45F, 1, 1, 1, -0.198F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 68, 162, -10.6804F, -12.4011F, 2.7F, 1, 1, 1, -0.198F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 63, 162, -10.6804F, -12.4011F, -1.2F, 1, 1, 1, -0.198F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 58, 162, -10.6804F, -12.4011F, 0.1F, 1, 1, 1, -0.198F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(14.8648F, -0.3848F, -4.329F);
		bone52.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, 0.8901F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 61, 142, -10.0804F, 12.0011F, 1.4F, 1, 1, 1, -0.198F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 49, 142, -10.0804F, 12.0011F, -2.8F, 1, 1, 1, -0.198F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 5, 142, -10.0804F, 12.0011F, 10.2F, 1, 1, 1, -0.198F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 142, -10.0804F, 12.0011F, 8.95F, 1, 1, 1, -0.198F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 91, 141, -10.0804F, 12.0011F, 7.7F, 1, 1, 1, -0.198F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 86, 141, -10.0804F, 12.0011F, 6.45F, 1, 1, 1, -0.198F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 75, 141, -10.0804F, 12.0011F, 5.2F, 1, 1, 1, -0.198F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 56, 141, -10.0804F, 12.0011F, 3.95F, 1, 1, 1, -0.198F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 33, 141, -10.0804F, 12.0011F, -2.45F, 1, 1, 1, -0.198F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 112, 140, -10.0804F, 12.0011F, 2.7F, 1, 1, 1, -0.198F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 76, 138, -10.0804F, 12.0011F, -1.2F, 1, 1, 1, -0.198F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 33, 138, -10.0804F, 12.0011F, 0.1F, 1, 1, 1, -0.198F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		vssm_rails.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}