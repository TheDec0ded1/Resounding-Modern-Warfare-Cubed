package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class PSO4x24M extends ModelBase {
	private final ModelRenderer Mount;
	private final ModelRenderer Scope1;
	private final ModelRenderer Scope2;
	private final ModelRenderer Scope3;
	private final ModelRenderer Scope4;
	private final ModelRenderer Scope5;
	private final ModelRenderer Scope6;
	private final ModelRenderer Scope7;
	private final ModelRenderer Scope8;
	private final ModelRenderer Scope9;
	private final ModelRenderer Scope10;
	private final ModelRenderer Scope11;
	private final ModelRenderer Scope12;
	private final ModelRenderer Scope13;
	private final ModelRenderer Scope14;
	private final ModelRenderer Scope15;
	private final ModelRenderer Scope16;
	private final ModelRenderer Scope31;
	private final ModelRenderer bone6;
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
	private final ModelRenderer Scope;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;
	private final ModelRenderer cube_r34;
	private final ModelRenderer cube_r35;
	private final ModelRenderer cube_r36;
	private final ModelRenderer cube_r37;
	private final ModelRenderer cube_r38;
	private final ModelRenderer cube_r39;
	private final ModelRenderer cube_r40;
	private final ModelRenderer cube_r41;
	private final ModelRenderer cube_r42;
	private final ModelRenderer cube_r43;
	private final ModelRenderer cube_r44;
	private final ModelRenderer cube_r45;
	private final ModelRenderer cube_r46;
	private final ModelRenderer cube_r47;
	private final ModelRenderer cube_r48;
	private final ModelRenderer cube_r49;
	private final ModelRenderer cube_r50;
	private final ModelRenderer cube_r51;
	private final ModelRenderer cube_r52;
	private final ModelRenderer cube_r53;
	private final ModelRenderer bone5;
	private final ModelRenderer cube_r54;
	private final ModelRenderer cube_r55;
	private final ModelRenderer cube_r56;
	private final ModelRenderer cube_r57;
	private final ModelRenderer cube_r58;
	private final ModelRenderer cube_r59;
	private final ModelRenderer cube_r60;
	private final ModelRenderer cube_r61;
	private final ModelRenderer cube_r62;
	private final ModelRenderer cube_r63;
	private final ModelRenderer cube_r64;
	private final ModelRenderer cube_r65;
	private final ModelRenderer cube_r66;
	private final ModelRenderer cube_r67;
	private final ModelRenderer Eyepiece;
	private final ModelRenderer cube_r68;
	private final ModelRenderer cube_r69;
	private final ModelRenderer cube_r70;
	private final ModelRenderer cube_r71;
	private final ModelRenderer cube_r72;
	private final ModelRenderer cube_r73;
	private final ModelRenderer cube_r74;
	private final ModelRenderer cube_r75;
	private final ModelRenderer cube_r76;
	private final ModelRenderer cube_r77;
	private final ModelRenderer cube_r78;
	private final ModelRenderer cube_r79;
	private final ModelRenderer cube_r80;
	private final ModelRenderer cube_r81;
	private final ModelRenderer cube_r82;
	private final ModelRenderer cube_r83;
	private final ModelRenderer cube_r84;
	private final ModelRenderer cube_r85;
	private final ModelRenderer cube_r86;
	private final ModelRenderer cube_r87;
	private final ModelRenderer OpticAccurrized;
	private final ModelRenderer cube_r88;
	private final ModelRenderer cube_r89;
	private final ModelRenderer cube_r90;
	private final ModelRenderer cube_r91;
	private final ModelRenderer cube_r92;
	private final ModelRenderer cube_r93;
	private final ModelRenderer cube_r94;
	private final ModelRenderer cube_r95;
	private final ModelRenderer cube_r96;
	private final ModelRenderer cube_r97;
	private final ModelRenderer cube_r98;
	private final ModelRenderer cube_r99;
	private final ModelRenderer cube_r100;
	private final ModelRenderer cube_r101;
	private final ModelRenderer cube_r102;
	private final ModelRenderer cube_r103;
	private final ModelRenderer cube_r104;
	private final ModelRenderer cube_r105;
	private final ModelRenderer cube_r106;
	private final ModelRenderer cube_r107;
	private final ModelRenderer cube_r108;
	private final ModelRenderer cube_r109;
	private final ModelRenderer cube_r110;
	private final ModelRenderer cube_r111;
	private final ModelRenderer cube_r112;
	private final ModelRenderer cube_r113;
	private final ModelRenderer cube_r114;
	private final ModelRenderer cube_r115;
	private final ModelRenderer rib;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r116;
	private final ModelRenderer cube_r117;
	private final ModelRenderer cube_r118;
	private final ModelRenderer cube_r119;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r120;
	private final ModelRenderer cube_r121;
	private final ModelRenderer cube_r122;
	private final ModelRenderer cube_r123;
	private final ModelRenderer bone4;
	private final ModelRenderer LensCap;
	private final ModelRenderer cube_r124;
	private final ModelRenderer cube_r125;
	private final ModelRenderer cube_r126;
	private final ModelRenderer cube_r127;
	private final ModelRenderer cube_r128;
	private final ModelRenderer cube_r129;
	private final ModelRenderer cube_r130;
	private final ModelRenderer cube_r131;
	private final ModelRenderer cube_r132;
	private final ModelRenderer cube_r133;
	private final ModelRenderer cube_r134;

	public PSO4x24M() {
		textureWidth = 128;
		textureHeight = 128;

		Mount = new ModelRenderer(this);
		Mount.setRotationPoint(0.0F, 24.0F, -3.4F);
		

		Scope1 = new ModelRenderer(this);
		Scope1.setRotationPoint(0.0F, -24.0F, 0.0F);
		Mount.addChild(Scope1);
		Scope1.cubeList.add(new ModelBox(Scope1, 45, 42, 0.0F, 0.2184F, -0.125F, 1, 3, 3, 0.0F, false));
		Scope1.cubeList.add(new ModelBox(Scope1, 0, 92, 0.0F, -0.0066F, -0.125F, 1, 1, 3, 0.0F, false));

		Scope2 = new ModelRenderer(this);
		Scope2.setRotationPoint(-0.5F, -24.0F, -4.0F);
		Mount.addChild(Scope2);
		Scope2.cubeList.add(new ModelBox(Scope2, 46, 17, 0.0F, 0.0F, -2.0F, 1, 2, 11, 0.0F, false));

		Scope3 = new ModelRenderer(this);
		Scope3.setRotationPoint(-0.5F, -22.0F, 0.0F);
		Mount.addChild(Scope3);
		Scope3.cubeList.add(new ModelBox(Scope3, 17, 92, 0.0F, 0.2184F, -0.125F, 1, 1, 3, 0.0F, false));
		Scope3.cubeList.add(new ModelBox(Scope3, 12, 81, 0.0F, -0.3816F, -1.125F, 1, 1, 5, 0.0F, false));
		Scope3.cubeList.add(new ModelBox(Scope3, 100, 68, 0.0F, -0.6277F, 3.6872F, 1, 1, 1, 0.0F, false));

		Scope4 = new ModelRenderer(this);
		Scope4.setRotationPoint(-0.5F, -21.0F, 0.0F);
		Mount.addChild(Scope4);
		setRotationAngle(Scope4, 2.9371F, 0.0F, 0.0F);
		Scope4.cubeList.add(new ModelBox(Scope4, 75, 79, 0.0F, -0.2393F, 0.0781F, 1, 1, 6, 0.0F, false));

		Scope5 = new ModelRenderer(this);
		Scope5.setRotationPoint(-0.5F, -21.0F, 3.0F);
		Mount.addChild(Scope5);
		setRotationAngle(Scope5, 2.0076F, 0.0F, 0.0F);
		Scope5.cubeList.add(new ModelBox(Scope5, 22, 0, 0.0F, -0.2057F, -0.145F, 1, 2, 1, 0.0F, false));

		Scope6 = new ModelRenderer(this);
		Scope6.setRotationPoint(-0.3F, -27.0F, -4.0F);
		Mount.addChild(Scope6);
		Scope6.cubeList.add(new ModelBox(Scope6, 0, 56, 0.0F, 0.0F, -2.0F, 1, 5, 2, 0.0F, false));

		Scope7 = new ModelRenderer(this);
		Scope7.setRotationPoint(-0.3F, -27.0F, 3.2F);
		Mount.addChild(Scope7);
		Scope7.cubeList.add(new ModelBox(Scope7, 57, 42, 0.0F, 0.0F, 0.0F, 1, 5, 2, 0.0F, false));

		Scope8 = new ModelRenderer(this);
		Scope8.setRotationPoint(0.3F, -27.5F, -4.2F);
		Mount.addChild(Scope8);
		Scope8.cubeList.add(new ModelBox(Scope8, 82, 91, -1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F, false));

		Scope9 = new ModelRenderer(this);
		Scope9.setRotationPoint(0.3F, -27.5F, -2.8F);
		Mount.addChild(Scope9);
		Scope9.cubeList.add(new ModelBox(Scope9, 94, 96, -1.0F, 0.0F, -2.0F, 2, 2, 1, 0.0F, false));
		Scope9.cubeList.add(new ModelBox(Scope9, 6, 92, 0.0F, 0.8F, -1.0F, 1, 1, 1, 0.0F, false));

		Scope10 = new ModelRenderer(this);
		Scope10.setRotationPoint(1.2F, -25.5F, -4.0F);
		Mount.addChild(Scope10);
		setRotationAngle(Scope10, 0.0F, 0.0F, 1.7474F);
		Scope10.cubeList.add(new ModelBox(Scope10, 15, 22, 0.0F, 0.0F, -2.0F, 3, 1, 2, 0.0F, false));

		Scope11 = new ModelRenderer(this);
		Scope11.setRotationPoint(-0.7F, -27.5F, 3.2F);
		Mount.addChild(Scope11);
		

		Scope12 = new ModelRenderer(this);
		Scope12.setRotationPoint(1.3F, -25.5F, 3.2F);
		Mount.addChild(Scope12);
		setRotationAngle(Scope12, 0.0F, 0.0F, 1.7846F);
		Scope12.cubeList.add(new ModelBox(Scope12, 30, 22, 0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F, false));

		Scope13 = new ModelRenderer(this);
		Scope13.setRotationPoint(0.5F, -27.0F, 3.2F);
		Mount.addChild(Scope13);
		

		Scope14 = new ModelRenderer(this);
		Scope14.setRotationPoint(-0.9F, -27.0F, 3.2F);
		Mount.addChild(Scope14);
		

		Scope15 = new ModelRenderer(this);
		Scope15.setRotationPoint(0.8F, -27.5F, 3.2F);
		Mount.addChild(Scope15);
		setRotationAngle(Scope15, 0.0F, 0.0F, 2.3794F);
		Scope15.cubeList.add(new ModelBox(Scope15, 0, 67, 0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F, false));

		Scope16 = new ModelRenderer(this);
		Scope16.setRotationPoint(0.8F, -27.5F, -4.0F);
		Mount.addChild(Scope16);
		setRotationAngle(Scope16, 0.0F, 0.0F, 2.3794F);
		Scope16.cubeList.add(new ModelBox(Scope16, 45, 31, 0.0F, 0.0F, -2.0F, 1, 3, 2, 0.0F, false));

		Scope31 = new ModelRenderer(this);
		Scope31.setRotationPoint(-0.5F, -28.5F, -3.8F);
		Mount.addChild(Scope31);
		setRotationAngle(Scope31, 0.0F, 0.0F, 2.3794F);
		Scope31.cubeList.add(new ModelBox(Scope31, 46, 3, 0.0F, 0.0F, -2.0F, 1, 2, 11, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, 0.0F, 3.4F);
		Mount.addChild(bone6);
		bone6.cubeList.add(new ModelBox(bone6, 81, 27, 0.0F, -26.2F, -0.2F, 1, 1, 4, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 71, 69, 0.0F, -26.4657F, 3.5F, 1, 1, 2, -0.2F, false));
		bone6.cubeList.add(new ModelBox(bone6, 47, 100, 0.0F, -26.3328F, 4.6F, 1, 1, 1, -0.1F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.9F, -25.9985F, 4.6F);
		bone6.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 100, 55, -0.5F, -0.5F, 0.0F, 1, 1, 1, -0.1F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.9621F, -26.6485F, 4.6F);
		bone6.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -1.5708F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 95, 82, -0.75F, -0.9964F, 0.0F, 1, 1, 1, -0.1F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 42, 100, -0.75F, -0.3964F, 0.0F, 1, 1, 1, -0.1F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(1.0036F, -26.5485F, 4.6F);
		bone6.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -2.3562F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 100, 20, -0.25F, -0.3964F, 0.0F, 1, 1, 1, -0.1F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.1464F, -26.3607F, 4.6F);
		bone6.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 3.1416F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 100, 15, -0.8536F, 0.1036F, 0.0F, 1, 1, 1, -0.1F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.2464F, -26.4021F, 4.6F);
		bone6.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 2.3562F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 99, 0, -0.6768F, -0.1161F, 0.0F, 1, 1, 1, -0.1F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.2879F, -26.5021F, 4.6F);
		bone6.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 1.5708F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 97, 77, -0.3964F, -0.1464F, 0.0F, 1, 1, 1, -0.1F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.2464F, -26.6021F, 4.6F);
		bone6.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 96, 66, -0.1768F, 0.0303F, 0.0F, 1, 1, 1, -0.1F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.3464F, -26.6935F, 3.5F);
		bone6.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 58, 77, -0.1768F, 0.0303F, 0.0F, 1, 1, 2, -0.2F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.4293F, -26.4935F, 3.5F);
		bone6.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 1.5708F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 34, 77, -0.3964F, -0.1464F, 0.0F, 1, 1, 2, -0.2F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.3464F, -26.2935F, 3.5F);
		bone6.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 2.3562F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 77, -0.6768F, -0.1161F, 0.0F, 1, 1, 2, -0.2F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.1464F, -26.2107F, 3.5F);
		bone6.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 3.1416F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 74, 58, -0.8536F, 0.1036F, 0.0F, 1, 1, 2, -0.2F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.9036F, -26.4399F, 3.5F);
		bone6.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -2.3562F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 48, 74, -0.25F, -0.3964F, 0.0F, 1, 1, 2, -0.2F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.8207F, -26.6399F, 3.5F);
		bone6.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -1.5708F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 72, 0, -0.75F, -0.3964F, 0.0F, 1, 1, 2, -0.2F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.8F, -26.0899F, 3.5F);
		bone6.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -0.7854F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 71, 11, -0.5F, -0.5F, 0.0F, 1, 1, 2, -0.2F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.1464F, -26.5107F, 0.8F);
		bone6.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, 1.5708F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 48, -0.3964F, -0.1464F, -1.0F, 1, 1, 4, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.1464F, -26.5107F, 0.8F);
		bone6.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, 0.7854F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 45, 17, -0.1768F, 0.0303F, -1.0F, 1, 1, 4, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.1464F, -26.5107F, 0.8F);
		bone6.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, 2.3562F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 45, 6, -0.6768F, -0.1161F, -1.0F, 1, 1, 4, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.1464F, -26.5107F, 0.8F);
		bone6.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, 3.1416F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 45, 0, -0.8536F, 0.1036F, -1.0F, 1, 1, 4, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(1.1036F, -26.6571F, 0.8F);
		bone6.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, -2.3562F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 68, 79, -0.25F, -0.3964F, -1.0F, 1, 1, 4, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(1.1036F, -26.6571F, 0.8F);
		bone6.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, -1.5708F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 45, 56, -0.75F, -0.3964F, -1.0F, 1, 1, 4, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(1.0F, -25.9071F, 0.8F);
		bone6.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, -0.7854F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 81, 21, -0.5F, -0.5F, -1.0F, 1, 1, 4, 0.0F, false));

		Scope = new ModelRenderer(this);
		Scope.setRotationPoint(-3.2595F, -6.5764F, -9.2908F);
		Scope.cubeList.add(new ModelBox(Scope, 29, 89, -1.0471F, -0.6801F, 17.5908F, 1, 1, 3, 0.0F, false));
		Scope.cubeList.add(new ModelBox(Scope, 60, 0, 0.2595F, -1.9867F, 17.5908F, 1, 1, 3, 0.0F, false));
		Scope.cubeList.add(new ModelBox(Scope, 88, 33, 1.566F, -0.6801F, 17.5908F, 1, 1, 3, 0.0F, false));
		Scope.cubeList.add(new ModelBox(Scope, 72, 48, 0.2595F, 0.6264F, 17.5908F, 1, 1, 3, 0.0F, false));
		Scope.cubeList.add(new ModelBox(Scope, 15, 16, -1.0471F, -0.6801F, -0.2092F, 1, 1, 12, 0.0F, false));
		Scope.cubeList.add(new ModelBox(Scope, 0, 14, 0.2595F, -1.9867F, -0.2092F, 1, 1, 12, 0.0F, false));
		Scope.cubeList.add(new ModelBox(Scope, 15, 30, 1.566F, -0.6801F, -0.2092F, 1, 1, 12, 0.0F, false));
		Scope.cubeList.add(new ModelBox(Scope, 30, 42, 0.2595F, 0.6264F, -0.2092F, 1, 1, 12, 0.0F, false));
		Scope.cubeList.add(new ModelBox(Scope, 72, 11, 0.2595F, -3.0272F, 4.6908F, 1, 2, 7, -0.1F, false));
		Scope.cubeList.add(new ModelBox(Scope, 45, 31, 1.6113F, -0.6754F, 4.6908F, 2, 1, 7, -0.1F, false));
		Scope.cubeList.add(new ModelBox(Scope, 72, 38, 0.2595F, 0.6764F, 4.6908F, 1, 2, 7, -0.1F, false));
		Scope.cubeList.add(new ModelBox(Scope, 71, 70, -2.0923F, -0.6754F, 4.6908F, 2, 1, 7, -0.1F, false));
		Scope.cubeList.add(new ModelBox(Scope, 24, 58, -0.2405F, -2.6236F, 0.9908F, 2, 2, 4, 0.0F, false));
		Scope.cubeList.add(new ModelBox(Scope, 38, 67, -0.2405F, -2.9236F, 5.4908F, 2, 2, 2, 0.2F, false));
		Scope.cubeList.add(new ModelBox(Scope, 7, 28, 0.2595F, -4.1236F, 5.3908F, 1, 2, 1, -0.1F, false));
		Scope.cubeList.add(new ModelBox(Scope, 22, 16, 0.2595F, -4.1236F, 5.8908F, 1, 2, 1, -0.1F, false));
		Scope.cubeList.add(new ModelBox(Scope, 37, 30, 0.8252F, -4.1236F, 5.9565F, 1, 2, 1, -0.1F, false));
		Scope.cubeList.add(new ModelBox(Scope, 22, 36, 0.2595F, -4.1236F, 6.5222F, 1, 2, 1, -0.1F, false));
		Scope.cubeList.add(new ModelBox(Scope, 37, 16, -0.3062F, -4.1236F, 5.9565F, 1, 2, 1, -0.1F, false));
		Scope.cubeList.add(new ModelBox(Scope, 57, 31, -2.0405F, -1.2236F, 5.4908F, 2, 2, 2, 0.2F, false));
		Scope.cubeList.add(new ModelBox(Scope, 91, 91, 0.8595F, -1.8236F, 3.5908F, 2, 2, 2, 0.0F, false));
		Scope.cubeList.add(new ModelBox(Scope, 98, 59, 1.8595F, -0.0236F, 6.6908F, 2, 2, 1, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-2.2405F, -0.2236F, 6.5065F);
		Scope.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, -1.5708F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 52, 17, -0.5F, -1.0F, -0.5657F, 1, 2, 1, -0.1F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 99, 41, -0.5F, -1.0F, 0.0657F, 1, 2, 1, -0.1F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 22, 50, -1.0657F, -1.0F, -0.5F, 1, 2, 1, -0.1F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 80, 87, 0.0657F, -1.0F, -0.5F, 1, 2, 1, -0.1F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 52, 6, -0.5F, -1.0F, -1.0657F, 1, 2, 1, -0.1F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-2.2405F, -0.2236F, 6.5065F);
		Scope.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, -0.7854F, -1.5708F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 98, 89, -0.5F, -1.0F, 0.0657F, 1, 2, 1, -0.1F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 75, 97, -1.0657F, -1.0F, -0.5F, 1, 2, 1, -0.1F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 75, 79, 0.0657F, -1.0F, -0.5F, 1, 2, 1, -0.1F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 52, 56, -0.5F, -1.0F, -1.0657F, 1, 2, 1, -0.1F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(0.3595F, -3.1236F, 6.0565F);
		Scope.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, -0.7854F, 0.0F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 37, 6, -0.5F, -1.0F, -0.5F, 1, 2, 1, -0.1F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(0.3595F, -3.1236F, 6.8565F);
		Scope.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, -0.7854F, 0.0F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 37, 0, -0.5F, -1.0F, -0.5F, 1, 2, 1, -0.1F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(1.1595F, -3.1236F, 6.8565F);
		Scope.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, -0.7854F, 0.0F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 37, 36, -0.5F, -1.0F, -0.5F, 1, 2, 1, -0.1F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(1.1595F, -3.1236F, 6.0565F);
		Scope.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, -0.7854F, 0.0F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 7, 42, -0.5F, -1.0F, -0.5F, 1, 2, 1, -0.1F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-1.1991F, -0.1386F, 10.6908F);
		Scope.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, 0.0F, -1.1781F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 12, 70, 0.0F, -1.0F, -6.0F, 2, 2, 7, -0.1F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(-1.3576F, 2.0183F, 10.6908F);
		Scope.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.0F, 0.0F, -0.3927F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 59, 67, 0.0F, -2.0F, -6.0F, 2, 2, 7, -0.1F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(0.4136F, 2.7071F, 10.6908F);
		Scope.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.0F, 0.0F, -1.1781F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 26, 67, 0.0F, -2.0F, -6.0F, 2, 2, 7, -0.1F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(2.5704F, -1.3686F, 10.6908F);
		Scope.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.0F, 0.0F, -1.1781F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 67, -1.0F, -2.0F, -6.0F, 2, 2, 7, -0.1F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(2.7181F, -0.1386F, 10.6908F);
		Scope.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.0F, 0.0F, -0.3927F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 69, 28, -1.0F, -2.0F, -6.0F, 2, 2, 7, -0.1F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(-1.0515F, -1.3686F, 10.6908F);
		Scope.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.0F, 0.0F, -0.3927F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 47, 64, 0.0F, -1.0F, -6.0F, 2, 2, 7, -0.1F, false));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(2.8766F, 2.0183F, 10.6908F);
		Scope.addChild(cube_r34);
		setRotationAngle(cube_r34, 0.0F, 0.0F, -1.1781F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 62, 57, 0.0F, -2.0F, -6.0F, 2, 2, 7, -0.1F, false));

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(1.1054F, 2.7071F, 10.6908F);
		Scope.addChild(cube_r35);
		setRotationAngle(cube_r35, 0.0F, 0.0F, -0.3927F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 60, 46, 0.0F, -2.0F, -6.0F, 2, 2, 7, -0.1F, false));

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(1.4595F, 0.3199F, 16.3583F);
		Scope.addChild(cube_r36);
		setRotationAngle(cube_r36, 0.2182F, 0.0F, -0.7854F);
		cube_r36.cubeList.add(new ModelBox(cube_r36, 15, 44, -0.6456F, -2.2114F, -2.0201F, 1, 1, 4, 0.0F, false));

		cube_r37 = new ModelRenderer(this);
		cube_r37.setRotationPoint(0.4595F, 0.0199F, 16.3583F);
		Scope.addChild(cube_r37);
		setRotationAngle(cube_r37, -0.2182F, 0.0F, -0.7854F);
		cube_r37.cubeList.add(new ModelBox(cube_r37, 82, 0, -0.1294F, 0.4364F, -2.2201F, 1, 1, 4, 0.0F, false));

		cube_r38 = new ModelRenderer(this);
		cube_r38.setRotationPoint(-1.2635F, 1.3199F, 19.6671F);
		Scope.addChild(cube_r38);
		setRotationAngle(cube_r38, 0.0F, -0.2182F, 0.0F);
		cube_r38.cubeList.add(new ModelBox(cube_r38, 82, 9, 0.0F, -2.0F, -6.0F, 1, 1, 4, 0.0F, false));

		cube_r39 = new ModelRenderer(this);
		cube_r39.setRotationPoint(-0.0405F, 0.3199F, 16.3583F);
		Scope.addChild(cube_r39);
		setRotationAngle(cube_r39, 0.0F, -0.2182F, -0.7854F);
		cube_r39.cubeList.add(new ModelBox(cube_r39, 82, 38, -0.4614F, -0.2294F, -2.3201F, 1, 1, 4, 0.0F, false));

		cube_r40 = new ModelRenderer(this);
		cube_r40.setRotationPoint(0.2595F, -0.2505F, 20.1F);
		Scope.addChild(cube_r40);
		setRotationAngle(cube_r40, 0.2182F, 0.0F, 0.0F);
		cube_r40.cubeList.add(new ModelBox(cube_r40, 0, 0, 0.0F, -2.0F, -6.0F, 1, 1, 4, 0.0F, false));

		cube_r41 = new ModelRenderer(this);
		cube_r41.setRotationPoint(0.7595F, 0.3199F, 16.3583F);
		Scope.addChild(cube_r41);
		setRotationAngle(cube_r41, 0.0F, 0.2182F, -0.7854F);
		cube_r41.cubeList.add(new ModelBox(cube_r41, 73, 87, 0.7114F, -0.8456F, -2.1201F, 1, 1, 4, 0.0F, false));

		cube_r42 = new ModelRenderer(this);
		cube_r42.setRotationPoint(1.8062F, 1.3199F, 19.8836F);
		Scope.addChild(cube_r42);
		setRotationAngle(cube_r42, 0.0F, 0.2182F, 0.0F);
		cube_r42.cubeList.add(new ModelBox(cube_r42, 37, 83, 0.0F, -2.0F, -6.0F, 1, 1, 4, 0.0F, false));

		cube_r43 = new ModelRenderer(this);
		cube_r43.setRotationPoint(0.2595F, 2.8192F, 19.4507F);
		Scope.addChild(cube_r43);
		setRotationAngle(cube_r43, -0.2182F, 0.0F, 0.0F);
		cube_r43.cubeList.add(new ModelBox(cube_r43, 83, 69, 0.0F, -2.0F, -6.0F, 1, 1, 4, 0.0F, false));

		cube_r44 = new ModelRenderer(this);
		cube_r44.setRotationPoint(1.6422F, 2.5503F, 12.7908F);
		Scope.addChild(cube_r44);
		setRotationAngle(cube_r44, 0.0F, 0.0F, -0.3927F);
		cube_r44.cubeList.add(new ModelBox(cube_r44, 0, 42, 0.0F, -2.0F, -13.0F, 1, 1, 12, 0.0F, false));
		cube_r44.cubeList.add(new ModelBox(cube_r44, 11, 88, 0.0F, -2.0F, 4.8F, 1, 1, 3, 0.0F, false));

		cube_r45 = new ModelRenderer(this);
		cube_r45.setRotationPoint(3.1072F, 1.6264F, 12.7908F);
		Scope.addChild(cube_r45);
		setRotationAngle(cube_r45, 0.0F, 0.0F, -1.1781F);
		cube_r45.cubeList.add(new ModelBox(cube_r45, 30, 28, 0.0F, -2.0F, -13.0F, 1, 1, 12, 0.0F, false));
		cube_r45.cubeList.add(new ModelBox(cube_r45, 88, 18, 0.0F, -2.0F, 4.8F, 1, 1, 3, 0.0F, false));

		cube_r46 = new ModelRenderer(this);
		cube_r46.setRotationPoint(2.7246F, -0.2974F, 12.7908F);
		Scope.addChild(cube_r46);
		setRotationAngle(cube_r46, 0.0F, 0.0F, -1.1781F);
		cube_r46.cubeList.add(new ModelBox(cube_r46, 15, 2, 0.0F, -2.0F, -13.0F, 1, 1, 12, 0.0F, false));
		cube_r46.cubeList.add(new ModelBox(cube_r46, 24, 69, 0.0F, -2.0F, 4.8F, 1, 1, 3, 0.0F, false));

		cube_r47 = new ModelRenderer(this);
		cube_r47.setRotationPoint(2.0248F, 0.6264F, 12.7908F);
		Scope.addChild(cube_r47);
		setRotationAngle(cube_r47, 0.0F, 0.0F, -0.3927F);
		cube_r47.cubeList.add(new ModelBox(cube_r47, 15, 44, 0.0F, -2.0F, -13.0F, 1, 1, 12, 0.0F, false));
		cube_r47.cubeList.add(new ModelBox(cube_r47, 92, 61, 0.0F, -2.0F, 4.8F, 1, 1, 3, 0.0F, false));

		cube_r48 = new ModelRenderer(this);
		cube_r48.setRotationPoint(0.101F, 0.2438F, 12.7908F);
		Scope.addChild(cube_r48);
		setRotationAngle(cube_r48, 0.0F, 0.0F, -0.3927F);
		cube_r48.cubeList.add(new ModelBox(cube_r48, 30, 14, 0.0F, -2.0F, -13.0F, 1, 1, 12, 0.0F, false));

		cube_r49 = new ModelRenderer(this);
		cube_r49.setRotationPoint(0.8007F, 0.0853F, 12.7908F);
		Scope.addChild(cube_r49);
		setRotationAngle(cube_r49, 0.0F, 0.0F, -1.1781F);
		cube_r49.cubeList.add(new ModelBox(cube_r49, 0, 0, 0.0F, -2.0F, -13.0F, 1, 1, 12, 0.0F, false));

		cube_r50 = new ModelRenderer(this);
		cube_r50.setRotationPoint(1.1834F, 2.0091F, 12.7908F);
		Scope.addChild(cube_r50);
		setRotationAngle(cube_r50, 0.0F, 0.0F, -1.1781F);
		cube_r50.cubeList.add(new ModelBox(cube_r50, 30, 0, 0.0F, -2.0F, -13.0F, 1, 1, 12, 0.0F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 89, 6, 0.0F, -2.0F, 4.8F, 1, 1, 3, 0.0F, false));

		cube_r51 = new ModelRenderer(this);
		cube_r51.setRotationPoint(-0.2817F, 2.1676F, 12.7908F);
		Scope.addChild(cube_r51);
		setRotationAngle(cube_r51, 0.0F, 0.0F, -0.3927F);
		cube_r51.cubeList.add(new ModelBox(cube_r51, 0, 28, 0.0F, -2.0F, -13.0F, 1, 1, 12, 0.0F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 89, 24, 0.0F, -2.0F, 4.8F, 1, 1, 3, 0.0F, false));

		cube_r52 = new ModelRenderer(this);
		cube_r52.setRotationPoint(0.101F, 0.2438F, 19.5908F);
		Scope.addChild(cube_r52);
		setRotationAngle(cube_r52, 0.0F, 0.0F, -0.3927F);
		cube_r52.cubeList.add(new ModelBox(cube_r52, 72, 21, 0.0F, -2.0F, -2.0F, 1, 1, 3, 0.0F, false));

		cube_r53 = new ModelRenderer(this);
		cube_r53.setRotationPoint(0.8007F, 0.0853F, 19.5908F);
		Scope.addChild(cube_r53);
		setRotationAngle(cube_r53, 0.0F, 0.0F, -1.1781F);
		cube_r53.cubeList.add(new ModelBox(cube_r53, 12, 58, 0.0F, -2.0F, -2.0F, 1, 1, 3, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-0.4476F, 0.32F, -2.3381F);
		Scope.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 58, 78, 0.7071F, -0.4257F, 12.0F, 1, 1, 7, -0.1F, false));
		bone5.cubeList.add(new ModelBox(bone5, 45, 42, 0.7071F, -0.0022F, -6.0F, 1, 1, 9, 0.2F, false));

		cube_r54 = new ModelRenderer(this);
		cube_r54.setRotationPoint(1.5607F, 6.1214F, 2.0F);
		bone5.addChild(cube_r54);
		setRotationAngle(cube_r54, 0.0F, 0.0F, -3.1416F);
		cube_r54.cubeList.add(new ModelBox(cube_r54, 0, 56, -0.1464F, 7.1036F, -8.0F, 1, 1, 9, 0.2F, false));

		cube_r55 = new ModelRenderer(this);
		cube_r55.setRotationPoint(1.7607F, -0.7957F, 2.0F);
		bone5.addChild(cube_r55);
		setRotationAngle(cube_r55, 0.0F, 0.0F, -2.3562F);
		cube_r55.cubeList.add(new ModelBox(cube_r55, 60, 17, -0.3232F, -0.1161F, -8.0F, 1, 1, 9, 0.2F, false));

		cube_r56 = new ModelRenderer(this);
		cube_r56.setRotationPoint(1.7607F, -0.3957F, 2.0F);
		bone5.addChild(cube_r56);
		setRotationAngle(cube_r56, 0.0F, 0.0F, -0.7854F);
		cube_r56.cubeList.add(new ModelBox(cube_r56, 48, 53, -0.8232F, 0.0303F, -8.0F, 1, 1, 9, 0.2F, false));

		cube_r57 = new ModelRenderer(this);
		cube_r57.setRotationPoint(1.8435F, -0.5957F, 2.0F);
		bone5.addChild(cube_r57);
		setRotationAngle(cube_r57, 0.0F, 0.0F, -1.5708F);
		cube_r57.cubeList.add(new ModelBox(cube_r57, 57, 31, -0.6036F, -0.1464F, -8.0F, 1, 1, 9, 0.2F, false));

		cube_r58 = new ModelRenderer(this);
		cube_r58.setRotationPoint(0.3207F, -0.7422F, 2.0F);
		bone5.addChild(cube_r58);
		setRotationAngle(cube_r58, 0.0F, 0.0F, 1.5708F);
		cube_r58.cubeList.add(new ModelBox(cube_r58, 60, 0, -0.25F, -0.3964F, -8.0F, 1, 1, 9, 0.2F, false));

		cube_r59 = new ModelRenderer(this);
		cube_r59.setRotationPoint(0.4036F, -0.9422F, 2.0F);
		bone5.addChild(cube_r59);
		setRotationAngle(cube_r59, 0.0F, 0.0F, 2.3562F);
		cube_r59.cubeList.add(new ModelBox(cube_r59, 12, 58, -0.75F, -0.3964F, -8.0F, 1, 1, 9, 0.2F, false));

		cube_r60 = new ModelRenderer(this);
		cube_r60.setRotationPoint(-0.2F, 0.2078F, 2.0F);
		bone5.addChild(cube_r60);
		setRotationAngle(cube_r60, 0.0F, 0.0F, 0.7854F);
		cube_r60.cubeList.add(new ModelBox(cube_r60, 33, 56, 0.0F, -1.0F, -8.0F, 1, 1, 9, 0.2F, false));

		cube_r61 = new ModelRenderer(this);
		cube_r61.setRotationPoint(0.1F, -0.0914F, 18.0F);
		bone5.addChild(cube_r61);
		setRotationAngle(cube_r61, 0.0F, 0.0F, 0.7854F);
		cube_r61.cubeList.add(new ModelBox(cube_r61, 24, 77, 0.0F, -1.0F, -6.0F, 1, 1, 7, -0.1F, false));

		cube_r62 = new ModelRenderer(this);
		cube_r62.setRotationPoint(0.745F, -0.7414F, 18.0F);
		bone5.addChild(cube_r62);
		setRotationAngle(cube_r62, 0.0F, 0.0F, 1.5708F);
		cube_r62.cubeList.add(new ModelBox(cube_r62, 48, 76, -0.25F, -0.3964F, -6.0F, 1, 1, 7, -0.1F, false));

		cube_r63 = new ModelRenderer(this);
		cube_r63.setRotationPoint(0.7036F, -0.6414F, 18.0F);
		bone5.addChild(cube_r63);
		setRotationAngle(cube_r63, 0.0F, 0.0F, 2.3562F);
		cube_r63.cubeList.add(new ModelBox(cube_r63, 0, 77, -0.75F, -0.3964F, -6.0F, 1, 1, 7, -0.1F, false));

		cube_r64 = new ModelRenderer(this);
		cube_r64.setRotationPoint(1.5607F, -0.4536F, 18.0F);
		bone5.addChild(cube_r64);
		setRotationAngle(cube_r64, 0.0F, 0.0F, -3.1416F);
		cube_r64.cubeList.add(new ModelBox(cube_r64, 72, 0, -0.1464F, 0.1036F, -6.0F, 1, 1, 7, -0.1F, false));

		cube_r65 = new ModelRenderer(this);
		cube_r65.setRotationPoint(1.4607F, -0.495F, 18.0F);
		bone5.addChild(cube_r65);
		setRotationAngle(cube_r65, 0.0F, 0.0F, -2.3562F);
		cube_r65.cubeList.add(new ModelBox(cube_r65, 38, 74, -0.3232F, -0.1161F, -6.0F, 1, 1, 7, -0.1F, false));

		cube_r66 = new ModelRenderer(this);
		cube_r66.setRotationPoint(1.4607F, -0.695F, 18.0F);
		bone5.addChild(cube_r66);
		setRotationAngle(cube_r66, 0.0F, 0.0F, -0.7854F);
		cube_r66.cubeList.add(new ModelBox(cube_r66, 74, 49, -0.8232F, 0.0303F, -6.0F, 1, 1, 7, -0.1F, false));

		cube_r67 = new ModelRenderer(this);
		cube_r67.setRotationPoint(1.4192F, -0.595F, 18.0F);
		bone5.addChild(cube_r67);
		setRotationAngle(cube_r67, 0.0F, 0.0F, -1.5708F);
		cube_r67.cubeList.add(new ModelBox(cube_r67, 74, 60, -0.6036F, -0.1464F, -6.0F, 1, 1, 7, -0.1F, false));

		Eyepiece = new ModelRenderer(this);
		Eyepiece.setRotationPoint(-3.5F, 16.25F, 13.9F);
		Eyepiece.cubeList.add(new ModelBox(Eyepiece, 0, 81, 0.5F, -21.15F, 2.2F, 1, 1, 1, -0.1F, false));
		Eyepiece.cubeList.add(new ModelBox(Eyepiece, 71, 28, 0.5F, -25.8536F, 2.2F, 1, 1, 1, -0.1F, false));
		Eyepiece.cubeList.add(new ModelBox(Eyepiece, 37, 62, 2.8518F, -23.5018F, 2.2F, 1, 1, 1, -0.1F, false));
		Eyepiece.cubeList.add(new ModelBox(Eyepiece, 52, 23, -1.8518F, -23.5018F, 2.2F, 1, 1, 1, -0.1F, false));

		cube_r68 = new ModelRenderer(this);
		cube_r68.setRotationPoint(-0.7336F, -24.0082F, 1.6636F);
		Eyepiece.addChild(cube_r68);
		setRotationAngle(cube_r68, 0.2618F, 0.0F, -0.3927F);
		cube_r68.cubeList.add(new ModelBox(cube_r68, 72, 4, 0.0F, -1.0F, 0.0F, 2, 1, 1, -0.1F, false));

		cube_r69 = new ModelRenderer(this);
		cube_r69.setRotationPoint(-0.7717F, -22.8876F, 1.6636F);
		Eyepiece.addChild(cube_r69);
		setRotationAngle(cube_r69, 0.2618F, 0.0F, -1.1781F);
		cube_r69.cubeList.add(new ModelBox(cube_r69, 48, 78, 0.0F, -1.0F, 0.0F, 2, 1, 1, -0.1F, false));

		cube_r70 = new ModelRenderer(this);
		cube_r70.setRotationPoint(-0.8987F, -20.8986F, 1.4048F);
		Eyepiece.addChild(cube_r70);
		setRotationAngle(cube_r70, 0.0F, -0.2618F, -0.3927F);
		cube_r70.cubeList.add(new ModelBox(cube_r70, 7, 48, 0.0F, -2.0F, 0.0F, 1, 2, 1, -0.1F, false));

		cube_r71 = new ModelRenderer(this);
		cube_r71.setRotationPoint(0.7446F, -20.3377F, 1.4048F);
		Eyepiece.addChild(cube_r71);
		setRotationAngle(cube_r71, 0.0F, -0.2618F, -1.1781F);
		cube_r71.cubeList.add(new ModelBox(cube_r71, 37, 44, 0.0F, -2.0F, 0.0F, 1, 2, 1, -0.1F, false));

		cube_r72 = new ModelRenderer(this);
		cube_r72.setRotationPoint(1.2554F, -20.3377F, 1.4048F);
		Eyepiece.addChild(cube_r72);
		setRotationAngle(cube_r72, -0.2618F, 0.0F, -0.3927F);
		cube_r72.cubeList.add(new ModelBox(cube_r72, 78, 21, 0.0F, -1.0F, 0.0F, 2, 1, 1, -0.1F, false));

		cube_r73 = new ModelRenderer(this);
		cube_r73.setRotationPoint(2.8987F, -20.8986F, 1.4048F);
		Eyepiece.addChild(cube_r73);
		setRotationAngle(cube_r73, -0.2618F, 0.0F, -1.1781F);
		cube_r73.cubeList.add(new ModelBox(cube_r73, 72, 15, 0.0F, -1.0F, 0.0F, 2, 1, 1, -0.1F, false));

		cube_r74 = new ModelRenderer(this);
		cube_r74.setRotationPoint(2.7336F, -24.0082F, 1.6636F);
		Eyepiece.addChild(cube_r74);
		setRotationAngle(cube_r74, 0.0F, 0.2618F, -1.1781F);
		cube_r74.cubeList.add(new ModelBox(cube_r74, 22, 44, 0.0F, -2.0F, 0.0F, 1, 2, 1, -0.1F, false));

		cube_r75 = new ModelRenderer(this);
		cube_r75.setRotationPoint(2.7717F, -22.8876F, 1.6636F);
		Eyepiece.addChild(cube_r75);
		setRotationAngle(cube_r75, 0.0F, 0.2618F, -0.3927F);
		cube_r75.cubeList.add(new ModelBox(cube_r75, 37, 50, 0.0F, -2.0F, 0.0F, 1, 2, 1, -0.1F, false));

		cube_r76 = new ModelRenderer(this);
		cube_r76.setRotationPoint(0.6541F, -20.1193F, 2.2F);
		Eyepiece.addChild(cube_r76);
		setRotationAngle(cube_r76, 0.0F, 0.0F, -1.1781F);
		cube_r76.cubeList.add(new ModelBox(cube_r76, 7, 0, 0.0F, -2.0F, 0.0F, 1, 2, 1, -0.1F, false));

		cube_r77 = new ModelRenderer(this);
		cube_r77.setRotationPoint(-1.1171F, -20.8082F, 2.2F);
		Eyepiece.addChild(cube_r77);
		setRotationAngle(cube_r77, 0.0F, 0.0F, -0.3927F);
		cube_r77.cubeList.add(new ModelBox(cube_r77, 7, 6, 0.0F, -2.0F, 0.0F, 1, 2, 1, -0.1F, false));

		cube_r78 = new ModelRenderer(this);
		cube_r78.setRotationPoint(2.811F, -24.195F, 2.2F);
		Eyepiece.addChild(cube_r78);
		setRotationAngle(cube_r78, 0.0F, 0.0F, -1.1781F);
		cube_r78.cubeList.add(new ModelBox(cube_r78, 7, 14, 0.0F, -2.0F, 0.0F, 1, 2, 1, -0.1F, false));

		cube_r79 = new ModelRenderer(this);
		cube_r79.setRotationPoint(2.9586F, -22.965F, 2.2F);
		Eyepiece.addChild(cube_r79);
		setRotationAngle(cube_r79, 0.0F, 0.0F, -0.3927F);
		cube_r79.cubeList.add(new ModelBox(cube_r79, 7, 20, 0.0F, -2.0F, 0.0F, 1, 2, 1, -0.1F, false));

		cube_r80 = new ModelRenderer(this);
		cube_r80.setRotationPoint(-0.9586F, -22.965F, 2.2F);
		Eyepiece.addChild(cube_r80);
		setRotationAngle(cube_r80, 0.0F, 0.0F, -1.1781F);
		cube_r80.cubeList.add(new ModelBox(cube_r80, 71, 42, 0.0F, -1.0F, 0.0F, 2, 1, 1, -0.1F, false));

		cube_r81 = new ModelRenderer(this);
		cube_r81.setRotationPoint(-0.811F, -24.195F, 2.2F);
		Eyepiece.addChild(cube_r81);
		setRotationAngle(cube_r81, 0.0F, 0.0F, -0.3927F);
		cube_r81.cubeList.add(new ModelBox(cube_r81, 45, 23, 0.0F, -1.0F, 0.0F, 2, 1, 1, -0.1F, false));

		cube_r82 = new ModelRenderer(this);
		cube_r82.setRotationPoint(3.1171F, -20.8082F, 2.2F);
		Eyepiece.addChild(cube_r82);
		setRotationAngle(cube_r82, 0.0F, 0.0F, -1.1781F);
		cube_r82.cubeList.add(new ModelBox(cube_r82, 52, 0, 0.0F, -1.0F, 0.0F, 2, 1, 1, -0.1F, false));

		cube_r83 = new ModelRenderer(this);
		cube_r83.setRotationPoint(1.3459F, -20.1193F, 2.2F);
		Eyepiece.addChild(cube_r83);
		setRotationAngle(cube_r83, 0.0F, 0.0F, -0.3927F);
		cube_r83.cubeList.add(new ModelBox(cube_r83, 60, 11, 0.0F, -1.0F, 0.0F, 2, 1, 1, -0.1F, false));

		cube_r84 = new ModelRenderer(this);
		cube_r84.setRotationPoint(0.5F, -20.3863F, 1.4048F);
		Eyepiece.addChild(cube_r84);
		setRotationAngle(cube_r84, -0.2618F, 0.0F, 0.0F);
		cube_r84.cubeList.add(new ModelBox(cube_r84, 100, 93, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		cube_r85 = new ModelRenderer(this);
		cube_r85.setRotationPoint(0.5F, -24.6514F, 1.6636F);
		Eyepiece.addChild(cube_r85);
		setRotationAngle(cube_r85, 0.2618F, 0.0F, 0.0F);
		cube_r85.cubeList.add(new ModelBox(cube_r85, 89, 100, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		cube_r86 = new ModelRenderer(this);
		cube_r86.setRotationPoint(-1.6155F, -22.5018F, 1.4048F);
		Eyepiece.addChild(cube_r86);
		setRotationAngle(cube_r86, 0.0F, -0.2618F, 0.0F);
		cube_r86.cubeList.add(new ModelBox(cube_r86, 100, 86, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		cube_r87 = new ModelRenderer(this);
		cube_r87.setRotationPoint(2.6495F, -22.5018F, 1.6636F);
		Eyepiece.addChild(cube_r87);
		setRotationAngle(cube_r87, 0.0F, 0.2618F, 0.0F);
		cube_r87.cubeList.add(new ModelBox(cube_r87, 84, 100, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		OpticAccurrized = new ModelRenderer(this);
		OpticAccurrized.setRotationPoint(0.0F, 0.0F, 10.6F);
		Eyepiece.addChild(OpticAccurrized);
		OpticAccurrized.cubeList.add(new ModelBox(OpticAccurrized, 51, 87, 0.5F, -22.2F, -14.9F, 1, 1, 4, 0.1F, false));
		OpticAccurrized.cubeList.add(new ModelBox(OpticAccurrized, 0, 86, 1.8066F, -23.5066F, -14.9F, 1, 1, 4, 0.1F, false));
		OpticAccurrized.cubeList.add(new ModelBox(OpticAccurrized, 0, 42, 0.5F, -24.8131F, -14.9F, 1, 1, 4, 0.1F, false));
		OpticAccurrized.cubeList.add(new ModelBox(OpticAccurrized, 30, 30, 1.1F, -25.4131F, -14.4F, 1, 1, 4, -0.4F, false));
		OpticAccurrized.cubeList.add(new ModelBox(OpticAccurrized, 30, 16, -0.1F, -25.4131F, -14.4F, 1, 1, 4, -0.4F, false));
		OpticAccurrized.cubeList.add(new ModelBox(OpticAccurrized, 30, 6, -0.1F, -21.6131F, -14.4F, 1, 1, 4, -0.4F, false));
		OpticAccurrized.cubeList.add(new ModelBox(OpticAccurrized, 15, 30, 1.1F, -21.6131F, -14.4F, 1, 1, 4, -0.4F, false));
		OpticAccurrized.cubeList.add(new ModelBox(OpticAccurrized, 0, 28, -1.4066F, -22.9066F, -14.4F, 1, 1, 4, -0.4F, false));
		OpticAccurrized.cubeList.add(new ModelBox(OpticAccurrized, 30, 0, -1.4066F, -24.1066F, -14.4F, 1, 1, 4, -0.4F, false));
		OpticAccurrized.cubeList.add(new ModelBox(OpticAccurrized, 15, 16, 2.4066F, -22.9066F, -14.4F, 1, 1, 4, -0.4F, false));
		OpticAccurrized.cubeList.add(new ModelBox(OpticAccurrized, 0, 20, 2.4066F, -24.1066F, -14.4F, 1, 1, 4, -0.4F, false));
		OpticAccurrized.cubeList.add(new ModelBox(OpticAccurrized, 84, 48, -0.8066F, -23.5066F, -14.9F, 1, 1, 4, 0.1F, false));
		OpticAccurrized.cubeList.add(new ModelBox(OpticAccurrized, 10, 80, 0.5F, -21.9774F, -16.0F, 1, 1, 2, 0.1F, false));
		OpticAccurrized.cubeList.add(new ModelBox(OpticAccurrized, 58, 87, 2.0679F, -23.5453F, -16.0F, 1, 1, 2, 0.1F, false));
		OpticAccurrized.cubeList.add(new ModelBox(OpticAccurrized, 30, 36, 0.5F, -25.1131F, -16.0F, 1, 1, 2, 0.1F, false));
		OpticAccurrized.cubeList.add(new ModelBox(OpticAccurrized, 53, 93, -1.0679F, -23.5453F, -16.0F, 1, 1, 2, 0.1F, false));
		OpticAccurrized.cubeList.add(new ModelBox(OpticAccurrized, 38, 89, 0.5F, -22.4476F, -11.8F, 1, 1, 3, 0.0F, false));
		OpticAccurrized.cubeList.add(new ModelBox(OpticAccurrized, 90, 66, 1.5453F, -23.4929F, -11.8F, 1, 1, 3, 0.0F, false));
		OpticAccurrized.cubeList.add(new ModelBox(OpticAccurrized, 60, 17, 0.5F, -24.5381F, -11.8F, 1, 1, 3, 0.0F, false));
		OpticAccurrized.cubeList.add(new ModelBox(OpticAccurrized, 91, 77, -0.5453F, -23.4929F, -11.8F, 1, 1, 3, 0.0F, false));

		cube_r88 = new ModelRenderer(this);
		cube_r88.setRotationPoint(0.0895F, -20.6992F, -7.7F);
		OpticAccurrized.addChild(cube_r88);
		setRotationAngle(cube_r88, 0.0F, 0.0F, -0.3927F);
		cube_r88.cubeList.add(new ModelBox(cube_r88, 91, 72, 0.0F, -2.0F, -4.0F, 1, 1, 3, -0.1F, false));

		cube_r89 = new ModelRenderer(this);
		cube_r89.setRotationPoint(1.478F, -20.9343F, -7.7F);
		OpticAccurrized.addChild(cube_r89);
		setRotationAngle(cube_r89, 0.0F, 0.0F, -1.1781F);
		cube_r89.cubeList.add(new ModelBox(cube_r89, 91, 54, 0.0F, -2.0F, -4.0F, 1, 1, 3, -0.1F, false));

		cube_r90 = new ModelRenderer(this);
		cube_r90.setRotationPoint(1.1719F, -22.6734F, -7.7F);
		OpticAccurrized.addChild(cube_r90);
		setRotationAngle(cube_r90, 0.0F, 0.0F, -1.1781F);
		cube_r90.cubeList.add(new ModelBox(cube_r90, 60, 56, 0.0F, -2.0F, -4.0F, 1, 1, 3, -0.1F, false));

		cube_r91 = new ModelRenderer(this);
		cube_r91.setRotationPoint(0.3956F, -22.4383F, -7.7F);
		OpticAccurrized.addChild(cube_r91);
		setRotationAngle(cube_r91, 0.0F, 0.0F, -0.3927F);
		cube_r91.cubeList.add(new ModelBox(cube_r91, 91, 46, 0.0F, -2.0F, -4.0F, 1, 1, 3, -0.1F, false));

		cube_r92 = new ModelRenderer(this);
		cube_r92.setRotationPoint(2.1347F, -22.1322F, -7.7F);
		OpticAccurrized.addChild(cube_r92);
		setRotationAngle(cube_r92, 0.0F, 0.0F, -0.3927F);
		cube_r92.cubeList.add(new ModelBox(cube_r92, 93, 0, 0.0F, -2.0F, -4.0F, 1, 1, 3, -0.1F, false));

		cube_r93 = new ModelRenderer(this);
		cube_r93.setRotationPoint(2.911F, -22.9795F, -7.7F);
		OpticAccurrized.addChild(cube_r93);
		setRotationAngle(cube_r93, 0.0F, 0.0F, -1.1781F);
		cube_r93.cubeList.add(new ModelBox(cube_r93, 44, 91, 0.0F, -2.0F, -4.0F, 1, 1, 3, -0.1F, false));

		cube_r94 = new ModelRenderer(this);
		cube_r94.setRotationPoint(3.2171F, -21.2404F, -7.7F);
		OpticAccurrized.addChild(cube_r94);
		setRotationAngle(cube_r94, 0.0F, 0.0F, -1.1781F);
		cube_r94.cubeList.add(new ModelBox(cube_r94, 90, 41, 0.0F, -2.0F, -4.0F, 1, 1, 3, -0.1F, false));

		cube_r95 = new ModelRenderer(this);
		cube_r95.setRotationPoint(1.8286F, -20.3931F, -7.7F);
		OpticAccurrized.addChild(cube_r95);
		setRotationAngle(cube_r95, 0.0F, 0.0F, -0.3927F);
		cube_r95.cubeList.add(new ModelBox(cube_r95, 90, 12, 0.0F, -2.0F, -4.0F, 1, 1, 3, -0.1F, false));

		cube_r96 = new ModelRenderer(this);
		cube_r96.setRotationPoint(-0.2719F, -20.5434F, -13.0F);
		OpticAccurrized.addChild(cube_r96);
		setRotationAngle(cube_r96, 0.0F, 0.0F, -0.3927F);
		cube_r96.cubeList.add(new ModelBox(cube_r96, 9, 93, 0.0F, -2.0F, -3.0F, 1, 1, 2, 0.1F, false));

		cube_r97 = new ModelRenderer(this);
		cube_r97.setRotationPoint(1.2698F, -20.6253F, -13.0F);
		OpticAccurrized.addChild(cube_r97);
		setRotationAngle(cube_r97, 0.0F, 0.0F, -1.1781F);
		cube_r97.cubeList.add(new ModelBox(cube_r97, 92, 29, 0.0F, -2.0F, -3.0F, 1, 1, 2, 0.1F, false));

		cube_r98 = new ModelRenderer(this);
		cube_r98.setRotationPoint(0.8105F, -22.934F, -13.0F);
		OpticAccurrized.addChild(cube_r98);
		setRotationAngle(cube_r98, 0.0F, 0.0F, -1.1781F);
		cube_r98.cubeList.add(new ModelBox(cube_r98, 15, 50, 0.0F, -2.0F, -3.0F, 1, 1, 2, 0.1F, false));

		cube_r99 = new ModelRenderer(this);
		cube_r99.setRotationPoint(0.1874F, -22.852F, -13.0F);
		OpticAccurrized.addChild(cube_r99);
		setRotationAngle(cube_r99, 0.0F, 0.0F, -0.3927F);
		cube_r99.cubeList.add(new ModelBox(cube_r99, 69, 87, 0.0F, -2.0F, -3.0F, 1, 1, 2, 0.1F, false));

		cube_r100 = new ModelRenderer(this);
		cube_r100.setRotationPoint(2.496F, -22.3928F, -13.0F);
		OpticAccurrized.addChild(cube_r100);
		setRotationAngle(cube_r100, 0.0F, 0.0F, -0.3927F);
		cube_r100.cubeList.add(new ModelBox(cube_r100, 35, 98, 0.0F, -2.0F, -3.0F, 1, 1, 2, 0.1F, false));

		cube_r101 = new ModelRenderer(this);
		cube_r101.setRotationPoint(3.1192F, -23.3932F, -13.0F);
		OpticAccurrized.addChild(cube_r101);
		setRotationAngle(cube_r101, 0.0F, 0.0F, -1.1781F);
		cube_r101.cubeList.add(new ModelBox(cube_r101, 15, 36, 0.0F, -2.0F, -3.0F, 1, 1, 2, 0.1F, false));

		cube_r102 = new ModelRenderer(this);
		cube_r102.setRotationPoint(3.5784F, -21.0846F, -13.0F);
		OpticAccurrized.addChild(cube_r102);
		setRotationAngle(cube_r102, 0.0F, 0.0F, -1.1781F);
		cube_r102.cubeList.add(new ModelBox(cube_r102, 7, 86, 0.0F, -2.0F, -3.0F, 1, 1, 2, 0.1F, false));

		cube_r103 = new ModelRenderer(this);
		cube_r103.setRotationPoint(2.0368F, -20.0842F, -13.0F);
		OpticAccurrized.addChild(cube_r103);
		setRotationAngle(cube_r103, 0.0F, 0.0F, -0.3927F);
		cube_r103.cubeList.add(new ModelBox(cube_r103, 20, 80, 0.0F, -2.0F, -3.0F, 1, 1, 2, 0.1F, false));

		cube_r104 = new ModelRenderer(this);
		cube_r104.setRotationPoint(3.0651F, -23.2239F, -9.8F);
		OpticAccurrized.addChild(cube_r104);
		setRotationAngle(cube_r104, 0.0F, 0.0F, -1.1781F);
		cube_r104.cubeList.add(new ModelBox(cube_r104, 30, 44, 0.0F, -2.0F, -5.0F, 1, 1, 4, 0.0F, false));

		cube_r105 = new ModelRenderer(this);
		cube_r105.setRotationPoint(2.3654F, -22.3F, -9.8F);
		OpticAccurrized.addChild(cube_r105);
		setRotationAngle(cube_r105, 0.0F, 0.0F, -0.3927F);
		cube_r105.cubeList.add(new ModelBox(cube_r105, 62, 87, 0.0F, -2.0F, -5.0F, 1, 1, 4, 0.0F, false));

		cube_r106 = new ModelRenderer(this);
		cube_r106.setRotationPoint(1.3239F, -20.7173F, -9.8F);
		OpticAccurrized.addChild(cube_r106);
		setRotationAngle(cube_r106, 0.0F, 0.0F, -1.1781F);
		cube_r106.cubeList.add(new ModelBox(cube_r106, 84, 79, 0.0F, -2.0F, -5.0F, 1, 1, 4, 0.0F, false));

		cube_r107 = new ModelRenderer(this);
		cube_r107.setRotationPoint(-0.1412F, -20.5588F, -9.8F);
		OpticAccurrized.addChild(cube_r107);
		setRotationAngle(cube_r107, 0.0F, 0.0F, -0.3927F);
		cube_r107.cubeList.add(new ModelBox(cube_r107, 84, 58, 0.0F, -2.0F, -5.0F, 1, 1, 4, 0.0F, false));

		cube_r108 = new ModelRenderer(this);
		cube_r108.setRotationPoint(-5.9614F, -22.0484F, -9.4F);
		OpticAccurrized.addChild(cube_r108);
		setRotationAngle(cube_r108, 0.0F, 0.0F, 0.7854F);
		cube_r108.cubeList.add(new ModelBox(cube_r108, 0, 14, 5.9F, -6.1F, -5.0F, 1, 1, 4, -0.4F, false));

		cube_r109 = new ModelRenderer(this);
		cube_r109.setRotationPoint(-6.3222F, -24.8768F, -9.4F);
		OpticAccurrized.addChild(cube_r109);
		setRotationAngle(cube_r109, 0.0F, 0.0F, 0.7854F);
		cube_r109.cubeList.add(new ModelBox(cube_r109, 0, 6, 6.0F, -2.2F, -5.0F, 1, 1, 4, -0.4F, false));

		cube_r110 = new ModelRenderer(this);
		cube_r110.setRotationPoint(-1.7188F, -20.9949F, -9.4F);
		OpticAccurrized.addChild(cube_r110);
		setRotationAngle(cube_r110, 0.0F, 0.0F, 0.7854F);
		cube_r110.cubeList.add(new ModelBox(cube_r110, 15, 0, 0.0F, -6.0F, -5.0F, 1, 1, 4, -0.4F, false));

		cube_r111 = new ModelRenderer(this);
		cube_r111.setRotationPoint(-2.0795F, -23.8233F, -9.4F);
		OpticAccurrized.addChild(cube_r111);
		setRotationAngle(cube_r111, 0.0F, 0.0F, 0.7854F);
		cube_r111.cubeList.add(new ModelBox(cube_r111, 15, 6, 0.1F, -2.1F, -5.0F, 1, 1, 4, -0.4F, false));

		cube_r112 = new ModelRenderer(this);
		cube_r112.setRotationPoint(0.2415F, -22.6827F, -9.8F);
		OpticAccurrized.addChild(cube_r112);
		setRotationAngle(cube_r112, 0.0F, 0.0F, -0.3927F);
		cube_r112.cubeList.add(new ModelBox(cube_r112, 44, 85, 0.0F, -2.0F, -5.0F, 1, 1, 4, 0.0F, false));

		cube_r113 = new ModelRenderer(this);
		cube_r113.setRotationPoint(0.9412F, -22.8412F, -9.8F);
		OpticAccurrized.addChild(cube_r113);
		setRotationAngle(cube_r113, 0.0F, 0.0F, -1.1781F);
		cube_r113.cubeList.add(new ModelBox(cube_r113, 0, 34, 0.0F, -2.0F, -5.0F, 1, 1, 4, 0.0F, false));

		cube_r114 = new ModelRenderer(this);
		cube_r114.setRotationPoint(3.4478F, -21.1F, -9.8F);
		OpticAccurrized.addChild(cube_r114);
		setRotationAngle(cube_r114, 0.0F, 0.0F, -1.1781F);
		cube_r114.cubeList.add(new ModelBox(cube_r114, 21, 86, 0.0F, -2.0F, -5.0F, 1, 1, 4, 0.0F, false));

		cube_r115 = new ModelRenderer(this);
		cube_r115.setRotationPoint(1.9827F, -20.1761F, -9.8F);
		OpticAccurrized.addChild(cube_r115);
		setRotationAngle(cube_r115, 0.0F, 0.0F, -0.3927F);
		cube_r115.cubeList.add(new ModelBox(cube_r115, 86, 85, 0.0F, -2.0F, -5.0F, 1, 1, 4, 0.0F, false));

		rib = new ModelRenderer(this);
		rib.setRotationPoint(-1.829F, -26.3582F, -8.9F);
		OpticAccurrized.addChild(rib);
		

		bone = new ModelRenderer(this);
		bone.setRotationPoint(5.0543F, -1.3709F, 0.0F);
		rib.addChild(bone);
		

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(5.0543F, -4.3709F, 0.0F);
		rib.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, 1.5708F);
		

		cube_r116 = new ModelRenderer(this);
		cube_r116.setRotationPoint(-1.5612F, 3.3452F, 0.0F);
		bone2.addChild(cube_r116);
		setRotationAngle(cube_r116, 0.0F, 0.0F, 0.3927F);
		cube_r116.cubeList.add(new ModelBox(cube_r116, 94, 17, 7.4606F, -7.2145F, -0.6F, 2, 2, 1, -0.4F, false));
		cube_r116.cubeList.add(new ModelBox(cube_r116, 96, 11, 7.4606F, -7.2145F, -1.3F, 2, 2, 1, -0.4F, false));
		cube_r116.cubeList.add(new ModelBox(cube_r116, 96, 37, 7.4606F, -7.2145F, -2.0F, 2, 2, 1, -0.4F, false));

		cube_r117 = new ModelRenderer(this);
		cube_r117.setRotationPoint(-3.2706F, 2.1846F, 0.0F);
		bone2.addChild(cube_r117);
		setRotationAngle(cube_r117, 0.0F, 0.0F, 1.1781F);
		cube_r117.cubeList.add(new ModelBox(cube_r117, 60, 5, 2.9145F, -12.7606F, -0.6F, 2, 2, 1, -0.4F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 47, 67, 2.9145F, -12.7606F, -1.3F, 2, 2, 1, -0.4F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 59, 67, 2.9145F, -12.7606F, -2.0F, 2, 2, 1, -0.4F, false));

		cube_r118 = new ModelRenderer(this);
		cube_r118.setRotationPoint(-3.0385F, 4.0341F, 0.0F);
		bone2.addChild(cube_r118);
		setRotationAngle(cube_r118, 0.0F, 0.0F, 1.1781F);
		cube_r118.cubeList.add(new ModelBox(cube_r118, 67, 93, 1.7665F, -9.9889F, -0.6F, 2, 2, 1, -0.4F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 33, 94, 1.7665F, -9.9889F, -1.3F, 2, 2, 1, -0.4F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 80, 96, 1.7665F, -9.9889F, -2.0F, 2, 2, 1, -0.4F, false));

		cube_r119 = new ModelRenderer(this);
		cube_r119.setRotationPoint(-0.4106F, 6.113F, 0.0F);
		bone2.addChild(cube_r119);
		setRotationAngle(cube_r119, 0.0F, 0.0F, 0.3927F);
		cube_r119.cubeList.add(new ModelBox(cube_r119, 60, 93, 4.6889F, -6.0665F, -0.6F, 2, 2, 1, -0.4F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 26, 94, 4.6889F, -6.0665F, -1.3F, 2, 2, 1, -0.4F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 87, 96, 4.6889F, -6.0665F, -2.0F, 2, 2, 1, -0.4F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(5.0543F, -4.3709F, 0.0F);
		rib.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.0F, -3.1416F);
		bone3.cubeList.add(new ModelBox(bone3, 69, 31, 1.2253F, -7.141F, -2.0F, 2, 2, 1, -0.4F, false));
		bone3.cubeList.add(new ModelBox(bone3, 61, 97, -0.3425F, -8.7089F, -2.0F, 2, 2, 1, -0.4F, false));
		bone3.cubeList.add(new ModelBox(bone3, 40, 96, 2.7932F, -8.7089F, -2.0F, 2, 2, 1, -0.4F, false));
		bone3.cubeList.add(new ModelBox(bone3, 12, 69, 1.2253F, -10.2767F, -2.0F, 2, 2, 1, -0.4F, false));
		bone3.cubeList.add(new ModelBox(bone3, 60, 22, 1.2253F, -7.141F, -1.3F, 2, 2, 1, -0.4F, false));
		bone3.cubeList.add(new ModelBox(bone3, 97, 33, -0.3425F, -8.7089F, -1.3F, 2, 2, 1, -0.4F, false));
		bone3.cubeList.add(new ModelBox(bone3, 95, 23, 2.7932F, -8.7089F, -1.3F, 2, 2, 1, -0.4F, false));
		bone3.cubeList.add(new ModelBox(bone3, 64, 42, 1.2253F, -10.2767F, -1.3F, 2, 2, 1, -0.4F, false));
		bone3.cubeList.add(new ModelBox(bone3, 30, 50, 1.2253F, -7.141F, -0.6F, 2, 2, 1, -0.4F, false));
		bone3.cubeList.add(new ModelBox(bone3, 7, 97, -0.3425F, -8.7089F, -0.6F, 2, 2, 1, -0.4F, false));
		bone3.cubeList.add(new ModelBox(bone3, 93, 85, 2.7932F, -8.7089F, -0.6F, 2, 2, 1, -0.4F, false));
		bone3.cubeList.add(new ModelBox(bone3, 33, 58, 1.2253F, -10.2767F, -0.6F, 2, 2, 1, -0.4F, false));

		cube_r120 = new ModelRenderer(this);
		cube_r120.setRotationPoint(1.7248F, 1.964F, 0.0F);
		bone3.addChild(cube_r120);
		setRotationAngle(cube_r120, 0.0F, 0.0F, 0.3927F);
		cube_r120.cubeList.add(new ModelBox(cube_r120, 14, 97, -3.9145F, -11.7606F, -0.6F, 2, 2, 1, -0.4F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 97, 51, -3.9145F, -11.7606F, -1.3F, 2, 2, 1, -0.4F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 54, 97, -3.9145F, -11.7606F, -2.0F, 2, 2, 1, -0.4F, false));

		cube_r121 = new ModelRenderer(this);
		cube_r121.setRotationPoint(-0.201F, 1.02F, 0.0F);
		bone3.addChild(cube_r121);
		setRotationAngle(cube_r121, 0.0F, 0.0F, 1.1781F);
		cube_r121.cubeList.add(new ModelBox(cube_r121, 97, 71, -8.4606F, -8.2145F, -0.6F, 2, 2, 1, -0.4F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 98, 27, -8.4606F, -8.2145F, -1.3F, 2, 2, 1, -0.4F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 28, 98, -8.4606F, -8.2145F, -2.0F, 2, 2, 1, -0.4F, false));

		cube_r122 = new ModelRenderer(this);
		cube_r122.setRotationPoint(-2.9689F, -0.1306F, 0.0F);
		bone3.addChild(cube_r122);
		setRotationAngle(cube_r122, 0.0F, 0.0F, 1.1781F);
		cube_r122.cubeList.add(new ModelBox(cube_r122, 68, 97, -5.6889F, -7.0665F, -0.6F, 2, 2, 1, -0.4F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 21, 98, -5.6889F, -7.0665F, -1.3F, 2, 2, 1, -0.4F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 98, 45, -5.6889F, -7.0665F, -2.0F, 2, 2, 1, -0.4F, false));

		cube_r123 = new ModelRenderer(this);
		cube_r123.setRotationPoint(-0.1246F, 1.7319F, 0.0F);
		bone3.addChild(cube_r123);
		setRotationAngle(cube_r123, 0.0F, 0.0F, 0.3927F);
		cube_r123.cubeList.add(new ModelBox(cube_r123, 74, 93, -2.7665F, -8.9889F, -0.6F, 2, 2, 1, -0.4F, false));
		cube_r123.cubeList.add(new ModelBox(cube_r123, 95, 5, -2.7665F, -8.9889F, -1.3F, 2, 2, 1, -0.4F, false));
		cube_r123.cubeList.add(new ModelBox(cube_r123, 47, 96, -2.7665F, -8.9889F, -2.0F, 2, 2, 1, -0.4F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(5.0543F, -4.3709F, 0.0F);
		rib.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 0.0F, -1.5708F);
		

		LensCap = new ModelRenderer(this);
		LensCap.setRotationPoint(-3.1038F, 3.271F, -10.4F);
		setRotationAngle(LensCap, 0.2433F, 0.743F, 0.1285F);
		

		cube_r124 = new ModelRenderer(this);
		cube_r124.setRotationPoint(3.1701F, -1.0926F, 2.3753F);
		LensCap.addChild(cube_r124);
		setRotationAngle(cube_r124, 0.2194F, -0.2143F, -1.1581F);
		cube_r124.cubeList.add(new ModelBox(cube_r124, 89, 38, -1.9532F, 2.4151F, -0.8753F, 1, 1, 1, 0.3F, false));

		cube_r125 = new ModelRenderer(this);
		cube_r125.setRotationPoint(3.1701F, -1.0926F, 2.3753F);
		LensCap.addChild(cube_r125);
		setRotationAngle(cube_r125, 0.0F, -0.3054F, -0.3491F);
		cube_r125.cubeList.add(new ModelBox(cube_r125, 100, 80, -0.2663F, 2.9202F, -0.8753F, 1, 1, 1, 0.3F, false));

		cube_r126 = new ModelRenderer(this);
		cube_r126.setRotationPoint(3.1701F, -1.0926F, 2.3753F);
		LensCap.addChild(cube_r126);
		setRotationAngle(cube_r126, 0.3054F, 0.0F, -1.9199F);
		cube_r126.cubeList.add(new ModelBox(cube_r126, 84, 64, -2.7888F, 0.8651F, -0.8753F, 1, 1, 1, 0.3F, false));
		cube_r126.cubeList.add(new ModelBox(cube_r126, 35, 89, -2.8231F, -0.3006F, -0.8753F, 1, 1, 1, 0.3F, false));

		cube_r127 = new ModelRenderer(this);
		cube_r127.setRotationPoint(3.1701F, -1.0926F, 2.3753F);
		LensCap.addChild(cube_r127);
		setRotationAngle(cube_r127, 0.2194F, 0.2143F, -2.6816F);
		cube_r127.cubeList.add(new ModelBox(cube_r127, 82, 15, -2.2837F, -0.8218F, -0.8753F, 1, 1, 1, 0.3F, false));

		cube_r128 = new ModelRenderer(this);
		cube_r128.setRotationPoint(3.1701F, -1.0926F, 2.3753F);
		LensCap.addChild(cube_r128);
		setRotationAngle(cube_r128, 0.7082F, 0.8169F, 2.8014F);
		cube_r128.cubeList.add(new ModelBox(cube_r128, 22, 6, -0.8987F, 1.1331F, -1.7021F, 1, 2, 1, -0.2F, false));

		cube_r129 = new ModelRenderer(this);
		cube_r129.setRotationPoint(3.1701F, -1.0926F, 2.3753F);
		LensCap.addChild(cube_r129);
		setRotationAngle(cube_r129, 1.0036F, 0.3054F, 2.7925F);
		cube_r129.cubeList.add(new ModelBox(cube_r129, 22, 30, -0.7337F, -0.5237F, -1.8795F, 1, 2, 1, -0.2F, false));

		cube_r130 = new ModelRenderer(this);
		cube_r130.setRotationPoint(3.1701F, -1.0926F, 2.3753F);
		LensCap.addChild(cube_r130);
		setRotationAngle(cube_r130, 0.4233F, 0.3897F, -2.6205F);
		cube_r130.cubeList.add(new ModelBox(cube_r130, 0, 97, 1.7049F, 1.8283F, 0.7006F, 1, 1, 2, -0.2F, false));

		cube_r131 = new ModelRenderer(this);
		cube_r131.setRotationPoint(3.1701F, -1.0926F, 2.3753F);
		LensCap.addChild(cube_r131);
		setRotationAngle(cube_r131, 0.0F, 0.3054F, 2.7925F);
		cube_r131.cubeList.add(new ModelBox(cube_r131, 7, 34, -0.7337F, -0.5575F, -1.3753F, 1, 2, 1, -0.2F, false));
		cube_r131.cubeList.add(new ModelBox(cube_r131, 100, 83, -0.7337F, -1.6575F, -0.8753F, 1, 1, 1, 0.3F, false));

		cube_r132 = new ModelRenderer(this);
		cube_r132.setRotationPoint(3.1701F, -1.0926F, 2.3753F);
		LensCap.addChild(cube_r132);
		setRotationAngle(cube_r132, -0.2194F, 0.2143F, 1.9834F);
		cube_r132.cubeList.add(new ModelBox(cube_r132, 79, 100, 0.9532F, -1.1524F, -0.8753F, 1, 1, 1, 0.3F, false));

		cube_r133 = new ModelRenderer(this);
		cube_r133.setRotationPoint(3.1701F, -1.0926F, 2.3753F);
		LensCap.addChild(cube_r133);
		setRotationAngle(cube_r133, -0.3054F, 0.0F, 1.2217F);
		cube_r133.cubeList.add(new ModelBox(cube_r133, 28, 86, 1.7888F, 0.3976F, -0.8753F, 1, 1, 1, 0.3F, false));

		cube_r134 = new ModelRenderer(this);
		cube_r134.setRotationPoint(3.1701F, -1.0926F, 2.3753F);
		LensCap.addChild(cube_r134);
		setRotationAngle(cube_r134, -0.2194F, -0.2143F, 0.46F);
		cube_r134.cubeList.add(new ModelBox(cube_r134, 89, 0, 1.2837F, 2.0845F, -0.8753F, 1, 1, 1, 0.3F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Mount.render(f5);
		Scope.render(f5);
		Eyepiece.render(f5);
		LensCap.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}