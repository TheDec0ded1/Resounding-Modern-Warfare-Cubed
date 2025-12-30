package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Glock17Mag extends ModelBase {
	private final ModelRenderer Magazine17;
	private final ModelRenderer gun12;
	private final ModelRenderer gun13;
	private final ModelRenderer gun2_r1;
	private final ModelRenderer gun14;
	private final ModelRenderer gun15;
	private final ModelRenderer gun16;
	private final ModelRenderer gun17;
	private final ModelRenderer gun18;
	private final ModelRenderer gun19;
	private final ModelRenderer gun20;
	private final ModelRenderer gun21;
	private final ModelRenderer gun22;

	public Glock17Mag() {
		textureWidth = 224;
		textureHeight = 224;

		Magazine17 = new ModelRenderer(this);
		Magazine17.setRotationPoint(0.5F, 23.0F, -1.05F);
		

		gun12 = new ModelRenderer(this);
		gun12.setRotationPoint(-3.5F, -20.0F, -4.5F);
		Magazine17.addChild(gun12);
		gun12.cubeList.add(new ModelBox(gun12, 178, 36, 0.0F, 4.7006F, 1.1881F, 4, 1, 6, -0.025F, false));

		gun13 = new ModelRenderer(this);
		gun13.setRotationPoint(-3.3F, -29.3F, -7.7F);
		Magazine17.addChild(gun13);
		setRotationAngle(gun13, 0.376F, 0.0F, 0.0F);
		

		gun2_r1 = new ModelRenderer(this);
		gun2_r1.setRotationPoint(2.3F, 5.1431F, 3.2469F);
		gun13.addChild(gun2_r1);
		setRotationAngle(gun2_r1, -0.1309F, 0.0F, 0.0F);
		gun2_r1.cubeList.add(new ModelBox(gun2_r1, 133, 155, -2.0F, -5.5F, -2.5F, 3, 16, 5, -0.025F, false));

		gun14 = new ModelRenderer(this);
		gun14.setRotationPoint(-3.3F, -20.1F, -1.9F);
		Magazine17.addChild(gun14);
		setRotationAngle(gun14, 0.2974F, 0.0F, 0.0F);
		gun14.cubeList.add(new ModelBox(gun14, 192, 102, 0.3F, 4.8174F, -0.2416F, 3, 1, 3, -0.025F, false));

		gun15 = new ModelRenderer(this);
		gun15.setRotationPoint(-3.3F, -20.5F, -2.5F);
		Magazine17.addChild(gun15);
		gun15.cubeList.add(new ModelBox(gun15, 169, 202, 0.3F, 4.7006F, 1.1881F, 3, 1, 1, -0.025F, false));

		gun16 = new ModelRenderer(this);
		gun16.setRotationPoint(-0.7F, -29.3F, -7.7F);
		Magazine17.addChild(gun16);
		setRotationAngle(gun16, 0.376F, 0.0F, 0.0F);
		

		gun17 = new ModelRenderer(this);
		gun17.setRotationPoint(-0.7F, -20.1F, -1.9F);
		Magazine17.addChild(gun17);
		setRotationAngle(gun17, 0.2974F, 0.0F, 0.0F);
		

		gun18 = new ModelRenderer(this);
		gun18.setRotationPoint(-0.7F, -20.5F, -2.5F);
		Magazine17.addChild(gun18);
		

		gun19 = new ModelRenderer(this);
		gun19.setRotationPoint(-3.3F, -20.0F, -4.5F);
		Magazine17.addChild(gun19);
		setRotationAngle(gun19, 0.8551F, 0.0F, 0.0F);
		gun19.cubeList.add(new ModelBox(gun19, 86, 202, 0.3F, 3.9808F, -2.7677F, 3, 1, 1, -0.025F, false));

		gun20 = new ModelRenderer(this);
		gun20.setRotationPoint(-0.7F, -20.0F, -4.5F);
		Magazine17.addChild(gun20);
		setRotationAngle(gun20, 0.8551F, 0.0F, 0.0F);
		

		gun21 = new ModelRenderer(this);
		gun21.setRotationPoint(-3.0F, -30.5F, -7.0F);
		Magazine17.addChild(gun21);
		setRotationAngle(gun21, 0.2974F, 0.0F, 0.0F);
		gun21.cubeList.add(new ModelBox(gun21, 198, 199, 0.5F, 0.2931F, 0.9561F, 2, 1, 2, -0.025F, false));

		gun22 = new ModelRenderer(this);
		gun22.setRotationPoint(-3.0F, -31.5F, -7.0F);
		Magazine17.addChild(gun22);
		gun22.cubeList.add(new ModelBox(gun22, 13, 189, 0.5F, 0.0F, 1.0F, 2, 1, 4, -0.025F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Magazine17.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}