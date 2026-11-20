package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AKSUStock extends ModelBase {
	private final ModelRenderer stockTriangle;
	private final ModelRenderer cube_r82_r1;
	private final ModelRenderer cube_r81_r1;
	private final ModelRenderer cube_r81_r2;
	private final ModelRenderer cube_r80_r1;
	private final ModelRenderer cube_r80_r2;
	private final ModelRenderer cube_r79_r1;
	private final ModelRenderer cube_r80_r3;
	private final ModelRenderer cube_r81_r3;
	private final ModelRenderer cube_r81_r4;
	private final ModelRenderer cube_r80_r4;
	private final ModelRenderer cube_r79_r2;
	private final ModelRenderer cube_r78_r1;
	private final ModelRenderer cube_r80_r5;
	private final ModelRenderer cube_r79_r3;
	private final ModelRenderer cube_r79_r4;
	private final ModelRenderer cube_r78_r2;
	private final ModelRenderer gun366;
	private final ModelRenderer gun366_r1;
	private final ModelRenderer gun366_r1_r1;
	private final ModelRenderer gun2;
	private final ModelRenderer gun245_r1;
	private final ModelRenderer gun3;
	private final ModelRenderer gun244_r1;
	private final ModelRenderer gun4;
	private final ModelRenderer gun243_r1;
	private final ModelRenderer gun5;
	private final ModelRenderer gun242_r1;
	private final ModelRenderer gun6;
	private final ModelRenderer gun241_r1;
	private final ModelRenderer gun7;
	private final ModelRenderer gun237_r1;
	private final ModelRenderer gun8;
	private final ModelRenderer gun12_r1;
	private final ModelRenderer gun12_r2;
	private final ModelRenderer gun10_r1;
	private final ModelRenderer gun13_r1;
	private final ModelRenderer gun12_r3;
	private final ModelRenderer gun12_r4;
	private final ModelRenderer gun11_r1;
	private final ModelRenderer gun11_r2;
	private final ModelRenderer gun11_r3;
	private final ModelRenderer gun11_r4;
	private final ModelRenderer gun12_r5;
	private final ModelRenderer gun11_r5;
	private final ModelRenderer gun11_r6;
	private final ModelRenderer gun9_r1;

	public AKSUStock() {
		textureWidth = 352;
		textureHeight = 352;

		stockTriangle = new ModelRenderer(this);
		stockTriangle.setRotationPoint(0.5F, 24.0F, 0.0F);
		stockTriangle.cubeList.add(new ModelBox(stockTriangle, 298, 333, -4.3F, -33.3F, 0.1F, 2, 1, 2, 0.0F, false));
		stockTriangle.cubeList.add(new ModelBox(stockTriangle, 336, 68, -1.3F, -33.3F, 1.1F, 2, 1, 1, 0.0F, false));
		stockTriangle.cubeList.add(new ModelBox(stockTriangle, 338, 154, -0.7F, -31.8F, 0.3F, 1, 1, 1, 0.0F, false));
		stockTriangle.cubeList.add(new ModelBox(stockTriangle, 338, 156, -4.3F, -31.8F, 0.3F, 1, 1, 1, 0.0F, false));

		cube_r82_r1 = new ModelRenderer(this);
		cube_r82_r1.setRotationPoint(-3.3865F, -31.9924F, 6.8709F);
		stockTriangle.addChild(cube_r82_r1);
		setRotationAngle(cube_r82_r1, -0.9599F, 0.2182F, 0.0F);
		cube_r82_r1.cubeList.add(new ModelBox(cube_r82_r1, 154, 338, -0.5F, -0.1063F, -1.0018F, 1, 1, 1, -0.3F, false));

		cube_r81_r1 = new ModelRenderer(this);
		cube_r81_r1.setRotationPoint(-3.6798F, -33.928F, 5.5476F);
		stockTriangle.addChild(cube_r81_r1);
		setRotationAngle(cube_r81_r1, -0.9599F, 0.2182F, 0.0F);
		cube_r81_r1.cubeList.add(new ModelBox(cube_r81_r1, 338, 152, -0.5F, -0.1063F, -1.0018F, 1, 1, 1, -0.3F, false));

		cube_r81_r2 = new ModelRenderer(this);
		cube_r81_r2.setRotationPoint(-3.4361F, -32.3201F, 6.6469F);
		stockTriangle.addChild(cube_r81_r2);
		setRotationAngle(cube_r81_r2, -0.9599F, 0.2182F, 0.0F);
		cube_r81_r2.cubeList.add(new ModelBox(cube_r81_r2, 338, 150, -0.5F, -0.1063F, -1.0018F, 1, 1, 1, -0.3F, false));

		cube_r80_r1 = new ModelRenderer(this);
		cube_r80_r1.setRotationPoint(-3.6301F, -33.6004F, 5.7716F);
		stockTriangle.addChild(cube_r80_r1);
		setRotationAngle(cube_r80_r1, -0.9599F, 0.2182F, 0.0F);
		cube_r80_r1.cubeList.add(new ModelBox(cube_r80_r1, 338, 148, -0.5F, -0.1063F, -1.0018F, 1, 1, 1, -0.3F, false));

		cube_r80_r2 = new ModelRenderer(this);
		cube_r80_r2.setRotationPoint(-3.6818F, -32.2577F, 5.5386F);
		stockTriangle.addChild(cube_r80_r2);
		setRotationAngle(cube_r80_r2, -0.9599F, 0.2182F, 0.0F);
		cube_r80_r2.cubeList.add(new ModelBox(cube_r80_r2, 298, 336, -0.5F, -0.1063F, -1.0018F, 1, 1, 2, -0.3F, false));

		cube_r79_r1 = new ModelRenderer(this);
		cube_r79_r1.setRotationPoint(-3.851F, -33.3742F, 4.7754F);
		stockTriangle.addChild(cube_r79_r1);
		setRotationAngle(cube_r79_r1, -0.9599F, 0.2182F, 0.0F);
		cube_r79_r1.cubeList.add(new ModelBox(cube_r79_r1, 84, 240, -0.5F, -0.1063F, -1.0018F, 1, 1, 2, -0.3F, false));

		cube_r80_r3 = new ModelRenderer(this);
		cube_r80_r3.setRotationPoint(-3.6822F, -32.2606F, 5.5366F);
		stockTriangle.addChild(cube_r80_r3);
		setRotationAngle(cube_r80_r3, -1.7453F, 0.2182F, 0.0F);
		cube_r80_r3.cubeList.add(new ModelBox(cube_r80_r3, 338, 146, -0.5F, -0.7764F, 0.216F, 1, 1, 1, -0.3F, false));

		cube_r81_r3 = new ModelRenderer(this);
		cube_r81_r3.setRotationPoint(-3.851F, -33.3742F, 4.7754F);
		stockTriangle.addChild(cube_r81_r3);
		setRotationAngle(cube_r81_r3, -1.7453F, 0.2182F, 0.0F);
		cube_r81_r3.cubeList.add(new ModelBox(cube_r81_r3, 282, 337, -0.5F, 0.216F, -0.7765F, 1, 1, 1, -0.3F, false));

		cube_r81_r4 = new ModelRenderer(this);
		cube_r81_r4.setRotationPoint(-4.0458F, -34.6596F, 3.8966F);
		stockTriangle.addChild(cube_r81_r4);
		setRotationAngle(cube_r81_r4, -0.9599F, 0.2182F, 0.0F);
		cube_r81_r4.cubeList.add(new ModelBox(cube_r81_r4, 8, 339, -0.5F, -0.3892F, 0.2846F, 1, 1, 1, -0.3F, false));

		cube_r80_r4 = new ModelRenderer(this);
		cube_r80_r4.setRotationPoint(-3.6822F, -32.2606F, 5.5366F);
		stockTriangle.addChild(cube_r80_r4);
		setRotationAngle(cube_r80_r4, -0.9599F, 0.2182F, 0.0F);
		cube_r80_r4.cubeList.add(new ModelBox(cube_r80_r4, 338, 144, -0.5F, -0.3892F, 0.2846F, 1, 1, 1, -0.3F, false));

		cube_r79_r2 = new ModelRenderer(this);
		cube_r79_r2.setRotationPoint(-3.6113F, -32.49F, 5.8565F);
		stockTriangle.addChild(cube_r79_r2);
		setRotationAngle(cube_r79_r2, -0.9599F, 0.2182F, 0.0F);
		cube_r79_r2.cubeList.add(new ModelBox(cube_r79_r2, 338, 142, -0.5F, -0.3892F, 0.2846F, 1, 1, 1, -0.3F, false));

		cube_r78_r1 = new ModelRenderer(this);
		cube_r78_r1.setRotationPoint(-3.7801F, -33.6036F, 5.0953F);
		stockTriangle.addChild(cube_r78_r1);
		setRotationAngle(cube_r78_r1, -0.9599F, 0.2182F, 0.0F);
		cube_r78_r1.cubeList.add(new ModelBox(cube_r78_r1, 166, 335, -0.5F, -0.3892F, -1.2846F, 1, 1, 1, -0.3F, false));

		cube_r80_r5 = new ModelRenderer(this);
		cube_r80_r5.setRotationPoint(-3.7801F, -33.6036F, 5.0953F);
		stockTriangle.addChild(cube_r80_r5);
		setRotationAngle(cube_r80_r5, -1.7453F, 0.2182F, 0.0F);
		cube_r80_r5.cubeList.add(new ModelBox(cube_r80_r5, 338, 140, -0.5F, -0.0668F, -1.0593F, 1, 1, 1, -0.3F, false));

		cube_r79_r3 = new ModelRenderer(this);
		cube_r79_r3.setRotationPoint(-3.6113F, -32.49F, 5.8565F);
		stockTriangle.addChild(cube_r79_r3);
		setRotationAngle(cube_r79_r3, -1.7453F, 0.2182F, 0.0F);
		cube_r79_r3.cubeList.add(new ModelBox(cube_r79_r3, 338, 138, -0.5F, -1.0593F, -0.0668F, 1, 1, 1, -0.3F, false));

		cube_r79_r4 = new ModelRenderer(this);
		cube_r79_r4.setRotationPoint(-3.699F, -33.0362F, 5.4611F);
		stockTriangle.addChild(cube_r79_r4);
		setRotationAngle(cube_r79_r4, -0.6545F, 0.2182F, 0.0F);
		cube_r79_r4.cubeList.add(new ModelBox(cube_r79_r4, 338, 136, -0.5F, -0.8658F, -0.8574F, 1, 1, 1, -0.3F, false));

		cube_r78_r2 = new ModelRenderer(this);
		cube_r78_r2.setRotationPoint(-3.699F, -33.0362F, 5.4611F);
		stockTriangle.addChild(cube_r78_r2);
		setRotationAngle(cube_r78_r2, -1.2654F, 0.2182F, 0.0F);
		cube_r78_r2.cubeList.add(new ModelBox(cube_r78_r2, 338, 134, -0.5F, -0.8658F, -0.1426F, 1, 1, 1, -0.3F, false));

		gun366 = new ModelRenderer(this);
		gun366.setRotationPoint(-3.5F, -31.6F, 12.5F);
		stockTriangle.addChild(gun366);
		setRotationAngle(gun366, -0.3346F, 0.0F, 0.0F);
		

		gun366_r1 = new ModelRenderer(this);
		gun366_r1.setRotationPoint(3.503F, 30.1958F, -13.6951F);
		gun366.addChild(gun366_r1);
		setRotationAngle(gun366_r1, -0.0436F, 0.0F, 0.0F);
		

		gun366_r1_r1 = new ModelRenderer(this);
		gun366_r1_r1.setRotationPoint(-1.003F, -31.8419F, 24.22F);
		gun366_r1.addChild(gun366_r1_r1);
		setRotationAngle(gun366_r1_r1, 0.0873F, 0.0F, 0.0F);
		

		gun2 = new ModelRenderer(this);
		gun2.setRotationPoint(-1.1F, -33.9F, 30.8F);
		stockTriangle.addChild(gun2);
		setRotationAngle(gun2, -0.0873F, 0.0F, 0.0F);
		

		gun245_r1 = new ModelRenderer(this);
		gun245_r1.setRotationPoint(0.1F, 6.2541F, -6.3647F);
		gun2.addChild(gun245_r1);
		setRotationAngle(gun245_r1, 0.0873F, 0.0F, 0.0F);
		

		gun3 = new ModelRenderer(this);
		gun3.setRotationPoint(-0.6F, -32.9F, 29.7F);
		stockTriangle.addChild(gun3);
		setRotationAngle(gun3, -0.0873F, 0.0F, 0.0F);
		

		gun244_r1 = new ModelRenderer(this);
		gun244_r1.setRotationPoint(-0.4F, 5.162F, -5.356F);
		gun3.addChild(gun244_r1);
		setRotationAngle(gun244_r1, 0.0873F, 0.0F, 0.0F);
		

		gun4 = new ModelRenderer(this);
		gun4.setRotationPoint(-3.4F, -32.9F, 29.7F);
		stockTriangle.addChild(gun4);
		setRotationAngle(gun4, -0.0873F, 0.0F, 0.0F);
		

		gun243_r1 = new ModelRenderer(this);
		gun243_r1.setRotationPoint(2.4F, 5.162F, -5.356F);
		gun4.addChild(gun243_r1);
		setRotationAngle(gun243_r1, 0.0873F, 0.0F, 0.0F);
		

		gun5 = new ModelRenderer(this);
		gun5.setRotationPoint(-2.9F, -33.9F, 30.8F);
		stockTriangle.addChild(gun5);
		setRotationAngle(gun5, -0.0873F, 0.0F, 0.0F);
		

		gun242_r1 = new ModelRenderer(this);
		gun242_r1.setRotationPoint(1.9F, 6.2541F, -6.3647F);
		gun5.addChild(gun242_r1);
		setRotationAngle(gun242_r1, 0.0873F, 0.0F, 0.0F);
		

		gun6 = new ModelRenderer(this);
		gun6.setRotationPoint(-3.5F, -23.9F, 28.6F);
		stockTriangle.addChild(gun6);
		setRotationAngle(gun6, -0.1115F, 0.0F, 0.0F);
		

		gun241_r1 = new ModelRenderer(this);
		gun241_r1.setRotationPoint(2.5F, -3.7764F, -5.1378F);
		gun6.addChild(gun241_r1);
		setRotationAngle(gun241_r1, 0.0873F, 0.0F, 0.0F);
		

		gun7 = new ModelRenderer(this);
		gun7.setRotationPoint(-3.0F, -35.5F, 12.95F);
		stockTriangle.addChild(gun7);
		setRotationAngle(gun7, -0.1002F, 0.0F, 0.0F);
		

		gun237_r1 = new ModelRenderer(this);
		gun237_r1.setRotationPoint(2.0F, 6.1421F, 11.6371F);
		gun7.addChild(gun237_r1);
		setRotationAngle(gun237_r1, 0.0873F, 0.0F, 0.0F);
		

		gun8 = new ModelRenderer(this);
		gun8.setRotationPoint(-3.5F, -35.9F, -1.5F);
		stockTriangle.addChild(gun8);
		setRotationAngle(gun8, -1.5708F, 0.0F, 0.0F);
		gun8.cubeList.add(new ModelBox(gun8, 174, 323, 0.0F, -6.8966F, 0.591F, 3, 2, 5, 0.0F, false));
		gun8.cubeList.add(new ModelBox(gun8, 74, 330, 0.0F, -8.3966F, 1.491F, 1, 2, 3, 0.0F, false));
		gun8.cubeList.add(new ModelBox(gun8, 338, 132, -0.5F, -7.8966F, 2.191F, 1, 1, 1, 0.0F, false));

		gun12_r1 = new ModelRenderer(this);
		gun12_r1.setRotationPoint(1.5F, -20.6966F, 9.9945F);
		gun8.addChild(gun12_r1);
		setRotationAngle(gun12_r1, 2.7222F, 0.7401F, -0.2921F);
		gun12_r1.cubeList.add(new ModelBox(gun12_r1, 250, 306, -0.2886F, -15.8283F, 0.4185F, 1, 26, 1, 0.0F, false));
		gun12_r1.cubeList.add(new ModelBox(gun12_r1, 246, 301, 0.4185F, -15.8283F, -0.2886F, 1, 26, 1, 0.0F, false));

		gun12_r2 = new ModelRenderer(this);
		gun12_r2.setRotationPoint(2.2071F, -20.9092F, 9.3201F);
		gun8.addChild(gun12_r2);
		setRotationAngle(gun12_r2, 2.8362F, 0.0F, 0.0F);
		gun12_r2.cubeList.add(new ModelBox(gun12_r2, 154, 215, -0.5F, -15.8283F, 0.0918F, 1, 26, 1, 0.0F, false));
		gun12_r2.cubeList.add(new ModelBox(gun12_r2, 150, 215, -1.9142F, -15.8283F, 0.0918F, 1, 26, 1, 0.0F, false));

		gun10_r1 = new ModelRenderer(this);
		gun10_r1.setRotationPoint(1.5F, -20.6966F, 9.9945F);
		gun8.addChild(gun10_r1);
		setRotationAngle(gun10_r1, 2.8362F, 0.0F, 0.0F);
		gun10_r1.cubeList.add(new ModelBox(gun10_r1, 146, 215, -0.5F, -15.8283F, 0.0918F, 1, 26, 1, 0.0F, false));

		gun13_r1 = new ModelRenderer(this);
		gun13_r1.setRotationPoint(-3.2426F, -20.6025F, 11.0313F);
		gun8.addChild(gun13_r1);
		setRotationAngle(gun13_r1, -0.0617F, -0.7844F, 0.0436F);
		gun13_r1.cubeList.add(new ModelBox(gun13_r1, 278, 337, 2.7783F, -11.5461F, -2.5146F, 1, 2, 1, 0.0F, false));

		gun12_r3 = new ModelRenderer(this);
		gun12_r3.setRotationPoint(-2.2426F, -20.6025F, 11.0313F);
		gun8.addChild(gun12_r3);
		setRotationAngle(gun12_r3, -0.0617F, -0.7844F, 0.0436F);
		gun12_r3.cubeList.add(new ModelBox(gun12_r3, 264, 337, 3.4854F, -11.5461F, -3.2217F, 1, 2, 1, 0.0F, false));

		gun12_r4 = new ModelRenderer(this);
		gun12_r4.setRotationPoint(1.0F, -20.853F, 5.2936F);
		gun8.addChild(gun12_r4);
		setRotationAngle(gun12_r4, -0.0617F, -0.7844F, 0.0436F);
		gun12_r4.cubeList.add(new ModelBox(gun12_r4, 260, 337, -3.2217F, -11.5461F, -2.5146F, 1, 2, 1, 0.0F, false));

		gun11_r1 = new ModelRenderer(this);
		gun11_r1.setRotationPoint(2.0F, -20.853F, 5.2936F);
		gun8.addChild(gun11_r1);
		setRotationAngle(gun11_r1, -0.0617F, -0.7844F, 0.0436F);
		gun11_r1.cubeList.add(new ModelBox(gun11_r1, 228, 337, -2.5146F, -11.5461F, -3.2217F, 1, 2, 1, 0.0F, false));

		gun11_r2 = new ModelRenderer(this);
		gun11_r2.setRotationPoint(1.5F, -19.8966F, 1.1945F);
		gun8.addChild(gun11_r2);
		setRotationAngle(gun11_r2, -0.0617F, -0.7844F, 0.0436F);
		gun11_r2.cubeList.add(new ModelBox(gun11_r2, 308, 211, -0.2886F, -11.8283F, 0.4185F, 1, 25, 1, 0.0F, false));
		gun11_r2.cubeList.add(new ModelBox(gun11_r2, 308, 185, 0.4185F, -11.8283F, -0.2886F, 1, 25, 1, 0.0F, false));

		gun11_r3 = new ModelRenderer(this);
		gun11_r3.setRotationPoint(0.7929F, -19.8658F, 1.901F);
		gun8.addChild(gun11_r3);
		setRotationAngle(gun11_r3, -0.0436F, 0.0F, 0.0F);
		gun11_r3.cubeList.add(new ModelBox(gun11_r3, 258, 306, -0.5F, -11.8283F, 0.0918F, 1, 25, 1, 0.0F, false));
		gun11_r3.cubeList.add(new ModelBox(gun11_r3, 254, 306, 0.9142F, -11.8283F, 0.0918F, 1, 25, 1, 0.0F, false));

		gun11_r4 = new ModelRenderer(this);
		gun11_r4.setRotationPoint(1.5F, -20.8966F, 0.2945F);
		gun8.addChild(gun11_r4);
		setRotationAngle(gun11_r4, -0.0436F, 0.0F, 0.0F);
		gun11_r4.cubeList.add(new ModelBox(gun11_r4, 336, 295, -1.0F, -11.7206F, 11.34F, 2, 2, 1, 0.0F, false));
		gun11_r4.cubeList.add(new ModelBox(gun11_r4, 220, 301, -1.0F, -11.7206F, 0.94F, 2, 1, 11, 0.0F, false));

		gun12_r5 = new ModelRenderer(this);
		gun12_r5.setRotationPoint(-2.7929F, -20.91F, -0.0123F);
		gun8.addChild(gun12_r5);
		setRotationAngle(gun12_r5, -0.0436F, 0.0F, 0.0F);
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 306, 86, 5.0F, -11.7206F, 1.94F, 1, 2, 10, 0.0F, false));

		gun11_r5 = new ModelRenderer(this);
		gun11_r5.setRotationPoint(-2.2071F, -20.9094F, 0.0019F);
		gun8.addChild(gun11_r5);
		setRotationAngle(gun11_r5, -0.0436F, 0.0F, 0.0F);
		gun11_r5.cubeList.add(new ModelBox(gun11_r5, 306, 74, 2.0F, -11.7206F, 1.94F, 1, 2, 10, 0.0F, false));

		gun11_r6 = new ModelRenderer(this);
		gun11_r6.setRotationPoint(1.5F, -20.853F, 1.2936F);
		gun8.addChild(gun11_r6);
		setRotationAngle(gun11_r6, -0.0436F, 0.0F, 0.0F);
		gun11_r6.cubeList.add(new ModelBox(gun11_r6, 320, 247, -1.0F, -10.7206F, -0.06F, 2, 1, 1, 0.0F, false));

		gun9_r1 = new ModelRenderer(this);
		gun9_r1.setRotationPoint(1.5F, -19.8966F, 1.1945F);
		gun8.addChild(gun9_r1);
		setRotationAngle(gun9_r1, -0.0436F, 0.0F, 0.0F);
		gun9_r1.cubeList.add(new ModelBox(gun9_r1, 274, 306, -0.5F, -11.8283F, 0.0918F, 1, 25, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		stockTriangle.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}