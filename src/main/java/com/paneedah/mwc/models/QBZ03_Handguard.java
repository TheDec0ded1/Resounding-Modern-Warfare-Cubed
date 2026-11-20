package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBZ03_Handguard extends ModelBase {
	private final ModelRenderer handguard;
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

	public QBZ03_Handguard() {
		textureWidth = 416;
		textureHeight = 416;

		handguard = new ModelRenderer(this);
		handguard.setRotationPoint(0.0F, 24.0F, 0.0F);
		handguard.cubeList.add(new ModelBox(handguard, 387, 177, -3.0F, -34.8F, -34.701F, 3, 1, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 238, 395, -1.816F, -34.527F, -35.701F, 2, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 245, 395, -3.184F, -34.527F, -35.701F, 2, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 246, 297, -2.842F, -40.1603F, -60.701F, 2, 1, 26, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 110, 344, -1.158F, -40.1603F, -60.701F, 1, 1, 26, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 392, 386, -4.0898F, -36.431F, -34.701F, 1, 1, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 382, 392, 0.0491F, -36.4468F, -34.701F, 1, 1, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 303, 297, -4.2332F, -38.1738F, -60.701F, 1, 3, 26, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 316, 0.2332F, -38.1738F, -60.701F, 1, 3, 26, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 393, 92, -1.806F, -39.9255F, -34.701F, 1, 1, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 392, 318, -2.3566F, -39.9572F, -34.701F, 1, 1, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 396, 352, -2.3566F, -39.9572F, -61.701F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 272, 390, -3.0F, -34.8F, -61.701F, 3, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 396, 337, 0.0491F, -36.4468F, -61.701F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 337, 396, -4.0898F, -36.431F, -61.701F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 327, 396, -1.806F, -39.9255F, -61.701F, 1, 1, 1, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-0.806F, -39.2184F, -61.701F);
		handguard.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.7854F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 396, 329, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 393, 88, -0.5F, -0.5F, 27.0F, 1, 1, 2, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-3.4489F, -36.7298F, -61.701F);
		handguard.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.3491F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 184, 393, -0.5F, -2.5F, 0.0F, 1, 3, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 389, 361, -0.5F, -2.5F, 27.0F, 1, 3, 2, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-2.3566F, -39.2501F, -61.701F);
		handguard.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 332, 396, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 389, 392, -0.5F, -0.5F, 27.0F, 1, 1, 2, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.3958F, -36.7174F, -61.701F);
		handguard.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 1.1781F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 390, 254, -2.5F, -0.5F, 0.0F, 3, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 387, 333, -2.5F, -0.5F, 27.0F, 3, 1, 2, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.4083F, -35.148F, -61.701F);
		handguard.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 0.3491F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 396, 340, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 336, 392, -0.5F, -0.5F, 27.0F, 1, 1, 2, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-3.4365F, -35.1604F, -61.701F);
		handguard.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 1.1781F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 396, 343, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 329, 392, -0.5F, -0.5F, 27.0F, 1, 1, 2, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, -34.5071F, -61.701F);
		handguard.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 0.7854F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 396, 346, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 392, 322, -0.5F, -0.5F, 27.0F, 1, 1, 2, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-3.0F, -34.5071F, -61.701F);
		handguard.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, 0.7854F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 396, 349, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 322, 392, -0.5F, -0.5F, 27.0F, 1, 1, 2, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-0.1695F, -39.4671F, -34.701F);
		handguard.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, 0.7854F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 335, 230, 0.0F, -0.5F, -26.0F, 1, 1, 26, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-0.158F, -39.4532F, -34.701F);
		handguard.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, 0.7854F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 55, 343, -0.5F, -0.5F, -26.0F, 1, 1, 26, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-2.8305F, -39.4671F, -35.701F);
		handguard.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, 0.7854F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 332, 327, -0.5F, 0.0F, -25.0F, 1, 1, 26, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-2.842F, -39.4532F, -35.701F);
		handguard.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, 0.7854F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 331, 263, -0.5F, -0.5F, -25.0F, 1, 1, 26, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-3.9343F, -37.533F, -59.701F);
		handguard.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, 0.3491F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 322, 396, -0.5F, -1.5F, -1.0F, 1, 1, 1, 0.0F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 170, 393, -0.5F, -1.5F, -0.5F, 1, 1, 2, 0.0F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 137, 393, -0.5F, -1.5F, 4.0F, 1, 1, 2, 0.0F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 393, 112, -0.5F, -1.5F, 8.5F, 1, 1, 2, 0.0F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 393, 104, -0.5F, -1.5F, 13.0F, 1, 1, 2, 0.0F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 393, 100, -0.5F, -1.5F, 17.5F, 1, 1, 2, 0.0F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 389, 20, -0.5F, -1.5F, 22.0F, 1, 1, 3, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.7633F, -38.0028F, -73.201F);
		handguard.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, -0.3491F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 396, 326, -0.5F, -1.0F, 12.5F, 1, 1, 1, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 177, 393, -0.5F, -1.0F, 13.0F, 1, 1, 2, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 393, 120, -0.5F, -1.0F, 17.5F, 1, 1, 2, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 393, 116, -0.5F, -1.0F, 22.0F, 1, 1, 2, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 393, 108, -0.5F, -1.0F, 26.55F, 1, 1, 2, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 393, 96, -0.5F, -1.0F, 31.0F, 1, 1, 2, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 389, 25, -0.5F, -1.0F, 35.5F, 1, 1, 3, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.5923F, -34.875F, -35.701F);
		handguard.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, 0.3491F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 222, 325, -0.5F, -0.5F, -25.0F, 1, 1, 26, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-3.5923F, -34.875F, -35.701F);
		handguard.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, -0.3491F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 277, 327, -0.5F, -0.5F, -25.0F, 1, 1, 26, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-3.184F, -34.2341F, -35.701F);
		handguard.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, 0.7854F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 396, 294, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(0.184F, -34.2341F, -34.701F);
		handguard.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, 0.7854F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 396, 297, -0.5F, -0.5F, -1.0F, 1, 1, 1, 0.0F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-2.6088F, -34.1341F, -36.349F);
		handguard.addChild(cube_r23);
		setRotationAngle(cube_r23, -0.0175F, 0.0F, 0.0F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 344, 191, 2.5F, -0.675F, -24.35F, 1, 1, 25, 0.0F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 55, 316, -0.2823F, -0.175F, -24.35F, 3, 1, 25, 0.0F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 293, 39, -1.2823F, -0.675F, -24.35F, 4, 1, 25, 0.0F, false));
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