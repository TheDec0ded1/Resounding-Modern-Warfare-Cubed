package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QHoneyBadgerUpperSlick extends ModelBase {
	private final ModelRenderer upperSlick;
	private final ModelRenderer receiver_r1;
	private final ModelRenderer receiver14_r6;
	private final ModelRenderer receiver14_r7;
	private final ModelRenderer receiver13_r3;
	private final ModelRenderer receiver15_r7;
	private final ModelRenderer receiver14_r8;
	private final ModelRenderer receiver14_r9;
	private final ModelRenderer receiver13_r4;
	private final ModelRenderer receiver13_r5;
	private final ModelRenderer receiver13_r8_r1;
	private final ModelRenderer receiver13_r9_r1;
	private final ModelRenderer receiver13_r6_r1;
	private final ModelRenderer receiver13_r6;
	private final ModelRenderer receiver12_r2;
	private final ModelRenderer receiver11_r3;
	private final ModelRenderer receiver33_r3_r1;
	private final ModelRenderer receiver22_r2_r1;
	private final ModelRenderer receiver16_r6;
	private final ModelRenderer receiver17_r2;
	private final ModelRenderer gun125_r3;
	private final ModelRenderer gun4;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer sideDetails2;
	private final ModelRenderer gun5;
	private final ModelRenderer gun171_r1;
	private final ModelRenderer gun172_r2;
	private final ModelRenderer gun272_r2_r1;
	private final ModelRenderer gun172_r5;
	private final ModelRenderer gun173_r3_r1;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer receiver14_r11;
	private final ModelRenderer receiver15_r9;

	public QHoneyBadgerUpperSlick() {
		textureWidth = 400;
		textureHeight = 400;

		upperSlick = new ModelRenderer(this);
		upperSlick.setRotationPoint(0.0F, 24.0F, 0.0F);
		upperSlick.cubeList.add(new ModelBox(upperSlick, 380, 231, -2.0F, -41.4F, -0.4F, 1, 1, 2, 0.0F, false));
		upperSlick.cubeList.add(new ModelBox(upperSlick, 96, 380, -2.501F, -41.201F, -22.7F, 2, 1, 2, 0.0F, false));
		upperSlick.cubeList.add(new ModelBox(upperSlick, 278, 141, -2.5F, -41.2F, -22.0F, 2, 1, 22, 0.0F, false));
		upperSlick.cubeList.add(new ModelBox(upperSlick, 338, 19, -2.5F, -41.725F, -2.2F, 2, 1, 3, 0.0F, false));
		upperSlick.cubeList.add(new ModelBox(upperSlick, 232, 380, -1.401F, -40.301F, -22.701F, 1, 1, 2, 0.0F, false));
		upperSlick.cubeList.add(new ModelBox(upperSlick, 104, 380, -2.601F, -40.301F, -22.702F, 2, 1, 2, 0.0F, false));
		upperSlick.cubeList.add(new ModelBox(upperSlick, 284, 339, -0.6F, -39.85F, -18.5F, 1, 2, 2, 0.0F, false));
		upperSlick.cubeList.add(new ModelBox(upperSlick, 370, 244, -0.6F, -39.325F, -22.5F, 1, 1, 4, 0.0F, false));
		upperSlick.cubeList.add(new ModelBox(upperSlick, 112, 274, -1.4F, -40.3F, -22.0F, 1, 1, 23, 0.0F, false));
		upperSlick.cubeList.add(new ModelBox(upperSlick, 48, 275, -2.6F, -40.3F, -22.0F, 1, 1, 23, 0.0F, false));
		upperSlick.cubeList.add(new ModelBox(upperSlick, 172, 386, -2.0F, -39.8F, -23.699F, 1, 1, 1, 0.0F, false));
		upperSlick.cubeList.add(new ModelBox(upperSlick, 184, 386, -0.7F, -38.5F, -23.697F, 1, 1, 1, 0.0F, false));
		upperSlick.cubeList.add(new ModelBox(upperSlick, 188, 386, -3.3F, -38.5F, -23.697F, 1, 1, 1, 0.0F, false));
		upperSlick.cubeList.add(new ModelBox(upperSlick, 380, 234, -3.616F, -38.5777F, -22.702F, 1, 1, 2, 0.0F, false));
		upperSlick.cubeList.add(new ModelBox(upperSlick, 386, 189, -2.0F, -37.2F, -23.699F, 1, 1, 1, 0.0F, false));
		upperSlick.cubeList.add(new ModelBox(upperSlick, 380, 237, -2.5F, -37.001F, -22.701F, 2, 2, 1, 0.0F, false));
		upperSlick.cubeList.add(new ModelBox(upperSlick, 166, 369, -0.502F, -37.1F, -22.701F, 1, 2, 10, 0.0F, false));
		upperSlick.cubeList.add(new ModelBox(upperSlick, 294, 369, -0.192F, -37.9718F, -22.7F, 1, 1, 9, 0.0F, false));
		upperSlick.cubeList.add(new ModelBox(upperSlick, 238, 380, -0.192F, -38.9718F, -22.7F, 1, 1, 2, 0.0F, false));
		upperSlick.cubeList.add(new ModelBox(upperSlick, 374, 367, -0.317F, -37.9218F, -13.775F, 1, 2, 3, 0.0F, false));
		upperSlick.cubeList.add(new ModelBox(upperSlick, 354, 215, -3.298F, -37.1F, -22.701F, 1, 2, 12, 0.0F, false));

		receiver_r1 = new ModelRenderer(this);
		receiver_r1.setRotationPoint(0.1016F, -38.941F, -22.2F);
		upperSlick.addChild(receiver_r1);
		setRotationAngle(receiver_r1, 0.0F, 0.0F, -0.829F);
		receiver_r1.cubeList.add(new ModelBox(receiver_r1, 284, 343, -0.5F, -1.5F, -0.5F, 1, 2, 2, 0.0F, false));

		receiver14_r6 = new ModelRenderer(this);
		receiver14_r6.setRotationPoint(-3.6F, -37.5F, -11.7F);
		upperSlick.addChild(receiver14_r6);
		setRotationAngle(receiver14_r6, 0.0F, 0.0F, -0.4014F);
		

		receiver14_r7 = new ModelRenderer(this);
		receiver14_r7.setRotationPoint(-3.2F, -37.5F, -23.7F);
		upperSlick.addChild(receiver14_r7);
		setRotationAngle(receiver14_r7, 0.0F, 0.0F, -0.4014F);
		receiver14_r7.cubeList.add(new ModelBox(receiver14_r7, 386, 191, -0.092F, -0.0391F, 0.003F, 1, 1, 1, 0.0F, false));

		receiver13_r3 = new ModelRenderer(this);
		receiver13_r3.setRotationPoint(0.2F, -37.5F, -23.7F);
		upperSlick.addChild(receiver13_r3);
		setRotationAngle(receiver13_r3, 0.0F, 0.0F, 0.4014F);
		receiver13_r3.cubeList.add(new ModelBox(receiver13_r3, 192, 386, -0.908F, -0.0391F, 0.003F, 1, 1, 1, 0.0F, false));

		receiver15_r7 = new ModelRenderer(this);
		receiver15_r7.setRotationPoint(-1.9F, -36.2F, -23.7F);
		upperSlick.addChild(receiver15_r7);
		setRotationAngle(receiver15_r7, 0.0F, 0.0F, 0.4014F);
		receiver15_r7.cubeList.add(new ModelBox(receiver15_r7, 386, 193, -1.092F, -0.9609F, 0.001F, 1, 1, 1, 0.0F, false));

		receiver14_r8 = new ModelRenderer(this);
		receiver14_r8.setRotationPoint(-1.1F, -36.2F, -23.7F);
		upperSlick.addChild(receiver14_r8);
		setRotationAngle(receiver14_r8, 0.0F, 0.0F, -0.4014F);
		receiver14_r8.cubeList.add(new ModelBox(receiver14_r8, 386, 195, 0.0921F, -0.9609F, 0.001F, 1, 1, 1, 0.0F, false));

		receiver14_r9 = new ModelRenderer(this);
		receiver14_r9.setRotationPoint(-1.9F, -38.8F, -23.7F);
		upperSlick.addChild(receiver14_r9);
		setRotationAngle(receiver14_r9, 0.0F, 0.0F, -0.4014F);
		receiver14_r9.cubeList.add(new ModelBox(receiver14_r9, 386, 197, -0.7013F, -0.9596F, 0.004F, 1, 1, 1, 0.0F, false));

		receiver13_r4 = new ModelRenderer(this);
		receiver13_r4.setRotationPoint(-1.1F, -38.8F, -23.7F);
		upperSlick.addChild(receiver13_r4);
		setRotationAngle(receiver13_r4, 0.0F, 0.0F, 0.4014F);
		receiver13_r4.cubeList.add(new ModelBox(receiver13_r4, 386, 199, -0.2987F, -0.9596F, 0.004F, 1, 1, 1, 0.0F, false));

		receiver13_r5 = new ModelRenderer(this);
		receiver13_r5.setRotationPoint(-3.6F, -37.5F, -11.7F);
		upperSlick.addChild(receiver13_r5);
		setRotationAngle(receiver13_r5, 0.0F, 0.0F, 0.4014F);
		

		receiver13_r8_r1 = new ModelRenderer(this);
		receiver13_r8_r1.setRotationPoint(-0.8974F, 2.1964F, 9.0F);
		receiver13_r5.addChild(receiver13_r8_r1);
		setRotationAngle(receiver13_r8_r1, 0.0F, 0.0F, 0.1309F);
		receiver13_r8_r1.cubeList.add(new ModelBox(receiver13_r8_r1, 96, 283, 3.6692F, -4.0768F, -20.0F, 1, 1, 7, 0.0F, false));

		receiver13_r9_r1 = new ModelRenderer(this);
		receiver13_r9_r1.setRotationPoint(0.2579F, -1.3592F, 8.998F);
		receiver13_r5.addChild(receiver13_r9_r1);
		setRotationAngle(receiver13_r9_r1, 0.0F, 0.0F, 0.1309F);
		receiver13_r9_r1.cubeList.add(new ModelBox(receiver13_r9_r1, 386, 201, -0.6391F, -0.5392F, -18.3F, 1, 1, 1, 0.0F, false));
		receiver13_r9_r1.cubeList.add(new ModelBox(receiver13_r9_r1, 284, 347, -0.6391F, -1.5392F, -20.0F, 1, 2, 2, 0.0F, false));
		receiver13_r9_r1.cubeList.add(new ModelBox(receiver13_r9_r1, 210, 369, -0.6391F, -1.5392F, -18.0F, 1, 1, 10, 0.0F, false));

		receiver13_r6_r1 = new ModelRenderer(this);
		receiver13_r6_r1.setRotationPoint(0.4093F, -1.4205F, 7.0F);
		receiver13_r5.addChild(receiver13_r6_r1);
		setRotationAngle(receiver13_r6_r1, 0.0F, 0.0F, 0.1309F);
		receiver13_r6_r1.cubeList.add(new ModelBox(receiver13_r6_r1, 354, 200, -0.639F, -1.5392F, -6.0F, 1, 3, 12, 0.0F, false));

		receiver13_r6 = new ModelRenderer(this);
		receiver13_r6.setRotationPoint(-3.2F, -37.5F, -23.7F);
		upperSlick.addChild(receiver13_r6);
		setRotationAngle(receiver13_r6, 0.0F, 0.0F, 0.4014F);
		receiver13_r6.cubeList.add(new ModelBox(receiver13_r6, 386, 203, -0.4828F, -1.8814F, 0.003F, 1, 1, 1, 0.0F, false));

		receiver12_r2 = new ModelRenderer(this);
		receiver12_r2.setRotationPoint(0.2F, -37.5F, -23.7F);
		upperSlick.addChild(receiver12_r2);
		setRotationAngle(receiver12_r2, 0.0F, 0.0F, -0.4014F);
		receiver12_r2.cubeList.add(new ModelBox(receiver12_r2, 386, 205, -0.5172F, -1.8814F, 0.003F, 1, 1, 1, 0.0F, false));

		receiver11_r3 = new ModelRenderer(this);
		receiver11_r3.setRotationPoint(0.6F, -37.5F, -22.7F);
		upperSlick.addChild(receiver11_r3);
		setRotationAngle(receiver11_r3, 0.0F, 0.0F, -0.4014F);
		

		receiver33_r3_r1 = new ModelRenderer(this);
		receiver33_r3_r1.setRotationPoint(4.771F, 1.5911F, 11.998F);
		receiver11_r3.addChild(receiver33_r3_r1);
		setRotationAngle(receiver33_r3_r1, 0.0F, 0.0F, -0.1309F);
		receiver33_r3_r1.cubeList.add(new ModelBox(receiver33_r3_r1, 24, 377, -8.1157F, -4.4069F, -12.3F, 1, 1, 3, 0.0F, false));

		receiver22_r2_r1 = new ModelRenderer(this);
		receiver22_r2_r1.setRotationPoint(-0.4093F, -1.4205F, 12.0F);
		receiver11_r3.addChild(receiver22_r2_r1);
		setRotationAngle(receiver22_r2_r1, 0.0F, 0.0F, -0.1309F);
		receiver22_r2_r1.cubeList.add(new ModelBox(receiver22_r2_r1, 260, 179, -0.3609F, -1.8392F, -12.0F, 1, 3, 24, 0.0F, false));

		receiver16_r6 = new ModelRenderer(this);
		receiver16_r6.setRotationPoint(0.4F, -38.85F, -19.0F);
		upperSlick.addChild(receiver16_r6);
		setRotationAngle(receiver16_r6, 0.0F, 0.0F, 1.9705F);
		receiver16_r6.cubeList.add(new ModelBox(receiver16_r6, 380, 240, -0.9212F, 0.3892F, 0.5F, 1, 1, 2, 0.0F, false));
		receiver16_r6.cubeList.add(new ModelBox(receiver16_r6, 52, 371, -0.4376F, 0.1849F, -3.5F, 1, 1, 4, 0.0F, false));

		receiver17_r2 = new ModelRenderer(this);
		receiver17_r2.setRotationPoint(0.4F, -38.85F, -16.5F);
		upperSlick.addChild(receiver17_r2);
		setRotationAngle(receiver17_r2, 0.0F, 1.9333F, 0.0F);
		receiver17_r2.cubeList.add(new ModelBox(receiver17_r2, 168, 383, 0.0F, -1.0F, -1.0F, 1, 2, 1, 0.0F, false));

		gun125_r3 = new ModelRenderer(this);
		gun125_r3.setRotationPoint(-2.5F, -40.1F, -1.0F);
		upperSlick.addChild(gun125_r3);
		setRotationAngle(gun125_r3, -0.632F, 0.0F, 0.0F);
		gun125_r3.cubeList.add(new ModelBox(gun125_r3, 112, 380, -0.001F, -1.3976F, 0.2161F, 2, 1, 2, 0.0F, false));

		gun4 = new ModelRenderer(this);
		gun4.setRotationPoint(-3.7F, -34.2F, -20.0F);
		upperSlick.addChild(gun4);
		setRotationAngle(gun4, 0.0F, 0.0F, 0.1578F);
		

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-1.5237F, -41.3381F, -13.7868F);
		upperSlick.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 24, 381, -0.9737F, -0.5632F, -7.9132F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 30, 381, -0.9737F, -0.5632F, -9.1132F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 36, 381, -0.9737F, -0.5632F, -6.6632F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 42, 381, -0.9737F, -0.5632F, -5.4132F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 48, 381, -0.9737F, -0.5632F, -4.1632F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 54, 381, -0.9737F, -0.5632F, -2.9132F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 60, 381, -0.9737F, -0.5632F, -1.6632F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 66, 381, -0.9737F, -0.5632F, 0.8368F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 72, 381, -0.9737F, -0.5632F, -0.4132F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 78, 381, -0.9737F, -0.5632F, 3.3368F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 166, 381, -0.9737F, -0.5632F, 2.0868F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 172, 381, -0.9737F, -0.5632F, 5.8368F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 178, 381, -0.9737F, -0.5632F, 4.5868F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 370, 381, -0.9737F, -0.5632F, 8.3368F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 376, 381, -0.9737F, -0.5632F, 9.5368F, 2, 1, 1, -0.198F, false));
		bone2.cubeList.add(new ModelBox(bone2, 184, 382, -0.9737F, -0.5632F, 10.7868F, 2, 1, 1, -0.198F, false));
		bone2.cubeList.add(new ModelBox(bone2, 190, 382, -0.9737F, -0.5632F, 7.0868F, 2, 1, 1, -0.199F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-14.7737F, -0.3632F, -12.4632F);
		bone2.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.8901F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 310, 208, 8.5605F, -10.93F, 3.3F, 1, 1, 21, -0.35F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 386, 207, 8.6105F, -11.08F, 19.55F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 386, 209, 8.6105F, -11.08F, 22.0F, 1, 1, 1, -0.197F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 386, 211, 8.6105F, -11.08F, 23.25F, 1, 1, 1, -0.197F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 386, 213, 8.6105F, -11.08F, 20.8F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 386, 215, 8.6105F, -11.08F, 17.05F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 386, 217, 8.6105F, -11.08F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 386, 219, 8.6105F, -11.08F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 386, 221, 8.6105F, -11.08F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 386, 223, 8.6105F, -11.08F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 386, 225, 8.6105F, -11.08F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 386, 227, 8.6105F, -11.08F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 386, 229, 8.6105F, -11.08F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 386, 231, 8.6105F, -11.08F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 386, 233, 8.6105F, -11.08F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 386, 235, 8.6105F, -11.08F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 386, 237, 8.6105F, -11.08F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 386, 239, 8.6105F, -11.08F, 3.35F, 1, 1, 1, -0.198F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-13.1737F, -0.3632F, -12.4632F);
		bone2.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.8901F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 310, 254, 8.0605F, 10.83F, 3.8F, 1, 1, 20, -0.35F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 386, 241, 8.0105F, 10.68F, 19.55F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 386, 243, 8.0105F, 10.68F, 22.0F, 1, 1, 1, -0.197F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 386, 245, 8.0105F, 10.68F, 23.25F, 1, 1, 1, -0.197F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 386, 247, 8.0105F, 10.68F, 20.8F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 386, 275, 8.0105F, 10.68F, 17.05F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 386, 277, 8.0105F, 10.68F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 386, 279, 8.0105F, 10.68F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 280, 386, 8.0105F, 10.68F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 386, 281, 8.0105F, 10.68F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 386, 283, 8.0105F, 10.68F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 284, 386, 8.0105F, 10.68F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 386, 285, 8.0105F, 10.68F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 386, 287, 8.0105F, 10.68F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 288, 386, 8.0105F, 10.68F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 386, 289, 8.0105F, 10.68F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 386, 291, 8.0105F, 10.68F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 386, 293, 8.0105F, 10.68F, 3.35F, 1, 1, 1, -0.198F, false));

		sideDetails2 = new ModelRenderer(this);
		sideDetails2.setRotationPoint(-3.1F, -37.8F, -6.0F);
		upperSlick.addChild(sideDetails2);
		sideDetails2.cubeList.add(new ModelBox(sideDetails2, 386, 295, -0.516F, -0.7777F, -15.002F, 1, 1, 1, 0.0F, false));

		gun5 = new ModelRenderer(this);
		gun5.setRotationPoint(-0.4F, -1.45F, -4.3F);
		sideDetails2.addChild(gun5);
		setRotationAngle(gun5, 0.0F, 0.0F, -0.0524F);
		

		gun171_r1 = new ModelRenderer(this);
		gun171_r1.setRotationPoint(0.6923F, -0.0359F, 0.8168F);
		gun5.addChild(gun171_r1);
		setRotationAngle(gun171_r1, 0.0F, 0.0F, 0.48F);
		gun171_r1.cubeList.add(new ModelBox(gun171_r1, 380, 187, -1.2438F, -0.5839F, -0.2418F, 3, 1, 1, 0.0F, false));

		gun172_r2 = new ModelRenderer(this);
		gun172_r2.setRotationPoint(-1.3F, -0.05F, 1.0F);
		gun5.addChild(gun172_r2);
		setRotationAngle(gun172_r2, 0.0F, -0.2618F, 0.0F);
		

		gun272_r2_r1 = new ModelRenderer(this);
		gun272_r2_r1.setRotationPoint(1.877F, 0.0141F, -0.6926F);
		gun172_r2.addChild(gun272_r2_r1);
		setRotationAngle(gun272_r2_r1, 0.1198F, -0.0283F, 0.4625F);
		gun272_r2_r1.cubeList.add(new ModelBox(gun272_r2_r1, 188, 380, -1.0052F, -0.5829F, 0.0543F, 3, 1, 1, 0.0F, false));

		gun172_r5 = new ModelRenderer(this);
		gun172_r5.setRotationPoint(-1.3F, -0.05F, 0.0F);
		gun5.addChild(gun172_r5);
		setRotationAngle(gun172_r5, 0.0F, -0.9076F, 0.0F);
		

		gun173_r3_r1 = new ModelRenderer(this);
		gun173_r3_r1.setRotationPoint(1.8702F, 0.0141F, -1.0672F);
		gun172_r5.addChild(gun173_r3_r1);
		setRotationAngle(gun173_r3_r1, 0.373F, -0.0548F, 0.2887F);
		gun173_r3_r1.cubeList.add(new ModelBox(gun173_r3_r1, 380, 243, -0.9563F, -0.5829F, -1.1687F, 1, 1, 2, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-1.5F, -37.875F, 0.125F);
		upperSlick.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 322, 367, -3.0F, -0.375F, -10.875F, 1, 1, 12, -0.25F, false));
		bone3.cubeList.add(new ModelBox(bone3, 368, 13, -2.4F, 0.625F, -22.575F, 1, 1, 12, -0.15F, false));
		bone3.cubeList.add(new ModelBox(bone3, 308, 386, -3.0F, -0.375F, -11.075F, 1, 1, 1, -0.25F, false));
		bone3.cubeList.add(new ModelBox(bone3, 348, 367, 2.0F, -0.375F, -10.875F, 1, 1, 12, -0.25F, false));
		bone3.cubeList.add(new ModelBox(bone3, 386, 299, 0.6125F, -2.7782F, 0.125F, 1, 1, 1, -0.25F, false));
		bone3.cubeList.add(new ModelBox(bone3, 386, 301, -1.6125F, -2.7782F, 0.125F, 1, 1, 1, -0.25F, false));
		bone3.cubeList.add(new ModelBox(bone3, 386, 303, 2.0F, -0.375F, -11.375F, 1, 1, 1, -0.25F, false));
		bone3.cubeList.add(new ModelBox(bone3, 32, 377, 2.0F, -0.375F, -16.375F, 1, 1, 3, -0.25F, false));
		bone3.cubeList.add(new ModelBox(bone3, 386, 305, 1.98F, -0.3859F, -13.9213F, 1, 1, 1, -0.33F, false));
		bone3.cubeList.add(new ModelBox(bone3, 282, 23, 1.101F, -0.476F, -14.775F, 2, 1, 4, -0.35F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(2.5F, 0.125F, -13.375F);
		bone3.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.7854F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 386, 307, -0.6F, -0.225F, -0.55F, 1, 1, 1, -0.25F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(2.071F, 0.8647F, -16.5087F);
		bone3.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, -0.4363F, -1.2654F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 380, 282, -1.2F, -0.5F, 0.0F, 2, 1, 1, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-3.9002F, -0.149F, -9.425F);
		bone3.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -1.2654F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 150, 383, -0.4998F, 5.5F, -6.7F, 2, 1, 1, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 152, 380, -0.5F, 5.5F, -6.2F, 2, 1, 2, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 144, 380, -0.5F, 5.5F, -1.7F, 2, 1, 2, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-2.1228F, 0.7015F, -9.625F);
		bone3.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 1.2654F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 120, 380, -0.5F, -0.5F, -1.2F, 2, 1, 2, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(2.4085F, -0.2165F, 0.625F);
		bone3.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.5236F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 386, 297, -0.5F, -2.775F, -0.5F, 1, 1, 1, -0.25F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 64, 363, -0.5F, -2.5F, -0.5F, 1, 3, 1, -0.25F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(2.0977F, -0.2103F, 0.2829F);
		bone3.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.6109F, -0.5236F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 364, 91, -0.5F, -2.5F, -0.5F, 1, 3, 1, -0.125F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-2.0977F, -0.2103F, 0.2829F);
		bone3.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, -0.6109F, 0.5236F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 162, 376, -0.5F, -2.5F, -0.5F, 1, 3, 1, -0.125F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-2.4085F, -0.2165F, 0.625F);
		bone3.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, 0.5236F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 140, 389, -0.5F, -2.775F, -0.5F, 1, 1, 1, -0.25F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 48, 372, -0.5F, -2.5F, -0.5F, 1, 3, 1, -0.25F, false));

		receiver14_r11 = new ModelRenderer(this);
		receiver14_r11.setRotationPoint(2.3F, 0.375F, -1.125F);
		bone3.addChild(receiver14_r11);
		setRotationAngle(receiver14_r11, 0.0F, 0.0F, 0.2618F);
		receiver14_r11.cubeList.add(new ModelBox(receiver14_r11, 368, 50, -2.0F, 0.0F, -7.9988F, 2, 2, 10, 0.0F, false));

		receiver15_r9 = new ModelRenderer(this);
		receiver15_r9.setRotationPoint(-2.3F, 0.375F, -1.125F);
		bone3.addChild(receiver15_r9);
		setRotationAngle(receiver15_r9, 0.0F, 0.0F, -0.2618F);
		receiver15_r9.cubeList.add(new ModelBox(receiver15_r9, 368, 91, 0.002F, 0.0F, -8.0F, 2, 2, 10, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		upperSlick.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}