package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FALhandguardAUS extends ModelBase {
	private final ModelRenderer handguardL1A1AUS;
	private final ModelRenderer handguard_r1;
	private final ModelRenderer handguard_r2;
	private final ModelRenderer handguard_r3;
	private final ModelRenderer handguard_r4;
	private final ModelRenderer handguard_r5;
	private final ModelRenderer handguard_r6;
	private final ModelRenderer handguard_r7;
	private final ModelRenderer handguard_r8;
	private final ModelRenderer bone186;
	private final ModelRenderer bone187;
	private final ModelRenderer bone188;
	private final ModelRenderer bone189;
	private final ModelRenderer bone190;
	private final ModelRenderer bone191;
	private final ModelRenderer bone192;
	private final ModelRenderer bone193;
	private final ModelRenderer bone194;
	private final ModelRenderer bone195;
	private final ModelRenderer bone196;
	private final ModelRenderer bone197;
	private final ModelRenderer bone198;

	public FALhandguardAUS() {
		textureWidth = 576;
		textureHeight = 576;

		handguardL1A1AUS = new ModelRenderer(this);
		handguardL1A1AUS.setRotationPoint(0.0F, 24.0F, 3.0F);
		handguardL1A1AUS.cubeList.add(new ModelBox(handguardL1A1AUS, 358, 236, -2.0F, -41.9587F, -66.5436F, 1, 1, 31, 0.0F, false));
		handguardL1A1AUS.cubeList.add(new ModelBox(handguardL1A1AUS, 192, 367, -4.739F, -37.8857F, -66.5436F, 1, 1, 31, 0.0F, false));
		handguardL1A1AUS.cubeList.add(new ModelBox(handguardL1A1AUS, 0, 370, 0.739F, -37.8857F, -66.5436F, 1, 1, 31, 0.0F, false));
		handguardL1A1AUS.cubeList.add(new ModelBox(handguardL1A1AUS, 302, 0, -2.9997F, -35.678F, -66.5436F, 3, 1, 31, 0.0F, false));
		handguardL1A1AUS.cubeList.add(new ModelBox(handguardL1A1AUS, 558, 32, -2.0F, -41.7087F, -35.6436F, 1, 2, 1, 0.0F, false));
		handguardL1A1AUS.cubeList.add(new ModelBox(handguardL1A1AUS, 558, 35, -4.399F, -38.6587F, -35.6436F, 1, 2, 1, 0.0F, false));
		handguardL1A1AUS.cubeList.add(new ModelBox(handguardL1A1AUS, 558, 38, 0.301F, -38.6587F, -35.6436F, 1, 2, 1, 0.0F, false));
		handguardL1A1AUS.cubeList.add(new ModelBox(handguardL1A1AUS, 534, 448, -3.5F, -39.4535F, -72.5382F, 4, 4, 6, 0.0F, false));
		handguardL1A1AUS.cubeList.add(new ModelBox(handguardL1A1AUS, 376, 552, -3.5F, -39.5777F, -73.3147F, 4, 4, 1, 0.0F, false));

		handguard_r1 = new ModelRenderer(this);
		handguard_r1.setRotationPoint(-2.6661F, -40.6947F, -42.0436F);
		handguardL1A1AUS.addChild(handguard_r1);
		setRotationAngle(handguard_r1, 0.0F, 0.0F, 0.5672F);
		handguard_r1.cubeList.add(new ModelBox(handguard_r1, 494, 119, -0.5F, 0.5F, -15.5F, 1, 1, 22, 0.0F, false));
		handguard_r1.cubeList.add(new ModelBox(handguard_r1, 342, 557, -0.5F, 0.5F, -18.5F, 1, 1, 2, 0.0F, false));
		handguard_r1.cubeList.add(new ModelBox(handguard_r1, 202, 557, -0.5F, 0.5F, -21.5F, 1, 1, 2, 0.0F, false));
		handguard_r1.cubeList.add(new ModelBox(handguard_r1, 190, 557, -0.5F, 0.5F, -24.5F, 1, 1, 2, 0.0F, false));
		handguard_r1.cubeList.add(new ModelBox(handguard_r1, 64, 367, -0.5F, -0.5F, -24.5F, 1, 1, 31, 0.0F, false));

		handguard_r2 = new ModelRenderer(this);
		handguard_r2.setRotationPoint(-0.3339F, -40.6948F, -42.0436F);
		handguardL1A1AUS.addChild(handguard_r2);
		setRotationAngle(handguard_r2, 0.0F, 0.0F, -0.5672F);
		handguard_r2.cubeList.add(new ModelBox(handguard_r2, 494, 96, -0.5F, 0.5F, -15.5F, 1, 1, 22, 0.0F, false));
		handguard_r2.cubeList.add(new ModelBox(handguard_r2, 348, 557, -0.5F, 0.5F, -18.5F, 1, 1, 2, 0.0F, false));
		handguard_r2.cubeList.add(new ModelBox(handguard_r2, 196, 557, -0.5F, 0.5F, -21.5F, 1, 1, 2, 0.0F, false));
		handguard_r2.cubeList.add(new ModelBox(handguard_r2, 184, 557, -0.5F, 0.5F, -24.5F, 1, 1, 2, 0.0F, false));
		handguard_r2.cubeList.add(new ModelBox(handguard_r2, 366, 159, -0.5F, -0.5F, -24.5F, 1, 1, 31, 0.0F, false));

		handguard_r3 = new ModelRenderer(this);
		handguard_r3.setRotationPoint(-1.0257F, -38.0614F, -51.0436F);
		handguardL1A1AUS.addChild(handguard_r3);
		setRotationAngle(handguard_r3, 0.0F, 0.0F, -0.4363F);
		handguard_r3.cubeList.add(new ModelBox(handguard_r3, 328, 396, -0.5F, 2.5F, -15.5F, 1, 1, 31, 0.0F, false));

		handguard_r4 = new ModelRenderer(this);
		handguard_r4.setRotationPoint(-1.9743F, -38.0613F, -51.0436F);
		handguardL1A1AUS.addChild(handguard_r4);
		setRotationAngle(handguard_r4, 0.0F, 0.0F, 0.4363F);
		handguard_r4.cubeList.add(new ModelBox(handguard_r4, 370, 64, -0.5F, 2.5F, -15.5F, 1, 1, 31, 0.0F, false));

		handguard_r5 = new ModelRenderer(this);
		handguard_r5.setRotationPoint(-2.8066F, -40.8464F, -51.0436F);
		handguardL1A1AUS.addChild(handguard_r5);
		setRotationAngle(handguard_r5, 0.0F, 0.0F, 0.4363F);
		handguard_r5.cubeList.add(new ModelBox(handguard_r5, 200, 334, -0.5F, 1.5F, -15.5F, 1, 2, 31, 0.0F, false));

		handguard_r6 = new ModelRenderer(this);
		handguard_r6.setRotationPoint(-0.1933F, -40.8465F, -51.0436F);
		handguardL1A1AUS.addChild(handguard_r6);
		setRotationAngle(handguard_r6, 0.0F, 0.0F, -0.4363F);
		handguard_r6.cubeList.add(new ModelBox(handguard_r6, 136, 333, -0.5F, 1.5F, -15.5F, 1, 2, 31, 0.0F, false));

		handguard_r7 = new ModelRenderer(this);
		handguard_r7.setRotationPoint(-4.1266F, -36.5321F, -51.0436F);
		handguardL1A1AUS.addChild(handguard_r7);
		setRotationAngle(handguard_r7, 0.0F, 0.0F, -0.2618F);
		handguard_r7.cubeList.add(new ModelBox(handguard_r7, 370, 32, -0.5F, -0.5F, -15.5F, 1, 1, 31, 0.0F, false));

		handguard_r8 = new ModelRenderer(this);
		handguard_r8.setRotationPoint(1.1266F, -36.5322F, -51.0436F);
		handguardL1A1AUS.addChild(handguard_r8);
		setRotationAngle(handguard_r8, 0.0F, 0.0F, 0.2618F);
		handguard_r8.cubeList.add(new ModelBox(handguard_r8, 370, 0, -0.5F, -0.5F, -15.5F, 1, 1, 31, 0.0F, false));

		bone186 = new ModelRenderer(this);
		bone186.setRotationPoint(-3.5F, -41.25F, -57.9F);
		handguardL1A1AUS.addChild(bone186);
		setRotationAngle(bone186, 0.0F, 0.0F, -0.9599F);
		bone186.cubeList.add(new ModelBox(bone186, 342, 364, 1.0145F, 1.6414F, -8.6436F, 1, 1, 31, 0.0F, false));
		bone186.cubeList.add(new ModelBox(bone186, 262, 536, -2.5097F, 6.1368F, 8.3564F, 1, 1, 9, 0.0F, false));
		bone186.cubeList.add(new ModelBox(bone186, 322, 536, -2.5097F, 6.1368F, -1.6436F, 1, 1, 9, 0.0F, false));
		bone186.cubeList.add(new ModelBox(bone186, 36, 547, -2.5097F, 6.1368F, -8.6436F, 1, 1, 6, 0.0F, false));
		bone186.cubeList.add(new ModelBox(bone186, 10, 554, -2.5097F, 6.1368F, 18.3564F, 1, 1, 4, 0.0F, false));
		bone186.cubeList.add(new ModelBox(bone186, 558, 216, 0.8097F, 1.7848F, 22.2564F, 1, 1, 1, 0.0F, false));

		bone187 = new ModelRenderer(this);
		bone187.setRotationPoint(-3.5F, -41.25F, -57.9F);
		handguardL1A1AUS.addChild(bone187);
		setRotationAngle(bone187, 0.0F, 0.0F, 0.9599F);
		bone187.cubeList.add(new ModelBox(bone187, 264, 365, 0.2799F, -1.6352F, -8.6436F, 1, 1, 31, 0.0F, false));
		bone187.cubeList.add(new ModelBox(bone187, 282, 536, 3.8041F, 2.8602F, 8.3564F, 1, 1, 9, 0.0F, false));
		bone187.cubeList.add(new ModelBox(bone187, 302, 536, 3.8041F, 2.8602F, -1.6436F, 1, 1, 9, 0.0F, false));
		bone187.cubeList.add(new ModelBox(bone187, 50, 547, 3.8041F, 2.8602F, -8.6436F, 1, 1, 6, 0.0F, false));
		bone187.cubeList.add(new ModelBox(bone187, 0, 554, 3.8041F, 2.8602F, 18.3564F, 1, 1, 4, 0.0F, false));
		bone187.cubeList.add(new ModelBox(bone187, 220, 558, 0.4846F, -1.4918F, 22.2564F, 1, 1, 1, 0.0F, false));

		bone188 = new ModelRenderer(this);
		bone188.setRotationPoint(-3.9099F, -35.6584F, -51.2495F);
		handguardL1A1AUS.addChild(bone188);
		setRotationAngle(bone188, 0.0F, 0.0F, 1.1781F);
		bone188.cubeList.add(new ModelBox(bone188, 416, 394, -1.105F, -0.9267F, 15.6059F, 2, 1, 1, 0.0F, false));

		bone189 = new ModelRenderer(this);
		bone189.setRotationPoint(3.9099F, -35.6584F, -51.2495F);
		handguardL1A1AUS.addChild(bone189);
		setRotationAngle(bone189, 0.0F, 0.0F, -1.1781F);
		bone189.cubeList.add(new ModelBox(bone189, 422, 394, -2.0814F, -3.7907F, 15.6059F, 2, 1, 1, 0.0F, false));

		bone190 = new ModelRenderer(this);
		bone190.setRotationPoint(0.0F, -34.952F, -34.6033F);
		handguardL1A1AUS.addChild(bone190);
		setRotationAngle(bone190, -0.0175F, 0.0F, 0.0F);
		bone190.cubeList.add(new ModelBox(bone190, 498, 88, -2.7929F, -0.243F, -38.7041F, 2, 1, 7, 0.0F, false));
		bone190.cubeList.add(new ModelBox(bone190, 542, 16, -1.2071F, -0.243F, -38.7041F, 1, 1, 7, 0.0F, false));

		bone191 = new ModelRenderer(this);
		bone191.setRotationPoint(0.25F, -1.9489F, -35.4519F);
		bone190.addChild(bone191);
		setRotationAngle(bone191, 0.7854F, 0.0F, 0.0F);
		bone191.cubeList.add(new ModelBox(bone191, 224, 558, -0.5F, -1.0395F, 0.021F, 1, 1, 1, 0.0F, false));
		bone191.cubeList.add(new ModelBox(bone191, 228, 558, -4.0F, -1.0395F, 0.021F, 1, 1, 1, 0.0F, false));

		bone192 = new ModelRenderer(this);
		bone192.setRotationPoint(1.0F, -25.9494F, -69.2533F);
		handguardL1A1AUS.addChild(bone192);
		setRotationAngle(bone192, 0.0F, 0.0F, 0.7854F);
		bone192.cubeList.add(new ModelBox(bone192, 540, 97, -8.1618F, -6.4547F, -4.0614F, 1, 1, 8, 0.0F, false));

		bone193 = new ModelRenderer(this);
		bone193.setRotationPoint(-2.0F, -25.9494F, -69.2533F);
		handguardL1A1AUS.addChild(bone193);
		setRotationAngle(bone193, 0.0F, 0.0F, 0.7854F);
		bone193.cubeList.add(new ModelBox(bone193, 164, 537, -7.8689F, -6.7476F, -4.0614F, 1, 1, 8, 0.0F, false));

		bone194 = new ModelRenderer(this);
		bone194.setRotationPoint(0.0F, -40.952F, -72.3533F);
		handguardL1A1AUS.addChild(bone194);
		setRotationAngle(bone194, 0.5672F, 0.0F, 0.0F);
		bone194.cubeList.add(new ModelBox(bone194, 388, 125, -3.5F, 0.6425F, -1.5493F, 4, 1, 1, 0.0F, false));

		bone195 = new ModelRenderer(this);
		bone195.setRotationPoint(-0.15F, -41.3587F, -66.5436F);
		handguardL1A1AUS.addChild(bone195);
		setRotationAngle(bone195, 0.0F, 0.0F, -0.576F);
		bone195.cubeList.add(new ModelBox(bone195, 184, 553, -1.22F, 0.0588F, 30.9F, 1, 3, 1, 0.0F, false));

		bone196 = new ModelRenderer(this);
		bone196.setRotationPoint(0.0F, 1.6087F, 1.0F);
		bone195.addChild(bone196);
		setRotationAngle(bone196, -2.3562F, 0.0F, 0.0F);
		

		bone197 = new ModelRenderer(this);
		bone197.setRotationPoint(-2.85F, -41.3587F, -66.5436F);
		handguardL1A1AUS.addChild(bone197);
		setRotationAngle(bone197, 0.0F, 0.0F, 0.576F);
		bone197.cubeList.add(new ModelBox(bone197, 342, 553, 0.1928F, 0.1133F, 30.9F, 1, 3, 1, 0.0F, false));

		bone198 = new ModelRenderer(this);
		bone198.setRotationPoint(1.0357F, 1.6164F, 1.0F);
		bone197.addChild(bone198);
		setRotationAngle(bone198, -2.3562F, 0.0F, 0.0F);
		
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handguardL1A1AUS.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}