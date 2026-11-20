package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.10.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class PKMFeedTray extends ModelWithAttachments {
	private final ModelRenderer feedTray;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;

	public PKMFeedTray() {
		textureWidth = 512;
		textureHeight = 512;

		feedTray = new ModelRenderer(this);
		feedTray.setRotationPoint(-1.5F, -16.3F, -34.7F);
		setRotationAngle(feedTray, 0.0F, 0.0F, 0.0F);
		feedTray.cubeList.add(new ModelBox(feedTray, 46, 90, -2.7F, 2.3F, 9.5F, 2, 1, 10, 0.0F, false));
		feedTray.cubeList.add(new ModelBox(feedTray, 86, 56, -4.7F, 2.3F, 0.5F, 4, 1, 4, 0.0F, false));
		feedTray.cubeList.add(new ModelBox(feedTray, 148, 36, -0.7F, 2.3F, 0.5F, 2, 1, 8, 0.0F, false));
		feedTray.cubeList.add(new ModelBox(feedTray, 129, 98, -4.7F, 2.3F, 7.5F, 4, 1, 2, 0.0F, false));
		feedTray.cubeList.add(new ModelBox(feedTray, 144, 20, 0.7F, 2.3F, 3.5F, 2, 1, 4, 0.0F, false));
		feedTray.cubeList.add(new ModelBox(feedTray, 0, 13, 0.7F, 2.3F, 7.5F, 2, 1, 12, 0.0F, false));
		feedTray.cubeList.add(new ModelBox(feedTray, 216, 120, 0.7F, 2.9F, -0.5F, 2, 1, 20, 0.0F, false));
		feedTray.cubeList.add(new ModelBox(feedTray, 0, 0, -2.7F, 2.9F, 7.5F, 2, 1, 12, 0.0F, false));
		feedTray.cubeList.add(new ModelBox(feedTray, 126, 80, 0.7F, 3.3F, 13.5F, 2, 1, 6, 0.0F, false));
		feedTray.cubeList.add(new ModelBox(feedTray, 49, 133, -2.7F, 3.3F, 13.5F, 2, 1, 6, 0.0F, false));
		feedTray.cubeList.add(new ModelBox(feedTray, 116, 64, -2.7F, 1.3F, 9.5F, 2, 1, 5, 0.0F, false));
		feedTray.cubeList.add(new ModelBox(feedTray, 38, 133, 0.7F, 1.3F, 7.5F, 2, 1, 7, 0.0F, false));
		feedTray.cubeList.add(new ModelBox(feedTray, 33, 95, 0.7F, 1.3F, 0.5F, 2, 2, 3, 0.0F, false));
		feedTray.cubeList.add(new ModelBox(feedTray, 86, 14, 0.7F, 0.3F, -0.5F, 2, 3, 1, 0.0F, false));
		feedTray.cubeList.add(new ModelBox(feedTray, 96, 10, -2.7F, -0.4F, -0.5F, 2, 1, 1, 0.0F, false));
		feedTray.cubeList.add(new ModelBox(feedTray, 170, 161, -3.3F, 1.3F, 0.5F, 4, 2, 1, 0.0F, false));
		feedTray.cubeList.add(new ModelBox(feedTray, 153, 64, -4.8F, 1.3F, -0.2F, 3, 2, 1, 0.0F, false));
		feedTray.cubeList.add(new ModelBox(feedTray, 89, 127, -5.4F, 1.3F, 8.8F, 5, 2, 1, -0.3F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.7F, 3.3F, 0.5F);
		feedTray.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 86, 0, -1.0F, -3.0F, -1.0F, 2, 3, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.7F, 2.0071F, 13.2753F);
		feedTray.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.2618F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 102, 64, -1.0F, -1.0F, 1.0F, 2, 1, 5, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 88, 64, -4.4F, -1.0F, 1.0F, 2, 1, 5, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-4.7617F, 3.7129F, 3.5F);
		feedTray.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.7418F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 144, 10, 0.0F, -1.0F, -3.0F, 1, 1, 9, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		feedTray.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}