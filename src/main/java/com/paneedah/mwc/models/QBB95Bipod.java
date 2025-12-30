package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBB95Bipod extends ModelBase {
	private final ModelRenderer bipod;
	private final ModelRenderer accessory15;
	private final ModelRenderer accessory16;
	private final ModelRenderer accessory17;
	private final ModelRenderer accessory18;
	private final ModelRenderer accessory18_r1;
	private final ModelRenderer accessory19;
	private final ModelRenderer accessory19_r1;
	private final ModelRenderer accessory20;
	private final ModelRenderer accessory20_r1;
	private final ModelRenderer accessory21;
	private final ModelRenderer accessory21_r1;
	private final ModelRenderer accessory22;
	private final ModelRenderer accessory22_r1;
	private final ModelRenderer accessory23;
	private final ModelRenderer accessory23_r1;
	private final ModelRenderer accessory24;
	private final ModelRenderer accessory24_r1;
	private final ModelRenderer accessory25;
	private final ModelRenderer accessory25_r1;
	private final ModelRenderer accessory27;
	private final ModelRenderer accessory27_r1;
	private final ModelRenderer accessory28;
	private final ModelRenderer accessory28_r1;
	private final ModelRenderer bone3;
	private final ModelRenderer gun15;
	private final ModelRenderer gun16;
	private final ModelRenderer gun19;
	private final ModelRenderer gun20;
	private final ModelRenderer gun25;
	private final ModelRenderer gun26;

	public QBB95Bipod() {
		textureWidth = 480;
		textureHeight = 480;

		bipod = new ModelRenderer(this);
		bipod.setRotationPoint(0.0F, 24.35F, 47.2F);
		

		accessory15 = new ModelRenderer(this);
		accessory15.setRotationPoint(-2.5F, -34.7F, -89.5F);
		bipod.addChild(accessory15);
		accessory15.cubeList.add(new ModelBox(accessory15, 452, 321, 0.0F, 0.0F, -2.1F, 2, 2, 2, 0.0F, false));

		accessory16 = new ModelRenderer(this);
		accessory16.setRotationPoint(-2.3F, -32.7F, -88.8F);
		bipod.addChild(accessory16);
		accessory16.cubeList.add(new ModelBox(accessory16, 461, 287, 0.0F, -0.8F, -2.5F, 1, 2, 1, 0.0F, false));

		accessory17 = new ModelRenderer(this);
		accessory17.setRotationPoint(-1.7F, -32.7F, -88.8F);
		bipod.addChild(accessory17);
		accessory17.cubeList.add(new ModelBox(accessory17, 295, 461, 0.0F, -0.8F, -2.5F, 1, 2, 1, 0.0F, false));

		accessory18 = new ModelRenderer(this);
		accessory18.setRotationPoint(-1.0F, -32.7F, -89.2F);
		bipod.addChild(accessory18);
		

		accessory18_r1 = new ModelRenderer(this);
		accessory18_r1.setRotationPoint(-0.5F, 1.2697F, 19.7426F);
		accessory18.addChild(accessory18_r1);
		setRotationAngle(accessory18_r1, -0.0436F, 0.0F, 0.0F);
		accessory18_r1.cubeList.add(new ModelBox(accessory18_r1, 361, 258, 0.5F, -0.6382F, -21.8168F, 1, 1, 29, 0.0F, false));

		accessory19 = new ModelRenderer(this);
		accessory19.setRotationPoint(-1.0F, -32.2F, -89.2F);
		bipod.addChild(accessory19);
		

		accessory19_r1 = new ModelRenderer(this);
		accessory19_r1.setRotationPoint(-0.5F, 0.7697F, 19.7426F);
		accessory19.addChild(accessory19_r1);
		setRotationAngle(accessory19_r1, -0.0436F, 0.0F, 0.0F);
		accessory19_r1.cubeList.add(new ModelBox(accessory19_r1, 256, 362, 0.5F, -0.1382F, -21.8168F, 1, 1, 29, 0.0F, false));

		accessory20 = new ModelRenderer(this);
		accessory20.setRotationPoint(-3.0F, -32.2F, -89.2F);
		bipod.addChild(accessory20);
		

		accessory20_r1 = new ModelRenderer(this);
		accessory20_r1.setRotationPoint(1.5F, 0.7697F, 19.7426F);
		accessory20.addChild(accessory20_r1);
		setRotationAngle(accessory20_r1, -0.0436F, 0.0F, 0.0F);
		accessory20_r1.cubeList.add(new ModelBox(accessory20_r1, 317, 362, -1.5F, -0.1382F, -21.8168F, 1, 1, 29, 0.0F, false));

		accessory21 = new ModelRenderer(this);
		accessory21.setRotationPoint(-3.0F, -32.7F, -89.2F);
		bipod.addChild(accessory21);
		

		accessory21_r1 = new ModelRenderer(this);
		accessory21_r1.setRotationPoint(1.5F, 1.2697F, 19.7426F);
		accessory21.addChild(accessory21_r1);
		setRotationAngle(accessory21_r1, -0.0436F, 0.0F, 0.0F);
		accessory21_r1.cubeList.add(new ModelBox(accessory21_r1, 0, 363, -1.5F, -0.6382F, -21.8168F, 1, 1, 29, 0.0F, false));

		accessory22 = new ModelRenderer(this);
		accessory22.setRotationPoint(-0.9F, -32.45F, -79.5F);
		bipod.addChild(accessory22);
		setRotationAngle(accessory22, 0.0F, 0.0087F, 0.0F);
		

		accessory22_r1 = new ModelRenderer(this);
		accessory22_r1.setRotationPoint(-0.6874F, 2.3197F, 10.037F);
		accessory22.addChild(accessory22_r1);
		setRotationAngle(accessory22_r1, -0.0436F, 0.0F, -0.0004F);
		accessory22_r1.cubeList.add(new ModelBox(accessory22_r1, 78, 394, 0.7059F, -1.6869F, -12.1678F, 1, 1, 19, 0.0F, false));

		accessory23 = new ModelRenderer(this);
		accessory23.setRotationPoint(-2.1F, -32.45F, -79.5F);
		bipod.addChild(accessory23);
		setRotationAngle(accessory23, 0.0F, -0.0087F, 0.0F);
		

		accessory23_r1 = new ModelRenderer(this);
		accessory23_r1.setRotationPoint(0.6874F, 2.3197F, 10.037F);
		accessory23.addChild(accessory23_r1);
		setRotationAngle(accessory23_r1, -0.0436F, 0.0F, 0.0004F);
		accessory23_r1.cubeList.add(new ModelBox(accessory23_r1, 119, 394, -1.7059F, -1.6869F, -12.1678F, 1, 1, 19, 0.0F, false));

		accessory24 = new ModelRenderer(this);
		accessory24.setRotationPoint(-3.4F, -32.9F, -63.2F);
		bipod.addChild(accessory24);
		

		accessory24_r1 = new ModelRenderer(this);
		accessory24_r1.setRotationPoint(1.9F, 1.4696F, -6.2574F);
		accessory24.addChild(accessory24_r1);
		setRotationAngle(accessory24_r1, -0.0436F, 0.0F, 0.0F);
		accessory24_r1.cubeList.add(new ModelBox(accessory24_r1, 311, 456, -1.9F, -0.8656F, -1.2398F, 1, 2, 2, 0.0F, false));

		accessory25 = new ModelRenderer(this);
		accessory25.setRotationPoint(-0.6F, -32.9F, -63.2F);
		bipod.addChild(accessory25);
		

		accessory25_r1 = new ModelRenderer(this);
		accessory25_r1.setRotationPoint(-0.9F, 1.4696F, -6.2574F);
		accessory25.addChild(accessory25_r1);
		setRotationAngle(accessory25_r1, -0.0436F, 0.0F, 0.0F);
		accessory25_r1.cubeList.add(new ModelBox(accessory25_r1, 318, 456, 0.9F, -0.8656F, -1.2398F, 1, 2, 2, 0.0F, false));

		accessory27 = new ModelRenderer(this);
		accessory27.setRotationPoint(-4.1F, -33.4F, -55.1F);
		bipod.addChild(accessory27);
		

		accessory27_r1 = new ModelRenderer(this);
		accessory27_r1.setRotationPoint(2.6F, 1.9696F, -14.3574F);
		accessory27.addChild(accessory27_r1);
		setRotationAngle(accessory27_r1, -0.0436F, 0.0F, 0.0F);
		accessory27_r1.cubeList.add(new ModelBox(accessory27_r1, 325, 456, -2.6F, -1.3656F, 6.8602F, 2, 3, 1, 0.0F, false));

		accessory28 = new ModelRenderer(this);
		accessory28.setRotationPoint(-0.9F, -33.4F, -55.1F);
		bipod.addChild(accessory28);
		

		accessory28_r1 = new ModelRenderer(this);
		accessory28_r1.setRotationPoint(-0.6F, 1.9696F, -14.3574F);
		accessory28.addChild(accessory28_r1);
		setRotationAngle(accessory28_r1, -0.0436F, 0.0F, 0.0F);
		accessory28_r1.cubeList.add(new ModelBox(accessory28_r1, 332, 456, 0.6F, -1.3656F, 6.8602F, 2, 3, 1, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, -7.6F, -18.0F);
		bipod.addChild(bone3);
		

		gun15 = new ModelRenderer(this);
		gun15.setRotationPoint(-2.0F, -40.0F, -70.5F);
		bone3.addChild(gun15);
		gun15.cubeList.add(new ModelBox(gun15, 452, 326, 0.0F, 11.0F, -4.1F, 1, 1, 3, 0.0F, false));
		gun15.cubeList.add(new ModelBox(gun15, 452, 331, 0.0F, 12.4142F, -4.1F, 1, 1, 3, 0.0F, false));

		gun16 = new ModelRenderer(this);
		gun16.setRotationPoint(-1.0F, -40.0F, -70.5F);
		bone3.addChild(gun16);
		setRotationAngle(gun16, 0.0F, 0.0F, 0.7854F);
		gun16.cubeList.add(new ModelBox(gun16, 452, 354, 7.7782F, 7.7782F, -4.1F, 1, 1, 3, 0.0F, false));

		gun19 = new ModelRenderer(this);
		gun19.setRotationPoint(-3.0F, -39.0F, -70.5F);
		bone3.addChild(gun19);
		gun19.cubeList.add(new ModelBox(gun19, 452, 359, 0.2929F, 10.7071F, -4.1F, 1, 1, 3, 0.0F, false));
		gun19.cubeList.add(new ModelBox(gun19, 452, 364, 1.7071F, 10.7071F, -4.1F, 1, 1, 3, 0.0F, false));

		gun20 = new ModelRenderer(this);
		gun20.setRotationPoint(-1.0F, -37.0F, -70.5F);
		bone3.addChild(gun20);
		setRotationAngle(gun20, 0.0F, 0.0F, -2.3562F);
		gun20.cubeList.add(new ModelBox(gun20, 451, 216, -7.364F, -7.364F, -4.1F, 1, 1, 3, 0.0F, false));

		gun25 = new ModelRenderer(this);
		gun25.setRotationPoint(-3.0F, -46.0F, -70.5F);
		bone3.addChild(gun25);
		setRotationAngle(gun25, 0.0F, 0.0F, -0.7854F);
		gun25.cubeList.add(new ModelBox(gun25, 452, 369, -12.3137F, 12.7279F, -4.1F, 1, 1, 3, 0.0F, false));

		gun26 = new ModelRenderer(this);
		gun26.setRotationPoint(-3.0F, -45.0F, -70.5F);
		bone3.addChild(gun26);
		setRotationAngle(gun26, 0.0F, 0.0F, -0.7854F);
		gun26.cubeList.add(new ModelBox(gun26, 452, 374, -12.3137F, 12.7279F, -4.1F, 1, 1, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bipod.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}