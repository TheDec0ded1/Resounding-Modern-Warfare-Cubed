package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M4Upper extends ModelBase {
	private final ModelRenderer upper;
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
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer bone8;
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

	public M4Upper() {
		textureWidth = 416;
		textureHeight = 416;

		upper = new ModelRenderer(this);
		upper.setRotationPoint(0.0F, 24.0F, 0.0F);
		upper.cubeList.add(new ModelBox(upper, 132, 387, -2.0F, -41.4F, -0.4F, 1, 1, 2, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 172, 386, -2.501F, -41.201F, -22.7F, 2, 1, 2, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 262, 96, -2.5F, -41.2F, -22.0F, 2, 1, 22, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 0, 388, -1.401F, -40.301F, -22.701F, 1, 1, 2, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 180, 386, -2.601F, -40.301F, -22.702F, 2, 1, 2, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 6, 388, -0.6F, -39.85F, -18.5F, 1, 1, 2, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 128, 392, -0.599F, -39.85F, -19.0F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 198, 157, -1.4F, -40.3F, -22.0F, 1, 1, 23, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 214, 50, -2.6F, -40.3F, -22.0F, 1, 1, 23, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 12, 393, -2.0F, -39.8F, -23.699F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 16, 393, -0.7F, -38.5F, -23.697F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 20, 393, -3.3F, -38.5F, -23.697F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 28, 393, -3.7F, -38.5F, 0.601F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 24, 393, -0.3F, -38.5F, 0.6F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 388, 365, -3.6F, -38.5F, -22.7F, 1, 1, 2, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 66, 208, -0.4F, -38.5F, -22.7F, 1, 1, 24, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 170, 364, -3.6F, -38.5F, -10.7F, 1, 1, 12, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 132, 392, -2.0F, -37.2F, -23.699F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 12, 388, -2.5F, -37.001F, -22.701F, 2, 2, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 148, 365, -0.6F, -37.1F, -21.201F, 1, 2, 10, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 116, 208, -0.8F, -37.0F, -22.698F, 1, 2, 23, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 42, 368, -3.4F, -37.1F, -20.201F, 1, 2, 10, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 0, 214, -3.2F, -37.0F, -22.699F, 1, 2, 23, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 258, 388, -0.45F, -36.4F, -16.5F, 1, 1, 2, 0.0F, false));

		gun263_r1 = new ModelRenderer(this);
		gun263_r1.setRotationPoint(-4.3F, -37.4F, -21.0F);
		upper.addChild(gun263_r1);
		setRotationAngle(gun263_r1, 0.0F, 0.0F, -0.3491F);
		

		gun263_r2 = new ModelRenderer(this);
		gun263_r2.setRotationPoint(-3.8F, -37.5F, -21.0F);
		upper.addChild(gun263_r2);
		setRotationAngle(gun263_r2, 0.0F, 0.0F, 0.4014F);
		

		gun264_r1 = new ModelRenderer(this);
		gun264_r1.setRotationPoint(-3.32F, -38.62F, -21.0F);
		upper.addChild(gun264_r1);
		setRotationAngle(gun264_r1, 0.0F, 0.0F, 0.8203F);
		

		gun264_r2 = new ModelRenderer(this);
		gun264_r2.setRotationPoint(-4.5F, -36.8F, -22.4F);
		upper.addChild(gun264_r2);
		setRotationAngle(gun264_r2, 0.0F, 0.0F, -0.9295F);
		gun264_r2.cubeList.add(new ModelBox(gun264_r2, 18, 388, -0.0748F, -0.1002F, 5.95F, 1, 1, 2, -0.2F, false));

		gun143_r1 = new ModelRenderer(this);
		gun143_r1.setRotationPoint(-4.7F, -38.0F, 0.5F);
		upper.addChild(gun143_r1);
		setRotationAngle(gun143_r1, 0.0F, -0.2603F, 0.0F);
		

		gun140_r1 = new ModelRenderer(this);
		gun140_r1.setRotationPoint(-3.1F, -37.8F, -6.0F);
		upper.addChild(gun140_r1);
		setRotationAngle(gun140_r1, 0.0F, -0.2603F, 0.0F);
		

		receiver18_r2 = new ModelRenderer(this);
		receiver18_r2.setRotationPoint(-2.6F, -39.25F, 1.0F);
		upper.addChild(receiver18_r2);
		setRotationAngle(receiver18_r2, 0.0F, 0.0F, -0.8029F);
		receiver18_r2.cubeList.add(new ModelBox(receiver18_r2, 136, 392, -0.1806F, -0.6946F, -0.4F, 1, 1, 1, 0.0F, false));

		receiver17_r5 = new ModelRenderer(this);
		receiver17_r5.setRotationPoint(-0.4F, -39.25F, 1.0F);
		upper.addChild(receiver17_r5);
		setRotationAngle(receiver17_r5, 0.0F, 0.0F, 0.8029F);
		receiver17_r5.cubeList.add(new ModelBox(receiver17_r5, 140, 392, -0.8194F, -0.6946F, -0.4F, 1, 1, 1, 0.0F, false));

		receiver14_r4 = new ModelRenderer(this);
		receiver14_r4.setRotationPoint(-3.6F, -37.5F, -11.7F);
		upper.addChild(receiver14_r4);
		setRotationAngle(receiver14_r4, 0.0F, 0.0F, -0.4014F);
		receiver14_r4.cubeList.add(new ModelBox(receiver14_r4, 354, 97, 0.0F, 0.0F, 1.001F, 1, 1, 12, 0.0F, false));
		receiver14_r4.cubeList.add(new ModelBox(receiver14_r4, 294, 168, -0.4F, -0.2F, -8.999F, 1, 2, 11, -0.4F, false));
		receiver14_r4.cubeList.add(new ModelBox(receiver14_r4, 24, 388, 0.0F, 0.0F, -10.998F, 1, 1, 2, 0.0F, false));

		receiver14_r5 = new ModelRenderer(this);
		receiver14_r5.setRotationPoint(-3.2F, -37.5F, -23.7F);
		upper.addChild(receiver14_r5);
		setRotationAngle(receiver14_r5, 0.0F, 0.0F, -0.4014F);
		receiver14_r5.cubeList.add(new ModelBox(receiver14_r5, 144, 392, -0.092F, -0.0391F, 0.003F, 1, 1, 1, 0.0F, false));

		receiver13_r1 = new ModelRenderer(this);
		receiver13_r1.setRotationPoint(0.2F, -37.5F, -23.7F);
		upper.addChild(receiver13_r1);
		setRotationAngle(receiver13_r1, 0.0F, 0.0F, 0.4014F);
		receiver13_r1.cubeList.add(new ModelBox(receiver13_r1, 148, 392, -0.908F, -0.0391F, 0.003F, 1, 1, 1, 0.0F, false));

		receiver12_r1 = new ModelRenderer(this);
		receiver12_r1.setRotationPoint(0.6F, -37.5F, -22.7F);
		upper.addChild(receiver12_r1);
		setRotationAngle(receiver12_r1, 0.0F, 0.0F, 0.4014F);
		receiver12_r1.cubeList.add(new ModelBox(receiver12_r1, 174, 181, -1.0F, 0.0F, 0.001F, 1, 1, 24, 0.0F, false));

		receiver15_r6 = new ModelRenderer(this);
		receiver15_r6.setRotationPoint(-3.7F, -37.5F, 0.6F);
		upper.addChild(receiver15_r6);
		setRotationAngle(receiver15_r6, -0.925F, 0.0F, -0.3142F);
		receiver15_r6.cubeList.add(new ModelBox(receiver15_r6, 132, 308, 0.001F, 0.3F, 0.5F, 1, 2, 1, 0.0F, false));

		receiver14_r6 = new ModelRenderer(this);
		receiver14_r6.setRotationPoint(0.7F, -37.5F, 0.6F);
		upper.addChild(receiver14_r6);
		setRotationAngle(receiver14_r6, -0.925F, 0.0F, 0.3142F);
		receiver14_r6.cubeList.add(new ModelBox(receiver14_r6, 132, 311, -0.999F, 0.3F, 0.5F, 1, 2, 1, 0.0F, false));

		receiver14_r7 = new ModelRenderer(this);
		receiver14_r7.setRotationPoint(-3.7F, -37.5F, 0.6F);
		upper.addChild(receiver14_r7);
		setRotationAngle(receiver14_r7, 0.0F, 0.0F, -0.3142F);
		receiver14_r7.cubeList.add(new ModelBox(receiver14_r7, 132, 314, 0.0F, 0.0F, 0.001F, 1, 2, 1, 0.0F, false));

		receiver13_r2 = new ModelRenderer(this);
		receiver13_r2.setRotationPoint(0.7F, -37.5F, 0.6F);
		upper.addChild(receiver13_r2);
		setRotationAngle(receiver13_r2, 0.0F, 0.0F, 0.3142F);
		receiver13_r2.cubeList.add(new ModelBox(receiver13_r2, 132, 317, -1.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		receiver13_r3 = new ModelRenderer(this);
		receiver13_r3.setRotationPoint(0.7F, -37.5F, 0.6F);
		upper.addChild(receiver13_r3);
		setRotationAngle(receiver13_r3, 0.0F, 0.0F, -0.4014F);
		receiver13_r3.cubeList.add(new ModelBox(receiver13_r3, 152, 392, -0.6083F, -2.1205F, 0.001F, 1, 1, 1, 0.0F, false));
		receiver13_r3.cubeList.add(new ModelBox(receiver13_r3, 156, 392, -0.6093F, -1.9205F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver14_r8 = new ModelRenderer(this);
		receiver14_r8.setRotationPoint(-3.7F, -37.5F, 0.6F);
		upper.addChild(receiver14_r8);
		setRotationAngle(receiver14_r8, 0.0F, 0.0F, 0.4014F);
		receiver14_r8.cubeList.add(new ModelBox(receiver14_r8, 172, 398, -0.3907F, -1.9205F, 0.0F, 1, 1, 1, 0.0F, false));
		receiver14_r8.cubeList.add(new ModelBox(receiver14_r8, 160, 392, -0.3917F, -2.1205F, 0.001F, 1, 1, 1, 0.0F, false));

		receiver14_r9 = new ModelRenderer(this);
		receiver14_r9.setRotationPoint(-2.3F, -38.8F, -11.7F);
		upper.addChild(receiver14_r9);
		setRotationAngle(receiver14_r9, 0.0F, 0.0F, -0.4014F);
		receiver14_r9.cubeList.add(new ModelBox(receiver14_r9, 282, 363, -0.6093F, -0.9205F, 1.001F, 1, 1, 12, 0.0F, false));
		receiver14_r9.cubeList.add(new ModelBox(receiver14_r9, 388, 131, -0.6093F, -0.9205F, -10.999F, 1, 1, 2, 0.0F, false));

		receiver15_r7 = new ModelRenderer(this);
		receiver15_r7.setRotationPoint(-1.9F, -36.2F, -23.7F);
		upper.addChild(receiver15_r7);
		setRotationAngle(receiver15_r7, 0.0F, 0.0F, 0.4014F);
		receiver15_r7.cubeList.add(new ModelBox(receiver15_r7, 164, 392, -1.092F, -0.9609F, 0.001F, 1, 1, 1, 0.0F, false));

		receiver14_r10 = new ModelRenderer(this);
		receiver14_r10.setRotationPoint(-1.1F, -36.2F, -23.7F);
		upper.addChild(receiver14_r10);
		setRotationAngle(receiver14_r10, 0.0F, 0.0F, -0.4014F);
		receiver14_r10.cubeList.add(new ModelBox(receiver14_r10, 168, 392, 0.0921F, -0.9609F, 0.001F, 1, 1, 1, 0.0F, false));

		receiver14_r11 = new ModelRenderer(this);
		receiver14_r11.setRotationPoint(-1.9F, -38.8F, -23.7F);
		upper.addChild(receiver14_r11);
		setRotationAngle(receiver14_r11, 0.0F, 0.0F, -0.4014F);
		receiver14_r11.cubeList.add(new ModelBox(receiver14_r11, 172, 392, -0.7013F, -0.9596F, 0.004F, 1, 1, 1, 0.0F, false));

		receiver13_r4 = new ModelRenderer(this);
		receiver13_r4.setRotationPoint(-1.1F, -38.8F, -23.7F);
		upper.addChild(receiver13_r4);
		setRotationAngle(receiver13_r4, 0.0F, 0.0F, 0.4014F);
		receiver13_r4.cubeList.add(new ModelBox(receiver13_r4, 176, 392, -0.2987F, -0.9596F, 0.004F, 1, 1, 1, 0.0F, false));

		receiver12_r2 = new ModelRenderer(this);
		receiver12_r2.setRotationPoint(-0.7F, -38.8F, -22.7F);
		upper.addChild(receiver12_r2);
		setRotationAngle(receiver12_r2, 0.0F, 0.0F, 0.4014F);
		receiver12_r2.cubeList.add(new ModelBox(receiver12_r2, 198, 132, -0.3907F, -0.9205F, 0.001F, 1, 1, 24, 0.0F, false));

		receiver13_r5 = new ModelRenderer(this);
		receiver13_r5.setRotationPoint(-3.6F, -37.5F, -11.7F);
		upper.addChild(receiver13_r5);
		setRotationAngle(receiver13_r5, 0.0F, 0.0F, 0.4014F);
		receiver13_r5.cubeList.add(new ModelBox(receiver13_r5, 308, 363, -0.3907F, -1.9205F, 1.0F, 1, 1, 12, 0.0F, false));
		receiver13_r5.cubeList.add(new ModelBox(receiver13_r5, 388, 134, -0.3907F, -1.9205F, -11.0F, 1, 1, 2, 0.0F, false));

		receiver13_r6 = new ModelRenderer(this);
		receiver13_r6.setRotationPoint(-3.2F, -37.5F, -23.7F);
		upper.addChild(receiver13_r6);
		setRotationAngle(receiver13_r6, 0.0F, 0.0F, 0.4014F);
		receiver13_r6.cubeList.add(new ModelBox(receiver13_r6, 180, 392, -0.4828F, -1.8814F, 0.003F, 1, 1, 1, 0.0F, false));

		receiver12_r3 = new ModelRenderer(this);
		receiver12_r3.setRotationPoint(0.2F, -37.5F, -23.7F);
		upper.addChild(receiver12_r3);
		setRotationAngle(receiver12_r3, 0.0F, 0.0F, -0.4014F);
		receiver12_r3.cubeList.add(new ModelBox(receiver12_r3, 184, 392, -0.5172F, -1.8814F, 0.003F, 1, 1, 1, 0.0F, false));

		receiver11_r1 = new ModelRenderer(this);
		receiver11_r1.setRotationPoint(0.6F, -37.5F, -22.7F);
		upper.addChild(receiver11_r1);
		setRotationAngle(receiver11_r1, 0.0F, 0.0F, -0.4014F);
		receiver11_r1.cubeList.add(new ModelBox(receiver11_r1, 174, 206, -0.6093F, -1.9205F, 0.0F, 1, 1, 24, 0.0F, false));

		receiver16_r7 = new ModelRenderer(this);
		receiver16_r7.setRotationPoint(0.4F, -38.85F, -19.0F);
		upper.addChild(receiver16_r7);
		setRotationAngle(receiver16_r7, 0.0F, 0.0F, 1.9705F);
		receiver16_r7.cubeList.add(new ModelBox(receiver16_r7, 188, 392, -0.9202F, 0.3892F, 0.0F, 1, 1, 1, 0.0F, false));
		receiver16_r7.cubeList.add(new ModelBox(receiver16_r7, 388, 158, -0.9212F, 0.3892F, 0.5F, 1, 1, 2, 0.0F, false));

		receiver18_r3 = new ModelRenderer(this);
		receiver18_r3.setRotationPoint(0.4F, -38.85F, -19.0F);
		upper.addChild(receiver18_r3);
		setRotationAngle(receiver18_r3, 0.0F, -1.9333F, 0.0F);
		receiver18_r3.cubeList.add(new ModelBox(receiver18_r3, 132, 320, 0.0F, -1.0F, 0.0F, 1, 2, 1, 0.0F, false));

		receiver17_r6 = new ModelRenderer(this);
		receiver17_r6.setRotationPoint(0.4F, -38.85F, -16.5F);
		upper.addChild(receiver17_r6);
		setRotationAngle(receiver17_r6, 0.0F, 1.9333F, 0.0F);
		receiver17_r6.cubeList.add(new ModelBox(receiver17_r6, 128, 326, 0.0F, -1.0F, -1.0F, 1, 2, 1, 0.0F, false));

		gun125_r1 = new ModelRenderer(this);
		gun125_r1.setRotationPoint(-2.5F, -40.1F, -1.0F);
		upper.addChild(gun125_r1);
		setRotationAngle(gun125_r1, -0.632F, 0.0F, 0.0F);
		gun125_r1.cubeList.add(new ModelBox(gun125_r1, 188, 386, -0.001F, -1.3976F, 0.2161F, 2, 1, 2, 0.0F, false));

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
		gun264.cubeList.add(new ModelBox(gun264, 126, 365, -1.1234F, -2.9804F, -0.3F, 1, 3, 10, -0.3F, false));
		gun264.cubeList.add(new ModelBox(gun264, 80, 382, -0.9734F, -2.6804F, 0.5F, 1, 2, 3, -0.1F, false));
		gun264.cubeList.add(new ModelBox(gun264, 88, 382, -0.9734F, -2.6804F, 5.65F, 1, 2, 3, -0.1F, false));
		gun264.cubeList.add(new ModelBox(gun264, 398, 172, -1.1234F, -1.2804F, 4.05F, 1, 1, 1, -0.1F, false));
		gun264.cubeList.add(new ModelBox(gun264, 192, 392, -1.1244F, -1.6804F, 4.049F, 1, 1, 1, -0.1F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-1.5237F, -41.3381F, -13.7868F);
		upper.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 128, 390, -0.9737F, -0.5632F, -7.9132F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 390, 128, -0.9737F, -0.5632F, -9.1132F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 134, 390, -0.9737F, -0.5632F, -6.6632F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 390, 137, -0.9737F, -0.5632F, -5.4132F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 390, 139, -0.9737F, -0.5632F, -4.1632F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 140, 390, -0.9737F, -0.5632F, -2.9132F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 390, 141, -0.9737F, -0.5632F, -1.6632F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 390, 143, -0.9737F, -0.5632F, 0.8368F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 390, 145, -0.9737F, -0.5632F, -0.4132F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 390, 147, -0.9737F, -0.5632F, 3.3368F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 390, 149, -0.9737F, -0.5632F, 2.0868F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 390, 151, -0.9737F, -0.5632F, 5.8368F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 390, 153, -0.9737F, -0.5632F, 4.5868F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 390, 155, -0.9737F, -0.5632F, 8.3368F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 390, 255, -0.9737F, -0.5632F, 9.5368F, 2, 1, 1, -0.198F, false));
		bone3.cubeList.add(new ModelBox(bone3, 390, 259, -0.9737F, -0.5632F, 11.9868F, 2, 1, 1, -0.198F, false));
		bone3.cubeList.add(new ModelBox(bone3, 392, 35, -0.9737F, -0.5632F, 10.7868F, 2, 1, 1, -0.198F, false));
		bone3.cubeList.add(new ModelBox(bone3, 228, 386, -0.9737F, -0.5632F, 13.1368F, 2, 1, 2, -0.198F, false));
		bone3.cubeList.add(new ModelBox(bone3, 390, 257, -0.9737F, -0.5632F, 7.0868F, 2, 1, 1, -0.199F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-14.7737F, -0.3632F, -12.4632F);
		bone3.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.8901F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 214, 74, 8.5605F, -10.93F, 3.6F, 1, 1, 23, -0.35F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 116, 394, 8.6105F, -11.08F, 19.55F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 120, 394, 8.6105F, -11.08F, 22.0F, 1, 1, 1, -0.197F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 394, 207, 8.6105F, -11.08F, 24.45F, 1, 1, 1, -0.197F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 396, 99, 8.6105F, -11.08F, 23.25F, 1, 1, 1, -0.197F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 160, 389, 8.6105F, -11.08F, 25.6F, 1, 1, 2, -0.197F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 124, 394, 8.6105F, -11.08F, 20.8F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 128, 394, 8.6105F, -11.08F, 17.05F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 394, 130, 8.6105F, -11.08F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 132, 394, 8.6105F, -11.08F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 394, 132, 8.6105F, -11.08F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 394, 134, 8.6105F, -11.08F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 136, 394, 8.6105F, -11.08F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 140, 394, 8.6105F, -11.08F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 144, 394, 8.6105F, -11.08F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 148, 394, 8.6105F, -11.08F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 152, 394, 8.6105F, -11.08F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 156, 394, 8.6105F, -11.08F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 394, 157, 8.6105F, -11.08F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 394, 159, 8.6105F, -11.08F, 3.35F, 1, 1, 1, -0.198F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-13.1737F, -0.3632F, -12.4632F);
		bone3.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.8901F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 214, 98, 8.0605F, 10.83F, 3.8F, 1, 1, 23, -0.35F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 160, 394, 8.0105F, 10.68F, 19.55F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 164, 394, 8.0105F, 10.68F, 22.0F, 1, 1, 1, -0.197F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 208, 394, 8.0105F, 10.68F, 24.45F, 1, 1, 1, -0.197F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 396, 97, 8.0105F, 10.68F, 23.25F, 1, 1, 1, -0.197F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 154, 389, 8.0105F, 10.68F, 25.6F, 1, 1, 2, -0.197F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 168, 394, 8.0105F, 10.68F, 20.8F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 172, 394, 8.0105F, 10.68F, 17.05F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 176, 394, 8.0105F, 10.68F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 180, 394, 8.0105F, 10.68F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 184, 394, 8.0105F, 10.68F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 188, 394, 8.0105F, 10.68F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 192, 394, 8.0105F, 10.68F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 196, 394, 8.0105F, 10.68F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 394, 199, 8.0105F, 10.68F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 200, 394, 8.0105F, 10.68F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 394, 201, 8.0105F, 10.68F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 394, 203, 8.0105F, 10.68F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 204, 394, 8.0105F, 10.68F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 394, 205, 8.0105F, 10.68F, 3.35F, 1, 1, 1, -0.198F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-3.1F, -37.8F, -6.0F);
		upper.addChild(bone8);
		bone8.cubeList.add(new ModelBox(bone8, 396, 101, -0.5F, -0.7F, -15.0F, 1, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 396, 103, -1.325F, 0.4F, -15.0F, 1, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 178, 389, -1.325F, -0.6F, -4.9F, 2, 2, 1, -0.2F, false));

		gun140_r2 = new ModelRenderer(this);
		gun140_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone8.addChild(gun140_r2);
		setRotationAngle(gun140_r2, 0.0F, -0.2603F, 0.0F);
		gun140_r2.cubeList.add(new ModelBox(gun140_r2, 192, 255, -0.1397F, -0.7F, -0.4842F, 2, 1, 7, 0.0F, false));
		gun140_r2.cubeList.add(new ModelBox(gun140_r2, 192, 263, 0.0846F, -1.3243F, -0.2842F, 2, 1, 7, -0.2F, false));
		gun140_r2.cubeList.add(new ModelBox(gun140_r2, 308, 269, 0.0846F, -0.0757F, -0.2842F, 2, 1, 7, -0.2F, false));

		gun340_r3_r1 = new ModelRenderer(this);
		gun340_r3_r1.setRotationPoint(0.6381F, 5.6535F, 3.2158F);
		gun140_r2.addChild(gun340_r3_r1);
		setRotationAngle(gun340_r3_r1, 0.0F, 0.0F, 0.7854F);
		gun340_r3_r1.cubeList.add(new ModelBox(gun340_r3_r1, 370, 277, -4.5355F, -4.0355F, -3.5F, 1, 1, 7, -0.2F, false));

		gun240_r2_r1 = new ModelRenderer(this);
		gun240_r2_r1.setRotationPoint(0.6381F, 4.6535F, 3.2158F);
		gun140_r2.addChild(gun240_r2_r1);
		setRotationAngle(gun240_r2_r1, 0.0F, 0.0F, 0.7854F);
		gun240_r2_r1.cubeList.add(new ModelBox(gun240_r2_r1, 370, 269, -4.5355F, -4.0355F, -3.5F, 1, 1, 7, -0.2F, false));

		gun143_r2 = new ModelRenderer(this);
		gun143_r2.setRotationPoint(-1.6F, -0.2F, 6.5F);
		bone8.addChild(gun143_r2);
		setRotationAngle(gun143_r2, 0.0F, -0.2603F, 0.0F);
		gun143_r2.cubeList.add(new ModelBox(gun143_r2, 166, 389, -0.6287F, -1.0F, 0.9168F, 2, 2, 1, -0.4F, false));
		gun143_r2.cubeList.add(new ModelBox(gun143_r2, 172, 389, -0.1287F, -0.5F, -0.5832F, 1, 1, 2, 0.0F, false));

		gun264_r4 = new ModelRenderer(this);
		gun264_r4.setRotationPoint(-1.4F, 1.0F, -16.4F);
		bone8.addChild(gun264_r4);
		setRotationAngle(gun264_r4, 0.0F, 0.0F, -0.9295F);
		gun264_r4.cubeList.add(new ModelBox(gun264_r4, 184, 389, -0.0748F, -0.1002F, 5.95F, 1, 1, 2, -0.2F, false));
		gun264_r4.cubeList.add(new ModelBox(gun264_r4, 352, 255, -0.0748F, -0.1002F, 0.1F, 1, 1, 13, -0.3F, false));

		gun263_r4 = new ModelRenderer(this);
		gun263_r4.setRotationPoint(-0.7F, 0.3F, -15.0F);
		bone8.addChild(gun263_r4);
		setRotationAngle(gun263_r4, 0.0F, 0.0F, 0.4014F);
		gun263_r4.cubeList.add(new ModelBox(gun263_r4, 104, 396, -0.2306F, -2.2089F, -0.001F, 1, 1, 1, 0.0F, false));

		gun264_r3 = new ModelRenderer(this);
		gun264_r3.setRotationPoint(-0.22F, -0.82F, -15.0F);
		bone8.addChild(gun264_r3);
		setRotationAngle(gun264_r3, 0.0F, 0.0F, 0.8203F);
		gun264_r3.cubeList.add(new ModelBox(gun264_r3, 364, 302, -0.612F, -1.81F, 0.0F, 1, 1, 11, 0.0F, false));

		gun263_r3 = new ModelRenderer(this);
		gun263_r3.setRotationPoint(-1.2F, 0.4F, -15.0F);
		bone8.addChild(gun263_r3);
		setRotationAngle(gun263_r3, 0.0F, 0.0F, -0.3491F);
		gun263_r3.cubeList.add(new ModelBox(gun263_r3, 398, 174, -0.1174F, -0.0428F, -0.001F, 1, 1, 1, 0.0F, false));

		gun2 = new ModelRenderer(this);
		gun2.setRotationPoint(-0.4F, -1.45F, -4.3F);
		bone8.addChild(gun2);
		setRotationAngle(gun2, 0.0F, 0.0F, -0.0524F);
		

		gun170_r1 = new ModelRenderer(this);
		gun170_r1.setRotationPoint(0.5502F, 0.2491F, 0.2879F);
		gun2.addChild(gun170_r1);
		setRotationAngle(gun170_r1, 0.0F, 0.0F, 0.3054F);
		gun170_r1.cubeList.add(new ModelBox(gun170_r1, 236, 386, -1.9351F, -0.9808F, 0.5871F, 3, 2, 1, 0.0F, false));

		gun172_r3 = new ModelRenderer(this);
		gun172_r3.setRotationPoint(-1.3F, -0.05F, 1.0F);
		gun2.addChild(gun172_r3);
		setRotationAngle(gun172_r3, 0.0F, -0.2618F, 0.0F);
		

		gun172_r1_r1 = new ModelRenderer(this);
		gun172_r1_r1.setRotationPoint(1.6028F, 0.2991F, -1.1667F);
		gun172_r3.addChild(gun172_r1_r1);
		setRotationAngle(gun172_r1_r1, 0.0779F, -0.0116F, 0.2947F);
		gun172_r1_r1.cubeList.add(new ModelBox(gun172_r1_r1, 244, 386, -1.4584F, -0.9798F, 1.0339F, 3, 2, 1, 0.0F, false));

		gun172_r4 = new ModelRenderer(this);
		gun172_r4.setRotationPoint(-1.3F, -0.05F, 0.0F);
		gun2.addChild(gun172_r4);
		setRotationAngle(gun172_r4, 0.0F, -0.9076F, 0.0F);
		

		gun172_r2_r1 = new ModelRenderer(this);
		gun172_r2_r1.setRotationPoint(1.3659F, 0.2991F, -1.2807F);
		gun172_r4.addChild(gun172_r2_r1);
		setRotationAngle(gun172_r2_r1, 0.2393F, -0.0225F, 0.1862F);
		gun172_r2_r1.cubeList.add(new ModelBox(gun172_r2_r1, 336, 386, -0.7287F, -0.9798F, -0.1136F, 1, 2, 2, 0.0F, false));
		gun172_r2_r1.cubeList.add(new ModelBox(gun172_r2_r1, 170, 344, -0.3167F, -0.9798F, -0.1293F, 1, 2, 1, 0.0F, false));

		receiver13_r7 = new ModelRenderer(this);
		receiver13_r7.setRotationPoint(-0.5F, 0.3F, -5.7F);
		bone8.addChild(receiver13_r7);
		setRotationAngle(receiver13_r7, 0.0F, 0.0F, 0.4014F);
		receiver13_r7.cubeList.add(new ModelBox(receiver13_r7, 396, 105, -0.3907F, -1.9205F, -9.3F, 1, 1, 1, 0.0F, false));

		receiver14_r12 = new ModelRenderer(this);
		receiver14_r12.setRotationPoint(0.8F, -1.0F, -5.7F);
		bone8.addChild(receiver14_r12);
		setRotationAngle(receiver14_r12, 0.0F, 0.0F, -0.4014F);
		receiver14_r12.cubeList.add(new ModelBox(receiver14_r12, 396, 107, -0.6093F, -0.9205F, -9.299F, 1, 1, 1, 0.0F, false));
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