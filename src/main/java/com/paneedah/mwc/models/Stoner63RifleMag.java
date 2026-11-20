package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Stoner63RifleMag extends ModelBase {
	private final ModelRenderer mag;
	private final ModelRenderer bone5;
	private final ModelRenderer bone7_r1;
	private final ModelRenderer bone6_r1;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;

	public Stoner63RifleMag() {
		textureWidth = 592;
		textureHeight = 592;

		mag = new ModelRenderer(this);
		mag.setRotationPoint(0.0F, 14.4F, 5.5F);
		setRotationAngle(mag, 0.1745F, 0.0F, 0.0F);
		

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-1.5F, -28.9927F, -23.8674F);
		mag.addChild(bone5);
		setRotationAngle(bone5, -0.1745F, 0.0F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 548, 136, -1.5F, -2.6593F, -2.5342F, 3, 6, 7, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 361, 492, -0.25F, -2.6593F, 4.4658F, 2, 6, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 9, 562, -0.25F, -2.5785F, 1.8554F, 2, 6, 2, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 94, 563, -0.25F, -2.2798F, -0.5022F, 2, 5, 2, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 213, 565, 0.15F, 0.8202F, -0.5022F, 2, 3, 2, -0.3F, false));
		bone5.cubeList.add(new ModelBox(bone5, 231, 565, 0.15F, 0.8202F, -3.5022F, 2, 3, 2, -0.3F, false));
		bone5.cubeList.add(new ModelBox(bone5, 222, 565, 0.15F, 0.8202F, 1.8478F, 2, 3, 2, -0.3F, false));
		bone5.cubeList.add(new ModelBox(bone5, 119, 566, -2.15F, 0.8202F, -3.5022F, 2, 3, 2, -0.3F, false));
		bone5.cubeList.add(new ModelBox(bone5, 283, 565, -2.15F, 0.8202F, -0.5022F, 2, 3, 2, -0.3F, false));
		bone5.cubeList.add(new ModelBox(bone5, 274, 565, -2.15F, 0.8202F, 1.8478F, 2, 3, 2, -0.3F, false));
		bone5.cubeList.add(new ModelBox(bone5, 569, 137, -0.25F, -2.6548F, -0.5022F, 2, 1, 2, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 569, 141, -0.25F, -2.6798F, -3.4522F, 2, 1, 2, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 569, 145, -0.25F, -2.6548F, 1.8478F, 2, 1, 2, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 103, 563, -0.25F, -1.759F, -3.4566F, 2, 5, 2, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 206, 565, -1.75F, -2.6593F, 4.4658F, 2, 6, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 569, 161, -1.75F, -2.6548F, 1.8478F, 2, 1, 2, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 333, 562, -1.75F, -2.5785F, 1.8554F, 2, 6, 2, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 569, 157, -1.75F, -2.6548F, -0.5022F, 2, 1, 2, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 294, 563, -1.75F, -2.2798F, -0.5022F, 2, 5, 2, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 176, 563, -1.75F, -1.759F, -3.4566F, 2, 5, 2, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 569, 153, -1.75F, -2.6798F, -3.4522F, 2, 1, 2, 0.0F, false));

		bone7_r1 = new ModelRenderer(this);
		bone7_r1.setRotationPoint(-1.0429F, -2.6593F, 1.9658F);
		bone5.addChild(bone7_r1);
		setRotationAngle(bone7_r1, 0.0F, 0.0F, -0.7854F);
		bone7_r1.cubeList.add(new ModelBox(bone7_r1, 262, 555, -0.5F, -0.5F, -3.5F, 1, 1, 7, 0.0F, false));

		bone6_r1 = new ModelRenderer(this);
		bone6_r1.setRotationPoint(1.0429F, -2.6593F, 1.9658F);
		bone5.addChild(bone6_r1);
		setRotationAngle(bone6_r1, 0.0F, 0.0F, -0.7854F);
		bone6_r1.cubeList.add(new ModelBox(bone6_r1, 102, 554, -0.5F, -0.5F, -3.5F, 1, 1, 7, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-1.5F, -28.9927F, -23.8674F);
		mag.addChild(bone7);
		setRotationAngle(bone7, -0.3054F, 0.0F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 548, 122, -1.5F, 2.5987F, -2.1449F, 3, 6, 7, 0.001F, false));
		bone7.cubeList.add(new ModelBox(bone7, 457, 510, -0.25F, 2.5987F, 4.8551F, 2, 6, 1, 0.001F, false));
		bone7.cubeList.add(new ModelBox(bone7, 521, 271, -0.25F, 2.889F, 2.269F, 2, 6, 2, 0.001F, false));
		bone7.cubeList.add(new ModelBox(bone7, 522, 562, -0.25F, 2.5014F, -0.1599F, 2, 6, 2, 0.001F, false));
		bone7.cubeList.add(new ModelBox(bone7, 45, 563, -0.25F, 3.4034F, -3.0211F, 2, 6, 2, 0.001F, false));
		bone7.cubeList.add(new ModelBox(bone7, 63, 563, -1.75F, 2.5014F, -0.1599F, 2, 6, 2, 0.001F, false));
		bone7.cubeList.add(new ModelBox(bone7, 0, 562, -1.75F, 2.889F, 2.269F, 2, 6, 2, 0.001F, false));
		bone7.cubeList.add(new ModelBox(bone7, 503, 564, -1.75F, 2.5987F, 4.8551F, 2, 6, 1, 0.001F, false));
		bone7.cubeList.add(new ModelBox(bone7, 54, 563, -1.75F, 3.4034F, -3.0211F, 2, 6, 2, 0.001F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-3.1883F, -23.6512F, -24.0008F);
		mag.addChild(bone8);
		setRotationAngle(bone8, -0.4363F, 0.0F, 0.0F);
		bone8.cubeList.add(new ModelBox(bone8, 460, 328, 0.1883F, 2.8635F, -3.2091F, 3, 6, 7, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 112, 563, 1.4383F, 2.8635F, 3.7909F, 2, 6, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 561, 374, 1.4383F, 3.3584F, 1.2563F, 2, 6, 2, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 18, 562, 1.4383F, 3.2911F, -1.2025F, 2, 6, 2, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 27, 562, 1.4383F, 4.5589F, -3.9214F, 2, 6, 2, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 245, 562, -0.0617F, 4.5589F, -3.9214F, 2, 6, 2, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 36, 562, -0.0617F, 3.2911F, -1.2025F, 2, 6, 2, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 561, 383, -0.0617F, 3.3584F, 1.2563F, 2, 6, 2, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 303, 563, -0.0617F, 2.8635F, 3.7909F, 2, 6, 1, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-3.1883F, -18.045F, -25.1985F);
		mag.addChild(bone9);
		setRotationAngle(bone9, -0.6545F, 0.0F, 0.0F);
		bone9.cubeList.add(new ModelBox(bone9, 245, 537, 0.1883F, 2.4396F, -3.8669F, 3, 8, 7, 0.001F, false));
		bone9.cubeList.add(new ModelBox(bone9, 361, 482, 1.4383F, 2.4396F, 3.1331F, 2, 8, 1, 0.001F, false));
		bone9.cubeList.add(new ModelBox(bone9, 188, 558, 1.4383F, 3.255F, 0.742F, 2, 8, 2, 0.001F, false));
		bone9.cubeList.add(new ModelBox(bone9, 425, 560, 1.4383F, 3.7215F, -1.673F, 2, 7, 2, 0.001F, false));
		bone9.cubeList.add(new ModelBox(bone9, 158, 563, 1.4383F, 5.5478F, -4.0531F, 2, 5, 2, 0.001F, false));
		bone9.cubeList.add(new ModelBox(bone9, 532, 29, 1.4383F, 10.3396F, -3.9669F, 2, 1, 8, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 167, 563, -0.0617F, 5.5478F, -4.0531F, 2, 5, 2, 0.001F, false));
		bone9.cubeList.add(new ModelBox(bone9, 445, 560, -0.0617F, 3.7215F, -1.673F, 2, 7, 2, 0.001F, false));
		bone9.cubeList.add(new ModelBox(bone9, 197, 558, -0.0617F, 3.255F, 0.742F, 2, 8, 2, 0.001F, false));
		bone9.cubeList.add(new ModelBox(bone9, 457, 500, -0.0617F, 2.4396F, 3.1331F, 2, 8, 1, 0.001F, false));
		bone9.cubeList.add(new ModelBox(bone9, 472, 549, -0.0617F, 10.3396F, -3.9669F, 2, 1, 8, 0.0F, false));
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