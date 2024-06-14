package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ShAK_12Mag20 extends ModelBase {
	private final ModelRenderer shak_mag20;
	private final ModelRenderer cube_r47;
	private final ModelRenderer cube_r111_r1;
	private final ModelRenderer cube_r110_r1;
	private final ModelRenderer cube_r110_r2;
	private final ModelRenderer cube_r109_r1;
	private final ModelRenderer cube_r48;
	private final ModelRenderer cube_r49;
	private final ModelRenderer cube_r52;
	private final ModelRenderer cube_r114_r1;
	private final ModelRenderer cube_r113_r1;
	private final ModelRenderer cube_r113_r2;
	private final ModelRenderer cube_r112_r1;
	private final ModelRenderer bone43;
	private final ModelRenderer cube_r53;
	private final ModelRenderer cube_r116_r1;
	private final ModelRenderer cube_r115_r1;
	private final ModelRenderer cube_r115_r2;
	private final ModelRenderer cube_r114_r2;
	private final ModelRenderer cube_r54;
	private final ModelRenderer cube_r55;
	private final ModelRenderer cube_r56;
	private final ModelRenderer cube_r57;

	public ShAK_12Mag20() {
		textureWidth = 512;
		textureHeight = 512;

		shak_mag20 = new ModelRenderer(this);
		shak_mag20.setRotationPoint(-1.5F, -9.8F, 9.2F);
		setRotationAngle(shak_mag20, 0.0873F, 0.0F, 0.0F);
		

		cube_r47 = new ModelRenderer(this);
		cube_r47.setRotationPoint(0.25F, 5.8389F, 8.4141F);
		shak_mag20.addChild(cube_r47);
		setRotationAngle(cube_r47, -0.1047F, 0.0F, 0.0F);
		cube_r47.cubeList.add(new ModelBox(cube_r47, 190, 0, -0.5F, -5.0F, -8.4F, 2, 5, 9, -0.001F, false));
		cube_r47.cubeList.add(new ModelBox(cube_r47, 188, 64, -2.0F, -5.0F, -8.4F, 2, 5, 9, 0.0F, false));

		cube_r111_r1 = new ModelRenderer(this);
		cube_r111_r1.setRotationPoint(0.125F, 18.121F, -12.2774F);
		cube_r47.addChild(cube_r111_r1);
		setRotationAngle(cube_r111_r1, -0.3927F, 0.0F, 0.0F);
		cube_r111_r1.cubeList.add(new ModelBox(cube_r111_r1, 128, 141, -0.625F, -7.8621F, -1.9123F, 2, 7, 9, -0.001F, false));
		cube_r111_r1.cubeList.add(new ModelBox(cube_r111_r1, 141, 85, -2.125F, -7.8621F, -1.9123F, 2, 7, 9, 0.0F, false));

		cube_r110_r1 = new ModelRenderer(this);
		cube_r110_r1.setRotationPoint(0.125F, 18.121F, -12.2774F);
		cube_r47.addChild(cube_r110_r1);
		setRotationAngle(cube_r110_r1, -0.5236F, 0.0F, 0.0F);
		cube_r110_r1.cubeList.add(new ModelBox(cube_r110_r1, 21, 178, -2.125F, -1.7799F, -2.0855F, 2, 7, 9, 0.0F, false));
		cube_r110_r1.cubeList.add(new ModelBox(cube_r110_r1, 177, 167, -0.625F, -1.7799F, -2.0855F, 2, 7, 9, -0.001F, false));

		cube_r110_r2 = new ModelRenderer(this);
		cube_r110_r2.setRotationPoint(-0.25F, 5.8308F, -7.246F);
		cube_r47.addChild(cube_r110_r2);
		setRotationAngle(cube_r110_r2, -0.1745F, 0.0F, 0.0F);
		cube_r110_r2.cubeList.add(new ModelBox(cube_r110_r2, 80, 144, -0.25F, -7.1047F, -2.2857F, 2, 7, 9, -0.001F, false));
		cube_r110_r2.cubeList.add(new ModelBox(cube_r110_r2, 0, 145, -1.75F, -7.1047F, -2.2857F, 2, 7, 9, 0.0F, false));

		cube_r109_r1 = new ModelRenderer(this);
		cube_r109_r1.setRotationPoint(0.025F, 10.0523F, -8.7339F);
		cube_r47.addChild(cube_r109_r1);
		setRotationAngle(cube_r109_r1, -0.3054F, 0.0F, 0.0F);
		cube_r109_r1.cubeList.add(new ModelBox(cube_r109_r1, 0, 61, -2.025F, -5.4537F, -2.2072F, 2, 7, 9, 0.0F, false));
		cube_r109_r1.cubeList.add(new ModelBox(cube_r109_r1, 61, 62, -0.525F, -5.4537F, -2.2072F, 2, 7, 9, -0.001F, false));

		cube_r48 = new ModelRenderer(this);
		cube_r48.setRotationPoint(-1.75F, 0.3389F, 3.5141F);
		shak_mag20.addChild(cube_r48);
		setRotationAngle(cube_r48, -0.0908F, 0.0523F, 0.5212F);
		cube_r48.cubeList.add(new ModelBox(cube_r48, 120, 12, 0.0F, -1.0F, 0.0F, 1, 1, 6, 0.0F, false));

		cube_r49 = new ModelRenderer(this);
		cube_r49.setRotationPoint(1.75F, 0.3389F, 3.5141F);
		shak_mag20.addChild(cube_r49);
		setRotationAngle(cube_r49, -0.0908F, -0.0523F, -0.5212F);
		cube_r49.cubeList.add(new ModelBox(cube_r49, 69, 105, -1.0F, -1.0F, 0.0F, 1, 1, 6, 0.0F, false));

		cube_r52 = new ModelRenderer(this);
		cube_r52.setRotationPoint(1.5F, 6.0389F, 8.3141F);
		shak_mag20.addChild(cube_r52);
		setRotationAngle(cube_r52, -0.1047F, 0.0F, 0.0F);
		cube_r52.cubeList.add(new ModelBox(cube_r52, 41, 45, -2.5F, -5.0F, -8.75F, 2, 5, 1, 0.2F, false));

		cube_r114_r1 = new ModelRenderer(this);
		cube_r114_r1.setRotationPoint(-1.125F, 17.9116F, -12.1988F);
		cube_r52.addChild(cube_r114_r1);
		setRotationAngle(cube_r114_r1, -0.3927F, 0.0F, 0.0F);
		cube_r114_r1.cubeList.add(new ModelBox(cube_r114_r1, 0, 61, -1.375F, -7.6528F, -2.3409F, 2, 7, 1, 0.2F, false));

		cube_r113_r1 = new ModelRenderer(this);
		cube_r113_r1.setRotationPoint(-1.125F, 17.9116F, -12.1988F);
		cube_r52.addChild(cube_r113_r1);
		setRotationAngle(cube_r113_r1, -0.5236F, 0.0F, 0.0F);
		cube_r113_r1.cubeList.add(new ModelBox(cube_r113_r1, 0, 87, -1.375F, -1.5705F, -2.514F, 2, 7, 1, 0.2F, false));

		cube_r113_r2 = new ModelRenderer(this);
		cube_r113_r2.setRotationPoint(-1.5F, 5.6215F, -7.1674F);
		cube_r52.addChild(cube_r113_r2);
		setRotationAngle(cube_r113_r2, -0.1745F, 0.0F, 0.0F);
		cube_r113_r2.cubeList.add(new ModelBox(cube_r113_r2, 61, 62, -1.0F, -6.8953F, -2.7143F, 2, 7, 1, 0.2F, false));

		cube_r112_r1 = new ModelRenderer(this);
		cube_r112_r1.setRotationPoint(-1.225F, 9.8429F, -8.6553F);
		cube_r52.addChild(cube_r112_r1);
		setRotationAngle(cube_r112_r1, -0.3054F, 0.0F, 0.0F);
		cube_r112_r1.cubeList.add(new ModelBox(cube_r112_r1, 15, 14, -1.275F, -5.2443F, -2.6358F, 2, 7, 1, 0.2F, false));

		bone43 = new ModelRenderer(this);
		bone43.setRotationPoint(-1.2F, 3.5389F, 9.6141F);
		shak_mag20.addChild(bone43);
		setRotationAngle(bone43, 0.0873F, 0.0F, 0.0F);
		

		cube_r53 = new ModelRenderer(this);
		cube_r53.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone43.addChild(cube_r53);
		setRotationAngle(cube_r53, -0.192F, 0.0F, 0.0F);
		

		cube_r116_r1 = new ModelRenderer(this);
		cube_r116_r1.setRotationPoint(1.575F, 20.5338F, -13.2304F);
		cube_r53.addChild(cube_r116_r1);
		setRotationAngle(cube_r116_r1, -0.4363F, 0.0F, 0.0F);
		cube_r116_r1.cubeList.add(new ModelBox(cube_r116_r1, 84, 197, 0.625F, -7.2561F, -2.1931F, 1, 1, 9, -0.101F, false));
		cube_r116_r1.cubeList.add(new ModelBox(cube_r116_r1, 0, 14, -2.375F, -7.2561F, -2.1931F, 3, 1, 9, -0.1F, false));

		cube_r115_r1 = new ModelRenderer(this);
		cube_r115_r1.setRotationPoint(1.575F, 20.5338F, -13.2304F);
		cube_r53.addChild(cube_r115_r1);
		setRotationAngle(cube_r115_r1, -0.5236F, 0.0F, 0.0F);
		cube_r115_r1.cubeList.add(new ModelBox(cube_r115_r1, 212, 198, 0.625F, -1.1527F, -2.0724F, 1, 1, 9, -0.101F, false));
		cube_r115_r1.cubeList.add(new ModelBox(cube_r115_r1, 155, 153, -2.375F, -1.1527F, -2.0724F, 3, 1, 9, -0.1F, false));
		cube_r115_r1.cubeList.add(new ModelBox(cube_r115_r1, 59, 166, -2.175F, 5.0473F, -2.0724F, 3, 1, 9, 0.3F, false));
		cube_r115_r1.cubeList.add(new ModelBox(cube_r115_r1, 147, 13, -1.625F, 5.0473F, -2.6724F, 1, 1, 1, 0.3F, false));
		cube_r115_r1.cubeList.add(new ModelBox(cube_r115_r1, 147, 15, -0.125F, 5.0473F, -2.6724F, 1, 1, 1, 0.299F, false));
		cube_r115_r1.cubeList.add(new ModelBox(cube_r115_r1, 212, 208, 0.425F, 5.0473F, -2.0724F, 1, 1, 9, 0.299F, false));

		cube_r115_r2 = new ModelRenderer(this);
		cube_r115_r2.setRotationPoint(1.475F, 12.4651F, -9.6869F);
		cube_r53.addChild(cube_r115_r2);
		setRotationAngle(cube_r115_r2, -0.2182F, 0.0F, 0.0F);
		cube_r115_r2.cubeList.add(new ModelBox(cube_r115_r2, 0, 43, -2.275F, -10.9265F, -1.9942F, 3, 1, 9, -0.1F, false));
		cube_r115_r2.cubeList.add(new ModelBox(cube_r115_r2, 120, 197, 0.725F, -10.9265F, -1.9942F, 1, 1, 9, -0.101F, false));

		cube_r114_r2 = new ModelRenderer(this);
		cube_r114_r2.setRotationPoint(1.475F, 12.4651F, -9.6869F);
		cube_r53.addChild(cube_r114_r2);
		setRotationAngle(cube_r114_r2, -0.3054F, 0.0F, 0.0F);
		cube_r114_r2.cubeList.add(new ModelBox(cube_r114_r2, 203, 163, 0.725F, -4.8265F, -2.1942F, 1, 1, 9, -0.101F, false));
		cube_r114_r2.cubeList.add(new ModelBox(cube_r114_r2, 120, 108, -2.275F, -4.8265F, -2.1942F, 3, 1, 9, -0.1F, false));

		cube_r54 = new ModelRenderer(this);
		cube_r54.setRotationPoint(3.3F, 9.24F, -9.74F);
		bone43.addChild(cube_r54);
		setRotationAngle(cube_r54, -0.0535F, 0.1845F, 1.2866F);
		

		cube_r55 = new ModelRenderer(this);
		cube_r55.setRotationPoint(2.75F, 8.74F, -12.14F);
		bone43.addChild(cube_r55);
		setRotationAngle(cube_r55, -0.0535F, 0.1845F, 1.2866F);
		

		cube_r56 = new ModelRenderer(this);
		cube_r56.setRotationPoint(-0.35F, 8.74F, -12.14F);
		bone43.addChild(cube_r56);
		setRotationAngle(cube_r56, -0.0535F, -0.1845F, -1.2866F);
		

		cube_r57 = new ModelRenderer(this);
		cube_r57.setRotationPoint(-0.9F, 9.24F, -9.74F);
		bone43.addChild(cube_r57);
		setRotationAngle(cube_r57, -0.0535F, -0.1845F, -1.2866F);
		
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		shak_mag20.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}