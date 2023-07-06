package com.paneedah.mwc.models;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class grozaMag extends ModelBase {
	private final ModelRenderer mag;
	private final ModelRenderer bone17;
	private final ModelRenderer bone18;
	private final ModelRenderer bone19;
	private final ModelRenderer bone20;

	public grozaMag() {
		textureWidth = 512;
		textureHeight = 256;

		mag = new ModelRenderer(this);
		mag.setRotationPoint(0.0F, 23.7F, 43.1F);
		mag.cubeList.add(new ModelBox(mag, 401, 230, -1.0F, -29.3F, -23.7F, 2, 2, 4, -0.3F, false));
		mag.cubeList.add(new ModelBox(mag, 401, 230, -1.0F, -27.05F, -24.2F, 2, 2, 4, -0.3F, false));
		mag.cubeList.add(new ModelBox(mag, 143, 16, -1.0F, -24.8F, -24.7F, 2, 2, 4, -0.3F, false));
		mag.cubeList.add(new ModelBox(mag, 125, 23, -1.0F, -22.55F, -25.2F, 2, 2, 4, -0.3F, false));
		mag.cubeList.add(new ModelBox(mag, 163, 18, -1.0F, -20.3F, -25.7F, 2, 2, 4, -0.3F, false));
		mag.cubeList.add(new ModelBox(mag, 112, 5, -1.0F, -18.05F, -26.2F, 2, 2, 4, -0.3F, false));
		mag.cubeList.add(new ModelBox(mag, 154, 7, -1.0F, -15.8F, -26.95F, 2, 2, 4, -0.3F, false));
		mag.cubeList.add(new ModelBox(mag, 143, 16, -4.0F, -15.8F, -26.95F, 2, 2, 4, -0.3F, false));
		mag.cubeList.add(new ModelBox(mag, 143, 16, -4.0F, -18.05F, -26.2F, 2, 2, 4, -0.3F, false));
		mag.cubeList.add(new ModelBox(mag, 143, 16, -4.0F, -20.3F, -25.7F, 2, 2, 4, -0.3F, false));
		mag.cubeList.add(new ModelBox(mag, 143, 16, -4.0F, -22.55F, -25.2F, 2, 2, 4, -0.3F, false));
		mag.cubeList.add(new ModelBox(mag, 143, 16, -4.0F, -24.8F, -24.7F, 2, 2, 4, -0.3F, false));
		mag.cubeList.add(new ModelBox(mag, 401, 230, -4.0F, -27.05F, -24.2F, 2, 2, 4, -0.3F, false));
		mag.cubeList.add(new ModelBox(mag, 401, 230, -4.0F, -29.3F, -23.7F, 2, 2, 4, -0.3F, false));

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(-1.5F, -28.6927F, -23.9674F);
		mag.addChild(bone17);
		setRotationAngle(bone17, -0.1745F, 0.0F, 0.0F);
		bone17.cubeList.add(new ModelBox(bone17, 135, 20, -1.5F, -2.6593F, -2.7842F, 3, 9, 3, -0.001F, false));
		bone17.cubeList.add(new ModelBox(bone17, 134, 9, -2.0F, -2.6593F, -0.5342F, 4, 9, 6, 0.0F, false));

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(-1.5F, -28.6927F, -23.9674F);
		mag.addChild(bone18);
		setRotationAngle(bone18, -0.3054F, 0.0F, 0.0F);
		bone18.cubeList.add(new ModelBox(bone18, 125, 20, -1.499F, 5.574F, -2.0043F, 3, 9, 3, 0.001F, false));
		bone18.cubeList.add(new ModelBox(bone18, 139, 15, -1.999F, 5.574F, 0.2457F, 4, 9, 6, 0.001F, false));
		bone18.cubeList.add(new ModelBox(bone18, 147, 13, -2.0F, 14.3873F, -1.698F, 4, 1, 8, 0.0F, false));

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(-3.1883F, -23.3512F, -24.1008F);
		mag.addChild(bone19);
		setRotationAngle(bone19, -0.4363F, 0.0F, 0.0F);
		

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(-3.1883F, -17.745F, -25.2985F);
		mag.addChild(bone20);
		setRotationAngle(bone20, -0.6545F, 0.0F, 0.0F);
		
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