package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FALironsL1A1 extends ModelBase {
	private final ModelRenderer ironsRamp;
	private final ModelRenderer bone77_r1;
	private final ModelRenderer cube_r1;
	private final ModelRenderer bone65;
	private final ModelRenderer irons2;
	private final ModelRenderer bone11_r1;
	private final ModelRenderer bone10_r1;
	private final ModelRenderer bone11_r2;

	public FALironsL1A1() {
		textureWidth = 528;
		textureHeight = 528;

		ironsRamp = new ModelRenderer(this);
		ironsRamp.setRotationPoint(0.25F, -16.7087F, 4.3564F);
		ironsRamp.cubeList.add(new ModelBox(ironsRamp, 394, 504, -2.75F, -0.5F, 0.0F, 2, 3, 4, 0.0F, false));

		bone77_r1 = new ModelRenderer(this);
		bone77_r1.setRotationPoint(-1.75F, 0.624F, 1.4321F);
		ironsRamp.addChild(bone77_r1);
		setRotationAngle(bone77_r1, -0.7854F, 0.0F, 0.0F);
		bone77_r1.cubeList.add(new ModelBox(bone77_r1, 392, 264, -1.5F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.725F, -1.0F, 2.6F);
		ironsRamp.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.6283F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 122, 471, -1.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

		bone65 = new ModelRenderer(this);
		bone65.setRotationPoint(0.0F, 0.0F, 0.0F);
		ironsRamp.addChild(bone65);
		setRotationAngle(bone65, -0.1047F, 0.0F, 0.0F);
		bone65.cubeList.add(new ModelBox(bone65, 0, 512, -2.65F, -1.2536F, -0.0312F, 1, 2, 4, 0.0F, false));
		bone65.cubeList.add(new ModelBox(bone65, 10, 512, -1.9F, -1.2543F, -0.0312F, 1, 2, 4, 0.0F, false));
		bone65.cubeList.add(new ModelBox(bone65, 196, 431, -2.05F, -1.2383F, 3.7756F, 1, 1, 1, 0.0F, false));
		bone65.cubeList.add(new ModelBox(bone65, 128, 432, -2.45F, -1.2393F, 3.7766F, 1, 1, 1, 0.0F, false));
		bone65.cubeList.add(new ModelBox(bone65, 196, 433, -2.25F, -0.5361F, 3.7435F, 1, 1, 1, 0.0F, false));

		irons2 = new ModelRenderer(this);
		irons2.setRotationPoint(-1.7498F, -3.2205F, 2.5775F);
		ironsRamp.addChild(irons2);
		setRotationAngle(irons2, -1.5708F, 0.0F, 0.0F);
		

		bone11_r1 = new ModelRenderer(this);
		bone11_r1.setRotationPoint(-0.0002F, -2.8375F, -4.1548F);
		irons2.addChild(bone11_r1);
		setRotationAngle(bone11_r1, 1.5708F, 0.0F, 0.0F);
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 518, 497, -0.9964F, 4.7214F, -3.3375F, 2, 2, 1, -0.35F, false));

		bone10_r1 = new ModelRenderer(this);
		bone10_r1.setRotationPoint(-0.0002F, -2.8367F, -4.1548F);
		irons2.addChild(bone10_r1);
		setRotationAngle(bone10_r1, 1.5708F, 0.0F, 0.0F);
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 200, 400, -0.0465F, 3.9214F, -3.3375F, 1, 2, 1, -0.35F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 38, 508, -0.4F, 4.475F, -3.3375F, 1, 1, 1, -0.35F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 38, 506, -0.6F, 4.475F, -3.3375F, 1, 1, 1, -0.35F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 200, 397, -0.9535F, 3.9214F, -3.3375F, 1, 2, 1, -0.35F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 38, 498, -0.4F, 3.5679F, -3.3375F, 1, 1, 1, -0.35F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 432, 497, -0.6F, 3.5679F, -3.3375F, 1, 1, 1, -0.35F, false));

		bone11_r2 = new ModelRenderer(this);
		bone11_r2.setRotationPoint(-0.0002F, -2.8367F, -4.1548F);
		irons2.addChild(bone11_r2);
		setRotationAngle(bone11_r2, 1.5708F, -0.7854F, 0.0F);
		bone11_r2.cubeList.add(new ModelBox(bone11_r2, 46, 519, 3.1507F, 2.5971F, -3.3375F, 1, 1, 1, -0.35F, false));
		bone11_r2.cubeList.add(new ModelBox(bone11_r2, 46, 517, 3.1507F, 2.7971F, -3.3375F, 1, 1, 1, -0.35F, false));
		bone11_r2.cubeList.add(new ModelBox(bone11_r2, 70, 513, 2.5972F, 3.1507F, -3.3375F, 1, 1, 1, -0.35F, false));
		bone11_r2.cubeList.add(new ModelBox(bone11_r2, 70, 511, 2.7972F, 3.1507F, -3.3375F, 1, 1, 1, -0.35F, false));
		bone11_r2.cubeList.add(new ModelBox(bone11_r2, 38, 504, 2.2436F, 2.7971F, -3.3375F, 1, 1, 1, -0.35F, false));
		bone11_r2.cubeList.add(new ModelBox(bone11_r2, 38, 502, 2.2436F, 2.5971F, -3.3375F, 1, 1, 1, -0.35F, false));
		bone11_r2.cubeList.add(new ModelBox(bone11_r2, 38, 500, 2.7972F, 2.2436F, -3.3375F, 1, 1, 1, -0.35F, false));
		bone11_r2.cubeList.add(new ModelBox(bone11_r2, 432, 499, 2.5972F, 2.2436F, -3.3375F, 1, 1, 1, -0.35F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ironsRamp.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}