package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AKM742Mag extends ModelBase {
	private final ModelRenderer magazine;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;

	public AKM742Mag() {
		textureWidth = 352;
		textureHeight = 352;

		magazine = new ModelRenderer(this);
		magazine.setRotationPoint(0.0F, 23.7F, 0.1F);
		

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-1.5F, -28.6927F, -23.9674F);
		magazine.addChild(bone6);
		setRotationAngle(bone6, -0.1745F, 0.0F, 0.0F);
		bone6.cubeList.add(new ModelBox(bone6, 290, 325, -1.5F, -2.6593F, -2.7842F, 3, 6, 2, -0.001F, false));
		bone6.cubeList.add(new ModelBox(bone6, 304, 274, -2.0F, -2.6593F, -1.5342F, 4, 6, 7, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 310, 259, 0.3F, -1.0F, -2.4F, 2, 1, 8, -0.2F, false));
		bone6.cubeList.add(new ModelBox(bone6, 310, 287, 0.3F, 1.0F, -2.4F, 2, 1, 8, -0.2F, false));
		bone6.cubeList.add(new ModelBox(bone6, 318, 316, -2.3F, -1.0F, -2.4F, 2, 1, 8, -0.2F, false));
		bone6.cubeList.add(new ModelBox(bone6, 268, 330, 0.3F, -2.6F, -0.4F, 2, 5, 1, -0.2F, false));
		bone6.cubeList.add(new ModelBox(bone6, 302, 167, -2.3F, -2.6F, -0.4F, 2, 5, 1, -0.2F, false));
		bone6.cubeList.add(new ModelBox(bone6, 198, 332, 0.3F, -2.6F, 1.6F, 2, 5, 1, -0.2F, false));
		bone6.cubeList.add(new ModelBox(bone6, 104, 331, -2.3F, -2.6F, 1.6F, 2, 5, 1, -0.2F, false));
		bone6.cubeList.add(new ModelBox(bone6, 116, 313, 0.3F, -2.6F, 3.6F, 2, 6, 1, -0.2F, false));
		bone6.cubeList.add(new ModelBox(bone6, 24, 296, -2.3F, -2.6F, 3.6F, 2, 6, 1, -0.2F, false));
		bone6.cubeList.add(new ModelBox(bone6, 298, 316, -2.3F, 1.0F, -2.4F, 2, 1, 8, -0.2F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-1.5F, -28.6927F, -23.9674F);
		magazine.addChild(bone7);
		setRotationAngle(bone7, -0.3054F, 0.0F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 300, 325, -1.5F, 2.5987F, -2.3949F, 3, 6, 2, 0.001F, false));
		bone7.cubeList.add(new ModelBox(bone7, 304, 303, -2.0F, 2.5987F, -1.1449F, 4, 6, 7, 0.001F, false));
		bone7.cubeList.add(new ModelBox(bone7, 312, 194, 0.3F, 5.0F, -2.1F, 2, 1, 8, -0.2F, false));
		bone7.cubeList.add(new ModelBox(bone7, 312, 185, 0.3F, 3.0F, -2.1F, 2, 1, 8, -0.2F, false));
		bone7.cubeList.add(new ModelBox(bone7, 312, 203, 0.3F, 7.0F, -2.1F, 2, 1, 8, -0.2F, false));
		bone7.cubeList.add(new ModelBox(bone7, 278, 315, -2.3F, 3.0F, -2.1F, 2, 1, 8, -0.2F, false));
		bone7.cubeList.add(new ModelBox(bone7, 72, 315, -2.3F, 5.0F, -2.1F, 2, 1, 8, -0.2F, false));
		bone7.cubeList.add(new ModelBox(bone7, 52, 315, -2.3F, 7.0F, -2.1F, 2, 1, 8, -0.2F, false));
		bone7.cubeList.add(new ModelBox(bone7, 328, 238, -2.3F, 1.6679F, 1.8666F, 2, 7, 1, -0.2F, false));
		bone7.cubeList.add(new ModelBox(bone7, 110, 330, -2.3F, 2.3983F, 3.98F, 2, 6, 1, -0.2F, false));
		bone7.cubeList.add(new ModelBox(bone7, 328, 230, -2.3F, 1.929F, -0.1163F, 2, 7, 1, -0.2F, false));
		bone7.cubeList.add(new ModelBox(bone7, 110, 322, 0.3F, 1.929F, -0.1163F, 2, 7, 1, -0.2F, false));
		bone7.cubeList.add(new ModelBox(bone7, 240, 313, 0.3F, 1.6679F, 1.8666F, 2, 7, 1, -0.2F, false));
		bone7.cubeList.add(new ModelBox(bone7, 82, 330, 0.3F, 2.3983F, 3.98F, 2, 6, 1, -0.2F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-3.1883F, -23.3512F, -24.1008F);
		magazine.addChild(bone8);
		setRotationAngle(bone8, -0.4363F, 0.0F, 0.0F);
		bone8.cubeList.add(new ModelBox(bone8, 310, 325, 0.1883F, 2.8635F, -3.4591F, 3, 6, 2, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 306, 37, -0.3117F, 2.8635F, -2.2091F, 4, 6, 7, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 312, 212, 1.9883F, 4.3585F, -3.1666F, 2, 1, 8, -0.2F, false));
		bone8.cubeList.add(new ModelBox(bone8, 312, 221, 1.9883F, 6.3585F, -3.1666F, 2, 1, 8, -0.2F, false));
		bone8.cubeList.add(new ModelBox(bone8, 32, 315, -0.6117F, 4.3585F, -3.1666F, 2, 1, 8, -0.2F, false));
		bone8.cubeList.add(new ModelBox(bone8, 12, 315, -0.6117F, 6.3585F, -3.1666F, 2, 1, 8, -0.2F, false));
		bone8.cubeList.add(new ModelBox(bone8, 306, 333, 1.9883F, 3.4676F, -1.1191F, 2, 4, 1, -0.2F, false));
		bone8.cubeList.add(new ModelBox(bone8, 312, 333, -0.6117F, 3.4676F, -1.1191F, 2, 4, 1, -0.2F, false));
		bone8.cubeList.add(new ModelBox(bone8, 332, 201, -0.6117F, 2.9499F, 0.8127F, 2, 5, 1, -0.2F, false));
		bone8.cubeList.add(new ModelBox(bone8, 116, 330, -0.6117F, 2.4068F, 2.8729F, 2, 6, 1, -0.2F, false));
		bone8.cubeList.add(new ModelBox(bone8, 122, 330, 1.9883F, 2.4068F, 2.8729F, 2, 6, 1, -0.2F, false));
		bone8.cubeList.add(new ModelBox(bone8, 332, 207, 1.9883F, 2.9499F, 0.8127F, 2, 5, 1, -0.2F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-3.1883F, -17.745F, -25.2985F);
		magazine.addChild(bone9);
		setRotationAngle(bone9, -0.6545F, 0.0F, 0.0F);
		bone9.cubeList.add(new ModelBox(bone9, 320, 325, 0.1883F, 2.4396F, -4.1169F, 3, 6, 2, 0.001F, false));
		bone9.cubeList.add(new ModelBox(bone9, 306, 50, -0.3117F, 2.4396F, -2.8669F, 4, 6, 7, 0.001F, false));
		bone9.cubeList.add(new ModelBox(bone9, 30, 280, -0.3117F, 8.3396F, -3.9669F, 4, 1, 8, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 220, 313, 1.9883F, 7.1523F, -3.7689F, 2, 1, 8, -0.2F, false));
		bone9.cubeList.add(new ModelBox(bone9, 140, 313, 1.9883F, 5.1523F, -3.7689F, 2, 1, 8, -0.2F, false));
		bone9.cubeList.add(new ModelBox(bone9, 96, 313, 1.9883F, 3.1523F, -3.7689F, 2, 1, 8, -0.2F, false));
		bone9.cubeList.add(new ModelBox(bone9, 200, 314, -0.6117F, 3.1523F, -3.7689F, 2, 1, 8, -0.2F, false));
		bone9.cubeList.add(new ModelBox(bone9, 180, 314, -0.6117F, 5.1523F, -3.7689F, 2, 1, 8, -0.2F, false));
		bone9.cubeList.add(new ModelBox(bone9, 160, 314, -0.6117F, 7.1523F, -3.7689F, 2, 1, 8, -0.2F, false));
		bone9.cubeList.add(new ModelBox(bone9, 330, 258, 1.9883F, 1.8403F, 2.0997F, 2, 6, 1, -0.2F, false));
		bone9.cubeList.add(new ModelBox(bone9, 128, 330, 1.9883F, 1.8402F, -0.0105F, 2, 6, 1, -0.2F, false));
		bone9.cubeList.add(new ModelBox(bone9, 142, 330, 1.9883F, 1.7875F, -2.001F, 2, 6, 1, -0.2F, false));
		bone9.cubeList.add(new ModelBox(bone9, 148, 330, -0.6117F, 1.7875F, -2.001F, 2, 6, 1, -0.2F, false));
		bone9.cubeList.add(new ModelBox(bone9, 174, 330, -0.6117F, 1.8402F, -0.0105F, 2, 6, 1, -0.2F, false));
		bone9.cubeList.add(new ModelBox(bone9, 262, 330, -0.6117F, 1.8403F, 2.0997F, 2, 6, 1, -0.2F, false));
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