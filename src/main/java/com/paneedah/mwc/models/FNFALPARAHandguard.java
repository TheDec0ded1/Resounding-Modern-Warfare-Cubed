package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FNFALPARAHandguard extends ModelBase {
	private final ModelRenderer handguard;
	private final ModelRenderer bone29;
	private final ModelRenderer bone28;
	private final ModelRenderer bone30;
	private final ModelRenderer bone32;
	private final ModelRenderer bone7;
	private final ModelRenderer bone59;
	private final ModelRenderer bone34;
	private final ModelRenderer bone33;
	private final ModelRenderer bone10;
	private final ModelRenderer bone27;
	private final ModelRenderer bone35;
	private final ModelRenderer bone31;
	private final ModelRenderer bone36;

	public FNFALPARAHandguard() {
		textureWidth = 200;
		textureHeight = 200;

		handguard = new ModelRenderer(this);
		handguard.setRotationPoint(0.0F, 24.0F, 0.0F);
		handguard.cubeList.add(new ModelBox(handguard, 0, 0, -4.2351F, -35.6034F, -66.5436F, 4, 1, 31, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 72, 33, -2.0F, -41.9587F, -66.5436F, 1, 2, 31, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 22, 22, -2.0F, -41.7087F, -35.6436F, 1, 2, 3, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 101, 66, 1.001F, -38.0587F, -66.5436F, 1, 1, 31, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 95, -4.999F, -38.0587F, -66.5436F, 1, 1, 31, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 10, 20, -4.399F, -38.6587F, -35.6436F, 1, 2, 3, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 19, 0.301F, -38.6587F, -35.6436F, 1, 2, 3, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 101, 101, 1.0F, -37.4587F, -66.5436F, 1, 1, 31, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 74, 0, -5.0F, -37.4587F, -66.5436F, 1, 1, 31, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 39, 1, -0.7649F, -35.6034F, -66.5436F, 2, 1, 31, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 32, -3.5F, -35.4494F, -65.7533F, 4, 1, 30, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 0, -3.5F, -39.4535F, -72.5382F, 4, 4, 6, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 20, 11, -3.5F, -39.5777F, -73.3147F, 4, 4, 1, 0.0F, false));

		bone29 = new ModelRenderer(this);
		bone29.setRotationPoint(-3.5F, -41.25F, -57.9F);
		handguard.addChild(bone29);
		setRotationAngle(bone29, 0.0F, 0.0F, -0.9599F);
		bone29.cubeList.add(new ModelBox(bone29, 105, 32, 1.0145F, 1.6414F, -8.6436F, 1, 1, 31, 0.0F, false));
		bone29.cubeList.add(new ModelBox(bone29, 22, 0, 0.8097F, 1.7848F, 22.2564F, 1, 1, 3, 0.0F, false));

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(-3.5F, -41.25F, -57.9F);
		handguard.addChild(bone28);
		setRotationAngle(bone28, 0.0F, 0.0F, 0.9599F);
		bone28.cubeList.add(new ModelBox(bone28, 0, 127, 0.2799F, -1.6352F, -8.6436F, 1, 1, 31, 0.0F, false));
		bone28.cubeList.add(new ModelBox(bone28, 22, 4, 0.4846F, -1.4918F, 22.2564F, 1, 1, 3, 0.0F, false));

		bone30 = new ModelRenderer(this);
		bone30.setRotationPoint(-3.9099F, -35.6584F, -51.2495F);
		handguard.addChild(bone30);
		setRotationAngle(bone30, 0.0F, 0.0F, 1.1781F);
		bone30.cubeList.add(new ModelBox(bone30, 0, 63, -1.1498F, -0.2959F, -15.2941F, 2, 1, 31, 0.0F, false));
		bone30.cubeList.add(new ModelBox(bone30, 19, 32, -1.105F, -0.9267F, 15.6059F, 2, 1, 3, 0.0F, false));

		bone32 = new ModelRenderer(this);
		bone32.setRotationPoint(3.9099F, -35.6584F, -51.2495F);
		handguard.addChild(bone32);
		setRotationAngle(bone32, 0.0F, 0.0F, -1.1781F);
		bone32.cubeList.add(new ModelBox(bone32, 37, 37, -1.9983F, -3.0675F, -15.2941F, 2, 1, 31, 0.0F, false));
		bone32.cubeList.add(new ModelBox(bone32, 9, 32, -2.0814F, -3.7907F, 15.6059F, 2, 1, 3, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, -34.952F, -34.6033F);
		handguard.addChild(bone7);
		setRotationAngle(bone7, -0.0175F, 0.0F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 11, 21, -2.7929F, -0.243F, -38.7041F, 2, 1, 7, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 0, 32, -1.2071F, -0.243F, -38.7041F, 1, 1, 7, 0.0F, false));

		bone59 = new ModelRenderer(this);
		bone59.setRotationPoint(0.25F, -1.9489F, -35.4519F);
		bone7.addChild(bone59);
		setRotationAngle(bone59, 0.7854F, 0.0F, 0.0F);
		bone59.cubeList.add(new ModelBox(bone59, 20, 38, -0.5F, -1.0395F, 0.021F, 1, 1, 1, 0.0F, false));
		bone59.cubeList.add(new ModelBox(bone59, 16, 38, -4.0F, -1.0395F, 0.021F, 1, 1, 1, 0.0F, false));

		bone34 = new ModelRenderer(this);
		bone34.setRotationPoint(1.0F, -25.9494F, -69.2533F);
		handguard.addChild(bone34);
		setRotationAngle(bone34, 0.0F, 0.0F, 0.7854F);
		bone34.cubeList.add(new ModelBox(bone34, 12, 2, -8.1618F, -6.4547F, -4.0614F, 1, 1, 8, 0.0F, false));

		bone33 = new ModelRenderer(this);
		bone33.setRotationPoint(-2.0F, -25.9494F, -69.2533F);
		handguard.addChild(bone33);
		setRotationAngle(bone33, 0.0F, 0.0F, 0.7854F);
		bone33.cubeList.add(new ModelBox(bone33, 0, 19, -7.8689F, -6.7476F, -4.0614F, 1, 1, 8, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.0F, -40.952F, -72.3533F);
		handguard.addChild(bone10);
		setRotationAngle(bone10, 0.5672F, 0.0F, 0.0F);
		bone10.cubeList.add(new ModelBox(bone10, 14, 0, -3.5F, 0.6425F, -1.5493F, 4, 1, 1, 0.0F, false));

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(-0.15F, -41.3587F, -66.5436F);
		handguard.addChild(bone27);
		setRotationAngle(bone27, 0.0F, 0.0F, -0.576F);
		bone27.cubeList.add(new ModelBox(bone27, 66, 104, -1.0F, 0.0F, 0.0F, 1, 1, 31, 0.0F, false));
		bone27.cubeList.add(new ModelBox(bone27, 68, 71, -1.0F, 2.0F, 0.0F, 1, 2, 31, 0.0F, false));
		bone27.cubeList.add(new ModelBox(bone27, 10, 11, -1.22F, 0.0588F, 30.9F, 1, 3, 3, 0.0F, false));
		bone27.cubeList.add(new ModelBox(bone27, 3, 37, -1.0F, 1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		bone27.cubeList.add(new ModelBox(bone27, 0, 28, -1.0F, 1.0F, 5.0F, 1, 1, 2, 0.0F, false));
		bone27.cubeList.add(new ModelBox(bone27, 0, 24, -1.0F, 1.0F, 11.0F, 1, 1, 2, 0.0F, false));
		bone27.cubeList.add(new ModelBox(bone27, 20, 16, -1.0F, 1.0F, 17.0F, 1, 1, 2, 0.0F, false));
		bone27.cubeList.add(new ModelBox(bone27, 10, 11, -1.0F, 1.0F, 23.0F, 1, 1, 8, 0.0F, false));
		bone27.cubeList.add(new ModelBox(bone27, 14, 15, -1.0F, 1.0F, 19.0F, 1, 1, 4, 0.0F, false));

		bone35 = new ModelRenderer(this);
		bone35.setRotationPoint(0.0F, 1.6087F, 1.0F);
		bone27.addChild(bone35);
		setRotationAngle(bone35, -2.3562F, 0.0F, 0.0F);
		bone35.cubeList.add(new ModelBox(bone35, 21, 36, -1.001F, -0.6087F, 0.0F, 1, 1, 1, 0.0F, false));
		bone35.cubeList.add(new ModelBox(bone35, 0, 36, -1.014F, 0.14F, -0.7764F, 1, 1, 1, 0.0F, false));
		bone35.cubeList.add(new ModelBox(bone35, 3, 35, -1.014F, -4.1026F, -5.019F, 1, 1, 1, 0.0F, false));
		bone35.cubeList.add(new ModelBox(bone35, 0, 34, -1.014F, -8.3453F, -9.2617F, 1, 1, 1, 0.0F, false));
		bone35.cubeList.add(new ModelBox(bone35, 0, 32, -1.014F, -11.598F, -12.5144F, 1, 1, 1, 0.0F, false));
		bone35.cubeList.add(new ModelBox(bone35, 23, 29, -1.014F, -7.3553F, -8.2717F, 1, 1, 1, 0.0F, false));
		bone35.cubeList.add(new ModelBox(bone35, 15, 29, -1.014F, -3.1127F, -4.0291F, 1, 1, 1, 0.0F, false));
		bone35.cubeList.add(new ModelBox(bone35, 17, 36, -1.001F, -4.8513F, -4.2426F, 1, 1, 1, 0.0F, false));
		bone35.cubeList.add(new ModelBox(bone35, 13, 36, -1.001F, -9.094F, -8.4852F, 1, 1, 1, 0.0F, false));
		bone35.cubeList.add(new ModelBox(bone35, 27, 29, -1.001F, -12.3466F, -11.7379F, 1, 1, 1, 0.0F, false));
		bone35.cubeList.add(new ModelBox(bone35, 19, 29, -1.001F, -8.104F, -7.4953F, 1, 1, 1, 0.0F, false));
		bone35.cubeList.add(new ModelBox(bone35, 11, 29, -1.001F, -3.8614F, -3.2526F, 1, 1, 1, 0.0F, false));

		bone31 = new ModelRenderer(this);
		bone31.setRotationPoint(-2.85F, -41.3587F, -66.5436F);
		handguard.addChild(bone31);
		setRotationAngle(bone31, 0.0F, 0.0F, 0.576F);
		bone31.cubeList.add(new ModelBox(bone31, 33, 102, 0.0F, 0.0F, 0.0F, 1, 1, 31, 0.0F, false));
		bone31.cubeList.add(new ModelBox(bone31, 35, 69, 0.0F, 2.0F, 0.0F, 1, 2, 31, 0.0F, false));
		bone31.cubeList.add(new ModelBox(bone31, 0, 10, 0.1928F, 0.1133F, 30.9F, 1, 3, 3, 0.0F, false));
		bone31.cubeList.add(new ModelBox(bone31, 25, 36, 0.0F, 1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		bone31.cubeList.add(new ModelBox(bone31, 14, 2, 0.0F, 1.0F, 5.0F, 1, 1, 2, 0.0F, false));
		bone31.cubeList.add(new ModelBox(bone31, 0, 3, 0.0F, 1.0F, 11.0F, 1, 1, 2, 0.0F, false));
		bone31.cubeList.add(new ModelBox(bone31, 0, 0, 0.0F, 1.0F, 17.0F, 1, 1, 2, 0.0F, false));
		bone31.cubeList.add(new ModelBox(bone31, 0, 10, 0.0F, 1.0F, 23.0F, 1, 1, 8, 0.0F, false));
		bone31.cubeList.add(new ModelBox(bone31, 4, 14, 0.0F, 1.0F, 19.0F, 1, 1, 4, 0.0F, false));

		bone36 = new ModelRenderer(this);
		bone36.setRotationPoint(1.0357F, 1.6164F, 1.0F);
		bone31.addChild(bone36);
		setRotationAngle(bone36, -2.3562F, 0.0F, 0.0F);
		bone36.cubeList.add(new ModelBox(bone36, 8, 28, -1.001F, -0.6087F, 0.0F, 1, 1, 1, 0.0F, false));
		bone36.cubeList.add(new ModelBox(bone36, 4, 28, -1.014F, 0.14F, -0.7764F, 1, 1, 1, 0.0F, false));
		bone36.cubeList.add(new ModelBox(bone36, 27, 22, -1.014F, -4.1026F, -5.019F, 1, 1, 1, 0.0F, false));
		bone36.cubeList.add(new ModelBox(bone36, 27, 17, -1.014F, -8.3453F, -9.2617F, 1, 1, 1, 0.0F, false));
		bone36.cubeList.add(new ModelBox(bone36, 26, 20, -1.014F, -11.598F, -12.5144F, 1, 1, 1, 0.0F, false));
		bone36.cubeList.add(new ModelBox(bone36, 26, 8, -1.014F, -7.3553F, -8.2717F, 1, 1, 1, 0.0F, false));
		bone36.cubeList.add(new ModelBox(bone36, 14, 25, -1.014F, -3.1127F, -4.0291F, 1, 1, 1, 0.0F, false));
		bone36.cubeList.add(new ModelBox(bone36, 10, 25, -1.001F, -4.8513F, -4.2426F, 1, 1, 1, 0.0F, false));
		bone36.cubeList.add(new ModelBox(bone36, 24, 16, -1.001F, -9.094F, -8.4852F, 1, 1, 1, 0.0F, false));
		bone36.cubeList.add(new ModelBox(bone36, 22, 8, -1.001F, -12.3466F, -11.7379F, 1, 1, 1, 0.0F, false));
		bone36.cubeList.add(new ModelBox(bone36, 4, 16, -1.001F, -8.104F, -7.4953F, 1, 1, 1, 0.0F, false));
		bone36.cubeList.add(new ModelBox(bone36, 0, 16, -1.001F, -3.8614F, -3.2526F, 1, 1, 1, 0.0F, false));
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