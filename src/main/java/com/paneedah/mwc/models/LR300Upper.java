package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class LR300Upper extends ModelBase {
	private final ModelRenderer upper;
	private final ModelRenderer gun264_r2;
	private final ModelRenderer receiver14_r4;
	private final ModelRenderer receiver14_r5;
	private final ModelRenderer receiver13_r1;
	private final ModelRenderer receiver15_r7;
	private final ModelRenderer receiver14_r10;
	private final ModelRenderer receiver14_r11;
	private final ModelRenderer receiver13_r4;
	private final ModelRenderer receiver13_r6;
	private final ModelRenderer receiver12_r3;
	private final ModelRenderer receiver16_r7;
	private final ModelRenderer receiver18_r3;
	private final ModelRenderer receiver17_r6;
	private final ModelRenderer gun125_r1;
	private final ModelRenderer gun264;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer bone8;
	private final ModelRenderer gun140_r2;
	private final ModelRenderer gun143_r2;
	private final ModelRenderer gun143_r1_r1;
	private final ModelRenderer gun264_r4;
	private final ModelRenderer gun263_r4;
	private final ModelRenderer gun264_r3;
	private final ModelRenderer gun263_r3;
	private final ModelRenderer gun2;
	private final ModelRenderer gun172_r1;
	private final ModelRenderer gun171_r1;
	private final ModelRenderer barrel2;
	private final ModelRenderer flashider2;
	private final ModelRenderer mk12gasblock2;
	private final ModelRenderer gun172_r3;
	private final ModelRenderer gun172_r4;
	private final ModelRenderer receiver13_r7;
	private final ModelRenderer receiver14_r12;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;

	public LR300Upper() {
		textureWidth = 368;
		textureHeight = 368;

		upper = new ModelRenderer(this);
		upper.setRotationPoint(0.0F, 24.0F, 0.0F);
		upper.cubeList.add(new ModelBox(upper, 308, 344, -2.0F, -41.9F, -0.4F, 1, 1, 2, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 318, 338, -2.501F, -41.701F, -23.7F, 2, 2, 3, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 0, 208, -2.5F, -41.7F, -22.0F, 2, 2, 22, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 342, 287, -0.599F, -40.15F, -19.0F, 1, 1, 3, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 238, 349, -2.0F, -39.8F, -23.699F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 242, 349, -0.7F, -38.5F, -23.697F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 246, 349, -3.3F, -38.5F, -23.697F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 188, 349, -2.0F, -37.2F, -23.699F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 296, 311, -0.5F, -39.0F, -22.701F, 1, 3, 12, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 130, 318, -0.8F, -37.0F, -10.698F, 1, 2, 11, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 322, 309, -3.4F, -37.1F, -20.201F, 1, 2, 10, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 192, 160, -3.2F, -37.0F, -22.699F, 1, 2, 23, 0.0F, false));

		gun264_r2 = new ModelRenderer(this);
		gun264_r2.setRotationPoint(-4.5F, -36.8F, -22.4F);
		upper.addChild(gun264_r2);
		setRotationAngle(gun264_r2, 0.0F, 0.0F, -0.9295F);
		gun264_r2.cubeList.add(new ModelBox(gun264_r2, 344, 309, -0.0748F, -0.1002F, 5.95F, 1, 1, 2, -0.2F, false));

		receiver14_r4 = new ModelRenderer(this);
		receiver14_r4.setRotationPoint(-3.6F, -37.5F, -11.7F);
		upper.addChild(receiver14_r4);
		setRotationAngle(receiver14_r4, 0.0F, 0.0F, -0.4014F);
		receiver14_r4.cubeList.add(new ModelBox(receiver14_r4, 216, 258, -0.4F, -0.2F, -8.999F, 1, 2, 11, -0.4F, false));

		receiver14_r5 = new ModelRenderer(this);
		receiver14_r5.setRotationPoint(-3.2F, -37.5F, -23.7F);
		upper.addChild(receiver14_r5);
		setRotationAngle(receiver14_r5, 0.0F, 0.0F, -0.4014F);
		receiver14_r5.cubeList.add(new ModelBox(receiver14_r5, 192, 349, -0.092F, -0.0391F, 0.003F, 1, 1, 1, 0.0F, false));

		receiver13_r1 = new ModelRenderer(this);
		receiver13_r1.setRotationPoint(0.2F, -37.5F, -23.7F);
		upper.addChild(receiver13_r1);
		setRotationAngle(receiver13_r1, 0.0F, 0.0F, 0.4014F);
		receiver13_r1.cubeList.add(new ModelBox(receiver13_r1, 196, 349, -0.908F, -0.0391F, 0.003F, 1, 1, 1, 0.0F, false));

		receiver15_r7 = new ModelRenderer(this);
		receiver15_r7.setRotationPoint(-1.9F, -36.2F, -23.7F);
		upper.addChild(receiver15_r7);
		setRotationAngle(receiver15_r7, 0.0F, 0.0F, 0.4014F);
		receiver15_r7.cubeList.add(new ModelBox(receiver15_r7, 200, 349, -1.092F, -0.9609F, 0.001F, 1, 1, 1, 0.0F, false));

		receiver14_r10 = new ModelRenderer(this);
		receiver14_r10.setRotationPoint(-1.1F, -36.2F, -23.7F);
		upper.addChild(receiver14_r10);
		setRotationAngle(receiver14_r10, 0.0F, 0.0F, -0.4014F);
		receiver14_r10.cubeList.add(new ModelBox(receiver14_r10, 214, 349, 0.0921F, -0.9609F, 0.001F, 1, 1, 1, 0.0F, false));

		receiver14_r11 = new ModelRenderer(this);
		receiver14_r11.setRotationPoint(-1.9F, -38.8F, -23.7F);
		upper.addChild(receiver14_r11);
		setRotationAngle(receiver14_r11, 0.0F, 0.0F, -0.4014F);
		receiver14_r11.cubeList.add(new ModelBox(receiver14_r11, 218, 349, -0.7013F, -0.9596F, 0.004F, 1, 1, 1, 0.0F, false));

		receiver13_r4 = new ModelRenderer(this);
		receiver13_r4.setRotationPoint(-1.1F, -38.8F, -23.7F);
		upper.addChild(receiver13_r4);
		setRotationAngle(receiver13_r4, 0.0F, 0.0F, 0.4014F);
		receiver13_r4.cubeList.add(new ModelBox(receiver13_r4, 222, 349, -0.2987F, -0.9596F, 0.004F, 1, 1, 1, 0.0F, false));

		receiver13_r6 = new ModelRenderer(this);
		receiver13_r6.setRotationPoint(-3.2F, -37.5F, -23.7F);
		upper.addChild(receiver13_r6);
		setRotationAngle(receiver13_r6, 0.0F, 0.0F, 0.4014F);
		receiver13_r6.cubeList.add(new ModelBox(receiver13_r6, 226, 349, -0.4828F, -1.8814F, 0.003F, 1, 1, 1, 0.0F, false));

		receiver12_r3 = new ModelRenderer(this);
		receiver12_r3.setRotationPoint(0.2F, -37.5F, -23.7F);
		upper.addChild(receiver12_r3);
		setRotationAngle(receiver12_r3, 0.0F, 0.0F, -0.4014F);
		receiver12_r3.cubeList.add(new ModelBox(receiver12_r3, 230, 349, -0.5172F, -1.8814F, 0.003F, 1, 1, 1, 0.0F, false));

		receiver16_r7 = new ModelRenderer(this);
		receiver16_r7.setRotationPoint(0.4F, -38.85F, -19.0F);
		upper.addChild(receiver16_r7);
		setRotationAngle(receiver16_r7, 0.0F, 0.0F, 1.9705F);
		receiver16_r7.cubeList.add(new ModelBox(receiver16_r7, 288, 342, -1.1965F, 0.5059F, 0.0F, 1, 1, 3, 0.0F, false));

		receiver18_r3 = new ModelRenderer(this);
		receiver18_r3.setRotationPoint(0.4F, -38.85F, -19.0F);
		upper.addChild(receiver18_r3);
		setRotationAngle(receiver18_r3, 0.0F, -1.9333F, 0.0F);
		receiver18_r3.cubeList.add(new ModelBox(receiver18_r3, 54, 344, 0.0F, -1.3F, 0.0F, 1, 2, 1, 0.0F, false));

		receiver17_r6 = new ModelRenderer(this);
		receiver17_r6.setRotationPoint(0.4F, -38.85F, -16.5F);
		upper.addChild(receiver17_r6);
		setRotationAngle(receiver17_r6, 0.0F, 1.9333F, 0.0F);
		receiver17_r6.cubeList.add(new ModelBox(receiver17_r6, 176, 347, -0.4679F, -1.3F, -1.1764F, 1, 2, 1, 0.0F, false));

		gun125_r1 = new ModelRenderer(this);
		gun125_r1.setRotationPoint(-2.5F, -40.1F, -1.0F);
		upper.addChild(gun125_r1);
		setRotationAngle(gun125_r1, -0.632F, 0.0F, 0.0F);
		gun125_r1.cubeList.add(new ModelBox(gun125_r1, 342, 291, -0.001F, -1.801F, -0.0793F, 2, 2, 2, 0.0F, false));

		gun264 = new ModelRenderer(this);
		gun264.setRotationPoint(-3.7F, -34.2F, -20.0F);
		upper.addChild(gun264);
		setRotationAngle(gun264, 0.0F, 0.0F, 0.1578F);
		gun264.cubeList.add(new ModelBox(gun264, 154, 318, -1.1234F, -2.9804F, -0.3F, 1, 3, 10, -0.3F, false));
		gun264.cubeList.add(new ModelBox(gun264, 342, 75, -0.9734F, -2.6804F, 0.5F, 1, 2, 3, -0.1F, false));
		gun264.cubeList.add(new ModelBox(gun264, 342, 95, -0.9734F, -2.6804F, 5.65F, 1, 2, 3, -0.1F, false));
		gun264.cubeList.add(new ModelBox(gun264, 350, 297, -1.1234F, -1.2804F, 4.05F, 1, 1, 1, -0.1F, false));
		gun264.cubeList.add(new ModelBox(gun264, 234, 349, -1.1244F, -1.6804F, 4.049F, 1, 1, 1, -0.1F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-1.5237F, -41.3381F, -13.7868F);
		upper.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 168, 277, -0.9737F, -1.0632F, -7.9132F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 344, 281, -0.9737F, -1.0632F, -9.1132F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 344, 330, -0.9737F, -1.0632F, -6.6632F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 346, 93, -0.9737F, -1.0632F, -5.4132F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 346, 171, -0.9737F, -1.0632F, -4.1632F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 170, 347, -0.9737F, -1.0632F, -2.9132F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 214, 347, -0.9737F, -1.0632F, -1.6632F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 220, 347, -0.9737F, -1.0632F, 0.8368F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 226, 347, -0.9737F, -1.0632F, -0.4132F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 232, 347, -0.9737F, -1.0632F, 3.3368F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 238, 347, -0.9737F, -1.0632F, 2.0868F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 244, 347, -0.9737F, -1.0632F, 5.8368F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 256, 347, -0.9737F, -1.0632F, 4.5868F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 308, 347, -0.9737F, -1.0632F, 8.3368F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 326, 347, -0.9737F, -1.0632F, 9.5368F, 2, 1, 1, -0.198F, false));
		bone3.cubeList.add(new ModelBox(bone3, 338, 347, -0.9737F, -1.0632F, 11.9868F, 2, 1, 1, -0.198F, false));
		bone3.cubeList.add(new ModelBox(bone3, 348, 114, -0.9737F, -1.0632F, 10.7868F, 2, 1, 1, -0.198F, false));
		bone3.cubeList.add(new ModelBox(bone3, 188, 343, -0.9737F, -1.0632F, 13.1368F, 2, 1, 2, -0.198F, false));
		bone3.cubeList.add(new ModelBox(bone3, 332, 347, -0.9737F, -1.0632F, 7.0868F, 2, 1, 1, -0.199F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-14.7737F, -0.3632F, -12.4632F);
		bone3.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.8901F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 48, 208, 8.1719F, -11.2447F, 3.6F, 1, 1, 23, -0.35F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 256, 349, 8.2219F, -11.3947F, 19.55F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 260, 349, 8.2219F, -11.3947F, 22.0F, 1, 1, 1, -0.197F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 350, 39, 8.2219F, -11.3947F, 24.45F, 1, 1, 1, -0.197F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 350, 60, 8.2219F, -11.3947F, 23.25F, 1, 1, 1, -0.197F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 344, 321, 8.2219F, -11.3947F, 25.6F, 1, 1, 2, -0.197F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 272, 349, 8.2219F, -11.3947F, 20.8F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 276, 349, 8.2219F, -11.3947F, 17.05F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 280, 349, 8.2219F, -11.3947F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 284, 349, 8.2219F, -11.3947F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 288, 349, 8.2219F, -11.3947F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 292, 349, 8.2219F, -11.3947F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 296, 349, 8.2219F, -11.3947F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 304, 349, 8.2219F, -11.3947F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 308, 349, 8.2219F, -11.3947F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 326, 349, 8.2219F, -11.3947F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 330, 349, 8.2219F, -11.3947F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 334, 349, 8.2219F, -11.3947F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 338, 349, 8.2219F, -11.3947F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 342, 349, 8.2219F, -11.3947F, 3.35F, 1, 1, 1, -0.198F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-13.1737F, -0.3632F, -12.4632F);
		bone3.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.8901F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 96, 208, 8.4491F, 10.5153F, 3.8F, 1, 1, 23, -0.35F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 346, 349, 8.3991F, 10.3653F, 19.55F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 4, 350, 8.3991F, 10.3653F, 22.0F, 1, 1, 1, -0.197F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 350, 41, 8.3991F, 10.3653F, 24.45F, 1, 1, 1, -0.197F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 350, 58, 8.3991F, 10.3653F, 23.25F, 1, 1, 1, -0.197F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 344, 318, 8.3991F, 10.3653F, 25.6F, 1, 1, 2, -0.197F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 14, 350, 8.3991F, 10.3653F, 20.8F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 18, 350, 8.3991F, 10.3653F, 17.05F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 350, 21, 8.3991F, 10.3653F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 22, 350, 8.3991F, 10.3653F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 350, 23, 8.3991F, 10.3653F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 350, 25, 8.3991F, 10.3653F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 26, 350, 8.3991F, 10.3653F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 350, 27, 8.3991F, 10.3653F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 350, 29, 8.3991F, 10.3653F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 30, 350, 8.3991F, 10.3653F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 350, 31, 8.3991F, 10.3653F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 350, 33, 8.3991F, 10.3653F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 34, 350, 8.3991F, 10.3653F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 38, 350, 8.3991F, 10.3653F, 3.35F, 1, 1, 1, -0.198F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-3.1F, -37.8F, -6.0F);
		upper.addChild(bone8);
		bone8.cubeList.add(new ModelBox(bone8, 62, 350, -0.5F, -0.7F, -15.0F, 1, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 70, 350, -1.325F, 0.4F, -15.0F, 1, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 348, 116, -1.325F, 0.4F, -4.9F, 2, 1, 1, -0.2F, false));

		gun140_r2 = new ModelRenderer(this);
		gun140_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone8.addChild(gun140_r2);
		setRotationAngle(gun140_r2, 0.0F, -0.2603F, 0.0F);
		

		gun143_r2 = new ModelRenderer(this);
		gun143_r2.setRotationPoint(-1.6F, -0.2F, 6.5F);
		bone8.addChild(gun143_r2);
		setRotationAngle(gun143_r2, 0.0F, -0.2603F, 0.0F);
		

		gun143_r1_r1 = new ModelRenderer(this);
		gun143_r1_r1.setRotationPoint(-1.7529F, -0.4F, -5.7842F);
		gun143_r2.addChild(gun143_r1_r1);
		setRotationAngle(gun143_r1_r1, 0.0F, 0.0F, 0.2182F);
		gun143_r1_r1.cubeList.add(new ModelBox(gun143_r1_r1, 344, 324, -0.5F, -0.5F, -1.8F, 1, 1, 2, 0.0F, false));
		gun143_r1_r1.cubeList.add(new ModelBox(gun143_r1_r1, 344, 39, -1.0F, -1.0F, -0.3F, 2, 3, 1, -0.4F, false));

		gun264_r4 = new ModelRenderer(this);
		gun264_r4.setRotationPoint(-1.4F, 1.0F, -16.4F);
		bone8.addChild(gun264_r4);
		setRotationAngle(gun264_r4, 0.0F, 0.0F, -0.9295F);
		gun264_r4.cubeList.add(new ModelBox(gun264_r4, 344, 327, -0.0748F, -0.1002F, 5.95F, 1, 1, 2, -0.2F, false));
		gun264_r4.cubeList.add(new ModelBox(gun264_r4, 268, 311, -0.0748F, -0.1002F, 0.1F, 1, 1, 13, -0.3F, false));

		gun263_r4 = new ModelRenderer(this);
		gun263_r4.setRotationPoint(-0.7F, 0.3F, -15.0F);
		bone8.addChild(gun263_r4);
		setRotationAngle(gun263_r4, 0.0F, 0.0F, 0.4014F);
		gun263_r4.cubeList.add(new ModelBox(gun263_r4, 74, 350, -0.2306F, -2.2089F, -0.001F, 1, 1, 1, 0.0F, false));

		gun264_r3 = new ModelRenderer(this);
		gun264_r3.setRotationPoint(-0.22F, -0.82F, -15.0F);
		bone8.addChild(gun264_r3);
		setRotationAngle(gun264_r3, 0.0F, 0.0F, 0.8203F);
		gun264_r3.cubeList.add(new ModelBox(gun264_r3, 318, 297, -0.612F, -1.81F, 0.0F, 1, 1, 11, 0.0F, false));

		gun263_r3 = new ModelRenderer(this);
		gun263_r3.setRotationPoint(-1.2F, 0.4F, -15.0F);
		bone8.addChild(gun263_r3);
		setRotationAngle(gun263_r3, 0.0F, 0.0F, -0.3491F);
		gun263_r3.cubeList.add(new ModelBox(gun263_r3, 350, 299, -0.1174F, -0.0428F, -0.001F, 1, 1, 1, 0.0F, false));

		gun2 = new ModelRenderer(this);
		gun2.setRotationPoint(-0.4F, -1.45F, -4.3F);
		bone8.addChild(gun2);
		setRotationAngle(gun2, 0.0F, 0.0F, -0.0524F);
		

		gun172_r1 = new ModelRenderer(this);
		gun172_r1.setRotationPoint(-0.6574F, -0.01F, 0.136F);
		gun2.addChild(gun172_r1);
		setRotationAngle(gun172_r1, 0.0F, -0.1309F, 0.3054F);
		gun172_r1.cubeList.add(new ModelBox(gun172_r1, 166, 349, -0.5F, 0.0F, 2.5F, 1, 2, 1, 0.0F, false));
		gun172_r1.cubeList.add(new ModelBox(gun172_r1, 242, 341, -0.5F, -1.0F, -0.5F, 1, 3, 3, 0.0F, false));

		gun171_r1 = new ModelRenderer(this);
		gun171_r1.setRotationPoint(0.5502F, 0.2491F, 0.2879F);
		gun2.addChild(gun171_r1);
		setRotationAngle(gun171_r1, 0.0F, 0.0F, 0.3054F);
		gun171_r1.cubeList.add(new ModelBox(gun171_r1, 346, 168, -1.6601F, 0.116F, 2.2871F, 2, 2, 1, 0.0F, false));
		gun171_r1.cubeList.add(new ModelBox(gun171_r1, 164, 337, -1.6601F, -0.884F, -0.7129F, 2, 3, 3, 0.0F, false));

		barrel2 = new ModelRenderer(this);
		barrel2.setRotationPoint(2.0F, 1.3571F, -29.201F);
		gun2.addChild(barrel2);
		

		flashider2 = new ModelRenderer(this);
		flashider2.setRotationPoint(-0.5F, 0.3F, -17.749F);
		barrel2.addChild(flashider2);
		

		mk12gasblock2 = new ModelRenderer(this);
		mk12gasblock2.setRotationPoint(1.5F, 37.8929F, 40.501F);
		barrel2.addChild(mk12gasblock2);
		

		gun172_r3 = new ModelRenderer(this);
		gun172_r3.setRotationPoint(-1.3F, -0.05F, 1.0F);
		gun2.addChild(gun172_r3);
		setRotationAngle(gun172_r3, 0.0F, -0.2618F, 0.0F);
		

		gun172_r4 = new ModelRenderer(this);
		gun172_r4.setRotationPoint(-1.3F, -0.05F, 0.0F);
		gun2.addChild(gun172_r4);
		setRotationAngle(gun172_r4, 0.0F, -0.9076F, 0.0F);
		

		receiver13_r7 = new ModelRenderer(this);
		receiver13_r7.setRotationPoint(-0.5F, 0.3F, -5.7F);
		bone8.addChild(receiver13_r7);
		setRotationAngle(receiver13_r7, 0.0F, 0.0F, 0.4014F);
		receiver13_r7.cubeList.add(new ModelBox(receiver13_r7, 350, 75, -0.3907F, -1.9205F, -9.3F, 1, 1, 1, 0.0F, false));

		receiver14_r12 = new ModelRenderer(this);
		receiver14_r12.setRotationPoint(0.8F, -1.0F, -5.7F);
		bone8.addChild(receiver14_r12);
		setRotationAngle(receiver14_r12, 0.0F, 0.0F, -0.4014F);
		receiver14_r12.cubeList.add(new ModelBox(receiver14_r12, 350, 77, -0.6093F, -0.9205F, -9.299F, 1, 1, 1, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		upper.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 326, 189, -0.2F, -38.5F, -22.6988F, 1, 1, 9, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 350, 146, -0.2F, -38.5F, -14.1988F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 350, 148, -0.2F, -38.5F, -11.1988F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 24, 343, -0.1F, -38.6F, -13.2988F, 1, 1, 3, -0.1F, false));
		bone.cubeList.add(new ModelBox(bone, 78, 316, -0.2F, -38.5F, -10.9988F, 1, 1, 12, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 320, 102, -3.8F, -38.5F, -10.0F, 1, 1, 11, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 186, 346, -3.8F, -38.5F, -22.7F, 1, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 350, 152, -3.8F, -38.5F, -10.3F, 1, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-3.458F, -36.5603F, -11.7F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.3491F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 344, 43, 0.0F, -1.0F, -11.0F, 1, 2, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 26, 316, 0.0F, -1.0F, 1.4F, 1, 2, 12, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-2.5449F, -39.9958F, -12.7F);
		bone.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 0.9163F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 344, 47, 0.0F, -1.0F, -10.0F, 1, 2, 2, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 318, 284, 0.0F, -1.0F, 2.7F, 1, 2, 11, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-3.3382F, -39.387F, -11.7F);
		bone.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 0.48F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 346, 165, 0.0F, 0.0F, -11.0F, 1, 1, 2, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 104, 316, 0.0F, 0.0F, 1.4F, 1, 1, 12, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-1.0639F, -39.2024F, -0.6988F);
		bone.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -0.9163F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 66, 349, 0.0F, -1.0F, -22.0F, 1, 2, 1, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 192, 185, 0.0F, -1.0F, -21.3F, 1, 2, 23, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-0.5488F, -38.9253F, -0.6988F);
		bone.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.48F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 350, 150, 0.0F, 0.0F, -22.0F, 1, 1, 1, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 144, 208, 0.0F, 0.0F, -21.3F, 1, 1, 23, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-0.4817F, -36.9023F, 0.3012F);
		bone.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, 0.3491F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 316, 0.0F, -1.0F, -11.0F, 1, 2, 12, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 10, 349, 0.0F, -1.0F, -11.5F, 1, 2, 1, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 349, 0.0F, -1.0F, -14.5F, 1, 2, 1, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 326, 162, 0.0F, -1.0F, -23.0F, 1, 2, 9, 0.0F, false));
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