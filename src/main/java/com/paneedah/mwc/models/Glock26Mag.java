package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Glock26Mag extends ModelBase {
	private final ModelRenderer Magazine10;
	private final ModelRenderer gun1;
	private final ModelRenderer gun2;
	private final ModelRenderer gun2_r1;
	private final ModelRenderer gun3;
	private final ModelRenderer gun4;
	private final ModelRenderer gun5;
	private final ModelRenderer gun6;
	private final ModelRenderer gun7;
	private final ModelRenderer gun8;
	private final ModelRenderer gun9;
	private final ModelRenderer gun10;
	private final ModelRenderer gun11;

	public Glock26Mag() {
		textureWidth = 192;
		textureHeight = 192;

		Magazine10 = new ModelRenderer(this);
		Magazine10.setRotationPoint(0.5F, 23.0F, -1.05F);
		

		gun1 = new ModelRenderer(this);
		gun1.setRotationPoint(-3.5F, -20.0F, -4.5F);
		Magazine10.addChild(gun1);
		gun1.cubeList.add(new ModelBox(gun1, 94, 63, 0.0F, -0.2F, -0.025F, 4, 1, 6, -0.025F, false));

		gun2 = new ModelRenderer(this);
		gun2.setRotationPoint(-3.3F, -29.3F, -7.7F);
		Magazine10.addChild(gun2);
		setRotationAngle(gun2, 0.376F, 0.0F, 0.0F);
		

		gun2_r1 = new ModelRenderer(this);
		gun2_r1.setRotationPoint(2.3F, 5.1431F, 3.2469F);
		gun2.addChild(gun2_r1);
		setRotationAngle(gun2_r1, -0.1309F, 0.0F, 0.0F);
		gun2_r1.cubeList.add(new ModelBox(gun2_r1, 23, 131, -2.0F, -5.5F, -2.5F, 3, 11, 5, -0.025F, false));

		gun3 = new ModelRenderer(this);
		gun3.setRotationPoint(-3.3F, -20.1F, -1.9F);
		Magazine10.addChild(gun3);
		setRotationAngle(gun3, 0.2974F, 0.0F, 0.0F);
		gun3.cubeList.add(new ModelBox(gun3, 117, 157, 0.3F, -0.1985F, 0.0347F, 3, 1, 3, -0.025F, false));

		gun4 = new ModelRenderer(this);
		gun4.setRotationPoint(-3.3F, -20.5F, -2.5F);
		Magazine10.addChild(gun4);
		gun4.cubeList.add(new ModelBox(gun4, 172, 8, 0.3F, -0.2F, -0.025F, 3, 1, 1, -0.025F, false));

		gun5 = new ModelRenderer(this);
		gun5.setRotationPoint(-0.7F, -29.3F, -7.7F);
		Magazine10.addChild(gun5);
		setRotationAngle(gun5, 0.376F, 0.0F, 0.0F);
		

		gun6 = new ModelRenderer(this);
		gun6.setRotationPoint(-0.7F, -20.1F, -1.9F);
		Magazine10.addChild(gun6);
		setRotationAngle(gun6, 0.2974F, 0.0F, 0.0F);
		

		gun7 = new ModelRenderer(this);
		gun7.setRotationPoint(-0.7F, -20.5F, -2.5F);
		Magazine10.addChild(gun7);
		

		gun8 = new ModelRenderer(this);
		gun8.setRotationPoint(-3.3F, -20.0F, -4.5F);
		Magazine10.addChild(gun8);
		setRotationAngle(gun8, 0.8551F, 0.0F, 0.0F);
		gun8.cubeList.add(new ModelBox(gun8, 9, 172, 0.3F, -0.1501F, 0.1345F, 3, 1, 1, -0.025F, false));

		gun9 = new ModelRenderer(this);
		gun9.setRotationPoint(-0.7F, -20.0F, -4.5F);
		Magazine10.addChild(gun9);
		setRotationAngle(gun9, 0.8551F, 0.0F, 0.0F);
		

		gun10 = new ModelRenderer(this);
		gun10.setRotationPoint(-3.0F, -30.5F, -7.0F);
		Magazine10.addChild(gun10);
		setRotationAngle(gun10, 0.2974F, 0.0F, 0.0F);
		gun10.cubeList.add(new ModelBox(gun10, 27, 170, 0.5F, 0.2931F, 0.9561F, 2, 1, 2, -0.025F, false));

		gun11 = new ModelRenderer(this);
		gun11.setRotationPoint(-3.0F, -31.5F, -7.0F);
		Magazine10.addChild(gun11);
		gun11.cubeList.add(new ModelBox(gun11, 78, 153, 0.5F, 0.0F, 1.0F, 2, 1, 4, -0.025F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Magazine10.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}