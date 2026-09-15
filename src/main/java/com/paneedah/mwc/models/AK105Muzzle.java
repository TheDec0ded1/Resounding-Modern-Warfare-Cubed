package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AK105Muzzle extends ModelBase {
	private final ModelRenderer muzzle;
	private final ModelRenderer gun250_r1;
	private final ModelRenderer gun251_r1;
	private final ModelRenderer gun251_r2;
	private final ModelRenderer gun252_r1;
	private final ModelRenderer gun249_r1;
	private final ModelRenderer gun250_r2;
	private final ModelRenderer gun250_r3;
	private final ModelRenderer gun251_r3;
	private final ModelRenderer bone17;
	private final ModelRenderer gun66;
	private final ModelRenderer gun164_r1;
	private final ModelRenderer gun163_r1;
	private final ModelRenderer gun67;
	private final ModelRenderer gun165_r1;
	private final ModelRenderer gun164_r2;
	private final ModelRenderer gun68;
	private final ModelRenderer gun165_r2;
	private final ModelRenderer gun69;
	private final ModelRenderer gun166_r1;
	private final ModelRenderer gun61;
	private final ModelRenderer gun168_r1;
	private final ModelRenderer gun71;
	private final ModelRenderer gun171_r1;

	public AK105Muzzle() {
		textureWidth = 320;
		textureHeight = 320;

		muzzle = new ModelRenderer(this);
		muzzle.setRotationPoint(0.0F, 23.85F, 6.5F);
		muzzle.cubeList.add(new ModelBox(muzzle, 262, 297, -2.8485F, -36.0015F, -77.7F, 1, 1, 3, 0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 270, 297, -1.1515F, -36.0015F, -77.7F, 1, 1, 3, 0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 286, 297, -2.0F, -35.1529F, -77.7F, 1, 1, 3, 0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 8, 298, -2.0F, -36.85F, -77.7F, 1, 1, 3, 0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 66, 302, -2.8839F, -35.9911F, -74.5F, 1, 1, 2, 0.125F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 60, 302, -1.1161F, -35.9911F, -74.5F, 1, 1, 2, 0.125F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 54, 302, -2.0F, -35.1072F, -74.5F, 1, 1, 2, 0.125F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 36, 302, -2.0F, -36.875F, -74.5F, 1, 1, 2, 0.125F, false));

		gun250_r1 = new ModelRenderer(this);
		gun250_r1.setRotationPoint(-4.2463F, -38.2374F, -84.0F);
		muzzle.addChild(gun250_r1);
		setRotationAngle(gun250_r1, 0.0F, 0.0F, -0.7854F);
		gun250_r1.cubeList.add(new ModelBox(gun250_r1, 42, 302, -0.5F, 2.5F, 9.5F, 1, 1, 2, 0.125F, false));

		gun251_r1 = new ModelRenderer(this);
		gun251_r1.setRotationPoint(-2.9963F, -38.2374F, -84.0F);
		muzzle.addChild(gun251_r1);
		setRotationAngle(gun251_r1, 0.0F, 0.0F, -0.7854F);
		gun251_r1.cubeList.add(new ModelBox(gun251_r1, 48, 302, -0.5F, 2.5F, 9.5F, 1, 1, 2, 0.125F, false));

		gun251_r2 = new ModelRenderer(this);
		gun251_r2.setRotationPoint(-4.2463F, -36.9874F, -84.0F);
		muzzle.addChild(gun251_r2);
		setRotationAngle(gun251_r2, 0.0F, 0.0F, -0.7854F);
		gun251_r2.cubeList.add(new ModelBox(gun251_r2, 98, 302, -0.5F, 2.5F, 9.5F, 1, 1, 2, 0.125F, false));

		gun252_r1 = new ModelRenderer(this);
		gun252_r1.setRotationPoint(-2.9963F, -36.9874F, -84.0F);
		muzzle.addChild(gun252_r1);
		setRotationAngle(gun252_r1, 0.0F, 0.0F, -0.7854F);
		gun252_r1.cubeList.add(new ModelBox(gun252_r1, 104, 302, -0.5F, 2.5F, 9.5F, 1, 1, 2, 0.125F, false));

		gun249_r1 = new ModelRenderer(this);
		gun249_r1.setRotationPoint(-4.2213F, -38.2228F, -87.2F);
		muzzle.addChild(gun249_r1);
		setRotationAngle(gun249_r1, 0.0F, 0.0F, -0.7854F);
		gun249_r1.cubeList.add(new ModelBox(gun249_r1, 0, 298, -0.5F, 2.5F, 9.5F, 1, 1, 3, 0.1F, false));

		gun250_r2 = new ModelRenderer(this);
		gun250_r2.setRotationPoint(-3.0213F, -38.2228F, -87.2F);
		muzzle.addChild(gun250_r2);
		setRotationAngle(gun250_r2, 0.0F, 0.0F, -0.7854F);
		gun250_r2.cubeList.add(new ModelBox(gun250_r2, 294, 297, -0.5F, 2.5F, 9.5F, 1, 1, 3, 0.1F, false));

		gun250_r3 = new ModelRenderer(this);
		gun250_r3.setRotationPoint(-4.2213F, -37.0228F, -87.2F);
		muzzle.addChild(gun250_r3);
		setRotationAngle(gun250_r3, 0.0F, 0.0F, -0.7854F);
		gun250_r3.cubeList.add(new ModelBox(gun250_r3, 254, 297, -0.5F, 2.5F, 9.5F, 1, 1, 3, 0.1F, false));

		gun251_r3 = new ModelRenderer(this);
		gun251_r3.setRotationPoint(-3.0213F, -37.0228F, -87.2F);
		muzzle.addChild(gun251_r3);
		setRotationAngle(gun251_r3, 0.0F, 0.0F, -0.7854F);
		gun251_r3.cubeList.add(new ModelBox(gun251_r3, 94, 297, -0.5F, 2.5F, 9.5F, 1, 1, 3, 0.1F, false));

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(-2.0F, -42.75F, -98.2F);
		muzzle.addChild(bone17);
		

		gun66 = new ModelRenderer(this);
		gun66.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone17.addChild(gun66);
		

		gun164_r1 = new ModelRenderer(this);
		gun164_r1.setRotationPoint(0.5F, 7.2571F, 18.9F);
		gun66.addChild(gun164_r1);
		setRotationAngle(gun164_r1, 0.0873F, 0.0F, 0.0F);
		gun164_r1.cubeList.add(new ModelBox(gun164_r1, 34, 298, -0.5F, 0.2071F, -1.5F, 1, 1, 3, 0.0F, false));

		gun163_r1 = new ModelRenderer(this);
		gun163_r1.setRotationPoint(0.5F, 7.2571F, 18.9F);
		gun66.addChild(gun163_r1);
		setRotationAngle(gun163_r1, -0.0873F, 0.0F, 0.0F);
		gun163_r1.cubeList.add(new ModelBox(gun163_r1, 26, 298, -0.5F, -1.2071F, -1.5F, 1, 1, 3, 0.0F, false));

		gun67 = new ModelRenderer(this);
		gun67.setRotationPoint(-1.0F, 1.0F, 0.0F);
		bone17.addChild(gun67);
		

		gun165_r1 = new ModelRenderer(this);
		gun165_r1.setRotationPoint(1.5F, 6.2571F, 18.9F);
		gun67.addChild(gun165_r1);
		setRotationAngle(gun165_r1, 0.0F, -0.0873F, 0.0F);
		gun165_r1.cubeList.add(new ModelBox(gun165_r1, 302, 133, 0.2071F, -0.5F, -0.5F, 1, 1, 2, 0.0F, false));

		gun164_r2 = new ModelRenderer(this);
		gun164_r2.setRotationPoint(1.5F, 6.2571F, 18.9F);
		gun67.addChild(gun164_r2);
		setRotationAngle(gun164_r2, 0.0F, 0.0873F, 0.0F);
		gun164_r2.cubeList.add(new ModelBox(gun164_r2, 302, 130, -1.2071F, -0.5F, -0.5F, 1, 1, 2, 0.0F, false));

		gun68 = new ModelRenderer(this);
		gun68.setRotationPoint(-1.0F, 1.0F, 0.0F);
		bone17.addChild(gun68);
		setRotationAngle(gun68, 0.0F, 0.0F, -0.7854F);
		

		gun165_r2 = new ModelRenderer(this);
		gun165_r2.setRotationPoint(-3.5406F, 5.6619F, 16.9F);
		gun68.addChild(gun165_r2);
		setRotationAngle(gun165_r2, -0.0873F, 0.0F, 0.0F);
		gun165_r2.cubeList.add(new ModelBox(gun165_r2, 42, 298, -0.3232F, -1.5575F, 0.477F, 1, 1, 3, 0.0F, false));

		gun69 = new ModelRenderer(this);
		gun69.setRotationPoint(-1.0F, 2.0F, 0.0F);
		bone17.addChild(gun69);
		setRotationAngle(gun69, 0.0F, 0.0F, -0.7854F);
		

		gun166_r1 = new ModelRenderer(this);
		gun166_r1.setRotationPoint(-2.8335F, 4.9548F, 16.9F);
		gun69.addChild(gun166_r1);
		setRotationAngle(gun166_r1, 0.0F, 0.0873F, 0.0F);
		gun166_r1.cubeList.add(new ModelBox(gun166_r1, 50, 298, -1.2053F, -0.6768F, 0.5078F, 1, 1, 3, 0.0F, false));

		gun61 = new ModelRenderer(this);
		gun61.setRotationPoint(1.0F, 0.0F, 0.0F);
		bone17.addChild(gun61);
		setRotationAngle(gun61, 0.0F, 0.0F, 0.7854F);
		

		gun168_r1 = new ModelRenderer(this);
		gun168_r1.setRotationPoint(4.9548F, 5.6619F, 16.9F);
		gun61.addChild(gun168_r1);
		setRotationAngle(gun168_r1, -0.0873F, 0.0F, 0.0F);
		gun168_r1.cubeList.add(new ModelBox(gun168_r1, 58, 298, -0.6768F, -1.5575F, 0.477F, 1, 1, 3, 0.0F, false));

		gun71 = new ModelRenderer(this);
		gun71.setRotationPoint(1.0F, 3.0F, 0.0F);
		bone17.addChild(gun71);
		setRotationAngle(gun71, 0.0F, 0.0F, -2.3562F);
		

		gun171_r1 = new ModelRenderer(this);
		gun171_r1.setRotationPoint(-2.8335F, -3.5406F, 16.9F);
		gun71.addChild(gun171_r1);
		setRotationAngle(gun171_r1, 0.0F, 0.0873F, 0.0F);
		gun171_r1.cubeList.add(new ModelBox(gun171_r1, 66, 298, -1.2053F, -0.3232F, 0.5078F, 1, 1, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		muzzle.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}