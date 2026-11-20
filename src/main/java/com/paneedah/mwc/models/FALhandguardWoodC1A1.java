package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FALhandguardWoodC1A1 extends ModelBase {
	private final ModelRenderer handguardC1A1;
	private final ModelRenderer bone31;
	private final ModelRenderer bone29;
	private final ModelRenderer bone28;
	private final ModelRenderer bone27;
	private final ModelRenderer bone30;
	private final ModelRenderer bone32;
	private final ModelRenderer bone7;
	private final ModelRenderer bone59;
	private final ModelRenderer bone34;
	private final ModelRenderer bone33;
	private final ModelRenderer bone10;

	public FALhandguardWoodC1A1() {
		textureWidth = 576;
		textureHeight = 576;

		handguardC1A1 = new ModelRenderer(this);
		handguardC1A1.setRotationPoint(0.0F, 24.0F, 3.0F);
		handguardC1A1.cubeList.add(new ModelBox(handguardC1A1, 278, 332, -2.0F, -41.9587F, -66.5436F, 1, 2, 31, 0.0F, false));
		handguardC1A1.cubeList.add(new ModelBox(handguardC1A1, 288, 266, -3.7351F, -35.6034F, -66.5436F, 4, 1, 31, 0.0F, false));
		handguardC1A1.cubeList.add(new ModelBox(handguardC1A1, 302, 96, -3.5F, -35.4494F, -65.7533F, 4, 1, 30, 0.0F, false));
		handguardC1A1.cubeList.add(new ModelBox(handguardC1A1, 406, 394, -3.4809F, -36.0051F, -35.5436F, 4, 1, 1, 0.0F, false));
		handguardC1A1.cubeList.add(new ModelBox(handguardC1A1, 316, 560, -2.0F, -41.3837F, -35.5436F, 1, 1, 1, 0.0F, false));
		handguardC1A1.cubeList.add(new ModelBox(handguardC1A1, 64, 335, -0.2649F, -35.6034F, -66.5436F, 1, 1, 31, 0.0F, false));
		handguardC1A1.cubeList.add(new ModelBox(handguardC1A1, 530, 245, -3.5F, -39.4535F, -72.5382F, 4, 4, 6, 0.0F, false));
		handguardC1A1.cubeList.add(new ModelBox(handguardC1A1, 366, 552, -3.501F, -39.5777F, -73.3147F, 4, 4, 1, 0.0F, false));

		bone31 = new ModelRenderer(this);
		bone31.setRotationPoint(-11.0F, -50.7087F, -54.0436F);
		handguardC1A1.addChild(bone31);
		setRotationAngle(bone31, 0.0F, 0.0F, -0.2182F);
		bone31.cubeList.add(new ModelBox(bone31, 0, 303, 7.5447F, 13.4443F, -12.5F, 1, 4, 31, 0.0F, false));
		bone31.cubeList.add(new ModelBox(bone31, 556, 438, 7.5447F, 12.4443F, -12.5F, 1, 1, 2, 0.0F, false));
		bone31.cubeList.add(new ModelBox(bone31, 430, 160, 7.5447F, 12.4443F, -9.5F, 1, 1, 28, 0.0F, false));
		bone31.cubeList.add(new ModelBox(bone31, 366, 127, 7.5447F, 11.4443F, -12.5F, 1, 1, 31, 0.0F, false));
		bone31.cubeList.add(new ModelBox(bone31, 240, 503, 7.4202F, 12.0057F, 18.5F, 1, 5, 1, 0.0F, false));

		bone29 = new ModelRenderer(this);
		bone29.setRotationPoint(-3.5F, -41.25F, -57.9F);
		handguardC1A1.addChild(bone29);
		setRotationAngle(bone29, 0.0F, 0.0F, -0.9599F);
		bone29.cubeList.add(new ModelBox(bone29, 0, 338, 1.0145F, 1.6414F, -8.6436F, 1, 1, 31, 0.0F, false));
		bone29.cubeList.add(new ModelBox(bone29, 320, 560, 0.5435F, 1.9712F, 22.3564F, 1, 1, 1, 0.0F, false));

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(-3.5F, -41.25F, -57.9F);
		handguardC1A1.addChild(bone28);
		setRotationAngle(bone28, 0.0F, 0.0F, 0.9599F);
		bone28.cubeList.add(new ModelBox(bone28, 342, 332, 0.2799F, -1.6352F, -8.6436F, 1, 1, 31, 0.0F, false));
		bone28.cubeList.add(new ModelBox(bone28, 312, 560, 0.7509F, -1.3054F, 22.3564F, 1, 1, 1, 0.0F, false));

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(-0.3327F, -40.1446F, -51.0393F);
		handguardC1A1.addChild(bone27);
		setRotationAngle(bone27, 0.0F, 0.0F, 0.2182F);
		bone27.cubeList.add(new ModelBox(bone27, 302, 127, -2.696F, 1.327F, -15.5043F, 1, 4, 31, 0.0F, false));
		bone27.cubeList.add(new ModelBox(bone27, 556, 435, -2.696F, 0.327F, -15.5043F, 1, 1, 2, 0.0F, false));
		bone27.cubeList.add(new ModelBox(bone27, 420, 300, -2.696F, 0.327F, -12.5043F, 1, 1, 28, 0.0F, false));
		bone27.cubeList.add(new ModelBox(bone27, 128, 366, -2.696F, -0.673F, -15.5043F, 1, 1, 31, 0.0F, false));
		bone27.cubeList.add(new ModelBox(bone27, 64, 329, -2.5715F, -0.1116F, 15.4957F, 1, 5, 1, 0.0F, false));

		bone30 = new ModelRenderer(this);
		bone30.setRotationPoint(-3.9099F, -35.6584F, -51.2495F);
		handguardC1A1.addChild(bone30);
		setRotationAngle(bone30, 0.0F, 0.0F, 1.1781F);
		bone30.cubeList.add(new ModelBox(bone30, 356, 204, 0.0416F, -0.7578F, -15.2941F, 1, 1, 31, 0.0F, false));
		bone30.cubeList.add(new ModelBox(bone30, 324, 560, -0.2466F, -1.1113F, 15.7059F, 1, 1, 1, 0.0F, false));

		bone32 = new ModelRenderer(this);
		bone32.setRotationPoint(3.9099F, -35.6584F, -51.2495F);
		handguardC1A1.addChild(bone32);
		setRotationAngle(bone32, 0.0F, 0.0F, -1.1781F);
		bone32.cubeList.add(new ModelBox(bone32, 356, 298, -2.1896F, -3.5294F, -15.2941F, 1, 1, 31, 0.0F, false));
		bone32.cubeList.add(new ModelBox(bone32, 328, 560, -1.9011F, -3.8826F, 15.7059F, 1, 1, 1, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, -34.952F, -34.6033F);
		handguardC1A1.addChild(bone7);
		setRotationAngle(bone7, -0.0175F, 0.0F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 340, 162, -2.7929F, -0.243F, -38.7041F, 2, 1, 7, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 542, 8, -1.2071F, -0.243F, -38.7041F, 1, 1, 7, 0.0F, false));

		bone59 = new ModelRenderer(this);
		bone59.setRotationPoint(0.25F, -1.9489F, -35.4519F);
		bone7.addChild(bone59);
		setRotationAngle(bone59, 0.7854F, 0.0F, 0.0F);
		bone59.cubeList.add(new ModelBox(bone59, 558, 214, -0.5F, -1.0395F, 0.021F, 1, 1, 1, 0.0F, false));
		bone59.cubeList.add(new ModelBox(bone59, 216, 558, -4.0F, -1.0395F, 0.021F, 1, 1, 1, 0.0F, false));

		bone34 = new ModelRenderer(this);
		bone34.setRotationPoint(1.0F, -25.9494F, -69.2533F);
		handguardC1A1.addChild(bone34);
		setRotationAngle(bone34, 0.0F, 0.0F, 0.7854F);
		bone34.cubeList.add(new ModelBox(bone34, 540, 88, -8.1618F, -6.4547F, -4.0614F, 1, 1, 8, 0.0F, false));

		bone33 = new ModelRenderer(this);
		bone33.setRotationPoint(-2.0F, -25.9494F, -69.2533F);
		handguardC1A1.addChild(bone33);
		setRotationAngle(bone33, 0.0F, 0.0F, 0.7854F);
		bone33.cubeList.add(new ModelBox(bone33, 146, 537, -7.8689F, -6.7476F, -4.0614F, 1, 1, 8, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.0F, -40.952F, -72.3533F);
		handguardC1A1.addChild(bone10);
		setRotationAngle(bone10, 0.5672F, 0.0F, 0.0F);
		bone10.cubeList.add(new ModelBox(bone10, 386, 330, -3.499F, 0.6425F, -1.5493F, 4, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handguardC1A1.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}