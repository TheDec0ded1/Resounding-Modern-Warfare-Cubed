package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.0
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class K50M extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer body;
	private final ModelRenderer cube_r12_r1;
	private final ModelRenderer cube_r14_r1;
	private final ModelRenderer cube_r15_r1;
	private final ModelRenderer cube_r9_r1;
	private final ModelRenderer cube_r15_r2;
	private final ModelRenderer cube_r14_r2;
	private final ModelRenderer cube_r13_r1;
	private final ModelRenderer cube_r14_r3;
	private final ModelRenderer cube_r14_r4;
	private final ModelRenderer cube_r10_r1;
	private final ModelRenderer cube_r8_r1;
	private final ModelRenderer cube_r6_r1;
	private final ModelRenderer cube_r11_r1;
	private final ModelRenderer cube_r10_r2;
	private final ModelRenderer cube_r11_r2;
	private final ModelRenderer cube_r9_r2;
	private final ModelRenderer cube_r9_r3;
	private final ModelRenderer cube_r10_r3;
	private final ModelRenderer cube_r6_r2;
	private final ModelRenderer cube_r10_r4;
	private final ModelRenderer cube_r2_r1;
	private final ModelRenderer cube_r3_r1;
	private final ModelRenderer gun113;
	private final ModelRenderer gun112;
	private final ModelRenderer gun111;
	private final ModelRenderer gun113_r1;
	private final ModelRenderer gun110;
	private final ModelRenderer gun112_r1;
	private final ModelRenderer gun22;
	private final ModelRenderer gun23;
	private final ModelRenderer gun21;
	private final ModelRenderer gun20;
	private final ModelRenderer gun19;
	private final ModelRenderer gun18;
	private final ModelRenderer gun17;
	private final ModelRenderer gun16;
	private final ModelRenderer gun10;
	private final ModelRenderer gun11;
	private final ModelRenderer gun13;
	private final ModelRenderer gun12;
	private final ModelRenderer dustcover;
	private final ModelRenderer dustcover_r1;
	private final ModelRenderer dustcover_r2;
	private final ModelRenderer cube_r13_r2;
	private final ModelRenderer cube_r15_r3;
	private final ModelRenderer cube_r13_r3;
	private final ModelRenderer cube_r9_r4;
	private final ModelRenderer cube_r8_r2;
	private final ModelRenderer cube_r12_r2;
	private final ModelRenderer cube_r8_r3;
	private final ModelRenderer cube_r7_r1;
	private final ModelRenderer cube_r13_r4;
	private final ModelRenderer cube_r11_r3;
	private final ModelRenderer cube_r10_r5;
	private final ModelRenderer cube_r12_r3;
	private final ModelRenderer cube_r9_r5;
	private final ModelRenderer cube_r9_r7_r1;
	private final ModelRenderer cube_r9_r6_r1;
	private final ModelRenderer cube_r11_r4;
	private final ModelRenderer cube_r11_r6_r1;
	private final ModelRenderer cube_r11_r5_r1;
	private final ModelRenderer cube_r10_r6;
	private final ModelRenderer cube_r8_r4;
	private final ModelRenderer gun118;
	private final ModelRenderer gun124_r1;
	private final ModelRenderer gun122_r1;
	private final ModelRenderer gun122_r2;
	private final ModelRenderer gun121_r1;
	private final ModelRenderer gun123_r1;
	private final ModelRenderer gun123;
	private final ModelRenderer gun127_r1;
	private final ModelRenderer gun126_r1;
	private final ModelRenderer gun126_r2;
	private final ModelRenderer gun125_r1;
	private final ModelRenderer gun119;
	private final ModelRenderer gun123_r2;
	private final ModelRenderer gun125_r2;
	private final ModelRenderer gun123_r3;
	private final ModelRenderer gun122_r3;
	private final ModelRenderer gun124_r2;
	private final ModelRenderer gun142;
	private final ModelRenderer gun146_r1;
	private final ModelRenderer gun145_r1;
	private final ModelRenderer gun145_r2;
	private final ModelRenderer gun144_r1;
	private final ModelRenderer gun116;
	private final ModelRenderer gun117_r1;
	private final ModelRenderer gun116_r1;
	private final ModelRenderer gun120_r1;
	private final ModelRenderer gun120_r2;
	private final ModelRenderer gun120_r3;
	private final ModelRenderer gun119_r1;
	private final ModelRenderer barrel3;
	private final ModelRenderer barrel4;
	private final ModelRenderer bone24;
	private final ModelRenderer cube_r46;
	private final ModelRenderer cube_r47;
	private final ModelRenderer bone25;
	private final ModelRenderer cube_r48;
	private final ModelRenderer cube_r49;
	private final ModelRenderer bone26;
	private final ModelRenderer cube_r50;
	private final ModelRenderer cube_r51;
	private final ModelRenderer cube_r52;
	private final ModelRenderer bone27;
	private final ModelRenderer cube_r53;
	private final ModelRenderer cube_r79;
	private final ModelRenderer barrelouter5;
	private final ModelRenderer bone28;
	private final ModelRenderer cube_r80;
	private final ModelRenderer cube_r81;
	private final ModelRenderer bone29;
	private final ModelRenderer cube_r82;
	private final ModelRenderer cube_r83;
	private final ModelRenderer bone30;
	private final ModelRenderer cube_r84;
	private final ModelRenderer cube_r85;
	private final ModelRenderer bone31;
	private final ModelRenderer cube_r86;
	private final ModelRenderer cube_r87;
	private final ModelRenderer barrelouter6;
	private final ModelRenderer bone32;
	private final ModelRenderer cube_r88;
	private final ModelRenderer cube_r89;
	private final ModelRenderer bone33;
	private final ModelRenderer cube_r90;
	private final ModelRenderer cube_r91;
	private final ModelRenderer bone34;
	private final ModelRenderer cube_r92;
	private final ModelRenderer cube_r93;
	private final ModelRenderer bone35;
	private final ModelRenderer cube_r94;
	private final ModelRenderer cube_r95;
	private final ModelRenderer barrelouter7;
	private final ModelRenderer bone36;
	private final ModelRenderer cube_r96;
	private final ModelRenderer cube_r97;
	private final ModelRenderer bone37;
	private final ModelRenderer cube_r98;
	private final ModelRenderer cube_r99;
	private final ModelRenderer bone38;
	private final ModelRenderer cube_r100;
	private final ModelRenderer cube_r101;
	private final ModelRenderer bone39;
	private final ModelRenderer cube_r102;
	private final ModelRenderer cube_r103;
	private final ModelRenderer barrelouter8;
	private final ModelRenderer bone40;
	private final ModelRenderer cube_r104;
	private final ModelRenderer cube_r105;
	private final ModelRenderer bone41;
	private final ModelRenderer cube_r106;
	private final ModelRenderer cube_r107;
	private final ModelRenderer bone42;
	private final ModelRenderer cube_r108;
	private final ModelRenderer cube_r109;
	private final ModelRenderer bone43;
	private final ModelRenderer cube_r110;
	private final ModelRenderer cube_r111;
	private final ModelRenderer ironsights2;
	private final ModelRenderer ironsights_r1;
	private final ModelRenderer ironsights_r2;
	private final ModelRenderer ironsights_r3;
	private final ModelRenderer ironsights_r4;
	private final ModelRenderer ironsights_r5;
	private final ModelRenderer ironsights_r6;
	private final ModelRenderer ironsights_r7;
	private final ModelRenderer ironsights_r8;
	private final ModelRenderer cube_r112;
	private final ModelRenderer cube_r113;
	private final ModelRenderer cube_r114;
	private final ModelRenderer cube_r115;
	private final ModelRenderer cube_r46_r1;
	private final ModelRenderer stock;
	private final ModelRenderer gun365;
	private final ModelRenderer gun244;
	private final ModelRenderer gun243;
	private final ModelRenderer gun242;
	private final ModelRenderer gun241;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;

	public K50M() {
		textureWidth = 256;
		textureHeight = 256;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		gun.addChild(body);
		

		cube_r12_r1 = new ModelRenderer(this);
		cube_r12_r1.setRotationPoint(-32.9089F, -40.383F, 1.8786F);
		body.addChild(cube_r12_r1);
		setRotationAngle(cube_r12_r1, 0.0F, 0.0F, 1.5708F);
		cube_r12_r1.cubeList.add(new ModelBox(cube_r12_r1, 142, 42, 8.4885F, -29.6837F, -36.6F, 1, 1, 1, 0.0F, false));

		cube_r14_r1 = new ModelRenderer(this);
		cube_r14_r1.setRotationPoint(8.2748F, -32.9945F, -18.7214F);
		body.addChild(cube_r14_r1);
		setRotationAngle(cube_r14_r1, 0.0F, 0.0F, 1.5708F);
		cube_r14_r1.cubeList.add(new ModelBox(cube_r14_r1, 173, 28, 1.1F, 9.3F, -16.0F, 1, 3, 1, 0.0F, false));

		cube_r15_r1 = new ModelRenderer(this);
		cube_r15_r1.setRotationPoint(-10.2252F, -32.9945F, -18.7214F);
		body.addChild(cube_r15_r1);
		setRotationAngle(cube_r15_r1, 0.0F, 0.0F, 1.5708F);
		cube_r15_r1.cubeList.add(new ModelBox(cube_r15_r1, 173, 28, 1.1F, -11.0F, -16.0F, 1, 2, 1, 0.0F, false));

		cube_r9_r1 = new ModelRenderer(this);
		cube_r9_r1.setRotationPoint(-27.4089F, -22.406F, 1.8286F);
		body.addChild(cube_r9_r1);
		setRotationAngle(cube_r9_r1, 0.0F, 0.0F, 1.5708F);
		cube_r9_r1.cubeList.add(new ModelBox(cube_r9_r1, 92, 44, -9.4885F, -28.6837F, -36.55F, 1, 1, 1, 0.0F, false));

		cube_r15_r2 = new ModelRenderer(this);
		cube_r15_r2.setRotationPoint(-10.2252F, -33.0028F, -11.5422F);
		body.addChild(cube_r15_r2);
		setRotationAngle(cube_r15_r2, 0.0F, 0.0F, 1.5708F);
		cube_r15_r2.cubeList.add(new ModelBox(cube_r15_r2, 164, 19, -4.6F, -11.0F, 1.925F, 1, 2, 10, 0.0F, false));
		cube_r15_r2.cubeList.add(new ModelBox(cube_r15_r2, 164, 19, 1.1F, -11.0F, -17.0F, 1, 2, 10, 0.0F, false));
		cube_r15_r2.cubeList.add(new ModelBox(cube_r15_r2, 153, 8, 1.1F, -11.0F, -7.0F, 1, 2, 21, 0.0F, false));

		cube_r14_r2 = new ModelRenderer(this);
		cube_r14_r2.setRotationPoint(8.2748F, -33.0028F, -11.5422F);
		body.addChild(cube_r14_r2);
		setRotationAngle(cube_r14_r2, 0.0F, 0.0F, 1.5708F);
		cube_r14_r2.cubeList.add(new ModelBox(cube_r14_r2, 164, 19, -4.6F, 9.3F, 1.925F, 1, 3, 10, 0.0F, false));
		cube_r14_r2.cubeList.add(new ModelBox(cube_r14_r2, 164, 19, 1.1F, 9.3F, -17.0F, 1, 3, 10, 0.0F, false));
		cube_r14_r2.cubeList.add(new ModelBox(cube_r14_r2, 153, 8, 1.1F, 9.3F, -7.0F, 1, 3, 21, 0.0F, false));

		cube_r13_r1 = new ModelRenderer(this);
		cube_r13_r1.setRotationPoint(-1.4752F, -46.1921F, -19.0962F);
		body.addChild(cube_r13_r1);
		setRotationAngle(cube_r13_r1, -3.1416F, 1.4399F, -1.5708F);
		cube_r13_r1.cubeList.add(new ModelBox(cube_r13_r1, 119, 90, 5.5F, 1.75F, 10.6F, 8, 1, 1, 0.0F, false));
		cube_r13_r1.cubeList.add(new ModelBox(cube_r13_r1, 163, 29, 5.5F, -2.75F, 10.6F, 8, 1, 1, 0.0F, false));

		cube_r14_r3 = new ModelRenderer(this);
		cube_r14_r3.setRotationPoint(-1.4752F, -47.053F, -17.9743F);
		body.addChild(cube_r14_r3);
		setRotationAngle(cube_r14_r3, -3.1416F, 1.4399F, -1.5708F);
		cube_r14_r3.cubeList.add(new ModelBox(cube_r14_r3, 77, 152, 6.5F, 1.75F, 12.4F, 2, 1, 4, 0.0F, false));
		cube_r14_r3.cubeList.add(new ModelBox(cube_r14_r3, 75, 150, 6.5F, -2.75F, 12.4F, 2, 5, 4, 0.0F, false));

		cube_r14_r4 = new ModelRenderer(this);
		cube_r14_r4.setRotationPoint(-2.4752F, -34.3414F, -34.4374F);
		body.addChild(cube_r14_r4);
		setRotationAngle(cube_r14_r4, 0.0F, 1.4835F, 1.5708F);
		cube_r14_r4.cubeList.add(new ModelBox(cube_r14_r4, 76, 151, -0.5F, 0.75F, -2.5F, 1, 1, 5, 0.0F, false));
		cube_r14_r4.cubeList.add(new ModelBox(cube_r14_r4, 74, 149, -0.5F, -3.75F, -2.5F, 1, 5, 5, 0.0F, false));

		cube_r10_r1 = new ModelRenderer(this);
		cube_r10_r1.setRotationPoint(-1.4752F, -46.3921F, -20.1962F);
		body.addChild(cube_r10_r1);
		setRotationAngle(cube_r10_r1, -3.1416F, 1.4399F, -1.5708F);
		cube_r10_r1.cubeList.add(new ModelBox(cube_r10_r1, 74, 149, 11.5F, -2.75F, 11.4F, 1, 5, 5, 0.0F, false));
		cube_r10_r1.cubeList.add(new ModelBox(cube_r10_r1, 76, 151, 11.5F, 1.75F, 11.4F, 1, 1, 5, 0.0F, false));

		cube_r8_r1 = new ModelRenderer(this);
		cube_r8_r1.setRotationPoint(-27.4089F, -22.4143F, 9.0078F);
		body.addChild(cube_r8_r1);
		setRotationAngle(cube_r8_r1, 0.0F, 0.0F, 1.5708F);
		cube_r8_r1.cubeList.add(new ModelBox(cube_r8_r1, 64, 15, -9.4885F, -28.6837F, -37.55F, 1, 1, 31, 0.0F, false));

		cube_r6_r1 = new ModelRenderer(this);
		cube_r6_r1.setRotationPoint(-27.9089F, -82.4059F, 9.01F);
		body.addChild(cube_r6_r1);
		setRotationAngle(cube_r6_r1, 0.0F, 0.0F, 1.5708F);
		cube_r6_r1.cubeList.add(new ModelBox(cube_r6_r1, 65, 17, 48.5115F, -29.1837F, -36.5F, 2, 1, 29, 0.0F, false));

		cube_r11_r1 = new ModelRenderer(this);
		cube_r11_r1.setRotationPoint(7.2748F, -34.3159F, 1.0474F);
		body.addChild(cube_r11_r1);
		setRotationAngle(cube_r11_r1, 0.0F, -0.3491F, 1.5708F);
		cube_r11_r1.cubeList.add(new ModelBox(cube_r11_r1, 75, 152, -3.2988F, 10.5F, -0.4775F, 3, 1, 1, 0.0F, false));
		cube_r11_r1.cubeList.add(new ModelBox(cube_r11_r1, 120, 186, -0.2988F, 10.5F, -0.4775F, 3, 1, 1, 0.0F, false));

		cube_r10_r2 = new ModelRenderer(this);
		cube_r10_r2.setRotationPoint(-1.2252F, -34.3159F, 1.0474F);
		body.addChild(cube_r10_r2);
		setRotationAngle(cube_r10_r2, 0.0F, -0.3491F, 1.5708F);
		cube_r10_r2.cubeList.add(new ModelBox(cube_r10_r2, 75, 152, -3.2988F, -2.5F, -0.4775F, 3, 5, 1, 0.0F, false));
		cube_r10_r2.cubeList.add(new ModelBox(cube_r10_r2, 120, 186, -0.2988F, -2.5F, -0.4775F, 3, 5, 1, 0.0F, false));

		cube_r11_r2 = new ModelRenderer(this);
		cube_r11_r2.setRotationPoint(-32.9089F, -40.3912F, 9.0578F);
		body.addChild(cube_r11_r2);
		setRotationAngle(cube_r11_r2, 0.0F, 0.0F, 1.5708F);
		cube_r11_r2.cubeList.add(new ModelBox(cube_r11_r2, 112, 13, 8.4885F, -29.6837F, -37.6F, 1, 1, 31, 0.0F, false));

		cube_r9_r2 = new ModelRenderer(this);
		cube_r9_r2.setRotationPoint(-32.3941F, -100.3537F, 9.01F);
		body.addChild(cube_r9_r2);
		setRotationAngle(cube_r9_r2, 0.0F, 0.0F, 1.5708F);
		cube_r9_r2.cubeList.add(new ModelBox(cube_r9_r2, 113, 15, 66.4885F, -29.1837F, -36.5F, 2, 1, 29, 0.0F, false));

		cube_r9_r3 = new ModelRenderer(this);
		cube_r9_r3.setRotationPoint(0.7748F, -36.8944F, -5.49F);
		body.addChild(cube_r9_r3);
		setRotationAngle(cube_r9_r3, 0.0F, 0.0F, 1.5708F);
		cube_r9_r3.cubeList.add(new ModelBox(cube_r9_r3, 87, 85, -0.7F, -0.5F, -29.1F, 1, 1, 7, 0.0F, false));
		cube_r9_r3.cubeList.add(new ModelBox(cube_r9_r3, 66, 64, -0.7F, -0.5F, -22.1F, 2, 1, 28, 0.0F, false));

		cube_r10_r3 = new ModelRenderer(this);
		cube_r10_r3.setRotationPoint(-3.7104F, -36.8652F, -5.49F);
		body.addChild(cube_r10_r3);
		setRotationAngle(cube_r10_r3, 0.0F, 0.0F, 1.5708F);
		cube_r10_r3.cubeList.add(new ModelBox(cube_r10_r3, 168, 34, -0.7F, -0.5F, -29.1F, 1, 1, 7, 0.0F, false));
		cube_r10_r3.cubeList.add(new ModelBox(cube_r10_r3, 114, 16, -0.7F, -0.5F, -22.1F, 2, 1, 28, 0.0F, false));

		cube_r6_r2 = new ModelRenderer(this);
		cube_r6_r2.setRotationPoint(0.7748F, -34.8944F, -5.49F);
		body.addChild(cube_r6_r2);
		setRotationAngle(cube_r6_r2, 0.0F, 0.0F, 1.5708F);
		cube_r6_r2.cubeList.add(new ModelBox(cube_r6_r2, 66, 18, -1.0F, -0.5F, -21.7F, 2, 1, 28, 0.0F, false));

		cube_r10_r4 = new ModelRenderer(this);
		cube_r10_r4.setRotationPoint(-3.7104F, -34.8652F, -5.49F);
		body.addChild(cube_r10_r4);
		setRotationAngle(cube_r10_r4, 0.0F, 0.0F, 1.5708F);
		cube_r10_r4.cubeList.add(new ModelBox(cube_r10_r4, 114, 63, -1.0F, -0.5F, -21.7F, 2, 1, 28, 0.0F, false));

		cube_r2_r1 = new ModelRenderer(this);
		cube_r2_r1.setRotationPoint(3.6103F, 15.2901F, 5.91F);
		body.addChild(cube_r2_r1);
		setRotationAngle(cube_r2_r1, 0.0F, 0.0F, 1.5708F);
		cube_r2_r1.cubeList.add(new ModelBox(cube_r2_r1, 75, 154, -52.8553F, 6.8207F, -42.5F, 3, 1, 3, 0.0F, false));

		cube_r3_r1 = new ModelRenderer(this);
		cube_r3_r1.setRotationPoint(8.0955F, -33.4497F, 5.91F);
		body.addChild(cube_r3_r1);
		setRotationAngle(cube_r3_r1, 0.0F, 0.0F, 1.5708F);
		cube_r3_r1.cubeList.add(new ModelBox(cube_r3_r1, 74, 150, -4.1447F, 6.8207F, -42.5F, 3, 1, 3, 0.0F, false));

		gun113 = new ModelRenderer(this);
		gun113.setRotationPoint(-2.0F, -28.0F, -9.7F);
		body.addChild(gun113);
		setRotationAngle(gun113, -2.6397F, 0.0F, 0.0F);
		gun113.cubeList.add(new ModelBox(gun113, 134, 4, -0.001F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun112 = new ModelRenderer(this);
		gun112.setRotationPoint(-2.0F, -28.7F, -9.1F);
		body.addChild(gun112);
		setRotationAngle(gun112, -2.3051F, 0.0F, 0.0F);
		gun112.cubeList.add(new ModelBox(gun112, 134, 4, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun111 = new ModelRenderer(this);
		gun111.setRotationPoint(-2.0F, -31.8F, -9.0F);
		body.addChild(gun111);
		setRotationAngle(gun111, -0.3718F, 0.0F, 0.0F);
		gun111.cubeList.add(new ModelBox(gun111, 174, 95, -0.001F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

		gun113_r1 = new ModelRenderer(this);
		gun113_r1.setRotationPoint(0.499F, 4.161F, -4.1148F);
		gun111.addChild(gun113_r1);
		setRotationAngle(gun113_r1, -1.2217F, 0.0F, 0.0F);
		gun113_r1.cubeList.add(new ModelBox(gun113_r1, 173, 95, -1.0F, 10.4969F, -1.9772F, 2, 3, 1, 0.4F, false));
		gun113_r1.cubeList.add(new ModelBox(gun113_r1, 174, 95, -0.5F, -1.5F, -2.25F, 1, 3, 1, 0.4F, false));

		gun110 = new ModelRenderer(this);
		gun110.setRotationPoint(-2.0F, -31.2F, -10.5F);
		body.addChild(gun110);
		setRotationAngle(gun110, 0.4461F, 0.0F, 0.0F);
		gun110.cubeList.add(new ModelBox(gun110, 172, 28, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun112_r1 = new ModelRenderer(this);
		gun112_r1.setRotationPoint(0.5F, 1.0F, -4.5F);
		gun110.addChild(gun112_r1);
		setRotationAngle(gun112_r1, -0.48F, 0.0F, 0.0F);
		gun112_r1.cubeList.add(new ModelBox(gun112_r1, 172, 27, -1.0F, -1.5937F, -13.6931F, 2, 4, 1, 0.0F, false));
		gun112_r1.cubeList.add(new ModelBox(gun112_r1, 172, 28, -0.5F, -2.0F, -0.7F, 1, 2, 1, 0.0F, false));

		gun22 = new ModelRenderer(this);
		gun22.setRotationPoint(-0.8F, -25.8F, -14.5F);
		body.addChild(gun22);
		setRotationAngle(gun22, 2.4538F, 0.0F, 0.0F);
		gun22.cubeList.add(new ModelBox(gun22, 98, 39, 0.0F, -1.9045F, 2.3179F, 1, 1, 1, 0.0F, false));

		gun23 = new ModelRenderer(this);
		gun23.setRotationPoint(-3.2F, -25.8F, -14.5F);
		body.addChild(gun23);
		setRotationAngle(gun23, 2.4538F, 0.0F, 0.0F);
		gun23.cubeList.add(new ModelBox(gun23, 170, 29, 0.0F, -1.9045F, 2.3179F, 3, 1, 1, 0.0F, false));

		gun21 = new ModelRenderer(this);
		gun21.setRotationPoint(-0.8F, -26.8F, -15.5F);
		body.addChild(gun21);
		setRotationAngle(gun21, 0.7436F, 0.0F, 0.0F);
		gun21.cubeList.add(new ModelBox(gun21, 184, 29, -0.001F, -2.0308F, -2.2091F, 1, 1, 1, 0.0F, false));

		gun20 = new ModelRenderer(this);
		gun20.setRotationPoint(-3.2F, -26.8F, -15.5F);
		body.addChild(gun20);
		setRotationAngle(gun20, 0.7436F, 0.0F, 0.0F);
		gun20.cubeList.add(new ModelBox(gun20, 158, 29, -0.001F, -2.0308F, -2.2081F, 3, 1, 1, 0.0F, false));

		gun19 = new ModelRenderer(this);
		gun19.setRotationPoint(-0.8F, -31.8F, -15.5F);
		body.addChild(gun19);
		gun19.cubeList.add(new ModelBox(gun19, 37, 78, 0.001F, 0.0F, -3.001F, 1, 5, 1, 0.0F, false));

		gun18 = new ModelRenderer(this);
		gun18.setRotationPoint(-3.2F, -31.8F, -15.5F);
		body.addChild(gun18);
		gun18.cubeList.add(new ModelBox(gun18, 35, 79, 0.0F, 0.0F, -3.0F, 3, 5, 1, 0.0F, false));

		gun17 = new ModelRenderer(this);
		gun17.setRotationPoint(-3.2F, -26.8F, -14.5F);
		body.addChild(gun17);
		gun17.cubeList.add(new ModelBox(gun17, 146, 96, 0.0F, 0.0F, -3.0F, 3, 1, 10, 0.0F, false));

		gun16 = new ModelRenderer(this);
		gun16.setRotationPoint(-0.8F, -26.8F, -14.5F);
		body.addChild(gun16);
		gun16.cubeList.add(new ModelBox(gun16, 69, 114, 0.001F, -0.001F, -3.0F, 1, 1, 10, 0.0F, false));

		gun10 = new ModelRenderer(this);
		gun10.setRotationPoint(-0.8F, -26.5F, -6.7F);
		body.addChild(gun10);
		setRotationAngle(gun10, -2.3423F, 0.0F, 0.0F);
		gun10.cubeList.add(new ModelBox(gun10, 99, 49, 0.0F, -0.001F, 0.0F, 1, 1, 1, 0.0F, false));

		gun11 = new ModelRenderer(this);
		gun11.setRotationPoint(-3.2F, -26.5F, -6.7F);
		body.addChild(gun11);
		setRotationAngle(gun11, -2.3423F, 0.0F, 0.0F);
		gun11.cubeList.add(new ModelBox(gun11, 181, 121, -0.001F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun13 = new ModelRenderer(this);
		gun13.setRotationPoint(-0.8F, -31.5F, -7.5F);
		body.addChild(gun13);
		gun13.cubeList.add(new ModelBox(gun13, 68, 119, 0.001F, 0.0F, -0.001F, 1, 5, 1, 0.0F, false));

		gun12 = new ModelRenderer(this);
		gun12.setRotationPoint(-3.2F, -31.5F, -7.5F);
		body.addChild(gun12);
		gun12.cubeList.add(new ModelBox(gun12, 118, 185, 0.0F, 0.0F, 0.0F, 3, 5, 1, 0.0F, false));

		dustcover = new ModelRenderer(this);
		dustcover.setRotationPoint(0.0F, 54.8F, 0.0F);
		gun.addChild(dustcover);
		dustcover.cubeList.add(new ModelBox(dustcover, 39, 85, -3.0514F, -95.0199F, -39.49F, 2, 1, 6, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 39, 85, -3.3014F, -95.2199F, -11.49F, 2, 1, 6, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 40, 86, -2.0014F, -95.8199F, -11.49F, 1, 1, 5, -0.2F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 24, 24, -3.0514F, -95.0199F, -27.49F, 2, 1, 21, 0.0F, false));

		dustcover_r1 = new ModelRenderer(this);
		dustcover_r1.setRotationPoint(-1.8389F, -93.3057F, -0.5758F);
		dustcover.addChild(dustcover_r1);
		setRotationAngle(dustcover_r1, -1.5708F, 0.0F, 0.0F);
		dustcover_r1.cubeList.add(new ModelBox(dustcover_r1, 43, 89, -1.4625F, 3.5F, -0.5F, 2, 1, 2, 0.0F, false));

		dustcover_r2 = new ModelRenderer(this);
		dustcover_r2.setRotationPoint(-1.8389F, -94.5128F, -1.49F);
		dustcover.addChild(dustcover_r2);
		setRotationAngle(dustcover_r2, -0.7854F, 0.0F, 0.0F);
		dustcover_r2.cubeList.add(new ModelBox(dustcover_r2, 43, 89, -1.4625F, 2.3284F, -3.3284F, 2, 1, 2, 0.0F, false));

		cube_r13_r2 = new ModelRenderer(this);
		cube_r13_r2.setRotationPoint(-1.9913F, -93.3811F, -49.7037F);
		dustcover.addChild(cube_r13_r2);
		setRotationAngle(cube_r13_r2, 0.0F, 0.0F, 1.5708F);
		cube_r13_r2.cubeList.add(new ModelBox(cube_r13_r2, 93, 91, 0.823F, -2.4112F, -1.0F, 1, 1, 1, 0.0F, false));
		cube_r13_r2.cubeList.add(new ModelBox(cube_r13_r2, 93, 91, 0.323F, -2.4112F, -1.0F, 1, 1, 1, 0.0F, false));

		cube_r15_r3 = new ModelRenderer(this);
		cube_r15_r3.setRotationPoint(-0.9816F, -93.3811F, -49.7037F);
		dustcover.addChild(cube_r15_r3);
		setRotationAngle(cube_r15_r3, 0.0F, 0.0F, 1.5708F);
		cube_r15_r3.cubeList.add(new ModelBox(cube_r15_r3, 142, 90, 0.9525F, 1.4112F, -1.0F, 1, 1, 1, 0.0F, false));
		cube_r15_r3.cubeList.add(new ModelBox(cube_r15_r3, 142, 90, 0.3525F, 1.4112F, -1.0F, 1, 1, 1, 0.0F, false));

		cube_r13_r3 = new ModelRenderer(this);
		cube_r13_r3.setRotationPoint(-1.4864F, -93.6674F, -45.49F);
		dustcover.addChild(cube_r13_r3);
		setRotationAngle(cube_r13_r3, 0.0F, 0.0F, 1.5708F);
		cube_r13_r3.cubeList.add(new ModelBox(cube_r13_r3, 141, 89, 0.3525F, 1.4112F, -1.0F, 1, 1, 2, 0.0F, false));
		cube_r13_r3.cubeList.add(new ModelBox(cube_r13_r3, 92, 90, 0.323F, -2.4112F, -1.0F, 1, 1, 2, 0.0F, false));

		cube_r9_r4 = new ModelRenderer(this);
		cube_r9_r4.setRotationPoint(-1.0659F, -93.2573F, -49.7515F);
		dustcover.addChild(cube_r9_r4);
		cube_r9_r4.cubeList.add(new ModelBox(cube_r9_r4, 44, 90, -1.5649F, -1.3525F, -1.0F, 2, 1, 1, 0.0F, false));

		cube_r8_r2 = new ModelRenderer(this);
		cube_r8_r2.setRotationPoint(-1.4864F, -93.6674F, -45.49F);
		dustcover.addChild(cube_r8_r2);
		cube_r8_r2.cubeList.add(new ModelBox(cube_r8_r2, 43, 89, -1.5649F, -1.3525F, -1.0F, 2, 1, 2, 0.0F, false));

		cube_r12_r2 = new ModelRenderer(this);
		cube_r12_r2.setRotationPoint(-1.4864F, -90.9919F, -45.49F);
		dustcover.addChild(cube_r12_r2);
		setRotationAngle(cube_r12_r2, 0.0F, 0.0F, -1.5708F);
		cube_r12_r2.cubeList.add(new ModelBox(cube_r12_r2, 141, 89, 0.3525F, 1.4112F, -1.0F, 1, 1, 2, 0.0F, false));
		cube_r12_r2.cubeList.add(new ModelBox(cube_r12_r2, 92, 90, 0.323F, -2.4112F, -1.0F, 1, 1, 2, 0.0F, false));
		cube_r12_r2.cubeList.add(new ModelBox(cube_r12_r2, 88, 86, 0.323F, -2.4112F, 6.0F, 1, 1, 6, 0.0F, false));
		cube_r12_r2.cubeList.add(new ModelBox(cube_r12_r2, 137, 85, 0.3525F, 1.4112F, 6.0F, 1, 1, 6, 0.0F, false));

		cube_r8_r3 = new ModelRenderer(this);
		cube_r8_r3.setRotationPoint(-1.9347F, -91.6591F, -49.8763F);
		dustcover.addChild(cube_r8_r3);
		setRotationAngle(cube_r8_r3, 0.0F, 0.0F, -3.1416F);
		cube_r8_r3.cubeList.add(new ModelBox(cube_r8_r3, 44, 90, -1.5649F, -1.3525F, -1.0F, 2, 1, 1, 0.0F, false));

		cube_r7_r1 = new ModelRenderer(this);
		cube_r7_r1.setRotationPoint(-1.4864F, -90.9919F, -45.49F);
		dustcover.addChild(cube_r7_r1);
		setRotationAngle(cube_r7_r1, 0.0F, 0.0F, -3.1416F);
		cube_r7_r1.cubeList.add(new ModelBox(cube_r7_r1, 43, 89, -1.5649F, -1.3525F, -1.0F, 2, 1, 2, 0.0F, false));
		cube_r7_r1.cubeList.add(new ModelBox(cube_r7_r1, 39, 85, -1.5649F, -1.3525F, 6.0F, 2, 1, 6, 0.0F, false));

		cube_r13_r4 = new ModelRenderer(this);
		cube_r13_r4.setRotationPoint(-37.8976F, -144.2149F, -95.89F);
		dustcover.addChild(cube_r13_r4);
		setRotationAngle(cube_r13_r4, 0.0F, 0.0F, 1.5708F);
		

		cube_r11_r3 = new ModelRenderer(this);
		cube_r11_r3.setRotationPoint(-34.2752F, -147.6444F, -96.89F);
		dustcover.addChild(cube_r11_r3);
		setRotationAngle(cube_r11_r3, 0.0F, 0.0F, 1.5708F);
		

		cube_r10_r5 = new ModelRenderer(this);
		cube_r10_r5.setRotationPoint(-34.1752F, -148.2444F, -97.39F);
		dustcover.addChild(cube_r10_r5);
		setRotationAngle(cube_r10_r5, 0.0F, 0.0F, 1.5708F);
		

		cube_r12_r3 = new ModelRenderer(this);
		cube_r12_r3.setRotationPoint(-37.9976F, -144.8149F, -96.39F);
		dustcover.addChild(cube_r12_r3);
		setRotationAngle(cube_r12_r3, 0.0F, 0.0F, 1.5708F);
		

		cube_r9_r5 = new ModelRenderer(this);
		cube_r9_r5.setRotationPoint(-33.9252F, -148.7444F, -97.99F);
		dustcover.addChild(cube_r9_r5);
		setRotationAngle(cube_r9_r5, 0.0F, 0.0F, 1.5708F);
		cube_r9_r5.cubeList.add(new ModelBox(cube_r9_r5, 88, 86, 55.2F, -35.1F, 86.5F, 2, 1, 6, 0.0F, false));

		cube_r9_r7_r1 = new ModelRenderer(this);
		cube_r9_r7_r1.setRotationPoint(55.9386F, -33.816F, 95.6642F);
		cube_r9_r5.addChild(cube_r9_r7_r1);
		setRotationAngle(cube_r9_r7_r1, -0.5236F, 0.0F, 0.0F);
		cube_r9_r7_r1.cubeList.add(new ModelBox(cube_r9_r7_r1, 93, 91, -1.0F, 0.5F, -2.732F, 2, 1, 1, 0.0F, false));

		cube_r9_r6_r1 = new ModelRenderer(this);
		cube_r9_r6_r1.setRotationPoint(56.2F, -34.167F, 97.116F);
		cube_r9_r5.addChild(cube_r9_r6_r1);
		setRotationAngle(cube_r9_r6_r1, -0.5236F, 0.0F, 0.0F);
		cube_r9_r6_r1.cubeList.add(new ModelBox(cube_r9_r6_r1, 93, 91, -1.0F, 1.5F, -4.4641F, 2, 1, 1, 0.0F, false));

		cube_r11_r4 = new ModelRenderer(this);
		cube_r11_r4.setRotationPoint(-38.2476F, -145.3149F, -96.99F);
		dustcover.addChild(cube_r11_r4);
		setRotationAngle(cube_r11_r4, 0.0F, 0.0F, 1.5708F);
		cube_r11_r4.cubeList.add(new ModelBox(cube_r11_r4, 168, 116, 51.8F, -35.1F, 85.5F, 2, 1, 6, 0.0F, false));

		cube_r11_r6_r1 = new ModelRenderer(this);
		cube_r11_r6_r1.setRotationPoint(52.5091F, -35.3794F, 94.6642F);
		cube_r11_r4.addChild(cube_r11_r6_r1);
		setRotationAngle(cube_r11_r6_r1, 0.5236F, 0.0F, 0.0F);
		cube_r11_r6_r1.cubeList.add(new ModelBox(cube_r11_r6_r1, 173, 121, -1.0F, -1.5F, -2.732F, 2, 1, 1, 0.0F, false));

		cube_r11_r5_r1 = new ModelRenderer(this);
		cube_r11_r5_r1.setRotationPoint(52.8F, -35.033F, 96.116F);
		cube_r11_r4.addChild(cube_r11_r5_r1);
		setRotationAngle(cube_r11_r5_r1, 0.5236F, 0.0F, 0.0F);
		cube_r11_r5_r1.cubeList.add(new ModelBox(cube_r11_r5_r1, 173, 121, -1.0F, -2.5F, -4.4641F, 2, 1, 1, 0.0F, false));

		cube_r10_r6 = new ModelRenderer(this);
		cube_r10_r6.setRotationPoint(-37.9976F, -145.1149F, -128.99F);
		dustcover.addChild(cube_r10_r6);
		setRotationAngle(cube_r10_r6, 0.0F, 0.0F, 1.5708F);
		cube_r10_r6.cubeList.add(new ModelBox(cube_r10_r6, 129, 77, 51.8F, -35.1F, 89.5F, 1, 1, 14, 0.0F, false));

		cube_r8_r4 = new ModelRenderer(this);
		cube_r8_r4.setRotationPoint(-34.1752F, -148.5444F, -129.99F);
		dustcover.addChild(cube_r8_r4);
		setRotationAngle(cube_r8_r4, 0.0F, 0.0F, 1.5708F);
		cube_r8_r4.cubeList.add(new ModelBox(cube_r8_r4, 61, 59, 55.2F, -35.1F, 90.5F, 1, 1, 33, 0.0F, false));

		gun118 = new ModelRenderer(this);
		gun118.setRotationPoint(-1.0F, -39.2F, -26.5F);
		dustcover.addChild(gun118);
		setRotationAngle(gun118, 0.0F, 0.0F, 0.4461F);
		

		gun124_r1 = new ModelRenderer(this);
		gun124_r1.setRotationPoint(-22.9245F, -49.7615F, -25.3948F);
		gun118.addChild(gun124_r1);
		setRotationAngle(gun124_r1, 0.1309F, 0.0F, 0.3054F);
		gun124_r1.cubeList.add(new ModelBox(gun124_r1, 173, 121, -0.5F, -0.2389F, 1.1829F, 1, 1, 1, 0.0F, false));
		gun124_r1.cubeList.add(new ModelBox(gun124_r1, 170, 118, -0.5F, -0.2389F, 1.4829F, 1, 1, 4, 0.0F, false));

		gun122_r1 = new ModelRenderer(this);
		gun122_r1.setRotationPoint(-24.0938F, -45.9798F, -25.4779F);
		gun118.addChild(gun122_r1);
		setRotationAngle(gun122_r1, 0.1552F, -0.0251F, -2.8438F);
		gun122_r1.cubeList.add(new ModelBox(gun122_r1, 169, 117, -0.7129F, -0.185F, 1.1667F, 1, 1, 5, 0.0F, false));

		gun122_r2 = new ModelRenderer(this);
		gun122_r2.setRotationPoint(-22.6445F, -46.2207F, -18.99F);
		gun118.addChild(gun122_r2);
		setRotationAngle(gun122_r2, 0.0F, 0.0F, 0.3054F);
		gun122_r2.cubeList.add(new ModelBox(gun122_r2, 167, 115, -1.8318F, -4.2453F, -1.0F, 1, 1, 7, 0.0F, false));

		gun121_r1 = new ModelRenderer(this);
		gun121_r1.setRotationPoint(-22.7845F, -46.5135F, -10.99F);
		gun118.addChild(gun121_r1);
		setRotationAngle(gun121_r1, 0.0F, 0.0F, -2.8362F);
		gun121_r1.cubeList.add(new ModelBox(gun121_r1, 167, 115, 0.2164F, -2.0533F, -9.0F, 1, 1, 7, 0.0F, false));
		gun121_r1.cubeList.add(new ModelBox(gun121_r1, 168, 116, 0.2164F, -2.0533F, -2.0F, 1, 1, 6, 0.0F, false));

		gun123_r1 = new ModelRenderer(this);
		gun123_r1.setRotationPoint(-22.7884F, -50.1931F, 1.26F);
		gun118.addChild(gun123_r1);
		setRotationAngle(gun123_r1, 0.0F, 0.0F, 0.3054F);
		gun123_r1.cubeList.add(new ModelBox(gun123_r1, 168, 116, -0.4539F, -0.8168F, 13.75F, 1, 1, 6, 0.0F, false));
		gun123_r1.cubeList.add(new ModelBox(gun123_r1, 162, 110, -0.5F, -0.5F, -14.25F, 1, 1, 12, 0.0F, false));
		gun123_r1.cubeList.add(new ModelBox(gun123_r1, 153, 101, -0.5F, -0.5F, -2.25F, 1, 1, 21, 0.0F, false));

		gun123 = new ModelRenderer(this);
		gun123.setRotationPoint(0.25F, -37.8F, -26.5F);
		dustcover.addChild(gun123);
		setRotationAngle(gun123, 0.0F, 0.0F, 1.45F);
		gun123.cubeList.add(new ModelBox(gun123, 79, 142, -56.0583F, -7.3631F, -12.99F, 1, 1, 24, 0.0F, false));
		gun123.cubeList.add(new ModelBox(gun123, 97, 160, -56.2267F, -7.6354F, 15.01F, 1, 1, 6, 0.0F, false));
		gun123.cubeList.add(new ModelBox(gun123, 94, 157, -56.0583F, -7.3631F, 11.01F, 1, 1, 9, 0.0F, false));

		gun127_r1 = new ModelRenderer(this);
		gun127_r1.setRotationPoint(-52.6786F, -4.036F, -19.2037F);
		gun123.addChild(gun127_r1);
		gun127_r1.cubeList.add(new ModelBox(gun127_r1, 102, 165, -3.1563F, -2.7914F, -5.0F, 1, 1, 1, 0.0F, false));

		gun126_r1 = new ModelRenderer(this);
		gun126_r1.setRotationPoint(-52.6914F, -4.6469F, -18.99F);
		gun123.addChild(gun126_r1);
		gun126_r1.cubeList.add(new ModelBox(gun126_r1, 101, 164, -3.3669F, -2.7162F, -1.0F, 1, 1, 2, 0.0F, false));

		gun126_r2 = new ModelRenderer(this);
		gun126_r2.setRotationPoint(-53.2664F, -3.2948F, -25.4779F);
		gun123.addChild(gun126_r2);
		setRotationAngle(gun126_r2, 0.1031F, -0.1189F, 3.1297F);
		gun126_r2.cubeList.add(new ModelBox(gun126_r2, 98, 161, 0.1009F, -0.3263F, 1.1667F, 1, 1, 5, 0.0F, false));

		gun125_r1 = new ModelRenderer(this);
		gun125_r1.setRotationPoint(-53.0136F, -4.686F, -10.99F);
		gun123.addChild(gun125_r1);
		setRotationAngle(gun125_r1, 0.0F, 0.0F, 3.1416F);
		gun125_r1.cubeList.add(new ModelBox(gun125_r1, 96, 159, -0.3888F, -2.3547F, -9.0F, 1, 1, 7, 0.0F, false));
		gun125_r1.cubeList.add(new ModelBox(gun125_r1, 97, 160, -0.3888F, -2.3547F, -2.0F, 1, 1, 6, 0.0F, false));

		gun119 = new ModelRenderer(this);
		gun119.setRotationPoint(-2.0F, -39.2F, -26.5F);
		dustcover.addChild(gun119);
		setRotationAngle(gun119, 0.0F, 0.0F, 1.0782F);
		

		gun123_r2 = new ModelRenderer(this);
		gun123_r2.setRotationPoint(-44.8269F, -26.222F, -25.477F);
		gun119.addChild(gun123_r2);
		setRotationAngle(gun123_r2, 0.0326F, -0.1538F, 2.8394F);
		gun123_r2.cubeList.add(new ModelBox(gun123_r2, 170, 115, -0.1854F, -0.7197F, 1.1667F, 1, 1, 5, 0.0F, false));

		gun125_r2 = new ModelRenderer(this);
		gun125_r2.setRotationPoint(-48.6217F, -25.2813F, -25.3948F);
		gun119.addChild(gun125_r2);
		setRotationAngle(gun125_r2, 0.0F, -0.1309F, -0.3054F);
		gun125_r2.cubeList.add(new ModelBox(gun125_r2, 174, 119, -0.2128F, -0.5F, 1.1812F, 1, 1, 1, 0.0F, false));
		gun125_r2.cubeList.add(new ModelBox(gun125_r2, 171, 116, -0.2128F, -0.5F, 1.6812F, 1, 1, 4, 0.0F, false));

		gun123_r3 = new ModelRenderer(this);
		gun123_r3.setRotationPoint(-45.1055F, -24.7922F, -18.99F);
		gun119.addChild(gun123_r3);
		setRotationAngle(gun123_r3, 0.0F, 0.0F, -0.3054F);
		gun123_r3.cubeList.add(new ModelBox(gun123_r3, 168, 113, -4.159F, -2.0238F, -1.0F, 1, 1, 7, 0.0F, false));

		gun122_r3 = new ModelRenderer(this);
		gun122_r3.setRotationPoint(-45.3914F, -24.9457F, -10.99F);
		gun119.addChild(gun122_r3);
		setRotationAngle(gun122_r3, 0.0F, 0.0F, 2.8362F);
		gun122_r3.cubeList.add(new ModelBox(gun122_r3, 168, 113, -2.0647F, 0.1242F, -9.0F, 1, 1, 7, 0.0F, false));
		gun122_r3.cubeList.add(new ModelBox(gun122_r3, 169, 114, -2.0647F, 0.1242F, -2.0F, 1, 1, 6, 0.0F, false));

		gun124_r2 = new ModelRenderer(this);
		gun124_r2.setRotationPoint(-49.0533F, -25.1452F, 1.26F);
		gun119.addChild(gun124_r2);
		setRotationAngle(gun124_r2, 0.0F, 0.0F, -0.3054F);
		gun124_r2.cubeList.add(new ModelBox(gun124_r2, 169, 114, -0.8186F, -0.4687F, 13.75F, 1, 1, 6, 0.0F, false));
		gun124_r2.cubeList.add(new ModelBox(gun124_r2, 163, 108, -0.5F, -0.5F, -14.25F, 1, 1, 12, 0.0F, false));
		gun124_r2.cubeList.add(new ModelBox(gun124_r2, 154, 99, -0.5F, -0.5F, -2.25F, 1, 1, 21, 0.0F, false));

		gun142 = new ModelRenderer(this);
		gun142.setRotationPoint(-3.2F, -37.8F, -14.5F);
		dustcover.addChild(gun142);
		setRotationAngle(gun142, 0.0F, 0.0F, 0.1487F);
		gun142.cubeList.add(new ModelBox(gun142, 220, 170, -8.9146F, -55.7989F, -24.99F, 1, 1, 15, 0.0F, false));
		gun142.cubeList.add(new ModelBox(gun142, 229, 179, -9.1915F, -55.9597F, 3.01F, 1, 1, 6, 0.0F, false));
		gun142.cubeList.add(new ModelBox(gun142, 222, 172, -8.9146F, -55.7989F, -4.99F, 1, 1, 13, 0.0F, false));
		gun142.cubeList.add(new ModelBox(gun142, 230, 180, -8.9146F, -55.7989F, -9.99F, 1, 1, 5, 0.0F, false));

		gun146_r1 = new ModelRenderer(this);
		gun146_r1.setRotationPoint(-6.2191F, -52.4384F, -31.4037F);
		gun142.addChild(gun146_r1);
		gun146_r1.cubeList.add(new ModelBox(gun146_r1, 234, 184, -2.1538F, -3.1522F, -4.8F, 1, 1, 1, 0.0F, false));

		gun145_r1 = new ModelRenderer(this);
		gun145_r1.setRotationPoint(-6.1378F, -52.5378F, -30.99F);
		gun142.addChild(gun145_r1);
		gun145_r1.cubeList.add(new ModelBox(gun145_r1, 233, 183, -2.7768F, -3.2611F, -1.0F, 1, 1, 2, 0.0F, false));

		gun145_r2 = new ModelRenderer(this);
		gun145_r2.setRotationPoint(-4.8254F, -53.17F, -37.477F);
		gun142.addChild(gun145_r2);
		setRotationAngle(gun145_r2, 0.1166F, -0.1057F, 3.1411F);
		gun145_r2.cubeList.add(new ModelBox(gun145_r2, 230, 180, -0.3142F, 0.1191F, 1.1667F, 1, 1, 5, 0.0F, false));

		gun144_r1 = new ModelRenderer(this);
		gun144_r1.setRotationPoint(-6.1859F, -52.8588F, -22.99F);
		gun142.addChild(gun144_r1);
		setRotationAngle(gun144_r1, 0.0F, 0.0F, -3.1416F);
		gun144_r1.cubeList.add(new ModelBox(gun144_r1, 228, 178, -2.3324F, -0.2942F, -9.0F, 1, 1, 7, 0.0F, false));
		gun144_r1.cubeList.add(new ModelBox(gun144_r1, 229, 179, -2.3324F, -0.2942F, -2.0F, 1, 1, 6, 0.0F, false));

		gun116 = new ModelRenderer(this);
		gun116.setRotationPoint(-2.0F, -39.2F, -26.5F);
		dustcover.addChild(gun116);
		gun116.cubeList.add(new ModelBox(gun116, 176, 202, 0.0736F, -55.8199F, -0.99F, 2, 1, 21, 0.0F, false));
		gun116.cubeList.add(new ModelBox(gun116, 191, 217, 0.0736F, -55.8199F, -12.99F, 2, 1, 6, 0.0F, false));
		gun116.cubeList.add(new ModelBox(gun116, 191, 217, 0.3236F, -56.0199F, 15.01F, 2, 1, 6, 0.0F, false));

		gun117_r1 = new ModelRenderer(this);
		gun117_r1.setRotationPoint(0.8611F, -54.1057F, 25.9242F);
		gun116.addChild(gun117_r1);
		setRotationAngle(gun117_r1, -1.5708F, 0.0F, 0.0F);
		gun117_r1.cubeList.add(new ModelBox(gun117_r1, 157, 104, -0.5375F, 3.5F, -0.5F, 2, 1, 2, 0.0F, false));

		gun116_r1 = new ModelRenderer(this);
		gun116_r1.setRotationPoint(0.8611F, -55.3128F, 25.01F);
		gun116.addChild(gun116_r1);
		setRotationAngle(gun116_r1, -0.7854F, 0.0F, 0.0F);
		gun116_r1.cubeList.add(new ModelBox(gun116_r1, 157, 104, -0.5375F, 2.3284F, -3.3284F, 2, 1, 2, 0.0F, false));

		gun120_r1 = new ModelRenderer(this);
		gun120_r1.setRotationPoint(0.5136F, -54.4674F, -18.99F);
		gun116.addChild(gun120_r1);
		gun120_r1.cubeList.add(new ModelBox(gun120_r1, 195, 221, -0.4399F, -1.3525F, -1.0F, 2, 1, 2, 0.0F, false));

		gun120_r2 = new ModelRenderer(this);
		gun120_r2.setRotationPoint(1.2505F, -55.7623F, -23.2532F);
		gun116.addChild(gun120_r2);
		setRotationAngle(gun120_r2, 0.0F, 0.0F, -3.1416F);
		gun120_r2.cubeList.add(new ModelBox(gun120_r2, 196, 222, -0.4399F, -1.3525F, -1.0F, 2, 1, 1, 0.0F, false));

		gun120_r3 = new ModelRenderer(this);
		gun120_r3.setRotationPoint(0.9614F, -52.4589F, -23.372F);
		gun116.addChild(gun120_r3);
		setRotationAngle(gun120_r3, 0.0F, 0.0F, -3.1416F);
		gun120_r3.cubeList.add(new ModelBox(gun120_r3, 196, 222, -0.4399F, -1.3525F, -1.0F, 2, 1, 1, 0.0F, false));

		gun119_r1 = new ModelRenderer(this);
		gun119_r1.setRotationPoint(0.5136F, -51.7919F, -18.99F);
		gun116.addChild(gun119_r1);
		setRotationAngle(gun119_r1, 0.0F, 0.0F, -3.1416F);
		gun119_r1.cubeList.add(new ModelBox(gun119_r1, 195, 221, -0.4399F, -1.3525F, -1.0F, 2, 1, 2, 0.0F, false));
		gun119_r1.cubeList.add(new ModelBox(gun119_r1, 191, 217, -0.4399F, -1.3525F, 6.0F, 2, 1, 6, 0.0F, false));

		barrel3 = new ModelRenderer(this);
		barrel3.setRotationPoint(-1.0F, -36.8F, -70.5F);
		gun.addChild(barrel3);
		

		barrel4 = new ModelRenderer(this);
		barrel4.setRotationPoint(1.0F, 36.8F, 85.5F);
		barrel3.addChild(barrel4);
		

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(-1.5F, -37.8F, -85.5F);
		barrel4.addChild(bone24);
		

		cube_r46 = new ModelRenderer(this);
		cube_r46.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone24.addChild(cube_r46);
		setRotationAngle(cube_r46, 0.0F, 0.0F, 0.4363F);
		cube_r46.cubeList.add(new ModelBox(cube_r46, 56, 100, -0.4226F, -0.9063F, -1.0F, 1, 1, 38, -0.1F, false));

		cube_r47 = new ModelRenderer(this);
		cube_r47.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone24.addChild(cube_r47);
		setRotationAngle(cube_r47, 0.0F, 0.0F, -0.4363F);
		cube_r47.cubeList.add(new ModelBox(cube_r47, 7, 99, -0.4897F, -0.8654F, -1.0F, 1, 1, 38, -0.1F, false));

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(-1.5F, -32.4F, -85.5F);
		barrel4.addChild(bone25);
		

		cube_r48 = new ModelRenderer(this);
		cube_r48.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone25.addChild(cube_r48);
		setRotationAngle(cube_r48, 0.0F, 0.0F, -0.4363F);
		cube_r48.cubeList.add(new ModelBox(cube_r48, 7, 7, 1.6937F, -4.6325F, -1.0F, 1, 1, 38, -0.1F, false));

		cube_r49 = new ModelRenderer(this);
		cube_r49.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone25.addChild(cube_r49);
		setRotationAngle(cube_r49, 0.0F, 0.0F, 0.4363F);
		cube_r49.cubeList.add(new ModelBox(cube_r49, 7, 53, -2.606F, -4.6734F, -1.0F, 1, 1, 38, -0.1F, false));

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(1.2F, -35.1F, -85.5F);
		barrel4.addChild(bone26);
		setRotationAngle(bone26, 0.0F, 0.0F, 1.5708F);
		

		cube_r50 = new ModelRenderer(this);
		cube_r50.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone26.addChild(cube_r50);
		setRotationAngle(cube_r50, 0.0F, 0.0F, 0.4363F);
		cube_r50.cubeList.add(new ModelBox(cube_r50, 56, 8, -1.6981F, 2.3979F, -1.0F, 1, 1, 38, -0.1F, false));

		cube_r51 = new ModelRenderer(this);
		cube_r51.setRotationPoint(0.0F, 70.2F, 0.0F);
		bone26.addChild(cube_r51);
		setRotationAngle(cube_r51, 0.0F, 0.0F, 0.4363F);
		

		cube_r52 = new ModelRenderer(this);
		cube_r52.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone26.addChild(cube_r52);
		setRotationAngle(cube_r52, 0.0F, 0.0F, -0.4363F);
		cube_r52.cubeList.add(new ModelBox(cube_r52, 56, 54, -3.8407F, 0.2816F, -1.0F, 1, 1, 38, -0.1F, false));

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(-4.2F, -35.1F, -85.5F);
		barrel4.addChild(bone27);
		setRotationAngle(bone27, 0.0F, 0.0F, -1.5708F);
		

		cube_r53 = new ModelRenderer(this);
		cube_r53.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone27.addChild(cube_r53);
		setRotationAngle(cube_r53, 0.0F, 0.0F, -0.4363F);
		cube_r53.cubeList.add(new ModelBox(cube_r53, 104, 6, 0.6572F, 2.4855F, -1.0F, 1, 1, 38, -0.1F, false));

		cube_r79 = new ModelRenderer(this);
		cube_r79.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone27.addChild(cube_r79);
		setRotationAngle(cube_r79, 0.0F, 0.0F, 0.4363F);
		cube_r79.cubeList.add(new ModelBox(cube_r79, 104, 53, 2.8816F, 0.3692F, -1.0F, 1, 1, 38, -0.1F, false));

		barrelouter5 = new ModelRenderer(this);
		barrelouter5.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrel3.addChild(barrelouter5);
		

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(-0.5F, 4.4F, 0.0F);
		barrelouter5.addChild(bone28);
		

		cube_r80 = new ModelRenderer(this);
		cube_r80.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone28.addChild(cube_r80);
		setRotationAngle(cube_r80, 0.0F, 0.0F, -0.4363F);
		

		cube_r81 = new ModelRenderer(this);
		cube_r81.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone28.addChild(cube_r81);
		setRotationAngle(cube_r81, 0.0F, 0.0F, 0.4363F);
		

		bone29 = new ModelRenderer(this);
		bone29.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter5.addChild(bone29);
		setRotationAngle(bone29, 0.0F, 0.0F, 1.5708F);
		

		cube_r82 = new ModelRenderer(this);
		cube_r82.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone29.addChild(cube_r82);
		setRotationAngle(cube_r82, 0.0F, 0.0F, 0.4363F);
		

		cube_r83 = new ModelRenderer(this);
		cube_r83.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone29.addChild(cube_r83);
		setRotationAngle(cube_r83, 0.0F, 0.0F, -0.4363F);
		

		bone30 = new ModelRenderer(this);
		bone30.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter5.addChild(bone30);
		setRotationAngle(bone30, 0.0F, 0.0F, -1.5708F);
		

		cube_r84 = new ModelRenderer(this);
		cube_r84.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone30.addChild(cube_r84);
		setRotationAngle(cube_r84, 0.0F, 0.0F, -0.4363F);
		

		cube_r85 = new ModelRenderer(this);
		cube_r85.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone30.addChild(cube_r85);
		setRotationAngle(cube_r85, 0.0F, 0.0F, 0.4363F);
		

		bone31 = new ModelRenderer(this);
		bone31.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter5.addChild(bone31);
		

		cube_r86 = new ModelRenderer(this);
		cube_r86.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone31.addChild(cube_r86);
		setRotationAngle(cube_r86, 0.0F, 0.0F, 0.4363F);
		

		cube_r87 = new ModelRenderer(this);
		cube_r87.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone31.addChild(cube_r87);
		setRotationAngle(cube_r87, 0.0F, 0.0F, -0.4363F);
		

		barrelouter6 = new ModelRenderer(this);
		barrelouter6.setRotationPoint(0.0F, 0.0F, 26.0F);
		barrel3.addChild(barrelouter6);
		

		bone32 = new ModelRenderer(this);
		bone32.setRotationPoint(-0.5F, 4.4F, 0.0F);
		barrelouter6.addChild(bone32);
		

		cube_r88 = new ModelRenderer(this);
		cube_r88.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone32.addChild(cube_r88);
		setRotationAngle(cube_r88, 0.0F, 0.0F, -0.4363F);
		

		cube_r89 = new ModelRenderer(this);
		cube_r89.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone32.addChild(cube_r89);
		setRotationAngle(cube_r89, 0.0F, 0.0F, 0.4363F);
		

		bone33 = new ModelRenderer(this);
		bone33.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter6.addChild(bone33);
		setRotationAngle(bone33, 0.0F, 0.0F, 1.5708F);
		

		cube_r90 = new ModelRenderer(this);
		cube_r90.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone33.addChild(cube_r90);
		setRotationAngle(cube_r90, 0.0F, 0.0F, 0.4363F);
		

		cube_r91 = new ModelRenderer(this);
		cube_r91.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone33.addChild(cube_r91);
		setRotationAngle(cube_r91, 0.0F, 0.0F, -0.4363F);
		

		bone34 = new ModelRenderer(this);
		bone34.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter6.addChild(bone34);
		setRotationAngle(bone34, 0.0F, 0.0F, -1.5708F);
		

		cube_r92 = new ModelRenderer(this);
		cube_r92.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone34.addChild(cube_r92);
		setRotationAngle(cube_r92, 0.0F, 0.0F, -0.4363F);
		

		cube_r93 = new ModelRenderer(this);
		cube_r93.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone34.addChild(cube_r93);
		setRotationAngle(cube_r93, 0.0F, 0.0F, 0.4363F);
		

		bone35 = new ModelRenderer(this);
		bone35.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter6.addChild(bone35);
		

		cube_r94 = new ModelRenderer(this);
		cube_r94.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone35.addChild(cube_r94);
		setRotationAngle(cube_r94, 0.0F, 0.0F, 0.4363F);
		

		cube_r95 = new ModelRenderer(this);
		cube_r95.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone35.addChild(cube_r95);
		setRotationAngle(cube_r95, 0.0F, 0.0F, -0.4363F);
		

		barrelouter7 = new ModelRenderer(this);
		barrelouter7.setRotationPoint(0.0F, 0.0F, 42.9F);
		barrel3.addChild(barrelouter7);
		

		bone36 = new ModelRenderer(this);
		bone36.setRotationPoint(-0.5F, 4.4F, 0.0F);
		barrelouter7.addChild(bone36);
		

		cube_r96 = new ModelRenderer(this);
		cube_r96.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone36.addChild(cube_r96);
		setRotationAngle(cube_r96, 0.0F, 0.0F, -0.4363F);
		

		cube_r97 = new ModelRenderer(this);
		cube_r97.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone36.addChild(cube_r97);
		setRotationAngle(cube_r97, 0.0F, 0.0F, 0.4363F);
		

		bone37 = new ModelRenderer(this);
		bone37.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter7.addChild(bone37);
		setRotationAngle(bone37, 0.0F, 0.0F, 1.5708F);
		

		cube_r98 = new ModelRenderer(this);
		cube_r98.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone37.addChild(cube_r98);
		setRotationAngle(cube_r98, 0.0F, 0.0F, 0.4363F);
		

		cube_r99 = new ModelRenderer(this);
		cube_r99.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone37.addChild(cube_r99);
		setRotationAngle(cube_r99, 0.0F, 0.0F, -0.4363F);
		

		bone38 = new ModelRenderer(this);
		bone38.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter7.addChild(bone38);
		setRotationAngle(bone38, 0.0F, 0.0F, -1.5708F);
		

		cube_r100 = new ModelRenderer(this);
		cube_r100.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone38.addChild(cube_r100);
		setRotationAngle(cube_r100, 0.0F, 0.0F, -0.4363F);
		

		cube_r101 = new ModelRenderer(this);
		cube_r101.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone38.addChild(cube_r101);
		setRotationAngle(cube_r101, 0.0F, 0.0F, 0.4363F);
		

		bone39 = new ModelRenderer(this);
		bone39.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter7.addChild(bone39);
		

		cube_r102 = new ModelRenderer(this);
		cube_r102.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone39.addChild(cube_r102);
		setRotationAngle(cube_r102, 0.0F, 0.0F, 0.4363F);
		

		cube_r103 = new ModelRenderer(this);
		cube_r103.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone39.addChild(cube_r103);
		setRotationAngle(cube_r103, 0.0F, 0.0F, -0.4363F);
		

		barrelouter8 = new ModelRenderer(this);
		barrelouter8.setRotationPoint(0.0F, 0.0F, 4.0F);
		barrel3.addChild(barrelouter8);
		

		bone40 = new ModelRenderer(this);
		bone40.setRotationPoint(-0.5F, 4.4F, 0.0F);
		barrelouter8.addChild(bone40);
		

		cube_r104 = new ModelRenderer(this);
		cube_r104.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone40.addChild(cube_r104);
		setRotationAngle(cube_r104, 0.0F, 0.0F, -0.4363F);
		

		cube_r105 = new ModelRenderer(this);
		cube_r105.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone40.addChild(cube_r105);
		setRotationAngle(cube_r105, 0.0F, 0.0F, 0.4363F);
		

		bone41 = new ModelRenderer(this);
		bone41.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter8.addChild(bone41);
		setRotationAngle(bone41, 0.0F, 0.0F, 1.5708F);
		

		cube_r106 = new ModelRenderer(this);
		cube_r106.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone41.addChild(cube_r106);
		setRotationAngle(cube_r106, 0.0F, 0.0F, 0.4363F);
		

		cube_r107 = new ModelRenderer(this);
		cube_r107.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone41.addChild(cube_r107);
		setRotationAngle(cube_r107, 0.0F, 0.0F, -0.4363F);
		

		bone42 = new ModelRenderer(this);
		bone42.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter8.addChild(bone42);
		setRotationAngle(bone42, 0.0F, 0.0F, -1.5708F);
		

		cube_r108 = new ModelRenderer(this);
		cube_r108.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone42.addChild(cube_r108);
		setRotationAngle(cube_r108, 0.0F, 0.0F, -0.4363F);
		

		cube_r109 = new ModelRenderer(this);
		cube_r109.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone42.addChild(cube_r109);
		setRotationAngle(cube_r109, 0.0F, 0.0F, 0.4363F);
		

		bone43 = new ModelRenderer(this);
		bone43.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter8.addChild(bone43);
		

		cube_r110 = new ModelRenderer(this);
		cube_r110.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone43.addChild(cube_r110);
		setRotationAngle(cube_r110, 0.0F, 0.0F, 0.4363F);
		

		cube_r111 = new ModelRenderer(this);
		cube_r111.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone43.addChild(cube_r111);
		setRotationAngle(cube_r111, 0.0F, 0.0F, -0.4363F);
		

		ironsights2 = new ModelRenderer(this);
		ironsights2.setRotationPoint(0.0F, -40.0F, -60.0F);
		gun.addChild(ironsights2);
		ironsights2.cubeList.add(new ModelBox(ironsights2, 38, 0, -1.2F, -1.1F, -10.4F, 1, 3, 2, -0.3F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 149, 112, -2.1F, -0.9F, 38.6F, 2, 3, 5, -0.3F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 121, 4, -2.9F, -0.9F, 38.6F, 2, 3, 5, -0.299F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 121, 4, -2.9F, -0.9F, 41.6F, 2, 3, 5, -0.299F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 149, 112, -2.1F, -0.9F, 41.6F, 2, 3, 5, -0.3F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 160, 110, -2.9F, -1.1F, 39.6F, 1, 1, 4, -0.301F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 160, 18, -1.1F, -1.3F, 39.6F, 1, 1, 4, -0.301F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 98, 37, -2.9F, -2.485F, 41.62F, 1, 2, 2, -0.301F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 86, 73, -3.0F, -1.56F, 42.22F, 3, 1, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 86, 73, -3.0F, -1.36F, 42.22F, 3, 1, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 86, 73, -3.0F, -1.16F, 42.22F, 3, 1, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 86, 60, -3.0F, -1.76F, 42.22F, 3, 1, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 86, 52, -3.0F, -1.96F, 42.22F, 3, 1, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 125, 161, -1.0F, -2.16F, 42.22F, 1, 1, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 98, 161, -1.2F, -2.16F, 42.22F, 1, 1, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 161, 67, -1.4F, -2.16F, 42.22F, 1, 1, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 161, 65, -1.6F, -2.16F, 42.22F, 1, 1, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 161, 61, -1.7F, -2.16F, 42.22F, 1, 1, 1, -0.401F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 161, 45, -1.7F, -2.26F, 42.22F, 1, 1, 1, -0.402F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 161, 47, -1.6F, -2.26F, 42.22F, 1, 1, 1, -0.401F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 161, 51, -1.4F, -2.26F, 42.22F, 1, 1, 1, -0.401F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 161, 53, -1.2F, -2.26F, 42.22F, 1, 1, 1, -0.401F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 161, 59, -1.0F, -2.26F, 42.22F, 1, 1, 1, -0.401F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 136, 159, -2.3F, -2.26F, 42.22F, 1, 1, 1, -0.402F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 159, 140, -2.4F, -2.26F, 42.22F, 1, 1, 1, -0.401F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 159, 142, -2.6F, -2.26F, 42.22F, 1, 1, 1, -0.401F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 76, 160, -2.8F, -2.26F, 42.22F, 1, 1, 1, -0.401F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 160, 124, -3.0F, -2.26F, 42.22F, 1, 1, 1, -0.401F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 160, 126, -2.3F, -2.16F, 42.22F, 1, 1, 1, -0.401F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 128, 160, -2.4F, -2.16F, 42.22F, 1, 1, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 160, 128, -2.8F, -2.16F, 42.22F, 1, 1, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 139, 160, -3.0F, -2.16F, 42.22F, 1, 1, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 161, 24, -2.6F, -2.16F, 42.22F, 1, 1, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 58, 93, -1.1F, -2.485F, 41.62F, 1, 2, 2, -0.301F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 58, 93, -1.1F, -2.785F, 41.62F, 1, 2, 2, -0.301F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 98, 37, -2.9F, -2.785F, 41.62F, 1, 2, 2, -0.301F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 24, 21, -2.8F, -1.1F, -10.4F, 1, 3, 2, -0.3F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 38, 0, -1.2F, 0.7F, -10.4F, 1, 2, 2, -0.3F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 24, 21, -2.8F, 0.7F, -10.4F, 1, 2, 2, -0.3F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 65, 21, -2.0F, -2.2F, -10.0F, 1, 2, 1, -0.4F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 49, 0, -3.1F, -0.7F, -9.9F, 1, 1, 1, -0.3F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 49, 0, -0.9F, -0.7F, -9.9F, 1, 1, 1, -0.3F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 73, 81, -2.8F, -3.3517F, -10.4F, 2, 1, 2, -0.3F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 73, 81, -2.2F, -3.3517F, -10.4F, 2, 1, 2, -0.3F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 49, 74, -2.5F, -1.1F, -10.4F, 2, 2, 2, -0.3F, false));
		ironsights2.cubeList.add(new ModelBox(ironsights2, 49, 74, -2.5F, 0.3F, -10.4F, 2, 2, 2, -0.3F, false));

		ironsights_r1 = new ModelRenderer(this);
		ironsights_r1.setRotationPoint(-2.5768F, -2.5187F, -9.4F);
		ironsights2.addChild(ironsights_r1);
		setRotationAngle(ironsights_r1, 0.0F, 0.0F, 0.5236F);
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 38, 0, -0.5F, -0.8F, -1.0F, 1, 2, 2, -0.3F, false));

		ironsights_r2 = new ModelRenderer(this);
		ironsights_r2.setRotationPoint(-0.4232F, -2.5187F, -9.4F);
		ironsights2.addChild(ironsights_r2);
		setRotationAngle(ironsights_r2, 0.0F, 0.0F, -0.5236F);
		ironsights_r2.cubeList.add(new ModelBox(ironsights_r2, 24, 21, -0.5F, -0.8F, -1.0F, 1, 2, 2, -0.3F, false));

		ironsights_r3 = new ModelRenderer(this);
		ironsights_r3.setRotationPoint(-2.7768F, -1.5062F, -9.4F);
		ironsights2.addChild(ironsights_r3);
		setRotationAngle(ironsights_r3, 0.0F, 0.0F, -0.5236F);
		ironsights_r3.cubeList.add(new ModelBox(ironsights_r3, 24, 21, -0.5F, -0.8F, -1.0F, 1, 2, 2, -0.3F, false));

		ironsights_r4 = new ModelRenderer(this);
		ironsights_r4.setRotationPoint(-0.2232F, -1.5062F, -9.4F);
		ironsights2.addChild(ironsights_r4);
		setRotationAngle(ironsights_r4, 0.0F, 0.0F, 0.5236F);
		ironsights_r4.cubeList.add(new ModelBox(ironsights_r4, 38, 0, -0.5F, -0.8F, -1.0F, 1, 2, 2, -0.3F, false));

		ironsights_r5 = new ModelRenderer(this);
		ironsights_r5.setRotationPoint(-1.5005F, -0.8991F, 39.2072F);
		ironsights2.addChild(ironsights_r5);
		setRotationAngle(ironsights_r5, -2.0944F, 0.0F, 3.1416F);
		ironsights_r5.cubeList.add(new ModelBox(ironsights_r5, 58, 93, 0.4005F, -4.6538F, -2.382F, 1, 2, 2, -0.301F, false));
		ironsights_r5.cubeList.add(new ModelBox(ironsights_r5, 98, 37, -1.3995F, -4.6538F, -2.382F, 1, 2, 2, -0.301F, false));

		ironsights_r6 = new ModelRenderer(this);
		ironsights_r6.setRotationPoint(-1.5005F, -0.8991F, 39.2072F);
		ironsights2.addChild(ironsights_r6);
		setRotationAngle(ironsights_r6, -2.7925F, 0.0F, 3.1416F);
		ironsights_r6.cubeList.add(new ModelBox(ironsights_r6, 171, 119, 0.3995F, -2.7595F, -6.0184F, 1, 2, 3, -0.301F, false));
		ironsights_r6.cubeList.add(new ModelBox(ironsights_r6, 97, 36, -1.4005F, -2.7595F, -6.0184F, 1, 2, 3, -0.301F, false));

		ironsights_r7 = new ModelRenderer(this);
		ironsights_r7.setRotationPoint(-1.5F, -1.5291F, 37.1769F);
		ironsights2.addChild(ironsights_r7);
		setRotationAngle(ironsights_r7, 1.0472F, 0.0F, 0.0F);
		ironsights_r7.cubeList.add(new ModelBox(ironsights_r7, 58, 93, 0.4F, 3.3301F, 1.5F, 1, 2, 2, -0.301F, false));
		ironsights_r7.cubeList.add(new ModelBox(ironsights_r7, 98, 37, -1.4F, 3.3301F, 1.5F, 1, 2, 2, -0.301F, false));

		ironsights_r8 = new ModelRenderer(this);
		ironsights_r8.setRotationPoint(-1.501F, -0.836F, 35.7146F);
		ironsights2.addChild(ironsights_r8);
		setRotationAngle(ironsights_r8, 0.3491F, 0.0F, 0.0F);
		ironsights_r8.cubeList.add(new ModelBox(ironsights_r8, 97, 36, -1.4F, 0.7103F, 3.6984F, 1, 2, 3, -0.301F, false));
		ironsights_r8.cubeList.add(new ModelBox(ironsights_r8, 153, 102, 0.4F, 0.7103F, 3.6984F, 1, 2, 3, -0.301F, false));

		cube_r112 = new ModelRenderer(this);
		cube_r112.setRotationPoint(-0.4F, -1.66F, 35.22F);
		ironsights2.addChild(cube_r112);
		setRotationAngle(cube_r112, -0.5236F, 0.0F, 0.0F);
		

		cube_r113 = new ModelRenderer(this);
		cube_r113.setRotationPoint(-2.7F, -1.36F, 40.72F);
		ironsights2.addChild(cube_r113);
		setRotationAngle(cube_r113, 0.3665F, 0.0F, 0.0F);
		

		cube_r114 = new ModelRenderer(this);
		cube_r114.setRotationPoint(-0.4F, -1.16F, 33.92F);
		ironsights2.addChild(cube_r114);
		setRotationAngle(cube_r114, 0.3665F, 0.0F, 0.0F);
		

		cube_r115 = new ModelRenderer(this);
		cube_r115.setRotationPoint(-0.8F, -0.6F, 32.9F);
		ironsights2.addChild(cube_r115);
		setRotationAngle(cube_r115, -0.7156F, 0.0F, 0.0F);
		cube_r115.cubeList.add(new ModelBox(cube_r115, 73, 68, -0.3F, -5.3346F, 4.4906F, 1, 2, 2, -0.302F, false));
		cube_r115.cubeList.add(new ModelBox(cube_r115, 98, 47, -2.1F, -5.3346F, 4.4906F, 1, 2, 2, -0.302F, false));

		cube_r46_r1 = new ModelRenderer(this);
		cube_r46_r1.setRotationPoint(-0.7005F, -2.2807F, 2.1676F);
		cube_r115.addChild(cube_r46_r1);
		setRotationAngle(cube_r46_r1, 1.7104F, 0.0F, -3.1416F);
		cube_r46_r1.cubeList.add(new ModelBox(cube_r46_r1, 73, 68, 0.4005F, 5.5898F, -7.6202F, 1, 2, 2, -0.302F, false));
		cube_r46_r1.cubeList.add(new ModelBox(cube_r46_r1, 98, 47, -1.3995F, 5.5898F, -7.6202F, 1, 2, 2, -0.302F, false));

		stock = new ModelRenderer(this);
		stock.setRotationPoint(0.0F, 0.0F, 0.0F);
		gun.addChild(stock);
		setRotationAngle(stock, 0.0873F, 0.0F, 0.0F);
		

		gun365 = new ModelRenderer(this);
		gun365.setRotationPoint(2.6F, -36.2F, 7.5F);
		stock.addChild(gun365);
		setRotationAngle(gun365, -0.0986F, 0.0F, 0.0F);
		gun365.cubeList.add(new ModelBox(gun365, 158, 103, -1.75F, 2.8678F, -8.4019F, 1, 1, 18, 0.0F, false));
		gun365.cubeList.add(new ModelBox(gun365, 158, 104, -7.35F, 2.8678F, -8.4019F, 1, 1, 18, 0.0F, false));
		gun365.cubeList.add(new ModelBox(gun365, 156, 101, -1.55F, 2.6F, -27.4F, 1, 2, 20, 0.0F, false));
		gun365.cubeList.add(new ModelBox(gun365, 156, 102, -7.75F, 2.6F, -27.4F, 1, 2, 20, 0.0F, false));
		gun365.cubeList.add(new ModelBox(gun365, 157, 103, -7.35F, 3.2678F, -8.4019F, 1, 1, 18, 0.0F, false));
		gun365.cubeList.add(new ModelBox(gun365, 44, 120, -1.75F, 3.2678F, -8.4019F, 1, 1, 18, 0.0F, false));
		gun365.cubeList.add(new ModelBox(gun365, 158, 103, -7.35F, 3.2678F, 2.6981F, 1, 1, 18, 0.0F, false));
		gun365.cubeList.add(new ModelBox(gun365, 158, 103, -1.75F, 3.2678F, 2.6981F, 1, 1, 18, 0.0F, false));
		gun365.cubeList.add(new ModelBox(gun365, 157, 103, -7.35F, 2.8678F, 2.6981F, 1, 1, 18, 0.0F, false));
		gun365.cubeList.add(new ModelBox(gun365, 157, 103, -1.75F, 2.8678F, 2.6981F, 1, 1, 18, 0.0F, false));

		gun244 = new ModelRenderer(this);
		gun244.setRotationPoint(-0.6F, -33.1F, 33.7F);
		stock.addChild(gun244);
		setRotationAngle(gun244, -0.0873F, 0.0F, 0.0F);
		gun244.cubeList.add(new ModelBox(gun244, 20, 19, 1.0F, 2.3523F, -6.5976F, 1, 10, 1, 0.0F, false));

		gun243 = new ModelRenderer(this);
		gun243.setRotationPoint(-3.4F, -33.1F, 33.7F);
		stock.addChild(gun243);
		setRotationAngle(gun243, -0.0873F, 0.0F, 0.0F);
		gun243.cubeList.add(new ModelBox(gun243, 20, 20, -1.0F, 2.3523F, -6.5976F, 1, 10, 1, 0.0F, false));

		gun242 = new ModelRenderer(this);
		gun242.setRotationPoint(-2.9F, -34.1F, 34.8F);
		stock.addChild(gun242);
		setRotationAngle(gun242, -0.0873F, 0.0F, 0.0F);
		gun242.cubeList.add(new ModelBox(gun242, 179, 120, -0.6F, 13.3513F, -7.5966F, 2, 1, 1, 0.0F, false));
		gun242.cubeList.add(new ModelBox(gun242, 184, 121, 1.4F, 13.3513F, -7.5966F, 2, 1, 1, 0.0F, false));
		gun242.cubeList.add(new ModelBox(gun242, 179, 120, -0.6F, 4.3513F, -7.5966F, 2, 1, 1, 0.0F, false));
		gun242.cubeList.add(new ModelBox(gun242, 184, 121, 1.4F, 4.3513F, -7.5966F, 2, 1, 1, 0.0F, false));
		gun242.cubeList.add(new ModelBox(gun242, 179, 120, -0.6F, 10.3513F, -7.5966F, 2, 1, 1, 0.0F, false));
		gun242.cubeList.add(new ModelBox(gun242, 184, 121, 1.4F, 10.3513F, -7.5966F, 2, 1, 1, 0.0F, false));

		gun241 = new ModelRenderer(this);
		gun241.setRotationPoint(-3.5F, -24.1F, 32.6F);
		stock.addChild(gun241);
		setRotationAngle(gun241, -0.0873F, 0.0F, 0.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(6.8284F, 1.8976F, 0.723F);
		gun241.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 52, 136, -3.3264F, -1.3736F, -6.9999F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 52, 136, -3.6264F, -1.3736F, -6.9999F, 1, 1, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(2.1213F, 2.6047F, 0.723F);
		gun241.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 68, 124, -2.6264F, -1.6736F, -6.9999F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 48, 26, -2.6264F, -1.3736F, -6.9999F, 1, 1, 1, 0.0F, false));
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