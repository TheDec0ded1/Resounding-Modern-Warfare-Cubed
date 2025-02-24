package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBU88IronsFolded extends ModelBase {
	private final ModelRenderer irons_folded;
	private final ModelRenderer frontsight2;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer irons;
	private final ModelRenderer bone10_r1;
	private final ModelRenderer bone9_r1;
	private final ModelRenderer bone9_r2;
	private final ModelRenderer bone8_r1;
	private final ModelRenderer bone5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;

	public QBU88IronsFolded() {
		textureWidth = 576;
		textureHeight = 576;

		irons_folded = new ModelRenderer(this);
		irons_folded.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		frontsight2 = new ModelRenderer(this);
		frontsight2.setRotationPoint(-1.4835F, -40.8599F, -36.0628F);
		irons_folded.addChild(frontsight2);
		setRotationAngle(frontsight2, -1.5708F, 0.0F, 0.0F);
		frontsight2.cubeList.add(new ModelBox(frontsight2, 370, 540, -1.0165F, -0.626F, -0.0649F, 2, 2, 1, -0.2F, false));
		frontsight2.cubeList.add(new ModelBox(frontsight2, 521, 536, -1.0165F, -0.626F, -1.6649F, 2, 2, 2, -0.2F, false));
		frontsight2.cubeList.add(new ModelBox(frontsight2, 523, 131, -1.0165F, -0.126F, -0.8649F, 2, 1, 1, -0.1F, false));
		frontsight2.cubeList.add(new ModelBox(frontsight2, 215, 520, -1.0165F, 4.5701F, -0.1043F, 2, 3, 2, -0.2F, false));
		frontsight2.cubeList.add(new ModelBox(frontsight2, 540, 308, -1.0165F, 4.5701F, 1.4957F, 2, 3, 1, -0.2F, false));
		frontsight2.cubeList.add(new ModelBox(frontsight2, 171, 536, 0.9942F, -2.7107F, -1.8649F, 1, 2, 3, -0.4F, false));
		frontsight2.cubeList.add(new ModelBox(frontsight2, 180, 536, -1.964F, -2.7107F, -1.8649F, 1, 2, 3, -0.4F, false));
		frontsight2.cubeList.add(new ModelBox(frontsight2, 540, 345, 0.6942F, -2.2107F, -0.8399F, 1, 1, 2, -0.4F, false));
		frontsight2.cubeList.add(new ModelBox(frontsight2, 516, 541, -1.664F, -2.2107F, -0.8399F, 1, 1, 2, -0.4F, false));
		frontsight2.cubeList.add(new ModelBox(frontsight2, 523, 541, 0.6942F, -2.2107F, -0.9649F, 1, 1, 2, -0.3F, false));
		frontsight2.cubeList.add(new ModelBox(frontsight2, 0, 542, -1.664F, -2.2107F, -0.9649F, 1, 1, 2, -0.3F, false));
		frontsight2.cubeList.add(new ModelBox(frontsight2, 532, 502, -1.1533F, -3.5955F, -1.8649F, 2, 1, 3, -0.4F, false));
		frontsight2.cubeList.add(new ModelBox(frontsight2, 532, 507, -0.8165F, -3.5955F, -1.8649F, 2, 1, 3, -0.4F, false));
		frontsight2.cubeList.add(new ModelBox(frontsight2, 112, 545, -0.5165F, -1.126F, -1.2149F, 1, 1, 1, -0.2F, false));
		frontsight2.cubeList.add(new ModelBox(frontsight2, 202, 542, -0.5165F, -2.226F, -1.2149F, 1, 2, 1, -0.4F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.0849F, -2.6855F, -0.8649F);
		frontsight2.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.7418F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 535, 284, -0.5F, -1.0F, -1.0F, 1, 2, 3, -0.4F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.1151F, -2.6855F, -0.8649F);
		frontsight2.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7418F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 209, 535, -0.5F, -1.0F, -1.0F, 1, 2, 3, -0.4F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1.0849F, -0.7359F, -0.8649F);
		frontsight2.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.7418F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 123, 535, -0.5F, -1.0F, -1.0F, 1, 2, 3, -0.4F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(1.1151F, -0.7359F, -0.8649F);
		frontsight2.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.7418F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 114, 535, -0.5F, -1.0F, -1.0F, 1, 2, 3, -0.4F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-0.0165F, 2.9721F, 0.4154F);
		frontsight2.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.3927F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 537, 124, -1.2F, -2.7808F, -1.4491F, 2, 5, 1, -0.4F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 537, 117, -0.8F, -2.7808F, -1.4491F, 2, 5, 1, -0.4F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 537, 110, -0.8F, -2.2192F, 0.4491F, 2, 5, 1, -0.4F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 102, 537, -1.2F, -2.2192F, 0.4491F, 2, 5, 1, -0.4F, false));

		irons = new ModelRenderer(this);
		irons.setRotationPoint(-1.5F, -40.2965F, 2.8F);
		irons_folded.addChild(irons);
		setRotationAngle(irons, 1.5708F, 0.0F, 0.0F);
		irons.cubeList.add(new ModelBox(irons, 424, 544, -0.6F, -0.9535F, -0.5F, 1, 1, 1, -0.35F, false));
		irons.cubeList.add(new ModelBox(irons, 429, 544, -0.4F, -0.9535F, -0.5F, 1, 1, 1, -0.35F, false));
		irons.cubeList.add(new ModelBox(irons, 543, 519, -0.9535F, -0.4F, -0.5F, 1, 1, 1, -0.35F, false));
		irons.cubeList.add(new ModelBox(irons, 281, 545, -0.9535F, -0.6F, -0.5F, 1, 1, 1, -0.35F, false));
		irons.cubeList.add(new ModelBox(irons, 316, 545, -0.6F, -0.0464F, -0.5F, 1, 1, 1, -0.35F, false));
		irons.cubeList.add(new ModelBox(irons, 546, 15, -0.4F, -0.0464F, -0.5F, 1, 1, 1, -0.35F, false));
		irons.cubeList.add(new ModelBox(irons, 291, 545, -0.0465F, -0.6F, -0.5F, 1, 1, 1, -0.35F, false));
		irons.cubeList.add(new ModelBox(irons, 286, 545, -0.0465F, -0.4F, -0.5F, 1, 1, 1, -0.35F, false));

		bone10_r1 = new ModelRenderer(this);
		bone10_r1.setRotationPoint(1.9824F, 1.6996F, 0.0F);
		irons.addChild(bone10_r1);
		setRotationAngle(bone10_r1, 0.0F, 0.0F, 0.7854F);
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 296, 545, -2.65F, -0.4F, -0.5F, 1, 1, 1, -0.35F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 301, 545, -2.65F, -0.2F, -0.5F, 1, 1, 1, -0.35F, false));

		bone9_r1 = new ModelRenderer(this);
		bone9_r1.setRotationPoint(-0.3561F, 0.2854F, 0.0F);
		irons.addChild(bone9_r1);
		setRotationAngle(bone9_r1, 0.0F, 0.0F, 0.7854F);
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 306, 545, -0.55F, -0.5F, -0.5F, 1, 1, 1, -0.35F, false));
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 311, 545, -0.35F, -0.5F, -0.5F, 1, 1, 1, -0.35F, false));

		bone9_r2 = new ModelRenderer(this);
		bone9_r2.setRotationPoint(1.341F, 1.0581F, 0.0F);
		irons.addChild(bone9_r2);
		setRotationAngle(bone9_r2, 0.0F, 0.0F, 0.7854F);
		bone9_r2.cubeList.add(new ModelBox(bone9_r2, 239, 545, -2.65F, -0.2F, -0.5F, 1, 1, 1, -0.35F, false));
		bone9_r2.cubeList.add(new ModelBox(bone9_r2, 244, 545, -2.65F, -0.4F, -0.5F, 1, 1, 1, -0.35F, false));

		bone8_r1 = new ModelRenderer(this);
		bone8_r1.setRotationPoint(0.2854F, -0.3561F, 0.0F);
		irons.addChild(bone8_r1);
		setRotationAngle(bone8_r1, 0.0F, 0.0F, 0.7854F);
		bone8_r1.cubeList.add(new ModelBox(bone8_r1, 207, 545, -0.35F, -0.5F, -0.5F, 1, 1, 1, -0.35F, false));
		bone8_r1.cubeList.add(new ModelBox(bone8_r1, 33, 544, -0.55F, -0.5F, -0.5F, 1, 1, 1, -0.35F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(1.5F, 48.0964F, -9.5F);
		irons.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 137, 545, -1.2929F, -47.3929F, 9.0F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 17, 546, -2.7071F, -47.3929F, 9.0F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 67, 543, -2.0F, -47.6858F, 9.0F, 1, 2, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 95, 535, -2.5F, -47.5858F, 9.7F, 2, 6, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 231, 491, -1.0F, -45.0858F, 9.7F, 1, 2, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 291, 494, -3.0F, -45.0858F, 9.7F, 1, 2, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 169, 461, -1.2F, -48.9858F, 9.3F, 1, 8, 2, -0.3F, false));
		bone5.cubeList.add(new ModelBox(bone5, 169, 450, -2.8F, -48.9858F, 9.3F, 1, 8, 2, -0.3F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-1.0F, -47.3929F, 9.5F);
		bone5.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 331, 545, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-2.0F, -47.3929F, 9.5F);
		bone5.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 359, 545, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-2.0F, -46.3929F, 9.5F);
		bone5.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 326, 545, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-1.0F, -46.3929F, 9.5F);
		bone5.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 0.7854F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 321, 545, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		irons_folded.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}