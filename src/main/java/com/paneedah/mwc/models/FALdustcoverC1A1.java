package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FALdustcoverC1A1 extends ModelBase {
	private final ModelRenderer dustcoverC2;
	private final ModelRenderer bone206;
	private final ModelRenderer bone207;
	private final ModelRenderer bone208;
	private final ModelRenderer bone209;
	private final ModelRenderer bone210;

	public FALdustcoverC1A1() {
		textureWidth = 576;
		textureHeight = 576;

		dustcoverC2 = new ModelRenderer(this);
		dustcoverC2.setRotationPoint(-1.2857F, -16.018F, -19.4559F);
		dustcoverC2.cubeList.add(new ModelBox(dustcoverC2, 500, 460, -0.7143F, -1.0907F, 2.8089F, 1, 1, 21, 0.0F, false));
		dustcoverC2.cubeList.add(new ModelBox(dustcoverC2, 512, 426, -0.0143F, -0.3907F, 2.8089F, 1, 1, 21, 0.0F, false));
		dustcoverC2.cubeList.add(new ModelBox(dustcoverC2, 384, 513, -1.4143F, -0.3907F, 2.8089F, 1, 1, 21, 0.0F, false));
		dustcoverC2.cubeList.add(new ModelBox(dustcoverC2, 556, 263, -1.7F, -2.0F, 2.7F, 3, 3, 1, 0.0F, false));

		bone206 = new ModelRenderer(this);
		bone206.setRotationPoint(0.2857F, -1.082F, -7.1441F);
		dustcoverC2.addChild(bone206);
		setRotationAngle(bone206, 0.0F, 0.0F, 0.7854F);
		bone206.cubeList.add(new ModelBox(bone206, 428, 513, 0.0F, 0.0F, 10.0F, 1, 1, 21, 0.0F, false));
		bone206.cubeList.add(new ModelBox(bone206, 472, 513, -0.7071F, 0.7071F, 10.0F, 1, 1, 21, 0.0F, false));

		bone207 = new ModelRenderer(this);
		bone207.setRotationPoint(0.7857F, 0.018F, -7.2941F);
		dustcoverC2.addChild(bone207);
		setRotationAngle(bone207, 0.0F, 0.0F, 0.7854F);
		bone207.cubeList.add(new ModelBox(bone207, 106, 514, 0.0F, 0.0F, 10.0F, 1, 1, 21, 0.0F, false));
		bone207.cubeList.add(new ModelBox(bone207, 218, 514, -1.4293F, 1.3435F, 10.05F, 1, 1, 21, 0.0F, false));

		bone208 = new ModelRenderer(this);
		bone208.setRotationPoint(-0.4293F, 2.3435F, 10.0F);
		bone207.addChild(bone208);
		setRotationAngle(bone208, 1.1694F, 0.0F, 0.0F);
		

		bone209 = new ModelRenderer(this);
		bone209.setRotationPoint(1.4857F, 0.718F, -7.2441F);
		dustcoverC2.addChild(bone209);
		setRotationAngle(bone209, 0.0F, 0.0F, -0.3142F);
		bone209.cubeList.add(new ModelBox(bone209, 44, 515, -1.0F, 0.0F, 10.0F, 1, 1, 21, 0.0F, false));

		bone210 = new ModelRenderer(this);
		bone210.setRotationPoint(-1.9143F, 0.718F, -7.2441F);
		dustcoverC2.addChild(bone210);
		setRotationAngle(bone210, 0.0F, 0.0F, 0.3142F);
		bone210.cubeList.add(new ModelBox(bone210, 150, 515, 0.0F, -0.05F, 10.0F, 1, 1, 21, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		dustcoverC2.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}