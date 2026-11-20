package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SVUSightsUp extends ModelBase {
	private final ModelRenderer IronsRaised;
	private final ModelRenderer bone12_r1;
	private final ModelRenderer bone12_r2;
	private final ModelRenderer cube_r187;
	private final ModelRenderer cube_r188;
	private final ModelRenderer cube_r189;
	private final ModelRenderer cube_r190;
	private final ModelRenderer cube_r191;
	private final ModelRenderer cube_r192;
	private final ModelRenderer cube_r193;
	private final ModelRenderer cube_r194;

	public SVUSightsUp() {
		textureWidth = 350;
		textureHeight = 350;

		IronsRaised = new ModelRenderer(this);
		IronsRaised.setRotationPoint(-6.5F, -61.2F, 3.85F);
		IronsRaised.cubeList.add(new ModelBox(IronsRaised, 59, 122, 4.5F, 41.5F, -56.8F, 1, 2, 1, -0.4F, false));
		IronsRaised.cubeList.add(new ModelBox(IronsRaised, 59, 122, 4.5F, 42.9F, -56.8F, 1, 3, 1, -0.1F, false));
		IronsRaised.cubeList.add(new ModelBox(IronsRaised, 59, 122, 4.5F, 46.7F, -56.8F, 1, 3, 1, 0.2F, false));
		IronsRaised.cubeList.add(new ModelBox(IronsRaised, 25, 77, 4.5F, 45.7F, -56.8F, 1, 2, 1, 0.2F, false));
		IronsRaised.cubeList.add(new ModelBox(IronsRaised, 26, 35, 4.5F, 41.35F, -1.75F, 1, 1, 2, -0.35F, false));
		IronsRaised.cubeList.add(new ModelBox(IronsRaised, 32, 36, 4.2F, 41.35F, -1.75F, 1, 1, 2, -0.35F, false));
		IronsRaised.cubeList.add(new ModelBox(IronsRaised, 28, 37, 4.8F, 41.35F, -1.75F, 1, 1, 2, -0.35F, false));
		IronsRaised.cubeList.add(new ModelBox(IronsRaised, 75, 74, 3.9F, 41.55F, -1.7F, 1, 2, 2, -0.4F, false));
		IronsRaised.cubeList.add(new ModelBox(IronsRaised, 22, 78, 5.1F, 41.55F, -1.7F, 1, 2, 2, -0.4F, false));
		IronsRaised.cubeList.add(new ModelBox(IronsRaised, 23, 78, 4.0F, 42.7F, -1.8F, 2, 1, 2, -0.3F, false));
		IronsRaised.cubeList.add(new ModelBox(IronsRaised, 22, 78, 5.4441F, 41.6335F, -57.2F, 1, 1, 2, -0.4F, false));
		IronsRaised.cubeList.add(new ModelBox(IronsRaised, 22, 78, 3.5559F, 41.6335F, -57.2F, 1, 1, 2, -0.4F, false));
		IronsRaised.cubeList.add(new ModelBox(IronsRaised, 22, 78, 5.4441F, 41.4335F, -57.2F, 1, 1, 2, -0.4F, false));
		IronsRaised.cubeList.add(new ModelBox(IronsRaised, 22, 78, 3.5559F, 41.4335F, -57.2F, 1, 1, 2, -0.4F, false));
		IronsRaised.cubeList.add(new ModelBox(IronsRaised, 22, 78, 5.4441F, 41.2335F, -57.2F, 1, 1, 2, -0.4F, false));
		IronsRaised.cubeList.add(new ModelBox(IronsRaised, 22, 78, 5.1F, 40.742F, -57.2F, 1, 1, 2, -0.4F, false));
		IronsRaised.cubeList.add(new ModelBox(IronsRaised, 22, 78, 3.9F, 40.742F, -57.2F, 1, 1, 2, -0.4F, false));
		IronsRaised.cubeList.add(new ModelBox(IronsRaised, 23, 79, 4.0F, 40.742F, -56.2F, 2, 1, 1, -0.4F, false));
		IronsRaised.cubeList.add(new ModelBox(IronsRaised, 23, 79, 4.0F, 40.742F, -57.2F, 2, 1, 1, -0.4F, false));
		IronsRaised.cubeList.add(new ModelBox(IronsRaised, 22, 78, 3.5559F, 41.2335F, -57.2F, 1, 1, 2, -0.4F, false));
		IronsRaised.cubeList.add(new ModelBox(IronsRaised, 23, 78, 4.0F, 42.3F, -57.3F, 2, 1, 2, -0.3F, false));
		IronsRaised.cubeList.add(new ModelBox(IronsRaised, 21, 76, 4.0F, 42.9F, -1.799F, 2, 4, 2, -0.3F, false));

		bone12_r1 = new ModelRenderer(this);
		bone12_r1.setRotationPoint(5.0F, 43.721F, -56.2F);
		IronsRaised.addChild(bone12_r1);
		setRotationAngle(bone12_r1, 0.0F, 0.0F, 0.6109F);
		bone12_r1.cubeList.add(new ModelBox(bone12_r1, 22, 78, -2.4527F, -2.1111F, -1.0F, 1, 1, 2, -0.4F, false));
		bone12_r1.cubeList.add(new ModelBox(bone12_r1, 22, 78, -2.4527F, -1.9111F, -1.0F, 1, 1, 2, -0.4F, false));
		bone12_r1.cubeList.add(new ModelBox(bone12_r1, 22, 78, -2.4527F, -1.7111F, -1.0F, 1, 1, 2, -0.4F, false));
		bone12_r1.cubeList.add(new ModelBox(bone12_r1, 22, 78, -0.5979F, -1.8174F, -1.0F, 1, 1, 2, -0.4F, false));
		bone12_r1.cubeList.add(new ModelBox(bone12_r1, 22, 78, -0.5979F, -2.0174F, -1.0F, 1, 1, 2, -0.4F, false));
		bone12_r1.cubeList.add(new ModelBox(bone12_r1, 22, 78, -0.5979F, -2.2174F, -1.0F, 1, 1, 2, -0.4F, false));

		bone12_r2 = new ModelRenderer(this);
		bone12_r2.setRotationPoint(5.0F, 43.721F, -56.2F);
		IronsRaised.addChild(bone12_r2);
		setRotationAngle(bone12_r2, 0.0F, 0.0F, -0.6109F);
		bone12_r2.cubeList.add(new ModelBox(bone12_r2, 75, 74, 1.4527F, -2.1111F, -1.0F, 1, 1, 2, -0.4F, false));
		bone12_r2.cubeList.add(new ModelBox(bone12_r2, 75, 74, 1.4527F, -1.9111F, -1.0F, 1, 1, 2, -0.4F, false));
		bone12_r2.cubeList.add(new ModelBox(bone12_r2, 75, 74, 1.4527F, -1.7111F, -1.0F, 1, 1, 2, -0.4F, false));
		bone12_r2.cubeList.add(new ModelBox(bone12_r2, 75, 74, -0.4021F, -1.8174F, -1.0F, 1, 1, 2, -0.4F, false));
		bone12_r2.cubeList.add(new ModelBox(bone12_r2, 75, 74, -0.4021F, -2.0174F, -1.0F, 1, 1, 2, -0.4F, false));
		bone12_r2.cubeList.add(new ModelBox(bone12_r2, 75, 74, -0.4021F, -2.2174F, -1.0F, 1, 1, 2, -0.4F, false));

		cube_r187 = new ModelRenderer(this);
		cube_r187.setRotationPoint(0.0F, 0.0F, 0.0F);
		IronsRaised.addChild(cube_r187);
		setRotationAngle(cube_r187, 0.0F, 0.0F, 0.7854F);
		

		cube_r188 = new ModelRenderer(this);
		cube_r188.setRotationPoint(4.8F, -1.2F, 1.1F);
		IronsRaised.addChild(cube_r188);
		setRotationAngle(cube_r188, 0.3316F, 0.0F, 0.0F);
		

		cube_r189 = new ModelRenderer(this);
		cube_r189.setRotationPoint(3.9F, -10.7F, -1.7F);
		IronsRaised.addChild(cube_r189);
		setRotationAngle(cube_r189, 0.0F, 0.0F, 0.7854F);
		cube_r189.cubeList.add(new ModelBox(cube_r189, 21, 77, 37.9717F, 36.9716F, -0.001F, 1, 1, 2, -0.4F, false));
		cube_r189.cubeList.add(new ModelBox(cube_r189, 23, 78, 37.7717F, 36.9716F, -0.001F, 1, 1, 2, -0.4F, false));

		cube_r190 = new ModelRenderer(this);
		cube_r190.setRotationPoint(6.1F, -10.7F, -1.7F);
		IronsRaised.addChild(cube_r190);
		setRotationAngle(cube_r190, 0.0F, 0.0F, -0.7854F);
		cube_r190.cubeList.add(new ModelBox(cube_r190, 25, 78, -38.9717F, 36.9716F, -0.001F, 1, 1, 2, -0.4F, false));
		cube_r190.cubeList.add(new ModelBox(cube_r190, 25, 78, -38.7717F, 36.9716F, -0.001F, 1, 1, 2, -0.4F, false));

		cube_r191 = new ModelRenderer(this);
		cube_r191.setRotationPoint(3.85F, -11.8F, -1.7F);
		IronsRaised.addChild(cube_r191);
		setRotationAngle(cube_r191, 0.0F, 0.0F, -0.7854F);
		cube_r191.cubeList.add(new ModelBox(cube_r191, 21, 77, -38.0417F, 37.9756F, -0.048F, 1, 1, 2, -0.35F, false));
		cube_r191.cubeList.add(new ModelBox(cube_r191, 23, 78, -37.9867F, 37.9766F, -0.049F, 1, 1, 2, -0.35F, false));

		cube_r192 = new ModelRenderer(this);
		cube_r192.setRotationPoint(3.9F, -11.7F, -1.7F);
		IronsRaised.addChild(cube_r192);
		setRotationAngle(cube_r192, 0.0F, 0.0F, -0.7854F);
		cube_r192.cubeList.add(new ModelBox(cube_r192, 25, 76, -38.1717F, 37.9716F, -0.001F, 1, 1, 2, -0.4F, false));
		cube_r192.cubeList.add(new ModelBox(cube_r192, 24, 79, -37.9717F, 37.9716F, -0.001F, 1, 1, 2, -0.4F, false));

		cube_r193 = new ModelRenderer(this);
		cube_r193.setRotationPoint(6.1F, -11.7F, -1.7F);
		IronsRaised.addChild(cube_r193);
		setRotationAngle(cube_r193, 0.0F, 0.0F, 0.7854F);
		cube_r193.cubeList.add(new ModelBox(cube_r193, 134, 97, 36.9717F, 37.9716F, -0.001F, 1, 1, 2, -0.4F, false));
		cube_r193.cubeList.add(new ModelBox(cube_r193, 134, 100, 37.1717F, 37.9716F, -0.001F, 1, 1, 2, -0.4F, false));

		cube_r194 = new ModelRenderer(this);
		cube_r194.setRotationPoint(6.15F, -11.8F, -1.7F);
		IronsRaised.addChild(cube_r194);
		setRotationAngle(cube_r194, 0.0F, 0.0F, 0.7854F);
		cube_r194.cubeList.add(new ModelBox(cube_r194, 125, 101, 37.0417F, 37.9756F, -0.048F, 1, 1, 2, -0.35F, false));
		cube_r194.cubeList.add(new ModelBox(cube_r194, 31, 34, 36.9867F, 37.9766F, -0.049F, 1, 1, 2, -0.35F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		IronsRaised.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}