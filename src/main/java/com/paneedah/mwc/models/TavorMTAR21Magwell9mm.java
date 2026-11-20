package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class TavorMTAR21Magwell9mm extends ModelWithAttachments {
	private final ModelRenderer magwell9mm;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;

	public TavorMTAR21Magwell9mm() {
		textureWidth = 320;
		textureHeight = 320;

		magwell9mm = new ModelRenderer(this);
		magwell9mm.setRotationPoint(-0.25F, 24.65F, -5.25F);
		magwell9mm.cubeList.add(new ModelBox(magwell9mm, 252, 136, -1.223F, -27.7488F, 19.8779F, 2, 1, 8, -0.2F, false));
		magwell9mm.cubeList.add(new ModelBox(magwell9mm, 276, 73, -3.323F, -27.7488F, 19.8779F, 2, 1, 8, -0.2F, false));
		magwell9mm.cubeList.add(new ModelBox(magwell9mm, 0, 284, -2.725F, -30.4F, 20.0F, 3, 4, 8, -0.2F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.025F, -26.7F, 25.4F);
		magwell9mm.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.3927F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 176, 283, -1.5F, -2.0F, -5.0F, 1, 4, 10, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 102, 282, -4.1F, -2.0F, -5.0F, 1, 4, 10, -0.2F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.323F, -27.3192F, 24.9384F);
		magwell9mm.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.3491F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 274, 125, -2.0F, 1.7F, -4.6F, 3, 1, 10, -0.2F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 280, 48, 0.1F, 1.7F, -4.6F, 2, 1, 10, -0.2F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1.323F, -25.0153F, 28.3586F);
		magwell9mm.addChild(cube_r3);
		setRotationAngle(cube_r3, -1.0908F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 252, 291, -2.0F, -0.5F, -2.9F, 2, 1, 5, -0.2F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 124, 288, 0.1F, -0.5F, -2.9F, 2, 1, 5, -0.2F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.223F, -28.3203F, 23.5327F);
		magwell9mm.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 298, 216, -2.0F, 1.1F, -3.6F, 3, 1, 1, -0.1F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 300, 137, -0.1F, 1.1F, -3.6F, 2, 1, 1, -0.1F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		magwell9mm.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}