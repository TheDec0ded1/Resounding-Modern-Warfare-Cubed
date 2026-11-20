package com.paneedah.mwc.models;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBZ191Irons_Folded extends ModelBase {
	private final ModelRenderer ironsQBZ191_folded;
	private final ModelRenderer frontsight2;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer irons;
	private final ModelRenderer bone10_r1;
	private final ModelRenderer bone9_r1;
	private final ModelRenderer bone9_r2;
	private final ModelRenderer bone8_r1;
	private final ModelRenderer bone5;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;

	public QBZ191Irons_Folded() {
		textureWidth = 400;
		textureHeight = 400;

		ironsQBZ191_folded = new ModelRenderer(this);
		ironsQBZ191_folded.setRotationPoint(0.0F, -13.0F, 0.0F);
		

		frontsight2 = new ModelRenderer(this);
		frontsight2.setRotationPoint(-1.4835F, -2.9599F, -65.7628F);
		ironsQBZ191_folded.addChild(frontsight2);
		setRotationAngle(frontsight2, -1.5708F, 0.0F, 0.0F);
		frontsight2.cubeList.add(new ModelBox(frontsight2, 390, 247, -1.0165F, -14.626F, -1.6649F, 2, 3, 1, -0.2F, false));
		frontsight2.cubeList.add(new ModelBox(frontsight2, 390, 251, -1.0165F, -14.626F, -1.0649F, 2, 3, 1, -0.2F, false));
		frontsight2.cubeList.add(new ModelBox(frontsight2, 390, 263, 0.7942F, -16.7107F, -1.8649F, 1, 2, 2, -0.4F, false));
		frontsight2.cubeList.add(new ModelBox(frontsight2, 264, 390, -1.8272F, -16.7107F, -1.8649F, 1, 2, 2, -0.4F, false));
		frontsight2.cubeList.add(new ModelBox(frontsight2, 178, 390, -1.0165F, -17.5955F, -1.8649F, 2, 1, 2, -0.4F, false));
		frontsight2.cubeList.add(new ModelBox(frontsight2, 112, 394, -0.5165F, -15.126F, -1.3149F, 1, 1, 1, -0.2F, false));
		frontsight2.cubeList.add(new ModelBox(frontsight2, 158, 393, -0.5165F, -16.226F, -1.3149F, 1, 2, 1, -0.4F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-0.9481F, -16.6855F, -0.8649F);
		frontsight2.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.7418F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 390, 259, -0.5F, -1.0F, -1.0F, 1, 2, 2, -0.4F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.9151F, -16.6856F, -0.8649F);
		frontsight2.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.7418F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 258, 390, -0.5F, -1.0F, -1.0F, 1, 2, 2, -0.4F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-1.0406F, -14.6411F, -0.8649F);
		frontsight2.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.5236F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 390, 255, -0.5F, -1.0F, -1.0F, 1, 2, 2, -0.4F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(1.0076F, -14.6411F, -0.8649F);
		frontsight2.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 0.5236F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 252, 390, -0.5F, -1.0F, -1.0F, 1, 2, 2, -0.4F, false));

		irons = new ModelRenderer(this);
		irons.setRotationPoint(-1.5F, -3.7965F, 0.8F);
		ironsQBZ191_folded.addChild(irons);
		setRotationAngle(irons, -1.5708F, 0.0F, 0.0F);
		irons.cubeList.add(new ModelBox(irons, 116, 394, -0.6F, -1.9535F, -0.175F, 1, 1, 1, -0.35F, false));
		irons.cubeList.add(new ModelBox(irons, 120, 394, -0.4F, -1.9535F, -0.175F, 1, 1, 1, -0.35F, false));
		irons.cubeList.add(new ModelBox(irons, 124, 394, -0.9535F, -1.4F, -0.175F, 1, 1, 1, -0.35F, false));
		irons.cubeList.add(new ModelBox(irons, 394, 155, -0.9535F, -1.6F, -0.175F, 1, 1, 1, -0.35F, false));
		irons.cubeList.add(new ModelBox(irons, 222, 394, -0.6F, -1.0464F, -0.175F, 1, 1, 1, -0.35F, false));
		irons.cubeList.add(new ModelBox(irons, 226, 394, -0.4F, -1.0464F, -0.175F, 1, 1, 1, -0.35F, false));
		irons.cubeList.add(new ModelBox(irons, 266, 394, -0.0465F, -1.6F, -0.175F, 1, 1, 1, -0.35F, false));
		irons.cubeList.add(new ModelBox(irons, 270, 394, -0.0465F, -1.4F, -0.175F, 1, 1, 1, -0.35F, false));

		bone10_r1 = new ModelRenderer(this);
		bone10_r1.setRotationPoint(1.9824F, 1.6996F, 0.325F);
		irons.addChild(bone10_r1);
		setRotationAngle(bone10_r1, 0.0F, 0.0F, 0.7854F);
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 262, 394, -3.3571F, -1.1071F, -0.5F, 1, 1, 1, -0.35F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 258, 394, -3.3571F, -0.9071F, -0.5F, 1, 1, 1, -0.35F, false));

		bone9_r1 = new ModelRenderer(this);
		bone9_r1.setRotationPoint(-0.3561F, 0.2854F, 0.325F);
		irons.addChild(bone9_r1);
		setRotationAngle(bone9_r1, 0.0F, 0.0F, 0.7854F);
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 254, 394, -1.2571F, -1.2071F, -0.5F, 1, 1, 1, -0.35F, false));
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 250, 394, -1.0571F, -1.2071F, -0.5F, 1, 1, 1, -0.35F, false));

		bone9_r2 = new ModelRenderer(this);
		bone9_r2.setRotationPoint(1.341F, 1.0581F, 0.325F);
		irons.addChild(bone9_r2);
		setRotationAngle(bone9_r2, 0.0F, 0.0F, 0.7854F);
		bone9_r2.cubeList.add(new ModelBox(bone9_r2, 204, 394, -3.3571F, -0.9071F, -0.5F, 1, 1, 1, -0.35F, false));
		bone9_r2.cubeList.add(new ModelBox(bone9_r2, 394, 161, -3.3571F, -1.1071F, -0.5F, 1, 1, 1, -0.35F, false));

		bone8_r1 = new ModelRenderer(this);
		bone8_r1.setRotationPoint(0.2854F, -0.3561F, 0.325F);
		irons.addChild(bone8_r1);
		setRotationAngle(bone8_r1, 0.0F, 0.0F, 0.7854F);
		bone8_r1.cubeList.add(new ModelBox(bone8_r1, 394, 159, -1.0571F, -1.2071F, -0.5F, 1, 1, 1, -0.35F, false));
		bone8_r1.cubeList.add(new ModelBox(bone8_r1, 394, 157, -1.2571F, -1.2071F, -0.5F, 1, 1, 1, -0.35F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(1.5F, 48.0964F, -9.5F);
		irons.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 274, 394, -1.2929F, -48.3929F, 9.0F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 278, 394, -2.7071F, -48.3929F, 9.0F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 162, 393, -2.0F, -48.6858F, 9.0F, 1, 2, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 388, 390, -2.0F, -48.4858F, 9.0F, 1, 4, 1, 0.1F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-1.0F, -47.3929F, 9.5F);
		bone5.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 0.7854F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 394, 355, -1.2071F, -1.2071F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-2.0F, -47.3929F, 9.5F);
		bone5.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, 0.7854F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 394, 353, -1.2071F, -1.2071F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-2.0F, -46.3929F, 9.5F);
		bone5.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, 0.7854F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 394, 351, -1.2071F, -1.2071F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-1.0F, -46.3929F, 9.5F);
		bone5.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, 0.7854F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 282, 394, -1.2071F, -1.2071F, -0.5F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ironsQBZ191_folded.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}