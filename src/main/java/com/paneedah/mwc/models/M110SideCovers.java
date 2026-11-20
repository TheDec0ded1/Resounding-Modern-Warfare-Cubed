package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M110SideCovers extends ModelBase {
	private final ModelRenderer coversM110Side;
	private final ModelRenderer bone11;
	private final ModelRenderer handguard118_r1;
	private final ModelRenderer handguard119_r1;
	private final ModelRenderer handguard118_r2;
	private final ModelRenderer handguard117_r1;
	private final ModelRenderer handguard112_r1;
	private final ModelRenderer handguard113_r1;
	private final ModelRenderer handguard108_r1;
	private final ModelRenderer handguard109_r1;
	private final ModelRenderer handguard109_r2;
	private final ModelRenderer handguard108_r2;
	private final ModelRenderer handguard107_r1;
	private final ModelRenderer handguard108_r3;
	private final ModelRenderer bone12;
	private final ModelRenderer handguard119_r2;
	private final ModelRenderer handguard120_r1;
	private final ModelRenderer handguard119_r3;
	private final ModelRenderer handguard118_r3;
	private final ModelRenderer handguard113_r2;
	private final ModelRenderer handguard114_r1;
	private final ModelRenderer handguard109_r3;
	private final ModelRenderer handguard110_r1;
	private final ModelRenderer handguard110_r2;
	private final ModelRenderer handguard109_r4;
	private final ModelRenderer handguard108_r4;
	private final ModelRenderer handguard109_r5;

	public M110SideCovers() {
		textureWidth = 544;
		textureHeight = 544;

		coversM110Side = new ModelRenderer(this);
		coversM110Side.setRotationPoint(2.201F, -27.6F, -28.199F);
		

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(0.5F, 12.75F, -1.0F);
		coversM110Side.addChild(bone11);
		bone11.cubeList.add(new ModelBox(bone11, 184, 477, -1.1F, 0.0F, -20.901F, 1, 1, 20, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 524, 520, -0.9F, 0.0F, -2.901F, 1, 1, 1, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 522, 524, -1.0F, 0.0F, -8.901F, 1, 1, 1, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 524, 522, -1.0F, 0.0F, -6.901F, 1, 1, 1, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 0, 525, -1.0F, 0.0F, -4.901F, 1, 1, 1, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 4, 525, -1.0F, 0.0F, -10.901F, 1, 1, 1, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 8, 525, -1.0F, 0.0F, -12.901F, 1, 1, 1, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 12, 525, -1.0F, 0.0F, -14.901F, 1, 1, 1, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 16, 525, -1.0F, 0.0F, -16.801F, 1, 1, 1, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 526, 36, -1.0F, 0.0F, -18.801F, 1, 1, 1, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 56, 526, -1.0F, 0.0F, -20.801F, 1, 1, 1, 0.0F, false));

		handguard118_r1 = new ModelRenderer(this);
		handguard118_r1.setRotationPoint(-0.3F, 1.95F, -4.9F);
		bone11.addChild(handguard118_r1);
		setRotationAngle(handguard118_r1, 0.0F, 0.0F, 0.8203F);
		handguard118_r1.cubeList.add(new ModelBox(handguard118_r1, 20, 525, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		handguard118_r1.cubeList.add(new ModelBox(handguard118_r1, 60, 525, -1.0F, 0.0F, -4.0F, 1, 1, 1, 0.0F, false));
		handguard118_r1.cubeList.add(new ModelBox(handguard118_r1, 64, 525, -1.0F, 0.0F, -8.0F, 1, 1, 1, 0.0F, false));
		handguard118_r1.cubeList.add(new ModelBox(handguard118_r1, 68, 525, -1.0F, 0.0F, -2.0F, 1, 1, 1, 0.0F, false));
		handguard118_r1.cubeList.add(new ModelBox(handguard118_r1, 72, 525, -1.0F, 0.0F, -6.0F, 1, 1, 1, 0.0F, false));
		handguard118_r1.cubeList.add(new ModelBox(handguard118_r1, 76, 525, -1.0F, 0.0F, -10.0F, 1, 1, 1, 0.0F, false));
		handguard118_r1.cubeList.add(new ModelBox(handguard118_r1, 80, 525, -1.0F, 0.0F, -11.9F, 1, 1, 1, 0.0F, false));
		handguard118_r1.cubeList.add(new ModelBox(handguard118_r1, 526, 34, -1.0F, 0.0F, -13.9F, 1, 1, 1, 0.0F, false));
		handguard118_r1.cubeList.add(new ModelBox(handguard118_r1, 526, 52, -1.0F, 0.0F, -15.9F, 1, 1, 1, 0.0F, false));

		handguard119_r1 = new ModelRenderer(this);
		handguard119_r1.setRotationPoint(-0.2F, 1.95F, -2.9F);
		bone11.addChild(handguard119_r1);
		setRotationAngle(handguard119_r1, 0.0F, 0.0F, 1.0123F);
		handguard119_r1.cubeList.add(new ModelBox(handguard119_r1, 526, 233, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard118_r2 = new ModelRenderer(this);
		handguard118_r2.setRotationPoint(-0.2F, -0.95F, -2.9F);
		bone11.addChild(handguard118_r2);
		setRotationAngle(handguard118_r2, 0.0F, 0.0F, -1.0123F);
		handguard118_r2.cubeList.add(new ModelBox(handguard118_r2, 526, 235, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard117_r1 = new ModelRenderer(this);
		handguard117_r1.setRotationPoint(-0.3F, -0.95F, -4.9F);
		bone11.addChild(handguard117_r1);
		setRotationAngle(handguard117_r1, 0.0F, 0.0F, -0.8203F);
		handguard117_r1.cubeList.add(new ModelBox(handguard117_r1, 84, 525, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		handguard117_r1.cubeList.add(new ModelBox(handguard117_r1, 88, 525, -1.0F, -1.0F, -4.0F, 1, 1, 1, 0.0F, false));
		handguard117_r1.cubeList.add(new ModelBox(handguard117_r1, 92, 525, -1.0F, -1.0F, -8.0F, 1, 1, 1, 0.0F, false));
		handguard117_r1.cubeList.add(new ModelBox(handguard117_r1, 96, 525, -1.0F, -1.0F, -2.0F, 1, 1, 1, 0.0F, false));
		handguard117_r1.cubeList.add(new ModelBox(handguard117_r1, 100, 525, -1.0F, -1.0F, -6.0F, 1, 1, 1, 0.0F, false));
		handguard117_r1.cubeList.add(new ModelBox(handguard117_r1, 104, 525, -1.0F, -1.0F, -10.0F, 1, 1, 1, 0.0F, false));
		handguard117_r1.cubeList.add(new ModelBox(handguard117_r1, 108, 525, -1.0F, -1.0F, -11.9F, 1, 1, 1, 0.0F, false));
		handguard117_r1.cubeList.add(new ModelBox(handguard117_r1, 40, 526, -1.0F, -1.0F, -13.9F, 1, 1, 1, 0.0F, false));
		handguard117_r1.cubeList.add(new ModelBox(handguard117_r1, 526, 58, -1.0F, -1.0F, -15.9F, 1, 1, 1, 0.0F, false));

		handguard112_r1 = new ModelRenderer(this);
		handguard112_r1.setRotationPoint(0.0F, 0.0F, -16.8F);
		bone11.addChild(handguard112_r1);
		setRotationAngle(handguard112_r1, 0.0F, 0.0F, -0.2967F);
		handguard112_r1.cubeList.add(new ModelBox(handguard112_r1, 112, 525, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		handguard112_r1.cubeList.add(new ModelBox(handguard112_r1, 526, 38, -1.0F, -1.0F, -2.0F, 1, 1, 1, 0.0F, false));
		handguard112_r1.cubeList.add(new ModelBox(handguard112_r1, 526, 56, -1.0F, -1.0F, -4.0F, 1, 1, 1, 0.0F, false));
		handguard112_r1.cubeList.add(new ModelBox(handguard112_r1, 116, 525, -1.0F, -1.0F, 1.9F, 1, 1, 1, 0.0F, false));
		handguard112_r1.cubeList.add(new ModelBox(handguard112_r1, 120, 525, -1.0F, -1.0F, 3.9F, 1, 1, 1, 0.0F, false));
		handguard112_r1.cubeList.add(new ModelBox(handguard112_r1, 124, 525, -1.0F, -1.0F, 5.9F, 1, 1, 1, 0.0F, false));
		handguard112_r1.cubeList.add(new ModelBox(handguard112_r1, 128, 525, -1.0F, -1.0F, 11.9F, 1, 1, 1, 0.0F, false));
		handguard112_r1.cubeList.add(new ModelBox(handguard112_r1, 132, 525, -1.0F, -1.0F, 9.9F, 1, 1, 1, 0.0F, false));
		handguard112_r1.cubeList.add(new ModelBox(handguard112_r1, 136, 525, -1.0F, -1.0F, 7.9F, 1, 1, 1, 0.0F, false));

		handguard113_r1 = new ModelRenderer(this);
		handguard113_r1.setRotationPoint(0.0F, 1.0F, -16.8F);
		bone11.addChild(handguard113_r1);
		setRotationAngle(handguard113_r1, 0.0F, 0.0F, 0.2967F);
		handguard113_r1.cubeList.add(new ModelBox(handguard113_r1, 140, 525, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		handguard113_r1.cubeList.add(new ModelBox(handguard113_r1, 36, 526, -1.0F, 0.0F, -2.0F, 1, 1, 1, 0.0F, false));
		handguard113_r1.cubeList.add(new ModelBox(handguard113_r1, 526, 54, -1.0F, 0.0F, -4.0F, 1, 1, 1, 0.0F, false));
		handguard113_r1.cubeList.add(new ModelBox(handguard113_r1, 144, 525, -1.0F, 0.0F, 1.9F, 1, 1, 1, 0.0F, false));
		handguard113_r1.cubeList.add(new ModelBox(handguard113_r1, 148, 525, -1.0F, 0.0F, 3.9F, 1, 1, 1, 0.0F, false));
		handguard113_r1.cubeList.add(new ModelBox(handguard113_r1, 152, 525, -1.0F, 0.0F, 5.9F, 1, 1, 1, 0.0F, false));
		handguard113_r1.cubeList.add(new ModelBox(handguard113_r1, 156, 525, -1.0F, 0.0F, 11.9F, 1, 1, 1, 0.0F, false));
		handguard113_r1.cubeList.add(new ModelBox(handguard113_r1, 160, 525, -1.0F, 0.0F, 9.9F, 1, 1, 1, 0.0F, false));
		handguard113_r1.cubeList.add(new ModelBox(handguard113_r1, 164, 525, -1.0F, 0.0F, 7.9F, 1, 1, 1, 0.0F, false));

		handguard108_r1 = new ModelRenderer(this);
		handguard108_r1.setRotationPoint(0.1F, 0.0F, -2.9F);
		bone11.addChild(handguard108_r1);
		setRotationAngle(handguard108_r1, 0.0F, 0.0F, -0.2967F);
		handguard108_r1.cubeList.add(new ModelBox(handguard108_r1, 526, 237, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard109_r1 = new ModelRenderer(this);
		handguard109_r1.setRotationPoint(0.1F, 1.0F, -2.9F);
		bone11.addChild(handguard109_r1);
		setRotationAngle(handguard109_r1, 0.0F, 0.0F, 0.2967F);
		handguard109_r1.cubeList.add(new ModelBox(handguard109_r1, 526, 239, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard109_r2 = new ModelRenderer(this);
		handguard109_r2.setRotationPoint(-0.4F, 1.95F, -14.9F);
		bone11.addChild(handguard109_r2);
		setRotationAngle(handguard109_r2, 0.0F, 0.0F, 0.733F);
		handguard109_r2.cubeList.add(new ModelBox(handguard109_r2, 478, 153, -1.0F, 0.0F, -5.999F, 1, 1, 20, 0.0F, false));

		handguard108_r2 = new ModelRenderer(this);
		handguard108_r2.setRotationPoint(-0.1F, 1.0F, -14.9F);
		bone11.addChild(handguard108_r2);
		setRotationAngle(handguard108_r2, 0.0F, 0.0F, 0.2967F);
		handguard108_r2.cubeList.add(new ModelBox(handguard108_r2, 486, 126, -1.0F, 0.0F, -6.0F, 1, 1, 20, 0.0F, false));

		handguard107_r1 = new ModelRenderer(this);
		handguard107_r1.setRotationPoint(-0.1F, 0.0F, -14.9F);
		bone11.addChild(handguard107_r1);
		setRotationAngle(handguard107_r1, 0.0F, 0.0F, -0.2967F);
		handguard107_r1.cubeList.add(new ModelBox(handguard107_r1, 286, 495, -1.0F, -1.0F, -6.0F, 1, 1, 20, 0.0F, false));

		handguard108_r3 = new ModelRenderer(this);
		handguard108_r3.setRotationPoint(-0.4F, -0.95F, -14.9F);
		bone11.addChild(handguard108_r3);
		setRotationAngle(handguard108_r3, 0.0F, 0.0F, -0.733F);
		handguard108_r3.cubeList.add(new ModelBox(handguard108_r3, 480, 0, -1.0F, -1.0F, -5.999F, 1, 1, 20, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(-7.902F, 12.75F, -1.0F);
		coversM110Side.addChild(bone12);
		bone12.cubeList.add(new ModelBox(bone12, 480, 21, 0.1F, 0.0F, -20.901F, 1, 1, 20, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 168, 525, -0.1F, 0.0F, -2.901F, 1, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 172, 525, 0.0F, 0.0F, -8.901F, 1, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 176, 525, 0.0F, 0.0F, -6.901F, 1, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 180, 525, 0.0F, 0.0F, -4.901F, 1, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 184, 525, 0.0F, 0.0F, -10.901F, 1, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 188, 525, 0.0F, 0.0F, -12.901F, 1, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 192, 525, 0.0F, 0.0F, -14.901F, 1, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 196, 525, 0.0F, 0.0F, -16.801F, 1, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 44, 526, 0.0F, 0.0F, -18.801F, 1, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 526, 64, 0.0F, 0.0F, -20.801F, 1, 1, 1, 0.0F, false));

		handguard119_r2 = new ModelRenderer(this);
		handguard119_r2.setRotationPoint(0.3F, 1.95F, -4.9F);
		bone12.addChild(handguard119_r2);
		setRotationAngle(handguard119_r2, 0.0F, 0.0F, -0.8203F);
		handguard119_r2.cubeList.add(new ModelBox(handguard119_r2, 200, 525, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		handguard119_r2.cubeList.add(new ModelBox(handguard119_r2, 204, 525, 0.0F, 0.0F, -4.0F, 1, 1, 1, 0.0F, false));
		handguard119_r2.cubeList.add(new ModelBox(handguard119_r2, 208, 525, 0.0F, 0.0F, -8.0F, 1, 1, 1, 0.0F, false));
		handguard119_r2.cubeList.add(new ModelBox(handguard119_r2, 212, 525, 0.0F, 0.0F, -2.0F, 1, 1, 1, 0.0F, false));
		handguard119_r2.cubeList.add(new ModelBox(handguard119_r2, 216, 525, 0.0F, 0.0F, -6.0F, 1, 1, 1, 0.0F, false));
		handguard119_r2.cubeList.add(new ModelBox(handguard119_r2, 220, 525, 0.0F, 0.0F, -10.0F, 1, 1, 1, 0.0F, false));
		handguard119_r2.cubeList.add(new ModelBox(handguard119_r2, 224, 525, 0.0F, 0.0F, -11.9F, 1, 1, 1, 0.0F, false));
		handguard119_r2.cubeList.add(new ModelBox(handguard119_r2, 526, 46, 0.0F, 0.0F, -13.9F, 1, 1, 1, 0.0F, false));
		handguard119_r2.cubeList.add(new ModelBox(handguard119_r2, 526, 68, 0.0F, 0.0F, -15.9F, 1, 1, 1, 0.0F, false));

		handguard120_r1 = new ModelRenderer(this);
		handguard120_r1.setRotationPoint(0.2F, 1.95F, -2.9F);
		bone12.addChild(handguard120_r1);
		setRotationAngle(handguard120_r1, 0.0F, 0.0F, -1.0123F);
		handguard120_r1.cubeList.add(new ModelBox(handguard120_r1, 526, 241, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard119_r3 = new ModelRenderer(this);
		handguard119_r3.setRotationPoint(0.2F, -0.95F, -2.9F);
		bone12.addChild(handguard119_r3);
		setRotationAngle(handguard119_r3, 0.0F, 0.0F, 1.0123F);
		handguard119_r3.cubeList.add(new ModelBox(handguard119_r3, 526, 243, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard118_r3 = new ModelRenderer(this);
		handguard118_r3.setRotationPoint(0.3F, -0.95F, -4.9F);
		bone12.addChild(handguard118_r3);
		setRotationAngle(handguard118_r3, 0.0F, 0.0F, 0.8203F);
		handguard118_r3.cubeList.add(new ModelBox(handguard118_r3, 228, 525, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		handguard118_r3.cubeList.add(new ModelBox(handguard118_r3, 232, 525, 0.0F, -1.0F, -4.0F, 1, 1, 1, 0.0F, false));
		handguard118_r3.cubeList.add(new ModelBox(handguard118_r3, 236, 525, 0.0F, -1.0F, -8.0F, 1, 1, 1, 0.0F, false));
		handguard118_r3.cubeList.add(new ModelBox(handguard118_r3, 240, 525, 0.0F, -1.0F, -2.0F, 1, 1, 1, 0.0F, false));
		handguard118_r3.cubeList.add(new ModelBox(handguard118_r3, 244, 525, 0.0F, -1.0F, -6.0F, 1, 1, 1, 0.0F, false));
		handguard118_r3.cubeList.add(new ModelBox(handguard118_r3, 280, 525, 0.0F, -1.0F, -10.0F, 1, 1, 1, 0.0F, false));
		handguard118_r3.cubeList.add(new ModelBox(handguard118_r3, 284, 525, 0.0F, -1.0F, -11.9F, 1, 1, 1, 0.0F, false));
		handguard118_r3.cubeList.add(new ModelBox(handguard118_r3, 526, 40, 0.0F, -1.0F, -13.9F, 1, 1, 1, 0.0F, false));
		handguard118_r3.cubeList.add(new ModelBox(handguard118_r3, 526, 60, 0.0F, -1.0F, -15.9F, 1, 1, 1, 0.0F, false));

		handguard113_r2 = new ModelRenderer(this);
		handguard113_r2.setRotationPoint(0.0F, 0.0F, -16.8F);
		bone12.addChild(handguard113_r2);
		setRotationAngle(handguard113_r2, 0.0F, 0.0F, 0.2967F);
		handguard113_r2.cubeList.add(new ModelBox(handguard113_r2, 288, 525, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		handguard113_r2.cubeList.add(new ModelBox(handguard113_r2, 526, 42, 0.0F, -1.0F, -2.0F, 1, 1, 1, 0.0F, false));
		handguard113_r2.cubeList.add(new ModelBox(handguard113_r2, 526, 62, 0.0F, -1.0F, -4.0F, 1, 1, 1, 0.0F, false));
		handguard113_r2.cubeList.add(new ModelBox(handguard113_r2, 292, 525, 0.0F, -1.0F, 1.9F, 1, 1, 1, 0.0F, false));
		handguard113_r2.cubeList.add(new ModelBox(handguard113_r2, 296, 525, 0.0F, -1.0F, 3.9F, 1, 1, 1, 0.0F, false));
		handguard113_r2.cubeList.add(new ModelBox(handguard113_r2, 300, 525, 0.0F, -1.0F, 5.9F, 1, 1, 1, 0.0F, false));
		handguard113_r2.cubeList.add(new ModelBox(handguard113_r2, 304, 525, 0.0F, -1.0F, 11.9F, 1, 1, 1, 0.0F, false));
		handguard113_r2.cubeList.add(new ModelBox(handguard113_r2, 324, 525, 0.0F, -1.0F, 9.9F, 1, 1, 1, 0.0F, false));
		handguard113_r2.cubeList.add(new ModelBox(handguard113_r2, 328, 525, 0.0F, -1.0F, 7.9F, 1, 1, 1, 0.0F, false));

		handguard114_r1 = new ModelRenderer(this);
		handguard114_r1.setRotationPoint(0.0F, 1.0F, -16.8F);
		bone12.addChild(handguard114_r1);
		setRotationAngle(handguard114_r1, 0.0F, 0.0F, -0.2967F);
		handguard114_r1.cubeList.add(new ModelBox(handguard114_r1, 332, 525, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		handguard114_r1.cubeList.add(new ModelBox(handguard114_r1, 526, 44, 0.0F, 0.0F, -2.0F, 1, 1, 1, 0.0F, false));
		handguard114_r1.cubeList.add(new ModelBox(handguard114_r1, 526, 66, 0.0F, 0.0F, -4.0F, 1, 1, 1, 0.0F, false));
		handguard114_r1.cubeList.add(new ModelBox(handguard114_r1, 336, 525, 0.0F, 0.0F, 1.9F, 1, 1, 1, 0.0F, false));
		handguard114_r1.cubeList.add(new ModelBox(handguard114_r1, 340, 525, 0.0F, 0.0F, 3.9F, 1, 1, 1, 0.0F, false));
		handguard114_r1.cubeList.add(new ModelBox(handguard114_r1, 344, 525, 0.0F, 0.0F, 5.9F, 1, 1, 1, 0.0F, false));
		handguard114_r1.cubeList.add(new ModelBox(handguard114_r1, 348, 525, 0.0F, 0.0F, 11.9F, 1, 1, 1, 0.0F, false));
		handguard114_r1.cubeList.add(new ModelBox(handguard114_r1, 392, 525, 0.0F, 0.0F, 9.9F, 1, 1, 1, 0.0F, false));
		handguard114_r1.cubeList.add(new ModelBox(handguard114_r1, 396, 525, 0.0F, 0.0F, 7.9F, 1, 1, 1, 0.0F, false));

		handguard109_r3 = new ModelRenderer(this);
		handguard109_r3.setRotationPoint(-0.1F, 0.0F, -2.9F);
		bone12.addChild(handguard109_r3);
		setRotationAngle(handguard109_r3, 0.0F, 0.0F, 0.2967F);
		handguard109_r3.cubeList.add(new ModelBox(handguard109_r3, 526, 245, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard110_r1 = new ModelRenderer(this);
		handguard110_r1.setRotationPoint(-0.1F, 1.0F, -2.9F);
		bone12.addChild(handguard110_r1);
		setRotationAngle(handguard110_r1, 0.0F, 0.0F, -0.2967F);
		handguard110_r1.cubeList.add(new ModelBox(handguard110_r1, 526, 247, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard110_r2 = new ModelRenderer(this);
		handguard110_r2.setRotationPoint(0.4F, 1.95F, -14.9F);
		bone12.addChild(handguard110_r2);
		setRotationAngle(handguard110_r2, 0.0F, 0.0F, -0.733F);
		handguard110_r2.cubeList.add(new ModelBox(handguard110_r2, 480, 42, 0.0F, 0.0F, -5.999F, 1, 1, 20, 0.0F, false));

		handguard109_r4 = new ModelRenderer(this);
		handguard109_r4.setRotationPoint(0.1F, 1.0F, -14.9F);
		bone12.addChild(handguard109_r4);
		setRotationAngle(handguard109_r4, 0.0F, 0.0F, -0.2967F);
		handguard109_r4.cubeList.add(new ModelBox(handguard109_r4, 496, 458, 0.0F, 0.0F, -6.0F, 1, 1, 20, 0.0F, false));

		handguard108_r4 = new ModelRenderer(this);
		handguard108_r4.setRotationPoint(0.1F, 0.0F, -14.9F);
		bone12.addChild(handguard108_r4);
		setRotationAngle(handguard108_r4, 0.0F, 0.0F, 0.2967F);
		handguard108_r4.cubeList.add(new ModelBox(handguard108_r4, 496, 479, 0.0F, -1.0F, -6.0F, 1, 1, 20, 0.0F, false));

		handguard109_r5 = new ModelRenderer(this);
		handguard109_r5.setRotationPoint(0.4F, -0.95F, -14.9F);
		bone12.addChild(handguard109_r5);
		setRotationAngle(handguard109_r5, 0.0F, 0.0F, 0.733F);
		handguard109_r5.cubeList.add(new ModelBox(handguard109_r5, 480, 63, 0.0F, -1.0F, -5.999F, 1, 1, 20, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		coversM110Side.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}