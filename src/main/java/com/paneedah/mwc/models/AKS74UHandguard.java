package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AKS74UHandguard extends ModelBase {
	private final ModelRenderer handguard;
	private final ModelRenderer handguard_r1;
	private final ModelRenderer handguard_r2;
	private final ModelRenderer gun159_r1;
	private final ModelRenderer gun183_r1;
	private final ModelRenderer gun184_r1;
	private final ModelRenderer gun185_r1;
	private final ModelRenderer gun186_r1;
	private final ModelRenderer gun187_r1;
	private final ModelRenderer gun189_r1;
	private final ModelRenderer gun289_r2_r1;
	private final ModelRenderer gun289_r2_r2;
	private final ModelRenderer gun221_r1;
	private final ModelRenderer gun222_r1;
	private final ModelRenderer gun223_r1;
	private final ModelRenderer gun224_r1;
	private final ModelRenderer gun225_r1;
	private final ModelRenderer gun226_r1;
	private final ModelRenderer gun227_r1;
	private final ModelRenderer gun228_r1;

	public AKS74UHandguard() {
		textureWidth = 304;
		textureHeight = 304;

		handguard = new ModelRenderer(this);
		handguard.setRotationPoint(0.0F, 24.0F, 0.0F);
		handguard.cubeList.add(new ModelBox(handguard, 192, 140, -4.0F, -36.9F, -37.5F, 5, 5, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 256, 212, -4.001F, -36.9F, -51.5F, 5, 3, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 150, 192, -4.002F, -34.5F, -51.5F, 5, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 230, 208, -3.998F, -34.5F, -45.5F, 5, 1, 8, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 70, 223, -0.199F, -36.5F, -50.5F, 1, 2, 14, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 138, 177, -3.801F, -36.5F, -50.5F, 1, 2, 13, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 216, 217, -3.999F, -38.9F, -51.501F, 5, 1, 13, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 110, 78, -4.0F, -38.3F, -51.5F, 5, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 82, 279, -0.2F, -38.3F, -50.5F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 276, 172, -0.2F, -38.3F, -46.5F, 1, 1, 3, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 286, 34, -0.2F, -38.3F, -40.5F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 116, 38, -4.0F, -38.3F, -39.5F, 5, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 258, 190, -0.2F, -38.5F, -50.5F, 1, 1, 10, -0.002F, false));
		handguard.cubeList.add(new ModelBox(handguard, 286, 72, -3.8F, -38.3F, -40.5F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 258, 201, -3.8F, -38.5F, -50.5F, 1, 1, 10, -0.002F, false));
		handguard.cubeList.add(new ModelBox(handguard, 276, 176, -3.8F, -38.3F, -46.5F, 1, 1, 3, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 286, 74, -3.8F, -38.3F, -50.5F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 130, 278, -0.2F, -36.9F, -40.5F, 1, 1, 3, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 236, 259, -0.2F, -36.7F, -50.5F, 1, 1, 10, -0.002F, false));
		handguard.cubeList.add(new ModelBox(handguard, 278, 180, -0.2F, -36.9F, -46.5F, 1, 1, 3, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 286, 76, -0.2F, -36.9F, -50.5F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 278, 184, -3.8F, -36.9F, -40.5F, 1, 1, 3, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 258, 259, -3.8F, -36.7F, -50.5F, 1, 1, 10, -0.002F, false));
		handguard.cubeList.add(new ModelBox(handguard, 74, 279, -3.8F, -36.9F, -46.5F, 1, 1, 3, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 286, 78, -3.8F, -36.9F, -50.5F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 96, 75, -3.999F, -32.7F, -37.5F, 5, 2, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 274, 236, -3.998F, -33.5F, -38.5F, 5, 2, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 278, 188, -3.499F, -31.7F, -35.5F, 4, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 56, 251, -2.9F, -39.7F, -52.002F, 2, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 286, 80, -1.1F, -39.7F, -52.001F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 118, 274, -3.9F, -38.7F, -52.001F, 3, 5, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 206, 140, -1.1F, -38.7F, -52.002F, 2, 5, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 242, 283, -2.9F, -34.2F, -52.003F, 2, 2, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 284, 223, -1.1F, -34.2F, -52.0F, 1, 2, 1, 0.0F, false));

		handguard_r1 = new ModelRenderer(this);
		handguard_r1.setRotationPoint(-1.5F, -42.9F, -41.5F);
		handguard.addChild(handguard_r1);
		setRotationAngle(handguard_r1, 0.7854F, 0.0F, 0.0F);
		handguard_r1.cubeList.add(new ModelBox(handguard_r1, 110, 75, -2.502F, 7.9142F, -3.9858F, 5, 1, 2, 0.0F, false));

		handguard_r2 = new ModelRenderer(this);
		handguard_r2.setRotationPoint(-1.5F, -42.9F, -47.0F);
		handguard.addChild(handguard_r2);
		setRotationAngle(handguard_r2, -0.7854F, 0.0F, 0.0F);
		handguard_r2.cubeList.add(new ModelBox(handguard_r2, 116, 35, -2.502F, 7.6071F, 2.2929F, 5, 1, 2, 0.0F, false));

		gun159_r1 = new ModelRenderer(this);
		gun159_r1.setRotationPoint(-3.0F, -33.0F, -53.5F);
		handguard.addChild(gun159_r1);
		setRotationAngle(gun159_r1, 1.4871F, 0.0F, 0.0F);
		gun159_r1.cubeList.add(new ModelBox(gun159_r1, 130, 264, 0.0F, 2.0848F, -0.424F, 3, 13, 1, 0.0F, false));
		gun159_r1.cubeList.add(new ModelBox(gun159_r1, 30, 265, -1.0F, 1.9764F, 0.1756F, 5, 13, 2, 0.0F, false));

		gun183_r1 = new ModelRenderer(this);
		gun183_r1.setRotationPoint(-3.0F, -39.8F, -53.5F);
		handguard.addChild(gun183_r1);
		setRotationAngle(gun183_r1, 0.0175F, 0.0F, 0.0F);
		gun183_r1.cubeList.add(new ModelBox(gun183_r1, 100, 223, 0.0F, 0.0525F, 1.9995F, 3, 1, 13, 0.0F, false));

		gun184_r1 = new ModelRenderer(this);
		gun184_r1.setRotationPoint(-4.0F, -38.9F, -53.5F);
		handguard.addChild(gun184_r1);
		setRotationAngle(gun184_r1, 0.0F, 0.0F, -0.7064F);
		gun184_r1.cubeList.add(new ModelBox(gun184_r1, 156, 237, 0.0F, 0.0F, 2.0F, 1, 1, 13, 0.0F, false));

		gun185_r1 = new ModelRenderer(this);
		gun185_r1.setRotationPoint(-3.0F, -39.8F, -53.5F);
		handguard.addChild(gun185_r1);
		setRotationAngle(gun185_r1, 0.0F, 0.0F, 0.8179F);
		gun185_r1.cubeList.add(new ModelBox(gun185_r1, 184, 237, -0.001F, 0.0F, 1.999F, 1, 1, 13, 0.0F, false));

		gun186_r1 = new ModelRenderer(this);
		gun186_r1.setRotationPoint(0.0F, -39.8F, -53.5F);
		handguard.addChild(gun186_r1);
		setRotationAngle(gun186_r1, 0.0F, 0.0F, 0.7436F);
		gun186_r1.cubeList.add(new ModelBox(gun186_r1, 238, 107, 0.0F, -0.001F, 1.999F, 1, 1, 13, 0.0F, false));

		gun187_r1 = new ModelRenderer(this);
		gun187_r1.setRotationPoint(1.0F, -38.9F, -53.5F);
		handguard.addChild(gun187_r1);
		setRotationAngle(gun187_r1, 0.0F, 0.0F, 2.3051F);
		gun187_r1.cubeList.add(new ModelBox(gun187_r1, 62, 239, 0.0F, 0.0F, 2.0F, 1, 1, 13, 0.0F, false));

		gun189_r1 = new ModelRenderer(this);
		gun189_r1.setRotationPoint(-4.0F, -30.5F, -38.5F);
		handguard.addChild(gun189_r1);
		setRotationAngle(gun189_r1, 2.6025F, 0.0F, 0.0F);
		

		gun289_r2_r1 = new ModelRenderer(this);
		gun289_r2_r1.setRotationPoint(2.501F, 0.8209F, 1.6714F);
		gun189_r1.addChild(gun289_r2_r1);
		setRotationAngle(gun289_r2_r1, 0.1309F, 0.0F, 0.0F);
		gun289_r2_r1.cubeList.add(new ModelBox(gun289_r2_r1, 128, 38, -2.502F, -0.4516F, -2.3884F, 5, 1, 1, 0.0F, false));

		gun289_r2_r2 = new ModelRenderer(this);
		gun289_r2_r2.setRotationPoint(2.501F, 2.2167F, 1.5198F);
		gun189_r1.addChild(gun289_r2_r2);
		setRotationAngle(gun289_r2_r2, -0.3054F, 0.0F, 0.0F);
		gun289_r2_r2.cubeList.add(new ModelBox(gun289_r2_r2, 138, 192, -2.502F, -1.1992F, 0.5757F, 5, 1, 1, 0.0F, false));
		gun289_r2_r2.cubeList.add(new ModelBox(gun289_r2_r2, 80, 75, -2.502F, -1.1992F, -1.7243F, 5, 1, 3, 0.0F, false));

		gun221_r1 = new ModelRenderer(this);
		gun221_r1.setRotationPoint(-3.9F, -34.7F, -54.0F);
		handguard.addChild(gun221_r1);
		setRotationAngle(gun221_r1, 0.0F, 0.0F, -0.4833F);
		gun221_r1.cubeList.add(new ModelBox(gun221_r1, 286, 82, -0.4647F, 0.8855F, 2.001F, 1, 1, 1, 0.0F, false));

		gun222_r1 = new ModelRenderer(this);
		gun222_r1.setRotationPoint(-2.9F, -33.2F, -54.0F);
		handguard.addChild(gun222_r1);
		setRotationAngle(gun222_r1, 0.0F, 0.0F, -2.2679F);
		gun222_r1.cubeList.add(new ModelBox(gun222_r1, 286, 84, -0.7667F, -0.642F, 2.0F, 1, 1, 1, 0.0F, false));

		gun223_r1 = new ModelRenderer(this);
		gun223_r1.setRotationPoint(-0.1F, -33.2F, -54.0F);
		handguard.addChild(gun223_r1);
		setRotationAngle(gun223_r1, 0.0F, 0.0F, -2.4363F);
		gun223_r1.cubeList.add(new ModelBox(gun223_r1, 286, 86, -0.6483F, -0.7614F, 1.999F, 1, 1, 1, 0.0F, false));

		gun224_r1 = new ModelRenderer(this);
		gun224_r1.setRotationPoint(0.9F, -34.7F, -54.0F);
		handguard.addChild(gun224_r1);
		setRotationAngle(gun224_r1, 0.0F, 0.0F, 2.0448F);
		gun224_r1.cubeList.add(new ModelBox(gun224_r1, 286, 88, 0.8897F, -0.4565F, 2.001F, 1, 1, 1, 0.0F, false));

		gun225_r1 = new ModelRenderer(this);
		gun225_r1.setRotationPoint(-0.1F, -39.7F, -54.0F);
		handguard.addChild(gun225_r1);
		setRotationAngle(gun225_r1, 0.0F, 0.0F, 0.7808F);
		gun225_r1.cubeList.add(new ModelBox(gun225_r1, 286, 90, 0.0F, 0.0F, 2.001F, 1, 1, 1, 0.0F, false));

		gun226_r1 = new ModelRenderer(this);
		gun226_r1.setRotationPoint(0.9F, -38.7F, -54.0F);
		handguard.addChild(gun226_r1);
		setRotationAngle(gun226_r1, 0.0F, 0.0F, 2.3794F);
		gun226_r1.cubeList.add(new ModelBox(gun226_r1, 286, 92, 0.0F, 0.0F, 2.0F, 1, 1, 1, 0.0F, false));

		gun227_r1 = new ModelRenderer(this);
		gun227_r1.setRotationPoint(-2.9F, -39.7F, -54.0F);
		handguard.addChild(gun227_r1);
		setRotationAngle(gun227_r1, 0.0F, 0.0F, 0.8179F);
		gun227_r1.cubeList.add(new ModelBox(gun227_r1, 94, 286, 0.0F, 0.0F, 2.001F, 1, 1, 1, 0.0F, false));

		gun228_r1 = new ModelRenderer(this);
		gun228_r1.setRotationPoint(-3.9F, -38.7F, -54.0F);
		handguard.addChild(gun228_r1);
		setRotationAngle(gun228_r1, 0.0F, 0.0F, -0.7808F);
		gun228_r1.cubeList.add(new ModelBox(gun228_r1, 286, 94, 0.0F, 0.0F, 2.0F, 1, 1, 1, 0.0F, false));
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