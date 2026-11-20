package com.paneedah.mwc.models;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBU88IronsRailKit extends ModelBase {
	private final ModelRenderer irons_railkit;
	private final ModelRenderer irons3;
	private final ModelRenderer bone11_r1;
	private final ModelRenderer bone10_r1;
	private final ModelRenderer bone10_r2;
	private final ModelRenderer bone9_r1;
	private final ModelRenderer bone11;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;

	public QBU88IronsRailKit() {
		textureWidth = 576;
		textureHeight = 576;

		irons_railkit = new ModelRenderer(this);
		irons_railkit.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		irons3 = new ModelRenderer(this);
		irons3.setRotationPoint(-1.5F, -40.2965F, 2.8F);
		irons_railkit.addChild(irons3);
		setRotationAngle(irons3, 1.5708F, 0.0F, 0.0F);
		irons3.cubeList.add(new ModelBox(irons3, 152, 561, -0.6F, -0.9535F, -0.5F, 1, 1, 1, -0.35F, false));
		irons3.cubeList.add(new ModelBox(irons3, 156, 561, -0.4F, -0.9535F, -0.5F, 1, 1, 1, -0.35F, false));
		irons3.cubeList.add(new ModelBox(irons3, 160, 561, -0.9535F, -0.4F, -0.5F, 1, 1, 1, -0.35F, false));
		irons3.cubeList.add(new ModelBox(irons3, 164, 561, -0.9535F, -0.6F, -0.5F, 1, 1, 1, -0.35F, false));
		irons3.cubeList.add(new ModelBox(irons3, 192, 561, -0.6F, -0.0464F, -0.5F, 1, 1, 1, -0.35F, false));
		irons3.cubeList.add(new ModelBox(irons3, 204, 561, -0.4F, -0.0464F, -0.5F, 1, 1, 1, -0.35F, false));
		irons3.cubeList.add(new ModelBox(irons3, 246, 561, -0.0465F, -0.6F, -0.5F, 1, 1, 1, -0.35F, false));
		irons3.cubeList.add(new ModelBox(irons3, 250, 561, -0.0465F, -0.4F, -0.5F, 1, 1, 1, -0.35F, false));

		bone11_r1 = new ModelRenderer(this);
		bone11_r1.setRotationPoint(1.9824F, 1.6996F, 0.0F);
		irons3.addChild(bone11_r1);
		setRotationAngle(bone11_r1, 0.0F, 0.0F, 0.7854F);
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 242, 561, -2.65F, -0.4F, -0.5F, 1, 1, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 238, 561, -2.65F, -0.2F, -0.5F, 1, 1, 1, -0.35F, false));

		bone10_r1 = new ModelRenderer(this);
		bone10_r1.setRotationPoint(-0.3561F, 0.2854F, 0.0F);
		irons3.addChild(bone10_r1);
		setRotationAngle(bone10_r1, 0.0F, 0.0F, 0.7854F);
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 212, 561, -0.55F, -0.5F, -0.5F, 1, 1, 1, -0.35F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 208, 561, -0.35F, -0.5F, -0.5F, 1, 1, 1, -0.35F, false));

		bone10_r2 = new ModelRenderer(this);
		bone10_r2.setRotationPoint(1.341F, 1.0581F, 0.0F);
		irons3.addChild(bone10_r2);
		setRotationAngle(bone10_r2, 0.0F, 0.0F, 0.7854F);
		bone10_r2.cubeList.add(new ModelBox(bone10_r2, 188, 561, -2.65F, -0.2F, -0.5F, 1, 1, 1, -0.35F, false));
		bone10_r2.cubeList.add(new ModelBox(bone10_r2, 176, 561, -2.65F, -0.4F, -0.5F, 1, 1, 1, -0.35F, false));

		bone9_r1 = new ModelRenderer(this);
		bone9_r1.setRotationPoint(0.2854F, -0.3561F, 0.0F);
		irons3.addChild(bone9_r1);
		setRotationAngle(bone9_r1, 0.0F, 0.0F, 0.7854F);
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 172, 561, -0.35F, -0.5F, -0.5F, 1, 1, 1, -0.35F, false));
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 168, 561, -0.55F, -0.5F, -0.5F, 1, 1, 1, -0.35F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(1.5F, 48.0964F, -9.5F);
		irons3.addChild(bone11);
		bone11.cubeList.add(new ModelBox(bone11, 254, 561, -1.2929F, -47.3929F, 9.0F, 1, 1, 1, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 258, 561, -2.7071F, -47.3929F, 9.0F, 1, 1, 1, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 560, 49, -2.0F, -47.6858F, 9.0F, 1, 2, 1, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 492, 553, -2.5F, -47.5858F, 9.7F, 2, 6, 1, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 560, 52, -1.0F, -45.0858F, 9.7F, 1, 2, 1, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 560, 147, -3.0F, -45.0858F, 9.7F, 1, 2, 1, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 478, 169, -1.2F, -48.9858F, 9.3F, 1, 8, 2, -0.3F, false));
		bone11.cubeList.add(new ModelBox(bone11, 48, 526, -2.8F, -48.9858F, 9.3F, 1, 8, 2, -0.3F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-1.0F, -47.3929F, 9.5F);
		bone11.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, 0.7854F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 274, 561, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-2.0F, -47.3929F, 9.5F);
		bone11.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, 0.7854F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 270, 561, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-2.0F, -46.3929F, 9.5F);
		bone11.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, 0.7854F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 266, 561, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-1.0F, -46.3929F, 9.5F);
		bone11.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, 0.7854F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 262, 561, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		irons_railkit.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}