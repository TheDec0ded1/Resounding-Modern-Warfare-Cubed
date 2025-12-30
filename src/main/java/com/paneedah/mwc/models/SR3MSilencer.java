package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;

import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;


// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SR3MSilencer extends ModelWithAttachments {
	private final ModelRenderer barrel2;
	private final ModelRenderer barrel3;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer bone5;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer bone6;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer barrelouter;
	private final ModelRenderer bone8;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer bone7;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer bone9;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer bone10;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer barrelouter2;
	private final ModelRenderer bone11;
	private final ModelRenderer cube_r34;
	private final ModelRenderer cube_r35;
	private final ModelRenderer bone12;
	private final ModelRenderer cube_r36;
	private final ModelRenderer cube_r37;
	private final ModelRenderer bone21;
	private final ModelRenderer cube_r38;
	private final ModelRenderer cube_r39;
	private final ModelRenderer bone22;
	private final ModelRenderer cube_r40;
	private final ModelRenderer cube_r41;
	private final ModelRenderer barrelouter5;
	private final ModelRenderer bone24;
	private final ModelRenderer cube_r46;
	private final ModelRenderer cube_r47;
	private final ModelRenderer bone25;
	private final ModelRenderer cube_r48;
	private final ModelRenderer cube_r49;
	private final ModelRenderer bone26;
	private final ModelRenderer cube_r50;
	private final ModelRenderer cube_r51;
	private final ModelRenderer bone27;
	private final ModelRenderer cube_r52;
	private final ModelRenderer cube_r53;
	private final ModelRenderer barrelouter6;
	private final ModelRenderer bone28;
	private final ModelRenderer cube_r54;
	private final ModelRenderer cube_r55;
	private final ModelRenderer bone29;
	private final ModelRenderer cube_r56;
	private final ModelRenderer cube_r57;
	private final ModelRenderer bone30;
	private final ModelRenderer cube_r58;
	private final ModelRenderer cube_r59;
	private final ModelRenderer bone31;
	private final ModelRenderer cube_r60;
	private final ModelRenderer cube_r61;

	public SR3MSilencer() {
		textureWidth = 256;
		textureHeight = 256;

		barrel2 = new ModelRenderer(this);
		barrel2.setRotationPoint(-1.0F, -12.8F, -85.5F);
		

		barrel3 = new ModelRenderer(this);
		barrel3.setRotationPoint(1.0F, 36.8F, 85.5F);
		barrel2.addChild(barrel3);
		

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-1.5F, -37.8F, -85.5F);
		barrel3.addChild(bone3);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.4363F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 49, 93, 0.0F, 0.0F, -11.0F, 2, 1, 45, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.4363F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 92, -2.0F, 0.0F, -11.0F, 2, 1, 45, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-1.5F, -32.4F, -85.5F);
		barrel3.addChild(bone4);
		

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone4.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.4363F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, 0.0F, -1.0F, -11.0F, 2, 1, 45, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone4.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.4363F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 46, -2.0F, -1.0F, -11.0F, 2, 1, 45, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(1.2F, -35.1F, -85.5F);
		barrel3.addChild(bone5);
		setRotationAngle(bone5, 0.0F, 0.0F, 1.5708F);
		

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.4363F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 49, 1, 0.0F, 0.0F, -11.0F, 2, 1, 45, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 70.2F, 0.0F);
		bone5.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.4363F);
		

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.4363F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 49, 47, -2.0F, 0.0F, -11.0F, 2, 1, 45, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-4.2F, -35.1F, -85.5F);
		barrel3.addChild(bone6);
		setRotationAngle(bone6, 0.0F, 0.0F, -1.5708F);
		

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone6.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.4363F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 98, 0, -2.0F, 0.0F, -11.0F, 2, 1, 44, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone6.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 0.4363F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 98, 47, 0.0F, 0.0F, -11.0F, 2, 1, 44, 0.0F, false));

		barrelouter = new ModelRenderer(this);
		barrelouter.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrel2.addChild(barrelouter);
		

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-0.5F, 4.4F, 0.0F);
		barrelouter.addChild(bone8);
		

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone8.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.4363F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 20, 133, 0.0F, -2.0F, -11.0F, 2, 2, 2, 0.05F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone8.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 0.4363F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 110, 133, -2.0F, -2.0F, -11.0F, 2, 2, 2, 0.051F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter.addChild(bone7);
		setRotationAngle(bone7, 0.0F, 0.0F, 1.5708F);
		

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone7.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, 0.4363F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 134, 36, 0.0F, 0.0F, -11.0F, 2, 2, 2, 0.052F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone7.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.4363F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 145, 108, -2.0F, 0.0F, -11.0F, 2, 2, 2, 0.05F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter.addChild(bone9);
		setRotationAngle(bone9, 0.0F, 0.0F, -1.5708F);
		

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone9.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -0.4363F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 124, 133, -2.0F, 0.0F, -11.0F, 2, 2, 2, 0.05F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone9.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, 0.4363F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 134, 32, 0.0F, 0.0F, -11.0F, 2, 2, 2, 0.052F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter.addChild(bone10);
		

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone10.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, 0.4363F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 145, 112, 0.0F, 0.0F, -11.0F, 2, 2, 2, 0.051F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone10.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, -0.4363F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 109, 157, -2.0F, 0.0F, -11.0F, 2, 2, 2, 0.05F, false));

		barrelouter2 = new ModelRenderer(this);
		barrelouter2.setRotationPoint(0.0F, 0.0F, 26.0F);
		barrel2.addChild(barrelouter2);
		

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(-0.5F, 4.4F, 0.0F);
		barrelouter2.addChild(bone11);
		

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone11.addChild(cube_r34);
		setRotationAngle(cube_r34, 0.0F, 0.0F, -0.4363F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 176, 20, 0.0F, -1.0F, -37.0F, 2, 1, 4, 0.2F, false));

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone11.addChild(cube_r35);
		setRotationAngle(cube_r35, 0.0F, 0.0F, 0.4363F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 37, 176, -2.0F, -1.0F, -37.0F, 2, 1, 4, 0.2F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter2.addChild(bone12);
		setRotationAngle(bone12, 0.0F, 0.0F, 1.5708F);
		

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone12.addChild(cube_r36);
		setRotationAngle(cube_r36, 0.0F, 0.0F, 0.4363F);
		cube_r36.cubeList.add(new ModelBox(cube_r36, 176, 10, 0.0F, 0.0F, -37.0F, 2, 1, 4, 0.2F, false));

		cube_r37 = new ModelRenderer(this);
		cube_r37.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone12.addChild(cube_r37);
		setRotationAngle(cube_r37, 0.0F, 0.0F, -0.4363F);
		cube_r37.cubeList.add(new ModelBox(cube_r37, 176, 15, -2.0F, 0.0F, -37.0F, 2, 1, 4, 0.2F, false));

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter2.addChild(bone21);
		setRotationAngle(bone21, 0.0F, 0.0F, -1.5708F);
		

		cube_r38 = new ModelRenderer(this);
		cube_r38.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone21.addChild(cube_r38);
		setRotationAngle(cube_r38, 0.0F, 0.0F, -0.4363F);
		cube_r38.cubeList.add(new ModelBox(cube_r38, 176, 0, -2.0F, 0.0F, -37.0F, 2, 1, 4, 0.2F, false));

		cube_r39 = new ModelRenderer(this);
		cube_r39.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone21.addChild(cube_r39);
		setRotationAngle(cube_r39, 0.0F, 0.0F, 0.4363F);
		cube_r39.cubeList.add(new ModelBox(cube_r39, 176, 5, 0.0F, 0.0F, -37.0F, 2, 1, 4, 0.2F, false));

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter2.addChild(bone22);
		

		cube_r40 = new ModelRenderer(this);
		cube_r40.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone22.addChild(cube_r40);
		setRotationAngle(cube_r40, 0.0F, 0.0F, 0.4363F);
		cube_r40.cubeList.add(new ModelBox(cube_r40, 29, 174, 0.0F, 0.0F, -37.0F, 2, 1, 4, 0.2F, false));

		cube_r41 = new ModelRenderer(this);
		cube_r41.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone22.addChild(cube_r41);
		setRotationAngle(cube_r41, 0.0F, 0.0F, -0.4363F);
		cube_r41.cubeList.add(new ModelBox(cube_r41, 175, 162, -2.0F, 0.0F, -37.0F, 2, 1, 4, 0.2F, false));

		barrelouter5 = new ModelRenderer(this);
		barrelouter5.setRotationPoint(0.0F, 0.0F, 42.9F);
		barrel2.addChild(barrelouter5);
		

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(-0.5F, 4.4F, 0.0F);
		barrelouter5.addChild(bone24);
		

		cube_r46 = new ModelRenderer(this);
		cube_r46.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone24.addChild(cube_r46);
		setRotationAngle(cube_r46, 0.0F, 0.0F, -0.4363F);
		

		cube_r47 = new ModelRenderer(this);
		cube_r47.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone24.addChild(cube_r47);
		setRotationAngle(cube_r47, 0.0F, 0.0F, 0.4363F);
		

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter5.addChild(bone25);
		setRotationAngle(bone25, 0.0F, 0.0F, 1.5708F);
		bone25.cubeList.add(new ModelBox(bone25, 126, 116, -0.5F, 0.3F, -9.0F, 1, 1, 2, 0.0F, false));

		cube_r48 = new ModelRenderer(this);
		cube_r48.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone25.addChild(cube_r48);
		setRotationAngle(cube_r48, 0.0F, 0.0F, 0.4363F);
		

		cube_r49 = new ModelRenderer(this);
		cube_r49.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone25.addChild(cube_r49);
		setRotationAngle(cube_r49, 0.0F, 0.0F, -0.4363F);
		

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter5.addChild(bone26);
		setRotationAngle(bone26, 0.0F, 0.0F, -1.5708F);
		

		cube_r50 = new ModelRenderer(this);
		cube_r50.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone26.addChild(cube_r50);
		setRotationAngle(cube_r50, 0.0F, 0.0F, -0.4363F);
		

		cube_r51 = new ModelRenderer(this);
		cube_r51.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone26.addChild(cube_r51);
		setRotationAngle(cube_r51, 0.0F, 0.0F, 0.4363F);
		

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter5.addChild(bone27);
		

		cube_r52 = new ModelRenderer(this);
		cube_r52.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone27.addChild(cube_r52);
		setRotationAngle(cube_r52, 0.0F, 0.0F, 0.4363F);
		

		cube_r53 = new ModelRenderer(this);
		cube_r53.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone27.addChild(cube_r53);
		setRotationAngle(cube_r53, 0.0F, 0.0F, -0.4363F);
		

		barrelouter6 = new ModelRenderer(this);
		barrelouter6.setRotationPoint(0.0F, 0.0F, 4.0F);
		barrel2.addChild(barrelouter6);
		

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(-0.5F, 4.4F, 0.0F);
		barrelouter6.addChild(bone28);
		

		cube_r54 = new ModelRenderer(this);
		cube_r54.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone28.addChild(cube_r54);
		setRotationAngle(cube_r54, 0.0F, 0.0F, -0.4363F);
		cube_r54.cubeList.add(new ModelBox(cube_r54, 0, 67, 0.0F, -1.0F, -11.0F, 2, 1, 20, 0.05F, false));

		cube_r55 = new ModelRenderer(this);
		cube_r55.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone28.addChild(cube_r55);
		setRotationAngle(cube_r55, 0.0F, 0.0F, 0.4363F);
		cube_r55.cubeList.add(new ModelBox(cube_r55, 49, 68, -2.0F, -1.0F, -11.0F, 2, 1, 20, 0.05F, false));

		bone29 = new ModelRenderer(this);
		bone29.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter6.addChild(bone29);
		setRotationAngle(bone29, 0.0F, 0.0F, 1.5708F);
		

		cube_r56 = new ModelRenderer(this);
		cube_r56.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone29.addChild(cube_r56);
		setRotationAngle(cube_r56, 0.0F, 0.0F, 0.4363F);
		cube_r56.cubeList.add(new ModelBox(cube_r56, 49, 21, 0.0F, 0.0F, -11.0F, 2, 1, 20, 0.05F, false));

		cube_r57 = new ModelRenderer(this);
		cube_r57.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone29.addChild(cube_r57);
		setRotationAngle(cube_r57, 0.0F, 0.0F, -0.4363F);
		cube_r57.cubeList.add(new ModelBox(cube_r57, 49, 47, -2.0F, 0.0F, -11.0F, 2, 1, 20, 0.05F, false));

		bone30 = new ModelRenderer(this);
		bone30.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter6.addChild(bone30);
		setRotationAngle(bone30, 0.0F, 0.0F, -1.5708F);
		

		cube_r58 = new ModelRenderer(this);
		cube_r58.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone30.addChild(cube_r58);
		setRotationAngle(cube_r58, 0.0F, 0.0F, -0.4363F);
		cube_r58.cubeList.add(new ModelBox(cube_r58, 0, 46, -2.0F, 0.0F, -11.0F, 2, 1, 20, 0.05F, false));

		cube_r59 = new ModelRenderer(this);
		cube_r59.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone30.addChild(cube_r59);
		setRotationAngle(cube_r59, 0.0F, 0.0F, 0.4363F);
		cube_r59.cubeList.add(new ModelBox(cube_r59, 49, 0, 0.0F, 0.0F, -11.0F, 2, 1, 20, 0.05F, false));

		bone31 = new ModelRenderer(this);
		bone31.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter6.addChild(bone31);
		

		cube_r60 = new ModelRenderer(this);
		cube_r60.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone31.addChild(cube_r60);
		setRotationAngle(cube_r60, 0.0F, 0.0F, 0.4363F);
		cube_r60.cubeList.add(new ModelBox(cube_r60, 0, 0, 0.0F, 0.0F, -11.0F, 2, 1, 20, 0.05F, false));

		cube_r61 = new ModelRenderer(this);
		cube_r61.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone31.addChild(cube_r61);
		setRotationAngle(cube_r61, 0.0F, 0.0F, -0.4363F);
		cube_r61.cubeList.add(new ModelBox(cube_r61, 0, 21, -2.0F, 0.0F, -11.0F, 2, 1, 20, 0.05F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		barrel2.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}