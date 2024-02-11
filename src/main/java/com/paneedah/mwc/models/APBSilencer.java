package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class APBSilencer extends ModelBase {
	private final ModelRenderer suppressor;
	private final ModelRenderer cube_r85_r1;
	private final ModelRenderer cube_r84_r1;
	private final ModelRenderer cube_r84_r2;
	private final ModelRenderer cube_r83_r1;
	private final ModelRenderer barrel3;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer bone5;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer bone6;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer barrelouter;
	private final ModelRenderer bone8;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer bone7;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer bone9;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer bone10;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r34;
	private final ModelRenderer barrelouter2;
	private final ModelRenderer bone11;
	private final ModelRenderer cube_r35;
	private final ModelRenderer cube_r36;
	private final ModelRenderer bone12;
	private final ModelRenderer cube_r37;
	private final ModelRenderer cube_r38;
	private final ModelRenderer bone24;
	private final ModelRenderer cube_r39;
	private final ModelRenderer cube_r40;
	private final ModelRenderer bone25;
	private final ModelRenderer cube_r41;
	private final ModelRenderer cube_r46;
	private final ModelRenderer barrelouter5;
	private final ModelRenderer bone26;
	private final ModelRenderer cube_r47;
	private final ModelRenderer cube_r48;
	private final ModelRenderer bone27;
	private final ModelRenderer cube_r49;
	private final ModelRenderer cube_r50;
	private final ModelRenderer bone28;
	private final ModelRenderer cube_r51;
	private final ModelRenderer cube_r52;
	private final ModelRenderer bone29;
	private final ModelRenderer cube_r53;
	private final ModelRenderer cube_r54;
	private final ModelRenderer barrelouter6;
	private final ModelRenderer bone30;
	private final ModelRenderer cube_r79;
	private final ModelRenderer cube_r80;
	private final ModelRenderer bone31;
	private final ModelRenderer cube_r81;
	private final ModelRenderer cube_r82;
	private final ModelRenderer bone32;
	private final ModelRenderer cube_r83;
	private final ModelRenderer cube_r84;
	private final ModelRenderer bone33;
	private final ModelRenderer cube_r85;
	private final ModelRenderer cube_r86;

	public APBSilencer() {
		textureWidth = 256;
		textureHeight = 256;

		suppressor = new ModelRenderer(this);
		suppressor.setRotationPoint(-1.0F, -15.9F, -90.0F);
		

		cube_r85_r1 = new ModelRenderer(this);
		cube_r85_r1.setRotationPoint(2.0335F, 5.6258F, 39.7F);
		suppressor.addChild(cube_r85_r1);
		setRotationAngle(cube_r85_r1, 0.0F, 0.0F, 1.5708F);
		cube_r85_r1.cubeList.add(new ModelBox(cube_r85_r1, 93, 136, 0.0F, 4.5F, 8.0F, 1, 1, 2, 0.15F, false));
		cube_r85_r1.cubeList.add(new ModelBox(cube_r85_r1, 60, 58, 0.0F, 4.5F, 10.3F, 1, 1, 9, 0.15F, false));

		cube_r84_r1 = new ModelRenderer(this);
		cube_r84_r1.setRotationPoint(1.9665F, 5.6258F, 39.7F);
		suppressor.addChild(cube_r84_r1);
		setRotationAngle(cube_r84_r1, 0.0F, 0.0F, 1.5708F);
		cube_r84_r1.cubeList.add(new ModelBox(cube_r84_r1, 79, 157, 0.0F, -0.5F, 8.0F, 1, 1, 2, 0.15F, false));
		cube_r84_r1.cubeList.add(new ModelBox(cube_r84_r1, 60, 58, 0.0F, -0.5F, 10.3F, 1, 1, 9, 0.15F, false));

		cube_r84_r2 = new ModelRenderer(this);
		cube_r84_r2.setRotationPoint(2.2835F, 5.6258F, 49.0F);
		suppressor.addChild(cube_r84_r2);
		setRotationAngle(cube_r84_r2, 0.0F, 0.0F, 1.5708F);
		cube_r84_r2.cubeList.add(new ModelBox(cube_r84_r2, 74, 72, 0.0F, 4.5F, -10.0F, 1, 1, 20, 0.05F, false));
		cube_r84_r2.cubeList.add(new ModelBox(cube_r84_r2, 74, 73, 0.0F, 4.5F, -30.0F, 1, 1, 20, 0.05F, false));

		cube_r83_r1 = new ModelRenderer(this);
		cube_r83_r1.setRotationPoint(1.7165F, 5.6258F, 49.0F);
		suppressor.addChild(cube_r83_r1);
		setRotationAngle(cube_r83_r1, 0.0F, 0.0F, 1.5708F);
		cube_r83_r1.cubeList.add(new ModelBox(cube_r83_r1, 74, 73, 0.0F, -0.5F, -10.0F, 1, 1, 20, 0.05F, false));
		cube_r83_r1.cubeList.add(new ModelBox(cube_r83_r1, 74, 73, 0.0F, -0.5F, -30.0F, 1, 1, 20, 0.05F, false));

		barrel3 = new ModelRenderer(this);
		barrel3.setRotationPoint(1.0F, 36.8F, 85.5F);
		suppressor.addChild(barrel3);
		

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-1.5F, -37.8F, -85.5F);
		barrel3.addChild(bone3);
		

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.4363F);
		

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.4363F);
		

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-1.5F, -32.4F, -85.5F);
		barrel3.addChild(bone4);
		

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone4.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.4363F);
		

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone4.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 0.4363F);
		

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(1.2F, -35.1F, -85.5F);
		barrel3.addChild(bone5);
		setRotationAngle(bone5, 0.0F, 0.0F, 1.5708F);
		

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 0.4363F);
		

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, 70.2F, 0.0F);
		bone5.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, 0.4363F);
		

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.4363F);
		

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-4.2F, -35.1F, -85.5F);
		barrel3.addChild(bone6);
		setRotationAngle(bone6, 0.0F, 0.0F, -1.5708F);
		

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone6.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -0.4363F);
		

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone6.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, 0.4363F);
		

		barrelouter = new ModelRenderer(this);
		barrelouter.setRotationPoint(0.0F, 0.0F, 0.0F);
		suppressor.addChild(barrelouter);
		

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-0.5F, 4.4F, 0.0F);
		barrelouter.addChild(bone8);
		

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone8.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, -0.4363F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 20, 133, -1.6904F, 1.6253F, 19.0F, 2, 2, 2, 0.05F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 20, 133, -1.6904F, 1.6253F, 39.0F, 2, 2, 2, 0.05F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone8.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, 0.4363F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 110, 133, -0.3096F, 1.6253F, 19.0F, 2, 2, 2, 0.051F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 110, 133, -0.3096F, 1.6253F, 39.0F, 2, 2, 2, 0.051F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter.addChild(bone7);
		setRotationAngle(bone7, 0.0F, 0.0F, 1.5708F);
		

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone7.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.4363F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 134, 36, 3.6253F, -1.6904F, 19.0F, 2, 2, 2, 0.052F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 134, 36, 3.6253F, -1.6904F, 39.0F, 2, 2, 2, 0.052F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone7.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.4363F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 145, 108, 1.6253F, 1.6903F, 19.0F, 2, 2, 2, 0.05F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter.addChild(bone9);
		setRotationAngle(bone9, 0.0F, 0.0F, -1.5708F);
		

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone9.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.4363F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 124, 133, -5.6253F, -1.6904F, 19.0F, 2, 2, 2, 0.05F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 124, 133, -5.6253F, -1.6904F, 39.0F, 2, 2, 2, 0.05F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone9.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.4363F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 134, 32, -3.6253F, 1.6903F, 19.0F, 2, 2, 2, 0.052F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter.addChild(bone10);
		

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone10.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.4363F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 145, 112, 1.6904F, 3.6253F, 19.0F, 2, 2, 2, 0.051F, false));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone10.addChild(cube_r34);
		setRotationAngle(cube_r34, 0.0F, 0.0F, -0.4363F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 109, 157, -3.6904F, 3.6253F, 19.0F, 2, 2, 2, 0.05F, false));

		barrelouter2 = new ModelRenderer(this);
		barrelouter2.setRotationPoint(0.0F, 0.0F, 26.0F);
		suppressor.addChild(barrelouter2);
		

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(-0.5F, 4.4F, 0.0F);
		barrelouter2.addChild(bone11);
		

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone11.addChild(cube_r35);
		setRotationAngle(cube_r35, 0.0F, 0.0F, -0.4363F);
		

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone11.addChild(cube_r36);
		setRotationAngle(cube_r36, 0.0F, 0.0F, 0.4363F);
		

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter2.addChild(bone12);
		setRotationAngle(bone12, 0.0F, 0.0F, 1.5708F);
		

		cube_r37 = new ModelRenderer(this);
		cube_r37.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone12.addChild(cube_r37);
		setRotationAngle(cube_r37, 0.0F, 0.0F, 0.4363F);
		

		cube_r38 = new ModelRenderer(this);
		cube_r38.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone12.addChild(cube_r38);
		setRotationAngle(cube_r38, 0.0F, 0.0F, -0.4363F);
		

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter2.addChild(bone24);
		setRotationAngle(bone24, 0.0F, 0.0F, -1.5708F);
		

		cube_r39 = new ModelRenderer(this);
		cube_r39.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone24.addChild(cube_r39);
		setRotationAngle(cube_r39, 0.0F, 0.0F, -0.4363F);
		

		cube_r40 = new ModelRenderer(this);
		cube_r40.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone24.addChild(cube_r40);
		setRotationAngle(cube_r40, 0.0F, 0.0F, 0.4363F);
		

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter2.addChild(bone25);
		

		cube_r41 = new ModelRenderer(this);
		cube_r41.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone25.addChild(cube_r41);
		setRotationAngle(cube_r41, 0.0F, 0.0F, 0.4363F);
		

		cube_r46 = new ModelRenderer(this);
		cube_r46.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone25.addChild(cube_r46);
		setRotationAngle(cube_r46, 0.0F, 0.0F, -0.4363F);
		

		barrelouter5 = new ModelRenderer(this);
		barrelouter5.setRotationPoint(0.0F, 0.0F, 42.9F);
		suppressor.addChild(barrelouter5);
		

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(-0.5F, 4.4F, 0.0F);
		barrelouter5.addChild(bone26);
		

		cube_r47 = new ModelRenderer(this);
		cube_r47.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone26.addChild(cube_r47);
		setRotationAngle(cube_r47, 0.0F, 0.0F, -0.4363F);
		

		cube_r48 = new ModelRenderer(this);
		cube_r48.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone26.addChild(cube_r48);
		setRotationAngle(cube_r48, 0.0F, 0.0F, 0.4363F);
		

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter5.addChild(bone27);
		setRotationAngle(bone27, 0.0F, 0.0F, 1.5708F);
		

		cube_r49 = new ModelRenderer(this);
		cube_r49.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone27.addChild(cube_r49);
		setRotationAngle(cube_r49, 0.0F, 0.0F, 0.4363F);
		

		cube_r50 = new ModelRenderer(this);
		cube_r50.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone27.addChild(cube_r50);
		setRotationAngle(cube_r50, 0.0F, 0.0F, -0.4363F);
		

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter5.addChild(bone28);
		setRotationAngle(bone28, 0.0F, 0.0F, -1.5708F);
		

		cube_r51 = new ModelRenderer(this);
		cube_r51.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone28.addChild(cube_r51);
		setRotationAngle(cube_r51, 0.0F, 0.0F, -0.4363F);
		

		cube_r52 = new ModelRenderer(this);
		cube_r52.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone28.addChild(cube_r52);
		setRotationAngle(cube_r52, 0.0F, 0.0F, 0.4363F);
		

		bone29 = new ModelRenderer(this);
		bone29.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter5.addChild(bone29);
		

		cube_r53 = new ModelRenderer(this);
		cube_r53.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone29.addChild(cube_r53);
		setRotationAngle(cube_r53, 0.0F, 0.0F, 0.4363F);
		

		cube_r54 = new ModelRenderer(this);
		cube_r54.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone29.addChild(cube_r54);
		setRotationAngle(cube_r54, 0.0F, 0.0F, -0.4363F);
		

		barrelouter6 = new ModelRenderer(this);
		barrelouter6.setRotationPoint(0.0F, 0.0F, 4.0F);
		suppressor.addChild(barrelouter6);
		

		bone30 = new ModelRenderer(this);
		bone30.setRotationPoint(-0.5F, 4.4F, 0.0F);
		barrelouter6.addChild(bone30);
		

		cube_r79 = new ModelRenderer(this);
		cube_r79.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone30.addChild(cube_r79);
		setRotationAngle(cube_r79, 0.0F, 0.0F, -0.4363F);
		cube_r79.cubeList.add(new ModelBox(cube_r79, 74, 72, -2.113F, 3.5316F, 15.0F, 2, 1, 20, 0.05F, false));
		cube_r79.cubeList.add(new ModelBox(cube_r79, 0, 67, -1.6904F, 2.6253F, 15.0F, 2, 1, 20, 0.05F, false));
		cube_r79.cubeList.add(new ModelBox(cube_r79, 3, 70, -0.9297F, 0.9939F, 18.0F, 2, 1, 17, 0.05F, false));
		cube_r79.cubeList.add(new ModelBox(cube_r79, 3, 70, -1.1678F, 1.719F, 18.0F, 2, 1, 17, 0.05F, false));
		cube_r79.cubeList.add(new ModelBox(cube_r79, 74, 72, -2.113F, 3.5316F, 35.0F, 2, 1, 20, 0.05F, false));
		cube_r79.cubeList.add(new ModelBox(cube_r79, 0, 67, -1.6904F, 2.6253F, 35.0F, 2, 1, 20, 0.05F, false));
		cube_r79.cubeList.add(new ModelBox(cube_r79, 3, 70, -0.9297F, 0.9939F, 38.0F, 2, 1, 17, 0.05F, false));
		cube_r79.cubeList.add(new ModelBox(cube_r79, 3, 70, -1.1678F, 1.719F, 38.0F, 2, 1, 17, 0.05F, false));
		cube_r79.cubeList.add(new ModelBox(cube_r79, 11, 78, -2.0913F, 3.7988F, 46.0F, 2, 1, 9, 0.15F, false));
		cube_r79.cubeList.add(new ModelBox(cube_r79, 11, 78, -1.6904F, 2.6253F, 46.0F, 2, 1, 9, 0.15F, false));
		cube_r79.cubeList.add(new ModelBox(cube_r79, 14, 81, -0.9297F, 0.9939F, 49.0F, 2, 1, 6, 0.15F, false));
		cube_r79.cubeList.add(new ModelBox(cube_r79, 14, 81, -1.1678F, 1.719F, 49.0F, 2, 1, 6, 0.15F, false));
		cube_r79.cubeList.add(new ModelBox(cube_r79, 103, 90, -2.0913F, 3.7988F, 43.7F, 2, 1, 2, 0.15F, false));
		cube_r79.cubeList.add(new ModelBox(cube_r79, 11, 78, -1.6904F, 2.6253F, 36.7F, 2, 1, 9, 0.15F, false));
		cube_r79.cubeList.add(new ModelBox(cube_r79, 14, 81, -0.9297F, 0.9939F, 39.7F, 2, 1, 6, 0.15F, false));
		cube_r79.cubeList.add(new ModelBox(cube_r79, 14, 81, -1.1678F, 1.719F, 39.7F, 2, 1, 6, 0.15F, false));

		cube_r80 = new ModelRenderer(this);
		cube_r80.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone30.addChild(cube_r80);
		setRotationAngle(cube_r80, 0.0F, 0.0F, 0.4363F);
		cube_r80.cubeList.add(new ModelBox(cube_r80, 74, 73, 0.113F, 3.5316F, 15.0F, 2, 1, 20, 0.05F, false));
		cube_r80.cubeList.add(new ModelBox(cube_r80, 49, 68, -0.3096F, 2.6253F, 15.0F, 2, 1, 20, 0.05F, false));
		cube_r80.cubeList.add(new ModelBox(cube_r80, 52, 71, -1.0703F, 0.9939F, 18.0F, 2, 1, 17, 0.05F, false));
		cube_r80.cubeList.add(new ModelBox(cube_r80, 52, 71, -0.8322F, 1.719F, 18.0F, 2, 1, 17, 0.05F, false));
		cube_r80.cubeList.add(new ModelBox(cube_r80, 74, 72, 0.113F, 3.5316F, 35.0F, 2, 1, 20, 0.05F, false));
		cube_r80.cubeList.add(new ModelBox(cube_r80, 49, 68, -0.3096F, 2.6253F, 35.0F, 2, 1, 20, 0.05F, false));
		cube_r80.cubeList.add(new ModelBox(cube_r80, 52, 71, -1.0703F, 0.9939F, 38.0F, 2, 1, 17, 0.05F, false));
		cube_r80.cubeList.add(new ModelBox(cube_r80, 52, 71, -0.8322F, 1.719F, 38.0F, 2, 1, 17, 0.05F, false));
		cube_r80.cubeList.add(new ModelBox(cube_r80, 60, 79, 0.0913F, 3.7988F, 46.0F, 2, 1, 9, 0.15F, false));
		cube_r80.cubeList.add(new ModelBox(cube_r80, 60, 79, -0.3096F, 2.6253F, 46.0F, 2, 1, 9, 0.15F, false));
		cube_r80.cubeList.add(new ModelBox(cube_r80, 63, 82, -1.0703F, 0.9939F, 49.0F, 2, 1, 6, 0.15F, false));
		cube_r80.cubeList.add(new ModelBox(cube_r80, 63, 82, -0.8322F, 1.719F, 49.0F, 2, 1, 6, 0.15F, false));
		cube_r80.cubeList.add(new ModelBox(cube_r80, 103, 164, 0.0913F, 3.7988F, 43.7F, 2, 1, 2, 0.15F, false));
		cube_r80.cubeList.add(new ModelBox(cube_r80, 60, 79, -0.3096F, 2.6253F, 36.7F, 2, 1, 9, 0.15F, false));
		cube_r80.cubeList.add(new ModelBox(cube_r80, 63, 82, -1.0703F, 0.9939F, 39.7F, 2, 1, 6, 0.15F, false));
		cube_r80.cubeList.add(new ModelBox(cube_r80, 63, 82, -0.8322F, 1.719F, 39.7F, 2, 1, 6, 0.15F, false));

		bone31 = new ModelRenderer(this);
		bone31.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter6.addChild(bone31);
		setRotationAngle(bone31, 0.0F, 0.0F, 1.5708F);
		

		cube_r81 = new ModelRenderer(this);
		cube_r81.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone31.addChild(cube_r81);
		setRotationAngle(cube_r81, 0.0F, 0.0F, 0.4363F);
		cube_r81.cubeList.add(new ModelBox(cube_r81, 25, 117, 4.5316F, -2.113F, 15.0F, 2, 1, 20, 0.05F, false));
		cube_r81.cubeList.add(new ModelBox(cube_r81, 25, 117, 4.5316F, -2.113F, 35.0F, 2, 1, 20, 0.05F, false));
		cube_r81.cubeList.add(new ModelBox(cube_r81, 60, 32, 4.5743F, -2.3725F, 46.0F, 2, 1, 9, 0.15F, false));
		cube_r81.cubeList.add(new ModelBox(cube_r81, 70, 173, 4.5743F, -2.3725F, 43.7F, 2, 1, 2, 0.15F, false));

		cube_r82 = new ModelRenderer(this);
		cube_r82.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone31.addChild(cube_r82);
		setRotationAngle(cube_r82, 0.0F, 0.0F, -0.4363F);
		cube_r82.cubeList.add(new ModelBox(cube_r82, 52, 155, 1.6253F, 1.6903F, 15.0F, 2, 1, 20, 0.05F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 52, 155, 1.6253F, 1.6903F, 35.0F, 2, 1, 20, 0.05F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 60, 58, 1.4481F, 1.3682F, 46.0F, 2, 1, 9, 0.15F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 92, 90, 1.4481F, 1.3682F, 43.7F, 2, 1, 2, 0.15F, false));

		bone32 = new ModelRenderer(this);
		bone32.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter6.addChild(bone32);
		setRotationAngle(bone32, 0.0F, 0.0F, -1.5708F);
		

		cube_r83 = new ModelRenderer(this);
		cube_r83.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone32.addChild(cube_r83);
		setRotationAngle(cube_r83, 0.0F, 0.0F, -0.4363F);
		cube_r83.cubeList.add(new ModelBox(cube_r83, 74, 73, -6.5316F, -2.113F, 15.0F, 2, 1, 20, 0.05F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 74, 72, -6.5316F, -2.113F, 35.0F, 2, 1, 20, 0.05F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 11, 57, -6.5743F, -2.3725F, 46.0F, 2, 1, 9, 0.15F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 101, 164, -6.5743F, -2.3725F, 43.7F, 2, 1, 2, 0.15F, false));

		cube_r84 = new ModelRenderer(this);
		cube_r84.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone32.addChild(cube_r84);
		setRotationAngle(cube_r84, 0.0F, 0.0F, 0.4363F);
		cube_r84.cubeList.add(new ModelBox(cube_r84, 74, 73, -3.6253F, 1.6903F, 15.0F, 2, 1, 20, 0.05F, false));
		cube_r84.cubeList.add(new ModelBox(cube_r84, 74, 72, -3.6253F, 1.6903F, 35.0F, 2, 1, 20, 0.05F, false));
		cube_r84.cubeList.add(new ModelBox(cube_r84, 60, 11, -3.4481F, 1.3682F, 46.0F, 2, 1, 9, 0.15F, false));
		cube_r84.cubeList.add(new ModelBox(cube_r84, 92, 136, -3.4481F, 1.3682F, 43.7F, 2, 1, 2, 0.15F, false));

		bone33 = new ModelRenderer(this);
		bone33.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter6.addChild(bone33);
		

		cube_r85 = new ModelRenderer(this);
		cube_r85.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone33.addChild(cube_r85);
		setRotationAngle(cube_r85, 0.0F, 0.0F, 0.4363F);
		cube_r85.cubeList.add(new ModelBox(cube_r85, 84, 146, 1.6904F, 3.6253F, 15.0F, 2, 1, 20, 0.05F, false));
		cube_r85.cubeList.add(new ModelBox(cube_r85, 84, 146, 1.6904F, 3.6253F, 35.0F, 2, 1, 20, 0.05F, false));
		cube_r85.cubeList.add(new ModelBox(cube_r85, 11, 11, 1.6493F, 3.2237F, 46.0F, 2, 1, 9, 0.15F, false));
		cube_r85.cubeList.add(new ModelBox(cube_r85, 92, 136, 1.6493F, 3.2237F, 43.7F, 2, 1, 2, 0.15F, false));

		cube_r86 = new ModelRenderer(this);
		cube_r86.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone33.addChild(cube_r86);
		setRotationAngle(cube_r86, 0.0F, 0.0F, -0.4363F);
		cube_r86.cubeList.add(new ModelBox(cube_r86, 52, 155, -3.6904F, 3.6253F, 15.0F, 2, 1, 20, 0.05F, false));
		cube_r86.cubeList.add(new ModelBox(cube_r86, 52, 155, -3.6904F, 3.6253F, 35.0F, 2, 1, 20, 0.05F, false));
		cube_r86.cubeList.add(new ModelBox(cube_r86, 11, 32, -3.6493F, 3.2237F, 46.0F, 2, 1, 9, 0.15F, false));
		cube_r86.cubeList.add(new ModelBox(cube_r86, 70, 173, -3.6493F, 3.2237F, 43.7F, 2, 1, 2, 0.15F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		suppressor.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}