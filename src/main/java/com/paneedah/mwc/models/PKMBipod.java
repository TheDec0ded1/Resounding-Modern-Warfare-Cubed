package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.10.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class PKMBipod extends ModelBase {
	private final ModelRenderer bipodPKM;
	private final ModelRenderer accessory15;
	private final ModelRenderer accessory16;
	private final ModelRenderer accessory17;
	private final ModelRenderer accessory18;
	private final ModelRenderer accessory19;
	private final ModelRenderer accessory20;
	private final ModelRenderer accessory21;
	private final ModelRenderer accessory22;
	private final ModelRenderer accessory23;
	private final ModelRenderer accessory24;
	private final ModelRenderer accessory25;
	private final ModelRenderer accessory26;
	private final ModelRenderer accessory27;
	private final ModelRenderer accessory28;
	private final ModelRenderer bone2;
	private final ModelRenderer gun15;
	private final ModelRenderer gun16;
	private final ModelRenderer gun19;
	private final ModelRenderer gun20;
	private final ModelRenderer gun25;
	private final ModelRenderer gun26;

	public PKMBipod() {
		textureWidth = 512;
		textureHeight = 512;

		bipodPKM = new ModelRenderer(this);
		bipodPKM.setRotationPoint(0.0F, 26.75F, 18.0F);
		

		accessory15 = new ModelRenderer(this);
		accessory15.setRotationPoint(-2.5F, -34.7F, -89.5F);
		bipodPKM.addChild(accessory15);
		accessory15.cubeList.add(new ModelBox(accessory15, 114, 9, 0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

		accessory16 = new ModelRenderer(this);
		accessory16.setRotationPoint(-2.3F, -32.7F, -88.8F);
		bipodPKM.addChild(accessory16);
		accessory16.cubeList.add(new ModelBox(accessory16, 46, 90, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		accessory17 = new ModelRenderer(this);
		accessory17.setRotationPoint(-1.7F, -32.7F, -88.8F);
		bipodPKM.addChild(accessory17);
		accessory17.cubeList.add(new ModelBox(accessory17, 39, 90, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		accessory18 = new ModelRenderer(this);
		accessory18.setRotationPoint(-1.0F, -32.7F, -89.2F);
		bipodPKM.addChild(accessory18);
		accessory18.cubeList.add(new ModelBox(accessory18, 0, 329, 0.0F, 0.0F, 0.0F, 1, 1, 35, 0.0F, false));

		accessory19 = new ModelRenderer(this);
		accessory19.setRotationPoint(-1.0F, -32.2F, -89.2F);
		bipodPKM.addChild(accessory19);
		accessory19.cubeList.add(new ModelBox(accessory19, 328, 182, 0.0F, 0.0F, 0.0F, 1, 1, 35, 0.0F, false));

		accessory20 = new ModelRenderer(this);
		accessory20.setRotationPoint(-3.0F, -32.2F, -89.2F);
		bipodPKM.addChild(accessory20);
		accessory20.cubeList.add(new ModelBox(accessory20, 328, 111, 0.0F, 0.0F, 0.0F, 1, 1, 35, 0.0F, false));

		accessory21 = new ModelRenderer(this);
		accessory21.setRotationPoint(-3.0F, -32.7F, -89.2F);
		bipodPKM.addChild(accessory21);
		accessory21.cubeList.add(new ModelBox(accessory21, 328, 39, 0.0F, 0.0F, 0.0F, 1, 1, 35, 0.0F, false));

		accessory22 = new ModelRenderer(this);
		accessory22.setRotationPoint(-0.9F, -32.45F, -79.5F);
		bipodPKM.addChild(accessory22);
		setRotationAngle(accessory22, 0.0F, 0.0087F, 0.0F);
		accessory22.cubeList.add(new ModelBox(accessory22, 144, 26, 0.0F, 0.0F, 0.0F, 1, 1, 25, 0.0F, false));

		accessory23 = new ModelRenderer(this);
		accessory23.setRotationPoint(-2.1F, -32.45F, -79.5F);
		bipodPKM.addChild(accessory23);
		setRotationAngle(accessory23, 0.0F, -0.0087F, 0.0F);
		accessory23.cubeList.add(new ModelBox(accessory23, 144, 0, -1.0F, 0.0F, 0.0F, 1, 1, 25, 0.0F, false));

		accessory24 = new ModelRenderer(this);
		accessory24.setRotationPoint(-3.4F, -32.9F, -63.2F);
		bipodPKM.addChild(accessory24);
		accessory24.cubeList.add(new ModelBox(accessory24, 117, 76, 0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

		accessory25 = new ModelRenderer(this);
		accessory25.setRotationPoint(-0.6F, -32.9F, -63.2F);
		bipodPKM.addChild(accessory25);
		accessory25.cubeList.add(new ModelBox(accessory25, 117, 72, 0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

		accessory26 = new ModelRenderer(this);
		accessory26.setRotationPoint(-2.0F, -34.2F, -91.5F);
		bipodPKM.addChild(accessory26);
		setRotationAngle(accessory26, 1.3384F, 0.0F, 0.0F);
		accessory26.cubeList.add(new ModelBox(accessory26, 33, 90, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		accessory27 = new ModelRenderer(this);
		accessory27.setRotationPoint(-4.1F, -33.4F, -55.1F);
		bipodPKM.addChild(accessory27);
		accessory27.cubeList.add(new ModelBox(accessory27, 22, 116, 0.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F, false));

		accessory28 = new ModelRenderer(this);
		accessory28.setRotationPoint(-0.9F, -33.4F, -55.1F);
		bipodPKM.addChild(accessory28);
		accessory28.cubeList.add(new ModelBox(accessory28, 115, 106, 0.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, -7.6F, -18.0F);
		bipodPKM.addChild(bone2);
		

		gun15 = new ModelRenderer(this);
		gun15.setRotationPoint(-2.0F, -40.0F, -70.5F);
		bone2.addChild(gun15);
		gun15.cubeList.add(new ModelBox(gun15, 193, 12, 0.0F, 11.0F, -3.1F, 1, 1, 5, 0.0F, false));
		gun15.cubeList.add(new ModelBox(gun15, 85, 161, 0.0F, 12.4142F, -3.1F, 1, 1, 5, 0.0F, false));

		gun16 = new ModelRenderer(this);
		gun16.setRotationPoint(-1.0F, -40.0F, -70.5F);
		bone2.addChild(gun16);
		setRotationAngle(gun16, 0.0F, 0.0F, 0.7854F);
		gun16.cubeList.add(new ModelBox(gun16, 193, 6, 7.7782F, 7.7782F, -3.1F, 1, 1, 5, 0.0F, false));

		gun19 = new ModelRenderer(this);
		gun19.setRotationPoint(-3.0F, -39.0F, -70.5F);
		bone2.addChild(gun19);
		gun19.cubeList.add(new ModelBox(gun19, 153, 186, 0.2929F, 10.7071F, -3.1F, 1, 1, 5, 0.0F, false));
		gun19.cubeList.add(new ModelBox(gun19, 9, 186, 1.7071F, 10.7071F, -3.1F, 1, 1, 5, 0.0F, false));

		gun20 = new ModelRenderer(this);
		gun20.setRotationPoint(-1.0F, -37.0F, -70.5F);
		bone2.addChild(gun20);
		setRotationAngle(gun20, 0.0F, 0.0F, -2.3562F);
		gun20.cubeList.add(new ModelBox(gun20, 107, 180, -7.364F, -7.364F, -3.1F, 1, 1, 5, 0.0F, false));

		gun25 = new ModelRenderer(this);
		gun25.setRotationPoint(-3.0F, -46.0F, -70.5F);
		bone2.addChild(gun25);
		setRotationAngle(gun25, 0.0F, 0.0F, -0.7854F);
		gun25.cubeList.add(new ModelBox(gun25, 179, 179, -12.3137F, 12.7279F, -3.1F, 1, 1, 5, 0.0F, false));

		gun26 = new ModelRenderer(this);
		gun26.setRotationPoint(-3.0F, -45.0F, -70.5F);
		bone2.addChild(gun26);
		setRotationAngle(gun26, 0.0F, 0.0F, -0.7854F);
		gun26.cubeList.add(new ModelBox(gun26, 156, 143, -12.3137F, 12.7279F, -3.1F, 1, 1, 5, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bipodPKM.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}