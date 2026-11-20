package com.paneedah.mwc.models;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QJY88Barrel extends ModelBase {
	private final ModelRenderer barrel_standard;
	private final ModelRenderer ironSights;
	private final ModelRenderer frontsight;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer barrelHandle;
	private final ModelRenderer gun167_r3;
	private final ModelRenderer gun165_r1;
	private final ModelRenderer gun54;
	private final ModelRenderer gun170_r1;
	private final ModelRenderer gun172_r1;
	private final ModelRenderer gun171_r1;
	private final ModelRenderer gun170_r2;
	private final ModelRenderer gun172_r2;
	private final ModelRenderer gun166_r3;
	private final ModelRenderer gun166_r4;
	private final ModelRenderer gun163_r3;
	private final ModelRenderer gun55;
	private final ModelRenderer gun56;
	private final ModelRenderer gun57;
	private final ModelRenderer gun58;
	private final ModelRenderer gun59;
	private final ModelRenderer bone6;
	private final ModelRenderer bone17;
	private final ModelRenderer gun66;
	private final ModelRenderer gun164_r3;
	private final ModelRenderer gun163_r4;
	private final ModelRenderer gun67;
	private final ModelRenderer gun165_r2;
	private final ModelRenderer gun164_r4;
	private final ModelRenderer gun68;
	private final ModelRenderer gun165_r3;
	private final ModelRenderer gun69;
	private final ModelRenderer gun166_r5;
	private final ModelRenderer gun70;
	private final ModelRenderer gun168_r3;
	private final ModelRenderer gun71;
	private final ModelRenderer gun171_r2;
	private final ModelRenderer bone16;
	private final ModelRenderer gun60;
	private final ModelRenderer gun61;
	private final ModelRenderer gun62;
	private final ModelRenderer gun63;
	private final ModelRenderer gun64;
	private final ModelRenderer gun65;
	private final ModelRenderer bone4;
	private final ModelRenderer gun41;
	private final ModelRenderer gun42;
	private final ModelRenderer gun43;
	private final ModelRenderer gun45;
	private final ModelRenderer gun46;
	private final ModelRenderer gun47;
	private final ModelRenderer bone2;
	private final ModelRenderer gun_r1;
	private final ModelRenderer gun_r2;
	private final ModelRenderer gun_r3;
	private final ModelRenderer gun_r4;
	private final ModelRenderer gun_r5;
	private final ModelRenderer gun_r6;
	private final ModelRenderer gun_r7;
	private final ModelRenderer gun_r8;
	private final ModelRenderer gun_r9;
	private final ModelRenderer gun_r10;
	private final ModelRenderer gun_r11;
	private final ModelRenderer gun_r12;
	private final ModelRenderer gun_r13;
	private final ModelRenderer gun_r14;
	private final ModelRenderer gun_r15;
	private final ModelRenderer gun_r16;
	private final ModelRenderer gun_r17;
	private final ModelRenderer gun_r18;
	private final ModelRenderer gun_r19;
	private final ModelRenderer gun_r20;
	private final ModelRenderer gun_r21;
	private final ModelRenderer gun_r22;
	private final ModelRenderer gun_r23;
	private final ModelRenderer gun_r24;
	private final ModelRenderer gun_r25;
	private final ModelRenderer gun_r26;
	private final ModelRenderer gun_r27;
	private final ModelRenderer bone;
	private final ModelRenderer gun160_r1;
	private final ModelRenderer gun162_r1;
	private final ModelRenderer gun164_r1;
	private final ModelRenderer gun163_r1;
	private final ModelRenderer gun169_r1;
	private final ModelRenderer gun168_r1;
	private final ModelRenderer gun167_r1;
	private final ModelRenderer gun166_r1;

	public QJY88Barrel() {
		textureWidth = 512;
		textureHeight = 512;

		barrel_standard = new ModelRenderer(this);
		barrel_standard.setRotationPoint(0.0F, 20.25F, 5.0F);
		

		ironSights = new ModelRenderer(this);
		ironSights.setRotationPoint(0.0F, 4.7F, -74.0F);
		barrel_standard.addChild(ironSights);
		

		frontsight = new ModelRenderer(this);
		frontsight.setRotationPoint(0.0F, 0.0F, 0.0F);
		ironSights.addChild(frontsight);
		frontsight.cubeList.add(new ModelBox(frontsight, 496, 249, -3.0F, -45.5F, -34.3F, 3, 2, 2, -0.3F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 320, 497, -3.0F, -44.5F, -33.3F, 3, 4, 1, -0.3F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 496, 408, -3.0F, -45.5F, -35.1F, 3, 2, 2, -0.3F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 496, 416, -3.0F, -42.5F, -34.3F, 3, 2, 2, -0.3F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 496, 412, -3.0F, -42.5F, -35.1F, 3, 2, 2, -0.3F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 312, 497, -3.0F, -44.5F, -35.1F, 3, 4, 1, -0.3F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 20, 481, -0.8893F, -47.5847F, -35.2F, 1, 3, 3, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 148, 484, -3.1225F, -47.5847F, -35.2F, 1, 3, 3, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 54, 452, -2.3117F, -48.4695F, -35.2F, 1, 1, 3, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 410, 500, -2.1117F, -48.4695F, -35.2F, 1, 1, 3, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 464, 500, -1.9117F, -48.4695F, -35.2F, 1, 1, 3, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 472, 500, -1.8117F, -48.4695F, -35.2F, 1, 1, 3, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 480, 156, -1.7F, -48.4695F, -35.2F, 1, 1, 3, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 202, 419, -2.0F, -46.0F, -34.55F, 1, 1, 1, -0.2F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 10, 498, -2.0F, -47.1F, -34.55F, 1, 2, 1, -0.4F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.2434F, -47.5595F, -34.2F);
		frontsight.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.7418F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 304, 497, -0.5F, -1.0F, -1.0F, 1, 2, 3, -0.4F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.7684F, -47.5595F, -34.2F);
		frontsight.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7418F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 296, 497, -0.5F, -1.0F, -1.0F, 1, 2, 3, -0.4F, false));

		barrelHandle = new ModelRenderer(this);
		barrelHandle.setRotationPoint(0.8201F, -37.9872F, -45.681F);
		barrel_standard.addChild(barrelHandle);
		

		gun167_r3 = new ModelRenderer(this);
		gun167_r3.setRotationPoint(-5.2919F, -0.5377F, -4.137F);
		barrelHandle.addChild(gun167_r3);
		setRotationAngle(gun167_r3, 0.0F, 0.0F, -0.7854F);
		gun167_r3.cubeList.add(new ModelBox(gun167_r3, 334, 506, -0.5929F, -0.2696F, 0.9053F, 1, 1, 1, -0.2F, false));
		gun167_r3.cubeList.add(new ModelBox(gun167_r3, 506, 332, -0.3929F, -0.2696F, 0.9053F, 1, 1, 1, -0.2F, false));
		gun167_r3.cubeList.add(new ModelBox(gun167_r3, 506, 330, -0.5929F, 0.4304F, 0.1053F, 1, 1, 1, -0.2F, false));
		gun167_r3.cubeList.add(new ModelBox(gun167_r3, 330, 506, -0.3929F, 0.4304F, 0.1053F, 1, 1, 1, -0.2F, false));

		gun165_r1 = new ModelRenderer(this);
		gun165_r1.setRotationPoint(-5.5821F, -0.8279F, -4.1387F);
		barrelHandle.addChild(gun165_r1);
		setRotationAngle(gun165_r1, 0.0F, 0.0F, -0.7854F);
		gun165_r1.cubeList.add(new ModelBox(gun165_r1, 326, 506, -0.5929F, 1.8304F, -2.0947F, 1, 1, 1, -0.2F, false));
		gun165_r1.cubeList.add(new ModelBox(gun165_r1, 322, 506, -0.3929F, 1.8304F, -2.0947F, 1, 1, 1, -0.2F, false));

		gun54 = new ModelRenderer(this);
		gun54.setRotationPoint(-2.8201F, -11.1128F, -28.519F);
		barrelHandle.addChild(gun54);
		gun54.cubeList.add(new ModelBox(gun54, 124, 500, 0.0F, 11.65F, 22.4F, 1, 1, 3, 0.1F, false));
		gun54.cubeList.add(new ModelBox(gun54, 500, 127, 0.0F, 13.3471F, 22.4F, 1, 1, 3, 0.1F, false));

		gun170_r1 = new ModelRenderer(this);
		gun170_r1.setRotationPoint(-2.4718F, 10.575F, 24.382F);
		gun54.addChild(gun170_r1);
		setRotationAngle(gun170_r1, 0.0F, 0.0F, -0.7854F);
		gun170_r1.cubeList.add(new ModelBox(gun170_r1, 354, 497, -0.4992F, -0.3821F, 0.0053F, 1, 1, 2, -0.2F, false));
		gun170_r1.cubeList.add(new ModelBox(gun170_r1, 282, 503, -0.5F, -0.2055F, 1.0023F, 1, 1, 1, -0.2F, false));
		gun170_r1.cubeList.add(new ModelBox(gun170_r1, 438, 175, -0.5F, -2.7821F, -0.0803F, 1, 4, 2, -0.3F, false));
		gun170_r1.cubeList.add(new ModelBox(gun170_r1, 244, 509, -0.4981F, -0.3849F, -0.3651F, 1, 1, 1, -0.2F, false));
		gun170_r1.cubeList.add(new ModelBox(gun170_r1, 248, 509, -0.4981F, 0.1998F, -0.2401F, 1, 1, 1, -0.2F, false));

		gun172_r1 = new ModelRenderer(this);
		gun172_r1.setRotationPoint(-4.48F, 8.5674F, 24.3281F);
		gun54.addChild(gun172_r1);
		setRotationAngle(gun172_r1, -1.0472F, 0.0F, -0.7854F);
		gun172_r1.cubeList.add(new ModelBox(gun172_r1, 424, 505, -0.5F, -3.0F, -0.5F, 1, 2, 2, -0.3F, false));

		gun171_r1 = new ModelRenderer(this);
		gun171_r1.setRotationPoint(-4.5687F, 8.4787F, 25.1465F);
		gun54.addChild(gun171_r1);
		setRotationAngle(gun171_r1, -0.5672F, 0.0F, -0.7854F);
		gun171_r1.cubeList.add(new ModelBox(gun171_r1, 418, 505, -0.4993F, -1.0F, -0.5F, 1, 2, 2, -0.3F, false));

		gun170_r2 = new ModelRenderer(this);
		gun170_r2.setRotationPoint(-2.4718F, 10.575F, 23.982F);
		gun54.addChild(gun170_r2);
		setRotationAngle(gun170_r2, -0.2618F, 0.0F, -0.7854F);
		gun170_r2.cubeList.add(new ModelBox(gun170_r2, 372, 505, -0.4992F, -1.8391F, -0.097F, 1, 2, 1, -0.3F, false));

		gun172_r2 = new ModelRenderer(this);
		gun172_r2.setRotationPoint(-2.3878F, 10.6596F, 25.9467F);
		gun54.addChild(gun172_r2);
		setRotationAngle(gun172_r2, 0.0F, 0.0F, -0.7854F);
		gun172_r2.cubeList.add(new ModelBox(gun172_r2, 430, 505, -0.4995F, -4.7821F, 0.3197F, 1, 2, 2, -0.3F, false));

		gun166_r3 = new ModelRenderer(this);
		gun166_r3.setRotationPoint(-2.7621F, 10.2848F, 24.3803F);
		gun54.addChild(gun166_r3);
		setRotationAngle(gun166_r3, 0.0F, 0.0F, -0.7854F);
		gun166_r3.cubeList.add(new ModelBox(gun166_r3, 220, 505, -0.4979F, 1.7821F, -2.2803F, 1, 2, 2, -0.2F, false));
		gun166_r3.cubeList.add(new ModelBox(gun166_r3, 82, 496, -0.4969F, 1.2052F, -0.8824F, 1, 2, 2, -0.2F, false));

		gun166_r4 = new ModelRenderer(this);
		gun166_r4.setRotationPoint(-2.4718F, 10.575F, 24.382F);
		gun54.addChild(gun166_r4);
		setRotationAngle(gun166_r4, -0.829F, 0.0F, -0.7854F);
		gun166_r4.cubeList.add(new ModelBox(gun166_r4, 48, 496, -0.5002F, -1.1272F, 0.4559F, 1, 2, 1, -0.2F, false));
		gun166_r4.cubeList.add(new ModelBox(gun166_r4, 256, 498, -0.5F, -1.1272F, 0.8559F, 1, 2, 1, -0.2F, false));

		gun163_r3 = new ModelRenderer(this);
		gun163_r3.setRotationPoint(-2.7621F, 10.2848F, 24.3803F);
		gun54.addChild(gun163_r3);
		setRotationAngle(gun163_r3, -0.829F, 0.0F, -0.7854F);
		gun163_r3.cubeList.add(new ModelBox(gun163_r3, 420, 486, -0.5F, 0.0729F, -0.1441F, 1, 3, 2, -0.2F, false));

		gun55 = new ModelRenderer(this);
		gun55.setRotationPoint(-3.8201F, -10.1128F, -28.519F);
		barrelHandle.addChild(gun55);
		gun55.cubeList.add(new ModelBox(gun55, 344, 500, 0.1515F, 11.4985F, 22.4F, 1, 1, 3, 0.1F, false));
		gun55.cubeList.add(new ModelBox(gun55, 352, 500, 1.8485F, 11.4985F, 22.4F, 1, 1, 3, 0.1F, false));

		gun56 = new ModelRenderer(this);
		gun56.setRotationPoint(-3.8201F, -10.1128F, -28.519F);
		barrelHandle.addChild(gun56);
		setRotationAngle(gun56, 0.0F, 0.0F, -0.7854F);
		gun56.cubeList.add(new ModelBox(gun56, 500, 376, -7.9236F, 8.1964F, 22.4F, 1, 1, 3, 0.1F, false));

		gun57 = new ModelRenderer(this);
		gun57.setRotationPoint(-3.8201F, -9.1128F, -28.519F);
		barrelHandle.addChild(gun57);
		setRotationAngle(gun57, 0.0F, 0.0F, -0.7854F);
		gun57.cubeList.add(new ModelBox(gun57, 500, 380, -8.065F, 8.3378F, 22.4F, 1, 1, 3, 0.1F, false));

		gun58 = new ModelRenderer(this);
		gun58.setRotationPoint(-1.8201F, -11.1128F, -28.519F);
		barrelHandle.addChild(gun58);
		setRotationAngle(gun58, 0.0F, 0.0F, 0.7854F);
		gun58.cubeList.add(new ModelBox(gun58, 394, 500, 8.3378F, 8.1964F, 22.4F, 1, 1, 3, 0.1F, false));

		gun59 = new ModelRenderer(this);
		gun59.setRotationPoint(-1.8201F, -8.1128F, -28.519F);
		barrelHandle.addChild(gun59);
		setRotationAngle(gun59, 0.0F, 0.0F, -2.3562F);
		gun59.cubeList.add(new ModelBox(gun59, 402, 500, -8.065F, -7.9236F, 22.4F, 1, 1, 3, 0.1F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(3.6071F, -3.7314F, 6.3228F);
		barrelHandle.addChild(bone6);
		setRotationAngle(bone6, 0.1555F, 0.1536F, 0.012F);
		

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(-2.1667F, -42.3833F, -125.6F);
		barrel_standard.addChild(bone17);
		

		gun66 = new ModelRenderer(this);
		gun66.setRotationPoint(0.1667F, -1.1667F, 0.0F);
		bone17.addChild(gun66);
		

		gun164_r3 = new ModelRenderer(this);
		gun164_r3.setRotationPoint(0.5F, 7.5071F, 11.9F);
		gun66.addChild(gun164_r3);
		setRotationAngle(gun164_r3, 0.0873F, 0.0F, 0.0F);
		gun164_r3.cubeList.add(new ModelBox(gun164_r3, 82, 500, -0.5F, 0.2071F, -1.5F, 1, 1, 3, 0.0F, false));

		gun163_r4 = new ModelRenderer(this);
		gun163_r4.setRotationPoint(0.5F, 7.5071F, 11.9F);
		gun66.addChild(gun163_r4);
		setRotationAngle(gun163_r4, -0.0873F, 0.0F, 0.0F);
		gun163_r4.cubeList.add(new ModelBox(gun163_r4, 500, 35, -0.5F, -1.2071F, -1.5F, 1, 1, 3, 0.0F, false));

		gun67 = new ModelRenderer(this);
		gun67.setRotationPoint(-0.8333F, -0.1667F, 0.0F);
		bone17.addChild(gun67);
		

		gun165_r2 = new ModelRenderer(this);
		gun165_r2.setRotationPoint(1.5F, 6.5071F, 11.9F);
		gun67.addChild(gun165_r2);
		setRotationAngle(gun165_r2, 0.0F, -0.0873F, 0.0F);
		gun165_r2.cubeList.add(new ModelBox(gun165_r2, 500, 123, 0.2071F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));

		gun164_r4 = new ModelRenderer(this);
		gun164_r4.setRotationPoint(1.5F, 6.5071F, 11.9F);
		gun67.addChild(gun164_r4);
		setRotationAngle(gun164_r4, 0.0F, 0.0873F, 0.0F);
		gun164_r4.cubeList.add(new ModelBox(gun164_r4, 90, 500, -1.2071F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));

		gun68 = new ModelRenderer(this);
		gun68.setRotationPoint(-0.8333F, -0.1667F, 0.0F);
		bone17.addChild(gun68);
		setRotationAngle(gun68, 0.0F, 0.0F, -0.7854F);
		

		gun165_r3 = new ModelRenderer(this);
		gun165_r3.setRotationPoint(-3.5406F, 5.6619F, 16.9F);
		gun68.addChild(gun165_r3);
		setRotationAngle(gun165_r3, -0.0873F, 0.0F, 0.0F);
		gun165_r3.cubeList.add(new ModelBox(gun165_r3, 470, 124, -0.5F, -0.7713F, -6.481F, 1, 1, 1, 0.0F, false));

		gun69 = new ModelRenderer(this);
		gun69.setRotationPoint(-0.8333F, 0.8333F, 0.0F);
		bone17.addChild(gun69);
		setRotationAngle(gun69, 0.0F, 0.0F, -0.7854F);
		

		gun166_r5 = new ModelRenderer(this);
		gun166_r5.setRotationPoint(-2.8335F, 4.9548F, 16.9F);
		gun69.addChild(gun166_r5);
		setRotationAngle(gun166_r5, 0.0F, 0.0873F, 0.0F);
		gun166_r5.cubeList.add(new ModelBox(gun166_r5, 494, 450, -0.7713F, -0.5F, -6.481F, 1, 1, 1, 0.0F, false));

		gun70 = new ModelRenderer(this);
		gun70.setRotationPoint(1.1667F, -1.1667F, 0.0F);
		bone17.addChild(gun70);
		setRotationAngle(gun70, 0.0F, 0.0F, 0.7854F);
		

		gun168_r3 = new ModelRenderer(this);
		gun168_r3.setRotationPoint(4.9548F, 5.6619F, 16.9F);
		gun70.addChild(gun168_r3);
		setRotationAngle(gun168_r3, -0.0873F, 0.0F, 0.0F);
		gun168_r3.cubeList.add(new ModelBox(gun168_r3, 48, 499, -0.5F, -0.7713F, -6.481F, 1, 1, 1, 0.0F, false));

		gun71 = new ModelRenderer(this);
		gun71.setRotationPoint(1.1667F, 1.8333F, 0.0F);
		bone17.addChild(gun71);
		setRotationAngle(gun71, 0.0F, 0.0F, -2.3562F);
		

		gun171_r2 = new ModelRenderer(this);
		gun171_r2.setRotationPoint(-2.8335F, -3.5406F, 16.9F);
		gun71.addChild(gun171_r2);
		setRotationAngle(gun171_r2, 0.0F, 0.0873F, 0.0F);
		gun171_r2.cubeList.add(new ModelBox(gun171_r2, 196, 501, -0.7713F, -0.5F, -6.481F, 1, 1, 1, 0.0F, false));

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(-2.0F, -43.4F, -122.1F);
		barrel_standard.addChild(bone16);
		

		gun60 = new ModelRenderer(this);
		gun60.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone16.addChild(gun60);
		

		gun61 = new ModelRenderer(this);
		gun61.setRotationPoint(-1.0F, 1.0F, 0.0F);
		bone16.addChild(gun61);
		

		gun62 = new ModelRenderer(this);
		gun62.setRotationPoint(-1.0F, 1.0F, 0.0F);
		bone16.addChild(gun62);
		setRotationAngle(gun62, 0.0F, 0.0F, -0.7854F);
		

		gun63 = new ModelRenderer(this);
		gun63.setRotationPoint(-1.0F, 2.0F, 0.0F);
		bone16.addChild(gun63);
		setRotationAngle(gun63, 0.0F, 0.0F, -0.7854F);
		

		gun64 = new ModelRenderer(this);
		gun64.setRotationPoint(1.0F, 0.0F, 0.0F);
		bone16.addChild(gun64);
		setRotationAngle(gun64, 0.0F, 0.0F, 0.7854F);
		

		gun65 = new ModelRenderer(this);
		gun65.setRotationPoint(1.0F, 3.0F, 0.0F);
		bone16.addChild(gun65);
		setRotationAngle(gun65, 0.0F, 0.0F, -2.3562F);
		

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-2.0F, -47.6F, -97.1F);
		barrel_standard.addChild(bone4);
		

		gun41 = new ModelRenderer(this);
		gun41.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone4.addChild(gun41);
		gun41.cubeList.add(new ModelBox(gun41, 448, 498, 0.0F, 10.225F, -12.1F, 1, 1, 3, 0.05F, false));
		gun41.cubeList.add(new ModelBox(gun41, 498, 456, 0.0F, 11.7806F, -12.1F, 1, 1, 3, 0.05F, false));
		gun41.cubeList.add(new ModelBox(gun41, 446, 507, 0.0F, 10.225F, 20.9F, 1, 1, 1, 0.05F, false));
		gun41.cubeList.add(new ModelBox(gun41, 506, 505, 0.0F, 11.7806F, 20.9F, 1, 1, 1, 0.05F, false));
		gun41.cubeList.add(new ModelBox(gun41, 460, 507, 0.0F, 11.7806F, 17.9F, 1, 1, 1, 0.05F, false));
		gun41.cubeList.add(new ModelBox(gun41, 450, 507, 0.0F, 10.225F, 17.9F, 1, 1, 1, 0.05F, false));

		gun42 = new ModelRenderer(this);
		gun42.setRotationPoint(-1.0F, 1.0F, 0.0F);
		bone4.addChild(gun42);
		gun42.cubeList.add(new ModelBox(gun42, 498, 460, 0.2222F, 10.0028F, -12.1F, 1, 1, 3, 0.05F, false));
		gun42.cubeList.add(new ModelBox(gun42, 378, 499, 1.7778F, 10.0028F, -12.1F, 1, 1, 3, 0.05F, false));
		gun42.cubeList.add(new ModelBox(gun42, 506, 503, 0.2222F, 10.0028F, 20.9F, 1, 1, 1, 0.05F, false));
		gun42.cubeList.add(new ModelBox(gun42, 506, 497, 1.7778F, 10.0028F, 20.9F, 1, 1, 1, 0.05F, false));
		gun42.cubeList.add(new ModelBox(gun42, 468, 507, 1.7778F, 10.0028F, 17.9F, 1, 1, 1, 0.05F, false));
		gun42.cubeList.add(new ModelBox(gun42, 464, 507, 0.2222F, 10.0028F, 17.9F, 1, 1, 1, 0.05F, false));

		gun43 = new ModelRenderer(this);
		gun43.setRotationPoint(-1.0F, 1.0F, 0.0F);
		bone4.addChild(gun43);
		setRotationAngle(gun43, 0.0F, 0.0F, -0.7854F);
		gun43.cubeList.add(new ModelBox(gun43, 386, 499, -6.8659F, 7.2095F, -12.1F, 1, 1, 3, 0.05F, false));
		gun43.cubeList.add(new ModelBox(gun43, 506, 495, -6.8659F, 7.2095F, 20.9F, 1, 1, 1, 0.05F, false));
		gun43.cubeList.add(new ModelBox(gun43, 472, 507, -6.8659F, 7.2095F, 17.9F, 1, 1, 1, 0.05F, false));

		gun45 = new ModelRenderer(this);
		gun45.setRotationPoint(-1.0F, 2.0F, 0.0F);
		bone4.addChild(gun45);
		setRotationAngle(gun45, 0.0F, 0.0F, -0.7854F);
		gun45.cubeList.add(new ModelBox(gun45, 456, 499, -6.9367F, 7.2802F, -12.1F, 1, 1, 3, 0.05F, false));
		gun45.cubeList.add(new ModelBox(gun45, 506, 493, -6.9367F, 7.2802F, 20.9F, 1, 1, 1, 0.05F, false));
		gun45.cubeList.add(new ModelBox(gun45, 506, 507, -6.9367F, 7.2802F, 17.9F, 1, 1, 1, 0.05F, false));

		gun46 = new ModelRenderer(this);
		gun46.setRotationPoint(1.0F, 0.0F, 0.0F);
		bone4.addChild(gun46);
		setRotationAngle(gun46, 0.0F, 0.0F, 0.7854F);
		gun46.cubeList.add(new ModelBox(gun46, 500, 27, 7.2802F, 7.2095F, -12.1F, 1, 1, 3, 0.05F, false));
		gun46.cubeList.add(new ModelBox(gun46, 506, 462, 7.2802F, 7.2095F, 20.9F, 1, 1, 1, 0.05F, false));
		gun46.cubeList.add(new ModelBox(gun46, 508, 27, 7.2802F, 7.2095F, 17.9F, 1, 1, 1, 0.05F, false));

		gun47 = new ModelRenderer(this);
		gun47.setRotationPoint(1.0F, 3.0F, 0.0F);
		bone4.addChild(gun47);
		setRotationAngle(gun47, 0.0F, 0.0F, -2.3562F);
		gun47.cubeList.add(new ModelBox(gun47, 500, 31, -6.9367F, -6.8659F, -12.1F, 1, 1, 3, 0.05F, false));
		gun47.cubeList.add(new ModelBox(gun47, 506, 460, -6.9367F, -6.8659F, 20.9F, 1, 1, 1, 0.05F, false));
		gun47.cubeList.add(new ModelBox(gun47, 508, 29, -6.9367F, -6.8659F, 17.9F, 1, 1, 1, 0.05F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, -9.7608F, -62.05F);
		barrel_standard.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 0, 150, -1.999F, -26.125F, -50.5F, 1, 1, 39, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 80, 172, -2.7061F, -26.8321F, -50.5F, 1, 1, 39, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 160, 172, -1.2919F, -26.8321F, -50.5F, 1, 1, 39, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 182, 132, -1.999F, -27.5392F, -50.5F, 1, 1, 39, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 132, 501, -1.999F, -26.125F, 25.5F, 1, 1, 3, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 114, 501, -2.7061F, -26.8321F, 25.5F, 1, 1, 3, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 106, 501, -1.2919F, -26.8321F, 25.5F, 1, 1, 3, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 98, 501, -1.999F, -27.5392F, 25.5F, 1, 1, 3, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 260, 490, -1.999F, -22.125F, -16.5F, 1, 1, 5, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 506, 103, -2.7061F, -22.8321F, -13.5F, 1, 1, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 506, 100, -1.2919F, -22.8321F, -13.5F, 1, 1, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 486, 493, -2.2919F, -25.8321F, -16.5F, 2, 4, 3, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 54, 445, -2.7061F, -25.8321F, -16.5F, 1, 4, 3, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 506, 97, -1.999F, -23.5392F, -13.5F, 1, 1, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 380, 190, -1.999F, -23.5392F, -8.5F, 1, 1, 31, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 0, 377, -1.2919F, -22.8321F, -8.5F, 1, 1, 31, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 376, 324, -2.7061F, -22.8321F, -8.5F, 1, 1, 31, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 206, 361, -1.999F, -22.125F, -8.5F, 1, 1, 31, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 196, 489, -1.999F, -22.2578F, -12.5F, 1, 1, 7, -0.1F, false));
		bone2.cubeList.add(new ModelBox(bone2, 180, 489, -2.5647F, -22.8235F, -12.5F, 1, 1, 7, -0.1F, false));
		bone2.cubeList.add(new ModelBox(bone2, 88, 487, -1.4333F, -22.8235F, -12.5F, 1, 1, 7, -0.1F, false));
		bone2.cubeList.add(new ModelBox(bone2, 270, 385, -1.999F, -23.3892F, -12.5F, 1, 1, 7, -0.1F, false));

		gun_r1 = new ModelRenderer(this);
		gun_r1.setRotationPoint(-2.9597F, -21.6629F, 15.0F);
		bone2.addChild(gun_r1);
		setRotationAngle(gun_r1, 0.0F, 0.0F, 0.7854F);
		gun_r1.cubeList.add(new ModelBox(gun_r1, 270, 361, -0.5F, -2.0F, -27.5F, 1, 1, 7, -0.1F, false));

		gun_r2 = new ModelRenderer(this);
		gun_r2.setRotationPoint(-0.7454F, -23.0771F, 15.0F);
		bone2.addChild(gun_r2);
		setRotationAngle(gun_r2, 0.0F, 0.0F, 0.7854F);
		gun_r2.cubeList.add(new ModelBox(gun_r2, 364, 200, -0.5F, 0.0F, -27.5F, 1, 1, 7, -0.1F, false));

		gun_r3 = new ModelRenderer(this);
		gun_r3.setRotationPoint(-2.2525F, -21.57F, 15.0F);
		bone2.addChild(gun_r3);
		setRotationAngle(gun_r3, 0.0F, 0.0F, 0.7854F);
		gun_r3.cubeList.add(new ModelBox(gun_r3, 270, 369, -0.5F, -1.0F, -27.5F, 1, 1, 7, -0.1F, false));

		gun_r4 = new ModelRenderer(this);
		gun_r4.setRotationPoint(-0.0383F, -22.9842F, 15.0F);
		bone2.addChild(gun_r4);
		setRotationAngle(gun_r4, 0.0F, 0.0F, 0.7854F);
		gun_r4.cubeList.add(new ModelBox(gun_r4, 270, 377, -0.5F, 1.0F, -27.5F, 1, 1, 7, -0.1F, false));

		gun_r5 = new ModelRenderer(this);
		gun_r5.setRotationPoint(-0.899F, -23.3321F, -15.0F);
		bone2.addChild(gun_r5);
		setRotationAngle(gun_r5, 1.5708F, 0.7854F, 1.5708F);
		gun_r5.cubeList.add(new ModelBox(gun_r5, 488, 500, -0.5F, -1.2071F, -2.0F, 1, 1, 3, 0.0F, false));
		gun_r5.cubeList.add(new ModelBox(gun_r5, 0, 501, 0.2071F, -0.5F, -2.0F, 1, 1, 3, 0.0F, false));
		gun_r5.cubeList.add(new ModelBox(gun_r5, 16, 501, -0.5F, 0.2071F, -2.0F, 1, 1, 3, 0.0F, false));
		gun_r5.cubeList.add(new ModelBox(gun_r5, 32, 501, -1.2071F, -0.5F, -2.0F, 1, 1, 3, 0.0F, false));

		gun_r6 = new ModelRenderer(this);
		gun_r6.setRotationPoint(-0.899F, -23.3321F, -15.0F);
		bone2.addChild(gun_r6);
		setRotationAngle(gun_r6, 0.0F, 1.5708F, 0.0F);
		gun_r6.cubeList.add(new ModelBox(gun_r6, 496, 500, 0.2071F, -0.5F, -2.0F, 1, 1, 3, 0.0F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 8, 501, -0.5F, 0.2071F, -2.0F, 1, 1, 3, 0.0F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 24, 501, -0.5F, -1.2071F, -2.0F, 1, 1, 3, 0.0F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 40, 501, -1.2071F, -0.5F, -2.0F, 1, 1, 3, 0.0F, false));

		gun_r7 = new ModelRenderer(this);
		gun_r7.setRotationPoint(0.0617F, -22.8928F, 19.0F);
		bone2.addChild(gun_r7);
		setRotationAngle(gun_r7, 0.0F, 0.0F, 0.7854F);
		gun_r7.cubeList.add(new ModelBox(gun_r7, 380, 222, -0.5F, 1.0F, -27.5F, 1, 1, 31, 0.0F, false));
		gun_r7.cubeList.add(new ModelBox(gun_r7, 486, 402, -0.5F, 1.0F, -35.5F, 1, 1, 5, 0.0F, false));

		gun_r8 = new ModelRenderer(this);
		gun_r8.setRotationPoint(-2.3525F, -21.4785F, 19.0F);
		bone2.addChild(gun_r8);
		setRotationAngle(gun_r8, 0.0F, 0.0F, 0.7854F);
		gun_r8.cubeList.add(new ModelBox(gun_r8, 380, 254, -0.5F, -1.0F, -27.5F, 1, 1, 31, 0.0F, false));
		gun_r8.cubeList.add(new ModelBox(gun_r8, 428, 318, -0.5F, -1.0F, -35.5F, 1, 1, 5, 0.0F, false));

		gun_r9 = new ModelRenderer(this);
		gun_r9.setRotationPoint(-0.6454F, -23.1857F, 19.0F);
		bone2.addChild(gun_r9);
		setRotationAngle(gun_r9, 0.0F, 0.0F, 0.7854F);
		gun_r9.cubeList.add(new ModelBox(gun_r9, 380, 286, -0.5F, 0.0F, -27.5F, 1, 1, 31, 0.0F, false));
		gun_r9.cubeList.add(new ModelBox(gun_r9, 506, 94, -0.5F, 0.0F, -32.5F, 1, 1, 2, 0.0F, false));

		gun_r10 = new ModelRenderer(this);
		gun_r10.setRotationPoint(-3.0597F, -21.7714F, 19.0F);
		bone2.addChild(gun_r10);
		setRotationAngle(gun_r10, 0.0F, 0.0F, 0.7854F);
		gun_r10.cubeList.add(new ModelBox(gun_r10, 392, 143, -0.5F, -2.0F, -27.5F, 1, 1, 31, 0.0F, false));
		gun_r10.cubeList.add(new ModelBox(gun_r10, 174, 498, -0.5F, -2.0F, -32.5F, 1, 1, 2, 0.0F, false));

		gun_r11 = new ModelRenderer(this);
		gun_r11.setRotationPoint(-3.0597F, -25.7714F, 26.0F);
		bone2.addChild(gun_r11);
		setRotationAngle(gun_r11, 0.0F, 0.0F, 0.7854F);
		gun_r11.cubeList.add(new ModelBox(gun_r11, 48, 501, -0.5F, -2.0F, -0.5F, 1, 1, 3, 0.0F, false));
		gun_r11.cubeList.add(new ModelBox(gun_r11, 100, 0, -0.5F, -2.0F, -76.5F, 1, 1, 49, 0.0F, false));

		gun_r12 = new ModelRenderer(this);
		gun_r12.setRotationPoint(-0.6454F, -27.1857F, 26.0F);
		bone2.addChild(gun_r12);
		setRotationAngle(gun_r12, 0.0F, 0.0F, 0.7854F);
		gun_r12.cubeList.add(new ModelBox(gun_r12, 56, 501, -0.5F, 0.0F, -0.5F, 1, 1, 3, 0.0F, false));
		gun_r12.cubeList.add(new ModelBox(gun_r12, 0, 100, -0.5F, 0.0F, -76.5F, 1, 1, 49, 0.0F, false));

		gun_r13 = new ModelRenderer(this);
		gun_r13.setRotationPoint(-2.3525F, -25.4785F, 26.0F);
		bone2.addChild(gun_r13);
		setRotationAngle(gun_r13, 0.0F, 0.0F, 0.7854F);
		gun_r13.cubeList.add(new ModelBox(gun_r13, 64, 501, -0.5F, -1.0F, -0.5F, 1, 1, 3, 0.0F, false));
		gun_r13.cubeList.add(new ModelBox(gun_r13, 0, 50, -0.5F, -1.0F, -76.5F, 1, 1, 49, 0.0F, false));

		gun_r14 = new ModelRenderer(this);
		gun_r14.setRotationPoint(0.0617F, -26.8928F, 26.0F);
		bone2.addChild(gun_r14);
		setRotationAngle(gun_r14, 0.0F, 0.0F, 0.7854F);
		gun_r14.cubeList.add(new ModelBox(gun_r14, 72, 501, -0.5F, 1.0F, -0.5F, 1, 1, 3, 0.0F, false));
		gun_r14.cubeList.add(new ModelBox(gun_r14, 0, 0, -0.5F, 1.0F, -76.5F, 1, 1, 49, 0.0F, false));

		gun_r15 = new ModelRenderer(this);
		gun_r15.setRotationPoint(-1.499F, -26.3321F, 6.5037F);
		bone2.addChild(gun_r15);
		setRotationAngle(gun_r15, -0.0087F, 0.0F, -1.5708F);
		gun_r15.cubeList.add(new ModelBox(gun_r15, 260, 38, -0.5F, 0.3642F, -17.9925F, 1, 1, 37, 0.0F, false));

		gun_r16 = new ModelRenderer(this);
		gun_r16.setRotationPoint(-1.499F, -25.783F, 6.5055F);
		bone2.addChild(gun_r16);
		setRotationAngle(gun_r16, 0.0056F, -0.0067F, 2.4434F);
		gun_r16.cubeList.add(new ModelBox(gun_r16, 228, 250, -1.0766F, -0.8393F, -17.9942F, 1, 1, 37, 0.0F, false));

		gun_r17 = new ModelRenderer(this);
		gun_r17.setRotationPoint(-1.499F, -25.783F, 6.5055F);
		bone2.addChild(gun_r17);
		setRotationAngle(gun_r17, 0.0056F, 0.0067F, 2.2689F);
		gun_r17.cubeList.add(new ModelBox(gun_r17, 152, 250, -0.697F, -0.907F, -17.999F, 1, 1, 37, 0.0F, false));

		gun_r18 = new ModelRenderer(this);
		gun_r18.setRotationPoint(-1.499F, -25.783F, 6.5055F);
		bone2.addChild(gun_r18);
		setRotationAngle(gun_r18, 0.0056F, -0.0067F, -2.2689F);
		gun_r18.cubeList.add(new ModelBox(gun_r18, 76, 250, -0.303F, -0.907F, -17.999F, 1, 1, 37, 0.0F, false));

		gun_r19 = new ModelRenderer(this);
		gun_r19.setRotationPoint(-1.499F, -25.783F, 6.5055F);
		bone2.addChild(gun_r19);
		setRotationAngle(gun_r19, 0.0056F, 0.0067F, -2.4434F);
		gun_r19.cubeList.add(new ModelBox(gun_r19, 240, 172, 0.0766F, -0.8393F, -17.9942F, 1, 1, 37, 0.0F, false));

		gun_r20 = new ModelRenderer(this);
		gun_r20.setRotationPoint(-1.499F, -26.8812F, 6.5055F);
		bone2.addChild(gun_r20);
		setRotationAngle(gun_r20, 0.0056F, -0.0067F, 0.8726F);
		gun_r20.cubeList.add(new ModelBox(gun_r20, 228, 212, -0.303F, -0.907F, -17.999F, 1, 1, 37, 0.0F, false));

		gun_r21 = new ModelRenderer(this);
		gun_r21.setRotationPoint(-1.499F, -26.8812F, 6.5055F);
		bone2.addChild(gun_r21);
		setRotationAngle(gun_r21, 0.0056F, 0.0067F, 0.6982F);
		gun_r21.cubeList.add(new ModelBox(gun_r21, 0, 228, 0.0766F, -0.8393F, -17.9942F, 1, 1, 37, 0.0F, false));

		gun_r22 = new ModelRenderer(this);
		gun_r22.setRotationPoint(-1.499F, -26.8812F, 6.5055F);
		bone2.addChild(gun_r22);
		setRotationAngle(gun_r22, 0.0056F, -0.0067F, -0.6982F);
		gun_r22.cubeList.add(new ModelBox(gun_r22, 152, 212, -1.0766F, -0.8393F, -17.9942F, 1, 1, 37, 0.0F, false));

		gun_r23 = new ModelRenderer(this);
		gun_r23.setRotationPoint(-1.499F, -26.3321F, 6.5037F);
		bone2.addChild(gun_r23);
		setRotationAngle(gun_r23, 0.0087F, 0.0F, -1.5708F);
		gun_r23.cubeList.add(new ModelBox(gun_r23, 76, 212, -0.5F, -1.3642F, -17.9925F, 1, 1, 37, 0.0F, false));

		gun_r24 = new ModelRenderer(this);
		gun_r24.setRotationPoint(-1.499F, -26.3321F, -1.4982F);
		bone2.addChild(gun_r24);
		setRotationAngle(gun_r24, 0.0F, 0.0F, -1.5708F);
		gun_r24.cubeList.add(new ModelBox(gun_r24, 494, 334, -0.5F, 0.2071F, -10.0018F, 1, 1, 4, 0.0F, false));

		gun_r25 = new ModelRenderer(this);
		gun_r25.setRotationPoint(-1.499F, -26.3321F, 6.5037F);
		bone2.addChild(gun_r25);
		setRotationAngle(gun_r25, -0.0087F, 0.0F, 0.0F);
		gun_r25.cubeList.add(new ModelBox(gun_r25, 200, 0, -0.5F, 0.3642F, -17.9925F, 1, 1, 37, 0.0F, false));

		gun_r26 = new ModelRenderer(this);
		gun_r26.setRotationPoint(-1.499F, -26.8812F, 6.5055F);
		bone2.addChild(gun_r26);
		setRotationAngle(gun_r26, 0.0056F, 0.0067F, -0.8726F);
		gun_r26.cubeList.add(new ModelBox(gun_r26, 0, 190, -0.697F, -0.907F, -17.999F, 1, 1, 37, 0.0F, false));

		gun_r27 = new ModelRenderer(this);
		gun_r27.setRotationPoint(-1.499F, -26.3321F, 6.5037F);
		bone2.addChild(gun_r27);
		setRotationAngle(gun_r27, 0.0087F, 0.0F, 0.0F);
		gun_r27.cubeList.add(new ModelBox(gun_r27, 184, 90, -0.5F, -1.3642F, -17.9925F, 1, 1, 37, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-3.9174F, -43.4091F, -43.0063F);
		barrel_standard.addChild(bone);
		setRotationAngle(bone, 0.0F, 0.0F, 2.3562F);
		bone.cubeList.add(new ModelBox(bone, 474, 452, 2.9119F, -0.2142F, -3.8937F, 2, 2, 10, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 180, 478, 2.9119F, -0.5142F, -3.8937F, 2, 1, 10, 0.002F, false));
		bone.cubeList.add(new ModelBox(bone, 506, 109, 2.9119F, -0.2142F, 6.0063F, 2, 2, 1, -0.001F, false));
		bone.cubeList.add(new ModelBox(bone, 506, 229, 2.9119F, -0.9142F, 6.0063F, 2, 1, 1, 0.001F, false));
		bone.cubeList.add(new ModelBox(bone, 506, 231, 2.9119F, -0.9142F, -3.8937F, 2, 1, 1, 0.001F, false));
		bone.cubeList.add(new ModelBox(bone, 506, 233, 2.9119F, -0.9142F, -1.3937F, 2, 1, 1, 0.001F, false));
		bone.cubeList.add(new ModelBox(bone, 506, 235, 2.9119F, -0.9142F, 1.1063F, 2, 1, 1, 0.001F, false));
		bone.cubeList.add(new ModelBox(bone, 506, 237, 2.9119F, -0.9142F, 3.6063F, 2, 1, 1, 0.001F, false));

		gun160_r1 = new ModelRenderer(this);
		gun160_r1.setRotationPoint(-3.9119F, 0.0642F, 4.6063F);
		bone.addChild(gun160_r1);
		setRotationAngle(gun160_r1, -0.6692F, 0.0F, 0.0F);
		gun160_r1.cubeList.add(new ModelBox(gun160_r1, 502, 491, 6.8238F, -1.6358F, 0.4911F, 2, 1, 1, 0.0F, false));

		gun162_r1 = new ModelRenderer(this);
		gun162_r1.setRotationPoint(-3.9119F, 0.0642F, -0.3937F);
		bone.addChild(gun162_r1);
		setRotationAngle(gun162_r1, -0.6692F, 0.0F, 0.0F);
		gun162_r1.cubeList.add(new ModelBox(gun162_r1, 504, 328, 6.8238F, -3.2488F, 2.5303F, 2, 1, 1, 0.0F, false));

		gun164_r1 = new ModelRenderer(this);
		gun164_r1.setRotationPoint(-3.9119F, 0.0642F, -2.8937F);
		bone.addChild(gun164_r1);
		setRotationAngle(gun164_r1, -0.6692F, 0.0F, 0.0F);
		gun164_r1.cubeList.add(new ModelBox(gun164_r1, 504, 448, 6.8238F, -3.2488F, 2.5303F, 2, 1, 1, 0.0F, false));

		gun163_r1 = new ModelRenderer(this);
		gun163_r1.setRotationPoint(-3.9119F, 0.0642F, -5.3937F);
		bone.addChild(gun163_r1);
		setRotationAngle(gun163_r1, -0.6692F, 0.0F, 0.0F);
		gun163_r1.cubeList.add(new ModelBox(gun163_r1, 504, 479, 6.8238F, -3.2488F, 2.5303F, 2, 1, 1, 0.0F, false));

		gun169_r1 = new ModelRenderer(this);
		gun169_r1.setRotationPoint(-3.9119F, 0.0642F, -6.8937F);
		bone.addChild(gun169_r1);
		setRotationAngle(gun169_r1, 0.6692F, 0.0F, 0.0F);
		gun169_r1.cubeList.add(new ModelBox(gun169_r1, 506, 39, 6.8238F, 1.7141F, 2.7442F, 2, 1, 1, 0.0F, false));

		gun168_r1 = new ModelRenderer(this);
		gun168_r1.setRotationPoint(-3.9119F, 0.0642F, -4.3937F);
		bone.addChild(gun168_r1);
		setRotationAngle(gun168_r1, 0.6692F, 0.0F, 0.0F);
		gun168_r1.cubeList.add(new ModelBox(gun168_r1, 506, 112, 6.8238F, 1.7141F, 2.7442F, 2, 1, 1, 0.0F, false));

		gun167_r1 = new ModelRenderer(this);
		gun167_r1.setRotationPoint(-3.9119F, 0.0642F, -1.8937F);
		bone.addChild(gun167_r1);
		setRotationAngle(gun167_r1, 0.6692F, 0.0F, 0.0F);
		gun167_r1.cubeList.add(new ModelBox(gun167_r1, 506, 225, 6.8238F, 1.7141F, 2.7442F, 2, 1, 1, 0.0F, false));

		gun166_r1 = new ModelRenderer(this);
		gun166_r1.setRotationPoint(-3.9119F, 0.0642F, 0.6063F);
		bone.addChild(gun166_r1);
		setRotationAngle(gun166_r1, 0.6692F, 0.0F, 0.0F);
		gun166_r1.cubeList.add(new ModelBox(gun166_r1, 506, 227, 6.8238F, 1.7141F, 2.7442F, 2, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		barrel_standard.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}