package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.10.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class PKMBarrel extends ModelBase {
	private final ModelRenderer barrelPKM;
	private final ModelRenderer gun28_r1;
	private final ModelRenderer gun25_r2;
	private final ModelRenderer gun21_r1;
	private final ModelRenderer gun22_r2;
	private final ModelRenderer gun23_r1;
	private final ModelRenderer gun22_r1;
	private final ModelRenderer gun27_r1;
	private final ModelRenderer gun25_r3;
	private final ModelRenderer gun24_r1;
	private final ModelRenderer gun24_r2;
	private final ModelRenderer gun23_r2;
	private final ModelRenderer gun13;
	private final ModelRenderer gun21;
	private final ModelRenderer bone3;
	private final ModelRenderer gun22;
	private final ModelRenderer gun24;
	private final ModelRenderer gun27;
	private final ModelRenderer gun28;
	private final ModelRenderer gun29;
	private final ModelRenderer gun30;
	private final ModelRenderer bone4;
	private final ModelRenderer gun41;
	private final ModelRenderer gun42;
	private final ModelRenderer gun43;
	private final ModelRenderer gun45;
	private final ModelRenderer gun46;
	private final ModelRenderer gun47;
	private final ModelRenderer bone16;
	private final ModelRenderer gun60;
	private final ModelRenderer gun61;
	private final ModelRenderer gun62;
	private final ModelRenderer gun63;
	private final ModelRenderer gun64;
	private final ModelRenderer gun65;
	private final ModelRenderer bone17;
	private final ModelRenderer gun66;
	private final ModelRenderer gun67;
	private final ModelRenderer gun68;
	private final ModelRenderer gun69;
	private final ModelRenderer gun70;
	private final ModelRenderer gun71;
	private final ModelRenderer frontIron;
	private final ModelRenderer bone5;
	private final ModelRenderer gun48;
	private final ModelRenderer gun49;
	private final ModelRenderer gun50;
	private final ModelRenderer gun51;
	private final ModelRenderer gun52;
	private final ModelRenderer gun53;
	private final ModelRenderer barrelHandle;
	private final ModelRenderer gun54;
	private final ModelRenderer gun55;
	private final ModelRenderer gun56;
	private final ModelRenderer gun57;
	private final ModelRenderer gun58;
	private final ModelRenderer gun59;
	private final ModelRenderer bone6;
	private final ModelRenderer gun162_r1;
	private final ModelRenderer gun164_r1;
	private final ModelRenderer gun163_r1;
	private final ModelRenderer gun165_r1;
	private final ModelRenderer gun164_r2;
	private final ModelRenderer gun165_r2;
	private final ModelRenderer gun166_r1;
	private final ModelRenderer gun168_r1;
	private final ModelRenderer gun171_r1;
	private final ModelRenderer gun167_r1;
	private final ModelRenderer gun170_r1;
	private final ModelRenderer gun169_r1;
	private final ModelRenderer gun170_r2;
	private final ModelRenderer gun171_r2;
	private final ModelRenderer gun167_r2;
	private final ModelRenderer gun166_r3;
	private final ModelRenderer gun166_r2;
	private final ModelRenderer gun165_r3;
	private final ModelRenderer gun166_r4;
	private final ModelRenderer gun171_r3;
	private final ModelRenderer gun170_r3;
	private final ModelRenderer gun170_r4;
	private final ModelRenderer gun169_r2;
	private final ModelRenderer ironsights_r1;
	private final ModelRenderer ironsights_r2;
	private final ModelRenderer ironsights_r3;
	private final ModelRenderer ironsights_r4;
	private final ModelRenderer ironsights_r5;
	private final ModelRenderer ironsights_r6;
	private final ModelRenderer ironsights_r7;
	private final ModelRenderer ironsights_r9;
	private final ModelRenderer ironsights_r8;
	private final ModelRenderer ironsights_r10;
	private final ModelRenderer ironsights_r11;
	private final ModelRenderer ironsights_r12;
	private final ModelRenderer ironsights_r13;
	private final ModelRenderer ironsights_r14;
	public PKMBarrel() {
		textureWidth = 512;
		textureHeight = 512;

		barrelPKM = new ModelRenderer(this);
		barrelPKM.setRotationPoint(-2.0F, -13.5F, -55.7F);
		barrelPKM.cubeList.add(new ModelBox(barrelPKM, 72, 214, 0.6F, 1.1F, -49.0F, 1, 1, 70, -0.001F, false));
		barrelPKM.cubeList.add(new ModelBox(barrelPKM, 144, 213, 0.0F, 0.5F, -49.0F, 1, 1, 70, 0.001F, false));

		gun28_r1 = new ModelRenderer(this);
		gun28_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrelPKM.addChild(gun28_r1);
		setRotationAngle(gun28_r1, 0.0133F, 0.0138F, -0.8203F);
		gun28_r1.cubeList.add(new ModelBox(gun28_r1, 241, 143, -1.2656F, 0.2409F, -0.9096F, 1, 1, 21, -0.1F, false));

		gun25_r2 = new ModelRenderer(this);
		gun25_r2.setRotationPoint(-0.6F, 0.6F, 0.0F);
		barrelPKM.addChild(gun25_r2);
		setRotationAngle(gun25_r2, -0.0055F, -0.0163F, 0.8814F);
		gun25_r2.cubeList.add(new ModelBox(gun25_r2, 241, 96, 0.2858F, -0.5819F, -0.9045F, 1, 1, 21, -0.1F, false));

		gun21_r1 = new ModelRenderer(this);
		gun21_r1.setRotationPoint(1.6F, 0.6F, -54.0F);
		barrelPKM.addChild(gun21_r1);
		setRotationAngle(gun21_r1, 0.0F, 0.0F, -0.7854F);
		gun21_r1.cubeList.add(new ModelBox(gun21_r1, 216, 214, -1.2736F, -0.5664F, 4.919F, 1, 1, 70, -0.08F, false));

		gun22_r2 = new ModelRenderer(this);
		gun22_r2.setRotationPoint(-0.6F, 0.6F, -54.0F);
		barrelPKM.addChild(gun22_r2);
		setRotationAngle(gun22_r2, 0.0F, 0.0F, 0.7854F);
		gun22_r2.cubeList.add(new ModelBox(gun22_r2, 216, 143, 0.2736F, -0.5664F, 4.92F, 1, 1, 70, -0.081F, false));

		gun23_r1 = new ModelRenderer(this);
		gun23_r1.setRotationPoint(-0.6F, 1.6F, -54.0F);
		barrelPKM.addChild(gun23_r1);
		setRotationAngle(gun23_r1, 0.0F, 0.0F, -0.7854F);
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 216, 72, -0.4336F, 0.2736F, 4.92F, 1, 1, 70, -0.081F, false));

		gun22_r1 = new ModelRenderer(this);
		gun22_r1.setRotationPoint(1.6F, 1.6F, -54.0F);
		barrelPKM.addChild(gun22_r1);
		setRotationAngle(gun22_r1, 0.0F, 0.0F, 0.7854F);
		gun22_r1.cubeList.add(new ModelBox(gun22_r1, 216, 1, -0.5664F, 0.2736F, 4.92F, 1, 1, 70, -0.08F, false));

		gun27_r1 = new ModelRenderer(this);
		gun27_r1.setRotationPoint(1.0F, 0.0F, 0.0F);
		barrelPKM.addChild(gun27_r1);
		setRotationAngle(gun27_r1, 0.0133F, -0.0138F, 0.8203F);
		gun27_r1.cubeList.add(new ModelBox(gun27_r1, 241, 72, 0.2656F, 0.2409F, -0.9096F, 1, 1, 21, -0.1F, false));

		gun25_r3 = new ModelRenderer(this);
		gun25_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrelPKM.addChild(gun25_r3);
		setRotationAngle(gun25_r3, 0.0192F, 0.0F, 0.0F);
		gun25_r3.cubeList.add(new ModelBox(gun25_r3, 241, 238, 0.0F, 0.4999F, -0.0096F, 1, 1, 20, -0.001F, false));

		gun24_r1 = new ModelRenderer(this);
		gun24_r1.setRotationPoint(-0.6F, 1.6F, 0.0F);
		barrelPKM.addChild(gun24_r1);
		setRotationAngle(gun24_r1, 0.0087F, -0.0148F, 0.0F);
		gun24_r1.cubeList.add(new ModelBox(gun24_r1, 241, 214, 0.0F, -0.5F, -0.0043F, 1, 1, 20, -0.001F, false));

		gun24_r2 = new ModelRenderer(this);
		gun24_r2.setRotationPoint(1.6F, 0.6F, 0.0F);
		barrelPKM.addChild(gun24_r2);
		setRotationAngle(gun24_r2, -0.0055F, 0.0163F, -0.8814F);
		gun24_r2.cubeList.add(new ModelBox(gun24_r2, 241, 25, -1.2858F, -0.5819F, -0.9045F, 1, 1, 21, -0.1F, false));

		gun23_r2 = new ModelRenderer(this);
		gun23_r2.setRotationPoint(1.6F, 1.6F, 0.0F);
		barrelPKM.addChild(gun23_r2);
		setRotationAngle(gun23_r2, 0.0087F, 0.0148F, 0.0F);
		gun23_r2.cubeList.add(new ModelBox(gun23_r2, 241, 167, -1.0F, -0.5F, -0.0043F, 1, 1, 20, -0.001F, false));

		gun13 = new ModelRenderer(this);
		gun13.setRotationPoint(-0.5F, 0.6F, -54.0F);
		barrelPKM.addChild(gun13);
		gun13.cubeList.add(new ModelBox(gun13, 0, 213, -0.1F, 0.5F, 5.0F, 1, 1, 70, 0.0F, false));

		gun21 = new ModelRenderer(this);
		gun21.setRotationPoint(0.0F, 1.2F, -54.0F);
		barrelPKM.addChild(gun21);
		gun21.cubeList.add(new ModelBox(gun21, 144, 142, 0.0F, 0.5F, 5.0F, 1, 1, 70, 0.001F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, -2.6F, -35.5F);
		barrelPKM.addChild(bone3);
		

		gun22 = new ModelRenderer(this);
		gun22.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(gun22);
		gun22.cubeList.add(new ModelBox(gun22, 52, 191, 0.0F, 6.25F, 11.4F, 1, 1, 6, 0.0F, false));
		gun22.cubeList.add(new ModelBox(gun22, 80, 186, 0.0F, 7.6642F, 11.4F, 1, 1, 6, 0.0F, false));

		gun162_r1 = new ModelRenderer(this);
		gun162_r1.setRotationPoint(0.5F, 5.8161F, 10.333F);
		gun22.addChild(gun162_r1);
		setRotationAngle(gun162_r1, -1.0472F, 0.0F, 0.0F);
		gun162_r1.cubeList.add(new ModelBox(gun162_r1, 72, 72, -0.5F, -2.5F, -1.0F, 1, 3, 4, 0.0F, false));

		gun24 = new ModelRenderer(this);
		gun24.setRotationPoint(-1.0F, 1.0F, 0.0F);
		bone3.addChild(gun24);
		gun24.cubeList.add(new ModelBox(gun24, 72, 185, 0.2929F, 5.9571F, 11.4F, 1, 1, 6, 0.0F, false));
		gun24.cubeList.add(new ModelBox(gun24, 144, 184, 1.7071F, 5.9571F, 11.4F, 1, 1, 6, 0.0F, false));

		gun27 = new ModelRenderer(this);
		gun27.setRotationPoint(-1.0F, 1.0F, 0.0F);
		bone3.addChild(gun27);
		setRotationAngle(gun27, 0.0F, 0.0F, -0.7854F);
		gun27.cubeList.add(new ModelBox(gun27, 0, 184, -4.0052F, 4.4194F, 11.4F, 1, 1, 6, 0.0F, false));

		gun28 = new ModelRenderer(this);
		gun28.setRotationPoint(-1.0F, 2.0F, 0.0F);
		bone3.addChild(gun28);
		setRotationAngle(gun28, 0.0F, 0.0F, -0.7854F);
		gun28.cubeList.add(new ModelBox(gun28, 121, 180, -4.0052F, 4.4194F, 11.4F, 1, 1, 6, 0.0F, false));

		gun29 = new ModelRenderer(this);
		gun29.setRotationPoint(1.0F, 0.0F, 0.0F);
		bone3.addChild(gun29);
		setRotationAngle(gun29, 0.0F, 0.0F, 0.7854F);
		gun29.cubeList.add(new ModelBox(gun29, 82, 154, 4.4194F, 4.4194F, 11.4F, 1, 1, 6, 0.0F, false));

		gun30 = new ModelRenderer(this);
		gun30.setRotationPoint(1.0F, 3.0F, 0.0F);
		bone3.addChild(gun30);
		setRotationAngle(gun30, 0.0F, 0.0F, -2.3562F);
		gun30.cubeList.add(new ModelBox(gun30, 16, 95, -4.0052F, -4.0052F, 11.4F, 1, 1, 6, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, -5.9F, -41.4F);
		barrelPKM.addChild(bone4);
		

		gun41 = new ModelRenderer(this);
		gun41.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone4.addChild(gun41);
		gun41.cubeList.add(new ModelBox(gun41, 72, 154, 0.0F, 6.3F, 15.4F, 1, 1, 3, 0.0F, false));
		gun41.cubeList.add(new ModelBox(gun41, 121, 153, 0.0F, 7.7142F, 15.4F, 1, 1, 3, 0.0F, false));

		gun42 = new ModelRenderer(this);
		gun42.setRotationPoint(-1.0F, 1.0F, 0.0F);
		bone4.addChild(gun42);
		gun42.cubeList.add(new ModelBox(gun42, 99, 153, 0.2929F, 6.0071F, 15.4F, 1, 1, 3, 0.0F, false));
		gun42.cubeList.add(new ModelBox(gun42, 153, 60, 1.7071F, 6.0071F, 15.4F, 1, 1, 3, 0.0F, false));

		gun43 = new ModelRenderer(this);
		gun43.setRotationPoint(-1.0F, 1.0F, 0.0F);
		bone4.addChild(gun43);
		setRotationAngle(gun43, 0.0F, 0.0F, -0.7854F);
		gun43.cubeList.add(new ModelBox(gun43, 153, 52, -4.0406F, 4.4548F, 15.4F, 1, 1, 3, 0.0F, false));

		gun45 = new ModelRenderer(this);
		gun45.setRotationPoint(-1.0F, 2.0F, 0.0F);
		bone4.addChild(gun45);
		setRotationAngle(gun45, 0.0F, 0.0F, -0.7854F);
		gun45.cubeList.add(new ModelBox(gun45, 27, 153, -4.0406F, 4.4548F, 15.4F, 1, 1, 3, 0.0F, false));

		gun46 = new ModelRenderer(this);
		gun46.setRotationPoint(1.0F, 0.0F, 0.0F);
		bone4.addChild(gun46);
		setRotationAngle(gun46, 0.0F, 0.0F, 0.7854F);
		gun46.cubeList.add(new ModelBox(gun46, 124, 106, 4.4548F, 4.4548F, 15.4F, 1, 1, 3, 0.0F, false));

		gun47 = new ModelRenderer(this);
		gun47.setRotationPoint(1.0F, 3.0F, 0.0F);
		bone4.addChild(gun47);
		setRotationAngle(gun47, 0.0F, 0.0F, -2.3562F);
		gun47.cubeList.add(new ModelBox(gun47, 72, 112, -4.0406F, -4.0406F, 15.4F, 1, 1, 3, 0.0F, false));

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(0.0F, -5.9F, -66.4F);
		barrelPKM.addChild(bone16);
		

		gun60 = new ModelRenderer(this);
		gun60.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone16.addChild(gun60);
		gun60.cubeList.add(new ModelBox(gun60, 90, 154, 0.0F, 6.3F, 16.4F, 1, 1, 2, 0.0F, false));
		gun60.cubeList.add(new ModelBox(gun60, 82, 154, 0.0F, 7.7142F, 16.4F, 1, 1, 2, 0.0F, false));

		gun61 = new ModelRenderer(this);
		gun61.setRotationPoint(-1.0F, 1.0F, 0.0F);
		bone16.addChild(gun61);
		gun61.cubeList.add(new ModelBox(gun61, 18, 153, 0.2929F, 6.0071F, 16.4F, 1, 1, 2, 0.0F, false));
		gun61.cubeList.add(new ModelBox(gun61, 72, 146, 1.7071F, 6.0071F, 16.4F, 1, 1, 2, 0.0F, false));

		gun62 = new ModelRenderer(this);
		gun62.setRotationPoint(-1.0F, 1.0F, 0.0F);
		bone16.addChild(gun62);
		setRotationAngle(gun62, 0.0F, 0.0F, -0.7854F);
		gun62.cubeList.add(new ModelBox(gun62, 144, 63, -4.0406F, 4.4548F, 16.4F, 1, 1, 2, 0.0F, false));

		gun63 = new ModelRenderer(this);
		gun63.setRotationPoint(-1.0F, 2.0F, 0.0F);
		bone16.addChild(gun63);
		setRotationAngle(gun63, 0.0F, 0.0F, -0.7854F);
		gun63.cubeList.add(new ModelBox(gun63, 144, 60, -4.0406F, 4.4548F, 16.4F, 1, 1, 2, 0.0F, false));

		gun64 = new ModelRenderer(this);
		gun64.setRotationPoint(1.0F, 0.0F, 0.0F);
		bone16.addChild(gun64);
		setRotationAngle(gun64, 0.0F, 0.0F, 0.7854F);
		gun64.cubeList.add(new ModelBox(gun64, 117, 84, 4.4548F, 4.4548F, 16.4F, 1, 1, 2, 0.0F, false));

		gun65 = new ModelRenderer(this);
		gun65.setRotationPoint(1.0F, 3.0F, 0.0F);
		bone16.addChild(gun65);
		setRotationAngle(gun65, 0.0F, 0.0F, -2.3562F);
		gun65.cubeList.add(new ModelBox(gun65, 86, 48, -4.0406F, -4.0406F, 16.4F, 1, 1, 2, 0.0F, false));

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(0.0F, -5.9F, -70.4F);
		barrelPKM.addChild(bone17);
		

		gun66 = new ModelRenderer(this);
		gun66.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone17.addChild(gun66);
		

		gun164_r1 = new ModelRenderer(this);
		gun164_r1.setRotationPoint(0.5F, 7.5071F, 18.9F);
		gun66.addChild(gun164_r1);
		setRotationAngle(gun164_r1, 0.0873F, 0.0F, 0.0F);
		gun164_r1.cubeList.add(new ModelBox(gun164_r1, 144, 130, -0.5F, 0.2071F, -1.5F, 1, 1, 3, 0.0F, false));

		gun163_r1 = new ModelRenderer(this);
		gun163_r1.setRotationPoint(0.5F, 7.5071F, 18.9F);
		gun66.addChild(gun163_r1);
		setRotationAngle(gun163_r1, -0.0873F, 0.0F, 0.0F);
		gun163_r1.cubeList.add(new ModelBox(gun163_r1, 144, 134, -0.5F, -1.2071F, -1.5F, 1, 1, 3, 0.0F, false));

		gun67 = new ModelRenderer(this);
		gun67.setRotationPoint(-1.0F, 1.0F, 0.0F);
		bone17.addChild(gun67);
		

		gun165_r1 = new ModelRenderer(this);
		gun165_r1.setRotationPoint(1.5F, 6.5071F, 18.9F);
		gun67.addChild(gun165_r1);
		setRotationAngle(gun165_r1, 0.0F, -0.0873F, 0.0F);
		gun165_r1.cubeList.add(new ModelBox(gun165_r1, 144, 120, 0.2071F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));

		gun164_r2 = new ModelRenderer(this);
		gun164_r2.setRotationPoint(1.5F, 6.5071F, 18.9F);
		gun67.addChild(gun164_r2);
		setRotationAngle(gun164_r2, 0.0F, 0.0873F, 0.0F);
		gun164_r2.cubeList.add(new ModelBox(gun164_r2, 144, 124, -1.2071F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));

		gun68 = new ModelRenderer(this);
		gun68.setRotationPoint(-1.0F, 1.0F, 0.0F);
		bone17.addChild(gun68);
		setRotationAngle(gun68, 0.0F, 0.0F, -0.7854F);
		

		gun165_r2 = new ModelRenderer(this);
		gun165_r2.setRotationPoint(-3.5406F, 5.6619F, 16.9F);
		gun68.addChild(gun165_r2);
		setRotationAngle(gun165_r2, -0.0873F, 0.0F, 0.0F);
		gun165_r2.cubeList.add(new ModelBox(gun165_r2, 144, 110, -0.5F, -1.3814F, 0.4924F, 1, 1, 3, 0.0F, false));

		gun69 = new ModelRenderer(this);
		gun69.setRotationPoint(-1.0F, 2.0F, 0.0F);
		bone17.addChild(gun69);
		setRotationAngle(gun69, 0.0F, 0.0F, -0.7854F);
		

		gun166_r1 = new ModelRenderer(this);
		gun166_r1.setRotationPoint(-2.8335F, 4.9548F, 16.9F);
		gun69.addChild(gun166_r1);
		setRotationAngle(gun166_r1, 0.0F, 0.0873F, 0.0F);
		gun166_r1.cubeList.add(new ModelBox(gun166_r1, 144, 106, -1.3814F, -0.5F, 0.4924F, 1, 1, 3, 0.0F, false));

		gun70 = new ModelRenderer(this);
		gun70.setRotationPoint(1.0F, 0.0F, 0.0F);
		bone17.addChild(gun70);
		setRotationAngle(gun70, 0.0F, 0.0F, 0.7854F);
		

		gun168_r1 = new ModelRenderer(this);
		gun168_r1.setRotationPoint(4.9548F, 5.6619F, 16.9F);
		gun70.addChild(gun168_r1);
		setRotationAngle(gun168_r1, -0.0873F, 0.0F, 0.0F);
		gun168_r1.cubeList.add(new ModelBox(gun168_r1, 121, 88, -0.5F, -1.3814F, 0.4924F, 1, 1, 3, 0.0F, false));

		gun71 = new ModelRenderer(this);
		gun71.setRotationPoint(1.0F, 3.0F, 0.0F);
		bone17.addChild(gun71);
		setRotationAngle(gun71, 0.0F, 0.0F, -2.3562F);
		

		gun171_r1 = new ModelRenderer(this);
		gun171_r1.setRotationPoint(-2.8335F, -3.5406F, 16.9F);
		gun71.addChild(gun171_r1);
		setRotationAngle(gun171_r1, 0.0F, 0.0873F, 0.0F);
		gun171_r1.cubeList.add(new ModelBox(gun171_r1, 0, 108, -1.3814F, -0.5F, 0.4924F, 1, 1, 3, 0.0F, false));

		frontIron = new ModelRenderer(this);
		frontIron.setRotationPoint(2.0F, 33.5F, 89.7F);
		barrelPKM.addChild(frontIron);
		frontIron.cubeList.add(new ModelBox(frontIron, 46, 95, -2.0F, -40.2F, -136.4F, 1, 2, 1, -0.4F, false));

		ironsights_r1 = new ModelRenderer(this);
		ironsights_r1.setRotationPoint(-1.5F, -40.2623F, -135.6153F);
		frontIron.addChild(ironsights_r1);
		setRotationAngle(ironsights_r1, 0.0F, -1.5708F, 0.0F);
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 115, 102, -1.4F, 1.0F, -1.0F, 1, 2, 2, -0.2F, false));

		ironsights_r2 = new ModelRenderer(this);
		ironsights_r2.setRotationPoint(-1.5F, -40.2623F, -134.8153F);
		frontIron.addChild(ironsights_r2);
		setRotationAngle(ironsights_r2, 0.0F, -1.5708F, 0.0F);
		ironsights_r2.cubeList.add(new ModelBox(ironsights_r2, 163, 48, -0.4F, 3.0F, -1.0F, 1, 1, 2, -0.2F, false));

		ironsights_r3 = new ModelRenderer(this);
		ironsights_r3.setRotationPoint(-2.2757F, -40.115F, -135.3153F);
		frontIron.addChild(ironsights_r3);
		setRotationAngle(ironsights_r3, 0.0F, -1.5708F, -0.48F);
		ironsights_r3.cubeList.add(new ModelBox(ironsights_r3, 159, 161, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r4 = new ModelRenderer(this);
		ironsights_r4.setRotationPoint(-1.814F, -40.6254F, -135.3153F);
		frontIron.addChild(ironsights_r4);
		setRotationAngle(ironsights_r4, 0.0F, -1.5708F, 0.48F);
		ironsights_r4.cubeList.add(new ModelBox(ironsights_r4, 160, 39, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r5 = new ModelRenderer(this);
		ironsights_r5.setRotationPoint(-0.299F, -41.0871F, -135.3153F);
		frontIron.addChild(ironsights_r5);
		setRotationAngle(ironsights_r5, 0.0F, -1.5708F, -0.48F);
		ironsights_r5.cubeList.add(new ModelBox(ironsights_r5, 160, 36, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r6 = new ModelRenderer(this);
		ironsights_r6.setRotationPoint(0.1627F, -39.6533F, -135.3153F);
		frontIron.addChild(ironsights_r6);
		setRotationAngle(ironsights_r6, 0.0F, -1.5708F, 0.48F);
		ironsights_r6.cubeList.add(new ModelBox(ironsights_r6, 159, 72, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r7 = new ModelRenderer(this);
		ironsights_r7.setRotationPoint(-0.299F, -41.0871F, -136.2153F);
		frontIron.addChild(ironsights_r7);
		setRotationAngle(ironsights_r7, 0.0F, -1.5708F, -0.48F);
		ironsights_r7.cubeList.add(new ModelBox(ironsights_r7, 163, 9, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r8 = new ModelRenderer(this);
		ironsights_r8.setRotationPoint(-1.814F, -40.6254F, -136.2153F);
		frontIron.addChild(ironsights_r8);
		setRotationAngle(ironsights_r8, 0.0F, -1.5708F, 0.48F);
		ironsights_r8.cubeList.add(new ModelBox(ironsights_r8, 162, 20, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r9 = new ModelRenderer(this);
		ironsights_r9.setRotationPoint(0.1627F, -39.6533F, -136.2153F);
		frontIron.addChild(ironsights_r9);
		setRotationAngle(ironsights_r9, 0.0F, -1.5708F, 0.48F);
		ironsights_r9.cubeList.add(new ModelBox(ironsights_r9, 163, 12, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r10 = new ModelRenderer(this);
		ironsights_r10.setRotationPoint(-2.2757F, -40.115F, -136.2153F);
		frontIron.addChild(ironsights_r10);
		setRotationAngle(ironsights_r10, 0.0F, -1.5708F, -0.48F);
		ironsights_r10.cubeList.add(new ModelBox(ironsights_r10, 51, 167, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r11 = new ModelRenderer(this);
		ironsights_r11.setRotationPoint(-1.5F, -40.2623F, -135.1153F);
		frontIron.addChild(ironsights_r11);
		setRotationAngle(ironsights_r11, 0.0F, -1.5708F, 0.0F);
		ironsights_r11.cubeList.add(new ModelBox(ironsights_r11, 62, 101, -1.4F, 1.0F, -1.0F, 2, 3, 2, -0.2F, false));

		ironsights_r12 = new ModelRenderer(this);
		ironsights_r12.setRotationPoint(-1.5F, -34.4F, -135.6F);
		frontIron.addChild(ironsights_r12);
		setRotationAngle(ironsights_r12, 0.0F, -1.5708F, 0.0F);
		ironsights_r12.cubeList.add(new ModelBox(ironsights_r12, 94, 82, -1.4F, -4.0F, -1.0F, 1, 6, 2, -0.2F, false));

		ironsights_r13 = new ModelRenderer(this);
		ironsights_r13.setRotationPoint(-1.5F, -34.4F, -135.2F);
		frontIron.addChild(ironsights_r13);
		setRotationAngle(ironsights_r13, 0.0F, -1.5708F, 0.0F);
		ironsights_r13.cubeList.add(new ModelBox(ironsights_r13, 144, 91, -1.4F, 1.0F, -1.0F, 4, 1, 2, -0.2F, false));

		ironsights_r14 = new ModelRenderer(this);
		ironsights_r14.setRotationPoint(-1.5F, -34.481F, -134.5433F);
		frontIron.addChild(ironsights_r14);
		setRotationAngle(ironsights_r14, 1.5708F, -1.2217F, -1.5708F);
		ironsights_r14.cubeList.add(new ModelBox(ironsights_r14, 96, 12, 0.4F, -4.0F, -1.0F, 1, 6, 2, -0.2F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-2.0F, -39.4F, -151.2F);
		frontIron.addChild(bone5);
		

		gun48 = new ModelRenderer(this);
		gun48.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(gun48);
		gun48.cubeList.add(new ModelBox(gun48, 170, 184, 0.0F, 6.3F, 14.4F, 1, 1, 4, 0.0F, false));
		gun48.cubeList.add(new ModelBox(gun48, 26, 184, 0.0F, 7.7142F, 14.4F, 1, 1, 4, 0.0F, false));

		gun49 = new ModelRenderer(this);
		gun49.setRotationPoint(-1.0F, 1.0F, 0.0F);
		bone5.addChild(gun49);
		gun49.cubeList.add(new ModelBox(gun49, 59, 182, 0.2929F, 6.0071F, 14.4F, 1, 1, 4, 0.0F, false));
		gun49.cubeList.add(new ModelBox(gun49, 181, 103, 1.7071F, 6.0071F, 14.4F, 1, 1, 4, 0.0F, false));

		gun50 = new ModelRenderer(this);
		gun50.setRotationPoint(-1.0F, 1.0F, 0.0F);
		bone5.addChild(gun50);
		setRotationAngle(gun50, 0.0F, 0.0F, -0.7854F);
		gun50.cubeList.add(new ModelBox(gun50, 181, 96, -4.0406F, 4.4548F, 14.4F, 1, 1, 4, 0.0F, false));

		gun51 = new ModelRenderer(this);
		gun51.setRotationPoint(-1.0F, 2.0F, 0.0F);
		bone5.addChild(gun51);
		setRotationAngle(gun51, 0.0F, 0.0F, -0.7854F);
		gun51.cubeList.add(new ModelBox(gun51, 181, 79, -4.0406F, 4.4548F, 14.4F, 1, 1, 4, 0.0F, false));

		gun52 = new ModelRenderer(this);
		gun52.setRotationPoint(1.0F, 0.0F, 0.0F);
		bone5.addChild(gun52);
		setRotationAngle(gun52, 0.0F, 0.0F, 0.7854F);
		gun52.cubeList.add(new ModelBox(gun52, 105, 120, 4.4548F, 4.4548F, 14.4F, 1, 1, 4, 0.0F, false));

		gun53 = new ModelRenderer(this);
		gun53.setRotationPoint(1.0F, 3.0F, 0.0F);
		bone5.addChild(gun53);
		setRotationAngle(gun53, 0.0F, 0.0F, -2.3562F);
		gun53.cubeList.add(new ModelBox(gun53, 46, 90, -4.0406F, -4.0406F, 14.4F, 1, 1, 4, 0.0F, false));

		barrelHandle = new ModelRenderer(this);
		barrelHandle.setRotationPoint(0.0F, -11.6F, -14.5F);
		barrelPKM.addChild(barrelHandle);
		

		gun167_r1 = new ModelRenderer(this);
		gun167_r1.setRotationPoint(2.1365F, 12.7863F, 27.1856F);
		barrelHandle.addChild(gun167_r1);
		setRotationAngle(gun167_r1, 0.0F, 0.0F, 0.7854F);
		gun167_r1.cubeList.add(new ModelBox(gun167_r1, 125, 64, -1.3F, -3.1F, 2.1F, 1, 1, 1, -0.2F, false));
		gun167_r1.cubeList.add(new ModelBox(gun167_r1, 33, 125, -1.1F, -3.1F, 2.1F, 1, 1, 1, -0.2F, false));
		gun167_r1.cubeList.add(new ModelBox(gun167_r1, 126, 84, -1.3F, -2.4F, 1.3F, 1, 1, 1, -0.2F, false));
		gun167_r1.cubeList.add(new ModelBox(gun167_r1, 125, 66, -1.1F, -2.4F, 1.3F, 1, 1, 1, -0.2F, false));
		gun167_r1.cubeList.add(new ModelBox(gun167_r1, 0, 129, -1.3F, -1.0F, -0.9F, 1, 1, 1, -0.2F, false));
		gun167_r1.cubeList.add(new ModelBox(gun167_r1, 129, 20, -1.1F, -1.0F, -0.9F, 1, 1, 1, -0.2F, false));

		gun54 = new ModelRenderer(this);
		gun54.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrelHandle.addChild(gun54);
		gun54.cubeList.add(new ModelBox(gun54, 144, 152, 0.0F, 11.65F, 26.4F, 1, 1, 3, 0.1F, false));
		gun54.cubeList.add(new ModelBox(gun54, 61, 152, 0.0F, 13.3471F, 26.4F, 1, 1, 3, 0.1F, false));

		gun170_r1 = new ModelRenderer(this);
		gun170_r1.setRotationPoint(0.514F, 13.4088F, 26.8856F);
		gun54.addChild(gun170_r1);
		setRotationAngle(gun170_r1, 0.0F, 0.0F, 0.7854F);
		gun170_r1.cubeList.add(new ModelBox(gun170_r1, 89, 123, -0.5F, -4.8F, 2.5F, 1, 1, 1, -0.2F, false));
		gun170_r1.cubeList.add(new ModelBox(gun170_r1, 126, 88, -0.5F, -4.8F, 2.075F, 1, 1, 1, -0.2F, false));

		gun169_r1 = new ModelRenderer(this);
		gun169_r1.setRotationPoint(0.5306F, 13.3922F, 26.9076F);
		gun54.addChild(gun169_r1);
		setRotationAngle(gun169_r1, 0.0F, 0.0F, 0.7854F);
		gun169_r1.cubeList.add(new ModelBox(gun169_r1, 124, 14, -0.5F, -4.6F, 2.475F, 1, 1, 1, -0.2F, false));

		gun170_r2 = new ModelRenderer(this);
		gun170_r2.setRotationPoint(4.191F, 9.7318F, 28.8F);
		gun54.addChild(gun170_r2);
		setRotationAngle(gun170_r2, -0.2618F, 0.0F, 0.7854F);
		gun170_r2.cubeList.add(new ModelBox(gun170_r2, 26, 30, -0.5F, -2.975F, -0.3F, 1, 4, 1, -0.3F, false));

		gun171_r2 = new ModelRenderer(this);
		gun171_r2.setRotationPoint(0.6554F, 13.2674F, 27.4F);
		gun54.addChild(gun171_r2);
		setRotationAngle(gun171_r2, 0.0F, 0.0F, 0.7854F);
		gun171_r2.cubeList.add(new ModelBox(gun171_r2, 86, 56, -0.5F, -6.0F, 1.3F, 1, 2, 1, -0.3F, false));
		gun171_r2.cubeList.add(new ModelBox(gun171_r2, 22, 85, -0.5F, -8.0F, 1.775F, 1, 2, 1, -0.3F, false));
		gun171_r2.cubeList.add(new ModelBox(gun171_r2, 8, 0, -0.5F, -7.0F, 1.675F, 1, 3, 1, -0.3F, false));
		gun171_r2.cubeList.add(new ModelBox(gun171_r2, 17, 48, -0.5F, -8.0F, 2.075F, 1, 4, 1, -0.3F, false));

		gun167_r2 = new ModelRenderer(this);
		gun167_r2.setRotationPoint(0.7245F, 13.1983F, 26.8593F);
		gun54.addChild(gun167_r2);
		setRotationAngle(gun167_r2, 0.0F, 0.0F, 0.7854F);
		gun167_r2.cubeList.add(new ModelBox(gun167_r2, 12, 127, -0.5F, -4.5F, 1.6F, 1, 1, 1, -0.2F, false));

		gun166_r2 = new ModelRenderer(this);
		gun166_r2.setRotationPoint(0.3147F, 13.6081F, 27.1402F);
		gun54.addChild(gun166_r2);
		setRotationAngle(gun166_r2, 0.0F, 0.0F, 0.7854F);
		gun166_r2.cubeList.add(new ModelBox(gun166_r2, 127, 50, -0.5F, -4.5F, 1.0F, 1, 1, 1, -0.2F, false));

		gun166_r3 = new ModelRenderer(this);
		gun166_r3.setRotationPoint(0.6101F, 13.3127F, 26.1F);
		gun54.addChild(gun166_r3);
		setRotationAngle(gun166_r3, 0.0F, 0.0F, 0.7854F);
		gun166_r3.cubeList.add(new ModelBox(gun166_r3, 64, 113, -0.5F, -2.5F, 0.0F, 1, 2, 2, -0.2F, false));

		gun165_r3 = new ModelRenderer(this);
		gun165_r3.setRotationPoint(1.018F, 12.9048F, 27.4979F);
		gun54.addChild(gun165_r3);
		setRotationAngle(gun165_r3, 0.0F, 0.0F, 0.7854F);
		gun165_r3.cubeList.add(new ModelBox(gun165_r3, 13, 114, -0.5F, -2.5F, 0.0F, 1, 2, 2, -0.2F, false));

		gun166_r4 = new ModelRenderer(this);
		gun166_r4.setRotationPoint(2.484F, 11.4388F, 26.3861F);
		gun54.addChild(gun166_r4);
		setRotationAngle(gun166_r4, -0.829F, 0.0F, 0.7854F);
		gun166_r4.cubeList.add(new ModelBox(gun166_r4, 57, 123, -0.5F, -3.7F, 0.6F, 1, 1, 1, -0.2F, false));
		gun166_r4.cubeList.add(new ModelBox(gun166_r4, 12, 125, -0.5F, -3.7F, 1.0F, 1, 1, 1, -0.2F, false));
		gun166_r4.cubeList.add(new ModelBox(gun166_r4, 0, 159, -0.5F, -3.1F, 0.0F, 1, 1, 2, -0.2F, false));
		gun166_r4.cubeList.add(new ModelBox(gun166_r4, 72, 56, -0.5F, -2.5F, 0.0F, 1, 3, 2, -0.2F, false));

		gun55 = new ModelRenderer(this);
		gun55.setRotationPoint(-1.0F, 1.0F, 0.0F);
		barrelHandle.addChild(gun55);
		gun55.cubeList.add(new ModelBox(gun55, 49, 152, 0.1515F, 11.4985F, 26.4F, 1, 1, 3, 0.1F, false));
		gun55.cubeList.add(new ModelBox(gun55, 152, 20, 1.8485F, 11.4985F, 26.4F, 1, 1, 3, 0.1F, false));

		gun56 = new ModelRenderer(this);
		gun56.setRotationPoint(-1.0F, 1.0F, 0.0F);
		barrelHandle.addChild(gun56);
		setRotationAngle(gun56, 0.0F, 0.0F, -0.7854F);
		gun56.cubeList.add(new ModelBox(gun56, 151, 26, -7.9236F, 8.1964F, 26.4F, 1, 1, 3, 0.1F, false));

		gun57 = new ModelRenderer(this);
		gun57.setRotationPoint(-1.0F, 2.0F, 0.0F);
		barrelHandle.addChild(gun57);
		setRotationAngle(gun57, 0.0F, 0.0F, -0.7854F);
		gun57.cubeList.add(new ModelBox(gun57, 118, 18, -8.065F, 8.3378F, 26.4F, 1, 1, 3, 0.1F, false));

		gun58 = new ModelRenderer(this);
		gun58.setRotationPoint(1.0F, 0.0F, 0.0F);
		barrelHandle.addChild(gun58);
		setRotationAngle(gun58, 0.0F, 0.0F, 0.7854F);
		gun58.cubeList.add(new ModelBox(gun58, 124, 102, 8.3378F, 8.1964F, 26.4F, 1, 1, 3, 0.1F, false));

		gun59 = new ModelRenderer(this);
		gun59.setRotationPoint(1.0F, 3.0F, 0.0F);
		barrelHandle.addChild(gun59);
		setRotationAngle(gun59, 0.0F, 0.0F, -2.3562F);
		gun59.cubeList.add(new ModelBox(gun59, 144, 147, -8.065F, -7.9236F, 26.4F, 1, 1, 3, 0.1F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(6.4272F, -4.2186F, 20.3418F);
		barrelPKM.addChild(bone6);
		setRotationAngle(bone6, 0.1555F, 0.1536F, 0.012F);
		

		gun171_r3 = new ModelRenderer(this);
		gun171_r3.setRotationPoint(0.0F, 0.0F, -0.8052F);
		bone6.addChild(gun171_r3);
		setRotationAngle(gun171_r3, 0.0F, 0.0F, 0.7854F);
		gun171_r3.cubeList.add(new ModelBox(gun171_r3, 170, 129, -0.9243F, -0.849F, 2.7033F, 1, 1, 2, 0.0F, false));
		gun171_r3.cubeList.add(new ModelBox(gun171_r3, 170, 152, -0.0757F, -0.849F, 2.7033F, 1, 1, 2, 0.0F, false));
		gun171_r3.cubeList.add(new ModelBox(gun171_r3, 170, 132, -0.9243F, -0.151F, 2.7033F, 1, 1, 2, 0.0F, false));
		gun171_r3.cubeList.add(new ModelBox(gun171_r3, 170, 155, -0.0757F, -0.151F, 2.7033F, 1, 1, 2, 0.0F, false));
		gun171_r3.cubeList.add(new ModelBox(gun171_r3, 144, 130, -0.0757F, -0.5F, -4.7033F, 1, 1, 9, 0.0F, false));
		gun171_r3.cubeList.add(new ModelBox(gun171_r3, 144, 106, -0.9243F, -0.5F, -4.7033F, 1, 1, 9, 0.0F, false));

		gun170_r3 = new ModelRenderer(this);
		gun170_r3.setRotationPoint(0.0F, 0.0F, -0.8052F);
		bone6.addChild(gun170_r3);
		setRotationAngle(gun170_r3, 0.7854F, 0.0F, 0.7854F);
		gun170_r3.cubeList.add(new ModelBox(gun170_r3, 158, 88, -0.0757F, 1.7254F, 2.926F, 1, 1, 1, 0.0F, false));
		gun170_r3.cubeList.add(new ModelBox(gun170_r3, 31, 157, -0.9243F, 1.7254F, 2.926F, 1, 1, 1, 0.0F, false));
		gun170_r3.cubeList.add(new ModelBox(gun170_r3, 96, 91, -0.9243F, 2.926F, 1.7254F, 1, 1, 1, 0.0F, false));
		gun170_r3.cubeList.add(new ModelBox(gun170_r3, 131, 155, -0.0757F, 2.926F, 1.7254F, 1, 1, 1, 0.0F, false));
		gun170_r3.cubeList.add(new ModelBox(gun170_r3, 156, 0, -0.0757F, -2.9722F, -3.6793F, 1, 1, 1, 0.0F, false));
		gun170_r3.cubeList.add(new ModelBox(gun170_r3, 156, 77, -0.0757F, -3.6793F, -2.9722F, 1, 1, 1, 0.0F, false));
		gun170_r3.cubeList.add(new ModelBox(gun170_r3, 0, 74, -0.9243F, -2.9722F, -3.6793F, 1, 1, 1, 0.0F, false));
		gun170_r3.cubeList.add(new ModelBox(gun170_r3, 7, 74, -0.9243F, -3.6793F, -2.9722F, 1, 1, 1, 0.0F, false));

		gun170_r4 = new ModelRenderer(this);
		gun170_r4.setRotationPoint(0.0F, 0.0F, -0.8052F);
		bone6.addChild(gun170_r4);
		setRotationAngle(gun170_r4, -0.0436F, 0.0F, 0.7854F);
		gun170_r4.cubeList.add(new ModelBox(gun170_r4, 171, 0, -0.0757F, 0.3803F, -3.9397F, 1, 1, 8, 0.0F, false));
		gun170_r4.cubeList.add(new ModelBox(gun170_r4, 170, 143, -0.9243F, 0.3803F, -3.9397F, 1, 1, 8, 0.0F, false));

		gun169_r2 = new ModelRenderer(this);
		gun169_r2.setRotationPoint(0.0F, 0.0F, -0.8052F);
		bone6.addChild(gun169_r2);
		setRotationAngle(gun169_r2, 0.0436F, 0.0F, 0.7854F);
		gun169_r2.cubeList.add(new ModelBox(gun169_r2, 171, 26, -0.0757F, -1.3803F, -3.9397F, 1, 1, 8, 0.0F, false));
		gun169_r2.cubeList.add(new ModelBox(gun169_r2, 170, 152, -0.9243F, -1.3803F, -3.9397F, 1, 1, 8, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		barrelPKM.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}