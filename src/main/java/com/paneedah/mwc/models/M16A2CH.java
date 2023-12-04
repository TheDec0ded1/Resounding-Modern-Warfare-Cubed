package com.paneedah.mwc.models;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M16A2CH extends ModelBase {
	private final ModelRenderer receiver;
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
	private final ModelRenderer carryhandle;
	private final ModelRenderer bone27;
	private final ModelRenderer bone28_r1;
	private final ModelRenderer bone21;
	private final ModelRenderer bone25;
	private final ModelRenderer bone26;
	private final ModelRenderer bone31;
	private final ModelRenderer bone35_r1;
	private final ModelRenderer bone36_r1;
	private final ModelRenderer bone35_r2;
	private final ModelRenderer bone34_r1;
	private final ModelRenderer bone19;
	private final ModelRenderer bone36;
	private final ModelRenderer bone18;
	private final ModelRenderer bone37;
	private final ModelRenderer bone38;
	private final ModelRenderer bone17;
	private final ModelRenderer bone45;
	private final ModelRenderer bone20;
	private final ModelRenderer bone34;
	private final ModelRenderer bone33;
	private final ModelRenderer bone35;
	private final ModelRenderer bone;

	public M16A2CH() {
		textureWidth = 200;
		textureHeight = 200;

		receiver = new ModelRenderer(this);
		receiver.setRotationPoint(0.0F, 24.0F, 0.0F);
		receiver.cubeList.add(new ModelBox(receiver, 32, 80, -2.0F, -40.3F, -1.0F, 1, 1, 2, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 86, 74, -2.502F, -40.2F, -2.0F, 2, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 86, 72, -2.501F, -40.101F, -22.7F, 2, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 26, 85, -2.5F, -40.1F, -22.0F, 2, 1, 21, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 33, 100, -1.401F, -39.301F, -22.701F, 1, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 86, 70, -2.601F, -39.301F, -22.702F, 2, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 49, 79, -0.6F, -38.85F, -18.5F, 1, 1, 2, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 12, 100, -0.599F, -38.85F, -19.0F, 1, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 103, 109, -1.4F, -39.3F, -22.0F, 1, 1, 23, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 102, 85, -2.6F, -39.3F, -22.0F, 1, 1, 23, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 92, 96, -2.0F, -38.8F, -23.699F, 1, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 88, 96, -2.0F, -37.2F, -23.699F, 1, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 37, 100, -4.3F, -37.4F, -21.0F, 1, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 0, 100, -4.3F, -37.4F, -12.0F, 1, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 74, 49, -2.5F, -37.001F, -22.701F, 2, 2, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 51, 85, -0.6F, -37.1F, -21.201F, 1, 2, 10, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 50, 85, -0.8F, -37.0F, -22.698F, 1, 2, 24, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 62, 43, -3.4F, -37.1F, -21.201F, 1, 2, 10, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 0, 84, -3.2F, -37.0F, -22.699F, 1, 2, 24, 0.0F, false));

		gun263_r1 = new ModelRenderer(this);
		gun263_r1.setRotationPoint(-4.3F, -37.4F, -21.0F);
		receiver.addChild(gun263_r1);
		setRotationAngle(gun263_r1, 0.0F, 0.0F, -0.3491F);
		gun263_r1.cubeList.add(new ModelBox(gun263_r1, 99, 51, 0.0F, 0.0F, -0.001F, 1, 1, 1, 0.0F, false));
		gun263_r1.cubeList.add(new ModelBox(gun263_r1, 51, 99, 0.0F, 0.0F, 8.999F, 1, 1, 1, 0.0F, false));

		gun263_r2 = new ModelRenderer(this);
		gun263_r2.setRotationPoint(-3.8F, -37.5F, -21.0F);
		receiver.addChild(gun263_r2);
		setRotationAngle(gun263_r2, 0.0F, 0.0F, 0.4014F);
		gun263_r2.cubeList.add(new ModelBox(gun263_r2, 67, 99, 0.0F, -0.7F, 0.0F, 1, 1, 1, 0.0F, false));
		gun263_r2.cubeList.add(new ModelBox(gun263_r2, 63, 99, -0.001F, -1.22F, -0.001F, 1, 1, 1, 0.0F, false));
		gun263_r2.cubeList.add(new ModelBox(gun263_r2, 59, 99, 0.0F, -0.7F, 9.0F, 1, 1, 1, 0.0F, false));
		gun263_r2.cubeList.add(new ModelBox(gun263_r2, 99, 57, -0.001F, -1.22F, 8.999F, 1, 1, 1, 0.0F, false));

		gun264_r1 = new ModelRenderer(this);
		gun264_r1.setRotationPoint(-3.32F, -38.62F, -21.0F);
		receiver.addChild(gun264_r1);
		setRotationAngle(gun264_r1, 0.0F, 0.0F, 0.8203F);
		gun264_r1.cubeList.add(new ModelBox(gun264_r1, 99, 59, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun264_r1.cubeList.add(new ModelBox(gun264_r1, 20, 0, -0.101F, -1.1F, 0.5F, 1, 1, 9, -0.1F, false));
		gun264_r1.cubeList.add(new ModelBox(gun264_r1, 55, 99, 0.0F, -1.0F, 9.0F, 1, 1, 1, 0.0F, false));

		gun264_r2 = new ModelRenderer(this);
		gun264_r2.setRotationPoint(-4.5F, -36.8F, -22.4F);
		receiver.addChild(gun264_r2);
		setRotationAngle(gun264_r2, 0.0F, 0.0F, -0.9295F);
		gun264_r2.cubeList.add(new ModelBox(gun264_r2, 75, 77, 0.0F, 0.0F, 5.35F, 1, 1, 2, -0.2F, false));
		gun264_r2.cubeList.add(new ModelBox(gun264_r2, 58, 61, 0.0F, 0.0F, 0.0F, 1, 1, 12, -0.3F, false));

		gun143_r1 = new ModelRenderer(this);
		gun143_r1.setRotationPoint(-4.7F, -38.0F, 0.5F);
		receiver.addChild(gun143_r1);
		setRotationAngle(gun143_r1, 0.0F, -0.2603F, 0.0F);
		gun143_r1.cubeList.add(new ModelBox(gun143_r1, 75, 37, -0.5F, -0.5F, 1.4F, 2, 2, 1, -0.4F, false));
		gun143_r1.cubeList.add(new ModelBox(gun143_r1, 51, 85, 0.0F, 0.0F, -0.1F, 1, 1, 2, 0.0F, false));

		gun140_r1 = new ModelRenderer(this);
		gun140_r1.setRotationPoint(-3.1F, -37.8F, -6.0F);
		receiver.addChild(gun140_r1);
		setRotationAngle(gun140_r1, 0.0F, -0.2603F, 0.0F);
		gun140_r1.cubeList.add(new ModelBox(gun140_r1, 64, 74, -0.01F, 0.0F, 0.0F, 2, 1, 7, 0.0F, false));
		gun140_r1.cubeList.add(new ModelBox(gun140_r1, 20, 29, -0.011F, -0.4F, -0.001F, 2, 1, 7, 0.0F, false));

		receiver18_r2 = new ModelRenderer(this);
		receiver18_r2.setRotationPoint(-2.6F, -39.25F, 1.0F);
		receiver.addChild(receiver18_r2);
		setRotationAngle(receiver18_r2, 0.0F, 0.0F, -0.8029F);
		receiver18_r2.cubeList.add(new ModelBox(receiver18_r2, 8, 100, -0.9F, 0.0F, -0.4F, 1, 1, 1, 0.0F, false));

		receiver17_r5 = new ModelRenderer(this);
		receiver17_r5.setRotationPoint(-0.4F, -39.25F, 1.0F);
		receiver.addChild(receiver17_r5);
		setRotationAngle(receiver17_r5, 0.0F, 0.0F, 0.8029F);
		receiver17_r5.cubeList.add(new ModelBox(receiver17_r5, 100, 18, -0.1F, 0.0F, -0.4F, 1, 1, 1, 0.0F, false));

		receiver14_r4 = new ModelRenderer(this);
		receiver14_r4.setRotationPoint(-3.6F, -37.5F, -11.7F);
		receiver.addChild(receiver14_r4);
		setRotationAngle(receiver14_r4, 0.0F, 0.0F, -0.4014F);
		receiver14_r4.cubeList.add(new ModelBox(receiver14_r4, 86, 68, 0.0F, 0.0F, 0.001F, 1, 1, 13, 0.0F, false));
		receiver14_r4.cubeList.add(new ModelBox(receiver14_r4, 62, 19, -0.4F, -0.2F, -8.999F, 1, 2, 10, -0.4F, false));
		receiver14_r4.cubeList.add(new ModelBox(receiver14_r4, 78, 20, 0.0F, 0.0F, -10.998F, 1, 1, 2, 0.0F, false));

		receiver14_r5 = new ModelRenderer(this);
		receiver14_r5.setRotationPoint(-3.2F, -37.5F, -23.7F);
		receiver.addChild(receiver14_r5);
		setRotationAngle(receiver14_r5, 0.0F, 0.0F, -0.4014F);
		receiver14_r5.cubeList.add(new ModelBox(receiver14_r5, 97, 19, 0.0F, 0.0F, 0.001F, 1, 1, 1, 0.0F, false));

		receiver13_r1 = new ModelRenderer(this);
		receiver13_r1.setRotationPoint(0.2F, -37.5F, -23.7F);
		receiver.addChild(receiver13_r1);
		setRotationAngle(receiver13_r1, 0.0F, 0.0F, 0.4014F);
		receiver13_r1.cubeList.add(new ModelBox(receiver13_r1, 97, 39, -1.0F, 0.0F, 0.001F, 1, 1, 1, 0.0F, false));

		receiver12_r1 = new ModelRenderer(this);
		receiver12_r1.setRotationPoint(0.6F, -37.5F, -22.7F);
		receiver.addChild(receiver12_r1);
		setRotationAngle(receiver12_r1, 0.0F, 0.0F, 0.4014F);
		receiver12_r1.cubeList.add(new ModelBox(receiver12_r1, 86, 43, -1.0F, 0.0F, 0.001F, 1, 1, 24, 0.0F, false));

		receiver15_r6 = new ModelRenderer(this);
		receiver15_r6.setRotationPoint(-3.7F, -37.5F, 0.6F);
		receiver.addChild(receiver15_r6);
		setRotationAngle(receiver15_r6, -0.925F, 0.0F, -0.3142F);
		receiver15_r6.cubeList.add(new ModelBox(receiver15_r6, 79, 55, 0.001F, 0.3F, 0.5F, 1, 2, 1, 0.0F, false));

		receiver14_r6 = new ModelRenderer(this);
		receiver14_r6.setRotationPoint(0.7F, -37.5F, 0.6F);
		receiver.addChild(receiver14_r6);
		setRotationAngle(receiver14_r6, -0.925F, 0.0F, 0.3142F);
		receiver14_r6.cubeList.add(new ModelBox(receiver14_r6, 79, 62, -0.999F, 0.3F, 0.5F, 1, 2, 1, 0.0F, false));

		receiver14_r7 = new ModelRenderer(this);
		receiver14_r7.setRotationPoint(-3.7F, -37.5F, 0.6F);
		receiver.addChild(receiver14_r7);
		setRotationAngle(receiver14_r7, 0.0F, 0.0F, -0.3142F);
		receiver14_r7.cubeList.add(new ModelBox(receiver14_r7, 79, 31, 0.0F, 0.0F, 0.001F, 1, 2, 1, 0.0F, false));

		receiver13_r2 = new ModelRenderer(this);
		receiver13_r2.setRotationPoint(0.7F, -37.5F, 0.6F);
		receiver.addChild(receiver13_r2);
		setRotationAngle(receiver13_r2, 0.0F, 0.0F, 0.3142F);
		receiver13_r2.cubeList.add(new ModelBox(receiver13_r2, 80, 5, -1.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		receiver13_r3 = new ModelRenderer(this);
		receiver13_r3.setRotationPoint(0.7F, -37.5F, 0.6F);
		receiver.addChild(receiver13_r3);
		setRotationAngle(receiver13_r3, 0.0F, 0.0F, -0.4014F);
		receiver13_r3.cubeList.add(new ModelBox(receiver13_r3, 20, 100, -0.999F, -1.2F, 0.001F, 1, 1, 1, 0.0F, false));
		receiver13_r3.cubeList.add(new ModelBox(receiver13_r3, 100, 20, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver14_r8 = new ModelRenderer(this);
		receiver14_r8.setRotationPoint(-3.7F, -37.5F, 0.6F);
		receiver.addChild(receiver14_r8);
		setRotationAngle(receiver14_r8, 0.0F, 0.0F, 0.4014F);
		receiver14_r8.cubeList.add(new ModelBox(receiver14_r8, 4, 100, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		receiver14_r8.cubeList.add(new ModelBox(receiver14_r8, 100, 11, -0.001F, -1.2F, 0.001F, 1, 1, 1, 0.0F, false));

		receiver14_r9 = new ModelRenderer(this);
		receiver14_r9.setRotationPoint(-2.3F, -38.8F, -11.7F);
		receiver.addChild(receiver14_r9);
		setRotationAngle(receiver14_r9, 0.0F, 0.0F, -0.4014F);
		receiver14_r9.cubeList.add(new ModelBox(receiver14_r9, 101, 69, -1.0F, 0.0F, 0.001F, 1, 1, 13, 0.0F, false));
		receiver14_r9.cubeList.add(new ModelBox(receiver14_r9, 78, 23, -1.0F, 0.0F, -10.999F, 1, 1, 2, 0.0F, false));

		receiver15_r7 = new ModelRenderer(this);
		receiver15_r7.setRotationPoint(-1.9F, -36.2F, -23.7F);
		receiver.addChild(receiver15_r7);
		setRotationAngle(receiver15_r7, 0.0F, 0.0F, 0.4014F);
		receiver15_r7.cubeList.add(new ModelBox(receiver15_r7, 96, 96, -1.0F, -1.0F, -0.001F, 1, 1, 1, 0.0F, false));

		receiver14_r10 = new ModelRenderer(this);
		receiver14_r10.setRotationPoint(-1.1F, -36.2F, -23.7F);
		receiver.addChild(receiver14_r10);
		setRotationAngle(receiver14_r10, 0.0F, 0.0F, -0.4014F);
		receiver14_r10.cubeList.add(new ModelBox(receiver14_r10, 30, 97, 0.0F, -1.0F, -0.001F, 1, 1, 1, 0.0F, false));

		receiver14_r11 = new ModelRenderer(this);
		receiver14_r11.setRotationPoint(-1.9F, -38.8F, -23.7F);
		receiver.addChild(receiver14_r11);
		setRotationAngle(receiver14_r11, 0.0F, 0.0F, -0.4014F);
		receiver14_r11.cubeList.add(new ModelBox(receiver14_r11, 97, 21, -1.0F, 0.0F, 0.001F, 1, 1, 1, 0.0F, false));

		receiver13_r4 = new ModelRenderer(this);
		receiver13_r4.setRotationPoint(-1.1F, -38.8F, -23.7F);
		receiver.addChild(receiver13_r4);
		setRotationAngle(receiver13_r4, 0.0F, 0.0F, 0.4014F);
		receiver13_r4.cubeList.add(new ModelBox(receiver13_r4, 51, 97, 0.0F, 0.0F, 0.001F, 1, 1, 1, 0.0F, false));

		receiver12_r2 = new ModelRenderer(this);
		receiver12_r2.setRotationPoint(-0.7F, -38.8F, -22.7F);
		receiver.addChild(receiver12_r2);
		setRotationAngle(receiver12_r2, 0.0F, 0.0F, 0.4014F);
		receiver12_r2.cubeList.add(new ModelBox(receiver12_r2, 86, 0, 0.0F, 0.0F, 0.001F, 1, 1, 24, 0.0F, false));

		receiver13_r5 = new ModelRenderer(this);
		receiver13_r5.setRotationPoint(-3.6F, -37.5F, -11.7F);
		receiver.addChild(receiver13_r5);
		setRotationAngle(receiver13_r5, 0.0F, 0.0F, 0.4014F);
		receiver13_r5.cubeList.add(new ModelBox(receiver13_r5, 103, 25, 0.0F, -1.0F, 0.0F, 1, 1, 13, 0.0F, false));
		receiver13_r5.cubeList.add(new ModelBox(receiver13_r5, 78, 26, 0.0F, -1.0F, -11.0F, 1, 1, 2, 0.0F, false));

		receiver13_r6 = new ModelRenderer(this);
		receiver13_r6.setRotationPoint(-3.2F, -37.5F, -23.7F);
		receiver.addChild(receiver13_r6);
		setRotationAngle(receiver13_r6, 0.0F, 0.0F, 0.4014F);
		receiver13_r6.cubeList.add(new ModelBox(receiver13_r6, 26, 97, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver12_r3 = new ModelRenderer(this);
		receiver12_r3.setRotationPoint(0.2F, -37.5F, -23.7F);
		receiver.addChild(receiver12_r3);
		setRotationAngle(receiver12_r3, 0.0F, 0.0F, -0.4014F);
		receiver12_r3.cubeList.add(new ModelBox(receiver12_r3, 97, 48, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver11_r1 = new ModelRenderer(this);
		receiver11_r1.setRotationPoint(0.6F, -37.5F, -22.7F);
		receiver.addChild(receiver11_r1);
		setRotationAngle(receiver11_r1, 0.0F, 0.0F, -0.4014F);
		receiver11_r1.cubeList.add(new ModelBox(receiver11_r1, 76, 87, -1.0F, -1.0F, 0.0F, 1, 1, 24, 0.0F, false));

		receiver16_r7 = new ModelRenderer(this);
		receiver16_r7.setRotationPoint(0.4F, -38.85F, -19.0F);
		receiver.addChild(receiver16_r7);
		setRotationAngle(receiver16_r7, 0.0F, 0.0F, 1.9705F);
		receiver16_r7.cubeList.add(new ModelBox(receiver16_r7, 16, 100, 0.001F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		receiver16_r7.cubeList.add(new ModelBox(receiver16_r7, 55, 79, 0.0F, 0.0F, 0.5F, 1, 1, 2, 0.0F, false));

		receiver18_r3 = new ModelRenderer(this);
		receiver18_r3.setRotationPoint(0.4F, -38.85F, -19.0F);
		receiver.addChild(receiver18_r3);
		setRotationAngle(receiver18_r3, 0.0F, -1.9333F, 0.0F);
		receiver18_r3.cubeList.add(new ModelBox(receiver18_r3, 80, 47, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		receiver17_r6 = new ModelRenderer(this);
		receiver17_r6.setRotationPoint(0.4F, -38.85F, -16.5F);
		receiver.addChild(receiver17_r6);
		setRotationAngle(receiver17_r6, 0.0F, 1.9333F, 0.0F);
		receiver17_r6.cubeList.add(new ModelBox(receiver17_r6, 80, 76, 0.0F, 0.0F, -1.0F, 1, 2, 1, 0.0F, false));

		gun125_r1 = new ModelRenderer(this);
		gun125_r1.setRotationPoint(-2.5F, -40.1F, -1.0F);
		receiver.addChild(gun125_r1);
		setRotationAngle(gun125_r1, -0.632F, 0.0F, 0.0F);
		gun125_r1.cubeList.add(new ModelBox(gun125_r1, 72, 68, -0.001F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

		gun170 = new ModelRenderer(this);
		gun170.setRotationPoint(-3.5F, -39.25F, -10.3F);
		receiver.addChild(gun170);
		setRotationAngle(gun170, 0.0F, 0.0F, -0.0524F);
		gun170.cubeList.add(new ModelBox(gun170, 73, 3, -1.3F, -0.001F, 0.0F, 3, 2, 1, 0.0F, false));

		gun172_r1 = new ModelRenderer(this);
		gun172_r1.setRotationPoint(-1.3F, -0.05F, 1.0F);
		gun170.addChild(gun172_r1);
		setRotationAngle(gun172_r1, 0.0F, -0.2618F, 0.0F);
		gun172_r1.cubeList.add(new ModelBox(gun172_r1, 62, 31, 0.0F, 0.05F, -1.0F, 3, 2, 1, 0.0F, false));

		gun172_r2 = new ModelRenderer(this);
		gun172_r2.setRotationPoint(-1.3F, -0.05F, 0.0F);
		gun170.addChild(gun172_r2);
		setRotationAngle(gun172_r2, 0.0F, -0.9076F, 0.0F);
		gun172_r2.cubeList.add(new ModelBox(gun172_r2, 79, 58, 1.0F, 0.05F, -2.0F, 1, 2, 1, 0.0F, false));
		gun172_r2.cubeList.add(new ModelBox(gun172_r2, 43, 9, 0.0F, 0.05F, -3.0F, 1, 2, 3, 0.0F, false));

		gun264 = new ModelRenderer(this);
		gun264.setRotationPoint(-3.7F, -34.2F, -20.0F);
		receiver.addChild(gun264);
		setRotationAngle(gun264, 0.0F, 0.0F, 0.1578F);
		gun264.cubeList.add(new ModelBox(gun264, 0, 19, -1.0F, -3.0F, -0.3F, 1, 3, 8, -0.3F, false));
		gun264.cubeList.add(new ModelBox(gun264, 30, 42, -0.85F, -2.7F, 0.25F, 1, 2, 3, -0.1F, false));
		gun264.cubeList.add(new ModelBox(gun264, 33, 19, -0.85F, -2.7F, 4.65F, 1, 2, 3, -0.1F, false));
		gun264.cubeList.add(new ModelBox(gun264, 99, 45, -1.0F, -1.3F, 3.45F, 1, 1, 1, -0.1F, false));
		gun264.cubeList.add(new ModelBox(gun264, 99, 43, -1.001F, -1.7F, 3.449F, 1, 1, 1, -0.1F, false));
		gun264.cubeList.add(new ModelBox(gun264, 0, 30, -1.0F, -3.0F, 7.1F, 1, 3, 1, -0.3F, false));
		gun264.cubeList.add(new ModelBox(gun264, 0, 0, -1.001F, -3.001F, 7.3F, 1, 3, 1, -0.3F, false));

		carryhandle = new ModelRenderer(this);
		carryhandle.setRotationPoint(0.0F, 24.4F, 0.0F);
		carryhandle.cubeList.add(new ModelBox(carryhandle, 50, 168, -2.55F, -40.7071F, -21.5F, 2, 2, 21, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 54, 172, -2.95F, -44.5571F, -20.5F, 2, 1, 17, -0.4F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 156, 130, -2.95F, -44.7571F, -20.5F, 1, 1, 17, -0.4F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 155, 155, -2.95F, -44.9571F, -20.5F, 1, 1, 17, -0.4F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 84, 95, -2.951F, -45.1571F, -20.5F, 1, 1, 16, -0.4F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 54, 172, -2.15F, -44.558F, -20.5F, 2, 1, 17, -0.4F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 57, 56, -2.15F, -44.556F, -22.2F, 2, 1, 3, -0.4F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 56, 56, -2.85F, -44.557F, -22.201F, 2, 1, 3, -0.4F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 115, 49, -1.15F, -44.7571F, -20.5F, 1, 1, 17, -0.4F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 116, 29, -1.15F, -44.9571F, -20.0F, 1, 1, 16, -0.4F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 109, 92, -1.15F, -45.1571F, -19.9F, 1, 1, 16, -0.4F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 57, 56, -2.55F, -43.2071F, -22.5F, 2, 4, 1, 0.0F, false));

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(-1.55F, -42.7541F, -1.9484F);
		carryhandle.addChild(bone27);
		setRotationAngle(bone27, 0.48F, 0.0F, 0.0F);
		bone27.cubeList.add(new ModelBox(bone27, 4, 0, -1.001F, -0.4823F, -1.9626F, 2, 3, 2, 0.0F, false));
		bone27.cubeList.add(new ModelBox(bone27, 54, 54, -0.099F, -3.5208F, -2.3283F, 2, 3, 3, -0.9F, false));
		bone27.cubeList.add(new ModelBox(bone27, 11, 69, -1.899F, -3.5208F, -2.3283F, 2, 3, 3, -0.9F, false));

		bone28_r1 = new ModelRenderer(this);
		bone28_r1.setRotationPoint(-0.001F, -3.3019F, -1.304F);
		bone27.addChild(bone28_r1);
		setRotationAngle(bone28_r1, -0.2182F, 0.0F, 0.0F);
		bone28_r1.cubeList.add(new ModelBox(bone28_r1, 10, 68, -1.9F, -1.5F, -2.5F, 2, 3, 4, -0.9F, false));
		bone28_r1.cubeList.add(new ModelBox(bone28_r1, 53, 53, -0.1F, -1.5F, -2.5F, 2, 3, 4, -0.9F, false));

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(-1.55F, -40.6045F, -6.1639F);
		carryhandle.addChild(bone21);
		setRotationAngle(bone21, -1.0908F, 0.0F, 0.0F);
		bone21.cubeList.add(new ModelBox(bone21, 60, 45, -1.0F, 0.0531F, -0.6351F, 2, 1, 1, 0.0F, false));

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(-1.55F, -41.9545F, -4.9139F);
		carryhandle.addChild(bone25);
		setRotationAngle(bone25, 0.5236F, 0.0F, 0.0F);
		bone25.cubeList.add(new ModelBox(bone25, 56, 47, -1.0F, -2.4941F, -1.8167F, 2, 4, 2, 0.0F, false));

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(-1.55F, -42.3545F, -5.2639F);
		carryhandle.addChild(bone26);
		setRotationAngle(bone26, 0.6545F, 0.0F, 0.0F);
		bone26.cubeList.add(new ModelBox(bone26, 61, 58, -1.002F, -2.9569F, -1.4525F, 2, 1, 1, 0.0F, false));
		bone26.cubeList.add(new ModelBox(bone26, 56, 49, -1.003F, -3.263F, -1.4528F, 2, 1, 1, 0.0F, false));

		bone31 = new ModelRenderer(this);
		bone31.setRotationPoint(-1.55F, -42.2545F, -5.6639F);
		carryhandle.addChild(bone31);
		bone31.cubeList.add(new ModelBox(bone31, 55, 54, -1.003F, -1.7655F, -0.3361F, 2, 4, 3, 0.0F, false));
		bone31.cubeList.add(new ModelBox(bone31, 57, 56, -0.999F, -1.6544F, 1.8569F, 2, 1, 1, 0.0F, false));
		bone31.cubeList.add(new ModelBox(bone31, 57, 56, -1.499F, -0.6544F, 0.8569F, 3, 1, 1, 0.0F, false));
		bone31.cubeList.add(new ModelBox(bone31, 58, 57, -1.001F, -2.2655F, -2.2361F, 2, 1, 2, 0.0F, false));

		bone35_r1 = new ModelRenderer(this);
		bone35_r1.setRotationPoint(0.0868F, 4.8456F, 0.1498F);
		bone31.addChild(bone35_r1);
		setRotationAngle(bone35_r1, 0.0F, -0.7854F, 0.0F);
		bone35_r1.cubeList.add(new ModelBox(bone35_r1, 56, 55, 0.5F, -5.5F, -0.5F, 1, 1, 2, 0.0F, false));

		bone36_r1 = new ModelRenderer(this);
		bone36_r1.setRotationPoint(-2.2061F, 4.8456F, 3.2711F);
		bone31.addChild(bone36_r1);
		setRotationAngle(bone36_r1, 0.0F, -0.7854F, 0.0F);
		bone36_r1.cubeList.add(new ModelBox(bone36_r1, 56, 55, -0.5F, -5.5F, -3.5F, 1, 1, 2, 0.0F, false));

		bone35_r2 = new ModelRenderer(this);
		bone35_r2.setRotationPoint(-2.2061F, -0.1544F, 3.6853F);
		bone31.addChild(bone35_r2);
		setRotationAngle(bone35_r2, 0.0F, -0.7854F, 0.0F);
		bone35_r2.cubeList.add(new ModelBox(bone35_r2, 57, 56, -1.5F, -0.5F, -3.5F, 2, 1, 1, 0.0F, false));

		bone34_r1 = new ModelRenderer(this);
		bone34_r1.setRotationPoint(0.0868F, -0.1544F, 1.1498F);
		bone31.addChild(bone34_r1);
		setRotationAngle(bone34_r1, 0.0F, -0.7854F, 0.0F);
		bone34_r1.cubeList.add(new ModelBox(bone34_r1, 57, 56, -0.5F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(-1.95F, -45.2045F, -20.9139F);
		carryhandle.addChild(bone19);
		setRotationAngle(bone19, -1.2654F, 0.0F, 0.0F);
		bone19.cubeList.add(new ModelBox(bone19, 13, 64, -1.0F, -1.2555F, 0.0639F, 1, 2, 1, -0.4F, false));
		bone19.cubeList.add(new ModelBox(bone19, 14, 67, -1.0F, -1.1954F, 0.2546F, 1, 2, 1, -0.4F, false));
		bone19.cubeList.add(new ModelBox(bone19, 56, 57, -1.0F, -1.1352F, 0.4454F, 1, 2, 1, -0.4F, false));
		bone19.cubeList.add(new ModelBox(bone19, 57, 43, -1.0F, -1.0751F, 0.6361F, 1, 2, 1, -0.4F, false));
		bone19.cubeList.add(new ModelBox(bone19, 60, 57, -1.0F, -1.015F, 0.8269F, 2, 2, 1, -0.4F, false));

		bone36 = new ModelRenderer(this);
		bone36.setRotationPoint(-0.15F, -45.2045F, -20.9139F);
		carryhandle.addChild(bone36);
		setRotationAngle(bone36, -1.2654F, 0.0F, 0.0F);
		bone36.cubeList.add(new ModelBox(bone36, 63, 57, -1.0F, -1.2555F, 0.0639F, 1, 2, 1, -0.4F, false));
		bone36.cubeList.add(new ModelBox(bone36, 12, 59, -1.0F, -1.1954F, 0.2546F, 1, 2, 1, -0.4F, false));
		bone36.cubeList.add(new ModelBox(bone36, 57, 48, -1.0F, -1.1352F, 0.4454F, 1, 2, 1, -0.4F, false));
		bone36.cubeList.add(new ModelBox(bone36, 21, 48, -1.0F, -1.0751F, 0.6361F, 1, 2, 1, -0.4F, false));
		bone36.cubeList.add(new ModelBox(bone36, 60, 57, -2.0F, -1.015F, 0.8269F, 2, 2, 1, -0.4F, false));

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(-1.55F, -44.6045F, -21.4139F);
		carryhandle.addChild(bone18);
		setRotationAngle(bone18, -0.9163F, 0.0F, 0.0F);
		bone18.cubeList.add(new ModelBox(bone18, 62, 57, -1.001F, 1.7402F, 2.0334F, 2, 1, 2, 0.0F, false));

		bone37 = new ModelRenderer(this);
		bone37.setRotationPoint(-1.55F, -44.6045F, -21.4139F);
		carryhandle.addChild(bone37);
		setRotationAngle(bone37, -0.9163F, 0.0F, 0.0F);
		bone37.cubeList.add(new ModelBox(bone37, 34, 4, -1.401F, -0.7355F, -0.2895F, 1, 2, 1, -0.4F, false));
		bone37.cubeList.add(new ModelBox(bone37, 34, 4, -1.401F, -0.6137F, -0.1309F, 1, 2, 1, -0.4F, false));
		bone37.cubeList.add(new ModelBox(bone37, 70, 58, -1.401F, -0.492F, 0.0278F, 1, 2, 1, -0.4F, false));
		bone37.cubeList.add(new ModelBox(bone37, 47, 39, -1.401F, -0.3702F, 0.1865F, 1, 2, 1, -0.4F, false));
		bone37.cubeList.add(new ModelBox(bone37, 30, 33, -1.401F, -0.2955F, 0.3639F, 2, 2, 1, -0.4F, false));

		bone38 = new ModelRenderer(this);
		bone38.setRotationPoint(0.25F, -44.6045F, -21.4139F);
		carryhandle.addChild(bone38);
		setRotationAngle(bone38, -0.9163F, 0.0F, 0.0F);
		bone38.cubeList.add(new ModelBox(bone38, 12, 38, -1.401F, -0.7355F, -0.2895F, 1, 2, 1, -0.4F, false));
		bone38.cubeList.add(new ModelBox(bone38, 27, 33, -1.401F, -0.6137F, -0.1309F, 1, 2, 1, -0.4F, false));
		bone38.cubeList.add(new ModelBox(bone38, 30, 6, -1.401F, -0.492F, 0.0278F, 1, 2, 1, -0.4F, false));
		bone38.cubeList.add(new ModelBox(bone38, 30, 0, -1.401F, -0.3702F, 0.1865F, 1, 2, 1, -0.4F, false));
		bone38.cubeList.add(new ModelBox(bone38, 40, 19, -2.401F, -0.2955F, 0.3639F, 2, 2, 1, -0.4F, false));

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(-1.55F, -44.2071F, -22.0F);
		carryhandle.addChild(bone17);
		setRotationAngle(bone17, -0.5236F, 0.0F, 0.0F);
		bone17.cubeList.add(new ModelBox(bone17, 18, 34, -0.999F, 0.116F, 0.067F, 2, 1, 1, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 46, 75, -0.999F, 2.0476F, 2.2214F, 2, 1, 2, 0.0F, false));

		bone45 = new ModelRenderer(this);
		bone45.setRotationPoint(-1.55F, -43.9864F, -12.0993F);
		carryhandle.addChild(bone45);
		setRotationAngle(bone45, -0.0524F, 0.0F, 0.0F);
		bone45.cubeList.add(new ModelBox(bone45, 70, 70, -1.001F, 0.2644F, 7.9889F, 2, 1, 2, 0.0F, false));

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(-0.15F, -45.05F, -4.35F);
		carryhandle.addChild(bone20);
		setRotationAngle(bone20, 0.0401F, 0.0F, 0.0F);
		bone20.cubeList.add(new ModelBox(bone20, 110, 93, -1.0F, -1.0F, -16.0F, 1, 1, 15, -0.4F, false));
		bone20.cubeList.add(new ModelBox(bone20, 110, 93, -1.0F, -0.8002F, -16.008F, 1, 1, 15, -0.4F, false));
		bone20.cubeList.add(new ModelBox(bone20, 117, 51, -1.002F, -0.6003F, -16.0161F, 1, 1, 15, -0.4F, false));
		bone20.cubeList.add(new ModelBox(bone20, 110, 93, -1.002F, -0.4005F, -16.0241F, 1, 1, 15, -0.4F, false));
		bone20.cubeList.add(new ModelBox(bone20, 117, 5, -0.999F, -0.2006F, -16.0321F, 1, 1, 15, -0.4F, false));

		bone34 = new ModelRenderer(this);
		bone34.setRotationPoint(-1.95F, -45.05F, -4.35F);
		carryhandle.addChild(bone34);
		setRotationAngle(bone34, 0.0401F, 0.0F, 0.0F);
		bone34.cubeList.add(new ModelBox(bone34, 117, 5, -1.0F, -1.0F, -16.0F, 1, 1, 15, -0.4F, false));
		bone34.cubeList.add(new ModelBox(bone34, 117, 5, -1.0F, -0.8002F, -16.008F, 1, 1, 15, -0.4F, false));
		bone34.cubeList.add(new ModelBox(bone34, 117, 5, -1.0F, -0.6003F, -16.0161F, 1, 1, 15, -0.4F, false));
		bone34.cubeList.add(new ModelBox(bone34, 69, 118, -0.999F, -0.4005F, -16.0241F, 1, 1, 15, -0.4F, false));
		bone34.cubeList.add(new ModelBox(bone34, 158, 132, -0.999F, -0.2006F, -16.0321F, 1, 1, 15, -0.4F, false));

		bone33 = new ModelRenderer(this);
		bone33.setRotationPoint(-0.55F, -45.66F, -3.75F);
		carryhandle.addChild(bone33);
		setRotationAngle(bone33, -2.3562F, 0.0F, 0.0F);
		bone33.cubeList.add(new ModelBox(bone33, 47, 75, -0.601F, -1.1679F, -0.1879F, 1, 2, 2, -0.4F, false));

		bone35 = new ModelRenderer(this);
		bone35.setRotationPoint(-2.35F, -45.66F, -3.75F);
		carryhandle.addChild(bone35);
		setRotationAngle(bone35, -2.3562F, 0.0F, 0.0F);
		bone35.cubeList.add(new ModelBox(bone35, 49, 14, -0.601F, -1.1679F, -0.1879F, 1, 2, 2, -0.4F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, -0.4F, 0.0F);
		carryhandle.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -1.0F, -45.1F, -5.3F, 1, 2, 2, -0.4F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -3.1F, -45.1F, -5.3F, 1, 2, 2, -0.4F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		receiver.render(f5);
		carryhandle.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}