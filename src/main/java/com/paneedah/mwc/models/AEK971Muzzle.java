package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AEK971Muzzle extends ModelBase {
	private final ModelRenderer muzzle;
	private final ModelRenderer gun250_r1;
	private final ModelRenderer gun249_r1;
	private final ModelRenderer gun249_r2;
	private final ModelRenderer gun248_r1;
	private final ModelRenderer gun250_r2;
	private final ModelRenderer gun251_r1;
	private final ModelRenderer gun251_r2;
	private final ModelRenderer gun252_r1;
	private final ModelRenderer gun251_r3;
	private final ModelRenderer gun252_r2;
	private final ModelRenderer gun253_r1;
	private final ModelRenderer gun252_r3;

	public AEK971Muzzle() {
		textureWidth = 416;
		textureHeight = 416;

		muzzle = new ModelRenderer(this);
		muzzle.setRotationPoint(0.0F, 23.85F, -1.0F);
		muzzle.cubeList.add(new ModelBox(muzzle, 386, 308, -2.8485F, -35.9265F, -80.7F, 1, 1, 6, 0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 8, 387, -1.1515F, -35.9265F, -80.7F, 1, 1, 6, 0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 22, 387, -2.0F, -35.0779F, -80.7F, 1, 1, 6, 0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 36, 387, -2.0F, -36.775F, -80.7F, 1, 1, 6, 0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 402, 296, -2.8485F, -35.9265F, -85.1F, 1, 1, 1, 0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 402, 298, -1.1515F, -35.9265F, -85.1F, 1, 1, 1, 0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 402, 300, -2.0F, -35.0779F, -85.1F, 1, 1, 1, 0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 402, 367, -1.1515F, -35.9265F, -82.95F, 1, 1, 1, 0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 402, 361, -2.8485F, -35.9265F, -82.95F, 1, 1, 1, 0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 402, 304, -2.0F, -36.775F, -85.1F, 1, 1, 1, 0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 304, 389, -2.5F, -37.275F, -84.4F, 2, 1, 4, -0.4F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 316, 389, -2.5F, -34.5779F, -84.4F, 2, 1, 4, -0.4F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 340, 398, -2.8839F, -35.9161F, -74.5F, 1, 1, 2, 0.125F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 346, 398, -1.1161F, -35.9161F, -74.5F, 1, 1, 2, 0.125F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 352, 398, -2.0F, -35.0322F, -74.5F, 1, 1, 2, 0.125F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 370, 398, -2.0F, -36.8F, -74.5F, 1, 1, 2, 0.125F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 402, 306, -2.0F, -36.475F, -85.9F, 1, 1, 1, -0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 402, 349, -2.0F, -35.3436F, -85.9F, 1, 1, 1, -0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 402, 351, -1.4343F, -35.9093F, -85.9F, 1, 1, 1, -0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 402, 353, -2.5657F, -35.9093F, -85.9F, 1, 1, 1, -0.1F, false));

		gun250_r1 = new ModelRenderer(this);
		gun250_r1.setRotationPoint(-1.1F, -35.0093F, -101.4F);
		muzzle.addChild(gun250_r1);
		setRotationAngle(gun250_r1, 0.0F, 0.0F, -0.7854F);
		gun250_r1.cubeList.add(new ModelBox(gun250_r1, 402, 357, -0.5F, -0.5F, 15.5F, 1, 1, 1, -0.1F, false));

		gun249_r1 = new ModelRenderer(this);
		gun249_r1.setRotationPoint(-1.9F, -35.0093F, -101.4F);
		muzzle.addChild(gun249_r1);
		setRotationAngle(gun249_r1, 0.0F, 0.0F, -0.7854F);
		gun249_r1.cubeList.add(new ModelBox(gun249_r1, 402, 355, -0.5F, -0.5F, 15.5F, 1, 1, 1, -0.1F, false));

		gun249_r2 = new ModelRenderer(this);
		gun249_r2.setRotationPoint(-1.1F, -35.8093F, -101.4F);
		muzzle.addChild(gun249_r2);
		setRotationAngle(gun249_r2, 0.0F, 0.0F, -0.7854F);
		gun249_r2.cubeList.add(new ModelBox(gun249_r2, 402, 347, -0.5F, -0.5F, 15.5F, 1, 1, 1, -0.1F, false));

		gun248_r1 = new ModelRenderer(this);
		gun248_r1.setRotationPoint(-1.9F, -35.8093F, -101.4F);
		muzzle.addChild(gun248_r1);
		setRotationAngle(gun248_r1, 0.0F, 0.0F, -0.7854F);
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 402, 345, -0.5F, -0.5F, 15.5F, 1, 1, 1, -0.1F, false));

		gun250_r2 = new ModelRenderer(this);
		gun250_r2.setRotationPoint(-4.2463F, -38.1624F, -84.0F);
		muzzle.addChild(gun250_r2);
		setRotationAngle(gun250_r2, 0.0F, 0.0F, -0.7854F);
		gun250_r2.cubeList.add(new ModelBox(gun250_r2, 364, 398, -0.5F, 2.5F, 9.5F, 1, 1, 2, 0.125F, false));

		gun251_r1 = new ModelRenderer(this);
		gun251_r1.setRotationPoint(-2.9963F, -38.1624F, -84.0F);
		muzzle.addChild(gun251_r1);
		setRotationAngle(gun251_r1, 0.0F, 0.0F, -0.7854F);
		gun251_r1.cubeList.add(new ModelBox(gun251_r1, 358, 398, -0.5F, 2.5F, 9.5F, 1, 1, 2, 0.125F, false));

		gun251_r2 = new ModelRenderer(this);
		gun251_r2.setRotationPoint(-4.2463F, -36.9124F, -84.0F);
		muzzle.addChild(gun251_r2);
		setRotationAngle(gun251_r2, 0.0F, 0.0F, -0.7854F);
		gun251_r2.cubeList.add(new ModelBox(gun251_r2, 334, 398, -0.5F, 2.5F, 9.5F, 1, 1, 2, 0.125F, false));

		gun252_r1 = new ModelRenderer(this);
		gun252_r1.setRotationPoint(-2.9963F, -36.9124F, -84.0F);
		muzzle.addChild(gun252_r1);
		setRotationAngle(gun252_r1, 0.0F, 0.0F, -0.7854F);
		gun252_r1.cubeList.add(new ModelBox(gun252_r1, 322, 398, -0.5F, 2.5F, 9.5F, 1, 1, 2, 0.125F, false));

		gun251_r3 = new ModelRenderer(this);
		gun251_r3.setRotationPoint(-4.2213F, -38.1478F, -94.45F);
		muzzle.addChild(gun251_r3);
		setRotationAngle(gun251_r3, 0.0F, 0.0F, -0.7854F);
		gun251_r3.cubeList.add(new ModelBox(gun251_r3, 320, 401, -0.5F, 2.5F, 11.5F, 1, 1, 1, 0.1F, false));
		gun251_r3.cubeList.add(new ModelBox(gun251_r3, 316, 401, -0.5F, 2.5F, 9.35F, 1, 1, 1, 0.1F, false));
		gun251_r3.cubeList.add(new ModelBox(gun251_r3, 390, 264, -0.5F, 2.5F, 13.75F, 1, 1, 4, 0.1F, false));

		gun252_r2 = new ModelRenderer(this);
		gun252_r2.setRotationPoint(-4.2213F, -36.9478F, -94.45F);
		muzzle.addChild(gun252_r2);
		setRotationAngle(gun252_r2, 0.0F, 0.0F, -0.7854F);
		gun252_r2.cubeList.add(new ModelBox(gun252_r2, 324, 401, -0.5F, 2.5F, 11.5F, 1, 1, 1, 0.1F, false));
		gun252_r2.cubeList.add(new ModelBox(gun252_r2, 334, 396, -0.5F, 2.5F, 9.35F, 1, 1, 1, 0.1F, false));
		gun252_r2.cubeList.add(new ModelBox(gun252_r2, 390, 254, -0.5F, 2.5F, 13.75F, 1, 1, 4, 0.1F, false));

		gun253_r1 = new ModelRenderer(this);
		gun253_r1.setRotationPoint(-3.0213F, -36.9478F, -94.45F);
		muzzle.addChild(gun253_r1);
		setRotationAngle(gun253_r1, 0.0F, 0.0F, -0.7854F);
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 402, 363, -0.5F, 2.5F, 11.5F, 1, 1, 1, 0.1F, false));
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 402, 294, -0.5F, 2.5F, 9.35F, 1, 1, 1, 0.1F, false));
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 390, 249, -0.5F, 2.5F, 13.75F, 1, 1, 4, 0.1F, false));

		gun252_r3 = new ModelRenderer(this);
		gun252_r3.setRotationPoint(-3.0213F, -38.1478F, -94.45F);
		muzzle.addChild(gun252_r3);
		setRotationAngle(gun252_r3, 0.0F, 0.0F, -0.7854F);
		gun252_r3.cubeList.add(new ModelBox(gun252_r3, 402, 365, -0.5F, 2.5F, 11.5F, 1, 1, 1, 0.1F, false));
		gun252_r3.cubeList.add(new ModelBox(gun252_r3, 402, 302, -0.5F, 2.5F, 9.35F, 1, 1, 1, 0.1F, false));
		gun252_r3.cubeList.add(new ModelBox(gun252_r3, 390, 259, -0.5F, 2.5F, 13.75F, 1, 1, 4, 0.1F, false));
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