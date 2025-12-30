package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class GalilMag extends ModelWithAttachments {
	private final ModelRenderer mag;
	private final ModelRenderer bone5;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;

	public GalilMag() {
		textureWidth = 200;
		textureHeight = 200;

		mag = new ModelRenderer(this);
		mag.setRotationPoint(0.0F, 23.7F, 0.1F);
		

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-1.5F, -28.6927F, -23.9674F);
		mag.addChild(bone5);
		setRotationAngle(bone5, -0.1745F, 0.0F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 70, 170, -1.5F, -2.6593F, -2.5342F, 3, 6, 8, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 77, 177, -2.0F, -2.6593F, 4.4658F, 4, 6, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 76, 176, -2.0F, -2.5785F, 1.8554F, 4, 6, 2, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 76, 176, -2.0F, -2.2798F, -0.5022F, 4, 5, 2, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 76, 176, -2.0F, -2.6548F, -0.5022F, 4, 1, 2, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 76, 176, -2.0F, -2.6798F, -3.4522F, 4, 1, 2, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 76, 176, -2.0F, -2.6548F, 1.8478F, 4, 1, 2, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 76, 176, -2.0F, -1.759F, -3.4566F, 4, 5, 2, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-1.5F, -28.6927F, -23.9674F);
		mag.addChild(bone7);
		setRotationAngle(bone7, -0.3054F, 0.0F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 171, 163, -1.5F, 2.5987F, -2.1449F, 3, 6, 8, 0.001F, false));
		bone7.cubeList.add(new ModelBox(bone7, 178, 170, -2.0F, 2.5987F, 4.8551F, 4, 6, 1, 0.001F, false));
		bone7.cubeList.add(new ModelBox(bone7, 177, 169, -2.0F, 2.889F, 2.269F, 4, 6, 2, 0.001F, false));
		bone7.cubeList.add(new ModelBox(bone7, 177, 169, -2.0F, 2.5014F, -0.1599F, 4, 6, 2, 0.001F, false));
		bone7.cubeList.add(new ModelBox(bone7, 177, 169, -2.0F, 3.4034F, -3.0211F, 4, 6, 2, 0.001F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-3.1883F, -23.3512F, -24.1008F);
		mag.addChild(bone8);
		setRotationAngle(bone8, -0.4363F, 0.0F, 0.0F);
		bone8.cubeList.add(new ModelBox(bone8, 154, 171, 0.1883F, 2.8635F, -3.2091F, 3, 6, 8, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 161, 178, -0.3117F, 2.8635F, 3.7909F, 4, 6, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 160, 177, -0.3117F, 3.3584F, 1.2563F, 4, 6, 2, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 160, 177, -0.3117F, 3.2911F, -1.2025F, 4, 6, 2, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 160, 177, -0.3117F, 4.5589F, -3.9215F, 4, 6, 2, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-3.1883F, -17.745F, -25.2985F);
		mag.addChild(bone9);
		setRotationAngle(bone9, -0.6545F, 0.0F, 0.0F);
		bone9.cubeList.add(new ModelBox(bone9, 168, 156, 0.1883F, 2.4396F, -3.8669F, 3, 6, 8, 0.001F, false));
		bone9.cubeList.add(new ModelBox(bone9, 175, 163, -0.3117F, 2.4396F, 3.1331F, 4, 6, 1, 0.001F, false));
		bone9.cubeList.add(new ModelBox(bone9, 174, 162, -0.3117F, 3.2549F, 0.742F, 4, 6, 2, 0.001F, false));
		bone9.cubeList.add(new ModelBox(bone9, 174, 162, -0.3117F, 3.7215F, -1.673F, 4, 5, 2, 0.001F, false));
		bone9.cubeList.add(new ModelBox(bone9, 174, 162, -0.3117F, 5.5478F, -4.0531F, 4, 3, 2, 0.001F, false));
		bone9.cubeList.add(new ModelBox(bone9, 30, 117, -0.3117F, 8.3396F, -3.9669F, 4, 1, 8, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		mag.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}