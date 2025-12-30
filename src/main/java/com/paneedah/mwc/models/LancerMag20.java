package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class LancerMag20 extends ModelBase {
	private final ModelRenderer mag20;
	private final ModelRenderer gun2;
	private final ModelRenderer gun3;
	private final ModelRenderer gun4;
	private final ModelRenderer gun5;
	private final ModelRenderer gun6;
	private final ModelRenderer gun8;
	private final ModelRenderer gun9;
	private final ModelRenderer gun16_r2;
	private final ModelRenderer gun10;
	private final ModelRenderer gun11;
	private final ModelRenderer gun13;
	private final ModelRenderer gun5_r1;
	private final ModelRenderer gun3_r2;
	private final ModelRenderer gun2_r2;
	private final ModelRenderer baseplate2;
	private final ModelRenderer op2;
	private final ModelRenderer gun15;

	public LancerMag20() {
		textureWidth = 112;
		textureHeight = 112;

		mag20 = new ModelRenderer(this);
		mag20.setRotationPoint(0.0F, 24.0F, 0.0F);
		mag20.cubeList.add(new ModelBox(mag20, 91, 54, 3.05F, -33.301F, -0.7F, 1, 1, 1, 0.0F, false));
		mag20.cubeList.add(new ModelBox(mag20, 91, 57, 3.251F, -32.901F, -0.7F, 1, 1, 1, -0.2F, false));
		mag20.cubeList.add(new ModelBox(mag20, 75, 93, 3.026F, -34.0F, -1.0F, 1, 1, 1, 0.0F, false));
		mag20.cubeList.add(new ModelBox(mag20, 93, 75, 3.025F, -34.001F, -0.5F, 1, 1, 1, 0.0F, false));

		gun2 = new ModelRenderer(this);
		gun2.setRotationPoint(2.8F, -36.0F, -4.5F);
		mag20.addChild(gun2);
		gun2.cubeList.add(new ModelBox(gun2, 69, 29, 0.0F, 0.0F, 0.0F, 1, 7, 2, 0.001F, false));

		gun3 = new ModelRenderer(this);
		gun3.setRotationPoint(1.2F, -36.0F, -4.5F);
		mag20.addChild(gun3);
		gun3.cubeList.add(new ModelBox(gun3, 30, 64, 0.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F, false));

		gun4 = new ModelRenderer(this);
		gun4.setRotationPoint(1.05F, -19.91F, -0.2F);
		mag20.addChild(gun4);
		setRotationAngle(gun4, -1.7846F, 0.0F, 0.0F);
		gun4.cubeList.add(new ModelBox(gun4, 82, 57, -0.05F, 4.1912F, -5.0029F, 3, 2, 1, 0.1F, false));

		gun5 = new ModelRenderer(this);
		gun5.setRotationPoint(1.0F, -29.0F, -1.6F);
		mag20.addChild(gun5);
		setRotationAngle(gun5, -1.7846F, 0.0F, 0.0F);
		gun5.cubeList.add(new ModelBox(gun5, 67, 0, 0.2F, 0.834F, 0.2153F, 1, 2, 4, 0.0F, false));
		gun5.cubeList.add(new ModelBox(gun5, 0, 62, 0.8F, 0.834F, 0.2153F, 2, 2, 4, 0.0F, false));

		gun6 = new ModelRenderer(this);
		gun6.setRotationPoint(1.0F, -29.0F, 1.5F);
		mag20.addChild(gun6);
		setRotationAngle(gun6, -1.7846F, 0.0F, 0.0F);
		gun6.cubeList.add(new ModelBox(gun6, 50, 0, 0.0F, 0.0F, 0.0F, 3, 4, 5, 0.0F, false));
		gun6.cubeList.add(new ModelBox(gun6, 39, 64, 0.501F, -0.2263F, 1.0228F, 2, 1, 4, 0.0F, false));
		gun6.cubeList.add(new ModelBox(gun6, 30, 57, 0.0F, 4.9F, 0.0F, 3, 1, 5, 0.0F, false));
		gun6.cubeList.add(new ModelBox(gun6, 47, 57, 0.0F, 3.3F, 0.0F, 3, 1, 5, 0.0F, false));

		gun8 = new ModelRenderer(this);
		gun8.setRotationPoint(3.1F, -30.2F, -4.6F);
		mag20.addChild(gun8);
		gun8.cubeList.add(new ModelBox(gun8, 88, 47, -1.0F, 0.0F, 0.001F, 2, 1, 1, 0.0F, false));
		gun8.cubeList.add(new ModelBox(gun8, 89, 0, -2.2F, -0.001F, 0.0F, 2, 1, 1, 0.0F, false));

		gun9 = new ModelRenderer(this);
		gun9.setRotationPoint(3.1F, -29.0F, 1.5F);
		mag20.addChild(gun9);
		setRotationAngle(gun9, -1.7846F, 0.0F, 0.0F);
		gun9.cubeList.add(new ModelBox(gun9, 43, 76, -1.0F, 0.0F, 0.0F, 2, 6, 1, 0.001F, false));
		gun9.cubeList.add(new ModelBox(gun9, 68, 76, -2.2F, -0.001F, 0.001F, 2, 6, 1, 0.001F, false));

		gun16_r2 = new ModelRenderer(this);
		gun16_r2.setRotationPoint(-0.2F, 1.1128F, -1.0598F);
		gun9.addChild(gun16_r2);
		setRotationAngle(gun16_r2, 0.0873F, 0.0F, 0.0F);
		gun16_r2.cubeList.add(new ModelBox(gun16_r2, 89, 38, -1.4F, -1.1514F, 1.1904F, 2, 1, 1, 0.001F, false));

		gun10 = new ModelRenderer(this);
		gun10.setRotationPoint(3.1F, -30.5F, -2.5F);
		mag20.addChild(gun10);
		setRotationAngle(gun10, -1.7846F, 0.0F, 0.0F);
		gun10.cubeList.add(new ModelBox(gun10, 69, 39, 0.301F, -1.7262F, 1.3181F, 1, 1, 4, -0.3F, false));
		gun10.cubeList.add(new ModelBox(gun10, 39, 70, -2.501F, -1.7272F, 1.3191F, 1, 1, 4, -0.3F, false));
		gun10.cubeList.add(new ModelBox(gun10, 70, 64, 0.301F, -3.1262F, 1.3181F, 1, 1, 4, -0.3F, false));
		gun10.cubeList.add(new ModelBox(gun10, 70, 70, -2.501F, -3.1272F, 1.3191F, 1, 1, 4, -0.3F, false));
		gun10.cubeList.add(new ModelBox(gun10, 72, 45, 0.301F, -4.5262F, 1.3181F, 1, 1, 4, -0.3F, false));
		gun10.cubeList.add(new ModelBox(gun10, 73, 51, -2.501F, -4.5272F, 1.3191F, 1, 1, 4, -0.3F, false));
		gun10.cubeList.add(new ModelBox(gun10, 10, 87, 0.301F, -4.5262F, 3.3181F, 1, 4, 1, -0.3F, false));
		gun10.cubeList.add(new ModelBox(gun10, 15, 87, -2.501F, -4.5272F, 3.3191F, 1, 4, 1, -0.3F, false));
		gun10.cubeList.add(new ModelBox(gun10, 90, 88, 0.301F, -1.5262F, 3.3181F, 1, 2, 1, -0.3F, false));
		gun10.cubeList.add(new ModelBox(gun10, 20, 91, -2.501F, -1.5272F, 3.3191F, 1, 2, 1, -0.3F, false));
		gun10.cubeList.add(new ModelBox(gun10, 89, 92, 0.301F, 0.2738F, 3.3181F, 1, 1, 1, -0.3F, false));
		gun10.cubeList.add(new ModelBox(gun10, 0, 93, -2.501F, 0.2728F, 3.3191F, 1, 1, 1, -0.3F, false));
		gun10.cubeList.add(new ModelBox(gun10, 5, 93, -2.501F, 0.6728F, 3.3191F, 1, 1, 1, -0.3F, false));
		gun10.cubeList.add(new ModelBox(gun10, 10, 93, 0.301F, 0.6738F, 3.3181F, 1, 1, 1, -0.3F, false));
		gun10.cubeList.add(new ModelBox(gun10, 15, 93, -2.501F, 1.0728F, 3.3191F, 1, 1, 1, -0.3F, false));
		gun10.cubeList.add(new ModelBox(gun10, 93, 50, 0.301F, 1.0738F, 3.3181F, 1, 1, 1, -0.3F, false));
		gun10.cubeList.add(new ModelBox(gun10, 32, 91, -2.401F, -0.7272F, 3.3191F, 1, 2, 1, -0.3F, false));
		gun10.cubeList.add(new ModelBox(gun10, 69, 89, 0.201F, -0.7262F, 3.3181F, 1, 2, 1, -0.3F, false));
		gun10.cubeList.add(new ModelBox(gun10, 83, 11, -2.099F, 1.0738F, 3.3181F, 3, 1, 1, -0.3F, false));

		gun11 = new ModelRenderer(this);
		gun11.setRotationPoint(3.2F, -20.1F, -0.2F);
		mag20.addChild(gun11);
		setRotationAngle(gun11, -1.7846F, 0.0F, 0.0F);
		gun11.cubeList.add(new ModelBox(gun11, 73, 57, -2.0F, 0.0412F, -4.9029F, 3, 5, 1, 0.001F, false));
		gun11.cubeList.add(new ModelBox(gun11, 21, 39, -2.4F, 0.0412F, -4.9029F, 1, 5, 1, 0.0F, false));

		gun13 = new ModelRenderer(this);
		gun13.setRotationPoint(1.0F, -36.0F, -2.5F);
		mag20.addChild(gun13);
		gun13.cubeList.add(new ModelBox(gun13, 50, 10, 0.0F, 0.0F, 0.0F, 3, 7, 4, 0.0F, false));
		gun13.cubeList.add(new ModelBox(gun13, 78, 84, 2.0486F, -0.0003F, 1.949F, 1, 2, 2, 0.0F, false));
		gun13.cubeList.add(new ModelBox(gun13, 84, 79, -0.0486F, -0.0003F, 1.949F, 1, 2, 2, 0.0F, false));
		gun13.cubeList.add(new ModelBox(gun13, 81, 69, 2.0486F, -0.0003F, -1.051F, 1, 1, 3, 0.0F, false));
		gun13.cubeList.add(new ModelBox(gun13, 0, 82, -0.0486F, -0.0003F, -1.051F, 1, 1, 3, 0.0F, false));
		gun13.cubeList.add(new ModelBox(gun13, 9, 69, 0.0F, 0.0F, -2.0F, 3, 6, 1, 0.0F, false));
		gun13.cubeList.add(new ModelBox(gun13, 61, 64, 0.0F, 0.0F, -0.5F, 3, 7, 1, 0.0F, false));

		gun5_r1 = new ModelRenderer(this);
		gun5_r1.setRotationPoint(1.5F, 1.0166F, 1.4166F);
		gun13.addChild(gun5_r1);
		setRotationAngle(gun5_r1, -0.6109F, 0.0F, 0.0F);
		gun5_r1.cubeList.add(new ModelBox(gun5_r1, 20, 87, -1.5486F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));
		gun5_r1.cubeList.add(new ModelBox(gun5_r1, 87, 3, 0.5486F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

		gun3_r2 = new ModelRenderer(this);
		gun3_r2.setRotationPoint(0.0F, 0.0F, 1.0F);
		gun13.addChild(gun3_r2);
		setRotationAngle(gun3_r2, 0.0F, 0.0F, 0.576F);
		gun3_r2.cubeList.add(new ModelBox(gun3_r2, 18, 77, -0.0419F, -0.9728F, -0.05F, 1, 1, 3, -0.001F, false));

		gun2_r2 = new ModelRenderer(this);
		gun2_r2.setRotationPoint(3.0F, 0.0F, 1.0F);
		gun13.addChild(gun2_r2);
		setRotationAngle(gun2_r2, 0.0F, 0.0F, -0.576F);
		gun2_r2.cubeList.add(new ModelBox(gun2_r2, 75, 79, -0.9581F, -0.9728F, -0.05F, 1, 1, 3, -0.001F, false));

		baseplate2 = new ModelRenderer(this);
		baseplate2.setRotationPoint(-0.3F, 16.1F, 2.3F);
		gun13.addChild(baseplate2);
		

		op2 = new ModelRenderer(this);
		op2.setRotationPoint(0.0F, 0.0F, 0.0F);
		baseplate2.addChild(op2);
		setRotationAngle(op2, -1.7846F, 0.0F, 0.0F);
		op2.cubeList.add(new ModelBox(op2, 36, 84, 0.0F, 4.7412F, -4.9029F, 3, 1, 1, 0.0F, false));
		op2.cubeList.add(new ModelBox(op2, 74, 7, 0.0F, 0.0412F, -4.9029F, 3, 5, 1, 0.0F, false));
		op2.cubeList.add(new ModelBox(op2, 75, 76, -0.199F, 5.5422F, -4.7019F, 4, 1, 1, -0.2F, false));

		gun15 = new ModelRenderer(this);
		gun15.setRotationPoint(2.6F, 0.0F, 0.0F);
		baseplate2.addChild(gun15);
		setRotationAngle(gun15, -1.7846F, 0.0F, 0.0F);
		gun15.cubeList.add(new ModelBox(gun15, 60, 93, 0.0F, 4.7412F, -4.9029F, 1, 1, 1, 0.001F, false));
		gun15.cubeList.add(new ModelBox(gun15, 15, 50, 0.0F, 0.0412F, -4.9029F, 1, 5, 1, 0.001F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		mag20.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}