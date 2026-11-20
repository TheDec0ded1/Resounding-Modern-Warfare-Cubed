package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FALhandle extends ModelWithAttachments {
	private final ModelRenderer handle;
	private final ModelRenderer Bolt;
	private final ModelRenderer bone9;
	private final ModelRenderer handleGrip;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;

	public FALhandle() {
		textureWidth = 624;
		textureHeight = 624;

		handle = new ModelRenderer(this);
		handle.setRotationPoint(3.3732F, -12.5947F, -23.0041F);
		handle.cubeList.add(new ModelBox(handle, 568, 534, -2.8385F, -1.0099F, -5.4395F, 1, 1, 17, 0.0F, false));
		handle.cubeList.add(new ModelBox(handle, 530, 456, -2.3385F, -1.0099F, -7.6395F, 1, 1, 3, 0.0F, false));
		handle.cubeList.add(new ModelBox(handle, 504, 604, -2.3382F, -0.4099F, -7.6395F, 1, 1, 3, 0.0F, false));
		handle.cubeList.add(new ModelBox(handle, 328, 572, -2.8382F, -0.4099F, -5.4399F, 1, 1, 17, 0.0F, false));

		Bolt = new ModelRenderer(this);
		Bolt.setRotationPoint(9.4268F, 0.8447F, 11.0041F);
		handle.addChild(Bolt);
		Bolt.cubeList.add(new ModelBox(Bolt, 190, 162, -11.3653F, -1.5546F, -18.1436F, 4, 1, 1, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-1.0732F, -0.0053F, -3.8459F);
		handle.addChild(bone9);
		setRotationAngle(bone9, 0.0F, -0.5585F, 0.0F);
		bone9.cubeList.add(new ModelBox(bone9, 522, 306, -1.6359F, -1.0F, -0.546F, 1, 1, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 526, 306, -1.6349F, -0.4F, -0.546F, 1, 1, 1, 0.0F, false));

		handleGrip = new ModelRenderer(this);
		handleGrip.setRotationPoint(4.4515F, -0.0981F, -6.6395F);
		handle.addChild(handleGrip);
		handleGrip.cubeList.add(new ModelBox(handleGrip, 218, 162, -5.24F, -1.1617F, -0.5F, 3, 1, 1, -0.125F, false));
		handleGrip.cubeList.add(new ModelBox(handleGrip, 226, 162, -5.24F, -0.6314F, 0.0303F, 3, 1, 1, -0.125F, false));
		handleGrip.cubeList.add(new ModelBox(handleGrip, 298, 204, -5.24F, -0.6314F, -1.0303F, 3, 1, 1, -0.125F, false));
		handleGrip.cubeList.add(new ModelBox(handleGrip, 290, 204, -5.24F, -0.1011F, -0.5F, 3, 1, 1, -0.125F, false));
		handleGrip.cubeList.add(new ModelBox(handleGrip, 332, 609, -2.815F, -1.6118F, -0.25F, 1, 1, 1, -0.25F, false));
		handleGrip.cubeList.add(new ModelBox(handleGrip, 336, 609, -2.815F, -1.6118F, -0.75F, 1, 1, 1, -0.25F, false));
		handleGrip.cubeList.add(new ModelBox(handleGrip, 324, 609, -2.815F, -0.9046F, 0.4571F, 1, 1, 1, -0.25F, false));
		handleGrip.cubeList.add(new ModelBox(handleGrip, 608, 379, -2.815F, 0.3025F, -0.25F, 1, 1, 1, -0.25F, false));
		handleGrip.cubeList.add(new ModelBox(handleGrip, 340, 609, -2.815F, 0.3025F, -0.75F, 1, 1, 1, -0.25F, false));
		handleGrip.cubeList.add(new ModelBox(handleGrip, 606, 532, -2.815F, -0.4046F, 0.4571F, 1, 1, 1, -0.25F, false));
		handleGrip.cubeList.add(new ModelBox(handleGrip, 352, 609, -2.815F, -0.9046F, -1.4571F, 1, 1, 1, -0.25F, false));
		handleGrip.cubeList.add(new ModelBox(handleGrip, 348, 609, -2.815F, -0.4046F, -1.4571F, 1, 1, 1, -0.25F, false));
		handleGrip.cubeList.add(new ModelBox(handleGrip, 450, 609, -5.815F, -0.4046F, 0.4571F, 1, 1, 1, -0.25F, false));
		handleGrip.cubeList.add(new ModelBox(handleGrip, 438, 609, -5.815F, 0.3025F, -0.25F, 1, 1, 1, -0.25F, false));
		handleGrip.cubeList.add(new ModelBox(handleGrip, 434, 609, -5.815F, 0.3025F, -0.75F, 1, 1, 1, -0.25F, false));
		handleGrip.cubeList.add(new ModelBox(handleGrip, 426, 609, -5.815F, -0.4046F, -1.4571F, 1, 1, 1, -0.25F, false));
		handleGrip.cubeList.add(new ModelBox(handleGrip, 422, 609, -5.815F, -0.9046F, -1.4571F, 1, 1, 1, -0.25F, false));
		handleGrip.cubeList.add(new ModelBox(handleGrip, 418, 609, -5.815F, -0.9046F, 0.4571F, 1, 1, 1, -0.25F, false));
		handleGrip.cubeList.add(new ModelBox(handleGrip, 406, 609, -5.815F, -1.6118F, -0.75F, 1, 1, 1, -0.25F, false));
		handleGrip.cubeList.add(new ModelBox(handleGrip, 402, 609, -5.815F, -1.6118F, -0.25F, 1, 1, 1, -0.25F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-5.815F, 0.406F, -1.2071F);
		handleGrip.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.7854F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 398, 609, 0.0F, -2.0F, -1.0F, 1, 1, 1, -0.25F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 356, 609, 3.0F, -2.0F, -1.0F, 1, 1, 1, -0.25F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-5.815F, 0.7596F, -1.5607F);
		handleGrip.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.7854F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 168, 612, 0.0F, -2.0F, -1.0F, 1, 1, 1, -0.25F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 164, 612, 3.0F, -2.0F, -1.0F, 1, 1, 1, -0.25F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-5.815F, 0.406F, -0.2071F);
		handleGrip.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.7854F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 410, 609, 0.0F, -2.0F, -1.0F, 1, 1, 1, -0.25F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 328, 609, 3.0F, -2.0F, -1.0F, 1, 1, 1, -0.25F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-5.815F, 0.7596F, 0.1464F);
		handleGrip.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.7854F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 414, 609, 0.0F, -2.0F, -1.0F, 1, 1, 1, -0.25F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 608, 514, 3.0F, -2.0F, -1.0F, 1, 1, 1, -0.25F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-5.815F, 1.7596F, -1.5607F);
		handleGrip.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.7854F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 172, 612, 0.0F, -2.0F, -1.0F, 1, 1, 1, -0.25F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 160, 612, 3.0F, -2.0F, -1.0F, 1, 1, 1, -0.25F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-5.815F, 2.1131F, -1.2071F);
		handleGrip.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.7854F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 430, 609, 0.0F, -2.0F, -1.0F, 1, 1, 1, -0.25F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 344, 609, 3.0F, -2.0F, -1.0F, 1, 1, 1, -0.25F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-5.815F, 2.1131F, -0.2071F);
		handleGrip.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.7854F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 442, 609, 0.0F, -2.0F, -1.0F, 1, 1, 1, -0.25F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 608, 550, 3.0F, -2.0F, -1.0F, 1, 1, 1, -0.25F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-5.815F, 1.7596F, 0.1464F);
		handleGrip.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.7854F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 446, 609, 0.0F, -2.0F, -1.0F, 1, 1, 1, -0.25F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 608, 596, 3.0F, -2.0F, -1.0F, 1, 1, 1, -0.25F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-3.24F, 1.6578F, -1.0821F);
		handleGrip.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.7854F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 234, 162, -2.0F, -2.0F, -1.0F, 3, 1, 1, -0.125F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-3.24F, 0.9078F, -1.0821F);
		handleGrip.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.7854F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 236, 39, -2.0F, -2.0F, -1.0F, 3, 1, 1, -0.125F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-3.24F, 1.6578F, -0.3321F);
		handleGrip.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.7854F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 228, 39, -2.0F, -2.0F, -1.0F, 3, 1, 1, -0.125F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-3.24F, 0.9078F, -0.3321F);
		handleGrip.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.7854F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 220, 39, -2.0F, -2.0F, -1.0F, 3, 1, 1, -0.125F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handle.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}