package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Stoner63LMGBox extends ModelBase {
	private final ModelRenderer beltBox;

	public Stoner63LMGBox() {
		textureWidth = 576;
		textureHeight = 576;

		beltBox = new ModelRenderer(this);
		beltBox.setRotationPoint(5.2188F, -15.8344F, -21.2188F);
		beltBox.cubeList.add(new ModelBox(beltBox, 311, 330, 0.0313F, -3.7656F, 3.4688F, 1, 22, 1, 0.0F, false));
		beltBox.cubeList.add(new ModelBox(beltBox, 121, 428, 0.0313F, -3.7656F, -4.4312F, 1, 22, 1, 0.0F, false));
		beltBox.cubeList.add(new ModelBox(beltBox, 131, 428, 11.0313F, -3.7656F, -4.4312F, 1, 22, 1, 0.0F, false));
		beltBox.cubeList.add(new ModelBox(beltBox, 126, 428, 11.0313F, -3.7656F, 3.4688F, 1, 22, 1, 0.0F, false));
		beltBox.cubeList.add(new ModelBox(beltBox, 419, 161, 0.0313F, 17.2344F, -3.5313F, 12, 1, 7, 0.0F, false));
		beltBox.cubeList.add(new ModelBox(beltBox, 502, 429, 1.0313F, 0.4844F, -3.5313F, 8, 1, 7, 0.0F, false));
		beltBox.cubeList.add(new ModelBox(beltBox, 517, 230, 3.0313F, -3.5156F, -3.5313F, 8, 1, 7, 0.0F, false));
		beltBox.cubeList.add(new ModelBox(beltBox, 534, 239, 11.0313F, -3.7656F, -3.5313F, 2, 2, 7, 0.0F, false));
		beltBox.cubeList.add(new ModelBox(beltBox, 224, 540, 2.0313F, -3.7656F, -3.5313F, 1, 1, 7, 0.0F, false));
		beltBox.cubeList.add(new ModelBox(beltBox, 121, 400, 10.7813F, -2.7656F, -3.5313F, 1, 20, 7, 0.0F, false));
		beltBox.cubeList.add(new ModelBox(beltBox, 240, 513, 0.2813F, -1.7656F, -3.5313F, 1, 19, 7, 0.0F, false));
		beltBox.cubeList.add(new ModelBox(beltBox, 267, 549, -0.7188F, -1.7656F, -1.5313F, 1, 5, 3, 0.0F, false));
		beltBox.cubeList.add(new ModelBox(beltBox, 380, 167, 1.0313F, -3.7656F, 3.4688F, 10, 1, 1, 0.0F, false));
		beltBox.cubeList.add(new ModelBox(beltBox, 380, 164, 1.0313F, -3.7656F, -4.4312F, 10, 1, 1, 0.0F, false));
		beltBox.cubeList.add(new ModelBox(beltBox, 502, 438, 1.0313F, 17.2344F, 3.4688F, 10, 1, 1, 0.0F, false));
		beltBox.cubeList.add(new ModelBox(beltBox, 496, 156, 1.0313F, 17.2344F, -4.4312F, 10, 1, 1, 0.0F, false));
		beltBox.cubeList.add(new ModelBox(beltBox, 526, 178, 1.0313F, -2.7656F, 3.2188F, 10, 20, 1, 0.0F, false));
		beltBox.cubeList.add(new ModelBox(beltBox, 526, 156, 1.0313F, -2.7656F, -4.1812F, 10, 20, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		beltBox.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}