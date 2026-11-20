package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.10.0
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class RPK74MMag extends ModelBase {
	private final ModelRenderer mag;
	private final ModelRenderer bone5;
	private final ModelRenderer cube_r4;
	private final ModelRenderer bone7;
	private final ModelRenderer cube_r120;
	private final ModelRenderer bone8;
	private final ModelRenderer cube_r3;
	private final ModelRenderer bone9;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r121_r1;
	private final ModelRenderer bone2;
	private final ModelRenderer bone8_r1;

	public RPK74MMag() {
		textureWidth = 64;
		textureHeight = 64;

		mag = new ModelRenderer(this);
		mag.setRotationPoint(0.0F, 23.7F, 0.1F);
		

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-1.5F, -28.6927F, -23.9674F);
		mag.addChild(bone5);
		setRotationAngle(bone5, -0.1745F, 0.0F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 18, 32, -1.5F, -2.6593F, -2.7842F, 3, 6, 2, -0.001F, false));
		bone5.cubeList.add(new ModelBox(bone5, 15, 19, -2.0F, -2.6593F, -1.5342F, 4, 6, 7, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -4.6314F, 0.0702F);
		bone5.addChild(cube_r4);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 9, 0, -2.2F, 2.2774F, 4.3008F, 1, 5, 1, -0.002F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 3, 5, -2.2F, 4.5774F, -0.4492F, 1, 1, 5, -0.003F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 28, 36, -2.1F, 3.0774F, -2.9492F, 1, 1, 2, -0.2F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 27, -2.2F, 3.0774F, -1.6992F, 1, 1, 4, -0.003F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 12, 1.1F, 3.0774F, -2.9492F, 1, 1, 2, -0.2F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 22, 23, 1.2F, 3.0774F, -1.6992F, 1, 1, 4, -0.003F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 2, 16, 1.2F, 4.5774F, -0.4492F, 1, 1, 5, -0.003F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 24, 11, 1.2F, 2.2774F, 4.3008F, 1, 5, 1, -0.002F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-1.5F, -28.6927F, -23.9674F);
		mag.addChild(bone7);
		setRotationAngle(bone7, -0.3054F, 0.0F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 8, 32, -1.5F, 2.5987F, -2.8949F, 3, 6, 2, 0.001F, false));
		bone7.cubeList.add(new ModelBox(bone7, 15, 6, -2.0F, 2.5987F, -1.1449F, 4, 6, 7, 0.001F, false));

		bone8_r1 = new ModelRenderer(this);
		bone8_r1.setRotationPoint(0.0F, 2.5052F, -2.1934F);
		bone7.addChild(bone8_r1);
		setRotationAngle(bone8_r1, -0.6545F, 0.0F, 0.0F);
		bone8_r1.cubeList.add(new ModelBox(bone8_r1, 9, 33, -1.5F, -0.5F, -0.5F, 3, 1, 1, 0.001F, false));

		cube_r120 = new ModelRenderer(this);
		cube_r120.setRotationPoint(0.0F, 5.4686F, 0.9702F);
		bone7.addChild(cube_r120);
		cube_r120.cubeList.add(new ModelBox(cube_r120, 0, 13, -2.1F, 1.95F, -3.55F, 1, 1, 2, -0.2F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 19, 11, -2.2F, 1.95F, -2.3F, 1, 1, 4, -0.003F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 5, 18, -2.2F, 3.45F, -1.05F, 1, 1, 5, -0.003F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 2, 19, -2.2F, 0.45F, -1.05F, 1, 1, 5, -0.003F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 10, 1, -2.2F, -3.55F, 3.7F, 1, 8, 1, -0.002F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 19, 11, -2.2F, -2.55F, -1.05F, 1, 1, 5, -0.003F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 15, 27, -2.2F, -1.05F, -2.3F, 1, 1, 4, -0.003F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 28, 36, -2.1F, -1.05F, -3.55F, 1, 1, 2, -0.2F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 15, 3, -2.1F, -4.05F, -3.55F, 1, 1, 2, -0.2F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 5, 19, -2.2F, -4.05F, -2.3F, 1, 1, 4, -0.003F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 5, 18, 1.2F, 1.95F, -2.3F, 1, 1, 4, -0.003F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 19, 12, 1.2F, 3.45F, -1.05F, 1, 1, 5, -0.003F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 4, 19, 1.2F, -1.05F, -2.3F, 1, 1, 4, -0.003F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 3, 4, 1.2F, 0.45F, -1.05F, 1, 1, 5, -0.003F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 0, 34, 1.1F, 1.95F, -3.55F, 1, 1, 2, -0.2F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 15, 0, 1.1F, -1.05F, -3.55F, 1, 1, 2, -0.2F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 0, 13, 1.1F, -4.05F, -3.55F, 1, 1, 2, -0.2F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 5, 6, 1.2F, -4.05F, -2.3F, 1, 1, 4, -0.003F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 3, 5, 1.2F, -2.55F, -1.05F, 1, 1, 5, -0.003F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 9, 4, 1.2F, -3.55F, 3.7F, 1, 8, 1, -0.002F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-3.1883F, -23.3512F, -24.1008F);
		mag.addChild(bone8);
		setRotationAngle(bone8, -0.4363F, 0.0F, 0.0F);
		bone8.cubeList.add(new ModelBox(bone8, 30, 0, 0.1883F, 2.8635F, -3.9591F, 3, 6, 2, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 0, 13, -0.3117F, 2.8635F, -2.2091F, 4, 6, 7, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(1.6883F, 2.0271F, 0.2036F);
		bone8.addChild(cube_r3);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 9, 0, -2.2F, 2.1653F, 3.5761F, 1, 5, 1, -0.002F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 3, 5, -2.2F, 5.1653F, -1.1739F, 1, 1, 5, -0.003F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 28, 36, -2.1F, 3.6653F, -3.6739F, 1, 1, 2, -0.2F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 27, -2.2F, 3.6653F, -2.4239F, 1, 1, 4, -0.003F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 12, 1.1F, 3.6653F, -3.6739F, 1, 1, 2, -0.2F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 22, 23, 1.2F, 3.6653F, -2.4239F, 1, 1, 4, -0.003F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 2, 16, 1.2F, 5.1653F, -1.1739F, 1, 1, 5, -0.003F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 24, 11, 1.2F, 2.1653F, 3.5761F, 1, 5, 1, -0.002F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-3.1883F, -17.745F, -25.2985F);
		mag.addChild(bone9);
		setRotationAngle(bone9, -0.6545F, 0.0F, 0.0F);
		bone9.cubeList.add(new ModelBox(bone9, 0, 26, 0.1883F, 2.4396F, -4.6169F, 3, 6, 2, 0.001F, false));
		bone9.cubeList.add(new ModelBox(bone9, 0, 0, -0.3117F, 2.4396F, -2.8669F, 4, 6, 7, 0.001F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.6883F, 0.4209F, 9.4013F);
		bone9.addChild(cube_r2);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -2.1F, 9.8385F, -13.458F, 1, 1, 2, -0.2F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 116, 70, -2.2F, 9.8385F, -12.208F, 1, 1, 4, -0.003F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 19, -2.2F, 11.3385F, -10.958F, 1, 1, 5, -0.003F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 11, 11, -2.2F, 8.3385F, -10.958F, 1, 1, 5, -0.003F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 9, 15, -2.2F, 2.3385F, -6.208F, 1, 10, 1, -0.002F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 5, 17, -2.2F, 5.3385F, -10.958F, 1, 1, 5, -0.003F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 19, 27, -2.2F, 6.8385F, -12.208F, 1, 1, 4, -0.003F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 29, -2.1F, 6.8385F, -13.458F, 1, 1, 2, -0.2F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 37, -2.1F, 3.8385F, -13.458F, 1, 1, 2, -0.2F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 9, 34, -2.2F, 3.8385F, -12.208F, 1, 1, 4, -0.003F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 3, 17, 1.2F, 9.8385F, -12.208F, 1, 1, 4, -0.003F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 4, 18, 1.2F, 11.3385F, -10.958F, 1, 1, 5, -0.003F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 3, 16, 1.2F, 6.8385F, -12.208F, 1, 1, 4, -0.003F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 5, 17, 1.2F, 8.3385F, -10.958F, 1, 1, 5, -0.003F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 34, 20, 1.1F, 9.8385F, -13.458F, 1, 1, 2, -0.2F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 15, 3, 1.1F, 6.8385F, -13.458F, 1, 1, 2, -0.2F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 34, 20, 1.1F, 3.8385F, -13.458F, 1, 1, 2, -0.2F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 3, 5, 1.2F, 3.8385F, -12.208F, 1, 1, 4, -0.003F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 5, 17, 1.2F, 5.3385F, -10.958F, 1, 1, 5, -0.003F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 24, 8, 1.2F, 2.3385F, -6.208F, 1, 10, 1, -0.002F, false));

		cube_r121_r1 = new ModelRenderer(this);
		cube_r121_r1.setRotationPoint(-0.05F, 12.9918F, -6.1126F);
		cube_r2.addChild(cube_r121_r1);
		setRotationAngle(cube_r121_r1, -0.48F, 0.0F, 0.0F);
		cube_r121_r1.cubeList.add(new ModelBox(cube_r121_r1, 40, 27, -2.15F, -1.0F, -0.5F, 1, 2, 1, -0.002F, false));
		cube_r121_r1.cubeList.add(new ModelBox(cube_r121_r1, 23, 36, 1.25F, -1.0F, -0.5F, 1, 2, 1, -0.002F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-3.1883F, -5.745F, -25.2985F);
		mag.addChild(bone2);
		setRotationAngle(bone2, -0.7854F, 0.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 0, 26, 0.1883F, -0.6555F, -12.0358F, 3, 6, 2, 0.001F, false));
		bone2.cubeList.add(new ModelBox(bone2, 0, 0, -0.3117F, -0.6555F, -10.2858F, 4, 6, 7, 0.001F, false));
		bone2.cubeList.add(new ModelBox(bone2, 29, 24, -0.3117F, 5.2445F, -11.3858F, 4, 1, 8, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 36, 31, -0.3117F, 5.2445F, -12.0858F, 4, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		mag.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}