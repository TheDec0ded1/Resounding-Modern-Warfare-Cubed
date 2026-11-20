package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SVU extends ModelWithAttachments {
	private final ModelRenderer gun;
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
	private final ModelRenderer gun2;
	private final ModelRenderer dustcover;
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
	private final ModelRenderer cube_r54;
	private final ModelRenderer cube_r55;
	private final ModelRenderer cube_r56;
	private final ModelRenderer cube_r57;
	private final ModelRenderer cube_r58;
	private final ModelRenderer cube_r59;
	private final ModelRenderer cube_r60;
	private final ModelRenderer cube_r61;

	public SVU() {
		textureWidth = 350;
		textureHeight = 350;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, -11.0F, 3.0F);
		gun.cubeList.add(new ModelBox(gun, 44, 117, -3.5F, 5.9F, 23.0F, 4, 1, 14, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 34, 285, -3.3F, -0.1F, -17.2F, 4, 5, 19, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 49, 300, -1.3F, -0.1F, -21.2F, 2, 3, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 10, 72, -2.5F, 4.75F, -18.0F, 2, 3, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 58, 10, -2.5F, 4.25F, -10.0F, 2, 4, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 62, 136, -3.7F, 2.0F, 37.0F, 1, 4, 11, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 56, 72, -3.7F, 6.0F, 37.0F, 1, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -3.7F, 1.25F, 2.0F, 1, 1, 46, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 137, 20, -3.7F, 2.0F, 21.0F, 1, 4, 16, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 87, 14, -3.85F, 3.0F, 33.9F, 1, 2, 1, 0.002F, false));
		gun.cubeList.add(new ModelBox(gun, 91, 76, -3.7F, 2.0F, 20.0F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 48, 0, -3.7F, 2.0F, 2.0F, 1, 2, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 113, 19, -3.0F, 4.0F, 2.0F, 3, 1, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 181, 186, -3.5F, 2.0F, 10.0F, 4, 2, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 60, 178, -3.7F, 4.0F, 10.0F, 1, 1, 11, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 91, 54, -3.7F, 6.0F, 21.3F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 121, 99, -3.1F, 6.9F, 21.3F, 3, 3, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 137, 0, -0.3F, 2.0F, 21.0F, 1, 4, 16, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 10, 58, -0.2F, 2.6F, 32.9F, 1, 2, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 79, 117, 0.2F, 2.0F, 33.1F, 1, 1, 4, -0.199F, false));
		gun.cubeList.add(new ModelBox(gun, 26, 68, 0.2F, 2.6F, 36.1F, 1, 2, 1, -0.198F, false));
		gun.cubeList.add(new ModelBox(gun, 72, 65, 0.2F, 2.0F, 32.7F, 1, 1, 1, -0.198F, false));
		gun.cubeList.add(new ModelBox(gun, 72, 44, 0.2F, 3.8F, 32.7F, 1, 1, 1, -0.198F, false));
		gun.cubeList.add(new ModelBox(gun, 66, 117, 0.2F, 3.8F, 33.1F, 1, 1, 4, -0.199F, false));
		gun.cubeList.add(new ModelBox(gun, 82, 20, 0.2F, 2.0F, 28.6F, 1, 1, 2, -0.199F, false));
		gun.cubeList.add(new ModelBox(gun, 82, 23, 0.2F, 3.8F, 28.6F, 1, 1, 2, -0.199F, false));
		gun.cubeList.add(new ModelBox(gun, 30, 102, 0.2F, 2.0F, 23.6F, 1, 1, 5, -0.199F, false));
		gun.cubeList.add(new ModelBox(gun, 121, 52, 0.2F, 3.8F, 23.6F, 1, 1, 5, -0.199F, false));
		gun.cubeList.add(new ModelBox(gun, 32, 113, 0.2F, 2.0F, 19.2F, 1, 1, 4, -0.199F, false));
		gun.cubeList.add(new ModelBox(gun, 115, 82, 0.2F, 3.8F, 19.2F, 1, 1, 4, -0.199F, false));
		gun.cubeList.add(new ModelBox(gun, 66, 117, -0.2F, 2.4F, 19.4F, 1, 2, 11, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 107, 135, -0.3F, 2.0F, 37.0F, 1, 4, 11, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 191, 192, -3.0F, 1.0F, 47.0F, 3, 5, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 93, 28, -0.3F, 2.0F, 14.0F, 1, 2, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 68, 56, -0.3F, 3.0F, 2.0F, 1, 1, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 70, 87, -0.3F, 2.0F, 8.0F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 112, 111, -0.3F, 4.0F, 10.0F, 1, 1, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 179, 85, -0.3F, 1.25F, 8.0F, 1, 1, 40, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 4, 4, 0.3F, 3.55F, -6.2F, 1, 1, 41, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 170, 122, 0.3F, 5.55F, 28.8F, 1, 1, 7, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 179, 85, 0.3F, 2.552F, -5.6F, 1, 1, 40, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 211, 117, 0.3F, 4.552F, 28.4F, 1, 1, 7, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 19, 143, -0.3F, 0.25F, 2.0F, 1, 1, 6, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 143, -0.3F, 1.05F, 2.0F, 1, 1, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 88, 142, -0.55F, 2.05F, 2.0F, 1, 1, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 62, 39, -3.3F, 6.0F, 37.0F, 4, 1, 3, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 136, 155, -3.7F, 6.0F, 40.0F, 1, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 111, 146, -3.3F, 6.0F, 40.0F, 4, 1, 3, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 56, 72, -3.7F, 6.0F, 43.0F, 1, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 62, 39, -3.3F, 6.0F, 43.0F, 4, 1, 3, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 107, 84, -3.7F, 6.0F, 46.0F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 63, 40, -3.3F, 6.0F, 46.0F, 4, 1, 2, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 82, 87, -0.3F, 6.0F, 21.3F, 1, 1, 2, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.3F, 5.0F, -24.7F);
		gun.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.7679F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 91, 73, 0.0F, -33.9033F, 34.9191F, 1, 2, 1, -0.001F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 91, 82, -3.4F, -33.9033F, 34.9191F, 1, 2, 1, -0.001F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.3F, 5.0F, -11.0F);
		gun.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.6283F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 76, 87, 0.0F, -27.5949F, 38.0089F, 1, 1, 2, -0.001F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 91, 47, -3.4F, -27.5949F, 38.0089F, 1, 1, 2, -0.001F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.7F, 1.0F, -40.0F);
		gun.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.6458F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 27, 137, -2.2037F, 0.5972F, 42.0F, 1, 1, 6, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.7F, 0.05F, -40.0F);
		gun.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.6458F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 138, 139, 0.2037F, 1.5972F, 42.0F, 1, 1, 6, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-0.3F, 3.0F, -38.0F);
		gun.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.3491F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 46, 72, 0.0F, -15.5391F, 42.7888F, 1, 1, 3, -0.001F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 36, 80, -3.4F, -15.5391F, 42.7888F, 1, 1, 3, -0.001F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-0.3F, 5.0F, -26.7F);
		gun.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.8552F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 48, 31, -3.0F, -36.9136F, 29.0006F, 4, 2, 4, -0.003F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 68, -3.4F, -36.9136F, 30.0006F, 1, 2, 3, -0.002F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.7F, 0.0F, -40.0F);
		gun.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.2618F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 92, 93, -13.4233F, 2.0F, 45.3644F, 1, 1, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-0.15F, 6.0F, -24.9F);
		gun.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.3491F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 37, 93, -0.8F, 18.2979F, 43.4206F, 1, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 44, 93, -3.1F, 18.2979F, 43.4206F, 1, 1, 1, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-2.4F, 7.9F, -25.6F);
		gun.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.4712F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 84, 0, -0.2F, 23.5719F, 41.8612F, 2, 2, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-3.9F, 3.9F, -24.7F);
		gun.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.2967F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 86, 28, 0.0F, -12.121F, 45.4874F, 1, 1, 1, -0.1F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-3.7F, 0.0F, -28.0F);
		gun.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, -0.2094F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 59, 20, 9.9779F, 2.0F, 44.9515F, 1, 2, 2, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.7F, 0.0F, -34.0F);
		gun.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.2094F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 22, 47, -10.9779F, 2.0F, 44.9515F, 1, 2, 2, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.7F, 0.0F, -38.0F);
		gun.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, -0.2094F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 37, 47, 8.9779F, 2.0F, 46.9515F, 1, 2, 2, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-3.7F, 0.0F, -38.0F);
		gun.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.2094F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 71, 9, -9.9779F, 2.0F, 46.9515F, 1, 2, 2, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.7F, 2.0F, -46.0F);
		gun.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, 0.6109F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 58, 0.1472F, 1.6383F, 48.0F, 1, 1, 8, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 48, 10, 0.1472F, 1.8383F, 48.0F, 1, 1, 8, -0.001F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-3.7F, 2.0F, -46.0F);
		gun.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, -0.6109F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 46, 68, -1.1472F, 1.8383F, 48.0F, 1, 1, 8, -0.001F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 68, 47, -1.1472F, 1.6383F, 48.0F, 1, 1, 8, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-4.2F, 0.2F, -18.1F);
		gun.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.192F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 46, 57, -0.05F, 11.1227F, 38.7363F, 1, 2, 8, -0.3F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 68, 0.35F, 11.1227F, 38.7363F, 1, 2, 8, -0.001F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-3.95F, 2.9F, -13.6F);
		gun.addChild(cube_r18);
		setRotationAngle(cube_r18, -0.0349F, 0.0F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 113, 99, 0.0F, -0.6761F, 42.0406F, 1, 1, 6, 0.001F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-3.85F, 3.4F, -13.4F);
		gun.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.0349F, 0.0F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 93, 9, 0.0F, -1.6761F, 41.0406F, 1, 2, 7, 0.001F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-4.25F, 1.4F, -13.0F);
		gun.addChild(cube_r20);
		setRotationAngle(cube_r20, -0.3142F, 0.0F, 0.0F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 14, 47, 0.0F, -12.9326F, 44.2682F, 1, 2, 2, -0.2F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-3.95F, 0.9F, -13.7F);
		gun.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.1222F, 0.0F, 0.0F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 44, 117, 0.0F, 7.8361F, 41.3983F, 1, 1, 6, -0.001F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-3.85F, 1.4F, -3.5F);
		gun.addChild(cube_r22);
		setRotationAngle(cube_r22, -0.1047F, 0.0F, 0.0F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 44, 104, 0.0F, -3.0274F, 40.9462F, 1, 1, 7, 0.001F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-3.85F, 0.6F, -3.5F);
		gun.addChild(cube_r23);
		setRotationAngle(cube_r23, -0.0349F, 0.0F, 0.0F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 68, 47, 0.0F, 0.0239F, 41.0406F, 1, 1, 3, -0.001F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 92, 111, 0.0F, 0.3239F, 41.0406F, 1, 1, 7, 0.0F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-0.05F, 2.2F, -15.2F);
		gun.addChild(cube_r24);
		setRotationAngle(cube_r24, -0.3665F, 0.0F, 0.0F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 32, 70, -0.15F, -14.8336F, 44.5289F, 1, 1, 1, 0.0F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-0.15F, 0.8F, -3.5F);
		gun.addChild(cube_r25);
		setRotationAngle(cube_r25, -0.3665F, 0.0F, 0.0F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 4, 73, -0.15F, -14.8336F, 44.5289F, 1, 1, 1, 0.1F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-3.85F, 0.6F, -3.5F);
		gun.addChild(cube_r26);
		setRotationAngle(cube_r26, -0.3665F, 0.0F, 0.0F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 87, 17, -0.2F, -14.8336F, 44.5289F, 1, 1, 1, 0.0F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(-3.85F, 0.6F, -13.5F);
		gun.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.1222F, 0.0F, 0.0F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 113, 0.0F, 7.8361F, 40.3983F, 1, 1, 7, 0.0F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-1.0F, 10.65F, -11.2F);
		gun.addChild(cube_r28);
		setRotationAngle(cube_r28, 2.3038F, 0.0F, 0.0F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 68, 56, -1.5F, 0.2676F, 0.2973F, 2, 3, 1, -0.001F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(-1.0F, 10.55F, -16.2F);
		gun.addChild(cube_r29);
		setRotationAngle(cube_r29, 1.5533F, 0.0F, 0.0F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 38, 0, -1.5F, -0.007F, 0.3999F, 2, 5, 1, 0.0F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(-1.0F, 8.15F, -18.0F);
		gun.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.6283F, 0.0F, 0.0F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 68, 60, -1.5F, -0.3236F, 0.2351F, 2, 3, 1, -0.001F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(-1.0F, 4.75F, -17.3F);
		gun.addChild(cube_r31);
		setRotationAngle(cube_r31, -0.0873F, 0.0F, 0.0F);
		

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(0.0F, 6.45F, -12.7F);
		gun.addChild(cube_r32);
		setRotationAngle(cube_r32, -0.3491F, 0.0F, 0.0F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 63, 0, -2.0F, -0.3759F, -0.1368F, 1, 2, 1, -0.001F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(0.0F, 4.55F, -14.0F);
		gun.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.4538F, 0.0F, 0.0F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 10, 58, -2.0F, -0.3595F, 0.1754F, 1, 3, 1, 0.0F, false));

		gun2 = new ModelRenderer(this);
		gun2.setRotationPoint(0.0F, 0.0F, 8.0F);
		gun.addChild(gun2);
		gun2.cubeList.add(new ModelBox(gun2, 82, 20, 0.2F, 0.0F, -19.4F, 1, 1, 2, -0.199F, false));
		gun2.cubeList.add(new ModelBox(gun2, 82, 23, 0.2F, 1.8F, -19.4F, 1, 1, 2, -0.199F, false));
		gun2.cubeList.add(new ModelBox(gun2, 30, 102, 0.2F, 0.0F, -24.4F, 1, 1, 5, -0.199F, false));
		gun2.cubeList.add(new ModelBox(gun2, 121, 52, 0.2F, 1.8F, -24.4F, 1, 1, 5, -0.199F, false));
		gun2.cubeList.add(new ModelBox(gun2, 32, 113, 0.2F, 0.0F, -28.8F, 1, 1, 4, -0.199F, false));
		gun2.cubeList.add(new ModelBox(gun2, 115, 82, 0.2F, 1.8F, -28.8F, 1, 1, 4, -0.199F, false));
		gun2.cubeList.add(new ModelBox(gun2, 66, 117, -0.2F, 0.4F, -28.6F, 1, 2, 11, 0.0F, false));

		dustcover = new ModelRenderer(this);
		dustcover.setRotationPoint(0.0F, -4.0F, -3.0F);
		gun.addChild(dustcover);
		dustcover.cubeList.add(new ModelBox(dustcover, 91, 44, -2.0F, 1.0F, 5.0F, 1, 1, 43, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 86, 20, -2.0F, 0.8F, 39.0F, 1, 1, 1, 0.001F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 84, 44, -2.0F, 0.8F, 26.0F, 1, 1, 1, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 40, 84, -2.0F, 0.8F, 31.0F, 1, 1, 1, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 0, 179, -0.1F, 4.8F, 11.0F, 1, 1, 40, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 62, 136, -1.1F, 4.8F, 48.0F, 2, 1, 3, 0.1F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 0, 87, -3.9F, 4.8F, 48.0F, 3, 1, 3, 0.101F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 0, 68, -3.9F, 4.8F, 33.0F, 4, 1, 18, 0.001F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 56, 68, -0.1F, 3.8F, 47.5F, 1, 1, 3, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 45, 135, -0.1F, 3.8F, 5.0F, 1, 1, 41, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 92, 111, -3.9F, 3.8F, 32.5F, 1, 1, 18, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 106, 155, -4.2F, 4.3F, 34.0F, 1, 1, 13, -0.2F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 220, 126, 0.2F, 4.3F, 12.0F, 1, 1, 33, -0.2F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 91, 63, -3.9F, 3.8F, 5.0F, 1, 2, 1, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 46, 47, -4.1F, 3.6F, 24.3F, 1, 1, 9, -0.201F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 80, 14, -2.0F, 0.8F, 17.0F, 1, 1, 1, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 76, 65, -2.0F, 0.8F, 9.9F, 1, 1, 1, 0.0F, false));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(-1.85F, -0.5F, 1.0F);
		dustcover.addChild(cube_r34);
		setRotationAngle(cube_r34, -1.0472F, 0.0F, 0.0F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 52, 87, -1.0F, -40.5693F, 25.732F, 1, 1, 2, -0.001F, false));

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(-0.15F, -0.5F, 1.0F);
		dustcover.addChild(cube_r35);
		setRotationAngle(cube_r35, -1.0472F, 0.0F, 0.0F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 46, 62, -2.0F, -40.5693F, 25.732F, 2, 1, 2, 0.0F, false));

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(-0.15F, -0.5F, 1.0F);
		dustcover.addChild(cube_r36);
		setRotationAngle(cube_r36, -1.0472F, 0.0F, -0.2094F);
		cube_r36.cubeList.add(new ModelBox(cube_r36, 58, 87, -1.4157F, -40.5911F, 25.6941F, 1, 1, 2, -0.001F, false));

		cube_r37 = new ModelRenderer(this);
		cube_r37.setRotationPoint(-2.85F, -0.5F, 1.0F);
		dustcover.addChild(cube_r37);
		setRotationAngle(cube_r37, -1.0472F, 0.0F, 0.2094F);
		cube_r37.cubeList.add(new ModelBox(cube_r37, 64, 87, 0.4157F, -40.5911F, 25.6941F, 1, 1, 2, -0.001F, false));

		cube_r38 = new ModelRenderer(this);
		cube_r38.setRotationPoint(-2.85F, -0.5F, -25.9F);
		dustcover.addChild(cube_r38);
		setRotationAngle(cube_r38, 0.6109F, 0.0F, 0.2094F);
		cube_r38.cubeList.add(new ModelBox(cube_r38, 60, 31, 0.1157F, 29.8355F, 38.1962F, 1, 3, 1, -0.001F, false));

		cube_r39 = new ModelRenderer(this);
		cube_r39.setRotationPoint(-2.85F, -0.5F, -37.0F);
		dustcover.addChild(cube_r39);
		setRotationAngle(cube_r39, -1.2741F, 0.0F, 0.2094F);
		cube_r39.cubeList.add(new ModelBox(cube_r39, 16, 58, 0.4157F, -42.2808F, 15.2042F, 1, 3, 1, -0.001F, false));
		cube_r39.cubeList.add(new ModelBox(cube_r39, 16, 32, 0.4157F, -45.0308F, 15.9042F, 1, 6, 1, 0.0F, false));

		cube_r40 = new ModelRenderer(this);
		cube_r40.setRotationPoint(-2.85F, -0.5F, -25.0F);
		dustcover.addChild(cube_r40);
		setRotationAngle(cube_r40, 0.0F, 0.0F, 0.2094F);
		cube_r40.cubeList.add(new ModelBox(cube_r40, 181, 172, 0.1157F, 1.6563F, 35.0F, 1, 1, 13, -0.3F, false));
		cube_r40.cubeList.add(new ModelBox(cube_r40, 121, 91, 0.4157F, 1.9563F, 31.0F, 1, 1, 5, 0.001F, false));
		cube_r40.cubeList.add(new ModelBox(cube_r40, 91, 66, 0.4157F, 1.9563F, 30.0F, 1, 2, 1, 0.001F, false));
		cube_r40.cubeList.add(new ModelBox(cube_r40, 83, 82, 0.4157F, 1.9563F, 47.3F, 1, 1, 2, 0.001F, false));
		cube_r40.cubeList.add(new ModelBox(cube_r40, 224, 209, 0.4157F, 1.9563F, 49.0F, 1, 2, 25, 0.0F, false));

		cube_r41 = new ModelRenderer(this);
		cube_r41.setRotationPoint(-2.95F, -0.6F, -37.1F);
		dustcover.addChild(cube_r41);
		setRotationAngle(cube_r41, 0.0F, 0.0F, 0.2094F);
		cube_r41.cubeList.add(new ModelBox(cube_r41, 78, 62, 0.4157F, 1.9563F, 47.0F, 1, 1, 1, 0.0F, false));
		cube_r41.cubeList.add(new ModelBox(cube_r41, 84, 56, 0.4157F, 1.9563F, 63.1F, 1, 2, 1, 0.0F, false));
		cube_r41.cubeList.add(new ModelBox(cube_r41, 85, 64, 0.4157F, 1.9563F, 68.1F, 1, 2, 1, 0.0F, false));
		cube_r41.cubeList.add(new ModelBox(cube_r41, 86, 9, 0.4157F, 1.9563F, 76.1F, 1, 2, 1, 0.0F, false));

		cube_r42 = new ModelRenderer(this);
		cube_r42.setRotationPoint(-2.0F, -1.2F, -38.1F);
		dustcover.addChild(cube_r42);
		setRotationAngle(cube_r42, 0.0F, 0.0F, 0.9948F);
		cube_r42.cubeList.add(new ModelBox(cube_r42, 78, 53, 1.6773F, 1.0893F, 48.0F, 1, 1, 1, 0.0F, false));
		cube_r42.cubeList.add(new ModelBox(cube_r42, 80, 44, 1.6773F, 1.0893F, 55.1F, 1, 1, 1, 0.0F, false));
		cube_r42.cubeList.add(new ModelBox(cube_r42, 82, 62, 1.6773F, 1.0893F, 64.1F, 1, 1, 1, 0.0F, false));
		cube_r42.cubeList.add(new ModelBox(cube_r42, 84, 3, 1.6773F, 1.0893F, 69.1F, 1, 1, 1, 0.0F, false));

		cube_r43 = new ModelRenderer(this);
		cube_r43.setRotationPoint(-1.0F, -1.2F, -38.1F);
		dustcover.addChild(cube_r43);
		setRotationAngle(cube_r43, 0.0F, 0.0F, -0.9948F);
		cube_r43.cubeList.add(new ModelBox(cube_r43, 76, 44, -2.6773F, 1.0893F, 48.0F, 1, 1, 1, 0.0F, false));
		cube_r43.cubeList.add(new ModelBox(cube_r43, 79, 68, -2.6773F, 1.0893F, 55.1F, 1, 1, 1, 0.0F, false));
		cube_r43.cubeList.add(new ModelBox(cube_r43, 82, 53, -2.6773F, 1.0893F, 64.1F, 1, 1, 1, 0.0F, false));
		cube_r43.cubeList.add(new ModelBox(cube_r43, 82, 31, -2.6773F, 1.0893F, 69.1F, 1, 1, 1, 0.0F, false));

		cube_r44 = new ModelRenderer(this);
		cube_r44.setRotationPoint(-0.05F, -0.6F, -37.1F);
		dustcover.addChild(cube_r44);
		setRotationAngle(cube_r44, 0.0F, 0.0F, -0.2094F);
		cube_r44.cubeList.add(new ModelBox(cube_r44, 74, 24, -1.4157F, 1.9563F, 47.0F, 1, 2, 1, 0.0F, false));
		cube_r44.cubeList.add(new ModelBox(cube_r44, 78, 47, -1.4157F, 1.9563F, 54.1F, 1, 2, 1, 0.0F, false));
		cube_r44.cubeList.add(new ModelBox(cube_r44, 84, 47, -1.4157F, 1.9563F, 76.1F, 1, 2, 1, 0.0F, false));
		cube_r44.cubeList.add(new ModelBox(cube_r44, 80, 9, -1.4157F, 1.9563F, 68.1F, 1, 2, 1, 0.0F, false));
		cube_r44.cubeList.add(new ModelBox(cube_r44, 78, 56, -1.4157F, 1.9563F, 63.1F, 1, 2, 1, 0.0F, false));

		cube_r45 = new ModelRenderer(this);
		cube_r45.setRotationPoint(-1.0F, -1.2F, -9.0F);
		dustcover.addChild(cube_r45);
		setRotationAngle(cube_r45, 0.0F, 0.0F, -1.0297F);
		cube_r45.cubeList.add(new ModelBox(cube_r45, 80, 65, -2.7143F, 1.0302F, 48.0F, 1, 1, 1, 0.0F, false));

		cube_r46 = new ModelRenderer(this);
		cube_r46.setRotationPoint(-0.15F, -0.5F, -1.0F);
		dustcover.addChild(cube_r46);
		setRotationAngle(cube_r46, 0.0F, 0.0F, -0.2094F);
		cube_r46.cubeList.add(new ModelBox(cube_r46, 0, 47, -1.4157F, 1.9563F, 6.0F, 1, 2, 44, 0.0F, false));

		cube_r47 = new ModelRenderer(this);
		cube_r47.setRotationPoint(-1.0F, -1.0F, -1.0F);
		dustcover.addChild(cube_r47);
		setRotationAngle(cube_r47, 0.0F, 0.0F, -1.0297F);
		cube_r47.cubeList.add(new ModelBox(cube_r47, 46, 47, -2.7143F, 1.0302F, 6.0F, 1, 1, 43, 0.0F, false));

		cube_r48 = new ModelRenderer(this);
		cube_r48.setRotationPoint(-2.0F, -1.0F, -1.0F);
		dustcover.addChild(cube_r48);
		setRotationAngle(cube_r48, 0.0F, 0.0F, 1.0297F);
		cube_r48.cubeList.add(new ModelBox(cube_r48, 48, 0, 1.7143F, 1.0302F, 6.0F, 1, 1, 43, 0.0F, false));

		cube_r49 = new ModelRenderer(this);
		cube_r49.setRotationPoint(-3.8F, 1.8F, 2.5F);
		dustcover.addChild(cube_r49);
		setRotationAngle(cube_r49, 0.4538F, 0.0F, 0.0F);
		cube_r49.cubeList.add(new ModelBox(cube_r49, 85, 93, -0.1F, 22.94F, 41.265F, 1, 1, 1, -0.002F, false));
		cube_r49.cubeList.add(new ModelBox(cube_r49, 78, 93, -0.1F, 22.84F, 41.265F, 1, 1, 1, -0.001F, false));
		cube_r49.cubeList.add(new ModelBox(cube_r49, 0, 42, 0.7F, 22.94F, 41.265F, 4, 1, 1, -0.003F, false));
		cube_r49.cubeList.add(new ModelBox(cube_r49, 10, 42, 0.7F, 22.84F, 41.265F, 4, 1, 1, 0.001F, false));

		cube_r50 = new ModelRenderer(this);
		cube_r50.setRotationPoint(0.0F, 1.8F, 2.5F);
		dustcover.addChild(cube_r50);
		setRotationAngle(cube_r50, -0.9076F, 0.0F, 0.0F);
		cube_r50.cubeList.add(new ModelBox(cube_r50, 64, 44, -3.0F, -36.5941F, 30.1267F, 3, 1, 1, -0.001F, false));

		cube_r51 = new ModelRenderer(this);
		cube_r51.setRotationPoint(0.9F, 1.8F, 2.5F);
		dustcover.addChild(cube_r51);
		setRotationAngle(cube_r51, 0.0F, -0.4887F, 0.5934F);
		cube_r51.cubeList.add(new ModelBox(cube_r51, 52, 93, 22.1224F, 1.6581F, 40.9563F, 1, 1, 1, -0.001F, false));

		cube_r52 = new ModelRenderer(this);
		cube_r52.setRotationPoint(-3.9F, 1.8F, 2.5F);
		dustcover.addChild(cube_r52);
		setRotationAngle(cube_r52, 0.0F, 0.4887F, -0.5934F);
		cube_r52.cubeList.add(new ModelBox(cube_r52, 56, 93, -23.1224F, 1.6581F, 40.9563F, 1, 1, 1, -0.001F, false));

		cube_r53 = new ModelRenderer(this);
		cube_r53.setRotationPoint(-3.9F, 1.8F, -42.0F);
		dustcover.addChild(cube_r53);
		setRotationAngle(cube_r53, 0.0F, 0.0F, -0.5934F);
		cube_r53.cubeList.add(new ModelBox(cube_r53, 32, 68, -1.1184F, 1.6581F, 47.0F, 2, 1, 1, 0.0F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 222, 171, -1.1184F, 1.6581F, 66.5F, 2, 1, 25, 0.0F, false));

		cube_r54 = new ModelRenderer(this);
		cube_r54.setRotationPoint(0.9F, 1.8F, -0.95F);
		dustcover.addChild(cube_r54);
		setRotationAngle(cube_r54, 0.0F, 0.0F, 0.5934F);
		cube_r54.cubeList.add(new ModelBox(cube_r54, 93, 132, -0.8816F, 1.6581F, 5.95F, 2, 1, 41, 0.0F, false));
		cube_r54.cubeList.add(new ModelBox(cube_r54, 79, 81, -0.3816F, 1.6581F, 46.75F, 1, 1, 2, -0.001F, false));
		cube_r54.cubeList.add(new ModelBox(cube_r54, 0, 63, -0.8816F, 1.6581F, 48.45F, 2, 1, 2, 0.0F, false));

		cube_r55 = new ModelRenderer(this);
		cube_r55.setRotationPoint(0.9F, 2.8F, -0.95F);
		dustcover.addChild(cube_r55);
		setRotationAngle(cube_r55, 0.7854F, 0.0F, 0.0F);
		cube_r55.cubeList.add(new ModelBox(cube_r55, 52, 10, -1.0F, 35.3554F, 32.5268F, 1, 1, 1, -0.001F, false));

		cube_r56 = new ModelRenderer(this);
		cube_r56.setRotationPoint(0.9F, 2.8F, -1.55F);
		dustcover.addChild(cube_r56);
		setRotationAngle(cube_r56, -0.7854F, 0.0F, 0.0F);
		cube_r56.cubeList.add(new ModelBox(cube_r56, 68, 65, -1.0F, -32.527F, 34.3553F, 1, 1, 1, -0.001F, false));

		cube_r57 = new ModelRenderer(this);
		cube_r57.setRotationPoint(0.7F, 2.8F, -0.5F);
		dustcover.addChild(cube_r57);
		setRotationAngle(cube_r57, 0.0F, 0.0F, 1.1519F);
		cube_r57.cubeList.add(new ModelBox(cube_r57, 58, 15, -0.1729F, 0.8135F, 46.0F, 2, 1, 2, 0.0F, false));

		cube_r58 = new ModelRenderer(this);
		cube_r58.setRotationPoint(0.9F, 3.8F, -37.0F);
		dustcover.addChild(cube_r58);
		setRotationAngle(cube_r58, -0.6283F, 0.0F, 0.0F);
		cube_r58.cubeList.add(new ModelBox(cube_r58, 82, 28, -1.0F, -27.5949F, 38.0089F, 1, 1, 2, -0.001F, false));

		cube_r59 = new ModelRenderer(this);
		cube_r59.setRotationPoint(1.1F, 2.8F, 2.1F);
		dustcover.addChild(cube_r59);
		setRotationAngle(cube_r59, -0.5061F, 0.0F, 0.0F);
		cube_r59.cubeList.add(new ModelBox(cube_r59, 52, 0, -1.0F, -21.5197F, 41.9523F, 1, 1, 1, 0.0F, false));

		cube_r60 = new ModelRenderer(this);
		cube_r60.setRotationPoint(-2.0F, -1.0F, 0.0F);
		dustcover.addChild(cube_r60);
		setRotationAngle(cube_r60, -0.4712F, 0.0F, 0.0F);
		cube_r60.cubeList.add(new ModelBox(cube_r60, 69, 93, 0.0F, -20.0078F, 43.6771F, 1, 1, 1, 0.0F, false));

		cube_r61 = new ModelRenderer(this);
		cube_r61.setRotationPoint(-2.0F, -1.2F, -9.0F);
		dustcover.addChild(cube_r61);
		setRotationAngle(cube_r61, 0.0F, 0.0F, 1.0297F);
		cube_r61.cubeList.add(new ModelBox(cube_r61, 36, 84, 1.7143F, 1.0302F, 48.0F, 1, 1, 1, 0.0F, false));
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