package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class UziMag20 extends ModelBase {
	private final ModelRenderer magazine20;
	private final ModelRenderer mag1;
	private final ModelRenderer mag2;
	private final ModelRenderer mag4_r1;
	private final ModelRenderer mag3_r1;
	private final ModelRenderer mag3;
	private final ModelRenderer mag4;
	private final ModelRenderer mag5;
	private final ModelRenderer mag6;
	private final ModelRenderer mag7;
	private final ModelRenderer mag8;

	public UziMag20() {
		textureWidth = 512;
		textureHeight = 512;

		magazine20 = new ModelRenderer(this);
		magazine20.setRotationPoint(-1.5F, -10.5F, -6.0F);
		

		mag1 = new ModelRenderer(this);
		mag1.setRotationPoint(-1.0F, 0.0F, 0.0F);
		magazine20.addChild(mag1);
		mag1.cubeList.add(new ModelBox(mag1, 175, 206, 0.0F, 0.0F, 0.0F, 2, 16, 5, 0.0F, false));

		mag2 = new ModelRenderer(this);
		mag2.setRotationPoint(-1.5F, 0.0F, 0.5F);
		magazine20.addChild(mag2);
		mag2.cubeList.add(new ModelBox(mag2, 263, 307, 0.0F, 0.0F, 0.0F, 3, 16, 4, 0.0F, false));

		mag4_r1 = new ModelRenderer(this);
		mag4_r1.setRotationPoint(2.2929F, 0.0F, 2.5F);
		mag2.addChild(mag4_r1);
		setRotationAngle(mag4_r1, 0.0F, 0.0F, 0.7854F);
		mag4_r1.cubeList.add(new ModelBox(mag4_r1, 345, 32, -0.5F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));

		mag3_r1 = new ModelRenderer(this);
		mag3_r1.setRotationPoint(0.7071F, 0.0F, 2.5F);
		mag2.addChild(mag3_r1);
		setRotationAngle(mag3_r1, 0.0F, 0.0F, 0.7854F);
		mag3_r1.cubeList.add(new ModelBox(mag3_r1, 345, 27, -0.5F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));

		mag3 = new ModelRenderer(this);
		mag3.setRotationPoint(-1.7F, 17.0F, 0.5F);
		magazine20.addChild(mag3);
		mag3.cubeList.add(new ModelBox(mag3, 209, 341, 0.0F, -2.0F, 0.0F, 1, 1, 4, 0.0F, false));

		mag4 = new ModelRenderer(this);
		mag4.setRotationPoint(-1.7F, 17.0F, 4.5F);
		magazine20.addChild(mag4);
		setRotationAngle(mag4, 0.0F, 1.041F, 0.0F);
		mag4.cubeList.add(new ModelBox(mag4, 352, 173, 0.0F, -2.0F, 0.0F, 1, 1, 1, 0.0F, false));

		mag5 = new ModelRenderer(this);
		mag5.setRotationPoint(1.7F, 17.0F, 4.5F);
		magazine20.addChild(mag5);
		setRotationAngle(mag5, 0.0F, -2.6025F, 0.0F);
		mag5.cubeList.add(new ModelBox(mag5, 352, 176, 0.0F, -2.0F, 0.0F, 1, 1, 1, 0.0F, false));

		mag6 = new ModelRenderer(this);
		mag6.setRotationPoint(0.7F, 17.0F, 0.5F);
		magazine20.addChild(mag6);
		mag6.cubeList.add(new ModelBox(mag6, 341, 211, 0.0F, -2.0F, 0.0F, 1, 1, 4, 0.0F, false));

		mag7 = new ModelRenderer(this);
		mag7.setRotationPoint(1.15F, 17.0F, 1.35F);
		magazine20.addChild(mag7);
		setRotationAngle(mag7, 0.0F, 2.6025F, 0.0F);
		mag7.cubeList.add(new ModelBox(mag7, 352, 179, 0.0F, -2.0F, 0.0F, 1, 1, 1, 0.0F, false));

		mag8 = new ModelRenderer(this);
		mag8.setRotationPoint(-0.85F, 17.0F, -0.03F);
		magazine20.addChild(mag8);
		setRotationAngle(mag8, 0.0F, -1.041F, 0.0F);
		mag8.cubeList.add(new ModelBox(mag8, 352, 182, 0.0F, -2.0F, 0.0F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		magazine20.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}