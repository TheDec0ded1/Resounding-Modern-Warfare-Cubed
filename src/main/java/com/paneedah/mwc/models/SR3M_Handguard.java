package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SR3M_Handguard extends ModelBase {
	private final ModelRenderer sr3m_handguard;
	private final ModelRenderer gun215;
	private final ModelRenderer gun224;
	private final ModelRenderer gun225_r1;
	private final ModelRenderer gun3;
	private final ModelRenderer gun226_r1;
	private final ModelRenderer gun225_r2;
	private final ModelRenderer gun225;
	private final ModelRenderer gun4;
	private final ModelRenderer gun14;
	private final ModelRenderer gun18;
	private final ModelRenderer gun23;
	private final ModelRenderer gun24;
	private final ModelRenderer gun227;
	private final ModelRenderer gun228;
	private final ModelRenderer gun229;
	private final ModelRenderer gun230;
	private final ModelRenderer gun231;
	private final ModelRenderer gun232;
	private final ModelRenderer gun233;
	private final ModelRenderer gun234;
	private final ModelRenderer gun235;
	private final ModelRenderer gun236;

	public SR3M_Handguard() {
		textureWidth = 256;
		textureHeight = 256;

		sr3m_handguard = new ModelRenderer(this);
		sr3m_handguard.setRotationPoint(0.0F, 25.0F, -5.8F);
		

		gun215 = new ModelRenderer(this);
		gun215.setRotationPoint(-4.1F, -32.5F, -27.5F);
		sr3m_handguard.addChild(gun215);
		gun215.cubeList.add(new ModelBox(gun215, 146, 22, 0.4575F, -2.4497F, 1.99F, 1, 3, 6, 0.0F, false));
		gun215.cubeList.add(new ModelBox(gun215, 46, 143, 3.7606F, -2.4539F, 1.99F, 1, 3, 6, 0.0F, false));
		gun215.cubeList.add(new ModelBox(gun215, 78, 69, 3.7606F, -2.4539F, 0.99F, 1, 2, 1, 0.0F, false));
		gun215.cubeList.add(new ModelBox(gun215, 75, 17, 0.4575F, -2.4497F, 0.99F, 1, 2, 1, 0.0F, false));

		gun224 = new ModelRenderer(this);
		gun224.setRotationPoint(-4.1F, -32.5F, -41.5F);
		sr3m_handguard.addChild(gun224);
		setRotationAngle(gun224, 1.3614F, 0.0F, 0.0F);
		

		gun225_r1 = new ModelRenderer(this);
		gun225_r1.setRotationPoint(2.49F, 9.163F, -1.3253F);
		gun224.addChild(gun225_r1);
		setRotationAngle(gun225_r1, 0.0873F, 0.0F, 0.0F);
		gun225_r1.cubeList.add(new ModelBox(gun225_r1, 106, 154, 1.3F, -2.7163F, 3.503F, 1, 11, 1, 0.0F, false));
		gun225_r1.cubeList.add(new ModelBox(gun225_r1, 77, 154, -2.1F, -2.7163F, 3.503F, 1, 11, 1, 0.0F, false));

		gun3 = new ModelRenderer(this);
		gun3.setRotationPoint(-4.1F, -33.5F, -41.5F);
		sr3m_handguard.addChild(gun3);
		setRotationAngle(gun3, 1.3614F, 0.0F, 0.0F);
		

		gun226_r1 = new ModelRenderer(this);
		gun226_r1.setRotationPoint(2.49F, 9.184F, -1.3159F);
		gun3.addChild(gun226_r1);
		setRotationAngle(gun226_r1, 0.0873F, 0.0F, 0.0F);
		gun226_r1.cubeList.add(new ModelBox(gun226_r1, 68, 100, 1.3F, -1.6163F, 3.503F, 1, 10, 1, 0.0F, false));

		gun225_r2 = new ModelRenderer(this);
		gun225_r2.setRotationPoint(2.49F, 9.2837F, -1.3072F);
		gun3.addChild(gun225_r2);
		setRotationAngle(gun225_r2, 0.0873F, 0.0F, 0.0F);
		gun225_r2.cubeList.add(new ModelBox(gun225_r2, 63, 100, -2.1F, -1.7163F, 3.503F, 1, 10, 1, 0.0F, false));

		gun225 = new ModelRenderer(this);
		gun225.setRotationPoint(-4.1F, -36.5F, -41.5F);
		sr3m_handguard.addChild(gun225);
		setRotationAngle(gun225, 0.0F, 0.0F, 1.5708F);
		gun225.cubeList.add(new ModelBox(gun225, 159, 67, 2.5461F, -4.7606F, 3.49F, 2, 1, 3, 0.0F, false));
		gun225.cubeList.add(new ModelBox(gun225, 159, 57, 2.6503F, -1.4575F, 3.49F, 2, 1, 3, 0.0F, false));
		gun225.cubeList.add(new ModelBox(gun225, 151, 104, 1.5461F, -4.7606F, 2.49F, 2, 1, 1, 0.0F, false));
		gun225.cubeList.add(new ModelBox(gun225, 148, 48, 1.6503F, -1.4575F, 2.49F, 2, 1, 1, 0.0F, false));

		gun4 = new ModelRenderer(this);
		gun4.setRotationPoint(-1.4909F, -29.9017F, -40.01F);
		sr3m_handguard.addChild(gun4);
		setRotationAngle(gun4, 0.0F, -0.9599F, 1.5708F);
		gun4.cubeList.add(new ModelBox(gun4, 96, 80, 0.9186F, -2.1516F, 4.549F, 2, 1, 3, 0.0F, false));
		gun4.cubeList.add(new ModelBox(gun4, 81, 58, 1.0228F, 1.1516F, 4.549F, 2, 1, 3, 0.0F, false));

		gun14 = new ModelRenderer(this);
		gun14.setRotationPoint(-1.4909F, -29.7262F, -24.4261F);
		sr3m_handguard.addChild(gun14);
		setRotationAngle(gun14, -3.1416F, -0.6109F, -1.5708F);
		gun14.cubeList.add(new ModelBox(gun14, 52, 159, 1.7372F, -2.1809F, -1.7932F, 2, 1, 3, 0.0F, false));
		gun14.cubeList.add(new ModelBox(gun14, 138, 53, 1.7372F, 1.2191F, -1.7932F, 2, 1, 3, 0.0F, false));

		gun18 = new ModelRenderer(this);
		gun18.setRotationPoint(-1.51F, -29.5133F, -22.2063F);
		sr3m_handguard.addChild(gun18);
		setRotationAngle(gun18, -3.1416F, -1.1781F, -1.5708F);
		gun18.cubeList.add(new ModelBox(gun18, 145, 25, 0.4593F, -2.2F, 0.4671F, 2, 1, 1, 0.0F, false));
		gun18.cubeList.add(new ModelBox(gun18, 144, 134, 0.4593F, 1.2F, 0.4671F, 2, 1, 1, 0.0F, false));

		gun23 = new ModelRenderer(this);
		gun23.setRotationPoint(-1.51F, -29.4272F, -21.4196F);
		sr3m_handguard.addChild(gun23);
		setRotationAngle(gun23, -3.1416F, -0.6545F, -1.5708F);
		gun23.cubeList.add(new ModelBox(gun23, 132, 140, 1.9528F, -2.2F, -0.1484F, 1, 1, 2, 0.0F, false));
		gun23.cubeList.add(new ModelBox(gun23, 138, 44, 1.9528F, 1.2F, -0.1484F, 1, 1, 2, 0.0F, false));

		gun24 = new ModelRenderer(this);
		gun24.setRotationPoint(-1.51F, -29.4272F, -21.4196F);
		sr3m_handguard.addChild(gun24);
		setRotationAngle(gun24, -3.1416F, 0.0F, -1.5708F);
		gun24.cubeList.add(new ModelBox(gun24, 111, 73, 2.2522F, -2.2F, -1.9153F, 5, 1, 1, 0.0F, false));
		gun24.cubeList.add(new ModelBox(gun24, 0, 64, 2.2522F, 1.2F, -1.9153F, 5, 1, 1, 0.0F, false));

		gun227 = new ModelRenderer(this);
		gun227.setRotationPoint(-4.1F, -36.5F, -41.5F);
		sr3m_handguard.addChild(gun227);
		gun227.cubeList.add(new ModelBox(gun227, 46, 66, 0.4575F, -0.3496F, 2.99F, 2, 3, 12, 0.0F, false));
		gun227.cubeList.add(new ModelBox(gun227, 122, 137, 0.4575F, -0.3496F, 2.49F, 2, 2, 1, 0.0F, false));
		gun227.cubeList.add(new ModelBox(gun227, 129, 84, 0.4575F, -0.3496F, 14.99F, 2, 2, 7, 0.0F, false));

		gun228 = new ModelRenderer(this);
		gun228.setRotationPoint(0.2F, -36.5F, -39.5F);
		sr3m_handguard.addChild(gun228);
		gun228.cubeList.add(new ModelBox(gun228, 17, 66, -1.5394F, -0.4538F, 0.99F, 2, 3, 12, 0.0F, false));
		gun228.cubeList.add(new ModelBox(gun228, 89, 137, -1.5394F, -0.4538F, 0.49F, 2, 2, 1, 0.0F, false));
		gun228.cubeList.add(new ModelBox(gun228, 129, 67, -1.5394F, -0.4538F, 12.99F, 2, 2, 7, 0.0F, false));

		gun229 = new ModelRenderer(this);
		gun229.setRotationPoint(-3.2F, -38.8F, -41.5F);
		sr3m_handguard.addChild(gun229);
		setRotationAngle(gun229, 0.0F, 0.0F, 0.2231F);
		gun229.cubeList.add(new ModelBox(gun229, 81, 51, 0.0F, 1.0F, 2.99F, 2, 1, 12, 0.0F, false));
		gun229.cubeList.add(new ModelBox(gun229, 50, 134, 0.0F, 1.0F, 14.99F, 2, 1, 7, 0.0F, false));
		gun229.cubeList.add(new ModelBox(gun229, 18, 163, 0.0F, 0.0F, 2.49F, 2, 1, 2, 0.0F, false));
		gun229.cubeList.add(new ModelBox(gun229, 144, 0, 0.0F, 1.0F, 2.49F, 2, 1, 1, 0.0F, false));
		gun229.cubeList.add(new ModelBox(gun229, 111, 61, -0.4F, -0.4F, 3.39F, 2, 1, 10, -0.401F, false));
		gun229.cubeList.add(new ModelBox(gun229, 110, 0, -0.4F, 0.4F, 3.39F, 2, 1, 10, -0.401F, false));
		gun229.cubeList.add(new ModelBox(gun229, 122, 141, 0.0F, 0.0F, 5.99F, 2, 1, 1, 0.0F, false));
		gun229.cubeList.add(new ModelBox(gun229, 89, 141, 0.0F, 0.0F, 8.49F, 2, 1, 1, 0.0F, false));
		gun229.cubeList.add(new ModelBox(gun229, 134, 122, 0.0F, 0.0F, 11.99F, 2, 1, 4, 0.0F, false));
		gun229.cubeList.add(new ModelBox(gun229, 140, 12, 0.0F, 0.0F, 10.99F, 2, 1, 1, 0.0F, false));
		gun229.cubeList.add(new ModelBox(gun229, 78, 76, 0.0F, 0.0F, 15.99F, 2, 1, 4, 0.0F, false));
		gun229.cubeList.add(new ModelBox(gun229, 9, 163, 0.0F, 0.0F, 19.99F, 2, 1, 2, 0.0F, false));

		gun230 = new ModelRenderer(this);
		gun230.setRotationPoint(0.2F, -38.9F, -41.5F);
		sr3m_handguard.addChild(gun230);
		setRotationAngle(gun230, 0.0F, 0.0F, 1.3384F);
		gun230.cubeList.add(new ModelBox(gun230, 33, 97, 1.0F, 0.0F, 2.99F, 1, 2, 12, 0.0F, false));
		gun230.cubeList.add(new ModelBox(gun230, 135, 15, 1.0F, 0.0F, 14.99F, 1, 2, 7, 0.0F, false));
		gun230.cubeList.add(new ModelBox(gun230, 96, 65, -0.4F, -0.4F, 2.99F, 1, 2, 12, -0.401F, false));
		gun230.cubeList.add(new ModelBox(gun230, 95, 0, 0.4F, -0.4F, 2.99F, 1, 2, 12, -0.401F, false));
		gun230.cubeList.add(new ModelBox(gun230, 125, 0, 0.0F, 0.0F, 2.49F, 1, 2, 2, 0.0F, false));
		gun230.cubeList.add(new ModelBox(gun230, 73, 51, 1.0F, 0.0F, 2.49F, 1, 2, 1, 0.0F, false));
		gun230.cubeList.add(new ModelBox(gun230, 70, 69, 0.0F, 0.0F, 5.99F, 1, 2, 1, 0.0F, false));
		gun230.cubeList.add(new ModelBox(gun230, 24, 70, 0.0F, 0.0F, 8.49F, 1, 2, 1, 0.0F, false));
		gun230.cubeList.add(new ModelBox(gun230, 81, 51, 0.0F, 0.0F, 11.99F, 1, 2, 4, 0.0F, false));
		gun230.cubeList.add(new ModelBox(gun230, 16, 70, 0.0F, 0.0F, 10.99F, 1, 2, 1, 0.0F, false));
		gun230.cubeList.add(new ModelBox(gun230, 78, 0, 0.0F, 0.0F, 15.99F, 1, 2, 4, 0.0F, false));
		gun230.cubeList.add(new ModelBox(gun230, 123, 12, 0.0F, 0.0F, 19.99F, 1, 2, 2, 0.0F, false));

		gun231 = new ModelRenderer(this);
		gun231.setRotationPoint(-2.3F, -39.32F, -41.5F);
		sr3m_handguard.addChild(gun231);
		setRotationAngle(gun231, 0.0F, 0.0F, 1.041F);
		gun231.cubeList.add(new ModelBox(gun231, 102, 80, 0.0F, 0.0F, 3.01F, 1, 1, 12, 0.0F, false));
		gun231.cubeList.add(new ModelBox(gun231, 6, 86, 0.0F, 0.0F, 2.51F, 1, 1, 1, 0.0F, false));
		gun231.cubeList.add(new ModelBox(gun231, 12, 140, 0.0F, 0.0F, 15.01F, 1, 1, 7, 0.0F, false));

		gun232 = new ModelRenderer(this);
		gun232.setRotationPoint(-2.0F, -39.5F, -41.5F);
		sr3m_handguard.addChild(gun232);
		setRotationAngle(gun232, 0.0F, 0.0F, 1.041F);
		gun232.cubeList.add(new ModelBox(gun232, 79, 73, 0.0F, 0.0F, 3.0F, 2, 1, 12, 0.0F, false));
		gun232.cubeList.add(new ModelBox(gun232, 137, 4, 0.0F, 0.0F, 2.5F, 2, 1, 1, 0.0F, false));
		gun232.cubeList.add(new ModelBox(gun232, 0, 134, 0.0F, 0.0F, 15.0F, 2, 1, 7, 0.0F, false));

		gun233 = new ModelRenderer(this);
		gun233.setRotationPoint(-0.7F, -39.35F, -41.5F);
		sr3m_handguard.addChild(gun233);
		setRotationAngle(gun233, 0.0F, 0.0F, 0.4461F);
		gun233.cubeList.add(new ModelBox(gun233, 63, 102, 0.0F, 0.0F, 3.01F, 1, 1, 12, 0.0F, false));
		gun233.cubeList.add(new ModelBox(gun233, 83, 24, 0.0F, 0.0F, 2.51F, 1, 1, 1, 0.0F, false));
		gun233.cubeList.add(new ModelBox(gun233, 138, 44, 0.0F, 0.0F, 15.01F, 1, 1, 7, 0.0F, false));

		gun234 = new ModelRenderer(this);
		gun234.setRotationPoint(-1.0F, -39.5F, -41.5F);
		sr3m_handguard.addChild(gun234);
		setRotationAngle(gun234, 0.0F, 0.0F, 0.4461F);
		gun234.cubeList.add(new ModelBox(gun234, 93, 32, 0.0F, 0.0F, 3.0F, 1, 2, 12, 0.0F, false));
		gun234.cubeList.add(new ModelBox(gun234, 8, 70, 0.0F, 0.0F, 2.5F, 1, 2, 1, 0.0F, false));
		gun234.cubeList.add(new ModelBox(gun234, 134, 130, 0.0F, 0.0F, 15.0F, 1, 2, 7, 0.0F, false));

		gun235 = new ModelRenderer(this);
		gun235.setRotationPoint(-2.0F, -39.5F, -41.5F);
		sr3m_handguard.addChild(gun235);
		gun235.cubeList.add(new ModelBox(gun235, 0, 19, 0.0F, 0.0F, 2.98F, 1, 2, 16, 0.0F, false));
		gun235.cubeList.add(new ModelBox(gun235, 0, 70, 0.0F, 0.0F, 2.48F, 1, 2, 1, 0.0F, false));

		gun236 = new ModelRenderer(this);
		gun236.setRotationPoint(-1.5F, -25.4F, -40.55F);
		sr3m_handguard.addChild(gun236);
		gun236.cubeList.add(new ModelBox(gun236, 76, 36, -1.5F, -6.1F, 3.0F, 2, 6, 2, 0.0F, false));
		gun236.cubeList.add(new ModelBox(gun236, 120, 160, -1.0F, -6.1F, 3.4F, 2, 3, 2, 0.0F, false));
		gun236.cubeList.add(new ModelBox(gun236, 111, 160, -1.0F, -6.1F, 2.6F, 2, 3, 2, 0.0F, false));
		gun236.cubeList.add(new ModelBox(gun236, 34, 66, -0.5F, -6.1F, 3.0F, 2, 6, 2, 0.0F, false));
		gun236.cubeList.add(new ModelBox(gun236, 110, 0, -0.5F, -0.1F, 3.0F, 2, 4, 2, 0.0F, false));
		gun236.cubeList.add(new ModelBox(gun236, 108, 32, -1.5F, -0.1F, 3.0F, 2, 4, 2, 0.0F, false));
		gun236.cubeList.add(new ModelBox(gun236, 163, 0, -1.0F, -2.7F, 2.6F, 2, 1, 2, 0.0F, false));
		gun236.cubeList.add(new ModelBox(gun236, 129, 162, -1.0F, -2.7F, 3.4F, 2, 1, 2, 0.0F, false));
		gun236.cubeList.add(new ModelBox(gun236, 162, 90, -1.0F, -1.3F, 3.4F, 2, 1, 2, 0.0F, false));
		gun236.cubeList.add(new ModelBox(gun236, 82, 162, -1.0F, -1.3F, 2.6F, 2, 1, 2, 0.0F, false));
		gun236.cubeList.add(new ModelBox(gun236, 157, 34, -1.0F, 0.1F, 2.6F, 2, 1, 2, 0.0F, false));
		gun236.cubeList.add(new ModelBox(gun236, 50, 153, -1.0F, 0.1F, 3.4F, 2, 1, 2, 0.0F, false));
		gun236.cubeList.add(new ModelBox(gun236, 161, 98, -1.0F, 1.5F, 2.6F, 2, 2, 2, 0.0F, false));
		gun236.cubeList.add(new ModelBox(gun236, 91, 161, -1.0F, 1.5F, 3.4F, 2, 2, 2, 0.0F, false));
		gun236.cubeList.add(new ModelBox(gun236, 34, 49, -0.5F, -7.6F, 3.5F, 1, 7, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		sr3m_handguard.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}