package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.0
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class OldUniform extends ModelBiped {
	private final ModelRenderer head;
	private final ModelRenderer rightarm_usmc;
	private final ModelRenderer rightarm1;
	private final ModelRenderer rightarm2;
	private final ModelRenderer rightarm3;
	private final ModelRenderer rightarm4;
	private final ModelRenderer rightarm5;
	private final ModelRenderer rightarm6;
	private final ModelRenderer rightarm7;
	private final ModelRenderer leftarm_usmc;
	private final ModelRenderer leftarm1;
	private final ModelRenderer leftarm2;
	private final ModelRenderer leftarm3;
	private final ModelRenderer leftarm4;
	private final ModelRenderer leftarm5;
	private final ModelRenderer leftarm6;
	private final ModelRenderer leftarm7;
	private final ModelRenderer rightleg_usmc;
	private final ModelRenderer rightleg1;
	private final ModelRenderer rightleg2;
	private final ModelRenderer rightleg3;
	private final ModelRenderer rightleg4;
	private final ModelRenderer leftleg_usmc;
	private final ModelRenderer leftleg1;
	private final ModelRenderer leftleg2;
	private final ModelRenderer leftleg3;
	private final ModelRenderer leftleg4;
	private final ModelRenderer leftleg5;
	private final ModelRenderer jacket;
	private final ModelRenderer jacket1;
	private final ModelRenderer jacket2;
	private final ModelRenderer jacket3;
	private final ModelRenderer jacket4;
	private final ModelRenderer jacket5;
	private final ModelRenderer jacket6;
	private final ModelRenderer jacket7;

	public OldUniform() {
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
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 0, 46, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));

		bipedLeftArm = new ModelRenderer(this);
		bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 34, 35, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));

		bipedRightLeg = new ModelRenderer(this);
		bipedRightLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 18, 35, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		bipedLeftLeg = new ModelRenderer(this);
		bipedLeftLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 32, 8, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		rightarm_usmc = new ModelRenderer(this);
		rightarm_usmc.setRotationPoint(0.0F, 0.0F, 0.0F);
		

		rightarm1 = new ModelRenderer(this);
		rightarm1.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm_usmc.addChild(rightarm1);
		rightarm1.cubeList.add(new ModelBox(rightarm1, 109, 81, -3.0F, 5.05F, -2.1F, 4, 1, 1, 0.0F, false));
		rightarm1.cubeList.add(new ModelBox(rightarm1, 103, 102, -3.0F, 5.05F, 1.1F, 4, 1, 1, 0.0F, false));
		rightarm1.cubeList.add(new ModelBox(rightarm1, 101, 63, -3.0F, -1.95F, 1.2F, 4, 7, 1, 0.0F, false));
		rightarm1.cubeList.add(new ModelBox(rightarm1, 93, 76, 0.2F, -1.95F, -2.0F, 1, 7, 4, 0.0F, false));
		rightarm1.cubeList.add(new ModelBox(rightarm1, 109, 102, -3.1F, 5.05F, -2.0F, 1, 1, 4, 0.0F, false));
		rightarm1.cubeList.add(new ModelBox(rightarm1, 93, 117, 0.1F, 5.05F, -2.0F, 1, 1, 4, 0.0F, false));

		rightarm2 = new ModelRenderer(this);
		rightarm2.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm_usmc.addChild(rightarm2);
		setRotationAngle(rightarm2, 0.0F, 0.0F, 0.0524F);
		rightarm2.cubeList.add(new ModelBox(rightarm2, 97, 100, -3.1893F, -1.7398F, -2.0F, 1, 5, 4, 0.0F, false));

		rightarm3 = new ModelRenderer(this);
		rightarm3.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm_usmc.addChild(rightarm3);
		setRotationAngle(rightarm3, 0.0F, 0.0F, -0.0524F);
		rightarm3.cubeList.add(new ModelBox(rightarm3, 55, 117, -3.5726F, 2.9014F, -2.0F, 1, 2, 4, 0.0F, false));

		rightarm4 = new ModelRenderer(this);
		rightarm4.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm_usmc.addChild(rightarm4);
		setRotationAngle(rightarm4, -0.0349F, 0.0349F, 0.0F);
		rightarm4.cubeList.add(new ModelBox(rightarm4, 107, 112, -2.93F, -1.8591F, -2.3035F, 4, 5, 1, 0.0F, false));

		rightarm5 = new ModelRenderer(this);
		rightarm5.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm_usmc.addChild(rightarm5);
		setRotationAngle(rightarm5, 0.0349F, 0.1047F, 0.0F);
		rightarm5.cubeList.add(new ModelBox(rightarm5, 105, 118, -2.78F, 2.9806F, -2.5493F, 4, 2, 1, 0.0F, false));

		rightarm6 = new ModelRenderer(this);
		rightarm6.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm_usmc.addChild(rightarm6);
		setRotationAngle(rightarm6, 0.0F, 0.0F, -0.0873F);
		

		rightarm7 = new ModelRenderer(this);
		rightarm7.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm_usmc.addChild(rightarm7);
		setRotationAngle(rightarm7, 0.0F, 0.0F, -0.0349F);
		rightarm7.cubeList.add(new ModelBox(rightarm7, 83, 99, -2.9437F, -2.2486F, -2.01F, 4, 1, 4, 0.0F, false));

		leftarm_usmc = new ModelRenderer(this);
		leftarm_usmc.setRotationPoint(0.0F, 0.0F, 0.0F);
		

		leftarm1 = new ModelRenderer(this);
		leftarm1.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm_usmc.addChild(leftarm1);
		setRotationAngle(leftarm1, 0.0F, 0.0F, -0.0524F);
		leftarm1.cubeList.add(new ModelBox(leftarm1, 55, 108, 2.2489F, -1.75F, -2.0F, 1, 5, 4, 0.0F, false));
		leftarm1.cubeList.add(new ModelBox(leftarm1, 75, 117, -1.4477F, 3.0282F, -2.0F, 1, 2, 4, 0.0F, false));

		leftarm2 = new ModelRenderer(this);
		leftarm2.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm_usmc.addChild(leftarm2);
		setRotationAngle(leftarm2, 0.0F, 0.0F, 0.0349F);
		leftarm2.cubeList.add(new ModelBox(leftarm2, 55, 108, -1.1508F, -1.863F, -2.0F, 1, 5, 4, 0.0F, false));
		leftarm2.cubeList.add(new ModelBox(leftarm2, 109, 75, 2.5216F, 2.97F, -2.0F, 1, 2, 4, 0.0F, false));

		leftarm3 = new ModelRenderer(this);
		leftarm3.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm_usmc.addChild(leftarm3);
		setRotationAngle(leftarm3, -0.0175F, -0.0698F, 0.0F);
		leftarm3.cubeList.add(new ModelBox(leftarm3, 65, 117, -1.1523F, -1.8719F, -2.2856F, 4, 5, 1, 0.0F, false));

		leftarm4 = new ModelRenderer(this);
		leftarm4.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm_usmc.addChild(leftarm4);
		setRotationAngle(leftarm4, 0.0698F, -0.0524F, 0.0F);
		leftarm4.cubeList.add(new ModelBox(leftarm4, 111, 63, -1.1F, 2.9234F, -2.5902F, 4, 2, 1, 0.0F, false));

		leftarm5 = new ModelRenderer(this);
		leftarm5.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm_usmc.addChild(leftarm5);
		leftarm5.cubeList.add(new ModelBox(leftarm5, 101, 71, -1.0F, -1.95F, 1.2F, 4, 7, 1, 0.0F, false));
		leftarm5.cubeList.add(new ModelBox(leftarm5, 111, 72, -1.0F, 5.05F, -2.1F, 4, 1, 1, 0.0F, false));
		leftarm5.cubeList.add(new ModelBox(leftarm5, 109, 107, -1.0F, 5.05F, 1.1F, 4, 1, 1, 0.0F, false));
		leftarm5.cubeList.add(new ModelBox(leftarm5, 99, 118, -1.1F, 5.05F, -2.0F, 1, 1, 4, 0.0F, false));
		leftarm5.cubeList.add(new ModelBox(leftarm5, 110, 67, 2.1F, 5.05F, -2.0F, 1, 1, 4, 0.0F, false));

		leftarm6 = new ModelRenderer(this);
		leftarm6.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm_usmc.addChild(leftarm6);
		setRotationAngle(leftarm6, 0.0F, 0.0F, 0.0873F);
		

		leftarm7 = new ModelRenderer(this);
		leftarm7.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm_usmc.addChild(leftarm7);
		setRotationAngle(leftarm7, 0.0F, 0.0F, 0.0349F);
		leftarm7.cubeList.add(new ModelBox(leftarm7, 55, 103, -1.0684F, -2.1712F, -2.01F, 4, 1, 4, 0.0F, false));

		rightleg_usmc = new ModelRenderer(this);
		rightleg_usmc.setRotationPoint(0.0F, 0.0F, 0.0F);
		

		rightleg1 = new ModelRenderer(this);
		rightleg1.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightleg_usmc.addChild(rightleg1);
		rightleg1.cubeList.add(new ModelBox(rightleg1, 55, 77, -2.0F, -0.001F, -2.14F, 4, 9, 4, 0.0F, false));
		rightleg1.cubeList.add(new ModelBox(rightleg1, 87, 104, -2.0F, -0.0005F, 1.2F, 4, 9, 1, 0.0F, false));
		rightleg1.cubeList.add(new ModelBox(rightleg1, 103, 97, -2.0F, 9.0F, -2.1F, 4, 3, 2, 0.0F, false));
		rightleg1.cubeList.add(new ModelBox(rightleg1, 103, 79, -2.1F, 9.0F, -2.0F, 1, 3, 4, 0.0F, false));
		rightleg1.cubeList.add(new ModelBox(rightleg1, 103, 86, -2.0F, 9.0F, 0.1F, 4, 3, 2, 0.0F, false));
		rightleg1.cubeList.add(new ModelBox(rightleg1, 103, 79, 1.1F, 9.0F, -2.0F, 1, 3, 4, 0.0F, false));
		rightleg1.cubeList.add(new ModelBox(rightleg1, 71, 103, -2.0F, 11.01F, -2.0F, 4, 1, 4, 0.0F, false));

		rightleg2 = new ModelRenderer(this);
		rightleg2.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightleg_usmc.addChild(rightleg2);
		setRotationAngle(rightleg2, 0.0F, 0.0F, 0.0524F);
		rightleg2.cubeList.add(new ModelBox(rightleg2, 65, 108, -2.0948F, 0.0999F, -2.0F, 1, 5, 4, 0.0F, false));

		rightleg3 = new ModelRenderer(this);
		rightleg3.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightleg_usmc.addChild(rightleg3);
		setRotationAngle(rightleg3, 0.0F, 0.0F, -0.0175F);
		rightleg3.cubeList.add(new ModelBox(rightleg3, 97, 109, -2.3855F, 4.97F, -2.0F, 1, 4, 4, 0.0F, false));
		rightleg3.cubeList.add(new ModelBox(rightleg3, 67, 90, 1.1F, 0.05F, -2.0F, 1, 9, 4, 0.0F, false));

		rightleg4 = new ModelRenderer(this);
		rightleg4.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightleg_usmc.addChild(rightleg4);
		setRotationAngle(rightleg4, -0.1222F, 0.1047F, 0.0F);
		rightleg4.cubeList.add(new ModelBox(rightleg4, 81, 119, -1.8F, 11.1314F, -1.0206F, 4, 1, 1, 0.0F, false));

		leftleg_usmc = new ModelRenderer(this);
		leftleg_usmc.setRotationPoint(0.0F, 0.0F, 0.0F);
		

		leftleg1 = new ModelRenderer(this);
		leftleg1.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftleg_usmc.addChild(leftleg1);
		setRotationAngle(leftleg1, 0.0F, -0.0524F, 0.0349F);
		leftleg1.cubeList.add(new ModelBox(leftleg1, 97, 87, 1.27F, -0.0955F, -2.1F, 1, 6, 4, 0.0F, false));

		leftleg2 = new ModelRenderer(this);
		leftleg2.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftleg_usmc.addChild(leftleg2);
		setRotationAngle(leftleg2, 0.0F, -0.0349F, -0.0349F);
		leftleg2.cubeList.add(new ModelBox(leftleg2, 75, 108, 0.9226F, 4.1F, -2.0509F, 1, 5, 4, 0.0F, false));

		leftleg3 = new ModelRenderer(this);
		leftleg3.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftleg_usmc.addChild(leftleg3);
		setRotationAngle(leftleg3, 0.0F, 0.0F, 0.0349F);
		leftleg3.cubeList.add(new ModelBox(leftleg3, 87, 86, -2.0965F, 0.068F, -2.03F, 1, 9, 4, 0.0F, false));

		leftleg4 = new ModelRenderer(this);
		leftleg4.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftleg_usmc.addChild(leftleg4);
		leftleg4.cubeList.add(new ModelBox(leftleg4, 77, 63, -1.9535F, -0.001F, -2.1786F, 4, 9, 3, 0.0F, false));
		leftleg4.cubeList.add(new ModelBox(leftleg4, 81, 75, -2.0535F, -0.0001F, 0.2214F, 4, 9, 2, 0.0F, false));
		leftleg4.cubeList.add(new ModelBox(leftleg4, 107, 91, -2.0F, 9.0F, 0.1F, 4, 3, 2, 0.0F, false));
		leftleg4.cubeList.add(new ModelBox(leftleg4, 85, 114, -2.0F, 9.0F, -2.1F, 4, 3, 2, 0.0F, false));
		leftleg4.cubeList.add(new ModelBox(leftleg4, 71, 103, -2.0F, 11.01F, -2.0F, 4, 1, 4, 0.0F, false));
		leftleg4.cubeList.add(new ModelBox(leftleg4, 103, 105, 1.1F, 9.0F, -2.0F, 1, 3, 4, 0.0F, false));
		leftleg4.cubeList.add(new ModelBox(leftleg4, 103, 105, -2.1F, 9.0F, -2.0F, 1, 3, 4, 0.0F, false));

		leftleg5 = new ModelRenderer(this);
		leftleg5.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftleg_usmc.addChild(leftleg5);
		setRotationAngle(leftleg5, -0.1222F, -0.1047F, 0.0F);
		leftleg5.cubeList.add(new ModelBox(leftleg5, 113, 83, -2.1928F, 11.1268F, -0.9835F, 4, 1, 1, 0.0F, false));


		jacket = new ModelRenderer(this);
		jacket.setRotationPoint(0.0F, 24.0F, 1.0F);
		

		jacket1 = new ModelRenderer(this);
		jacket1.setRotationPoint(0.0F, -24.0F, 0.0F);
		jacket.addChild(jacket1);
		setRotationAngle(jacket1, 0.0F, -0.1047F, -0.0175F);
		jacket1.cubeList.add(new ModelBox(jacket1, 91, 63, -0.0418F, 0.85F, -2.58F, 4, 12, 1, 0.0F, false));

		jacket2 = new ModelRenderer(this);
		jacket2.setRotationPoint(0.0F, -24.0F, 0.0F);
		jacket.addChild(jacket2);
		setRotationAngle(jacket2, 0.0F, 0.0349F, 0.0349F);
		jacket2.cubeList.add(new ModelBox(jacket2, 55, 90, -3.93F, 0.8411F, -2.294F, 5, 12, 1, 0.0F, false));

		jacket3 = new ModelRenderer(this);
		jacket3.setRotationPoint(0.0F, -24.0F, 0.0F);
		jacket.addChild(jacket3);
		setRotationAngle(jacket3, -0.2094F, -0.1047F, 0.0F);
		jacket3.cubeList.add(new ModelBox(jacket3, 83, 86, 0.9791F, 0.4113F, -2.36F, 3, 1, 1, 0.0F, false));

		jacket4 = new ModelRenderer(this);
		jacket4.setRotationPoint(0.0F, -24.0F, 0.0F);
		jacket.addChild(jacket4);
		setRotationAngle(jacket4, 0.0F, -0.0524F, -0.0175F);
		jacket4.cubeList.add(new ModelBox(jacket4, 77, 86, 3.1F, -0.0483F, -2.1973F, 1, 13, 4, 0.0F, false));

		jacket5 = new ModelRenderer(this);
		jacket5.setRotationPoint(0.0F, -24.0F, 0.0F);
		jacket.addChild(jacket5);
		setRotationAngle(jacket5, 0.0F, 0.0524F, 0.0175F);
		jacket5.cubeList.add(new ModelBox(jacket5, 71, 73, -4.1135F, -0.1226F, -2.1748F, 1, 13, 4, 0.0F, false));

		jacket6 = new ModelRenderer(this);
		jacket6.setRotationPoint(0.0F, -24.0F, 0.0F);
		jacket.addChild(jacket6);
		setRotationAngle(jacket6, -0.1047F, 0.0349F, 0.0349F);
		jacket6.cubeList.add(new ModelBox(jacket6, 83, 86, -3.9195F, 0.1396F, -2.2031F, 3, 1, 1, 0.0F, false));

		jacket7 = new ModelRenderer(this);
		jacket7.setRotationPoint(0.0F, -24.0F, 0.0F);
		jacket.addChild(jacket7);
		setRotationAngle(jacket7, 0.0175F, 0.0F, 0.0F);
		jacket7.cubeList.add(new ModelBox(jacket7, 55, 63, -4.0F, -0.1191F, 1.0911F, 8, 13, 1, 0.0F, false));

		this.bipedBody.addChild(jacket);
		this.bipedLeftArm.addChild(leftarm_usmc);
		this.bipedRightArm.addChild(rightarm_usmc);
		this.bipedLeftLeg.addChild(leftleg_usmc);
		this.bipedRightLeg.addChild(rightleg_usmc);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
//		rightarm_usmc.render(f5);
//		leftarm_usmc.render(f5);
//		rightleg_usmc.render(f5);
//		leftleg_usmc.render(f5);
//		head.render(f5);
//		jacket.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}