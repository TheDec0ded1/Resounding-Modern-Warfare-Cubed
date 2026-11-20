package com.paneedah.mwc.models;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBU191Irons_Folded extends ModelBase {
	private final ModelRenderer ironsQBU_folded;
	private final ModelRenderer frontsight2;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer irons;
	private final ModelRenderer bone10_r1;
	private final ModelRenderer bone9_r1;
	private final ModelRenderer bone9_r2;
	private final ModelRenderer bone8_r1;
	private final ModelRenderer bone5;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;

	public QBU191Irons_Folded() {
		textureWidth = 416;
		textureHeight = 416;

		ironsQBU_folded = new ModelRenderer(this);
		ironsQBU_folded.setRotationPoint(0.0F, -13.0F, 0.0F);
		

		frontsight2 = new ModelRenderer(this);
		frontsight2.setRotationPoint(-1.4835F, -2.9599F, -65.2628F);
		ironsQBU_folded.addChild(frontsight2);
		setRotationAngle(frontsight2, -1.5708F, 0.0F, 0.0F);
		frontsight2.cubeList.add(new ModelBox(frontsight2, 388, 395, -1.0165F, -0.626F, -1.6649F, 2, 3, 1, -0.2F, false));
		frontsight2.cubeList.add(new ModelBox(frontsight2, 394, 395, -1.0165F, -0.626F, -1.0649F, 2, 3, 1, -0.2F, false));
		frontsight2.cubeList.add(new ModelBox(frontsight2, 108, 396, 0.7942F, -2.7107F, -1.8649F, 1, 2, 2, -0.4F, false));
		frontsight2.cubeList.add(new ModelBox(frontsight2, 114, 396, -1.8272F, -2.7107F, -1.8649F, 1, 2, 2, -0.4F, false));
		frontsight2.cubeList.add(new ModelBox(frontsight2, 154, 394, -1.0165F, -3.5955F, -1.8649F, 2, 1, 2, -0.4F, false));
		frontsight2.cubeList.add(new ModelBox(frontsight2, 400, 208, -0.5165F, -1.126F, -1.3149F, 1, 1, 1, -0.2F, false));
		frontsight2.cubeList.add(new ModelBox(frontsight2, 88, 322, -0.5165F, -2.226F, -1.3149F, 1, 2, 1, -0.4F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.9481F, -2.6855F, -0.8649F);
		frontsight2.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.7418F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 102, 396, -0.5F, -1.0F, -1.0F, 1, 2, 2, -0.4F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.9151F, -2.6856F, -0.8649F);
		frontsight2.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7418F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 20, 396, -0.5F, -1.0F, -1.0F, 1, 2, 2, -0.4F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1.0406F, -0.6411F, -0.8649F);
		frontsight2.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.5236F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 14, 396, -0.5F, -1.0F, -1.0F, 1, 2, 2, -0.4F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(1.0076F, -0.6411F, -0.8649F);
		frontsight2.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.5236F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 8, 396, -0.5F, -1.0F, -1.0F, 1, 2, 2, -0.4F, false));

		irons = new ModelRenderer(this);
		irons.setRotationPoint(-1.5F, -3.7965F, 0.8F);
		ironsQBU_folded.addChild(irons);
		setRotationAngle(irons, -1.5708F, 0.0F, 0.0F);
		irons.cubeList.add(new ModelBox(irons, 210, 400, -0.6F, -1.9535F, -0.175F, 1, 1, 1, -0.35F, false));
		irons.cubeList.add(new ModelBox(irons, 400, 210, -0.4F, -1.9535F, -0.175F, 1, 1, 1, -0.35F, false));
		irons.cubeList.add(new ModelBox(irons, 400, 212, -0.9535F, -1.4F, -0.175F, 1, 1, 1, -0.35F, false));
		irons.cubeList.add(new ModelBox(irons, 214, 400, -0.9535F, -1.6F, -0.175F, 1, 1, 1, -0.35F, false));
		irons.cubeList.add(new ModelBox(irons, 400, 220, -0.6F, -1.0464F, -0.175F, 1, 1, 1, -0.35F, false));
		irons.cubeList.add(new ModelBox(irons, 222, 400, -0.4F, -1.0464F, -0.175F, 1, 1, 1, -0.35F, false));
		irons.cubeList.add(new ModelBox(irons, 400, 228, -0.0465F, -1.6F, -0.175F, 1, 1, 1, -0.35F, false));
		irons.cubeList.add(new ModelBox(irons, 230, 400, -0.0465F, -1.4F, -0.175F, 1, 1, 1, -0.35F, false));

		bone10_r1 = new ModelRenderer(this);
		bone10_r1.setRotationPoint(1.9824F, 1.6996F, 0.325F);
		irons.addChild(bone10_r1);
		setRotationAngle(bone10_r1, 0.0F, 0.0F, 0.7854F);
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 400, 226, -3.3571F, -1.1071F, -0.5F, 1, 1, 1, -0.35F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 226, 400, -3.3571F, -0.9071F, -0.5F, 1, 1, 1, -0.35F, false));

		bone9_r1 = new ModelRenderer(this);
		bone9_r1.setRotationPoint(-0.3561F, 0.2854F, 0.325F);
		irons.addChild(bone9_r1);
		setRotationAngle(bone9_r1, 0.0F, 0.0F, 0.7854F);
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 400, 224, -1.2571F, -1.2071F, -0.5F, 1, 1, 1, -0.35F, false));
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 400, 222, -1.0571F, -1.2071F, -0.5F, 1, 1, 1, -0.35F, false));

		bone9_r2 = new ModelRenderer(this);
		bone9_r2.setRotationPoint(1.341F, 1.0581F, 0.325F);
		irons.addChild(bone9_r2);
		setRotationAngle(bone9_r2, 0.0F, 0.0F, 0.7854F);
		bone9_r2.cubeList.add(new ModelBox(bone9_r2, 400, 218, -3.3571F, -0.9071F, -0.5F, 1, 1, 1, -0.35F, false));
		bone9_r2.cubeList.add(new ModelBox(bone9_r2, 218, 400, -3.3571F, -1.1071F, -0.5F, 1, 1, 1, -0.35F, false));

		bone8_r1 = new ModelRenderer(this);
		bone8_r1.setRotationPoint(0.2854F, -0.3561F, 0.325F);
		irons.addChild(bone8_r1);
		setRotationAngle(bone8_r1, 0.0F, 0.0F, 0.7854F);
		bone8_r1.cubeList.add(new ModelBox(bone8_r1, 400, 216, -1.0571F, -1.2071F, -0.5F, 1, 1, 1, -0.35F, false));
		bone8_r1.cubeList.add(new ModelBox(bone8_r1, 400, 214, -1.2571F, -1.2071F, -0.5F, 1, 1, 1, -0.35F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(1.5F, 48.0964F, -9.5F);
		irons.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 400, 230, -1.2929F, -48.3929F, 9.0F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 400, 232, -2.7071F, -48.3929F, 9.0F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 314, 399, -2.0F, -48.6858F, 9.0F, 1, 2, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 70, 357, -2.0F, -48.4858F, 9.0F, 1, 4, 1, 0.1F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.0F, -47.3929F, 9.5F);
		bone5.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 238, 400, -1.2071F, -1.2071F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-2.0F, -47.3929F, 9.5F);
		bone5.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 400, 236, -1.2071F, -1.2071F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-2.0F, -46.3929F, 9.5F);
		bone5.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 0.7854F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 400, 234, -1.2071F, -1.2071F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-1.0F, -46.3929F, 9.5F);
		bone5.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 0.7854F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 234, 400, -1.2071F, -1.2071F, -0.5F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ironsQBU_folded.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}