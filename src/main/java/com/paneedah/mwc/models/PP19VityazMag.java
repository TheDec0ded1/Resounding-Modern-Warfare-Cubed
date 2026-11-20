package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class PP19VityazMag extends ModelBase {
	private final ModelRenderer magazine;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer bone8_r1;
	private final ModelRenderer bone9;
	private final ModelRenderer bone9_r1;

	public PP19VityazMag() {
		textureWidth = 64;
		textureHeight = 64;

		magazine = new ModelRenderer(this);
		magazine.setRotationPoint(-1.4F, -7.0F, -25.6F);
		

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-0.1F, 1.7073F, 0.0326F);
		magazine.addChild(bone6);
		bone6.cubeList.add(new ModelBox(bone6, 17, 21, -1.5F, -1.7611F, -0.1972F, 3, 6, 5, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-0.1F, 1.7073F, 0.0326F);
		magazine.addChild(bone7);
		setRotationAngle(bone7, -0.1745F, 0.0F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 17, 8, -1.499F, 3.3417F, 0.4648F, 3, 6, 5, 0.001F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-1.7883F, 7.0488F, -0.1008F);
		magazine.addChild(bone8);
		setRotationAngle(bone8, -0.349F, 0.0F, 0.0F);
		

		bone8_r1 = new ModelRenderer(this);
		bone8_r1.setRotationPoint(1.6878F, 8.0553F, 2.6342F);
		bone8.addChild(bone8_r1);
		setRotationAngle(bone8_r1, 0.0873F, 0.0F, 0.0F);
		bone8_r1.cubeList.add(new ModelBox(bone8_r1, 2, 15, -1.4995F, -4.6175F, -1.9163F, 3, 6, 5, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-1.7883F, 12.655F, -1.2985F);
		magazine.addChild(bone9);
		setRotationAngle(bone9, -0.48F, 0.0F, 0.0F);
		

		bone9_r1 = new ModelRenderer(this);
		bone9_r1.setRotationPoint(1.6898F, 2.2617F, 2.1104F);
		bone9.addChild(bone9_r1);
		setRotationAngle(bone9_r1, 0.1309F, 0.0F, 0.0F);
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 32, 27, -1.5005F, 6.869F, -1.8632F, 3, 1, 5, 0.2F, false));
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 3, 2, -1.5005F, 0.969F, -1.7632F, 3, 6, 5, 0.001F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		magazine.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}