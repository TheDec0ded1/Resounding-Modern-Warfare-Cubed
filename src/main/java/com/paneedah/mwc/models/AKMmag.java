package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AKMmag extends ModelBase {
	private final ModelRenderer mag;
	private final ModelRenderer bone5;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;

	public AKMmag() {
		textureWidth = 64;
		textureHeight = 64;

		mag = new ModelRenderer(this);
		mag.setRotationPoint(0.0F, 23.7F, 0.1F);
		

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-1.5F, -28.6927F, -23.9674F);
		mag.addChild(bone5);
		setRotationAngle(bone5, -0.1745F, 0.0F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 18, 32, -1.5F, -2.6593F, -2.7842F, 3, 6, 2, -0.001F, false));
		bone5.cubeList.add(new ModelBox(bone5, 15, 19, -2.0F, -2.6593F, -1.5342F, 4, 6, 7, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-1.5F, -28.6927F, -23.9674F);
		mag.addChild(bone7);
		setRotationAngle(bone7, -0.4363F, 0.0F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 8, 32, -1.501F, 1.8132F, -2.1068F, 3, 6, 2, 0.001F, false));
		bone7.cubeList.add(new ModelBox(bone7, 15, 6, -2.001F, 1.8132F, -0.8568F, 4, 6, 7, 0.001F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-3.1883F, -23.3512F, -24.1008F);
		mag.addChild(bone8);
		setRotationAngle(bone8, -0.6545F, 0.0F, 0.0F);
		bone8.cubeList.add(new ModelBox(bone8, 30, 0, 0.1883F, 1.9801F, -3.7059F, 3, 6, 2, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 0, 13, -0.3117F, 1.9801F, -2.4559F, 4, 6, 7, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-3.1883F, -17.745F, -25.2985F);
		mag.addChild(bone9);
		setRotationAngle(bone9, -0.8727F, 0.0F, 0.0F);
		bone9.cubeList.add(new ModelBox(bone9, 0, 26, 0.1873F, 2.2871F, -5.6119F, 3, 6, 2, 0.001F, false));
		bone9.cubeList.add(new ModelBox(bone9, 0, 0, -0.3127F, 2.2871F, -4.3619F, 4, 6, 7, 0.001F, false));
		bone9.cubeList.add(new ModelBox(bone9, 29, 24, -0.3127F, 8.1871F, -5.4619F, 4, 1, 8, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		mag.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}