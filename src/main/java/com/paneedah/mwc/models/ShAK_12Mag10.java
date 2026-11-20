package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ShAK_12Mag10 extends ModelBase {
	private final ModelRenderer shak_mag10;
	private final ModelRenderer cube_r107;
	private final ModelRenderer cube_r109_r1;
	private final ModelRenderer cube_r108_r1;
	private final ModelRenderer cube_r108;
	private final ModelRenderer cube_r109;
	private final ModelRenderer cube_r110;
	private final ModelRenderer cube_r112_r1;
	private final ModelRenderer cube_r111_r1;
	private final ModelRenderer bone34;
	private final ModelRenderer cube_r111;
	private final ModelRenderer cube_r114_r1;
	private final ModelRenderer cube_r113_r1;
	private final ModelRenderer cube_r112;
	private final ModelRenderer cube_r113;
	private final ModelRenderer cube_r114;
	private final ModelRenderer cube_r115;

	public ShAK_12Mag10() {
		textureWidth = 512;
		textureHeight = 512;

		shak_mag10 = new ModelRenderer(this);
		shak_mag10.setRotationPoint(-1.5F, -9.8F, 9.2F);
		setRotationAngle(shak_mag10, 0.0873F, 0.0F, 0.0F);
		

		cube_r107 = new ModelRenderer(this);
		cube_r107.setRotationPoint(0.25F, 5.8389F, 8.4141F);
		shak_mag10.addChild(cube_r107);
		setRotationAngle(cube_r107, -0.1047F, 0.0F, 0.0F);
		cube_r107.cubeList.add(new ModelBox(cube_r107, 48, 192, -0.5F, -5.0F, -8.4F, 2, 5, 9, -0.001F, false));
		cube_r107.cubeList.add(new ModelBox(cube_r107, 190, 18, -2.0F, -5.0F, -8.4F, 2, 5, 9, 0.0F, false));

		cube_r109_r1 = new ModelRenderer(this);
		cube_r109_r1.setRotationPoint(-0.25F, 5.8308F, -7.246F);
		cube_r107.addChild(cube_r109_r1);
		setRotationAngle(cube_r109_r1, -0.1745F, 0.0F, 0.0F);
		cube_r109_r1.cubeList.add(new ModelBox(cube_r109_r1, 120, 167, -0.25F, -7.1047F, -2.2857F, 2, 7, 9, -0.001F, false));
		cube_r109_r1.cubeList.add(new ModelBox(cube_r109_r1, 26, 145, -1.75F, -7.1047F, -2.2857F, 2, 7, 9, 0.0F, false));

		cube_r108_r1 = new ModelRenderer(this);
		cube_r108_r1.setRotationPoint(0.025F, 10.0523F, -8.7339F);
		cube_r107.addChild(cube_r108_r1);
		setRotationAngle(cube_r108_r1, -0.3054F, 0.0F, 0.0F);
		cube_r108_r1.cubeList.add(new ModelBox(cube_r108_r1, 87, 62, -2.025F, -5.4537F, -2.2072F, 2, 7, 9, 0.0F, false));
		cube_r108_r1.cubeList.add(new ModelBox(cube_r108_r1, 0, 87, -0.525F, -5.4537F, -2.2072F, 2, 7, 9, -0.001F, false));

		cube_r108 = new ModelRenderer(this);
		cube_r108.setRotationPoint(-1.75F, 0.3389F, 3.5141F);
		shak_mag10.addChild(cube_r108);
		setRotationAngle(cube_r108, -0.0908F, 0.0523F, 0.5212F);
		cube_r108.cubeList.add(new ModelBox(cube_r108, 120, 28, 0.0F, -1.0F, 0.0F, 1, 1, 6, 0.0F, false));

		cube_r109 = new ModelRenderer(this);
		cube_r109.setRotationPoint(1.75F, 0.3389F, 3.5141F);
		shak_mag10.addChild(cube_r109);
		setRotationAngle(cube_r109, -0.0908F, -0.0523F, -0.5212F);
		cube_r109.cubeList.add(new ModelBox(cube_r109, 120, 21, -1.0F, -1.0F, 0.0F, 1, 1, 6, 0.0F, false));

		cube_r110 = new ModelRenderer(this);
		cube_r110.setRotationPoint(1.5F, 6.0389F, 8.3141F);
		shak_mag10.addChild(cube_r110);
		setRotationAngle(cube_r110, -0.1047F, 0.0F, 0.0F);
		cube_r110.cubeList.add(new ModelBox(cube_r110, 51, 45, -2.5F, -5.0F, -8.75F, 2, 5, 1, 0.2F, false));

		cube_r112_r1 = new ModelRenderer(this);
		cube_r112_r1.setRotationPoint(-1.5F, 5.6215F, -7.1674F);
		cube_r110.addChild(cube_r112_r1);
		setRotationAngle(cube_r112_r1, -0.1745F, 0.0F, 0.0F);
		cube_r112_r1.cubeList.add(new ModelBox(cube_r112_r1, 26, 76, -1.0F, -6.8953F, -2.7143F, 2, 7, 1, 0.2F, false));

		cube_r111_r1 = new ModelRenderer(this);
		cube_r111_r1.setRotationPoint(-1.225F, 9.8429F, -8.6553F);
		cube_r110.addChild(cube_r111_r1);
		setRotationAngle(cube_r111_r1, -0.3054F, 0.0F, 0.0F);
		cube_r111_r1.cubeList.add(new ModelBox(cube_r111_r1, 26, 15, -1.275F, -5.2443F, -2.6358F, 2, 7, 1, 0.2F, false));

		bone34 = new ModelRenderer(this);
		bone34.setRotationPoint(-1.2F, 3.5389F, 9.6141F);
		shak_mag10.addChild(bone34);
		setRotationAngle(bone34, 0.0873F, 0.0F, 0.0F);
		

		cube_r111 = new ModelRenderer(this);
		cube_r111.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone34.addChild(cube_r111);
		setRotationAngle(cube_r111, -0.192F, 0.0F, 0.0F);
		

		cube_r114_r1 = new ModelRenderer(this);
		cube_r114_r1.setRotationPoint(1.475F, 12.4651F, -9.6869F);
		cube_r111.addChild(cube_r114_r1);
		setRotationAngle(cube_r114_r1, -0.2182F, 0.0F, 0.0F);
		cube_r114_r1.cubeList.add(new ModelBox(cube_r114_r1, 85, 14, -2.275F, -10.9265F, -1.9942F, 3, 1, 9, -0.1F, false));
		cube_r114_r1.cubeList.add(new ModelBox(cube_r114_r1, 140, 197, 0.725F, -10.9265F, -1.9942F, 1, 1, 9, -0.101F, false));

		cube_r113_r1 = new ModelRenderer(this);
		cube_r113_r1.setRotationPoint(1.475F, 12.4651F, -9.6869F);
		cube_r111.addChild(cube_r113_r1);
		setRotationAngle(cube_r113_r1, -0.3054F, 0.0F, 0.0F);
		cube_r113_r1.cubeList.add(new ModelBox(cube_r113_r1, 203, 173, 0.725F, -4.8265F, -2.1942F, 1, 1, 9, -0.101F, false));
		cube_r113_r1.cubeList.add(new ModelBox(cube_r113_r1, 135, 109, -2.275F, -4.8265F, -2.1942F, 3, 1, 9, -0.1F, false));
		cube_r113_r1.cubeList.add(new ModelBox(cube_r113_r1, 150, 108, -2.075F, 1.3735F, -2.1942F, 3, 1, 9, 0.3F, false));
		cube_r113_r1.cubeList.add(new ModelBox(cube_r113_r1, 147, 125, -1.525F, 1.3735F, -2.7942F, 1, 1, 1, 0.3F, false));
		cube_r113_r1.cubeList.add(new ModelBox(cube_r113_r1, 147, 123, -0.025F, 1.3735F, -2.7942F, 1, 1, 1, 0.299F, false));
		cube_r113_r1.cubeList.add(new ModelBox(cube_r113_r1, 203, 184, 0.525F, 1.3735F, -2.1942F, 1, 1, 9, 0.299F, false));

		cube_r112 = new ModelRenderer(this);
		cube_r112.setRotationPoint(3.3F, 9.24F, -9.74F);
		bone34.addChild(cube_r112);
		setRotationAngle(cube_r112, -0.0535F, 0.1845F, 1.2866F);
		

		cube_r113 = new ModelRenderer(this);
		cube_r113.setRotationPoint(2.75F, 8.74F, -12.14F);
		bone34.addChild(cube_r113);
		setRotationAngle(cube_r113, -0.0535F, 0.1845F, 1.2866F);
		

		cube_r114 = new ModelRenderer(this);
		cube_r114.setRotationPoint(-0.35F, 8.74F, -12.14F);
		bone34.addChild(cube_r114);
		setRotationAngle(cube_r114, -0.0535F, -0.1845F, -1.2866F);
		

		cube_r115 = new ModelRenderer(this);
		cube_r115.setRotationPoint(-0.9F, 9.24F, -9.74F);
		bone34.addChild(cube_r115);
		setRotationAngle(cube_r115, -0.0535F, -0.1845F, -1.2866F);
		
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		shak_mag10.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}