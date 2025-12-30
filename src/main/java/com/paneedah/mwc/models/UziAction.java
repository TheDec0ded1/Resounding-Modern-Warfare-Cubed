package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class UziAction extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer action1;
	private final ModelRenderer action2;
	private final ModelRenderer action3;

	public UziAction() {
		textureWidth = 512;
		textureHeight = 512;

		action = new ModelRenderer(this);
		action.setRotationPoint(-0.1F, 24.3F, 5.0F);
		

		action1 = new ModelRenderer(this);
		action1.setRotationPoint(-3.5F, -37.8F, -8.5F);
		action.addChild(action1);
		action1.cubeList.add(new ModelBox(action1, 232, 320, 0.0F, 0.0F, 0.0F, 4, 3, 6, 0.0F, false));
		action1.cubeList.add(new ModelBox(action1, 324, 0, 3.0F, -1.0F, -7.0F, 1, 4, 7, 0.0F, false));
		action1.cubeList.add(new ModelBox(action1, 35, 245, -0.1F, -0.8F, -7.0F, 1, 4, 1, 0.0F, false));
		action1.cubeList.add(new ModelBox(action1, 295, 260, -0.1F, 2.2F, -6.0F, 1, 1, 12, 0.0F, false));

		action2 = new ModelRenderer(this);
		action2.setRotationPoint(-3.6F, -38.6F, -8.5F);
		action.addChild(action2);
		action2.cubeList.add(new ModelBox(action2, 166, 323, 0.0F, 0.0F, 0.0F, 4, 1, 6, 0.0F, false));
		action2.cubeList.add(new ModelBox(action2, 188, 267, 0.6071F, -0.8071F, -7.1F, 3, 1, 13, -0.1F, false));

		action3 = new ModelRenderer(this);
		action3.setRotationPoint(-3.6F, -38.6F, -8.5F);
		action.addChild(action3);
		setRotationAngle(action3, 0.0F, 0.0F, -0.7854F);
		action3.cubeList.add(new ModelBox(action3, 53, 337, 0.4343F, -0.4343F, -6.0F, 1, 1, 6, 0.0F, false));
		action3.cubeList.add(new ModelBox(action3, 337, 181, 0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));
		action3.cubeList.add(new ModelBox(action3, 178, 353, 0.0F, 0.0F, -7.0F, 1, 1, 1, 0.0F, false));
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