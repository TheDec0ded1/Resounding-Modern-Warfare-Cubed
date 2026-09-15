package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Tavor21SightsUpright extends ModelBase {
	private final ModelRenderer sights;
	private final ModelRenderer irons2;
	private final ModelRenderer bone11_r1;
	private final ModelRenderer bone11_r2;

	public Tavor21SightsUpright() {
		textureWidth = 432;
		textureHeight = 432;

		sights = new ModelRenderer(this);
		sights.setRotationPoint(-1.4981F, -21.3828F, 5.7801F);
		sights.cubeList.add(new ModelBox(sights, 422, 401, -0.4983F, -0.1661F, -37.8256F, 1, 2, 1, -0.35F, false));
		sights.cubeList.add(new ModelBox(sights, 402, 422, -0.5F, 0.85F, -37.8F, 1, 2, 1, 0.0F, false));
		sights.cubeList.add(new ModelBox(sights, 290, 406, -0.325F, 2.675F, -37.975F, 1, 4, 1, -0.175F, false));
		sights.cubeList.add(new ModelBox(sights, 264, 419, -0.675F, 2.675F, -37.975F, 1, 4, 1, -0.175F, false));

		irons2 = new ModelRenderer(this);
		irons2.setRotationPoint(-0.0016F, -0.7386F, -0.6636F);
		sights.addChild(irons2);
		setRotationAngle(irons2, -1.3963F, 0.0F, 0.0F);
		

		bone11_r1 = new ModelRenderer(this);
		bone11_r1.setRotationPoint(-0.0002F, -2.8375F, -4.1548F);
		irons2.addChild(bone11_r1);
		setRotationAngle(bone11_r1, 1.5708F, 0.0F, 0.0F);
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 230, 420, -0.9964F, 5.5535F, -1.5415F, 2, 3, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 422, 398, -0.0465F, 4.7535F, -1.5415F, 1, 2, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 298, 425, -0.4F, 5.3071F, -1.5415F, 1, 1, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 294, 425, -0.6F, 5.3071F, -1.5415F, 1, 1, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 398, 422, -0.9535F, 4.7535F, -1.5415F, 1, 2, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 246, 425, -0.4F, 4.4F, -1.5415F, 1, 1, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 242, 425, -0.6F, 4.4F, -1.5415F, 1, 1, 1, -0.35F, false));

		bone11_r2 = new ModelRenderer(this);
		bone11_r2.setRotationPoint(-0.0002F, -2.8375F, -4.1548F);
		irons2.addChild(bone11_r2);
		setRotationAngle(bone11_r2, 1.5708F, -0.7854F, 0.0F);
		bone11_r2.cubeList.add(new ModelBox(bone11_r2, 314, 425, 3.7391F, 3.1855F, -1.5415F, 1, 1, 1, -0.35F, false));
		bone11_r2.cubeList.add(new ModelBox(bone11_r2, 310, 425, 3.7391F, 3.3855F, -1.5415F, 1, 1, 1, -0.35F, false));
		bone11_r2.cubeList.add(new ModelBox(bone11_r2, 306, 425, 3.1855F, 3.7391F, -1.5415F, 1, 1, 1, -0.35F, false));
		bone11_r2.cubeList.add(new ModelBox(bone11_r2, 302, 425, 3.3855F, 3.7391F, -1.5415F, 1, 1, 1, -0.35F, false));
		bone11_r2.cubeList.add(new ModelBox(bone11_r2, 290, 425, 2.832F, 3.3855F, -1.5415F, 1, 1, 1, -0.35F, false));
		bone11_r2.cubeList.add(new ModelBox(bone11_r2, 258, 425, 2.832F, 3.1855F, -1.5415F, 1, 1, 1, -0.35F, false));
		bone11_r2.cubeList.add(new ModelBox(bone11_r2, 254, 425, 3.3855F, 2.832F, -1.5415F, 1, 1, 1, -0.35F, false));
		bone11_r2.cubeList.add(new ModelBox(bone11_r2, 250, 425, 3.1855F, 2.832F, -1.5415F, 1, 1, 1, -0.35F, false));
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