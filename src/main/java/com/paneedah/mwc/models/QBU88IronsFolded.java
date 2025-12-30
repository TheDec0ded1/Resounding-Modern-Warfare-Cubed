package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBU88IronsFolded extends ModelBase {
	private final ModelRenderer irons_folded;
	private final ModelRenderer frontsight2;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer irons;
	private final ModelRenderer bone10_r1;
	private final ModelRenderer bone9_r1;
	private final ModelRenderer bone9_r2;
	private final ModelRenderer bone8_r1;
	private final ModelRenderer bone5;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;

	public QBU88IronsFolded() {
		textureWidth = 544;
		textureHeight = 544;

		irons_folded = new ModelRenderer(this);
		irons_folded.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		frontsight2 = new ModelRenderer(this);
		frontsight2.setRotationPoint(-1.4835F, -40.8599F, -36.0628F);
		irons_folded.addChild(frontsight2);
		setRotationAngle(frontsight2, -1.5708F, 0.0F, 0.0F);
		frontsight2.cubeList.add(new ModelBox(frontsight2, 82, 530, -1.0165F, -0.626F, -0.0649F, 2, 2, 1, -0.2F, false));
		frontsight2.cubeList.add(new ModelBox(frontsight2, 525, 260, -1.0165F, -0.626F, -1.6649F, 2, 2, 2, -0.2F, false));
		frontsight2.cubeList.add(new ModelBox(frontsight2, 163, 531, -1.0165F, -0.126F, -0.8649F, 2, 1, 1, -0.1F, false));
		frontsight2.cubeList.add(new ModelBox(frontsight2, 123, 525, -1.0165F, 4.5701F, -0.1043F, 2, 3, 2, -0.2F, false));
		frontsight2.cubeList.add(new ModelBox(frontsight2, 529, 113, -1.0165F, 4.5701F, 1.4957F, 2, 3, 1, -0.2F, false));
		frontsight2.cubeList.add(new ModelBox(frontsight2, 168, 525, 0.9942F, -2.7107F, -1.8649F, 1, 2, 3, -0.4F, false));
		frontsight2.cubeList.add(new ModelBox(frontsight2, 525, 171, -1.964F, -2.7107F, -1.8649F, 1, 2, 3, -0.4F, false));
		frontsight2.cubeList.add(new ModelBox(frontsight2, 191, 530, 0.6942F, -2.2107F, -0.8399F, 1, 1, 2, -0.4F, false));
		frontsight2.cubeList.add(new ModelBox(frontsight2, 348, 530, -1.664F, -2.2107F, -0.8399F, 1, 1, 2, -0.4F, false));
		frontsight2.cubeList.add(new ModelBox(frontsight2, 530, 371, 0.6942F, -2.2107F, -0.9649F, 1, 1, 2, -0.3F, false));
		frontsight2.cubeList.add(new ModelBox(frontsight2, 530, 375, -1.664F, -2.2107F, -0.9649F, 1, 1, 2, -0.3F, false));
		frontsight2.cubeList.add(new ModelBox(frontsight2, 274, 522, -1.1533F, -3.5955F, -1.8649F, 2, 1, 3, -0.4F, false));
		frontsight2.cubeList.add(new ModelBox(frontsight2, 285, 522, -0.8165F, -3.5955F, -1.8649F, 2, 1, 3, -0.4F, false));
		frontsight2.cubeList.add(new ModelBox(frontsight2, 385, 533, -0.5165F, -1.126F, -1.2149F, 1, 1, 1, -0.2F, false));
		frontsight2.cubeList.add(new ModelBox(frontsight2, 532, 95, -0.5165F, -2.226F, -1.2149F, 1, 2, 1, -0.4F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-1.0849F, -2.6855F, -0.8649F);
		frontsight2.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, 0.7418F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 159, 525, -0.5F, -1.0F, -1.0F, 1, 2, 3, -0.4F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(1.1151F, -2.6855F, -0.8649F);
		frontsight2.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, -0.7418F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 150, 525, -0.5F, -1.0F, -1.0F, 1, 2, 3, -0.4F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-1.0849F, -0.7359F, -0.8649F);
		frontsight2.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, -0.7418F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 141, 525, -0.5F, -1.0F, -1.0F, 1, 2, 3, -0.4F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(1.1151F, -0.7359F, -0.8649F);
		frontsight2.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, 0.7418F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 132, 525, -0.5F, -1.0F, -1.0F, 1, 2, 3, -0.4F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-0.0165F, 2.9721F, 0.4154F);
		frontsight2.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.3927F, 0.0F, 0.0F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 525, 253, -1.2F, -2.7808F, -1.4491F, 2, 5, 1, -0.4F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 525, 246, -0.8F, -2.7808F, -1.4491F, 2, 5, 1, -0.4F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 525, 239, -0.8F, -2.2192F, 0.4491F, 2, 5, 1, -0.4F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 525, 232, -1.2F, -2.2192F, 0.4491F, 2, 5, 1, -0.4F, false));

		irons = new ModelRenderer(this);
		irons.setRotationPoint(-1.5F, -40.2965F, 2.8F);
		irons_folded.addChild(irons);
		setRotationAngle(irons, 1.5708F, 0.0F, 0.0F);
		irons.cubeList.add(new ModelBox(irons, 533, 153, -0.6F, -0.9535F, -0.5F, 1, 1, 1, -0.35F, false));
		irons.cubeList.add(new ModelBox(irons, 177, 533, -0.4F, -0.9535F, -0.5F, 1, 1, 1, -0.35F, false));
		irons.cubeList.add(new ModelBox(irons, 0, 534, -0.9535F, -0.4F, -0.5F, 1, 1, 1, -0.35F, false));
		irons.cubeList.add(new ModelBox(irons, 532, 533, -0.9535F, -0.6F, -0.5F, 1, 1, 1, -0.35F, false));
		irons.cubeList.add(new ModelBox(irons, 67, 534, -0.6F, -0.0464F, -0.5F, 1, 1, 1, -0.35F, false));
		irons.cubeList.add(new ModelBox(irons, 41, 534, -0.4F, -0.0464F, -0.5F, 1, 1, 1, -0.35F, false));
		irons.cubeList.add(new ModelBox(irons, 10, 534, -0.0465F, -0.6F, -0.5F, 1, 1, 1, -0.35F, false));
		irons.cubeList.add(new ModelBox(irons, 5, 534, -0.0465F, -0.4F, -0.5F, 1, 1, 1, -0.35F, false));

		bone10_r1 = new ModelRenderer(this);
		bone10_r1.setRotationPoint(1.9824F, 1.6996F, 0.0F);
		irons.addChild(bone10_r1);
		setRotationAngle(bone10_r1, 0.0F, 0.0F, 0.7854F);
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 15, 534, -2.65F, -0.4F, -0.5F, 1, 1, 1, -0.35F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 26, 534, -2.65F, -0.2F, -0.5F, 1, 1, 1, -0.35F, false));

		bone9_r1 = new ModelRenderer(this);
		bone9_r1.setRotationPoint(-0.3561F, 0.2854F, 0.0F);
		irons.addChild(bone9_r1);
		setRotationAngle(bone9_r1, 0.0F, 0.0F, 0.7854F);
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 31, 534, -0.55F, -0.5F, -0.5F, 1, 1, 1, -0.35F, false));
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 36, 534, -0.35F, -0.5F, -0.5F, 1, 1, 1, -0.35F, false));

		bone9_r2 = new ModelRenderer(this);
		bone9_r2.setRotationPoint(1.341F, 1.0581F, 0.0F);
		irons.addChild(bone9_r2);
		setRotationAngle(bone9_r2, 0.0F, 0.0F, 0.7854F);
		bone9_r2.cubeList.add(new ModelBox(bone9_r2, 425, 533, -2.65F, -0.2F, -0.5F, 1, 1, 1, -0.35F, false));
		bone9_r2.cubeList.add(new ModelBox(bone9_r2, 533, 525, -2.65F, -0.4F, -0.5F, 1, 1, 1, -0.35F, false));

		bone8_r1 = new ModelRenderer(this);
		bone8_r1.setRotationPoint(0.2854F, -0.3561F, 0.0F);
		irons.addChild(bone8_r1);
		setRotationAngle(bone8_r1, 0.0F, 0.0F, 0.7854F);
		bone8_r1.cubeList.add(new ModelBox(bone8_r1, 415, 533, -0.35F, -0.5F, -0.5F, 1, 1, 1, -0.35F, false));
		bone8_r1.cubeList.add(new ModelBox(bone8_r1, 420, 533, -0.55F, -0.5F, -0.5F, 1, 1, 1, -0.35F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(1.5F, 48.0964F, -9.5F);
		irons.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 410, 533, -1.2929F, -47.3929F, 9.0F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 116, 534, -2.7071F, -47.3929F, 9.0F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 532, 193, -2.0F, -47.6858F, 9.0F, 1, 2, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 177, 525, -2.5F, -47.5858F, 9.7F, 2, 6, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 532, 197, -1.0F, -45.0858F, 9.7F, 1, 2, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 532, 201, -3.0F, -45.0858F, 9.7F, 1, 2, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 485, 497, -1.2F, -48.9858F, 9.3F, 1, 8, 2, -0.3F, false));
		bone5.cubeList.add(new ModelBox(bone5, 66, 517, -2.8F, -48.9858F, 9.3F, 1, 8, 2, -0.3F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-1.0F, -47.3929F, 9.5F);
		bone5.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, 0.7854F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 82, 534, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(-2.0F, -47.3929F, 9.5F);
		bone5.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.0F, 0.0F, 0.7854F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 111, 534, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(-2.0F, -46.3929F, 9.5F);
		bone5.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.0F, 0.0F, 0.7854F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 77, 534, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(-1.0F, -46.3929F, 9.5F);
		bone5.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.0F, 0.0F, 0.7854F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 72, 534, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
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