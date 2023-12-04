package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBZ95Action extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer bolt2;
	private final ModelRenderer cube_r153;
	private final ModelRenderer cube_r154;
	private final ModelRenderer cube_r155_r1;
	private final ModelRenderer cube_r155;
	private final ModelRenderer cube_r156;
	private final ModelRenderer cube_r157;
	private final ModelRenderer cube_r158;
	private final ModelRenderer cube_r159;
	private final ModelRenderer cube_r160;
	private final ModelRenderer cube_r163_r1;
	private final ModelRenderer cube_r161;
	private final ModelRenderer cube_r162;

	public QBZ95Action() {
		textureWidth = 512;
		textureHeight = 256;

		action = new ModelRenderer(this);
		action.setRotationPoint(-3.5F, -5.5F, -0.25F);
		setRotationAngle(action, 1.041F, 0.0F, 0.0F);
		

		bolt2 = new ModelRenderer(this);
		bolt2.setRotationPoint(2.5F, -20.5008F, 3.1234F);
		action.addChild(bolt2);
		

		cube_r153 = new ModelRenderer(this);
		cube_r153.setRotationPoint(0.5F, 2.3058F, 2.7368F);
		bolt2.addChild(cube_r153);
		setRotationAngle(cube_r153, -1.5646F, 0.0F, 0.0F);
		cube_r153.cubeList.add(new ModelBox(cube_r153, 461, 234, -2.001F, -0.2435F, -3.4501F, 2, 2, 1, 0.2F, false));

		cube_r154 = new ModelRenderer(this);
		cube_r154.setRotationPoint(0.5F, 0.7659F, 5.5496F);
		bolt2.addChild(cube_r154);
		setRotationAngle(cube_r154, -0.0811F, 0.0F, 0.0F);
		cube_r154.cubeList.add(new ModelBox(cube_r154, 476, 239, -2.001F, -4.5366F, -2.0009F, 2, 2, 1, 0.2F, false));

		cube_r155_r1 = new ModelRenderer(this);
		cube_r155_r1.setRotationPoint(-1.001F, 0.7464F, -2.4323F);
		cube_r154.addChild(cube_r155_r1);
		setRotationAngle(cube_r155_r1, 0.6109F, 0.0F, 0.0F);
		cube_r155_r1.cubeList.add(new ModelBox(cube_r155_r1, 475, 238, -1.0F, -1.5F, -1.0F, 2, 2, 2, 0.2F, false));

		cube_r155 = new ModelRenderer(this);
		cube_r155.setRotationPoint(0.5F, 1.5216F, 5.3345F);
		bolt2.addChild(cube_r155);
		setRotationAngle(cube_r155, -0.4738F, 0.0F, 0.0F);
		cube_r155.cubeList.add(new ModelBox(cube_r155, 482, 239, -2.001F, -2.811F, -3.2636F, 2, 1, 1, 0.2F, false));

		cube_r156 = new ModelRenderer(this);
		cube_r156.setRotationPoint(0.5F, 2.1374F, 4.8465F);
		bolt2.addChild(cube_r156);
		setRotationAngle(cube_r156, -0.8665F, 0.0F, 0.0F);
		cube_r156.cubeList.add(new ModelBox(cube_r156, 488, 239, -2.001F, -1.2693F, -3.8763F, 2, 1, 1, 0.2F, false));

		cube_r157 = new ModelRenderer(this);
		cube_r157.setRotationPoint(1.0F, 4.6936F, -22.4535F);
		bolt2.addChild(cube_r157);
		setRotationAngle(cube_r157, -1.056F, 0.1312F, -0.2272F);
		

		cube_r158 = new ModelRenderer(this);
		cube_r158.setRotationPoint(1.0F, 4.6936F, -22.4535F);
		bolt2.addChild(cube_r158);
		setRotationAngle(cube_r158, -1.041F, 0.0F, 0.0F);
		

		cube_r159 = new ModelRenderer(this);
		cube_r159.setRotationPoint(0.5F, 2.3356F, 1.6861F);
		bolt2.addChild(cube_r159);
		setRotationAngle(cube_r159, -2.2627F, 0.0F, 0.0F);
		cube_r159.cubeList.add(new ModelBox(cube_r159, 476, 226, -2.001F, -1.2773F, -3.7554F, 2, 2, 1, 0.2F, false));

		cube_r160 = new ModelRenderer(this);
		cube_r160.setRotationPoint(1.0F, 2.4684F, -26.0744F);
		bolt2.addChild(cube_r160);
		setRotationAngle(cube_r160, -1.041F, 0.0F, 0.0F);
		cube_r160.cubeList.add(new ModelBox(cube_r160, 468, 223, -2.501F, -26.1437F, 10.3696F, 2, 1, 2, -0.2F, false));
		cube_r160.cubeList.add(new ModelBox(cube_r160, 473, 228, -2.5F, -25.9437F, 10.1696F, 2, 1, 5, -0.2F, false));
		cube_r160.cubeList.add(new ModelBox(cube_r160, 167, 24, -2.5F, -25.3437F, 5.1696F, 2, 2, 32, -0.2F, false));
		cube_r160.cubeList.add(new ModelBox(cube_r160, 138, 15, -3.5F, -25.3437F, 38.1696F, 4, 3, 15, -0.2F, false));
		cube_r160.cubeList.add(new ModelBox(cube_r160, 474, 224, -2.501F, -30.01F, 10.373F, 2, 1, 2, 0.2F, false));

		cube_r163_r1 = new ModelRenderer(this);
		cube_r163_r1.setRotationPoint(-2.867F, -22.4985F, 45.6696F);
		cube_r160.addChild(cube_r163_r1);
		setRotationAngle(cube_r163_r1, 0.0F, 0.0F, 0.3927F);
		cube_r163_r1.cubeList.add(new ModelBox(cube_r163_r1, 138, 15, -1.0F, -2.0F, -7.5F, 4, 4, 15, -0.2F, false));

		cube_r161 = new ModelRenderer(this);
		cube_r161.setRotationPoint(1.0F, 2.4684F, -26.0744F);
		bolt2.addChild(cube_r161);
		setRotationAngle(cube_r161, -1.0934F, 0.0F, 0.0F);
		

		cube_r162 = new ModelRenderer(this);
		cube_r162.setRotationPoint(0.0F, 0.0F, 0.0F);
		bolt2.addChild(cube_r162);
		setRotationAngle(cube_r162, -0.4301F, 0.0F, 0.0F);
		cube_r162.cubeList.add(new ModelBox(cube_r162, 471, 224, -1.501F, -4.2184F, 2.7571F, 2, 2, 2, 0.2F, false));
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