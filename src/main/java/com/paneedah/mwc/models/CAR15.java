package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class CAR15 extends ModelWithAttachments {
	private final ModelRenderer carryhandle;
	private final ModelRenderer bone35_r1;
	private final ModelRenderer bone34_r1;
	private final ModelRenderer bone45_r1;
	private final ModelRenderer bone17_r1;
	private final ModelRenderer bone38_r1;
	private final ModelRenderer bone36_r1;
	private final ModelRenderer bone28_r1;
	private final ModelRenderer bone14_r1;
	private final ModelRenderer bone26_r1;
	private final ModelRenderer bone25_r1;
	private final ModelRenderer bone22_r1;
	private final ModelRenderer bone21_r1;
	private final ModelRenderer bone27_r1;
	private final ModelRenderer bone27;
	private final ModelRenderer bone21;
	private final ModelRenderer bone22;
	private final ModelRenderer bone25;
	private final ModelRenderer bone26;
	private final ModelRenderer bone31;
	private final ModelRenderer bone14;
	private final ModelRenderer bone28;
	private final ModelRenderer bone19;
	private final ModelRenderer bone36;
	private final ModelRenderer bone18;
	private final ModelRenderer bone37;
	private final ModelRenderer bone38;
	private final ModelRenderer bone17;
	private final ModelRenderer bone45;
	private final ModelRenderer bone20;
	private final ModelRenderer bone34;
	private final ModelRenderer bone33;
	private final ModelRenderer bone35;
	private final ModelRenderer receiver;
	private final ModelRenderer receiver6_r1;
	private final ModelRenderer receiver5_r1;
	private final ModelRenderer receiver8_r1;
	private final ModelRenderer receiver9_r1;
	private final ModelRenderer receiver15_r1;
	private final ModelRenderer receiver16_r1;
	private final ModelRenderer receiver17_r1;
	private final ModelRenderer receiver20_r1;
	private final ModelRenderer receiver23_r1;
	private final ModelRenderer receiver24_r1;
	private final ModelRenderer receiver25_r1;
	private final ModelRenderer receiver25;
	private final ModelRenderer receiver24;
	private final ModelRenderer receiver23;
	private final ModelRenderer receiver20;
	private final ModelRenderer receiver17;
	private final ModelRenderer receiver16;
	private final ModelRenderer receiver15;
	private final ModelRenderer receiver10;
	private final ModelRenderer receiver9;
	private final ModelRenderer receiver8;
	private final ModelRenderer receiver5;
	private final ModelRenderer receiver6;
	private final ModelRenderer barrel;
	private final ModelRenderer bone3_r1;
	private final ModelRenderer bone2_r1;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer gun;
	private final ModelRenderer gun590_r1;
	private final ModelRenderer gun591_r1;
	private final ModelRenderer gun594_r1;
	private final ModelRenderer gun596_r1;
	private final ModelRenderer gun60_r1;
	private final ModelRenderer gun58_r1;
	private final ModelRenderer gun132_r1;
	private final ModelRenderer gun263_r1;
	private final ModelRenderer gun269_r1;
	private final ModelRenderer gun259_r1;
	private final ModelRenderer gun264_r1;
	private final ModelRenderer gun82_r1;
	private final ModelRenderer gun80_r1;
	private final ModelRenderer gun49_r1;
	private final ModelRenderer bone_r1;
	private final ModelRenderer gun53_r1;
	private final ModelRenderer gun63_r1;
	private final ModelRenderer gun28_r1;
	private final ModelRenderer gun21_r1;
	private final ModelRenderer gun17_r1;
	private final ModelRenderer gun152_r1;
	private final ModelRenderer gun142_r1;
	private final ModelRenderer gun151_r1;
	private final ModelRenderer gun139_r1;
	private final ModelRenderer gun150_r1;
	private final ModelRenderer gun66_r1;
	private final ModelRenderer gun119_r1;
	private final ModelRenderer gun118_r1;
	private final ModelRenderer gun117_r1;
	private final ModelRenderer gun120_r1;
	private final ModelRenderer gun120;
	private final ModelRenderer gun117;
	private final ModelRenderer gun118;
	private final ModelRenderer gun119;
	private final ModelRenderer gun67;
	private final ModelRenderer gun66;
	private final ModelRenderer gun35;
	private final ModelRenderer gun150;
	private final ModelRenderer gun139;
	private final ModelRenderer gun151;
	private final ModelRenderer gun142;
	private final ModelRenderer gun152;
	private final ModelRenderer gun17;
	private final ModelRenderer gun21;
	private final ModelRenderer gun28;
	private final ModelRenderer gun25;
	private final ModelRenderer gun63;
	private final ModelRenderer gun53;
	private final ModelRenderer bone;
	private final ModelRenderer gun49;
	private final ModelRenderer gun80;
	private final ModelRenderer gun82;
	private final ModelRenderer gun264;
	private final ModelRenderer gun259;
	private final ModelRenderer gun269;
	private final ModelRenderer gun263;
	private final ModelRenderer gun132;
	private final ModelRenderer gun58;
	private final ModelRenderer gun60;
	private final ModelRenderer gun596;
	private final ModelRenderer gun594;
	private final ModelRenderer gun591;
	private final ModelRenderer gun590;

	public CAR15() {
		textureWidth = 256;
		textureHeight = 256;

		carryhandle = new ModelRenderer(this);
		carryhandle.setRotationPoint(0.0F, 24.4F, 0.0F);
		carryhandle.cubeList.add(new ModelBox(carryhandle, 172, 120, -2.55F, -40.7071F, -21.5F, 2, 2, 22, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 44, 137, -2.95F, -44.5571F, -20.5F, 2, 1, 16, -0.4F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 157, 100, -2.95F, -44.7571F, -20.5F, 1, 1, 16, -0.4F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 157, 41, -2.95F, -44.9571F, -20.5F, 1, 1, 16, -0.4F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 0, 157, -2.951F, -45.1571F, -20.5F, 1, 1, 16, -0.4F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 0, 136, -2.15F, -44.558F, -20.5F, 2, 1, 16, -0.4F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 40, 45, -2.15F, -44.556F, -22.2F, 2, 1, 3, -0.4F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 0, 44, -2.85F, -44.557F, -22.201F, 2, 1, 3, -0.4F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 139, 99, -1.15F, -44.7571F, -20.5F, 1, 1, 16, -0.4F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 139, 40, -1.15F, -44.9571F, -20.0F, 1, 1, 16, -0.4F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 88, 137, -1.15F, -45.1571F, -19.9F, 1, 1, 16, -0.4F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 19, 26, -2.55F, -43.2071F, -22.5F, 2, 4, 1, 0.0F, false));

		bone35_r1 = new ModelRenderer(this);
		bone35_r1.setRotationPoint(-2.35F, -45.66F, -3.75F);
		carryhandle.addChild(bone35_r1);
		setRotationAngle(bone35_r1, -2.3562F, 0.0F, 0.0F);
		

		bone34_r1 = new ModelRenderer(this);
		bone34_r1.setRotationPoint(-1.95F, -45.05F, -4.35F);
		carryhandle.addChild(bone34_r1);
		setRotationAngle(bone34_r1, 0.0401F, 0.0F, 0.0F);
		

		bone45_r1 = new ModelRenderer(this);
		bone45_r1.setRotationPoint(-1.55F, -43.9864F, -12.0993F);
		carryhandle.addChild(bone45_r1);
		setRotationAngle(bone45_r1, -0.0524F, 0.0F, 0.0F);
		

		bone17_r1 = new ModelRenderer(this);
		bone17_r1.setRotationPoint(-1.55F, -44.2071F, -22.0F);
		carryhandle.addChild(bone17_r1);
		setRotationAngle(bone17_r1, -0.5236F, 0.0F, 0.0F);
		

		bone38_r1 = new ModelRenderer(this);
		bone38_r1.setRotationPoint(0.25F, -44.6045F, -21.4139F);
		carryhandle.addChild(bone38_r1);
		setRotationAngle(bone38_r1, -0.9163F, 0.0F, 0.0F);
		

		bone36_r1 = new ModelRenderer(this);
		bone36_r1.setRotationPoint(-0.15F, -45.2045F, -20.9139F);
		carryhandle.addChild(bone36_r1);
		setRotationAngle(bone36_r1, -1.2654F, 0.0F, 0.0F);
		

		bone28_r1 = new ModelRenderer(this);
		bone28_r1.setRotationPoint(-1.55F, -43.7201F, -2.2072F);
		carryhandle.addChild(bone28_r1);
		setRotationAngle(bone28_r1, 0.7854F, 0.0F, 0.0F);
		

		bone14_r1 = new ModelRenderer(this);
		bone14_r1.setRotationPoint(0.75F, -32.25F, -14.75F);
		carryhandle.addChild(bone14_r1);
		setRotationAngle(bone14_r1, 0.7854F, 0.0F, 0.0F);
		

		bone26_r1 = new ModelRenderer(this);
		bone26_r1.setRotationPoint(-1.55F, -42.3545F, -5.2639F);
		carryhandle.addChild(bone26_r1);
		setRotationAngle(bone26_r1, 0.6545F, 0.0F, 0.0F);
		

		bone25_r1 = new ModelRenderer(this);
		bone25_r1.setRotationPoint(-1.55F, -41.9545F, -4.9139F);
		carryhandle.addChild(bone25_r1);
		setRotationAngle(bone25_r1, 0.5236F, 0.0F, 0.0F);
		

		bone22_r1 = new ModelRenderer(this);
		bone22_r1.setRotationPoint(-1.55F, -40.6045F, -5.4139F);
		carryhandle.addChild(bone22_r1);
		setRotationAngle(bone22_r1, -0.48F, 0.0F, 0.0F);
		

		bone21_r1 = new ModelRenderer(this);
		bone21_r1.setRotationPoint(-1.55F, -40.6045F, -6.1639F);
		carryhandle.addChild(bone21_r1);
		setRotationAngle(bone21_r1, -1.0908F, 0.0F, 0.0F);
		

		bone27_r1 = new ModelRenderer(this);
		bone27_r1.setRotationPoint(-1.55F, -42.7541F, -1.9484F);
		carryhandle.addChild(bone27_r1);
		setRotationAngle(bone27_r1, 0.48F, 0.0F, 0.0F);
		

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(-1.55F, -42.7541F, -1.9484F);
		carryhandle.addChild(bone27);
		setRotationAngle(bone27, 0.48F, 0.0F, 0.0F);
		bone27.cubeList.add(new ModelBox(bone27, 0, 0, -1.001F, -1.4823F, -1.9626F, 2, 4, 2, 0.0F, false));
		bone27.cubeList.add(new ModelBox(bone27, 0, 59, -0.099F, -3.3823F, -2.0622F, 2, 3, 3, -0.9F, false));
		bone27.cubeList.add(new ModelBox(bone27, 0, 38, -1.899F, -3.3823F, -2.0622F, 2, 3, 3, -0.9F, false));

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(-1.55F, -40.6045F, -6.1639F);
		carryhandle.addChild(bone21);
		setRotationAngle(bone21, -1.0908F, 0.0F, 0.0F);
		bone21.cubeList.add(new ModelBox(bone21, 60, 45, -0.5F, -1.2209F, -0.0115F, 1, 1, 1, 0.0F, false));

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(-1.55F, -40.6045F, -5.4139F);
		carryhandle.addChild(bone22);
		setRotationAngle(bone22, -0.48F, 0.0F, 0.0F);
		bone22.cubeList.add(new ModelBox(bone22, 52, 56, -0.501F, -1.2209F, -0.0115F, 1, 1, 1, 0.0F, false));

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(-1.55F, -41.9545F, -4.9139F);
		carryhandle.addChild(bone25);
		setRotationAngle(bone25, 0.5236F, 0.0F, 0.0F);
		bone25.cubeList.add(new ModelBox(bone25, 34, 26, -0.5F, -1.4941F, -0.0847F, 1, 4, 2, 0.0F, false));

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(-1.55F, -42.3545F, -5.2639F);
		carryhandle.addChild(bone26);
		setRotationAngle(bone26, 0.6545F, 0.0F, 0.0F);
		bone26.cubeList.add(new ModelBox(bone26, 0, 49, -1.002F, -1.7394F, 0.1342F, 2, 1, 1, 0.0F, false));
		bone26.cubeList.add(new ModelBox(bone26, 0, 6, -1.003F, -2.0455F, 0.1339F, 2, 1, 1, 0.0F, false));

		bone31 = new ModelRenderer(this);
		bone31.setRotationPoint(-1.55F, -42.2545F, -5.6639F);
		carryhandle.addChild(bone31);
		bone31.cubeList.add(new ModelBox(bone31, 60, 66, -1.003F, -1.7655F, 0.0639F, 2, 1, 2, 0.0F, false));
		bone31.cubeList.add(new ModelBox(bone31, 60, 6, -1.001F, -2.2655F, -0.2361F, 2, 1, 2, 0.0F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(0.75F, -32.25F, -14.75F);
		carryhandle.addChild(bone14);
		setRotationAngle(bone14, 0.7854F, 0.0F, 0.0F);
		bone14.cubeList.add(new ModelBox(bone14, 42, 26, -3.902F, -2.0707F, 15.2028F, 1, 2, 2, -0.2F, false));
		bone14.cubeList.add(new ModelBox(bone14, 48, 56, -1.95F, -1.7071F, 15.5563F, 1, 1, 1, -0.2F, false));

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(-1.55F, -43.7201F, -2.2072F);
		carryhandle.addChild(bone28);
		setRotationAngle(bone28, 0.7854F, 0.0F, 0.0F);
		

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(-1.95F, -45.2045F, -20.9139F);
		carryhandle.addChild(bone19);
		setRotationAngle(bone19, -1.2654F, 0.0F, 0.0F);
		bone19.cubeList.add(new ModelBox(bone19, 20, 74, -1.0F, -1.2555F, 0.0639F, 1, 2, 1, -0.4F, false));
		bone19.cubeList.add(new ModelBox(bone19, 20, 65, -1.0F, -1.1954F, 0.2546F, 1, 2, 1, -0.4F, false));
		bone19.cubeList.add(new ModelBox(bone19, 60, 52, -1.0F, -1.1352F, 0.4454F, 1, 2, 1, -0.4F, false));
		bone19.cubeList.add(new ModelBox(bone19, 60, 42, -1.0F, -1.0751F, 0.6361F, 1, 2, 1, -0.4F, false));
		bone19.cubeList.add(new ModelBox(bone19, 52, 0, -1.0F, -1.015F, 0.8269F, 2, 2, 1, -0.4F, false));

		bone36 = new ModelRenderer(this);
		bone36.setRotationPoint(-0.15F, -45.2045F, -20.9139F);
		carryhandle.addChild(bone36);
		setRotationAngle(bone36, -1.2654F, 0.0F, 0.0F);
		bone36.cubeList.add(new ModelBox(bone36, 27, 59, -1.0F, -1.2555F, 0.0639F, 1, 2, 1, -0.4F, false));
		bone36.cubeList.add(new ModelBox(bone36, 12, 59, -1.0F, -1.1954F, 0.2546F, 1, 2, 1, -0.4F, false));
		bone36.cubeList.add(new ModelBox(bone36, 54, 51, -1.0F, -1.1352F, 0.4454F, 1, 2, 1, -0.4F, false));
		bone36.cubeList.add(new ModelBox(bone36, 21, 48, -1.0F, -1.0751F, 0.6361F, 1, 2, 1, -0.4F, false));
		bone36.cubeList.add(new ModelBox(bone36, 51, 19, -2.0F, -1.015F, 0.8269F, 2, 2, 1, -0.4F, false));

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(-1.55F, -44.6045F, -21.4139F);
		carryhandle.addChild(bone18);
		setRotationAngle(bone18, -0.9163F, 0.0F, 0.0F);
		bone18.cubeList.add(new ModelBox(bone18, 71, 26, -1.001F, 1.7402F, 2.0334F, 2, 1, 2, 0.0F, false));

		bone37 = new ModelRenderer(this);
		bone37.setRotationPoint(-1.55F, -44.6045F, -21.4139F);
		carryhandle.addChild(bone37);
		setRotationAngle(bone37, -0.9163F, 0.0F, 0.0F);
		bone37.cubeList.add(new ModelBox(bone37, 45, 6, -1.401F, -0.7355F, -0.2895F, 1, 2, 1, -0.4F, false));
		bone37.cubeList.add(new ModelBox(bone37, 45, 0, -1.401F, -0.6137F, -0.1309F, 1, 2, 1, -0.4F, false));
		bone37.cubeList.add(new ModelBox(bone37, 27, 45, -1.401F, -0.492F, 0.0278F, 1, 2, 1, -0.4F, false));
		bone37.cubeList.add(new ModelBox(bone37, 42, 35, -1.401F, -0.3702F, 0.1865F, 1, 2, 1, -0.4F, false));
		bone37.cubeList.add(new ModelBox(bone37, 42, 30, -1.401F, -0.2955F, 0.3639F, 2, 2, 1, -0.4F, false));

		bone38 = new ModelRenderer(this);
		bone38.setRotationPoint(0.25F, -44.6045F, -21.4139F);
		carryhandle.addChild(bone38);
		setRotationAngle(bone38, -0.9163F, 0.0F, 0.0F);
		bone38.cubeList.add(new ModelBox(bone38, 12, 38, -1.401F, -0.7355F, -0.2895F, 1, 2, 1, -0.4F, false));
		bone38.cubeList.add(new ModelBox(bone38, 27, 33, -1.401F, -0.6137F, -0.1309F, 1, 2, 1, -0.4F, false));
		bone38.cubeList.add(new ModelBox(bone38, 30, 6, -1.401F, -0.492F, 0.0278F, 1, 2, 1, -0.4F, false));
		bone38.cubeList.add(new ModelBox(bone38, 30, 0, -1.401F, -0.3702F, 0.1865F, 1, 2, 1, -0.4F, false));
		bone38.cubeList.add(new ModelBox(bone38, 40, 19, -2.401F, -0.2955F, 0.3639F, 2, 2, 1, -0.4F, false));

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(-1.55F, -44.2071F, -22.0F);
		carryhandle.addChild(bone17);
		setRotationAngle(bone17, -0.5236F, 0.0F, 0.0F);
		bone17.cubeList.add(new ModelBox(bone17, 18, 34, -0.999F, 0.116F, 0.067F, 2, 1, 1, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 71, 6, -0.999F, 2.0476F, 2.2214F, 2, 1, 2, 0.0F, false));

		bone45 = new ModelRenderer(this);
		bone45.setRotationPoint(-1.55F, -43.9864F, -12.0993F);
		carryhandle.addChild(bone45);
		setRotationAngle(bone45, -0.0524F, 0.0F, 0.0F);
		bone45.cubeList.add(new ModelBox(bone45, 70, 70, -1.002F, -0.5471F, 7.4844F, 2, 1, 2, 0.0F, false));

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(-0.15F, -45.05F, -4.35F);
		carryhandle.addChild(bone20);
		setRotationAngle(bone20, 0.0401F, 0.0F, 0.0F);
		bone20.cubeList.add(new ModelBox(bone20, 130, 130, -1.0F, -1.0F, -16.0F, 1, 1, 17, -0.4F, false));
		bone20.cubeList.add(new ModelBox(bone20, 120, 99, -1.0F, -0.8002F, -16.008F, 1, 1, 17, -0.4F, false));
		bone20.cubeList.add(new ModelBox(bone20, 120, 78, -1.002F, -0.6003F, -16.0161F, 1, 1, 17, -0.4F, false));
		bone20.cubeList.add(new ModelBox(bone20, 120, 60, -1.002F, -0.4005F, -16.0241F, 1, 1, 17, -0.4F, false));
		bone20.cubeList.add(new ModelBox(bone20, 0, 118, -0.999F, -0.2006F, -16.0321F, 1, 1, 17, -0.4F, false));

		bone34 = new ModelRenderer(this);
		bone34.setRotationPoint(-1.95F, -45.05F, -4.35F);
		carryhandle.addChild(bone34);
		setRotationAngle(bone34, 0.0401F, 0.0F, 0.0F);
		bone34.cubeList.add(new ModelBox(bone34, 120, 40, -1.0F, -1.0F, -16.0F, 1, 1, 17, -0.4F, false));
		bone34.cubeList.add(new ModelBox(bone34, 120, 18, -1.0F, -0.8002F, -16.008F, 1, 1, 17, -0.4F, false));
		bone34.cubeList.add(new ModelBox(bone34, 120, 0, -1.0F, -0.6003F, -16.0161F, 1, 1, 17, -0.4F, false));
		bone34.cubeList.add(new ModelBox(bone34, 88, 119, -0.999F, -0.4005F, -16.0241F, 1, 1, 17, -0.4F, false));
		bone34.cubeList.add(new ModelBox(bone34, 44, 119, -0.999F, -0.2006F, -16.0321F, 1, 1, 17, -0.4F, false));

		bone33 = new ModelRenderer(this);
		bone33.setRotationPoint(-0.55F, -45.66F, -3.75F);
		carryhandle.addChild(bone33);
		setRotationAngle(bone33, -2.3562F, 0.0F, 0.0F);
		bone33.cubeList.add(new ModelBox(bone33, 60, 29, -0.601F, -0.58F, -0.4F, 1, 1, 2, -0.4F, false));
		bone33.cubeList.add(new ModelBox(bone33, 60, 26, -0.601F, -0.78F, -0.4F, 1, 1, 2, -0.4F, false));
		bone33.cubeList.add(new ModelBox(bone33, 51, 59, -0.601F, -0.98F, -0.4F, 1, 1, 2, -0.4F, false));
		bone33.cubeList.add(new ModelBox(bone33, 42, 59, -0.601F, -1.18F, -0.4F, 1, 1, 2, -0.4F, false));
		bone33.cubeList.add(new ModelBox(bone33, 34, 59, -0.601F, -1.38F, -0.4F, 1, 1, 2, -0.4F, false));

		bone35 = new ModelRenderer(this);
		bone35.setRotationPoint(-2.35F, -45.66F, -3.75F);
		carryhandle.addChild(bone35);
		setRotationAngle(bone35, -2.3562F, 0.0F, 0.0F);
		bone35.cubeList.add(new ModelBox(bone35, 19, 59, -0.601F, -0.58F, -0.4F, 1, 1, 2, -0.4F, false));
		bone35.cubeList.add(new ModelBox(bone35, 26, 53, -0.601F, -0.78F, -0.4F, 1, 1, 2, -0.4F, false));
		bone35.cubeList.add(new ModelBox(bone35, 52, 45, -0.601F, -0.98F, -0.4F, 1, 1, 2, -0.4F, false));
		bone35.cubeList.add(new ModelBox(bone35, 52, 35, -0.601F, -1.18F, -0.4F, 1, 1, 2, -0.4F, false));
		bone35.cubeList.add(new ModelBox(bone35, 52, 6, -0.601F, -1.38F, -0.4F, 1, 1, 2, -0.4F, false));

		receiver = new ModelRenderer(this);
		receiver.setRotationPoint(0.0F, 24.0F, 0.0F);
		receiver.cubeList.add(new ModelBox(receiver, 37, 56, -3.8F, -38.0F, 0.5F, 1, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 16, 56, -0.2F, -38.0F, 0.5F, 1, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 49, 51, -0.6F, -39.3F, -19.5F, 1, 2, 3, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 42, 62, -3.7F, -38.0F, -22.7F, 1, 1, 2, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 27, 59, -3.7F, -38.0F, -11.7F, 1, 1, 13, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 60, 85, -0.3F, -38.0F, -22.7F, 1, 1, 24, 0.0F, false));

		receiver6_r1 = new ModelRenderer(this);
		receiver6_r1.setRotationPoint(0.7F, -37.0F, -22.7F);
		receiver.addChild(receiver6_r1);
		setRotationAngle(receiver6_r1, 0.0F, 0.0F, -2.2864F);
		

		receiver5_r1 = new ModelRenderer(this);
		receiver5_r1.setRotationPoint(0.7F, -38.0F, -22.7F);
		receiver.addChild(receiver5_r1);
		setRotationAngle(receiver5_r1, 0.0F, 0.0F, 2.3038F);
		

		receiver8_r1 = new ModelRenderer(this);
		receiver8_r1.setRotationPoint(-3.7F, -38.0F, -11.7F);
		receiver.addChild(receiver8_r1);
		setRotationAngle(receiver8_r1, 0.0F, 0.0F, -2.2864F);
		

		receiver9_r1 = new ModelRenderer(this);
		receiver9_r1.setRotationPoint(-3.7F, -37.0F, -22.7F);
		receiver.addChild(receiver9_r1);
		setRotationAngle(receiver9_r1, 0.0F, 0.0F, -2.2864F);
		

		receiver15_r1 = new ModelRenderer(this);
		receiver15_r1.setRotationPoint(0.4F, -39.1F, -19.5F);
		receiver.addChild(receiver15_r1);
		setRotationAngle(receiver15_r1, 0.0F, 0.0F, 1.9705F);
		

		receiver16_r1 = new ModelRenderer(this);
		receiver16_r1.setRotationPoint(0.4F, -39.1F, -19.5F);
		receiver.addChild(receiver16_r1);
		setRotationAngle(receiver16_r1, 0.0F, -1.9333F, 0.0F);
		

		receiver17_r1 = new ModelRenderer(this);
		receiver17_r1.setRotationPoint(0.4F, -39.1F, -16.5F);
		receiver.addChild(receiver17_r1);
		setRotationAngle(receiver17_r1, 0.0F, 1.9333F, 0.0F);
		

		receiver20_r1 = new ModelRenderer(this);
		receiver20_r1.setRotationPoint(-3.8F, -38.0F, 0.5F);
		receiver.addChild(receiver20_r1);
		setRotationAngle(receiver20_r1, 0.0F, 0.0F, -2.2864F);
		

		receiver23_r1 = new ModelRenderer(this);
		receiver23_r1.setRotationPoint(-3.8F, -37.0F, 0.5F);
		receiver.addChild(receiver23_r1);
		setRotationAngle(receiver23_r1, 0.0F, 0.0F, -2.042F);
		

		receiver24_r1 = new ModelRenderer(this);
		receiver24_r1.setRotationPoint(0.8F, -38.0F, 0.5F);
		receiver.addChild(receiver24_r1);
		setRotationAngle(receiver24_r1, 0.0F, 0.0F, 2.2864F);
		

		receiver25_r1 = new ModelRenderer(this);
		receiver25_r1.setRotationPoint(0.8F, -37.0F, 0.5F);
		receiver.addChild(receiver25_r1);
		setRotationAngle(receiver25_r1, 0.0F, 0.0F, 2.042F);
		

		receiver25 = new ModelRenderer(this);
		receiver25.setRotationPoint(0.8F, -37.0F, 0.5F);
		receiver.addChild(receiver25);
		setRotationAngle(receiver25, 0.0F, 0.0F, 2.042F);
		receiver25.cubeList.add(new ModelBox(receiver25, 12, 34, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		receiver24 = new ModelRenderer(this);
		receiver24.setRotationPoint(0.8F, -38.0F, 0.5F);
		receiver.addChild(receiver24);
		setRotationAngle(receiver24, 0.0F, 0.0F, 2.2864F);
		receiver24.cubeList.add(new ModelBox(receiver24, 47, 73, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		receiver23 = new ModelRenderer(this);
		receiver23.setRotationPoint(-3.8F, -37.0F, 0.5F);
		receiver.addChild(receiver23);
		setRotationAngle(receiver23, 0.0F, 0.0F, -2.042F);
		receiver23.cubeList.add(new ModelBox(receiver23, 16, 6, -2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		receiver20 = new ModelRenderer(this);
		receiver20.setRotationPoint(-3.8F, -38.0F, 0.5F);
		receiver.addChild(receiver20);
		setRotationAngle(receiver20, 0.0F, 0.0F, -2.2864F);
		receiver20.cubeList.add(new ModelBox(receiver20, 43, 73, -1.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		receiver17 = new ModelRenderer(this);
		receiver17.setRotationPoint(0.4F, -39.1F, -16.5F);
		receiver.addChild(receiver17);
		setRotationAngle(receiver17, 0.0F, 1.9333F, 0.0F);
		receiver17.cubeList.add(new ModelBox(receiver17, 39, 73, 0.0F, -0.2F, -1.0F, 1, 2, 1, 0.0F, false));

		receiver16 = new ModelRenderer(this);
		receiver16.setRotationPoint(0.4F, -39.1F, -19.5F);
		receiver.addChild(receiver16);
		setRotationAngle(receiver16, 0.0F, -1.9333F, 0.0F);
		receiver16.cubeList.add(new ModelBox(receiver16, 35, 73, 0.0F, -0.2F, 0.0F, 1, 2, 1, 0.0F, false));

		receiver15 = new ModelRenderer(this);
		receiver15.setRotationPoint(0.4F, -39.1F, -19.5F);
		receiver.addChild(receiver15);
		setRotationAngle(receiver15, 0.0F, 0.0F, 1.9705F);
		receiver15.cubeList.add(new ModelBox(receiver15, 41, 53, -0.1842F, 0.0778F, 0.0F, 1, 1, 3, 0.0F, false));

		receiver10 = new ModelRenderer(this);
		receiver10.setRotationPoint(-3.7F, -38.0F, -22.7F);
		receiver.addChild(receiver10);
		setRotationAngle(receiver10, 0.0F, 0.0F, -2.2864F);
		receiver10.cubeList.add(new ModelBox(receiver10, 40, 15, -1.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

		receiver9 = new ModelRenderer(this);
		receiver9.setRotationPoint(-3.7F, -37.0F, -22.7F);
		receiver.addChild(receiver9);
		setRotationAngle(receiver9, 0.0F, 0.0F, -2.2864F);
		receiver9.cubeList.add(new ModelBox(receiver9, 60, 60, -2.0F, 0.0F, 0.0F, 2, 1, 24, 0.0F, false));

		receiver8 = new ModelRenderer(this);
		receiver8.setRotationPoint(-3.7F, -38.0F, -11.7F);
		receiver.addChild(receiver8);
		setRotationAngle(receiver8, 0.0F, 0.0F, -2.2864F);
		receiver8.cubeList.add(new ModelBox(receiver8, 30, 0, -1.0F, 0.0F, 0.0F, 1, 2, 13, 0.0F, false));

		receiver5 = new ModelRenderer(this);
		receiver5.setRotationPoint(0.7F, -38.0F, -22.7F);
		receiver.addChild(receiver5);
		setRotationAngle(receiver5, 0.0F, 0.0F, 2.3038F);
		receiver5.cubeList.add(new ModelBox(receiver5, 60, 26, 0.0F, 0.0F, 0.0F, 1, 2, 24, 0.0F, false));

		receiver6 = new ModelRenderer(this);
		receiver6.setRotationPoint(0.7F, -37.0F, -22.7F);
		receiver.addChild(receiver6);
		setRotationAngle(receiver6, 0.0F, 0.0F, -2.2864F);
		receiver6.cubeList.add(new ModelBox(receiver6, 60, 0, 0.0F, -2.0F, 0.0F, 1, 2, 24, 0.0F, false));

		barrel = new ModelRenderer(this);
		barrel.setRotationPoint(0.0F, 24.0F, 0.0F);
		barrel.cubeList.add(new ModelBox(barrel, 29, 88, -1.8F, -38.0F, -53.5F, 1, 1, 29, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 89, 30, -2.0F, -38.2F, -53.5F, 1, 1, 29, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 29, 29, -2.2F, -38.0F, -53.5F, 1, 1, 29, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 89, 89, -2.0F, -37.8F, -53.5F, 1, 1, 29, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 8, 70, -2.0F, -38.4F, -58.5F, 1, 1, 5, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 12, 59, -1.6F, -38.0F, -58.5F, 1, 1, 5, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 45, 6, -1.8F, -38.2F, -58.5F, 1, 1, 5, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 12, 38, -1.8F, -37.8F, -58.5F, 1, 1, 5, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 27, 65, -2.0F, -37.6F, -58.5F, 1, 1, 5, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 45, 45, -2.2F, -37.8F, -58.5F, 1, 1, 5, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 27, 59, -2.4F, -38.0F, -58.5F, 1, 1, 5, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 45, 0, -2.2F, -38.2F, -58.5F, 1, 1, 5, 0.0F, false));

		bone3_r1 = new ModelRenderer(this);
		bone3_r1.setRotationPoint(0.0F, -38.2F, -63.5F);
		barrel.addChild(bone3_r1);
		setRotationAngle(bone3_r1, 0.0F, -0.2618F, -0.1571F);
		

		bone2_r1 = new ModelRenderer(this);
		bone2_r1.setRotationPoint(-1.0F, -38.3F, -67.5F);
		barrel.addChild(bone2_r1);
		setRotationAngle(bone2_r1, 0.0F, 0.0F, 2.3562F);
		

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-1.0F, -38.3F, -67.5F);
		barrel.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, 2.3562F);
		bone2.cubeList.add(new ModelBox(bone2, 27, 33, 0.0F, -0.7F, 17.0F, 1, 1, 5, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 30, 6, 0.4243F, -1.1243F, 17.0F, 1, 1, 5, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 30, 0, 0.4243F, -0.2757F, 17.0F, 1, 1, 5, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 27, 27, 0.8036F, -0.7F, 17.0F, 1, 1, 5, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, -38.2F, -63.5F);
		barrel.addChild(bone3);
		setRotationAngle(bone3, 0.0F, -0.2618F, -0.1571F);
		bone3.cubeList.add(new ModelBox(bone3, 13, 16, 3.3999F, -1.0F, 16.4207F, 1, 3, 1, 0.0F, false));

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		gun.cubeList.add(new ModelBox(gun, 16, 0, -2.5F, -39.3F, 1.0F, 2, 4, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 70, -0.1F, -37.9F, 1.0F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 53, -3.9F, -37.9F, 1.0F, 4, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 60, 70, -3.3F, -36.0F, -1.0F, 3, 3, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 42, 35, -3.0F, -33.35F, -1.0F, 3, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 13, 16, -0.7F, -36.0F, -1.0F, 1, 3, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 26, 86, -3.3F, -36.0F, -14.0F, 3, 5, 13, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -2.8F, -37.7F, -22.5F, 3, 2, 24, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 86, -3.25F, -36.7F, -22.0F, 1, 1, 24, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 69, 34, -0.5F, -34.0F, -6.5F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 60, 0, -3.0F, -31.0F, -6.5F, 3, 5, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 16, -3.0F, -27.0F, -13.3F, 3, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 71, 0, -3.5F, -36.0F, -13.2F, 4, 4, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 70, 10, -0.4F, -33.5F, -16.3F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -3.5F, -36.0F, -21.2F, 4, 8, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 27, 45, -3.5F, -28.0F, -18.2F, 4, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 30, 15, -0.35F, -32.8F, -16.5F, 1, 6, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 34, 33, -0.35F, -36.5F, -16.5F, 1, 3, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 27, 27, -3.8F, -34.3F, -14.7F, 1, 3, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 50, 67, -3.801F, -32.5F, -14.4F, 1, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 34, 62, -3.7F, -33.9F, -13.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 59, -3.8F, -35.3F, -21.4F, 1, 1, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 60, 0, -4.3F, -37.5F, -21.0F, 1, 1, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 31, 73, -4.1F, -38.3F, -12.0F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 26, -0.55F, -38.0F, -21.2F, 1, 2, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 74, 74, -0.25F, -36.5F, -12.75F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 27, 62, -0.3F, -35.6F, -12.5F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 19, 62, -0.3F, -35.6F, -13.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 12, 53, -3.5F, -35.7F, -22.7F, 4, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 16, -1.95F, -39.5F, -24.5F, 1, 4, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 12, 44, -3.45F, -38.0F, -24.5F, 4, 1, 2, 0.0F, false));

		gun590_r1 = new ModelRenderer(this);
		gun590_r1.setRotationPoint(-1.95F, -39.0F, -23.5F);
		gun.addChild(gun590_r1);
		setRotationAngle(gun590_r1, 0.0F, 0.0F, 0.8179F);
		

		gun591_r1 = new ModelRenderer(this);
		gun591_r1.setRotationPoint(-0.95F, -39.0F, -23.45F);
		gun.addChild(gun591_r1);
		setRotationAngle(gun591_r1, 0.0F, 0.0F, 0.7808F);
		

		gun594_r1 = new ModelRenderer(this);
		gun594_r1.setRotationPoint(-0.95F, -36.0F, -23.5F);
		gun.addChild(gun594_r1);
		setRotationAngle(gun594_r1, 0.0F, 0.0F, -2.3423F);
		

		gun596_r1 = new ModelRenderer(this);
		gun596_r1.setRotationPoint(-1.95F, -36.0F, -23.5F);
		gun.addChild(gun596_r1);
		setRotationAngle(gun596_r1, 0.0F, 0.0F, -2.3794F);
		

		gun60_r1 = new ModelRenderer(this);
		gun60_r1.setRotationPoint(-0.4F, -35.6F, -22.1F);
		gun.addChild(gun60_r1);
		setRotationAngle(gun60_r1, -0.3316F, 0.0F, 0.0F);
		

		gun58_r1 = new ModelRenderer(this);
		gun58_r1.setRotationPoint(-3.5F, -34.5F, -22.7F);
		gun.addChild(gun58_r1);
		setRotationAngle(gun58_r1, 1.1351F, 0.0F, 0.0F);
		

		gun132_r1 = new ModelRenderer(this);
		gun132_r1.setRotationPoint(-0.25F, -36.1F, -12.9F);
		gun.addChild(gun132_r1);
		setRotationAngle(gun132_r1, 0.0F, 0.0F, -1.2641F);
		

		gun263_r1 = new ModelRenderer(this);
		gun263_r1.setRotationPoint(-4.1F, -37.0F, -21.5F);
		gun.addChild(gun263_r1);
		setRotationAngle(gun263_r1, 0.0F, 0.0F, -0.9295F);
		

		gun269_r1 = new ModelRenderer(this);
		gun269_r1.setRotationPoint(-2.8F, -39.3F, -20.0F);
		gun.addChild(gun269_r1);
		setRotationAngle(gun269_r1, 0.0F, 0.0F, 0.632F);
		

		gun259_r1 = new ModelRenderer(this);
		gun259_r1.setRotationPoint(-2.5125F, -39.5296F, -12.0F);
		gun.addChild(gun259_r1);
		setRotationAngle(gun259_r1, 0.0F, 0.0F, -0.6458F);
		

		gun264_r1 = new ModelRenderer(this);
		gun264_r1.setRotationPoint(-4.2F, -37.4F, -20.0F);
		gun.addChild(gun264_r1);
		setRotationAngle(gun264_r1, 0.0F, 0.0F, 0.2974F);
		

		gun82_r1 = new ModelRenderer(this);
		gun82_r1.setRotationPoint(-3.8F, -34.3F, -14.7F);
		gun.addChild(gun82_r1);
		setRotationAngle(gun82_r1, 0.0F, 0.7436F, 0.0F);
		

		gun80_r1 = new ModelRenderer(this);
		gun80_r1.setRotationPoint(-3.8F, -31.3F, -14.7F);
		gun.addChild(gun80_r1);
		setRotationAngle(gun80_r1, 0.0F, 0.0F, -0.2603F);
		

		gun49_r1 = new ModelRenderer(this);
		gun49_r1.setRotationPoint(-0.3F, -27.5F, -21.2F);
		gun.addChild(gun49_r1);
		setRotationAngle(gun49_r1, 1.3756F, 0.0F, 0.0F);
		

		bone_r1 = new ModelRenderer(this);
		bone_r1.setRotationPoint(0.2F, -32.8F, -16.5F);
		gun.addChild(bone_r1);
		setRotationAngle(bone_r1, 0.0F, 0.0F, 0.7854F);
		

		gun53_r1 = new ModelRenderer(this);
		gun53_r1.setRotationPoint(-3.5F, -32.0F, -11.2F);
		gun.addChild(gun53_r1);
		setRotationAngle(gun53_r1, -2.7884F, 0.0F, 0.0F);
		

		gun63_r1 = new ModelRenderer(this);
		gun63_r1.setRotationPoint(-2.0F, -30.2F, -8.95F);
		gun.addChild(gun63_r1);
		setRotationAngle(gun63_r1, -0.409F, 0.0F, 0.0F);
		

		gun28_r1 = new ModelRenderer(this);
		gun28_r1.setRotationPoint(-3.2F, -27.0F, -11.5F);
		gun.addChild(gun28_r1);
		setRotationAngle(gun28_r1, -2.3562F, 0.0F, 0.0F);
		

		gun21_r1 = new ModelRenderer(this);
		gun21_r1.setRotationPoint(-3.2F, -27.0F, -7.8F);
		gun.addChild(gun21_r1);
		setRotationAngle(gun21_r1, 0.7854F, 0.0F, 0.0F);
		

		gun17_r1 = new ModelRenderer(this);
		gun17_r1.setRotationPoint(-3.2F, -30.0F, -6.5F);
		gun.addChild(gun17_r1);
		setRotationAngle(gun17_r1, 2.3562F, 0.0F, 0.0F);
		

		gun152_r1 = new ModelRenderer(this);
		gun152_r1.setRotationPoint(-0.6F, -33.5F, -5.3F);
		gun.addChild(gun152_r1);
		setRotationAngle(gun152_r1, 0.7854F, 0.0F, 0.0F);
		

		gun142_r1 = new ModelRenderer(this);
		gun142_r1.setRotationPoint(-4.7F, -38.0F, 0.5F);
		gun.addChild(gun142_r1);
		setRotationAngle(gun142_r1, 0.0F, -0.2603F, 0.0F);
		

		gun151_r1 = new ModelRenderer(this);
		gun151_r1.setRotationPoint(-3.3F, -36.0F, -1.0F);
		gun.addChild(gun151_r1);
		setRotationAngle(gun151_r1, 0.4461F, 0.0F, -0.4712F);
		

		gun139_r1 = new ModelRenderer(this);
		gun139_r1.setRotationPoint(-3.1F, -38.2F, -6.0F);
		gun.addChild(gun139_r1);
		setRotationAngle(gun139_r1, 0.0F, -0.2603F, 0.0F);
		

		gun150_r1 = new ModelRenderer(this);
		gun150_r1.setRotationPoint(0.3F, -36.0F, -1.0F);
		gun.addChild(gun150_r1);
		setRotationAngle(gun150_r1, 0.4461F, 0.0F, 0.4538F);
		

		gun66_r1 = new ModelRenderer(this);
		gun66_r1.setRotationPoint(-0.7F, -33.5F, 1.5F);
		gun.addChild(gun66_r1);
		setRotationAngle(gun66_r1, -2.3423F, 0.0F, 0.0F);
		

		gun119_r1 = new ModelRenderer(this);
		gun119_r1.setRotationPoint(-3.9F, -37.0F, 1.0F);
		gun.addChild(gun119_r1);
		setRotationAngle(gun119_r1, 0.0F, 0.0F, -0.4833F);
		

		gun118_r1 = new ModelRenderer(this);
		gun118_r1.setRotationPoint(0.9F, -37.0F, 1.0F);
		gun.addChild(gun118_r1);
		setRotationAngle(gun118_r1, 0.0F, 0.0F, 2.0448F);
		

		gun117_r1 = new ModelRenderer(this);
		gun117_r1.setRotationPoint(0.9F, -37.9F, 1.0F);
		gun.addChild(gun117_r1);
		setRotationAngle(gun117_r1, 0.0F, 0.0F, 2.3562F);
		

		gun120_r1 = new ModelRenderer(this);
		gun120_r1.setRotationPoint(-3.9F, -38.0F, 1.0F);
		gun.addChild(gun120_r1);
		setRotationAngle(gun120_r1, 0.0F, 0.0F, -0.7854F);
		

		gun120 = new ModelRenderer(this);
		gun120.setRotationPoint(-3.9F, -38.0F, 1.0F);
		gun.addChild(gun120);
		setRotationAngle(gun120, 0.0F, 0.0F, -0.7854F);
		gun120.cubeList.add(new ModelBox(gun120, 71, 42, -0.0707F, 0.0707F, 0.0F, 2, 1, 2, 0.0F, false));

		gun117 = new ModelRenderer(this);
		gun117.setRotationPoint(0.9F, -37.9F, 1.0F);
		gun.addChild(gun117);
		setRotationAngle(gun117, 0.0F, 0.0F, 2.3562F);
		gun117.cubeList.add(new ModelBox(gun117, 51, 15, 0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

		gun118 = new ModelRenderer(this);
		gun118.setRotationPoint(0.9F, -37.0F, 1.0F);
		gun.addChild(gun118);
		setRotationAngle(gun118, 0.0F, 0.0F, 2.0448F);
		gun118.cubeList.add(new ModelBox(gun118, 42, 67, 0.089F, -0.0456F, 0.0F, 2, 2, 2, 0.0F, false));

		gun119 = new ModelRenderer(this);
		gun119.setRotationPoint(-3.9F, -37.0F, 1.0F);
		gun.addChild(gun119);
		setRotationAngle(gun119, 0.0F, 0.0F, -0.4833F);
		gun119.cubeList.add(new ModelBox(gun119, 12, 65, -0.0465F, 0.0885F, 0.0F, 2, 2, 2, 0.0F, false));

		gun67 = new ModelRenderer(this);
		gun67.setRotationPoint(-3.3F, -33.5F, 1.5F);
		gun.addChild(gun67);
		setRotationAngle(gun67, -2.3423F, 0.0F, 0.0F);
		gun67.cubeList.add(new ModelBox(gun67, 60, 42, 0.01F, 0.0638F, -1.4959F, 3, 2, 5, 0.0F, false));
		gun67.cubeList.add(new ModelBox(gun67, 60, 52, 0.3F, -0.7242F, -0.49F, 3, 2, 4, 0.0F, false));

		gun66 = new ModelRenderer(this);
		gun66.setRotationPoint(-0.7F, -33.5F, 1.5F);
		gun.addChild(gun66);
		setRotationAngle(gun66, -2.3423F, 0.0F, 0.0F);
		gun66.cubeList.add(new ModelBox(gun66, 12, 26, -0.01F, 0.0638F, -1.4959F, 1, 3, 5, 0.0F, false));

		gun35 = new ModelRenderer(this);
		gun35.setRotationPoint(-0.7F, -36.0F, -12.0F);
		gun.addChild(gun35);
		gun35.cubeList.add(new ModelBox(gun35, 27, 27, 0.0F, 0.0F, -2.0F, 1, 5, 13, 0.0F, false));

		gun150 = new ModelRenderer(this);
		gun150.setRotationPoint(0.3F, -36.0F, -1.0F);
		gun.addChild(gun150);
		setRotationAngle(gun150, 0.4461F, 0.0F, 0.4538F);
		gun150.cubeList.add(new ModelBox(gun150, 60, 14, -1.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun139 = new ModelRenderer(this);
		gun139.setRotationPoint(-3.1F, -38.2F, -6.0F);
		gun.addChild(gun139);
		setRotationAngle(gun139, 0.0F, -0.2603F, 0.0F);
		gun139.cubeList.add(new ModelBox(gun139, 60, 26, 0.0F, 0.0F, 0.0F, 2, 1, 7, 0.0F, false));
		gun139.cubeList.add(new ModelBox(gun139, 40, 15, -0.001F, 0.4F, 0.0F, 2, 1, 7, 0.0F, false));

		gun151 = new ModelRenderer(this);
		gun151.setRotationPoint(-3.3F, -36.0F, -1.0F);
		gun.addChild(gun151);
		setRotationAngle(gun151, 0.4461F, 0.0F, -0.4712F);
		gun151.cubeList.add(new ModelBox(gun151, 60, 10, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun142 = new ModelRenderer(this);
		gun142.setRotationPoint(-4.7F, -38.0F, 0.5F);
		gun.addChild(gun142);
		setRotationAngle(gun142, 0.0F, -0.2603F, 0.0F);
		gun142.cubeList.add(new ModelBox(gun142, 69, 37, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun152 = new ModelRenderer(this);
		gun152.setRotationPoint(-0.6F, -33.5F, -5.3F);
		gun.addChild(gun152);
		setRotationAngle(gun152, 0.7854F, 0.0F, 0.0F);
		gun152.cubeList.add(new ModelBox(gun152, 12, 62, 0.2F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun17 = new ModelRenderer(this);
		gun17.setRotationPoint(-3.2F, -30.0F, -6.5F);
		gun.addChild(gun17);
		setRotationAngle(gun17, 2.3562F, 0.0F, 0.0F);
		gun17.cubeList.add(new ModelBox(gun17, 0, 65, 0.2F, 0.0F, 0.0F, 3, 1, 2, 0.0F, false));

		gun21 = new ModelRenderer(this);
		gun21.setRotationPoint(-3.2F, -27.0F, -7.8F);
		gun.addChild(gun21);
		setRotationAngle(gun21, 0.7854F, 0.0F, 0.0F);
		gun21.cubeList.add(new ModelBox(gun21, 60, 21, 0.2F, 0.1414F, 0.1414F, 3, 1, 2, 0.0F, false));

		gun28 = new ModelRenderer(this);
		gun28.setRotationPoint(-3.2F, -27.0F, -11.5F);
		gun.addChild(gun28);
		setRotationAngle(gun28, -2.3562F, 0.0F, 0.0F);
		gun28.cubeList.add(new ModelBox(gun28, 71, 60, 0.2F, 0.0F, 0.0F, 3, 2, 1, 0.0F, false));

		gun25 = new ModelRenderer(this);
		gun25.setRotationPoint(-0.8F, -31.0F, -13.8F);
		gun.addChild(gun25);
		gun25.cubeList.add(new ModelBox(gun25, 60, 60, -2.2F, -1.0F, 0.0F, 3, 5, 1, 0.0F, false));

		gun63 = new ModelRenderer(this);
		gun63.setRotationPoint(-2.0F, -30.2F, -8.95F);
		gun.addChild(gun63);
		setRotationAngle(gun63, -0.409F, 0.0F, 0.0F);
		gun63.cubeList.add(new ModelBox(gun63, 12, 26, 0.0F, -2.0F, 0.0F, 1, 4, 1, 0.0F, false));

		gun53 = new ModelRenderer(this);
		gun53.setRotationPoint(-3.5F, -32.0F, -11.2F);
		gun.addChild(gun53);
		setRotationAngle(gun53, -2.7884F, 0.0F, 0.0F);
		gun53.cubeList.add(new ModelBox(gun53, 15, 70, 3.001F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.2F, -32.8F, -16.5F);
		gun.addChild(bone);
		setRotationAngle(bone, 0.0F, 0.0F, 0.7854F);
		bone.cubeList.add(new ModelBox(bone, 34, 65, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 51, 62, -0.3636F, -0.3636F, 0.0F, 1, 1, 2, 0.0F, false));

		gun49 = new ModelRenderer(this);
		gun49.setRotationPoint(-0.3F, -27.5F, -21.2F);
		gun.addChild(gun49);
		setRotationAngle(gun49, 1.3756F, 0.0F, 0.0F);
		gun49.cubeList.add(new ModelBox(gun49, 54, 23, 0.1F, -0.1194F, 0.0981F, 1, 8, 1, 0.0F, false));
		gun49.cubeList.add(new ModelBox(gun49, 0, 26, -3.5F, -0.1194F, 0.0981F, 4, 8, 1, 0.0F, false));

		gun80 = new ModelRenderer(this);
		gun80.setRotationPoint(-3.8F, -31.3F, -14.7F);
		gun.addChild(gun80);
		setRotationAngle(gun80, 0.0F, 0.0F, -0.2603F);
		gun80.cubeList.add(new ModelBox(gun80, 74, 55, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun82 = new ModelRenderer(this);
		gun82.setRotationPoint(-3.8F, -34.3F, -14.7F);
		gun.addChild(gun82);
		setRotationAngle(gun82, 0.0F, 0.7436F, 0.0F);
		gun82.cubeList.add(new ModelBox(gun82, 19, 16, 0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

		gun264 = new ModelRenderer(this);
		gun264.setRotationPoint(-4.2F, -37.4F, -20.0F);
		gun.addChild(gun264);
		setRotationAngle(gun264, 0.0F, 0.0F, 0.2974F);
		gun264.cubeList.add(new ModelBox(gun264, 60, 10, -0.1033F, 0.3454F, 0.0F, 1, 3, 8, 0.0F, false));
		gun264.cubeList.add(new ModelBox(gun264, 51, 74, -0.3407F, 1.1512F, 3.5F, 1, 2, 1, 0.0F, false));
		gun264.cubeList.add(new ModelBox(gun264, 29, 53, -0.2F, 0.7F, 0.25F, 1, 2, 3, 0.0F, false));
		gun264.cubeList.add(new ModelBox(gun264, 21, 53, -0.2F, 0.7F, 4.75F, 1, 2, 3, 0.0F, false));

		gun259 = new ModelRenderer(this);
		gun259.setRotationPoint(-2.5125F, -39.5296F, -12.0F);
		gun.addChild(gun259);
		setRotationAngle(gun259, 0.0F, 0.0F, -0.6458F);
		gun259.cubeList.add(new ModelBox(gun259, 6, 49, -2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));
		gun259.cubeList.add(new ModelBox(gun259, 60, 60, -0.3875F, 0.0F, -9.0F, 1, 1, 9, 0.0F, false));

		gun269 = new ModelRenderer(this);
		gun269.setRotationPoint(-2.8F, -39.3F, -20.0F);
		gun.addChild(gun269);
		setRotationAngle(gun269, 0.0F, 0.0F, 0.632F);
		gun269.cubeList.add(new ModelBox(gun269, 30, 15, 0.0F, 0.0F, 0.0F, 1, 1, 8, 0.0F, false));
		gun269.cubeList.add(new ModelBox(gun269, 27, 73, 0.0F, 0.0F, -1.0F, 1, 2, 1, 0.0F, false));
		gun269.cubeList.add(new ModelBox(gun269, 12, 56, -0.001F, 1.3F, -1.01F, 1, 1, 1, 0.0F, false));

		gun263 = new ModelRenderer(this);
		gun263.setRotationPoint(-4.1F, -37.0F, -21.5F);
		gun.addChild(gun263);
		setRotationAngle(gun263, 0.0F, 0.0F, -0.9295F);
		gun263.cubeList.add(new ModelBox(gun263, 0, 38, 0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F, false));

		gun132 = new ModelRenderer(this);
		gun132.setRotationPoint(-0.25F, -36.1F, -12.9F);
		gun.addChild(gun132);
		setRotationAngle(gun132, 0.0F, 0.0F, -1.2641F);
		gun132.cubeList.add(new ModelBox(gun132, 71, 29, -0.4115F, 0.0255F, -0.4F, 2, 1, 2, -0.1F, false));

		gun58 = new ModelRenderer(this);
		gun58.setRotationPoint(-3.5F, -34.5F, -22.7F);
		gun.addChild(gun58);
		setRotationAngle(gun58, 1.1351F, 0.0F, 0.0F);
		gun58.cubeList.add(new ModelBox(gun58, 34, 53, 0.001F, -0.123F, 0.1577F, 4, 2, 1, 0.0F, false));

		gun60 = new ModelRenderer(this);
		gun60.setRotationPoint(-0.4F, -35.6F, -22.1F);
		gun.addChild(gun60);
		setRotationAngle(gun60, -0.3316F, 0.0F, 0.0F);
		gun60.cubeList.add(new ModelBox(gun60, 27, 68, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun60.cubeList.add(new ModelBox(gun60, 48, 67, -3.2F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun596 = new ModelRenderer(this);
		gun596.setRotationPoint(-1.95F, -36.0F, -23.5F);
		gun.addChild(gun596);
		setRotationAngle(gun596, 0.0F, 0.0F, -2.3794F);
		gun596.cubeList.add(new ModelBox(gun596, 70, 52, -0.3452F, -0.3617F, -1.0F, 2, 1, 2, 0.0F, false));

		gun594 = new ModelRenderer(this);
		gun594.setRotationPoint(-0.95F, -36.0F, -23.5F);
		gun.addChild(gun594);
		setRotationAngle(gun594, 0.0F, 0.0F, -2.3423F);
		gun594.cubeList.add(new ModelBox(gun594, 19, 38, -0.3584F, -0.3486F, -1.0F, 1, 2, 2, 0.0F, false));

		gun591 = new ModelRenderer(this);
		gun591.setRotationPoint(-0.95F, -39.0F, -23.45F);
		gun.addChild(gun591);
		setRotationAngle(gun591, 0.0F, 0.0F, 0.7808F);
		gun591.cubeList.add(new ModelBox(gun591, 70, 21, -0.3519F, -0.3552F, -1.0F, 2, 1, 2, 0.0F, false));

		gun590 = new ModelRenderer(this);
		gun590.setRotationPoint(-1.95F, -39.0F, -23.5F);
		gun.addChild(gun590);
		setRotationAngle(gun590, 0.0F, 0.0F, 0.8179F);
		gun590.cubeList.add(new ModelBox(gun590, 37, 6, -0.3649F, -0.3419F, -1.0F, 1, 2, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		carryhandle.render(f5);
		receiver.render(f5);
		barrel.render(f5);
		gun.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}