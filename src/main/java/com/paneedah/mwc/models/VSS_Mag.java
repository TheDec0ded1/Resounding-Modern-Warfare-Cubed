package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class VSS_Mag extends ModelBase {
	private final ModelRenderer vss_mag;
	private final ModelRenderer cube_r107;
	private final ModelRenderer cube_r108;
	private final ModelRenderer cube_r109;
	private final ModelRenderer cube_r110;
	private final ModelRenderer bone34;
	private final ModelRenderer cube_r111;
	private final ModelRenderer cube_r112;
	private final ModelRenderer cube_r113;
	private final ModelRenderer cube_r114;
	private final ModelRenderer cube_r115;

	public VSS_Mag() {
		textureWidth = 256;
		textureHeight = 256;

		vss_mag = new ModelRenderer(this);
		vss_mag.setRotationPoint(-1.8F, -9.0F, -25.0F);
		

		cube_r107 = new ModelRenderer(this);
		cube_r107.setRotationPoint(0.55F, 5.7F, 7.5F);
		vss_mag.addChild(cube_r107);
		setRotationAngle(cube_r107, -0.1047F, 0.0F, 0.0F);
		cube_r107.cubeList.add(new ModelBox(cube_r107, 42, 154, -2.15F, 2.1F, -5.4F, 1, 1, 5, -0.103F, false));
		cube_r107.cubeList.add(new ModelBox(cube_r107, 135, 25, -2.15F, -0.4F, -0.65F, 1, 5, 1, -0.002F, false));
		cube_r107.cubeList.add(new ModelBox(cube_r107, 154, 8, -2.15F, -0.5F, -5.4F, 1, 1, 5, -0.103F, false));
		cube_r107.cubeList.add(new ModelBox(cube_r107, 156, 132, -2.15F, 3.4F, -6.65F, 1, 1, 4, -0.103F, false));
		cube_r107.cubeList.add(new ModelBox(cube_r107, 164, 72, -2.05F, 3.4F, -7.9F, 1, 1, 2, -0.3F, false));
		cube_r107.cubeList.add(new ModelBox(cube_r107, 70, 164, -2.05F, 0.8F, -7.9F, 1, 1, 2, -0.3F, false));
		cube_r107.cubeList.add(new ModelBox(cube_r107, 129, 156, -2.15F, 0.8F, -6.65F, 1, 1, 4, -0.103F, false));
		cube_r107.cubeList.add(new ModelBox(cube_r107, 82, 156, 0.65F, 3.4F, -6.65F, 1, 1, 4, -0.103F, false));
		cube_r107.cubeList.add(new ModelBox(cube_r107, 148, 153, 0.65F, 2.1F, -5.4F, 1, 1, 5, -0.103F, false));
		cube_r107.cubeList.add(new ModelBox(cube_r107, 164, 62, 0.55F, 3.4F, -7.9F, 1, 1, 2, -0.3F, false));
		cube_r107.cubeList.add(new ModelBox(cube_r107, 52, 164, 0.55F, 0.8F, -7.9F, 1, 1, 2, -0.3F, false));
		cube_r107.cubeList.add(new ModelBox(cube_r107, 156, 0, 0.65F, 0.8F, -6.65F, 1, 1, 4, -0.103F, false));
		cube_r107.cubeList.add(new ModelBox(cube_r107, 153, 125, 0.65F, -0.5F, -5.4F, 1, 1, 5, -0.103F, false));
		cube_r107.cubeList.add(new ModelBox(cube_r107, 135, 12, 0.65F, -0.4F, -0.65F, 1, 5, 1, -0.002F, false));
		cube_r107.cubeList.add(new ModelBox(cube_r107, 35, 112, -0.5F, -5.0F, -6.4F, 2, 12, 7, -0.001F, false));
		cube_r107.cubeList.add(new ModelBox(cube_r107, 110, 109, -2.0F, -5.0F, -6.4F, 2, 12, 7, 0.0F, false));

		cube_r108 = new ModelRenderer(this);
		cube_r108.setRotationPoint(-1.45F, 0.2F, 2.6F);
		vss_mag.addChild(cube_r108);
		setRotationAngle(cube_r108, -0.0908F, 0.0523F, 0.5212F);
		cube_r108.cubeList.add(new ModelBox(cube_r108, 149, 40, 0.0F, -1.0F, 0.0F, 1, 1, 6, 0.0F, false));

		cube_r109 = new ModelRenderer(this);
		cube_r109.setRotationPoint(2.05F, 0.2F, 2.6F);
		vss_mag.addChild(cube_r109);
		setRotationAngle(cube_r109, -0.0908F, -0.0523F, -0.5212F);
		cube_r109.cubeList.add(new ModelBox(cube_r109, 11, 149, -1.0F, -1.0F, 0.0F, 1, 1, 6, 0.0F, false));

		cube_r110 = new ModelRenderer(this);
		cube_r110.setRotationPoint(1.8F, 5.9F, 7.4F);
		vss_mag.addChild(cube_r110);
		setRotationAngle(cube_r110, -0.1047F, 0.0F, 0.0F);
		cube_r110.cubeList.add(new ModelBox(cube_r110, 0, 19, -2.5F, -5.0051F, -7.745F, 2, 11, 3, 0.2F, false));

		bone34 = new ModelRenderer(this);
		bone34.setRotationPoint(-0.9F, 3.4F, 8.7F);
		vss_mag.addChild(bone34);
		setRotationAngle(bone34, 0.0873F, 0.0F, 0.0F);
		

		cube_r111 = new ModelRenderer(this);
		cube_r111.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone34.addChild(cube_r111);
		setRotationAngle(cube_r111, -0.192F, 0.0F, 0.0F);
		cube_r111.cubeList.add(new ModelBox(cube_r111, 29, 141, 2.0F, 8.9212F, -7.282F, 1, 1, 7, 0.299F, false));
		cube_r111.cubeList.add(new ModelBox(cube_r111, 161, 124, 1.45F, 8.9162F, -8.877F, 1, 1, 3, 0.299F, false));
		cube_r111.cubeList.add(new ModelBox(cube_r111, 161, 103, -0.05F, 8.9162F, -8.877F, 1, 1, 3, 0.3F, false));
		cube_r111.cubeList.add(new ModelBox(cube_r111, 75, 87, -0.6F, 8.9212F, -7.282F, 3, 1, 7, 0.3F, false));

		cube_r112 = new ModelRenderer(this);
		cube_r112.setRotationPoint(3.3F, 9.24F, -9.74F);
		bone34.addChild(cube_r112);
		setRotationAngle(cube_r112, -0.0535F, 0.1845F, 1.2866F);
		cube_r112.cubeList.add(new ModelBox(cube_r112, 30, 98, -3.5289F, -0.3091F, 6.218F, 1, 1, 1, 0.299F, false));
		cube_r112.cubeList.add(new ModelBox(cube_r112, 61, 144, -4.5289F, -0.3091F, 0.818F, 2, 1, 6, 0.3F, false));

		cube_r113 = new ModelRenderer(this);
		cube_r113.setRotationPoint(2.75F, 8.74F, -12.14F);
		bone34.addChild(cube_r113);
		setRotationAngle(cube_r113, -0.0535F, 0.1845F, 1.2866F);
		cube_r113.cubeList.add(new ModelBox(cube_r113, 0, 143, -4.4838F, -0.3105F, 1.6729F, 2, 1, 6, 0.3F, false));

		cube_r114 = new ModelRenderer(this);
		cube_r114.setRotationPoint(-0.35F, 8.74F, -12.14F);
		bone34.addChild(cube_r114);
		setRotationAngle(cube_r114, -0.0535F, -0.1845F, -1.2866F);
		cube_r114.cubeList.add(new ModelBox(cube_r114, 143, 143, 2.4838F, -0.3105F, 1.6729F, 2, 1, 6, 0.3F, false));

		cube_r115 = new ModelRenderer(this);
		cube_r115.setRotationPoint(-0.9F, 9.24F, -9.74F);
		bone34.addChild(cube_r115);
		setRotationAngle(cube_r115, -0.0535F, -0.1845F, -1.2866F);
		cube_r115.cubeList.add(new ModelBox(cube_r115, 39, 98, 2.5289F, -0.3091F, 6.218F, 1, 1, 1, 0.299F, false));
		cube_r115.cubeList.add(new ModelBox(cube_r115, 144, 96, 2.5289F, -0.3091F, 0.818F, 2, 1, 6, 0.3F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		vss_mag.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}