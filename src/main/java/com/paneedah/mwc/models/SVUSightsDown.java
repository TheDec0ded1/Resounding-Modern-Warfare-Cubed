package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SVUSightsDown extends ModelBase {
	private final ModelRenderer IronsLowered;
	private final ModelRenderer bone8_r1;
	private final ModelRenderer bone9_r1;
	private final ModelRenderer bone13_r1;
	private final ModelRenderer bone13_r2;
	private final ModelRenderer cube_r165;
	private final ModelRenderer cube_r166;
	private final ModelRenderer cube_r167;
	private final ModelRenderer cube_r190_r1;
	private final ModelRenderer cube_r168;
	private final ModelRenderer cube_r191_r1;
	private final ModelRenderer cube_r169;
	private final ModelRenderer cube_r192_r1;
	private final ModelRenderer cube_r170;
	private final ModelRenderer cube_r193_r1;
	private final ModelRenderer cube_r171;
	private final ModelRenderer cube_r194_r1;
	private final ModelRenderer cube_r172;
	private final ModelRenderer cube_r195_r1;

	public SVUSightsDown() {
		textureWidth = 256;
		textureHeight = 256;

		IronsLowered = new ModelRenderer(this);
		IronsLowered.setRotationPoint(-6.5F, -61.2F, 3.85F);
		IronsLowered.cubeList.add(new ModelBox(IronsLowered, 20, 0, 4.5F, 46.7F, -56.8F, 1, 3, 1, 0.2F, false));
		IronsLowered.cubeList.add(new ModelBox(IronsLowered, 0, 0, 4.0F, 43.9F, -1.799F, 2, 4, 2, -0.3F, false));

		bone8_r1 = new ModelRenderer(this);
		bone8_r1.setRotationPoint(5.0F, 44.851F, -3.324F);
		IronsLowered.addChild(bone8_r1);
		setRotationAngle(bone8_r1, 1.5708F, 0.0F, 0.0F);
		bone8_r1.cubeList.add(new ModelBox(bone8_r1, 0, 0, -1.0F, -0.475F, -1.049F, 2, 4, 2, -0.3F, false));
		bone8_r1.cubeList.add(new ModelBox(bone8_r1, 48, 41, -1.0F, -0.675F, -1.05F, 2, 1, 2, -0.3F, false));
		bone8_r1.cubeList.add(new ModelBox(bone8_r1, 20, 19, 0.1F, -1.825F, -0.95F, 1, 2, 2, -0.4F, false));
		bone8_r1.cubeList.add(new ModelBox(bone8_r1, 20, 26, -1.1F, -1.825F, -0.95F, 1, 2, 2, -0.4F, false));
		bone8_r1.cubeList.add(new ModelBox(bone8_r1, 0, 49, -0.2F, -2.025F, -1.0F, 1, 1, 2, -0.35F, false));
		bone8_r1.cubeList.add(new ModelBox(bone8_r1, 8, 49, -0.8F, -2.025F, -1.0F, 1, 1, 2, -0.35F, false));
		bone8_r1.cubeList.add(new ModelBox(bone8_r1, 19, 49, -0.5F, -2.025F, -1.0F, 1, 1, 2, -0.35F, false));

		bone9_r1 = new ModelRenderer(this);
		bone9_r1.setRotationPoint(5.0F, 46.3F, -59.779F);
		IronsLowered.addChild(bone9_r1);
		setRotationAngle(bone9_r1, 1.5708F, 0.0F, 0.0F);
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 48, 41, -1.0F, -1.421F, -1.1F, 2, 1, 2, -0.3F, false));
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 19, 46, -1.4441F, -2.4875F, -1.0F, 1, 1, 2, -0.4F, false));
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 48, 29, -1.0F, -2.979F, -1.0F, 2, 1, 1, -0.4F, false));
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 48, 29, -1.0F, -2.979F, 0.0F, 2, 1, 1, -0.4F, false));
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 19, 46, -1.1F, -2.979F, -1.0F, 1, 1, 2, -0.4F, false));
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 19, 46, 0.1F, -2.979F, -1.0F, 1, 1, 2, -0.4F, false));
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 19, 46, 0.4441F, -2.4875F, -1.0F, 1, 1, 2, -0.4F, false));
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 19, 46, -1.4441F, -2.2875F, -1.0F, 1, 1, 2, -0.4F, false));
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 19, 46, 0.4441F, -2.2875F, -1.0F, 1, 1, 2, -0.4F, false));
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 19, 46, -1.4441F, -2.0875F, -1.0F, 1, 1, 2, -0.4F, false));
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 19, 46, 0.4441F, -2.0875F, -1.0F, 1, 1, 2, -0.4F, false));
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 0, 30, -0.5F, 1.979F, -0.6F, 1, 2, 1, 0.2F, false));
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 20, 0, -0.5F, -0.821F, -0.6F, 1, 3, 1, -0.1F, false));
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 33, 0, -0.5F, -2.221F, -0.6F, 1, 2, 1, -0.4F, false));

		bone13_r1 = new ModelRenderer(this);
		bone13_r1.setRotationPoint(5.0F, 46.3F, -59.779F);
		IronsLowered.addChild(bone13_r1);
		setRotationAngle(bone13_r1, 1.5708F, -0.6109F, 0.0F);
		bone13_r1.cubeList.add(new ModelBox(bone13_r1, 19, 46, -2.4527F, -2.1111F, -1.0F, 1, 1, 2, -0.4F, false));
		bone13_r1.cubeList.add(new ModelBox(bone13_r1, 19, 46, -2.4527F, -1.9111F, -1.0F, 1, 1, 2, -0.4F, false));
		bone13_r1.cubeList.add(new ModelBox(bone13_r1, 19, 46, -2.4527F, -1.7111F, -1.0F, 1, 1, 2, -0.4F, false));
		bone13_r1.cubeList.add(new ModelBox(bone13_r1, 19, 46, -0.5979F, -1.8174F, -1.0F, 1, 1, 2, -0.4F, false));
		bone13_r1.cubeList.add(new ModelBox(bone13_r1, 19, 46, -0.5979F, -2.0174F, -1.0F, 1, 1, 2, -0.4F, false));
		bone13_r1.cubeList.add(new ModelBox(bone13_r1, 19, 46, -0.5979F, -2.2174F, -1.0F, 1, 1, 2, -0.4F, false));

		bone13_r2 = new ModelRenderer(this);
		bone13_r2.setRotationPoint(5.0F, 46.3F, -59.779F);
		IronsLowered.addChild(bone13_r2);
		setRotationAngle(bone13_r2, 1.5708F, 0.6109F, 0.0F);
		bone13_r2.cubeList.add(new ModelBox(bone13_r2, 48, 44, 1.4527F, -2.1111F, -1.0F, 1, 1, 2, -0.4F, false));
		bone13_r2.cubeList.add(new ModelBox(bone13_r2, 48, 44, 1.4527F, -1.9111F, -1.0F, 1, 1, 2, -0.4F, false));
		bone13_r2.cubeList.add(new ModelBox(bone13_r2, 48, 44, 1.4527F, -1.7111F, -1.0F, 1, 1, 2, -0.4F, false));
		bone13_r2.cubeList.add(new ModelBox(bone13_r2, 48, 44, -0.4021F, -1.8174F, -1.0F, 1, 1, 2, -0.4F, false));
		bone13_r2.cubeList.add(new ModelBox(bone13_r2, 48, 44, -0.4021F, -2.0174F, -1.0F, 1, 1, 2, -0.4F, false));
		bone13_r2.cubeList.add(new ModelBox(bone13_r2, 48, 44, -0.4021F, -2.2174F, -1.0F, 1, 1, 2, -0.4F, false));

		cube_r165 = new ModelRenderer(this);
		cube_r165.setRotationPoint(0.0F, 0.0F, 0.0F);
		IronsLowered.addChild(cube_r165);
		setRotationAngle(cube_r165, 0.0F, 0.0F, 0.7854F);
		

		cube_r166 = new ModelRenderer(this);
		cube_r166.setRotationPoint(4.8F, -1.2F, 1.1F);
		IronsLowered.addChild(cube_r166);
		setRotationAngle(cube_r166, 0.3316F, 0.0F, 0.0F);
		

		cube_r167 = new ModelRenderer(this);
		cube_r167.setRotationPoint(3.9F, -10.7F, -1.7F);
		IronsLowered.addChild(cube_r167);
		setRotationAngle(cube_r167, 0.0F, 0.0F, 0.7854F);
		

		cube_r190_r1 = new ModelRenderer(this);
		cube_r190_r1.setRotationPoint(40.0584F, 38.5026F, -1.624F);
		cube_r167.addChild(cube_r190_r1);
		setRotationAngle(cube_r190_r1, 1.5708F, -0.7854F, -0.7854F);
		cube_r190_r1.cubeList.add(new ModelBox(cube_r190_r1, 31, 14, -1.243F, -0.4873F, -0.951F, 1, 1, 2, -0.4F, false));
		cube_r190_r1.cubeList.add(new ModelBox(cube_r190_r1, 40, 44, -1.043F, -0.4873F, -0.951F, 1, 1, 2, -0.4F, false));

		cube_r168 = new ModelRenderer(this);
		cube_r168.setRotationPoint(6.1F, -10.7F, -1.7F);
		IronsLowered.addChild(cube_r168);
		setRotationAngle(cube_r168, 0.0F, 0.0F, -0.7854F);
		

		cube_r191_r1 = new ModelRenderer(this);
		cube_r191_r1.setRotationPoint(-40.0584F, 38.5026F, -1.624F);
		cube_r168.addChild(cube_r191_r1);
		setRotationAngle(cube_r191_r1, 1.5708F, 0.7854F, 0.7854F);
		cube_r191_r1.cubeList.add(new ModelBox(cube_r191_r1, 32, 7, 0.243F, -0.4873F, -0.951F, 1, 1, 2, -0.4F, false));
		cube_r191_r1.cubeList.add(new ModelBox(cube_r191_r1, 32, 7, 0.043F, -0.4873F, -0.951F, 1, 1, 2, -0.4F, false));

		cube_r169 = new ModelRenderer(this);
		cube_r169.setRotationPoint(3.85F, -11.8F, -1.7F);
		IronsLowered.addChild(cube_r169);
		setRotationAngle(cube_r169, 0.0F, 0.0F, -0.7854F);
		

		cube_r192_r1 = new ModelRenderer(this);
		cube_r192_r1.setRotationPoint(-39.2452F, 40.8714F, -1.624F);
		cube_r169.addChild(cube_r192_r1);
		setRotationAngle(cube_r192_r1, 1.5708F, 0.7854F, 0.7854F);
		cube_r192_r1.cubeList.add(new ModelBox(cube_r192_r1, 31, 14, 0.2148F, -1.8512F, -0.999F, 1, 1, 2, -0.35F, false));
		cube_r192_r1.cubeList.add(new ModelBox(cube_r192_r1, 40, 44, 0.1598F, -1.8522F, -0.998F, 1, 1, 2, -0.35F, false));

		cube_r170 = new ModelRenderer(this);
		cube_r170.setRotationPoint(3.9F, -11.7F, -1.7F);
		IronsLowered.addChild(cube_r170);
		setRotationAngle(cube_r170, 0.0F, 0.0F, -0.7854F);
		

		cube_r193_r1 = new ModelRenderer(this);
		cube_r193_r1.setRotationPoint(-39.2099F, 40.7653F, -1.624F);
		cube_r170.addChild(cube_r193_r1);
		setRotationAngle(cube_r193_r1, 1.5708F, 0.7854F, 0.7854F);
		cube_r193_r1.cubeList.add(new ModelBox(cube_r193_r1, 20, 30, 0.1945F, -1.7501F, -0.951F, 1, 1, 2, -0.4F, false));
		cube_r193_r1.cubeList.add(new ModelBox(cube_r193_r1, 11, 31, -0.0055F, -1.7501F, -0.951F, 1, 1, 2, -0.4F, false));

		cube_r171 = new ModelRenderer(this);
		cube_r171.setRotationPoint(6.1F, -11.7F, -1.7F);
		IronsLowered.addChild(cube_r171);
		setRotationAngle(cube_r171, 0.0F, 0.0F, 0.7854F);
		

		cube_r194_r1 = new ModelRenderer(this);
		cube_r194_r1.setRotationPoint(39.2099F, 40.7653F, -1.624F);
		cube_r171.addChild(cube_r194_r1);
		setRotationAngle(cube_r194_r1, 1.5708F, -0.7854F, -0.7854F);
		cube_r194_r1.cubeList.add(new ModelBox(cube_r194_r1, 11, 19, -0.9945F, -1.7501F, -0.951F, 1, 1, 2, -0.4F, false));
		cube_r194_r1.cubeList.add(new ModelBox(cube_r194_r1, 12, 28, -1.1945F, -1.7501F, -0.951F, 1, 1, 2, -0.4F, false));

		cube_r172 = new ModelRenderer(this);
		cube_r172.setRotationPoint(6.15F, -11.8F, -1.7F);
		IronsLowered.addChild(cube_r172);
		setRotationAngle(cube_r172, 0.0F, 0.0F, 0.7854F);
		

		cube_r195_r1 = new ModelRenderer(this);
		cube_r195_r1.setRotationPoint(39.2452F, 40.8714F, -1.624F);
		cube_r172.addChild(cube_r195_r1);
		setRotationAngle(cube_r195_r1, 1.5708F, -0.7854F, -0.7854F);
		cube_r195_r1.cubeList.add(new ModelBox(cube_r195_r1, 11, 13, -1.2148F, -1.8512F, -0.999F, 1, 1, 2, -0.35F, false));
		cube_r195_r1.cubeList.add(new ModelBox(cube_r195_r1, 0, 43, -1.1598F, -1.8522F, -0.998F, 1, 1, 2, -0.35F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		IronsLowered.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}