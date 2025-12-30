package com.paneedah.mwc.models;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBU191Irons_Upright extends ModelBase {
	private final ModelRenderer ironsQBU_upright;
	private final ModelRenderer frontsight3;
	private final ModelRenderer bone9_r1;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer irons2;
	private final ModelRenderer bone10_r1;
	private final ModelRenderer bone11_r1;
	private final ModelRenderer bone7;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;

	public QBU191Irons_Upright() {
		textureWidth = 416;
		textureHeight = 416;

		ironsQBU_upright = new ModelRenderer(this);
		ironsQBU_upright.setRotationPoint(0.0F, -21.4F, 0.0F);
		

		frontsight3 = new ModelRenderer(this);
		frontsight3.setRotationPoint(-1.4835F, -2.9599F, -65.2628F);
		ironsQBU_upright.addChild(frontsight3);
		setRotationAngle(frontsight3, -1.5708F, 0.0F, 0.0F);
		

		bone9_r1 = new ModelRenderer(this);
		bone9_r1.setRotationPoint(-0.0165F, 1.6893F, 4.7351F);
		frontsight3.addChild(bone9_r1);
		setRotationAngle(bone9_r1, 1.5708F, 0.0F, 0.0F);
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 122, 400, -0.5F, -1.1153F, -0.45F, 1, 2, 1, -0.4F, false));
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 400, 238, -0.5F, -0.0153F, -0.45F, 1, 1, 1, -0.2F, false));
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 162, 394, -1.0F, -2.4847F, -1.0F, 2, 1, 2, -0.4F, false));
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 228, 396, -1.8107F, -1.6F, -1.0F, 1, 2, 2, -0.4F, false));
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 222, 396, 0.8107F, -1.6F, -1.0F, 1, 2, 2, -0.4F, false));
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 144, 396, -1.0F, 0.4847F, -0.2F, 2, 3, 1, -0.2F, false));
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 120, 396, -1.0F, 0.4847F, -0.8F, 2, 3, 1, -0.2F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.0165F, 1.6893F, 4.7351F);
		frontsight3.addChild(cube_r1);
		setRotationAngle(cube_r1, 1.5708F, -0.7418F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 216, 396, -2.2508F, -1.5317F, -1.0F, 1, 2, 2, -0.4F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.0165F, 1.6893F, 4.7351F);
		frontsight3.addChild(cube_r2);
		setRotationAngle(cube_r2, 1.5708F, 0.7418F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 210, 396, 1.2508F, -1.5317F, -1.0F, 1, 2, 2, -0.4F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-0.0165F, 1.6893F, 4.7351F);
		frontsight3.addChild(cube_r3);
		setRotationAngle(cube_r3, 1.5708F, 0.5236F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 204, 396, -1.6217F, -1.1054F, -1.0F, 1, 2, 2, -0.4F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-0.0165F, 1.6893F, 4.7351F);
		frontsight3.addChild(cube_r4);
		setRotationAngle(cube_r4, 1.5708F, -0.5236F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 396, 194, 0.6217F, -1.1054F, -1.0F, 1, 2, 2, -0.4F, false));

		irons2 = new ModelRenderer(this);
		irons2.setRotationPoint(-1.5F, -3.7965F, 0.8F);
		ironsQBU_upright.addChild(irons2);
		setRotationAngle(irons2, -1.5708F, 0.0F, 0.0F);
		

		bone10_r1 = new ModelRenderer(this);
		bone10_r1.setRotationPoint(0.0F, 0.0786F, 0.1625F);
		irons2.addChild(bone10_r1);
		setRotationAngle(bone10_r1, 1.5708F, 0.0F, 0.0F);
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 400, 260, -0.0465F, 4.2214F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 400, 258, -0.0465F, 4.0214F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 400, 252, -0.4F, 4.575F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 400, 250, -0.6F, 4.575F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 400, 244, -0.9535F, 4.0214F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 400, 242, -0.9535F, 4.2214F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 242, 400, -0.4F, 3.6679F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 400, 240, -0.6F, 3.6679F, -3.2375F, 1, 1, 1, -0.35F, false));

		bone11_r1 = new ModelRenderer(this);
		bone11_r1.setRotationPoint(0.0F, 0.0786F, 0.1625F);
		irons2.addChild(bone11_r1);
		setRotationAngle(bone11_r1, 1.5708F, -0.7854F, 0.0F);
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 258, 400, 3.2214F, 2.6679F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 400, 256, 3.2214F, 2.8679F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 400, 254, 2.6679F, 3.2214F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 254, 400, 2.8679F, 3.2214F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 250, 400, 2.3143F, 2.8679F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 400, 248, 2.3143F, 2.6679F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 400, 246, 2.8679F, 2.3143F, -3.2375F, 1, 1, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 246, 400, 2.6679F, 2.3143F, -3.2375F, 1, 1, 1, -0.35F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(1.5F, 48.0964F, -9.5F);
		irons2.addChild(bone7);
		

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.5F, -48.0179F, 9.6625F);
		bone7.addChild(cube_r7);
		setRotationAngle(cube_r7, 1.5708F, -0.7854F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 400, 270, 3.6189F, 2.9118F, -3.5625F, 1, 1, 1, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 400, 268, 2.9118F, 3.6189F, -3.5625F, 1, 1, 1, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 268, 400, 3.6189F, 4.326F, -3.5625F, 1, 1, 1, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 400, 266, 4.326F, 3.6189F, -3.5625F, 1, 1, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-1.5F, -48.0179F, 9.6625F);
		bone7.addChild(cube_r8);
		setRotationAngle(cube_r8, 1.5708F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 274, 397, -0.5F, 5.2321F, -3.5625F, 1, 4, 1, 0.1F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 126, 400, -0.5F, 5.0321F, -3.5625F, 1, 2, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 400, 264, -1.2071F, 5.325F, -3.5625F, 1, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 400, 262, 0.2071F, 5.325F, -3.5625F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ironsQBU_upright.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}