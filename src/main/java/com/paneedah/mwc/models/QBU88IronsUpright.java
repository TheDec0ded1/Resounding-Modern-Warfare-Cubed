package com.paneedah.mwc.models;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBU88IronsUpright extends ModelBase {
	private final ModelRenderer irons_upright;
	private final ModelRenderer frontsight;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer irons2;
	private final ModelRenderer bone10_r1;
	private final ModelRenderer bone9_r1;
	private final ModelRenderer bone9_r2;
	private final ModelRenderer bone8_r1;
	private final ModelRenderer bone6;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;

	public QBU88IronsUpright() {
		textureWidth = 576;
		textureHeight = 576;

		irons_upright = new ModelRenderer(this);
		irons_upright.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		frontsight = new ModelRenderer(this);
		frontsight.setRotationPoint(0.0F, -22.0F, -3.3F);
		irons_upright.addChild(frontsight);
		frontsight.cubeList.add(new ModelBox(frontsight, 536, 557, -2.5F, -24.1859F, -40.7277F, 2, 2, 1, -0.2F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 418, 385, -2.5F, -24.1859F, -42.3277F, 2, 2, 2, -0.2F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 556, 352, -2.5F, -23.6859F, -41.5277F, 2, 1, 1, -0.1F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 536, 552, -2.5F, -18.9898F, -40.7671F, 2, 3, 2, -0.2F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 240, 557, -2.5F, -18.9898F, -39.1671F, 2, 3, 1, -0.2F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 548, 447, -0.4893F, -26.2707F, -42.5277F, 1, 2, 3, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 26, 549, -3.4475F, -26.2707F, -42.5277F, 1, 2, 3, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 422, 557, -0.7893F, -25.7707F, -41.5027F, 1, 1, 2, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 428, 557, -3.1475F, -25.7707F, -41.5027F, 1, 1, 2, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 434, 557, -0.7893F, -25.7707F, -41.6277F, 1, 1, 2, -0.3F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 522, 557, -3.1475F, -25.7707F, -41.6277F, 1, 1, 2, -0.3F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 546, 132, -2.6368F, -27.1554F, -42.5277F, 2, 1, 3, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 546, 136, -2.3F, -27.1554F, -42.5277F, 2, 1, 3, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 560, 476, -2.0F, -24.6859F, -41.8777F, 1, 1, 1, -0.2F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 382, 559, -2.0F, -25.7859F, -41.8777F, 1, 2, 1, -0.4F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-2.5684F, -26.2455F, -41.5277F);
		frontsight.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, 0.7418F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 548, 74, -0.5F, -1.0F, -1.0F, 1, 2, 3, -0.4F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-0.3684F, -26.2455F, -41.5277F);
		frontsight.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, -0.7418F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 548, 69, -0.5F, -1.0F, -1.0F, 1, 2, 3, -0.4F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-2.5684F, -24.2959F, -41.5277F);
		frontsight.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, -0.7418F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 548, 64, -0.5F, -1.0F, -1.0F, 1, 2, 3, -0.4F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-0.3684F, -24.2959F, -41.5277F);
		frontsight.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, 0.7418F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 386, 508, -0.5F, -1.0F, -1.0F, 1, 2, 3, -0.4F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-1.5F, -20.5878F, -40.2474F);
		frontsight.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.3927F, 0.0F, 0.0F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 516, 553, -1.2F, -2.7808F, -1.4491F, 2, 5, 1, -0.4F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 510, 553, -0.8F, -2.7808F, -1.4491F, 2, 5, 1, -0.4F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 504, 553, -0.8F, -2.2192F, 0.4491F, 2, 5, 1, -0.4F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 498, 553, -1.2F, -2.2192F, 0.4491F, 2, 5, 1, -0.4F, false));

		irons2 = new ModelRenderer(this);
		irons2.setRotationPoint(-6.5F, -36.2F, 8.55F);
		irons_upright.addChild(irons2);
		irons2.cubeList.add(new ModelBox(irons2, 138, 456, 4.4F, -12.05F, -0.75F, 1, 1, 1, -0.35F, false));
		irons2.cubeList.add(new ModelBox(irons2, 480, 253, 4.6F, -12.05F, -0.75F, 1, 1, 1, -0.35F, false));
		irons2.cubeList.add(new ModelBox(irons2, 54, 512, 4.0465F, -11.4964F, -0.75F, 1, 1, 1, -0.35F, false));
		irons2.cubeList.add(new ModelBox(irons2, 512, 157, 4.0465F, -11.6964F, -0.75F, 1, 1, 1, -0.35F, false));
		irons2.cubeList.add(new ModelBox(irons2, 560, 150, 4.4F, -11.1429F, -0.75F, 1, 1, 1, -0.35F, false));
		irons2.cubeList.add(new ModelBox(irons2, 560, 152, 4.6F, -11.1429F, -0.75F, 1, 1, 1, -0.35F, false));
		irons2.cubeList.add(new ModelBox(irons2, 184, 560, 4.9535F, -11.6964F, -0.75F, 1, 1, 1, -0.35F, false));
		irons2.cubeList.add(new ModelBox(irons2, 200, 560, 4.9535F, -11.4964F, -0.75F, 1, 1, 1, -0.35F, false));

		bone10_r1 = new ModelRenderer(this);
		bone10_r1.setRotationPoint(6.9824F, -9.3969F, -0.25F);
		irons2.addChild(bone10_r1);
		setRotationAngle(bone10_r1, 0.0F, 0.0F, 0.7854F);
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 560, 168, -2.65F, -0.4F, -0.5F, 1, 1, 1, -0.35F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 560, 166, -2.65F, -0.2F, -0.5F, 1, 1, 1, -0.35F, false));

		bone9_r1 = new ModelRenderer(this);
		bone9_r1.setRotationPoint(4.6439F, -10.8111F, -0.25F);
		irons2.addChild(bone9_r1);
		setRotationAngle(bone9_r1, 0.0F, 0.0F, 0.7854F);
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 560, 164, -0.55F, -0.5F, -0.5F, 1, 1, 1, -0.35F, false));
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 560, 154, -0.35F, -0.5F, -0.5F, 1, 1, 1, -0.35F, false));

		bone9_r2 = new ModelRenderer(this);
		bone9_r2.setRotationPoint(6.341F, -10.0383F, -0.25F);
		irons2.addChild(bone9_r2);
		setRotationAngle(bone9_r2, 0.0F, 0.0F, 0.7854F);
		bone9_r2.cubeList.add(new ModelBox(bone9_r2, 240, 555, -2.65F, -0.2F, -0.5F, 1, 1, 1, -0.35F, false));
		bone9_r2.cubeList.add(new ModelBox(bone9_r2, 30, 554, -2.65F, -0.4F, -0.5F, 1, 1, 1, -0.35F, false));

		bone8_r1 = new ModelRenderer(this);
		bone8_r1.setRotationPoint(5.2854F, -11.4525F, -0.25F);
		irons2.addChild(bone8_r1);
		setRotationAngle(bone8_r1, 0.0F, 0.0F, 0.7854F);
		bone8_r1.cubeList.add(new ModelBox(bone8_r1, 196, 551, -0.35F, -0.5F, -0.5F, 1, 1, 1, -0.35F, false));
		bone8_r1.cubeList.add(new ModelBox(bone8_r1, 536, 243, -0.55F, -0.5F, -0.5F, 1, 1, 1, -0.35F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(6.5F, 37.0F, -9.75F);
		irons2.addChild(bone6);
		bone6.cubeList.add(new ModelBox(bone6, 222, 560, -1.2929F, -47.3929F, 9.0F, 1, 1, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 226, 560, -2.7071F, -47.3929F, 9.0F, 1, 1, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 62, 468, -2.0F, -47.6858F, 9.0F, 1, 2, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 548, 20, -2.5F, -47.5858F, 9.7F, 2, 7, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 560, 23, -1.0F, -45.0858F, 9.7F, 1, 2, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 24, 560, -3.0F, -45.0858F, 9.7F, 1, 2, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 474, 245, -1.2F, -48.9858F, 9.3F, 1, 8, 2, -0.3F, false));
		bone6.cubeList.add(new ModelBox(bone6, 478, 159, -2.8F, -48.9858F, 9.3F, 1, 8, 2, -0.3F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-1.0F, -47.3929F, 9.5F);
		bone6.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, 0.7854F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 560, 244, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(-2.0F, -47.3929F, 9.5F);
		bone6.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.0F, 0.0F, 0.7854F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 560, 242, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(-2.0F, -46.3929F, 9.5F);
		bone6.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.0F, 0.0F, 0.7854F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 234, 560, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(-1.0F, -46.3929F, 9.5F);
		bone6.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.0F, 0.0F, 0.7854F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 230, 560, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
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