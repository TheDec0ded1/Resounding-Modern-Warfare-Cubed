package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M1GarandClip extends ModelWithAttachments {
	private final ModelRenderer clip;
	private final ModelRenderer mag1;
	private final ModelRenderer mag2;
	private final ModelRenderer mag3;
	private final ModelRenderer mag4;
	private final ModelRenderer mag5;
	private final ModelRenderer mag6;
	private final ModelRenderer mag7;
	private final ModelRenderer mag8;
	private final ModelRenderer mag9;

	public M1GarandClip() {
		textureWidth = 496;
		textureHeight = 496;

		clip = new ModelRenderer(this);
		clip.setRotationPoint(-0.65F, -13.85F, -26.0F);
		

		mag1 = new ModelRenderer(this);
		mag1.setRotationPoint(0.0F, 0.0F, 0.0F);
		clip.addChild(mag1);
		mag1.cubeList.add(new ModelBox(mag1, 277, 386, -0.1F, 1.0F, 5.175F, 1, 6, 3, -0.15F, false));

		mag2 = new ModelRenderer(this);
		mag2.setRotationPoint(-2.75F, 0.0F, 0.0F);
		clip.addChild(mag2);
		mag2.cubeList.add(new ModelBox(mag2, 38, 463, 0.15F, 1.0F, 5.175F, 1, 6, 3, -0.15F, false));

		mag3 = new ModelRenderer(this);
		mag3.setRotationPoint(1.0F, 0.0F, 0.0F);
		clip.addChild(mag3);
		setRotationAngle(mag3, 0.0F, 0.0F, 2.1192F);
		mag3.cubeList.add(new ModelBox(mag3, 233, 466, 0.9617F, -0.5362F, 5.175F, 1, 1, 3, -0.15F, false));

		mag4 = new ModelRenderer(this);
		mag4.setRotationPoint(-2.75F, 0.0F, 0.0F);
		clip.addChild(mag4);
		setRotationAngle(mag4, 0.0F, 0.0F, -0.5205F);
		mag4.cubeList.add(new ModelBox(mag4, 242, 466, -0.4616F, 0.9969F, 5.175F, 1, 1, 3, -0.15F, false));

		mag5 = new ModelRenderer(this);
		mag5.setRotationPoint(-1.9F, 0.45F, 2.0F);
		clip.addChild(mag5);
		mag5.cubeList.add(new ModelBox(mag5, 428, 316, 0.0F, 1.1F, 5.0F, 2, 5, 1, 0.0F, false));

		mag6 = new ModelRenderer(this);
		mag6.setRotationPoint(-2.25F, 0.05F, 2.0F);
		clip.addChild(mag6);
		mag6.cubeList.add(new ModelBox(mag6, 473, 17, 0.1F, 1.0F, 5.0F, 1, 1, 1, 0.0F, false));
		mag6.cubeList.add(new ModelBox(mag6, 473, 23, 0.1F, 6.0F, 5.0F, 1, 1, 1, 0.0F, false));

		mag7 = new ModelRenderer(this);
		mag7.setRotationPoint(-0.5F, 0.05F, 2.0F);
		clip.addChild(mag7);
		mag7.cubeList.add(new ModelBox(mag7, 473, 20, -0.1F, 1.0F, 5.0F, 1, 1, 1, 0.0F, false));
		mag7.cubeList.add(new ModelBox(mag7, 459, 431, -0.35F, 1.0F, 0.0F, 1, 1, 5, 0.0F, false));
		mag7.cubeList.add(new ModelBox(mag7, 459, 438, -1.35F, 1.5F, 0.0F, 1, 1, 5, 0.0F, false));
		mag7.cubeList.add(new ModelBox(mag7, 50, 461, -1.35F, 4.0F, 0.0F, 1, 1, 5, 0.0F, false));
		mag7.cubeList.add(new ModelBox(mag7, 459, 445, -0.35F, 3.5F, 0.0F, 1, 1, 5, 0.0F, false));
		mag7.cubeList.add(new ModelBox(mag7, 323, 462, -0.35F, 4.75F, 0.0F, 1, 1, 5, 0.0F, false));
		mag7.cubeList.add(new ModelBox(mag7, 25, 463, -1.35F, 5.25F, 0.0F, 1, 1, 5, 0.0F, false));
		mag7.cubeList.add(new ModelBox(mag7, 76, 461, -1.35F, 2.75F, 0.0F, 1, 1, 5, 0.0F, false));
		mag7.cubeList.add(new ModelBox(mag7, 63, 461, -0.35F, 2.25F, 0.0F, 1, 1, 5, 0.0F, false));
		mag7.cubeList.add(new ModelBox(mag7, 371, 470, -0.35F, 1.0F, -1.8F, 1, 1, 2, -0.1F, false));
		mag7.cubeList.add(new ModelBox(mag7, 364, 470, -1.35F, 1.5F, -1.8F, 1, 1, 2, -0.1F, false));
		mag7.cubeList.add(new ModelBox(mag7, 357, 470, -0.35F, 3.5F, -1.8F, 1, 1, 2, -0.1F, false));
		mag7.cubeList.add(new ModelBox(mag7, 350, 470, -1.35F, 4.0F, -1.8F, 1, 1, 2, -0.1F, false));
		mag7.cubeList.add(new ModelBox(mag7, 343, 470, -0.35F, 2.25F, -1.8F, 1, 1, 2, -0.1F, false));
		mag7.cubeList.add(new ModelBox(mag7, 336, 470, -1.35F, 2.75F, -1.8F, 1, 1, 2, -0.1F, false));
		mag7.cubeList.add(new ModelBox(mag7, 378, 470, -1.35F, 5.25F, -1.8F, 1, 1, 2, -0.1F, false));
		mag7.cubeList.add(new ModelBox(mag7, 304, 470, -0.35F, 4.75F, -1.8F, 1, 1, 2, -0.1F, false));
		mag7.cubeList.add(new ModelBox(mag7, 473, 30, -0.1F, 6.0F, 5.0F, 1, 1, 1, 0.0F, false));

		mag8 = new ModelRenderer(this);
		mag8.setRotationPoint(1.0F, 6.0F, 0.0F);
		clip.addChild(mag8);
		setRotationAngle(mag8, 0.0F, 0.0F, 2.6025F);
		mag8.cubeList.add(new ModelBox(mag8, 251, 466, 0.5009F, -0.7511F, 5.175F, 1, 1, 3, -0.15F, false));

		mag9 = new ModelRenderer(this);
		mag9.setRotationPoint(-2.75F, 6.0F, 0.0F);
		clip.addChild(mag9);
		setRotationAngle(mag9, 0.0F, 0.0F, -0.9666F);
		mag9.cubeList.add(new ModelBox(mag9, 260, 466, -0.6791F, 0.5798F, 5.175F, 1, 1, 3, -0.15F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		clip.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}