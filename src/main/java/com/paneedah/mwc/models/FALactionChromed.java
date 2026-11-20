package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FALactionChromed extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer bone74;
	private final ModelRenderer bone75_r1;
	private final ModelRenderer bone92;

	public FALactionChromed() {
		textureWidth = 384;
		textureHeight = 384;

		action = new ModelRenderer(this);
		action.setRotationPoint(-3.0F, -15.8F, -26.7F);
		action.cubeList.add(new ModelBox(action, 304, 216, 1.0226F, -1.4547F, -0.8F, 1, 2, 11, -0.2F, false));
		action.cubeList.add(new ModelBox(action, 302, 251, 0.3154F, -0.7476F, -0.8F, 1, 1, 11, -0.2F, false));
		action.cubeList.add(new ModelBox(action, 346, 230, 1.7297F, -0.7476F, -0.8F, 1, 1, 11, -0.2F, false));
		action.cubeList.add(new ModelBox(action, 348, 11, -0.4027F, 1.5545F, 0.0F, 1, 1, 10, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 314, 360, 1.0226F, -1.2547F, -0.2F, 1, 2, 2, -0.2F, false));

		bone74 = new ModelRenderer(this);
		bone74.setRotationPoint(0.0F, 0.0F, 0.0F);
		action.addChild(bone74);
		setRotationAngle(bone74, 0.0F, 0.0F, 0.3142F);
		bone74.cubeList.add(new ModelBox(bone74, 328, 22, 0.0975F, 0.6029F, 0.0F, 1, 1, 10, 0.0F, false));

		bone75_r1 = new ModelRenderer(this);
		bone75_r1.setRotationPoint(2.4817F, -0.0094F, 5.0F);
		bone74.addChild(bone75_r1);
		setRotationAngle(bone75_r1, 0.0F, 0.0F, -0.6283F);
		bone75_r1.cubeList.add(new ModelBox(bone75_r1, 348, 0, -0.2147F, 0.0927F, -5.0F, 1, 1, 10, 0.0F, false));

		bone92 = new ModelRenderer(this);
		bone92.setRotationPoint(2.7F, -0.7F, -0.05F);
		action.addChild(bone92);
		setRotationAngle(bone92, 0.0F, 0.0F, 0.7854F);
		bone92.cubeList.add(new ModelBox(bone92, 346, 331, -1.4369F, 0.6525F, 0.05F, 1, 1, 10, 0.0F, false));
		bone92.cubeList.add(new ModelBox(bone92, 346, 342, -1.0127F, 0.2283F, 0.05F, 1, 1, 10, 0.0F, false));
		bone92.cubeList.add(new ModelBox(bone92, 350, 44, -1.0537F, 1.8971F, 0.05F, 1, 1, 10, 0.0F, false));
		bone92.cubeList.add(new ModelBox(bone92, 352, 142, 0.2319F, 0.6116F, 0.05F, 1, 1, 10, 0.0F, false));
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