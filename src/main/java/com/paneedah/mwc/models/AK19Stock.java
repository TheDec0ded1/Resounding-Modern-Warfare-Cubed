package com.paneedah.mwc.models;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AK19Stock extends ModelBase {
	private final ModelRenderer stock;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone4;
	private final ModelRenderer bone3;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;

	public AK19Stock() {
		textureWidth = 80;
		textureHeight = 80;

		stock = new ModelRenderer(this);
		stock.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		stock.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 31, 43, -3.5F, -35.4F, 3.0F, 4, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 9, 4, -2.5F, -36.4F, 5.0F, 2, 1, 11, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 19, 14, -2.5F, -36.4F, 15.95F, 2, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 15, 10, -2.5F, -36.4F, 23.95F, 2, 2, 5, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 19, 14, -2.5F, -22.5716F, 27.95F, 2, 2, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 69, 76, -2.5F, -36.4F, 28.95F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 68, 76, -2.5F, -22.5716F, 28.95F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 30, 43, -3.5F, -35.4F, 5.0F, 4, 5, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 30, 43, -3.5F, -33.4F, 3.0F, 4, 3, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 23, 18, -3.5F, -33.4F, 4.0F, 4, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 23, 18, -3.5F, -31.4F, 4.0F, 4, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 19, 14, -2.0F, -28.0F, 25.1F, 1, 3, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 19, 14, -2.0F, -28.0F, 24.275F, 1, 3, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 19, 14, -2.0F, -25.7F, 24.375F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 19, 14, -2.0F, -26.0F, 26.1F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 19, 14, -2.0F, -28.0F, 26.1F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 21, 4, -2.0F, -28.0F, 27.1F, 1, 6, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 19, 14, -2.0F, -22.2F, 27.1F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 19, 14, -2.0F, -22.2F, 26.3F, 1, 1, 1, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, -7.0F, 39.0F);
		stock.addChild(bone2);
		setRotationAngle(bone2, 0.7854F, 0.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 18, 13, -2.5F, -44.8306F, -5.2527F, 2, 1, 2, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, -7.0F, 39.0F);
		stock.addChild(bone4);
		bone4.cubeList.add(new ModelBox(bone4, 0, 67, -3.9142F, -27.9858F, -33.0F, 2, 3, 10, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 10, 5, -2.5142F, -28.4858F, -33.0F, 2, 4, 10, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 1, 66, -2.5142F, -28.7358F, -24.7F, 2, 4, 10, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 58, 69, -1.8142F, -26.7358F, -20.7F, 1, 1, 10, 0.2F, false));
		bone4.cubeList.add(new ModelBox(bone4, 67, 75, -1.8142F, -25.7358F, -14.7F, 1, 1, 4, -0.2F, false));
		bone4.cubeList.add(new ModelBox(bone4, 67, 75, -1.8142F, -25.1358F, -14.7F, 1, 1, 4, -0.2F, false));
		bone4.cubeList.add(new ModelBox(bone4, 67, 75, -1.8142F, -24.5358F, -14.7F, 1, 1, 4, -0.2F, false));
		bone4.cubeList.add(new ModelBox(bone4, 19, 14, -2.5142F, -25.0358F, -16.1F, 2, 1, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 19, 14, -2.0F, -24.2206F, -16.4529F, 1, 1, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 10, 5, -2.7142F, -28.5358F, -24.8F, 1, 1, 10, 0.1F, false));
		bone4.cubeList.add(new ModelBox(bone4, 11, 6, -2.7142F, -25.9358F, -24.8F, 1, 1, 9, 0.1F, false));
		bone4.cubeList.add(new ModelBox(bone4, 11, 6, -1.3142F, -25.9358F, -24.8F, 1, 1, 9, 0.1F, false));
		bone4.cubeList.add(new ModelBox(bone4, 10, 5, -1.3142F, -28.5358F, -24.8F, 1, 1, 10, 0.1F, false));
		bone4.cubeList.add(new ModelBox(bone4, 10, 5, -2.0142F, -29.2358F, -24.7F, 1, 1, 10, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 11, 6, -2.0142F, -25.2358F, -24.7F, 1, 1, 9, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 9, 7, -3.0142F, -25.3858F, -33.0F, 3, 2, 10, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 13, 8, -3.7142F, -24.4858F, -29.6F, 3, 1, 7, -0.4F, false));
		bone4.cubeList.add(new ModelBox(bone4, 13, 8, -3.7142F, -23.9858F, -29.6F, 3, 1, 7, -0.4F, false));
		bone4.cubeList.add(new ModelBox(bone4, 12, 11, -2.3142F, -23.9858F, -29.6F, 3, 1, 7, -0.4F, false));
		bone4.cubeList.add(new ModelBox(bone4, 12, 10, -2.3142F, -24.4858F, -29.6F, 3, 1, 7, -0.4F, false));
		bone4.cubeList.add(new ModelBox(bone4, 10, 8, -3.6642F, -25.0858F, -33.0F, 2, 1, 10, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 10, 8, -1.3392F, -25.0858F, -33.0F, 2, 1, 10, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 17, 12, -1.3392F, -24.3858F, -32.2F, 2, 1, 3, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 17, 15, -3.6642F, -24.3858F, -32.2F, 2, 1, 3, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 8, 7, -1.0892F, -27.9858F, -33.0F, 2, 3, 10, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 18, 0, -3.9142F, -27.9858F, -11.05F, 3, 13, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 19, 0, -1.0892F, -27.9858F, -11.05F, 2, 13, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 71, 65, -1.0892F, -27.9858F, -10.05F, 2, 13, 2, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 70, 65, -3.9142F, -27.9858F, -10.05F, 3, 13, 2, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 18, 13, -0.8858F, -28.1858F, -23.85F, 2, 1, 2, -0.2F, false));
		bone4.cubeList.add(new ModelBox(bone4, 18, 13, -4.1142F, -28.1858F, -23.85F, 2, 1, 2, -0.2F, false));
		bone4.cubeList.add(new ModelBox(bone4, 19, 14, -0.8858F, -28.1858F, -15.25F, 2, 1, 1, -0.2F, false));
		bone4.cubeList.add(new ModelBox(bone4, 19, 14, -4.1142F, -28.1858F, -15.25F, 2, 1, 1, -0.2F, false));
		bone4.cubeList.add(new ModelBox(bone4, 19, 14, -0.8858F, -28.1858F, -14.85F, 2, 1, 1, -0.2F, false));
		bone4.cubeList.add(new ModelBox(bone4, 19, 14, -4.1142F, -28.1858F, -14.85F, 2, 1, 1, -0.2F, false));
		bone4.cubeList.add(new ModelBox(bone4, 16, 11, -4.1142F, -28.1858F, -14.25F, 1, 1, 4, -0.2F, false));
		bone4.cubeList.add(new ModelBox(bone4, 26, 46, -4.225F, -21.5356F, -15.0702F, 4, 1, 5, -0.3F, false));
		bone4.cubeList.add(new ModelBox(bone4, 15, 10, -1.775F, -21.5356F, -15.0702F, 3, 1, 5, -0.3F, false));
		bone4.cubeList.add(new ModelBox(bone4, 16, 11, 0.1142F, -28.1858F, -14.25F, 1, 1, 4, -0.2F, false));
		bone4.cubeList.add(new ModelBox(bone4, 31, 43, -3.9142F, -25.3858F, -33.0F, 2, 2, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 31, 43, -1.0892F, -25.3858F, -33.0F, 2, 2, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 19, 14, -3.9142F, -24.9858F, -28.0F, 2, 1, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 19, 14, -1.0892F, -24.9858F, -28.0F, 2, 1, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 19, 14, -2.1F, -24.8206F, -16.8529F, 2, 2, 1, -0.4F, false));
		bone4.cubeList.add(new ModelBox(bone4, 19, 14, -2.9F, -24.8206F, -16.8529F, 2, 2, 1, -0.4F, false));
		bone4.cubeList.add(new ModelBox(bone4, 16, 11, -2.9F, -14.7858F, -14.3786F, 2, 1, 4, -0.4F, false));
		bone4.cubeList.add(new ModelBox(bone4, 16, 11, -2.1F, -14.7858F, -14.3786F, 2, 1, 4, -0.4F, false));
		bone4.cubeList.add(new ModelBox(bone4, 19, 14, -2.9F, -24.8206F, -16.7529F, 2, 2, 1, -0.4F, false));
		bone4.cubeList.add(new ModelBox(bone4, 19, 14, -2.1F, -24.8206F, -16.7529F, 2, 2, 1, -0.4F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 8.0F, 10.0F);
		stock.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.0F, -0.7854F);
		bone3.cubeList.add(new ModelBox(bone3, 10, 5, 27.6278F, -33.1633F, -4.0F, 2, 1, 10, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 19, 14, 28.6278F, -33.1633F, -5.0F, 1, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 19, 14, 30.042F, -31.7491F, -5.0F, 1, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 11, 8, 30.042F, -31.7491F, -4.0F, 1, 2, 10, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 19, 14, 30.042F, -31.7491F, 5.95F, 1, 2, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 19, 14, 27.6278F, -33.1633F, 5.95F, 2, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 19, 14, 30.042F, -31.7491F, 13.95F, 1, 2, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 19, 14, 27.6278F, -33.1633F, 13.95F, 2, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 19, 14, 30.042F, -31.7491F, 17.95F, 1, 2, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 19, 14, 27.6278F, -33.1633F, 17.95F, 2, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 19, 14, 19.8472F, -21.5591F, 17.95F, 2, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 19, 14, 18.4354F, -23.9709F, 17.95F, 1, 2, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 69, 76, 30.042F, -31.7491F, 18.95F, 1, 2, 2, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 69, 76, 27.6278F, -33.1633F, 18.95F, 2, 1, 2, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 68, 76, 18.4354F, -23.9709F, 18.95F, 1, 2, 2, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 68, 76, 19.8472F, -21.5591F, 18.95F, 2, 1, 2, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 17, 12, 30.042F, -31.7491F, 14.95F, 1, 1, 3, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 17, 12, 28.6278F, -33.1633F, 14.95F, 1, 1, 3, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 19, 14, 28.2136F, -33.1633F, -5.0F, 1, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 19, 14, 30.042F, -31.3349F, -5.0F, 1, 1, 1, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-3.5F, -31.0F, 18.5F);
		stock.addChild(bone5);
		setRotationAngle(bone5, -0.3491F, 0.0F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 19, 14, -0.4108F, -2.8904F, -3.7125F, 2, 3, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 19, 14, 2.4142F, -2.8904F, -3.7125F, 2, 3, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 19, 14, 2.4142F, -5.6265F, 3.8051F, 2, 4, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 19, 14, -0.4108F, -5.6265F, 3.8051F, 2, 4, 1, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-3.225F, -29.4F, 23.5F);
		stock.addChild(bone6);
		setRotationAngle(bone6, 0.2618F, 0.0F, 0.0F);
		bone6.cubeList.add(new ModelBox(bone6, 30, 43, -1.0F, -2.0F, 0.0F, 4, 4, 1, -0.3F, false));
		bone6.cubeList.add(new ModelBox(bone6, 19, 3, 1.225F, -1.0133F, -0.6115F, 1, 6, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 18, 13, 1.225F, 4.5867F, 0.5885F, 1, 4, 2, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 19, 1, 0.325F, -1.4133F, -1.0115F, 2, 10, 1, -0.4F, false));
		bone6.cubeList.add(new ModelBox(bone6, 19, 0, 1.125F, -1.4133F, -1.0115F, 2, 10, 1, -0.4F, false));
		bone6.cubeList.add(new ModelBox(bone6, 19, 14, 1.45F, -2.0F, 0.0F, 3, 4, 1, -0.3F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		stock.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}