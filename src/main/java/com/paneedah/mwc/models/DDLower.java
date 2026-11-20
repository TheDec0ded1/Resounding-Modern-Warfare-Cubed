package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class DDLower extends ModelBase {
	private final ModelRenderer lower;
	private final ModelRenderer gun_r1;
	private final ModelRenderer receiver16_r3;
	private final ModelRenderer receiver15_r2;
	private final ModelRenderer receiver16_r4;
	private final ModelRenderer receiver15_r3;
	private final ModelRenderer receiver14_r2;
	private final ModelRenderer receiver14_r3;
	private final ModelRenderer receiver17_r4;
	private final ModelRenderer receiver16_r5;
	private final ModelRenderer receiver15_r4;
	private final ModelRenderer receiver15_r5;
	private final ModelRenderer gun30_r1;
	private final ModelRenderer gun29_r1;
	private final ModelRenderer gun28_r1;
	private final ModelRenderer gun39_r1;
	private final ModelRenderer gun38_r1;
	private final ModelRenderer gun37_r1;
	private final ModelRenderer gun37_r2;
	private final ModelRenderer gun51_r1;
	private final ModelRenderer gun53_r1;
	private final ModelRenderer gun58_r1;
	private final ModelRenderer gun63_r1;
	private final ModelRenderer gun80_r1;
	private final ModelRenderer gun82_r1;
	private final ModelRenderer gun152_r1;
	private final ModelRenderer gun156_r1;
	private final ModelRenderer bone_r1;
	private final ModelRenderer gun132;
	private final ModelRenderer gun133_r1;
	private final ModelRenderer gun134_r1;
	private final ModelRenderer gun133_r2;
	private final ModelRenderer gun134_r2;
	private final ModelRenderer gun67;
	private final ModelRenderer gun60;

	public DDLower() {
		textureWidth = 432;
		textureHeight = 432;

		lower = new ModelRenderer(this);
		lower.setRotationPoint(0.0F, 24.0F, 0.0F);
		lower.cubeList.add(new ModelBox(lower, 338, 107, 0.15F, -36.1F, -12.75F, 1, 2, 1, -0.2F, false));
		lower.cubeList.add(new ModelBox(lower, 48, 406, 0.2F, -34.6F, -12.751F, 1, 1, 1, -0.2F, false));
		lower.cubeList.add(new ModelBox(lower, 338, 104, -4.4F, -36.0F, -9.5F, 1, 2, 1, -0.2F, false));
		lower.cubeList.add(new ModelBox(lower, 208, 410, -4.45F, -34.5F, -9.501F, 1, 1, 1, -0.2F, false));
		lower.cubeList.add(new ModelBox(lower, 36, 404, -0.1F, -36.0F, -12.5F, 1, 2, 1, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 170, 403, -0.1F, -36.0F, -13.4F, 1, 2, 1, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 338, 101, 0.1F, -32.7F, -14.0F, 1, 2, 1, -0.2F, false));
		lower.cubeList.add(new ModelBox(lower, 62, 405, 0.1F, -31.7F, -14.0F, 1, 2, 1, -0.2F, false));
		lower.cubeList.add(new ModelBox(lower, 58, 405, 0.15F, -32.725F, -13.45F, 1, 2, 1, -0.2F, false));
		lower.cubeList.add(new ModelBox(lower, 410, 215, -0.1F, -32.5F, -13.2F, 1, 1, 1, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 216, 124, -0.35F, -32.8F, -16.5F, 1, 6, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 406, 48, -3.7F, -33.9F, -13.0F, 1, 1, 1, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 410, 209, -3.7F, -33.4F, -13.0F, 1, 1, 1, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 410, 313, -3.801F, -32.001F, -12.4F, 1, 1, 1, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 382, 146, -3.8F, -32.0F, -13.7F, 1, 1, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 62, 241, -3.8F, -35.3F, -14.7F, 1, 4, 1, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 314, 397, -3.9F, -35.3F, -21.4F, 1, 1, 3, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 380, 300, -4.1F, -35.3F, -14.4F, 1, 1, 6, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 284, 149, -3.0F, -33.35F, -1.0F, 3, 1, 4, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 366, 300, -3.3F, -36.0F, -1.001F, 3, 3, 4, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 182, 393, -0.7F, -36.0F, -0.998F, 1, 3, 4, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 272, 215, -3.501F, -35.7F, -22.7F, 4, 1, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 386, 87, -0.4F, -33.5F, -16.3F, 1, 1, 5, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 278, 120, -0.35F, -36.0F, -16.5F, 1, 2, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 400, 167, -0.35F, -34.3F, -16.5F, 1, 1, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 386, 361, -3.5F, -36.0F, -13.2F, 4, 4, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 178, 132, -3.5F, -36.0F, -21.2F, 4, 8, 8, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 312, 242, -3.5F, -28.0F, -18.2F, 4, 1, 5, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 406, 50, -0.3F, -34.5F, -6.3F, 1, 1, 1, -0.3F, false));
		lower.cubeList.add(new ModelBox(lower, 410, 307, -0.3F, -34.5F, -2.8F, 1, 1, 1, -0.3F, false));
		lower.cubeList.add(new ModelBox(lower, 52, 406, -0.3F, -34.5F, -5.9F, 1, 1, 1, -0.3F, false));
		lower.cubeList.add(new ModelBox(lower, 406, 52, -0.3F, -34.5F, -2.4F, 1, 1, 1, -0.3F, false));
		lower.cubeList.add(new ModelBox(lower, 382, 331, -3.3F, -36.0F, -14.0F, 3, 5, 13, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 242, 384, -0.7F, -36.0F, -14.0F, 1, 5, 13, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 66, 205, -3.001F, -32.0F, -13.8F, 3, 5, 1, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 66, 385, -3.001F, -27.0F, -13.3F, 3, 1, 7, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 66, 211, -2.999F, -31.0F, -6.5F, 3, 5, 1, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 66, 198, -2.6F, -40.401F, 1.0015F, 2, 5, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 344, 275, -3.8F, -38.5F, 1.0F, 2, 1, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 350, 146, -1.2F, -38.5F, 1.0012F, 2, 1, 2, 0.0F, false));
		lower.cubeList.add(new ModelBox(lower, 182, 271, -1.4F, -40.4F, 1.0025F, 1, 5, 2, 0.0F, false));

		gun_r1 = new ModelRenderer(this);
		gun_r1.setRotationPoint(-3.3956F, -34.8F, -8.3384F);
		lower.addChild(gun_r1);
		setRotationAngle(gun_r1, 0.0F, 0.6981F, 0.0F);
		gun_r1.cubeList.add(new ModelBox(gun_r1, 312, 410, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		receiver16_r3 = new ModelRenderer(this);
		receiver16_r3.setRotationPoint(-3.8F, -37.5F, 1.0F);
		lower.addChild(receiver16_r3);
		setRotationAngle(receiver16_r3, -0.925F, 0.0F, -0.2618F);
		receiver16_r3.cubeList.add(new ModelBox(receiver16_r3, 400, 146, 0.001F, -0.2F, 0.7F, 1, 2, 2, 0.0F, false));

		receiver15_r2 = new ModelRenderer(this);
		receiver15_r2.setRotationPoint(0.8F, -37.5F, 1.0F);
		lower.addChild(receiver15_r2);
		setRotationAngle(receiver15_r2, -0.925F, 0.0F, 0.2618F);
		receiver15_r2.cubeList.add(new ModelBox(receiver15_r2, 400, 150, -0.999F, -0.2F, 0.7F, 1, 2, 2, 0.0F, false));

		receiver16_r4 = new ModelRenderer(this);
		receiver16_r4.setRotationPoint(-3.37F, -35.9F, 0.0F);
		lower.addChild(receiver16_r4);
		setRotationAngle(receiver16_r4, 0.0F, 0.0F, -0.0524F);
		receiver16_r4.cubeList.add(new ModelBox(receiver16_r4, 50, 338, 0.0F, 0.0F, 0.001F, 1, 2, 3, 0.0F, false));

		receiver15_r3 = new ModelRenderer(this);
		receiver15_r3.setRotationPoint(0.37F, -35.9F, 0.0F);
		lower.addChild(receiver15_r3);
		setRotationAngle(receiver15_r3, 0.0F, 0.0F, 0.0524F);
		receiver15_r3.cubeList.add(new ModelBox(receiver15_r3, 50, 343, -1.0F, 0.0F, 0.001F, 1, 2, 3, 0.0F, false));

		receiver14_r2 = new ModelRenderer(this);
		receiver14_r2.setRotationPoint(0.8F, -37.5F, 1.0F);
		lower.addChild(receiver14_r2);
		setRotationAngle(receiver14_r2, 0.0F, 0.0F, 0.2618F);
		receiver14_r2.cubeList.add(new ModelBox(receiver14_r2, 322, 397, -2.0F, 0.0F, 0.0012F, 2, 2, 2, 0.0F, false));

		receiver14_r3 = new ModelRenderer(this);
		receiver14_r3.setRotationPoint(0.8F, -37.5F, 1.0F);
		lower.addChild(receiver14_r3);
		setRotationAngle(receiver14_r3, 0.0F, 0.0F, -0.4014F);
		receiver14_r3.cubeList.add(new ModelBox(receiver14_r3, 320, 275, -1.6083F, -2.2205F, 0.001F, 2, 1, 2, 0.0F, false));
		receiver14_r3.cubeList.add(new ModelBox(receiver14_r3, 388, 170, -0.6093F, -1.9205F, 0.0F, 1, 1, 2, 0.0F, false));

		receiver17_r4 = new ModelRenderer(this);
		receiver17_r4.setRotationPoint(-2.6F, -39.4F, 1.0F);
		lower.addChild(receiver17_r4);
		setRotationAngle(receiver17_r4, 0.0F, 0.0F, -0.8029F);
		receiver17_r4.cubeList.add(new ModelBox(receiver17_r4, 394, 170, -0.2806F, -0.6946F, 0.0F, 1, 1, 2, 0.0F, false));

		receiver16_r5 = new ModelRenderer(this);
		receiver16_r5.setRotationPoint(-0.4F, -39.4F, 1.0F);
		lower.addChild(receiver16_r5);
		setRotationAngle(receiver16_r5, 0.0F, 0.0F, 0.8029F);
		receiver16_r5.cubeList.add(new ModelBox(receiver16_r5, 400, 158, -0.7194F, -0.6946F, 0.0F, 1, 1, 2, 0.0F, false));

		receiver15_r4 = new ModelRenderer(this);
		receiver15_r4.setRotationPoint(-3.8F, -37.5F, 1.0F);
		lower.addChild(receiver15_r4);
		setRotationAngle(receiver15_r4, 0.0F, 0.0F, -0.2618F);
		receiver15_r4.cubeList.add(new ModelBox(receiver15_r4, 330, 397, 0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

		receiver15_r5 = new ModelRenderer(this);
		receiver15_r5.setRotationPoint(-3.8F, -37.5F, 1.0F);
		lower.addChild(receiver15_r5);
		setRotationAngle(receiver15_r5, 0.0F, 0.0F, 0.4014F);
		receiver15_r5.cubeList.add(new ModelBox(receiver15_r5, 400, 161, -0.3917F, -2.2205F, 0.001F, 1, 1, 2, 0.0F, false));
		receiver15_r5.cubeList.add(new ModelBox(receiver15_r5, 328, 275, -0.3907F, -1.9205F, -0.001F, 2, 1, 2, 0.0F, false));

		gun30_r1 = new ModelRenderer(this);
		gun30_r1.setRotationPoint(-3.2F, -31.0F, -7.6F);
		lower.addChild(gun30_r1);
		setRotationAngle(gun30_r1, -2.3562F, 0.0F, 0.0F);
		gun30_r1.cubeList.add(new ModelBox(gun30_r1, 336, 275, 0.2F, -2.0F, -1.0F, 3, 2, 1, 0.0F, false));

		gun29_r1 = new ModelRenderer(this);
		gun29_r1.setRotationPoint(-3.2F, -27.0F, -7.6F);
		lower.addChild(gun29_r1);
		setRotationAngle(gun29_r1, -2.3562F, 0.0F, 0.0F);
		gun29_r1.cubeList.add(new ModelBox(gun29_r1, 296, 215, 0.2F, -1.0F, -2.0F, 3, 1, 2, 0.0F, false));

		gun28_r1 = new ModelRenderer(this);
		gun28_r1.setRotationPoint(-3.2F, -27.0F, -11.5F);
		lower.addChild(gun28_r1);
		setRotationAngle(gun28_r1, -2.3562F, 0.0F, 0.0F);
		gun28_r1.cubeList.add(new ModelBox(gun28_r1, 342, 146, 0.2F, 0.0F, 0.0F, 3, 2, 1, 0.0F, false));

		gun39_r1 = new ModelRenderer(this);
		gun39_r1.setRotationPoint(0.5F, -33.7F, -11.3F);
		lower.addChild(gun39_r1);
		setRotationAngle(gun39_r1, -0.3665F, 0.0F, 0.0F);
		gun39_r1.cubeList.add(new ModelBox(gun39_r1, 78, 406, -1.05F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));
		gun39_r1.cubeList.add(new ModelBox(gun39_r1, 410, 211, -3.95F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		gun38_r1 = new ModelRenderer(this);
		gun38_r1.setRotationPoint(0.5F, -32.7F, -7.6F);
		lower.addChild(gun38_r1);
		setRotationAngle(gun38_r1, -0.3665F, 0.0F, 0.0F);
		gun38_r1.cubeList.add(new ModelBox(gun38_r1, 406, 78, -1.05F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));
		gun38_r1.cubeList.add(new ModelBox(gun38_r1, 410, 213, -3.95F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		gun37_r1 = new ModelRenderer(this);
		gun37_r1.setRotationPoint(-3.4F, -33.0F, -4.2F);
		lower.addChild(gun37_r1);
		setRotationAngle(gun37_r1, -0.3665F, 0.0F, 0.0F);
		gun37_r1.cubeList.add(new ModelBox(gun37_r1, 170, 146, 0.0F, -0.8208F, -0.4668F, 3, 1, 1, 0.0F, false));

		gun37_r2 = new ModelRenderer(this);
		gun37_r2.setRotationPoint(-2.6F, -34.7F, -0.6F);
		lower.addChild(gun37_r2);
		setRotationAngle(gun37_r2, -0.3665F, 0.0F, 0.0F);
		gun37_r2.cubeList.add(new ModelBox(gun37_r2, 212, 146, 0.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));
		gun37_r2.cubeList.add(new ModelBox(gun37_r2, 282, 183, -0.8F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun51_r1 = new ModelRenderer(this);
		gun51_r1.setRotationPoint(-3.9F, -27.5F, -21.2F);
		lower.addChild(gun51_r1);
		setRotationAngle(gun51_r1, 1.3756F, 0.0F, 0.0F);
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 386, 78, 0.1F, 0.0806F, 0.0981F, 4, 8, 1, 0.0F, false));
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 150, 146, 0.101F, -0.4194F, 0.098F, 4, 1, 1, 0.0F, false));
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 62, 220, 3.7F, 0.08F, 0.098F, 1, 8, 1, 0.0F, false));
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 406, 80, 3.699F, -0.42F, 0.1F, 1, 1, 1, 0.0F, false));

		gun53_r1 = new ModelRenderer(this);
		gun53_r1.setRotationPoint(-3.5F, -32.0F, -11.2F);
		lower.addChild(gun53_r1);
		setRotationAngle(gun53_r1, -2.7884F, 0.0F, 0.0F);
		gun53_r1.cubeList.add(new ModelBox(gun53_r1, 338, 397, 2.999F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun58_r1 = new ModelRenderer(this);
		gun58_r1.setRotationPoint(-3.5F, -34.5F, -22.7F);
		lower.addChild(gun58_r1);
		setRotationAngle(gun58_r1, 0.9082F, 0.0F, 0.0F);
		gun58_r1.cubeList.add(new ModelBox(gun58_r1, 310, 275, -0.002F, -0.123F, 0.1577F, 4, 2, 1, 0.0F, false));

		gun63_r1 = new ModelRenderer(this);
		gun63_r1.setRotationPoint(-2.0F, -30.2F, -8.95F);
		lower.addChild(gun63_r1);
		setRotationAngle(gun63_r1, -0.409F, 0.0F, 0.0F);
		gun63_r1.cubeList.add(new ModelBox(gun63_r1, 62, 236, 0.0F, -2.0F, 0.0F, 1, 4, 1, 0.0F, false));

		gun80_r1 = new ModelRenderer(this);
		gun80_r1.setRotationPoint(-3.8F, -31.3F, -14.7F);
		lower.addChild(gun80_r1);
		setRotationAngle(gun80_r1, 0.0F, 0.0F, -0.2603F);
		gun80_r1.cubeList.add(new ModelBox(gun80_r1, 338, 110, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun82_r1 = new ModelRenderer(this);
		gun82_r1.setRotationPoint(-3.8F, -34.3F, -14.7F);
		lower.addChild(gun82_r1);
		setRotationAngle(gun82_r1, 0.0F, 0.7436F, 0.0F);
		gun82_r1.cubeList.add(new ModelBox(gun82_r1, 336, 149, 0.0F, -1.0F, 0.0F, 1, 4, 1, 0.0F, false));

		gun152_r1 = new ModelRenderer(this);
		gun152_r1.setRotationPoint(-0.7F, -33.5F, -4.7F);
		lower.addChild(gun152_r1);
		setRotationAngle(gun152_r1, 0.7854F, 0.0F, 0.0F);
		gun152_r1.cubeList.add(new ModelBox(gun152_r1, 82, 406, 0.2F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun156_r1 = new ModelRenderer(this);
		gun156_r1.setRotationPoint(0.6F, -33.4F, -4.5F);
		lower.addChild(gun156_r1);
		setRotationAngle(gun156_r1, -1.5708F, 0.0F, 0.0F);
		gun156_r1.cubeList.add(new ModelBox(gun156_r1, 400, 164, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		bone_r1 = new ModelRenderer(this);
		bone_r1.setRotationPoint(0.2F, -32.8F, -16.5F);
		lower.addChild(bone_r1);
		setRotationAngle(bone_r1, 0.0F, 0.0F, 0.7854F);
		bone_r1.cubeList.add(new ModelBox(bone_r1, 306, 215, -0.3636F, -0.3636F, -0.001F, 1, 1, 2, 0.0F, false));
		bone_r1.cubeList.add(new ModelBox(bone_r1, 360, 275, -1.0F, -1.0F, -0.001F, 1, 1, 2, 0.0F, false));

		gun132 = new ModelRenderer(this);
		gun132.setRotationPoint(-0.15F, -36.2F, -12.8F);
		lower.addChild(gun132);
		setRotationAngle(gun132, 0.0F, 0.0F, -1.2641F);
		

		gun133_r1 = new ModelRenderer(this);
		gun133_r1.setRotationPoint(0.8083F, 0.9109F, 0.6586F);
		gun132.addChild(gun133_r1);
		setRotationAngle(gun133_r1, 0.0F, 0.0F, -0.3054F);
		gun133_r1.cubeList.add(new ModelBox(gun133_r1, 404, 266, -1.1818F, -5.4243F, 2.4414F, 2, 1, 1, -0.2F, false));
		gun133_r1.cubeList.add(new ModelBox(gun133_r1, 404, 268, -1.1811F, -5.425F, 2.8414F, 2, 1, 1, -0.2F, false));
		gun133_r1.cubeList.add(new ModelBox(gun133_r1, 398, 329, -1.0752F, -0.7751F, -0.4086F, 2, 1, 1, -0.2F, false));
		gun133_r1.cubeList.add(new ModelBox(gun133_r1, 398, 91, -1.0759F, -0.7744F, -0.8086F, 2, 1, 1, -0.2F, false));

		gun134_r1 = new ModelRenderer(this);
		gun134_r1.setRotationPoint(0.8083F, 0.9109F, 0.6586F);
		gun132.addChild(gun134_r1);
		setRotationAngle(gun134_r1, 0.0F, 0.2618F, -0.3054F);
		gun134_r1.cubeList.add(new ModelBox(gun134_r1, 270, 404, -2.1446F, -5.425F, 2.8775F, 2, 1, 1, -0.2F, false));
		gun134_r1.cubeList.add(new ModelBox(gun134_r1, 404, 264, -1.2012F, -0.7751F, -0.2344F, 2, 1, 1, -0.2F, false));

		gun133_r2 = new ModelRenderer(this);
		gun133_r2.setRotationPoint(-9.8568F, 4.0001F, 0.6586F);
		gun132.addChild(gun133_r2);
		setRotationAngle(gun133_r2, 0.0F, 0.0F, 2.8362F);
		gun133_r2.cubeList.add(new ModelBox(gun133_r2, 222, 393, -5.9756F, -0.5683F, -1.4086F, 2, 1, 1, -0.3F, false));
		gun133_r2.cubeList.add(new ModelBox(gun133_r2, 0, 405, -5.9749F, -0.569F, -1.0086F, 2, 1, 1, -0.3F, false));

		gun134_r2 = new ModelRenderer(this);
		gun134_r2.setRotationPoint(-9.8783F, 4.0068F, 0.6294F);
		gun132.addChild(gun134_r2);
		setRotationAngle(gun134_r2, 0.0F, 0.2618F, 2.8362F);
		gun134_r2.cubeList.add(new ModelBox(gun134_r2, 404, 402, -5.7786F, -0.569F, -2.0821F, 2, 1, 1, -0.3F, false));

		gun67 = new ModelRenderer(this);
		gun67.setRotationPoint(-3.3F, -33.5F, 1.5F);
		lower.addChild(gun67);
		setRotationAngle(gun67, -2.3423F, 0.0F, 0.0F);
		gun67.cubeList.add(new ModelBox(gun67, 332, 208, 0.001F, 0.0638F, -1.4959F, 3, 2, 5, 0.0F, false));
		gun67.cubeList.add(new ModelBox(gun67, 348, 208, 0.599F, 0.0638F, -1.4959F, 3, 2, 5, 0.0F, false));
		gun67.cubeList.add(new ModelBox(gun67, 346, 242, 0.299F, -0.7242F, -0.49F, 3, 2, 4, 0.0F, false));

		gun60 = new ModelRenderer(this);
		gun60.setRotationPoint(-0.4F, -35.6F, -22.1F);
		lower.addChild(gun60);
		setRotationAngle(gun60, -0.3316F, 0.0F, 0.0F);
		gun60.cubeList.add(new ModelBox(gun60, 406, 82, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun60.cubeList.add(new ModelBox(gun60, 406, 84, -3.3F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		lower.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}