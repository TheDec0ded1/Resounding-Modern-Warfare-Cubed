package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.10.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M84Barrel extends ModelBase {
	private final ModelRenderer barrelM84;
	private final ModelRenderer gun28_r2;
	private final ModelRenderer gun25_r4;
	private final ModelRenderer gun21_r2;
	private final ModelRenderer gun22_r3;
	private final ModelRenderer gun23_r3;
	private final ModelRenderer gun22_r4;
	private final ModelRenderer gun27_r2;
	private final ModelRenderer gun25_r5;
	private final ModelRenderer gun24_r3;
	private final ModelRenderer gun24_r4;
	private final ModelRenderer gun23_r4;
	private final ModelRenderer gun72;
	private final ModelRenderer gun73;
	private final ModelRenderer gun79;
	private final ModelRenderer gun78;
	private final ModelRenderer gun77;
	private final ModelRenderer gun76;
	private final ModelRenderer gun75;
	private final ModelRenderer gun74;
	private final ModelRenderer gun163_r1;
	private final ModelRenderer gun86;
	private final ModelRenderer gun85;
	private final ModelRenderer gun84;
	private final ModelRenderer gun83;
	private final ModelRenderer gun82;
	private final ModelRenderer gun81;
	private final ModelRenderer gun92;
	private final ModelRenderer gun91;
	private final ModelRenderer gun90;
	private final ModelRenderer gun89;
	private final ModelRenderer gun88;
	private final ModelRenderer gun87;
	private final ModelRenderer gun98;
	private final ModelRenderer gun172_r1;
	private final ModelRenderer gun97;
	private final ModelRenderer gun169_r1;
	private final ModelRenderer gun96;
	private final ModelRenderer gun167_r1;
	private final ModelRenderer gun95;
	private final ModelRenderer gun166_r2;
	private final ModelRenderer gun94;
	private final ModelRenderer gun166_r1;
	private final ModelRenderer gun165_r2;
	private final ModelRenderer gun93;
	private final ModelRenderer gun165_r1;
	private final ModelRenderer gun164_r1;
	private final ModelRenderer frontIron2;
	private final ModelRenderer ironsights_r1;
	private final ModelRenderer ironsights_r2;
	private final ModelRenderer ironsights_r3;
	private final ModelRenderer ironsights_r4;
	private final ModelRenderer ironsights_r5;
	private final ModelRenderer ironsights_r6;
	private final ModelRenderer ironsights_r7;
	private final ModelRenderer ironsights_r8;
	private final ModelRenderer ironsights_r9;
	private final ModelRenderer ironsights_r10;
	private final ModelRenderer ironsights_r11;
	private final ModelRenderer ironsights_r12;
	private final ModelRenderer ironsights_r13;
	private final ModelRenderer ironsights_r14;
	private final ModelRenderer bone22;
	private final ModelRenderer gun99;
	private final ModelRenderer gun100;
	private final ModelRenderer gun101;
	private final ModelRenderer gun102;
	private final ModelRenderer gun103;
	private final ModelRenderer gun104;
	private final ModelRenderer barrelHandle2;
	private final ModelRenderer gun168_r1;
	private final ModelRenderer gun105;
	private final ModelRenderer gun171_r1;
	private final ModelRenderer gun170_r1;
	private final ModelRenderer gun171_r2;
	private final ModelRenderer gun172_r2;
	private final ModelRenderer gun168_r2;
	private final ModelRenderer gun167_r2;
	private final ModelRenderer gun167_r3;
	private final ModelRenderer gun166_r3;
	private final ModelRenderer gun167_r4;
	private final ModelRenderer gun108;
	private final ModelRenderer gun109;
	private final ModelRenderer gun114;
	private final ModelRenderer gun115;
	private final ModelRenderer gun116;
	private final ModelRenderer bone23;
	private final ModelRenderer gun172_r3;
	private final ModelRenderer gun171_r3;
	private final ModelRenderer gun171_r4;
	private final ModelRenderer gun170_r2;

	public M84Barrel() {
		textureWidth = 512;
		textureHeight = 512;

		barrelM84 = new ModelRenderer(this);
		barrelM84.setRotationPoint(-2.0F, -13.5F, -55.7F);
		barrelM84.cubeList.add(new ModelBox(barrelM84, 72, 72, 0.6F, 1.1F, -49.0F, 1, 1, 70, -0.001F, false));
		barrelM84.cubeList.add(new ModelBox(barrelM84, 72, 1, 0.0F, 0.5F, -49.0F, 1, 1, 70, 0.001F, false));

		gun28_r2 = new ModelRenderer(this);
		gun28_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrelM84.addChild(gun28_r2);
		setRotationAngle(gun28_r2, 0.0133F, 0.0138F, -0.8203F);
		gun28_r2.cubeList.add(new ModelBox(gun28_r2, 98, 214, -1.2656F, 0.2409F, -0.9096F, 1, 1, 21, -0.1F, false));

		gun25_r4 = new ModelRenderer(this);
		gun25_r4.setRotationPoint(-0.6F, 0.6F, 0.0F);
		barrelM84.addChild(gun25_r4);
		setRotationAngle(gun25_r4, -0.0055F, -0.0163F, 0.8814F);
		gun25_r4.cubeList.add(new ModelBox(gun25_r4, 26, 213, 0.2858F, -0.5819F, -0.9045F, 1, 1, 21, -0.1F, false));

		gun21_r2 = new ModelRenderer(this);
		gun21_r2.setRotationPoint(1.6F, 0.6F, -54.0F);
		barrelM84.addChild(gun21_r2);
		setRotationAngle(gun21_r2, 0.0F, 0.0F, -0.7854F);
		gun21_r2.cubeList.add(new ModelBox(gun21_r2, 144, 71, -1.2736F, -0.5664F, 4.919F, 1, 1, 70, -0.08F, false));

		gun22_r3 = new ModelRenderer(this);
		gun22_r3.setRotationPoint(-0.6F, 0.6F, -54.0F);
		barrelM84.addChild(gun22_r3);
		setRotationAngle(gun22_r3, 0.0F, 0.0F, 0.7854F);
		gun22_r3.cubeList.add(new ModelBox(gun22_r3, 144, 0, 0.2736F, -0.5664F, 4.92F, 1, 1, 70, -0.081F, false));

		gun23_r3 = new ModelRenderer(this);
		gun23_r3.setRotationPoint(-0.6F, 1.6F, -54.0F);
		barrelM84.addChild(gun23_r3);
		setRotationAngle(gun23_r3, 0.0F, 0.0F, -0.7854F);
		gun23_r3.cubeList.add(new ModelBox(gun23_r3, 72, 143, -0.4336F, 0.2736F, 4.92F, 1, 1, 70, -0.081F, false));

		gun22_r4 = new ModelRenderer(this);
		gun22_r4.setRotationPoint(1.6F, 1.6F, -54.0F);
		barrelM84.addChild(gun22_r4);
		setRotationAngle(gun22_r4, 0.0F, 0.0F, 0.7854F);
		gun22_r4.cubeList.add(new ModelBox(gun22_r4, 0, 142, -0.5664F, 0.2736F, 4.92F, 1, 1, 70, -0.08F, false));

		gun27_r2 = new ModelRenderer(this);
		gun27_r2.setRotationPoint(1.0F, 0.0F, 0.0F);
		barrelM84.addChild(gun27_r2);
		setRotationAngle(gun27_r2, 0.0133F, -0.0138F, 0.8203F);
		gun27_r2.cubeList.add(new ModelBox(gun27_r2, 170, 168, 0.2656F, 0.2409F, -0.9096F, 1, 1, 21, -0.1F, false));

		gun25_r5 = new ModelRenderer(this);
		gun25_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrelM84.addChild(gun25_r5);
		setRotationAngle(gun25_r5, 0.0192F, 0.0F, 0.0F);
		gun25_r5.cubeList.add(new ModelBox(gun25_r5, 216, 191, 0.0F, 0.4999F, -0.0096F, 1, 1, 20, -0.001F, false));

		gun24_r3 = new ModelRenderer(this);
		gun24_r3.setRotationPoint(-0.6F, 1.6F, 0.0F);
		barrelM84.addChild(gun24_r3);
		setRotationAngle(gun24_r3, 0.0087F, -0.0148F, 0.0F);
		gun24_r3.cubeList.add(new ModelBox(gun24_r3, 171, 26, 0.0F, -0.5F, -0.0043F, 1, 1, 20, -0.001F, false));

		gun24_r4 = new ModelRenderer(this);
		gun24_r4.setRotationPoint(1.6F, 0.6F, 0.0F);
		barrelM84.addChild(gun24_r4);
		setRotationAngle(gun24_r4, -0.0055F, 0.0163F, -0.8814F);
		gun24_r4.cubeList.add(new ModelBox(gun24_r4, 170, 143, -1.2858F, -0.5819F, -0.9045F, 1, 1, 21, -0.1F, false));

		gun23_r4 = new ModelRenderer(this);
		gun23_r4.setRotationPoint(1.6F, 1.6F, 0.0F);
		barrelM84.addChild(gun23_r4);
		setRotationAngle(gun23_r4, 0.0087F, 0.0148F, 0.0F);
		gun23_r4.cubeList.add(new ModelBox(gun23_r4, 171, 0, -1.0F, -0.5F, -0.0043F, 1, 1, 20, -0.001F, false));

		gun72 = new ModelRenderer(this);
		gun72.setRotationPoint(-0.5F, 0.6F, -54.0F);
		barrelM84.addChild(gun72);
		gun72.cubeList.add(new ModelBox(gun72, 0, 71, -0.1F, 0.5F, 5.0F, 1, 1, 70, 0.0F, false));

		gun73 = new ModelRenderer(this);
		gun73.setRotationPoint(0.0F, 1.2F, -54.0F);
		barrelM84.addChild(gun73);
		gun73.cubeList.add(new ModelBox(gun73, 0, 0, 0.0F, 0.5F, 5.0F, 1, 1, 70, 0.001F, false));

		gun79 = new ModelRenderer(this);
		gun79.setRotationPoint(1.0F, 0.4F, -35.5F);
		barrelM84.addChild(gun79);
		setRotationAngle(gun79, 0.0F, 0.0F, -2.3562F);
		gun79.cubeList.add(new ModelBox(gun79, 86, 84, -4.0052F, -4.0052F, 11.4F, 1, 1, 6, 0.0F, false));

		gun78 = new ModelRenderer(this);
		gun78.setRotationPoint(1.0F, -2.6F, -35.5F);
		barrelM84.addChild(gun78);
		setRotationAngle(gun78, 0.0F, 0.0F, 0.7854F);
		gun78.cubeList.add(new ModelBox(gun78, 31, 133, 4.4194F, 4.4194F, 11.4F, 1, 1, 6, 0.0F, false));

		gun77 = new ModelRenderer(this);
		gun77.setRotationPoint(-1.0F, -0.6F, -35.5F);
		barrelM84.addChild(gun77);
		setRotationAngle(gun77, 0.0F, 0.0F, -0.7854F);
		gun77.cubeList.add(new ModelBox(gun77, 173, 79, -4.0052F, 4.4194F, 11.4F, 1, 1, 6, 0.0F, false));

		gun76 = new ModelRenderer(this);
		gun76.setRotationPoint(-1.0F, -1.6F, -35.5F);
		barrelM84.addChild(gun76);
		setRotationAngle(gun76, 0.0F, 0.0F, -0.7854F);
		gun76.cubeList.add(new ModelBox(gun76, 173, 96, -4.0052F, 4.4194F, 11.4F, 1, 1, 6, 0.0F, false));

		gun75 = new ModelRenderer(this);
		gun75.setRotationPoint(-1.0F, -1.6F, -35.5F);
		barrelM84.addChild(gun75);
		gun75.cubeList.add(new ModelBox(gun75, 121, 173, 0.2929F, 5.9571F, 11.4F, 1, 1, 6, 0.0F, false));
		gun75.cubeList.add(new ModelBox(gun75, 173, 103, 1.7071F, 5.9571F, 11.4F, 1, 1, 6, 0.0F, false));

		gun74 = new ModelRenderer(this);
		gun74.setRotationPoint(0.0F, -2.6F, -35.5F);
		barrelM84.addChild(gun74);
		gun74.cubeList.add(new ModelBox(gun74, 0, 177, 0.0F, 6.25F, 11.4F, 1, 1, 6, 0.0F, false));
		gun74.cubeList.add(new ModelBox(gun74, 49, 176, 0.0F, 7.6642F, 11.4F, 1, 1, 6, 0.0F, false));

		gun163_r1 = new ModelRenderer(this);
		gun163_r1.setRotationPoint(0.5F, 5.8161F, 10.333F);
		gun74.addChild(gun163_r1);
		setRotationAngle(gun163_r1, -1.0472F, 0.0F, 0.0F);
		gun163_r1.cubeList.add(new ModelBox(gun163_r1, 72, 44, -0.5F, -2.5F, -1.0F, 1, 3, 4, 0.0F, false));

		gun86 = new ModelRenderer(this);
		gun86.setRotationPoint(1.0F, -2.9F, -41.4F);
		barrelM84.addChild(gun86);
		setRotationAngle(gun86, 0.0F, 0.0F, -2.3562F);
		gun86.cubeList.add(new ModelBox(gun86, 72, 107, -4.0406F, -4.0406F, 15.4F, 1, 1, 3, 0.0F, false));

		gun85 = new ModelRenderer(this);
		gun85.setRotationPoint(1.0F, -5.9F, -41.4F);
		barrelM84.addChild(gun85);
		setRotationAngle(gun85, 0.0F, 0.0F, 0.7854F);
		gun85.cubeList.add(new ModelBox(gun85, 117, 120, 4.4548F, 4.4548F, 15.4F, 1, 1, 3, 0.0F, false));

		gun84 = new ModelRenderer(this);
		gun84.setRotationPoint(-1.0F, -3.9F, -41.4F);
		barrelM84.addChild(gun84);
		setRotationAngle(gun84, 0.0F, 0.0F, -0.7854F);
		gun84.cubeList.add(new ModelBox(gun84, 144, 0, -4.0406F, 4.4548F, 15.4F, 1, 1, 3, 0.0F, false));

		gun83 = new ModelRenderer(this);
		gun83.setRotationPoint(-1.0F, -4.9F, -41.4F);
		barrelM84.addChild(gun83);
		setRotationAngle(gun83, 0.0F, 0.0F, -0.7854F);
		gun83.cubeList.add(new ModelBox(gun83, 144, 4, -4.0406F, 4.4548F, 15.4F, 1, 1, 3, 0.0F, false));

		gun82 = new ModelRenderer(this);
		gun82.setRotationPoint(-1.0F, -4.9F, -41.4F);
		barrelM84.addChild(gun82);
		gun82.cubeList.add(new ModelBox(gun82, 144, 14, 0.2929F, 6.0071F, 15.4F, 1, 1, 3, 0.0F, false));
		gun82.cubeList.add(new ModelBox(gun82, 144, 10, 1.7071F, 6.0071F, 15.4F, 1, 1, 3, 0.0F, false));

		gun81 = new ModelRenderer(this);
		gun81.setRotationPoint(0.0F, -5.9F, -41.4F);
		barrelM84.addChild(gun81);
		gun81.cubeList.add(new ModelBox(gun81, 144, 100, 0.0F, 6.3F, 15.4F, 1, 1, 3, 0.0F, false));
		gun81.cubeList.add(new ModelBox(gun81, 144, 96, 0.0F, 7.7142F, 15.4F, 1, 1, 3, 0.0F, false));

		gun92 = new ModelRenderer(this);
		gun92.setRotationPoint(1.0F, -2.9F, -66.4F);
		barrelM84.addChild(gun92);
		setRotationAngle(gun92, 0.0F, 0.0F, -2.3562F);
		gun92.cubeList.add(new ModelBox(gun92, 60, 67, -4.0406F, -4.0406F, 16.4F, 1, 1, 2, 0.0F, false));

		gun91 = new ModelRenderer(this);
		gun91.setRotationPoint(1.0F, -5.9F, -66.4F);
		barrelM84.addChild(gun91);
		setRotationAngle(gun91, 0.0F, 0.0F, 0.7854F);
		gun91.cubeList.add(new ModelBox(gun91, 105, 116, 4.4548F, 4.4548F, 16.4F, 1, 1, 2, 0.0F, false));

		gun90 = new ModelRenderer(this);
		gun90.setRotationPoint(-1.0F, -3.9F, -66.4F);
		barrelM84.addChild(gun90);
		setRotationAngle(gun90, 0.0F, 0.0F, -0.7854F);
		gun90.cubeList.add(new ModelBox(gun90, 144, 52, -4.0406F, 4.4548F, 16.4F, 1, 1, 2, 0.0F, false));

		gun89 = new ModelRenderer(this);
		gun89.setRotationPoint(-1.0F, -4.9F, -66.4F);
		barrelM84.addChild(gun89);
		setRotationAngle(gun89, 0.0F, 0.0F, -0.7854F);
		gun89.cubeList.add(new ModelBox(gun89, 144, 55, -4.0406F, 4.4548F, 16.4F, 1, 1, 2, 0.0F, false));

		gun88 = new ModelRenderer(this);
		gun88.setRotationPoint(-1.0F, -4.9F, -66.4F);
		barrelM84.addChild(gun88);
		gun88.cubeList.add(new ModelBox(gun88, 13, 136, 0.2929F, 6.0071F, 16.4F, 1, 1, 2, 0.0F, false));
		gun88.cubeList.add(new ModelBox(gun88, 135, 114, 1.7071F, 6.0071F, 16.4F, 1, 1, 2, 0.0F, false));
		gun88.cubeList.add(new ModelBox(gun88, 148, 82, 0.2929F, 6.0071F, 8.4F, 1, 1, 8, 0.0F, false));
		gun88.cubeList.add(new ModelBox(gun88, 121, 153, 1.7071F, 6.0071F, 8.4F, 1, 1, 8, 0.0F, false));

		gun87 = new ModelRenderer(this);
		gun87.setRotationPoint(0.0F, -5.9F, -66.4F);
		barrelM84.addChild(gun87);
		gun87.cubeList.add(new ModelBox(gun87, 136, 10, 0.0F, 6.3F, 16.4F, 1, 1, 2, 0.0F, false));
		gun87.cubeList.add(new ModelBox(gun87, 0, 136, 0.0F, 7.7142F, 16.4F, 1, 1, 2, 0.0F, false));
		gun87.cubeList.add(new ModelBox(gun87, 27, 153, 0.0F, 6.3F, 8.4F, 1, 1, 8, 0.0F, false));
		gun87.cubeList.add(new ModelBox(gun87, 99, 153, 0.0F, 7.7142F, 8.4F, 1, 1, 8, 0.0F, false));

		gun98 = new ModelRenderer(this);
		gun98.setRotationPoint(-1.0F, -2.9F, -44.4F);
		barrelM84.addChild(gun98);
		setRotationAngle(gun98, 3.1416F, 0.0F, -0.7854F);
		

		gun172_r1 = new ModelRenderer(this);
		gun172_r1.setRotationPoint(-2.0002F, -4.2477F, 14.9891F);
		gun98.addChild(gun172_r1);
		setRotationAngle(gun172_r1, 0.0F, 0.0873F, 0.0F);
		gun172_r1.cubeList.add(new ModelBox(gun172_r1, 52, 107, -1.2071F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));

		gun97 = new ModelRenderer(this);
		gun97.setRotationPoint(-1.0F, -5.9F, -44.4F);
		barrelM84.addChild(gun97);
		setRotationAngle(gun97, -3.1416F, 0.0F, 2.3562F);
		

		gun169_r1 = new ModelRenderer(this);
		gun169_r1.setRotationPoint(4.2477F, 6.4951F, 14.9891F);
		gun97.addChild(gun169_r1);
		setRotationAngle(gun169_r1, -0.0873F, 0.0F, 0.0F);
		gun169_r1.cubeList.add(new ModelBox(gun169_r1, 118, 50, -0.5F, -1.2071F, -1.5F, 1, 1, 3, 0.0F, false));

		gun96 = new ModelRenderer(this);
		gun96.setRotationPoint(1.0F, -3.9F, -44.4F);
		barrelM84.addChild(gun96);
		setRotationAngle(gun96, 3.1416F, 0.0F, -2.3562F);
		

		gun167_r1 = new ModelRenderer(this);
		gun167_r1.setRotationPoint(-3.4144F, 4.2477F, 14.9891F);
		gun96.addChild(gun167_r1);
		setRotationAngle(gun167_r1, 0.0F, 0.0873F, 0.0F);
		gun167_r1.cubeList.add(new ModelBox(gun167_r1, 27, 142, -1.2071F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));

		gun95 = new ModelRenderer(this);
		gun95.setRotationPoint(1.0F, -4.9F, -44.4F);
		barrelM84.addChild(gun95);
		setRotationAngle(gun95, 3.1416F, 0.0F, -2.3562F);
		

		gun166_r2 = new ModelRenderer(this);
		gun166_r2.setRotationPoint(-4.2477F, 5.0809F, 14.9891F);
		gun95.addChild(gun166_r2);
		setRotationAngle(gun166_r2, -0.0873F, 0.0F, 0.0F);
		gun166_r2.cubeList.add(new ModelBox(gun166_r2, 38, 142, -0.5F, -1.2071F, -1.5F, 1, 1, 3, 0.0F, false));

		gun94 = new ModelRenderer(this);
		gun94.setRotationPoint(1.0F, -4.9F, -44.4F);
		barrelM84.addChild(gun94);
		setRotationAngle(gun94, 3.1416F, 0.0F, -3.1416F);
		

		gun166_r1 = new ModelRenderer(this);
		gun166_r1.setRotationPoint(0.3739F, 6.5071F, 16.9891F);
		gun94.addChild(gun166_r1);
		setRotationAngle(gun166_r1, 0.0F, -0.0873F, 0.0F);
		gun166_r1.cubeList.add(new ModelBox(gun166_r1, 134, 134, 0.0328F, -0.5F, -3.4924F, 1, 1, 3, 0.0F, false));

		gun165_r2 = new ModelRenderer(this);
		gun165_r2.setRotationPoint(0.6261F, 6.5071F, 16.9891F);
		gun94.addChild(gun165_r2);
		setRotationAngle(gun165_r2, 0.0F, 0.0873F, 0.0F);
		gun165_r2.cubeList.add(new ModelBox(gun165_r2, 0, 142, -1.0328F, -0.5F, -3.4924F, 1, 1, 3, 0.0F, false));

		gun93 = new ModelRenderer(this);
		gun93.setRotationPoint(0.0F, -5.9F, -44.4F);
		barrelM84.addChild(gun93);
		setRotationAngle(gun93, 3.1416F, 0.0F, -3.1416F);
		

		gun165_r1 = new ModelRenderer(this);
		gun165_r1.setRotationPoint(-0.5F, 7.381F, 16.9891F);
		gun93.addChild(gun165_r1);
		setRotationAngle(gun165_r1, 0.0873F, 0.0F, 0.0F);
		gun165_r1.cubeList.add(new ModelBox(gun165_r1, 72, 136, -0.5F, 0.0328F, -3.4924F, 1, 1, 3, 0.0F, false));

		gun164_r1 = new ModelRenderer(this);
		gun164_r1.setRotationPoint(-0.5F, 7.6332F, 16.9891F);
		gun93.addChild(gun164_r1);
		setRotationAngle(gun164_r1, -0.0873F, 0.0F, 0.0F);
		gun164_r1.cubeList.add(new ModelBox(gun164_r1, 155, 130, -0.5F, -1.0328F, -3.4924F, 1, 1, 3, 0.0F, false));

		frontIron2 = new ModelRenderer(this);
		frontIron2.setRotationPoint(2.0F, 33.5F, 89.7F);
		barrelM84.addChild(frontIron2);
		frontIron2.cubeList.add(new ModelBox(frontIron2, 65, 32, -2.0F, -40.2F, -136.4F, 1, 2, 1, -0.4F, false));

		ironsights_r1 = new ModelRenderer(this);
		ironsights_r1.setRotationPoint(-1.5F, -40.2623F, -135.6153F);
		frontIron2.addChild(ironsights_r1);
		setRotationAngle(ironsights_r1, 0.0F, -1.5708F, 0.0F);
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 86, 84, -1.4F, 1.0F, -1.0F, 1, 2, 2, -0.2F, false));

		ironsights_r2 = new ModelRenderer(this);
		ironsights_r2.setRotationPoint(-1.5F, -40.2623F, -134.8153F);
		frontIron2.addChild(ironsights_r2);
		setRotationAngle(ironsights_r2, 0.0F, -1.5708F, 0.0F);
		ironsights_r2.cubeList.add(new ModelBox(ironsights_r2, 21, 136, -0.4F, 3.0F, -1.0F, 1, 1, 2, -0.2F, false));

		ironsights_r3 = new ModelRenderer(this);
		ironsights_r3.setRotationPoint(-2.2757F, -40.115F, -135.3153F);
		frontIron2.addChild(ironsights_r3);
		setRotationAngle(ironsights_r3, 0.0F, -1.5708F, -0.48F);
		ironsights_r3.cubeList.add(new ModelBox(ironsights_r3, 31, 136, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r4 = new ModelRenderer(this);
		ironsights_r4.setRotationPoint(-1.814F, -40.6254F, -135.3153F);
		frontIron2.addChild(ironsights_r4);
		setRotationAngle(ironsights_r4, 0.0F, -1.5708F, 0.48F);
		ironsights_r4.cubeList.add(new ModelBox(ironsights_r4, 39, 136, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r5 = new ModelRenderer(this);
		ironsights_r5.setRotationPoint(-0.299F, -41.0871F, -135.3153F);
		frontIron2.addChild(ironsights_r5);
		setRotationAngle(ironsights_r5, 0.0F, -1.5708F, -0.48F);
		ironsights_r5.cubeList.add(new ModelBox(ironsights_r5, 49, 136, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r6 = new ModelRenderer(this);
		ironsights_r6.setRotationPoint(0.1627F, -39.6533F, -135.3153F);
		frontIron2.addChild(ironsights_r6);
		setRotationAngle(ironsights_r6, 0.0F, -1.5708F, 0.48F);
		ironsights_r6.cubeList.add(new ModelBox(ironsights_r6, 136, 80, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r7 = new ModelRenderer(this);
		ironsights_r7.setRotationPoint(-0.299F, -41.0871F, -136.2153F);
		frontIron2.addChild(ironsights_r7);
		setRotationAngle(ironsights_r7, 0.0F, -1.5708F, -0.48F);
		ironsights_r7.cubeList.add(new ModelBox(ironsights_r7, 136, 83, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r8 = new ModelRenderer(this);
		ironsights_r8.setRotationPoint(-1.814F, -40.6254F, -136.2153F);
		frontIron2.addChild(ironsights_r8);
		setRotationAngle(ironsights_r8, 0.0F, -1.5708F, 0.48F);
		ironsights_r8.cubeList.add(new ModelBox(ironsights_r8, 108, 136, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r9 = new ModelRenderer(this);
		ironsights_r9.setRotationPoint(0.1627F, -39.6533F, -136.2153F);
		frontIron2.addChild(ironsights_r9);
		setRotationAngle(ironsights_r9, 0.0F, -1.5708F, 0.48F);
		ironsights_r9.cubeList.add(new ModelBox(ironsights_r9, 123, 136, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r10 = new ModelRenderer(this);
		ironsights_r10.setRotationPoint(-2.2757F, -40.115F, -136.2153F);
		frontIron2.addChild(ironsights_r10);
		setRotationAngle(ironsights_r10, 0.0F, -1.5708F, -0.48F);
		ironsights_r10.cubeList.add(new ModelBox(ironsights_r10, 72, 143, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r11 = new ModelRenderer(this);
		ironsights_r11.setRotationPoint(-1.5F, -40.2623F, -135.1153F);
		frontIron2.addChild(ironsights_r11);
		setRotationAngle(ironsights_r11, 0.0F, -1.5708F, 0.0F);
		ironsights_r11.cubeList.add(new ModelBox(ironsights_r11, 95, 32, -1.4F, 1.0F, -1.0F, 2, 3, 2, -0.2F, false));

		ironsights_r12 = new ModelRenderer(this);
		ironsights_r12.setRotationPoint(-1.5F, -34.4F, -135.6F);
		frontIron2.addChild(ironsights_r12);
		setRotationAngle(ironsights_r12, 0.0F, -1.5708F, 0.0F);
		ironsights_r12.cubeList.add(new ModelBox(ironsights_r12, 62, 71, -1.4F, -4.0F, -1.0F, 1, 6, 2, -0.2F, false));

		ironsights_r13 = new ModelRenderer(this);
		ironsights_r13.setRotationPoint(-1.5F, -34.4F, -135.2F);
		frontIron2.addChild(ironsights_r13);
		setRotationAngle(ironsights_r13, 0.0F, -1.5708F, 0.0F);
		ironsights_r13.cubeList.add(new ModelBox(ironsights_r13, 105, 46, -1.4F, 1.0F, -1.0F, 4, 1, 2, -0.2F, false));

		ironsights_r14 = new ModelRenderer(this);
		ironsights_r14.setRotationPoint(-1.5F, -34.481F, -134.5433F);
		frontIron2.addChild(ironsights_r14);
		setRotationAngle(ironsights_r14, 1.5708F, -1.2217F, -1.5708F);
		ironsights_r14.cubeList.add(new ModelBox(ironsights_r14, 12, 85, 0.4F, -4.0F, -1.0F, 1, 6, 2, -0.2F, false));

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(-2.0F, -39.4F, -151.2F);
		frontIron2.addChild(bone22);
		

		gun99 = new ModelRenderer(this);
		gun99.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone22.addChild(gun99);
		gun99.cubeList.add(new ModelBox(gun99, 86, 174, 0.0F, 6.3F, 14.4F, 1, 1, 4, 0.0F, false));
		gun99.cubeList.add(new ModelBox(gun99, 108, 169, 0.0F, 7.7142F, 14.4F, 1, 1, 4, 0.0F, false));

		gun100 = new ModelRenderer(this);
		gun100.setRotationPoint(-1.0F, 1.0F, 0.0F);
		bone22.addChild(gun100);
		gun100.cubeList.add(new ModelBox(gun100, 36, 168, 0.2929F, 6.0071F, 14.4F, 1, 1, 4, 0.0F, false));
		gun100.cubeList.add(new ModelBox(gun100, 59, 167, 1.7071F, 6.0071F, 14.4F, 1, 1, 4, 0.0F, false));

		gun101 = new ModelRenderer(this);
		gun101.setRotationPoint(-1.0F, 1.0F, 0.0F);
		bone22.addChild(gun101);
		setRotationAngle(gun101, 0.0F, 0.0F, -0.7854F);
		gun101.cubeList.add(new ModelBox(gun101, 131, 164, -4.0406F, 4.4548F, 14.4F, 1, 1, 4, 0.0F, false));

		gun102 = new ModelRenderer(this);
		gun102.setRotationPoint(-1.0F, 2.0F, 0.0F);
		bone22.addChild(gun102);
		setRotationAngle(gun102, 0.0F, 0.0F, -0.7854F);
		gun102.cubeList.add(new ModelBox(gun102, 72, 163, -4.0406F, 4.4548F, 14.4F, 1, 1, 4, 0.0F, false));

		gun103 = new ModelRenderer(this);
		gun103.setRotationPoint(1.0F, 0.0F, 0.0F);
		bone22.addChild(gun103);
		setRotationAngle(gun103, 0.0F, 0.0F, 0.7854F);
		gun103.cubeList.add(new ModelBox(gun103, 97, 64, 4.4548F, 4.4548F, 14.4F, 1, 1, 4, 0.0F, false));

		gun104 = new ModelRenderer(this);
		gun104.setRotationPoint(1.0F, 3.0F, 0.0F);
		bone22.addChild(gun104);
		setRotationAngle(gun104, 0.0F, 0.0F, -2.3562F);
		gun104.cubeList.add(new ModelBox(gun104, 33, 90, -4.0406F, -4.0406F, 14.4F, 1, 1, 4, 0.0F, false));

		barrelHandle2 = new ModelRenderer(this);
		barrelHandle2.setRotationPoint(0.0F, -11.6F, -14.5F);
		barrelM84.addChild(barrelHandle2);
		

		gun168_r1 = new ModelRenderer(this);
		gun168_r1.setRotationPoint(2.1365F, 12.7863F, 27.1856F);
		barrelHandle2.addChild(gun168_r1);
		setRotationAngle(gun168_r1, 0.0F, 0.0F, 0.7854F);
		gun168_r1.cubeList.add(new ModelBox(gun168_r1, 45, 105, -1.3F, -3.1F, 2.1F, 1, 1, 1, -0.2F, false));
		gun168_r1.cubeList.add(new ModelBox(gun168_r1, 45, 107, -1.1F, -3.1F, 2.1F, 1, 1, 1, -0.2F, false));
		gun168_r1.cubeList.add(new ModelBox(gun168_r1, 77, 107, -1.3F, -2.4F, 1.3F, 1, 1, 1, -0.2F, false));
		gun168_r1.cubeList.add(new ModelBox(gun168_r1, 5, 108, -1.1F, -2.4F, 1.3F, 1, 1, 1, -0.2F, false));
		gun168_r1.cubeList.add(new ModelBox(gun168_r1, 45, 109, -1.3F, -1.0F, -0.9F, 1, 1, 1, -0.2F, false));
		gun168_r1.cubeList.add(new ModelBox(gun168_r1, 110, 18, -1.1F, -1.0F, -0.9F, 1, 1, 1, -0.2F, false));

		gun105 = new ModelRenderer(this);
		gun105.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrelHandle2.addChild(gun105);
		gun105.cubeList.add(new ModelBox(gun105, 133, 143, 0.0F, 11.65F, 26.4F, 1, 1, 3, 0.1F, false));
		gun105.cubeList.add(new ModelBox(gun105, 121, 143, 0.0F, 13.3471F, 26.4F, 1, 1, 3, 0.1F, false));

		gun171_r1 = new ModelRenderer(this);
		gun171_r1.setRotationPoint(0.514F, 13.4088F, 26.8856F);
		gun105.addChild(gun171_r1);
		setRotationAngle(gun171_r1, 0.0F, 0.0F, 0.7854F);
		gun171_r1.cubeList.add(new ModelBox(gun171_r1, 25, 110, -0.5F, -4.8F, 2.5F, 1, 1, 1, -0.2F, false));
		gun171_r1.cubeList.add(new ModelBox(gun171_r1, 77, 112, -0.5F, -4.8F, 2.075F, 1, 1, 1, -0.2F, false));

		gun170_r1 = new ModelRenderer(this);
		gun170_r1.setRotationPoint(0.5306F, 13.3922F, 26.9076F);
		gun105.addChild(gun170_r1);
		setRotationAngle(gun170_r1, 0.0F, 0.0F, 0.7854F);
		gun170_r1.cubeList.add(new ModelBox(gun170_r1, 45, 111, -0.5F, -4.6F, 2.475F, 1, 1, 1, -0.2F, false));

		gun171_r2 = new ModelRenderer(this);
		gun171_r2.setRotationPoint(4.191F, 9.7318F, 28.8F);
		gun105.addChild(gun171_r2);
		setRotationAngle(gun171_r2, -0.2618F, 0.0F, 0.7854F);
		gun171_r2.cubeList.add(new ModelBox(gun171_r2, 16, 13, -0.5F, -2.975F, -0.3F, 1, 4, 1, -0.3F, false));

		gun172_r2 = new ModelRenderer(this);
		gun172_r2.setRotationPoint(0.6554F, 13.2674F, 27.4F);
		gun105.addChild(gun172_r2);
		setRotationAngle(gun172_r2, 0.0F, 0.0F, 0.7854F);
		gun172_r2.cubeList.add(new ModelBox(gun172_r2, 65, 11, -0.5F, -6.0F, 1.3F, 1, 2, 1, -0.3F, false));
		gun172_r2.cubeList.add(new ModelBox(gun172_r2, 65, 29, -0.5F, -8.0F, 1.775F, 1, 2, 1, -0.3F, false));
		gun172_r2.cubeList.add(new ModelBox(gun172_r2, 0, 0, -0.5F, -7.0F, 1.675F, 1, 3, 1, -0.3F, false));
		gun172_r2.cubeList.add(new ModelBox(gun172_r2, 17, 30, -0.5F, -8.0F, 2.075F, 1, 4, 1, -0.3F, false));

		gun168_r2 = new ModelRenderer(this);
		gun168_r2.setRotationPoint(0.7245F, 13.1983F, 26.8593F);
		gun105.addChild(gun168_r2);
		setRotationAngle(gun168_r2, 0.0F, 0.0F, 0.7854F);
		gun168_r2.cubeList.add(new ModelBox(gun168_r2, 45, 113, -0.5F, -4.5F, 1.6F, 1, 1, 1, -0.2F, false));

		gun167_r2 = new ModelRenderer(this);
		gun167_r2.setRotationPoint(0.3147F, 13.6081F, 27.1402F);
		gun105.addChild(gun167_r2);
		setRotationAngle(gun167_r2, 0.0F, 0.0F, 0.7854F);
		gun167_r2.cubeList.add(new ModelBox(gun167_r2, 5, 114, -0.5F, -4.5F, 1.0F, 1, 1, 1, -0.2F, false));

		gun167_r3 = new ModelRenderer(this);
		gun167_r3.setRotationPoint(0.6101F, 13.3127F, 26.1F);
		gun105.addChild(gun167_r3);
		setRotationAngle(gun167_r3, 0.0F, 0.0F, 0.7854F);
		gun167_r3.cubeList.add(new ModelBox(gun167_r3, 86, 44, -0.5F, -2.5F, 0.0F, 1, 2, 2, -0.2F, false));

		gun166_r3 = new ModelRenderer(this);
		gun166_r3.setRotationPoint(1.018F, 12.9048F, 27.4979F);
		gun105.addChild(gun166_r3);
		setRotationAngle(gun166_r3, 0.0F, 0.0F, 0.7854F);
		gun166_r3.cubeList.add(new ModelBox(gun166_r3, 86, 72, -0.5F, -2.5F, 0.0F, 1, 2, 2, -0.2F, false));

		gun167_r4 = new ModelRenderer(this);
		gun167_r4.setRotationPoint(2.484F, 11.4388F, 26.3861F);
		gun105.addChild(gun167_r4);
		setRotationAngle(gun167_r4, -0.829F, 0.0F, 0.7854F);
		gun167_r4.cubeList.add(new ModelBox(gun167_r4, 115, 72, -0.5F, -3.7F, 0.6F, 1, 1, 1, -0.2F, false));
		gun167_r4.cubeList.add(new ModelBox(gun167_r4, 117, 110, -0.5F, -3.7F, 1.0F, 1, 1, 1, -0.2F, false));
		gun167_r4.cubeList.add(new ModelBox(gun167_r4, 136, 13, -0.5F, -3.1F, 0.0F, 1, 1, 2, -0.2F, false));
		gun167_r4.cubeList.add(new ModelBox(gun167_r4, 33, 71, -0.5F, -2.5F, 0.0F, 1, 3, 2, -0.2F, false));

		gun108 = new ModelRenderer(this);
		gun108.setRotationPoint(-1.0F, 1.0F, 0.0F);
		barrelHandle2.addChild(gun108);
		gun108.cubeList.add(new ModelBox(gun108, 111, 143, 0.1515F, 11.4985F, 26.4F, 1, 1, 3, 0.1F, false));
		gun108.cubeList.add(new ModelBox(gun108, 99, 143, 1.8485F, 11.4985F, 26.4F, 1, 1, 3, 0.1F, false));

		gun109 = new ModelRenderer(this);
		gun109.setRotationPoint(-1.0F, 1.0F, 0.0F);
		barrelHandle2.addChild(gun109);
		setRotationAngle(gun109, 0.0F, 0.0F, -0.7854F);
		gun109.cubeList.add(new ModelBox(gun109, 61, 142, -7.9236F, 8.1964F, 26.4F, 1, 1, 3, 0.1F, false));

		gun114 = new ModelRenderer(this);
		gun114.setRotationPoint(-1.0F, 2.0F, 0.0F);
		barrelHandle2.addChild(gun114);
		setRotationAngle(gun114, 0.0F, 0.0F, -0.7854F);
		gun114.cubeList.add(new ModelBox(gun114, 42, 115, -8.065F, 8.3378F, 26.4F, 1, 1, 3, 0.1F, false));

		gun115 = new ModelRenderer(this);
		gun115.setRotationPoint(1.0F, 0.0F, 0.0F);
		barrelHandle2.addChild(gun115);
		setRotationAngle(gun115, 0.0F, 0.0F, 0.7854F);
		gun115.cubeList.add(new ModelBox(gun115, 118, 54, 8.3378F, 8.1964F, 26.4F, 1, 1, 3, 0.1F, false));

		gun116 = new ModelRenderer(this);
		gun116.setRotationPoint(1.0F, 3.0F, 0.0F);
		barrelHandle2.addChild(gun116);
		setRotationAngle(gun116, 0.0F, 0.0F, -2.3562F);
		gun116.cubeList.add(new ModelBox(gun116, 49, 142, -8.065F, -7.9236F, 26.4F, 1, 1, 3, 0.1F, false));

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(6.4272F, -4.2186F, 20.3418F);
		barrelM84.addChild(bone23);
		setRotationAngle(bone23, 0.1555F, 0.1536F, 0.012F);
		

		gun172_r3 = new ModelRenderer(this);
		gun172_r3.setRotationPoint(0.0F, 0.0F, -0.8052F);
		bone23.addChild(gun172_r3);
		setRotationAngle(gun172_r3, 0.0F, 0.0F, 0.7854F);
		gun172_r3.cubeList.add(new ModelBox(gun172_r3, 170, 120, -0.9243F, -0.849F, 2.7033F, 1, 1, 2, 0.0F, false));
		gun172_r3.cubeList.add(new ModelBox(gun172_r3, 170, 143, -0.0757F, -0.849F, 2.7033F, 1, 1, 2, 0.0F, false));
		gun172_r3.cubeList.add(new ModelBox(gun172_r3, 170, 123, -0.9243F, -0.151F, 2.7033F, 1, 1, 2, 0.0F, false));
		gun172_r3.cubeList.add(new ModelBox(gun172_r3, 170, 146, -0.0757F, -0.151F, 2.7033F, 1, 1, 2, 0.0F, false));
		gun172_r3.cubeList.add(new ModelBox(gun172_r3, 144, 120, -0.0757F, -0.5F, -4.7033F, 1, 1, 9, 0.0F, false));
		gun172_r3.cubeList.add(new ModelBox(gun172_r3, 144, 96, -0.9243F, -0.5F, -4.7033F, 1, 1, 9, 0.0F, false));

		gun171_r3 = new ModelRenderer(this);
		gun171_r3.setRotationPoint(0.0F, 0.0F, -0.8052F);
		bone23.addChild(gun171_r3);
		setRotationAngle(gun171_r3, 0.7854F, 0.0F, 0.7854F);
		gun171_r3.cubeList.add(new ModelBox(gun171_r3, 103, 157, -0.0757F, 1.7254F, 2.926F, 1, 1, 1, 0.0F, false));
		gun171_r3.cubeList.add(new ModelBox(gun171_r3, 156, 154, -0.9243F, 1.7254F, 2.926F, 1, 1, 1, 0.0F, false));
		gun171_r3.cubeList.add(new ModelBox(gun171_r3, 96, 79, -0.9243F, 2.926F, 1.7254F, 1, 1, 1, 0.0F, false));
		gun171_r3.cubeList.add(new ModelBox(gun171_r3, 109, 155, -0.0757F, 2.926F, 1.7254F, 1, 1, 1, 0.0F, false));
		gun171_r3.cubeList.add(new ModelBox(gun171_r3, 155, 137, -0.0757F, -2.9722F, -3.6793F, 1, 1, 1, 0.0F, false));
		gun171_r3.cubeList.add(new ModelBox(gun171_r3, 156, 6, -0.0757F, -3.6793F, -2.9722F, 1, 1, 1, 0.0F, false));
		gun171_r3.cubeList.add(new ModelBox(gun171_r3, 56, 71, -0.9243F, -2.9722F, -3.6793F, 1, 1, 1, 0.0F, false));
		gun171_r3.cubeList.add(new ModelBox(gun171_r3, 66, 71, -0.9243F, -3.6793F, -2.9722F, 1, 1, 1, 0.0F, false));

		gun171_r4 = new ModelRenderer(this);
		gun171_r4.setRotationPoint(0.0F, 0.0F, -0.8052F);
		bone23.addChild(gun171_r4);
		setRotationAngle(gun171_r4, -0.0436F, 0.0F, 0.7854F);
		gun171_r4.cubeList.add(new ModelBox(gun171_r4, 170, 168, -0.0757F, 0.3803F, -3.9397F, 1, 1, 8, 0.0F, false));
		gun171_r4.cubeList.add(new ModelBox(gun171_r4, 170, 120, -0.9243F, 0.3803F, -3.9397F, 1, 1, 8, 0.0F, false));

		gun170_r2 = new ModelRenderer(this);
		gun170_r2.setRotationPoint(0.0F, 0.0F, -0.8052F);
		bone23.addChild(gun170_r2);
		setRotationAngle(gun170_r2, 0.0436F, 0.0F, 0.7854F);
		gun170_r2.cubeList.add(new ModelBox(gun170_r2, 171, 9, -0.0757F, -1.3803F, -3.9397F, 1, 1, 8, 0.0F, false));
		gun170_r2.cubeList.add(new ModelBox(gun170_r2, 170, 129, -0.9243F, -1.3803F, -3.9397F, 1, 1, 8, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		barrelM84.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}