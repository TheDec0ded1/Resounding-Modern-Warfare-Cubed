package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Tavor21Magwell9mm extends ModelWithAttachments {
	private final ModelRenderer magwell9mm;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;

	public Tavor21Magwell9mm() {
		textureWidth = 432;
		textureHeight = 432;

		magwell9mm = new ModelRenderer(this);
		magwell9mm.setRotationPoint(-0.25F, 24.65F, -0.25F);
		magwell9mm.cubeList.add(new ModelBox(magwell9mm, 394, 174, -3.125F, -30.4F, 16.0F, 4, 5, 8, -0.2F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.323F, -27.8847F, 19.0353F);
		magwell9mm.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 394, 212, -2.0F, 1.7F, -3.6F, 3, 1, 9, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 402, 60, 0.4F, 1.7F, -3.6F, 2, 1, 9, -0.2F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.323F, -26.7488F, 17.9779F);
		magwell9mm.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.1309F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 238, 406, -2.0F, -0.5F, -2.0F, 2, 1, 7, -0.2F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 220, 406, 0.4F, -0.5F, -2.0F, 2, 1, 7, -0.2F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1.323F, -25.5648F, 24.0749F);
		magwell9mm.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.8727F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 86, 418, -2.0F, -0.5F, -2.9F, 2, 1, 3, -0.2F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 76, 418, 0.4F, -0.5F, -2.9F, 2, 1, 3, -0.2F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.223F, -27.9802F, 19.1396F);
		magwell9mm.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 236, 420, -2.0F, 1.1F, -3.6F, 3, 1, 1, -0.1F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 422, 355, 0.2F, 1.1F, -3.6F, 2, 1, 1, -0.1F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		magwell9mm.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}