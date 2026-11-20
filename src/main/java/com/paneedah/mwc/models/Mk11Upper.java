package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Mk11Upper extends ModelBase {
	private final ModelRenderer upperSR25;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer gun4;
	private final ModelRenderer gun172_r5;
	private final ModelRenderer gun172_r6;
	private final ModelRenderer bone8;
	private final ModelRenderer bone6;
	private final ModelRenderer gun264_r4;
	private final ModelRenderer gun3;
	private final ModelRenderer upper;
	private final ModelRenderer receiver14_r7;
	private final ModelRenderer receiver13_r3;
	private final ModelRenderer receiver15_r9;
	private final ModelRenderer receiver14_r12;
	private final ModelRenderer receiver14_r13;
	private final ModelRenderer receiver13_r6;
	private final ModelRenderer receiver13_r8;
	private final ModelRenderer receiver12_r4;
	private final ModelRenderer gun125_r2;
	private final ModelRenderer gun2;
	private final ModelRenderer gun172_r3;
	private final ModelRenderer gun172_r4;
	private final ModelRenderer bone5;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;

	public Mk11Upper() {
		textureWidth = 544;
		textureHeight = 544;

		upperSR25 = new ModelRenderer(this);
		upperSR25.setRotationPoint(0.0F, 24.0F, 0.0F);
		upperSR25.cubeList.add(new ModelBox(upperSR25, 488, 203, -0.051F, -38.5F, -25.9988F, 1, 1, 27, 0.0F, false));
		upperSR25.cubeList.add(new ModelBox(upperSR25, 496, 180, -0.201F, -37.7F, -25.9988F, 1, 2, 15, 0.0F, false));
		upperSR25.cubeList.add(new ModelBox(upperSR25, 508, 131, -3.949F, -38.5F, -12.0F, 1, 1, 13, 0.0F, false));
		upperSR25.cubeList.add(new ModelBox(upperSR25, 202, 496, -3.799F, -37.5F, -26.0F, 1, 1, 15, 0.0F, false));
		upperSR25.cubeList.add(new ModelBox(upperSR25, 374, 509, -4.4338F, -37.6254F, -26.0F, 1, 1, 2, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-3.949F, -37.5F, -26.0F);
		upperSR25.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.4014F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 488, 338, 0.0F, 0.0F, 0.0F, 1, 2, 24, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.098F, -36.7749F, -3.4988F);
		upperSR25.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.4014F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 488, 312, -0.5F, -1.0F, -22.5F, 1, 2, 24, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.1645F, -36.7034F, 0.2512F);
		upperSR25.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 0.3142F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 374, 119, -0.5F, -1.0F, -3.0F, 1, 2, 4, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-3.026F, -39.1322F, -11.25F);
		upperSR25.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.7854F, 0.0F, 0.5061F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 324, 516, -0.5F, -1.2F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-3.026F, -39.1322F, -23.75F);
		upperSR25.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.7854F, 0.0F, 0.5061F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 320, 516, -0.5F, -1.2F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-3.0269F, -39.1322F, -14.0F);
		upperSR25.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, 0.5061F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 510, 67, -0.5F, -2.5F, -10.0F, 1, 2, 12, 0.0F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 156, 409, -0.5F, -2.0F, -12.0F, 1, 4, 2, 0.0F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 318, 496, -0.5F, -2.0F, 2.0F, 1, 3, 13, 0.0F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-3.1644F, -36.7034F, 0.25F);
		upperSR25.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.0F, -0.3142F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 364, 119, -0.5F, -1.0F, -3.0F, 1, 2, 4, 0.0F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(0.0269F, -39.1322F, 0.0012F);
		upperSR25.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, -0.5061F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 484, 371, -0.5F, -2.0F, -26.0F, 1, 3, 27, 0.0F, false));

		gun4 = new ModelRenderer(this);
		gun4.setRotationPoint(-3.0401F, -39.7542F, -11.6F);
		upperSR25.addChild(gun4);
		setRotationAngle(gun4, 0.0F, 0.0F, -0.0524F);
		

		gun172_r5 = new ModelRenderer(this);
		gun172_r5.setRotationPoint(-1.3F, -0.05F, 1.0F);
		gun4.addChild(gun172_r5);
		setRotationAngle(gun172_r5, 0.0F, -0.2618F, 0.0F);
		

		gun172_r6 = new ModelRenderer(this);
		gun172_r6.setRotationPoint(-1.3F, -0.05F, 0.0F);
		gun4.addChild(gun172_r6);
		setRotationAngle(gun172_r6, 0.0F, -0.9076F, 0.0F);
		

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-3.1F, -52.8F, -6.0F);
		upperSR25.addChild(bone8);
		bone8.cubeList.add(new ModelBox(bone8, 508, 453, -1.325F, 13.9F, -6.2F, 2, 2, 1, -0.2F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-1.6F, -0.2F, 6.5F);
		bone8.addChild(bone6);
		

		gun264_r4 = new ModelRenderer(this);
		gun264_r4.setRotationPoint(-1.4F, 1.0F, -16.4F);
		bone8.addChild(gun264_r4);
		setRotationAngle(gun264_r4, 0.0F, 0.0F, -0.9295F);
		gun264_r4.cubeList.add(new ModelBox(gun264_r4, 508, 145, -11.6939F, 8.5742F, 3.4F, 1, 1, 2, -0.2F, false));
		gun264_r4.cubeList.add(new ModelBox(gun264_r4, 484, 401, -11.6939F, 8.5742F, -4.2F, 1, 1, 16, -0.3F, false));

		gun3 = new ModelRenderer(this);
		gun3.setRotationPoint(-0.6F, 3.6F, -14.0F);
		bone8.addChild(gun3);
		setRotationAngle(gun3, 0.0F, 0.0F, 0.1578F);
		gun3.cubeList.add(new ModelBox(gun3, 290, 496, 1.1552F, 11.3395F, -4.6F, 1, 3, 13, -0.3F, false));
		gun3.cubeList.add(new ModelBox(gun3, 354, 119, 1.3052F, 11.6395F, -3.55F, 1, 2, 4, -0.1F, false));
		gun3.cubeList.add(new ModelBox(gun3, 428, 207, 1.3052F, 11.6395F, 3.35F, 1, 2, 4, -0.1F, false));
		gun3.cubeList.add(new ModelBox(gun3, 104, 516, 1.2542F, 12.6395F, 1.499F, 1, 1, 1, 0.2F, false));

		upper = new ModelRenderer(this);
		upper.setRotationPoint(0.0F, -15.0F, 0.0F);
		upperSR25.addChild(upper);
		upper.cubeList.add(new ModelBox(upper, 380, 508, -2.0F, -27.6F, -0.4F, 1, 1, 2, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 488, 231, -2.5F, -27.1F, -26.0F, 2, 1, 26, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 466, 486, -1.4F, -26.2F, -26.0F, 1, 1, 27, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 58, 488, -2.6F, -26.2F, -26.0F, 1, 1, 27, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 386, 504, -2.0F, -25.05F, -26.699F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 386, 506, -0.7F, -23.75F, -26.697F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 386, 508, -3.3F, -23.75F, -26.697F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 370, 510, -2.0F, -22.45F, -26.699F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 386, 39, -2.5F, -21.6F, -25.999F, 2, 1, 1, 0.0F, false));

		receiver14_r7 = new ModelRenderer(this);
		receiver14_r7.setRotationPoint(-3.2F, -37.5F, -23.7F);
		upper.addChild(receiver14_r7);
		setRotationAngle(receiver14_r7, 0.0F, 0.0F, -0.4014F);
		receiver14_r7.cubeList.add(new ModelBox(receiver14_r7, 386, 510, -5.855F, 13.5385F, -2.997F, 1, 1, 1, 0.0F, false));

		receiver13_r3 = new ModelRenderer(this);
		receiver13_r3.setRotationPoint(0.2F, -37.5F, -23.7F);
		upper.addChild(receiver13_r3);
		setRotationAngle(receiver13_r3, 0.0F, 0.0F, 0.4014F);
		receiver13_r3.cubeList.add(new ModelBox(receiver13_r3, 376, 512, 4.855F, 13.5385F, -2.997F, 1, 1, 1, 0.0F, false));

		receiver15_r9 = new ModelRenderer(this);
		receiver15_r9.setRotationPoint(-1.9F, -36.2F, -23.7F);
		upper.addChild(receiver15_r9);
		setRotationAngle(receiver15_r9, 0.0F, 0.0F, 0.4014F);
		receiver15_r9.cubeList.add(new ModelBox(receiver15_r9, 386, 512, 4.6709F, 12.6167F, -2.999F, 1, 1, 1, 0.0F, false));

		receiver14_r12 = new ModelRenderer(this);
		receiver14_r12.setRotationPoint(-1.1F, -36.2F, -23.7F);
		upper.addChild(receiver14_r12);
		setRotationAngle(receiver14_r12, 0.0F, 0.0F, -0.4014F);
		receiver14_r12.cubeList.add(new ModelBox(receiver14_r12, 386, 514, -5.6709F, 12.6167F, -2.999F, 1, 1, 1, 0.0F, false));

		receiver14_r13 = new ModelRenderer(this);
		receiver14_r13.setRotationPoint(-1.9F, -38.8F, -23.7F);
		upper.addChild(receiver14_r13);
		setRotationAngle(receiver14_r13, 0.0F, 0.0F, -0.4014F);
		receiver14_r13.cubeList.add(new ModelBox(receiver14_r13, 242, 370, -6.4643F, 12.618F, -2.996F, 1, 1, 1, 0.0F, false));

		receiver13_r6 = new ModelRenderer(this);
		receiver13_r6.setRotationPoint(-1.1F, -38.8F, -23.7F);
		upper.addChild(receiver13_r6);
		setRotationAngle(receiver13_r6, 0.0F, 0.0F, 0.4014F);
		receiver13_r6.cubeList.add(new ModelBox(receiver13_r6, 292, 515, 5.4643F, 12.618F, -2.996F, 1, 1, 1, 0.0F, false));

		receiver13_r8 = new ModelRenderer(this);
		receiver13_r8.setRotationPoint(-3.2F, -37.5F, -23.7F);
		upper.addChild(receiver13_r8);
		setRotationAngle(receiver13_r8, 0.0F, 0.0F, 0.4014F);
		receiver13_r8.cubeList.add(new ModelBox(receiver13_r8, 516, 101, 5.2802F, 11.6962F, -2.997F, 1, 1, 1, 0.0F, false));

		receiver12_r4 = new ModelRenderer(this);
		receiver12_r4.setRotationPoint(0.2F, -37.5F, -23.7F);
		upper.addChild(receiver12_r4);
		setRotationAngle(receiver12_r4, 0.0F, 0.0F, -0.4014F);
		receiver12_r4.cubeList.add(new ModelBox(receiver12_r4, 516, 103, -6.2802F, 11.6962F, -2.997F, 1, 1, 1, 0.0F, false));

		gun125_r2 = new ModelRenderer(this);
		gun125_r2.setRotationPoint(-2.5F, -40.1F, -1.0F);
		upper.addChild(gun125_r2);
		setRotationAngle(gun125_r2, -0.632F, 0.0F, 0.0F);
		gun125_r2.cubeList.add(new ModelBox(gun125_r2, 286, 41, -0.001F, 9.979F, 8.5458F, 2, 1, 1, 0.0F, false));

		gun2 = new ModelRenderer(this);
		gun2.setRotationPoint(-3.5F, -39.25F, -10.3F);
		upper.addChild(gun2);
		setRotationAngle(gun2, 0.0F, 0.0F, -0.0524F);
		

		gun172_r3 = new ModelRenderer(this);
		gun172_r3.setRotationPoint(-1.3F, -0.05F, 1.0F);
		gun2.addChild(gun172_r3);
		setRotationAngle(gun172_r3, 0.0F, -0.2618F, 0.0F);
		

		gun172_r4 = new ModelRenderer(this);
		gun172_r4.setRotationPoint(-1.3F, -0.05F, 0.0F);
		gun2.addChild(gun172_r4);
		setRotationAngle(gun172_r4, 0.0F, -0.9076F, 0.0F);
		

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-1.5237F, -41.3381F, -14.6868F);
		upper.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 290, 131, -0.9737F, 13.5368F, -7.9132F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 292, 41, -0.9737F, 13.5368F, -9.1132F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 298, 41, -0.9737F, 13.5368F, -6.6632F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 390, 123, -0.9737F, 13.5368F, -10.2632F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 392, 39, -0.9737F, 13.5368F, -11.5132F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 304, 41, -0.9737F, 13.5368F, -5.4132F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 310, 41, -0.9737F, 13.5368F, -4.1632F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 316, 41, -0.9737F, 13.5368F, -2.9132F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 260, 49, -0.9737F, 13.5368F, -1.6632F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 322, 41, -0.9737F, 13.5368F, 0.8368F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 328, 41, -0.9737F, 13.5368F, -0.4132F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 334, 41, -0.9737F, 13.5368F, 3.3368F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 336, 131, -0.9737F, 13.5368F, 2.0868F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 340, 41, -0.9737F, 13.5368F, 5.8368F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 342, 131, -0.9737F, 13.5368F, 4.5868F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 346, 41, -0.9737F, 13.5368F, 8.3368F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 368, 39, -0.9737F, 13.5368F, 9.5368F, 2, 1, 1, -0.198F, false));
		bone5.cubeList.add(new ModelBox(bone5, 374, 39, -0.9737F, 13.5368F, 11.9868F, 2, 1, 1, -0.198F, false));
		bone5.cubeList.add(new ModelBox(bone5, 380, 39, -0.9737F, 13.5368F, 10.7868F, 2, 1, 1, -0.198F, false));
		bone5.cubeList.add(new ModelBox(bone5, 500, 447, -0.9737F, 13.5368F, 13.1368F, 2, 1, 2, -0.198F, false));
		bone5.cubeList.add(new ModelBox(bone5, 384, 123, -0.9737F, 13.5368F, 7.0868F, 2, 1, 1, -0.199F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-14.7737F, -0.3632F, -12.4632F);
		bone5.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, 0.8901F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 488, 258, 19.5181F, -2.0564F, 1.0F, 1, 1, 26, -0.35F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 242, 372, 19.5681F, -2.2064F, 19.55F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 78, 373, 19.5681F, -2.2064F, 22.0F, 1, 1, 1, -0.197F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 78, 371, 19.5681F, -2.2064F, 24.45F, 1, 1, 1, -0.197F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 242, 374, 19.5681F, -2.2064F, 23.25F, 1, 1, 1, -0.197F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 508, 447, 19.5681F, -2.2064F, 25.6F, 1, 1, 2, -0.197F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 78, 375, 19.5681F, -2.2064F, 20.8F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 242, 376, 19.5681F, -2.2064F, 17.05F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 78, 377, 19.5681F, -2.2064F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 242, 378, 19.5681F, -2.2064F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 78, 379, 19.5681F, -2.2064F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 426, 119, 19.5681F, -2.2064F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 426, 121, 19.5681F, -2.2064F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 242, 368, 19.5681F, -2.2064F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 426, 123, 19.5681F, -2.2064F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 428, 39, 19.5681F, -2.2064F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 152, 477, 19.5681F, -2.2064F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 74, 478, 19.5681F, -2.2064F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 152, 479, 19.5681F, -2.2064F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 74, 480, 19.5681F, -2.2064F, 3.35F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 152, 481, 19.5681F, -2.2064F, 0.95F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 74, 482, 19.5681F, -2.2064F, 2.2F, 1, 1, 1, -0.198F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-13.1737F, -0.3632F, -12.4632F);
		bone5.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, -0.8901F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 488, 285, -2.8971F, 19.7036F, 0.8F, 1, 1, 26, -0.35F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 516, 105, -2.9471F, 19.5536F, 19.55F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 516, 107, -2.9471F, 19.5536F, 22.0F, 1, 1, 1, -0.197F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 108, 516, -2.9471F, 19.5536F, 24.45F, 1, 1, 1, -0.197F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 516, 109, -2.9471F, 19.5536F, 23.25F, 1, 1, 1, -0.197F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 508, 450, -2.9471F, 19.5536F, 25.6F, 1, 1, 2, -0.197F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 516, 111, -2.9471F, 19.5536F, 20.8F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 516, 113, -2.9471F, 19.5536F, 17.05F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 516, 115, -2.9471F, 19.5536F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 232, 516, -2.9471F, 19.5536F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 236, 516, -2.9471F, 19.5536F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 240, 516, -2.9471F, 19.5536F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 244, 516, -2.9471F, 19.5536F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 78, 369, -2.9471F, 19.5536F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 248, 516, -2.9471F, 19.5536F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 252, 516, -2.9471F, 19.5536F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 256, 516, -2.9471F, 19.5536F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 260, 516, -2.9471F, 19.5536F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 264, 516, -2.9471F, 19.5536F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 268, 516, -2.9471F, 19.5536F, 3.35F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 312, 516, -2.9471F, 19.5536F, 0.95F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 316, 516, -2.9471F, 19.5536F, 2.2F, 1, 1, 1, -0.198F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		upperSR25.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}