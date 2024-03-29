package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SOBRUniform extends ModelBiped {
	private final ModelRenderer head;
//	private final ModelRenderer body;
//	private final ModelRenderer rightarm;
//	private final ModelRenderer leftarm;
//	private final ModelRenderer rightleg;
//	private final ModelRenderer leftleg;
	private final ModelRenderer jacket;
	private final ModelRenderer jacket1;
	private final ModelRenderer jacket2;
	private final ModelRenderer jacket3;
	private final ModelRenderer jacket4;
	private final ModelRenderer jacket5;
	private final ModelRenderer jacket6;
	private final ModelRenderer jacket7;
	private final ModelRenderer leftleg_usmc;
	private final ModelRenderer leftleg1;
	private final ModelRenderer leftleg2;
	private final ModelRenderer leftleg3;
	private final ModelRenderer leftleg4;
	private final ModelRenderer leftleg5;
	private final ModelRenderer rightleg_usmc;
	private final ModelRenderer rightleg1;
	private final ModelRenderer rightleg2;
	private final ModelRenderer rightleg3;
	private final ModelRenderer rightleg4;
	private final ModelRenderer leftarm_usmc;
	private final ModelRenderer leftarm1;
	private final ModelRenderer leftarm2;
	private final ModelRenderer leftarm3;
	private final ModelRenderer leftarm4;
	private final ModelRenderer leftarm5;
	private final ModelRenderer leftarm6;
	private final ModelRenderer leftarm7;
	private final ModelRenderer rightarm_usmc;
	private final ModelRenderer rightarm1;
	private final ModelRenderer rightarm2;
	private final ModelRenderer rightarm3;
	private final ModelRenderer rightarm4;
	private final ModelRenderer rightarm5;
	private final ModelRenderer rightarm6;
	private final ModelRenderer rightarm7;
	private final ModelRenderer helmet;
	private final ModelRenderer bone;
	private final ModelRenderer bone16;
	private final ModelRenderer bone2;
	private final ModelRenderer bone14;
	private final ModelRenderer bone10;
	private final ModelRenderer bone18;
	private final ModelRenderer bone15;
	private final ModelRenderer bone3;
	private final ModelRenderer bone5;
	private final ModelRenderer bone11;
	private final ModelRenderer bone12;
	private final ModelRenderer bone13;
	private final ModelRenderer bone4;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;

	public SOBRUniform() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 0, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, false));

		bipedRightArm = new ModelRenderer(this);
		bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 46, 47, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));

		bipedLeftArm = new ModelRenderer(this);
		bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 0, 46, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));

		bipedRightLeg = new ModelRenderer(this);
		bipedRightLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 34, 35, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		bipedLeftLeg = new ModelRenderer(this);
		bipedLeftLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 18, 35, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		jacket = new ModelRenderer(this);
		jacket.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		jacket1 = new ModelRenderer(this);
		jacket1.setRotationPoint(0.0F, -24.0F, 0.0F);
		jacket.addChild(jacket1);
		setRotationAngle(jacket1, 0.0F, -0.1047F, -0.0175F);
		jacket1.cubeList.add(new ModelBox(jacket1, 0, 73, -0.0418F, 0.85F, -2.58F, 4, 12, 1, 0.0F, false));

		jacket2 = new ModelRenderer(this);
		jacket2.setRotationPoint(0.0F, -24.0F, 0.0F);
		jacket.addChild(jacket2);
		setRotationAngle(jacket2, 0.0F, 0.0349F, 0.0349F);
		jacket2.cubeList.add(new ModelBox(jacket2, 42, 63, -3.93F, 0.8411F, -2.294F, 5, 12, 1, 0.0F, false));

		jacket3 = new ModelRenderer(this);
		jacket3.setRotationPoint(0.0F, -24.0F, 0.0F);
		jacket.addChild(jacket3);
		setRotationAngle(jacket3, -0.2094F, -0.1047F, 0.0F);
		jacket3.cubeList.add(new ModelBox(jacket3, 34, 68, 0.9791F, 0.4113F, -2.36F, 3, 1, 1, 0.0F, false));

		jacket4 = new ModelRenderer(this);
		jacket4.setRotationPoint(0.0F, -24.0F, 0.0F);
		jacket.addChild(jacket4);
		setRotationAngle(jacket4, 0.0F, -0.0524F, -0.0175F);
		jacket4.cubeList.add(new ModelBox(jacket4, 58, 59, 3.1F, -0.0483F, -2.1973F, 1, 13, 4, 0.0F, false));

		jacket5 = new ModelRenderer(this);
		jacket5.setRotationPoint(0.0F, -24.0F, 0.0F);
		jacket.addChild(jacket5);
		setRotationAngle(jacket5, 0.0F, 0.0524F, 0.0175F);
		jacket5.cubeList.add(new ModelBox(jacket5, 32, 51, -4.1135F, -0.1226F, -2.1748F, 1, 13, 4, 0.0F, false));

		jacket6 = new ModelRenderer(this);
		jacket6.setRotationPoint(0.0F, -24.0F, 0.0F);
		jacket.addChild(jacket6);
		setRotationAngle(jacket6, -0.1047F, 0.0349F, 0.0349F);
		jacket6.cubeList.add(new ModelBox(jacket6, 64, 61, -3.9195F, 0.1396F, -2.2031F, 3, 1, 1, 0.0F, false));

		jacket7 = new ModelRenderer(this);
		jacket7.setRotationPoint(0.0F, -24.0F, 0.0F);
		jacket.addChild(jacket7);
		setRotationAngle(jacket7, 0.0175F, 0.0F, 0.0F);
		jacket7.cubeList.add(new ModelBox(jacket7, 0, 32, -4.0F, -0.1191F, 1.0911F, 8, 13, 1, 0.0F, false));

		leftleg_usmc = new ModelRenderer(this);
		leftleg_usmc.setRotationPoint(0.0F, 0.0F, 0.0F);
		

		leftleg1 = new ModelRenderer(this);
		leftleg1.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftleg_usmc.addChild(leftleg1);
		setRotationAngle(leftleg1, 0.0F, -0.0524F, 0.0349F);
		leftleg1.cubeList.add(new ModelBox(leftleg1, 60, 76, 1.27F, -0.0955F, -2.1F, 1, 6, 4, 0.0F, false));

		leftleg2 = new ModelRenderer(this);
		leftleg2.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftleg_usmc.addChild(leftleg2);
		setRotationAngle(leftleg2, 0.0F, -0.0349F, -0.0349F);
		leftleg2.cubeList.add(new ModelBox(leftleg2, 81, 0, 0.9226F, 3.9944F, -2.0509F, 1, 5, 4, 0.0F, false));

		leftleg3 = new ModelRenderer(this);
		leftleg3.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftleg_usmc.addChild(leftleg3);
		setRotationAngle(leftleg3, 0.0F, 0.0F, 0.0349F);
		leftleg3.cubeList.add(new ModelBox(leftleg3, 50, 72, -2.0965F, -0.0032F, -2.03F, 1, 9, 4, 0.0F, false));

		leftleg4 = new ModelRenderer(this);
		leftleg4.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftleg_usmc.addChild(leftleg4);
		leftleg4.cubeList.add(new ModelBox(leftleg4, 62, 22, -1.9535F, -0.0531F, -2.1786F, 4, 9, 3, 0.0F, false));
		leftleg4.cubeList.add(new ModelBox(leftleg4, 68, 68, -2.0535F, -0.054F, 0.2214F, 4, 9, 2, 0.0F, false));

		leftleg5 = new ModelRenderer(this);
		leftleg5.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftleg_usmc.addChild(leftleg5);
		setRotationAngle(leftleg5, -0.1222F, -0.1047F, 0.0F);
		leftleg5.cubeList.add(new ModelBox(leftleg5, 91, 41, -2.1928F, 11.1268F, -0.9835F, 4, 1, 1, 0.0F, false));

		rightleg_usmc = new ModelRenderer(this);
		rightleg_usmc.setRotationPoint(0.0F, 0.0F, 0.0F);
		

		rightleg1 = new ModelRenderer(this);
		rightleg1.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightleg_usmc.addChild(rightleg1);
		rightleg1.cubeList.add(new ModelBox(rightleg1, 16, 51, -2.0F, -0.01F, -2.14F, 4, 9, 4, 0.0F, false));
		rightleg1.cubeList.add(new ModelBox(rightleg1, 76, 21, -2.0F, -0.011F, 1.2F, 4, 9, 1, 0.0F, false));

		rightleg2 = new ModelRenderer(this);
		rightleg2.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightleg_usmc.addChild(rightleg2);
		setRotationAngle(rightleg2, 0.0F, 0.0F, 0.0524F);
		rightleg2.cubeList.add(new ModelBox(rightleg2, 80, 81, -2.0948F, 0.0999F, -2.0F, 1, 5, 4, 0.0F, false));

		rightleg3 = new ModelRenderer(this);
		rightleg3.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightleg_usmc.addChild(rightleg3);
		setRotationAngle(rightleg3, 0.0F, 0.0F, -0.0175F);
		rightleg3.cubeList.add(new ModelBox(rightleg3, 44, 82, -2.3855F, 4.95F, -2.0F, 1, 4, 4, 0.0F, false));
		rightleg3.cubeList.add(new ModelBox(rightleg3, 28, 68, 1.1F, -0.0459F, -2.0F, 1, 9, 4, 0.0F, false));

		rightleg4 = new ModelRenderer(this);
		rightleg4.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightleg_usmc.addChild(rightleg4);
		setRotationAngle(rightleg4, -0.1222F, 0.1047F, 0.0F);
		rightleg4.cubeList.add(new ModelBox(rightleg4, 91, 13, -1.8F, 11.1314F, -1.0206F, 4, 1, 1, 0.0F, false));

		leftarm_usmc = new ModelRenderer(this);
		leftarm_usmc.setRotationPoint(0.0F, 0.0F, 0.0F);
		

		leftarm1 = new ModelRenderer(this);
		leftarm1.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm_usmc.addChild(leftarm1);
		setRotationAngle(leftarm1, 0.0F, 0.0F, -0.0524F);
		leftarm1.cubeList.add(new ModelBox(leftarm1, 70, 81, 2.2489F, -1.75F, -2.0F, 1, 5, 4, 0.0F, false));
		leftarm1.cubeList.add(new ModelBox(leftarm1, 60, 86, -1.4477F, 3.0282F, -2.0F, 1, 2, 4, 0.0F, false));
		leftarm1.cubeList.add(new ModelBox(leftarm1, 60, 86, -1.4477F, 5.0282F, -2.0F, 1, 2, 4, 0.0F, false));

		leftarm2 = new ModelRenderer(this);
		leftarm2.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm_usmc.addChild(leftarm2);
		setRotationAngle(leftarm2, 0.0F, 0.0F, 0.0349F);
		leftarm2.cubeList.add(new ModelBox(leftarm2, 28, 81, -1.1508F, -1.863F, -2.0F, 1, 5, 4, 0.0F, false));
		leftarm2.cubeList.add(new ModelBox(leftarm2, 34, 86, 2.5216F, 2.97F, -2.0F, 1, 2, 4, 0.0F, false));
		leftarm2.cubeList.add(new ModelBox(leftarm2, 34, 86, 2.5216F, 4.97F, -2.0F, 1, 2, 4, 0.0F, false));

		leftarm3 = new ModelRenderer(this);
		leftarm3.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm_usmc.addChild(leftarm3);
		setRotationAngle(leftarm3, -0.0175F, -0.0698F, 0.0F);
		leftarm3.cubeList.add(new ModelBox(leftarm3, 86, 20, -1.1523F, -1.8719F, -2.2856F, 4, 5, 1, 0.0F, false));

		leftarm4 = new ModelRenderer(this);
		leftarm4.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm_usmc.addChild(leftarm4);
		setRotationAngle(leftarm4, 0.0698F, -0.0524F, 0.0F);
		leftarm4.cubeList.add(new ModelBox(leftarm4, 90, 34, -1.1F, 2.9234F, -2.5902F, 4, 2, 1, 0.0F, false));
		leftarm4.cubeList.add(new ModelBox(leftarm4, 90, 34, -1.1F, 4.9234F, -2.5902F, 4, 2, 1, 0.0F, false));

		leftarm5 = new ModelRenderer(this);
		leftarm5.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm_usmc.addChild(leftarm5);
		leftarm5.cubeList.add(new ModelBox(leftarm5, 10, 84, -1.0F, -1.95F, 1.2F, 4, 7, 1, 0.0F, false));
		leftarm5.cubeList.add(new ModelBox(leftarm5, 10, 84, -1.0F, 5.05F, 1.2F, 4, 2, 1, 0.0F, false));
		leftarm5.cubeList.add(new ModelBox(leftarm5, 91, 3, -1.0F, 6.55F, -2.1F, 4, 1, 1, 0.0F, false));
		leftarm5.cubeList.add(new ModelBox(leftarm5, 90, 52, -1.0F, 7.55F, -2.1F, 4, 1, 1, 0.0F, false));
		leftarm5.cubeList.add(new ModelBox(leftarm5, 90, 91, -1.0F, 6.55F, 1.1F, 4, 1, 1, 0.0F, false));
		leftarm5.cubeList.add(new ModelBox(leftarm5, 90, 37, -1.0F, 7.55F, 1.1F, 4, 1, 1, 0.0F, false));
		leftarm5.cubeList.add(new ModelBox(leftarm5, 89, 44, -1.1F, 6.55F, -2.0F, 1, 1, 4, 0.0F, false));
		leftarm5.cubeList.add(new ModelBox(leftarm5, 86, 86, -1.1F, 7.55F, -2.0F, 1, 1, 4, 0.0F, false));
		leftarm5.cubeList.add(new ModelBox(leftarm5, 22, 89, 2.1F, 6.55F, -2.0F, 1, 1, 4, 0.0F, false));
		leftarm5.cubeList.add(new ModelBox(leftarm5, 52, 9, 2.1F, 7.55F, -2.0F, 1, 1, 4, 0.0F, false));

		leftarm6 = new ModelRenderer(this);
		leftarm6.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm_usmc.addChild(leftarm6);
		setRotationAngle(leftarm6, 0.0F, 0.0F, 0.0873F);
		leftarm6.cubeList.add(new ModelBox(leftarm6, 38, 51, 2.9055F, 8.8926F, -1.5F, 1, 1, 3, 0.0F, false));
		leftarm6.cubeList.add(new ModelBox(leftarm6, 28, 51, -0.4953F, 7.8851F, -1.9F, 1, 1, 3, 0.0F, false));

		leftarm7 = new ModelRenderer(this);
		leftarm7.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm_usmc.addChild(leftarm7);
		setRotationAngle(leftarm7, 0.0F, 0.0F, 0.0349F);
		leftarm7.cubeList.add(new ModelBox(leftarm7, 71, 44, -1.0684F, -2.1712F, -2.01F, 4, 1, 4, 0.0F, false));

		rightarm_usmc = new ModelRenderer(this);
		rightarm_usmc.setRotationPoint(0.0F, 0.0F, 0.0F);
		

		rightarm1 = new ModelRenderer(this);
		rightarm1.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm_usmc.addChild(rightarm1);
		rightarm1.cubeList.add(new ModelBox(rightarm1, 80, 91, -3.0F, 6.55F, -2.1F, 4, 1, 1, 0.0F, false));
		rightarm1.cubeList.add(new ModelBox(rightarm1, 90, 66, -3.0F, 7.55F, -2.1F, 4, 1, 1, 0.0F, false));
		rightarm1.cubeList.add(new ModelBox(rightarm1, 90, 68, -3.0F, 6.55F, 1.1F, 4, 1, 1, 0.0F, false));
		rightarm1.cubeList.add(new ModelBox(rightarm1, 90, 64, -3.0F, 7.55F, 1.1F, 4, 1, 1, 0.0F, false));
		rightarm1.cubeList.add(new ModelBox(rightarm1, 78, 31, -3.0F, -1.95F, 1.2F, 4, 7, 1, 0.0F, false));
		rightarm1.cubeList.add(new ModelBox(rightarm1, 10, 73, 0.2F, -1.95F, -2.0F, 1, 7, 4, 0.0F, false));
		rightarm1.cubeList.add(new ModelBox(rightarm1, 78, 31, -3.0F, 5.05F, 1.2F, 4, 2, 1, 0.0F, false));
		rightarm1.cubeList.add(new ModelBox(rightarm1, 10, 73, 0.2F, 5.05F, -2.0F, 1, 2, 4, 0.0F, false));
		rightarm1.cubeList.add(new ModelBox(rightarm1, 87, 5, -3.1F, 6.55F, -2.0F, 1, 1, 4, 0.0F, false));
		rightarm1.cubeList.add(new ModelBox(rightarm1, 86, 59, -3.1F, 7.55F, -2.0F, 1, 1, 4, 0.0F, false));
		rightarm1.cubeList.add(new ModelBox(rightarm1, 86, 77, 0.1F, 6.55F, -2.0F, 1, 1, 4, 0.0F, false));
		rightarm1.cubeList.add(new ModelBox(rightarm1, 86, 26, 0.1F, 7.55F, -2.0F, 1, 1, 4, 0.0F, false));

		rightarm2 = new ModelRenderer(this);
		rightarm2.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm_usmc.addChild(rightarm2);
		setRotationAngle(rightarm2, 0.0F, 0.0F, 0.0524F);
		rightarm2.cubeList.add(new ModelBox(rightarm2, 80, 61, -3.1893F, -1.7398F, -2.0F, 1, 5, 4, 0.0F, false));

		rightarm3 = new ModelRenderer(this);
		rightarm3.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm_usmc.addChild(rightarm3);
		setRotationAngle(rightarm3, 0.0F, 0.0F, -0.0524F);
		rightarm3.cubeList.add(new ModelBox(rightarm3, 84, 35, -3.5726F, 2.9014F, -2.0F, 1, 2, 4, 0.0F, false));
		rightarm3.cubeList.add(new ModelBox(rightarm3, 84, 35, -3.5726F, 4.9014F, -2.0F, 1, 2, 4, 0.0F, false));

		rightarm4 = new ModelRenderer(this);
		rightarm4.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm_usmc.addChild(rightarm4);
		setRotationAngle(rightarm4, -0.0349F, 0.0349F, 0.0F);
		rightarm4.cubeList.add(new ModelBox(rightarm4, 0, 86, -2.93F, -1.8591F, -2.3035F, 4, 5, 1, 0.0F, false));

		rightarm5 = new ModelRenderer(this);
		rightarm5.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm_usmc.addChild(rightarm5);
		setRotationAngle(rightarm5, 0.0349F, 0.1047F, 0.0F);
		rightarm5.cubeList.add(new ModelBox(rightarm5, 70, 90, -2.78F, 2.9806F, -2.5493F, 4, 2, 1, 0.0F, false));
		rightarm5.cubeList.add(new ModelBox(rightarm5, 70, 90, -2.78F, 4.9806F, -2.5493F, 4, 2, 1, 0.0F, false));

		rightarm6 = new ModelRenderer(this);
		rightarm6.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm_usmc.addChild(rightarm6);
		setRotationAngle(rightarm6, 0.0F, 0.0F, -0.0873F);
		rightarm6.cubeList.add(new ModelBox(rightarm6, 50, 39, -0.5F, 7.9063F, -1.9F, 1, 1, 3, 0.0F, false));
		rightarm6.cubeList.add(new ModelBox(rightarm6, 30, 35, -3.9F, 8.9F, -1.5F, 1, 1, 3, 0.0F, false));

		rightarm7 = new ModelRenderer(this);
		rightarm7.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm_usmc.addChild(rightarm7);
		setRotationAngle(rightarm7, 0.0F, 0.0F, -0.0349F);
		rightarm7.cubeList.add(new ModelBox(rightarm7, 71, 16, -2.9437F, -2.2486F, -2.01F, 4, 1, 4, 0.0F, false));

		helmet = new ModelRenderer(this);
		helmet.setRotationPoint(0.0F, 0.0F, 0.0F);
		

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone);
		setRotationAngle(bone, -0.2443F, 0.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 32, 9, -4.0F, -6.9093F, -6.0678F, 8, 3, 1, 0.0F, false));

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone16);
		setRotationAngle(bone16, 0.1571F, 0.0F, 0.0F);
		bone16.cubeList.add(new ModelBox(bone16, 58, 0, -4.0F, -7.4229F, 3.4514F, 8, 5, 2, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, -0.2094F);
		bone2.cubeList.add(new ModelBox(bone2, 50, 36, 4.746F, -7.1F, -4.0F, 1, 3, 8, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 20, 103, 4.7462F, -4.7514F, -3.0F, 1, 3, 5, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 60, 36, 4.7462F, -4.7514F, 2.0F, 1, 3, 2, 0.0F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone14);
		setRotationAngle(bone14, -0.0873F, 0.0F, 0.0349F);
		

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone10);
		setRotationAngle(bone10, 0.4189F, 0.1047F, 0.0349F);
		

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone18);
		setRotationAngle(bone18, 0.2618F, -0.2967F, -0.192F);
		

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone15);
		setRotationAngle(bone15, -0.0873F, 0.0F, -0.0349F);
		

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone3);
		setRotationAngle(bone3, 0.2967F, 0.0F, -0.2094F);
		

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone5);
		setRotationAngle(bone5, 0.2967F, 0.0F, 0.2094F);
		

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone11);
		bone11.cubeList.add(new ModelBox(bone11, 24, 0, -3.5F, -8.9F, -3.49F, 7, 1, 7, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone12);
		setRotationAngle(bone12, -0.7854F, 0.0F, 0.0F);
		bone12.cubeList.add(new ModelBox(bone12, 69, 41, -3.5F, -3.8F, -8.76F, 7, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 24, 22, -3.5F, -8.7497F, -3.8103F, 7, 1, 1, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone13);
		setRotationAngle(bone13, 0.0F, 0.0F, 0.7854F);
		bone13.cubeList.add(new ModelBox(bone13, 62, 44, -3.85F, -8.75F, -3.5F, 1, 1, 7, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 60, 36, -8.75F, -3.871F, -3.5F, 1, 1, 7, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 0.0F, 0.2094F);
		bone4.cubeList.add(new ModelBox(bone4, 47, 14, -5.7362F, -7.1F, -4.0F, 1, 3, 8, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 1, 114, -5.7262F, -4.7544F, -3.0F, 1, 3, 5, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 0, 92, -5.7262F, -4.7544F, 2.0F, 1, 3, 2, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone8);
		setRotationAngle(bone8, -0.1571F, 0.0F, 0.0F);
		bone8.cubeList.add(new ModelBox(bone8, 42, 55, -4.2F, -5.1F, -3.9F, 1, 5, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 18, 32, 3.2F, -5.1F, -3.9F, 1, 5, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 0, 46, 3.2F, -4.2659F, 2.743F, 1, 2, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 25, 16, -4.2F, -4.2659F, 2.743F, 1, 2, 1, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone9);
		setRotationAngle(bone9, 0.192F, 0.0F, 0.0F);
		bone9.cubeList.add(new ModelBox(bone9, 46, 27, -4.1F, -1.8253F, -3.9628F, 3, 1, 8, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 47, 25, -2.5F, -1.9616F, -4.14F, 5, 1, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 44, 0, 1.1F, -1.8253F, -3.9628F, 3, 1, 8, 0.0F, false));

	        this.bipedHead.addChild(helmet);
		this.bipedBody.addChild(jacket);
//		this.bipedBody.addChild(vest);
		this.bipedLeftArm.addChild(leftarm_usmc);
		this.bipedRightArm.addChild(rightarm_usmc);
		this.bipedLeftLeg.addChild(leftleg_usmc);
		this.bipedRightLeg.addChild(rightleg_usmc);
		
		this.bipedHeadwear.isHidden = true;
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
//		head.render(f5);
//		body.render(f5);
//		rightarm.render(f5);
//		leftarm.render(f5);
//		rightleg.render(f5);
//		leftleg.render(f5);
//		jacket.render(f5);
//		leftleg_usmc.render(f5);
//		rightleg_usmc.render(f5);
//		leftarm_usmc.render(f5);
//		rightarm_usmc.render(f5);
//		helmet.render(f5);
//		vest.render(f5);
		
		super.render(entity, f, f1, f2, f3, f4, f5);
	    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
