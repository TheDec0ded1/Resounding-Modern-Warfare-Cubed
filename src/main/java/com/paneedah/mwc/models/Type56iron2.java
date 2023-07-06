package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Type56iron2 extends ModelBase {
	private final ModelRenderer sight1;
	private final ModelRenderer sight2;
	private final ModelRenderer sight3;
	private final ModelRenderer sight4;
	private final ModelRenderer sight5;
	private final ModelRenderer sight6;

	public Type56iron2() {
		textureWidth = 128;
		textureHeight = 64;

		sight1 = new ModelRenderer(this);
		sight1.setRotationPoint(0.0F, 0.0F, 0.0F);
		sight1.cubeList.add(new ModelBox(sight1, 0, 0, 0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F, true));
		sight1.cubeList.add(new ModelBox(sight1, 0, 0, -0.1F, -3.575F, 0.0F, 3, 1, 2, 0.0F, true));

		sight2 = new ModelRenderer(this);
		sight2.setRotationPoint(0.0F, 1.0F, 0.0F);
		setRotationAngle(sight2, 0.0F, 0.0F, -2.1192F);
		sight2.cubeList.add(new ModelBox(sight2, 0, 0, 0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, true));
		sight2.cubeList.add(new ModelBox(sight2, 0, 0, 1.4307F, 3.7991F, 0.0F, 1, 1, 2, 0.0F, true));

		sight3 = new ModelRenderer(this);
		sight3.setRotationPoint(3.0F, 1.0F, 0.0F);
		setRotationAngle(sight3, 0.0F, 0.0F, -2.6769F);
		sight3.cubeList.add(new ModelBox(sight3, 0, 0, 0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, true));
		sight3.cubeList.add(new ModelBox(sight3, 0, 0, 3.7982F, 1.6732F, 0.0F, 1, 1, 2, 0.0F, true));

		sight4 = new ModelRenderer(this);
		sight4.setRotationPoint(3.9F, -0.8F, 0.0F);
		setRotationAngle(sight4, 0.0F, 0.0F, 2.8628F);
		sight4.cubeList.add(new ModelBox(sight4, 0, 0, 0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, true));

		sight5 = new ModelRenderer(this);
		sight5.setRotationPoint(-1.0F, -0.7F, 0.0F);
		setRotationAngle(sight5, 0.0F, 0.0F, -1.3384F);
		sight5.cubeList.add(new ModelBox(sight5, 0, 0, 0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, true));

		sight6 = new ModelRenderer(this);
		sight6.setRotationPoint(1.0F, -1.5F, 0.0F);
		sight6.cubeList.add(new ModelBox(sight6, 0, 0, 0.0F, 0.0F, 0.0F, 1, 5, 2, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		sight1.render(f5);
		sight2.render(f5);
		sight3.render(f5);
		sight4.render(f5);
		sight5.render(f5);
		sight6.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}