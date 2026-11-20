package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FALhandleOSW extends ModelWithAttachments {
	private final ModelRenderer handleOSW;
	private final ModelRenderer Bolt;
	private final ModelRenderer bone9;
	private final ModelRenderer handleGrip;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;

	public FALhandleOSW() {
		textureWidth = 384;
		textureHeight = 384;

		handleOSW = new ModelRenderer(this);
		handleOSW.setRotationPoint(3.3732F, -12.5947F, -20.0041F);
		handleOSW.cubeList.add(new ModelBox(handleOSW, 204, 50, -2.8385F, -1.0099F, -5.4395F, 1, 1, 14, 0.0F, false));
		handleOSW.cubeList.add(new ModelBox(handleOSW, 260, 365, -2.3385F, -1.0099F, -7.6395F, 1, 1, 3, 0.0F, false));
		handleOSW.cubeList.add(new ModelBox(handleOSW, 268, 365, -2.3382F, -0.4099F, -7.6395F, 1, 1, 3, 0.0F, false));
		handleOSW.cubeList.add(new ModelBox(handleOSW, 344, 91, -2.8382F, -0.4099F, -5.4399F, 1, 1, 14, 0.0F, false));

		Bolt = new ModelRenderer(this);
		Bolt.setRotationPoint(9.4268F, 0.8447F, 11.0041F);
		handleOSW.addChild(Bolt);
		Bolt.cubeList.add(new ModelBox(Bolt, 144, 33, -11.3653F, -1.5546F, -18.1436F, 4, 1, 1, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-1.0732F, -0.0053F, -3.8459F);
		handleOSW.addChild(bone9);
		setRotationAngle(bone9, 0.0F, -0.5585F, 0.0F);
		bone9.cubeList.add(new ModelBox(bone9, 324, 373, -1.6359F, -1.0F, -0.546F, 1, 1, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 328, 373, -1.6349F, -0.4F, -0.546F, 1, 1, 1, 0.0F, false));

		handleGrip = new ModelRenderer(this);
		handleGrip.setRotationPoint(4.4515F, -0.0981F, -6.6395F);
		handleOSW.addChild(handleGrip);
		handleGrip.cubeList.add(new ModelBox(handleGrip, 168, 217, -5.24F, -1.1617F, -0.5F, 3, 1, 1, -0.125F, false));
		handleGrip.cubeList.add(new ModelBox(handleGrip, 254, 48, -5.24F, -0.6314F, 0.0303F, 3, 1, 1, -0.125F, false));
		handleGrip.cubeList.add(new ModelBox(handleGrip, 262, 48, -5.24F, -0.6314F, -1.0303F, 3, 1, 1, -0.125F, false));
		handleGrip.cubeList.add(new ModelBox(handleGrip, 270, 48, -5.24F, -0.1011F, -0.5F, 3, 1, 1, -0.125F, false));
		handleGrip.cubeList.add(new ModelBox(handleGrip, 332, 373, -2.815F, -1.6118F, -0.25F, 1, 1, 1, -0.25F, false));
		handleGrip.cubeList.add(new ModelBox(handleGrip, 336, 373, -2.815F, -1.6118F, -0.75F, 1, 1, 1, -0.25F, false));
		handleGrip.cubeList.add(new ModelBox(handleGrip, 344, 373, -2.815F, -0.9046F, 0.4571F, 1, 1, 1, -0.25F, false));
		handleGrip.cubeList.add(new ModelBox(handleGrip, 360, 373, -2.815F, 0.3025F, -0.25F, 1, 1, 1, -0.25F, false));
		handleGrip.cubeList.add(new ModelBox(handleGrip, 364, 373, -2.815F, 0.3025F, -0.75F, 1, 1, 1, -0.25F, false));
		handleGrip.cubeList.add(new ModelBox(handleGrip, 368, 373, -2.815F, -0.4046F, 0.4571F, 1, 1, 1, -0.25F, false));
		handleGrip.cubeList.add(new ModelBox(handleGrip, 4, 374, -2.815F, -0.9046F, -1.4571F, 1, 1, 1, -0.25F, false));
		handleGrip.cubeList.add(new ModelBox(handleGrip, 8, 374, -2.815F, -0.4046F, -1.4571F, 1, 1, 1, -0.25F, false));
		handleGrip.cubeList.add(new ModelBox(handleGrip, 374, 17, -5.815F, -0.4046F, 0.4571F, 1, 1, 1, -0.25F, false));
		handleGrip.cubeList.add(new ModelBox(handleGrip, 374, 21, -5.815F, 0.3025F, -0.25F, 1, 1, 1, -0.25F, false));
		handleGrip.cubeList.add(new ModelBox(handleGrip, 374, 23, -5.815F, 0.3025F, -0.75F, 1, 1, 1, -0.25F, false));
		handleGrip.cubeList.add(new ModelBox(handleGrip, 374, 27, -5.815F, -0.4046F, -1.4571F, 1, 1, 1, -0.25F, false));
		handleGrip.cubeList.add(new ModelBox(handleGrip, 28, 374, -5.815F, -0.9046F, -1.4571F, 1, 1, 1, -0.25F, false));
		handleGrip.cubeList.add(new ModelBox(handleGrip, 374, 29, -5.815F, -0.9046F, 0.4571F, 1, 1, 1, -0.25F, false));
		handleGrip.cubeList.add(new ModelBox(handleGrip, 374, 33, -5.815F, -1.6118F, -0.75F, 1, 1, 1, -0.25F, false));
		handleGrip.cubeList.add(new ModelBox(handleGrip, 374, 35, -5.815F, -1.6118F, -0.25F, 1, 1, 1, -0.25F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-5.815F, 0.406F, -1.2071F);
		handleGrip.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.7854F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 374, 37, 0.0F, -2.0F, -1.0F, 1, 1, 1, -0.25F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 372, 373, 3.0F, -2.0F, -1.0F, 1, 1, 1, -0.25F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-5.815F, 0.7596F, -1.5607F);
		handleGrip.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.7854F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 36, 374, 0.0F, -2.0F, -1.0F, 1, 1, 1, -0.25F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 374, 3.0F, -2.0F, -1.0F, 1, 1, 1, -0.25F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-5.815F, 0.406F, -0.2071F);
		handleGrip.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.7854F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 32, 374, 0.0F, -2.0F, -1.0F, 1, 1, 1, -0.25F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 340, 373, 3.0F, -2.0F, -1.0F, 1, 1, 1, -0.25F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-5.815F, 0.7596F, 0.1464F);
		handleGrip.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.7854F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 374, 31, 0.0F, -2.0F, -1.0F, 1, 1, 1, -0.25F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 356, 373, 3.0F, -2.0F, -1.0F, 1, 1, 1, -0.25F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-5.815F, 1.7596F, -1.5607F);
		handleGrip.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.7854F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 374, 25, 0.0F, -2.0F, -1.0F, 1, 1, 1, -0.25F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 16, 374, 3.0F, -2.0F, -1.0F, 1, 1, 1, -0.25F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-5.815F, 2.1131F, -1.2071F);
		handleGrip.addChild(cube_r18);
		setRotationAngle(cube_r18, -0.7854F, 0.0F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 24, 374, 0.0F, -2.0F, -1.0F, 1, 1, 1, -0.25F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 12, 374, 3.0F, -2.0F, -1.0F, 1, 1, 1, -0.25F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-5.815F, 2.1131F, -0.2071F);
		handleGrip.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.7854F, 0.0F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 20, 374, 0.0F, -2.0F, -1.0F, 1, 1, 1, -0.25F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 352, 373, 3.0F, -2.0F, -1.0F, 1, 1, 1, -0.25F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-5.815F, 1.7596F, 0.1464F);
		handleGrip.addChild(cube_r20);
		setRotationAngle(cube_r20, -0.7854F, 0.0F, 0.0F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 374, 19, 0.0F, -2.0F, -1.0F, 1, 1, 1, -0.25F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 348, 373, 3.0F, -2.0F, -1.0F, 1, 1, 1, -0.25F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-3.24F, 1.6578F, -1.0821F);
		handleGrip.addChild(cube_r21);
		setRotationAngle(cube_r21, -0.7854F, 0.0F, 0.0F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 286, 48, -2.0F, -2.0F, -1.0F, 3, 1, 1, -0.125F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-3.24F, 0.9078F, -1.0821F);
		handleGrip.addChild(cube_r22);
		setRotationAngle(cube_r22, -0.7854F, 0.0F, 0.0F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 278, 48, -2.0F, -2.0F, -1.0F, 3, 1, 1, -0.125F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-3.24F, 1.6578F, -0.3321F);
		handleGrip.addChild(cube_r23);
		setRotationAngle(cube_r23, -0.7854F, 0.0F, 0.0F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 240, 217, -2.0F, -2.0F, -1.0F, 3, 1, 1, -0.125F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-3.24F, 0.9078F, -0.3321F);
		handleGrip.addChild(cube_r24);
		setRotationAngle(cube_r24, -0.7854F, 0.0F, 0.0F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 176, 217, -2.0F, -2.0F, -1.0F, 3, 1, 1, -0.125F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handleOSW.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}