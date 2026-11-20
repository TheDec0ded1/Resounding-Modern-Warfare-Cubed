package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QHoneyBadgerUpper extends ModelBase {
	private final ModelRenderer upper;
	private final ModelRenderer receiver_r1;
	private final ModelRenderer receiver14_r12;
	private final ModelRenderer receiver14_r13;
	private final ModelRenderer receiver13_r7;
	private final ModelRenderer receiver15_r10;
	private final ModelRenderer receiver14_r18;
	private final ModelRenderer receiver14_r19;
	private final ModelRenderer receiver13_r10;
	private final ModelRenderer receiver13_r11;
	private final ModelRenderer receiver13_r7_r1;
	private final ModelRenderer receiver13_r8_r1;
	private final ModelRenderer receiver13_r5_r1;
	private final ModelRenderer receiver13_r12;
	private final ModelRenderer receiver12_r6;
	private final ModelRenderer receiver11_r2;
	private final ModelRenderer receiver22_r2_r1;
	private final ModelRenderer receiver11_r1_r1;
	private final ModelRenderer receiver16_r2;
	private final ModelRenderer receiver17_r3;
	private final ModelRenderer gun125_r2;
	private final ModelRenderer gun3;
	private final ModelRenderer bone20;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer sideDetails;
	private final ModelRenderer gun140_r2;
	private final ModelRenderer gun143_r2;
	private final ModelRenderer gun264_r4;
	private final ModelRenderer gun263_r4;
	private final ModelRenderer gun264_r3;
	private final ModelRenderer gun263_r3;
	private final ModelRenderer gun2;
	private final ModelRenderer gun170_r1;
	private final ModelRenderer gun172_r3;
	private final ModelRenderer gun172_r1_r1;
	private final ModelRenderer gun172_r4;
	private final ModelRenderer gun172_r2_r1;
	private final ModelRenderer receiver13_r2;
	private final ModelRenderer receiver14_r4;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer receiver14_r5;
	private final ModelRenderer receiver15_r6;

	public QHoneyBadgerUpper() {
		textureWidth = 400;
		textureHeight = 400;

		upper = new ModelRenderer(this);
		upper.setRotationPoint(0.0F, 24.0F, 0.0F);
		upper.cubeList.add(new ModelBox(upper, 380, 195, -2.0F, -41.4F, -0.4F, 1, 1, 2, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 368, 62, -2.501F, -41.201F, -22.7F, 2, 1, 2, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 278, 118, -2.5F, -41.2F, -22.0F, 2, 1, 22, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 328, 19, -2.5F, -41.725F, -2.2F, 2, 1, 3, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 196, 380, -1.401F, -40.301F, -22.701F, 1, 1, 2, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 376, 62, -2.601F, -40.301F, -22.702F, 2, 1, 2, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 90, 311, -0.6F, -39.85F, -18.5F, 1, 2, 2, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 370, 239, -0.6F, -39.325F, -22.5F, 1, 1, 4, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 262, 271, -1.4F, -40.3F, -22.0F, 1, 1, 23, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 0, 274, -2.6F, -40.3F, -22.0F, 1, 1, 23, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 374, 383, -2.0F, -39.8F, -23.699F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 378, 383, -0.7F, -38.5F, -23.697F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 384, 62, -3.3F, -38.5F, -23.697F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 380, 198, -3.616F, -38.5777F, -22.702F, 1, 1, 2, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 384, 150, -2.0F, -37.2F, -23.699F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 380, 201, -2.5F, -37.001F, -22.701F, 2, 2, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 368, 103, -0.502F, -37.1F, -22.701F, 1, 2, 10, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 368, 344, -0.192F, -37.9718F, -22.7F, 1, 1, 9, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 214, 380, -0.192F, -38.9718F, -22.7F, 1, 1, 2, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 8, 372, -0.317F, -37.9218F, -13.775F, 1, 2, 3, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 368, 115, -3.298F, -37.1F, -22.701F, 1, 2, 10, 0.0F, false));

		receiver_r1 = new ModelRenderer(this);
		receiver_r1.setRotationPoint(0.1016F, -38.941F, -22.2F);
		upper.addChild(receiver_r1);
		setRotationAngle(receiver_r1, 0.0F, 0.0F, -0.829F);
		receiver_r1.cubeList.add(new ModelBox(receiver_r1, 84, 325, -0.5F, -1.5F, -0.5F, 1, 2, 2, 0.0F, false));

		receiver14_r12 = new ModelRenderer(this);
		receiver14_r12.setRotationPoint(-3.6F, -37.5F, -11.7F);
		upper.addChild(receiver14_r12);
		setRotationAngle(receiver14_r12, 0.0F, 0.0F, -0.4014F);
		receiver14_r12.cubeList.add(new ModelBox(receiver14_r12, 182, 319, -0.4F, -0.2F, -8.999F, 1, 2, 11, -0.4F, false));

		receiver14_r13 = new ModelRenderer(this);
		receiver14_r13.setRotationPoint(-3.2F, -37.5F, -23.7F);
		upper.addChild(receiver14_r13);
		setRotationAngle(receiver14_r13, 0.0F, 0.0F, -0.4014F);
		receiver14_r13.cubeList.add(new ModelBox(receiver14_r13, 384, 152, -0.092F, -0.0391F, 0.003F, 1, 1, 1, 0.0F, false));

		receiver13_r7 = new ModelRenderer(this);
		receiver13_r7.setRotationPoint(0.2F, -37.5F, -23.7F);
		upper.addChild(receiver13_r7);
		setRotationAngle(receiver13_r7, 0.0F, 0.0F, 0.4014F);
		receiver13_r7.cubeList.add(new ModelBox(receiver13_r7, 384, 154, -0.908F, -0.0391F, 0.003F, 1, 1, 1, 0.0F, false));

		receiver15_r10 = new ModelRenderer(this);
		receiver15_r10.setRotationPoint(-1.9F, -36.2F, -23.7F);
		upper.addChild(receiver15_r10);
		setRotationAngle(receiver15_r10, 0.0F, 0.0F, 0.4014F);
		receiver15_r10.cubeList.add(new ModelBox(receiver15_r10, 384, 156, -1.092F, -0.9609F, 0.001F, 1, 1, 1, 0.0F, false));

		receiver14_r18 = new ModelRenderer(this);
		receiver14_r18.setRotationPoint(-1.1F, -36.2F, -23.7F);
		upper.addChild(receiver14_r18);
		setRotationAngle(receiver14_r18, 0.0F, 0.0F, -0.4014F);
		receiver14_r18.cubeList.add(new ModelBox(receiver14_r18, 384, 158, 0.0921F, -0.9609F, 0.001F, 1, 1, 1, 0.0F, false));

		receiver14_r19 = new ModelRenderer(this);
		receiver14_r19.setRotationPoint(-1.9F, -38.8F, -23.7F);
		upper.addChild(receiver14_r19);
		setRotationAngle(receiver14_r19, 0.0F, 0.0F, -0.4014F);
		receiver14_r19.cubeList.add(new ModelBox(receiver14_r19, 384, 160, -0.7013F, -0.9596F, 0.004F, 1, 1, 1, 0.0F, false));

		receiver13_r10 = new ModelRenderer(this);
		receiver13_r10.setRotationPoint(-1.1F, -38.8F, -23.7F);
		upper.addChild(receiver13_r10);
		setRotationAngle(receiver13_r10, 0.0F, 0.0F, 0.4014F);
		receiver13_r10.cubeList.add(new ModelBox(receiver13_r10, 384, 162, -0.2987F, -0.9596F, 0.004F, 1, 1, 1, 0.0F, false));

		receiver13_r11 = new ModelRenderer(this);
		receiver13_r11.setRotationPoint(-3.6F, -37.5F, -11.7F);
		upper.addChild(receiver13_r11);
		setRotationAngle(receiver13_r11, 0.0F, 0.0F, 0.4014F);
		

		receiver13_r7_r1 = new ModelRenderer(this);
		receiver13_r7_r1.setRotationPoint(-0.8974F, 2.1964F, 9.0F);
		receiver13_r11.addChild(receiver13_r7_r1);
		setRotationAngle(receiver13_r7_r1, 0.0F, 0.0F, 0.1309F);
		receiver13_r7_r1.cubeList.add(new ModelBox(receiver13_r7_r1, 96, 275, 3.6692F, -4.0768F, -20.0F, 1, 1, 7, 0.0F, false));

		receiver13_r8_r1 = new ModelRenderer(this);
		receiver13_r8_r1.setRotationPoint(0.2579F, -1.3592F, 8.998F);
		receiver13_r11.addChild(receiver13_r8_r1);
		setRotationAngle(receiver13_r8_r1, 0.0F, 0.0F, 0.1309F);
		receiver13_r8_r1.cubeList.add(new ModelBox(receiver13_r8_r1, 28, 385, -0.6391F, -0.5392F, -18.3F, 1, 1, 1, 0.0F, false));
		receiver13_r8_r1.cubeList.add(new ModelBox(receiver13_r8_r1, 84, 321, -0.6391F, -1.5392F, -20.0F, 1, 2, 2, 0.0F, false));
		receiver13_r8_r1.cubeList.add(new ModelBox(receiver13_r8_r1, 188, 369, -0.6391F, -1.5392F, -18.0F, 1, 1, 10, 0.0F, false));

		receiver13_r5_r1 = new ModelRenderer(this);
		receiver13_r5_r1.setRotationPoint(0.4093F, -1.4205F, 7.0F);
		receiver13_r11.addChild(receiver13_r5_r1);
		setRotationAngle(receiver13_r5_r1, 0.0F, 0.0F, 0.1309F);
		receiver13_r5_r1.cubeList.add(new ModelBox(receiver13_r5_r1, 354, 185, -0.639F, -1.5392F, -6.0F, 1, 3, 12, 0.0F, false));

		receiver13_r12 = new ModelRenderer(this);
		receiver13_r12.setRotationPoint(-3.2F, -37.5F, -23.7F);
		upper.addChild(receiver13_r12);
		setRotationAngle(receiver13_r12, 0.0F, 0.0F, 0.4014F);
		receiver13_r12.cubeList.add(new ModelBox(receiver13_r12, 384, 164, -0.4828F, -1.8814F, 0.003F, 1, 1, 1, 0.0F, false));

		receiver12_r6 = new ModelRenderer(this);
		receiver12_r6.setRotationPoint(0.2F, -37.5F, -23.7F);
		upper.addChild(receiver12_r6);
		setRotationAngle(receiver12_r6, 0.0F, 0.0F, -0.4014F);
		receiver12_r6.cubeList.add(new ModelBox(receiver12_r6, 384, 166, -0.5172F, -1.8814F, 0.003F, 1, 1, 1, 0.0F, false));

		receiver11_r2 = new ModelRenderer(this);
		receiver11_r2.setRotationPoint(0.6F, -37.5F, -22.7F);
		upper.addChild(receiver11_r2);
		setRotationAngle(receiver11_r2, 0.0F, 0.0F, -0.4014F);
		

		receiver22_r2_r1 = new ModelRenderer(this);
		receiver22_r2_r1.setRotationPoint(4.771F, 1.5911F, 11.998F);
		receiver11_r2.addChild(receiver22_r2_r1);
		setRotationAngle(receiver22_r2_r1, 0.0F, 0.0F, -0.1309F);
		receiver22_r2_r1.cubeList.add(new ModelBox(receiver22_r2_r1, 120, 376, -8.1157F, -4.4069F, -12.3F, 1, 1, 3, 0.0F, false));

		receiver11_r1_r1 = new ModelRenderer(this);
		receiver11_r1_r1.setRotationPoint(-0.4093F, -1.4205F, 12.0F);
		receiver11_r2.addChild(receiver11_r1_r1);
		setRotationAngle(receiver11_r1_r1, 0.0F, 0.0F, -0.1309F);
		receiver11_r1_r1.cubeList.add(new ModelBox(receiver11_r1_r1, 112, 247, -0.3609F, -1.8392F, -12.0F, 1, 3, 24, 0.0F, false));

		receiver16_r2 = new ModelRenderer(this);
		receiver16_r2.setRotationPoint(0.4F, -38.85F, -19.0F);
		upper.addChild(receiver16_r2);
		setRotationAngle(receiver16_r2, 0.0F, 0.0F, 1.9705F);
		receiver16_r2.cubeList.add(new ModelBox(receiver16_r2, 202, 380, -0.9212F, 0.3892F, 0.5F, 1, 1, 2, 0.0F, false));
		receiver16_r2.cubeList.add(new ModelBox(receiver16_r2, 370, 234, -0.4376F, 0.1849F, -3.5F, 1, 1, 4, 0.0F, false));

		receiver17_r3 = new ModelRenderer(this);
		receiver17_r3.setRotationPoint(0.4F, -38.85F, -16.5F);
		upper.addChild(receiver17_r3);
		setRotationAngle(receiver17_r3, 0.0F, 1.9333F, 0.0F);
		receiver17_r3.cubeList.add(new ModelBox(receiver17_r3, 160, 383, 0.0F, -1.0F, -1.0F, 1, 2, 1, 0.0F, false));

		gun125_r2 = new ModelRenderer(this);
		gun125_r2.setRotationPoint(-2.5F, -40.1F, -1.0F);
		upper.addChild(gun125_r2);
		setRotationAngle(gun125_r2, -0.632F, 0.0F, 0.0F);
		gun125_r2.cubeList.add(new ModelBox(gun125_r2, 376, 272, -0.001F, -1.3976F, 0.2161F, 2, 1, 2, 0.0F, false));

		gun3 = new ModelRenderer(this);
		gun3.setRotationPoint(-3.7F, -34.2F, -20.0F);
		upper.addChild(gun3);
		setRotationAngle(gun3, 0.0F, 0.0F, 0.1578F);
		gun3.cubeList.add(new ModelBox(gun3, 144, 357, -1.1234F, -2.9804F, -0.3F, 1, 3, 10, -0.3F, false));
		gun3.cubeList.add(new ModelBox(gun3, 128, 389, -1.1234F, -1.2804F, 4.05F, 1, 1, 1, -0.1F, false));
		gun3.cubeList.add(new ModelBox(gun3, 384, 168, -1.1244F, -1.6804F, 4.049F, 1, 1, 1, -0.1F, false));

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(-1.5237F, -41.3381F, -13.7868F);
		upper.addChild(bone20);
		bone20.cubeList.add(new ModelBox(bone20, 380, 290, -0.9737F, -0.5632F, -7.9132F, 2, 1, 1, -0.199F, false));
		bone20.cubeList.add(new ModelBox(bone20, 380, 308, -0.9737F, -0.5632F, -9.1132F, 2, 1, 1, -0.199F, false));
		bone20.cubeList.add(new ModelBox(bone20, 310, 380, -0.9737F, -0.5632F, -6.6632F, 2, 1, 1, -0.199F, false));
		bone20.cubeList.add(new ModelBox(bone20, 380, 310, -0.9737F, -0.5632F, -5.4132F, 2, 1, 1, -0.199F, false));
		bone20.cubeList.add(new ModelBox(bone20, 380, 312, -0.9737F, -0.5632F, -4.1632F, 2, 1, 1, -0.199F, false));
		bone20.cubeList.add(new ModelBox(bone20, 380, 314, -0.9737F, -0.5632F, -2.9132F, 2, 1, 1, -0.199F, false));
		bone20.cubeList.add(new ModelBox(bone20, 316, 380, -0.9737F, -0.5632F, -1.6632F, 2, 1, 1, -0.199F, false));
		bone20.cubeList.add(new ModelBox(bone20, 380, 316, -0.9737F, -0.5632F, 0.8368F, 2, 1, 1, -0.199F, false));
		bone20.cubeList.add(new ModelBox(bone20, 380, 318, -0.9737F, -0.5632F, -0.4132F, 2, 1, 1, -0.199F, false));
		bone20.cubeList.add(new ModelBox(bone20, 380, 320, -0.9737F, -0.5632F, 3.3368F, 2, 1, 1, -0.199F, false));
		bone20.cubeList.add(new ModelBox(bone20, 322, 380, -0.9737F, -0.5632F, 2.0868F, 2, 1, 1, -0.199F, false));
		bone20.cubeList.add(new ModelBox(bone20, 380, 322, -0.9737F, -0.5632F, 5.8368F, 2, 1, 1, -0.199F, false));
		bone20.cubeList.add(new ModelBox(bone20, 380, 324, -0.9737F, -0.5632F, 4.5868F, 2, 1, 1, -0.199F, false));
		bone20.cubeList.add(new ModelBox(bone20, 380, 326, -0.9737F, -0.5632F, 8.3368F, 2, 1, 1, -0.199F, false));
		bone20.cubeList.add(new ModelBox(bone20, 328, 380, -0.9737F, -0.5632F, 9.5368F, 2, 1, 1, -0.198F, false));
		bone20.cubeList.add(new ModelBox(bone20, 380, 328, -0.9737F, -0.5632F, 10.7868F, 2, 1, 1, -0.198F, false));
		bone20.cubeList.add(new ModelBox(bone20, 380, 330, -0.9737F, -0.5632F, 7.0868F, 2, 1, 1, -0.199F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-14.7737F, -0.3632F, -12.4632F);
		bone20.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, 0.8901F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 96, 298, 8.5605F, -10.93F, 3.3F, 1, 1, 21, -0.35F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 384, 170, 8.6105F, -11.08F, 19.55F, 1, 1, 1, -0.198F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 384, 172, 8.6105F, -11.08F, 22.0F, 1, 1, 1, -0.197F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 384, 174, 8.6105F, -11.08F, 23.25F, 1, 1, 1, -0.197F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 384, 176, 8.6105F, -11.08F, 20.8F, 1, 1, 1, -0.198F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 384, 178, 8.6105F, -11.08F, 17.05F, 1, 1, 1, -0.198F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 384, 180, 8.6105F, -11.08F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 384, 182, 8.6105F, -11.08F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 184, 384, 8.6105F, -11.08F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 188, 384, 8.6105F, -11.08F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 192, 384, 8.6105F, -11.08F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 384, 263, 8.6105F, -11.08F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 384, 265, 8.6105F, -11.08F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 384, 267, 8.6105F, -11.08F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 384, 269, 8.6105F, -11.08F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 384, 271, 8.6105F, -11.08F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 384, 273, 8.6105F, -11.08F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 280, 384, 8.6105F, -11.08F, 3.35F, 1, 1, 1, -0.198F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-13.1737F, -0.3632F, -12.4632F);
		bone20.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, -0.8901F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 280, 74, 8.0605F, 10.83F, 3.8F, 1, 1, 20, -0.35F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 284, 384, 8.0105F, 10.68F, 19.55F, 1, 1, 1, -0.198F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 288, 384, 8.0105F, 10.68F, 22.0F, 1, 1, 1, -0.197F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 308, 384, 8.0105F, 10.68F, 23.25F, 1, 1, 1, -0.197F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 312, 384, 8.0105F, 10.68F, 20.8F, 1, 1, 1, -0.198F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 316, 384, 8.0105F, 10.68F, 17.05F, 1, 1, 1, -0.198F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 320, 384, 8.0105F, 10.68F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 324, 384, 8.0105F, 10.68F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 328, 384, 8.0105F, 10.68F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 332, 384, 8.0105F, 10.68F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 336, 384, 8.0105F, 10.68F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 340, 384, 8.0105F, 10.68F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 344, 384, 8.0105F, 10.68F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 348, 384, 8.0105F, 10.68F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 352, 384, 8.0105F, 10.68F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 356, 384, 8.0105F, 10.68F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 360, 384, 8.0105F, 10.68F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 364, 384, 8.0105F, 10.68F, 3.35F, 1, 1, 1, -0.198F, false));

		sideDetails = new ModelRenderer(this);
		sideDetails.setRotationPoint(-3.1F, -37.8F, -6.0F);
		upper.addChild(sideDetails);
		sideDetails.cubeList.add(new ModelBox(sideDetails, 382, 384, -0.516F, -0.7777F, -15.002F, 1, 1, 1, 0.0F, false));
		sideDetails.cubeList.add(new ModelBox(sideDetails, 0, 385, -1.325F, 0.4F, -15.0F, 1, 1, 1, 0.0F, false));
		sideDetails.cubeList.add(new ModelBox(sideDetails, 380, 204, -1.325F, -0.375F, -4.9F, 2, 2, 1, -0.2F, false));

		gun140_r2 = new ModelRenderer(this);
		gun140_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		sideDetails.addChild(gun140_r2);
		setRotationAngle(gun140_r2, 0.0F, -0.2603F, 0.0F);
		

		gun143_r2 = new ModelRenderer(this);
		gun143_r2.setRotationPoint(-1.6F, -0.2F, 6.5F);
		sideDetails.addChild(gun143_r2);
		setRotationAngle(gun143_r2, 0.0F, -0.2603F, 0.0F);
		

		gun264_r4 = new ModelRenderer(this);
		gun264_r4.setRotationPoint(-1.4F, 1.0F, -16.4F);
		sideDetails.addChild(gun264_r4);
		setRotationAngle(gun264_r4, 0.0F, 0.0F, -0.9295F);
		gun264_r4.cubeList.add(new ModelBox(gun264_r4, 380, 207, -0.0748F, -0.1002F, 5.95F, 1, 1, 2, -0.2F, false));
		gun264_r4.cubeList.add(new ModelBox(gun264_r4, 94, 358, -0.0748F, -0.1002F, 1.1F, 1, 1, 11, -0.3F, false));

		gun263_r4 = new ModelRenderer(this);
		gun263_r4.setRotationPoint(-0.7F, 0.3F, -15.0F);
		sideDetails.addChild(gun263_r4);
		setRotationAngle(gun263_r4, 0.0F, 0.0F, 0.4014F);
		

		gun264_r3 = new ModelRenderer(this);
		gun264_r3.setRotationPoint(-0.22F, -0.82F, -15.0F);
		sideDetails.addChild(gun264_r3);
		setRotationAngle(gun264_r3, 0.0F, 0.0F, 0.8203F);
		

		gun263_r3 = new ModelRenderer(this);
		gun263_r3.setRotationPoint(-1.2F, 0.4F, -15.0F);
		sideDetails.addChild(gun263_r3);
		setRotationAngle(gun263_r3, 0.0F, 0.0F, -0.3491F);
		gun263_r3.cubeList.add(new ModelBox(gun263_r3, 132, 389, -0.1174F, -0.0428F, -0.001F, 1, 1, 1, 0.0F, false));

		gun2 = new ModelRenderer(this);
		gun2.setRotationPoint(-0.4F, -1.45F, -4.3F);
		sideDetails.addChild(gun2);
		setRotationAngle(gun2, 0.0F, 0.0F, -0.0524F);
		

		gun170_r1 = new ModelRenderer(this);
		gun170_r1.setRotationPoint(0.6923F, -0.0359F, 0.8168F);
		gun2.addChild(gun170_r1);
		setRotationAngle(gun170_r1, 0.0F, 0.0F, 0.48F);
		gun170_r1.cubeList.add(new ModelBox(gun170_r1, 352, 72, -1.2438F, -0.5839F, -0.2418F, 3, 1, 1, 0.0F, false));

		gun172_r3 = new ModelRenderer(this);
		gun172_r3.setRotationPoint(-1.3F, -0.05F, 1.0F);
		gun2.addChild(gun172_r3);
		setRotationAngle(gun172_r3, 0.0F, -0.2618F, 0.0F);
		

		gun172_r1_r1 = new ModelRenderer(this);
		gun172_r1_r1.setRotationPoint(1.877F, 0.0141F, -0.6926F);
		gun172_r3.addChild(gun172_r1_r1);
		setRotationAngle(gun172_r1_r1, 0.1198F, -0.0283F, 0.4625F);
		gun172_r1_r1.cubeList.add(new ModelBox(gun172_r1_r1, 376, 154, -1.0052F, -0.5829F, 0.0543F, 3, 1, 1, 0.0F, false));

		gun172_r4 = new ModelRenderer(this);
		gun172_r4.setRotationPoint(-1.3F, -0.05F, 0.0F);
		gun2.addChild(gun172_r4);
		setRotationAngle(gun172_r4, 0.0F, -0.9076F, 0.0F);
		

		gun172_r2_r1 = new ModelRenderer(this);
		gun172_r2_r1.setRotationPoint(1.8702F, 0.0141F, -1.0672F);
		gun172_r4.addChild(gun172_r2_r1);
		setRotationAngle(gun172_r2_r1, 0.373F, -0.0548F, 0.2887F);
		gun172_r2_r1.cubeList.add(new ModelBox(gun172_r2_r1, 208, 380, -0.9563F, -0.5829F, -1.1687F, 1, 1, 2, 0.0F, false));

		receiver13_r2 = new ModelRenderer(this);
		receiver13_r2.setRotationPoint(-0.5F, 0.3F, -5.7F);
		sideDetails.addChild(receiver13_r2);
		setRotationAngle(receiver13_r2, 0.0F, 0.0F, 0.4014F);
		

		receiver14_r4 = new ModelRenderer(this);
		receiver14_r4.setRotationPoint(0.8F, -1.0F, -5.7F);
		sideDetails.addChild(receiver14_r4);
		setRotationAngle(receiver14_r4, 0.0F, 0.0F, -0.4014F);
		

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-1.5F, -37.875F, 0.125F);
		upper.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 354, 354, -3.0F, -0.375F, -10.875F, 1, 1, 12, -0.25F, false));
		bone.cubeList.add(new ModelBox(bone, 328, 354, 2.0F, -0.375F, -10.875F, 1, 1, 12, -0.25F, false));
		bone.cubeList.add(new ModelBox(bone, 8, 385, 0.6125F, -2.7782F, 0.125F, 1, 1, 1, -0.25F, false));
		bone.cubeList.add(new ModelBox(bone, 12, 385, -1.6125F, -2.7782F, 0.125F, 1, 1, 1, -0.25F, false));
		bone.cubeList.add(new ModelBox(bone, 4, 385, 2.0F, -0.375F, -11.375F, 1, 1, 1, -0.25F, false));
		bone.cubeList.add(new ModelBox(bone, 112, 376, 2.0F, -0.375F, -16.375F, 1, 1, 3, -0.25F, false));
		bone.cubeList.add(new ModelBox(bone, 24, 385, 1.98F, -0.3859F, -13.9213F, 1, 1, 1, -0.33F, false));
		bone.cubeList.add(new ModelBox(bone, 58, 213, 1.101F, -0.476F, -14.775F, 2, 1, 4, -0.35F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(2.5F, 0.125F, -13.375F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.7854F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 385, -0.6F, -0.225F, -0.55F, 1, 1, 1, -0.25F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(2.071F, 0.8647F, -16.5087F);
		bone.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, -0.4363F, -1.2654F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 380, 280, -1.2F, -0.5F, 0.0F, 2, 1, 1, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-3.9002F, -0.149F, -9.425F);
		bone.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -1.2654F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 144, 383, -0.4998F, 5.5F, -6.7F, 2, 1, 1, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 136, 380, -0.5F, 5.5F, -6.2F, 2, 1, 2, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 128, 380, -0.5F, 5.5F, -1.7F, 2, 1, 2, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-2.1228F, 0.7015F, -9.625F);
		bone.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 1.2654F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 378, 305, -0.5F, -0.5F, -1.2F, 2, 1, 2, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(2.4085F, -0.2165F, 0.625F);
		bone.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.5236F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 16, 385, -0.5F, -2.775F, -0.5F, 1, 1, 1, -0.25F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 80, 347, -0.5F, -2.5F, -0.5F, 1, 3, 1, -0.25F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(2.0977F, -0.2103F, 0.2829F);
		bone.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.6109F, -0.5236F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 80, 351, -0.5F, -2.5F, -0.5F, 1, 3, 1, -0.125F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-2.0977F, -0.2103F, 0.2829F);
		bone.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, -0.6109F, 0.5236F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 64, 367, -0.5F, -2.5F, -0.5F, 1, 3, 1, -0.125F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-2.4085F, -0.2165F, 0.625F);
		bone.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, 0.5236F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 136, 389, -0.5F, -2.775F, -0.5F, 1, 1, 1, -0.25F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 364, 334, -0.5F, -2.5F, -0.5F, 1, 3, 1, -0.25F, false));

		receiver14_r5 = new ModelRenderer(this);
		receiver14_r5.setRotationPoint(2.3F, 0.375F, -1.125F);
		bone.addChild(receiver14_r5);
		setRotationAngle(receiver14_r5, 0.0F, 0.0F, 0.2618F);
		receiver14_r5.cubeList.add(new ModelBox(receiver14_r5, 368, 26, -2.0F, 0.0F, -7.9988F, 2, 2, 10, 0.0F, false));

		receiver15_r6 = new ModelRenderer(this);
		receiver15_r6.setRotationPoint(-2.3F, 0.375F, -1.125F);
		bone.addChild(receiver15_r6);
		setRotationAngle(receiver15_r6, 0.0F, 0.0F, -0.2618F);
		receiver15_r6.cubeList.add(new ModelBox(receiver15_r6, 368, 38, 0.002F, 0.0F, -8.0F, 2, 2, 10, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		upper.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}