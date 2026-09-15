package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AKS74UMuzzle extends ModelBase {
	private final ModelRenderer muzzle;
	private final ModelRenderer gun251_r1;
	private final ModelRenderer gun252_r1;
	private final ModelRenderer gun252_r2;
	private final ModelRenderer gun253_r1;
	private final ModelRenderer gun249_r1;
	private final ModelRenderer gun250_r1;
	private final ModelRenderer gun250_r2;
	private final ModelRenderer gun251_r2;
	private final ModelRenderer bone3;
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

	public AKS74UMuzzle() {
		textureWidth = 304;
		textureHeight = 304;

		muzzle = new ModelRenderer(this);
		muzzle.setRotationPoint(-1.52F, -11.9348F, -57.684F);
		muzzle.cubeList.add(new ModelBox(muzzle, 180, 274, -1.3285F, -0.2167F, -2.516F, 1, 1, 4, 0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 190, 274, 0.3685F, -0.2167F, -2.516F, 1, 1, 4, 0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 206, 274, -0.48F, 0.6319F, -2.516F, 1, 1, 4, 0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 274, 221, -0.48F, -1.0652F, -2.516F, 1, 1, 4, 0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 32, 287, -1.3639F, -0.2063F, 1.684F, 1, 1, 1, 0.125F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 36, 287, 0.4039F, -0.2063F, 1.684F, 1, 1, 1, 0.125F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 40, 287, -0.48F, 0.6776F, 1.684F, 1, 1, 1, 0.125F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 98, 287, -0.48F, -1.0902F, 1.684F, 1, 1, 1, 0.125F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 156, 287, -1.3639F, -0.2063F, -2.416F, 1, 1, 1, 0.125F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 152, 287, 0.4039F, -0.2063F, -2.416F, 1, 1, 1, 0.125F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 148, 287, -0.48F, 0.6776F, -2.416F, 1, 1, 1, 0.125F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 116, 287, -0.48F, -1.0902F, -2.416F, 1, 1, 1, 0.125F, false));

		gun251_r1 = new ModelRenderer(this);
		gun251_r1.setRotationPoint(-2.7263F, -2.4526F, -12.916F);
		muzzle.addChild(gun251_r1);
		setRotationAngle(gun251_r1, 0.0F, 0.0F, -0.7854F);
		gun251_r1.cubeList.add(new ModelBox(gun251_r1, 120, 287, -0.5F, 2.5F, 10.5F, 1, 1, 1, 0.125F, false));
		gun251_r1.cubeList.add(new ModelBox(gun251_r1, 48, 287, -0.5F, 2.5F, 14.6F, 1, 1, 1, 0.125F, false));

		gun252_r1 = new ModelRenderer(this);
		gun252_r1.setRotationPoint(-1.4763F, -2.4526F, -12.916F);
		muzzle.addChild(gun252_r1);
		setRotationAngle(gun252_r1, 0.0F, 0.0F, -0.7854F);
		gun252_r1.cubeList.add(new ModelBox(gun252_r1, 144, 287, -0.5F, 2.5F, 10.5F, 1, 1, 1, 0.125F, false));
		gun252_r1.cubeList.add(new ModelBox(gun252_r1, 44, 287, -0.5F, 2.5F, 14.6F, 1, 1, 1, 0.125F, false));

		gun252_r2 = new ModelRenderer(this);
		gun252_r2.setRotationPoint(-2.7263F, -1.2026F, -12.916F);
		muzzle.addChild(gun252_r2);
		setRotationAngle(gun252_r2, 0.0F, 0.0F, -0.7854F);
		gun252_r2.cubeList.add(new ModelBox(gun252_r2, 170, 287, -0.5F, 2.5F, 10.5F, 1, 1, 1, 0.125F, false));
		gun252_r2.cubeList.add(new ModelBox(gun252_r2, 28, 287, -0.5F, 2.5F, 14.6F, 1, 1, 1, 0.125F, false));

		gun253_r1 = new ModelRenderer(this);
		gun253_r1.setRotationPoint(-1.4763F, -1.2026F, -12.916F);
		muzzle.addChild(gun253_r1);
		setRotationAngle(gun253_r1, 0.0F, 0.0F, -0.7854F);
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 174, 287, -0.5F, 2.5F, 10.5F, 1, 1, 1, 0.125F, false));
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 24, 287, -0.5F, 2.5F, 14.6F, 1, 1, 1, 0.125F, false));

		gun249_r1 = new ModelRenderer(this);
		gun249_r1.setRotationPoint(-2.7013F, -2.438F, -12.016F);
		muzzle.addChild(gun249_r1);
		setRotationAngle(gun249_r1, 0.0F, 0.0F, -0.7854F);
		gun249_r1.cubeList.add(new ModelBox(gun249_r1, 274, 216, -0.5F, 2.5F, 9.5F, 1, 1, 4, 0.1F, false));

		gun250_r1 = new ModelRenderer(this);
		gun250_r1.setRotationPoint(-1.5013F, -2.438F, -12.016F);
		muzzle.addChild(gun250_r1);
		setRotationAngle(gun250_r1, 0.0F, 0.0F, -0.7854F);
		gun250_r1.cubeList.add(new ModelBox(gun250_r1, 216, 274, -0.5F, 2.5F, 9.5F, 1, 1, 4, 0.1F, false));

		gun250_r2 = new ModelRenderer(this);
		gun250_r2.setRotationPoint(-2.7013F, -1.238F, -12.016F);
		muzzle.addChild(gun250_r2);
		setRotationAngle(gun250_r2, 0.0F, 0.0F, -0.7854F);
		gun250_r2.cubeList.add(new ModelBox(gun250_r2, 154, 274, -0.5F, 2.5F, 9.5F, 1, 1, 4, 0.1F, false));

		gun251_r2 = new ModelRenderer(this);
		gun251_r2.setRotationPoint(-1.5013F, -1.238F, -12.016F);
		muzzle.addChild(gun251_r2);
		setRotationAngle(gun251_r2, 0.0F, 0.0F, -0.7854F);
		gun251_r2.cubeList.add(new ModelBox(gun251_r2, 262, 14, -0.5F, 2.5F, 9.5F, 1, 1, 4, 0.1F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-0.48F, -6.9652F, -22.016F);
		muzzle.addChild(bone3);
		

		gun66 = new ModelRenderer(this);
		gun66.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(gun66);
		

		gun164_r1 = new ModelRenderer(this);
		gun164_r1.setRotationPoint(0.5F, 7.2571F, 17.9F);
		gun66.addChild(gun164_r1);
		setRotationAngle(gun164_r1, 0.0873F, 0.0F, 0.0F);
		gun164_r1.cubeList.add(new ModelBox(gun164_r1, 32, 280, -0.5F, 0.2071F, -1.5F, 1, 1, 3, 0.0F, false));

		gun163_r1 = new ModelRenderer(this);
		gun163_r1.setRotationPoint(0.5F, 7.2571F, 17.9F);
		gun66.addChild(gun163_r1);
		setRotationAngle(gun163_r1, -0.0873F, 0.0F, 0.0F);
		gun163_r1.cubeList.add(new ModelBox(gun163_r1, 24, 280, -0.5F, -1.2071F, -1.5F, 1, 1, 3, 0.0F, false));

		gun67 = new ModelRenderer(this);
		gun67.setRotationPoint(-1.0F, 1.0F, 0.0F);
		bone3.addChild(gun67);
		

		gun165_r1 = new ModelRenderer(this);
		gun165_r1.setRotationPoint(1.5F, 6.2571F, 17.9F);
		gun67.addChild(gun165_r1);
		setRotationAngle(gun165_r1, 0.0F, -0.0873F, 0.0F);
		gun165_r1.cubeList.add(new ModelBox(gun165_r1, 284, 106, 0.2071F, -0.5F, -0.5F, 1, 1, 2, 0.0F, false));

		gun164_r2 = new ModelRenderer(this);
		gun164_r2.setRotationPoint(1.5F, 6.2571F, 17.9F);
		gun67.addChild(gun164_r2);
		setRotationAngle(gun164_r2, 0.0F, 0.0873F, 0.0F);
		gun164_r2.cubeList.add(new ModelBox(gun164_r2, 284, 103, -1.2071F, -0.5F, -0.5F, 1, 1, 2, 0.0F, false));

		gun68 = new ModelRenderer(this);
		gun68.setRotationPoint(-1.0F, 1.0F, 0.0F);
		bone3.addChild(gun68);
		setRotationAngle(gun68, 0.0F, 0.0F, -0.7854F);
		

		gun165_r2 = new ModelRenderer(this);
		gun165_r2.setRotationPoint(-3.5406F, 5.6619F, 16.9F);
		gun68.addChild(gun165_r2);
		setRotationAngle(gun165_r2, -0.0873F, 0.0F, 0.0F);
		gun165_r2.cubeList.add(new ModelBox(gun165_r2, 280, 36, -0.3232F, -1.4704F, -0.5192F, 1, 1, 3, 0.0F, false));

		gun69 = new ModelRenderer(this);
		gun69.setRotationPoint(-1.0F, 2.0F, 0.0F);
		bone3.addChild(gun69);
		setRotationAngle(gun69, 0.0F, 0.0F, -0.7854F);
		

		gun166_r1 = new ModelRenderer(this);
		gun166_r1.setRotationPoint(-2.8335F, 4.9548F, 16.9F);
		gun69.addChild(gun166_r1);
		setRotationAngle(gun166_r1, 0.0F, 0.0873F, 0.0F);
		gun166_r1.cubeList.add(new ModelBox(gun166_r1, 40, 280, -1.1182F, -0.6768F, -0.4884F, 1, 1, 3, 0.0F, false));

		gun61 = new ModelRenderer(this);
		gun61.setRotationPoint(1.0F, 0.0F, 0.0F);
		bone3.addChild(gun61);
		setRotationAngle(gun61, 0.0F, 0.0F, 0.7854F);
		

		gun168_r1 = new ModelRenderer(this);
		gun168_r1.setRotationPoint(4.9548F, 5.6619F, 16.9F);
		gun61.addChild(gun168_r1);
		setRotationAngle(gun168_r1, -0.0873F, 0.0F, 0.0F);
		gun168_r1.cubeList.add(new ModelBox(gun168_r1, 280, 40, -0.6768F, -1.4704F, -0.5192F, 1, 1, 3, 0.0F, false));

		gun71 = new ModelRenderer(this);
		gun71.setRotationPoint(1.0F, 3.0F, 0.0F);
		bone3.addChild(gun71);
		setRotationAngle(gun71, 0.0F, 0.0F, -2.3562F);
		

		gun171_r1 = new ModelRenderer(this);
		gun171_r1.setRotationPoint(-2.8335F, -3.5406F, 16.9F);
		gun71.addChild(gun171_r1);
		setRotationAngle(gun171_r1, 0.0F, 0.0873F, 0.0F);
		gun171_r1.cubeList.add(new ModelBox(gun171_r1, 280, 44, -1.1182F, -0.3232F, -0.4884F, 1, 1, 3, 0.0F, false));
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