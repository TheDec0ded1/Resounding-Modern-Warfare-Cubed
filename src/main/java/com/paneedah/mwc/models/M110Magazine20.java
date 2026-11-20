package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M110Magazine20 extends ModelBase {
	private final ModelRenderer magazine20;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;

	public M110Magazine20() {
		textureWidth = 544;
		textureHeight = 544;

		magazine20 = new ModelRenderer(this);
		magazine20.setRotationPoint(0.25F, -2.4F, -22.7F);
		magazine20.cubeList.add(new ModelBox(magazine20, 156, 319, -1.0F, -9.0F, -1.0F, 1, 17, 2, 0.0F, false));
		magazine20.cubeList.add(new ModelBox(magazine20, 366, 411, -3.25F, -9.001F, 0.9F, 3, 18, 6, 0.0F, false));
		magazine20.cubeList.add(new ModelBox(magazine20, 300, 377, -3.25F, -9.001F, -1.1F, 3, 17, 2, 0.0F, false));
		magazine20.cubeList.add(new ModelBox(magazine20, 166, 178, -3.251F, -9.002F, 6.4F, 3, 18, 2, 0.0F, false));
		magazine20.cubeList.add(new ModelBox(magazine20, 150, 394, -1.0F, -9.0F, 2.75F, 1, 18, 1, 0.0F, false));
		magazine20.cubeList.add(new ModelBox(magazine20, 262, 448, -1.0F, -8.9F, 4.5F, 1, 18, 1, 0.0F, false));
		magazine20.cubeList.add(new ModelBox(magazine20, 384, 411, -1.0F, -9.0F, 6.5F, 1, 19, 1, 0.0F, false));
		magazine20.cubeList.add(new ModelBox(magazine20, 132, 428, -0.8F, -9.0F, 7.8F, 1, 19, 1, -0.2F, false));
		magazine20.cubeList.add(new ModelBox(magazine20, 64, 520, -0.799F, 8.9F, 7.799F, 1, 2, 1, -0.2F, false));
		magazine20.cubeList.add(new ModelBox(magazine20, 136, 428, -3.7F, -9.0F, 7.8F, 1, 19, 1, -0.2F, false));
		magazine20.cubeList.add(new ModelBox(magazine20, 68, 520, -3.701F, 8.9F, 7.799F, 1, 2, 1, -0.2F, false));
		magazine20.cubeList.add(new ModelBox(magazine20, 144, 394, -3.5F, -9.0F, -1.0F, 1, 17, 2, 0.0F, false));
		magazine20.cubeList.add(new ModelBox(magazine20, 496, 514, -3.5F, -9.0F, 1.0F, 1, 1, 2, 0.0F, false));
		magazine20.cubeList.add(new ModelBox(magazine20, 502, 514, -1.0F, -9.0F, 1.0F, 1, 1, 2, 0.0F, false));
		magazine20.cubeList.add(new ModelBox(magazine20, 362, 444, -3.5F, -9.0F, 2.75F, 1, 18, 1, 0.0F, false));
		magazine20.cubeList.add(new ModelBox(magazine20, 266, 448, -3.5F, -8.9F, 4.5F, 1, 18, 1, 0.0F, false));
		magazine20.cubeList.add(new ModelBox(magazine20, 140, 428, -3.5F, -9.0F, 6.5F, 1, 19, 1, 0.0F, false));
		magazine20.cubeList.add(new ModelBox(magazine20, 156, 301, -3.25F, -7.0F, 8.15F, 3, 17, 1, 0.0F, false));
		magazine20.cubeList.add(new ModelBox(magazine20, 344, 168, -3.249F, 9.7F, 8.149F, 3, 1, 1, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-2.5F, 9.0F, 0.0F);
		magazine20.addChild(cube_r16);
		setRotationAngle(cube_r16, 1.3788F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 376, 520, -0.998F, 6.5F, -0.001F, 1, 1, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 412, 514, -0.999F, 2.8F, 0.0F, 1, 4, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 72, 520, -0.999F, -1.0F, 0.0F, 1, 2, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 520, 377, 1.502F, 6.5F, -0.001F, 1, 1, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 514, 413, 1.501F, 2.8F, 0.0F, 1, 4, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 346, 254, -0.748F, 7.5F, -0.001F, 3, 1, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 166, 198, -0.749F, -1.0F, -0.002F, 3, 9, 2, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 76, 520, 1.501F, -1.0F, 0.0F, 1, 2, 1, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-3.3F, -6.0F, 7.4F);
		magazine20.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, 0.3491F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 272, 438, -1.0262F, -3.819F, -4.001F, 1, 1, 5, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-0.2F, -6.0F, 7.4F);
		magazine20.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, -0.3491F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 352, 463, 0.0262F, -3.819F, -4.001F, 1, 1, 5, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-3.5F, -6.0F, 6.5F);
		magazine20.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, 0.3491F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 520, 379, -1.0262F, -3.819F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.0F, -6.0F, 6.5F);
		magazine20.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, -0.3491F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 380, 520, 0.0262F, -3.819F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-3.5F, -5.9F, 4.5F);
		magazine20.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, 0.3491F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 384, 520, -1.0262F, -3.819F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(0.0F, -5.9F, 4.5F);
		magazine20.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, -0.3491F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 388, 520, 0.0262F, -3.819F, 0.0F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		magazine20.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}