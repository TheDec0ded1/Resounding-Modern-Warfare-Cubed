package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Headset extends ModelBiped {
	private final ModelRenderer headset;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;

	public Headset() {
		textureWidth = 85;
		textureHeight = 128;

		headset = new ModelRenderer(this);
		headset.setRotationPoint(0.0F, 0.0F, 0.0F);
		headset.cubeList.add(new ModelBox(headset, 21, 81, -4.0F, -8.5F, -1.0F, 8, 1, 2, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(3.8F, -1.5F, -5.4F);
		headset.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.3665F, 1.0123F, 1.2392F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 41, 92, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(5.2F, -1.8F, -4.3F);
		headset.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.9425F, 0.6458F, 0.6283F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 41, 81, -1.0F, 0.0F, 0.0F, 1, 2, 1, -0.2F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(5.35F, -3.2F, -1.9F);
		headset.addChild(cube_r3);
		setRotationAngle(cube_r3, -1.0472F, 0.0349F, 0.1745F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 81, -1.0F, 0.0F, 0.0F, 1, 3, 1, -0.2F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-5.15F, -5.35F, -1.0F);
		headset.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.2618F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 68, 0.1114F, -3.0871F, -0.001F, 1, 3, 2, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(4.95F, -5.35F, -1.0F);
		headset.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.2618F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 25, 84, -0.8886F, -3.0871F, -0.001F, 1, 3, 2, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-3.95F, -3.95F, 1.9F);
		headset.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, -0.733F, -0.1222F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 1, 97, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.3F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(5.4F, -3.75F, 1.9F);
		headset.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, -0.733F, 0.1222F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 21, 103, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.3F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-5.6F, -5.5F, -2.45F);
		headset.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.9076F, 1.5882F, -0.1222F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 25, 65, -5.0F, -1.0F, 0.0F, 5, 1, 1, -0.3F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(5.5F, -5.5F, 2.55F);
		headset.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.9076F, -1.5882F, 0.1222F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 25, 67, -5.0F, -1.0F, 0.0F, 5, 1, 1, -0.3F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-3.95F, -3.95F, -1.9F);
		headset.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, -0.733F, -0.1222F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 25, 89, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.3F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(5.4F, -3.75F, -1.9F);
		headset.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, -0.733F, 0.1222F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 24, 105, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.3F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-4.9F, -3.4F, -0.3F);
		headset.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.9076F, 0.0F, 0.2793F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 5, 68, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(4.9F, -3.4F, -0.3F);
		headset.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.9076F, 0.0F, -0.2793F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 41, 90, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-5.71F, -3.83F, -1.0F);
		headset.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, 0.4189F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 19, 116, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(5.71F, -3.83F, -1.0F);
		headset.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, -0.4189F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 19, 111, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(5.25F, -2.25F, 1.85F);
		headset.addChild(bone);
		

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, -0.733F, 0.1222F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 28, 105, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.2F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.0F, 0.0F, -3.75F);
		bone.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, -0.733F, 0.1222F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 32, 105, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.2F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-0.25F, 0.5F, -1.1F);
		bone.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, 0.1222F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 19, 97, -2.0F, -2.0F, 0.0F, 2, 2, 1, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 17, 100, -2.0F, -2.0F, -2.5F, 2, 2, 1, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.0F, -1.5F, -0.1F);
		bone.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.8378F, 0.0F, 0.1222F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 37, 84, -2.005F, -1.0F, -1.0F, 2, 1, 1, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.0F, -1.5F, -3.6F);
		bone.addChild(cube_r20);
		setRotationAngle(cube_r20, -0.8378F, 0.0F, 0.1222F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 37, 88, -2.005F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-0.04F, -1.18F, -2.85F);
		bone.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, 0.1222F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 25, 69, -2.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-2.85F, -2.6F, 1.85F);
		headset.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, -0.2793F);
		

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, -0.733F, 0.1222F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 37, 90, -1.6355F, -2.0342F, 0.5722F, 1, 2, 1, -0.2F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(0.0F, 0.0F, -3.75F);
		bone2.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, -0.733F, 0.1222F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 17, 103, -1.6355F, -2.0342F, 0.5722F, 1, 2, 1, -0.2F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-0.25F, 0.5F, -1.1F);
		bone2.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, 0.1222F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 31, 84, -2.0F, -2.0F, 0.0F, 2, 2, 1, 0.0F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 13, 97, -2.0F, -2.0F, -2.5F, 2, 2, 1, 0.0F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(0.0F, -1.5F, -0.1F);
		bone2.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.8378F, 0.0F, 0.1222F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 31, 87, -2.0F, -1.0F, -1.0F, 2, 1, 1, 0.0F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(0.0F, -1.5F, -3.6F);
		bone2.addChild(cube_r26);
		setRotationAngle(cube_r26, -0.8378F, 0.0F, 0.1222F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 36, 86, -2.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(-0.04F, -1.18F, -2.85F);
		bone2.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, 0.0F, 0.1222F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 1, 65, -2.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		headset.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}