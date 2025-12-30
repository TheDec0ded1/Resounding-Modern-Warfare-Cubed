package com.paneedah.mwc.models;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBZ191 extends ModelBase {
	private final ModelRenderer gun;
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
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r30;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer bone6;
	private final ModelRenderer cube_r33;
	private final ModelRenderer cube_r34;
	private final ModelRenderer cube_r35;
	private final ModelRenderer cube_r36;
	private final ModelRenderer receivercap;
	private final ModelRenderer cube_r37;
	private final ModelRenderer cube_r38;
	private final ModelRenderer cube_r39;
	private final ModelRenderer cube_r40;

	public QBZ191() {
		textureWidth = 400;
		textureHeight = 400;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		gun.cubeList.add(new ModelBox(gun, 50, 351, -3.499F, -35.0F, -17.0F, 4, 4, 16, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 198, 300, -3.749F, -35.0F, -18.6F, 1, 4, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 214, 197, -3.749F, -31.8271F, -18.5886F, 4, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 198, 306, -0.249F, -34.8271F, -18.5886F, 1, 4, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 364, 156, -0.249F, -35.0F, -18.6F, 1, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 246, 225, -0.249F, -36.0F, -27.6F, 1, 4, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 190, 393, -0.249F, -34.0F, -28.5F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 30, 360, -3.749F, -35.0F, -27.6F, 1, 3, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 194, 393, -3.749F, -34.0F, -28.6F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 318, 393, -4.049F, -34.9432F, -29.5892F, 1, 1, 1, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 322, 393, -4.049F, -34.9432F, -29.3893F, 1, 1, 1, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 214, 393, 0.051F, -35.9432F, -29.5892F, 1, 2, 1, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 218, 393, 0.051F, -35.9432F, -29.3893F, 1, 2, 1, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 368, 269, -3.749F, -32.2F, -28.6F, 1, 1, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 370, 280, -0.249F, -32.2F, -28.6F, 1, 1, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 396, 305, 0.051F, -34.4F, -17.0F, 1, 1, 1, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 4, 391, -4.049F, -35.3F, -16.9F, 1, 1, 2, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 396, 307, -4.149F, -35.4F, -15.675F, 1, 1, 1, -0.4F, false));
		gun.cubeList.add(new ModelBox(gun, 314, 393, -4.049F, -34.9F, -16.9F, 1, 2, 1, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 360, -0.249F, -36.0F, -18.0F, 1, 1, 14, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 308, 396, -0.249F, -36.0F, -18.6F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 386, 0, 0.0098F, -36.9659F, -3.0F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 386, 6, -4.0078F, -36.9659F, -3.0F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 386, 90, -2.999F, -31.0F, -6.5F, 3, 5, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 396, 309, -1.999F, -31.0F, -10.1F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 288, 393, -1.999F, -31.0F, -10.5F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 294, 360, -4.349F, -31.9F, -28.9F, 1, 1, 12, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 372, 256, -4.149F, -35.1829F, -26.2313F, 1, 1, 8, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 384, 140, 0.251F, -36.2F, -26.0F, 1, 1, 7, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 352, 381, -4.349F, -31.5271F, -18.8886F, 1, 1, 2, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 320, 360, 0.351F, -31.9F, -28.9F, 1, 1, 12, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 346, 360, 0.151F, -36.3F, -29.9F, 1, 1, 12, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 390, 357, 0.351F, -31.5271F, -18.8886F, 1, 1, 2, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 200, 197, -4.499F, -31.7271F, -18.2886F, 6, 1, 1, -0.3F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, -32.7321F, -6.5F);
		gun.addChild(cube_r7);
		setRotationAngle(cube_r7, 1.5708F, -0.7854F, -1.5708F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 386, 60, -0.5F, -0.0757F, -1.0F, 1, 1, 5, -0.2F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 386, 42, -0.9243F, -0.5F, -1.0F, 1, 1, 5, -0.2F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 386, 24, -0.5F, -0.9243F, -1.0F, 1, 1, 5, -0.2F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 386, 18, -0.0757F, -0.5F, -1.0F, 1, 1, 5, -0.2F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-1.5F, -32.3078F, -6.0F);
		gun.addChild(cube_r8);
		setRotationAngle(cube_r8, -1.9443F, -0.8582F, 2.0487F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 392, 297, -0.3384F, -0.5F, 1.5982F, 2, 1, 1, -0.2F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-1.5F, -32.3078F, -6.0F);
		gun.addChild(cube_r9);
		setRotationAngle(cube_r9, -1.1973F, -0.8582F, 1.0929F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 68, 393, -0.3384F, -0.5F, -2.5982F, 2, 1, 1, -0.2F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, -32.7321F, -6.5F);
		gun.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, -1.5708F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 386, 54, -0.5F, -0.4757F, -1.0F, 1, 1, 5, -0.2F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 386, 48, -0.5F, -0.0757F, -1.0F, 1, 1, 5, -0.2F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 386, 36, -0.9243F, -0.5F, -1.0F, 1, 1, 5, -0.2F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 386, 30, -0.0757F, -0.5F, -1.0F, 1, 1, 5, -0.2F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 386, 12, -0.5F, -0.9243F, -1.0F, 1, 1, 5, -0.2F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-3.649F, -32.719F, -17.9265F);
		gun.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.3491F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 200, 391, -0.5F, -2.5F, -0.5F, 1, 4, 1, -0.2F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.001F, -25.8571F, -8.2581F);
		gun.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.2618F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 322, 186, -3.0F, 0.0F, -6.7F, 3, 1, 5, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.001F, -26.7848F, -7.6737F);
		gun.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.1745F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 266, 192, -3.0F, 0.0F, -2.7F, 3, 1, 4, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-2.999F, -31.2246F, -6.3759F);
		gun.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.3491F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 138, 393, -1.0F, -2.0F, -10.7F, 1, 3, 1, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 138, 373, 0.0F, -4.0F, -10.7F, 3, 7, 1, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.001F, -31.2246F, -5.2759F);
		gun.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.3491F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 234, 389, -3.0F, -4.0F, -10.7F, 3, 5, 1, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-1.499F, -29.3553F, -10.5437F);
		gun.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.829F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 396, 313, -0.5F, -1.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-1.499F, -28.8001F, -9.8918F);
		gun.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.829F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 312, 396, -0.5F, 0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-1.499F, -28.7582F, -10.1645F);
		gun.addChild(cube_r18);
		setRotationAngle(cube_r18, -0.4363F, 0.0F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 396, 311, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-1.499F, -33.0092F, -15.9535F);
		gun.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.3491F, 0.0F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 391, -2.25F, -1.7323F, -0.8504F, 1, 4, 1, 0.0F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 230, 390, 1.25F, -3.0323F, -0.8504F, 1, 5, 1, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-1.499F, -33.0092F, -15.9535F);
		gun.addChild(cube_r20);
		setRotationAngle(cube_r20, -0.4754F, -0.7268F, 0.3295F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 10, 391, -1.4852F, -2.1823F, 0.6967F, 1, 4, 1, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-3.1961F, -31.7199F, -14.1653F);
		gun.addChild(cube_r21);
		setRotationAngle(cube_r21, -0.4754F, -0.7268F, 0.3295F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 390, 351, 0.6968F, -3.3323F, -4.4852F, 1, 5, 1, -0.3F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-3.3954F, -35.6124F, -2.5F);
		gun.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, -0.2618F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 384, 201, -0.5F, -0.5F, -1.5F, 1, 1, 6, 0.0F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(0.3975F, -35.6124F, -2.5F);
		gun.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, 0.2618F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 384, 148, -0.5F, -0.5F, -1.5F, 1, 1, 6, 0.0F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-1.1887F, -35.9399F, -2.0F);
		gun.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, 0.3491F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 352, 384, -3.0F, -2.0F, -1.0F, 1, 2, 5, 0.0F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(2.8892F, -37.65F, -2.0F);
		gun.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.0F, -0.3491F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 384, 300, -3.0F, -2.0F, -1.0F, 1, 2, 5, 0.0F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-3.749F, -33.5858F, -7.0F);
		gun.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, -0.7854F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 148, 241, 1.0F, -1.0F, -21.0F, 1, 1, 30, 0.0F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(-0.6632F, -33.5858F, -7.0F);
		gun.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, 0.0F, -0.7854F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 202, 348, 1.0F, -1.0F, -9.0F, 1, 1, 18, 0.0F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-3.549F, -35.0602F, -15.7928F);
		gun.addChild(cube_r28);
		setRotationAngle(cube_r28, -0.3491F, 0.0F, 0.0F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 326, 393, -0.5F, -0.3F, 0.0F, 1, 1, 1, -0.3F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(8.851F, -37.5691F, -9.2762F);
		gun.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.3491F, 0.0F, 0.0F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 306, 160, -11.9F, -3.6F, -20.2F, 4, 3, 1, 0.0F, false));
		cube_r29.cubeList.add(new ModelBox(cube_r29, 294, 391, -12.8F, -3.6F, -20.2F, 1, 3, 1, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		gun.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 214, 390, -0.8F, -33.1F, -18.4F, 2, 1, 2, -0.1F, false));
		bone.cubeList.add(new ModelBox(bone, 390, 339, 0.6F, -36.0F, -18.4F, 1, 2, 2, -0.3F, false));
		bone.cubeList.add(new ModelBox(bone, 204, 391, 0.6F, -36.3352F, -17.979F, 1, 1, 2, -0.3F, false));
		bone.cubeList.add(new ModelBox(bone, 396, 315, 0.3F, -34.4755F, -16.9654F, 1, 1, 1, -0.3F, false));
		bone.cubeList.add(new ModelBox(bone, 396, 317, 0.3F, -34.4755F, -17.3654F, 1, 1, 1, -0.3F, false));
		bone.cubeList.add(new ModelBox(bone, 390, 381, 0.6F, -36.3352F, -18.404F, 1, 1, 2, -0.3F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(0.3F, -34.2244F, -16.8578F);
		bone.addChild(cube_r30);
		setRotationAngle(cube_r30, -0.3054F, 0.0F, 0.0F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 306, 393, 0.0F, -1.45F, 0.0F, 1, 2, 1, -0.3F, false));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 302, 393, 0.0F, -2.25F, 0.0F, 1, 2, 1, -0.3F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(0.6F, -34.2244F, -17.4578F);
		bone.addChild(cube_r31);
		setRotationAngle(cube_r31, -0.3054F, 0.0F, 0.0F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 298, 393, 0.0F, -2.0F, 0.0F, 1, 2, 1, -0.3F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(0.3F, -33.0F, -17.8F);
		bone.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.0F, 0.0F, 0.1309F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 360, 391, 0.0F, -2.0F, 0.0F, 1, 3, 1, -0.3F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, 0.0F, 0.0F);
		gun.addChild(bone6);
		bone6.cubeList.add(new ModelBox(bone6, 266, 225, -2.5F, -38.9F, -2.0F, 2, 2, 26, -0.3F, false));
		bone6.cubeList.add(new ModelBox(bone6, 266, 253, -3.9142F, -37.4858F, -2.0F, 2, 2, 26, -0.3F, false));
		bone6.cubeList.add(new ModelBox(bone6, 210, 270, -2.5F, -35.0716F, -2.3F, 2, 2, 26, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 148, 272, -1.0858F, -37.4858F, -2.0F, 2, 2, 26, -0.3F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(-0.0929F, -35.0787F, -0.3F);
		bone6.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.0F, 0.0F, -0.7854F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 282, 80, -1.0F, -1.0F, -1.0F, 2, 1, 25, 0.0F, false));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(-0.0929F, -36.4787F, -0.3F);
		bone6.addChild(cube_r34);
		setRotationAngle(cube_r34, 0.0F, 0.0F, -0.7854F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 282, 133, 0.0F, -2.0F, -1.0F, 1, 2, 25, 0.0F, false));

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(-1.4929F, -35.0787F, -0.3F);
		bone6.addChild(cube_r35);
		setRotationAngle(cube_r35, 0.0F, 0.0F, -0.7854F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 282, 106, -1.0F, -2.0F, -1.0F, 1, 2, 25, 0.0F, false));

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(-1.4929F, -36.4787F, -0.3F);
		bone6.addChild(cube_r36);
		setRotationAngle(cube_r36, 0.0F, 0.0F, -0.7854F);
		cube_r36.cubeList.add(new ModelBox(cube_r36, 282, 54, -1.0F, -2.0F, -1.0F, 2, 1, 25, 0.0F, false));

		receivercap = new ModelRenderer(this);
		receivercap.setRotationPoint(0.0F, 0.0F, 0.0F);
		gun.addChild(receivercap);
		receivercap.cubeList.add(new ModelBox(receivercap, 138, 291, -3.5F, -39.8481F, -0.9966F, 4, 8, 1, 0.0F, false));
		receivercap.cubeList.add(new ModelBox(receivercap, 26, 390, -3.5F, -40.3481F, -0.9966F, 4, 1, 1, 0.0F, false));
		receivercap.cubeList.add(new ModelBox(receivercap, 384, 208, -3.5F, -38.5481F, 0.0034F, 4, 6, 2, 0.0F, false));
		receivercap.cubeList.add(new ModelBox(receivercap, 246, 238, -3.5F, -38.9481F, 0.0034F, 4, 1, 2, 0.0F, false));
		receivercap.cubeList.add(new ModelBox(receivercap, 390, 345, -3.0F, -33.0481F, 1.0034F, 3, 1, 1, 0.0F, false));

		cube_r37 = new ModelRenderer(this);
		cube_r37.setRotationPoint(-1.0F, -35.4026F, -1.0583F);
		receivercap.addChild(cube_r37);
		setRotationAngle(cube_r37, -1.1781F, 0.0F, 0.0F);
		cube_r37.cubeList.add(new ModelBox(cube_r37, 46, 390, -2.5F, -1.0F, 2.5F, 4, 1, 1, 0.0F, false));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 390, 349, -2.0F, -1.0F, 3.0F, 3, 1, 1, 0.0F, false));

		cube_r38 = new ModelRenderer(this);
		cube_r38.setRotationPoint(-1.0F, -34.0452F, -2.7386F);
		receivercap.addChild(cube_r38);
		setRotationAngle(cube_r38, -0.7854F, 0.0F, 0.0F);
		cube_r38.cubeList.add(new ModelBox(cube_r38, 36, 390, -2.5F, -1.0F, 2.5F, 4, 1, 1, 0.0F, false));
		cube_r38.cubeList.add(new ModelBox(cube_r38, 390, 347, -2.0F, -1.0F, 3.0F, 3, 1, 1, 0.0F, false));

		cube_r39 = new ModelRenderer(this);
		cube_r39.setRotationPoint(-1.0F, -39.5173F, -8.9855F);
		receivercap.addChild(cube_r39);
		setRotationAngle(cube_r39, -1.0472F, 0.0F, 0.0F);
		cube_r39.cubeList.add(new ModelBox(cube_r39, 226, 197, -2.5F, -8.2F, 3.775F, 4, 1, 2, 0.0F, false));

		cube_r40 = new ModelRenderer(this);
		cube_r40.setRotationPoint(-1.0F, -32.148F, -3.7716F);
		receivercap.addChild(cube_r40);
		setRotationAngle(cube_r40, -0.3927F, 0.0F, 0.0F);
		cube_r40.cubeList.add(new ModelBox(cube_r40, 16, 390, -2.5F, -1.0F, 2.5F, 4, 1, 1, 0.0F, false));
		cube_r40.cubeList.add(new ModelBox(cube_r40, 390, 343, -2.0F, -1.0F, 3.0F, 3, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gun.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}