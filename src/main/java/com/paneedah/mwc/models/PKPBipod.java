package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.10.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class PKPBipod extends ModelBase {
	private final ModelRenderer bipodPKP;
	private final ModelRenderer accessory2;
	private final ModelRenderer accessory3;
	private final ModelRenderer accessory4;
	private final ModelRenderer accessory5;
	private final ModelRenderer accessory6;
	private final ModelRenderer accessory7;
	private final ModelRenderer accessory8;
	private final ModelRenderer accessory9;
	private final ModelRenderer accessory10;
	private final ModelRenderer accessory11;
	private final ModelRenderer accessory12;
	private final ModelRenderer accessory14;
	private final ModelRenderer accessory29;
	private final ModelRenderer bone28;
	private final ModelRenderer gun145;
	private final ModelRenderer gun146;
	private final ModelRenderer gun147;
	private final ModelRenderer gun148;
	private final ModelRenderer gun149;
	private final ModelRenderer gun150;

	public PKPBipod() {
		textureWidth = 512;
		textureHeight = 512;

		bipodPKP = new ModelRenderer(this);
		bipodPKP.setRotationPoint(0.0F, 23.75F, -12.5F);
		

		accessory2 = new ModelRenderer(this);
		accessory2.setRotationPoint(-2.5F, -34.7F, -89.5F);
		bipodPKP.addChild(accessory2);
		accessory2.cubeList.add(new ModelBox(accessory2, 134, 130, 0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

		accessory3 = new ModelRenderer(this);
		accessory3.setRotationPoint(-2.3F, -32.7F, -88.8F);
		bipodPKP.addChild(accessory3);
		accessory3.cubeList.add(new ModelBox(accessory3, 54, 0, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		accessory4 = new ModelRenderer(this);
		accessory4.setRotationPoint(-1.7F, -32.7F, -88.8F);
		bipodPKP.addChild(accessory4);
		accessory4.cubeList.add(new ModelBox(accessory4, 52, 30, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		accessory5 = new ModelRenderer(this);
		accessory5.setRotationPoint(-1.0F, -32.7F, -89.2F);
		bipodPKP.addChild(accessory5);
		accessory5.cubeList.add(new ModelBox(accessory5, 63, 324, 0.0F, 0.0F, 0.0F, 1, 1, 35, 0.0F, false));

		accessory6 = new ModelRenderer(this);
		accessory6.setRotationPoint(-1.0F, -32.2F, -89.2F);
		bipodPKP.addChild(accessory6);
		accessory6.cubeList.add(new ModelBox(accessory6, 299, 321, 0.0F, 0.0F, 0.0F, 1, 1, 35, 0.0F, false));

		accessory7 = new ModelRenderer(this);
		accessory7.setRotationPoint(-3.0F, -32.2F, -89.2F);
		bipodPKP.addChild(accessory7);
		accessory7.cubeList.add(new ModelBox(accessory7, 296, 285, 0.0F, 0.0F, 0.0F, 1, 1, 35, 0.0F, false));

		accessory8 = new ModelRenderer(this);
		accessory8.setRotationPoint(-3.0F, -32.7F, -89.2F);
		bipodPKP.addChild(accessory8);
		accessory8.cubeList.add(new ModelBox(accessory8, 94, 285, 0.0F, 0.0F, 0.0F, 1, 1, 35, 0.0F, false));

		accessory9 = new ModelRenderer(this);
		accessory9.setRotationPoint(-0.9F, -32.45F, -79.5F);
		bipodPKP.addChild(accessory9);
		setRotationAngle(accessory9, 0.0F, 0.0087F, 0.0F);
		accessory9.cubeList.add(new ModelBox(accessory9, 72, 143, 0.0F, 0.0F, 0.0F, 1, 1, 25, 0.0F, false));

		accessory10 = new ModelRenderer(this);
		accessory10.setRotationPoint(-2.1F, -32.45F, -79.5F);
		bipodPKP.addChild(accessory10);
		setRotationAngle(accessory10, 0.0F, -0.0087F, 0.0F);
		accessory10.cubeList.add(new ModelBox(accessory10, 0, 142, -1.0F, 0.0F, 0.0F, 1, 1, 25, 0.0F, false));

		accessory11 = new ModelRenderer(this);
		accessory11.setRotationPoint(-3.4F, -32.9F, -63.2F);
		bipodPKP.addChild(accessory11);
		accessory11.cubeList.add(new ModelBox(accessory11, 108, 132, 0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

		accessory12 = new ModelRenderer(this);
		accessory12.setRotationPoint(-0.6F, -32.9F, -63.2F);
		bipodPKP.addChild(accessory12);
		accessory12.cubeList.add(new ModelBox(accessory12, 55, 127, 0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

		accessory14 = new ModelRenderer(this);
		accessory14.setRotationPoint(-4.1F, -33.4F, -55.1F);
		bipodPKP.addChild(accessory14);
		accessory14.cubeList.add(new ModelBox(accessory14, 126, 80, 0.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F, false));

		accessory29 = new ModelRenderer(this);
		accessory29.setRotationPoint(-0.9F, -33.4F, -55.1F);
		bipodPKP.addChild(accessory29);
		accessory29.cubeList.add(new ModelBox(accessory29, 126, 72, 0.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F, false));

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(0.0F, -7.6F, -18.0F);
		bipodPKP.addChild(bone28);
		

		gun145 = new ModelRenderer(this);
		gun145.setRotationPoint(-2.0F, -40.0F, -70.5F);
		bone28.addChild(gun145);
		gun145.cubeList.add(new ModelBox(gun145, 134, 106, 0.0F, 11.0F, -1.5F, 1, 1, 3, 0.0F, false));
		gun145.cubeList.add(new ModelBox(gun145, 114, 0, 0.0F, 12.4142F, -1.5F, 1, 1, 3, 0.0F, false));

		gun146 = new ModelRenderer(this);
		gun146.setRotationPoint(-1.0F, -40.0F, -70.5F);
		bone28.addChild(gun146);
		setRotationAngle(gun146, 0.0F, 0.0F, 0.7854F);
		gun146.cubeList.add(new ModelBox(gun146, 118, 22, 7.7782F, 7.7782F, -1.5F, 1, 1, 3, 0.0F, false));

		gun147 = new ModelRenderer(this);
		gun147.setRotationPoint(-3.0F, -39.0F, -70.5F);
		bone28.addChild(gun147);
		gun147.cubeList.add(new ModelBox(gun147, 134, 102, 0.2929F, 10.7071F, -1.5F, 1, 1, 3, 0.0F, false));
		gun147.cubeList.add(new ModelBox(gun147, 134, 35, 1.7071F, 10.7071F, -1.5F, 1, 1, 3, 0.0F, false));

		gun148 = new ModelRenderer(this);
		gun148.setRotationPoint(-1.0F, -37.0F, -70.5F);
		bone28.addChild(gun148);
		setRotationAngle(gun148, 0.0F, 0.0F, -2.3562F);
		gun148.cubeList.add(new ModelBox(gun148, 134, 31, -7.364F, -7.364F, -1.5F, 1, 1, 3, 0.0F, false));

		gun149 = new ModelRenderer(this);
		gun149.setRotationPoint(-3.0F, -46.0F, -70.5F);
		bone28.addChild(gun149);
		setRotationAngle(gun149, 0.0F, 0.0F, -0.7854F);
		gun149.cubeList.add(new ModelBox(gun149, 134, 4, -12.3137F, 12.7279F, -1.5F, 1, 1, 3, 0.0F, false));

		gun150 = new ModelRenderer(this);
		gun150.setRotationPoint(-3.0F, -45.0F, -70.5F);
		bone28.addChild(gun150);
		setRotationAngle(gun150, 0.0F, 0.0F, -0.7854F);
		gun150.cubeList.add(new ModelBox(gun150, 0, 114, -12.3137F, 12.7279F, -1.5F, 1, 1, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bipodPKP.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}