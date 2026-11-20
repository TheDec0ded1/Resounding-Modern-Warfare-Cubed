package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AKSUDustCover extends ModelBase {
	private final ModelRenderer dustcover;
	private final ModelRenderer DustCover40;
	private final ModelRenderer DustCover39;
	private final ModelRenderer DustCover43;
	private final ModelRenderer DustCover41;
	private final ModelRenderer DustCover42;
	private final ModelRenderer DustCover8;
	private final ModelRenderer DustCover10;
	private final ModelRenderer DustCover44;
	private final ModelRenderer DustCover5;
	private final ModelRenderer DustCover22;
	private final ModelRenderer DustCover35;
	private final ModelRenderer DustCover3;
	private final ModelRenderer DustCover2;
	private final ModelRenderer DustCover4;
	private final ModelRenderer DustCover1;
	private final ModelRenderer DustCover9_r1;
	private final ModelRenderer DustCover8_r1;
	private final ModelRenderer DustCover6_r1;
	private final ModelRenderer DustCover5_r1;
	private final ModelRenderer DustCover16;
	private final ModelRenderer DustCover47;
	private final ModelRenderer DustCover15;
	private final ModelRenderer DustCover21;
	private final ModelRenderer DustCover14;
	private final ModelRenderer DustCover36;
	private final ModelRenderer DustCover41_r1;
	private final ModelRenderer DustCover39_r1;
	private final ModelRenderer DustCover39_r2;
	private final ModelRenderer DustCover38_r1;
	private final ModelRenderer DustCover38_r2;
	private final ModelRenderer DustCover12;
	private final ModelRenderer DustCover13;
	private final ModelRenderer DustCover20;
	private final ModelRenderer DustCover38;
	private final ModelRenderer DustCover37;
	private final ModelRenderer DustCover18;
	private final ModelRenderer DustCover17;
	private final ModelRenderer DustCover19;
	private final ModelRenderer bone;
	private final ModelRenderer bone_r1;
	private final ModelRenderer sights2;
	private final ModelRenderer cube_r3;

	public AKSUDustCover() {
		textureWidth = 304;
		textureHeight = 304;

		dustcover = new ModelRenderer(this);
		dustcover.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		DustCover40 = new ModelRenderer(this);
		DustCover40.setRotationPoint(-3.7F, -37.5F, 2.2F);
		dustcover.addChild(DustCover40);
		setRotationAngle(DustCover40, -0.9295F, 0.0F, 0.0F);
		DustCover40.cubeList.add(new ModelBox(DustCover40, 138, 279, 0.001F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

		DustCover39 = new ModelRenderer(this);
		DustCover39.setRotationPoint(-1.3F, -37.5F, 2.2F);
		dustcover.addChild(DustCover39);
		setRotationAngle(DustCover39, -0.9295F, 0.0F, 0.0F);
		DustCover39.cubeList.add(new ModelBox(DustCover39, 146, 279, -0.001F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

		DustCover43 = new ModelRenderer(this);
		DustCover43.setRotationPoint(-1.2F, -39.3F, 0.88F);
		dustcover.addChild(DustCover43);
		setRotationAngle(DustCover43, -0.9295F, 0.0F, 0.0F);
		DustCover43.cubeList.add(new ModelBox(DustCover43, 90, 247, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		DustCover41 = new ModelRenderer(this);
		DustCover41.setRotationPoint(-2.8F, -39.3F, 0.88F);
		dustcover.addChild(DustCover41);
		setRotationAngle(DustCover41, -0.9295F, 0.0F, 0.0F);
		DustCover41.cubeList.add(new ModelBox(DustCover41, 236, 253, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		DustCover42 = new ModelRenderer(this);
		DustCover42.setRotationPoint(-2.0F, -39.8F, 0.5F);
		dustcover.addChild(DustCover42);
		setRotationAngle(DustCover42, -0.9295F, 0.0F, 0.0F);
		DustCover42.cubeList.add(new ModelBox(DustCover42, 250, 14, 0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));

		DustCover8 = new ModelRenderer(this);
		DustCover8.setRotationPoint(-3.9F, -37.5F, -21.5F);
		dustcover.addChild(DustCover8);
		setRotationAngle(DustCover8, 0.0F, 0.0F, -0.7808F);
		DustCover8.cubeList.add(new ModelBox(DustCover8, 274, 252, 0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));

		DustCover10 = new ModelRenderer(this);
		DustCover10.setRotationPoint(-3.8F, -37.5F, -19.1F);
		dustcover.addChild(DustCover10);
		setRotationAngle(DustCover10, 0.0F, 0.0F, -0.7436F);
		DustCover10.cubeList.add(new ModelBox(DustCover10, 192, 130, 0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		DustCover44 = new ModelRenderer(this);
		DustCover44.setRotationPoint(-3.7F, -37.5F, -11.0F);
		dustcover.addChild(DustCover44);
		setRotationAngle(DustCover44, 0.0F, 0.0F, -0.7436F);
		DustCover44.cubeList.add(new ModelBox(DustCover44, 150, 62, 0.0F, 0.0F, 0.0F, 1, 1, 12, 0.0F, false));

		DustCover5 = new ModelRenderer(this);
		DustCover5.setRotationPoint(-2.8F, -39.2F, -21.5F);
		dustcover.addChild(DustCover5);
		setRotationAngle(DustCover5, 0.0F, 0.0F, 0.3346F);
		DustCover5.cubeList.add(new ModelBox(DustCover5, 166, 147, 0.0F, 0.0F, -0.001F, 1, 2, 22, 0.0F, false));

		DustCover22 = new ModelRenderer(this);
		DustCover22.setRotationPoint(0.7F, -37.5F, -25.0F);
		dustcover.addChild(DustCover22);
		setRotationAngle(DustCover22, 0.0F, 0.0F, 2.3051F);
		DustCover22.cubeList.add(new ModelBox(DustCover22, 150, 35, 0.0F, 0.0F, 0.0F, 1, 1, 26, 0.0F, false));

		DustCover35 = new ModelRenderer(this);
		DustCover35.setRotationPoint(0.8F, -37.5F, -33.5F);
		dustcover.addChild(DustCover35);
		setRotationAngle(DustCover35, 0.0F, 0.0F, 2.3051F);
		DustCover35.cubeList.add(new ModelBox(DustCover35, 0, 264, 0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		DustCover3 = new ModelRenderer(this);
		DustCover3.setRotationPoint(-0.17F, -39.25F, -33.5F);
		dustcover.addChild(DustCover3);
		setRotationAngle(DustCover3, 0.0F, 0.0F, 1.3013F);
		DustCover3.cubeList.add(new ModelBox(DustCover3, 0, 80, 0.0F, 0.0F, -0.001F, 2, 1, 34, 0.0F, false));

		DustCover2 = new ModelRenderer(this);
		DustCover2.setRotationPoint(-1.0F, -39.8F, -33.5F);
		dustcover.addChild(DustCover2);
		setRotationAngle(DustCover2, 0.0F, 0.0F, 0.5949F);
		DustCover2.cubeList.add(new ModelBox(DustCover2, 80, 40, 0.0F, 0.0F, 0.0F, 1, 1, 34, 0.0F, false));

		DustCover4 = new ModelRenderer(this);
		DustCover4.setRotationPoint(-2.0F, -39.8F, -33.5F);
		dustcover.addChild(DustCover4);
		setRotationAngle(DustCover4, 0.0F, 0.0F, 0.9295F);
		DustCover4.cubeList.add(new ModelBox(DustCover4, 72, 80, 0.0F, 0.0F, 0.0F, 1, 1, 34, 0.0F, false));

		DustCover1 = new ModelRenderer(this);
		DustCover1.setRotationPoint(-2.0F, -39.8F, -33.5F);
		dustcover.addChild(DustCover1);
		DustCover1.cubeList.add(new ModelBox(DustCover1, 86, 0, 0.0F, 0.0F, 0.0F, 1, 1, 34, 0.0F, false));
		DustCover1.cubeList.add(new ModelBox(DustCover1, 286, 96, 0.0F, -0.1F, 4.5F, 1, 1, 1, 0.0F, false));
		DustCover1.cubeList.add(new ModelBox(DustCover1, 286, 98, 0.0F, -0.1F, 14.5F, 1, 1, 1, 0.0F, false));
		DustCover1.cubeList.add(new ModelBox(DustCover1, 286, 100, 0.0F, -0.1F, 24.5F, 1, 1, 1, 0.0F, false));
		DustCover1.cubeList.add(new ModelBox(DustCover1, 280, 198, 0.0F, -0.3F, 0.2F, 1, 1, 3, -0.2F, false));
		DustCover1.cubeList.add(new ModelBox(DustCover1, 154, 265, 0.0F, -0.3F, 5.95F, 1, 1, 8, -0.2F, false));
		DustCover1.cubeList.add(new ModelBox(DustCover1, 266, 104, 0.0F, -0.3F, 16.05F, 1, 1, 8, -0.2F, false));
		DustCover1.cubeList.add(new ModelBox(DustCover1, 210, 20, 0.0F, -0.3F, 26.15F, 1, 1, 6, -0.2F, false));

		DustCover9_r1 = new ModelRenderer(this);
		DustCover9_r1.setRotationPoint(1.83F, 0.46F, 13.5F);
		DustCover1.addChild(DustCover9_r1);
		setRotationAngle(DustCover9_r1, 0.0F, 0.0F, 1.2741F);
		DustCover9_r1.cubeList.add(new ModelBox(DustCover9_r1, 284, 144, 0.0F, 0.0F, -9.0F, 2, 1, 1, 0.0F, false));
		DustCover9_r1.cubeList.add(new ModelBox(DustCover9_r1, 284, 146, 0.0F, 0.0F, 11.0F, 2, 1, 1, 0.0F, false));
		DustCover9_r1.cubeList.add(new ModelBox(DustCover9_r1, 284, 148, 0.0F, 0.0F, 1.0F, 2, 1, 1, 0.0F, false));

		DustCover8_r1 = new ModelRenderer(this);
		DustCover8_r1.setRotationPoint(-0.8F, 0.5F, 24.5F);
		DustCover1.addChild(DustCover8_r1);
		setRotationAngle(DustCover8_r1, 0.0F, 0.0F, -1.2217F);
		DustCover8_r1.cubeList.add(new ModelBox(DustCover8_r1, 284, 154, -2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));
		DustCover8_r1.cubeList.add(new ModelBox(DustCover8_r1, 284, 156, -2.0F, 0.0F, -10.0F, 2, 1, 1, 0.0F, false));

		DustCover6_r1 = new ModelRenderer(this);
		DustCover6_r1.setRotationPoint(0.0F, -0.1F, 4.5F);
		DustCover1.addChild(DustCover6_r1);
		setRotationAngle(DustCover6_r1, 0.0F, 0.0F, -0.6458F);
		DustCover6_r1.cubeList.add(new ModelBox(DustCover6_r1, 104, 286, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		DustCover6_r1.cubeList.add(new ModelBox(DustCover6_r1, 108, 286, -1.0F, 0.0F, 20.0F, 1, 1, 1, 0.0F, false));
		DustCover6_r1.cubeList.add(new ModelBox(DustCover6_r1, 112, 286, -1.0F, 0.0F, 10.0F, 1, 1, 1, 0.0F, false));

		DustCover5_r1 = new ModelRenderer(this);
		DustCover5_r1.setRotationPoint(1.0F, -0.1F, 15.5F);
		DustCover1.addChild(DustCover5_r1);
		setRotationAngle(DustCover5_r1, 0.0F, 0.0F, 0.5934F);
		DustCover5_r1.cubeList.add(new ModelBox(DustCover5_r1, 130, 286, 0.0F, 0.0F, 9.0F, 1, 1, 1, 0.0F, false));
		DustCover5_r1.cubeList.add(new ModelBox(DustCover5_r1, 286, 150, 0.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));
		DustCover5_r1.cubeList.add(new ModelBox(DustCover5_r1, 286, 152, 0.0F, 0.0F, -11.0F, 1, 1, 1, 0.0F, false));

		DustCover16 = new ModelRenderer(this);
		DustCover16.setRotationPoint(-3.8F, -37.2F, -8.1F);
		dustcover.addChild(DustCover16);
		DustCover16.cubeList.add(new ModelBox(DustCover16, 86, 264, 0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		DustCover47 = new ModelRenderer(this);
		DustCover47.setRotationPoint(-3.7F, -36.5F, -9.5F);
		dustcover.addChild(DustCover47);
		DustCover47.cubeList.add(new ModelBox(DustCover47, 162, 286, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		DustCover15 = new ModelRenderer(this);
		DustCover15.setRotationPoint(-3.7F, -36.5F, -9.1F);
		dustcover.addChild(DustCover15);
		DustCover15.cubeList.add(new ModelBox(DustCover15, 90, 252, -0.001F, 0.0F, 0.0F, 1, 1, 11, 0.0F, false));

		DustCover21 = new ModelRenderer(this);
		DustCover21.setRotationPoint(-0.2F, -37.2F, -22.5F);
		dustcover.addChild(DustCover21);
		DustCover21.cubeList.add(new ModelBox(DustCover21, 166, 171, 0.0F, 0.0F, 0.0F, 1, 1, 22, 0.0F, false));

		DustCover14 = new ModelRenderer(this);
		DustCover14.setRotationPoint(-3.7F, -37.5F, -10.1F);
		dustcover.addChild(DustCover14);
		DustCover14.cubeList.add(new ModelBox(DustCover14, 176, 62, 0.0F, 0.0F, 0.0F, 1, 1, 12, 0.0F, false));

		DustCover36 = new ModelRenderer(this);
		DustCover36.setRotationPoint(-0.2F, -37.5F, -24.5F);
		dustcover.addChild(DustCover36);
		setRotationAngle(DustCover36, -1.1525F, 0.0F, 0.0F);
		DustCover36.cubeList.add(new ModelBox(DustCover36, 248, 283, 0.001F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		DustCover41_r1 = new ModelRenderer(this);
		DustCover41_r1.setRotationPoint(-0.2F, -8.5967F, -0.5246F);
		DustCover36.addChild(DustCover41_r1);
		setRotationAngle(DustCover41_r1, 1.1519F, 0.0F, 0.0F);
		DustCover41_r1.cubeList.add(new ModelBox(DustCover41_r1, 276, 136, -2.699F, -0.3998F, -6.1996F, 1, 2, 3, -0.4F, false));
		DustCover41_r1.cubeList.add(new ModelBox(DustCover41_r1, 276, 141, -0.501F, -0.3998F, -6.1996F, 1, 2, 3, -0.4F, false));
		DustCover41_r1.cubeList.add(new ModelBox(DustCover41_r1, 280, 194, -0.501F, 0.8002F, -6.1996F, 1, 1, 3, -0.4F, false));
		DustCover41_r1.cubeList.add(new ModelBox(DustCover41_r1, 280, 190, -2.699F, 0.8002F, -6.1996F, 1, 1, 3, -0.4F, false));
		DustCover41_r1.cubeList.add(new ModelBox(DustCover41_r1, 280, 211, -0.498F, -1.3998F, -5.5996F, 1, 2, 2, -0.4F, false));
		DustCover41_r1.cubeList.add(new ModelBox(DustCover41_r1, 280, 258, -2.702F, -1.3998F, -5.5996F, 1, 2, 2, -0.4F, false));

		DustCover39_r1 = new ModelRenderer(this);
		DustCover39_r1.setRotationPoint(-1.3F, -4.1378F, -2.925F);
		DustCover36.addChild(DustCover39_r1);
		setRotationAngle(DustCover39_r1, 0.7418F, 0.0F, -3.1416F);
		DustCover39_r1.cubeList.add(new ModelBox(DustCover39_r1, 280, 262, -1.6F, -1.2931F, 0.1236F, 1, 2, 2, -0.4F, false));
		DustCover39_r1.cubeList.add(new ModelBox(DustCover39_r1, 280, 266, 0.6F, -1.2931F, 0.1236F, 1, 2, 2, -0.4F, false));
		DustCover39_r1.cubeList.add(new ModelBox(DustCover39_r1, 200, 283, 0.602F, -1.2931F, 0.5236F, 1, 2, 2, -0.4F, false));
		DustCover39_r1.cubeList.add(new ModelBox(DustCover39_r1, 194, 283, -1.602F, -1.2931F, 0.5236F, 1, 2, 2, -0.4F, false));

		DustCover39_r2 = new ModelRenderer(this);
		DustCover39_r2.setRotationPoint(-1.3F, -4.1378F, -2.925F);
		DustCover36.addChild(DustCover39_r2);
		setRotationAngle(DustCover39_r2, 1.2217F, 0.0F, -3.1416F);
		DustCover39_r2.cubeList.add(new ModelBox(DustCover39_r2, 0, 281, 0.601F, -0.9505F, -0.7232F, 1, 2, 2, -0.4F, false));
		DustCover39_r2.cubeList.add(new ModelBox(DustCover39_r2, 6, 281, -1.601F, -0.9505F, -0.7232F, 1, 2, 2, -0.4F, false));

		DustCover38_r1 = new ModelRenderer(this);
		DustCover38_r1.setRotationPoint(-0.2F, -6.0105F, -1.5539F);
		DustCover36.addChild(DustCover38_r1);
		setRotationAngle(DustCover38_r1, 0.3491F, 0.0F, 0.0F);
		DustCover38_r1.cubeList.add(new ModelBox(DustCover38_r1, 56, 281, -0.499F, -0.2955F, -2.0459F, 1, 2, 2, -0.4F, false));
		DustCover38_r1.cubeList.add(new ModelBox(DustCover38_r1, 62, 281, -2.701F, -0.2955F, -2.0459F, 1, 2, 2, -0.4F, false));

		DustCover38_r2 = new ModelRenderer(this);
		DustCover38_r2.setRotationPoint(-0.2F, -5.6959F, -1.8063F);
		DustCover36.addChild(DustCover38_r2);
		setRotationAngle(DustCover38_r2, -0.1309F, 0.0F, 0.0F);
		DustCover38_r2.cubeList.add(new ModelBox(DustCover38_r2, 68, 281, -2.7F, -0.4463F, -0.538F, 1, 2, 2, -0.4F, false));
		DustCover38_r2.cubeList.add(new ModelBox(DustCover38_r2, 82, 281, -0.5F, -0.4463F, -0.538F, 1, 2, 2, -0.4F, false));
		DustCover38_r2.cubeList.add(new ModelBox(DustCover38_r2, 188, 283, -0.498F, -0.4463F, -0.138F, 1, 2, 2, -0.4F, false));
		DustCover38_r2.cubeList.add(new ModelBox(DustCover38_r2, 182, 283, -2.702F, -0.4463F, -0.138F, 1, 2, 2, -0.4F, false));

		DustCover12 = new ModelRenderer(this);
		DustCover12.setRotationPoint(-3.8F, -37.5F, -10.1F);
		dustcover.addChild(DustCover12);
		setRotationAngle(DustCover12, -0.8923F, 0.0F, 0.0F);
		DustCover12.cubeList.add(new ModelBox(DustCover12, 166, 286, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		DustCover13 = new ModelRenderer(this);
		DustCover13.setRotationPoint(-3.8F, -35.0F, -9.5F);
		dustcover.addChild(DustCover13);
		setRotationAngle(DustCover13, 2.1935F, 0.0F, 0.0F);
		DustCover13.cubeList.add(new ModelBox(DustCover13, 254, 283, -0.001F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		DustCover20 = new ModelRenderer(this);
		DustCover20.setRotationPoint(-0.3F, -37.5F, -25.0F);
		dustcover.addChild(DustCover20);
		DustCover20.cubeList.add(new ModelBox(DustCover20, 58, 147, 0.0F, 0.0F, 0.0F, 1, 2, 27, 0.0F, false));

		DustCover38 = new ModelRenderer(this);
		DustCover38.setRotationPoint(-0.2F, -37.5F, -33.5F);
		dustcover.addChild(DustCover38);
		DustCover38.cubeList.add(new ModelBox(DustCover38, 106, 264, 0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		DustCover37 = new ModelRenderer(this);
		DustCover37.setRotationPoint(-0.2F, -37.0F, -33.5F);
		dustcover.addChild(DustCover37);
		DustCover37.cubeList.add(new ModelBox(DustCover37, 182, 264, -0.001F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		DustCover18 = new ModelRenderer(this);
		DustCover18.setRotationPoint(-3.8F, -36.0F, 2.5F);
		dustcover.addChild(DustCover18);
		DustCover18.cubeList.add(new ModelBox(DustCover18, 264, 229, 0.0F, -0.001F, 0.001F, 4, 1, 1, 0.0F, false));

		DustCover17 = new ModelRenderer(this);
		DustCover17.setRotationPoint(-3.8F, -36.0F, -9.5F);
		dustcover.addChild(DustCover17);
		DustCover17.cubeList.add(new ModelBox(DustCover17, 182, 251, 0.0F, 0.0F, 0.0F, 1, 1, 12, 0.0F, false));

		DustCover19 = new ModelRenderer(this);
		DustCover19.setRotationPoint(-0.2F, -36.0F, -24.5F);
		dustcover.addChild(DustCover19);
		DustCover19.cubeList.add(new ModelBox(DustCover19, 0, 147, 0.0F, 0.0F, 0.0F, 1, 1, 28, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		dustcover.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 36, 222, -3.0F, -40.4F, -33.7F, 3, 1, 14, -0.3F, false));
		bone.cubeList.add(new ModelBox(bone, 276, 169, -3.0F, -40.4F, -21.275F, 3, 1, 2, -0.3F, false));
		bone.cubeList.add(new ModelBox(bone, 114, 252, -0.902F, -40.6802F, -33.6197F, 1, 1, 11, -0.4F, false));
		bone.cubeList.add(new ModelBox(bone, 252, 121, -0.9F, -40.8802F, -33.6197F, 1, 1, 11, -0.4F, false));
		bone.cubeList.add(new ModelBox(bone, 252, 133, -3.1F, -40.8802F, -33.6197F, 1, 1, 11, -0.4F, false));
		bone.cubeList.add(new ModelBox(bone, 252, 145, -3.099F, -40.6802F, -33.6197F, 1, 1, 11, -0.4F, false));

		bone_r1 = new ModelRenderer(this);
		bone_r1.setRotationPoint(-1.5F, -40.9708F, -33.8956F);
		bone.addChild(bone_r1);
		setRotationAngle(bone_r1, -0.7418F, 0.0F, 0.0F);
		bone_r1.cubeList.add(new ModelBox(bone_r1, 154, 279, 0.599F, -0.2F, -1.5F, 1, 1, 3, -0.4F, false));
		bone_r1.cubeList.add(new ModelBox(bone_r1, 172, 279, -1.599F, -0.2F, -1.5F, 1, 1, 3, -0.4F, false));
		bone_r1.cubeList.add(new ModelBox(bone_r1, 180, 279, 0.599F, -0.4F, -1.5F, 1, 1, 3, -0.4F, false));
		bone_r1.cubeList.add(new ModelBox(bone_r1, 188, 279, 0.6F, -0.6F, -1.5F, 1, 1, 3, -0.4F, false));
		bone_r1.cubeList.add(new ModelBox(bone_r1, 196, 279, -1.6F, -0.4F, -1.5F, 1, 1, 3, -0.4F, false));
		bone_r1.cubeList.add(new ModelBox(bone_r1, 204, 279, -1.6F, -0.6F, -1.5F, 1, 1, 3, -0.4F, false));

		sights2 = new ModelRenderer(this);
		sights2.setRotationPoint(0.0F, -39.5F, -74.9F);
		dustcover.addChild(sights2);
		sights2.cubeList.add(new ModelBox(sights2, 212, 279, -3.0F, -2.71F, 52.82F, 3, 3, 1, -0.4F, false));
		sights2.cubeList.add(new ModelBox(sights2, 286, 168, -1.1F, -2.91F, 52.82F, 1, 1, 1, -0.4F, false));
		sights2.cubeList.add(new ModelBox(sights2, 286, 170, -1.3F, -2.91F, 52.82F, 1, 1, 1, -0.4F, false));
		sights2.cubeList.add(new ModelBox(sights2, 286, 180, -1.5F, -2.91F, 52.82F, 1, 1, 1, -0.4F, false));
		sights2.cubeList.add(new ModelBox(sights2, 286, 182, -1.7F, -2.91F, 52.82F, 1, 1, 1, -0.401F, false));
		sights2.cubeList.add(new ModelBox(sights2, 286, 184, -1.7F, -3.01F, 52.82F, 1, 1, 1, -0.402F, false));
		sights2.cubeList.add(new ModelBox(sights2, 286, 186, -1.5F, -3.01F, 52.82F, 1, 1, 1, -0.401F, false));
		sights2.cubeList.add(new ModelBox(sights2, 286, 211, -1.3F, -3.01F, 52.82F, 1, 1, 1, -0.401F, false));
		sights2.cubeList.add(new ModelBox(sights2, 286, 213, -1.1F, -3.01F, 52.82F, 1, 1, 1, -0.401F, false));
		sights2.cubeList.add(new ModelBox(sights2, 286, 235, -2.3F, -3.01F, 52.82F, 1, 1, 1, -0.402F, false));
		sights2.cubeList.add(new ModelBox(sights2, 286, 237, -2.5F, -3.01F, 52.82F, 1, 1, 1, -0.401F, false));
		sights2.cubeList.add(new ModelBox(sights2, 242, 286, -2.7F, -3.01F, 52.82F, 1, 1, 1, -0.401F, false));
		sights2.cubeList.add(new ModelBox(sights2, 246, 286, -2.9F, -3.01F, 52.82F, 1, 1, 1, -0.401F, false));
		sights2.cubeList.add(new ModelBox(sights2, 286, 248, -2.3F, -2.91F, 52.82F, 1, 1, 1, -0.401F, false));
		sights2.cubeList.add(new ModelBox(sights2, 250, 286, -2.5F, -2.91F, 52.82F, 1, 1, 1, -0.4F, false));
		sights2.cubeList.add(new ModelBox(sights2, 286, 250, -2.9F, -2.91F, 52.82F, 1, 1, 1, -0.4F, false));
		sights2.cubeList.add(new ModelBox(sights2, 254, 286, -2.7F, -2.91F, 52.82F, 1, 1, 1, -0.4F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-2.7F, -1.36F, 40.72F);
		sights2.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.3665F, 0.0F, 0.0F);
		
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		dustcover.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}