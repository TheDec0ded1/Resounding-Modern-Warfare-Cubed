package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class NGSWRSilencer extends ModelBase {
	private final ModelRenderer suppressor;
	private final ModelRenderer bone4;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer bone7;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;

	public NGSWRSilencer() {
		textureWidth = 256;
		textureHeight = 256;

		suppressor = new ModelRenderer(this);
		suppressor.setRotationPoint(0.0F, 26.1F, 0.0F);
		suppressor.cubeList.add(new ModelBox(suppressor, 61, 79, -2.5F, -43.0F, -72.5F, 2, 1, 4, 0.0F, false));
		suppressor.cubeList.add(new ModelBox(suppressor, 61, 79, -2.5F, -39.3869F, -72.5F, 2, 1, 4, 0.0F, false));
		suppressor.cubeList.add(new ModelBox(suppressor, 29, 77, -2.5F, -43.0F, -88.5F, 2, 1, 16, 0.0F, false));
		suppressor.cubeList.add(new ModelBox(suppressor, 29, 77, -2.5F, -39.3869F, -88.5F, 2, 1, 16, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, -2.1F, 0.0F);
		suppressor.addChild(bone4);
		bone4.cubeList.add(new ModelBox(bone4, 30, 29, -0.1934F, -39.5934F, -72.5F, 1, 2, 4, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 47, 151, -0.1934F, -39.5934F, -88.5F, 1, 2, 16, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-0.0381F, -40.0554F, -68.0F);
		bone4.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.0F, 1.5708F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-11.6837F, 39.8389F, 68.0F);
		bone3.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.3927F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 97, 17, -2.5F, -43.0F, -88.5F, 1, 1, 16, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 36, 15, -2.5F, -43.0F, -72.5F, 1, 1, 4, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-35.767F, 17.3793F, 68.0F);
		bone3.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 1.1781F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 29, 123, -1.5F, -43.0F, -88.5F, 1, 1, 16, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 63, 79, -1.5F, -43.0F, -72.5F, 1, 1, 4, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-14.6457F, -0.2165F, 0.0F);
		bone4.addChild(bone2);
		

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-24.0832F, -22.4596F, -5.5F);
		bone2.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 1.1781F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 97, 17, -1.5F, -43.0F, -83.0F, 1, 1, 16, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 36, 13, -1.5F, -43.0F, -67.0F, 1, 1, 4, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, -5.5F);
		bone2.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.3927F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 53, 2, -2.5F, -43.0F, -83.0F, 1, 1, 16, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 63, 40, -2.5F, -43.0F, -67.0F, 1, 1, 4, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.3066F, -40.6934F, -68.0F);
		suppressor.addChild(bone5);
		setRotationAngle(bone5, 0.0F, 0.0F, -3.1416F);
		bone5.cubeList.add(new ModelBox(bone5, 81, 128, 3.1131F, -1.0F, -4.5F, 1, 2, 4, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 47, 151, 3.1131F, -1.0F, -20.5F, 1, 2, 16, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-0.3446F, -1.4619F, 0.0F);
		bone5.addChild(bone6);
		setRotationAngle(bone6, 0.0F, 0.0F, 1.5708F);
		

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-11.6837F, 36.2258F, 68.0F);
		bone6.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.3927F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 29, 77, -2.5F, -43.0F, -88.5F, 1, 1, 16, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 61, 79, -2.5F, -43.0F, -72.5F, 1, 1, 4, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-35.767F, 13.7661F, 68.0F);
		bone6.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 1.1781F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 80, 29, -1.5F, -43.0F, -88.5F, 1, 1, 16, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 36, 13, -1.5F, -43.0F, -72.5F, 1, 1, 4, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-14.9523F, 38.377F, 68.0F);
		bone5.addChild(bone7);
		

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(3.6131F, 0.0F, 0.0F);
		bone7.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.3927F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 53, 21, -2.5F, -43.0F, -88.5F, 1, 1, 16, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 63, 40, -2.5F, -43.0F, -72.5F, 1, 1, 4, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-20.4701F, -22.4596F, 0.0F);
		bone7.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 1.1781F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 53, 21, -1.5F, -43.0F, -88.5F, 1, 1, 16, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 73, 32, -1.5F, -43.0F, -72.5F, 1, 1, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		suppressor.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}