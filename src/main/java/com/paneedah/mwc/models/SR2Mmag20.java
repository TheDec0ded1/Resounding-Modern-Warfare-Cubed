package com.paneedah.mwc.models;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SR2Mmag20 extends ModelBase {
	private final ModelRenderer mag_20;
	private final ModelRenderer cube_r87;
	private final ModelRenderer cube_r88;
	private final ModelRenderer cube_r89;
	private final ModelRenderer cube_r90;
	private final ModelRenderer cube_r91;
	private final ModelRenderer cube_r92;
	private final ModelRenderer cube_r93;
	private final ModelRenderer cube_r94;

	public SR2Mmag20() {
		textureWidth = 256;
		textureHeight = 256;

		mag_20 = new ModelRenderer(this);
		mag_20.setRotationPoint(0.2F, 7.8F, -3.2F);
		mag_20.cubeList.add(new ModelBox(mag_20, 113, 182, -1.0F, -1.0F, 0.3F, 1, 1, 4, 0.0F, false));
		mag_20.cubeList.add(new ModelBox(mag_20, 115, 182, -2.45F, -0.999F, 0.85F, 2, 1, 4, 0.0F, false));
		mag_20.cubeList.add(new ModelBox(mag_20, 117, 186, -2.65F, -0.998F, -0.4F, 2, 1, 2, 0.0F, false));
		mag_20.cubeList.add(new ModelBox(mag_20, 1, 176, -2.7F, -13.799F, 1.55F, 2, 13, 3, 0.0F, false));
		mag_20.cubeList.add(new ModelBox(mag_20, 118, 179, -2.2F, -13.999F, 3.75F, 1, 13, 1, 0.0F, false));
		mag_20.cubeList.add(new ModelBox(mag_20, 119, 186, -1.5F, -14.599F, 1.75F, 1, 1, 3, -0.2F, false));
		mag_20.cubeList.add(new ModelBox(mag_20, 117, 182, -2.9F, -14.599F, 1.75F, 1, 1, 3, -0.2F, false));
		mag_20.cubeList.add(new ModelBox(mag_20, 3, 177, -2.7F, -13.799F, -0.05F, 2, 13, 1, 0.0F, false));
		mag_20.cubeList.add(new ModelBox(mag_20, 2, 184, -2.7F, -13.799F, 0.75F, 2, 1, 1, -0.001F, false));
		mag_20.cubeList.add(new ModelBox(mag_20, 51, 20, -1.8F, -12.799F, 0.75F, 1, 12, 1, -0.001F, false));
		mag_20.cubeList.add(new ModelBox(mag_20, 2, 180, -2.6F, -12.799F, 0.75F, 1, 12, 1, -0.001F, false));
		mag_20.cubeList.add(new ModelBox(mag_20, 115, 186, -2.95F, -0.997F, 0.85F, 1, 1, 4, 0.001F, false));
		mag_20.cubeList.add(new ModelBox(mag_20, 65, 20, -2.75F, -0.998F, -0.4F, 1, 1, 2, 0.001F, false));
		mag_20.cubeList.add(new ModelBox(mag_20, 116, 183, -3.4F, -1.0F, 0.3F, 1, 1, 4, 0.0F, false));

		cube_r87 = new ModelRenderer(this);
		cube_r87.setRotationPoint(-7.3F, -7.199F, 4.55F);
		mag_20.addChild(cube_r87);
		setRotationAngle(cube_r87, 0.0F, 0.0F, 0.9599F);
		cube_r87.cubeList.add(new ModelBox(cube_r87, 118, 182, -3.4765F, -8.6944F, -2.8F, 1, 1, 3, -0.201F, false));

		cube_r88 = new ModelRenderer(this);
		cube_r88.setRotationPoint(3.9F, -7.199F, 4.55F);
		mag_20.addChild(cube_r88);
		setRotationAngle(cube_r88, 0.0F, 0.0F, -0.9599F);
		cube_r88.cubeList.add(new ModelBox(cube_r88, 115, 185, 2.4765F, -8.6944F, -2.8F, 1, 1, 3, -0.201F, false));

		cube_r89 = new ModelRenderer(this);
		cube_r89.setRotationPoint(-1.2F, -4.999F, 4.75F);
		mag_20.addChild(cube_r89);
		setRotationAngle(cube_r89, -0.0524F, 0.0F, 0.0F);
		

		cube_r90 = new ModelRenderer(this);
		cube_r90.setRotationPoint(-0.7F, -4.799F, 4.55F);
		mag_20.addChild(cube_r90);
		setRotationAngle(cube_r90, -0.0524F, 0.0F, 0.0F);
		

		cube_r91 = new ModelRenderer(this);
		cube_r91.setRotationPoint(-0.75F, 0.0F, 0.3F);
		mag_20.addChild(cube_r91);
		setRotationAngle(cube_r91, -0.1745F, 0.0F, 0.0F);
		

		cube_r92 = new ModelRenderer(this);
		cube_r92.setRotationPoint(-1.2F, 0.0F, 4.0F);
		mag_20.addChild(cube_r92);
		setRotationAngle(cube_r92, -0.1745F, 0.0F, 0.0F);
		

		cube_r93 = new ModelRenderer(this);
		cube_r93.setRotationPoint(-0.2F, 0.25F, 4.65F);
		mag_20.addChild(cube_r93);
		setRotationAngle(cube_r93, -0.1745F, 0.0F, 0.0F);
		

		cube_r94 = new ModelRenderer(this);
		cube_r94.setRotationPoint(-0.7F, 0.0F, 4.55F);
		mag_20.addChild(cube_r94);
		setRotationAngle(cube_r94, -0.1745F, 0.0F, 0.0F);
		
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		mag_20.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}