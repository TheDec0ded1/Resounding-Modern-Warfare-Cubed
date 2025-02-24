package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AA12Action extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;

	public AA12Action() {
		textureWidth = 512;
		textureHeight = 512;

		action = new ModelRenderer(this);
		action.setRotationPoint(0.0F, 24.0F, 0.0F);
		action.cubeList.add(new ModelBox(action, 99, 23, -3.5F, -42.525F, -25.0F, 4, 1, 4, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 0, 81, -3.5F, -42.3682F, -19.924F, 4, 1, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 0, 90, -3.5F, -41.5F, -25.0F, 4, 3, 11, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.5F, -41.5285F, -17.0412F);
		action.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 66, 11, -2.0F, -0.5F, -2.0F, 4, 1, 5, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.5F, -41.6939F, -19.7114F);
		action.addChild(cube_r2);
		setRotationAngle(cube_r2, 1.0908F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 26, -2.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, -0.2F, 28.7F);
		action.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 238, 239, -2.0F, -44.3F, -69.0F, 1, 1, 29, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 122, 236, -2.7071F, -43.5929F, -69.0F, 1, 1, 29, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 180, 52, -1.2929F, -43.5929F, -69.0F, 1, 1, 29, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 212, 55, -2.0F, -42.8858F, -69.0F, 1, 1, 29, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.4142F, -42.1787F, -68.0F);
		bone3.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.7854F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 210, -0.5F, -2.5F, -1.0F, 1, 1, 29, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.4142F, -41.1787F, -68.0F);
		bone3.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 180, 144, -0.5F, -2.5F, -1.0F, 1, 1, 29, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-0.5858F, -41.1787F, -68.0F);
		bone3.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.7854F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 90, 234, -0.5F, -2.5F, -1.0F, 1, 1, 29, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-0.5858F, -42.1787F, -68.0F);
		bone3.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 177, 239, -0.5F, -2.5F, -1.0F, 1, 1, 29, 0.0F, false));
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