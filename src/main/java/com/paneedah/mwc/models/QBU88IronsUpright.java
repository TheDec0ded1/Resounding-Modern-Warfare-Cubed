package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBU88IronsUpright extends ModelBase {
	private final ModelRenderer irons_upright;
	private final ModelRenderer frontsight;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer irons2;
	private final ModelRenderer bone10_r1;
	private final ModelRenderer bone9_r1;
	private final ModelRenderer bone9_r2;
	private final ModelRenderer bone8_r1;
	private final ModelRenderer bone6;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;

	public QBU88IronsUpright() {
		textureWidth = 576;
		textureHeight = 576;

		irons_upright = new ModelRenderer(this);
		irons_upright.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		frontsight = new ModelRenderer(this);
		frontsight.setRotationPoint(0.0F, -22.0F, -3.3F);
		irons_upright.addChild(frontsight);
		frontsight.cubeList.add(new ModelBox(frontsight, 347, 540, -2.5F, -24.1859F, -40.7277F, 2, 2, 1, -0.2F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 512, 536, -2.5F, -24.1859F, -42.3277F, 2, 2, 2, -0.2F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 162, 502, -2.5F, -23.6859F, -41.5277F, 2, 1, 1, -0.1F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 489, 350, -2.5F, -18.9898F, -40.7671F, 2, 3, 2, -0.2F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 540, 303, -2.5F, -18.9898F, -39.1671F, 2, 3, 1, -0.2F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 400, 534, -0.4893F, -26.2707F, -42.5277F, 1, 2, 3, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 409, 534, -3.4475F, -26.2707F, -42.5277F, 1, 2, 3, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 340, 540, -0.7893F, -25.7707F, -41.5027F, 1, 1, 2, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 405, 540, -3.1475F, -25.7707F, -41.5027F, 1, 1, 2, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 425, 540, -0.7893F, -25.7707F, -41.6277F, 1, 1, 2, -0.3F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 109, 541, -3.1475F, -25.7707F, -41.6277F, 1, 1, 2, -0.3F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 529, 279, -2.6368F, -27.1554F, -42.5277F, 2, 1, 3, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 103, 532, -2.3F, -27.1554F, -42.5277F, 2, 1, 3, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 405, 544, -2.0F, -24.6859F, -41.8777F, 1, 1, 1, -0.2F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 109, 537, -2.0F, -25.7859F, -41.8777F, 1, 2, 1, -0.4F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.5684F, -26.2455F, -41.5277F);
		frontsight.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.7418F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 391, 534, -0.5F, -1.0F, -1.0F, 1, 2, 3, -0.4F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.3684F, -26.2455F, -41.5277F);
		frontsight.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7418F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 382, 534, -0.5F, -1.0F, -1.0F, 1, 2, 3, -0.4F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-2.5684F, -24.2959F, -41.5277F);
		frontsight.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.7418F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 373, 534, -0.5F, -1.0F, -1.0F, 1, 2, 3, -0.4F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-0.3684F, -24.2959F, -41.5277F);
		frontsight.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.7418F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 364, 533, -0.5F, -1.0F, -1.0F, 1, 2, 3, -0.4F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.5F, -20.5878F, -40.2474F);
		frontsight.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.3927F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 34, 537, -1.2F, -2.7808F, -1.4491F, 2, 5, 1, -0.4F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 27, 537, -0.8F, -2.7808F, -1.4491F, 2, 5, 1, -0.4F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 530, 536, -0.8F, -2.2192F, 0.4491F, 2, 5, 1, -0.4F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 218, 535, -1.2F, -2.2192F, 0.4491F, 2, 5, 1, -0.4F, false));

		irons2 = new ModelRenderer(this);
		irons2.setRotationPoint(-6.5F, -36.2F, 8.55F);
		irons_upright.addChild(irons2);
		irons2.cubeList.add(new ModelBox(irons2, 364, 545, 4.4F, -12.05F, -0.75F, 1, 1, 1, -0.35F, false));
		irons2.cubeList.add(new ModelBox(irons2, 410, 545, 4.6F, -12.05F, -0.75F, 1, 1, 1, -0.35F, false));
		irons2.cubeList.add(new ModelBox(irons2, 543, 522, 4.0465F, -11.4964F, -0.75F, 1, 1, 1, -0.35F, false));
		irons2.cubeList.add(new ModelBox(irons2, 489, 545, 4.0465F, -11.6964F, -0.75F, 1, 1, 1, -0.35F, false));
		irons2.cubeList.add(new ModelBox(irons2, 510, 545, 4.4F, -11.1429F, -0.75F, 1, 1, 1, -0.35F, false));
		irons2.cubeList.add(new ModelBox(irons2, 546, 18, 4.6F, -11.1429F, -0.75F, 1, 1, 1, -0.35F, false));
		irons2.cubeList.add(new ModelBox(irons2, 540, 545, 4.9535F, -11.6964F, -0.75F, 1, 1, 1, -0.35F, false));
		irons2.cubeList.add(new ModelBox(irons2, 545, 545, 4.9535F, -11.4964F, -0.75F, 1, 1, 1, -0.35F, false));

		bone10_r1 = new ModelRenderer(this);
		bone10_r1.setRotationPoint(6.9824F, -9.3969F, -0.25F);
		irons2.addChild(bone10_r1);
		setRotationAngle(bone10_r1, 0.0F, 0.0F, 0.7854F);
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 535, 545, -2.65F, -0.4F, -0.5F, 1, 1, 1, -0.35F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 525, 545, -2.65F, -0.2F, -0.5F, 1, 1, 1, -0.35F, false));

		bone9_r1 = new ModelRenderer(this);
		bone9_r1.setRotationPoint(4.6439F, -10.8111F, -0.25F);
		irons2.addChild(bone9_r1);
		setRotationAngle(bone9_r1, 0.0F, 0.0F, 0.7854F);
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 520, 545, -0.55F, -0.5F, -0.5F, 1, 1, 1, -0.35F, false));
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 515, 545, -0.35F, -0.5F, -0.5F, 1, 1, 1, -0.35F, false));

		bone9_r2 = new ModelRenderer(this);
		bone9_r2.setRotationPoint(6.341F, -10.0383F, -0.25F);
		irons2.addChild(bone9_r2);
		setRotationAngle(bone9_r2, 0.0F, 0.0F, 0.7854F);
		bone9_r2.cubeList.add(new ModelBox(bone9_r2, 505, 545, -2.65F, -0.2F, -0.5F, 1, 1, 1, -0.35F, false));
		bone9_r2.cubeList.add(new ModelBox(bone9_r2, 545, 495, -2.65F, -0.4F, -0.5F, 1, 1, 1, -0.35F, false));

		bone8_r1 = new ModelRenderer(this);
		bone8_r1.setRotationPoint(5.2854F, -11.4525F, -0.25F);
		irons2.addChild(bone8_r1);
		setRotationAngle(bone8_r1, 0.0F, 0.0F, 0.7854F);
		bone8_r1.cubeList.add(new ModelBox(bone8_r1, 494, 545, -0.35F, -0.5F, -0.5F, 1, 1, 1, -0.35F, false));
		bone8_r1.cubeList.add(new ModelBox(bone8_r1, 102, 544, -0.55F, -0.5F, -0.5F, 1, 1, 1, -0.35F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(6.5F, 37.0F, -9.75F);
		irons2.addChild(bone6);
		bone6.cubeList.add(new ModelBox(bone6, 0, 546, -1.2929F, -47.3929F, 9.0F, 1, 1, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 546, 21, -2.7071F, -47.3929F, 9.0F, 1, 1, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 72, 543, -2.0F, -47.6858F, 9.0F, 1, 2, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 533, 138, -2.5F, -47.5858F, 9.7F, 2, 7, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 77, 543, -1.0F, -45.0858F, 9.7F, 1, 2, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 82, 543, -3.0F, -45.0858F, 9.7F, 1, 2, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 224, 491, -1.2F, -48.9858F, 9.3F, 1, 8, 2, -0.3F, false));
		bone6.cubeList.add(new ModelBox(bone6, 499, 375, -2.8F, -48.9858F, 9.3F, 1, 8, 2, -0.3F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-1.0F, -47.3929F, 9.5F);
		bone6.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 546, 9, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-2.0F, -47.3929F, 9.5F);
		bone6.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 546, 6, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-2.0F, -46.3929F, 9.5F);
		bone6.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 546, 3, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-1.0F, -46.3929F, 9.5F);
		bone6.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 0.7854F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 546, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		irons_upright.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}