package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QCW05Action extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer bone7;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;

	public QCW05Action() {
		textureWidth = 320;
		textureHeight = 320;

		action = new ModelRenderer(this);
		action.setRotationPoint(-1.6684F, -13.0886F, 3.56F);
		action.cubeList.add(new ModelBox(action, 41, 210, -0.3316F, -1.9428F, -4.46F, 1, 1, 19, -0.2F, false));
		action.cubeList.add(new ModelBox(action, 211, 108, 0.0926F, -1.5185F, -4.46F, 1, 1, 19, -0.2F, false));
		action.cubeList.add(new ModelBox(action, 211, 129, -0.7559F, -1.5185F, -4.46F, 1, 1, 19, -0.2F, false));
		action.cubeList.add(new ModelBox(action, 217, 21, -0.3316F, -1.0943F, -4.46F, 1, 1, 19, -0.2F, false));
		action.cubeList.add(new ModelBox(action, 283, 45, -1.325F, -2.2F, -5.0F, 3, 5, 3, -0.3F, false));
		action.cubeList.add(new ModelBox(action, 76, 294, -0.825F, -3.5939F, -4.4305F, 2, 3, 2, -0.3F, false));
		action.cubeList.add(new ModelBox(action, 298, 263, -0.825F, -3.8768F, -3.7134F, 2, 1, 1, -0.3F, false));
		action.cubeList.add(new ModelBox(action, 298, 269, -0.825F, -3.8768F, -3.9134F, 2, 1, 1, -0.3F, false));
		action.cubeList.add(new ModelBox(action, 298, 266, -0.825F, -3.8768F, -4.1477F, 2, 1, 1, -0.3F, false));
		action.cubeList.add(new ModelBox(action, 147, 179, -0.825F, -3.4939F, -3.9305F, 2, 1, 1, -0.2F, false));
		action.cubeList.add(new ModelBox(action, 264, 266, -2.5316F, 0.0886F, 13.94F, 4, 2, 7, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.3235F, -0.2637F, 17.44F);
		action.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.3054F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 267, -2.0F, -1.0F, -3.5F, 4, 2, 7, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.175F, -3.4353F, -3.7063F);
		action.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.7854F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 298, 214, -1.0F, -0.5F, -0.7F, 2, 1, 1, -0.3F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.175F, -3.1525F, -3.1548F);
		action.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.7854F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 298, 42, -1.0F, -0.5F, -0.3F, 2, 1, 1, -0.3F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.5755F, -0.7185F, -26.46F);
		action.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.7854F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 217, 0, -1.0F, -1.0F, 22.0F, 1, 1, 19, -0.2F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(1.1755F, -0.7185F, -26.46F);
		action.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 212, 182, -1.0F, -1.0F, 22.0F, 1, 1, 19, -0.2F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-0.2145F, -1.4014F, -24.16F);
		action.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 211, 87, -0.5F, -0.3828F, 19.7F, 1, 1, 19, -0.2F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(1.1755F, -1.3185F, -26.46F);
		action.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 211, 66, -1.0F, -1.0F, 22.0F, 1, 1, 19, -0.2F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-0.5F, -0.3939F, -2.8305F);
		action.addChild(bone7);
		bone7.cubeList.add(new ModelBox(bone7, 296, 45, -0.325F, -3.2F, -1.2F, 2, 2, 2, -0.4F, false));
		bone7.cubeList.add(new ModelBox(bone7, 25, 297, -0.325F, -2.2F, -2.2F, 2, 1, 2, -0.4F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.675F, -1.0057F, -1.7195F);
		bone7.addChild(cube_r9);
		setRotationAngle(cube_r9, -1.1781F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 296, 139, -1.0F, -2.85F, -2.0F, 2, 2, 2, -0.4F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-0.125F, -0.7429F, -0.0388F);
		bone7.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.1309F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 300, 157, 0.0F, -3.35F, -1.2F, 1, 2, 1, -0.4F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 300, 153, 0.6F, -3.35F, -1.2F, 1, 2, 1, -0.4F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.075F, -1.2429F, 0.6612F);
		bone7.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.1309F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 124, 300, 0.0F, -4.1F, -1.8F, 1, 2, 1, -0.4F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 119, 300, 0.2F, -4.1F, -1.8F, 1, 2, 1, -0.4F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 17, 277, 0.4F, -4.1F, -1.8F, 1, 3, 1, -0.4F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 300, 23, 0.4F, -3.85F, -1.6F, 1, 2, 1, -0.4F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 300, 13, 0.4F, -3.55F, -1.4F, 1, 2, 1, -0.4F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 7, 300, 0.4F, -3.35F, -1.2F, 1, 2, 1, -0.4F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 247, 150, -0.2F, -4.1F, -1.8F, 1, 3, 1, -0.4F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 222, 298, -0.2F, -3.85F, -1.6F, 1, 2, 1, -0.4F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 168, 298, -0.2F, -3.55F, -1.4F, 1, 2, 1, -0.4F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 70, 298, -0.2F, -3.35F, -1.2F, 1, 2, 1, -0.4F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 298, 173, -0.4F, -4.425F, -2.0F, 2, 2, 1, -0.4F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 298, 169, -0.4F, -4.1F, -2.0F, 2, 2, 1, -0.4F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.075F, -3.0902F, -0.3974F);
		bone7.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.4363F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 298, 64, 0.0F, -1.0F, -1.0F, 1, 2, 2, -0.4F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 63, 298, 0.2F, -1.0F, -1.0F, 1, 2, 2, -0.4F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 298, 59, 0.4F, -1.0F, -1.0F, 1, 2, 2, -0.4F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 56, 298, -0.2F, -1.0F, -1.0F, 1, 2, 2, -0.4F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.475F, -2.4734F, 0.4585F);
		bone7.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.7854F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 80, 300, 0.0F, -3.0F, 0.0F, 1, 2, 1, -0.4F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 75, 300, 0.0F, -3.425F, 0.0F, 1, 2, 1, -0.4F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 249, 299, -0.2F, -3.425F, 0.0F, 1, 2, 1, -0.4F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 244, 299, -0.2F, -3.0F, 0.0F, 1, 2, 1, -0.4F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 227, 299, -0.6F, -3.0F, 0.0F, 1, 2, 1, -0.4F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 138, 299, -0.6F, -3.425F, 0.0F, 1, 2, 1, -0.4F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 290, 297, -0.4F, -3.425F, 0.0F, 1, 2, 1, -0.4F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 147, 294, -0.4F, -3.0F, 0.0F, 1, 2, 1, -0.4F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.675F, -0.9402F, 0.0086F);
		bone7.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.1309F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 296, 134, -1.0F, -2.85F, -2.0F, 2, 2, 2, -0.4F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.675F, 1.9576F, -1.7868F);
		bone7.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.4363F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 110, 296, -1.0F, -5.0F, -2.0F, 2, 2, 2, -0.4F, false));
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