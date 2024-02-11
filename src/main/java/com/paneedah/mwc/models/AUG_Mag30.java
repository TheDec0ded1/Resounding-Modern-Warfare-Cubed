package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AUG_Mag30 extends ModelBase {
	private final ModelRenderer magazine;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;

	public AUG_Mag30() {
		textureWidth = 128;
		textureHeight = 128;

		magazine = new ModelRenderer(this);
		magazine.setRotationPoint(0.0F, 24.0F, 0.0F);
		magazine.cubeList.add(new ModelBox(magazine, 14, 3, -2.9F, -27.0F, 10.1F, 3, 3, 8, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 0, 11, -2.9F, -30.0F, 10.1F, 3, 3, 8, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.4F, -23.3706F, 15.6192F);
		magazine.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.3054F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.5F, 12.5F, -4.3F, 3, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 25, -1.5F, 10.5F, -4.0F, 3, 3, 8, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.4F, -23.2706F, 14.6441F);
		magazine.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.2182F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -1.5F, 7.5F, -4.0F, 3, 3, 8, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1.4F, -23.1633F, 14.2891F);
		magazine.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.1745F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 28, 0, -1.5F, 4.5F, -4.0F, 3, 3, 8, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.4F, -23.0207F, 14.0685F);
		magazine.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.1309F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 22, -1.5F, 1.5F, -4.0F, 3, 3, 8, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.4F, -13.0548F, 12.4689F);
		magazine.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.3054F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 48, 13, 0.75F, 1.6716F, -4.3403F, 1, 1, 8, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 20, 47, -1.75F, 1.6716F, -4.3403F, 1, 1, 8, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-1.4F, -13.0548F, 12.4689F);
		magazine.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.2182F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 28, 20, 0.75F, 0.0716F, -4.1403F, 1, 1, 8, -0.1F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 4, 42, 0.75F, -1.9284F, 2.3597F, 1, 3, 1, -0.1F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 42, 0, 0.75F, -1.9284F, 0.3597F, 1, 3, 1, -0.1F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 42, 0.75F, -1.9284F, -1.6903F, 1, 3, 1, -0.1F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 41, 33, 0.75F, -1.9284F, -3.6403F, 1, 3, 1, -0.1F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 28, 11, -1.75F, 0.0716F, -4.1403F, 1, 1, 8, -0.1F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 41, 24, -1.75F, -1.9284F, -3.6403F, 1, 3, 1, -0.1F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 40, 39, -1.75F, -1.9284F, -1.6903F, 1, 3, 1, -0.1F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 24, 40, -1.75F, -1.9284F, 0.3597F, 1, 3, 1, -0.1F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 20, 40, -1.75F, -1.9284F, 2.3597F, 1, 3, 1, -0.1F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.4F, -16.7974F, 13.3054F);
		magazine.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.1745F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 10, 45, 0.75F, 2.1026F, -4.2141F, 1, 1, 8, -0.1F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 10, 45, 0.75F, 0.1026F, 2.2859F, 1, 3, 1, -0.1F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 44, 43, 0.75F, 0.1026F, 0.2859F, 1, 3, 1, -0.1F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 44, 39, 0.75F, 0.1026F, -1.7641F, 1, 3, 1, -0.1F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 40, 43, 0.75F, 0.1026F, -3.7141F, 1, 3, 1, -0.1F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 42, 3, -1.75F, 2.1026F, -4.2141F, 1, 1, 8, -0.1F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 34, 42, -1.75F, 0.1026F, -3.7141F, 1, 3, 1, -0.1F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 30, 42, -1.75F, 0.1026F, -1.7641F, 1, 3, 1, -0.1F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 42, 12, -1.75F, 0.1026F, 0.2859F, 1, 3, 1, -0.1F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 42, 4, -1.75F, 0.1026F, 2.2859F, 1, 3, 1, -0.1F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 34, 38, -1.75F, -1.8974F, 2.3609F, 1, 3, 1, -0.1F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 38, 30, -1.75F, -1.8974F, 0.3609F, 1, 3, 1, -0.1F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 30, 38, -1.75F, -1.8974F, -1.6891F, 1, 3, 1, -0.1F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 38, 21, -1.75F, -1.8974F, -3.6391F, 1, 3, 1, -0.1F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 42, -1.75F, 0.1026F, -4.1391F, 1, 1, 8, -0.1F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 38, 15, 0.75F, -1.8974F, -3.6391F, 1, 3, 1, -0.1F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 38, 11, 0.75F, -1.8974F, -1.6891F, 1, 3, 1, -0.1F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 4, 37, 0.75F, -1.8974F, 0.3609F, 1, 3, 1, -0.1F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 37, 0.75F, -1.8974F, 2.3609F, 1, 3, 1, -0.1F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 40, 40, 0.75F, 0.1026F, -4.1391F, 1, 1, 8, -0.1F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-1.4F, -20.4946F, 13.8102F);
		magazine.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.1309F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 24, 36, -1.75F, -0.066F, 2.443F, 1, 3, 1, -0.1F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 20, 36, -1.75F, -0.066F, 0.443F, 1, 3, 1, -0.1F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 13, 36, -1.75F, -0.066F, -1.607F, 1, 3, 1, -0.1F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 10, 33, -1.75F, -0.066F, -3.557F, 1, 3, 1, -0.1F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 30, 39, -1.75F, 1.934F, -4.057F, 1, 1, 8, -0.1F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 4, 33, 0.75F, -0.066F, -3.557F, 1, 3, 1, -0.1F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 33, 0.75F, -0.066F, -1.607F, 1, 3, 1, -0.1F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 32, 29, 0.75F, -0.066F, 0.443F, 1, 3, 1, -0.1F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 32, 14, 0.75F, -0.066F, 2.443F, 1, 3, 1, -0.1F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 38, 30, 0.75F, 1.934F, -4.057F, 1, 1, 8, -0.1F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 38, 21, -1.75F, -0.066F, -4.057F, 1, 1, 8, -0.1F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 32, 4, 0.75F, -2.066F, 2.443F, 1, 3, 1, -0.1F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 32, 0, 0.75F, -2.066F, 0.443F, 1, 3, 1, -0.1F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 28, 29, 0.75F, -2.066F, -3.557F, 1, 3, 1, -0.1F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 28, 14, 0.75F, -2.066F, -1.607F, 1, 3, 1, -0.1F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 20, 38, 0.75F, -0.066F, -4.057F, 1, 1, 8, -0.1F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 28, 4, -1.75F, -2.066F, -3.557F, 1, 3, 1, -0.1F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 28, 0, -1.75F, -2.066F, -1.607F, 1, 3, 1, -0.1F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 4, 26, -1.75F, -2.066F, 0.443F, 1, 3, 1, -0.1F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 26, -1.75F, -2.066F, 2.443F, 1, 3, 1, -0.1F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-1.4F, -22.8543F, 13.9845F);
		magazine.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.0873F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 38, 12, -1.75F, 0.5F, -4.0F, 1, 1, 8, -0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 18, 25, 0.75F, -1.5F, 2.5F, 1, 3, 1, -0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 14, 25, 0.75F, -1.5F, 0.5F, 1, 3, 1, -0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 4, 22, 0.75F, -1.5F, -3.5F, 1, 3, 1, -0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 22, 0.75F, -1.5F, -1.55F, 1, 3, 1, -0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 10, 36, 0.75F, 0.5F, -4.0F, 1, 1, 8, -0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 18, 14, -1.75F, -1.5F, -3.5F, 1, 3, 1, -0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 18, 4, -1.75F, -1.5F, -1.55F, 1, 3, 1, -0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 18, 0, -1.75F, -1.5F, 0.5F, 1, 3, 1, -0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 4, 15, -1.75F, -1.5F, 2.5F, 1, 3, 1, -0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 33, -1.75F, -1.5F, -4.0F, 1, 1, 8, -0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 15, 0.75F, -3.5F, 2.5F, 1, 3, 1, -0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 14, 14, 0.75F, -3.5F, 0.5F, 1, 3, 1, -0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 14, 4, 0.75F, -3.5F, -1.55F, 1, 3, 1, -0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 14, 0, 0.75F, -3.5F, -3.5F, 1, 3, 1, -0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 4, 11, -1.75F, -3.5F, -1.55F, 1, 3, 1, -0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 11, -1.75F, -3.5F, 0.5F, 1, 3, 1, -0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 4, 2, -1.75F, -3.5F, 2.5F, 1, 3, 1, -0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 2, -1.75F, -3.5F, -3.5F, 1, 3, 1, -0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 28, 29, 0.75F, -1.5F, -4.0F, 1, 1, 8, -0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 48, 22, -1.75F, -3.5F, -4.2F, 1, 1, 8, -0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 30, 48, 0.75F, -3.5F, -4.2F, 1, 1, 8, -0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 14, 14, -1.5F, -1.5F, -4.0F, 3, 3, 8, 0.0F, false));
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