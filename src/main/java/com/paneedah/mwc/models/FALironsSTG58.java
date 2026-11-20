package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FALironsSTG58 extends ModelBase {
	private final ModelRenderer ironsSTG58;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer irons2;
	private final ModelRenderer bone11_r1;
	private final ModelRenderer bone11_r2;

	public FALironsSTG58() {
		textureWidth = 384;
		textureHeight = 384;

		ironsSTG58 = new ModelRenderer(this);
		ironsSTG58.setRotationPoint(0.25F, -16.7087F, 4.3564F);
		ironsSTG58.cubeList.add(new ModelBox(ironsSTG58, 36, 361, -1.525F, -2.75F, -0.25F, 1, 2, 2, -0.25F, false));
		ironsSTG58.cubeList.add(new ModelBox(ironsSTG58, 258, 365, -1.275F, -3.8107F, 0.1107F, 1, 1, 1, -0.25F, false));
		ironsSTG58.cubeList.add(new ModelBox(ironsSTG58, 42, 361, -2.975F, -2.75F, -0.25F, 1, 2, 2, -0.25F, false));
		ironsSTG58.cubeList.add(new ModelBox(ironsSTG58, 266, 365, -3.225F, -3.8107F, 0.1107F, 1, 1, 1, -0.25F, false));
		ironsSTG58.cubeList.add(new ModelBox(ironsSTG58, 196, 366, -3.225F, -3.3107F, 0.1107F, 1, 1, 1, -0.25F, false));
		ironsSTG58.cubeList.add(new ModelBox(ironsSTG58, 200, 366, -1.275F, -3.3107F, 0.1107F, 1, 1, 1, -0.25F, false));
		ironsSTG58.cubeList.add(new ModelBox(ironsSTG58, 212, 366, -1.275F, -2.9607F, 0.1107F, 1, 1, 1, -0.25F, false));
		ironsSTG58.cubeList.add(new ModelBox(ironsSTG58, 216, 366, -3.225F, -2.9607F, 0.1107F, 1, 1, 1, -0.25F, false));
		ironsSTG58.cubeList.add(new ModelBox(ironsSTG58, 188, 366, -3.225F, -2.969F, 0.5724F, 1, 1, 1, -0.25F, false));
		ironsSTG58.cubeList.add(new ModelBox(ironsSTG58, 192, 366, -1.275F, -2.969F, 0.5724F, 1, 1, 1, -0.25F, false));
		ironsSTG58.cubeList.add(new ModelBox(ironsSTG58, 184, 366, -1.275F, -3.4571F, -0.2429F, 1, 1, 1, -0.25F, false));
		ironsSTG58.cubeList.add(new ModelBox(ironsSTG58, 366, 185, -3.225F, -3.4571F, -0.2429F, 1, 1, 1, -0.25F, false));
		ironsSTG58.cubeList.add(new ModelBox(ironsSTG58, 204, 366, -3.225F, -2.9571F, -0.2429F, 1, 1, 1, -0.25F, false));
		ironsSTG58.cubeList.add(new ModelBox(ironsSTG58, 208, 366, -1.275F, -2.9571F, -0.2429F, 1, 1, 1, -0.25F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.75F, -2.9089F, 1.0243F);
		ironsSTG58.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.2182F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 366, 183, -1.475F, -0.5F, -0.5F, 1, 1, 1, -0.25F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 366, 181, 0.475F, -0.5F, -0.5F, 1, 1, 1, -0.25F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.975F, 2.0209F, 2.2035F);
		ironsSTG58.addChild(cube_r2);
		setRotationAngle(cube_r2, 1.1345F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 224, 366, 0.0F, -2.0F, 2.0F, 1, 1, 1, -0.25F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 220, 366, 1.45F, -2.0F, 2.0F, 1, 1, 1, -0.25F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1.525F, -0.004F, -0.5965F);
		ironsSTG58.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.3054F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 144, 364, 0.0F, -2.0F, 2.0F, 1, 2, 1, -0.25F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 140, 364, -1.45F, -2.0F, 2.0F, 1, 2, 1, -0.25F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-3.225F, -3.2071F, -1.2607F);
		ironsSTG58.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.7854F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 180, 366, 0.0F, -2.0F, 1.0F, 1, 1, 1, -0.25F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 366, 179, 1.95F, -2.0F, 1.0F, 1, 1, 1, -0.25F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-3.225F, -3.2071F, -1.7607F);
		ironsSTG58.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.7854F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 262, 365, 0.0F, -2.0F, 1.0F, 1, 1, 1, -0.25F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 254, 365, 1.95F, -2.0F, 1.0F, 1, 1, 1, -0.25F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-1.5F, 0.0F, 1.5F);
		ironsSTG58.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.0436F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 134, 289, -0.025F, -1.0F, -1.5F, 1, 2, 3, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 110, 358, -1.475F, -1.0F, -1.5F, 2, 2, 3, 0.0F, false));

		irons2 = new ModelRenderer(this);
		irons2.setRotationPoint(-1.7498F, -3.2205F, 1.9775F);
		ironsSTG58.addChild(irons2);
		setRotationAngle(irons2, -1.5708F, 0.0F, 0.0F);
		

		bone11_r1 = new ModelRenderer(this);
		bone11_r1.setRotationPoint(-0.0002F, -2.8375F, -4.1548F);
		irons2.addChild(bone11_r1);
		setRotationAngle(bone11_r1, 1.5708F, 0.0F, 0.0F);
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 320, 362, -0.9964F, 4.7214F, -4.6875F, 2, 2, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 288, 363, -0.0465F, 3.9214F, -4.6875F, 1, 2, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 364, 271, -0.4F, 4.475F, -4.6875F, 1, 1, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 364, 269, -0.6F, 4.475F, -4.6875F, 1, 1, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 284, 363, -0.9535F, 3.9214F, -4.6875F, 1, 2, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 364, 259, -0.4F, 3.5679F, -4.6875F, 1, 1, 1, -0.35F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 364, 257, -0.6F, 3.5679F, -4.6875F, 1, 1, 1, -0.35F, false));

		bone11_r2 = new ModelRenderer(this);
		bone11_r2.setRotationPoint(-0.0002F, -2.8375F, -4.1548F);
		irons2.addChild(bone11_r2);
		setRotationAngle(bone11_r2, 1.5708F, -0.7854F, 0.0F);
		bone11_r2.cubeList.add(new ModelBox(bone11_r2, 364, 279, 3.1507F, 2.5971F, -4.6875F, 1, 1, 1, -0.35F, false));
		bone11_r2.cubeList.add(new ModelBox(bone11_r2, 364, 277, 3.1507F, 2.7971F, -4.6875F, 1, 1, 1, -0.35F, false));
		bone11_r2.cubeList.add(new ModelBox(bone11_r2, 364, 275, 2.5972F, 3.1507F, -4.6875F, 1, 1, 1, -0.35F, false));
		bone11_r2.cubeList.add(new ModelBox(bone11_r2, 364, 273, 2.7972F, 3.1507F, -4.6875F, 1, 1, 1, -0.35F, false));
		bone11_r2.cubeList.add(new ModelBox(bone11_r2, 364, 267, 2.2436F, 2.7971F, -4.6875F, 1, 1, 1, -0.35F, false));
		bone11_r2.cubeList.add(new ModelBox(bone11_r2, 364, 265, 2.2436F, 2.5971F, -4.6875F, 1, 1, 1, -0.35F, false));
		bone11_r2.cubeList.add(new ModelBox(bone11_r2, 364, 263, 2.7972F, 2.2436F, -4.6875F, 1, 1, 1, -0.35F, false));
		bone11_r2.cubeList.add(new ModelBox(bone11_r2, 364, 261, 2.5972F, 2.2436F, -4.6875F, 1, 1, 1, -0.35F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ironsSTG58.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}