package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FNFALIsraeliHandguard extends ModelBase {
	private final ModelRenderer handguard;
	private final ModelRenderer bone31;
	private final ModelRenderer bone27;
	private final ModelRenderer bone30;
	private final ModelRenderer bone28;
	private final ModelRenderer bone29;
	private final ModelRenderer bone10;
	private final ModelRenderer bone26;
	private final ModelRenderer bone32;
	private final ModelRenderer bone7;
	private final ModelRenderer bone59;

	public FNFALIsraeliHandguard() {
		textureWidth = 400;
		textureHeight = 400;

		handguard = new ModelRenderer(this);
		handguard.setRotationPoint(0.0F, 24.0F, 0.0F);
		handguard.cubeList.add(new ModelBox(handguard, 228, 197, -2.9115F, -35.7076F, -53.5436F, 3, 1, 21, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 9, 24, -2.9413F, -35.851F, -54.5436F, 3, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 13, -3.5F, -41.4535F, -72.5382F, 4, 6, 4, 0.0F, false));

		bone31 = new ModelRenderer(this);
		bone31.setRotationPoint(-11.0F, -50.7087F, -54.0436F);
		handguard.addChild(bone31);
		setRotationAngle(bone31, 0.0F, 0.0F, -0.2182F);
		

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(-0.3327F, -40.1446F, -51.0393F);
		handguard.addChild(bone27);
		setRotationAngle(bone27, 0.0F, 0.0F, 0.2182F);
		

		bone30 = new ModelRenderer(this);
		bone30.setRotationPoint(-2.9553F, -37.7644F, -51.0436F);
		handguard.addChild(bone30);
		setRotationAngle(bone30, 0.0F, 0.0F, 0.6109F);
		bone30.cubeList.add(new ModelBox(bone30, 10, 10, -1.1079F, -2.7591F, -2.5F, 1, 3, 21, 0.0F, false));
		bone30.cubeList.add(new ModelBox(bone30, 6, 14, -1.1079F, -2.7591F, -3.5F, 1, 3, 1, 0.0F, false));
		bone30.cubeList.add(new ModelBox(bone30, 10, 10, -1.3579F, -2.7591F, -2.5F, 1, 1, 21, 0.0F, false));
		bone30.cubeList.add(new ModelBox(bone30, 10, 10, -1.3579F, -0.7591F, -2.5F, 1, 1, 21, 0.0F, false));
		bone30.cubeList.add(new ModelBox(bone30, 28, 28, -1.3579F, -1.7591F, 15.5F, 1, 1, 3, 0.0F, false));
		bone30.cubeList.add(new ModelBox(bone30, 28, 28, -1.3579F, -1.7591F, -2.5F, 1, 1, 3, 0.0F, false));

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(-10.9553F, -37.7644F, -51.0436F);
		handguard.addChild(bone28);
		bone28.cubeList.add(new ModelBox(bone28, 10, 10, 6.9995F, -0.5815F, -2.5F, 1, 2, 21, 0.0F, false));
		bone28.cubeList.add(new ModelBox(bone28, 6, 14, 6.9995F, -0.5815F, -3.5F, 1, 2, 1, 0.0F, false));
		bone28.cubeList.add(new ModelBox(bone28, 10, 10, 6.7495F, 0.4185F, -2.5F, 1, 1, 21, 0.0F, false));
		bone28.cubeList.add(new ModelBox(bone28, 28, 28, 6.7495F, -0.5815F, 15.5F, 1, 1, 3, 0.0F, false));
		bone28.cubeList.add(new ModelBox(bone28, 28, 28, 6.7495F, -0.5815F, -2.5F, 1, 1, 3, 0.0F, false));

		bone29 = new ModelRenderer(this);
		bone29.setRotationPoint(-14.9553F, -37.7644F, -51.0436F);
		handguard.addChild(bone29);
		setRotationAngle(bone29, 0.0F, 0.0F, -0.6109F);
		bone29.cubeList.add(new ModelBox(bone29, 10, 10, 8.2419F, 7.3276F, -2.5F, 1, 2, 21, 0.0F, false));
		bone29.cubeList.add(new ModelBox(bone29, 6, 14, 8.2419F, 7.3276F, -3.5F, 1, 2, 1, 0.0F, false));
		bone29.cubeList.add(new ModelBox(bone29, 10, 10, 7.9919F, 8.3276F, -2.5F, 1, 1, 21, 0.0F, false));
		bone29.cubeList.add(new ModelBox(bone29, 28, 28, 7.9919F, 7.3276F, 15.5F, 1, 1, 3, 0.0F, false));
		bone29.cubeList.add(new ModelBox(bone29, 28, 28, 7.9919F, 7.3276F, -2.5F, 1, 1, 3, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(-2.9553F, -37.7644F, -51.0436F);
		handguard.addChild(bone10);
		setRotationAngle(bone10, 0.0F, 0.0F, -0.6109F);
		bone10.cubeList.add(new ModelBox(bone10, 10, 10, 2.5166F, -1.0726F, -2.5F, 1, 3, 21, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 6, 14, 2.5166F, -1.0726F, -3.5F, 1, 3, 1, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 10, 10, 2.7666F, -1.0726F, -2.5F, 1, 1, 21, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 10, 10, 2.7666F, 0.9274F, -2.5F, 1, 1, 21, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 28, 28, 2.7666F, -0.0726F, -2.5F, 1, 1, 3, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 28, 28, 2.7666F, -0.0726F, 15.5F, 1, 1, 3, 0.0F, false));

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(3.0447F, -37.7644F, -51.0436F);
		handguard.addChild(bone26);
		bone26.cubeList.add(new ModelBox(bone26, 10, 10, -3.0591F, -0.5815F, -2.5F, 1, 2, 21, 0.0F, false));
		bone26.cubeList.add(new ModelBox(bone26, 6, 14, -3.0591F, -0.5815F, -3.5F, 1, 2, 1, 0.0F, false));
		bone26.cubeList.add(new ModelBox(bone26, 10, 10, -2.8091F, 0.4185F, -2.5F, 1, 1, 21, 0.0F, false));
		bone26.cubeList.add(new ModelBox(bone26, 28, 28, -2.8091F, -0.5815F, -2.5F, 1, 1, 3, 0.0F, false));
		bone26.cubeList.add(new ModelBox(bone26, 28, 28, -2.8091F, -0.5815F, 15.5F, 1, 1, 3, 0.0F, false));

		bone32 = new ModelRenderer(this);
		bone32.setRotationPoint(11.0447F, -37.7644F, -51.0436F);
		handguard.addChild(bone32);
		setRotationAngle(bone32, 0.0F, 0.0F, 0.6109F);
		bone32.cubeList.add(new ModelBox(bone32, 10, 10, -8.4715F, 6.7882F, -2.5F, 1, 2, 21, 0.0F, false));
		bone32.cubeList.add(new ModelBox(bone32, 6, 14, -8.4715F, 6.7882F, -3.5F, 1, 2, 1, 0.0F, false));
		bone32.cubeList.add(new ModelBox(bone32, 10, 10, -8.2215F, 7.7882F, -2.5F, 1, 1, 21, 0.0F, false));
		bone32.cubeList.add(new ModelBox(bone32, 28, 28, -8.2215F, 6.7882F, -2.5F, 1, 1, 3, 0.0F, false));
		bone32.cubeList.add(new ModelBox(bone32, 28, 28, -8.2215F, 6.7882F, 15.5F, 1, 1, 3, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, -34.952F, -34.6033F);
		handguard.addChild(bone7);
		setRotationAngle(bone7, -0.0175F, 0.0F, 0.0F);
		

		bone59 = new ModelRenderer(this);
		bone59.setRotationPoint(0.25F, -1.9489F, -35.4519F);
		bone7.addChild(bone59);
		setRotationAngle(bone59, 0.7854F, 0.0F, 0.0F);
		bone59.cubeList.add(new ModelBox(bone59, 0, 77, -0.5F, -1.0395F, 0.021F, 1, 1, 1, 0.0F, false));
		bone59.cubeList.add(new ModelBox(bone59, 7, 76, -4.0F, -1.0395F, 0.021F, 1, 1, 1, 0.0F, false));
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