package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class MicroUzi extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer gun1;
	private final ModelRenderer gun2;
	private final ModelRenderer gun13;
	private final ModelRenderer gun14;
	private final ModelRenderer gun16_r1;
	private final ModelRenderer gun15_r1;
	private final ModelRenderer gun15;
	private final ModelRenderer gun16;
	private final ModelRenderer gun18;
	private final ModelRenderer gun19;
	private final ModelRenderer gun22;
	private final ModelRenderer gun23;
	private final ModelRenderer gun24;
	private final ModelRenderer gun25;
	private final ModelRenderer gun26;
	private final ModelRenderer gun68;
	private final ModelRenderer gun76;
	private final ModelRenderer gun77;
	private final ModelRenderer gun78;
	private final ModelRenderer gun79;
	private final ModelRenderer gun80;
	private final ModelRenderer gun81;
	private final ModelRenderer gun82;
	private final ModelRenderer gun83;
	private final ModelRenderer gun84;
	private final ModelRenderer gun85;
	private final ModelRenderer gun86;
	private final ModelRenderer gun87;
	private final ModelRenderer gun88;
	private final ModelRenderer gun89;
	private final ModelRenderer gun90;
	private final ModelRenderer gun91;
	private final ModelRenderer gun92;
	private final ModelRenderer gun93;
	private final ModelRenderer gun94;
	private final ModelRenderer gun95;
	private final ModelRenderer gun96;
	private final ModelRenderer gun97;
	private final ModelRenderer gun98;
	private final ModelRenderer gun99;
	private final ModelRenderer gun100;
	private final ModelRenderer gun101;
	private final ModelRenderer gun102_r1;
	private final ModelRenderer gun102_r2;
	private final ModelRenderer gun102;
	private final ModelRenderer gun103;
	private final ModelRenderer gun104;
	private final ModelRenderer gun105;
	private final ModelRenderer gun106;
	private final ModelRenderer gun107;
	private final ModelRenderer gun108;
	private final ModelRenderer gun109;
	private final ModelRenderer gun110;
	private final ModelRenderer gun111;
	private final ModelRenderer gun112;
	private final ModelRenderer gun113;
	private final ModelRenderer gun114;
	private final ModelRenderer gun115;
	private final ModelRenderer gun119;
	private final ModelRenderer gun120;
	private final ModelRenderer gun121;
	private final ModelRenderer gun126;
	private final ModelRenderer gun127;
	private final ModelRenderer gun128;
	private final ModelRenderer gun129;
	private final ModelRenderer gun130;
	private final ModelRenderer gun130_r1;
	private final ModelRenderer gun131;
	private final ModelRenderer gun131_r1;
	private final ModelRenderer gun132;
	private final ModelRenderer gun133;
	private final ModelRenderer gun134;
	private final ModelRenderer gun135;
	private final ModelRenderer gun136;
	private final ModelRenderer gun137;
	private final ModelRenderer gun138;
	private final ModelRenderer gun139;
	private final ModelRenderer gun140;
	private final ModelRenderer gun141;
	private final ModelRenderer gun142;
	private final ModelRenderer gun143;
	private final ModelRenderer gun144;
	private final ModelRenderer gun145;
	private final ModelRenderer gun146;
	private final ModelRenderer gun147;
	private final ModelRenderer gun9;
	private final ModelRenderer gun148;
	private final ModelRenderer gun154;
	private final ModelRenderer gun155;
	private final ModelRenderer gun156;
	private final ModelRenderer gun157;
	private final ModelRenderer gun158;
	private final ModelRenderer gun159;
	private final ModelRenderer gun160;
	private final ModelRenderer gun162;
	private final ModelRenderer gun164;
	private final ModelRenderer gun195;
	private final ModelRenderer gun196;
	private final ModelRenderer gun197;
	private final ModelRenderer gun198;
	private final ModelRenderer gun199;
	private final ModelRenderer gun200;
	private final ModelRenderer gun201;
	private final ModelRenderer gun202;
	private final ModelRenderer gun203;
	private final ModelRenderer gun204;
	private final ModelRenderer gun205;
	private final ModelRenderer gun206;
	private final ModelRenderer gun207;
	private final ModelRenderer gun207_r1;
	private final ModelRenderer gun208;
	private final ModelRenderer gun208_r1;
	private final ModelRenderer gun209;
	private final ModelRenderer gun209_r1;
	private final ModelRenderer gun210;
	private final ModelRenderer gun210_r1;
	private final ModelRenderer gun211;
	private final ModelRenderer gun214;
	private final ModelRenderer gun223;
	private final ModelRenderer gun224;
	private final ModelRenderer gun225;
	private final ModelRenderer gun226;
	private final ModelRenderer gun227;
	private final ModelRenderer gun228;
	private final ModelRenderer gun229;
	private final ModelRenderer gun230;
	private final ModelRenderer gun231;
	private final ModelRenderer gun232;
	private final ModelRenderer gun233;
	private final ModelRenderer gun234;
	private final ModelRenderer gun235;
	private final ModelRenderer gun236;
	private final ModelRenderer gun237;
	private final ModelRenderer gun238;
	private final ModelRenderer Irons;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer ironsights;
	private final ModelRenderer ironsights_r1;
	private final ModelRenderer ironsights_r2;
	private final ModelRenderer gun4;
	private final ModelRenderer gun239;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;

	public MicroUzi() {
		textureWidth = 256;
		textureHeight = 256;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		gun1 = new ModelRenderer(this);
		gun1.setRotationPoint(-2.0F, -32.5F, -8.2F);
		gun.addChild(gun1);
		setRotationAngle(gun1, -0.2974F, 0.0F, 0.0F);
		gun1.cubeList.add(new ModelBox(gun1, 121, 177, 0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F, false));

		gun2 = new ModelRenderer(this);
		gun2.setRotationPoint(-4.0F, -34.0F, -13.5F);
		gun.addChild(gun2);
		gun2.cubeList.add(new ModelBox(gun2, 0, 33, 0.0F, 0.0F, -2.0F, 5, 1, 20, 0.0F, false));

		gun13 = new ModelRenderer(this);
		gun13.setRotationPoint(-0.2F, -38.0F, -20.5F);
		gun.addChild(gun13);
		gun13.cubeList.add(new ModelBox(gun13, 0, 0, 0.0F, 0.0F, 0.0F, 1, 5, 27, 0.0F, false));
		gun13.cubeList.add(new ModelBox(gun13, 18, 176, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun14 = new ModelRenderer(this);
		gun14.setRotationPoint(-3.8F, -38.0F, -20.5F);
		gun.addChild(gun14);
		gun14.cubeList.add(new ModelBox(gun14, 31, 132, 0.0F, 0.0F, 0.0F, 1, 5, 12, 0.0F, false));
		gun14.cubeList.add(new ModelBox(gun14, 27, 176, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun16_r1 = new ModelRenderer(this);
		gun16_r1.setRotationPoint(3.9036F, 4.8772F, 1.5F);
		gun14.addChild(gun16_r1);
		setRotationAngle(gun16_r1, 0.0F, 0.0F, 0.9599F);
		gun16_r1.cubeList.add(new ModelBox(gun16_r1, 55, 161, -0.5F, -0.5F, -1.5F, 1, 1, 7, 0.0F, false));

		gun15_r1 = new ModelRenderer(this);
		gun15_r1.setRotationPoint(0.6964F, 4.8772F, 1.5F);
		gun14.addChild(gun15_r1);
		setRotationAngle(gun15_r1, 0.0F, 0.0F, -0.9599F);
		gun15_r1.cubeList.add(new ModelBox(gun15_r1, 0, 161, -0.5F, -0.5F, -1.5F, 1, 1, 7, 0.0F, false));

		gun15 = new ModelRenderer(this);
		gun15.setRotationPoint(-4.0F, -35.2F, -12.5F);
		gun.addChild(gun15);
		gun15.cubeList.add(new ModelBox(gun15, 115, 94, 0.0F, 0.0F, -1.0F, 1, 1, 14, 0.0F, false));

		gun16 = new ModelRenderer(this);
		gun16.setRotationPoint(-3.8F, -35.3F, -8.5F);
		gun.addChild(gun16);
		gun16.cubeList.add(new ModelBox(gun16, 136, 161, 0.0F, 0.0F, 0.0F, 1, 2, 6, 0.0F, false));

		gun18 = new ModelRenderer(this);
		gun18.setRotationPoint(-3.8F, -38.0F, -2.5F);
		gun.addChild(gun18);
		gun18.cubeList.add(new ModelBox(gun18, 85, 133, 0.0F, 0.0F, 0.0F, 1, 5, 9, 0.0F, false));

		gun19 = new ModelRenderer(this);
		gun19.setRotationPoint(-0.2F, -37.5F, -17.5F);
		gun.addChild(gun19);
		gun19.cubeList.add(new ModelBox(gun19, 51, 33, -0.5F, -0.5F, 1.0F, 1, 4, 19, 0.0F, false));

		gun22 = new ModelRenderer(this);
		gun22.setRotationPoint(-2.5F, -31.5F, -7.0F);
		gun.addChild(gun22);
		gun22.cubeList.add(new ModelBox(gun22, 177, 42, 0.0F, 0.0071F, 0.1071F, 2, 3, 1, 0.0F, false));

		gun23 = new ModelRenderer(this);
		gun23.setRotationPoint(-2.5F, -27.5F, -12.0F);
		gun.addChild(gun23);
		gun23.cubeList.add(new ModelBox(gun23, 167, 138, 0.0F, 0.0071F, 0.1071F, 2, 1, 4, 0.0F, false));
		gun23.cubeList.add(new ModelBox(gun23, 177, 8, 0.0F, 0.0071F, -1.0929F, 2, 1, 2, 0.0F, false));

		gun24 = new ModelRenderer(this);
		gun24.setRotationPoint(-2.5F, -33.5F, -13.9F);
		gun.addChild(gun24);
		gun24.cubeList.add(new ModelBox(gun24, 75, 172, 0.0F, -0.8213F, -0.1929F, 2, 5, 1, 0.0F, false));
		gun24.cubeList.add(new ModelBox(gun24, 83, 148, -0.5058F, -0.9264F, -6.6F, 3, 2, 7, 0.0F, false));

		gun25 = new ModelRenderer(this);
		gun25.setRotationPoint(-2.5F, -28.5F, -13.9F);
		gun.addChild(gun25);
		setRotationAngle(gun25, 0.7854F, 0.0F, 0.0F);
		gun25.cubeList.add(new ModelBox(gun25, 178, 57, 0.0F, -0.0101F, -0.8485F, 2, 2, 1, 0.0F, false));
		gun25.cubeList.add(new ModelBox(gun25, 177, 4, 0.0F, -1.0101F, -0.8485F, 2, 1, 2, 0.0F, false));

		gun26 = new ModelRenderer(this);
		gun26.setRotationPoint(-2.5F, -27.2F, -12.6F);
		gun.addChild(gun26);
		setRotationAngle(gun26, 0.7854F, 0.0F, 0.0F);
		

		gun68 = new ModelRenderer(this);
		gun68.setRotationPoint(-4.0F, -34.2F, -12.5F);
		gun.addChild(gun68);
		setRotationAngle(gun68, 0.0F, 0.0F, -0.7854F);
		gun68.cubeList.add(new ModelBox(gun68, 109, 115, 0.0F, 0.0F, -1.0F, 1, 1, 14, 0.0F, false));

		gun76 = new ModelRenderer(this);
		gun76.setRotationPoint(-4.0F, -37.0F, -9.7F);
		gun.addChild(gun76);
		gun76.cubeList.add(new ModelBox(gun76, 24, 181, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun77 = new ModelRenderer(this);
		gun77.setRotationPoint(-4.0F, -35.9F, -8.7F);
		gun.addChild(gun77);
		setRotationAngle(gun77, -0.7854F, 0.0F, 0.0F);
		gun77.cubeList.add(new ModelBox(gun77, 182, 98, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun78 = new ModelRenderer(this);
		gun78.setRotationPoint(-4.0F, -35.9F, -2.3F);
		gun.addChild(gun78);
		setRotationAngle(gun78, -0.7854F, 0.0F, 0.0F);
		gun78.cubeList.add(new ModelBox(gun78, 100, 182, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun79 = new ModelRenderer(this);
		gun79.setRotationPoint(-3.8F, -35.9F, -2.5F);
		gun.addChild(gun79);
		setRotationAngle(gun79, -0.7854F, 0.0F, 0.0F);
		gun79.cubeList.add(new ModelBox(gun79, 182, 101, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun80 = new ModelRenderer(this);
		gun80.setRotationPoint(-4.0F, -37.0F, -12.5F);
		gun.addChild(gun80);
		gun80.cubeList.add(new ModelBox(gun80, 164, 169, 0.0F, 0.0F, -1.0F, 1, 1, 4, 0.0F, false));

		gun81 = new ModelRenderer(this);
		gun81.setRotationPoint(-4.0F, -37.0F, -2.3F);
		gun.addChild(gun81);
		gun81.cubeList.add(new ModelBox(gun81, 29, 181, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun82 = new ModelRenderer(this);
		gun82.setRotationPoint(-4.0F, -37.0F, -1.5F);
		gun.addChild(gun82);
		gun82.cubeList.add(new ModelBox(gun82, 178, 134, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun83 = new ModelRenderer(this);
		gun83.setRotationPoint(-4.0F, -36.0F, -12.5F);
		gun.addChild(gun83);
		setRotationAngle(gun83, 0.0F, 0.0F, -0.7854F);
		gun83.cubeList.add(new ModelBox(gun83, 0, 170, 0.0F, 0.0F, -1.0F, 1, 1, 4, 0.0F, false));

		gun84 = new ModelRenderer(this);
		gun84.setRotationPoint(-4.0F, -35.2F, -12.5F);
		gun.addChild(gun84);
		setRotationAngle(gun84, 0.0F, 0.0F, -0.7854F);
		gun84.cubeList.add(new ModelBox(gun84, 55, 170, 0.0F, 0.0F, -1.0F, 1, 1, 4, 0.0F, false));

		gun85 = new ModelRenderer(this);
		gun85.setRotationPoint(-4.0F, -37.0F, -12.5F);
		gun.addChild(gun85);
		setRotationAngle(gun85, 0.0F, 0.0F, -0.7854F);
		gun85.cubeList.add(new ModelBox(gun85, 130, 170, 0.0F, 0.0F, -1.0F, 1, 1, 4, 0.0F, false));

		gun86 = new ModelRenderer(this);
		gun86.setRotationPoint(-4.0F, -36.0F, -1.5F);
		gun.addChild(gun86);
		setRotationAngle(gun86, 0.0F, 0.0F, -0.7854F);
		gun86.cubeList.add(new ModelBox(gun86, 179, 158, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun87 = new ModelRenderer(this);
		gun87.setRotationPoint(-4.0F, -35.2F, -1.5F);
		gun.addChild(gun87);
		setRotationAngle(gun87, 0.0F, 0.0F, -0.7854F);
		gun87.cubeList.add(new ModelBox(gun87, 179, 162, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun88 = new ModelRenderer(this);
		gun88.setRotationPoint(-4.0F, -37.0F, -9.7F);
		gun.addChild(gun88);
		setRotationAngle(gun88, 0.0F, 0.0F, -0.7854F);
		gun88.cubeList.add(new ModelBox(gun88, 182, 104, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun89 = new ModelRenderer(this);
		gun89.setRotationPoint(-4.0F, -37.0F, -2.3F);
		gun.addChild(gun89);
		setRotationAngle(gun89, 0.0F, 0.0F, -0.7854F);
		gun89.cubeList.add(new ModelBox(gun89, 105, 182, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun90 = new ModelRenderer(this);
		gun90.setRotationPoint(-4.0F, -37.0F, -1.5F);
		gun.addChild(gun90);
		setRotationAngle(gun90, 0.0F, 0.0F, -0.7854F);
		gun90.cubeList.add(new ModelBox(gun90, 177, 179, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun91 = new ModelRenderer(this);
		gun91.setRotationPoint(-3.3F, -38.0F, -25.5F);
		gun.addChild(gun91);
		

		gun92 = new ModelRenderer(this);
		gun92.setRotationPoint(-3.8F, -38.0F, -20.5F);
		gun.addChild(gun92);
		setRotationAngle(gun92, 0.0F, 1.2315F, 0.0F);
		

		gun93 = new ModelRenderer(this);
		gun93.setRotationPoint(0.8F, -38.0F, -20.5F);
		gun.addChild(gun93);
		setRotationAngle(gun93, 0.0F, -2.7652F, 0.0F);
		

		gun94 = new ModelRenderer(this);
		gun94.setRotationPoint(-0.7F, -38.0F, -25.5F);
		gun.addChild(gun94);
		

		gun95 = new ModelRenderer(this);
		gun95.setRotationPoint(-4.0F, -37.0F, 3.0F);
		gun.addChild(gun95);
		

		gun96 = new ModelRenderer(this);
		gun96.setRotationPoint(-4.0F, -35.2F, 3.0F);
		gun.addChild(gun96);
		

		gun97 = new ModelRenderer(this);
		gun97.setRotationPoint(-4.0F, -37.0F, 3.0F);
		gun.addChild(gun97);
		setRotationAngle(gun97, 0.0F, 0.0F, -0.7854F);
		

		gun98 = new ModelRenderer(this);
		gun98.setRotationPoint(-4.0F, -36.0F, 3.0F);
		gun.addChild(gun98);
		setRotationAngle(gun98, 0.0F, 0.0F, -0.7854F);
		

		gun99 = new ModelRenderer(this);
		gun99.setRotationPoint(-4.0F, -35.2F, 3.0F);
		gun.addChild(gun99);
		setRotationAngle(gun99, 0.0F, 0.0F, -0.7854F);
		

		gun100 = new ModelRenderer(this);
		gun100.setRotationPoint(-4.0F, -34.2F, 3.0F);
		gun.addChild(gun100);
		setRotationAngle(gun100, 0.0F, 0.0F, -0.7854F);
		

		gun101 = new ModelRenderer(this);
		gun101.setRotationPoint(-4.0F, -32.0F, -13.5F);
		gun.addChild(gun101);
		gun101.cubeList.add(new ModelBox(gun101, 0, 76, 0.0F, 0.0F, -1.0F, 5, 1, 15, 0.0F, false));
		gun101.cubeList.add(new ModelBox(gun101, 135, 14, 0.0F, 0.0F, 13.55F, 5, 1, 1, 0.0F, false));
		gun101.cubeList.add(new ModelBox(gun101, 125, 51, 0.0F, 0.0F, -1.075F, 5, 1, 1, 0.0F, false));

		gun102_r1 = new ModelRenderer(this);
		gun102_r1.setRotationPoint(2.5F, 5.586F, 1.6228F);
		gun101.addChild(gun102_r1);
		setRotationAngle(gun102_r1, -1.1345F, 0.0F, 0.0F);
		gun102_r1.cubeList.add(new ModelBox(gun102_r1, 119, 71, -2.5F, -0.5F, -7.3F, 5, 1, 2, 0.0F, false));
		gun102_r1.cubeList.add(new ModelBox(gun102_r1, 115, 110, -2.5F, -0.5F, -7.5F, 5, 1, 2, 0.0F, false));

		gun102_r2 = new ModelRenderer(this);
		gun102_r2.setRotationPoint(2.5F, -0.183F, 15.5849F);
		gun101.addChild(gun102_r2);
		setRotationAngle(gun102_r2, -1.0472F, 0.0F, 0.0F);
		gun102_r2.cubeList.add(new ModelBox(gun102_r2, 151, 168, -2.5F, -2.5F, -0.5F, 5, 4, 1, 0.0F, false));

		gun102 = new ModelRenderer(this);
		gun102.setRotationPoint(-4.0F, -33.0F, -13.5F);
		gun.addChild(gun102);
		gun102.cubeList.add(new ModelBox(gun102, 150, 71, 0.0F, 0.0F, -1.0F, 5, 1, 5, 0.0F, false));

		gun103 = new ModelRenderer(this);
		gun103.setRotationPoint(-4.0F, -33.0F, -2.5F);
		gun.addChild(gun103);
		gun103.cubeList.add(new ModelBox(gun103, 150, 78, 0.0F, 0.0F, 0.0F, 5, 1, 5, 0.0F, false));
		gun103.cubeList.add(new ModelBox(gun103, 182, 95, -0.1F, 0.0F, 1.0F, 1, 1, 1, 0.0F, false));
		gun103.cubeList.add(new ModelBox(gun103, 179, 166, 3.1F, 0.0F, 1.0F, 2, 1, 1, 0.0F, false));

		gun104 = new ModelRenderer(this);
		gun104.setRotationPoint(-3.8F, -33.0F, -9.5F);
		gun.addChild(gun104);
		gun104.cubeList.add(new ModelBox(gun104, 150, 85, 0.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, false));

		gun105 = new ModelRenderer(this);
		gun105.setRotationPoint(-0.2F, -33.0F, -9.5F);
		gun.addChild(gun105);
		gun105.cubeList.add(new ModelBox(gun105, 136, 152, 0.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, false));

		gun106 = new ModelRenderer(this);
		gun106.setRotationPoint(0.0F, -37.0F, -12.5F);
		gun.addChild(gun106);
		gun106.cubeList.add(new ModelBox(gun106, 37, 116, 0.0F, 0.0F, -1.0F, 1, 1, 14, 0.0F, false));

		gun107 = new ModelRenderer(this);
		gun107.setRotationPoint(0.0F, -35.2F, -12.5F);
		gun.addChild(gun107);
		gun107.cubeList.add(new ModelBox(gun107, 119, 55, 0.0F, 0.0F, -1.0F, 1, 1, 14, 0.0F, false));

		gun108 = new ModelRenderer(this);
		gun108.setRotationPoint(1.0F, -37.0F, -12.5F);
		gun.addChild(gun108);
		setRotationAngle(gun108, 0.0F, 0.0F, 2.3562F);
		gun108.cubeList.add(new ModelBox(gun108, 129, 19, 0.0F, 0.0F, -1.0F, 1, 1, 14, 0.0F, false));

		gun109 = new ModelRenderer(this);
		gun109.setRotationPoint(1.0F, -36.0F, -12.5F);
		gun.addChild(gun109);
		setRotationAngle(gun109, 0.0F, 0.0F, 2.3562F);
		gun109.cubeList.add(new ModelBox(gun109, 129, 35, 0.0F, 0.0F, -1.0F, 1, 1, 14, 0.0F, false));

		gun110 = new ModelRenderer(this);
		gun110.setRotationPoint(1.0F, -35.2F, -12.5F);
		gun.addChild(gun110);
		setRotationAngle(gun110, 0.0F, 0.0F, 2.3562F);
		gun110.cubeList.add(new ModelBox(gun110, 0, 131, 0.0F, 0.0F, -1.0F, 1, 1, 14, 0.0F, false));

		gun111 = new ModelRenderer(this);
		gun111.setRotationPoint(1.0F, -34.2F, -12.5F);
		gun.addChild(gun111);
		setRotationAngle(gun111, 0.0F, 0.0F, 2.3562F);
		gun111.cubeList.add(new ModelBox(gun111, 109, 131, 0.0F, 0.0F, -1.0F, 1, 1, 14, 0.0F, false));

		gun112 = new ModelRenderer(this);
		gun112.setRotationPoint(1.0F, -37.0F, 3.0F);
		gun.addChild(gun112);
		setRotationAngle(gun112, 0.0F, 0.0F, 2.3562F);
		

		gun113 = new ModelRenderer(this);
		gun113.setRotationPoint(1.0F, -36.0F, 3.0F);
		gun.addChild(gun113);
		setRotationAngle(gun113, 0.0F, 0.0F, 2.3562F);
		

		gun114 = new ModelRenderer(this);
		gun114.setRotationPoint(1.0F, -35.2F, 3.0F);
		gun.addChild(gun114);
		setRotationAngle(gun114, 0.0F, 0.0F, 2.3562F);
		

		gun115 = new ModelRenderer(this);
		gun115.setRotationPoint(1.0F, -34.2F, 3.0F);
		gun.addChild(gun115);
		setRotationAngle(gun115, 0.0F, 0.0F, 2.3562F);
		

		gun119 = new ModelRenderer(this);
		gun119.setRotationPoint(-1.0F, -39.0F, -20.5F);
		gun.addChild(gun119);
		gun119.cubeList.add(new ModelBox(gun119, 41, 57, 0.0F, 0.0F, 3.0F, 2, 1, 18, 0.0F, false));

		gun120 = new ModelRenderer(this);
		gun120.setRotationPoint(-4.0F, -39.0F, -20.5F);
		gun.addChild(gun120);
		gun120.cubeList.add(new ModelBox(gun120, 57, 21, 0.0F, 0.0F, 3.0F, 1, 1, 9, 0.0F, false));

		gun121 = new ModelRenderer(this);
		gun121.setRotationPoint(-4.0F, -39.0F, -2.5F);
		gun.addChild(gun121);
		gun121.cubeList.add(new ModelBox(gun121, 134, 71, 0.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F, false));

		gun126 = new ModelRenderer(this);
		gun126.setRotationPoint(-3.3F, -39.7F, -9.5F);
		gun.addChild(gun126);
		gun126.cubeList.add(new ModelBox(gun126, 153, 152, 0.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, false));

		gun127 = new ModelRenderer(this);
		gun127.setRotationPoint(-0.7F, -39.7F, -9.5F);
		gun.addChild(gun127);
		gun127.cubeList.add(new ModelBox(gun127, 83, 158, 0.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, false));

		gun128 = new ModelRenderer(this);
		gun128.setRotationPoint(-0.7F, -39.7F, -9.5F);
		gun.addChild(gun128);
		setRotationAngle(gun128, -1.5615F, 0.0F, 0.0F);
		gun128.cubeList.add(new ModelBox(gun128, 68, 116, 0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F, false));

		gun129 = new ModelRenderer(this);
		gun129.setRotationPoint(-3.3F, -39.7F, -9.5F);
		gun.addChild(gun129);
		setRotationAngle(gun129, -1.5615F, 0.0F, 0.0F);
		gun129.cubeList.add(new ModelBox(gun129, 39, 169, 0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F, false));

		gun130 = new ModelRenderer(this);
		gun130.setRotationPoint(-3.3F, -39.7F, -1.5F);
		gun.addChild(gun130);
		setRotationAngle(gun130, -0.0744F, 0.0F, 0.0F);
		

		gun130_r1 = new ModelRenderer(this);
		gun130_r1.setRotationPoint(1.8F, 0.6595F, -0.0446F);
		gun130.addChild(gun130_r1);
		setRotationAngle(gun130_r1, -0.0873F, 0.0F, 0.0F);
		gun130_r1.cubeList.add(new ModelBox(gun130_r1, 170, 152, -1.8F, -0.5F, -1.0F, 1, 1, 4, 0.0F, false));

		gun131 = new ModelRenderer(this);
		gun131.setRotationPoint(-0.7F, -39.7F, -1.5F);
		gun.addChild(gun131);
		setRotationAngle(gun131, -0.0744F, 0.0F, 0.0F);
		

		gun131_r1 = new ModelRenderer(this);
		gun131_r1.setRotationPoint(-0.8F, 0.6595F, -0.0446F);
		gun131.addChild(gun131_r1);
		setRotationAngle(gun131_r1, -0.0873F, 0.0F, 0.0F);
		gun131_r1.cubeList.add(new ModelBox(gun131_r1, 171, 61, 0.8F, -0.5F, -1.0F, 1, 1, 4, 0.0F, false));

		gun132 = new ModelRenderer(this);
		gun132.setRotationPoint(0.3F, -39.7F, -9.5F);
		gun.addChild(gun132);
		setRotationAngle(gun132, 0.0F, 0.0F, 0.7854F);
		gun132.cubeList.add(new ModelBox(gun132, 160, 14, 0.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, false));

		gun133 = new ModelRenderer(this);
		gun133.setRotationPoint(-3.3F, -39.7F, -9.5F);
		gun.addChild(gun133);
		setRotationAngle(gun133, 0.0F, 0.0F, 0.7854F);
		gun133.cubeList.add(new ModelBox(gun133, 110, 182, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun134 = new ModelRenderer(this);
		gun134.setRotationPoint(-3.3F, -39.7F, -2.5F);
		gun.addChild(gun134);
		setRotationAngle(gun134, 0.0F, 0.0F, 0.7854F);
		gun134.cubeList.add(new ModelBox(gun134, 100, 163, 0.0F, 0.0F, -6.0F, 1, 1, 6, 0.0F, false));

		gun135 = new ModelRenderer(this);
		gun135.setRotationPoint(0.29F, -39.6F, -15.5F);
		gun.addChild(gun135);
		setRotationAngle(gun135, 0.0F, 0.0F, 0.7854F);
		gun135.cubeList.add(new ModelBox(gun135, 167, 85, 0.0F, 0.0F, 1.0F, 1, 1, 5, 0.0F, false));

		gun136 = new ModelRenderer(this);
		gun136.setRotationPoint(-3.29F, -39.6F, -15.5F);
		gun.addChild(gun136);
		setRotationAngle(gun136, 0.0F, 0.0F, 0.7854F);
		gun136.cubeList.add(new ModelBox(gun136, 167, 108, 0.0F, 0.0F, 1.0F, 1, 1, 5, 0.0F, false));

		gun137 = new ModelRenderer(this);
		gun137.setRotationPoint(0.29F, -39.5F, -20.5F);
		gun.addChild(gun137);
		setRotationAngle(gun137, 0.0F, 0.0F, 0.7854F);
		gun137.cubeList.add(new ModelBox(gun137, 130, 110, 0.0F, 0.0F, 3.0F, 1, 1, 3, 0.0F, false));

		gun138 = new ModelRenderer(this);
		gun138.setRotationPoint(-3.29F, -39.5F, -20.5F);
		gun.addChild(gun138);
		setRotationAngle(gun138, 0.0F, 0.0F, 0.7854F);
		gun138.cubeList.add(new ModelBox(gun138, 118, 172, 0.0F, 0.0F, 3.0F, 1, 1, 3, 0.0F, false));

		gun139 = new ModelRenderer(this);
		gun139.setRotationPoint(-3.29F, -39.5F, -1.5F);
		gun.addChild(gun139);
		setRotationAngle(gun139, 0.0F, 0.0F, 0.7854F);
		gun139.cubeList.add(new ModelBox(gun139, 115, 182, 0.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

		gun140 = new ModelRenderer(this);
		gun140.setRotationPoint(0.29F, -39.5F, -1.5F);
		gun.addChild(gun140);
		setRotationAngle(gun140, 0.0F, 0.0F, 0.7854F);
		gun140.cubeList.add(new ModelBox(gun140, 65, 183, 0.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

		gun141 = new ModelRenderer(this);
		gun141.setRotationPoint(-2.1F, -39.5F, -8.5F);
		gun.addChild(gun141);
		gun141.cubeList.add(new ModelBox(gun141, 173, 92, 0.0F, 0.0F, 4.0F, 1, 1, 3, 0.0F, false));
		gun141.cubeList.add(new ModelBox(gun141, 120, 183, 0.0F, 0.0F, -9.0F, 1, 1, 1, 0.0F, false));

		gun142 = new ModelRenderer(this);
		gun142.setRotationPoint(-1.9F, -39.5F, -8.5F);
		gun.addChild(gun142);
		gun142.cubeList.add(new ModelBox(gun142, 173, 97, 0.0F, 0.0F, 4.0F, 1, 1, 3, 0.0F, false));
		gun142.cubeList.add(new ModelBox(gun142, 173, 183, 0.0F, 0.0F, -9.0F, 1, 1, 1, 0.0F, false));

		gun143 = new ModelRenderer(this);
		gun143.setRotationPoint(-2.1F, -39.5F, -23.5F);
		gun.addChild(gun143);
		setRotationAngle(gun143, 0.0F, 0.0F, 0.7854F);
		gun143.cubeList.add(new ModelBox(gun143, 74, 115, 0.0F, 0.0F, 6.0F, 1, 1, 16, 0.0F, false));

		gun144 = new ModelRenderer(this);
		gun144.setRotationPoint(-0.9F, -39.5F, -23.5F);
		gun.addChild(gun144);
		setRotationAngle(gun144, 0.0F, 0.0F, 0.7854F);
		gun144.cubeList.add(new ModelBox(gun144, 115, 76, 0.0F, 0.0F, 6.0F, 1, 1, 16, 0.0F, false));

		gun145 = new ModelRenderer(this);
		gun145.setRotationPoint(-2.1F, -39.5F, -23.5F);
		gun.addChild(gun145);
		

		gun146 = new ModelRenderer(this);
		gun146.setRotationPoint(-1.9F, -39.5F, -23.5F);
		gun.addChild(gun146);
		

		gun147 = new ModelRenderer(this);
		gun147.setRotationPoint(1.0F, -39.0F, -20.5F);
		gun.addChild(gun147);
		setRotationAngle(gun147, 0.0F, -2.7652F, 0.0F);
		

		gun9 = new ModelRenderer(this);
		gun9.setRotationPoint(-7.3698F, -39.0F, -17.1915F);
		gun.addChild(gun9);
		setRotationAngle(gun9, 0.0F, 2.7763F, 0.0F);
		

		gun148 = new ModelRenderer(this);
		gun148.setRotationPoint(-3.5F, -39.0F, -25.5F);
		gun.addChild(gun148);
		

		gun154 = new ModelRenderer(this);
		gun154.setRotationPoint(-3.5F, -38.0F, -25.5F);
		gun.addChild(gun154);
		

		gun155 = new ModelRenderer(this);
		gun155.setRotationPoint(-3.5F, -36.8F, -23.5F);
		gun.addChild(gun155);
		setRotationAngle(gun155, 2.3562F, 0.0F, 0.0F);
		

		gun156 = new ModelRenderer(this);
		gun156.setRotationPoint(-3.3F, -39.45F, -25.5F);
		gun.addChild(gun156);
		

		gun157 = new ModelRenderer(this);
		gun157.setRotationPoint(-1.7F, -39.45F, -25.5F);
		gun.addChild(gun157);
		

		gun158 = new ModelRenderer(this);
		gun158.setRotationPoint(-3.2F, -39.6F, -29.5F);
		gun.addChild(gun158);
		gun158.cubeList.add(new ModelBox(gun158, 72, 161, 0.0F, -0.3F, 9.0F, 2, 7, 3, 0.0F, false));
		gun158.cubeList.add(new ModelBox(gun158, 167, 115, 0.0F, -0.3F, 32.0F, 2, 2, 4, 0.0F, false));

		gun159 = new ModelRenderer(this);
		gun159.setRotationPoint(-1.8F, -39.6F, -29.5F);
		gun.addChild(gun159);
		gun159.cubeList.add(new ModelBox(gun159, 167, 50, 0.0F, -0.3F, 9.0F, 2, 7, 3, 0.0F, false));
		gun159.cubeList.add(new ModelBox(gun159, 167, 122, 0.0F, -0.3F, 32.0F, 2, 2, 4, 0.0F, false));

		gun160 = new ModelRenderer(this);
		gun160.setRotationPoint(-3.0F, -38.9F, 8.5F);
		gun.addChild(gun160);
		gun160.cubeList.add(new ModelBox(gun160, 83, 167, 0.0F, 1.0F, -5.0F, 3, 4, 3, 0.0F, false));

		gun162 = new ModelRenderer(this);
		gun162.setRotationPoint(-3.0F, -38.9F, 8.5F);
		gun.addChild(gun162);
		setRotationAngle(gun162, 0.0F, 0.0F, 0.733F);
		gun162.cubeList.add(new ModelBox(gun162, 171, 67, 0.0F, 0.2F, -6.0F, 1, 1, 4, 0.0F, false));

		gun164 = new ModelRenderer(this);
		gun164.setRotationPoint(0.0F, -38.9F, 8.5F);
		gun.addChild(gun164);
		setRotationAngle(gun164, 0.0F, 0.0F, 0.8465F);
		gun164.cubeList.add(new ModelBox(gun164, 171, 73, 0.2F, 0.0F, -6.0F, 1, 1, 4, 0.0F, false));

		gun195 = new ModelRenderer(this);
		gun195.setRotationPoint(-2.5F, -37.0F, -32.5F);
		gun.addChild(gun195);
		gun195.cubeList.add(new ModelBox(gun195, 167, 144, 0.0F, 0.0F, 10.0F, 2, 4, 3, 0.0F, false));

		gun196 = new ModelRenderer(this);
		gun196.setRotationPoint(-3.5F, -36.0F, -32.5F);
		gun.addChild(gun196);
		gun196.cubeList.add(new ModelBox(gun196, 162, 8, 0.0F, 0.0F, 10.0F, 4, 2, 3, 0.0F, false));

		gun197 = new ModelRenderer(this);
		gun197.setRotationPoint(-2.5F, -37.0F, -32.5F);
		gun.addChild(gun197);
		setRotationAngle(gun197, 0.0F, 0.0F, 0.7854F);
		gun197.cubeList.add(new ModelBox(gun197, 173, 102, 0.0F, 0.0F, 10.0F, 1, 1, 3, 0.0F, false));

		gun198 = new ModelRenderer(this);
		gun198.setRotationPoint(-0.5F, -37.0F, -32.5F);
		gun.addChild(gun198);
		setRotationAngle(gun198, 0.0F, 0.0F, 0.7854F);
		gun198.cubeList.add(new ModelBox(gun198, 150, 174, 0.0F, 0.0F, 10.0F, 1, 1, 3, 0.0F, false));

		gun199 = new ModelRenderer(this);
		gun199.setRotationPoint(-3.5F, -36.0F, -32.5F);
		gun.addChild(gun199);
		setRotationAngle(gun199, 0.0F, 0.0F, -0.7854F);
		gun199.cubeList.add(new ModelBox(gun199, 44, 175, 0.0F, 0.0F, 10.0F, 1, 1, 3, 0.0F, false));

		gun200 = new ModelRenderer(this);
		gun200.setRotationPoint(-3.5F, -34.0F, -32.5F);
		gun.addChild(gun200);
		setRotationAngle(gun200, 0.0F, 0.0F, -0.7854F);
		gun200.cubeList.add(new ModelBox(gun200, 82, 175, 0.0F, 0.0F, 10.0F, 1, 1, 3, 0.0F, false));

		gun201 = new ModelRenderer(this);
		gun201.setRotationPoint(-2.5F, -33.0F, -32.5F);
		gun.addChild(gun201);
		setRotationAngle(gun201, 0.0F, 0.0F, -2.3562F);
		gun201.cubeList.add(new ModelBox(gun201, 91, 175, 0.0F, 0.0F, 10.0F, 1, 1, 3, 0.0F, false));

		gun202 = new ModelRenderer(this);
		gun202.setRotationPoint(-0.5F, -33.0F, -32.5F);
		gun.addChild(gun202);
		setRotationAngle(gun202, 0.0F, 0.0F, -2.3562F);
		gun202.cubeList.add(new ModelBox(gun202, 159, 175, 0.0F, 0.0F, 10.0F, 1, 1, 3, 0.0F, false));

		gun203 = new ModelRenderer(this);
		gun203.setRotationPoint(0.5F, -36.0F, -32.5F);
		gun.addChild(gun203);
		setRotationAngle(gun203, 0.0F, 0.0F, 2.3562F);
		gun203.cubeList.add(new ModelBox(gun203, 168, 175, 0.0F, 0.0F, 10.0F, 1, 1, 3, 0.0F, false));

		gun204 = new ModelRenderer(this);
		gun204.setRotationPoint(0.5F, -34.0F, -32.5F);
		gun.addChild(gun204);
		setRotationAngle(gun204, 0.0F, 0.0F, 2.3562F);
		gun204.cubeList.add(new ModelBox(gun204, 175, 169, 0.0F, 0.0F, 10.0F, 1, 1, 3, 0.0F, false));

		gun205 = new ModelRenderer(this);
		gun205.setRotationPoint(-2.0F, -36.0F, -42.5F);
		gun.addChild(gun205);
		gun205.cubeList.add(new ModelBox(gun205, 0, 112, 0.0F, -0.2F, 15.7F, 1, 1, 17, 0.0F, false));
		gun205.cubeList.add(new ModelBox(gun205, 78, 77, 0.0F, 1.2142F, 15.7F, 1, 1, 17, 0.0F, false));

		gun206 = new ModelRenderer(this);
		gun206.setRotationPoint(-2.5F, -35.5F, -42.5F);
		gun.addChild(gun206);
		gun206.cubeList.add(new ModelBox(gun206, 82, 57, 1.2071F, 0.0071F, 15.7F, 1, 1, 17, 0.0F, false));
		gun206.cubeList.add(new ModelBox(gun206, 92, 21, -0.2071F, 0.0071F, 15.7F, 1, 1, 17, 0.0F, false));

		gun207 = new ModelRenderer(this);
		gun207.setRotationPoint(-2.3F, -35.8F, -42.5F);
		gun.addChild(gun207);
		

		gun207_r1 = new ModelRenderer(this);
		gun207_r1.setRotationPoint(0.3F, 0.7314F, 17.7F);
		gun207.addChild(gun207_r1);
		setRotationAngle(gun207_r1, 0.0F, 0.0F, 0.7854F);
		gun207_r1.cubeList.add(new ModelBox(gun207_r1, 0, 93, -0.8F, -0.8F, -2.0F, 1, 1, 17, 0.0F, false));

		gun208 = new ModelRenderer(this);
		gun208.setRotationPoint(-2.3F, -35.2F, -42.5F);
		gun.addChild(gun208);
		

		gun208_r1 = new ModelRenderer(this);
		gun208_r1.setRotationPoint(0.7243F, 0.7071F, 17.7F);
		gun208.addChild(gun208_r1);
		setRotationAngle(gun208_r1, 0.0F, 0.0F, 0.7854F);
		gun208_r1.cubeList.add(new ModelBox(gun208_r1, 78, 96, -0.8F, -0.2F, -2.0F, 1, 1, 17, 0.0F, false));

		gun209 = new ModelRenderer(this);
		gun209.setRotationPoint(-1.7F, -35.2F, -42.5F);
		gun.addChild(gun209);
		

		gun209_r1 = new ModelRenderer(this);
		gun209_r1.setRotationPoint(0.7F, 0.2828F, 17.7F);
		gun209.addChild(gun209_r1);
		setRotationAngle(gun209_r1, 0.0F, 0.0F, 0.7854F);
		gun209_r1.cubeList.add(new ModelBox(gun209_r1, 37, 97, -0.2F, -0.2F, -2.0F, 1, 1, 17, 0.0F, false));

		gun210 = new ModelRenderer(this);
		gun210.setRotationPoint(-1.7F, -35.8F, -42.5F);
		gun.addChild(gun210);
		

		gun210_r1 = new ModelRenderer(this);
		gun210_r1.setRotationPoint(0.2757F, 0.3071F, 17.7F);
		gun210.addChild(gun210_r1);
		setRotationAngle(gun210_r1, 0.0F, 0.0F, 0.7854F);
		gun210_r1.cubeList.add(new ModelBox(gun210_r1, 98, 0, -0.2F, -0.8F, -2.0F, 1, 1, 17, 0.0F, false));

		gun211 = new ModelRenderer(this);
		gun211.setRotationPoint(-2.5F, -26.5F, -8.0F);
		gun.addChild(gun211);
		setRotationAngle(gun211, 2.3562F, 0.0F, 0.0F);
		gun211.cubeList.add(new ModelBox(gun211, 114, 177, 0.0F, 0.0707F, -0.0808F, 2, 3, 1, 0.0F, false));

		gun214 = new ModelRenderer(this);
		gun214.setRotationPoint(-3.0F, -34.0F, 1.5F);
		gun.addChild(gun214);
		gun214.cubeList.add(new ModelBox(gun214, 151, 161, 0.0F, 0.0F, 0.0F, 3, 1, 5, 0.0F, false));

		gun223 = new ModelRenderer(this);
		gun223.setRotationPoint(1.0F, -32.0F, -9.5F);
		gun.addChild(gun223);
		setRotationAngle(gun223, 0.0F, 0.0F, 2.3562F);
		gun223.cubeList.add(new ModelBox(gun223, 160, 23, 0.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, false));

		gun224 = new ModelRenderer(this);
		gun224.setRotationPoint(1.0F, -33.0F, -9.5F);
		gun.addChild(gun224);
		setRotationAngle(gun224, 0.0F, 0.0F, 2.3562F);
		gun224.cubeList.add(new ModelBox(gun224, 27, 160, 0.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, false));

		gun225 = new ModelRenderer(this);
		gun225.setRotationPoint(1.0F, -33.0F, -9.5F);
		gun.addChild(gun225);
		setRotationAngle(gun225, 0.0F, -2.3562F, 0.0F);
		gun225.cubeList.add(new ModelBox(gun225, 178, 183, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun226 = new ModelRenderer(this);
		gun226.setRotationPoint(1.0F, -33.0F, -2.5F);
		gun.addChild(gun226);
		setRotationAngle(gun226, 0.0F, -2.3562F, 0.0F);
		gun226.cubeList.add(new ModelBox(gun226, 183, 183, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun227 = new ModelRenderer(this);
		gun227.setRotationPoint(-4.0F, -33.0F, -9.5F);
		gun.addChild(gun227);
		setRotationAngle(gun227, 0.0F, 0.7854F, 0.0F);
		gun227.cubeList.add(new ModelBox(gun227, 184, 12, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun228 = new ModelRenderer(this);
		gun228.setRotationPoint(-4.0F, -33.0F, -2.5F);
		gun.addChild(gun228);
		setRotationAngle(gun228, 0.0F, 0.7854F, 0.0F);
		gun228.cubeList.add(new ModelBox(gun228, 184, 15, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun229 = new ModelRenderer(this);
		gun229.setRotationPoint(-4.0F, -32.0F, -9.5F);
		gun.addChild(gun229);
		setRotationAngle(gun229, 0.0F, 0.0F, -0.7854F);
		gun229.cubeList.add(new ModelBox(gun229, 160, 32, 0.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, false));

		gun230 = new ModelRenderer(this);
		gun230.setRotationPoint(-4.0F, -33.0F, -9.5F);
		gun.addChild(gun230);
		setRotationAngle(gun230, 0.0F, 0.0F, -0.7854F);
		gun230.cubeList.add(new ModelBox(gun230, 160, 41, 0.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, false));

		gun231 = new ModelRenderer(this);
		gun231.setRotationPoint(-1.0F, -36.3F, -17.0F);
		gun.addChild(gun231);
		

		gun232 = new ModelRenderer(this);
		gun232.setRotationPoint(1.1125F, -36.4983F, -17.9F);
		gun.addChild(gun232);
		setRotationAngle(gun232, 0.0F, 0.0F, -0.2618F);
		

		gun233 = new ModelRenderer(this);
		gun233.setRotationPoint(-3.3F, -39.0F, 4.5F);
		gun.addChild(gun233);
		gun233.cubeList.add(new ModelBox(gun233, 138, 51, 0.0F, 0.0F, -4.0F, 3, 1, 2, 0.0F, false));

		gun234 = new ModelRenderer(this);
		gun234.setRotationPoint(-0.7F, -39.0F, 4.5F);
		gun.addChild(gun234);
		gun234.cubeList.add(new ModelBox(gun234, 43, 180, 0.0F, 0.0F, -4.0F, 1, 1, 2, 0.0F, false));

		gun235 = new ModelRenderer(this);
		gun235.setRotationPoint(0.3F, -39.0F, 1.5F);
		gun.addChild(gun235);
		setRotationAngle(gun235, 0.0F, 0.0F, 1.0085F);
		gun235.cubeList.add(new ModelBox(gun235, 79, 180, 0.0F, 0.0F, -1.0F, 1, 1, 2, 0.0F, false));

		gun236 = new ModelRenderer(this);
		gun236.setRotationPoint(0.3F, -39.0F, 1.5F);
		gun.addChild(gun236);
		setRotationAngle(gun236, 0.0F, 0.0F, 1.0085F);
		gun236.cubeList.add(new ModelBox(gun236, 180, 85, 0.2F, 0.0F, -1.0F, 1, 1, 2, 0.0F, false));

		gun237 = new ModelRenderer(this);
		gun237.setRotationPoint(-3.3F, -39.0F, 1.5F);
		gun.addChild(gun237);
		setRotationAngle(gun237, 0.0F, 0.0F, 0.5623F);
		gun237.cubeList.add(new ModelBox(gun237, 86, 180, 0.0F, 0.0F, -1.0F, 1, 1, 2, 0.0F, false));

		gun238 = new ModelRenderer(this);
		gun238.setRotationPoint(-3.3F, -39.0F, 1.5F);
		gun.addChild(gun238);
		setRotationAngle(gun238, 0.0F, 0.0F, 0.5623F);
		gun238.cubeList.add(new ModelBox(gun238, 93, 180, 0.0F, 0.2F, -1.0F, 1, 1, 2, 0.0F, false));

		Irons = new ModelRenderer(this);
		Irons.setRotationPoint(-0.5F, 3.3101F, 10.7899F);
		gun.addChild(Irons);
		Irons.cubeList.add(new ModelBox(Irons, 53, 176, 0.0F, -45.0101F, -31.5899F, 1, 3, 2, -0.3F, false));
		Irons.cubeList.add(new ModelBox(Irons, 107, 176, -3.0F, -45.0101F, -31.5899F, 1, 3, 2, -0.3F, false));
		Irons.cubeList.add(new ModelBox(Irons, 145, 179, -3.0F, -44.3029F, -30.3172F, 1, 2, 2, -0.3F, false));
		Irons.cubeList.add(new ModelBox(Irons, 72, 179, 0.0F, -44.3029F, -30.3172F, 1, 2, 2, -0.3F, false));
		Irons.cubeList.add(new ModelBox(Irons, 178, 52, -3.0F, -45.2929F, -31.3071F, 1, 2, 2, -0.3F, false));
		Irons.cubeList.add(new ModelBox(Irons, 65, 178, 0.0F, -45.2929F, -31.3071F, 1, 2, 2, -0.3F, false));
		Irons.cubeList.add(new ModelBox(Irons, 17, 169, 0.0F, -44.4101F, -8.5899F, 1, 2, 4, -0.3F, false));
		Irons.cubeList.add(new ModelBox(Irons, 28, 169, -3.0F, -44.4101F, -8.5899F, 1, 2, 4, -0.3F, false));
		Irons.cubeList.add(new ModelBox(Irons, 178, 129, 0.0F, -45.4F, -7.5799F, 1, 2, 2, -0.3F, false));
		Irons.cubeList.add(new ModelBox(Irons, 178, 144, -3.0F, -45.4F, -7.5799F, 1, 2, 2, -0.3F, false));
		Irons.cubeList.add(new ModelBox(Irons, 148, 14, -2.4F, -44.0F, -7.5F, 3, 2, 2, 0.0F, false));
		Irons.cubeList.add(new ModelBox(Irons, 0, 181, -2.7F, -44.5F, -7.5F, 1, 1, 2, -0.2F, false));
		Irons.cubeList.add(new ModelBox(Irons, 7, 181, -0.2F, -44.5F, -7.5F, 1, 1, 2, -0.2F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.0F, -44.1101F, -7.2799F);
		Irons.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.7854F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 177, 27, -2.0F, -1.0F, -1.0F, 1, 2, 2, -0.3F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 177, 22, 1.0F, -1.0F, -1.0F, 1, 2, 2, -0.3F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.0F, -43.5891F, -5.2353F);
		Irons.addChild(cube_r2);
		setRotationAngle(cube_r2, -1.3963F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 177, 32, 1.0F, -1.0F, -1.0F, 1, 2, 2, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 177, 37, -2.0F, -1.0F, -1.0F, 1, 2, 2, -0.3F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1.0F, -44.1438F, -5.6237F);
		Irons.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.5236F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 177, 17, -2.0F, -1.0F, -1.0F, 1, 2, 2, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 177, 12, 1.0F, -1.0F, -1.0F, 1, 2, 2, -0.3F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.0F, -41.1745F, -32.4355F);
		Irons.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.7854F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 178, 47, 1.0F, -5.0F, -1.0F, 1, 2, 2, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 177, 174, -2.0F, -5.0F, -1.0F, 1, 2, 2, -0.3F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.0F, -44.0029F, -31.0071F);
		Irons.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.7854F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 184, 21, -2.0F, -1.0F, -1.0F, 1, 1, 1, -0.3F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 184, 18, 1.0F, -1.0F, -1.0F, 1, 1, 1, -0.3F, false));

		ironsights = new ModelRenderer(this);
		ironsights.setRotationPoint(0.5F, -42.6101F, -25.5899F);
		Irons.addChild(ironsights);
		ironsights.cubeList.add(new ModelBox(ironsights, 96, 171, -3.5F, -2.01F, 18.62F, 4, 2, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 184, 24, -1.7922F, -2.26F, 18.62F, 1, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 184, 27, -2.2F, -2.26F, 18.62F, 1, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 184, 30, -2.2F, -2.46F, 18.62F, 1, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 184, 36, -1.7922F, -2.46F, 18.62F, 1, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 182, 79, -2.3664F, -2.0186F, 18.62F, 1, 1, 1, -0.3F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 182, 82, -1.9914F, -2.0186F, 18.62F, 1, 1, 1, -0.3F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 182, 76, -2.3664F, -2.4186F, 18.62F, 1, 1, 1, -0.3F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 39, 184, -1.6257F, -2.4186F, 18.62F, 1, 1, 1, -0.3F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 95, 184, -1.6257F, -2.4186F, 18.77F, 1, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 182, 92, -2.3664F, -2.4186F, 18.77F, 1, 1, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 184, 39, -1.6257F, -2.0186F, 18.62F, 1, 1, 1, -0.3F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 181, 152, -2.0F, -2.2F, -5.2F, 1, 2, 1, -0.4F, false));
		ironsights.cubeList.add(new ModelBox(ironsights, 50, 182, -2.0F, -1.2F, -5.2F, 1, 2, 1, 0.0F, false));

		ironsights_r1 = new ModelRenderer(this);
		ironsights_r1.setRotationPoint(-2.0407F, -0.9529F, 19.12F);
		ironsights.addChild(ironsights_r1);
		setRotationAngle(ironsights_r1, 0.0F, 0.0F, 0.7854F);
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 34, 184, -0.5F, -1.5F, -0.5F, 1, 1, 1, -0.4F, false));

		ironsights_r2 = new ModelRenderer(this);
		ironsights_r2.setRotationPoint(-1.6586F, -1.66F, 19.12F);
		ironsights.addChild(ironsights_r2);
		setRotationAngle(ironsights_r2, 0.0F, 0.0F, 0.7854F);
		ironsights_r2.cubeList.add(new ModelBox(ironsights_r2, 184, 33, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.4F, false));

		gun4 = new ModelRenderer(this);
		gun4.setRotationPoint(-3.0F, -31.5F, -6.5F);
		gun.addChild(gun4);
		gun4.cubeList.add(new ModelBox(gun4, 106, 147, 0.0F, 0.0F, 0.0F, 3, 10, 5, 0.0F, false));

		gun239 = new ModelRenderer(this);
		gun239.setRotationPoint(-3.5F, -20.5F, -6.0F);
		gun.addChild(gun239);
		setRotationAngle(gun239, 2.6025F, 0.0F, 0.0F);
		gun239.cubeList.add(new ModelBox(gun239, 127, 176, 0.5F, 0.0F, 0.0F, 3, 2, 1, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		gun.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 180, 107, -1.2F, -31.5F, -5.0F, 2, 2, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(1.9979F, -30.5F, -1.8462F);
		bone.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.6109F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 19, 181, -0.5F, -1.0F, -4.5F, 1, 2, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-0.2964F, -30.5F, -3.8772F);
		bone.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, -0.6109F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 182, 61, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, -22.0F, -3.5F);
		bone.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.1745F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 48, 150, -0.4F, -1.3F, -1.5F, 1, 3, 3, 0.0F, false));
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