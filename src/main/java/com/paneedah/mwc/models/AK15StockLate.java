package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AK15StockLate extends ModelBase {
	private final ModelRenderer stock2;
	private final ModelRenderer bone;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer trunnionBits;

	public AK15StockLate() {
		textureWidth = 416;
		textureHeight = 416;

		stock2 = new ModelRenderer(this);
		stock2.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		stock2.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 216, 116, -3.5F, -35.4F, 3.0F, 4, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 296, 340, -2.5F, -36.4F, 5.0F, 2, 1, 11, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 397, 153, -2.5F, -36.4F, 15.95F, 2, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 371, 335, -2.5F, -36.4F, 23.95F, 2, 2, 5, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 394, -2.5F, -22.5716F, 27.95F, 2, 2, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 184, 390, -2.5F, -36.4F, 28.95F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 294, 390, -2.5F, -22.5716F, 28.95F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 13, 380, -3.5F, -35.4F, 5.0F, 4, 5, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 386, 226, -3.5F, -33.4F, 3.0F, 4, 3, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 388, 206, -3.5F, -33.4F, 4.0F, 4, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 346, 390, -3.5F, -31.4F, 4.0F, 4, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 220, 386, -2.0F, -28.0F, 25.1F, 1, 3, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 378, 395, -2.0F, -28.0F, 24.275F, 1, 3, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 269, 402, -2.0F, -25.7F, 24.375F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 274, 402, -2.0F, -26.0F, 26.1F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 291, 402, -2.0F, -28.0F, 26.1F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 208, 247, -2.0F, -28.0F, 27.1F, 1, 6, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 296, 402, -2.0F, -22.2F, 27.1F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 326, 402, -2.0F, -22.2F, 26.3F, 1, 1, 1, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, -7.0F, 39.0F);
		stock2.addChild(bone4);
		setRotationAngle(bone4, 0.7854F, 0.0F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 391, 285, -2.5F, -44.8306F, -5.2527F, 2, 1, 2, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, -7.0F, 39.0F);
		stock2.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 141, 341, -3.9142F, -27.9858F, -33.0F, 2, 3, 10, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 323, 340, -2.5142F, -28.4858F, -33.0F, 2, 4, 10, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 89, 341, -2.5142F, -28.7358F, -24.7F, 2, 4, 10, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 348, 352, -1.8142F, -26.7358F, -20.7F, 1, 1, 10, 0.2F, false));
		bone5.cubeList.add(new ModelBox(bone5, 256, 383, -1.8142F, -25.7358F, -14.7F, 1, 1, 4, -0.2F, false));
		bone5.cubeList.add(new ModelBox(bone5, 381, 16, -1.8142F, -25.1358F, -14.7F, 1, 1, 4, -0.2F, false));
		bone5.cubeList.add(new ModelBox(bone5, 360, 381, -1.8142F, -24.5358F, -14.7F, 1, 1, 4, -0.2F, false));
		bone5.cubeList.add(new ModelBox(bone5, 284, 394, -2.5142F, -25.0358F, -16.1F, 2, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 331, 402, -2.0F, -24.2206F, -16.4529F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 353, 239, -2.7142F, -28.5358F, -24.8F, 1, 1, 10, 0.1F, false));
		bone5.cubeList.add(new ModelBox(bone5, 356, 143, -2.7142F, -25.9358F, -24.8F, 1, 1, 9, 0.1F, false));
		bone5.cubeList.add(new ModelBox(bone5, 356, 154, -1.3142F, -25.9358F, -24.8F, 1, 1, 9, 0.1F, false));
		bone5.cubeList.add(new ModelBox(bone5, 260, 353, -1.3142F, -28.5358F, -24.8F, 1, 1, 10, 0.1F, false));
		bone5.cubeList.add(new ModelBox(bone5, 283, 353, -2.0142F, -29.2358F, -24.7F, 1, 1, 10, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 357, 269, -2.0142F, -25.2358F, -24.7F, 1, 1, 9, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 114, 341, -3.0142F, -25.3858F, -33.0F, 3, 2, 10, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 360, 94, -3.7142F, -24.4858F, -29.6F, 3, 1, 7, -0.4F, false));
		bone5.cubeList.add(new ModelBox(bone5, 360, 103, -3.7142F, -23.9858F, -29.6F, 3, 1, 7, -0.4F, false));
		bone5.cubeList.add(new ModelBox(bone5, 360, 112, -2.3142F, -23.9858F, -29.6F, 3, 1, 7, -0.4F, false));
		bone5.cubeList.add(new ModelBox(bone5, 360, 121, -2.3142F, -24.4858F, -29.6F, 3, 1, 7, -0.4F, false));
		bone5.cubeList.add(new ModelBox(bone5, 262, 341, -3.6642F, -25.0858F, -33.0F, 2, 1, 10, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 0, 342, -1.3392F, -25.0858F, -33.0F, 2, 1, 10, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 178, 385, -1.3392F, -24.3858F, -32.2F, 2, 1, 3, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 189, 385, -3.6642F, -24.3858F, -32.2F, 2, 1, 3, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 166, 341, -1.0892F, -27.9858F, -33.0F, 2, 3, 10, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 296, 325, -3.9142F, -27.9858F, -11.05F, 3, 13, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 71, 181, -1.0892F, -27.9858F, -11.05F, 2, 13, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 222, 283, -1.0892F, -27.9858F, -10.05F, 2, 13, 2, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 162, 364, -3.9142F, -27.9858F, -10.05F, 3, 13, 2, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 392, 42, -0.8858F, -28.1858F, -23.85F, 2, 1, 2, -0.2F, false));
		bone5.cubeList.add(new ModelBox(bone5, 392, 38, -4.1142F, -28.1858F, -23.85F, 2, 1, 2, -0.2F, false));
		bone5.cubeList.add(new ModelBox(bone5, 397, 176, -0.8858F, -28.1858F, -15.25F, 2, 1, 1, -0.2F, false));
		bone5.cubeList.add(new ModelBox(bone5, 397, 179, -4.1142F, -28.1858F, -15.25F, 2, 1, 1, -0.2F, false));
		bone5.cubeList.add(new ModelBox(bone5, 397, 182, -0.8858F, -28.1858F, -14.85F, 2, 1, 1, -0.2F, false));
		bone5.cubeList.add(new ModelBox(bone5, 397, 185, -4.1142F, -28.1858F, -14.85F, 2, 1, 1, -0.2F, false));
		bone5.cubeList.add(new ModelBox(bone5, 381, 370, -4.1142F, -28.1858F, -14.25F, 1, 1, 4, -0.2F, false));
		bone5.cubeList.add(new ModelBox(bone5, 345, 317, -4.225F, -21.5356F, -15.0702F, 4, 1, 5, -0.3F, false));
		bone5.cubeList.add(new ModelBox(bone5, 305, 367, -1.775F, -21.5356F, -15.0702F, 3, 1, 5, -0.3F, false));
		bone5.cubeList.add(new ModelBox(bone5, 371, 381, 0.1142F, -28.1858F, -14.25F, 1, 1, 4, -0.2F, false));
		bone5.cubeList.add(new ModelBox(bone5, 178, 381, -3.9142F, -25.3858F, -33.0F, 2, 2, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 245, 392, -1.0892F, -25.3858F, -33.0F, 2, 2, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 397, 188, -3.9142F, -24.9858F, -28.0F, 2, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 190, 397, -1.0892F, -24.9858F, -28.0F, 2, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 394, 46, -2.1F, -24.8206F, -16.8529F, 2, 2, 1, -0.4F, false));
		bone5.cubeList.add(new ModelBox(bone5, 58, 394, -2.9F, -24.8206F, -16.8529F, 2, 2, 1, -0.4F, false));
		bone5.cubeList.add(new ModelBox(bone5, 378, 269, -2.9F, -14.7858F, -14.3786F, 2, 1, 4, -0.4F, false));
		bone5.cubeList.add(new ModelBox(bone5, 378, 275, -2.1F, -14.7858F, -14.3786F, 2, 1, 4, -0.4F, false));
		bone5.cubeList.add(new ModelBox(bone5, 87, 394, -2.9F, -24.8206F, -16.7529F, 2, 2, 1, -0.4F, false));
		bone5.cubeList.add(new ModelBox(bone5, 252, 394, -2.1F, -24.8206F, -16.7529F, 2, 2, 1, -0.4F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, 8.0F, 10.0F);
		stock2.addChild(bone7);
		setRotationAngle(bone7, 0.0F, 0.0F, -0.7854F);
		bone7.cubeList.add(new ModelBox(bone7, 25, 342, 27.6278F, -33.1633F, -4.0F, 2, 1, 10, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 351, 402, 28.6278F, -33.1633F, -5.0F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 402, 351, 30.042F, -31.7491F, -5.0F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 89, 327, 30.042F, -31.7491F, -4.0F, 1, 2, 10, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 276, 398, 30.042F, -31.7491F, 5.95F, 1, 2, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 397, 191, 27.6278F, -33.1633F, 5.95F, 2, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 398, 289, 30.042F, -31.7491F, 13.95F, 1, 2, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 397, 194, 27.6278F, -33.1633F, 13.95F, 2, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 291, 398, 30.042F, -31.7491F, 17.95F, 1, 2, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 197, 397, 27.6278F, -33.1633F, 17.95F, 2, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 397, 197, 19.8472F, -21.5591F, 17.95F, 2, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 398, 296, 18.4354F, -23.9709F, 17.95F, 1, 2, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 392, 88, 30.042F, -31.7491F, 18.95F, 1, 2, 2, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 391, 361, 27.6278F, -33.1633F, 18.95F, 2, 1, 2, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 392, 93, 18.4354F, -23.9709F, 18.95F, 1, 2, 2, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 391, 365, 19.8472F, -21.5591F, 18.95F, 2, 1, 2, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 366, 390, 30.042F, -31.7491F, 14.95F, 1, 1, 3, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 375, 390, 28.6278F, -33.1633F, 14.95F, 1, 1, 3, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 402, 354, 28.2136F, -33.1633F, -5.0F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 356, 402, 30.042F, -31.3349F, -5.0F, 1, 1, 1, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-3.5F, -31.0F, 18.5F);
		stock2.addChild(bone8);
		setRotationAngle(bone8, -0.3491F, 0.0F, 0.0F);
		bone8.cubeList.add(new ModelBox(bone8, 392, 98, -0.4108F, -2.8904F, -3.7125F, 2, 3, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 392, 103, 2.4142F, -2.8904F, -3.7125F, 2, 3, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 51, 391, 2.4142F, -5.6265F, 3.8051F, 2, 4, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 392, 16, -0.4108F, -5.6265F, 3.8051F, 2, 4, 1, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-3.225F, -29.4F, 23.5F);
		stock2.addChild(bone9);
		setRotationAngle(bone9, 0.2618F, 0.0F, 0.0F);
		bone9.cubeList.add(new ModelBox(bone9, 142, 382, -1.0F, -2.0F, 0.0F, 4, 4, 1, -0.3F, false));
		bone9.cubeList.add(new ModelBox(bone9, 17, 366, 1.225F, -1.0133F, -0.6115F, 1, 6, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 193, 390, 1.225F, 4.5867F, 0.5885F, 1, 4, 2, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 215, 306, 0.325F, -1.4133F, -1.0115F, 2, 10, 1, -0.4F, false));
		bone9.cubeList.add(new ModelBox(bone9, 287, 341, 1.125F, -1.4133F, -1.0115F, 2, 10, 1, -0.4F, false));
		bone9.cubeList.add(new ModelBox(bone9, 120, 387, 1.45F, -2.0F, 0.0F, 3, 4, 1, -0.3F, false));

		trunnionBits = new ModelRenderer(this);
		trunnionBits.setRotationPoint(0.0F, 3.0F, -0.2F);
		stock2.addChild(trunnionBits);
		trunnionBits.cubeList.add(new ModelBox(trunnionBits, 392, 26, -3.8F, -36.3F, 0.3F, 2, 1, 2, 0.0F, false));
		trunnionBits.cubeList.add(new ModelBox(trunnionBits, 398, 240, -0.8F, -36.3F, 1.3F, 2, 1, 1, 0.0F, false));
		trunnionBits.cubeList.add(new ModelBox(trunnionBits, 404, 168, -0.2F, -34.8F, 0.5F, 1, 1, 1, 0.0F, false));
		trunnionBits.cubeList.add(new ModelBox(trunnionBits, 170, 404, -3.8F, -34.8F, 0.5F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		stock2.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}