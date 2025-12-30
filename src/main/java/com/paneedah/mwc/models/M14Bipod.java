package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M14Bipod extends ModelWithAttachments {
	private final ModelRenderer bipod;
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r1;
	private final ModelRenderer bone3;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r2;
	private final ModelRenderer bone;

	public M14Bipod() {
		textureWidth = 340;
		textureHeight = 340;

		bipod = new ModelRenderer(this);
		bipod.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-31.5513F, -18.7674F, -2.0F);
		bipod.addChild(bone4);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone4.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 1.0908F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 196, 70, 20.0F, -35.0F, -82.0F, 1, 1, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 196, 70, 11.0F, -35.0F, -84.0F, 10, 1, 2, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(31.5513F, 18.7674F, 2.0F);
		bone4.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.0F, -1.0908F);
		bone3.cubeList.add(new ModelBox(bone3, 196, 70, 18.8689F, -18.2667F, -86.0F, 10, 1, 2, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 196, 70, 8.8689F, -18.2667F, -86.0F, 10, 1, 2, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 196, 70, 8.8689F, -18.2667F, -84.0F, 1, 1, 2, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipod.addChild(bone2);
		

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-31.5513F, -18.7674F, -2.0F);
		bone2.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 1.0908F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 196, 70, 1.0F, -35.0F, -84.0F, 10, 1, 2, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-26.0F, -10.0F, -2.0F);
		bipod.addChild(bone);
		setRotationAngle(bone, 0.0F, 0.0F, 0.7854F);
		bone.cubeList.add(new ModelBox(bone, 236, 131, -0.6464F, -35.3536F, -84.0F, 2, 2, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bipod.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}