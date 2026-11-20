package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class XM16Handguard extends ModelBase {
	private final ModelRenderer handguard;
	private final ModelRenderer bone5;
	private final ModelRenderer bone4;
	private final ModelRenderer bone7;
	private final ModelRenderer bone9;
	private final ModelRenderer bone11;
	private final ModelRenderer bone13;
	private final ModelRenderer bone16;
	private final ModelRenderer bone24;
	private final ModelRenderer bone29;
	private final ModelRenderer bone23;
	private final ModelRenderer bone15;
	private final ModelRenderer bone12;
	private final ModelRenderer bone10;
	private final ModelRenderer bone8;
	private final ModelRenderer bone6;
	private final ModelRenderer bone30;
	private final ModelRenderer deltaring;
	private final ModelRenderer handguard205_r2;
	private final ModelRenderer handguard201_r1;
	private final ModelRenderer handguard199_r1;
	private final ModelRenderer handguard201_r2;
	private final ModelRenderer handguard200_r2;
	private final ModelRenderer handguard201_r3;
	private final ModelRenderer handguard203_r4;
	private final ModelRenderer handguard202_r4;
	private final ModelRenderer handguard202_r3;
	private final ModelRenderer handguard205_r1;
	private final ModelRenderer handguard200_r1;
	private final ModelRenderer handguard204_r3;
	private final ModelRenderer handguard203_r3;
	private final ModelRenderer handguard206_r1;
	private final ModelRenderer handguard203_r1;
	private final ModelRenderer handguard202_r2;
	private final ModelRenderer handguard203_r2;
	private final ModelRenderer handguard204_r2;
	private final ModelRenderer handguard202_r1;
	private final ModelRenderer handguard204_r1;

	public XM16Handguard() {
		textureWidth = 672;
		textureHeight = 672;

		handguard = new ModelRenderer(this);
		handguard.setRotationPoint(0.0F, 23.75F, 0.0F);
		

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-1.0F, -40.8F, -24.5F);
		handguard.addChild(bone5);
		setRotationAngle(bone5, 0.0175F, 0.0F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 10, 642, -1.0F, 0.035F, -5.0003F, 1, 2, 5, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 90, 656, -1.0F, 0.035F, -8.0003F, 1, 2, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 94, 656, -1.0F, 0.035F, -11.0003F, 1, 2, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 656, 95, -1.0F, 0.035F, -14.0003F, 1, 2, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 98, 656, -1.0F, 0.035F, -17.0003F, 1, 2, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 102, 656, -1.0F, 0.035F, -20.0003F, 1, 2, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 150, 656, -1.0F, 0.035F, -23.0003F, 1, 2, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 154, 656, -1.0F, 0.035F, -26.0003F, 1, 2, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 158, 656, -1.0F, 0.035F, -29.0003F, 1, 2, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 242, 656, -1.0F, 0.035F, -32.0003F, 1, 2, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 394, 652, -1.0F, 0.035F, -36.0003F, 1, 2, 2, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-1.0F, -40.8F, -24.5F);
		handguard.addChild(bone4);
		setRotationAngle(bone4, 0.0087F, 0.014F, -0.8901F);
		bone4.cubeList.add(new ModelBox(bone4, 622, 644, -1.028F, 0.0174F, -5.0003F, 1, 1, 5, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 658, 10, -1.028F, 0.0174F, -8.0003F, 1, 1, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 658, 12, -1.028F, 0.0174F, -20.0003F, 1, 1, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 14, 658, -1.028F, 0.0174F, -14.0003F, 1, 1, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 658, 14, -1.028F, 0.0174F, -26.0003F, 1, 1, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 658, 47, -1.028F, 0.0174F, -32.0003F, 1, 1, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 60, 658, -1.028F, 0.0174F, -11.0003F, 1, 1, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 64, 658, -1.028F, 0.0174F, -23.0003F, 1, 1, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 68, 658, -1.028F, 0.0174F, -17.0003F, 1, 1, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 658, 69, -1.028F, 0.0174F, -29.0003F, 1, 1, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 172, 654, -1.028F, 0.0174F, -36.0003F, 1, 1, 2, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 262, 523, -0.907F, 0.1364F, -34.9999F, 1, 1, 31, -0.12F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-0.2F, -40.2F, -24.5F);
		handguard.addChild(bone7);
		setRotationAngle(bone7, 0.0105F, 0.014F, -0.5061F);
		bone7.cubeList.add(new ModelBox(bone7, 472, 220, -2.028F, 0.021F, -36.0003F, 2, 2, 36, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.8F, -38.5F, -24.5F);
		handguard.addChild(bone9);
		setRotationAngle(bone9, 0.0105F, 0.014F, -0.2618F);
		bone9.cubeList.add(new ModelBox(bone9, 0, 483, -1.028F, 0.021F, -36.0003F, 1, 1, 36, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(1.42F, -36.2F, -24.5F);
		handguard.addChild(bone11);
		setRotationAngle(bone11, -0.0524F, 0.014F, -0.2618F);
		bone11.cubeList.add(new ModelBox(bone11, 406, 482, -2.028F, -0.1047F, -36.0029F, 2, 1, 36, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 326, 523, -2.028F, -1.1047F, -20.0029F, 2, 1, 20, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 648, 207, -1.028F, -2.1047F, -4.0029F, 1, 1, 4, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(1.68F, -35.2F, -24.5F);
		handguard.addChild(bone13);
		setRotationAngle(bone13, -0.0192F, 0.0515F, 0.6981F);
		bone13.cubeList.add(new ModelBox(bone13, 74, 486, -1.1029F, -0.0383F, -36.003F, 1, 1, 36, 0.0F, false));

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(1.05F, -34.43F, -24.5F);
		handguard.addChild(bone16);
		setRotationAngle(bone16, 0.0017F, 0.055F, 1.0821F);
		bone16.cubeList.add(new ModelBox(bone16, 148, 486, -1.1099F, 0.0034F, -36.003F, 1, 1, 36, 0.0F, false));

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(0.17F, -33.95F, -24.5F);
		handguard.addChild(bone24);
		setRotationAngle(bone24, 0.0209F, 0.0506F, 1.4661F);
		bone24.cubeList.add(new ModelBox(bone24, 472, 146, -3.1012F, 0.0417F, -36.003F, 3, 1, 36, 0.0F, false));

		bone29 = new ModelRenderer(this);
		bone29.setRotationPoint(-3.13F, -33.95F, -24.5F);
		handguard.addChild(bone29);
		setRotationAngle(bone29, 0.0209F, -0.0506F, -1.4661F);
		bone29.cubeList.add(new ModelBox(bone29, 472, 183, 0.1012F, 0.0417F, -36.003F, 3, 1, 36, 0.0F, false));

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(-4.05F, -34.43F, -24.5F);
		handguard.addChild(bone23);
		setRotationAngle(bone23, 0.0017F, -0.055F, -1.0821F);
		bone23.cubeList.add(new ModelBox(bone23, 222, 486, 0.1299F, 0.0034F, -36.003F, 1, 1, 36, 0.0F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(-4.68F, -35.22F, -24.5F);
		handguard.addChild(bone15);
		setRotationAngle(bone15, -0.0192F, -0.0515F, -0.6981F);
		bone15.cubeList.add(new ModelBox(bone15, 296, 486, 0.1029F, -0.0384F, -36.003F, 1, 1, 36, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(-4.42F, -36.2F, -24.5F);
		handguard.addChild(bone12);
		setRotationAngle(bone12, -0.0524F, -0.014F, 0.2618F);
		bone12.cubeList.add(new ModelBox(bone12, 482, 482, 0.028F, -0.1047F, -36.0029F, 2, 1, 36, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 558, 84, 0.028F, -1.1047F, -20.0029F, 2, 1, 20, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 460, 648, 0.028F, -2.1047F, -4.0029F, 1, 1, 4, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(-3.8F, -38.5F, -24.5F);
		handguard.addChild(bone10);
		setRotationAngle(bone10, 0.0105F, -0.014F, 0.2618F);
		bone10.cubeList.add(new ModelBox(bone10, 492, 439, 0.028F, 0.021F, -36.0003F, 1, 1, 36, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-2.8F, -40.2F, -24.5F);
		handguard.addChild(bone8);
		setRotationAngle(bone8, 0.0105F, -0.014F, 0.5061F);
		bone8.cubeList.add(new ModelBox(bone8, 472, 258, 0.028F, 0.021F, -36.0003F, 2, 2, 36, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-2.0F, -40.8F, -24.5F);
		handguard.addChild(bone6);
		setRotationAngle(bone6, 0.0087F, -0.014F, 0.8901F);
		bone6.cubeList.add(new ModelBox(bone6, 634, 644, 0.028F, 0.0174F, -5.0003F, 1, 1, 5, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 658, 71, 0.028F, 0.0174F, -8.0003F, 1, 1, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 72, 658, 0.028F, 0.0174F, -20.0003F, 1, 1, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 658, 73, 0.028F, 0.0174F, -14.0003F, 1, 1, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 658, 75, 0.028F, 0.0174F, -26.0003F, 1, 1, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 658, 77, 0.028F, 0.0174F, -32.0003F, 1, 1, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 658, 79, 0.028F, 0.0174F, -11.0003F, 1, 1, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 658, 100, 0.028F, 0.0174F, -23.0003F, 1, 1, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 658, 102, 0.028F, 0.0174F, -17.0003F, 1, 1, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 106, 658, 0.028F, 0.0174F, -29.0003F, 1, 1, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 178, 654, 0.028F, 0.0174F, -36.0003F, 1, 1, 2, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 548, 220, -0.093F, 0.1374F, -34.9999F, 1, 1, 31, -0.12F, false));

		bone30 = new ModelRenderer(this);
		bone30.setRotationPoint(-0.9F, -33.85F, -24.5F);
		handguard.addChild(bone30);
		setRotationAngle(bone30, -0.0489F, 0.0F, 0.0F);
		bone30.cubeList.add(new ModelBox(bone30, 432, 581, -1.0F, -2.0978F, -23.0024F, 1, 2, 23, 0.0F, false));
		bone30.cubeList.add(new ModelBox(bone30, 320, 582, -1.2F, -2.0988F, -23.0024F, 1, 2, 23, 0.0F, false));

		deltaring = new ModelRenderer(this);
		deltaring.setRotationPoint(0.6F, -37.25F, -26.0F);
		handguard.addChild(deltaring);
		

		handguard205_r2 = new ModelRenderer(this);
		handguard205_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		deltaring.addChild(handguard205_r2);
		setRotationAngle(handguard205_r2, 0.0436F, 0.096F, 0.4538F);
		handguard205_r2.cubeList.add(new ModelBox(handguard205_r2, 448, 650, -1.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard201_r1 = new ModelRenderer(this);
		handguard201_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		deltaring.addChild(handguard201_r1);
		setRotationAngle(handguard201_r1, 0.0F, 0.1047F, 0.0F);
		handguard201_r1.cubeList.add(new ModelBox(handguard201_r1, 650, 550, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard199_r1 = new ModelRenderer(this);
		handguard199_r1.setRotationPoint(-2.6F, -2.6F, 0.0F);
		deltaring.addChild(handguard199_r1);
		setRotationAngle(handguard199_r1, 0.1047F, 0.0F, 0.0F);
		handguard199_r1.cubeList.add(new ModelBox(handguard199_r1, 650, 554, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard201_r2 = new ModelRenderer(this);
		handguard201_r2.setRotationPoint(-2.6F, -2.6F, 0.0F);
		deltaring.addChild(handguard201_r2);
		setRotationAngle(handguard201_r2, 0.0925F, 0.0524F, -0.4538F);
		handguard201_r2.cubeList.add(new ModelBox(handguard201_r2, 650, 558, -1.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard200_r2 = new ModelRenderer(this);
		handguard200_r2.setRotationPoint(-1.6F, -2.6F, 0.0F);
		deltaring.addChild(handguard200_r2);
		setRotationAngle(handguard200_r2, 0.0925F, -0.0524F, 0.4538F);
		handguard200_r2.cubeList.add(new ModelBox(handguard200_r2, 650, 562, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard201_r3 = new ModelRenderer(this);
		handguard201_r3.setRotationPoint(-1.6F, -2.6F, 0.0F);
		deltaring.addChild(handguard201_r3);
		setRotationAngle(handguard201_r3, 0.0925F, 0.0349F, 0.4538F);
		handguard201_r3.cubeList.add(new ModelBox(handguard201_r3, 650, 566, 0.2F, 0.0F, 0.05F, 1, 1, 3, 0.0F, false));

		handguard203_r4 = new ModelRenderer(this);
		handguard203_r4.setRotationPoint(0.0F, -1.0F, 0.0F);
		deltaring.addChild(handguard203_r4);
		setRotationAngle(handguard203_r4, 0.0349F, 0.096F, -0.4538F);
		handguard203_r4.cubeList.add(new ModelBox(handguard203_r4, 620, 650, -0.999F, -1.2F, 0.05F, 1, 1, 3, 0.0F, false));

		handguard202_r4 = new ModelRenderer(this);
		handguard202_r4.setRotationPoint(0.0F, -1.0F, 0.0F);
		deltaring.addChild(handguard202_r4);
		setRotationAngle(handguard202_r4, -0.0436F, 0.096F, -0.4538F);
		handguard202_r4.cubeList.add(new ModelBox(handguard202_r4, 650, 626, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard202_r3 = new ModelRenderer(this);
		handguard202_r3.setRotationPoint(-2.6F, 1.6F, 0.0F);
		deltaring.addChild(handguard202_r3);
		setRotationAngle(handguard202_r3, -0.0925F, 0.0524F, 0.4538F);
		handguard202_r3.cubeList.add(new ModelBox(handguard202_r3, 628, 650, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard205_r1 = new ModelRenderer(this);
		handguard205_r1.setRotationPoint(-4.2F, 0.0F, 0.0F);
		deltaring.addChild(handguard205_r1);
		setRotationAngle(handguard205_r1, -0.0349F, -0.096F, -0.4538F);
		handguard205_r1.cubeList.add(new ModelBox(handguard205_r1, 650, 630, -0.001F, 0.2F, 0.05F, 1, 1, 3, 0.0F, false));

		handguard200_r1 = new ModelRenderer(this);
		handguard200_r1.setRotationPoint(-2.6F, 1.6F, 0.0F);
		deltaring.addChild(handguard200_r1);
		setRotationAngle(handguard200_r1, -0.1047F, 0.0F, 0.0F);
		handguard200_r1.cubeList.add(new ModelBox(handguard200_r1, 650, 634, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard204_r3 = new ModelRenderer(this);
		handguard204_r3.setRotationPoint(-1.6F, 1.6F, 0.0F);
		deltaring.addChild(handguard204_r3);
		setRotationAngle(handguard204_r3, -0.0925F, 0.0349F, -0.4538F);
		handguard204_r3.cubeList.add(new ModelBox(handguard204_r3, 636, 650, 0.2F, -1.0F, 0.05F, 1, 1, 3, 0.0F, false));

		handguard203_r3 = new ModelRenderer(this);
		handguard203_r3.setRotationPoint(-1.6F, 1.6F, 0.0F);
		deltaring.addChild(handguard203_r3);
		setRotationAngle(handguard203_r3, -0.0925F, -0.0524F, -0.4538F);
		handguard203_r3.cubeList.add(new ModelBox(handguard203_r3, 650, 638, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard206_r1 = new ModelRenderer(this);
		handguard206_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		deltaring.addChild(handguard206_r1);
		setRotationAngle(handguard206_r1, -0.0349F, 0.096F, 0.4538F);
		handguard206_r1.cubeList.add(new ModelBox(handguard206_r1, 644, 650, -0.999F, 0.2F, 0.05F, 1, 1, 3, 0.0F, false));

		handguard203_r1 = new ModelRenderer(this);
		handguard203_r1.setRotationPoint(-4.2F, -1.0F, 0.0F);
		deltaring.addChild(handguard203_r1);
		setRotationAngle(handguard203_r1, -0.0436F, -0.096F, 0.4538F);
		handguard203_r1.cubeList.add(new ModelBox(handguard203_r1, 0, 651, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard202_r2 = new ModelRenderer(this);
		handguard202_r2.setRotationPoint(-4.2F, 0.0F, 0.0F);
		deltaring.addChild(handguard202_r2);
		setRotationAngle(handguard202_r2, 0.0F, -0.1047F, 0.0F);
		handguard202_r2.cubeList.add(new ModelBox(handguard202_r2, 112, 651, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard203_r2 = new ModelRenderer(this);
		handguard203_r2.setRotationPoint(-2.6F, 1.6F, 0.0F);
		deltaring.addChild(handguard203_r2);
		setRotationAngle(handguard203_r2, -0.0925F, -0.0349F, 0.4538F);
		handguard203_r2.cubeList.add(new ModelBox(handguard203_r2, 120, 651, -1.2F, -1.0F, 0.05F, 1, 1, 3, 0.0F, false));

		handguard204_r2 = new ModelRenderer(this);
		handguard204_r2.setRotationPoint(-4.2F, 0.0F, 0.0F);
		deltaring.addChild(handguard204_r2);
		setRotationAngle(handguard204_r2, 0.0436F, -0.096F, -0.4538F);
		handguard204_r2.cubeList.add(new ModelBox(handguard204_r2, 128, 651, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard202_r1 = new ModelRenderer(this);
		handguard202_r1.setRotationPoint(-2.6F, -2.6F, 0.0F);
		deltaring.addChild(handguard202_r1);
		setRotationAngle(handguard202_r1, 0.0925F, -0.0349F, -0.4538F);
		handguard202_r1.cubeList.add(new ModelBox(handguard202_r1, 136, 651, -1.2F, 0.0F, 0.05F, 1, 1, 3, 0.0F, false));

		handguard204_r1 = new ModelRenderer(this);
		handguard204_r1.setRotationPoint(-4.2F, -1.0F, 0.0F);
		deltaring.addChild(handguard204_r1);
		setRotationAngle(handguard204_r1, 0.0349F, -0.096F, 0.4538F);
		handguard204_r1.cubeList.add(new ModelBox(handguard204_r1, 144, 651, -0.001F, -1.2F, 0.05F, 1, 1, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handguard.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}