package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Ratnik_Uniform extends ModelBiped {
	private final ModelRenderer head;
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
	private final ModelRenderer vest;
	private final ModelRenderer bone19;
	private final ModelRenderer bone20;
	private final ModelRenderer bone21;
	private final ModelRenderer bone22;
	private final ModelRenderer bone23;
	private final ModelRenderer bone24;
	private final ModelRenderer bone25;
	private final ModelRenderer bone26;
	private final ModelRenderer bone27;
	private final ModelRenderer helmet;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer bone16;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r11_r1;
	private final ModelRenderer cube_r11_r2;
	private final ModelRenderer cube_r10_r1;
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
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r12_r1;
	private final ModelRenderer cube_r13_r1;
	private final ModelRenderer cube_r12_r2;
	private final ModelRenderer cube_r11_r3;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;

	public Ratnik_Uniform() {
		textureWidth = 64;
		textureHeight = 64;


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
		jacket1.cubeList.add(new ModelBox(jacket1, 43, 18, -0.0418F, 0.85F, -2.58F, 4, 12, 1, 0.0F, false));

		jacket2 = new ModelRenderer(this);
		jacket2.setRotationPoint(0.0F, -24.0F, 0.0F);
		jacket.addChild(jacket2);
		setRotationAngle(jacket2, 0.0F, 0.0349F, 0.0349F);
		jacket2.cubeList.add(new ModelBox(jacket2, 38, 16, -3.93F, 0.8411F, -2.294F, 5, 12, 1, 0.0F, false));

		jacket3 = new ModelRenderer(this);
		jacket3.setRotationPoint(0.0F, -24.0F, 0.0F);
		jacket.addChild(jacket3);
		setRotationAngle(jacket3, -0.2094F, -0.1047F, 0.0F);
		jacket3.cubeList.add(new ModelBox(jacket3, 38, 20, 0.9791F, 0.4113F, -2.36F, 3, 1, 1, 0.0F, false));

		jacket4 = new ModelRenderer(this);
		jacket4.setRotationPoint(0.0F, -24.0F, 0.0F);
		jacket.addChild(jacket4);
		setRotationAngle(jacket4, 0.0F, -0.0524F, -0.0175F);
		jacket4.cubeList.add(new ModelBox(jacket4, 37, 13, 3.1F, -0.0483F, -2.1973F, 1, 13, 4, 0.0F, false));

		jacket5 = new ModelRenderer(this);
		jacket5.setRotationPoint(0.0F, -24.0F, 0.0F);
		jacket.addChild(jacket5);
		setRotationAngle(jacket5, 0.0F, 0.0524F, 0.0175F);
		jacket5.cubeList.add(new ModelBox(jacket5, 44, 10, -4.1135F, -0.1226F, -2.1748F, 1, 13, 4, 0.0F, false));

		jacket6 = new ModelRenderer(this);
		jacket6.setRotationPoint(0.0F, -24.0F, 0.0F);
		jacket.addChild(jacket6);
		setRotationAngle(jacket6, -0.1047F, 0.0349F, 0.0349F);
		jacket6.cubeList.add(new ModelBox(jacket6, 40, 20, -3.9195F, 0.1396F, -2.2031F, 3, 1, 1, 0.0F, false));

		jacket7 = new ModelRenderer(this);
		jacket7.setRotationPoint(0.0F, -24.0F, 0.0F);
		jacket.addChild(jacket7);
		setRotationAngle(jacket7, 0.0175F, 0.0F, 0.0F);
		jacket7.cubeList.add(new ModelBox(jacket7, 34, 15, -4.0F, -0.1191F, 1.0911F, 8, 13, 1, 0.0F, false));

		leftleg_usmc = new ModelRenderer(this);
		leftleg_usmc.setRotationPoint(0.0F, 0.0F, 0.0F);
		

		leftleg1 = new ModelRenderer(this);
		leftleg1.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftleg_usmc.addChild(leftleg1);
		setRotationAngle(leftleg1, 0.0F, -0.0524F, 0.0349F);
		leftleg1.cubeList.add(new ModelBox(leftleg1, 34, 14, 1.27F, -0.0955F, -2.1F, 1, 6, 4, 0.0F, false));

		leftleg2 = new ModelRenderer(this);
		leftleg2.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftleg_usmc.addChild(leftleg2);
		setRotationAngle(leftleg2, 0.0F, -0.0349F, -0.0349F);
		leftleg2.cubeList.add(new ModelBox(leftleg2, 39, 15, 0.9226F, 4.1F, -2.0509F, 1, 5, 4, 0.0F, false));

		leftleg3 = new ModelRenderer(this);
		leftleg3.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftleg_usmc.addChild(leftleg3);
		setRotationAngle(leftleg3, 0.0F, 0.0F, 0.0349F);
		leftleg3.cubeList.add(new ModelBox(leftleg3, 32, 14, -2.0965F, 0.068F, -2.03F, 1, 9, 4, 0.0F, false));

		leftleg4 = new ModelRenderer(this);
		leftleg4.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftleg_usmc.addChild(leftleg4);
		leftleg4.cubeList.add(new ModelBox(leftleg4, 36, 14, -1.9535F, -0.001F, -2.1786F, 4, 9, 3, 0.0F, false));
		leftleg4.cubeList.add(new ModelBox(leftleg4, 36, 14, -2.0535F, -0.0001F, 0.2214F, 4, 9, 2, 0.0F, false));
		leftleg4.cubeList.add(new ModelBox(leftleg4, 0, 37, -2.0F, 9.0F, 0.1F, 4, 3, 2, 0.0F, false));
		leftleg4.cubeList.add(new ModelBox(leftleg4, 2, 35, -2.0F, 9.0F, -2.1F, 4, 3, 2, 0.0F, false));
		leftleg4.cubeList.add(new ModelBox(leftleg4, 63, 101, -2.0F, 11.01F, -2.0F, 4, 1, 4, 0.0F, false));
		leftleg4.cubeList.add(new ModelBox(leftleg4, 3, 34, 1.1F, 9.0F, -2.0F, 1, 3, 4, 0.0F, false));
		leftleg4.cubeList.add(new ModelBox(leftleg4, 5, 33, -2.1F, 9.0F, -2.0F, 1, 3, 4, 0.0F, false));

		leftleg5 = new ModelRenderer(this);
		leftleg5.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftleg_usmc.addChild(leftleg5);
		setRotationAngle(leftleg5, -0.1222F, -0.1047F, 0.0F);
		leftleg5.cubeList.add(new ModelBox(leftleg5, 3, 37, -2.1928F, 11.1268F, -0.9835F, 4, 1, 1, 0.0F, false));

		rightleg_usmc = new ModelRenderer(this);
		rightleg_usmc.setRotationPoint(0.0F, 0.0F, 0.0F);
		

		rightleg1 = new ModelRenderer(this);
		rightleg1.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightleg_usmc.addChild(rightleg1);
		rightleg1.cubeList.add(new ModelBox(rightleg1, 34, 12, -2.0F, -0.001F, -2.14F, 4, 9, 4, 0.0F, false));
		rightleg1.cubeList.add(new ModelBox(rightleg1, 38, 15, -2.0F, -0.0005F, 1.2F, 4, 9, 1, 0.0F, false));
		rightleg1.cubeList.add(new ModelBox(rightleg1, 0, 37, -2.0F, 9.0F, -2.1F, 4, 3, 2, 0.0F, false));
		rightleg1.cubeList.add(new ModelBox(rightleg1, 0, 35, -2.1F, 9.0F, -2.0F, 1, 3, 4, 0.0F, false));
		rightleg1.cubeList.add(new ModelBox(rightleg1, 0, 37, -2.0F, 9.0F, 0.1F, 4, 3, 2, 0.0F, false));
		rightleg1.cubeList.add(new ModelBox(rightleg1, 0, 35, 1.1F, 9.0F, -2.0F, 1, 3, 4, 0.0F, false));
		rightleg1.cubeList.add(new ModelBox(rightleg1, 63, 101, -2.0F, 11.01F, -2.0F, 4, 1, 4, 0.0F, false));

		rightleg2 = new ModelRenderer(this);
		rightleg2.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightleg_usmc.addChild(rightleg2);
		setRotationAngle(rightleg2, 0.0F, 0.0F, 0.0524F);
		rightleg2.cubeList.add(new ModelBox(rightleg2, 31, 17, -2.0948F, 0.0999F, -2.0F, 1, 5, 4, 0.0F, false));

		rightleg3 = new ModelRenderer(this);
		rightleg3.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightleg_usmc.addChild(rightleg3);
		setRotationAngle(rightleg3, 0.0F, 0.0F, -0.0175F);
		rightleg3.cubeList.add(new ModelBox(rightleg3, 38, 18, -2.3855F, 4.97F, -2.0F, 1, 4, 4, 0.0F, false));
		rightleg3.cubeList.add(new ModelBox(rightleg3, 35, 15, 1.1F, 0.05F, -2.0F, 1, 9, 4, 0.0F, false));

		rightleg4 = new ModelRenderer(this);
		rightleg4.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightleg_usmc.addChild(rightleg4);
		setRotationAngle(rightleg4, -0.1222F, 0.1047F, 0.0F);
		rightleg4.cubeList.add(new ModelBox(rightleg4, 0, 40, -1.8F, 11.1314F, -1.0206F, 4, 1, 1, 0.0F, false));

		leftarm_usmc = new ModelRenderer(this);
		leftarm_usmc.setRotationPoint(0.0F, 0.0F, 0.0F);
		

		leftarm1 = new ModelRenderer(this);
		leftarm1.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm_usmc.addChild(leftarm1);
		setRotationAngle(leftarm1, 0.0F, 0.0F, -0.0524F);
		leftarm1.cubeList.add(new ModelBox(leftarm1, 36, 15, 2.2489F, -1.75F, -2.0F, 1, 5, 4, 0.0F, false));
		leftarm1.cubeList.add(new ModelBox(leftarm1, 36, 17, -1.4477F, 3.0282F, -2.0F, 1, 2, 4, 0.0F, false));

		leftarm2 = new ModelRenderer(this);
		leftarm2.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm_usmc.addChild(leftarm2);
		setRotationAngle(leftarm2, 0.0F, 0.0F, 0.0349F);
		leftarm2.cubeList.add(new ModelBox(leftarm2, 40, 16, -1.1508F, -1.863F, -2.0F, 1, 5, 4, 0.0F, false));
		leftarm2.cubeList.add(new ModelBox(leftarm2, 37, 17, 2.5216F, 2.97F, -2.0F, 1, 2, 4, 0.0F, false));

		leftarm3 = new ModelRenderer(this);
		leftarm3.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm_usmc.addChild(leftarm3);
		setRotationAngle(leftarm3, -0.0175F, -0.0698F, 0.0F);
		leftarm3.cubeList.add(new ModelBox(leftarm3, 39, 19, -1.1523F, -1.8719F, -2.2856F, 4, 5, 1, 0.0F, false));

		leftarm4 = new ModelRenderer(this);
		leftarm4.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm_usmc.addChild(leftarm4);
		setRotationAngle(leftarm4, 0.0698F, -0.0524F, 0.0F);
		leftarm4.cubeList.add(new ModelBox(leftarm4, 36, 22, -1.1F, 2.9234F, -2.5902F, 4, 2, 1, 0.0F, false));

		leftarm5 = new ModelRenderer(this);
		leftarm5.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm_usmc.addChild(leftarm5);
		leftarm5.cubeList.add(new ModelBox(leftarm5, 37, 16, -1.0F, -1.95F, 1.2F, 4, 7, 1, 0.0F, false));
		leftarm5.cubeList.add(new ModelBox(leftarm5, 38, 18, -1.0F, 5.05F, -2.1F, 4, 4, 1, 0.0F, false));
		leftarm5.cubeList.add(new ModelBox(leftarm5, 38, 20, -1.0F, 5.05F, 1.1F, 4, 4, 1, 0.0F, false));
		leftarm5.cubeList.add(new ModelBox(leftarm5, 37, 16, -1.1F, 5.05F, -2.0F, 1, 4, 4, 0.0F, false));
		leftarm5.cubeList.add(new ModelBox(leftarm5, 35, 18, 2.1F, 5.05F, -2.0F, 1, 4, 4, 0.0F, false));

		leftarm6 = new ModelRenderer(this);
		leftarm6.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm_usmc.addChild(leftarm6);
		setRotationAngle(leftarm6, 0.0F, 0.0F, 0.0873F);
		

		leftarm7 = new ModelRenderer(this);
		leftarm7.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm_usmc.addChild(leftarm7);
		setRotationAngle(leftarm7, 0.0F, 0.0F, 0.0349F);
		leftarm7.cubeList.add(new ModelBox(leftarm7, 35, 18, -1.0684F, -2.1712F, -2.01F, 4, 1, 4, 0.0F, false));

		rightarm_usmc = new ModelRenderer(this);
		rightarm_usmc.setRotationPoint(0.0F, 0.0F, 0.0F);
		

		rightarm1 = new ModelRenderer(this);
		rightarm1.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm_usmc.addChild(rightarm1);
		rightarm1.cubeList.add(new ModelBox(rightarm1, 37, 15, -3.0F, 5.05F, -2.1F, 4, 4, 1, 0.0F, false));
		rightarm1.cubeList.add(new ModelBox(rightarm1, 37, 15, -3.0F, 5.05F, 1.1F, 4, 4, 1, 0.0F, false));
		rightarm1.cubeList.add(new ModelBox(rightarm1, 39, 17, -3.0F, -1.95F, 1.2F, 4, 7, 1, 0.0F, false));
		rightarm1.cubeList.add(new ModelBox(rightarm1, 36, 16, 0.2F, -1.95F, -2.0F, 1, 7, 4, 0.0F, false));
		rightarm1.cubeList.add(new ModelBox(rightarm1, 37, 15, -3.1F, 5.05F, -2.0F, 1, 4, 4, 0.0F, false));
		rightarm1.cubeList.add(new ModelBox(rightarm1, 37, 15, 0.1F, 5.05F, -2.0F, 1, 4, 4, 0.0F, false));

		rightarm2 = new ModelRenderer(this);
		rightarm2.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm_usmc.addChild(rightarm2);
		setRotationAngle(rightarm2, 0.0F, 0.0F, 0.0524F);
		rightarm2.cubeList.add(new ModelBox(rightarm2, 39, 19, -3.1893F, -1.7398F, -2.0F, 1, 5, 4, 0.0F, false));

		rightarm3 = new ModelRenderer(this);
		rightarm3.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm_usmc.addChild(rightarm3);
		setRotationAngle(rightarm3, 0.0F, 0.0F, -0.0524F);
		rightarm3.cubeList.add(new ModelBox(rightarm3, 37, 18, -3.5726F, 2.9014F, -2.0F, 1, 2, 4, 0.0F, false));

		rightarm4 = new ModelRenderer(this);
		rightarm4.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm_usmc.addChild(rightarm4);
		setRotationAngle(rightarm4, -0.0349F, 0.0349F, 0.0F);
		rightarm4.cubeList.add(new ModelBox(rightarm4, 30, 22, -2.93F, -1.8591F, -2.3035F, 4, 5, 1, 0.0F, false));

		rightarm5 = new ModelRenderer(this);
		rightarm5.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm_usmc.addChild(rightarm5);
		setRotationAngle(rightarm5, 0.0349F, 0.1047F, 0.0F);
		rightarm5.cubeList.add(new ModelBox(rightarm5, 37, 18, -2.78F, 2.9806F, -2.5493F, 4, 2, 1, 0.0F, false));

		rightarm6 = new ModelRenderer(this);
		rightarm6.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm_usmc.addChild(rightarm6);
		setRotationAngle(rightarm6, 0.0F, 0.0F, -0.0873F);
		

		rightarm7 = new ModelRenderer(this);
		rightarm7.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm_usmc.addChild(rightarm7);
		setRotationAngle(rightarm7, 0.0F, 0.0F, -0.0349F);
		rightarm7.cubeList.add(new ModelBox(rightarm7, 34, 18, -2.9437F, -2.2486F, -2.01F, 4, 1, 4, 0.0F, false));

		vest = new ModelRenderer(this);
		vest.setRotationPoint(0.0F, 0.0F, 0.0F);
		vest.cubeList.add(new ModelBox(vest, 29, 20, -2.0F, 1.3F, -3.25F, 4, 9, 1, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 45, 22, -1.5F, 6.2F, -4.95F, 3, 5, 2, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 24, 61, -1.6F, 6.8F, -5.05F, 3, 1, 2, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 24, 61, -1.6F, 8.3F, -5.05F, 3, 1, 2, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 30, 23, -2.5F, 2.0F, -3.45F, 5, 4, 1, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 24, 24, -4.5F, 4.0F, -2.5F, 9, 6, 5, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 29, 17, -5.0F, 3.5F, -1.5F, 10, 6, 3, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 33, 19, -3.5F, 0.2F, 1.8F, 7, 10, 1, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 34, 20, -2.0F, 9.9F, -3.0F, 5, 2, 1, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 26, 26, -2.0F, 11.9F, -2.7F, 4, 3, 1, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 27, 21, -4.6F, 9.8F, -2.8F, 5, 2, 5, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 40, 20, 2.6F, 9.8F, -2.6F, 2, 2, 5, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 27, 20, -4.1F, 9.8F, 1.6F, 8, 2, 1, 0.0F, false));

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(0.0F, 0.0F, 0.0F);
		vest.addChild(bone19);
		setRotationAngle(bone19, 0.0F, -0.192F, 0.0F);
		bone19.cubeList.add(new ModelBox(bone19, 33, 16, 1.3523F, 1.3F, -3.5654F, 2, 9, 1, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 39, 17, 0.8903F, 6.2F, -5.0868F, 3, 5, 2, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 24, 61, 0.9693F, 6.8F, -5.2041F, 3, 1, 2, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 23, 61, 0.9693F, 8.3F, -5.2041F, 3, 1, 2, 0.0F, false));

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(0.0F, 0.0F, 0.0F);
		vest.addChild(bone20);
		setRotationAngle(bone20, 0.0F, 0.192F, 0.0F);
		bone20.cubeList.add(new ModelBox(bone20, 37, 18, -3.3423F, 1.3F, -3.5754F, 2, 9, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 27, 27, -3.9278F, 6.2F, -5.0874F, 3, 5, 2, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 24, 61, -4.0069F, 6.7F, -5.2046F, 3, 1, 2, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 24, 61, -4.0069F, 8.2F, -5.2046F, 3, 1, 2, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 35, 17, -5.7718F, 6.2F, -3.1308F, 2, 5, 4, 0.0F, false));

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(0.0F, 0.0F, 0.0F);
		vest.addChild(bone21);
		setRotationAngle(bone21, -0.2618F, -0.192F, 0.0F);
		bone21.cubeList.add(new ModelBox(bone21, 36, 23, 1.3731F, 0.2132F, -3.107F, 2, 2, 1, 0.0F, false));
		bone21.cubeList.add(new ModelBox(bone21, 24, 24, 1.9423F, 0.0511F, -3.2747F, 1, 3, 1, 0.0F, false));

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(0.0F, 0.0F, 0.0F);
		vest.addChild(bone22);
		setRotationAngle(bone22, -0.2618F, 0.192F, 0.0F);
		bone22.cubeList.add(new ModelBox(bone22, 35, 23, -3.3169F, 0.2166F, -3.1199F, 2, 2, 1, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 33, 22, -2.8677F, -0.0268F, -3.239F, 1, 3, 1, 0.0F, false));

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(0.0F, 0.0F, 0.0F);
		vest.addChild(bone23);
		setRotationAngle(bone23, 0.0F, -0.1745F, 0.0F);
		bone23.cubeList.add(new ModelBox(bone23, 37, 19, 1.4F, -0.6F, -2.9199F, 2, 1, 5, 0.0F, false));

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(0.0F, 0.0F, 0.0F);
		vest.addChild(bone24);
		setRotationAngle(bone24, 0.0F, 0.1745F, 0.0F);
		bone24.cubeList.add(new ModelBox(bone24, 36, 15, -3.35F, -0.6F, -2.9482F, 2, 1, 5, 0.0F, false));

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(0.0F, 0.0F, 0.0F);
		vest.addChild(bone25);
		setRotationAngle(bone25, -0.733F, 0.0F, 0.0F);
		bone25.cubeList.add(new ModelBox(bone25, 37, 22, -2.0F, 2.1363F, -2.2526F, 4, 1, 1, 0.0F, false));

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(0.0F, 0.0F, 0.0F);
		vest.addChild(bone26);
		setRotationAngle(bone26, -1.4661F, 0.0F, 0.3316F);
		bone26.cubeList.add(new ModelBox(bone26, 22, 60, -0.6482F, 3.1437F, 1.5609F, 5, 2, 2, 0.0F, false));
		bone26.cubeList.add(new ModelBox(bone26, 25, 61, -0.4529F, 3.0041F, 3.146F, 2, 2, 1, 0.0F, false));

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(0.0F, 0.0F, 0.0F);
		vest.addChild(bone27);
		setRotationAngle(bone27, 0.0349F, 0.0F, 0.0F);
		bone27.cubeList.add(new ModelBox(bone27, 37, 18, -2.5F, 0.5117F, 2.3347F, 5, 10, 1, 0.0F, false));
		bone27.cubeList.add(new ModelBox(bone27, 32, 19, -3.0F, 6.1183F, 1.5136F, 6, 5, 2, 0.0F, false));

		helmet = new ModelRenderer(this);
		helmet.setRotationPoint(0.0F, 0.0F, 0.0F);
		

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone);
		setRotationAngle(bone, -0.2443F, 0.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 30, 17, -4.0F, -6.9093F, -6.0678F, 8, 3, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -7.0F, -4.7F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.1396F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 40, 18, -1.0F, -0.46F, -2.4774F, 2, 1, 1, -0.199F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -7.0F, -5.0F);
		bone.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.1396F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 40, 20, -1.0F, 2.1079F, -2.1937F, 2, 1, 1, -0.2F, true));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -7.0F, -4.8F);
		bone.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.1396F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 42, 18, -3.7731F, 0.2829F, -2.3937F, 1, 2, 1, -0.2F, true));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -7.0F, -4.8F);
		bone.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.1396F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 38, 18, -3.5F, 0.6829F, -2.4687F, 7, 2, 1, -0.297F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 26, 25, -3.5F, -0.0171F, -2.4687F, 7, 2, 1, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 37, 18, 2.7731F, 0.2829F, -2.3937F, 1, 2, 1, -0.2F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, -7.0F, -4.7F);
		bone.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.1389F, -0.0145F, 0.1037F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 39, 19, 0.4731F, -0.5127F, -2.4774F, 3, 1, 1, -0.2F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, -7.0F, -4.7F);
		bone.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.1389F, 0.0145F, -0.1037F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 38, 17, -3.4731F, -0.5127F, -2.4774F, 3, 1, 1, -0.2F, true));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, -7.0F, -5.0F);
		bone.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.1371F, -0.0266F, 0.1902F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 40, 18, -3.0333F, 2.2207F, -2.1951F, 3, 1, 1, -0.2F, true));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, -7.0F, -5.0F);
		bone.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.1371F, 0.0266F, -0.1902F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 40, 20, 0.0333F, 2.2207F, -2.1951F, 3, 1, 1, -0.2F, false));

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone16);
		setRotationAngle(bone16, 0.1571F, 0.0F, 0.0F);
		bone16.cubeList.add(new ModelBox(bone16, 29, 16, -4.0F, -7.4229F, 3.4514F, 8, 5, 2, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, -0.2094F);
		bone2.cubeList.add(new ModelBox(bone2, 33, 14, 4.746F, -7.1F, -4.0F, 1, 3, 8, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 37, 17, 4.7462F, -4.7514F, 2.0F, 1, 3, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 35, 18, 4.7459F, -6.0646F, -2.8F, 1, 2, 5, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, -7.0F, -5.0F);
		bone2.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.212F, 0.1536F, -0.0329F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 36, 3.6818F, 0.219F, 0.9906F, 2, 1, 4, -0.1F, true));

		cube_r11_r1 = new ModelRenderer(this);
		cube_r11_r1.setRotationPoint(5.0622F, 0.1231F, 6.1554F);
		cube_r9.addChild(cube_r11_r1);
		setRotationAngle(cube_r11_r1, 0.0955F, -0.3885F, -0.0534F);
		cube_r11_r1.cubeList.add(new ModelBox(cube_r11_r1, 0, 37, -1.0F, -0.5F, 2.0F, 2, 1, 3, -0.1F, true));

		cube_r11_r2 = new ModelRenderer(this);
		cube_r11_r2.setRotationPoint(7.6197F, 0.9164F, 5.5873F);
		cube_r9.addChild(cube_r11_r2);
		setRotationAngle(cube_r11_r2, 1.9454F, -1.3361F, -1.9549F);
		cube_r11_r2.cubeList.add(new ModelBox(cube_r11_r2, 0, 36, 4.0F, -0.5F, 3.0F, 2, 1, 4, -0.1F, true));

		cube_r10_r1 = new ModelRenderer(this);
		cube_r10_r1.setRotationPoint(4.4415F, 0.3462F, 6.5284F);
		cube_r9.addChild(cube_r10_r1);
		setRotationAngle(cube_r10_r1, 0.22F, -0.1278F, -0.0285F);
		cube_r10_r1.cubeList.add(new ModelBox(cube_r10_r1, 0, 36, -1.0F, -0.5F, -2.0F, 2, 1, 4, -0.1F, true));

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
		bone3.cubeList.add(new ModelBox(bone3, 41, 17, 4.7401F, -5.0952F, 2.0797F, 1, 4, 2, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone5);
		setRotationAngle(bone5, 0.2967F, 0.0F, 0.2094F);
		bone5.cubeList.add(new ModelBox(bone5, 39, 15, -5.7152F, -5.1027F, 2.0931F, 1, 4, 2, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone11);
		bone11.cubeList.add(new ModelBox(bone11, 20, 18, -3.5F, -8.9F, -3.49F, 7, 1, 7, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone12);
		setRotationAngle(bone12, -0.7854F, 0.0F, 0.0F);
		bone12.cubeList.add(new ModelBox(bone12, 33, 19, -3.5F, -3.8F, -8.76F, 7, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 24, 22, -3.5F, -8.7497F, -3.8103F, 7, 1, 1, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone13);
		setRotationAngle(bone13, 0.0F, 0.0F, 0.7854F);
		bone13.cubeList.add(new ModelBox(bone13, 33, 15, -3.85F, -8.75F, -3.5F, 1, 1, 7, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 26, 23, -8.75F, -3.871F, -3.5F, 1, 1, 7, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 0.0F, 0.2094F);
		bone4.cubeList.add(new ModelBox(bone4, 30, 12, -5.7362F, -7.1F, -4.0F, 1, 3, 8, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 33, 13, -5.7363F, -6.0646F, -2.8F, 1, 2, 5, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 39, 17, -5.7262F, -4.7544F, 2.0F, 1, 3, 2, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, -7.0F, -5.0F);
		bone4.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.212F, -0.1536F, 0.0329F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 3, 37, -5.6818F, 0.219F, 0.9906F, 2, 1, 4, -0.1F, false));

		cube_r12_r1 = new ModelRenderer(this);
		cube_r12_r1.setRotationPoint(-5.042F, -0.2846F, 6.2506F);
		cube_r10.addChild(cube_r12_r1);
		setRotationAngle(cube_r12_r1, -0.013F, 0.3818F, -0.0258F);
		cube_r12_r1.cubeList.add(new ModelBox(cube_r12_r1, 4, 38, -1.0F, -0.5F, 2.0F, 2, 1, 3, -0.1F, false));

		cube_r13_r1 = new ModelRenderer(this);
		cube_r13_r1.setRotationPoint(0.7973F, 0.0281F, 10.1661F);
		cube_r10.addChild(cube_r13_r1);
		setRotationAngle(cube_r13_r1, 2.4234F, 1.1989F, 2.1888F);
		cube_r13_r1.cubeList.add(new ModelBox(cube_r13_r1, 3, 37, -0.8F, -0.8F, -2.0F, 2, 1, 4, -0.1F, false));

		cube_r12_r2 = new ModelRenderer(this);
		cube_r12_r2.setRotationPoint(-7.4132F, 1.2306F, 5.6782F);
		cube_r10.addChild(cube_r12_r2);
		setRotationAngle(cube_r12_r2, 1.7322F, 1.3055F, 1.7379F);
		cube_r12_r2.cubeList.add(new ModelBox(cube_r12_r2, 3, 37, -6.0F, -0.5F, 3.0F, 2, 1, 4, -0.1F, false));

		cube_r11_r3 = new ModelRenderer(this);
		cube_r11_r3.setRotationPoint(-4.4415F, 0.2755F, 6.4932F);
		cube_r10.addChild(cube_r11_r3);
		setRotationAngle(cube_r11_r3, 0.264F, 0.1264F, 0.0341F);
		cube_r11_r3.cubeList.add(new ModelBox(cube_r11_r3, 3, 37, -1.0F, -0.5F, -2.0F, 2, 1, 4, -0.1F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone8);
		setRotationAngle(bone8, -0.1571F, 0.0F, 0.0F);
		bone8.cubeList.add(new ModelBox(bone8, 24, 58, -4.2F, -5.1F, -3.9F, 1, 5, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 27, 58, 3.2F, -5.1F, -3.9F, 1, 5, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 33, 58, 3.2F, -4.2659F, 2.743F, 1, 2, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 32, 56, -4.2F, -4.2659F, 2.743F, 1, 2, 1, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone9);
		setRotationAngle(bone9, 0.192F, 0.0F, 0.0F);
		bone9.cubeList.add(new ModelBox(bone9, 17, 55, -4.1F, -1.8253F, -3.9628F, 2, 1, 8, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 24, 62, -2.5F, -1.9616F, -4.14F, 5, 1, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 18, 55, 2.1F, -1.8253F, -3.9628F, 2, 1, 8, 0.0F, false));
	
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