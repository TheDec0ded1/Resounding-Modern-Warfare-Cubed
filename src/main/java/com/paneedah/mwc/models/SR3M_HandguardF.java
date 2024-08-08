package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SR3M_HandguardF extends ModelBase {
	private final ModelRenderer sr3m_handguard2;
	private final ModelRenderer gun5;
	private final ModelRenderer gun6;
	private final ModelRenderer gun225_r3;
	private final ModelRenderer gun7;
	private final ModelRenderer gun226_r2;
	private final ModelRenderer gun225_r4;
	private final ModelRenderer gun8;
	private final ModelRenderer gun9;
	private final ModelRenderer gun10;
	private final ModelRenderer gun11;
	private final ModelRenderer gun12;
	private final ModelRenderer gun13;
	private final ModelRenderer gun15;
	private final ModelRenderer gun16;
	private final ModelRenderer gun17;
	private final ModelRenderer gun19;
	private final ModelRenderer gun20;
	private final ModelRenderer gun21;
	private final ModelRenderer gun22;
	private final ModelRenderer gun25;
	private final ModelRenderer gun26;
	private final ModelRenderer gun27;

	public SR3M_HandguardF() {
		textureWidth = 256;
		textureHeight = 256;

		sr3m_handguard2 = new ModelRenderer(this);
		sr3m_handguard2.setRotationPoint(0.0F, 25.0F, -5.8F);
		

		gun5 = new ModelRenderer(this);
		gun5.setRotationPoint(-4.1F, -32.5F, -27.5F);
		sr3m_handguard2.addChild(gun5);
		gun5.cubeList.add(new ModelBox(gun5, 145, 12, 0.4575F, -2.4497F, 1.99F, 1, 3, 6, 0.0F, false));
		gun5.cubeList.add(new ModelBox(gun5, 30, 98, 3.7606F, -2.4539F, 1.99F, 1, 3, 6, 0.0F, false));
		gun5.cubeList.add(new ModelBox(gun5, 66, 35, 3.7606F, -2.4539F, 0.99F, 1, 2, 1, 0.0F, false));
		gun5.cubeList.add(new ModelBox(gun5, 65, 51, 0.4575F, -2.4497F, 0.99F, 1, 2, 1, 0.0F, false));

		gun6 = new ModelRenderer(this);
		gun6.setRotationPoint(-4.1F, -32.5F, -41.5F);
		sr3m_handguard2.addChild(gun6);
		setRotationAngle(gun6, 1.3614F, 0.0F, 0.0F);
		

		gun225_r3 = new ModelRenderer(this);
		gun225_r3.setRotationPoint(2.49F, 9.163F, -1.3253F);
		gun6.addChild(gun225_r3);
		setRotationAngle(gun225_r3, 0.0873F, 0.0F, 0.0F);
		gun225_r3.cubeList.add(new ModelBox(gun225_r3, 104, 116, 1.3F, -2.7163F, 3.503F, 1, 11, 1, 0.0F, false));
		gun225_r3.cubeList.add(new ModelBox(gun225_r3, 5, 101, -2.1F, -2.7163F, 3.503F, 1, 11, 1, 0.0F, false));

		gun7 = new ModelRenderer(this);
		gun7.setRotationPoint(-4.1F, -33.5F, -41.5F);
		sr3m_handguard2.addChild(gun7);
		setRotationAngle(gun7, 1.3614F, 0.0F, 0.0F);
		

		gun226_r2 = new ModelRenderer(this);
		gun226_r2.setRotationPoint(2.49F, 9.184F, -1.3159F);
		gun7.addChild(gun226_r2);
		setRotationAngle(gun226_r2, 0.0873F, 0.0F, 0.0F);
		gun226_r2.cubeList.add(new ModelBox(gun226_r2, 53, 97, 1.3F, -1.6163F, 3.503F, 1, 10, 1, 0.0F, false));

		gun225_r4 = new ModelRenderer(this);
		gun225_r4.setRotationPoint(2.49F, 9.2837F, -1.3072F);
		gun7.addChild(gun225_r4);
		setRotationAngle(gun225_r4, 0.0873F, 0.0F, 0.0F);
		gun225_r4.cubeList.add(new ModelBox(gun225_r4, 48, 97, -2.1F, -1.7163F, 3.503F, 1, 10, 1, 0.0F, false));

		gun8 = new ModelRenderer(this);
		gun8.setRotationPoint(-4.1F, -36.5F, -41.5F);
		sr3m_handguard2.addChild(gun8);
		setRotationAngle(gun8, 0.0F, 0.0F, 1.5708F);
		gun8.cubeList.add(new ModelBox(gun8, 136, 79, 2.5461F, -4.7606F, 3.49F, 2, 1, 3, 0.0F, false));
		gun8.cubeList.add(new ModelBox(gun8, 47, 114, 2.6503F, -1.4575F, 3.49F, 2, 1, 3, 0.0F, false));
		gun8.cubeList.add(new ModelBox(gun8, 84, 134, 1.5461F, -4.7606F, 2.49F, 2, 1, 1, 0.0F, false));
		gun8.cubeList.add(new ModelBox(gun8, 129, 77, 1.6503F, -1.4575F, 2.49F, 2, 1, 1, 0.0F, false));

		gun9 = new ModelRenderer(this);
		gun9.setRotationPoint(-1.4909F, -29.9017F, -40.01F);
		sr3m_handguard2.addChild(gun9);
		setRotationAngle(gun9, 0.0F, -0.9599F, 1.5708F);
		gun9.cubeList.add(new ModelBox(gun9, 78, 7, 0.9186F, -2.1516F, 4.549F, 2, 1, 3, 0.0F, false));
		gun9.cubeList.add(new ModelBox(gun9, 75, 24, 1.0228F, 1.1516F, 4.549F, 2, 1, 3, 0.0F, false));

		gun10 = new ModelRenderer(this);
		gun10.setRotationPoint(-1.4909F, -29.7262F, -24.4261F);
		sr3m_handguard2.addChild(gun10);
		setRotationAngle(gun10, -3.1416F, -0.6109F, -1.5708F);
		gun10.cubeList.add(new ModelBox(gun10, 105, 109, 1.7372F, -2.1809F, -1.7932F, 2, 1, 3, 0.0F, false));
		gun10.cubeList.add(new ModelBox(gun10, 15, 107, 1.7372F, 1.2191F, -1.7932F, 2, 1, 3, 0.0F, false));

		gun11 = new ModelRenderer(this);
		gun11.setRotationPoint(-1.51F, -29.5133F, -22.2063F);
		sr3m_handguard2.addChild(gun11);
		setRotationAngle(gun11, -3.1416F, -1.1781F, -1.5708F);
		gun11.cubeList.add(new ModelBox(gun11, 123, 22, 0.4593F, -2.2F, 0.4671F, 2, 1, 1, 0.0F, false));
		gun11.cubeList.add(new ModelBox(gun11, 111, 68, 0.4593F, 1.2F, 0.4671F, 2, 1, 1, 0.0F, false));

		gun12 = new ModelRenderer(this);
		gun12.setRotationPoint(-1.51F, -29.4272F, -21.4196F);
		sr3m_handguard2.addChild(gun12);
		setRotationAngle(gun12, -3.1416F, -0.6545F, -1.5708F);
		gun12.cubeList.add(new ModelBox(gun12, 137, 0, 1.9528F, -2.2F, -0.1484F, 1, 1, 2, 0.0F, false));
		gun12.cubeList.add(new ModelBox(gun12, 50, 134, 1.9528F, 1.2F, -0.1484F, 1, 1, 2, 0.0F, false));

		gun13 = new ModelRenderer(this);
		gun13.setRotationPoint(-1.51F, -29.4272F, -21.4196F);
		sr3m_handguard2.addChild(gun13);
		setRotationAngle(gun13, -3.1416F, 0.0F, -1.5708F);
		gun13.cubeList.add(new ModelBox(gun13, 47, 60, 2.2522F, -2.2F, -1.9153F, 5, 1, 1, 0.0F, false));
		gun13.cubeList.add(new ModelBox(gun13, 58, 42, 2.2522F, 1.2F, -1.9153F, 5, 1, 1, 0.0F, false));

		gun15 = new ModelRenderer(this);
		gun15.setRotationPoint(-4.1F, -36.5F, -41.5F);
		sr3m_handguard2.addChild(gun15);
		gun15.cubeList.add(new ModelBox(gun15, 59, 33, 0.4575F, -0.3496F, 2.99F, 2, 3, 12, 0.0F, false));
		gun15.cubeList.add(new ModelBox(gun15, 125, 44, 0.4575F, -0.3496F, 2.49F, 2, 2, 1, 0.0F, false));
		gun15.cubeList.add(new ModelBox(gun15, 125, 0, 0.4575F, -0.3496F, 14.99F, 2, 2, 7, 0.0F, false));

		gun16 = new ModelRenderer(this);
		gun16.setRotationPoint(0.2F, -36.5F, -39.5F);
		sr3m_handguard2.addChild(gun16);
		gun16.cubeList.add(new ModelBox(gun16, 58, 17, -1.5394F, -0.4538F, 0.99F, 2, 3, 12, 0.0F, false));
		gun16.cubeList.add(new ModelBox(gun16, 54, 119, -1.5394F, -0.4538F, 0.49F, 2, 2, 1, 0.0F, false));
		gun16.cubeList.add(new ModelBox(gun16, 123, 12, -1.5394F, -0.4538F, 12.99F, 2, 2, 7, 0.0F, false));

		gun17 = new ModelRenderer(this);
		gun17.setRotationPoint(-3.2F, -38.8F, -41.5F);
		sr3m_handguard2.addChild(gun17);
		setRotationAngle(gun17, 0.0F, 0.0F, 0.2231F);
		gun17.cubeList.add(new ModelBox(gun17, 78, 3, 0.0F, 1.0F, 2.99F, 2, 1, 12, 0.0F, false));
		gun17.cubeList.add(new ModelBox(gun17, 38, 132, 0.0F, 1.0F, 14.99F, 2, 1, 7, 0.0F, false));
		gun17.cubeList.add(new ModelBox(gun17, 8, 151, 0.0F, 0.0F, 2.49F, 2, 1, 2, 0.0F, false));
		gun17.cubeList.add(new ModelBox(gun17, 110, 7, 0.0F, 1.0F, 2.49F, 2, 1, 1, 0.0F, false));
		gun17.cubeList.add(new ModelBox(gun17, 108, 32, -0.4F, -0.4F, 3.39F, 2, 1, 10, -0.401F, false));
		gun17.cubeList.add(new ModelBox(gun17, 108, 15, -0.4F, 0.4F, 3.39F, 2, 1, 10, -0.401F, false));
		gun17.cubeList.add(new ModelBox(gun17, 108, 39, 0.0F, 0.0F, 5.99F, 2, 1, 1, 0.0F, false));
		gun17.cubeList.add(new ModelBox(gun17, 108, 22, 0.0F, 0.0F, 8.49F, 2, 1, 1, 0.0F, false));
		gun17.cubeList.add(new ModelBox(gun17, 0, 77, 0.0F, 0.0F, 11.99F, 2, 1, 4, 0.0F, false));
		gun17.cubeList.add(new ModelBox(gun17, 87, 96, 0.0F, 0.0F, 10.99F, 2, 1, 1, 0.0F, false));
		gun17.cubeList.add(new ModelBox(gun17, 65, 58, 0.0F, 0.0F, 15.99F, 2, 1, 4, 0.0F, false));
		gun17.cubeList.add(new ModelBox(gun17, 144, 130, 0.0F, 0.0F, 19.99F, 2, 1, 2, 0.0F, false));

		gun19 = new ModelRenderer(this);
		gun19.setRotationPoint(0.2F, -38.9F, -41.5F);
		sr3m_handguard2.addChild(gun19);
		setRotationAngle(gun19, 0.0F, 0.0F, 1.3384F);
		gun19.cubeList.add(new ModelBox(gun19, 93, 17, 1.0F, 0.0F, 2.99F, 1, 2, 12, 0.0F, false));
		gun19.cubeList.add(new ModelBox(gun19, 134, 97, 1.0F, 0.0F, 14.99F, 1, 2, 7, 0.0F, false));
		gun19.cubeList.add(new ModelBox(gun19, 87, 87, -0.4F, -0.4F, 2.99F, 1, 2, 12, -0.401F, false));
		gun19.cubeList.add(new ModelBox(gun19, 0, 86, 0.4F, -0.4F, 2.99F, 1, 2, 12, -0.401F, false));
		gun19.cubeList.add(new ModelBox(gun19, 92, 122, 0.0F, 0.0F, 2.49F, 1, 2, 2, 0.0F, false));
		gun19.cubeList.add(new ModelBox(gun19, 58, 35, 1.0F, 0.0F, 2.49F, 1, 2, 1, 0.0F, false));
		gun19.cubeList.add(new ModelBox(gun19, 55, 51, 0.0F, 0.0F, 5.99F, 1, 2, 1, 0.0F, false));
		gun19.cubeList.add(new ModelBox(gun19, 25, 54, 0.0F, 0.0F, 8.49F, 1, 2, 1, 0.0F, false));
		gun19.cubeList.add(new ModelBox(gun19, 63, 69, 0.0F, 0.0F, 11.99F, 1, 2, 4, 0.0F, false));
		gun19.cubeList.add(new ModelBox(gun19, 16, 54, 0.0F, 0.0F, 10.99F, 1, 2, 1, 0.0F, false));
		gun19.cubeList.add(new ModelBox(gun19, 47, 66, 0.0F, 0.0F, 15.99F, 1, 2, 4, 0.0F, false));
		gun19.cubeList.add(new ModelBox(gun19, 118, 94, 0.0F, 0.0F, 19.99F, 1, 2, 2, 0.0F, false));

		gun20 = new ModelRenderer(this);
		gun20.setRotationPoint(-2.3F, -39.32F, -41.5F);
		sr3m_handguard2.addChild(gun20);
		setRotationAngle(gun20, 0.0F, 0.0F, 1.041F);
		gun20.cubeList.add(new ModelBox(gun20, 0, 102, 0.0F, 0.0F, 3.01F, 1, 1, 12, 0.0F, false));
		gun20.cubeList.add(new ModelBox(gun20, 8, 54, 0.0F, 0.0F, 2.51F, 1, 1, 1, 0.0F, false));
		gun20.cubeList.add(new ModelBox(gun20, 138, 35, 0.0F, 0.0F, 15.01F, 1, 1, 7, 0.0F, false));

		gun21 = new ModelRenderer(this);
		gun21.setRotationPoint(-2.0F, -39.5F, -41.5F);
		sr3m_handguard2.addChild(gun21);
		setRotationAngle(gun21, 0.0F, 0.0F, 1.041F);
		gun21.cubeList.add(new ModelBox(gun21, 76, 37, 0.0F, 0.0F, 3.0F, 2, 1, 12, 0.0F, false));
		gun21.cubeList.add(new ModelBox(gun21, 95, 9, 0.0F, 0.0F, 2.5F, 2, 1, 1, 0.0F, false));
		gun21.cubeList.add(new ModelBox(gun21, 126, 42, 0.0F, 0.0F, 15.0F, 2, 1, 7, 0.0F, false));

		gun22 = new ModelRenderer(this);
		gun22.setRotationPoint(-0.7F, -39.35F, -41.5F);
		sr3m_handguard2.addChild(gun22);
		setRotationAngle(gun22, 0.0F, 0.0F, 0.4461F);
		gun22.cubeList.add(new ModelBox(gun22, 48, 100, 0.0F, 0.0F, 3.01F, 1, 1, 12, 0.0F, false));
		gun22.cubeList.add(new ModelBox(gun22, 51, 0, 0.0F, 0.0F, 2.51F, 1, 1, 1, 0.0F, false));
		gun22.cubeList.add(new ModelBox(gun22, 122, 137, 0.0F, 0.0F, 15.01F, 1, 1, 7, 0.0F, false));

		gun25 = new ModelRenderer(this);
		gun25.setRotationPoint(-1.0F, -39.5F, -41.5F);
		sr3m_handguard2.addChild(gun25);
		setRotationAngle(gun25, 0.0F, 0.0F, 0.4461F);
		gun25.cubeList.add(new ModelBox(gun25, 60, 85, 0.0F, 0.0F, 3.0F, 1, 2, 12, 0.0F, false));
		gun25.cubeList.add(new ModelBox(gun25, 48, 35, 0.0F, 0.0F, 2.5F, 1, 2, 1, 0.0F, false));
		gun25.cubeList.add(new ModelBox(gun25, 69, 134, 0.0F, 0.0F, 15.0F, 1, 2, 7, 0.0F, false));

		gun26 = new ModelRenderer(this);
		gun26.setRotationPoint(-2.0F, -39.5F, -41.5F);
		sr3m_handguard2.addChild(gun26);
		gun26.cubeList.add(new ModelBox(gun26, 0, 0, 0.0F, 0.0F, 2.98F, 1, 2, 16, 0.0F, false));
		gun26.cubeList.add(new ModelBox(gun26, 40, 35, 0.0F, 0.0F, 2.48F, 1, 2, 1, 0.0F, false));

		gun27 = new ModelRenderer(this);
		gun27.setRotationPoint(-1.5F, -32.4115F, -28.9848F);
		sr3m_handguard2.addChild(gun27);
		setRotationAngle(gun27, 1.4399F, 0.0F, 0.0F);
		gun27.cubeList.add(new ModelBox(gun27, 95, 0, -1.5F, -5.0667F, -1.0F, 2, 6, 2, 0.0F, false));
		gun27.cubeList.add(new ModelBox(gun27, 38, 161, -1.0F, -5.0667F, -1.2F, 2, 3, 2, 0.0F, false));
		gun27.cubeList.add(new ModelBox(gun27, 147, 160, -1.0F, -5.0667F, -2.0F, 2, 3, 2, 0.0F, false));
		gun27.cubeList.add(new ModelBox(gun27, 93, 17, -0.5F, -5.0667F, -1.6F, 2, 6, 2, 0.0F, false));
		gun27.cubeList.add(new ModelBox(gun27, 108, 15, -0.5F, 0.9333F, -1.6F, 2, 4, 2, 0.0F, false));
		gun27.cubeList.add(new ModelBox(gun27, 89, 87, -1.5F, 0.9333F, -1.6F, 2, 4, 2, 0.0F, false));
		gun27.cubeList.add(new ModelBox(gun27, 91, 108, -1.0F, -1.6667F, -2.0F, 2, 1, 2, 0.0F, false));
		gun27.cubeList.add(new ModelBox(gun27, 83, 17, -1.0F, -1.6667F, -1.2F, 2, 1, 2, 0.0F, false));
		gun27.cubeList.add(new ModelBox(gun27, 142, 115, -1.0F, -0.2667F, -1.2F, 2, 1, 2, 0.0F, false));
		gun27.cubeList.add(new ModelBox(gun27, 134, 107, -1.0F, -0.2667F, -2.0F, 2, 1, 2, 0.0F, false));
		gun27.cubeList.add(new ModelBox(gun27, 126, 67, -1.0F, 1.1333F, -2.0F, 2, 1, 2, 0.0F, false));
		gun27.cubeList.add(new ModelBox(gun27, 31, 114, -1.0F, 1.1333F, -1.2F, 2, 1, 2, 0.0F, false));
		gun27.cubeList.add(new ModelBox(gun27, 161, 83, -1.0F, 2.5333F, -2.0F, 2, 2, 2, 0.0F, false));
		gun27.cubeList.add(new ModelBox(gun27, 161, 76, -1.0F, 2.5333F, -1.2F, 2, 2, 2, 0.0F, false));
		gun27.cubeList.add(new ModelBox(gun27, 0, 101, -0.5F, -9.5667F, -1.1F, 1, 10, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		sr3m_handguard2.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}