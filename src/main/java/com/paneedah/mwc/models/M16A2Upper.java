package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M16A2Upper extends ModelBase {
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
	private final ModelRenderer bone;
	private final ModelRenderer bone10_r1;
	private final ModelRenderer bone8_r1;
	private final ModelRenderer carryhandle2;
	private final ModelRenderer bone2;
	private final ModelRenderer bone28_r2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bone6;
	private final ModelRenderer bone35_r2;
	private final ModelRenderer bone36_r2;
	private final ModelRenderer bone35_r3;
	private final ModelRenderer bone34_r2;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer bone10;
	private final ModelRenderer bone11;
	private final ModelRenderer bone12;
	private final ModelRenderer bone13;
	private final ModelRenderer bone15;
	private final ModelRenderer bone16;
	private final ModelRenderer bone23;
	private final ModelRenderer bone24;
	private final ModelRenderer bone29;
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

	public M16A2Upper() {
		textureWidth = 464;
		textureHeight = 464;

		upper = new ModelRenderer(this);
		upper.setRotationPoint(0.0F, 24.0F, 0.0F);
		upper.cubeList.add(new ModelBox(upper, 108, 437, -2.0F, -41.325F, 0.05F, 1, 1, 2, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 156, 444, -1.401F, -40.301F, -22.701F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 228, 438, -2.601F, -40.301F, -22.702F, 2, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 300, 437, -0.6F, -39.85F, -18.5F, 1, 1, 2, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 160, 444, -0.599F, -39.85F, -19.0F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 326, 375, -1.4F, -40.3F, -22.0F, 1, 1, 23, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 374, 375, -2.6F, -40.3F, -22.0F, 1, 1, 23, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 164, 444, -2.0F, -39.8F, -23.699F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 168, 444, -0.7F, -38.5F, -23.697F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 172, 444, -3.3F, -38.5F, -23.697F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 176, 444, -3.7F, -38.5F, 0.601F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 180, 444, -0.3F, -38.5F, 0.6F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 306, 437, -3.6F, -38.5F, -22.7F, 1, 1, 2, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 356, 311, -0.4F, -38.5F, -22.7F, 1, 1, 24, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 122, 336, -3.6F, -38.5F, -10.7F, 1, 1, 12, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 184, 444, -2.0F, -37.2F, -23.699F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 312, 437, -2.5F, -37.001F, -22.701F, 2, 2, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 420, 216, -0.6F, -37.1F, -21.201F, 1, 2, 10, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 358, 278, -0.8F, -37.0F, -22.698F, 1, 2, 23, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 428, 102, -3.4F, -37.1F, -20.201F, 1, 2, 10, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 278, 375, -3.2F, -37.0F, -22.699F, 1, 2, 23, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 342, 437, -0.45F, -36.4F, -16.5F, 1, 1, 2, 0.0F, false));

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
		receiver18_r2.cubeList.add(new ModelBox(receiver18_r2, 188, 444, -0.1806F, -0.6946F, -0.4F, 1, 1, 1, 0.0F, false));

		receiver17_r5 = new ModelRenderer(this);
		receiver17_r5.setRotationPoint(-0.4F, -39.25F, 1.0F);
		upper.addChild(receiver17_r5);
		setRotationAngle(receiver17_r5, 0.0F, 0.0F, 0.8029F);
		receiver17_r5.cubeList.add(new ModelBox(receiver17_r5, 192, 444, -0.8194F, -0.6946F, -0.4F, 1, 1, 1, 0.0F, false));

		receiver14_r4 = new ModelRenderer(this);
		receiver14_r4.setRotationPoint(-3.6F, -37.5F, -11.7F);
		upper.addChild(receiver14_r4);
		setRotationAngle(receiver14_r4, 0.0F, 0.0F, -0.4014F);
		receiver14_r4.cubeList.add(new ModelBox(receiver14_r4, 408, 264, 0.0F, 0.0F, 1.001F, 1, 1, 12, 0.0F, false));
		receiver14_r4.cubeList.add(new ModelBox(receiver14_r4, 302, 400, -0.4F, -0.2F, -8.999F, 1, 2, 11, -0.4F, false));
		receiver14_r4.cubeList.add(new ModelBox(receiver14_r4, 318, 437, 0.0F, 0.0F, -10.998F, 1, 1, 2, 0.0F, false));

		receiver14_r5 = new ModelRenderer(this);
		receiver14_r5.setRotationPoint(-3.2F, -37.5F, -23.7F);
		upper.addChild(receiver14_r5);
		setRotationAngle(receiver14_r5, 0.0F, 0.0F, -0.4014F);
		receiver14_r5.cubeList.add(new ModelBox(receiver14_r5, 196, 444, -0.092F, -0.0391F, 0.003F, 1, 1, 1, 0.0F, false));

		receiver13_r1 = new ModelRenderer(this);
		receiver13_r1.setRotationPoint(0.2F, -37.5F, -23.7F);
		upper.addChild(receiver13_r1);
		setRotationAngle(receiver13_r1, 0.0F, 0.0F, 0.4014F);
		receiver13_r1.cubeList.add(new ModelBox(receiver13_r1, 200, 444, -0.908F, -0.0391F, 0.003F, 1, 1, 1, 0.0F, false));

		receiver12_r1 = new ModelRenderer(this);
		receiver12_r1.setRotationPoint(0.6F, -37.5F, -22.7F);
		upper.addChild(receiver12_r1);
		setRotationAngle(receiver12_r1, 0.0F, 0.0F, 0.4014F);
		receiver12_r1.cubeList.add(new ModelBox(receiver12_r1, 0, 358, -1.0F, 0.0F, 0.001F, 1, 1, 24, 0.0F, false));

		receiver15_r6 = new ModelRenderer(this);
		receiver15_r6.setRotationPoint(-3.7F, -37.5F, 0.6F);
		upper.addChild(receiver15_r6);
		setRotationAngle(receiver15_r6, -0.925F, 0.0F, -0.3142F);
		receiver15_r6.cubeList.add(new ModelBox(receiver15_r6, 52, 440, 0.001F, 0.3F, 0.5F, 1, 2, 1, 0.0F, false));

		receiver14_r6 = new ModelRenderer(this);
		receiver14_r6.setRotationPoint(0.7F, -37.5F, 0.6F);
		upper.addChild(receiver14_r6);
		setRotationAngle(receiver14_r6, -0.925F, 0.0F, 0.3142F);
		receiver14_r6.cubeList.add(new ModelBox(receiver14_r6, 56, 440, -0.999F, 0.3F, 0.5F, 1, 2, 1, 0.0F, false));

		receiver14_r7 = new ModelRenderer(this);
		receiver14_r7.setRotationPoint(-3.7F, -37.5F, 0.6F);
		upper.addChild(receiver14_r7);
		setRotationAngle(receiver14_r7, 0.0F, 0.0F, -0.3142F);
		receiver14_r7.cubeList.add(new ModelBox(receiver14_r7, 60, 440, 0.0F, 0.0F, 0.001F, 1, 2, 1, 0.0F, false));

		receiver13_r2 = new ModelRenderer(this);
		receiver13_r2.setRotationPoint(0.7F, -37.5F, 0.6F);
		upper.addChild(receiver13_r2);
		setRotationAngle(receiver13_r2, 0.0F, 0.0F, 0.3142F);
		receiver13_r2.cubeList.add(new ModelBox(receiver13_r2, 64, 440, -1.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		receiver13_r3 = new ModelRenderer(this);
		receiver13_r3.setRotationPoint(0.7F, -37.5F, 0.6F);
		upper.addChild(receiver13_r3);
		setRotationAngle(receiver13_r3, 0.0F, 0.0F, -0.4014F);
		receiver13_r3.cubeList.add(new ModelBox(receiver13_r3, 204, 444, -0.6083F, -2.1205F, 0.001F, 1, 1, 1, 0.0F, false));
		receiver13_r3.cubeList.add(new ModelBox(receiver13_r3, 208, 444, -0.6093F, -1.9205F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver14_r8 = new ModelRenderer(this);
		receiver14_r8.setRotationPoint(-3.7F, -37.5F, 0.6F);
		upper.addChild(receiver14_r8);
		setRotationAngle(receiver14_r8, 0.0F, 0.0F, 0.4014F);
		receiver14_r8.cubeList.add(new ModelBox(receiver14_r8, 444, 246, -0.3907F, -1.9205F, 0.0F, 1, 1, 1, 0.0F, false));
		receiver14_r8.cubeList.add(new ModelBox(receiver14_r8, 212, 444, -0.3917F, -2.1205F, 0.001F, 1, 1, 1, 0.0F, false));

		receiver14_r9 = new ModelRenderer(this);
		receiver14_r9.setRotationPoint(-2.3F, -38.8F, -11.7F);
		upper.addChild(receiver14_r9);
		setRotationAngle(receiver14_r9, 0.0F, 0.0F, -0.4014F);
		receiver14_r9.cubeList.add(new ModelBox(receiver14_r9, 424, 68, -0.6093F, -0.9205F, 1.001F, 1, 1, 12, 0.0F, false));
		receiver14_r9.cubeList.add(new ModelBox(receiver14_r9, 324, 437, -0.6093F, -0.9205F, -10.999F, 1, 1, 2, 0.0F, false));

		receiver15_r7 = new ModelRenderer(this);
		receiver15_r7.setRotationPoint(-1.9F, -36.2F, -23.7F);
		upper.addChild(receiver15_r7);
		setRotationAngle(receiver15_r7, 0.0F, 0.0F, 0.4014F);
		receiver15_r7.cubeList.add(new ModelBox(receiver15_r7, 216, 444, -1.092F, -0.9609F, 0.001F, 1, 1, 1, 0.0F, false));

		receiver14_r10 = new ModelRenderer(this);
		receiver14_r10.setRotationPoint(-1.1F, -36.2F, -23.7F);
		upper.addChild(receiver14_r10);
		setRotationAngle(receiver14_r10, 0.0F, 0.0F, -0.4014F);
		receiver14_r10.cubeList.add(new ModelBox(receiver14_r10, 220, 444, 0.0921F, -0.9609F, 0.001F, 1, 1, 1, 0.0F, false));

		receiver14_r11 = new ModelRenderer(this);
		receiver14_r11.setRotationPoint(-1.9F, -38.8F, -23.7F);
		upper.addChild(receiver14_r11);
		setRotationAngle(receiver14_r11, 0.0F, 0.0F, -0.4014F);
		receiver14_r11.cubeList.add(new ModelBox(receiver14_r11, 224, 444, -0.7013F, -0.9596F, 0.004F, 1, 1, 1, 0.0F, false));

		receiver13_r4 = new ModelRenderer(this);
		receiver13_r4.setRotationPoint(-1.1F, -38.8F, -23.7F);
		upper.addChild(receiver13_r4);
		setRotationAngle(receiver13_r4, 0.0F, 0.0F, 0.4014F);
		receiver13_r4.cubeList.add(new ModelBox(receiver13_r4, 228, 444, -0.2987F, -0.9596F, 0.004F, 1, 1, 1, 0.0F, false));

		receiver12_r2 = new ModelRenderer(this);
		receiver12_r2.setRotationPoint(-0.7F, -38.8F, -22.7F);
		upper.addChild(receiver12_r2);
		setRotationAngle(receiver12_r2, 0.0F, 0.0F, 0.4014F);
		receiver12_r2.cubeList.add(new ModelBox(receiver12_r2, 358, 228, -0.3907F, -0.9205F, 0.001F, 1, 1, 24, 0.0F, false));

		receiver13_r5 = new ModelRenderer(this);
		receiver13_r5.setRotationPoint(-3.6F, -37.5F, -11.7F);
		upper.addChild(receiver13_r5);
		setRotationAngle(receiver13_r5, 0.0F, 0.0F, 0.4014F);
		receiver13_r5.cubeList.add(new ModelBox(receiver13_r5, 424, 129, -0.3907F, -1.9205F, 1.0F, 1, 1, 12, 0.0F, false));
		receiver13_r5.cubeList.add(new ModelBox(receiver13_r5, 330, 437, -0.3907F, -1.9205F, -11.0F, 1, 1, 2, 0.0F, false));

		receiver13_r6 = new ModelRenderer(this);
		receiver13_r6.setRotationPoint(-3.2F, -37.5F, -23.7F);
		upper.addChild(receiver13_r6);
		setRotationAngle(receiver13_r6, 0.0F, 0.0F, 0.4014F);
		receiver13_r6.cubeList.add(new ModelBox(receiver13_r6, 444, 228, -0.4828F, -1.8814F, 0.003F, 1, 1, 1, 0.0F, false));

		receiver12_r3 = new ModelRenderer(this);
		receiver12_r3.setRotationPoint(0.2F, -37.5F, -23.7F);
		upper.addChild(receiver12_r3);
		setRotationAngle(receiver12_r3, 0.0F, 0.0F, -0.4014F);
		receiver12_r3.cubeList.add(new ModelBox(receiver12_r3, 444, 230, -0.5172F, -1.8814F, 0.003F, 1, 1, 1, 0.0F, false));

		receiver11_r1 = new ModelRenderer(this);
		receiver11_r1.setRotationPoint(0.6F, -37.5F, -22.7F);
		upper.addChild(receiver11_r1);
		setRotationAngle(receiver11_r1, 0.0F, 0.0F, -0.4014F);
		receiver11_r1.cubeList.add(new ModelBox(receiver11_r1, 358, 253, -0.6093F, -1.9205F, 0.0F, 1, 1, 24, 0.0F, false));

		receiver16_r7 = new ModelRenderer(this);
		receiver16_r7.setRotationPoint(0.4F, -38.85F, -19.0F);
		upper.addChild(receiver16_r7);
		setRotationAngle(receiver16_r7, 0.0F, 0.0F, 1.9705F);
		receiver16_r7.cubeList.add(new ModelBox(receiver16_r7, 232, 444, -0.9202F, 0.3892F, 0.0F, 1, 1, 1, 0.0F, false));
		receiver16_r7.cubeList.add(new ModelBox(receiver16_r7, 336, 437, -0.9212F, 0.3892F, 0.5F, 1, 1, 2, 0.0F, false));

		receiver18_r3 = new ModelRenderer(this);
		receiver18_r3.setRotationPoint(0.4F, -38.85F, -19.0F);
		upper.addChild(receiver18_r3);
		setRotationAngle(receiver18_r3, 0.0F, -1.9333F, 0.0F);
		receiver18_r3.cubeList.add(new ModelBox(receiver18_r3, 440, 81, 0.0F, -1.0F, 0.0F, 1, 2, 1, 0.0F, false));

		receiver17_r6 = new ModelRenderer(this);
		receiver17_r6.setRotationPoint(0.4F, -38.85F, -16.5F);
		upper.addChild(receiver17_r6);
		setRotationAngle(receiver17_r6, 0.0F, 1.9333F, 0.0F);
		receiver17_r6.cubeList.add(new ModelBox(receiver17_r6, 82, 440, 0.0F, -1.0F, -1.0F, 1, 2, 1, 0.0F, false));

		gun125_r1 = new ModelRenderer(this);
		gun125_r1.setRotationPoint(-2.5F, -40.1F, -1.0F);
		upper.addChild(gun125_r1);
		setRotationAngle(gun125_r1, -0.632F, 0.0F, 0.0F);
		

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
		gun264.cubeList.add(new ModelBox(gun264, 424, 142, -1.1234F, -2.9804F, -0.3F, 1, 3, 10, -0.3F, false));
		gun264.cubeList.add(new ModelBox(gun264, 350, 234, -0.9734F, -2.6804F, 0.5F, 1, 2, 3, -0.1F, false));
		gun264.cubeList.add(new ModelBox(gun264, 350, 239, -0.9734F, -2.6804F, 5.65F, 1, 2, 3, -0.1F, false));
		gun264.cubeList.add(new ModelBox(gun264, 444, 248, -1.1234F, -1.2804F, 4.05F, 1, 1, 1, -0.1F, false));
		gun264.cubeList.add(new ModelBox(gun264, 444, 232, -1.1244F, -1.6804F, 4.049F, 1, 1, 1, -0.1F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-1.5F, -46.6804F, -2.7161F);
		upper.addChild(bone);
		setRotationAngle(bone, 1.5708F, 0.0F, 0.0F);
		

		bone10_r1 = new ModelRenderer(this);
		bone10_r1.setRotationPoint(0.0F, -2.7375F, -4.6214F);
		bone.addChild(bone10_r1);
		setRotationAngle(bone10_r1, 1.5708F, -0.7854F, 0.0F);
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 440, 116, 2.3143F, 2.8678F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 114, 440, 2.3143F, 2.6679F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 106, 440, 2.6679F, 2.3143F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 102, 440, 2.8679F, 2.3143F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 98, 440, 3.2214F, 2.6679F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 94, 440, 3.2214F, 2.8678F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 278, 373, 2.8679F, 3.2214F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 288, 250, 2.6679F, 3.2214F, -3.2375F, 1, 1, 1, -0.35F, false));

		bone8_r1 = new ModelRenderer(this);
		bone8_r1.setRotationPoint(0.0F, -2.7375F, -4.6214F);
		bone.addChild(bone8_r1);
		setRotationAngle(bone8_r1, 1.5708F, 0.0F, 0.0F);
		bone8_r1.cubeList.add(new ModelBox(bone8_r1, 440, 114, -0.6F, 3.6679F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone8_r1.cubeList.add(new ModelBox(bone8_r1, 110, 440, -0.4F, 3.6679F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone8_r1.cubeList.add(new ModelBox(bone8_r1, 146, 349, -0.0465F, 3.2214F, -3.2375F, 1, 2, 1, -0.35F, false));
		bone8_r1.cubeList.add(new ModelBox(bone8_r1, 90, 440, -0.4F, 4.575F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone8_r1.cubeList.add(new ModelBox(bone8_r1, 222, 398, -0.6F, 4.575F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone8_r1.cubeList.add(new ModelBox(bone8_r1, 288, 247, -0.9535F, 3.2214F, -3.2375F, 1, 2, 1, -0.35F, false));

		carryhandle2 = new ModelRenderer(this);
		carryhandle2.setRotationPoint(0.0F, -0.6F, 2.0F);
		upper.addChild(carryhandle2);
		carryhandle2.cubeList.add(new ModelBox(carryhandle2, 174, 352, -2.55F, -40.7071F, -24.5F, 2, 2, 24, 0.0F, false));
		carryhandle2.cubeList.add(new ModelBox(carryhandle2, 378, 208, -2.95F, -45.5571F, -22.5F, 2, 1, 19, -0.4F, false));
		carryhandle2.cubeList.add(new ModelBox(carryhandle2, 424, 38, -2.95F, -45.7571F, -17.5F, 1, 1, 14, -0.4F, false));
		carryhandle2.cubeList.add(new ModelBox(carryhandle2, 64, 312, -2.95F, -45.9571F, -12.5F, 1, 1, 9, -0.4F, false));
		carryhandle2.cubeList.add(new ModelBox(carryhandle2, 424, 435, -2.951F, -46.1571F, -7.5F, 1, 1, 3, -0.4F, false));
		carryhandle2.cubeList.add(new ModelBox(carryhandle2, 42, 401, -2.15F, -45.558F, -22.5F, 2, 1, 19, -0.4F, false));
		carryhandle2.cubeList.add(new ModelBox(carryhandle2, 424, 53, -1.15F, -45.7571F, -17.5F, 1, 1, 14, -0.4F, false));
		carryhandle2.cubeList.add(new ModelBox(carryhandle2, 424, 155, -1.15F, -45.9571F, -12.0F, 1, 1, 8, -0.4F, false));
		carryhandle2.cubeList.add(new ModelBox(carryhandle2, 282, 339, -1.15F, -46.1571F, -7.9F, 1, 1, 4, -0.4F, false));
		carryhandle2.cubeList.add(new ModelBox(carryhandle2, 58, 335, -2.551F, -43.9715F, -24.5556F, 2, 5, 1, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-1.55F, -42.7541F, -1.9484F);
		carryhandle2.addChild(bone2);
		setRotationAngle(bone2, 0.48F, 0.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 350, 228, -1.001F, -1.4823F, -1.9626F, 2, 4, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 282, 327, -0.099F, -4.6095F, -2.2821F, 2, 3, 3, -0.9F, false));
		bone2.cubeList.add(new ModelBox(bone2, 282, 333, -1.899F, -4.6095F, -2.2821F, 2, 3, 3, -0.9F, false));

		bone28_r2 = new ModelRenderer(this);
		bone28_r2.setRotationPoint(-0.001F, -3.3019F, -1.304F);
		bone2.addChild(bone28_r2);
		setRotationAngle(bone28_r2, -0.2182F, 0.0F, 0.0F);
		bone28_r2.cubeList.add(new ModelBox(bone28_r2, 392, 303, -1.9F, -2.5729F, -2.6906F, 2, 3, 4, -0.9F, false));
		bone28_r2.cubeList.add(new ModelBox(bone28_r2, 410, 129, -0.1F, -2.5729F, -2.6906F, 2, 3, 4, -0.9F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-1.55F, -40.6045F, -6.1639F);
		carryhandle2.addChild(bone3);
		setRotationAngle(bone3, -1.0908F, 0.0F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 198, 438, -1.0F, 0.0531F, -0.6351F, 2, 1, 1, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-1.55F, -41.9545F, -4.9139F);
		carryhandle2.addChild(bone4);
		setRotationAngle(bone4, 0.5236F, 0.0F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 150, 310, -1.0F, -4.4941F, -1.8167F, 2, 6, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 348, 437, -1.0F, -3.4941F, -0.8167F, 2, 2, 1, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-1.55F, -42.2545F, -5.6639F);
		carryhandle2.addChild(bone6);
		bone6.cubeList.add(new ModelBox(bone6, 282, 319, -1.003F, -2.7525F, -0.7979F, 2, 5, 3, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 354, 437, -1.003F, 0.2475F, 2.2021F, 2, 2, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 204, 438, -0.999F, -2.6414F, 1.3951F, 2, 1, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 282, 344, -1.499F, -1.7914F, 0.3951F, 3, 1, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 390, 84, -1.001F, -3.2655F, -2.2361F, 2, 1, 2, 0.0F, false));

		bone35_r2 = new ModelRenderer(this);
		bone35_r2.setRotationPoint(0.0868F, 4.8456F, 0.1498F);
		bone6.addChild(bone35_r2);
		setRotationAngle(bone35_r2, 0.0F, -0.7854F, 0.0F);
		bone35_r2.cubeList.add(new ModelBox(bone35_r2, 288, 436, 0.1735F, -6.637F, -0.8265F, 1, 1, 2, 0.0F, false));

		bone36_r2 = new ModelRenderer(this);
		bone36_r2.setRotationPoint(-2.2061F, 4.8456F, 3.2711F);
		bone6.addChild(bone36_r2);
		setRotationAngle(bone36_r2, 0.0F, -0.7854F, 0.0F);
		bone36_r2.cubeList.add(new ModelBox(bone36_r2, 294, 436, -0.8265F, -6.637F, -3.8265F, 1, 1, 2, 0.0F, false));

		bone35_r3 = new ModelRenderer(this);
		bone35_r3.setRotationPoint(-2.2061F, -0.1544F, 3.6853F);
		bone6.addChild(bone35_r3);
		setRotationAngle(bone35_r3, 0.0F, -0.7854F, 0.0F);
		bone35_r3.cubeList.add(new ModelBox(bone35_r3, 210, 438, -1.8265F, -1.637F, -3.8265F, 2, 1, 1, 0.0F, false));

		bone34_r2 = new ModelRenderer(this);
		bone34_r2.setRotationPoint(0.0868F, -0.1544F, 1.1498F);
		bone6.addChild(bone34_r2);
		setRotationAngle(bone34_r2, 0.0F, -0.7854F, 0.0F);
		bone34_r2.cubeList.add(new ModelBox(bone34_r2, 216, 438, -0.8265F, -1.637F, -0.8265F, 2, 1, 1, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-1.95F, -45.2045F, -20.9139F);
		carryhandle2.addChild(bone7);
		setRotationAngle(bone7, -1.2654F, 0.0F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 290, 439, -1.0F, 0.379F, -1.4051F, 1, 2, 1, -0.4F, false));
		bone7.cubeList.add(new ModelBox(bone7, 294, 439, -1.0F, 0.4391F, -1.2144F, 1, 2, 1, -0.4F, false));
		bone7.cubeList.add(new ModelBox(bone7, 384, 439, -1.0F, 0.4993F, -1.0236F, 1, 2, 1, -0.4F, false));
		bone7.cubeList.add(new ModelBox(bone7, 388, 439, -1.0F, 0.5594F, -0.8329F, 1, 2, 1, -0.4F, false));
		bone7.cubeList.add(new ModelBox(bone7, 84, 437, -1.0F, 0.6195F, -0.6421F, 2, 2, 1, -0.4F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-0.15F, -45.2045F, -20.9139F);
		carryhandle2.addChild(bone8);
		setRotationAngle(bone8, -1.2654F, 0.0F, 0.0F);
		bone8.cubeList.add(new ModelBox(bone8, 392, 439, -1.0F, 0.379F, -1.4051F, 1, 2, 1, -0.4F, false));
		bone8.cubeList.add(new ModelBox(bone8, 396, 439, -1.0F, 0.4391F, -1.2144F, 1, 2, 1, -0.4F, false));
		bone8.cubeList.add(new ModelBox(bone8, 400, 439, -1.0F, 0.4993F, -1.0236F, 1, 2, 1, -0.4F, false));
		bone8.cubeList.add(new ModelBox(bone8, 416, 439, -1.0F, 0.5594F, -0.8329F, 1, 2, 1, -0.4F, false));
		bone8.cubeList.add(new ModelBox(bone8, 90, 437, -2.0F, 0.6195F, -0.6421F, 2, 2, 1, -0.4F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-1.55F, -44.6045F, -21.4139F);
		carryhandle2.addChild(bone9);
		setRotationAngle(bone9, -0.9163F, 0.0F, 0.0F);
		bone9.cubeList.add(new ModelBox(bone9, 398, 84, -1.001F, 3.3117F, 0.7961F, 2, 1, 2, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(-1.55F, -44.6045F, -21.4139F);
		carryhandle2.addChild(bone10);
		setRotationAngle(bone10, -0.9163F, 0.0F, 0.0F);
		bone10.cubeList.add(new ModelBox(bone10, 420, 439, -1.4F, 0.3539F, -2.193F, 1, 2, 1, -0.4F, false));
		bone10.cubeList.add(new ModelBox(bone10, 424, 439, -1.4F, 0.4757F, -2.0344F, 1, 2, 1, -0.4F, false));
		bone10.cubeList.add(new ModelBox(bone10, 428, 439, -1.4F, 0.5974F, -1.8757F, 1, 2, 1, -0.4F, false));
		bone10.cubeList.add(new ModelBox(bone10, 32, 440, -1.4F, 0.7192F, -1.717F, 1, 2, 1, -0.4F, false));
		bone10.cubeList.add(new ModelBox(bone10, 96, 437, -1.4F, 0.7939F, -1.5396F, 2, 2, 1, -0.4F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(0.25F, -44.6045F, -21.4139F);
		carryhandle2.addChild(bone11);
		setRotationAngle(bone11, -0.9163F, 0.0F, 0.0F);
		bone11.cubeList.add(new ModelBox(bone11, 36, 440, -1.4F, 0.3539F, -2.193F, 1, 2, 1, -0.4F, false));
		bone11.cubeList.add(new ModelBox(bone11, 40, 440, -1.4F, 0.4757F, -2.0344F, 1, 2, 1, -0.4F, false));
		bone11.cubeList.add(new ModelBox(bone11, 44, 440, -1.4F, 0.5974F, -1.8757F, 1, 2, 1, -0.4F, false));
		bone11.cubeList.add(new ModelBox(bone11, 48, 440, -1.4F, 0.7192F, -1.717F, 1, 2, 1, -0.4F, false));
		bone11.cubeList.add(new ModelBox(bone11, 102, 437, -2.4F, 0.7939F, -1.5396F, 2, 2, 1, -0.4F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(-1.55F, -44.2071F, -22.0F);
		carryhandle2.addChild(bone12);
		setRotationAngle(bone12, -0.5236F, 0.0F, 0.0F);
		bone12.cubeList.add(new ModelBox(bone12, 222, 438, -1.0F, 0.4818F, -2.0954F, 2, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 424, 81, -0.999F, 3.026F, 0.4768F, 2, 1, 2, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(-1.55F, -43.9864F, -12.0993F);
		carryhandle2.addChild(bone13);
		setRotationAngle(bone13, -0.0524F, 0.0F, 0.0F);
		bone13.cubeList.add(new ModelBox(bone13, 432, 81, -1.001F, -0.5972F, 7.4813F, 2, 1, 2, 0.0F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(-0.15F, -45.05F, -4.35F);
		carryhandle2.addChild(bone15);
		setRotationAngle(bone15, 0.0401F, 0.0F, 0.0F);
		bone15.cubeList.add(new ModelBox(bone15, 134, 381, -1.0F, -1.9992F, -17.9599F, 1, 1, 17, -0.4F, false));
		bone15.cubeList.add(new ModelBox(bone15, 398, 357, -1.0F, -1.7994F, -17.9679F, 1, 1, 17, -0.4F, false));
		bone15.cubeList.add(new ModelBox(bone15, 84, 402, -1.002F, -1.5995F, -17.976F, 1, 1, 17, -0.4F, false));
		bone15.cubeList.add(new ModelBox(bone15, 0, 404, -1.002F, -1.3997F, -17.984F, 1, 1, 17, -0.4F, false));
		bone15.cubeList.add(new ModelBox(bone15, 406, 278, -0.999F, -1.1998F, -17.992F, 1, 1, 17, -0.4F, false));

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(-1.95F, -45.05F, -4.35F);
		carryhandle2.addChild(bone16);
		setRotationAngle(bone16, 0.0401F, 0.0F, 0.0F);
		bone16.cubeList.add(new ModelBox(bone16, 406, 296, -1.0F, -1.9992F, -17.9599F, 1, 1, 17, -0.4F, false));
		bone16.cubeList.add(new ModelBox(bone16, 406, 314, -1.0F, -1.7994F, -17.9679F, 1, 1, 17, -0.4F, false));
		bone16.cubeList.add(new ModelBox(bone16, 408, 84, -1.0F, -1.5995F, -17.976F, 1, 1, 17, -0.4F, false));
		bone16.cubeList.add(new ModelBox(bone16, 408, 228, -0.999F, -1.3997F, -17.984F, 1, 1, 17, -0.4F, false));
		bone16.cubeList.add(new ModelBox(bone16, 408, 246, -0.999F, -1.1998F, -17.992F, 1, 1, 17, -0.4F, false));

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(-0.55F, -45.66F, -3.75F);
		carryhandle2.addChild(bone23);
		setRotationAngle(bone23, -2.3562F, 0.0F, 0.0F);
		bone23.cubeList.add(new ModelBox(bone23, 272, 384, -0.601F, -0.1435F, -0.5593F, 1, 2, 2, -0.4F, false));

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(-2.35F, -45.66F, -3.75F);
		carryhandle2.addChild(bone24);
		setRotationAngle(bone24, -2.3562F, 0.0F, 0.0F);
		bone24.cubeList.add(new ModelBox(bone24, 272, 388, -0.601F, -0.1435F, -0.5593F, 1, 2, 2, -0.4F, false));

		bone29 = new ModelRenderer(this);
		bone29.setRotationPoint(0.0F, -0.4F, 0.0F);
		carryhandle2.addChild(bone29);
		bone29.cubeList.add(new ModelBox(bone29, 272, 392, -1.0F, -45.987F, -5.7618F, 1, 2, 2, -0.4F, false));
		bone29.cubeList.add(new ModelBox(bone29, 272, 396, -3.1F, -45.987F, -5.7618F, 1, 2, 2, -0.4F, false));
		bone29.cubeList.add(new ModelBox(bone29, 234, 438, -2.5F, -45.287F, -5.2618F, 2, 1, 1, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-3.1F, -37.8F, -6.0F);
		upper.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 444, 238, -0.5F, -0.7F, -15.0F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 240, 444, -1.325F, 0.4F, -15.0F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 372, 437, -1.325F, -0.6F, -4.9F, 2, 2, 1, -0.2F, false));

		gun140_r2 = new ModelRenderer(this);
		gun140_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(gun140_r2);
		setRotationAngle(gun140_r2, 0.0F, -0.2603F, 0.0F);
		gun140_r2.cubeList.add(new ModelBox(gun140_r2, 252, 244, -0.1397F, -0.7F, -0.4842F, 2, 1, 7, 0.0F, false));
		gun140_r2.cubeList.add(new ModelBox(gun140_r2, 270, 244, 0.0846F, -1.3243F, -0.2842F, 2, 1, 7, -0.2F, false));
		gun140_r2.cubeList.add(new ModelBox(gun140_r2, 358, 303, 0.0846F, -0.0757F, -0.2842F, 2, 1, 7, -0.2F, false));

		gun340_r3_r1 = new ModelRenderer(this);
		gun340_r3_r1.setRotationPoint(0.6381F, 5.6535F, 3.2158F);
		gun140_r2.addChild(gun340_r3_r1);
		setRotationAngle(gun340_r3_r1, 0.0F, 0.0F, 0.7854F);
		gun340_r3_r1.cubeList.add(new ModelBox(gun340_r3_r1, 434, 357, -4.5355F, -4.0355F, -3.5F, 1, 1, 7, -0.2F, false));

		gun240_r2_r1 = new ModelRenderer(this);
		gun240_r2_r1.setRotationPoint(0.6381F, 4.6535F, 3.2158F);
		gun140_r2.addChild(gun240_r2_r1);
		setRotationAngle(gun240_r2_r1, 0.0F, 0.0F, 0.7854F);
		gun240_r2_r1.cubeList.add(new ModelBox(gun240_r2_r1, 376, 303, -4.5355F, -4.0355F, -3.5F, 1, 1, 7, -0.2F, false));

		gun143_r2 = new ModelRenderer(this);
		gun143_r2.setRotationPoint(-1.6F, -0.2F, 6.5F);
		bone5.addChild(gun143_r2);
		setRotationAngle(gun143_r2, 0.0F, -0.2603F, 0.0F);
		gun143_r2.cubeList.add(new ModelBox(gun143_r2, 360, 437, -0.6287F, -1.0F, 0.9168F, 2, 2, 1, -0.4F, false));
		gun143_r2.cubeList.add(new ModelBox(gun143_r2, 366, 437, -0.1287F, -0.5F, -0.5832F, 1, 1, 2, 0.0F, false));

		gun264_r4 = new ModelRenderer(this);
		gun264_r4.setRotationPoint(-1.4F, 1.0F, -16.4F);
		bone5.addChild(gun264_r4);
		setRotationAngle(gun264_r4, 0.0F, 0.0F, -0.9295F);
		gun264_r4.cubeList.add(new ModelBox(gun264_r4, 378, 437, -0.0748F, -0.1002F, 5.95F, 1, 1, 2, -0.2F, false));
		gun264_r4.cubeList.add(new ModelBox(gun264_r4, 122, 322, -0.0748F, -0.1002F, 0.1F, 1, 1, 13, -0.3F, false));

		gun263_r4 = new ModelRenderer(this);
		gun263_r4.setRotationPoint(-0.7F, 0.3F, -15.0F);
		bone5.addChild(gun263_r4);
		setRotationAngle(gun263_r4, 0.0F, 0.0F, 0.4014F);
		gun263_r4.cubeList.add(new ModelBox(gun263_r4, 444, 240, -0.2306F, -2.2089F, -0.001F, 1, 1, 1, 0.0F, false));

		gun264_r3 = new ModelRenderer(this);
		gun264_r3.setRotationPoint(-0.22F, -0.82F, -15.0F);
		bone5.addChild(gun264_r3);
		setRotationAngle(gun264_r3, 0.0F, 0.0F, 0.8203F);
		gun264_r3.cubeList.add(new ModelBox(gun264_r3, 386, 129, -0.612F, -1.81F, 0.0F, 1, 1, 11, 0.0F, false));

		gun263_r3 = new ModelRenderer(this);
		gun263_r3.setRotationPoint(-1.2F, 0.4F, -15.0F);
		bone5.addChild(gun263_r3);
		setRotationAngle(gun263_r3, 0.0F, 0.0F, -0.3491F);
		gun263_r3.cubeList.add(new ModelBox(gun263_r3, 444, 250, -0.1174F, -0.0428F, -0.001F, 1, 1, 1, 0.0F, false));

		gun2 = new ModelRenderer(this);
		gun2.setRotationPoint(-0.4F, -1.45F, -4.3F);
		bone5.addChild(gun2);
		setRotationAngle(gun2, 0.0F, 0.0F, -0.0524F);
		

		gun170_r1 = new ModelRenderer(this);
		gun170_r1.setRotationPoint(0.5502F, 0.2491F, 0.2879F);
		gun2.addChild(gun170_r1);
		setRotationAngle(gun170_r1, 0.0F, 0.0F, 0.3054F);
		gun170_r1.cubeList.add(new ModelBox(gun170_r1, 432, 435, -1.9351F, -0.9808F, 0.5871F, 3, 2, 1, 0.0F, false));

		gun172_r3 = new ModelRenderer(this);
		gun172_r3.setRotationPoint(-1.3F, -0.05F, 1.0F);
		gun2.addChild(gun172_r3);
		setRotationAngle(gun172_r3, 0.0F, -0.2618F, 0.0F);
		

		gun172_r1_r1 = new ModelRenderer(this);
		gun172_r1_r1.setRotationPoint(1.6028F, 0.2991F, -1.1667F);
		gun172_r3.addChild(gun172_r1_r1);
		setRotationAngle(gun172_r1_r1, 0.0779F, -0.0116F, 0.2947F);
		gun172_r1_r1.cubeList.add(new ModelBox(gun172_r1_r1, 70, 436, -1.4584F, -0.9798F, 1.0339F, 3, 2, 1, 0.0F, false));

		gun172_r4 = new ModelRenderer(this);
		gun172_r4.setRotationPoint(-1.3F, -0.05F, 0.0F);
		gun2.addChild(gun172_r4);
		setRotationAngle(gun172_r4, 0.0F, -0.9076F, 0.0F);
		

		gun172_r2_r1 = new ModelRenderer(this);
		gun172_r2_r1.setRotationPoint(1.3659F, 0.2991F, -1.2807F);
		gun172_r4.addChild(gun172_r2_r1);
		setRotationAngle(gun172_r2_r1, 0.2393F, -0.0225F, 0.1862F);
		gun172_r2_r1.cubeList.add(new ModelBox(gun172_r2_r1, 36, 404, -0.7287F, -0.9798F, -0.1136F, 1, 2, 2, 0.0F, false));
		gun172_r2_r1.cubeList.add(new ModelBox(gun172_r2_r1, 86, 440, -0.3167F, -0.9798F, -0.1293F, 1, 2, 1, 0.0F, false));

		receiver13_r7 = new ModelRenderer(this);
		receiver13_r7.setRotationPoint(-0.5F, 0.3F, -5.7F);
		bone5.addChild(receiver13_r7);
		setRotationAngle(receiver13_r7, 0.0F, 0.0F, 0.4014F);
		receiver13_r7.cubeList.add(new ModelBox(receiver13_r7, 444, 242, -0.3907F, -1.9205F, -9.3F, 1, 1, 1, 0.0F, false));

		receiver14_r12 = new ModelRenderer(this);
		receiver14_r12.setRotationPoint(0.8F, -1.0F, -5.7F);
		bone5.addChild(receiver14_r12);
		setRotationAngle(receiver14_r12, 0.0F, 0.0F, -0.4014F);
		receiver14_r12.cubeList.add(new ModelBox(receiver14_r12, 444, 244, -0.6093F, -0.9205F, -9.299F, 1, 1, 1, 0.0F, false));
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