package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class HK416D_Upper extends ModelBase {
	private final ModelRenderer upper;
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
	private final ModelRenderer receiver15_r7;
	private final ModelRenderer receiver14_r10;
	private final ModelRenderer receiver14_r11;
	private final ModelRenderer receiver13_r4;
	private final ModelRenderer receiver12_r2;
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
	private final ModelRenderer gun264;
	private final ModelRenderer bone;
	private final ModelRenderer rails;
	private final ModelRenderer rails_r1;
	private final ModelRenderer cube_r82;
	private final ModelRenderer cube_r83;
	private final ModelRenderer bone5;
	private final ModelRenderer gun140_r2;
	private final ModelRenderer gun340_r3_r1;
	private final ModelRenderer gun240_r2_r1;
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
	private final ModelRenderer receiver13_r7;
	private final ModelRenderer receiver14_r12;

	public HK416D_Upper() {
		textureWidth = 432;
		textureHeight = 432;

		upper = new ModelRenderer(this);
		upper.setRotationPoint(0.0F, 24.0F, 0.0F);
		upper.cubeList.add(new ModelBox(upper, 416, 236, -1.401F, -40.301F, -22.701F, 1, 1, 2, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 330, 50, -2.601F, -40.301F, -22.702F, 2, 1, 2, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 416, 349, -0.6F, -39.85F, -18.5F, 1, 1, 2, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 146, 367, -0.599F, -39.85F, -19.0F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 362, 161, -1.4F, -40.3F, -22.0F, 1, 1, 23, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 362, 185, -2.6F, -40.3F, -22.0F, 1, 1, 23, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 146, 369, -2.0F, -39.8F, -23.699F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 146, 371, -0.7F, -38.5F, -23.697F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 146, 373, -3.3F, -38.5F, -23.697F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 44, 378, -3.7F, -38.5F, 0.601F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 44, 380, -0.3F, -38.5F, 0.6F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 416, 352, -3.6F, -38.5F, -22.7F, 1, 1, 2, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 312, 197, -0.4F, -38.5F, -22.7F, 1, 1, 24, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 362, 209, -3.6F, -38.5F, -10.7F, 1, 1, 12, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 380, 247, -2.0F, -37.2F, -23.699F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 416, 355, -2.5F, -37.001F, -22.701F, 2, 2, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 172, 136, -0.6F, -37.1F, -21.201F, 1, 2, 10, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 50, 352, -0.8F, -37.0F, -22.698F, 1, 2, 23, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 380, 38, -3.4F, -37.1F, -20.201F, 1, 2, 10, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 98, 353, -3.2F, -37.0F, -22.699F, 1, 2, 23, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 416, 370, -0.45F, -36.4F, -16.5F, 1, 1, 2, 0.0F, false));

		receiver18_r2 = new ModelRenderer(this);
		receiver18_r2.setRotationPoint(-2.6F, -39.25F, 1.0F);
		upper.addChild(receiver18_r2);
		setRotationAngle(receiver18_r2, 0.0F, 0.0F, -0.8029F);
		receiver18_r2.cubeList.add(new ModelBox(receiver18_r2, 380, 249, -0.1806F, -0.6946F, -0.4F, 1, 1, 1, 0.0F, false));

		receiver17_r5 = new ModelRenderer(this);
		receiver17_r5.setRotationPoint(-0.4F, -39.25F, 1.0F);
		upper.addChild(receiver17_r5);
		setRotationAngle(receiver17_r5, 0.0F, 0.0F, 0.8029F);
		receiver17_r5.cubeList.add(new ModelBox(receiver17_r5, 44, 382, -0.8194F, -0.6946F, -0.4F, 1, 1, 1, 0.0F, false));

		receiver14_r4 = new ModelRenderer(this);
		receiver14_r4.setRotationPoint(-3.6F, -37.5F, -11.7F);
		upper.addChild(receiver14_r4);
		setRotationAngle(receiver14_r4, 0.0F, 0.0F, -0.4014F);
		receiver14_r4.cubeList.add(new ModelBox(receiver14_r4, 382, 301, 0.0F, 0.0F, 1.001F, 1, 1, 12, 0.0F, false));
		receiver14_r4.cubeList.add(new ModelBox(receiver14_r4, 384, 273, -0.4F, -0.2F, -8.999F, 1, 2, 11, -0.4F, false));
		receiver14_r4.cubeList.add(new ModelBox(receiver14_r4, 416, 358, 0.0F, 0.0F, -10.998F, 1, 1, 2, 0.0F, false));

		receiver14_r5 = new ModelRenderer(this);
		receiver14_r5.setRotationPoint(-3.2F, -37.5F, -23.7F);
		upper.addChild(receiver14_r5);
		setRotationAngle(receiver14_r5, 0.0F, 0.0F, -0.4014F);
		receiver14_r5.cubeList.add(new ModelBox(receiver14_r5, 44, 384, -0.092F, -0.0391F, 0.003F, 1, 1, 1, 0.0F, false));

		receiver13_r1 = new ModelRenderer(this);
		receiver13_r1.setRotationPoint(0.2F, -37.5F, -23.7F);
		upper.addChild(receiver13_r1);
		setRotationAngle(receiver13_r1, 0.0F, 0.0F, 0.4014F);
		receiver13_r1.cubeList.add(new ModelBox(receiver13_r1, 44, 386, -0.908F, -0.0391F, 0.003F, 1, 1, 1, 0.0F, false));

		receiver12_r1 = new ModelRenderer(this);
		receiver12_r1.setRotationPoint(0.6F, -37.5F, -22.7F);
		upper.addChild(receiver12_r1);
		setRotationAngle(receiver12_r1, 0.0F, 0.0F, 0.4014F);
		receiver12_r1.cubeList.add(new ModelBox(receiver12_r1, 324, 112, -1.0F, 0.0F, 0.001F, 1, 1, 24, 0.0F, false));

		receiver15_r6 = new ModelRenderer(this);
		receiver15_r6.setRotationPoint(-3.7F, -37.5F, 0.6F);
		upper.addChild(receiver15_r6);
		setRotationAngle(receiver15_r6, -0.925F, 0.0F, -0.3142F);
		receiver15_r6.cubeList.add(new ModelBox(receiver15_r6, 58, 270, 0.001F, 0.3F, 0.5F, 1, 2, 1, 0.0F, false));

		receiver14_r6 = new ModelRenderer(this);
		receiver14_r6.setRotationPoint(0.7F, -37.5F, 0.6F);
		upper.addChild(receiver14_r6);
		setRotationAngle(receiver14_r6, -0.925F, 0.0F, 0.3142F);
		receiver14_r6.cubeList.add(new ModelBox(receiver14_r6, 54, 276, -0.999F, 0.3F, 0.5F, 1, 2, 1, 0.0F, false));

		receiver14_r7 = new ModelRenderer(this);
		receiver14_r7.setRotationPoint(-3.7F, -37.5F, 0.6F);
		upper.addChild(receiver14_r7);
		setRotationAngle(receiver14_r7, 0.0F, 0.0F, -0.3142F);
		receiver14_r7.cubeList.add(new ModelBox(receiver14_r7, 54, 279, 0.0F, 0.0F, 0.001F, 1, 2, 1, 0.0F, false));

		receiver13_r2 = new ModelRenderer(this);
		receiver13_r2.setRotationPoint(0.7F, -37.5F, 0.6F);
		upper.addChild(receiver13_r2);
		setRotationAngle(receiver13_r2, 0.0F, 0.0F, 0.3142F);
		receiver13_r2.cubeList.add(new ModelBox(receiver13_r2, 54, 282, -1.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		receiver13_r3 = new ModelRenderer(this);
		receiver13_r3.setRotationPoint(0.7F, -37.5F, 0.6F);
		upper.addChild(receiver13_r3);
		setRotationAngle(receiver13_r3, 0.0F, 0.0F, -0.4014F);
		receiver13_r3.cubeList.add(new ModelBox(receiver13_r3, 44, 388, -0.6083F, -2.1205F, 0.001F, 1, 1, 1, 0.0F, false));
		receiver13_r3.cubeList.add(new ModelBox(receiver13_r3, 44, 390, -0.6093F, -1.9205F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver14_r8 = new ModelRenderer(this);
		receiver14_r8.setRotationPoint(-3.7F, -37.5F, 0.6F);
		upper.addChild(receiver14_r8);
		setRotationAngle(receiver14_r8, 0.0F, 0.0F, 0.4014F);
		receiver14_r8.cubeList.add(new ModelBox(receiver14_r8, 426, 52, -0.3907F, -1.9205F, 0.0F, 1, 1, 1, 0.0F, false));
		receiver14_r8.cubeList.add(new ModelBox(receiver14_r8, 44, 392, -0.3917F, -2.1205F, 0.001F, 1, 1, 1, 0.0F, false));

		receiver14_r9 = new ModelRenderer(this);
		receiver14_r9.setRotationPoint(-2.3F, -38.8F, -11.7F);
		upper.addChild(receiver14_r9);
		setRotationAngle(receiver14_r9, 0.0F, 0.0F, -0.4014F);
		receiver14_r9.cubeList.add(new ModelBox(receiver14_r9, 384, 247, -0.6093F, -0.9205F, 1.001F, 1, 1, 12, 0.0F, false));
		receiver14_r9.cubeList.add(new ModelBox(receiver14_r9, 416, 361, -0.6093F, -0.9205F, -10.999F, 1, 1, 2, 0.0F, false));

		receiver15_r7 = new ModelRenderer(this);
		receiver15_r7.setRotationPoint(-1.9F, -36.2F, -23.7F);
		upper.addChild(receiver15_r7);
		setRotationAngle(receiver15_r7, 0.0F, 0.0F, 0.4014F);
		receiver15_r7.cubeList.add(new ModelBox(receiver15_r7, 44, 394, -1.092F, -0.9609F, 0.001F, 1, 1, 1, 0.0F, false));

		receiver14_r10 = new ModelRenderer(this);
		receiver14_r10.setRotationPoint(-1.1F, -36.2F, -23.7F);
		upper.addChild(receiver14_r10);
		setRotationAngle(receiver14_r10, 0.0F, 0.0F, -0.4014F);
		receiver14_r10.cubeList.add(new ModelBox(receiver14_r10, 44, 396, 0.0921F, -0.9609F, 0.001F, 1, 1, 1, 0.0F, false));

		receiver14_r11 = new ModelRenderer(this);
		receiver14_r11.setRotationPoint(-1.9F, -38.8F, -23.7F);
		upper.addChild(receiver14_r11);
		setRotationAngle(receiver14_r11, 0.0F, 0.0F, -0.4014F);
		receiver14_r11.cubeList.add(new ModelBox(receiver14_r11, 400, 373, -0.7013F, -0.9596F, 0.004F, 1, 1, 1, 0.0F, false));

		receiver13_r4 = new ModelRenderer(this);
		receiver13_r4.setRotationPoint(-1.1F, -38.8F, -23.7F);
		upper.addChild(receiver13_r4);
		setRotationAngle(receiver13_r4, 0.0F, 0.0F, 0.4014F);
		receiver13_r4.cubeList.add(new ModelBox(receiver13_r4, 128, 408, -0.2987F, -0.9596F, 0.004F, 1, 1, 1, 0.0F, false));

		receiver12_r2 = new ModelRenderer(this);
		receiver12_r2.setRotationPoint(-0.7F, -38.8F, -22.7F);
		upper.addChild(receiver12_r2);
		setRotationAngle(receiver12_r2, 0.0F, 0.0F, 0.4014F);
		receiver12_r2.cubeList.add(new ModelBox(receiver12_r2, 156, 325, -0.3907F, -0.9205F, 0.001F, 1, 1, 24, 0.0F, false));

		receiver13_r5 = new ModelRenderer(this);
		receiver13_r5.setRotationPoint(-3.6F, -37.5F, -11.7F);
		upper.addChild(receiver13_r5);
		setRotationAngle(receiver13_r5, 0.0F, 0.0F, 0.4014F);
		receiver13_r5.cubeList.add(new ModelBox(receiver13_r5, 384, 260, -0.3907F, -1.9205F, 1.0F, 1, 1, 12, 0.0F, false));
		receiver13_r5.cubeList.add(new ModelBox(receiver13_r5, 416, 364, -0.3907F, -1.9205F, -11.0F, 1, 1, 2, 0.0F, false));

		receiver13_r6 = new ModelRenderer(this);
		receiver13_r6.setRotationPoint(-3.2F, -37.5F, -23.7F);
		upper.addChild(receiver13_r6);
		setRotationAngle(receiver13_r6, 0.0F, 0.0F, 0.4014F);
		receiver13_r6.cubeList.add(new ModelBox(receiver13_r6, 394, 408, -0.4828F, -1.8814F, 0.003F, 1, 1, 1, 0.0F, false));

		receiver12_r3 = new ModelRenderer(this);
		receiver12_r3.setRotationPoint(0.2F, -37.5F, -23.7F);
		upper.addChild(receiver12_r3);
		setRotationAngle(receiver12_r3, 0.0F, 0.0F, -0.4014F);
		receiver12_r3.cubeList.add(new ModelBox(receiver12_r3, 128, 410, -0.5172F, -1.8814F, 0.003F, 1, 1, 1, 0.0F, false));

		receiver11_r1 = new ModelRenderer(this);
		receiver11_r1.setRotationPoint(0.6F, -37.5F, -22.7F);
		upper.addChild(receiver11_r1);
		setRotationAngle(receiver11_r1, 0.0F, 0.0F, -0.4014F);
		receiver11_r1.cubeList.add(new ModelBox(receiver11_r1, 206, 325, -0.6093F, -1.9205F, 0.0F, 1, 1, 24, 0.0F, false));

		receiver16_r7 = new ModelRenderer(this);
		receiver16_r7.setRotationPoint(0.4F, -38.85F, -19.0F);
		upper.addChild(receiver16_r7);
		setRotationAngle(receiver16_r7, 0.0F, 0.0F, 1.9705F);
		receiver16_r7.cubeList.add(new ModelBox(receiver16_r7, 394, 410, -0.9202F, 0.3892F, 0.0F, 1, 1, 1, 0.0F, false));
		receiver16_r7.cubeList.add(new ModelBox(receiver16_r7, 416, 367, -0.9212F, 0.3892F, 0.5F, 1, 1, 2, 0.0F, false));

		receiver18_r3 = new ModelRenderer(this);
		receiver18_r3.setRotationPoint(0.4F, -38.85F, -19.0F);
		upper.addChild(receiver18_r3);
		setRotationAngle(receiver18_r3, 0.0F, -1.9333F, 0.0F);
		receiver18_r3.cubeList.add(new ModelBox(receiver18_r3, 354, 412, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver17_r6 = new ModelRenderer(this);
		receiver17_r6.setRotationPoint(0.4F, -38.85F, -16.5F);
		upper.addChild(receiver17_r6);
		setRotationAngle(receiver17_r6, 0.0F, 1.9333F, 0.0F);
		receiver17_r6.cubeList.add(new ModelBox(receiver17_r6, 414, 312, 0.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

		gun125_r1 = new ModelRenderer(this);
		gun125_r1.setRotationPoint(-2.5F, -40.1F, -1.0F);
		upper.addChild(gun125_r1);
		setRotationAngle(gun125_r1, -0.632F, 0.0F, 0.0F);
		gun125_r1.cubeList.add(new ModelBox(gun125_r1, 330, 222, -0.001F, -1.3976F, 0.2161F, 2, 1, 2, 0.0F, false));

		gun170 = new ModelRenderer(this);
		gun170.setRotationPoint(-3.5F, -39.25F, -10.3F);
		upper.addChild(gun170);
		setRotationAngle(gun170, 0.0F, 0.0F, -0.0524F);
		

		gun172_r1 = new ModelRenderer(this);
		gun172_r1.setRotationPoint(-1.3F, -0.05F, 1.0F);
		gun170.addChild(gun172_r1);
		setRotationAngle(gun172_r1, 0.0F, -0.2618F, 0.0F);
		

		gun172_r2 = new ModelRenderer(this);
		gun172_r2.setRotationPoint(-1.3F, -0.05F, 0.0F);
		gun170.addChild(gun172_r2);
		setRotationAngle(gun172_r2, 0.0F, -0.9076F, 0.0F);
		

		gun264 = new ModelRenderer(this);
		gun264.setRotationPoint(-3.7F, -34.2F, -20.0F);
		upper.addChild(gun264);
		setRotationAngle(gun264, 0.0F, 0.0F, 0.1578F);
		gun264.cubeList.add(new ModelBox(gun264, 232, 167, -1.1234F, -2.9804F, -0.3F, 1, 3, 10, -0.3F, false));
		gun264.cubeList.add(new ModelBox(gun264, 168, 413, -0.9734F, -2.6804F, 0.5F, 1, 2, 3, -0.1F, false));
		gun264.cubeList.add(new ModelBox(gun264, 176, 413, -0.9734F, -2.6804F, 5.65F, 1, 2, 3, -0.1F, false));
		gun264.cubeList.add(new ModelBox(gun264, 426, 54, -1.1234F, -1.2804F, 4.05F, 1, 1, 1, -0.1F, false));
		gun264.cubeList.add(new ModelBox(gun264, 390, 414, -1.1244F, -1.6804F, 4.049F, 1, 1, 1, -0.1F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-2.3F, -44.1F, -39.75F);
		upper.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 242, 375, 0.75F, 2.35F, 17.051F, 1, 1, 22, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 288, 375, -0.15F, 2.349F, 17.05F, 1, 1, 22, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 300, 271, -0.201F, 2.999F, 17.05F, 2, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 194, 375, -0.2F, 3.0F, 17.75F, 2, 1, 22, 0.0F, false));

		rails = new ModelRenderer(this);
		rails.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(rails);
		rails.cubeList.add(new ModelBox(rails, 322, 222, -0.2F, 1.7F, 36.55F, 2, 1, 2, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 366, 398, -0.2F, 2.371F, 39.2922F, 2, 1, 2, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 294, 271, -0.2F, 1.7F, 35.35F, 2, 1, 1, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 306, 271, -0.2F, 1.7F, 34.15F, 2, 1, 1, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 312, 271, -0.2F, 1.7F, 32.95F, 2, 1, 1, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 318, 271, -0.2F, 1.7F, 31.75F, 2, 1, 1, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 324, 271, -0.2F, 1.7F, 30.55F, 2, 1, 1, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 348, 145, -0.2F, 1.7F, 29.35F, 2, 1, 1, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 150, 348, -0.2F, 1.7F, 28.15F, 2, 1, 1, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 354, 145, -0.2F, 1.7F, 26.95F, 2, 1, 1, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 408, 312, -0.2F, 1.7F, 25.75F, 2, 1, 1, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 410, 207, -0.2F, 1.7F, 24.55F, 2, 1, 1, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 422, 48, -0.2F, 1.7F, 23.35F, 2, 1, 1, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 416, 207, -0.2F, 1.7F, 22.15F, 2, 1, 1, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 418, 336, -0.2F, 1.7F, 20.95F, 2, 1, 1, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 418, 338, -0.2F, 1.7F, 19.75F, 2, 1, 1, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 418, 340, -0.2F, 1.7F, 18.55F, 2, 1, 1, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 418, 342, -0.2F, 1.7F, 17.35F, 2, 1, 1, -0.2F, false));

		rails_r1 = new ModelRenderer(this);
		rails_r1.setRotationPoint(0.8F, 2.5355F, 38.9211F);
		rails.addChild(rails_r1);
		setRotationAngle(rails_r1, -0.48F, 0.0F, 0.0F);
		rails_r1.cubeList.add(new ModelBox(rails_r1, 338, 50, -1.0F, -0.5F, -1.0F, 2, 1, 2, -0.2F, false));

		cube_r82 = new ModelRenderer(this);
		cube_r82.setRotationPoint(0.0F, -1.0F, 0.0F);
		rails.addChild(cube_r82);
		setRotationAngle(cube_r82, 0.0F, 0.0F, -0.7854F);
		cube_r82.cubeList.add(new ModelBox(cube_r82, 416, 230, -2.8506F, 1.8506F, 36.55F, 1, 1, 2, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 298, 56, -2.8506F, 1.8506F, 35.35F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 278, 305, -2.8506F, 1.8506F, 34.15F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 50, 307, -2.8506F, 1.8506F, 32.95F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 278, 307, -2.8506F, 1.8506F, 31.75F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 50, 309, -2.8506F, 1.8506F, 30.55F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 278, 309, -2.8506F, 1.8506F, 29.35F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 50, 311, -2.8506F, 1.8506F, 28.15F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 278, 311, -2.8506F, 1.8506F, 26.95F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 50, 313, -2.8506F, 1.8506F, 25.75F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 278, 313, -2.8506F, 1.8506F, 24.55F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 426, 120, -2.8506F, 1.8506F, 23.35F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 50, 315, -2.8506F, 1.8506F, 22.15F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 278, 315, -2.8506F, 1.8506F, 20.95F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 50, 317, -2.8506F, 1.8506F, 19.75F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 278, 317, -2.8506F, 1.8506F, 18.55F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 50, 319, -2.8506F, 1.8506F, 17.35F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 48, 377, -2.9996F, 1.8746F, 16.701F, 1, 1, 21, -0.35F, false));

		cube_r83 = new ModelRenderer(this);
		cube_r83.setRotationPoint(1.6F, -1.0F, 3.25F);
		rails.addChild(cube_r83);
		setRotationAngle(cube_r83, 0.0F, 0.0F, -0.7854F);
		cube_r83.cubeList.add(new ModelBox(cube_r83, 416, 233, -2.8506F, 1.8506F, 33.3F, 1, 1, 2, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 54, 300, -2.8506F, 1.8506F, 32.1F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 278, 319, -2.8506F, 1.8506F, 30.9F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 50, 321, -2.8506F, 1.8506F, 29.7F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 278, 321, -2.8506F, 1.8506F, 28.5F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 50, 323, -2.8506F, 1.8506F, 27.3F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 278, 323, -2.8506F, 1.8506F, 26.1F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 50, 325, -2.8506F, 1.8506F, 24.9F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 330, 271, -2.8506F, 1.8506F, 23.7F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 146, 353, -2.8506F, 1.8506F, 22.5F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 146, 355, -2.8506F, 1.8506F, 21.3F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 426, 122, -2.8506F, 1.8506F, 20.1F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 146, 357, -2.8506F, 1.8506F, 18.9F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 146, 359, -2.8506F, 1.8506F, 17.7F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 146, 361, -2.8506F, 1.8506F, 16.5F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 146, 363, -2.8506F, 1.8506F, 15.3F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 146, 365, -2.8506F, 1.8506F, 14.1F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 0, 378, -2.8746F, 1.9996F, 13.451F, 1, 1, 21, -0.35F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-3.1F, -37.8F, -6.0F);
		upper.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 140, 423, -0.5F, -0.7F, -15.0F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 144, 423, -1.325F, 0.4F, -15.0F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 346, 417, -1.325F, -0.6F, -4.9F, 2, 2, 1, -0.2F, false));

		gun140_r2 = new ModelRenderer(this);
		gun140_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(gun140_r2);
		setRotationAngle(gun140_r2, 0.0F, -0.2603F, 0.0F);
		gun140_r2.cubeList.add(new ModelBox(gun140_r2, 156, 302, -0.1397F, -0.7F, -0.4842F, 2, 1, 7, 0.0F, false));
		gun140_r2.cubeList.add(new ModelBox(gun140_r2, 156, 310, 0.0846F, -1.3243F, -0.2842F, 2, 1, 7, -0.2F, false));
		gun140_r2.cubeList.add(new ModelBox(gun140_r2, 348, 103, 0.0846F, -0.0757F, -0.2842F, 2, 1, 7, -0.2F, false));

		gun340_r3_r1 = new ModelRenderer(this);
		gun340_r3_r1.setRotationPoint(0.6381F, 5.6535F, 3.2158F);
		gun140_r2.addChild(gun340_r3_r1);
		setRotationAngle(gun340_r3_r1, 0.0F, 0.0F, 0.7854F);
		gun340_r3_r1.cubeList.add(new ModelBox(gun340_r3_r1, 164, 399, -4.5355F, -4.0355F, -3.5F, 1, 1, 7, -0.2F, false));

		gun240_r2_r1 = new ModelRenderer(this);
		gun240_r2_r1.setRotationPoint(0.6381F, 4.6535F, 3.2158F);
		gun140_r2.addChild(gun240_r2_r1);
		setRotationAngle(gun240_r2_r1, 0.0F, 0.0F, 0.7854F);
		gun240_r2_r1.cubeList.add(new ModelBox(gun240_r2_r1, 148, 399, -4.5355F, -4.0355F, -3.5F, 1, 1, 7, -0.2F, false));

		gun143_r2 = new ModelRenderer(this);
		gun143_r2.setRotationPoint(-1.6F, -0.2F, 6.5F);
		bone5.addChild(gun143_r2);
		setRotationAngle(gun143_r2, 0.0F, -0.2603F, 0.0F);
		gun143_r2.cubeList.add(new ModelBox(gun143_r2, 334, 417, -0.6287F, -1.0F, 0.9168F, 2, 2, 1, -0.4F, false));
		gun143_r2.cubeList.add(new ModelBox(gun143_r2, 340, 417, -0.1287F, -0.5F, -0.5832F, 1, 1, 2, 0.0F, false));

		gun264_r4 = new ModelRenderer(this);
		gun264_r4.setRotationPoint(-1.4F, 1.0F, -16.4F);
		bone5.addChild(gun264_r4);
		setRotationAngle(gun264_r4, 0.0F, 0.0F, -0.9295F);
		gun264_r4.cubeList.add(new ModelBox(gun264_r4, 380, 417, -0.0748F, -0.1002F, 5.95F, 1, 1, 2, -0.2F, false));
		gun264_r4.cubeList.add(new ModelBox(gun264_r4, 204, 167, -0.0748F, -0.1002F, 0.1F, 1, 1, 13, -0.3F, false));

		gun263_r4 = new ModelRenderer(this);
		gun263_r4.setRotationPoint(-0.7F, 0.3F, -15.0F);
		bone5.addChild(gun263_r4);
		setRotationAngle(gun263_r4, 0.0F, 0.0F, 0.4014F);
		gun263_r4.cubeList.add(new ModelBox(gun263_r4, 148, 423, -0.2306F, -2.2089F, -0.001F, 1, 1, 1, 0.0F, false));

		gun264_r3 = new ModelRenderer(this);
		gun264_r3.setRotationPoint(-0.22F, -0.82F, -15.0F);
		bone5.addChild(gun264_r3);
		setRotationAngle(gun264_r3, 0.0F, 0.0F, 0.8203F);
		gun264_r3.cubeList.add(new ModelBox(gun264_r3, 148, 136, -0.612F, -1.81F, 0.0F, 1, 1, 11, 0.0F, false));

		gun263_r3 = new ModelRenderer(this);
		gun263_r3.setRotationPoint(-1.2F, 0.4F, -15.0F);
		bone5.addChild(gun263_r3);
		setRotationAngle(gun263_r3, 0.0F, 0.0F, -0.3491F);
		gun263_r3.cubeList.add(new ModelBox(gun263_r3, 426, 58, -0.1174F, -0.0428F, -0.001F, 1, 1, 1, 0.0F, false));

		gun2 = new ModelRenderer(this);
		gun2.setRotationPoint(-0.4F, -1.45F, -4.3F);
		bone5.addChild(gun2);
		setRotationAngle(gun2, 0.0F, 0.0F, -0.0524F);
		

		gun170_r1 = new ModelRenderer(this);
		gun170_r1.setRotationPoint(0.5502F, 0.2491F, 0.2879F);
		gun2.addChild(gun170_r1);
		setRotationAngle(gun170_r1, 0.0F, 0.0F, 0.3054F);
		gun170_r1.cubeList.add(new ModelBox(gun170_r1, 414, 130, -1.9351F, -0.9808F, 0.5871F, 3, 2, 1, 0.0F, false));

		gun172_r3 = new ModelRenderer(this);
		gun172_r3.setRotationPoint(-1.3F, -0.05F, 1.0F);
		gun2.addChild(gun172_r3);
		setRotationAngle(gun172_r3, 0.0F, -0.2618F, 0.0F);
		

		gun172_r1_r1 = new ModelRenderer(this);
		gun172_r1_r1.setRotationPoint(1.6028F, 0.2991F, -1.1667F);
		gun172_r3.addChild(gun172_r1_r1);
		setRotationAngle(gun172_r1_r1, 0.0779F, -0.0116F, 0.2947F);
		gun172_r1_r1.cubeList.add(new ModelBox(gun172_r1_r1, 414, 133, -1.4584F, -0.9798F, 1.0339F, 3, 2, 1, 0.0F, false));

		gun172_r4 = new ModelRenderer(this);
		gun172_r4.setRotationPoint(-1.3F, -0.05F, 0.0F);
		gun2.addChild(gun172_r4);
		setRotationAngle(gun172_r4, 0.0F, -0.9076F, 0.0F);
		

		gun172_r2_r1 = new ModelRenderer(this);
		gun172_r2_r1.setRotationPoint(1.3659F, 0.2991F, -1.2807F);
		gun172_r4.addChild(gun172_r2_r1);
		setRotationAngle(gun172_r2_r1, 0.2393F, -0.0225F, 0.1862F);
		gun172_r2_r1.cubeList.add(new ModelBox(gun172_r2_r1, 150, 332, -0.7287F, -0.9798F, -0.1136F, 1, 2, 2, 0.0F, false));
		gun172_r2_r1.cubeList.add(new ModelBox(gun172_r2_r1, 54, 288, -0.3167F, -0.9798F, -0.1293F, 1, 2, 1, 0.0F, false));

		receiver13_r7 = new ModelRenderer(this);
		receiver13_r7.setRotationPoint(-0.5F, 0.3F, -5.7F);
		bone5.addChild(receiver13_r7);
		setRotationAngle(receiver13_r7, 0.0F, 0.0F, 0.4014F);
		receiver13_r7.cubeList.add(new ModelBox(receiver13_r7, 152, 423, -0.3907F, -1.9205F, -9.3F, 1, 1, 1, 0.0F, false));

		receiver14_r12 = new ModelRenderer(this);
		receiver14_r12.setRotationPoint(0.8F, -1.0F, -5.7F);
		bone5.addChild(receiver14_r12);
		setRotationAngle(receiver14_r12, 0.0F, 0.0F, -0.4014F);
		receiver14_r12.cubeList.add(new ModelBox(receiver14_r12, 156, 423, -0.6093F, -0.9205F, -9.299F, 1, 1, 1, 0.0F, false));
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