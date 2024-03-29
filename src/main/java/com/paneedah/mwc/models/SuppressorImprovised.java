package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SuppressorImprovised extends ModelBase {
	private final ModelRenderer gun1;
	private final ModelRenderer gun4_r1;
	private final ModelRenderer gun5_r1;
	private final ModelRenderer gun6_r1;
	private final ModelRenderer gun3_r1;
	private final ModelRenderer gun2;
	private final ModelRenderer gun4_r2;
	private final ModelRenderer gun3_r2;
	private final ModelRenderer gun3_r3;
	private final ModelRenderer gun4;
	private final ModelRenderer gun5_r2;
	private final ModelRenderer gun4_r3;
	private final ModelRenderer gun4_r4;
	private final ModelRenderer gun3;
	private final ModelRenderer gun5_r3;
	private final ModelRenderer gun4_r5;
	private final ModelRenderer gun4_r6;

	public SuppressorImprovised() {
		textureWidth = 400;
		textureHeight = 400;

		gun1 = new ModelRenderer(this);
		gun1.setRotationPoint(0.0F, 0.0F, -2.0F);
		gun1.cubeList.add(new ModelBox(gun1, 16, 15, 0.5F, 0.0F, 9.0F, 1, 2, 13, 0.0F, true));
		gun1.cubeList.add(new ModelBox(gun1, 15, 46, -1.5137F, 2.0137F, 9.0F, 2, 1, 13, 0.0F, true));
		gun1.cubeList.add(new ModelBox(gun1, 93, 25, -0.4887F, 1.0387F, 20.0F, 1, 1, 2, 0.0F, true));
		gun1.cubeList.add(new ModelBox(gun1, 107, 52, -0.4887F, 2.9887F, 20.0F, 1, 1, 2, 0.0F, true));
		gun1.cubeList.add(new ModelBox(gun1, 93, 25, -0.4887F, 1.0387F, 9.0F, 1, 1, 2, 0.0F, true));
		gun1.cubeList.add(new ModelBox(gun1, 107, 52, -0.4887F, 2.9887F, 9.0F, 1, 1, 2, 0.0F, true));

		gun4_r1 = new ModelRenderer(this);
		gun4_r1.setRotationPoint(1.9302F, 3.8292F, 10.0F);
		gun1.addChild(gun4_r1);
		setRotationAngle(gun4_r1, 0.0F, 0.0F, -1.5708F);
		gun4_r1.cubeList.add(new ModelBox(gun4_r1, 80, 77, -1.1982F, -1.4302F, -1.0F, 2, 1, 13, 0.0F, true));

		gun5_r1 = new ModelRenderer(this);
		gun5_r1.setRotationPoint(2.3155F, 0.5835F, -1.0F);
		gun1.addChild(gun5_r1);
		setRotationAngle(gun5_r1, 0.0F, 0.0F, 1.5708F);
		gun5_r1.cubeList.add(new ModelBox(gun5_r1, 22, 114, 0.4552F, -0.1732F, 10.0F, 1, 1, 2, 0.0F, true));
		gun5_r1.cubeList.add(new ModelBox(gun5_r1, 22, 114, 0.4552F, -0.1732F, 21.0F, 1, 1, 2, 0.0F, true));

		gun6_r1 = new ModelRenderer(this);
		gun6_r1.setRotationPoint(2.3155F, 2.5335F, -1.0F);
		gun1.addChild(gun6_r1);
		setRotationAngle(gun6_r1, 0.0F, 0.0F, 1.5708F);
		gun6_r1.cubeList.add(new ModelBox(gun6_r1, 8, 101, 0.4552F, -0.1732F, 10.0F, 1, 1, 2, 0.0F, true));
		gun6_r1.cubeList.add(new ModelBox(gun6_r1, 8, 101, 0.4552F, -0.1732F, 21.0F, 1, 1, 2, 0.0F, true));

		gun3_r1 = new ModelRenderer(this);
		gun3_r1.setRotationPoint(2.3155F, 1.5835F, 10.0F);
		gun1.addChild(gun3_r1);
		setRotationAngle(gun3_r1, 0.0F, 0.0F, 1.5708F);
		gun3_r1.cubeList.add(new ModelBox(gun3_r1, 11, 103, 0.4302F, -1.1982F, -1.0F, 1, 2, 13, 0.0F, true));

		gun2 = new ModelRenderer(this);
		gun2.setRotationPoint(-0.6945F, 1.036F, 10.0F);
		setRotationAngle(gun2, 0.0F, 0.0F, -0.7854F);
		gun2.cubeList.add(new ModelBox(gun2, 135, 287, -0.3467F, -0.2706F, -3.0F, 1, 1, 13, 0.0F, true));

		gun4_r2 = new ModelRenderer(this);
		gun4_r2.setRotationPoint(-0.1192F, 3.831F, 0.0F);
		gun2.addChild(gun4_r2);
		setRotationAngle(gun4_r2, 0.0F, 0.0F, -3.1416F);
		gun4_r2.cubeList.add(new ModelBox(gun4_r2, 167, 98, -0.7724F, -0.9257F, -3.0F, 1, 1, 13, 0.0F, true));

		gun3_r2 = new ModelRenderer(this);
		gun3_r2.setRotationPoint(-1.7071F, 2.2431F, 0.0F);
		gun2.addChild(gun3_r2);
		setRotationAngle(gun3_r2, 0.0F, 0.0F, -1.5708F);
		gun3_r2.cubeList.add(new ModelBox(gun3_r2, 249, 266, -0.5F, -0.6533F, -3.0F, 1, 1, 13, 0.0F, true));

		gun3_r3 = new ModelRenderer(this);
		gun3_r3.setRotationPoint(1.7412F, 2.5155F, 0.0F);
		gun2.addChild(gun3_r3);
		setRotationAngle(gun3_r3, 0.0F, 0.0F, 1.5708F);
		gun3_r3.cubeList.add(new ModelBox(gun3_r3, 291, 61, -0.7724F, -0.9257F, -3.0F, 1, 1, 13, 0.0F, true));

		gun4 = new ModelRenderer(this);
		gun4.setRotationPoint(-1.4239F, 2.0898F, 10.0F);
		setRotationAngle(gun4, 0.0F, 0.0F, -1.1781F);
		gun4.cubeList.add(new ModelBox(gun4, 287, 293, 0.036F, -0.1121F, -3.0F, 1, 1, 13, 0.0F, true));

		gun5_r2 = new ModelRenderer(this);
		gun5_r2.setRotationPoint(-0.3234F, 3.7644F, 0.0F);
		gun4.addChild(gun5_r2);
		setRotationAngle(gun5_r2, 0.0F, 0.0F, 3.1416F);
		gun5_r2.cubeList.add(new ModelBox(gun5_r2, 82, 14, -1.3594F, -1.1509F, -3.0F, 1, 1, 13, 0.0F, true));

		gun4_r3 = new ModelRenderer(this);
		gun4_r3.setRotationPoint(-1.1828F, 1.6896F, 0.0F);
		gun4.addChild(gun4_r3);
		setRotationAngle(gun4_r3, 0.0F, 0.0F, -1.5708F);
		gun4_r3.cubeList.add(new ModelBox(gun4_r3, 287, 256, -1.2119F, -0.7949F, -3.0F, 1, 1, 13, 0.0F, true));

		gun4_r4 = new ModelRenderer(this);
		gun4_r4.setRotationPoint(1.8988F, 3.261F, 0.0F);
		gun4.addChild(gun4_r4);
		setRotationAngle(gun4_r4, 0.0F, 0.0F, 1.5708F);
		gun4_r4.cubeList.add(new ModelBox(gun4_r4, 176, 210, -1.3594F, -1.1509F, -3.0F, 1, 1, 13, 0.0F, true));

		gun3 = new ModelRenderer(this);
		gun3.setRotationPoint(1.0F, 1.0F, 10.0F);
		setRotationAngle(gun3, 0.0F, 0.0F, -0.3927F);
		gun3.cubeList.add(new ModelBox(gun3, 249, 266, -1.0793F, -1.1152F, -3.0F, 1, 1, 13, 0.0F, true));

		gun5_r3 = new ModelRenderer(this);
		gun5_r3.setRotationPoint(-0.2233F, 2.9698F, 0.0F);
		gun3.addChild(gun5_r3);
		setRotationAngle(gun5_r3, 0.0F, 0.0F, -3.1416F);
		gun5_r3.cubeList.add(new ModelBox(gun5_r3, 36, 215, -0.144F, -0.9423F, -3.0F, 1, 1, 13, 0.0F, true));

		gun4_r5 = new ModelRenderer(this);
		gun4_r5.setRotationPoint(-2.298F, 2.1104F, 0.0F);
		gun3.addChild(gun4_r5);
		setRotationAngle(gun4_r5, 0.0F, 0.0F, -1.5708F);
		gun4_r5.cubeList.add(new ModelBox(gun4_r5, 176, 210, 0.2119F, -0.7949F, -3.0F, 1, 1, 13, 0.0F, true));

		gun4_r6 = new ModelRenderer(this);
		gun4_r6.setRotationPoint(0.9921F, 1.0425F, 0.0F);
		gun3.addChild(gun4_r6);
		setRotationAngle(gun4_r6, 0.0F, 0.0F, 1.5708F);
		gun4_r6.cubeList.add(new ModelBox(gun4_r6, 15, 78, -0.144F, -0.9423F, -3.0F, 1, 1, 13, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gun1.render(f5);
		gun2.render(f5);
		gun4.render(f5);
		gun3.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}