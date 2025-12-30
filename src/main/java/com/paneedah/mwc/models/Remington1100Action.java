package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Remington1100Action extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer pump_r1;
	private final ModelRenderer pump_r2;
	private final ModelRenderer pump1_r1;
	private final ModelRenderer pump3_r1;

	public Remington1100Action() {
		textureWidth = 410;
		textureHeight = 410;

		action = new ModelRenderer(this);
		action.setRotationPoint(0.0F, 24.0F, 0.0F);
		action.cubeList.add(new ModelBox(action, 114, 140, -2.7F, -29.7F, -12.0F, 1, 1, 8, 0.0F, false));

		pump_r1 = new ModelRenderer(this);
		pump_r1.setRotationPoint(-4.2121F, -28.7F, -11.0674F);
		action.addChild(pump_r1);
		setRotationAngle(pump_r1, 0.0F, 1.309F, 0.0F);
		pump_r1.cubeList.add(new ModelBox(pump_r1, 121, 147, -0.5F, -0.4F, -0.5F, 1, 1, 1, -0.2F, false));
		pump_r1.cubeList.add(new ModelBox(pump_r1, 121, 147, -0.5F, -0.6F, -0.5F, 1, 1, 1, -0.2F, false));

		pump_r2 = new ModelRenderer(this);
		pump_r2.setRotationPoint(-4.2F, -28.9F, -8.0F);
		action.addChild(pump_r2);
		setRotationAngle(pump_r2, 0.0F, 1.5708F, 0.0F);
		pump_r2.cubeList.add(new ModelBox(pump_r2, 121, 147, 2.5F, -0.4F, 0.0F, 1, 1, 1, -0.2F, false));
		pump_r2.cubeList.add(new ModelBox(pump_r2, 118, 144, 2.5F, -0.2F, 0.0F, 1, 1, 4, -0.2F, false));

		pump1_r1 = new ModelRenderer(this);
		pump1_r1.setRotationPoint(20.1396F, -10.5788F, 0.0F);
		action.addChild(pump1_r1);
		setRotationAngle(pump1_r1, 0.0F, 0.0F, -0.7854F);
		pump1_r1.cubeList.add(new ModelBox(pump1_r1, 141, 129, -2.6293F, -29.6707F, -12.0F, 1, 1, 8, 0.0F, false));

		pump3_r1 = new ModelRenderer(this);
		pump3_r1.setRotationPoint(15.6663F, -6.5108F, 0.0F);
		action.addChild(pump3_r1);
		setRotationAngle(pump3_r1, 0.0F, 0.0F, -0.5995F);
		pump3_r1.cubeList.add(new ModelBox(pump3_r1, 295, 242, -2.6436F, -28.6826F, -12.0F, 1, 2, 8, 0.0F, false));
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