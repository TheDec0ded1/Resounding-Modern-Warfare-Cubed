package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SteyrTMPUpper extends ModelBase {
	private final ModelRenderer spp_tmp_upper;
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
	private final ModelRenderer irons;
	private final ModelRenderer sights;
	private final ModelRenderer ironsights_r1;
	private final ModelRenderer ironsights_r2;

	public SteyrTMPUpper() {
		textureWidth = 288;
		textureHeight = 288;

		spp_tmp_upper = new ModelRenderer(this);
		spp_tmp_upper.setRotationPoint(0.0F, 21.0F, 0.0F);
		spp_tmp_upper.cubeList.add(new ModelBox(spp_tmp_upper, 92, 208, -3.999F, -33.9F, -21.725F, 5, 3, 16, 0.0F, false));
		spp_tmp_upper.cubeList.add(new ModelBox(spp_tmp_upper, 230, 14, 0.001F, -33.9F, -5.725F, 1, 3, 12, 0.0F, false));
		spp_tmp_upper.cubeList.add(new ModelBox(spp_tmp_upper, 154, 262, 0.301F, -31.3F, -1.225F, 1, 2, 1, 0.0F, false));
		spp_tmp_upper.cubeList.add(new ModelBox(spp_tmp_upper, 156, 64, -0.865F, -34.4F, -21.725F, 1, 1, 28, 0.0F, false));
		spp_tmp_upper.cubeList.add(new ModelBox(spp_tmp_upper, 104, 244, -2.615F, -34.4F, -5.725F, 1, 1, 9, 0.0F, false));
		spp_tmp_upper.cubeList.add(new ModelBox(spp_tmp_upper, 156, 119, -1.865F, -34.9F, -21.725F, 1, 1, 25, 0.0F, false));
		spp_tmp_upper.cubeList.add(new ModelBox(spp_tmp_upper, 130, 156, -2.165F, -34.899F, -21.725F, 1, 1, 25, 0.0F, false));
		spp_tmp_upper.cubeList.add(new ModelBox(spp_tmp_upper, 214, 52, -3.133F, -34.4F, -21.725F, 1, 1, 16, 0.0F, false));
		spp_tmp_upper.cubeList.add(new ModelBox(spp_tmp_upper, 270, 214, -3.133F, -34.4F, 3.275F, 1, 1, 3, 0.0F, false));
		spp_tmp_upper.cubeList.add(new ModelBox(spp_tmp_upper, 182, 259, -1.115F, -33.9F, 5.65F, 1, 1, 5, 0.0F, false));
		spp_tmp_upper.cubeList.add(new ModelBox(spp_tmp_upper, 84, 259, -2.883F, -33.9F, 5.65F, 1, 1, 5, 0.0F, false));
		spp_tmp_upper.cubeList.add(new ModelBox(spp_tmp_upper, 256, 225, -3.999F, -33.9F, 3.275F, 4, 3, 3, 0.0F, false));
		spp_tmp_upper.cubeList.add(new ModelBox(spp_tmp_upper, 244, 128, -3.999F, -33.4F, 5.65F, 5, 3, 5, -0.002F, false));
		spp_tmp_upper.cubeList.add(new ModelBox(spp_tmp_upper, 152, 275, -2.5F, -34.9F, 3.275F, 2, 1, 2, 0.0F, false));
		spp_tmp_upper.cubeList.add(new ModelBox(spp_tmp_upper, 226, 275, -2.5F, -34.901F, -1.725F, 2, 1, 2, 0.0F, false));
		spp_tmp_upper.cubeList.add(new ModelBox(spp_tmp_upper, 234, 275, -2.5F, -34.901F, -13.725F, 2, 1, 2, 0.0F, false));
		spp_tmp_upper.cubeList.add(new ModelBox(spp_tmp_upper, 20, 252, -2.499F, -35.2827F, 4.1989F, 2, 1, 6, 0.0F, false));
		spp_tmp_upper.cubeList.add(new ModelBox(spp_tmp_upper, 0, 244, -3.998F, -31.35F, -5.725F, 1, 1, 9, 0.0F, false));
		spp_tmp_upper.cubeList.add(new ModelBox(spp_tmp_upper, 248, 35, -4.325F, -31.75F, -22.125F, 1, 1, 8, -0.3F, false));
		spp_tmp_upper.cubeList.add(new ModelBox(spp_tmp_upper, 256, 21, -4.325F, -32.5F, -22.125F, 1, 1, 6, -0.3F, false));
		spp_tmp_upper.cubeList.add(new ModelBox(spp_tmp_upper, 266, 247, -4.325F, -33.25F, -22.125F, 1, 1, 4, -0.3F, false));
		spp_tmp_upper.cubeList.add(new ModelBox(spp_tmp_upper, 184, 277, -4.325F, -34.0F, -22.025F, 1, 1, 2, -0.3F, false));
		spp_tmp_upper.cubeList.add(new ModelBox(spp_tmp_upper, 246, 95, 0.325F, -31.75F, -22.125F, 1, 1, 8, -0.3F, false));
		spp_tmp_upper.cubeList.add(new ModelBox(spp_tmp_upper, 256, 14, 0.325F, -32.5F, -22.125F, 1, 1, 6, -0.3F, false));
		spp_tmp_upper.cubeList.add(new ModelBox(spp_tmp_upper, 266, 242, 0.325F, -33.25F, -22.125F, 1, 1, 4, -0.3F, false));
		spp_tmp_upper.cubeList.add(new ModelBox(spp_tmp_upper, 276, 249, 0.325F, -34.0F, -22.025F, 1, 1, 2, -0.3F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.548F, -34.217F, 1.775F);
		spp_tmp_upper.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -1.0472F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 156, 35, -0.5F, 0.5F, -23.5F, 1, 1, 28, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.499F, -34.8207F, 4.3902F);
		spp_tmp_upper.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.3927F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 44, 224, -1.0F, -0.5F, -1.0F, 2, 1, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1.599F, -32.6F, 10.35F);
		spp_tmp_upper.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.48F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 278, 100, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.002F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-2.0811F, -33.9947F, 8.15F);
		spp_tmp_upper.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 96, 261, -1.634F, -0.5F, -2.5F, 1, 1, 5, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-0.9169F, -32.391F, 8.15F);
		spp_tmp_upper.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.7854F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 108, 261, 0.634F, -0.5F, -2.5F, 1, 1, 5, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-2.45F, -34.217F, 12.775F);
		spp_tmp_upper.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 1.0472F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 270, 225, -0.5F, 0.5F, -9.5F, 1, 1, 3, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 214, 35, -0.5F, 0.5F, -34.5F, 1, 1, 16, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-2.7675F, -32.7366F, -1.2375F);
		spp_tmp_upper.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.3927F, 0.0F, -1.0908F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 144, 275, -0.748F, 0.8665F, 2.6583F, 2, 1, 2, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-2.8675F, -32.7366F, -1.2375F);
		spp_tmp_upper.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -1.0908F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 270, 113, -1.752F, -0.3625F, 2.5125F, 3, 1, 2, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 268, 32, -1.752F, -0.3625F, -4.4875F, 3, 1, 2, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-2.7675F, -32.7366F, -1.2375F);
		spp_tmp_upper.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.3927F, 0.0F, -1.0908F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 276, 246, -0.748F, 0.8665F, -4.6583F, 2, 1, 2, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-1.499F, -29.4527F, 13.092F);
		spp_tmp_upper.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.3927F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 264, 100, -2.501F, -1.5F, -8.0F, 5, 1, 2, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-1.499F, -29.5559F, -10.7479F);
		spp_tmp_upper.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.1309F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 266, 39, -2.501F, -2.85F, -11.5F, 5, 3, 1, 0.0F, false));

		irons = new ModelRenderer(this);
		irons.setRotationPoint(0.0F, -33.7F, -36.9F);
		spp_tmp_upper.addChild(irons);
		

		sights = new ModelRenderer(this);
		sights.setRotationPoint(0.0F, 0.0F, 0.0F);
		irons.addChild(sights);
		sights.cubeList.add(new ModelBox(sights, 170, 271, -1.5F, -2.16F, 41.22F, 1, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 8, 276, -1.7F, -2.16F, 41.22F, 1, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 278, 72, -1.7F, -2.36F, 41.22F, 1, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 278, 74, -1.5F, -2.36F, 41.22F, 1, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 278, 82, -1.3F, -2.16F, 41.22F, 1, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 278, 80, -1.3F, -2.36F, 41.22F, 1, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 76, 278, -2.3F, -2.36F, 41.22F, 1, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 278, 76, -2.498F, -2.358F, 41.218F, 1, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 278, 78, -2.3F, -2.16F, 41.22F, 1, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 80, 278, -2.5F, -2.16F, 41.22F, 1, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 100, 278, -2.698F, -2.358F, 41.218F, 1, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 96, 278, -2.7F, -2.16F, 41.22F, 1, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 120, 261, -2.0F, -2.35F, 16.125F, 1, 2, 1, -0.4F, false));

		ironsights_r1 = new ModelRenderer(this);
		ironsights_r1.setRotationPoint(-1.5F, -1.35F, 17.5F);
		sights.addChild(ironsights_r1);
		setRotationAngle(ironsights_r1, -0.3054F, 0.0F, 0.0F);
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 112, 277, -0.5F, -0.375F, -1.275F, 1, 2, 2, -0.425F, false));

		ironsights_r2 = new ModelRenderer(this);
		ironsights_r2.setRotationPoint(-1.5F, -1.35F, 16.5F);
		sights.addChild(ironsights_r2);
		setRotationAngle(ironsights_r2, 0.3054F, 0.0F, 0.0F);
		ironsights_r2.cubeList.add(new ModelBox(ironsights_r2, 276, 269, -0.5F, -0.6F, -1.475F, 1, 2, 2, -0.425F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		spp_tmp_upper.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}