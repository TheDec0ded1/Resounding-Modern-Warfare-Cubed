package com.paneedah.mwc.models;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AK12KMag extends ModelBase {
	private final ModelRenderer mag;
	private final ModelRenderer bone5;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;

	public AK12KMag() {
		textureWidth = 64;
		textureHeight = 64;

		mag = new ModelRenderer(this);
		mag.setRotationPoint(0.0F, 23.7F, 0.1F);
		mag.cubeList.add(new ModelBox(mag, 9, 10, -0.5F, -32.3627F, -23.1229F, 1, 2, 5, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 9, 10, -3.5F, -32.3627F, -23.1229F, 1, 2, 5, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 13, 14, -2.5F, -31.3627F, -19.1229F, 2, 1, 1, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-1.5F, -28.6927F, -23.9674F);
		mag.addChild(bone5);
		setRotationAngle(bone5, -0.1745F, 0.0F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 18, 32, -1.5F, -2.6593F, -2.7842F, 3, 6, 2, -0.001F, false));
		bone5.cubeList.add(new ModelBox(bone5, 19, 33, -1.5F, -0.6593F, -3.7842F, 3, 4, 1, -0.001F, false));
		bone5.cubeList.add(new ModelBox(bone5, 15, 19, -2.0F, -2.6593F, -1.5342F, 4, 6, 7, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 21, 25, -2.1F, -0.4959F, 4.3627F, 2, 2, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 21, 25, -2.1F, 0.9041F, 4.3627F, 2, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 21, 25, -2.1F, 2.2041F, 4.3627F, 2, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 21, 25, 0.1F, -0.4959F, 4.3627F, 2, 2, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 21, 25, 0.1F, 2.2041F, 4.3627F, 2, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 21, 25, 0.1F, 0.9041F, 4.3627F, 2, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 21, 25, 0.1F, -0.0959F, 1.9627F, 2, 2, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 4, 20, 0.4F, 1.6041F, -0.8373F, 2, 1, 4, -0.3F, false));
		bone5.cubeList.add(new ModelBox(bone5, 4, 20, 0.4F, 1.6041F, 1.6627F, 2, 1, 4, -0.3F, false));
		bone5.cubeList.add(new ModelBox(bone5, 4, 20, -2.4F, 1.6041F, 1.6627F, 2, 1, 4, -0.3F, false));
		bone5.cubeList.add(new ModelBox(bone5, 4, 20, -2.4F, 1.6041F, -0.8373F, 2, 1, 4, -0.3F, false));
		bone5.cubeList.add(new ModelBox(bone5, 4, 20, 0.4F, 7.2041F, -1.4373F, 2, 1, 4, -0.3F, false));
		bone5.cubeList.add(new ModelBox(bone5, 4, 20, 0.4F, 7.2041F, 1.0627F, 2, 1, 4, -0.3F, false));
		bone5.cubeList.add(new ModelBox(bone5, 4, 20, -2.4F, 7.2041F, 1.0627F, 2, 1, 4, -0.3F, false));
		bone5.cubeList.add(new ModelBox(bone5, 4, 20, -2.4F, 7.2041F, -1.4373F, 2, 1, 4, -0.3F, false));
		bone5.cubeList.add(new ModelBox(bone5, 21, 25, -2.1F, -0.0959F, 1.9627F, 2, 2, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 21, 25, -2.1F, 0.3041F, -0.5373F, 2, 2, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 21, 25, 0.1F, 0.3041F, -0.5373F, 2, 2, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 9, 8, -2.0F, 0.0873F, -3.548F, 4, 1, 2, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-1.5F, -28.6927F, -23.9674F);
		mag.addChild(bone7);
		setRotationAngle(bone7, -0.3054F, 0.0F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 9, 8, -1.5F, 2.5987F, -3.3949F, 3, 6, 3, 0.001F, false));
		bone7.cubeList.add(new ModelBox(bone7, 15, 6, -2.0F, 2.5987F, -1.1449F, 4, 6, 7, 0.001F, false));
		bone7.cubeList.add(new ModelBox(bone7, 21, 25, -2.1F, 4.0717F, 4.7731F, 2, 2, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 21, 25, -2.1F, 2.6717F, 4.7731F, 2, 2, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 21, 25, -2.1F, 3.3717F, 2.3731F, 2, 2, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 21, 25, -2.1F, 4.9717F, 2.3731F, 2, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 21, 25, -2.1F, 4.0717F, 0.1731F, 2, 2, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 21, 25, 0.1F, 4.0717F, 0.1731F, 2, 2, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 21, 25, 0.1F, 3.3717F, 2.3731F, 2, 2, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 21, 25, 0.1F, 2.6717F, 4.7731F, 2, 2, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 21, 25, 0.1F, 4.0717F, 4.7731F, 2, 2, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 21, 25, 0.1F, 6.0717F, 4.7731F, 2, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 21, 25, -2.1F, 6.0717F, 4.7731F, 2, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 4, 20, 0.4F, 5.4217F, 2.0731F, 2, 1, 4, -0.3F, false));
		bone7.cubeList.add(new ModelBox(bone7, 5, 21, 0.4F, 5.4217F, -0.1269F, 2, 1, 3, -0.3F, false));
		bone7.cubeList.add(new ModelBox(bone7, 4, 20, -2.4F, 5.4217F, 2.0731F, 2, 1, 4, -0.3F, false));
		bone7.cubeList.add(new ModelBox(bone7, 5, 21, -2.4F, 5.4217F, -0.1269F, 2, 1, 3, -0.3F, false));
		bone7.cubeList.add(new ModelBox(bone7, 5, 21, -2.4F, 10.9194F, -0.8556F, 2, 1, 3, -0.3F, false));
		bone7.cubeList.add(new ModelBox(bone7, 4, 20, -2.4F, 10.9194F, 1.3444F, 2, 1, 4, -0.3F, false));
		bone7.cubeList.add(new ModelBox(bone7, 4, 20, 0.4F, 10.9194F, 1.3444F, 2, 1, 4, -0.3F, false));
		bone7.cubeList.add(new ModelBox(bone7, 5, 21, 0.4F, 10.9194F, -0.8556F, 2, 1, 3, -0.3F, false));
		bone7.cubeList.add(new ModelBox(bone7, 21, 25, 0.1F, 4.9717F, 2.3731F, 2, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 9, 8, -2.0F, 5.9873F, -3.148F, 4, 1, 2, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 9, 8, -2.0F, 3.2873F, -3.148F, 4, 1, 2, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 49, 49, -2.0F, 4.1873F, -2.848F, 4, 2, 2, -0.3F, false));
		bone7.cubeList.add(new ModelBox(bone7, 49, 49, -2.0F, 1.3873F, -2.848F, 4, 2, 2, -0.3F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-3.1883F, -23.3512F, -24.1008F);
		mag.addChild(bone8);
		setRotationAngle(bone8, -0.4363F, 0.0F, 0.0F);
		bone8.cubeList.add(new ModelBox(bone8, 10, 8, 0.1883F, 2.8635F, -4.4591F, 3, 6, 3, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 0, 13, -0.3117F, 2.8635F, -2.2091F, 4, 6, 7, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 21, 25, -0.4117F, 2.7046F, -1.0902F, 2, 2, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 21, 25, -0.4117F, 2.2046F, 1.1098F, 2, 2, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 21, 25, -0.4117F, 3.8046F, 1.1098F, 2, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 21, 25, -0.4117F, 2.9046F, 3.5098F, 2, 2, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 21, 25, -0.4117F, 1.5046F, 3.5098F, 2, 2, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 21, 25, 1.7883F, 2.9046F, 3.5098F, 2, 2, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 21, 25, 1.7883F, 1.5046F, 3.5098F, 2, 2, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 21, 25, 1.7883F, 3.8046F, 1.1098F, 2, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 21, 25, 1.7883F, 2.2046F, 1.1098F, 2, 2, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 21, 25, 1.7883F, 2.7046F, -1.0902F, 2, 2, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 5, 21, 2.0883F, 4.2546F, -1.3902F, 2, 1, 3, -0.3F, false));
		bone8.cubeList.add(new ModelBox(bone8, 4, 20, 2.0883F, 4.2546F, 0.8098F, 2, 1, 4, -0.3F, false));
		bone8.cubeList.add(new ModelBox(bone8, 4, 20, -0.7117F, 4.2546F, 0.8098F, 2, 1, 4, -0.3F, false));
		bone8.cubeList.add(new ModelBox(bone8, 5, 21, -0.7117F, 4.2546F, -1.3902F, 2, 1, 3, -0.3F, false));
		bone8.cubeList.add(new ModelBox(bone8, 4, 20, 2.0883F, 9.5433F, 0.163F, 2, 1, 4, -0.3F, false));
		bone8.cubeList.add(new ModelBox(bone8, 4, 20, 2.0883F, 9.5433F, -2.437F, 2, 1, 4, -0.3F, false));
		bone8.cubeList.add(new ModelBox(bone8, 4, 20, -0.7117F, 9.5433F, -2.437F, 2, 1, 4, -0.3F, false));
		bone8.cubeList.add(new ModelBox(bone8, 4, 20, -0.7117F, 9.5433F, 0.163F, 2, 1, 4, -0.3F, false));
		bone8.cubeList.add(new ModelBox(bone8, 9, 8, -0.3117F, 6.4458F, -4.2146F, 4, 1, 2, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 9, 8, -0.3117F, 3.8458F, -4.2146F, 4, 1, 2, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 49, 49, -0.3117F, 4.6458F, -3.9146F, 4, 2, 2, -0.3F, false));
		bone8.cubeList.add(new ModelBox(bone8, 49, 49, -0.3117F, 2.0458F, -3.9146F, 4, 2, 2, -0.3F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-3.1883F, -17.745F, -25.2985F);
		mag.addChild(bone9);
		setRotationAngle(bone9, -0.6545F, 0.0F, 0.0F);
		bone9.cubeList.add(new ModelBox(bone9, 8, 7, 0.1883F, 2.4396F, -5.1169F, 3, 6, 3, 0.001F, false));
		bone9.cubeList.add(new ModelBox(bone9, 9, 8, -0.3117F, 6.9396F, -4.9169F, 4, 2, 2, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 25, 55, -0.3117F, 5.1396F, -4.5169F, 4, 2, 2, -0.3F, false));
		bone9.cubeList.add(new ModelBox(bone9, 49, 49, -0.3117F, 2.5396F, -4.5169F, 4, 2, 2, -0.3F, false));
		bone9.cubeList.add(new ModelBox(bone9, 9, 8, -0.3117F, 4.3396F, -4.9169F, 4, 1, 2, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 0, 0, -0.3117F, 2.4396F, -2.8669F, 4, 6, 7, 0.001F, false));
		bone9.cubeList.add(new ModelBox(bone9, 29, 24, -0.3117F, 8.3396F, -3.9669F, 4, 1, 8, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 21, 25, 1.7883F, 1.0974F, 2.106F, 2, 2, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 21, 25, 1.7883F, -0.3026F, 2.106F, 2, 2, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 21, 25, -0.4117F, 1.0974F, 2.106F, 2, 2, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 21, 25, -0.4117F, -0.3026F, 2.106F, 2, 2, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 4, 20, -0.7117F, 2.4474F, -0.594F, 2, 1, 4, -0.3F, false));
		bone9.cubeList.add(new ModelBox(bone9, 5, 21, -0.7117F, 2.4474F, -2.794F, 2, 1, 3, -0.3F, false));
		bone9.cubeList.add(new ModelBox(bone9, 21, 25, -0.4117F, 1.8974F, -2.494F, 2, 1, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 21, 25, -0.4117F, 1.1974F, -2.494F, 2, 1, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 21, 25, -0.4117F, 0.5974F, -0.294F, 2, 2, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 21, 25, -0.4117F, 1.9974F, -0.294F, 2, 1, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 21, 25, 1.7883F, 0.5974F, -0.294F, 2, 2, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 21, 25, 1.7883F, 1.9974F, -0.294F, 2, 1, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 21, 25, 1.7883F, 1.8974F, -2.494F, 2, 1, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 21, 25, 1.7883F, 1.1974F, -2.494F, 2, 1, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 5, 21, 2.0883F, 2.4474F, -2.794F, 2, 1, 3, -0.3F, false));
		bone9.cubeList.add(new ModelBox(bone9, 4, 20, 2.0883F, 2.4474F, -0.594F, 2, 1, 4, -0.3F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		mag.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 3, 16, -1.4F, -30.25F, -24.6F, 2, 2, 6, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 3, 16, -3.6F, -30.25F, -24.6F, 2, 2, 6, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 4, 20, -3.9F, -25.1088F, -22.9648F, 2, 1, 4, -0.3F, false));
		bone.cubeList.add(new ModelBox(bone, 4, 20, -3.9F, -25.1088F, -25.4648F, 2, 1, 4, -0.3F, false));
		bone.cubeList.add(new ModelBox(bone, 4, 20, -1.1F, -25.1088F, -22.9648F, 2, 1, 4, -0.3F, false));
		bone.cubeList.add(new ModelBox(bone, 4, 20, -1.1F, -25.1088F, -25.4648F, 2, 1, 4, -0.3F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-1.5F, -15.6351F, -25.08F);
		mag.addChild(bone2);
		setRotationAngle(bone2, -0.829F, 0.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 4, 20, 1.4F, 4.8002F, -1.2383F, 1, 2, 4, -0.3F, false));
		bone2.cubeList.add(new ModelBox(bone2, 5, 21, 1.4F, 4.8002F, -3.4383F, 1, 2, 3, -0.3F, false));
		bone2.cubeList.add(new ModelBox(bone2, 21, 25, 0.1F, 4.2502F, -3.1383F, 2, 1, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 21, 25, 0.1F, 3.9502F, -3.1383F, 2, 1, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 21, 25, 0.1F, 3.1502F, -0.9383F, 2, 2, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 21, 25, -2.1F, 3.1502F, -0.9383F, 2, 2, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 21, 25, -2.1F, 4.2502F, -3.1383F, 2, 1, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 21, 25, -2.1F, 3.9502F, -3.1383F, 2, 1, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 5, 21, -2.4F, 4.8002F, -3.4383F, 1, 2, 3, -0.3F, false));
		bone2.cubeList.add(new ModelBox(bone2, 4, 20, -2.4F, 4.8002F, -1.2383F, 1, 2, 4, -0.3F, false));
		bone2.cubeList.add(new ModelBox(bone2, 21, 25, -2.1F, 2.0502F, 1.4617F, 2, 2, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 21, 25, -2.1F, 3.4502F, 1.4617F, 2, 2, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 21, 25, 0.1F, 2.0502F, 1.4617F, 2, 2, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 21, 25, 0.1F, 3.4502F, 1.4617F, 2, 2, 1, 0.0F, false));
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