package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AK200Muzzle extends ModelBase {
	private final ModelRenderer muzzle;
	private final ModelRenderer gun250_r1;
	private final ModelRenderer gun249_r1;
	private final ModelRenderer gun249_r2;
	private final ModelRenderer gun248_r1;
	private final ModelRenderer gun250_r2;
	private final ModelRenderer gun251_r1;
	private final ModelRenderer gun251_r2;
	private final ModelRenderer gun252_r1;
	private final ModelRenderer gun250_r3;
	private final ModelRenderer gun251_r3;
	private final ModelRenderer gun251_r4;
	private final ModelRenderer gun252_r2;

	public AK200Muzzle() {
		textureWidth = 272;
		textureHeight = 272;

		muzzle = new ModelRenderer(this);
		muzzle.setRotationPoint(0.0F, 23.85F, -5.0F);
		muzzle.cubeList.add(new ModelBox(muzzle, 242, 168, -2.8485F, -35.9265F, -80.7F, 1, 1, 6, 0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 242, 175, -1.1515F, -35.9265F, -80.7F, 1, 1, 6, 0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 242, 182, -2.0F, -35.0779F, -80.7F, 1, 1, 6, 0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 24, 243, -2.0F, -36.775F, -80.7F, 1, 1, 6, 0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 252, 129, -2.8839F, -35.9161F, -74.5F, 1, 1, 2, 0.125F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 132, 252, -1.1161F, -35.9161F, -74.5F, 1, 1, 2, 0.125F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 252, 132, -2.0F, -35.0322F, -74.5F, 1, 1, 2, 0.125F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 176, 252, -2.0F, -36.8F, -74.5F, 1, 1, 2, 0.125F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 174, 259, -2.0F, -36.475F, -81.5F, 1, 1, 1, -0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 258, 259, -2.0F, -35.3436F, -81.5F, 1, 1, 1, -0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 260, 21, -1.4343F, -35.9093F, -81.5F, 1, 1, 1, -0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 260, 23, -2.5657F, -35.9093F, -81.5F, 1, 1, 1, -0.1F, false));

		gun250_r1 = new ModelRenderer(this);
		gun250_r1.setRotationPoint(-1.1F, -35.0093F, -97.0F);
		muzzle.addChild(gun250_r1);
		setRotationAngle(gun250_r1, 0.0F, 0.0F, -0.7854F);
		gun250_r1.cubeList.add(new ModelBox(gun250_r1, 260, 27, -0.5F, -0.5F, 15.5F, 1, 1, 1, -0.1F, false));

		gun249_r1 = new ModelRenderer(this);
		gun249_r1.setRotationPoint(-1.9F, -35.0093F, -97.0F);
		muzzle.addChild(gun249_r1);
		setRotationAngle(gun249_r1, 0.0F, 0.0F, -0.7854F);
		gun249_r1.cubeList.add(new ModelBox(gun249_r1, 260, 25, -0.5F, -0.5F, 15.5F, 1, 1, 1, -0.1F, false));

		gun249_r2 = new ModelRenderer(this);
		gun249_r2.setRotationPoint(-1.1F, -35.8093F, -97.0F);
		muzzle.addChild(gun249_r2);
		setRotationAngle(gun249_r2, 0.0F, 0.0F, -0.7854F);
		gun249_r2.cubeList.add(new ModelBox(gun249_r2, 254, 259, -0.5F, -0.5F, 15.5F, 1, 1, 1, -0.1F, false));

		gun248_r1 = new ModelRenderer(this);
		gun248_r1.setRotationPoint(-1.9F, -35.8093F, -97.0F);
		muzzle.addChild(gun248_r1);
		setRotationAngle(gun248_r1, 0.0F, 0.0F, -0.7854F);
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 178, 259, -0.5F, -0.5F, 15.5F, 1, 1, 1, -0.1F, false));

		gun250_r2 = new ModelRenderer(this);
		gun250_r2.setRotationPoint(-4.2463F, -38.1624F, -84.0F);
		muzzle.addChild(gun250_r2);
		setRotationAngle(gun250_r2, 0.0F, 0.0F, -0.7854F);
		gun250_r2.cubeList.add(new ModelBox(gun250_r2, 144, 252, -0.5F, 2.5F, 9.5F, 1, 1, 2, 0.125F, false));

		gun251_r1 = new ModelRenderer(this);
		gun251_r1.setRotationPoint(-2.9963F, -38.1624F, -84.0F);
		muzzle.addChild(gun251_r1);
		setRotationAngle(gun251_r1, 0.0F, 0.0F, -0.7854F);
		gun251_r1.cubeList.add(new ModelBox(gun251_r1, 138, 252, -0.5F, 2.5F, 9.5F, 1, 1, 2, 0.125F, false));

		gun251_r2 = new ModelRenderer(this);
		gun251_r2.setRotationPoint(-4.2463F, -36.9124F, -84.0F);
		muzzle.addChild(gun251_r2);
		setRotationAngle(gun251_r2, 0.0F, 0.0F, -0.7854F);
		gun251_r2.cubeList.add(new ModelBox(gun251_r2, 66, 252, -0.5F, 2.5F, 9.5F, 1, 1, 2, 0.125F, false));

		gun252_r1 = new ModelRenderer(this);
		gun252_r1.setRotationPoint(-2.9963F, -36.9124F, -84.0F);
		muzzle.addChild(gun252_r1);
		setRotationAngle(gun252_r1, 0.0F, 0.0F, -0.7854F);
		gun252_r1.cubeList.add(new ModelBox(gun252_r1, 60, 252, -0.5F, 2.5F, 9.5F, 1, 1, 2, 0.125F, false));

		gun250_r3 = new ModelRenderer(this);
		gun250_r3.setRotationPoint(-4.2213F, -38.1478F, -92.2F);
		muzzle.addChild(gun250_r3);
		setRotationAngle(gun250_r3, 0.0F, 0.0F, -0.7854F);
		gun250_r3.cubeList.add(new ModelBox(gun250_r3, 166, 254, -0.5F, 2.5F, 11.5F, 1, 1, 1, 0.1F, false));
		gun250_r3.cubeList.add(new ModelBox(gun250_r3, 158, 254, -0.5F, 2.5F, 16.5F, 1, 1, 1, 0.1F, false));

		gun251_r3 = new ModelRenderer(this);
		gun251_r3.setRotationPoint(-3.0213F, -38.1478F, -92.2F);
		muzzle.addChild(gun251_r3);
		setRotationAngle(gun251_r3, 0.0F, 0.0F, -0.7854F);
		gun251_r3.cubeList.add(new ModelBox(gun251_r3, 144, 259, -0.5F, 2.5F, 11.5F, 1, 1, 1, 0.1F, false));
		gun251_r3.cubeList.add(new ModelBox(gun251_r3, 136, 259, -0.5F, 2.5F, 16.5F, 1, 1, 1, 0.1F, false));

		gun251_r4 = new ModelRenderer(this);
		gun251_r4.setRotationPoint(-4.2213F, -36.9478F, -92.2F);
		muzzle.addChild(gun251_r4);
		setRotationAngle(gun251_r4, 0.0F, 0.0F, -0.7854F);
		gun251_r4.cubeList.add(new ModelBox(gun251_r4, 162, 254, -0.5F, 2.5F, 11.5F, 1, 1, 1, 0.1F, false));
		gun251_r4.cubeList.add(new ModelBox(gun251_r4, 154, 254, -0.5F, 2.5F, 16.5F, 1, 1, 1, 0.1F, false));

		gun252_r2 = new ModelRenderer(this);
		gun252_r2.setRotationPoint(-3.0213F, -36.9478F, -92.2F);
		muzzle.addChild(gun252_r2);
		setRotationAngle(gun252_r2, 0.0F, 0.0F, -0.7854F);
		gun252_r2.cubeList.add(new ModelBox(gun252_r2, 140, 259, -0.5F, 2.5F, 11.5F, 1, 1, 1, 0.1F, false));
		gun252_r2.cubeList.add(new ModelBox(gun252_r2, 132, 259, -0.5F, 2.5F, 16.5F, 1, 1, 1, 0.1F, false));
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