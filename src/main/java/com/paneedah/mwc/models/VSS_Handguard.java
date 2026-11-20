package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class VSS_Handguard extends ModelBase {
	private final ModelRenderer handguard;
	private final ModelRenderer gun421;
	private final ModelRenderer gun425;
	private final ModelRenderer gun427;
	private final ModelRenderer gun431;
	private final ModelRenderer gun432;
	private final ModelRenderer gun433;
	private final ModelRenderer gun204_r1;
	private final ModelRenderer gun436;
	private final ModelRenderer gun437;
	private final ModelRenderer gun438;
	private final ModelRenderer gun439;
	private final ModelRenderer gun440;
	private final ModelRenderer gun441;
	private final ModelRenderer gun442;
	private final ModelRenderer gun194_r1;
	private final ModelRenderer gun193_r1;
	private final ModelRenderer gun443;
	private final ModelRenderer gun444;
	private final ModelRenderer gun192_r1;
	private final ModelRenderer gun191_r1;
	private final ModelRenderer gun445;
	private final ModelRenderer gun446;
	private final ModelRenderer gun448;
	private final ModelRenderer gun449;

	public VSS_Handguard() {
		textureWidth = 256;
		textureHeight = 256;

		handguard = new ModelRenderer(this);
		handguard.setRotationPoint(-8.0F, 24.1F, 0.5F);
		

		gun421 = new ModelRenderer(this);
		gun421.setRotationPoint(-3.0F, -32.8F, -41.5F);
		handguard.addChild(gun421);
		gun421.cubeList.add(new ModelBox(gun421, 220, 186, 8.0F, -2.8F, 3.0F, 3, 3, 1, -0.199F, false));

		gun425 = new ModelRenderer(this);
		gun425.setRotationPoint(-4.1F, -33.0F, -37.0F);
		handguard.addChild(gun425);
		gun425.cubeList.add(new ModelBox(gun425, 149, 111, 8.0614F, 0.5963F, -0.51F, 1, 1, 12, -0.2F, false));
		gun425.cubeList.add(new ModelBox(gun425, 95, 200, 8.0614F, 1.1963F, 3.99F, 1, 1, 5, -0.2F, false));
		gun425.cubeList.add(new ModelBox(gun425, 227, 230, 8.0614F, 1.0963F, 3.39F, 1, 1, 1, -0.2F, false));

		gun427 = new ModelRenderer(this);
		gun427.setRotationPoint(-4.1F, -32.5F, -27.5F);
		handguard.addChild(gun427);
		gun427.cubeList.add(new ModelBox(gun427, 10, 220, 8.0833F, 0.1034F, -1.01F, 1, 2, 3, -0.2F, false));

		gun431 = new ModelRenderer(this);
		gun431.setRotationPoint(0.2F, -32.0F, -27.5F);
		handguard.addChild(gun431);
		gun431.cubeList.add(new ModelBox(gun431, 72, 220, 7.8864F, -0.4287F, -1.01F, 1, 2, 3, -0.2F, false));

		gun432 = new ModelRenderer(this);
		gun432.setRotationPoint(0.2F, -33.0F, -39.5F);
		handguard.addChild(gun432);
		gun432.cubeList.add(new ModelBox(gun432, 0, 69, 3.8864F, 0.5963F, 0.99F, 5, 1, 13, -0.2F, false));
		gun432.cubeList.add(new ModelBox(gun432, 176, 115, 3.8864F, 1.1963F, 6.49F, 5, 1, 5, -0.2F, false));
		gun432.cubeList.add(new ModelBox(gun432, 176, 122, 3.8864F, 1.0963F, 5.89F, 5, 1, 1, -0.2F, false));
		gun432.cubeList.add(new ModelBox(gun432, 220, 203, 3.7864F, 0.5963F, 0.99F, 1, 1, 3, -0.2F, false));
		gun432.cubeList.add(new ModelBox(gun432, 212, 15, 6.8864F, -0.8037F, 0.99F, 2, 2, 3, -0.2F, false));

		gun433 = new ModelRenderer(this);
		gun433.setRotationPoint(0.2F, -32.0F, -39.5F);
		handguard.addChild(gun433);
		setRotationAngle(gun433, 1.3614F, 0.0F, 0.0F);
		

		gun204_r1 = new ModelRenderer(this);
		gun204_r1.setRotationPoint(7.2874F, 13.7676F, 0.9594F);
		gun433.addChild(gun204_r1);
		setRotationAngle(gun204_r1, 0.0873F, 0.0F, 0.0F);
		gun204_r1.cubeList.add(new ModelBox(gun204_r1, 30, 177, -3.601F, -13.012F, -0.3977F, 5, 12, 1, -0.401F, false));
		gun204_r1.cubeList.add(new ModelBox(gun204_r1, 19, 160, -3.524F, -12.812F, -0.1977F, 1, 13, 1, -0.2F, false));
		gun204_r1.cubeList.add(new ModelBox(gun204_r1, 46, 159, 0.601F, -12.812F, -0.1977F, 1, 13, 1, -0.2F, false));

		gun436 = new ModelRenderer(this);
		gun436.setRotationPoint(-4.1F, -36.5F, -41.5F);
		handguard.addChild(gun436);
		setRotationAngle(gun436, 0.0F, 0.0F, -0.7436F);
		gun436.cubeList.add(new ModelBox(gun436, 0, 84, 5.2706F, 6.0587F, 2.98F, 2, 1, 13, -0.2F, false));

		gun437 = new ModelRenderer(this);
		gun437.setRotationPoint(1.2F, -36.5F, -41.5F);
		handguard.addChild(gun437);
		setRotationAngle(gun437, 0.0F, 0.0F, 2.3794F);
		gun437.cubeList.add(new ModelBox(gun437, 58, 113, -5.2106F, -6.0843F, 2.98F, 1, 2, 13, -0.2F, false));

		gun438 = new ModelRenderer(this);
		gun438.setRotationPoint(-4.1F, -36.5F, -41.5F);
		handguard.addChild(gun438);
		gun438.cubeList.add(new ModelBox(gun438, 76, 46, 8.0633F, 0.7034F, 2.98F, 2, 4, 13, -0.2F, false));

		gun439 = new ModelRenderer(this);
		gun439.setRotationPoint(0.2F, -36.5F, -39.5F);
		handguard.addChild(gun439);
		gun439.cubeList.add(new ModelBox(gun439, 87, 125, 6.8874F, 0.5963F, 2.98F, 2, 4, 11, -0.2F, false));

		gun440 = new ModelRenderer(this);
		gun440.setRotationPoint(-3.2F, -38.8F, -41.5F);
		handguard.addChild(gun440);
		setRotationAngle(gun440, 0.0F, 0.0F, 0.2231F);
		gun440.cubeList.add(new ModelBox(gun440, 76, 80, 8.0608F, -0.605F, 2.98F, 2, 2, 13, -0.2F, false));

		gun441 = new ModelRenderer(this);
		gun441.setRotationPoint(0.2F, -38.9F, -41.5F);
		handguard.addChild(gun441);
		setRotationAngle(gun441, 0.0F, 0.0F, 1.3384F);
		gun441.cubeList.add(new ModelBox(gun441, 76, 64, 3.017F, -7.6114F, 2.98F, 2, 2, 13, -0.2F, false));

		gun442 = new ModelRenderer(this);
		gun442.setRotationPoint(-2.3F, -39.32F, -41.5F);
		handguard.addChild(gun442);
		setRotationAngle(gun442, 0.0F, 0.0F, 1.041F);
		

		gun194_r1 = new ModelRenderer(this);
		gun194_r1.setRotationPoint(4.8525F, -6.029F, 8.48F);
		gun442.addChild(gun194_r1);
		setRotationAngle(gun194_r1, 0.0F, 0.0F, -0.5236F);
		gun194_r1.cubeList.add(new ModelBox(gun194_r1, 86, 0, -0.1538F, 0.1084F, -5.5F, 2, 1, 13, -0.2F, false));

		gun193_r1 = new ModelRenderer(this);
		gun193_r1.setRotationPoint(4.6706F, -6.4967F, 8.48F);
		gun442.addChild(gun193_r1);
		setRotationAngle(gun193_r1, 0.0F, 0.0F, -0.2182F);
		gun193_r1.cubeList.add(new ModelBox(gun193_r1, 84, 20, 0.0132F, -0.0239F, -5.5F, 2, 1, 13, -0.2F, false));

		gun443 = new ModelRenderer(this);
		gun443.setRotationPoint(-2.0F, -39.5F, -41.5F);
		handguard.addChild(gun443);
		setRotationAngle(gun443, 0.0F, 0.0F, 1.041F);
		gun443.cubeList.add(new ModelBox(gun443, 31, 84, 4.7206F, -6.821F, 2.98F, 2, 1, 13, -0.2F, false));

		gun444 = new ModelRenderer(this);
		gun444.setRotationPoint(-0.7F, -39.35F, -41.5F);
		handguard.addChild(gun444);
		setRotationAngle(gun444, 0.0F, 0.0F, 0.4461F);
		

		gun192_r1 = new ModelRenderer(this);
		gun192_r1.setRotationPoint(8.0832F, -2.6511F, 8.48F);
		gun444.addChild(gun192_r1);
		setRotationAngle(gun192_r1, 0.0F, 0.0F, 0.5236F);
		gun192_r1.cubeList.add(new ModelBox(gun192_r1, 0, 99, 0.0773F, -0.1041F, -5.5F, 1, 2, 13, -0.2F, false));

		gun191_r1 = new ModelRenderer(this);
		gun191_r1.setRotationPoint(7.6156F, -2.833F, 8.48F);
		gun444.addChild(gun191_r1);
		setRotationAngle(gun191_r1, 0.0F, 0.0F, 0.2182F);
		gun191_r1.cubeList.add(new ModelBox(gun191_r1, 0, 115, -0.0685F, 0.0512F, -5.5F, 1, 2, 13, -0.2F, false));

		gun445 = new ModelRenderer(this);
		gun445.setRotationPoint(-1.0F, -39.5F, -41.5F);
		handguard.addChild(gun445);
		setRotationAngle(gun445, 0.0F, 0.0F, 0.4461F);
		gun445.cubeList.add(new ModelBox(gun445, 91, 109, 7.225F, -2.7534F, 2.98F, 1, 2, 13, -0.2F, false));

		gun446 = new ModelRenderer(this);
		gun446.setRotationPoint(-2.0F, -39.5F, -41.5F);
		handguard.addChild(gun446);
		gun446.cubeList.add(new ModelBox(gun446, 62, 96, 8.0F, 0.7F, 2.98F, 1, 3, 13, -0.2F, false));

		gun448 = new ModelRenderer(this);
		gun448.setRotationPoint(-1.5F, -37.0F, -41.5F);
		handguard.addChild(gun448);
		gun448.cubeList.add(new ModelBox(gun448, 210, 70, 8.5118F, 0.2147F, 2.99F, 1, 5, 3, -0.2F, false));

		gun449 = new ModelRenderer(this);
		gun449.setRotationPoint(-2.5F, -38.0F, -41.5F);
		handguard.addChild(gun449);
		gun449.cubeList.add(new ModelBox(gun449, 121, 201, 8.0F, 1.1F, 3.0F, 2, 5, 3, -0.2F, false));
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