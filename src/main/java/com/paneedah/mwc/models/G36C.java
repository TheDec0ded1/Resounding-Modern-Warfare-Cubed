package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class G36C extends ModelWithAttachments {
	private final ModelRenderer body;
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
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer grip;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer gun240_r1;
	private final ModelRenderer gun239_r1;
	private final ModelRenderer gun238_r1;
	private final ModelRenderer bone;
	private final ModelRenderer gun240_r2;
	private final ModelRenderer gun241_r1;
	private final ModelRenderer gun242_r1;
	private final ModelRenderer gun240_r3;
	private final ModelRenderer gun241_r2;
	private final ModelRenderer bone6;
	private final ModelRenderer gun241_r3;
	private final ModelRenderer gun242_r2;

	public G36C() {
		textureWidth = 220;
		textureHeight = 220;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.8457F, -11.0F, -22.7706F);
		body.cubeList.add(new ModelBox(body, 130, 0, -1.1705F, 3.0F, -1.7294F, 1, 4, 11, 0.001F, false));
		body.cubeList.add(new ModelBox(body, 69, 129, -1.4707F, -6.0F, 10.2706F, 1, 1, 17, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 116, 110, -1.1707F, 2.45F, -3.7294F, 1, 2, 13, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 70, 92, -0.9207F, 1.9F, 9.5206F, 1, 2, 2, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 27, 100, -0.9206F, 1.9F, 10.4206F, 1, 3, 4, 0.001F, false));
		body.cubeList.add(new ModelBox(body, 0, 130, -0.9221F, -1.7652F, -4.7294F, 1, 4, 32, 0.001F, false));
		body.cubeList.add(new ModelBox(body, 23, 65, -0.6721F, -2.7652F, 27.2706F, 1, 7, 2, 0.001F, false));
		body.cubeList.add(new ModelBox(body, 65, 117, -0.4221F, -2.7652F, 26.2706F, 1, 1, 1, 0.001F, false));
		body.cubeList.add(new ModelBox(body, 64, 30, -0.6721F, 2.2348F, 29.2706F, 1, 2, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 60, 100, -2.9222F, 2.2348F, 24.2706F, 3, 2, 3, 0.001F, false));
		body.cubeList.add(new ModelBox(body, 110, 85, -2.9221F, 2.2348F, 23.5706F, 3, 2, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 38, 47, -0.9221F, 2.2348F, 14.2206F, 1, 3, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 2, 74, -0.9206F, 2.4098F, 15.4706F, 1, 2, 6, 0.002F, false));
		body.cubeList.add(new ModelBox(body, 84, 61, -0.7137F, 2.3098F, 17.0706F, 1, 1, 2, -0.2F, false));
		body.cubeList.add(new ModelBox(body, 58, 47, -0.7137F, 3.4098F, 18.5706F, 1, 1, 2, -0.2F, false));
		body.cubeList.add(new ModelBox(body, 100, 50, -0.7137F, 4.2098F, 16.5706F, 1, 1, 4, -0.2F, false));
		body.cubeList.add(new ModelBox(body, 80, 31, -4.9777F, 4.2098F, 16.5706F, 1, 1, 4, -0.2F, false));
		body.cubeList.add(new ModelBox(body, 28, 39, -4.9777F, 3.4098F, 18.5706F, 1, 1, 2, -0.2F, false));
		body.cubeList.add(new ModelBox(body, 11, 47, -4.9777F, 2.3098F, 17.0706F, 1, 1, 2, -0.2F, false));
		body.cubeList.add(new ModelBox(body, 100, 39, -0.9221F, -1.7652F, -8.7294F, 1, 3, 4, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 151, 110, -2.2957F, 1.1F, -2.7294F, 2, 4, 24, 0.001F, false));
		body.cubeList.add(new ModelBox(body, 94, 66, -4.1957F, 2.0F, -5.4794F, 4, 2, 1, 0.002F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, -4.3457F, -4.0F, -17.7294F, 4, 2, 45, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 47, 47, -4.3457F, -5.0F, 10.2706F, 4, 1, 17, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 130, -4.5209F, 3.0F, -1.7294F, 1, 4, 11, 0.001F, false));
		body.cubeList.add(new ModelBox(body, 116, 92, -4.5207F, 2.45F, -3.7294F, 1, 2, 13, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 22, 30, -4.7707F, 0.9F, 9.5206F, 1, 3, 2, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 96, 92, -4.7708F, 1.9F, 10.4206F, 1, 3, 4, 0.001F, false));
		body.cubeList.add(new ModelBox(body, 53, 0, -4.7694F, -1.7652F, 10.2706F, 1, 4, 17, 0.001F, false));
		body.cubeList.add(new ModelBox(body, 11, 0, -5.5194F, -1.7652F, 10.2706F, 1, 2, 1, 0.001F, false));
		body.cubeList.add(new ModelBox(body, 0, 17, -4.7694F, -1.7652F, -4.7294F, 1, 4, 3, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 88, 129, -4.7694F, 0.2348F, -1.7294F, 1, 2, 12, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 95, 22, -4.7692F, 2.2348F, 24.2706F, 3, 2, 3, 0.002F, false));
		body.cubeList.add(new ModelBox(body, 112, 29, -4.7694F, 2.2348F, 23.5706F, 2, 2, 1, 0.003F, false));
		body.cubeList.add(new ModelBox(body, 25, 47, -4.7694F, 2.2348F, 14.2206F, 1, 3, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 72, 55, -4.7708F, 2.4098F, 15.4706F, 1, 2, 6, 0.002F, false));
		body.cubeList.add(new ModelBox(body, 95, 15, -4.7694F, -1.7652F, -8.7294F, 1, 3, 4, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 151, 63, -4.3957F, 1.1F, -2.7294F, 2, 4, 24, 0.001F, false));
		body.cubeList.add(new ModelBox(body, 0, 59, -4.4957F, 2.0F, -5.4794F, 1, 2, 1, 0.001F, false));
		body.cubeList.add(new ModelBox(body, 0, 65, -4.2207F, -6.0F, 10.2706F, 3, 1, 17, 0.001F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-3.6386F, -5.0F, 18.7706F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 91, -0.5F, -0.5F, -8.5F, 1, 1, 17, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.6957F, 2.4135F, 23.295F);
		body.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.3927F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 28, 87, -2.175F, 1.0F, -2.0F, 4, 1, 1, -0.1F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 104, 34, -1.125F, 1.0F, -2.0F, 4, 1, 1, -0.1F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-2.5957F, 3.3762F, 19.8813F);
		body.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.2182F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 53, 39, -2.175F, 0.0F, -2.0F, 3, 2, 4, -0.002F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 67, 39, -0.325F, 0.0F, -2.0F, 3, 2, 4, -0.001F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-2.5957F, 4.2114F, 14.9838F);
		body.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 32, 39, -2.175F, -1.75F, 0.5F, 3, 3, 3, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 14, 83, -0.325F, -1.75F, 0.5F, 3, 3, 3, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-2.5957F, 4.9368F, 14.6694F);
		body.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.0873F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 24, -2.1752F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 11, 24, -0.3248F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-2.5957F, 4.7842F, 12.9261F);
		body.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.0873F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 59, -2.175F, -0.5F, -2.5F, 3, 1, 4, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 71, 75, -0.325F, -0.5F, -2.5F, 3, 1, 4, -0.001F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-3.9957F, 2.6512F, -5.9047F);
		body.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.48F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 98, 84, -0.4999F, -1.0F, -3.0F, 1, 2, 4, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 16, 39, -0.2001F, -1.0F, -3.0F, 4, 2, 4, 0.001F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-3.8956F, 2.6F, 22.2706F);
		body.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.48F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 11, 17, -0.5F, -2.0F, -1.0F, 1, 4, 3, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 34, 65, 2.5998F, -2.0F, -1.0F, 1, 4, 3, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-3.8956F, 3.4691F, 15.7141F);
		body.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.0873F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 8, 65, -0.5F, -2.0F, -1.5F, 1, 4, 3, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 71, 21, 2.5998F, -2.0F, -1.5F, 1, 4, 3, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-3.6457F, 2.6F, -2.9794F);
		body.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.3054F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 95, 0, -0.7499F, -2.0F, -2.0F, 1, 4, 4, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 53, 8, -0.6501F, -2.0F, -2.0F, 4, 4, 4, 0.001F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-4.5694F, 3.9301F, 22.708F);
		body.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.7854F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 33, 79, -0.5F, -0.5F, -1.0F, 2, 1, 2, -0.3F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 111, 0, 2.9473F, -0.5F, -1.0F, 2, 1, 2, -0.3F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-4.2694F, 3.4705F, 21.8242F);
		body.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.7854F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 9, 101, -0.4998F, -2.7F, -1.225F, 1, 2, 3, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 111, 9, -0.5001F, -0.5F, -1.0F, 1, 1, 2, 0.002F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 69, 102, 3.347F, -2.7F, -1.225F, 1, 2, 3, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 114, 3.3473F, -0.5F, -1.0F, 1, 1, 2, 0.002F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-4.8123F, -0.7652F, 11.2706F);
		body.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.7854F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 13, 31, -0.5F, -1.0F, -0.5F, 1, 2, 2, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-4.0207F, 5.4403F, -1.4147F);
		body.addChild(cube_r14);
		setRotationAngle(cube_r14, -1.0908F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 99, -0.5F, -1.0F, -1.5F, 3, 2, 3, -0.002F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 42, 102, 0.85F, -1.0F, -1.5F, 3, 2, 3, -0.001F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-4.0207F, 4.7261F, -1.9479F);
		body.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.7418F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 19, 99, -0.5F, -1.0F, -1.5F, 3, 2, 3, -0.001F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 79, 108, 0.85F, -1.0F, -1.5F, 3, 2, 3, -0.002F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-3.0208F, 7.782F, 4.3866F);
		body.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.1745F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 42, 109, -1.5F, -0.5F, -6.0F, 3, 1, 12, -0.001F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 110, 76, -0.1498F, -0.5F, -6.0F, 3, 1, 12, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-1.0528F, -5.0F, 18.7706F);
		body.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, 0.7854F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 109, -0.5F, -0.5F, -8.5F, 1, 1, 17, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-4.8694F, 4.5098F, 17.1706F);
		body.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.1063F, -0.1736F, -0.0184F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 36, 87, -0.5015F, -1.0F, 0.0F, 1, 1, 2, -0.1F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-4.7694F, 5.0098F, 16.5706F);
		body.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.4189F, 0.0F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 30, 11, -0.5015F, -2.0F, 0.0F, 1, 2, 2, -0.2F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 31, 0, 4.3487F, -2.0F, 0.0F, 1, 2, 2, -0.2F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.1779F, 4.5098F, 17.1706F);
		body.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.1063F, 0.1736F, 0.0184F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 11, 91, -0.4985F, -1.0F, 0.0F, 1, 1, 2, -0.1F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-0.3684F, 0.7348F, 27.1478F);
		body.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.6109F, 0.0F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 54, 92, -0.5F, -3.5F, -0.5F, 1, 7, 1, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-0.1721F, -0.0977F, 29.2414F);
		body.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.2182F, 0.0F, 0.0F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 9, 113, -0.5F, -2.5F, -0.5F, 1, 5, 1, -0.001F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-0.1292F, -2.2652F, 27.2706F);
		body.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.7854F, 0.0F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 117, 53, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.001F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-0.1292F, -2.2652F, 26.2706F);
		body.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.7854F, 0.0F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 117, 65, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.001F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-0.5471F, -2.2652F, 25.2706F);
		body.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.1309F, 0.0F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 117, 84, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-4.7693F, -1.7652F, -7.7294F);
		body.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, 0.2269F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 42, 92, 0.0F, -2.0F, 0.0F, 1, 2, 35, 0.0F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(0.0779F, -1.7652F, -7.7294F);
		body.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, 0.0F, -0.2269F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 94, 39, -1.0F, -2.0F, 0.0F, 1, 2, 35, 0.0F, false));

		grip = new ModelRenderer(this);
		grip.setRotationPoint(-0.3915F, 0.9283F, -0.4854F);
		grip.cubeList.add(new ModelBox(grip, 47, 65, -1.6075F, -6.8532F, -7.9352F, 1, 2, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 60, 92, -1.9335F, -7.3283F, -16.0146F, 3, 4, 4, -0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 47, 65, -3.2835F, -7.3283F, -16.0146F, 3, 4, 4, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 85, 0, -2.1835F, -3.3283F, -13.2646F, 2, 3, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 102, 109, 0.0665F, -5.3283F, -20.0146F, 1, 1, 4, -0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 102, 102, -3.2835F, -5.3283F, -20.0146F, 1, 1, 4, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 6, 109, 0.3165F, -7.8283F, -15.0146F, 1, 1, 3, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 107, 29, 0.3165F, -7.3783F, -15.0136F, 1, 1, 3, 0.002F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(0.4719F, -6.3783F, -15.7471F);
		grip.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, 0.3927F, 0.0F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 19, 114, -0.5001F, -1.0F, -1.0F, 1, 1, 2, 0.001F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 25, 114, -0.5F, -1.45F, -1.0F, 1, 1, 2, 0.0F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(1.0665F, -7.0783F, -12.7646F);
		grip.addChild(cube_r29);
		setRotationAngle(cube_r29, -0.3927F, 0.0F, 0.0F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 86, 117, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(-1.1835F, -0.951F, -12.6128F);
		grip.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.1745F, 0.0F, 0.0F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 84, 65, -0.999F, -2.5F, -0.75F, 2, 3, 1, 0.0F, false));

		gun240_r1 = new ModelRenderer(this);
		gun240_r1.setRotationPoint(-1.1075F, -3.9851F, -7.6398F);
		grip.addChild(gun240_r1);
		setRotationAngle(gun240_r1, -0.2182F, 0.0F, 0.0F);
		gun240_r1.cubeList.add(new ModelBox(gun240_r1, 39, 65, -0.499F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		gun239_r1 = new ModelRenderer(this);
		gun239_r1.setRotationPoint(-1.1075F, -2.7094F, -4.7174F);
		grip.addChild(gun239_r1);
		setRotationAngle(gun239_r1, 0.5236F, 0.0F, 0.0F);
		gun239_r1.cubeList.add(new ModelBox(gun239_r1, 47, 59, -1.501F, -0.5F, -2.0F, 3, 1, 4, 0.0F, false));

		gun238_r1 = new ModelRenderer(this);
		gun238_r1.setRotationPoint(-1.1075F, -2.0359F, -9.1445F);
		grip.addChild(gun238_r1);
		setRotationAngle(gun238_r1, -0.0873F, 0.0F, 0.0F);
		gun238_r1.cubeList.add(new ModelBox(gun238_r1, 72, 10, -1.5F, -0.5F, -3.0F, 3, 1, 6, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-1.1085F, -0.8025F, -2.6389F);
		grip.addChild(bone);
		setRotationAngle(bone, 0.1309F, 0.0F, 0.0F);
		

		gun240_r2 = new ModelRenderer(this);
		gun240_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(gun240_r2);
		setRotationAngle(gun240_r2, 0.3054F, 0.0F, 0.0F);
		gun240_r2.cubeList.add(new ModelBox(gun240_r2, 0, 0, -2.002F, -6.5F, 0.175F, 4, 13, 3, 0.001F, false));
		gun240_r2.cubeList.add(new ModelBox(gun240_r2, 0, 65, -1.0F, -6.5F, -0.5F, 2, 13, 2, 0.0F, false));

		gun241_r1 = new ModelRenderer(this);
		gun241_r1.setRotationPoint(-1.0F, -0.0623F, 0.1975F);
		bone.addChild(gun241_r1);
		setRotationAngle(gun241_r1, 0.4194F, -0.7401F, -0.2921F);
		gun241_r1.cubeList.add(new ModelBox(gun241_r1, 41, 0, -0.5F, -6.5F, -0.5F, 1, 13, 1, 0.0F, false));

		gun242_r1 = new ModelRenderer(this);
		gun242_r1.setRotationPoint(-1.3876F, -0.247F, 0.7834F);
		bone.addChild(gun242_r1);
		setRotationAngle(gun242_r1, 2.2581F, -1.1712F, -2.2987F);
		gun242_r1.cubeList.add(new ModelBox(gun242_r1, 41, 14, -0.5F, -6.5F, -0.5F, 1, 13, 1, 0.0F, false));

		gun240_r3 = new ModelRenderer(this);
		gun240_r3.setRotationPoint(0.0F, 0.4256F, 5.8394F);
		bone.addChild(gun240_r3);
		setRotationAngle(gun240_r3, 0.4363F, 0.0F, 0.0F);
		gun240_r3.cubeList.add(new ModelBox(gun240_r3, 94, 76, -1.0F, -6.0F, -1.5F, 2, 10, 2, 0.0F, false));

		gun241_r2 = new ModelRenderer(this);
		gun241_r2.setRotationPoint(0.0F, 1.2708F, 4.0268F);
		bone.addChild(gun241_r2);
		setRotationAngle(gun241_r2, 0.4363F, 0.0F, 0.0F);
		gun241_r2.cubeList.add(new ModelBox(gun241_r2, 22, 17, -2.003F, -6.0F, -1.175F, 4, 10, 3, -0.001F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, 0.3374F, 2.6001F);
		bone.addChild(bone6);
		setRotationAngle(bone6, -0.6545F, 0.0F, 0.0F);
		

		gun241_r3 = new ModelRenderer(this);
		gun241_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone6.addChild(gun241_r3);
		setRotationAngle(gun241_r3, 0.4363F, 0.0F, 0.0F);
		gun241_r3.cubeList.add(new ModelBox(gun241_r3, 30, 30, -1.0F, -8.0F, -0.5F, 2, 4, 1, 0.0F, false));

		gun242_r2 = new ModelRenderer(this);
		gun242_r2.setRotationPoint(0.0F, 0.8452F, -1.8126F);
		bone6.addChild(gun242_r2);
		setRotationAngle(gun242_r2, 0.4363F, 0.0F, 0.0F);
		gun242_r2.cubeList.add(new ModelBox(gun242_r2, 53, 30, -2.004F, -8.0F, -1.175F, 4, 4, 3, -0.003F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
		grip.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}