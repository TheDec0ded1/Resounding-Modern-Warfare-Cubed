package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Tavor21SideRail extends ModelBase {
	private final ModelRenderer rail_side;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;

	public Tavor21SideRail() {
		textureWidth = 432;
		textureHeight = 432;

		rail_side = new ModelRenderer(this);
		rail_side.setRotationPoint(-5.0782F, -14.4341F, -29.4765F);
		setRotationAngle(rail_side, 0.0F, 0.0F, -1.309F);
		rail_side.cubeList.add(new ModelBox(rail_side, 426, 135, -0.4209F, 0.1061F, -1.2735F, 1, 1, 1, -0.199F, false));
		rail_side.cubeList.add(new ModelBox(rail_side, 426, 137, -0.4209F, 0.1061F, -1.8235F, 1, 1, 1, -0.199F, false));
		rail_side.cubeList.add(new ModelBox(rail_side, 426, 139, -0.4209F, 0.1061F, -0.0235F, 1, 1, 1, -0.199F, false));
		rail_side.cubeList.add(new ModelBox(rail_side, 426, 141, -0.4209F, 0.1061F, 1.2265F, 1, 1, 1, -0.199F, false));
		rail_side.cubeList.add(new ModelBox(rail_side, 142, 426, -0.4209F, 0.1061F, 2.4765F, 1, 1, 1, -0.199F, false));
		rail_side.cubeList.add(new ModelBox(rail_side, 426, 143, -0.4209F, 0.1061F, 3.7265F, 1, 1, 1, -0.199F, false));
		rail_side.cubeList.add(new ModelBox(rail_side, 426, 145, -0.4209F, 0.1061F, 4.9765F, 1, 1, 1, -0.199F, false));
		rail_side.cubeList.add(new ModelBox(rail_side, 146, 426, -0.4209F, 0.1061F, 7.4765F, 1, 1, 1, -0.199F, false));
		rail_side.cubeList.add(new ModelBox(rail_side, 426, 150, -0.4209F, 0.1061F, 6.2265F, 1, 1, 1, -0.199F, false));
		rail_side.cubeList.add(new ModelBox(rail_side, 426, 152, -0.4209F, 0.1061F, 9.9765F, 1, 1, 1, -0.199F, false));
		rail_side.cubeList.add(new ModelBox(rail_side, 426, 154, -0.4209F, 0.1061F, 8.7265F, 1, 1, 1, -0.199F, false));
		rail_side.cubeList.add(new ModelBox(rail_side, 426, 156, -0.4209F, 0.1061F, 12.4765F, 1, 1, 1, -0.199F, false));
		rail_side.cubeList.add(new ModelBox(rail_side, 426, 158, -0.4209F, 0.1061F, 11.2265F, 1, 1, 1, -0.199F, false));
		rail_side.cubeList.add(new ModelBox(rail_side, 426, 163, -0.4209F, 0.1061F, 14.9765F, 1, 1, 1, -0.199F, false));
		rail_side.cubeList.add(new ModelBox(rail_side, 164, 426, -0.4209F, 0.1061F, 15.5765F, 1, 1, 1, -0.198F, false));
		rail_side.cubeList.add(new ModelBox(rail_side, 426, 165, -0.4209F, 0.1061F, 13.7265F, 1, 1, 1, -0.199F, false));
		rail_side.cubeList.add(new ModelBox(rail_side, 426, 167, -1.4185F, 0.1037F, 15.5775F, 1, 1, 1, -0.198F, false));
		rail_side.cubeList.add(new ModelBox(rail_side, 168, 426, -1.4185F, 0.1037F, 14.9775F, 1, 1, 1, -0.199F, false));
		rail_side.cubeList.add(new ModelBox(rail_side, 426, 169, -1.4185F, 0.1037F, 13.7275F, 1, 1, 1, -0.199F, false));
		rail_side.cubeList.add(new ModelBox(rail_side, 426, 357, -1.4185F, 0.1037F, 12.4775F, 1, 1, 1, -0.199F, false));
		rail_side.cubeList.add(new ModelBox(rail_side, 172, 426, -1.4185F, 0.1037F, 11.2275F, 1, 1, 1, -0.199F, false));
		rail_side.cubeList.add(new ModelBox(rail_side, 426, 173, -1.4185F, 0.1037F, 9.9775F, 1, 1, 1, -0.199F, false));
		rail_side.cubeList.add(new ModelBox(rail_side, 426, 175, -1.4185F, 0.1037F, 8.7275F, 1, 1, 1, -0.199F, false));
		rail_side.cubeList.add(new ModelBox(rail_side, 426, 177, -1.4185F, 0.1037F, 7.4775F, 1, 1, 1, -0.199F, false));
		rail_side.cubeList.add(new ModelBox(rail_side, 426, 189, -1.4185F, 0.1037F, 6.2275F, 1, 1, 1, -0.199F, false));
		rail_side.cubeList.add(new ModelBox(rail_side, 190, 426, -1.4185F, 0.1037F, 3.7275F, 1, 1, 1, -0.199F, false));
		rail_side.cubeList.add(new ModelBox(rail_side, 426, 191, -1.4185F, 0.1037F, 4.9775F, 1, 1, 1, -0.199F, false));
		rail_side.cubeList.add(new ModelBox(rail_side, 426, 193, -1.4185F, 0.1037F, 2.4775F, 1, 1, 1, -0.199F, false));
		rail_side.cubeList.add(new ModelBox(rail_side, 194, 426, -1.4185F, 0.1037F, 1.2275F, 1, 1, 1, -0.199F, false));
		rail_side.cubeList.add(new ModelBox(rail_side, 426, 195, -1.4185F, 0.1037F, -0.0225F, 1, 1, 1, -0.199F, false));
		rail_side.cubeList.add(new ModelBox(rail_side, 426, 197, -1.4185F, 0.1037F, -1.2725F, 1, 1, 1, -0.199F, false));
		rail_side.cubeList.add(new ModelBox(rail_side, 198, 426, -1.4185F, 0.1037F, -1.8225F, 1, 1, 1, -0.199F, false));
		rail_side.cubeList.add(new ModelBox(rail_side, 144, 370, -1.3209F, 0.7061F, -1.6235F, 2, 1, 18, -0.001F, false));
		rail_side.cubeList.add(new ModelBox(rail_side, 0, 374, -1.5209F, 0.7061F, -1.6235F, 1, 1, 18, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-14.2049F, -9.2527F, -9.9235F);
		rail_side.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, 0.8901F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 426, 199, 15.3996F, -4.2747F, 23.65F, 1, 1, 1, -0.198F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 426, 201, 15.3996F, -4.2747F, 25.5F, 1, 1, 1, -0.197F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 202, 426, 15.3996F, -4.2747F, 24.9F, 1, 1, 1, -0.198F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 426, 203, 15.3996F, -4.2747F, 21.15F, 1, 1, 1, -0.198F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 426, 205, 15.3996F, -4.2747F, 22.4F, 1, 1, 1, -0.198F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 206, 426, 15.3996F, -4.2747F, 18.65F, 1, 1, 1, -0.198F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 426, 207, 15.3996F, -4.2747F, 19.9F, 1, 1, 1, -0.198F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 426, 209, 15.3996F, -4.2747F, 16.15F, 1, 1, 1, -0.198F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 210, 426, 15.3996F, -4.2747F, 17.4F, 1, 1, 1, -0.198F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 426, 211, 15.3996F, -4.2747F, 14.9F, 1, 1, 1, -0.198F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 426, 213, 15.3996F, -4.2747F, 13.65F, 1, 1, 1, -0.198F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 214, 426, 15.3996F, -4.2747F, 12.4F, 1, 1, 1, -0.198F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 426, 215, 15.3996F, -4.2747F, 11.15F, 1, 1, 1, -0.198F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 426, 217, 15.4F, -4.2759F, 9.902F, 1, 1, 1, -0.198F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 218, 426, 15.4F, -4.2759F, 8.652F, 1, 1, 1, -0.198F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 222, 426, 15.4F, -4.2759F, 8.102F, 1, 1, 1, -0.198F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-12.6049F, -9.2527F, -9.9235F);
		rail_side.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, -0.8901F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 226, 426, -0.0574F, 15.9061F, 23.65F, 1, 1, 1, -0.198F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 230, 426, -0.0574F, 15.9061F, 25.5F, 1, 1, 1, -0.197F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 234, 426, -0.0574F, 15.9061F, 24.9F, 1, 1, 1, -0.198F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 238, 426, -0.0574F, 15.9061F, 21.15F, 1, 1, 1, -0.198F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 262, 426, -0.0574F, 15.9061F, 22.4F, 1, 1, 1, -0.198F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 426, 263, -0.0574F, 15.9061F, 18.65F, 1, 1, 1, -0.198F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 426, 265, -0.0574F, 15.9061F, 19.9F, 1, 1, 1, -0.198F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 266, 426, -0.0574F, 15.9061F, 16.15F, 1, 1, 1, -0.198F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 426, 267, -0.0574F, 15.9061F, 17.4F, 1, 1, 1, -0.198F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 426, 269, -0.0574F, 15.9061F, 14.9F, 1, 1, 1, -0.198F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 270, 426, -0.0574F, 15.9061F, 13.65F, 1, 1, 1, -0.198F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 426, 271, -0.0574F, 15.9061F, 12.4F, 1, 1, 1, -0.198F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 426, 273, -0.0574F, 15.9061F, 11.15F, 1, 1, 1, -0.198F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 274, 426, -0.0574F, 15.9061F, 9.9F, 1, 1, 1, -0.198F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 426, 275, -0.0574F, 15.9061F, 8.65F, 1, 1, 1, -0.198F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 426, 277, -0.0574F, 15.9061F, 8.1F, 1, 1, 1, -0.198F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		rail_side.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}