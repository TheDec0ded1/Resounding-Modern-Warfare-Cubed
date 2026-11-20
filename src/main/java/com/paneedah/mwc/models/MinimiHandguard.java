package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class MinimiHandguard extends ModelWithAttachments {
	private final ModelRenderer lowerhandguard;
	private final ModelRenderer Handguard20;
	private final ModelRenderer Handguard19;
	private final ModelRenderer Handguard18;
	private final ModelRenderer Handguard17;
	private final ModelRenderer Handguard16;
	private final ModelRenderer Handguard15;
	private final ModelRenderer Handguard14;
	private final ModelRenderer Handguard13;
	private final ModelRenderer Handguard12;
	private final ModelRenderer Handguard10;
	private final ModelRenderer Handguard11;
	private final ModelRenderer Handguard9;
	private final ModelRenderer Handguard8;
	private final ModelRenderer Handguard7;
	private final ModelRenderer Handguard4;
	private final ModelRenderer Handguard3;
	private final ModelRenderer Handguard2;
	private final ModelRenderer Handguard1;

	public MinimiHandguard() {
		textureWidth = 350;
		textureHeight = 350;

		lowerhandguard = new ModelRenderer(this);
		lowerhandguard.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		Handguard20 = new ModelRenderer(this);
		Handguard20.setRotationPoint(-3.0F, -25.5F, 20.0F);
		lowerhandguard.addChild(Handguard20);
		

		Handguard19 = new ModelRenderer(this);
		Handguard19.setRotationPoint(-3.0F, -24.0F, 20.5F);
		lowerhandguard.addChild(Handguard19);
		

		Handguard18 = new ModelRenderer(this);
		Handguard18.setRotationPoint(-3.0F, -22.5F, 20.5F);
		lowerhandguard.addChild(Handguard18);
		

		Handguard17 = new ModelRenderer(this);
		Handguard17.setRotationPoint(-2.8F, -20.8F, 35.0F);
		lowerhandguard.addChild(Handguard17);
		Handguard17.cubeList.add(new ModelBox(Handguard17, 35, 29, -2.0F, -9.6F, -69.0F, 6, 1, 3, 0.0F, false));

		Handguard16 = new ModelRenderer(this);
		Handguard16.setRotationPoint(2.8F, -20.8F, 35.0F);
		lowerhandguard.addChild(Handguard16);
		Handguard16.cubeList.add(new ModelBox(Handguard16, 0, 105, -2.0F, -9.6F, -69.0F, 1, 1, 3, 0.0F, false));

		Handguard15 = new ModelRenderer(this);
		Handguard15.setRotationPoint(-3.0F, -27.0F, 33.0F);
		lowerhandguard.addChild(Handguard15);
		setRotationAngle(Handguard15, -1.5615F, 0.0F, 0.0F);
		Handguard15.cubeList.add(new ModelBox(Handguard15, 114, 64, -1.999F, 68.9078F, -10.2409F, 7, 3, 1, 0.0F, false));

		Handguard14 = new ModelRenderer(this);
		Handguard14.setRotationPoint(-3.0F, -27.0F, 33.0F);
		lowerhandguard.addChild(Handguard14);
		setRotationAngle(Handguard14, -1.1897F, 0.0F, 0.0F);
		Handguard14.cubeList.add(new ModelBox(Handguard14, 50, 29, -2.0F, 60.4797F, -34.5741F, 7, 1, 2, 0.0F, false));

		Handguard13 = new ModelRenderer(this);
		Handguard13.setRotationPoint(-3.0F, -24.8F, 38.0F);
		lowerhandguard.addChild(Handguard13);
		setRotationAngle(Handguard13, -1.7846F, 0.0F, 0.0F);
		Handguard13.cubeList.add(new ModelBox(Handguard13, 90, 0, -1.999F, 69.466F, 5.257F, 7, 5, 1, 0.0F, false));

		Handguard12 = new ModelRenderer(this);
		Handguard12.setRotationPoint(-3.3F, -25.0F, 19.7F);
		lowerhandguard.addChild(Handguard12);
		setRotationAngle(Handguard12, -1.6359F, 0.0F, 0.0F);
		Handguard12.cubeList.add(new ModelBox(Handguard12, 64, 0, -2.001F, 69.4782F, -5.0935F, 1, 7, 1, 0.0F, false));

		Handguard10 = new ModelRenderer(this);
		Handguard10.setRotationPoint(-3.3F, -24.4F, 18.7F);
		lowerhandguard.addChild(Handguard10);
		Handguard10.cubeList.add(new ModelBox(Handguard10, 117, 85, -2.0F, -9.601F, -68.999F, 7, 4, 1, 0.0F, false));

		Handguard11 = new ModelRenderer(this);
		Handguard11.setRotationPoint(3.3F, -25.0F, 19.7F);
		lowerhandguard.addChild(Handguard11);
		setRotationAngle(Handguard11, -1.6359F, 0.0F, 0.0F);
		Handguard11.cubeList.add(new ModelBox(Handguard11, 93, 76, -1.999F, 69.4782F, -5.0935F, 1, 7, 1, 0.0F, false));

		Handguard9 = new ModelRenderer(this);
		Handguard9.setRotationPoint(3.3F, -24.4F, 18.7F);
		lowerhandguard.addChild(Handguard9);
		Handguard9.cubeList.add(new ModelBox(Handguard9, 20, 55, -2.0F, -9.6F, -69.0F, 1, 4, 1, 0.0F, false));

		Handguard8 = new ModelRenderer(this);
		Handguard8.setRotationPoint(-3.2F, -20.5F, 19.0F);
		lowerhandguard.addChild(Handguard8);
		setRotationAngle(Handguard8, 1.5359F, 0.0F, 0.0F);
		Handguard8.cubeList.add(new ModelBox(Handguard8, 71, 98, -2.0F, -69.194F, 7.1871F, 7, 19, 1, 0.0F, false));

		Handguard7 = new ModelRenderer(this);
		Handguard7.setRotationPoint(3.2F, -20.5F, 19.0F);
		lowerhandguard.addChild(Handguard7);
		setRotationAngle(Handguard7, 1.5359F, 0.0F, 0.0F);
		Handguard7.cubeList.add(new ModelBox(Handguard7, 63, 34, -2.0F, -69.193F, 7.1861F, 1, 19, 1, 0.0F, false));

		Handguard4 = new ModelRenderer(this);
		Handguard4.setRotationPoint(-2.8F, -24.8F, 19.0F);
		lowerhandguard.addChild(Handguard4);
		Handguard4.cubeList.add(new ModelBox(Handguard4, 207, 154, -2.0F, -9.6F, -68.999F, 6, 4, 19, 0.0F, false));

		Handguard3 = new ModelRenderer(this);
		Handguard3.setRotationPoint(2.8F, -24.8F, 19.0F);
		lowerhandguard.addChild(Handguard3);
		Handguard3.cubeList.add(new ModelBox(Handguard3, 29, 103, -2.0F, -9.6F, -69.0F, 1, 4, 19, 0.0F, false));

		Handguard2 = new ModelRenderer(this);
		Handguard2.setRotationPoint(2.8F, -26.8F, 13.0F);
		lowerhandguard.addChild(Handguard2);
		Handguard2.cubeList.add(new ModelBox(Handguard2, 228, 65, -2.0F, -9.6F, -69.0F, 1, 2, 20, 0.0F, false));

		Handguard1 = new ModelRenderer(this);
		Handguard1.setRotationPoint(-2.8F, -26.8F, 13.0F);
		lowerhandguard.addChild(Handguard1);
		Handguard1.cubeList.add(new ModelBox(Handguard1, 228, 91, -2.0F, -9.6F, -69.0F, 1, 2, 20, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		lowerhandguard.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}