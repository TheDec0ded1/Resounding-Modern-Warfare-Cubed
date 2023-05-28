package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;

import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench
// Paste this code into your mod.
// Make sure to generate all required imports

public class AKSUDustCover extends ModelWithAttachments {
	private final ModelRenderer dustcover;
	private final ModelRenderer DustCover40;
	private final ModelRenderer DustCover39;
	private final ModelRenderer DustCover43;
	private final ModelRenderer DustCover41;
	private final ModelRenderer DustCover42;
	private final ModelRenderer DustCover8;
	private final ModelRenderer DustCover9;
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
	private final ModelRenderer DustCover12;
	private final ModelRenderer DustCover11;
	private final ModelRenderer DustCover13;
	private final ModelRenderer DustCover20;
	private final ModelRenderer DustCover38;
	private final ModelRenderer DustCover37;
	private final ModelRenderer DustCover18;
	private final ModelRenderer DustCover17;
	private final ModelRenderer DustCover19;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone15;
	private final ModelRenderer bone13;
	private final ModelRenderer bone8;
	private final ModelRenderer bone6;
	private final ModelRenderer bone14;
	private final ModelRenderer bone16;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer bone12;
	private final ModelRenderer bone9;
	private final ModelRenderer bone10;
	private final ModelRenderer bone11;
	private final ModelRenderer bone7;

	public AKSUDustCover() {
		textureWidth = 128;
		textureHeight = 128;

		dustcover = new ModelRenderer(this);
		dustcover.setRotationPoint(0.0F, 24.0F, 0.0F);

		DustCover40 = new ModelRenderer(this);
		DustCover40.setRotationPoint(-3.7F, -37.5F, 2.2F);
		setRotationAngle(DustCover40, -0.9295F, 0.0F, 0.0F);
		dustcover.addChild(DustCover40);
		DustCover40.cubeList.add(new ModelBox(DustCover40, 14, 4, 0.001F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

		DustCover39 = new ModelRenderer(this);
		DustCover39.setRotationPoint(-1.3F, -37.5F, 2.2F);
		setRotationAngle(DustCover39, -0.9295F, 0.0F, 0.0F);
		dustcover.addChild(DustCover39);
		DustCover39.cubeList.add(new ModelBox(DustCover39, 14, 13, -0.001F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

		DustCover43 = new ModelRenderer(this);
		DustCover43.setRotationPoint(-1.2F, -39.3F, 0.88F);
		setRotationAngle(DustCover43, -0.9295F, 0.0F, 0.0F);
		dustcover.addChild(DustCover43);
		DustCover43.cubeList.add(new ModelBox(DustCover43, 0, 6, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		DustCover41 = new ModelRenderer(this);
		DustCover41.setRotationPoint(-2.8F, -39.3F, 0.88F);
		setRotationAngle(DustCover41, -0.9295F, 0.0F, 0.0F);
		dustcover.addChild(DustCover41);
		DustCover41.cubeList.add(new ModelBox(DustCover41, 0, 13, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		DustCover42 = new ModelRenderer(this);
		DustCover42.setRotationPoint(-2.0F, -39.8F, 0.5F);
		setRotationAngle(DustCover42, -0.9295F, 0.0F, 0.0F);
		dustcover.addChild(DustCover42);
		DustCover42.cubeList.add(new ModelBox(DustCover42, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));

		DustCover8 = new ModelRenderer(this);
		DustCover8.setRotationPoint(-3.9F, -37.5F, -21.5F);
		setRotationAngle(DustCover8, 0.0F, 0.0F, -0.7808F);
		dustcover.addChild(DustCover8);
		DustCover8.cubeList.add(new ModelBox(DustCover8, 0, 18, 0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));

		DustCover9 = new ModelRenderer(this);
		DustCover9.setRotationPoint(-3.9F, -37.5F, -21.5F);
		dustcover.addChild(DustCover9);
		DustCover9.cubeList.add(new ModelBox(DustCover9, 14, 17, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		DustCover10 = new ModelRenderer(this);
		DustCover10.setRotationPoint(-3.8F, -37.5F, -19.1F);
		setRotationAngle(DustCover10, 0.0F, 0.0F, -0.7436F);
		dustcover.addChild(DustCover10);
		DustCover10.cubeList.add(new ModelBox(DustCover10, 14, 0, 0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		DustCover44 = new ModelRenderer(this);
		DustCover44.setRotationPoint(-3.7F, -37.5F, -11.0F);
		setRotationAngle(DustCover44, 0.0F, 0.0F, -0.7436F);
		dustcover.addChild(DustCover44);
		DustCover44.cubeList.add(new ModelBox(DustCover44, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 12, 0.0F, false));

		DustCover5 = new ModelRenderer(this);
		DustCover5.setRotationPoint(-2.8F, -39.2F, -21.5F);
		setRotationAngle(DustCover5, 0.0F, 0.0F, 0.3346F);
		dustcover.addChild(DustCover5);
		DustCover5.cubeList.add(new ModelBox(DustCover5, 72, 36, 0.0F, 0.0F, -0.001F, 1, 2, 22, 0.0F, false));

		DustCover22 = new ModelRenderer(this);
		DustCover22.setRotationPoint(0.7F, -37.5F, -25.0F);
		setRotationAngle(DustCover22, 0.0F, 0.0F, 2.3051F);
		dustcover.addChild(DustCover22);
		DustCover22.cubeList.add(new ModelBox(DustCover22, 30, 71, 0.0F, 0.0F, 0.0F, 1, 1, 26, 0.0F, false));

		DustCover35 = new ModelRenderer(this);
		DustCover35.setRotationPoint(0.8F, -37.5F, -33.5F);
		setRotationAngle(DustCover35, 0.0F, 0.0F, 2.3051F);
		dustcover.addChild(DustCover35);
		DustCover35.cubeList.add(new ModelBox(DustCover35, 14, 13, 0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		DustCover3 = new ModelRenderer(this);
		DustCover3.setRotationPoint(-0.17F, -39.25F, -33.5F);
		setRotationAngle(DustCover3, 0.0F, 0.0F, 1.3013F);
		dustcover.addChild(DustCover3);
		DustCover3.cubeList.add(new ModelBox(DustCover3, 0, 0, 0.0F, 0.0F, -0.001F, 2, 1, 34, 0.0F, false));

		DustCover2 = new ModelRenderer(this);
		DustCover2.setRotationPoint(-1.0F, -39.8F, -33.5F);
		setRotationAngle(DustCover2, 0.0F, 0.0F, 0.5949F);
		dustcover.addChild(DustCover2);
		DustCover2.cubeList.add(new ModelBox(DustCover2, 36, 36, 0.0F, 0.0F, 0.0F, 1, 1, 34, 0.0F, false));

		DustCover4 = new ModelRenderer(this);
		DustCover4.setRotationPoint(-2.0F, -39.8F, -33.5F);
		setRotationAngle(DustCover4, 0.0F, 0.0F, 0.9295F);
		dustcover.addChild(DustCover4);
		DustCover4.cubeList.add(new ModelBox(DustCover4, 0, 35, 0.0F, 0.0F, 0.0F, 1, 1, 34, 0.0F, false));

		DustCover1 = new ModelRenderer(this);
		DustCover1.setRotationPoint(-2.0F, -39.8F, -33.5F);
		dustcover.addChild(DustCover1);
		DustCover1.cubeList.add(new ModelBox(DustCover1, 38, 1, 0.0F, 0.0F, 0.0F, 1, 1, 34, 0.0F, false));
		DustCover1.cubeList.add(new ModelBox(DustCover1, 7, 18, 0.0F, -0.1F, 4.5F, 1, 1, 1, 0.0F, false));
		DustCover1.cubeList.add(new ModelBox(DustCover1, 0, 8, 0.0F, -0.1F, 14.5F, 1, 1, 1, 0.0F, false));
		DustCover1.cubeList.add(new ModelBox(DustCover1, 0, 6, 0.0F, -0.1F, 24.5F, 1, 1, 1, 0.0F, false));
		DustCover1.cubeList.add(new ModelBox(DustCover1, 14, 0, 0.0F, -0.3F, 0.2F, 1, 1, 3, -0.2F, false));
		DustCover1.cubeList.add(new ModelBox(DustCover1, 36, 48, 0.0F, -0.3F, 5.95F, 1, 1, 8, -0.2F, false));
		DustCover1.cubeList.add(new ModelBox(DustCover1, 0, 48, 0.0F, -0.3F, 16.05F, 1, 1, 8, -0.2F, false));
		DustCover1.cubeList.add(new ModelBox(DustCover1, 20, 23, 0.0F, -0.3F, 26.15F, 1, 1, 6, -0.2F, false));

		DustCover9_r1 = new ModelRenderer(this);
		DustCover9_r1.setRotationPoint(1.83F, 0.46F, 13.5F);
		setRotationAngle(DustCover9_r1, 0.0F, 0.0F, 1.2741F);
		DustCover1.addChild(DustCover9_r1);
		DustCover9_r1.cubeList.add(new ModelBox(DustCover9_r1, 14, 23, 0.0F, 0.0F, -9.0F, 2, 1, 1, 0.0F, false));
		DustCover9_r1.cubeList.add(new ModelBox(DustCover9_r1, 0, 22, 0.0F, 0.0F, 11.0F, 2, 1, 1, 0.0F, false));
		DustCover9_r1.cubeList.add(new ModelBox(DustCover9_r1, 20, 23, 0.0F, 0.0F, 1.0F, 2, 1, 1, 0.0F, false));

		DustCover8_r1 = new ModelRenderer(this);
		DustCover8_r1.setRotationPoint(-0.8F, 0.5F, 24.5F);
		setRotationAngle(DustCover8_r1, 0.0F, 0.0F, -1.2217F);
		DustCover1.addChild(DustCover8_r1);
		DustCover8_r1.cubeList.add(new ModelBox(DustCover8_r1, 6, 22, -2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));
		DustCover8_r1.cubeList.add(new ModelBox(DustCover8_r1, 24, 10, -2.0F, 0.0F, -10.0F, 2, 1, 1, 0.0F, false));

		DustCover6_r1 = new ModelRenderer(this);
		DustCover6_r1.setRotationPoint(0.0F, -0.1F, 4.5F);
		setRotationAngle(DustCover6_r1, 0.0F, 0.0F, -0.6458F);
		DustCover1.addChild(DustCover6_r1);
		DustCover6_r1.cubeList.add(new ModelBox(DustCover6_r1, 7, 0, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		DustCover6_r1.cubeList.add(new ModelBox(DustCover6_r1, 0, 0, -1.0F, 0.0F, 20.0F, 1, 1, 1, 0.0F, false));
		DustCover6_r1.cubeList.add(new ModelBox(DustCover6_r1, 7, 2, -1.0F, 0.0F, 10.0F, 1, 1, 1, 0.0F, false));

		DustCover5_r1 = new ModelRenderer(this);
		DustCover5_r1.setRotationPoint(1.0F, -0.1F, 15.5F);
		setRotationAngle(DustCover5_r1, 0.0F, 0.0F, 0.5934F);
		DustCover1.addChild(DustCover5_r1);
		DustCover5_r1.cubeList.add(new ModelBox(DustCover5_r1, 0, 2, 0.0F, 0.0F, 9.0F, 1, 1, 1, 0.0F, false));
		DustCover5_r1.cubeList.add(new ModelBox(DustCover5_r1, 0, 13, 0.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));
		DustCover5_r1.cubeList.add(new ModelBox(DustCover5_r1, 0, 15, 0.0F, 0.0F, -11.0F, 1, 1, 1, 0.0F, false));

		DustCover16 = new ModelRenderer(this);
		DustCover16.setRotationPoint(-3.8F, -37.2F, -8.1F);
		dustcover.addChild(DustCover16);
		DustCover16.cubeList.add(new ModelBox(DustCover16, 14, 35, 0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		DustCover47 = new ModelRenderer(this);
		DustCover47.setRotationPoint(-3.7F, -36.5F, -9.5F);
		dustcover.addChild(DustCover47);
		DustCover47.cubeList.add(new ModelBox(DustCover47, 19, 0, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		DustCover15 = new ModelRenderer(this);
		DustCover15.setRotationPoint(-3.7F, -36.5F, -9.1F);
		dustcover.addChild(DustCover15);
		DustCover15.cubeList.add(new ModelBox(DustCover15, 36, 36, -0.001F, 0.0F, 0.0F, 1, 1, 11, 0.0F, false));

		DustCover21 = new ModelRenderer(this);
		DustCover21.setRotationPoint(-0.2F, -37.2F, -22.5F);
		dustcover.addChild(DustCover21);
		DustCover21.cubeList.add(new ModelBox(DustCover21, 74, 0, 0.0F, 0.0F, 0.0F, 1, 1, 22, 0.0F, false));

		DustCover14 = new ModelRenderer(this);
		DustCover14.setRotationPoint(-3.7F, -37.5F, -10.1F);
		dustcover.addChild(DustCover14);
		DustCover14.cubeList.add(new ModelBox(DustCover14, 0, 13, 0.0F, 0.0F, 0.0F, 1, 1, 12, 0.0F, false));

		DustCover36 = new ModelRenderer(this);
		DustCover36.setRotationPoint(-0.2F, -37.5F, -24.5F);
		setRotationAngle(DustCover36, -1.1525F, 0.0F, 0.0F);
		dustcover.addChild(DustCover36);
		DustCover36.cubeList.add(new ModelBox(DustCover36, 6, 6, 0.001F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		DustCover12 = new ModelRenderer(this);
		DustCover12.setRotationPoint(-3.8F, -37.5F, -10.1F);
		setRotationAngle(DustCover12, -0.8923F, 0.0F, 0.0F);
		dustcover.addChild(DustCover12);
		DustCover12.cubeList.add(new ModelBox(DustCover12, 19, 17, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		DustCover11 = new ModelRenderer(this);
		DustCover11.setRotationPoint(-3.8F, -37.5F, -19.1F);
		dustcover.addChild(DustCover11);
		DustCover11.cubeList.add(new ModelBox(DustCover11, 38, 0, 0.001F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		DustCover13 = new ModelRenderer(this);
		DustCover13.setRotationPoint(-3.8F, -35.0F, -9.5F);
		setRotationAngle(DustCover13, 2.1935F, 0.0F, 0.0F);
		dustcover.addChild(DustCover13);
		DustCover13.cubeList.add(new ModelBox(DustCover13, 6, 13, -0.001F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		DustCover20 = new ModelRenderer(this);
		DustCover20.setRotationPoint(-0.3F, -37.5F, -25.0F);
		dustcover.addChild(DustCover20);
		DustCover20.cubeList.add(new ModelBox(DustCover20, 58, 71, 0.0F, 0.0F, 0.0F, 1, 2, 27, 0.0F, false));

		DustCover38 = new ModelRenderer(this);
		DustCover38.setRotationPoint(-0.2F, -37.5F, -33.5F);
		dustcover.addChild(DustCover38);
		DustCover38.cubeList.add(new ModelBox(DustCover38, 38, 10, 0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		DustCover37 = new ModelRenderer(this);
		DustCover37.setRotationPoint(-0.2F, -37.0F, -33.5F);
		dustcover.addChild(DustCover37);
		DustCover37.cubeList.add(new ModelBox(DustCover37, 38, 20, -0.001F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		DustCover18 = new ModelRenderer(this);
		DustCover18.setRotationPoint(-3.8F, -36.0F, 2.5F);
		dustcover.addChild(DustCover18);
		DustCover18.cubeList.add(new ModelBox(DustCover18, 14, 10, 0.0F, -0.001F, 0.001F, 4, 1, 1, 0.0F, false));

		DustCover17 = new ModelRenderer(this);
		DustCover17.setRotationPoint(-3.8F, -36.0F, -9.5F);
		dustcover.addChild(DustCover17);
		DustCover17.cubeList.add(new ModelBox(DustCover17, 0, 35, 0.0F, 0.0F, 0.0F, 1, 1, 12, 0.0F, false));

		DustCover19 = new ModelRenderer(this);
		DustCover19.setRotationPoint(-0.2F, -36.0F, -24.5F);
		dustcover.addChild(DustCover19);
		DustCover19.cubeList.add(new ModelBox(DustCover19, 0, 70, 0.0F, 0.0F, 0.0F, 1, 1, 28, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		dustcover.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 15, 15, -3.0F, -40.0F, -38.2F, 3, 1, 19, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone2, 0.5236F, 0.0F, 0.0F);
		dustcover.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 34, 22, -1.0F, -46.241F, 2.3723F, 1, 2, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 34, 30, -3.0F, -46.241F, 2.3723F, 1, 2, 1, 0.0F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(-1.5F, -41.516F, -37.8777F);
		dustcover.addChild(bone15);
		bone15.cubeList.add(new ModelBox(bone15, 34, 22, 0.5F, -0.9016F, -1.0544F, 1, 2, 1, 0.0F, false));
		bone15.cubeList.add(new ModelBox(bone15, 34, 30, -1.5F, -0.9016F, -1.0544F, 1, 2, 1, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(-1.5F, -40.316F, -36.8777F);
		dustcover.addChild(bone13);
		bone13.cubeList.add(new ModelBox(bone13, 34, 22, 0.5F, -0.9016F, -1.0544F, 1, 1, 1, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 34, 30, -1.5F, -0.9016F, -1.0544F, 1, 1, 1, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, -12.0F, -69.0F);
		setRotationAngle(bone8, -0.5236F, 0.0F, 0.0F);
		dustcover.addChild(bone8);
		bone8.cubeList.add(new ModelBox(bone8, 35, 22, -1.0F, -47.6166F, 23.0103F, 1, 2, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 34, 7, -3.0F, -47.6166F, 23.0103F, 1, 2, 1, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone6, 0.8727F, 0.0F, 0.0F);
		dustcover.addChild(bone6);
		bone6.cubeList.add(new ModelBox(bone6, 34, 14, -1.0F, -44.2989F, 17.9843F, 1, 2, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 34, 4, -3.0F, -44.2989F, 17.9843F, 1, 2, 1, 0.0F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(0.0F, -0.6F, -16.2F);
		setRotationAngle(bone14, 0.8727F, 0.0F, 0.0F);
		dustcover.addChild(bone14);
		bone14.cubeList.add(new ModelBox(bone14, 34, 14, -1.0F, -43.5276F, 17.065F, 1, 3, 1, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 34, 4, -3.0F, -43.5276F, 17.065F, 1, 3, 1, 0.0F, false));

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(0.0F, -57.1F, -80.975F);
		setRotationAngle(bone16, -1.5708F, 0.0F, 0.0F);
		dustcover.addChild(bone16);
		bone16.cubeList.add(new ModelBox(bone16, 34, 14, -1.0F, -43.5276F, 17.065F, 1, 3, 1, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 34, 4, -3.0F, -43.5276F, 17.065F, 1, 3, 1, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 0.0F, -42.0F);
		dustcover.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 76, 97, -1.0F, -43.0176F, 18.2679F, 1, 1, 2, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 61, 97, -3.0F, -43.0176F, 18.2679F, 1, 1, 2, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 0.0F, -42.0F);
		dustcover.addChild(bone4);
		bone4.cubeList.add(new ModelBox(bone4, 76, 97, -1.0F, -43.0176F, 18.2679F, 1, 1, 2, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 61, 97, -3.0F, -43.0176F, 18.2679F, 1, 1, 2, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, 2.0F, -42.4F);
		dustcover.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 30, 29, -1.0F, -43.0176F, 17.2679F, 1, 1, 5, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 89, 54, -3.0F, -43.0176F, 17.2679F, 1, 1, 5, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(0.0F, 2.5F, -48.2F);
		dustcover.addChild(bone12);
		bone12.cubeList.add(new ModelBox(bone12, 72, 85, -1.0F, -43.0176F, 9.2679F, 1, 1, 13, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 57, 57, -3.0F, -43.0176F, 9.2679F, 1, 1, 13, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.0F, 1.0F, -42.1F);
		dustcover.addChild(bone9);
		bone9.cubeList.add(new ModelBox(bone9, 51, 93, -1.0F, -43.0176F, 17.2679F, 1, 1, 4, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 51, 93, -3.0F, -43.0176F, 17.2679F, 1, 1, 4, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.0F, -2.0F, -42.1F);
		dustcover.addChild(bone10);
		bone10.cubeList.add(new ModelBox(bone10, 78, 58, -1.3F, -39.3176F, 18.6679F, 1, 1, 1, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 78, 58, -2.7F, -39.3176F, 18.6679F, 1, 1, 1, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(0.0F, -2.0F, -42.1F);
		dustcover.addChild(bone11);
		bone11.cubeList.add(new ModelBox(bone11, 78, 58, -2.0F, -39.0176F, 18.6679F, 1, 1, 1, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, -39.0F, -86.0F);
		setRotationAngle(bone7, -0.8727F, 0.0F, 0.0F);
		dustcover.addChild(bone7);
		bone7.cubeList.add(new ModelBox(bone7, 34, 7, -1.0F, -50.2825F, 36.9474F, 1, 2, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 35, 29, -3.0F, -50.2825F, 36.9474F, 1, 2, 1, 0.0F, false));
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