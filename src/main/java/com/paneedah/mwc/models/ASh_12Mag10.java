package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ASh_12Mag10 extends ModelBase {
	private final ModelRenderer ash_mag10;
	private final ModelRenderer cube_r66;
	private final ModelRenderer cube_r110_r1;
	private final ModelRenderer cube_r109_r1;
	private final ModelRenderer cube_r67;
	private final ModelRenderer cube_r68;
	private final ModelRenderer cube_r69;
	private final ModelRenderer cube_r113_r1;
	private final ModelRenderer cube_r112_r1;
	private final ModelRenderer bone44;
	private final ModelRenderer cube_r70;
	private final ModelRenderer cube_r116_r1;
	private final ModelRenderer cube_r115_r1;
	private final ModelRenderer cube_r71;
	private final ModelRenderer cube_r72;
	private final ModelRenderer cube_r73;
	private final ModelRenderer cube_r74;

	public ASh_12Mag10() {
		textureWidth = 512;
		textureHeight = 512;

		ash_mag10 = new ModelRenderer(this);
		ash_mag10.setRotationPoint(-1.5F, -9.8F, 9.2F);
		setRotationAngle(ash_mag10, 0.0873F, 0.0F, 0.0F);
		

		cube_r66 = new ModelRenderer(this);
		cube_r66.setRotationPoint(0.25F, 5.8389F, 8.4141F);
		ash_mag10.addChild(cube_r66);
		setRotationAngle(cube_r66, -0.1047F, 0.0F, 0.0F);
		cube_r66.cubeList.add(new ModelBox(cube_r66, 188, 46, -0.5F, -5.0F, -8.4F, 2, 5, 9, -0.001F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 184, 91, -2.0F, -5.0F, -8.4F, 2, 5, 9, 0.0F, false));

		cube_r110_r1 = new ModelRenderer(this);
		cube_r110_r1.setRotationPoint(-0.25F, 5.8308F, -7.246F);
		cube_r66.addChild(cube_r110_r1);
		setRotationAngle(cube_r110_r1, -0.1745F, 0.0F, 0.0F);
		cube_r110_r1.cubeList.add(new ModelBox(cube_r110_r1, 79, 121, -0.25F, -7.1047F, -2.2857F, 2, 7, 9, -0.001F, false));
		cube_r110_r1.cubeList.add(new ModelBox(cube_r110_r1, 128, 121, -1.75F, -7.1047F, -2.2857F, 2, 7, 9, 0.0F, false));

		cube_r109_r1 = new ModelRenderer(this);
		cube_r109_r1.setRotationPoint(0.025F, 10.0523F, -8.7339F);
		cube_r66.addChild(cube_r109_r1);
		setRotationAngle(cube_r109_r1, -0.3054F, 0.0F, 0.0F);
		cube_r109_r1.cubeList.add(new ModelBox(cube_r109_r1, 140, 62, -2.025F, -5.4537F, -2.2072F, 2, 7, 9, 0.0F, false));
		cube_r109_r1.cubeList.add(new ModelBox(cube_r109_r1, 141, 21, -0.525F, -5.4537F, -2.2072F, 2, 7, 9, -0.001F, false));

		cube_r67 = new ModelRenderer(this);
		cube_r67.setRotationPoint(-1.75F, 0.3389F, 3.5141F);
		ash_mag10.addChild(cube_r67);
		setRotationAngle(cube_r67, -0.0908F, 0.0523F, 0.5212F);
		cube_r67.cubeList.add(new ModelBox(cube_r67, 120, 46, 0.0F, -1.0F, 0.0F, 1, 1, 6, 0.0F, false));

		cube_r68 = new ModelRenderer(this);
		cube_r68.setRotationPoint(1.75F, 0.3389F, 3.5141F);
		ash_mag10.addChild(cube_r68);
		setRotationAngle(cube_r68, -0.0908F, -0.0523F, -0.5212F);
		cube_r68.cubeList.add(new ModelBox(cube_r68, 39, 120, -1.0F, -1.0F, 0.0F, 1, 1, 6, 0.0F, false));

		cube_r69 = new ModelRenderer(this);
		cube_r69.setRotationPoint(1.5F, 6.0389F, 8.3141F);
		ash_mag10.addChild(cube_r69);
		setRotationAngle(cube_r69, -0.1047F, 0.0F, 0.0F);
		cube_r69.cubeList.add(new ModelBox(cube_r69, 28, 45, -2.5F, -5.0F, -8.75F, 2, 5, 1, 0.2F, false));

		cube_r113_r1 = new ModelRenderer(this);
		cube_r113_r1.setRotationPoint(-1.5F, 5.6215F, -7.1674F);
		cube_r69.addChild(cube_r113_r1);
		setRotationAngle(cube_r113_r1, -0.1745F, 0.0F, 0.0F);
		cube_r113_r1.cubeList.add(new ModelBox(cube_r113_r1, 59, 0, -1.0F, -6.8953F, -2.7143F, 2, 7, 1, 0.2F, false));

		cube_r112_r1 = new ModelRenderer(this);
		cube_r112_r1.setRotationPoint(-1.225F, 9.8429F, -8.6553F);
		cube_r69.addChild(cube_r112_r1);
		setRotationAngle(cube_r112_r1, -0.3054F, 0.0F, 0.0F);
		cube_r112_r1.cubeList.add(new ModelBox(cube_r112_r1, 59, 29, -1.275F, -5.2443F, -2.6358F, 2, 7, 1, 0.2F, false));

		bone44 = new ModelRenderer(this);
		bone44.setRotationPoint(-1.2F, 3.5389F, 9.6141F);
		ash_mag10.addChild(bone44);
		setRotationAngle(bone44, 0.0873F, 0.0F, 0.0F);
		

		cube_r70 = new ModelRenderer(this);
		cube_r70.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone44.addChild(cube_r70);
		setRotationAngle(cube_r70, -0.192F, 0.0F, 0.0F);
		

		cube_r116_r1 = new ModelRenderer(this);
		cube_r116_r1.setRotationPoint(1.475F, 12.4651F, -9.6869F);
		cube_r70.addChild(cube_r116_r1);
		setRotationAngle(cube_r116_r1, -0.2182F, 0.0F, 0.0F);
		cube_r116_r1.cubeList.add(new ModelBox(cube_r116_r1, 120, 21, 0.725F, -10.9265F, 5.0058F, 1, 1, 2, -0.101F, false));
		cube_r116_r1.cubeList.add(new ModelBox(cube_r116_r1, 120, 99, -2.275F, -10.9265F, 5.0058F, 3, 1, 2, -0.1F, false));
		cube_r116_r1.cubeList.add(new ModelBox(cube_r116_r1, 67, 121, -2.275F, -10.9265F, -1.9942F, 3, 1, 2, -0.1F, false));
		cube_r116_r1.cubeList.add(new ModelBox(cube_r116_r1, 120, 24, 0.725F, -10.9265F, -1.9942F, 1, 1, 2, -0.101F, false));

		cube_r115_r1 = new ModelRenderer(this);
		cube_r115_r1.setRotationPoint(1.475F, 12.4651F, -9.6869F);
		cube_r70.addChild(cube_r115_r1);
		setRotationAngle(cube_r115_r1, -0.3054F, 0.0F, 0.0F);
		cube_r115_r1.cubeList.add(new ModelBox(cube_r115_r1, 120, 15, 0.725F, -4.8265F, 4.8058F, 1, 1, 2, -0.101F, false));
		cube_r115_r1.cubeList.add(new ModelBox(cube_r115_r1, 117, 0, -2.275F, -4.8265F, 4.8058F, 3, 1, 2, -0.1F, false));
		cube_r115_r1.cubeList.add(new ModelBox(cube_r115_r1, 120, 28, 0.725F, -4.8265F, -2.1942F, 1, 1, 2, -0.101F, false));
		cube_r115_r1.cubeList.add(new ModelBox(cube_r115_r1, 92, 121, -2.275F, -4.8265F, -2.1942F, 3, 1, 2, -0.1F, false));
		cube_r115_r1.cubeList.add(new ModelBox(cube_r115_r1, 26, 101, -2.075F, 1.3735F, -2.1942F, 3, 1, 9, 0.3F, false));
		cube_r115_r1.cubeList.add(new ModelBox(cube_r115_r1, 119, 147, -1.525F, 1.3735F, -2.7942F, 1, 1, 1, 0.3F, false));
		cube_r115_r1.cubeList.add(new ModelBox(cube_r115_r1, 147, 121, -0.025F, 1.3735F, -2.7942F, 1, 1, 1, 0.299F, false));
		cube_r115_r1.cubeList.add(new ModelBox(cube_r115_r1, 203, 153, 0.525F, 1.3735F, -2.1942F, 1, 1, 9, 0.299F, false));

		cube_r71 = new ModelRenderer(this);
		cube_r71.setRotationPoint(3.3F, 9.24F, -9.74F);
		bone44.addChild(cube_r71);
		setRotationAngle(cube_r71, -0.0535F, 0.1845F, 1.2866F);
		

		cube_r72 = new ModelRenderer(this);
		cube_r72.setRotationPoint(2.75F, 8.74F, -12.14F);
		bone44.addChild(cube_r72);
		setRotationAngle(cube_r72, -0.0535F, 0.1845F, 1.2866F);
		

		cube_r73 = new ModelRenderer(this);
		cube_r73.setRotationPoint(-0.35F, 8.74F, -12.14F);
		bone44.addChild(cube_r73);
		setRotationAngle(cube_r73, -0.0535F, -0.1845F, -1.2866F);
		

		cube_r74 = new ModelRenderer(this);
		cube_r74.setRotationPoint(-0.9F, 9.24F, -9.74F);
		bone44.addChild(cube_r74);
		setRotationAngle(cube_r74, -0.0535F, -0.1845F, -1.2866F);
		
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ash_mag10.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}