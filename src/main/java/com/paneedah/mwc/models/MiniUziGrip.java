package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class MiniUziGrip extends ModelBase {
	private final ModelRenderer Grip;
	private final ModelRenderer gun3;
	private final ModelRenderer gun5;
	private final ModelRenderer gun6;
	private final ModelRenderer gun7;
	private final ModelRenderer gun8;
	private final ModelRenderer gun222;

	public MiniUziGrip() {
		textureWidth = 256;
		textureHeight = 256;

		Grip = new ModelRenderer(this);
		Grip.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		gun3 = new ModelRenderer(this);
		gun3.setRotationPoint(-3.5F, -31.5F, -6.0F);
		Grip.addChild(gun3);
		gun3.cubeList.add(new ModelBox(gun3, 105, 172, 0.0F, 0.0F, 0.0F, 1, 11, 5, 0.0F, false));
		gun3.cubeList.add(new ModelBox(gun3, 185, 75, 3.0F, 2.0F, 0.0F, 1, 6, 5, 0.0F, false));
		gun3.cubeList.add(new ModelBox(gun3, 114, 207, 3.0F, 8.0F, 0.0F, 1, 3, 1, 0.0F, false));
		gun3.cubeList.add(new ModelBox(gun3, 45, 208, 3.0F, 8.0F, 4.0F, 1, 3, 1, 0.0F, false));
		gun3.cubeList.add(new ModelBox(gun3, 206, 35, 3.0F, 0.0F, 3.0F, 1, 2, 2, 0.0F, false));

		gun5 = new ModelRenderer(this);
		gun5.setRotationPoint(-3.0F, -25.5F, -1.5F);
		Grip.addChild(gun5);
		gun5.cubeList.add(new ModelBox(gun5, 195, 34, 0.0F, 0.0F, 0.0F, 3, 5, 2, 0.0F, false));
		gun5.cubeList.add(new ModelBox(gun5, 174, 191, 0.0F, -6.0F, -1.0F, 3, 6, 2, 0.0F, false));

		gun6 = new ModelRenderer(this);
		gun6.setRotationPoint(-3.0F, -25.5F, 0.5F);
		Grip.addChild(gun6);
		setRotationAngle(gun6, -2.8256F, 0.0F, 0.0F);
		gun6.cubeList.add(new ModelBox(gun6, 139, 199, 0.0F, 0.0F, 0.0F, 3, 4, 1, 0.0F, false));

		gun7 = new ModelRenderer(this);
		gun7.setRotationPoint(-3.0F, -31.5F, -0.5F);
		Grip.addChild(gun7);
		gun7.cubeList.add(new ModelBox(gun7, 115, 23, 0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun8 = new ModelRenderer(this);
		gun8.setRotationPoint(-3.0F, -30.5F, 0.5F);
		Grip.addChild(gun8);
		setRotationAngle(gun8, -2.4538F, 0.0F, 0.0F);
		gun8.cubeList.add(new ModelBox(gun8, 197, 6, 0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F, false));

		gun222 = new ModelRenderer(this);
		gun222.setRotationPoint(-2.5F, -30.0F, -1.5F);
		Grip.addChild(gun222);
		setRotationAngle(gun222, 0.0744F, 0.0F, 0.0F);
		gun222.cubeList.add(new ModelBox(gun222, 198, 169, 0.0F, 0.0F, -0.5F, 2, 4, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Grip.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}