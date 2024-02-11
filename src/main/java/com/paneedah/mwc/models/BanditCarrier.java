package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class BanditCarrier extends ModelBiped {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer rightarm;
	private final ModelRenderer leftarm;
	private final ModelRenderer rightleg;
	private final ModelRenderer leftleg;
	private final ModelRenderer platecarrier;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;

	public BanditCarrier() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, false));

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		rightarm.cubeList.add(new ModelBox(rightarm, 36, 36, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(5.0F, 2.0F, 0.0F);
		leftarm.cubeList.add(new ModelBox(leftarm, 32, 0, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		rightleg.cubeList.add(new ModelBox(rightleg, 0, 32, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(2.0F, 12.0F, 0.0F);
		leftleg.cubeList.add(new ModelBox(leftleg, 24, 24, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		platecarrier = new ModelRenderer(this);
		platecarrier.setRotationPoint(0.0F, 0.0F, 0.0F);
		platecarrier.cubeList.add(new ModelBox(platecarrier, 0, 0, -3.5F, 1.75F, -2.58F, 7, 9, 5, -0.1F, false));
		platecarrier.cubeList.add(new ModelBox(platecarrier, 20, 17, -3.0F, 5.45F, -3.07F, 6, 5, 6, 0.0F, false));
		platecarrier.cubeList.add(new ModelBox(platecarrier, 0, 14, -4.0F, 6.25F, -2.62F, 8, 4, 5, 0.1F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(3.5F, 1.75F, -2.5F);
		platecarrier.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.192F, 0.0F, -0.1571F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 26, 28, -2.0F, -2.0F, 0.0F, 2, 2, 1, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-3.5F, 1.75F, -2.5F);
		platecarrier.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.192F, 0.0F, 0.1571F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 20, 28, 0.0F, -2.0F, 0.0F, 2, 2, 1, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-3.0F, 0.05F, 2.1F);
		platecarrier.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.1396F, 0.0F, -0.1222F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 27, 0, 0.0F, 0.0F, -1.0F, 2, 2, 1, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(3.0F, 0.05F, 2.1F);
		platecarrier.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.1396F, 0.0F, 0.1222F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 24, 5, -2.0F, 0.0F, -1.0F, 2, 2, 1, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(3.2F, -0.25F, -1.9F);
		platecarrier.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, -0.0698F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 21, 10, -2.0F, 0.0F, -0.05F, 2, 1, 4, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-3.2F, -0.25F, -1.9F);
		platecarrier.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0698F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 19, 0, 0.0F, 0.0F, -0.05F, 2, 1, 4, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-0.5F, 4.65F, -4.05F);
		platecarrier.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.05F, -0.065F, -0.025F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 10, 23, 0.0F, 0.0F, -0.22F, 3, 5, 2, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-4.6F, 5.05F, -3.35F);
		platecarrier.addChild(cube_r18);
		setRotationAngle(cube_r18, -0.0433F, 0.2406F, -0.1798F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 23, 0.0F, 0.0F, -0.22F, 3, 5, 2, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		platecarrier.addChild(bone);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.2333F, 4.9509F, -3.2507F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.1563F, -0.0164F, -0.487F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 41, 6, -1.0F, -2.0F, -0.5F, 2, 1, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.9F, 4.8F, -3.3F);
		bone.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.1469F, -0.0561F, -0.228F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 41, 9, -1.0F, -1.0F, -0.5F, 2, 2, 1, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-3.2783F, 4.2198F, -3.1921F);
		platecarrier.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.3054F, 0.0F);
		

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.5117F, 0.7311F, 0.1414F);
		bone2.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.1563F, -0.0164F, -0.487F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 49, 6, -1.0F, -2.0F, -0.5F, 2, 1, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.1783F, 0.5802F, 0.0921F);
		bone2.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.1469F, -0.0561F, -0.228F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 49, 9, -1.0F, -1.0F, -0.5F, 2, 2, 1, 0.0F, false));

		bipedLeftArm.isHidden = true;
		bipedRightArm.isHidden = true;
		bipedBody = platecarrier;
		bipedLeftLeg.isHidden = true;
		bipedRightLeg.isHidden = true;
		bipedHead.isHidden = true;
		bipedHeadwear.isHidden = true;
		
    }

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
//		if(entity != null) {
//			super.render(entity, f, f1, f2, f3, f4, f5);
//		} else vest.render(f5);
		
		super.render(entity, f, f1, f2, f3, f4, f5);
//		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
//		vest.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}