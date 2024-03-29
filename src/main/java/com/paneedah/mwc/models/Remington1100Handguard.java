package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Remington1100Handguard extends ModelBase {
	private final ModelRenderer handguard;
	private final ModelRenderer pump28_r1;
	private final ModelRenderer pump27_r1;
	private final ModelRenderer pump26_r1;
	private final ModelRenderer pump25_r1;
	private final ModelRenderer pump24_r1;
	private final ModelRenderer pump23_r1;
	private final ModelRenderer pump22_r1;
	private final ModelRenderer pump21_r1;
	private final ModelRenderer pump19_r1;
	private final ModelRenderer pump14_r1;
	private final ModelRenderer pump11_r1;
	private final ModelRenderer pump10_r1;
	private final ModelRenderer pump9_r1;
	private final ModelRenderer pump7_r1;
	private final ModelRenderer pump6_r1;

	public Remington1100Handguard() {
		textureWidth = 410;
		textureHeight = 410;

		handguard = new ModelRenderer(this);
		handguard.setRotationPoint(18.9609F, -14.7134F, 5.5F);
		handguard.cubeList.add(new ModelBox(handguard, 184, 307, -22.2609F, 12.1134F, -37.5F, 1, 1, 18, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 138, 301, -18.6609F, 12.1134F, -37.5F, 1, 1, 18, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 287, 20, -21.1609F, 13.8134F, -37.5F, 1, 1, 18, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 254, 68, -20.7609F, 13.8134F, -37.5F, 2, 1, 18, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 194, 317, -22.2609F, 12.1134F, -45.5F, 1, 1, 8, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 148, 311, -18.6609F, 12.1134F, -45.5F, 1, 1, 8, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 297, 30, -21.1609F, 13.8134F, -45.5F, 1, 1, 8, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 264, 78, -20.7609F, 13.8134F, -45.5F, 2, 1, 8, 0.0F, false));

		pump28_r1 = new ModelRenderer(this);
		pump28_r1.setRotationPoint(-1.8765F, -8.4191F, 0.0F);
		handguard.addChild(pump28_r1);
		setRotationAngle(pump28_r1, 0.0F, 0.0F, -2.2307F);
		pump28_r1.cubeList.add(new ModelBox(pump28_r1, 198, 232, -4.0F, -27.75F, -37.5F, 1, 1, 13, 0.0F, false));
		pump28_r1.cubeList.add(new ModelBox(pump28_r1, 203, 237, -4.0F, -27.75F, -45.5F, 1, 1, 8, 0.0F, false));

		pump27_r1 = new ModelRenderer(this);
		pump27_r1.setRotationPoint(-39.2715F, -6.8389F, 0.0F);
		handguard.addChild(pump27_r1);
		setRotationAngle(pump27_r1, 0.0F, 0.0F, 2.2307F);
		pump27_r1.cubeList.add(new ModelBox(pump27_r1, 84, 234, 1.0F, -27.75F, -37.5F, 1, 1, 13, 0.0F, false));
		pump27_r1.cubeList.add(new ModelBox(pump27_r1, 89, 239, 1.0F, -27.75F, -45.5F, 1, 1, 8, 0.0F, false));

		pump26_r1 = new ModelRenderer(this);
		pump26_r1.setRotationPoint(-34.684F, -4.0739F, 0.0F);
		handguard.addChild(pump26_r1);
		setRotationAngle(pump26_r1, 0.0F, 0.0F, 2.3562F);
		pump26_r1.cubeList.add(new ModelBox(pump26_r1, 234, 375, 1.0F, -24.65F, -35.5F, 1, 1, 14, 0.0F, false));
		pump26_r1.cubeList.add(new ModelBox(pump26_r1, 236, 377, 1.0F, -24.65F, -45.5F, 1, 1, 12, 0.0F, false));

		pump25_r1 = new ModelRenderer(this);
		pump25_r1.setRotationPoint(-6.652F, -5.4881F, 0.0F);
		handguard.addChild(pump25_r1);
		setRotationAngle(pump25_r1, 0.0F, 0.0F, -2.3562F);
		pump25_r1.cubeList.add(new ModelBox(pump25_r1, 264, 375, -4.0F, -24.65F, -35.5F, 1, 1, 14, 0.0F, false));
		pump25_r1.cubeList.add(new ModelBox(pump25_r1, 266, 377, -4.0F, -24.65F, -45.5F, 1, 1, 12, 0.0F, false));

		pump24_r1 = new ModelRenderer(this);
		pump24_r1.setRotationPoint(-34.4062F, -9.7302F, 0.0F);
		handguard.addChild(pump24_r1);
		setRotationAngle(pump24_r1, 0.0F, 0.0F, 2.7884F);
		pump24_r1.cubeList.add(new ModelBox(pump24_r1, 94, 14, -4.4F, -26.6F, -33.5F, 1, 1, 10, 0.0F, false));
		pump24_r1.cubeList.add(new ModelBox(pump24_r1, 96, 16, -4.4F, -26.6F, -41.5F, 1, 1, 8, 0.0F, false));

		pump23_r1 = new ModelRenderer(this);
		pump23_r1.setRotationPoint(-7.3922F, -10.422F, 0.0F);
		handguard.addChild(pump23_r1);
		setRotationAngle(pump23_r1, 0.0F, 0.0F, -2.7884F);
		pump23_r1.cubeList.add(new ModelBox(pump23_r1, 94, 40, 1.4F, -26.6F, -33.5F, 1, 1, 10, 0.0F, false));
		pump23_r1.cubeList.add(new ModelBox(pump23_r1, 96, 42, 1.4F, -26.6F, -41.5F, 1, 1, 8, 0.0F, false));

		pump22_r1 = new ModelRenderer(this);
		pump22_r1.setRotationPoint(-19.0993F, -14.5034F, 0.0F);
		handguard.addChild(pump22_r1);
		setRotationAngle(pump22_r1, 0.0F, 0.0F, -2.8999F);
		

		pump21_r1 = new ModelRenderer(this);
		pump21_r1.setRotationPoint(-22.7644F, -14.0248F, 0.0F);
		handguard.addChild(pump21_r1);
		setRotationAngle(pump21_r1, 0.0F, 0.0F, 2.8999F);
		pump21_r1.cubeList.add(new ModelBox(pump21_r1, 27, 248, 1.3F, -25.4F, -37.5F, 1, 1, 13, 0.0F, false));
		pump21_r1.cubeList.add(new ModelBox(pump21_r1, 35, 256, 1.3F, -25.4F, -24.5F, 1, 1, 5, 0.0F, false));
		pump21_r1.cubeList.add(new ModelBox(pump21_r1, 32, 253, 1.3F, -25.4F, -45.5F, 1, 1, 8, 0.0F, false));
		pump21_r1.cubeList.add(new ModelBox(pump21_r1, 124, 151, 1.301F, -26.3F, -25.5F, 1, 1, 6, 0.0F, false));
		pump21_r1.cubeList.add(new ModelBox(pump21_r1, 0, 149, 1.3F, -26.6F, -26.5F, 1, 1, 7, 0.0F, false));

		pump19_r1 = new ModelRenderer(this);
		pump19_r1.setRotationPoint(-19.0991F, -14.5034F, 0.0F);
		handguard.addChild(pump19_r1);
		setRotationAngle(pump19_r1, 0.0F, 0.0F, -2.8999F);
		pump19_r1.cubeList.add(new ModelBox(pump19_r1, 255, 232, -4.3F, -25.4F, -37.5F, 1, 1, 13, 0.0F, false));
		pump19_r1.cubeList.add(new ModelBox(pump19_r1, 263, 240, -4.3F, -25.4F, -24.5F, 1, 1, 5, 0.0F, false));
		pump19_r1.cubeList.add(new ModelBox(pump19_r1, 260, 237, -4.3F, -25.4F, -45.5F, 1, 1, 8, 0.0F, false));
		pump19_r1.cubeList.add(new ModelBox(pump19_r1, 66, 149, -4.301F, -26.3F, -25.5F, 1, 1, 6, 0.0F, false));
		pump19_r1.cubeList.add(new ModelBox(pump19_r1, 57, 149, -4.3F, -26.6F, -26.5F, 1, 1, 7, 0.0F, false));

		pump14_r1 = new ModelRenderer(this);
		pump14_r1.setRotationPoint(-12.3565F, -12.7935F, 0.0F);
		handguard.addChild(pump14_r1);
		setRotationAngle(pump14_r1, 0.0F, 0.0F, -2.6397F);
		pump14_r1.cubeList.add(new ModelBox(pump14_r1, 0, 220, -4.3F, -26.6F, -37.5F, 1, 2, 12, 0.0F, false));
		pump14_r1.cubeList.add(new ModelBox(pump14_r1, 4, 224, -4.3F, -26.6F, -45.5F, 1, 2, 8, 0.0F, false));

		pump11_r1 = new ModelRenderer(this);
		pump11_r1.setRotationPoint(-6.4813F, -5.4174F, 0.0F);
		handguard.addChild(pump11_r1);
		setRotationAngle(pump11_r1, 0.0F, 0.0F, -2.3562F);
		pump11_r1.cubeList.add(new ModelBox(pump11_r1, 184, 288, -3.9F, -24.65F, -37.5F, 1, 1, 18, 0.0F, false));
		pump11_r1.cubeList.add(new ModelBox(pump11_r1, 188, 292, -3.9F, -24.65F, -45.5F, 1, 1, 14, 0.0F, false));

		pump10_r1 = new ModelRenderer(this);
		pump10_r1.setRotationPoint(-34.2123F, -9.7648F, 0.0F);
		handguard.addChild(pump10_r1);
		setRotationAngle(pump10_r1, 0.0F, 0.0F, 2.7884F);
		pump10_r1.cubeList.add(new ModelBox(pump10_r1, 0, 293, -4.3F, -26.6F, -37.5F, 1, 1, 18, 0.0F, false));
		pump10_r1.cubeList.add(new ModelBox(pump10_r1, 4, 297, -4.3F, -26.6F, -45.5F, 1, 1, 14, 0.0F, false));

		pump9_r1 = new ModelRenderer(this);
		pump9_r1.setRotationPoint(-34.7693F, -4.0385F, 0.0F);
		handguard.addChild(pump9_r1);
		setRotationAngle(pump9_r1, 0.0F, 0.0F, 2.3562F);
		pump9_r1.cubeList.add(new ModelBox(pump9_r1, 46, 296, 0.95F, -24.65F, -37.5F, 1, 1, 18, 0.0F, false));
		pump9_r1.cubeList.add(new ModelBox(pump9_r1, 50, 300, 0.95F, -24.65F, -45.5F, 1, 1, 14, 0.0F, false));

		pump7_r1 = new ModelRenderer(this);
		pump7_r1.setRotationPoint(-7.586F, -10.4566F, 0.0F);
		handguard.addChild(pump7_r1);
		setRotationAngle(pump7_r1, 0.0F, 0.0F, -2.7884F);
		pump7_r1.cubeList.add(new ModelBox(pump7_r1, 92, 296, 1.3F, -26.6F, -37.5F, 1, 1, 18, 0.0F, false));
		pump7_r1.cubeList.add(new ModelBox(pump7_r1, 96, 300, 1.3F, -26.6F, -45.5F, 1, 1, 14, 0.0F, false));

		pump6_r1 = new ModelRenderer(this);
		pump6_r1.setRotationPoint(-29.3185F, -11.8313F, 0.0F);
		handguard.addChild(pump6_r1);
		setRotationAngle(pump6_r1, 0.0F, 0.0F, 2.6397F);
		pump6_r1.cubeList.add(new ModelBox(pump6_r1, 28, 221, 1.3F, -26.6F, -37.5F, 1, 2, 12, 0.0F, false));
		pump6_r1.cubeList.add(new ModelBox(pump6_r1, 32, 225, 1.3F, -26.6F, -45.5F, 1, 2, 8, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handguard.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}