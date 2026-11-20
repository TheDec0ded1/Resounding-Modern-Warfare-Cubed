package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AKMMuzzle extends ModelBase {
	private final ModelRenderer brake;
	private final ModelRenderer gun250_r1;
	private final ModelRenderer gun251_r1;
	private final ModelRenderer gun249_r1;
	private final ModelRenderer gun250_r2;

	public AKMMuzzle() {
		textureWidth = 320;
		textureHeight = 320;

		brake = new ModelRenderer(this);
		brake.setRotationPoint(-1.5F, -11.605F, -78.75F);
		brake.cubeList.add(new ModelBox(brake, 92, 301, -0.5F, -0.005F, -1.5F, 1, 1, 3, -0.15F, false));
		brake.cubeList.add(new ModelBox(brake, 294, 304, -0.995F, -0.5F, -0.5F, 1, 1, 2, -0.15F, false));
		brake.cubeList.add(new ModelBox(brake, 108, 301, -0.005F, -0.5F, -1.5F, 1, 1, 3, -0.15F, false));
		brake.cubeList.add(new ModelBox(brake, 16, 305, -0.5F, -0.995F, -0.5F, 1, 1, 2, -0.15F, false));

		gun250_r1 = new ModelRenderer(this);
		gun250_r1.setRotationPoint(0.35F, -0.35F, 6.0F);
		brake.addChild(gun250_r1);
		setRotationAngle(gun250_r1, 0.0F, 0.0F, -0.7854F);
		gun250_r1.cubeList.add(new ModelBox(gun250_r1, 10, 305, -0.5F, -0.5F, -6.5F, 1, 1, 2, -0.15F, false));

		gun251_r1 = new ModelRenderer(this);
		gun251_r1.setRotationPoint(0.35F, 0.35F, 6.0F);
		brake.addChild(gun251_r1);
		setRotationAngle(gun251_r1, 0.0F, 0.0F, -0.7854F);
		gun251_r1.cubeList.add(new ModelBox(gun251_r1, 116, 301, -0.5F, -0.5F, -7.5F, 1, 1, 3, -0.15F, false));

		gun249_r1 = new ModelRenderer(this);
		gun249_r1.setRotationPoint(-0.35F, -0.35F, 6.0F);
		brake.addChild(gun249_r1);
		setRotationAngle(gun249_r1, 0.0F, 0.0F, -0.7854F);
		gun249_r1.cubeList.add(new ModelBox(gun249_r1, 300, 304, -0.5F, -0.5F, -6.5F, 1, 1, 2, -0.15F, false));

		gun250_r2 = new ModelRenderer(this);
		gun250_r2.setRotationPoint(-0.35F, 0.35F, 6.0F);
		brake.addChild(gun250_r2);
		setRotationAngle(gun250_r2, 0.0F, 0.0F, -0.7854F);
		gun250_r2.cubeList.add(new ModelBox(gun250_r2, 100, 301, -0.5F, -0.5F, -7.5F, 1, 1, 3, -0.15F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		brake.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}