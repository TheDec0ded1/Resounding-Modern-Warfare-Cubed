package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class HK416A5Upper extends ModelBase {
	private final ModelRenderer upper;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
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

	public HK416A5Upper() {
		textureWidth = 512;
		textureHeight = 512;

		upper = new ModelRenderer(this);
		upper.setRotationPoint(0.0F, 24.0F, 0.0F);
		upper.cubeList.add(new ModelBox(upper, 100, 425, -1.401F, -40.301F, -22.701F, 1, 1, 2, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 378, 330, -2.601F, -40.301F, -22.702F, 2, 1, 2, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 100, 428, -0.6F, -39.85F, -18.5F, 1, 1, 2, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 498, 168, -0.599F, -39.85F, -19.0F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 438, 74, -1.4F, -40.3F, -22.0F, 1, 1, 23, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 438, 98, -2.6F, -40.3F, -22.0F, 1, 1, 23, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 498, 170, -2.0F, -39.8F, -23.699F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 498, 172, -0.7F, -38.5F, -23.697F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 498, 174, -3.3F, -38.5F, -23.697F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 498, 176, -3.7F, -38.5F, 0.601F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 498, 178, -0.3F, -38.5F, 0.6F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 100, 431, -3.6F, -38.5F, -22.7F, 1, 1, 2, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 400, 360, -0.4F, -38.5F, -22.7F, 1, 1, 24, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 472, 330, -3.6F, -38.5F, -10.7F, 1, 1, 12, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 498, 180, -2.0F, -37.2F, -23.699F, 1, 1, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 432, 181, -2.5F, -37.001F, -22.701F, 2, 2, 1, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 366, 480, -0.6F, -37.1F, -21.201F, 1, 2, 10, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 100, 435, -0.8F, -37.0F, -22.698F, 1, 2, 23, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 482, 277, -3.4F, -37.1F, -20.201F, 1, 2, 10, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 0, 436, -3.2F, -37.0F, -22.699F, 1, 2, 23, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 432, 196, -0.45F, -36.4F, -16.5F, 1, 1, 2, 0.0F, false));
		upper.cubeList.add(new ModelBox(upper, 256, 492, -0.5F, -38.4F, -14.3F, 2, 2, 1, -0.25F, false));
		upper.cubeList.add(new ModelBox(upper, 120, 321, -0.5F, -38.7535F, -13.9465F, 2, 1, 3, -0.25F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.5F, -37.4429F, -13.6965F);
		upper.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.7854F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 78, 497, -1.0F, -1.0F, -1.0F, 2, 1, 1, -0.25F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.2054F, -38.2535F, -11.3806F);
		upper.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, -0.9599F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 476, 491, -1.0F, -0.5F, -1.0F, 2, 1, 2, -0.25F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-0.6137F, -36.2606F, -13.3F);
		upper.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, 0.9599F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 262, 492, -1.0F, -2.0F, -1.0F, 2, 2, 1, -0.25F, false));

		receiver18_r2 = new ModelRenderer(this);
		receiver18_r2.setRotationPoint(-2.6F, -39.25F, 1.0F);
		upper.addChild(receiver18_r2);
		setRotationAngle(receiver18_r2, 0.0F, 0.0F, -0.8029F);
		receiver18_r2.cubeList.add(new ModelBox(receiver18_r2, 498, 182, -0.1806F, -0.6946F, -0.4F, 1, 1, 1, 0.0F, false));

		receiver17_r5 = new ModelRenderer(this);
		receiver17_r5.setRotationPoint(-0.4F, -39.25F, 1.0F);
		upper.addChild(receiver17_r5);
		setRotationAngle(receiver17_r5, 0.0F, 0.0F, 0.8029F);
		receiver17_r5.cubeList.add(new ModelBox(receiver17_r5, 498, 184, -0.8194F, -0.6946F, -0.4F, 1, 1, 1, 0.0F, false));

		receiver14_r4 = new ModelRenderer(this);
		receiver14_r4.setRotationPoint(-3.6F, -37.5F, -11.7F);
		upper.addChild(receiver14_r4);
		setRotationAngle(receiver14_r4, 0.0F, 0.0F, -0.4014F);
		receiver14_r4.cubeList.add(new ModelBox(receiver14_r4, 472, 409, 0.0F, 0.0F, 1.001F, 1, 1, 12, 0.0F, false));
		receiver14_r4.cubeList.add(new ModelBox(receiver14_r4, 172, 466, -0.4F, -0.2F, -8.999F, 1, 2, 11, -0.4F, false));
		receiver14_r4.cubeList.add(new ModelBox(receiver14_r4, 432, 184, 0.0F, 0.0F, -10.998F, 1, 1, 2, 0.0F, false));

		receiver14_r5 = new ModelRenderer(this);
		receiver14_r5.setRotationPoint(-3.2F, -37.5F, -23.7F);
		upper.addChild(receiver14_r5);
		setRotationAngle(receiver14_r5, 0.0F, 0.0F, -0.4014F);
		receiver14_r5.cubeList.add(new ModelBox(receiver14_r5, 498, 186, -0.092F, -0.0391F, 0.003F, 1, 1, 1, 0.0F, false));

		receiver13_r1 = new ModelRenderer(this);
		receiver13_r1.setRotationPoint(0.2F, -37.5F, -23.7F);
		upper.addChild(receiver13_r1);
		setRotationAngle(receiver13_r1, 0.0F, 0.0F, 0.4014F);
		receiver13_r1.cubeList.add(new ModelBox(receiver13_r1, 498, 188, -0.908F, -0.0391F, 0.003F, 1, 1, 1, 0.0F, false));

		receiver12_r1 = new ModelRenderer(this);
		receiver12_r1.setRotationPoint(0.6F, -37.5F, -22.7F);
		upper.addChild(receiver12_r1);
		setRotationAngle(receiver12_r1, 0.0F, 0.0F, 0.4014F);
		receiver12_r1.cubeList.add(new ModelBox(receiver12_r1, 106, 410, -1.0F, 0.0F, 0.001F, 1, 1, 24, 0.0F, false));

		receiver15_r6 = new ModelRenderer(this);
		receiver15_r6.setRotationPoint(-3.7F, -37.5F, 0.6F);
		upper.addChild(receiver15_r6);
		setRotationAngle(receiver15_r6, -0.925F, 0.0F, -0.3142F);
		receiver15_r6.cubeList.add(new ModelBox(receiver15_r6, 176, 359, 0.001F, 0.3F, 0.5F, 1, 2, 1, 0.0F, false));

		receiver14_r6 = new ModelRenderer(this);
		receiver14_r6.setRotationPoint(0.7F, -37.5F, 0.6F);
		upper.addChild(receiver14_r6);
		setRotationAngle(receiver14_r6, -0.925F, 0.0F, 0.3142F);
		receiver14_r6.cubeList.add(new ModelBox(receiver14_r6, 418, 330, -0.999F, 0.3F, 0.5F, 1, 2, 1, 0.0F, false));

		receiver14_r7 = new ModelRenderer(this);
		receiver14_r7.setRotationPoint(-3.7F, -37.5F, 0.6F);
		upper.addChild(receiver14_r7);
		setRotationAngle(receiver14_r7, 0.0F, 0.0F, -0.3142F);
		receiver14_r7.cubeList.add(new ModelBox(receiver14_r7, 434, 385, 0.0F, 0.0F, 0.001F, 1, 2, 1, 0.0F, false));

		receiver13_r2 = new ModelRenderer(this);
		receiver13_r2.setRotationPoint(0.7F, -37.5F, 0.6F);
		upper.addChild(receiver13_r2);
		setRotationAngle(receiver13_r2, 0.0F, 0.0F, 0.3142F);
		receiver13_r2.cubeList.add(new ModelBox(receiver13_r2, 96, 437, -1.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		receiver13_r3 = new ModelRenderer(this);
		receiver13_r3.setRotationPoint(0.7F, -37.5F, 0.6F);
		upper.addChild(receiver13_r3);
		setRotationAngle(receiver13_r3, 0.0F, 0.0F, -0.4014F);
		receiver13_r3.cubeList.add(new ModelBox(receiver13_r3, 498, 190, -0.6083F, -2.1205F, 0.001F, 1, 1, 1, 0.0F, false));
		receiver13_r3.cubeList.add(new ModelBox(receiver13_r3, 498, 192, -0.6093F, -1.9205F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver14_r8 = new ModelRenderer(this);
		receiver14_r8.setRotationPoint(-3.7F, -37.5F, 0.6F);
		upper.addChild(receiver14_r8);
		setRotationAngle(receiver14_r8, 0.0F, 0.0F, 0.4014F);
		receiver14_r8.cubeList.add(new ModelBox(receiver14_r8, 502, 291, -0.3907F, -1.9205F, 0.0F, 1, 1, 1, 0.0F, false));
		receiver14_r8.cubeList.add(new ModelBox(receiver14_r8, 498, 194, -0.3917F, -2.1205F, 0.001F, 1, 1, 1, 0.0F, false));

		receiver14_r9 = new ModelRenderer(this);
		receiver14_r9.setRotationPoint(-2.3F, -38.8F, -11.7F);
		upper.addChild(receiver14_r9);
		setRotationAngle(receiver14_r9, 0.0F, 0.0F, -0.4014F);
		receiver14_r9.cubeList.add(new ModelBox(receiver14_r9, 472, 422, -0.6093F, -0.9205F, 1.001F, 1, 1, 12, 0.0F, false));
		receiver14_r9.cubeList.add(new ModelBox(receiver14_r9, 432, 187, -0.6093F, -0.9205F, -10.999F, 1, 1, 2, 0.0F, false));

		receiver15_r7 = new ModelRenderer(this);
		receiver15_r7.setRotationPoint(-1.9F, -36.2F, -23.7F);
		upper.addChild(receiver15_r7);
		setRotationAngle(receiver15_r7, 0.0F, 0.0F, 0.4014F);
		receiver15_r7.cubeList.add(new ModelBox(receiver15_r7, 498, 196, -1.092F, -0.9609F, 0.001F, 1, 1, 1, 0.0F, false));

		receiver14_r10 = new ModelRenderer(this);
		receiver14_r10.setRotationPoint(-1.1F, -36.2F, -23.7F);
		upper.addChild(receiver14_r10);
		setRotationAngle(receiver14_r10, 0.0F, 0.0F, -0.4014F);
		receiver14_r10.cubeList.add(new ModelBox(receiver14_r10, 498, 198, 0.0921F, -0.9609F, 0.001F, 1, 1, 1, 0.0F, false));

		receiver14_r11 = new ModelRenderer(this);
		receiver14_r11.setRotationPoint(-1.9F, -38.8F, -23.7F);
		upper.addChild(receiver14_r11);
		setRotationAngle(receiver14_r11, 0.0F, 0.0F, -0.4014F);
		receiver14_r11.cubeList.add(new ModelBox(receiver14_r11, 498, 200, -0.7013F, -0.9596F, 0.004F, 1, 1, 1, 0.0F, false));

		receiver13_r4 = new ModelRenderer(this);
		receiver13_r4.setRotationPoint(-1.1F, -38.8F, -23.7F);
		upper.addChild(receiver13_r4);
		setRotationAngle(receiver13_r4, 0.0F, 0.0F, 0.4014F);
		receiver13_r4.cubeList.add(new ModelBox(receiver13_r4, 498, 202, -0.2987F, -0.9596F, 0.004F, 1, 1, 1, 0.0F, false));

		receiver12_r2 = new ModelRenderer(this);
		receiver12_r2.setRotationPoint(-0.7F, -38.8F, -22.7F);
		upper.addChild(receiver12_r2);
		setRotationAngle(receiver12_r2, 0.0F, 0.0F, 0.4014F);
		receiver12_r2.cubeList.add(new ModelBox(receiver12_r2, 0, 411, -0.3907F, -0.9205F, 0.001F, 1, 1, 24, 0.0F, false));

		receiver13_r5 = new ModelRenderer(this);
		receiver13_r5.setRotationPoint(-3.6F, -37.5F, -11.7F);
		upper.addChild(receiver13_r5);
		setRotationAngle(receiver13_r5, 0.0F, 0.0F, 0.4014F);
		receiver13_r5.cubeList.add(new ModelBox(receiver13_r5, 480, 306, -0.3907F, -1.9205F, 1.0F, 1, 1, 12, 0.0F, false));
		receiver13_r5.cubeList.add(new ModelBox(receiver13_r5, 432, 190, -0.3907F, -1.9205F, -11.0F, 1, 1, 2, 0.0F, false));

		receiver13_r6 = new ModelRenderer(this);
		receiver13_r6.setRotationPoint(-3.2F, -37.5F, -23.7F);
		upper.addChild(receiver13_r6);
		setRotationAngle(receiver13_r6, 0.0F, 0.0F, 0.4014F);
		receiver13_r6.cubeList.add(new ModelBox(receiver13_r6, 498, 204, -0.4828F, -1.8814F, 0.003F, 1, 1, 1, 0.0F, false));

		receiver12_r3 = new ModelRenderer(this);
		receiver12_r3.setRotationPoint(0.2F, -37.5F, -23.7F);
		upper.addChild(receiver12_r3);
		setRotationAngle(receiver12_r3, 0.0F, 0.0F, -0.4014F);
		receiver12_r3.cubeList.add(new ModelBox(receiver12_r3, 498, 206, -0.5172F, -1.8814F, 0.003F, 1, 1, 1, 0.0F, false));

		receiver11_r1 = new ModelRenderer(this);
		receiver11_r1.setRotationPoint(0.6F, -37.5F, -22.7F);
		upper.addChild(receiver11_r1);
		setRotationAngle(receiver11_r1, 0.0F, 0.0F, -0.4014F);
		receiver11_r1.cubeList.add(new ModelBox(receiver11_r1, 50, 412, -0.6093F, -1.9205F, 0.0F, 1, 1, 24, 0.0F, false));

		receiver16_r7 = new ModelRenderer(this);
		receiver16_r7.setRotationPoint(0.4F, -38.85F, -19.0F);
		upper.addChild(receiver16_r7);
		setRotationAngle(receiver16_r7, 0.0F, 0.0F, 1.9705F);
		receiver16_r7.cubeList.add(new ModelBox(receiver16_r7, 498, 208, -0.9202F, 0.3892F, 0.0F, 1, 1, 1, 0.0F, false));
		receiver16_r7.cubeList.add(new ModelBox(receiver16_r7, 432, 193, -0.9212F, 0.3892F, 0.5F, 1, 1, 2, 0.0F, false));

		receiver18_r3 = new ModelRenderer(this);
		receiver18_r3.setRotationPoint(0.4F, -38.85F, -19.0F);
		upper.addChild(receiver18_r3);
		setRotationAngle(receiver18_r3, 0.0F, -1.9333F, 0.0F);
		receiver18_r3.cubeList.add(new ModelBox(receiver18_r3, 498, 210, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver17_r6 = new ModelRenderer(this);
		receiver17_r6.setRotationPoint(0.4F, -38.85F, -16.5F);
		upper.addChild(receiver17_r6);
		setRotationAngle(receiver17_r6, 0.0F, 1.9333F, 0.0F);
		receiver17_r6.cubeList.add(new ModelBox(receiver17_r6, 498, 212, 0.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

		gun125_r1 = new ModelRenderer(this);
		gun125_r1.setRotationPoint(-2.5F, -40.1F, -1.0F);
		upper.addChild(gun125_r1);
		setRotationAngle(gun125_r1, -0.632F, 0.0F, 0.0F);
		gun125_r1.cubeList.add(new ModelBox(gun125_r1, 230, 386, -0.001F, -1.3976F, 0.2161F, 2, 1, 2, 0.0F, false));

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
		gun264.cubeList.add(new ModelBox(gun264, 172, 479, -1.1234F, -2.9804F, -0.3F, 1, 3, 10, -0.3F, false));
		gun264.cubeList.add(new ModelBox(gun264, 502, 293, -1.1234F, -1.2804F, 4.05F, 1, 1, 1, -0.1F, false));
		gun264.cubeList.add(new ModelBox(gun264, 498, 214, -1.1244F, -1.6804F, 4.049F, 1, 1, 1, -0.1F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-2.3F, -44.1F, -39.75F);
		upper.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 276, 215, 0.75F, 2.35F, 17.051F, 1, 1, 24, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 394, 156, -0.15F, 2.349F, 17.05F, 1, 1, 24, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 384, 360, -0.201F, 2.999F, 17.05F, 2, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 96, 460, -0.2F, 3.0F, 17.75F, 2, 1, 22, 0.0F, false));

		rails = new ModelRenderer(this);
		rails.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(rails);
		rails.cubeList.add(new ModelBox(rails, 258, 301, -0.2F, 1.7F, 35.35F, 2, 1, 1, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 496, 437, -0.2F, 1.7F, 36.55F, 2, 1, 1, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 266, 171, -0.2F, 1.7F, 37.75F, 2, 1, 3, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 386, 301, -0.2F, 1.7F, 34.15F, 2, 1, 1, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 390, 360, -0.2F, 1.7F, 32.95F, 2, 1, 1, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 392, 301, -0.2F, 1.7F, 31.75F, 2, 1, 1, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 398, 301, -0.2F, 1.7F, 30.55F, 2, 1, 1, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 404, 301, -0.2F, 1.7F, 29.35F, 2, 1, 1, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 410, 301, -0.2F, 1.7F, 28.15F, 2, 1, 1, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 416, 301, -0.2F, 1.7F, 26.95F, 2, 1, 1, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 440, 24, -0.2F, 1.7F, 25.75F, 2, 1, 1, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 446, 24, -0.2F, 1.7F, 24.55F, 2, 1, 1, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 498, 150, -0.2F, 1.7F, 23.35F, 2, 1, 1, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 446, 154, -0.2F, 1.7F, 22.15F, 2, 1, 1, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 452, 24, -0.2F, 1.7F, 20.95F, 2, 1, 1, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 452, 154, -0.2F, 1.7F, 19.75F, 2, 1, 1, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 458, 24, -0.2F, 1.7F, 18.55F, 2, 1, 1, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 458, 154, -0.2F, 1.7F, 17.35F, 2, 1, 1, -0.2F, false));

		cube_r82 = new ModelRenderer(this);
		cube_r82.setRotationPoint(0.0F, -1.0F, 0.0F);
		rails.addChild(cube_r82);
		setRotationAngle(cube_r82, 0.0F, 0.0F, -0.7854F);
		cube_r82.cubeList.add(new ModelBox(cube_r82, 176, 362, -2.8506F, 1.8506F, 35.35F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 382, 499, -2.8506F, 1.8506F, 36.55F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 202, 492, -2.8506F, 1.8506F, 37.75F, 1, 1, 2, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 202, 462, -2.8506F, 1.8506F, 34.15F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 92, 463, -2.8506F, 1.8506F, 32.95F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 144, 464, -2.8506F, 1.8506F, 31.75F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 92, 465, -2.8506F, 1.8506F, 30.55F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 92, 467, -2.8506F, 1.8506F, 29.35F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 468, 409, -2.8506F, 1.8506F, 28.15F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 468, 411, -2.8506F, 1.8506F, 26.95F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 468, 413, -2.8506F, 1.8506F, 25.75F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 92, 469, -2.8506F, 1.8506F, 24.55F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 502, 357, -2.8506F, 1.8506F, 23.35F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 92, 471, -2.8506F, 1.8506F, 22.15F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 92, 473, -2.8506F, 1.8506F, 20.95F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 92, 475, -2.8506F, 1.8506F, 19.75F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 92, 477, -2.8506F, 1.8506F, 18.55F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 478, 277, -2.8506F, 1.8506F, 17.35F, 1, 1, 1, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 46, 461, -2.9996F, 1.8746F, 16.701F, 1, 1, 22, -0.35F, false));

		cube_r83 = new ModelRenderer(this);
		cube_r83.setRotationPoint(1.6F, -1.0F, 3.25F);
		rails.addChild(cube_r83);
		setRotationAngle(cube_r83, 0.0F, 0.0F, -0.7854F);
		cube_r83.cubeList.add(new ModelBox(cube_r83, 396, 360, -2.8506F, 1.8506F, 32.1F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 378, 499, -2.8506F, 1.8506F, 33.3F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 196, 492, -2.8506F, 1.8506F, 34.5F, 1, 1, 2, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 478, 279, -2.8506F, 1.8506F, 30.9F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 92, 479, -2.8506F, 1.8506F, 29.7F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 92, 481, -2.8506F, 1.8506F, 28.5F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 482, 24, -2.8506F, 1.8506F, 27.3F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 488, 154, -2.8506F, 1.8506F, 26.1F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 408, 492, -2.8506F, 1.8506F, 24.9F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 498, 152, -2.8506F, 1.8506F, 23.7F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 498, 154, -2.8506F, 1.8506F, 22.5F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 498, 156, -2.8506F, 1.8506F, 21.3F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 502, 359, -2.8506F, 1.8506F, 20.1F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 498, 158, -2.8506F, 1.8506F, 18.9F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 498, 160, -2.8506F, 1.8506F, 17.7F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 498, 162, -2.8506F, 1.8506F, 16.5F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 498, 164, -2.8506F, 1.8506F, 15.3F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 498, 166, -2.8506F, 1.8506F, 14.1F, 1, 1, 1, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 398, 463, -2.8746F, 1.9996F, 13.451F, 1, 1, 22, -0.35F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-3.1F, -37.8F, -6.0F);
		upper.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 354, 499, -0.5F, -0.7F, -15.0F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 358, 499, -1.325F, 0.4F, -15.0F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 184, 492, -1.325F, -0.6F, -4.9F, 2, 2, 1, -0.2F, false));

		gun140_r2 = new ModelRenderer(this);
		gun140_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(gun140_r2);
		setRotationAngle(gun140_r2, 0.0F, -0.2603F, 0.0F);
		gun140_r2.cubeList.add(new ModelBox(gun140_r2, 446, 146, -0.1397F, -0.7F, -0.4842F, 2, 1, 7, 0.0F, false));
		gun140_r2.cubeList.add(new ModelBox(gun140_r2, 464, 146, 0.0846F, -1.3243F, -0.2842F, 2, 1, 7, -0.2F, false));
		gun140_r2.cubeList.add(new ModelBox(gun140_r2, 470, 453, 0.0846F, -0.0757F, -0.2842F, 2, 1, 7, -0.2F, false));

		gun340_r3_r1 = new ModelRenderer(this);
		gun340_r3_r1.setRotationPoint(0.6381F, 5.6535F, 3.2158F);
		gun140_r2.addChild(gun340_r3_r1);
		setRotationAngle(gun340_r3_r1, 0.0F, 0.0F, 0.7854F);
		gun340_r3_r1.cubeList.add(new ModelBox(gun340_r3_r1, 108, 483, -4.5355F, -4.0355F, -3.5F, 1, 1, 7, -0.2F, false));

		gun240_r2_r1 = new ModelRenderer(this);
		gun240_r2_r1.setRotationPoint(0.6381F, 4.6535F, 3.2158F);
		gun140_r2.addChild(gun240_r2_r1);
		setRotationAngle(gun240_r2_r1, 0.0F, 0.0F, 0.7854F);
		gun240_r2_r1.cubeList.add(new ModelBox(gun240_r2_r1, 92, 483, -4.5355F, -4.0355F, -3.5F, 1, 1, 7, -0.2F, false));

		gun143_r2 = new ModelRenderer(this);
		gun143_r2.setRotationPoint(-1.6F, -0.2F, 6.5F);
		bone5.addChild(gun143_r2);
		setRotationAngle(gun143_r2, 0.0F, -0.2603F, 0.0F);
		gun143_r2.cubeList.add(new ModelBox(gun143_r2, 492, 175, -0.6287F, -1.0F, 0.9168F, 2, 2, 1, -0.4F, false));
		gun143_r2.cubeList.add(new ModelBox(gun143_r2, 178, 492, -0.1287F, -0.5F, -0.5832F, 1, 1, 2, 0.0F, false));

		gun264_r4 = new ModelRenderer(this);
		gun264_r4.setRotationPoint(-1.4F, 1.0F, -16.4F);
		bone5.addChild(gun264_r4);
		setRotationAngle(gun264_r4, 0.0F, 0.0F, -0.9295F);
		gun264_r4.cubeList.add(new ModelBox(gun264_r4, 190, 492, -0.0748F, -0.1002F, 5.95F, 1, 1, 2, -0.2F, false));
		gun264_r4.cubeList.add(new ModelBox(gun264_r4, 470, 439, -0.0748F, -0.1002F, 0.1F, 1, 1, 13, -0.3F, false));

		gun263_r4 = new ModelRenderer(this);
		gun263_r4.setRotationPoint(-0.7F, 0.3F, -15.0F);
		bone5.addChild(gun263_r4);
		setRotationAngle(gun263_r4, 0.0F, 0.0F, 0.4014F);
		gun263_r4.cubeList.add(new ModelBox(gun263_r4, 362, 499, -0.2306F, -2.2089F, -0.001F, 1, 1, 1, 0.0F, false));

		gun264_r3 = new ModelRenderer(this);
		gun264_r3.setRotationPoint(-0.22F, -0.82F, -15.0F);
		bone5.addChild(gun264_r3);
		setRotationAngle(gun264_r3, 0.0F, 0.0F, 0.8203F);
		gun264_r3.cubeList.add(new ModelBox(gun264_r3, 472, 343, -0.612F, -1.81F, 0.0F, 1, 1, 11, 0.0F, false));

		gun263_r3 = new ModelRenderer(this);
		gun263_r3.setRotationPoint(-1.2F, 0.4F, -15.0F);
		bone5.addChild(gun263_r3);
		setRotationAngle(gun263_r3, 0.0F, 0.0F, -0.3491F);
		gun263_r3.cubeList.add(new ModelBox(gun263_r3, 502, 295, -0.1174F, -0.0428F, -0.001F, 1, 1, 1, 0.0F, false));

		gun2 = new ModelRenderer(this);
		gun2.setRotationPoint(-0.4F, -1.45F, -4.3F);
		bone5.addChild(gun2);
		setRotationAngle(gun2, 0.0F, 0.0F, -0.0524F);
		

		gun170_r1 = new ModelRenderer(this);
		gun170_r1.setRotationPoint(0.5502F, 0.2491F, 0.2879F);
		gun2.addChild(gun170_r1);
		setRotationAngle(gun170_r1, 0.0F, 0.0F, 0.3054F);
		gun170_r1.cubeList.add(new ModelBox(gun170_r1, 412, 491, -1.9351F, -0.9808F, 0.5871F, 3, 2, 1, 0.0F, false));

		gun172_r3 = new ModelRenderer(this);
		gun172_r3.setRotationPoint(-1.3F, -0.05F, 1.0F);
		gun2.addChild(gun172_r3);
		setRotationAngle(gun172_r3, 0.0F, -0.2618F, 0.0F);
		

		gun172_r1_r1 = new ModelRenderer(this);
		gun172_r1_r1.setRotationPoint(1.6028F, 0.2991F, -1.1667F);
		gun172_r3.addChild(gun172_r1_r1);
		setRotationAngle(gun172_r1_r1, 0.0779F, -0.0116F, 0.2947F);
		gun172_r1_r1.cubeList.add(new ModelBox(gun172_r1_r1, 420, 491, -1.4584F, -0.9798F, 1.0339F, 3, 2, 1, 0.0F, false));

		gun172_r4 = new ModelRenderer(this);
		gun172_r4.setRotationPoint(-1.3F, -0.05F, 0.0F);
		gun2.addChild(gun172_r4);
		setRotationAngle(gun172_r4, 0.0F, -0.9076F, 0.0F);
		

		gun172_r2_r1 = new ModelRenderer(this);
		gun172_r2_r1.setRotationPoint(1.3659F, 0.2991F, -1.2807F);
		gun172_r4.addChild(gun172_r2_r1);
		setRotationAngle(gun172_r2_r1, 0.2393F, -0.0225F, 0.1862F);
		gun172_r2_r1.cubeList.add(new ModelBox(gun172_r2_r1, 252, 321, -0.7287F, -0.9798F, -0.1136F, 1, 2, 2, 0.0F, false));
		gun172_r2_r1.cubeList.add(new ModelBox(gun172_r2_r1, 96, 440, -0.3167F, -0.9798F, -0.1293F, 1, 2, 1, 0.0F, false));

		receiver13_r7 = new ModelRenderer(this);
		receiver13_r7.setRotationPoint(-0.5F, 0.3F, -5.7F);
		bone5.addChild(receiver13_r7);
		setRotationAngle(receiver13_r7, 0.0F, 0.0F, 0.4014F);
		receiver13_r7.cubeList.add(new ModelBox(receiver13_r7, 366, 499, -0.3907F, -1.9205F, -9.3F, 1, 1, 1, 0.0F, false));

		receiver14_r12 = new ModelRenderer(this);
		receiver14_r12.setRotationPoint(0.8F, -1.0F, -5.7F);
		bone5.addChild(receiver14_r12);
		setRotationAngle(receiver14_r12, 0.0F, 0.0F, -0.4014F);
		receiver14_r12.cubeList.add(new ModelBox(receiver14_r12, 370, 499, -0.6093F, -0.9205F, -9.299F, 1, 1, 1, 0.0F, false));
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