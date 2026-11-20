package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FALironsPara extends ModelBase {
	private final ModelRenderer ironsPara;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer irons2;
	private final ModelRenderer bone11_r1;
	private final ModelRenderer bone11_r2;

	public FALironsPara() {
		textureWidth = 624;
		textureHeight = 624;

		ironsPara = new ModelRenderer(this);
		ironsPara.setRotationPoint(0.25F, -16.7087F, 4.3564F);
		ironsPara.cubeList.add(new ModelBox(ironsPara, 582, 400, -2.975F, -1.0F, 0.0F, 2, 2, 4, 0.0F, false));
		ironsPara.cubeList.add(new ModelBox(ironsPara, 522, 381, -1.525F, -1.0F, 0.0F, 1, 2, 4, 0.0F, false));
		ironsPara.cubeList.add(new ModelBox(ironsPara, 392, 232, -3.25F, -2.0F, 1.5F, 3, 1, 1, 0.0F, false));
		ironsPara.cubeList.add(new ModelBox(ironsPara, 12, 608, -3.5F, -2.5F, 1.0F, 1, 2, 2, 0.0F, false));
		ironsPara.cubeList.add(new ModelBox(ironsPara, 524, 168, -1.275F, -2.75F, 2.25F, 1, 2, 2, -0.25F, false));
		ironsPara.cubeList.add(new ModelBox(ironsPara, 392, 607, -1.275F, -2.75F, -0.25F, 1, 2, 2, -0.25F, false));
		ironsPara.cubeList.add(new ModelBox(ironsPara, 280, 609, -1.275F, -3.8107F, 2.1893F, 1, 2, 1, -0.25F, false));
		ironsPara.cubeList.add(new ModelBox(ironsPara, 250, 606, -1.275F, -3.8107F, 0.8107F, 1, 3, 2, -0.25F, false));
		ironsPara.cubeList.add(new ModelBox(ironsPara, 158, 584, -3.225F, -2.75F, 2.25F, 1, 2, 2, -0.25F, false));
		ironsPara.cubeList.add(new ModelBox(ironsPara, 6, 608, -3.225F, -2.75F, -0.25F, 1, 2, 2, -0.25F, false));
		ironsPara.cubeList.add(new ModelBox(ironsPara, 256, 606, -3.225F, -3.8107F, 0.8107F, 1, 3, 2, -0.25F, false));
		ironsPara.cubeList.add(new ModelBox(ironsPara, 284, 609, -3.225F, -3.8107F, 2.1893F, 1, 2, 1, -0.25F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-3.225F, -3.2071F, -1.0607F);
		ironsPara.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.7854F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 608, 0.0F, -2.0F, 1.0F, 1, 2, 2, -0.25F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 592, 607, 1.95F, -2.0F, 1.0F, 1, 2, 2, -0.25F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-3.225F, -3.2071F, 0.818F);
		ironsPara.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.7854F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 598, 607, 0.0F, -2.0F, 1.0F, 1, 2, 2, -0.25F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 136, 607, 1.95F, -2.0F, 1.0F, 1, 2, 2, -0.25F, false));

		irons2 = new ModelRenderer(this);
		irons2.setRotationPoint(-1.7498F, -3.2205F, 1.9775F);
		ironsPara.addChild(irons2);
		setRotationAngle(irons2, -1.5708F, 0.0F, 0.0F);
		

		bone11_r1 = new ModelRenderer(this);
		bone11_r1.setRotationPoint(-0.0002F, -2.8375F, -4.1548F);
		irons2.addChild(bone11_r1);
		setRotationAngle(bone11_r1, 1.5708F, 0.0F, 0.0F);
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 474, 309, -0.9964F, 4.7214F, -3.3375F, 2, 2, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 518, 385, -0.0465F, 3.9214F, -3.3375F, 1, 2, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 324, 588, -0.4F, 4.475F, -3.3375F, 1, 1, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 320, 588, -0.6F, 4.475F, -3.3375F, 1, 1, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 242, 162, -0.9535F, 3.9214F, -3.3375F, 1, 2, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 76, 577, -0.4F, 3.5679F, -3.3375F, 1, 1, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 72, 577, -0.6F, 3.5679F, -3.3375F, 1, 1, 1, -0.35F, false));

		bone11_r2 = new ModelRenderer(this);
		bone11_r2.setRotationPoint(-0.0002F, -2.8375F, -4.1548F);
		irons2.addChild(bone11_r2);
		setRotationAngle(bone11_r2, 1.5708F, -0.7854F, 0.0F);
		bone11_r2.cubeList.add(new ModelBox(bone11_r2, 604, 550, 3.1507F, 2.5971F, -3.3375F, 1, 1, 1, -0.35F, false));
		bone11_r2.cubeList.add(new ModelBox(bone11_r2, 160, 593, 3.1507F, 2.7971F, -3.3375F, 1, 1, 1, -0.35F, false));
		bone11_r2.cubeList.add(new ModelBox(bone11_r2, 156, 593, 2.5972F, 3.1507F, -3.3375F, 1, 1, 1, -0.35F, false));
		bone11_r2.cubeList.add(new ModelBox(bone11_r2, 612, 157, 2.7972F, 3.1507F, -3.3375F, 1, 1, 1, -0.35F, false));
		bone11_r2.cubeList.add(new ModelBox(bone11_r2, 578, 449, 2.2436F, 2.7971F, -3.3375F, 1, 1, 1, -0.35F, false));
		bone11_r2.cubeList.add(new ModelBox(bone11_r2, 84, 577, 2.2436F, 2.5971F, -3.3375F, 1, 1, 1, -0.35F, false));
		bone11_r2.cubeList.add(new ModelBox(bone11_r2, 156, 612, 2.7972F, 2.2436F, -3.3375F, 1, 1, 1, -0.35F, false));
		bone11_r2.cubeList.add(new ModelBox(bone11_r2, 80, 577, 2.5972F, 2.2436F, -3.3375F, 1, 1, 1, -0.35F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ironsPara.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}