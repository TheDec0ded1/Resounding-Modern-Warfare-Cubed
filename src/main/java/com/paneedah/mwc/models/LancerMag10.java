package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class LancerMag10 extends ModelBase {
	private final ModelRenderer mag10;
	private final ModelRenderer gun16;
	private final ModelRenderer gun17;
	private final ModelRenderer gun18;
	private final ModelRenderer gun19;
	private final ModelRenderer gun20;
	private final ModelRenderer gun21;
	private final ModelRenderer gun22;
	private final ModelRenderer gun16_r3;
	private final ModelRenderer gun23;
	private final ModelRenderer gun24;
	private final ModelRenderer gun25;
	private final ModelRenderer gun5_r1;
	private final ModelRenderer gun3_r3;
	private final ModelRenderer gun2_r3;
	private final ModelRenderer baseplate3;
	private final ModelRenderer op3;
	private final ModelRenderer gun26;

	public LancerMag10() {
		textureWidth = 112;
		textureHeight = 112;

		mag10 = new ModelRenderer(this);
		mag10.setRotationPoint(0.0F, 24.0F, 0.0F);
		mag10.cubeList.add(new ModelBox(mag10, 91, 60, 3.05F, -33.301F, -0.7F, 1, 1, 1, 0.0F, false));
		mag10.cubeList.add(new ModelBox(mag10, 91, 78, 3.251F, -32.901F, -0.7F, 1, 1, 1, -0.2F, false));
		mag10.cubeList.add(new ModelBox(mag10, 94, 3, 3.026F, -34.0F, -1.0F, 1, 1, 1, 0.0F, false));
		mag10.cubeList.add(new ModelBox(mag10, 94, 34, 3.025F, -34.001F, -0.5F, 1, 1, 1, 0.0F, false));

		gun16 = new ModelRenderer(this);
		gun16.setRotationPoint(2.8F, -36.0F, -4.5F);
		mag10.addChild(gun16);
		gun16.cubeList.add(new ModelBox(gun16, 61, 73, 0.0F, 0.0F, 0.0F, 1, 6, 2, 0.001F, false));

		gun17 = new ModelRenderer(this);
		gun17.setRotationPoint(1.2F, -36.0F, -4.5F);
		mag10.addChild(gun17);
		gun17.cubeList.add(new ModelBox(gun17, 52, 64, 0.0F, 0.0F, 0.0F, 2, 6, 2, 0.0F, false));

		gun18 = new ModelRenderer(this);
		gun18.setRotationPoint(1.05F, -19.91F, -0.2F);
		mag10.addChild(gun18);
		setRotationAngle(gun18, -1.7846F, 0.0F, 0.0F);
		gun18.cubeList.add(new ModelBox(gun18, 83, 7, -0.05F, 4.3527F, -9.1634F, 3, 2, 1, 0.1F, false));

		gun19 = new ModelRenderer(this);
		gun19.setRotationPoint(1.0F, -29.0F, -1.6F);
		mag10.addChild(gun19);
		setRotationAngle(gun19, -1.7846F, 0.0F, 0.0F);
		

		gun20 = new ModelRenderer(this);
		gun20.setRotationPoint(1.0F, -29.0F, 1.5F);
		mag10.addChild(gun20);
		setRotationAngle(gun20, -1.7846F, 0.0F, 0.0F);
		

		gun21 = new ModelRenderer(this);
		gun21.setRotationPoint(3.1F, -30.2F, -4.6F);
		mag10.addChild(gun21);
		

		gun22 = new ModelRenderer(this);
		gun22.setRotationPoint(3.1F, -29.0F, 1.5F);
		mag10.addChild(gun22);
		setRotationAngle(gun22, -1.7846F, 0.0F, 0.0F);
		

		gun16_r3 = new ModelRenderer(this);
		gun16_r3.setRotationPoint(-0.2F, 1.1128F, -1.0598F);
		gun22.addChild(gun16_r3);
		setRotationAngle(gun16_r3, 0.0873F, 0.0F, 0.0F);
		gun16_r3.cubeList.add(new ModelBox(gun16_r3, 89, 41, -1.4F, -1.1514F, 1.1904F, 2, 1, 1, 0.001F, false));

		gun23 = new ModelRenderer(this);
		gun23.setRotationPoint(3.1F, -30.5F, -2.5F);
		mag10.addChild(gun23);
		setRotationAngle(gun23, -1.7846F, 0.0F, 0.0F);
		

		gun24 = new ModelRenderer(this);
		gun24.setRotationPoint(3.2F, -20.1F, -0.2F);
		mag10.addChild(gun24);
		setRotationAngle(gun24, -1.7846F, 0.0F, 0.0F);
		gun24.cubeList.add(new ModelBox(gun24, 76, 14, -2.0F, 0.2027F, -9.0634F, 3, 5, 1, 0.001F, false));
		gun24.cubeList.add(new ModelBox(gun24, 45, 84, -2.4F, 0.2027F, -9.0634F, 1, 5, 1, 0.0F, false));

		gun25 = new ModelRenderer(this);
		gun25.setRotationPoint(1.0F, -36.0F, -2.5F);
		mag10.addChild(gun25);
		gun25.cubeList.add(new ModelBox(gun25, 15, 57, 0.0F, 0.0F, 0.0F, 3, 7, 4, 0.0F, false));
		gun25.cubeList.add(new ModelBox(gun25, 85, 14, 2.0486F, -0.0003F, 1.949F, 1, 2, 2, 0.0F, false));
		gun25.cubeList.add(new ModelBox(gun25, 85, 19, -0.0486F, -0.0003F, 1.949F, 1, 2, 2, 0.0F, false));
		gun25.cubeList.add(new ModelBox(gun25, 9, 82, 2.0486F, -0.0003F, -1.051F, 1, 1, 3, 0.0F, false));
		gun25.cubeList.add(new ModelBox(gun25, 18, 82, -0.0486F, -0.0003F, -1.051F, 1, 1, 3, 0.0F, false));
		gun25.cubeList.add(new ModelBox(gun25, 18, 69, 0.0F, 0.0F, -2.0F, 3, 6, 1, 0.0F, false));
		gun25.cubeList.add(new ModelBox(gun25, 65, 10, 0.0F, 0.0F, -0.5F, 3, 7, 1, 0.0F, false));

		gun5_r1 = new ModelRenderer(this);
		gun5_r1.setRotationPoint(1.5F, 1.0166F, 1.4166F);
		gun25.addChild(gun5_r1);
		setRotationAngle(gun5_r1, -0.6109F, 0.0F, 0.0F);
		gun5_r1.cubeList.add(new ModelBox(gun5_r1, 87, 34, -1.5486F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));
		gun5_r1.cubeList.add(new ModelBox(gun5_r1, 32, 87, 0.5486F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

		gun3_r3 = new ModelRenderer(this);
		gun3_r3.setRotationPoint(0.0F, 0.0F, 1.0F);
		gun25.addChild(gun3_r3);
		setRotationAngle(gun3_r3, 0.0F, 0.0F, 0.576F);
		gun3_r3.cubeList.add(new ModelBox(gun3_r3, 80, 39, -0.0419F, -0.9728F, -0.05F, 1, 1, 3, -0.001F, false));

		gun2_r3 = new ModelRenderer(this);
		gun2_r3.setRotationPoint(3.0F, 0.0F, 1.0F);
		gun25.addChild(gun2_r3);
		setRotationAngle(gun2_r3, 0.0F, 0.0F, -0.576F);
		gun2_r3.cubeList.add(new ModelBox(gun2_r3, 27, 81, -0.9581F, -0.9728F, -0.05F, 1, 1, 3, -0.001F, false));

		baseplate3 = new ModelRenderer(this);
		baseplate3.setRotationPoint(-0.3F, 16.1F, 2.3F);
		gun25.addChild(baseplate3);
		

		op3 = new ModelRenderer(this);
		op3.setRotationPoint(0.0F, 0.0F, 0.0F);
		baseplate3.addChild(op3);
		setRotationAngle(op3, -1.7846F, 0.0F, 0.0F);
		op3.cubeList.add(new ModelBox(op3, 84, 51, 0.0F, 4.9027F, -9.0634F, 3, 1, 1, 0.0F, false));
		op3.cubeList.add(new ModelBox(op3, 76, 21, 0.0F, 0.2027F, -9.0634F, 3, 5, 1, 0.0F, false));
		op3.cubeList.add(new ModelBox(op3, 76, 36, -0.199F, 5.7037F, -8.8624F, 4, 1, 1, -0.2F, false));

		gun26 = new ModelRenderer(this);
		gun26.setRotationPoint(2.6F, 0.0F, 0.0F);
		baseplate3.addChild(gun26);
		setRotationAngle(gun26, -1.7846F, 0.0F, 0.0F);
		gun26.cubeList.add(new ModelBox(gun26, 65, 93, 0.0F, 4.9027F, -9.0634F, 1, 1, 1, 0.001F, false));
		gun26.cubeList.add(new ModelBox(gun26, 85, 84, 0.0F, 0.2027F, -9.0634F, 1, 5, 1, 0.001F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		mag10.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}