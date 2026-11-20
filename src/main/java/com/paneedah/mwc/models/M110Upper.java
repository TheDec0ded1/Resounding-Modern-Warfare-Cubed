package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M110Upper extends ModelBase {
	private final ModelRenderer upperM110;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;
	private final ModelRenderer cube_r34;
	private final ModelRenderer cube_r35;
	private final ModelRenderer cube_r36;
	private final ModelRenderer gun4;
	private final ModelRenderer gun170_r1;
	private final ModelRenderer gun172_r5;
	private final ModelRenderer gun172_r1_r1;
	private final ModelRenderer gun172_r6;
	private final ModelRenderer gun172_r2_r1;
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

	public M110Upper() {
		textureWidth = 544;
		textureHeight = 544;

		upperM110 = new ModelRenderer(this);
		upperM110.setRotationPoint(0.0F, 24.0F, 0.0F);
		upperM110.cubeList.add(new ModelBox(upperM110, 386, 470, -0.051F, -38.5F, -25.9988F, 1, 1, 27, 0.0F, false));
		upperM110.cubeList.add(new ModelBox(upperM110, 358, 498, -0.201F, -37.7F, -25.9988F, 1, 2, 15, 0.0F, false));
		upperM110.cubeList.add(new ModelBox(upperM110, 56, 501, -3.949F, -38.5F, -12.0F, 1, 1, 13, 0.0F, false));
		upperM110.cubeList.add(new ModelBox(upperM110, 390, 498, -3.799F, -37.5F, -26.0F, 1, 1, 15, 0.0F, false));
		upperM110.cubeList.add(new ModelBox(upperM110, 44, 515, -4.4338F, -37.6254F, -26.0F, 1, 1, 2, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-3.949F, -37.5F, -26.0F);
		upperM110.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.4014F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 476, 182, 0.0F, 0.0F, 0.0F, 1, 2, 24, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.098F, -36.7749F, -3.4988F);
		upperM110.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, 0.4014F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 474, 313, -0.5F, -1.0F, -22.5F, 1, 2, 24, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.1645F, -36.7034F, 0.2512F);
		upperM110.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, 0.3142F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 488, 174, -0.5F, -1.0F, -3.0F, 1, 2, 4, 0.0F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(-3.026F, -39.1322F, -11.25F);
		upperM110.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.7854F, 0.0F, 0.5061F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 240, 521, -0.5F, -1.2F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(-3.026F, -39.1322F, -23.75F);
		upperM110.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.7854F, 0.0F, 0.5061F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 236, 521, -0.5F, -1.2F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(-3.0269F, -39.1322F, -14.0F);
		upperM110.addChild(cube_r34);
		setRotationAngle(cube_r34, 0.0F, 0.0F, 0.5061F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 502, 339, -0.5F, -2.5F, -10.0F, 1, 2, 12, 0.0F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 266, 467, -0.5F, -2.0F, -12.0F, 1, 4, 2, 0.0F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 226, 500, -0.5F, -2.0F, 2.0F, 1, 3, 13, 0.0F, false));

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(-3.1644F, -36.7034F, 0.25F);
		upperM110.addChild(cube_r35);
		setRotationAngle(cube_r35, 0.0F, 0.0F, -0.3142F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 486, 147, -0.5F, -1.0F, -3.0F, 1, 2, 4, 0.0F, false));

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(0.0269F, -39.1322F, 0.0012F);
		upperM110.addChild(cube_r36);
		setRotationAngle(cube_r36, 0.0F, 0.0F, -0.5061F);
		cube_r36.cubeList.add(new ModelBox(cube_r36, 454, 407, -0.5F, -2.0F, -26.0F, 1, 3, 27, 0.0F, false));

		gun4 = new ModelRenderer(this);
		gun4.setRotationPoint(-3.0401F, -39.7542F, -11.6F);
		upperM110.addChild(gun4);
		setRotationAngle(gun4, 0.0F, 0.0F, -0.0524F);
		

		gun170_r1 = new ModelRenderer(this);
		gun170_r1.setRotationPoint(0.5502F, 0.2491F, 0.2879F);
		gun4.addChild(gun170_r1);
		setRotationAngle(gun170_r1, 0.0F, 0.0F, 0.3054F);
		gun170_r1.cubeList.add(new ModelBox(gun170_r1, 424, 251, -2.0603F, -1.4649F, 0.5871F, 3, 2, 1, 0.0F, false));

		gun172_r5 = new ModelRenderer(this);
		gun172_r5.setRotationPoint(-1.3F, -0.05F, 1.0F);
		gun4.addChild(gun172_r5);
		setRotationAngle(gun172_r5, 0.0F, -0.2618F, 0.0F);
		

		gun172_r1_r1 = new ModelRenderer(this);
		gun172_r1_r1.setRotationPoint(1.6028F, 0.2991F, -1.1667F);
		gun172_r5.addChild(gun172_r1_r1);
		setRotationAngle(gun172_r1_r1, 0.0779F, -0.0116F, 0.2947F);
		gun172_r1_r1.cubeList.add(new ModelBox(gun172_r1_r1, 432, 251, -1.5793F, -1.4639F, 1.0663F, 3, 2, 1, 0.0F, false));

		gun172_r6 = new ModelRenderer(this);
		gun172_r6.setRotationPoint(-1.3F, -0.05F, 0.0F);
		gun4.addChild(gun172_r6);
		setRotationAngle(gun172_r6, 0.0F, -0.9076F, 0.0F);
		

		gun172_r2_r1 = new ModelRenderer(this);
		gun172_r2_r1.setRotationPoint(1.3659F, 0.2991F, -1.2807F);
		gun172_r6.addChild(gun172_r2_r1);
		setRotationAngle(gun172_r2_r1, 0.2393F, -0.0225F, 0.1862F);
		gun172_r2_r1.cubeList.add(new ModelBox(gun172_r2_r1, 254, 514, -0.8058F, -1.4639F, -0.015F, 1, 2, 2, 0.0F, false));
		gun172_r2_r1.cubeList.add(new ModelBox(gun172_r2_r1, 80, 520, -0.3938F, -1.4639F, -0.0307F, 1, 2, 1, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-3.1F, -52.8F, -6.0F);
		upperM110.addChild(bone8);
		bone8.cubeList.add(new ModelBox(bone8, 514, 178, -1.325F, 12.9F, -6.2F, 2, 3, 1, -0.2F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-1.6F, -0.2F, 6.5F);
		bone8.addChild(bone6);
		

		gun264_r4 = new ModelRenderer(this);
		gun264_r4.setRotationPoint(-1.4F, 1.0F, -16.4F);
		bone8.addChild(gun264_r4);
		setRotationAngle(gun264_r4, 0.0F, 0.0F, -0.9295F);
		gun264_r4.cubeList.add(new ModelBox(gun264_r4, 402, 514, -11.6939F, 8.5742F, 3.4F, 1, 1, 2, -0.2F, false));
		gun264_r4.cubeList.add(new ModelBox(gun264_r4, 406, 354, -11.6939F, 8.5742F, -4.2F, 1, 1, 16, -0.3F, false));

		gun3 = new ModelRenderer(this);
		gun3.setRotationPoint(-0.6F, 3.6F, -14.0F);
		bone8.addChild(gun3);
		setRotationAngle(gun3, 0.0F, 0.0F, 0.1578F);
		gun3.cubeList.add(new ModelBox(gun3, 0, 500, 1.1552F, 11.3395F, -4.6F, 1, 3, 13, -0.3F, false));
		gun3.cubeList.add(new ModelBox(gun3, 256, 467, 1.3052F, 11.6395F, -3.55F, 1, 2, 4, -0.1F, false));
		gun3.cubeList.add(new ModelBox(gun3, 496, 147, 1.3052F, 11.6395F, 3.35F, 1, 2, 4, -0.1F, false));
		gun3.cubeList.add(new ModelBox(gun3, 430, 520, 1.2542F, 12.6395F, 1.499F, 1, 1, 1, 0.2F, false));

		upper = new ModelRenderer(this);
		upper.setRotationPoint(0.0F, -15.0F, 0.0F);
		upperM110.addChild(upper);
		upper.cubeList.add(new ModelBox(upper, 416, 514, -2.0F, -27.6F, -0.4F, 1, 1, 2, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 420, 182, -2.5F, -27.1F, -26.0F, 2, 1, 26, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 456, 354, -1.4F, -26.2F, -26.0F, 1, 1, 27, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 330, 470, -2.6F, -26.2F, -26.0F, 1, 1, 27, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 392, 520, -2.0F, -25.05F, -26.699F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 520, 399, -0.7F, -23.75F, -26.697F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 520, 401, -3.3F, -23.75F, -26.697F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 520, 403, -2.0F, -22.45F, -26.699F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 516, 393, -2.5F, -21.6F, -25.999F, 2, 1, 1, 0.0F, false));

		receiver14_r7 = new ModelRenderer(this);
		receiver14_r7.setRotationPoint(-3.2F, -37.5F, -23.7F);
		upper.addChild(receiver14_r7);
		setRotationAngle(receiver14_r7, 0.0F, 0.0F, -0.4014F);
		receiver14_r7.cubeList.add(new ModelBox(receiver14_r7, 520, 405, -5.855F, 13.5385F, -2.997F, 1, 1, 1, 0.0F, false));

		receiver13_r3 = new ModelRenderer(this);
		receiver13_r3.setRotationPoint(0.2F, -37.5F, -23.7F);
		upper.addChild(receiver13_r3);
		setRotationAngle(receiver13_r3, 0.0F, 0.0F, 0.4014F);
		receiver13_r3.cubeList.add(new ModelBox(receiver13_r3, 520, 407, 4.855F, 13.5385F, -2.997F, 1, 1, 1, 0.0F, false));

		receiver15_r9 = new ModelRenderer(this);
		receiver15_r9.setRotationPoint(-1.9F, -36.2F, -23.7F);
		upper.addChild(receiver15_r9);
		setRotationAngle(receiver15_r9, 0.0F, 0.0F, 0.4014F);
		receiver15_r9.cubeList.add(new ModelBox(receiver15_r9, 520, 409, 4.6709F, 12.6167F, -2.999F, 1, 1, 1, 0.0F, false));

		receiver14_r12 = new ModelRenderer(this);
		receiver14_r12.setRotationPoint(-1.1F, -36.2F, -23.7F);
		upper.addChild(receiver14_r12);
		setRotationAngle(receiver14_r12, 0.0F, 0.0F, -0.4014F);
		receiver14_r12.cubeList.add(new ModelBox(receiver14_r12, 520, 411, -5.6709F, 12.6167F, -2.999F, 1, 1, 1, 0.0F, false));

		receiver14_r13 = new ModelRenderer(this);
		receiver14_r13.setRotationPoint(-1.9F, -38.8F, -23.7F);
		upper.addChild(receiver14_r13);
		setRotationAngle(receiver14_r13, 0.0F, 0.0F, -0.4014F);
		receiver14_r13.cubeList.add(new ModelBox(receiver14_r13, 520, 166, -6.4643F, 12.618F, -2.996F, 1, 1, 1, 0.0F, false));

		receiver13_r6 = new ModelRenderer(this);
		receiver13_r6.setRotationPoint(-1.1F, -38.8F, -23.7F);
		upper.addChild(receiver13_r6);
		setRotationAngle(receiver13_r6, 0.0F, 0.0F, 0.4014F);
		receiver13_r6.cubeList.add(new ModelBox(receiver13_r6, 520, 417, 5.4643F, 12.618F, -2.996F, 1, 1, 1, 0.0F, false));

		receiver13_r8 = new ModelRenderer(this);
		receiver13_r8.setRotationPoint(-3.2F, -37.5F, -23.7F);
		upper.addChild(receiver13_r8);
		setRotationAngle(receiver13_r8, 0.0F, 0.0F, 0.4014F);
		receiver13_r8.cubeList.add(new ModelBox(receiver13_r8, 422, 520, 5.2802F, 11.6962F, -2.997F, 1, 1, 1, 0.0F, false));

		receiver12_r4 = new ModelRenderer(this);
		receiver12_r4.setRotationPoint(0.2F, -37.5F, -23.7F);
		upper.addChild(receiver12_r4);
		setRotationAngle(receiver12_r4, 0.0F, 0.0F, -0.4014F);
		receiver12_r4.cubeList.add(new ModelBox(receiver12_r4, 426, 520, -6.2802F, 11.6962F, -2.997F, 1, 1, 1, 0.0F, false));

		gun125_r2 = new ModelRenderer(this);
		gun125_r2.setRotationPoint(-2.5F, -40.1F, -1.0F);
		upper.addChild(gun125_r2);
		setRotationAngle(gun125_r2, -0.632F, 0.0F, 0.0F);
		gun125_r2.cubeList.add(new ModelBox(gun125_r2, 396, 254, -0.001F, 9.979F, 8.5458F, 2, 1, 1, 0.0F, false));

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
		bone5.cubeList.add(new ModelBox(bone5, 406, 371, -0.9737F, 13.5368F, -7.9132F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 300, 409, -0.9737F, 13.5368F, -9.1132F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 306, 409, -0.9737F, 13.5368F, -6.6632F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 516, 395, -0.9737F, 13.5368F, -10.2632F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 516, 397, -0.9737F, 13.5368F, -11.5132F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 412, 371, -0.9737F, 13.5368F, -5.4132F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 418, 371, -0.9737F, 13.5368F, -4.1632F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 424, 371, -0.9737F, 13.5368F, -2.9132F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 378, 254, -0.9737F, 13.5368F, -1.6632F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 430, 371, -0.9737F, 13.5368F, 0.8368F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 288, 442, -0.9737F, 13.5368F, -0.4132F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 294, 442, -0.9737F, 13.5368F, 3.3368F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 488, 180, -0.9737F, 13.5368F, 2.0868F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 494, 180, -0.9737F, 13.5368F, 5.8368F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 500, 180, -0.9737F, 13.5368F, 4.5868F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 506, 180, -0.9737F, 13.5368F, 8.3368F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 514, 418, -0.9737F, 13.5368F, 9.5368F, 2, 1, 1, -0.198F, false));
		bone5.cubeList.add(new ModelBox(bone5, 314, 516, -0.9737F, 13.5368F, 11.9868F, 2, 1, 1, -0.198F, false));
		bone5.cubeList.add(new ModelBox(bone5, 320, 516, -0.9737F, 13.5368F, 10.7868F, 2, 1, 1, -0.198F, false));
		bone5.cubeList.add(new ModelBox(bone5, 416, 251, -0.9737F, 13.5368F, 13.1368F, 2, 1, 2, -0.198F, false));
		bone5.cubeList.add(new ModelBox(bone5, 516, 391, -0.9737F, 13.5368F, 7.0868F, 2, 1, 1, -0.199F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-14.7737F, -0.3632F, -12.4632F);
		bone5.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, 0.8901F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 442, 470, 19.5181F, -2.0564F, 1.0F, 1, 1, 26, -0.35F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 520, 170, 19.5681F, -2.2064F, 19.55F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 520, 172, 19.5681F, -2.2064F, 22.0F, 1, 1, 1, -0.197F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 520, 168, 19.5681F, -2.2064F, 24.45F, 1, 1, 1, -0.197F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 520, 174, 19.5681F, -2.2064F, 23.25F, 1, 1, 1, -0.197F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 484, 514, 19.5681F, -2.2064F, 25.6F, 1, 1, 2, -0.197F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 520, 176, 19.5681F, -2.2064F, 20.8F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 520, 178, 19.5681F, -2.2064F, 17.05F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 520, 180, 19.5681F, -2.2064F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 248, 520, 19.5681F, -2.2064F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 252, 520, 19.5681F, -2.2064F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 256, 520, 19.5681F, -2.2064F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 260, 520, 19.5681F, -2.2064F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 520, 158, 19.5681F, -2.2064F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 264, 520, 19.5681F, -2.2064F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 268, 520, 19.5681F, -2.2064F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 272, 520, 19.5681F, -2.2064F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 276, 520, 19.5681F, -2.2064F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 314, 520, 19.5681F, -2.2064F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 318, 520, 19.5681F, -2.2064F, 3.35F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 322, 520, 19.5681F, -2.2064F, 0.95F, 1, 1, 1, -0.198F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 520, 353, 19.5681F, -2.2064F, 2.2F, 1, 1, 1, -0.198F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-13.1737F, -0.3632F, -12.4632F);
		bone5.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, -0.8901F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 232, 473, -2.8971F, 19.7036F, 0.8F, 1, 1, 26, -0.35F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 440, 520, -2.9471F, 19.5536F, 19.55F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 444, 520, -2.9471F, 19.5536F, 22.0F, 1, 1, 1, -0.197F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 448, 520, -2.9471F, 19.5536F, 24.45F, 1, 1, 1, -0.197F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 452, 520, -2.9471F, 19.5536F, 23.25F, 1, 1, 1, -0.197F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 490, 514, -2.9471F, 19.5536F, 25.6F, 1, 1, 2, -0.197F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 456, 520, -2.9471F, 19.5536F, 20.8F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 460, 520, -2.9471F, 19.5536F, 17.05F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 464, 520, -2.9471F, 19.5536F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 468, 520, -2.9471F, 19.5536F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 472, 520, -2.9471F, 19.5536F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 476, 520, -2.9471F, 19.5536F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 520, 500, -2.9471F, 19.5536F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 520, 160, -2.9471F, 19.5536F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 520, 502, -2.9471F, 19.5536F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 512, 520, -2.9471F, 19.5536F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 516, 520, -2.9471F, 19.5536F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 520, 520, -2.9471F, 19.5536F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 521, -2.9471F, 19.5536F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 4, 521, -2.9471F, 19.5536F, 3.35F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 204, 521, -2.9471F, 19.5536F, 0.95F, 1, 1, 1, -0.198F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 208, 521, -2.9471F, 19.5536F, 2.2F, 1, 1, 1, -0.198F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		upperM110.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}