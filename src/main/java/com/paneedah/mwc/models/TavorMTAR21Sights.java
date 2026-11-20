package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class TavorMTAR21Sights extends ModelBase {
	private final ModelRenderer sights;
	private final ModelRenderer irons2;
	private final ModelRenderer bone11_r1;
	private final ModelRenderer bone11_r2;

	public TavorMTAR21Sights() {
		textureWidth = 320;
		textureHeight = 320;

		sights = new ModelRenderer(this);
		sights.setRotationPoint(-1.4981F, -21.3828F, 5.7801F);
		sights.cubeList.add(new ModelBox(sights, 266, 85, -0.4983F, -0.1661F, -32.8256F, 1, 2, 1, -0.35F, false));
		sights.cubeList.add(new ModelBox(sights, 30, 269, -0.5F, 0.85F, -32.8F, 1, 2, 1, 0.0F, false));
		sights.cubeList.add(new ModelBox(sights, 224, 113, -0.325F, 2.675F, -32.975F, 1, 4, 1, -0.175F, false));
		sights.cubeList.add(new ModelBox(sights, 44, 232, -0.675F, 2.675F, -32.975F, 1, 4, 1, -0.175F, false));

		irons2 = new ModelRenderer(this);
		irons2.setRotationPoint(-0.0016F, -0.7386F, -0.6636F);
		sights.addChild(irons2);
		setRotationAngle(irons2, -1.3963F, 0.0F, 0.0F);
		

		bone11_r1 = new ModelRenderer(this);
		bone11_r1.setRotationPoint(-0.0002F, -2.8375F, -4.1548F);
		irons2.addChild(bone11_r1);
		setRotationAngle(bone11_r1, 1.5708F, 0.0F, 0.0F);
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 208, 298, -0.9964F, 5.7272F, -0.5567F, 2, 3, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 266, 82, -0.0465F, 4.9272F, -0.5567F, 1, 2, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 280, 302, -0.4F, 5.4807F, -0.5567F, 1, 1, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 276, 302, -0.6F, 5.4807F, -0.5567F, 1, 1, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 154, 263, -0.9535F, 4.9272F, -0.5567F, 1, 2, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 302, 266, -0.4F, 4.5736F, -0.5567F, 1, 1, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 302, 264, -0.6F, 4.5736F, -0.5567F, 1, 1, 1, -0.35F, false));

		bone11_r2 = new ModelRenderer(this);
		bone11_r2.setRotationPoint(-0.0002F, -2.8375F, -4.1548F);
		irons2.addChild(bone11_r2);
		setRotationAngle(bone11_r2, 1.5708F, -0.7854F, 0.0F);
		bone11_r2.cubeList.add(new ModelBox(bone11_r2, 292, 302, 3.8619F, 3.3083F, -0.5567F, 1, 1, 1, -0.35F, false));
		bone11_r2.cubeList.add(new ModelBox(bone11_r2, 302, 290, 3.8619F, 3.5083F, -0.5567F, 1, 1, 1, -0.35F, false));
		bone11_r2.cubeList.add(new ModelBox(bone11_r2, 288, 302, 3.3083F, 3.8619F, -0.5567F, 1, 1, 1, -0.35F, false));
		bone11_r2.cubeList.add(new ModelBox(bone11_r2, 284, 302, 3.5083F, 3.8619F, -0.5567F, 1, 1, 1, -0.35F, false));
		bone11_r2.cubeList.add(new ModelBox(bone11_r2, 272, 302, 2.9548F, 3.5083F, -0.5567F, 1, 1, 1, -0.35F, false));
		bone11_r2.cubeList.add(new ModelBox(bone11_r2, 302, 270, 2.9548F, 3.3083F, -0.5567F, 1, 1, 1, -0.35F, false));
		bone11_r2.cubeList.add(new ModelBox(bone11_r2, 302, 268, 3.5083F, 2.9548F, -0.5567F, 1, 1, 1, -0.35F, false));
		bone11_r2.cubeList.add(new ModelBox(bone11_r2, 268, 302, 3.3083F, 2.9548F, -0.5567F, 1, 1, 1, -0.35F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		sights.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}