package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FELINAction extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer bolt2;
	private final ModelRenderer cube_r153;
	private final ModelRenderer cube_r154;
	private final ModelRenderer cube_r155;
	private final ModelRenderer cube_r156;
	private final ModelRenderer cube_r157;
	private final ModelRenderer cube_r158;
	private final ModelRenderer cube_r159;
	private final ModelRenderer cube_r160;
	private final ModelRenderer cube_r161;
	private final ModelRenderer cube_r162;

	public FELINAction() {
		textureWidth = 256;
		textureHeight = 256;

		action = new ModelRenderer(this);
		action.setRotationPoint(-1.3F, -18.0F, -24.0F);
		setRotationAngle(action, 0.0F, 0.0F, 1.5708F);
		

		bolt2 = new ModelRenderer(this);
		bolt2.setRotationPoint(0.3F, -0.0008F, -0.8766F);
		action.addChild(bolt2);
		setRotationAngle(bolt2, 1.0472F, 0.0F, 0.0F);
		

		cube_r153 = new ModelRenderer(this);
		cube_r153.setRotationPoint(0.5F, 2.3058F, 2.7368F);
		bolt2.addChild(cube_r153);
		setRotationAngle(cube_r153, -1.7828F, 0.0F, 0.0F);
		cube_r153.cubeList.add(new ModelBox(cube_r153, 50, 136, -2.001F, -0.7276F, -0.0296F, 2, 2, 1, 0.0F, false));

		cube_r154 = new ModelRenderer(this);
		cube_r154.setRotationPoint(0.5F, 0.7659F, 5.5496F);
		bolt2.addChild(cube_r154);
		setRotationAngle(cube_r154, -0.0811F, 0.0F, 0.0F);
		cube_r154.cubeList.add(new ModelBox(cube_r154, 16, 96, -2.001F, -0.5569F, -0.4177F, 2, 1, 1, 0.0F, false));

		cube_r155 = new ModelRenderer(this);
		cube_r155.setRotationPoint(0.5F, 1.5216F, 5.3345F);
		bolt2.addChild(cube_r155);
		setRotationAngle(cube_r155, -0.4738F, 0.0F, 0.0F);
		cube_r155.cubeList.add(new ModelBox(cube_r155, 22, 96, -2.0F, -0.584F, -0.4458F, 2, 1, 1, 0.0F, false));

		cube_r156 = new ModelRenderer(this);
		cube_r156.setRotationPoint(0.5F, 2.1374F, 4.8465F);
		bolt2.addChild(cube_r156);
		setRotationAngle(cube_r156, -0.8665F, 0.0F, 0.0F);
		cube_r156.cubeList.add(new ModelBox(cube_r156, 28, 96, -2.001F, -0.5984F, -0.482F, 2, 1, 1, 0.0F, false));

		cube_r157 = new ModelRenderer(this);
		cube_r157.setRotationPoint(1.0F, 4.6936F, -22.4535F);
		bolt2.addChild(cube_r157);
		setRotationAngle(cube_r157, -1.056F, 0.1312F, -0.2272F);
		cube_r157.cubeList.add(new ModelBox(cube_r157, 5, 0, -4.9944F, -23.2437F, 10.3673F, 1, 2, 1, -0.2F, false));

		cube_r158 = new ModelRenderer(this);
		cube_r158.setRotationPoint(1.0F, 4.6936F, -22.4535F);
		bolt2.addChild(cube_r158);
		setRotationAngle(cube_r158, -1.041F, 0.0F, 0.0F);
		cube_r158.cubeList.add(new ModelBox(cube_r158, 113, 136, -2.5F, -24.5437F, 11.1702F, 2, 2, 1, 0.0F, false));

		cube_r159 = new ModelRenderer(this);
		cube_r159.setRotationPoint(0.5F, 2.3356F, 1.6861F);
		bolt2.addChild(cube_r159);
		setRotationAngle(cube_r159, -2.2627F, 0.0F, 0.0F);
		cube_r159.cubeList.add(new ModelBox(cube_r159, 137, 29, -2.002F, -0.8552F, -0.7432F, 2, 2, 1, 0.0F, false));

		cube_r160 = new ModelRenderer(this);
		cube_r160.setRotationPoint(1.0F, 2.4684F, -26.0744F);
		bolt2.addChild(cube_r160);
		setRotationAngle(cube_r160, -1.041F, 0.0F, 0.0F);
		cube_r160.cubeList.add(new ModelBox(cube_r160, 137, 22, -2.5F, -25.1437F, 10.7702F, 2, 1, 5, -0.2F, false));
		cube_r160.cubeList.add(new ModelBox(cube_r160, 137, 22, -2.5F, -24.5437F, 10.9202F, 2, 1, 5, 0.0F, false));
		cube_r160.cubeList.add(new ModelBox(cube_r160, 137, 22, -2.5F, -23.5437F, 10.9202F, 2, 1, 5, 0.0F, false));
		cube_r160.cubeList.add(new ModelBox(cube_r160, 137, 22, -1.5F, -23.5437F, 10.9202F, 2, 1, 5, 0.0F, false));
		cube_r160.cubeList.add(new ModelBox(cube_r160, 137, 22, -1.5F, -24.5437F, 10.9202F, 2, 1, 5, 0.0F, false));
		cube_r160.cubeList.add(new ModelBox(cube_r160, 107, 67, -2.5F, -24.5437F, 12.1702F, 2, 1, 2, 0.0F, false));

		cube_r161 = new ModelRenderer(this);
		cube_r161.setRotationPoint(1.0F, 2.4684F, -26.0744F);
		bolt2.addChild(cube_r161);
		setRotationAngle(cube_r161, -1.0934F, 0.0F, 0.0F);
		

		cube_r162 = new ModelRenderer(this);
		cube_r162.setRotationPoint(0.0F, 0.0F, 0.0F);
		bolt2.addChild(cube_r162);
		setRotationAngle(cube_r162, -0.4301F, 0.0F, 0.0F);
		
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		action.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}