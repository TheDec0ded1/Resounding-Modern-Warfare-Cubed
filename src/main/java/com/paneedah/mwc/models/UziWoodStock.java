package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class UziWoodStock extends ModelBase {
	private final ModelRenderer WoodenStock;
	private final ModelRenderer wood;
	private final ModelRenderer bone2;
	private final ModelRenderer bone;
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
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r30;
	private final ModelRenderer cube_r31;
	private final ModelRenderer bone6;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;
	private final ModelRenderer cube_r34;
	private final ModelRenderer cube_r35;
	private final ModelRenderer cube_r36;

	public UziWoodStock() {
		textureWidth = 512;
		textureHeight = 512;

		WoodenStock = new ModelRenderer(this);
		WoodenStock.setRotationPoint(0.0F, 24.0F, 0.0F);
		WoodenStock.cubeList.add(new ModelBox(WoodenStock, 227, 17, -3.5F, -36.0F, 1.0F, 4, 4, 14, 0.0F, false));

		wood = new ModelRenderer(this);
		wood.setRotationPoint(0.0F, -0.5F, 0.0F);
		WoodenStock.addChild(wood);
		

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-0.5F, -31.0F, 2.0F);
		wood.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 33, 262, -3.0F, -1.0F, 1.0F, 4, 1, 13, 0.1F, false));
		bone2.cubeList.add(new ModelBox(bone2, 262, 245, -3.0F, 0.2F, 2.0F, 4, 1, 13, 0.1F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-1.6F, -30.0589F, 8.4462F);
		wood.addChild(bone);
		setRotationAngle(bone, -0.1309F, 0.0F, 0.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0669F, -5.1992F, 17.3259F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, 3.0488F, -0.0924F, -0.7811F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 314, 199, -1.529F, 0.194F, 0.7336F, 1, 1, 10, 0.05F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 144, 311, 0.2409F, -1.5758F, 0.7336F, 1, 1, 10, 0.05F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0669F, -5.1992F, 17.3259F);
		bone.addChild(cube_r2);
		setRotationAngle(cube_r2, 3.0107F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 316, -1.1684F, -0.509F, 0.7336F, 1, 1, 10, 0.05F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 299, 79, -0.7654F, -0.509F, 0.7336F, 2, 1, 10, 0.05F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 264, 233, -1.9626F, -1.2619F, 0.7086F, 4, 1, 10, 0.025F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0669F, -5.033F, 20.7734F);
		bone.addChild(cube_r3);
		setRotationAngle(cube_r3, -2.9548F, 0.1812F, -0.7609F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 337, 189, 0.2359F, -1.5684F, -6.5053F, 1, 1, 6, 0.1F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 337, 197, -1.5339F, 0.2014F, -6.5053F, 1, 1, 6, 0.1F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0669F, -5.033F, 20.7734F);
		bone.addChild(cube_r4);
		setRotationAngle(cube_r4, -2.882F, -0.0017F, 0.0073F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 332, 279, -0.8241F, -0.4866F, -6.5053F, 2, 1, 6, 0.1F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 243, 337, -1.1271F, -0.4866F, -6.5053F, 1, 1, 6, 0.1F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 324, 23, -1.9756F, -1.3351F, -6.5053F, 4, 1, 6, 0.1F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0669F, -5.033F, 20.7734F);
		bone.addChild(cube_r5);
		setRotationAngle(cube_r5, -3.1416F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 297, 251, -1.9669F, -1.0375F, -1.0706F, 4, 1, 6, 0.1F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 335, -1.1184F, -0.189F, -1.4706F, 1, 1, 6, 0.1F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 332, 271, -0.8154F, -0.189F, -1.4706F, 2, 1, 6, 0.1F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0669F, -5.033F, 20.7734F);
		bone.addChild(cube_r6);
		setRotationAngle(cube_r6, -3.1416F, 0.0F, -0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 334, 295, -1.3173F, 0.4057F, -1.0706F, 1, 1, 6, 0.1F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 334, 303, 0.4525F, -1.3641F, -1.0706F, 1, 1, 6, 0.1F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.1F, 3.1075F, 20.1651F);
		bone.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.4233F, 0.3897F, 0.7006F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 123, 352, -0.7745F, 0.9953F, 1.7876F, 1, 1, 1, 0.1F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 353, 317, 0.9953F, -0.7745F, 1.7876F, 1, 1, 1, 0.1F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.1F, 3.1075F, 20.1651F);
		bone.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.5672F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 317, 353, -1.1515F, 0.6118F, 1.7876F, 1, 1, 1, 0.1F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 333, 76, -0.8485F, 0.6118F, 1.7876F, 2, 1, 1, 0.1F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 297, 127, -2.0F, -0.2368F, 1.7876F, 4, 1, 1, 0.1F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.1F, 3.1075F, 20.1651F);
		bone.addChild(cube_r9);
		setRotationAngle(cube_r9, -1.1345F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 112, 346, -0.8485F, -0.5198F, 0.2252F, 2, 1, 2, 0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 21, 350, -1.1515F, -0.5198F, 0.2252F, 1, 1, 2, 0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 341, 96, -2.0F, -1.3683F, 0.2252F, 4, 1, 2, 0.1F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.1F, 3.1075F, 20.1651F);
		bone.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.9878F, 0.6956F, 0.3999F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 50, 350, 0.1952F, -1.5747F, 0.2252F, 1, 1, 2, 0.1F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 57, 350, -1.5747F, 0.1952F, 0.2252F, 1, 1, 2, 0.1F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.1F, 3.1075F, 20.1651F);
		bone.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.6572F, 0.5484F, 0.5942F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 349, 341, -1.5F, 0.2699F, -1.539F, 1, 1, 2, 0.1F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 7, 350, 0.2699F, -1.5F, -1.539F, 1, 1, 2, 0.1F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.1F, 3.1075F, 20.1651F);
		bone.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.829F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 339, 153, -2.0F, -1.2627F, -1.539F, 4, 1, 2, 0.1F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 14, 350, -1.1515F, -0.4142F, -1.539F, 1, 1, 2, 0.1F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 70, 346, -0.8485F, -0.4142F, -1.539F, 2, 1, 2, 0.1F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.1F, 3.1075F, 20.1651F);
		bone.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.5236F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 227, 36, -2.0F, -1.6925F, -4.2534F, 4, 1, 3, 0.1F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 349, 303, -1.1515F, -0.844F, -3.2534F, 1, 1, 2, 0.1F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 61, 346, -0.8485F, -0.844F, -3.2534F, 2, 1, 2, 0.1F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.1F, 3.1075F, 20.1651F);
		bone.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.3876F, 0.3614F, 0.7137F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 349, 307, -1.8039F, -0.034F, -3.2534F, 1, 1, 2, 0.1F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 349, 337, -0.034F, -1.8039F, -3.2534F, 1, 1, 2, 0.1F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.1F, 5.4781F, 25.1047F);
		bone.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 310, 13, -2.0F, -0.8696F, 4.6167F, 4, 1, 1, 0.1F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 299, 13, -2.0F, -0.8251F, 3.5131F, 4, 1, 1, 0.1F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.1F, 5.4781F, 24.7047F);
		bone.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 5, 354, -1.1515F, -0.021F, 5.0167F, 1, 1, 1, 0.1F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 343, 105, -0.8485F, -0.021F, 5.0167F, 2, 1, 1, 0.1F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 323, 335, -0.8485F, 0.0234F, 3.9131F, 2, 1, 1, 0.1F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 354, 3, -1.1515F, 0.0234F, 3.9131F, 1, 1, 1, 0.1F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.1F, 5.4781F, 25.1047F);
		bone.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, 0.7854F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 10, 354, -1.222F, 0.5479F, 4.6167F, 1, 1, 1, 0.1F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 15, 354, 0.5479F, -1.222F, 4.6167F, 1, 1, 1, 0.1F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 353, 320, 0.5793F, -1.1906F, 3.5131F, 1, 1, 1, 0.1F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 354, 0, -1.1906F, 0.5793F, 3.5131F, 1, 1, 1, 0.1F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.1F, 5.4324F, 29.4479F);
		bone.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, 0.7854F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 64, 350, 0.5793F, -1.1906F, -2.4869F, 1, 1, 2, 0.1F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 71, 350, -1.1906F, 0.5793F, -2.4869F, 1, 1, 2, 0.1F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.1F, 5.4324F, 29.0479F);
		bone.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 145, 346, -0.8485F, 0.0234F, -2.0869F, 2, 1, 2, 0.1F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 111, 350, -1.1515F, 0.0234F, -2.0869F, 1, 1, 2, 0.1F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.1F, 5.4324F, 29.4479F);
		bone.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, 0.0F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 341, 120, -2.0F, -0.8251F, -2.4869F, 4, 1, 2, 0.1F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(0.1F, 5.1741F, 24.3572F);
		bone.addChild(cube_r21);
		setRotationAngle(cube_r21, -0.0873F, 0.0F, 0.0F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 324, 101, -2.0F, -0.8251F, -2.4869F, 4, 1, 5, 0.1F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(0.1F, 5.1741F, 23.9572F);
		bone.addChild(cube_r22);
		setRotationAngle(cube_r22, -0.0873F, 0.0F, 0.0F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 339, 146, -1.1515F, 0.0234F, -2.0869F, 1, 1, 5, 0.1F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 285, 337, -0.8485F, 0.0234F, -2.0869F, 2, 1, 5, 0.1F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(0.1F, 5.1741F, 24.3572F);
		bone.addChild(cube_r23);
		setRotationAngle(cube_r23, -0.0618F, 0.0617F, 0.7835F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 339, 165, -1.1906F, 0.5793F, -2.4869F, 1, 1, 5, 0.1F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 339, 172, 0.5793F, -1.1906F, -2.4869F, 1, 1, 5, 0.1F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(0.1F, 0.6781F, -1.3203F);
		bone.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, 0.0F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 219, 66, -1.1515F, 0.0234F, -4.4869F, 1, 1, 23, 0.1F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 124, 206, -0.8485F, 0.0234F, -4.4869F, 2, 1, 23, 0.1F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(0.1F, 0.6781F, -0.9203F);
		bone.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.0F, 0.7854F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 65, 219, -1.1906F, 0.5793F, -4.4869F, 1, 1, 23, 0.1F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 219, 41, 0.5793F, -1.1906F, -4.4869F, 1, 1, 23, 0.1F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(0.1F, 0.6781F, -0.9203F);
		bone.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, 0.0F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 195, 203, -2.0F, -0.8251F, -4.4869F, 4, 1, 23, 0.1F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(0.0669F, -5.1992F, 17.3259F);
		bone.addChild(cube_r27);
		setRotationAngle(cube_r27, -0.0873F, 0.0F, 0.0F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 262, 115, -1.9669F, 0.8852F, -9.4622F, 4, 1, 13, 0.1F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-1.6F, -25.1017F, 7.7936F);
		wood.addChild(bone3);
		setRotationAngle(bone3, -1.0036F, 0.0F, 0.0F);
		

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(0.1F, 1.3913F, -3.9316F);
		bone3.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, 0.0F, 0.0F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 221, 276, -1.1515F, -0.022F, -4.4157F, 1, 1, 2, 0.1F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 345, 333, -0.8485F, -0.022F, -4.4157F, 2, 1, 2, 0.1F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 68, 262, -2.0F, -0.8705F, -4.4157F, 4, 1, 2, 0.1F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(0.1F, 1.3913F, -3.9316F);
		bone3.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.0F, 0.0F, 0.7854F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 81, 262, -1.2227F, 0.5472F, -4.4157F, 1, 1, 2, 0.1F, false));
		cube_r29.cubeList.add(new ModelBox(cube_r29, 349, 299, 0.5472F, -1.2227F, -4.4157F, 1, 1, 2, 0.1F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-1.6F, -31.0055F, 4.0325F);
		wood.addChild(bone4);
		setRotationAngle(bone4, -1.5708F, 0.0F, 0.0F);
		

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(0.1F, 1.8359F, 2.4061F);
		bone4.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.0F, 0.0F, 0.0F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 352, 100, -1.1515F, -0.0757F, -3.4F, 1, 1, 1, 0.1F, false));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 322, 124, -0.8485F, -0.0757F, -3.4F, 2, 1, 1, 0.1F, false));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 250, 289, -2.0F, -0.9243F, -3.4F, 4, 1, 1, 0.1F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(0.1F, 1.8359F, 2.4061F);
		bone4.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.0F, 0.0F, 0.7854F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 352, 93, -1.2607F, 0.5092F, -3.4F, 1, 1, 1, 0.1F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 352, 81, 0.5092F, -1.2607F, -3.4F, 1, 1, 1, 0.1F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-1.6F, -33.4055F, 14.9325F);
		wood.addChild(bone6);
		setRotationAngle(bone6, 3.1416F, 0.0F, 0.0F);
		

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(0.1F, 1.8359F, 2.4061F);
		bone6.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.0F, 0.0F, 0.7854F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 353, 311, 0.5092F, -1.2607F, -3.4F, 1, 1, 1, 0.1F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 353, 314, -1.2607F, 0.5092F, -3.4F, 1, 1, 1, 0.1F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(0.1F, 1.8359F, 2.4061F);
		bone6.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.0F, 0.0F, 0.0F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 312, 353, -1.1515F, -0.0757F, -3.4F, 1, 1, 1, 0.1F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 350, 105, -0.8485F, -0.0757F, -3.4F, 2, 1, 1, 0.1F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 341, 253, -2.0F, -3.9243F, -3.4F, 4, 4, 1, 0.1F, false));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(0.0971F, -1.4415F, -20.8824F);
		bone6.addChild(cube_r34);
		setRotationAngle(cube_r34, -0.0873F, 0.0F, 0.0F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 354, 22, -1.1515F, 0.7402F, -3.4015F, 1, 1, 1, 0.1F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 317, 350, -0.8485F, 0.7402F, -3.4015F, 2, 1, 1, 0.1F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 153, 333, -2.0F, -10.1083F, -3.4015F, 4, 11, 1, 0.1F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 149, 350, -1.1515F, 0.744F, -2.297F, 1, 1, 2, 0.1F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 336, 346, -0.8485F, 0.744F, -2.297F, 2, 1, 2, 0.1F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 324, 31, -2.0F, -1.1045F, 14.503F, 4, 1, 6, 0.1F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 341, 259, -2.0F, -4.2045F, 20.403F, 4, 1, 2, 0.1F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 262, 260, -2.0F, -5.3045F, 8.503F, 4, 4, 12, 0.1F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 341, 89, -2.0F, -6.3045F, 7.303F, 4, 5, 1, 0.1F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 341, 47, -2.0F, -7.3045F, 6.103F, 4, 6, 1, 0.1F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 171, 298, -2.0F, -9.4045F, 4.103F, 4, 9, 2, 0.1F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 318, 127, -2.0F, -10.1045F, -0.097F, 4, 10, 4, 0.1F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 278, 321, -2.0F, -10.1045F, -2.297F, 4, 11, 2, 0.1F, false));

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(0.0971F, -1.4415F, -20.8824F);
		bone6.addChild(cube_r35);
		setRotationAngle(cube_r35, -0.0618F, 0.0617F, 0.7835F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 25, 354, -0.6837F, 1.0862F, -3.4015F, 1, 1, 1, 0.1F, false));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 20, 354, 1.0862F, -0.6837F, -3.4015F, 1, 1, 1, 0.1F, false));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 142, 350, -0.681F, 1.0888F, -2.297F, 1, 1, 2, 0.1F, false));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 350, 128, 1.0888F, -0.681F, -2.297F, 1, 1, 2, 0.1F, false));

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(0.1F, 1.7359F, 1.2061F);
		bone6.addChild(cube_r36);
		setRotationAngle(cube_r36, 0.0F, 0.0F, 0.0F);
		cube_r36.cubeList.add(new ModelBox(cube_r36, 125, 342, -2.0F, -2.9243F, -3.4F, 4, 3, 1, 0.1F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		WoodenStock.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}