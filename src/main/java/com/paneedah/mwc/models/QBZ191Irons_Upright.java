package com.paneedah.mwc.models;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBZ191Irons_Upright extends ModelBase {
	private final ModelRenderer ironsQBZ191_upright;
	private final ModelRenderer frontsight3;
	private final ModelRenderer bone9_r1;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer irons2;
	private final ModelRenderer bone10_r1;
	private final ModelRenderer bone11_r1;
	private final ModelRenderer bone7;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;

	public QBZ191Irons_Upright() {
		textureWidth = 400;
		textureHeight = 400;

		ironsQBZ191_upright = new ModelRenderer(this);
		ironsQBZ191_upright.setRotationPoint(0.0F, -21.4F, 0.0F);
		

		frontsight3 = new ModelRenderer(this);
		frontsight3.setRotationPoint(-1.4835F, -2.9599F, -51.6628F);
		ironsQBZ191_upright.addChild(frontsight3);
		setRotationAngle(frontsight3, -1.5708F, 0.0F, 0.0F);
		

		bone9_r1 = new ModelRenderer(this);
		bone9_r1.setRotationPoint(-0.0165F, 1.6893F, 4.7351F);
		frontsight3.addChild(bone9_r1);
		setRotationAngle(bone9_r1, 1.5708F, 0.0F, 0.0F);
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 368, 373, -0.5F, -1.1153F, -0.45F, 1, 2, 1, -0.4F, false));
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 334, 393, -0.5F, -0.0153F, -0.45F, 1, 1, 1, -0.2F, false));
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 170, 390, -1.0F, -2.4847F, -1.0F, 2, 1, 2, -0.4F, false));
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 390, 243, -1.8107F, -1.6F, -1.0F, 1, 2, 2, -0.4F, false));
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 390, 239, 0.8107F, -1.6F, -1.0F, 1, 2, 2, -0.4F, false));
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 218, 378, -1.0F, 0.4847F, -0.2F, 2, 3, 1, -0.2F, false));
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 316, 160, -1.0F, 0.4847F, -0.8F, 2, 3, 1, -0.2F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-0.0165F, 1.6893F, 4.7351F);
		frontsight3.addChild(cube_r7);
		setRotationAngle(cube_r7, 1.5708F, -0.7418F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 390, 235, -2.2508F, -1.5317F, -1.0F, 1, 2, 2, -0.4F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-0.0165F, 1.6893F, 4.7351F);
		frontsight3.addChild(cube_r8);
		setRotationAngle(cube_r8, 1.5708F, 0.7418F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 390, 231, 1.2508F, -1.5317F, -1.0F, 1, 2, 2, -0.4F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-0.0165F, 1.6893F, 4.7351F);
		frontsight3.addChild(cube_r9);
		setRotationAngle(cube_r9, 1.5708F, 0.5236F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 390, 227, -1.6217F, -1.1054F, -1.0F, 1, 2, 2, -0.4F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-0.0165F, 1.6893F, 4.7351F);
		frontsight3.addChild(cube_r10);
		setRotationAngle(cube_r10, 1.5708F, -0.5236F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 74, 390, 0.6217F, -1.1054F, -1.0F, 1, 2, 2, -0.4F, false));

		irons2 = new ModelRenderer(this);
		irons2.setRotationPoint(-1.5F, -3.7965F, 0.8F);
		ironsQBZ191_upright.addChild(irons2);
		setRotationAngle(irons2, -1.5708F, 0.0F, 0.0F);
		

		bone10_r1 = new ModelRenderer(this);
		bone10_r1.setRotationPoint(0.0F, 0.0786F, 0.1625F);
		irons2.addChild(bone10_r1);
		setRotationAngle(bone10_r1, 1.5708F, 0.0F, 0.0F);
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 50, 394, -0.0465F, 4.2214F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 46, 394, -0.0465F, 4.0214F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 26, 394, -0.4F, 4.575F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 22, 394, -0.6F, 4.575F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 350, 393, -0.9535F, 4.0214F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 346, 393, -0.9535F, 4.2214F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 342, 393, -0.4F, 3.6679F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 338, 393, -0.6F, 3.6679F, -3.2375F, 1, 1, 1, -0.35F, false));

		bone11_r1 = new ModelRenderer(this);
		bone11_r1.setRotationPoint(0.0F, 0.0786F, 0.1625F);
		irons2.addChild(bone11_r1);
		setRotationAngle(bone11_r1, 1.5708F, -0.7854F, 0.0F);
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 42, 394, 3.2214F, 2.6679F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 38, 394, 3.2214F, 2.8679F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 34, 394, 2.6679F, 3.2214F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 30, 394, 2.8679F, 3.2214F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 18, 394, 2.3143F, 2.8679F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 14, 394, 2.3143F, 2.6679F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 4, 394, 2.8679F, 2.3143F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 354, 393, 2.6679F, 2.3143F, -3.2375F, 1, 1, 1, -0.35F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(1.5F, 48.0964F, -9.5F);
		irons2.addChild(bone7);
		

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-1.5F, -48.0179F, 9.6625F);
		bone7.addChild(cube_r11);
		setRotationAngle(cube_r11, 1.5708F, -0.7854F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 108, 394, 3.6189F, 2.9118F, -3.5625F, 1, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 104, 394, 2.9118F, 3.6189F, -3.5625F, 1, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 100, 394, 3.6189F, 4.326F, -3.5625F, 1, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 74, 394, 4.326F, 3.6189F, -3.5625F, 1, 1, 1, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-1.5F, -48.0179F, 9.6625F);
		bone7.addChild(cube_r12);
		setRotationAngle(cube_r12, 1.5708F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 384, 390, -0.5F, 5.2321F, -3.5625F, 1, 4, 1, 0.1F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 154, 393, -0.5F, 5.0321F, -3.5625F, 1, 2, 1, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 58, 394, -1.2071F, 5.325F, -3.5625F, 1, 1, 1, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 54, 394, 0.2071F, 5.325F, -3.5625F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ironsQBZ191_upright.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}