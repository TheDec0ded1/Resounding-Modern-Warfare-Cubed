package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class GalilHandGuard extends ModelBase {
	private final ModelRenderer handguard;
	private final ModelRenderer gun224;
	private final ModelRenderer gun223;
	private final ModelRenderer gun222;
	private final ModelRenderer gun221;
	private final ModelRenderer gun220;
	private final ModelRenderer gun219;
	private final ModelRenderer gun218;
	private final ModelRenderer gun217;
	private final ModelRenderer gun156;
	private final ModelRenderer gun155;
	private final ModelRenderer gun154;
	private final ModelRenderer gun153;
	private final ModelRenderer gun151;
	private final ModelRenderer gun156_r1;
	private final ModelRenderer gun156_r2;
	private final ModelRenderer gun150;
	private final ModelRenderer gun149;
	private final ModelRenderer gun155_r1;
	private final ModelRenderer gun156_r3;

	public GalilHandGuard() {
		textureWidth = 200;
		textureHeight = 200;

		handguard = new ModelRenderer(this);
		handguard.setRotationPoint(0.0F, -3.0F, 3.6F);
		

		gun224 = new ModelRenderer(this);
		gun224.setRotationPoint(0.9F, -34.7F, -54.0F);
		handguard.addChild(gun224);
		setRotationAngle(gun224, 0.0F, 0.0F, 2.0448F);
		gun224.cubeList.add(new ModelBox(gun224, 58, 51, 24.2514F, -11.8793F, -2.0F, 1, 1, 1, 0.0F, false));

		gun223 = new ModelRenderer(this);
		gun223.setRotationPoint(-0.1F, -33.2F, -54.0F);
		handguard.addChild(gun223);
		setRotationAngle(gun223, 0.0F, 0.0F, -2.4363F);
		gun223.cubeList.add(new ModelBox(gun223, 58, 49, -17.1222F, -20.8825F, -1.999F, 1, 1, 1, 0.0F, false));

		gun222 = new ModelRenderer(this);
		gun222.setRotationPoint(-2.9F, -33.2F, -54.0F);
		handguard.addChild(gun222);
		setRotationAngle(gun222, 0.0F, 0.0F, -2.2679F);
		gun222.cubeList.add(new ModelBox(gun222, 10, 56, -21.022F, -16.9506F, -1.999F, 1, 1, 1, 0.0F, false));

		gun221 = new ModelRenderer(this);
		gun221.setRotationPoint(-3.9F, -34.7F, -54.0F);
		handguard.addChild(gun221);
		setRotationAngle(gun221, 0.0F, 0.0F, -0.4833F);
		gun221.cubeList.add(new ModelBox(gun221, 0, 56, -12.1043F, 24.1399F, -2.0F, 1, 1, 1, 0.0F, false));

		gun220 = new ModelRenderer(this);
		gun220.setRotationPoint(-1.1F, -35.2F, -54.0F);
		handguard.addChild(gun220);
		gun220.cubeList.add(new ModelBox(gun220, 27, 19, -0.5F, 26.999F, -2.002F, 1, 2, 1, 0.0F, false));

		gun219 = new ModelRenderer(this);
		gun219.setRotationPoint(-2.9F, -35.2F, -54.0F);
		handguard.addChild(gun219);
		gun219.cubeList.add(new ModelBox(gun219, 32, 34, 0.5F, 27.0F, -2.001F, 1, 2, 1, 0.0F, false));

		gun218 = new ModelRenderer(this);
		gun218.setRotationPoint(-1.1F, -38.7F, -54.0F);
		handguard.addChild(gun218);
		gun218.cubeList.add(new ModelBox(gun218, 12, 31, -0.5F, 29.0F, -2.003F, 2, 2, 1, 0.0F, false));
		gun218.cubeList.add(new ModelBox(gun218, 12, 31, 1.5F, 28.4F, 11.447F, 1, 1, 1, -0.1F, false));
		gun218.cubeList.add(new ModelBox(gun218, 12, 31, 1.5F, 29.5F, 11.447F, 1, 1, 1, -0.1F, false));
		gun218.cubeList.add(new ModelBox(gun218, 12, 31, -3.3F, 29.5F, 11.447F, 1, 1, 1, -0.1F, false));
		gun218.cubeList.add(new ModelBox(gun218, 12, 31, -3.3F, 28.4F, 11.447F, 1, 1, 1, -0.1F, false));
		gun218.cubeList.add(new ModelBox(gun218, 12, 31, 1.5F, 29.5F, -0.553F, 1, 1, 1, -0.1F, false));
		gun218.cubeList.add(new ModelBox(gun218, 12, 31, 1.5F, 28.4F, -0.553F, 1, 1, 1, -0.1F, false));
		gun218.cubeList.add(new ModelBox(gun218, 12, 31, -3.3F, 29.5F, -0.553F, 1, 1, 1, -0.1F, false));
		gun218.cubeList.add(new ModelBox(gun218, 12, 31, -3.3F, 28.4F, -0.553F, 1, 1, 1, -0.1F, false));

		gun217 = new ModelRenderer(this);
		gun217.setRotationPoint(-3.9F, -38.7F, -54.0F);
		handguard.addChild(gun217);
		gun217.cubeList.add(new ModelBox(gun217, 7, 63, 0.5F, 29.0F, -2.002F, 3, 2, 1, 0.0F, false));

		gun156 = new ModelRenderer(this);
		gun156.setRotationPoint(-3.0F, -31.0F, -36.5F);
		handguard.addChild(gun156);
		setRotationAngle(gun156, 0.0F, 0.0F, -2.4166F);
		

		gun155 = new ModelRenderer(this);
		gun155.setRotationPoint(-3.9F, -31.9F, -36.5F);
		handguard.addChild(gun155);
		setRotationAngle(gun155, 0.0F, 0.0F, -0.7064F);
		gun155.cubeList.add(new ModelBox(gun155, 0, 54, -18.045F, 21.1476F, -3.501F, 1, 1, 1, 0.0F, false));

		gun154 = new ModelRenderer(this);
		gun154.setRotationPoint(0.9F, -31.9F, -36.5F);
		handguard.addChild(gun154);
		setRotationAngle(gun154, 0.0F, 0.0F, 2.3794F);
		gun154.cubeList.add(new ModelBox(gun154, 35, 50, 19.1962F, -20.1084F, -3.501F, 1, 1, 1, 0.0F, false));

		gun153 = new ModelRenderer(this);
		gun153.setRotationPoint(0.0F, -31.0F, -36.5F);
		handguard.addChild(gun153);
		

		gun151 = new ModelRenderer(this);
		gun151.setRotationPoint(-3.9F, -36.9F, -36.5F);
		handguard.addChild(gun151);
		gun151.cubeList.add(new ModelBox(gun151, 73, 17, 0.0F, 25.8F, -3.5F, 1, 7, 1, 0.0F, false));
		gun151.cubeList.add(new ModelBox(gun151, 73, 17, -0.2F, 26.0F, -3.7F, 1, 1, 1, 0.2F, false));

		gun156_r1 = new ModelRenderer(this);
		gun156_r1.setRotationPoint(-0.9F, 30.5364F, -5.6243F);
		gun151.addChild(gun156_r1);
		setRotationAngle(gun156_r1, -0.7854F, 0.0F, 0.0873F);
		gun156_r1.cubeList.add(new ModelBox(gun156_r1, 73, 17, -0.5F, 2.9027F, -0.35F, 1, 1, 1, -0.2F, false));
		gun156_r1.cubeList.add(new ModelBox(gun156_r1, 73, 17, -0.5F, 0.3571F, -2.8956F, 1, 1, 1, -0.2F, false));
		gun156_r1.cubeList.add(new ModelBox(gun156_r1, 73, 17, -0.5F, -3.0713F, 0.1814F, 1, 1, 1, -0.2F, false));

		gun156_r2 = new ModelRenderer(this);
		gun156_r2.setRotationPoint(-0.9F, 30.5364F, -5.6243F);
		gun151.addChild(gun156_r2);
		setRotationAngle(gun156_r2, 0.0F, 0.0F, 0.0873F);
		gun156_r2.cubeList.add(new ModelBox(gun156_r2, 123, 186, -0.5F, 2.1364F, -1.6F, 1, 1, 8, 0.2F, false));
		gun156_r2.cubeList.add(new ModelBox(gun156_r2, 59, 134, -0.5F, 2.1364F, -2.5F, 1, 1, 4, -0.2F, false));
		gun156_r2.cubeList.add(new ModelBox(gun156_r2, 58, 133, -0.5F, -1.7121F, -2.5F, 1, 1, 5, -0.2F, false));
		gun156_r2.cubeList.add(new ModelBox(gun156_r2, 73, 17, -0.5F, -1.2879F, -2.9243F, 1, 4, 1, -0.2F, false));
		gun156_r2.cubeList.add(new ModelBox(gun156_r2, 73, 17, -0.5F, -4.9614F, 1.9243F, 1, 2, 1, -0.2F, false));
		gun156_r2.cubeList.add(new ModelBox(gun156_r2, 73, 17, -0.5F, -4.1364F, 1.9243F, 1, 3, 1, -0.2F, false));

		gun150 = new ModelRenderer(this);
		gun150.setRotationPoint(-0.1F, -36.9F, -36.5F);
		handguard.addChild(gun150);
		gun150.cubeList.add(new ModelBox(gun150, 41, 4, 0.0F, 25.8F, -3.5F, 1, 7, 1, 0.0F, false));

		gun149 = new ModelRenderer(this);
		gun149.setRotationPoint(-4.0F, -36.5F, -53.5F);
		handguard.addChild(gun149);
		gun149.cubeList.add(new ModelBox(gun149, 95, 88, -0.249F, 25.6F, -1.65F, 1, 1, 14, 0.0F, false));
		gun149.cubeList.add(new ModelBox(gun149, 19, 96, 4.251F, 25.6F, -1.65F, 1, 1, 14, 0.0F, false));
		gun149.cubeList.add(new ModelBox(gun149, 14, 96, 4.251F, 31.4F, -1.65F, 1, 1, 14, 0.0F, false));
		gun149.cubeList.add(new ModelBox(gun149, 19, 96, -0.249F, 31.4F, -1.65F, 1, 1, 14, 0.0F, false));
		gun149.cubeList.add(new ModelBox(gun149, 114, 133, 4.551F, 27.1F, -1.35F, 1, 1, 14, -0.3F, false));
		gun149.cubeList.add(new ModelBox(gun149, 95, 89, -0.549F, 27.1F, -1.35F, 1, 1, 14, -0.3F, false));
		gun149.cubeList.add(new ModelBox(gun149, 100, 88, 0.001F, 26.6F, -1.65F, 1, 4, 14, 0.0F, false));
		gun149.cubeList.add(new ModelBox(gun149, 95, 88, 4.001F, 26.6F, -1.65F, 1, 4, 14, 0.0F, false));
		gun149.cubeList.add(new ModelBox(gun149, 95, 88, 2.001F, 30.4F, -1.65F, 3, 1, 14, 0.0F, false));
		gun149.cubeList.add(new ModelBox(gun149, 96, 88, 0.001F, 30.4F, -1.65F, 3, 1, 14, 0.0F, false));
		gun149.cubeList.add(new ModelBox(gun149, 108, 100, 1.001F, 30.4F, 12.35F, 3, 1, 2, 0.0F, false));
		gun149.cubeList.add(new ModelBox(gun149, 114, 133, 4.551F, 28.3F, -1.35F, 1, 1, 14, -0.3F, false));
		gun149.cubeList.add(new ModelBox(gun149, 95, 89, -0.549F, 28.3F, -1.35F, 1, 1, 14, -0.3F, false));
		gun149.cubeList.add(new ModelBox(gun149, 95, 89, -0.549F, 29.5F, -1.35F, 1, 1, 14, -0.3F, false));
		gun149.cubeList.add(new ModelBox(gun149, 114, 133, 4.551F, 29.5F, -1.35F, 1, 1, 14, -0.3F, false));
		gun149.cubeList.add(new ModelBox(gun149, 110, 81, -0.249F, 26.4F, 10.35F, 1, 5, 2, 0.0F, false));
		gun149.cubeList.add(new ModelBox(gun149, 95, 89, -0.549F, 30.7F, -1.35F, 1, 1, 14, -0.3F, false));
		gun149.cubeList.add(new ModelBox(gun149, 110, 81, -0.249F, 26.4F, -1.65F, 1, 5, 2, 0.0F, false));
		gun149.cubeList.add(new ModelBox(gun149, 110, 81, 4.251F, 26.4F, -1.65F, 1, 5, 2, 0.0F, false));
		gun149.cubeList.add(new ModelBox(gun149, 114, 133, 4.551F, 30.7F, -1.35F, 1, 1, 14, -0.3F, false));
		gun149.cubeList.add(new ModelBox(gun149, 110, 81, 4.251F, 26.4F, 10.35F, 1, 5, 2, 0.0F, false));

		gun155_r1 = new ModelRenderer(this);
		gun155_r1.setRotationPoint(0.4928F, 28.1F, 13.1865F);
		gun149.addChild(gun155_r1);
		setRotationAngle(gun155_r1, 0.0F, 0.2618F, 0.0F);
		gun155_r1.cubeList.add(new ModelBox(gun155_r1, 110, 81, -0.5F, -2.5F, -1.0F, 1, 1, 2, 0.0F, false));
		gun155_r1.cubeList.add(new ModelBox(gun155_r1, 110, 81, -0.5F, -1.7F, -1.0F, 1, 6, 2, 0.0F, false));

		gun156_r3 = new ModelRenderer(this);
		gun156_r3.setRotationPoint(4.5092F, 28.1F, 13.1865F);
		gun149.addChild(gun156_r3);
		setRotationAngle(gun156_r3, 0.0F, -0.2618F, 0.0F);
		gun156_r3.cubeList.add(new ModelBox(gun156_r3, 110, 81, -0.5F, -2.5F, -1.0F, 1, 1, 2, 0.0F, false));
		gun156_r3.cubeList.add(new ModelBox(gun156_r3, 110, 81, -0.5F, -1.7F, -1.0F, 1, 6, 2, 0.0F, false));
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