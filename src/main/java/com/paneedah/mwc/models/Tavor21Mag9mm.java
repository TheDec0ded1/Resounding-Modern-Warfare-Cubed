package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Tavor21Mag9mm extends ModelBase {
	private final ModelRenderer magazine32;
	private final ModelRenderer mag17;
	private final ModelRenderer mag18;
	private final ModelRenderer mag4_r1;
	private final ModelRenderer mag3_r1;
	private final ModelRenderer mag19;
	private final ModelRenderer mag20;
	private final ModelRenderer mag21;
	private final ModelRenderer mag22;
	private final ModelRenderer mag23;
	private final ModelRenderer mag24;

	public Tavor21Mag9mm() {
		textureWidth = 432;
		textureHeight = 432;

		magazine32 = new ModelRenderer(this);
		magazine32.setRotationPoint(0.0F, 21.0F, 21.0F);
		

		mag17 = new ModelRenderer(this);
		mag17.setRotationPoint(-2.5F, -31.5F, -6.0F);
		magazine32.addChild(mag17);
		mag17.cubeList.add(new ModelBox(mag17, 394, 93, 0.0F, 1.0F, 2.0F, 2, 23, 5, 0.0F, false));

		mag18 = new ModelRenderer(this);
		mag18.setRotationPoint(-3.0F, -31.5F, -5.5F);
		magazine32.addChild(mag18);
		mag18.cubeList.add(new ModelBox(mag18, 394, 147, 0.0F, 1.0F, 2.0F, 3, 23, 4, 0.0F, false));

		mag4_r1 = new ModelRenderer(this);
		mag4_r1.setRotationPoint(2.2929F, 1.0F, 4.5F);
		mag18.addChild(mag4_r1);
		setRotationAngle(mag4_r1, 0.0F, 0.0F, 0.7854F);
		mag4_r1.cubeList.add(new ModelBox(mag4_r1, 128, 420, -0.5F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));

		mag3_r1 = new ModelRenderer(this);
		mag3_r1.setRotationPoint(0.7071F, 1.0F, 4.5F);
		mag18.addChild(mag3_r1);
		setRotationAngle(mag3_r1, 0.0F, 0.0F, 0.7854F);
		mag3_r1.cubeList.add(new ModelBox(mag3_r1, 120, 420, -0.5F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));

		mag19 = new ModelRenderer(this);
		mag19.setRotationPoint(-3.2F, -14.5F, -5.5F);
		magazine32.addChild(mag19);
		mag19.cubeList.add(new ModelBox(mag19, 388, 417, 0.0F, 6.0F, 2.0F, 1, 1, 4, 0.0F, false));

		mag20 = new ModelRenderer(this);
		mag20.setRotationPoint(-3.2F, -14.5F, -1.5F);
		magazine32.addChild(mag20);
		setRotationAngle(mag20, 0.0F, 1.041F, 0.0F);
		mag20.cubeList.add(new ModelBox(mag20, 278, 426, -1.7258F, 6.0F, 1.0107F, 1, 1, 1, 0.0F, false));

		mag21 = new ModelRenderer(this);
		mag21.setRotationPoint(0.2F, -14.5F, -1.5F);
		magazine32.addChild(mag21);
		setRotationAngle(mag21, 0.0F, -2.6025F, 0.0F);
		mag21.cubeList.add(new ModelBox(mag21, 426, 279, 1.0267F, 6.0F, -1.7163F, 1, 1, 1, 0.0F, false));

		mag22 = new ModelRenderer(this);
		mag22.setRotationPoint(-0.8F, -14.5F, -5.5F);
		magazine32.addChild(mag22);
		mag22.cubeList.add(new ModelBox(mag22, 398, 417, 0.0F, 6.0F, 2.0F, 1, 1, 4, 0.0F, false));

		mag23 = new ModelRenderer(this);
		mag23.setRotationPoint(-0.35F, -14.5F, -4.65F);
		magazine32.addChild(mag23);
		setRotationAngle(mag23, 0.0F, 2.6025F, 0.0F);
		mag23.cubeList.add(new ModelBox(mag23, 426, 281, -1.0267F, 6.0F, -1.7163F, 1, 1, 1, 0.0F, false));

		mag24 = new ModelRenderer(this);
		mag24.setRotationPoint(-2.35F, -14.5F, -6.03F);
		magazine32.addChild(mag24);
		setRotationAngle(mag24, 0.0F, -1.041F, 0.0F);
		mag24.cubeList.add(new ModelBox(mag24, 426, 359, 1.7258F, 6.0F, 1.0107F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		magazine32.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}