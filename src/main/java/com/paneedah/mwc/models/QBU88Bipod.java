package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBU88Bipod extends ModelBase {
	private final ModelRenderer bipod;
	private final ModelRenderer bone3;
	private final ModelRenderer gun15;
	private final ModelRenderer gun16;
	private final ModelRenderer gun19;
	private final ModelRenderer gun20;
	private final ModelRenderer gun25;
	private final ModelRenderer gun26;
	private final ModelRenderer bone;
	private final ModelRenderer accessory27;
	private final ModelRenderer accessory27_r1;
	private final ModelRenderer accessory24;
	private final ModelRenderer accessory24_r1;
	private final ModelRenderer accessory23;
	private final ModelRenderer accessory23_r1;
	private final ModelRenderer accessory21;
	private final ModelRenderer accessory21_r1;
	private final ModelRenderer accessory20;
	private final ModelRenderer accessory20_r1;
	private final ModelRenderer bone2;
	private final ModelRenderer accessory28;
	private final ModelRenderer accessory28_r1;
	private final ModelRenderer accessory25;
	private final ModelRenderer accessory25_r1;
	private final ModelRenderer accessory22;
	private final ModelRenderer accessory22_r1;
	private final ModelRenderer accessory19;
	private final ModelRenderer accessory19_r1;
	private final ModelRenderer accessory18;
	private final ModelRenderer accessory18_r1;

	public QBU88Bipod() {
		textureWidth = 544;
		textureHeight = 544;

		bipod = new ModelRenderer(this);
		bipod.setRotationPoint(-3.0F, 23.1F, -90.4F);
		setRotationAngle(bipod, 0.0F, 3.1416F, 0.0F);
		

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, -7.25F, 29.2F);
		bipod.addChild(bone3);
		

		gun15 = new ModelRenderer(this);
		gun15.setRotationPoint(-2.0F, -40.0F, -70.5F);
		bone3.addChild(gun15);
		gun15.cubeList.add(new ModelBox(gun15, 529, 385, 0.0F, 11.0F, -3.1F, 1, 1, 2, 0.0F, false));
		gun15.cubeList.add(new ModelBox(gun15, 529, 389, 0.0F, 12.4142F, -3.1F, 1, 1, 2, 0.0F, false));

		gun16 = new ModelRenderer(this);
		gun16.setRotationPoint(-1.0F, -40.0F, -70.5F);
		bone3.addChild(gun16);
		setRotationAngle(gun16, 0.0F, 0.0F, 0.7854F);
		gun16.cubeList.add(new ModelBox(gun16, 529, 393, 7.7782F, 7.7782F, -3.1F, 1, 1, 2, 0.0F, false));

		gun19 = new ModelRenderer(this);
		gun19.setRotationPoint(-3.0F, -39.0F, -70.5F);
		bone3.addChild(gun19);
		gun19.cubeList.add(new ModelBox(gun19, 529, 397, 0.2929F, 10.7071F, -3.1F, 1, 1, 2, 0.0F, false));
		gun19.cubeList.add(new ModelBox(gun19, 529, 401, 1.7071F, 10.7071F, -3.1F, 1, 1, 2, 0.0F, false));

		gun20 = new ModelRenderer(this);
		gun20.setRotationPoint(-1.0F, -37.0F, -70.5F);
		bone3.addChild(gun20);
		setRotationAngle(gun20, 0.0F, 0.0F, -2.3562F);
		gun20.cubeList.add(new ModelBox(gun20, 408, 529, -7.364F, -7.364F, -3.1F, 1, 1, 2, 0.0F, false));

		gun25 = new ModelRenderer(this);
		gun25.setRotationPoint(-3.0F, -46.0F, -70.5F);
		bone3.addChild(gun25);
		setRotationAngle(gun25, 0.0F, 0.0F, -0.7854F);
		gun25.cubeList.add(new ModelBox(gun25, 415, 529, -12.3137F, 12.7279F, -3.1F, 1, 1, 2, 0.0F, false));

		gun26 = new ModelRenderer(this);
		gun26.setRotationPoint(-3.0F, -45.0F, -70.5F);
		bone3.addChild(gun26);
		setRotationAngle(gun26, 0.0F, 0.0F, -0.7854F);
		gun26.cubeList.add(new ModelBox(gun26, 422, 529, -12.3137F, 12.7279F, -3.1F, 1, 1, 2, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(3.0F, -32.1F, -45.6F);
		bipod.addChild(bone);
		setRotationAngle(bone, 0.0F, 0.0F, 0.6109F);
		bone.cubeList.add(new ModelBox(bone, 521, 452, -6.0762F, 1.2723F, 1.2F, 2, 5, 2, 0.0F, false));

		accessory27 = new ModelRenderer(this);
		accessory27.setRotationPoint(1.441F, -2.0744F, 37.7F);
		bone.addChild(accessory27);
		

		accessory27_r1 = new ModelRenderer(this);
		accessory27_r1.setRotationPoint(2.6F, 1.9697F, -14.3574F);
		accessory27.addChild(accessory27_r1);
		setRotationAngle(accessory27_r1, -0.0436F, 0.0F, 0.0F);
		accessory27_r1.cubeList.add(new ModelBox(accessory27_r1, 0, 529, -10.6603F, 5.2486F, 7.149F, 2, 3, 1, 0.0F, false));

		accessory24 = new ModelRenderer(this);
		accessory24.setRotationPoint(2.141F, -1.5744F, 29.6F);
		bone.addChild(accessory24);
		

		accessory24_r1 = new ModelRenderer(this);
		accessory24_r1.setRotationPoint(1.9F, 1.4697F, -6.2574F);
		accessory24.addChild(accessory24_r1);
		setRotationAngle(accessory24_r1, -0.0436F, 0.0F, 0.0F);
		accessory24_r1.cubeList.add(new ModelBox(accessory24_r1, 391, 528, -10.1322F, 5.7226F, -0.9085F, 1, 2, 2, 0.0F, false));

		accessory23 = new ModelRenderer(this);
		accessory23.setRotationPoint(3.441F, -1.1245F, 13.3F);
		bone.addChild(accessory23);
		setRotationAngle(accessory23, 0.0F, -0.0087F, 0.0F);
		

		accessory23_r1 = new ModelRenderer(this);
		accessory23_r1.setRotationPoint(0.6873F, 2.3197F, 10.037F);
		accessory23.addChild(accessory23_r1);
		setRotationAngle(accessory23_r1, -0.0436F, 0.0F, 0.0004F);
		accessory23_r1.cubeList.add(new ModelBox(accessory23_r1, 237, 501, -9.7634F, 4.9273F, -11.8089F, 1, 1, 19, 0.0F, false));

		accessory21 = new ModelRenderer(this);
		accessory21.setRotationPoint(2.541F, -1.3745F, 3.6F);
		bone.addChild(accessory21);
		

		accessory21_r1 = new ModelRenderer(this);
		accessory21_r1.setRotationPoint(1.5F, 1.2697F, 19.7426F);
		accessory21.addChild(accessory21_r1);
		setRotationAngle(accessory21_r1, -0.0436F, 0.0F, 0.0F);
		accessory21_r1.cubeList.add(new ModelBox(accessory21_r1, 0, 419, -9.5603F, 5.976F, -21.528F, 1, 1, 29, 0.0F, false));

		accessory20 = new ModelRenderer(this);
		accessory20.setRotationPoint(2.541F, -0.8745F, 3.6F);
		bone.addChild(accessory20);
		

		accessory20_r1 = new ModelRenderer(this);
		accessory20_r1.setRotationPoint(1.5F, 0.7697F, 19.7426F);
		accessory20.addChild(accessory20_r1);
		setRotationAngle(accessory20_r1, -0.0436F, 0.0F, 0.0F);
		accessory20_r1.cubeList.add(new ModelBox(accessory20_r1, 390, 413, -9.5603F, 6.476F, -21.528F, 1, 1, 29, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(17.3952F, -47.0357F, -45.6F);
		bipod.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, -0.6109F);
		bone2.cubeList.add(new ModelBox(bone2, 195, 522, -23.6548F, 0.0881F, 1.2F, 2, 5, 2, 0.0F, false));

		accessory28 = new ModelRenderer(this);
		accessory28.setRotationPoint(-3.9F, -0.95F, 37.7F);
		bone2.addChild(accessory28);
		

		accessory28_r1 = new ModelRenderer(this);
		accessory28_r1.setRotationPoint(0.6983F, 1.9711F, -14.3465F);
		accessory28.addChild(accessory28_r1);
		setRotationAngle(accessory28_r1, -0.0436F, 0.0F, 0.0F);
		accessory28_r1.cubeList.add(new ModelBox(accessory28_r1, 7, 529, -19.9427F, 3.0995F, 7.0443F, 2, 3, 1, 0.0F, false));

		accessory25 = new ModelRenderer(this);
		accessory25.setRotationPoint(-3.6F, -0.45F, 29.6F);
		bone2.addChild(accessory25);
		

		accessory25_r1 = new ModelRenderer(this);
		accessory25_r1.setRotationPoint(0.3983F, 1.4711F, -6.2465F);
		accessory25.addChild(accessory25_r1);
		setRotationAngle(accessory25_r1, -0.0436F, 0.0F, 0.0F);
		accessory25_r1.cubeList.add(new ModelBox(accessory25_r1, 291, 529, -19.6427F, 3.5995F, -1.0557F, 1, 2, 2, 0.0F, false));

		accessory22 = new ModelRenderer(this);
		accessory22.setRotationPoint(-3.9F, 0.0F, 13.3F);
		bone2.addChild(accessory22);
		setRotationAngle(accessory22, 0.0F, 0.0087F, 0.0F);
		

		accessory22_r1 = new ModelRenderer(this);
		accessory22_r1.setRotationPoint(0.6108F, 1.0211F, 10.0592F);
		accessory22.addChild(accessory22_r1);
		setRotationAngle(accessory22_r1, -0.0436F, 0.0F, -0.0004F);
		accessory22_r1.cubeList.add(new ModelBox(accessory22_r1, 196, 501, -19.8381F, 4.0769F, -12.1058F, 1, 1, 19, 0.0F, false));

		accessory19 = new ModelRenderer(this);
		accessory19.setRotationPoint(-4.0F, 0.25F, 3.6F);
		bone2.addChild(accessory19);
		

		accessory19_r1 = new ModelRenderer(this);
		accessory19_r1.setRotationPoint(0.7983F, 0.7711F, 19.7535F);
		accessory19.addChild(accessory19_r1);
		setRotationAngle(accessory19_r1, -0.0436F, 0.0F, 0.0F);
		accessory19_r1.cubeList.add(new ModelBox(accessory19_r1, 329, 413, -20.0427F, 4.3269F, -21.6327F, 1, 1, 29, 0.0F, false));

		accessory18 = new ModelRenderer(this);
		accessory18.setRotationPoint(-4.0F, -0.25F, 3.6F);
		bone2.addChild(accessory18);
		

		accessory18_r1 = new ModelRenderer(this);
		accessory18_r1.setRotationPoint(0.7983F, 1.2711F, 19.7535F);
		accessory18.addChild(accessory18_r1);
		setRotationAngle(accessory18_r1, -0.0436F, 0.0F, 0.0F);
		accessory18_r1.cubeList.add(new ModelBox(accessory18_r1, 268, 413, -20.0427F, 3.8269F, -21.6327F, 1, 1, 29, 0.0F, false));
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