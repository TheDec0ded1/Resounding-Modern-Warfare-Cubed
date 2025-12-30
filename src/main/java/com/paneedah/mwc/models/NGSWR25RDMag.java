package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;

import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class NGSWR25RDMag extends ModelWithAttachments {
	private final ModelRenderer magazine;
	private final ModelRenderer cube_r136;
	private final ModelRenderer cube_r137;
	private final ModelRenderer cube_r138;
	private final ModelRenderer cube_r139;
	private final ModelRenderer cube_r140;
	private final ModelRenderer cube_r141;
	private final ModelRenderer cube_r142;
	private final ModelRenderer cube_r143;
	private final ModelRenderer cube_r144;
	private final ModelRenderer cube_r145;
	private final ModelRenderer cube_r146;
	private final ModelRenderer cube_r147;
	private final ModelRenderer cube_r148;
	private final ModelRenderer cube_r149;
	private final ModelRenderer cube_r150;

	public NGSWR25RDMag() {
		textureWidth = 256;
		textureHeight = 256;

		magazine = new ModelRenderer(this);
		magazine.setRotationPoint(0.25F, -3.0F, -24.0F);
		magazine.cubeList.add(new ModelBox(magazine, 73, 67, -1.0F, 1.0F, 8.0F, 1, 8, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 24, 12, -2.75F, 1.0F, 0.0F, 2, 8, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 24, 23, -1.25F, 1.0F, 2.75F, 1, 8, 2, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 24, 0, -3.25F, 1.0F, 2.75F, 1, 8, 2, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 24, 0, -0.9F, 13.0F, 0.0F, 1, 2, 10, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 65, 140, -3.75F, 13.25F, 1.2F, 4, 2, 9, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 0, 64, -3.75F, 14.25F, 0.2F, 4, 1, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 0, 126, -3.6F, 13.0F, 0.0F, 3, 2, 10, 0.001F, false));
		magazine.cubeList.add(new ModelBox(magazine, 36, 0, -2.75F, 0.0F, 9.0F, 2, 9, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 32, 51, -1.0F, 0.2F, 8.0F, 1, 1, 1, 0.001F, false));
		magazine.cubeList.add(new ModelBox(magazine, 35, 12, -1.0F, -2.0F, 0.0F, 1, 3, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 71, 19, -3.5F, 1.0F, 8.0F, 1, 8, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 30, 23, -1.0F, 1.0F, 4.0F, 1, 8, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 42, 0, -3.5F, 1.0F, 4.0F, 1, 8, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 85, 79, -1.1F, 1.0F, 5.0F, 1, 8, 3, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 32, 94, -3.4F, 1.0F, 5.0F, 1, 8, 3, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 18, 29, -1.0F, 1.0F, 6.0F, 1, 8, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 30, 0, -3.5F, 1.0F, 6.0F, 1, 8, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 73, 67, -1.0F, 9.0F, 8.0F, 1, 4, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 24, 12, -2.75F, 9.0F, 0.0F, 2, 4, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 24, 23, -1.25F, 9.0F, 2.75F, 1, 4, 2, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 24, 0, -3.25F, 9.0F, 2.75F, 1, 4, 2, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 36, 0, -2.75F, 8.0F, 9.0F, 2, 5, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 71, 19, -3.5F, 9.0F, 8.0F, 1, 4, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 30, 23, -1.0F, 9.0F, 4.0F, 1, 4, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 42, 0, -3.5F, 9.0F, 4.0F, 1, 4, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 85, 79, -1.1F, 9.0F, 5.0F, 1, 4, 3, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 32, 94, -3.4F, 9.0F, 5.0F, 1, 4, 3, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 18, 29, -1.0F, 9.0F, 6.0F, 1, 4, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 30, 0, -3.5F, 9.0F, 6.0F, 1, 4, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 42, 38, -3.5F, 0.2F, 8.0F, 1, 1, 1, 0.001F, false));
		magazine.cubeList.add(new ModelBox(magazine, 61, 11, -3.5F, -2.0F, 0.0F, 3, 3, 1, 0.001F, false));
		magazine.cubeList.add(new ModelBox(magazine, 0, 23, -3.0F, -8.0F, 0.5F, 2, 9, 7, 0.002F, false));
		magazine.cubeList.add(new ModelBox(magazine, 0, 48, -1.5F, -8.0F, 0.5F, 1, 9, 7, 0.001F, false));
		magazine.cubeList.add(new ModelBox(magazine, 35, 64, -2.25F, -8.0F, 6.6F, 1, 9, 3, 0.001F, false));
		magazine.cubeList.add(new ModelBox(magazine, 61, 19, -2.25F, -7.0F, 0.2F, 1, 7, 1, 0.001F, false));

		cube_r136 = new ModelRenderer(this);
		cube_r136.setRotationPoint(-0.5F, -8.0F, 7.5F);
		magazine.addChild(cube_r136);
		setRotationAngle(cube_r136, 0.0F, -0.2443F, 0.0F);
		cube_r136.cubeList.add(new ModelBox(cube_r136, 98, 46, -1.0F, 0.0F, 0.0F, 1, 9, 2, -0.001F, false));

		cube_r137 = new ModelRenderer(this);
		cube_r137.setRotationPoint(-3.0F, -8.0F, 7.5F);
		magazine.addChild(cube_r137);
		setRotationAngle(cube_r137, 0.0F, 0.2443F, 0.0F);
		cube_r137.cubeList.add(new ModelBox(cube_r137, 98, 62, 0.0F, 0.0F, 0.0F, 1, 9, 2, 0.0F, false));

		cube_r138 = new ModelRenderer(this);
		cube_r138.setRotationPoint(-0.5F, -6.4F, 5.5F);
		magazine.addChild(cube_r138);
		setRotationAngle(cube_r138, 0.0F, 0.0F, -0.2094F);
		cube_r138.cubeList.add(new ModelBox(cube_r138, 9, 48, -1.0F, 0.0F, 0.0F, 1, 2, 3, 0.001F, false));

		cube_r139 = new ModelRenderer(this);
		cube_r139.setRotationPoint(-3.5F, 1.9F, 1.0F);
		magazine.addChild(cube_r139);
		setRotationAngle(cube_r139, -0.2618F, 0.0F, 0.0F);
		cube_r139.cubeList.add(new ModelBox(cube_r139, 98, 27, 0.0F, 2.0F, 4.0F, 1, 1, 4, -0.001F, false));
		cube_r139.cubeList.add(new ModelBox(cube_r139, 98, 22, 2.5F, 2.0F, 4.0F, 1, 1, 4, -0.001F, false));
		cube_r139.cubeList.add(new ModelBox(cube_r139, 98, 27, 0.0F, 5.8637F, 5.0353F, 1, 1, 4, -0.001F, false));
		cube_r139.cubeList.add(new ModelBox(cube_r139, 98, 22, 2.5F, 5.8637F, 5.0353F, 1, 1, 4, -0.001F, false));

		cube_r140 = new ModelRenderer(this);
		cube_r140.setRotationPoint(-3.1F, 1.9F, 1.0F);
		magazine.addChild(cube_r140);
		setRotationAngle(cube_r140, -0.2628F, -0.0843F, 0.0226F);
		cube_r140.cubeList.add(new ModelBox(cube_r140, 11, 39, 0.0F, 2.0F, 0.0F, 1, 1, 4, -0.001F, false));
		cube_r140.cubeList.add(new ModelBox(cube_r140, 11, 39, 0.0901F, 5.8637F, 1.0315F, 1, 1, 4, -0.001F, false));

		cube_r141 = new ModelRenderer(this);
		cube_r141.setRotationPoint(-0.4F, 1.9F, 1.0F);
		magazine.addChild(cube_r141);
		setRotationAngle(cube_r141, -0.2628F, 0.0843F, -0.0226F);
		cube_r141.cubeList.add(new ModelBox(cube_r141, 81, 53, -1.0F, 2.0F, 0.0F, 1, 1, 4, -0.001F, false));
		cube_r141.cubeList.add(new ModelBox(cube_r141, 81, 53, -1.0901F, 5.8637F, 1.0315F, 1, 1, 4, -0.001F, false));

		cube_r142 = new ModelRenderer(this);
		cube_r142.setRotationPoint(-3.5F, -2.0F, 1.0F);
		magazine.addChild(cube_r142);
		setRotationAngle(cube_r142, -0.2618F, 0.0F, 0.0F);
		cube_r142.cubeList.add(new ModelBox(cube_r142, 49, 48, 0.0F, 0.0F, 0.0F, 1, 3, 8, -0.001F, false));
		cube_r142.cubeList.add(new ModelBox(cube_r142, 51, 0, 2.5F, 0.0F, 0.0F, 1, 3, 8, -0.001F, false));

		cube_r143 = new ModelRenderer(this);
		cube_r143.setRotationPoint(-3.5F, -2.0F, 1.0F);
		magazine.addChild(cube_r143);
		setRotationAngle(cube_r143, -0.2302F, 0.1258F, 0.4916F);
		cube_r143.cubeList.add(new ModelBox(cube_r143, 51, 19, 0.0F, -2.0F, 0.0F, 1, 2, 8, -0.001F, false));

		cube_r144 = new ModelRenderer(this);
		cube_r144.setRotationPoint(0.0F, -2.0F, 1.0F);
		magazine.addChild(cube_r144);
		setRotationAngle(cube_r144, -0.2302F, -0.1258F, -0.4916F);
		cube_r144.cubeList.add(new ModelBox(cube_r144, 0, 67, -1.0F, -2.0F, 0.0F, 1, 2, 8, -0.001F, false));

		cube_r145 = new ModelRenderer(this);
		cube_r145.setRotationPoint(-3.5F, 0.2F, 9.0F);
		magazine.addChild(cube_r145);
		setRotationAngle(cube_r145, 0.0F, 0.925F, 0.0F);
		cube_r145.cubeList.add(new ModelBox(cube_r145, 6, 0, 0.0F, 0.0F, 0.0F, 1, 9, 1, 0.0F, false));
		cube_r145.cubeList.add(new ModelBox(cube_r145, 6, 0, 0.0F, 8.0F, 0.0F, 1, 5, 1, 0.0F, false));

		cube_r146 = new ModelRenderer(this);
		cube_r146.setRotationPoint(0.0F, 0.2F, 9.0F);
		magazine.addChild(cube_r146);
		setRotationAngle(cube_r146, 0.0F, -0.925F, 0.0F);
		cube_r146.cubeList.add(new ModelBox(cube_r146, 18, 0, -1.0F, 0.0F, 0.0F, 1, 9, 1, 0.0F, false));
		cube_r146.cubeList.add(new ModelBox(cube_r146, 18, 0, -1.0F, 8.0F, 0.0F, 1, 5, 1, 0.0F, false));

		cube_r147 = new ModelRenderer(this);
		cube_r147.setRotationPoint(-3.5F, 1.0F, 4.0F);
		magazine.addChild(cube_r147);
		setRotationAngle(cube_r147, 0.0F, -0.5236F, 0.0F);
		cube_r147.cubeList.add(new ModelBox(cube_r147, 69, 67, 0.0F, 0.0F, -1.0F, 1, 8, 1, 0.0F, false));
		cube_r147.cubeList.add(new ModelBox(cube_r147, 69, 67, 0.0F, 4.0F, -1.0F, 1, 8, 1, 0.0F, false));

		cube_r148 = new ModelRenderer(this);
		cube_r148.setRotationPoint(0.0F, 1.0F, 4.0F);
		magazine.addChild(cube_r148);
		setRotationAngle(cube_r148, 0.0F, 0.5236F, 0.0F);
		cube_r148.cubeList.add(new ModelBox(cube_r148, 71, 0, -1.0F, 0.0F, -1.0F, 1, 8, 1, 0.0F, false));
		cube_r148.cubeList.add(new ModelBox(cube_r148, 71, 0, -1.0F, 8.0F, -1.0F, 1, 4, 1, 0.0F, false));

		cube_r149 = new ModelRenderer(this);
		cube_r149.setRotationPoint(-3.25F, 1.0F, 2.75F);
		magazine.addChild(cube_r149);
		setRotationAngle(cube_r149, 0.0F, -0.1571F, 0.0F);
		cube_r149.cubeList.add(new ModelBox(cube_r149, 0, 0, 0.0F, 0.0F, -2.0F, 1, 8, 2, 0.0F, false));
		cube_r149.cubeList.add(new ModelBox(cube_r149, 0, 0, 0.0F, 8.0F, -2.0F, 1, 4, 2, 0.0F, false));

		cube_r150 = new ModelRenderer(this);
		cube_r150.setRotationPoint(-0.25F, 1.0F, 2.75F);
		magazine.addChild(cube_r150);
		setRotationAngle(cube_r150, 0.0F, 0.1571F, 0.0F);
		cube_r150.cubeList.add(new ModelBox(cube_r150, 12, 0, -1.0F, 0.0F, -2.0F, 1, 8, 2, 0.0F, false));
		cube_r150.cubeList.add(new ModelBox(cube_r150, 12, 0, -1.0F, 8.0F, -2.0F, 1, 4, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		magazine.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}