package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FiveSevenDrumMagazine extends ModelBase {
	private final ModelRenderer magazine;
	private final ModelRenderer cube_r32;
	private final ModelRenderer bone;
	private final ModelRenderer bone3;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;

	public FiveSevenDrumMagazine() {
		textureWidth = 128;
		textureHeight = 128;

		magazine = new ModelRenderer(this);
		magazine.setRotationPoint(0.0F, 8.0F, 3.0F);
		magazine.cubeList.add(new ModelBox(magazine, 23, 35, -3.5F, -1.1F, -6.3F, 4, 1, 8, 0.001F, false));
		magazine.cubeList.add(new ModelBox(magazine, 83, 104, -4.0F, -0.1F, -6.3F, 5, 12, 8, 0.001F, false));
		magazine.cubeList.add(new ModelBox(magazine, 90, 111, -2.0F, 4.4074F, -7.3F, 1, 3, 1, 0.001F, false));
		magazine.cubeList.add(new ModelBox(magazine, 90, 111, -2.0F, 6.65F, -7.3F, 1, 3, 1, 0.001F, false));
		magazine.cubeList.add(new ModelBox(magazine, 90, 111, -1.8787F, 6.5287F, -7.3F, 3, 1, 1, 0.001F, false));
		magazine.cubeList.add(new ModelBox(magazine, 90, 111, -4.1213F, 6.5287F, -7.3F, 3, 1, 1, 0.001F, false));
		magazine.cubeList.add(new ModelBox(magazine, 83, 104, 0.6193F, 4.5233F, -6.298F, 2, 5, 8, 0.001F, false));
		magazine.cubeList.add(new ModelBox(magazine, 83, 104, -5.6193F, 4.5233F, -6.298F, 2, 5, 8, 0.001F, false));
		magazine.cubeList.add(new ModelBox(magazine, 83, 104, 1.0F, 1.9F, -6.3F, 2, 2, 8, 0.001F, false));
		magazine.cubeList.add(new ModelBox(magazine, 94, 110, -6.0F, 1.9F, -6.3F, 2, 2, 8, 0.001F, false));
		magazine.cubeList.add(new ModelBox(magazine, 83, 104, 1.0F, 10.15F, -6.3F, 2, 2, 8, 0.001F, false));
		magazine.cubeList.add(new ModelBox(magazine, 94, 110, -6.0F, 10.15F, -6.3F, 2, 2, 8, 0.001F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(-2.25F, -1.1F, -0.3F);
		magazine.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.2094F, 0.0F, 0.0F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 45, 0, -0.25F, -13.0F, -0.3F, 2, 14, 1, 0.002F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 23, 48, -0.75F, -13.0F, -5.5F, 3, 13, 1, 0.002F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 0, -1.0F, -13.0F, -5.0F, 3, 13, 5, 0.0F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 31, 0, 1.5F, -13.0F, -5.0F, 1, 13, 5, 0.001F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 4.0F, 0.0F);
		magazine.addChild(bone);
		setRotationAngle(bone, 0.0F, 0.0F, -0.2618F);
		bone.cubeList.add(new ModelBox(bone, 93, 106, 0.0283F, -3.7022F, -6.299F, 2, 3, 8, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-5.0F, 4.0F, 0.0F);
		magazine.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.0F, 0.2618F);
		bone3.cubeList.add(new ModelBox(bone3, 93, 106, -0.0965F, -4.2198F, -6.299F, 2, 3, 8, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, -0.5F, 0.0F);
		magazine.addChild(bone2);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(3.1255F, 2.6203F, 6.699F);
		bone2.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 86, 103, -8.95F, -1.3F, -14.0F, 2, 3, 8, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.6275F, 4.615F, -5.299F);
		bone2.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 86, 103, -8.95F, -1.3F, -1.0F, 1, 3, 8, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-0.8222F, 6.5681F, 2.699F);
		bone2.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.7854F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 86, 103, -0.95F, -1.3F, -10.0F, 2, 3, 8, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.6758F, 4.5627F, -5.299F);
		bone2.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 86, 103, 0.05F, -1.3F, -1.0F, 1, 3, 8, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, -0.5F, 2.0F);
		magazine.addChild(bone4);
		

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.8242F, 7.9823F, -2.301F);
		bone4.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.7854F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 92, 110, -0.95F, -2.3F, -7.0F, 3, 2, 8, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-8.6004F, 1.2061F, -2.301F);
		bone4.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 92, 110, -0.95F, 9.7F, -7.0F, 3, 2, 8, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-7.1024F, 3.2007F, -7.299F);
		bone4.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 92, 110, -0.95F, 10.7F, -1.0F, 3, 1, 8, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-6.1507F, 3.1485F, -7.299F);
		bone4.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 92, 110, -0.95F, 1.7F, -1.0F, 3, 1, 8, 0.0F, false));
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