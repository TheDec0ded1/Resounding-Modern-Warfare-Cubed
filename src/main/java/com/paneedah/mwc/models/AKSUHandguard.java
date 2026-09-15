package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AKSUHandguard extends ModelBase {
	private final ModelRenderer handguardAlt;
	private final ModelRenderer handguard_r3;
	private final ModelRenderer handguard_r4;
	private final ModelRenderer gun183_r2;
	private final ModelRenderer gun184_r2;
	private final ModelRenderer gun185_r2;
	private final ModelRenderer gun186_r2;
	private final ModelRenderer gun187_r2;
	private final ModelRenderer gun189_r2;
	private final ModelRenderer gun389_r3_r1;
	private final ModelRenderer gun389_r3_r2;
	private final ModelRenderer gun221_r2;
	private final ModelRenderer gun222_r2;
	private final ModelRenderer gun223_r2;
	private final ModelRenderer gun224_r2;
	private final ModelRenderer gun225_r2;
	private final ModelRenderer gun226_r2;
	private final ModelRenderer gun227_r2;
	private final ModelRenderer gun228_r2;
	private final ModelRenderer gun159_r2;

	public AKSUHandguard() {
		textureWidth = 304;
		textureHeight = 304;

		handguardAlt = new ModelRenderer(this);
		handguardAlt.setRotationPoint(0.0F, 24.0F, 0.0F);
		handguardAlt.cubeList.add(new ModelBox(handguardAlt, 274, 59, -4.0F, -36.9F, -37.5F, 5, 5, 2, 0.0F, false));
		handguardAlt.cubeList.add(new ModelBox(handguardAlt, 268, 212, -4.001F, -36.9F, -51.5F, 5, 3, 1, 0.0F, false));
		handguardAlt.cubeList.add(new ModelBox(handguardAlt, 252, 229, -4.002F, -34.5F, -51.5F, 5, 1, 1, 0.0F, false));
		handguardAlt.cubeList.add(new ModelBox(handguardAlt, 252, 181, -3.998F, -34.5F, -45.5F, 5, 1, 8, 0.0F, false));
		handguardAlt.cubeList.add(new ModelBox(handguardAlt, 0, 236, -0.199F, -36.5F, -50.5F, 1, 2, 14, 0.0F, false));
		handguardAlt.cubeList.add(new ModelBox(handguardAlt, 100, 237, -3.801F, -36.5F, -50.5F, 1, 2, 13, 0.0F, false));
		handguardAlt.cubeList.add(new ModelBox(handguardAlt, 0, 222, -3.999F, -38.9F, -51.501F, 5, 1, 13, 0.0F, false));
		handguardAlt.cubeList.add(new ModelBox(handguardAlt, 274, 256, -4.0F, -38.3F, -51.5F, 5, 1, 1, 0.0F, false));
		handguardAlt.cubeList.add(new ModelBox(handguardAlt, 252, 157, -0.2F, -38.3F, -50.5F, 1, 1, 11, 0.0F, false));
		handguardAlt.cubeList.add(new ModelBox(handguardAlt, 276, 12, -4.0F, -38.3F, -39.5F, 5, 1, 1, 0.0F, false));
		handguardAlt.cubeList.add(new ModelBox(handguardAlt, 252, 169, -3.8F, -38.3F, -50.5F, 1, 1, 11, 0.0F, false));
		handguardAlt.cubeList.add(new ModelBox(handguardAlt, 244, 34, -0.2F, -36.9F, -50.5F, 1, 1, 13, 0.0F, false));
		handguardAlt.cubeList.add(new ModelBox(handguardAlt, 244, 48, -3.8F, -36.9F, -50.5F, 1, 1, 13, 0.0F, false));
		handguardAlt.cubeList.add(new ModelBox(handguardAlt, 102, 35, -3.999F, -32.7F, -37.5F, 5, 2, 2, 0.0F, false));
		handguardAlt.cubeList.add(new ModelBox(handguardAlt, 274, 249, -3.998F, -33.5F, -38.5F, 5, 2, 1, 0.0F, false));
		handguardAlt.cubeList.add(new ModelBox(handguardAlt, 280, 26, -3.499F, -31.7F, -35.5F, 4, 1, 1, 0.0F, false));
		handguardAlt.cubeList.add(new ModelBox(handguardAlt, 284, 178, -2.9F, -39.7F, -52.002F, 2, 1, 1, 0.0F, false));
		handguardAlt.cubeList.add(new ModelBox(handguardAlt, 68, 288, -1.1F, -39.7F, -52.001F, 1, 1, 1, 0.0F, false));
		handguardAlt.cubeList.add(new ModelBox(handguardAlt, 276, 121, -3.9F, -38.7F, -52.001F, 3, 5, 1, 0.0F, false));
		handguardAlt.cubeList.add(new ModelBox(handguardAlt, 238, 20, -1.1F, -38.7F, -52.002F, 2, 5, 1, 0.0F, false));
		handguardAlt.cubeList.add(new ModelBox(handguardAlt, 284, 136, -2.9F, -34.2F, -52.003F, 2, 2, 1, 0.0F, false));
		handguardAlt.cubeList.add(new ModelBox(handguardAlt, 286, 28, -1.1F, -34.2F, -52.0F, 1, 2, 1, 0.0F, false));

		handguard_r3 = new ModelRenderer(this);
		handguard_r3.setRotationPoint(-1.5F, -42.9F, -41.5F);
		handguardAlt.addChild(handguard_r3);
		setRotationAngle(handguard_r3, 0.7854F, 0.0F, 0.0F);
		handguard_r3.cubeList.add(new ModelBox(handguard_r3, 130, 35, -2.502F, 7.9142F, -3.9858F, 5, 1, 2, 0.0F, false));

		handguard_r4 = new ModelRenderer(this);
		handguard_r4.setRotationPoint(-1.5F, -42.9F, -47.0F);
		handguardAlt.addChild(handguard_r4);
		setRotationAngle(handguard_r4, -0.7854F, 0.0F, 0.0F);
		handguard_r4.cubeList.add(new ModelBox(handguard_r4, 212, 190, -2.502F, 7.6071F, 2.2929F, 5, 1, 2, 0.0F, false));

		gun183_r2 = new ModelRenderer(this);
		gun183_r2.setRotationPoint(-3.0F, -39.8F, -53.5F);
		handguardAlt.addChild(gun183_r2);
		setRotationAngle(gun183_r2, 0.0175F, 0.0F, 0.0F);
		gun183_r2.cubeList.add(new ModelBox(gun183_r2, 30, 237, 0.0F, 0.0525F, 1.9995F, 3, 1, 13, 0.0F, false));

		gun184_r2 = new ModelRenderer(this);
		gun184_r2.setRotationPoint(-4.0F, -38.9F, -53.5F);
		handguardAlt.addChild(gun184_r2);
		setRotationAngle(gun184_r2, 0.0F, 0.0F, -0.7064F);
		gun184_r2.cubeList.add(new ModelBox(gun184_r2, 246, 62, 0.0F, 0.0F, 2.0F, 1, 1, 13, 0.0F, false));

		gun185_r2 = new ModelRenderer(this);
		gun185_r2.setRotationPoint(-3.0F, -39.8F, -53.5F);
		handguardAlt.addChild(gun185_r2);
		setRotationAngle(gun185_r2, 0.0F, 0.0F, 0.8179F);
		gun185_r2.cubeList.add(new ModelBox(gun185_r2, 246, 76, -0.001F, 0.0F, 1.999F, 1, 1, 13, 0.0F, false));

		gun186_r2 = new ModelRenderer(this);
		gun186_r2.setRotationPoint(0.0F, -39.8F, -53.5F);
		handguardAlt.addChild(gun186_r2);
		setRotationAngle(gun186_r2, 0.0F, 0.0F, 0.7436F);
		gun186_r2.cubeList.add(new ModelBox(gun186_r2, 246, 90, 0.0F, -0.001F, 1.999F, 1, 1, 13, 0.0F, false));

		gun187_r2 = new ModelRenderer(this);
		gun187_r2.setRotationPoint(1.0F, -38.9F, -53.5F);
		handguardAlt.addChild(gun187_r2);
		setRotationAngle(gun187_r2, 0.0F, 0.0F, 2.3051F);
		gun187_r2.cubeList.add(new ModelBox(gun187_r2, 246, 231, 0.0F, 0.0F, 2.0F, 1, 1, 13, 0.0F, false));

		gun189_r2 = new ModelRenderer(this);
		gun189_r2.setRotationPoint(-4.0F, -30.5F, -38.5F);
		handguardAlt.addChild(gun189_r2);
		setRotationAngle(gun189_r2, 2.6025F, 0.0F, 0.0F);
		

		gun389_r3_r1 = new ModelRenderer(this);
		gun389_r3_r1.setRotationPoint(2.501F, 0.8209F, 1.6714F);
		gun189_r2.addChild(gun389_r3_r1);
		setRotationAngle(gun389_r3_r1, 0.1309F, 0.0F, 0.0F);
		gun389_r3_r1.cubeList.add(new ModelBox(gun389_r3_r1, 276, 129, -2.502F, -0.4516F, -2.3884F, 5, 1, 1, 0.0F, false));

		gun389_r3_r2 = new ModelRenderer(this);
		gun389_r3_r2.setRotationPoint(2.501F, 2.2167F, 1.5198F);
		gun189_r2.addChild(gun389_r3_r2);
		setRotationAngle(gun389_r3_r2, -0.3054F, 0.0F, 0.0F);
		gun389_r3_r2.cubeList.add(new ModelBox(gun389_r3_r2, 276, 127, -2.502F, -1.1992F, 0.5757F, 5, 1, 1, 0.0F, false));
		gun389_r3_r2.cubeList.add(new ModelBox(gun389_r3_r2, 86, 35, -2.502F, -1.1992F, -1.7243F, 5, 1, 3, 0.0F, false));

		gun221_r2 = new ModelRenderer(this);
		gun221_r2.setRotationPoint(-3.9F, -34.7F, -54.0F);
		handguardAlt.addChild(gun221_r2);
		setRotationAngle(gun221_r2, 0.0F, 0.0F, -0.4833F);
		gun221_r2.cubeList.add(new ModelBox(gun221_r2, 72, 288, -0.4647F, 0.8855F, 2.001F, 1, 1, 1, 0.0F, false));

		gun222_r2 = new ModelRenderer(this);
		gun222_r2.setRotationPoint(-2.9F, -33.2F, -54.0F);
		handguardAlt.addChild(gun222_r2);
		setRotationAngle(gun222_r2, 0.0F, 0.0F, -2.2679F);
		gun222_r2.cubeList.add(new ModelBox(gun222_r2, 76, 288, -0.7667F, -0.642F, 2.0F, 1, 1, 1, 0.0F, false));

		gun223_r2 = new ModelRenderer(this);
		gun223_r2.setRotationPoint(-0.1F, -33.2F, -54.0F);
		handguardAlt.addChild(gun223_r2);
		setRotationAngle(gun223_r2, 0.0F, 0.0F, -2.4363F);
		gun223_r2.cubeList.add(new ModelBox(gun223_r2, 80, 288, -0.6483F, -0.7614F, 1.999F, 1, 1, 1, 0.0F, false));

		gun224_r2 = new ModelRenderer(this);
		gun224_r2.setRotationPoint(0.9F, -34.7F, -54.0F);
		handguardAlt.addChild(gun224_r2);
		setRotationAngle(gun224_r2, 0.0F, 0.0F, 2.0448F);
		gun224_r2.cubeList.add(new ModelBox(gun224_r2, 84, 288, 0.8897F, -0.4565F, 2.001F, 1, 1, 1, 0.0F, false));

		gun225_r2 = new ModelRenderer(this);
		gun225_r2.setRotationPoint(-0.1F, -39.7F, -54.0F);
		handguardAlt.addChild(gun225_r2);
		setRotationAngle(gun225_r2, 0.0F, 0.0F, 0.7808F);
		gun225_r2.cubeList.add(new ModelBox(gun225_r2, 88, 288, 0.0F, 0.0F, 2.001F, 1, 1, 1, 0.0F, false));

		gun226_r2 = new ModelRenderer(this);
		gun226_r2.setRotationPoint(0.9F, -38.7F, -54.0F);
		handguardAlt.addChild(gun226_r2);
		setRotationAngle(gun226_r2, 0.0F, 0.0F, 2.3794F);
		gun226_r2.cubeList.add(new ModelBox(gun226_r2, 92, 288, 0.0F, 0.0F, 2.0F, 1, 1, 1, 0.0F, false));

		gun227_r2 = new ModelRenderer(this);
		gun227_r2.setRotationPoint(-2.9F, -39.7F, -54.0F);
		handguardAlt.addChild(gun227_r2);
		setRotationAngle(gun227_r2, 0.0F, 0.0F, 0.8179F);
		gun227_r2.cubeList.add(new ModelBox(gun227_r2, 102, 288, 0.0F, 0.0F, 2.001F, 1, 1, 1, 0.0F, false));

		gun228_r2 = new ModelRenderer(this);
		gun228_r2.setRotationPoint(-3.9F, -38.7F, -54.0F);
		handguardAlt.addChild(gun228_r2);
		setRotationAngle(gun228_r2, 0.0F, 0.0F, -0.7808F);
		gun228_r2.cubeList.add(new ModelBox(gun228_r2, 106, 288, 0.0F, 0.0F, 2.0F, 1, 1, 1, 0.0F, false));

		gun159_r2 = new ModelRenderer(this);
		gun159_r2.setRotationPoint(-3.0F, -33.0F, -53.5F);
		handguardAlt.addChild(gun159_r2);
		setRotationAngle(gun159_r2, 1.4871F, 0.0F, 0.0F);
		gun159_r2.cubeList.add(new ModelBox(gun159_r2, 272, 36, 0.0F, 2.0848F, -0.424F, 3, 13, 1, 0.0F, false));
		gun159_r2.cubeList.add(new ModelBox(gun159_r2, 44, 265, -1.0F, 1.9764F, 0.1756F, 5, 13, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handguardAlt.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}