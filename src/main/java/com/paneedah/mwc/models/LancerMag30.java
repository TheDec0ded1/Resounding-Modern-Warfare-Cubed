package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class LancerMag30 extends ModelBase {
	private final ModelRenderer mag30;
	private final ModelRenderer gun41;
	private final ModelRenderer gun40;
	private final ModelRenderer gun39;
	private final ModelRenderer gun34;
	private final ModelRenderer gun33;
	private final ModelRenderer gun30;
	private final ModelRenderer gun14;
	private final ModelRenderer gun16_r1;
	private final ModelRenderer gun12;
	private final ModelRenderer gun7;
	private final ModelRenderer gun1;
	private final ModelRenderer gun5_r1;
	private final ModelRenderer gun3_r1;
	private final ModelRenderer gun2_r1;
	private final ModelRenderer baseplate;
	private final ModelRenderer op;
	private final ModelRenderer gun38;

	public LancerMag30() {
		textureWidth = 112;
		textureHeight = 112;

		mag30 = new ModelRenderer(this);
		mag30.setRotationPoint(0.0F, 24.0F, 0.0F);
		mag30.cubeList.add(new ModelBox(mag30, 37, 91, 3.05F, -33.301F, -0.7F, 1, 1, 1, 0.0F, false));
		mag30.cubeList.add(new ModelBox(mag30, 42, 91, 3.251F, -32.901F, -0.7F, 1, 1, 1, -0.2F, false));
		mag30.cubeList.add(new ModelBox(mag30, 70, 93, 3.026F, -34.0F, -1.0F, 1, 1, 1, 0.0F, false));
		mag30.cubeList.add(new ModelBox(mag30, 93, 72, 3.025F, -34.001F, -0.5F, 1, 1, 1, 0.0F, false));

		gun41 = new ModelRenderer(this);
		gun41.setRotationPoint(2.8F, -36.0F, -4.5F);
		mag30.addChild(gun41);
		gun41.cubeList.add(new ModelBox(gun41, 69, 19, 0.0F, 0.0F, 0.0F, 1, 7, 2, 0.001F, false));

		gun40 = new ModelRenderer(this);
		gun40.setRotationPoint(1.2F, -36.0F, -4.5F);
		mag30.addChild(gun40);
		gun40.cubeList.add(new ModelBox(gun40, 63, 45, 0.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F, false));

		gun39 = new ModelRenderer(this);
		gun39.setRotationPoint(1.05F, -19.91F, -0.2F);
		mag30.addChild(gun39);
		setRotationAngle(gun39, -1.7846F, 0.0F, 0.0F);
		gun39.cubeList.add(new ModelBox(gun39, 78, 3, -0.05F, 4.15F, -0.1F, 3, 2, 1, 0.1F, false));

		gun34 = new ModelRenderer(this);
		gun34.setRotationPoint(1.0F, -29.0F, -1.6F);
		mag30.addChild(gun34);
		setRotationAngle(gun34, -1.7846F, 0.0F, 0.0F);
		gun34.cubeList.add(new ModelBox(gun34, 27, 23, 0.2F, 0.834F, 0.2153F, 1, 2, 9, 0.0F, false));
		gun34.cubeList.add(new ModelBox(gun34, 27, 0, 0.8F, 0.834F, 0.2153F, 2, 2, 9, 0.0F, false));

		gun33 = new ModelRenderer(this);
		gun33.setRotationPoint(1.0F, -29.0F, 1.5F);
		mag30.addChild(gun33);
		setRotationAngle(gun33, -1.7846F, 0.0F, 0.0F);
		gun33.cubeList.add(new ModelBox(gun33, 0, 0, 0.0F, 0.0F, 0.0F, 3, 4, 10, 0.0F, false));
		gun33.cubeList.add(new ModelBox(gun33, 27, 12, 0.501F, -0.2263F, 1.0228F, 2, 1, 9, 0.0F, false));
		gun33.cubeList.add(new ModelBox(gun33, 0, 15, 0.0F, 4.9F, 0.0F, 3, 1, 10, 0.0F, false));
		gun33.cubeList.add(new ModelBox(gun33, 0, 27, 0.0F, 3.3F, 0.0F, 3, 1, 10, 0.0F, false));

		gun30 = new ModelRenderer(this);
		gun30.setRotationPoint(3.1F, -30.2F, -4.6F);
		mag30.addChild(gun30);
		gun30.cubeList.add(new ModelBox(gun30, 67, 7, -1.0F, 0.0F, 0.001F, 2, 1, 1, 0.0F, false));
		gun30.cubeList.add(new ModelBox(gun30, 84, 54, -2.2F, -0.001F, 0.0F, 2, 1, 1, 0.0F, false));

		gun14 = new ModelRenderer(this);
		gun14.setRotationPoint(3.1F, -29.0F, 1.5F);
		mag30.addChild(gun14);
		setRotationAngle(gun14, -1.7846F, 0.0F, 0.0F);
		gun14.cubeList.add(new ModelBox(gun14, 76, 28, -1.0F, 0.0F, 0.0F, 2, 6, 1, 0.001F, false));
		gun14.cubeList.add(new ModelBox(gun14, 36, 76, -2.2F, -0.001F, 0.001F, 2, 6, 1, 0.001F, false));

		gun16_r1 = new ModelRenderer(this);
		gun16_r1.setRotationPoint(-0.2F, 1.1128F, -1.0598F);
		gun14.addChild(gun16_r1);
		setRotationAngle(gun16_r1, 0.0873F, 0.0F, 0.0F);
		gun16_r1.cubeList.add(new ModelBox(gun16_r1, 88, 44, -1.4F, -1.1514F, 1.1904F, 2, 1, 1, 0.001F, false));

		gun12 = new ModelRenderer(this);
		gun12.setRotationPoint(3.1F, -30.5F, -2.5F);
		mag30.addChild(gun12);
		setRotationAngle(gun12, -1.7846F, 0.0F, 0.0F);
		gun12.cubeList.add(new ModelBox(gun12, 0, 39, 0.301F, -1.7262F, 1.3181F, 1, 1, 9, -0.3F, false));
		gun12.cubeList.add(new ModelBox(gun12, 27, 35, -2.501F, -1.7272F, 1.3191F, 1, 1, 9, -0.3F, false));
		gun12.cubeList.add(new ModelBox(gun12, 42, 46, 0.301F, -3.1262F, 1.3181F, 1, 1, 9, -0.3F, false));
		gun12.cubeList.add(new ModelBox(gun12, 21, 46, -2.501F, -3.1272F, 1.3191F, 1, 1, 9, -0.3F, false));
		gun12.cubeList.add(new ModelBox(gun12, 48, 34, 0.301F, -4.5262F, 1.3181F, 1, 1, 9, -0.3F, false));
		gun12.cubeList.add(new ModelBox(gun12, 48, 23, -2.501F, -4.5272F, 1.3191F, 1, 1, 9, -0.3F, false));
		gun12.cubeList.add(new ModelBox(gun12, 50, 86, 0.301F, -4.5262F, 3.3181F, 1, 4, 1, -0.3F, false));
		gun12.cubeList.add(new ModelBox(gun12, 27, 86, -2.501F, -4.5272F, 3.3191F, 1, 4, 1, -0.3F, false));
		gun12.cubeList.add(new ModelBox(gun12, 5, 87, 0.301F, -4.5262F, 6.3181F, 1, 4, 1, -0.3F, false));
		gun12.cubeList.add(new ModelBox(gun12, 0, 87, -2.501F, -4.5272F, 6.3191F, 1, 4, 1, -0.3F, false));
		gun12.cubeList.add(new ModelBox(gun12, 90, 84, 0.301F, -1.5262F, 3.3181F, 1, 2, 1, -0.3F, false));
		gun12.cubeList.add(new ModelBox(gun12, 90, 68, 0.301F, -1.5262F, 6.3181F, 1, 2, 1, -0.3F, false));
		gun12.cubeList.add(new ModelBox(gun12, 90, 64, -2.501F, -1.5272F, 3.3191F, 1, 2, 1, -0.3F, false));
		gun12.cubeList.add(new ModelBox(gun12, 55, 90, -2.501F, -1.5272F, 6.3191F, 1, 2, 1, -0.3F, false));
		gun12.cubeList.add(new ModelBox(gun12, 92, 13, 0.301F, 0.2738F, 3.3181F, 1, 1, 1, -0.3F, false));
		gun12.cubeList.add(new ModelBox(gun12, 92, 10, 0.301F, 0.2738F, 6.3181F, 1, 1, 1, -0.3F, false));
		gun12.cubeList.add(new ModelBox(gun12, 92, 7, -2.501F, 0.2728F, 3.3191F, 1, 1, 1, -0.3F, false));
		gun12.cubeList.add(new ModelBox(gun12, 84, 91, -2.501F, 0.2728F, 6.3191F, 1, 1, 1, -0.3F, false));
		gun12.cubeList.add(new ModelBox(gun12, 25, 92, 0.301F, 0.6738F, 6.3181F, 1, 1, 1, -0.3F, false));
		gun12.cubeList.add(new ModelBox(gun12, 92, 22, -2.501F, 0.6728F, 6.3191F, 1, 1, 1, -0.3F, false));
		gun12.cubeList.add(new ModelBox(gun12, 92, 19, -2.501F, 0.6728F, 3.3191F, 1, 1, 1, -0.3F, false));
		gun12.cubeList.add(new ModelBox(gun12, 92, 16, 0.301F, 0.6738F, 3.3181F, 1, 1, 1, -0.3F, false));
		gun12.cubeList.add(new ModelBox(gun12, 47, 92, 0.301F, 1.0738F, 6.3181F, 1, 1, 1, -0.3F, false));
		gun12.cubeList.add(new ModelBox(gun12, 92, 31, -2.501F, 1.0728F, 6.3191F, 1, 1, 1, -0.3F, false));
		gun12.cubeList.add(new ModelBox(gun12, 92, 28, -2.501F, 1.0728F, 3.3191F, 1, 1, 1, -0.3F, false));
		gun12.cubeList.add(new ModelBox(gun12, 92, 25, 0.301F, 1.0738F, 3.3181F, 1, 1, 1, -0.3F, false));
		gun12.cubeList.add(new ModelBox(gun12, 64, 89, 0.201F, -0.7262F, 6.3181F, 1, 2, 1, -0.3F, false));
		gun12.cubeList.add(new ModelBox(gun12, 79, 89, -2.401F, -0.7272F, 6.3191F, 1, 2, 1, -0.3F, false));
		gun12.cubeList.add(new ModelBox(gun12, 74, 89, -2.401F, -0.7272F, 3.3191F, 1, 2, 1, -0.3F, false));
		gun12.cubeList.add(new ModelBox(gun12, 39, 87, 0.201F, -0.7262F, 3.3181F, 1, 2, 1, -0.3F, false));
		gun12.cubeList.add(new ModelBox(gun12, 82, 61, -2.099F, 1.0738F, 3.3181F, 3, 1, 1, -0.3F, false));
		gun12.cubeList.add(new ModelBox(gun12, 83, 28, -2.099F, 1.0738F, 6.3181F, 3, 1, 1, -0.3F, false));

		gun7 = new ModelRenderer(this);
		gun7.setRotationPoint(3.2F, -20.1F, -0.2F);
		mag30.addChild(gun7);
		setRotationAngle(gun7, -1.7846F, 0.0F, 0.0F);
		gun7.cubeList.add(new ModelBox(gun7, 27, 74, -2.0F, 0.0F, 0.0F, 3, 5, 1, 0.001F, false));
		gun7.cubeList.add(new ModelBox(gun7, 83, 44, -2.4F, 0.0F, 0.0F, 1, 5, 1, 0.0F, false));

		gun1 = new ModelRenderer(this);
		gun1.setRotationPoint(1.0F, -36.0F, -2.5F);
		mag30.addChild(gun1);
		gun1.cubeList.add(new ModelBox(gun1, 0, 50, 0.0F, 0.0F, 0.0F, 3, 7, 4, 0.0F, false));
		gun1.cubeList.add(new ModelBox(gun1, 64, 84, 2.0486F, -0.0003F, 1.949F, 1, 2, 2, 0.0F, false));
		gun1.cubeList.add(new ModelBox(gun1, 71, 84, -0.0486F, -0.0003F, 1.949F, 1, 2, 2, 0.0F, false));
		gun1.cubeList.add(new ModelBox(gun1, 81, 64, 2.0486F, -0.0003F, -1.051F, 1, 1, 3, 0.0F, false));
		gun1.cubeList.add(new ModelBox(gun1, 50, 81, -0.0486F, -0.0003F, -1.051F, 1, 1, 3, 0.0F, false));
		gun1.cubeList.add(new ModelBox(gun1, 0, 69, 0.0F, 0.0F, -2.0F, 3, 6, 1, 0.0F, false));
		gun1.cubeList.add(new ModelBox(gun1, 64, 55, 0.0F, 0.0F, -0.5F, 3, 7, 1, 0.0F, false));

		gun5_r1 = new ModelRenderer(this);
		gun5_r1.setRotationPoint(1.5F, 1.0166F, 1.4166F);
		gun1.addChild(gun5_r1);
		setRotationAngle(gun5_r1, -0.6109F, 0.0F, 0.0F);
		gun5_r1.cubeList.add(new ModelBox(gun5_r1, 85, 24, -1.5486F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));
		gun5_r1.cubeList.add(new ModelBox(gun5_r1, 86, 74, 0.5486F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

		gun3_r1 = new ModelRenderer(this);
		gun3_r1.setRotationPoint(0.0F, 0.0F, 1.0F);
		gun1.addChild(gun3_r1);
		setRotationAngle(gun3_r1, 0.0F, 0.0F, 0.576F);
		gun3_r1.cubeList.add(new ModelBox(gun3_r1, 0, 77, -0.0419F, -0.9728F, -0.05F, 1, 1, 3, -0.001F, false));

		gun2_r1 = new ModelRenderer(this);
		gun2_r1.setRotationPoint(3.0F, 0.0F, 1.0F);
		gun1.addChild(gun2_r1);
		setRotationAngle(gun2_r1, 0.0F, 0.0F, -0.576F);
		gun2_r1.cubeList.add(new ModelBox(gun2_r1, 9, 77, -0.9581F, -0.9728F, -0.05F, 1, 1, 3, -0.001F, false));

		baseplate = new ModelRenderer(this);
		baseplate.setRotationPoint(-0.3F, 16.1F, 2.3F);
		gun1.addChild(baseplate);
		

		op = new ModelRenderer(this);
		op.setRotationPoint(0.0F, 0.0F, 0.0F);
		baseplate.addChild(op);
		setRotationAngle(op, -1.7846F, 0.0F, 0.0F);
		op.cubeList.add(new ModelBox(op, 83, 31, 0.0F, 4.7F, 0.0F, 3, 1, 1, 0.0F, false));
		op.cubeList.add(new ModelBox(op, 50, 74, 0.0F, 0.0F, 0.0F, 3, 5, 1, 0.0F, false));
		op.cubeList.add(new ModelBox(op, 78, 0, -0.199F, 5.501F, 0.201F, 4, 1, 1, -0.2F, false));

		gun38 = new ModelRenderer(this);
		gun38.setRotationPoint(2.6F, 0.0F, 0.0F);
		baseplate.addChild(gun38);
		setRotationAngle(gun38, -1.7846F, 0.0F, 0.0F);
		gun38.cubeList.add(new ModelBox(gun38, 91, 81, 0.0F, 4.7F, 0.0F, 1, 1, 1, 0.001F, false));
		gun38.cubeList.add(new ModelBox(gun38, 59, 83, 0.0F, 0.0F, 0.0F, 1, 5, 1, 0.001F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		mag30.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}