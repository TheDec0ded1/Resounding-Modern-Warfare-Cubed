package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FALgripT48 extends ModelBase {
	private final ModelRenderer gripT48;
	private final ModelRenderer grip9;
	private final ModelRenderer grip5;
	private final ModelRenderer grip4;
	private final ModelRenderer grip4_r1;
	private final ModelRenderer grip6;
	private final ModelRenderer grip6_r1;
	private final ModelRenderer grip3;
	private final ModelRenderer grip2;
	private final ModelRenderer grip2_r1;
	private final ModelRenderer grip1;
	private final ModelRenderer grip7;
	private final ModelRenderer grip14;
	private final ModelRenderer grip15;
	private final ModelRenderer grip15_r1;
	private final ModelRenderer grip16;
	private final ModelRenderer grip16_r1;
	private final ModelRenderer grip17;
	private final ModelRenderer grip18;
	private final ModelRenderer grip18_r1;
	private final ModelRenderer grip20;

	public FALgripT48() {
		textureWidth = 384;
		textureHeight = 384;

		gripT48 = new ModelRenderer(this);
		gripT48.setRotationPoint(0.2F, 24.0F, 6.0F);
		

		grip9 = new ModelRenderer(this);
		grip9.setRotationPoint(0.1F, 0.0F, 0.0F);
		gripT48.addChild(grip9);
		setRotationAngle(grip9, 0.1309F, 0.0F, 0.0F);
		

		grip5 = new ModelRenderer(this);
		grip5.setRotationPoint(-3.5F, -35.9421F, -2.6803F);
		grip9.addChild(grip5);
		setRotationAngle(grip5, -0.48F, 0.0F, 0.0F);
		grip5.cubeList.add(new ModelBox(grip5, 328, 287, 0.001F, 2.8223F, 2.547F, 3, 2, 3, 0.0F, false));

		grip4 = new ModelRenderer(this);
		grip4.setRotationPoint(-3.5F, -24.2F, 1.5F);
		grip9.addChild(grip4);
		setRotationAngle(grip4, -2.6769F, 0.0F, 0.0F);
		

		grip4_r1 = new ModelRenderer(this);
		grip4_r1.setRotationPoint(2.2F, 0.7052F, 3.025F);
		grip4.addChild(grip4_r1);
		setRotationAngle(grip4_r1, -0.2182F, 0.0F, 0.0F);
		grip4_r1.cubeList.add(new ModelBox(grip4_r1, 298, 145, -2.2F, -5.149F, -2.5141F, 3, 10, 2, 0.0F, false));

		grip6 = new ModelRenderer(this);
		grip6.setRotationPoint(-3.5F, -24.1417F, -3.803F);
		grip9.addChild(grip6);
		setRotationAngle(grip6, -2.8078F, 0.0F, 0.0F);
		

		grip6_r1 = new ModelRenderer(this);
		grip6_r1.setRotationPoint(2.2F, -1.378F, -1.9383F);
		grip6.addChild(grip6_r1);
		setRotationAngle(grip6_r1, -0.2182F, 0.0F, 0.0F);
		grip6_r1.cubeList.add(new ModelBox(grip6_r1, 208, 235, -2.201F, -3.2028F, -1.5067F, 3, 16, 6, 0.0F, false));

		grip3 = new ModelRenderer(this);
		grip3.setRotationPoint(-1.5F, -30.9726F, 7.7963F);
		grip9.addChild(grip3);
		setRotationAngle(grip3, -2.5165F, 0.0F, 0.0F);
		grip3.cubeList.add(new ModelBox(grip3, 352, 169, -2.0F, 3.7874F, 3.0476F, 3, 5, 4, 0.0F, false));

		grip2 = new ModelRenderer(this);
		grip2.setRotationPoint(-3.5F, -27.5F, -5.5F);
		grip9.addChild(grip2);
		setRotationAngle(grip2, 0.2603F, 0.0F, 0.0F);
		

		grip2_r1 = new ModelRenderer(this);
		grip2_r1.setRotationPoint(2.2F, 4.9139F, 2.8097F);
		grip2.addChild(grip2_r1);
		setRotationAngle(grip2_r1, -0.2182F, 0.0F, 0.0F);
		grip2_r1.cubeList.add(new ModelBox(grip2_r1, 352, 153, -2.2F, 2.8967F, -4.2933F, 3, 2, 6, 0.0F, false));

		grip1 = new ModelRenderer(this);
		grip1.setRotationPoint(-3.5F, -31.5F, -7.0F);
		grip9.addChild(grip1);
		grip1.cubeList.add(new ModelBox(grip1, 134, 274, -0.002F, 0.1305F, 5.9914F, 3, 4, 1, 0.0F, false));
		grip1.cubeList.add(new ModelBox(grip1, 134, 269, -0.002F, -0.9423F, -0.6252F, 3, 4, 1, 0.0F, false));

		grip7 = new ModelRenderer(this);
		grip7.setRotationPoint(0.2F, 0.0F, 0.0F);
		gripT48.addChild(grip7);
		setRotationAngle(grip7, 0.1309F, 0.0F, 0.0F);
		

		grip14 = new ModelRenderer(this);
		grip14.setRotationPoint(-3.5F, -35.9421F, -2.6803F);
		grip7.addChild(grip14);
		setRotationAngle(grip14, -0.48F, 0.0F, 0.0F);
		grip14.cubeList.add(new ModelBox(grip14, 310, 322, 2.299F, 2.8223F, 2.547F, 1, 2, 3, 0.0F, false));

		grip15 = new ModelRenderer(this);
		grip15.setRotationPoint(-3.5F, -24.2F, 1.5F);
		grip7.addChild(grip15);
		setRotationAngle(grip15, -2.6769F, 0.0F, 0.0F);
		

		grip15_r1 = new ModelRenderer(this);
		grip15_r1.setRotationPoint(2.1F, 0.7052F, 3.025F);
		grip15.addChild(grip15_r1);
		setRotationAngle(grip15_r1, -0.2182F, 0.0F, 0.0F);
		grip15_r1.cubeList.add(new ModelBox(grip15_r1, 66, 236, 0.2F, -5.149F, -2.5141F, 1, 10, 2, 0.0F, false));

		grip16 = new ModelRenderer(this);
		grip16.setRotationPoint(-3.5F, -24.1417F, -3.803F);
		grip7.addChild(grip16);
		setRotationAngle(grip16, -2.8078F, 0.0F, 0.0F);
		

		grip16_r1 = new ModelRenderer(this);
		grip16_r1.setRotationPoint(2.1F, -1.378F, -1.9383F);
		grip16.addChild(grip16_r1);
		setRotationAngle(grip16_r1, -0.2182F, 0.0F, 0.0F);
		grip16_r1.cubeList.add(new ModelBox(grip16_r1, 120, 269, 0.201F, -3.2028F, -1.5067F, 1, 16, 6, 0.0F, false));

		grip17 = new ModelRenderer(this);
		grip17.setRotationPoint(-1.5F, -30.9726F, 7.7963F);
		grip7.addChild(grip17);
		setRotationAngle(grip17, -2.5165F, 0.0F, 0.0F);
		grip17.cubeList.add(new ModelBox(grip17, 48, 307, 0.3F, 3.7874F, 3.0476F, 1, 5, 4, 0.0F, false));

		grip18 = new ModelRenderer(this);
		grip18.setRotationPoint(-3.5F, -27.5F, -5.5F);
		grip7.addChild(grip18);
		setRotationAngle(grip18, 0.2603F, 0.0F, 0.0F);
		

		grip18_r1 = new ModelRenderer(this);
		grip18_r1.setRotationPoint(2.1F, 4.9139F, 2.8097F);
		grip18.addChild(grip18_r1);
		setRotationAngle(grip18_r1, -0.2182F, 0.0F, 0.0F);
		grip18_r1.cubeList.add(new ModelBox(grip18_r1, 346, 353, 0.2F, 2.8967F, -4.2933F, 1, 2, 6, 0.0F, false));

		grip20 = new ModelRenderer(this);
		grip20.setRotationPoint(-3.5F, -31.5F, -7.0F);
		grip7.addChild(grip20);
		grip20.cubeList.add(new ModelBox(grip20, 74, 203, 2.302F, 0.1305F, 5.9914F, 1, 4, 1, 0.0F, false));
		grip20.cubeList.add(new ModelBox(grip20, 74, 198, 2.302F, -0.9423F, -0.6252F, 1, 4, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gripT48.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}