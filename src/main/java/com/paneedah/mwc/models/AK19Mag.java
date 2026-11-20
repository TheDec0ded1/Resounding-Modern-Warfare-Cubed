package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AK19Mag extends ModelBase {
	private final ModelRenderer ak19Magazine;
	private final ModelRenderer magBody;
	private final ModelRenderer Magazine1;
	private final ModelRenderer Magazine2;
	private final ModelRenderer Magazine3;
	private final ModelRenderer Magazine5_r1;
	private final ModelRenderer Magazine4;
	private final ModelRenderer Magazine5;
	private final ModelRenderer Magazine6;
	private final ModelRenderer Magazine7;
	private final ModelRenderer Magazine8;
	private final ModelRenderer bone13;
	private final ModelRenderer bone2;
	private final ModelRenderer bone4;
	private final ModelRenderer bone3;

	public AK19Mag() {
		textureWidth = 192;
		textureHeight = 192;

		ak19Magazine = new ModelRenderer(this);
		ak19Magazine.setRotationPoint(0.0F, 24.0F, 0.0F);
		ak19Magazine.cubeList.add(new ModelBox(ak19Magazine, 51, 156, -0.5F, -32.6627F, -23.0229F, 1, 2, 5, 0.0F, false));
		ak19Magazine.cubeList.add(new ModelBox(ak19Magazine, 0, 157, -3.5F, -32.6627F, -23.0229F, 1, 2, 5, 0.0F, false));
		ak19Magazine.cubeList.add(new ModelBox(ak19Magazine, 161, 6, -2.5F, -31.6627F, -19.0229F, 2, 1, 1, 0.0F, false));

		magBody = new ModelRenderer(this);
		magBody.setRotationPoint(0.0F, -5.0F, 5.25F);
		ak19Magazine.addChild(magBody);
		setRotationAngle(magBody, 0.1745F, 0.0F, 0.0F);
		

		Magazine1 = new ModelRenderer(this);
		Magazine1.setRotationPoint(-3.5F, -32.0F, -25.0F);
		magBody.addChild(Magazine1);
		setRotationAngle(Magazine1, -0.1859F, 0.0F, 0.0F);
		Magazine1.cubeList.add(new ModelBox(Magazine1, 113, 75, 0.0F, 0.0F, 0.0F, 4, 6, 7, 0.0F, false));
		Magazine1.cubeList.add(new ModelBox(Magazine1, 155, 140, 0.0F, 1.0F, -2.6F, 4, 2, 3, -0.2F, false));
		Magazine1.cubeList.add(new ModelBox(Magazine1, 126, 152, 0.0F, 2.0F, -2.6F, 4, 4, 3, -0.4F, false));
		Magazine1.cubeList.add(new ModelBox(Magazine1, 155, 146, 0.0F, 4.5F, -2.6F, 4, 2, 3, -0.2F, false));

		Magazine2 = new ModelRenderer(this);
		Magazine2.setRotationPoint(-1.5F, -27.4704F, -61.506F);
		magBody.addChild(Magazine2);
		setRotationAngle(Magazine2, -1.7895F, 0.0F, 0.0F);
		Magazine2.cubeList.add(new ModelBox(Magazine2, 54, 114, -2.0F, -41.8468F, -6.5742F, 4, 7, 6, 0.0F, false));
		Magazine2.cubeList.add(new ModelBox(Magazine2, 126, 160, -2.0F, -35.3468F, -4.4242F, 4, 3, 2, -0.2F, false));
		Magazine2.cubeList.add(new ModelBox(Magazine2, 136, 79, -2.0F, -35.3468F, -6.9242F, 4, 3, 6, -0.4F, false));

		Magazine3 = new ModelRenderer(this);
		Magazine3.setRotationPoint(-1.5F, -17.3361F, -67.8767F);
		magBody.addChild(Magazine3);
		setRotationAngle(Magazine3, -2.0045F, 0.0F, 0.0F);
		Magazine3.cubeList.add(new ModelBox(Magazine3, 0, 145, -2.0F, -42.7955F, -15.387F, 4, 7, 4, 0.0F, false));
		Magazine3.cubeList.add(new ModelBox(Magazine3, 101, 161, -2.0F, -41.7955F, -11.387F, 4, 6, 1, 0.0F, false));
		Magazine3.cubeList.add(new ModelBox(Magazine3, 159, 108, -2.0F, -36.2955F, -12.587F, 4, 3, 2, -0.2F, false));
		Magazine3.cubeList.add(new ModelBox(Magazine3, 165, 27, -2.0F, -39.7955F, -10.387F, 4, 4, 1, 0.1F, false));

		Magazine5_r1 = new ModelRenderer(this);
		Magazine5_r1.setRotationPoint(0.0F, -41.4141F, -10.8566F);
		Magazine3.addChild(Magazine5_r1);
		setRotationAngle(Magazine5_r1, 0.5236F, 0.0F, 0.0F);
		Magazine5_r1.cubeList.add(new ModelBox(Magazine5_r1, 172, 6, -2.0F, -2.0F, -0.5F, 4, 4, 1, 0.1F, false));

		Magazine4 = new ModelRenderer(this);
		Magazine4.setRotationPoint(-1.5F, -22.2435F, -64.477F);
		magBody.addChild(Magazine4);
		setRotationAngle(Magazine4, -1.9188F, 0.0F, 0.0F);
		Magazine4.cubeList.add(new ModelBox(Magazine4, 75, 114, -2.0F, -42.4335F, -11.894F, 4, 7, 6, 0.0F, false));
		Magazine4.cubeList.add(new ModelBox(Magazine4, 154, 160, -2.0F, -35.9335F, -10.994F, 4, 3, 2, -0.2F, false));
		Magazine4.cubeList.add(new ModelBox(Magazine4, 161, 0, -2.0F, -35.9335F, -7.494F, 4, 3, 2, -0.2F, false));
		Magazine4.cubeList.add(new ModelBox(Magazine4, 117, 37, -2.0F, -35.9335F, -12.394F, 4, 3, 7, -0.4F, false));

		Magazine5 = new ModelRenderer(this);
		Magazine5.setRotationPoint(-3.0F, -32.3F, -26.6F);
		magBody.addChild(Magazine5);
		setRotationAngle(Magazine5, -0.1859F, 0.0F, 0.0F);
		Magazine5.cubeList.add(new ModelBox(Magazine5, 141, 152, 0.0F, 0.0F, -1.0F, 3, 6, 3, 0.0F, false));

		Magazine6 = new ModelRenderer(this);
		Magazine6.setRotationPoint(-3.0F, -25.0F, -26.0F);
		magBody.addChild(Magazine6);
		setRotationAngle(Magazine6, -1.7895F, 0.0F, 0.0F);
		Magazine6.cubeList.add(new ModelBox(Magazine6, 146, 124, 0.0F, -0.0262F, -1.0648F, 3, 3, 5, 0.0F, false));

		Magazine7 = new ModelRenderer(this);
		Magazine7.setRotationPoint(-1.5F, -23.5669F, -65.2595F);
		magBody.addChild(Magazine7);
		setRotationAngle(Magazine7, -1.9188F, 0.0F, 0.0F);
		Magazine7.cubeList.add(new ModelBox(Magazine7, 117, 142, -1.5F, -36.9506F, -10.8376F, 3, 3, 6, 0.0F, false));

		Magazine8 = new ModelRenderer(this);
		Magazine8.setRotationPoint(-3.0F, -15.2F, -31.5F);
		magBody.addChild(Magazine8);
		setRotationAngle(Magazine8, -2.0045F, 0.0F, 0.0F);
		Magazine8.cubeList.add(new ModelBox(Magazine8, 68, 150, 0.0F, -2.2511F, -1.3871F, 3, 3, 5, 0.0F, false));
		Magazine8.cubeList.add(new ModelBox(Magazine8, 0, 173, 0.0F, -2.2511F, 2.9879F, 3, 3, 1, 0.1F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(-1.5F, -19.0979F, -47.3634F);
		ak19Magazine.addChild(bone13);
		bone13.cubeList.add(new ModelBox(bone13, 117, 48, -2.5F, -11.0521F, 22.5634F, 5, 1, 7, -0.3F, false));
		bone13.cubeList.add(new ModelBox(bone13, 96, 124, -2.5F, -9.2521F, 22.5634F, 5, 1, 7, -0.3F, false));
		bone13.cubeList.add(new ModelBox(bone13, 165, 44, -2.5F, -10.6521F, 22.5634F, 5, 2, 1, -0.3F, false));
		bone13.cubeList.add(new ModelBox(bone13, 165, 48, -2.5F, -10.6521F, 24.5634F, 5, 2, 1, -0.3F, false));
		bone13.cubeList.add(new ModelBox(bone13, 77, 166, -2.5F, -10.6521F, 26.5634F, 5, 2, 1, -0.3F, false));
		bone13.cubeList.add(new ModelBox(bone13, 125, 166, -2.5F, -10.6521F, 28.5634F, 5, 2, 1, -0.3F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-1.5F, -25.7544F, -21.3999F);
		ak19Magazine.addChild(bone2);
		setRotationAngle(bone2, -0.0436F, 0.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 121, 124, -2.5F, -1.4F, -3.5F, 5, 1, 7, -0.3F, false));
		bone2.cubeList.add(new ModelBox(bone2, 0, 127, -2.5F, 0.4F, -3.5F, 5, 1, 7, -0.3F, false));
		bone2.cubeList.add(new ModelBox(bone2, 152, 166, -2.5F, -1.0F, -3.5F, 5, 2, 1, -0.3F, false));
		bone2.cubeList.add(new ModelBox(bone2, 165, 166, -2.5F, -1.0F, -1.5F, 5, 2, 1, -0.3F, false));
		bone2.cubeList.add(new ModelBox(bone2, 56, 167, -2.5F, -1.0F, 0.5F, 5, 2, 1, -0.3F, false));
		bone2.cubeList.add(new ModelBox(bone2, 112, 167, -2.5F, -1.0F, 2.5F, 5, 2, 1, -0.3F, false));
		bone2.cubeList.add(new ModelBox(bone2, 170, 144, -2.5F, -2.6F, -3.5F, 5, 2, 1, -0.3F, false));
		bone2.cubeList.add(new ModelBox(bone2, 170, 140, -2.5F, -2.6F, 2.5F, 5, 2, 1, -0.3F, false));
		bone2.cubeList.add(new ModelBox(bone2, 50, 128, -2.5F, 1.85F, -3.5F, 5, 1, 7, -0.3F, false));
		bone2.cubeList.add(new ModelBox(bone2, 25, 127, -2.5F, 3.65F, -3.5F, 5, 1, 7, -0.3F, false));
		bone2.cubeList.add(new ModelBox(bone2, 167, 160, -2.5F, 2.25F, -3.5F, 5, 2, 1, -0.3F, false));
		bone2.cubeList.add(new ModelBox(bone2, 138, 167, -2.5F, 2.25F, -1.5F, 5, 2, 1, -0.3F, false));
		bone2.cubeList.add(new ModelBox(bone2, 167, 136, -2.5F, 2.25F, 0.5F, 5, 2, 1, -0.3F, false));
		bone2.cubeList.add(new ModelBox(bone2, 167, 132, -2.5F, 2.25F, 2.5F, 5, 2, 1, -0.3F, false));
		bone2.cubeList.add(new ModelBox(bone2, 125, 170, -2.5F, 0.55F, -3.5F, 5, 2, 1, -0.3F, false));
		bone2.cubeList.add(new ModelBox(bone2, 170, 118, -2.5F, 0.55F, 2.5F, 5, 2, 1, -0.3F, false));
		bone2.cubeList.add(new ModelBox(bone2, 170, 114, -2.5F, 3.15F, 2.5F, 5, 2, 1, -0.3F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-1.5F, -11.3891F, -23.6679F);
		ak19Magazine.addChild(bone4);
		setRotationAngle(bone4, -0.2618F, 0.0F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 134, 98, -2.5F, -3.025F, -3.5F, 5, 1, 7, -0.3F, false));
		bone4.cubeList.add(new ModelBox(bone4, 134, 107, -2.5F, -1.225F, -3.5F, 5, 1, 7, -0.3F, false));
		bone4.cubeList.add(new ModelBox(bone4, 168, 68, -2.5F, -2.625F, -3.5F, 5, 2, 1, -0.3F, false));
		bone4.cubeList.add(new ModelBox(bone4, 169, 156, -2.5F, -4.125F, -3.5F, 5, 2, 1, -0.3F, false));
		bone4.cubeList.add(new ModelBox(bone4, 0, 169, -2.5F, -2.625F, -1.5F, 5, 2, 1, -0.3F, false));
		bone4.cubeList.add(new ModelBox(bone4, 90, 169, -2.5F, -2.625F, 0.5F, 5, 2, 1, -0.3F, false));
		bone4.cubeList.add(new ModelBox(bone4, 169, 152, -2.5F, -2.625F, 2.5F, 5, 2, 1, -0.3F, false));
		bone4.cubeList.add(new ModelBox(bone4, 69, 170, -2.5F, -4.325F, 2.5F, 5, 2, 1, -0.3F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-1.5F, -17.6152F, -22.2306F);
		ak19Magazine.addChild(bone3);
		setRotationAngle(bone3, -0.1745F, 0.0F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 75, 133, -2.5F, -3.025F, -3.5F, 5, 1, 7, -0.3F, false));
		bone3.cubeList.add(new ModelBox(bone3, 100, 133, -2.5F, -1.225F, -3.5F, 5, 1, 7, -0.3F, false));
		bone3.cubeList.add(new ModelBox(bone3, 13, 168, -2.5F, -2.625F, -3.5F, 5, 2, 1, -0.3F, false));
		bone3.cubeList.add(new ModelBox(bone3, 170, 72, -2.5F, -4.025F, -3.5F, 5, 2, 1, -0.3F, false));
		bone3.cubeList.add(new ModelBox(bone3, 26, 168, -2.5F, -2.625F, -1.5F, 5, 2, 1, -0.3F, false));
		bone3.cubeList.add(new ModelBox(bone3, 39, 168, -2.5F, -2.625F, 0.5F, 5, 2, 1, -0.3F, false));
		bone3.cubeList.add(new ModelBox(bone3, 168, 64, -2.5F, -2.625F, 2.5F, 5, 2, 1, -0.3F, false));
		bone3.cubeList.add(new ModelBox(bone3, 170, 76, -2.5F, -4.125F, 2.5F, 5, 2, 1, -0.3F, false));
		bone3.cubeList.add(new ModelBox(bone3, 125, 133, -2.5F, 0.225F, -3.5F, 5, 1, 7, -0.3F, false));
		bone3.cubeList.add(new ModelBox(bone3, 134, 89, -2.5F, 2.025F, -3.5F, 5, 1, 7, -0.3F, false));
		bone3.cubeList.add(new ModelBox(bone3, 163, 40, -2.5F, 0.625F, -3.5F, 5, 2, 1, -0.3F, false));
		bone3.cubeList.add(new ModelBox(bone3, 163, 124, -2.5F, 0.625F, -1.5F, 5, 2, 1, -0.3F, false));
		bone3.cubeList.add(new ModelBox(bone3, 163, 128, -2.5F, 0.625F, 0.5F, 5, 2, 1, -0.3F, false));
		bone3.cubeList.add(new ModelBox(bone3, 13, 164, -2.5F, 0.625F, 2.5F, 5, 2, 1, -0.3F, false));
		bone3.cubeList.add(new ModelBox(bone3, 161, 23, -2.5F, -0.975F, -3.5F, 5, 2, 1, -0.3F, false));
		bone3.cubeList.add(new ModelBox(bone3, 142, 53, -2.5F, -0.975F, 2.5F, 5, 2, 1, -0.3F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ak19Magazine.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}