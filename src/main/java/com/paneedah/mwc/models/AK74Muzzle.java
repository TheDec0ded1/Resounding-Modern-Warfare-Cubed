package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AK74Muzzle extends ModelBase {
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

	public AK74Muzzle() {
		textureWidth = 352;
		textureHeight = 352;

		muzzle = new ModelRenderer(this);
		muzzle.setRotationPoint(0.0F, 23.85F, -5.0F);
		muzzle.cubeList.add(new ModelBox(muzzle, 162, 331, -2.8485F, -35.9265F, -77.7F, 1, 1, 3, 0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 332, 185, -1.1515F, -35.9265F, -77.7F, 1, 1, 3, 0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 332, 189, -2.0F, -35.0779F, -77.7F, 1, 1, 3, 0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 332, 197, -2.0F, -36.775F, -77.7F, 1, 1, 3, 0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 338, 112, -2.8485F, -35.9265F, -80.6F, 1, 1, 1, 0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 338, 110, -1.1515F, -35.9265F, -80.6F, 1, 1, 1, 0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 338, 108, -2.0F, -35.0779F, -80.6F, 1, 1, 1, 0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 338, 104, -2.0F, -36.775F, -80.6F, 1, 1, 1, 0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 310, 19, -2.5F, -37.275F, -80.4F, 2, 1, 3, -0.4F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 326, 283, -2.5F, -34.5779F, -80.4F, 2, 1, 3, -0.4F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 336, 276, -2.8839F, -35.9161F, -74.5F, 1, 1, 2, 0.125F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 336, 273, -1.1161F, -35.9161F, -74.5F, 1, 1, 2, 0.125F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 336, 270, -2.0F, -35.0322F, -74.5F, 1, 1, 2, 0.125F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 336, 261, -2.0F, -36.8F, -74.5F, 1, 1, 2, 0.125F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 338, 116, -2.0F, -36.475F, -81.4F, 1, 1, 1, -0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 338, 122, -2.0F, -35.3436F, -81.4F, 1, 1, 1, -0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 338, 124, -1.4343F, -35.9093F, -81.4F, 1, 1, 1, -0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 338, 126, -2.5657F, -35.9093F, -81.4F, 1, 1, 1, -0.1F, false));

		gun250_r1 = new ModelRenderer(this);
		gun250_r1.setRotationPoint(-1.1F, -35.0093F, -96.9F);
		muzzle.addChild(gun250_r1);
		setRotationAngle(gun250_r1, 0.0F, 0.0F, -0.7854F);
		gun250_r1.cubeList.add(new ModelBox(gun250_r1, 338, 130, -0.5F, -0.5F, 15.5F, 1, 1, 1, -0.1F, false));

		gun249_r1 = new ModelRenderer(this);
		gun249_r1.setRotationPoint(-1.9F, -35.0093F, -96.9F);
		muzzle.addChild(gun249_r1);
		setRotationAngle(gun249_r1, 0.0F, 0.0F, -0.7854F);
		gun249_r1.cubeList.add(new ModelBox(gun249_r1, 338, 128, -0.5F, -0.5F, 15.5F, 1, 1, 1, -0.1F, false));

		gun249_r2 = new ModelRenderer(this);
		gun249_r2.setRotationPoint(-1.1F, -35.8093F, -96.9F);
		muzzle.addChild(gun249_r2);
		setRotationAngle(gun249_r2, 0.0F, 0.0F, -0.7854F);
		gun249_r2.cubeList.add(new ModelBox(gun249_r2, 338, 120, -0.5F, -0.5F, 15.5F, 1, 1, 1, -0.1F, false));

		gun248_r1 = new ModelRenderer(this);
		gun248_r1.setRotationPoint(-1.9F, -35.8093F, -96.9F);
		muzzle.addChild(gun248_r1);
		setRotationAngle(gun248_r1, 0.0F, 0.0F, -0.7854F);
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 338, 118, -0.5F, -0.5F, 15.5F, 1, 1, 1, -0.1F, false));

		gun250_r2 = new ModelRenderer(this);
		gun250_r2.setRotationPoint(-4.2463F, -38.1624F, -84.0F);
		muzzle.addChild(gun250_r2);
		setRotationAngle(gun250_r2, 0.0F, 0.0F, -0.7854F);
		gun250_r2.cubeList.add(new ModelBox(gun250_r2, 336, 267, -0.5F, 2.5F, 9.5F, 1, 1, 2, 0.125F, false));

		gun251_r1 = new ModelRenderer(this);
		gun251_r1.setRotationPoint(-2.9963F, -38.1624F, -84.0F);
		muzzle.addChild(gun251_r1);
		setRotationAngle(gun251_r1, 0.0F, 0.0F, -0.7854F);
		gun251_r1.cubeList.add(new ModelBox(gun251_r1, 268, 336, -0.5F, 2.5F, 9.5F, 1, 1, 2, 0.125F, false));

		gun251_r2 = new ModelRenderer(this);
		gun251_r2.setRotationPoint(-4.2463F, -36.9124F, -84.0F);
		muzzle.addChild(gun251_r2);
		setRotationAngle(gun251_r2, 0.0F, 0.0F, -0.7854F);
		gun251_r2.cubeList.add(new ModelBox(gun251_r2, 336, 279, -0.5F, 2.5F, 9.5F, 1, 1, 2, 0.125F, false));

		gun252_r1 = new ModelRenderer(this);
		gun252_r1.setRotationPoint(-2.9963F, -36.9124F, -84.0F);
		muzzle.addChild(gun252_r1);
		setRotationAngle(gun252_r1, 0.0F, 0.0F, -0.7854F);
		gun252_r1.cubeList.add(new ModelBox(gun252_r1, 336, 282, -0.5F, 2.5F, 9.5F, 1, 1, 2, 0.125F, false));

		gun250_r3 = new ModelRenderer(this);
		gun250_r3.setRotationPoint(-4.2213F, -38.1478F, -92.1F);
		muzzle.addChild(gun250_r3);
		setRotationAngle(gun250_r3, 0.0F, 0.0F, -0.7854F);
		gun250_r3.cubeList.add(new ModelBox(gun250_r3, 334, 337, -0.5F, 2.5F, 11.5F, 1, 1, 1, 0.1F, false));
		gun250_r3.cubeList.add(new ModelBox(gun250_r3, 332, 193, -0.5F, 2.5F, 14.4F, 1, 1, 3, 0.1F, false));

		gun251_r3 = new ModelRenderer(this);
		gun251_r3.setRotationPoint(-3.0213F, -38.1478F, -92.1F);
		muzzle.addChild(gun251_r3);
		setRotationAngle(gun251_r3, 0.0F, 0.0F, -0.7854F);
		gun251_r3.cubeList.add(new ModelBox(gun251_r3, 338, 106, -0.5F, 2.5F, 11.5F, 1, 1, 1, 0.1F, false));
		gun251_r3.cubeList.add(new ModelBox(gun251_r3, 190, 332, -0.5F, 2.5F, 14.4F, 1, 1, 3, 0.1F, false));

		gun251_r4 = new ModelRenderer(this);
		gun251_r4.setRotationPoint(-4.2213F, -36.9478F, -92.1F);
		muzzle.addChild(gun251_r4);
		setRotationAngle(gun251_r4, 0.0F, 0.0F, -0.7854F);
		gun251_r4.cubeList.add(new ModelBox(gun251_r4, 338, 0, -0.5F, 2.5F, 11.5F, 1, 1, 1, 0.1F, false));
		gun251_r4.cubeList.add(new ModelBox(gun251_r4, 154, 331, -0.5F, 2.5F, 14.4F, 1, 1, 3, 0.1F, false));

		gun252_r2 = new ModelRenderer(this);
		gun252_r2.setRotationPoint(-3.0213F, -36.9478F, -92.1F);
		muzzle.addChild(gun252_r2);
		setRotationAngle(gun252_r2, 0.0F, 0.0F, -0.7854F);
		gun252_r2.cubeList.add(new ModelBox(gun252_r2, 338, 114, -0.5F, 2.5F, 11.5F, 1, 1, 1, 0.1F, false));
		gun252_r2.cubeList.add(new ModelBox(gun252_r2, 96, 331, -0.5F, 2.5F, 14.4F, 1, 1, 3, 0.1F, false));
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